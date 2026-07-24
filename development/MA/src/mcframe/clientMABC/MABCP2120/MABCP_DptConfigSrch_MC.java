package mcframe.clientMABC.MABCP2120;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;

import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP0230.*;
import mcframe.clientMAUB.MAUBP5210.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START

//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_DptConfigSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_DptConfigSrch_MC extends MABCP_DptConfigSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected boolean _is_expand_all = false;
	protected CndR _cndR;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_DptConfigSrch_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_DptConfigSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MA_MABCL2120_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL2120_Srch01Caller<P extends MABCP_DptConfigSrch, B extends MA_MABCL2120_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MA_MABCL2120_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {

			super.checkForCallStack(msgList);
			if (Cnd_ope_EX2.isSelected()) {
				msgList.addAll(panel.checkAtLeastOneInput(Cnd_dpt_cd,
						Cnd_loc_cd, Cnd_oper_cd));
			}
		}
		
		@Override
		protected void show() {
			super.show();
			if(_is_expand_all){
				Dtl_hrrchy_p_PPanel.showExpandAll(getDtlL());
			}
			else{
				Dtl_hrrchy_p_PPanel.showCollapseAll(getDtlL());
			}
		}

		@Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			CndPanel.focusFirstComponent();
		}

		@Override
		protected void setMode() {
			setREFStatus();
			Ctrl_ctrl_PPanel.expand(false);
		}

		@Override
		protected void setModeNoDown() {
			setSRCHStatus();
			Ctrl_ctrl_PPanel.expand(true);
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			for (DtlR r : bridge.down0()) {
				r.leaf(r.dpt_cd());
			}
			_cndR = getCndR().clone();
		}
		@Override
		protected void clear() {
			super.clear();
			getDtlL().clear();
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		_is_expand_all = false;
		callMA_MABCL2120_Srch01();
	}
	/**
	 * Panel[Rpnl]のボタン[srch_all]の押下時の処理
	 */
	@Override
	public void doRpnl_srch_all(MCEventInfo info) {
		_is_expand_all = true;
		callMA_MABCL2120_Srch01();
	}	

	//検索枠のモード設定
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		getDtlL().clear();
		setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setCndMode();
	}
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setCndMode();
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		setValueEx(Cnd_term, getTerm(this));
		setCndMode();
	}
	

	protected void setCndMode() {
		//正展開
		if(Cnd_ope_EX1.isSelected()){
			Cnd_dpt_cd.setMode(MCMode.REQUIRED);
			Cnd_loc_cd.setMode(MCMode.READ_ONLY);
			Cnd_loc_cd.setValue(null);
			Cnd_oper_cd.setMode(MCMode.READ_ONLY);
			Cnd_oper_cd.setValue(null);

		}else{
			Cnd_dpt_cd.setMode(MCMode.ENABLE);
			Cnd_loc_cd.setMode(MCMode.ENABLE);
			Cnd_oper_cd.setMode(MCMode.ENABLE);
		}
		CndPanel.focusFirstComponent();
	}

}