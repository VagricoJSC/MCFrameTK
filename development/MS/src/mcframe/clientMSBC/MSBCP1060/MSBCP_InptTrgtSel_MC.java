package mcframe.clientMSBC.MSBCP1060;

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
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP0350.*;
import mcframe.clientMAUB.MAUBP0370.*;
import mcframe.clientMAUB.MAUBP0440.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5290.*;
import mcframe.clientMSUB.MSUBP0020.*;
import mcframe.clientMSUB.MSUBP5020.*;

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
import mcframe.clientMSUD.MSUDP0030.*;
import mcframe.clientMSUD.MSUDP0030.IfInptTrgtSelBase.GetStkPartsInfo;
import java.util.Map;
import java.util.LinkedHashMap;
import mcframe.clientMSBC.MSBCP1010.DtlInptR;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBCP_InptTrgtSel"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_InptTrgtSel_MC extends MSBCP_InptTrgtSel_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/** 呼び出し元画面（キャッシュ用） */
	protected String _openTyp = null;
	/** 呼び出し元から渡された検索条件（キャッシュ用） */
	protected MCRow _bind = null;
	/** 呼び出し元から渡されたその他パラメータ（キャッシュ用） */
	protected Object[] _args = null;
	/** 呼び出し元へ戻すデータ（チェックオンとなる選択行） */
	protected MCList<MCRow> _inptList = null;
	/** 呼び出し元へ戻すデータ（既存の行に反映となる選択行） */
	protected MCList<MCRow> _inptUpdList = null;
	/** 呼び出し元へ戻すデータ（行追加して反映となる選択行） */
	protected MCList<MCRow> _inptInsList = null;
	/** 呼び出し元へ戻すデータ（行削除となる行） */
	protected MCList<MCRow> _inptDelList = null;

	protected IfInptTrgtSelBase _target_panel = null;

	protected MCRootPanel _parts = null;

	protected String _ope_val = null;

	protected boolean _isDCEvent = false;

	/**
	 * 一時カラム（更新対象になる優先度）
	 */
	public static final String PRIORITY = "priority";

	/**
	 * 一時カラム（既に更新対象になっているかどうかのＦＬＧ）
	 */
	public static final String UPD_FLG = "upd_flg";

	/**
	 * 一時カラム（更新対象になった行の画面上の行位置）
	 */
	public static final String INDEX = "index";

	/**
	 * 初期値設定対象の検索項目
	 */
	protected Map<String, MCRowBeans> _init_val_beans = null;

	/**
	 * 入力制御対象の検索項目
	 */
	protected Map<String, MCModeBeans> _ctrl_mode_beans = null;
	protected Map<String, MCModeBeans> _ctrl_mode_beans_tgt = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_InptTrgtSel_MC() {
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
	public MSBCP_InptTrgtSel_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBCL1060_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1060_Srch01Caller<P extends MSBCP_InptTrgtSel, B extends MS_MSBCL1060_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL1060_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);

			checkChkBoxStatus(msgList);
			checkDateBeforeAfter(msgList);
		}

		protected void checkChkBoxStatus(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(QualityPanel));
			msgList.addAll(checkAtLeastOne(StkInspPanel));
			msgList.addAll(checkAtLeastOne(StkIDPanel));
			msgList.addAll(checkAtLeastOne(PlntAprvStsPanel));
			msgList.addAll(checkAtLeastOne(MrktJudgStsPanel));
		}

		protected void checkDateBeforeAfter(MCMessageList msgList) {
			msgList.addAll(checkBeforeAfter(Cnd_vld_dt_fr, Cnd_vld_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_lmt_dt_fr, Cnd_lmt_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_first_gr_dt_fr, Cnd_first_gr_dt_to));
			msgList.addAll(checkBeforeAfter(Cnd_schd_dt_fr, Cnd_schd_dt_to));
		}

		@Override
		protected void clear() {
			super.clear();

			getInfoR().clear();
		}

		@Override
		protected void show() {
			super.show();

			IfInptTrgtSelBase p = getTargetPanel();
			// 製造指図登録画面の選択行の情報
			MCRow mfgInstRegDtlInptSelR = p.getInptTable(_parts).getSelectedMCRow();

			// 製造指図登録画面の投入予定テーブルとのマッチング
			MCList<?> tblL = MCList.create(DtlInptR.class);
			tblL = matchMfgInstRegDtlInptL(tblL);

			setValueEx(Info_itm_cd, mfgInstRegDtlInptSelR.getStringNE(DtlInptR.$itm_cd));
			setValueEx(Info_itm_sub1, mfgInstRegDtlInptSelR.getStringNE(DtlInptR.$itm_sub1));
			setValueEx(Info_itm_sub2, mfgInstRegDtlInptSelR.getStringNE(DtlInptR.$itm_sub2));
			setValueEx(Info_itm_sub3, mfgInstRegDtlInptSelR.getStringNE(DtlInptR.$itm_sub3));
			setValueEx(Info_itm_nm, mfgInstRegDtlInptSelR.getStringNE(DtlInptR.$itm_nm));

			if (mfgInstRegDtlInptSelR.getBoolean(DtlInptR.$cont_fctr_flg)) {
				setValueEx(Info_std_cont_fctr, mfgInstRegDtlInptSelR.getNumberNE(DtlInptR.$std_cont_fctr));
				setValueEx(Info_std_cont_fctr_unit_cd, mfgInstRegDtlInptSelR.getStringNE(DtlInptR.$cont_fctr_unit_cd));
				setValueEx(Info_act_cont_fctr_unit_cd, mfgInstRegDtlInptSelR.getStringNE(DtlInptR.$cont_fctr_unit_cd));

				// 標準有効成分を設定
				setValueEx(Info_std_cont_qty, tblL.sum(DtlInptR.$cont_inpt_qty));
				// 基準単位標準投入数量を算出
				setValueEx(Info_base_unit_std_inpt_qty, convToBaseUnitFromContFctrUnit(
						Info_std_cont_qty.getValue(),
						Info_std_cont_fctr.getValue(),
						mfgInstRegDtlInptSelR.getNumberNE(DtlInptR.$base_unit_dec_place),
						mfgInstRegDtlInptSelR.getStringNE(DtlInptR.$base_unit_rnd_typ)));

				// 検索直後の実際有効成分は0を設定
				setValueEx(Info_act_cont_qty, MCNumber.ZERO);
			}
		}

		@Override
		protected void setMode() {
			super.setMode();

			RsltTable.selectLeftmostColumn(0);
			Ctrl_ctrl_PPanel.expand(false);

			// 「反映する」ボタンの制御
			setMeRgstBtnMode();
			// 一覧を集計タブの設定に合わせて制御する
			changeAggrItemsDisp();
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();

			FoldTab.focusActiveFirstComponent();
			Ctrl_ctrl_PPanel.expand(true);

			// 「反映する」ボタンの制御
			setMeRgstBtnMode();
		}
	}

	/**
	 * Panel[Cnd]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doCnd_select_all(MCEventInfo info) {
		setInitCndDisp(true);
	}
	/**
	 * Panel[Cnd]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_deselect_all(MCEventInfo info) {
		setInitCndDisp(false);
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBCL1060_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[rgst]の押下時の処理
	 */
	@Override
	public void doBtn_rgst(MCEventInfo info) {
		MCMessageList msgList = new MCMessageList();
		if (isCommittableInptTrgtData(msgList)) {
			InfoR r = getInfoR();
			
			// 標準有効成分と実際有効成分が異なる場合、確認を出す
			if (!isSame(r.std_cont_qty(), r.act_cont_qty())) {
				MCMessage msgExecConfirm = new MCMessage(MSBCP1023);
				
				// 確認の結果によって処理を継続する
				if (confirm(msgExecConfirm) == MCMessageBox.YES_OPTION) {
					doCommitAction();
				}
			}
			else {
				doCommitAction();
			}
		}
		else {
			message(msgList);
		}
	}
	
	protected boolean isCommittableInptTrgtData(MCMessageList msgList) {
		// 選択行の取得
		createInptList();
		if (getInptList().isEmpty()) {
			return false;
		}

		String ope = null;
		if (Cnd_ope_ADD.isSelected()) {
			ope = IfInptTrgtSelBase.OPE_INS;
		}
		else if (Cnd_ope_UPD.isSelected()) {
			ope = IfInptTrgtSelBase.OPE_UPD;
		}
		IfInptTrgtSelBase p = getTargetPanel();
		if (p == null) {
			return false;
		}

		return p.isCommittableInptTrgtData(ope, getInptList(), msgList);
	}

	/**
	 * 一覧の選択行から呼び出し元画面へ返すリストを生成する。
	 */
	protected void createInptList() {
		initInptList();
		initInptInsList();
		initInptUpdList();
		initInptDelList();
		if (_isDCEvent) {
			createInptRow(RsltTable.getSelectedMCRow());
		}
		else {
			for (RsltR row : getRsltL()) {
				if (row == null || !row.check()) {
					continue;
				}
				createInptRow(row);
			}
		}
	}

	protected MCList<MCRow> getInptList() {
		return _inptList;
	}

	protected void initInptInsList() {
		_inptInsList = MCList.create(MCRow.class);
	}

	protected void addInptInsList(MCRow r) {
		_inptInsList.add(r);
	}

	protected MCList<MCRow> getInptInsList() {
		return _inptInsList;
	}

	protected void initInptUpdList() {
		_inptUpdList = MCList.create(MCRow.class);
	}

	protected void addInptUpdList(MCRow r) {
		_inptUpdList.add(r);
	}

	protected MCList<MCRow> getInptUpdList() {
		return _inptUpdList;
	}

	protected void initInptDelList() {
		_inptDelList = MCList.create(MCRow.class);
	}

	protected void addInptDelList(MCRow r) {
		_inptDelList.add(r);
	}

	protected MCList<MCRow> getInptDelList() {
		return _inptDelList;
	}

	protected void initInptList() {
		_inptList = MCList.create(MCRow.class);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_ITM_CD);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_ITM_SUB1);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_ITM_SUB2);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_ITM_SUB3);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_ITM_NM);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_VER_NO);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_LOT_NO);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_SUBLOT_NO);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_BP_LOT_NO);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_LOC_CD);
		_inptList.addBooleanColumn(IfInptTrgtSelBase.INPT_STR_LN_CD_NONE_FLG);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_STR_LN_CD);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_LG_GRP_CD);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_ALLOC_GRP_CD);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_GD_CD);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_IN_XFR_TYP);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_QUALITY_TYP);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_STK_INSP_TYP);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_SNO1);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_SNO2);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_SNO3);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_SNO4);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_STK_ID_TYP);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_STK_BP_CD);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_ASST_TYP);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_FIX_NO_TYP);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_FIX_NO);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_STK_ARRV_BP_CD);
		_inptList.addNumberColumn(IfInptTrgtSelBase.INPT_PACK_STK_QTY);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_PACK_UNIT_CD);
		_inptList.addNumberColumn(IfInptTrgtSelBase.INPT_BASE_STK_QTY);
		_inptList.addStringColumn(IfInptTrgtSelBase.INPT_BASE_UNIT_CD);
	}

	protected void createInptRow(RsltR row) {
		MCRow tmp = _inptList.createRow();

		tmp.setStringNE(IfInptTrgtSelBase.INPT_ITM_CD, row.itm_cd());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_ITM_SUB1, row.itm_sub1());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_ITM_SUB2, row.itm_sub2());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_ITM_SUB3, row.itm_sub3());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_ITM_NM, row.itm_nm());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_VER_NO, row.ver_no());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_LOT_NO, row.lot_no());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_SUBLOT_NO, row.sublot_no());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_BP_LOT_NO, row.bp_lot_no());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_LOC_CD, row.loc_cd());
		tmp.setBooleanNE(IfInptTrgtSelBase.INPT_STR_LN_CD_NONE_FLG, row.str_ln_cd_none_flg());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_STR_LN_CD, row.str_ln_cd());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_LG_GRP_CD, row.lg_grp_cd());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_ALLOC_GRP_CD, row.alloc_grp_cd());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_GD_CD, row.gd_cd());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_IN_XFR_TYP, row.in_xfr_typ());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_QUALITY_TYP, row.quality_typ());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_STK_INSP_TYP, row.stk_insp_typ());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_SNO1, row.sno1());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_SNO2, row.sno2());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_SNO3, row.sno3());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_SNO4, row.sno4());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_STK_ID_TYP, row.stk_id_typ());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_STK_BP_CD, row.stk_bp_cd());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_ASST_TYP, row.asst_typ());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_FIX_NO_TYP, row.fix_no_typ());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_FIX_NO, row.fix_no());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_STK_ARRV_BP_CD, row.stk_arrv_bp_cd());
		tmp.setNumberNE(IfInptTrgtSelBase.INPT_PACK_STK_QTY, row.pack_unit_qty());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_PACK_UNIT_CD, row.pack_unit_cd());
		tmp.setNumberNE(IfInptTrgtSelBase.INPT_BASE_STK_QTY, row.base_unit_qty());
		tmp.setStringNE(IfInptTrgtSelBase.INPT_BASE_UNIT_CD, row.base_unit_cd());

		tmp.setAttributes(row);

		getInptList().add(tmp);
	}

	/**
	 * 呼び出し元画面へ選択行のデータを設定する。
	 */
	protected void doCommitAction() {
		setUpdInsDelList();

		updateTable();

		setBtn_rgstMode();

		requestCloseWindow();
	}

	/**
	 * 選択行のデータをもとに、以下の通りリストに分ける。<br>
	 * ・既存の行に反映するもの<br>
	 * ・行追加して反映するもの<br>
	 * ・行削除するもの
	 */
	protected void setUpdInsDelList() {
		IfInptTrgtSelBase p = getTargetPanel();

		// 製造指図登録画面の投入予定テーブルの情報
		MCList<?> mfgInstRegDtlInptL = p.getInptTable(_parts).getList();

		// 既に更新対象になっているかどうかのＦＬＧを追加
		mfgInstRegDtlInptL.addBooleanColumn(UPD_FLG, false);

		// 製造指図登録画面の投入予定テーブルとのマッチング
		MCList<?> tblL = MCList.create(DtlInptR.class);
		tblL = matchMfgInstRegDtlInptL(tblL);

		// 反映する優先度は次の通り
		// 既存行(行ステータス：更新)
		// 既存行(行ステータス：なし)
		// 追加行(行ステータス：新規)
		// 優先度を意味する一時カラムを追加し、ソートすることで実現する。
		tblL.addNumberColumn(PRIORITY);
		for (MCRow tblR : tblL) {
			if (isSame(tblR.getStatus(), MCRow.MODIFY)) {
				tblR.setNumber(PRIORITY, 0);
			}
			else if (isSame(tblR.getStatus(), MCRow.NONE)) {
				tblR.setNumber(PRIORITY, 1);
			}
			else if (isSame(tblR.getStatus(), MCRow.CREATE)) {
				tblR.setNumber(PRIORITY, 2);
			}
		}
		tblL.sort(SortType.ASC, PRIORITY);

		// チェックオンの選択行と製造指図登録画面の投入予定を比較
		// 一致する行があったら更新用リスト(_inptUpdList)
		// 一致する行がなかったら追加用リスト(_inptInsList)に振り分け
		for (MCRow data : getInptList()) {

			// 該当する投入予定のテーブルに更新対象になっていない行が存在しない場合、行追加して反映するリストに振り分け
			if (tblL.subList(UPD_FLG, false).isEmpty()) {
				addInptInsList(data);
			}
			// 該当する投入予定のテーブルに更新対象になっていない行が存在する場合、反映する行のインデックスを追加し、既存の行に反映するリストに振り分け
			else {
				MCRow tgtR = tblL.subList(UPD_FLG, false).get(0);
				data.addNumberColumn(INDEX, MCNumber.valueOf(tgtR.getGUIIndex()));
				tgtR.setBoolean(UPD_FLG, true);
				addInptUpdList(data);
			}
		}

		// 行削除となる行のINDEXを削除用リスト(_inptDelList)に振り分け
		for (MCRow tblR : tblL.subList(UPD_FLG, false)) {
			MCRow delR = MCRow.create();
			delR.addNumberColumn(INDEX, MCNumber.valueOf(tblR.getGUIIndex()));
			addInptDelList(delR);
		}
	}

	/**
	 * 製造指図登録画面の投入予定テーブルとマッチングする。<br>
	 */
	protected MCList<?> matchMfgInstRegDtlInptL(MCList<?> tblL) {
		IfInptTrgtSelBase p = getTargetPanel();

		// 製造指図登録画面の選択行の情報
		MCRow mfgInstRegDtlInptSelR = p.getInptTable(_parts).getSelectedMCRow();

		// 製造指図登録画面の投入予定テーブルの情報
		MCList<?> mfgInstRegDtlInptL = p.getInptTable(_parts).getList();

		// 投入予定から工程ＣＤ、工程連番、品目ＣＤ、枝番１～３、版ＮＯ、代替グループＣＤ、代替グループ連番、同一子品目連番でマッチングするためのキー
		MCIndexKey matchVerAltKey = mfgInstRegDtlInptL.createIndex(
				DtlInptR.$oper_cd, DtlInptR.$oper_seq,
				DtlInptR.$itm_cd, DtlInptR.$itm_sub1,
				DtlInptR.$itm_sub2, DtlInptR.$itm_sub3,
				DtlInptR.$ver_no, DtlInptR.$alt_grp_cd,
				DtlInptR.$alt_grp_seq, DtlInptR.$chd_itm_seq);

		// マッチング
		tblL = mfgInstRegDtlInptL.subList(matchVerAltKey, mfgInstRegDtlInptSelR.getStringNE(DtlInptR.$oper_cd),
				mfgInstRegDtlInptSelR.getNumberNE(DtlInptR.$oper_seq), mfgInstRegDtlInptSelR.getStringNE(DtlInptR.$itm_cd),
				mfgInstRegDtlInptSelR.getStringNE(DtlInptR.$itm_sub1), mfgInstRegDtlInptSelR.getStringNE(DtlInptR.$itm_sub2),
				mfgInstRegDtlInptSelR.getStringNE(DtlInptR.$itm_sub3), mfgInstRegDtlInptSelR.getStringNE(DtlInptR.$ver_no),
				mfgInstRegDtlInptSelR.getStringNE(DtlInptR.$alt_grp_cd), mfgInstRegDtlInptSelR.getNumberNE(DtlInptR.$alt_grp_seq),
				mfgInstRegDtlInptSelR.getNumberNE(DtlInptR.$chd_itm_seq));

		// tblLから削除ステータスの行を除く
		tblL = tblL.subList(MCRow.CREATE, MCRow.MODIFY, MCRow.NONE);

		// tblLから着手中、完了の行を除く
		tblL = tblL.subList(r -> (!MSC_MFG_STS_TYP.isSTT(r.getStringNE(DtlInptR.$mfg_sts_typ))
				&& !MSC_MFG_STS_TYP.isCMPL(r.getStringNE(DtlInptR.$mfg_sts_typ))));

		return tblL;
	}

	/**
	 * 製造指図登録画面のテーブルを更新する。<br>
	 * <br>
	 * getInptInsListのデータを対象に {@link #insData()} を実行する。<br>
	 * getInptUpdListのデータを対象に {@link #updData()} を実行する。<br>
	 * getInptDelListのデータを対象に {@link #delData()} を実行する。<br>
	 *
	 * @see #insData()
	 * @see #updData()
	 */
	protected void updateTable() {
		if (!getInptInsList().isEmpty()) {
			insData();
		}
		if (!getInptUpdList().isEmpty()) {
			updData();
		}
		if (!getInptDelList().isEmpty()) {
			delData();
		}
	}

	/**
	 * 表示元画面のテーブルを更新する。
	 * getInptInsListのデータを対象に実行される。
	 */
	@SuppressWarnings("unchecked")
	protected void insData() {
		IfInptTrgtSelBase p = getTargetPanel();
		MCRow mfgInstRegDtlInptSelR = p.getInptTable(_parts).getSelectedMCRow();

		MCMessageList list = new MCMessageList();

		MCList<?> orgList = p.getInptTable(_parts).getList();
		MCList orgRows = null;
		if (orgList.size() > 0 ){
			orgRows = MCList.create(orgList.get(0));
			for(MCRow r : orgList){
				orgRows.add(r.clone());
			}
		}

		for (MCRow data : getInptInsList()) {
			MCConstRow insRow = p.insertInptTrgtRow(p.getInptTable(_parts));
			if (insRow == null) {
				continue;
			}

			int idx = insRow.getGUIIndex();

			copyValue(insRow, mfgInstRegDtlInptSelR, createMap_insRow_selectedRow());
			insRow.setStatus(MCRow.CREATE);
			updateData(data, idx, list, createGetStkPartsInfo());

			p.afterInsInptTrgtData(_parts, idx);
		}

		if (list.size() > 0) {
			orgList.setAll(orgRows);
			MCMessageBox.message((MCRootPanel) getTargetPanel(), list);
		}
	}

	/**
	 * 選択行から追加行へのマッピング
	 * @return
	 */
	protected Map_insRow_selectedRow<MCConstRow, MCRow> createMap_insRow_selectedRow() {
		return new Map_insRow_selectedRow<MCConstRow, MCRow>();
	}

	public class Map_insRow_selectedRow<D extends MCConstRow, S extends MCRow> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(DtlInptR.$tgt_oper_flg, DtlInptR.$tgt_oper_flg);
			addColumnPathMap(DtlInptR.$oper_peg_no, DtlInptR.$oper_peg_no);
			addColumnPathMap(DtlInptR.$th_image, DtlInptR.$th_image);
			addColumnPathMap(DtlInptR.$alt_grp_cd, DtlInptR.$alt_grp_cd);
			addColumnPathMap(DtlInptR.$alt_grp_nm, DtlInptR.$alt_grp_nm);
			addColumnPathMap(DtlInptR.$alt_grp_seq, DtlInptR.$alt_grp_seq);
			addColumnPathMap(DtlInptR.$alt_itm_fix_flg, DtlInptR.$alt_itm_fix_flg);
			addColumnPathMap(DtlInptR.$itm_p, DtlInptR.$itm_p);
			addColumnPathMap(DtlInptR.$ver_no_p, DtlInptR.$ver_no_p);
			addColumnPathMap(DtlInptR.$ver_flg, DtlInptR.$ver_flg);
			addColumnPathMap(DtlInptR.$lot_mng_typ, DtlInptR.$lot_mng_typ);
			addColumnPathMap(DtlInptR.$sublot_mng_typ, DtlInptR.$sublot_mng_typ);
			addColumnPathMap(DtlInptR.$sno1_mng_typ, DtlInptR.$sno1_mng_typ);
			addColumnPathMap(DtlInptR.$sno2_mng_typ, DtlInptR.$sno2_mng_typ);
			addColumnPathMap(DtlInptR.$sno3_mng_typ, DtlInptR.$sno3_mng_typ);
			addColumnPathMap(DtlInptR.$sno4_mng_typ, DtlInptR.$sno4_mng_typ);
			addColumnPathMap(DtlInptR.$fxd_rqmt_qty_p, DtlInptR.$fxd_rqmt_qty_p);
			addColumnPathMap(DtlInptR.$base_unit_cd, DtlInptR.$base_unit_cd);
			addColumnPathMap(DtlInptR.$base_unit_nm, DtlInptR.$base_unit_nm);
			addColumnPathMap(DtlInptR.$base_unit_dec_place, DtlInptR.$base_unit_dec_place);
			addColumnPathMap(DtlInptR.$base_unit_rnd_typ, DtlInptR.$base_unit_rnd_typ);
			addColumnPathMap(DtlInptR.$cont_fctr_flg, DtlInptR.$cont_fctr_flg);
			addColumnPathMap(DtlInptR.$cont_fctr_rnd_typ, DtlInptR.$cont_fctr_rnd_typ);
			addColumnPathMap(DtlInptR.$cont_fctr_dec_place, DtlInptR.$cont_fctr_dec_place);
			addColumnPathMap(DtlInptR.$act_cont_fctr_p, DtlInptR.$act_cont_fctr_p);
			addColumnPathMap(DtlInptR.$cont_fxd_rqmt_qty_p, DtlInptR.$cont_fxd_rqmt_qty_p);
			addColumnPathMap(DtlInptR.$cont_fctr_unit_cd_p, DtlInptR.$cont_fctr_unit_cd_p);
			addColumnPathMap(DtlInptR.$std_cont_fctr_p, DtlInptR.$std_cont_fctr_p);
			addColumnPathMap(DtlInptR.$oper_cd, DtlInptR.$oper_cd);
			addColumnPathMap(DtlInptR.$oper_nm, DtlInptR.$oper_nm);
			addColumnPathMap(DtlInptR.$oper_seq, DtlInptR.$oper_seq);
			addColumnPathMap(DtlInptR.$schd_dt_p, DtlInptR.$schd_dt_p);
			addColumnPathMap(DtlInptR.$lot_prop_tgt_flg, DtlInptR.$lot_prop_tgt_flg);
			addColumnPathMap(DtlInptR.$alloc_flg, DtlInptR.$alloc_flg);
			addColumnPathMap(DtlInptR.$inst_lot_fix_flg, DtlInptR.$inst_lot_fix_flg);
			addColumnPathMap(DtlInptR.$no_lot_fix_flg, DtlInptR.$no_lot_fix_flg);
			addColumnPathMap(DtlInptR.$lot_no_p, DtlInptR.$lot_no_p);
			addColumnPathMap(DtlInptR.$vld_dt, DtlInptR.$vld_dt);
			addColumnPathMap(DtlInptR.$first_gr_dt, DtlInptR.$first_gr_dt);
			addColumnPathMap(DtlInptR.$lot_seq, DtlInptR.$lot_seq);
			addColumnPathMap(DtlInptR.$sno_p, DtlInptR.$sno_p);
			addColumnPathMap(DtlInptR.$alloc_sno_p, DtlInptR.$alloc_sno_p);
			addColumnPathMap(DtlInptR.$inpt_loc_cd, DtlInptR.$inpt_loc_cd);
			addColumnPathMap(DtlInptR.$inpt_loc_nm, DtlInptR.$inpt_loc_nm);
			addColumnPathMap(DtlInptR.$inpt_str_ln_tgt_flg, DtlInptR.$inpt_str_ln_tgt_flg);
			addColumnPathMap(DtlInptR.$inpt_str_ln_p, DtlInptR.$inpt_str_ln_p);
			addColumnPathMap(DtlInptR.$gd_cd, DtlInptR.$gd_cd);
			addColumnPathMap(DtlInptR.$gd_nm, DtlInptR.$gd_nm);
			addColumnPathMap(DtlInptR.$inpt_rsn_cd, DtlInptR.$inpt_rsn_cd);
			addColumnPathMap(DtlInptR.$inpt_rsn_nm, DtlInptR.$inpt_rsn_nm);
			addColumnPathMap(DtlInptR.$intr_rmrks, DtlInptR.$intr_rmrks);
			addColumnPathMap(DtlInptR.$inst_rpt_rmrks, DtlInptR.$inst_rpt_rmrks);
			addColumnPathMap(DtlInptR.$sub_char1, DtlInptR.$sub_char1);
			addColumnPathMap(DtlInptR.$sub_char2, DtlInptR.$sub_char2);
			addColumnPathMap(DtlInptR.$sub_char3, DtlInptR.$sub_char3);
			addColumnPathMap(DtlInptR.$bkf_typ, DtlInptR.$bkf_typ);
			addColumnPathMap(DtlInptR.$bkf_typ_nm, DtlInptR.$bkf_typ_nm);
			addColumnPathMap(DtlInptR.$par_inst_qty, DtlInptR.$par_inst_qty);
			addColumnPathMap(DtlInptR.$chd_inpt_qty, DtlInptR.$chd_inpt_qty);
			addColumnPathMap(DtlInptR.$chd_rqmt_qty, DtlInptR.$chd_rqmt_qty);
			addColumnPathMap(DtlInptR.$fxd_chd_rqmt_qty, DtlInptR.$fxd_chd_rqmt_qty);
			addColumnPathMap(DtlInptR.$main_itm_flg, DtlInptR.$main_itm_flg);
			addColumnPathMap(DtlInptR.$bom_id_no, DtlInptR.$bom_id_no);
			addColumnPathMap(DtlInptR.$chd_itm_seq, DtlInptR.$chd_itm_seq);
			addColumnPathMap(DtlInptR.$bom_memo1, DtlInptR.$bom_memo1);
			addColumnPathMap(DtlInptR.$bom_memo2, DtlInptR.$bom_memo2);
			addColumnPathMap(DtlInptR.$bom_memo3, DtlInptR.$bom_memo3);
			addColumnPathMap(DtlInptR.$yield_calc_flg, DtlInptR.$yield_calc_flg);
			addColumnPathMap(DtlInptR.$split_row_flg, DtlInptR.$split_row_flg);
			addColumnPathMap(DtlInptR.$alloc_ctl_typ, DtlInptR.$alloc_ctl_typ);
			addColumnPathMap(DtlInptR.$alloc_ctl_typ_nm, DtlInptR.$alloc_ctl_typ_nm);
			addColumnPathMap(DtlInptR.$inpt_ctl_typ, DtlInptR.$inpt_ctl_typ);
			addColumnPathMap(DtlInptR.$inpt_ctl_typ_nm, DtlInptR.$inpt_ctl_typ_nm);
			addColumnPathMap(DtlInptR.$in_offst_typ, DtlInptR.$in_offst_typ);
			addColumnPathMap(DtlInptR.$in_offst_typ_nm, DtlInptR.$in_offst_typ_nm);
			addColumnPathMap(DtlInptR.$in_offst, DtlInptR.$in_offst);
			addColumnPathMap(DtlInptR.$lot_mix_flg, DtlInptR.$lot_mix_flg);
			addColumnPathMap(DtlInptR.$sublot_mix_flg, DtlInptR.$sublot_mix_flg);
			addColumnPathMap(DtlInptR.$stk_mng_typ, DtlInptR.$stk_mng_typ);
			addColumnPathMap(DtlInptR.$stk_mng_typ_nm, DtlInptR.$stk_mng_typ_nm);
			addColumnPathMap(DtlInptR.$prov_typ, DtlInptR.$prov_typ);
			addColumnPathMap(DtlInptR.$prov_typ_nm, DtlInptR.$prov_typ_nm);
			addColumnPathMap(DtlInptR.$alt_qty_p, DtlInptR.$alt_qty_p);
			addColumnPathMap(DtlInptR.$alt_itm_typ, DtlInptR.$alt_itm_typ);
			addColumnPathMap(DtlInptR.$alt_itm_typ_nm, DtlInptR.$alt_itm_typ_nm);
			addColumnPathMap(DtlInptR.$alt_alloc_prio, DtlInptR.$alt_alloc_prio);
			addColumnPathMap(DtlInptR.$alt_itm_ratio, DtlInptR.$alt_itm_ratio);
			addColumnPathMap(DtlInptR.$mfg_inst_no, DtlInptR.$mfg_inst_no);
			addColumnPathMap(DtlInptR.$oper_inst_no, DtlInptR.$oper_inst_no);
			addColumnPathMap(DtlInptR.$disp_seq, DtlInptR.$disp_seq);
			addColumnPathMap(DtlInptR.$oper_del_flg, DtlInptR.$oper_del_flg);
			addColumnPathMap(DtlInptR.$fxd_loss_rsn_none_flg, DtlInptR.$fxd_loss_rsn_none_flg);
			addColumnPathMap(DtlInptR.$set_stk_str_ln_flg, DtlInptR.$set_stk_str_ln_flg);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.setBoolean(DtlInptR.$split_row_flg, true);
		}
	}

	/**
	 * 表示元画面のテーブルを更新する。
	 * getInptUpdListのデータを対象に実行される。
	 */
	protected void updData() {
		IfInptTrgtSelBase p = getTargetPanel();

		MCMessageList list = new MCMessageList();

		int idx = p.getInptTable(_parts).getMCSelectedRow();
		if (idx < 0) {
			return;
		}

		MCRow org = p.getInptTable(_parts).getRow(idx);
		MCRow orgVal = org.clone();
		
		for (MCRow data : getInptUpdList()) {
			int updIdx = data.getNumberNE(INDEX).intValue();
			if (updIdx < 0) {
				return;
			}

			updateData(data, updIdx, list, createGetStkPartsInfo());
			p.afterUpdInptTrgtData(_parts, updIdx);

			if (list.size() > 0) {
				MCRow.copyall(org, orgVal);
				MCMessageBox.message((MCRootPanel) getTargetPanel(), list);
			}
		}
	}

	/**
	 * 表示元画面のテーブルを更新する。
	 * getInptDelListのデータを対象に実行される。
	 */
	protected void delData() {
		IfInptTrgtSelBase p = getTargetPanel();

		MCMessageList list = new MCMessageList();

		int idx = p.getInptTable(_parts).getMCSelectedRow();
		if (idx < 0) {
			return;
		}

		MCRow org = p.getInptTable(_parts).getRow(idx);
		MCRow orgVal = org.clone();

		// 下(INDEXの大きい順)から行削除しないと範囲外エラーになるため、INDEXで降順ソートする
		MCList<MCRow> inptDelList = MCList.create(MCRow.class);
		inptDelList.setAll(getInptDelList());
		inptDelList.sort(SortType.DESC, INDEX);

		for (MCRow data : inptDelList) {
			int delIdx = data.getNumberNE(INDEX).intValue();
			if (delIdx < 0) {
				return;
			}

			MCTable<?> table = p.getInptTable(_parts);
			table.deleteRow(delIdx);

			if (list.size() > 0) {
				MCRow.copyall(org, orgVal);
				MCMessageBox.message((MCRootPanel) getTargetPanel(), list);
			}
		}
	}

	protected GetStkPartsInfo createGetStkPartsInfo() {
		GetStkPartsInfo info = null;
		if (Cnd_ope_ADD.isSelected()) {
			info = new GetStkPartsInfoImpl(GetStkPartsInfo.EVENT_TYPE_INS);
		}
		else if (Cnd_ope_UPD.isSelected()) {
			info = new GetStkPartsInfoImpl(GetStkPartsInfo.EVENT_TYPE_UPD);
		}
		return info;
	}

	public class GetStkPartsInfoImpl implements GetStkPartsInfo {
		protected int _type;

		public GetStkPartsInfoImpl(int type) {
			_type = type;
		}

		@Override
		public int getEventType() {
			return _type;
		}
	}

	protected void updateData(MCRow data, int index, MCMessageList list, GetStkPartsInfo info) {
		if (data == null) {
			return;
		}

		IfInptTrgtSelBase pnl = getTargetPanel();
		MCTable<?> table = pnl.getInptTable(_parts);
		String ope = getOpeTyp();

		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_ITM_CD, pnl.getInptItmCdColumn(), index, data.getStringNE(IfInptTrgtSelBase.INPT_ITM_CD), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_ITM_SUB1, pnl.getInptItmSub1Column(), index, data.getStringNE(IfInptTrgtSelBase.INPT_ITM_SUB1), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_ITM_SUB2, pnl.getInptItmSub2Column(), index, data.getStringNE(IfInptTrgtSelBase.INPT_ITM_SUB2), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_ITM_SUB3, pnl.getInptItmSub3Column(), index, data.getStringNE(IfInptTrgtSelBase.INPT_ITM_SUB3), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_ITM_NM, pnl.getInptItmNmColumn(), index, data.getStringNE(IfInptTrgtSelBase.INPT_ITM_NM), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_VER_NO, pnl.getInptVerNoColumn(), index, data.getStringNE(IfInptTrgtSelBase.INPT_VER_NO), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_LOT_NO, pnl.getInptLotNoColumn(), index, data.getStringNE(IfInptTrgtSelBase.INPT_LOT_NO), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_SUBLOT_NO, pnl.getInptSublotNoColumn(), index, data.getStringNE(IfInptTrgtSelBase.INPT_SUBLOT_NO), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_BP_LOT_NO, pnl.getInptBpLotNoColumn(), index, data.getStringNE(IfInptTrgtSelBase.INPT_BP_LOT_NO), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_LOC_CD, pnl.getInptLocCdColumn(), index, data.getStringNE(IfInptTrgtSelBase.INPT_LOC_CD), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_LG_GRP_CD, pnl.getInptLgGrpCdColumn(), index, data.getStringNE(IfInptTrgtSelBase.INPT_LG_GRP_CD), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_ALLOC_GRP_CD, pnl.getInptAllocGrpCdColumn(), index, data.getStringNE(IfInptTrgtSelBase.INPT_ALLOC_GRP_CD), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_STR_LN_CD_NONE_FLG, pnl.getInptStrLnCdNoneFlgColumn(), index, data.getBooleanNE(IfInptTrgtSelBase.INPT_STR_LN_CD_NONE_FLG), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_STR_LN_CD, pnl.getInptStrLnCdColumn(), index, data.getStringNE(IfInptTrgtSelBase.INPT_STR_LN_CD), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_GD_CD, pnl.getInptGdCdColumn(), index, data.getStringNE(IfInptTrgtSelBase.INPT_GD_CD), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_IN_XFR_TYP, pnl.getInptInXfrTypColumn(), index, data.getStringNE(IfInptTrgtSelBase.INPT_IN_XFR_TYP), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_QUALITY_TYP, pnl.getInptQualityTypColumn(), index, data.getStringNE(IfInptTrgtSelBase.INPT_QUALITY_TYP), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_STK_INSP_TYP, pnl.getInptStkInspTypColumn(), index, data.getStringNE(IfInptTrgtSelBase.INPT_STK_INSP_TYP), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_SNO1, pnl.getInptSno1Column(), index, data.getStringNE(IfInptTrgtSelBase.INPT_SNO1), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_SNO2, pnl.getInptSno2Column(), index, data.getStringNE(IfInptTrgtSelBase.INPT_SNO2), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_SNO3, pnl.getInptSno3Column(), index, data.getStringNE(IfInptTrgtSelBase.INPT_SNO3), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_SNO4, pnl.getInptSno4Column(), index, data.getStringNE(IfInptTrgtSelBase.INPT_SNO4), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_STK_ID_TYP, pnl.getInptStkIdTypColumn(), index, data.getStringNE(IfInptTrgtSelBase.INPT_STK_ID_TYP), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_STK_BP_CD, pnl.getInptStkBpCdColumn(), index, data.getStringNE(IfInptTrgtSelBase.INPT_STK_BP_CD), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_ASST_TYP, pnl.getInptAsstTypColumn(), index, data.getStringNE(IfInptTrgtSelBase.INPT_ASST_TYP), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_FIX_NO_TYP, pnl.getInptFixNoTypColumn(), index, data.getStringNE(IfInptTrgtSelBase.INPT_FIX_NO_TYP), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_FIX_NO, pnl.getInptFixNoColumn(), index, data.getStringNE(IfInptTrgtSelBase.INPT_FIX_NO), list)) {
			return;
		}
		if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_STK_ARRV_BP_CD, pnl.getInptStkArrvBpCdColumn(), index, data.getStringNE(IfInptTrgtSelBase.INPT_STK_ARRV_BP_CD), list)) {
			return;
		}
		if (!isNull(data.getNumberNE(IfInptTrgtSelBase.INPT_PACK_STK_QTY))) {
			if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_PACK_UNIT_CD, pnl.getInptPackUnitCdColumn(), index, data.getStringNE(IfInptTrgtSelBase.INPT_PACK_UNIT_CD), list)) {
				return;
			}
			if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_PACK_STK_QTY, pnl.getInptPackStkQtyColumn(), index, data.getNumberNE(IfInptTrgtSelBase.INPT_PACK_STK_QTY), list)) {
				return;
			}
		}
		if (!isNull(data.getNumberNE(IfInptTrgtSelBase.INPT_BASE_STK_QTY))) {
			if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_BASE_UNIT_CD, pnl.getInptBaseUnitCdColumn(), index, data.getStringNE(IfInptTrgtSelBase.INPT_BASE_UNIT_CD), list)) {
				return;
			}
			if (!isUpdColumnOK(pnl, table, ope, IfInptTrgtSelBase.INPT_BASE_STK_QTY, pnl.getInptBaseStkQtyColumn(), index, data.getNumberNE(IfInptTrgtSelBase.INPT_BASE_STK_QTY), list)) {
				return;
			}
		}
	}

	protected boolean isUpdColumnOK(IfInptTrgtSelBase pnl, MCTable<?> table, String ope, String linkName, String inptName, int index, Comparable<?> updVal, MCMessageList list) {
		if (pnl != null && table != null && !isNullOr(linkName, inptName)) {
			if (pnl.isValueLink(_parts, index, ope, linkName)) {
				String path = table.getList().get(index).getRealColumnPath(inptName);
				MCColumnConfig updColumn = table.getColumnConfigByBaseTableColumnName(path);

				if (updColumn != null && MCMode.isEnable(updColumn, table.isCellEditable(index, updColumn))) {

					if (pnl.getIgnoreErrItems().contains(inptName)) {
						// エラー無視カラムは、リストに値が存在する場合のみ設定する。
						if (updColumn.checkValue(updVal, index)){
							updColumn.setValue(index, updVal);	
						}
					}
					else {
						list.addAll(updColumn.setValue(index, updVal));
					}
				}
				else if (updColumn != null && isSame(inptName, IfInptTrgtSelBase.INPT_ITM_NM)) {
					if (pnl.getIgnoreErrItems().contains(inptName)) {
						// エラー無視カラムは、リストに値が存在する場合のみ設定する。
						if (updColumn.checkValue(updVal, index)){
							updColumn.setValue(index, updVal);
						}
					}
					else {
						list.addAll(updColumn.setValue(index, updVal));
					}
				}
			}
		}

		if (list.size() > 0) {
			return false;
		}

		return true;
	}

	/**
	 * 値の設定対象が編集可能かどうか？
	 * @param index 呼び出し元画面の編集対象行
	 * @return
	 */
	protected boolean isEditable(int index) {
		IfInptTrgtSelBase p = getTargetPanel();
		if (p.isEditableInptTrgtData(_parts,index)) {
			return true;
		}
		return false;
	}

	/**
	 * 「反映する」ボタンのモードを設定する。<br>
	 * 「入力」テーブルに行が表示されていない場合は、
	 * 「反映する」ボタンのモードを {@link MCMode#DISABLE} に設定する。
	 */
	protected void setBtn_rgstMode() {
		if (isDefaultModeEditable(Btn_rgst)) {
			if (getRsltL().size() == 0) {
				Btn_rgst.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_rgst);
			}
		}
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		// 版ＮＯ
		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, null, null);
		// 手配ＮＯ無し可
		Cnd_sno_p_PPanel.setEnableSnoNullFlg(true);

		// 数量項目（荷）
		Rslt_pack_stk_qty_p_PPanel.setRelateBeans(columnRslt_pack_unit_cd, columnRslt_pack_unit_dec_place);
		Rslt_pack_gr_schd_qty_p_PPanel.setRelateBeans(columnRslt_pack_unit_cd, columnRslt_pack_unit_dec_place);
		Rslt_pack_alloc_qty_p_PPanel.setRelateBeans(columnRslt_pack_unit_cd, columnRslt_pack_unit_dec_place);
		Rslt_pack_wait_qty_p_PPanel.setRelateBeans(columnRslt_pack_unit_cd, columnRslt_pack_unit_dec_place);
		Rslt_pack_lot_alloc_avl_qty_p_PPanel.setRelateBeans(columnRslt_pack_unit_cd, columnRslt_pack_unit_dec_place);
		Rslt_pack_alloc_avl_qty_p_PPanel.setRelateBeans(columnRslt_pack_unit_cd, columnRslt_pack_unit_dec_place);
		Rslt_pack_unit_qty_p_PPanel.setRelateBeans(columnRslt_pack_unit_cd, columnRslt_pack_unit_dec_place);
		// 数量項目（基）
		Rslt_base_stk_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_base_gr_schd_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_base_alloc_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_base_wait_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_base_lot_alloc_avl_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_base_alloc_avl_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place, columnRslt_base_unit_rnd_typ,
				columnRslt_pack_unit_qty, columnRslt_conv_base_qty, columnRslt_conv_qty); // 部品により自動算出

		// 有効成分（実際）
		Rslt_stk_act_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_base_stk_qty, null,
				columnRslt_act_cont_fctr, columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);
		Rslt_schd_act_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_base_gr_schd_qty, null,
				columnRslt_act_cont_fctr, columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);
		Rslt_alloc_act_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_base_alloc_qty, null,
				columnRslt_act_cont_fctr, columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);
		Rslt_wait_act_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_base_wait_qty, null,
				columnRslt_act_cont_fctr, columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);
		Rslt_lot_avl_act_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_base_lot_alloc_avl_qty, null,
				columnRslt_act_cont_fctr, columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);
		Rslt_avl_act_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_base_alloc_avl_qty, null,
				columnRslt_act_cont_fctr, columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);
		// 有効成分（標準）
		Rslt_stk_std_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_base_stk_qty,
				columnRslt_std_cont_fctr, null, columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);
		Rslt_schd_std_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_base_gr_schd_qty,
				columnRslt_std_cont_fctr, null, columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);
		Rslt_alloc_std_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_base_alloc_qty,
				columnRslt_std_cont_fctr, null, columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);
		Rslt_wait_std_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_base_wait_qty,
				columnRslt_std_cont_fctr, null, columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);
		Rslt_lot_avl_std_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_base_lot_alloc_avl_qty,
				columnRslt_std_cont_fctr, null, columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);
		Rslt_avl_std_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg, columnRslt_base_alloc_avl_qty,
				columnRslt_std_cont_fctr, null, columnRslt_cont_fctr_dec_place, columnRslt_cont_fctr_rnd_typ);
		// 有効成分（反映）
		Rslt_act_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg,
				columnRslt_base_unit_qty, null,
				columnRslt_act_cont_fctr, columnRslt_cont_fctr_dec_place,
				columnRslt_cont_fctr_rnd_typ, true); // 部品により自動算出
		Rslt_std_cont_qty_p_PPanel.setRelateBeans(columnRslt_cont_fctr_flg,
				columnRslt_base_unit_qty, columnRslt_std_cont_fctr,
				null, columnRslt_cont_fctr_dec_place,
				columnRslt_cont_fctr_rnd_typ); // 部品により自動算出
	}
	
	@Override
	protected void listenerInit() {
		super.listenerInit();

		columnRslt_act_cont_qty.addLCListener(this);
		columnRslt_pack_unit_qty.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (lc == columnRslt_act_cont_qty) {
			doRslt_act_cont_qty_LC(info);
		}
		else if (lc == columnRslt_pack_unit_qty) {
			doRslt_pack_unit_qty_LC(info);
		}
	}

	@Override
	protected void valueInit() {
		super.valueInit();

		// 起動オプションチェック
		if (!isSame(this._openTyp, T1)) {
			return;
		}

		setInitCndDisp(true);

		if (!isNull(this._bind)) {
			// 呼び出し先から渡された値を画面上へ設定
			setBindToDisp(this._bind, this._args);
			// 画面表示制御
			ctrlDispAfterOpenByInitParam(this._bind, this._args);
			// 入力不可の項目に値が入っていなかったらエラーとする
			chkRoAndValue();
		}

		// パーソナライズ
		setUserSrchCnd();

		FoldTab.focusActiveFirstComponent();
	}

	@Override
	public void setStatus(String status) {
		super.setStatus(status);
		setBtn_rgstMode();
	}

	/**
	 * 集計処理条件を初期化する。
	 * @param bVal boolean 設定値
	 */
	protected void setInitCndDisp(boolean bVal) {
		getCndR().wg_flg(bVal);
		getCndR().lot_flg(bVal);
		getCndR().loc_flg(bVal);
		getCndR().site_flg(bVal);
		getCndR().lg_grp_flg(bVal);
		getCndR().alloc_grp_flg(bVal);
		getCndR().loc_grp_flg(bVal);
		getCndR().gd_flg(bVal);
		getCndR().sno1_flg(bVal);
		getCndR().sno2_flg(bVal);
		getCndR().sno3_flg(bVal);
		getCndR().sno4_flg(bVal);
		getCndR().stk_id_flg(bVal);
		getCndR().fix_no_flg(bVal);
		getCndR().schd_dt_flg(bVal);
		// 医薬オプションの考慮で、表示される時だけオンに可能とする
		if (Cnd_ver_flg != null && Cnd_ver_flg.isVisible()) {
			getCndR().ver_flg(bVal);
		}
	}

	/**
	 * 表示元画面を取得する。
	 *
	 * @return 表示元画面
	 */
	protected IfInptTrgtSelBase getTargetPanel() {
		if (_target_panel == null) {
			// 呼び出し元画面の取得
			MCRootPanel p = null;
			try {
				p = getParentPanel();
			}
			catch (Exception pe) {
				throw new MCAppException(pe, MSBEP0017, getModuleID(), getScreenID());
			}

			// 取得チェック
			if (p == null) {
				throw new MCAppException(MSBEP0017, getModuleID(), getScreenID());
			}
			else if (!(p instanceof IfInptTrgtSelBase)) {
				throw new MCAppException(MSBEP0018, getModuleID(), getScreenID(), p.getClass().getName());
			}
			else {
				_target_panel = (IfInptTrgtSelBase) p;
			}
		}

		return _target_panel;
	}

	/**
	 * 表示元画面で入力可否を制御する検索項目のマップを取得する。
	 *
	 * @return マップ（キー：検索項目を表す定数、値：検索項目）
	 * @see #getCtrlModeCndNameTgt()
	 * @see #getCtrlModeCndBeansTgt()
	 * @see #getCtrlModeCndNameNotTgt()
	 * @see #getCtrlModeCndBeansNotTgt()
	 */
	protected Map<String, MCModeBeans> getCtrlModeCnd() {
		if (_ctrl_mode_beans == null) {
			_ctrl_mode_beans = new LinkedHashMap<String, MCModeBeans>();

			List<String> nl = getCtrlModeCndNameTgt();
			List<MCModeBeans> ml = getCtrlModeCndBeansTgt();
			if (nl.size() == ml.size()) {
				for (int i = 0; i < nl.size(); i++) {
					_ctrl_mode_beans.put(nl.get(i), ml.get(i));
				}
			}
			nl = getCtrlModeCndNameNotTgt();
			ml = getCtrlModeCndBeansNotTgt();
			if (nl.size() == ml.size()) {
				for (int i = 0; i < nl.size(); i++) {
					_ctrl_mode_beans.put(nl.get(i), ml.get(i));
				}
			}
		}
		return _ctrl_mode_beans;
	}
	protected Map<String, MCModeBeans> getCtrlModeCndTgt() {
		if (_ctrl_mode_beans_tgt == null) {
			_ctrl_mode_beans_tgt = new LinkedHashMap<String, MCModeBeans>();

			List<String> nl = getCtrlModeCndNameTgt();
			List<MCModeBeans> ml = getCtrlModeCndBeansTgt();
			if (nl.size() == ml.size()) {
				for (int i = 0; i < nl.size(); i++) {
					_ctrl_mode_beans_tgt.put(nl.get(i), ml.get(i));
				}
			}
		}
		return _ctrl_mode_beans_tgt;
	}

	/**
	 * 表示元画面で制御する検索項目を表す定数のリストを取得する。
	 * NULLチェック対象。
	 *
	 * @return リスト
	 */
	protected List<String> getCtrlModeCndNameTgt() {
		List<String> list = new ArrayList<String>();
		list.add(IfInptTrgtSelBase.CND_LOC_CD);
		list.add(IfInptTrgtSelBase.CND_STR_LN_CD);
		list.add(IfInptTrgtSelBase.CND_STK_ARRV_BP_CD);
		list.add(IfInptTrgtSelBase.CND_SITE_CD);
		list.add(IfInptTrgtSelBase.CND_WG_CD);
		list.add(IfInptTrgtSelBase.CND_LG_GRP_CD);
		list.add(IfInptTrgtSelBase.CND_ALLOC_GRP_CD);
		list.add(IfInptTrgtSelBase.CND_LOC_GRP_CD);
		list.add(IfInptTrgtSelBase.CND_ITM_TYP);
		list.add(IfInptTrgtSelBase.CND_ITM_TYP_D_CD);
		list.add(IfInptTrgtSelBase.CND_ITM_CD);
		list.add(IfInptTrgtSelBase.CND_ITM_SUB1);
		list.add(IfInptTrgtSelBase.CND_ITM_SUB2);
		list.add(IfInptTrgtSelBase.CND_ITM_SUB3);
		list.add(IfInptTrgtSelBase.CND_VER_NO);
		list.add(IfInptTrgtSelBase.CND_LOT_NO);
		list.add(IfInptTrgtSelBase.CND_SUBLOT_NO);
		list.add(IfInptTrgtSelBase.CND_BP_LOT_NO);
		list.add(IfInptTrgtSelBase.CND_SNO1);
		list.add(IfInptTrgtSelBase.CND_SNO2);
		list.add(IfInptTrgtSelBase.CND_SNO3);
		list.add(IfInptTrgtSelBase.CND_SNO4);
		list.add(IfInptTrgtSelBase.CND_WRK_NO);
		list.add(IfInptTrgtSelBase.CND_VLD_DT_FR);
		list.add(IfInptTrgtSelBase.CND_VLD_DT_TO);
		list.add(IfInptTrgtSelBase.CND_LMT_DT_FR);
		list.add(IfInptTrgtSelBase.CND_LMT_DT_TO);
		list.add(IfInptTrgtSelBase.CND_GD_CD);
		list.add(IfInptTrgtSelBase.CND_STK_BP_CD);
		list.add(IfInptTrgtSelBase.CND_ASST_TYP);
		list.add(IfInptTrgtSelBase.CND_FIX_NO_TYP);
		list.add(IfInptTrgtSelBase.CND_FIX_NO);
		list.add(IfInptTrgtSelBase.CND_PACK_UNIT_CD);
		list.add(IfInptTrgtSelBase.CND_FIRST_GR_DT_FR);
		list.add(IfInptTrgtSelBase.CND_FIRST_GR_DT_TO);
		list.add(IfInptTrgtSelBase.CND_SCHD_DT_FR);
		list.add(IfInptTrgtSelBase.CND_SCHD_DT_TO);

		return list;
	}
	/**
	 * 表示元画面で制御する検索項目を表す定数のリストを取得する。
	 * NULLチェック対象外。
	 *
	 * @return リスト
	 */
	protected List<String> getCtrlModeCndNameNotTgt() {
		List<String> list = new ArrayList<String>();
		list.add(IfInptTrgtSelBase.CND_ONLY_INT_FLG);
		list.add(IfInptTrgtSelBase.CND_UNREG_LMT_FLG);
		list.add(IfInptTrgtSelBase.CND_POSITIVE_FLG);
		list.add(IfInptTrgtSelBase.CND_EXCEPT_ALLOC_WAIT_FLG);
		list.add(IfInptTrgtSelBase.CND_STK_SCHD_FLG);
		list.add(IfInptTrgtSelBase.CND_GRS_ALLOC_FLG);
		list.add(IfInptTrgtSelBase.CND_ITM_GRP_FLG1);
		list.add(IfInptTrgtSelBase.CND_ITM_GRP_FLG2);
		list.add(IfInptTrgtSelBase.CND_ITM_GRP_FLG3);
		list.add(IfInptTrgtSelBase.CND_ITM_GRP_FLG4);
		list.add(IfInptTrgtSelBase.CND_ITM_GRP_FLG5);
		list.add(IfInptTrgtSelBase.CND_ITM_GRP_FLG6);
		list.add(IfInptTrgtSelBase.CND_ITM_GRP_FLG7);
		list.add(IfInptTrgtSelBase.CND_ITM_GRP_FLG8);
		list.add(IfInptTrgtSelBase.CND_ITM_GRP_FLG9);
		list.add(IfInptTrgtSelBase.CND_ITM_GRP_FLG10);

		list.add(IfInptTrgtSelBase.CND_LOC_NM);
		list.add(IfInptTrgtSelBase.CND_STR_LN_NM);
		list.add(IfInptTrgtSelBase.CND_STK_ARRV_BP_NM);
		list.add(IfInptTrgtSelBase.CND_SITE_NM);
		list.add(IfInptTrgtSelBase.CND_WG_NM);
		list.add(IfInptTrgtSelBase.CND_LG_GRP_NM);
		list.add(IfInptTrgtSelBase.CND_ALLOC_GRP_NM);
		list.add(IfInptTrgtSelBase.CND_LOC_GRP_NM);
		list.add(IfInptTrgtSelBase.CND_ITM_TYP_D_NM);
		list.add(IfInptTrgtSelBase.CND_ITM_NM);
		list.add(IfInptTrgtSelBase.CND_WRK_NM);
		list.add(IfInptTrgtSelBase.CND_GD_NM);
		list.add(IfInptTrgtSelBase.CND_STK_BP_NM);
		list.add(IfInptTrgtSelBase.CND_PACK_UNIT_NM);

		return list;
	}

	/**
	 * 表示元画面で入力可否を制御する検索項目のリストを取得する。
	 * NULLチェック対象。
	 *
	 * @return リスト
	 */
	protected List<MCModeBeans> getCtrlModeCndBeansTgt() {
		List<MCModeBeans> list = new ArrayList<MCModeBeans>();
		list.add(Cnd_loc_cd);
		list.add(Cnd_str_ln_cd);
		list.add(Cnd_stk_arrv_bp_cd);
		list.add(Cnd_site_cd);
		list.add(Cnd_wg_cd);
		list.add(Cnd_lg_grp_cd);
		list.add(Cnd_alloc_grp_cd);
		list.add(Cnd_loc_grp_cd);
		list.add(Cnd_itm_typ);
		list.add(Cnd_itm_typ_d_cd);
		list.add(Cnd_itm_cd);
		list.add(Cnd_itm_sub1);
		list.add(Cnd_itm_sub2);
		list.add(Cnd_itm_sub3);
		list.add(Cnd_ver_no);
		list.add(Cnd_lot_no);
		list.add(Cnd_sublot_no);
		list.add(Cnd_bp_lot_no);
		list.add(Cnd_sno1);
		list.add(Cnd_sno2);
		list.add(Cnd_sno3);
		list.add(Cnd_sno4);
		list.add(Cnd_wrk_no);
		list.add(Cnd_vld_dt_fr);
		list.add(Cnd_vld_dt_to);
		list.add(Cnd_lmt_dt_fr);
		list.add(Cnd_lmt_dt_to);
		list.add(Cnd_gd_cd);
		list.add(Cnd_stk_bp_cd);
		list.add(Cnd_asst_typ);
		list.add(Cnd_fix_no_typ);
		list.add(Cnd_fix_no);
		list.add(Cnd_pack_unit_cd);
		list.add(Cnd_first_gr_dt_fr);
		list.add(Cnd_first_gr_dt_to);
		list.add(Cnd_schd_dt_fr);
		list.add(Cnd_schd_dt_to);

		return list;
	}
	/**
	 * 表示元画面で入力可否を制御する検索項目のリストを取得する。
	 * NULLチェック対象外。
	 *
	 * @return リスト
	 */
	protected List<MCModeBeans> getCtrlModeCndBeansNotTgt() {
		List<MCModeBeans> list = new ArrayList<MCModeBeans>();
		list.add(Cnd_only_int_flg);
		list.add(Cnd_unreg_lmt_flg);
		list.add(Cnd_positive_flg);
		list.add(Cnd_except_alloc_wait_flg);
		list.add(Cnd_stk_schd_flg);
		list.add(Cnd_grs_alloc_flg);
		list.add(Cnd_itm_grp_flg1);
		list.add(Cnd_itm_grp_flg2);
		list.add(Cnd_itm_grp_flg3);
		list.add(Cnd_itm_grp_flg4);
		list.add(Cnd_itm_grp_flg5);
		list.add(Cnd_itm_grp_flg6);
		list.add(Cnd_itm_grp_flg7);
		list.add(Cnd_itm_grp_flg8);
		list.add(Cnd_itm_grp_flg9);
		list.add(Cnd_itm_grp_flg10);

		list.add(Cnd_loc_nm);
		list.add(Cnd_str_ln_nm);
		list.add(Cnd_stk_arrv_bp_nm);
		list.add(Cnd_site_nm);
		list.add(Cnd_wg_nm);
		list.add(Cnd_lg_grp_nm);
		list.add(Cnd_alloc_grp_nm);
		list.add(Cnd_loc_grp_nm);
		list.add(Cnd_itm_typ_d_nm);
		list.add(Cnd_itm_nm);
		list.add(Cnd_wrk_nm);
		list.add(Cnd_gd_nm);
		list.add(Cnd_stk_bp_nm);
		list.add(Cnd_pack_unit_nm);

		return list;
	}
	
	/**
	 * 現在の種別を取得する。<br>
	 * <br>
	 * 戻り値は下記の通りである。<br>
	 * <br>
	 * <table border="1">
	 * <tr><th>種別</th><th>戻り値</th></tr>
	 * <tr><td>追加</td><td> {@link IfInptTrgtSelBase#OPE_INS} </td></tr>
	 * <tr><td>更新</td><td> {@link IfInptTrgtSelBase#OPE_UPD} </td></tr>
	 * <tr><td>その他</td><td> null </td></tr>
	 * </table>
	 *
	 * @return 種別
	 */
	protected String getOpeTyp() {
		if (Cnd_ope_ADD.isSelected()) {
			return IfInptTrgtSelBase.OPE_INS;
		}
		else if (Cnd_ope_UPD.isSelected()) {
			return IfInptTrgtSelBase.OPE_UPD;
		}
		return null;
	}
	
	// ------------------------------ 画面イベント. ------------------------------
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);

		opeChanged(info);
	}
	
	protected void opeChanged(MCEventInfo info) {
		// 明細のチェック・オフ
		doBtn_deselect_all(info);

		// 明細の全チェックオン・オフボタンの制御
		Btn_select_all.setMode(MCMode.ENABLE);
		Btn_deselect_all.setMode(MCMode.ENABLE);
	}

	@Override
	public void doCnd_vld_dt_fr_LC(MCEventInfo info) {
		super.doCnd_vld_dt_fr_LC(info);

		resetUnregLmtFlg();
	}

	@Override
	public void doCnd_vld_dt_to_LC(MCEventInfo info) {
		super.doCnd_vld_dt_fr_LC(info);

		resetUnregLmtFlg();
	}

	@Override
	public void doCnd_lmt_dt_fr_LC(MCEventInfo info) {
		super.doCnd_vld_dt_fr_LC(info);

		resetUnregLmtFlg();
	}

	@Override
	public void doCnd_lmt_dt_to_LC(MCEventInfo info) {
		super.doCnd_vld_dt_fr_LC(info);

		resetUnregLmtFlg();
	}

	protected void resetUnregLmtFlg() {
		if (isNullAnd(getCndR().vld_dt_fr(), getCndR().vld_dt_to(), getCndR().lmt_dt_fr(), getCndR().lmt_dt_to())) {
			getCndR().unreg_lmt_flg(false);
			Cnd_unreg_lmt_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_unreg_lmt_flg);
		}
	}

	@Override
	public void doCnd_fix_no_typ_LC(MCEventInfo info) {
		super.doCnd_fix_no_typ_LC(info);

		resetFixNo();
	}

	protected void resetFixNo() {
		if (MSC_FIX_NO_TYP.isNON(getCndR().fix_no_typ())) {
			getCndR().fix_no(null);
			Cnd_fix_no.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Cnd_fix_no);
		}
	}

	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);

		RsltR r = RsltTable.getRow(info.getEventIndex());

		// １明細行のチェックオン制御
		ctrlOneRowCheckOn(r);
		// 荷姿単位数量の設定
		setPackUnitQty(r);
		// 「反映する」ボタンの制御
		setMeRgstBtnMode();

		if (r.cont_fctr_flg()) {
			// 実際有効成分の集計
			setActContQtySum();
		}
	}

	// 荷姿単位数量と実際有効成分は相互にイベントが発動するため、イベントが無限ループになる可能性がある。当フラグで発動を制御する
	protected boolean _isDuringQtyChangeEvent = false;

	// 実際有効成分
	public void doRslt_act_cont_qty_LC(MCEventInfo info) {
		RsltR r = RsltTable.getRow(info.getEventIndex());

		// 荷姿単位数量換算処理（荷姿単位数量側のイベントで当項目が変更されないように制御）
		if (!_isDuringQtyChangeEvent) {
			try {
				_isDuringQtyChangeEvent = true;

				// 実際有効成分をもとに基準単位数量を算出
				setValueEx(columnRslt_base_unit_qty, r.getGUIIndex(),
						convToBaseUnitFromContFctrUnit(
							r.act_cont_qty(),
							r.act_cont_fctr(),
							r.base_unit_dec_place(),
							r.base_unit_rnd_typ()));

				// 基準単位数量をもとに荷姿単位数量を算出
				r.pack_unit_qty(rvrsBaseUnitConv(
						r.base_unit_qty(),
						r.conv_base_qty(),
						r.conv_qty(),
						r.pack_unit_dec_place(),
						r.pack_unit_rnd_typ()));

			}
			finally {
				_isDuringQtyChangeEvent = false;
			}
		}

		// 実際有効成分の集計
		setActContQtySum();
	}

	// 荷姿単位数量
	protected void doRslt_pack_unit_qty_LC(MCEventInfo info) {
		RsltR r = RsltTable.getRow(info.getEventIndex());

		// 実際有効成分換算処理（実際有効成分側のイベントで当項目が変更されないように制御）
		if (!_isDuringQtyChangeEvent) {
			try {
				_isDuringQtyChangeEvent = true;

				// 荷姿単位数量をもとに基準単位数量を算出
				setValueEx(columnRslt_base_unit_qty, r.getGUIIndex(),
						convToBaseUnit(r.pack_unit_qty(), r.conv_base_qty(), r.conv_qty(),
								r.base_unit_dec_place(), r.base_unit_rnd_typ()));

				// 基準単位数量をもとに実際有効成分を算出
				setValueEx(columnRslt_act_cont_qty, r.getGUIIndex(),
						convToContFctrUnit(r.base_unit_qty(), r.act_cont_fctr(),
								r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));
			}
			finally {
				_isDuringQtyChangeEvent = false;
			}
		}
	}

	/**
	 * 実際有効成分を集計して表示する
	 * 
	 */
	protected void setActContQtySum() {
		// チェックオンのみ集計対象
		MCList<RsltR> rsltL = getRsltL().subList(RsltR.$check, true);

		MCNumber sumActContQty = rsltL.sum(RsltR.$act_cont_qty);
		getInfoR().act_cont_qty(nvl(sumActContQty, MCNumber.ZERO));
	}

	protected void ctrlOneRowCheckOn(RsltR oR) {
		// NULLチェック
		if (oR == null) {
			return;
		}

		// 複数行チェックオン可能の場合、何もしない
		if (Cnd_ope_ADD.isSelected()) {
			return;
		}

		// チェックオフ時、何もしない
		if (!oR.check()) {
			return;
		}
	}

	protected void setPackUnitQty(RsltR oR) {
		// NULLチェック
		if (oR == null) {
			return;
		}

		// 荷姿単位数量の設定
		MCNumber puQty = null;
		if (oR.check()) {
			if (getBtnR().stk_qty_copy_flg()) {
				puQty = oR.pack_stk_qty();
			}
			else if (getBtnR().alloc_qty_copy_flg()) {
				puQty = oR.pack_alloc_avl_qty();
			}
		}
		if (oR.getGUIIndex() >= 0) {
			setValueEx(columnRslt_pack_unit_qty, oR.getGUIIndex() , puQty);
			oR.setStatus(null);
		}
	}

	/**
	 * 選択された「集計対象項目」に関連する明細項目だけを表示する。
	 */
	protected void changeAggrItemsDisp() {
		changeDispWg();				// ワーキンググループ
		changeDispVer();			// 版ＮＯ
		changeDispLot();			// ロットＮＯ
		changeDispLoc();			// 場所
		changeDispSite();			// 工場･物流倉庫
		changeDispLgGrp();			// 物流Ｇ
		changeDispAllocGrp();		// 総量引当場所Ｇ
		changeDispLocGrp();			// 製造場所Ｇ
		changeDispGd();				// 格付
		changeDispSno1();			// 手配ＮＯ１
		changeDispSno2();			// 手配ＮＯ２
		changeDispSno3();			// 手配ＮＯ３
		changeDispSno4();			// 手配ＮＯ４
		changeDispStkId();			// 在庫識別
		changeDispFixNo();			// 確定ＮＯ
		changeDispSchdDt();			// 予定日
	}

	protected void changeDispWg() {
		if (getCndR().wg_flg()) {
			columnRslt_wg_cd.setMode(getDefaultMode(columnRslt_wg_cd));
			columnRslt_wg_nm.setMode(getDefaultMode(columnRslt_wg_nm));
		}
		else {
			columnRslt_wg_cd.setMode(MCMode.INVISIBLE);
			columnRslt_wg_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispVer() {
		if (getCndR().ver_flg()) {
			columnRslt_ver_no.setMode(getDefaultMode(columnRslt_ver_no));
		}
		else {
			columnRslt_ver_no.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispLot() {
		if (getCndR().lot_flg()) {
			columnRslt_lot_no.setMode(getDefaultMode(columnRslt_lot_no));
			columnRslt_sublot_no.setMode(getDefaultMode(columnRslt_sublot_no));
			columnRslt_bp_lot_no.setMode(getDefaultMode(columnRslt_bp_lot_no));
			columnRslt_first_gr_dt.setMode(getDefaultMode(columnRslt_first_gr_dt));
			columnRslt_unreg_lmt_flg.setMode(getDefaultMode(columnRslt_unreg_lmt_flg));
			columnRslt_vld_dt.setMode(getDefaultMode(columnRslt_vld_dt));
			columnRslt_lmt_dt.setMode(getDefaultMode(columnRslt_lmt_dt));
			columnRslt_plnt_aprv_sts_typ.setMode(getDefaultMode(columnRslt_plnt_aprv_sts_typ));
			columnRslt_plnt_aprv_sts_typ_nm.setMode(getDefaultMode(columnRslt_plnt_aprv_sts_typ_nm));
			columnRslt_mrkt_judg_sts_typ.setMode(getDefaultMode(columnRslt_mrkt_judg_sts_typ));
			columnRslt_mrkt_judg_sts_typ_nm.setMode(getDefaultMode(columnRslt_mrkt_judg_sts_typ_nm));
		}
		else {
			columnRslt_lot_no.setMode(MCMode.INVISIBLE);
			columnRslt_sublot_no.setMode(MCMode.INVISIBLE);
			columnRslt_bp_lot_no.setMode(MCMode.INVISIBLE);
			columnRslt_first_gr_dt.setMode(MCMode.INVISIBLE);
			columnRslt_unreg_lmt_flg.setMode(MCMode.INVISIBLE);
			columnRslt_vld_dt.setMode(MCMode.INVISIBLE);
			columnRslt_lmt_dt.setMode(MCMode.INVISIBLE);
			columnRslt_plnt_aprv_sts_typ.setMode(MCMode.INVISIBLE);
			columnRslt_plnt_aprv_sts_typ_nm.setMode(MCMode.INVISIBLE);
			columnRslt_mrkt_judg_sts_typ.setMode(MCMode.INVISIBLE);
			columnRslt_mrkt_judg_sts_typ_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispLoc() {
		if (getCndR().loc_flg()) {
			columnRslt_loc_cd.setMode(getDefaultMode(columnRslt_loc_cd));
			columnRslt_loc_nm.setMode(getDefaultMode(columnRslt_loc_nm));
			columnRslt_str_ln_cd.setMode(getDefaultMode(columnRslt_str_ln_cd));
			columnRslt_str_ln_nm.setMode(getDefaultMode(columnRslt_str_ln_nm));
			columnRslt_str_ln_cd_none_flg.setMode(getDefaultMode(columnRslt_str_ln_cd_none_flg));
			columnRslt_stk_arrv_bp_cd.setMode(getDefaultMode(columnRslt_stk_arrv_bp_cd));
			columnRslt_stk_arrv_bp_nm.setMode(getDefaultMode(columnRslt_stk_arrv_bp_nm));
		}
		else {
			columnRslt_loc_cd.setMode(MCMode.INVISIBLE);
			columnRslt_loc_nm.setMode(MCMode.INVISIBLE);
			columnRslt_str_ln_cd.setMode(MCMode.INVISIBLE);
			columnRslt_str_ln_nm.setMode(MCMode.INVISIBLE);
			columnRslt_str_ln_cd_none_flg.setMode(MCMode.INVISIBLE);
			columnRslt_stk_arrv_bp_cd.setMode(MCMode.INVISIBLE);
			columnRslt_stk_arrv_bp_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSite() {
		if (getCndR().site_flg()) {
			columnRslt_site_cd.setMode(getDefaultMode(columnRslt_site_cd));
			columnRslt_site_nm.setMode(getDefaultMode(columnRslt_site_nm));
		}
		else {
			columnRslt_site_cd.setMode(MCMode.INVISIBLE);
			columnRslt_site_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispLgGrp() {
		if (getCndR().lg_grp_flg()) {
			columnRslt_lg_grp_cd.setMode(getDefaultMode(columnRslt_lg_grp_cd));
			columnRslt_lg_grp_nm.setMode(getDefaultMode(columnRslt_lg_grp_nm));
		}
		else {
			columnRslt_lg_grp_cd.setMode(MCMode.INVISIBLE);
			columnRslt_lg_grp_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispAllocGrp() {
		if (getCndR().alloc_grp_flg()) {
			columnRslt_alloc_grp_cd.setMode(getDefaultMode(columnRslt_alloc_grp_cd));
			columnRslt_alloc_grp_nm.setMode(getDefaultMode(columnRslt_alloc_grp_nm));
		}
		else {
			columnRslt_alloc_grp_cd.setMode(MCMode.INVISIBLE);
			columnRslt_alloc_grp_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispLocGrp() {
		if (getCndR().loc_grp_flg()) {
			columnRslt_loc_grp_cd.setMode(getDefaultMode(columnRslt_loc_grp_cd));
			columnRslt_loc_grp_nm.setMode(getDefaultMode(columnRslt_loc_grp_nm));
		}
		else {
			columnRslt_loc_grp_cd.setMode(MCMode.INVISIBLE);
			columnRslt_loc_grp_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSno1() {
		if (getCndR().sno1_flg()) {
			columnRslt_sno1.setMode(getDefaultMode(columnRslt_sno1));
			columnRslt_wrk_no.setMode(getDefaultMode(columnRslt_wrk_no));
			columnRslt_wrk_nm.setMode(getDefaultMode(columnRslt_wrk_nm));
		}
		else {
			columnRslt_sno1.setMode(MCMode.INVISIBLE);
			columnRslt_wrk_no.setMode(MCMode.INVISIBLE);
			columnRslt_wrk_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSno2() {
		if (getCndR().sno2_flg()) {
			columnRslt_sno2.setMode(getDefaultMode(columnRslt_sno2));
		}
		else {
			columnRslt_sno2.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSno3() {
		if (getCndR().sno3_flg()) {
			columnRslt_sno3.setMode(getDefaultMode(columnRslt_sno3));
		}
		else {
			columnRslt_sno3.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSno4() {
		if (getCndR().sno4_flg()) {
			columnRslt_sno4.setMode(getDefaultMode(columnRslt_sno4));
		}
		else {
			columnRslt_sno4.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispGd() {
		if (getCndR().gd_flg()) {
			columnRslt_gd_cd.setMode(getDefaultMode(columnRslt_gd_cd));
			columnRslt_gd_nm.setMode(getDefaultMode(columnRslt_gd_nm));
		}
		else {
			columnRslt_gd_cd.setMode(MCMode.INVISIBLE);
			columnRslt_gd_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispStkId() {
		if (getCndR().stk_id_flg()) {
			columnRslt_stk_id_typ.setMode(getDefaultMode(columnRslt_stk_id_typ));
			columnRslt_stk_id_typ_nm.setMode(getDefaultMode(columnRslt_stk_id_typ_nm));
			columnRslt_stk_bp_cd.setMode(getDefaultMode(columnRslt_stk_bp_cd));
			columnRslt_stk_bp_nm.setMode(getDefaultMode(columnRslt_stk_bp_nm));
			columnRslt_asst_typ.setMode(getDefaultMode(columnRslt_asst_typ));
			columnRslt_asst_typ_nm.setMode(getDefaultMode(columnRslt_asst_typ_nm));
		}
		else {
			columnRslt_stk_id_typ.setMode(MCMode.INVISIBLE);
			columnRslt_stk_id_typ_nm.setMode(MCMode.INVISIBLE);
			columnRslt_stk_bp_cd.setMode(MCMode.INVISIBLE);
			columnRslt_stk_bp_nm.setMode(MCMode.INVISIBLE);
			columnRslt_asst_typ.setMode(MCMode.INVISIBLE);
			columnRslt_asst_typ_nm.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispFixNo() {
		if (getCndR().fix_no_flg()) {
			columnRslt_fix_no_typ.setMode(getDefaultMode(columnRslt_fix_no_typ));
			columnRslt_fix_no_typ_nm.setMode(getDefaultMode(columnRslt_fix_no_typ_nm));
			columnRslt_fix_no.setMode(getDefaultMode(columnRslt_fix_no));
		}
		else {
			columnRslt_fix_no_typ.setMode(MCMode.INVISIBLE);
			columnRslt_fix_no_typ_nm.setMode(MCMode.INVISIBLE);
			columnRslt_fix_no.setMode(MCMode.INVISIBLE);
		}
	}

	protected void changeDispSchdDt() {
		if (getCndR().schd_dt_flg()) {
			columnRslt_schd_dt.setMode(getDefaultMode(columnRslt_schd_dt));
		}
		else {
			columnRslt_schd_dt.setMode(MCMode.INVISIBLE);
		}
	}

	protected void setMeRgstBtnMode() {
		if (isNull(getRsltL().getFirst(RsltR.$check, true))) {
			Btn_rgst.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_rgst);
		}
	}

	@Override
	public void doBtn_stk_qty_copy_flg_NC(MCEventInfo info) {
		super.doBtn_stk_qty_copy_flg_NC(info);
		changeStkQtyCopyFlg(info);

		for (RsltR r :RsltTable.getViewRows()) {
			if (r.check()) {
				// 荷姿単位数量の設定
				setPackUnitQty(r);
			}
		}
	}

	@Override
	public void doBtn_alloc_qty_copy_flg_NC(MCEventInfo info) {
		super.doBtn_alloc_qty_copy_flg_NC(info);
		changeAllocQtyCopyFlg(info);

		for (RsltR r :RsltTable.getViewRows()) {
			if (r.check()) {
				// 荷姿単位数量の設定
				setPackUnitQty(r);
			}
		}
	}

	protected void changeStkQtyCopyFlg(MCEventInfo info) {
		if (getBtnR().stk_qty_copy_flg()) {
			getBtnR().alloc_qty_copy_flg(false);
		}
	}

	protected void changeAllocQtyCopyFlg(MCEventInfo info) {
		if (getBtnR().alloc_qty_copy_flg()) {
			getBtnR().stk_qty_copy_flg(false);
		}
	}

	/**
	 * ダブルクリック時のイベント
	 */
	@Override
	public void doDCEvent(MCDCBeans compo, MCEventInfo info) {
		super.doDCEvent(compo, info);
	}

	// ------------------------------ セルコンフィグ. ------------------------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(createRsltCellConfig());
	}

	protected MCCellConfig createRsltCellConfig() {
		return new RsltCellConfig();
	}

	/**
	 * Rslttable用のセルコンフィグ
	 */
	public class RsltCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			RsltR r = getRsltL().get(index);
			if (!r.check() && (column == columnRslt_pack_unit_qty || column == columnRslt_act_cont_qty)) {
				return MCMode.READ_ONLY;
			}

			return super.getPriorMode(index, column, table);
		}
	}

	// ------------------------------ 画面遷移. ------------------------------
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);

		if (T1 == openTyp) {
			// 引数受取処理
			initByScreenParamT1(openTyp, bind, args);

			// 検索実行
			if (getTargetPanel().isInptTrgtSrch(openTyp, bind, args)) {
				addDoBehind(Ctrl_ctrl_PPanel.Ope_srch);
			}
		}
	}

	protected void initByScreenParamT1(String openTyp, MCRow bind, Object... args) {
		// OpenTypeの記憶
		if ( this._openTyp == null ) {
			this._openTyp = openTyp;
		}

		if (args != null && args.length != 0 && _parts == null) {
			Object o = args[0];
			if (o instanceof MCRootPanel) {
				_parts = (MCRootPanel) o;
			}
		}

		// 検索条件の区分項目チェック
		if (!isNull(bind)) {
			checkTypSrchCond(bind, args);
		}

		// 検索条件などをキャッシュする。
		if (this._bind == null) {
			this._bind = bind;
		}
		if (this._args == null) {
			this._args = args;
		}

		// 初期化処理
		valueInit();
	}

	protected void setBindToDisp(MCRow bind, Object... args) {
		// 操作種別
		setCndOpe(bind, args);

		// 検索タブ：選択区分項目以外
		setCndBase(bind, args);

		// 検索タブ：選択区分項目
		setCndSgmtTyp(bind, args);

		// 品目分類タブ
		setCndItmGrp(bind, args);

		// 集計タブ
		setCndAggrDisp(bind, args);

		// 数量コピー（フット）
		setBtnQtyCopyCond(bind, args);
	}

	protected void setCndOpe(MCRow bind, Object... args) {
		if (bind.contains(IfInptTrgtSelBase.CND_OPE)) {
			_ope_val = bind.getStringNE(IfInptTrgtSelBase.CND_OPE);
		}
		else {
			IfInptTrgtSelBase p = getTargetPanel();
			MCTable<?> t = p.getInptTable(_parts);

			_ope_val = getTargetPanel().getInptTrgtSelOpeType(t, t.getSelectedMCRow().getGUIIndex());
			bind.addStringColumn(IfInptTrgtSelBase.CND_OPE, _ope_val);
		}

		if (isSame(_ope_val, IfInptTrgtSelBase.OPE_INS)) {
			setValueEx(Cnd_ope_Group, Cnd_ope_ADD.getActionCommand());
		}
		if (isSame(_ope_val, IfInptTrgtSelBase.OPE_UPD)) {
			setValueEx(Cnd_ope_Group, Cnd_ope_UPD.getActionCommand());
		}
	}

	protected void setCndBase(MCRow bind, Object... args) {
		getCndR().loc_cd(bind.getStringNE(IfInptTrgtSelBase.CND_LOC_CD));													// 場所ＣＤ
		getCndR().loc_nm(bind.getStringNE(IfInptTrgtSelBase.CND_LOC_NM));													// 場所名
		getCndR().str_ln_cd(bind.getStringNE(IfInptTrgtSelBase.CND_STR_LN_CD));											// 棚・ラインＣＤ
		getCndR().str_ln_nm(bind.getStringNE(IfInptTrgtSelBase.CND_STR_LN_NM));											// 棚・ライン名
		getCndR().stk_arrv_bp_cd(bind.getStringNE(IfInptTrgtSelBase.CND_STK_ARRV_BP_CD));									// 在庫着荷先ＣＤ
		getCndR().stk_arrv_bp_nm(bind.getStringNE(IfInptTrgtSelBase.CND_STK_ARRV_BP_NM));									// 在庫着荷先名
		getCndR().only_int_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_ONLY_INT_FLG));										// 納品先・配送先在庫を除く
		getCndR().site_cd(bind.getStringNE(IfInptTrgtSelBase.CND_SITE_CD));												// 工場・物流倉庫ＣＤ
		getCndR().site_nm(bind.getStringNE(IfInptTrgtSelBase.CND_SITE_NM));												// 工場・物流倉庫名
		getCndR().wg_cd(bind.getStringNE(IfInptTrgtSelBase.CND_WG_CD));													// ワーキンググループＣＤ
		getCndR().wg_nm(bind.getStringNE(IfInptTrgtSelBase.CND_WG_NM));													// ワーキンググループ名
		getCndR().lg_grp_cd(bind.getStringNE(IfInptTrgtSelBase.CND_LG_GRP_CD));											// 物流グループＣＤ
		getCndR().lg_grp_nm(bind.getStringNE(IfInptTrgtSelBase.CND_LG_GRP_NM));											// 物流グループ名
		getCndR().alloc_grp_cd(bind.getStringNE(IfInptTrgtSelBase.CND_ALLOC_GRP_CD));										// 総量引当場所グループＣＤ
		getCndR().alloc_grp_nm(bind.getStringNE(IfInptTrgtSelBase.CND_ALLOC_GRP_NM));										// 総量引当場所グループ名
		getCndR().loc_grp_cd(bind.getStringNE(IfInptTrgtSelBase.CND_LOC_GRP_CD));											// 製造場所グループＣＤ
		getCndR().loc_grp_nm(bind.getStringNE(IfInptTrgtSelBase.CND_LOC_GRP_NM));											// 製造場所グループ名
		Cnd_itm_typ.setValue(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_TYP));												// 品目区分
		getCndR().itm_typ_d_cd(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_TYP_D_CD));										// 品目区分詳細
		getCndR().itm_typ_d_nm(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_TYP_D_NM));										// 品目区分詳細名
		Cnd_itm_cd.setValue(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_CD));												// 品目ＣＤ
		Cnd_itm_sub1.setValue(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_SUB1));											// 枝番１
		Cnd_itm_sub2.setValue(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_SUB2));											// 枝番２
		Cnd_itm_sub3.setValue(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_SUB3));											// 枝番３
		if (getCndR().sundry_itm_flg()) {
			getCndR().itm_nm(null);																							// 諸口品は品名を設定しない
		}
		else {
			getCndR().itm_nm(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_NM));												// 品名
		}
		getCndR().ver_no(bind.getStringNE(IfInptTrgtSelBase.CND_VER_NO));													// 版ＮＯ
		getCndR().lot_no(bind.getStringNE(IfInptTrgtSelBase.CND_LOT_NO));													// ロットＮＯ
		getCndR().sublot_no(bind.getStringNE(IfInptTrgtSelBase.CND_SUBLOT_NO));											// サブロットＮＯ
		getCndR().bp_lot_no(bind.getStringNE(IfInptTrgtSelBase.CND_BP_LOT_NO));											// 業者ロットＮＯ
		getCndR().sno1_null_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_SNO1_NULL_FLG));									// 手配ＮＯ１無し可
		getCndR().sno1(bind.getStringNE(IfInptTrgtSelBase.CND_SNO1));														// 手配ＮＯ１
		getCndR().sno2_null_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_SNO2_NULL_FLG));									// 手配ＮＯ２無し可
		getCndR().sno2(bind.getStringNE(IfInptTrgtSelBase.CND_SNO2));														// 手配ＮＯ２
		getCndR().sno3_null_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_SNO3_NULL_FLG));									// 手配ＮＯ３無し可
		getCndR().sno3(bind.getStringNE(IfInptTrgtSelBase.CND_SNO3));														// 手配ＮＯ３
		getCndR().sno4_null_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_SNO4_NULL_FLG));									// 手配ＮＯ４無し可
		getCndR().sno4(bind.getStringNE(IfInptTrgtSelBase.CND_SNO4));														// 手配ＮＯ４
		getCndR().wrk_no(bind.getStringNE(IfInptTrgtSelBase.CND_WRK_NO));													// 案件ＮＯ
		getCndR().wrk_nm(bind.getStringNE(IfInptTrgtSelBase.CND_WRK_NM));													// 案件名
		getCndR().vld_dt_fr(bind.getDateNE(IfInptTrgtSelBase.CND_VLD_DT_FR));												// 有効期限ＦＲＯＭ
		getCndR().vld_dt_to(bind.getDateNE(IfInptTrgtSelBase.CND_VLD_DT_TO));												// 有効期限ＴＯ
		getCndR().lmt_dt_fr(bind.getDateNE(IfInptTrgtSelBase.CND_LMT_DT_FR));												// 使用期限ＦＲＯＭ
		getCndR().lmt_dt_to(bind.getDateNE(IfInptTrgtSelBase.CND_LMT_DT_TO));												// 使用期限ＴＯ
		getCndR().unreg_lmt_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_UNREG_LMT_FLG));									// 期限未設定含む
		getCndR().gd_cd(bind.getStringNE(IfInptTrgtSelBase.CND_GD_CD));													// 格付ＣＤ
		getCndR().gd_nm(bind.getStringNE(IfInptTrgtSelBase.CND_GD_NM));													// 格付名
		getCndR().positive_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_POSITIVE_FLG));										// 引当可能数：整数のみ
		getCndR().except_alloc_wait_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_EXCEPT_ALLOC_WAIT_FLG));					// 引当保留除く
		getCndR().stk_schd_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_SCHD_FLG));										// 在庫なし含む
		getCndR().grs_alloc_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_GRS_ALLOC_FLG));									// 総量引当対象の入庫予定含む
		getCndR().stk_bp_cd(bind.getStringNE(IfInptTrgtSelBase.CND_STK_BP_CD));											// 在庫取引先ＣＤ
		getCndR().stk_bp_nm(bind.getStringNE(IfInptTrgtSelBase.CND_STK_BP_NM));											// 在庫取引先名
		Cnd_asst_typ.setValue(bind.getStringNE(IfInptTrgtSelBase.CND_ASST_TYP));											// 資産区分
		Cnd_fix_no_typ.setValue(bind.getStringNE(IfInptTrgtSelBase.CND_FIX_NO_TYP));										// 確定ＮＯ区分
		getCndR().fix_no(bind.getStringNE(IfInptTrgtSelBase.CND_FIX_NO));													// 確定ＮＯ
		getCndR().pack_unit_cd(bind.getStringNE(IfInptTrgtSelBase.CND_PACK_UNIT_CD));										// 荷姿単位ＣＤ
		getCndR().pack_unit_nm(bind.getStringNE(IfInptTrgtSelBase.CND_PACK_UNIT_NM));										// 荷姿単位名
		getCndR().first_gr_dt_fr(bind.getDateNE(IfInptTrgtSelBase.CND_FIRST_GR_DT_FR));									// 最古入庫日ＦＲＯＭ
		getCndR().first_gr_dt_to(bind.getDateNE(IfInptTrgtSelBase.CND_FIRST_GR_DT_TO));									// 最古入庫日ＴＯ
		getCndR().schd_dt_fr(bind.getDateNE(IfInptTrgtSelBase.CND_SCHD_DT_FR));											// 予定日ＦＲＯＭ
		getCndR().schd_dt_to(bind.getDateNE(IfInptTrgtSelBase.CND_SCHD_DT_TO));											// 予定日ＴＯ
		getCndR().slo_wg_cd(bind.getStringNE(IfInptTrgtSelBase.CND_SLO_WG_CD));											// ワーキンググループＣＤ（受注用）
		getCndR().slo_lg_grp_cd(bind.getStringNE(IfInptTrgtSelBase.CND_SLO_LG_GRP_CD));									// 物流グループＣＤ（受注用）
		getCndR().stk_info_srch_typ(bind.getStringNE(IfInptTrgtSelBase.CND_STK_INFO_SRCH_TYP));							// 在庫情報検索区分
		getCndR().stk_info_itm_typ(bind.getStringNE(IfInptTrgtSelBase.CND_STK_INFO_ITM_TYP));								// 在庫情報品目区分
		getCndR().stk_info_loc_typ(bind.getStringNE(IfInptTrgtSelBase.CND_STK_INFO_LOC_TYP));								// 在庫情報場所区分
	}

	protected void setCndSgmtTyp(MCRow bind, Object... args) {
		// 良品区分
		getCndR().quality_typ_good_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_QUALITY_TYP_GOOD_FLG));						// 良品
		getCndR().quality_typ_dfct_oper_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_QUALITY_TYP_DFCT_OPER_FLG));				// 工程不良品
		getCndR().quality_typ_dfct_insp_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_QUALITY_TYP_DFCT_INSP_FLG));				// 検査不良品
		getCndR().quality_typ_sspnd_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_QUALITY_TYP_SSPND_FLG));						// 保留
		// 在庫検査区分
		getCndR().stk_insp_typ_yet_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_INSP_TYP_YET_FLG));						// 検査待
		getCndR().stk_insp_typ_ing_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_INSP_TYP_ING_FLG));						// 検査中
		getCndR().stk_insp_typ_wait_judg_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_INSP_TYP_WAIT_JUDG_FLG));			// 判定待
		getCndR().stk_insp_typ_fin_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_INSP_TYP_FIN_FLG));						// 検査済
		// 在庫識別区分
		getCndR().stk_id_typ_costk_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_COSTK_FLG));						// 自社在庫
		getCndR().stk_id_typ_rtn_pre_accpt_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_RTN_PRE_ACCPT_FLG));		// 返品検収前
		getCndR().stk_id_typ_cststk_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_CSTSTK_FLG));						// 預り
		getCndR().stk_id_typ_rnt_rcv_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_RNT_RCV_FLG));					// VMI
		getCndR().stk_id_typ_purc_pre_accpt_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_PURC_PRE_ACCPT_FLG));		// 仕入検収前
		getCndR().stk_id_typ_accpt_dfct_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_ACCPT_DFCT_FLG));				// 検収不良
		getCndR().stk_id_typ_ncv_rcv_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_NCV_RCV_FLG));					// 無償受給
		getCndR().stk_id_typ_onr_prov_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_ONR_PROV_FLG));					// 有償支給
		// 工場出荷承認状況区分 
		getCndR().plnt_aprv_sts_typ_opn_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_OPN_FLG));				// 未承認
		getCndR().plnt_aprv_sts_typ_acpt_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_ACPT_FLG));			// 承認済
		getCndR().plnt_aprv_sts_typ_rjct_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_RJCT_FLG));			// 却下
		getCndR().plnt_aprv_sts_typ_non_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_NON_FLG));				// 未設定
		// 市場出荷判定状況区分
		getCndR().mrkt_judg_sts_typ_opn_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_OPN_FLG));				// 未判定
		getCndR().mrkt_judg_sts_typ_acpt_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_ACPT_FLG));			// 出荷許可
		getCndR().mrkt_judg_sts_typ_not_acpt_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_NOT_ACPT_FLG));	// 出荷禁止
		getCndR().mrkt_judg_sts_typ_non_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_NON_FLG));				// 未設定
	}

	protected void setCndItmGrp(MCRow bind, Object... args) {
		if (bind.getBooleanNE(IfInptTrgtSelBase.CND_ITM_GRP_FLG1)) {
			getCndR().itm_grp_flg1(true);																// 品目分類１
			getCndR().itm_grp_cd1(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_GRP_CD1));				// 品目分類ＣＤ１
			getCndR().itm_grp_nm1(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_GRP_NM1));				// 品目分類名１
		}
		if (bind.getBooleanNE(IfInptTrgtSelBase.CND_ITM_GRP_FLG2)) {
			getCndR().itm_grp_flg2(true);																// 品目分類２
			getCndR().itm_grp_cd2(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_GRP_CD2));				// 品目分類ＣＤ２
			getCndR().itm_grp_nm2(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_GRP_NM2));				// 品目分類名２
		}
		if (bind.getBooleanNE(IfInptTrgtSelBase.CND_ITM_GRP_FLG3)) {
			getCndR().itm_grp_flg3(true);																// 品目分類３
			getCndR().itm_grp_cd3(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_GRP_CD3));				// 品目分類ＣＤ３
			getCndR().itm_grp_nm3(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_GRP_NM3));				// 品目分類名３
		}
		if (bind.getBooleanNE(IfInptTrgtSelBase.CND_ITM_GRP_FLG4)) {
			getCndR().itm_grp_flg4(true);																// 品目分類４
			getCndR().itm_grp_cd4(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_GRP_CD4));				// 品目分類ＣＤ４
			getCndR().itm_grp_nm4(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_GRP_NM4));				// 品目分類名４
		}
		if (bind.getBooleanNE(IfInptTrgtSelBase.CND_ITM_GRP_FLG5)) {
			getCndR().itm_grp_flg5(true);																// 品目分類５
			getCndR().itm_grp_cd5(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_GRP_CD5));				// 品目分類ＣＤ５
			getCndR().itm_grp_nm5(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_GRP_NM5));				// 品目分類名５
		}
		if (bind.getBooleanNE(IfInptTrgtSelBase.CND_ITM_GRP_FLG6)) {
			getCndR().itm_grp_flg6(true);																// 品目分類６
			getCndR().itm_grp_cd6(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_GRP_CD6));				// 品目分類ＣＤ６
			getCndR().itm_grp_nm6(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_GRP_NM6));				// 品目分類名６
		}
		if (bind.getBooleanNE(IfInptTrgtSelBase.CND_ITM_GRP_FLG7)) {
			getCndR().itm_grp_flg7(true);																// 品目分類７
			getCndR().itm_grp_cd7(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_GRP_CD7));				// 品目分類ＣＤ７
			getCndR().itm_grp_nm7(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_GRP_NM7));				// 品目分類名７
		}
		if (bind.getBooleanNE(IfInptTrgtSelBase.CND_ITM_GRP_FLG8)) {
			getCndR().itm_grp_flg8(true);																// 品目分類８
			getCndR().itm_grp_cd8(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_GRP_CD8));				// 品目分類ＣＤ８
			getCndR().itm_grp_nm8(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_GRP_NM8));				// 品目分類名８
		}
		if (bind.getBooleanNE(IfInptTrgtSelBase.CND_ITM_GRP_FLG9)) {
			getCndR().itm_grp_flg9(true);																// 品目分類９
			getCndR().itm_grp_cd9(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_GRP_CD9));				// 品目分類ＣＤ９
			getCndR().itm_grp_nm9(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_GRP_NM9));				// 品目分類名９
		}
		if (bind.getBooleanNE(IfInptTrgtSelBase.CND_ITM_GRP_FLG10)) {
			getCndR().itm_grp_flg10(true);																// 品目分類１０
			getCndR().itm_grp_cd10(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_GRP_CD10));				// 品目分類ＣＤ１０
			getCndR().itm_grp_nm10(bind.getStringNE(IfInptTrgtSelBase.CND_ITM_GRP_NM10));				// 品目分類名１０
		}
	}

	protected void setCndAggrDisp(MCRow bind, Object... args) {
		if (bind.contains(IfInptTrgtSelBase.CND_WG_FLG))			getCndR().wg_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_WG_FLG));						// 集計：ワーキンググループ
		if (bind.contains(IfInptTrgtSelBase.CND_VER_FLG))			getCndR().ver_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_VER_FLG));					// 集計：版ＮＯ
		if (bind.contains(IfInptTrgtSelBase.CND_LOT_FLG))			getCndR().lot_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_LOT_FLG));					// 集計：ロットＮＯ
		if (bind.contains(IfInptTrgtSelBase.CND_LOC_FLG))			getCndR().loc_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_LOC_FLG));					// 集計：場所
		if (bind.contains(IfInptTrgtSelBase.CND_SITE_FLG))			getCndR().site_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_SITE_FLG));					// 集計：工場・物流倉庫
		if (bind.contains(IfInptTrgtSelBase.CND_LG_GRP_FLG))		getCndR().lg_grp_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_LG_GRP_FLG));				// 集計：物流グループ
		if (bind.contains(IfInptTrgtSelBase.CND_ALLOC_GRP_FLG))	getCndR().alloc_grp_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_ALLOC_GRP_FLG));		// 集計：総量引当場所グループ
		if (bind.contains(IfInptTrgtSelBase.CND_LOC_GRP_FLG))		getCndR().loc_grp_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_LOC_GRP_FLG));			// 集計：製造場所グループ
		if (bind.contains(IfInptTrgtSelBase.CND_GD_FLG))			getCndR().gd_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_GD_FLG));						// 集計：格付
		if (bind.contains(IfInptTrgtSelBase.CND_SNO1_FLG))			getCndR().sno1_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_SNO1_FLG));					// 集計：手配ＮＯ１
		if (bind.contains(IfInptTrgtSelBase.CND_SNO2_FLG))			getCndR().sno2_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_SNO2_FLG));					// 集計：手配ＮＯ２
		if (bind.contains(IfInptTrgtSelBase.CND_SNO3_FLG))			getCndR().sno3_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_SNO3_FLG));					// 集計：手配ＮＯ３
		if (bind.contains(IfInptTrgtSelBase.CND_SNO4_FLG))			getCndR().sno4_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_SNO4_FLG));					// 集計：手配ＮＯ４
		if (bind.contains(IfInptTrgtSelBase.CND_STK_ID_FLG))		getCndR().stk_id_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_FLG));				// 集計：在庫識別区分
		if (bind.contains(IfInptTrgtSelBase.CND_FIX_NO_FLG))		getCndR().fix_no_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_FIX_NO_FLG));				// 集計：確定ＮＯ
		if (bind.contains(IfInptTrgtSelBase.CND_SCHD_DT_FLG))		getCndR().schd_dt_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_SCHD_DT_FLG));			// 集計：予定日
	}

	// 「在庫数コピー／引当可能数コピー」の指定
	protected void setBtnQtyCopyCond(MCRow bind, Object... args) {
		getBtnR().stk_qty_copy_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_QTY_COPY_FLG));
		getBtnR().alloc_qty_copy_flg(bind.getBooleanNE(IfInptTrgtSelBase.CND_ALLOC_QTY_COPY_FLG));
	}

	protected void checkTypSrchCond(MCRow bind, Object... args) {
		// 良品区分
		checkQualityTypCond(bind);
		// 在庫検査区分
		checkStkInspTypCond(bind);
		// 在庫識別区分
		checkStkIdTypCond(bind);
		// 工場出荷承認状況区分
		checkPlntAprvStsTypCond(bind);
		// 市場出荷判定状況区分
		checkMrktJudgStsTypCond(bind);
	}

	protected void checkQualityTypCond(MCRow bind) {
		// 良品区分（設定チェック）
		String qualityTyp = bind.getStringNE(IfInptTrgtSelBase.CND_QUALITY_TYP);
		if (!isNull(qualityTyp)) {
			if (MAC_QUALITY_TYP.isGOOD(qualityTyp)) {
				bind.setBooleanNE(IfInptTrgtSelBase.CND_QUALITY_TYP_GOOD_FLG, true);
			}
			else if (MAC_QUALITY_TYP.isDFCT_OPER(qualityTyp)) {
				bind.setBooleanNE(IfInptTrgtSelBase.CND_QUALITY_TYP_DFCT_OPER_FLG, true);
			}
			else if (MAC_QUALITY_TYP.isDFCT_INSP(qualityTyp)) {
				bind.setBooleanNE(IfInptTrgtSelBase.CND_QUALITY_TYP_DFCT_INSP_FLG, true);
			}
			else if (MAC_QUALITY_TYP.isSSPND(qualityTyp)) {
				bind.setBooleanNE(IfInptTrgtSelBase.CND_QUALITY_TYP_SSPND_FLG, true);
			}
		}

		// 良品区分（デフォルト値：良品）
		if (isFalseAnd(bind.getBooleanNE(IfInptTrgtSelBase.CND_QUALITY_TYP_GOOD_FLG),			// 良品
						bind.getBooleanNE(IfInptTrgtSelBase.CND_QUALITY_TYP_DFCT_OPER_FLG),	// 工程不良品
						bind.getBooleanNE(IfInptTrgtSelBase.CND_QUALITY_TYP_DFCT_INSP_FLG),	// 検査不良品
						bind.getBooleanNE(IfInptTrgtSelBase.CND_QUALITY_TYP_SSPND_FLG))) {	// 保留
			bind.setBooleanNE(IfInptTrgtSelBase.CND_QUALITY_TYP_GOOD_FLG, true);
		}
	}

	protected void checkStkInspTypCond(MCRow bind) {
		// 在庫検査区分（設定チェック）
		String stkInspTyp = bind.getStringNE(IfInptTrgtSelBase.CND_STK_INSP_TYP);
		if (!isNull(stkInspTyp)) {
			if (MSC_STK_INSP_TYP.isYET(stkInspTyp)) {
				bind.setBooleanNE(IfInptTrgtSelBase.CND_STK_INSP_TYP_YET_FLG, true);
			}
			else if (MSC_STK_INSP_TYP.isING(stkInspTyp)) {
				bind.setBooleanNE(IfInptTrgtSelBase.CND_STK_INSP_TYP_ING_FLG, true);
			}
			else if (MSC_STK_INSP_TYP.isWAIT_JUDG(stkInspTyp)) {
				bind.setBooleanNE(IfInptTrgtSelBase.CND_STK_INSP_TYP_WAIT_JUDG_FLG, true);
			}
			else if (MSC_STK_INSP_TYP.isFIN(stkInspTyp)) {
				bind.setBooleanNE(IfInptTrgtSelBase.CND_STK_INSP_TYP_FIN_FLG, true);
			}
		}

		// 在庫検査区分（デフォルト値：検査済）
		if (isFalseAnd(bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_INSP_TYP_YET_FLG),				// 検査待
						bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_INSP_TYP_ING_FLG),			// 検査中
						bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_INSP_TYP_WAIT_JUDG_FLG),		// 判定待
						bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_INSP_TYP_FIN_FLG))) {			// 検査済
			bind.setBooleanNE(IfInptTrgtSelBase.CND_STK_INSP_TYP_FIN_FLG, true);
		}
	}

	protected void checkStkIdTypCond(MCRow bind) {
		// 在庫識別区分（設定チェック）
		String stkIdTyp = bind.getStringNE(IfInptTrgtSelBase.CND_STK_ID_TYP);
		if (!isNull(stkIdTyp)) {
			if (MSC_STK_ID_TYP.isCOSTK(stkIdTyp)) {
				bind.setBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_COSTK_FLG, true);
			}
			else if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(stkIdTyp)) {
				bind.setBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_RTN_PRE_ACCPT_FLG, true);
			}
			else if (MSC_STK_ID_TYP.isCSTSTK(stkIdTyp)) {
				bind.setBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_CSTSTK_FLG, true);
			}
			else if (MSC_STK_ID_TYP.isRNT_RCV(stkIdTyp)) {
				bind.setBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_RNT_RCV_FLG, true);
			}
			else if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(stkIdTyp)) {
				bind.setBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_PURC_PRE_ACCPT_FLG, true);
			}
			else if (MSC_STK_ID_TYP.isACCPT_DFCT(stkIdTyp)) {
				bind.setBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_ACCPT_DFCT_FLG, true);
			}
			else if (MSC_STK_ID_TYP.isNCV_RCV(stkIdTyp)) {
				bind.setBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_NCV_RCV_FLG, true);
			}
			else if (MSC_STK_ID_TYP.isONR_PROV(stkIdTyp)) {
				bind.setBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_ONR_PROV_FLG, true);
			}
		}

		// 在庫識別区分（デフォルト値：自社在庫）
		if (isFalseAnd(bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_COSTK_FLG),				// 自社在庫
						bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_RTN_PRE_ACCPT_FLG),	// 返品検収前
						bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_CSTSTK_FLG),			// 預り
						bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_RNT_RCV_FLG),			// VMI
						bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_PURC_PRE_ACCPT_FLG),	// 仕入検収前
						bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_ACCPT_DFCT_FLG),		// 検収不良
						bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_NCV_RCV_FLG),			// 無償受給
						bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_ONR_PROV_FLG))) {		// 有償支給
			bind.setBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_COSTK_FLG, true);
		}
	}

	protected void checkPlntAprvStsTypCond(MCRow bind) {
		// 工場出荷承認状況区分（設定チェック）
		String plntAprvStsTyp = bind.getStringNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP);
		if (!isNull(plntAprvStsTyp)) {
			if (MSC_PLNT_APRV_STS_TYP.isOPN(plntAprvStsTyp)) {
				bind.setBooleanNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_OPN_FLG, true);
			}
			else if (MSC_PLNT_APRV_STS_TYP.isACPT(plntAprvStsTyp)) {
				bind.setBooleanNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_ACPT_FLG, true);
			}
			else if (MSC_PLNT_APRV_STS_TYP.isRJCT(plntAprvStsTyp)) {
				bind.setBooleanNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_RJCT_FLG, true);
			}
		}

		// 工場出荷承認状況区分（デフォルト値：全て）
		if (isFalseAnd(bind.getBooleanNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_OPN_FLG),		// 未承認
						bind.getBooleanNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_ACPT_FLG),		// 承認済
						bind.getBooleanNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_RJCT_FLG),		// 却下
						bind.getBooleanNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_NON_FLG))) {	// 未設定
			bind.setBooleanNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_OPN_FLG, true);
			bind.setBooleanNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_ACPT_FLG, true);
			bind.setBooleanNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_RJCT_FLG, true);
			bind.setBooleanNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_NON_FLG, true);
		}
	}

	protected void checkMrktJudgStsTypCond(MCRow bind) {
		if (!isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "1")) {
			bind.setBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_OPN_FLG, true);
			bind.setBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_ACPT_FLG, true);
			bind.setBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_NOT_ACPT_FLG, true);
			bind.setBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_NON_FLG, true);
		}
		else {
			// 市場出荷判定状況区分（設定チェック）
			String mrktJudgStsTyp = bind.getStringNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP);
			if (!isNull(mrktJudgStsTyp)) {
				if (MSC_MRKT_JUDG_STS_TYP.isOPN(mrktJudgStsTyp)) {
					bind.setBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_OPN_FLG, true);
				}
				else if (MSC_MRKT_JUDG_STS_TYP.isACPT(mrktJudgStsTyp)) {
					bind.setBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_ACPT_FLG, true);
				}
				else if (MSC_MRKT_JUDG_STS_TYP.isNOT_ACPT(mrktJudgStsTyp)) {
					bind.setBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_NOT_ACPT_FLG, true);
				}
			}

			// 市場出荷判定状況区分（デフォルト値：全て）
			if (isFalseAnd(bind.getBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_OPN_FLG),			// 未判定
							bind.getBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_ACPT_FLG),			// 出荷許可
							bind.getBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_NOT_ACPT_FLG),		// 出荷禁止
							bind.getBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_NON_FLG))) {		// 未設定
				bind.setBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_OPN_FLG, true);
				bind.setBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_ACPT_FLG, true);
				bind.setBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_NOT_ACPT_FLG, true);
				bind.setBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_NON_FLG, true);
			}
		}
	}

	protected boolean isFalseAnd(boolean...args) {
		boolean isAllFalse = true;
		for (int i=0 ; i < args.length ; i++) {
			if (args[i]) {
				isAllFalse = false;
				break;
			}
		}

		return isAllFalse;
	}

	/**
	 * 画面表示制御を行う。
	 * @param bind
	 * @param args
	 */
	protected void ctrlDispAfterOpenByInitParam(MCRow bind, Object... args) {
		if (bind == null) {
			return;
		}
		// 操作種別の制御
		setCndOpeMode();
		// 検索条件の区分項目の入力制御
		setTypSrchCond(bind, args);
		// 検索条件の非入力制御（遷移元画面より）
		setCndEditableToReadOnly();
		// 期限未設定含む
		resetUnregLmtFlg();
	}

	protected void setCndOpeMode() {
		if (!isOpeCanBeChanged()) {
			if(!Cnd_ope_ADD.isSelected()) Cnd_ope_ADD.setMode(MCMode.READ_ONLY);
			if(!Cnd_ope_UPD.isSelected()) Cnd_ope_UPD.setMode(MCMode.READ_ONLY);
		}
	}

	protected boolean isOpeCanBeChanged() {
		IfInptTrgtSelBase p = getTargetPanel();
		if (p == null) {
			return false;
		}

		MCTable<?> t = p.getInptTable(_parts);
		if (t == null) {
			return false;
		}

		int idx = -1;
		MCRow row = t.getSelectedMCRow();
		if (row != null && !row.isStatusDelete()) {
			idx = row.getGUIIndex();
		}

		boolean e0 = p.isOpeTypEnable(_parts, idx, IfInptTrgtSelBase.OPE_INS);
		boolean e1 = p.isOpeTypEnable(_parts, idx, IfInptTrgtSelBase.OPE_UPD);
		if (!e0 || !e1) {
			return false;
		}

		return true;
	}

	protected void setTypSrchCond(MCRow bind, Object... args) {
		// 良品区分
		setQualityTyp(bind);
		// 在庫検査区分
		setStkInspTyp(bind);
		// 在庫識別区分
		setStkIdTyp(bind);
		// 工場出荷承認状況区分
		setPlntAprvStsTyp(bind);
		// 市場出荷判定状況区分
		setMrktJudgStsTyp(bind);
	}

	protected void setQualityTyp(MCRow bind) {
		// 良品区分
		if (isOneTrue(bind.getBooleanNE(IfInptTrgtSelBase.CND_QUALITY_TYP_GOOD_FLG),				// 良品
						bind.getBooleanNE(IfInptTrgtSelBase.CND_QUALITY_TYP_DFCT_OPER_FLG),		// 工程不良品
						bind.getBooleanNE(IfInptTrgtSelBase.CND_QUALITY_TYP_DFCT_INSP_FLG),		// 検査不良品
						bind.getBooleanNE(IfInptTrgtSelBase.CND_QUALITY_TYP_SSPND_FLG))) {		// 保留
			Cnd_quality_typ_good_flg.setMode(MCMode.READ_ONLY);
			Cnd_quality_typ_dfct_oper_flg.setMode(MCMode.READ_ONLY);
			Cnd_quality_typ_dfct_insp_flg.setMode(MCMode.READ_ONLY);
			Cnd_quality_typ_sspnd_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_QUALITY_TYP_GOOD_FLG))			Cnd_quality_typ_good_flg.setMode(MCMode.READ_ONLY);
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_QUALITY_TYP_DFCT_OPER_FLG))		Cnd_quality_typ_dfct_oper_flg.setMode(MCMode.READ_ONLY);
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_QUALITY_TYP_DFCT_INSP_FLG))		Cnd_quality_typ_dfct_insp_flg.setMode(MCMode.READ_ONLY);
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_QUALITY_TYP_SSPND_FLG))			Cnd_quality_typ_sspnd_flg.setMode(MCMode.READ_ONLY);
		}
	}

	protected void setStkInspTyp(MCRow bind) {
		// 在庫検査区分
		if (isOneTrue(bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_INSP_TYP_YET_FLG),				// 検査待
						bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_INSP_TYP_ING_FLG),			// 検査中
						bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_INSP_TYP_WAIT_JUDG_FLG),		// 判定待
						bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_INSP_TYP_FIN_FLG))) {			// 検査済
			Cnd_stk_insp_typ_yet_flg.setMode(MCMode.READ_ONLY);
			Cnd_stk_insp_typ_ing_flg.setMode(MCMode.READ_ONLY);
			Cnd_stk_insp_typ_wait_judg_flg.setMode(MCMode.READ_ONLY);
			Cnd_stk_insp_typ_fin_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_INSP_TYP_YET_FLG))			Cnd_stk_insp_typ_yet_flg.setMode(MCMode.READ_ONLY);
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_INSP_TYP_ING_FLG))			Cnd_stk_insp_typ_ing_flg.setMode(MCMode.READ_ONLY);
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_INSP_TYP_WAIT_JUDG_FLG))	Cnd_stk_insp_typ_wait_judg_flg.setMode(MCMode.READ_ONLY);
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_INSP_TYP_FIN_FLG))			Cnd_stk_insp_typ_fin_flg.setMode(MCMode.READ_ONLY);
		}
	}

	protected void setStkIdTyp(MCRow bind) {
		// 在庫識別区分
		if (isOneTrue(bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_COSTK_FLG),				// 自社在庫
						bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_RTN_PRE_ACCPT_FLG),	// 返品検収前
						bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_CSTSTK_FLG),			// 預り
						bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_RNT_RCV_FLG),			// VMI
						bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_PURC_PRE_ACCPT_FLG),	// 仕入検収前
						bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_ACCPT_DFCT_FLG),		// 検収不良
						bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_NCV_RCV_FLG),			// 無償受給
						bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_ONR_PROV_FLG))) {		// 有償支給
			Cnd_stk_id_typ_costk_flg.setMode(MCMode.READ_ONLY);
			Cnd_stk_id_typ_rtn_pre_accpt_flg.setMode(MCMode.READ_ONLY);
			Cnd_stk_id_typ_cststk_flg.setMode(MCMode.READ_ONLY);
			Cnd_stk_id_typ_rnt_rcv_flg.setMode(MCMode.READ_ONLY);
			Cnd_stk_id_typ_purc_pre_accpt_flg.setMode(MCMode.READ_ONLY);
			Cnd_stk_id_typ_accpt_dfct_flg.setMode(MCMode.READ_ONLY);
			Cnd_stk_id_typ_ncv_rcv_flg.setMode(MCMode.READ_ONLY);
			Cnd_stk_id_typ_onr_prov_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_COSTK_FLG))				Cnd_stk_id_typ_costk_flg.setMode(MCMode.READ_ONLY);
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_RTN_PRE_ACCPT_FLG))		Cnd_stk_id_typ_rtn_pre_accpt_flg.setMode(MCMode.READ_ONLY);
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_CSTSTK_FLG))				Cnd_stk_id_typ_cststk_flg.setMode(MCMode.READ_ONLY);
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_RNT_RCV_FLG))			Cnd_stk_id_typ_rnt_rcv_flg.setMode(MCMode.READ_ONLY);
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_PURC_PRE_ACCPT_FLG))		Cnd_stk_id_typ_purc_pre_accpt_flg.setMode(MCMode.READ_ONLY);
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_ACCPT_DFCT_FLG))			Cnd_stk_id_typ_accpt_dfct_flg.setMode(MCMode.READ_ONLY);
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_NCV_RCV_FLG))			Cnd_stk_id_typ_ncv_rcv_flg.setMode(MCMode.READ_ONLY);
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_STK_ID_TYP_ONR_PROV_FLG))			Cnd_stk_id_typ_onr_prov_flg.setMode(MCMode.READ_ONLY);
		}
	}

	protected void setPlntAprvStsTyp(MCRow bind) {
		// 工場出荷承認状況区分
		if (isOneTrue(bind.getBooleanNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_OPN_FLG),		// 未承認
						bind.getBooleanNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_ACPT_FLG),		// 承認済
						bind.getBooleanNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_RJCT_FLG),		// 却下
						bind.getBooleanNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_NON_FLG))) {	// 未設定
			Cnd_plnt_aprv_sts_typ_opn_flg.setMode(MCMode.READ_ONLY);
			Cnd_plnt_aprv_sts_typ_acpt_flg.setMode(MCMode.READ_ONLY);
			Cnd_plnt_aprv_sts_typ_rjct_flg.setMode(MCMode.READ_ONLY);
			Cnd_plnt_aprv_sts_typ_non_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_OPN_FLG))			Cnd_plnt_aprv_sts_typ_opn_flg.setMode(MCMode.READ_ONLY);
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_ACPT_FLG))		Cnd_plnt_aprv_sts_typ_acpt_flg.setMode(MCMode.READ_ONLY);
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_RJCT_FLG))		Cnd_plnt_aprv_sts_typ_rjct_flg.setMode(MCMode.READ_ONLY);
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_NON_FLG))			Cnd_plnt_aprv_sts_typ_non_flg.setMode(MCMode.READ_ONLY);
		}
	}

	protected void setMrktJudgStsTyp(MCRow bind) {
		// 市場出荷判定状況区分
		if (isOneTrue(bind.getBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_OPN_FLG),			// 未判定
						bind.getBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_ACPT_FLG),			// 出荷許可
						bind.getBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_NOT_ACPT_FLG),		// 出荷禁止
						bind.getBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_NON_FLG))) {		// 未設定
			Cnd_mrkt_judg_sts_typ_opn_flg.setMode(MCMode.READ_ONLY);
			Cnd_mrkt_judg_sts_typ_acpt_flg.setMode(MCMode.READ_ONLY);
			Cnd_mrkt_judg_sts_typ_not_acpt_flg.setMode(MCMode.READ_ONLY);
			Cnd_mrkt_judg_sts_typ_non_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_OPN_FLG))				Cnd_mrkt_judg_sts_typ_opn_flg.setMode(MCMode.READ_ONLY);
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_ACPT_FLG))			Cnd_mrkt_judg_sts_typ_acpt_flg.setMode(MCMode.READ_ONLY);
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_NOT_ACPT_FLG))		Cnd_mrkt_judg_sts_typ_not_acpt_flg.setMode(MCMode.READ_ONLY);
			if (!bind.getBooleanNE(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_NON_FLG))				Cnd_mrkt_judg_sts_typ_non_flg.setMode(MCMode.READ_ONLY);
		}
	}

	protected boolean isOneTrue(boolean...args) {
		int trueCnt = 0;
		for (int i=0 ; i < args.length ; i++) {
			if (args[i]) {
				trueCnt++;
			}
		}

		if (trueCnt == 1) {
			return true;
		}

		return false;
	}

	protected void setCndEditableToReadOnly() {
		Map<String, MCModeBeans> cndMap = getCtrlModeCnd();
		if (cndMap == null || cndMap.isEmpty()) {
			return;
		}

		MCModeBeans cndBean;
		for (Map.Entry<String,MCModeBeans> entry : cndMap.entrySet()) {
			cndBean = entry.getValue();
			if (cndBean == null) {
				continue;
			}

			if (!getTargetPanel().isInptTrgtSelCndEnable(_ope_val, entry.getKey(), getTargetPanel().getInptTable(_parts))) {
				cndBean.setMode(MCMode.READ_ONLY);
			}
			else {
				cndBean.setMode(getDefaultMode(cndBean));
			}
		}
	}

	protected void chkRoAndValue() {
		Map<String, MCModeBeans> cndMap = getCtrlModeCndTgt();
		if (cndMap == null || cndMap.isEmpty()) {
			return;
		}

		int itmSubTyp = getItmSubTyp(this);
		String[] itmSub = {IfInptTrgtSelBase.CND_ITM_SUB1, IfInptTrgtSelBase.CND_ITM_SUB2, IfInptTrgtSelBase.CND_ITM_SUB3};

		int snoTyp = getSnoTyp(this);
		String[] sno = {IfInptTrgtSelBase.CND_SNO1, IfInptTrgtSelBase.CND_SNO2, IfInptTrgtSelBase.CND_SNO3, IfInptTrgtSelBase.CND_SNO4};

		MCModeBeans cndBean;
		String key;
		boolean flg;
		for (Map.Entry<String,MCModeBeans> entry : cndMap.entrySet()) {
			cndBean = entry.getValue();
			if (cndBean == null) {
				continue;
			}
			key = entry.getKey();
			if (MCMode.isDisable(cndBean) && getCndR().isEmpty(key)) {
				flg = true;
				for (int i = 0; i < itmSub.length; i++) {
					if (isSame(key, itmSub[i]) && i >= itmSubTyp) {
						flg = false;
					}
				}
				for (int i = 0; i < sno.length; i++) {
					if (isSame(key, sno[i]) && i >= snoTyp) {
						flg = false;
					}
				}
				if (flg) {
					throw new MCAppException(MSBEP0019, cndBean.getMessageByLocale());
				}
			}
		}
	}

	// ------------------------------------------ 検索条件を設定するサンプル関数. ------------------------------------------
	/**
	 * 投入対象選択画面呼び出す時、検索条件の設定方法（サンプル）
	 * @param bind 検索条件
	 * @param fr 設定元データ
	 */
	protected void setBindVal(MCRow bind, RsltR fr) {
		bind.addStringColumn(IfInptTrgtSelBase.CND_OPE, IfInptTrgtSelBase.OPE_INS);							// IfInptTrgtSelBase.OPE_INS: 行追加, IfInptTrgtSelBase.OPE_UPD: フォーカス行に反映
		bind.addStringColumn(IfInptTrgtSelBase.CND_LOC_CD, fr.loc_cd());										// 場所ＣＤ
		bind.addStringColumn(IfInptTrgtSelBase.CND_LOC_NM, fr.loc_nm());										// 場所名
		bind.addStringColumn(IfInptTrgtSelBase.CND_STR_LN_CD, fr.str_ln_cd());									// 棚・ラインＣＤ
		bind.addStringColumn(IfInptTrgtSelBase.CND_STR_LN_NM, fr.str_ln_nm());									// 棚・ライン名
		bind.addStringColumn(IfInptTrgtSelBase.CND_STK_ARRV_BP_CD, fr.stk_arrv_bp_cd());						// 在庫着荷先ＣＤ
		bind.addStringColumn(IfInptTrgtSelBase.CND_STK_ARRV_BP_NM, fr.stk_arrv_bp_nm());						// 在庫着荷先名
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_ONLY_INT_FLG, true);										// 納品先・配送先在庫を除く
		bind.addStringColumn(IfInptTrgtSelBase.CND_SITE_CD, fr.site_cd());										// 工場・物流倉庫ＣＤ
		bind.addStringColumn(IfInptTrgtSelBase.CND_SITE_NM, fr.site_nm());										// 工場・物流倉庫名
		bind.addStringColumn(IfInptTrgtSelBase.CND_WG_CD, fr.wg_cd());											// ワーキンググループＣＤ
		bind.addStringColumn(IfInptTrgtSelBase.CND_WG_NM, fr.wg_nm());											// ワーキンググループ名
		bind.addStringColumn(IfInptTrgtSelBase.CND_LG_GRP_CD, fr.lg_grp_cd());									// 物流グループＣＤ
		bind.addStringColumn(IfInptTrgtSelBase.CND_LG_GRP_NM, fr.lg_grp_nm());									// 物流グループ名
		bind.addStringColumn(IfInptTrgtSelBase.CND_ALLOC_GRP_CD, fr.alloc_grp_cd());							// 総量引当場所グループＣＤ
		bind.addStringColumn(IfInptTrgtSelBase.CND_ALLOC_GRP_NM, fr.alloc_grp_nm());							// 総量引当場所グループ名
		bind.addStringColumn(IfInptTrgtSelBase.CND_LOC_GRP_CD, fr.loc_grp_cd());								// 製造場所グループＣＤ
		bind.addStringColumn(IfInptTrgtSelBase.CND_LOC_GRP_NM, fr.loc_grp_nm());								// 製造場所グループ名
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_TYP, "fr.itm_typ");										// 品目区分
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_TYP_D_CD, "fr.itm_typ_d_cd");							// 品目区分詳細
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_TYP_D_NM, "fr.itm_typ_d_nm");							// 品目区分詳細名
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_CD, fr.itm_cd());										// 品目ＣＤ
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_SUB1, fr.itm_sub1());									// 枝番１
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_SUB2, fr.itm_sub2());									// 枝番２
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_SUB3, fr.itm_sub3());									// 枝番３
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_NM, fr.itm_nm());										// 品名
		bind.addStringColumn(IfInptTrgtSelBase.CND_VER_NO, fr.ver_no());										// 版ＮＯ
		bind.addStringColumn(IfInptTrgtSelBase.CND_LOT_NO, fr.lot_no());										// ロットＮＯ
		bind.addStringColumn(IfInptTrgtSelBase.CND_SUBLOT_NO, fr.sublot_no());									// サブロットＮＯ
		bind.addStringColumn(IfInptTrgtSelBase.CND_BP_LOT_NO, fr.bp_lot_no());									// 業者ロットＮＯ
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_SNO1_NULL_FLG, true);										// 手配ＮＯ１無し可
		bind.addStringColumn(IfInptTrgtSelBase.CND_SNO1, fr.sno1());											// 手配ＮＯ１
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_SNO2_NULL_FLG, true);										// 手配ＮＯ２無し可
		bind.addStringColumn(IfInptTrgtSelBase.CND_SNO2, fr.sno2());											// 手配ＮＯ２
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_SNO3_NULL_FLG, true);										// 手配ＮＯ３無し可
		bind.addStringColumn(IfInptTrgtSelBase.CND_SNO3, fr.sno3());											// 手配ＮＯ３
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_SNO4_NULL_FLG, true);										// 手配ＮＯ４無し可
		bind.addStringColumn(IfInptTrgtSelBase.CND_SNO4, fr.sno4());											// 手配ＮＯ４
		bind.addStringColumn(IfInptTrgtSelBase.CND_WRK_NO, fr.wrk_no());										// 案件ＮＯ
		bind.addStringColumn(IfInptTrgtSelBase.CND_WRK_NM, fr.wrk_nm());										// 案件名
		bind.addDateColumn(IfInptTrgtSelBase.CND_VLD_DT_FR, getToday());										// 有効期限ＦＲＯＭ
		bind.addDateColumn(IfInptTrgtSelBase.CND_VLD_DT_TO, getToday());										// 有効期限ＴＯ
		bind.addDateColumn(IfInptTrgtSelBase.CND_LMT_DT_FR, getToday());										// 使用期限ＦＲＯＭ
		bind.addDateColumn(IfInptTrgtSelBase.CND_LMT_DT_TO, getToday());										// 使用期限ＴＯ
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_UNREG_LMT_FLG, true);										// 期限未設定含む
		bind.addStringColumn(IfInptTrgtSelBase.CND_GD_CD, fr.gd_cd());											// 格付ＣＤ
		bind.addStringColumn(IfInptTrgtSelBase.CND_GD_NM, fr.gd_nm());											// 格付名
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_POSITIVE_FLG, true);										// 引当可能数：整数のみ
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_EXCEPT_ALLOC_WAIT_FLG, false);							// 引当保留除く
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_STK_SCHD_FLG, true);										// 在庫なし含む
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_GRS_ALLOC_FLG, false);									// 総量引当対象の入庫予定含む
		// チェックボックス区分：単独指定
		bind.addStringColumn(IfInptTrgtSelBase.CND_QUALITY_TYP, MAC_QUALITY_TYP.GOOD.value());				// 良品区分
		bind.addStringColumn(IfInptTrgtSelBase.CND_STK_INSP_TYP, MSC_STK_INSP_TYP.FIN.value());				// 在庫検査区分
		bind.addStringColumn(IfInptTrgtSelBase.CND_STK_ID_TYP, MSC_STK_ID_TYP.COSTK.value());					// 在庫識別区分
		// チェックボックス区分：複数指定
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_QUALITY_TYP_GOOD_FLG, true);								// 良品
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_QUALITY_TYP_DFCT_OPER_FLG, true);						// 工程不良品
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_QUALITY_TYP_DFCT_INSP_FLG, true);						// 検査不良品
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_QUALITY_TYP_SSPND_FLG, true);							// 保留
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_STK_INSP_TYP_YET_FLG, true);								// 検査待
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_STK_INSP_TYP_ING_FLG, true);								// 検査中
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_STK_INSP_TYP_WAIT_JUDG_FLG, true);						// 判定待
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_STK_INSP_TYP_FIN_FLG, true);								// 検査済
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_STK_ID_TYP_COSTK_FLG, true);								// 自社在庫
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_STK_ID_TYP_RTN_PRE_ACCPT_FLG, true);					// 返品検収前
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_STK_ID_TYP_CSTSTK_FLG, true);							// 預り
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_STK_ID_TYP_RNT_RCV_FLG, true);							// VMI
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_STK_ID_TYP_PURC_PRE_ACCPT_FLG, true);					// 仕入検収前
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_STK_ID_TYP_ACCPT_DFCT_FLG, true);						// 検収不良
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_STK_ID_TYP_NCV_RCV_FLG, true);							// 無償受給
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_STK_ID_TYP_ONR_PROV_FLG, true);							// 有償支給

		bind.addStringColumn(IfInptTrgtSelBase.CND_STK_BP_CD, fr.stk_bp_cd());									// 在庫取引先ＣＤ
		bind.addStringColumn(IfInptTrgtSelBase.CND_STK_BP_NM, fr.stk_bp_nm());									// 在庫取引先名
		bind.addStringColumn(IfInptTrgtSelBase.CND_ASST_TYP, fr.asst_typ());									// 資産区分
		bind.addStringColumn(IfInptTrgtSelBase.CND_FIX_NO_TYP, fr.fix_no_typ());								// 確定ＮＯ区分
		bind.addStringColumn(IfInptTrgtSelBase.CND_FIX_NO, fr.fix_no());										// 確定ＮＯ
		bind.addStringColumn(IfInptTrgtSelBase.CND_PACK_UNIT_CD, fr.pack_unit_cd());							// 荷姿単位ＣＤ
		bind.addStringColumn(IfInptTrgtSelBase.CND_PACK_UNIT_NM, fr.pack_unit_nm());							// 荷姿単位名
		bind.addDateColumn(IfInptTrgtSelBase.CND_FIRST_GR_DT_FR, getToday());									// 最古入庫日ＦＲＯＭ
		bind.addDateColumn(IfInptTrgtSelBase.CND_FIRST_GR_DT_TO, getToday());									// 最古入庫日ＴＯ
		bind.addDateColumn(IfInptTrgtSelBase.CND_SCHD_DT_FR, getToday());										// 予定日ＦＲＯＭ
		bind.addDateColumn(IfInptTrgtSelBase.CND_SCHD_DT_TO, getToday());										// 予定日ＴＯ

		// チェックボックス区分：単独指定
		bind.addStringColumn(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP, MSC_PLNT_APRV_STS_TYP.ACPT.value());	// 工場出荷承認状況区分 
		bind.addStringColumn(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP, MSC_MRKT_JUDG_STS_TYP.ACPT.value());	// 市場出荷判定状況区分
		// チェックボックス区分：複数指定
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_OPN_FLG, true);						// 未承認
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_ACPT_FLG, true);						// 承認済
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_RJCT_FLG, true);						// 却下
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_PLNT_APRV_STS_TYP_NON_FLG, true);						// 未設定
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_OPN_FLG, true);						// 未判定
		bind.addBooleanColumn(IfInptTrgtSelBase. CND_MRKT_JUDG_STS_TYP_ACPT_FLG, true);						// 出荷許可
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_NOT_ACPT_FLG, true);					// 出荷禁止
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_MRKT_JUDG_STS_TYP_NON_FLG, true);						// 未設定

		// 非表示項目
		bind.addStringColumn(IfInptTrgtSelBase.CND_SLO_WG_CD, "fr.slo_wg_cd");									// ワーキンググループＣＤ（受注用）
		bind.addStringColumn(IfInptTrgtSelBase.CND_SLO_LG_GRP_CD, "fr.slo_lg_grp_cd");							// 物流グループＣＤ（受注用）
		bind.addStringColumn(IfInptTrgtSelBase.CND_STK_INFO_SRCH_TYP, "fr.stk_info_srch_typ");				// 在庫情報検索区分
		bind.addStringColumn(IfInptTrgtSelBase.CND_STK_INFO_ITM_TYP, "fr.stk_info_itm_typ");					// 在庫情報品目区分
		bind.addStringColumn(IfInptTrgtSelBase.CND_STK_INFO_LOC_TYP, "fr.stk_info_loc_typ");					// 在庫情報場所区分

		// 品目分類
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_ITM_GRP_FLG1, false);										// 品目分類１
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_GRP_CD1, "fr.itm_grp_cd1");								// 品目分類ＣＤ１
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_GRP_NM1, "fr.itm_grp_nm1");								// 品目分類名１
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_ITM_GRP_FLG2, false);										// 品目分類２
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_GRP_CD2, "fr.itm_grp_cd2");								// 品目分類ＣＤ２
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_GRP_NM2, "fr.itm_grp_nm2");								// 品目分類名２
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_ITM_GRP_FLG3, false);										// 品目分類３
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_GRP_CD3, "fr.itm_grp_cd3");								// 品目分類ＣＤ３
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_GRP_NM3, "fr.itm_grp_nm3");								// 品目分類名３
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_ITM_GRP_FLG4, false);										// 品目分類４
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_GRP_CD4, "fr.itm_grp_cd4");								// 品目分類ＣＤ４
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_GRP_NM4, "fr.itm_grp_nm4");								// 品目分類名４
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_ITM_GRP_FLG5, false);										// 品目分類５
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_GRP_CD5, "fr.itm_grp_cd5");								// 品目分類ＣＤ５
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_GRP_NM5, "fr.itm_grp_nm5");								// 品目分類名５
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_ITM_GRP_FLG6, false);										// 品目分類６
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_GRP_CD6, "fr.itm_grp_cd6");								// 品目分類ＣＤ６
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_GRP_NM6, "fr.itm_grp_nm6");								// 品目分類名６
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_ITM_GRP_FLG7, false);										// 品目分類７
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_GRP_CD7, "fr.itm_grp_cd7");								// 品目分類ＣＤ７
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_GRP_NM7, "fr.itm_grp_nm7");								// 品目分類名７
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_ITM_GRP_FLG8, false);										// 品目分類８
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_GRP_CD8, "fr.itm_grp_cd8");								// 品目分類ＣＤ８
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_GRP_NM8, "fr.itm_grp_nm8");								// 品目分類名８
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_ITM_GRP_FLG9, false);										// 品目分類９
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_GRP_CD9, "fr.itm_grp_cd9");								// 品目分類ＣＤ９
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_GRP_NM9, "fr.itm_grp_nm9");								// 品目分類名９
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_ITM_GRP_FLG10, false);									// 品目分類１０
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_GRP_CD10, "fr.itm_grp_cd10");							// 品目分類ＣＤ１０
		bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_GRP_NM10, "fr.itm_grp_nm10");							// 品目分類名１０

		// 集計条件
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_WG_FLG, true);												// 集計：ワーキンググループ
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_VER_FLG, true);											// 集計：版ＮＯ
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_LOT_FLG, true);											// 集計：ロットＮＯ
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_LOC_FLG, true);											// 集計：場所
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_LG_GRP_FLG, true);										// 集計：工場・物流倉庫
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_ALLOC_GRP_FLG, true);										// 集計：物流グループ
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_LOC_GRP_FLG, true);										// 集計：総量引当場所グループ
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_GD_FLG, true);												// 集計：製造場所グループ
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_STK_ID_FLG, true);										// 集計：格付
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_SNO1_FLG, true);											// 集計：手配ＮＯ１
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_SNO2_FLG, true);											// 集計：手配ＮＯ２
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_SNO3_FLG, true);											// 集計：手配ＮＯ３
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_SNO4_FLG, true);											// 集計：手配ＮＯ４
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_STK_ID_FLG, true);										// 集計：在庫識別区分
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_FIX_NO_FLG, true);										// 集計：確定ＮＯ
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_SCHD_DT_FLG, true);										// 集計：予定日

		// フッター
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_STK_QTY_COPY_FLG, true);									// 在庫数コピー
		bind.addBooleanColumn(IfInptTrgtSelBase.CND_ALLOC_QTY_COPY_FLG, true);								// 引当可能数コピー
	}

	@Override
	protected void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();

		MCBeans[] bs = getInvisibleBeans();
		if (bs != null) {
			setComponentInvisibleAllStatus(bs);
		}
	}

	protected MCBeans[] getInvisibleBeans() {
		boolean mfgAprvEnable = isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "1");

		if (!mfgAprvEnable) {
			return getMfgAprvInvisibleBeans();
		}
		return null;
	}

	protected MCBeans[] getMfgAprvInvisibleBeans() {
		return mcframe.commonCore.util.MCCollectionUtil.concat(
				new MCBeans[] {Cnd_mrkt_judg_sts_typ_opn_flg, Cnd_mrkt_judg_sts_typ_acpt_flg,
						Cnd_mrkt_judg_sts_typ_not_acpt_flg, Cnd_mrkt_judg_sts_typ_non_flg,
						columnRslt_mrkt_judg_sts_typ, columnRslt_mrkt_judg_sts_typ_nm});
	}

}