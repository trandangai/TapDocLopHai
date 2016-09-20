package com.khtn.tapdoclophai.fragment;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.khtn.tapdoclophai.R;
import com.khtn.tapdoclophai.dao.CauHoiDAO;
import com.khtn.tapdoclophai.pojo.CauHoi;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by Sayuri Kurata on 2016/09/17.
 */
public class CauHoiDetailFragment extends Fragment {

    private  ArrayList<CauHoi> listCH;

    private TextView tvTitle;
    private TextView tvCauHoi;
    private ImageView imgCauHoi;
    private TextView tvTraLoi;

    private Button btnTraLoi;
    private Button btnTiepTheo;

    private int cauHoi;

    public static CauHoiDetailFragment newInstance() {
        return new CauHoiDetailFragment();
    }

    public CauHoiDetailFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cauhoi_hinh, container, false);

        tvTitle = (TextView) view.findViewById(R.id.tvTitle);
        tvCauHoi = (TextView) view.findViewById(R.id.tvCauHoi);
        imgCauHoi = (ImageView) view.findViewById(R.id.imgCauHoi);
        tvTraLoi = (TextView) view.findViewById(R.id.tvTraLoi);

        tvTraLoi.setVisibility(View.INVISIBLE);
        imgCauHoi.setVisibility(View.GONE);

        btnTraLoi = (Button) view.findViewById(R.id.btnTraLoi);
        btnTiepTheo = (Button) view.findViewById(R.id.btnTiepTheo);

        Bundle bundle = this.getArguments();
        long idBaiHoc = bundle.getLong("IDBaiHoc", 1);

        CauHoiDAO chDAO = new CauHoiDAO(getActivity().getApplicationContext());
        listCH = chDAO.getListCauHoi(idBaiHoc);
        cauHoi = 0;

        setCauHoi(cauHoi);

        addOnCLickEvent();

        return view;
    }

    private void addOnCLickEvent() {
        btnTraLoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvTraLoi.setVisibility(View.VISIBLE);
            }
        });

        btnTiepTheo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cauHoi++;
                if(cauHoi < listCH.size()) {

                    setCauHoi(cauHoi);
                }
                else {
                    cauHoi = listCH.size() - 1;
                }
            }
        });
    }

    private void setCauHoi(int cauHoi) {

        tvTraLoi.setVisibility(View.INVISIBLE);
        tvTitle.setText(listCH.get(cauHoi).getPhanBH());
        tvCauHoi.setText(listCH.get(cauHoi).getCauHoi());
        tvTraLoi.setText(listCH.get(cauHoi).getTraLoi());

        if(listCH.get(cauHoi).getImgPath() == null) {

            imgCauHoi.setVisibility(View.GONE);
        }
        else {

            imgCauHoi.setVisibility(View.VISIBLE);
            try {
                InputStream inputStream = getActivity().getAssets().open("img/" + listCH.get(cauHoi).getImgPath());
                Drawable drawable = Drawable.createFromStream(inputStream, null);
                imgCauHoi.setImageDrawable(drawable);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
