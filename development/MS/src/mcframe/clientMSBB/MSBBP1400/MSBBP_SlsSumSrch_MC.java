package mcframe.clientMSBB.MSBBP1400;

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

import mcframe.clientMAUB.MAUBP5030.*;

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
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.commonCore.meta.MCMeta;
import mcframe.clientCore.beans.text.MCBigNumberFormatInfo;
import mcframe.clientCore.beans.text.MCNumberFormat;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_SlsSumSrch"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_SlsSumSrch_MC extends MSBBP_SlsSumSrch_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	/** 明細のデータ項目名 */
	protected String[] _DTL_COL_NM = {
			"col_00", "col_01", "col_02", "col_03", "col_04",
			"col_05", "col_06", "col_07", "col_08", "col_09",
			"col_10", "col_11", "col_12", "col_13", "col_14",
			"col_15", "col_16", "col_17"
	};

	/** キーをあらわす語尾 */
	protected static final String _KEY_SUFFIX = "_key";

	/** 日付カラム用の編集文字列 */
	protected String _EDIT_YM_LABEL = getDispString("edit_ym");
	
	protected MCNumberFormat _bigNumFormat = new MCNumberFormat();

	//------------------------------部門別------------------------------
	/** 指定部門売上情報のデータタイプ */
	protected static final String _DTL1_DATA_TYP = "DPT_DPT";
	/** 指定部門売上情報のキー項目 */
	protected static final String[] _DPT_KEY_COLS = {RsltR.$dpt1, RsltR.$dpt_nm1};
	/** 指定部門売上情報のデータ項目 */
	protected static final String[] _DTL1_DST_COLS = {Dtl1R.$dpt_cd, Dtl1R.$dpt_nm};
	/** 指定部門売上情報のデータ項目の元情報 */
	protected static final String[] _DTL1_SRC_COLS = {RsltR.$dpt1, RsltR.$dpt_nm1};

	/** 部門別の下位部門別売上情報のデータタイプ */
	protected static final String _DPT_DTL_DATA_TYP = "DPT-DW_DPT";
	/** 部門別の下位部門別売上情報のデータ項目 */
	protected static final String[] _DPT_DTL_DST_COLS = {DptDtlR.$dw_dpt_cd,
			DptDtlR.$dw_dpt_nm, DptDtlR.$dpt_cd, DptDtlR.$dpt_nm};
	/** 部門別の下位部門別売上情報のデータ項目の元情報 */
	protected static final String[] _DPT_DTL_SRC_COLS = {RsltR.$dpt2,
			RsltR.$dpt_nm2, RsltR.$dpt1, RsltR.$dpt_nm1};

	/** 部門別の担当者別売上情報のデータタイプ */
	protected static final String _DPT_SLS_USR_DATA_TYP = "DPT-USR";
	/** 部門別の担当者別売上情報のデータ項目 */
	protected static final String[] _DPT_SLS_USR_DST_COLS = {DptDtlR.$sls_usr_cd,
			DptDtlR.$sls_usr_nm, DptDtlR.$dpt_cd , DptDtlR.$dpt_nm};
	/** 部門別の担当者別売上情報のデータ項目の元情報 */
	protected static final String[] _DPT_SLS_USR_SRC_COLS = {RsltR.$sls_usr_cd,
			RsltR.$sls_usr_nm, RsltR.$dpt1, RsltR.$dpt_nm1};

	/** 部門別の得意先別売上情報のデータタイプ */
	protected static final String _DPT_CST_DATA_TYP = "DPT-CST";
	/** 部門別の得意先別売上情報のデータ項目 */
	protected static final String[] _DPT_CST_DST_COLS = {DptDtlR.$cst_cd,
			DptDtlR.$cst_nm, DptDtlR.$dpt_cd, DptDtlR.$dpt_nm};
	/** 部門別の得意先別売上情報のデータ項目の元情報 */
	protected static final String[] _DPT_CST_SRC_COLS = {RsltR.$cst_cd,
			RsltR.$cst_nm, RsltR.$dpt1, RsltR.$dpt_nm1};

	//------------------------------品目体系別------------------------------
	/** 指定品目体系売上情報のデータタイプ */
	protected static final String _ITM_GRP_DTL1_DATA_TYP = "ITM_GRP_ITM_GRP";
	/** 指定品目体系売上情報のデータキー項目 */
	protected static final String[] _ITM_GRP_KEY_COLS = {RsltR.$itm_grp1};
	/** 指定品目体系売上情報のデータ項目 */
	protected static final String[] _ITM_GRP_DTL1_DST_COLS = {Dtl1R.$itm_grp_cd,
			Dtl1R.$itm_grp_nm};
	/** 指定品目体系売上情報のデータ項目の元情報 */
	protected static final String[] _ITM_GRP_DTL1_SRC_COLS = {RsltR.$itm_grp1,
			RsltR.$itm_grp_nm1};

	/** 指定品目別の下位品目体系別売上情報のデータタイプ */
	protected static final String _ITM_GRP_DTL_DATA_TYP = "ITM_GRP-DW_ITM_GRP";
	/** 指定品目別の下位品目体系別売上情報のデータ項目 */
	protected static final String[] _ITM_GRP_DTL_DST_COLS = {ItmGrpDtlR.$dw_itm_grp_cd,
			ItmGrpDtlR.$dw_itm_grp_nm, ItmGrpDtlR.$itm_grp_cd};
	/** 指定品目別の下位品目体系別売上情報のデータ項目の元情報 */
	protected static final String[] _ITM_GRP_DTL_SRC_COLS = {RsltR.$itm_grp2,
			RsltR.$itm_grp_nm2, RsltR.$itm_grp1};

	/** 指定品目別の品目別売上情報のデータタイプ */
	protected static final String _ITM_GRP_ITM_DATA_TYP = "ITM_GRP-ITM";
	/** 指定品目別の品目別売上情報のデータ項目 */
	protected static final String[] _ITM_GRP_ITM_DST_COLS = {ItmGrpDtlR.$itm_cd,
			ItmGrpDtlR.$itm_nm, ItmGrpDtlR.$itm_sub1, ItmGrpDtlR.$itm_sub2,
			ItmGrpDtlR.$itm_sub3, ItmGrpDtlR.$itm_grp_cd};
	/** 指定品目別の品目別売上情報のデータ項目の元情報 */
	protected static final String[] _ITM_GRP_ITM_SRC_COLS = {RsltR.$itm_cd,
			RsltR.$itm_nm, RsltR.$itm_sub1, RsltR.$itm_sub2,
			RsltR.$itm_sub3, RsltR.$itm_grp1};

	/** 指定品目別の得意先別売上情報のデータタイプ */
	protected static final String _ITM_GRP_CST_DATA_TYP = "ITM_GRP-CST";
	/** 指定品目別の得意先別売上情報のデータ項目 */
	protected static final String[] _ITM_GRP_CST_DST_COLS = {ItmGrpDtlR.$cst_cd,
			ItmGrpDtlR.$cst_nm, ItmGrpDtlR.$itm_grp_cd};
	/** 指定品目別の得意先売上情報のデータ項目の元情報 */
	protected static final String[] _ITM_GRP_CST_SRC_COLS = {RsltR.$cst_cd,
			RsltR.$cst_nm, RsltR.$itm_grp1};
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_SlsSumSrch_MC() {
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
	public MSBBP_SlsSumSrch_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL1400_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1400_Srch01Caller<P extends MSBBP_SlsSumSrch, B extends MS_MSBBL1400_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1400_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getDptRsltL());
			addDownContainer(getDptDtl1L());
			addDownContainer(getDptDtlL());
			addDownContainer(getDptDwDptL());
			addDownContainer(getDptDwDptAllL());
			addDownContainer(getDptSlsUsrL());
			addDownContainer(getDptSlsUsrAllL());
			addDownContainer(getDptCstL());
			addDownContainer(getDptCstAllL());
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			// 売上表示期間が０、または、表示可能な範囲を超えた場合
			if (getCndR().sls_trnst_disp_d()) {
				if (!isNull(getCndR().sls_disp_term_d())
					&& (getCndR().sls_disp_term_d().isZero()
							|| getCndR().sls_disp_term_d().gt(_DTL_COL_NM.length))) {
					MCMessage msg = new MCMessage(MSBBP0013, _DTL_COL_NM.length);
					msgList.add(msg);
				}
			}
		}

		@Override
		protected void show() {
			super.show();
			setContainers();
		}

		/**
		 * 部門別の売上の集計結果を明細に設定する。<br/>
		 * その際、ヘッダの名称、および、カラムの表示/非表示も設定する。
		 */
		protected void setContainers() {
			setBase();

			setDtl1();
			setDptDtl();
			setDptSlsUsr();
			setDptCst();
		}

		@Override
		protected void setMode() {
			super.setMode();
			setDPT_REFStatus();
			panel.sort(DptDtl1Table);
			DptDtl1Table.adjustWidth();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setDPT_SRCHStatus();
			initTableDpt();
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			DptDtl1Table.selectLeftmostColumn(0);

		}

		@Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			MainTabTab.focusActiveFirstComponent();
		}

		protected void setBase() {
			// ヘッダ
			HdrR h = getHdrR();
			h.inpt_ym(getCndR().inpt_ym_d());
			h.sls_trnst_disp(getCndR().sls_trnst_disp_d());
			h.sls_disp_term(getCndR().sls_disp_term_d());
			h.sum_term(getCndR().sum_term_d());

			// 集計情報
			getDptRsltL().setAll(bridge.down0());
		}
	}

	/**
	 * [MS_MSBBL1400_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1400_Srch02Caller<P extends MSBBP_SlsSumSrch, B extends MS_MSBBL1400_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL1400_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getItmGrpRsltL());
			addDownContainer(getItmGrpDtl1L());
			addDownContainer(getItmGrpDtlL());
			addDownContainer(getItmGrpDwItmGrpL());
			addDownContainer(getItmGrpDwItmGrpAllL());
			addDownContainer(getItmGrpCstL());
			addDownContainer(getItmGrpCstAllL());
			addDownContainer(getItmGrpItmL());
			addDownContainer(getItmGrpItmAllL());
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			// 売上表示期間が０、または、表示可能な範囲を超えた場合
			if (getCndR().sls_trnst_disp_ig()) {
				if (!isNull(getCndR().sls_disp_term_ig())
					&& (getCndR().sls_disp_term_ig().isZero()
							|| getCndR().sls_disp_term_ig().gt(_DTL_COL_NM.length))) {
					MCMessage msg = new MCMessage(MSBBP0013, _DTL_COL_NM.length);
					msgList.add(msg);
				}
			}
		}

		@Override
		protected void show() {
			super.show();
			setContainers();
		}

		/**
		 * 品目体系別の売上の集計結果を明細に設定する。<br/>
		 * その際、ヘッダの名称、および、カラムの表示/非表示も設定する。
		 */
		protected void setContainers() {
			setBase();

			setItmGrpDtl1();
			setItmGrpDtl();
			setItmGrpItm();
			setItmGrpCst();
		}

		@Override
		protected void setMode() {
			super.setMode();
			setITM_GRP_REFStatus();
			panel.sort(ItmGrpDtl1Table);
			ItmGrpDtl1Table.adjustWidth();
		}

		@Override
		protected void setModeNoDown() {

			super.setModeNoDown();
			setITM_GRP_SRCHStatus();
			initTableItmGrp();
		}

		@Override
		protected void moveFocus() {
			super.moveFocus();
			ItmGrpDtl1Table.selectLeftmostColumn(0);
		}

		@Override
		protected void moveFocusNoDown() {
			super.moveFocusNoDown();
			MainTabTab.focusActiveFirstComponent();
		}

		protected void setBase() {
			// ヘッダ
			HdrR h = getItmGrpHdrR();
			h.inpt_ym(getCndR().inpt_ym_ig());
			h.sls_trnst_disp(getCndR().sls_trnst_disp_ig());
			h.sls_disp_term(getCndR().sls_disp_term_ig());
			h.sum_term(getCndR().sum_term_ig());

			// 集計情報
			getItmGrpRsltL().setAll(bridge.down0());
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch_d]の押下時の処理
	 */
	@Override
	public void doCnd_srch_d(MCEventInfo info) {
		callMS_MSBBL1400_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_ig]の押下時の処理
	 */
	@Override
	public void doCnd_srch_ig(MCEventInfo info) {
		callMS_MSBBL1400_Srch02();
	}

	/**
	 * 指定部門売上情報を設定する。
	 */
	protected void setDtl1() {

		// 売上推移情報を設定する
		if (getHdrR().sls_trnst_disp()) {
			// ヘッダの名称、カラムの表示・非表示の設定
			setTblHdrTrnstDisp(DptDtl1Table, getHdrR());
			// 値の設定
			setDtlValueTrnstDisp(getDptRsltL(), getHdrR(), getDptDtl1L(),
					_DTL1_DATA_TYP, false, true, _DTL1_DST_COLS, _DTL1_SRC_COLS);
		}
		// 受注・売上・合計情報を設定する
		else {
			// ヘッダの名称、カラムの表示・非表示の設定
			setTblHdrSloSlsSum(DptDtl1Table, false);
			// 値の設定
			setDtlValueSloSlsSum(getDptRsltL(), getDptDtl1L(),
					_DTL1_DATA_TYP, false, _DTL1_DST_COLS, _DTL1_SRC_COLS);
		}
	}

	/**
	 * 下位部門別売上情報を設定する。
	 */
	protected void setDptDtl() {

		// 売上推移情報を設定する
		if (getHdrR().sls_trnst_disp()) {
			// ヘッダの名称、カラムの表示・非表示の設定
			setTblHdrTrnstDisp(DptDwDptTable, getHdrR());
			// 値の設定
			setDtlValueTrnstDisp(getDptRsltL(), getHdrR(), getDptDwDptAllL(),
					_DPT_DTL_DATA_TYP, false, true, _DPT_DTL_DST_COLS, _DPT_DTL_SRC_COLS);
		}
		// 受注・売上・合計情報を設定する
		else {
			// ヘッダの名称、カラムの表示・非表示の設定
			setTblHdrSloSlsSum(DptDwDptTable, false);
			// 値の設定
			setDtlValueSloSlsSum(getDptRsltL(), getDptDwDptAllL(),
					_DPT_DTL_DATA_TYP, false, _DPT_DTL_DST_COLS, _DPT_DTL_SRC_COLS);
		}
	}

	/**
	 * 担当者別売上情報を設定する。
	 */
	protected void setDptSlsUsr() {

		// 売上推移情報を設定する
		if (getHdrR().sls_trnst_disp()) {
			// ヘッダの名称、カラムの表示・非表示の設定
				setTblHdrTrnstDisp(DptSlsUsrTable, getHdrR());
			// 値の設定
			setDtlValueTrnstDisp(getDptRsltL(), getHdrR(), getDptSlsUsrAllL(),
					_DPT_SLS_USR_DATA_TYP, false, true, _DPT_SLS_USR_DST_COLS, _DPT_SLS_USR_SRC_COLS);
		}
		// 受注・売上・合計情報を設定する
		else {
			// ヘッダの名称、カラムの表示・非表示の設定
			setTblHdrSloSlsSum(DptSlsUsrTable, false);
			// 値の設定
			setDtlValueSloSlsSum(getDptRsltL(), getDptSlsUsrAllL(),
					_DPT_SLS_USR_DATA_TYP, false, _DPT_SLS_USR_DST_COLS, _DPT_SLS_USR_SRC_COLS);
		}
	}

	/**
	 * 得意先別売上情報を設定する。
	 */
	protected void setDptCst() {

		// 売上推移情報を設定する
		if (getHdrR().sls_trnst_disp()) {
			// ヘッダの名称、カラムの表示・非表示の設定
			setTblHdrTrnstDisp(DptCstTable, getHdrR());
			// 値の設定
			setDtlValueTrnstDisp(getDptRsltL(), getHdrR(), getDptCstAllL(),
					_DPT_CST_DATA_TYP, false, true, _DPT_CST_DST_COLS, _DPT_CST_SRC_COLS);
		}
		// 受注・売上・合計情報を設定する
		else {
			// ヘッダの名称、カラムの表示・非表示の設定
			setTblHdrSloSlsSum(DptCstTable, false);
			// 値の設定
			setDtlValueSloSlsSum(getDptRsltL(), getDptCstAllL(),
					_DPT_CST_DATA_TYP, false, _DPT_CST_DST_COLS, _DPT_CST_SRC_COLS);
		}
	}

	/**
	 * 指定品目体系売上情報を設定する。
	 */
	protected void setItmGrpDtl1() {

		// 売上推移情報を設定する
		if (getItmGrpHdrR().sls_trnst_disp()) {
			// ヘッダの名称、カラムの表示・非表示の設定
			setTblHdrTrnstDisp(ItmGrpDtl1Table, getItmGrpHdrR());
			// 値の設定
			setDtlValueTrnstDisp(getItmGrpRsltL(), getItmGrpHdrR(), getItmGrpDtl1L(),
					_ITM_GRP_DTL1_DATA_TYP, false, true, _ITM_GRP_DTL1_DST_COLS, _ITM_GRP_DTL1_SRC_COLS);
		}
		// 受注・売上・合計情報を設定する
		else {
			// ヘッダの名称、カラムの表示・非表示の設定
			setTblHdrSloSlsSum(ItmGrpDtl1Table, false);
			// 値の設定
			setDtlValueSloSlsSum(getItmGrpRsltL(), getItmGrpDtl1L(),
					_ITM_GRP_DTL1_DATA_TYP, false, _ITM_GRP_DTL1_DST_COLS, _ITM_GRP_DTL1_SRC_COLS);
		}
	}

	/**
	 * 下位品目体系別売上情報を設定する。
	 */
	protected void setItmGrpDtl() {

		// 売上推移情報を設定する
		if (getItmGrpHdrR().sls_trnst_disp()) {
			// ヘッダの名称、カラムの表示・非表示の設定
			setTblHdrTrnstDisp(ItmGrpDwItmGrpTable, getItmGrpHdrR());
			// 値の設定
			setDtlValueTrnstDisp(getItmGrpRsltL(), getItmGrpHdrR(), getItmGrpDwItmGrpAllL(),
					_ITM_GRP_DTL_DATA_TYP, false, true, _ITM_GRP_DTL_DST_COLS, _ITM_GRP_DTL_SRC_COLS);
		}
		// 受注・売上・合計情報を設定する
		else {
			// ヘッダの名称、カラムの表示・非表示の設定
			setTblHdrSloSlsSum(ItmGrpDwItmGrpTable, false);
			// 値の設定
			setDtlValueSloSlsSum(getItmGrpRsltL(), getItmGrpDwItmGrpAllL(),
					_ITM_GRP_DTL_DATA_TYP, false, _ITM_GRP_DTL_DST_COLS, _ITM_GRP_DTL_SRC_COLS);
		}
	}

	/**
	 * 品目別売上情報を設定する。
	 */
	protected void setItmGrpItm() {

		// 売上推移情報を設定する
		if (getItmGrpHdrR().sls_trnst_disp()) {
			// ヘッダの名称、カラムの表示・非表示の設定
			setTblHdrTrnstDisp(ItmGrpItmTable, getItmGrpHdrR());
			// 値の設定
			setDtlValueTrnstDisp(getItmGrpRsltL(), getItmGrpHdrR(), getItmGrpItmAllL(),
					_ITM_GRP_ITM_DATA_TYP, true, false, _ITM_GRP_ITM_DST_COLS, _ITM_GRP_ITM_SRC_COLS);
		}
		// 受注・売上・合計情報を設定する
		else {
			// ヘッダの名称、カラムの表示・非表示の設定
			setTblHdrSloSlsSum(ItmGrpItmTable, true);
			// 値の設定
			setDtlValueSloSlsSum(getItmGrpRsltL(), getItmGrpItmAllL(),
					_ITM_GRP_ITM_DATA_TYP, true, _ITM_GRP_ITM_DST_COLS, _ITM_GRP_ITM_SRC_COLS);
		}
	}

	/**
	 * 得意先別売上情報を設定する。
	 */
	protected void setItmGrpCst() {

		// 売上推移情報を設定する
		if (getItmGrpHdrR().sls_trnst_disp()) {
			// ヘッダの名称、カラムの表示・非表示の設定
			setTblHdrTrnstDisp(ItmGrpCstTable, getItmGrpHdrR());
			// 値の設定
			setDtlValueTrnstDisp(getItmGrpRsltL(), getItmGrpHdrR(), getItmGrpCstAllL(),
					_ITM_GRP_CST_DATA_TYP, false, true, _ITM_GRP_CST_DST_COLS, _ITM_GRP_CST_SRC_COLS);
		}
		// 受注・売上・合計情報を設定する
		else {
			// ヘッダの名称、カラムの表示・非表示の設定
			setTblHdrSloSlsSum(ItmGrpCstTable, false);
			// 値の設定
			setDtlValueSloSlsSum(getItmGrpRsltL(), getItmGrpCstAllL(),
					_ITM_GRP_CST_DATA_TYP, false, _ITM_GRP_CST_DST_COLS, _ITM_GRP_CST_SRC_COLS);
		}
	}

	// ------------オープン時の処理実装------------
	@Override
	protected void valueInit() {
		super.valueInit();
		setDefaultValueDpt();
		setDefaultValueItmGrp();
	}

	protected void setDefaultValueDpt() {
		setValueEx(Cnd_xrate_cd_d, getCo().sls_xrate_cd());
		setValueEx(Cnd_inpt_ym_d, toYM(getToday()));
		setValueEx(Hdr_base_cur_cd, getBaseCur().cur_cd());
		setValueEx(Hdr_base_cur_nm, getBaseCur().cur_nm());
		setValueEx(Hdr_sls_flg, true);
		setValueEx(Hdr_slo_flg, true);
		setValueEx(Hdr_slo_bl_flg, true);
		setValueEx(Hdr_bdg_flg, true);
		setValueEx(Hdr_spln_flg, true);
		setValueEx(Hdr_spln_per_cmpl_sls_flg, true);
		setValueEx(Hdr_bdg_flg, true);
		setValueEx(Hdr_bdg_per_cmpl_sls_flg, true);
		setValueEx(Hdr_prof_amt_flg, true);
		setValueEx(Hdr_prof_rate_flg, true);
	}

	protected void setDefaultValueItmGrp() {
		setValueEx(Cnd_xrate_cd_ig, getCo().sls_xrate_cd());
		setValueEx(Cnd_inpt_ym_ig, toYM(getToday()));
		setValueEx(ItmGrpHdr_base_cur_cd, getBaseCur().cur_cd());
		setValueEx(ItmGrpHdr_base_cur_nm, getBaseCur().cur_nm());
		setValueEx(ItmGrpHdr_unit, getDispString("unit"));
		setValueEx(ItmGrpHdr_sls_flg, true);
		setValueEx(ItmGrpHdr_slo_flg, true);
		setValueEx(ItmGrpHdr_slo_bl_flg, true);
		setValueEx(ItmGrpHdr_bdg_flg, true);
		setValueEx(ItmGrpHdr_spln_flg, true);
		setValueEx(ItmGrpHdr_spln_per_cmpl_sls_flg, true);
		setValueEx(ItmGrpHdr_bdg_flg, true);
		setValueEx(ItmGrpHdr_bdg_per_cmpl_sls_flg, true);
		setValueEx(ItmGrpHdr_prof_amt_flg, true);
		setValueEx(ItmGrpHdr_prof_rate_flg, true);
	}

	// ------------CellConfigの設定------------
	/**
	 * CellConfigの設定
	 */
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		setCellConfigDpt();
		setCellConfigItmGrp();
	}

	/**
	 * 部門別タブのCellConfigの設定
	 */
	protected void setCellConfigDpt() {
		DtlConf cc = createDtlConf();
		cc.setBigNumFormat(_bigNumFormat);
		DptDtl1Table.setCellConfig(cc);
		DptDwDptTable.setCellConfig(cc);
		DptSlsUsrTable.setCellConfig(cc);
		DptCstTable.setCellConfig(cc);
	}

	/**
	 * 品目体系別タブのCellConfigの設定
	 */
	protected void setCellConfigItmGrp() {
		DtlConf cc = createDtlConf();
		cc.setBigNumFormat(_bigNumFormat);
		ItmGrpDtl1Table.setCellConfig(cc);
		ItmGrpDwItmGrpTable.setCellConfig(cc);
		ItmGrpItmTable.setCellConfig(cc);
		ItmGrpCstTable.setCellConfig(cc);
	}

	// ------------ソートするカラムの設定------------
	/**
	 * ソートするカラムの設定
	 */
	@Override
	protected void setSortColumn() {

		super.setSortColumn();

		setSortColumnDpt();
		setSortColumnItmGrp();
	}

	/**
	 * 部門別タブのソートするカラムの設定
	 */
	protected void setSortColumnDpt() {

		DptDtl1Table.addSortColumn(columnDptDtl1_dpt1_key);
		DptDtl1Table.addSortColumn(columnDptDtl1_dpt_nm1_key); // 推移表示では同一コードで名称違いがあるため、名称もソート順に加える
		DptDtl1Table.addSortColumn(columnDptDtl1_row_sort_col);

		DptDwDptTable.addSortColumn(columnDptDwDpt_dpt2_key);
		DptDwDptTable.addSortColumn(columnDptDwDpt_dpt_nm2_key);// 推移表示では同一コードで名称違いがあるため、名称もソート順に加える
		DptDwDptTable.addSortColumn(columnDptDwDpt_row_sort_col);

		DptSlsUsrTable.addSortColumn(columnDptSlsUsr_sls_usr_cd_key);
		DptSlsUsrTable.addSortColumn(columnDptSlsUsr_row_sort_col);

		DptCstTable.addSortColumn(columnDptCst_cst_cd_key);
		DptCstTable.addSortColumn(columnDptCst_row_sort_col);
	}

	/**
	 * 品目体系別タブのソートするカラムの設定
	 */
	protected void setSortColumnItmGrp() {

		ItmGrpDtl1Table.addSortColumn(columnItmGrpDtl1_itm_grp1_key);
		ItmGrpDtl1Table.addSortColumn(columnItmGrpDtl1_row_sort_col);

		ItmGrpDwItmGrpTable.addSortColumn(columnItmGrpDwItmGrp_itm_grp2_key);
		ItmGrpDwItmGrpTable.addSortColumn(columnItmGrpDwItmGrp_row_sort_col);
		
		ItmGrpItmTable.addSortColumn(columnItmGrpItm_itm_cd_key);
		ItmGrpItmTable.addSortColumn(columnItmGrpItm_itm_sub1_key);
		ItmGrpItmTable.addSortColumn(columnItmGrpItm_itm_sub2_key);
		ItmGrpItmTable.addSortColumn(columnItmGrpItm_itm_sub3_key);
		ItmGrpItmTable.addSortColumn(columnItmGrpItm_row_sort_col);

		ItmGrpCstTable.addSortColumn(columnItmGrpCst_cst_cd_key);
		ItmGrpCstTable.addSortColumn(columnItmGrpCst_row_sort_col);
	}

	/**
	 * テーブルの初期設定
	 */
	@Override
	protected void tableInit() {

		super.tableInit();

		setSortableDpt();
		setSortableItmGrp();
	}

	/**
	 * 部門別タブのテーブルの設定
	 */
	protected void setSortableDpt() {
		DptDtl1Table.setSortable(false);
		DptDwDptTable.setSortable(false);
		DptSlsUsrTable.setSortable(false);
		DptCstTable.setSortable(false);

		DptDtl1Table.setReorderingAllowed(false);
		DptDwDptTable.setReorderingAllowed(false);
		DptSlsUsrTable.setReorderingAllowed(false);
		DptCstTable.setReorderingAllowed(false);
	}

	/**
	 * 品目体系別タブのテーブルの設定
	 */
	protected void setSortableItmGrp() {
		ItmGrpDtl1Table.setSortable(false);
		ItmGrpDwItmGrpTable.setSortable(false);
		ItmGrpItmTable.setSortable(false);
		ItmGrpCstTable.setSortable(false);

		ItmGrpDtl1Table.setReorderingAllowed(false);
		ItmGrpDwItmGrpTable.setReorderingAllowed(false);
		ItmGrpItmTable.setReorderingAllowed(false);
		ItmGrpCstTable.setReorderingAllowed(false);
	}

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig conf = super.createFXBAP_PopupConfig(beans);
		// 全てのテーブルがソート不可
		conf.ignoreSortOrder(true);
		conf.ignoreTableSort(true);
		return conf;
	}

	/**
	 * コンボボックスの設定
	 */
	@Override
	protected void listInit() {
		super.listInit();
		getCnd_xrate_cd_d_ListPutter().setColumns(XrateCols.outAll());
		getCnd_xrate_cd_ig_ListPutter().setColumns(XrateCols.outAll());
	}

	// ------------通信時の共通処理------------
	/**
	 * 推移表示用のテーブルヘッダの名称、および、カラムの表示・非表示の設定を行う。<br/>
	 * 
	 * @param table ヘッダの名称、および、カラムの表示・非表示を設定するテーブル
	 * @param hdrR　ヘッダ情報
	 */
	protected void setTblHdrTrnstDisp(MCTable<? extends MCConstRow> table, HdrR hdrR) {

		// 対象テーブルの名称を取得する
		// (あとで、カラムの名称と合わせてカラムを取得するためのキーとする)
		String tblBasename = getTblBasename(table);

		MCNumber sumTerm = isNull(hdrR.sum_term()) ||
				hdrR.sum_term().isZero() ? MCNumber.ONE : hdrR.sum_term();
		
		// 名称を書き換えるヘッダのカラム数分ループ
		// addMonthは推移表示を始めた月から何ヵ月後か
		for (int addMonth = 0; addMonth < _DTL_COL_NM.length; addMonth++) {
			// ヘッダの名称を書き換え、表示・非表示を設定するカラムの取得
			MCColumnConfig conf = table.getColumnConfig(tblBasename + _DTL_COL_NM[addMonth]);
			// 推移表示をする期間内なら、ヘッダの名称を書き換え、リードオンリーで表示

			// 集計期間が設定されていない場合、または、集計期間が1以下の場合（0が指定されている場合は1とみなす）
			// 売上表示期間に指定されている期間の情報を1ヶ月毎に表示する。
			if (sumTerm.lte(MCNumber.ONE)) {
				if (hdrR.sls_disp_term().gt(addMonth)) {
					String colNm = toY2MString(hdrR.inpt_ym().addMonth(addMonth));
					conf.setHeaderName(colNm);
					conf.setMode(MCMode.READ_ONLY);
				}
				// 推移表示をする期間を過ぎている場合、カラムを非表示
				else {
					conf.setHeaderName("");
					conf.setMode(MCMode.INVISIBLE);
				}
			}
			// 集計期間が設定されている場合、かつ、集計期間が2以上の場合
			// 集計期間の値で売上表示期間分の情報を集計して表示する。
			// （例）
			// 指定年月：2016/04、売上表示期間:6、集計期間：3の場合、
			// 「2016/04～2016/06」、「2016/07～2016/09」と表示する。
			else {
				MCNumber[] dispCntDivAndRem = hdrR.sls_disp_term().divideAndRemainder(sumTerm);
				MCNumber dispCnt = dispCntDivAndRem[0].isZero() ? MCNumber.ONE : dispCntDivAndRem[0];
				MCNumber dispCntRem = dispCntDivAndRem[0].isZero() ? MCNumber.ZERO : dispCntDivAndRem[1];
				MCNumber sumTermSub = dispCntDivAndRem[0].isZero() ? hdrR.sls_disp_term() : hdrR.sum_term();

				// ラベルのＦＲＯＭ年月、ＴＯ年月に加算する月数を設定
				MCNumber from = hdrR.sum_term().multiply(addMonth);
				MCNumber to1 = hdrR.sum_term().multiply(addMonth).add(sumTermSub.subtract(MCNumber.ONE));
				MCNumber to2 = hdrR.sum_term().multiply(addMonth).add(dispCntRem.subtract(MCNumber.ONE));

				// ラベルのＦＲＯＭ年月、ＴＯ年月を編集してカラムを設定する
				if (dispCnt.gt(addMonth)) {
					conf.setHeaderName(editFromToYm(
							toY2MString(hdrR.inpt_ym().addMonth(from)),
							toY2MString(hdrR.inpt_ym().addMonth(to1))));
					conf.setMode(MCMode.READ_ONLY);
				}
				else if (isSame(dispCnt, addMonth) && !dispCntRem.isZero()) {
					conf.setHeaderName(editFromToYm(
							toY2MString(hdrR.inpt_ym().addMonth(from)),
							toY2MString(hdrR.inpt_ym().addMonth(to2))));
					conf.setMode(MCMode.READ_ONLY);
				}
				else {
					conf.setHeaderName("");
					conf.setMode(MCMode.INVISIBLE);	
				}
			}
		}

		// 「受注」、「売上」、「合計」を非表示にする
		hideSloSlsSum(table);
	}

	/**
	 * 推移表示する値を設定する<br />
	 * 
	 * @param <D> 値を設定するテーブルの行の型
	 * @param downL 下り電文の売上集計結果
	 * @param dtlL 値を設定するテーブル
	 * @param dataTyp 下り電文の売上集計結果のうちどのデータタイプを設定するか
	 * @param qtyFlg 数量を表示するか。表示する場合true
	 * @param bdgFlg 予算を表示するか。表示する場合true
	 * @param dstCols 設定先の項目名
	 * @param srcCols 設定元の項目名
	 */
	protected <D extends MCConstRow> void setDtlValueTrnstDisp(MCList<RsltR> downL,
			HdrR hdrR, MCList<D> dtlL, String dataTyp, boolean qtyFlg, boolean bdgFlg, String[] dstCols, String[] srcCols) {

		// 以前のテーブルの値をクリアする
		dtlL.clear();

		// データタイプを元に、設定する値を下り電文の売上集計結果より取得する
		MCList<RsltR> rsltL = downL.subList(RsltR.$data_typ, dataTyp);
		MCList<RsltR>[] rsltLArr = rsltL.groupList(srcCols);

		for (MCList<RsltR> l : rsltLArr) {
			RsltR orgR = l.get(0);

			MCList<D> wk = dtlL.createInstance();
			int rowSortCol = 0;

			// -----------売上
			D a1 = dtlL.createRow(); // 数量
			D a2 = dtlL.createRow(); // 売上
			D a3 = dtlL.createRow(); // 受注残
			D a4 = dtlL.createRow(); // 粗利
			D a5 = dtlL.createRow(); // 粗利率
			D a6 = dtlL.createRow(); // 受注数量
			D a7 = dtlL.createRow(); // 受注
			D a8 = dtlL.createRow(); // 受注粗利
			D a9 = dtlL.createRow(); // 受注粗利率
			
			if (hdrR.sls_flg() || hdrR.slo_bl_flg()) {
				// 数量を表す行の作成
				if (qtyFlg) {
					a1.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
					a1.setValue("row_title_nm", getDispString("qty"));
					a1.setValue("base_unit_dec_place", orgR.getNumber("base_unit_dec_place"));
					setKeys(a1, orgR, srcCols);
					wk.add(a1);
				}
				// 売上を表す行の作成
				if (hdrR.sls_flg()) {
					a2.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
					a2.setValue("row_title_nm", getDispString("sls"));
					a2.setValue("amt_dec_place", orgR.getNumber("amt_dec_place"));
					setKeys(a2, orgR, srcCols);
					wk.add(a2);
				}
				// 受注残を表す行の作成
				if (hdrR.slo_bl_flg()) {
					a3.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
					a3.setValue("row_title_nm", getDispString("slo_bl"));
					a3.setValue("amt_dec_place", orgR.getNumber("amt_dec_place"));
					setKeys(a3, orgR, srcCols);
					wk.add(a3);
				}
				// 粗利を表す行の作成
				if (hdrR.prof_amt_flg()) {
					a4.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
					a4.setValue("row_title_nm", getDispString("prof_amt"));
					a4.setValue("amt_dec_place", orgR.getNumber("amt_dec_place"));
					setKeys(a4, orgR, srcCols);
					wk.add(a4);
				}
				// 粗利率を表す行の作成
				if (hdrR.prof_rate_flg()) {
					a5.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
					a5.setValue("row_title_nm", getDispString("prof_rate"));
					a5.setValue("rate_dec_place", orgR.getNumber("rate_dec_place"));
					setKeys(a5, orgR, srcCols);
					wk.add(a5);
				}
			}
			if (hdrR.slo_flg()) {
				// 数量を表す行の作成
				if (qtyFlg) {
					a6.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
					a6.setValue("row_title_nm", getDispString("slo_qty"));
					a6.setValue("base_unit_dec_place", orgR.getNumber("base_unit_dec_place"));
					setKeys(a6, orgR, srcCols);
					wk.add(a6);
				}
				// 受注を表す行の作成
				if (hdrR.slo_flg()) {
					a7.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
					a7.setValue("row_title_nm", getDispString("slo"));
					a7.setValue("amt_dec_place", orgR.getNumber("amt_dec_place"));
					setKeys(a7, orgR, srcCols);
					wk.add(a7);
				}
				// 受注粗利を表す行の作成
				if (hdrR.prof_amt_flg()) {
					a8.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
					a8.setValue("row_title_nm", getDispString("slo_prof_amt"));
					a8.setValue("amt_dec_place", orgR.getNumber("amt_dec_place"));
					setKeys(a8, orgR, srcCols);
					wk.add(a8);
				}
				// 受注粗利率を表す行の作成
				if (hdrR.prof_rate_flg()) {
					a9.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
					a9.setValue("row_title_nm", getDispString("slo_prof_rate"));
					a9.setValue("rate_dec_place", orgR.getNumber("rate_dec_place"));
					setKeys(a9, orgR, srcCols);
					wk.add(a9);
				}
			}

			// -----------計画
			D b1 = dtlL.createRow(); // 数量
			D b2 = dtlL.createRow(); // 金額
			if (hdrR.spln_flg()) {
				// 販売計画数量を表す行の作成
				if (qtyFlg) {
					b1.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
					b1.setValue("row_title_nm", getDispString("spln_qty"));
					b1.setValue("base_unit_dec_place", orgR.getNumber("base_unit_dec_place"));
					setKeys(b1, orgR, srcCols);
					wk.add(b1);
				}
				// 販売計画金額を表す行の作成
				b2.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
				b2.setValue("row_title_nm", getDispString("spln_amt"));
				b2.setValue("amt_dec_place", orgR.getNumber("amt_dec_place"));
				setKeys(b2, orgR, srcCols);
				wk.add(b2);
				
			}

			// -----------計画進捗率
			D c1 = dtlL.createRow(); // 数量（売上・受注残）
			D c2 = dtlL.createRow(); // 金額（売上・受注残）
			D c3 = dtlL.createRow(); // 数量（受注）
			D c4 = dtlL.createRow(); // 金額（受注）
			if (hdrR.spln_per_cmpl_sls_flg()) {
				if (hdrR.sls_flg() || hdrR.slo_bl_flg()) {
					// 数量進捗率を表す行の作成
					if (qtyFlg) {
						c1.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
						c1.setValue("row_title_nm", getDispString("spln_per_cmpl_sls_qty"));
						c1.setValue("rate_dec_place", orgR.getNumber("rate_dec_place"));
						setKeys(c1, orgR, srcCols);
						wk.add(c1);
					}
					// 金額進捗率を表す行の作成
					c2.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
					c2.setValue("row_title_nm", getDispString("spln_per_cmpl_sls_amt"));
					c2.setValue("rate_dec_place", orgR.getNumber("rate_dec_place"));
					setKeys(c2, orgR, srcCols);
					wk.add(c2);
				}
				if (hdrR.slo_flg()) {
					// 数量進捗率を表す行の作成
					if (qtyFlg) {
						c3.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
						c3.setValue("row_title_nm", getDispString("spln_per_cmpl_slo_qty"));
						c3.setValue("rate_dec_place", orgR.getNumber("rate_dec_place"));
						setKeys(c3, orgR, srcCols);
						wk.add(c3);
					}
					// 金額進捗率を表す行の作成
					c4.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
					c4.setValue("row_title_nm", getDispString("spln_per_cmpl_slo_amt"));
					c4.setValue("rate_dec_place", orgR.getNumber("rate_dec_place"));
					setKeys(c4, orgR, srcCols);
					wk.add(c4);
				}
			}

			// -----------予算
			D d2 = dtlL.createRow(); // 金額
			D d3 = dtlL.createRow(); // 粗利
			D d4 = dtlL.createRow(); // 粗利率
			if (hdrR.bdg_flg() && bdgFlg) {
				// 予算売上金額を表す行の作成
				d2.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
				d2.setValue("row_title_nm", getDispString("bdg_sls_amt"));
				d2.setValue("amt_dec_place", orgR.getNumber("amt_dec_place"));
				setKeys(d2, orgR, srcCols);
				wk.add(d2);

				// 予算売上粗利を表す行の作成
				if (hdrR.prof_amt_flg()) {
					d3.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
					d3.setValue("row_title_nm", getDispString("bdg_sls_prof_amt"));
					d3.setValue("amt_dec_place", orgR.getNumber("amt_dec_place"));
					setKeys(d3, orgR, srcCols);
					wk.add(d3);
				}

				// 予算売上粗利率を表す行の作成
				if (hdrR.prof_rate_flg()) {
					d4.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
					d4.setValue("row_title_nm", getDispString("bdg_sls_prof_rate"));
					d4.setValue("rate_dec_place", orgR.getNumber("rate_dec_place"));
					setKeys(d4, orgR, srcCols);
					wk.add(d4);
				}
			}

			// -----------予算進捗率
			D e2 = dtlL.createRow(); // 金額（売上・受注残）
			D e3 = dtlL.createRow(); // 粗利（売上・受注残）
			D e4 = dtlL.createRow(); // 数量（受注）
			D e5 = dtlL.createRow(); // 金額（受注）
			D e6 = dtlL.createRow(); // 粗利（受注）

			if (hdrR.bdg_per_cmpl_sls_flg() && bdgFlg) {
				if (hdrR.sls_flg() || hdrR.slo_bl_flg()) {
					// 金額進捗率を表す行の作成
					e2.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
					e2.setValue("row_title_nm", getDispString("bdg_per_cmpl_sls_amt"));
					e2.setValue("rate_dec_place", orgR.getNumber("rate_dec_place"));
					setKeys(e2, orgR, srcCols);
					wk.add(e2);
	
					// 粗利進捗率を表す行の作成
					if (hdrR.prof_amt_flg()) {
						e3.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
						e3.setValue("row_title_nm", getDispString("bdg_per_cmpl_sls_prof_amt"));
						e3.setValue("rate_dec_place", orgR.getNumber("rate_dec_place"));
						setKeys(e3, orgR, srcCols);
						wk.add(e3);
					}
				}
				if (hdrR.slo_flg()) {
					// 数量進捗率を表す行の作成
					if (qtyFlg) {
						e4.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
						e4.setValue("row_title_nm", getDispString("bdg_per_cmpl_slo_qty"));
						e4.setValue("rate_dec_place", orgR.getNumber("rate_dec_place"));
						setKeys(e4, orgR, srcCols);
						wk.add(e4);
					}
					// 金額進捗率を表す行の作成
					e5.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
					e5.setValue("row_title_nm", getDispString("bdg_per_cmpl_slo_amt"));
					e5.setValue("rate_dec_place", orgR.getNumber("rate_dec_place"));
					setKeys(e5, orgR, srcCols);
					wk.add(e5);
	
					// 粗利進捗率を表す行の作成
					if (hdrR.prof_amt_flg()) {
						e6.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
						e6.setValue("row_title_nm", getDispString("bdg_per_cmpl_slo_prof_amt"));
						e6.setValue("rate_dec_place", orgR.getNumber("rate_dec_place"));
						setKeys(e6, orgR, srcCols);
						wk.add(e6);
					}
				}

			}

			// 最初の行にキー項目を設定
			if (!isNull(wk)) {
				wk.get(0).setValues(dstCols, orgR, srcCols);
				dtlL.addAll(wk);
			}

			// 推移表示する値を設定するカラム数分ループ
			// addMonthは推移表示を始めた月から何ヵ月後か
			MCNumber sumTerm = isNull(hdrR.sum_term()) ||
					hdrR.sum_term().isZero() ? MCNumber.ONE : hdrR.sum_term();
			MCNumber loopCntDivAndRem[] = hdrR.sls_disp_term().divideAndRemainder(sumTerm);
			MCNumber loopCnt = loopCntDivAndRem[0].isZero() ||
					!loopCntDivAndRem[1].isZero() ? loopCntDivAndRem[0].add(1) :
						loopCntDivAndRem[0];
			
			for (int addMonth = 0; addMonth < _DTL_COL_NM.length; addMonth++) {
				// 推移表示をする期間内なら、値を設定する
				if (loopCnt.gt(addMonth)) {
					// 値を設定する月の取得
					MCDate ym = hdrR.inpt_ym().addMonth(sumTerm.multiply(addMonth));
					// 下り電文の売上集計結果より該当月のデータを取得
					MCList<RsltR> ymL = l.subList(RsltR.$ym, ym);

					// 数量
					if (hdrR.slo_bl_flg() && hdrR.sls_flg()) {
						a1.setValue(_DTL_COL_NM[addMonth], ymL.sum(RsltR.$sum_qty));
					}
					else if (hdrR.slo_bl_flg()) {
						a1.setValue(_DTL_COL_NM[addMonth], ymL.sum(RsltR.$slo_bl_qty));
					}
					else if (hdrR.sls_flg()) {
						a1.setValue(_DTL_COL_NM[addMonth], ymL.sum(RsltR.$sls_qty));
					}
					// 売上
					a2.setValue(_DTL_COL_NM[addMonth], ymL.sum(RsltR.$sls_amt));
					// 受注残
					a3.setValue(_DTL_COL_NM[addMonth], ymL.sum(RsltR.$slo_bl_amt));
					// 粗利
					if (hdrR.slo_bl_flg() && hdrR.sls_flg()) {
						a4.setValue(_DTL_COL_NM[addMonth], ymL.sum(RsltR.$sum_prof_amt));
					}
					else if (hdrR.slo_bl_flg()) {
						a4.setValue(_DTL_COL_NM[addMonth], ymL.sum(RsltR.$slo_bl_prof_amt));
					}
					else {
						a4.setValue(_DTL_COL_NM[addMonth], ymL.sum(RsltR.$sls_prof_amt));
					}
					// 粗利率
					MCNumber slsAmtSum = nvl(ymL.sum(RsltR.$sls_amt), MCNumber.ZERO);
					MCNumber sloBlAmtSum = nvl(ymL.sum(RsltR.$slo_bl_amt), MCNumber.ZERO);
					if (hdrR.slo_bl_flg() && hdrR.sls_flg()) {
						calcRate(a5, _DTL_COL_NM[addMonth], slsAmtSum.add(sloBlAmtSum), ymL.sum(RsltR.$sum_prof_amt));
					}
					else if (hdrR.slo_bl_flg()) {
						calcRate(a5, _DTL_COL_NM[addMonth], sloBlAmtSum, ymL.sum(RsltR.$slo_bl_prof_amt));
					}
					else {
						calcRate(a5, _DTL_COL_NM[addMonth], slsAmtSum, ymL.sum(RsltR.$sls_prof_amt));
					}
					
					// 受注数量
					a6.setValue(_DTL_COL_NM[addMonth], ymL.sum(RsltR.$slo_qty));
					// 受注
					a7.setValue(_DTL_COL_NM[addMonth], ymL.sum(RsltR.$slo_amt));
					// 受注粗利
					a8.setValue(_DTL_COL_NM[addMonth], ymL.sum(RsltR.$slo_prof_amt));
					// 受注粗利率
					calcRate(a9, _DTL_COL_NM[addMonth], ymL.sum(RsltR.$slo_amt), ymL.sum(RsltR.$slo_prof_amt));

					// 販売計画数量
					b1.setValue(_DTL_COL_NM[addMonth], ymL.sum(RsltR.$spln_qty));
					// 販売計画金額
					b2.setValue(_DTL_COL_NM[addMonth], ymL.sum(RsltR.$spln_amt));

					// 計画数量進捗率
					if (hdrR.slo_bl_flg() && hdrR.sls_flg()) {
						calcRate(c1, _DTL_COL_NM[addMonth], ymL.sum(RsltR.$spln_qty), ymL.sum(RsltR.$sum_qty));
					}
					else if (hdrR.slo_bl_flg()) {
						calcRate(c1, _DTL_COL_NM[addMonth], ymL.sum(RsltR.$spln_qty), ymL.sum(RsltR.$slo_bl_qty));
					}
					else {
						calcRate(c1, _DTL_COL_NM[addMonth], ymL.sum(RsltR.$spln_qty), ymL.sum(RsltR.$sls_qty));
					}
					// 計画金額進捗率
					if (hdrR.slo_bl_flg() && hdrR.sls_flg()) {
						calcRate(c2, _DTL_COL_NM[addMonth], ymL.sum(RsltR.$spln_amt), slsAmtSum.add(sloBlAmtSum));
					}
					else if (hdrR.slo_bl_flg()) {
						calcRate(c2, _DTL_COL_NM[addMonth], ymL.sum(RsltR.$spln_amt), sloBlAmtSum);
					}
					else {
						calcRate(c2, _DTL_COL_NM[addMonth], ymL.sum(RsltR.$spln_amt), slsAmtSum);
					}
					// 計画数量進捗率（受注）
					calcRate(c3, _DTL_COL_NM[addMonth], ymL.sum(RsltR.$spln_qty), ymL.sum(RsltR.$slo_qty));
					// 計画金額進捗率（受注）
					calcRate(c4, _DTL_COL_NM[addMonth], ymL.sum(RsltR.$spln_amt), ymL.sum(RsltR.$slo_amt));

					// 予算売上金額
					d2.setValue(_DTL_COL_NM[addMonth], ymL.sum(RsltR.$bdg_sls_amt));
					// 予算売上粗利
					d3.setValue(_DTL_COL_NM[addMonth], ymL.sum(RsltR.$bdg_sls_prof_amt));
					// 予算売上粗利率
					calcRate(d4, _DTL_COL_NM[addMonth], ymL.sum(RsltR.$bdg_sls_amt), ymL.sum(RsltR.$bdg_sls_prof_amt));

					// 予算金額進捗率
					if (hdrR.slo_bl_flg() && hdrR.sls_flg()) {
						calcRate(e2, _DTL_COL_NM[addMonth], ymL.sum(RsltR.$bdg_sls_amt), slsAmtSum.add(sloBlAmtSum));
					}
					else if (hdrR.slo_bl_flg()) {
						calcRate(e2, _DTL_COL_NM[addMonth], ymL.sum(RsltR.$bdg_sls_amt), sloBlAmtSum);
					}
					else {
						calcRate(e2, _DTL_COL_NM[addMonth], ymL.sum(RsltR.$bdg_sls_amt), slsAmtSum);
					}
					// 予算粗利進捗率
					if (hdrR.slo_bl_flg() && hdrR.sls_flg()) {
						calcRate(e3, _DTL_COL_NM[addMonth], ymL.sum(RsltR.$bdg_sls_prof_amt), ymL.sum(RsltR.$sum_prof_amt));
					}
					else if (hdrR.slo_bl_flg()) {
						calcRate(e3, _DTL_COL_NM[addMonth], ymL.sum(RsltR.$bdg_sls_prof_amt), ymL.sum(RsltR.$slo_bl_prof_amt));
					}
					else {
						calcRate(e3, _DTL_COL_NM[addMonth], ymL.sum(RsltR.$bdg_sls_prof_amt), ymL.sum(RsltR.$sls_prof_amt));
					}
					// 予算金額進捗率（受注）
					calcRate(e5, _DTL_COL_NM[addMonth], ymL.sum(RsltR.$bdg_sls_amt), ymL.sum(RsltR.$slo_amt));
					// 予算粗利進捗率（受注）
					calcRate(e6, _DTL_COL_NM[addMonth], ymL.sum(RsltR.$bdg_sls_prof_amt), ymL.sum(RsltR.$slo_prof_amt));
				}
				// 推移表示をする期間を過ぎたら何もしない
			}
		}
	}

	/**
	 * #C.RATEメタの百分率を計算します。
	 * 
	 * @param r ロウ
	 * @param rate_col 率のカラム
	 * @param d_col 分母の数量
	 * @param n_col 分子の数量
	 */
	protected void calcRate(MCRow r, String rate_col, MCNumber d, MCNumber n) {
		if (isNull(d) || d.isZero()) {
			return;
		}

		if (isNull(n) || d.isZero()) {
			// 分子がnull、または0の場合は0
			r.setNumberNE(rate_col, MCNumber.ZERO);
			return;
		}

		r.setNumberNE(rate_col, (n.multiply(100)).divide(d
				, mcframe.commonMA.meta.MA_META.PER.scale()
				, MAC_RND_TYP.RNDUP.toMC()));
	}

	/**
	 * 受注・売上・合計用のテーブルヘッダの名称、および、カラムの表示・非表示の設定を行う。<br/>
	 * 
	 * @param table ヘッダの名称、および、カラムの表示・非表示を設定するテーブル
	 */
	protected void setTblHdrSloSlsSum(MCTable<? extends MCConstRow> table, boolean itmGrpItmFlg) {

		// 対象テーブルの名称を取得する
		// (あとで、カラムの名称と合わせてカラムを取得するためのキーとする)
		String tblBasename = getTblBasename(table);

		// 受注を表示するカラムの設定
		MCColumnConfig sloConf = table.getColumnConfig(tblBasename + "slo");
		sloConf.setMode(MCMode.READ_ONLY);

		// 受注残を表示するカラムの設定
		MCColumnConfig sloBlConf = table.getColumnConfig(tblBasename + "slo_bl");
		sloBlConf.setMode(MCMode.READ_ONLY);

		// 売上を表示するカラムの設定
		MCColumnConfig slsConf = table.getColumnConfig(tblBasename + "sls");
		slsConf.setMode(MCMode.READ_ONLY);

		// 合計を表示するカラムの設定
		MCColumnConfig sumConf = table.getColumnConfig(tblBasename + "sum");
		sumConf.setMode(MCMode.READ_ONLY);

		// 計画を表示するカラムの設定
		MCColumnConfig splnConf = table.getColumnConfig(tblBasename + "spln");
		splnConf.setMode(MCMode.READ_ONLY);

		// 計画進捗率(受注)を表示するカラムの設定
		MCColumnConfig splnPerCmplSloConf = table.getColumnConfig(tblBasename + "spln_per_cmpl_slo");
		splnPerCmplSloConf.setMode(MCMode.READ_ONLY);

		// 計画進捗率を表示するカラムの設定
		MCColumnConfig splnPerCmplSlsConf = table.getColumnConfig(tblBasename + "spln_per_cmpl_sls");
		splnPerCmplSlsConf.setMode(MCMode.READ_ONLY);

		if (itmGrpItmFlg) {
			// 予算を表示するカラムの設定
			MCColumnConfig bdgSlsConf = table.getColumnConfig(tblBasename + "bdg_sls");
			bdgSlsConf.setMode(MCMode.INVISIBLE);

			// 予算進捗率（受注）を表示するカラムの設定
			MCColumnConfig bdgPerCmplSloConf = table.getColumnConfig(tblBasename + "bdg_per_cmpl_slo");
			bdgPerCmplSloConf.setMode(MCMode.INVISIBLE);

			// 予算進捗率を表示するカラムの設定
			MCColumnConfig bdgPerCmplSlsConf = table.getColumnConfig(tblBasename + "bdg_per_cmpl_sls");
			bdgPerCmplSlsConf.setMode(MCMode.INVISIBLE);
		}
		else {
			// 予算を表示するカラムの設定
			MCColumnConfig bdgSlsConf = table.getColumnConfig(tblBasename + "bdg_sls");
			bdgSlsConf.setMode(MCMode.READ_ONLY);

			// 予算進捗率（受注）を表示するカラムの設定
			MCColumnConfig bdgPerCmplSloConf = table.getColumnConfig(tblBasename + "bdg_per_cmpl_slo");
			bdgPerCmplSloConf.setMode(MCMode.READ_ONLY);

			// 予算進捗率を表示するカラムの設定
			MCColumnConfig bdgPerCmplSlsConf = table.getColumnConfig(tblBasename + "bdg_per_cmpl_sls");
			bdgPerCmplSlsConf.setMode(MCMode.READ_ONLY);
		}

		// 「年月」のカラムを非表示にする
		hideCols(table);
	}

	/**
	 * 受注・受注残・売上・合計・進捗率の値を設定する<br />
	 * 
	 * @param <D> 値を設定するテーブルの行の型
	 * @param downL 下り電文の売上集計結果
	 * @param dtlL 値を設定するテーブル
	 * @param dataTyp 下り電文の売上集計結果のうちどのデータタイプを設定するか
	 * @param qtyFlg 数量を表示するか。表示する場合true
	 * @param dstCols 設定先の項目名
	 * @param srcCols 設定元の項目名
	 */
	protected <D extends MCConstRow> void setDtlValueSloSlsSum(MCList<RsltR> downL, MCList<D> dtlL,
			String dataTyp, boolean qtyFlg, String[] dstCols, String[] srcCols) {

		// 以前のテーブルの値をクリアする
		dtlL.clear();

		// データタイプを元に、設定する値を下り電文の売上集計結果より取得する
		MCList<RsltR> rsltL = downL.subList(RsltR.$data_typ, dataTyp);
		MCList<RsltR>[] rsltLArr = rsltL.groupList(srcCols);

		for (MCList<RsltR> l : rsltLArr) {
			MCList<D> wk = dtlL.createInstance();

			RsltR orgR = l.get(0);

			int rowSortCol = 0;
			D r0 = dtlL.createRow();
			D r1 = dtlL.createRow();
			// 数量を設定する場合は1行目に数量を設定する
			if (qtyFlg) {
				// 数量を表す行の作成
				// キー項目の設定
				r0.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
				r0.setValue("row_title_nm", getDispString("qty"));
				MCNumber sloQty = l.sum(RsltR.$slo_qty);
				MCNumber sloBlQty = l.sum(RsltR.$slo_bl_qty);
				MCNumber slsQty = l.sum(RsltR.$sls_qty);
				MCNumber sumQty = l.sum(RsltR.$sum_qty);
				MCNumber splnQty = l.sum(RsltR.$spln_qty);
				MCNumber splnPerCmplSloQty = l.sum(RsltR.$spln_per_cmpl_slo_qty);
				MCNumber splnPerCmplSlsQty = l.sum(RsltR.$spln_per_cmpl_sum_qty);
				r0.setValue("slo", sloQty);
				r0.setValue("slo_bl", sloBlQty);
				r0.setValue("sls", slsQty);
				r0.setValue("sum", sumQty);
				r0.setValue("spln", splnQty);
				r0.setValue("base_unit_dec_place", orgR.getNumber("base_unit_dec_place"));
				r0.setValue("spln_per_cmpl_slo", splnPerCmplSloQty);
				r0.setValue("spln_per_cmpl_sls", splnPerCmplSlsQty);
				r0.setValue("rate_dec_place", orgR.getNumber("rate_dec_place"));
				setKeys(r0, orgR, srcCols);
				wk.add(r0);
			}

			// 金額を表す行の作成
			r1.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
			r1.setValue("row_title_nm", getDispString("amt"));
			MCNumber sloAmt = l.sum(RsltR.$slo_amt);
			MCNumber sloBlAmt = l.sum(RsltR.$slo_bl_amt);
			MCNumber slsAmt = l.sum(RsltR.$sls_amt);
			MCNumber sumAmt = l.sum(RsltR.$sum_amt);
			MCNumber splnAmt = l.sum(RsltR.$spln_amt);
			MCNumber bdgSlsAmt = l.sum(RsltR.$bdg_sls_amt);
			MCNumber splnPerCmplSloAmt = l.sum(RsltR.$spln_per_cmpl_slo_amt);
			MCNumber splnPerCmplSlsAmt = l.sum(RsltR.$spln_per_cmpl_sum_amt);
			MCNumber bgdPerCmplSloAmt = l.sum(RsltR.$bdg_per_cmpl_slo_amt);
			MCNumber bgdPerCmplSlsAmt = l.sum(RsltR.$bdg_per_cmpl_sum_amt);
			r1.setValue("slo", sloAmt);
			r1.setValue("slo_bl", sloBlAmt);
			r1.setValue("sls", slsAmt);
			r1.setValue("sum", sumAmt);
			r1.setValue("spln", splnAmt);
			r1.setValue("bdg_sls", bdgSlsAmt);
			r1.setValue("spln_per_cmpl_slo", splnPerCmplSloAmt);
			r1.setValue("spln_per_cmpl_sls", splnPerCmplSlsAmt);
			r1.setValue("bdg_per_cmpl_slo", bgdPerCmplSloAmt);
			r1.setValue("bdg_per_cmpl_sls", bgdPerCmplSlsAmt);
			r1.setValue("amt_dec_place", orgR.getNumber("amt_dec_place"));
			r1.setValue("rate_dec_place", orgR.getNumber("rate_dec_place"));
			setKeys(r1, orgR, srcCols);
			wk.add(r1);
			// 粗利を表す行の作成
			D r2 = dtlL.createRow();
			r2.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
			r2.setValue("row_title_nm", getDispString("prof_amt"));
			MCNumber sloProfAmt = l.sum(RsltR.$slo_prof_amt);
			MCNumber sloBlProfAmt = l.sum(RsltR.$slo_bl_prof_amt);
			MCNumber slsProfAmt = l.sum(RsltR.$sls_prof_amt);
			MCNumber sumProfAmt = l.sum(RsltR.$sum_prof_amt);
			MCNumber bdgSlsProfAmt = l.sum(RsltR.$bdg_sls_prof_amt);
			r2.setValue("slo", sloProfAmt);
			r2.setValue("slo_bl", sloBlProfAmt);
			r2.setValue("sls", slsProfAmt);
			r2.setValue("sum", sumProfAmt);
			r2.setValue("bdg_sls", bdgSlsProfAmt);
			r2.setValue("amt_dec_place", orgR.getNumber("amt_dec_place"));
			r2.setValue("rate_dec_place", orgR.getNumber("rate_dec_place"));
			setKeys(r2, orgR, srcCols);
			wk.add(r2);
			// 粗利率を表す行の作成
			D r3 = dtlL.createRow();
			r3.setValue("row_sort_col", MCNumber.valueOf(rowSortCol++));
			r3.setValue("row_title_nm", getDispString("prof_rate"));
			MCNumber sloProfRate = l.sum(RsltR.$slo_prof_rate);
			MCNumber sloBlProfRate = l.sum(RsltR.$slo_bl_prof_rate);
			MCNumber slsProfRate = l.sum(RsltR.$sls_prof_rate);
			MCNumber sumProfRate = l.sum(RsltR.$sum_prof_rate);
			MCNumber bdgSlsProfRate = l.sum(RsltR.$bdg_sls_prof_rate);
			r3.setValue("slo", sloProfRate);
			r3.setValue("slo_bl", sloBlProfRate);
			r3.setValue("sls", slsProfRate);
			r3.setValue("sum", sumProfRate);
			r3.setValue("bdg_sls", bdgSlsProfRate);
			r3.setValue("rate_dec_place", orgR.getNumber("rate_dec_place"));
			setKeys(r3, orgR, srcCols);
			wk.add(r3);

			// 最初の行にキー項目を設定
			if (!isNull(wk)) {
				wk.get(0).setValues(dstCols, orgR, srcCols);
				dtlL.addAll(wk);
			}
		}
	}

	// ------------その他共通処理--------------
	/**
	 * キー項目設定<br/>
	 * キー項目を裏項目として設定する。この値は、ソート時に使われる。
	 */
	protected <D extends MCConstRow> void setKeys(D row, RsltR rsltR, String[] srcCols ) {

		for (int i = 0; i < srcCols.length; i++) {
			row.setValueNE(srcCols[i] + _KEY_SUFFIX, rsltR.getValue(srcCols[i]));
		}
	}

	/**
	 * ＦＲＯＭ年月、ＴＯ年月をラベル用に編集する
	 * 
	 * @param fromYm
	 * @param toYm
	 * @return
	 */
	protected String editFromToYm(String fromYm, String toYm) {
		StringBuilder sb = new StringBuilder();
		sb.append(fromYm);
		sb.append(_EDIT_YM_LABEL);
		sb.append(toYm);
		return sb.toString();
	}

	/**
	 * 売上推移表示のフラグを元に売上表示期間の入力モードを設定する(部門別)
	 */
	protected void setSlsDispTermDMode() {

		if (getCndR().sls_trnst_disp_d()) {
			Cnd_sls_disp_term_d.setMode(MCMode.REQUIRED);
			Cnd_sum_term_d.setMode(MCMode.ENABLE);
		}
		else {
			Cnd_sls_disp_term_d.setMode(MCMode.READ_ONLY);
			Cnd_sum_term_d.setMode(MCMode.READ_ONLY);
			setValueEx(Cnd_sls_disp_term_d, null);
			setValueEx(Cnd_sum_term_d, null);
		}
	}

	/**
	 * 売上推移表示のフラグを元に売上表示期間の入力モードを設定する(品目体系別)
	 */
	protected void setSlsDispTermIGMode() {

		if (getCndR().sls_trnst_disp_ig()) {
			Cnd_sls_disp_term_ig.setMode(MCMode.REQUIRED);
			Cnd_sum_term_ig.setMode(MCMode.ENABLE);
		}
		else {
			Cnd_sls_disp_term_ig.setMode(MCMode.READ_ONLY);
			Cnd_sum_term_ig.setMode(MCMode.READ_ONLY);
			setValueEx(Cnd_sls_disp_term_ig, null);
			setValueEx(Cnd_sum_term_ig, null);
		}
	}

	@Override
	public void screenClearSetMode() {
		super.screenClearSetMode();
		setModeSuitedMainTab(MainTabTab.getSelectedComponent());
	}

	/**
	 * 売上集計照会の全てのテーブルを初期化する
	 */
	@Override
	public void screenClearBody() {

		super.screenClearBody();
		initTableDpt();
		initTableItmGrp();
	}

	/**
	 * 部門別のテーブルを初期化する
	 */
	protected void initTableDpt() {

		initTable(DptDtl1Table);
		initTable(DptDwDptTable);
		initTable(DptSlsUsrTable);
		initTable(DptCstTable);
	}

	/**
	 * 品目体系別のテーブルを初期化する
	 */
	protected void initTableItmGrp() {

		initTable(ItmGrpDtl1Table);
		initTable(ItmGrpDwItmGrpTable);
		initTable(ItmGrpItmTable);
		initTable(ItmGrpCstTable);
	}

	/**
	 * テーブルを初期化する<br/>
	 * 
	 * @param table 初期化するテーブル
	 */
	protected void initTable(MCTable<?> table) {

		table.clear();
		String tblBasename = getTblBasename(table);
		for (String col_name : _DTL_COL_NM) {
			MCColumnConfig conf = table.getColumnConfig(tblBasename + col_name);
			conf.setHeaderName("");
		}
	}

	/**
	 * テーブルの名称を取得する。<br/>
	 * この名称は、カラム名称と合わせて、カラムを取得するためのキーとして使われることを想定している
	 * 
	 * @param table 名称を取得するテーブル
	 * 
	 * @return テーブルの名称
	 */
	protected String getTblBasename(MCTable<?> table) {

		return table.getName().substring(0, table.getName().lastIndexOf("table"));
	}

	/**
	 * 「受注」、「売上」、「受注残」、「合計」、「予算」、「進捗率」を隠す
	 * 注：「受注」、「受注残」、「売上」、「合計」、「予算」、「進捗率」の場合は、以前に設定されたヘッダー名をクリアしない
	 * 
	 * @param table 「受注」、「受注残」、「売上」、「合計」、「予算」、「進捗率」を隠すテーブル
	 */
	protected void hideSloSlsSum(MCTable<?> table) {

		String tblBasename = getTblBasename(table);
		MCColumnConfig sloConf = table.getColumnConfig(tblBasename + "slo");
		sloConf.setMode(MCMode.INVISIBLE);
		MCColumnConfig sloBlConf = table.getColumnConfig(tblBasename + "slo_bl");
		sloBlConf.setMode(MCMode.INVISIBLE);
		MCColumnConfig slsConf = table.getColumnConfig(tblBasename + "sls");
		slsConf.setMode(MCMode.INVISIBLE);
		MCColumnConfig sumConf = table.getColumnConfig(tblBasename + "sum");
		sumConf.setMode(MCMode.INVISIBLE);
		MCColumnConfig splnConf = table.getColumnConfig(tblBasename + "spln");
		splnConf.setMode(MCMode.INVISIBLE);
		MCColumnConfig splnPerCmplSloConf = table.getColumnConfig(tblBasename + "spln_per_cmpl_slo");
		splnPerCmplSloConf.setMode(MCMode.INVISIBLE);
		MCColumnConfig splnPerCmplSlsConf = table.getColumnConfig(tblBasename + "spln_per_cmpl_sls");
		splnPerCmplSlsConf.setMode(MCMode.INVISIBLE);
		MCColumnConfig bdgSlsConf = table.getColumnConfig(tblBasename + "bdg_sls");
		bdgSlsConf.setMode(MCMode.INVISIBLE);
		MCColumnConfig bdgPerCmplSloConf = table.getColumnConfig(tblBasename + "bdg_per_cmpl_slo");
		bdgPerCmplSloConf.setMode(MCMode.INVISIBLE);
		MCColumnConfig bdgPerCmplSlsConf = table.getColumnConfig(tblBasename + "bdg_per_cmpl_sls");
		bdgPerCmplSlsConf.setMode(MCMode.INVISIBLE);
	}

	/**
	 * 「年月」のカラムを隠す<br/>
	 * 注：「年月」の場合は、以前に設定されたヘッダー名をクリアする
	 * 
	 * @param table 「年月」のカラムを隠すテーブル
	 */
	protected void hideCols(MCTable<?> table) {

		String tblBasename = getTblBasename(table);
		for (int colIdx = 0; colIdx < _DTL_COL_NM.length; colIdx++) {
			MCColumnConfig colConf = table.getColumnConfig(tblBasename + _DTL_COL_NM[colIdx]);
			colConf.setHeaderName("");
			colConf.setMode(MCMode.INVISIBLE);
		}
	}

	// ------------ステータス-------------------
	@Override
	public void setDPT_SRCHStatus() {

		super.setDPT_SRCHStatus();
		setSlsDispTermDMode();

		if (!isNull(getCndR().dpt_lvl_cd_d())) {
			Cnd_dpt_cd_d.setMode(MCMode.ENABLE);
			Cnd_dpt_nm_d.setMode(MCMode.ENABLE);
		}
	}

	@Override
	public void setDPT_REFStatus() {

		super.setDPT_REFStatus();
		setSlsDispTermDMode();

		// 表示制御
		if (getHdrR().sls_trnst_disp()) {
			Hdr_sls_flg.setMode(MCMode.REQUIRED);
			Hdr_slo_flg.setMode(MCMode.REQUIRED);
			Hdr_slo_bl_flg.setMode(MCMode.REQUIRED);
			Hdr_spln_flg.setMode(MCMode.REQUIRED);
			Hdr_bdg_flg.setMode(MCMode.REQUIRED);
			Hdr_spln_per_cmpl_sls_flg.setMode(MCMode.REQUIRED);
			Hdr_bdg_per_cmpl_sls_flg.setMode(MCMode.REQUIRED);
			Hdr_prof_amt_flg.setMode(MCMode.REQUIRED);
			Hdr_prof_rate_flg.setMode(MCMode.REQUIRED);
		}
		else {
			Hdr_sls_flg.setMode(MCMode.READ_ONLY);
			Hdr_slo_flg.setMode(MCMode.READ_ONLY);
			Hdr_slo_bl_flg.setMode(MCMode.READ_ONLY);
			Hdr_spln_flg.setMode(MCMode.READ_ONLY);
			Hdr_bdg_flg.setMode(MCMode.READ_ONLY);
			Hdr_spln_per_cmpl_sls_flg.setMode(MCMode.READ_ONLY);
			Hdr_bdg_per_cmpl_sls_flg.setMode(MCMode.READ_ONLY);
			Hdr_prof_amt_flg.setMode(MCMode.READ_ONLY);
			Hdr_prof_rate_flg.setMode(MCMode.READ_ONLY);
		}

		if (!isNull(getCndR().dpt_lvl_cd_d())) {
			Cnd_dpt_cd_d.setMode(MCMode.ENABLE);
			Cnd_dpt_nm_d.setMode(MCMode.ENABLE);
		}
	}

	@Override
	public void setITM_GRP_SRCHStatus() {

		super.setITM_GRP_SRCHStatus();
		setSlsDispTermIGMode();

		if (!isNull(getCndR().sls_itm_grp_lvl())) {
			Cnd_sls_itm_grp_cd_ig.setMode(MCMode.ENABLE);
			Cnd_sls_itm_grp_nm_ig.setMode(MCMode.ENABLE);
		}
	}

	@Override
	public void setITM_GRP_REFStatus() {

		super.setITM_GRP_REFStatus();
		setSlsDispTermIGMode();

		// 表示制御
		if (getItmGrpHdrR().sls_trnst_disp()) {
			ItmGrpHdr_sls_flg.setMode(MCMode.REQUIRED);
			ItmGrpHdr_slo_flg.setMode(MCMode.REQUIRED);
			ItmGrpHdr_slo_bl_flg.setMode(MCMode.REQUIRED);
			ItmGrpHdr_spln_flg.setMode(MCMode.REQUIRED);
			ItmGrpHdr_bdg_flg.setMode(MCMode.REQUIRED);
			ItmGrpHdr_spln_per_cmpl_sls_flg.setMode(MCMode.REQUIRED);
			ItmGrpHdr_bdg_per_cmpl_sls_flg.setMode(MCMode.REQUIRED);
			ItmGrpHdr_prof_amt_flg.setMode(MCMode.REQUIRED);
			ItmGrpHdr_prof_rate_flg.setMode(MCMode.REQUIRED);
		}
		else {
			ItmGrpHdr_sls_flg.setMode(MCMode.READ_ONLY);
			ItmGrpHdr_slo_flg.setMode(MCMode.READ_ONLY);
			ItmGrpHdr_slo_bl_flg.setMode(MCMode.READ_ONLY);
			ItmGrpHdr_spln_flg.setMode(MCMode.READ_ONLY);
			ItmGrpHdr_bdg_flg.setMode(MCMode.READ_ONLY);
			ItmGrpHdr_spln_per_cmpl_sls_flg.setMode(MCMode.READ_ONLY);
			ItmGrpHdr_bdg_per_cmpl_sls_flg.setMode(MCMode.READ_ONLY);
			ItmGrpHdr_prof_amt_flg.setMode(MCMode.READ_ONLY);
			ItmGrpHdr_prof_rate_flg.setMode(MCMode.READ_ONLY);
		}

		if (!isNull(getCndR().sls_itm_grp_lvl())) {
			Cnd_sls_itm_grp_cd_ig.setMode(MCMode.ENABLE);
			Cnd_sls_itm_grp_nm_ig.setMode(MCMode.ENABLE);
		}
	}

	// ------------CellConfig------------
	protected DtlConf createDtlConf() {

		return new DtlConf();
	}

	public class DtlConf extends MAUDP_CellConfig {
		protected MCNumberFormat _bigNumFormat = null;
		public void setBigNumFormat(MCNumberFormat f) {
			_bigNumFormat = f;
		}

		protected Color TITLE_COLOR = getPgmSettingColor(MSBBP_SlsSumSrch.class,
				"color", "cell", "title", "bg");

		protected Color REF_COLOR = getPgmSettingColor(MSBBP_SlsSumSrch.class,
				"color", "cell", "ref", "bg");

		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table,
				MCMode mode) {

			// 「表示名称ソート順」の値を元に背景色を決定する
			// 売上集計照会では全てのベーステーブルに「表示名称ソート順」がある前提
			MCConstRow r = table.getBaseTable().getRow(index);
			MCNumber rowSortCol = r.getNumber("row_sort_col");
			// キー単位の1行目の場合
			if (isSame(rowSortCol, MCNumber.ZERO)) {
				return TITLE_COLOR;
			}
			// それ以外の行の場合
			else {
				return REF_COLOR;
			}
		}

		@Override
		public MCNumberFormat getPriorNumberFormat(int index,
				MCColumnConfig column, MCTable table, MCMode mode) {
			// 金額用のセルの場合は特別なフォーマットを返す
			if (isAmtCell(index, column)) {
				return _bigNumFormat;
			}
			else {
				return super.getPriorNumberFormat(index, column, table, mode);
			}
		}

		@Override
		protected int getCustomLength(int index, MCColumnConfig column,
				MCTable table) {
			MCConstRow r = column.getBaseTable().getRow(index);
			if (isAmtCell(index, column)) {
				MCNumber dec_place = r.getNumber("amt_dec_place");
				return getAmtLength(column.getMeta(), dec_place);
			}
			if (isQtyCell(index, column)) {
				MCNumber dec_place = r.getNumber("base_unit_dec_place");
				return getQtyLength(column.getMeta(), dec_place);
			}
			if (isRateCell(index, column)) {
				MCNumber dec_place = r.getNumber("rate_dec_place");
				return getQtyLength(column.getMeta(), dec_place);
			}

			return super.getCustomLength(index, column, table);
		}

		protected int getAmtLength(MCMeta meta, MCNumber decPlace) {
			if (isNull(decPlace)) {
				return 0;
			}
			return meta.length() - meta.scale() + decPlace.intValue();
		}

		protected int getQtyLength(MCMeta meta, MCNumber decPlace) {
			if (isNull(decPlace)) {
				return 0;
			}
			return meta.length() - meta.scale() + decPlace.intValue();
		}

		@Override
		protected int getCustomScale(int index, MCColumnConfig column,
				MCTable table) {
			MCConstRow r = column.getBaseTable().getRow(index);
			if (isAmtCell(index, column)) {
				MCNumber dec_place = r.getNumber("amt_dec_place");
				return (isNull(dec_place)) ? 0 : dec_place.intValue();
			}
			if (isQtyCell(index, column)) {
				MCNumber dec_place = r.getNumber("base_unit_dec_place");
				return (isNull(dec_place)) ? 0 : dec_place.intValue();
			}
			if (isRateCell(index, column)) {
				MCNumber dec_place = r.getNumber("rate_dec_place");
				return (isNull(dec_place)) ? 0 : dec_place.intValue();
			}
			return super.getCustomScale(index, column, table);
		}

		/**
		 * 対象のセルが金額、粗利のセルかを判定する
		 * （同じセルが数量であることも金額であることもあるのでisAmtColumnをオーバライドすることはしない）
		 * 
		 * @param index テーブルの行
		 * @param column テーブルのカラムコンフィグ
		 * 
		 * @return 金額、粗利のセルの場合true
		 */
		protected boolean isAmtCell(int index, MCColumnConfig column) {
			MCConstRow r = column.getBaseTable().getRow(index);
			// 金額用の行以外はfalse
			if (!isSame(r.getString("row_title_nm"), getDispString("amt")) // 指定月表示/推移表示
					&& !isSame(r.getString("row_title_nm"), getDispString("slo")) // 指定月表示/推移表示
					&& !isSame(r.getString("row_title_nm"), getDispString("slo_bl")) // 指定月表示/推移表示
					&& !isSame(r.getString("row_title_nm"), getDispString("sls")) // 指定月表示/推移表示
					&& !isSame(r.getString("row_title_nm"), getDispString("prof_amt")) // 指定月表示/推移表示
					&& !isSame(r.getString("row_title_nm"), getDispString("slo_prof_amt")) // 指定月表示/推移表示
					&& !isSame(r.getString("row_title_nm"), getDispString("spln_amt")) // 指定月表示/推移表示
					&& !isSame(r.getString("row_title_nm"), getDispString("bdg_sls_amt")) // 推移表示
					&& !isSame(r.getString("row_title_nm"), getDispString("bdg_sls_prof_amt")) // 推移表示
					) {
				return false;
			}
			// 金額用の行かつ受注、売上、合計、予算、推移表示はtrue
			if (isNumCols(column)) {
				return true;
			}
			return false;
		}

		/**
		 * 対象のセルが数量のセルかを判定する
		 * （同じセルが数量であることも金額であることもあるのでisQtyColumnをオーバライドすることはしない）
		 * 
		 * @param index テーブルの行
		 * @param column テーブルのカラムコンフィグ
		 * 
		 * @return 数量のセルの場合true
		 */
		protected boolean isQtyCell(int index, MCColumnConfig column) {
			MCConstRow r = column.getBaseTable().getRow(index);
			// 数量用の行以外はfalse
			if (!isSame(r.getString("row_title_nm"), getDispString("qty")) // 指定月表示/推移表示
					&& !isSame(r.getString("row_title_nm"), getDispString("slo_qty")) // 指定月表示/推移表示
					&& !isSame(r.getString("row_title_nm"), getDispString("spln_qty")) // 推移表示
					&& !isSame(r.getString("row_title_nm"), getDispString("bdg_sls_qty")) // 推移表示
					) {
				return false;
			}
			// 数量用の行かつ受注、売上、合計、予算、推移表示はtrue
			if (isNumCols(column)) {
				return true;
			}

			return false;
		}

		/**
		 * 対象のセルが率のセルかを判定する
		 * （同じセルが数量であることも金額であることもあるのでisAmtColumnをオーバライドすることはしない）
		 * 
		 * @param index テーブルの行
		 * @param column テーブルのカラムコンフィグ
		 * 
		 * @return 率のセルの場合true
		 */
		protected boolean isRateCell(int index, MCColumnConfig column) {
			MCConstRow r = column.getBaseTable().getRow(index);
			// 進捗率列は行に関係なくtrue
			if (isSame(column.getBaseTableColumnName(), "bdg_per_cmpl_slo")
					|| isSame(column.getBaseTableColumnName(), "bdg_per_cmpl_sls")
					|| isSame(column.getBaseTableColumnName(), "spln_per_cmpl_slo")
					|| isSame(column.getBaseTableColumnName(), "spln_per_cmpl_sls")) {
				return true;
			}
			// 比率用の行以外はfalse
			if (!isSame(r.getString("row_title_nm"), getDispString("prof_rate"))
					&& !isSame(r.getString("row_title_nm"), getDispString("slo_prof_rate"))
					&& !isSame(r.getString("row_title_nm"), getDispString("bdg_sls_prof_rate"))
					&& !isSame(r.getString("row_title_nm"), getDispString("bdg_per_cmpl_slo_qty"))
					&& !isSame(r.getString("row_title_nm"), getDispString("bdg_per_cmpl_slo_amt"))
					&& !isSame(r.getString("row_title_nm"), getDispString("bdg_per_cmpl_sls_qty"))
					&& !isSame(r.getString("row_title_nm"), getDispString("bdg_per_cmpl_sls_amt"))
					&& !isSame(r.getString("row_title_nm"), getDispString("bdg_cmpl_sls_prof_amt"))
					&& !isSame(r.getString("row_title_nm"), getDispString("bdg_cmpl_slo_prof_amt"))
					&& !isSame(r.getString("row_title_nm"), getDispString("spln_per_cmpl_slo_qty"))
					&& !isSame(r.getString("row_title_nm"), getDispString("spln_per_cmpl_slo_amt"))
					&& !isSame(r.getString("row_title_nm"), getDispString("spln_per_cmpl_sls_qty"))
					&& !isSame(r.getString("row_title_nm"), getDispString("spln_per_cmpl_sls_amt"))
					) {
				return false;
			}
			// 比率用の行かつ受注、売上、合計、予算、推移表示はtrue
			if (isNumCols(column)) {
				return true;
			}
			return false;
		}

		/**
		 * 対象のカラムが受注、売上、合計、予算、推移表示のカラムかを判定する
		 * 
		 * @param column テーブルのカラムコンフィグ
		 * 
		 * @return 受注、売上、合計、予算、推移表示のカラムの場合true
		 */
		protected boolean isNumCols(MCColumnConfig column) {
			if (isSame(column.getBaseRowColumnName(), "slo") // 受注表示
					|| isSame(column.getBaseRowColumnName(), "slo_bl") // 受注残
					|| isSame(column.getBaseRowColumnName(), "sls") // 売上表示
					|| isSame(column.getBaseTableColumnName(), "sum") // 合計表示
					|| isSame(column.getBaseTableColumnName(), "spln") // 計画表示
					|| isSame(column.getBaseTableColumnName(), "bdg_sls") // 予算表示
					) {
				return true;
			}
			for (String colName : _DTL_COL_NM) {
				if (isSame(column.getBaseRowColumnName(), colName)) {
					return true;
				}
			}

			return false;
		}
	}

	// ------------イベント-----------
	@Override
	public void doMainTab_NC(MCEventInfo info) {

		super.doMainTab_NC(info);
		// タブの変更とともにモードを変更する
		Component newComponent = MainTabTab.getComponent(info.getNewIndex());
		setModeSuitedMainTab(newComponent);
	}

	protected void setModeSuitedMainTab(Component newComponent) {
		// 部門別
		if (newComponent == DptPanel) {
			if (isNull(getDptRsltL())) {
				setDPT_SRCHStatus();
			}
			else {
				setDPT_REFStatus();
			}
		}
		// 品目体系別
		else if (newComponent == ItmGrpPanel) {
			if (isNull(getItmGrpRsltL())) {
				setITM_GRP_SRCHStatus();
			}
			else {
				setITM_GRP_REFStatus();
			}
		}
	}

	/**
	 * 「部門別」タブの「売上推移表示」が変更されたとき、入力モードを設定する
	 * 
	 * @param info イベント情報
	 */
	@Override
	public void doCnd_sls_trnst_disp_d_NC(MCEventInfo info) {

		super.doCnd_sls_trnst_disp_d_NC(info);
		setSlsDispTermDMode();
	}

	/**
	 * 「品目体系別」タブの「売上推移表示」が変更されたとき、入力モードを設定する
	 * 
	 * @param info イベント情報
	 */
	@Override
	public void doCnd_sls_trnst_disp_ig_NC(MCEventInfo info) {

		super.doCnd_sls_trnst_disp_ig_NC(info);
		setSlsDispTermIGMode();
	}

	@Override
	public void doHdr_sls_flg_NC(MCEventInfo info) {
		doReviewDpt();
	}

	@Override
	public void doHdr_slo_flg_NC(MCEventInfo info) {
		doReviewDpt();
	}

	@Override
	public void doHdr_slo_bl_flg_NC(MCEventInfo info) {
		doReviewDpt();
	}

	@Override
	public void doHdr_spln_flg_NC(MCEventInfo info) {
		doReviewDpt();
	}

	@Override
	public void doHdr_bdg_flg_NC(MCEventInfo info) {
		doReviewDpt();
	}

	@Override
	public void doHdr_spln_per_cmpl_sls_flg_NC(MCEventInfo info) {
		doReviewDpt();
	}

	@Override
	public void doHdr_bdg_per_cmpl_sls_flg_NC(MCEventInfo info) {
		doReviewDpt();
	}

	@Override
	public void doHdr_prof_amt_flg_NC(MCEventInfo info) {
		doReviewDpt();
	}

	@Override
	public void doHdr_prof_rate_flg_NC(MCEventInfo info) {
		doReviewDpt();
	}

	protected void doReviewDpt() {
		if (isNull(getDptRsltL())) {
			return;
		}
		if (!getHdrR().sls_trnst_disp()) {
			return;
		}
		setDtl1();
		setDptDtl();
		setDptSlsUsr();
		setDptCst();

		sort(DptDtl1Table);
		DptDtl1Table.adjustWidth();
		DptDtl1Table.selectRowNoFocus(0);
		setDptDtlTable();
	}

	@Override
	public void doItmGrpHdr_sls_flg_NC(MCEventInfo info) {
		doReviewItmGrp();
	}

	@Override
	public void doItmGrpHdr_slo_flg_NC(MCEventInfo info) {
		doReviewItmGrp();
	}

	@Override
	public void doItmGrpHdr_slo_bl_flg_NC(MCEventInfo info) {
		doReviewItmGrp();
	}

	@Override
	public void doItmGrpHdr_spln_flg_NC(MCEventInfo info) {
		doReviewItmGrp();
	}

	@Override
	public void doItmGrpHdr_bdg_flg_NC(MCEventInfo info) {
		doReviewItmGrp();
	}

	@Override
	public void doItmGrpHdr_spln_per_cmpl_sls_flg_NC(MCEventInfo info) {
		doReviewItmGrp();
	}
	
	@Override
	public void doItmGrpHdr_bdg_per_cmpl_sls_flg_NC(MCEventInfo info) {
		doReviewItmGrp();
	}

	@Override
	public void doItmGrpHdr_prof_amt_flg_NC(MCEventInfo info) {
		doReviewItmGrp();
	}

	@Override
	public void doItmGrpHdr_prof_rate_flg_NC(MCEventInfo info) {
		doReviewItmGrp();
	}

	protected void doReviewItmGrp() {
		if (isNull(getItmGrpRsltL())) {
			return;
		}
		if (!getItmGrpHdrR().sls_trnst_disp()) {
			return;
		}
		setItmGrpDtl1();
		setItmGrpDtl();
		setItmGrpItm();
		setItmGrpCst();

		sort(ItmGrpDtl1Table);
		ItmGrpDtl1Table.adjustWidth();
		ItmGrpDtl1Table.selectRowNoFocus(0);
		setItmGrpDtlTable();
	}

	/**
	 * 指定部門売上情報の行を選択した時、それに紐付く売上情報を設定する
	 * 
	 * @param info イベント情報
	 */
	@Override
	public void doDptDtl1_NC(MCEventInfo info) {
		super.doDptDtl1_NC(info);
		setDptDtlTable();
	}

	protected void setDptDtlTable() {
		// 指定部門売上情報の選択された行を取得する
		Dtl1R dtl1R = DptDtl1Table.getSelectedMCRow();
		// 選択された行がない場合は売上情報をクリアする
		if (isNull(dtl1R)) {
			clear(getDptDwDptL());
			DptDwDptTable.adjustWidth();
			clear(getDptSlsUsrL());
			DptSlsUsrTable.adjustWidth();
			clear(getDptCstL());
			DptCstTable.adjustWidth();
			return;
		}

		// 指定部門売上情報の選択された行に紐付く下位部門別売上情報を設定する
		MCList<DptDtlR> dptDwDptL = getDptDwDptAllL().subList(
				getDtl1TableNCKeys(_DPT_KEY_COLS)
				, getDtl1TableNCVals(_DPT_KEY_COLS, dtl1R));
		setDptDwDptL(dptDwDptL);
		sort(DptDwDptTable);
		DptDwDptTable.adjustWidth();

		// 指定部門売上情報の選択された行に紐付く担当者別売上情報を設定する
		MCList<DptDtlR> dptSlsUsrL = getDptSlsUsrAllL().subList(
				getDtl1TableNCKeys(_DPT_KEY_COLS)
				, getDtl1TableNCVals(_DPT_KEY_COLS, dtl1R));
		setDptSlsUsrL(dptSlsUsrL);
		sort(DptSlsUsrTable);
		DptSlsUsrTable.adjustWidth();

		// 指定部門売上情報の選択された行に紐付く得意先別売上情報を設定する
		MCList<DptDtlR> dptCstL = getDptCstAllL().subList(
				getDtl1TableNCKeys(_DPT_KEY_COLS)
				, getDtl1TableNCVals(_DPT_KEY_COLS, dtl1R));
		setDptCstL(dptCstL);
		sort(DptCstTable);
		DptCstTable.adjustWidth();
	}

	/**
	 * 指定品目体系売上情報の行を選択した時、それに紐付く売上情報を設定する
	 * 
	 * @param info イベント情報
	 */
	@Override
	public void doItmGrpDtl1_NC(MCEventInfo info) {
		super.doItmGrpDtl1_NC(info);
		setItmGrpDtlTable();
	}

	protected void setItmGrpDtlTable() {
		// 指定品目体系売上情報の選択された行を取得する
		Dtl1R dtl1R = ItmGrpDtl1Table.getSelectedMCRow();
		// 選択された行がない場合は売上情報をクリアする
		if (isNull(dtl1R)) {
			clear(getItmGrpDwItmGrpL());
			ItmGrpDwItmGrpTable.adjustWidth();
			clear(getItmGrpCstL());
			ItmGrpCstTable.adjustWidth();
			return;
		}

		// 指定品目体系売上情報の選択された行に紐付く下位品目体系別売上情報を設定する
		MCList<ItmGrpDtlR> itmGrpDwItmGrpL = getItmGrpDwItmGrpAllL().subList(
				getDtl1TableNCKeys(_ITM_GRP_KEY_COLS)
				, getDtl1TableNCVals(_ITM_GRP_KEY_COLS, dtl1R));
		setItmGrpDwItmGrpL(itmGrpDwItmGrpL);
		sort(ItmGrpDwItmGrpTable);
		ItmGrpDwItmGrpTable.adjustWidth();

		// 指定品目体系売上情報の選択された行に紐付く品目別売上情報を設定する
		MCList<ItmGrpDtlR> itmGrpItmL = getItmGrpItmAllL().subList(
				getDtl1TableNCKeys(_ITM_GRP_KEY_COLS)
				, getDtl1TableNCVals(_ITM_GRP_KEY_COLS, dtl1R));
		setItmGrpItmL(itmGrpItmL);
		sort(ItmGrpItmTable);
		ItmGrpItmTable.adjustWidth();

		// 指定品目体系売上情報の選択された行に紐付く得意先別売上情報を設定する
		MCList<ItmGrpDtlR> itmGrpCstL = getItmGrpCstAllL().subList(
				getDtl1TableNCKeys(_ITM_GRP_KEY_COLS)
				, getDtl1TableNCVals(_ITM_GRP_KEY_COLS, dtl1R));
		setItmGrpCstL(itmGrpCstL);
		sort(ItmGrpCstTable);
		ItmGrpCstTable.adjustWidth();
	}

	protected String[] getDtl1TableNCKeys(String[] cols) {
		String[] ret = new String[cols.length];
		for (int i = 0; i < cols.length; i++) {
			ret[i] = cols[i] + _KEY_SUFFIX;
		}
		return ret;
	}

	protected Comparable<?>[] getDtl1TableNCVals(String[] cols, Dtl1R dtl1R) {
		Comparable<?>[] ret = new Comparable[cols.length];
		for (int i = 0; i < cols.length; i++) {
			ret[i] = dtl1R.getString(cols[i] + _KEY_SUFFIX);
		}
		return ret;
	}

	/**
	 * 部門別タブの金額単位を選択した時、金額単位の情報を_bigNumFormatに設定する
	 *
	 * @param info イベント情報
	 */
	@Override
	public void doHdr_big_num_rnd_typ_LC(MCEventInfo info){
		super.doHdr_big_num_rnd_typ_LC(info);

		MCBigNumberFormatInfo MNFinfo = null;
		if (!isNull(getHdrR().big_num_rnd_typ())) {
			MNFinfo = new MCBigNumberFormatInfo();
			MAC_BIG_NUM_RND_TYP typ = MAC_BIG_NUM_RND_TYP.get(getHdrR()
					.big_num_rnd_typ());
			MNFinfo.multiple(typ.multiple());
			MNFinfo.dec_place(typ.dec_place());
			MNFinfo.rounding_mode(MAC_RND_TYP.toMC(typ.rnd_typ()));
		}
		_bigNumFormat.setBigNumberFormatInfo(MNFinfo);
	}
	
	/**
	 * 品目体系別タブの金額単位を選択した時、金額単位の情報を_bigNumFormatに設定する
	 *
	 * @param info イベント情報
	 */
	@Override
	public void doItmGrpHdr_big_num_rnd_typ_nm_LC(MCEventInfo info){
		super.doItmGrpHdr_big_num_rnd_typ_nm_LC(info);

		MCBigNumberFormatInfo MNFinfo = null;
		if (!isNull(getItmGrpHdrR().big_num_rnd_typ())) {
			MNFinfo = new MCBigNumberFormatInfo();
			MAC_BIG_NUM_RND_TYP typ = MAC_BIG_NUM_RND_TYP.get(
					getItmGrpHdrR().big_num_rnd_typ());
			MNFinfo.multiple(typ.multiple());
			MNFinfo.dec_place(typ.dec_place());
			MNFinfo.rounding_mode(MAC_RND_TYP.toMC(typ.rnd_typ()));
		}
		_bigNumFormat.setBigNumberFormatInfo(MNFinfo);
	}

	/**
	 * 部門別タブの部門階層ＣＤを選択した時、部門ＣＤ、部門名を入力可にする
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_cd_d_LC(MCEventInfo info){
		super.doCnd_dpt_lvl_cd_d_LC(info);

		Cnd_dpt_cd_d.clear();
		Cnd_dpt_nm_d.clear();

		if (isNull(info.getNewValue())) {
			Cnd_dpt_cd_d.setMode(MCMode.READ_ONLY);
			Cnd_dpt_nm_d.setMode(MCMode.READ_ONLY);
		}
		else {
			Cnd_dpt_cd_d.setMode(MCMode.ENABLE);
			Cnd_dpt_nm_d.setMode(MCMode.ENABLE);
		}
	}

	/**
	 * 品目体系別タブの品目体系階層を選択した時、品目体系ＣＤ、品目体系名を入力可にする
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_lvl_LC(MCEventInfo info){
		super.doCnd_sls_itm_grp_lvl_LC(info);

		Cnd_sls_itm_grp_cd_ig.clear();
		Cnd_sls_itm_grp_nm_ig.clear();

		if (isNull(info.getNewValue())) {
			Cnd_sls_itm_grp_cd_ig.setMode(MCMode.READ_ONLY);
			Cnd_sls_itm_grp_nm_ig.setMode(MCMode.READ_ONLY);
		}
		else {
			Cnd_sls_itm_grp_cd_ig.setMode(MCMode.ENABLE);
			Cnd_sls_itm_grp_nm_ig.setMode(MCMode.ENABLE);
		}
	}

}