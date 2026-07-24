package mcframe.clientMGBF.MGBFP0110;

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
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMGUB.MGUBP0010.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import static mcframe.clientMGUC.MGUCP0020.MGUCP_AppSys.*;
import mcframe.commonMG.constant.*;
import static mcframe.commonMG.notice.MG_Msg.*;
import mcframe.clientMGUD.MGUDP0020.MGUDP_CellConfig;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMGUC.MGUCP0030.MGUCP_CCtrl;
import mcframe.clientMGUC.MGUCP0020.ExpnsR;
import static mcframe.clientMGUC.MGUCP0050.MGUCP_Color.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MGBFP_PerAveUpriSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MGBFP_PerAveUpriSrch_MC extends MGBFP_PerAveUpriSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	protected MGUCP_CCtrl<RsltR> _cc = new MGUCP_CCtrl<>();

	// 合計行の色
	protected Color _ttlColor = getVTtlColor(this);
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_PerAveUpriSrch_MC() {
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
	public MGBFP_PerAveUpriSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MG_MGBFL0110_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0110_Srch01Caller<P extends MGBFP_PerAveUpriSrch, B extends MG_MGBFL0110_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MG_MGBFL0110_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}

		@Override
		protected void afterCall() {
			super.afterCall();

			for (RsltR row : bridge.down0()) {
				calcUnitElm(row);
			}
		}

		/**
		 * 費目と費目Ｇの単価を計算する
		 */
		protected void calcUnitElm(RsltR row) {
			_cc.calcUnit(row, row.qty(), false);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMG_MGBFL0110_Srch01();
	}

	// ------------------------------------------------
	// イベント
	// ------------------------------------------------

	@Override
	public void doCnd_asst_typ_LC(MCEventInfo info) {
		if (!isNull(getCndR().asst_typ())) {
			setValueEx(Cnd_except_other_flg, false);
		}
	}

	@Override
	public void doCnd_except_other_flg_NC(MCEventInfo info) {
		super.doCnd_except_other_flg_NC(info);
		if (getCndR().except_other_flg()) {
			setValueEx(Cnd_asst_typ, null);
		}
	}

	@Override
	public void doLPnl_disp_std_NC(MCEventInfo info) {
		super.doLPnl_disp_std_NC(info);
		_cc.displayColumn();
		doDispStdCng();
		doDispQtyTtlCng();
		RsltTable.adjustWidth();
	}

	@Override
	public void doLPnl_disp_unit_NC(MCEventInfo info) {
		super.doLPnl_disp_unit_NC(info);
		_cc.displayColumn();
		doDispStdCng();
		doDispQtyTtlCng();
		RsltTable.adjustWidth();
	}

	/** 
	 * 標準原価および単価差異の表示方法を変更する
	 */
	protected void doDispStdCng() {
		if (getLPnlR().disp_std()) {
			if (getLPnlR().disp_unit()) {
				setDefaultMode(columnRslt_diff_cost_upri);
				setDefaultMode(columnRslt_std_cost_ttl_upri);
				columnRslt_diff_cost.setMode(MCMode.INVISIBLE);
				columnRslt_std_cost_ttl.setMode(MCMode.INVISIBLE);
			}
			else {
				setDefaultMode(columnRslt_diff_cost);
				setDefaultMode(columnRslt_std_cost_ttl);
				columnRslt_diff_cost_upri.setMode(MCMode.INVISIBLE);
				columnRslt_std_cost_ttl_upri.setMode(MCMode.INVISIBLE);
			}
		}
		else {
			columnRslt_diff_cost.setMode(MCMode.INVISIBLE);
			columnRslt_std_cost_ttl.setMode(MCMode.INVISIBLE);
			columnRslt_diff_cost_upri.setMode(MCMode.INVISIBLE);
			columnRslt_std_cost_ttl_upri.setMode(MCMode.INVISIBLE);
		}
	}

	/** 
	 * 数量と合計の表示方法を変更する
	 */
	protected void doDispQtyTtlCng() {
		MCColumnConfig[] allTtlCols = new MCColumnConfig[] {
				columnRslt_qty, columnRslt_ttl, columnRslt_var_cost, columnRslt_fxd_cost,
		};
		MCColumnConfig[] unitTtlCols = new MCColumnConfig[] {
				columnRslt_qty_unit, columnRslt_ttl_upri, columnRslt_var_cost_upri,
				columnRslt_fxd_cost_upri,
		};

		if (getLPnlR().disp_unit()) {
			for (MCColumnConfig cc : allTtlCols) {
				cc.setMode(MCMode.INVISIBLE);
			}
			for (MCColumnConfig cc : unitTtlCols) {
				setDefaultMode(cc);
			}
		}
		else {
			for (MCColumnConfig cc : allTtlCols) {
				setDefaultMode(cc);
			}
			for (MCColumnConfig cc : unitTtlCols) {
				cc.setMode(MCMode.INVISIBLE);
			}
		}
	}

	// ------------------------------------------------
	// ステータスの設定
	// ------------------------------------------------

	protected void setSrchStatus() {
		setSRCHStatus();
		Ctrl_ctrl_PPanel.expand(true);
	}

	protected void setRefStatus() {
		setREFStatus();
		Ctrl_ctrl_PPanel.expand(false);
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		displayColumn();
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		displayColumn();
		RsltTable.selectLeftmostColumn(0);
	}

	protected void displayColumn() {
		changeColumnMode(RsltTable, getCndR(), RsltR.$$SHOW);
		_cc.displayColumn();
		doDispStdCng();
		doDispQtyTtlCng();
	}

	// ------------------------------------------------
	// 値の設定
	// ------------------------------------------------

	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(LPnl_disp_expns, true);
		setValueEx(LPnl_disp_expns_grp, true);
		displayColumn();
	}

	// ------------------------------------------------
	// 画面の初期化
	// ------------------------------------------------

	@Override
	protected void setupParts() {
		super.setupParts();

		Rslt_qty_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty2_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Cnd_calc_no_p_PPanel.setRelateBeans(Cnd_calc_grp_cd);
	}

	@Override
	public void mcInitStatus() {
		super.mcInitStatus();
		initCCInfo();
	}

	/**
	 * カラム制御クラスの初期化
	 */
	protected void initCCInfo() {
		_cc.init(this, RsltTable);
		_cc.setExpns(getCustomExpnsL(), LPnl_disp_expns, LPnl_disp_expns_grp, LPnl_disp_unit);
	}

	/**
	 * 表示する費目項目を返します。<p>
	 * @return 表示する費目項目
	 */
	protected MCList<ExpnsR> getCustomExpnsL() {
		MCList<ExpnsR> l = getExpns();
		MCList<ExpnsR> retL = MCList.create(ExpnsR.class);
		for (ExpnsR r : l) {
			if (MAC_EXPNS_TYP.isPROD(r.expns_typ())
					|| MAC_EXPNS_TYP.isSPPL(r.expns_typ())) {
				retL.add(r);
			}
		}
		return retL;
	}

	@Override
	protected void tableInit() {
		super.tableInit();
		setColorInfo();
	}

	protected void setColorInfo() {
		MGUDP_CellConfig cc = (MGUDP_CellConfig) RsltTable.getCellConfig();
		Color rslt = getExpnsSrchRsltColor(this);
		for (MCColumnConfig c : RsltTable.getColumnConfigs()) {
			cc.putColumnBG(c, rslt);
		}

		cc.putColumnBG(_cc.getExpnsGColumnConfigs(), getExpnsGSubTtlColor(this));
		cc.putColumnBG(columnRslt_ttl, getAllTtlColor(this));
		cc.putColumnBG(columnRslt_ttl_upri, getAllTtlColor(this));
		cc.putColumnBG(columnRslt_var_cost, getVarFxdColor(this));
		cc.putColumnBG(columnRslt_var_cost_upri, getVarFxdColor(this));
		cc.putColumnBG(columnRslt_fxd_cost, getVarFxdColor(this));
		cc.putColumnBG(columnRslt_fxd_cost_upri, getVarFxdColor(this));
		cc.putColumnBG(columnRslt_diff_cost, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_diff_cost_upri, getMoneyDiffColor(this));
		cc.putColumnBG(columnRslt_std_cost_ttl, getStdUpriColor(this));
		cc.putColumnBG(columnRslt_std_cost_ttl_upri, getStdUpriColor(this));
	}

}