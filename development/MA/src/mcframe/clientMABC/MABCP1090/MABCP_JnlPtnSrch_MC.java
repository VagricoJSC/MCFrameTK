package mcframe.clientMABC.MABCP1090;

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
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP5030.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import mcframe.clientMAUD.MAUDP0010.MAUDP_CallerNoPanel;
import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCParam;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MABCP_JnlPtnSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MABCP_JnlPtnSrch_MC extends MABCP_JnlPtnSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_JnlPtnSrch_MC() {
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
	public MABCP_JnlPtnSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMA_MABCL1090_Srch01();
	}
	/**
	 * [MA_MABCL1090_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1090_Srch01Caller<P extends MABCP_JnlPtnSrch, B extends MA_MABCL1090_Srch01Bridge> extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLSearcher_MC<P,B> {

		protected MA_MABCL1090_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setREFStatus();
			Ctrl_ctrl_PPanel.expand(false);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkAtLeastOneCndDelFlg(msgList);
		}
		
		/**
		 * 論理削除の検索条件項目のチェックボックスのどちらかが選択されているかチェックする
		 */
		protected void checkAtLeastOneCndDelFlg(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(Cnd_off_del_flg, Cnd_on_del_flg));
		}
	}
	
	@Override
	public void doDCEvent(MCDCBeans dc, MCEventInfo info) {
		super.doDCEvent(dc, info);
		if (dc == DtlTable) doBtn_open_MABCP1060(info);
	}
	
	/**
	 * Panel[Btn]のボタン[open_MABCP1060]の押下時の処理
	 */
	@Override
	public void doBtn_open_MABCP1060(MCEventInfo info) {
		DtlR row = DtlTable.getSelectedMCRow();
		if (row == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP1060");
		aso.runValueInit();
		aso.putCnd(crtOpenMABCP1060CndR(aso, row));
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * 自動仕分パタンマスタ登録の検索条件を設定する。
	 * 
	 * @param aso
	 * @param r
	 * @return CndR
	 */
	protected mcframe.clientMABC.MABCP1060.CndR crtOpenMABCP1060CndR(MAUCP_AppScreenOpener aso, DtlR r) {
		mcframe.clientMABC.MABCP1060.MABCP_JnlPatternReg p = (mcframe.clientMABC.MABCP1060.MABCP_JnlPatternReg) aso.getPanel();
		mcframe.clientMABC.MABCP1060.CndR to = mcframe.clientMABC.MABCP1060.CndR.create();
		to.ope(p.Cnd_ope_REF.getActionCommand());
		to.jnl_ptn_cd(r.jnl_ptn_cd());
		to.jnl_seq(r.jnl_seq());
		return to;
	}
	
	/**
	 * 遷移先[MABCP1060]の検索条件Rowコンテナを返します。
	 */
	protected mcframe.clientMABC.MABCP1060.CndR crtOpenMABCP1060CndR(MAUCP_AppScreenOpener aso) {

		mcframe.clientMABC.MABCP1060.CndR to =
			mcframe.clientMABC.MABCP1060.CndR.create();

		int index = DtlTable.getMCSelectedRow();
		if (index >= 0) {
			DtlR fr = getDtlL().get(index);
			to.jnl_ptn_cd(fr.jnl_ptn_cd());
			to.jnl_seq(fr.jnl_seq());
		}
		return to;
	}	

	@Override
	public void setSortColumn() {
		DtlTable.addSortColumn(columnDtl_jnl_ptn_cd, MCList.SortType.ASC);
		DtlTable.addSortColumn(columnDtl_jnl_seq, MCList.SortType.ASC);
	}

	//--------------------リストロジック表示制御Start-----------------------

	@Override
	public MCList getCnd_jnl_seq(MCRow row, MCEventInfo info) {
		row.setStringNE(JnlPtnSeqCols.$i_jnl_ptn_cd, getCndR().jnl_ptn_cd());
		return super.getCnd_jnl_seq(row, info);
	}

	//--------------------リストロジック表示制御End-----------------------

	@Override
	protected void valueInit() {
		super.valueInit();

		getMstR().mst_set_typ_nm(getMstSetTypNm(MAC_MST_NM.MAM_JNL_PTN));

		getCndR().setBooleanNE(CndR.$off_del_flg, true);
		getCndR().setBooleanNE(CndR.$on_del_flg, true);
	}

	public String getMstSetTypNm(MAC_MST_NM typ) {
		if (typ == null) {
			return null;
		}
		MCOperationInfo Srch01_INFO = new MCOperationInfo("MA", "MAUDL6010", "Srch01", "000000", null);
		MCParam p = new MCParam(Srch01_INFO);
		MCRow up = MCRow.create();
		up.addStringColumn("mst_nm", typ.value());
		MCRow down = MCRow.create();
		down.addStringColumn("mst_set_typ");
		down.addStringColumn("mst_set_typ_nm");
		p.addUpBlock(up);
		p.addDownBlock(down);
		(new MAUDP_CallerNoPanel(p)).exec();
		
		return down.getString("mst_set_typ_nm");
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		DtlTable.selectLeftmostColumn(0);
	}

	@Override
	protected void setStatusByOpe() {
		// 何もしない
	}

}