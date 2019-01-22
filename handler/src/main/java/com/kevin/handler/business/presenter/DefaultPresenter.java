package com.kevin.handler.business.presenter;

import com.kevin.base.utils.ToastUtil;
import com.kevin.base.utils.http.SimpleBean;
import com.kevin.handler.business.viewmodel.DefaultViewModel;
import com.kevin.handler.framework.DefaultCallback;
import com.kevin.handler.framework.presenter.Presenter;
import com.kevin.repository.business.interaction.DesignerInteraction;
import com.kevin.repository.framework.Repository;

/**
 * Created by kevin on 2018/11/30.
 * descript：
 */

public class DefaultPresenter extends Presenter <DefaultViewModel>{
    private DesignerInteraction  designerInteraction;


    public DefaultPresenter() {
        this.designerInteraction = Repository.getInteraction(DesignerInteraction.class);
    }

    public void addStarCoin(Object tag) {
        designerInteraction.addDesignerScore(tag, "1", SimpleBean.class, new DefaultCallback<SimpleBean>(this) {
            @Override
            public void onBegin(Object tag) {
//                super.onBegin(tag);
            }

            @Override
            public void onSuccess(SimpleBean bean) {
                super.onSuccess(bean);
                if (getView() != null) {
                    getView().hideLoading();
                }
                ToastUtil.showToast(bean.getMessage());
            }

            @Override
            public void onFailure(SimpleBean simpleBean) {
                if (getView() != null) {
                    getView().hideLoading();
                }
                if (!simpleBean.getCode().equals("40005")) {
                    super.onFailure(simpleBean);
                }
            }

            @Override
            public void onError(SimpleBean simpleBean) {
                super.onError(simpleBean);
            }
        });
    }
}
