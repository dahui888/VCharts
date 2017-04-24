package com.vinctor.vcharts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.vinctor.vchartviews.diagram.DiagramData;
import com.vinctor.vchartviews.diagram.DiagramFlowLayout;

import java.util.ArrayList;
import java.util.List;

public class DiagragActivity extends BaseActivity {

    public static void startActivity(Context context) {
        Intent starter = new Intent(context, DiagragActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagrag);

        DiagramFlowLayout flowLayout = (DiagramFlowLayout) findViewById(R.id.flowlayout);
        List<DiagramData> list = new ArrayList<>();
        list.add(new DiagramData(0xff3B8DBD, "0~25个知识点"));
        list.add(new DiagramData(0xff30769F, "25~50个知识点"));
        list.add(new DiagramData(0xffC8E9FE, "50~75个知识点"));
        list.add(new DiagramData(0xff5EB9EE, "75~100个知识点"));
        flowLayout.setList(list);
    }

}
