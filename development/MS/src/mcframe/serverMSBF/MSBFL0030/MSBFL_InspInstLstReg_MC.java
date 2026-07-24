package mcframe.serverMSBF.MSBFL0030;

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
import mcframe.serverMSBF.MSBFL0030.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBF.MSBFL5010.*;
import mcframe.serverMSBF.MSBFL5020.*;
import mcframe.serverMSBF.MSBFL5330.*;
import mcframe.serverMSUC.MSUCL0090.*;
import mcframe.serverFXUC.FXUCL0170.*;
import static mcframe.serverMSBF.MSBFL0030.Query.*;
import mcframe.commonCore.param.MCParam;
import java.util.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_InspInstLstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_InspInstLstReg_MC extends MSBFL_InspInstLstReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検査予定・検査指図情報を検索する。<br>
	 */
	public class Srch01 extends MSBFL_InspInstLstReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 検索条件設定
			setUpTmpCol(up0());

			// 検査予定情報検索
			if (isSrchSchdData(up0())) {
				// 未指図のデータのみ検索する
				MCQueryPlan inspSchdSql = MSBFL0030_MST_INSP_SCHD_S01();
				searchForDL(inspSchdSql, up0(), down0());
			}

			// 検査指図情報検索
			if (isSrchInstData(up0())) {
				// 指図済のデータのみ検索する
				MCQueryPlan inspInstSql = MSBFL0030_MST_INSP_INST_S01();
				searchForDL(inspInstSql, up0(), down0());
			}
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();

			// 検査予定の更新カウンタ情報取得（指図取消用）
			if (isSame(up0().ope(), MSC_INSP_INST_LIST_REG_OPE.OPE_DEL.value())) {
				selInspSchdUpdCntr(down0());
			}
			
			// 品管関連情報の補完
			compDownData();
			
			setLimsFlgAndSubList();
		}

		/**
		 * 指図データを参照するかどうか
		 * @param up
		 * @return
		 */
		protected boolean isSrchInstData(Srch01_CndR up) {
			if (!up.insp_sts_typ_ord() && !up.insp_sts_typ_str() && !up.insp_sts_typ_jdg()) {
				return false;
			}
			if (!isNull(up0().schd_st_hm_fr()) ||
					!isNull(up0().schd_st_hm_to()) ||
					!isNull(up0().schd_end_hm_fr()) ||
					!isNull(up0().schd_end_hm_to()) ||
					!isNull(up0().sno1()) ||
					!isNull(up0().sno2()) ||
					!isNull(up0().sno3()) ||
					!isNull(up0().sno4()) ||
					!isNull(up0().loc_cd()) ||
					!isNull(up0().loc_nm()) ||
					!isNull(up0().str_ln_cd()) ||
					!isNull(up0().str_ln_nm()) ||
					!isNull(up0().wrk_no()) ||
					!isNull(up0().wrk_nm()) ||
					!isNull(up0().insp_cnt_rmrks())) {
				return false;
			}
			
			return true;
		}

		/**
		 * 予定データを参照するかどうか
		 * @param up
		 * @return
		 */
		protected boolean isSrchSchdData(Srch01_CndR up) {
			if (!up.insp_sts_typ_schd() && !up.insp_sts_typ_yet()) {
				return false;
			}
			
			if (!isNull(up0().inst_dt_fr()) ||
					!isNull(up0().inst_dt_to()) ||
					!isNull(up0().aprv_dt_fr()) ||
					!isNull(up0().aprv_dt_to()) ||
					!isNull(up0().st_hm_fr()) ||
					!isNull(up0().st_hm_to()) ||
					!isNull(up0().end_hm_fr()) ||
					!isNull(up0().end_hm_to()) ||
					!isNull(up0().insp_lst_prnt_tm_fr()) ||
					!isNull(up0().insp_lst_prnt_tm_to()) ||
					!isNull(up0().insp_rslt_prnt_tm_fr()) ||
					!isNull(up0().insp_rslt_prnt_tm_to()) ||
					!isNull(up0().getStringNE("TMP_LST_PRNT_FLG_CUTOFF")) ||
					!isNull(up0().getStringNE("TMP_RSLT_PRNT_FLG_CUTOFF")) ||
					!isNull(up0().inst_usr_cd()) ||
					!isNull(up0().inst_usr_nm()) ||
					!isNull(up0().inst_dpt_cd()) ||
					!isNull(up0().inst_dpt_nm()) ||
					!isNull(up0().insp_ptn_cd()) ||
					!isNull(up0().insp_ptn_nm()) ||
					!isNull(up0().insp_lst_no()) ||
					!isNull(up0().insp_aprv_sts_typ()) ||
					!isNull(up0().intr_rmrks()) ||
					!isNull(up0().sub_char1()) ||
					!isNull(up0().sub_char2()) ||
					!isNull(up0().sub_char3())) {
				return false;
			}
			return true;
		}

		/**
		 * 検査予定登録サービスの品管関連マスタ取得を呼び出す。
		 * @param cndL 上り電文
		 * @return 品管関連マスタ情報
		 */
		protected MCList<InspInst_Srch01_RsltR> callInspSchdService(MCList<InspInst_Srch01_CndR> cndL) {

			MCList<InspInst_Srch01_RsltR> rsltL = MCList.create(InspInst_Srch01_RsltR.class);
			rsltL.addNumberColumn(Srch01_RsltR.$peg_no);
			
			for(InspInst_Srch01_CndR cndR : cndL){
				MSBFL_InspInstService.InspInst_Srch01 srch01 = MSBFL_InspInstService.crtInspInst_Srch01();
				srch01.up0().setByName(cndR);
				srch01.exec();
				srch01.down0().setNumberNE(Srch01_RsltR.$peg_no, cndR.getNumber(Srch01_RsltR.$peg_no));
				rsltL.add(srch01.down0());
			}
			return rsltL;
		}

		/**
		 * 下り電文を補完する。
		 */
		protected void compDownData() {
			MCList<InspInst_Srch01_CndR> cndL = MCList.create(InspInst_Srch01_CndR.class);

			setPegNo(Srch01_RsltR.$peg_no, down0());
			addAll(cndL, down0(), createMap_InspInst_Srch01_CndR_Srch01_RsltR());
			if (!cndL.isEmpty()) {
				MCList<InspInst_Srch01_RsltR> mstL = callInspSchdService(cndL);
				
				// 品管マスタ関連項目のマージ
				mergeDown(mstL);
			}
		}

		/**
		 * 品管マスタ関連情報と下り電文をマージする。
		 * 
		 * @param mstL 品管マスタ関連情報
		 */
		protected void mergeDown(MCList<InspInst_Srch01_RsltR> mstL) {
			MCIndexKey idxkey = mstL.createIndex(Srch01_RsltR.$peg_no);
			MCList<MAM_ITM_SITE_R> itmSiteL = getItmSite(down0());
			MCIndexKey itmSiteIdxkey = itmSiteL.createIndex(MAM_ITM_SITE_R.$itm_cd, MAM_ITM_SITE_R.$itm_sub1, 
					MAM_ITM_SITE_R.$itm_sub2, MAM_ITM_SITE_R.$itm_sub3, MAM_ITM_SITE_R.$site_cd);
			for (Srch01_RsltR downR : down0()) {
				InspInst_Srch01_RsltR mstR = mstL.getFirst(idxkey, downR.getNumberNE("peg_no"));
				if (!isNull(mstR)) {
					// 検査ＬＴ
					downR.insp_lt(mstR.insp_lt());
					// 検査方法区分
					if (MSC_INSP_STS_TYP.isYET(downR.insp_sts_typ())) {
						downR.insp_mtd_typ(mstR.insp_mtd_typ());
						downR.insp_aprv_flg(mstR.insp_aprv_flg());
						downR.master_plnt_aprv_flg(mstR.plnt_aprv_flg());
						if (MAC_INSP_MTD_TYP.isSPEC(mstR.insp_mtd_typ())) {
							downR.std_req_flg(mstR.std_req_flg());
							downR.std_cnf_req_flg(mstR.std_cnf_req_flg());
						}
					}
					else if (MSC_INSP_STS_TYP.isSCHD(downR.insp_sts_typ())) {
						downR.master_plnt_aprv_flg(mstR.plnt_aprv_flg());
					}
					// 未指図の場合、検査パタンを設定
					if (isSrchSchdData(up0())) {
						downR.insp_ptn_cd(mstR.insp_ptn_cd());
						if (!isNull(mstR.insp_ptn_cd())) {
							downR.insp_ptn_nm(mstR.insp_ptn_nm());
						}
						downR.insp_std_no(mstR.insp_std_no());
					}
				}
				if (isNull(mstR.insp_ptn_cd()) && (MSC_INSP_STS_TYP.isYET(downR.insp_sts_typ()) || MSC_INSP_STS_TYP.isSCHD(downR.insp_sts_typ()))) {
					MAM_ITM_SITE_R itmSiteR = itmSiteL.getFirst(itmSiteIdxkey,
							downR.itm_cd(), downR.itm_sub1(), downR.itm_sub2(), downR.itm_sub3(), downR.to_site_cd());
					if (!isNull(itmSiteR)) {
						downR.master_plnt_aprv_flg(itmSiteR.plnt_aprv_flg());
					}
				}
				downR.is_invalid_insp_ptn_flg(isNull(downR.insp_ptn_cd()));
				// 検査方法区分
				if (MSC_INSP_STS_TYP.isYET(downR.insp_sts_typ())) {
					// 検査パタンＣＤのデフォルト値がない場合、検査状況区分により、検査方法区分を固定する。
					if (downR.is_invalid_insp_ptn_flg()) {
						if (MSC_INSP_TYP.isLOT(downR.insp_typ())) {
							downR.insp_mtd_typ(MAC_INSP_MTD_TYP.SMPL.value());
						}
						else if (MSC_INSP_TYP.isPRCD(downR.insp_typ())) {
							downR.insp_mtd_typ(MAC_INSP_MTD_TYP.SPEC.value());
						}
					}
				}
			}
		}

		protected MCList<MAM_ITM_SITE_R> getItmSite(MCList<Srch01_RsltR> down) {
			MCList<MAM_ITM_SITE_R> itmSiteL = MCList.create(MAM_ITM_SITE_R.class);
			MAM_ITM_SITE_R itmSiteR = MAM_ITM_SITE_R.create("itmSiteR");
			MCQueryApiBuilder itmInspL_bldr = MCQueryApiBuilder.create(itmSiteR);
			itmInspL_bldr.setSelect(itmSiteR.plnt_aprv_flg);
			itmInspL_bldr.addSelect(itmSiteR.itm_cd);
			itmInspL_bldr.addSelect(itmSiteR.itm_sub1);
			itmInspL_bldr.addSelect(itmSiteR.itm_sub2);
			itmInspL_bldr.addSelect(itmSiteR.itm_sub3);
			itmInspL_bldr.addSelect(itmSiteR.site_cd);
			itmInspL_bldr.setWhere(itmSiteR.itm_cd.eq(bind("itm_cd")));
			itmInspL_bldr.addWhereWithAnd(itmSiteR.itm_sub1.eq(bind("itm_sub1")));
			itmInspL_bldr.addWhereWithAnd(itmSiteR.itm_sub2.eq(bind("itm_sub2")));
			itmInspL_bldr.addWhereWithAnd(itmSiteR.itm_sub3.eq(bind("itm_sub3")));
			itmInspL_bldr.addWhereWithAnd(itmSiteR.site_cd.eq(bind("to_site_cd")));
			dbSelect("MSBFL0030_MAM_ITM_SITE_S01", itmSiteL, itmInspL_bldr, down);
			return itmSiteL;
		}

		/**
		 * 検査指図取消用の検査予定の更新カウンタ情報を取得する。
		 * 
		 * @param instL 検査指図情報
		 */
		protected void selInspSchdUpdCntr(MCList<Srch01_RsltR> instL) {
			MCList<MST_INSP_SCHD_R> dbL = MCList.create(MST_INSP_SCHD_R.class);
			MCList<MST_INSP_SCHD_R> bindL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R bindR = null;
			for (Srch01_RsltR upR : instL) {
				bindR = MST_INSP_SCHD_R.create();
				bindR.insp_no(upR.insp_no());
				bindL.add(bindR);
			}
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder dbL_bldr = MCQueryApiBuilder.create(t);
			dbL_bldr.setSelect(t.insp_schd_no);
			dbL_bldr.addSelect(t.insp_no);
			dbL_bldr.addSelect(t.upd_cntr);
			dbSelectColumn("MSBFL0030_MST_INSP_SCHD_S01", dbL, dbL_bldr, bindL, MST_INSP_SCHD_R.$insp_no);

			if (!dbL.isEmpty()) {
				MCList<Srch01_RsltSchdR> schdL = MCList.create(Srch01_RsltSchdR.class);
				Srch01_RsltSchdR schdR = null;
				for (MST_INSP_SCHD_R dbR : dbL) {
					schdR = Srch01_RsltSchdR.create();
					schdR.insp_schd_no(dbR.insp_schd_no());
					schdR.insp_no(dbR.insp_no());
					schdR.schd_upd_cntr(dbR.upd_cntr());
					schdL.add(schdR);
				}
				down1().addAll(schdL);
			}
		}

		protected void setLimsFlgAndSubList() {
			if (down0().isEmpty()) {
				return;
			}
			callSCMLinkUnitSrch03();
			subListByLimsFlg();
		}

		protected void callSCMLinkUnitSrch03() {
			MSUCL_SCMLinkUtil.SCMLinkUtil_Srch03 ope = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch03();
			ope.up0().addAll(setSCMLinkSrch03CndL());
			ope.exec();
			
			String[] destCols = new String[] {Srch01_RsltR.$for_lims_flg};
			String[] srcCols = new String[] {SCMLinkUtil_Srch03_CndR.$lims_flg};
			copyByPegNo(down0(), destCols, ope.down0(), srcCols);
		}

		protected MCList<SCMLinkUtil_Srch03_CndR> setSCMLinkSrch03CndL(){
			MCList<SCMLinkUtil_Srch03_CndR> cndL =MCList.create(SCMLinkUtil_Srch03_CndR.class);
			
			for (Srch01_RsltR rsltR : down0()) {
				if (isInst(rsltR.insp_sts_typ())) {
					continue;
				}
				SCMLinkUtil_Srch03_CndR cndR = SCMLinkUtil_Srch03_CndR.create();
				cndR.peg_no(rsltR.getNumberNE("peg_no"));
				if (MSC_INSP_TYP.isPRDCT(rsltR.insp_typ())) {
					cndR.loc_cd(rsltR.mfg_loc_cd());
				} else {
					cndR.loc_cd(rsltR.loc_cd());
				}
				cndR.itm_cd(rsltR.itm_cd());
				cndR.itm_sub1(rsltR.itm_sub1());
				cndR.itm_sub2(rsltR.itm_sub2());
				cndR.itm_sub3(rsltR.itm_sub3());
				cndR.master_dt(getToday());
				cndL.add(cndR);
			}
			return cndL;
		}

		protected boolean isInst(String inspSts) {
			return MSC_INSP_STS_TYP.isORD(inspSts) || MSC_INSP_STS_TYP.isSTR(inspSts) || MSC_INSP_STS_TYP.isJDG(inspSts);
		}

		protected void subListByLimsFlg() {
			
			MCList<Srch01_RsltR> removeDownL = MCList.create(Srch01_RsltR.class);
			MCList<Srch01_RsltR> removeAprvLimsDownL = MCList.create(Srch01_RsltR.class);
			for (Srch01_RsltR r : down0()) {
				if (MSC_INSP_INST_LIST_REG_OPE.isOPE_UPD(up0().ope()) || MSC_INSP_INST_LIST_REG_OPE.isOPE_DEL(up0().ope())) {
					if (r.insp_aprv_flg()) {
						r.for_lims_flg(false);
					}
				}
				else if (MSC_INSP_INST_LIST_REG_OPE.isOPE_APRV(up0().ope()) || MSC_INSP_INST_LIST_REG_OPE.isOPE_DEL_APRV(up0().ope())) {
					if (!r.insp_aprv_flg()) {
						r.for_lims_flg(false);
					}
				}
				if (MSC_INSP_STS_TYP.isSCHD(r.insp_sts_typ()) || MSC_INSP_STS_TYP.isYET(r.insp_sts_typ())) {
					if (up0().lims_tgt_flg() && !r.for_lims_flg()) {
						removeDownL.add(r);
					}
					else if (up0().not_lims_tgt_flg() && r.for_lims_flg()) {
						removeDownL.add(r);
					}
				}
				if (!isNull(up0().getStringNE("ope_aprv_lims_tgt_flg_str"))) {
					if (!isSameAprvLimsTgt(r.for_lims_flg())) {
						removeAprvLimsDownL.add(r);
					}
				}
			}
			
			if (!isNull(up0().getStringNE("ope_aprv_lims_tgt_flg_str"))) {
				down0().removeAll(removeAprvLimsDownL);
			}
			if (isNull(up0().getStringNE("tmp_lims_tgt_flg_str"))) {
				return;
			}
			
			down0().removeAll(removeDownL);
		}

		protected boolean isSameAprvLimsTgt(boolean limsFlg) {
			if (limsFlg) {
				return isSame(up0().getStringNE("ope_aprv_lims_tgt_flg_str"), toTrueStr(limsFlg));
			}
			return isSame(up0().getStringNE("ope_aprv_lims_tgt_flg_str"), toFalseStr(limsFlg));
		}

		protected Map_InspInst_Srch01_CndR_Srch01_RsltR<InspInst_Srch01_CndR,Srch01_RsltR> createMap_InspInst_Srch01_CndR_Srch01_RsltR() {
			return new Map_InspInst_Srch01_CndR_Srch01_RsltR<InspInst_Srch01_CndR, Srch01_RsltR>();
		}

		public class Map_InspInst_Srch01_CndR_Srch01_RsltR<D extends InspInst_Srch01_CndR, S extends Srch01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspInst_Srch01_CndR.$itm_cd, Srch01_RsltR.$itm_cd);
				addColumnPathMap(InspInst_Srch01_CndR.$itm_sub1, Srch01_RsltR.$itm_sub1);
				addColumnPathMap(InspInst_Srch01_CndR.$itm_sub2, Srch01_RsltR.$itm_sub2);
				addColumnPathMap(InspInst_Srch01_CndR.$itm_sub3, Srch01_RsltR.$itm_sub3);
				addColumnPathMap(InspInst_Srch01_CndR.$master_dt, Srch01_RsltR.$master_dt);
				addColumnPathMap(InspInst_Srch01_CndR.$insp_typ, Srch01_RsltR.$insp_typ);
				addColumnPathMap(InspInst_Srch01_CndR.$loc_cd, Srch01_RsltR.$loc_cd);
				addColumnPathMap(InspInst_Srch01_CndR.$to_site_cd, Srch01_RsltR.$to_site_cd);
				addColumnPathMap(InspInst_Srch01_CndR.$mfg_loc_cd, Srch01_RsltR.$mfg_loc_cd);
				addColumnPathMap(InspInst_Srch01_CndR.$sppl_cd, Srch01_RsltR.$sppl_cd);
				addColumnPathMap(InspInst_Srch01_CndR.$maker_cd, Srch01_RsltR.$maker_cd);
				addColumnPathMap(InspInst_Srch01_CndR.$insp_ptn_cd, Srch01_RsltR.$insp_ptn_cd);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.setValueNE(Srch01_RsltR.$peg_no, src.peg_no());
			}
		}
	}

	/**
	 * 検索条件に対する一時カラムを設定する
	 * @param up
	 */
	protected void setUpTmpCol(Srch01_CndR up) {
		// 検査状況区分
		if (up.insp_sts_typ_schd()) {
			up.addStringColumn("TMP_INSP_STS_TYP_SCHD", MSC_INSP_STS_TYP.SCHD.value());
		}
		if (up.insp_sts_typ_yet()) {
			up.addStringColumn("TMP_INSP_STS_TYP_YET", MSC_INSP_STS_TYP.YET.value());
		}
		if (up.insp_sts_typ_ord()) {
			up.addStringColumn("TMP_INSP_STS_TYP_ORD", MSC_INSP_STS_TYP.ORD.value());
		}
		if (up.insp_sts_typ_str()) {
			up.addStringColumn("TMP_INSP_STS_TYP_STR", MSC_INSP_STS_TYP.STR.value());
		}
		if (up.insp_sts_typ_jdg()) {
			up.addStringColumn("TMP_INSP_STS_TYP_JDG", MSC_INSP_STS_TYP.JDG.value());
		}
		// 指図リスト発行
		if (up.insp_lst_prnt_flg() && up.insp_lst_not_prnt_flg()) {
			up.addStringColumn("TMP_LST_PRNT_FLG_CUTOFF", toFalseStr(true));
		} 
		else if (!up.insp_lst_prnt_flg() && !up.insp_lst_not_prnt_flg()) {
			up.addStringColumn("TMP_LST_PRNT_FLG_CUTOFF", toFalseStr(true));
		}
		else if (up.insp_lst_prnt_flg()) {
			up.addStringColumn("TMP_LST_PRNT_FLG_CUTOFF", toTrueStr(true));
		}
		else if (up.insp_lst_not_prnt_flg()) {
			up.addStringColumn("TMP_LST_PRNT_FLG_CUTOFF", toFalseStr(false));
		}
		// 検査成績書発行
		if (up.insp_rslt_prnt_flg() && up.insp_rslt_not_prnt_flg()) {
			up.addStringColumn("TMP_RSLT_PRNT_FLG_CUTOFF", toFalseStr(true));
		} 
		else if (!up.insp_rslt_prnt_flg() && !up.insp_rslt_not_prnt_flg()) {
			up.addStringColumn("TMP_RSLT_PRNT_FLG_CUTOFF", toFalseStr(true));
		}
		else if (up.insp_rslt_prnt_flg()) {
			up.addStringColumn("TMP_RSLT_PRNT_FLG_CUTOFF", toTrueStr(true));
		}
		else if (up.insp_rslt_not_prnt_flg()) {
			up.addStringColumn("TMP_RSLT_PRNT_FLG_CUTOFF", toFalseStr(false));
		}
		// 検索時に動的にDACを設定するための条件
		if (isSame(up.ope(), MSC_INSP_INST_LIST_REG_OPE.OPE_APRV.value()) || isSame(up.ope(), MSC_INSP_INST_LIST_REG_OPE.OPE_DEL_APRV.value())) {
			up.addStringColumn("OPE_JUDG", "1");
			up.addStringColumn("OPE_NOT_JUDG", "0");
			up.login_usr_cd(mcframe.serverCore.sys.MCSys.user.ID());
			up.dt(getToday());
		}
		else {
			up.addStringColumn("OPE_JUDG", "0");
			up.addStringColumn("OPE_NOT_JUDG", "1");
		}
		if ((up.lims_tgt_flg() && up.not_lims_tgt_flg()) || isSame(up.ope(), MSC_INSP_INST_LIST_REG_OPE.OPE_APRV.value())) {
		}
		else if (up.lims_tgt_flg()){
			up.addStringColumn("TMP_LIMS_TGT_FLG_STR", toTrueStr(true));
		}
		else if (up.not_lims_tgt_flg()) {
			up.addStringColumn("TMP_LIMS_TGT_FLG_STR", toFalseStr(false));
		}
		if (isSame(up.ope(), MSC_INSP_INST_LIST_REG_OPE.OPE_APRV.value())) {
			if ((up.lims_tgt_flg() && up.not_lims_tgt_flg())) {
			}
			else if (up.lims_tgt_flg()){
				up.addStringColumn("OPE_APRV_LIMS_TGT_FLG_STR", toTrueStr(true));
			}
			else if (up.not_lims_tgt_flg()) {
				up.addStringColumn("OPE_APRV_LIMS_TGT_FLG_STR", toFalseStr(false));
			}
		}
		up.addDateColumn("today", getToday());
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 品目検査、品目パタンを再取得する。<br>
	 */
	public class Srch02 extends MSBFL_InspInstLstReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// マスタ再取得
			callInspInstServiceSrch01();
			
			// 下り電文設定
			setDown();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

		/**
		 * マスタ再取得処理を呼び出す。
		 */
		protected void callInspInstServiceSrch01() {
			MSBFL_InspInstService.InspInst_Srch01 ope = MSBFL_InspInstService.crtInspInst_Srch01();

			copy(ope.up0(), up0(), createMap_InspInst_Srch01_CndR_Srch02_CndR());

			ope.exec();

			copy(up0(), ope.down0(), createMap_Srch02_CndR_InspInst_Srch01_RsltR());
		}

		protected Map_InspInst_Srch01_CndR_Srch02_CndR<InspInst_Srch01_CndR,Srch02_CndR> createMap_InspInst_Srch01_CndR_Srch02_CndR() {
			return new Map_InspInst_Srch01_CndR_Srch02_CndR<InspInst_Srch01_CndR, Srch02_CndR>();
		}

		public class Map_InspInst_Srch01_CndR_Srch02_CndR<D extends InspInst_Srch01_CndR, S extends Srch02_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspInst_Srch01_CndR.$itm_cd, Srch02_CndR.$itm_cd);
				addColumnPathMap(InspInst_Srch01_CndR.$itm_sub1, Srch02_CndR.$itm_sub1);
				addColumnPathMap(InspInst_Srch01_CndR.$itm_sub2, Srch02_CndR.$itm_sub2);
				addColumnPathMap(InspInst_Srch01_CndR.$itm_sub3, Srch02_CndR.$itm_sub3);
				addColumnPathMap(InspInst_Srch01_CndR.$master_dt, Srch02_CndR.$master_dt);
				addColumnPathMap(InspInst_Srch01_CndR.$insp_typ, Srch02_CndR.$insp_typ);
				addColumnPathMap(InspInst_Srch01_CndR.$loc_cd, Srch02_CndR.$loc_cd);
				addColumnPathMap(InspInst_Srch01_CndR.$mfg_loc_cd, Srch02_CndR.$mfg_loc_cd);
				addColumnPathMap(InspInst_Srch01_CndR.$sppl_cd, Srch02_CndR.$sppl_cd);
				addColumnPathMap(InspInst_Srch01_CndR.$maker_cd, Srch02_CndR.$maker_cd);
				addColumnPathMap(InspInst_Srch01_CndR.$insp_ptn_cd, Srch02_CndR.$insp_ptn_cd);
			}
		}
		
		protected Map_Srch02_CndR_InspInst_Srch01_RsltR<Srch02_CndR,InspInst_Srch01_RsltR> createMap_Srch02_CndR_InspInst_Srch01_RsltR() {
			return new Map_Srch02_CndR_InspInst_Srch01_RsltR<Srch02_CndR, InspInst_Srch01_RsltR>();
		}

		public class Map_Srch02_CndR_InspInst_Srch01_RsltR<D extends Srch02_CndR, S extends InspInst_Srch01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch02_CndR.$insp_mtd_typ, InspInst_Srch01_RsltR.$insp_mtd_typ);
				addColumnPathMap(Srch02_CndR.$insp_mtd_typ_nm, InspInst_Srch01_RsltR.$insp_mtd_typ_nm);
				addColumnPathMap(Srch02_CndR.$insp_std_no, InspInst_Srch01_RsltR.$insp_std_no);
				addColumnPathMap(Srch02_CndR.$insp_bind_typ, InspInst_Srch01_RsltR.$insp_bind_typ);
				addColumnPathMap(Srch02_CndR.$std_req_flg, InspInst_Srch01_RsltR.$std_req_flg);
				addColumnPathMap(Srch02_CndR.$std_cnf_req_flg, InspInst_Srch01_RsltR.$std_cnf_req_flg);
				addColumnPathMap(Srch02_CndR.$plnt_aprv_flg, InspInst_Srch01_RsltR.$plnt_aprv_flg);
				addColumnPathMap(Srch02_CndR.$insp_aprv_flg, InspInst_Srch01_RsltR.$insp_aprv_flg);
			}
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 登録前チェックを行う。<br>
	 */
	public class Chk01 extends MSBFL_InspInstLstReg_MC_A.Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査予定の更新カウンタチェック
			msgL.addAll(chkSchdUpdCnt());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			// 場所の更新権限のチェック
			msgL.addAll(dacChk(notErrL));
			msgL.addAll(chkInspInst(notErrL));
			msgL.addAll(chkInspMtdTyp(notErrL));
			msgL.addAll(chkPlntAprvRoleCd(notErrL));
			msgL.addAll(chkSummaryInspSchd(notErrL));

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 品目検査規格マスタ存在チェックを行う。
		 * 
		 * @param upL チェック対象
		 * @return メッセージリスト
		 */
		protected MCMessageList chkInspInst(MCList<Chk01_RsltR> upL) {

			MCMessageList msgL = new MCMessageList();

			for (Chk01_RsltR upR : upL) {
				if (MAC_INSP_MTD_TYP.isSPEC(upR.insp_mtd_typ())) {
					MAM_INSP_SPEC_R t = MAM_INSP_SPEC_R.create("T");
					int cnt = execDbCount("MSBFL0030_MAM_INSP_SPEC_S01", t, t.itm_cd.eq(bind("itm_cd"))
							.and(t.itm_sub1.eq(bind("itm_sub1")))
							.and(t.itm_sub2.eq(bind("itm_sub2")))
							.and(t.itm_sub3.eq(bind("itm_sub3")))
							.and(t.insp_ptn_cd.eq(bind("insp_ptn_cd")))
							.and(t.st_dt.lte(bind("inst_dt")))
							.and(t.end_dt.gte(bind("inst_dt"))), upR);
					if (cnt <= 0) {
						msgL.add(new MCMessage(upR, null, MSBFL0039, 
								toDispItm(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3()),
								upR.insp_ptn_cd(), toYMDString(upR.inst_dt()), toDispGUIIndex(upR)));
					}
				}
			}

			return msgL;
		}

		/**
		 * 検査方法区分変更不可チェック
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList chkInspMtdTyp(MCList<Chk01_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();
			
			// 品目品管マスタ情報の取得
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T1");
			MAM_LOC_R m1 = MAM_LOC_R.create("M1");
			MCList<MST_INSP_SCHD_R> dbc = MCList.create(MST_INSP_SCHD_R.class);
			MCQueryApiBuilder insp_schd_builder = MCQueryApiBuilder.create(t);
			insp_schd_builder.addSelect(m1.site_cd);
			insp_schd_builder.addLeftOuterJoin(m1, bracket(t.loc_cd.eq(m1.loc_cd)));
			insp_schd_builder.setWhere(t.insp_schd_no.eq(bind("insp_schd_no")));
			dbSelect("MSBFL0030_MST_INSP_SCHD_S04", dbc, insp_schd_builder, upL);
			MCIndexKey inspSchdIdx = dbc.createIndex(MST_INSP_SCHD_R.$insp_schd_no);
			
			MCList<InspSchd_Srch01_CndR> cndL = MCList.create(InspSchd_Srch01_CndR.class);
			for (Chk01_RsltR upR : upL) {
				InspSchd_Srch01_CndR cndR = InspSchd_Srch01_CndR.create();
				MST_INSP_SCHD_R schdR = dbc.getFirst(inspSchdIdx, upR.insp_schd_no());
				cndR.peg_no(upR.peg_no());
				cndR.itm_cd(upR.itm_cd());
				cndR.itm_sub1(upR.itm_sub1());
				cndR.itm_sub2(upR.itm_sub2());
				cndR.itm_sub3(upR.itm_sub3());
				cndR.base_dt(upR.master_dt());
				cndR.mfg_loc_cd(upR.mfg_loc_cd());
				cndR.sppl_cd(schdR.sppl_cd());
				cndR.maker_cd(schdR.maker_cd());
				cndR.insp_typ(upR.insp_typ());
				cndR.insp_ptn_cd(upR.insp_ptn_cd());
				cndR.to_loc_cd(upR.loc_cd());
				cndR.to_site_cd(schdR.getStringNE("site_cd"));
				cndL.add(cndR);
			}
			MSBFL_InspSchdService.InspSchd_Srch01 srch01 = MSBFL_InspSchdService.crtInspSchd_Srch01();
			srch01.up0().setAll(cndL);
			if (!srch01.up0().isEmpty()) {
				srch01.exec();
			}
			
			MCList<InspSchd_Srch01_CndR> mstInfoL = srch01.down0();
			MCIndexKey idx = mstInfoL.createIndex(InspSchd_Srch01_CndR.$peg_no);
			
			// 検査方法区分変更不可チェック
			for (Chk01_RsltR r : upL) {
				if (MSC_INSP_TYP.isPRDCT(r.insp_typ()) || MSC_INSP_TYP.isACCPT(r.insp_typ())) {
					if (MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ())) {
						if (!MAC_INSP_MTD_TYP.isTTL(r.schd_insp_mtd_typ())) {
							InspSchd_Srch01_CndR chk = mstInfoL.getFirst(idx, r.peg_no());
							if (r.in_prmt_insp_flg() || MAC_INSP_INST_ISSUE_TYP.isON_INST(chk.insp_inst_issue_typ())) {
								msgL.add(new MCMessage(r, null, MSBFL0136, toDispGUIIndex(r)));
							}
						}
					}
				}
				if (MSC_INSP_TYP.isPRCD(r.insp_typ())
						&& !MAC_INSP_MTD_TYP.isSPEC(r.insp_mtd_typ())) {
					msgL.add(new MCMessage(r, null, MSBFL0106, toDispGUIIndex(r)));
				}
				if (MSC_INSP_TYP.isLOT(r.insp_typ()) && r.lmt_up_flg()
						&& MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ())) {
					msgL.add(new MCMessage(r, null, MSBFL0107, toDispGUIIndex(r)));
				}
			}

			return msgL;
		}

		/**
		 * 工場出荷承認役割CDが設定されるかチェック
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList chkPlntAprvRoleCd(MCList<Chk01_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_RsltR> subL = upL.subList(Chk01_RsltR.$plnt_aprv_flg, true);

			MCList<MAM_LOC_R> locL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);
			locL_bldr.setSelect(t.loc_cd);
			locL_bldr.addSelect(t.site_cd);
			dbSelectKey("MSBFL0030_MAM_LOC_S01", locL, locL_bldr, subL);
			
			MCIndexKey locIdxkey = locL.createIndex(MAM_LOC_R.$loc_cd);
			for (Chk01_RsltR r : subL) {
				MAM_LOC_R locR = locL.getFirst(locIdxkey, r.loc_cd());
				if (!isNull(locR)) {
					r.addStringColumn("site_cd", locR.site_cd());
				}
			}
			
			MCList<MAM_ITM_SITE_R> itmSiteL = MCList.create(MAM_ITM_SITE_R.class);
			MAM_ITM_SITE_R t1 = MAM_ITM_SITE_R.create("T1");
			MCQueryApiBuilder itmSiteL_bldr = MCQueryApiBuilder.create(t1);
			dbSelectKey("MSBFL0030_MAM_ITM_SITE_S01", itmSiteL, itmSiteL_bldr, subL);
			
			MCIndexKey idxkey = itmSiteL.createIndex(MAM_ITM_SITE_R.$itm_cd, MAM_ITM_SITE_R.$itm_sub1, MAM_ITM_SITE_R.$itm_sub2, MAM_ITM_SITE_R.$itm_sub3, MAM_ITM_SITE_R.$site_cd);
			
			for (Chk01_RsltR r : subL) {
				MAM_ITM_SITE_R itmSiteR = itmSiteL.getFirst(idxkey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.getStringNE("site_cd"));

				if (isNull(itmSiteR) || !itmSiteR.plnt_aprv_flg() || isNull(itmSiteR.plnt_aprv_role_cd())) {
					msgL.add(new MCMessage(r, null, MSBFL0118, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), 
							r.getStringNE("site_cd"), toDispGUIIndex(r)));
				}
			}
			
			return msgL;
		}

		/**
		 * 入力していないまとめ対象が他に存在するかチェック
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList chkSummaryInspSchd(MCList<Chk01_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();
			
			// 検査予定取得
			MCList<MST_INSP_SCHD_R> inspSchdDbL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			MAM_LOC_R m2 = MAM_LOC_R.create("M2");
			MCQueryApiBuilder inspSchdDbL_bldr = MCQueryApiBuilder.create(t);
			inspSchdDbL_bldr.addSelect(m1.sublot_mng_typ);
			inspSchdDbL_bldr.addSelect(m2.site_cd.as("TO_SITE_CD"));
			inspSchdDbL_bldr.addLeftOuterJoin(m1, bracket(t.itm_cd.eq(m1.itm_cd).and(t.itm_sub1.eq(m1.itm_sub1).and(t.itm_sub2.eq(m1.itm_sub2).and(t.itm_sub3.eq(m1.itm_sub3))))));
			inspSchdDbL_bldr.addLeftOuterJoin(m2, bracket(t.loc_cd.eq(m2.loc_cd)));
			inspSchdDbL_bldr.setWhere(t.insp_schd_no.eq(bind("insp_schd_no")));
			dbSelect("MSBFL0030_MST_INSP_SCHD_S05", inspSchdDbL, inspSchdDbL_bldr, upL);
			
			MCList<MST_INSP_SCHD_R> inspSchdL1 = MCList.create(MST_INSP_SCHD_R.class);
			MCList<MST_INSP_SCHD_R> inspSchdL2 = MCList.create(MST_INSP_SCHD_R.class);
			
			for (MST_INSP_SCHD_R inspSchdDbR : inspSchdDbL ) {
				if (MAC_SUBLOT_MNG_TYP.isSTK(inspSchdDbR.getStringNE("SUBLOT_MNG_TYP"))) {
					// サブロットＮＯを設定しないパターン
					inspSchdL1.add(inspSchdDbR);
				} else {
					// サブロットＮＯを設定するパターン
					inspSchdL2.add(inspSchdDbR);
				}
			}
			
			MCList<MST_INSP_SCHD_R> sumInspSchdL = MCList.create(MST_INSP_SCHD_R.class);
			// サブロットＮＯは設定しないパターンでまとめ対象データ取得
			if (!inspSchdL1.isEmpty()) {
				sumInspSchdL.addAll(getInspSchd(inspSchdL1, false));
			}
			// サブロットＮＯは設定するパターンでまとめ対象データ取得
			if (!inspSchdL2.isEmpty()) {
				sumInspSchdL.addAll(getInspSchd(inspSchdL2, true));
			}
			
			// NGListの作成
			MCList<MST_INSP_SCHD_R> inspSchdNGL = MCList.create(MST_INSP_SCHD_R.class);
			MCIndexKey idxkey = inspSchdDbL.createIndex(MST_INSP_SCHD_R.$insp_schd_no);
			for (MST_INSP_SCHD_R sumInspSchdR : sumInspSchdL) {
				if (!inspSchdDbL.contains(idxkey, sumInspSchdR.insp_schd_no())) {
					inspSchdNGL.add(sumInspSchdR);
				}
			}
			
			// 上り電文に含まれていないまとめ対象データチェック
			MCIndexKey idxkeyNotSublot = inspSchdNGL.createIndex(MST_INSP_SCHD_R.$insp_freq, MST_INSP_SCHD_R.$src_no1,
					MST_INSP_SCHD_R.$src_no2,MST_INSP_SCHD_R.$insp_typ,MST_INSP_SCHD_R.$insp_mtd_typ,MST_INSP_SCHD_R.$itm_cd,
					MST_INSP_SCHD_R.$itm_sub1,MST_INSP_SCHD_R.$itm_sub2,MST_INSP_SCHD_R.$itm_sub3,MST_INSP_SCHD_R.$lot_no,
					MST_INSP_SCHD_R.$own_insp_no,MST_INSP_SCHD_R.$insp_bind_typ,MST_INSP_SCHD_R.$mfg_loc_cd,MST_INSP_SCHD_R.$sppl_cd,
					MST_INSP_SCHD_R.$maker_cd,MST_INSP_SCHD_R.$from_site_cd,"to_site_cd");
			MCIndexKey idxkeySublot = inspSchdNGL.createIndex(MST_INSP_SCHD_R.$insp_freq, MST_INSP_SCHD_R.$src_no1,
					MST_INSP_SCHD_R.$src_no2,MST_INSP_SCHD_R.$insp_typ,MST_INSP_SCHD_R.$insp_mtd_typ,MST_INSP_SCHD_R.$itm_cd,
					MST_INSP_SCHD_R.$itm_sub1,MST_INSP_SCHD_R.$itm_sub2,MST_INSP_SCHD_R.$itm_sub3,MST_INSP_SCHD_R.$lot_no,
					MST_INSP_SCHD_R.$sublot_no,MST_INSP_SCHD_R.$own_insp_no,MST_INSP_SCHD_R.$insp_bind_typ,
					MST_INSP_SCHD_R.$mfg_loc_cd,MST_INSP_SCHD_R.$sppl_cd,MST_INSP_SCHD_R.$maker_cd,MST_INSP_SCHD_R.$from_site_cd,"to_site_cd");
			for (Chk01_RsltR r : upL) {
				MST_INSP_SCHD_R inspDBR = inspSchdDbL.getFirst(idxkey, r.insp_schd_no());
				// NGリストの取得
				if (MAC_SUBLOT_MNG_TYP.isSTK(inspDBR.getStringNE("SUBLOT_MNG_TYP"))) {
					if (inspSchdNGL.contains(idxkeyNotSublot, inspDBR.insp_freq(), inspDBR.src_no1(),
							inspDBR.src_no2(),inspDBR.insp_typ(),inspDBR.insp_mtd_typ(),inspDBR.itm_cd(),
							inspDBR.itm_sub1(),inspDBR.itm_sub2(),inspDBR.itm_sub3(),inspDBR.lot_no(),
							inspDBR.own_insp_no(),inspDBR.insp_bind_typ(),inspDBR.mfg_loc_cd(),inspDBR.sppl_cd(),
							inspDBR.maker_cd(),inspDBR.from_site_cd(),inspDBR.getStringNE("to_site_cd"))) {

						msgL.add(new MCMessage(r, null, MSBFL0139, r.insp_schd_no(), toDispGUIIndex(r)));
					}
				} else {
					if (inspSchdNGL.contains(idxkeySublot, inspDBR.insp_freq(), inspDBR.src_no1(),
							inspDBR.src_no2(),inspDBR.insp_typ(),inspDBR.insp_mtd_typ(),inspDBR.itm_cd(),
							inspDBR.itm_sub1(),inspDBR.itm_sub2(),inspDBR.itm_sub3(),inspDBR.lot_no(),inspDBR.sublot_no(),
							inspDBR.own_insp_no(),inspDBR.insp_bind_typ(),inspDBR.mfg_loc_cd(),inspDBR.sppl_cd(),
							inspDBR.maker_cd(),inspDBR.from_site_cd(),inspDBR.getStringNE("to_site_cd"))) {

						msgL.add(new MCMessage(r, null, MSBFL0139, r.insp_schd_no(), toDispGUIIndex(r)));
					}
				}
			}
			return msgL;
		}

		/**
		 * まとめ対象一覧を取得する。
		 * 
		 * @return まとめ対象一覧
		 */
		protected MCList<MST_INSP_SCHD_R> getInspSchd(MCList<MST_INSP_SCHD_R> inspL, boolean setSublot) {
			// まとめ対象のデータ取得
			MCList<MST_INSP_SCHD_R> dbc = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			MAM_LOC_R m2 = MAM_LOC_R.create("M2");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.addSelect(m1.sublot_mng_typ);
			dbc_bldr.addSelect(m2.site_cd.as("TO_SITE_CD"));
			dbc_bldr.addLeftOuterJoin(m1, bracket(t.itm_cd.eq(m1.itm_cd).and(t.itm_sub1.eq(m1.itm_sub1).and(t.itm_sub2.eq(m1.itm_sub2).and(t.itm_sub3.eq(m1.itm_sub3))))));
			dbc_bldr.addLeftOuterJoin(m2, bracket(t.loc_cd.eq(m2.loc_cd)));
			dbc_bldr.setWhere(value(0).eq(value(0)));
			dbc_bldr.addConstWhereWithAnd(t.insp_schd_sts_typ.eq(value(MSC_INSP_STS_TYP.YET.value())));
			dbc_bldr.addConstWhereWithAnd(t.insp_typ.eq(value(MSC_INSP_TYP.ACCPT.value())).or(t.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value()))).or(t.insp_typ.eq(value(MSC_INSP_TYP.LOT.value()))));
			dbc_bldr.addConstWhereWithAnd(t.insp_bind_typ.isNotNull());
			dbc_bldr.addConstWhereWithAnd(t.insp_bind_typ.neq(value(MAC_INSP_BIND_TYP.ACT.value())));
			dbc_bldr.addWhereWithAnd(t.insp_freq.eq(bind("insp_freq")));
			dbc_bldr.addWhereWithAnd(t.src_no1.isNull().and(bind("src_no1").isNull()).or(t.src_no1.eq(bind("src_no1"))));
			dbc_bldr.addWhereWithAnd(t.src_no2.isNull().and(bind("src_no2").isNull()).or(t.src_no2.eq(bind("src_no2"))));
			dbc_bldr.addWhereWithAnd(t.insp_typ.eq(bind("insp_typ")));
			dbc_bldr.addWhereWithAnd(t.insp_mtd_typ.isNull().and(bind("insp_mtd_typ").isNull()).or(t.insp_mtd_typ.eq(bind("insp_mtd_typ"))));
			dbc_bldr.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
			dbc_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			dbc_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			dbc_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			dbc_bldr.addWhereWithAnd(t.lot_no.isNull().and(bind("lot_no").isNull()).or(t.lot_no.eq(bind("lot_no"))));
			if (setSublot) {
				dbc_bldr.addWhereWithAnd(t.sublot_no.isNull().and(bind("sublot_no").isNull()).or(t.sublot_no.eq(bind("sublot_no"))));
			}
			dbc_bldr.addWhereWithAnd(t.own_insp_no.isNull().and(bind("own_insp_no").isNull()).or(t.own_insp_no.eq(bind("own_insp_no"))));
			dbc_bldr.addWhereWithAnd(t.insp_bind_typ.isNull().and(bind("insp_bind_typ").isNull()).or(t.insp_bind_typ.eq(bind("insp_bind_typ"))));
			dbc_bldr.addWhereWithAnd(t.mfg_loc_cd.eq(bind("mfg_loc_cd")));
			dbc_bldr.addWhereWithAnd(t.sppl_cd.eq(bind("sppl_cd")));
			dbc_bldr.addWhereWithAnd(t.maker_cd.eq(bind("maker_cd")));
			dbc_bldr.addWhereWithAnd(t.from_site_cd.eq(bind("from_site_cd")));
			dbc_bldr.addWhereWithAnd(m2.site_cd.eq(bind("to_site_cd")));
			
			dbSelect("MSBFL0030_MST_INSP_SCHD_S06", dbc, dbc_bldr, inspL);
			
			return dbc;
		}

		/**
		 * 更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkSchdUpdCnt() {
			MCList<MST_INSP_SCHD_R> selectL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);

			selectL_bldr.setOrderByAsc(t.insp_schd_no);

			MCList<Chk01_RsltR> bindL = up0().groupBy(Chk01_RsltR.$insp_schd_no);
			bindL.sort(Chk01_RsltR.$insp_schd_no);

			dbSelectKeyForUpdateNoWait("MSBFL0030_MST_INSP_SCHD_S02", selectL, selectL_bldr, bindL);

			MCIndexKey idxkey = selectL.createIndex(MST_INSP_SCHD_R.$insp_schd_no);
			MCMessageList msgL = new MCMessageList();
			for (Chk01_RsltR r : up0()) {
				MST_INSP_SCHD_R schdR = selectL.getFirst(idxkey, r.insp_schd_no());
				msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$schd_upd_cntr, schdR));

				if (!isNull(schdR)) {
					if (!isSame(r.itm_cd(), schdR.itm_cd())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_cd, schdR.itm_cd(), r));
					}
					if (!isSame(r.itm_sub1(), schdR.itm_sub1())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub1, schdR.itm_sub1(), r));
					}
					if (!isSame(r.itm_sub2(), schdR.itm_sub2())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub2, schdR.itm_sub2(), r));
					}
					if (!isSame(r.itm_sub3(), schdR.itm_sub3())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub3, schdR.itm_sub3(), r));
					}
					
					// データ補完
					r.master_dt(schdR.master_dt());
					r.insp_typ(schdR.insp_typ());
					r.mfg_loc_cd(schdR.mfg_loc_cd());
					r.loc_cd(schdR.loc_cd());
					r.schd_insp_mtd_typ(schdR.insp_mtd_typ());
					r.lmt_up_flg(schdR.lmt_up_flg());
				}
			}

			return msgL;
		}

		/**
		 * 場所の更新権限のチェックをします。
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList dacChk(MCList<Chk01_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();
			
			for (Chk01_RsltR schdR : upL) {
				if (MSC_INSP_TYP.isPRDCT(schdR.insp_typ())) {
					msgL.addAll(checkWritableLocCdDac(schdR, Chk01_RsltR.$mfg_loc_cd));
				}
				else {
					msgL.addAll(checkWritableLocCdDac(schdR, Chk01_RsltR.$loc_cd));
				}
			}
			
			return msgL;
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 承認前チェックを行う。<br>
	 */
	public class Chk02 extends MSBFL_InspInstLstReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査指図の更新カウンタチェック
			msgL.addAll(chkInstUpdCnt(up0()));

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk02_RsltR> notErrL = getChkList(up0());

			// 承認役割チェック
			msgL.addAll(chkAprvRole(notErrL));

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 更新カウンタチェックを行う。
		 * 
		 * @param upL チェック対象
		 * @return メッセージリスト
		 */
		protected MCMessageList chkInstUpdCnt(MCList<Chk02_RsltR> upL) {
			MCList<MST_INSP_INST_R> selectL = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.insp_no);

			MCList<Chk02_RsltR> bindL = upL.groupBy(Chk02_RsltR.$insp_no);
			bindL.sort(Chk04_RsltR.$insp_no);

			dbSelectKeyForUpdateNoWait("MSBFL0030_MST_INSP_INST_S01", selectL, selectL_bldr, bindL);

			MCIndexKey idxkey = selectL.createIndex(MST_INSP_INST_R.$insp_no);
			MCMessageList msgL = new MCMessageList();
			for (Chk02_RsltR r : upL) {
				MST_INSP_INST_R instR = selectL.getFirst(idxkey, r.insp_no());
				msgL.addAll(checkUpdCntrNE(r, Chk04_RsltR.$inst_upd_cntr, instR));

				if (!isNull(instR)) {

					// 指図日補完
					r.inst_dt(instR.inst_dt());
					r.insp_aprv_role_cd(instR.insp_aprv_role_cd());

					if (!isSame(r.itm_cd(), instR.itm_cd())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_cd, instR.itm_cd(), r));
					}
					if (!isSame(r.itm_sub1(), instR.itm_sub1())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub1, instR.itm_sub1(), r));
					}
					if (!isSame(r.itm_sub2(), instR.itm_sub2())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub2, instR.itm_sub2(), r));
					}
					if (!isSame(r.itm_sub3(), instR.itm_sub3())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub3, instR.itm_sub3(), r));
					}
				}
			}

			return msgL;
		}

		/**
		 * 承認役割権限チェックを実行する。
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList chkAprvRole(MCList<Chk02_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk02_RsltR upR : upL) {

				// 権限チェック
				if (!isAprvUsrR(upR.insp_aprv_role_cd())) {
					msgL.add(new MCMessage(upR, null, MSBFL0010, toDispGUIIndex(upR)));
				}
			}

			return msgL;
		}
	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 指図取消前チェックを行う。<br>
	 */
	public class Chk03 extends MSBFL_InspInstLstReg_MC_A.Chk03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCList<Chk03_RsltR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				
				callInspInstServiceChk05(notErrL);
				
				// 検査指図サービスの取消前チェック
				callInspInstServiceChk04(notErrL);
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査予定の更新カウンタチェック
			msgL.addAll(chkSchdUpdCnt());

			// 検査指図の更新カウンタチェック
			msgL.addAll(chkInstUpdCnt());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk03_RsltR> notErrL = getChkList(up0());

			// 場所の更新権限のチェック
			msgL.addAll(dacChk(notErrL));

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 検査予定の更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkSchdUpdCnt() {
			MCList<MST_INSP_SCHD_R> selectL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);

			selectL_bldr.setOrderByAsc(t.insp_schd_no);

			MCList<Chk03_RsltSchdR> bindL = up1().groupBy(Chk03_RsltSchdR.$insp_schd_no);
			bindL.sort(Chk03_RsltSchdR.$insp_schd_no);

			dbSelectKeyForUpdateNoWait("MSBFL0030_MST_INSP_SCHD_S03", selectL, selectL_bldr, bindL);

			MCIndexKey idxkey = selectL.createIndex(MST_INSP_SCHD_R.$insp_schd_no);
			MCIndexKey inspIdxkey = up0().createIndex(Chk03_RsltR.$insp_no);
			MCMessageList msgL = new MCMessageList();
			for (Chk03_RsltSchdR r : up1()) {
				MST_INSP_SCHD_R schdR = selectL.getFirst(idxkey, r.insp_schd_no());
				msgL.addAll(checkUpdCntrNE(r, Chk03_RsltSchdR.$schd_upd_cntr, schdR));
				setErrFlg(r, msgL);
				if (r.err_flg()) {
					Chk03_RsltR rsltR = up0().getFirst(inspIdxkey, r.insp_no());
					if (!rsltR.err_flg()) {
						rsltR.err_flg(true);
					}
				}
				if (!isNull(schdR)) {
					r.insp_typ(schdR.insp_typ());
					r.mfg_loc_cd(schdR.mfg_loc_cd());
					r.loc_cd(schdR.loc_cd());
				}
			}

			return msgL;
		}

		/**
		 * 検査指図の更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkInstUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk03_RsltR> notErrL = up0().subList(Chk03_RsltR.$err_flg, false);

			if (notErrL.isEmpty()) {
				return msgL;
			}

			MCList<MST_INSP_INST_R> selectL = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.insp_no);

			MCList<Chk03_RsltR> bindL = notErrL.groupBy(Chk03_RsltR.$insp_no);
			bindL.sort(Chk03_RsltR.$insp_no);

			dbSelectKeyForUpdateNoWait("MSBFL0030_MST_INSP_INST_S02", selectL, selectL_bldr, bindL);
			MCIndexKey idxkey = selectL.createIndex(MST_INSP_INST_R.$insp_no);
			for (Chk03_RsltR r : notErrL) {
				MST_INSP_INST_R instR = selectL.getFirst(idxkey, r.insp_no());
				msgL.addAll(checkUpdCntrNE(r, Chk03_RsltR.$inst_upd_cntr, instR));

				if (!isNull(instR)) {
					if (!isSame(r.itm_cd(), instR.itm_cd())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_cd, instR.itm_cd(), r));
					}
					if (!isSame(r.itm_sub1(), instR.itm_sub1())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub1, instR.itm_sub1(), r));
					}
					if (!isSame(r.itm_sub2(), instR.itm_sub2())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub2, instR.itm_sub2(), r));
					}
					if (!isSame(r.itm_sub3(), instR.itm_sub3())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub3, instR.itm_sub3(), r));
					}
				}
			}

			return msgL;
		}

		/**
		 * 場所の更新権限のチェックをします。
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList dacChk(MCList<Chk03_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();
			
			MCIndexKey idxkey = up1().createIndex(Chk03_RsltSchdR.$insp_no);
			for (Chk03_RsltR r : upL) {
				MCMessageList msgTmpL = new MCMessageList();
				MCList<Chk03_RsltSchdR> subSchdL = up1().subList(idxkey, r.insp_no());
				for (Chk03_RsltSchdR schdR : subSchdL) {
					schdR.setAttributes(r);
					if (MSC_INSP_TYP.isPRDCT(schdR.insp_typ())) {
						msgTmpL.addAll(checkWritableLocCdDac(schdR, Chk03_RsltSchdR.$mfg_loc_cd));
					}
					else {
						msgTmpL.addAll(checkWritableLocCdDac(schdR, Chk03_RsltSchdR.$loc_cd));
					}
				}
				if (!subSchdL.isEmpty() && subSchdL.size() == msgTmpL.size()) {
					msgL.addAll(msgTmpL);
					r.err_flg(true);
				}
			}
			return msgL;
		}

		/**
		 * 検査指図サービスの取消前チェックを行う。
		 */
		protected void callInspInstServiceChk04(MCList<Chk03_RsltR> notErrL) {
			MSBFL_InspInstService.InspInst_Chk04 ope = MSBFL_InspInstService.crtInspInst_Chk04();
			addAll(ope.up0(), notErrL, createMap_InspInst_Chk04_RsltR_Chk03_RsltR());

			ope.exec();

			copyErrFlg(notErrL, ope.down0());
		}
		
		/**
		 * 検査指図サービスの更新・取消・承認取消の共通チェックを行う。
		 */
		protected void callInspInstServiceChk05(MCList<Chk03_RsltR> notErrL) {
			MSBFL_InspInstService.InspInst_Chk05 ope = MSBFL_InspInstService.crtInspInst_Chk05();
			addAll(ope.up0(), notErrL, createMap_InspInst_Chk05_RsltR_Chk03_RsltR());

			ope.exec();

			copyErrFlg(notErrL, ope.down0());
		}

		protected Map_InspInst_Chk04_RsltR_Chk03_RsltR<InspInst_Chk04_RsltR,Chk03_RsltR> createMap_InspInst_Chk04_RsltR_Chk03_RsltR() {
			return new Map_InspInst_Chk04_RsltR_Chk03_RsltR<InspInst_Chk04_RsltR, Chk03_RsltR>();
		}

		public class Map_InspInst_Chk04_RsltR_Chk03_RsltR<D extends InspInst_Chk04_RsltR, S extends Chk03_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspInst_Chk04_RsltR.$peg_no, Chk03_RsltR.$peg_no);
				addColumnPathMap(InspInst_Chk04_RsltR.$insp_no, Chk03_RsltR.$insp_no);
			}
		}
		
		protected Map_InspInst_Chk05_RsltR_Chk03_RsltR<InspInst_Chk05_RsltR,Chk03_RsltR> createMap_InspInst_Chk05_RsltR_Chk03_RsltR() {
			return new Map_InspInst_Chk05_RsltR_Chk03_RsltR<InspInst_Chk05_RsltR, Chk03_RsltR>();
		}

		public class Map_InspInst_Chk05_RsltR_Chk03_RsltR<D extends InspInst_Chk05_RsltR, S extends Chk03_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspInst_Chk05_RsltR.$peg_no, Chk03_RsltR.$peg_no);
				addColumnPathMap(InspInst_Chk05_RsltR.$insp_no, Chk03_RsltR.$insp_no);
				addColumnPathMap(InspInst_Chk05_RsltR.$insp_freq, Chk03_RsltR.$insp_freq);
				addColumnPathMap(InspInst_Chk05_RsltR.$err_flg, Chk03_RsltR.$err_flg);

			}
		}
	}
	/**
	 * Chk04オペレーション.<p>
	 *
	 * 承認取消前チェックを行う。<br>
	 */
	public class Chk04 extends MSBFL_InspInstLstReg_MC_A.Chk04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			MCList<Chk04_RsltR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				
				callInspInstServiceChk05(notErrL);
				
				// 検査指図サービスの取消前チェック
				callInspInstServiceChk04(notErrL);
			}

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査指図の更新カウンタチェック
			msgL.addAll(chkInstUpdCnt(up0()));

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk04_RsltR> notErrL = getChkList(up0());

			// 承認役割チェック
			msgL.addAll(chkAprvRole(notErrL));

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 更新カウンタチェックを行う。
		 * 
		 * @param upL チェック対象
		 * @return メッセージリスト
		 */
		protected MCMessageList chkInstUpdCnt(MCList<Chk04_RsltR> upL) {
			MCList<MST_INSP_INST_R> selectL = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.insp_no);

			MCList<Chk04_RsltR> bindL = upL.groupBy(Chk04_RsltR.$insp_no);
			bindL.sort(Chk04_RsltR.$insp_no);

			dbSelectKeyForUpdateNoWait("MSBFL0030_MST_INSP_INST_S03", selectL, selectL_bldr, bindL);

			MCIndexKey idxkey = selectL.createIndex(MST_INSP_INST_R.$insp_no);
			MCMessageList msgL = new MCMessageList();
			for (Chk04_RsltR r : upL) {
				MST_INSP_INST_R instR = selectL.getFirst(idxkey, r.insp_no());
				msgL.addAll(checkUpdCntrNE(r, Chk04_RsltR.$inst_upd_cntr, instR));

				if (!isNull(instR)) {
					r.insp_aprv_role_cd(instR.insp_aprv_role_cd());

					if (!isSame(r.itm_cd(), instR.itm_cd())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_cd, instR.itm_cd(), r));
					}
					if (!isSame(r.itm_sub1(), instR.itm_sub1())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub1, instR.itm_sub1(), r));
					}
					if (!isSame(r.itm_sub2(), instR.itm_sub2())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub2, instR.itm_sub2(), r));
					}
					if (!isSame(r.itm_sub3(), instR.itm_sub3())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub3, instR.itm_sub3(), r));
					}
				}
			}

			return msgL;
		}

		/**
		 * 承認役割権限チェックを実行する。
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList chkAprvRole(MCList<Chk04_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk04_RsltR upR : upL) {

				// 権限チェック
				if (!isAprvUsrR(upR.insp_aprv_role_cd())) {
					msgL.add(new MCMessage(upR, null, MSBFL0010, toDispGUIIndex(upR)));
				}
			}

			return msgL;
		}

		/**
		 * 検査指図サービスの取消前チェックを行う。
		 */
		protected void callInspInstServiceChk04(MCList<Chk04_RsltR> notErrL) {
			MSBFL_InspInstService.InspInst_Chk04 ope = MSBFL_InspInstService.crtInspInst_Chk04();

			addAll(ope.up0(), notErrL, createMap_InspInst_Chk04_RsltR_Chk04_RsltR());

			ope.exec();

			copyErrFlg(notErrL, ope.down0());
		}
		
		/**
		 * 検査指図サービスの更新・取消・承認取消の共通チェックを行う。
		 */
		protected void callInspInstServiceChk05(MCList<Chk04_RsltR> notErrL) {
			MSBFL_InspInstService.InspInst_Chk05 ope = MSBFL_InspInstService.crtInspInst_Chk05();
			addAll(ope.up0(), notErrL, createMap_InspInst_Chk05_RsltR_Chk04_RsltR());

			ope.exec();

			copyErrFlg(notErrL, ope.down0());
		}

		protected Map_InspInst_Chk04_RsltR_Chk04_RsltR<InspInst_Chk04_RsltR,Chk04_RsltR> createMap_InspInst_Chk04_RsltR_Chk04_RsltR() {
			return new Map_InspInst_Chk04_RsltR_Chk04_RsltR<InspInst_Chk04_RsltR, Chk04_RsltR>();
		}

		public class Map_InspInst_Chk04_RsltR_Chk04_RsltR<D extends InspInst_Chk04_RsltR, S extends Chk04_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspInst_Chk04_RsltR.$peg_no, Chk04_RsltR.$peg_no);
				addColumnPathMap(InspInst_Chk04_RsltR.$insp_no, Chk04_RsltR.$insp_no);
			}
		}
		
		protected Map_InspInst_Chk05_RsltR_Chk04_RsltR<InspInst_Chk05_RsltR,Chk04_RsltR> createMap_InspInst_Chk05_RsltR_Chk04_RsltR() {
			return new Map_InspInst_Chk05_RsltR_Chk04_RsltR<InspInst_Chk05_RsltR, Chk04_RsltR>();
		}

		public class Map_InspInst_Chk05_RsltR_Chk04_RsltR<D extends InspInst_Chk05_RsltR, S extends Chk04_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspInst_Chk05_RsltR.$peg_no, Chk04_RsltR.$peg_no);
				addColumnPathMap(InspInst_Chk05_RsltR.$insp_no, Chk04_RsltR.$insp_no);
				addColumnPathMap(InspInst_Chk05_RsltR.$insp_freq, Chk04_RsltR.$insp_freq);
				addColumnPathMap(InspInst_Chk05_RsltR.$err_flg, Chk04_RsltR.$err_flg);

			}
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 検査指図を一括登録する。<br>
	 */
	public class Ins01 extends MSBFL_InspInstLstReg_MC_A.Ins01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {

			editUp();

			// 前チェック処理
			callThisChk01();

			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {

				// 検査指図の一括登録
				callInspInstServiceIns01(notErrL);

				// 即時発行（電文）はオンの場合、検査成績書の発行
				callInspRptServicePrnt02(notErrL);
			}
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk01_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_RsltR> up0L = ((MCList<Chk01_RsltR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_RsltR.$peg_no, up0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBFL_InspInstLstReg.Chk01 ope = MSBFL_InspInstLstReg.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 検査指図を一括登録する。
		 * 
		 * @param notErrL
		 */
		protected void callInspInstServiceIns01(MCList<Chk01_RsltR> notErrL) {
			MSBFL_InspInstService.InspInst_Ins01 ins = MSBFL_InspInstService.crtInspInst_Ins01();

			addAll(ins.up0(), notErrL, createMap_InspInst_Ins01_RsltR_Chk01_RsltR());

			ins.exec();

			String[] destCols = new String[] {Chk01_RsltR.$insp_no, Chk01_RsltR.$insp_mtd_typ, Chk01_RsltR.$insp_sts_typ, 
					Chk01_RsltR.$insp_sts_typ_nm, Chk01_RsltR.$insp_aprv_flg, Chk01_RsltR.$inst_rslt_issue_flg};
			String[] srcCols = new String[] {InspInst_Ins01_RsltR.$insp_no, InspInst_Ins01_RsltR.$insp_mtd_typ, InspInst_Ins01_RsltR.$insp_sts_typ, 
					InspInst_Ins01_RsltR.$insp_sts_typ_nm, InspInst_Ins01_RsltR.$insp_aprv_flg, InspInst_Ins01_RsltR.$inst_rslt_issue_flg};
			copyByPegNo(notErrL, destCols, ins.down0(), srcCols);
		}

		/**
		 * 検査成績書を発行する。
		 * 
		 * @param notErrL
		 */
		protected void callInspRptServicePrnt02(MCList<Chk01_RsltR> notErrL) {
			MCList<Chk01_RsltR> subL = notErrL.subList(Chk01_RsltR.$prnt_flg, true);
			if (subL.isEmpty()) {
				return;
			}
			MSBFL_InspRptService.InspRpt_Prnt02 prnt = MSBFL_InspRptService.crtInspRpt_Prnt02();

			addAll(prnt.up0(), subL.subList(Chk01_RsltR.$inst_rslt_issue_flg, true), createMap_InspRpt_Prnt02_DtlR_Chk01_RsltR());

			if (!prnt.up0().isEmpty()) {
				prnt.exec();
				
				String[] destCols = new String[] {Chk01_RsltR.$insp_rslt_prnt_flg, Chk01_RsltR.$insp_rslt_prnt_tm};
				String[] srcCols = new String[] {InspRpt_Prnt02_DtlR.$insp_rslt_prnt_flg, InspRpt_Prnt02_DtlR.$insp_rslt_prnt_tm};
				copyByPegNo(subL, destCols, prnt.down0(), srcCols);
			}
		}

		/**
		 * 品目ＣＤ、枝番１～３が同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk01_RsltR>> splitUp(MCList<Chk01_RsltR> list, int max) {
			List<MCList<Chk01_RsltR>> ret = new ArrayList<>();
			MCList<Chk01_RsltR>[] grpL = list.groupList(Chk01_RsltR.$itm_cd
					, Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub3);
			MCList<Chk01_RsltR> tmp = MCList.create(Chk01_RsltR.class);
			for (MCList<Chk01_RsltR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk01_RsltR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}

		/**
		 * 処理結果状態区分を設定する。
		 * @param l
		 */
		protected void handleSuccess(MCList<Chk01_RsltR> l) {
			dbTran().commit();
			for (Chk01_RsltR r : l) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * エラーハンドルを設定する。
		 * @param e
		 * @param l
		 */
		protected void handleEx(Exception e, MCList<Chk01_RsltR> l) {
			dbTran().rollback();
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			// 画面にエラー内容を表示するために、メッセージプールにaddしているが、Exceptionと上り電文の行との対応付けはできないので、
			// causeRowは設定しない
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk01_RsltR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		protected Map_InspRpt_Prnt02_DtlR_Chk01_RsltR<InspRpt_Prnt02_DtlR,Chk01_RsltR> createMap_InspRpt_Prnt02_DtlR_Chk01_RsltR() {
			return new Map_InspRpt_Prnt02_DtlR_Chk01_RsltR<InspRpt_Prnt02_DtlR, Chk01_RsltR>();
		}

		public class Map_InspRpt_Prnt02_DtlR_Chk01_RsltR<D extends InspRpt_Prnt02_DtlR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspRpt_Prnt02_DtlR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(InspRpt_Prnt02_DtlR.$insp_no, Chk01_RsltR.$insp_no);
				addColumnPathMap(InspRpt_Prnt02_DtlR.$insp_rslt_prnt_flg, Chk01_RsltR.$insp_rslt_prnt_flg);
				addColumnPathMap(InspRpt_Prnt02_DtlR.$insp_rslt_prnt_tm, Chk01_RsltR.$insp_rslt_prnt_tm);

			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 一括検査指図承認を行う。<br>
	 */
	public class Upd01 extends MSBFL_InspInstLstReg_MC_A.Upd01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {

			editUp();

			// 前チェック処理
			callThisChk02();

			MCList<Chk02_RsltR> notErrL = up0().subList(Chk02_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {

				// 検査指図の承認
				callInspInstServiceUpd02(notErrL);
			}
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk02_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk02_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk02_RsltR> up0L = ((MCList<Chk02_RsltR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk02_RsltR.$peg_no, up0());
			// 承認日時
			up0().setValueNE(Chk02_RsltR.$aprv_tm, MCDate.now());
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBFL_InspInstLstReg.Chk02 ope = MSBFL_InspInstLstReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 検査指図を承認する。
		 * 
		 * @param notErrL
		 */
		protected void callInspInstServiceUpd02(MCList<Chk02_RsltR> notErrL) {
			MSBFL_InspInstService.InspInst_Upd02 upd = MSBFL_InspInstService.crtInspInst_Upd02();

			addAll(upd.up0(), notErrL, createMap_InspInst_Upd02_RsltR_Chk02_RsltR());

			upd.exec();

			String[] destCols = new String[] {Chk02_RsltR.$insp_no, Chk02_RsltR.$insp_aprv_sts_typ, Chk02_RsltR.$insp_aprv_sts_typ_nm};
			String[] srcCols = new String[] {InspInst_Upd02_RsltR.$insp_no, InspInst_Upd02_RsltR.$insp_aprv_sts_typ, InspInst_Upd02_RsltR.$insp_aprv_sts_typ_nm};
			copyByPegNo(notErrL, destCols, upd.down0(), srcCols);
		}

		/**
		 * 処理結果状態区分を設定する。
		 * @param l
		 */
		protected void handleSuccess(MCList<Chk02_RsltR> l) {
			dbTran().commit();
			for (Chk02_RsltR r : l) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * エラーハンドルを設定する。
		 * @param e
		 * @param l
		 */
		protected void handleEx(Exception e, MCList<Chk02_RsltR> l) {
			dbTran().rollback();
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			// 画面にエラー内容を表示するために、メッセージプールにaddしているが、Exceptionと上り電文の行との対応付けはできないので、
			// causeRowは設定しない
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk02_RsltR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		/**
		 * 品目ＣＤ、枝番１～３が同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk02_RsltR>> splitUp(MCList<Chk02_RsltR> list, int max) {
			List<MCList<Chk02_RsltR>> ret = new ArrayList<>();
			MCList<Chk02_RsltR>[] grpL = list.groupList(Chk02_RsltR.$itm_cd
					, Chk02_RsltR.$itm_sub1, Chk02_RsltR.$itm_sub2, Chk02_RsltR.$itm_sub3);
			MCList<Chk02_RsltR> tmp = MCList.create(Chk02_RsltR.class);
			for (MCList<Chk02_RsltR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk02_RsltR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 検査指図を取り消す。<br>
	 */
	public class Del01 extends MSBFL_InspInstLstReg_MC_A.Del01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {

			editUp();

			// 前チェック処理
			callThisChk03();

			MCList<Chk03_RsltR> notErrL = up0().subList(Chk03_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {

				// 検査指図の取消
				callInspInstServiceDel01(notErrL);
			}
		}

		@Override
		protected <T extends MCRow> MCList<T> getSplitList(MCParam p) {
			MCList<T> ret = (MCList<T>) up0();
			return ret;
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk03_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk03_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk03_RsltR> up0L = ((MCList<Chk03_RsltR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk03_RsltR.$peg_no, up0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MSBFL_InspInstLstReg.Chk03 ope = MSBFL_InspInstLstReg.crtChk03();
			ope.up0().setAll(up0());
			ope.up1().setAll(up1());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 検査指図を取り消す。
		 * 
		 * @param notErrL
		 */
		protected void callInspInstServiceDel01(MCList<Chk03_RsltR> notErrL) {
			MSBFL_InspInstService.InspInst_Del01 del = MSBFL_InspInstService.crtInspInst_Del01();

			addAll(del.up0(), notErrL, createMap_InspInst_Del01_RsltR_Chk03_RsltR());

			del.exec();
			
			String[] destCols = new String[] {Chk03_RsltR.$insp_no, Chk03_RsltR.$insp_sts_typ, Chk03_RsltR.$insp_sts_typ_nm};
			String[] srcCols = new String[] {InspInst_Del01_RsltR.$insp_no, InspInst_Del01_RsltR.$insp_sts_typ, InspInst_Del01_RsltR.$insp_sts_typ_nm};
			copyByPegNo(notErrL, destCols, del.down0(), srcCols);
		}

		/**
		 * 品目ＣＤ、枝番１～３が同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk03_RsltR>> splitUp(MCList<Chk03_RsltR> list, int max) {
			List<MCList<Chk03_RsltR>> ret = new ArrayList<>();
			MCList<Chk03_RsltR>[] grpL = list.groupList(Chk03_RsltR.$itm_cd
					, Chk03_RsltR.$itm_sub1, Chk03_RsltR.$itm_sub2, Chk03_RsltR.$itm_sub3);
			MCList<Chk03_RsltR> tmp = MCList.create(Chk03_RsltR.class);
			for (MCList<Chk03_RsltR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk03_RsltR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}

		/**
		 * 処理結果状態区分を設定する。
		 * @param l
		 */
		protected void handleSuccess(MCList<Chk03_RsltR> l) {
			dbTran().commit();
			for (Chk03_RsltR r : l) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * エラーハンドルを設定する。
		 * @param e
		 * @param l
		 */
		protected void handleEx(Exception e, MCList<Chk03_RsltR> l) {
			dbTran().rollback();
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			// 画面にエラー内容を表示するために、メッセージプールにaddしているが、Exceptionと上り電文の行との対応付けはできないので、
			// causeRowは設定しない
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk03_RsltR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		protected Map_InspInst_Del01_RsltR_Chk03_RsltR<InspInst_Del01_RsltR,Chk03_RsltR> createMap_InspInst_Del01_RsltR_Chk03_RsltR() {
			return new Map_InspInst_Del01_RsltR_Chk03_RsltR<InspInst_Del01_RsltR, Chk03_RsltR>();
		}

		public class Map_InspInst_Del01_RsltR_Chk03_RsltR<D extends InspInst_Del01_RsltR, S extends Chk03_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspInst_Del01_RsltR.$peg_no, Chk03_RsltR.$peg_no);
				addColumnPathMap(InspInst_Del01_RsltR.$insp_no, Chk03_RsltR.$insp_no);
				addColumnPathMap(InspInst_Del01_RsltR.$lims_flg, Chk03_RsltR.$lims_flg);

			}
		}
	}
	/**
	 * Del02オペレーション.<p>
	 *
	 * 検査指図承認を取り消す。<br>
	 */
	public class Del02 extends MSBFL_InspInstLstReg_MC_A.Del02 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {

			editUp();

			// 前チェック処理
			callThisChk04();

			MCList<Chk04_RsltR> notErrL = up0().subList(Chk04_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {

				// 検査指図承認の取消
				callInspInstServiceDel01(notErrL);
			}
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk02_RsltR.$peg_no, up0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk04_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk04_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk04_RsltR> up0L = ((MCList<Chk04_RsltR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk04() {
			MSBFL_InspInstLstReg.Chk04 ope = MSBFL_InspInstLstReg.crtChk04();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 検査指図承認を取り消す。
		 * 
		 * @param notErrL
		 */
		protected void callInspInstServiceDel01(MCList<Chk04_RsltR> notErrL) {
			MSBFL_InspInstService.InspInst_Del01 del = MSBFL_InspInstService.crtInspInst_Del01();

			addAll(del.up0(), notErrL, createMap_InspInst_Del01_RsltR_Chk04_RsltR());

			del.exec();
			
			String[] destCols = new String[] {Chk04_RsltR.$insp_no, Chk04_RsltR.$insp_aprv_sts_typ, Chk04_RsltR.$insp_aprv_sts_typ_nm};
			String[] srcCols = new String[] {InspInst_Del01_RsltR.$insp_no, InspInst_Del01_RsltR.$insp_aprv_sts_typ, InspInst_Del01_RsltR.$insp_aprv_sts_typ_nm};
			copyByPegNo(notErrL, destCols, del.down0(), srcCols);
		}

		/**
		 * 処理結果状態区分を設定する。
		 * @param l
		 */
		protected void handleSuccess(MCList<Chk04_RsltR> l) {
			dbTran().commit();
			for (Chk04_RsltR r : l) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * エラーハンドルを設定する。
		 * @param e
		 * @param l
		 */
		protected void handleEx(Exception e, MCList<Chk04_RsltR> l) {
			dbTran().rollback();
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			// 画面にエラー内容を表示するために、メッセージプールにaddしているが、Exceptionと上り電文の行との対応付けはできないので、
			// causeRowは設定しない
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk04_RsltR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		/**
		 * 品目ＣＤ、枝番１～３が同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk04_RsltR>> splitUp(MCList<Chk04_RsltR> list, int max) {
			List<MCList<Chk04_RsltR>> ret = new ArrayList<>();
			MCList<Chk04_RsltR>[] grpL = list.groupList(Chk04_RsltR.$itm_cd
					, Chk04_RsltR.$itm_sub1, Chk04_RsltR.$itm_sub2, Chk04_RsltR.$itm_sub3);
			MCList<Chk04_RsltR> tmp = MCList.create(Chk04_RsltR.class);
			for (MCList<Chk04_RsltR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk04_RsltR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}

		protected Map_InspInst_Del01_RsltR_Chk04_RsltR<InspInst_Del01_RsltR,Chk04_RsltR> createMap_InspInst_Del01_RsltR_Chk04_RsltR() {
			return new Map_InspInst_Del01_RsltR_Chk04_RsltR<InspInst_Del01_RsltR, Chk04_RsltR>();
		}

		public class Map_InspInst_Del01_RsltR_Chk04_RsltR<D extends InspInst_Del01_RsltR, S extends Chk04_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspInst_Del01_RsltR.$peg_no, Chk04_RsltR.$peg_no);
				addColumnPathMap(InspInst_Del01_RsltR.$insp_no, Chk04_RsltR.$insp_no);
				addColumnPathMap(InspInst_Del01_RsltR.$aprv_rsn, Chk04_RsltR.$aprv_rsn);
				addColumnPathMap(InspInst_Del01_RsltR.$lims_flg, Chk04_RsltR.$lims_flg);
			}
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 検査指図リストを発行する。<br>
	 */
	public class Prnt01 extends MSBFL_InspInstLstReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			// 検査指図リスト発行
			callInspRptServicePrnt01();

			// 処理結果状況区分設定
			setRtnStsTyp();

			// 下り電文設定
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Prnt01_RsltR.$peg_no, up0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 処理結果状況区分を設定する。
		 */
		protected void setRtnStsTyp() {
			for (Prnt01_RsltR r : up0()) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * 検査指図リストを発行する。
		 */
		protected void callInspRptServicePrnt01() {
			MSBFL_InspRptService.InspRpt_Prnt01 prnt = MSBFL_InspRptService.crtInspRpt_Prnt01();

			addAll(prnt.up0(), up0(), createMap_InspRpt_Prnt01_DtlR_Prnt01_RsltR());

			prnt.exec();

			String[] destCols = new String[] {Prnt01_RsltR.$insp_lst_no, Prnt01_RsltR.$insp_lst_prnt_flg, Prnt01_RsltR.$insp_lst_prnt_tm, Prnt01_RsltR.$err_flg};
			String[] srcCols = new String[] {InspRpt_Prnt01_DtlR.$insp_lst_no, InspRpt_Prnt01_DtlR.$insp_lst_prnt_flg, InspRpt_Prnt01_DtlR.$insp_lst_prnt_tm, InspRpt_Prnt01_DtlR.$err_flg};
			copyByPegNo(up0(), destCols, prnt.down0(), srcCols);
		}
	}
	/**
	 * Prnt02オペレーション.<p>
	 *
	 * 検査成績書を発行する。<br>
	 */
	public class Prnt02 extends MSBFL_InspInstLstReg_MC_A.Prnt02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			// 検査成績書発行
			callInspRptServicePrnt02();

			// 処理結果状況区分設定
			setRtnStsTyp();

			// 下り電文設定
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Prnt02_RsltR.$peg_no, up0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 処理結果状況区分を設定する。
		 */
		protected void setRtnStsTyp() {
			for (Prnt02_RsltR r : up0()) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * 検査成績書を発行する。
		 */
		protected void callInspRptServicePrnt02() {
			MSBFL_InspRptService.InspRpt_Prnt02 prnt = MSBFL_InspRptService.crtInspRpt_Prnt02();

			addAll(prnt.up0(), up0(), createMap_InspRpt_Prnt02_DtlR_Prnt02_RsltR());

			prnt.exec();

			String[] destCols = new String[] {Prnt02_RsltR.$insp_rslt_prnt_flg, Prnt02_RsltR.$insp_rslt_prnt_tm, Prnt02_RsltR.$err_flg};
			String[] srcCols = new String[] {InspRpt_Prnt02_DtlR.$insp_rslt_prnt_flg, InspRpt_Prnt02_DtlR.$insp_rslt_prnt_tm, InspRpt_Prnt02_DtlR.$err_flg};
			copyByPegNo(up0(), destCols, prnt.down0(), srcCols);
		}
	}

	/**
	 * ログインユーザの承認役割権限チェックを行う。
	 * 
	 * @param roleCd 役割ＣＤ
	 * @return 
	 */
	protected boolean isAprvUsrR(String roleCd) {
		String loginUsrId = mcframe.serverCore.sys.MCSys.user.ID();
		
		MAVM_APRV_USR_R t = MAVM_APRV_USR_R.create("T");
		int cnt = execDbCount("MSBFL0030_MAVM_APRV_USR_S01", t, t.aprv_role_cd.eq(bind("1"))
				.and(t.usr_cd.eq(bind("2")))
				.and(t.st_dt.lte(bind("3")))
				.and( t.end_dt.isNull()
						.or(t.end_dt.gte(bind("3")))), roleCd, loginUsrId, getToday());

		return cnt > 0;
	}

	// Mapping
	protected Map_InspInst_Ins01_RsltR_Chk01_RsltR<InspInst_Ins01_RsltR,Chk01_RsltR> createMap_InspInst_Ins01_RsltR_Chk01_RsltR() {
		return new Map_InspInst_Ins01_RsltR_Chk01_RsltR<InspInst_Ins01_RsltR, Chk01_RsltR>();
	}

	public class Map_InspInst_Ins01_RsltR_Chk01_RsltR<D extends InspInst_Ins01_RsltR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspInst_Ins01_RsltR.$peg_no, Chk01_RsltR.$peg_no);
			addColumnPathMap(InspInst_Ins01_RsltR.$insp_schd_no, Chk01_RsltR.$insp_schd_no);
			addColumnPathMap(InspInst_Ins01_RsltR.$insp_mtd_typ, Chk01_RsltR.$insp_mtd_typ);
			addColumnPathMap(InspInst_Ins01_RsltR.$st_tm, Chk01_RsltR.$st_tm);
			addColumnPathMap(InspInst_Ins01_RsltR.$end_tm, Chk01_RsltR.$end_tm);
			addColumnPathMap(InspInst_Ins01_RsltR.$inst_dt, Chk01_RsltR.$inst_dt);
			addColumnPathMap(InspInst_Ins01_RsltR.$inst_dpt_cd, Chk01_RsltR.$inst_dpt_cd);
			addColumnPathMap(InspInst_Ins01_RsltR.$inst_usr_cd, Chk01_RsltR.$inst_usr_cd);
			addColumnPathMap(InspInst_Ins01_RsltR.$insp_ptn_cd, Chk01_RsltR.$insp_ptn_cd);
			addColumnPathMap(InspInst_Ins01_RsltR.$insp_std_no, Chk01_RsltR.$insp_std_no);
			addColumnPathMap(InspInst_Ins01_RsltR.$plnt_aprv_flg, Chk01_RsltR.$plnt_aprv_flg);
			addColumnPathMap(InspInst_Ins01_RsltR.$lims_flg, Chk01_RsltR.$lims_flg);
			addColumnPathMap(InspInst_Ins01_RsltR.$intr_rmrks, Chk01_RsltR.$intr_rmrks);
			addColumnPathMap(InspInst_Ins01_RsltR.$sub_char1, Chk01_RsltR.$sub_char1);
			addColumnPathMap(InspInst_Ins01_RsltR.$sub_char2, Chk01_RsltR.$sub_char2);
			addColumnPathMap(InspInst_Ins01_RsltR.$sub_char3, Chk01_RsltR.$sub_char3);
		}
	}

	protected Map_InspInst_Upd02_RsltR_Chk02_RsltR<InspInst_Upd02_RsltR,Chk02_RsltR> createMap_InspInst_Upd02_RsltR_Chk02_RsltR() {
		return new Map_InspInst_Upd02_RsltR_Chk02_RsltR<InspInst_Upd02_RsltR, Chk02_RsltR>();
	}

	public class Map_InspInst_Upd02_RsltR_Chk02_RsltR<D extends InspInst_Upd02_RsltR, S extends Chk02_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspInst_Upd02_RsltR.$peg_no, Chk02_RsltR.$peg_no);
			addColumnPathMap(InspInst_Upd02_RsltR.$insp_no, Chk02_RsltR.$insp_no);
			addColumnPathMap(InspInst_Upd02_RsltR.$aprv_dt, Chk02_RsltR.$aprv_dt);
			addColumnPathMap(InspInst_Upd02_RsltR.$aprv_tm, Chk02_RsltR.$aprv_tm);
			addColumnPathMap(InspInst_Upd02_RsltR.$aprv_usr_cd, Chk02_RsltR.$aprv_usr_cd);
			addColumnPathMap(InspInst_Upd02_RsltR.$aprv_dpt_cd, Chk02_RsltR.$aprv_dpt_cd);
			addColumnPathMap(InspInst_Upd02_RsltR.$aprv_rsn, Chk02_RsltR.$aprv_rsn);
			addColumnPathMap(InspInst_Upd02_RsltR.$lims_flg, Chk02_RsltR.$lims_flg);
			addColumnPathMap(InspInst_Upd02_RsltR.$insp_aprv_sts_typ, Chk02_RsltR.$insp_aprv_sts_typ);

		}
	}

	protected Map_InspRpt_Prnt01_DtlR_Prnt01_RsltR<InspRpt_Prnt01_DtlR,Prnt01_RsltR> createMap_InspRpt_Prnt01_DtlR_Prnt01_RsltR() {
		return new Map_InspRpt_Prnt01_DtlR_Prnt01_RsltR<InspRpt_Prnt01_DtlR, Prnt01_RsltR>();
	}

	public class Map_InspRpt_Prnt01_DtlR_Prnt01_RsltR<D extends InspRpt_Prnt01_DtlR, S extends Prnt01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspRpt_Prnt01_DtlR.$peg_no, Prnt01_RsltR.$peg_no);
			addColumnPathMap(InspRpt_Prnt01_DtlR.$insp_no, Prnt01_RsltR.$insp_no);
		}
	}

	protected Map_InspRpt_Prnt02_DtlR_Prnt02_RsltR<InspRpt_Prnt02_DtlR,Prnt02_RsltR> createMap_InspRpt_Prnt02_DtlR_Prnt02_RsltR() {
		return new Map_InspRpt_Prnt02_DtlR_Prnt02_RsltR<InspRpt_Prnt02_DtlR, Prnt02_RsltR>();
	}

	public class Map_InspRpt_Prnt02_DtlR_Prnt02_RsltR<D extends InspRpt_Prnt02_DtlR, S extends Prnt02_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InspRpt_Prnt02_DtlR.$peg_no, Prnt02_RsltR.$peg_no);
			addColumnPathMap(InspRpt_Prnt02_DtlR.$insp_no, Prnt02_RsltR.$insp_no);
		}
	}

	//FMCB CUSTOM END
}