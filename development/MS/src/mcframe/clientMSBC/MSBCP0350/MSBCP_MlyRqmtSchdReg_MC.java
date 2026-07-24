package mcframe.clientMSBC.MSBCP0350;

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
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;

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
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.LinkedList;

import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.clientMAUC.MAUCP0180.MAUCP_VHMapper;
import mcframe.clientMAUD.MAUDP0010.IfVHMapperPanel;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientMAUC.MAUCP0110.MAUCP_UnitUtil;

import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBCP_MlyRqmtSchdReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_MlyRqmtSchdReg_MC extends MSBCP_MlyRqmtSchdReg_MC_A implements IfListRegPanel, IfVHMapperPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** 最大の表示期間 */
	protected static int _MAX_MONTH_DURATION = 60;
	/** 可変カラム列数  (QTY_00～QTY_60) */
	protected static int _RSLT_COL_NUM = 61;

	// Rsltテーブルのrow_title_colで使用するカラム名
	/** 合計数量 */
	protected static String _MPS_SUM_QTY = PlnR.$mps_sum_qty;
	/** 合計数量（前回） */
	protected static String _MPS_SUM_PRE_QTY = PlnR.$mps_sum_pre_qty;
	/** 月次計画数 */
	protected static String _QTY = PlnR.$qty;
	/** 月次計画数（前回） */
	protected static String _PRE_QTY = PlnR.$pre_qty;
	/** 日次生産依頼数 */
	protected static String _RQMT_QTY = PlnR.$rqmt_qty;
	/** 日次生産依頼数（確定済） */
	protected static String _FIX_RQMT_QTY = PlnR.$fix_rqmt_qty;
	/** 日次生産依頼数（未確定） */
	protected static String _NO_FIX_RQMT_QTY = PlnR.$no_fix_rqmt_qty;
	/** 実績数 */
	protected static String _ACT_QTY = PlnR.$act_qty;
	/** 検索時点の生産年月Ｆｒｏｍ */
	protected MCDate _fromYM = null;
	/** 検索時点の生産年月Ｔｏ */
	protected MCDate _toYM = null;
	/** 可変カラム名と年月のMap */
	protected Map<String, MCDate> _colMap = null;
	/** 可変カラムの配列 */
	protected MCColumnConfig[] _qtys = null;
	/** 可変カラムのカラム名配列 */
	protected String[] _qtyCols = null;
	/** 縦横変換処理のインスタンス */
	protected MAUCP_VHMapper<PlnR, RsltR> _vhM = new MAUCP_VHMapper<PlnR, RsltR>();

	protected HashMap<MCNumber, MCList<RsltR>> _grpNoHMap = new HashMap<>();
	protected HashMap<MCNumber, MCList<PlnR>> _grpNoVMap = new HashMap<>();
	protected HashMap<String, RsltR> _mpsGrpSumMap = new HashMap<>();
	protected HashMap<String, RsltR> _mpsGrpPreSumMap = new HashMap<>();

	//--------- 所要日付一覧テーブルの表示行操作用 ここから ----------//
	/** テーブル表示用の元データは、キャッシュとして保持する */
	protected MCList<RsltR> _cacheRsltAllL = MCList.create(RsltR.class);
	/** テーブル表示行チェックボックス切替用 */
	protected MCList<RsltR> _cacheRsltViewL = MCList.create(RsltR.class);

	protected LinkedList<String[]> _dispList = new LinkedList<String[]>();
	/** 画面表示切替<br>全表示用 */
	protected String[] _strDispAll = {_QTY, _PRE_QTY, _RQMT_QTY, _FIX_RQMT_QTY, _NO_FIX_RQMT_QTY, _ACT_QTY};
	/** 画面表示切替<br>chng0:基本表示用 */
	protected String[] _strDispChng0 = {_QTY};
	/** 画面表示切替<br>chng1:前回表示時追加項目 */
	protected String[] _strDispChng1 = {_PRE_QTY};
	/** 画面表示切替<br>chng2:日次生産依頼数表示時追加項目 */
	protected String[] _strDispChng2 = {_RQMT_QTY, _FIX_RQMT_QTY, _NO_FIX_RQMT_QTY};
	/** 画面表示切替<br>chng3:実績数表示時追加項目 */
	protected String[] _strDispChng3 = {_ACT_QTY};
	/** 表示切替ＦＬＧのカラム名 **/
	protected String[] _strCtrlFlgStr = {CndR.$disp_pre_flg, CndR.$disp_rqmt_flg, CndR.$disp_act_flg};
	/** 画面表示切替<br>グループの最終行にNull行を追加するかどうか */
	protected boolean _addNullRowAtEnd = false;

	//--------- 所要日付一覧テーブルの表示行操作用 ここまで ----------//

	protected MCIndexKey _idxKey = null;
	/** グルーピングのセルの色 */
	protected Color _mps_hdr_color = getPgmSettingColorNE(this, new Color(255,255,255), "color.grp_hdr");
	/** MPS合計のセルの色 */
	protected Color _mps_sum_color = getPgmSettingColorNE(this, new Color(224,255,255), "color.mps_sum");
	/** MPS合計（前回）のセルの色 */
	protected Color _mps_sum_pre_color = getPgmSettingColorNE(this, new Color(255,250,205), "color.mps_sum_pre");
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_MlyRqmtSchdReg_MC() {
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
	public MSBCP_MlyRqmtSchdReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBCL0350_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0350_Srch02Caller<P extends MSBCP_MlyRqmtSchdReg, B extends MS_MSBCL0350_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {


		protected MS_MSBCL0350_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getRsltL());
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			if (!isNull(getCndR().prod_ym_fr()) && (!isNull(getCndR().prod_ym_to()))) {
				int pt = (int) getCndR().prod_ym_to().addMonth(1)
						.diffMonth(getCndR().prod_ym_fr());
				if (!isNull(pt) && pt > _MAX_MONTH_DURATION) {
					MCMessage msg = new MCMessage(getCndR(), CndR.$prod_ym_fr, MSUCP0002);
					msgList.add(msg);
				}
			}
		}

		@Override
		protected void show() {
			super.show();
			setRslt();
		}

		@Override
		protected void setMode() {
			super.setMode();
			setTblHdr();
			RsltTable.adjustWidth();
			setREFStatus();
			RsltTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			clearTblHdr();
			setREFStatus();
		}

		@Override
		protected void clear() {
			super.clear();
			// テーブルヘッダ(日付ラベル)をクリア
			clearTblHdr();
			// 日付ラベルのマップをクリア
			if (_colMap != null) {
				_colMap.clear();
			}
			_mpsGrpSumMap.clear();
			_mpsGrpPreSumMap.clear();
			_cacheRsltAllL.clear();
			_cacheRsltViewL.clear();
			_vhM.getCachedHAllL().clear();
			_idxKey = null;
		}

	}


	/**
	 * [MS_MSBCL0350_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0350_Srch01Caller<P extends MSBCP_MlyRqmtSchdReg, B extends MS_MSBCL0350_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL0350_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getRsltL());
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			if (!isNull(getCndR().prod_ym_fr()) && (!isNull(getCndR().prod_ym_to()))) {
				int pt = (int) getCndR().prod_ym_to().addMonth(1)
						.diffMonth(getCndR().prod_ym_fr());
				if (!isNull(pt) && pt > _MAX_MONTH_DURATION) {
					MCMessage msg = new MCMessage(getCndR(), CndR.$prod_ym_fr, MSUCP0002);
					msgList.add(msg);
				}
			}
		}

		@Override
		protected void show() {
			super.show();
			setRslt();
		}

		@Override
		protected void setMode() {
			super.setMode();
			setTblHdr();
			RsltTable.adjustWidth();
			setUPDStatus();
			Ctrl_ctrl_PPanel.expand(false);
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			clearTblHdr();
			setREFStatus();
		}

		@Override
		protected void clear() {
			super.clear();
			// テーブルヘッダ(日付ラベル)をクリア
			clearTblHdr();
			// 日付ラベルのマップをクリア
			if (_colMap != null) {
				_colMap.clear();
			}
			_mpsGrpSumMap.clear();
			_mpsGrpPreSumMap.clear();
			_cacheRsltAllL.clear();
			_cacheRsltViewL.clear();
			_vhM.getCachedHAllL().clear();

			_idxKey = null;
		}

	}


	/**
	 * [MS_MSBCL0350_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0350_Upd01Caller<P extends MSBCP_MlyRqmtSchdReg, B extends MS_MSBCL0350_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MCList<PlnR> _PlnLForCall;

		protected MS_MSBCL0350_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			initCallerSub();
		}

		protected void initCallerSub() {
			_PlnLForCall = getCheckedPlnL();
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up0().setAll(_PlnLForCall);
		}

		@Override
		protected void setMode() {
			super.setMode();
			setFIX_UStatus();
		}

		/** 選択チェックオン行に紐づく縦リストを作成する */
		protected MCList<PlnR> getCheckedPlnL() {
			MCList<PlnR> l = MCList.create(PlnR.class);
			for (RsltR h : (MCList<RsltR>)getCheckedRows(panel)) {
				MCList<PlnR> vL = _grpNoVMap.get(h.grp_peg_no());
				for (PlnR v : vL.subList(Status.MODIFY)) {
					if (v.prod_ym().gte(v.ym())) {
						// 既存行は数量0は削除行に、それ以外は変更行とする
						if (!isNull(v.upd_cntr())) {
							if (isSame(v.qty(), MCNumber.ZERO)) {
								v.setStatus(Status.DELETE);
								l.add(v);
							}
							else {
								l.add(v);
							}
						}
						// 既存行でない場合は、数量0以外を新規行とする
						else {
							if (!isSame(v.qty(), MCNumber.ZERO)) {
								v.setStatus(Status.CREATE);
								l.add(v);
							}
						}
					}
				}
			}
			return l;
		}
	}

	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		if (isSrch01()) {
			callMS_MSBCL0350_Srch01();
		}
		else if (isSrch02()) {
			callMS_MSBCL0350_Srch02();
		}
	}

	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		setCheckToRsltL(true);
	}

	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		setCheckToRsltL(false);
	}

	protected void setCheckToRsltL(boolean sts) {
		for (RsltR rslt : RsltTable.getViewRows()) {
			if (isSame(rslt.row_title_col(), _QTY)) {
				setValueEx(columnRslt_check, rslt.getGUIIndex(), sts);
			}
		}
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBCL0350_Upd01();
	}

	protected boolean isSrch01() {
		if (Cnd_ope_UPD.isSelected()) {
			return true;
		}
		return false;
	}
	
	protected boolean isSrch02() {
		if (Cnd_ope_REF.isSelected()) {
			return true;
		}
		return false;
	}

	/** 明細のデータ項目の配列を返します */
	protected MCColumnConfig[] getQtys() {

		if (_qtys == null) {
			_qtys = new MCColumnConfig[] {
					columnRslt_qty_00, columnRslt_qty_01, columnRslt_qty_02,
					columnRslt_qty_03, columnRslt_qty_04, columnRslt_qty_05,
					columnRslt_qty_06, columnRslt_qty_07, columnRslt_qty_08,
					columnRslt_qty_09, columnRslt_qty_10, columnRslt_qty_11,
					columnRslt_qty_12, columnRslt_qty_13, columnRslt_qty_14,
					columnRslt_qty_15, columnRslt_qty_16, columnRslt_qty_17,
					columnRslt_qty_18, columnRslt_qty_19, columnRslt_qty_20,
					columnRslt_qty_21, columnRslt_qty_22, columnRslt_qty_23,
					columnRslt_qty_24, columnRslt_qty_25, columnRslt_qty_26,
					columnRslt_qty_27, columnRslt_qty_28, columnRslt_qty_29,
					columnRslt_qty_30, columnRslt_qty_31, columnRslt_qty_32,
					columnRslt_qty_33, columnRslt_qty_34, columnRslt_qty_35,
					columnRslt_qty_36, columnRslt_qty_37, columnRslt_qty_38,
					columnRslt_qty_39, columnRslt_qty_40, columnRslt_qty_41,
					columnRslt_qty_42, columnRslt_qty_43, columnRslt_qty_44,
					columnRslt_qty_45, columnRslt_qty_46, columnRslt_qty_47,
					columnRslt_qty_48, columnRslt_qty_49, columnRslt_qty_50,
					columnRslt_qty_51, columnRslt_qty_52, columnRslt_qty_53,
					columnRslt_qty_54, columnRslt_qty_55, columnRslt_qty_56,
					columnRslt_qty_57, columnRslt_qty_58, columnRslt_qty_59,
					columnRslt_qty_60
			};
		}
		return _qtys;
	}

	/** 項目名の配列を返します */
	protected String[] getColnm() {
		if (_qtyCols == null) {
			_qtyCols = new String[] {
					RsltR.$qty_00, RsltR.$qty_01, RsltR.$qty_02, RsltR.$qty_03,
					RsltR.$qty_04, RsltR.$qty_05, RsltR.$qty_06, RsltR.$qty_07,
					RsltR.$qty_08, RsltR.$qty_09, RsltR.$qty_10, RsltR.$qty_11,
					RsltR.$qty_12, RsltR.$qty_13, RsltR.$qty_14, RsltR.$qty_15,
					RsltR.$qty_16, RsltR.$qty_17, RsltR.$qty_18, RsltR.$qty_19,
					RsltR.$qty_20, RsltR.$qty_21, RsltR.$qty_22, RsltR.$qty_23,
					RsltR.$qty_24, RsltR.$qty_25, RsltR.$qty_26, RsltR.$qty_27,
					RsltR.$qty_28, RsltR.$qty_29, RsltR.$qty_30, RsltR.$qty_31,
					RsltR.$qty_32, RsltR.$qty_33, RsltR.$qty_34, RsltR.$qty_35,
					RsltR.$qty_36, RsltR.$qty_37, RsltR.$qty_38, RsltR.$qty_39,
					RsltR.$qty_40, RsltR.$qty_41, RsltR.$qty_42, RsltR.$qty_43,
					RsltR.$qty_44, RsltR.$qty_45, RsltR.$qty_46, RsltR.$qty_47,
					RsltR.$qty_48, RsltR.$qty_49, RsltR.$qty_50, RsltR.$qty_51,
					RsltR.$qty_52, RsltR.$qty_53, RsltR.$qty_54, RsltR.$qty_55,
					RsltR.$qty_56, RsltR.$qty_57, RsltR.$qty_58, RsltR.$qty_59,
					RsltR.$qty_60
			};
		}
		return _qtyCols;
	}

	// ------------オープン時の処理実装------------

	@Override
	protected void valueInit() {
		super.valueInit();
		
		MCDate toDay = getToday();
		setValueEx(Cnd_ym, toDay.trunc(MCDate.MONTH));
		setValueEx(Cnd_prod_ym_fr, toDay.trunc(MCDate.MONTH));

	}

	// init-parts
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltConf());
	}

	@Override
	protected void setupParts() {
		Rslt_sum_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_00_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_01_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_02_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_03_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_04_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_05_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_06_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_07_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_08_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_09_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_10_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_11_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_12_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_13_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_14_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_15_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_16_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_17_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_18_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_19_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_20_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_21_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_22_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_23_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_24_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_25_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_26_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_27_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_28_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_29_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_30_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_31_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_32_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_33_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_34_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_35_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_36_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_37_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_38_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_39_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_40_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_41_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_42_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_43_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_44_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_45_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_46_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_47_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_48_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_49_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_50_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_51_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_52_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_53_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_54_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_55_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_56_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_57_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_58_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_59_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
		Rslt_qty_60_p_PPanel.setRelateBeans(columnRslt_unit_cd, columnRslt_dec_place);
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		for (MCColumnConfig c : getQtys()) {
			c.addLCListener(this);
		}
	}

	@Override
	protected void listInit() {

		super.listInit();

		// 縦横変換クラスの初期化
		_vhM.initColGroup(this, RsltTable, getPlnL());
		_vhM.initColInfo(MCList.create(MCRow.class));

		// ラベル２の設定
		LinkedHashMap<String, String> rowTitleMap = new LinkedHashMap<String, String>();
		rowTitleMap.put(_QTY, getDispString(_QTY));
		rowTitleMap.put(_PRE_QTY, getDispString(_PRE_QTY));
		rowTitleMap.put(_RQMT_QTY, getDispString(_RQMT_QTY));
		rowTitleMap.put(_FIX_RQMT_QTY, getDispString(_FIX_RQMT_QTY));
		rowTitleMap.put(_NO_FIX_RQMT_QTY, getDispString(_NO_FIX_RQMT_QTY));
		rowTitleMap.put(_ACT_QTY, getDispString(_ACT_QTY));
		rowTitleMap.put(null, null);
		_vhM.setRowTitles(rowTitleMap);

		// 画面表示切替用List
		_dispList.add(0, _strDispAll);
		_dispList.add(1, _strDispChng0);
		_dispList.add(2, _strDispChng1);
		_dispList.add(3, _strDispChng2);
		_dispList.add(4, _strDispChng3);

		// n番目のチェックボックスの選択によって、dispListのn + 2番目の要素の項目の表示・非表示を切り替える
		MCCheckBox[] checkBox = new MCCheckBox[] {
				Cnd_disp_pre_flg, Cnd_disp_rqmt_flg, Cnd_disp_act_flg
		};
		// 縦横変換クラスに設定する
		_vhM.setDispInfo(checkBox, _dispList);
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		clearContainers(getRsltL(), getPlnL());
		clearCacheVH();
		clearTblHdr();
		
		setSrchStatus();
	}

	protected void clearCacheVH() {
		// 可変カラムのラベル名とメッセージ用名称をクリアする
		_vhM.initColInfo(MCList.create(MCRow.class));
		_vhM.clearElmColsLabel();
		
		// 縦横変換クラスの横テーブルの表示用リストのキャッシュをクリアする
		_vhM.clearCachedList();

		// グループ取得用のキャッシュをクリアする
		_grpNoHMap.clear();
		_grpNoVMap.clear();
		_mpsGrpSumMap.clear();
		_mpsGrpPreSumMap.clear();
		
		if (_colMap != null) {
			_colMap.clear();
		}
		_cacheRsltAllL.clear();
		_cacheRsltViewL.clear();
		_vhM.getCachedHAllL().clear();

		_idxKey = null;
		
		
	}

	protected void setSrchStatus() {
		// 検索前ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
			CndPanel.focusFirstComponent();

			RsltTable.setStatusColumnVisible(false);
		}
		else if (Cnd_ope_REF.isSelected()) {
			setValueEx(Cnd_ym, null);
			setREFStatus();
			RsltTable.setStatusColumnVisible(false);
		}

		// 操作種別変更時や検索前ステータスでは、検索枠を表示する
		Ctrl_ctrl_PPanel.expand(true);
	}

	// ------------その他共通処理------------

	/**
	 * テーブルヘッダ名を設定する
	 */
	protected void setTblHdr() {
		int cnt = (int) getCndR().prod_ym_to().addMonth(1)
				.diffMonth(getCndR().prod_ym_fr());
		MCDate dispDt = getCndR().prod_ym_fr();

		for (MCColumnConfig col : getQtys()) {
			if (cnt > 0) {
				col.setHeaderName(toY2MString(dispDt));
				col.setMessageName(toYMString(dispDt));
				col.setMode(MCMode.READ_ONLY);

				dispDt = dispDt.addMonth(1);
			}
			else {
				col.setMode(MCMode.INVISIBLE);
			}
			cnt--;
		}
	}

	/**
	 * テーブルヘッダ(日付ラベル)をクリアする
	 */
	protected void clearTblHdr() {
		for (MCColumnConfig col : getQtys()) {
			col.setHeaderName("");
		}
	}

	/**
	 * 検索結果を明細にコピーする(PlnL → コピ → RsltL)
	 */
	protected void setRslt() {

		// 計画品目のグループを識別する番号を設定する
		showVHEditVList();

		// VListの変換対象カラム(col_00～)の設定
		_colMap = createCol();

		// 縦横処理実行

		MCList<MCRow> ymList = MCList.create(MCRow.class);
		_fromYM = getCndR().prod_ym_fr();
		_toYM = getCndR().prod_ym_to();

		MCDate ym = _fromYM;
		long pym = _toYM.diffMonth(ym) + 1;

		for (int i = 0; i < pym; i++) {
			MCRow ymR = ymList.createRow();
			MCDate tmpYM = ym.addMonth(i);

			// 可変カラムを識別するための値を設定する
			ymR.setDateNE(PlnR.$prod_ym, tmpYM);
			// 可変カラムのラベル名を設定する	
			ymR.setStringNE(MAUCP_VHMapper.ELM_LABEL, toYMString(tmpYM));

			// 可変カラムのメッセージ用名称を設定する（未設定時はラベル名がメッセージ用名称となる）		
			ymR.setStringNE(MAUCP_VHMapper.ELM_MSG, toYMString(tmpYM));

			ymList.add(ymR);
		}

		_vhM.initColInfo(ymList);

		_vhM.convertVH(getPlnL(), _vhM.getCachedHAllL());

		crtGrpNoHCache(_vhM.getCachedHAllL());

		setRsltView(_cacheRsltViewL, _vhM.getCachedHAllL());

		_vhM.doTableDispChange();

		crtMpsGrpSumMap();
		setDisp();

		// 各合計値計算(横集計)処理
		calcHSum(_vhM.getCachedHAllL());

	}

	protected void showVHEditVList() {
		MCNumber grpPegNo = MCNumber.ZERO;
		for (MCList<PlnR> l : getPlnL().groupList(getGrpPegNoKeys())) {
			grpPegNo = grpPegNo.add(1);
			for (PlnR r : l) {
				r.grp_peg_no(grpPegNo);
			}
			_grpNoVMap.put(grpPegNo, l);
		}

	}

	protected String[] getGrpPegNoKeys() {
		return new String[] {
				PlnR.$mps_grp_cd, PlnR.$strg_loc_cd, PlnR.$wg_cd, PlnR.$mfg_loc_cd, PlnR.$sppl_cd,
				PlnR.$rqst_loc_cd, PlnR.$proc_cd, PlnR.$itm_cd, PlnR.$itm_sub1, PlnR.$itm_sub2,
				PlnR.$itm_sub3
		};
	}

	protected void crtGrpNoHCache(MCList<RsltR> hList) {
		MCSortPolicy sp = crtSortVH();
		for (MCList<RsltR> l : hList.groupList(RsltR.$grp_peg_no)) {
			l.sort(sp);
			_grpNoHMap.put(l.get(0).grp_peg_no(), l);
		}
	}

	protected MCSortPolicy crtSortVH() {
		MCSortPolicy sp = new MCSortPolicy();
		sp.add(SortType.ASC, RsltR.$grp_peg_no);
		sp.add(SortType.ASC, RsltR.$mps_grp_cd);
		sp.add(SortType.ASC, RsltR.$strg_loc_cd);
		sp.add(SortType.ASC, RsltR.$itm_cd);
		sp.add(SortType.ASC, RsltR.$itm_sub1);
		sp.add(SortType.ASC, RsltR.$itm_sub2);
		sp.add(SortType.ASC, RsltR.$itm_sub3);

		return sp;
	}

	/**
	 * RsltL用のカラム(qty_??)を計画開始月、計画期間に応じて日付とセットで
	 * 必要な分だけ動的に作成する
	 * 
	 * @return colMap(HashMap)
	 */
	protected Map<String, MCDate> createCol() {
		Map<String, MCDate> colMap = new HashMap<String, MCDate>();
		MCDate dt = getCndR().prod_ym_fr();
		int pt = (int) getCndR().prod_ym_to().addMonth(1)
				.diffMonth(getCndR().prod_ym_fr());

		for (int i = 0; i < pt; i++) {
			colMap.put(getQtys()[i].getBaseRowColumnName(), dt.addMonth(i));
		}

		return colMap;
	}

	/**
	 * 各合計値計算(横集計)処理を行う<br>
	 * 横集計：各Rowの横方向の集計計算<br>
	 * 
	 * @param viewL ：合計計算の基となるリスト
	 */
	protected void calcHSum(MCList<RsltR> viewL) {
		// 横集計処理
		_vhM.calcHSum(viewL, new String[0]);
	}

	protected void crtMpsGrpSumMap() {
		for (RsltR r : _cacheRsltViewL) {
			if (isSame(r.row_title_col(), _QTY)) {
				RsltR sumR = getSumMpsGrpRow(r, PlnR.$mps_sum_qty, _mpsGrpSumMap);
				sumMpsGrp(sumR, r);
			}
			else if (isSame(r.row_title_col(), _PRE_QTY)) {
				RsltR preSumR = getSumMpsGrpRow(r, PlnR.$mps_sum_pre_qty, _mpsGrpPreSumMap);
				sumMpsGrp(preSumR, r);
			}
		}
	}
	
	protected RsltR getSumMpsGrpRow(RsltR r, String row_title_col, Map<String, RsltR> map) {
		RsltR sumR = map.get(r.mps_grp_cd());
		if (sumR == null) {
			sumR = RsltR.create();
			sumR.mps_grp_cd(r.mps_grp_cd());
			sumR.mps_grp_nm(r.mps_grp_nm());
			sumR.row_title_col(row_title_col);
			sumR.row_title_nm(getDispString(row_title_col));
			sumR.record_grp_id(MCNumber.TEN);
			sumR.record_id(MCNumber.TEN);
			map.put(r.mps_grp_cd(), sumR);
		}
		return sumR;
	}

	protected void sumMpsGrp(RsltR sumR, RsltR addR) {
		for (int i = 0; i < _RSLT_COL_NUM; i++) {
			sumR.setNumber(getColnm()[i], MCNumber.sum(sumR.getNumber(getColnm()[i]), addR.getNumber(getColnm()[i])));
		}
	}
	/**
	 * 情報をテーブルに表示する<br>
	 * フォーカスは考慮しない
	 */
	protected void setDisp() {
		MCList<RsltR> tmpL = MCList.create(RsltR.class);

		// 画面表示するRowの取得
		String[] strDisp = getDispString(_dispList, getCndR(), _strCtrlFlgStr,
				_addNullRowAtEnd);

		// 画面表示切替用matcher
		DispMatcher<RsltR> dispMatcher = crtDispMatcher(strDisp);

		// 画面表示切替
		tmpL.setAll(_cacheRsltViewL.subList(dispMatcher));
		tmpL.sort(RsltR.$mps_grp_cd, RsltR.$record_grp_id, RsltR.$record_id);

		getRsltL().setAll(addParmGrpRow(tmpL));

		// 画面表示名称のセット
		//setRsltDispNm();
		// ソート
		sort(RsltTable);
	}

	/**
	 * ＭＰＳ集計行を追加する
	 * ※ソート後実行
	 * @param rsltL
	 */
	protected MCList<RsltR> addParmGrpRow(MCList<RsltR> rsltL) {
		MCList<RsltR> newRsltL = MCList.create(RsltR.class);
		if (!rsltL.isEmpty()) {
			String pre = rsltL.get(0).mps_grp_cd();
			for (RsltR r : rsltL) {
				String cur = r.mps_grp_cd();
				if (!isSame(pre, cur)) {
					// 合計行の追加
					newRsltL.add(_mpsGrpSumMap.get(pre));
					if (getCndR().disp_pre_flg()) {
						newRsltL.add(_mpsGrpPreSumMap.get(pre));
					}
					pre = cur;
				}
				newRsltL.add(r);
			}
			// 合計行の追加
			newRsltL.add(_mpsGrpSumMap.get(pre));
			if (getCndR().disp_pre_flg()) {
				newRsltL.add(_mpsGrpPreSumMap.get(pre));
			}
		}
		return newRsltL;
	}

	/**
	 * 表示切替条件で_cacheRsltAllLの値を_cacheRsltViewLに反映する
	 * 
	 * @param viewL
	 * @param allL
	 */
	protected void setRsltView(MCList<RsltR> viewL, MCList<RsltR> allL) {
		viewL.setAll(allL);
	}

	// - SORT ------------------------------------//

	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		// 縦横変換クラスのソート処理を呼び出す	
		if (table == RsltTable) {
			return _vhM.sortHTable(policy);
		}
		return super.sort(table, policy);
	}

	// ------------CellConfig------------
	protected MCCellConfig createRsltConf() {
		return new RsltConf();
	}

	public class RsltConf extends MAUDP_CellConfig {

		@SuppressWarnings("unchecked")
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			// UPDの場合のみ設定
			if (getStatus() != UPD) {
				return MCMode.READ_ONLY;
			}

			// 該当の明細を取得
			RsltR r = getRsltL().get(index);
			
			if (column == columnRslt_check) {
				if (isSame(r.row_title_col(), _QTY)) {
					return MCMode.REQUIRED;
				}
				else {
					return MCMode.READ_ONLY;
				}
			}

			// 「月次生産計画」の行以外はデフォルトのまま
			if (!isSame(r.row_title_col(), _QTY)) {
				return MCMode.READ_ONLY;
			}

			// 数量以外のカラムはデフォルトのまま
			if (!isQtyColumn(column)) {
				return MCMode.READ_ONLY;
			}

			if (isAftrPlnYmMons(column, r)) {
				return MCMode.ENABLE;
			}
			return MCMode.READ_ONLY;
		}

		@Override
		protected boolean isQtyColumn(MCColumnConfig column) {
			if (column.getBaseRowColumnName().startsWith("qty_")) {
				return true;
			}
			else {
				return super.isQtyColumn(column);
			}
		}

		/**
		 * 計画月度以降判定
		 * 
		 * 対象のセルが計画月度以降かを判定します
		 * 
		 * @param column 判定対象のセル
		 * @param rsltR 判定対象の行
		 * 
		 * @return 計画月度以降の場合、true
		 */
		protected boolean isAftrPlnYmMons(MCColumnConfig column, RsltR rsltR) {
			// 対象のカラム名を取得
			String activeColNm = column.getBaseRowColumnName();// col_??
			// 選択中のセルの日付
			MCDate activeDt = _colMap.get(activeColNm);
			// 非表示のセルは確定期間の範囲外
			if (activeDt == null) {
				return false;
			}
			// 計画月度
			MCDate stDt = rsltR.ym();

			if (activeDt.gte(stDt)) {
				return true;
			}

			return false;
		}

		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			RsltR r = (RsltR) table.getBaseTable().getRow(index);

			if (isSame(r.row_title_col(), _MPS_SUM_QTY)) {
				//合計行
				return _mps_sum_color;
			}
			if (isSame(r.row_title_col(), _MPS_SUM_PRE_QTY)) {
				//合計（前回）行
				return _mps_sum_pre_color;
			}
			if (isGrpHdr(column) || isNull(r.unit_cd())) {
				//MPSグループヘッダ行
				return _mps_hdr_color;
			}
			return super.getPriorBG(index, column, table, mode);
		}

		protected boolean isGrpHdr(MCColumnConfig column) {
			return column == columnRslt_mps_grp_cd ||column == columnRslt_mps_grp_nm
					|| column == columnRslt_strg_loc_cd || column == columnRslt_strg_loc_nm 
					|| column == columnRslt_proc_cd || column == columnRslt_proc_nm
					|| column == columnRslt_itm_cd || column == columnRslt_itm_sub1
					|| column == columnRslt_itm_sub2 || column == columnRslt_itm_sub3
					|| column == columnRslt_itm_nm || column == columnRslt_row_title_nm
					|| column == columnRslt_unit_cd || column == columnRslt_unit_nm;
		}

		@Override
		public Boolean getPriorReverseFG(int index, MCColumnConfig column,
				MCTable<?> table, MCMode mode) {
			RsltR row = (RsltR) table.getBaseTable().getRow(index);
			if (!isSame(row.row_title_col(), _QTY) && !getCndR().disp_key_flg()) {
				if (column == columnRslt_itm_cd || column == columnRslt_itm_sub1
						|| column == columnRslt_itm_sub2 || column == columnRslt_itm_sub3
						|| column == columnRslt_itm_nm
						|| column == columnRslt_mps_grp_cd || column == columnRslt_mps_grp_nm
						|| column == columnRslt_strg_loc_cd || column == columnRslt_strg_loc_nm
						|| column == columnRslt_wg_cd
						|| column == columnRslt_mfg_loc_cd || column == columnRslt_mfg_loc_nm
						|| column == columnRslt_sppl_cd || column == columnRslt_sppl_nm
						|| column == columnRslt_rqst_loc_cd || column == columnRslt_rqst_loc_nm
						|| column == columnRslt_proc_cd || column == columnRslt_proc_nm
						|| column == columnRslt_unit_cd || column == columnRslt_unit_nm) {

					return true;
				}
			}
			return null;
		}
	}

	// ------------ステータス制御------------
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		CndPanel.focusFirstComponent();
		// 横テーブルの利用する可変カラムをENABLEにする。利用しない可変カラムをINVISIBLEにする。
		_vhM.setUsedElmColumnMode(MCMode.ENABLE);
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		RsltTable.selectLeftmostColumn(0);

		// 横テーブルの利用する可変カラムをENABLEにする。利用しない可変カラムをINVISIBLEにする。
		_vhM.setUsedElmColumnMode(MCMode.ENABLE);

	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		CndPanel.focusFirstComponent();

		// 横テーブルの利用する可変カラムをREAD_ONLYにする。利用しない可変カラムをINVISIBLEにする。
		_vhM.setUsedElmColumnMode(MCMode.READ_ONLY);

	}

	// ------------ListChanged------------
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		// 変更を確認するセルの指定
		if (MCCollectionUtil.contains(lc, getQtys())) {
			// NULLチェック
			doNullChkOfPlnQtyLC((MCColumnConfig) lc, info);
			// 変更値を電文コンテナにコピー
			doHVCopy(lc, info);
		}
		// 上記以外の場合はsuperを呼ぶ
		super.doLCEvent(lc, info);
	}

	/**
	 * テーブル変更値のNullチェック
	 */
	protected void doNullChkOfPlnQtyLC(MCColumnConfig column, MCEventInfo info) {
		RsltR r = RsltTable.getSelectedMCRow();
		if (isNull(r)) {
			return;
		}

		if (isSame(r.row_title_col(), _QTY)) {
			MCNumber qty = (MCNumber) info.getNewValue();
			if (isNull(qty)) {
				r.setNumber(column.getBaseRowColumnName(), MCNumber.ZERO);
			}
		}
	}

	/**
	 * リアルタイムで、テーブルに入力された値をSQL用ブロックにコピーする。 <br>
	 * RsltL(テーブル表示用ブロック) → コピー → PlnL(SQL用ブロック)<br>
	 */
	protected void doHVCopy(MCLCBeans nc, MCEventInfo info) {
		// 編集されたCellのカラム名の取得
		MCColumnConfig conf = (MCColumnConfig) info.getComponent();
		String editHCol = conf.getBaseRowColumnName();

		// 編集されたRowの取得
		RsltR editHRow = getRsltL().get(conf.getTable().getMCSelectedRow());

		// HListの編集されたCellの情報を、VListに反映する
		_vhM.reflectHV(getPlnL(), editHRow, editHCol);

		// 横再集計処理
		// 値が代入されたcellが属するRowの横再集計処理( 代入されたcellが属するRowと、それに対応する合計行のRow)
		_vhM.calcHSum(getRsltL(), editHRow);
		doCalcSum(editHRow, conf);
	}
	protected void doCalcSum(RsltR editHRow, MCColumnConfig conf) {
		String mpsGrpCd = editHRow.mps_grp_cd();
		String col = conf.getBaseRowColumnName();
		
		MCNumber sumQty = MCNumber.ZERO;
		for (RsltR r : getRsltL()) {
			if (isSame(r.mps_grp_cd(), mpsGrpCd) && isSame(r.row_title_col(), PlnR.$qty)) {
				sumQty = MCNumber.sum(sumQty, r.getNumber(col));
			}
		}
		
		RsltR sumR = _mpsGrpSumMap.get(mpsGrpCd);
		if (sumR != null) {
			sumR.setNumber(col, sumQty);
		}
	}

	// ------------Notification Change------------

	/**
	 * 実績数表示・非表示ＦＬＧのイベント
	 */
	@Override
	public void doCnd_disp_act_flg_NC(MCEventInfo info) {
		super.doCnd_disp_act_flg_NC(info);
		if (getRsltL().isEmpty()) {
			return;
		}
		dispChng();
	}

	/**
	 * 前回表示・非表示ＦＬＧのイベント
	 */
	@Override
	public void doCnd_disp_pre_flg_NC(MCEventInfo info) {
		super.doCnd_disp_pre_flg_NC(info);
		if (getRsltL().isEmpty()) {
			return;
		}
		dispChng();
	}

	/**
	 * 日次生産依頼表示・非表示ＦＬＧのイベント
	 */
	@Override
	public void doCnd_disp_rqmt_flg_NC(MCEventInfo info) {
		super.doCnd_disp_rqmt_flg_NC(info);
		if (getRsltL().isEmpty()) {
			return;
		}
		dispChng();
	}

	/**
	 * 表示区分の状況で表示内容を切り替える
	 */
	protected void dispChng() {
		RsltR beforR = RsltTable.getSelectedMCRow();

		setDisp();

		setFocus(beforR);

		RsltTable.adjustWidth();
	}

	/**
	 * 表示切替した際のテーブルフォーカスの設定
	 * @param beforeR 表示切替前に選択中のRow
	 */
	protected void setFocus(RsltR beforeR) {
		// 本画面は元の選択Rowに関わらず最上位行を選択することにする（最初のセル）
		if (getRsltL().isEmpty()) {
			return;
		}
		RsltTable.selectLeftmostColumn(0);
	}

	// ------------vhM------------
	@Override
	public void screenClearBody() {
		super.screenClearBody();

		_vhM.initColInfo(MCList.create(MCRow.class));
		// 可変カラムのラベル名とメッセージ用名称をクリアする
		_vhM.clearElmColsLabel();
	}

	@Override
	protected void tableInit() {
		super.tableInit();

		// テーブルソート用Utilityクラスの設定

		// キー列（disp_00）以外のソートを無効にする			
		for (MCColumnConfig c : RsltTable.getColumnConfigs()) {
			if (!c.equals(columnRslt_disp_00)) {
				c.setSortable(false);
			}
		}
	}

	@Override
	protected void customVisibleColumnConfigs(MCTable table, String type,
			Set<MCColumnConfig> confSet) {
		super.customVisibleColumnConfigs(table, type, confSet);

		if (type == COLUMN_WIDTH_PANEL) {
			confSet.addAll(Arrays.asList(getQtys()));
		}
	}

	@Override
	protected void setSortColumn() {
		super.setSortColumn();

		// キー列（disp_00）をソート対象にする
		RsltTable.addSortColumn(columnRslt_disp_00, SortType.ASC);
	}

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig config = super.createFXBAP_PopupConfig(beans);

		// 横テーブルの「ソート順変更」を無効にする	
		if (beans == RsltTable) {
			config.ignoreSortOrder(true);
		}
		return config;
	}

	// mcframe.clientFXUC.FXUCP0190.FXUCP_VHPanelBaseインターフェースの実装	
	@Override
	public boolean sortHTable(MCTable<?> table, MCSortPolicy policy) {
		// テーブルのソート処理。縦横変換クラスから呼び出される。
		return super.sort(table, policy);
	}

	// mcframe.clientFXUC.FXUCP0190.FXUCP_VHPanelBaseインターフェースの実装	
	@Override
	public void elmColValueChanged(MCConstRow row, MCColumnConfig column) {
		_vhM.calcHSum(getRsltL(), (RsltR) row);
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	* 処理対象RowのRowTitleColが渡される文字列に含まれる場合はtrueを返す
	*/
	public <R extends MCConstRow> DispMatcher<R> crtDispMatcher(String[] str) {
		return new DispMatcher<R>(str);
	}

	public class DispMatcher<R extends MCConstRow> implements MCRowMatcher<R> {
		protected String[] _str;

		public DispMatcher(String[] str) {
			_str = str;
		}

		public boolean match(R r) {
			for (String s : _str) {
				if (isSame(r.getStringNE("row_title_col"), s)) {
					return true;
				}
			}
			return false;
		}
	}

	/**
	* ヘッダフラグの条件に応じて、画面表示するRowのrow_title_colの配列を返す<br>
	* 
	* @param list 画面表示切替用のString[]が格納されたList<br>
	* List[0]：画面全表示用<br>
	* List[1]：画面基本表示用<br>
	* List[2～]：画面ヘッダFLG切替用(可変長可)<br> 
	* @param hdrR MCRow
	* @param hdrFlgs String[]
	* @return strDisp String[] 
	*/
//public static String[] getDispStrArray(LinkedList<String[]> list, MCRow hdrR,
//String[] hdrFlgs, boolean booNullRow) {
//return getDispString(list, hdrR, hdrFlgs, booNullRow);
//}

	protected String[] getDispString(LinkedList<String[]> list, MCRow hdrR,
			String[] hdrFlgs, boolean booNullRow) {

		int flgCnt = hdrFlgs.length;

// [1] 引数の取込
// Listの取得
		String[] strDispAll = list.get(0);// 全表示用
		String[] strDispChng0 = list.get(1);// 基本表示用

// [2] 画面表示するRow数の取得
		int len = strDispChng0.length;

// strDispChgの可変長部分
		for (int i = 0; i < flgCnt; i++) {

			boolean boo = hdrR.getBooleanNE(hdrFlgs[i]);
			if (boo) {
				len = len + list.get(i + 2).length;
			}
		}

// 最終行のNull行
		if (booNullRow) {
			len++;
		}

// [3] strDisp(戻り)に値をセット
		String[] strDisp = new String[len];
		int cnt = 0;

// 全表示でループ
		for (String s : strDispAll) {

			int end = 0;

// 基本表示
			for (String s0 : strDispChng0) {
				if (isSame(s, s0)) {
					strDisp[cnt] = s;
					cnt++;
					end++;
					break;
				}
			}

			if (end != 0) continue;

// strDispChngの可変長部分
			for (int i = 0; i < flgCnt; i++) {

				boolean boo = hdrR.getBooleanNE(hdrFlgs[i]);
				if (boo) {

					for (String s1 : list.get(i + 2)) {
						if (isSame(s, s1)) {
							strDisp[cnt] = s;
							cnt++;
							end++;
							break;
						}
					}
				}
				if (end != 0) break;
			}
			if (end != 0) continue;
		}

// 最終行のNull行
		if (booNullRow) {
			strDisp[len - 1] = null;
		}

		return strDisp;

	}

}