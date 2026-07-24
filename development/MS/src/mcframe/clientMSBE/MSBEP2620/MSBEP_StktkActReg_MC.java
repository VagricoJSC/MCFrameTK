package mcframe.clientMSBE.MSBEP2620;

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
import mcframe.clientMAUB.MAUBP0080.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMSUB.MSUBP5030.*;
import mcframe.clientMSUB.MSUBP5050.*;
import mcframe.clientMSUB.MSUBP5060.*;

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
import mcframe.clientCore.container.MCRowStatusListener;
import mcframe.clientCore.container.MCRowStatusEvent;
import mcframe.clientMAUD.MAUDP0010.IfListRegPanel;
import static mcframe.clientMAUC.MAUCP0100.MAUCP_AmtUtil.*;
import static mcframe.clientMAUC.MAUCP0080.MAUCP_StdUpriUtil.*;
import mcframe.clientFXBA.FXBAP0100.*;
import mcframe.clientCore.beans.popup.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_StktkActReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_StktkActReg_MC extends MSBEP_StktkActReg_MC_A implements IfListRegPanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_StktkActReg_MC() {
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
	public MSBEP_StktkActReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL2620_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2620_Srch01Caller<P extends MSBEP_StktkActReg, B extends MS_MSBEL2620_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2620_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			setDLMode();
		}
		@Override
		protected void setMode() {
			super.setMode();
			setStatusAfterSrch();
			for (RsltR r : RsltTable.getViewRows()) {
				if (!r.isEmpty()) {
					r.use_diff_flg(InputMtd_input_mtd_DIFF.isSelected());
				}
			}
		}
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			Ctrl_ctrl_PPanel.expand(true);
			setBtnMode();
		}
	}

	/**
	 * [MS_MSBEL2620_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2620_Imp01Caller<P extends MSBEP_StktkActReg, B extends MS_MSBEL2620_Imp01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MS_MSBEL2620_Imp01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();

			setUPDStatus();
		}
		protected boolean hasNg() {
			if (!isNull(bridge.down0().getFirst(RsltR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value()))) {
				return true;
			}
			return false;
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			// ファイル入力前に一括設定用の項目に値が入っていると、全選択と同時に値が上書きされてしまうため
			// 全選択を行わなくても登録できるようにチェックをオンにしている
			for (RsltR r : bridge.down0()) {
				r.check(isRflTgt(r));
			}
		}

		@Override
		protected void setModeMCEx(MCException ex){
			super.setModeMCEx(ex);
			setFIX_UStatus();
		}
	}

	/**
	 * [MS_MSBEL2620_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2620_Upd01Caller<P extends MSBEP_StktkActReg, B extends MS_MSBEL2620_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBEL2620_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBEL2620_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2620_Del01Caller<P extends MSBEP_StktkActReg, B extends MS_MSBEL2620_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBEL2620_Del01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBEL2620_Srch01();
	}
	/**
	 * Panel[RPnl]のボタン[dwnld]の押下時の処理
	 */
	@Override
	public void doRPnl_dwnld(MCEventInfo info) {
		createMS_MSBEL2620_Srch01().execDL();
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
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(RsltTable);
		setBtnMode();
	}
	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		RsltR r = copyRow(RsltTable);
		clearNotCopyCol(r.getGUIIndex());
		setValueEx(columnRslt_lot_no_typ, r.getGUIIndex(), MAC_LOT_NO_TYP.MANUAL.value());
		setValueEx(columnRslt_sublot_no_typ, r.getGUIIndex(), MAC_LOT_NO_TYP.MANUAL.value());
	}
	protected void clearNotCopyCol(int index) {
		setValueEx(columnRslt_tor_qty, index, null);
		setValueEx(columnRslt_trd_unit_qty, index, null);
		setValueEx(columnRslt_act_diff_qty, index, null);
		setValueEx(columnRslt_base_unit_qty, index, null);
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBEL2620_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBEL2620_Del01();
	}

	// -----------------------------------------------
	// init-parts
	@Override
	public MCTable getListRegTable() {
		return RsltTable;
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		// 版ＮＯ
		Cnd_ver_no_p_PPanel.setRelateBeans(Cnd_itm_cd, Cnd_itm_sub1, Cnd_itm_sub2, Cnd_itm_sub3, null, null);

		// 品目
		Rslt_itm_p_PPanel.setRelateBeans(columnRslt_sundry_itm_flg);
		// 数量
		Rslt_tor_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd,
				columnRslt_trd_unit_dec_place);
		Rslt_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd,
				columnRslt_trd_unit_dec_place);
		Rslt_act_diff_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd,
				columnRslt_trd_unit_dec_place);
		Rslt_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd,
				columnRslt_base_unit_dec_place, columnRslt_base_unit_rnd_typ,
				columnRslt_trd_unit_qty, columnRslt_trd_unit_base_qty, columnRslt_trd_unit_conv_qty);
		// 棚番
		Rslt_str_ln_p_PPanel.setRelateBeans(columnRslt_loc_cd, columnRslt_str_ln_tgt_flg);

		// ロットＮＯ
		// ロットＮＯを発番、または既存ロットを選択するモードで部品を設定する
		Rslt_lot_no_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1,
				columnRslt_itm_sub2, columnRslt_itm_sub3, columnRslt_lot_mng_typ, columnRslt_lot_no_typ,
				columnRslt_sublot_mng_typ, columnRslt_sublot_no_typ ,true, columnRslt_not_new_lot_flg);
		Rslt_ver_no_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1,
				columnRslt_itm_sub2, columnRslt_itm_sub3, null, columnRslt_ver_flg);
		// 手配ＮＯ
		// 発番区分や必須ＦＬＧがない引数のメソッドを利用する
		Rslt_sno_p_PPanel.setRelateBeans(columnRslt_itm_cd, columnRslt_itm_sub1,
				columnRslt_itm_sub2, columnRslt_itm_sub3, columnRslt_sno1_mng_typ,
				columnRslt_sno2_mng_typ, columnRslt_sno3_mng_typ,
				columnRslt_sno4_mng_typ);
		
		// 在庫取引先
		Rslt_stk_bp_p_PPanel.setRelateBeans(columnRslt_stk_id_typ);
		// 在庫着荷先
		Rslt_stk_arrv_bp_p_PPanel.setRelateBeans(columnRslt_loc_cd, columnRslt_sppl_cd);
		
		// 標準単価など
		Rslt_std_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_upri_dec_place);
		Rslt_std_cost_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_amt_dec_place);
		Rslt_act_diff_cost_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_amt_dec_place);
		Rslt_std_upri_p_PPanel.UpriTable.setCellConfig(new MAUDP_CellConfig());
		// 品目分類
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
	}

	// -----------------------------------------------
	// init-screen
	
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_UPD.getActionCommand());
		
		setValueEx(Cnd_only_enable_flg, true);
		setValueEx(Cnd_inc_entrd_flg, true);
		setValueEx(Cnd_only_stktk_flg, true);
		
		setValueEx(InputMtd_input_mtd_Group, InputMtd_input_mtd_ACT.getActionCommand());
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}

	// -----------------------------------------------
	// status

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		FoldTab.focusActiveFirstComponent();
		setBtnMode();
		// 検索条件を再表示する
		Ctrl_ctrl_PPanel.expand(true);
	}
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
		RsltTable.fillSpace();
	}
	
	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		// FIXステータスではフォーカスを飛ばさない
		setBtnMode();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}
	
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		RsltTable.selectLeftmostColumn(0);
		setBtnMode();
	}

	protected void setBtnMode() {
		RsltR r = RsltTable.getSelectedMCRow();
		
		// 行削除、行コピーボタン
		if (isSame(getStatus(), UPD)) {
			if (r == null) {
				// テーブル操作ボタン
				Btn_rdel.setMode(MCMode.DISABLE);
				Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				// 登録訂正ステータスでは、新規追加行のみ、行削除できる
				if (r.isStatusCreate() || r.isStatusGUICreate()) {
					setDefaultMode(Btn_rdel);
				}
				else {
					Btn_rdel.setMode(MCMode.DISABLE);
				}
				// 現在のステータスにおける実装仕様書のモードに戻す場合は、setDefaultModeメソッドを呼ぶ
				setDefaultMode(Btn_rcopy);
			}
		}
	}

	protected void setStatusAfterSrch() {
		Ctrl_ctrl_PPanel.expand(false);
		// 検索後ステータス
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setDELStatus();
		}
		else if (Cnd_ope_REF.isSelected()) {
			setREFStatus();
		}
	}
	// -----------------------------------------------
	// Event
	
	@Override
	public void doRslt_NC(MCEventInfo info) {
		super.doRslt_NC(info);
		setBtnMode();
	}

	@Override
	public void doInputMtd_input_mtd_NC(MCEventInfo info) {
		super.doInputMtd_input_mtd_NC(info);
		for (RsltR r : RsltTable.getViewRows()) {
			if (!r.isEmpty()) {
				r.use_diff_flg(InputMtd_input_mtd_DIFF.isSelected());
			}
		}
	};
	@Override
	public void doRslt_check_NC(MCEventInfo info){
		super.doRslt_check_NC(info);
		RsltR r = RsltTable.getRow(info.getEventIndex());
		if(r.check() && isEditableMode(columnRslt_act_input_flg)) {
			setValueEx(columnRslt_act_input_flg, r.getGUIIndex(), true);
		}
	}
	
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		// 種別切替時には一覧をクリアする
		clearContainers(getRsltL());

		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatus();
		}
		else {
			setSRCHStatus();
		}
		setStatusColumn();
	}

	protected void setStatusColumn() {
		// 行ステータスカラムの表示非表示。更新種別では表示、それ以外は非表示
		if (Cnd_ope_UPD.isSelected()) {
			RsltTable.setStatusColumnVisible(true);
		}
		else {
			RsltTable.setStatusColumnVisible(false);
		}
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();

		columnRslt_trd_unit_qty.addLCListener(this);
		columnRslt_act_diff_qty.addLCListener(this);
		columnRslt_itm_cd.addLCListener(this);
		columnRslt_itm_sub1.addLCListener(this);
		columnRslt_itm_sub2.addLCListener(this);
		columnRslt_itm_sub3.addLCListener(this);
		columnRslt_loc_cd.addLCListener(this);

		getRsltL().addListListener(createListListener(createDtlRowListener()));
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		
		RsltR r = RsltTable.getRow(info.getEventIndex());
		if (lc == columnRslt_trd_unit_qty) {
			setQty(columnRslt_trd_unit_qty, r);
		}
		else if (lc == columnRslt_act_diff_qty) {
			setQty(columnRslt_act_diff_qty, r);
		}
		
		else if (lc == columnRslt_itm_cd || lc == columnRslt_itm_sub1 || lc == columnRslt_itm_sub2 || lc == columnRslt_itm_sub3 || lc == columnRslt_loc_cd) {
			setStdUpri(r);
			if (lc == columnRslt_itm_cd || lc == columnRslt_itm_sub1 || lc == columnRslt_itm_sub2 || lc == columnRslt_itm_sub3) {
				setTrdUnitCd(r);
				setLotNoTyp(r);
			}
		}
	}
	protected void setLotNoTyp(RsltR r) {
		setValueEx(columnRslt_lot_no_typ, r.getGUIIndex(), MAC_LOT_NO_TYP.MANUAL.value());
		setValueEx(columnRslt_sublot_no_typ, r.getGUIIndex(), MAC_LOT_NO_TYP.MANUAL.value());
	}
	protected void setTrdUnitCd(RsltR r) {	
		setValueEx(columnRslt_trd_unit_cd, r.getGUIIndex(), null);
	}	

	protected void setQty(MCBeans b, RsltR r) {
		MCNumber tor_qty = nvl(r.tor_qty(), MCNumber.ZERO);
		if (b == columnRslt_trd_unit_qty) {
			if (isNull(r.trd_unit_qty())) {
				setValueEx(columnRslt_act_diff_qty, r.getGUIIndex(), null);
			}
			else {
				setValueEx(columnRslt_act_diff_qty, r.getGUIIndex(), r.trd_unit_qty().subtract(tor_qty));
			}
		}
		else if (b == columnRslt_act_diff_qty) {
			if (isNull(r.act_diff_qty())) {
				setValueEx(columnRslt_trd_unit_qty, r.getGUIIndex(), null);
			}
			else {
				setValueEx(columnRslt_trd_unit_qty, r.getGUIIndex(), r.act_diff_qty().add(tor_qty));
			}
		}
		setValueEx(columnRslt_act_input_flg, r.getGUIIndex(), !isNull(r.trd_unit_qty()));

		// 実棚基準単位数量を求める
		// 部品で実施

		// 棚卸金額出力がオンの場合、標準原価、棚差金額を表示する
		setStdCost(r);
	}

	protected void setStdUpri(RsltR r) {
		if (r.stktk_amt_flg()) {
			setValueEx(columnRslt_std_upri, r.getGUIIndex(),
				getStdCost(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.stktk_base_dt(), r.wg_cd(), getCo().stk_std_upri_typ()));
		}
		else {
			setValueEx(columnRslt_std_upri, r.getGUIIndex(), null);
		}
		setStdCost(r);
	}

	protected void setStdCost(RsltR r) {
		if (r.stktk_amt_flg()) {
			setValueEx(columnRslt_std_cost, r.getGUIIndex(),
				getAmt(r.std_upri(), r.base_unit_qty(), getCo().stk_amt_dec_place(), getCo().stk_amt_rnd_typ()));
			setValueEx(columnRslt_act_diff_cost, r.getGUIIndex(),
				getAmt(r.std_upri(), convToBaseUnit(r.act_diff_qty(), r.trd_unit_base_qty(), r.trd_unit_conv_qty(), r.base_unit_dec_place(), r.base_unit_rnd_typ()), getCo().stk_amt_dec_place(), getCo().stk_amt_rnd_typ()));
		}
		else {
			setValueEx(columnRslt_std_cost, r.getGUIIndex(), null);
			setValueEx(columnRslt_act_diff_cost, r.getGUIIndex(), null);
		}
	}

	protected MCRowStatusListener createDtlRowListener() {
		return new DtlRowListener();
	}
	public class DtlRowListener implements MCRowStatusListener {
		@Override
		public void statusChanged(MCRowStatusEvent event) {
			if (isSame(event.getNewStatus(), Status.CREATE)
				&& isSame(event.getOldStatus(), Status.NONE)) {
				RsltR r = (RsltR) event.getSourceRow();
				setDefRsltR(r);
			}
		}
	}
	protected void setDefRsltR(RsltR r) {
		r.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
		r.in_xfr_typ_nm(MSC_IN_XFR_TYP.IN_LOC.name());
		r.use_diff_flg(InputMtd_input_mtd_DIFF.isSelected());
		r.lot_no_typ(MAC_LOT_NO_TYP.MANUAL.value());
		r.sublot_no_typ(MAC_LOT_NO_TYP.MANUAL.value());
		r.base_cur_cd(getCo().base_cur_cd());
		r.upri_dec_place(getBaseCur().upri_dec_place());
		r.amt_dec_place(getCo().stk_amt_dec_place());
		r.stktk_sts_typ(MSC_STKTK_STS_TYP.STKTK_ST.value());
		r.stktk_sts_typ_nm(MSC_STKTK_STS_TYP.STKTK_ST.name());
	}
	
	// -----------------------------------------------
	// CellConfig
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(crtRsltCellConfig());
	}

	protected RsltCellConfig crtRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected class RsltCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (isSame(getStatus(), UPD)) {
				RsltR r = (RsltR) table.getBaseTable().getRow(index);

				if (MAC_RTN_STS_TYP.isOK(r.rtn_sts_typ())) {
					return MCMode.READ_ONLY;
				}
				if (!r.isStatusCreate() && !r.isStatusGUICreate()) {
					if (!isRflTgt(r)) {
						return MCMode.READ_ONLY;
					}
					// 新規行以外は実棚数量or実棚差異数量、内部備考以外は入力不可
					if (column == columnRslt_stktk_base_dt
							|| column == columnRslt_loc_cd
							|| column == columnRslt_str_ln_cd
							|| column == columnRslt_str_ln_cd_none_flg
							|| column == columnRslt_stk_arrv_bp_cd
							|| column == columnRslt_itm_cd
							|| column == columnRslt_itm_sub1
							|| column == columnRslt_itm_sub2
							|| column == columnRslt_itm_sub3
							|| column == columnRslt_itm_nm
							|| column == columnRslt_crt_lot_flg
							|| column == columnRslt_lot_no
							|| column == columnRslt_sublot_no
							|| column == columnRslt_sno1
							|| column == columnRslt_sno2
							|| column == columnRslt_sno3
							|| column == columnRslt_sno4
							|| column == columnRslt_fix_no_flg
							|| column == columnRslt_gd_cd
							|| column == columnRslt_quality_typ
							|| column == columnRslt_stk_insp_typ
							|| column == columnRslt_stk_id_typ
							|| column == columnRslt_stk_bp_cd
							|| column == columnRslt_trd_unit_cd) {
						return MCMode.READ_ONLY;
					}
				}
				// 入力方法に応じて実棚数量か実棚差異数量が入力不可
				if (r.use_diff_flg()) {
					if (column == columnRslt_trd_unit_qty) {
						return MCMode.READ_ONLY;
					}
				}
				else if (!r.use_diff_flg()) {
					if (column == columnRslt_act_diff_qty) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnRslt_sno1) {
					if (isNull(r.sno1_mng_typ()) || MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno1_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_sno2) {
					if (isNull(r.sno2_mng_typ()) || MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno2_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_sno3) {
					if (isNull(r.sno3_mng_typ()) || MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno3_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_sno4) {
					if (isNull(r.sno4_mng_typ()) || MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno4_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				
				if (column == columnRslt_crt_lot_flg) {
					if (r.ver_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnRslt_lot_no) {
					if (!isNull(r.lot_mng_typ()) && !MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
						return MCMode.REQUIRED;
					}
				}	
				if (column == columnRslt_sublot_no) {
					if (!isNull(r.sublot_mng_typ()) && !MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
						return MCMode.REQUIRED;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	protected boolean isRflTgt(RsltR r) {
		// 積送品区分が積送中
		if (MSC_IN_XFR_TYP.isIN_XFR(r.in_xfr_typ())) {
			return false;
		}
		// 在庫識別区分がVMI、返品検収前、仕入検収前、自給品、預り、検収不良
		if (MSC_STK_ID_TYP.isRNT_RCV(r.stk_id_typ())) {
			return false;
		}
		else if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(r.stk_id_typ())) {
			return false;
		}
		else if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(r.stk_id_typ())) {
			return false;
		}
		else if (MSC_STK_ID_TYP.isSLF_SUPPRT(r.stk_id_typ())) {
			return false;
		}
		else if (MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())) {
			return false;
		}
		else if (MSC_STK_ID_TYP.isACCPT_DFCT(r.stk_id_typ())) {
			return false;
		}
		// 在庫着荷先が設定されており、
		if (!isNullOrNullVal(r.stk_arrv_bp_cd())) {
			// 確定ＮＯＦＬＧがオン
			if (r.fix_no_flg() && (isNull(r.sppl_cd()) || !MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ()))) {
				return false;
			}
			// 確定ＮＯＦＬＧがオフかつ貸出在庫棚卸対象ＦＬＧがオフの外注でない場所の場合は入力不可
			else if (!r.cnsgn_stktk_flg() && isNull(r.sppl_cd())) {
				return false;
			}
		}
		// 在庫識別区分が無償受給、着荷先なし、外注場所は不可
		if (MSC_STK_ID_TYP.isNCV_RCV(r.stk_id_typ())
				&& !isNull(r.sppl_cd())
				&& isNullOrNullVal(r.stk_arrv_bp_cd())) {
			return false;
		}
		// 理論在庫数量がマイナス
		if (!isNull(r.tor_qty()) && r.tor_qty().isNegative()) {
			return false;
		}
		return true;
	}

	// -----------------------------------------------
	// File in
	@Override
	public boolean useFileIn(MCTable table) {
		if (table == RsltTable) {
			return (Cnd_ope_UPD.isSelected());
		}
		return super.useFileIn(table);
	}
	
	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
		super.doFileInSuccessAction(table);
		// 型が不正な場合などのエラーチェックが終わった後に呼ばれる処理
		callMS_MSBEL2620_Imp01();
	}

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig config = super.createFXBAP_PopupConfig(beans);
		if (beans == RsltTable) {
			config.setFileInMenuType(MCPopupConfig.FILE_TYPE_INS_UPD);
		}
		return config;
	}

}