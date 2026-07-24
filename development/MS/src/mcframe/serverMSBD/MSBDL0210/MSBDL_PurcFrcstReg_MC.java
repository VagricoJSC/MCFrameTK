package mcframe.serverMSBD.MSBDL0210;

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
import mcframe.serverMSBD.MSBDL0210.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.*;
import static mcframe.serverMSBD.MSBDL0210.Query.*;
import mcframe.serverMSBD.MSBDL5280.*;
import mcframe.commonCore.param.MCParam;
import java.util.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PurcFrcstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PurcFrcstReg_MC extends MSBDL_PurcFrcstReg_MC_A{
	//FMCB CUSTOM START

	// 操作種別「帳票発行」
	protected static final String PRNT = "3";
	// 操作種別「参照する」
	protected static final String REF = "4";
	
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 購買内示のヘッダ情報を検索する。<br>
	 */
	public class Srch01 extends MSBDL_PurcFrcstReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			if (chkParam()) {
				editUp();
				srchHdr();
			}
		}
		/**
		 * 上り電文チェック
		 */
		protected boolean chkParam() {
			return true;
		}
		/**
		 * 前処理
		 */
		protected void editUp() {
			// 帳票発行種別の場合に新規未発行の取消データを除外する（帳票を発行できないため）
			if (isSame(up0().screen_ope(), PRNT)) {
				up0().addStringColumn("print_flg", "1");
			}
			
			// 確定・未確定
			if (!(up0().fix_t_flg() && up0().fix_f_flg())) {
				if (up0().fix_t_flg()) {
					up0().addStringColumn("fix_flg_str", "1");
				}
				if (up0().fix_f_flg()) {
					up0().addStringColumn("fix_flg_str", "0");
				}
			}
			// 発行・未発行
			if (!(up0().rpt_t_flg() && up0().rpt_f_flg())) {
				if (up0().rpt_t_flg()) {
					up0().addStringColumn("rpt_flg_str", "1");
				}
				if (up0().rpt_f_flg()) {
					up0().addStringColumn("rpt_flg_str", "0");
				}
			}
			// 有効・未無効
			if (!(up0().del_t_flg() && up0().del_f_flg())) {
				if (up0().del_t_flg()) {
					up0().addStringColumn("del_flg_str", "1");
				}
				if (up0().del_f_flg()) {
					up0().addStringColumn("del_flg_str", "0");
				}
			}
			// 下請け対象・下請け対象外
			if (!(up0().subcon_t_flg() && up0().subcon_f_flg())) {
				if (up0().subcon_t_flg()) {
					up0().addStringColumn("subcon_flg_str", "1");
				}
				if (up0().subcon_f_flg()) {
					up0().addStringColumn("subcon_flg_str", "0");
				}
			}
			// 引取責任対象・引取責任対象外
			if (!(up0().purc_commit_t_flg() && up0().purc_commit_f_flg())) {
				if (up0().purc_commit_t_flg()) {
					up0().addStringColumn("purc_commit_flg_str", "1");
				}
				if (up0().purc_commit_f_flg()) {
					up0().addStringColumn("purc_commit_flg_str", "0");
				}
			}
			// 最新内示日
			if (up0().latest_flg()) {
				up0().addStringColumn("latest_flg_str", "1");
			}
		}

		/**
		 * ヘッダ検索
		 */
		protected void srchHdr() {
			MCQueryPlan sql = MSBDL0210_MST_PURC_FRCST_H_S01();
			searchForDL(sql, up0(), down0());
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 購買内示の明細情報を検索する。<br>
	 */
	public class Srch02 extends MSBDL_PurcFrcstReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			if (chkParam()) {
				editUp();
				srchDtl();
			}
		}
		/**
		 * 上り電文チェック
		 */
		protected boolean chkParam() {
			return true;
		}
		/**
		 * 前処理
		 */
		protected void editUp() {
			// 確定・未確定
			if (!(up0().fix_t_flg() && up0().fix_f_flg())) {
				if (up0().fix_t_flg()) {
					up0().addStringColumn("fix_flg_str", "1");
				}
				if (up0().fix_f_flg()) {
					up0().addStringColumn("fix_flg_str", "0");
				}
			}
			// 発行・未発行
			if (!(up0().rpt_t_flg() && up0().rpt_f_flg())) {
				if (up0().rpt_t_flg()) {
					up0().addStringColumn("rpt_flg_str", "1");
				}
				if (up0().rpt_f_flg()) {
					up0().addStringColumn("rpt_flg_str", "0");
				}
			}
			// 有効・未無効
			if (!(up0().del_t_flg() && up0().del_f_flg())) {
				if (up0().del_t_flg()) {
					up0().addStringColumn("del_flg_str", "1");
				}
				if (up0().del_f_flg()) {
					up0().addStringColumn("del_flg_str", "0");
				}
			}
			// 下請け対象・下請け対象外
			if (!(up0().subcon_t_flg() && up0().subcon_f_flg())) {
				if (up0().subcon_t_flg()) {
					up0().addStringColumn("subcon_flg_str", "1");
				}
				if (up0().subcon_f_flg()) {
					up0().addStringColumn("subcon_flg_str", "0");
				}
			}
			// 引取責任対象・引取責任対象外
			if (!(up0().purc_commit_t_flg() && up0().purc_commit_f_flg())) {
				if (up0().purc_commit_t_flg()) {
					up0().addStringColumn("purc_commit_flg_str", "1");
				}
				if (up0().purc_commit_f_flg()) {
					up0().addStringColumn("purc_commit_flg_str", "0");
				}
			}
			// 最新内示日
			if (up0().latest_flg()) {
				up0().addStringColumn("latest_flg_str", "1");
			}
		}

		/**
		 * 明細検索
		 */
		protected void srchDtl() {
			MCQueryPlan sql = MSBDL0210_MST_PURC_FRCST_H_S02();
			searchForDL(sql, up0(), down0(), getSrchGrp());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			srchPreDtl(down0());
			editDown();
		}

		
		protected String[] getSrchGrp() {
			return new String[] { Srch02_DtlR.$pf_dt, Srch02_DtlR.$sppl_cd, Srch02_DtlR.$wg_cd, Srch02_DtlR.$itm_cd, Srch02_DtlR.$itm_sub1,
					Srch02_DtlR.$itm_sub2, Srch02_DtlR.$itm_sub3 };
		}

		/**
		 * 前回内示日明細検索
		 */
		protected void srchPreDtl(MCList<Srch02_DtlR> dtlL) {
			MCList<MST_PURC_FRCST_FIX_R> wkL = MCList.create(MST_PURC_FRCST_FIX_R.class);
			for (Srch02_DtlR r : dtlL.groupBy(Srch02_DtlR.$pre_purc_frcst_fix_no)) {
				if (!isNull(r.pre_purc_frcst_fix_no())) {
					MST_PURC_FRCST_FIX_R wkR = MST_PURC_FRCST_FIX_R.create();
					wkR.purc_frcst_fix_no(r.pre_purc_frcst_fix_no());
					wkL.add(wkR);
				}
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_PURC_FRCST_FIX_R.create("T"));
			dbWkDelete("MSBDL0210_MSW_PURC_FRCST_FIX_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBDL0210_MSW_PURC_FRCST_FIX_I01", wkL, wkL_bldr.getBaseDbc());

			MCList<Srch02_DtlR> preDtl = MCList.create(Srch02_DtlR.class);
			executeQuery(preDtl, MSBDL0210_MST_PURC_FRCST_H_S03());
			String[] joinkey = new String[] {Srch02_DtlR.$pre_pf_dt,
					Srch02_DtlR.$sppl_cd,
					Srch02_DtlR.$wg_cd,
					Srch02_DtlR.$itm_cd,
					Srch02_DtlR.$itm_sub1,
					Srch02_DtlR.$itm_sub2,
					Srch02_DtlR.$itm_sub3,
					Srch02_DtlR.$pf_period_typ,
					Srch02_DtlR.$pf_period_st_dt};
			MCJoinKey<MCList<Srch02_DtlR>> jk = dtlL.join(joinkey, preDtl, joinkey);
			join(dtlL, jk, createMap_Srch02_DtlR_Srch02_DtlR());
		}

		/**
		 * 下り電文編集
		 */
		protected void editDown() {
			MCList<Srch02_DtlR> dtlL = down0();
			MCList<Srch02_DtlR> fixL = editFix(dtlL);

			fixL.setString(Srch02_DtlR.$purc_frcst_d_no, null);
			fixL.setString(Srch02_DtlR.$pf_period_typ, null);
			fixL.setDate(Srch02_DtlR.$pf_period_st_dt, null);
			fixL.setDate(Srch02_DtlR.$pf_period_end_dt, null);
			fixL.setBoolean(Srch02_DtlR.$fix_period_flg, false);
			fixL.setString(Srch02_DtlR.$trd_unit_cd, null);
			fixL.setString(Srch02_DtlR.$trd_unit_nm, null);
			fixL.setNumber(Srch02_DtlR.$trd_unit_schd_qty, null);
			fixL.setNumber(Srch02_DtlR.$trd_unit_pf_qty, null);
			fixL.setNumber(Srch02_DtlR.$trd_unit_prms_qty, null);
			fixL.setString(Srch02_DtlR.$base_unit_cd, null);
			fixL.setString(Srch02_DtlR.$base_unit_nm, null);
			fixL.setNumber(Srch02_DtlR.$base_unit_schd_qty, null);
			fixL.setNumber(Srch02_DtlR.$base_unit_pf_qty, null);
			fixL.setNumber(Srch02_DtlR.$base_unit_prms_qty, null);
			fixL.setBoolean(Srch02_DtlR.$pre_fix_period_flg, false);
			fixL.setNumber(Srch02_DtlR.$pre_trd_unit_pf_qty, null);
			fixL.setNumber(Srch02_DtlR.$pre_base_unit_pf_qty, null);
			fixL.setString(Srch02_DtlR.$pre_trd_unit_cd, null);
			fixL.setString(Srch02_DtlR.$pre_trd_unit_nm, null);

			dtlL.setBoolean(Srch02_DtlR.$fix_flg, false);
			dtlL.setString(Srch02_DtlR.$dtl_rpt_rmrks, null);
			dtlL.setString(Srch02_DtlR.$dtl_intr_rmrks, null);
			dtlL.setString(Srch02_DtlR.$dtl_sub_char1, null);
			dtlL.setString(Srch02_DtlR.$dtl_sub_char2, null);
			dtlL.setString(Srch02_DtlR.$dtl_sub_char3, null);
			setFixPeriodFlg(dtlL);

			down0().addAll(fixL);
			MCSortPolicy sp = new MCSortPolicy();
			sp.add(SortType.ASC, Srch02_DtlR.$pf_dt);
			sp.add(SortType.ASC, Srch02_DtlR.$sppl_cd);
			sp.add(SortType.ASC, Srch02_DtlR.$wg_cd);
			sp.add(SortType.ASC, Srch02_DtlR.$itm_cd);
			sp.add(SortType.ASC, Srch02_DtlR.$itm_sub1);
			sp.add(SortType.ASC, Srch02_DtlR.$itm_sub2);
			sp.add(SortType.ASC, Srch02_DtlR.$itm_sub3);
			sp.add(SortType.ASC, Srch02_DtlR.$purc_frcst_fix_no);
			sp.add(SortType.ASC_NULL_AHEAD, Srch02_DtlR.$pf_period_typ);
			sp.add(SortType.ASC, Srch02_DtlR.$pf_period_st_dt);
			down0().sort(sp);
		}

		/**
		 * 確定行編集
		 */
		protected MCList<Srch02_DtlR> editFix(MCList<Srch02_DtlR> dtlL) {
			MCList<Srch02_DtlR> fixL = MCList.create(Srch02_DtlR.class);
			for (MCList<Srch02_DtlR> subL: dtlL.groupList(Srch02_DtlR.$purc_frcst_no, Srch02_DtlR.$purc_frcst_fix_no)) {
				fixL.add(subL.get(0).clone());
			}
			return fixL;
		}

		/**
		 * 確定期間設定
		 */
		protected void setFixPeriodFlg (MCList<Srch02_DtlR> dtlL) {
			if (isSame(up0().screen_ope(), REF)) {
				return;
			}
			MCIndexKey key = dtlL.createIndex(Srch02_DtlR.$purc_frcst_fix_no);
			for (Srch02_DtlR fixR :dtlL.groupBy(Srch02_DtlR.$purc_frcst_fix_no)) {
				MCList<Srch02_DtlR> subL = dtlL.subList(key, fixR.purc_frcst_fix_no());
				subL.sort(Srch02_DtlR.$purc_frcst_d_no);
				String pfPeriodTyp = subL.get(0).pf_period_typ();
				// 未発行有効以外はトランの値を採用するのでスキップ
				if (subL.get(0).del_flg() || subL.get(0).pf_rpt_flg()) {
					continue;
				}
				int fixPeriodNum = subL.get(0).fix_period_num().intValue();
				if (fixPeriodNum > subL.size()) {
					fixPeriodNum = subL.size();
				}
				subL.setBoolean(Srch02_DtlR.$fix_period_flg, false);
				for (int i = 0; i < fixPeriodNum; i ++) {
					if (isSame(pfPeriodTyp, subL.get(i).pf_period_typ())) {
						subL.get(i).fix_period_flg(true);
					}
				}
			}
		}

		protected Map_Srch02_DtlR_Srch02_DtlR<Srch02_DtlR,Srch02_DtlR> createMap_Srch02_DtlR_Srch02_DtlR() {
			return new Map_Srch02_DtlR_Srch02_DtlR<Srch02_DtlR, Srch02_DtlR>();
		}
		public class Map_Srch02_DtlR_Srch02_DtlR<D extends Srch02_DtlR, S extends Srch02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch02_DtlR.$pre_trd_unit_cd, Srch02_DtlR.$pre_trd_unit_cd);
				addColumnPathMap(Srch02_DtlR.$pre_trd_unit_nm, Srch02_DtlR.$pre_trd_unit_nm);
				addColumnPathMap(Srch02_DtlR.$pre_trd_unit_dec_place, Srch02_DtlR.$pre_trd_unit_dec_place);
				addColumnPathMap(Srch02_DtlR.$pre_fix_period_flg, Srch02_DtlR.$pre_fix_period_flg);
				addColumnPathMap(Srch02_DtlR.$pre_trd_unit_pf_qty, Srch02_DtlR.$pre_trd_unit_pf_qty);
				addColumnPathMap(Srch02_DtlR.$pre_base_unit_pf_qty, Srch02_DtlR.$pre_base_unit_pf_qty);
			}
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * ヘッダ更新前チェック<br>
	 */
	public class Chk01 extends MSBDL_PurcFrcstReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			setGrpErrFlg();
			setErrToRtnStsTyp();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(checkWgDAC());
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			if (!hasErrFlgOn(up0())) {
				lockPf();
				callSvcChk01();
			}
			return msgL;
		}

		/**
		 * DACチェック
		 */
		protected MCMessageList checkWgDAC() {
			MCMessageList msgL = new MCMessageList();
			for (Chk01_RsltR chkR: up0()) {
				msgL.addAll(checkWritableWgCdDac(chkR, Chk01_RsltR.$wg_cd));
			}
			return msgL;
		}

		/**
		 * 購買内示ロック
		 */
		protected void lockPf() {
			MCList<MST_PURC_FRCST_LOCK_R> lockL = MCList.create(MST_PURC_FRCST_LOCK_R.class);
			addAll(lockL, up0(), createMap_MST_PURC_FRCST_LOCK_R_Chk01_RsltR());
			lock(lockL);
		}

		/**
		 * 更新前チェック実施
		 */
		protected void callSvcChk01() {
			MSBDL_PurcFrcstService.PurcFrcst_Chk01 svc = MSBDL_PurcFrcstService.crtPurcFrcst_Chk01();
			addAll(svc.up0(), up0(), createMap_PurcFrcst_Chk01_HdrR_Chk01_RsltR());
			svc.exec();
			copyByPegNo (up0(),  new String[] {Chk01_RsltR.$err_flg},
					svc.down0(),  new String[] {PurcFrcst_Chk01_HdrR.$err_flg});
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 処理単位内に1つでもerr_flgがオンの行があれば、その処理単位全体のerr_flgをオンにする
		 */
		protected void setGrpErrFlg() {
			String[] grpKeys = {Chk01_RsltR.$sppl_cd , Chk01_RsltR.$wg_cd};
			setGrpErrFlgByKey(up0(), grpKeys, Chk01_RsltR.$err_flg);
		}

		protected Map_PurcFrcst_Chk01_HdrR_Chk01_RsltR<PurcFrcst_Chk01_HdrR,Chk01_RsltR> createMap_PurcFrcst_Chk01_HdrR_Chk01_RsltR() {
			return new Map_PurcFrcst_Chk01_HdrR_Chk01_RsltR<PurcFrcst_Chk01_HdrR, Chk01_RsltR>();
		}
		public class Map_PurcFrcst_Chk01_HdrR_Chk01_RsltR<D extends PurcFrcst_Chk01_HdrR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcFrcst_Chk01_HdrR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(PurcFrcst_Chk01_HdrR.$purc_frcst_no, Chk01_RsltR.$purc_frcst_no);
				addColumnPathMap(PurcFrcst_Chk01_HdrR.$pf_dt, Chk01_RsltR.$pf_dt);
				addColumnPathMap(PurcFrcst_Chk01_HdrR.$sppl_cd, Chk01_RsltR.$sppl_cd);
				addColumnPathMap(PurcFrcst_Chk01_HdrR.$wg_cd, Chk01_RsltR.$wg_cd);
				addColumnPathMap(PurcFrcst_Chk01_HdrR.$pf_usr_cd, Chk01_RsltR.$pf_usr_cd);
				addColumnPathMap(PurcFrcst_Chk01_HdrR.$pf_dpt_cd, Chk01_RsltR.$pf_dpt_cd);
				addColumnPathMap(PurcFrcst_Chk01_HdrR.$rpt_rmrks, Chk01_RsltR.$hdr_rpt_rmrks);
				addColumnPathMap(PurcFrcst_Chk01_HdrR.$intr_rmrks, Chk01_RsltR.$hdr_intr_rmrks);
				addColumnPathMap(PurcFrcst_Chk01_HdrR.$sub_char1, Chk01_RsltR.$hdr_sub_char1);
				addColumnPathMap(PurcFrcst_Chk01_HdrR.$sub_char2, Chk01_RsltR.$hdr_sub_char2);
				addColumnPathMap(PurcFrcst_Chk01_HdrR.$sub_char3, Chk01_RsltR.$hdr_sub_char3);
				addColumnPathMap(PurcFrcst_Chk01_HdrR.$upd_cntr, Chk01_RsltR.$upd_cntr);
			}
			@Override
			protected void valueCopy (D dest, S src) {
				dest.setAttributes(src);
			}
		}

		protected Map_MST_PURC_FRCST_LOCK_R_Chk01_RsltR<MST_PURC_FRCST_LOCK_R,Chk01_RsltR> createMap_MST_PURC_FRCST_LOCK_R_Chk01_RsltR() {
			return new Map_MST_PURC_FRCST_LOCK_R_Chk01_RsltR<MST_PURC_FRCST_LOCK_R, Chk01_RsltR>();
		}
		public class Map_MST_PURC_FRCST_LOCK_R_Chk01_RsltR<D extends MST_PURC_FRCST_LOCK_R, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_PURC_FRCST_LOCK_R.$sppl_cd, Chk01_RsltR.$sppl_cd);
				addColumnPathMap(MST_PURC_FRCST_LOCK_R.$wg_cd, Chk01_RsltR.$wg_cd);
			}
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 明細更新前チェック<br>
	 */
	public class Chk02 extends MSBDL_PurcFrcstReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			if (up1().file_imp_flg()) {
				// ファイル取込の場合にチェックよりも前に補完を行う
				cmplPfKey();
			}
			super.doIt();
			setGrpErrFlg();
			setErrToRtnStsTyp();
			setDown();
		}

	
		/**
		 * キー項目補完
		 */
		protected void cmplPfKey() {
			complItmSub();
			srchPfHdr();
			srchPfFix();
			srchPfDtl();
			chkUp();
		}
		
		protected void chkUp() {
			MCIndexKey upIdx = up0().createIndex(Chk02_DtlR.$purc_frcst_fix_no);

			for (Chk02_DtlR upR : up0().groupBy(Chk02_DtlR.$purc_frcst_fix_no)) {
				MCList<Chk02_DtlR> upL = up0().subList(upIdx, upR.purc_frcst_fix_no());
				// 内示確定の単位のデータがそろっているかを確認
				// 画面上のヘッダ行は内示期間区分が空白で、明細行には内示期間区分が必須で設定されていることを利用して
				// ヘッダ行と明細行の両方が存在していることをチェックする
				boolean existsHdr = false;
				boolean existsDtl = false;
				for (Chk02_DtlR subR : upL) {
					if (isNull(subR.pf_period_typ())) {
						existsHdr = true;
					}
					else {
						existsDtl = true;
					}
				}
				if (!existsHdr || !existsDtl) {
					for (Chk02_DtlR errR : upL) {
						errR.err_flg(true);
						MCMessagePool.add(new MCMessage(errR, null, MSBDL0103, toYMDString(errR.pf_dt()), errR.sppl_cd(), errR.wg_cd(),
								toDispItm(errR.itm_cd(), errR.itm_sub1(), errR.itm_sub2(), errR.itm_sub3())));
					}
				}

			}
		}
		
		protected void complItmSub() {
			// 枝番１～３補完
			for (Chk02_DtlR r : up0()) {
				if (isNull(r.itm_sub1())) {
					r.itm_sub1(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.itm_sub2())) {
					r.itm_sub2(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.itm_sub3())) {
					r.itm_sub3(MAC_STR.NULL_VAL.value());
				}
			}
		}

		protected void srchPfHdr() {
			// 購買内示ヘッダ検索
			String[] hdrKey = new String[] {
					Chk02_DtlR.$pf_dt, Chk02_DtlR.$sppl_cd, Chk02_DtlR.$wg_cd
			};
			MCList<MST_PURC_FRCST_H_R> hdrL = MCList.create(MST_PURC_FRCST_H_R.class);
			MST_PURC_FRCST_H_R t = MST_PURC_FRCST_H_R.create("T");
			MCQueryApiBuilder hdrL_bldr = MCQueryApiBuilder.create(t);
			hdrL_bldr.setSelect(t.purc_frcst_no);
			hdrL_bldr.addSelect(t.pf_dt);
			hdrL_bldr.addSelect(t.sppl_cd);
			hdrL_bldr.addSelect(t.wg_cd);
			hdrL_bldr.setWhere(t.pf_dt.eq(bind("pf_dt")));
			hdrL_bldr.addWhereWithAnd(t.sppl_cd.eq(bind("sppl_cd")));
			hdrL_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
			dbSelect("MSBDL0210_MST_PURC_FRCST_H_S01", hdrL, hdrL_bldr, up0().groupBy(hdrKey));
			MCJoinKey<MCList<MST_PURC_FRCST_H_R>> hdrJk = up0().join(hdrKey, hdrL,
					hdrKey);
			join(up0(), hdrJk, createMap_Chk02_DtlR_MST_PURC_FRCST_H_R());

		}

		protected void srchPfFix() {
			// 購買内示確定検索
			String[] fixKey = new String[] {
					Chk02_DtlR.$purc_frcst_no, Chk02_DtlR.$itm_cd, Chk02_DtlR.$itm_sub1,
					Chk02_DtlR.$itm_sub2, Chk02_DtlR.$itm_sub3
			};
			MCList<MST_PURC_FRCST_FIX_R> fixL = MCList.create(MST_PURC_FRCST_FIX_R.class);
			MST_PURC_FRCST_FIX_R t = MST_PURC_FRCST_FIX_R.create("T");
			MCQueryApiBuilder fixL_bldr = MCQueryApiBuilder.create(t);
			fixL_bldr.setSelect(t.purc_frcst_fix_no);
			fixL_bldr.addSelect(t.purc_frcst_no);
			fixL_bldr.addSelect(t.itm_cd);
			fixL_bldr.addSelect(t.itm_sub1);
			fixL_bldr.addSelect(t.itm_sub2);
			fixL_bldr.addSelect(t.itm_sub3);
			fixL_bldr.addSelect(t.trd_unit_cd);
			fixL_bldr.addSelect(t.upd_cntr);
			fixL_bldr.setWhere(t.purc_frcst_no.eq(bind("purc_frcst_no")));
			fixL_bldr.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
			fixL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			fixL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			fixL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			dbSelect("MSBDL0210_MST_PURC_FRCST_FIX_S01", fixL, fixL_bldr, up0().groupBy(fixKey));
			MCJoinKey<MCList<MST_PURC_FRCST_FIX_R>> fixJk = up0().join(fixKey, fixL,
					fixKey);
			join(up0(), fixJk, createMap_Chk02_DtlR_MST_PURC_FRCST_FIX_R());
		}

		protected void srchPfDtl() {
			// 購買内示明細検索
			String[] dtlKey = new String[] {
					Chk02_DtlR.$purc_frcst_no, Chk02_DtlR.$purc_frcst_fix_no,
					Chk02_DtlR.$pf_period_typ, Chk02_DtlR.$pf_period_st_dt
			};
			MCList<MST_PURC_FRCST_D_R> dtlL = MCList.create(MST_PURC_FRCST_D_R.class);
			MST_PURC_FRCST_D_R t = MST_PURC_FRCST_D_R.create("T");
			MCQueryApiBuilder dtlL_bldr = MCQueryApiBuilder.create(t);
			dtlL_bldr.setSelect(t.purc_frcst_d_no);
			dtlL_bldr.addSelect(t.purc_frcst_fix_no);
			dtlL_bldr.addSelect(t.purc_frcst_no);
			dtlL_bldr.addSelect(t.pf_period_typ);
			dtlL_bldr.addSelect(t.pf_period_st_dt);
			dtlL_bldr.setWhere(t.purc_frcst_no.eq(bind("purc_frcst_no")));
			dtlL_bldr.addWhereWithAnd(t.purc_frcst_fix_no.eq(bind("purc_frcst_fix_no")));
			dtlL_bldr.addWhereWithAnd(t.pf_period_typ.eq(bind("pf_period_typ")));
			dtlL_bldr.addWhereWithAnd(t.pf_period_st_dt.eq(bind("pf_period_st_dt")));
			dbSelect("MSBDL0210_MST_PURC_FRCST_D_S01", dtlL, dtlL_bldr, up0().groupBy(dtlKey));
			MCJoinKey<MCList<MST_PURC_FRCST_D_R>> dtlJk = up0().join(dtlKey, dtlL,
					dtlKey);
			join(up0(), dtlJk, createMap_Chk02_DtlR_MST_PURC_FRCST_D_R());
		}

		protected Map_Chk02_DtlR_MST_PURC_FRCST_H_R<Chk02_DtlR,MST_PURC_FRCST_H_R> createMap_Chk02_DtlR_MST_PURC_FRCST_H_R() {
			return new Map_Chk02_DtlR_MST_PURC_FRCST_H_R<Chk02_DtlR, MST_PURC_FRCST_H_R>();
		}
		public class Map_Chk02_DtlR_MST_PURC_FRCST_H_R<D extends Chk02_DtlR, S extends MST_PURC_FRCST_H_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_DtlR.$purc_frcst_no, MST_PURC_FRCST_H_R.$purc_frcst_no);
			}
		}
		protected Map_Chk02_DtlR_MST_PURC_FRCST_FIX_R<Chk02_DtlR,MST_PURC_FRCST_FIX_R> createMap_Chk02_DtlR_MST_PURC_FRCST_FIX_R() {
			return new Map_Chk02_DtlR_MST_PURC_FRCST_FIX_R<Chk02_DtlR, MST_PURC_FRCST_FIX_R>();
		}
		public class Map_Chk02_DtlR_MST_PURC_FRCST_FIX_R<D extends Chk02_DtlR, S extends MST_PURC_FRCST_FIX_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_DtlR.$purc_frcst_fix_no, MST_PURC_FRCST_FIX_R.$purc_frcst_fix_no);
				addColumnPathMap(Chk02_DtlR.$trd_unit_cd, MST_PURC_FRCST_FIX_R.$trd_unit_cd);
				addColumnPathMap(Chk02_DtlR.$upd_cntr, MST_PURC_FRCST_FIX_R.$upd_cntr);
			}
		}
		protected Map_Chk02_DtlR_MST_PURC_FRCST_D_R<Chk02_DtlR,MST_PURC_FRCST_D_R> createMap_Chk02_DtlR_MST_PURC_FRCST_D_R() {
			return new Map_Chk02_DtlR_MST_PURC_FRCST_D_R<Chk02_DtlR, MST_PURC_FRCST_D_R>();
		}
		public class Map_Chk02_DtlR_MST_PURC_FRCST_D_R<D extends Chk02_DtlR, S extends MST_PURC_FRCST_D_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_DtlR.$purc_frcst_d_no, MST_PURC_FRCST_D_R.$purc_frcst_d_no);
			}
		}

		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			if (!hasErrFlgOn(up0())) {
				msgL.addAll(checkWgDAC());
			}
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			if (!hasErrFlgOn(up0())) {
				if (!up1().file_imp_flg()) {
					lockPf();
				}
				else {
					checkRequired();
					cmplPfData();
				}
				callSvcChk01();
				if (up1().file_imp_flg()) {
					editRslt();
				}
			}
			return msgL;
		}

		/**
		 * DACチェック
		 */
		protected MCMessageList checkWgDAC() {
			MCMessageList msgL = new MCMessageList();
			for (MCList<Chk02_DtlR> chkL: up0().groupList(Chk02_DtlR.$purc_frcst_fix_no)) {
				Chk02_DtlR chkR = chkL.get(0);
				if (!isNull(chkR.wg_cd())) {
					msgL.addAll(checkWritableWgCdDac(chkR, Chk02_DtlR.$wg_cd));
				}
			}
			return msgL;
		}

		/**
		 * 購買内示ロック
		 */
		protected void lockPf() {
			MCList<MST_PURC_FRCST_LOCK_R> lockL = MCList.create(MST_PURC_FRCST_LOCK_R.class);
			addAll(lockL,
					up0().groupBy(Chk02_DtlR.$wg_cd, Chk02_DtlR.$sppl_cd),
					createMap_MST_PURC_FRCST_LOCK_R_Chk02_DtlR());
			lock(lockL);
		}

		/**
		 * 必須チェック
		 */
		protected MCMessageList checkRequired() {
			MCMessageList msgL = new MCMessageList();
			for (Chk02_DtlR r: up0()) {
				msgL.addAll(check(r, new String[] {Chk02_DtlR.$sppl_cd}, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, new String[] {Chk02_DtlR.$wg_cd}, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, new String[] {Chk02_DtlR.$pf_dt}, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, new String[] {Chk02_DtlR.$itm_cd}, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, new String[] {Chk02_DtlR.$itm_sub1}, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, new String[] {Chk02_DtlR.$itm_sub2}, new FXUCL_RequiredValidater()));
				msgL.addAll(check(r, new String[] {Chk02_DtlR.$itm_sub3}, new FXUCL_RequiredValidater()));
			}
			return msgL;
		}

		/**
		 * データ項目補完（ファイル入力）
		 */
		protected void cmplPfData() {
			insWk();
			MCList<Chk02_DtlR> rsltL = MCList.create(Chk02_DtlR.class);
			executeQuery(rsltL, MSBDL0210_MST_PURC_FRCST_H_S04());
			srchPreDtl(rsltL);
			MCJoinKey<MCList<Chk02_DtlR>> fixJk = up0().join(Chk02_DtlR.$purc_frcst_fix_no, rsltL, Chk02_DtlR.$purc_frcst_fix_no);
			join(up0(), fixJk, createMap_Chk02_DtlR_Chk02_DtlR());
			MCJoinKey<MCList<Chk02_DtlR>> dtlJk = up0().join(Chk02_DtlR.$purc_frcst_d_no, rsltL, Chk02_DtlR.$purc_frcst_d_no);
			join(up0(), dtlJk, createMap_Chk02_DtlR_Chk02_DtlR());
		}

		/**
		 * 前回内示日明細検索
		 */
		protected void srchPreDtl(MCList<Chk02_DtlR> dtlL) {
			MCList<MST_PURC_FRCST_H_R> wkL = MCList.create(MST_PURC_FRCST_H_R.class);
			for (Chk02_DtlR r : dtlL.groupBy(Chk02_DtlR.$pre_purc_frcst_no)) {
				MST_PURC_FRCST_H_R wkR = MST_PURC_FRCST_H_R.create();
				wkR.purc_frcst_no(r.getStringNE(Chk02_DtlR.$pre_purc_frcst_no));
				if (!isNull(wkR.purc_frcst_no())) {
					wkL.add(wkR);
				}
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_PURC_FRCST_H_R.create("T"));
			dbWkDelete("MSBDL0210_MSW_PURC_FRCST_H_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBDL0210_MSW_PURC_FRCST_H_I01", wkL, wkL_bldr.getBaseDbc());

			MCList<Chk02_DtlR> preDtl = MCList.create(Chk02_DtlR.class);
			executeQuery(preDtl, MSBDL0210_MST_PURC_FRCST_H_S03());
			String[] joinkey = new String[] {Chk02_DtlR.$pre_pf_dt,
					Chk02_DtlR.$sppl_cd,
					Chk02_DtlR.$wg_cd,
					Chk02_DtlR.$itm_cd,
					Chk02_DtlR.$itm_sub1,
					Chk02_DtlR.$itm_sub2,
					Chk02_DtlR.$itm_sub3,
					Chk02_DtlR.$pf_period_typ,
					Chk02_DtlR.$pf_period_st_dt};
			MCJoinKey<MCList<Chk02_DtlR>> jk = dtlL.join(joinkey, preDtl, joinkey);
			join(dtlL, jk, createMap_Chk02_DtlR_Pre_Chk02_DtlR());
		}

		/**
		 * 下り電文編集
		 */
		protected void editRslt() {
			MCList<Chk02_DtlR> fixL = MCList.create(Chk02_DtlR.class);
			MCList<Chk02_DtlR> dtlL = MCList.create(Chk02_DtlR.class);
			for (MCList<Chk02_DtlR> subL: up0().groupList(Chk02_DtlR.$purc_frcst_fix_no)) {
				for (Chk02_DtlR r:subL) {
					if (isNull(r.purc_frcst_d_no())) {
						fixL.add(r);
					}
					else {
						dtlL.add(r);
					}
				}
			}
			fixL.setString(Chk02_DtlR.$purc_frcst_d_no, null);
			fixL.setString(Chk02_DtlR.$pf_period_typ, null);
			fixL.setDate(Chk02_DtlR.$pf_period_st_dt, null);
			fixL.setDate(Chk02_DtlR.$pf_period_end_dt, null);
			fixL.setBoolean(Chk02_DtlR.$fix_period_flg, false);
			fixL.setString(Chk02_DtlR.$trd_unit_cd, null);
			fixL.setString(Chk02_DtlR.$trd_unit_nm, null);
			fixL.setNumber(Chk02_DtlR.$trd_unit_schd_qty, null);
			fixL.setNumber(Chk02_DtlR.$trd_unit_pf_qty, null);
			fixL.setNumber(Chk02_DtlR.$trd_unit_prms_qty, null);
			fixL.setString(Chk02_DtlR.$base_unit_cd, null);
			fixL.setString(Chk02_DtlR.$base_unit_nm, null);
			fixL.setNumber(Chk02_DtlR.$base_unit_schd_qty, null);
			fixL.setNumber(Chk02_DtlR.$base_unit_pf_qty, null);
			fixL.setNumber(Chk02_DtlR.$base_unit_prms_qty, null);
			fixL.setBoolean(Chk02_DtlR.$pre_fix_period_flg, false);
			fixL.setNumber(Chk02_DtlR.$pre_trd_unit_pf_qty, null);
			fixL.setNumber(Chk02_DtlR.$pre_base_unit_pf_qty, null);

			dtlL.setBoolean(Chk02_DtlR.$fix_flg, false);
			dtlL.setString(Chk02_DtlR.$dtl_rpt_rmrks, null);
			dtlL.setString(Chk02_DtlR.$dtl_intr_rmrks, null);
			dtlL.setString(Chk02_DtlR.$dtl_sub_char1, null);
			dtlL.setString(Chk02_DtlR.$dtl_sub_char2, null);
			dtlL.setString(Chk02_DtlR.$dtl_sub_char3, null);

			MCSortPolicy sp = new MCSortPolicy();
			sp.add(SortType.ASC, Chk02_DtlR.$pf_dt);
			sp.add(SortType.ASC, Chk02_DtlR.$sppl_cd);
			sp.add(SortType.ASC, Chk02_DtlR.$wg_cd);
			sp.add(SortType.ASC, Chk02_DtlR.$itm_cd);
			sp.add(SortType.ASC, Chk02_DtlR.$itm_sub1);
			sp.add(SortType.ASC, Chk02_DtlR.$itm_sub2);
			sp.add(SortType.ASC, Chk02_DtlR.$itm_sub3);
			sp.add(SortType.ASC, Chk02_DtlR.$purc_frcst_fix_no);
			sp.add(SortType.ASC_NULL_AHEAD, Chk02_DtlR.$pf_period_typ);
			sp.add(SortType.ASC, Chk02_DtlR.$pf_period_st_dt);

			up0().sort(sp);
		}

		/**
		 * 更新前チェック
		 */
		protected void callSvcChk01() {
			MSBDL_PurcFrcstService.PurcFrcst_Chk01 svc = MSBDL_PurcFrcstService.crtPurcFrcst_Chk01();
			for (Chk02_DtlR upR : up0()) {
				if (isNull(upR.purc_frcst_d_no())) {
					PurcFrcst_Chk01_FixR up1R = PurcFrcst_Chk01_FixR.create();
					copy(up1R, upR, createMap_PurcFrcst_Chk01_FixR_Chk02_DtlR());
					svc.up1().add(up1R);
				}
				else {
					PurcFrcst_Chk01_DtlR up2R = PurcFrcst_Chk01_DtlR.create();
					copy(up2R, upR, createMap_PurcFrcst_Chk01_DtlR_Chk02_DtlR());
					svc.up2().add(up2R);
				}
			}
			svc.exec();

			MCList<Chk02_DtlR> fixL = MCList.create(Chk02_DtlR.class);
			MCList<Chk02_DtlR> dtlL = MCList.create(Chk02_DtlR.class);
			for (MCList<Chk02_DtlR> subL: up0().groupList(Chk02_DtlR.$purc_frcst_fix_no)) {
				for (Chk02_DtlR r:subL) {
					if (isNull(r.purc_frcst_d_no())) {
						fixL.add(r);
					}
					else {
						dtlL.add(r);
					}
				}
			}
			MCJoinKey<MCList<PurcFrcst_Chk01_FixR>> fixJk = fixL.join(Chk02_DtlR.$purc_frcst_fix_no , svc.down1() , PurcFrcst_Chk01_FixR.$purc_frcst_fix_no);
			join(fixL, fixJk, createMap_Chk02_DtlR_PurcFrcst_Chk01_FixR());
			MCJoinKey<MCList<PurcFrcst_Chk01_DtlR>> jk = dtlL.join(Chk02_DtlR.$purc_frcst_d_no , svc.down2() , PurcFrcst_Chk01_DtlR.$purc_frcst_d_no);
			join(dtlL, jk, createMap_Chk02_DtlR_PurcFrcst_Chk01_DtlR());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 処理単位内に1つでもerr_flgがオンの行があれば、その処理単位全体のerr_flgをオンにする
		 */
		protected void setGrpErrFlg() {
			String[] grpKeys = { Chk02_DtlR.$sppl_cd, 
					Chk02_DtlR.$wg_cd, 
					Chk02_DtlR.$itm_cd, 
					Chk02_DtlR.$itm_sub1, 
					Chk02_DtlR.$itm_sub2,
					Chk02_DtlR.$itm_sub3 };
			setGrpErrFlgByKey(up0(), grpKeys, Chk02_DtlR.$err_flg);
		}

		/**
		 * ワークテーブル登録
		 */
		protected void insWk() {
			MCList<MST_PURC_FRCST_H_R> hdr = MCList.create(MST_PURC_FRCST_H_R.class);
			for (Chk02_DtlR r : up0().groupBy(Chk02_DtlR.$purc_frcst_no)) {
				MST_PURC_FRCST_H_R hdrR = MST_PURC_FRCST_H_R.create();
				hdrR.purc_frcst_no(r.purc_frcst_no());
				hdr.add(hdrR);
			}
			MCQueryApiBuilder hdr_bldr = MCQueryApiBuilder.create(MST_PURC_FRCST_H_R.create("T"));
			dbWkDelete("MSBDL0210_MSW_PURC_FRCST_H_D02", hdr_bldr.getBaseDbc());
			dbWkInsert("MSBDL0210_MSW_PURC_FRCST_H_I02", hdr, hdr_bldr.getBaseDbc());
			
			MCList<MST_PURC_FRCST_FIX_R> fix = MCList.create(MST_PURC_FRCST_FIX_R.class);
			for (Chk02_DtlR r : up0().groupBy(Chk02_DtlR.$purc_frcst_fix_no)) {
				MST_PURC_FRCST_FIX_R fixR = MST_PURC_FRCST_FIX_R.create();
				fixR.purc_frcst_fix_no(r.purc_frcst_fix_no());
				fix.add(fixR);
			}
			MCQueryApiBuilder fix_bldr = MCQueryApiBuilder.create(MST_PURC_FRCST_FIX_R.create("T"));
			dbWkDelete("MSBDL0210_MSW_PURC_FRCST_FIX_D02", fix_bldr.getBaseDbc());
			dbWkInsert("MSBDL0210_MSW_PURC_FRCST_FIX_I02", fix, fix_bldr.getBaseDbc());
			
			MCList<MST_PURC_FRCST_D_R> dtl = MCList.create(MST_PURC_FRCST_D_R.class);
			for (Chk02_DtlR r : up0().groupBy(Chk02_DtlR.$purc_frcst_d_no)) {
				MST_PURC_FRCST_D_R dtlR = MST_PURC_FRCST_D_R.create();
				dtlR.purc_frcst_d_no(r.purc_frcst_d_no());
				dtl.add(dtlR);
			}
			MCQueryApiBuilder dtl_bldr = MCQueryApiBuilder.create(MST_PURC_FRCST_D_R.create("T"));
			dbWkDelete("MSBDL0210_MSW_PURC_FRCST_D_D01", dtl_bldr.getBaseDbc());
			dbWkInsert("MSBDL0210_MSW_PURC_FRCST_D_I01", dtl, dtl_bldr.getBaseDbc());
		}

		protected Map_PurcFrcst_Chk01_FixR_Chk02_DtlR<PurcFrcst_Chk01_FixR,Chk02_DtlR> createMap_PurcFrcst_Chk01_FixR_Chk02_DtlR() {
			return new Map_PurcFrcst_Chk01_FixR_Chk02_DtlR<PurcFrcst_Chk01_FixR, Chk02_DtlR>();
		}
		public class Map_PurcFrcst_Chk01_FixR_Chk02_DtlR<D extends PurcFrcst_Chk01_FixR, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcFrcst_Chk01_FixR.$peg_no, Chk02_DtlR.$peg_no);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$purc_frcst_fix_no, Chk02_DtlR.$purc_frcst_fix_no);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$purc_frcst_no, Chk02_DtlR.$purc_frcst_no);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$pf_dt, Chk02_DtlR.$pf_dt);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$sppl_cd, Chk02_DtlR.$sppl_cd);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$wg_cd, Chk02_DtlR.$wg_cd);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$itm_cd, Chk02_DtlR.$itm_cd);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$itm_sub1, Chk02_DtlR.$itm_sub1);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$itm_sub2, Chk02_DtlR.$itm_sub2);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$itm_sub3, Chk02_DtlR.$itm_sub3);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$trd_unit_cd, Chk02_DtlR.$trd_unit_cd);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$base_unit_cd, Chk02_DtlR.$base_unit_cd);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$fix_flg, Chk02_DtlR.$fix_flg);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$rpt_rmrks, Chk02_DtlR.$dtl_rpt_rmrks);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$intr_rmrks, Chk02_DtlR.$dtl_intr_rmrks);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$sub_char1, Chk02_DtlR.$dtl_sub_char1);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$sub_char2, Chk02_DtlR.$dtl_sub_char2);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$sub_char3, Chk02_DtlR.$dtl_sub_char3);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$upd_cntr, Chk02_DtlR.$upd_cntr);
			}
			@Override
			protected void valueCopy (D dest, S src) {
				dest.setAttributes(src);
			}
		}

		protected Map_PurcFrcst_Chk01_DtlR_Chk02_DtlR<PurcFrcst_Chk01_DtlR,Chk02_DtlR> createMap_PurcFrcst_Chk01_DtlR_Chk02_DtlR() {
			return new Map_PurcFrcst_Chk01_DtlR_Chk02_DtlR<PurcFrcst_Chk01_DtlR, Chk02_DtlR>();
		}
		public class Map_PurcFrcst_Chk01_DtlR_Chk02_DtlR<D extends PurcFrcst_Chk01_DtlR, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$peg_no, Chk02_DtlR.$peg_no);
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$purc_frcst_d_no, Chk02_DtlR.$purc_frcst_d_no);
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$purc_frcst_fix_no, Chk02_DtlR.$purc_frcst_fix_no);
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$purc_frcst_no, Chk02_DtlR.$purc_frcst_no);
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$pf_period_typ, Chk02_DtlR.$pf_period_typ);
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$pf_period_st_dt, Chk02_DtlR.$pf_period_st_dt);
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$pf_period_end_dt, Chk02_DtlR.$pf_period_end_dt);
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$fix_period_flg, Chk02_DtlR.$fix_period_flg);
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$trd_unit_pf_qty, Chk02_DtlR.$trd_unit_pf_qty);
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$trd_unit_prms_qty, Chk02_DtlR.$trd_unit_prms_qty);
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$trd_unit_conv_base_qty, Chk02_DtlR.$trd_unit_conv_base_qty);
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$trd_unit_conv_qty, Chk02_DtlR.$trd_unit_conv_qty);
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$trd_unit_dec_place, Chk02_DtlR.$trd_unit_dec_place);
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$base_unit_rnd_typ, Chk02_DtlR.$base_unit_rnd_typ);
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$base_unit_dec_place, Chk02_DtlR.$base_unit_dec_place);
			}
			@Override
			protected void valueCopy (D dest, S src) {
				dest.setAttributes(src);
			}
		}

		protected Map_MST_PURC_FRCST_LOCK_R_Chk02_DtlR<MST_PURC_FRCST_LOCK_R,Chk02_DtlR> createMap_MST_PURC_FRCST_LOCK_R_Chk02_DtlR() {
			return new Map_MST_PURC_FRCST_LOCK_R_Chk02_DtlR<MST_PURC_FRCST_LOCK_R, Chk02_DtlR>();
		}
		public class Map_MST_PURC_FRCST_LOCK_R_Chk02_DtlR<D extends MST_PURC_FRCST_LOCK_R, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_PURC_FRCST_LOCK_R.$sppl_cd, Chk02_DtlR.$sppl_cd);
				addColumnPathMap(MST_PURC_FRCST_LOCK_R.$wg_cd, Chk02_DtlR.$wg_cd);
			}
		}

		protected Map_Chk02_DtlR_PurcFrcst_Chk01_FixR<Chk02_DtlR,PurcFrcst_Chk01_FixR> createMap_Chk02_DtlR_PurcFrcst_Chk01_FixR() {
			return new Map_Chk02_DtlR_PurcFrcst_Chk01_FixR<Chk02_DtlR, PurcFrcst_Chk01_FixR>();
		}
		public class Map_Chk02_DtlR_PurcFrcst_Chk01_FixR<D extends Chk02_DtlR, S extends PurcFrcst_Chk01_FixR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_DtlR.$fix_flg, PurcFrcst_Chk01_FixR.$fix_flg);
				addColumnPathMap(Chk02_DtlR.$dtl_rpt_rmrks, PurcFrcst_Chk01_FixR.$rpt_rmrks);
				addColumnPathMap(Chk02_DtlR.$dtl_intr_rmrks, PurcFrcst_Chk01_FixR.$intr_rmrks);
				addColumnPathMap(Chk02_DtlR.$dtl_sub_char1, PurcFrcst_Chk01_FixR.$sub_char1);
				addColumnPathMap(Chk02_DtlR.$dtl_sub_char2, PurcFrcst_Chk01_FixR.$sub_char2);
				addColumnPathMap(Chk02_DtlR.$dtl_sub_char3, PurcFrcst_Chk01_FixR.$sub_char3);
				addColumnPathMap(Chk02_DtlR.$upd_cntr, PurcFrcst_Chk01_FixR.$upd_cntr);
				addColumnPathMap(Chk02_DtlR.$err_flg, PurcFrcst_Chk01_FixR.$err_flg);
			}
		}

		protected Map_Chk02_DtlR_PurcFrcst_Chk01_DtlR<Chk02_DtlR,PurcFrcst_Chk01_DtlR> createMap_Chk02_DtlR_PurcFrcst_Chk01_DtlR() {
			return new Map_Chk02_DtlR_PurcFrcst_Chk01_DtlR<Chk02_DtlR, PurcFrcst_Chk01_DtlR>();
		}
		public class Map_Chk02_DtlR_PurcFrcst_Chk01_DtlR<D extends Chk02_DtlR, S extends PurcFrcst_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_DtlR.$fix_period_flg, PurcFrcst_Chk01_DtlR.$fix_period_flg);
				addColumnPathMap(Chk02_DtlR.$trd_unit_pf_qty, PurcFrcst_Chk01_DtlR.$trd_unit_pf_qty);
				addColumnPathMap(Chk02_DtlR.$trd_unit_prms_qty, PurcFrcst_Chk01_DtlR.$trd_unit_prms_qty);
				addColumnPathMap(Chk02_DtlR.$base_unit_pf_qty, PurcFrcst_Chk01_DtlR.$base_unit_pf_qty);
				addColumnPathMap(Chk02_DtlR.$base_unit_prms_qty, PurcFrcst_Chk01_DtlR.$base_unit_prms_qty);
				addColumnPathMap(Chk02_DtlR.$err_flg, PurcFrcst_Chk01_DtlR.$err_flg);
			}
		}

		protected Map_Chk02_DtlR_Pre_Chk02_DtlR<Chk02_DtlR,Chk02_DtlR> createMap_Chk02_DtlR_Pre_Chk02_DtlR() {
			return new Map_Chk02_DtlR_Pre_Chk02_DtlR<Chk02_DtlR, Chk02_DtlR>();
		}
		public class Map_Chk02_DtlR_Pre_Chk02_DtlR<D extends Chk02_DtlR, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_DtlR.$pre_fix_period_flg, Chk02_DtlR.$pre_fix_period_flg);
				addColumnPathMap(Chk02_DtlR.$pre_trd_unit_pf_qty, Chk02_DtlR.$pre_trd_unit_pf_qty);
				addColumnPathMap(Chk02_DtlR.$pre_base_unit_pf_qty, Chk02_DtlR.$pre_base_unit_pf_qty);
			}
		}

		protected Map_Chk02_DtlR_Chk02_DtlR<Chk02_DtlR,Chk02_DtlR> createMap_Chk02_DtlR_Chk02_DtlR() {
			return new Map_Chk02_DtlR_Chk02_DtlR<Chk02_DtlR, Chk02_DtlR>();
		}
		public class Map_Chk02_DtlR_Chk02_DtlR<D extends Chk02_DtlR, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_DtlR.$del_flg, Chk02_DtlR.$del_flg);
				addColumnPathMap(Chk02_DtlR.$pre_purc_frcst_no, Chk02_DtlR.$pre_purc_frcst_no);
				addColumnPathMap(Chk02_DtlR.$pre_pf_dt, Chk02_DtlR.$pre_pf_dt);
				addColumnPathMap(Chk02_DtlR.$latest_flg, Chk02_DtlR.$latest_flg);
				addColumnPathMap(Chk02_DtlR.$pf_rpt_flg, Chk02_DtlR.$pf_rpt_flg);
				addColumnPathMap(Chk02_DtlR.$pf_rpt_no, Chk02_DtlR.$pf_rpt_no);
				addColumnPathMap(Chk02_DtlR.$del_pf_rpt_flg, Chk02_DtlR.$del_pf_rpt_flg);
				addColumnPathMap(Chk02_DtlR.$purc_commit_flg, Chk02_DtlR.$purc_commit_flg);
				addColumnPathMap(Chk02_DtlR.$pf_period_end_dt, Chk02_DtlR.$pf_period_end_dt);
				addColumnPathMap(Chk02_DtlR.$fix_period_flg, Chk02_DtlR.$fix_period_flg);
				addColumnPathMap(Chk02_DtlR.$fix_period_num, Chk02_DtlR.$fix_period_num);
				addColumnPathMap(Chk02_DtlR.$trd_unit_schd_qty, Chk02_DtlR.$trd_unit_schd_qty);
				addColumnPathMap(Chk02_DtlR.$base_unit_schd_qty, Chk02_DtlR.$base_unit_schd_qty);
				addColumnPathMap(Chk02_DtlR.$pre_fix_period_flg, Chk02_DtlR.$pre_fix_period_flg);
				addColumnPathMap(Chk02_DtlR.$pre_trd_unit_pf_qty, Chk02_DtlR.$pre_trd_unit_pf_qty);
				addColumnPathMap(Chk02_DtlR.$pre_base_unit_pf_qty, Chk02_DtlR.$pre_base_unit_pf_qty);
			}
		}
	}

	/**
	 * Chk03オペレーション.<p>
	 *
	 * 取消前チェック<br>
	 */
	public class Chk03 extends MSBDL_PurcFrcstReg_MC_A.Chk03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			setGrpErrFlg();
			setErrToRtnStsTyp();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(checkWgDAC());
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			if (!hasErrFlgOn(up0())) {
				lockPf();
				callSvcChk02();
			}
			return msgL;
		}

		/**
		 * DACチェック
		 */
		protected MCMessageList checkWgDAC() {
			MCMessageList msgL = new MCMessageList();
			for (Chk03_RsltR chkR: up0()) {
				msgL.addAll(checkWritableWgCdDac(chkR, Chk03_RsltR.$wg_cd));
			}
			return msgL;
		}

		/**
		 * 購買内示ロック
		 */
		protected void lockPf() {
			MCList<MST_PURC_FRCST_LOCK_R> lockL = MCList.create(MST_PURC_FRCST_LOCK_R.class);
			addAll(lockL,
					up0().groupBy(Chk03_RsltR.$wg_cd, Chk03_RsltR.$sppl_cd),
					createMap_MST_PURC_FRCST_LOCK_R_Chk03_RsltR());
			lock(lockL);
		}

		/**
		 * 更新前チェック実施
		 */
		protected void callSvcChk02() {
			MSBDL_PurcFrcstService.PurcFrcst_Chk02 svc = MSBDL_PurcFrcstService.crtPurcFrcst_Chk02();
			addAll(svc.up0(), up0(), createMap_PurcFrcst_Chk02_HdrR_Chk03_RsltR());
			svc.exec();
			String[] destCols = {Chk03_RsltR.$purc_frcst_no,
					Chk03_RsltR.$upd_cntr,
					Chk03_RsltR.$err_flg};
			String[] srcCols = {PurcFrcst_Chk02_HdrR.$purc_frcst_no,
					PurcFrcst_Chk02_HdrR.$upd_cntr,
					PurcFrcst_Chk02_HdrR.$err_flg};
			copyByPegNo(up0(), destCols, svc.down0(), srcCols);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 処理単位内に1つでもerr_flgがオンの行があれば、その処理単位全体のerr_flgをオンにする
		 */
		protected void setGrpErrFlg() {
			String[] grpKeys = {Chk03_RsltR.$sppl_cd , Chk03_RsltR.$wg_cd};
			setGrpErrFlgByKey(up0(), grpKeys, Chk03_RsltR.$err_flg);
		}

		protected Map_MST_PURC_FRCST_LOCK_R_Chk03_RsltR<MST_PURC_FRCST_LOCK_R,Chk03_RsltR> createMap_MST_PURC_FRCST_LOCK_R_Chk03_RsltR() {
			return new Map_MST_PURC_FRCST_LOCK_R_Chk03_RsltR<MST_PURC_FRCST_LOCK_R, Chk03_RsltR>();
		}
		public class Map_MST_PURC_FRCST_LOCK_R_Chk03_RsltR<D extends MST_PURC_FRCST_LOCK_R, S extends Chk03_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_PURC_FRCST_LOCK_R.$sppl_cd, Chk03_RsltR.$sppl_cd);
				addColumnPathMap(MST_PURC_FRCST_LOCK_R.$wg_cd, Chk03_RsltR.$wg_cd);
			}
		}

		protected Map_PurcFrcst_Chk02_HdrR_Chk03_RsltR<PurcFrcst_Chk02_HdrR,Chk03_RsltR> createMap_PurcFrcst_Chk02_HdrR_Chk03_RsltR() {
			return new Map_PurcFrcst_Chk02_HdrR_Chk03_RsltR<PurcFrcst_Chk02_HdrR, Chk03_RsltR>();
		}
		public class Map_PurcFrcst_Chk02_HdrR_Chk03_RsltR<D extends PurcFrcst_Chk02_HdrR, S extends Chk03_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcFrcst_Chk02_HdrR.$peg_no, Chk03_RsltR.$peg_no);
				addColumnPathMap(PurcFrcst_Chk02_HdrR.$purc_frcst_no, Chk03_RsltR.$purc_frcst_no);
				addColumnPathMap(PurcFrcst_Chk02_HdrR.$upd_cntr, Chk03_RsltR.$upd_cntr);
			}
		}
	}

	/**
	 * Chk04オペレーション.<p>
	 *
	 * 取消中止前チェック<br>
	 */
	public class Chk04 extends MSBDL_PurcFrcstReg_MC_A.Chk04 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			setGrpErrFlg();
			setErrToRtnStsTyp();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(checkWgDAC());
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			if (!hasErrFlgOn(up0())) {
				lockPf();
				callSvcChk03();
			}
			return msgL;
		}

		/**
		 * DACチェック
		 */
		protected MCMessageList checkWgDAC() {
			MCMessageList msgL = new MCMessageList();

			for (Chk04_RsltR chkR: up0()) {
				msgL.addAll(checkWritableWgCdDac(chkR, Chk03_RsltR.$wg_cd));
			}
			return msgL;
		}

		/**
		 * 購買内示ロック
		 */
		protected void lockPf() {
			MCList<MST_PURC_FRCST_LOCK_R> lockL = MCList.create(MST_PURC_FRCST_LOCK_R.class);
			addAll(lockL,
					up0().groupBy(Chk04_RsltR.$wg_cd, Chk04_RsltR.$sppl_cd),
					createMap_MST_PURC_FRCST_LOCK_R_Chk04_RsltR());
			lock(lockL);
		}

		/**
		 * 更新前チェック実施
		 */
		protected void callSvcChk03() {
			MSBDL_PurcFrcstService.PurcFrcst_Chk03 svc = MSBDL_PurcFrcstService.crtPurcFrcst_Chk03();
			addAll(svc.up0(), up0(), createMap_PurcFrcst_Chk03_HdrR_Chk04_RsltR());
			svc.exec();
			String[] destCols = new String[]{Chk04_RsltR.$purc_frcst_no,Chk04_RsltR.$pf_rpt_no,
					Chk04_RsltR.$upd_cntr,
					Chk04_RsltR.$err_flg};
			String[] srcCols = new String[] {PurcFrcst_Chk03_HdrR.$purc_frcst_no,PurcFrcst_Chk03_HdrR.$pf_rpt_no,
					PurcFrcst_Chk03_HdrR.$upd_cntr,
					PurcFrcst_Chk03_HdrR.$err_flg};
			copyByPegNo(up0(), destCols, svc.down0(), srcCols);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 処理単位内に1つでもerr_flgがオンの行があれば、その処理単位全体のerr_flgをオンにする
		 */
		protected void setGrpErrFlg() {
			String[] grpKeys = {Chk04_RsltR.$sppl_cd , Chk04_RsltR.$wg_cd};
			setGrpErrFlgByKey(up0(), grpKeys, Chk04_RsltR.$err_flg);
		}

		protected Map_MST_PURC_FRCST_LOCK_R_Chk04_RsltR<MST_PURC_FRCST_LOCK_R,Chk04_RsltR> createMap_MST_PURC_FRCST_LOCK_R_Chk04_RsltR() {
			return new Map_MST_PURC_FRCST_LOCK_R_Chk04_RsltR<MST_PURC_FRCST_LOCK_R, Chk04_RsltR>();
		}
		public class Map_MST_PURC_FRCST_LOCK_R_Chk04_RsltR<D extends MST_PURC_FRCST_LOCK_R, S extends Chk04_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_PURC_FRCST_LOCK_R.$sppl_cd, Chk04_RsltR.$sppl_cd);
				addColumnPathMap(MST_PURC_FRCST_LOCK_R.$wg_cd, Chk04_RsltR.$wg_cd);
			}
		}

		protected Map_PurcFrcst_Chk03_HdrR_Chk04_RsltR<PurcFrcst_Chk03_HdrR,Chk04_RsltR> createMap_PurcFrcst_Chk03_HdrR_Chk04_RsltR() {
			return new Map_PurcFrcst_Chk03_HdrR_Chk04_RsltR<PurcFrcst_Chk03_HdrR, Chk04_RsltR>();
		}
		public class Map_PurcFrcst_Chk03_HdrR_Chk04_RsltR<D extends PurcFrcst_Chk03_HdrR, S extends Chk04_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcFrcst_Chk03_HdrR.$peg_no, Chk04_RsltR.$peg_no);
				addColumnPathMap(PurcFrcst_Chk03_HdrR.$purc_frcst_no, Chk04_RsltR.$purc_frcst_no);
				addColumnPathMap(PurcFrcst_Chk03_HdrR.$pf_rpt_no, Chk04_RsltR.$pf_rpt_no);
				addColumnPathMap(PurcFrcst_Chk03_HdrR.$upd_cntr, Chk04_RsltR.$upd_cntr);
			}
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 購買内示情報を更新する<br>
	 */
	public class Upd01 extends MSBDL_PurcFrcstReg_MC_A.Upd01 {
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
			callThisChk01();
			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				callSvcUpd01(notErrL);
				callSvcPrnt01(notErrL);
			}
		}

		/**
		 * 前処理
		 */
		protected void editUp(){
			setPegNo(up0());
		}

		/**
		 * 更新前チェック
		 */
		protected void callThisChk01() {
			MSBDL_PurcFrcstReg.Chk01 ope = MSBDL_PurcFrcstReg.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 購買内示ヘッダ更新
		 */
		protected void callSvcUpd01(MCList<Chk01_RsltR> notErrL) {
			MSBDL_PurcFrcstService.PurcFrcst_Upd01 svc = MSBDL_PurcFrcstService.crtPurcFrcst_Upd01();
			addAll(svc.up0(), notErrL, createMap_PurcFrcst_Chk01_HdrR_Chk01_RsltR());
			svc.exec();
		}

		/**
		 * 内示書発行
		 */
		protected void callSvcPrnt01(MCList<Chk01_RsltR> notErrL) {
			MSBDL_PurcFrcstService.PurcFrcst_Prnt01 ope = MSBDL_PurcFrcstService.crtPurcFrcst_Prnt01();
			for (Chk01_RsltR upR : notErrL) {
				if (up1().prnt_flg() && !upR.del_flg() && !upR.pf_rpt_flg()) {
					PurcFrcst_Prnt01_HdrR r = PurcFrcst_Prnt01_HdrR.create();
					copy(r, upR , createMap_PurcFrcst_Prnt01_HdrR_Chk01_RsltR());
					ope.up0().add(r);
				}
			}
			if (!isNull(ope.up0())) {
				ope.up1().indiv_prnt_flg(up1().indiv_prnt_flg());
				ope.exec();
			}
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
		 * 発注先、ワーキンググループ単位で電文を分割する
		 */
		protected List<MCList<Chk01_RsltR>> splitUp(MCList<Chk01_RsltR> list, int max) {
			List<MCList<Chk01_RsltR>> ret = new ArrayList<>();

			MCList<Chk01_RsltR>[] grpL = list.groupList(Chk01_RsltR.$sppl_cd,
					Chk01_RsltR.$wg_cd);
			MCList<Chk01_RsltR> tmp = MCList.create(Chk01_RsltR.class);
			for (MCList<Chk01_RsltR> grp : grpL) {
				if (tmp.size() >= max) {
					tmp.sort(Chk01_RsltR.$pf_dt);
					ret.add(tmp);
					tmp = MCList.create(Chk01_RsltR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				tmp.sort(Chk01_RsltR.$pf_dt);
				ret.add(tmp);
			}
			return ret;
		}


		protected Map_PurcFrcst_Chk01_HdrR_Chk01_RsltR<PurcFrcst_Chk01_HdrR,Chk01_RsltR> createMap_PurcFrcst_Chk01_HdrR_Chk01_RsltR() {
			return new Map_PurcFrcst_Chk01_HdrR_Chk01_RsltR<PurcFrcst_Chk01_HdrR, Chk01_RsltR>();
		}
		public class Map_PurcFrcst_Chk01_HdrR_Chk01_RsltR<D extends PurcFrcst_Chk01_HdrR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcFrcst_Chk01_HdrR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(PurcFrcst_Chk01_HdrR.$purc_frcst_no, Chk01_RsltR.$purc_frcst_no);
				addColumnPathMap(PurcFrcst_Chk01_HdrR.$pf_usr_cd, Chk01_RsltR.$pf_usr_cd);
				addColumnPathMap(PurcFrcst_Chk01_HdrR.$pf_dpt_cd, Chk01_RsltR.$pf_dpt_cd);
				addColumnPathMap(PurcFrcst_Chk01_HdrR.$rpt_rmrks, Chk01_RsltR.$hdr_rpt_rmrks);
				addColumnPathMap(PurcFrcst_Chk01_HdrR.$intr_rmrks, Chk01_RsltR.$hdr_intr_rmrks);
				addColumnPathMap(PurcFrcst_Chk01_HdrR.$sub_char1, Chk01_RsltR.$hdr_sub_char1);
				addColumnPathMap(PurcFrcst_Chk01_HdrR.$sub_char2, Chk01_RsltR.$hdr_sub_char2);
				addColumnPathMap(PurcFrcst_Chk01_HdrR.$sub_char3, Chk01_RsltR.$hdr_sub_char3);
			}
		}

		protected Map_PurcFrcst_Prnt01_HdrR_Chk01_RsltR<PurcFrcst_Prnt01_HdrR,Chk01_RsltR> createMap_PurcFrcst_Prnt01_HdrR_Chk01_RsltR() {
			return new Map_PurcFrcst_Prnt01_HdrR_Chk01_RsltR<PurcFrcst_Prnt01_HdrR, Chk01_RsltR>();
		}
		public class Map_PurcFrcst_Prnt01_HdrR_Chk01_RsltR<D extends PurcFrcst_Prnt01_HdrR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcFrcst_Prnt01_HdrR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(PurcFrcst_Prnt01_HdrR.$purc_frcst_no, Chk01_RsltR.$purc_frcst_no);
			}
		}

	}

	/**
	 * Upd02オペレーション.<p>
	 *
	 * 購買内示情報を更新する<br>
	 */
	public class Upd02 extends MSBDL_PurcFrcstReg_MC_A.Upd02 {
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
			callThisChk02();
			MCList<Chk02_DtlR> notErrL = up0().subList(Chk02_DtlR.$err_flg, false);
			if (notErrL.size() != 0) {
				callSvcUpd01(notErrL);
			}
		}

		/**
		 * 前処理
		 */
		protected void editUp(){
			setPegNo(up0());
			srchDtl();
		}

		/**
		 * 更新前チェック
		 */
		protected void callThisChk02() {
			MSBDL_PurcFrcstReg.Chk02 ope = MSBDL_PurcFrcstReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 購買内示明細更新
		 */
		protected void callSvcUpd01(MCList<Chk02_DtlR> notErrL) {
			MSBDL_PurcFrcstService.PurcFrcst_Upd01 svc = MSBDL_PurcFrcstService.crtPurcFrcst_Upd01();
			for (Chk02_DtlR upR : notErrL) {
				if (isNull(upR.purc_frcst_d_no())) {
					PurcFrcst_Chk01_FixR up1R = PurcFrcst_Chk01_FixR.create();
					copy(up1R, upR, createMap_PurcFrcst_Chk01_FixR_Chk02_DtlR());
					svc.up1().add(up1R);
				}
				else {
					PurcFrcst_Chk01_DtlR up2R = PurcFrcst_Chk01_DtlR.create();
					copy(up2R, upR, createMap_PurcFrcst_Chk01_DtlR_Chk02_DtlR());
					svc.up2().add(up2R);
				}
			}
			svc.exec();
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

			List<MCList<Chk02_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk02_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk02_DtlR> up0L = ((MCList<Chk02_DtlR>)ope.up(0));
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 発注先、ワーキンググループで電文を分割する
		 */
		protected List<MCList<Chk02_DtlR>> splitUp(MCList<Chk02_DtlR> list, int max) {
			List<MCList<Chk02_DtlR>> ret = new ArrayList<>();

			MCList<Chk02_DtlR>[] grpL = list.groupList(Chk02_DtlR.$sppl_cd,
					Chk02_DtlR.$wg_cd);
			MCList<Chk02_DtlR> tmp = MCList.create(Chk02_DtlR.class);
			for (MCList<Chk02_DtlR> grp : grpL) {
				if (tmp.size() >= max) {
					tmp.sort(Chk02_DtlR.$pf_dt);
					ret.add(tmp);
					tmp = MCList.create(Chk02_DtlR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				tmp.sort(Chk02_DtlR.$pf_dt);
				ret.add(tmp);
			}
			Collections.sort(ret, new Comparator<MCList<Chk02_DtlR>>() {
				public int compare(MCList<Chk02_DtlR> up1, MCList<Chk02_DtlR> up2) {
					MCDate minYmi = (MCDate) up1.min(Chk02_DtlR.$pf_dt);
					MCDate minYmj = (MCDate) up2.min(Chk02_DtlR.$pf_dt);
					return (int) minYmj.diffDay(minYmi);
				}
			});
			return ret;
		}

		/**
		 * 項目補完
		 */
		protected void srchDtl() {
			MCList<MST_PURC_FRCST_D_R> dbcL = MCList.create(MST_PURC_FRCST_D_R.class);
			for (Chk02_DtlR upR : up0()) {
				MST_PURC_FRCST_D_R dbcR = MST_PURC_FRCST_D_R.create();
				dbcR.purc_frcst_d_no(upR.purc_frcst_d_no());
				dbcL.add(dbcR);
			}
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MST_PURC_FRCST_D_R.create("T"));
			dbWkDelete("MSBDL0210_MSW_PURC_FRCST_D_D02", dbcL_bldr.getBaseDbc());
			dbWkInsert("MSBDL0210_MSW_PURC_FRCST_D_I02", dbcL, dbcL_bldr.getBaseDbc());

			MCList<Chk02_DtlR> dtlL= MCList.create(Chk02_DtlR.class);
			executeQuery(dtlL, MSBDL0210_MST_PURC_FRCST_D_S01());
			MCJoinKey<MCList<Chk02_DtlR>> jk1 = up0().join(Chk02_DtlR.$purc_frcst_fix_no , dtlL , Chk02_DtlR.$purc_frcst_fix_no);
			join(up0(), jk1, createMap_Chk02_DtlR_Chk02_DtlR1());
			MCJoinKey<MCList<Chk02_DtlR>> jk2 = up0().join(Chk02_DtlR.$purc_frcst_d_no , dtlL , Chk02_DtlR.$purc_frcst_d_no);
			join(up0(), jk2, createMap_Chk02_DtlR_Chk02_DtlR2());
		}

		protected Map_PurcFrcst_Chk01_FixR_Chk02_DtlR<PurcFrcst_Chk01_FixR,Chk02_DtlR> createMap_PurcFrcst_Chk01_FixR_Chk02_DtlR() {
			return new Map_PurcFrcst_Chk01_FixR_Chk02_DtlR<PurcFrcst_Chk01_FixR, Chk02_DtlR>();
		}
		public class Map_PurcFrcst_Chk01_FixR_Chk02_DtlR<D extends PurcFrcst_Chk01_FixR, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcFrcst_Chk01_FixR.$peg_no, Chk02_DtlR.$peg_no);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$purc_frcst_fix_no, Chk02_DtlR.$purc_frcst_fix_no);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$purc_frcst_no, Chk02_DtlR.$purc_frcst_no);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$fix_flg, Chk02_DtlR.$fix_flg);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$rpt_rmrks, Chk02_DtlR.$dtl_rpt_rmrks);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$intr_rmrks, Chk02_DtlR.$dtl_intr_rmrks);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$sub_char1, Chk02_DtlR.$dtl_sub_char1);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$sub_char2, Chk02_DtlR.$dtl_sub_char2);
				addColumnPathMap(PurcFrcst_Chk01_FixR.$sub_char3, Chk02_DtlR.$dtl_sub_char3);
			}
		}

		protected Map_PurcFrcst_Chk01_DtlR_Chk02_DtlR<PurcFrcst_Chk01_DtlR,Chk02_DtlR> createMap_PurcFrcst_Chk01_DtlR_Chk02_DtlR() {
			return new Map_PurcFrcst_Chk01_DtlR_Chk02_DtlR<PurcFrcst_Chk01_DtlR, Chk02_DtlR>();
		}
		public class Map_PurcFrcst_Chk01_DtlR_Chk02_DtlR<D extends PurcFrcst_Chk01_DtlR, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$peg_no, Chk02_DtlR.$peg_no);
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$purc_frcst_d_no, Chk02_DtlR.$purc_frcst_d_no);
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$purc_frcst_fix_no, Chk02_DtlR.$purc_frcst_fix_no);
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$purc_frcst_no, Chk02_DtlR.$purc_frcst_no);
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$fix_period_flg, Chk02_DtlR.$fix_period_flg);
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$trd_unit_pf_qty, Chk02_DtlR.$trd_unit_pf_qty);
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$base_unit_pf_qty, Chk02_DtlR.$base_unit_pf_qty);
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$trd_unit_prms_qty, Chk02_DtlR.$trd_unit_prms_qty);
				addColumnPathMap(PurcFrcst_Chk01_DtlR.$base_unit_prms_qty, Chk02_DtlR.$base_unit_prms_qty);
			}
		}

		protected Map_Chk02_DtlR_Chk02_DtlR1<Chk02_DtlR,Chk02_DtlR> createMap_Chk02_DtlR_Chk02_DtlR1() {
			return new Map_Chk02_DtlR_Chk02_DtlR1<Chk02_DtlR, Chk02_DtlR>();
		}
		public class Map_Chk02_DtlR_Chk02_DtlR1<D extends Chk02_DtlR, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_DtlR.$sppl_cd, Chk02_DtlR.$sppl_cd);
				addColumnPathMap(Chk02_DtlR.$wg_cd, Chk02_DtlR.$wg_cd);
				addColumnPathMap(Chk02_DtlR.$pf_dt, Chk02_DtlR.$pf_dt);
				addColumnPathMap(Chk02_DtlR.$itm_cd, Chk02_DtlR.$itm_cd);
				addColumnPathMap(Chk02_DtlR.$itm_sub1, Chk02_DtlR.$itm_sub1);
				addColumnPathMap(Chk02_DtlR.$itm_sub2, Chk02_DtlR.$itm_sub2);
				addColumnPathMap(Chk02_DtlR.$itm_sub3, Chk02_DtlR.$itm_sub3);
				addColumnPathMap(Chk02_DtlR.$trd_unit_cd, Chk02_DtlR.$trd_unit_cd);
				addColumnPathMap(Chk02_DtlR.$base_unit_cd, Chk02_DtlR.$base_unit_cd);
			}
		}

		protected Map_Chk02_DtlR_Chk02_DtlR2<Chk02_DtlR,Chk02_DtlR> createMap_Chk02_DtlR_Chk02_DtlR2() {
			return new Map_Chk02_DtlR_Chk02_DtlR2<Chk02_DtlR, Chk02_DtlR>();
		}
		public class Map_Chk02_DtlR_Chk02_DtlR2<D extends Chk02_DtlR, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_DtlR.$pf_period_typ, Chk02_DtlR.$pf_period_typ);
				addColumnPathMap(Chk02_DtlR.$pf_period_st_dt, Chk02_DtlR.$pf_period_st_dt);
				addColumnPathMap(Chk02_DtlR.$pf_period_end_dt, Chk02_DtlR.$pf_period_end_dt);
			}
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 購買内示情報を取消する。<br>
	 */
	public class Del01 extends MSBDL_PurcFrcstReg_MC_A.Del01 {
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
			callThisChk03();
			MCList<Chk03_RsltR> notErrL = up0().subList(Chk03_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				callSvcDel01(notErrL);
				callSvcPrnt01(notErrL);
			}
		}

		/**
		 * 前処理
		 */
		protected void editUp(){
			setPegNo(up0());
		}

		/**
		 * 取消前チェック
		 */
		protected void callThisChk03() {
			MSBDL_PurcFrcstReg.Chk03 ope = MSBDL_PurcFrcstReg.crtChk03();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 購買内示取消
		 */
		protected void callSvcDel01(MCList<Chk03_RsltR> notErrL ) {
			MSBDL_PurcFrcstService.PurcFrcst_Del01 svc = MSBDL_PurcFrcstService.crtPurcFrcst_Del01();
			addAll(svc.up0(), notErrL, createMap_PurcFrcst_Chk02_HdrR_Chk03_RsltR());
			svc.exec();
		}

		/**
		 * 取消内示書発行
		 */
		protected void callSvcPrnt01(MCList<Chk03_RsltR> notErrL ) {
			MSBDL_PurcFrcstService.PurcFrcst_Prnt01 ope = MSBDL_PurcFrcstService.crtPurcFrcst_Prnt01();
			for (Chk03_RsltR upR : notErrL) {
				if (up1().prnt_flg()) {
					PurcFrcst_Prnt01_HdrR r = PurcFrcst_Prnt01_HdrR.create();
					copy(r, upR , createMap_PurcFrcst_Prnt01_HdrR_Chk03_RsltR());
					ope.up0().add(r);
				}
			}
			if (!isNull(ope.up0())) {
				ope.up1().indiv_prnt_flg(up1().indiv_prnt_flg());
				ope.exec();
			}
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
	     * 発注先、ワーキンググループ単位で電文を分割する
	     */
		protected List<MCList<Chk03_RsltR>> splitUp(MCList<Chk03_RsltR> list, int max) {
	        List<MCList<Chk03_RsltR>> ret = new ArrayList<>();

	        MCList<Chk03_RsltR>[] grpL = list.groupList(Chk03_RsltR.$sppl_cd, Chk03_RsltR.$wg_cd);
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

		protected Map_PurcFrcst_Chk02_HdrR_Chk03_RsltR<PurcFrcst_Chk02_HdrR,Chk03_RsltR> createMap_PurcFrcst_Chk02_HdrR_Chk03_RsltR() {
			return new Map_PurcFrcst_Chk02_HdrR_Chk03_RsltR<PurcFrcst_Chk02_HdrR, Chk03_RsltR>();
		}
		public class Map_PurcFrcst_Chk02_HdrR_Chk03_RsltR<D extends PurcFrcst_Chk02_HdrR, S extends Chk03_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcFrcst_Chk02_HdrR.$peg_no, Chk03_RsltR.$peg_no);
				addColumnPathMap(PurcFrcst_Chk02_HdrR.$purc_frcst_no, Chk03_RsltR.$purc_frcst_no);
				addColumnPathMap(PurcFrcst_Chk02_HdrR.$upd_cntr, Chk03_RsltR.$upd_cntr);
			}
		}

		protected Map_PurcFrcst_Prnt01_HdrR_Chk03_RsltR<PurcFrcst_Prnt01_HdrR,Chk03_RsltR> createMap_PurcFrcst_Prnt01_HdrR_Chk03_RsltR() {
			return new Map_PurcFrcst_Prnt01_HdrR_Chk03_RsltR<PurcFrcst_Prnt01_HdrR, Chk03_RsltR>();
		}
		public class Map_PurcFrcst_Prnt01_HdrR_Chk03_RsltR<D extends PurcFrcst_Prnt01_HdrR, S extends Chk03_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcFrcst_Prnt01_HdrR.$peg_no, Chk03_RsltR.$peg_no);
				addColumnPathMap(PurcFrcst_Prnt01_HdrR.$purc_frcst_no, Chk03_RsltR.$purc_frcst_no);
			}
		}

	}

	/**
	 * Del02オペレーション.<p>
	 *
	 * 購買内示情報を取消中止する。<br>
	 */
	public class Del02 extends MSBDL_PurcFrcstReg_MC_A.Del02 {
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
			callThisChk04();
			MCList<Chk04_RsltR> notErrL = up0().subList(Chk04_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				callSvcDel02(notErrL);
			}
		}

		/**
		 * 前処理
		 */
		protected void editUp(){
			setPegNo(up0());
		}

		/**
		 * 取消キャンセル前チェック
		 */
		protected void callThisChk04() {
			MSBDL_PurcFrcstReg.Chk04 ope = MSBDL_PurcFrcstReg.crtChk04();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 購買内示取消キャンセル
		 */
		protected void callSvcDel02(MCList<Chk04_RsltR> notErrL) {
			MSBDL_PurcFrcstService.PurcFrcst_Del02 svc = MSBDL_PurcFrcstService.crtPurcFrcst_Del02();
			addAll(svc.up0(), notErrL, createMap_PurcFrcst_Chk03_HdrR_Chk04_RsltR());
			svc.exec();
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
	     * 発注先、ワーキンググループ単位で電文を分割する
	     */
		protected List<MCList<Chk04_RsltR>> splitUp(MCList<Chk04_RsltR> list, int max) {
	        List<MCList<Chk04_RsltR>> ret = new ArrayList<>();

	        MCList<Chk04_RsltR>[] grpL = list.groupList(Chk04_RsltR.$sppl_cd, Chk04_RsltR.$wg_cd);
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

		protected Map_PurcFrcst_Chk03_HdrR_Chk04_RsltR<PurcFrcst_Chk03_HdrR,Chk04_RsltR> createMap_PurcFrcst_Chk03_HdrR_Chk04_RsltR() {
			return new Map_PurcFrcst_Chk03_HdrR_Chk04_RsltR<PurcFrcst_Chk03_HdrR, Chk04_RsltR>();
		}
		public class Map_PurcFrcst_Chk03_HdrR_Chk04_RsltR<D extends PurcFrcst_Chk03_HdrR, S extends Chk04_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcFrcst_Chk03_HdrR.$peg_no, Chk04_RsltR.$peg_no);
				addColumnPathMap(PurcFrcst_Chk03_HdrR.$purc_frcst_no, Chk04_RsltR.$purc_frcst_no);
				addColumnPathMap(PurcFrcst_Chk03_HdrR.$upd_cntr, Chk04_RsltR.$upd_cntr);
			}
		}

	}

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 内示書を印字する。<br>
	 */
	public class Prnt01 extends MSBDL_PurcFrcstReg_MC_A.Prnt01 {
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
			callPrntServ();
		}

		/**
		 * 前処理
		 */
		protected void editUp(){
			setPegNo(up0());
		}

		/**
		 * 内示書、取消内示書発行
		 */
		protected void callPrntServ() {
			MSBDL_PurcFrcstService.PurcFrcst_Prnt01 svc = MSBDL_PurcFrcstService.crtPurcFrcst_Prnt01();
			addAll(svc.up0(), up0(), createMap_PurcFrcst_Prnt01_HdrR_Prnt01_RsltR());
			svc.up1().indiv_prnt_flg(up1().indiv_prnt_flg());
			svc.exec();
			copyByPegNo (up0(), new String[] {Prnt01_RsltR.$pf_rpt_no}, svc.down0(), new String[] {PurcFrcst_Prnt01_HdrR.$pf_rpt_no});
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

			List<MCList<Prnt01_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Prnt01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Prnt01_RsltR> up0L = ((MCList<Prnt01_RsltR>)ope.up(0));
				up0L.setAll(l);
				setUpRowParam(1, (MCRow)ope.up(1), up1());
				opeL.add(ope);
			}
			return opeL;
		}

	    /**
	     * 発注先単位で電文を分割する
	     */
		protected List<MCList<Prnt01_RsltR>> splitUp(MCList<Prnt01_RsltR> list, int max) {
	        List<MCList<Prnt01_RsltR>> ret = new ArrayList<>();

	        MCList<Prnt01_RsltR>[] grpL = list.groupList(Prnt01_RsltR.$sppl_cd);
	        MCList<Prnt01_RsltR> tmp = MCList.create(Prnt01_RsltR.class);
	        for (MCList<Prnt01_RsltR> grp : grpL) {
	            if (tmp.size() >= max) {
	                ret.add(tmp);
	                tmp = MCList.create(Prnt01_RsltR.class);
	            }
	            tmp.addAll(grp);
	        }
	        if (!tmp.isEmpty()) {
	            ret.add(tmp);
	        }
	        return ret;
	    }

		protected Map_PurcFrcst_Prnt01_HdrR_Prnt01_RsltR<PurcFrcst_Prnt01_HdrR,Prnt01_RsltR> createMap_PurcFrcst_Prnt01_HdrR_Prnt01_RsltR() {
			return new Map_PurcFrcst_Prnt01_HdrR_Prnt01_RsltR<PurcFrcst_Prnt01_HdrR, Prnt01_RsltR>();
		}
		public class Map_PurcFrcst_Prnt01_HdrR_Prnt01_RsltR<D extends PurcFrcst_Prnt01_HdrR, S extends Prnt01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcFrcst_Prnt01_HdrR.$peg_no, Prnt01_RsltR.$peg_no);
				addColumnPathMap(PurcFrcst_Prnt01_HdrR.$purc_frcst_no, Prnt01_RsltR.$purc_frcst_no);
				addColumnPathMap(PurcFrcst_Prnt01_HdrR.$pf_rpt_no, Prnt01_RsltR.$pf_rpt_no);
			}
		}

	}

	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイル入力<br>
	 */
	public class Imp01 extends MSBDL_PurcFrcstReg_MC_A.Imp01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			editUp();
			callThisChk02();
			setDown();
		}

		/**
		 * 前処理
		 */
		protected void editUp(){
			setPegNo(Chk01_RsltR.$peg_no, up0());
		}

		/**
		 * ファイル入力チェック
		 */
		protected void callThisChk02() {
			MSBDL_PurcFrcstReg.Chk02 ope = MSBDL_PurcFrcstReg.crtChk02();
			ope.up0().setAll(up0());
			ope.up1().file_imp_flg(true);
			ope.exec();
			up0().setAll(ope.down0());
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

	}

	/**
	 * 対象ワーキンググループ、発注先をロックする
	 */
	protected void lock(MCList<MST_PURC_FRCST_LOCK_R> lockL){
		lockL.sort(MST_PURC_FRCST_LOCK_R.$wg_cd, MST_PURC_FRCST_LOCK_R.$sppl_cd);
		MCList<MST_PURC_FRCST_LOCK_R> dbcL = MCList.create(MST_PURC_FRCST_LOCK_R.class);
		MST_PURC_FRCST_LOCK_R t = MST_PURC_FRCST_LOCK_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.wg_cd);
		dbcL_bldr.addSelect(t.sppl_cd);
		dbcL_bldr.setOrderByAsc(t.wg_cd, t.sppl_cd);
		dbSelectKeyForUpdate("MSBDL0210_MST_PURC_FRCST_LOCK_S01", dbcL, dbcL_bldr, lockL);
	}

	protected Comparable[] getVals(String[] keys, MCRow cndR) {
		Comparable[] vals = new Comparable[keys.length];
		for (int i = 0; i < vals.length; i++) {
			vals[i] = cndR.getValueNE(keys[i]);
		}
		return vals;
	}

	protected <R extends MCRow> void handleSuccess(MCList<R> l) {
		dbTran().commit();
		for (MCRow r : l) {
			if (!r.getBooleanNE(Chk01_RsltR.$err_flg)) {
				r.setString(Chk01_RsltR.$rtn_sts_typ, MAC_RTN_STS_TYP.OK.value());
			}
		}
	}

	protected <R extends MCRow> void handleEx(Exception e, MCList<R> l) {
		dbTran().rollback();
		MCException mcex;
		if (e instanceof MCException) {
			mcex = (MCException)e;
		}
		else {
			mcex = new MCException(e);
		}
		MCLog.write(mcex);
		MCMessage msg = mcex.getMCMessage();
		MCMessagePool.add(msg);
		MCMessagePool.addAll(mcex.getCauseMessageList());
		for (MCRow r : l) {
			r.setString(Chk01_RsltR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value());
		}
	}

	//FMCB CUSTOM END
}