package mcframe.serverMSBF.MSBFL0070;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMSBF.MSBFL0070.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBF.MSBFL5010.*;
import mcframe.serverMSBF.MSBFL5050.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSBF.MSBFL5330.*;
import mcframe.serverFXUC.FXUCL0170.*;
import static mcframe.serverMSBF.MSBFL0070.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_InspActReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_InspActReg_MC extends MSBFL_InspActReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検査指図、検査予定、現状在庫を検索する<br>
	 */
	public class Srch01 extends MSBFL_InspActReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 検索条件設定
			setUpTmpCol();

			executeQuery(down0(), MSBFL0070_MST_INSP_INST_S01(), up0());
			if (!isDisp()) {
				return;
			}
			
			editPrcdInsp();
			getItmInsp();
			getInspStdAct();
			srchDtl();
			srchSmpl();
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();

			editLmtDtFrm(down0());
			editStdInspSts(down0());
			editDtl();
		}

		/**
		 * 検索条件に対する一時カラムを設定する
		 */
		protected void setUpTmpCol() {
			setOpe();
		}
		
		protected void setOpe() {
			// 検索時に動的にDACを設定するための条件
			up0().addStringColumn("LOGIN_USR_CD", mcframe.serverCore.sys.MCSys.user.ID());
			up0().addDateColumn("DT", getToday());
			if (isSame(up0().ope(), "2")) {
				up0().addStringColumn("OPE_VAL", "2");
			}
			else if (isSame(up0().ope(), "3")) {
				up0().addStringColumn("OPE_VAL", "3");
			}
			else {
				up0().addStringColumn("OPE_VAL", "1");
			}
		}

		/**
		 * 起算日を計算する。
		 */
		protected void editLmtDtFrm(Srch01_RsltR r) {
			// 操作種別は「取消」、「参照」の場合、計算しない
			if (isSame(up0().ope(), "3") || isSame(up0().ope(), "4")) {
				return;
			}
			if (isValidDtUpdFlgTrue(r) 
					&& isNull(r.vld_dt_now()) 
					&& !MAC_LMT_DT_FRM_TYP.isVALID_DT(r.lmt_dt_frm_typ())
					&& !MAC_LMT_DT_FRM_TYP.isINSP_JUDG(r.lmt_dt_frm_typ())) {
				MSBFL_InspActReg.Srch02 srch = MSBFL_InspActReg.crtSrch02();
				srch.up0().insp_no(r.insp_no());
				srch.up0().lmt_dt_frm(r.lmt_dt_frm());
				srch.exec();
				r.lmt_dt_frm(srch.down0().lmt_dt_frm());
				r.vld_dt(srch.down0().vld_dt());
				r.lmt_dt(srch.down0().lmt_dt());
			}
		}

		/**
		 * 規格検査入力済み、確認済みＦＬＧを設定する。
		 */
		protected void editStdInspSts(Srch01_RsltR r) {
			if (MAC_INSP_MTD_TYP.isSPEC(r.insp_mtd_typ())) {
				MCList<MST_STD_INSP_ACT_R> selectL = MCList.create(MST_STD_INSP_ACT_R.class);
				MST_STD_INSP_ACT_R t = MST_STD_INSP_ACT_R.create("T");
				MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
				selectL_bldr.setWhere(t.insp_no.eq(bind("insp_no")), r);
				dbSelect("MSBFL0070_MST_STD_INSP_ACT_S01", selectL, selectL_bldr);

				if (!isNull(selectL.getFirst(MST_STD_INSP_ACT_R.$std_insp_rslt_typ, MSC_STD_INSP_RSLT_TYP.NG.value()))) {
					r.std_insp_ng_flg(true);
				}
				if (!isNull(selectL.getFirst(MST_STD_INSP_ACT_R.$std_insp_rslt_typ, MSC_STD_INSP_RSLT_TYP.SP.value()))) {
					r.std_insp_sp_flg(true);
				}
			}
		}

		protected void editDtl() {
			if (isSame(up0().ope(), "2") && MSC_INSP_APRV_STS_TYP.isJUDG_OPN(down0().insp_aprv_sts_typ())) {
				for (Srch01_DtlR r : down1()) {
					r.ac_dt(null);
				}
			}
		}
		/**
		 * 使用期限を更新するフラグをtrueにすべきかどうか
		 * @return
		 */
		protected boolean isValidDtUpdFlgTrue(Srch01_RsltR r) {
			boolean ret = false;
			
			if (!r.lmt_ctl_flg()) {
				// 期限管理対象外の場合はfalse
			}
			else if (MSC_INSP_TYP.isLOT(r.insp_typ())
					|| MSC_INSP_TYP.isPRDCT(r.insp_typ())
					|| MSC_INSP_TYP.isACCPT(r.insp_typ())) {
				
				if (r.lmt_up_flg()) {
					ret = true;
				}
				else {
					ret = isNull(r.vld_dt_now());
				}
			}
			
			return ret;
		}

		protected boolean isDisp() {
			if (down0().isEmpty() ||
					MSC_INSP_APRV_STS_TYP.isINST_OPN(down0().insp_aprv_sts_typ())) {
				down0().clear();
				return false;
			}
			return true;
		}
		
		/**
		 * 先行検査の下り電文を編集する。
		 */
		protected void editPrcdInsp() {
			if (MSC_INSP_TYP.isPRCD(down0().insp_typ())) {
				// 先行検査の場合、MST_LOTから取得した項目をnullで上書き。
				// ※先行検査の場合、ロット、サブロット、手配ＮＯにNULL文字が
				// ※設定されている。偶然MST_LOTにそのようなデータが存在し、
				// ※MSBFL0070_MST_INSP_INST_S01で取得してしまった場合を考慮している。
				down0().ver_no(null);
				down0().vld_dt_now(null);
				down0().lot_rmrks(null);
			}
		}
		
		protected void getItmInsp() {
			MSBFL_InspSchdService.InspSchd_Srch01 o = MSBFL_InspSchdService.crtInspSchd_Srch01();
			
			InspSchd_Srch01_CndR oR = InspSchd_Srch01_CndR.create();
			oR.itm_cd(down0().itm_cd());
			oR.itm_sub1(down0().itm_sub1());
			oR.itm_sub2(down0().itm_sub2());
			oR.itm_sub3(down0().itm_sub3());
			oR.mfg_loc_cd(down0().mfg_loc_cd());
			oR.sppl_cd(down0().sppl_cd());
			oR.maker_cd(down0().maker_cd());
			oR.base_dt(down0().master_dt());
			oR.insp_typ(down0().insp_typ());
			oR.insp_ptn_cd(down0().insp_ptn_cd());
			oR.no_insp_srch_flg(true);
			oR.to_site_cd(down0().to_site_cd());
			o.up0().add(oR);
			
			o.exec();
			
			if (o.down0().isEmpty()) {
				return;
			}
			
			InspSchd_Srch01_CndR itmInspR = o.down0().get(0);
			
			down0().calc_pd_typ(itmInspR.calc_pd_typ());
			down0().lmt_pd(itmInspR.lmt_pd());
			if (MSC_INSP_TYP.isLOT(down0().insp_typ())) {
				down0().vld_pd(nvl(itmInspR.lot_insp_vld_pd(), itmInspR.vld_pd()));
				down0().lmt_dt_frm_typ(nvl(itmInspR.lot_insp_lmt_dt_frm_typ(), MAC_LMT_DT_FRM_TYP.INSP_JUDG.value()));
			}
			else {
				down0().vld_pd(itmInspR.vld_pd());
				down0().lmt_dt_frm_typ(nvl(down0().lmt_dt_frm_typ(), itmInspR.lmt_dt_frm_typ()));
			}
		}
		
		protected void getInspStdAct() {
			if (MAC_INSP_MTD_TYP.isSPEC(down0().insp_mtd_typ())) {
				down0().std_insp_flg(true);
				
				MCList<MST_STD_INSP_ACT_R> stdActL = MCList.create(MST_STD_INSP_ACT_R.class);
				MST_STD_INSP_ACT_R t = MST_STD_INSP_ACT_R.create("T");
				MCQueryApiBuilder stdActL_bldr = MCQueryApiBuilder.create(t);
				stdActL_bldr.setSelect(t.std_insp_rslt_typ);
				stdActL_bldr.addSelect(t.cnf_flg);
				stdActL_bldr.addSelect(t.std_insp_inst_no);
				stdActL_bldr.setWhere(t.insp_no.eq(bind("1")), down0().insp_no());
				dbSelect("MSBFL0070_MST_STD_INSP_ACT_S02", stdActL, stdActL_bldr);
				
				MCList<MST_STD_INSP_INST_R> stdInstL = MCList.create(MST_STD_INSP_INST_R.class);
				MST_STD_INSP_INST_R StdInspInstR = MST_STD_INSP_INST_R.create("STDINSPINST");
				MCQueryApiBuilder stdInstL_bldr = MCQueryApiBuilder.create(StdInspInstR);
				stdInstL_bldr.addSelect(StdInspInstR.std_insp_inst_no);
				stdInstL_bldr.setWhere(StdInspInstR.insp_no.eq(bind("1")), down0().insp_no());
				dbSelect("MSBFL5050_MST_STD_INSP_INST_S01", stdInstL, stdInstL_bldr);
				
				MCIndexKey stdActIdx = stdActL.createIndex(MST_STD_INSP_ACT_R.$std_insp_inst_no);
				
				MCList<MST_STD_INSP_INST_R> notStdActL = MCList.create(MST_STD_INSP_INST_R.class);
				for (MST_STD_INSP_INST_R stdInstR : stdInstL) {
					MCList<MST_STD_INSP_ACT_R> actL = stdActL.subList(stdActIdx, stdInstR.std_insp_inst_no());
					if (actL.isEmpty()) {
						notStdActL.add(stdInstR);
					}
				}
				
				if (!stdActL.isEmpty() && notStdActL.isEmpty()) {
					if (stdActL.subList(MST_STD_INSP_ACT_R.$std_insp_rslt_typ, null).isEmpty()) {
						down0().std_cmpl_flg(true);
					}
					if (stdActL.subList(MST_STD_INSP_ACT_R.$cnf_flg, false).isEmpty()) {
						down0().std_cnf_cmpl_flg(true);
					}
				}
				
				if (!stdActL.isEmpty()) {
					if (!isNull(stdActL.getFirst(MST_STD_INSP_ACT_R.$std_insp_rslt_typ, MSC_INSP_JUDG_RSLT_TYP.SP.value()))) {
						down0().spec_sp_flg(true);
					}
					if (!isNull(stdActL.getFirst(MST_STD_INSP_ACT_R.$std_insp_rslt_typ, MSC_INSP_JUDG_RSLT_TYP.NG.value()))) {
						down0().spec_ng_flg(true);
					}
				}
			}
		}
		
		protected void srchDtl() {
			if (MSC_INSP_TYP.isPRCD(down0().insp_typ())
					|| down0().lmt_up_flg()) {
				return;
			}
			
			if (MSC_INSP_STS_TYP.isORD(down0().insp_sts_typ())
					|| (MSC_INSP_STS_TYP.isSTR(down0().insp_sts_typ())
							&& MSC_INSP_APRV_STS_TYP.isINST_ACPT(down0().insp_aprv_sts_typ())
							&& !MAC_INSP_MTD_TYP.isTTL(down0().insp_mtd_typ()))) {
				// 以下の場合には現状在庫から明細を取得する
				// ・検査状況区分：指図済
				// ・検査状況区分：着手中、検査承認状況区分：指図承認済、検査方法区分：抜取検査または抜取規格検査
				down1().addAll(getStkL(false));
				editCanAcDtWithSttD();
			}
			else if (MSC_INSP_STS_TYP.isSTR(down0().insp_sts_typ())
					&& MSC_INSP_APRV_STS_TYP.isINST_ACPT(down0().insp_aprv_sts_typ())
					&& MAC_INSP_MTD_TYP.isTTL(down0().insp_mtd_typ())) {
				// 以下の場合には現状在庫（判定待在庫を除く）と検査実績明細から明細を取得する
				// ・検査状況区分：着手中、検査承認状況区分：指図承認済、検査方法区分：全数検査
				down1().addAll(getStkL(true));
				
				MCList<Srch01_DtlR> dtlL = MCList.create(Srch01_DtlR.class);
				executeQuery(dtlL, MSBFL0070_MST_INSP_ACT_D_S01(), down0());
				down1().addAll(dtlL);

				if (dtlL.isEmpty()) {
					// 検査実績明細が存在しない場合、検査着手明細から取消計上日を設定する
					editTtlCanAcDtWithSttD();
				}
			}
			else if ((MSC_INSP_STS_TYP.isSTR(down0().insp_sts_typ()) && isNull(down0().insp_aprv_sts_typ()))) {
				// 以下の場合には現状在庫と検査実績明細から明細を取得する
				// ・検査状況区分：着手中、検査承認状況区分：NULL
				down1().addAll(getStkL(false));
				
				MCList<Srch01_DtlR> dtlL = MCList.create(Srch01_DtlR.class);
				executeQuery(dtlL, MSBFL0070_MST_INSP_ACT_D_S01(), down0());
				down1().addAll(dtlL);
				if (!MAC_INSP_MTD_TYP.isTTL(down0().insp_mtd_typ())) {
					editCanAcDtWithSttD();
				}
				else if (dtlL.isEmpty()) {
					// 全数検査かつ検査実績明細が存在しない場合、検査着手明細から取消計上日を設定する
					editTtlCanAcDtWithSttD();
				}
			}
			else if (MSC_INSP_STS_TYP.isJDG(down0().insp_sts_typ())) {
				// 検査状況区分：完了の場合には検査実績明細から明細を取得する
				executeQuery(down1(), MSBFL0070_MST_INSP_ACT_D_S01(), down0());

				// 検査承認状況区分：判定済の場合、判定を取り消すために、判定事績明細の計上日で検査明細の明細に上書きする
				if (MSC_INSP_APRV_STS_TYP.isJUDG_ACPT(down0().insp_aprv_sts_typ())) {
					editAcDtWithJudgD();
				}
				down0().rem_base_unit_qty(MCNumber.ZERO);
			}
			if (!down1().isEmpty()) {
				down1().setValueNE(Srch01_DtlR.$insp_no, down0().insp_no());
			}
		}
		
		protected MCList<MST_INSP_SCHD_R> getInspSchd() {
			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			schdL_bldr.setSelect(t.insp_schd_no);
			schdL_bldr.addSelect(t.src_no4);
			schdL_bldr.addSelect(t.insp_typ);
			schdL_bldr.addSelect(t.base_unit_cd);
			schdL_bldr.setWhere(t.insp_no.eq(bind("1")), down0().insp_no());
			dbSelect("MSBFL0070_MST_INSP_SCHD_S01", schdL, schdL_bldr);
			
			for (MST_INSP_SCHD_R schdR : schdL) {
				if (MSC_INSP_TYP.isACCPT(schdR.insp_typ())) {
					schdR.addStringColumn(Srch01_DtlR.$fix_no_typ, MSC_FIX_NO_TYP.ARR_ACT_NO.value());
					schdR.addStringColumn(Srch01_DtlR.$fix_no, schdR.src_no4());
				}
				else if (MSC_INSP_TYP.isPRDCT(schdR.insp_typ())) {
					schdR.addStringColumn(Srch01_DtlR.$fix_no_typ, MSC_FIX_NO_TYP.YIELD_ACT_NO.value());
					schdR.addStringColumn(Srch01_DtlR.$fix_no, schdR.src_no4());
				}
				else if (MSC_INSP_TYP.isLOT(schdR.insp_typ())) {
					schdR.addStringColumn(Srch01_DtlR.$fix_no_typ, MSC_FIX_NO_TYP.INSP_SCHD_NO.value());
					schdR.addStringColumn(Srch01_DtlR.$fix_no, schdR.insp_schd_no());
				}
			}
			
			return schdL;
		}
		
		/**
		 * 確定ＮＯをもとに着手明細を取得し、計上日を取消計上日に設定する。
		 */
		protected void editCanAcDtWithSttD() {
			MCList<MST_INSP_STT_D_R> sttDL = MCList.create(MST_INSP_STT_D_R.class);
			MST_INSP_STT_D_R t = MST_INSP_STT_D_R.create("T");
			MCQueryApiBuilder sttDL_bldr = MCQueryApiBuilder.create(t);
			sttDL_bldr.setSelect(t.insp_act_no, t.fix_no_typ, t.fix_no, t.ac_dt);
			sttDL_bldr.setWhere(t.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL0070_MST_INSP_STT_D_S01", sttDL, sttDL_bldr, down0());
			MCIndexKey idxkey = sttDL.createIndex(MST_INSP_STT_D_R.$fix_no, MST_INSP_STT_D_R.$fix_no_typ);
			for (Srch01_DtlR dtlR : down1()) {
				MST_INSP_STT_D_R sttDR = sttDL.getFirst(idxkey, dtlR.fix_no(), dtlR.fix_no_typ());
				if (!isNull(sttDR)) {
					dtlR.insp_act_no(sttDR.insp_act_no());
					dtlR.can_ac_dt(sttDR.ac_dt());
				}
			}
		}
		/**
		 * 確定ＮＯをもとに判定明細を取得し、計上日を上部一覧の計上日に設定する。
		 */
		protected void editAcDtWithJudgD() {
			MCList<MST_INSP_JUDG_D_R> judgDL = MCList.create(MST_INSP_JUDG_D_R.class);
			MST_INSP_JUDG_D_R t = MST_INSP_JUDG_D_R.create("T");
			MCQueryApiBuilder judgDL_bldr = MCQueryApiBuilder.create(t);
			judgDL_bldr.setSelect(t.fix_no_typ, t.fix_no, t.ac_dt);
			judgDL_bldr.setWhere(t.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL0070_MST_INSP_JUDG_D_S01", judgDL, judgDL_bldr, down0());
			MCIndexKey idxkey = judgDL.createIndex(MST_INSP_JUDG_D_R.$fix_no, MST_INSP_JUDG_D_R.$fix_no_typ);
			for (Srch01_DtlR dtlR : down1()) {
				MST_INSP_JUDG_D_R judgDR = judgDL.getFirst(idxkey, dtlR.fix_no(), dtlR.fix_no_typ());
				if (!isNull(judgDR)) {
					dtlR.ac_dt(judgDR.ac_dt());
				}
			}
		}

		/**
		 * 全数検査で着手のみ実施した場合は検査実績明細が存在しないため、
		 * 取消時に使用する取消計上日を検査着手明細から取得する。
		 */
		protected void editTtlCanAcDtWithSttD() {
			// 取消モード以外の場合は処理不要
			if (!isSame(up0().ope(), "3")) {
				return;
			};
			
			MCList<MST_INSP_STT_D_R> sttDL = MCList.create(MST_INSP_STT_D_R.class);
			MST_INSP_STT_D_R t = MST_INSP_STT_D_R.create("T");
			MCQueryApiBuilder sttDL_bidr = MCQueryApiBuilder.create(t);
			sttDL_bidr.setSelect(t.insp_act_no, t.fix_no_typ, t.fix_no, t.ac_dt);
			sttDL_bidr.setWhere(t.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL_0070_MST_INSP_STT_D_S01", sttDL, sttDL_bidr, down0());
			MCIndexKey idxkey = sttDL.createIndex(MST_INSP_STT_D_R.$fix_no, MST_INSP_STT_D_R.$fix_no_typ);
			for (Srch01_DtlR dtlR : down1()) {
				MST_INSP_STT_D_R sttDR = sttDL.getFirst(idxkey, dtlR.fix_no(), dtlR.fix_no_typ());
				if (!isNull(sttDR)) {
					dtlR.insp_act_no(sttDR.insp_act_no());
					dtlR.can_ac_dt(sttDR.ac_dt());
				}
			}
		}

		protected MCList<Srch01_DtlR> getStkL(boolean exceptWaitJudgFlg) {
			MCList<MST_INSP_SCHD_R> schdL = getInspSchd();
			// 検査中ロット使用許可FLGはオンの場合、現状在庫情報を取得しない
			if (!MAC_INSP_MTD_TYP.isTTL(down0().insp_mtd_typ()) && !schdL.isEmpty() && schdL.get(0).in_prmt_insp_flg()) {
				return MCList.create(Srch01_DtlR.class);
			}
			MCList<MST_STK_R> stkL = MCList.create(MST_STK_R.class);
			MST_STK_R t = MST_STK_R.create("T");
			MCQueryApiBuilder stkL_bldr = MCQueryApiBuilder.create(t);
			MSVT_WRK_SNO_R t2 = MSVT_WRK_SNO_R.create("T2");
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MAM_STR_LN_R m2 = MAM_STR_LN_R.create("M2");
			MAM_BP_R m3 = MAM_BP_R.create("M3");
			MAM_STK_GD_R m4 = MAM_STK_GD_R.create("M4");
			MAM_BP_R m5 = MAM_BP_R.create("M5");
			MAM_UNIT_R m6 = MAM_UNIT_R.create("M6");
			MAVM_ITM_UNIT_R m7 = MAVM_ITM_UNIT_R.create("M7");
			stkL_bldr.addSelect(m1.wg_cd);
			stkL_bldr.addSelect(m1.loc_nm);
			stkL_bldr.addSelect(m1.str_ln_tgt_flg);
			stkL_bldr.addSelect(m2.str_ln_nm);
			stkL_bldr.addSelect(m3.bp_nm.as("stk_arrv_bp_nm"));
			stkL_bldr.addSelect(m4.gd_nm);
			stkL_bldr.addSelect(m5.bp_nm.as("stk_bp_nm"));
			stkL_bldr.addSelect(t2.wrk_no);
			stkL_bldr.addSelect(m6.unit_nm.as("stk_pack_unit_nm"));
			stkL_bldr.addSelect(m7.dec_place.as("stk_pack_unit_dec_place"));
			stkL_bldr.addSelect(m7.conv_base_qty.as("stk_pack_unit_dmn_qty"));
			stkL_bldr.addSelect(m7.conv_qty.as("stk_pack_unit_conv_qty"));
			stkL_bldr.addSelect(m7.rnd_typ.as("stk_pack_unit_rnd_typ"));
			stkL_bldr.addLeftOuterJoin(t2, bracket(t.sno1.eq(t2.sno1)));
			stkL_bldr.addLeftOuterJoin(m1, bracket(t.loc_cd.eq(m1.loc_cd)));
			stkL_bldr.addLeftOuterJoin(m2, bracket(t.loc_cd.eq(m2.loc_cd)
					.and(t.str_ln_cd.eq(m2.str_ln_cd))));
			stkL_bldr.addLeftOuterJoin(m3, bracket(t.stk_arrv_bp_cd.eq(m3.bp_cd)));
			stkL_bldr.addLeftOuterJoin(m4, bracket(t.gd_cd.eq(m4.gd_cd)));
			stkL_bldr.addLeftOuterJoin(m5, bracket(t.stk_bp_cd.eq(m5.bp_cd)));
			stkL_bldr.addLeftOuterJoin(m6, bracket(t.pack_unit_cd.eq(m6.unit_cd)));
			stkL_bldr.addLeftOuterJoin(m7, bracket(t.itm_cd.eq(m7.itm_cd)
					.and(t.itm_sub1.eq(m7.itm_sub1))
					.and(t.itm_sub2.eq(m7.itm_sub2))
					.and(t.itm_sub3.eq(m7.itm_sub3))
					.and(t.pack_unit_cd.eq(m7.unit_cd))));
			stkL_bldr.setWhere(t.fix_no_typ.eq(bind("fix_no_typ")));
			stkL_bldr.addWhereWithAnd(t.fix_no.eq(bind("fix_no")));
			if (exceptWaitJudgFlg) {
				stkL_bldr.addWhereWithAnd(t.stk_insp_typ.neq(value(MSC_STK_INSP_TYP.WAIT_JUDG.value())));
			}
			if (MSC_INSP_TYP.isACCPT(down0().insp_typ()) && MAC_INSP_MTD_TYP.isTTL(down0().insp_mtd_typ())) {
				stkL_bldr.addWhereWithAnd(t.stk_insp_typ.neq(value(MSC_STK_INSP_TYP.FIN.value())));
			}
			stkL_bldr.addOrderByAsc(t.loc_cd, t.str_ln_cd, t.stk_arrv_bp_cd,
					t.quality_typ, t.gd_cd, t.stk_insp_typ, t.stk_id_typ);

			dbSelect("MSBFL0070_MST_STK_S01", stkL, stkL_bldr, schdL);
			
			setRemQty(stkL);
			
			MCList<Srch01_DtlR> dtlL = MCList.create(Srch01_DtlR.class);
			setDtlL(dtlL, stkL);
			
			return dtlL;
		}
		
		protected void setRemQty(MCList<MST_STK_R> stkL) {
			if (!stkL.isEmpty()) {
				down0().rem_base_unit_qty(stkL.sum(MST_STK_R.$base_unit_qty));
			}
			else {
				down0().rem_base_unit_qty(MCNumber.ZERO);
			}
		}
		
		protected void setDtlL(MCList<Srch01_DtlR> dtlL, MCList<MST_STK_R> stkL) {
			for (MST_STK_R stkR : stkL) {
				Srch01_DtlR dtlR = Srch01_DtlR.create();
				
				dtlR.itm_cd(stkR.itm_cd());
				dtlR.itm_sub1(stkR.itm_sub1());
				dtlR.itm_sub1(stkR.itm_sub2());
				dtlR.itm_sub3(stkR.itm_sub3());
				dtlR.wg_cd(stkR.getStringNE(Srch01_DtlR.$wg_cd));
				dtlR.loc_cd(stkR.loc_cd());
				dtlR.loc_nm(stkR.getStringNE(Srch01_DtlR.$loc_nm));
				dtlR.str_ln_tgt_flg(isSame(stkR.getStringNE(Srch01_DtlR.$str_ln_tgt_flg), "1"));
				dtlR.str_ln_cd(stkR.str_ln_cd());
				dtlR.str_ln_nm(stkR.getStringNE(Srch01_DtlR.$str_ln_nm));
				dtlR.stk_arrv_bp_cd(stkR.stk_arrv_bp_cd());
				dtlR.stk_arrv_bp_nm(stkR.getStringNE(Srch01_DtlR.$stk_arrv_bp_nm));
				dtlR.gd_cd(stkR.gd_cd());
				dtlR.gd_nm(stkR.getStringNE(Srch01_DtlR.$gd_nm));
				dtlR.quality_typ(stkR.quality_typ());
				dtlR.stk_insp_typ(stkR.stk_insp_typ());
				dtlR.stk_id_typ(stkR.stk_id_typ());
				dtlR.stk_bp_cd(stkR.stk_bp_cd());
				dtlR.stk_bp_nm(stkR.getStringNE(Srch01_DtlR.$stk_bp_nm));
				dtlR.lot_no(stkR.lot_no());
				dtlR.sublot_no(stkR.sublot_no());
				dtlR.sno1(stkR.sno1());
				dtlR.sno2(stkR.sno2());
				dtlR.sno3(stkR.sno3());
				dtlR.sno4(stkR.sno4());
				dtlR.stk_pack_unit_qty(stkR.pack_unit_qty());
				dtlR.stk_pack_unit_cd(stkR.pack_unit_cd());
				dtlR.stk_pack_unit_nm(stkR.getStringNE(Srch01_DtlR.$stk_pack_unit_nm));
				dtlR.stk_pack_unit_dec_place(stkR.getNumberNE(Srch01_DtlR.$stk_pack_unit_dec_place));
				dtlR.stk_pack_unit_dmn_qty(stkR.getNumberNE(Srch01_DtlR.$stk_pack_unit_dmn_qty));
				dtlR.stk_pack_unit_conv_qty(stkR.getNumberNE(Srch01_DtlR.$stk_pack_unit_conv_qty));
				dtlR.stk_pack_unit_rnd_typ(stkR.getStringNE(Srch01_DtlR.$stk_pack_unit_rnd_typ));
				dtlR.stk_base_unit_qty(stkR.base_unit_qty());
				dtlR.stk_base_unit_cd(down0().base_unit_cd());
				dtlR.stk_base_unit_nm(down0().base_unit_nm());
				dtlR.stk_base_unit_dec_place(down0().base_unit_dec_place());
				dtlR.stk_base_unit_rnd_typ(down0().base_unit_rnd_typ());
				dtlR.fix_no_typ(stkR.fix_no_typ());
				dtlR.fix_no(stkR.fix_no());
				if (MAC_INSP_MTD_TYP.isTTL(down0().insp_mtd_typ())) {
					dtlR.pack_unit_qty(null);
					dtlR.base_unit_qty(null);
				}
				else {
					dtlR.pack_unit_qty(stkR.pack_unit_qty());
					dtlR.base_unit_qty(stkR.base_unit_qty());
				}
				dtlR.pack_unit_cd(stkR.pack_unit_cd());
				dtlR.pack_unit_nm(stkR.getStringNE(Srch01_DtlR.$stk_pack_unit_nm));
				dtlR.pack_unit_dec_place(stkR.getNumberNE(Srch01_DtlR.$stk_pack_unit_dec_place));
				dtlR.pack_unit_dmn_qty(stkR.getNumberNE(Srch01_DtlR.$stk_pack_unit_dmn_qty));
				dtlR.pack_unit_conv_qty(stkR.getNumberNE(Srch01_DtlR.$stk_pack_unit_conv_qty));
				dtlR.pack_unit_rnd_typ(stkR.getStringNE(Srch01_DtlR.$stk_pack_unit_rnd_typ));
				dtlR.base_unit_cd(down0().base_unit_cd());
				dtlR.base_unit_nm(down0().base_unit_nm());
				dtlR.base_unit_dec_place(down0().base_unit_dec_place());
				dtlR.base_unit_rnd_typ(down0().base_unit_rnd_typ());
				dtlR.pack_xfr_pack_unit_qty(null);
				dtlR.pack_xfr_pack_unit_cd(stkR.pack_unit_cd());
				dtlR.pack_xfr_pack_unit_nm(stkR.getStringNE(Srch01_DtlR.$stk_pack_unit_nm));
				dtlR.pack_xfr_pack_unit_dec_place(stkR.getNumberNE(Srch01_DtlR.$stk_pack_unit_dec_place));
				dtlR.pack_xfr_pack_unit_dmn_qty(stkR.getNumberNE(Srch01_DtlR.$stk_pack_unit_dmn_qty));
				dtlR.pack_xfr_pack_unit_conv_qty(stkR.getNumberNE(Srch01_DtlR.$stk_pack_unit_conv_qty));
				dtlR.pack_xfr_pack_unit_rnd_typ(stkR.getStringNE(Srch01_DtlR.$stk_pack_unit_rnd_typ));
				dtlR.pack_xfr_base_unit_qty(null);
				dtlR.pack_xfr_base_unit_cd(down0().base_unit_cd());
				dtlR.pack_xfr_base_unit_nm(down0().base_unit_nm());
				dtlR.pack_xfr_base_unit_dec_place(down0().base_unit_dec_place());
				dtlR.pack_xfr_base_unit_rnd_typ(down0().base_unit_rnd_typ());
				
				dtlL.add(dtlR);
			}
		}
		
		protected void srchSmpl() {
			if (MSC_INSP_TYP.isPRCD(down0().insp_typ())
					|| MAC_INSP_MTD_TYP.isTTL(down0().insp_mtd_typ())) {
				return;
			}
			
			MCList<MST_INSP_SMPL_ACT_R> smplL = getSmplL();
			if (!smplL.isEmpty()) {
				setSmplL(smplL);
			}
			else {
				if (down1().isEmpty()) {
					setInspSchd(down0().lmt_up_flg());
				}
			}
			if (!down2().isEmpty()) {
				down2().setValueNE(Srch01_SmplR.$insp_no, down0().insp_no());
			}
		}
		
		protected MCList<MST_INSP_SMPL_ACT_R> getSmplL() {
			MCList<MST_INSP_SMPL_ACT_R> smplL = MCList.create(MST_INSP_SMPL_ACT_R.class);
			MST_INSP_SMPL_ACT_R t = MST_INSP_SMPL_ACT_R.create("T");
			MCQueryApiBuilder smplL_bldr = MCQueryApiBuilder.create(t);
			MSVT_WRK_SNO_R t2 = MSVT_WRK_SNO_R.create("T2");
			MAM_UNIT_R m1 = MAM_UNIT_R.create("M1");
			MAM_UNIT_R m2 = MAM_UNIT_R.create("M2");
			MAM_UNIT_R m3 = MAM_UNIT_R.create("M3");
			MAM_LOC_R m4 = MAM_LOC_R.create("M4");
			MAM_STR_LN_R m5 = MAM_STR_LN_R.create("M5");
			MAM_BP_R m6 = MAM_BP_R.create("M6");
			MAM_STK_GD_R m7 = MAM_STK_GD_R.create("M7");
			MAM_BP_R m8 = MAM_BP_R.create("M8");
			MAM_DPT_R m9 = MAM_DPT_R.create("M9");
			MAVM_ITM_UNIT_R m10 = MAVM_ITM_UNIT_R.create("M10");
			MAM_ITM_R m11 = MAM_ITM_R.create("M11");
			MAM_EXT_SYS_R m12 = MAM_EXT_SYS_R.create("EXT");

			smplL_bldr.setWhere(t.insp_act_no.eq(bind("1")), down0().insp_act_no());
			smplL_bldr.addSelect(m1.unit_nm.as("base_unit_nm"));
			smplL_bldr.addSelect(m11.dec_place.as("base_unit_dec_place"));
			smplL_bldr.addSelect(m11.rnd_typ.as("base_unit_rnd_typ"));
			smplL_bldr.addSelect(m2.unit_nm.as("pack_xfr_pack_unit_nm"));
			smplL_bldr.addSelect(m10.dec_place.as("pack_xfr_pack_unit_dec_place"));
			smplL_bldr.addSelect(m10.rnd_typ.as("pack_xfr_pack_unit_rnd_typ"));
			smplL_bldr.addSelect(m10.conv_base_qty.as("pack_xfr_pack_unit_dmn_qty"));
			smplL_bldr.addSelect(m10.conv_qty.as("pack_xfr_pack_unit_conv_qty"));
			smplL_bldr.addSelect(m3.unit_nm.as("pack_xfr_base_unit_nm"));
			smplL_bldr.addSelect(m11.dec_place.as("pack_xfr_base_unit_dec_place"));
			smplL_bldr.addSelect(m11.rnd_typ.as("pack_xfr_base_unit_rnd_typ"));
			smplL_bldr.addSelect(m4.wg_cd);
			smplL_bldr.addSelect(m4.loc_nm);
			smplL_bldr.addSelect(m4.str_ln_tgt_flg);
			smplL_bldr.addSelect(m5.str_ln_nm);
			smplL_bldr.addSelect(m6.bp_nm.as("stk_arrv_bp_nm"));
			smplL_bldr.addSelect(m7.gd_nm);
			smplL_bldr.addSelect(m8.bp_nm.as("stk_bp_nm"));
			smplL_bldr.addSelect(m9.dpt_nm.as("bd_dpt_nm"));
			smplL_bldr.addSelect(t2.wrk_no);
			smplL_bldr.addSelect(t2.wrk_nm);
			smplL_bldr.addSelect(m12.ext_sys_nm);
			smplL_bldr.addLeftOuterJoin(t2, bracket(t.sno1.eq(t2.sno1)));
			smplL_bldr.addLeftOuterJoin(m1, bracket(t.base_unit_cd.eq(m1.unit_cd)));
			smplL_bldr.addLeftOuterJoin(m2, bracket(t.pack_xfr_pack_unit_cd.eq(m2.unit_cd)));
			smplL_bldr.addLeftOuterJoin(m3, bracket(t.pack_xfr_base_unit_cd.eq(m3.unit_cd)));
			smplL_bldr.addLeftOuterJoin(m4, bracket(t.loc_cd.eq(m4.loc_cd)));
			smplL_bldr.addLeftOuterJoin(m5, bracket(t.loc_cd.eq(m5.loc_cd)
							.and(t.str_ln_cd.eq(m5.str_ln_cd))));
			smplL_bldr.addLeftOuterJoin(m6, bracket(t.stk_arrv_bp_cd.eq(m6.bp_cd)));
			smplL_bldr.addLeftOuterJoin(m7, bracket(t.gd_cd.eq(m7.gd_cd)));
			smplL_bldr.addLeftOuterJoin(m8, bracket(t.stk_bp_cd.eq(m8.bp_cd)));
			smplL_bldr.addLeftOuterJoin(m9, bracket(t.bd_dpt_cd.eq(m9.dpt_cd)
							.and(trunc(t.act_tm, MCDateFmt.DD).between(m9.st_dt, m9.end_dt))));
			smplL_bldr.addLeftOuterJoin(m10, bracket(t.itm_cd.eq(m10.itm_cd)
							.and(t.itm_sub1.eq(m10.itm_sub1))
							.and(t.itm_sub2.eq(m10.itm_sub2))
							.and(t.itm_sub3.eq(m10.itm_sub3))
							.and(t.pack_xfr_pack_unit_cd.eq(m10.unit_cd))));
			smplL_bldr.addLeftOuterJoin(m11, bracket(t.itm_cd.eq(m11.itm_cd)
							.and(t.itm_sub1.eq(m11.itm_sub1))
							.and(t.itm_sub2.eq(m11.itm_sub2))
							.and(t.itm_sub3.eq(m11.itm_sub3))));
			smplL_bldr.addOrderByAsc(t.ac_dt, t.loc_cd, t.str_ln_cd, t.stk_arrv_bp_cd,
					t.quality_typ, t.gd_cd, t.stk_insp_typ, t.stk_id_typ);
			smplL_bldr.addLeftOuterJoin(m12, bracket(t.ext_sys_cd.eq(m12.ext_sys_cd)));
			dbSelect("MSBFL0070_MST_INSP_SMPL_ACT_S01", smplL, smplL_bldr);

			return smplL;
		}
		
		protected void setSmplL(MCList<MST_INSP_SMPL_ACT_R> smplL) {
			for (MST_INSP_SMPL_ACT_R smplR : smplL) {
				Srch01_SmplR downR = Srch01_SmplR.create();
				
				downR.itm_cd(smplR.itm_cd());
				downR.itm_sub1(smplR.itm_sub1());
				downR.itm_sub2(smplR.itm_sub2());
				downR.itm_sub3(smplR.itm_sub3());
				downR.so_qty(smplR.so_qty());
				downR.smpl_qty(smplR.smpl_qty());
				downR.base_unit_cd(smplR.base_unit_cd());
				downR.base_unit_nm(smplR.getStringNE(Srch01_SmplR.$base_unit_nm));
				downR.base_unit_dec_place(smplR.getNumberNE(Srch01_SmplR.$base_unit_dec_place));
				downR.base_unit_rnd_typ(smplR.getStringNE(Srch01_SmplR.$base_unit_rnd_typ));
				downR.pack_xfr_pack_unit_qty(smplR.pack_xfr_pack_unit_qty());
				downR.pack_xfr_pack_unit_cd(smplR.pack_xfr_pack_unit_cd());
				downR.pack_xfr_pack_unit_nm(smplR.getStringNE(Srch01_SmplR.$pack_xfr_pack_unit_nm));
				downR.pack_xfr_pack_unit_dec_place(smplR.getNumberNE(Srch01_SmplR.$pack_xfr_pack_unit_dec_place));
				downR.pack_xfr_pack_unit_rnd_typ(smplR.getStringNE(Srch01_SmplR.$pack_xfr_pack_unit_rnd_typ));
				downR.pack_xfr_pack_unit_dmn_qty(smplR.getNumberNE(Srch01_SmplR.$pack_xfr_pack_unit_dmn_qty));
				downR.pack_xfr_pack_unit_conv_qty(smplR.getNumberNE(Srch01_SmplR.$pack_xfr_pack_unit_conv_qty));
				downR.pack_xfr_base_unit_qty(smplR.pack_xfr_base_unit_qty());
				downR.pack_xfr_base_unit_cd(smplR.pack_xfr_base_unit_cd());
				downR.pack_xfr_base_unit_nm(smplR.getStringNE(Srch01_SmplR.$pack_xfr_base_unit_nm));
				downR.pack_xfr_base_unit_dec_place(smplR.getNumberNE(Srch01_SmplR.$pack_xfr_base_unit_dec_place));
				downR.pack_xfr_base_unit_rnd_typ(smplR.getStringNE(Srch01_SmplR.$pack_xfr_base_unit_rnd_typ));
				downR.so_cmpl_flg(smplR.so_cmpl_flg());
				downR.wg_cd(smplR.getStringNE(Srch01_SmplR.$wg_cd));
				downR.loc_cd(smplR.loc_cd());
				downR.loc_nm(smplR.getStringNE(Srch01_SmplR.$loc_nm));
				downR.str_ln_tgt_flg(isSame(smplR.getString(Srch01_SmplR.$str_ln_tgt_flg), "1"));
				downR.str_ln_cd(smplR.str_ln_cd());
				downR.str_ln_nm(smplR.getStringNE(Srch01_SmplR.$str_ln_nm));
				downR.stk_arrv_bp_cd(smplR.stk_arrv_bp_cd());
				downR.stk_arrv_bp_nm(smplR.getStringNE(Srch01_SmplR.$stk_arrv_bp_nm));
				downR.gd_cd(smplR.gd_cd());
				downR.gd_nm(smplR.getStringNE(Srch01_SmplR.$gd_nm));
				downR.quality_typ(smplR.quality_typ());
				downR.stk_insp_typ(smplR.stk_insp_typ());
				downR.stk_id_typ(smplR.stk_id_typ());
				downR.stk_bp_cd(smplR.stk_bp_cd());
				downR.stk_bp_nm(smplR.getStringNE(Srch01_SmplR.$stk_bp_nm));
				downR.lot_no(smplR.lot_no());
				downR.sublot_no(smplR.sublot_no());
				downR.sno1(smplR.sno1());
				downR.sno2(smplR.sno2());
				downR.sno3(smplR.sno3());
				downR.sno4(smplR.sno4());
				downR.fix_no_typ(smplR.fix_no_typ());
				downR.fix_no(smplR.fix_no());
				downR.act_dt(smplR.act_tm().trunc(MCDateFieldType.DAY));
				downR.act_hm(smplR.act_tm());
				downR.ac_dt(smplR.ac_dt());
				downR.bd_dpt_cd(smplR.bd_dpt_cd());
				downR.bd_dpt_nm(smplR.getStringNE(Srch01_SmplR.$bd_dpt_nm));
				downR.insp_smpl_act_no(smplR.insp_smpl_act_no());
				downR.insp_schd_no(smplR.insp_schd_no());
				downR.insp_act_no(smplR.insp_act_no());
				downR.trd_rmrks(smplR.trd_rmrks());
				downR.intr_rmrks(smplR.intr_rmrks());
				downR.sub_char1(smplR.sub_char1());
				downR.sub_char2(smplR.sub_char2());
				downR.sub_char3(smplR.sub_char3());
				downR.lims_flg(smplR.lims_flg());
				downR.ext_sys_cd(smplR.ext_sys_cd());
				downR.ext_sys_nm(smplR.getStringNE(Srch01_SmplR.$ext_sys_nm));
				downR.ext_insp_smpl_act_no(smplR.ext_insp_smpl_act_no());
				
				down2().add(downR);
			}
		}
		
		protected void setInspSchd(boolean lmtUpFlg) {
			MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			MSVT_WRK_SNO_R t2 = MSVT_WRK_SNO_R.create("T2");
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MAM_STR_LN_R m2 = MAM_STR_LN_R.create("M2");
			MAM_BP_R m3 = MAM_BP_R.create("M3");
			MAM_STK_GD_R m4 = MAM_STK_GD_R.create("M4");
			MAM_BP_R m5 = MAM_BP_R.create("M5");
			MAM_UNIT_R m6 = MAM_UNIT_R.create("M6");
			MAM_UNIT_R m7 = MAM_UNIT_R.create("M7");
			MAVM_ITM_UNIT_R m8 = MAVM_ITM_UNIT_R.create("M8");
			MAM_ITM_R m9 = MAM_ITM_R.create("M9");
			schdL_bldr.addSelect(m1.loc_nm);
			schdL_bldr.addSelect(m1.wg_cd);
			schdL_bldr.addSelect(m1.str_ln_tgt_flg);
			schdL_bldr.addSelect(m2.str_ln_nm);
			schdL_bldr.addSelect(m3.bp_nm.as("stk_arrv_bp_nm"));
			schdL_bldr.addSelect(m4.gd_nm);
			schdL_bldr.addSelect(m5.bp_nm.as("stk_bp_nm"));
			schdL_bldr.addSelect(t2.wrk_no);
			schdL_bldr.addSelect(t2.wrk_nm);
			schdL_bldr.addSelect(m6.unit_nm.as("base_unit_nm"));
			schdL_bldr.addSelect(m9.dec_place.as("base_unit_dec_place"));
			schdL_bldr.addSelect(m9.rnd_typ.as("base_unit_rnd_typ"));
			schdL_bldr.addSelect(m7.unit_nm.as("pack_xfr_pack_unit_nm"));
			schdL_bldr.addSelect(m8.dec_place.as("pack_xfr_pack_unit_dec_place"));
			schdL_bldr.addSelect(m8.rnd_typ.as("pack_xfr_pack_unit_rnd_typ"));
			schdL_bldr.addSelect(m8.conv_base_qty.as("pack_xfr_pack_unit_dmn_qty"));
			schdL_bldr.addSelect(m8.conv_qty.as("pack_xfr_pack_unit_conv_qty"));
			schdL_bldr.addLeftOuterJoin(t2, bracket(t.sno1.eq(t2.sno1)));
			schdL_bldr.addLeftOuterJoin(m1, bracket(t.loc_cd.eq(m1.loc_cd)));
			schdL_bldr.addLeftOuterJoin(m2, bracket(t.loc_cd.eq(m2.loc_cd)
					.and(t.str_ln_cd.eq(m2.str_ln_cd))));
			schdL_bldr.addLeftOuterJoin(m3, bracket(t.stk_arrv_bp_cd.eq(m3.bp_cd)));
			schdL_bldr.addLeftOuterJoin(m4, bracket(t.gd_cd.eq(m4.gd_cd)));
			schdL_bldr.addLeftOuterJoin(m5, bracket(t.stk_bp_cd.eq(m5.bp_cd)));
			schdL_bldr.addLeftOuterJoin(m6, bracket(t.base_unit_cd.eq(m6.unit_cd)));
			schdL_bldr.addLeftOuterJoin(m7, bracket(t.pack_unit_cd.eq(m7.unit_cd)));
			schdL_bldr.addLeftOuterJoin(m8, bracket(t.itm_cd.eq(m8.itm_cd)
					.and(t.itm_sub1.eq(m8.itm_sub1))
					.and(t.itm_sub2.eq(m8.itm_sub2))
					.and(t.itm_sub3.eq(m8.itm_sub3))
					.and(t.pack_unit_cd.eq(m8.unit_cd))));
			schdL_bldr.addLeftOuterJoin(m9, bracket(t.itm_cd.eq(m9.itm_cd)
					.and(t.itm_sub1.eq(m9.itm_sub1))
					.and(t.itm_sub2.eq(m9.itm_sub2))
					.and(t.itm_sub3.eq(m9.itm_sub3))));
			schdL_bldr.setWhere(t.insp_no.eq(bind("1")), down0().insp_no());
			schdL_bldr.addOrderByAsc(t.loc_cd, t.str_ln_cd, t.stk_arrv_bp_cd,
					t.quality_typ, t.gd_cd, t.stk_insp_typ, t.stk_id_typ);
			dbSelect("MSBFL0070_MST_INSP_SCHD_S02", schdL, schdL_bldr);
			
			for (MST_INSP_SCHD_R schdR : schdL) {
				Srch01_SmplR downR = Srch01_SmplR.create();
				
				downR.itm_cd(schdR.itm_cd());
				downR.itm_sub1(schdR.itm_sub1());
				downR.itm_sub2(schdR.itm_sub2());
				downR.itm_sub3(schdR.itm_sub3());
				downR.so_qty(null);
				downR.smpl_qty(null);
				downR.base_unit_cd(schdR.base_unit_cd());
				downR.base_unit_nm(schdR.getStringNE(Srch01_SmplR.$base_unit_nm));
				downR.base_unit_dec_place(schdR.getNumberNE(Srch01_SmplR.$base_unit_dec_place));
				downR.base_unit_rnd_typ(schdR.getStringNE(Srch01_SmplR.$base_unit_rnd_typ));
				downR.pack_xfr_pack_unit_qty(null);
				downR.pack_xfr_pack_unit_cd(schdR.pack_unit_cd());
				downR.pack_xfr_pack_unit_nm(schdR.getStringNE(Srch01_SmplR.$pack_xfr_pack_unit_nm));
				downR.pack_xfr_pack_unit_dec_place(schdR.getNumberNE(Srch01_SmplR.$pack_xfr_pack_unit_dec_place));
				downR.pack_xfr_pack_unit_rnd_typ(schdR.getStringNE(Srch01_SmplR.$pack_xfr_pack_unit_rnd_typ));
				downR.pack_xfr_pack_unit_dmn_qty(schdR.getNumberNE(Srch01_SmplR.$pack_xfr_pack_unit_dmn_qty));
				downR.pack_xfr_pack_unit_conv_qty(schdR.getNumberNE(Srch01_SmplR.$pack_xfr_pack_unit_conv_qty));
				downR.pack_xfr_base_unit_qty(null);
				downR.pack_xfr_base_unit_cd(schdR.base_unit_cd());
				downR.pack_xfr_base_unit_nm(schdR.getStringNE(Srch01_SmplR.$base_unit_nm));
				downR.pack_xfr_base_unit_dec_place(schdR.getNumberNE(Srch01_SmplR.$base_unit_dec_place));
				downR.pack_xfr_base_unit_rnd_typ(schdR.getStringNE(Srch01_SmplR.$base_unit_rnd_typ));
				downR.wg_cd(schdR.getStringNE(Srch01_SmplR.$wg_cd));
				downR.loc_cd(schdR.loc_cd());
				downR.loc_nm(schdR.getStringNE(Srch01_SmplR.$loc_nm));
				downR.str_ln_tgt_flg(isSame(schdR.getStringNE(Srch01_SmplR.$str_ln_tgt_flg), "1"));
				downR.str_ln_cd(schdR.str_ln_cd());
				downR.str_ln_nm(schdR.getStringNE(Srch01_SmplR.$str_ln_nm));
				downR.stk_arrv_bp_cd(schdR.stk_arrv_bp_cd());
				downR.stk_arrv_bp_nm(schdR.getStringNE(Srch01_SmplR.$stk_arrv_bp_nm));
				downR.gd_cd(schdR.gd_cd());
				downR.gd_nm(schdR.getStringNE(Srch01_SmplR.$gd_nm));
				downR.quality_typ(schdR.quality_typ());
				downR.stk_insp_typ(schdR.stk_insp_typ());
				downR.stk_id_typ(schdR.stk_id_typ());
				downR.stk_bp_cd(schdR.stk_bp_cd());
				downR.stk_bp_nm(schdR.getStringNE(Srch01_SmplR.$stk_bp_nm));
				downR.lot_no(schdR.lot_no());
				downR.sublot_no(schdR.sublot_no());
				downR.sno1(schdR.sno1());
				downR.sno2(schdR.sno2());
				downR.sno3(schdR.sno3());
				downR.sno4(schdR.sno4());
				downR.act_dt(null);
				downR.act_hm(null);
				downR.ac_dt(null);
				downR.bd_dpt_cd(null);
				downR.bd_dpt_nm(null);
				downR.insp_smpl_act_no(null);
				downR.insp_schd_no(schdR.insp_schd_no());
				downR.insp_act_no(null);
				downR.trd_rmrks(null);
				downR.intr_rmrks(null);
				downR.sub_char1(null);
				downR.sub_char2(null);
				downR.sub_char3(null);
				downR.lims_flg(false);
				downR.ext_sys_cd(null);
				downR.ext_sys_nm(null);
				downR.ext_insp_smpl_act_no(null);
				
				if (MSC_INSP_TYP.isACCPT(schdR.insp_typ())) {
					// 受入検査の場合、検査予定の在庫識別区分は仕入検収前で固定だが、
					// 抜取実績前までに仕入実績を計上された場合を考慮し、自社在庫で固定とする。
					if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(schdR.stk_id_typ())) {
						downR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
						downR.stk_bp_cd(MAC_STR.NULL_VAL.value());
					}
					if (schdR.in_prmt_insp_flg()) {
						downR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
						downR.fix_no(MAC_STR.NULL_VAL.value());
						downR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
					}
					else {
						downR.fix_no_typ(MSC_FIX_NO_TYP.ARR_ACT_NO.value());
						downR.fix_no(schdR.src_no4());
					}
				}
				else if (MSC_INSP_TYP.isPRDCT(schdR.insp_typ())) {
					if (schdR.in_prmt_insp_flg()) {
						downR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
						downR.fix_no(MAC_STR.NULL_VAL.value());
						downR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
					}
					else {
						downR.fix_no_typ(MSC_FIX_NO_TYP.YIELD_ACT_NO.value());
						downR.fix_no(schdR.src_no4());
					}
				}
				else if (MSC_INSP_TYP.isLOT(schdR.insp_typ())) {
					if (lmtUpFlg) {
						downR.fix_no_typ(MSC_FIX_NO_TYP.NON.value());
						downR.fix_no(MAC_STR.NULL_VAL.value());
						downR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
					}
					else {
						downR.fix_no_typ(MSC_FIX_NO_TYP.INSP_SCHD_NO.value());
						downR.fix_no(schdR.insp_schd_no());
					}
				}
				
				down2().add(downR);
			}
		}
	}
	
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 画面で起算日を変更した場合に、有効期限、使用期限を取得する<br>
	 */
	public class Srch02 extends MSBFL_InspActReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			
			callLotSrv();
			
			setDown();
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			MCList<Srch02_CndR> up0L = MCList.create(Srch02_CndR.class);
			up0L.add(up0());
			
			setPegNo(up0L);
		}
		
		protected void callLotSrv() {
			MCList<Srch02_CndR> up0L = MCList.create(Srch02_CndR.class);
			up0L.add(up0());
			
			MSBFL_LotService.Lot_Srch02 o = MSBFL_LotService.crtLot_Srch02();
			addAll(o.up0(), up0L, createMap_Lot_Srch02_CndR_Srch02_CndR());
			o.exec();
			
			String[] destCols = new String[] {Srch02_CndR.$lmt_dt_frm, Srch02_CndR.$vld_dt, Srch02_CndR.$lmt_dt};
			String[] srcCols = new String[] {Lot_Srch02_RsltR.$lmt_dt_frm, Lot_Srch02_RsltR.$vld_dt, Lot_Srch02_RsltR.$lmt_dt};
			copyByPegNo(up0L, destCols, o.down0(), srcCols);
		}
		
		protected Map_Lot_Srch02_CndR_Srch02_CndR<Lot_Srch02_CndR, Srch02_CndR> createMap_Lot_Srch02_CndR_Srch02_CndR() {
			return new Map_Lot_Srch02_CndR_Srch02_CndR<Lot_Srch02_CndR, Srch02_CndR>();
		}
		
		public class Map_Lot_Srch02_CndR_Srch02_CndR<D extends Lot_Srch02_CndR, S extends Srch02_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Srch02_CndR.$peg_no, Srch02_CndR.$peg_no);
				addColumnPathMap(Lot_Srch02_CndR.$insp_no, Srch02_CndR.$insp_no);
				addColumnPathMap(Lot_Srch02_CndR.$lmt_dt_frm, Srch02_CndR.$lmt_dt_frm);
			}
		}
		
		protected void setDown() {
			Srch02_CndR.copyall(down0(), up0());
		}
	}
	
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 検査実績ヘッダを登録する前に、チェックを実行する<br>
	 */
	public class Chk01 extends MSBFL_InspActReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			if (!hasErr()) {
				callInspActChkSrv();
			}
			
			setDown();
		}
		
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査指図の更新カウンタチェック、補足
			msgL.addAll(chkInstUpdCnt());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			// 場所の更新権限のチェック
			msgL.addAll(dacChk());

			return msgL;
		}

		/**
		 * 更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkInstUpdCnt() {
			MCMessageList msgL = new MCMessageList();
			
			MST_INSP_INST_R selectR = MST_INSP_INST_R.create("T");
			dbSelectKeyForUpdateNoWait("MSBFL0070_MST_INSP_INST_S01", selectR,
					MCQueryApiBuilder.create(selectR), up0());

			msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$inst_upd_cntr, selectR));
			
			compData(selectR);
			
			return msgL;
		}
		
		/**
		 * 補完処理を行う。
		 */
		protected void compData(MST_INSP_INST_R instR) {
			if (!isNull(instR)) {
				MST_LOT_R lotR = MST_LOT_R.create("T");
				MCQueryApiBuilder lotR_bldr = MCQueryApiBuilder.create(lotR);
				lotR_bldr.setSelect(lotR.ver_no);
				dbSelectKey("MSBFL0070_MST_LOT_S01", lotR, lotR_bldr, instR);
				
				// ヘッダの補完
				up0().insp_freq(instR.insp_freq());
				up0().src_no1(instR.src_no1());
				up0().src_no2(instR.src_no2());
				up0().insp_typ(instR.insp_typ());
				up0().insp_mtd_typ(instR.insp_mtd_typ());
				up0().insp_sts_typ(instR.insp_sts_typ());
				up0().insp_aprv_sts_typ(instR.insp_aprv_sts_typ());
				up0().itm_cd(instR.itm_cd());
				up0().itm_sub1(instR.itm_sub1());
				up0().itm_sub2(instR.itm_sub2());
				up0().itm_sub3(instR.itm_sub3());
				up0().lot_no(instR.lot_no());
				up0().sublot_no(instR.sublot_no());
				up0().ver_no(lotR.ver_no());
				up0().sppl_cd(instR.sppl_cd());
				up0().maker_cd(instR.maker_cd());
				up0().mfg_loc_cd(instR.mfg_loc_cd());
				up0().from_site_cd(instR.from_site_cd());
				up0().base_unit_cd(instR.base_unit_cd());
			}
		}

		/**
		 * 場所の更新権限のチェックをします。
		 * 
		 * @return
		 */
		protected MCMessageList dacChk() {
			MCMessageList msgL = new MCMessageList();

			if (up0().err_flg()) {
				return msgL;
			}
			
			if (MSC_INSP_TYP.isPRDCT(up0().insp_typ())) {
				msgL.addAll(checkWritableLocCdDac(up0(), Chk01_HdrR.$mfg_loc_cd));
			}
			else {
				MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
				MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
				MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
				schdL_bldr.setWhere(t.insp_no.eq(bind("insp_no")), up0());
				dbSelect("MSBFL0070_MST_INSP_SCHD_S03", schdL, schdL_bldr);
				for (MST_INSP_SCHD_R schdR : schdL) {
					msgL.addAll(checkWritableLocCdDac(schdR, MST_INSP_SCHD_R.$loc_cd));
				}
				if (!schdL.isEmpty() && schdL.size() == msgL.size()) {
					up0().err_flg(true);
					return msgL;
				}
			}

			return msgL;
		}

		/**
		 * 検査実績サービスの登録前チェック処理を行う。
		 */
		protected void callInspActChkSrv() {
			MCList<Chk01_HdrR> up0L = MCList.create(Chk01_HdrR.class);
			up0L.add(up0());
			
			MSBFL_InspActService.InspAct_Chk01 o = mcframe.serverMSBF.MSBFL5050.MSBFL_InspActService.crtInspAct_Chk01();
			
			addAll(o.up0(), up0L, createMap_InspAct_Chk01_HdrR_Chk01_HdrR());
			addAll(o.up1(), up1(), createMap_InspAct_Chk01_DtlR_Chk01_DtlR());
			addAll(o.up2(), up2(), createMap_InspAct_Chk01_SmplR_Chk01_SmplR());
			
			o.exec();
			
			String[] dest0Cols = new String[] {Chk01_HdrR.$base_unit_qty, Chk01_HdrR.$err_flg};
			String[] src0Cols = new String[] {InspAct_Chk01_HdrR.$base_unit_qty, InspAct_Chk01_HdrR.$err_flg};
			copyByPegNo(up0L, dest0Cols, o.down0(), src0Cols);
			String[] dest1Cols = new String[] {Chk01_DtlR.$itm_cd, Chk01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub3, 
					Chk01_DtlR.$base_unit_cd, Chk01_DtlR.$pack_xfr_base_unit_cd, Chk01_DtlR.$lot_no, Chk01_DtlR.$sublot_no, Chk01_DtlR.$ac_dt,
					Chk01_DtlR.$sno1_mng_typ, Chk01_DtlR.$sno2_mng_typ, Chk01_DtlR.$sno3_mng_typ, Chk01_DtlR.$sno4_mng_typ, Chk01_DtlR.$err_flg};
			String[] src1Cols = new String[] {InspAct_Chk01_DtlR.$itm_cd, InspAct_Chk01_DtlR.$itm_sub1, InspAct_Chk01_DtlR.$itm_sub2, InspAct_Chk01_DtlR.$itm_sub3, 
					InspAct_Chk01_DtlR.$base_unit_cd, InspAct_Chk01_DtlR.$pack_xfr_base_unit_cd, InspAct_Chk01_DtlR.$lot_no, InspAct_Chk01_DtlR.$sublot_no, InspAct_Chk01_DtlR.$ac_dt, 
					InspAct_Chk01_DtlR.$sno1_mng_typ, InspAct_Chk01_DtlR.$sno2_mng_typ, InspAct_Chk01_DtlR.$sno3_mng_typ, InspAct_Chk01_DtlR.$sno4_mng_typ, InspAct_Chk01_DtlR.$err_flg};
			copyByPegNo(up1(), dest1Cols, o.down1(), src1Cols);
			String[] dest2Cols = new String[] {Chk01_SmplR.$itm_cd, Chk01_SmplR.$itm_sub1, Chk01_SmplR.$itm_sub2, Chk01_SmplR.$itm_sub3, 
					Chk01_SmplR.$base_unit_cd, Chk01_SmplR.$pack_xfr_base_unit_cd, Chk01_SmplR.$lot_no, Chk01_SmplR.$sublot_no,
					Chk01_SmplR.$sno1_mng_typ, Chk01_SmplR.$sno2_mng_typ, Chk01_SmplR.$sno3_mng_typ, Chk01_SmplR.$sno4_mng_typ, Chk01_SmplR.$str_ln_cd, Chk01_SmplR.$err_flg};
			String[] src2Cols = new String[] {InspAct_Chk01_SmplR.$itm_cd, InspAct_Chk01_SmplR.$itm_sub1, InspAct_Chk01_SmplR.$itm_sub2, InspAct_Chk01_SmplR.$itm_sub3,
					InspAct_Chk01_SmplR.$base_unit_cd, InspAct_Chk01_SmplR.$pack_xfr_base_unit_cd, InspAct_Chk01_SmplR.$lot_no, InspAct_Chk01_SmplR.$sublot_no, 
					InspAct_Chk01_SmplR.$sno1_mng_typ, InspAct_Chk01_SmplR.$sno2_mng_typ, InspAct_Chk01_SmplR.$sno3_mng_typ, InspAct_Chk01_SmplR.$sno4_mng_typ, InspAct_Chk01_SmplR.$str_ln_cd, InspAct_Chk01_SmplR.$err_flg};
			copyByPegNo(up2(), dest2Cols, o.down2(), src2Cols);
		}
		
		protected Map_InspAct_Chk01_HdrR_Chk01_HdrR<InspAct_Chk01_HdrR,Chk01_HdrR> createMap_InspAct_Chk01_HdrR_Chk01_HdrR() {
			return new Map_InspAct_Chk01_HdrR_Chk01_HdrR<InspAct_Chk01_HdrR, Chk01_HdrR>();
		}
		
		public class Map_InspAct_Chk01_HdrR_Chk01_HdrR<D extends InspAct_Chk01_HdrR, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk01_HdrR.$peg_no, Chk01_HdrR.$peg_no);
				addColumnPathMap(InspAct_Chk01_HdrR.$insp_no, Chk01_HdrR.$insp_no);
				addColumnPathMap(InspAct_Chk01_HdrR.$insp_act_no, Chk01_HdrR.$insp_act_no);
				addColumnPathMap(InspAct_Chk01_HdrR.$insp_freq, Chk01_HdrR.$insp_freq);
				addColumnPathMap(InspAct_Chk01_HdrR.$src_no1, Chk01_HdrR.$src_no1);
				addColumnPathMap(InspAct_Chk01_HdrR.$src_no2, Chk01_HdrR.$src_no2);
				addColumnPathMap(InspAct_Chk01_HdrR.$insp_typ, Chk01_HdrR.$insp_typ);
				addColumnPathMap(InspAct_Chk01_HdrR.$insp_mtd_typ, Chk01_HdrR.$insp_mtd_typ);
				addColumnPathMap(InspAct_Chk01_HdrR.$insp_sts_typ, Chk01_HdrR.$insp_sts_typ);
				addColumnPathMap(InspAct_Chk01_HdrR.$insp_aprv_sts_typ, Chk01_HdrR.$insp_aprv_sts_typ);
				addColumnPathMap(InspAct_Chk01_HdrR.$itm_cd, Chk01_HdrR.$itm_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$itm_sub1, Chk01_HdrR.$itm_sub1);
				addColumnPathMap(InspAct_Chk01_HdrR.$itm_sub2, Chk01_HdrR.$itm_sub2);
				addColumnPathMap(InspAct_Chk01_HdrR.$itm_sub3, Chk01_HdrR.$itm_sub3);
				addColumnPathMap(InspAct_Chk01_HdrR.$lot_no, Chk01_HdrR.$lot_no);
				addColumnPathMap(InspAct_Chk01_HdrR.$sublot_no, Chk01_HdrR.$sublot_no);
				addColumnPathMap(InspAct_Chk01_HdrR.$ver_no, Chk01_HdrR.$ver_no);
				addColumnPathMap(InspAct_Chk01_HdrR.$quality_typ, Chk01_HdrR.$quality_typ);
				addColumnPathMap(InspAct_Chk01_HdrR.$gd_cd, Chk01_HdrR.$gd_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$dfct_rsn_cd, Chk01_HdrR.$dfct_rsn_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$sppl_cd, Chk01_HdrR.$sppl_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$maker_cd, Chk01_HdrR.$maker_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$mfg_loc_cd, Chk01_HdrR.$mfg_loc_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$from_site_cd, Chk01_HdrR.$from_site_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$base_unit_qty, Chk01_HdrR.$base_unit_qty);
				addColumnPathMap(InspAct_Chk01_HdrR.$base_unit_cd, Chk01_HdrR.$base_unit_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$ttl_stk_qty, Chk01_HdrR.$ttl_stk_qty);
				addColumnPathMap(InspAct_Chk01_HdrR.$st_tm, Chk01_HdrR.$st_tm);
				addColumnPathMap(InspAct_Chk01_HdrR.$end_tm, Chk01_HdrR.$end_tm);
				addColumnPathMap(InspAct_Chk01_HdrR.$act_usr_cd, Chk01_HdrR.$act_usr_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$act_dpt_cd, Chk01_HdrR.$act_dpt_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$lmt_dt_frm_typ, Chk01_HdrR.$lmt_dt_frm_typ);
				addColumnPathMap(InspAct_Chk01_HdrR.$lmt_dt_frm, Chk01_HdrR.$lmt_dt_frm);
				addColumnPathMap(InspAct_Chk01_HdrR.$vld_dt, Chk01_HdrR.$vld_dt);
				addColumnPathMap(InspAct_Chk01_HdrR.$lmt_dt, Chk01_HdrR.$lmt_dt);
				addColumnPathMap(InspAct_Chk01_HdrR.$act_cont_fctr, Chk01_HdrR.$act_cont_fctr);
				addColumnPathMap(InspAct_Chk01_HdrR.$intr_rmrks, Chk01_HdrR.$intr_rmrks);
				addColumnPathMap(InspAct_Chk01_HdrR.$lot_rmrks, Chk01_HdrR.$lot_rmrks);
				addColumnPathMap(InspAct_Chk01_HdrR.$sub_char1, Chk01_HdrR.$sub_char1);
				addColumnPathMap(InspAct_Chk01_HdrR.$sub_char2, Chk01_HdrR.$sub_char2);
				addColumnPathMap(InspAct_Chk01_HdrR.$sub_char3, Chk01_HdrR.$sub_char3);
				addColumnPathMap(InspAct_Chk01_HdrR.$inst_upd_cntr, Chk01_HdrR.$inst_upd_cntr);
				addColumnPathMap(InspAct_Chk01_HdrR.$vld_dt_upd_flg, Chk01_HdrR.$vld_dt_upd_flg);
			}
		}
		
		protected Map_InspAct_Chk01_DtlR_Chk01_DtlR<InspAct_Chk01_DtlR,Chk01_DtlR> createMap_InspAct_Chk01_DtlR_Chk01_DtlR() {
			return new Map_InspAct_Chk01_DtlR_Chk01_DtlR<InspAct_Chk01_DtlR, Chk01_DtlR>();
		}
		
		public class Map_InspAct_Chk01_DtlR_Chk01_DtlR<D extends InspAct_Chk01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
				addColumnPathMap(InspAct_Chk01_DtlR.$insp_no, Chk01_DtlR.$insp_no);
				addColumnPathMap(InspAct_Chk01_DtlR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(InspAct_Chk01_DtlR.$insp_act_d_no, Chk01_DtlR.$insp_act_d_no);
				addColumnPathMap(InspAct_Chk01_DtlR.$insp_act_no, Chk01_DtlR.$insp_act_no);
				addColumnPathMap(InspAct_Chk01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
				addColumnPathMap(InspAct_Chk01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
				addColumnPathMap(InspAct_Chk01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
				addColumnPathMap(InspAct_Chk01_DtlR.$loc_cd, Chk01_DtlR.$loc_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$str_ln_cd, Chk01_DtlR.$str_ln_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$quality_typ, Chk01_DtlR.$quality_typ);
				addColumnPathMap(InspAct_Chk01_DtlR.$stk_insp_typ, Chk01_DtlR.$stk_insp_typ);
				addColumnPathMap(InspAct_Chk01_DtlR.$stk_id_typ, Chk01_DtlR.$stk_id_typ);
				addColumnPathMap(InspAct_Chk01_DtlR.$stk_bp_cd, Chk01_DtlR.$stk_bp_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$gd_cd, Chk01_DtlR.$gd_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$stk_arrv_bp_cd, Chk01_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$lot_no, Chk01_DtlR.$lot_no);
				addColumnPathMap(InspAct_Chk01_DtlR.$sublot_no, Chk01_DtlR.$sublot_no);
				addColumnPathMap(InspAct_Chk01_DtlR.$sno1, Chk01_DtlR.$sno1);
				addColumnPathMap(InspAct_Chk01_DtlR.$sno2, Chk01_DtlR.$sno2);
				addColumnPathMap(InspAct_Chk01_DtlR.$sno3, Chk01_DtlR.$sno3);
				addColumnPathMap(InspAct_Chk01_DtlR.$sno4, Chk01_DtlR.$sno4);
				addColumnPathMap(InspAct_Chk01_DtlR.$fix_no_typ, Chk01_DtlR.$fix_no_typ);
				addColumnPathMap(InspAct_Chk01_DtlR.$fix_no, Chk01_DtlR.$fix_no);
				addColumnPathMap(InspAct_Chk01_DtlR.$pack_unit_qty, Chk01_DtlR.$pack_unit_qty);
				addColumnPathMap(InspAct_Chk01_DtlR.$pack_unit_cd, Chk01_DtlR.$pack_unit_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
				addColumnPathMap(InspAct_Chk01_DtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$pack_xfr_pack_unit_qty, Chk01_DtlR.$pack_xfr_pack_unit_qty);
				addColumnPathMap(InspAct_Chk01_DtlR.$pack_xfr_pack_unit_cd, Chk01_DtlR.$pack_xfr_pack_unit_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$pack_xfr_base_unit_qty, Chk01_DtlR.$pack_xfr_base_unit_qty);
				addColumnPathMap(InspAct_Chk01_DtlR.$pack_xfr_base_unit_cd, Chk01_DtlR.$pack_xfr_base_unit_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$dfct_rsn_cd, Chk01_DtlR.$dfct_rsn_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$ac_dt, Chk01_DtlR.$ac_dt);
				addColumnPathMap(InspAct_Chk01_DtlR.$intr_rmrks, Chk01_DtlR.$intr_rmrks);
				addColumnPathMap(InspAct_Chk01_DtlR.$sub_char1, Chk01_DtlR.$sub_char1);
				addColumnPathMap(InspAct_Chk01_DtlR.$sub_char2, Chk01_DtlR.$sub_char2);
				addColumnPathMap(InspAct_Chk01_DtlR.$sub_char3, Chk01_DtlR.$sub_char3);
			}
		}
		
		protected Map_InspAct_Chk01_SmplR_Chk01_SmplR<InspAct_Chk01_SmplR,Chk01_SmplR> createMap_InspAct_Chk01_SmplR_Chk01_SmplR() {
			return new Map_InspAct_Chk01_SmplR_Chk01_SmplR<InspAct_Chk01_SmplR, Chk01_SmplR>();
		}
		
		public class Map_InspAct_Chk01_SmplR_Chk01_SmplR<D extends InspAct_Chk01_SmplR, S extends Chk01_SmplR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk01_SmplR.$peg_no, Chk01_SmplR.$peg_no);
				addColumnPathMap(InspAct_Chk01_SmplR.$insp_no, Chk01_SmplR.$insp_no);
				addColumnPathMap(InspAct_Chk01_SmplR.$data_crud_typ, Chk01_SmplR.$data_crud_typ);
				addColumnPathMap(InspAct_Chk01_SmplR.$insp_smpl_act_no, Chk01_SmplR.$insp_smpl_act_no);
				addColumnPathMap(InspAct_Chk01_SmplR.$insp_act_no, Chk01_SmplR.$insp_act_no);
				addColumnPathMap(InspAct_Chk01_SmplR.$insp_schd_no, Chk01_SmplR.$insp_schd_no);
				addColumnPathMap(InspAct_Chk01_SmplR.$itm_cd, Chk01_SmplR.$itm_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$itm_sub1, Chk01_SmplR.$itm_sub1);
				addColumnPathMap(InspAct_Chk01_SmplR.$itm_sub2, Chk01_SmplR.$itm_sub2);
				addColumnPathMap(InspAct_Chk01_SmplR.$itm_sub3, Chk01_SmplR.$itm_sub3);
				addColumnPathMap(InspAct_Chk01_SmplR.$so_qty, Chk01_SmplR.$so_qty);
				addColumnPathMap(InspAct_Chk01_SmplR.$smpl_qty, Chk01_SmplR.$smpl_qty);
				addColumnPathMap(InspAct_Chk01_SmplR.$base_unit_cd, Chk01_SmplR.$base_unit_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$pack_xfr_pack_unit_qty, Chk01_SmplR.$pack_xfr_pack_unit_qty);
				addColumnPathMap(InspAct_Chk01_SmplR.$pack_xfr_pack_unit_cd, Chk01_SmplR.$pack_xfr_pack_unit_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$pack_xfr_base_unit_qty, Chk01_SmplR.$pack_xfr_base_unit_qty);
				addColumnPathMap(InspAct_Chk01_SmplR.$pack_xfr_base_unit_cd, Chk01_SmplR.$pack_xfr_base_unit_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$loc_cd, Chk01_SmplR.$loc_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$str_ln_cd, Chk01_SmplR.$str_ln_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$quality_typ, Chk01_SmplR.$quality_typ);
				addColumnPathMap(InspAct_Chk01_SmplR.$stk_insp_typ, Chk01_SmplR.$stk_insp_typ);
				addColumnPathMap(InspAct_Chk01_SmplR.$stk_id_typ, Chk01_SmplR.$stk_id_typ);
				addColumnPathMap(InspAct_Chk01_SmplR.$stk_bp_cd, Chk01_SmplR.$stk_bp_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$gd_cd, Chk01_SmplR.$gd_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$stk_arrv_bp_cd, Chk01_SmplR.$stk_arrv_bp_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$lot_no, Chk01_SmplR.$lot_no);
				addColumnPathMap(InspAct_Chk01_SmplR.$sublot_no, Chk01_SmplR.$sublot_no);
				addColumnPathMap(InspAct_Chk01_SmplR.$sno1, Chk01_SmplR.$sno1);
				addColumnPathMap(InspAct_Chk01_SmplR.$sno2, Chk01_SmplR.$sno2);
				addColumnPathMap(InspAct_Chk01_SmplR.$sno3, Chk01_SmplR.$sno3);
				addColumnPathMap(InspAct_Chk01_SmplR.$sno4, Chk01_SmplR.$sno4);
				addColumnPathMap(InspAct_Chk01_SmplR.$fix_no_typ, Chk01_SmplR.$fix_no_typ);
				addColumnPathMap(InspAct_Chk01_SmplR.$fix_no, Chk01_SmplR.$fix_no);
				addColumnPathMap(InspAct_Chk01_SmplR.$act_tm, Chk01_SmplR.$act_tm);
				addColumnPathMap(InspAct_Chk01_SmplR.$ac_dt, Chk01_SmplR.$ac_dt);
				addColumnPathMap(InspAct_Chk01_SmplR.$bd_dpt_cd, Chk01_SmplR.$bd_dpt_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$trd_rmrks, Chk01_SmplR.$trd_rmrks);
				addColumnPathMap(InspAct_Chk01_SmplR.$intr_rmrks, Chk01_SmplR.$intr_rmrks);
				addColumnPathMap(InspAct_Chk01_SmplR.$sub_char1, Chk01_SmplR.$sub_char1);
				addColumnPathMap(InspAct_Chk01_SmplR.$sub_char2, Chk01_SmplR.$sub_char2);
				addColumnPathMap(InspAct_Chk01_SmplR.$sub_char3, Chk01_SmplR.$sub_char3);
			}
		}
	}
	
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 検査実績ヘッダを更新する前に、チェックを実行する<br>
	 */
	public class Chk02 extends MSBFL_InspActReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			
			if (!hasErr()) {
				callInspActChkSrv();
			}
			
			setDown();
		}
		
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査指図の更新カウンタチェック、補完
			msgL.addAll(chkInstUpdCnt());

			// 検査実績の更新カウンタチェック
			msgL.addAll(chkActUpdCnt());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			// 場所の更新権限のチェック
			msgL.addAll(dacChk());

			return msgL;
		}

		/**
		 * 指図更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkInstUpdCnt() {
			MCMessageList msgL = new MCMessageList();
			
			MST_INSP_INST_R selectR = MST_INSP_INST_R.create("T");
			dbSelectKeyForUpdateNoWait("MSBFL0070_MST_INSP_INST_S02", selectR,
					MCQueryApiBuilder.create(selectR), up0());

			msgL.addAll(checkUpdCntrNE(up0(), Chk02_HdrR.$inst_upd_cntr, selectR));

			setErrFlg(up0(), msgL);
			compData(selectR);
			
			return msgL;
		}

		/**
		 * 補完処理を行う。
		 */
		
		protected void compData(MST_INSP_INST_R instR) {
			if (!isNull(instR)) {
				MST_LOT_R lotR = MST_LOT_R.create("T");
				MCQueryApiBuilder lotR_bldr = MCQueryApiBuilder.create(lotR);
				lotR_bldr.setSelect(lotR.ver_no);
				dbSelectKey("MSBFL0070_MST_LOT_S02", lotR, lotR_bldr, instR);
				
				// ヘッダの補完
				up0().insp_freq(instR.insp_freq());
				up0().src_no1(instR.src_no1());
				up0().src_no2(instR.src_no2());
				up0().insp_typ(instR.insp_typ());
				up0().insp_mtd_typ(instR.insp_mtd_typ());
				up0().insp_sts_typ(instR.insp_sts_typ());
				up0().insp_aprv_sts_typ(instR.insp_aprv_sts_typ());
				up0().itm_cd(instR.itm_cd());
				up0().itm_sub1(instR.itm_sub1());
				up0().itm_sub2(instR.itm_sub2());
				up0().itm_sub3(instR.itm_sub3());
				up0().lot_no(instR.lot_no());
				up0().sublot_no(instR.sublot_no());
				up0().ver_no(lotR.ver_no());
				up0().sppl_cd(instR.sppl_cd());
				up0().maker_cd(instR.maker_cd());
				up0().mfg_loc_cd(instR.mfg_loc_cd());
				up0().from_site_cd(instR.from_site_cd());
				up0().base_unit_cd(instR.base_unit_cd());
			}
		}

		/**
		 * 実績更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkActUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			if (up0().err_flg()) {
				return msgL;
			}
			MST_INSP_ACT_R selectR = MST_INSP_ACT_R.create("T");
			dbSelectKeyForUpdateNoWait("MSBFL0070_MST_INSP_ACT_S01", selectR,
					MCQueryApiBuilder.create(selectR), up0());

			msgL.addAll(checkUpdCntrNE(up0(), Chk02_HdrR.$act_upd_cntr, selectR));

			return msgL;
		}

		/**
		 * 場所の更新権限のチェックをします。
		 * 
		 * @return
		 */
		protected MCMessageList dacChk() {
			MCMessageList msgL = new MCMessageList();

			if (up0().err_flg()) {
				return msgL;
			}

			if (MSC_INSP_TYP.isPRDCT(up0().insp_typ())) {
				msgL.addAll(checkWritableLocCdDac(up0(), Chk02_HdrR.$mfg_loc_cd));
			}
			else {
				MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
				MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
				MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
				schdL_bldr.setWhere(t.insp_no.eq(bind("insp_no")), up0());
				dbSelect("MSBFL0070_MST_INSP_SCHD_S04", schdL, schdL_bldr);
				for (MST_INSP_SCHD_R schdR : schdL) {
					msgL.addAll(checkWritableLocCdDac(schdR, MST_INSP_SCHD_R.$loc_cd));
				}
				if (!schdL.isEmpty() && schdL.size() == msgL.size()) {
					up0().err_flg(true);
					return msgL;
				}
			}

			return msgL;
		}

		/**
		 * 検査実績サービスの登録・更新前チェック処理を行う。
		 */
		protected void callInspActChkSrv() {
			MCList<Chk02_HdrR> up0L = MCList.create(Chk02_HdrR.class);
			up0L.add(up0());
			
			MSBFL_InspActService.InspAct_Chk01 o = MSBFL_InspActService.crtInspAct_Chk01();
			
			addAll(o.up0(), up0L, createMap_InspAct_Chk01_HdrR_Chk02_HdrR());
			addAll(o.up1(), up1(), createMap_InspAct_Chk01_DtlR_Chk02_DtlR());
			addAll(o.up2(), up2(), createMap_InspAct_Chk01_SmplR_Chk02_SmplR());
			
			o.exec();
			
			String[] dest0Cols = new String[] {Chk02_HdrR.$base_unit_qty, Chk02_DtlR.$err_flg};
			String[] src0Cols = new String[] {InspAct_Chk01_HdrR.$base_unit_qty, InspAct_Chk01_HdrR.$err_flg};
			copyByPegNo(up0L, dest0Cols, o.down0(), src0Cols);
			String[] dest1Cols = new String[] {Chk02_DtlR.$itm_cd, Chk02_DtlR.$itm_sub1, Chk02_DtlR.$itm_sub2, Chk02_DtlR.$itm_sub3, 
					Chk02_DtlR.$base_unit_cd, Chk02_DtlR.$pack_xfr_base_unit_cd, Chk02_DtlR.$lot_no, Chk02_DtlR.$sublot_no, Chk02_DtlR.$ac_dt,
					Chk02_DtlR.$sno1_mng_typ, Chk02_DtlR.$sno2_mng_typ, Chk02_DtlR.$sno3_mng_typ, Chk02_DtlR.$sno4_mng_typ, 
					Chk02_DtlR.$rmrks_upd_flg, Chk02_DtlR.$err_flg};
			String[] src1Cols = new String[] {InspAct_Chk01_DtlR.$itm_cd, InspAct_Chk01_DtlR.$itm_sub1, InspAct_Chk01_DtlR.$itm_sub2, InspAct_Chk01_DtlR.$itm_sub3, 
					InspAct_Chk01_DtlR.$base_unit_cd, InspAct_Chk01_DtlR.$pack_xfr_base_unit_cd, InspAct_Chk01_DtlR.$lot_no, InspAct_Chk01_DtlR.$sublot_no, InspAct_Chk01_DtlR.$ac_dt, 
					InspAct_Chk01_DtlR.$sno1_mng_typ, InspAct_Chk01_DtlR.$sno2_mng_typ, InspAct_Chk01_DtlR.$sno3_mng_typ, InspAct_Chk01_DtlR.$sno4_mng_typ, 
					InspAct_Chk01_DtlR.$rmrks_upd_flg, InspAct_Chk01_DtlR.$err_flg};
			copyByPegNo(up1(), dest1Cols, o.down1(), src1Cols);
			String[] dest2Cols = new String[] {Chk02_SmplR.$itm_cd, Chk02_SmplR.$itm_sub1, Chk02_SmplR.$itm_sub2, Chk02_SmplR.$itm_sub3, 
					Chk02_SmplR.$base_unit_cd, Chk02_SmplR.$pack_xfr_base_unit_cd, Chk02_SmplR.$lot_no, Chk02_SmplR.$sublot_no, 
					Chk02_SmplR.$sno1_mng_typ, Chk02_SmplR.$sno2_mng_typ, Chk02_SmplR.$sno3_mng_typ, Chk02_SmplR.$sno4_mng_typ, 
					Chk02_SmplR.$str_ln_cd, Chk02_SmplR.$rmrks_upd_flg, Chk02_SmplR.$err_flg};
			String[] src2Cols = new String[] {InspAct_Chk01_SmplR.$itm_cd, InspAct_Chk01_SmplR.$itm_sub1, InspAct_Chk01_SmplR.$itm_sub2, InspAct_Chk01_SmplR.$itm_sub3, 
					InspAct_Chk01_SmplR.$base_unit_cd, InspAct_Chk01_SmplR.$pack_xfr_base_unit_cd, InspAct_Chk01_SmplR.$lot_no, InspAct_Chk01_SmplR.$sublot_no, 
					InspAct_Chk01_SmplR.$sno1_mng_typ, InspAct_Chk01_SmplR.$sno2_mng_typ, InspAct_Chk01_SmplR.$sno3_mng_typ, InspAct_Chk01_SmplR.$sno4_mng_typ, 
					InspAct_Chk01_SmplR.$str_ln_cd, InspAct_Chk01_SmplR.$rmrks_upd_flg, InspAct_Chk01_SmplR.$err_flg};
			copyByPegNo(up2(), dest2Cols, o.down2(), src2Cols);
		}
		
		protected Map_InspAct_Chk01_HdrR_Chk02_HdrR<InspAct_Chk01_HdrR,Chk02_HdrR> createMap_InspAct_Chk01_HdrR_Chk02_HdrR() {
			return new Map_InspAct_Chk01_HdrR_Chk02_HdrR<InspAct_Chk01_HdrR, Chk02_HdrR>();
		}
		
		public class Map_InspAct_Chk01_HdrR_Chk02_HdrR<D extends InspAct_Chk01_HdrR, S extends Chk02_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk01_HdrR.$peg_no, Chk02_HdrR.$peg_no);
				addColumnPathMap(InspAct_Chk01_HdrR.$insp_no, Chk02_HdrR.$insp_no);
				addColumnPathMap(InspAct_Chk01_HdrR.$insp_act_no, Chk02_HdrR.$insp_act_no);
				addColumnPathMap(InspAct_Chk01_HdrR.$insp_freq, Chk02_HdrR.$insp_freq);
				addColumnPathMap(InspAct_Chk01_HdrR.$src_no1, Chk02_HdrR.$src_no1);
				addColumnPathMap(InspAct_Chk01_HdrR.$src_no2, Chk02_HdrR.$src_no2);
				addColumnPathMap(InspAct_Chk01_HdrR.$insp_typ, Chk02_HdrR.$insp_typ);
				addColumnPathMap(InspAct_Chk01_HdrR.$insp_mtd_typ, Chk02_HdrR.$insp_mtd_typ);
				addColumnPathMap(InspAct_Chk01_HdrR.$insp_sts_typ, Chk02_HdrR.$insp_sts_typ);
				addColumnPathMap(InspAct_Chk01_HdrR.$insp_aprv_sts_typ, Chk02_HdrR.$insp_aprv_sts_typ);
				addColumnPathMap(InspAct_Chk01_HdrR.$itm_cd, Chk02_HdrR.$itm_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$itm_sub1, Chk02_HdrR.$itm_sub1);
				addColumnPathMap(InspAct_Chk01_HdrR.$itm_sub2, Chk02_HdrR.$itm_sub2);
				addColumnPathMap(InspAct_Chk01_HdrR.$itm_sub3, Chk02_HdrR.$itm_sub3);
				addColumnPathMap(InspAct_Chk01_HdrR.$lot_no, Chk02_HdrR.$lot_no);
				addColumnPathMap(InspAct_Chk01_HdrR.$sublot_no, Chk02_HdrR.$sublot_no);
				addColumnPathMap(InspAct_Chk01_HdrR.$ver_no, Chk02_HdrR.$ver_no);
				addColumnPathMap(InspAct_Chk01_HdrR.$quality_typ, Chk02_HdrR.$quality_typ);
				addColumnPathMap(InspAct_Chk01_HdrR.$gd_cd, Chk02_HdrR.$gd_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$dfct_rsn_cd, Chk02_HdrR.$dfct_rsn_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$sppl_cd, Chk02_HdrR.$sppl_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$maker_cd, Chk02_HdrR.$maker_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$mfg_loc_cd, Chk02_HdrR.$mfg_loc_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$from_site_cd, Chk02_HdrR.$from_site_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$base_unit_qty, Chk02_HdrR.$base_unit_qty);
				addColumnPathMap(InspAct_Chk01_HdrR.$base_unit_cd, Chk02_HdrR.$base_unit_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$ttl_stk_qty, Chk02_HdrR.$ttl_stk_qty);
				addColumnPathMap(InspAct_Chk01_HdrR.$st_tm, Chk02_HdrR.$st_tm);
				addColumnPathMap(InspAct_Chk01_HdrR.$end_tm, Chk02_HdrR.$end_tm);
				addColumnPathMap(InspAct_Chk01_HdrR.$act_usr_cd, Chk02_HdrR.$act_usr_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$act_dpt_cd, Chk02_HdrR.$act_dpt_cd);
				addColumnPathMap(InspAct_Chk01_HdrR.$lmt_dt_frm_typ, Chk02_HdrR.$lmt_dt_frm_typ);
				addColumnPathMap(InspAct_Chk01_HdrR.$lmt_dt_frm, Chk02_HdrR.$lmt_dt_frm);
				addColumnPathMap(InspAct_Chk01_HdrR.$vld_dt, Chk02_HdrR.$vld_dt);
				addColumnPathMap(InspAct_Chk01_HdrR.$lmt_dt, Chk02_HdrR.$lmt_dt);
				addColumnPathMap(InspAct_Chk01_HdrR.$act_cont_fctr, Chk02_HdrR.$act_cont_fctr);
				addColumnPathMap(InspAct_Chk01_HdrR.$intr_rmrks, Chk02_HdrR.$intr_rmrks);
				addColumnPathMap(InspAct_Chk01_HdrR.$lot_rmrks, Chk02_HdrR.$lot_rmrks);
				addColumnPathMap(InspAct_Chk01_HdrR.$sub_char1, Chk02_HdrR.$sub_char1);
				addColumnPathMap(InspAct_Chk01_HdrR.$sub_char2, Chk02_HdrR.$sub_char2);
				addColumnPathMap(InspAct_Chk01_HdrR.$sub_char3, Chk02_HdrR.$sub_char3);
				addColumnPathMap(InspAct_Chk01_HdrR.$inst_upd_cntr, Chk02_HdrR.$inst_upd_cntr);
				addColumnPathMap(InspAct_Chk01_HdrR.$vld_dt_upd_flg, Chk02_HdrR.$vld_dt_upd_flg);
				addColumnPathMap(InspAct_Chk01_HdrR.$stt_can_ac_dt, Chk02_HdrR.$stt_can_ac_dt);
			}
		}
		
		protected Map_InspAct_Chk01_DtlR_Chk02_DtlR<InspAct_Chk01_DtlR,Chk02_DtlR> createMap_InspAct_Chk01_DtlR_Chk02_DtlR() {
			return new Map_InspAct_Chk01_DtlR_Chk02_DtlR<InspAct_Chk01_DtlR, Chk02_DtlR>();
		}
		
		public class Map_InspAct_Chk01_DtlR_Chk02_DtlR<D extends InspAct_Chk01_DtlR, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk01_DtlR.$peg_no, Chk02_DtlR.$peg_no);
				addColumnPathMap(InspAct_Chk01_DtlR.$insp_no, Chk02_DtlR.$insp_no);
				addColumnPathMap(InspAct_Chk01_DtlR.$data_crud_typ, Chk02_DtlR.$data_crud_typ);
				addColumnPathMap(InspAct_Chk01_DtlR.$insp_act_d_no, Chk02_DtlR.$insp_act_d_no);
				addColumnPathMap(InspAct_Chk01_DtlR.$insp_act_no, Chk02_DtlR.$insp_act_no);
				addColumnPathMap(InspAct_Chk01_DtlR.$itm_cd, Chk02_DtlR.$itm_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$itm_sub1, Chk02_DtlR.$itm_sub1);
				addColumnPathMap(InspAct_Chk01_DtlR.$itm_sub2, Chk02_DtlR.$itm_sub2);
				addColumnPathMap(InspAct_Chk01_DtlR.$itm_sub3, Chk02_DtlR.$itm_sub3);
				addColumnPathMap(InspAct_Chk01_DtlR.$loc_cd, Chk02_DtlR.$loc_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$str_ln_cd, Chk02_DtlR.$str_ln_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$quality_typ, Chk02_DtlR.$quality_typ);
				addColumnPathMap(InspAct_Chk01_DtlR.$stk_insp_typ, Chk02_DtlR.$stk_insp_typ);
				addColumnPathMap(InspAct_Chk01_DtlR.$stk_id_typ, Chk02_DtlR.$stk_id_typ);
				addColumnPathMap(InspAct_Chk01_DtlR.$stk_bp_cd, Chk02_DtlR.$stk_bp_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$gd_cd, Chk02_DtlR.$gd_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$stk_arrv_bp_cd, Chk02_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$lot_no, Chk02_DtlR.$lot_no);
				addColumnPathMap(InspAct_Chk01_DtlR.$sublot_no, Chk02_DtlR.$sublot_no);
				addColumnPathMap(InspAct_Chk01_DtlR.$sno1, Chk02_DtlR.$sno1);
				addColumnPathMap(InspAct_Chk01_DtlR.$sno2, Chk02_DtlR.$sno2);
				addColumnPathMap(InspAct_Chk01_DtlR.$sno3, Chk02_DtlR.$sno3);
				addColumnPathMap(InspAct_Chk01_DtlR.$sno4, Chk02_DtlR.$sno4);
				addColumnPathMap(InspAct_Chk01_DtlR.$fix_no_typ, Chk02_DtlR.$fix_no_typ);
				addColumnPathMap(InspAct_Chk01_DtlR.$fix_no, Chk02_DtlR.$fix_no);
				addColumnPathMap(InspAct_Chk01_DtlR.$pack_unit_qty, Chk02_DtlR.$pack_unit_qty);
				addColumnPathMap(InspAct_Chk01_DtlR.$pack_unit_cd, Chk02_DtlR.$pack_unit_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$base_unit_qty, Chk02_DtlR.$base_unit_qty);
				addColumnPathMap(InspAct_Chk01_DtlR.$base_unit_cd, Chk02_DtlR.$base_unit_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$pack_xfr_pack_unit_qty, Chk02_DtlR.$pack_xfr_pack_unit_qty);
				addColumnPathMap(InspAct_Chk01_DtlR.$pack_xfr_pack_unit_cd, Chk02_DtlR.$pack_xfr_pack_unit_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$pack_xfr_base_unit_qty, Chk02_DtlR.$pack_xfr_base_unit_qty);
				addColumnPathMap(InspAct_Chk01_DtlR.$pack_xfr_base_unit_cd, Chk02_DtlR.$pack_xfr_base_unit_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$dfct_rsn_cd, Chk02_DtlR.$dfct_rsn_cd);
				addColumnPathMap(InspAct_Chk01_DtlR.$ac_dt, Chk02_DtlR.$ac_dt);
				addColumnPathMap(InspAct_Chk01_DtlR.$can_ac_dt, Chk02_DtlR.$can_ac_dt);
				addColumnPathMap(InspAct_Chk01_DtlR.$intr_rmrks, Chk02_DtlR.$intr_rmrks);
				addColumnPathMap(InspAct_Chk01_DtlR.$sub_char1, Chk02_DtlR.$sub_char1);
				addColumnPathMap(InspAct_Chk01_DtlR.$sub_char2, Chk02_DtlR.$sub_char2);
				addColumnPathMap(InspAct_Chk01_DtlR.$sub_char3, Chk02_DtlR.$sub_char3);
			}
		}
		
		protected Map_InspAct_Chk01_SmplR_Chk02_SmplR<InspAct_Chk01_SmplR,Chk02_SmplR> createMap_InspAct_Chk01_SmplR_Chk02_SmplR() {
			return new Map_InspAct_Chk01_SmplR_Chk02_SmplR<InspAct_Chk01_SmplR, Chk02_SmplR>();
		}
		
		public class Map_InspAct_Chk01_SmplR_Chk02_SmplR<D extends InspAct_Chk01_SmplR, S extends Chk02_SmplR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk01_SmplR.$peg_no, Chk02_SmplR.$peg_no);
				addColumnPathMap(InspAct_Chk01_SmplR.$insp_no, Chk02_SmplR.$insp_no);
				addColumnPathMap(InspAct_Chk01_SmplR.$data_crud_typ, Chk02_SmplR.$data_crud_typ);
				addColumnPathMap(InspAct_Chk01_SmplR.$insp_smpl_act_no, Chk02_SmplR.$insp_smpl_act_no);
				addColumnPathMap(InspAct_Chk01_SmplR.$insp_schd_no, Chk02_SmplR.$insp_schd_no);
				addColumnPathMap(InspAct_Chk01_SmplR.$insp_act_no, Chk02_SmplR.$insp_act_no);
				addColumnPathMap(InspAct_Chk01_SmplR.$itm_cd, Chk02_SmplR.$itm_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$itm_sub1, Chk02_SmplR.$itm_sub1);
				addColumnPathMap(InspAct_Chk01_SmplR.$itm_sub2, Chk02_SmplR.$itm_sub2);
				addColumnPathMap(InspAct_Chk01_SmplR.$itm_sub3, Chk02_SmplR.$itm_sub3);
				addColumnPathMap(InspAct_Chk01_SmplR.$so_qty, Chk02_SmplR.$so_qty);
				addColumnPathMap(InspAct_Chk01_SmplR.$smpl_qty, Chk02_SmplR.$smpl_qty);
				addColumnPathMap(InspAct_Chk01_SmplR.$base_unit_cd, Chk02_SmplR.$base_unit_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$pack_xfr_pack_unit_qty, Chk02_SmplR.$pack_xfr_pack_unit_qty);
				addColumnPathMap(InspAct_Chk01_SmplR.$pack_xfr_pack_unit_cd, Chk02_SmplR.$pack_xfr_pack_unit_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$pack_xfr_base_unit_qty, Chk02_SmplR.$pack_xfr_base_unit_qty);
				addColumnPathMap(InspAct_Chk01_SmplR.$pack_xfr_base_unit_cd, Chk02_SmplR.$pack_xfr_base_unit_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$loc_cd, Chk02_SmplR.$loc_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$str_ln_cd, Chk02_SmplR.$str_ln_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$quality_typ, Chk02_SmplR.$quality_typ);
				addColumnPathMap(InspAct_Chk01_SmplR.$stk_insp_typ, Chk02_SmplR.$stk_insp_typ);
				addColumnPathMap(InspAct_Chk01_SmplR.$stk_id_typ, Chk02_SmplR.$stk_id_typ);
				addColumnPathMap(InspAct_Chk01_SmplR.$stk_bp_cd, Chk02_SmplR.$stk_bp_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$gd_cd, Chk02_SmplR.$gd_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$stk_arrv_bp_cd, Chk02_SmplR.$stk_arrv_bp_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$lot_no, Chk02_SmplR.$lot_no);
				addColumnPathMap(InspAct_Chk01_SmplR.$sublot_no, Chk02_SmplR.$sublot_no);
				addColumnPathMap(InspAct_Chk01_SmplR.$sno1, Chk02_SmplR.$sno1);
				addColumnPathMap(InspAct_Chk01_SmplR.$sno2, Chk02_SmplR.$sno2);
				addColumnPathMap(InspAct_Chk01_SmplR.$sno3, Chk02_SmplR.$sno3);
				addColumnPathMap(InspAct_Chk01_SmplR.$sno4, Chk02_SmplR.$sno4);
				addColumnPathMap(InspAct_Chk01_SmplR.$fix_no_typ, Chk02_SmplR.$fix_no_typ);
				addColumnPathMap(InspAct_Chk01_SmplR.$fix_no, Chk02_SmplR.$fix_no);
				addColumnPathMap(InspAct_Chk01_SmplR.$act_tm, Chk02_SmplR.$act_tm);
				addColumnPathMap(InspAct_Chk01_SmplR.$ac_dt, Chk02_SmplR.$ac_dt);
				addColumnPathMap(InspAct_Chk01_SmplR.$can_ac_dt, Chk02_SmplR.$can_ac_dt);
				addColumnPathMap(InspAct_Chk01_SmplR.$bd_dpt_cd, Chk02_SmplR.$bd_dpt_cd);
				addColumnPathMap(InspAct_Chk01_SmplR.$trd_rmrks, Chk02_SmplR.$trd_rmrks);
				addColumnPathMap(InspAct_Chk01_SmplR.$intr_rmrks, Chk02_SmplR.$intr_rmrks);
				addColumnPathMap(InspAct_Chk01_SmplR.$sub_char1, Chk02_SmplR.$sub_char1);
				addColumnPathMap(InspAct_Chk01_SmplR.$sub_char2, Chk02_SmplR.$sub_char2);
				addColumnPathMap(InspAct_Chk01_SmplR.$sub_char3, Chk02_SmplR.$sub_char3);
			}
		}
	}
	
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 検査実績ヘッダを判定する前に、チェックを実行する<br>
	 */
	public class Chk03 extends MSBFL_InspActReg_MC_A.Chk03 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
			
			if (!hasErr()) {
				callInspActChkSrv();
			}
			
			setDown();
		}
		
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査指図の更新カウンタチェック
			msgL.addAll(chkInstUpdCnt());

			// 検査実績の更新カウンタチェック
			msgL.addAll(chkActUpdCnt());
			
			compDataDtl();

			return msgL;
		}

		
		@Override
		protected MCMessageList doServerCheckSub() {
			return super.doServerCheckSub();
		}

		/**
		 * 指図更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkInstUpdCnt() {
			MCMessageList msgL = new MCMessageList();
			
			MST_INSP_INST_R selectR = MST_INSP_INST_R.create("T");
			dbSelectKeyForUpdateNoWait("MSBFL0070_MST_INSP_INST_S03", selectR,
					MCQueryApiBuilder.create(selectR), up0());

			msgL.addAll(checkUpdCntrNE(up0(), Chk03_HdrR.$inst_upd_cntr, selectR));

			setErrFlg(up0(), msgL);
			compData(selectR);
			
			return msgL;
		}
		
		/**
		 * 補完処理を行う。
		 * @param instR
		 */
		protected void compData(MST_INSP_INST_R instR) {
			if (!isNull(instR)) {
				MST_LOT_R lotR = MST_LOT_R.create("T");
				MCQueryApiBuilder lotR_bldr = MCQueryApiBuilder.create(lotR);
				lotR_bldr.setSelect(lotR.ver_no);
				dbSelectKey("MSBFL0070_MST_LOT_S03", lotR, lotR_bldr, instR);
				
				up0().insp_typ(instR.insp_typ());
				up0().insp_sts_typ(instR.insp_sts_typ());
				up0().insp_aprv_sts_typ(instR.insp_aprv_sts_typ());
				up0().itm_cd(instR.itm_cd());
				up0().itm_sub1(instR.itm_sub1());
				up0().itm_sub2(instR.itm_sub2());
				up0().itm_sub3(instR.itm_sub3());
				up0().lot_no(instR.lot_no());
				up0().sublot_no(instR.sublot_no());
				up0().ver_no(lotR.ver_no());
			}
		}
		/**
		 * 実績更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkActUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			if (up0().err_flg()) {
				return msgL;
			}
			MST_INSP_ACT_R selectR = MST_INSP_ACT_R.create("T");
			dbSelectKeyForUpdateNoWait("MSBFL0070_MST_INSP_ACT_S02", selectR,
					MCQueryApiBuilder.create(selectR), up0());

			msgL.addAll(checkUpdCntrNE(up0(), Chk03_HdrR.$act_upd_cntr, selectR));

			return msgL;
		}
		
		/**
		 * 実績明細の補完処理を行う。
		 */
		protected void compDataDtl() {
			MCList<Chk03_DtlR> dtlL = MCList.create(Chk03_DtlR.class);
			
			MCList<MST_INSP_SCHD_R> schdL = getInspSchdL(up0().insp_no());
			dtlL.addAll(getDtl(schdL));
			up1().setAll(dtlL);

			setPegNo(up1());
		}
		
		protected MCList<Chk03_DtlR> getDtl(MCList<MST_INSP_SCHD_R> schdL) {
			MCList<Chk03_DtlR> dtlL = MCList.create(Chk03_DtlR.class);
			
			MCIndexKey idxkey = null;
			if (MSC_INSP_TYP.isLOT(up0().insp_typ())) {
				idxkey = schdL.createIndex(MST_INSP_SCHD_R.$insp_schd_no);
			}
			else if (MSC_INSP_TYP.isPRDCT(up0().insp_typ()) || MSC_INSP_TYP.isACCPT(up0().insp_typ())) {
				idxkey = schdL.createIndex(MST_INSP_SCHD_R.$src_no4);
			}
			
			MCList<MST_STK_R> stkL = MCList.create(MST_STK_R.class);
			MST_STK_R t = MST_STK_R.create("T");
			MCQueryApiBuilder stkL_bldr = MCQueryApiBuilder.create(t);
			MCList<MST_INSP_SCHD_R> tmpSchdL = schdL.subList(MST_INSP_SCHD_R.$insp_no, up0().insp_no());
			if (MSC_INSP_TYP.isACCPT(up0().insp_typ())) {
				stkL_bldr.setWhere(t.fix_no_typ.eq(bind("1")), MSC_FIX_NO_TYP.ARR_ACT_NO.value());
				stkL_bldr.addWhereWithAnd(t.fix_no.eq(bind("src_no4")));
			}
			else if (MSC_INSP_TYP.isPRDCT(up0().insp_typ())) {
				stkL_bldr.setWhere(t.fix_no_typ.eq(bind("1")), MSC_FIX_NO_TYP.YIELD_ACT_NO.value());
				stkL_bldr.addWhereWithAnd(t.fix_no.eq(bind("src_no4")));
			}
			else if (MSC_INSP_TYP.isLOT(up0().insp_typ())) {
				stkL_bldr.setWhere(t.fix_no_typ.eq(bind("1")), MSC_FIX_NO_TYP.INSP_SCHD_NO.value());
				stkL_bldr.addWhereWithAnd(t.fix_no.eq(bind("insp_schd_no")));
			}
			dbSelect("MSBFL0070_MST_STK_S02", stkL, stkL_bldr, tmpSchdL);

			MCIndexKey upIdxkey = up1().createIndex(Chk03_DtlR.$fix_no, Chk03_DtlR.$fix_no_typ);
			for (MST_STK_R stkR : stkL) {
				Chk03_DtlR dtlR = Chk03_DtlR.create();
				
				MST_INSP_SCHD_R schdR = schdL.getFirst(idxkey, stkR.fix_no());
				MCList<Chk03_DtlR> subUpL = up1().subList(upIdxkey, stkR.fix_no(), stkR.fix_no_typ());
				
				dtlR.data_crud_typ(null);
				dtlR.insp_act_no(up0().insp_act_no());
				dtlR.insp_no(up0().insp_no());
				dtlR.itm_cd(stkR.itm_cd());
				dtlR.itm_sub1(stkR.itm_sub1());
				dtlR.itm_sub2(stkR.itm_sub2());
				dtlR.itm_sub3(stkR.itm_sub3());
				dtlR.loc_cd(stkR.loc_cd());
				dtlR.str_ln_cd(stkR.str_ln_cd());
				dtlR.stk_arrv_bp_cd(stkR.stk_arrv_bp_cd());
				dtlR.gd_cd(stkR.gd_cd());
				dtlR.quality_typ(stkR.quality_typ());
				dtlR.stk_insp_typ(stkR.stk_insp_typ());
				dtlR.stk_id_typ(stkR.stk_id_typ());
				dtlR.stk_bp_cd(stkR.stk_bp_cd());
				dtlR.lot_no(stkR.lot_no());
				dtlR.sublot_no(stkR.sublot_no());
				dtlR.sno1(stkR.sno1());
				dtlR.sno1_mng_typ(schdR.sno1_mng_typ());
				dtlR.sno2(stkR.sno2());
				dtlR.sno2_mng_typ(schdR.sno2_mng_typ());
				dtlR.sno3(stkR.sno3());
				dtlR.sno3_mng_typ(schdR.sno3_mng_typ());
				dtlR.sno4(stkR.sno4());
				dtlR.sno4_mng_typ(schdR.sno4_mng_typ());
				dtlR.fix_no_typ(stkR.fix_no_typ());
				dtlR.fix_no(stkR.fix_no());
				dtlR.pack_unit_qty(stkR.pack_unit_qty());
				dtlR.pack_unit_cd(stkR.pack_unit_cd());
				dtlR.base_unit_qty(stkR.base_unit_qty());
				dtlR.base_unit_cd(schdR.base_unit_cd());
				dtlR.ac_dt((MCDate)subUpL.max(Chk03_DtlR.$ac_dt));
				
				dtlL.add(dtlR);
			}
			
			MCList<MST_INSP_ACT_D_R> inspActDL = MCList.create(MST_INSP_ACT_D_R.class);
			MST_INSP_ACT_D_R inspActD = MST_INSP_ACT_D_R.create("inspActD");
			MCQueryApiBuilder actDL_bldr = MCQueryApiBuilder.create(inspActD);
			actDL_bldr.setWhere(inspActD.insp_act_no.eq(bind("insp_act_no")));
			dbSelect("MSBFL0070_MST_INSP_ACT_D_S02", inspActDL, actDL_bldr, up0());
			
			for (MST_INSP_ACT_D_R inspActDR : inspActDL) {
				if (!isNull(inspActDR) && inspActDR.base_unit_qty().isZero()) {
					Chk03_DtlR dtlR = Chk03_DtlR.create();
					
					dtlR.data_crud_typ(null);
					dtlR.insp_act_no(up0().insp_act_no());
					dtlR.insp_no(up0().insp_no());
					dtlR.itm_cd(inspActDR.itm_cd());
					dtlR.itm_sub1(inspActDR.itm_sub1());
					dtlR.itm_sub2(inspActDR.itm_sub2());
					dtlR.itm_sub3(inspActDR.itm_sub3());
					dtlR.loc_cd(inspActDR.loc_cd());
					dtlR.str_ln_cd(inspActDR.str_ln_cd());
					dtlR.stk_arrv_bp_cd(inspActDR.stk_arrv_bp_cd());
					dtlR.gd_cd(inspActDR.gd_cd());
					dtlR.quality_typ(inspActDR.quality_typ());
					dtlR.stk_insp_typ(inspActDR.stk_insp_typ());
					dtlR.stk_id_typ(inspActDR.stk_id_typ());
					dtlR.stk_bp_cd(inspActDR.stk_bp_cd());
					dtlR.lot_no(inspActDR.lot_no());
					dtlR.sublot_no(inspActDR.sublot_no());
					dtlR.sno1(inspActDR.sno1());
					dtlR.sno1_mng_typ(inspActDR.sno1_mng_typ());
					dtlR.sno2(inspActDR.sno2());
					dtlR.sno2_mng_typ(inspActDR.sno2_mng_typ());
					dtlR.sno3(inspActDR.sno3());
					dtlR.sno3_mng_typ(inspActDR.sno3_mng_typ());
					dtlR.sno4(inspActDR.sno4());
					dtlR.sno4_mng_typ(inspActDR.sno4_mng_typ());
					dtlR.fix_no_typ(inspActDR.fix_no_typ());
					dtlR.fix_no(inspActDR.fix_no());
					dtlR.pack_unit_qty(inspActDR.pack_unit_qty());
					dtlR.pack_unit_cd(inspActDR.pack_unit_cd());
					dtlR.base_unit_qty(inspActDR.base_unit_qty());
					dtlR.base_unit_cd(inspActDR.base_unit_cd());
					dtlR.ac_dt(up0().judg_dt());
					
					dtlL.add(dtlR);
				}
			}
			return dtlL;
		}
		
		protected void callInspActChkSrv() {
			MCList<Chk03_HdrR> up0L = MCList.create(Chk03_HdrR.class);
			up0L.add(up0());
			
			MSBFL_InspActService.InspAct_Chk02 o = MSBFL_InspActService.crtInspAct_Chk02();
			
			addAll(o.up0(), up0L, createMap_InspAct_Chk02_HdrR_Chk03_HdrR());
			addAll(o.up1(), up1(), createMap_InspAct_Chk02_DtlR_Chk03_DtlR());
			
			o.exec();
			
			copyErrFlg(up0L, o.down0());
		}
		
		protected Map_InspAct_Chk02_HdrR_Chk03_HdrR<InspAct_Chk02_HdrR,Chk03_HdrR> createMap_InspAct_Chk02_HdrR_Chk03_HdrR() {
			return new Map_InspAct_Chk02_HdrR_Chk03_HdrR<InspAct_Chk02_HdrR, Chk03_HdrR>();
		}
		
		public class Map_InspAct_Chk02_HdrR_Chk03_HdrR<D extends InspAct_Chk02_HdrR, S extends Chk03_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk02_HdrR.$peg_no, Chk03_HdrR.$peg_no);
				addColumnPathMap(InspAct_Chk02_HdrR.$insp_no, Chk03_HdrR.$insp_no);
				addColumnPathMap(InspAct_Chk02_HdrR.$insp_act_no, Chk03_HdrR.$insp_act_no);
				addColumnPathMap(InspAct_Chk02_HdrR.$insp_typ, Chk03_HdrR.$insp_typ);
				addColumnPathMap(InspAct_Chk02_HdrR.$insp_sts_typ, Chk03_HdrR.$insp_sts_typ);
				addColumnPathMap(InspAct_Chk02_HdrR.$insp_aprv_sts_typ, Chk03_HdrR.$insp_aprv_sts_typ);
				addColumnPathMap(InspAct_Chk02_HdrR.$itm_cd, Chk03_HdrR.$itm_cd);
				addColumnPathMap(InspAct_Chk02_HdrR.$itm_sub1, Chk03_HdrR.$itm_sub1);
				addColumnPathMap(InspAct_Chk02_HdrR.$itm_sub2, Chk03_HdrR.$itm_sub2);
				addColumnPathMap(InspAct_Chk02_HdrR.$itm_sub3, Chk03_HdrR.$itm_sub3);
				addColumnPathMap(InspAct_Chk02_HdrR.$lot_no, Chk03_HdrR.$lot_no);
				addColumnPathMap(InspAct_Chk02_HdrR.$sublot_no, Chk03_HdrR.$sublot_no);
				addColumnPathMap(InspAct_Chk02_HdrR.$ver_no, Chk03_HdrR.$ver_no);
				addColumnPathMap(InspAct_Chk02_HdrR.$judg_dt, Chk03_HdrR.$judg_dt);
				addColumnPathMap(InspAct_Chk02_HdrR.$insp_judg_rslt_typ, Chk03_HdrR.$insp_judg_rslt_typ);
				addColumnPathMap(InspAct_Chk02_HdrR.$judg_dpt_cd, Chk03_HdrR.$judg_dpt_cd);
				addColumnPathMap(InspAct_Chk02_HdrR.$judg_usr_cd, Chk03_HdrR.$judg_usr_cd);
				addColumnPathMap(InspAct_Chk02_HdrR.$judg_rsn, Chk03_HdrR.$judg_rsn);
				addColumnPathMap(InspAct_Chk02_HdrR.$intr_rmrks, Chk03_HdrR.$intr_rmrks);
				addColumnPathMap(InspAct_Chk02_HdrR.$lot_rmrks, Chk03_HdrR.$lot_rmrks);
				addColumnPathMap(InspAct_Chk02_HdrR.$sub_char1, Chk03_HdrR.$sub_char1);
				addColumnPathMap(InspAct_Chk02_HdrR.$sub_char2, Chk03_HdrR.$sub_char2);
				addColumnPathMap(InspAct_Chk02_HdrR.$sub_char3, Chk03_HdrR.$sub_char3);
				addColumnPathMap(InspAct_Chk02_HdrR.$inst_upd_cntr, Chk03_HdrR.$inst_upd_cntr);
				addColumnPathMap(InspAct_Chk02_HdrR.$vld_dt_upd_flg, Chk03_HdrR.$vld_dt_upd_flg);
				addColumnPathMap(InspAct_Chk02_HdrR.$lmt_dt_frm_typ, Chk03_HdrR.$lmt_dt_frm_typ);
				addColumnPathMap(InspAct_Chk02_HdrR.$lmt_dt_frm, Chk03_HdrR.$lmt_dt_frm);
				addColumnPathMap(InspAct_Chk02_HdrR.$vld_dt, Chk03_HdrR.$vld_dt);
				addColumnPathMap(InspAct_Chk02_HdrR.$lmt_dt, Chk03_HdrR.$lmt_dt);
			}
		}
		
		protected Map_InspAct_Chk02_DtlR_Chk03_DtlR<InspAct_Chk02_DtlR,Chk03_DtlR> createMap_InspAct_Chk02_DtlR_Chk03_DtlR() {
			return new Map_InspAct_Chk02_DtlR_Chk03_DtlR<InspAct_Chk02_DtlR, Chk03_DtlR>();
		}
		
		public class Map_InspAct_Chk02_DtlR_Chk03_DtlR<D extends InspAct_Chk02_DtlR, S extends Chk03_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk02_DtlR.$peg_no, Chk03_DtlR.$peg_no);
				addColumnPathMap(InspAct_Chk02_DtlR.$data_crud_typ, Chk03_DtlR.$data_crud_typ);
				addColumnPathMap(InspAct_Chk02_DtlR.$insp_no, Chk03_DtlR.$insp_no);
				addColumnPathMap(InspAct_Chk02_DtlR.$insp_act_no, Chk03_DtlR.$insp_act_no);
				addColumnPathMap(InspAct_Chk02_DtlR.$itm_cd, Chk03_DtlR.$itm_cd);
				addColumnPathMap(InspAct_Chk02_DtlR.$itm_sub1, Chk03_DtlR.$itm_sub1);
				addColumnPathMap(InspAct_Chk02_DtlR.$itm_sub2, Chk03_DtlR.$itm_sub2);
				addColumnPathMap(InspAct_Chk02_DtlR.$itm_sub3, Chk03_DtlR.$itm_sub3);
				addColumnPathMap(InspAct_Chk02_DtlR.$loc_cd, Chk03_DtlR.$loc_cd);
				addColumnPathMap(InspAct_Chk02_DtlR.$str_ln_cd, Chk03_DtlR.$str_ln_cd);
				addColumnPathMap(InspAct_Chk02_DtlR.$quality_typ, Chk03_DtlR.$quality_typ);
				addColumnPathMap(InspAct_Chk02_DtlR.$stk_insp_typ, Chk03_DtlR.$stk_insp_typ);
				addColumnPathMap(InspAct_Chk02_DtlR.$stk_id_typ, Chk03_DtlR.$stk_id_typ);
				addColumnPathMap(InspAct_Chk02_DtlR.$stk_bp_cd, Chk03_DtlR.$stk_bp_cd);
				addColumnPathMap(InspAct_Chk02_DtlR.$gd_cd, Chk03_DtlR.$gd_cd);
				addColumnPathMap(InspAct_Chk02_DtlR.$stk_arrv_bp_cd, Chk03_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(InspAct_Chk02_DtlR.$lot_no, Chk03_DtlR.$lot_no);
				addColumnPathMap(InspAct_Chk02_DtlR.$sublot_no, Chk03_DtlR.$sublot_no);
				addColumnPathMap(InspAct_Chk02_DtlR.$sno1, Chk03_DtlR.$sno1);
				addColumnPathMap(InspAct_Chk02_DtlR.$sno2, Chk03_DtlR.$sno2);
				addColumnPathMap(InspAct_Chk02_DtlR.$sno3, Chk03_DtlR.$sno3);
				addColumnPathMap(InspAct_Chk02_DtlR.$sno4, Chk03_DtlR.$sno4);
				addColumnPathMap(InspAct_Chk02_DtlR.$fix_no_typ, Chk03_DtlR.$fix_no_typ);
				addColumnPathMap(InspAct_Chk02_DtlR.$fix_no, Chk03_DtlR.$fix_no);
				addColumnPathMap(InspAct_Chk02_DtlR.$pack_unit_qty, Chk03_DtlR.$pack_unit_qty);
				addColumnPathMap(InspAct_Chk02_DtlR.$pack_unit_cd, Chk03_DtlR.$pack_unit_cd);
				addColumnPathMap(InspAct_Chk02_DtlR.$base_unit_qty, Chk03_DtlR.$base_unit_qty);
				addColumnPathMap(InspAct_Chk02_DtlR.$base_unit_cd, Chk03_DtlR.$base_unit_cd);
				addColumnPathMap(InspAct_Chk02_DtlR.$ac_dt, Chk03_DtlR.$ac_dt);
				addColumnPathMap(InspAct_Chk02_DtlR.$intr_rmrks, Chk03_DtlR.$intr_rmrks);
				addColumnPathMap(InspAct_Chk02_DtlR.$sub_char1, Chk03_DtlR.$sub_char1);
				addColumnPathMap(InspAct_Chk02_DtlR.$sub_char2, Chk03_DtlR.$sub_char2);
				addColumnPathMap(InspAct_Chk02_DtlR.$sub_char3, Chk03_DtlR.$sub_char3);
			}
		}
	}
	
	/**
	 * Chk04オペレーション.<p>
	 *
	 * 検査実績ヘッダを取り消す前に、チェックを実行する<br>
	 */
	public class Chk04 extends MSBFL_InspActReg_MC_A.Chk04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			
			if (!hasErr()) {
				callInspActChkSrv();
			}
			
			setDown();
		}
		
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査指図の更新カウンタチェック
			msgL.addAll(chkInstUpdCnt());

			// 検査実績の更新カウンタチェック
			msgL.addAll(chkActUpdCnt());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			// 場所の更新権限のチェック
			msgL.addAll(dacChk());

			return msgL;
		}

		/**
		 * 指図更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkInstUpdCnt() {
			MCMessageList msgL = new MCMessageList();
			
			MST_INSP_INST_R selectR = MST_INSP_INST_R.create("T");
			dbSelectKeyForUpdateNoWait("MSBFL0070_MST_INSP_INST_S04", selectR,
					MCQueryApiBuilder.create(selectR), up0());

			msgL.addAll(checkUpdCntrNE(up0(), Chk04_HdrR.$inst_upd_cntr, selectR));

			setErrFlg(up0(), msgL);
			compData(selectR);
			
			return msgL;
		}

		/**
		 * データ補完
		 * @param instR
		 */
		protected void compData(MST_INSP_INST_R instR) {
			if (!isNull(instR)) {
				up0().insp_sts_typ(instR.insp_sts_typ());
				up0().insp_aprv_sts_typ(instR.insp_aprv_sts_typ());
				up0().insp_typ(instR.insp_typ());
				up0().mfg_loc_cd(instR.mfg_loc_cd());
			}
		}
		/**
		 * 実績更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkActUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			if (up0().err_flg()) {
				return msgL;
			}
			MST_INSP_ACT_R selectR = MST_INSP_ACT_R.create("T");
			dbSelectKeyForUpdateNoWait("MSBFL0070_MST_INSP_ACT_S03", selectR,
					MCQueryApiBuilder.create(selectR), up0());

			msgL.addAll(checkUpdCntrNE(up0(), Chk04_HdrR.$act_upd_cntr, selectR));

			return msgL;
		}

		/**
		 * 場所の更新権限のチェックをします。
		 * 
		 * @return
		 */
		protected MCMessageList dacChk() {
			MCMessageList msgL = new MCMessageList();

			if (up0().err_flg()) {
				return msgL;
			}

			if (MSC_INSP_TYP.isPRDCT(up0().insp_typ())) {
				msgL.addAll(checkWritableLocCdDac(up0(), Chk04_HdrR.$mfg_loc_cd));
			}
			else {
				MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
				MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
				MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
				schdL_bldr.setWhere(t.insp_no.eq(bind("insp_no")), up0());
				dbSelect("MSBFL0070_MST_INSP_SCHD_S05", schdL, schdL_bldr);
				for (MST_INSP_SCHD_R schdR : schdL) {
					msgL.addAll(checkWritableLocCdDac(schdR, MST_INSP_SCHD_R.$loc_cd));
				}
				if (!schdL.isEmpty() && schdL.size() == msgL.size()) {
					up0().err_flg(true);
					return msgL;
				}
			}

			return msgL;
		}

		/**
		 * 検査実績サービスの取消前チェック処理を行う。
		 */
		protected void callInspActChkSrv() {
			MCList<Chk04_HdrR> up0L = MCList.create(Chk04_HdrR.class);
			up0L.add(up0());
			
			MSBFL_InspActService.InspAct_Chk04 o = MSBFL_InspActService.crtInspAct_Chk04();
			addAll(o.up0(), up0L, createMap_InspAct_Chk04_HdrR_Chk04_HdrR());
			addAll(o.up1(), up1(), createMap_InspAct_Chk04_DtlR_Chk04_DtlR());
			addAll(o.up2(), up2(), createMap_InspAct_Chk04_SmplR_Chk04_SmplR());
			o.exec();
			
			copyErrFlg(up0L, o.down0());
		}
		
		protected Map_InspAct_Chk04_HdrR_Chk04_HdrR<InspAct_Chk04_HdrR,Chk04_HdrR> createMap_InspAct_Chk04_HdrR_Chk04_HdrR() {
			return new Map_InspAct_Chk04_HdrR_Chk04_HdrR<InspAct_Chk04_HdrR, Chk04_HdrR>();
		}
		
		public class Map_InspAct_Chk04_HdrR_Chk04_HdrR<D extends InspAct_Chk04_HdrR, S extends Chk04_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk04_HdrR.$peg_no, Chk04_HdrR.$peg_no);
				addColumnPathMap(InspAct_Chk04_HdrR.$insp_no, Chk04_HdrR.$insp_no);
				addColumnPathMap(InspAct_Chk04_HdrR.$insp_act_no, Chk04_HdrR.$insp_act_no);
				addColumnPathMap(InspAct_Chk04_HdrR.$insp_sts_typ, Chk04_HdrR.$insp_sts_typ);
				addColumnPathMap(InspAct_Chk04_HdrR.$insp_aprv_sts_typ, Chk04_HdrR.$insp_aprv_sts_typ);
				addColumnPathMap(InspAct_Chk04_HdrR.$inst_upd_cntr, Chk04_HdrR.$inst_upd_cntr);
			}
		}
	}
	
	/**
	 * Chk05オペレーション.<p>
	 *
	 * 検査実績ヘッダを判定取り消す前に、チェックを実行する<br>
	 */
	public class Chk05 extends MSBFL_InspActReg_MC_A.Chk05 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			
			if (!hasErr()) {
				callInspActChkSrv();
			}
			
			setDown();
		}
		
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査指図の更新カウンタチェック
			msgL.addAll(chkInstUpdCnt());

			// 検査実績の更新カウンタチェック
			msgL.addAll(chkActUpdCnt());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			return super.doServerCheckSub();
		}

		/**
		 * 指図更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkInstUpdCnt() {
			MCMessageList msgL = new MCMessageList();
			
			MST_INSP_INST_R selectR = MST_INSP_INST_R.create("T");
			dbSelectKeyForUpdateNoWait("MSBFL0070_MST_INSP_INST_S05", selectR,
					MCQueryApiBuilder.create(selectR), up0());

			msgL.addAll(checkUpdCntrNE(up0(), Chk05_HdrR.$inst_upd_cntr, selectR));

			setErrFlg(up0(), msgL);
			compInst(selectR);
			
			return msgL;
		}
		
		protected void compInst(MST_INSP_INST_R instR) {
			if (!isNull(instR)) {
				up0().insp_sts_typ(instR.insp_sts_typ());
				up0().insp_aprv_sts_typ(instR.insp_aprv_sts_typ());
			}
		}
		/**
		 * 実績更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkActUpdCnt() {
			MCMessageList msgL = new MCMessageList();
			
			if (up0().err_flg()) {
				return msgL;
			}
			MST_INSP_ACT_R selectR = MST_INSP_ACT_R.create("T");
			dbSelectKeyForUpdateNoWait("MSBFL0070_MST_INSP_ACT_S04", selectR,
					MCQueryApiBuilder.create(selectR), up0());

			msgL.addAll(checkUpdCntrNE(up0(), Chk05_HdrR.$act_upd_cntr, selectR));
			
			compAct(selectR);
			
			return msgL;
		}
		
		protected void compAct(MST_INSP_ACT_R actR) {
			if (!isNull(actR)) {
				up0().insp_judg_rslt_typ(actR.insp_judg_rslt_typ());
			}
		}
		
		protected void callInspActChkSrv() {
			MCList<Chk05_HdrR> up0L = MCList.create(Chk05_HdrR.class);
			up0L.add(up0());
			
			MSBFL_InspActService.InspAct_Chk04 o = MSBFL_InspActService.crtInspAct_Chk04();
			addAll(o.up0(), up0L, createMap_InspAct_Chk04_HdrR_Chk05_HdrR());
			addAll(o.up1(), up1(), createMap_InspAct_Chk04_DtlR_Chk04_DtlR());
			o.exec();
			
			copyErrFlg(up0L, o.down0());
		}
		
		protected Map_InspAct_Chk04_HdrR_Chk05_HdrR<InspAct_Chk04_HdrR,Chk05_HdrR> createMap_InspAct_Chk04_HdrR_Chk05_HdrR() {
			return new Map_InspAct_Chk04_HdrR_Chk05_HdrR<InspAct_Chk04_HdrR, Chk05_HdrR>();
		}
		
		public class Map_InspAct_Chk04_HdrR_Chk05_HdrR<D extends InspAct_Chk04_HdrR, S extends Chk05_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk04_HdrR.$peg_no, Chk05_HdrR.$peg_no);
				addColumnPathMap(InspAct_Chk04_HdrR.$insp_no, Chk05_HdrR.$insp_no);
				addColumnPathMap(InspAct_Chk04_HdrR.$insp_act_no, Chk05_HdrR.$insp_act_no);
				addColumnPathMap(InspAct_Chk04_HdrR.$insp_sts_typ, Chk05_HdrR.$insp_sts_typ);
				addColumnPathMap(InspAct_Chk04_HdrR.$insp_aprv_sts_typ, Chk05_HdrR.$insp_aprv_sts_typ);
				addColumnPathMap(InspAct_Chk04_HdrR.$insp_judg_rslt_typ, Chk05_HdrR.$insp_judg_rslt_typ);
				addColumnPathMap(InspAct_Chk04_HdrR.$judg_rsn, Chk05_HdrR.$judg_rsn);
				addColumnPathMap(InspAct_Chk04_HdrR.$inst_upd_cntr, Chk05_HdrR.$inst_upd_cntr);
			}
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 検査実績ヘッダの登録を行う<br>
	 */
	public class Ins01 extends MSBFL_InspActReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			
			callThisChk01();
			
			throwUpdErr();
			
			callInspActUpdSrv();

			setDown();
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			MCList<Chk01_HdrR> up0L = MCList.create(Chk01_HdrR.class);
			up0L.add(up0());
			
			setPegNo(up0L);
			setPegNo(up1());
			setPegNo(up2());

			setCRUDTyp();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}

		/**
		 * データ更新区分を設定する。
		 */
		protected void setCRUDTyp() {
			// 実績明細
			for (Chk01_DtlR dtlR : up1()) {
				if (dtlR.isStatusCreate()) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (dtlR.isStatusDelete()) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else if (dtlR.isStatusModify())  {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
			// 抜取明細
			for (Chk01_SmplR smplR : up2()) {
				if (smplR.isStatusCreate()) {
					smplR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (smplR.isStatusDelete()) {
					smplR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else if (smplR.isStatusModify())  {
					smplR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBFL_InspActReg.Chk01 o = MSBFL_InspActReg.crtChk01();
			
			Chk01_HdrR.copyall(o.up0(), up0());
			o.up1().setAll(up1());
			o.up2().setAll(up2());
			
			o.exec();
			
			MCRow.copyall(up0(), o.down0());
			up1().setAll(o.down1());
			up2().setAll(o.down2());
		}
		
		protected void callInspActUpdSrv() {
			MCList<Chk01_HdrR> up0L = MCList.create(Chk01_HdrR.class);
			up0L.add(up0());
			
			MSBFL_InspActService.InspAct_Upd01 o = mcframe.serverMSBF.MSBFL5050.MSBFL_InspActService.crtInspAct_Upd01();
			
			addAll(o.up0(), up0L, createMap_InspAct_Upd01_HdrR_Chk01_HdrR());
			addAll(o.up1(), up1(), createMap_InspAct_Upd01_DtlR_Chk01_DtlR());
			addAll(o.up2(), up2(), createMap_InspAct_Upd01_SmplR_Chk01_SmplR());
			
			o.exec();
			
			String[] hdrDestCols = new String[] {Chk01_HdrR.$insp_no, Chk01_HdrR.$insp_act_no, Chk01_HdrR.$insp_sts_typ, Chk01_HdrR.$insp_sts_typ_nm, Chk01_HdrR.$insp_aprv_sts_typ, Chk01_HdrR.$insp_aprv_sts_typ_nm};
			String[] hdrSrcCols = new String[] {InspAct_Upd01_HdrR.$insp_no, InspAct_Upd01_HdrR.$insp_act_no, InspAct_Upd01_HdrR.$insp_sts_typ, InspAct_Upd01_HdrR.$insp_sts_typ_nm, InspAct_Upd01_HdrR.$insp_aprv_sts_typ, InspAct_Upd01_HdrR.$insp_aprv_sts_typ_nm};
			copyByPegNo(up0L, hdrDestCols, o.down0(), hdrSrcCols);
			
			String[] dtlDestCols = new String[] {Chk01_DtlR.$insp_act_d_no, Chk01_DtlR.$insp_act_no};
			String[] dtlSrcCols = new String[] {InspAct_Upd01_DtlR.$insp_act_d_no, InspAct_Upd01_DtlR.$insp_act_no};
			copyByPegNo(up1(), dtlDestCols, o.down1(), dtlSrcCols);
			
			String[] smplDestCols = new String[] {Chk01_SmplR.$insp_smpl_act_no, Chk01_SmplR.$insp_act_no};
			String[] smplSrcCols = new String[] {InspAct_Upd01_SmplR.$insp_smpl_act_no, InspAct_Upd01_SmplR.$insp_act_no};
			copyByPegNo(up2(), smplDestCols, o.down2(), smplSrcCols);
		}
		
		protected Map_InspAct_Upd01_HdrR_Chk01_HdrR<InspAct_Upd01_HdrR,Chk01_HdrR> createMap_InspAct_Upd01_HdrR_Chk01_HdrR() {
			return new Map_InspAct_Upd01_HdrR_Chk01_HdrR<InspAct_Upd01_HdrR, Chk01_HdrR>();
		}
		
		public class Map_InspAct_Upd01_HdrR_Chk01_HdrR<D extends InspAct_Upd01_HdrR, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Upd01_HdrR.$peg_no, Chk01_HdrR.$peg_no);
				addColumnPathMap(InspAct_Upd01_HdrR.$insp_no, Chk01_HdrR.$insp_no);
				addColumnPathMap(InspAct_Upd01_HdrR.$insp_act_no, Chk01_HdrR.$insp_act_no);
				addColumnPathMap(InspAct_Upd01_HdrR.$insp_freq, Chk01_HdrR.$insp_freq);
				addColumnPathMap(InspAct_Upd01_HdrR.$src_no1, Chk01_HdrR.$src_no1);
				addColumnPathMap(InspAct_Upd01_HdrR.$src_no2, Chk01_HdrR.$src_no2);
				addColumnPathMap(InspAct_Upd01_HdrR.$insp_typ, Chk01_HdrR.$insp_typ);
				addColumnPathMap(InspAct_Upd01_HdrR.$insp_mtd_typ, Chk01_HdrR.$insp_mtd_typ);
				addColumnPathMap(InspAct_Upd01_HdrR.$insp_sts_typ, Chk01_HdrR.$insp_sts_typ);
				addColumnPathMap(InspAct_Upd01_HdrR.$insp_aprv_sts_typ, Chk01_HdrR.$insp_aprv_sts_typ);
				addColumnPathMap(InspAct_Upd01_HdrR.$itm_cd, Chk01_HdrR.$itm_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$itm_sub1, Chk01_HdrR.$itm_sub1);
				addColumnPathMap(InspAct_Upd01_HdrR.$itm_sub2, Chk01_HdrR.$itm_sub2);
				addColumnPathMap(InspAct_Upd01_HdrR.$itm_sub3, Chk01_HdrR.$itm_sub3);
				addColumnPathMap(InspAct_Upd01_HdrR.$lot_no, Chk01_HdrR.$lot_no);
				addColumnPathMap(InspAct_Upd01_HdrR.$sublot_no, Chk01_HdrR.$sublot_no);
				addColumnPathMap(InspAct_Upd01_HdrR.$ver_no, Chk01_HdrR.$ver_no);
				addColumnPathMap(InspAct_Upd01_HdrR.$quality_typ, Chk01_HdrR.$quality_typ);
				addColumnPathMap(InspAct_Upd01_HdrR.$gd_cd, Chk01_HdrR.$gd_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$dfct_rsn_cd, Chk01_HdrR.$dfct_rsn_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$sppl_cd, Chk01_HdrR.$sppl_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$maker_cd, Chk01_HdrR.$maker_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$mfg_loc_cd, Chk01_HdrR.$mfg_loc_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$from_site_cd, Chk01_HdrR.$from_site_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$base_unit_qty, Chk01_HdrR.$base_unit_qty);
				addColumnPathMap(InspAct_Upd01_HdrR.$base_unit_cd, Chk01_HdrR.$base_unit_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$ttl_stk_qty, Chk01_HdrR.$ttl_stk_qty);
				addColumnPathMap(InspAct_Upd01_HdrR.$st_tm, Chk01_HdrR.$st_tm);
				addColumnPathMap(InspAct_Upd01_HdrR.$end_tm, Chk01_HdrR.$end_tm);
				addColumnPathMap(InspAct_Upd01_HdrR.$act_usr_cd, Chk01_HdrR.$act_usr_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$act_dpt_cd, Chk01_HdrR.$act_dpt_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$lmt_dt_frm_typ, Chk01_HdrR.$lmt_dt_frm_typ);
				addColumnPathMap(InspAct_Upd01_HdrR.$lmt_dt_frm, Chk01_HdrR.$lmt_dt_frm);
				addColumnPathMap(InspAct_Upd01_HdrR.$vld_dt, Chk01_HdrR.$vld_dt);
				addColumnPathMap(InspAct_Upd01_HdrR.$lmt_dt, Chk01_HdrR.$lmt_dt);
				addColumnPathMap(InspAct_Upd01_HdrR.$act_cont_fctr, Chk01_HdrR.$act_cont_fctr);
				addColumnPathMap(InspAct_Upd01_HdrR.$intr_rmrks, Chk01_HdrR.$intr_rmrks);
				addColumnPathMap(InspAct_Upd01_HdrR.$lot_rmrks, Chk01_HdrR.$lot_rmrks);
				addColumnPathMap(InspAct_Upd01_HdrR.$sub_char1, Chk01_HdrR.$sub_char1);
				addColumnPathMap(InspAct_Upd01_HdrR.$sub_char2, Chk01_HdrR.$sub_char2);
				addColumnPathMap(InspAct_Upd01_HdrR.$sub_char3, Chk01_HdrR.$sub_char3);
				addColumnPathMap(InspAct_Upd01_HdrR.$vld_dt_upd_flg, Chk01_HdrR.$vld_dt_upd_flg);
			}
		}
		
		protected Map_InspAct_Upd01_DtlR_Chk01_DtlR<InspAct_Upd01_DtlR,Chk01_DtlR> createMap_InspAct_Upd01_DtlR_Chk01_DtlR() {
			return new Map_InspAct_Upd01_DtlR_Chk01_DtlR<InspAct_Upd01_DtlR, Chk01_DtlR>();
		}
		
		public class Map_InspAct_Upd01_DtlR_Chk01_DtlR<D extends InspAct_Upd01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Upd01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
				addColumnPathMap(InspAct_Upd01_DtlR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$insp_no, Chk01_DtlR.$insp_no);
				addColumnPathMap(InspAct_Upd01_DtlR.$insp_act_d_no, Chk01_DtlR.$insp_act_d_no);
				addColumnPathMap(InspAct_Upd01_DtlR.$insp_act_no, Chk01_DtlR.$insp_act_no);
				addColumnPathMap(InspAct_Upd01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
				addColumnPathMap(InspAct_Upd01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
				addColumnPathMap(InspAct_Upd01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
				addColumnPathMap(InspAct_Upd01_DtlR.$loc_cd, Chk01_DtlR.$loc_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$str_ln_cd, Chk01_DtlR.$str_ln_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$quality_typ, Chk01_DtlR.$quality_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$stk_insp_typ, Chk01_DtlR.$stk_insp_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$stk_id_typ, Chk01_DtlR.$stk_id_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$stk_bp_cd, Chk01_DtlR.$stk_bp_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$gd_cd, Chk01_DtlR.$gd_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$stk_arrv_bp_cd, Chk01_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$lot_no, Chk01_DtlR.$lot_no);
				addColumnPathMap(InspAct_Upd01_DtlR.$sublot_no, Chk01_DtlR.$sublot_no);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno1, Chk01_DtlR.$sno1);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno1_mng_typ, Chk01_DtlR.$sno1_mng_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno2, Chk01_DtlR.$sno2);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno2_mng_typ, Chk01_DtlR.$sno2_mng_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno3, Chk01_DtlR.$sno3);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno3_mng_typ, Chk01_DtlR.$sno3_mng_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno4, Chk01_DtlR.$sno4);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno4_mng_typ, Chk01_DtlR.$sno4_mng_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$fix_no_typ, Chk01_DtlR.$fix_no_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$fix_no, Chk01_DtlR.$fix_no);
				addColumnPathMap(InspAct_Upd01_DtlR.$pack_unit_qty, Chk01_DtlR.$pack_unit_qty);
				addColumnPathMap(InspAct_Upd01_DtlR.$pack_unit_cd, Chk01_DtlR.$pack_unit_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
				addColumnPathMap(InspAct_Upd01_DtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$pack_xfr_pack_unit_qty, Chk01_DtlR.$pack_xfr_pack_unit_qty);
				addColumnPathMap(InspAct_Upd01_DtlR.$pack_xfr_pack_unit_cd, Chk01_DtlR.$pack_xfr_pack_unit_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$pack_xfr_base_unit_qty, Chk01_DtlR.$pack_xfr_base_unit_qty);
				addColumnPathMap(InspAct_Upd01_DtlR.$pack_xfr_base_unit_cd, Chk01_DtlR.$pack_xfr_base_unit_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$dfct_rsn_cd, Chk01_DtlR.$dfct_rsn_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$ac_dt, Chk01_DtlR.$ac_dt);
				addColumnPathMap(InspAct_Upd01_DtlR.$intr_rmrks, Chk01_DtlR.$intr_rmrks);
				addColumnPathMap(InspAct_Upd01_DtlR.$sub_char1, Chk01_DtlR.$sub_char1);
				addColumnPathMap(InspAct_Upd01_DtlR.$sub_char2, Chk01_DtlR.$sub_char2);
				addColumnPathMap(InspAct_Upd01_DtlR.$sub_char3, Chk01_DtlR.$sub_char3);
			}
		}
		
		protected Map_InspAct_Upd01_SmplR_Chk01_SmplR<InspAct_Upd01_SmplR,Chk01_SmplR> createMap_InspAct_Upd01_SmplR_Chk01_SmplR() {
			return new Map_InspAct_Upd01_SmplR_Chk01_SmplR<InspAct_Upd01_SmplR, Chk01_SmplR>();
		}
		
		public class Map_InspAct_Upd01_SmplR_Chk01_SmplR<D extends InspAct_Upd01_SmplR, S extends Chk01_SmplR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Upd01_SmplR.$peg_no, Chk01_SmplR.$peg_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$data_crud_typ, Chk01_SmplR.$data_crud_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$insp_no, Chk01_SmplR.$insp_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$insp_smpl_act_no, Chk01_SmplR.$insp_smpl_act_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$insp_act_no, Chk01_SmplR.$insp_act_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$insp_schd_no, Chk01_SmplR.$insp_schd_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$itm_cd, Chk01_SmplR.$itm_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$itm_sub1, Chk01_SmplR.$itm_sub1);
				addColumnPathMap(InspAct_Upd01_SmplR.$itm_sub2, Chk01_SmplR.$itm_sub2);
				addColumnPathMap(InspAct_Upd01_SmplR.$itm_sub3, Chk01_SmplR.$itm_sub3);
				addColumnPathMap(InspAct_Upd01_SmplR.$so_qty, Chk01_SmplR.$so_qty);
				addColumnPathMap(InspAct_Upd01_SmplR.$smpl_qty, Chk01_SmplR.$smpl_qty);
				addColumnPathMap(InspAct_Upd01_SmplR.$base_unit_cd, Chk01_SmplR.$base_unit_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$pack_xfr_pack_unit_qty, Chk01_SmplR.$pack_xfr_pack_unit_qty);
				addColumnPathMap(InspAct_Upd01_SmplR.$pack_xfr_pack_unit_cd, Chk01_SmplR.$pack_xfr_pack_unit_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$pack_xfr_base_unit_qty, Chk01_SmplR.$pack_xfr_base_unit_qty);
				addColumnPathMap(InspAct_Upd01_SmplR.$pack_xfr_base_unit_cd, Chk01_SmplR.$pack_xfr_base_unit_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$loc_cd, Chk01_SmplR.$loc_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$str_ln_cd, Chk01_SmplR.$str_ln_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$quality_typ, Chk01_SmplR.$quality_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$stk_insp_typ, Chk01_SmplR.$stk_insp_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$stk_id_typ, Chk01_SmplR.$stk_id_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$stk_bp_cd, Chk01_SmplR.$stk_bp_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$gd_cd, Chk01_SmplR.$gd_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$stk_arrv_bp_cd, Chk01_SmplR.$stk_arrv_bp_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$lot_no, Chk01_SmplR.$lot_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$sublot_no, Chk01_SmplR.$sublot_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno1, Chk01_SmplR.$sno1);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno1_mng_typ, Chk01_SmplR.$sno1_mng_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno2, Chk01_SmplR.$sno2);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno2_mng_typ, Chk01_SmplR.$sno2_mng_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno3, Chk01_SmplR.$sno3);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno3_mng_typ, Chk01_SmplR.$sno3_mng_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno4, Chk01_SmplR.$sno4);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno4_mng_typ, Chk01_SmplR.$sno4_mng_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$fix_no_typ, Chk01_SmplR.$fix_no_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$fix_no, Chk01_SmplR.$fix_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$act_tm, Chk01_SmplR.$act_tm);
				addColumnPathMap(InspAct_Upd01_SmplR.$ac_dt, Chk01_SmplR.$ac_dt);
				addColumnPathMap(InspAct_Upd01_SmplR.$bd_dpt_cd, Chk01_SmplR.$bd_dpt_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$trd_rmrks, Chk01_SmplR.$trd_rmrks);
				addColumnPathMap(InspAct_Upd01_SmplR.$intr_rmrks, Chk01_SmplR.$intr_rmrks);
				addColumnPathMap(InspAct_Upd01_SmplR.$sub_char1, Chk01_SmplR.$sub_char1);
				addColumnPathMap(InspAct_Upd01_SmplR.$sub_char2, Chk01_SmplR.$sub_char2);
				addColumnPathMap(InspAct_Upd01_SmplR.$sub_char3, Chk01_SmplR.$sub_char3);
			}
		}
	}
	
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 検査実績ヘッダの更新を行う<br>
	 */
	public class Upd01 extends MSBFL_InspActReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk02();
			throwUpdErr();
			callInspActUpdSrv();
			setDown();
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			MCList<Chk02_HdrR> up0L = MCList.create(Chk02_HdrR.class);
			up0L.add(up0());
			
			setPegNo(up0L);
			setPegNo(up1());
			setPegNo(up2());

			setCRUDTyp();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}

		/**
		 * データ更新区分を設定する。
		 */
		protected void setCRUDTyp() {
			// 実績明細
			for (Chk02_DtlR dtlR : up1()) {
				if (dtlR.isStatusCreate()) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (dtlR.isStatusDelete()) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else if (dtlR.isStatusModify())  {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
			// 抜取明細
			for (Chk02_SmplR smplR : up2()) {
				if (smplR.isStatusCreate()) {
					smplR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (smplR.isStatusDelete()) {
					smplR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else if (smplR.isStatusModify())  {
					smplR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBFL_InspActReg.Chk02 o = MSBFL_InspActReg.crtChk02();
			
			Chk02_HdrR.copyall(o.up0(), up0());
			o.up1().setAll(up1());
			o.up2().setAll(up2());
			
			o.exec();
			
			MCRow.copyall(up0(), o.down0());
			up1().setAll(o.down1());
			up2().setAll(o.down2());
		}
		
		protected void callInspActUpdSrv() {
			MCList<Chk02_HdrR> up0L = MCList.create(Chk02_HdrR.class);
			up0L.add(up0());
			
			MSBFL_InspActService.InspAct_Upd01 o = MSBFL_InspActService.crtInspAct_Upd01();
			
			addAll(o.up0(), up0L, createMap_InspAct_Upd01_HdrR_Chk02_HdrR());
			addAll(o.up1(), up1(), createMap_InspAct_Upd01_DtlR_Chk02_DtlR());
			addAll(o.up2(), up2(), createMap_InspAct_Upd01_SmplR_Chk02_SmplR());
			
			o.exec();
			
			String[] hdrDestCols = new String[] {Chk02_HdrR.$insp_no, Chk02_HdrR.$insp_act_no, Chk02_HdrR.$insp_sts_typ, Chk02_HdrR.$insp_sts_typ_nm, Chk02_HdrR.$insp_aprv_sts_typ, Chk02_HdrR.$insp_aprv_sts_typ_nm};
			String[] hdrSrcCols = new String[] {InspAct_Upd01_HdrR.$insp_no, InspAct_Upd01_HdrR.$insp_act_no, InspAct_Upd01_HdrR.$insp_sts_typ, InspAct_Upd01_HdrR.$insp_sts_typ_nm, InspAct_Upd01_HdrR.$insp_aprv_sts_typ, InspAct_Upd01_HdrR.$insp_aprv_sts_typ_nm};
			copyByPegNo(up0L, hdrDestCols, o.down0(), hdrSrcCols);
			
			String[] dtlDestCols = new String[] {Chk02_DtlR.$insp_act_d_no, Chk02_DtlR.$insp_act_no};
			String[] dtlSrcCols = new String[] {InspAct_Upd01_DtlR.$insp_act_d_no, InspAct_Upd01_DtlR.$insp_act_no};
			copyByPegNo(up1(), dtlDestCols, o.down1(), dtlSrcCols);
			
			String[] smplDestCols = new String[] {Chk02_SmplR.$insp_smpl_act_no, Chk02_SmplR.$insp_act_no};
			String[] smplSrcCols = new String[] {InspAct_Upd01_SmplR.$insp_smpl_act_no, InspAct_Upd01_SmplR.$insp_act_no};
			copyByPegNo(up2(), smplDestCols, o.down2(), smplSrcCols);
		}
		
		protected Map_InspAct_Upd01_HdrR_Chk02_HdrR<InspAct_Upd01_HdrR,Chk02_HdrR> createMap_InspAct_Upd01_HdrR_Chk02_HdrR() {
			return new Map_InspAct_Upd01_HdrR_Chk02_HdrR<InspAct_Upd01_HdrR, Chk02_HdrR>();
		}
		
		public class Map_InspAct_Upd01_HdrR_Chk02_HdrR<D extends InspAct_Upd01_HdrR, S extends Chk02_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Upd01_HdrR.$peg_no, Chk02_HdrR.$peg_no);
				addColumnPathMap(InspAct_Upd01_HdrR.$insp_no, Chk02_HdrR.$insp_no);
				addColumnPathMap(InspAct_Upd01_HdrR.$insp_act_no, Chk02_HdrR.$insp_act_no);
				addColumnPathMap(InspAct_Upd01_HdrR.$insp_freq, Chk02_HdrR.$insp_freq);
				addColumnPathMap(InspAct_Upd01_HdrR.$src_no1, Chk02_HdrR.$src_no1);
				addColumnPathMap(InspAct_Upd01_HdrR.$src_no2, Chk02_HdrR.$src_no2);
				addColumnPathMap(InspAct_Upd01_HdrR.$insp_typ, Chk02_HdrR.$insp_typ);
				addColumnPathMap(InspAct_Upd01_HdrR.$insp_mtd_typ, Chk02_HdrR.$insp_mtd_typ);
				addColumnPathMap(InspAct_Upd01_HdrR.$insp_sts_typ, Chk02_HdrR.$insp_sts_typ);
				addColumnPathMap(InspAct_Upd01_HdrR.$insp_aprv_sts_typ, Chk02_HdrR.$insp_aprv_sts_typ);
				addColumnPathMap(InspAct_Upd01_HdrR.$itm_cd, Chk02_HdrR.$itm_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$itm_sub1, Chk02_HdrR.$itm_sub1);
				addColumnPathMap(InspAct_Upd01_HdrR.$itm_sub2, Chk02_HdrR.$itm_sub2);
				addColumnPathMap(InspAct_Upd01_HdrR.$itm_sub3, Chk02_HdrR.$itm_sub3);
				addColumnPathMap(InspAct_Upd01_HdrR.$lot_no, Chk02_HdrR.$lot_no);
				addColumnPathMap(InspAct_Upd01_HdrR.$sublot_no, Chk02_HdrR.$sublot_no);
				addColumnPathMap(InspAct_Upd01_HdrR.$ver_no, Chk02_HdrR.$ver_no);
				addColumnPathMap(InspAct_Upd01_HdrR.$quality_typ, Chk02_HdrR.$quality_typ);
				addColumnPathMap(InspAct_Upd01_HdrR.$gd_cd, Chk02_HdrR.$gd_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$dfct_rsn_cd, Chk02_HdrR.$dfct_rsn_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$sppl_cd, Chk02_HdrR.$sppl_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$maker_cd, Chk02_HdrR.$maker_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$mfg_loc_cd, Chk02_HdrR.$mfg_loc_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$from_site_cd, Chk02_HdrR.$from_site_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$base_unit_qty, Chk02_HdrR.$base_unit_qty);
				addColumnPathMap(InspAct_Upd01_HdrR.$base_unit_cd, Chk02_HdrR.$base_unit_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$ttl_stk_qty, Chk02_HdrR.$ttl_stk_qty);
				addColumnPathMap(InspAct_Upd01_HdrR.$st_tm, Chk02_HdrR.$st_tm);
				addColumnPathMap(InspAct_Upd01_HdrR.$end_tm, Chk02_HdrR.$end_tm);
				addColumnPathMap(InspAct_Upd01_HdrR.$act_usr_cd, Chk02_HdrR.$act_usr_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$act_dpt_cd, Chk02_HdrR.$act_dpt_cd);
				addColumnPathMap(InspAct_Upd01_HdrR.$lmt_dt_frm_typ, Chk02_HdrR.$lmt_dt_frm_typ);
				addColumnPathMap(InspAct_Upd01_HdrR.$lmt_dt_frm, Chk02_HdrR.$lmt_dt_frm);
				addColumnPathMap(InspAct_Upd01_HdrR.$vld_dt, Chk02_HdrR.$vld_dt);
				addColumnPathMap(InspAct_Upd01_HdrR.$lmt_dt, Chk02_HdrR.$lmt_dt);
				addColumnPathMap(InspAct_Upd01_HdrR.$act_cont_fctr, Chk02_HdrR.$act_cont_fctr);
				addColumnPathMap(InspAct_Upd01_HdrR.$intr_rmrks, Chk02_HdrR.$intr_rmrks);
				addColumnPathMap(InspAct_Upd01_HdrR.$lot_rmrks, Chk02_HdrR.$lot_rmrks);
				addColumnPathMap(InspAct_Upd01_HdrR.$sub_char1, Chk02_HdrR.$sub_char1);
				addColumnPathMap(InspAct_Upd01_HdrR.$sub_char2, Chk02_HdrR.$sub_char2);
				addColumnPathMap(InspAct_Upd01_HdrR.$sub_char3, Chk02_HdrR.$sub_char3);
				addColumnPathMap(InspAct_Upd01_HdrR.$vld_dt_upd_flg, Chk02_HdrR.$vld_dt_upd_flg);
				addColumnPathMap(InspAct_Upd01_HdrR.$stt_can_ac_dt, Chk02_HdrR.$stt_can_ac_dt);
			}
		}
		
		protected Map_InspAct_Upd01_DtlR_Chk02_DtlR<InspAct_Upd01_DtlR,Chk02_DtlR> createMap_InspAct_Upd01_DtlR_Chk02_DtlR() {
			return new Map_InspAct_Upd01_DtlR_Chk02_DtlR<InspAct_Upd01_DtlR, Chk02_DtlR>();
		}
		
		public class Map_InspAct_Upd01_DtlR_Chk02_DtlR<D extends InspAct_Upd01_DtlR, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Upd01_DtlR.$peg_no, Chk02_DtlR.$peg_no);
				addColumnPathMap(InspAct_Upd01_DtlR.$data_crud_typ, Chk02_DtlR.$data_crud_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$insp_no, Chk02_DtlR.$insp_no);
				addColumnPathMap(InspAct_Upd01_DtlR.$insp_act_d_no, Chk02_DtlR.$insp_act_d_no);
				addColumnPathMap(InspAct_Upd01_DtlR.$insp_act_no, Chk02_DtlR.$insp_act_no);
				addColumnPathMap(InspAct_Upd01_DtlR.$itm_cd, Chk02_DtlR.$itm_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$itm_sub1, Chk02_DtlR.$itm_sub1);
				addColumnPathMap(InspAct_Upd01_DtlR.$itm_sub2, Chk02_DtlR.$itm_sub2);
				addColumnPathMap(InspAct_Upd01_DtlR.$itm_sub3, Chk02_DtlR.$itm_sub3);
				addColumnPathMap(InspAct_Upd01_DtlR.$loc_cd, Chk02_DtlR.$loc_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$str_ln_cd, Chk02_DtlR.$str_ln_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$quality_typ, Chk02_DtlR.$quality_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$stk_insp_typ, Chk02_DtlR.$stk_insp_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$stk_id_typ, Chk02_DtlR.$stk_id_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$stk_bp_cd, Chk02_DtlR.$stk_bp_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$gd_cd, Chk02_DtlR.$gd_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$stk_arrv_bp_cd, Chk02_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$lot_no, Chk02_DtlR.$lot_no);
				addColumnPathMap(InspAct_Upd01_DtlR.$sublot_no, Chk02_DtlR.$sublot_no);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno1, Chk02_DtlR.$sno1);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno1_mng_typ, Chk02_DtlR.$sno1_mng_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno2, Chk02_DtlR.$sno2);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno2_mng_typ, Chk02_DtlR.$sno2_mng_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno3, Chk02_DtlR.$sno3);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno3_mng_typ, Chk02_DtlR.$sno3_mng_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno4, Chk02_DtlR.$sno4);
				addColumnPathMap(InspAct_Upd01_DtlR.$sno4_mng_typ, Chk02_DtlR.$sno4_mng_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$fix_no_typ, Chk02_DtlR.$fix_no_typ);
				addColumnPathMap(InspAct_Upd01_DtlR.$fix_no, Chk02_DtlR.$fix_no);
				addColumnPathMap(InspAct_Upd01_DtlR.$pack_unit_qty, Chk02_DtlR.$pack_unit_qty);
				addColumnPathMap(InspAct_Upd01_DtlR.$pack_unit_cd, Chk02_DtlR.$pack_unit_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$base_unit_qty, Chk02_DtlR.$base_unit_qty);
				addColumnPathMap(InspAct_Upd01_DtlR.$base_unit_cd, Chk02_DtlR.$base_unit_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$pack_xfr_pack_unit_qty, Chk02_DtlR.$pack_xfr_pack_unit_qty);
				addColumnPathMap(InspAct_Upd01_DtlR.$pack_xfr_pack_unit_cd, Chk02_DtlR.$pack_xfr_pack_unit_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$pack_xfr_base_unit_qty, Chk02_DtlR.$pack_xfr_base_unit_qty);
				addColumnPathMap(InspAct_Upd01_DtlR.$pack_xfr_base_unit_cd, Chk02_DtlR.$pack_xfr_base_unit_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$dfct_rsn_cd, Chk02_DtlR.$dfct_rsn_cd);
				addColumnPathMap(InspAct_Upd01_DtlR.$ac_dt, Chk02_DtlR.$ac_dt);
				addColumnPathMap(InspAct_Upd01_DtlR.$can_ac_dt, Chk02_DtlR.$can_ac_dt);
				addColumnPathMap(InspAct_Upd01_DtlR.$intr_rmrks, Chk02_DtlR.$intr_rmrks);
				addColumnPathMap(InspAct_Upd01_DtlR.$sub_char1, Chk02_DtlR.$sub_char1);
				addColumnPathMap(InspAct_Upd01_DtlR.$sub_char2, Chk02_DtlR.$sub_char2);
				addColumnPathMap(InspAct_Upd01_DtlR.$sub_char3, Chk02_DtlR.$sub_char3);
				addColumnPathMap(InspAct_Upd01_DtlR.$rmrks_upd_flg, Chk02_DtlR.$rmrks_upd_flg);
			}
		}
		
		protected Map_InspAct_Upd01_SmplR_Chk02_SmplR<InspAct_Upd01_SmplR,Chk02_SmplR> createMap_InspAct_Upd01_SmplR_Chk02_SmplR() {
			return new Map_InspAct_Upd01_SmplR_Chk02_SmplR<InspAct_Upd01_SmplR, Chk02_SmplR>();
		}
		
		public class Map_InspAct_Upd01_SmplR_Chk02_SmplR<D extends InspAct_Upd01_SmplR, S extends Chk02_SmplR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Upd01_SmplR.$peg_no, Chk02_SmplR.$peg_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$data_crud_typ, Chk02_SmplR.$data_crud_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$insp_no, Chk02_SmplR.$insp_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$insp_smpl_act_no, Chk02_SmplR.$insp_smpl_act_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$insp_schd_no, Chk02_SmplR.$insp_schd_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$insp_act_no, Chk02_SmplR.$insp_act_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$itm_cd, Chk02_SmplR.$itm_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$itm_sub1, Chk02_SmplR.$itm_sub1);
				addColumnPathMap(InspAct_Upd01_SmplR.$itm_sub2, Chk02_SmplR.$itm_sub2);
				addColumnPathMap(InspAct_Upd01_SmplR.$itm_sub3, Chk02_SmplR.$itm_sub3);
				addColumnPathMap(InspAct_Upd01_SmplR.$so_qty, Chk02_SmplR.$so_qty);
				addColumnPathMap(InspAct_Upd01_SmplR.$smpl_qty, Chk02_SmplR.$smpl_qty);
				addColumnPathMap(InspAct_Upd01_SmplR.$base_unit_cd, Chk02_SmplR.$base_unit_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$pack_xfr_pack_unit_qty, Chk02_SmplR.$pack_xfr_pack_unit_qty);
				addColumnPathMap(InspAct_Upd01_SmplR.$pack_xfr_pack_unit_cd, Chk02_SmplR.$pack_xfr_pack_unit_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$pack_xfr_base_unit_qty, Chk02_SmplR.$pack_xfr_base_unit_qty);
				addColumnPathMap(InspAct_Upd01_SmplR.$pack_xfr_base_unit_cd, Chk02_SmplR.$pack_xfr_base_unit_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$loc_cd, Chk02_SmplR.$loc_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$str_ln_cd, Chk02_SmplR.$str_ln_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$quality_typ, Chk02_SmplR.$quality_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$stk_insp_typ, Chk02_SmplR.$stk_insp_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$stk_id_typ, Chk02_SmplR.$stk_id_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$stk_bp_cd, Chk02_SmplR.$stk_bp_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$gd_cd, Chk02_SmplR.$gd_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$stk_arrv_bp_cd, Chk02_SmplR.$stk_arrv_bp_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$lot_no, Chk02_SmplR.$lot_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$sublot_no, Chk02_SmplR.$sublot_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno1, Chk02_SmplR.$sno1);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno1_mng_typ, Chk02_SmplR.$sno1_mng_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno2, Chk02_SmplR.$sno2);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno2_mng_typ, Chk02_SmplR.$sno2_mng_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno3, Chk02_SmplR.$sno3);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno3_mng_typ, Chk02_SmplR.$sno3_mng_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno4, Chk02_SmplR.$sno4);
				addColumnPathMap(InspAct_Upd01_SmplR.$sno4_mng_typ, Chk02_SmplR.$sno4_mng_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$fix_no_typ, Chk02_SmplR.$fix_no_typ);
				addColumnPathMap(InspAct_Upd01_SmplR.$fix_no, Chk02_SmplR.$fix_no);
				addColumnPathMap(InspAct_Upd01_SmplR.$act_tm, Chk02_SmplR.$act_tm);
				addColumnPathMap(InspAct_Upd01_SmplR.$ac_dt, Chk02_SmplR.$ac_dt);
				addColumnPathMap(InspAct_Upd01_SmplR.$can_ac_dt, Chk02_SmplR.$can_ac_dt);
				addColumnPathMap(InspAct_Upd01_SmplR.$bd_dpt_cd, Chk02_SmplR.$bd_dpt_cd);
				addColumnPathMap(InspAct_Upd01_SmplR.$trd_rmrks, Chk02_SmplR.$trd_rmrks);
				addColumnPathMap(InspAct_Upd01_SmplR.$intr_rmrks, Chk02_SmplR.$intr_rmrks);
				addColumnPathMap(InspAct_Upd01_SmplR.$sub_char1, Chk02_SmplR.$sub_char1);
				addColumnPathMap(InspAct_Upd01_SmplR.$sub_char2, Chk02_SmplR.$sub_char2);
				addColumnPathMap(InspAct_Upd01_SmplR.$sub_char3, Chk02_SmplR.$sub_char3);
				addColumnPathMap(InspAct_Upd01_SmplR.$rmrks_upd_flg, Chk02_SmplR.$rmrks_upd_flg);
			}
		}
	}
	
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 検査実績ヘッダの判定を行う<br>
	 */
	public class Upd02 extends MSBFL_InspActReg_MC_A.Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk03();
			throwUpdErr();
			callInspActUpdSrv();
			setDown();
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			MCList<Chk03_HdrR> up0L = MCList.create(Chk03_HdrR.class);
			up0L.add(up0());
			
			setPegNo(up0L);
			setPegNo(up1());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MSBFL_InspActReg.Chk03 o = MSBFL_InspActReg.crtChk03();
			
			Chk03_HdrR.copyall(o.up0(), up0());
			o.up1().setAll(up1());
			
			o.exec();
			
			MCRow.copyall(up0(), o.down0());
			up1().setAll(o.down1());
		}
		
		protected void callInspActUpdSrv() {
			MCList<Chk03_HdrR> up0L = MCList.create(Chk03_HdrR.class);
			up0L.add(up0());
			
			MSBFL_InspActService.InspAct_Upd02 o = MSBFL_InspActService.crtInspAct_Upd02();
			
			addAll(o.up0(), up0L, createMap_InspAct_Upd02_HdrR_Chk03_HdrR());
			addAll(o.up1(), up1(), createMap_InspAct_Upd02_DtlR_Chk03_DtlR());
			
			o.exec();
			
			String[] hdrDestCols = new String[] {Chk03_HdrR.$insp_no, Chk03_HdrR.$insp_act_no, Chk03_HdrR.$insp_aprv_sts_typ, Chk03_HdrR.$insp_aprv_sts_typ_nm};
			String[] hdrSrcCols = new String[] {InspAct_Upd02_HdrR.$insp_no, InspAct_Upd02_HdrR.$insp_act_no, InspAct_Upd02_HdrR.$insp_aprv_sts_typ, InspAct_Upd02_HdrR.$insp_aprv_sts_typ_nm};
			copyByPegNo(up0L, hdrDestCols, o.down0(), hdrSrcCols);
			
			String[] dtlDestCols = new String[] {Chk03_DtlR.$insp_judg_d_no, Chk03_DtlR.$insp_act_no};
			String[] dtlSrcCols = new String[] {InspAct_Upd02_DtlR.$insp_judg_d_no, InspAct_Upd02_DtlR.$insp_act_no};
			copyByPegNo(up1(), dtlDestCols, o.down1(), dtlSrcCols);
		}
		
		protected Map_InspAct_Upd02_HdrR_Chk03_HdrR<InspAct_Upd02_HdrR,Chk03_HdrR> createMap_InspAct_Upd02_HdrR_Chk03_HdrR() {
			return new Map_InspAct_Upd02_HdrR_Chk03_HdrR<InspAct_Upd02_HdrR, Chk03_HdrR>();
		}
		
		public class Map_InspAct_Upd02_HdrR_Chk03_HdrR<D extends InspAct_Upd02_HdrR, S extends Chk03_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Upd02_HdrR.$peg_no, Chk03_HdrR.$peg_no);
				addColumnPathMap(InspAct_Upd02_HdrR.$insp_no, Chk03_HdrR.$insp_no);
				addColumnPathMap(InspAct_Upd02_HdrR.$insp_act_no, Chk03_HdrR.$insp_act_no);
				addColumnPathMap(InspAct_Upd02_HdrR.$insp_typ, Chk03_HdrR.$insp_typ);
				addColumnPathMap(InspAct_Upd02_HdrR.$insp_sts_typ, Chk03_HdrR.$insp_sts_typ);
				addColumnPathMap(InspAct_Upd02_HdrR.$insp_aprv_sts_typ, Chk03_HdrR.$insp_aprv_sts_typ);
				addColumnPathMap(InspAct_Upd02_HdrR.$itm_cd, Chk03_HdrR.$itm_cd);
				addColumnPathMap(InspAct_Upd02_HdrR.$itm_sub1, Chk03_HdrR.$itm_sub1);
				addColumnPathMap(InspAct_Upd02_HdrR.$itm_sub2, Chk03_HdrR.$itm_sub2);
				addColumnPathMap(InspAct_Upd02_HdrR.$itm_sub3, Chk03_HdrR.$itm_sub3);
				addColumnPathMap(InspAct_Upd02_HdrR.$lot_no, Chk03_HdrR.$lot_no);
				addColumnPathMap(InspAct_Upd02_HdrR.$sublot_no, Chk03_HdrR.$sublot_no);
				addColumnPathMap(InspAct_Upd02_HdrR.$ver_no, Chk03_HdrR.$ver_no);
				addColumnPathMap(InspAct_Upd02_HdrR.$judg_dt, Chk03_HdrR.$judg_dt);
				addColumnPathMap(InspAct_Upd02_HdrR.$insp_judg_rslt_typ, Chk03_HdrR.$insp_judg_rslt_typ);
				addColumnPathMap(InspAct_Upd02_HdrR.$judg_dpt_cd, Chk03_HdrR.$judg_dpt_cd);
				addColumnPathMap(InspAct_Upd02_HdrR.$judg_usr_cd, Chk03_HdrR.$judg_usr_cd);
				addColumnPathMap(InspAct_Upd02_HdrR.$judg_rsn, Chk03_HdrR.$judg_rsn);
				addColumnPathMap(InspAct_Upd02_HdrR.$lmt_dt_frm_typ, Chk03_HdrR.$lmt_dt_frm_typ);
				addColumnPathMap(InspAct_Upd02_HdrR.$lmt_dt_frm, Chk03_HdrR.$lmt_dt_frm);
				addColumnPathMap(InspAct_Upd02_HdrR.$vld_dt, Chk03_HdrR.$vld_dt);
				addColumnPathMap(InspAct_Upd02_HdrR.$lmt_dt, Chk03_HdrR.$lmt_dt);
				addColumnPathMap(InspAct_Upd02_HdrR.$act_cont_fctr, Chk03_HdrR.$act_cont_fctr);
				addColumnPathMap(InspAct_Upd02_HdrR.$vld_dt_upd_flg, Chk03_HdrR.$vld_dt_upd_flg);
				addColumnPathMap(InspAct_Upd02_HdrR.$intr_rmrks, Chk03_HdrR.$intr_rmrks);
				addColumnPathMap(InspAct_Upd02_HdrR.$lot_rmrks, Chk03_HdrR.$lot_rmrks);
				addColumnPathMap(InspAct_Upd02_HdrR.$sub_char1, Chk03_HdrR.$sub_char1);
				addColumnPathMap(InspAct_Upd02_HdrR.$sub_char2, Chk03_HdrR.$sub_char2);
				addColumnPathMap(InspAct_Upd02_HdrR.$sub_char3, Chk03_HdrR.$sub_char3);
			}
		}
		
		protected Map_InspAct_Upd02_DtlR_Chk03_DtlR<InspAct_Upd02_DtlR,Chk03_DtlR> createMap_InspAct_Upd02_DtlR_Chk03_DtlR() {
			return new Map_InspAct_Upd02_DtlR_Chk03_DtlR<InspAct_Upd02_DtlR, Chk03_DtlR>();
		}
		
		public class Map_InspAct_Upd02_DtlR_Chk03_DtlR<D extends InspAct_Upd02_DtlR, S extends Chk03_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Upd02_DtlR.$peg_no, Chk03_DtlR.$peg_no);
				addColumnPathMap(InspAct_Upd02_DtlR.$data_crud_typ, Chk03_DtlR.$data_crud_typ);
				addColumnPathMap(InspAct_Upd02_DtlR.$insp_no, Chk03_DtlR.$insp_no);
				addColumnPathMap(InspAct_Upd02_DtlR.$insp_act_no, Chk03_DtlR.$insp_act_no);
				addColumnPathMap(InspAct_Upd02_DtlR.$itm_cd, Chk03_DtlR.$itm_cd);
				addColumnPathMap(InspAct_Upd02_DtlR.$itm_sub1, Chk03_DtlR.$itm_sub1);
				addColumnPathMap(InspAct_Upd02_DtlR.$itm_sub2, Chk03_DtlR.$itm_sub2);
				addColumnPathMap(InspAct_Upd02_DtlR.$itm_sub3, Chk03_DtlR.$itm_sub3);
				addColumnPathMap(InspAct_Upd02_DtlR.$loc_cd, Chk03_DtlR.$loc_cd);
				addColumnPathMap(InspAct_Upd02_DtlR.$str_ln_cd, Chk03_DtlR.$str_ln_cd);
				addColumnPathMap(InspAct_Upd02_DtlR.$quality_typ, Chk03_DtlR.$quality_typ);
				addColumnPathMap(InspAct_Upd02_DtlR.$stk_insp_typ, Chk03_DtlR.$stk_insp_typ);
				addColumnPathMap(InspAct_Upd02_DtlR.$stk_id_typ, Chk03_DtlR.$stk_id_typ);
				addColumnPathMap(InspAct_Upd02_DtlR.$stk_bp_cd, Chk03_DtlR.$stk_bp_cd);
				addColumnPathMap(InspAct_Upd02_DtlR.$gd_cd, Chk03_DtlR.$gd_cd);
				addColumnPathMap(InspAct_Upd02_DtlR.$stk_arrv_bp_cd, Chk03_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(InspAct_Upd02_DtlR.$lot_no, Chk03_DtlR.$lot_no);
				addColumnPathMap(InspAct_Upd02_DtlR.$sublot_no, Chk03_DtlR.$sublot_no);
				addColumnPathMap(InspAct_Upd02_DtlR.$sno1, Chk03_DtlR.$sno1);
				addColumnPathMap(InspAct_Upd02_DtlR.$sno1_mng_typ, Chk03_DtlR.$sno1_mng_typ);
				addColumnPathMap(InspAct_Upd02_DtlR.$sno2, Chk03_DtlR.$sno2);
				addColumnPathMap(InspAct_Upd02_DtlR.$sno2_mng_typ, Chk03_DtlR.$sno2_mng_typ);
				addColumnPathMap(InspAct_Upd02_DtlR.$sno3, Chk03_DtlR.$sno3);
				addColumnPathMap(InspAct_Upd02_DtlR.$sno3_mng_typ, Chk03_DtlR.$sno3_mng_typ);
				addColumnPathMap(InspAct_Upd02_DtlR.$sno4, Chk03_DtlR.$sno4);
				addColumnPathMap(InspAct_Upd02_DtlR.$sno4_mng_typ, Chk03_DtlR.$sno4_mng_typ);
				addColumnPathMap(InspAct_Upd02_DtlR.$fix_no_typ, Chk03_DtlR.$fix_no_typ);
				addColumnPathMap(InspAct_Upd02_DtlR.$fix_no, Chk03_DtlR.$fix_no);
				addColumnPathMap(InspAct_Upd02_DtlR.$pack_unit_qty, Chk03_DtlR.$pack_unit_qty);
				addColumnPathMap(InspAct_Upd02_DtlR.$pack_unit_cd, Chk03_DtlR.$pack_unit_cd);
				addColumnPathMap(InspAct_Upd02_DtlR.$base_unit_qty, Chk03_DtlR.$base_unit_qty);
				addColumnPathMap(InspAct_Upd02_DtlR.$base_unit_cd, Chk03_DtlR.$base_unit_cd);
				addColumnPathMap(InspAct_Upd02_DtlR.$ac_dt, Chk03_DtlR.$ac_dt);
				addColumnPathMap(InspAct_Upd02_DtlR.$intr_rmrks, Chk03_DtlR.$intr_rmrks);
				addColumnPathMap(InspAct_Upd02_DtlR.$sub_char1, Chk03_DtlR.$sub_char1);
				addColumnPathMap(InspAct_Upd02_DtlR.$sub_char2, Chk03_DtlR.$sub_char2);
				addColumnPathMap(InspAct_Upd02_DtlR.$sub_char3, Chk03_DtlR.$sub_char3);
			}
		}
	}
	

	protected MCList<MST_INSP_SCHD_R> getInspSchdL(String inspNo) {
		MCList<MST_INSP_SCHD_R> selectL = MCList.create(MST_INSP_SCHD_R.class);
		MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
		MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
		selectL_bldr.setWhere(t.insp_no.eq(bind("1")), inspNo);
		dbSelect("MSBFL0070_MST_INSP_SCHD_S06", selectL, selectL_bldr);
		return selectL;
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 検査実績ヘッダの取消を行う<br>
	 */
	public class Del01 extends MSBFL_InspActReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk04();
			throwUpdErr();
			callInspActUpdSrv();
			setDown();
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			MCList<Chk04_HdrR> up0L = MCList.create(Chk04_HdrR.class);
			up0L.add(up0());
			setPegNo(up0L);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk04() {
			MSBFL_InspActReg.Chk04 o = MSBFL_InspActReg.crtChk04();
			Chk04_HdrR.copyall(o.up0(), up0());
			o.up1().setAll(up1());
			o.up2().setAll(up2());
			o.exec();
			MCRow.copyall(up0(), o.down0());
		}
		
		protected void callInspActUpdSrv() {
			MCList<Chk04_HdrR> up0L = MCList.create(Chk04_HdrR.class);
			up0L.add(up0());
			
			MSBFL_InspActService.InspAct_Del01 o = MSBFL_InspActService.crtInspAct_Del01();
			addAll(o.up0(), up0L, createMap_InspAct_Del01_CndR_Chk04_HdrR());
			addAll(o.up1(), up1(), createMap_InspAct_Chk04_DtlR_Chk04_DtlR());
			addAll(o.up2(), up2(), createMap_InspAct_Chk04_SmplR_Chk04_SmplR());
			o.exec();
			
			String[] destCols = new String[] {Chk04_HdrR.$insp_no,
					Chk04_HdrR.$insp_act_no, Chk04_HdrR.$insp_sts_typ, Chk04_HdrR.$insp_sts_typ_nm, Chk04_HdrR.$insp_aprv_sts_typ, Chk04_HdrR.$insp_aprv_sts_typ_nm};
			String[] srcCols = new String[] {InspAct_Del01_CndR.$insp_no,
					InspAct_Del01_CndR.$insp_act_no, InspAct_Del01_CndR.$insp_sts_typ, InspAct_Del01_CndR.$insp_sts_typ_nm, InspAct_Del01_CndR.$insp_aprv_sts_typ, InspAct_Del01_CndR.$insp_aprv_sts_typ_nm};
			copyByPegNo(up0L, destCols, o.down0(), srcCols);
		}
		
		protected Map_InspAct_Del01_CndR_Chk04_HdrR<InspAct_Del01_CndR,Chk04_HdrR> createMap_InspAct_Del01_CndR_Chk04_HdrR() {
			return new Map_InspAct_Del01_CndR_Chk04_HdrR<InspAct_Del01_CndR, Chk04_HdrR>();
		}
		
		public class Map_InspAct_Del01_CndR_Chk04_HdrR<D extends InspAct_Del01_CndR, S extends Chk04_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Del01_CndR.$peg_no, Chk04_HdrR.$peg_no);
				addColumnPathMap(InspAct_Del01_CndR.$insp_no, Chk04_HdrR.$insp_no);
				addColumnPathMap(InspAct_Del01_CndR.$insp_act_no, Chk04_HdrR.$insp_act_no);
				addColumnPathMap(InspAct_Del01_CndR.$insp_sts_typ, Chk04_HdrR.$insp_sts_typ);
				addColumnPathMap(InspAct_Del01_CndR.$insp_aprv_sts_typ, Chk04_HdrR.$insp_aprv_sts_typ);
			}
		}
	}
	
	/**
	 * Del02オペレーション.<p>
	 *
	 * 検査実績ヘッダの判定取消を行う<br>
	 */
	public class Del02 extends MSBFL_InspActReg_MC_A.Del02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk05();
			throwUpdErr();
			callInspActUpdSrv();
			setDown();
		}
		
		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			MCList<Chk05_HdrR> up0L = MCList.create(Chk05_HdrR.class);
			up0L.add(up0());
			
			setPegNo(up0L);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk05() {
			MSBFL_InspActReg.Chk05 o = MSBFL_InspActReg.crtChk05();
			Chk05_HdrR.copyall(o.up0(), up0());
			o.up1().setAll(up1());
			
			o.exec();
			MCRow.copyall(up0(), o.down0());
		}
		
		protected void callInspActUpdSrv() {
			MCList<Chk05_HdrR> up0L = MCList.create(Chk05_HdrR.class);
			up0L.add(up0());
			
			MSBFL_InspActService.InspAct_Del01 o = MSBFL_InspActService.crtInspAct_Del01();
			addAll(o.up0(), up0L, createMap_InspAct_Del01_CndR_Chk05_HdrR());
			addAll(o.up1(), up1(), createMap_InspAct_Chk04_DtlR_Chk04_DtlR());
			o.exec();
			
			String[] destCols = new String[] {Chk05_HdrR.$insp_no,
					Chk05_HdrR.$insp_act_no, Chk05_HdrR.$insp_sts_typ, Chk05_HdrR.$insp_sts_typ_nm, Chk05_HdrR.$insp_aprv_sts_typ, Chk05_HdrR.$insp_aprv_sts_typ_nm};
			String[] srcCols = new String[] {InspAct_Del01_CndR.$insp_no,
					InspAct_Del01_CndR.$insp_act_no, InspAct_Del01_CndR.$insp_sts_typ, InspAct_Del01_CndR.$insp_sts_typ_nm, InspAct_Del01_CndR.$insp_aprv_sts_typ, InspAct_Del01_CndR.$insp_aprv_sts_typ_nm};
			copyByPegNo(up0L, destCols, o.down0(), srcCols);
		}
		
		protected Map_InspAct_Del01_CndR_Chk05_HdrR<InspAct_Del01_CndR,Chk05_HdrR> createMap_InspAct_Del01_CndR_Chk05_HdrR() {
			return new Map_InspAct_Del01_CndR_Chk05_HdrR<InspAct_Del01_CndR, Chk05_HdrR>();
		}
		
		public class Map_InspAct_Del01_CndR_Chk05_HdrR<D extends InspAct_Del01_CndR, S extends Chk05_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Del01_CndR.$peg_no, Chk05_HdrR.$peg_no);
				addColumnPathMap(InspAct_Del01_CndR.$insp_no, Chk05_HdrR.$insp_no);
				addColumnPathMap(InspAct_Del01_CndR.$insp_act_no, Chk05_HdrR.$insp_act_no);
				addColumnPathMap(InspAct_Del01_CndR.$insp_sts_typ, Chk05_HdrR.$insp_sts_typ);
				addColumnPathMap(InspAct_Del01_CndR.$insp_aprv_sts_typ, Chk05_HdrR.$insp_aprv_sts_typ);
				addColumnPathMap(InspAct_Del01_CndR.$insp_judg_rslt_typ, Chk05_HdrR.$insp_judg_rslt_typ);
				addColumnPathMap(InspAct_Del01_CndR.$judg_rsn, Chk05_HdrR.$judg_rsn);
			}
		}
	}
	
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 検査成績書を発行する<br>
	 */
	public class Prnt01 extends MSBFL_InspActReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();

			callInspRptPrntSrv();

			throwErr(msgNoPrintData());

			// 下り電文設定
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

		protected void callInspRptPrntSrv() {
			MCList<Prnt01_HdrR> up0L = MCList.create(Prnt01_HdrR.class);
			up0L.add(up0());
			
			MSBFL_InspRptService.InspRpt_Prnt02 o = MSBFL_InspRptService.crtInspRpt_Prnt02();
			addAll(o.up0(), up0L, createMap_InspRpt_Prnt02_DtlR_Prnt01_HdrR());
			o.exec();

			String[] destCols = new String[] {Prnt01_HdrR.$insp_no, Prnt01_HdrR.$insp_rslt_prnt_flg, Prnt01_HdrR.$insp_rslt_prnt_tm, Prnt01_HdrR.$err_flg};
			String[] srcCols = new String[] {InspRpt_Prnt02_DtlR.$insp_no, InspRpt_Prnt02_DtlR.$insp_rslt_prnt_flg, InspRpt_Prnt02_DtlR.$insp_rslt_prnt_tm, InspRpt_Prnt02_DtlR.$err_flg};
			copyByPegNo(up0L, destCols, o.down0(), srcCols);
		}
		
		protected Map_InspRpt_Prnt02_DtlR_Prnt01_HdrR<InspRpt_Prnt02_DtlR, Prnt01_HdrR> createMap_InspRpt_Prnt02_DtlR_Prnt01_HdrR() {
			return new Map_InspRpt_Prnt02_DtlR_Prnt01_HdrR<InspRpt_Prnt02_DtlR, Prnt01_HdrR>();
		}
		
		public class Map_InspRpt_Prnt02_DtlR_Prnt01_HdrR<D extends InspRpt_Prnt02_DtlR, S extends Prnt01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspRpt_Prnt02_DtlR.$peg_no, Prnt01_HdrR.$peg_no);
				addColumnPathMap(InspRpt_Prnt02_DtlR.$insp_no, Prnt01_HdrR.$insp_no);
			}
		}
	}
		protected Map_InspAct_Chk04_DtlR_Chk04_DtlR<InspAct_Chk04_DtlR,Chk04_DtlR> createMap_InspAct_Chk04_DtlR_Chk04_DtlR() {
			return new Map_InspAct_Chk04_DtlR_Chk04_DtlR<InspAct_Chk04_DtlR, Chk04_DtlR>();
		}

		public class Map_InspAct_Chk04_DtlR_Chk04_DtlR<D extends InspAct_Chk04_DtlR, S extends Chk04_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk04_DtlR.$insp_act_d_no, Chk04_DtlR.$insp_act_d_no);
				addColumnPathMap(InspAct_Chk04_DtlR.$fix_no, Chk04_DtlR.$fix_no);
				addColumnPathMap(InspAct_Chk04_DtlR.$fix_no_typ, Chk04_DtlR.$fix_no_typ);
				addColumnPathMap(InspAct_Chk04_DtlR.$insp_act_no, Chk04_DtlR.$insp_act_no);
				addColumnPathMap(InspAct_Chk04_DtlR.$can_ac_dt, Chk04_DtlR.$can_ac_dt);
				addColumnPathMap(InspAct_Chk04_DtlR.$itm_cd, Chk04_DtlR.$itm_cd);
				addColumnPathMap(InspAct_Chk04_DtlR.$itm_sub1, Chk04_DtlR.$itm_sub1);
				addColumnPathMap(InspAct_Chk04_DtlR.$itm_sub2, Chk04_DtlR.$itm_sub2);
				addColumnPathMap(InspAct_Chk04_DtlR.$itm_sub3, Chk04_DtlR.$itm_sub3);
				addColumnPathMap(InspAct_Chk04_DtlR.$pack_unit_cd , Chk04_DtlR.$pack_unit_cd);
			}
		}
		protected Map_InspAct_Chk04_SmplR_Chk04_SmplR<InspAct_Chk04_SmplR,Chk04_SmplR> createMap_InspAct_Chk04_SmplR_Chk04_SmplR() {
			return new Map_InspAct_Chk04_SmplR_Chk04_SmplR<InspAct_Chk04_SmplR, Chk04_SmplR>();
		}

		public class Map_InspAct_Chk04_SmplR_Chk04_SmplR<D extends InspAct_Chk04_SmplR, S extends Chk04_SmplR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspAct_Chk04_SmplR.$insp_smpl_act_no, Chk04_SmplR.$insp_smpl_act_no);
				addColumnPathMap(InspAct_Chk04_SmplR.$can_ac_dt, Chk04_SmplR.$can_ac_dt);

			}
		}

	//FMCB CUSTOM END
}