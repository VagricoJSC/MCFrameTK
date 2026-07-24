package mcframe.clientMSBF.MSBFP0070;

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
import mcframe.clientMAUB.MAUBP0220.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0370.*;
import mcframe.clientMAUB.MAUBP0380.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5220.*;
import mcframe.clientMAUB.MAUBP5240.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMSUB.MSUBP0030.*;
import mcframe.clientMSUB.MSUBP5010.*;

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
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientMAUB.MAUBP0330.IfCanAcDtBase;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBFP_InspActReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBFP_InspActReg_MC extends MSBFP_InspActReg_MC_A implements IfOpePanel, IfCanAcDtBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBFP_InspActReg_MC() {
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
	public MSBFP_InspActReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBFL0070_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0070_Srch01Caller<P extends MSBFP_InspActReg, B extends MS_MSBFL0070_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBFL0070_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			addDownContainer(getHdrR(), getDtlL(), getSmplL());
		}

		@Override
		protected void setMode() {
			super.setMode();
			String ope = getCndR().ope();
			String inspStsTyp = bridge.down0().insp_sts_typ();
			String inspAprvStsTyp = bridge.down0().insp_aprv_sts_typ();
			if (isSame(ope, Cnd_ope_INS.getActionCommand())) {
				if (MSC_INSP_STS_TYP.isORD(inspStsTyp) && (isNull(inspAprvStsTyp) || MSC_INSP_APRV_STS_TYP.isINST_ACPT(inspAprvStsTyp))) {
					setStatus(INS);
				}
				else {
					setFIX_IStatus();
				}
			}
			else if (isSame(ope, Cnd_ope_UPD.getActionCommand())) {
				if (!MSC_INSP_STS_TYP.isORD(inspStsTyp) && !MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(inspAprvStsTyp)) {
					setStatus(UPD);
				}
				else {
					setFIX_UStatus();
				}
			}
			else if (isSame(ope, Cnd_ope_JUDG.getActionCommand())) {
				if (MSC_INSP_STS_TYP.isJDG(inspStsTyp) && !isNull(inspAprvStsTyp) && !MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(inspAprvStsTyp)) {
					setStatus(JUDG);
					// 承認理由クリア
					clearJudgRsn();
				}
				else {
					setFIX_JStatus();
				}
			}
			else if (isSame(ope, Cnd_ope_DEL.getActionCommand())) {
				if (!MSC_INSP_STS_TYP.isORD(inspStsTyp)) {
					setStatus(DEL);
					// 承認理由クリア
					clearJudgRsn();
				}
				else {
					setFIX_DStatus();
				}
			}
			else if (isSame(ope, Cnd_ope_REF.getActionCommand())) {
				setStatus(REF);
			}
			if (getDtlL().size() > 0) {
				DtlTable.selectRowNoFocus(0);
			}
		}

		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}

		@Override
		protected void show() {
			super.show();
			setValidDtUpdFlg();
			setSttCanAcDt();
		}
		
		/**
		 * 使用期限を更新するフラグを設定する。
		 */
		protected void setValidDtUpdFlg() {
			if (isValidDtUpdFlgTrue()) {
				getHdrR().vld_dt_upd_flg(true);
			}
		}
		
		/**
		 * 使用期限を更新するフラグをtrueにすべきかどうか
		 * @return
		 */
		protected boolean isValidDtUpdFlgTrue() {
			boolean ret = false;
			HdrR hdr = getHdrR();
			String ope = getCndR().ope();

			if (!hdr.lmt_ctl_flg()) {
				// 期限管理対象外の場合はfalse
			}
			else if (MSC_INSP_TYP.isLOT(hdr.insp_typ())
					|| MSC_INSP_TYP.isPRDCT(hdr.insp_typ())
					|| MSC_INSP_TYP.isACCPT(hdr.insp_typ())) {
				
				if (!isNull(hdr.quality_typ()) && !MAC_QUALITY_TYP.isGOOD(hdr.quality_typ())) {
					// 良品区分が良品でない場合はfalse
				}
				else if ((isSame(ope, Cnd_ope_INS.getActionCommand())
						|| isSame(ope, Cnd_ope_UPD.getActionCommand()))
						&& !isNull(hdr.insp_aprv_sts_typ())) {
					// 判定対象で操作種別が登録する、訂正する場合はfalse
				}
				else if (hdr.lmt_up_flg()) {
					ret = true;
				}
				else {
					ret = isNull(hdr.vld_dt_now());
				}
			}
			
			return ret;
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			
			setCanAcDt();
			setBaseFlg();
		}
		
		protected void setCanAcDt() {
			if (!isNull(bridge.down0())) {
				bridge.down0().stt_can_ac_dt(bridge.down0().st_dt());
			}
			
			if (!bridge.down1().isEmpty()) {
				for (DtlR dtlR : bridge.down1()) {
					// 抜取検査で検査状況が着手中の場合に取消計上日が消えないようにするため、計上日がNULLでない場合のみ設定する
					if (!isNull(dtlR.ac_dt())) {
						dtlR.can_ac_dt(dtlR.ac_dt());
					}
				}
			}
			
			if (!bridge.down2().isEmpty()) {
				for (SmplR smplR : bridge.down2()) {
					smplR.can_ac_dt(smplR.ac_dt());
				}
			}
		}
		
		protected void setSttCanAcDt() {
			if (MAC_INSP_MTD_TYP.isTTL(getHdrR().insp_mtd_typ())) {
				// 上部一覧に検査実績明細ＮＯが設定されたレコードが存在する場合、この処理は実施しない
				// ※検査実績明細が存在しない場合、検査着手明細の取消計上日が設定されているため、取消時には処理対象としたい
				MCList<DtlR> subL = getDtlL().subList(r -> !isNull(r.insp_act_d_no()));
				if (!subL.isEmpty() || !Cnd_ope_DEL.isSelected()) {
					return;
				}
			}
			// 抜取検査で検査状況が着手中の場合、上部一覧の計上日は検索時点ではNULLとなる
			// ※上部一覧の計上日は検査実績明細の計上日であるため
			// そのため、画面部品による検索時点の計上日と取消計上日の初期値設定が行われないため個別に実装する
			for (DtlR dtlR : getDtlL()) {
				if (isNull(dtlR.ac_dt()) && !isNull(dtlR.can_ac_dt())) {
					dtlR.ac_dt_after_srch(dtlR.can_ac_dt());
					dtlR.can_ac_dt_for_input(dtlR.can_ac_dt());
				}
			}
		}
		protected void setBaseFlg() {
			if (!bridge.down1().isEmpty()) {
				for (DtlR dtlR : bridge.down1()) {
					dtlR.itm_cd(bridge.down0().itm_cd());
					dtlR.itm_sub1(bridge.down0().itm_sub1());
					dtlR.itm_sub2(bridge.down0().itm_sub2());
					dtlR.itm_sub3(bridge.down0().itm_sub3());
					
					if (!isNull(dtlR.pack_xfr_pack_unit_qty())) {
						dtlR.base_flg(true);
					}
				}
			}
		}
	}

	/**
	 * [MS_MSBFL0070_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0070_Srch02Caller<P extends MSBFP_InspActReg, B extends MS_MSBFL0070_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBFL0070_Srch02Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			// 値変更時のイベントで呼び出すため、必須チェックは行わない。
		}

		@Override
		protected void setMode() {
			//フォーカスを飛ばしたくないかつステータス変更を行う必要がないので空実装。
		}
	}

	/**
	 * [MS_MSBFL0070_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0070_Ins01Caller<P extends MSBFP_InspActReg, B extends MS_MSBFL0070_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBFL0070_Ins01Caller(P p, B b) {
			super(p, b);
		}

		protected MCList<DtlR> _dtlLForCall;
		protected MCList<SmplR> _smplLForCall;

		@Override
		protected void initCaller() {
			super.initCaller();

			_dtlLForCall = MCList.create(DtlR.class);
			for (DtlR dtlR : getDtlL()) {
				if (MAC_INSP_MTD_TYP.isTTL(getHdrR().insp_mtd_typ()) 
						&& isNull(dtlR.insp_act_d_no()) && dtlR.isStatusNone()) {
					continue;
				}
				_dtlLForCall.add(dtlR);
			}
			_smplLForCall = MCList.create(SmplR.class);
			for (SmplR smplR : getSmplL()) {
				if (isNull(smplR.insp_smpl_act_no())) {
					if (smplR.isStatusNone()) {
						continue;
					}
					else if (smplR.isStatusModify()){
						smplR.setStatus(Status.CREATE);
					}
				}
				_smplLForCall.add(smplR);
			}
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			// 在庫行のみ必須チェック対象外にするため、superを呼ばない
			msgList.addAll(panel.checkReq(getHdrR(), _dtlLForCall, _smplLForCall));
		}

		@Override
		protected boolean checkUpListParamEmpty() {
			// 実績明細および抜取明細が空でも登録したいので、trueを返す。
			return true;
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up1().setAll(_dtlLForCall);
			bridge.up2().setAll(_smplLForCall);
		}
	}

	/**
	 * [MS_MSBFL0070_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0070_Upd01Caller<P extends MSBFP_InspActReg, B extends MS_MSBFL0070_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBFL0070_Upd01Caller(P p, B b) {
			super(p, b);
		}

		protected MCList<DtlR> _dtlLForCall;
		protected MCList<SmplR> _smplLForCall;

		@Override
		protected void initCaller() {
			super.initCaller();

			_dtlLForCall = MCList.create(DtlR.class);
			for (DtlR dtlR : getDtlL()) {
				if (MAC_INSP_MTD_TYP.isTTL(getHdrR().insp_mtd_typ()) 
						&& isNull(dtlR.insp_act_d_no()) && dtlR.isStatusNone()) {
					continue;
				}
				_dtlLForCall.add(dtlR);
			}
			_smplLForCall = MCList.create(SmplR.class);
			for (SmplR smplR : getSmplL()) {
				if (isNull(smplR.insp_smpl_act_no())) {
					if (smplR.isStatusNone()) {
						continue;
					}
					else if (smplR.isStatusModify()){
						smplR.setStatus(Status.CREATE);
					}
				}
				_smplLForCall.add(smplR);
			}
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			// 在庫行のみ必須チェック対象外にするため、superを呼ばない
			msgList.addAll(panel.checkReq(getHdrR(), _dtlLForCall, _smplLForCall));
		}

		@Override
		protected boolean checkUpListParamEmpty() {
			// 実績明細および抜取明細が空でも登録したいので、trueを返す。
			return true;
		}

		@Override
		protected void setupUpParam() {
			super.setupUpParam();
			bridge.up1().setAll(_dtlLForCall);
			bridge.up2().setAll(_smplLForCall);
		}
	}

	/**
	 * [MS_MSBFL0070_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0070_Upd02Caller<P extends MSBFP_InspActReg, B extends MS_MSBFL0070_Upd02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBFL0070_Upd02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected boolean checkUpListParamEmpty() {
			// 実績明細および抜取明細が空でも登録したいので、trueを返す。
			return true;
		}

		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			HdrR r = getHdrR();
			if (MAC_INSP_MTD_TYP.isSPEC(r.insp_mtd_typ())) {
				if (MSC_INSP_JUDG_RSLT_TYP.isOK(r.insp_judg_rslt_typ())) {
					if (r.std_insp_ng_flg()) {
						msgList.add(new MCMessage(r, null, MSBFP0006, r.insp_no()));
					}
					if (r.std_insp_sp_flg()) {
						msgList.add(new MCMessage(r, null, MSBFP0007, r.insp_no()));
					}
				}
				else if (MSC_INSP_JUDG_RSLT_TYP.isSP(r.insp_judg_rslt_typ())) {
					if (r.std_insp_ng_flg()) {
						msgList.add(new MCMessage(r, null, MSBFP0006, r.insp_no()));
					}
				}
			}
		}

		@Override
		protected void setMode() {
			super.setMode();

			setFIX_JStatus();
		}
	}

	/**
	 * [MS_MSBFL0070_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0070_Del01Caller<P extends MSBFP_InspActReg, B extends MS_MSBFL0070_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBFL0070_Del01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected boolean checkUpListParamEmpty() {
			// 実績明細および抜取明細が空でも取消したいので、trueを返す。
			return true;
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			for (DtlR r : getDtlL()) {
				msgList.addAll(panel.checkReqWithCellMode(r.getGUIIndex(),
						columnDtl_can_ac_dt_for_input));
			}
			if (!MAC_INSP_MTD_TYP.isTTL(getHdrR().insp_mtd_typ())) {
				for (SmplR r : getSmplL()) {
					msgList.addAll(panel.checkReqWithCellMode(r.getGUIIndex(),
							columnSmpl_can_ac_dt_for_input));
				}
			}
		}
	}

	/**
	 * [MS_MSBFL0070_Del02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0070_Del02Caller<P extends MSBFP_InspActReg, B extends MS_MSBFL0070_Del02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBFL0070_Del02Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected boolean checkUpListParamEmpty() {
			// 実績明細が空でも取消したいので、trueを返す。
			return true;
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			for (DtlR r : getDtlL()) {
				msgList.addAll(panel.checkReqWithCellMode(r.getGUIIndex(),
						columnDtl_can_ac_dt_for_input));
			}
		}
	}

	/**
	 * [MS_MSBFL0070_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0070_Prnt01Caller<P extends MSBFP_InspActReg, B extends MS_MSBFL0070_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBFL0070_Prnt01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBFL0070_Srch01();
	}
	/**
	 * Panel[DtlBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}
	/**
	 * Panel[DtlBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doDtlBtn_rcopy(MCEventInfo info) {
		DtlR r = copyRow(DtlTable);
		if (!isNull(r)) {
			r.insp_act_d_no(null);
			r.can_ac_dt_p(null);
			r.lims_flg(false);
			r.ext_sys_cd(null);
			r.ext_sys_nm(null);
			r.ext_insp_act_d_no(null);
		}
	}
	/**
	 * Panel[DtlSmplBtn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doSmplBtn_radd(MCEventInfo info) {
		SmplR smplR = insertRow(SmplTable);
		DtlR dtlR = DtlTable.getSelectedMCRow();
		if (!isNull(dtlR)) {
			smplR.wg_cd(dtlR.wg_cd());
			setValueEx(columnSmpl_loc_cd, smplR.getGUIIndex(), dtlR.loc_cd());
			if (dtlR.str_ln_tgt_flg() && !dtlR.str_ln_cd_none_flg()) {
				setValueEx(columnSmpl_str_ln_cd, smplR.getGUIIndex(), dtlR.str_ln_cd());
			}
			smplR.str_ln_cd_none_flg(dtlR.str_ln_cd_none_flg());
			smplR.stk_arrv_bp_cd(dtlR.stk_arrv_bp_cd());
			smplR.stk_arrv_bp_nm(dtlR.stk_arrv_bp_nm());
			smplR.gd_cd(dtlR.gd_cd());
			smplR.gd_nm(dtlR.gd_nm());
			smplR.quality_typ(dtlR.quality_typ());
			smplR.quality_typ_nm(dtlR.quality_typ_nm());
			smplR.stk_insp_typ(dtlR.stk_insp_typ());
			smplR.stk_insp_typ_nm(dtlR.stk_insp_typ_nm());
			smplR.stk_id_typ(dtlR.stk_id_typ());
			smplR.stk_id_typ_nm(dtlR.stk_id_typ_nm());
			smplR.stk_bp_cd(dtlR.stk_bp_cd());
			smplR.stk_bp_cd(dtlR.stk_bp_cd());
			smplR.sno1(dtlR.sno1());
			smplR.sno2(dtlR.sno2());
			smplR.sno3(dtlR.sno3());
			smplR.sno4(dtlR.sno4());
			smplR.wrk_no(dtlR.wrk_no());
			smplR.wrk_nm(dtlR.wrk_nm());
			smplR.fix_no_typ(dtlR.fix_no_typ());
			smplR.fix_no_typ_nm(dtlR.fix_no_typ_nm());
			smplR.fix_no(dtlR.fix_no());
			smplR.base_unit_cd(dtlR.base_unit_cd());
			smplR.base_unit_nm(dtlR.base_unit_nm());
			smplR.base_unit_dec_place(dtlR.base_unit_dec_place());
			smplR.base_unit_rnd_typ(dtlR.base_unit_rnd_typ());
			smplR.pack_xfr_pack_unit_cd(dtlR.pack_xfr_pack_unit_cd());
			smplR.pack_xfr_pack_unit_nm(dtlR.pack_xfr_pack_unit_nm());
			smplR.pack_xfr_pack_unit_dec_place(dtlR.pack_xfr_pack_unit_dec_place());
			smplR.pack_xfr_pack_unit_dmn_qty(dtlR.pack_xfr_pack_unit_dmn_qty());
			smplR.pack_xfr_pack_unit_conv_qty(dtlR.pack_xfr_pack_unit_conv_qty());
			smplR.pack_xfr_base_unit_cd(dtlR.pack_xfr_base_unit_cd());
			smplR.pack_xfr_base_unit_nm(dtlR.pack_xfr_base_unit_nm());
			smplR.pack_xfr_base_unit_dec_place(dtlR.pack_xfr_base_unit_dec_place());
			smplR.pack_xfr_base_unit_rnd_typ(dtlR.pack_xfr_base_unit_rnd_typ());
			smplR.stk_unit_cd(dtlR.pack_unit_cd());
			smplR.itm_cd(getHdrR().itm_cd());
			smplR.itm_sub1(getHdrR().itm_sub1());
			smplR.itm_sub2(getHdrR().itm_sub2());
			smplR.itm_sub3(getHdrR().itm_sub3());
			smplR.insp_no(getHdrR().insp_no());
			smplR.insp_act_no(getHdrR().insp_act_no());
		}
		setSmplBtnMode();
	}
	/**
	 * Panel[DtlSmplBtn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doSmplBtn_rdel(MCEventInfo info) {
		deleteRow(SmplTable);
	}
	/**
	 * Panel[DtlSmplBtn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doSmplBtn_rcopy(MCEventInfo info) {
		SmplR r = copyRow(SmplTable);
		r.clear(SmplR.$insp_smpl_act_no, SmplR.$so_cmpl_flg, SmplR.$can_ac_dt_p, SmplR.$lims_flg, SmplR.$ext_sys_cd, SmplR.$ext_sys_nm, SmplR.$ext_insp_smpl_act_no);
		setSmplBtnMode();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBFP0050]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBFP0050(MCEventInfo info) {
		MAUCP_AppScreenOpener aso = new MAUCP_AppScreenOpener("MS", "MSBFP0050");
		aso.putCnd(crtOpenMSBFP0050CndR(aso));
		aso.putSearchAction();
		aso.show();
	}
	
	protected mcframe.clientMSBF.MSBFP0050.CndR crtOpenMSBFP0050CndR(MAUCP_AppScreenOpener aso) {
		mcframe.clientMSBF.MSBFP0050.MSBFP_StdInspActReg p = (mcframe.clientMSBF.MSBFP0050.MSBFP_StdInspActReg) aso.getPanel();
		mcframe.clientMSBF.MSBFP0050.CndR to = mcframe.clientMSBF.MSBFP0050.CndR.create();
		if (MSC_INSP_STS_TYP.isJDG(getHdrR().insp_sts_typ())) {
			to.ope(p.Cnd_ope_REF.getActionCommand());
		}
		else {
			to.ope(p.Cnd_ope_INS.getActionCommand());
		}
		to.insp_no(getHdrR().insp_no());
		return to;

	}
	
	/**
	 * Panel[Btn]のボタン[prnt]の押下時の処理
	 */
	@Override
	public void doBtn_prnt(MCEventInfo info) {
		callMS_MSBFL0070_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[act_ins]の押下時の処理
	 */
	@Override
	public void doBtn_act_ins(MCEventInfo info) {
		callMS_MSBFL0070_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[act_upd]の押下時の処理
	 */
	@Override
	public void doBtn_act_upd(MCEventInfo info) {
		callMS_MSBFL0070_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[judg_upd]の押下時の処理
	 */
	@Override
	public void doBtn_judg_upd(MCEventInfo info) {
		callMS_MSBFL0070_Upd02();
	}
	/**
	 * Panel[Btn]のボタン[act_del]の押下時の処理
	 */
	@Override
	public void doBtn_act_del(MCEventInfo info) {
		callMS_MSBFL0070_Del01();
	}
	/**
	 * Panel[Btn]のボタン[judg_del]の押下時の処理
	 */
	@Override
	public void doBtn_judg_del(MCEventInfo info) {
		callMS_MSBFL0070_Del02();
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
	}

	@Override
	protected void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();

		if (!isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "1")) {
			setComponentInvisibleAllStatus(getInvisibleBeans());
		}
	}

	/**
	 * 非表示承認情報を設定する。
	 * @return
	 */
	protected MCBeans[] getInvisibleBeans() {
		return mcframe.commonCore.util.MCCollectionUtil.concat(
				new MCBeans[] {Cnd_ope_JUDG, JudgPanel}
				, (MCBeans[]) MCBeansUtil.getAllComponents(MCBeans.class, JudgPanel));
	}

	@Override
	protected void listInit() {
		super.listInit();
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setBtnMode();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setHdrMode();
		setBtnMode();
		HdrPanel.focusFirstComponent();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setHdrMode();
		setBtnMode();
		HdrPanel.focusFirstComponent();
	}

	@Override
	public void setJUDGStatus() {
		super.setJUDGStatus();
		setHdrMode();
		setBtnMode();

		// 判定者と判定部門はログインユーザの主部門ＣＤ及びユーザＩＤで固定する
		setJudgDptUsrDftVal();
		
		// 判定者と判定部門は入力不可とする。
		setJudgDptUsrMode();
	
		JudgPanel.focusFirstComponent();
	}

	/**
	 * 判定者、判定部門の初期値を設定する。
	 */
	protected void setJudgDptUsrDftVal() {
		Hdr_judg_dt.setValue(getToday());
		if (isNull(getHdrR().judg_usr_cd())) {
			setValueEx(Hdr_judg_usr_cd, mcframe.clientCore.sys.MCSys.user.ID());
		}
	}

	/**
	 * 判定者、判定部門を制御する。
	 */
	protected void setJudgDptUsrMode() {
		if (isSame(getSysParm("MFG_APRV_USR_FIX_FLG"), "1")) {
			Hdr_judg_dt.setMode(MCMode.READ_ONLY);
			Hdr_judg_usr_cd.setMode(MCMode.READ_ONLY);
		}
	}
	@Override
	public void setFIX_JStatus() {
		super.setFIX_JStatus();
		setBtnMode();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setHdrMode();
		setBtnMode();
		if (MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(getHdrR().insp_aprv_sts_typ())) {
			JudgPanel.focusFirstComponent();
		}
		else {
			HdrPanel.focusFirstComponent();
		}
	}

	/**
	 * 判定理由をクリアする
	 */
	protected void clearJudgRsn() {
		if (!isNull(getHdrR().judg_rsn()) && isEditable(Hdr_judg_rsn)) {
			getHdrR().judg_rsn(null);
		}
	}

	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		setBtnMode();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		setBtnMode();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		setBtnMode();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setBtnMode();
		CndPanel.focusFirstComponent();
	}

	protected boolean isInsStatus() {
		return isSame(getStatus(), INS);
	}

	protected boolean isUpdStatus() {
		return isSame(getStatus(), UPD);
	}

	protected boolean isJudgStatus() {
		return isSame(getStatus(), JUDG);
	}

	protected boolean isDelStatus() {
		return isSame(getStatus(), DEL);
	}

	protected boolean isRegStatus() {
		return isInsStatus() || isUpdStatus();
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		
		clearAll();
		chgStatus(info);
	}
	
	protected void clearAll() {
		String beforeMode = this.getStatus();
		
		// 登録枠のクリア
		if (isSame(beforeMode, INS) || isSame(beforeMode, UPD)
				|| isSame(beforeMode, JUDG) || isSame(beforeMode, DEL)
				|| isSame(beforeMode, FIX_I) || isSame(beforeMode, FIX_U)
				|| isSame(beforeMode, FIX_J) || isSame(beforeMode, FIX_D)) {
			clearContainers(getHdrR(), getDtlL(), getSmplL());
		}
	}
	
	protected void chgStatus(MCEventInfo info) {
		String beforeMode = this.getStatus();
		String afterOpe = (String)info.getNewValue();
		
		// ST変更
		if (isSame(beforeMode, REF)) {
			if (isSame(afterOpe, Cnd_ope_INS.getActionCommand())) {
				setStatus(INS);
			}
			else if (isSame(afterOpe, Cnd_ope_UPD.getActionCommand())) {
				setStatus(UPD);
			}
			else if (isSame(afterOpe, Cnd_ope_JUDG.getActionCommand())) {
				setStatus(JUDG);
			}
			else if (isSame(afterOpe, Cnd_ope_DEL.getActionCommand())) {
				setStatus(DEL);
			}
		}
		else {
			setStatus(SRCH);
		}
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();
		Hdr_st_dt.addLCListener(this);
		Hdr_end_dt.addLCListener(this);
		columnSmpl_act_dt.addLCListener(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		
		if (lc == Hdr_st_dt) {
			doHdr_st_dt_LC(info);
		}
		else if (lc == Hdr_end_dt) {
			doHdr_end_dt_LC(info);
		}
		else if (lc == columnSmpl_act_dt) {
			doSmpl_act_dt_LC(info);
		}
	}

	@Override
	public void doHdr_quality_typ_NC(MCEventInfo info) {
		super.doHdr_quality_typ_NC(info);
		
		setVldDtUpdFlg(MAC_QUALITY_TYP.isGOOD(getHdrR().quality_typ()));
		clearDfctRsn();

		if (!isNull(getHdrR().quality_typ())) {
			String DefDgCd = getSysParm("DEF_STK_GD_CD");
			if (!isNullOrNullVal(DefDgCd)) {
				setValueEx(Hdr_gd_cd, DefDgCd);
			}
		}
		else {
			setValueEx(Hdr_gd_cd, null);
		}

		setHdrMode();
	}

	@Override
	public void doHdr_gd_cd_NC(MCEventInfo info) {
		super.doHdr_gd_cd_NC(info);
		
		setHdrMode();
	}

	protected void doHdr_st_dt_LC(MCEventInfo info) {
		clearEndDt();
		clearGdCdAndQualityTyp();
		setHdrMode();
	}
	
	protected void doHdr_end_dt_LC(MCEventInfo info) {
		setAcDtByEndDt();
		setHdrMode();
		
		if (getHdrR().vld_dt_upd_flg() && isNull(getHdrR().insp_aprv_sts_typ())) {
			if (isNull(getHdrR().end_dt())) {
				getHdrR().lmt_dt_frm(null);
				getHdrR().vld_dt(null);
				if (!(MSC_INSP_TYP.isLOT(getHdrR().insp_typ()) && getHdrR().lmt_up_flg() && !isNull(getHdrR().vld_dt_now()))) {
					// 期限再検査、かつ現有効期限設定済みでなければ使用期限もクリアする
					getHdrR().lmt_dt(null);
				}
			}
			else if (MAC_LMT_DT_FRM_TYP.isINSP_JUDG(getHdrR().lmt_dt_frm_typ())) {
				setValueEx(Hdr_lmt_dt_frm, getHdrR().end_dt());
			}
			else if (MAC_LMT_DT_FRM_TYP.isVALID_DT(getHdrR().lmt_dt_frm_typ())) {
				setValueEx(Hdr_lmt_dt_frm, getHdrR().vld_dt_now());
			}
		}
	}
	
	@Override
	public void doHdr_judg_dt_NC(MCEventInfo info) {
		setAcDtByJudgDt();
		setHdrMode();
		
		if (getHdrR().vld_dt_upd_flg() && !isNull(getHdrR().insp_aprv_sts_typ())) {
			if (MAC_LMT_DT_FRM_TYP.isINSP_JUDG(getHdrR().lmt_dt_frm_typ())) {
				setValueEx(Hdr_lmt_dt_frm, getHdrR().judg_dt());
			}
			else if (MAC_LMT_DT_FRM_TYP.isVALID_DT(getHdrR().lmt_dt_frm_typ())) {
				setValueEx(Hdr_lmt_dt_frm, getHdrR().vld_dt_now());
			}
		}
	}

	protected void setAcDtByEndDt() {
		HdrR hdrR = getHdrR();
		if (MAC_INSP_MTD_TYP.isTTL(hdrR.insp_mtd_typ())) {
			return;
		}
		MCDate acDt = null;
		if (!isNull(hdrR.end_dt())) {
			acDt = hdrR.end_dt().trunc(MCDateFieldType.DAY);
		}
		for (DtlR dtlR : getDtlL()) {
			setValueEx(columnDtl_ac_dt, dtlR.getGUIIndex(), acDt);
		}
	}
	protected void setAcDtByJudgDt() {
		HdrR hdrR = getHdrR();
		MCDate acDt = null;
		if (!isNull(hdrR.judg_dt())) {
			acDt = hdrR.judg_dt().trunc(MCDateFieldType.DAY);
		}
		for (DtlR dtlR : getDtlL()) {
			setValueEx(columnDtl_ac_dt, dtlR.getGUIIndex(), acDt);
		}
	}
	@Override
	public void doHdr_insp_judg_rslt_typ_NC(MCEventInfo info) {
		setVldDtUpdFlg(MSC_INSP_JUDG_RSLT_TYP.isOK(getHdrR().insp_judg_rslt_typ())
				|| MSC_INSP_JUDG_RSLT_TYP.isSP(getHdrR().insp_judg_rslt_typ()));
		setHdrMode();
	}

	@Override
	public void doHdr_lmt_dt_frm_NC(MCEventInfo info) {
		getLmt();
	}

	@Override
	public void doHdr_vld_dt_upd_flg_NC(MCEventInfo info) {
		setHdrMode();
		
		HdrR hdr = getHdrR();
		if (hdr.vld_dt_upd_flg()) {
			if (MAC_LMT_DT_FRM_TYP.isVALID_DT(getHdrR().lmt_dt_frm_typ())) {
				setValueEx(Hdr_lmt_dt_frm, hdr.vld_dt_now());
			}
			else if (MAC_LMT_DT_FRM_TYP.isINSP_JUDG(hdr.lmt_dt_frm_typ())) {
				if (isNull(getHdrR().insp_aprv_sts_typ())) {
					setValueEx(Hdr_lmt_dt_frm, hdr.end_dt());
				}
				else {
					setValueEx(Hdr_lmt_dt_frm, hdr.judg_dt());
				}
			}
			else {
				getLmt();
			}
		}
		else {
			hdr.vld_dt(null);
			hdr.lmt_dt(null);
			//期限取得イベントを起こさないようにするためsetValueExしない
			hdr.lmt_dt_frm(null);
		}
	}

	protected void getLmt() {
		if (getHdrR().vld_dt_upd_flg()) {
			callMS_MSBFL0070_Srch02();
		}
	}
	
	protected void clearEndDt() {
		if (isNull(getHdrR().st_dt())) {
			setValueEx(Hdr_end_dt, null);
		}
	}
	
	protected void clearGdCdAndQualityTyp() {
		if (isNull(getHdrR().st_dt())) {
			setValueEx(Hdr_gd_cd, null);
			setValueEx(Hdr_quality_typ, null);
		}
	}
	
	protected void setVldDtUpdFlg(boolean vldDtUpdFlg) {
		HdrR hdr = getHdrR();
		
		if (hdr.lmt_ctl_flg()
			&& (
				MSC_INSP_TYP.isLOT(hdr.insp_typ())
				|| MSC_INSP_TYP.isPRDCT(hdr.insp_typ())
				|| MSC_INSP_TYP.isACCPT(hdr.insp_typ())
			)
		) {
			if (isRegStatus() && !isNull(hdr.insp_aprv_sts_typ())) {
				// 判定対象で操作種別が登録する、訂正する場合は何もしない
			}
			else if (hdr.lmt_up_flg()) {
				setValueEx(Hdr_vld_dt_upd_flg, vldDtUpdFlg);
			}
			else {
				if(isNull(hdr.vld_dt_now())) {
					setValueEx(Hdr_vld_dt_upd_flg, vldDtUpdFlg);
				}
			}
		}
	}
	
	protected void clearDfctRsn() {
		if (!MAC_QUALITY_TYP.isDFCT_INSP(getHdrR().quality_typ())) {
			setValueEx(Hdr_dfct_rsn_cd, null);
		}
	}
	
	// ヘッダの入力制御 
	protected void setHdrMode() {
		setEndDtMode();
		setGdCdAndQualityTypMode();
		setDfctRsnMode();
		setActContFctrMode();
		setVldDtUpdFlgMode();
		setLmtDtFrmVldDtMode();
		setLmtDtMode();
		setJudgDptUsrMode();
		setJudgRsnMode();
	}
	
	protected void setEndDtMode() {
		if (isRegStatus()) {
			if (isNull(getHdrR().st_dt())) {
				Hdr_end_dt.setMode(MCMode.READ_ONLY);
				return;
			}
			else if (isCmplWhenNotTtl()) {
				Hdr_end_dt.setMode(MCMode.REQUIRED);
				return;
			}
		}
		
		setDefaultMode(Hdr_end_dt);
	}
	
	protected void setGdCdAndQualityTypMode() {
		if (isRegStatus()) {
			if (MAC_INSP_MTD_TYP.isTTL(getHdrR().insp_mtd_typ()) || isNull(getHdrR().st_dt())) {
				Hdr_gd_cd.setMode(MCMode.READ_ONLY);
				Hdr_quality_typ.setMode(MCMode.READ_ONLY);
				return;
			}
			else if (isCmplWhenNotTtl()) {
				Hdr_gd_cd.setMode(MCMode.REQUIRED);
				Hdr_quality_typ.setMode(MCMode.REQUIRED);
				return;
			}
		}
		
		setDefaultMode(Hdr_gd_cd);
		setDefaultMode(Hdr_quality_typ);
	}
	
	protected boolean isCmplWhenNotTtl() {
		// 抜取検査または抜取規格検査の場合、
		// 終了日時、良品区分、格付ＣＤのいずれか一つに値が設定された場合、
		// 上記の３項目は全て必須項目となる。
		if (!MAC_INSP_MTD_TYP.isTTL(getHdrR().insp_mtd_typ())
				&& (!isNull(getHdrR().end_dt()) || !isNull(getHdrR().quality_typ()) || !isNull(getHdrR().gd_cd()))) {
			return true;
		}
		return false;
	}
	
	protected void setDfctRsnMode() {
		if (isRegStatus()) {
			if (!MAC_QUALITY_TYP.isDFCT_INSP(getHdrR().quality_typ())) {
				Hdr_dfct_rsn_cd.setMode(MCMode.READ_ONLY);
				return;
			}
		}
		
		setDefaultMode(Hdr_dfct_rsn_cd);
	}
	
	protected void setActContFctrMode() {
		if (isRegStatus() || isJudgStatus()) {
			if (!getHdrR().cont_fctr_flg()) {
				Hdr_act_cont_fctr.setMode(MCMode.READ_ONLY);
				return;
			}
		}
		
		setDefaultMode(Hdr_act_cont_fctr);
	}
	
	protected void setVldDtUpdFlgMode() {
		if ((isRegStatus() || isJudgStatus()) && getHdrR().lmt_ctl_flg()) {
			if (MSC_INSP_TYP.isLOT(getHdrR().insp_typ()) && getHdrR().lmt_up_flg()) {
				Hdr_vld_dt_upd_flg.setMode(MCMode.READ_ONLY);
				return;
			}
			if (isNull(getHdrR().vld_dt_now())) {
				Hdr_vld_dt_upd_flg.setMode(MCMode.READ_ONLY);
				return;
			}
			if (isRegStatus() && !isNull(getHdrR().insp_aprv_sts_typ())) {
				Hdr_vld_dt_upd_flg.setMode(MCMode.READ_ONLY);
				return;
			}
			if (isJudgStatus() && isNull(getHdrR().insp_aprv_sts_typ())) {
				Hdr_vld_dt_upd_flg.setMode(MCMode.READ_ONLY);
				return;
			}
		}
		else {
			Hdr_vld_dt_upd_flg.setMode(MCMode.READ_ONLY);
			return;
		}
		
		setDefaultMode(Hdr_vld_dt_upd_flg);
	}
	
	protected void setLmtDtFrmVldDtMode() {
		if (!isRegStatus() && !isJudgStatus()) {
			return;
		}
		if (!getHdrR().vld_dt_upd_flg()) {
			Hdr_lmt_dt_frm.setMode(MCMode.READ_ONLY);
			Hdr_vld_dt.setMode(MCMode.READ_ONLY);
			return;
		}
		else {
			if (isNull(getHdrR().insp_aprv_sts_typ())) {
				if (isNull(getHdrR().end_dt())) {
					Hdr_lmt_dt_frm.setMode(MCMode.READ_ONLY);
					Hdr_vld_dt.setMode(MCMode.READ_ONLY);
					return;
				}
				else {
					if (!MAC_INSP_MTD_TYP.isTTL(getHdrR().insp_mtd_typ()) && !isQualityGood()) {
						Hdr_lmt_dt_frm.setMode(MCMode.ENABLE);
						Hdr_vld_dt.setMode(MCMode.ENABLE);
						return;
					}
				}
			}
			else {
				if (isRegStatus() && isNull(getHdrR().insp_judg_rslt_typ())) {
					Hdr_lmt_dt_frm.setMode(MCMode.READ_ONLY);
					Hdr_vld_dt.setMode(MCMode.READ_ONLY);
					return;
				}
				if (!MSC_INSP_JUDG_RSLT_TYP.is_stk_good(getHdrR().insp_judg_rslt_typ())) {
					Hdr_lmt_dt_frm.setMode(MCMode.ENABLE);
					Hdr_vld_dt.setMode(MCMode.ENABLE);
					return;
				}
			}
		}
		if (MSC_INSP_TYP.isPRDCT(getHdrR().insp_typ())
				&& (MAC_LMT_DT_FRM_TYP.isMFG_ST(getHdrR().lmt_dt_frm_typ())
						|| MAC_LMT_DT_FRM_TYP.isMFG_CMPL(getHdrR().lmt_dt_frm_typ()))) {
			Hdr_lmt_dt_frm.setMode(MCMode.ENABLE);
			Hdr_vld_dt.setMode(MCMode.ENABLE);
			return;
		}
		// 子品目引継の場合は任意入力とする
		// 製造検査の場合：出来高実績前検査は子品目が決まっていないため
		// 受入検査の場合：投入実績未登録で入荷・仕入後検査が可能なため
		if ((MSC_INSP_TYP.isPRDCT(getHdrR().insp_typ())
				|| MSC_INSP_TYP.isACCPT(getHdrR().insp_typ()))
				&& (MAC_LMT_DT_FRM_TYP.isDPND_CHLD(getHdrR().lmt_dt_frm_typ())
						|| MAC_LMT_DT_FRM_TYP
								.isDPND_CHLD_FR_DT(getHdrR().lmt_dt_frm_typ()))) {
			Hdr_lmt_dt_frm.setMode(MCMode.ENABLE);
			Hdr_vld_dt.setMode(MCMode.ENABLE);
			return;
		}
		
		setDefaultMode(Hdr_lmt_dt_frm);
		setDefaultMode(Hdr_vld_dt);
	}
	
	protected boolean isQualityGood() {
		String qualityTyp = getHdrR().quality_typ();
		
		if (MAC_QUALITY_TYP.isGOOD(qualityTyp) || MAC_QUALITY_TYP.isSSPND(qualityTyp)) {
			return true;
		}
		return false;
	}
	
	protected void setLmtDtMode() {
		if (!isRegStatus() && !isJudgStatus()) {
			return;
		}
		if (!getHdrR().vld_dt_upd_flg()) {
			Hdr_lmt_dt.setMode(MCMode.READ_ONLY);
			return;
		}
		else {
			if (MSC_INSP_TYP.isLOT(getHdrR().insp_typ())) {
				if (!isNull(getHdrR().lmt_dt_now())) {
					Hdr_lmt_dt.setMode(MCMode.READ_ONLY);
					return;
				}
			}
			
			if (isNull(getHdrR().insp_aprv_sts_typ())) {
				if (isNull(getHdrR().end_dt())) {
					Hdr_lmt_dt.setMode(MCMode.READ_ONLY);
					return;
				}
				else {
					if (!MAC_INSP_MTD_TYP.isTTL(getHdrR().insp_mtd_typ()) && !isQualityGood()) {
						Hdr_lmt_dt.setMode(MCMode.ENABLE);
						return;
					}
				}
			}
			else {
				if (isRegStatus() && isNull(getHdrR().insp_judg_rslt_typ())) {
					Hdr_lmt_dt.setMode(MCMode.READ_ONLY);
					return;
				}
				if (!MSC_INSP_JUDG_RSLT_TYP.is_stk_good(getHdrR().insp_judg_rslt_typ())) {
					Hdr_lmt_dt.setMode(MCMode.ENABLE);
					return;
				}
			}
		}
		if (MSC_INSP_TYP.isPRDCT(getHdrR().insp_typ())
				&& (MAC_LMT_DT_FRM_TYP.isMFG_ST(getHdrR().lmt_dt_frm_typ())
						|| MAC_LMT_DT_FRM_TYP.isMFG_CMPL(getHdrR().lmt_dt_frm_typ()))) {
			Hdr_lmt_dt.setMode(MCMode.ENABLE);
			return;
		}
		// 子品目引継の場合は任意入力とする
		// 製造検査の場合：出来高実績前検査は子品目が決まっていないため
		// 受入検査の場合：投入実績未登録で入荷・仕入後検査が可能なため
		if ((MSC_INSP_TYP.isPRDCT(getHdrR().insp_typ())
				|| MSC_INSP_TYP.isACCPT(getHdrR().insp_typ()))
				&& (MAC_LMT_DT_FRM_TYP.isDPND_CHLD(getHdrR().lmt_dt_frm_typ())
						|| MAC_LMT_DT_FRM_TYP
								.isDPND_CHLD_FR_DT(getHdrR().lmt_dt_frm_typ()))) {
			Hdr_lmt_dt.setMode(MCMode.ENABLE);
			return;
		}
		
		setDefaultMode(Hdr_lmt_dt);
	}
	
	protected void setJudgRsnMode() {
		if (isJudgStatus()) {
			if (!MSC_INSP_STS_TYP.isJDG(getHdrR().insp_sts_typ())
					|| isNull(getHdrR().insp_aprv_sts_typ())
					|| MSC_INSP_APRV_STS_TYP.isINST_ACPT(getHdrR().insp_aprv_sts_typ())
					|| MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(getHdrR().insp_aprv_sts_typ())) {
				Hdr_judg_rsn.setMode(MCMode.READ_ONLY);
				return;
			}
		}
		else if (isDelStatus()) {
			if (!MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(getHdrR().insp_aprv_sts_typ())) {
				Hdr_judg_rsn.setMode(MCMode.READ_ONLY);
				return;
			}
		}
		
		setDefaultMode(Hdr_judg_rsn);
	}
	
	// ボタンの入力制御
	protected void setBtnMode() {
		setDtlBtnMode();
		setSmplBtnMode();
		setOpenBtnMode();
		setPrntBtnMode();
		setActBtnMode();
		setJudgBtnMode();
		setDelBtnMode();
	}
	
	protected void setDtlBtnMode() {
		if (!isRegStatus()) {
			return ;
		}

		if (getDtlL().isEmpty() || !MAC_INSP_MTD_TYP.isTTL(getHdrR().insp_mtd_typ())) {
			DtlBtn_rdel.setMode(MCMode.READ_ONLY);
			DtlBtn_rcopy.setMode(MCMode.READ_ONLY);
			return;
		}

		DtlR dtlR = DtlTable.getSelectedMCRow();
		if (isNull(dtlR)) {
			DtlBtn_rdel.setMode(MCMode.READ_ONLY);
			DtlBtn_rcopy.setMode(MCMode.READ_ONLY);
		}
		else {
			if (!isNull(dtlR.insp_act_d_no()) || dtlR.isStatusCreate()) {
				setDefaultMode(DtlBtn_rdel);
			}
			else {
				DtlBtn_rdel.setMode(MCMode.READ_ONLY);
			}
			setDefaultMode(DtlBtn_rcopy);
		}
	}
	
	protected void setSmplBtnMode() {
		if (!isRegStatus()) {
			return ;
		}
		if (MAC_INSP_MTD_TYP.isTTL(getHdrR().insp_mtd_typ()) || MSC_INSP_TYP.isPRCD(getHdrR().insp_typ())) {
			SmplBtn_radd.setMode(MCMode.DISABLE);
			SmplBtn_rdel.setMode(MCMode.DISABLE);
			SmplBtn_rcopy.setMode(MCMode.DISABLE);
			return;
		}
		DtlR dtlR = DtlTable.getSelectedMCRow();
		if (isNull(dtlR)) {
			SmplBtn_radd.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(SmplBtn_radd);
		}
		SmplR smplR = SmplTable.getSelectedMCRow();
		if (isNull(smplR)) {
			SmplBtn_rdel.setMode(MCMode.DISABLE);
			SmplBtn_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			if (!isNull(smplR.insp_smpl_act_no()) || smplR.isStatusCreate()) {
				setDefaultMode(SmplBtn_rdel);
			}
			else {
				SmplBtn_rdel.setMode(MCMode.DISABLE);
			}
			setDefaultMode(SmplBtn_rcopy);
		}
	}
	
	protected void setOpenBtnMode() {
		if (!MAC_INSP_MTD_TYP.isSPEC(getHdrR().insp_mtd_typ())) {
			Btn_open_MSBFP0050.setMode(MCMode.DISABLE);
			return;
		}
		
		setDefaultMode(Btn_open_MSBFP0050);
	}
	
	protected void setPrntBtnMode() {
		if (!getHdrR().std_insp_flg()) {
			Btn_prnt.setMode(MCMode.DISABLE);
			return;
		}
		
		setDefaultMode(Btn_prnt);
	}
	
	protected void setActBtnMode() {
		if (isInsStatus()) {
			if (MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(getHdrR().insp_aprv_sts_typ())
					|| !isNull(getHdrR().insp_act_no())) {
				Btn_act_upd.setMode(MCMode.DISABLE);
				return;
			}
		}
		else if (isUpdStatus()) {
			if (MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(getHdrR().insp_aprv_sts_typ())
					|| isNull(getHdrR().insp_act_no())) {
				Btn_act_upd.setMode(MCMode.DISABLE);
				return;
			}
		}
		
		setDefaultMode(Btn_act_upd);
	}
	
	protected void setJudgBtnMode() {
		if (isJudgStatus()) {
			if (!MSC_INSP_APRV_STS_TYP.isJUDG_OPN(getHdrR().insp_aprv_sts_typ())) {
				Btn_judg_upd.setMode(MCMode.DISABLE);
				return;
			}
		}
		
		setDefaultMode(Btn_judg_upd);
	}
	
	protected void setDelBtnMode() {
		if (isDelStatus()) {
			if (MSC_INSP_STS_TYP.isORD(getHdrR().insp_sts_typ())) {
				Btn_act_del.setMode(MCMode.DISABLE);
				Btn_judg_del.setMode(MCMode.DISABLE);
				return;
			}
			else if (MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(getHdrR().insp_aprv_sts_typ())) {
				Btn_act_del.setMode(MCMode.DISABLE);
				setDefaultMode(Btn_judg_del);
				return;
			}
			else {
				setDefaultMode(Btn_act_del);
				Btn_judg_del.setMode(MCMode.DISABLE);
				return;
			}
		}
		
		setDefaultMode(Btn_act_del);
		setDefaultMode(Btn_judg_del);
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);

		setDtlBtnMode();
		setSmplBtnMode();
	}

	@Override
	public void doSmpl_NC(MCEventInfo info) {
		super.doSmpl_NC(info);

		setSmplBtnMode();
	}

	protected void doSmpl_act_dt_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		if (idx < 0) {
			return ;
		}

		SmplR r = getSmplL().get(idx);

		if (isNull(r.act_dt())) {
			setValueEx(columnSmpl_ac_dt, idx, r.act_dt());
		}
		else {
			setValueEx(columnSmpl_ac_dt, idx, r.act_dt().trunc(MCDateFieldType.DAY));
		}
	}
	
	@Override
	public void doSmpl_ac_dt_LC(MCEventInfo info) {
		super.doSmpl_ac_dt_LC(info);
		int idx = info.getEventIndex();
		if (idx < 0) {
			return ;
		}

		SmplR r = getSmplL().get(idx);
		if (isNull(r.ac_dt())) {
			setValueEx(columnSmpl_bd_dpt_cd, idx, null);
		}
	}

	@Override
	public void doDtl_base_flg_NC(MCEventInfo info) {
		super.doDtl_base_flg_NC(info);
		
		int idx = info.getEventIndex();
		if (idx < 0) {
			return ;
		}
		
		DtlR dtlR = getDtlL().get(idx);
		
		if (dtlR.base_flg()) {
			setValueEx(columnDtl_pack_unit_cd, idx, dtlR.base_unit_cd());
		}
		else {
			setValueEx(columnDtl_pack_unit_cd, idx, dtlR.pack_xfr_pack_unit_cd());
			setValueEx(columnDtl_pack_xfr_pack_unit_qty, idx, null);
		}
	}
	
	@Override
	public void doDtl_quality_typ_NC(MCEventInfo info) {
		super.doDtl_quality_typ_NC(info);
		
		int idx = info.getEventIndex();
		DtlR dtlR = getDtlL().get(idx);
		
		if (isNull(dtlR.quality_typ()) || !MAC_QUALITY_TYP.isDFCT_INSP(dtlR.quality_typ())) {
			setValueEx(columnDtl_dfct_rsn_cd, idx, null);
		}
	}

	@Override
	public MCList getHdr_quality_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispQualityTyp());
		return super.getHdr_quality_typ(row, info);
	}

	@Override
	public MCList getDtl_quality_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispQualityTyp());
		return super.getDtl_quality_typ(row, info);
	}
	
	public MAC_QUALITY_TYP[] getDispQualityTyp() {
		return new MAC_QUALITY_TYP[] {
				MAC_QUALITY_TYP.GOOD, MAC_QUALITY_TYP.DFCT_INSP,
				MAC_QUALITY_TYP.SSPND
		};
	}

	@Override
	public MCButtonGroup getOpeButtonGroup() {
		return Cnd_ope_Group;
	}

	@Override
	protected void opePanelFillSpace() {
		// マスタを再展開するのが通常の登録方法なため、fillSpaceは行わない
		return;
	}

	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getHdrR());
		ret.add(getDtlL());
		ret.add(getSmplL());
		return ret;
	}

	@Override
	public List<MCContainer> opePanelGetCndBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getCndR());
		return ret;
	}

	@Override
	public MCBeans getAcDtBeans(MCRootPanel panel) {
		if (panel == Dtl_can_ac_dt_p_PPanel) {
			return columnDtl_ac_dt;
		}
		else if (panel == Smpl_can_ac_dt_p_PPanel) {
			return columnSmpl_ac_dt;
		}
		return null;
	}

	@Override
	public MCBeans getScreenOpeBeans(MCRootPanel panel) {
		return Cnd_ope_Group;
	}

	@Override
	public boolean isCanAcDtValueInitOpe(MCRootPanel panel) {
		if (Cnd_ope_UPD.isSelected() || (Cnd_ope_DEL.isSelected())) {
			return true;
		}
		
		return false;
	}

	@Override
	public MCBeans getCheckBeans(MCRootPanel panel) {
		return null;
	}
	@Override
	protected void setupParts() {
		super.setupParts();
		Hdr_inst_pack_unit_qty_p_PPanel.setRelateBeans(Hdr_pack_unit_cd, Hdr_pack_unit_dec_place);
		Hdr_inst_base_unit_qty_p_PPanel.setRelateBeans(Hdr_base_unit_cd, Hdr_base_unit_dec_place);
		Hdr_rem_base_unit_qty_p_PPanel.setRelateBeans(Hdr_base_unit_cd, Hdr_base_unit_dec_place);
		Hdr_good_qty_p_PPanel.setRelateBeans(Hdr_base_unit_cd, Hdr_base_unit_dec_place);
		Hdr_dfct_qty_p_PPanel.setRelateBeans(Hdr_base_unit_cd, Hdr_base_unit_dec_place);
		Hdr_act_ttl_qty_p_PPanel.setRelateBeans(Hdr_base_unit_cd, Hdr_base_unit_dec_place);
		Hdr_judg_ttl_qty_p_PPanel.setRelateBeans(Hdr_base_unit_cd, Hdr_base_unit_dec_place);
		Hdr_smpl_inst_qty_p_PPanel.setRelateBeans(Hdr_smpl_inst_unit_cd, Hdr_smpl_inst_unit_dec_place);
		Hdr_act_usr_dpt_p_PPanel.setRelateBeans(Hdr_st_dt);
		Hdr_judg_usr_dpt_p_PPanel.setRelateBeans(Hdr_judg_dt);
		
		Dtl_stk_pack_unit_qty_p_PPanel.setRelateBeans(columnDtl_stk_pack_unit_cd, columnDtl_stk_pack_unit_dec_place);
		Dtl_stk_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_stk_base_unit_cd, columnDtl_stk_base_unit_dec_place);
		Dtl_pack_unit_qty_p_PPanel.setRelateBeans(columnDtl_pack_unit_cd, columnDtl_pack_unit_dec_place);
		Dtl_base_unit_qty_p_PPanel.setRelateBeans(
				columnDtl_base_unit_cd, columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ,
				columnDtl_pack_unit_qty, columnDtl_pack_unit_dmn_qty, columnDtl_pack_unit_conv_qty);
		Dtl_pack_xfr_pack_unit_qty_p_PPanel.setRelateBeans(columnDtl_pack_xfr_pack_unit_cd, columnDtl_pack_xfr_pack_unit_dec_place);
		Dtl_pack_xfr_base_unit_qty_p_PPanel.setRelateBeans(
				columnDtl_pack_xfr_base_unit_cd, columnDtl_pack_xfr_base_unit_dec_place, columnDtl_pack_xfr_base_unit_rnd_typ,
				columnDtl_pack_xfr_pack_unit_qty, columnDtl_pack_xfr_pack_unit_dmn_qty, columnDtl_pack_xfr_pack_unit_conv_qty);

		Smpl_so_qty_p_PPanel.setRelateBeans(columnSmpl_base_unit_cd, columnSmpl_base_unit_dec_place);
		Smpl_smpl_qty_p_PPanel.setRelateBeans(columnSmpl_base_unit_cd, columnSmpl_base_unit_dec_place);
		Smpl_pack_xfr_pack_unit_qty_p_PPanel.setRelateBeans(columnSmpl_pack_xfr_pack_unit_cd, columnSmpl_pack_xfr_pack_unit_dec_place);
		Smpl_pack_xfr_base_unit_qty_p_PPanel.setRelateBeans(
				columnSmpl_pack_xfr_base_unit_cd, columnSmpl_pack_xfr_base_unit_dec_place, columnSmpl_pack_xfr_base_unit_rnd_typ,
				columnSmpl_pack_xfr_pack_unit_qty, columnSmpl_pack_xfr_pack_unit_dmn_qty, columnSmpl_pack_xfr_pack_unit_conv_qty);
		Smpl_str_ln_p_PPanel.setRelateBeans(columnSmpl_loc_cd, columnSmpl_str_ln_tgt_flg);
	}

	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		
		
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();

		DtlTable.setCellConfig(createDtlTableCellConfig());
		SmplTable.setCellConfig(createSmplTableCellConfig());
	}

	/**
	 * DtlTable用のセルコンフィグ
	 */
	protected MCCellConfig createDtlTableCellConfig() {
		return new DtlTableCellConfig();
	}

	/**
	 * SmplTable用のセルコンフィグ
	 */
	protected MCCellConfig createSmplTableCellConfig() {
		return new SmplTableCellConfig();
	}

	/**
	 * DtlTable用のセルコンフィグ
	 */
	public class DtlTableCellConfig extends MAUDP_CellConfig {

		@SuppressWarnings("unchecked")
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlR dtlR = (DtlR) table.getBaseTable().getRow(index);
			HdrR hdrR = getHdrR();

			if (!MAC_INSP_MTD_TYP.isTTL(hdrR.insp_mtd_typ())) {
				// 抜取検査で終了日がNULLの場合、計上日は入力不可（終了日がNULLの場合、検査実績明細は作成しないため）
				if (column == columnDtl_ac_dt) {
					if (isNull(hdrR.end_dt())) {
						return MCMode.READ_ONLY;
					}
				}
				else if (column != columnDtl_can_ac_dt_for_input) {
					return MCMode.READ_ONLY;
				}
			}
			else if (isRegStatus()) {
				if (column == columnDtl_gd_cd
						|| column == columnDtl_quality_typ
						|| column == columnDtl_pack_unit_qty) {
					return MCMode.REQUIRED;
				}
				if (column == columnDtl_base_flg) {
					if (isSame(dtlR.pack_xfr_pack_unit_cd(), dtlR.pack_xfr_base_unit_cd())) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_pack_xfr_pack_unit_qty) {
					if (!dtlR.base_flg()) {
						return MCMode.READ_ONLY;
					}
				}
				if (column == columnDtl_dfct_rsn_cd) {
					if (!MAC_QUALITY_TYP.isDFCT_INSP(dtlR.quality_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}

			return super.getPriorMode(index, column, table);
		}
		@Override
		public MCMode getPriorDeleteMode(int index, MCColumnConfig column, MCTable table) {
			if (isSame(getStatus(),FIX_U)) {
				return MCMode.READ_ONLY;
			}
			if (Cnd_ope_UPD.isSelected()) {
				if (column == columnDtl_can_ac_dt_for_input) {
					return MCMode.REQUIRED;
				}
			}
			return super.getPriorDeleteMode(index, column, table);
		}
	}

	/**
	 * SmplTable用のセルコンフィグ
	 */
	public class SmplTableCellConfig extends MAUDP_CellConfig {

		@SuppressWarnings("unchecked")
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			SmplR smplR = (SmplR) table.getBaseTable().getRow(index);
			HdrR hdrR = getHdrR();

			if (MAC_INSP_MTD_TYP.isTTL(hdrR.insp_mtd_typ())) {
				return MCMode.READ_ONLY;
			}

			if (isRegStatus()) {
				if (column == columnSmpl_act_dt
						|| column == columnSmpl_ac_dt
						|| column == columnSmpl_smpl_qty) {
					return MCMode.REQUIRED;
				}
				if (column == columnSmpl_loc_cd) {
					if (isNull(smplR.insp_schd_no()) || !getDtlL().isEmpty()) {
						return MCMode.READ_ONLY;
					}
					else {
						return MCMode.REQUIRED;
					}
				}
				if (column == columnSmpl_str_ln_cd || column == columnSmpl_str_ln_cd_none_flg) {
					if (isNull(smplR.insp_schd_no()) || !getDtlL().isEmpty()) {
						if (smplR.str_ln_tgt_flg()) {
							return MCMode.READ_ONLY;
						}
					}
				}
				if (column == columnSmpl_bd_dpt_cd) {
					if (isNull(smplR.ac_dt())) {
						return MCMode.READ_ONLY;
					}
					else {
						if (!isNull(smplR.so_qty())) {
							return MCMode.REQUIRED;
						}
					}
				}
				if (column == columnSmpl_pack_xfr_pack_unit_qty) {
					if (isSame(smplR.pack_xfr_pack_unit_cd(), smplR.pack_xfr_base_unit_cd())) {
						return MCMode.READ_ONLY;
					}
					else {
						if (!isNull(smplR.so_qty())) {
							return MCMode.REQUIRED;
						}
					}
				}
			}
			if (isDelStatus()
					&& MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(hdrR.insp_aprv_sts_typ())) {
				if (column == columnSmpl_can_ac_dt_for_input) {
					return MCMode.READ_ONLY;
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
		@Override
		public MCMode getPriorDeleteMode(int index, MCColumnConfig column, MCTable table) {
			if (isSame(getStatus(),FIX_U)) {
				return MCMode.READ_ONLY;
			}
			if (Cnd_ope_UPD.isSelected()) {
				if (column == columnSmpl_can_ac_dt_for_input) {
					return MCMode.REQUIRED;
				}
			}
			return super.getPriorDeleteMode(index, column, table);
		}
	}

}