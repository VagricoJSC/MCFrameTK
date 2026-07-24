package mcframe.clientMSBC.MSBCP1010;

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

import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0050.*;
import mcframe.clientMAUB.MAUBP0110.*;
import mcframe.clientMAUB.MAUBP0170.*;
import mcframe.clientMAUB.MAUBP0220.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5290.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMAUB.MAUBP5340.*;
import mcframe.clientMSUB.MSUBP0030.*;
import mcframe.clientMSUB.MSUBP0040.*;
import mcframe.clientMSUB.MSUBP0070.*;
import mcframe.clientMSUB.MSUBP0080.*;
import mcframe.clientMSUB.MSUBP5030.*;

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
import mcframe.clientCore.beans.list.*;
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import static mcframe.clientMSUC.MSUCP0030.MSUCP_ProdUtil.*;
import static mcframe.commonFX.notice.FX_Msg.*;
import mcframe.clientCore.resource.MCConst;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import mcframe.clientMAUD.MAUDP0110.MAUDP_RowListener;
import mcframe.clientCore.container.MCRowEvent;
import mcframe.clientMSUD.MSUDP0020.IfStkInspBase;
import mcframe.clientMSUD.MSUDP0030.IfInptTrgtSelBase;
import static mcframe.clientMSUC.MSUCP0030.MSUCP_ProdListLogic.*;
import mcframe.clientMSUC.MSUCP0090.*;
import mcframe.clientMSUC.MSUCP0110.MSUCP_StrLnUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBCP_MfgInstReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_MfgInstReg_MC extends MSBCP_MfgInstReg_MC_A implements IfOpePanel, IfStkInspBase, IfInptTrgtSelBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected int _defInptRowHeight = -1;
	protected int _defByProdRowHeight = -1;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_MfgInstReg_MC() {
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
	public MSBCP_MfgInstReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	//********************** 通信が発生するボタン処理 **************************

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBCL1010_Del01();
	}
	
	/**
	 * [MS_MSBCL1010_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1010_Del01Caller<P extends MSBCP_MfgInstReg, B extends MS_MSBCL1010_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBCL1010_Del01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();
			setBtnRItm();
		}

		@Override
		protected void setMode() {
			setFixStatus();
		}

		protected void setBtnRItm() {
			if (!getHdrR().inst_abort_flg() && !getHdrR().org_inst_abort_flg()) {
				bridge.up0().xfr_inst_del_enable_flg(getBtnR().xfr_inst_del_enable_flg());
			}
		}
	}
	
	/**
	 * Panel[Btn]のボタン[del_aprv]の押下時の処理
	 */
	@Override
	public void doBtn_del_aprv(MCEventInfo info) {
		callMS_MSBCL1010_Del02();
	}
	
	/**
	 * [MS_MSBCL1010_Del02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1010_Del02Caller<P extends MSBCP_MfgInstReg, B extends MS_MSBCL1010_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBCL1010_Del02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			setFixStatus();
		}
	}
	
	/**
	 * Panel[Btn]のボタン[prnt_inst]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_inst(MCEventInfo info) {
		callMS_MSBCL1010_Prnt01();
	}
	
	/**
	 * [MS_MSBCL1010_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1010_Prnt01Caller<P extends MSBCP_MfgInstReg, B extends MS_MSBCL1010_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBCL1010_Prnt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Btn]のボタン[prnt_chg_list]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_chg_list(MCEventInfo info) {
		callMS_MSBCL1010_Prnt02();
	}
	
	/**
	 * [MS_MSBCL1010_Prnt02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1010_Prnt02Caller<P extends MSBCP_MfgInstReg, B extends MS_MSBCL1010_Prnt02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBCL1010_Prnt02Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[InptBtn]のボタン[sprt_lot_prop]の押下時の処理
	 */
	@Override
	public void doInptBtn_sprt_lot_prop(MCEventInfo info) {
		callMS_MSBCL1010_Sprt01();
	}
	
	/**
	 * [MS_MSBCL1010_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1010_Sprt01Caller<P extends MSBCP_MfgInstReg, B extends MS_MSBCL1010_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBCL1010_Sprt01Caller(P p, B b) {
			super(p, b);
		}
		
		MCList<DtlInptR> _dtlForCheck;
		
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBCP1010);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			_dtlForCheck = getDtlInptL().subList(DtlInptR.$lot_prop_tgt_flg, true);
		}

		@Override
		protected boolean checkForCall() {
			if (_dtlForCheck.isEmpty()) {
				panel.dialog(new MCMessage(FXBAP0038));
				return false;
			}
			return super.checkForCall();
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			for (DtlInptR inptR : getDtlInptL()) {
				// 代替の場合のロット提案対象チェック
				if (!checkAltItmLotPropTgt(inptR)) {
					msgList.add(new MCMessage(inptR, DtlInptR.$lot_prop_tgt_flg,
							MSBCP1020, toDispItm(inptR.itm_cd(), inptR.itm_sub1(),
									inptR.itm_sub2(), inptR.itm_sub3(), panel),
							toDispGUIIndex(inptR)));
				}
				if (inptR.lot_prop_tgt_flg() && !isSame(getHdrR().mfg_loc_cd(), inptR.inpt_loc_cd())) {
					inptR.set_stk_str_ln_flg(true);
				}
				else {
					inptR.set_stk_str_ln_flg(false);
				}
			}
		}

		/**
		 * 同じ代替グループに代替品目指定がオンの品目が存在し、自分自身の代替品目指定がオフの場合、ロット提案対象をオンにするとエラーとする
		 * @param r
		 * @return
		 */
		protected boolean checkAltItmLotPropTgt(DtlInptR r) {
			// 自分自身が代替品目でない場合、true
			if (isNull(r.alt_grp_cd())) {
				return true;
			}
			// 自分自身の代替品目指定がオンの場合、true
			if (r.alt_itm_fix_flg()) {
				return true;
			}
			// 自分自身のロット提案対象がオフの場合、true
			if (!r.lot_prop_tgt_flg()) {
				return true;
			}
			// 同じ代替グループに代替品目指定がオンの品目が存在する場合、false
			String[] key = new String[]{DtlInptR.$alt_grp_cd, DtlInptR.$alt_grp_seq, DtlInptR.$oper_peg_no};
			Comparable<?>[] keyVal = new Comparable<?>[]{r.alt_grp_cd(), r.alt_grp_seq(), r.oper_peg_no()};
			MCList<DtlInptR> sameAltGL = getDtlInptL().subList(key, keyVal);
			for (DtlInptR sameAltGR : sameAltGL) {
				if (sameAltGR.isStatusDelete()) {
					continue;
				}
				if (sameAltGR.alt_itm_fix_flg()) {
					return false;
				}
			}
			// 上記以外はtrue
			return true;
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			// 処理後のソートのために全行上らせているが、ロット提案の処理対象とするのは、ロット提案対象ＦＬＧがオンの行のみのため、
			// 必須チェックはロット提案対象ＦＬＧがオンの行に対してのみ実施する
			for (DtlInptR r : _dtlForCheck) {
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlInpt_itm_cd));
				if (columnDtlInpt_itm_sub1.getMode() != MCMode.INVISIBLE) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlInpt_itm_sub1));
				}
				if (columnDtlInpt_itm_sub2.getMode() != MCMode.INVISIBLE) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlInpt_itm_sub2));
				}
				if (columnDtlInpt_itm_sub3.getMode() != MCMode.INVISIBLE) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlInpt_itm_sub3));
				}
				if (r.ver_flg()) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlInpt_ver_no));
				}
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlInpt_base_unit_inpt_qty));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlInpt_base_unit_rqmt_qty));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlInpt_base_unit_fxd_rqmt_qty));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlInpt_schd_dt));
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlInpt_inpt_loc_cd));
			}
		}
		
		protected static final String TMP_PARAM_ROW_IDX_COL = "__tmp_param_row_idx__";
		protected static final String TMP_SORT_COL = "__tmp_sort_col__";
		
		@Override
		protected void merge(int blockNum, MCList<MCRow> destL, MCList<MCRow> srcL,
				String... cols) {
			// 本メソッドは、showMergeから呼ばれるメソッド。
			// ロットが割れた場合などに上り電文が複数行に分割されることがあるため、独自に実装している
			if (srcL.isEmpty()) {
				return;
			}
			
			srcL.addNumberColumn(TMP_PARAM_ROW_IDX_COL);
			for (MCRow srcR : srcL) {
				srcR.setNumber(TMP_PARAM_ROW_IDX_COL, srcR.getParamRowIndex());
			}
			
			MCIndexKey idxkey = srcL.createIndex(TMP_PARAM_ROW_IDX_COL);
			MCList<MCRow> addL = destL.createInstance();
			
			destL.addNumberColumn(TMP_PARAM_ROW_IDX_COL);
			destL.addNumberColumn(TMP_SORT_COL);
			for (MCRow destR : destL) {
				MCList<MCRow> subSrcL = srcL.subList(idxkey, MCNumber.valueOf(destR.getParamRowIndex()));
				
				for (int i=0; i < subSrcL.size(); i++) {
					MCRow srcR = subSrcL.get(i);
					if (i == 0) {
						destR.setValues(cols, srcR, cols);
						// ソート用に一時カラムを設定
						destR.setNumber(TMP_PARAM_ROW_IDX_COL, destR.getParamRowIndex());
						destR.setNumber(TMP_SORT_COL, i);
					}
					else {
						MCRow addR = destR.clone();
						if (!isNull(addR.getNumberNE(DtlInptR.$bom_id_no))) {
							addR.setBooleanNE(DtlInptR.$split_row_flg, true);
						}
						addR.setStatus(MCRow.Status.CREATE);
						addR.setValues(cols, srcR, cols);
						addR.setString(DtlInptR.$inpt_schd_no, null);
						// ソート用に一時カラムを設定
						destR.setNumber(TMP_PARAM_ROW_IDX_COL, destR.getParamRowIndex());
						addR.setNumber(TMP_SORT_COL, i);
						addL.add(addR);
					}
				}
			}
			if (!addL.isEmpty()) {
				destL.addAll(addL);
				destL.sort(TMP_PARAM_ROW_IDX_COL, TMP_SORT_COL);
			}
		}
	}
	
	/**
	 * Panel[HdrBtn]のボタン[sprt_re_ext]の押下時の処理
	 */
	@Override
	public void doHdrBtn_sprt_re_ext(MCEventInfo info) {
		callMS_MSBCL1010_Sprt02();
	}
	
	/**
	 * [MS_MSBCL1010_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1010_Sprt02Caller<P extends MSBCP_MfgInstReg, B extends MS_MSBCL1010_Sprt02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBCL1010_Sprt02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBCP1009);
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			checkReqHdrForReExt(msgList);
		}
		
		@Override
		protected void show() {
			// 再展開未実施の処理で参照する変数に現在の値を保持しておく
			_bfrReExtR = getHdrR().clone();
			showReplace();
			setValueEx(HdrBtn_unexec_re_ext_flg, false);
			
			for (DtlOperR r : getDtlOperL()) {
				r.bfr_re_ext_st_schd_dt(r.st_schd_dt());
				r.bfr_re_ext_end_schd_dt(r.end_schd_dt());
				r.bfr_re_ext_base_unit_qty(r.base_unit_qty());
				r.mes_flg(r.mes_tgt_flg());
			}
			// 指図再展開区分の設定
			setReExtTyp();
			
			setOperdelflg();
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setDefaultMode(HdrBtn_unexec_re_ext_flg);
			selectAllTable();
		}
		
		@Override
		protected void adjustList() {
			super.adjustList();
			DtlOperTable.adjustWidth();
			DtlWkTable.adjustWidth();
			DtlYieldTable.adjustWidth();
			
			columnDtlInpt_th_image.setAdjustWidth(false);
			DtlInptTable.adjustWidth();
			adjustInptThImage();
			
			columnDtlByProd_th_image.setAdjustWidth(false);
			DtlByProdTable.adjustWidth();
			adjustByProdThImage();
		}
	}
	
	/**
	 * 再展開ボタンの共通必須チェック
	 * @param msgList
	 */
	protected void checkReqHdrForReExt(MCMessageList msgList) {
		msgList.addAll(checkReq(Hdr_mfg_mtd_typ));
		msgList.addAll(checkReq(Hdr_master_dt));
		hdrItmCheckReq(msgList);
		msgList.addAll(checkReq(Hdr_mfg_loc_cd));
		msgList.addAll(checkReq(Hdr_bom_ptn));
		msgList.addAll(checkReq(Hdr_strg_loc_cd));
		msgList.addAll(checkReq(Hdr_base_unit_inst_qty));
		msgList.addAll(checkReq(Hdr_base_unit_yield_qty));
		msgList.addAll(checkReq(Hdr_st_schd_dt));
		msgList.addAll(checkReq(Hdr_end_schd_dt));
		msgList.addAll(checkReq(Hdr_oper_ptn));
	}
	
	protected void hdrItmCheckReq(MCMessageList msgList) {
		// システムパラメータで枝番が非表示となっている場合を考慮している
		msgList.addAll(checkReq(Hdr_itm_cd));
		if (!Hdr_itm_sub1.getMode().equals(MCMode.INVISIBLE)) {
			msgList.addAll(checkReq(Hdr_itm_sub1));
		}
		if (!Hdr_itm_sub2.getMode().equals(MCMode.INVISIBLE)) {
			msgList.addAll(checkReq(Hdr_itm_sub2));
		}
		if (!Hdr_itm_sub3.getMode().equals(MCMode.INVISIBLE)) {
			msgList.addAll(checkReq(Hdr_itm_sub3));
		}
	}

	/**
	 * 再展開ボタンの後処理で最新の指図再展開区分を「再展開済」にする
	 */
	protected void setReExtTyp() {
		if (!getDtlReExtL().isEmpty()) {
			DtlReExtR r = getDtlReExtL().getFirst(DtlReExtR.$ref_ord, getDtlReExtL().max(DtlReExtR.$ref_ord));
			r.re_ext_typ(MSC_RE_EXT_TYP.EXT.value());
			r.re_ext_typ_nm(MSC_RE_EXT_TYP.EXT.name());
			// 不要フラグはクリア
			r.unneces_flg(false);
			r.setStatus(MCRow.Status.MODIFY);
		}
	}
	
	protected void setOperdelflg() {
		MCList<DtlOperR> operL = getDtlOperL().subList(MCRow.Status.DELETE);
		for (DtlOperR operR : operL) {
			for (DtlInptR InptR : getDtlInptL().subList(DtlInptR.$oper_peg_no, operR.peg_no())) {
				InptR.oper_del_flg(operR.isStatusDelete());
			}
			for (DtlWkR WkR : getDtlWkL().subList(DtlWkR.$oper_peg_no, operR.peg_no())) {
				WkR.oper_del_flg(operR.isStatusDelete());
			}
			for (DtlYieldR YieldR : getDtlYieldL().subList(DtlYieldR.$oper_peg_no, operR.peg_no())) {
				YieldR.oper_del_flg(operR.isStatusDelete());
			}
			for (DtlByProdR ByprodR : getDtlByProdL().subList(DtlByProdR.$oper_peg_no, operR.peg_no())) {
				ByprodR.oper_del_flg(operR.isStatusDelete());
			}
		}
	}
	
	/**
	 * Panel[OperBtn]のボタン[sprt_schd_re_ext]の押下時の処理
	 */
	@Override
	public void doOperBtn_sprt_schd_re_ext(MCEventInfo info) {
		callMS_MSBCL1010_Sprt03();
	}

	/**
	 * [MS_MSBCL1010_Sprt03]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1010_Sprt03Caller<P extends MSBCP_MfgInstReg, B extends MS_MSBCL1010_Sprt03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBCL1010_Sprt03Caller(P p, B b) {
			super(p, b);
		}
		
		MCList<DtlOperR> _dtlOperForCall;

		MCList<DtlInptR> _dtlInptNonTgt;
		MCList<DtlWkR> _dtlWkNonTgt;
		MCList<DtlYieldR> _dtlYieldNonTgt;
		MCList<DtlByProdR> _dtlByProdNonTgt;
		
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBCP1009);
		}
		
		@Override
		protected void initCaller() {
			super.initCaller();
			// 再展開対象がオンの行が処理対象（対象工程がオフでも可）
			_dtlOperForCall = getDtlOperL().subList(
					r -> (r.re_ext_tgt_flg() && !r.isStatusDelete()));
		
			// 対象外の明細を退避
			saveNonTgtDtl();
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up1().setAll(_dtlOperForCall);
		}
		
		@Override
		protected boolean checkForCall() {
			if (_dtlOperForCall.isEmpty()) {
				panel.dialog(new MCMessage(MSBCP1012));
				return false;
			}
			if (!getOperBtnR().inpt_re_ext_flg() && !getOperBtnR().wk_re_ext_flg() && !getOperBtnR().byprod_re_ext_flg()) {
				panel.dialog(new MCMessage(MSBCP1013));
				return false;
			}
			if (!getDtlReExtL().isEmpty() && getDtlReExtL().get(getDtlReExtL().size()-1).oper_chng_flg()) {
				panel.dialog(new MCMessage(MSBCP1014));
				return false;
			}
			return super.checkForCall();
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			checkReqHdrForReExt(msgList);
			checkReqOperForReExt(msgList, _dtlOperForCall);
		}

		@Override
		protected void show() {
			showReplace();
			for (DtlOperR r : _dtlOperForCall) {
				r.unexec_re_ext_flg(false);
				// 予定再展開を行ったため、展開前の値を更新する
				r.bfr_re_ext_st_schd_dt(r.st_schd_dt());
				r.bfr_re_ext_end_schd_dt(r.end_schd_dt());
				r.bfr_re_ext_base_unit_qty(r.base_unit_qty());
			}
			sortDtl();
			
			// 指図再展開区分の設定
			setReExtTyp();
		}
		
		@Override
		protected void showReplaceSub() {
			super.showReplaceSub();
			// 処理対象外のレコードを各一覧にマージする。
			mergeNonTgtDtl();
		}

		@Override
		protected void setMode() {
			super.setMode();
			selectAllTable();
			setDtlBtnMode();
		}
		
		@Override
		protected void adjustList() {
			super.adjustList();
			
			DtlYieldTable.adjustWidth();
			if (getOperBtnR().wk_re_ext_flg()) {
				DtlWkTable.adjustWidth();
			}
			if (getOperBtnR().inpt_re_ext_flg()) {
				columnDtlInpt_th_image.setAdjustWidth(false);
				DtlInptTable.adjustWidth();
				adjustInptThImage();
			}
			if (getOperBtnR().byprod_re_ext_flg()) {
				columnDtlByProd_th_image.setAdjustWidth(false);
				DtlByProdTable.adjustWidth();
				adjustByProdThImage();
			}
		}
		
		protected void saveNonTgtDtl() {
			
			// 処理対象外の各種明細を退避します。退避した明細は再展開処理後にマージされます。
			MCIndexKey operKey = _dtlOperForCall.createIndex(DtlOperR.$peg_no);
			_dtlInptNonTgt = MCList.create(DtlInptR.class);
			_dtlWkNonTgt = MCList.create(DtlWkR.class);
			_dtlYieldNonTgt = MCList.create(DtlYieldR.class);
			_dtlByProdNonTgt = MCList.create(DtlByProdR.class);

			// 処理対象外の出来高を取得
			for (DtlYieldR r : getDtlYieldL()) {
				if (isNull(_dtlOperForCall.getFirst(operKey, r.oper_peg_no()))) {
					_dtlYieldNonTgt.add(r);
				}
			}

			// 処理対象外の投入を取得
			if (getOperBtnR().inpt_re_ext_flg()) {
				for (DtlInptR r : getDtlInptL()) {
					if (isNull(_dtlOperForCall.getFirst(operKey, r.oper_peg_no()))) {
						_dtlInptNonTgt.add(r);
					}
				}
			}
			else {
				_dtlInptNonTgt.addAll(getDtlInptL());
			}
			
			// 処理対象外の工数を取得
			if (getOperBtnR().wk_re_ext_flg()) {
				for (DtlWkR r : getDtlWkL()) {
					if (isNull(_dtlOperForCall.getFirst(operKey, r.oper_peg_no()))) {
						_dtlWkNonTgt.add(r);
					}
				}
			}
			else {
				_dtlWkNonTgt.addAll(getDtlWkL());
			}
			
			// 処理対象外の副産品を取得
			if (getOperBtnR().byprod_re_ext_flg()) {
				for (DtlByProdR r : getDtlByProdL()) {
					if (isNull(_dtlOperForCall.getFirst(operKey, r.oper_peg_no()))) {
						_dtlByProdNonTgt.add(r);
					}
				}
			}
			else {
				_dtlByProdNonTgt.addAll(getDtlByProdL());
			}
		}
		
		protected void mergeNonTgtDtl() {
			
			// 退避していた処理対象外の各種明細を再展開結果とマージします。
			getDtlYieldL().addAll(_dtlYieldNonTgt);
			getDtlInptL().addAll(_dtlInptNonTgt);
			getDtlWkL().addAll(_dtlWkNonTgt);
			getDtlByProdL().addAll(_dtlByProdNonTgt);
		}
		
		protected void sortDtl() {
			// 各種明細を工程行ＮＯ＋表示順でマージします。
			// ※ソートの仕様は工順＋表示順だが、画面で工程明細の工順が変更された場合、工程明細と各種明細で表示順が変わってしまう。
			// （工程明細は更新して再検索しないと、工順通りにソートされない。）
			// ※そのため、各種明細は画面上の表示順である工程行ＮＯでソートします。
			getDtlYieldL().sort(DtlYieldR.$oper_peg_no, DtlYieldR.$disp_seq);
			getDtlInptL().sort(DtlInptR.$oper_peg_no, DtlInptR.$disp_seq,
					DtlInptR.$alt_grp_cd, DtlInptR.$alt_grp_seq, DtlInptR.$itm_cd);
			getDtlWkL().sort(DtlWkR.$oper_peg_no, DtlWkR.$disp_seq, DtlWkR.$wk_cost_cd);
			getDtlByProdL().sort(DtlByProdR.$oper_peg_no, DtlByProdR.$disp_seq,
					DtlByProdR.$itm_cd);
		}
	}
	
	protected void checkReqOperForReExt(MCMessageList msgList, MCList<DtlOperR> operL) {
		for (DtlOperR r : operL) {
			msgList.addAll(checkReq(r.getGUIIndex(), columnDtlOper_oper_cd));
			msgList.addAll(checkReq(r.getGUIIndex(), columnDtlOper_oper_seq));
			msgList.addAll(checkReq(r.getGUIIndex(), columnDtlOper_st_schd_dt));
			msgList.addAll(checkReq(r.getGUIIndex(), columnDtlOper_end_schd_dt));
			msgList.addAll(checkReq(r.getGUIIndex(), columnDtlOper_base_unit_qty));
			msgList.addAll(checkReq(r.getGUIIndex(), columnDtlOper_oper_loc_cd));
		}
	}
	
	/**
	 * Panel[HdrBtn]のボタン[sprt_lot_no]の押下時の処理
	 */
	@Override
	public void doHdrBtn_sprt_lot_no(MCEventInfo info) {
		callMS_MSBCL1010_Sprt07();
	}

	/**
	 * [MS_MSBCL1010_Sprt07]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1010_Sprt07Caller<P extends MSBCP_MfgInstReg, B extends MS_MSBCL1010_Sprt07Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBCL1010_Sprt07Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBCP1008);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			hdrItmCheckReq(msgList);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			if (!getHdrBtnR().lot_issue_flg() && !getHdrBtnR().sublot_issue_flg()) {
				msgList.add(new MCMessage(MSBCP1006));
			}
		}

		@Override
		protected void beforeCall() {
			super.beforeCall();
			bridge.up0().lot_issue_flg(getHdrBtnR().lot_issue_flg());
			bridge.up0().sublot_issue_flg(getHdrBtnR().sublot_issue_flg());
		}
	}
	
	/**
	 * Panel[ByProdBtn]のボタン[sprt_by_prod_lot_no]の押下時の処理
	 */
	@Override
	public void doByProdBtn_sprt_by_prod_lot_no(MCEventInfo info) {
		callMS_MSBCL1010_Sprt08();
	}

	/**
	 * [MS_MSBCL1010_Sprt08]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1010_Sprt08Caller<P extends MSBCP_MfgInstReg, B extends MS_MSBCL1010_Sprt08Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBCL1010_Sprt08Caller(P p, B b) {
			super(p, b);
		}
		
		MCList<DtlByProdR> _dtlByProdForCall;
		
		@Override
		protected void initCaller() {
			super.initCaller();
			_dtlByProdForCall = getDtlByProdL().subList(r -> (r.tgt_oper_flg() && !r.isStatusDelete()));
		}
		
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBCP1008);
		}
		
		@Override
		protected boolean checkForCall() {
			if (_dtlByProdForCall.isEmpty()) {
				panel.dialog(new MCMessage(FXBAP0038));
				return false;
			}

			return super.checkForCall();
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			for (DtlByProdR r : _dtlByProdForCall) {
				msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlByProd_itm_cd));
				if (columnDtlByProd_itm_sub1.getMode() != MCMode.INVISIBLE) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlByProd_itm_sub1));
				}
				if (columnDtlByProd_itm_sub2.getMode() != MCMode.INVISIBLE) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlByProd_itm_sub2));
				}
				if (columnDtlByProd_itm_sub3.getMode() != MCMode.INVISIBLE) {
					msgList.addAll(panel.checkReq(r.getGUIIndex(), columnDtlByProd_itm_sub3));
				}
			}
		}
		
		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up1().setAll(_dtlByProdForCall);
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			if (!getByProdBtnR().lot_issue_flg() && !getByProdBtnR().sublot_issue_flg()) {
				msgList.add(new MCMessage(MSBCP1006));
			}
		}
		
		@Override
		protected void beforeCall() {
			super.beforeCall();
			bridge.up0().lot_issue_flg(getByProdBtnR().lot_issue_flg());
			bridge.up0().sublot_issue_flg(getByProdBtnR().sublot_issue_flg());
		}
	}

	/**
	 * Panel[HdrBtn]のボタン[sprt_calc_lt]の押下時の処理
	 */
	@Override
	public void doHdrBtn_sprt_calc_lt(MCEventInfo info) {
		callMS_MSBCL1010_Sprt09();
	}
	
	/**
	 * [MS_MSBCL1010_Sprt09]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1010_Sprt09Caller<P extends MSBCP_MfgInstReg, B extends MS_MSBCL1010_Sprt09Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBCL1010_Sprt09Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBCP1007);
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			msgList.addAll(panel.checkReq(Hdr_mfg_mtd_typ));
			msgList.addAll(panel.checkReq(Hdr_master_dt));
			hdrItmCheckReq(msgList);
			msgList.addAll(panel.checkReq(Hdr_mfg_loc_cd));
			msgList.addAll(panel.checkReq(Hdr_bom_ptn));
			msgList.addAll(panel.checkReq(Hdr_strg_loc_cd));
			msgList.addAll(panel.checkReq(Hdr_base_unit_inst_qty));
		}

		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			if (MSC_MFG_MTD_TYP.isINTNL(getHdrR().mfg_mtd_typ())) {
				msgList.addAll(checkAtLeastOneInput(Hdr_st_schd_dt, Hdr_end_schd_dt));
			} else if (MSC_MFG_MTD_TYP.isEXTNL(getHdrR().mfg_mtd_typ())) {
				msgList.addAll(checkAtLeastOneInput(Hdr_rqst_dlv_rqst_dt, Hdr_st_schd_dt,
						Hdr_end_schd_dt));
			}
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (!isNull(getHdrR().rqst_dlv_rqst_dt())) {
				setDefaultMode(Hdr_rqst_dlv_rqst_hm);
			}
			else {
				Hdr_rqst_dlv_rqst_hm.setMode(MCMode.READ_ONLY);
			}
			if (!isNull(getHdrR().st_schd_dt())) {
				setDefaultMode(Hdr_st_schd_hm);
			}
			else {
				Hdr_st_schd_hm.setMode(MCMode.READ_ONLY);
			}
			if (!isNull(getHdrR().end_schd_dt())) {
				setDefaultMode(Hdr_end_schd_hm);
			}
			else {
				Hdr_end_schd_hm.setMode(MCMode.READ_ONLY);
			}
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBCL1010_Srch01();
	}

	/**
	 * [MS_MSBCL1010_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1010_Srch01Caller<P extends MSBCP_MfgInstReg, B extends MS_MSBCL1010_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {
		protected MS_MSBCL1010_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void adjustList() {
			columnDtlInpt_th_image.setAdjustWidth(false);
			columnDtlByProd_th_image.setAdjustWidth(false);
			super.adjustList();
			adjustParThImage();
			adjustInptThImage();
			adjustByProdThImage();
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			if (Cnd_ope_INS.isSelected()) {
				setINSStatus();
			}
			selectAllTable();
			setModeByUnschdFlg();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			if (Cnd_ope_INS.isSelected()) {
				setINS_INITStatus();
			}
		}

		@Override
		protected void show() {
			super.show();
			setValueEx(HdrBtn_unexec_re_ext_flg,false);
			setHdrLotIssueFlg();
			setHdrSublotIssueFlg();
			setHdrSchedulerFrozenFlg();
			setByProdLotIssueFlg();
			setByProdSublotIssueFlg();
			if (MSC_MFG_STS_TYP.isYET(getHdrR().mfg_sts_typ())
					|| MSC_MFG_STS_TYP.isORD(getHdrR().mfg_sts_typ())) {
				getBtnR().inst_immed_prnt_flg(true);
				getOperBtnR().inpt_re_ext_flg(true);
				getOperBtnR().wk_re_ext_flg(true);
				getOperBtnR().byprod_re_ext_flg(true);
			}
			// 再展開未実施の処理で参照する変数に現在の値を保持しておく
			_bfrReExtR = getHdrR().clone();
			for (DtlOperR operR : getDtlOperL()) {
				operR.old_oper_abort_flg(operR.oper_abort_flg());
				operR.bfr_re_ext_st_schd_dt(operR.st_schd_dt());
				operR.bfr_re_ext_end_schd_dt(operR.end_schd_dt());
				operR.bfr_re_ext_base_unit_qty(operR.base_unit_qty());
				if (operR.tgt_oper_flg()) {
					operR.mes_flg(operR.mes_tgt_flg());
				}
			}
		}
	}
	
	// 画像関連処理
	/**
	 * 投入一覧の高さ、幅調整
	 */
	protected void adjustInptThImage() {
		int defInptRowHeight = getDefaultInptRowHeight();
		if (existsInptImage()) {
			int iw = getImageWH("inpt_th_image_width");
			int ih = getImageWH("inpt_th_image_height");
			if (iw != -1 && ih != -1) {
				DtlInptTable.setMCRowHeight(ih + 10);
				columnDtlInpt_th_image.setWidthForAdjustWidth(iw + 10);
				columnDtlInpt_th_image.setImageSize(iw, ih);
			}
			else {
				DtlInptTable.setMCRowHeight(defInptRowHeight);
			}
		}
		else {
			DtlInptTable.setMCRowHeight(defInptRowHeight);
		}
	}
	
	protected boolean existsInptImage() {
		for (DtlInptR r : getDtlInptL()) {
			if (r.th_image() != null) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 投入テーブルのデフォルトの行の高さを取得する
	 */
	protected int getDefaultInptRowHeight() {
		// 本メソッドは、高さ調整を行う前に実行する必要がある
		if (_defInptRowHeight == -1) {
			_defInptRowHeight = DtlInptTable.getRowHeight();
		}
		return _defInptRowHeight;
	}
	
	/**
	 * 副産品一覧の高さ、幅調整
	 */
	protected void adjustByProdThImage() {
		int defByProdRowHeight = getDefaultByProdRowHeight();
		// 副産品
		if (existsByProdImage()) {
			int bw = getImageWH("byprod_th_image_width");
			int bh = getImageWH("byprod_th_image_height");
			if (bw != -1 && bh != -1) {
				DtlByProdTable.setMCRowHeight(bh + 10);
				columnDtlByProd_th_image.setWidthForAdjustWidth(bw + 10);
				columnDtlByProd_th_image.setImageSize(bw, bh);
			}
			else {
				DtlByProdTable.setMCRowHeight(defByProdRowHeight);
			}
		}
		else {
			DtlByProdTable.setMCRowHeight(defByProdRowHeight);
		}
	}
	
	protected boolean existsByProdImage() {
		for (DtlByProdR r : getDtlByProdL()) {
			if (r.th_image() != null) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 副産品テーブルのデフォルトの行の高さを取得する
	 */
	protected int getDefaultByProdRowHeight() {
		// 本メソッドは、高さ調整を行う前に実行する必要がある
		if (_defByProdRowHeight == -1) {
			_defByProdRowHeight = DtlByProdTable.getRowHeight();
		}
		return _defByProdRowHeight;
	}
	
	/**
	 * ヘッダのイメージ部品にあわせて画像サイズを調整する
	 */
	protected void adjustParThImage() {
		int v = getAdjustedImageRatio();
		Icon i = Hdr_th_image.getIcon();
		if (i instanceof ImageIcon) {
			ImageIcon m = (ImageIcon)i;
			int w = m.getIconWidth() * v / 100;
			if (w < 1) {
				w = 1;
			}
			int h = m.getIconHeight() * v / 100;
			if (h < 1) {
				h = 1;
			}
			ImageIcon n = new ImageIcon(m.getImage());
			n.setImage(n.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH));
			
			Hdr_th_image.setIcon(n);
		}
	}
	
	/**
	 * ヘッダのイメージ部品にあわせた画像の比率を取得する
	 */
	protected int getAdjustedImageRatio() {
		Icon i = Hdr_th_image.getIcon();
		if (!(i instanceof ImageIcon)) {
			return 100;
		}
		ImageIcon m = (ImageIcon)i;
		int iw = m.getIconWidth();
		int ih = m.getIconHeight();
		int pw = Hdr_th_image.getWidth();
		int ph = Hdr_th_image.getHeight();
		boolean w = pw > iw;
		boolean h = ph > ih;
		if (w && h) {
			return 100;
		}
		int wr = (pw * 100) / iw;
		int hr = (ph * 100) / ih;
		return wr > hr ? hr : wr;
	}
	
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBCL1010_Upd01();
	}
	
	/**
	 * [MS_MSBCL1010_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1010_Upd01Caller<P extends MSBCP_MfgInstReg, B extends MS_MSBCL1010_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL1010_Upd01Caller(P p, B b) {
			super(p, b);
		}
		
		protected MCList<DtlOperR> _operForCall;
		protected MCList<DtlInptR> _inptForCall;
		protected MCList<DtlWkR> _wkForCall;
		protected MCList<DtlYieldR> _yieldForCall;
		protected MCList<DtlByProdR> _byProdForCall;
		protected MCList<DtlReExtR> _reExtForCall;
		
		@Override
		protected void initCaller() {
			super.initCaller();
			if (getBtnR().inst_immed_prnt_flg() || getBtnR().chg_list_immed_prnt_flg()) {
				setPrint(true);
			}
			if (MAC_MFG_INST_UNIT_TYP.isOPER(getHdrR().mfg_inst_unit_typ())) {
				_operForCall = getOperLForOperUnit();
				_inptForCall = getInptLForOperUnit();
				_wkForCall = getWkLForOperUnit();
				_yieldForCall = getYieldLForOperUnit();
				_byProdForCall = getByProdLForOperUnit();
			}
			else {
				_operForCall = getDtlOperL();
				_inptForCall = getDtlInptL();
				_wkForCall = getDtlWkL();
				_yieldForCall = getDtlYieldL();
				_byProdForCall = getDtlByProdL();
			}
			
			// 再展開履歴は更新行のみ対象とする
			_reExtForCall = getDtlReExtL().subList(r -> r.isStatusModify());
		}
		
		protected MCList<DtlOperR> getOperLForOperUnit() {
			MCList<DtlOperR> retL = MCList.create(DtlOperR.class);
			for (DtlOperR r : getDtlOperL()) {
				if (getHdrR().inst_abort_flg() && isNull(r.oper_inst_no())) {
					continue;
				}
				if (r.tgt_oper_flg()) {
					retL.add(r);
				}
				else if (isNull(r.oper_inst_no())) {
					retL.add(r);
				}
				else if (r.oper_abort_flg() || r.old_oper_abort_flg()) {
					retL.add(r);
				}
			}
			return retL;
		}
		
		protected MCList<DtlInptR> getInptLForOperUnit() {
			MCList<DtlInptR> retL = MCList.create(DtlInptR.class);
			for (DtlInptR r : getDtlInptL()) {
				if (getHdrR().inst_abort_flg() && isNull(r.inpt_schd_no())) {
					continue;
				}
				if (!isNull(_operForCall.getFirst(DtlOperR.$peg_no, r.oper_peg_no()))) {
					retL.add(r);
				}
			}
			return retL;
		}
		
		protected MCList<DtlWkR> getWkLForOperUnit() {
			MCList<DtlWkR> retL = MCList.create(DtlWkR.class);
			for (DtlWkR r : getDtlWkL()) {
				if (getHdrR().inst_abort_flg() && isNull(r.wk_schd_no())) {
					continue;
				}
				if (!isNull(_operForCall.getFirst(DtlOperR.$peg_no, r.oper_peg_no()))) {
					retL.add(r);
				}
			}
			return retL;
		}
		
		protected MCList<DtlYieldR> getYieldLForOperUnit() {
			MCList<DtlYieldR> retL = MCList.create(DtlYieldR.class);
			for (DtlYieldR r : getDtlYieldL()) {
				if (getHdrR().inst_abort_flg() && isNull(r.yield_schd_no())) {
					continue;
				}
				if (!isNull(_operForCall.getFirst(DtlOperR.$peg_no, r.oper_peg_no()))) {
					retL.add(r);
				}
			}
			return retL;
		}
		
		protected MCList<DtlByProdR> getByProdLForOperUnit() {
			MCList<DtlByProdR> retL = MCList.create(DtlByProdR.class);
			for (DtlByProdR r : getDtlByProdL()) {
				if (getHdrR().inst_abort_flg() && isNull(r.yield_schd_no())) {
					continue;
				}
				if (!isNull(_operForCall.getFirst(DtlOperR.$peg_no, r.oper_peg_no()))) {
					retL.add(r);
				}
			}
			return retL;
		}
		
		@Override
		protected void setupParam() {
			super.setupParam();
			bridge.up1().setAll(_operForCall);
			bridge.up2().setAll(_inptForCall);
			bridge.up3().setAll(_wkForCall);
			bridge.up4().setAll(_yieldForCall);
			bridge.up5().setAll(_byProdForCall);
			bridge.up6().setAll(_reExtForCall);
		}
		
		@Override
		protected void beforeCall() {
			super.beforeCall();
			setBtnRItm();
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			if (!getHdrR().inst_abort_flg()) {
				if (getHdrBtnR().unexec_re_ext_flg()) {
					msgList.add(new MCMessage(getHdrBtnR() ,HdrBtnR.$unexec_re_ext_flg, MSBCP1001));
				}
				for (DtlOperR operR : getDtlOperL().subList(DtlOperR.$unexec_re_ext_flg, true)) {
					msgList.add(new MCMessage(operR, DtlOperR.$unexec_re_ext_flg, MSBCP1002));
				}
			}
		}

		protected void setBtnRItm() {
			if (!getHdrR().inst_abort_flg() && !getHdrR().org_inst_abort_flg()) {
				bridge.up0().inst_immed_prnt_flg(getBtnR().inst_immed_prnt_flg());
				bridge.up0().chg_list_immed_prnt_flg(getBtnR().chg_list_immed_prnt_flg());
				bridge.up0().comp_dt_from_oper_flg(getBtnR().comp_dt_from_oper_flg());
			}
			bridge.up0().xfr_inst_del_enable_flg(getBtnR().xfr_inst_del_enable_flg());
		}

		@Override
		protected void setMode() {
			setFixStatus();
		}
	}
	
	/**
	 * Panel[Btn]のボタン[upd_aprv]の押下時の処理
	 */
	@Override
	public void doBtn_upd_aprv(MCEventInfo info) {
		callMS_MSBCL1010_Upd02();
	}
	
	/**
	 * [MS_MSBCL1010_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1010_Upd02Caller<P extends MSBCP_MfgInstReg, B extends MS_MSBCL1010_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL1010_Upd02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			setFixStatus();
		}
	}
	
	//********************** 画面遷移ボタン **************************
	
	/**
	 * Panel[HdrBtn]のボタン[open_MABCP0830]の押下時の処理
	 */
	@Override
	public void doHdrBtn_open_MABCP0830(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0830");
		mcframe.clientMABC.MABCP0830.CndR bind = mcframe.clientMABC.MABCP0830.CndR
				.create();
		
		bind.wg_cd(getHdrR().mfg_loc_wg_cd());
		bind.itm_cd(getHdrR().itm_cd());
		bind.itm_sub1(getHdrR().itm_sub1());
		bind.itm_sub2(getHdrR().itm_sub2());
		bind.itm_sub3(getHdrR().itm_sub3());
		bind.attach_info_typ(MAC_ATTACH_INFO_TYP.MFG.value());
		aso.putCnd(bind);
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[InptBtn]のボタン[open_MABCP0830]の押下時の処理
	 */
	@Override
	public void doInptBtn_open_MABCP0830(MCEventInfo info) {
		DtlInptR r = DtlInptTable.getSelectedMCRow();
		if (r == null) {
			dialog(msgNoSelectedRow());
			return;
		}
		
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MA", "MABCP0830");
		mcframe.clientMABC.MABCP0830.CndR bind = mcframe.clientMABC.MABCP0830.CndR
				.create();
		
		bind.wg_cd(getHdrR().mfg_loc_wg_cd());
		bind.itm_cd(r.itm_cd());
		bind.itm_sub1(r.itm_sub1());
		bind.itm_sub2(r.itm_sub2());
		bind.itm_sub3(r.itm_sub3());
		bind.attach_info_typ(MAC_ATTACH_INFO_TYP.MFG.value());
		aso.putCnd(bind);
		aso.putSearchAction();
		aso.show();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBCP0040]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBCP0040(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBCP0040");
		mcframe.clientMSBC.MSBCP0040.MSBCP_OrdReg msbcp0040 = 
				(mcframe.clientMSBC.MSBCP0040.MSBCP_OrdReg) aso.getPanel();
		mcframe.clientMSBC.MSBCP0040.CndR bind = mcframe.clientMSBC.MSBCP0040.CndR
				.create();
		bind.ope(msbcp0040.Cnd_ope_SRCH.getActionCommand());
		bind.itm_ord_no(getHdrR().itm_ord_no());
		aso.putCnd(bind);
		aso.putSearchAction();
		aso.show();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP0110]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0110(MCEventInfo info) {
		// 現品票発行画面への遷移
		MCRow bind = MCRow.create();
		bind.addStringColumn("mfg_inst_no", getHdrR().mfg_inst_no());
		openPanel("MS", "MSBEP0110", T5, bind);
	}
	
	//********************** テーブル操作（全選択・全解除・行追加・行削除・行コピー ・・・）**************************
	// 工程
	/**
	 * Panel[OperBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doOperBtn_radd(MCEventInfo info) {
		DtlOperR r = insertRow(DtlOperTable);
		setOperPegNo(r);
		setValueEx(columnDtlOper_tgt_oper_flg, r.getGUIIndex(), true);
		
		// リストロジックを定義していないため、コンテナに直接値を設定する
		r.base_unit_cd(getHdrR().base_unit_cd());
		r.base_unit_nm(getHdrR().base_unit_nm());
		r.base_unit_dec_place(getHdrR().base_unit_dec_place());
		r.oper_unit_cd(r.base_unit_cd());
		r.oper_unit_nm(r.base_unit_nm());
		r.oper_unit_dec_place(r.base_unit_dec_place());
		setValueEx(columnDtlOper_base_unit_qty, r.getGUIIndex(), getHdrR().base_unit_inst_qty());
		setValueEx(columnDtlOper_oper_unit_qty, r.getGUIIndex(), getHdrR().base_unit_inst_qty());
		setValueEx(columnDtlOper_oper_loc_cd, r.getGUIIndex(), getHdrR().mfg_loc_cd());
		setValueEx(columnDtlOper_oper_str_ln_cd, r.getGUIIndex(), nullValToNull(getHdrR().mfg_str_ln_cd()));
		// 行追加した行は、再展開対象外とする（工程連番がないため）
		setValueEx(columnDtlOper_re_ext_tgt_flg, r.getGUIIndex(), false);

	}
	
	protected void setOperPegNo(DtlOperR r) {
		MCNumber max = (MCNumber)getDtlOperL().max(DtlOperR.$peg_no);
		if (isNull(max)) {
			r.peg_no(MCNumber.ONE);
		}
		else {
			r.peg_no(max.add(MCNumber.ONE));
		}
	}
	
	/**
	 * Panel[OperBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doOperBtn_rdel(MCEventInfo info) {
		DtlOperR r = deleteRow(DtlOperTable);
		delAllDtl(r);
	}
	
	protected void delAllDtl(DtlOperR operR) {
		for (DtlInptR r : getDtlInptL().subList(DtlInptR.$oper_peg_no, operR.peg_no())) {
			r.oper_del_flg(operR.isStatusDelete());
			if (operR.isStatusDelete() && !r.isStatusDelete()) {
				deleteRowNoFocus(DtlInptTable, r.getGUIIndex());
			} else if (!operR.isStatusDelete() && r.isStatusDelete()) {
				deleteRowNoFocus(DtlInptTable, r.getGUIIndex());
			}
			else if (operR.isStatusCreate()) {
				deleteRowNoFocus(DtlInptTable, r.getGUIIndex());
			}
		}
		
		for (DtlWkR r : getDtlWkL().subList(DtlWkR.$oper_peg_no, operR.peg_no())) {
			r.oper_del_flg(operR.isStatusDelete());
			if (operR.isStatusDelete() && !r.isStatusDelete()) {
				deleteRowNoFocus(DtlWkTable, r.getGUIIndex());
			} else if (!operR.isStatusDelete() && r.isStatusDelete()) {
				deleteRowNoFocus(DtlWkTable, r.getGUIIndex());
			}
			else if (operR.isStatusCreate()) {
				deleteRowNoFocus(DtlWkTable, r.getGUIIndex());
			}
		}
		
		for (DtlYieldR r : getDtlYieldL().subList(DtlYieldR.$oper_peg_no, operR.peg_no())) {
			r.oper_del_flg(operR.isStatusDelete());
			if (operR.isStatusDelete() && !r.isStatusDelete()) {
				deleteRowNoFocus(DtlYieldTable, r.getGUIIndex());
			} else if (!operR.isStatusDelete() && r.isStatusDelete()) {
				deleteRowNoFocus(DtlYieldTable, r.getGUIIndex());
			}
			else if (operR.isStatusCreate()) {
				deleteRowNoFocus(DtlYieldTable, r.getGUIIndex());
			}
		}
		
		for (DtlByProdR r : getDtlByProdL().subList(DtlYieldR.$oper_peg_no, operR.peg_no())) {
			r.oper_del_flg(operR.isStatusDelete());
			if (operR.isStatusDelete() && !r.isStatusDelete()) {
				deleteRowNoFocus(DtlByProdTable, r.getGUIIndex());
			} else if (!operR.isStatusDelete() && r.isStatusDelete()) {
				deleteRowNoFocus(DtlByProdTable, r.getGUIIndex());
			}
			else if (operR.isStatusCreate()) {
				deleteRowNoFocus(DtlByProdTable, r.getGUIIndex());
			}
		}
		// 工程に紐づく投入、工数、出来高、副産品の行ステータス更新後に、各ボタンの活性/非活性のステータスを切り替える
		setInptBtnMode();
		setWkBtnMode();
		setYieldBtnMode();
		setByProdBtnMode();
	}
	/**
	 * Panel[OperBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doOperBtn_rcopy(MCEventInfo info) {
		DtlOperR r = copyRow(DtlOperTable);
		if (r != null) {
			r.copy_row_flg(true);
			r.last_mes_flg(false);
			setOperPegNo(r);
			if (!isAddedOper(r)) {
				setValueEx(columnDtlOper_re_ext_tgt_flg, r.getGUIIndex(), true);
			}
		}
	}
	
	// 投入
	/**
	 * Panel[InptBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doInptBtn_radd(MCEventInfo info) {
		DtlOperR operR = DtlOperTable.getSelectedMCRow();
		if (!isNull(operR)) {
			DtlInptR inptR = insertRow(DtlInptTable);
			copyOperInfoToInpt(operR, inptR);
		}
	}
	
	protected void copyOperInfoToInpt(DtlOperR operR, DtlInptR inptR) {
		inptR.tgt_oper_flg(operR.tgt_oper_flg());
		inptR.oper_cd(operR.oper_cd());
		inptR.oper_nm(operR.oper_nm());
		inptR.oper_seq(operR.oper_seq());
		inptR.oper_peg_no(operR.peg_no());
	}
	
	/**
	 * Panel[InptBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doInptBtn_rdel(MCEventInfo info) {
		DtlInptR r = DtlInptTable.getSelectedMCRow();
		if (isNull(r)) {
			return;
		}
		if (!canInptRDel(r)) {
			dialog(new MCMessage(MSBCP1005));
			return;
		}
		deleteRow(DtlInptTable);
		// 行削除を行った行に対して行コピーボタンを非活性に設定する
		setInptBtnModeSub(InptBtn_rcopy);
	}
	
	protected boolean canInptRDel(DtlInptR r) {
		if (!getHdrR().inpt_itm_del_flg()) {
			if (!isNull(r.bom_id_no())) {
				if (r.split_row_flg()) {
					// 同じbom_id_noが存在する場合は、行削除可
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return true;
			}
		}
		else {
			return true;
		}
	}
	
	/**
	 * Panel[InptBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doInptBtn_rcopy(MCEventInfo info) {
		DtlInptR inptR = copyRow(DtlInptTable);
		if (!isNull(inptR.bom_id_no())) {
			setValueEx(columnDtlInpt_split_row_flg, inptR.getGUIIndex(), true);
		}
	}
	
	/**
	 * Panel[InptBtn]のボタン[select_all_lot_prop_flg]の押下時の処理
	 */
	@Override
	public void doInptBtn_select_all_lot_prop_flg(MCEventInfo info) {
		for (DtlInptR r : DtlInptTable.getViewRows()) {
			// 以下を満たす場合に、チェックをオンにする
			// ・引当対象または、本来引当対象外だが引当済
			// ・指図時ロット指定する
			// ※BOM上で指図時にロット指定しないと指定している品目は、手動でロットを指定することは可能だが、自動的にはロットが指定されないようにするため、全選択の対象外とする
			// ・ロット提案対象FLGが入力可能
			if ((isAllocTgt(r) || r.alloc_flg()) && r.inst_lot_fix_flg()
					&& isEditable(columnDtlInpt_lot_prop_tgt_flg, r.getGUIIndex())) {
				setValueEx(columnDtlInpt_lot_prop_tgt_flg, r.getGUIIndex(), true);
			}
		}
	}
	protected boolean isAllocTgt(DtlInptR r) {
		if (MAC_ALLOC_CTL_TYP.isALLOC_INST_NG(r.alloc_ctl_typ())
				|| MAC_ALLOC_CTL_TYP.isALLOC_INST_OK(r.alloc_ctl_typ())) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * Panel[InptBtn]のボタン[deselect_all_lot_prop_flg]の押下時の処理
	 */
	@Override
	public void doInptBtn_deselect_all_lot_prop_flg(MCEventInfo info) {
		for (DtlInptR r : DtlInptTable.getViewRows()) {
			setValueEx(columnDtlInpt_lot_prop_tgt_flg, r.getGUIIndex(), false);
		}
	}
	
	// 工数
	/**
	 * Panel[WkBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doWkBtn_radd(MCEventInfo info) {
		DtlOperR operR = DtlOperTable.getSelectedMCRow();
		if (!isNull(operR)) {
			DtlWkR wkR = insertRow(DtlWkTable);
			copyOperInfoToWk(operR, wkR);
		}
	}
	
	protected void copyOperInfoToWk(DtlOperR operR, DtlWkR wkR) {
		wkR.tgt_oper_flg(operR.tgt_oper_flg());
		wkR.oper_cd(operR.oper_cd());
		wkR.oper_nm(operR.oper_nm());
		wkR.oper_seq(operR.oper_seq());
		wkR.oper_peg_no(operR.peg_no());
	}
	
	/**
	 * Panel[WkBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doWkBtn_rdel(MCEventInfo info) {
		deleteRow(DtlWkTable);
		// 行削除を行った行に対して行コピーボタンを非活性に設定する
		setWkBtnModeSub(WkBtn_rcopy);
	}
	/**
	 * Panel[WkBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doWkBtn_rcopy(MCEventInfo info) {
		copyRow(DtlWkTable);
	}
	
	// 出来高
	/**
	 * Panel[YieldBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doYieldBtn_radd(MCEventInfo info) {
		DtlOperR operR = DtlOperTable.getSelectedMCRow();
		if (!isNull(operR)) {
			DtlYieldR yieldR = insertRow(DtlYieldTable);
			copyOperInfoToYield(operR, yieldR);
			
			setValueEx(columnDtlYield_strg_loc_cd, yieldR.getGUIIndex(), getHdrR().strg_loc_cd());
			setValueEx(columnDtlYield_strg_str_ln_cd, yieldR.getGUIIndex(), nullValToNull(getHdrR().strg_str_ln_cd()));
		}
	}
	
	protected void copyOperInfoToYield(DtlOperR operR, DtlYieldR yieldR) {
		yieldR.tgt_oper_flg(operR.tgt_oper_flg());
		yieldR.oper_cd(operR.oper_cd());
		yieldR.oper_nm(operR.oper_nm());
		yieldR.oper_seq(operR.oper_seq());
		yieldR.oper_peg_no(operR.peg_no());
	}
	
	/**
	 * Panel[YieldBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doYieldBtn_rdel(MCEventInfo info) {
		deleteRow(DtlYieldTable);
		// 行削除を行った行に対して行コピーボタンを非活性に設定する
		setYieldBtnModeSub(YieldBtn_rcopy);
	}
	/**
	 * Panel[YieldBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doYieldBtn_rcopy(MCEventInfo info) {
		copyRow(DtlYieldTable);
	}
	
	// 副産品
	/**
	 * Panel[ByProdBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doByProdBtn_radd(MCEventInfo info) {
		DtlOperR operR = DtlOperTable.getSelectedMCRow();
		if (!isNull(operR)) {
			DtlByProdR byProdR = insertRow(DtlByProdTable);
			copyOperInfoToByProd(operR, byProdR);
			
			setValueEx(columnDtlByProd_strg_loc_cd, byProdR.getGUIIndex(), getHdrR().strg_loc_cd());
			setValueEx(columnDtlByProd_strg_str_ln_cd, byProdR.getGUIIndex(), nullValToNull(getHdrR().strg_str_ln_cd()));
		}
	}
	
	protected void copyOperInfoToByProd(DtlOperR operR, DtlByProdR byProdR) {
		byProdR.tgt_oper_flg(operR.tgt_oper_flg());
		byProdR.oper_cd(operR.oper_cd());
		byProdR.oper_nm(operR.oper_nm());
		byProdR.oper_seq(operR.oper_seq());
		byProdR.oper_peg_no(operR.peg_no());
	}
	
	/**
	 * Panel[ByProdBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doByProdBtn_rdel(MCEventInfo info) {
		deleteRow(DtlByProdTable);
		// 行削除を行った行に対して行コピーボタンを非活性に設定する
		setByProdBtnModeSub(ByProdBtn_rcopy);
	}
	/**
	 * Panel[ByProdBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doByProdBtn_rcopy(MCEventInfo info) {
		copyRow(DtlByProdTable);
	}
	
	//********************** 上へ・下へボタン**************************
	/**
	 * Panel[InptBtn]のボタン[move_top]の押下時の処理
	 */
	@Override
	public void doInptBtn_move_top(MCEventInfo info) {
		moveToTopRows(DtlInptTable);
	}
	/**
	 * Panel[InptBtn]のボタン[move_up]の押下時の処理
	 */
	@Override
	public void doInptBtn_move_up(MCEventInfo info) {
		upwardRows(DtlInptTable);
	}
	/**
	 * Panel[InptBtn]のボタン[move_down]の押下時の処理
	 */
	@Override
	public void doInptBtn_move_down(MCEventInfo info) {
		downwardRows(DtlInptTable);
	}
	/**
	 * Panel[InptBtn]のボタン[move_bottom]の押下時の処理
	 */
	@Override
	public void doInptBtn_move_bottom(MCEventInfo info) {
		moveToBottomRows(DtlInptTable);
	}
	/**
	 * Panel[WkBtn]のボタン[move_top]の押下時の処理
	 */
	@Override
	public void doWkBtn_move_top(MCEventInfo info) {
		moveToTopRows(DtlWkTable);
	}
	/**
	 * Panel[WkBtn]のボタン[move_up]の押下時の処理
	 */
	@Override
	public void doWkBtn_move_up(MCEventInfo info) {
		upwardRows(DtlWkTable);
	}
	/**
	 * Panel[WkBtn]のボタン[move_down]の押下時の処理
	 */
	@Override
	public void doWkBtn_move_down(MCEventInfo info) {
		downwardRows(DtlWkTable);
	}
	/**
	 * Panel[WkBtn]のボタン[move_bottom]の押下時の処理
	 */
	@Override
	public void doWkBtn_move_bottom(MCEventInfo info) {
		moveToBottomRows(DtlWkTable);
	}
	/**
	 * Panel[YieldBtn]のボタン[move_top]の押下時の処理
	 */
	@Override
	public void doYieldBtn_move_top(MCEventInfo info) {
		moveToTopRows(DtlYieldTable);
	}
	/**
	 * Panel[YieldBtn]のボタン[move_up]の押下時の処理
	 */
	@Override
	public void doYieldBtn_move_up(MCEventInfo info) {
		upwardRows(DtlYieldTable);
	}
	/**
	 * Panel[YieldBtn]のボタン[move_down]の押下時の処理
	 */
	@Override
	public void doYieldBtn_move_down(MCEventInfo info) {
		downwardRows(DtlYieldTable);
	}
	/**
	 * Panel[YieldBtn]のボタン[move_bottom]の押下時の処理
	 */
	@Override
	public void doYieldBtn_move_bottom(MCEventInfo info) {
		moveToBottomRows(DtlYieldTable);
	}
	/**
	 * Panel[ByProdBtn]のボタン[move_top]の押下時の処理
	 */
	@Override
	public void doByProdBtn_move_top(MCEventInfo info) {
		moveToTopRows(DtlByProdTable);
	}
	/**
	 * Panel[ByProdBtn]のボタン[move_up]の押下時の処理
	 */
	@Override
	public void doByProdBtn_move_up(MCEventInfo info) {
		upwardRows(DtlByProdTable);
	}
	/**
	 * Panel[ByProdBtn]のボタン[move_down]の押下時の処理
	 */
	@Override
	public void doByProdBtn_move_down(MCEventInfo info) {
		downwardRows(DtlByProdTable);
	}
	/**
	 * Panel[ByProdBtn]のボタン[move_bottom]の押下時の処理
	 */
	@Override
	public void doByProdBtn_move_bottom(MCEventInfo info) {
		moveToBottomRows(DtlByProdTable);
	}

	//********************** 画面起動時の初期設定 **************************
	@Override
	protected void setupParts() {
		super.setupParts();
		// ヘッダ
		Hdr_inst_qty_p_PPanel.setRelateBeans(Hdr_base_unit_cd, Hdr_base_unit_dec_place);
		Hdr_yield_qty_p_PPanel.setRelateBeans(Hdr_base_unit_cd, Hdr_base_unit_dec_place);
		Hdr_ord_qty_p_PPanel.setRelateBeans(Hdr_base_unit_cd, Hdr_base_unit_dec_place);
		Hdr_not_inst_qty_p_PPanel.setRelateBeans(Hdr_base_unit_cd,
				Hdr_base_unit_dec_place);
		Hdr_mfg_str_ln_p_PPanel.setRelateBeans(Hdr_mfg_loc_cd, Hdr_mfg_str_ln_tgt_flg);
		Hdr_strg_str_ln_p_PPanel.setRelateBeans(Hdr_strg_loc_cd, Hdr_strg_str_ln_tgt_flg);
		Hdr_inst_usr_dpt_p_PPanel.setRelateBeans(Hdr_inst_dt);
		Hdr_aprv_usr_dpt_p_PPanel.setRelateBeans(Hdr_aprv_dt);
		Hdr_lot_no_p_PPanel.setRelateBeans(Hdr_itm_cd, Hdr_itm_sub1, Hdr_itm_sub2,
				Hdr_itm_sub3, Hdr_lot_mng_typ, Hdr_lot_no_typ, Hdr_sublot_mng_typ,
				Hdr_sublot_no_typ);
		Hdr_sno_p_PPanel.setRelateBeans(Hdr_itm_cd, Hdr_itm_sub1, Hdr_itm_sub2,
				Hdr_itm_sub3, Hdr_sno1_mng_typ, Hdr_sno2_mng_typ, Hdr_sno3_mng_typ,
				Hdr_sno4_mng_typ);
		Hdr_aprv_rsn_p_PPanel.setMetaLength(mcframe.commonMS.meta.MS_META.APRV_RSN);
		
		// 工程
		DtlOper_base_unit_qty_p_PPanel.setRelateBeans(columnDtlOper_base_unit_cd,
				columnDtlOper_base_unit_dec_place);
		DtlOper_oper_unit_qty_p_PPanel.setRelateBeans(columnDtlOper_oper_unit_cd,
				columnDtlOper_oper_unit_dec_place);
		DtlOper_oper_str_ln_p_PPanel.setRelateBeans(columnDtlOper_oper_loc_cd,
				columnDtlOper_oper_str_ln_tgt_flg);
		
		// 投入
		DtlInpt_alt_qty_p_PPanel.setRelateBeans(columnDtlInpt_base_unit_cd,
				columnDtlInpt_base_unit_dec_place);
		DtlInpt_inpt_qty_p_PPanel.setRelateBeans(columnDtlInpt_base_unit_cd,
				columnDtlInpt_base_unit_dec_place);
		DtlInpt_rqmt_qty_p_PPanel.setRelateBeans(columnDtlInpt_base_unit_cd,
				columnDtlInpt_base_unit_dec_place);
		DtlInpt_fxd_rqmt_qty_p_PPanel.setRelateBeans(columnDtlInpt_base_unit_cd,
				columnDtlInpt_base_unit_dec_place);
		DtlInpt_sum_rqmt_qty_p_PPanel.setRelateBeans(columnDtlInpt_base_unit_cd,
				columnDtlInpt_base_unit_dec_place);

		DtlInpt_cont_inpt_qty_p_PPanel.setRelateBeans(columnDtlInpt_cont_fctr_flg,
				columnDtlInpt_base_unit_inpt_qty, columnDtlInpt_std_cont_fctr,
				columnDtlInpt_act_cont_fctr, columnDtlInpt_cont_fctr_dec_place,
				columnDtlInpt_cont_fctr_rnd_typ, true);
		DtlInpt_cont_rqmt_qty_p_PPanel.setRelateBeans(columnDtlInpt_cont_fctr_flg,
				columnDtlInpt_base_unit_rqmt_qty, columnDtlInpt_std_cont_fctr,
				columnDtlInpt_act_cont_fctr, columnDtlInpt_cont_fctr_dec_place,
				columnDtlInpt_cont_fctr_rnd_typ, true);
		DtlInpt_cont_fxd_rqmt_qty_p_PPanel.setRelateBeans(columnDtlInpt_cont_fctr_flg,
				columnDtlInpt_base_unit_fxd_rqmt_qty, columnDtlInpt_std_cont_fctr,
				columnDtlInpt_act_cont_fctr, columnDtlInpt_cont_fctr_dec_place,
				columnDtlInpt_cont_fctr_rnd_typ, true);
		DtlInpt_sum_cont_rqmt_qty_p_PPanel.setRelateBeans(columnDtlInpt_cont_fctr_flg,
				columnDtlInpt_base_unit_fxd_rqmt_qty, columnDtlInpt_std_cont_fctr,
				columnDtlInpt_act_cont_fctr, columnDtlInpt_cont_fctr_dec_place,
				columnDtlInpt_cont_fctr_rnd_typ, true);

		
		DtlInpt_inpt_str_ln_p_PPanel.setRelateBeans(columnDtlInpt_inpt_loc_cd,
				columnDtlInpt_inpt_str_ln_tgt_flg);
		DtlInpt_lot_no_p_PPanel.setRelateBeans(columnDtlInpt_itm_cd,
				columnDtlInpt_itm_sub1, columnDtlInpt_itm_sub2, columnDtlInpt_itm_sub3,
				columnDtlInpt_lot_mng_typ, columnDtlInpt_sublot_mng_typ);
		DtlInpt_sno_p_PPanel.setRelateBeans(columnDtlInpt_itm_cd, columnDtlInpt_itm_sub1,
				columnDtlInpt_itm_sub2, columnDtlInpt_itm_sub3,
				columnDtlInpt_sno1_mng_typ, columnDtlInpt_sno2_mng_typ,
				columnDtlInpt_sno3_mng_typ, columnDtlInpt_sno4_mng_typ);
		DtlInpt_alloc_sno_p_PPanel.setRelateBeans(columnDtlInpt_itm_cd, columnDtlInpt_itm_sub1,
				columnDtlInpt_itm_sub2, columnDtlInpt_itm_sub3,
				columnDtlInpt_sno1_mng_typ, columnDtlInpt_sno2_mng_typ,
				columnDtlInpt_sno3_mng_typ, columnDtlInpt_sno4_mng_typ);
		DtlInpt_ver_no_p_PPanel.setRelateBeans(columnDtlInpt_itm_cd, columnDtlInpt_itm_sub1,
				columnDtlInpt_itm_sub2, columnDtlInpt_itm_sub3, Hdr_mfg_loc_site_cd, columnDtlInpt_ver_flg);
		
		// 工数
		DtlWk_wk_cost_p_PPanel.setRelateBeans(columnDtlWk_wk_cost_unit_nm,
				columnDtlWk_wk_cost_dec_place);
		DtlWk_fxd_wk_cost_p_PPanel.setRelateBeans(columnDtlWk_wk_cost_unit_nm,
				columnDtlWk_wk_cost_dec_place);
		DtlWk_sum_wk_cost_p_PPanel.setRelateBeans(columnDtlWk_wk_cost_unit_nm,
				columnDtlWk_wk_cost_dec_place);
		
		// 出来高
		DtlYield_trd_unit_yield_qty_p_PPanel.setRelateBeans(Hdr_itm_cd, Hdr_itm_sub1,
				Hdr_itm_sub2, Hdr_itm_sub3, columnDtlYield_trd_unit_cd,
				columnDtlYield_trd_unit_dec_place, columnDtlYield_trd_unit_conv_rnd_typ,
				columnDtlYield_conv_base_qty, columnDtlYield_conv_qty,
				columnDtlYield_base_unit_cd);
		DtlYield_base_unit_yield_qty_p_PPanel.setRelateBeans(columnDtlYield_base_unit_cd,
				columnDtlYield_base_unit_dec_place,
				columnDtlYield_base_unit_conv_rnd_typ, columnDtlYield_trd_unit_yield_qty,
				columnDtlYield_conv_base_qty, columnDtlYield_conv_qty);
		DtlYield_strg_str_ln_p_PPanel.setRelateBeans(columnDtlYield_strg_loc_cd,
				columnDtlYield_strg_str_ln_tgt_flg);
		// 副産品
		DtlByProd_trd_unit_yield_qty_p_PPanel.setRelateBeans(columnDtlByProd_itm_cd,
				columnDtlByProd_itm_sub1, columnDtlByProd_itm_sub2,
				columnDtlByProd_itm_sub3, columnDtlByProd_trd_unit_cd,
				columnDtlByProd_trd_unit_dec_place,
				columnDtlByProd_trd_unit_conv_rnd_typ, columnDtlByProd_conv_base_qty,
				columnDtlByProd_conv_qty, columnDtlByProd_base_unit_cd);
		DtlByProd_base_unit_yield_qty_p_PPanel.setRelateBeans(columnDtlByProd_base_unit_cd,
				columnDtlByProd_base_unit_dec_place,
				columnDtlByProd_base_unit_conv_rnd_typ, columnDtlByProd_trd_unit_yield_qty,
				columnDtlByProd_conv_base_qty, columnDtlByProd_conv_qty);
		DtlByProd_strg_str_ln_p_PPanel.setRelateBeans(columnDtlByProd_strg_loc_cd,
				columnDtlByProd_strg_str_ln_tgt_flg);
		DtlByProd_lot_no_p_PPanel.setRelateBeans(columnDtlByProd_itm_cd,
				columnDtlByProd_itm_sub1, columnDtlByProd_itm_sub2,
				columnDtlByProd_itm_sub3, columnDtlByProd_lot_mng_typ,
				columnDtlByProd_lot_no_typ, columnDtlByProd_sublot_mng_typ,
				columnDtlByProd_sublot_no_typ, false);
		DtlByProd_sno_p_PPanel.setRelateBeans(columnDtlByProd_itm_cd,
				columnDtlByProd_itm_sub1, columnDtlByProd_itm_sub2,
				columnDtlByProd_itm_sub3, columnDtlByProd_sno1_mng_typ,
				columnDtlByProd_sno2_mng_typ, columnDtlByProd_sno3_mng_typ,
				columnDtlByProd_sno4_mng_typ);

	}
	
	@Override
	protected void listInit() {
		super.listInit();
		getDtlYield_trd_unit_cd_ListPutter().putBind(ItmUnitCols.$i_itm_cd, Hdr_itm_cd);
		getDtlYield_trd_unit_cd_ListPutter().putBind(ItmUnitCols.$i_itm_sub1, Hdr_itm_sub1);
		getDtlYield_trd_unit_cd_ListPutter().putBind(ItmUnitCols.$i_itm_sub2, Hdr_itm_sub2);
		getDtlYield_trd_unit_cd_ListPutter().putBind(ItmUnitCols.$i_itm_sub3, Hdr_itm_sub3);

		// 版ＮＯは埋込画面の項目のため、ListPutterの取得方法が異なる
		MCListPutter inptVerNoPutter = columnDtlInpt_ver_no.getListConfig()
				.getListPutter();
		inptVerNoPutter.putBind(ItmVerCols.$i_itm_cd, columnDtlInpt_itm_cd);
		inptVerNoPutter.putBind(ItmVerCols.$i_itm_sub1, columnDtlInpt_itm_sub1);
		inptVerNoPutter.putBind(ItmVerCols.$i_itm_sub2, columnDtlInpt_itm_sub2);
		inptVerNoPutter.putBind(ItmVerCols.$i_itm_sub3, columnDtlInpt_itm_sub3);
		inptVerNoPutter.putBind(ItmVerCols.$i_site_cd, Hdr_mfg_loc_site_cd);
	}

	@Override
	protected void valueInit() {
		super.valueInit();
		setSrchTgtTyp();
		setOperReExt();
	}
	
	protected void setOperReExt() {
		setValueEx(OperBtn_inpt_re_ext_flg, true);
		setValueEx(OperBtn_wk_re_ext_flg, true);
		setValueEx(OperBtn_byprod_re_ext_flg, true);
	}
	
	@Override
	public void layoutInit() {
		super.layoutInit();
		// サイズ変更はsuper.layoutInitの後に実行する（サイズ変更後にlayoutInitを実行すると、画像ファイルの次の項目との間に不要な改行が発生してしまうので）
		int pw = getImageWH("par_th_image_width");
		int ph = getImageWH("par_th_image_height");
		if (pw != -1 && ph != -1) {
			Hdr_th_image.setSize(pw, ph);
		}
	}
	
	protected int getImageWH(String whTag) {
		String key = MCConst.createKey(getModuleID(), getScreenID(), whTag);
		return MCConst.app.getInteger(key, -1);
	}

	@Override
	public void screenClearBody() {
		super.screenClearBody();
		// 再展開未実施の処理で参照する変数をクリアする
		_bfrReExtR = null;
		// ※_inptRowHeightと_byProdRowHeightはクリアしない（画面の値に依存する変数ではないので）
	}
	
	protected void setSrchTgtTyp() {
		if (Cnd_ope_INS.isSelected()) {
			getCndR().srch_tgt_typ(MSC_PROD_SRCH_TGT_TYP.ITM_ORD_NO.value());
			getCndR().srch_tgt_typ_nm(MSC_PROD_SRCH_TGT_TYP.ITM_ORD_NO.name());
		}
		else {
			getCndR().srch_tgt_typ(MSC_PROD_SRCH_TGT_TYP.MFG_INST_NO.value());
			getCndR().srch_tgt_typ_nm(MSC_PROD_SRCH_TGT_TYP.MFG_INST_NO.name());
		}
	}
	
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		// 初期ステータスであるINS_INITステータスは、画面イベントからも呼び出されるため、setINS_INITステータスではなく
		// 本メソッドでフォーカス制御している
		HdrPanel.focusFirstComponent();
	}
	
	//********************** コンボボックスの絞込 **************************
	// 検索対象区分
	@Override
	public MCList getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info) {
		if (Cnd_ope_INS.isSelected()) {
			addListLogicCnd(row, getDispProdSrchTgtTyp());
		}
		else {
			addListLogicCnd(row, getDispProdSrchTgtTyp());
		}
		return super.getCnd_srch_tgt_typ_nm(row, info);
	}

	public MSC_PROD_SRCH_TGT_TYP[] getDispProdSrchTgtTyp() {
		if (Cnd_ope_INS.isSelected()) {
			return new MSC_PROD_SRCH_TGT_TYP[] {
					MSC_PROD_SRCH_TGT_TYP.ITM_ORD_NO,
					MSC_PROD_SRCH_TGT_TYP.ITM_MFG_INST_NO
			};
		}
		else {
			return new MSC_PROD_SRCH_TGT_TYP[] {
				MSC_PROD_SRCH_TGT_TYP.MFG_INST_NO
			};
		}
	}
	
	// 製造指図状況区分
	@Override
	public MCList getHdr_mfg_sts_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispMfgStsTyp());
		return super.getHdr_mfg_sts_typ(row, info);
	}
	
	public MSC_MFG_STS_TYP[] getDispMfgStsTyp() {
		return new MSC_MFG_STS_TYP[] {
				MSC_MFG_STS_TYP.SAV, MSC_MFG_STS_TYP.ORD
		};
	}
	
	// 格納場所
	@Override
	public MCList getHdr_strg_loc_cd(MCRow row, MCEventInfo info) {
		setLocBind(row);
		return super.getHdr_strg_loc_cd(row, info);
	}
	
	@Override
	public MCList getDtlOper_oper_loc_cd(MCRow row, MCEventInfo info) {
		setLocBind(row);
		return super.getDtlOper_oper_loc_cd(row, info);
	}

	@Override
	public MCList getDtlInpt_inpt_loc_cd(MCRow row, MCEventInfo info) {
		setLocBind(row);
		return super.getDtlInpt_inpt_loc_cd(row, info);
	}

	@Override
	public MCList getDtlYield_strg_loc_cd(MCRow row, MCEventInfo info) {
		setLocBind(row);
		setItmBind(row);
		return super.getDtlYield_strg_loc_cd(row, info);
	}
	
	@Override
	public MCList getDtlByProd_strg_loc_cd(MCRow row, MCEventInfo info) {
		setLocBind(row);
		return super.getDtlByProd_strg_loc_cd(row, info);
	}

	/**
	 * リストロジックの場所の引数設定
	 * @param row
	 */
	protected void setLocBind(MCRow row) {
		row.setStringNE(LocCols.$i_wg_cd , getHdrR().mfg_loc_wg_cd());

		if (MSC_MFG_MTD_TYP.isEXTNL(getHdrR().mfg_mtd_typ())) {
			// 外注の場合は、同一ＷＧであれば外注場所を設定可能
			row.setStringNE(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.MFG_WG.value());
		}
		else {
			// 内製の場合は、格納先に外注場所を設定できない
			row.setStringNE(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.HOUSE_EQ_WG.value());
		}
	}

	/**
	 * リストロジックの品目の引数設定
	 * @param row
	 */
	protected void setItmBind(MCRow row) {
		row.addStringColumn(LocCols.$i_itm_cd, getHdrR().itm_cd());
		row.addStringColumn(LocCols.$i_itm_sub1, getHdrR().itm_sub1());
		row.addStringColumn(LocCols.$i_itm_sub2, getHdrR().itm_sub2());
		row.addStringColumn(LocCols.$i_itm_sub3, getHdrR().itm_sub3());
	}

	// 工程場所、投入場所、出来高格納場所、副産品格納場所
	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);
		if (beans == columnDtlOper_oper_loc_cd
				|| beans == columnDtlInpt_inpt_loc_cd
				|| beans == columnDtlYield_strg_loc_cd
				|| beans == columnDtlByProd_strg_loc_cd) {
			setLocBind(row);
		}
		return row;
	}

	//********************** IfOpePanel関連の実装 **************************
	@Override
	public MCButtonGroup getOpeButtonGroup() {
		return Cnd_ope_Group;
	}

	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getHdrR());
		ret.add(getHdrBtnR());
		ret.add(getDtlReExtL());
		ret.add(getDtlOperL());
		ret.add(getDtlInptL());
		ret.add(getDtlWkL());
		ret.add(getDtlYieldL());
		ret.add(getDtlByProdL());
		ret.add(getByProdBtnR());
		return ret;
	}
	
	@Override
	protected void opePanelFillSpace() {
		// マスタを再展開するのが通常の登録方法なため、fillSpaceは行わない
		return;
	}

	@Override
	public List<MCContainer> opePanelGetCndBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getCndR());
		return ret;
	}
	
	@Override
	public MCCheckBox getCndLatestFlg() {
		return Cnd_latest_flg;
	}
	
	@Override	
	public MCRowBeans getCndRevNo() {
		return Cnd_mfg_inst_rev;
	}
	
	@Override
	public MCCheckBox getRegLatestFlg() {
		return Hdr_latest_flg;
	}
	
	@Override
	public boolean isINSStatus(String status) {
		return isSame(status, INS_INIT) || isSame(status, INS_UNSCHD)
				|| isSame(status, INS_SCHD) || isSame(status, INS_YET);
	}
	
	@Override
	public boolean isUPDStatus(String status) {
		return isSame(status, UPD_ORD_ITM) || isSame(status, UPD_STT_ITM)
				|| isSame(status, UPD_ORD_OPER) || isSame(status, UPD_STT_OPER)
				|| isSame(status, UPD_CMPL) || isSame(status, UPD_APRV);
	}
	
	@Override
	public boolean isDELStatus(String status) {
		return isSame(status, DEL_INST) || isSame(status, DEL_APRV);
	}
	
	@Override
	public boolean isFIX_UStatus(String status) {
		return isSame(status, FIX_U) || isSame(status, FIX_APRV);
	}
	
	@Override
	public boolean isINSOpe(String ope) {
		return isSame(Cnd_ope_INS.getActionCommand(), ope);
	}

	@Override
	public boolean isUPDOpe(String ope) {
		return isSame(Cnd_ope_UPD.getActionCommand(), ope)
				|| isSame(Cnd_ope_APRV.getActionCommand(), ope);
	}

	@Override
	public boolean isDELOpe(String ope) {
		return isSame(Cnd_ope_DEL.getActionCommand(), ope);
	}

	@Override
	public boolean isREFOpe(String ope) {
		return isSame(Cnd_ope_REF.getActionCommand(), ope);
	}
	
	//********************** 参照登録、行コピー **************************
	protected void setRefToInsInit() {
		setValueEx(Hdr_inst_dt, getToday());
		setValueEx(Hdr_mfg_sts_typ, MSC_MFG_STS_TYP.ORD.value());
	}
	
	/**
	 * 参照登録時のRowステータスを変更するメソッド
	 */
	protected void setRowStatusForIns(List<MCContainer> containers) {
		// 非表示項目が引き継がれるようにするため、全ての行を表示する
		setValueEx(HdrBtn_disp_tgt_oper_only, false);
		setValueEx(HdrBtn_disp_select_oper_only, false);
		super.setRowStatusForIns(containers);
	}
	
	@Override
	protected void clearNotInheritInfo(List<MCContainer> containers) {
		super.clearNotInheritInfo(containers);
		// 再展開履歴は参照登録対象外のため、リストごとクリアする
		getDtlReExtL().clear();
	}
	
	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> list = super.getNotInheritCols(type, cont);
		// 本画面では着手・終了予定日をクリアしてしまうと、参照登録の意味が無い（必ず再展開をしないといけない）ため、
		// 指図日以外の日付項目はクリアしない
		if (cont == getHdrR()) {
			list.addAll(getHdrInheritCols(type));
		}
		else if (cont == getDtlOperL()) {
			list.addAll(getOperInheritCols(type));
		}
		else if (cont == getDtlInptL()) {
			list.addAll(getInptInheritCols(type));
		}
		else if (cont == getDtlWkL()) {
			list.addAll(getWkInheritCols(type));
		}
		else if (cont == getDtlYieldL()) {
			list.addAll(getYieldInheritCols(type));
		}
		else if (cont == getDtlByProdL()) {
			list.addAll(getByProdInheritCols(type));
		}
		return list;
	}
	
	protected List<String> getHdrInheritCols(String type) {
		List<String> list = new ArrayList<String>();
		list.add(HdrR.$mfg_sts_typ);
		list.add(HdrR.$mfg_sts_typ_nm);
		list.add(HdrR.$lot_no);
		list.add(HdrR.$sublot_no);
		list.add(HdrR.$inst_dt);
		list.add(HdrR.$inst_abort_flg);
		list.add(HdrR.$org_inst_abort_flg);
		list.add(HdrR.$inst_po_cnt_rmrks);
		list.add(HdrR.$disp_pd);
		list.add(HdrR.$mfg_inst_no);
		list.add(HdrR.$mfg_inst_rev);
		list.add(HdrR.$inst_prnt_tm);
		list.add(HdrR.$inst_prnt_flg);
		list.add(HdrR.$itm_mfg_inst_no);
		list.add(HdrR.$itm_ord_no);
		list.add(HdrR.$unschd_inst_flg);
		list.add(HdrR.$unschd_act_flg);
		list.add(HdrR.$base_unit_ord_qty);
		list.add(HdrR.$base_unit_not_inst_qty);
		list.add(HdrR.$ord_abort_flg);
		list.add(HdrR.$ord_mfg_st_schd_dt);
		list.add(HdrR.$ord_mfg_end_schd_dt);
		list.add(HdrR.$schd_chg_flg);
		list.add(HdrR.$itm_ord_sts_typ);
		list.add(HdrR.$po_d_no);
		list.add(HdrR.$po_aprv_sts_typ);
		list.add(HdrR.$po_aprv_sts_typ_nm);
		list.add(HdrR.$po_auto_reg_flg);
		list.add(HdrR.$mfg_aprv_sts_typ);
		list.add(HdrR.$mfg_aprv_sts_typ_nm);
		list.add(HdrR.$aprv_dt);
		list.add(HdrR.$aprv_tm);
		list.add(HdrR.$aprv_usr_cd);
		list.add(HdrR.$aprv_usr_nm);
		list.add(HdrR.$aprv_dpt_cd);
		list.add(HdrR.$aprv_dpt_nm);
		list.add(HdrR.$aprv_rsn);
		list.add(HdrR.$ins_usr_id);
		list.add(HdrR.$ins_usr_nm);
		list.add(HdrR.$ins_func_id);
		list.add(HdrR.$ins_func_nm);
		list.add(HdrR.$upd_usr_id);
		list.add(HdrR.$upd_usr_nm);
		list.add(HdrR.$upd_func_id);
		list.add(HdrR.$upd_func_nm);
		list.add(HdrR.$ins_ts);
		list.add(HdrR.$upd_ts);
		list.add(HdrR.$upd_srv_req_no);
		list.add(HdrR.$itm_ord_upd_cntr);
		list.add(HdrR.$itm_mfg_inst_upd_cntr);
		list.add(HdrR.$mfg_inst_upd_cntr);
		list.add(HdrR.$for_scheduler_frozen_flg);
		list.add(HdrR.$scheduler_frozen_flg);

		return list;
	}
	
	protected List<String> getOperInheritCols(String type) {
		List<String> list = new ArrayList<String>();
		list.add(DtlOperR.$oper_inst_no);
		list.add(DtlOperR.$mfg_sts_typ);
		list.add(DtlOperR.$mfg_sts_typ_nm);
		list.add(DtlOperR.$last_mes_flg);
		if (isSame(type, NOT_INHERIT_TYPE_REF_UPD)) {
			list.add(DtlOperR.$oper_abort_flg);
			list.add(DtlOperR.$oper_ord_no);
			list.add(DtlOperR.$mfg_inst_no);
			list.add(DtlOperR.$unschd_inst_flg);
			list.add(DtlOperR.$unschd_act_flg);
			list.add(DtlOperR.$scheduler_frozen_flg);
		}
		return list;
	}
	
	protected List<String> getInptInheritCols(String type) {
		List<String> list = new ArrayList<String>();
		list.add(DtlInptR.$inpt_schd_no);
		list.add(DtlInptR.$mfg_sts_typ);
		list.add(DtlInptR.$mfg_sts_typ_nm);
		if (isSame(type, NOT_INHERIT_TYPE_REF_UPD)) {
			list.add(DtlInptR.$mfg_inst_no);
			list.add(DtlInptR.$oper_inst_no);
		}
		return list;
	}
	
	protected List<String> getWkInheritCols(String type) {
		List<String> list = new ArrayList<String>();
		list.add(DtlWkR.$wk_schd_no);
		list.add(DtlWkR.$mfg_sts_typ);
		list.add(DtlWkR.$mfg_sts_typ_nm);
		if (isSame(type, NOT_INHERIT_TYPE_REF_UPD)) {
			list.add(DtlWkR.$mfg_inst_no);
			list.add(DtlWkR.$oper_inst_no);
		}
		return list;
	}
	
	protected List<String> getYieldInheritCols(String type) {
		List<String> list = new ArrayList<String>();
		list.add(DtlYieldR.$yield_schd_no);
		list.add(DtlYieldR.$mfg_sts_typ);
		list.add(DtlYieldR.$mfg_sts_typ_nm);
		if (isSame(type, NOT_INHERIT_TYPE_REF_UPD)) {
			list.add(DtlYieldR.$mfg_inst_no);
			list.add(DtlYieldR.$oper_inst_no);
		}
		return list;
	}
	
	protected List<String> getByProdInheritCols(String type) {
		List<String> list = new ArrayList<String>();
		list.add(DtlByProdR.$yield_schd_no);
		list.add(DtlByProdR.$mfg_sts_typ);
		list.add(DtlByProdR.$mfg_sts_typ_nm);
		if (isSame(type, NOT_INHERIT_TYPE_REF_UPD)) {
			list.add(DtlByProdR.$mfg_inst_no);
			list.add(DtlByProdR.$oper_inst_no);
			list.add(DtlByProdR.$lot_no);
			list.add(DtlByProdR.$sublot_no);
		}
		return list;
	}
	
	//********************** ステータス設定 **************************
	@Override
	public void setINS_INITStatus() {
		super.setINS_INITStatus();
		// フォーカス制御は行わない（画面イベントでも呼び出されるステータスのため、setOpenfocus内で制御する）
	}

	@Override
	public void setINS_UNSCHDStatus() {
		super.setINS_UNSCHDStatus();
		// フォーカス制御は行わない（画面イベントでも呼び出されるステータスのため、setINSStatus内で制御する）
	}

	@Override
	public void setINS_SCHDStatus() {
		super.setINS_SCHDStatus();
		// フォーカス制御は行わない（画面イベントでも呼び出されるステータスのため、setINSStatus内で制御する）
	}

	@Override
	public void setINS_YETStatus() {
		super.setINS_YETStatus();
		// フォーカス制御は行わない（setINSStatus内で制御するため）
	}

	protected void setUPD_ORDStatus() {
		if (MAC_MFG_INST_UNIT_TYP.isOPER(getHdrR().mfg_inst_unit_typ())) {
			setUPD_ORD_OPERStatus();
		}
		else {
			setUPD_ORD_ITMStatus();
		}
	}

	protected void setUPD_STTStatus() {
		if (MAC_MFG_INST_UNIT_TYP.isOPER(getHdrR().mfg_inst_unit_typ())) {
			setUPD_STT_OPERStatus();
		}
		else {
			setUPD_STT_ITMStatus();
		}
	}
	
	@Override
	public void setUPD_ORD_ITMStatus() {
		super.setUPD_ORD_ITMStatus();
		// フォーカス制御は行わない（画面イベントでも呼び出されるステータスのため、setUPDDtatus内で制御する）
	}

	@Override
	public void setUPD_STT_ITMStatus() {
		super.setUPD_STT_ITMStatus();
		// フォーカス制御は行わない（setUPDStatus内で制御するため）
	}
	
	@Override
	public void setUPD_ORD_OPERStatus() {
		super.setUPD_ORD_OPERStatus();
		// フォーカス制御は行わない（画面イベントでも呼び出されるステータスのため、setUPDDtatus内で制御する）
	}

	@Override
	public void setUPD_STT_OPERStatus() {
		super.setUPD_STT_OPERStatus();
		// フォーカス制御は行わない（setUPDStatus内で制御するため）
	}

	@Override
	public void setUPD_CMPLStatus() {
		super.setUPD_CMPLStatus();
		// フォーカス制御は行わない（画面イベントでも呼び出されるステータスのため、setUPDDtatus内で制御する）
	}

	@Override
	public void setUPD_APRVStatus() {
		super.setUPD_APRVStatus();
		setAprvDptUsrDftVal();
		setAprvDptUsrMode();
		AprvPanel.focusFirstComponent();
		clearAprvRsn();
		selectAllTable();
	}

	@Override
	public void setDEL_INSTStatus() {
		super.setDEL_INSTStatus();
		HdrPanel.focusFirstComponent();
		selectAllTable();
	}

	@Override
	public void setDEL_APRVStatus() {
		super.setDEL_APRVStatus();
		AprvPanel.focusFirstComponent();
		clearAprvRsn();
		selectAllTable();
	}

	/**
	 * 承認理由をクリアする
	 */
	protected void clearAprvRsn() {
		if (!isNull(getHdrR().aprv_rsn()) && isEditable(Hdr_aprv_rsn)) {
			getHdrR().aprv_rsn(null);
		}
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
		setRevNoMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		CndPanel.focusFirstComponent();
		setRevNoMode();
		selectAllTable();
	}

	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		ScreenOpePanel.focusFirstComponent();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_APRVStatus() {
		super.setFIX_APRVStatus();
		CndPanel.focusFirstComponent();
	}
	
	protected void selectAllTable() {
		if (getDtlOperL().size() > 0) {
			DtlOperTable.selectRowNoFocus(0);
		}
		selectInptTable();
		selectWkTable();
		selectYieldTable();
		selectByProdTable();
		selectReExtTable();
	}
	
	protected void selectInptTable() {
		if (getDtlInptL().size() > 0) {
			DtlInptTable.selectRowNoFocus(0);
		}
	}
	
	protected void selectWkTable() {
		if (getDtlWkL().size() > 0) {
			DtlWkTable.selectRowNoFocus(0);
		}
	}
	
	protected void selectYieldTable() {
		if (getDtlYieldL().size() > 0) {
			DtlYieldTable.selectRowNoFocus(0);
		}
	}
	
	protected void selectByProdTable() {
		if (getDtlByProdL().size() > 0) {
			DtlByProdTable.selectRowNoFocus(0);
		}
	}
	
	protected void selectReExtTable() {
		if (getDtlReExtL().size() > 0) {
			DtlReExtTable.selectRowNoFocus(0);
		}
	}
	
	@Override
	public void setINSStatus() {
		if (isNull(getHdrR().mfg_mtd_typ())) {
			setINS_INITStatus();
		}
		else if (isNull(getHdrR().itm_ord_no())) {
			// 計画外製造指図
			setINS_UNSCHDStatus();
		}
		else if (isNull(getHdrR().itm_mfg_inst_no())) {
			// オーダを元にした製造指図
			setINS_SCHDStatus();
			setDefPoLockedFlg();
		}
		else {
			// 工程単位製造指図で未指図工程を製造指図する場合のステータス
			setINS_YETStatus();
		}
		setModeDynamic();
		selectAllTable();
		HdrPanel.focusFirstComponent();
	}

	@Override
	public void setUPDStatus() {
		String aprvSts = getHdrR().mfg_aprv_sts_typ();
		if (MSC_MFG_APRV_STS_TYP.isINST_ACPT(aprvSts)
				|| MSC_MFG_APRV_STS_TYP.isACT_OPN(aprvSts)
				|| MSC_MFG_APRV_STS_TYP.isACT_ACPT(aprvSts)) {
			setREFStatus();
		}
		else {
			String mfgSts = getHdrR().mfg_sts_typ();
			if (Cnd_ope_APRV.isSelected()) {
				if (MSC_MFG_STS_TYP.isORD(mfgSts)
						&& MSC_MFG_APRV_STS_TYP.isINST_OPN(aprvSts)) {
					setUPD_APRVStatus();
				}
				else {
					setREFStatus();
				}
			}
			else {
				if (MSC_MFG_STS_TYP.isSAV(mfgSts)) {
					setUPD_ORDStatus();
				}
				else if (MSC_MFG_STS_TYP.isYET(mfgSts)) {
					// 未指図の場合、サーバの更新処理で指図済に置き換えるため、指図済と同じステータスとする
					setUPD_ORDStatus();
				}
				else if (MSC_MFG_STS_TYP.isORD(mfgSts)) {
					setUPD_ORDStatus();
				}
				else if (MSC_MFG_STS_TYP.isSTT(mfgSts)) {
					// 計画外実績のデータの場合は、変更不可のため完了ステータスの状態にする
					if (Hdr_unschd_act_flg.isSelected()) {
						setUPD_CMPLStatus();
					}
					else {
						setUPD_STTStatus();
					}
				}
				else if (MSC_MFG_STS_TYP.isCMPL(mfgSts)) {
					setUPD_CMPLStatus();
				}
				setDefPoLockedFlg();
				setModeDynamic();

				selectAllTable();
			}
		}
	}
	
	protected void setDefPoLockedFlg() {
		if (MSC_MFG_MTD_TYP.isEXTNL(getHdrR().mfg_mtd_typ())) {
			// 検索直後に呼ばれる場合があり、閉じ確認を出さないようにするため、コンテナに直接設定する
			getHdrR().po_locked_flg(true);
		}
		else {
			getHdrR().po_locked_flg(false);
		}
	}
	
	@Override
	public void setDELStatus() {
		String aprvSts = getHdrR().mfg_aprv_sts_typ();
		if (MSC_MFG_APRV_STS_TYP.isACT_OPN(aprvSts)
				|| MSC_MFG_APRV_STS_TYP.isACT_ACPT(aprvSts)) {
			setREFStatus();
		}
		else {
			String mfgSts = getHdrR().mfg_sts_typ();
			if (MSC_MFG_STS_TYP.isORD(mfgSts)
					&& MSC_MFG_APRV_STS_TYP.isINST_ACPT(aprvSts)) {
				setDEL_APRVStatus();
			}
			else {
				if (MSC_MFG_STS_TYP.isSAV(mfgSts) || MSC_MFG_STS_TYP.isORD(mfgSts)) {
					setDEL_INSTStatus();
				}
				else {
					setREFStatus();
				}
			}
		}
	}
	
	protected void setFixStatus() {
		if (Cnd_ope_INS.isSelected()) {
			setFIX_IStatus();
		}
		else if (Cnd_ope_UPD.isSelected()) {
			setFIX_UStatus();
		}
		else if (Cnd_ope_APRV.isSelected()) {
			setFIX_APRVStatus();
		}
		else if (Cnd_ope_DEL.isSelected()) {
			setFIX_DStatus();
		}
	}
	
	//********************** 動的な入力制御 **************************
	/**
	 * 実装仕様書で行えない入力制御
	 */
	protected void setModeDynamic() {
		setModeByMfgMtdTyp();
		setModeByMfgSts();
		setDtlBtnMode();
		setPrntMode();
		setChgListImmedPrntFlgMode();
	}
	
	protected void setPrntMode() {
		// 工程・ＢＯＭ変更リスト関連
		if (isChgListDisable()) {
			Btn_prnt_chg_list.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_prnt_chg_list);
		}
	}
	
	protected void setChgListImmedPrntFlgMode() {
		if (Cnd_ope_UPD.isSelected()) {
			if (!getHdrR().inst_prnt_flg()) {
				Btn_chg_list_immed_prnt_flg.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Btn_chg_list_immed_prnt_flg);
			}
		}
	}

	protected void setModeByUnschdFlg() {
		if (isSame(getStatus(), INS_INIT) || isSame(getStatus(), INS_UNSCHD) || isSame(getStatus(), INS_SCHD)) {
			setDefaultMode(Btn_open_MSBCP0040);
		}
		else {
			if (getHdrR().unschd_inst_flg()) {
				Btn_open_MSBCP0040.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_open_MSBCP0040);
			}
		}
	}

	protected boolean isChgListDisable() {
		if (isNull(getHdrR().mfg_inst_rev())) {
			return true;
		}
		if (isSame(getHdrR().mfg_inst_rev(), MCNumber.ONE)) {
			return true;
		}
		return false;
	}
	
	protected void setDtlBtnMode() {
		setOperBtnMode();
		setInptBtnMode();
		setWkBtnMode();
		setYieldBtnMode();
		setByProdBtnMode();
	}
	
	/**
	 * 生産方法区分による入力制御
	 */
	protected void setModeByMfgMtdTyp() {
		String mtd = getHdrR().mfg_mtd_typ();
		if (MSC_MFG_MTD_TYP.isINTNL(mtd)) {
			// 内製
			setDefaultMode(Hdr_not_qty_rlt_flg);
			if (getHdrR().unschd_act_flg()) {
				Hdr_inst_abort_flg.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Hdr_inst_abort_flg);
			}
			Hdr_rqst_dlv_rqst_dt.setMode(MCMode.READ_ONLY);
			Hdr_rqst_dlv_rqst_hm.setMode(MCMode.READ_ONLY);
			Hdr_po_locked_flg.setMode(MCMode.READ_ONLY);

			setDefaultMode(Hdr_base_unit_inst_qty);
			setDefaultMode(Hdr_strg_loc_cd);
			Hdr_inst_po_cnt_rmrks.setMode(MCMode.READ_ONLY);
		}
		else if (MSC_MFG_MTD_TYP.isEXTNL(mtd)) {
			// 未発注・発注済共通
			Hdr_not_qty_rlt_flg.setMode(MCMode.READ_ONLY);
			Hdr_inst_abort_flg.setMode(MCMode.READ_ONLY);
			Hdr_ord_abort_flg.setMode(MCMode.READ_ONLY);
			setDefaultMode(Hdr_rqst_dlv_rqst_dt);
			setDefaultMode(Hdr_po_locked_flg);
			
			if (isNull(getHdrR().po_d_no())) {
				// 未発注
				setDefaultMode(Hdr_mfg_loc_cd);
				setDefaultMode(Hdr_bom_ptn);
				setDefaultMode(Hdr_strg_loc_cd);
				if (isNull(getHdrR().itm_ord_no()) || getHdrR().unschd_inst_flg()) {
					setDefaultMode(Hdr_inst_po_cnt_rmrks);
				}
				else {
					// 計画オーダで未発注の場合は分割不可
					Hdr_base_unit_inst_qty.setMode(MCMode.READ_ONLY);
					Hdr_base_unit_yield_qty.setMode(MCMode.READ_ONLY);
					Hdr_inst_po_cnt_rmrks.setMode(MCMode.READ_ONLY);
				}
			}
			else {
				// 発注済
				Hdr_mfg_loc_cd.setMode(MCMode.READ_ONLY);
				Hdr_mfg_str_ln_cd.setMode(MCMode.READ_ONLY);
				Hdr_mfg_str_ln_cd_none_flg.setMode(MCMode.READ_ONLY);
				Hdr_bom_ptn.setMode(MCMode.READ_ONLY);
				Hdr_strg_loc_cd.setMode(MCMode.READ_ONLY);
				Hdr_strg_str_ln_cd.setMode(MCMode.READ_ONLY);
				Hdr_strg_str_ln_cd_none_flg.setMode(MCMode.READ_ONLY);
				Hdr_inst_po_cnt_rmrks.setMode(MCMode.READ_ONLY);
			}
		}
		
		setDtlBtnMode();
	}

	/**
	 * 製造状況区分による入力制御
	 */
	protected void setModeByMfgSts() {
		String sts = getHdrR().mfg_sts_typ();
		if (MSC_MFG_STS_TYP.isSAV(sts) || isNull(sts)) {
			if (isEditable(Hdr_inst_dt)) {
				Hdr_inst_dt.setMode(MCMode.ENABLE);
			}
		}
		else if (MSC_MFG_STS_TYP.isYET(sts) || MSC_MFG_STS_TYP.isORD(sts)) {
			setDefaultMode(Hdr_inst_dt);
		}
		else if (MSC_MFG_STS_TYP.isCMPL(sts)) {
			if (!getHdrR().org_inst_abort_flg()) {
				// 製造状況区分が完了かつ打切FLG（検索時）がオフ＝「製造実績が登録されて完了になったデータ」
				// ※この場合は、打切ＦＬＧを入力不可にする
				Hdr_inst_abort_flg.setMode(MCMode.READ_ONLY);
			}
		}
		
		setLotNoMode();

		setSprtLotNoMode();
	}
	
	protected void setLotNoMode() {
		// 製造指図の「訂正する」操作種別で、工程単位製造指図で初回以外の場合、ロットＮＯ、サブロットＮＯが入力不可となる
		if (Cnd_ope_UPD.isSelected()
				&& MAC_MFG_INST_UNIT_TYP.isOPER(getHdrR().mfg_inst_unit_typ())
				&& !getHdrR().frst_mfg_inst_flg()) {
			Hdr_lot_no_p_PPanel.setREAD_ONLYStatus();
			HdrBtn_lot_issue_flg.setMode(MCMode.READ_ONLY);
			HdrBtn_sublot_issue_flg.setMode(MCMode.READ_ONLY);
			return;
		}
		// 画面のステータスにマッピングされた、ロットＮＯパネルのステータスがENABLEの場合、ロット発番タイミング区分により入力制御を行う
		if (isSame(Hdr_lot_no_p_PPanel.getStatus(getStatus()), Hdr_lot_no_p_PPanel.ENABLE)) {
			if (MAC_LOT_ISSUE_TYP.isON_INST(getHdrR().lot_issue_typ())) {
				Hdr_lot_no_p_PPanel.setENABLEStatus();
				if (!MSC_MFG_STS_TYP.isSAV(getHdrR().mfg_sts_typ())) {
					if (MAC_LOT_NO_TYP.isMANUAL(getHdrR().lot_no_typ())) {
						Hdr_lot_no.setMode(MCMode.REQUIRED);
					}
					if (MAC_LOT_NO_TYP.isMANUAL(getHdrR().sublot_no_typ())) {
						Hdr_sublot_no.setMode(MCMode.REQUIRED);
					}
				}
			}
			else if (MAC_LOT_ISSUE_TYP.isON_CMPL(getHdrR().lot_issue_typ())) {
				Hdr_lot_no_p_PPanel.setREAD_ONLYStatus();
				getHdrR().lot_no(null);
				getHdrR().sublot_no(null);
			}
		}
	}
	
	protected void setSprtLotNoMode() {
		if (!isEditable(Hdr_lot_no)) {
			HdrBtn_sprt_lot_no.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(HdrBtn_sprt_lot_no);
		}
	}

	/**
	 * 打切ＦＬＧによる入力制御
	 */
	protected void setModeByAbortFlg() {
		// setModeDynamicからは呼ばずに打切ＦＬＧのイベントからのみ実行する
		if (getHdrR().org_inst_abort_flg()) {
			if (!getHdrR().inst_abort_flg()) {
				// 打切取消の操作
				Btn_upd.setMode(MCMode.ENABLE);
				Hdr_mfg_sts_typ.setMode(MCMode.REQUIRED);
			}
		}
		else {
			if (getHdrR().inst_abort_flg()) {
				setUPD_CMPLStatus();
				Btn_upd.setMode(MCMode.ENABLE);
			}
			else {
				setUPD_ORDStatus();
				setModeDynamic();
			}
		}
	}
	protected void setOperBtnMode() {

		if (MSC_MFG_MTD_TYP.isINTNL(getHdrR().mfg_mtd_typ())) {

			// 行追加、予定再展開
			if (exceptDeleteAndViewEmpty(DtlOperTable).isEmpty()) {
				OperBtn_radd.setMode(MCMode.DISABLE);
				OperBtn_sprt_schd_re_ext.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(OperBtn_radd);
				setDefaultMode(OperBtn_sprt_schd_re_ext);
			}
			
			// 行削除
			if (canOperRDel()) {
				setDefaultMode(OperBtn_rdel);
			}
			else {
				OperBtn_rdel.setMode(MCMode.DISABLE);
			}
			
			// 行コピー
			if (!isNull(DtlOperTable.getSelectedMCRow())) {
				setDefaultMode(OperBtn_rcopy);
			}
			else {
				OperBtn_rcopy.setMode(MCMode.DISABLE);
			}
		}
		else {
			OperBtn_radd.setMode(MCMode.DISABLE);
			OperBtn_rdel.setMode(MCMode.DISABLE);
			OperBtn_rcopy.setMode(MCMode.DISABLE);
		}
	}
	
	/**
	 * 工程単位製造指図の初回登録種別かどうか
	 * @return
	 */
	protected boolean isOperUnitFrstInsStatus() {
		if (MAC_MFG_INST_UNIT_TYP.isOPER(getHdrR().mfg_inst_unit_typ())) {
			if (isSame(getStatus(), INS_UNSCHD)) {
				return true;
			}
			if (isSame(getStatus(), INS_SCHD)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 工程単位製造指図の訂正種別または初回でない登録種別かどうか
	 * @return
	 */
	protected boolean isOperUnitUpdOrNotFrstInsStatus() {
		if (isSame(getStatus(), UPD_ORD_OPER)) {
			return true;
		}
		if (isSame(getStatus(), UPD_STT_OPER)) {
			return true;
		}
		if (isSame(getStatus(), INS_YET)) {
			return true;
		}
		return false;
	}
	
	protected boolean canOperRDel() {
		DtlOperR r = DtlOperTable.getSelectedMCRow();
		if (isNull(r)) {
			return false;
		}

		if (isOperUnitUpdOrNotFrstInsStatus() && !r.tgt_oper_flg()) {
			// 工程単位製造指図で初回製造指図登録時以外は対象工程以外の削除を不可とする
			return false;
		}
		
		if (isAddedOper(r)) {
			return true;
		}
		
		if (r.isStatusDelete()) {
			return true;
		}
	
		// 工程単位製造指図で初回製造指図登録時以外は、対象工程フラグがオンの行がなくなるような行削除を許可しない
		// 品目単位製造指図または工程単位製造指図で初回製造指図登録時は、工程がなくなるような行削除を許可しない
		MCList<DtlOperR> operL = MCList.create(DtlOperR.class);
		if (isOperUnitUpdOrNotFrstInsStatus()) {
			operL = getDtlOperL().subList(DtlOperR.$tgt_oper_flg, true);
			for (int i = 0; i < DtlOperTable.getRowCount(); i++) {
				if (DtlOperTable.isCellEditable(i, columnDtlOper_tgt_oper_flg) == MCMode.ENABLE) {
					operL.add(DtlOperTable.getRow(i));
				}
			}
		}
		else {
			operL = getDtlOperL();
		}
		for (DtlOperR operR : operL) {
			if (r != operR) {
				// マスタから展開された工程を0件にする行為は不可（製造指図時に工程展開は必須）
				if (!operR.isStatusDelete() && !isAddedOper(operR)) {
					return true;
				}
			}
		}
		return false;
	}
	
	protected boolean isAddedOper(DtlOperR r) {
		// 工程連番はマスタから展開された行にのみ値が設定される
		return isNull(r.oper_seq());
	}
	
	protected void setInptBtnMode() {
		setInptBtnModeSub(InptBtn_open_MABCP0830);
		setInptBtnModeSub(InptBtn_open_MSBEP0500_p_PPanel.StkInfo_open_MSBEP0500);
		setInptBtnModeSub(InptBtn_open_MSBCP1060_p_PPanel.InptTrgtSel_open_MSBCP1060);
		setInptBtnModeSub(InptBtn_radd);
		setInptBtnModeSub(InptBtn_rdel);
		setInptBtnModeSub(InptBtn_rcopy);
		setInptBtnModeSub(InptBtn_move_top);
		setInptBtnModeSub(InptBtn_move_up);
		setInptBtnModeSub(InptBtn_move_down);
		setInptBtnModeSub(InptBtn_move_bottom);
		
		if (!getDtlInptL().isEmpty()) {
			setDefaultMode(InptBtn_sprt_lot_prop);
			setDefaultMode(InptBtn_select_all_lot_prop_flg);
			setDefaultMode(InptBtn_deselect_all_lot_prop_flg);
		}
		else {
			InptBtn_sprt_lot_prop.setMode(MCMode.DISABLE);
			InptBtn_select_all_lot_prop_flg.setMode(MCMode.DISABLE);
			InptBtn_deselect_all_lot_prop_flg.setMode(MCMode.DISABLE);
		}
	}
	
	protected void setInptBtnModeSub(MCButton b) {
		DtlOperR operR = DtlOperTable.getSelectedMCRow();
		if (isNull(operR)) {
			b.setMode(MCMode.DISABLE);
			return;
		}
		if (isOperUnitUpdOrNotFrstInsStatus()) {
			if (!operR.tgt_oper_flg()) {
				if (b == InptBtn_radd || b == InptBtn_rcopy) {
					b.setMode(MCMode.DISABLE);
					return;
				}
			}
		}
		if (operR.isStatusDelete()) {
			if (b == InptBtn_radd) {
				b.setMode(MCMode.DISABLE);
				return;
			}
		}

		if (b != InptBtn_radd) {
			DtlInptR r = DtlInptTable.getSelectedMCRow();
			if (isNull(r)) {
				b.setMode(MCMode.DISABLE);
				return;
			}
			if (b == InptBtn_rdel) {
				if (r.oper_del_flg()) {
					// 工程の削除に連動した行は、個別の行削除復活は不可とする
					b.setMode(MCMode.DISABLE);
					return;
				}
			}
			else {
				if (r.isStatusDelete()) {
					b.setMode(MCMode.DISABLE);
					return;
				}
			}
		}
		setDefaultMode(b);
	}

	protected void setWkBtnMode() {
		setWkBtnModeSub(WkBtn_radd);
		setWkBtnModeSub(WkBtn_rdel);
		setWkBtnModeSub(WkBtn_rcopy);
		setWkBtnModeSub(WkBtn_move_top);
		setWkBtnModeSub(WkBtn_move_up);
		setWkBtnModeSub(WkBtn_move_down);
		setWkBtnModeSub(WkBtn_move_bottom);
	}
	
	protected void setWkBtnModeSub(MCButton b) {
		if (!MSC_MFG_MTD_TYP.isINTNL(getHdrR().mfg_mtd_typ())) {
			b.setMode(MCMode.DISABLE);
			return;
		}
		DtlOperR operR = DtlOperTable.getSelectedMCRow();
		if (isNull(operR)) {
			b.setMode(MCMode.DISABLE);
			return;
		}
		if (isOperUnitUpdOrNotFrstInsStatus()) {
			if (!operR.tgt_oper_flg()) {
				if (b == WkBtn_radd || b == WkBtn_rcopy) {
					b.setMode(MCMode.DISABLE);
					return;
				}
			}
		}
		if (operR.isStatusDelete()) {
			if (b == WkBtn_radd) {
				b.setMode(MCMode.DISABLE);
				return;
			}
		}

		if (b != WkBtn_radd) {
			DtlWkR r = DtlWkTable.getSelectedMCRow();
			if (isNull(r)) {
				b.setMode(MCMode.DISABLE);
				return;
			}
			if (b == WkBtn_rdel) {
				if (r.oper_del_flg()) {
					// 工程の削除に連動した行は、個別の行削除復活は不可とする
					b.setMode(MCMode.DISABLE);
					return;
				}
			}
			else {
				if (r.isStatusDelete()) {
					b.setMode(MCMode.DISABLE);
					return;
				}
			}
		}
		setDefaultMode(b);
	}
	
	protected void setYieldBtnMode() {
		setYieldBtnModeSub(YieldBtn_radd);
		setYieldBtnModeSub(YieldBtn_rdel);
		setYieldBtnModeSub(YieldBtn_rcopy);
		setYieldBtnModeSub(YieldBtn_move_top);
		setYieldBtnModeSub(YieldBtn_move_up);
		setYieldBtnModeSub(YieldBtn_move_down);
		setYieldBtnModeSub(YieldBtn_move_bottom);
	}
	
	protected void setYieldBtnModeSub(MCButton b) {
		if (!MSC_MFG_MTD_TYP.isINTNL(getHdrR().mfg_mtd_typ())) {
			b.setMode(MCMode.DISABLE);
			return;
		}
		DtlOperR operR = DtlOperTable.getSelectedMCRow();
		if (isNull(operR)) {
			b.setMode(MCMode.DISABLE);
			return;
		}
		if (isOperUnitUpdOrNotFrstInsStatus()) {
			if (!operR.tgt_oper_flg()) {
				if (b == YieldBtn_radd || b == YieldBtn_rcopy) {
					b.setMode(MCMode.DISABLE);
					return;
				}
			}
		}
		if (operR.isStatusDelete()) {
			if (b == YieldBtn_radd) {
				b.setMode(MCMode.DISABLE);
				return;
			}
		}

		if (b != YieldBtn_radd) {
			DtlYieldR r = DtlYieldTable.getSelectedMCRow();
			if (isNull(r)) {
				b.setMode(MCMode.DISABLE);
				return;
			}
			if (b == YieldBtn_rdel) {
				if (r.oper_del_flg()) {
					// 工程の削除に連動した行は、個別の行削除復活は不可とする
					b.setMode(MCMode.DISABLE);
					return;
				}
			}
			else {
				if (r.isStatusDelete()) {
					b.setMode(MCMode.DISABLE);
					return;
				}
			}
		}
		setDefaultMode(b);
	}

	protected void setByProdBtnMode() {
		setByProdBtnModeSub(ByProdBtn_radd);
		setByProdBtnModeSub(ByProdBtn_rdel);
		setByProdBtnModeSub(ByProdBtn_rcopy);
		setByProdBtnModeSub(ByProdBtn_move_top);
		setByProdBtnModeSub(ByProdBtn_move_up);
		setByProdBtnModeSub(ByProdBtn_move_down);
		setByProdBtnModeSub(ByProdBtn_move_bottom);
		
		if (MSC_MFG_MTD_TYP.isINTNL(getHdrR().mfg_mtd_typ())
				&& !getDtlByProdL().isEmpty()) {
			setDefaultMode(ByProdBtn_sprt_by_prod_lot_no);
			setDefaultMode(ByProdBtn_lot_issue_flg);
			setDefaultMode(ByProdBtn_sublot_issue_flg);
		}
		else {
			ByProdBtn_sprt_by_prod_lot_no.setMode(MCMode.DISABLE);
			ByProdBtn_lot_issue_flg.setMode(MCMode.READ_ONLY);
			ByProdBtn_sublot_issue_flg.setMode(MCMode.READ_ONLY);
		}
	}
	
	protected void setByProdBtnModeSub(MCButton b) {
		if (!MSC_MFG_MTD_TYP.isINTNL(getHdrR().mfg_mtd_typ())) {
			b.setMode(MCMode.DISABLE);
			return;
		}

		DtlOperR operR = DtlOperTable.getSelectedMCRow();
		if (isNull(operR)) {
			b.setMode(MCMode.DISABLE);
			return;
		}
		if (isOperUnitUpdOrNotFrstInsStatus()) {
			if (!operR.tgt_oper_flg()) {
				if (b == ByProdBtn_radd || b == ByProdBtn_rcopy) {
					b.setMode(MCMode.DISABLE);
					return;
				}
			}
		}
		if (operR.isStatusDelete()) {
			if (b == ByProdBtn_radd) {
				b.setMode(MCMode.DISABLE);
				return;
			}
		}

		if (b != ByProdBtn_radd) {
			DtlByProdR r = DtlByProdTable.getSelectedMCRow();
			if (isNull(r)) {
				b.setMode(MCMode.DISABLE);
				return;
			}
			if (b == ByProdBtn_rdel) {
				if (r.oper_del_flg()) {
					// 工程の削除に連動した行は、個別の行削除復活は不可とする
					b.setMode(MCMode.DISABLE);
					return;
				}
			}
			else {
				if (r.isStatusDelete()) {
					b.setMode(MCMode.DISABLE);
					return;
				}
			}
		}
		setDefaultMode(b);
	}
	//********************** cellConfig **************************
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlOperTable.setCellConfig(crtDtlOperCellConfig());
		DtlInptTable.setCellConfig(crtDtlInptCellConfig());
		DtlWkTable.setCellConfig(crtDtlWkCellConfig());
		DtlYieldTable.setCellConfig(crtDtlYieldCellConfig());
		DtlByProdTable.setCellConfig(crtDtlByProdCellConfig());
		DtlReExtTable.setCellConfig(crtDtlReExtCellConfig());
	}

	protected DtlOperCellConfig crtDtlOperCellConfig() {
		return new DtlOperCellConfig();
	}
	
	protected DtlInptCellConfig crtDtlInptCellConfig() {
		return new DtlInptCellConfig();
	}

	protected DtlWkCellConfig crtDtlWkCellConfig() {
		return new DtlWkCellConfig();
	}
	
	protected DtlYieldCellConfig crtDtlYieldCellConfig() {
		return new DtlYieldCellConfig();
	}

	protected DtlByProdCellConfig crtDtlByProdCellConfig() {
		return new DtlByProdCellConfig();
	}

	protected DtlReExtCellConfig crtDtlReExtCellConfig() {
		return new DtlReExtCellConfig();
	}

	protected class DtlOperCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			// 今回ＭＥＳの入力制御を設定する
			if (isMesFlgEditableOpe()) {
				DtlOperR r = getDtlOperL().get(index);
				if (column == columnDtlOper_mes_flg) {
					if (!r.tgt_oper_flg() || !r.mes_tgt_flg()) {
						return MCMode.READ_ONLY;
					}
				}
			}
			if (!isINSStatus(getStatus()) && !isUPDStatus(getStatus())) {
				return super.getPriorMode(index, column, table);
			}
			
			DtlOperR r = getDtlOperL().get(index);
			if (column == columnDtlOper_tgt_oper_flg) {
				if (!MAC_MFG_INST_UNIT_TYP.isOPER(getHdrR().mfg_inst_unit_typ())) {
					return MCMode.READ_ONLY;
				}
				else {
					if (!isNull(r.mfg_inst_no())) {
						return MCMode.READ_ONLY;
					}
					if (isOperUnitUpdOrNotFrstInsStatus() && (isAddedOper(r) || r.copy_row_flg())) {
						// 追加行またはコピー行の場合は読取専用
						return MCMode.READ_ONLY;
					}
				}
			}
			else {
				// これから新規登録する行は、対象工程ＦＬＧがオフでも未指図工程として登録されるが、
				// 既に登録済みの他の指図の場合は、登録対象外のため、未指図工程打切ＦＬＧ以外は入力不可
				if (!r.tgt_oper_flg() && !isNull(r.oper_inst_no())) {
					if (column != columnDtlOper_oper_abort_flg) {
						return MCMode.READ_ONLY;
					}
				}
				// 打切済みの未指図工程は、打切解除のみ可能
				if (r.old_oper_abort_flg()) {
					if (column != columnDtlOper_oper_abort_flg) {
						return MCMode.READ_ONLY;
					}
				}
			}
			if (column == columnDtlOper_oper_abort_flg) {
				if (!isOperAbortFlgEnable(r)) {
					return MCMode.READ_ONLY;
				}
			}
			
			if (MSC_MFG_STS_TYP.isSTT(r.mfg_sts_typ())
					|| MSC_MFG_STS_TYP.isCMPL(r.mfg_sts_typ())) {
				if (!isENABLEColSttOrCmpl(column)) {
					return MCMode.READ_ONLY;
				}
			}
		
			if (isAddedOper(r)) {
				if (column == columnDtlOper_tgt_oper_flg
						|| column == columnDtlOper_oper_seq
						|| column == columnDtlOper_re_ext_tgt_flg) {
					// ・行追加した行の場合（対象工程ＦＬＧは必ずオン）
					// ・工程連番は行追加時に妥当な値の設定が難しいため入力させない
					return MCMode.READ_ONLY;
				}
			}
			else {
				if (column == columnDtlOper_oper_cd) {
					return MCMode.READ_ONLY;
				}
				else if (column == columnDtlOper_unexec_re_ext_flg) {
					if (!isNull(r.base_unit_qty()) && !isNull(r.bfr_re_ext_base_unit_qty())) {
						if (!isSame(r.base_unit_qty(), r.bfr_re_ext_base_unit_qty())) {
							return MCMode.READ_ONLY;
						}
					}
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
		
		protected boolean isOperAbortFlgEnable(DtlOperR r) {
			if (isNull(r.mfg_inst_no()) && !isNull(r.oper_inst_no())) {
				return true;
			}
			return false;
		}
		
		/**
		 * 着手中または完了の場合に入力可能とする列を返す
		 */
		protected boolean isENABLEColSttOrCmpl(MCColumnConfig column) {
			return (column == columnDtlOper_re_ext_tgt_flg
					|| column == columnDtlOper_oper_abort_flg);
		}
		protected boolean isMesFlgEditableOpe() {
			if (Cnd_ope_INS.isSelected()) {
				return true;
			}
			else if (Cnd_ope_UPD.isSelected()) {
				return true;
			}
			else if (Cnd_ope_DEL.isSelected()) {
				if (isNull(getHdrR().mfg_aprv_sts_typ())) {
					return true;
				}
			}
			return false;
		}
	}

	protected class DtlInptCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (!isINSStatus(getStatus()) && !isUPDStatus(getStatus())) {
				return super.getPriorMode(index, column, table);
			}
			DtlInptR r = getDtlInptL().get(index);

			if (!r.tgt_oper_flg() && !isNull(r.oper_inst_no())) {
				// 既に登録済みの場合、自身の製造指図に紐付く場合のみ変更可能
				return MCMode.READ_ONLY;
			}
			
			if (column == columnDtlInpt_alloc_flg) {
				if (getHdrR().org_inst_abort_flg() && !getHdrR().inst_abort_flg()) {
					return MCMode.REQUIRED;
				}
			}
			
			if (MSC_MFG_STS_TYP.isSTT(r.mfg_sts_typ())
					|| MSC_MFG_STS_TYP.isCMPL(r.mfg_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			
			// 代替
			if (isAltItmCol(column)) {
				if (isNull(r.alt_grp_cd())) {
					return MCMode.READ_ONLY;
				}
			}
			
			// ロット指定・提案不可
			if (canNotLotFixCol(column)) {
				// 非在庫品・自給品・指図書のみの場合はロット指定・提案不可
				if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())
						|| MAC_PROV_TYP.isSS(r.prov_typ())
						|| MAC_INPT_CTL_TYP.isNO_MRP_INST(r.inpt_ctl_typ())) {
					return MCMode.READ_ONLY;
				}
			}

			// ロットＮＯ、サブロットＮＯ
			if (column == columnDtlInpt_lot_no) {
				if (!MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
					if (isSame(getStatus(), UPD_APRV)) {
						return MCMode.READ_ONLY;
					}
					if (isLotNoRO(r)) {
						return MCMode.READ_ONLY;
					}
					if (MSC_MFG_STS_TYP.isSAV(getHdrR().mfg_sts_typ())) {
						return MCMode.ENABLE;
					}
					if (!r.tgt_oper_flg()) {
						// 対象工程がオフの行のロットＮＯは入力必須にしない
						return MCMode.ENABLE;
					}
					if (!r.inst_lot_fix_flg()) {
						if (!MSC_MFG_STS_TYP.isCMPL(getHdrR().mfg_sts_typ())) {
							return MCMode.REQUIRED;
						}
					}
				}
			}
			if (column == columnDtlInpt_sublot_no) {
				if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
					if (isSame(getStatus(), UPD_APRV)) {
						return MCMode.READ_ONLY;
					}
					if (isSublotNoRO(r)) {
						return MCMode.READ_ONLY;
					}
					if (MSC_MFG_STS_TYP.isSAV(getHdrR().mfg_sts_typ())) {
						return MCMode.ENABLE;
					}
					if (!r.tgt_oper_flg()) {
						// 対象工程がオフの行のサブロットＮＯは入力必須にしない
						return MCMode.ENABLE;
					}
					if (!r.inst_lot_fix_flg()) {
						if (!MSC_MFG_STS_TYP.isCMPL(getHdrR().mfg_sts_typ())) {
							return MCMode.REQUIRED;
						}
					}
				}
			}
			
			// 引当
			if (column == columnDtlInpt_alloc_flg) {
				if (!r.tgt_oper_flg()) {
					return MCMode.READ_ONLY;
				}
				if (MAC_INPT_CTL_TYP.isNO_MRP_INST(r.inpt_ctl_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			
			// ロット提案対象
			if (column == columnDtlInpt_lot_prop_tgt_flg) {
				if (isLotPropTgtFlgRO(r)) {
					return MCMode.READ_ONLY;
				}
			}
			
			// ロット指定無し
			if (column == columnDtlInpt_no_lot_fix_flg) {
				if (!r.tgt_oper_flg()) {
					return MCMode.READ_ONLY;
				}
				if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())
						&& MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			
			// ＢＯＭから展開された行の場合
			if (!isNull(r.bom_id_no())) {
				if (isBomRowROCol(column)) {
					return MCMode.READ_ONLY;
				}
				if (!isNull(r.inpt_schd_no())) {
					// 登録済みの場合、引当制御区分は入力不可
					// ※引き当てた行を対象外とする変更が対応できないため
					if (column == columnDtlInpt_alloc_ctl_typ) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtlInpt_sno1
					|| column == columnDtlInpt_sno2
					|| column == columnDtlInpt_sno3
					|| column == columnDtlInpt_sno4) {
					return MCMode.READ_ONLY;
				}
			}
			else {
				if (column == columnDtlInpt_lot_mix_flg) {
					if (isLotMixFlgRO(r)) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtlInpt_sublot_mix_flg) {
					if (isSublotMixFlgRO(r)) {
						return MCMode.READ_ONLY;
					}
				}
			}
			
			// 引当手配ＮＯは入力必須にしない
			if (isSAllocSnoCol(column)) {
				if (column.getMode().equals(MCMode.ENABLE)) {
					return MCMode.ENABLE;
				}
			}
			if (column == columnDtlInpt_base_unit_fxd_rqmt_qty
					|| column == columnDtlInpt_cont_fxd_rqmt_qty) {
				if (r.fxd_loss_rsn_none_flg() || MAC_ALT_ITM_TYP.isMIX(r.alt_itm_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
		
		protected boolean isBomRowROCol(MCColumnConfig column) {
			return  DtlInpt_itm_p_PPanel.isItm(column)
					|| column == columnDtlInpt_bkf_typ
					|| column == columnDtlInpt_alloc_ctl_typ
					|| column == columnDtlInpt_inpt_ctl_typ
					|| column == columnDtlInpt_lot_mix_flg
					|| column == columnDtlInpt_sublot_mix_flg;
		}
		
		protected boolean isAltItmCol(MCColumnConfig column) {
			return column == columnDtlInpt_alt_itm_fix_flg
					|| column == columnDtlInpt_base_unit_alt_qty;
		}

		/**
		 * ロット指定・提案不可の場合に入力不可となる列を返す
		 * @param column
		 * @return
		 */
		protected boolean canNotLotFixCol(MCColumnConfig column) {
			return column == columnDtlInpt_lot_prop_tgt_flg
					|| column == columnDtlInpt_alloc_flg
					|| column == columnDtlInpt_inst_lot_fix_flg
					|| column == columnDtlInpt_no_lot_fix_flg
					|| column == columnDtlInpt_lot_no
					|| column == columnDtlInpt_sublot_no;
		}

		protected boolean isSAllocSnoCol(MCColumnConfig column) {
			return  column == columnDtlInpt_alloc_sno1
					|| column == columnDtlInpt_alloc_sno2
					|| column == columnDtlInpt_alloc_sno3
					|| column == columnDtlInpt_alloc_sno4;
		}
	}
	
	protected boolean isLotPropTgtFlgRO(DtlInptR r) {
		if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())
				&& MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
			// ロット管理区分、サブロット管理区分が共に「ロット管理しない」場合は読取専用
			return true;
		}
		if (isLotSublotROCmn(r)) {
			return true;
		}
		return false;
	}

	protected boolean isLotNoRO(DtlInptR r) {
		if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
			return true;
		}
		if (r.no_lot_fix_flg()) {
			return true;
		}
		if (isLotSublotROCmn(r)) {
			return true;
		}
		return false;
	}
	
	protected boolean isSublotNoRO(DtlInptR r) {
		if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
			return true;
		}
		if (r.no_lot_fix_flg()) {
			return true;
		}
		if (isLotSublotROCmn(r)) {
			return true;
		}
		return false;
	}
	
	protected boolean isLotMixFlgRO(DtlInptR r) {
		if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
			return true;
		}
		if (isLotSublotROCmn(r)) {
			return true;
		}
		return false;
	}
	
	protected boolean isSublotMixFlgRO(DtlInptR r) {
		if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
			return true;
		}
		if (isLotSublotROCmn(r)) {
			return true;
		}
		return false;
	}
	protected boolean isLotSublotROCmn(DtlInptR r) {
		if (MSC_MFG_STS_TYP.isSTT(r.mfg_sts_typ()) || MSC_MFG_STS_TYP.isCMPL(r.mfg_sts_typ())) {
			return true;
		}
		if (MAC_INPT_CTL_TYP.isNO_MRP_INST(r.inpt_ctl_typ())) {
			return true;
		}
		if (getHdrR().inst_abort_flg()) {
			return true;
		}
		return false;
	}
	
	protected class DtlWkCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (!isINSStatus(getStatus()) && !isUPDStatus(getStatus())) {
				return super.getPriorMode(index, column, table);
			}
			
			DtlWkR r = getDtlWkL().get(index);
			if (!r.tgt_oper_flg() && !isNull(r.oper_inst_no())) {
				return MCMode.READ_ONLY;
			}
			if (MSC_MFG_STS_TYP.isSTT(r.mfg_sts_typ())
					|| MSC_MFG_STS_TYP.isCMPL(r.mfg_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			return super.getPriorMode(index, column, table);
		}
	}

	protected class DtlYieldCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (!isINSStatus(getStatus()) && !isUPDStatus(getStatus())) {
				return super.getPriorMode(index, column, table);
			}
			
			DtlYieldR r = getDtlYieldL().get(index);
			if (!r.tgt_oper_flg() && !isNull(r.oper_inst_no())) {
				return MCMode.READ_ONLY;
			}
			
			if (MSC_MFG_MTD_TYP.isEXTNL(getHdrR().mfg_mtd_typ())) {
				return MCMode.READ_ONLY;
			}
			
			if (MSC_MFG_STS_TYP.isSTT(r.mfg_sts_typ())
					|| MSC_MFG_STS_TYP.isCMPL(r.mfg_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			return super.getPriorMode(index, column, table);
		}
	}

	protected class DtlByProdCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (!isINSStatus(getStatus()) && !isUPDStatus(getStatus())) {
				return super.getPriorMode(index, column, table);
			}
			
			DtlByProdR r = getDtlByProdL().get(index);
			if (!r.tgt_oper_flg() && !isNull(r.oper_inst_no())) {
				return MCMode.READ_ONLY;
			}
			if (MSC_MFG_STS_TYP.isSTT(r.mfg_sts_typ())
					|| MSC_MFG_STS_TYP.isCMPL(r.mfg_sts_typ())) {
				return MCMode.READ_ONLY;
			}
			return super.getPriorMode(index, column, table);
		}
	}

	protected class DtlReExtCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {

			DtlReExtR r = getDtlReExtL().get(index);
			
			// 反映順最大行以外は入力不可
			if (!isSame(r.getValue(DtlReExtR.$ref_ord), getDtlReExtL().max(DtlReExtR.$ref_ord))) {
				return MCMode.READ_ONLY;
			}
			
			if (column == columnDtlReExt_unneces_flg) {
				// 指図再展開区分が「再展開済」の場合は不要フラグを入力不可にする
				if (MSC_RE_EXT_TYP.isEXT(r.re_ext_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
	}
	//********************** 画面イベント **************************
	// 種別変更
	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);	
		// 検索条件区分の設定
		setSrchTgtTyp();

		// 新規登録後に種別を変更した場合は、必要に応じてNOを検索条件に設定する
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			setValueEx(Cnd_srch_tgt_no, getHdrR().mfg_inst_no());
		}
	}		

	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe,
			String afOpe, String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		
		// 参照登録
		if (isSame(bfOpe, Cnd_ope_REF.getActionCommand()) && isSame(bfSt, REF)) {
			if (isSame(afOpe, Cnd_ope_INS.getActionCommand())) {
				setRefToInsInit();
				setRowStatusForIns(getDtlOperL(), getDtlInptL(), getDtlWkL(), getDtlYieldL(), getDtlByProdL());
			}
		}
		
		// 再展開ボタンの設定
		if (isSame(afOpe, Cnd_ope_UPD.getActionCommand()) && MAC_MFG_INST_UNIT_TYP.isOPER(getHdrR().mfg_inst_unit_typ())) {
			HdrBtn_sprt_re_ext.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(HdrBtn_sprt_re_ext);
		}
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		
		Hdr_sno1.addLCListener(this);
		Hdr_sno2.addLCListener(this);
		Hdr_sno3.addLCListener(this);
		Hdr_sno4.addLCListener(this);
		Hdr_st_schd_dt.addLCListener(this);
		Hdr_end_schd_dt.addLCListener(this);
		Hdr_base_unit_inst_qty.addLCListener(this);
		Hdr_base_unit_yield_qty.addLCListener(this);
		Hdr_mfg_str_ln_cd.addLCListener(this);
		Hdr_strg_str_ln_cd.addLCListener(this);
		
		Hdr_itm_p_PPanel.addItmLCListner(this);
		
		columnDtlOper_st_schd_dt.addLCListener(this);
		columnDtlOper_end_schd_dt.addLCListener(this);
		columnDtlOper_base_unit_qty.addLCListener(this);
		columnDtlOper_oper_str_ln_cd.addLCListener(this);
		
		columnDtlInpt_base_unit_inpt_qty.addLCListener(this);
		columnDtlInpt_base_unit_rqmt_qty.addLCListener(this);
		columnDtlInpt_base_unit_fxd_rqmt_qty.addLCListener(this);
		
		columnDtlInpt_cont_inpt_qty.addLCListener(this);
		columnDtlInpt_cont_rqmt_qty.addLCListener(this);
		columnDtlInpt_cont_fxd_rqmt_qty.addLCListener(this);
		columnDtlInpt_act_cont_fctr.addLCListener(this);
		DtlInpt_itm_p_PPanel.addItmLCListner(this);
		DtlByProd_itm_p_PPanel.addItmLCListner(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Hdr_base_unit_inst_qty) {
			doHdr_base_unit_inst_qty_LC(info);
		}
		else if (lc == Hdr_base_unit_yield_qty) {
			doHdr_base_unit_yield_qty_LC(info);
		}
		else if (lc == Hdr_mfg_str_ln_cd) {
			doHdr_mfg_str_ln_cd_LC(info);
		}
		else if (lc == Hdr_strg_str_ln_cd) {
			doHdr_strg_str_ln_cd_LC(info);
		}
		else if (lc == columnDtlOper_base_unit_qty) {
			doDtlOper_base_unit_qty_LC(info);
		}
		else if (lc == columnDtlOper_oper_str_ln_cd) {
			doOper_str_ln_cd_LC(info);
		}
		else if (lc == columnDtlInpt_base_unit_inpt_qty) {
			doDtlInpt_base_unit_inpt_qty_LC(info);
		}
		else if (lc == columnDtlInpt_base_unit_rqmt_qty) {
			doDtlInpt_base_unit_rqmt_qty_LC(info);
		}
		else if (lc == columnDtlInpt_base_unit_fxd_rqmt_qty) {
			doDtlInpt_base_unit_fxd_rqmt_qty_LC(info);
		}
		else if (lc == columnDtlInpt_cont_inpt_qty) {
			doDtlInpt_cont_inpt_qty_LC(info);
		}
		else if (lc == columnDtlInpt_cont_rqmt_qty) {
			doDtlInpt_cont_rqmt_qty_LC(info);
		}
		else if (lc == columnDtlInpt_cont_fxd_rqmt_qty) {
			doDtlInpt_cont_fxd_rqmt_qty_LC(info);
		}
		else if (lc == columnDtlInpt_act_cont_fctr) {
			doDtlInpt_act_cont_fctr_LC(info);
		}
		else if (Hdr_itm_p_PPanel.isItm(lc)) {
			doHdr_itm_LC(info);
		}
		else if (DtlInpt_itm_p_PPanel.isItm(lc)) {
			doDtlInpt_itm_LC(info);
		}
		else if (DtlByProd_itm_p_PPanel.isItm(lc)) {
			doDtlByProd_itm_LC(info);
		}

		if (isReqHdrReExtBeans(lc)) {
			setHdrUnExecReExtFlg(lc, info);
		}
		else if (isReqOperReExtBeans(lc)) {
			setOperUnExecReExtFlg(lc, info);
		}
	}
	protected void doDtlInpt_itm_LC(MCEventInfo info) {
		DtlInptR r = getDtlInptL().get(info.getEventIndex());
		setFxdLossRsnNoneFlg(r);
		clearLotSublotMixFlg(r);
		setZeroToFxdRqmtQty(r);
	}
	protected void setFxdLossRsnNoneFlg(DtlInptR r) {
		MCList<MCRow> list = getLossRsnList(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), this);
		if (list.subList("fxd_loss_flg", true).isEmpty()) {
			r.fxd_loss_rsn_none_flg(true);
		}
		else {
			r.fxd_loss_rsn_none_flg(false);
		}
	}
	protected void clearLotSublotMixFlg(DtlInptR r) {
		if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
			r.lot_mix_flg(false);
		}
		if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
			r.sublot_mix_flg(false);
		}
	}
	
	/**
	 * BOMマスタに登録されていない、かつ、<br>ロス理由マスタに固定ロス理由なしで登録されている子品目を追加した場合、
	 * <br>固定必要数量に0を固定で設定します。
	 * @param r 投入タブのコンテナRow
	 */
	protected void setZeroToFxdRqmtQty(DtlInptR r) {
		if (isNull(r.bom_id_no())
				&& r.fxd_loss_rsn_none_flg()
				&& !isNull(r.itm_nm())
				&& DtlInpt_itm_p_PPanel.isItmFix(r.getGUIIndex())) {
			r.base_unit_fxd_rqmt_qty(MCNumber.ZERO);
		}
	}
	
	@Override
	public void doDtlOper_NC(MCEventInfo info) {
		super.doDtlOper_NC(info);
		setOperBtnMode();
		setInptBtnMode();
		setWkBtnMode();
		setYieldBtnMode();
		setByProdBtnMode();
		
		if (getHdrBtnR().disp_select_oper_only()) {
			doSelectOperFilter();
		}
	}
	
	@Override
	public void doDtlOper_tgt_oper_flg_NC(MCEventInfo info) {
		super.doDtlOper_tgt_oper_flg_NC(info);
		DtlOperR operR = getDtlOperL().get(info.getEventIndex());
		copyToDtl(operR);
		if (getHdrBtnR().disp_tgt_oper_only()) {
			doTgtOperFilter();
		}
		if (isEditable(Btn_comp_dt_from_oper_flg)) {
			if (!getBtnR().comp_dt_from_oper_flg()) {
				setValueEx(Btn_comp_dt_from_oper_flg, true);
			}
		}
		operR.mes_flg(operR.mes_tgt_flg());
		// 行削除
		if (canOperRDel()) {
			setDefaultMode(OperBtn_rdel);
		}
		else {
			OperBtn_rdel.setMode(MCMode.DISABLE);
		}
	}
	
	protected void copyToDtl(DtlOperR operR) {
		for (DtlInptR inptR : getDtlInptL().subList(DtlInptR.$oper_peg_no, operR.peg_no())) {
			inptR.tgt_oper_flg(operR.tgt_oper_flg());
			if (!inptR.tgt_oper_flg()) {
				setValueEx(columnDtlInpt_alloc_flg, inptR.getGUIIndex(), false);
			}
			else {
				if (isAllocTgt(inptR) && isEditable(columnDtlInpt_alloc_flg, inptR.getGUIIndex())) {
					setValueEx(columnDtlInpt_alloc_flg, inptR.getGUIIndex(), true);
				}
			}
		}
		for (DtlWkR wkR : getDtlWkL().subList(DtlWkR.$oper_peg_no, operR.peg_no())) {
			wkR.tgt_oper_flg(operR.tgt_oper_flg());
		}
		for (DtlYieldR yieldR : getDtlYieldL().subList(DtlYieldR.$oper_peg_no, operR.peg_no())) {
			yieldR.tgt_oper_flg(operR.tgt_oper_flg());
		}
		for (DtlByProdR byProdR : getDtlByProdL().subList(DtlByProdR.$oper_peg_no, operR.peg_no())) {
			byProdR.tgt_oper_flg(operR.tgt_oper_flg());
		}
	}
	
	@Override
	public void doDtlOper_oper_cd_LC(MCEventInfo info) {
		super.doDtlOper_oper_cd_LC(info);
		DtlOperR operR = getDtlOperL().get(info.getEventIndex());
		for (DtlInptR inptR : getDtlInptL().subList(DtlInptR.$oper_peg_no, operR.peg_no())) {
			copyOperInfoToInpt(operR, inptR);
		}
		for (DtlWkR wkR : getDtlWkL().subList(DtlWkR.$oper_peg_no, operR.peg_no())) {
			copyOperInfoToWk(operR, wkR);
		}
		for (DtlYieldR yieldR : getDtlYieldL().subList(DtlYieldR.$oper_peg_no, operR.peg_no())) {
			copyOperInfoToYield(operR, yieldR);
		}
		for (DtlByProdR byProdR : getDtlByProdL().subList(DtlInptR.$oper_peg_no, operR.peg_no())) {
			copyOperInfoToByProd(operR, byProdR);
		}
		HdrR hdr = getHdrR();
		boolean mesTgtFlg = MSUCP_SCMLinkUtil.getMesFlg(hdr.mfg_loc_cd(), hdr.itm_cd(),
				hdr.itm_sub1(), hdr.itm_sub2(), hdr.itm_sub3(), operR.oper_cd(),
				getToday(), getRootPanel());
		operR.mes_tgt_flg(mesTgtFlg);
		operR.mes_flg(mesTgtFlg);
	}

	@Override
	public void doDtlOper_re_ext_tgt_flg_NC(MCEventInfo info) {
		super.doDtlOper_re_ext_tgt_flg_NC(info);
		DtlOperR operR = getDtlOperL().get(info.getEventIndex());
		setSameOperReExtTgtFlg(operR);
		setYieldOperReExtTgtFlg(operR);
	}

	/**
	 * 同一工程ＣＤ、工程連番の再展開対象フラグを連動させる
	 * @param operR
	 */
	protected void setSameOperReExtTgtFlg(DtlOperR operR) {
		for (DtlOperR r : getDtlOperL().subList(DtlOperR.$tgt_oper_flg, true)) {
			boolean reExtTgtFlg = operR.re_ext_tgt_flg();
			if (isSame(r.oper_cd(), operR.oper_cd()) && isSame(r.oper_seq(), operR.oper_seq())) {
				r.re_ext_tgt_flg(reExtTgtFlg);
			}
		}
	}
	

	/**
	 * 出来高工程の再展開対象フラグを連動させる
	 * @param operR
	 */
	protected void setYieldOperReExtTgtFlg(DtlOperR operR) {
		if (operR.yield_oper_flg()) {
			boolean reExtTgtFlg = operR.re_ext_tgt_flg();
			for (DtlOperR r : getDtlOperL()) {
				if (r.yield_oper_flg()) {
					r.re_ext_tgt_flg(reExtTgtFlg);
				}
			}
		}
	}
	
	@Override
	public void doDtlOper_oper_abort_flg_NC(MCEventInfo info) {
		super.doDtlOper_oper_abort_flg_NC(info);
		//ヘッダの製造状況区分が完了且つ、指図単位区分が工程単位の場合、
		//工程タブの工程打切・打切取消時には、更新可能とする。
		if (MSC_MFG_STS_TYP.isCMPL(getHdrR().mfg_sts_typ()) && MAC_MFG_INST_UNIT_TYP.isOPER(getHdrR().mfg_inst_unit_typ())) {
			for (DtlOperR operR : getDtlOperL()) {
				if (( !operR.old_oper_abort_flg() && operR.oper_abort_flg() ) || 
						( operR.old_oper_abort_flg() && !operR.oper_abort_flg() ) ) {
						Btn_upd.setMode(MCMode.ENABLE);
						return;
					}
			}
		}
		setDefaultMode(Btn_upd);
	}
	
	@Override
	public void doDtlInpt_NC(MCEventInfo info) {
		super.doDtlInpt_NC(info);
		setInptBtnMode();
	}

	@Override
	public void doDtlWk_NC(MCEventInfo info) {
		super.doDtlWk_NC(info);
		setWkBtnMode();
	}

	@Override
	public void doDtlYield_NC(MCEventInfo info) {
		super.doDtlYield_NC(info);
		setYieldBtnMode();
	}

	@Override
	public void doDtlByProd_NC(MCEventInfo info) {
		super.doDtlByProd_NC(info);
		setByProdBtnMode();
	}
	
	// 生産方法区分（内製・外注）の変更
	@Override
	public boolean doHdr_mfg_mtd_typ_VC(MCEventInfo info) {
		// 生産方法区分が変更可能ということは、必ず登録種別であり、再展開後の工程テーブルのステータスはCREATEであるため
		// 工程テーブルのみ変更を判断している
		if (isChanged(DtlOperTable) && !confirmRegDataClear()) {
			return false;
		}
		return super.doHdr_mfg_mtd_typ_VC(info);
	}
	
	@Override
	public void doHdr_mfg_mtd_typ_LC(MCEventInfo info) {
		super.doHdr_mfg_mtd_typ_LC(info);
		// リストロジック用の項目の設定
		if (MSC_MFG_MTD_TYP.isINTNL(getHdrR().mfg_mtd_typ())) {
			setINS_UNSCHDStatus();
			setModeByMfgMtdTyp();
			if (!isNull(info.getOldValue())) {
				clearRegBlocksWhenChngMtdTyp();
			}
			getHdrR().mfg_flg(true);
			getHdrR().outsrc_flg(false);
			setDefaultMfgStsTyp();
			setDefaultMasterDt();
		}
		else if (MSC_MFG_MTD_TYP.isEXTNL(getHdrR().mfg_mtd_typ())) {
			setINS_UNSCHDStatus();
			setModeByMfgMtdTyp();
			if (!isNull(info.getOldValue())) {
				clearRegBlocksWhenChngMtdTyp();
			}
			getHdrR().mfg_flg(false);
			getHdrR().outsrc_flg(true);
			setDefaultMfgStsTyp();
			setDefaultMasterDt();
			setValueEx(Hdr_not_qty_rlt_flg, false);
			setDefPoLockedFlg();
		}
		else {
			getHdrR().mfg_flg(false);
			getHdrR().outsrc_flg(false);
			setINS_INITStatus();
			clearRegBlocksWhenChngMtdTyp();
		}
	}
	
	protected void setDefaultMfgStsTyp() {
		setValueEx(Hdr_mfg_sts_typ, MSC_MFG_STS_TYP.ORD.value());
	}
	protected void setDefaultMasterDt() {
		setValueEx(Hdr_master_dt, getToday());
	}
	
	protected void clearRegBlocksWhenChngMtdTyp() {
		String oldMtdTyp = getHdrR().mfg_mtd_typ();
		String oldMtdTypNm = getHdrR().mfg_mtd_typ_nm();
		for (MCContainer cont : opePanelGetRegBlocks()) {
			cont.clear();
		}
		getHdrR().mfg_mtd_typ(oldMtdTyp);
		getHdrR().mfg_mtd_typ_nm(oldMtdTypNm);
		
		Hdr_rqst_dlv_rqst_hm.setMode(MCMode.READ_ONLY);
		Hdr_st_schd_hm.setMode(MCMode.READ_ONLY);
		Hdr_end_schd_hm.setMode(MCMode.READ_ONLY);
	}
	
	// 製造状況区分の変更
	@Override
	public void doHdr_mfg_sts_typ_LC(MCEventInfo info) {
		super.doHdr_mfg_sts_typ_LC(info);
		
		setModeByMfgSts();
		setInstDefVal();
	}
	
	protected void setInstDefVal() {
		if (MSC_MFG_STS_TYP.isYET(getHdrR().mfg_sts_typ())
				|| MSC_MFG_STS_TYP.isORD(getHdrR().mfg_sts_typ())) {
			if (isNull(getHdrR().inst_dt())) {
				setValueEx(Hdr_inst_dt, getToday());
			}
			setValueEx(Btn_inst_immed_prnt_flg, true);
		}
		else if (MSC_MFG_STS_TYP.isSAV(getHdrR().mfg_sts_typ())) {
			setValueEx(Hdr_inst_dt, null);
			setValueEx(Btn_inst_immed_prnt_flg, false);
		}
	}
	
	// 品目の変更
	protected void doHdr_itm_LC(MCEventInfo info) {
		if (!_isDuringItmClearEvent) {
			clearRegBlocksWhenChngItm();
		}
		setLotNoMode();
	}
	
	@Override
	public void doHdr_bom_ptn_LC(MCEventInfo info) {
		super.doHdr_bom_ptn_LC(info);
		
		setLotNoMode();
		
		setSprtLotNoMode();
		
		setDefValueByBomPtn(info);
	}

	protected boolean _isDuringItmClearEvent = false;
	
	protected void clearRegBlocksWhenChngItm() {
		// 指図数量が入力されていない場合はクリアしない（製造場所などは品目のイベントで値が設定されるため）
		if (isNull(getHdrR().base_unit_inst_qty())) {
			return;
		}

		try {
			_isDuringItmClearEvent = true;
			HdrR oldHdrR = getHdrR().clone();
			for (MCContainer cont : opePanelGetRegBlocks()) {
				cont.clear();
			}
			setValueEx(Hdr_mfg_mtd_typ, oldHdrR.mfg_mtd_typ());
			setValueEx(Hdr_mfg_sts_typ, oldHdrR.mfg_sts_typ());
			setValueEx(Hdr_master_dt, oldHdrR.master_dt());
			String ope = Hdr_itm_cd.getListConfig().getOpeType();
			Hdr_itm_cd.getListConfig().setOpeType(MCListConfig.INPUT);
			try {
				setValueEx(Hdr_itm_cd, oldHdrR.itm_cd());
			}
			finally {
				Hdr_itm_cd.getListConfig().setOpeType(ope);
			}
			setValueEx(Hdr_itm_sub1, oldHdrR.itm_sub1());
			setValueEx(Hdr_itm_sub2, oldHdrR.itm_sub2());
			setValueEx(Hdr_itm_sub3, oldHdrR.itm_sub3());
		}
		finally {
			_isDuringItmClearEvent = false;
		}
	}
	
	protected void setDefValueByBomPtn(MCEventInfo info) {
		if(!isNull(getHdrR().base_unit_inst_qty())) {
			doHdr_base_unit_inst_qty_LC(info);
		}
		else if(!isNull(getHdrR().base_unit_yield_qty())) {
			doHdr_base_unit_yield_qty_LC(info);
		}
	}
	
	// 製造ＷＧの変更
	@Override
	public void doHdr_mfg_loc_wg_cd_LC(MCEventInfo info) {
		super.doHdr_mfg_loc_wg_cd_LC(info);
		setValueEx(Hdr_strg_loc_cd, null);
	}
	
	// 指図打切ＦＬＧの変更
	@Override
	public void doHdr_inst_abort_flg_NC(MCEventInfo info) {
		super.doHdr_inst_abort_flg_NC(info);
		
		setModeByAbortFlg();
		setMfgStsByInstAbortFlg();
	}

	protected void setMfgStsByInstAbortFlg() {
		if (getHdrR().org_inst_abort_flg()) {
			if (!getHdrR().inst_abort_flg()) {
				// 打切取消時には、製造状況区分を指定させるためnullにクリアする
				// ※モード設定を動作させたくないので、コンテナの値を直接設定する
				getHdrR().mfg_sts_typ(null);
				getHdrR().mfg_sts_typ_nm(null);
			}
			else {
				getHdrR().mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
				getHdrR().mfg_sts_typ_nm(MSC_MFG_STS_TYP.CMPL.name());
			}
		}
	}
	
	// 再展開未実施関連処理
	protected boolean isReqHdrReExtBeans(MCLCBeans lc) {
		if (lc == Hdr_base_unit_inst_qty || lc == Hdr_base_unit_yield_qty
				|| lc == Hdr_bom_ptn || lc == Hdr_oper_ptn || lc == Hdr_mfg_loc_cd
				|| lc == Hdr_st_schd_dt || lc == Hdr_end_schd_dt || lc == Hdr_sno1
				|| lc == Hdr_sno2 || lc == Hdr_sno3 || lc == Hdr_sno4) {
			return true;
		}
		return false;
	}
	
	protected String[] getReqHdrReExtCols() {
		return new String[] {
				HdrR.$base_unit_inst_qty, HdrR.$base_unit_yield_qty, HdrR.$bom_ptn, HdrR.$oper_ptn, HdrR.$mfg_loc_cd,
				HdrR.$st_schd_dt, HdrR.$end_schd_dt, HdrR.$sno1, HdrR.$sno2, HdrR.$sno3,
				HdrR.$sno4
		};
	}
	
	protected HdrR _bfrReExtR = HdrR.create(); 
	
	protected void setHdrUnExecReExtFlg(MCLCBeans lc, MCEventInfo info) {
		if (getDtlOperL().isEmpty()) {
			// まだ展開されていない場合は、何もしない
			return;
		}
		if (!MCMode.ENABLE.equals(HdrBtn_sprt_re_ext.getMode())) {
			// 再展開ボタンが押せない場合（工程単位製造指図の訂正時や残工程の指図時）は、何もしない
			return;
		}
		if (isColSame(getHdrR(), _bfrReExtR, getReqHdrReExtCols())) {
			// 元の値に戻した場合は、falseに戻す
			setValueEx(HdrBtn_unexec_re_ext_flg, false);
			setDefaultMode(HdrBtn_unexec_re_ext_flg);
		}
		else {
			setValueEx(HdrBtn_unexec_re_ext_flg, true);
			if (isEditable(HdrBtn_unexec_re_ext_flg)) {
				if (lc == Hdr_base_unit_inst_qty || lc == Hdr_base_unit_yield_qty
						|| lc == Hdr_bom_ptn || lc == Hdr_oper_ptn) {
					// これらの項目が変更された場合、再展開を必須とする
					HdrBtn_unexec_re_ext_flg.setMode(MCMode.READ_ONLY);
				}
			}
		}
	}
	
	protected boolean isReqOperReExtBeans(MCLCBeans lc) {
		if (lc == columnDtlOper_st_schd_dt || lc == columnDtlOper_end_schd_dt
				|| lc == columnDtlOper_base_unit_qty) {
			return true;
		}
		return false;
	}
	
	protected void setOperUnExecReExtFlg(MCLCBeans lc, MCEventInfo info) {
		DtlOperR operR = getDtlOperL().get(info.getEventIndex());
		if (!isAddedOper(operR)) {
			if (isSame(operR.bfr_re_ext_st_schd_dt(), operR.st_schd_dt())
					&& isSame(operR.bfr_re_ext_end_schd_dt(), operR.end_schd_dt())
					&& isSame(operR.bfr_re_ext_base_unit_qty(), operR.base_unit_qty())) {
				// 元の値に戻した場合は、falseに戻す
				setValueEx(columnDtlOper_unexec_re_ext_flg, info.getEventIndex(), false);
				setValueEx(columnDtlOper_re_ext_tgt_flg, info.getEventIndex(), false);
			}
			else {
				setValueEx(columnDtlOper_unexec_re_ext_flg, info.getEventIndex(), true);
				setValueEx(columnDtlOper_re_ext_tgt_flg, info.getEventIndex(), true);
			}
		}
	}
	
	// 指図数量、出来高数量連動処理
	protected void doHdr_base_unit_inst_qty_LC(MCEventInfo info) {
		HdrR h = getHdrR();
		if (!h.not_qty_rlt_flg()) {
			// 出来高予定数と指図数は相互に連動しているため、イベントを発生させないようにsetValueExではなく直接コンテナに値を設定する。
			if (MSC_MFG_MTD_TYP.isEXTNL(h.mfg_mtd_typ())) {
				h.base_unit_yield_qty(h.base_unit_inst_qty());
			}
			else {
				h.base_unit_yield_qty(convQtyInstToYield(h.mst_mfg_inst_qty(),
						h.mst_yield_schd_qty(), h.base_unit_inst_qty(),
						h.base_unit_dec_place(), h.mst_fxd_rqmt_qty()));
			}
		}
	}

	protected void doHdr_base_unit_yield_qty_LC(MCEventInfo info) {
		HdrR h = getHdrR();
		if (!h.not_qty_rlt_flg()) {
			// 出来高予定数と指図数は相互に連動しているため、イベントを発生させないようにsetValueExではなく直接コンテナに値を設定する。
			h.base_unit_inst_qty(convQtyYieldToInst(h.mst_mfg_inst_qty(),
					h.mst_yield_schd_qty(), h.base_unit_yield_qty(),
					h.base_unit_dec_place(), h.mst_fxd_rqmt_qty()));
		}
	}
	
	protected void doDtlOper_base_unit_qty_LC(MCEventInfo info) {
		DtlOperR r = getDtlOperL().get(info.getEventIndex());
		setValueEx(columnDtlOper_oper_unit_qty, r.getGUIIndex(),
				convQtyBaseToOper(r.base_unit_qty(), r.oper_conv_qty(), r.oper_std_qty(),
						r.oper_unit_dec_place(), r.oper_unit_conv_rnd_typ()));
	}

	// 基準単位数量と有効成分は相互にイベントが発動するため、イベントが無限ループになる可能性がある。当フラグで発動を制御する
	protected boolean _isDuringQtyChangeEvent = false;

	// 投入数量
	protected void doDtlInpt_base_unit_inpt_qty_LC(MCEventInfo info) {
		DtlInptR inptR = getDtlInptL().get(info.getEventIndex());
		// 投入数量、必要数量連動処理
		if (isNull(inptR.bom_id_no()) || isSame(inptR.chd_rqmt_qty(),inptR.chd_inpt_qty())) {
			setValueEx(columnDtlInpt_base_unit_rqmt_qty, inptR.getGUIIndex(), inptR.base_unit_inpt_qty());
		}
		
		// 有効成分換算処理（有効成分側のイベントで当項目が変更されないように制御）
		if (!_isDuringQtyChangeEvent) {
			try {
				_isDuringQtyChangeEvent = true;
				setValueEx(columnDtlInpt_cont_inpt_qty, inptR.getGUIIndex(), convBaseToConv(inptR.base_unit_inpt_qty(), inptR));
			}
			finally {
				_isDuringQtyChangeEvent = false;
			}
		}
	}
	
	// 必要数量
	protected void doDtlInpt_base_unit_rqmt_qty_LC(MCEventInfo info) {
		DtlInptR inptR = getDtlInptL().get(info.getEventIndex());
		// 必要数量合計算出
		calcBaseUnitSumRqmtQty(inptR);
		
		// 有効成分換算処理（有効成分側のイベントで当項目が変更されないように制御）
		if (!_isDuringQtyChangeEvent) {
			try {
				_isDuringQtyChangeEvent = true;
				setValueEx(columnDtlInpt_cont_rqmt_qty, inptR.getGUIIndex(), convBaseToConv(inptR.base_unit_rqmt_qty(), inptR));
			}
			finally {
				_isDuringQtyChangeEvent = false;
			}
		}
	}

	// 固定必要数量
	protected void doDtlInpt_base_unit_fxd_rqmt_qty_LC(MCEventInfo info) {
		DtlInptR inptR = getDtlInptL().get(info.getEventIndex());
		// 必要数量合計算出
		calcBaseUnitSumRqmtQty(inptR);
		
		// 有効成分換算処理（有効成分側のイベントで当項目が変更されないように制御）
		if (!_isDuringQtyChangeEvent) {
			try {
				_isDuringQtyChangeEvent = true;
				setValueEx(columnDtlInpt_cont_fxd_rqmt_qty, inptR.getGUIIndex(), convBaseToConv(inptR.base_unit_fxd_rqmt_qty(), inptR));
			}
			finally {
				_isDuringQtyChangeEvent = false;
			}
		}
	}

	// 必要数量合計算出処理
	protected void calcBaseUnitSumRqmtQty(DtlInptR inptR) {
		MCNumber sum = sum(nvl(inptR.base_unit_rqmt_qty(), MCNumber.ZERO), nvl(inptR.base_unit_fxd_rqmt_qty(), MCNumber.ZERO));
		setValueEx(columnDtlInpt_base_unit_sum_rqmt_qty, inptR.getGUIIndex(), sum);
	}

	// 有効成分関連処理
	// 有効成分（投入数量）
	protected void doDtlInpt_cont_inpt_qty_LC(MCEventInfo info) {
		DtlInptR inptR = getDtlInptL().get(info.getEventIndex());
		// 投入数量、必要数量連動処理
		if (isNull(inptR.bom_id_no()) || isSame(inptR.chd_rqmt_qty(), inptR.chd_inpt_qty())) {
			setValueEx(columnDtlInpt_cont_rqmt_qty, inptR.getGUIIndex(), inptR.cont_inpt_qty());
		}

		doDtlInpt_cont_inpt_qty_sub(inptR);
	}
	
	protected void doDtlInpt_cont_inpt_qty_sub(DtlInptR inptR) {
		// 基準単位換算処理（基準単位側のイベントで当項目が変更されないように制御）
		if (!_isDuringQtyChangeEvent) {
			try {
				_isDuringQtyChangeEvent = true;
				setValueEx(columnDtlInpt_base_unit_inpt_qty, inptR.getGUIIndex(), convContToBase(inptR.cont_inpt_qty(), inptR));
			}
			finally {
				_isDuringQtyChangeEvent = false;
			}
		}
	}
	
	// 有効成分（必要数量）
	protected void doDtlInpt_cont_rqmt_qty_LC(MCEventInfo info) {
		DtlInptR inptR = getDtlInptL().get(info.getEventIndex());
		// 有効成分（必要数量）合計算出
		calcSumContRqmtQty(inptR);

		doDtlInpt_cont_rqmt_qty_sub(inptR);
	}
	
	protected void doDtlInpt_cont_rqmt_qty_sub(DtlInptR inptR) {
		// 基準単位換算処理（基準単位側のイベントで当項目が変更されないように制御）
		if (!_isDuringQtyChangeEvent) {
			try {
				_isDuringQtyChangeEvent = true;
				setValueEx(columnDtlInpt_base_unit_rqmt_qty, inptR.getGUIIndex(), convContToBase(inptR.cont_rqmt_qty(), inptR));
			}
			finally {
				_isDuringQtyChangeEvent = false;
			}
		}
	}

	// 有効成分（固定必要数量）
	protected void doDtlInpt_cont_fxd_rqmt_qty_LC(MCEventInfo info) {
		DtlInptR inptR = getDtlInptL().get(info.getEventIndex());
		// 有効成分（必要数量）合計算出
		calcSumContRqmtQty(inptR);

		doDtlInpt_cont_fxd_rqmt_qty_sub(inptR);
	}
	
	protected void doDtlInpt_cont_fxd_rqmt_qty_sub(DtlInptR inptR) {
		// 基準単位換算処理（基準単位側のイベントで当項目が変更されないように制御）
		if (!_isDuringQtyChangeEvent) {
			try {
				_isDuringQtyChangeEvent = true;
				setValueEx(columnDtlInpt_base_unit_fxd_rqmt_qty, inptR.getGUIIndex(), convContToBase(inptR.cont_fxd_rqmt_qty(), inptR));
			}
			finally {
				_isDuringQtyChangeEvent = false;
			}
		}
	}
	
	// 実際有効成分係数の変更（ロットが変わった場合の考慮）
	protected void doDtlInpt_act_cont_fctr_LC(MCEventInfo info) {
		DtlInptR inptR = getDtlInptL().get(info.getEventIndex());
		
		doDtlInpt_cont_inpt_qty_sub(inptR);
		doDtlInpt_cont_rqmt_qty_sub(inptR);
		doDtlInpt_cont_fxd_rqmt_qty_sub(inptR);
	}

	// 有効成分（必要数量）合計算出処理
	protected void calcSumContRqmtQty(DtlInptR inptR) {
		MCNumber sum = sum(nvl(inptR.cont_rqmt_qty(), MCNumber.ZERO), nvl(inptR.cont_fxd_rqmt_qty(), MCNumber.ZERO));
		setValueEx(columnDtlInpt_sum_cont_rqmt_qty, inptR.getGUIIndex(), sum);
	}

	protected MCNumber convBaseToCont(MCNumber baseQty, DtlInptR inptR) {
		// 基準単位から有効成分への変換
		if (isNull(baseQty)) {
			return null;
		}
		return convToContFctrUnit(baseQty, nvl(inptR.act_cont_fctr(), inptR.std_cont_fctr()),
				inptR.cont_fctr_dec_place(), inptR.cont_fctr_rnd_typ());
	}
	
	protected MCNumber convContToBase(MCNumber contQty, DtlInptR inptR) {
		// 有効成分から基準単位への変換
		if (isNull(contQty)) {
			return null;
		}
		return convToBaseUnitFromContFctrUnit(contQty,
				nvl(inptR.act_cont_fctr(), inptR.std_cont_fctr()),
				inptR.base_unit_dec_place(), inptR.base_unit_rnd_typ());
	}
	
	protected MCNumber convBaseToConv(MCNumber baseQty, DtlInptR inptR) {
		// 基準単位から有効成分への変換
		if (isNull(baseQty)) {
			return null;
		}
		return convToContFctrUnit(baseQty,
				nvl(inptR.act_cont_fctr(), inptR.std_cont_fctr()),
				inptR.cont_fctr_dec_place(), inptR.cont_fctr_rnd_typ());
	}
	
	// 承認関連処理
	protected void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		
		MCBeans[] bs = getInvisibleBeans();
		if (bs != null) {
			setComponentInvisibleAllStatus(bs);
		}
		
		// 投入対象選択ボタンの表示切替
		if (!isSame(getSysParm("CONT_FCTR_ENABLE_FLG"), "1")) {
			setComponentInvisibleAllStatus(InptBtn_open_MSBCP1060_p_PPanel.InptTrgtSel_open_MSBCP1060);
		}
	}
	
	protected MCBeans[] getInvisibleBeans() {
		boolean mfgAprvEnable = isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "1");
		boolean plmLinkEnable = getLicenceInfo().plmlink_enable_flg(); 
		
		if (!mfgAprvEnable && !plmLinkEnable) {
			return mcframe.commonCore.util.MCCollectionUtil.concat(getMfgAprvInvisibleBeans(), getPlmLinkInvisibleBeans());
		}
		else if (!mfgAprvEnable) {
			return getMfgAprvInvisibleBeans();
		}
		else if (!plmLinkEnable) {
			return getPlmLinkInvisibleBeans();
		}
		return null;
	}
	
	protected MCBeans[] getMfgAprvInvisibleBeans() {
		return mcframe.commonCore.util.MCCollectionUtil.concat(
				new MCBeans[] {Cnd_ope_APRV, AprvPanel}
				, (MCBeans[]) MCBeansUtil.getAllComponents(MCBeans.class, AprvPanel));
	}
	
	protected MCBeans[] getPlmLinkInvisibleBeans() {
		return mcframe.commonCore.util.MCCollectionUtil.concat(new MCBeans[] {
				ReExtPanelPanel
		}, (MCBeans[]) MCBeansUtil.getAllComponents(MCBeans.class, ReExtPanelPanel));
	}
	
	protected void setAprvDptUsrDftVal() {
		setValueEx(Hdr_aprv_dt, getToday());
		if (isNull(getHdrR().aprv_usr_cd())) {
			setValueEx(Hdr_aprv_usr_cd, mcframe.clientCore.sys.MCSys.user.ID());
		}
	}

	protected void setAprvDptUsrMode() {
		if (isSame(getSysParm("MFG_APRV_USR_FIX_FLG"), "1")) {
			Hdr_aprv_dt.setMode(MCMode.READ_ONLY);
			Hdr_aprv_usr_cd.setMode(MCMode.READ_ONLY);
		}
	}
	
	// ロット提案対象FLG
	@Override
	public void doDtlInpt_lot_prop_tgt_flg_NC(MCEventInfo info) {
		super.doDtlInpt_lot_prop_tgt_flg_NC(info);
		// 製造実績登録画面にも同様の処理があるので修正する際には注意
		DtlInptR r = getDtlInptL().get(info.getEventIndex());
		
		// 以下の理由から、同一品目の場合にロット提案の行を連動する（代替の場合は、別の処理で連動されるため、代替グループがNULLの行のみを扱う）
		// ・ロット混在不可の場合に混在したロットを提案しないようにしたほうが望ましいので
		// ・ロットＮＯをロット提案ではなく手入力した行があった場合に、そのロットＮＯを加味してロット提案をしたいので
		setSameItmLotPropFlg(r);
		
		// 以下の理由から、同一工程内の代替グループCD,代替グループ連番の場合にロット提案の行を連動する
		// ・代替品の混在不可の場合に混在した品目を提案しないようにしたほうが望ましいので
		setSameAltGrpVal(r, columnDtlInpt_lot_prop_tgt_flg);
		
		// 同一品目のロット指定無しフラグを連動する
		setSameItmNoLotFixFlg(r);
	}
	
	protected void setSameItmNoLotFixFlg(DtlInptR r) {
		if (!r.lot_prop_tgt_flg()) {
			return;
		}
		String[] key = new String[]{DtlInptR.$itm_cd, DtlInptR.$itm_sub1, DtlInptR.$itm_sub2, DtlInptR.$itm_sub3};
		String[] val = new String[]{r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()};
		MCList<DtlInptR> sameItmL = getDtlInptL().subList(key, val);
		for (DtlInptR sameItmR : sameItmL) {
			if (isEditable(columnDtlInpt_no_lot_fix_flg, sameItmR.getGUIIndex())) {
				setValueEx(columnDtlInpt_no_lot_fix_flg, sameItmR.getGUIIndex(), false);
			}
		}
	}
	
	protected void setSameItmLotPropFlg(DtlInptR r) {
		if (!isNull(r.alt_grp_cd())) {
			return;
		}
		String[] key = new String[]{DtlInptR.$itm_cd, DtlInptR.$itm_sub1, DtlInptR.$itm_sub2, DtlInptR.$itm_sub3};
		String[] val = new String[]{r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()};
		MCList<DtlInptR> sameItmL = getDtlInptL().subList(key, val);
		for (DtlInptR sameItmR : sameItmL) {
			if (r != sameItmR && isEditable(
					columnDtlInpt_lot_prop_tgt_flg, sameItmR.getGUIIndex())) {
				if (!isSame(sameItmR.lot_prop_tgt_flg(), r.lot_prop_tgt_flg())) {
					sameItmR.lot_prop_tgt_flg(r.lot_prop_tgt_flg());
				}
			}
		}
	}
	
	// ロット指定無しFLG
	@Override
	public void doDtlInpt_no_lot_fix_flg_NC(MCEventInfo info) {
		super.doDtlInpt_no_lot_fix_flg_NC(info);
		DtlInptR inptR = getDtlInptL().get(info.getEventIndex());
		
		if (inptR.no_lot_fix_flg()) {
			// ロット指定しない場合は、ロット提案の意味がないためfalseとする
			setValueEx(columnDtlInpt_lot_prop_tgt_flg, inptR.getGUIIndex(), false);
			// ロットNO、サブロットNOをクリアする
			if (!isNullOrNullVal(inptR.lot_no())) {
				setValueEx(columnDtlInpt_lot_no, inptR.getGUIIndex(), null);
			}
			if (!isNullOrNullVal(inptR.sublot_no())) {
				setValueEx(columnDtlInpt_sublot_no, inptR.getGUIIndex(), null);
			}
		}
		else {
			if (isEditable(columnDtlInpt_lot_prop_tgt_flg, inptR.getGUIIndex())) {
				setValueEx(columnDtlInpt_lot_prop_tgt_flg, inptR.getGUIIndex(), true);
			}
		}
		
		// 以下の理由から、同一工程内の代替グループCD,代替グループ連番の場合にロット指定無しFLGを連動する
		// ・ロット提案対象FLGと連動する仕様があるため
		setSameAltGrpVal(inptR, columnDtlInpt_no_lot_fix_flg);
	}
	
	protected void setSameAltGrpVal(DtlInptR r, MCColumnConfig config) {
		if (isNull(r.alt_grp_cd())) {
			return;
		}
		String[] key = new String[]{DtlInptR.$alt_grp_cd, DtlInptR.$alt_grp_seq, DtlInptR.$oper_peg_no, DtlInptR.$alt_itm_fix_flg};
		Comparable<?>[] keyVal = new Comparable<?>[]{r.alt_grp_cd(), r.alt_grp_seq(), r.oper_peg_no(), false};
		MCList<DtlInptR> sameAltGL = getDtlInptL().subList(key, keyVal);
		for (DtlInptR sameAltGR : sameAltGL) {
			if (r != sameAltGR && isEditable(
					config, sameAltGR.getGUIIndex())) {
				Comparable<?> oldVal = config.getValue(sameAltGR.getGUIIndex());
				Comparable<?> newVal = config.getValue(r.getGUIIndex());
				if (!isSame(oldVal, newVal)) {
					config.setValue(sameAltGR.getGUIIndex(), newVal);
				}
			}
		}
	}
	
	// 引当制御区分
	@Override
	public void doDtlInpt_alloc_ctl_typ_LC(MCEventInfo info) {
		super.doDtlInpt_alloc_ctl_typ_LC(info);
		DtlInptR r = getDtlInptL().get(info.getEventIndex());
		if (MAC_ALLOC_CTL_TYP.isNO_ALLOC(r.alloc_ctl_typ())) {
			setValueEx(columnDtlInpt_alloc_flg, r.getGUIIndex(), false);
			setValueEx(columnDtlInpt_lot_prop_tgt_flg, r.getGUIIndex(), false);
		}
	}
	
	// 投入制御区分
	@Override
	public void doDtlInpt_inpt_ctl_typ_LC(MCEventInfo info) {
		super.doDtlInpt_inpt_ctl_typ_LC(info);
		DtlInptR r = getDtlInptL().get(info.getEventIndex());
		if (MAC_INPT_CTL_TYP.isNO_MRP_INST(r.inpt_ctl_typ())) {
			setValueEx(columnDtlInpt_alloc_flg, r.getGUIIndex(), false);
			setValueEx(columnDtlInpt_lot_prop_tgt_flg, r.getGUIIndex(), false);
		}
	}

	// ヘッダの製造棚・ライン
	protected void doHdr_mfg_str_ln_cd_LC(MCEventInfo info) {
		if (getHdrR().ln_stk_flg()) {
			// 棚・ライン格納がオンの場合、製造棚・ラインを格納棚・ラインに連動する（同じ棚・ラインがマスタ設定されている想定）
			if (getHdrR().strg_str_ln_tgt_flg()) {
				setValueEx(Hdr_strg_str_ln_cd, nullValToNull(getHdrR().mfg_str_ln_cd()));
			}
		}
		// 工程一覧に連動
		for (DtlOperR r : getDtlOperL()) {
			if (isSame(getHdrR().mfg_loc_cd(), r.oper_loc_cd())) {
				setValueEx(columnDtlOper_oper_str_ln_cd, r.getGUIIndex(), nullValToNull(getHdrR().mfg_str_ln_cd()));
			}
		}
	}

	// ヘッダの格納場所
	@Override
	public void doHdr_strg_loc_cd_LC(MCEventInfo info) {
		super.doHdr_strg_loc_cd_LC(info);
		// 出来高一覧に連動
		for (DtlYieldR r : getDtlYieldL()) {
			setValueEx(columnDtlYield_strg_loc_cd, r.getGUIIndex(), getHdrR().strg_loc_cd());
		}
		// 副産品一覧に連動
		for (DtlByProdR r : getDtlByProdL()) {
			setValueEx(columnDtlByProd_strg_loc_cd, r.getGUIIndex(), getHdrR().strg_loc_cd());
		}
	}
	
	// ヘッダの格納棚・ライン
	protected void doHdr_strg_str_ln_cd_LC(MCEventInfo info) {
		// 出来高一覧に連動
		for (DtlYieldR r : getDtlYieldL()) {
			if (isSame(getHdrR().strg_loc_cd(), r.strg_loc_cd())) {
				setValueEx(columnDtlYield_strg_str_ln_cd, r.getGUIIndex(), nullValToNull(getHdrR().strg_str_ln_cd()));
			}
		}
		// 副産品一覧に連動
		for (DtlByProdR r : getDtlByProdL()) {
			if (isSame(getHdrR().strg_loc_cd(), r.strg_loc_cd())) {
				setValueEx(columnDtlByProd_strg_str_ln_cd, r.getGUIIndex(), nullValToNull(getHdrR().strg_str_ln_cd()));
			}
		}
	}

	// 工程の棚・ライン
	protected void doOper_str_ln_cd_LC(MCEventInfo info) {
		// 投入一覧に連動
		DtlOperR operR = getDtlOperL().get(info.getEventIndex());
		for (DtlInptR r : getDtlInptL()) {
			if (isSame(operR.oper_loc_cd(), r.inpt_loc_cd())) {
				setValueEx(columnDtlInpt_inpt_str_ln_cd, r.getGUIIndex(), nullValToNull(operR.oper_str_ln_cd()));
			}
		}
	}

	// ヘッダのロット、サブロット発番チェックボックス関連
	@Override
	public void doHdr_lot_no_ptn_cd_LC(MCEventInfo info) {
		super.doHdr_lot_no_ptn_cd_LC(info);
		setHdrLotIssueFlg();
	}
	
	@Override
	public void doHdr_sublot_no_ptn_cd_LC(MCEventInfo info) {
		super.doHdr_sublot_no_ptn_cd_LC(info);
		setHdrSublotIssueFlg();
	}
	
	protected void setHdrLotIssueFlg() {
		if (!isNull(getHdrR().lot_no_ptn_cd()) && isNull(getHdrR().lot_no())) {
			getHdrBtnR().lot_issue_flg(true);
		}
		else {
			getHdrBtnR().lot_issue_flg(false);
		}
	}
	
	protected void setHdrSublotIssueFlg() {
		if (!isNull(getHdrR().sublot_no_ptn_cd()) && isNull(getHdrR().sublot_no())) {
			getHdrBtnR().sublot_issue_flg(true);
		}
		else {
			getHdrBtnR().sublot_issue_flg(false);
		}
	}
	
	protected void setHdrSchedulerFrozenFlg() {
		if (!getHdrR().for_scheduler_frozen_flg()) {
			return;
		}
		boolean isAllFrozen = true;
		for (DtlOperR operR : getDtlOperL()) {
			if (!operR.scheduler_frozen_flg()) {
				isAllFrozen = false;
				break;
			}
		}
		getHdrR().scheduler_frozen_flg(isAllFrozen);
	}
	
	// 副産品のロット、サブロット発番チェックボックス関連
	@Override
	public void doDtlByProd_lot_no_ptn_cd_LC(MCEventInfo info) {
		super.doDtlByProd_lot_no_ptn_cd_LC(info);
		setByProdLotIssueFlg();
	}
	
	@Override
	public void doDtlByProd_sublot_no_ptn_cd_LC(MCEventInfo info) {
		super.doDtlByProd_sublot_no_ptn_cd_LC(info);
		setByProdSublotIssueFlg();
	}
	
	protected void setByProdLotIssueFlg() {
		getByProdBtnR().lot_issue_flg(false);
		
		for (DtlByProdR r : getDtlByProdL()) {
			if (!r.isStatusDelete() && !isNull(r.lot_no_ptn_cd()) && isNull(r.lot_no())) {
				getByProdBtnR().lot_issue_flg(true);
				break;
			}
		}
	}
	
	protected void setByProdSublotIssueFlg() {
		getByProdBtnR().sublot_issue_flg(false);
		
		for (DtlByProdR r : getDtlByProdL()) {
			if (!r.isStatusDelete() && !isNull(r.sublot_no_ptn_cd()) && isNull(r.sublot_no())) {
				getByProdBtnR().sublot_issue_flg(true);
				break;
			}
		}
	}
	
	// 対象工程のみ、選択工程のみのイベント（テーブルのフィルタ機能を利用している）
	@Override
	public void doHdrBtn_disp_tgt_oper_only_NC(MCEventInfo info) {
		super.doHdrBtn_disp_tgt_oper_only_NC(info);
		if (getHdrBtnR().disp_tgt_oper_only()) {
			doTgtOperFilter();
			doOperTableFilter();
		}
		else {
			clearDtlTableFilter();
			clearOperTableFilter();
		}
	}
	
	protected void doTgtOperFilter() {
		MCList<DtlOperR> tgtL = getDtlOperL().subList(DtlOperR.$tgt_oper_flg, true);
		if (tgtL.isEmpty()) {
			return;
		}
		doDtlTableFilter(tgtL);
	}
	
	protected void doOperTableFilter() {
		MCRowFilterList<MCRowFilter> operRFL = new MCRowFilterList<MCRowFilter>();

		MCRowFilter operRF = DtlOperTable.createRowFilter();
		operRF.setCondition(DtlInptR.$tgt_oper_flg, MCDataType.BOOLEAN, true, MCRowFilter.EQUAL, null);
		operRFL.add(operRF);
		
		filterList(DtlOperTable, operRFL);
	}
	
	protected void clearOperTableFilter() {
		filterList(DtlOperTable, null);
	}

	@Override
	public void doHdrBtn_disp_select_oper_only_NC(MCEventInfo info) {
		super.doHdrBtn_disp_select_oper_only_NC(info);
		if (getHdrBtnR().disp_select_oper_only()) {
			doSelectOperFilter();
		}
		else {
			clearDtlTableFilter();
		}
	}
	
	protected void doSelectOperFilter() {
		DtlOperR operR = DtlOperTable.getSelectedMCRow();
		if (isNull(operR)) {
			return;
		}
		
		MCList<DtlOperR> operL = MCList.create(DtlOperR.class);
		operL.add(operR);
		doDtlTableFilter(operL);
	}
	
	protected void doDtlTableFilter(MCList<DtlOperR> operL) {
		MCRowFilterList<MCRowFilter> inptRFL = new MCRowFilterList<MCRowFilter>();
		MCRowFilterList<MCRowFilter> wkRFL = new MCRowFilterList<MCRowFilter>();
		MCRowFilterList<MCRowFilter> yieldRFL = new MCRowFilterList<MCRowFilter>();
		MCRowFilterList<MCRowFilter> byProdRFL = new MCRowFilterList<MCRowFilter>();
		for (int i = 0; i < operL.size(); i++) {
			DtlOperR operR = operL.get(i);
			String logic = null;
			if (i != 0) {
				// 最初の行以外は、ORとする
				logic = MCRowFilter.OR;
			}
			
			// 投入
			MCRowFilter inptRF = DtlInptTable.createRowFilter();
			inptRF.setCondition(DtlInptR.$oper_peg_no, MCDataType.NUMBER, operR.peg_no(), MCRowFilter.EQUAL, logic);
			inptRFL.add(inptRF);
			
			// 工数
			MCRowFilter wkRF = DtlWkTable.createRowFilter();
			wkRF.setCondition(DtlWkR.$oper_peg_no, MCDataType.NUMBER, operR.peg_no(), MCRowFilter.EQUAL, logic);
			wkRFL.add(wkRF);
			
			// 出来高
			MCRowFilter yieldRF = DtlYieldTable.createRowFilter();
			yieldRF.setCondition(DtlYieldR.$oper_peg_no, MCDataType.NUMBER, operR.peg_no(), MCRowFilter.EQUAL, logic);
			yieldRFL.add(yieldRF);
			
			// 副産品
			MCRowFilter byProdRF = DtlByProdTable.createRowFilter();
			byProdRF.setCondition(DtlByProdR.$oper_peg_no, MCDataType.NUMBER, operR.peg_no(), MCRowFilter.EQUAL, logic);
			byProdRFL.add(byProdRF);
		}
		
		if (!inptRFL.isEmpty()) {
			filterList(DtlInptTable, inptRFL, false);
		}
		if (!wkRFL.isEmpty()) {
			filterList(DtlWkTable, wkRFL, false);
		}
		if (!yieldRFL.isEmpty()) {
			filterList(DtlYieldTable, yieldRFL, false);
		}
		if (!byProdRFL.isEmpty()) {
			filterList(DtlByProdTable, byProdRFL, false);
		}
	}
	
	protected void clearDtlTableFilter() {
		filterList(DtlInptTable, null);
		filterList(DtlWkTable, null);
		filterList(DtlYieldTable, null);
		filterList(DtlByProdTable, null);
	}

	// 副産品の品目
	protected void doDtlByProd_itm_LC(MCEventInfo info) {
		DtlByProdR dtlByProdR = getDtlByProdL().get(info.getEventIndex());
		setDefStrLnCd(dtlByProdR);
	}

	/**
	 * 標準の棚・ラインCDを設定します。
	 */
	protected void setDefStrLnCd(DtlByProdR dtlByProdR) {
		if (isNull(dtlByProdR.strg_loc_cd()) || !dtlByProdR.strg_str_ln_tgt_flg()) {
			return;
		}
		String StrLnCd = MSUCP_StrLnUtil.getDefStrLnCd(
				dtlByProdR.itm_cd(), 
				dtlByProdR.itm_sub1(), 
				dtlByProdR.itm_sub2(), 
				dtlByProdR.itm_sub3(), 
				dtlByProdR.strg_loc_cd(), 
				this);
		if (isNull(StrLnCd)) {
			setValueEx(columnDtlByProd_strg_str_ln_cd_none_flg, dtlByProdR.getGUIIndex(), true);
		}
		else {
			setValueEx(columnDtlByProd_strg_str_ln_cd, dtlByProdR.getGUIIndex(), StrLnCd);
		}
	}

	// ---------------------------------------- 在庫選択、投入対象選択機能 START ----------------------------------------
	// 在庫情報選択用カラム情報
	@Override
	public String getInptItmCdCol() {
		return DtlInptR.$itm_cd;
	}

	@Override
	public String getInptItmSub1Col() {
		return DtlInptR.$itm_sub1;
	}

	@Override
	public String getInptItmSub2Col() {
		return DtlInptR.$itm_sub2;
	}

	@Override
	public String getInptItmSub3Col() {
		return DtlInptR.$itm_sub3;
	}
	
	@Override
	public String getInptGdCdCol() {
		return DtlInptR.$gd_cd;
	}

	@Override
	public String getInptVerNoCol() {
		return DtlInptR.$ver_no;
	}

	@Override
	public String getInptLotNoCol() {
		return DtlInptR.$lot_no;
	}

	@Override
	public String getInptSublotNoCol() {
		return DtlInptR.$sublot_no;
	}

	@Override
	public String getInptLocCdCol() {
		return DtlInptR.$inpt_loc_cd;
	}

	@Override
	public String getInptStrLnCdCol() {
		return DtlInptR.$inpt_str_ln_cd;
	}

	@Override
	public String getInptStrLnCdNoneFlgCol() {
		return DtlInptR.$inpt_str_ln_cd_none_flg;
	}

	@Override
	public String getInptSno1Col() {
		return DtlInptR.$alloc_sno1;
	}

	@Override
	public String getInptSno2Col() {
		return DtlInptR.$alloc_sno2;
	}

	@Override
	public String getInptSno3Col() {
		return DtlInptR.$alloc_sno3;
	}

	@Override
	public String getInptSno4Col() {
		return DtlInptR.$alloc_sno4;
	}
	
	public String getInptBaseStkQtyCol() {
		return DtlInptR.$base_unit_inpt_qty;
	}
	
	public String getInptBaseUnitCdCol() {
		return DtlInptR.$base_unit_cd;
	}
	
	// 投入対象選択用カラム情報
	@Override
	public String getInptItmCdColumn() {
		return DtlInptR.$itm_cd;
	}

	@Override
	public String getInptItmSub1Column() {
		return DtlInptR.$itm_sub1;
	}

	@Override
	public String getInptItmSub2Column() {
		return DtlInptR.$itm_sub2;
	}

	@Override
	public String getInptItmSub3Column() {
		return DtlInptR.$itm_sub3;
	}
	
	@Override
	public String getInptGdCdColumn() {
		return DtlInptR.$gd_cd;
	}

	@Override
	public String getInptVerNoColumn() {
		return DtlInptR.$ver_no;
	}

	@Override
	public String getInptLotNoColumn() {
		return DtlInptR.$lot_no;
	}

	@Override
	public String getInptSublotNoColumn() {
		return DtlInptR.$sublot_no;
	}

	@Override
	public String getInptLocCdColumn() {
		return DtlInptR.$inpt_loc_cd;
	}

	@Override
	public String getInptStrLnCdColumn() {
		return DtlInptR.$inpt_str_ln_cd;
	}

	@Override
	public String getInptStrLnCdNoneFlgColumn() {
		return DtlInptR.$inpt_str_ln_cd_none_flg;
	}

	@Override
	public String getInptSno1Column() {
		return DtlInptR.$alloc_sno1;
	}

	@Override
	public String getInptSno2Column() {
		return DtlInptR.$alloc_sno2;
	}

	@Override
	public String getInptSno3Column() {
		return DtlInptR.$alloc_sno3;
	}

	@Override
	public String getInptSno4Column() {
		return DtlInptR.$alloc_sno4;
	}
	
	public String getInptBaseStkQtyColumn() {
		return DtlInptR.$base_unit_inpt_qty;
	}
	
	public String getInptBaseUnitCdColumn() {
		return DtlInptR.$base_unit_cd;
	}
	
	@Override
	public boolean isValueLink(MCRootPanel panel, int index, String ope, String name) {
		if (InptBtn_open_MSBEP0500_p_PPanel == panel) {
			// 投入数量や単位ＣＤは受け取らない（投入は基準単位しか扱えないため受け取らない
			// また、場所・棚・ラインも受け取らない（受け取ると、移動・移送予定が作成されなくなってしまうため）
			if (isSame(name, IfStkInspBase.INPT_PACK_UNIT_CD) || isSame(name, IfStkInspBase.INPT_PACK_STK_QTY)
					|| isSame(name, IfStkInspBase.INPT_LOC_CD) || isSame(name, IfStkInspBase.INPT_STR_LN_CD)) {
				return false;
			}
		}
		else if (InptBtn_open_MSBCP1060_p_PPanel == panel) {
			// 投入数量や単位ＣＤは受け取らない（投入は基準単位しか扱えないため受け取らない
			// また、場所・棚・ラインも受け取らない（受け取ると、移動・移送予定が作成されなくなってしまうため）
			if (isSame(name, IfInptTrgtSelBase.INPT_PACK_UNIT_CD) || isSame(name, IfInptTrgtSelBase.INPT_PACK_STK_QTY)
					|| isSame(name, IfInptTrgtSelBase.INPT_LOC_CD) || isSame(name, IfInptTrgtSelBase.INPT_STR_LN_CD)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isOpeTypEnable(MCRootPanel panel, int index, String ope) {
		if (index < 0) {
			return true;
		}
		
		if (isSame(IfStkInspBase.OPE_INS, ope)) {
			return false;
		}

		return true;
	}

	// 在庫選択画面と連結するテーブル
	@Override
	public MCTable<?> getStkTable(MCRootPanel panel) {
		if (InptBtn_open_MSBEP0500_p_PPanel == panel) {
			return DtlInptTable;
		}
		return null;
	}

	// 投入対象選択画面と連結するテーブル
	@Override
	public MCTable<?> getInptTable(MCRootPanel panel) {
		if (InptBtn_open_MSBCP1060_p_PPanel == panel) {
			return DtlInptTable;
		}
		return null;
	}

	// 在庫選択画面に渡す検索条件を設定する
	@Override
	public MCRow get_open_MSBEP0500_bind_Row(MCTable<?> table) {
		if (table == null) {
			return null;
		}

		DtlInptR selR  = (DtlInptR)table.getSelectedMCRow();
		MCRow bind = MCRow.create();

		if (selR != null) {
			bind.addStringColumn(IfStkInspBase.CND_OPE, IfStkInspBase.OPE_UPD);
			bind.addStringColumn(IfStkInspBase.CND_ITM_CD, selR.itm_cd());
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB1, selR.itm_sub1());
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB2, selR.itm_sub2());
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB3, selR.itm_sub3());
			bind.addStringColumn(IfStkInspBase.CND_ITM_NM, selR.itm_nm());
			bind.addStringColumn(IfStkInspBase.CND_VER_NO, selR.ver_no());
			bind.addStringColumn(IfStkInspBase.CND_GD_CD, selR.gd_cd());
			bind.addStringColumn(IfStkInspBase.CND_GD_NM, selR.gd_nm());
			bind.addStringColumn(IfStkInspBase.CND_LOC_CD, selR.inpt_loc_cd());
			bind.addStringColumn(IfStkInspBase.CND_LOC_NM, selR.inpt_loc_nm());
			bind.addStringColumn(IfStkInspBase.CND_SNO1, nvl(selR.alloc_sno1(), selR.sno1()));
			bind.addBooleanColumn(IfStkInspBase.CND_SNO1_NULL_FLG, selR.sno1_null_flg());
			bind.addStringColumn(IfStkInspBase.CND_SNO2, nvl(selR.alloc_sno2(), selR.sno2()));
			bind.addBooleanColumn(IfStkInspBase.CND_SNO2_NULL_FLG, selR.sno2_null_flg());
			bind.addStringColumn(IfStkInspBase.CND_SNO3, nvl(selR.alloc_sno3(), selR.sno3()));
			bind.addBooleanColumn(IfStkInspBase.CND_SNO3_NULL_FLG, selR.sno3_null_flg());
			bind.addStringColumn(IfStkInspBase.CND_SNO4, nvl(selR.alloc_sno4(), selR.sno4()));
			bind.addBooleanColumn(IfStkInspBase.CND_SNO4_NULL_FLG, selR.sno4_null_flg());
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_COSTK_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_RNT_RCV_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_NCV_RCV_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_ONR_PROV_FLG, true);
		}

		return bind;
	}
	
	// 投入対象選択画面に渡す検索条件を設定する
	@Override
	public MCRow get_open_MSBCP1060_bind_Row(MCTable<?> table) {
		if (table == null) {
			return null;
		}

		DtlInptR selR  = (DtlInptR)table.getSelectedMCRow();
		MCRow bind = MCRow.create();

		if (selR != null) {
			bind.addStringColumn(IfInptTrgtSelBase.CND_OPE, IfInptTrgtSelBase.OPE_UPD);
			bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_CD, selR.itm_cd());
			bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_SUB1, selR.itm_sub1());
			bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_SUB2, selR.itm_sub2());
			bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_SUB3, selR.itm_sub3());
			bind.addStringColumn(IfInptTrgtSelBase.CND_ITM_NM, selR.itm_nm());
			bind.addStringColumn(IfInptTrgtSelBase.CND_VER_NO, selR.ver_no());
			bind.addStringColumn(IfInptTrgtSelBase.CND_GD_CD, selR.gd_cd());
			bind.addStringColumn(IfInptTrgtSelBase.CND_GD_NM, selR.gd_nm());
			bind.addStringColumn(IfInptTrgtSelBase.CND_LOC_CD, selR.inpt_loc_cd());
			bind.addStringColumn(IfInptTrgtSelBase.CND_LOC_NM, selR.inpt_loc_nm());
			bind.addStringColumn(IfInptTrgtSelBase.CND_SNO1, nvl(selR.alloc_sno1(), selR.sno1()));
			bind.addBooleanColumn(IfInptTrgtSelBase.CND_SNO1_NULL_FLG, selR.sno1_null_flg());
			bind.addStringColumn(IfInptTrgtSelBase.CND_SNO2, nvl(selR.alloc_sno2(), selR.sno2()));
			bind.addBooleanColumn(IfInptTrgtSelBase.CND_SNO2_NULL_FLG, selR.sno2_null_flg());
			bind.addStringColumn(IfInptTrgtSelBase.CND_SNO3, nvl(selR.alloc_sno3(), selR.sno3()));
			bind.addBooleanColumn(IfInptTrgtSelBase.CND_SNO3_NULL_FLG, selR.sno3_null_flg());
			bind.addStringColumn(IfInptTrgtSelBase.CND_SNO4, nvl(selR.alloc_sno4(), selR.sno4()));
			bind.addBooleanColumn(IfInptTrgtSelBase.CND_SNO4_NULL_FLG, selR.sno4_null_flg());
			bind.addBooleanColumn(IfInptTrgtSelBase.CND_STK_ID_TYP_COSTK_FLG, true);
			bind.addBooleanColumn(IfInptTrgtSelBase.CND_STK_ID_TYP_RNT_RCV_FLG, true);
			bind.addBooleanColumn(IfInptTrgtSelBase.CND_STK_ID_TYP_NCV_RCV_FLG, true);
			bind.addBooleanColumn(IfInptTrgtSelBase.CND_STK_ID_TYP_ONR_PROV_FLG, true);
		}

		return bind;
	}
	
	@Override
	public boolean isCndEnable(String ope, String name) {
		if (isSame(name, IfStkInspBase.CND_ITM_CD)
				|| isSame(name, IfStkInspBase.CND_ITM_SUB1)
				|| isSame(name, IfStkInspBase.CND_ITM_SUB2)
				|| isSame(name, IfStkInspBase.CND_ITM_SUB3)
				|| isSame(name, IfStkInspBase.CND_ITM_NM)) {
			return false;
		}
		return true;
	}

	@Override
	public boolean isInptTrgtSelCndEnable(String ope, String name) {
		if (isSame(name, IfInptTrgtSelBase.CND_ITM_CD)
				|| isSame(name, IfInptTrgtSelBase.CND_ITM_SUB1)
				|| isSame(name, IfInptTrgtSelBase.CND_ITM_SUB2)
				|| isSame(name, IfInptTrgtSelBase.CND_ITM_SUB3)
				|| isSame(name, IfInptTrgtSelBase.CND_ITM_NM)) {
			return false;
		}
		return true;
	}

}