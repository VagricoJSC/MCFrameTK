package mcframe.serverMSBC.MSBCL6010;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.commonFXUC.FXUCC0030.FXUCC_Divide;
import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.serverMSBC.MSBCL6000.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSBC.MSBCL6020.*;
import mcframe.serverMSBC.MSBCL6040.*;
import mcframe.serverMSBE.MSBEL5020.*;
import mcframe.serverMSBE.MSBEL5040.*;
import mcframe.serverMSBE.MSBEL5200.*;
import mcframe.serverMSBF.MSBFL5010.*;
import mcframe.serverMSUC.MSUCL0010.*;
import mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil;
import mcframe.serverMAUC.MAUCL5020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_MfgInstTblRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_MfgInstTblRegService_MC extends MSBCL_MfgInstTblRegService_MC_A{
	//FMCB CUSTOM START

	/**
	 * MfgInstTblReg_Upd01オペレーション.<p>
	 *
	 * 製造指図の追加・更新・削除を行う<br>
	 */
	public class MfgInstTblReg_Upd01 extends MSBCL_MfgInstTblRegService_MC_A.MfgInstTblReg_Upd01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 製造指図の登録
			mfgInstReg();
			// 製造実績残テーブルの登録
			mfgActRemReg();
			// 改訂履歴ワークテーブルの登録
			callRevDataIns01();
		}

		/**
		 * 製造指図の登録
		 */
		protected void mfgInstReg() {
			MCList<MST_MFG_INST_R> insL = MCList.create(MST_MFG_INST_R.class);
			MCList<MST_MFG_INST_R> updL = MCList.create(MST_MFG_INST_R.class);
			MCList<MST_MFG_INST_R> delL = MCList.create(MST_MFG_INST_R.class);
			MCList<MST_MFG_INST_R> abortL = MCList.create(MST_MFG_INST_R.class);
			MCList<MST_MFG_INST_R> abortdelL = MCList.create(MST_MFG_INST_R.class);

			for (MfgInstTblReg_Upd01_DtlMfgR r : up0()) {

				if (r.abort_flg() || (r.old_inst_abort_flg() && !r.abort_flg())) {
					// 打切ＦＬＧがオンの場合（打切）、または打切ＦＬＧがオンからオフに変更された場合（打切取消）、打切ＦＬＧのみを更新する
					if (r.abort_flg()) {
						abortL.add(r.mfg_inst());
					}
					else {
						// 打切ＦＬＧがオンからオフに変更された場合は、指図日も更新する
						abortdelL.add(r.mfg_inst());
					}
				}
				else if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					insL.add(r.mfg_inst());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					updL.add(r.mfg_inst());
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					// 論理削除のため取消ＦＬＧをオンにする
					r.can_flg(true);
					delL.add(r.mfg_inst());
				}
			}
			
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			// 新規追加
			if (!insL.isEmpty()) {
				dbInsertEx("MSBCL6010_MST_MFG_INST_I01", insL, MCQueryApiBuilder.create(t));
			}
			// 更新
			if (!updL.isEmpty()) {
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				editUpdSetStmt(updL, t, updL_bldr);
				dbUpdateKey("MSBCL6010_MST_MFG_INST_U01", updL, updL_bldr);
			}
			// 削除（論理削除）
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(t);
				editDelSetStmt(delL, t, delL_bldr);
				dbUpdateKey("MSBCL6010_MST_MFG_INST_U02", delL, delL_bldr);
			}
			// 打切・打切取消
			if (!abortL.isEmpty()) {
				MCQueryApiBuilder abortL_bldr = MCQueryApiBuilder.create(t);
				editAbortSetStmt(abortL, t, abortL_bldr);
				dbUpdateKey("MSBCL6010_MST_MFG_INST_U03", abortL, abortL_bldr);
			}
			// 打ち切り取り消し
			if (!abortdelL.isEmpty()) {
				MCQueryApiBuilder abortdelL_bldr = MCQueryApiBuilder.create(t);
				editAbortDelSetStmt(abortdelL, t, abortdelL_bldr);
				dbUpdateKey("MSBCL6010_MST_MFG_INST_U04", abortdelL, abortdelL_bldr);
			}
		}

		/**
		 * 更新時のset句の編集
		 */
		protected void editUpdSetStmt(MCList<MST_MFG_INST_R> updL, MST_MFG_INST_R t, MCQueryApiBuilder updL_bldr) {
			// 品目製造指図ＮＯ、受払進捗管理ＮＯ、発注明細ＮＯ、取消ＦＬＧは更新対象としない
			updL_bldr.setSet(t.mfg_inst_rev, t.base_unit_yield_qty,
					t.base_unit_inst_qty, t.base_unit_cd,
					t.st_schd_tm, t.end_schd_tm,
					t.rqst_dlv_rqst_tm, t.inst_dt,
					t.inst_prnt_tm, t.inst_prnt_flg,
					t.aprv_flg, t.mfg_aprv_sts_typ,
					t.aprv_dt, t.aprv_dpt_cd, t.aprv_usr_cd,
					t.aprv_tm, t.aprv_rsn,
					t.mfg_aprv_role_cd, t.disp_pd,
					t.inst_dpt_cd, t.inst_usr_cd,
					t.abort_flg, t.schd_chg_flg,
					t.po_locked_flg, t.po_auto_reg_flg,
					t.mfg_inst_unit_typ, t.intr_rmrks,
					t.inst_rpt_rmrks, t.inst_po_cnt_rmrks,
					t.sub_char1, t.sub_char2, t.sub_char3);
		}

		/**
		 * 論理削除時のset句の編集
		 */
		protected void editDelSetStmt(MCList<MST_MFG_INST_R> delL, MST_MFG_INST_R t, MCQueryApiBuilder delL_bldr) {
			// 取消ＦＬＧのみを更新対象とする
			delL_bldr.setSet(t.can_flg);
		}

		/**
		 * 打切・打切取消時のset句の編集
		 */
		protected void editAbortSetStmt(MCList<MST_MFG_INST_R> delL, MST_MFG_INST_R t, MCQueryApiBuilder delL_bldr) {
			// 製造指図改訂番号、打切ＦＬＧのみを更新対象とする
			delL_bldr.setSet(t.mfg_inst_rev, t.abort_flg);
		}
		protected void editAbortDelSetStmt(MCList<MST_MFG_INST_R> delL, MST_MFG_INST_R t, MCQueryApiBuilder delL_bldr) {
			delL_bldr.setSet(t.mfg_inst_rev, t.abort_flg);
			delL_bldr.addSet(t.inst_dt);
		}

		/**
		 * 製造実績残テーブルの登録
		 * 
		 */
		protected void mfgActRemReg() {
			
			MCList<MST_MFG_ACT_REM_R> insL = MCList.create(MST_MFG_ACT_REM_R.class);
			MCList<MST_MFG_ACT_REM_R> updL = MCList.create(MST_MFG_ACT_REM_R.class);
			MCList<MST_MFG_ACT_REM_R> abortL = MCList.create(MST_MFG_ACT_REM_R.class);
			
			for (MfgInstTblReg_Upd01_DtlMfgR r : up0()) {
				
				// 製造指図状況が着手中または完了（打切除く）の場合は更新不可のため、何もしない
				if (MSC_MFG_STS_TYP.isSTT(r.mfg_sts_typ())
						|| (MSC_MFG_STS_TYP.isCMPL(r.mfg_sts_typ()))) {
					continue;
				}
				
				// 上り電文の製造指図から製造実績残のＤＢコンテナへ値を設定
				MST_MFG_ACT_REM_R remR = MST_MFG_ACT_REM_R.create();
				copy(remR, r, createMap_MST_MFG_ACT_REM_R_MfgInstTblReg_Upd01_DtlMfgR());
				
				if (r.abort_flg()) {
					// 打切ＦＬＧがオンの場合（打切）は製造指図進捗状況を完了にして更新
					remR.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
					abortL.add(remR);
				}
				else if (r.old_inst_abort_flg() && !r.abort_flg()) {
					// 打切ＦＬＧがオンからオフに変更された場合（打切取消）は製造指図状況を上り電文の値で更新
					abortL.add(remR);
				}
				else if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					insL.add(remR);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					updL.add(remR);
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					// 削除の場合は何もしない（製造指図を物理削除しないので、残テーブルも物理削除しない）
				}
			}
			
			// 新規追加
			if (!insL.isEmpty()) {
				dbInsertEx("MSBCL6010_MST_MFG_ACT_REM_I01", insL,
						MCQueryApiBuilder.create(MST_MFG_ACT_REM_R.create("T")));
			}
			// 更新
			if (!updL.isEmpty()) {
				dbUpdateKey("MSBCL6010_MST_MFG_ACT_REM_U01", updL,
						MCQueryApiBuilder.create(MST_MFG_ACT_REM_R.create("T")));
			}
			// 打切・打切取消
			if (!abortL.isEmpty()) {
				MST_MFG_ACT_REM_R t = MST_MFG_ACT_REM_R.create("T");
				MCQueryApiBuilder abortL_bldr = MCQueryApiBuilder.create(t);
				abortL_bldr.setSet(t.mfg_sts_typ);
				dbUpdateKey("MSBCL6010_MST_MFG_ACT_REM_U02", abortL, abortL_bldr);
			}
		}

		/**
		 * 「改訂履歴データ更新リスト」テーブルにデータを登録サービス呼び出し
		 */
		protected void callRevDataIns01() {
			MCList<MST_MFG_INST_R> wkL = MCList.create(MST_MFG_INST_R.class);
			for (MfgInstTblReg_Upd01_DtlMfgR hdrR : up0()) {
				MST_MFG_INST_R wkR = MST_MFG_INST_R.create();
				wkR.mfg_inst_no(hdrR.mfg_inst_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_MFG_INST_R.create("T"));
			dbWkDelete("MSBCL6010_MSW_MFG_INST_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBCL6010_MSW_MFG_INST_I01",
					wkL.groupBy(wkL.createRow().getKeyColumn()), wkL_bldr.getBaseDbc());
			
			MCList<MST_MFG_INST_R> hdrL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder hdrL_bldr = MCQueryApiBuilder.create(t);
			MSW_MFG_INST_KEY_R w = MSW_MFG_INST_KEY_R.create("W");
			hdrL_bldr.addInnerJoin(w, bracket( t.mfg_inst_no.eq(w.mfg_inst_no)));
			dbSelect("MSBCL6010_MST_MFG_INST_S01", hdrL, hdrL_bldr);
			
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			for (MST_MFG_INST_R hdrR : hdrL) {
				RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
				opeR.rev_data_src_no(hdrR.mfg_inst_no());
				opeR.rev_no(hdrR.mfg_inst_rev());
				opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_MFG_INST.value());
				ope.up0().add(opeR);
			}
			ope.exec();
		}

		/**
		 * 上り電文の製造指図から製造実績残のＤＢコンテナへのマッパー
		 * @return
		 */
		protected Map_MST_MFG_ACT_REM_R_MfgInstTblReg_Upd01_DtlMfgR<MST_MFG_ACT_REM_R,MfgInstTblReg_Upd01_DtlMfgR> createMap_MST_MFG_ACT_REM_R_MfgInstTblReg_Upd01_DtlMfgR() {
			return new Map_MST_MFG_ACT_REM_R_MfgInstTblReg_Upd01_DtlMfgR<MST_MFG_ACT_REM_R, MfgInstTblReg_Upd01_DtlMfgR>();
		}

		public class Map_MST_MFG_ACT_REM_R_MfgInstTblReg_Upd01_DtlMfgR<D extends MST_MFG_ACT_REM_R, S extends MfgInstTblReg_Upd01_DtlMfgR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_MFG_ACT_REM_R.$mfg_inst_no, MfgInstTblReg_Upd01_DtlMfgR.$mfg_inst_no);
				addColumnPathMap(MST_MFG_ACT_REM_R.$mfg_sts_typ, MfgInstTblReg_Upd01_DtlMfgR.$mfg_sts_typ);
				addColumnPathMap(MST_MFG_ACT_REM_R.$itm_mfg_inst_no, MfgInstTblReg_Upd01_DtlMfgR.$itm_mfg_inst_no);
				addColumnPathMap(MST_MFG_ACT_REM_R.$base_unit_mfg_rem_qty, MfgInstTblReg_Upd01_DtlMfgR.$base_unit_inst_qty); //製造残数量には製造指図の製造指図数量を設定
				addColumnPathMap(MST_MFG_ACT_REM_R.$sub_char1, MfgInstTblReg_Upd01_DtlMfgR.$rem_sub_char1);
				addColumnPathMap(MST_MFG_ACT_REM_R.$sub_char2, MfgInstTblReg_Upd01_DtlMfgR.$rem_sub_char2);
				addColumnPathMap(MST_MFG_ACT_REM_R.$sub_char3, MfgInstTblReg_Upd01_DtlMfgR.$rem_sub_char3);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.div_seq(MCNumber.ZERO); //分割連番はゼロ固定
				dest.base_unit_mfg_qty(MCNumber.ZERO); //製造着手数量はゼロ固定
				dest.base_unit_mfg_abort_qty(MCNumber.ZERO); //製造打切数量はゼロ固定
			}
		}
	}

	/**
	 * MfgInstTblReg_Upd02オペレーション.<p>
	 *
	 * 品目製造指図の追加・更新・削除を行う<br>
	 */
	public class MfgInstTblReg_Upd02 extends MSBCL_MfgInstTblRegService_MC_A.MfgInstTblReg_Upd02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 品目製造指図の登録
			itmMfgInstReg();
		}

		/**
		 * 品目製造指図の登録
		 */
		protected void itmMfgInstReg() {
			MCList<MST_ITM_MFG_INST_R> insL = MCList.create(MST_ITM_MFG_INST_R.class);
			MCList<MST_ITM_MFG_INST_R> updL = MCList.create(MST_ITM_MFG_INST_R.class);
			MCList<MST_ITM_MFG_INST_R> delL = MCList.create(MST_ITM_MFG_INST_R.class);
			MCList<MST_ITM_MFG_INST_R> abortdelL = MCList.create(MST_ITM_MFG_INST_R.class);

			for (MfgInstTblReg_Upd02_DtlItmMfgR r : up0()) {
				if (r.inst_abort_flg() || (r.old_inst_abort_flg() && !r.inst_abort_flg())) {
					// 打切ＦＬＧがオンの場合（打切）、または打切ＦＬＧがオンからオフに変更された場合（打切取消）は更新不可のため、何もしない
					// 打切ＦＬＧがオンからオフに変更された場合は、ロットNO、サブロットNOも更新する
					if(!r.inst_abort_flg()) {
						abortdelL.add(r.itm_mfg_inst());
					}
				}
				else if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					insL.add(r.itm_mfg_inst());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					updL.add(r.itm_mfg_inst());
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.can_flg(true);
					delL.add(r.itm_mfg_inst());
				}
				// 初回製造指図ＮＯと異なる場合はデータ更新区分にNULLが設定される。その場合は何も処理されない。
			}
			MST_ITM_MFG_INST_R t = MST_ITM_MFG_INST_R.create("T");
			// 新規追加
			if (!insL.isEmpty()) {
				dbInsertEx("MSBCL6010_MST_ITM_MFG_INST_I01", insL, MCQueryApiBuilder.create(t));
			}
			// 更新
			if (!updL.isEmpty()) {
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				editUpdSetStmt(updL, t, updL_bldr);
				dbUpdateKey("MSBCL6010_MST_ITM_MFG_INST_U01", updL, updL_bldr);
			}
			// 削除（論理削除）
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(t);
				editDelSetStmt(delL, t, delL_bldr);
				dbUpdateKey("MSBCL6010_MST_ITM_MFG_INST_U02", delL, delL_bldr);
			}
			// 打ち切り取り消し
			if (!abortdelL.isEmpty()) {
				MCQueryApiBuilder abortdelL_bldr = MCQueryApiBuilder.create(t);
				editAbortDelSetStmt(abortdelL, t, abortdelL_bldr);
				dbUpdateKey("MSBCL6010_MST_ITM_MFG_INST_U03", abortdelL, abortdelL_bldr);
			}
		}

		/**
		 * 更新時のset句の編集
		 */
		protected void editUpdSetStmt(MCList<MST_ITM_MFG_INST_R> updL, MST_ITM_MFG_INST_R t, MCQueryApiBuilder updL_bldr) {
			// 品目、枝番は画面から変更できないため更新対象としない。
			// 計画外指図ＦＬＧ、計画外実績ＦＬＧ、取消ＦＬＧも変更される項目ではないため、更新対象としない。
			updL_bldr.setSet(t.itm_ord_no, t.frst_mfg_inst_no,
					t.mfg_mtd_typ, t.sppl_cd,
					t.oper_ptn, t.bom_ptn,
					t.base_unit_yield_qty,
					t.base_unit_inst_qty,
					t.base_unit_cd, t.master_dt,
					t.lot_no, t.sublot_no,
					t.sno1, t.sno2,
					t.sno3, t.sno4,
					t.strg_loc_cd, t.strg_str_ln_cd,
					t.mfg_loc_cd, t.mfg_str_ln_cd,
					t.wg_cd, t.site_cd,
					t.itm_lower_yield,
					t.itm_std_yield, t.itm_upper_yield,
					t.sub_char1, t.sub_char2,
					t.sub_char3);
		}

		/**
		 * 論理削除時のset句の編集
		 */
		protected void editDelSetStmt(MCList<MST_ITM_MFG_INST_R> delL, MST_ITM_MFG_INST_R t, MCQueryApiBuilder delL_bldr) {
			// 取消ＦＬＧのみを更新対象とする
			delL_bldr.setSet(t.can_flg);
		}
		protected void editAbortDelSetStmt(MCList<MST_ITM_MFG_INST_R> abortdelL, MST_ITM_MFG_INST_R t, MCQueryApiBuilder abortdelL_bldr) {
			abortdelL_bldr.setSet(t.lot_no, t.sublot_no);
		}
	}

	/**
	 * MfgInstTblReg_Upd03オペレーション.<p>
	 *
	 * 工程指図の追加・更新・削除を行う<br>
	 */
	public class MfgInstTblReg_Upd03 extends MSBCL_MfgInstTblRegService_MC_A.MfgInstTblReg_Upd03 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 工程指図の登録
			operInstReg();
			// 工程実績残テーブルの登録
			operActRemReg();
		}
		
		/**
		 * 工程指図の登録
		 */
		protected void operInstReg() {
			MCList<MST_OPER_INST_R> insL = MCList.create(MST_OPER_INST_R.class);
			MCList<MST_OPER_INST_R> updL = MCList.create(MST_OPER_INST_R.class);
			MCList<MST_OPER_INST_R> delL = MCList.create(MST_OPER_INST_R.class);
			MCList<MST_OPER_INST_R> abortL = MCList.create(MST_OPER_INST_R.class);
			MCList<MST_OPER_INST_R> yetUpdL = MCList.create(MST_OPER_INST_R.class);

			for (MfgInstTblReg_Upd03_DtlOperR r : up0()) {
				if (r.inst_abort_flg() || (r.old_inst_abort_flg() && !r.inst_abort_flg())) {
					// 打切ＦＬＧがオンの場合（打切）、または打切ＦＬＧがオンからオフに変更された場合（打切取消）は画面項目は変更不可のため
					// 打切ＦＬＧのみを更新対象とする
					abortL.add(r.oper_inst());
				}
				else if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					// 新規追加
					insL.add(r.oper_inst());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					// 更新
					if (r.not_frst_inst_can_flg()) {
						// 初回以外の製造指図の取消の場合、製造指図ＮＯをクリア
						MST_OPER_INST_R tmp = MST_OPER_INST_R.create();
						tmp.mfg_inst_no(null);
						tmp.oper_inst_no(r.oper_inst_no());
						yetUpdL.add(tmp);
					}
					else {
						updL.add(r.oper_inst());
					}
				}
				// 削除
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.can_flg(true);
					delL.add(r.oper_inst());
				}
			}
			
			MST_OPER_INST_R t = MST_OPER_INST_R.create("T");
			// 新規追加
			if (!insL.isEmpty()) {
				dbInsertEx("MSBCL6010_MST_OPER_INST_I01", insL, MCQueryApiBuilder.create(t));
			}
			// 更新
			if (!updL.isEmpty()) {
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				editUpdSetStmt(updL, t, updL_bldr);
				dbUpdateKey("MSBCL6010_MST_OPER_INST_U01", updL, updL_bldr);
			}
			// 更新（打切ＦＬＧ）
			if (!abortL.isEmpty()) {
				MCQueryApiBuilder abortL_bldr = MCQueryApiBuilder.create(t);
				// 打切時・打切取消時にもmes_flgを更新する
				abortL_bldr.setSet(t.oper_abort_flg, t.mes_flg);
				dbUpdateKey("MSBCL6010_MST_OPER_INST_U02", abortL, abortL_bldr);
			}
			// 削除（論理削除）
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(t);
				editDelSetStmt(delL, t, delL_bldr);
				dbUpdateKey("MSBCL6010_MST_OPER_INST_U03", delL, delL_bldr);
			}
			// 更新（未指図に戻す）
			if (!yetUpdL.isEmpty()) {
				MCQueryApiBuilder yetUpdL_bldr = MCQueryApiBuilder.create(t);
				yetUpdL_bldr.setSet(t.mfg_inst_no);
				dbUpdateKey("MSBCL6010_MST_OPER_INST_U04", yetUpdL, yetUpdL_bldr);
			}
		}

		/**
		 * 更新時のset句の編集
		 */
		protected void editUpdSetStmt(MCList<MST_OPER_INST_R> updL, MST_OPER_INST_R t, MCQueryApiBuilder updL_bldr) {
			// 品目製造指図ＮＯ、工程オーダＮＯ、取消ＦＬＧは更新対象としない
			updL_bldr.setSet(t.mfg_inst_no, t.disp_seq,
					t.oper_cd, t.oper_seq,
					t.st_schd_tm, t.end_schd_tm,
					t.oper_loc_cd, t.oper_str_ln_cd,
					t.base_unit_qty, t.base_unit_cd,
					t.oper_std_qty, t.oper_conv_qty,
					t.oper_unit_cd, t.unschd_inst_flg,
					t.unschd_act_flg, t.bkf_flg,
					t.wk_cost_calc_flg, t.oper_inst_grp,
					t.usr_cd, t.oper_lt,
					t.oper_lt_add_qty, t.oper_offst_typ,
					t.oper_offst, t.oper_offst_add_qty,
					t.lmt_fr_dt_flg, t.oper_lower_yield,
					t.oper_std_yield, t.oper_upper_yield,
					t.wip_rate, t.yield_oper_flg,
					t.yield_oper_ratio, t.oper_abort_flg,
					t.intr_rmrks, t.inst_rpt_rmrks,t.oper_rsrc,
					t.mes_flg, t.sub_char1,
					t.sub_char2, t.sub_char3);
		}

		/**
		 * 論理削除時のset句の編集
		 */
		protected void editDelSetStmt(MCList<MST_OPER_INST_R> delL, MST_OPER_INST_R t, MCQueryApiBuilder delL_bldr) {
			// 取消ＦＬＧのみを更新対象とする
			delL_bldr.setSet(t.can_flg);
		}

		/**
		 * 工程実績残テーブルの登録
		 * 
		 */
		protected void operActRemReg() {
			MCList<MST_OPER_ACT_REM_R> insL = MCList.create(MST_OPER_ACT_REM_R.class);
			MCList<MST_OPER_ACT_REM_R> updL = MCList.create(MST_OPER_ACT_REM_R.class);
			MCList<MST_OPER_ACT_REM_R> stsUpdL = MCList.create(MST_OPER_ACT_REM_R.class);
	
			for (MfgInstTblReg_Upd03_DtlOperR r : up0()) {
				
				// 上り電文の工程指図から工程実績残のＤＢコンテナへ値を設定
				MST_OPER_ACT_REM_R remR = MST_OPER_ACT_REM_R.create();
				copy(remR, r, createMap_MST_OPER_ACT_REM_R_MfgInstTblReg_Upd03_DtlOperR());
				
				if (r.inst_abort_flg()) {
					// 打切ＦＬＧがオンの場合（打切）は製造指図進捗状況を完了にして更新
					remR.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
					stsUpdL.add(remR);
				}
				else if (r.old_inst_abort_flg() && !r.inst_abort_flg()) {
					if(MAC_MFG_INST_UNIT_TYP.isOPER(r.mfg_inst_unit_typ()) && r.not_header_inst_abort_flg()) {
						// 打切ＦＬＧがオンからオフに変更された場合（打切取消）は製造指図状況を未指図で更新
						remR.mfg_sts_typ(MSC_MFG_STS_TYP.YET.value());
					} else {
						// 打切ＦＬＧがオンからオフに変更された場合（打切取消）は製造指図状況をヘッダの値で更新
						remR.mfg_sts_typ(r.hdr_mfg_sts_typ());
					}
					stsUpdL.add(remR);
				}
				else if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					insL.add(remR);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					if (r.not_frst_inst_can_flg()) {
						// 初回以外の製造指図の取消の場合、ステータスのみを更新（未指図）
						stsUpdL.add(remR);
					}
					else {
						updL.add(remR);
					}
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					// 何もしない
				}
			}
			// 新規追加
			if (!insL.isEmpty()) {
				dbInsertEx("MSBCL6010_MST_OPER_ACT_REM_I01", insL,
						MCQueryApiBuilder.create(MST_OPER_ACT_REM_R.create("T")));
			}
			// 更新
			if (!updL.isEmpty()) {
				dbUpdateKey("MSBCL6010_MST_OPER_ACT_REM_U01", updL,
						MCQueryApiBuilder.create(MST_OPER_ACT_REM_R.create("T")));
			}
			// 打切・打切取消・未指図に更新
			if (!stsUpdL.isEmpty()) {
				MST_OPER_ACT_REM_R t = MST_OPER_ACT_REM_R.create("T");
				MCQueryApiBuilder stsUpdL_bldr = MCQueryApiBuilder.create(t);
				stsUpdL_bldr.setSet(t.mfg_sts_typ);
				dbUpdateKey("MSBCL6010_MST_OPER_ACT_REM_U02", stsUpdL, stsUpdL_bldr);
			}
		}

		/**
		 * 上り電文の工程指図から工程実績残のＤＢコンテナへのマッパー
		 * @return
		 */
		protected Map_MST_OPER_ACT_REM_R_MfgInstTblReg_Upd03_DtlOperR<MST_OPER_ACT_REM_R,MfgInstTblReg_Upd03_DtlOperR> createMap_MST_OPER_ACT_REM_R_MfgInstTblReg_Upd03_DtlOperR() {
			return new Map_MST_OPER_ACT_REM_R_MfgInstTblReg_Upd03_DtlOperR<MST_OPER_ACT_REM_R, MfgInstTblReg_Upd03_DtlOperR>();
		}

		public class Map_MST_OPER_ACT_REM_R_MfgInstTblReg_Upd03_DtlOperR<D extends MST_OPER_ACT_REM_R, S extends MfgInstTblReg_Upd03_DtlOperR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_OPER_ACT_REM_R.$oper_inst_no, MfgInstTblReg_Upd03_DtlOperR.$oper_inst_no);
				addColumnPathMap(MST_OPER_ACT_REM_R.$mfg_sts_typ, MfgInstTblReg_Upd03_DtlOperR.$mfg_sts_typ);
				addColumnPathMap(MST_OPER_ACT_REM_R.$mfg_inst_no, MfgInstTblReg_Upd03_DtlOperR.$mfg_inst_no);
				addColumnPathMap(MST_OPER_ACT_REM_R.$itm_mfg_inst_no, MfgInstTblReg_Upd03_DtlOperR.$itm_mfg_inst_no);
				addColumnPathMap(MST_OPER_ACT_REM_R.$base_unit_rem_qty, MfgInstTblReg_Upd03_DtlOperR.$base_unit_qty); //残数量には基準単位数量
				addColumnPathMap(MST_OPER_ACT_REM_R.$sub_char1, MfgInstTblReg_Upd03_DtlOperR.$rem_sub_char1);
				addColumnPathMap(MST_OPER_ACT_REM_R.$sub_char2, MfgInstTblReg_Upd03_DtlOperR.$rem_sub_char2);
				addColumnPathMap(MST_OPER_ACT_REM_R.$sub_char3, MfgInstTblReg_Upd03_DtlOperR.$rem_sub_char3);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.div_seq(MCNumber.ZERO); //分割連番はゼロ固定
				dest.base_unit_qty(MCNumber.ZERO); //着手数量はゼロ固定
				dest.base_unit_abort_qty(MCNumber.ZERO); //打切数量はゼロ固定
			}
		}
	}

	/**
	 * MfgInstTblReg_Upd04オペレーション.<p>
	 *
	 * 出来高予定の追加・更新・削除を行う<br>
	 */
	public class MfgInstTblReg_Upd04 extends MSBCL_MfgInstTblRegService_MC_A.MfgInstTblReg_Upd04 {

		protected MCList<MfgInstTblReg_Upd04_DtlYieldR> _up0_seq; // up0から表示順のみ更新するレコードを抽出したリスト
		protected MCList<MfgInstTblReg_Upd04_DtlYieldR> _up0; // up0から表示順のみ更新以外を抽出したリスト
		protected MCList<MfgInstTblReg_Upd04_DtlYieldR> _up0_intnl; // _up0から内製のレコードを抽出したリスト
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			if (up0().isEmpty()) {
				return;
			}
			doMasterCache();
			// 上り電文の編集
			editUp();
			// 出来高予定の登録
			yieldSchdReg();
			// 出来高実績残テーブルの登録
			yieldActRemReg();
			// 検査予定の登録
			callInsp();
			// 受払予定の登録
			callIoSchd();
			// ロットの期限等の更新
			callLotUpd();
			
			// 下り電文の設定
			setDown();
		}

		protected FXUCL_MCDbcCache<MAVM_ITM_UNIT_R> _itmUnit;
		protected void doMasterCache() {
			MAVM_ITM_UNIT_R itmUnit = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder itmUnitL_bldr = MCQueryApiBuilder.create(itmUnit);
			itmUnitL_bldr.setSelect(itmUnit.pack_flg);
			_itmUnit = new FXUCL_MCDbcCache<MAVM_ITM_UNIT_R>(itmUnitL_bldr, up0(),
					MfgInstTblReg_Upd04_DtlYieldR.$itm_cd, MfgInstTblReg_Upd04_DtlYieldR.$itm_sub1,
					MfgInstTblReg_Upd04_DtlYieldR.$itm_sub2, MfgInstTblReg_Upd04_DtlYieldR.$itm_sub3,
					MfgInstTblReg_Upd04_DtlYieldR.$trd_unit_cd);
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {

			// 表示順のみ更新するレコードとそれ以外を分割する
			_up0_seq = MCList.create(MfgInstTblReg_Upd04_DtlYieldR.class); // up0から表示順のみ更新するレコードを抽出したリスト
			_up0 = MCList.create(MfgInstTblReg_Upd04_DtlYieldR.class); // up0から表示順のみ更新以外を抽出したリスト
			_up0_intnl = MCList.create(MfgInstTblReg_Upd04_DtlYieldR.class); // _up0から内製のレコードを抽出したリスト

			for (MfgInstTblReg_Upd04_DtlYieldR r : up0()) {
				// データ更新区分が「更新」かつ表示順のみ更新ＦＬＧがオンの場合、表示順のみ更新対象とする
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) && r.disp_seq_upd_flg()) {
					_up0_seq.add(r);
				}
				else {
					_up0.add(r);
					if (MSC_MFG_MTD_TYP.isINTNL(r.mfg_mtd_typ())) {
						_up0_intnl.add(r);
					}
				}
			}			

			// 出来高予定ＮＯの発番（発番システム区分）
			int cacheSize = _up0.subList(MfgInstTblReg_Upd04_DtlYieldR.$data_crud_typ,
					MAC_DATA_CRUD_TYP.CRT.value()).size();
			doSeqCache(MSC_NUM_SYS_TYP.YLDSCHD, cacheSize);

			for (MfgInstTblReg_Upd04_DtlYieldR r : _up0) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					// 出来高予定ＮＯをキャッシュから取得
					r.yield_schd_no(getStrSeq(MSC_NUM_SYS_TYP.YLDSCHD));
				}
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.yield_typ(MAC_YIELD_TYP.GOOD.value()); //出来高区分：良品
				}
			}
			for (MfgInstTblReg_Upd04_DtlYieldR r : _up0_seq) {
				r.yield_typ(MAC_YIELD_TYP.GOOD.value()); //出来高区分：良品
			}
		}

		/**
		 * 出来高予定の登録
		 */
		protected void yieldSchdReg() {
			MCList<MST_YIELD_SCHD_R> insL = MCList.create(MST_YIELD_SCHD_R.class);
			MCList<MST_YIELD_SCHD_R> updL = MCList.create(MST_YIELD_SCHD_R.class);
			MCList<MST_YIELD_SCHD_R> updSeqL = MCList.create(MST_YIELD_SCHD_R.class);
			MCList<MST_YIELD_SCHD_R> delL = MCList.create(MST_YIELD_SCHD_R.class);
			MCList<MST_YIELD_SCHD_R> yetUpdL = MCList.create(MST_YIELD_SCHD_R.class);
			
			for (MfgInstTblReg_Upd04_DtlYieldR r : _up0) {
				if (r.inst_abort_flg() || (r.old_inst_abort_flg() && !r.inst_abort_flg())) {
					// 打切ＦＬＧがオンの場合（打切）、または打切ＦＬＧがオンからオフに変更された場合（打切取消）は更新不可のため、何もしない
					continue;
				}
	
				// 新規追加
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					insL.add(r.yield_schd());
				}
				// 更新
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					if (r.not_frst_inst_can_flg()) {
						// 初回以外の製造指図の取消の場合、製造指図ＮＯをクリア
						MST_YIELD_SCHD_R tmp = MST_YIELD_SCHD_R.create();
						tmp.mfg_inst_no(null);
						tmp.yield_schd_no(r.yield_schd_no());
						yetUpdL.add(tmp);
					}
					else {
						updL.add(r.yield_schd());
					}
				}
				// 削除
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.can_flg(true);
					delL.add(r.yield_schd());
				}
			}
			
			for (MfgInstTblReg_Upd04_DtlYieldR r : _up0_seq) {
				// 表示順のみ更新
				updSeqL.add(r.yield_schd());
			}
			
			MST_YIELD_SCHD_R t = MST_YIELD_SCHD_R.create("T");
			// 新規追加
			if (!insL.isEmpty()) {
				complItm(insL);
				dbInsertEx("MSBCL6010_MST_YIELD_SCHD_I01", insL, MCQueryApiBuilder.create(t));
			}
			// 更新
			if (!updL.isEmpty()) {
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				complItm(updL);
				editUpdSetStmt(updL, t, updL_bldr);
				dbUpdateKey("MSBCL6010_MST_YIELD_SCHD_U01", updL, updL_bldr);
			}
			// 表示順のみ更新
			if (!updSeqL.isEmpty()) {
				MCQueryApiBuilder updSeqL_bldr = MCQueryApiBuilder.create(t);
				complItm(updSeqL);
				editUpdSetStmtSeq(updSeqL, t, updSeqL_bldr);
				dbUpdateKey("MSBCL6010_MST_YIELD_SCHD_U02", updSeqL, updSeqL_bldr);
			}
			// 削除（論理削除）
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(t);
				editDelSetStmt(delL, t, delL_bldr);
				dbUpdateKey("MSBCL6010_MST_YIELD_SCHD_U03", delL, delL_bldr);
			}
			// 更新（未指図に戻す）
			if (!yetUpdL.isEmpty()) {
				MCQueryApiBuilder yetUpdL_bldr = MCQueryApiBuilder.create(t);
				yetUpdL_bldr.setSet(t.mfg_inst_no);
				dbUpdateKey("MSBCL6010_MST_YIELD_SCHD_U04", yetUpdL, yetUpdL_bldr);
			}
		}
		
		/**
		 * 上り電文対象でない項目を補完する
		 * @param yieldSchdL
		 */
		protected void complItm(MCList<MST_YIELD_SCHD_R> yieldSchdL) {
			yieldSchdL.setStringNE(MST_YIELD_SCHD_R.$bkf_typ, null);
			yieldSchdL.setNumberNE(MST_YIELD_SCHD_R.$par_inst_qty, null);
			yieldSchdL.setNumberNE(MST_YIELD_SCHD_R.$chd_inpt_qty, null);
			yieldSchdL.setNumberNE(MST_YIELD_SCHD_R.$chd_rqmt_qty, null);
			yieldSchdL.setNumberNE(MST_YIELD_SCHD_R.$fxd_chd_rqmt_qty, null);
		}

		/**
		 * 更新時のset句の編集
		 */
		protected void editUpdSetStmt(MCList<MST_YIELD_SCHD_R> updL, MST_YIELD_SCHD_R t, MCQueryApiBuilder updL_bldr) {
			// 品目製造指図ＮＯ、工程指図ＮＯ、出来高区分、取消ＦＬＧは更新対象としない
			updL_bldr.setSet(t.mfg_inst_no,
					t.schd_tm, t.itm_cd,
					t.itm_sub1, t.itm_sub2, t.itm_sub3,
					t.trd_unit_yield_qty, t.trd_unit_cd,
					t.base_unit_yield_qty, t.base_unit_cd,
					t.lot_no, t.sublot_no, t.sno1,
					t.sno2, t.sno3, t.sno4,
					t.strg_loc_cd, t.strg_str_ln_cd,
					t.bkf_typ, t.par_inst_qty,
					t.chd_inpt_qty, t.chd_rqmt_qty,
					t.fxd_chd_rqmt_qty, t.disp_seq,
					t.intr_rmrks, t.inst_rpt_rmrks, t.insp_cnt_rmrks,
					t.sub_char1, t.sub_char2, t.sub_char3);
		}
		
		/**
		 * 表示順のみ更新時のset句の編集
		 */

		protected void editUpdSetStmtSeq(MCList<MST_YIELD_SCHD_R> updL, MST_YIELD_SCHD_R t, MCQueryApiBuilder updL_bldr) {
			updL_bldr.setSet(t.disp_seq);
		}
		
		/**
		 * 論理削除時のset句の編集
		 */
		protected void editDelSetStmt(MCList<MST_YIELD_SCHD_R> delL, MST_YIELD_SCHD_R t, MCQueryApiBuilder delL_bldr) {
			// 取消ＦＬＧのみを更新対象とする
			delL_bldr.setSet(t.can_flg);
		}
		
		/**
		 * 出来高実績残テーブルの登録
		 */
		protected void yieldActRemReg() {
			MCList<MST_YIELD_ACT_REM_R> insL = MCList.create(MST_YIELD_ACT_REM_R.class);
			MCList<MST_YIELD_ACT_REM_R> updL = MCList.create(MST_YIELD_ACT_REM_R.class);
			MCList<MST_YIELD_ACT_REM_R> stsUpdL = MCList.create(MST_YIELD_ACT_REM_R.class);
			for (MfgInstTblReg_Upd04_DtlYieldR r : _up0) {
				// 上り電文の出来高予定から出来高実績残のＤＢコンテナへ値を設定
				MST_YIELD_ACT_REM_R remR = MST_YIELD_ACT_REM_R.create();
				copy(remR, r, createMap_MST_YIELD_ACT_REM_R_MfgInstTblReg_Upd04_DtlYieldR());
				
				if (r.inst_abort_flg()) {
					// 打切ＦＬＧがオンの場合（打切）は製造指図進捗状況を完了にして更新
					remR.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
					stsUpdL.add(remR);
				}
				else if (r.old_inst_abort_flg() && !r.inst_abort_flg()) {
					if(MAC_MFG_INST_UNIT_TYP.isOPER(r.mfg_inst_unit_typ()) && r.not_header_inst_abort_flg()) {
						// 打切ＦＬＧがオンからオフに変更された場合（打切取消）は製造指図状況を未指図で更新
						remR.mfg_sts_typ(MSC_MFG_STS_TYP.YET.value());
					} else {
						// 打切ＦＬＧがオンからオフに変更された場合（打切取消）は製造指図状況をヘッダの値で更新
						remR.mfg_sts_typ(r.hdr_mfg_sts_typ());
					}
					stsUpdL.add(remR);
				}
				else if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					insL.add(remR);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					if (r.not_frst_inst_can_flg()) {
						// 初回以外の製造指図の取消の場合、ステータスのみを更新（未指図）
						stsUpdL.add(remR);
					}
					else {
						updL.add(remR);
					}
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					// 何もしない
				}
			}
			// 新規追加
			if (!insL.isEmpty()) {
				dbInsertEx("MSBCL6010_MST_YIELD_ACT_REM_I01", insL,
						MCQueryApiBuilder.create(MST_YIELD_ACT_REM_R.create("T")));
			}
			// 更新
			if (!updL.isEmpty()) {
				dbUpdateKey("MSBCL6010_MST_YIELD_ACT_REM_U01", updL,
						MCQueryApiBuilder.create(MST_YIELD_ACT_REM_R.create("T")));
			}
			// 打切・打切取消・未指図に更新
			if (!stsUpdL.isEmpty()) {
				MST_YIELD_ACT_REM_R t = MST_YIELD_ACT_REM_R.create("T");
				MCQueryApiBuilder stsUpdL_bldr = MCQueryApiBuilder.create(t);
				stsUpdL_bldr.setSet(t.mfg_sts_typ);
				dbUpdateKey("MSBCL6010_MST_YIELD_ACT_REM_U02", stsUpdL, stsUpdL_bldr);
			}
		}

		/**
		 * 上り電文の出来高予定から出来高実績残のＤＢコンテナへのマッパー
		 * @return
		 */
		protected Map_MST_YIELD_ACT_REM_R_MfgInstTblReg_Upd04_DtlYieldR<MST_YIELD_ACT_REM_R,MfgInstTblReg_Upd04_DtlYieldR> createMap_MST_YIELD_ACT_REM_R_MfgInstTblReg_Upd04_DtlYieldR() {
			return new Map_MST_YIELD_ACT_REM_R_MfgInstTblReg_Upd04_DtlYieldR<MST_YIELD_ACT_REM_R, MfgInstTblReg_Upd04_DtlYieldR>();
		}

		public class Map_MST_YIELD_ACT_REM_R_MfgInstTblReg_Upd04_DtlYieldR<D extends MST_YIELD_ACT_REM_R, S extends MfgInstTblReg_Upd04_DtlYieldR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_YIELD_ACT_REM_R.$yield_schd_no, MfgInstTblReg_Upd04_DtlYieldR.$yield_schd_no);
				addColumnPathMap(MST_YIELD_ACT_REM_R.$mfg_sts_typ, MfgInstTblReg_Upd04_DtlYieldR.$mfg_sts_typ);
				addColumnPathMap(MST_YIELD_ACT_REM_R.$mfg_inst_no, MfgInstTblReg_Upd04_DtlYieldR.$mfg_inst_no);
				addColumnPathMap(MST_YIELD_ACT_REM_R.$itm_mfg_inst_no, MfgInstTblReg_Upd04_DtlYieldR.$itm_mfg_inst_no);
				addColumnPathMap(MST_YIELD_ACT_REM_R.$oper_inst_no, MfgInstTblReg_Upd04_DtlYieldR.$oper_inst_no);
				addColumnPathMap(MST_YIELD_ACT_REM_R.$yield_typ, MfgInstTblReg_Upd04_DtlYieldR.$yield_typ);
				addColumnPathMap(MST_YIELD_ACT_REM_R.$trd_unit_yield_rem_qty, MfgInstTblReg_Upd04_DtlYieldR.$trd_unit_yield_qty); //残数量には出来高数量
				addColumnPathMap(MST_YIELD_ACT_REM_R.$base_unit_yield_rem_qty, MfgInstTblReg_Upd04_DtlYieldR.$base_unit_yield_qty); //残数量には出来高数量
				addColumnPathMap(MST_YIELD_ACT_REM_R.$stk_lst_prnt_flg, MfgInstTblReg_Upd04_DtlYieldR.$stk_lst_prnt_flg);
				addColumnPathMap(MST_YIELD_ACT_REM_R.$sub_char1, MfgInstTblReg_Upd04_DtlYieldR.$rem_sub_char1);
				addColumnPathMap(MST_YIELD_ACT_REM_R.$sub_char2, MfgInstTblReg_Upd04_DtlYieldR.$rem_sub_char2);
				addColumnPathMap(MST_YIELD_ACT_REM_R.$sub_char3, MfgInstTblReg_Upd04_DtlYieldR.$rem_sub_char3);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.div_seq(MCNumber.ZERO); //分割連番はゼロ固定
				dest.trd_unit_yield_qty(MCNumber.ZERO); //取引単位着手数量はゼロ固定
				dest.base_unit_yield_qty(MCNumber.ZERO); //基準単位着手数量はゼロ固定
				dest.trd_unit_yield_abort_qty(MCNumber.ZERO); //取引単位出来高打切数量はゼロ固定
				dest.base_unit_yield_abort_qty(MCNumber.ZERO); //基準単位出来高打切数量はゼロ固定
			}
		}

		/**
		 * 検査予定登録サービス（検査関連データ登録）の呼出
		 */
		protected void callInsp() {
			
			// 外注は処理対象外のため、内製データのみを処理対象とする
			if (!_up0_intnl.isEmpty()) {
				// 検査予定登録オペレーションの実行
				MSBFL_InspSchdService.InspSchd_Upd01 inspUpd = MSBFL_InspSchdService.crtInspSchd_Upd01();
				addAll(inspUpd.up0(), _up0_intnl, createMap_InspSchd_Upd01_CndR_MfgInstTblReg_Upd04_DtlYieldR());
				inspUpd.exec();
			}
		}

		protected Map_InspSchd_Upd01_CndR_MfgInstTblReg_Upd04_DtlYieldR<InspSchd_Upd01_CndR,MfgInstTblReg_Upd04_DtlYieldR> createMap_InspSchd_Upd01_CndR_MfgInstTblReg_Upd04_DtlYieldR() {
			return new Map_InspSchd_Upd01_CndR_MfgInstTblReg_Upd04_DtlYieldR<InspSchd_Upd01_CndR, MfgInstTblReg_Upd04_DtlYieldR>();
		}

		public class Map_InspSchd_Upd01_CndR_MfgInstTblReg_Upd04_DtlYieldR<D extends InspSchd_Upd01_CndR, S extends MfgInstTblReg_Upd04_DtlYieldR> extends MCRowMapper<D,S>{

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Upd01_CndR.$src_no1, MfgInstTblReg_Upd04_DtlYieldR.$mfg_inst_no); //作成元ＮＯ１には製造指図ＮＯを設定
				addColumnPathMap(InspSchd_Upd01_CndR.$src_no2, MfgInstTblReg_Upd04_DtlYieldR.$itm_mfg_inst_no); //作成元ＮＯ２には品目製造指図ＮＯを設定
				addColumnPathMap(InspSchd_Upd01_CndR.$src_no3, MfgInstTblReg_Upd04_DtlYieldR.$yield_schd_no); //作成元ＮＯ３には出来高予定ＮＯを設定
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_cd, MfgInstTblReg_Upd04_DtlYieldR.$itm_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_sub1, MfgInstTblReg_Upd04_DtlYieldR.$itm_sub1);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_sub2, MfgInstTblReg_Upd04_DtlYieldR.$itm_sub2);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_sub3, MfgInstTblReg_Upd04_DtlYieldR.$itm_sub3);
				addColumnPathMap(InspSchd_Upd01_CndR.$loc_cd, MfgInstTblReg_Upd04_DtlYieldR.$strg_loc_cd); //場所ＣＤには格納場所ＣＤ
				addColumnPathMap(InspSchd_Upd01_CndR.$str_ln_cd, MfgInstTblReg_Upd04_DtlYieldR.$strg_str_ln_cd); //棚・ラインＣＤには格納棚・ラインＣＤ
				addColumnPathMap(InspSchd_Upd01_CndR.$lot_no, MfgInstTblReg_Upd04_DtlYieldR.$lot_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$sublot_no, MfgInstTblReg_Upd04_DtlYieldR.$sublot_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno1, MfgInstTblReg_Upd04_DtlYieldR.$sno1);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno2, MfgInstTblReg_Upd04_DtlYieldR.$sno2);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno3, MfgInstTblReg_Upd04_DtlYieldR.$sno3);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno4, MfgInstTblReg_Upd04_DtlYieldR.$sno4);
				addColumnPathMap(InspSchd_Upd01_CndR.$mfg_loc_cd, MfgInstTblReg_Upd04_DtlYieldR.$mfg_loc_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$gr_tm, MfgInstTblReg_Upd04_DtlYieldR.$schd_tm); //入庫日には予定日時
				addColumnPathMap(InspSchd_Upd01_CndR.$base_unit_qty, MfgInstTblReg_Upd04_DtlYieldR.$base_unit_yield_qty);
				addColumnPathMap(InspSchd_Upd01_CndR.$base_unit_cd, MfgInstTblReg_Upd04_DtlYieldR.$base_unit_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_ord_no, MfgInstTblReg_Upd04_DtlYieldR.$itm_ord_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$insp_cnt_rmrks, MfgInstTblReg_Upd04_DtlYieldR.$insp_cnt_rmrks);
				addColumnPathMap(InspSchd_Upd01_CndR.$peg_no, MfgInstTblReg_Upd04_DtlYieldR.$peg_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.act_flg(false); // 実績ＦＬＧはfalse
				dest.insp_typ(MSC_INSP_TYP.PRDCT.value()); // 検査種類区分は製造検査
				if (src.inst_abort_flg()) {
					// 指図打切時は検査予定を削除
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else if (src.old_inst_abort_flg()) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					dest.data_crud_typ(src.data_crud_typ());
				}

				if (!MAC_DATA_CRUD_TYP.isDEL(dest.data_crud_typ())) {
					// 製造進捗状況から検査指図不可状況ＦＬＧを設定
					if (MSC_MFG_STS_TYP.isYET(src.mfg_sts_typ())
							|| MSC_MFG_APRV_STS_TYP.isINST_OPN(src.mfg_aprv_sts_typ())) {
						
						dest.sts_schd_flg(true);
					}
					else {
						dest.sts_schd_flg(false);
					}
					
					dest.bp_cd(MAC_STR.NULL_VAL.value());
					dest.quality_typ(MAC_QUALITY_TYP.GOOD.value()); // 良品区分は良品
					dest.asst_typ(MAC_ASST_TYP.CO_PROD.value()); // 資産区分は自社（生産）
					dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value()); // 在庫識別区分は自社在庫
					dest.gd_cd(getDefaultFeedStkGd().gd_cd()); // 格付コードはデフォルト値を取得
					dest.sppl_cd(MAC_STR.NULL_VAL.value()); // 発注先ＣＤにはＮＵＬＬ文字
					dest.maker_cd(MAC_STR.NULL_VAL.value()); // メーカＣＤにはＮＵＬＬ文字
					
					MAVM_ITM_UNIT_R itmUnit = _itmUnit.get(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3(), src.trd_unit_cd());
					if (!isNull(itmUnit) && itmUnit.pack_flg()) {
						dest.pack_unit_qty(src.trd_unit_yield_qty());
						dest.pack_unit_cd(src.trd_unit_cd());
					} else {
						dest.pack_unit_qty(src.base_unit_yield_qty());
						dest.pack_unit_cd(src.base_unit_cd());
					}
				}
			}
		}

		protected Map_InspSchd_Srch03_CndR_MfgInstTblReg_Upd04_DtlYieldR<InspSchd_Srch03_CndR,MfgInstTblReg_Upd04_DtlYieldR> createMap_InspSchd_Srch03_CndR_MfgInstTblReg_Upd04_DtlYieldR() {
			return new Map_InspSchd_Srch03_CndR_MfgInstTblReg_Upd04_DtlYieldR<InspSchd_Srch03_CndR, MfgInstTblReg_Upd04_DtlYieldR>();
		}

		public class Map_InspSchd_Srch03_CndR_MfgInstTblReg_Upd04_DtlYieldR<D extends InspSchd_Srch03_CndR, S extends MfgInstTblReg_Upd04_DtlYieldR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Srch03_CndR.$peg_no, MfgInstTblReg_Upd04_DtlYieldR.$peg_no);
				addColumnPathMap(InspSchd_Srch03_CndR.$itm_cd, MfgInstTblReg_Upd04_DtlYieldR.$itm_cd);
				addColumnPathMap(InspSchd_Srch03_CndR.$itm_sub1, MfgInstTblReg_Upd04_DtlYieldR.$itm_sub1);
				addColumnPathMap(InspSchd_Srch03_CndR.$itm_sub2, MfgInstTblReg_Upd04_DtlYieldR.$itm_sub2);
				addColumnPathMap(InspSchd_Srch03_CndR.$itm_sub3, MfgInstTblReg_Upd04_DtlYieldR.$itm_sub3);
				addColumnPathMap(InspSchd_Srch03_CndR.$mfg_loc_cd, MfgInstTblReg_Upd04_DtlYieldR.$mfg_loc_cd);
				addColumnPathMap(InspSchd_Srch03_CndR.$schd_gr_dt, MfgInstTblReg_Upd04_DtlYieldR.$schd_tm);
				addColumnPathMap(InspSchd_Srch03_CndR.$to_loc_cd, MfgInstTblReg_Upd04_DtlYieldR.$strg_loc_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.insp_typ(MSC_INSP_TYP.PRDCT.value()); //検査種類区分は「製造検査」固定
			}
		}

		/**
		 * 受払予定作成サービスの呼出
		 */
		protected void callIoSchd() {
			MCList<MfgInstTblReg_Upd04_DtlYieldR> insL = MCList
					.create(MfgInstTblReg_Upd04_DtlYieldR.class);
			MCList<MfgInstTblReg_Upd04_DtlYieldR> delL = MCList
					.create(MfgInstTblReg_Upd04_DtlYieldR.class);

			// 外注は処理対象外のため、内製データのみを処理対象とする
			for (MfgInstTblReg_Upd04_DtlYieldR r : _up0_intnl) {
				// 受払予定削除対象
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					delL.add(r);
				}
				// 受払予定作成対象
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					if (!r.inst_abort_flg()) {
						insL.add(r);
					}
				}
			}

			// 受払予定削除
			if (!delL.isEmpty()) {
				MSBEL_IoSchdService.IoSchd_Del01 del = MSBEL_IoSchdService.crtIoSchd_Del01();
				addAll(del.up0(), delL, createMap_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd04_DtlYieldR());
				del.exec();
			}

			// 受払予定作成
			if (!insL.isEmpty()) {
				MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd10 ioSchdIns = MSBCL_MfgInstTblRegService
						.crtMfgInstTblReg_Upd10();
				addAll(ioSchdIns.up0(), insL,
						createMap_MfgInstTblReg_Upd10_DtlYieldR_MfgInstTblReg_Upd04_DtlYieldR());
				ioSchdIns.exec();
			}
		}

		/**
		 * 上り電文から受払予定作成サービスの削除オペレーションへのマッピング
		 * @return
		 */
		protected Map_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd04_DtlYieldR<MSW_IO_SCHD_DEL_R,MfgInstTblReg_Upd04_DtlYieldR> createMap_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd04_DtlYieldR() {
			return new Map_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd04_DtlYieldR<MSW_IO_SCHD_DEL_R, MfgInstTblReg_Upd04_DtlYieldR>();
		}

		public class Map_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd04_DtlYieldR<D extends MSW_IO_SCHD_DEL_R, S extends MfgInstTblReg_Upd04_DtlYieldR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_no, MfgInstTblReg_Upd04_DtlYieldR.$yield_schd_no); //受払予定ＮＯは出来高予定ＮＯを設定（連番は設定不要）
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.io_schd_typ(MSC_IO_SCHD_TYP.MFG.value()); //受払予定区分は「製造」固定
				
				if (MSC_MFG_STS_TYP.isYET(src.old_mfg_sts_typ()) || MSC_MFG_STS_TYP.isSAV(src.old_mfg_sts_typ())) {
					// 更新前の製造状況が「未指図」または「指図保存」の場合、受払予定状況に「製造保存」を設定
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.MFG_SAV.value());
				}
				else if (MSC_MFG_STS_TYP.isSTT(src.hdr_mfg_sts_typ())) {
					// ヘッダの製造状況区分が「着手中」の場合（着手後の指図訂正時）は受払予定も着手中となっているため、「着手中」を設定
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.STT.value());
				}
				else {
					// 上記以外は「指図済」を設定
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD.value());
				}
			}
		}

		/**
		 * 上り電文から受払予定作成サービスの追加オペレーションへのマッピング
		 * @return
		 */
		protected Map_MfgInstTblReg_Upd10_DtlYieldR_MfgInstTblReg_Upd04_DtlYieldR<MfgInstTblReg_Upd10_DtlYieldR,MfgInstTblReg_Upd04_DtlYieldR> createMap_MfgInstTblReg_Upd10_DtlYieldR_MfgInstTblReg_Upd04_DtlYieldR() {
			return new Map_MfgInstTblReg_Upd10_DtlYieldR_MfgInstTblReg_Upd04_DtlYieldR<MfgInstTblReg_Upd10_DtlYieldR, MfgInstTblReg_Upd04_DtlYieldR>();
		}

		public class Map_MfgInstTblReg_Upd10_DtlYieldR_MfgInstTblReg_Upd04_DtlYieldR<D extends MfgInstTblReg_Upd10_DtlYieldR, S extends MfgInstTblReg_Upd04_DtlYieldR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstTblReg_Upd10_DtlYieldR.$yield_schd_no, MfgInstTblReg_Upd04_DtlYieldR.$yield_schd_no);
			}
		}

		/** 
		 * ロット情報サービスを呼び出す
		 */
		protected void callLotUpd() {
			MSBFL_LotService.Lot_Upd08 ope = MSBFL_LotService.crtLot_Upd08();
			addAll(ope.up0(), up0(), createMap_Lot_Upd08_CndR_MfgInstTblReg_Upd04_DtlYieldR());
			ope.exec();
		}
		
		protected Map_Lot_Upd08_CndR_MfgInstTblReg_Upd04_DtlYieldR<Lot_Upd08_CndR,MfgInstTblReg_Upd04_DtlYieldR> createMap_Lot_Upd08_CndR_MfgInstTblReg_Upd04_DtlYieldR() {
			return new Map_Lot_Upd08_CndR_MfgInstTblReg_Upd04_DtlYieldR<Lot_Upd08_CndR, MfgInstTblReg_Upd04_DtlYieldR>();
		}

		public class Map_Lot_Upd08_CndR_MfgInstTblReg_Upd04_DtlYieldR<D extends Lot_Upd08_CndR, S extends MfgInstTblReg_Upd04_DtlYieldR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Upd08_CndR.$data_crud_typ, MfgInstTblReg_Upd04_DtlYieldR.$data_crud_typ);
				addColumnPathMap(Lot_Upd08_CndR.$itm_cd, MfgInstTblReg_Upd04_DtlYieldR.$itm_cd);
				addColumnPathMap(Lot_Upd08_CndR.$itm_sub1, MfgInstTblReg_Upd04_DtlYieldR.$itm_sub1);
				addColumnPathMap(Lot_Upd08_CndR.$itm_sub2, MfgInstTblReg_Upd04_DtlYieldR.$itm_sub2);
				addColumnPathMap(Lot_Upd08_CndR.$itm_sub3, MfgInstTblReg_Upd04_DtlYieldR.$itm_sub3);
				addColumnPathMap(Lot_Upd08_CndR.$lot_no, MfgInstTblReg_Upd04_DtlYieldR.$lot_no);
				addColumnPathMap(Lot_Upd08_CndR.$sublot_no, MfgInstTblReg_Upd04_DtlYieldR.$sublot_no);
				addColumnPathMap(Lot_Upd08_CndR.$mfg_loc_cd, MfgInstTblReg_Upd04_DtlYieldR.$mfg_loc_cd);
				addColumnPathMap(Lot_Upd08_CndR.$loc_cd, MfgInstTblReg_Upd04_DtlYieldR.$strg_loc_cd);
				addColumnPathMap(Lot_Upd08_CndR.$src_no1, MfgInstTblReg_Upd04_DtlYieldR.$mfg_inst_no);
				addColumnPathMap(Lot_Upd08_CndR.$src_no2, MfgInstTblReg_Upd04_DtlYieldR.$itm_mfg_inst_no);
				addColumnPathMap(Lot_Upd08_CndR.$src_no3, MfgInstTblReg_Upd04_DtlYieldR.$yield_schd_no);
				addColumnPathMap(Lot_Upd08_CndR.$base_dt, MfgInstTblReg_Upd04_DtlYieldR.$schd_tm);
				addColumnPathMap(Lot_Upd08_CndR.$site_cd, MfgInstTblReg_Upd04_DtlYieldR.$mfg_loc_site_cd);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.insp_typ(MSC_INSP_TYP.PRDCT.value());
			}
		}
		
		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().addAll(up0());
		}
	}

	/**
	 * MfgInstTblReg_Upd05オペレーション.<p>
	 *
	 * 投入予定・投入引当状況の追加・更新・削除を行う<br>
	 */
	public class MfgInstTblReg_Upd05 extends MSBCL_MfgInstTblRegService_MC_A.MfgInstTblReg_Upd05 {

		protected FXUCL_Cache<MfgInstTblReg_Upd05_HdrR> _hdrCache; // ヘッダ単位の下り電文を編集するためのキャッシュ
		
		protected MCList<MfgInstTblReg_Upd05_DtlInptAllocStsR> _allocStsL; // 投入引当状況を格納するためのリスト
		// up0から以下を抽出したリスト
		// ・表示順のみ更新する行
		// ・自給品
		// ・指図書のみ表示行
		protected MCList<MfgInstTblReg_Upd05_DtlInptR> _up0_seq; 
		protected MCList<MfgInstTblReg_Upd05_DtlInptR> _up0; // up0から_up0_seqを除いたリスト
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			if (up0().isEmpty()) {
				return;
			}
			// 下り電文用のヘッダコンテナのキャッシュを作成
			setHdrCache();
			// 上り電文の編集
			editUp();
			// 受払予定の削除
			callIoSchdDel();
			// 移動・移送予定の削除
			callXfrSchdDel();
			// 引当処理
			callAlloc();
			// 投入引当状況の編集
			editAllocSts();
			// 移動・移送予定の登録
			callXfrSchdIns();
			// 投入予定の登録
			inptSchdReg();
			// 投入引当状況の登録
			inptAllocStsReg();
			// 投入実績残テーブルの登録
			inptActRemReg();
			// 表示順のみ更新の受払予定の削除
			callIoSchdDelSeq();
			// 受払予定の登録
			callIoSchdIns();
			// 下り電文の設定
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			
			// 投入引当状況のリスト作成
			_allocStsL = MCList.create(MfgInstTblReg_Upd05_DtlInptAllocStsR.class);

			_up0_seq = MCList.create(MfgInstTblReg_Upd05_DtlInptR.class);
			_up0 = MCList.create(MfgInstTblReg_Upd05_DtlInptR.class);

			for (MfgInstTblReg_Upd05_DtlInptR r : up0()) {
				// 表示順のみ更新フラグによる振り分け
				if (r.disp_seq_upd_flg()) {
					_up0_seq.add(r);
				}
				else {
					_up0.add(r);
				}
				if (r.inst_abort_flg()) {
					// 打切後は引当を維持できないので、falseにする
					r.alloc_flg(false);
				}
			}			

			// 投入予定ＮＯの発番（発番システム区分）
			int cacheSize = up0().subList(MfgInstTblReg_Upd05_DtlInptR.$data_crud_typ,
					MAC_DATA_CRUD_TYP.CRT.value()).size();
			doSeqCache(MSC_NUM_SYS_TYP.INPTSCHD, cacheSize);

			// 投入予定ＮＯの設定
			for (MfgInstTblReg_Upd05_DtlInptR r : up0()) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					r.inpt_schd_no(getStrSeq(MSC_NUM_SYS_TYP.INPTSCHD));
				}
			}
			// 再計算グループ、再計算グループ連番の設定
			for (MCList<MfgInstTblReg_Upd05_DtlInptR> mfgGL : up0().groupList(
					MfgInstTblReg_Upd05_DtlInptR.$mfg_inst_no)) {
				setRecalcGrp(mfgGL.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())));
			}
			
			// 端数処理区分、小数部有効桁数の設定
			setDecPlaceAndRndTyp();
		}

		protected void setDecPlaceAndRndTyp() {

			// 品目マスタから端数処理区分、小数部有効桁数を補完
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbcItmL_bldr = MCQueryApiBuilder.create(t);
			dbcItmL_bldr.setSelect(t.itm_cd);
			dbcItmL_bldr.addSelect(t.itm_sub1);
			dbcItmL_bldr.addSelect(t.itm_sub2);
			dbcItmL_bldr.addSelect(t.itm_sub3);
			dbcItmL_bldr.addSelect(t.dec_place);
			dbcItmL_bldr.addSelect(t.rnd_typ);
			dbcItmL_bldr.addSelect(t.cont_fctr_rnd_typ);
			dbcItmL_bldr.addSelect(t.cont_fctr_dec_place);
			FXUCL_MCDbcCache<MAM_ITM_R> cacheItmL = new FXUCL_MCDbcCache<>(dbcItmL_bldr, _up0, new String[] {
					MfgInstTblReg_Upd05_DtlInptR.$itm_cd, MfgInstTblReg_Upd05_DtlInptR.$itm_sub1,
					MfgInstTblReg_Upd05_DtlInptR.$itm_sub2, MfgInstTblReg_Upd05_DtlInptR.$itm_sub3
			});
			
			for (MfgInstTblReg_Upd05_DtlInptR r : _up0) {
				MAM_ITM_R itmR = cacheItmL.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				r.base_unit_dec_place(itmR.dec_place());
				r.base_unit_rnd_typ(itmR.rnd_typ());
				r.cont_fctr_rnd_typ(itmR.cont_fctr_rnd_typ());
				r.cont_fctr_dec_place(itmR.cont_fctr_dec_place());
			}
		}
		
		/**
		 * 下り電文用のヘッダコンテナのキャッシュを作成
		 */
		protected void setHdrCache() {
			_hdrCache = new FXUCL_Cache<MfgInstTblReg_Upd05_HdrR>();
			_hdrCache.setFixMaxCacheSize(-1);

			for (MCList<MfgInstTblReg_Upd05_DtlInptR> gL : up0()
					.groupList(MfgInstTblReg_Upd05_DtlInptR.$hdr_peg_no)) {
				
				MfgInstTblReg_Upd05_HdrR downR = MfgInstTblReg_Upd05_HdrR.create(); 
				downR.hdr_peg_no(gL.get(0).hdr_peg_no());
				downR.alloc_tgt_cnt(MCNumber.ZERO);
				downR.alloc_success_cnt(MCNumber.ZERO);
				downR.alloc_failure_cnt(MCNumber.ZERO);

				_hdrCache.putCache(new MCNumber[]{downR.hdr_peg_no()}, downR);
			}
		}
		
		/**
		 * 再計算グループ、再計算グループ連番の設定
		 */
		protected void setRecalcGrp(MCList<MfgInstTblReg_Upd05_DtlInptR> mfgGL) {
			MCNumber recalcGrp = MCNumber.ZERO;
			MCNumber recalcGrpSeq = MCNumber.ZERO;

			// 更新対象外(=製造状況区分が着手中、完了)の投入予定を取得する
			MCList<MfgInstTblReg_Upd05_DtlInptR> srchTgtMfgGL = mfgGL.subList(r -> MSC_MFG_STS_TYP.isSTT(r.mfg_sts_typ()) || MSC_MFG_STS_TYP.isCMPL(r.mfg_sts_typ()));

			MCList<MST_INPT_SCHD_R> srchInptSchdL = MCList.create(MST_INPT_SCHD_R.class);
			MST_INPT_SCHD_R t = MST_INPT_SCHD_R.create("T");
			MCQueryApiBuilder srchInptSchdL_bldr = MCQueryApiBuilder.create(t);
			srchInptSchdL_bldr.setWhere(t.inpt_schd_no.eq(bind("inpt_schd_no")));
			srchInptSchdL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBCL6010_MST_INPT_SCHD_S02", srchInptSchdL, srchInptSchdL_bldr, srchTgtMfgGL);

			// 更新対象外のレコードには再計算グループや再計算グループ連番を設定し直す必要がないので、mfgGLから除く
			mfgGL.removeAll(srchTgtMfgGL);

			// 再計算グループのキー
			MCIndexKey recalcGrpKey = srchInptSchdL.createIndex(MST_INPT_SCHD_R.$recalc_grp);

			// 工程指図ＮＯ、品目ＣＤ、枝番１～３、版ＮＯ、代替グループＣＤ、代替グループ連番、同一子品目連番でマッチングするためのキー
			MCIndexKey matchKey = srchInptSchdL.createIndex(
					MST_INPT_SCHD_R.$oper_inst_no,
					MST_INPT_SCHD_R.$itm_cd, MST_INPT_SCHD_R.$itm_sub1,
					MST_INPT_SCHD_R.$itm_sub2, MST_INPT_SCHD_R.$itm_sub3,
					MST_INPT_SCHD_R.$ver_no, MST_INPT_SCHD_R.$alt_grp_cd,
					MST_INPT_SCHD_R.$alt_grp_seq, MST_INPT_SCHD_R.$chd_itm_seq);

			for (MCList<MfgInstTblReg_Upd05_DtlInptR> gL : mfgGL
					.groupList(MfgInstTblReg_Upd05_DtlInptR.$oper_inst_no)) {

				// ＢＯＭ識別番号のキー
				MCIndexKey bomIdNoKey = gL.createIndex(MfgInstTblReg_Upd05_DtlInptR.$bom_id_no);

				// 工程指図ＮＯ、品目ＣＤ、枝番１～３、版ＮＯ、代替グループＣＤ、代替グループ連番、同一子品目連番でマッチングするためのキー
				MCIndexKey matchGLKey = gL.createIndex(
						MfgInstTblReg_Upd05_DtlInptR.$oper_inst_no,
						MfgInstTblReg_Upd05_DtlInptR.$itm_cd, MfgInstTblReg_Upd05_DtlInptR.$itm_sub1,
						MfgInstTblReg_Upd05_DtlInptR.$itm_sub2, MfgInstTblReg_Upd05_DtlInptR.$itm_sub3,
						MfgInstTblReg_Upd05_DtlInptR.$ver_no, MfgInstTblReg_Upd05_DtlInptR.$alt_grp_cd,
						MfgInstTblReg_Upd05_DtlInptR.$alt_grp_seq, MfgInstTblReg_Upd05_DtlInptR.$chd_itm_seq);

				// 元々のＢＯＭ識別番号の退避
				for (MfgInstTblReg_Upd05_DtlInptR gR : gL) {
					gR.addNumberColumn("bef_bom_id_no", gR.bom_id_no());
				}

				// 後続のソート処理のためにＢＯＭ識別番号の仮設定
				for (MST_INPT_SCHD_R srchInptSchdR : srchInptSchdL) {
					// 計画外のレコードはＢＯＭ識別番号をnullで維持したいので、仮設定処理をスキップ
					if (isNull(srchInptSchdR.bom_id_no())) {
						continue;
					}
					
					// gLから工程指図ＮＯ、品目ＣＤ、枝番１～３、版ＮＯ、代替グループＣＤ、同一子品目連番が一致するレコードを抽出
					MCList<MfgInstTblReg_Upd05_DtlInptR> tgtGL = MCList.create(MfgInstTblReg_Upd05_DtlInptR.class);
					tgtGL = getTgtGL(srchInptSchdR, gL, matchGLKey);

					// gLに設定されていないＢＯＭ識別番号になるまでループし、その値を設定する
					MCNumber tmpBomIdNo = MCNumber.ZERO;
					while(gL.contains(bomIdNoKey, tmpBomIdNo)) {
						tmpBomIdNo = tmpBomIdNo.add(MCNumber.ONE);
					}
					tgtGL.setNumber(MfgInstTblReg_Upd05_DtlInptR.$bom_id_no, tmpBomIdNo);
					
					// ＢＯＭ識別番号のキーの再設定
					bomIdNoKey = gL.createIndex(MfgInstTblReg_Upd05_DtlInptR.$bom_id_no);
				}

				// 工程内ＢＯＭ識別番号、有効期限、最古入庫日、ロットシーケンス、投入予定ＮＯ順にソートし、再計算グループ、再計算グループ連番を設定する
				gL.sort(MCList.SortType.ASC, MfgInstTblReg_Upd05_DtlInptR.$bom_id_no,
						MfgInstTblReg_Upd05_DtlInptR.$vld_dt,
						MfgInstTblReg_Upd05_DtlInptR.$first_gr_dt,
						MfgInstTblReg_Upd05_DtlInptR.$lot_seq,
						MfgInstTblReg_Upd05_DtlInptR.$inpt_schd_no);

				MfgInstTblReg_Upd05_DtlInptR preR = MfgInstTblReg_Upd05_DtlInptR.create();
				for (MfgInstTblReg_Upd05_DtlInptR gR : gL) {
					// 更新対象外の投入予定から工程指図ＮＯ、品目ＣＤ、枝番１～３、版ＮＯ、代替グループＣＤ、同一子品目連番が一致するレコードを抽出
					MCList<MST_INPT_SCHD_R> tgtInptSchdL = MCList.create(MST_INPT_SCHD_R.class);
					tgtInptSchdL = getTgtInptSchdL(gR, srchInptSchdL, matchKey);

					// BOM識別番号がNULLの場合（行追加した場合）
					if (isNull(gR.bom_id_no())) {
						// 同一再計算グループに複数連番が存在することはないため、
						// 再計算グループをカウントアップし、再計算グループ連番をクリアする
						recalcGrp = recalcGrp.add(MCNumber.ONE);

						// カウントアップされた再計算グループが更新対象外の投入予定に設定されている場合、カウントアップを進める
						while(srchInptSchdL.contains(recalcGrpKey, recalcGrp)) {
							recalcGrp = recalcGrp.add(MCNumber.ONE);
						}

						recalcGrpSeq = MCNumber.ONE;
						gR.recalc_grp(recalcGrp);
						gR.recalc_grp_seq(recalcGrpSeq);
					}
					// 更新対象外の投入予定から分割されたレコードであれば、更新対象外の投入予定と同じ再計算グループを設定する
					else if (!tgtInptSchdL.isEmpty()) {
						// 元々同じ再計算グループが設定されているはずなので、1行目の値を設定する
						MST_INPT_SCHD_R tgtInptSchdR = tgtInptSchdL.get(0);
						gR.recalc_grp(tgtInptSchdR.recalc_grp());

						// gLから同じ再計算グループのレコードを抽出する
						MCList<MfgInstTblReg_Upd05_DtlInptR> recalcGrpGL = MCList.create(MfgInstTblReg_Upd05_DtlInptR.class);
						recalcGrpGL = gL.subList(r -> isSame(r.recalc_grp(), tgtInptSchdR.recalc_grp()));

						// 再計算グループ連番は同じ再計算グループ内で被らないよう設定する
						recalcGrpSeq = MCNumber.ONE;

						// 再計算グループ連番のキー
						MCIndexKey recalcGrpSeqKey = tgtInptSchdL.createIndex(MST_INPT_SCHD_R.$recalc_grp_seq);
						MCIndexKey recalcGrpSeqGLKey = recalcGrpGL.createIndex(MfgInstTblReg_Upd05_DtlInptR.$recalc_grp_seq);

						// 再計算グループ連番が更新対象外の投入予定、もしくは同じ再計算グループのレコードに設定されている場合、カウントアップを進める
						while(tgtInptSchdL.contains(recalcGrpSeqKey, recalcGrpSeq)
								|| recalcGrpGL.contains(recalcGrpSeqGLKey, recalcGrpSeq)) {
							recalcGrpSeq = recalcGrpSeq.add(MCNumber.ONE);
						}

						gR.recalc_grp_seq(recalcGrpSeq);
					}
					// BOM識別番号がNOT NULLの場合
					else {
						if (isSame(preR.bom_id_no(), gR.bom_id_no())) {
							// BOM識別番号が前の行と同じであれば、再計算グループ連番をカウントアップする
							recalcGrpSeq = recalcGrpSeq.add(MCNumber.ONE);
							gR.recalc_grp(recalcGrp);
							gR.recalc_grp_seq(recalcGrpSeq);
						}
						else {
							// BOM識別番号が前の行と異なれば、
							// 再計算グループをカウントアップし、再計算グループ連番をクリアする
							recalcGrp = recalcGrp.add(MCNumber.ONE);

							// カウントアップされた再計算グループが更新対象外の投入予定に設定されている場合、カウントアップを進める
							while(srchInptSchdL.contains(recalcGrpKey, recalcGrp)) {
								recalcGrp = recalcGrp.add(MCNumber.ONE);
							}

							recalcGrpSeq = MCNumber.ONE;
							gR.recalc_grp(recalcGrp);
							gR.recalc_grp_seq(recalcGrpSeq);
						}
					}
					preR = gR;
					// ソートのために一時的に設定したＢＯＭ識別番号を元に戻す
					gR.bom_id_no(gR.getNumber("bef_bom_id_no"));
				}
			}
		}

		/**
		 * 更新対象外の投入予定リストから、gRと関係するレコードを取得する
		 * @param gR 検索元レコード
		 * @param srchInptSchdL 更新対象外の投入予定リスト
		 * @param matchKey マッチング用のキー
		 * @return tgtInptSchdL gRと関係するリスト
		 */
		protected MCList<MST_INPT_SCHD_R> getTgtInptSchdL(MfgInstTblReg_Upd05_DtlInptR gR, MCList<MST_INPT_SCHD_R> srchInptSchdL, MCIndexKey matchKey) {
			MCList<MST_INPT_SCHD_R> tgtInptSchdL = MCList.create(MST_INPT_SCHD_R.class);

			tgtInptSchdL = srchInptSchdL.subList(matchKey,
					gR.oper_inst_no(),
					gR.itm_cd(), gR.itm_sub1(),
					gR.itm_sub2(), gR.itm_sub3(), gR.ver_no(),
					gR.alt_grp_cd(), gR.alt_grp_seq(), gR.chd_itm_seq());

			return tgtInptSchdL;
		}

		/**
		 * gLから、更新対象外の投入予定と関係するレコードを取得する
		 * @param srchInptSchdR 検索元レコード
		 * @param gL gL
		 * @param matchKey マッチング用のキー
		 * @return tgtGL srchInptSchdRと関係するリスト
		 */
		protected MCList<MfgInstTblReg_Upd05_DtlInptR> getTgtGL(MST_INPT_SCHD_R srchInptSchdR, MCList<MfgInstTblReg_Upd05_DtlInptR> gL, MCIndexKey matchGLKey) {
			MCList<MfgInstTblReg_Upd05_DtlInptR> tgtGL = MCList.create(MfgInstTblReg_Upd05_DtlInptR.class);

			tgtGL = gL.subList(matchGLKey,
					srchInptSchdR.oper_inst_no(),
					srchInptSchdR.itm_cd(), srchInptSchdR.itm_sub1(),
					srchInptSchdR.itm_sub2(), srchInptSchdR.itm_sub3(), srchInptSchdR.ver_no(),
					srchInptSchdR.alt_grp_cd(), srchInptSchdR.alt_grp_seq(),
					srchInptSchdR.chd_itm_seq());

			return tgtGL;
		}

		/**
		 * 引数のリストから自給品、指図書のみ品を除外する
		 * @param l
		 * @return
		 */
		protected MCList<MfgInstTblReg_Upd05_DtlInptR> excldSSandNoMrp(MCList<MfgInstTblReg_Upd05_DtlInptR> l) {
			MCList<MfgInstTblReg_Upd05_DtlInptR> retL = MCList.create(MfgInstTblReg_Upd05_DtlInptR.class);
			for (MfgInstTblReg_Upd05_DtlInptR r : l) {
				if (MAC_PROV_TYP.isSS(r.prov_typ())) {
					// 自給品
					continue;
				}
				if (MAC_INPT_CTL_TYP.isNO_MRP_INST(r.inpt_ctl_typ())) {
					// ＭＲＰ対象外（指図書のみ）
					continue;
				}
				retL.add(r);
			}
			return retL;
		}
		
		/**
		 * 受払予定、投入引当状況の削除
		 */
		protected void callIoSchdDel() {
			// 削除対象の投入予定のみをリスト化（削除行または更新行（表示順のみ変更された行、自給品行、指図書のみ行を除く））
			MCList<MfgInstTblReg_Upd05_DtlInptR> delL = MCList
					.create(MfgInstTblReg_Upd05_DtlInptR.class);
			for (MfgInstTblReg_Upd05_DtlInptR r : _up0) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
						|| (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()))) {
					delL.add(r);
				}
			}

			// 受払予定削除
			if (!delL.isEmpty()) {
				MSBEL_IoSchdService.IoSchd_Del01 del = MSBEL_IoSchdService.crtIoSchd_Del01();
				addAll(del.up0(), delL, createMap_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd05_DtlInptR());
				del.exec();
			}
		}
		/**
		 * 表示順のみ更新の受払予定の削除
		 */
		protected void callIoSchdDelSeq() {
			MCList<MfgInstTblReg_Upd05_DtlInptR> delL = MCList
					.create(MfgInstTblReg_Upd05_DtlInptR.class);
			for (MfgInstTblReg_Upd05_DtlInptR r : excldSSandNoMrp(_up0_seq)) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
						|| (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()))) {
					delL.add(r);
				}
			}

			// 受払予定削除
			if (!delL.isEmpty()) {
				MSBEL_IoSchdService.IoSchd_Del01 del = MSBEL_IoSchdService.crtIoSchd_Del01();
				addAll(del.up0(), delL, createMap_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd05_DtlInptR());
				del.exec();
			}
		}

		/**
		 * 上り電文から受払予定作成サービスの削除オペレーションへのマッピング
		 * @return
		 */
		protected Map_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd05_DtlInptR<MSW_IO_SCHD_DEL_R,MfgInstTblReg_Upd05_DtlInptR> createMap_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd05_DtlInptR() {
			return new Map_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd05_DtlInptR<MSW_IO_SCHD_DEL_R, MfgInstTblReg_Upd05_DtlInptR>();
		}

		public class Map_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd05_DtlInptR<D extends MSW_IO_SCHD_DEL_R, S extends MfgInstTblReg_Upd05_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_no, MfgInstTblReg_Upd05_DtlInptR.$inpt_schd_no); //受払予定ＮＯは投入予定ＮＯを設定（連番は設定不要）
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.io_schd_typ(MSC_IO_SCHD_TYP.INPT.value()); //受払予定区分は「投入」固定
				
				if (MSC_MFG_STS_TYP.isYET(src.old_mfg_sts_typ()) || MSC_MFG_STS_TYP.isSAV(src.old_mfg_sts_typ())) {
					// 更新前の製造状況が「未指図」または「指図保存」の場合、受払予定状況に「製造保存」を設定
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.MFG_SAV.value());
				}
				else if (MSC_MFG_STS_TYP.isSTT(src.hdr_mfg_sts_typ())) {
					// ヘッダの製造状況区分が「着手中」の場合（着手後の指図訂正時）は受払予定も着手中となっているため、「着手中」を設定
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.STT.value());
				}
				else {
					// 上記以外は「指図済」
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD.value());
				}
			}
		}

		/**
		 * 移動・移送予定の削除
		 */
		protected void callXfrSchdDel() {
			MCList<MfgInstTblReg_Upd05_DtlInptR> upd01InptL = MCList.create(MfgInstTblReg_Upd05_DtlInptR.class);
			MCList<MfgInstTblReg_Upd05_DtlInptR> upd03InptL = MCList.create(MfgInstTblReg_Upd05_DtlInptR.class);

			for (MfgInstTblReg_Upd05_DtlInptR r : excldSSandNoMrp(_up0)) {
				if (r.xfr_inst_err_flg()) {
					// 移動・移送指図済エラーＦＬＧがオンの場合
					if (r.not_frst_inst_can_flg() || MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
							|| (r.inst_abort_flg() && !r.old_inst_abort_flg())) {
						// 初回製造指図以外の取消、削除の場合、または移動・移送指図済の打切り更新時に紐切れの対象とする
						upd03InptL.add(r);
					}
				}
				else {
					// 移動・移送指図済エラーＦＬＧがオフの場合
					if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
						// 更新または削除の場合、移動・移送予定の削除対象に追加
						upd01InptL.add(r);
					}
				}
			}
			
			// 移動・移送予定を取得
			MCList<MfgInstTblReg_Upd05_DtlInptR> bindL = excldSSandNoMrp(_up0).subList(r -> !MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()));
			MCList<MST_XFR_SCHD_R> xfrL = getXfrL(bindL);
			MCIndexKey idxkey = xfrL.createIndex(MST_XFR_SCHD_R.$inpt_schd_no);
			
			if (!upd01InptL.isEmpty()) {
				// 削除処理
				MSBEL_XfrSchdService.XfrSchd_Upd01 xfrUpd01 = MSBEL_XfrSchdService.crtXfrSchd_Upd01();
				
				for (MfgInstTblReg_Upd05_DtlInptR upd01InptR : upd01InptL) {
					MCList<MST_XFR_SCHD_R> subXfrL = xfrL.subList(idxkey,
							upd01InptR.inpt_schd_no());
					for (MST_XFR_SCHD_R xfrR : subXfrL) {
						XfrSchd_DtlR srvUpR = XfrSchd_DtlR.create();
						copy(srvUpR, upd01InptR, createMap_XfrSchd_DtlR_MfgInstTblReg_Upd05_DtlInptR());
						srvUpR.xfr_schd_no(xfrR.xfr_schd_no());
						xfrUpd01.up0().add(srvUpR);
					}
				}
				if (!xfrUpd01.up0().isEmpty()) {
					xfrUpd01.exec();
				}
			}

			if (!upd03InptL.isEmpty()) {
				// 紐切れ処理
				MCList<MST_XFR_SCHD_R> srcXfrL = MCList.create(MST_XFR_SCHD_R.class);
				for (MfgInstTblReg_Upd05_DtlInptR upd03InptR : upd03InptL) {
					MCList<MST_XFR_SCHD_R> subXfrL = xfrL
							.subList(idxkey, upd03InptR.inpt_schd_no());
					subXfrL.setAttributes(upd03InptR);
					
					srcXfrL.addAll(subXfrL);
				}
				
				MSBEL_XfrSchdService.XfrSchd_Upd03 xfrUpd03 = MSBEL_XfrSchdService.crtXfrSchd_Upd03();
				addAll(xfrUpd03.up0(), srcXfrL, createMap_XfrSchdMod_DtlR_MST_XFR_SCHD_R());
				xfrUpd03.exec();
			}
		}
		
		protected MCList<MST_XFR_SCHD_R> getXfrL(MCList<MfgInstTblReg_Upd05_DtlInptR> bindL) {
			MCList<MST_XFR_SCHD_R> xfrL = MCList.create(MST_XFR_SCHD_R.class);
			MST_XFR_SCHD_R t = MST_XFR_SCHD_R.create("T");
			MCQueryApiBuilder xfrL_bldr = MCQueryApiBuilder.create(t);
			xfrL_bldr.setSelect(t.inpt_schd_no, t.xfr_schd_no, t.xfr_src_no);
			xfrL_bldr.setWhere(t.inpt_schd_no.eq(bind("inpt_schd_no")));
			xfrL_bldr.addWhereWithAnd(t.rqst_can_flg.eq(value(false)));
			if (!bindL.isEmpty()) {
				dbSelect("MSBCL6010_MST_XFR_SCHD_S01", xfrL, xfrL_bldr, bindL);
			}
			return xfrL;
		}
		
		protected Map_XfrSchd_DtlR_MfgInstTblReg_Upd05_DtlInptR<XfrSchd_DtlR,MfgInstTblReg_Upd05_DtlInptR> createMap_XfrSchd_DtlR_MfgInstTblReg_Upd05_DtlInptR() {
			return new Map_XfrSchd_DtlR_MfgInstTblReg_Upd05_DtlInptR<XfrSchd_DtlR, MfgInstTblReg_Upd05_DtlInptR>();
		}

		public class Map_XfrSchd_DtlR_MfgInstTblReg_Upd05_DtlInptR<D extends XfrSchd_DtlR, S extends MfgInstTblReg_Upd05_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchd_DtlR.$peg_no, MfgInstTblReg_Upd05_DtlInptR.$peg_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.xfr_src_typ(MSC_XFR_SRC_TYP.INPT.value()); //移動・移送元区分は投入
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value()); //データ更新区分は削除
			}
		}

		protected Map_XfrSchdMod_DtlR_MST_XFR_SCHD_R<XfrSchdMod_DtlR,MST_XFR_SCHD_R> createMap_XfrSchdMod_DtlR_MST_XFR_SCHD_R() {
			return new Map_XfrSchdMod_DtlR_MST_XFR_SCHD_R<XfrSchdMod_DtlR, MST_XFR_SCHD_R>();
		}

		public class Map_XfrSchdMod_DtlR_MST_XFR_SCHD_R<D extends XfrSchdMod_DtlR, S extends MST_XFR_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchdMod_DtlR.$xfr_src_no, MST_XFR_SCHD_R.$xfr_src_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.xfr_src_typ(MSC_XFR_SRC_TYP.INPT.value());
				dest.rqst_mod_flg(true);
				dest.rqst_can_flg(true);
			}
		}

		/**
		 * 引当管理サービス（引当ロックサービス・ロット提案サービス）の呼出
		 */
		protected void callAlloc() {
			// 引当対象の投入予定のみをリスト化（引当ＦＬＧがオン、追加・更新行（表示順のみ変更された行を除く））
			MCList<MfgInstTblReg_Upd05_DtlInptR> inptSchdL = MCList.create(MfgInstTblReg_Upd05_DtlInptR.class);
			for (MfgInstTblReg_Upd05_DtlInptR r : excldSSandNoMrp(_up0)) {
				if (MSC_MFG_STS_TYP.isYET(r.mfg_sts_typ())) {
					continue;
				}
				if (r.inst_abort_flg()) {
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					if (r.alloc_flg()) {
						inptSchdL.add(r);
						r.call_alloc_srv_flg(true);
					}
				}
			}
			
			// 引当対象が存在しない場合、処理を終了（チェックは行う）
			if (inptSchdL.isEmpty()) {
				MCList<LotProp_Sprt01_Dtl2R> notAllocL = MCList.create(LotProp_Sprt01_Dtl2R.class);
				MCList<MfgInstTblReg_Upd05_DtlInptR> chkL = up0().subList(MfgInstTblReg_Upd05_DtlInptR.$inst_abort_flg, false);
				chkInptAndSetMfgStsTyp(chkL, inptSchdL, notAllocL);
				return;
			}

			// 引当対象リストを投入予定日、投入予定ＮＯでソート
			inptSchdL.sort(MfgInstTblReg_Upd05_DtlInptR.$schd_tm, MfgInstTblReg_Upd05_DtlInptR.$inpt_schd_no);
			
			// 引当ロックに渡すため、品目、枝番、投入場所でグループ化
			String[] lockKeys = new String[] {
					MfgInstTblReg_Upd05_DtlInptR.$itm_cd,
					MfgInstTblReg_Upd05_DtlInptR.$itm_sub1,
					MfgInstTblReg_Upd05_DtlInptR.$itm_sub2,
 					MfgInstTblReg_Upd05_DtlInptR.$itm_sub3,
					MfgInstTblReg_Upd05_DtlInptR.$inpt_loc_cd
			};
			MCList<MfgInstTblReg_Upd05_DtlInptR> lockL = inptSchdL.groupBy(lockKeys);

			// lockLを上り電文に設定し、引当ロックサービスを実行
			MSBEL_AllocMngService.Alloc_Lock_Upd01 lock = MSBEL_AllocMngService.crtAlloc_Lock_Upd01();
			addAll(lock.up0(), lockL, createMap_MSW_ALLOC_LOC_MAP_R_MfgInstTblReg_Upd05_DtlInptR());
			lock.exec();

			// 上り電文を製造指図単位（ヘッダ紐付けＮＯ単位）にグループ化し、ロット提案サービスを実行
			MSBCL_LotPropService.LotProp_Sprt01 sprt = MSBCL_LotPropService.crtLotProp_Sprt01();

			for (MCList<MfgInstTblReg_Upd05_DtlInptR> inptL : inptSchdL.groupList(MfgInstTblReg_Upd05_DtlInptR.$hdr_peg_no)) {
				// ロット提案サービスのヘッダコンテナの設定
				sprt.up0().act_flg(false); //実績時フラグはオフ
				sprt.up0().exec_prop_btn_flg(false); //ロット提案ボタンから実行フラグはオフ
				
				// ロット提案サービスの明細コンテナの設定
				addAll(sprt.up1(), inptL, createMap_LotProp_Sprt01_Dtl1R_MfgInstTblReg_Upd05_DtlInptR());
			}

			//ロット提案サービスを実行
			sprt.exec();
			
			// 資産の情報を集約したリスト
			MCList<LotProp_Sprt01_Dtl2R> rsltGrpBy = sprt.down1().subList(LotProp_Sprt01_Dtl2R.$err_flg, false);
			// 資産の情報を集約していないリスト
			MCList<LotProp_Sprt01_Dtl1R> rsltNoGrpBy = sprt.down0().subList(LotProp_Sprt01_Dtl1R.$err_flg, false);

			// 集約されたロット提案結果（down1）から投入予定を編集する
			setInptSchd(rsltGrpBy);
			
			// 集約されていないロット提案結果（down0）のうち、引当が行われた行から投入引当状況を編集する
			setAllocSts(rsltNoGrpBy);

			// チェック処理、製造状況区分の変更処理
			chkInptAndSetMfgStsTyp(up0(), inptSchdL, sprt.down1().subList(LotProp_Sprt01_Dtl2R.$err_flg, true));
		}
		
		/**
		 * 投入品目のチェック処理（一括処理の場合、未引当指図不許可かつ引当できなかった場合は、指図保存とする）
		 */
		protected void chkInptAndSetMfgStsTyp(MCList<MfgInstTblReg_Upd05_DtlInptR> allUpL,
				MCList<MfgInstTblReg_Upd05_DtlInptR> allocSrvCallL,
				MCList<LotProp_Sprt01_Dtl2R> notAllocL) {
			// 引当後に行う必要があるチェックのため、ChkオペレーションではなくUpdオペレーションで行う
			MCMessageList msgList = new MCMessageList();
			boolean hasErr = false;
			
			MCIndexKey notAllocIdxKey = notAllocL.createIndex(Srch_TgtR.$peg_no);
			// 引当サービスを実行した行に対するチェック
			
			// 代替で代替品目指定済みの場合は、指定しなかった品目を引当対象件数に含めないためのindexkey
			MCIndexKey altGrpIdxKey = allocSrvCallL.createIndex(
					MfgInstTblReg_Upd05_DtlInptR.$oper_inst_no,
					MfgInstTblReg_Upd05_DtlInptR.$alt_grp_cd,
					MfgInstTblReg_Upd05_DtlInptR.$alt_grp_seq,
					MfgInstTblReg_Upd05_DtlInptR.$alt_itm_fix_flg
					);
			for (MfgInstTblReg_Upd05_DtlInptR r : allocSrvCallL) {
				
				MfgInstTblReg_Upd05_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());

				// 投入引当バッチ用に、引当対象の件数を下り電文として返す
				boolean isCntUp = true;
				if (!isNull(r.alt_grp_cd()) && !r.alt_itm_fix_flg()) {
					// 代替グループで自身は代替品目指定されていないが、グループ内に代替品目指定している品目が存在する場合
					if (!isNull(allocSrvCallL.getFirst(altGrpIdxKey, r.oper_inst_no(), r.alt_grp_cd(),
							r.alt_grp_seq(), true))) {
						isCntUp = false;
					}
				}
				
				if (isCntUp) {
					hdrR.alloc_tgt_cnt(hdrR.alloc_tgt_cnt().add(MCNumber.ONE));
				}
				
				String dispItm = toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				String dispGUIIndex = toDispGUIIndex(r);
				
				boolean isAllocSucces = isNull(notAllocL.getFirst(notAllocIdxKey, r.peg_no()));
				
				if (!isAllocSucces) {
					// 引当出来なかった場合
					if (!r.lst_reg_flg()) {
						// 一括処理でない場合（単票画面からの更新の場合）はエラーとする
						msgList.add(new MCMessage(r, null, MSBCL1028, dispItm, dispGUIIndex));
						hasErr = true;
					}
					else {
						// 一括処理の場合は、引当ＦＬＧをfalseにするだけでエラーとしない
						r.alloc_flg(false);
						// 投入引当バッチ用に、引当できなかった件数を下り電文として返す
						if (isCntUp) {
							hdrR.alloc_failure_cnt(hdrR.alloc_failure_cnt().add(MCNumber.ONE));
						}
						if (r.is_src_batch_flg()) {
							msgList.add(new MCMessage(r, null, MSBCL1028, dispItm, dispGUIIndex));
						}
					}
				}
				else {
					if (!r.alloc_srv_add_flg()) {
						// 投入引当バッチ用に、引当できた件数を下り電文として返す
						if (isCntUp) {
							hdrR.alloc_success_cnt(hdrR.alloc_success_cnt().add(MCNumber.ONE));
						}
					}
				}
			}
			
			MCList<MfgInstTblReg_Upd05_DtlInptR> crtUpdL = allUpL.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			// 同一工程指図内の同一品目でロット・サブロットの混在をチェックするためのindexKey
			MCIndexKey lotMixIdxKey = crtUpdL.createIndex(
					MfgInstTblReg_Upd05_DtlInptR.$oper_inst_no,
					MfgInstTblReg_Upd05_DtlInptR.$itm_cd,
					MfgInstTblReg_Upd05_DtlInptR.$itm_sub1,
					MfgInstTblReg_Upd05_DtlInptR.$itm_sub2,
					MfgInstTblReg_Upd05_DtlInptR.$itm_sub3);
			// 同一工程指図内の代替Ｇで混在をチェックするためのindexKey
			MCIndexKey altMixIdxKey = crtUpdL.createIndex(
					MfgInstTblReg_Upd05_DtlInptR.$oper_inst_no,
					MfgInstTblReg_Upd05_DtlInptR.$alt_grp_cd,
					MfgInstTblReg_Upd05_DtlInptR.$alt_grp_seq,
					MfgInstTblReg_Upd05_DtlInptR.$alt_itm_fix_flg
					);
			
			// 上り電文全行に対するチェック
			for (MfgInstTblReg_Upd05_DtlInptR r : crtUpdL) {
				if (MSC_MFG_STS_TYP.isYET(r.mfg_sts_typ())) {
					// 未指図工程に紐つく投入はチェックの対象外
					continue;
				}
				String dispItm = toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				String dispGUIIndex = toDispGUIIndex(r);
				
				if (!r.is_src_outsrc_srv_flg()) {
					// 製造の機能から登録した場合のみチェックする（外注発注時にはチェックしない）

					// ロット、サブロット混在（同一工程指図内の同一品目）
					if (!MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
						MCList<MfgInstTblReg_Upd05_DtlInptR> subL = crtUpdL.subList(
								lotMixIdxKey, r.oper_inst_no(), r.itm_cd(), r.itm_sub1(),
								r.itm_sub2(), r.itm_sub3());
						
						// ロット混在チェック
						if (!r.lot_mix_flg()) {
							for (MfgInstTblReg_Upd05_DtlInptR subR : subL) {
								if (isNullOr(r.lot_no(), subR.lot_no())) {
									continue;
								}
								if (!isSame(r.inpt_schd_no(), subR.inpt_schd_no()) && !isSame(r.lot_no(), subR.lot_no())) {
									msgList.add(new MCMessage(r, null, MSBCL1030, dispItm, dispGUIIndex));
									hasErr = true;
									break;
								}
							}
						}
						if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ()) && !r.sublot_mix_flg()) {
							// サブロット混在チェック
							for (MfgInstTblReg_Upd05_DtlInptR subR : subL) {
								if (isNullOr(r.lot_no(), subR.lot_no(), r.sublot_no(), subR.sublot_no())) {
									continue;
								}

								if (!isSame(r.inpt_schd_no(), subR.inpt_schd_no())
										&& isSame(r.lot_no(), subR.lot_no())
										&& !isSame(r.sublot_no(), subR.sublot_no())) {
									msgList.add(new MCMessage(r, null, MSBCL1031, dispItm, dispGUIIndex));
									hasErr = true;
									break;
								}
							}
						}
					}
					
					// 代替Ｇ内の品目混在
					if ((MAC_ALT_ITM_TYP.isMONO_FIFO(r.alt_itm_typ())
							|| MAC_ALT_ITM_TYP.isMONO_PRIO(r.alt_itm_typ())) && r.alt_itm_fix_flg()) {
						MCList<MfgInstTblReg_Upd05_DtlInptR> altSubL = crtUpdL.subList(
								altMixIdxKey, r.oper_inst_no(), r.alt_grp_cd(), r.alt_grp_seq(), true);
						for (MfgInstTblReg_Upd05_DtlInptR subR : altSubL) {
							if (!isSame(r.inpt_schd_no(), subR.inpt_schd_no())
									&& (!isSame(r.itm_cd(), subR.itm_cd())
											|| !isSame(r.itm_sub1(), subR.itm_sub1())
											|| !isSame(r.itm_sub2(), subR.itm_sub2())
											|| !isSame(r.itm_sub3(), subR.itm_sub3()))) {
								msgList.add(new MCMessage(r, null, MSBCL1032, dispItm, dispGUIIndex));
								hasErr = true;
								break;
							}
						}
					}
				}
				
				// 指図時ロット指定、引当必須のチェックを行うかどうか
				boolean isLotAndAllocChk = true;
				if (MSC_MFG_STS_TYP.isSAV(r.mfg_sts_typ())) {
					// 指図保存の場合はチェック不要
					isLotAndAllocChk = false;
				}
				else if (!isNull(r.alt_grp_cd()) && !r.alt_itm_fix_flg()) {
					if (!isNull(crtUpdL.getFirst(altMixIdxKey, r.oper_inst_no(), r.alt_grp_cd(), r.alt_grp_seq(), true))) {
						// 同一グループ内に代替品目指定がオンの行が存在するかつ、自身の代替品目指定FLGがfalseの場合は、チェック不要
						isLotAndAllocChk = false;
					}
				}
				
				if (isLotAndAllocChk) {
					MfgInstTblReg_Upd05_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
					
					// 指図時ロット指定
					if (!MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())
							&& r.inst_lot_fix_flg() && isNullOrNullVal(r.lot_no())) {
						if (!r.lst_reg_flg()) {
							msgList.add(new MCMessage(r, MfgInstTblReg_Upd05_DtlInptR.$lot_no,
									MSBCL1026, dispItm, dispGUIIndex));
							hasErr = true;
						}
						else {
							if (!r.is_src_outsrc_srv_flg()) {
								msgList.add(new MCMessage(r, MfgInstTblReg_Upd05_DtlInptR.$lot_no,
										MSBCL1027, dispItm, dispGUIIndex));
							}
							hdrR.sts_sav_flg(true);
						}
					}
					if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())
							&& r.inst_lot_fix_flg() && isNullOrNullVal(r.sublot_no())) {
						if (!r.lst_reg_flg()) {
							// 指図時ロット指定の仕様として、ロット・サブロットの両方を確定する必要があるため、サブロットＮＯもチェックする
							msgList.add(new MCMessage(r, MfgInstTblReg_Upd05_DtlInptR.$sublot_no,
											MSBCL1005, dispItm, dispGUIIndex));
							hasErr = true;
						}
						else {
							if (!r.is_src_outsrc_srv_flg()) {
								msgList.add(new MCMessage(r, MfgInstTblReg_Upd05_DtlInptR.$sublot_no,
										MSBCL1006, dispItm, dispGUIIndex));
							}
							hdrR.sts_sav_flg(true);
						}
					}
					
					// 引当制御区分
					if (MAC_ALLOC_CTL_TYP.isALLOC_INST_NG(r.alloc_ctl_typ()) && !r.alloc_flg()) {
						if (!r.lst_reg_flg()) {
							if (!r.call_alloc_srv_flg()) {
								// 引当サービスを呼んでいる場合は、引当可能数チェックでエラーとなる。そのため、本チェックは行わない
								msgList.add(new MCMessage(r, MfgInstTblReg_Upd05_DtlInptR.$alloc_flg,
										MSBCL1050, dispItm, dispGUIIndex));
								hasErr = true;
							}
						}
						else {
							if (!r.is_src_outsrc_srv_flg()) {
								msgList.add(new MCMessage(r, MfgInstTblReg_Upd05_DtlInptR.$alloc_flg,
										MSBCL1029, dispItm, dispGUIIndex));
							}
							hdrR.sts_sav_flg(true);
						}
					}
				}
			}
			
			for (MfgInstTblReg_Upd05_DtlInptR r : allUpL) {
				MfgInstTblReg_Upd05_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
				if (hdrR.sts_sav_flg()) {
					r.hdr_mfg_sts_typ(MSC_MFG_STS_TYP.SAV.value());
					r.mfg_sts_typ(MSC_MFG_STS_TYP.SAV.value());
				}
			}

			MCMessagePool.addAll(msgList);
			if (hasErr) {
				MCAppException e = new MCAppException(msgOpeErr());
				e.addCauseMessageList(msgList);
				throw e;
			}
		}

		/**
		 * 投入予定に提案結果を反映する
		 * @param rsltL 集約した提案結果
		 */
		protected void setInptSchd(MCList<LotProp_Sprt01_Dtl2R> rsltL) {

			MCList<MfgInstTblReg_Upd05_DtlInptR> up0L = excldSSandNoMrp(_up0);
			MCIndexKey idxKey = up0L.createIndex(MfgInstTblReg_Upd05_DtlInptR.$peg_no);
			MCList<MfgInstTblReg_Upd05_DtlInptR> addL = MCList.create(MfgInstTblReg_Upd05_DtlInptR.class);
			
			for (LotProp_Sprt01_Dtl2R rsltR : rsltL) {
				MfgInstTblReg_Upd05_DtlInptR inptR = MfgInstTblReg_Upd05_DtlInptR.create();

				// 紐付けＮＯで提案結果に対する投入予定を取得。追加行の場合はcloneして投入予定に追加
				if (rsltR.add_flg()) {
					inptR = up0L.getFirst(idxKey, rsltR.peg_no()).clone();
					inptR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					inptR.inpt_schd_no(getStrSeq(MSC_NUM_SYS_TYP.INPTSCHD));
					inptR.alloc_srv_add_flg(true);
					addL.add(inptR);
				}
				else {
					inptR = up0L.getFirst(idxKey, rsltR.peg_no());
				}
				
				// 一時使用する紐付けＮＯに、投入予定と投入引当状況を紐付けるＮＯを設定
				inptR.tmp_peg_no(rsltR.sum_peg_no());
				
				// 投入予定の設定
				inptR.gd_cd(rsltR.gd_cd());
				inptR.lot_no(rsltR.lot_no());
				inptR.sublot_no(rsltR.sublot_no());
				inptR.sno1_null_flg(rsltR.sno1_null_flg());
				inptR.sno2_null_flg(rsltR.sno2_null_flg());
				inptR.sno3_null_flg(rsltR.sno3_null_flg());
				inptR.sno4_null_flg(rsltR.sno4_null_flg());
				inptR.alloc_sno1(rsltR.sno1());
				inptR.alloc_sno2(rsltR.sno2());
				inptR.alloc_sno3(rsltR.sno3());
				inptR.alloc_sno4(rsltR.sno4());

				inptR.base_unit_cd(rsltR.base_unit_cd());
				inptR.ver_no(rsltR.ver_no());
				inptR.alt_itm_fix_flg(rsltR.alt_itm_fix_flg());
				// 代替品の場合に、選択されなかった行の引当ＦＬＧをオフにする
				if (!isNull(inptR.alt_grp_cd())) {
					inptR.alloc_flg(rsltR.alt_itm_fix_flg());
				}

				// 提案結果の数量から必要数量、投入数量、固定必要数量を算出
				inptR.base_unit_inpt_qty(rsltR.inpt_qty());
				inptR.base_unit_rqmt_qty(rsltR.rqmt_qty());
				inptR.base_unit_fxd_rqmt_qty(rsltR.fxd_rqmt_qty());

				// 有効成分対象の場合
				if (inptR.cont_fctr_flg()) {
					inptR.cont_inpt_qty(rsltR.cont_inpt_qty());
					inptR.cont_rqmt_qty(rsltR.cont_rqmt_qty());
					inptR.cont_fxd_rqmt_qty(rsltR.cont_fxd_rqmt_qty());
					inptR.act_cont_fctr(rsltR.act_cont_fctr());
				}
				else {
					// 有効成分関連の数量はすべてnullを設定
					inptR.cont_inpt_qty(null);
					inptR.cont_rqmt_qty(null);
					inptR.cont_fxd_rqmt_qty(null);
					inptR.act_cont_fctr(null);
				}
				if (inptR.set_stk_str_ln_flg()) {
					inptR.inpt_str_ln_cd(rsltR.inpt_str_ln_cd());
				}
			}
			up0().addAll(addL);
			_up0.addAll(addL);
		}

		/**
		 * 投入引当状況に提案結果を反映する
		 * @param allocL
		 */
		protected void setAllocSts(MCList<LotProp_Sprt01_Dtl1R> rsltL) {

			MCList<MfgInstTblReg_Upd05_DtlInptR> up0L = excldSSandNoMrp(_up0);
			// 投入予定と投入引当状況を紐付けるＮＯに対するインデックスキー
			MCIndexKey idxKey = up0L.createIndex(MfgInstTblReg_Upd05_DtlInptR.$tmp_peg_no);

			for (LotProp_Sprt01_Dtl1R rsltR : rsltL) {

				// 数量が０の場合は作成しない
				if (rsltR.base_unit_qty().isZero()) {
					continue;
				}
				
				MfgInstTblReg_Upd05_DtlInptAllocStsR allocR = MfgInstTblReg_Upd05_DtlInptAllocStsR.create();
				MfgInstTblReg_Upd05_DtlInptR inptR = up0L.getFirst(idxKey, rsltR.sum_peg_no());

				// ロット提案結果からコピー
				copy(allocR, rsltR, createMap_MfgInstTblReg_Upd05_DtlInptAllocStsR_LotProp_Sprt01_Dtl1R());
				
				allocR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				
				// 各種ＮＯは投入予定から設定
				allocR.inpt_peg_no(inptR.peg_no());
				allocR.inpt_schd_no(inptR.inpt_schd_no());
				allocR.mfg_inst_no(inptR.mfg_inst_no());
				allocR.itm_mfg_inst_no(inptR.itm_mfg_inst_no());
				allocR.oper_inst_no(inptR.oper_inst_no());
				allocR.itm_ord_no(inptR.itm_ord_no());
				
				// callGiGrLocメソッドで使用する移動元・先の情報を設定
				allocR.gr_schd_dt(inptR.schd_tm()); //入庫予定日には投入予定日
				allocR.gr_loc_cd(inptR.inpt_loc_cd()); //入庫場所には投入場所
				allocR.gr_str_ln_cd(inptR.inpt_str_ln_cd()); //入庫棚・ラインには投入棚・ライン

				// callIoSchdInsメソッドで使用する代替品等の情報を投入予定から設定
				allocR.schd_tm(inptR.schd_tm());
				allocR.alt_itm_ratio(inptR.alt_itm_ratio());
				allocR.mfg_inst_unit_typ(inptR.mfg_inst_unit_typ());

				allocR.inpt_ctl_typ(inptR.inpt_ctl_typ());
				allocR.lot_mix_flg(inptR.lot_mix_flg());
				allocR.sublot_mix_flg(inptR.sublot_mix_flg());
				allocR.inst_dt(inptR.inst_dt());
				allocR.inst_usr_cd(inptR.inst_usr_cd());
				allocR.inst_dpt_cd(inptR.inst_dpt_cd());

				if(isNull(allocR.lot_no())) {
					if(MAC_LOT_MNG_TYP.isNOT_MNG(inptR.lot_mng_typ())) {
						allocR.lot_no(MAC_STR.NULL_VAL.value());
					}
				}
				if(isNull(allocR.sublot_no())) {
					if(MAC_SUBLOT_MNG_TYP.isNOT_MNG(inptR.sublot_mng_typ())) {
						allocR.sublot_no(MAC_STR.NULL_VAL.value());
					}
				}
				
				_allocStsL.add(allocR);
			}
		}
		
		protected Map_MSW_ALLOC_LOC_MAP_R_MfgInstTblReg_Upd05_DtlInptR<MSW_ALLOC_LOC_MAP_R,MfgInstTblReg_Upd05_DtlInptR> createMap_MSW_ALLOC_LOC_MAP_R_MfgInstTblReg_Upd05_DtlInptR() {
			return new Map_MSW_ALLOC_LOC_MAP_R_MfgInstTblReg_Upd05_DtlInptR<MSW_ALLOC_LOC_MAP_R, MfgInstTblReg_Upd05_DtlInptR>();
		}

		public class Map_MSW_ALLOC_LOC_MAP_R_MfgInstTblReg_Upd05_DtlInptR<D extends MSW_ALLOC_LOC_MAP_R, S extends MfgInstTblReg_Upd05_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_cd, MfgInstTblReg_Upd05_DtlInptR.$itm_cd);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub1, MfgInstTblReg_Upd05_DtlInptR.$itm_sub1);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub2, MfgInstTblReg_Upd05_DtlInptR.$itm_sub2);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub3, MfgInstTblReg_Upd05_DtlInptR.$itm_sub3);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$inpt_loc_cd, MfgInstTblReg_Upd05_DtlInptR.$inpt_loc_cd);
			}
		}

		protected Map_LotProp_Sprt01_Dtl1R_MfgInstTblReg_Upd05_DtlInptR<LotProp_Sprt01_Dtl1R,MfgInstTblReg_Upd05_DtlInptR> createMap_LotProp_Sprt01_Dtl1R_MfgInstTblReg_Upd05_DtlInptR() {
			return new Map_LotProp_Sprt01_Dtl1R_MfgInstTblReg_Upd05_DtlInptR<LotProp_Sprt01_Dtl1R, MfgInstTblReg_Upd05_DtlInptR>();
		}

		public class Map_LotProp_Sprt01_Dtl1R_MfgInstTblReg_Upd05_DtlInptR<D extends LotProp_Sprt01_Dtl1R, S extends MfgInstTblReg_Upd05_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$hdr_peg_no, MfgInstTblReg_Upd05_DtlInptR.$hdr_peg_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$oper_peg_no, MfgInstTblReg_Upd05_DtlInptR.$oper_peg_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$peg_no, MfgInstTblReg_Upd05_DtlInptR.$peg_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_schd_no, MfgInstTblReg_Upd05_DtlInptR.$inpt_schd_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$mfg_sts_typ, MfgInstTblReg_Upd05_DtlInptR.$mfg_sts_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_dt, MfgInstTblReg_Upd05_DtlInptR.$schd_tm);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$itm_cd, MfgInstTblReg_Upd05_DtlInptR.$itm_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$itm_sub1, MfgInstTblReg_Upd05_DtlInptR.$itm_sub1);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$itm_sub2, MfgInstTblReg_Upd05_DtlInptR.$itm_sub2);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$itm_sub3, MfgInstTblReg_Upd05_DtlInptR.$itm_sub3);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$ver_no, MfgInstTblReg_Upd05_DtlInptR.$ver_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_grp_cd, MfgInstTblReg_Upd05_DtlInptR.$alt_grp_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_grp_seq, MfgInstTblReg_Upd05_DtlInptR.$alt_grp_seq);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_itm_fix_flg, MfgInstTblReg_Upd05_DtlInptR.$alt_itm_fix_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$oper_inst_no, MfgInstTblReg_Upd05_DtlInptR.$oper_inst_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_qty, MfgInstTblReg_Upd05_DtlInptR.$base_unit_alt_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_itm_typ, MfgInstTblReg_Upd05_DtlInptR.$alt_itm_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_alloc_prio, MfgInstTblReg_Upd05_DtlInptR.$alt_alloc_prio);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_loc_cd, MfgInstTblReg_Upd05_DtlInptR.$inpt_loc_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_str_ln_cd, MfgInstTblReg_Upd05_DtlInptR.$inpt_str_ln_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$gd_cd, MfgInstTblReg_Upd05_DtlInptR.$gd_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$lot_no, MfgInstTblReg_Upd05_DtlInptR.$lot_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sublot_no, MfgInstTblReg_Upd05_DtlInptR.$sublot_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno1_null_flg, MfgInstTblReg_Upd05_DtlInptR.$sno1_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno2_null_flg, MfgInstTblReg_Upd05_DtlInptR.$sno2_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno3_null_flg, MfgInstTblReg_Upd05_DtlInptR.$sno3_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno4_null_flg, MfgInstTblReg_Upd05_DtlInptR.$sno4_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$not_lot_fix_flg, MfgInstTblReg_Upd05_DtlInptR.$no_lot_fix_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$vld_dt, MfgInstTblReg_Upd05_DtlInptR.$vld_dt);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$first_gr_dt, MfgInstTblReg_Upd05_DtlInptR.$first_gr_dt);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$lot_seq, MfgInstTblReg_Upd05_DtlInptR.$lot_seq);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_qty, MfgInstTblReg_Upd05_DtlInptR.$base_unit_inpt_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$rqmt_qty, MfgInstTblReg_Upd05_DtlInptR.$base_unit_rqmt_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$fxd_rqmt_qty, MfgInstTblReg_Upd05_DtlInptR.$base_unit_fxd_rqmt_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$base_unit_cd, MfgInstTblReg_Upd05_DtlInptR.$base_unit_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$base_unit_dec_place, MfgInstTblReg_Upd05_DtlInptR.$base_unit_dec_place);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$base_unit_rnd_typ, MfgInstTblReg_Upd05_DtlInptR.$base_unit_rnd_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_inpt_qty, MfgInstTblReg_Upd05_DtlInptR.$cont_inpt_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_rqmt_qty, MfgInstTblReg_Upd05_DtlInptR.$cont_rqmt_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_fxd_rqmt_qty, MfgInstTblReg_Upd05_DtlInptR.$cont_fxd_rqmt_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_fctr_unit_cd, MfgInstTblReg_Upd05_DtlInptR.$cont_fctr_unit_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_fctr_flg, MfgInstTblReg_Upd05_DtlInptR.$cont_fctr_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_fctr_rnd_typ, MfgInstTblReg_Upd05_DtlInptR.$cont_fctr_rnd_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_fctr_dec_place, MfgInstTblReg_Upd05_DtlInptR.$cont_fctr_dec_place);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$std_cont_fctr, MfgInstTblReg_Upd05_DtlInptR.$std_cont_fctr);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$lot_mix_flg, MfgInstTblReg_Upd05_DtlInptR.$lot_mix_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sublot_mix_flg, MfgInstTblReg_Upd05_DtlInptR.$sublot_mix_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$set_stk_str_ln_flg, MfgInstTblReg_Upd05_DtlInptR.$set_stk_str_ln_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				// 必要数量と固定必要数量の合計を算出し、基準数量に設定
				dest.base_unit_qty(MCNumber.sum(src.base_unit_rqmt_qty(), src.base_unit_fxd_rqmt_qty()));

				// 引当手配ＮＯを優先してロット提案する
				dest.rqst_sno1(nvl(src.alloc_sno1(), src.sno1()));
				dest.rqst_sno2(nvl(src.alloc_sno2(), src.sno2()));
				dest.rqst_sno3(nvl(src.alloc_sno3(), src.sno3()));
				dest.rqst_sno4(nvl(src.alloc_sno4(), src.sno4()));

				// 有効成分対象の場合、有効成分に有効成分（必要数量）＋有効成分（固定必要数量）を設定
				if (src.cont_fctr_flg()) {
					dest.cont_qty(MCNumber.sum(src.cont_rqmt_qty(), src.cont_fxd_rqmt_qty()));
				}
			}
		}

		protected Map_MfgInstTblReg_Upd05_DtlInptAllocStsR_LotProp_Sprt01_Dtl1R<MfgInstTblReg_Upd05_DtlInptAllocStsR,LotProp_Sprt01_Dtl1R> createMap_MfgInstTblReg_Upd05_DtlInptAllocStsR_LotProp_Sprt01_Dtl1R() {
			return new Map_MfgInstTblReg_Upd05_DtlInptAllocStsR_LotProp_Sprt01_Dtl1R<MfgInstTblReg_Upd05_DtlInptAllocStsR, LotProp_Sprt01_Dtl1R>();
		}

		public class Map_MfgInstTblReg_Upd05_DtlInptAllocStsR_LotProp_Sprt01_Dtl1R<D extends MfgInstTblReg_Upd05_DtlInptAllocStsR, S extends LotProp_Sprt01_Dtl1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$peg_no, LotProp_Sprt01_Dtl1R.$peg_no);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$mfg_sts_typ, LotProp_Sprt01_Dtl1R.$mfg_sts_typ);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$itm_cd, LotProp_Sprt01_Dtl1R.$itm_cd);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$itm_sub1, LotProp_Sprt01_Dtl1R.$itm_sub1);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$itm_sub2, LotProp_Sprt01_Dtl1R.$itm_sub2);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$itm_sub3, LotProp_Sprt01_Dtl1R.$itm_sub3);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$base_unit_alt_qty, LotProp_Sprt01_Dtl1R.$alt_qty);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$alt_grp_cd, LotProp_Sprt01_Dtl1R.$alt_grp_cd);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$alt_grp_seq, LotProp_Sprt01_Dtl1R.$alt_grp_seq);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$alt_itm_typ, LotProp_Sprt01_Dtl1R.$alt_itm_typ);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$alt_alloc_prio, LotProp_Sprt01_Dtl1R.$alt_alloc_prio);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$inpt_loc_cd, LotProp_Sprt01_Dtl1R.$inpt_loc_cd);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$inpt_str_ln_cd, LotProp_Sprt01_Dtl1R.$inpt_str_ln_cd);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$lot_no, LotProp_Sprt01_Dtl1R.$lot_no);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$sublot_no, LotProp_Sprt01_Dtl1R.$sublot_no);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$sno1, LotProp_Sprt01_Dtl1R.$sno1);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$sno1_null_flg, LotProp_Sprt01_Dtl1R.$sno1_null_flg);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$sno2, LotProp_Sprt01_Dtl1R.$sno2);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$sno2_null_flg, LotProp_Sprt01_Dtl1R.$sno2_null_flg);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$sno3, LotProp_Sprt01_Dtl1R.$sno3);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$sno3_null_flg, LotProp_Sprt01_Dtl1R.$sno3_null_flg);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$sno4, LotProp_Sprt01_Dtl1R.$sno4);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$sno4_null_flg, LotProp_Sprt01_Dtl1R.$sno4_null_flg);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$base_unit_cd, LotProp_Sprt01_Dtl1R.$base_unit_cd);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$gd_cd, LotProp_Sprt01_Dtl1R.$gd_cd);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$ver_no, LotProp_Sprt01_Dtl1R.$ver_no);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$cont_qty, LotProp_Sprt01_Dtl1R.$cont_qty);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$inpt_schd_no, LotProp_Sprt01_Dtl1R.$inpt_schd_no);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$oper_inst_no, LotProp_Sprt01_Dtl1R.$oper_inst_no);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$base_unit_qty, LotProp_Sprt01_Dtl1R.$base_unit_qty);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$stk_id_typ, LotProp_Sprt01_Dtl1R.$stk_id_typ);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$stk_bp_cd, LotProp_Sprt01_Dtl1R.$stk_bp_cd);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$stk_arrv_bp_cd, LotProp_Sprt01_Dtl1R.$stk_arrv_bp_cd);

				// callGiGrLocメソッドで使用する移動元・先の情報を設定
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$gi_loc_cd, LotProp_Sprt01_Dtl1R.$stk_loc_cd);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$gi_str_ln_cd, LotProp_Sprt01_Dtl1R.$stk_str_ln_cd);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$gi_stk_arrv_bp_cd, LotProp_Sprt01_Dtl1R.$stk_arrv_bp_cd);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$gi_stk_id_typ, LotProp_Sprt01_Dtl1R.$stk_id_typ);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$gi_stk_bp_cd, LotProp_Sprt01_Dtl1R.$stk_bp_cd);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$gr_loc_cd, LotProp_Sprt01_Dtl1R.$gr_loc_cd);
				addColumnPathMap(MfgInstTblReg_Upd05_DtlInptAllocStsR.$gr_str_ln_cd, LotProp_Sprt01_Dtl1R.$gr_str_ln_cd);
			}
		}

		/**
		 * 投入引当状況の編集
		 */
		protected void editAllocSts() {
			// 投入引当状況の対象が存在しない場合、この処理は行わない
			if (_allocStsL.isEmpty()) {
				return ;
			}

			// 投入引当状況ＮＯの発番（発番システム区分）
			int cacheSize = _allocStsL.size();
			doSeqCache(MSC_NUM_SYS_TYP.INPTALLOC, cacheSize);

			// 入庫場所補完ユーティリティから結果を取得するための紐付けＮＯを発番
			setPegNo(_allocStsL);
			//　ユーティリティを実行
			MCList<GiGr_LocR> giGrL = MCList.create(GiGr_LocR.class);
			setAll(giGrL, _allocStsL, createMap_GiGr_LocR_MfgInstTblReg_Upd05_DtlInptAllocStsR());
			MSUCL_GiGrLocUtil.setLocInfo(giGrL);
			MCIndexKey giGrKey = giGrL.createIndex(GiGr_LocR.$peg_no);
			
			for (MfgInstTblReg_Upd05_DtlInptAllocStsR r : _allocStsL) {
				// 投入引当状況ＮＯの設定
				r.inpt_alloc_sts_no(getStrSeq(MSC_NUM_SYS_TYP.INPTALLOC));
				
				// ユーティリティの実行結果から移動先の在庫情報を設定
				GiGr_LocR giGrR = giGrL.getFirst(giGrKey, r.peg_no());
				r.to_stk_id_typ(nvl(giGrR.gr_stk_id_typ(), r.stk_id_typ()));
				r.to_stk_bp_cd(nvl(giGrR.gr_stk_bp_cd(), r.stk_bp_cd()));
				r.to_stk_arrv_bp_cd(nvl(giGrR.gr_stk_arrv_bp_cd(), r.stk_arrv_bp_cd()));
			}
		}

		protected Map_GiGr_LocR_MfgInstTblReg_Upd05_DtlInptAllocStsR<GiGr_LocR,MfgInstTblReg_Upd05_DtlInptAllocStsR> createMap_GiGr_LocR_MfgInstTblReg_Upd05_DtlInptAllocStsR() {
			return new Map_GiGr_LocR_MfgInstTblReg_Upd05_DtlInptAllocStsR<GiGr_LocR, MfgInstTblReg_Upd05_DtlInptAllocStsR>();
		}

		public class Map_GiGr_LocR_MfgInstTblReg_Upd05_DtlInptAllocStsR<D extends GiGr_LocR, S extends MfgInstTblReg_Upd05_DtlInptAllocStsR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(GiGr_LocR.$peg_no, MfgInstTblReg_Upd05_DtlInptAllocStsR.$peg_no);
				addColumnPathMap(GiGr_LocR.$itm_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$itm_cd);
				addColumnPathMap(GiGr_LocR.$itm_sub1, MfgInstTblReg_Upd05_DtlInptAllocStsR.$itm_sub1);
				addColumnPathMap(GiGr_LocR.$itm_sub2, MfgInstTblReg_Upd05_DtlInptAllocStsR.$itm_sub2);
				addColumnPathMap(GiGr_LocR.$itm_sub3, MfgInstTblReg_Upd05_DtlInptAllocStsR.$itm_sub3);
				addColumnPathMap(GiGr_LocR.$gi_str_ln_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$gi_str_ln_cd);
				addColumnPathMap(GiGr_LocR.$gi_stk_arrv_bp_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$gi_stk_arrv_bp_cd);
				addColumnPathMap(GiGr_LocR.$gi_stk_id_typ, MfgInstTblReg_Upd05_DtlInptAllocStsR.$gi_stk_id_typ);
				addColumnPathMap(GiGr_LocR.$gi_stk_bp_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$gi_stk_bp_cd);
				addColumnPathMap(GiGr_LocR.$gr_loc_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$gr_loc_cd);
				addColumnPathMap(GiGr_LocR.$gr_str_ln_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$gr_str_ln_cd);
				addColumnPathMap(GiGr_LocR.$gr_schd_dt, MfgInstTblReg_Upd05_DtlInptAllocStsR.$gr_schd_dt);
				addColumnPathMap(GiGr_LocR.$gi_loc_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$gi_loc_cd);
			}
		}

		/**
		 * 移動・移送予定の追加
		 */
		protected void callXfrSchdIns() {
			// 投入引当状況のレコードから削除以外のレコードを抽出
			MCList<MfgInstTblReg_Upd05_DtlInptAllocStsR> inptAllocL = MCList.create(MfgInstTblReg_Upd05_DtlInptAllocStsR.class);
			// 新規登録する場合は、ここでChk04を呼び出す（引当前の場合、チェック処理では移動・移送予定を追加するか否かが決まらないため）
			MCList<MfgInstTblReg_Upd05_DtlInptAllocStsR> chk04L = MCList.create(MfgInstTblReg_Upd05_DtlInptAllocStsR.class);
			for (MfgInstTblReg_Upd05_DtlInptAllocStsR r : _allocStsL) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				// 出庫場所と投入場所または出庫棚・ラインと投入棚・ラインが異なる場合、移動・移送予定の作成対象とする
				if (!isSame(r.gi_loc_cd(), r.inpt_loc_cd()) || !isSame(r.gi_str_ln_cd(), r.inpt_str_ln_cd())) {
					inptAllocL.add(r);
					chk04L.add(r);
				}
			}
			
			if (!chk04L.isEmpty()) {
				MSBEL_XfrSchdService.XfrSchd_Chk04 chkOpe = MSBEL_XfrSchdService.crtXfrSchd_Chk04();
				addAll(chkOpe.up0(), chk04L, createMap_XfrSchdChk04_DtlR_MfgInstTblReg_Upd05_DtlInptAllocStsR());
				
				MCMessageList bfrMsgL = (MCMessageList)MCMessagePool.getMessageList().clone();
				MCMessagePool.clear();
				chkOpe.exec();
				// 一件でもエラーがあった場合は例外をthrowする
				if (!isNull(chkOpe.down0().getFirst(XfrSchdChk04_DtlR.$err_flg, true))) {
					MCAppException e = new MCAppException(msgOpeErr());
					e.addCauseMessageList(MCMessagePool.getMessageList());
					throw e;
				}
				// 元に戻す
				MCMessagePool.addAll(bfrMsgL);
			}
			
			// 移送・移送予定サービスの実行
			if (!inptAllocL.isEmpty()) {
				MSBEL_XfrSchdService.XfrSchd_Upd01 xfr = MSBEL_XfrSchdService.crtXfrSchd_Upd01();
				addAll(xfr.up0(), inptAllocL, createMap_XfrSchd_DtlR_MfgInstTblReg_Upd05_DtlInptAllocStsR());
				xfr.exec();
			}
		}
		
		protected Map_XfrSchdChk04_DtlR_MfgInstTblReg_Upd05_DtlInptR<XfrSchdChk04_DtlR,MfgInstTblReg_Upd05_DtlInptR> createMap_XfrSchdChk04_DtlR_MfgInstTblReg_Upd05_DtlInptR() {
			return new Map_XfrSchdChk04_DtlR_MfgInstTblReg_Upd05_DtlInptR<XfrSchdChk04_DtlR, MfgInstTblReg_Upd05_DtlInptR>();
		}

		public class Map_XfrSchdChk04_DtlR_MfgInstTblReg_Upd05_DtlInptR<D extends XfrSchdChk04_DtlR, S extends MfgInstTblReg_Upd05_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchdChk04_DtlR.$peg_no, MfgInstTblReg_Upd05_DtlInptR.$peg_no);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_cd, MfgInstTblReg_Upd05_DtlInptR.$itm_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_sub1, MfgInstTblReg_Upd05_DtlInptR.$itm_sub1);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_sub2, MfgInstTblReg_Upd05_DtlInptR.$itm_sub2);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_sub3, MfgInstTblReg_Upd05_DtlInptR.$itm_sub3);
				addColumnPathMap(XfrSchdChk04_DtlR.$gr_loc_cd, MfgInstTblReg_Upd05_DtlInptR.$inpt_loc_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$gr_rqst_tm, MfgInstTblReg_Upd05_DtlInptR.$schd_tm);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.xfr_src_typ(MSC_XFR_SRC_TYP.INPT.value());
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
		}
		
		protected Map_XfrSchdChk04_DtlR_MfgInstTblReg_Upd05_DtlInptAllocStsR<XfrSchdChk04_DtlR,MfgInstTblReg_Upd05_DtlInptAllocStsR> createMap_XfrSchdChk04_DtlR_MfgInstTblReg_Upd05_DtlInptAllocStsR() {
			return new Map_XfrSchdChk04_DtlR_MfgInstTblReg_Upd05_DtlInptAllocStsR<XfrSchdChk04_DtlR, MfgInstTblReg_Upd05_DtlInptAllocStsR>();
		}

		public class Map_XfrSchdChk04_DtlR_MfgInstTblReg_Upd05_DtlInptAllocStsR<D extends XfrSchdChk04_DtlR, S extends MfgInstTblReg_Upd05_DtlInptAllocStsR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchdChk04_DtlR.$peg_no, MfgInstTblReg_Upd05_DtlInptAllocStsR.$peg_no);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$itm_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_sub1, MfgInstTblReg_Upd05_DtlInptAllocStsR.$itm_sub1);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_sub2, MfgInstTblReg_Upd05_DtlInptAllocStsR.$itm_sub2);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_sub3, MfgInstTblReg_Upd05_DtlInptAllocStsR.$itm_sub3);
				addColumnPathMap(XfrSchdChk04_DtlR.$gi_loc_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$gi_loc_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$gi_str_ln_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$gi_str_ln_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$gr_loc_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$inpt_loc_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$gr_str_ln_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$inpt_str_ln_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$gr_rqst_tm, MfgInstTblReg_Upd05_DtlInptAllocStsR.$schd_tm);
				addColumnPathMap(XfrSchdChk04_DtlR.$xfr_src_no, MfgInstTblReg_Upd05_DtlInptAllocStsR.$inpt_alloc_sts_no);
				addColumnPathMap(XfrSchdChk04_DtlR.$gi_stk_arrv_bp_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$gi_stk_arrv_bp_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$stk_id_typ, MfgInstTblReg_Upd05_DtlInptAllocStsR.$gi_stk_id_typ);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.xfr_src_typ(MSC_XFR_SRC_TYP.INPT.value());
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
		}
		
		protected Map_XfrSchd_DtlR_MfgInstTblReg_Upd05_DtlInptAllocStsR<XfrSchd_DtlR,MfgInstTblReg_Upd05_DtlInptAllocStsR> createMap_XfrSchd_DtlR_MfgInstTblReg_Upd05_DtlInptAllocStsR() {
			return new Map_XfrSchd_DtlR_MfgInstTblReg_Upd05_DtlInptAllocStsR<XfrSchd_DtlR, MfgInstTblReg_Upd05_DtlInptAllocStsR>();
		}

		public class Map_XfrSchd_DtlR_MfgInstTblReg_Upd05_DtlInptAllocStsR<D extends XfrSchd_DtlR, S extends MfgInstTblReg_Upd05_DtlInptAllocStsR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchd_DtlR.$peg_no, MfgInstTblReg_Upd05_DtlInptAllocStsR.$peg_no);
				addColumnPathMap(XfrSchd_DtlR.$xfr_src_no, MfgInstTblReg_Upd05_DtlInptAllocStsR.$inpt_alloc_sts_no); //移動・移送元ＮＯには投入引当状況ＮＯ
				addColumnPathMap(XfrSchd_DtlR.$mfg_inst_no, MfgInstTblReg_Upd05_DtlInptAllocStsR.$mfg_inst_no);
				addColumnPathMap(XfrSchd_DtlR.$oper_inst_no, MfgInstTblReg_Upd05_DtlInptAllocStsR.$oper_inst_no);
				addColumnPathMap(XfrSchd_DtlR.$inpt_schd_no, MfgInstTblReg_Upd05_DtlInptAllocStsR.$inpt_schd_no);
				addColumnPathMap(XfrSchd_DtlR.$itm_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$itm_cd);
				addColumnPathMap(XfrSchd_DtlR.$itm_sub1, MfgInstTblReg_Upd05_DtlInptAllocStsR.$itm_sub1);
				addColumnPathMap(XfrSchd_DtlR.$itm_sub2, MfgInstTblReg_Upd05_DtlInptAllocStsR.$itm_sub2);
				addColumnPathMap(XfrSchd_DtlR.$itm_sub3, MfgInstTblReg_Upd05_DtlInptAllocStsR.$itm_sub3);
				addColumnPathMap(XfrSchd_DtlR.$gi_loc_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$gi_loc_cd);
				addColumnPathMap(XfrSchd_DtlR.$gi_str_ln_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$gi_str_ln_cd);
				addColumnPathMap(XfrSchd_DtlR.$gi_stk_arrv_bp_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$gi_stk_arrv_bp_cd);
				addColumnPathMap(XfrSchd_DtlR.$lot_no, MfgInstTblReg_Upd05_DtlInptAllocStsR.$lot_no);
				addColumnPathMap(XfrSchd_DtlR.$sublot_no, MfgInstTblReg_Upd05_DtlInptAllocStsR.$sublot_no);
				addColumnPathMap(XfrSchd_DtlR.$sno1, MfgInstTblReg_Upd05_DtlInptAllocStsR.$sno1);
				addColumnPathMap(XfrSchd_DtlR.$sno1_null_flg, MfgInstTblReg_Upd05_DtlInptAllocStsR.$sno1_null_flg);
				addColumnPathMap(XfrSchd_DtlR.$sno2, MfgInstTblReg_Upd05_DtlInptAllocStsR.$sno2);
				addColumnPathMap(XfrSchd_DtlR.$sno2_null_flg, MfgInstTblReg_Upd05_DtlInptAllocStsR.$sno2_null_flg);
				addColumnPathMap(XfrSchd_DtlR.$sno3, MfgInstTblReg_Upd05_DtlInptAllocStsR.$sno3);
				addColumnPathMap(XfrSchd_DtlR.$sno3_null_flg, MfgInstTblReg_Upd05_DtlInptAllocStsR.$sno3_null_flg);
				addColumnPathMap(XfrSchd_DtlR.$sno4, MfgInstTblReg_Upd05_DtlInptAllocStsR.$sno4);
				addColumnPathMap(XfrSchd_DtlR.$sno4_null_flg, MfgInstTblReg_Upd05_DtlInptAllocStsR.$sno4_null_flg);
				addColumnPathMap(XfrSchd_DtlR.$base_unit_qty, MfgInstTblReg_Upd05_DtlInptAllocStsR.$base_unit_qty);
				addColumnPathMap(XfrSchd_DtlR.$base_unit_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$base_unit_cd);
				addColumnPathMap(XfrSchd_DtlR.$trd_unit_qty, MfgInstTblReg_Upd05_DtlInptAllocStsR.$base_unit_qty); //取引単位には基準単位
				addColumnPathMap(XfrSchd_DtlR.$trd_unit_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$base_unit_cd);
				addColumnPathMap(XfrSchd_DtlR.$gd_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$gd_cd);
				addColumnPathMap(XfrSchd_DtlR.$stk_id_typ, MfgInstTblReg_Upd05_DtlInptAllocStsR.$gi_stk_id_typ);
				addColumnPathMap(XfrSchd_DtlR.$stk_bp_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$gi_stk_bp_cd);
				addColumnPathMap(XfrSchd_DtlR.$cont_qty, MfgInstTblReg_Upd05_DtlInptAllocStsR.$cont_qty);
				addColumnPathMap(XfrSchd_DtlR.$ver_no, MfgInstTblReg_Upd05_DtlInptAllocStsR.$ver_no);
				addColumnPathMap(XfrSchd_DtlR.$gr_loc_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$inpt_loc_cd); //入庫場所は投入場所
				addColumnPathMap(XfrSchd_DtlR.$gr_str_ln_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$inpt_str_ln_cd);
				addColumnPathMap(XfrSchd_DtlR.$gr_rqst_tm, MfgInstTblReg_Upd05_DtlInptAllocStsR.$schd_tm); //入庫希望日は投入予定日
				addColumnPathMap(XfrSchd_DtlR.$vld_dt_fr, MfgInstTblReg_Upd05_DtlInptAllocStsR.$schd_tm); //有効期限は投入予定日
				addColumnPathMap(XfrSchd_DtlR.$rcpt_dt, MfgInstTblReg_Upd05_DtlInptAllocStsR.$inst_dt);
				addColumnPathMap(XfrSchd_DtlR.$rqst_usr_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$inst_usr_cd);
				addColumnPathMap(XfrSchd_DtlR.$rqst_dpt_cd, MfgInstTblReg_Upd05_DtlInptAllocStsR.$inst_dpt_cd);
				
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value()); //データ更新区分は新規
				dest.xfr_src_typ(MSC_XFR_SRC_TYP.INPT.value()); //移動・移送元区分は投入
				dest.quality_typ(MAC_QUALITY_TYP.GOOD.value()); //良品区分は良品
				dest.not_lot_mix_flg(!src.lot_mix_flg());
				dest.not_sublot_mix_flg(!src.sublot_mix_flg());
				dest.alloc_flg(true); //引当時しか移動・移送予定を作成しないため、常にtrue
			}
		}

		/**
		 * 受払予定の作成
		 */
		protected void callIoSchdIns() {

			// 上り電文から新規・更新行を抽出
			MCList<MfgInstTblReg_Upd05_DtlInptR> insL = up0()
					.subList(r -> MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()));
			
			if (insL.isEmpty()) {
				return;
			}

			MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd09 ioSchdIns = MSBCL_MfgInstTblRegService.crtMfgInstTblReg_Upd09();
			addAll(ioSchdIns.up0(), insL, createMap_MfgInstTblReg_Upd09_DtlInptR_MfgInstTblReg_Upd05_DtlInptR());
			ioSchdIns.exec();
		}

		/**
		 * 投入予定から受払予定作成サービスの追加オペレーションへのマッピング
		 * @return
		 */
		protected Map_MfgInstTblReg_Upd09_DtlInptR_MfgInstTblReg_Upd05_DtlInptR<MfgInstTblReg_Upd09_DtlInptR,MfgInstTblReg_Upd05_DtlInptR> createMap_MfgInstTblReg_Upd09_DtlInptR_MfgInstTblReg_Upd05_DtlInptR() {
			return new Map_MfgInstTblReg_Upd09_DtlInptR_MfgInstTblReg_Upd05_DtlInptR<MfgInstTblReg_Upd09_DtlInptR, MfgInstTblReg_Upd05_DtlInptR>();
		}

		public class Map_MfgInstTblReg_Upd09_DtlInptR_MfgInstTblReg_Upd05_DtlInptR<D extends MfgInstTblReg_Upd09_DtlInptR, S extends MfgInstTblReg_Upd05_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstTblReg_Upd09_DtlInptR.$inpt_schd_no, MfgInstTblReg_Upd05_DtlInptR.$inpt_schd_no);
				// ヘッダの製造状況区分を設定する。設定しない場合はUpd09が製造指図を参照して製造状況区分を取得するが、
				// 製造指図一覧登録の引当エラー時などで「指図保存」を設定したい場合、この処理が呼ばれている時点では製造指図に「指図済」が設定されているため、
				// ここでヘッダの製造状況区分を渡すようにしている。
				addColumnPathMap(MfgInstTblReg_Upd09_DtlInptR.$mfg_sts_typ, MfgInstTblReg_Upd05_DtlInptR.$hdr_mfg_sts_typ);
			}
		}

		/**
		 * 投入予定の登録
		 */
		protected void inptSchdReg() {
			MCList<MST_INPT_SCHD_R> insL = MCList.create(MST_INPT_SCHD_R.class);
			MCList<MST_INPT_SCHD_R> updL = MCList.create(MST_INPT_SCHD_R.class);
			MCList<MST_INPT_SCHD_R> delL = MCList.create(MST_INPT_SCHD_R.class);
			MCList<MST_INPT_SCHD_R> yetUpdL = MCList.create(MST_INPT_SCHD_R.class);
			MCList<MST_INPT_SCHD_R> insSeqL = MCList.create(MST_INPT_SCHD_R.class);
			MCList<MST_INPT_SCHD_R> updSeqL = MCList.create(MST_INPT_SCHD_R.class);
			MCList<MST_INPT_SCHD_R> delSeqL = MCList.create(MST_INPT_SCHD_R.class);
			for (MfgInstTblReg_Upd05_DtlInptR r : _up0) {
				inptSchdReg(r, insL, updL, delL, yetUpdL);
			}

			for (MfgInstTblReg_Upd05_DtlInptR r : _up0_seq) {
				inptSchdReg(r, insSeqL, updSeqL, delSeqL, yetUpdL);
			}

			MST_INPT_SCHD_R t = MST_INPT_SCHD_R.create("T");
			// 新規追加
			if (!insL.isEmpty()) {
				dbInsertEx("MSBCL6010_MST_INPT_SCHD_I01", insL, MCQueryApiBuilder.create(t));
			}
			// 更新
			if (!updL.isEmpty()) {
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				editUpdSetStmt(updL, t, updL_bldr);
				dbUpdateKey("MSBCL6010_MST_INPT_SCHD_U01", updL, updL_bldr);
			}
			// 削除（論理削除）
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(t);
				editDelSetStmt(delL, t, delL_bldr);
				dbUpdateKey("MSBCL6010_MST_INPT_SCHD_U02", delL, delL_bldr);
			}

			// 表示順のみ更新
			if (!insSeqL.isEmpty()) {
				dbInsertEx("MSBCL6010_MST_INPT_SCHD_I02", insSeqL, MCQueryApiBuilder.create(t));
			}
			// 更新
			if (!updSeqL.isEmpty()) {
				MCQueryApiBuilder updSeqL_bldr = MCQueryApiBuilder.create(t);
				editUpdSetStmtSeq(updSeqL, t, updSeqL_bldr);
				dbUpdateKey("MSBCL6010_MST_INPT_SCHD_U03", updSeqL, updSeqL_bldr);
			}
			// 削除（論理削除）
			if (!delSeqL.isEmpty()) {
				MCQueryApiBuilder delSeqL_bldr = MCQueryApiBuilder.create(t);
				editDelSetStmt(delSeqL, t, delSeqL_bldr);
				dbUpdateKey("MSBCL6010_MST_INPT_SCHD_U04", delSeqL, delSeqL_bldr);
			}
			// 更新（未指図に戻す）
			if (!yetUpdL.isEmpty()) {
				MCQueryApiBuilder yetUpdL_bldr = MCQueryApiBuilder.create(t);
				yetUpdL_bldr.setSet(t.mfg_inst_no, t.alloc_flg);
				dbUpdateKey("MSBCL6010_MST_INPT_SCHD_U05", yetUpdL, yetUpdL_bldr);
			}
		}
		/**
		 * 投入実績残テーブルの登録
		 * 
		 */
		protected void inptSchdReg(
				MfgInstTblReg_Upd05_DtlInptR r,
				MCList<MST_INPT_SCHD_R> insL,
				MCList<MST_INPT_SCHD_R> updL,
				MCList<MST_INPT_SCHD_R> delL,
				MCList<MST_INPT_SCHD_R> yetUpdL) {
			if (r.inst_abort_flg() || 
					(MAC_MFG_INST_UNIT_TYP.isOPER(r.mfg_inst_unit_typ()) && r.not_header_inst_abort_flg() && (r.old_inst_abort_flg() && !r.inst_abort_flg())) ) {
					// 打切ＦＬＧがオンの場合（打切）、または工程単位製造指図且つ、打切ＦＬＧがオンからオフに変更された場合（打切取消）は更新不可のため、何もしない
				return;
			}

			// 新規追加
			if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				insL.add(r.inpt_schd());
			}
			// 更新
			else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
				if (r.not_frst_inst_can_flg()) {
					// 初回以外の製造指図の取消の場合、製造指図ＮＯをクリアし、引当を解除
					MST_INPT_SCHD_R tmp = MST_INPT_SCHD_R.create();
					tmp.mfg_inst_no(null);
					tmp.alloc_flg(false);
					tmp.inpt_schd_no(r.inpt_schd_no());
					yetUpdL.add(tmp);
				}
				else {
					updL.add(r.inpt_schd());
				}
			}
			// 削除
			else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				r.can_flg(true);
				delL.add(r.inpt_schd());
			}
		}

		/**
		 * 更新時のset句の編集
		 */
		protected void editUpdSetStmt(MCList<MST_INPT_SCHD_R> updL, MST_INPT_SCHD_R t, MCQueryApiBuilder updL_bldr) {

			// 品目製造指図ＮＯ、工程指図ＮＯ、取消ＦＬＧは更新対象としない
			updL_bldr.setSet(t.mfg_inst_no, t.schd_tm,
					t.alt_grp_cd, t.alt_grp_seq,
					t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
					t.ver_no,
					t.base_unit_inpt_qty, t.base_unit_rqmt_qty,
					t.base_unit_fxd_rqmt_qty, t.base_unit_cd,
					t.inpt_loc_cd, t.inpt_str_ln_cd, t.gd_cd,
					t.inpt_rsn_cd, t.lot_no, t.sublot_no,
					t.sno1, t.sno1_null_flg,
					t.sno2, t.sno2_null_flg,
					t.sno3, t.sno3_null_flg,
					t.sno4, t.sno4_null_flg,
					t.alloc_sno1, t.alloc_sno2, t.alloc_sno3,
					t.alloc_sno4, t.bkf_typ,
					t.cont_inpt_qty, t.cont_rqmt_qty,
					t.cont_fxd_rqmt_qty, t.cont_fctr_unit_cd,
					t.std_cont_fctr, t.act_cont_fctr,
					t.prov_typ, t.par_inst_qty,
					t.chd_inpt_qty, t.chd_rqmt_qty,
					t.fxd_chd_rqmt_qty, t.main_itm_flg,
					t.inst_lot_fix_flg, t.disp_seq,
					t.lot_mix_flg, t.sublot_mix_flg,
					t.bom_memo1, t.bom_memo2, t.bom_memo3,
					t.yield_calc_flg, t.alloc_flg,
					t.base_unit_alt_qty, t.alt_itm_fix_flg,
					t.alt_itm_typ, t.alt_alloc_prio,
					t.alt_itm_ratio, t.alloc_ctl_typ,
					t.inpt_ctl_typ, t.in_offst_typ, t.in_offst,
					t.bom_id_no, t.chd_itm_seq,
					t.recalc_grp, t.recalc_grp_seq,
					t.intr_rmrks, t.inst_rpt_rmrks,
					t.sub_char1, t.sub_char2, t.sub_char3);
		}

		/**
		 * 表示順のみ更新時のset句の編集
		 */
		protected void editUpdSetStmtSeq(MCList<MST_INPT_SCHD_R> updL, MST_INPT_SCHD_R t, MCQueryApiBuilder updL_bldr) {
			updL_bldr.setSet(t.disp_seq);
		}

		/**
		 * 論理削除時のset句の編集
		 */
		protected void editDelSetStmt(MCList<MST_INPT_SCHD_R> delL, MST_INPT_SCHD_R t, MCQueryApiBuilder delL_bldr) {
			// 取消ＦＬＧのみを更新対象とする
			delL_bldr.setSet(t.can_flg);
		}

		/**
		 * 投入引当状況の登録
		 * 
		 * 投入引当状況は常に削除して新規追加する
		 * 削除は投入予定単位に実施する
		 */
		protected void inptAllocStsReg() {

			// 投入予定ＮＯをキーに削除
			MCList<MfgInstTblReg_Upd05_DtlInptR> delL = MCList.create(MfgInstTblReg_Upd05_DtlInptR.class);
			for (MfgInstTblReg_Upd05_DtlInptR r : excldSSandNoMrp(_up0)) {
				delL.add(r);
			}
			if (!delL.isEmpty()) {
				MST_INPT_ALLOC_STS_R t = MST_INPT_ALLOC_STS_R.create("T");

				execDbDelete("MSBCL6010_MST_INPT_ALLOC_STS_D01", t, t.inpt_schd_no.eq(bind("inpt_schd_no")), delL);
			}
			
			// 新規追加
			MCList<MST_INPT_ALLOC_STS_R> insL = MCList.create(MST_INPT_ALLOC_STS_R.class);
			for (MfgInstTblReg_Upd05_DtlInptAllocStsR r : _allocStsL) {
				insL.add(r.inpt_alloc());
			}
			if (insL.size() > 0) {
				dbInsertEx("MSBCL6010_MST_INPT_ALLOC_STS_I01", insL,
						MCQueryApiBuilder.create(MST_INPT_ALLOC_STS_R.create("T")));
			}
		}

		/**
		 * 投入実績残テーブルの登録
		 * 
		 */
		protected void inptActRemReg() {
			MCList<MST_INPT_ACT_REM_R> insL = MCList.create(MST_INPT_ACT_REM_R.class);
			MCList<MST_INPT_ACT_REM_R> updL = MCList.create(MST_INPT_ACT_REM_R.class);
			MCList<MST_INPT_ACT_REM_R> stsUpdL = MCList.create(MST_INPT_ACT_REM_R.class);
			for (MfgInstTblReg_Upd05_DtlInptR r : _up0) {
				setActRem(r, insL, updL, stsUpdL);
			}
			
			for (MfgInstTblReg_Upd05_DtlInptR r : _up0_seq) {
				setActRem(r, insL, updL, stsUpdL);
			}
			
			// 新規追加
			if (!insL.isEmpty()) {
				dbInsertEx("MSBCL6010_MST_INPT_ACT_REM_I01", insL,
						MCQueryApiBuilder.create(MST_INPT_ACT_REM_R.create("T")));
			}
			// 更新
			if (!updL.isEmpty()) {
				dbUpdateKey("MSBCL6010_MST_INPT_ACT_REM_U01", updL,
						MCQueryApiBuilder.create(MST_INPT_ACT_REM_R.create("T")));
			}
			// 打切・打切取消・未指図に更新
			if (!stsUpdL.isEmpty()) {
				MST_INPT_ACT_REM_R t = MST_INPT_ACT_REM_R.create("T");
				MCQueryApiBuilder stsUpdL_bldr = MCQueryApiBuilder.create(t);
				stsUpdL_bldr.setSet(t.mfg_sts_typ);
				dbUpdateKey("MSBCL6010_MST_INPT_ACT_REM_U02", stsUpdL, stsUpdL_bldr);
			}
		}
		
		protected void setActRem(MfgInstTblReg_Upd05_DtlInptR r,
				MCList<MST_INPT_ACT_REM_R> insL,
				MCList<MST_INPT_ACT_REM_R> updL,
				MCList<MST_INPT_ACT_REM_R> stsUpdL) {
			// 上り電文の投入予定から投入実績残のＤＢコンテナへ値を設定
			MST_INPT_ACT_REM_R remR = MST_INPT_ACT_REM_R.create();
			copy(remR, r, createMap_MST_INPT_ACT_REM_R_MfgInstTblReg_Upd05_DtlInptR());
			
			if (r.inst_abort_flg()) {
				// 打切ＦＬＧがオンの場合（打切）は製造指図進捗状況を完了にして更新
				remR.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
				stsUpdL.add(remR);
			}
			else if (r.old_inst_abort_flg() && !r.inst_abort_flg()) {
				if(MAC_MFG_INST_UNIT_TYP.isOPER(r.mfg_inst_unit_typ()) && r.not_header_inst_abort_flg()) {
					// 打切ＦＬＧがオンからオフに変更された場合（打切取消）は製造指図状況を未指図で更新
					remR.mfg_sts_typ(MSC_MFG_STS_TYP.YET.value());
				} else {
					// 打切ＦＬＧがオンからオフに変更された場合（打切取消）は製造指図状況をヘッダの値で更新
					remR.mfg_sts_typ(r.hdr_mfg_sts_typ());
				}
				stsUpdL.add(remR);
			}
			else if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				insL.add(remR);
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
				if (r.not_frst_inst_can_flg()) {
					// 初回以外の製造指図の取消の場合、ステータスのみを更新（未指図）
					stsUpdL.add(remR);
				}
				else {
					updL.add(remR);
				}
			}
			else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				// 何もしない
			}
		}

		protected Map_MST_INPT_ACT_REM_R_MfgInstTblReg_Upd05_DtlInptR<MST_INPT_ACT_REM_R,MfgInstTblReg_Upd05_DtlInptR> createMap_MST_INPT_ACT_REM_R_MfgInstTblReg_Upd05_DtlInptR() {
			return new Map_MST_INPT_ACT_REM_R_MfgInstTblReg_Upd05_DtlInptR<MST_INPT_ACT_REM_R, MfgInstTblReg_Upd05_DtlInptR>();
		}

		public class Map_MST_INPT_ACT_REM_R_MfgInstTblReg_Upd05_DtlInptR<D extends MST_INPT_ACT_REM_R, S extends MfgInstTblReg_Upd05_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_INPT_ACT_REM_R.$inpt_schd_no, MfgInstTblReg_Upd05_DtlInptR.$inpt_schd_no);
				addColumnPathMap(MST_INPT_ACT_REM_R.$mfg_sts_typ, MfgInstTblReg_Upd05_DtlInptR.$mfg_sts_typ);
				addColumnPathMap(MST_INPT_ACT_REM_R.$mfg_inst_no, MfgInstTblReg_Upd05_DtlInptR.$mfg_inst_no);
				addColumnPathMap(MST_INPT_ACT_REM_R.$itm_mfg_inst_no, MfgInstTblReg_Upd05_DtlInptR.$itm_mfg_inst_no);
				addColumnPathMap(MST_INPT_ACT_REM_R.$oper_inst_no, MfgInstTblReg_Upd05_DtlInptR.$oper_inst_no);

				// 残数量は投入予定の各項目の値
				addColumnPathMap(MST_INPT_ACT_REM_R.$base_unit_inpt_rem_qty, MfgInstTblReg_Upd05_DtlInptR.$base_unit_inpt_qty);
				addColumnPathMap(MST_INPT_ACT_REM_R.$base_unit_rqmt_rem_qty, MfgInstTblReg_Upd05_DtlInptR.$base_unit_rqmt_qty);
				addColumnPathMap(MST_INPT_ACT_REM_R.$base_unit_fxd_rqmt_rem_qty, MfgInstTblReg_Upd05_DtlInptR.$base_unit_fxd_rqmt_qty);
				addColumnPathMap(MST_INPT_ACT_REM_R.$cont_inpt_rem_qty, MfgInstTblReg_Upd05_DtlInptR.$cont_inpt_qty);
				addColumnPathMap(MST_INPT_ACT_REM_R.$cont_rqmt_rem_qty, MfgInstTblReg_Upd05_DtlInptR.$cont_rqmt_qty);
				addColumnPathMap(MST_INPT_ACT_REM_R.$cont_fxd_rqmt_rem_qty, MfgInstTblReg_Upd05_DtlInptR.$cont_fxd_rqmt_qty);

				addColumnPathMap(MST_INPT_ACT_REM_R.$sub_char1, MfgInstTblReg_Upd05_DtlInptR.$rem_sub_char1);
				addColumnPathMap(MST_INPT_ACT_REM_R.$sub_char2, MfgInstTblReg_Upd05_DtlInptR.$rem_sub_char2);
				addColumnPathMap(MST_INPT_ACT_REM_R.$sub_char3, MfgInstTblReg_Upd05_DtlInptR.$rem_sub_char3);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.div_seq(MCNumber.ZERO); //分割連番はゼロ固定
				
				// 着手数量はゼロ固定
				dest.base_unit_inpt_qty(MCNumber.ZERO);
				dest.base_unit_rqmt_qty(MCNumber.ZERO);
				dest.base_unit_fxd_rqmt_qty(MCNumber.ZERO);
				dest.cont_inpt_qty(MCNumber.ZERO);
				dest.cont_rqmt_qty(MCNumber.ZERO);
				dest.cont_fxd_rqmt_qty(MCNumber.ZERO);

				//　打切数量はゼロ固定
				dest.base_unit_inpt_abort_qty(MCNumber.ZERO);
			}
		}

		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().addAll(up0());
			
			_allocStsL.clear();
			_up0_seq.clear();
			_up0.clear();
			
			for (MCList<MfgInstTblReg_Upd05_DtlInptR> gL : up0()
					.groupList(MfgInstTblReg_Upd05_DtlInptR.$hdr_peg_no)) {
				down1().add(_hdrCache.getCache(gL.get(0).hdr_peg_no()));
			}
		}
	}

	/**
	 * MfgInstTblReg_Upd06オペレーション.<p>
	 *
	 * 工数予定の追加・更新・削除を行う<br>
	 */
	public class MfgInstTblReg_Upd06 extends MSBCL_MfgInstTblRegService_MC_A.MfgInstTblReg_Upd06 {

		protected MCList<MfgInstTblReg_Upd06_DtlWkR> _up0_seq; // up0から表示順のみ更新するレコードを抽出したリスト
		protected MCList<MfgInstTblReg_Upd06_DtlWkR> _up0; // up0から表示順のみ更新以外を抽出したリスト
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			if (up0().isEmpty()) {
				return;
			}
			// 上り電文の編集
			editUp();
			// 工数予定の登録
			wkSchdReg();
			// 工数実績残テーブルの登録
			wkActRemReg();
			// 下り電文の設定
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {

			// 表示順のみ更新するレコードとそれ以外を分割する
			_up0_seq = MCList.create(MfgInstTblReg_Upd06_DtlWkR.class); // up0から表示順のみ更新するレコードを抽出したリスト
			_up0 = MCList.create(MfgInstTblReg_Upd06_DtlWkR.class); // up0から表示順のみ更新以外を抽出したリスト

			for (MfgInstTblReg_Upd06_DtlWkR r : up0()) {
				// データ更新区分が「更新」かつ表示順のみ更新ＦＬＧがオンの場合、表示順のみ更新対象とする
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) && r.disp_seq_upd_flg()) {
					_up0_seq.add(r);
				}
				else {
					_up0.add(r);
				}
			}			

			// 工数予定ＮＯの発番（発番システム区分）
			int cacheSize = _up0.subList(MfgInstTblReg_Upd06_DtlWkR.$data_crud_typ,
					MAC_DATA_CRUD_TYP.CRT.value()).size();
			doSeqCache(MSC_NUM_SYS_TYP.WKSCHD, cacheSize);

			for (MfgInstTblReg_Upd06_DtlWkR r : _up0) {
				// 工数予定ＮＯをキャッシュから取得
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					r.wk_schd_no(getStrSeq(MSC_NUM_SYS_TYP.WKSCHD));
				}
			}
		}

		/**
		 * 工数予定の登録
		 */
		protected void wkSchdReg() {
			MCList<MST_WK_SCHD_R> insL = MCList.create(MST_WK_SCHD_R.class);
			MCList<MST_WK_SCHD_R> updL = MCList.create(MST_WK_SCHD_R.class);
			MCList<MST_WK_SCHD_R> updSeqL = MCList.create(MST_WK_SCHD_R.class);
			MCList<MST_WK_SCHD_R> delL = MCList.create(MST_WK_SCHD_R.class);
			MCList<MST_WK_SCHD_R> yetUpdL = MCList.create(MST_WK_SCHD_R.class);
			for (MfgInstTblReg_Upd06_DtlWkR r : _up0) {
				if (r.inst_abort_flg() || (r.old_inst_abort_flg() && !r.inst_abort_flg())) {
					// 打切ＦＬＧがオンの場合（打切）、または打切ＦＬＧがオンからオフに変更された場合（打切取消）は更新不可のため、何もしない
					continue;
				}
				// 新規追加
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					insL.add(r.wk_schd());
				}
				// 更新
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					if (r.not_frst_inst_can_flg()) {
						// 初回以外の製造指図の取消の場合、製造指図ＮＯをクリア
						MST_WK_SCHD_R tmp = MST_WK_SCHD_R.create();
						tmp.mfg_inst_no(null);
						tmp.wk_schd_no(r.wk_schd_no());
						yetUpdL.add(tmp);
					}
					else {
						updL.add(r.wk_schd());
					}
				}
				// 削除
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.can_flg(true);
					delL.add(r.wk_schd());
				}
			}
			for (MfgInstTblReg_Upd06_DtlWkR r : _up0_seq) {
				// 表示順のみ更新
				updSeqL.add(r.wk_schd());
			}
			
			MST_WK_SCHD_R t = MST_WK_SCHD_R.create("T");
			// 新規追加
			if (!insL.isEmpty()) {
				dbInsertEx("MSBCL6010_MST_WK_SCHD_I01", insL, MCQueryApiBuilder.create(t));
			}
			// 更新
			if (!updL.isEmpty()) {
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				editUpdSetStmt(updL, t, updL_bldr);
				dbUpdateKey("MSBCL6010_MST_WK_SCHD_U01", updL, updL_bldr);
			}
			// 表示順のみ更新
			if (!updSeqL.isEmpty()) {
				MCQueryApiBuilder updSeqL_bldr = MCQueryApiBuilder.create(t);
				editUpdSetStmtSeq(updSeqL, t, updSeqL_bldr);
				dbUpdateKey("MSBCL6010_MST_WK_SCHD_U02", updSeqL, updSeqL_bldr);
			}
			// 削除（論理削除）
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(t);
				editDelSetStmt(delL, t, delL_bldr);
				dbUpdateKey("MSBCL6010_MST_WK_SCHD_U03", delL, delL_bldr);
			}
			// 更新（未指図に戻す）
			if (!yetUpdL.isEmpty()) {
				MCQueryApiBuilder yetUpdL_bldr = MCQueryApiBuilder.create(t);
				yetUpdL_bldr.setSet(t.mfg_inst_no);
				dbUpdateKey("MSBCL6010_MST_WK_SCHD_U04", yetUpdL, yetUpdL_bldr);
			}
		}

		/**
		 * 更新時のset句の編集
		 */
		protected void editUpdSetStmt(MCList<MST_WK_SCHD_R> updL, MST_WK_SCHD_R t, MCQueryApiBuilder updL_bldr) {
		// 品目製造指図ＮＯ、工程指図ＮＯ、取消ＦＬＧは更新対象としない
			updL_bldr.setSet(t.mfg_inst_no, t.wk_cost_cd, t.wk_cost_calc_flg,
					t.fxd_wk_cost, t.wk_cost,
					t.mst_fxd_wk_cost, t.mst_wk_cost,
					t.disp_seq, t.intr_rmrks,
					t.sub_char1, t.sub_char2, t.sub_char3);
		}

		/**
		 * 表示順のみ更新時のset句の編集
		 */
		protected void editUpdSetStmtSeq(MCList<MST_WK_SCHD_R> updL, MST_WK_SCHD_R t, MCQueryApiBuilder updL_bldr) {
			updL_bldr.setSet(t.disp_seq);
		}

		/**
		 * 論理削除時のset句の編集
		 */
		protected void editDelSetStmt(MCList<MST_WK_SCHD_R> delL, MST_WK_SCHD_R t, MCQueryApiBuilder delL_bldr) {
			// 取消ＦＬＧのみを更新対象とする
			delL_bldr.setSet(t.can_flg);
		}

		/**
		 * 工数実績残テーブルの登録
		 */
		protected void wkActRemReg() {
			MCList<MST_WK_ACT_REM_R> insL = MCList.create(MST_WK_ACT_REM_R.class);
			MCList<MST_WK_ACT_REM_R> updL = MCList.create(MST_WK_ACT_REM_R.class);
			MCList<MST_WK_ACT_REM_R> stsUpdL = MCList.create(MST_WK_ACT_REM_R.class);
			for (MfgInstTblReg_Upd06_DtlWkR r : _up0) {
				// 上り電文の工数予定から工数実績残のＤＢコンテナへ値を設定
				MST_WK_ACT_REM_R remR = MST_WK_ACT_REM_R.create();
				copy(remR, r, createMap_MST_WK_ACT_REM_R_MfgInstTblReg_Upd06_DtlWkR());
				
				if (r.inst_abort_flg()) {
					// 打切ＦＬＧがオンの場合（打切）は製造指図進捗状況を完了にして更新
					remR.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
					stsUpdL.add(remR);
				}
				else if (r.old_inst_abort_flg() && !r.inst_abort_flg()) {
					if(MAC_MFG_INST_UNIT_TYP.isOPER(r.mfg_inst_unit_typ()) && r.not_header_inst_abort_flg()) {
						// 打切ＦＬＧがオンからオフに変更された場合（打切取消）は製造指図状況を未指図で更新
						remR.mfg_sts_typ(MSC_MFG_STS_TYP.YET.value());
					} else {
						// 打切ＦＬＧがオンからオフに変更された場合（打切取消）は製造指図状況をヘッダの値で更新
						remR.mfg_sts_typ(r.hdr_mfg_sts_typ());
					}
					stsUpdL.add(remR);
				}
				else if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					insL.add(remR);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					if (r.not_frst_inst_can_flg()) {
						// 初回以外の製造指図の取消の場合、ステータスのみを更新（未指図）
						stsUpdL.add(remR);
					}
					else {
						updL.add(remR);
					}
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					// 何もしない
				}
			}
			// 新規追加
			if (!insL.isEmpty()) {
				dbInsertEx("MSBCL6010_MST_WK_ACT_REM_I01", insL,
						MCQueryApiBuilder.create(MST_WK_ACT_REM_R.create("T")));
			}
			// 更新
			if (!updL.isEmpty()) {
				dbUpdateKey("MSBCL6010_MST_WK_ACT_REM_U01", updL,
						MCQueryApiBuilder.create(MST_WK_ACT_REM_R.create("T")));
			}
			// 打切・打切取消・未指図に更新
			if (!stsUpdL.isEmpty()) {
				MST_WK_ACT_REM_R t = MST_WK_ACT_REM_R.create("T");
				MCQueryApiBuilder stsUpdL_bldr = MCQueryApiBuilder.create(t);
				stsUpdL_bldr.setSet(t.mfg_sts_typ);
				dbUpdateKey("MSBCL6010_MST_WK_ACT_REM_U02", stsUpdL, stsUpdL_bldr);
			}
		}

		/**
		 * 上り電文の工数予定から工数実績残のＤＢコンテナへのマッパー
		 * @return
		 */
		protected Map_MST_WK_ACT_REM_R_MfgInstTblReg_Upd06_DtlWkR<MST_WK_ACT_REM_R,MfgInstTblReg_Upd06_DtlWkR> createMap_MST_WK_ACT_REM_R_MfgInstTblReg_Upd06_DtlWkR() {
			return new Map_MST_WK_ACT_REM_R_MfgInstTblReg_Upd06_DtlWkR<MST_WK_ACT_REM_R, MfgInstTblReg_Upd06_DtlWkR>();
		}

		public class Map_MST_WK_ACT_REM_R_MfgInstTblReg_Upd06_DtlWkR<D extends MST_WK_ACT_REM_R, S extends MfgInstTblReg_Upd06_DtlWkR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_WK_ACT_REM_R.$wk_schd_no, MfgInstTblReg_Upd06_DtlWkR.$wk_schd_no);
				addColumnPathMap(MST_WK_ACT_REM_R.$mfg_sts_typ, MfgInstTblReg_Upd06_DtlWkR.$mfg_sts_typ);
				addColumnPathMap(MST_WK_ACT_REM_R.$mfg_inst_no, MfgInstTblReg_Upd06_DtlWkR.$mfg_inst_no);
				addColumnPathMap(MST_WK_ACT_REM_R.$itm_mfg_inst_no, MfgInstTblReg_Upd06_DtlWkR.$itm_mfg_inst_no);
				addColumnPathMap(MST_WK_ACT_REM_R.$oper_inst_no, MfgInstTblReg_Upd06_DtlWkR.$oper_inst_no);
				addColumnPathMap(MST_WK_ACT_REM_R.$sub_char1, MfgInstTblReg_Upd06_DtlWkR.$rem_sub_char1);
				addColumnPathMap(MST_WK_ACT_REM_R.$sub_char2, MfgInstTblReg_Upd06_DtlWkR.$rem_sub_char2);
				addColumnPathMap(MST_WK_ACT_REM_R.$sub_char3, MfgInstTblReg_Upd06_DtlWkR.$rem_sub_char3);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.div_seq(MCNumber.ZERO); //分割連番はゼロ固定
				dest.fxd_wk_cost(MCNumber.ZERO); //着手数量はゼロ固定
				dest.wk_cost(MCNumber.ZERO); //着手数量はゼロ固定
				dest.rem_wk_cost(sum(src.wk_cost(), src.fxd_wk_cost())); //残数量には工数＋固定工数を設定
				dest.abort_wk_cost(MCNumber.ZERO); //打切数量はゼロ固定
			}
		}

		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().addAll(up0());
		}
	}

	/**
	 * MfgInstTblReg_Upd07オペレーション.<p>
	 *
	 * 副産品予定の追加・更新・削除を行う<br>
	 */
	public class MfgInstTblReg_Upd07 extends MSBCL_MfgInstTblRegService_MC_A.MfgInstTblReg_Upd07 {

		protected MCList<MfgInstTblReg_Upd07_DtlByProdR> _up0_seq; // up0から表示順のみ更新するレコードを抽出したリスト
		protected MCList<MfgInstTblReg_Upd07_DtlByProdR> _up0; // up0から表示順のみ更新以外を抽出したリスト
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			if (up0().isEmpty()) {
				return;
			}
			// 上り電文の編集
			editUp();
			// 副産品予定の登録
			yieldSchdReg();
			// 出来高実績残テーブルの登録
			yieldActRemReg();
			// 受払予定の登録
			callIoSchd();
			// 下り電文の設定
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			// 表示順のみ更新するレコードとそれ以外を分割する
			_up0_seq = MCList.create(MfgInstTblReg_Upd07_DtlByProdR.class); // up0から表示順のみ更新するレコードを抽出したリスト
			_up0 = MCList.create(MfgInstTblReg_Upd07_DtlByProdR.class); // up0から表示順のみ更新以外を抽出したリスト

			for (MfgInstTblReg_Upd07_DtlByProdR r : up0()) {
				// データ更新区分が「更新」かつ表示順のみ更新ＦＬＧがオンの場合、表示順のみ更新対象とする
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ()) && r.disp_seq_upd_flg()) {
					_up0_seq.add(r);
				}
				else {
					_up0.add(r);
				}
			}			

			// 出来高予定ＮＯ、受払進捗管理ＮＯの発番（発番システム区分）
			int cacheSize = _up0.subList(MfgInstTblReg_Upd07_DtlByProdR.$data_crud_typ,
					MAC_DATA_CRUD_TYP.CRT.value()).size();
			doSeqCache(MSC_NUM_SYS_TYP.YLDSCHD, cacheSize);
			doSeqCache(MSC_NUM_SYS_TYP.IOSCHDPR, cacheSize);

			for (MfgInstTblReg_Upd07_DtlByProdR r : _up0) {
				// 出来高予定ＮＯ、受払進捗管理ＮＯをキャッシュから取得
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					r.yield_schd_no(getStrSeq(MSC_NUM_SYS_TYP.YLDSCHD));
					r.io_schd_pr_no(getStrSeq(MSC_NUM_SYS_TYP.IOSCHDPR));
				}
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.yield_typ(MAC_YIELD_TYP.BYPROD.value()); //出来高区分：副産品
				}
			}
			for (MfgInstTblReg_Upd07_DtlByProdR r : _up0_seq) {
				r.yield_typ(MAC_YIELD_TYP.BYPROD.value()); //出来高区分：副産品
			}
		}

		/**
		 * 受払予定作成サービスの呼出
		 */
		protected void callIoSchd() {
			MCList<MfgInstTblReg_Upd07_DtlByProdR> insL = MCList
					.create(MfgInstTblReg_Upd07_DtlByProdR.class);
			MCList<MfgInstTblReg_Upd07_DtlByProdR> delL = MCList
					.create(MfgInstTblReg_Upd07_DtlByProdR.class);

			for (MfgInstTblReg_Upd07_DtlByProdR r : _up0) {
				// 受払予定削除対象
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					delL.add(r);
				}
				// 受払予定作成対象
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					if (!r.inst_abort_flg()) {
						insL.add(r);
					}
				}
			}

			// 受払予定削除
			if (!delL.isEmpty()) {
				MSBEL_IoSchdService.IoSchd_Del01 del = MSBEL_IoSchdService.crtIoSchd_Del01();
				addAll(del.up0(), delL, createMap_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd07_DtlByProdR());
				del.exec();
			}

			// 受払予定作成
			if (!insL.isEmpty()) {
				MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd10 ioSchdIns = MSBCL_MfgInstTblRegService
						.crtMfgInstTblReg_Upd10();
				addAll(ioSchdIns.up0(), insL,
						createMap_MfgInstTblReg_Upd10_DtlYieldR_MfgInstTblReg_Upd07_DtlByProdR());
				ioSchdIns.exec();
			}
		}

		/**
		 * 上り電文から受払予定作成サービスの削除オペレーションへのマッピング
		 * @return
		 */
		protected Map_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd07_DtlByProdR<MSW_IO_SCHD_DEL_R,MfgInstTblReg_Upd07_DtlByProdR> createMap_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd07_DtlByProdR() {
			return new Map_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd07_DtlByProdR<MSW_IO_SCHD_DEL_R, MfgInstTblReg_Upd07_DtlByProdR>();
		}

		public class Map_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd07_DtlByProdR<D extends MSW_IO_SCHD_DEL_R, S extends MfgInstTblReg_Upd07_DtlByProdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_no, MfgInstTblReg_Upd07_DtlByProdR.$yield_schd_no); //受払予定ＮＯは出来高予定ＮＯを設定（連番は設定不要）
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.io_schd_typ(MSC_IO_SCHD_TYP.BYMFG.value()); //受払予定区分は「副産品製造」固定
				
				if (MSC_MFG_STS_TYP.isYET(src.old_mfg_sts_typ()) || MSC_MFG_STS_TYP.isSAV(src.old_mfg_sts_typ())) {
					// 更新前の製造状況が「未指図」または「指図保存」の場合、受払予定状況に「製造保存」を設定
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.MFG_SAV.value());
				}
				else if (MSC_MFG_STS_TYP.isSTT(src.hdr_mfg_sts_typ())) {
					// ヘッダの製造状況区分が「着手中」の場合（着手後の指図訂正時）は受払予定も着手中となっているため、「着手中」を設定
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.STT.value());
				}
				else {
					// 上記以外は「指図済」を設定
					dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD.value());
				}
			}
		}

		/**
		 * 上り電文から受払予定作成サービスの追加オペレーションへのマッピング
		 * @return
		 */
		protected Map_MfgInstTblReg_Upd10_DtlYieldR_MfgInstTblReg_Upd07_DtlByProdR<MfgInstTblReg_Upd10_DtlYieldR,MfgInstTblReg_Upd07_DtlByProdR> createMap_MfgInstTblReg_Upd10_DtlYieldR_MfgInstTblReg_Upd07_DtlByProdR() {
			return new Map_MfgInstTblReg_Upd10_DtlYieldR_MfgInstTblReg_Upd07_DtlByProdR<MfgInstTblReg_Upd10_DtlYieldR, MfgInstTblReg_Upd07_DtlByProdR>();
		}

		public class Map_MfgInstTblReg_Upd10_DtlYieldR_MfgInstTblReg_Upd07_DtlByProdR<D extends MfgInstTblReg_Upd10_DtlYieldR, S extends MfgInstTblReg_Upd07_DtlByProdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstTblReg_Upd10_DtlYieldR.$yield_schd_no, MfgInstTblReg_Upd07_DtlByProdR.$yield_schd_no);
			}
		}

		/**
		 * 副産品予定の登録
		 */
		protected void yieldSchdReg() {
			MCList<MST_YIELD_SCHD_R> insL = MCList.create(MST_YIELD_SCHD_R.class);
			MCList<MST_YIELD_SCHD_R> updL = MCList.create(MST_YIELD_SCHD_R.class);
			MCList<MST_YIELD_SCHD_R> updSeqL = MCList.create(MST_YIELD_SCHD_R.class);
			MCList<MST_YIELD_SCHD_R> delL = MCList.create(MST_YIELD_SCHD_R.class);
			MCList<MST_YIELD_SCHD_R> yetUpdL = MCList.create(MST_YIELD_SCHD_R.class);

			for (MfgInstTblReg_Upd07_DtlByProdR r : _up0) {
				if (r.inst_abort_flg() || (r.old_inst_abort_flg() && !r.inst_abort_flg())) {
					// 打切ＦＬＧがオンの場合（打切）、または打切ＦＬＧがオンからオフに変更された場合（打切取消）は更新不可のため、何もしない
					continue;
				}
				// 新規追加
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					insL.add(r.yield_schd());
				}
				// 更新
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					if (r.not_frst_inst_can_flg()) {
						// 初回以外の製造指図の取消の場合、製造指図ＮＯをクリア
						MST_YIELD_SCHD_R tmp = MST_YIELD_SCHD_R.create();
						tmp.mfg_inst_no(null);
						tmp.yield_schd_no(r.yield_schd_no());
						yetUpdL.add(tmp);
					}
					else {
						updL.add(r.yield_schd());
					}
				}
				// 削除
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.can_flg(true);
					delL.add(r.yield_schd());
				}
			}
			for (MfgInstTblReg_Upd07_DtlByProdR r : _up0_seq) {
				updSeqL.add(r.yield_schd());
			}

			MST_YIELD_SCHD_R t = MST_YIELD_SCHD_R.create("T");
			// 新規追加
			if (!insL.isEmpty()) {
				dbInsertEx("MSBCL6010_MST_YIELD_SCHD_I02", insL, MCQueryApiBuilder.create(t));
			}
			// 更新
			if (!updL.isEmpty()) {
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				editUpdSetStmt(updL, t, updL_bldr);
				dbUpdateKey("MSBCL6010_MST_YIELD_SCHD_U05", updL, updL_bldr);
			}
			// 表示順のみ更新
			if (!updSeqL.isEmpty()) {
				MCQueryApiBuilder updSeqL_bldr = MCQueryApiBuilder.create(t);
				editUpdSetStmtSeq(updSeqL, t, updSeqL_bldr);
				dbUpdateKey("MSBCL6010_MST_YIELD_SCHD_U06", updSeqL, updSeqL_bldr);
			}
			// 削除（論理削除）
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(t);
				editDelSetStmt(delL, t, delL_bldr);
				dbUpdateKey("MSBCL6010_MST_YIELD_SCHD_U07", delL, delL_bldr);
			}
			// 更新（未指図に戻す）
			if (!yetUpdL.isEmpty()) {
				MCQueryApiBuilder yetUpdL_bldr = MCQueryApiBuilder.create(t);
				yetUpdL_bldr.setSet(t.mfg_inst_no);
				dbUpdateKey("MSBCL6010_MST_YIELD_SCHD_U08", yetUpdL, yetUpdL_bldr);
			}
		}

		/**
		 * 更新時のset句の編集
		 */
		protected void editUpdSetStmt(MCList<MST_YIELD_SCHD_R> updL, MST_YIELD_SCHD_R t, MCQueryApiBuilder updL_bldr) {
			
			// 品目製造指図ＮＯ、工程オーダＮＯ、出来高区分、取消ＦＬＧ、受払進捗管理ＮＯは更新対象としない
			updL_bldr.setSet(t.mfg_inst_no, t.schd_tm,
					t.itm_cd, t.itm_sub1,
					t.itm_sub2, t.itm_sub3,
					t.trd_unit_yield_qty, t.trd_unit_cd,
					t.base_unit_yield_qty, t.base_unit_cd,
					t.lot_no, t.sublot_no, t.sno1,
					t.sno2, t.sno3, t.sno4,
					t.strg_loc_cd, t.strg_str_ln_cd,
					t.bkf_typ, t.par_inst_qty,
					t.chd_inpt_qty, t.chd_rqmt_qty,
					t.fxd_chd_rqmt_qty, t.disp_seq,
					t.intr_rmrks, t.inst_rpt_rmrks, t.insp_cnt_rmrks,
					t.sub_char1, t.sub_char2, t.sub_char3);
		}

		/**
		 * 表示順のみ更新時のset句の編集
		 */
		protected void editUpdSetStmtSeq(MCList<MST_YIELD_SCHD_R> updSeqL, MST_YIELD_SCHD_R t, MCQueryApiBuilder updSeqL_bldr) {
			updSeqL_bldr.setSet(t.disp_seq);
		}

		/**
		 * 論理削除時のset句の編集
		 */
		protected void editDelSetStmt(MCList<MST_YIELD_SCHD_R> delL, MST_YIELD_SCHD_R t, MCQueryApiBuilder delL_bldr) {

			// 取消ＦＬＧのみを更新対象とする
			delL_bldr.setSet(t.can_flg);
		}

		/**
		 * 出来高実績残テーブルの登録
		 * 
		 */
		protected void yieldActRemReg() {
			MCList<MST_YIELD_ACT_REM_R> insL = MCList.create(MST_YIELD_ACT_REM_R.class);
			MCList<MST_YIELD_ACT_REM_R> updL = MCList.create(MST_YIELD_ACT_REM_R.class);
			MCList<MST_YIELD_ACT_REM_R> stsUpdL = MCList.create(MST_YIELD_ACT_REM_R.class);
			for (MfgInstTblReg_Upd07_DtlByProdR r : _up0) {
				// 上り電文の出来高予定から出来高実績残のＤＢコンテナへ値を設定
				MST_YIELD_ACT_REM_R remR = MST_YIELD_ACT_REM_R.create();
				copy(remR, r, createMap_MST_YIELD_ACT_REM_R_MfgInstTblReg_Upd07_DtlByProdR());
				
				if (r.inst_abort_flg()) {
					// 打切ＦＬＧがオンの場合（打切）は製造指図進捗状況を完了にして更新
					remR.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
					stsUpdL.add(remR);
				}
				else if (r.old_inst_abort_flg() && !r.inst_abort_flg()) {
					if(MAC_MFG_INST_UNIT_TYP.isOPER(r.mfg_inst_unit_typ()) && r.not_header_inst_abort_flg()) {
						// 打切ＦＬＧがオンからオフに変更された場合（打切取消）は製造指図状況を未指図で更新
						remR.mfg_sts_typ(MSC_MFG_STS_TYP.YET.value());
					} else {
						// 打切ＦＬＧがオンからオフに変更された場合（打切取消）は製造指図状況をヘッダの値で更新
						remR.mfg_sts_typ(r.hdr_mfg_sts_typ());
					}
					stsUpdL.add(remR);
				}
				else if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					insL.add(remR);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					if (r.not_frst_inst_can_flg()) {
						// 初回以外の製造指図の取消の場合、ステータスのみを更新（未指図）
						stsUpdL.add(remR);
					}
					else {
						updL.add(remR);
					}
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					// 何もしない
				}
			}
			// 新規追加
			if (!insL.isEmpty()) {
				dbInsertEx("MSBCL6010_MST_YIELD_ACT_REM_I02", insL,
						MCQueryApiBuilder.create(MST_YIELD_ACT_REM_R.create("T")));
			}
			// 更新
			if (!updL.isEmpty()) {
				dbUpdateKey("MSBCL6010_MST_YIELD_ACT_REM_U03", updL,
						MCQueryApiBuilder.create(MST_YIELD_ACT_REM_R.create("T")));
			}
			// 打切・打切取消・未指図に更新
			if (!stsUpdL.isEmpty()) {
				MST_YIELD_ACT_REM_R t = MST_YIELD_ACT_REM_R.create("T");
				MCQueryApiBuilder stsUpdL_bldr = MCQueryApiBuilder.create(t);
				stsUpdL_bldr.setSet(t.mfg_sts_typ);
				dbUpdateKey("MSBCL6010_MST_YIELD_ACT_REM_U04", stsUpdL, stsUpdL_bldr);
			}
		}

		/**
		 * 上り電文の副産品予定から出来高実績残のＤＢコンテナへのマッパー
		 * @return
		 */
		protected Map_MST_YIELD_ACT_REM_R_MfgInstTblReg_Upd07_DtlByProdR<MST_YIELD_ACT_REM_R,MfgInstTblReg_Upd07_DtlByProdR> createMap_MST_YIELD_ACT_REM_R_MfgInstTblReg_Upd07_DtlByProdR() {
			return new Map_MST_YIELD_ACT_REM_R_MfgInstTblReg_Upd07_DtlByProdR<MST_YIELD_ACT_REM_R, MfgInstTblReg_Upd07_DtlByProdR>();
		}

		public class Map_MST_YIELD_ACT_REM_R_MfgInstTblReg_Upd07_DtlByProdR<D extends MST_YIELD_ACT_REM_R, S extends MfgInstTblReg_Upd07_DtlByProdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_YIELD_ACT_REM_R.$yield_schd_no, MfgInstTblReg_Upd07_DtlByProdR.$yield_schd_no);
				addColumnPathMap(MST_YIELD_ACT_REM_R.$mfg_sts_typ, MfgInstTblReg_Upd07_DtlByProdR.$mfg_sts_typ);
				addColumnPathMap(MST_YIELD_ACT_REM_R.$mfg_inst_no, MfgInstTblReg_Upd07_DtlByProdR.$mfg_inst_no);
				addColumnPathMap(MST_YIELD_ACT_REM_R.$itm_mfg_inst_no, MfgInstTblReg_Upd07_DtlByProdR.$itm_mfg_inst_no);
				addColumnPathMap(MST_YIELD_ACT_REM_R.$oper_inst_no, MfgInstTblReg_Upd07_DtlByProdR.$oper_inst_no);
				addColumnPathMap(MST_YIELD_ACT_REM_R.$yield_typ, MfgInstTblReg_Upd07_DtlByProdR.$yield_typ);
				addColumnPathMap(MST_YIELD_ACT_REM_R.$trd_unit_yield_rem_qty, MfgInstTblReg_Upd07_DtlByProdR.$trd_unit_yield_qty); //残数量には数量と同じ値を設定
				addColumnPathMap(MST_YIELD_ACT_REM_R.$base_unit_yield_rem_qty, MfgInstTblReg_Upd07_DtlByProdR.$base_unit_yield_qty); //残数量には数量と同じ値を設定
				addColumnPathMap(MST_YIELD_ACT_REM_R.$stk_lst_prnt_flg, MfgInstTblReg_Upd07_DtlByProdR.$stk_lst_prnt_flg);
				addColumnPathMap(MST_YIELD_ACT_REM_R.$sub_char1, MfgInstTblReg_Upd07_DtlByProdR.$rem_sub_char1);
				addColumnPathMap(MST_YIELD_ACT_REM_R.$sub_char2, MfgInstTblReg_Upd07_DtlByProdR.$rem_sub_char2);
				addColumnPathMap(MST_YIELD_ACT_REM_R.$sub_char3, MfgInstTblReg_Upd07_DtlByProdR.$rem_sub_char3);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.div_seq(MCNumber.ZERO); //分割連番はゼロ固定
				dest.trd_unit_yield_qty(MCNumber.ZERO); //取引単位出来高着手数量はゼロ固定
				dest.base_unit_yield_qty(MCNumber.ZERO); //基準単位出来高着手数量はゼロ固定
				dest.trd_unit_yield_abort_qty(MCNumber.ZERO); //取引単位出来高打切数量はゼロ固定
				dest.base_unit_yield_abort_qty(MCNumber.ZERO); //基準単位出来高打切数量はゼロ固定
			}
		}

		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().addAll(up0());
		}
	}

	/**
	 * MfgInstTblReg_Upd08オペレーション.<p>
	 *
	 */
	public class MfgInstTblReg_Upd08 extends MSBCL_MfgInstTblRegService_MC_A.MfgInstTblReg_Upd08 {

		protected MCIndexKey _up1IdxKey; //up1のインデックスキー
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// 上り電文の編集
			editUp();
			// 計画時の受払予定削除
			delIoSchd();
			// 品目・工程オーダの登録
			regOrd();
			// 計画時の受払予定復活（計画有・取消時）
			insIoSchd();
			// 下り電文の設定
			setDown();
		}
		
		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			for (MfgInstTblReg_Upd08_Dtl1R r : up0()) {
				if (MSC_MFG_MTD_TYP.isINTNL(r.mfg_mtd_typ())) {
					r.itm_ord_typ(MSC_ITM_ORD_TYP.MFG.value());
				}
				else if (MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ())) {
					r.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
				}
			}
		}
		
		/**
		 * 計画の受払予定を削除する
		 */
		protected void delIoSchd() {

			MCList<MfgInstTblReg_Upd08_Dtl1R> delInL = MCList.create(MfgInstTblReg_Upd08_Dtl1R.class);
			MCList<MfgInstTblReg_Upd08_Dtl1R> delExL = MCList.create(MfgInstTblReg_Upd08_Dtl1R.class);

			MCList<MST_ITM_ORDER_R> selItmOrdL = MCList.create(MST_ITM_ORDER_R.class);
			MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
			MCQueryApiBuilder selItmOrdL_bldr = MCQueryApiBuilder.create(t);
			selItmOrdL_bldr.setSelect(t.itm_ord_no);
			selItmOrdL_bldr.addSelect(t.itm_ord_sts_typ);
			selItmOrdL_bldr.addSelect(t.inst_itm_ord_sts_typ);
			dbSelectKey("MSBCL6010_MST_ITM_ORDER_S01",
					selItmOrdL, selItmOrdL_bldr, up0().subList(r -> (!r.unschd_flg() && MSC_MFG_MTD_TYP.isINTNL(r.mfg_mtd_typ()))));
			MCIndexKey itmOrdIdxkey = selItmOrdL.createIndex(MST_ITM_ORDER_R.$itm_ord_no);
			for (MfgInstTblReg_Upd08_Dtl1R r : up0()) {

				// 計画外の場合は計画時の受払予定が存在しないため、何もしない
				if (r.unschd_flg()) {
					continue;
				}
				//　内製と外注を分ける
				if (MSC_MFG_MTD_TYP.isINTNL(r.mfg_mtd_typ())) {
					MST_ITM_ORDER_R itmOrdR = selItmOrdL.getFirst(itmOrdIdxkey, r.itm_ord_no());
					// 品目オーダ情報の品目オーダ状況区分は「確定」、製造指図時品目オーダ状況区分は「未確定」・「保存」の場合、
					// 品目オーダ登録時に受払予定を作成しないので、この削除処理も無駄な処理となるため、スキップする
					if (!isNull(itmOrdR) && MSC_ITM_ORD_STS_TYP.isFIX(itmOrdR.itm_ord_sts_typ())
							&& (MSC_ITM_ORD_STS_TYP.isOPN(itmOrdR.inst_itm_ord_sts_typ()) || MSC_ITM_ORD_STS_TYP.isSAV(itmOrdR.inst_itm_ord_sts_typ()))) {
						continue;
					}
					// 内製
					delInL.add(r);
				}
				else if (MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ())) {
					// 外注
					delExL.add(r);
				}
			}
			
			if (delInL.isEmpty() && delExL.isEmpty()) {
				return;
			}

			MSBEL_IoSchdService.IoSchd_Del01 ioSchdDel01 = MSBEL_IoSchdService.crtIoSchd_Del01();

			if (!delInL.isEmpty()) {
				// 内製の製造
				addAll(ioSchdDel01.up0(), delInL, createMap_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd08_Dtl1R_Mfg());
				// 内製の投入
				addAll(ioSchdDel01.up0(), delInL, createMap_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd08_Dtl1R_Inpt());
			}

			if (!delExL.isEmpty()) {
				// 外注の投入
				addAll(ioSchdDel01.up0(), delExL, createMap_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd08_Dtl1R_Inpt());
			}

			// 受払予定サービスの削除を実行
			ioSchdDel01.exec();
		}

		/**
		 * 上り電文から受払予定サービスの削除へのマッピング（製造）
		 * @return
		 */
		protected Map_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd08_Dtl1R_Mfg<MSW_IO_SCHD_DEL_R,MfgInstTblReg_Upd08_Dtl1R> createMap_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd08_Dtl1R_Mfg() {
			return new Map_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd08_Dtl1R_Mfg<MSW_IO_SCHD_DEL_R, MfgInstTblReg_Upd08_Dtl1R>();
		}

		public class Map_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd08_Dtl1R_Mfg<D extends MSW_IO_SCHD_DEL_R, S extends MfgInstTblReg_Upd08_Dtl1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_no, MfgInstTblReg_Upd08_Dtl1R.$itm_ord_no); //受払予定ＮＯに品目オーダＮＯを設定（連番は設定不要）
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.io_schd_typ(MSC_IO_SCHD_TYP.MFG.value()); //受払予定区分に「製造」を設定
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value()); //受払予定状況区分に「予定」を設定
			}
		}

		/**
		 * 上り電文から受払予定サービスの削除へのマッピング（投入）
		 * @return
		 */
		protected Map_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd08_Dtl1R_Inpt<MSW_IO_SCHD_DEL_R,MfgInstTblReg_Upd08_Dtl1R> createMap_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd08_Dtl1R_Inpt() {
			return new Map_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd08_Dtl1R_Inpt<MSW_IO_SCHD_DEL_R, MfgInstTblReg_Upd08_Dtl1R>();
		}

		public class Map_MSW_IO_SCHD_DEL_R_MfgInstTblReg_Upd08_Dtl1R_Inpt<D extends MSW_IO_SCHD_DEL_R, S extends MfgInstTblReg_Upd08_Dtl1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_IO_SCHD_DEL_R.$io_schd_no, MfgInstTblReg_Upd08_Dtl1R.$itm_ord_no); //受払予定ＮＯに品目オーダＮＯを設定（連番は設定不要）
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.io_schd_typ(MSC_IO_SCHD_TYP.INPT.value()); //受払予定区分に「投入」を設定
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value()); //受払予定状況区分に「予定」を設定
			}
		}

		/**
		 * 品目オーダ・工程オーダを登録する
		 */
		protected void regOrd() {
			
			MCList<MfgInstTblReg_Upd08_Dtl1R> regL = MCList.create(MfgInstTblReg_Upd08_Dtl1R.class); //登録対象
			MCList<MfgInstTblReg_Upd08_Dtl1R> updL = MCList.create(MfgInstTblReg_Upd08_Dtl1R.class); //実績項目更新対象
			MCList<MfgInstTblReg_Upd08_Dtl1R> delL = MCList.create(MfgInstTblReg_Upd08_Dtl1R.class); //削除対象
			
			for (MfgInstTblReg_Upd08_Dtl1R r : up0()) {
				
				if (r.unschd_flg()) {
					// 計画外の場合
					if (MAC_DATA_CRUD_TYP.isCRT(r.itm_ord_data_crud_typ())) {
						// 新規の場合、登録サービス呼び出し対象かつ、実績項目更新呼び出し対象とする
						regL.add(r);
						updL.add(r);
					}
					else if (MAC_DATA_CRUD_TYP.isUPD(r.itm_ord_data_crud_typ())) {
						// 更新の場合、計画外であれば登録サービス呼び出し対象かつ実績項目更新対象とする
						regL.add(r);
						updL.add(r);
					}
					else if (MAC_DATA_CRUD_TYP.isDEL(r.itm_ord_data_crud_typ())) {
						// 削除の場合、削除対象とする
						delL.add(r);
					}
				}
				else {
					// 計画外でない場合、実績項目更新対象とする
					updL.add(r);
				}
			}
			
			// 品目・工程オーダの登録（計画外の追加・更新時）
			if (!regL.isEmpty()) {
				regOrd(regL);
			}
			// 品目・工程オーダ実績項目更新
			if (!updL.isEmpty()) {
				updOrd(updL);
			}
			// 品目オーダの削除（計画外の取消時）
			if (!delL.isEmpty()) {
				delOrd(delL);
			}
		}
		
		/**
		 * 品目・工程オーダを登録（追加・更新）する
		 */
		protected void regOrd(MCList<MfgInstTblReg_Upd08_Dtl1R> itmL) {
			// オーダ登録サービスの品目オーダ補完の実行
			MSBCL_OrdRegService.Ord_Sprt04 ordSprt = MSBCL_OrdRegService.crtOrd_Sprt04();
			addAll(ordSprt.up0(), itmL, createMap_Ord_Upd01_Dtl1R_MfgInstTblReg_Upd08_Dtl1R_Sprt());
			ordSprt.exec();

			if (!ordSprt.down0().isEmpty()) {
				// オーダ登録サービスのオーダ更新の電文定義
				// オーダ登録サービスのオーダ更新の実行
				MSBCL_OrdRegService.Ord_Upd01 ordUpd = MSBCL_OrdRegService.crtOrd_Upd01();
				valueCopy(ordUpd.up0(), ordSprt.down0());
				ordUpd.exec();
				
				// オーダ更新の下り電文から品目オーダＮＯを取得
				String[] destCols = new String[] {MfgInstTblReg_Upd08_Dtl1R.$itm_ord_no};
				String[] srcCols = new String[] {Ord_Upd01_Rslt1R.$itm_ord_no};
				copyByPegNo(up0(), destCols, ordUpd.down0(), srcCols);
			}
		}

		/**
		 * 品目オーダ補完結果をオーダ更新サービスの上り電文に設定する
		 */
		protected void valueCopy(MCList<Ord_Upd01_Dtl1R> up0L, MCList<Ord_Upd01_Dtl1R> down0L) {
			MCIndexKey idxKey = up0().createIndex(MfgInstTblReg_Upd08_Dtl1R.$peg_no);
			for(Ord_Upd01_Dtl1R r : down0L) {
				MfgInstTblReg_Upd08_Dtl1R itmR = up0().getFirst(idxKey, r.peg_no());
				Ord_Upd01_Dtl1R upR = Ord_Upd01_Dtl1R.create();
				MCRow.copyall(upR, r);
				upR.setAttributes(itmR);
				upR.mrp_typ(MSC_MRP_TYP.MRP.value());
				upR.oper_ptn(itmR.oper_ptn());
				upR.data_crud_typ(itmR.itm_ord_data_crud_typ());
				upR.itm_ord_no(itmR.itm_ord_no());
				upR.ord_gnrt_typ(MSC_ORD_GNRT_TYP.UPLND.value());
				upR.itm_ord_sts_typ(MSC_ITM_ORD_STS_TYP.FIX.value());
				upR.not_fix_flg(false);
				// 計画外製造指図の場合は、工程オーダは作成せず、品目オーダのみ作成する
				// ※行追加した工程指図は工程連番がNULLであるため、工程オーダのNOT NULL制約でエラーとなるため作成しない
				// ※ただし外注の場合はデフォルト工程のため、行追加されることがない。また、検収不良の再入荷時に工程オーダを使用するため、作成する。
				if (MSC_ITM_ORD_TYP.isOUTSRC(upR.itm_ord_typ())) {
					upR.oper_ord_pr_flg(true);
				}
				else {
					upR.oper_ord_pr_flg(false);
				}
				upR.io_schd_pr_flg(false); //製造指図の受払予定が作成されるため、計画の受払予定は不要
				up0L.add(upR);
			}
		}

		/**
		 * 品目オーダを削除する
		 */
		protected void delOrd(MCList<MfgInstTblReg_Upd08_Dtl1R> itmL) {
			// オーダ登録サービスのオーダ更新の実行
			MSBCL_OrdRegService.Ord_Upd01 ord = MSBCL_OrdRegService.crtOrd_Upd01();
			addAll(ord.up0(), itmL, createMap_Ord_Upd01_Dtl1R_MfgInstTblReg_Upd08_Dtl1R_Del());
			ord.exec();
		}
		
		/**
		 * 品目・工程オーダを更新する
		 */
		protected void updOrd(MCList<MfgInstTblReg_Upd08_Dtl1R> itmL) {

			MCIndexKey itmKey = itmL.createIndex(MfgInstTblReg_Upd08_Dtl1R.$itm_ord_no);
			MCIndexKey operKey = up1().createIndex(MfgInstTblReg_Upd08_Dtl2R.$oper_ord_no);
			MCList<MfgInstTblReg_Upd08_Dtl2R> operL = MCList.create(MfgInstTblReg_Upd08_Dtl2R.class);

			// 品目オーダに紐付く工程オーダをテーブルから取得
			for (MST_OPER_ORDER_R r : srchOperOrd(itmL)) {
				// 工程オーダＮＯで上り電文から工程を取得
				MfgInstTblReg_Upd08_Dtl2R operR = up1().getFirst(operKey, r.oper_ord_no());
				// 上り電文に存在しない（工程が削除された）場合も工程オーダの未指図数量を更新したいため、レコードを補完
				if (isNull(operR)) {
					MfgInstTblReg_Upd08_Dtl2R addR = MfgInstTblReg_Upd08_Dtl2R.create();
					addR.oper_ord_no(r.oper_ord_no());
					MfgInstTblReg_Upd08_Dtl1R itmR = itmL.getFirst(itmKey, r.itm_ord_no());
					MST_ITM_ORDER_R itmOrdR = MST_ITM_ORDER_R.create();
					MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
					MCQueryApiBuilder itmOrdR_bldr = MCQueryApiBuilder.create(t);
					itmOrdR_bldr.setSelect(t.inst_qty);
					itmOrdR_bldr.setWhere(t.itm_ord_no.eq(bind("itm_ord_no")));
					dbSelect("MSBCL6010_MST_ITM_ORDER_S03", itmOrdR, itmOrdR_bldr, r);

					MAM_ITM_R mamItmR = MAM_ITM_R.create();
					MAM_ITM_R m1 = MAM_ITM_R.create("M1");
					MCQueryApiBuilder mamItmR_bldr = MCQueryApiBuilder.create(m1);
					mamItmR_bldr.setSelect(m1.dec_place, m1.rnd_typ);
					mamItmR_bldr.setWhere(m1.itm_cd.eq(bind("itm_cd")));
					mamItmR_bldr.addWhereWithAnd(m1.itm_sub1.eq(bind("itm_sub1")));
					mamItmR_bldr.addWhereWithAnd(m1.itm_sub2.eq(bind("itm_sub2")));
					mamItmR_bldr.addWhereWithAnd(m1.itm_sub3.eq(bind("itm_sub3")));
					dbSelect("MSBCL6010_MAM_ITM_S01", mamItmR, mamItmR_bldr, itmR);

					// 未指図数量を再計算する
					addR.not_inst_qty(r.oper_schd_qty()
							.multiply(itmR.not_inst_qty())
							.divide(itmOrdR.inst_qty(), mamItmR.dec_place().intValue(), MAC_RND_TYP.toMC(mamItmR.rnd_typ())));
					operL.add(addR);
				}
				else {
					operL.add(operR);
				}
			}
			
			// 品目オーダと工程オーダの未指図数量を更新する
			updOrdNotInstQty(itmL, operL);
		}
		
		/**
		 * 品目オーダと工程オーダを更新する
		 */
		protected void updOrdNotInstQty(MCList<MfgInstTblReg_Upd08_Dtl1R> itmL,
				MCList<MfgInstTblReg_Upd08_Dtl2R> operL) {
			MCList<MST_ITM_ORDER_R> itmUpdL = MCList.create(MST_ITM_ORDER_R.class);

			for (MfgInstTblReg_Upd08_Dtl1R r : itmL) {
				MST_ITM_ORDER_R itmUpdR = MST_ITM_ORDER_R.create();
				itmUpdR.itm_ord_no(r.itm_ord_no());
				itmUpdR.not_inst_qty(r.not_inst_qty());
				itmUpdL.add(itmUpdR);
			}
			if (!itmUpdL.isEmpty()) {
				MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
				MCQueryApiBuilder itmUpdL_bldr = MCQueryApiBuilder.create(t);
				itmUpdL_bldr.setSet(t.not_inst_qty);
				dbUpdateKey("MSBCL6010_MST_ITM_ORDER_U01", itmUpdL, itmUpdL_bldr);
			}
			
			MCList<MST_OPER_ORDER_R> operUpdL = MCList.create(MST_OPER_ORDER_R.class);
			for (MfgInstTblReg_Upd08_Dtl2R r : operL) {
				MST_OPER_ORDER_R operUpdR = MST_OPER_ORDER_R.create();
				operUpdR.oper_ord_no(r.oper_ord_no());
				operUpdR.not_oper_schd_qty(r.not_inst_qty());
				operUpdL.add(operUpdR);
			}
			if (!operUpdL.isEmpty()) {
				MST_OPER_ORDER_R t = MST_OPER_ORDER_R.create("T");
				MCQueryApiBuilder operUpdL_bldr = MCQueryApiBuilder.create(t);
				operUpdL_bldr.setSet(t.not_oper_schd_qty);
				dbUpdateKey("MSBCL6010_MST_OPER_ORDER_U01", operUpdL, operUpdL_bldr);
			}
		}

		/**
		 * 引数の品目オーダに紐付く工程オーダを取得する
		 * @param itmL
		 * @return
		 */
		protected MCList<MST_OPER_ORDER_R> srchOperOrd(MCList<MfgInstTblReg_Upd08_Dtl1R> itmL) {

			MCList<MST_OPER_ORDER_R> operL = MCList.create(MST_OPER_ORDER_R.class);
			MST_OPER_ORDER_R t = MST_OPER_ORDER_R.create("T");
			MCQueryApiBuilder operL_bldr = MCQueryApiBuilder.create(t);
			operL_bldr.setSelect(t.oper_ord_no, t.itm_ord_no, t.oper_schd_qty);
			operL_bldr.setWhere(t.itm_ord_no.eq(bind("itm_ord_no")));
			dbSelect("MSBCL6010_MST_OPER_ORDER_S01",
					operL, operL_bldr, itmL.groupBy(MfgInstTblReg_Upd08_Dtl1R.$itm_ord_no));
			return operL;
		}
		
		/**
		 * 上り電文からオーダ登録サービスの品目オーダへのマッピング（補完）
		 * @return
		 */
		protected Map_Ord_Upd01_Dtl1R_MfgInstTblReg_Upd08_Dtl1R_Sprt<Ord_Upd01_Dtl1R,MfgInstTblReg_Upd08_Dtl1R> createMap_Ord_Upd01_Dtl1R_MfgInstTblReg_Upd08_Dtl1R_Sprt() {
			return new Map_Ord_Upd01_Dtl1R_MfgInstTblReg_Upd08_Dtl1R_Sprt<Ord_Upd01_Dtl1R, MfgInstTblReg_Upd08_Dtl1R>();
		}

		public class Map_Ord_Upd01_Dtl1R_MfgInstTblReg_Upd08_Dtl1R_Sprt<D extends Ord_Upd01_Dtl1R, S extends MfgInstTblReg_Upd08_Dtl1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, MfgInstTblReg_Upd08_Dtl1R.$peg_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_typ, MfgInstTblReg_Upd08_Dtl1R.$itm_ord_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_cd, MfgInstTblReg_Upd08_Dtl1R.$itm_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub1, MfgInstTblReg_Upd08_Dtl1R.$itm_sub1);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub2, MfgInstTblReg_Upd08_Dtl1R.$itm_sub2);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_sub3, MfgInstTblReg_Upd08_Dtl1R.$itm_sub3);
				addColumnPathMap(Ord_Upd01_Dtl1R.$strg_loc_cd, MfgInstTblReg_Upd08_Dtl1R.$strg_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_loc_cd, MfgInstTblReg_Upd08_Dtl1R.$mfg_loc_cd);
				addColumnPathMap(Ord_Upd01_Dtl1R.$bom_ptn, MfgInstTblReg_Upd08_Dtl1R.$bom_ptn);
				addColumnPathMap(Ord_Upd01_Dtl1R.$oper_ptn, MfgInstTblReg_Upd08_Dtl1R.$oper_ptn);
				addColumnPathMap(Ord_Upd01_Dtl1R.$inst_qty, MfgInstTblReg_Upd08_Dtl1R.$inst_qty);
				addColumnPathMap(Ord_Upd01_Dtl1R.$yield_schd_qty, MfgInstTblReg_Upd08_Dtl1R.$yield_schd_qty);
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_st_schd_dt, MfgInstTblReg_Upd08_Dtl1R.$mfg_st_schd_dt); //製造着手予定日、終了予定日からその他の日付を算出
				addColumnPathMap(Ord_Upd01_Dtl1R.$mfg_end_schd_dt, MfgInstTblReg_Upd08_Dtl1R.$mfg_end_schd_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$master_dt, MfgInstTblReg_Upd08_Dtl1R.$master_dt);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno1, MfgInstTblReg_Upd08_Dtl1R.$sno1);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno2, MfgInstTblReg_Upd08_Dtl1R.$sno2);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno3, MfgInstTblReg_Upd08_Dtl1R.$sno3);
				addColumnPathMap(Ord_Upd01_Dtl1R.$sno4, MfgInstTblReg_Upd08_Dtl1R.$sno4);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.rqst_loc_cd(MAC_STR.NULL_VAL.value());
				dest.sppl_cd(MAC_STR.NULL_VAL.value());
				dest.maker_cd(MAC_STR.NULL_VAL.value());
			}
		}

		/**
		 * 上り電文からオーダ登録サービスの品目オーダへのマッピング（削除）
		 * @return
		 */
		protected Map_Ord_Upd01_Dtl1R_MfgInstTblReg_Upd08_Dtl1R_Del<Ord_Upd01_Dtl1R,MfgInstTblReg_Upd08_Dtl1R> createMap_Ord_Upd01_Dtl1R_MfgInstTblReg_Upd08_Dtl1R_Del() {
			return new Map_Ord_Upd01_Dtl1R_MfgInstTblReg_Upd08_Dtl1R_Del<Ord_Upd01_Dtl1R, MfgInstTblReg_Upd08_Dtl1R>();
		}

		public class Map_Ord_Upd01_Dtl1R_MfgInstTblReg_Upd08_Dtl1R_Del<D extends Ord_Upd01_Dtl1R, S extends MfgInstTblReg_Upd08_Dtl1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd01_Dtl1R.$peg_no, MfgInstTblReg_Upd08_Dtl1R.$peg_no);
				addColumnPathMap(Ord_Upd01_Dtl1R.$data_crud_typ, MfgInstTblReg_Upd08_Dtl1R.$itm_ord_data_crud_typ);
				addColumnPathMap(Ord_Upd01_Dtl1R.$itm_ord_no, MfgInstTblReg_Upd08_Dtl1R.$itm_ord_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.mrp_typ(MSC_MRP_TYP.MRP.value()); //ＭＲＰタイプには「ＭＲＰ」を設定
			}
		}
		
		/**
		 * 未指図数量分の計画時の受払予定を復活させる
		 * 
		 * 未指図数量＞０の場合、計画時の受払予定を未指図数量分だけ作成する
		 * 未指図数量＞０となるパターン：
		 * ・新規登録時：未指図数量＞指図数量となるように製造指図を行った場合、未指図数量－指図数量を新たな未指図数量として作成
		 * ・更新時：指図数量を変更した場合、未指図数量－指図数量を新たな未指図数量として作成
		 * ・削除時：製造指図の取消により指図数量が未指図数量となるため、未指図数量＋取り消した指図数量を新たな未指図数量として作成
		 * ここでは、新たな未指図数量が呼出元ですでに算出されていることを前提とする
		 */
		protected void insIoSchd() {
			
			// 未指図数量＞０の品目オーダを抽出
			MCList<MfgInstTblReg_Upd08_Dtl1R> notInstL = MCList.create(MfgInstTblReg_Upd08_Dtl1R.class);
			for (MfgInstTblReg_Upd08_Dtl1R r : up0()) {
				if (r.not_inst_qty().gt(MCNumber.ZERO)) {
					notInstL.add(r);
				}
			}

			// 未指図数量＞０のレコードが存在しない場合、以降の処理は不要
			if (notInstL.isEmpty()) {
				return;
			}
			
			MCList<MfgInstTblReg_Upd08_Dtl1R> bindL = notInstL.groupBy(MfgInstTblReg_Upd08_Dtl1R.$itm_ord_no);

			// 未指図数量＞０のレコードに対する品目オーダを抽出
			MCList<MST_ITM_ORDER_R> itmOrdL = MCList.create(MST_ITM_ORDER_R.class);
			MST_ITM_ORDER_R t = MST_ITM_ORDER_R.create("T");
			MCQueryApiBuilder itmOrdL_bldr = MCQueryApiBuilder.create(t);
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			itmOrdL_bldr.addSelect(m1.unit_cd, m1.dec_place);
			itmOrdL_bldr.addInnerJoin(m1,
					bracket(t.itm_cd.eq(m1.itm_cd)
							.and(t.itm_sub1.eq(m1.itm_sub1))
							.and(t.itm_sub2.eq(m1.itm_sub2))
							.and(t.itm_sub3.eq(m1.itm_sub3))));
			dbSelectKey("MSBCL6010_MST_ITM_ORDER_S02",
					itmOrdL, itmOrdL_bldr, bindL);

			// 品目オーダが存在しない場合、以降の処理は不要
			if (itmOrdL.isEmpty()) {
				return;
			}

			// 品目製造指図の出来高予定数量を取得
			MCList<MST_ITM_MFG_INST_R> imiL = MCList.create(MST_ITM_MFG_INST_R.class);
			MST_ITM_MFG_INST_R t1 = MST_ITM_MFG_INST_R.create("T");
			MCQueryApiBuilder imiL_bldr = MCQueryApiBuilder.create(t1);
			imiL_bldr.setSelect(t1.itm_ord_no, t1.itm_mfg_inst_no, t1.base_unit_yield_qty);
			imiL_bldr.setWhere(t1.itm_ord_no.eq(bind("itm_ord_no")));
			imiL_bldr.addWhereWithAnd(t1.can_flg.eq(value(false)));
			dbSelect("MSBCL6010_MST_ITM_MFG_INST_S01", imiL, imiL_bldr, bindL);
			
			MCIndexKey upIdxKey = notInstL.createIndex(MfgInstTblReg_Upd08_Dtl1R.$itm_ord_no);
			MCIndexKey imiIdxKey = imiL.createIndex(MST_ITM_MFG_INST_R.$itm_ord_no);
			for (MST_ITM_ORDER_R r : itmOrdL) {
				// 追加したカラムに上り電文の値を設定
				MfgInstTblReg_Upd08_Dtl1R notInstR = notInstL.getFirst(upIdxKey, r.itm_ord_no());
				if (!isNull(notInstR)) {
					// 残数分の出来高予定数を計算する
					// 同様の処理が、製造指図登録や製造指図一覧登録の検索処理にも存在するため、修正の際は注意
					MCList<MST_ITM_MFG_INST_R> imiSubL = imiL.subList(imiIdxKey, r.itm_ord_no());
					r.not_inst_qty(notInstR.not_inst_qty());
					MCNumber sumItmMfgQty = getSumItmMfgInstYieldQty(imiSubL, notInstR);
					MCNumber yieldSchdQty = r.yield_schd_qty().subtract(sumItmMfgQty);
					if (yieldSchdQty.isNegative()) {
						yieldSchdQty = MCNumber.ZERO;
					}
					r.yield_schd_qty(yieldSchdQty);
					r.setNumberNE(MfgInstTblReg_Upd08_Dtl1R.$peg_no, notInstR.peg_no());
				}
			}
			
			// 製造の受払予定の作成
			MCList<MST_ITM_ORDER_R> intnlL = itmOrdL
					.subList(MST_ITM_ORDER_R.$itm_ord_typ, MSC_ITM_ORD_TYP.MFG.value());
			if (!intnlL.isEmpty()) {
				MSBEL_IoSchdService.IoSchd_Ins01 ioSchdMfg = MSBEL_IoSchdService.crtIoSchd_Ins01();
				addAll(ioSchdMfg.up0(), intnlL, createMap_IoSchd_Ins01_DtlR_MST_ITM_ORDER_R());
				ioSchdMfg.exec();
			}

			// 構成展開で使用するために工程オーダを取得
			MCList<MfgInstTblReg_Upd08_Dtl2R> notInstOperL = MCList.create(MfgInstTblReg_Upd08_Dtl2R.class);
			for (MfgInstTblReg_Upd08_Dtl2R r : up1()) {
				if (r.not_inst_qty().gt(MCNumber.ZERO)) {
					notInstOperL.add(r);
				}
			}
			MCList<MST_OPER_ORDER_R> operOrdL = MCList.create(MST_OPER_ORDER_R.class);
			dbSelectKey("MSBCL6010_MST_OPER_ORDER_S02", operOrdL,
					MCQueryApiBuilder.create(MST_OPER_ORDER_R.create("T")),
					notInstOperL.groupBy(MfgInstTblReg_Upd08_Dtl2R.$oper_ord_no));
			
			// 構成展開を行い、投入予定を取得
			MSBCL_ReExpService.ReExp_Sprt01 reExp = MSBCL_ReExpService.crtReExp_Sprt01();
			valueCopy(reExp.up0(), itmOrdL, up1(), operOrdL);
			reExp.exec();
			
			// 構成展開結果が存在しない場合、以降の処理は不要
			if (reExp.down0().isEmpty()) {
				return;
			}

			// 投入の受払予定作成のマッパーで使用するため、up1のインデックスキーを作成
			_up1IdxKey = up1().createIndex(MfgInstTblReg_Upd08_Dtl2R.$peg_no);

			// 投入の受払予定の作成
			MSBEL_IoSchdService.IoSchd_Ins01 ioSchdInpt = MSBEL_IoSchdService.crtIoSchd_Ins01();
			addAll(ioSchdInpt.up0(), excldSSandNoMrp(reExp.down0()), createMap_IoSchd_Ins01_DtlR_ReExp_Sprt01_RsltInptR());
			
			MCIndexKey itmOrdIdxKey = itmOrdL.createIndex(MST_OPER_ORDER_R.$itm_ord_no);
			for (IoSchd_Ins01_DtlR ioSchdInptR : ioSchdInpt.up0()) {
				// 受払予定ＮＯには品目オーダＮＯが設定されているため、受払予定ＮＯでgetFirst
				MST_ITM_ORDER_R ioR = itmOrdL.getFirst(itmOrdIdxKey, ioSchdInptR.io_schd_no());
				ioSchdInptR.io_schd_pr_no(ioR.io_schd_pr_no());
			}
			ioSchdInpt.exec();
		}
		
		protected MCNumber getSumItmMfgInstYieldQty(
				MCList<MST_ITM_MFG_INST_R> imiSubL,
				MfgInstTblReg_Upd08_Dtl1R notInstR) {
			MCNumber ret = MCNumber.ZERO;
			for (MST_ITM_MFG_INST_R imiSubR : imiSubL) {
				// 上り電文に含まれる出来高予定数量は、ＤＢから取得した値ではなく、上り電文の値を採用するため、ここでは除外する
				if (!isSame(imiSubR.itm_mfg_inst_no(), notInstR.itm_mfg_inst_no())) {
					ret = ret.add(imiSubR.base_unit_yield_qty());
				}
			}
			if (!MAC_DATA_CRUD_TYP.isDEL(notInstR.itm_mfg_inst_data_crud_typ())) {
				ret = ret.add(notInstR.yield_schd_qty());
			}

			return ret;
		}
		
		/**
		 * 品目オーダから受払予定サービスの追加オペレーション（製造）へのマッピング
		 * @return
		 */
		protected Map_IoSchd_Ins01_DtlR_MST_ITM_ORDER_R<IoSchd_Ins01_DtlR,MST_ITM_ORDER_R> createMap_IoSchd_Ins01_DtlR_MST_ITM_ORDER_R() {
			return new Map_IoSchd_Ins01_DtlR_MST_ITM_ORDER_R<IoSchd_Ins01_DtlR, MST_ITM_ORDER_R>();
		}

		public class Map_IoSchd_Ins01_DtlR_MST_ITM_ORDER_R<D extends IoSchd_Ins01_DtlR, S extends MST_ITM_ORDER_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_no, MST_ITM_ORDER_R.$itm_ord_no); //受払予定ＮＯは品目オーダＮＯを設定
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_pr_no, MST_ITM_ORDER_R.$io_schd_pr_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$io_schd_sub_no1, MST_ITM_ORDER_R.$itm_ord_no); //受払予定区分１は「品目オーダＮＯ」固定
				// 受払予定予備ＮＯ２～４は設定しない
				addColumnPathMap(IoSchd_Ins01_DtlR.$schd_dt, MST_ITM_ORDER_R.$strg_schd_dt);
				addColumnPathMap(IoSchd_Ins01_DtlR.$accpt_schd_dt, MST_ITM_ORDER_R.$accpt_schd_dt);
				addColumnPathMap(IoSchd_Ins01_DtlR.$insp_cmpl_schd_dt,MST_ITM_ORDER_R.$avl_schd_dt);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_cd, MST_ITM_ORDER_R.$itm_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub1, MST_ITM_ORDER_R.$itm_sub1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub2, MST_ITM_ORDER_R.$itm_sub2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub3, MST_ITM_ORDER_R.$itm_sub3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$ver_no, MST_ITM_ORDER_R.$ver_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$loc_cd, MST_ITM_ORDER_R.$strg_loc_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno1, MST_ITM_ORDER_R.$sno1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno2, MST_ITM_ORDER_R.$sno2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno3, MST_ITM_ORDER_R.$sno3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno4, MST_ITM_ORDER_R.$sno4);
				addColumnPathMap(IoSchd_Ins01_DtlR.$mfg_loc_cd, MST_ITM_ORDER_R.$mfg_loc_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.io_schd_typ(MSC_IO_SCHD_TYP.MFG.value()); //受払予定区分は「製造」固定
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value()); //受払予定区分は「予定」固定
				dest.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value()); //受払予定区分１は「品目オーダＮＯ」固定
				dest.gd_cd(getDefaultFeedStkGd().gd_cd()); //格付ＣＤはデフォルト値
				dest.quality_typ(MAC_QUALITY_TYP.GOOD.value()); //良品区分は「良品」固定
				dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value()); //在庫検査区分は検査済
				dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value()); //在庫識別区分は自社在庫
				dest.stk_bp_cd(MAC_STR.NULL_VAL.value()); //在庫取引先ＣＤはＮＵＬＬ文字
				dest.lot_no(MAC_STR.NULL_VAL.value()); //ロットＮＯはＮＵＬＬ文字
				dest.sublot_no(MAC_STR.NULL_VAL.value()); //サブロットＮＯはＮＵＬＬ文字

				// 基準単位ＣＤは品目マスタから設定
				dest.base_unit_cd(src.getStringNE("unit_cd"));
				dest.base_unit_qty(src.yield_schd_qty());

				// 取引単位には基準単位を設定（計画時はすべて基準単位のため、取引単位への換算は行わない）
				dest.trd_unit_cd(dest.base_unit_cd());
				dest.trd_unit_qty(dest.base_unit_qty());
			}
		}

		/**
		 * 製造再展開サービスの構成展開へ渡す上り電文を編集する
		 * @param destL 構成展開の上り電文
		 * @param itmL 品目オーダの情報
		 * @param operL 工程オーダの情報
		 */
		protected void valueCopy(MCList<ReExp_Sprt01_HdrR> destL,
				MCList<MST_ITM_ORDER_R> itmL, MCList<MfgInstTblReg_Upd08_Dtl2R> operL,
				MCList<MST_OPER_ORDER_R> notInstOperL) {
			// 品目情報をitmL、工程情報をoperLから取得し、Sprt01構成展開を実行する。
			// 複数の電文から取得するため、mapperを使用していない。setAttributesでup0の属性を引き継ぐ。

			// 品目情報に対するループ
			MCIndexKey itmOrdKey = notInstOperL.createIndex(MST_OPER_ORDER_R.$itm_ord_no);
			MCIndexKey operOrdKey = operL.createIndex(MfgInstTblReg_Upd08_Dtl2R.$oper_ord_no);
			for (MST_ITM_ORDER_R itmR : itmL) {

				// 品目オーダＮＯで工程オーダを抽出
				MCList<MST_OPER_ORDER_R> operSubL = notInstOperL.subList(itmOrdKey,
						itmR.itm_ord_no());
				for (MST_OPER_ORDER_R ooR : operSubL) {
					// 工程オーダＮＯで工程オーダを抽出
					MfgInstTblReg_Upd08_Dtl2R operR = operL.getFirst(operOrdKey, ooR.oper_ord_no());
					if (isNull(operR)) {
						continue;
					}
					
					ReExp_Sprt01_HdrR destR = ReExp_Sprt01_HdrR.create();
					destR.setAttributes(itmR);
					destR.hdr_peg_no(itmR.getNumberNE(MfgInstTblReg_Upd08_Dtl1R.$peg_no));
					destR.oper_peg_no(operR.peg_no());
					destR.itm_cd(itmR.itm_cd());
					destR.itm_sub1(itmR.itm_sub1());
					destR.itm_sub2(itmR.itm_sub2());
					destR.itm_sub3(itmR.itm_sub3());
					destR.mfg_loc_cd(itmR.mfg_loc_cd());
					destR.strg_loc_cd(itmR.strg_loc_cd());
					destR.bom_ptn(itmR.bom_ptn());
					destR.oper_cd(ooR.oper_cd());
					destR.oper_seq(ooR.oper_seq());
					destR.oper_loc_cd(ooR.loc_cd());
					destR.oper_inst_qty(operR.not_inst_qty()); //未指図数量を設定
					destR.mfg_st_schd_dt(itmR.mfg_st_schd_dt());
					destR.st_schd_dt(ooR.st_schd_tm().startTimeOfDay());
					destR.end_schd_dt(ooR.end_schd_tm().startTimeOfDay());
					destR.sno1(itmR.sno1());
					destR.sno2(itmR.sno2());
					destR.sno3(itmR.sno3());
					destR.sno4(itmR.sno4());
					destL.add(destR);
				}
			}
		}

		/**
		 * 構成展開の下り電文から受払予定作成（投入）へのマッピング
		 * @return
		 */
		protected Map_IoSchd_Ins01_DtlR_ReExp_Sprt01_RsltInptR<IoSchd_Ins01_DtlR,ReExp_Sprt01_RsltInptR> createMap_IoSchd_Ins01_DtlR_ReExp_Sprt01_RsltInptR() {
			return new Map_IoSchd_Ins01_DtlR_ReExp_Sprt01_RsltInptR<IoSchd_Ins01_DtlR, ReExp_Sprt01_RsltInptR>();
		}

		public class Map_IoSchd_Ins01_DtlR_ReExp_Sprt01_RsltInptR<D extends IoSchd_Ins01_DtlR, S extends ReExp_Sprt01_RsltInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				// 受払予定予備ＮＯ２～４は設定しない
				addColumnPathMap(IoSchd_Ins01_DtlR.$schd_dt, ReExp_Sprt01_RsltInptR.$inpt_schd_dt);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_cd, ReExp_Sprt01_RsltInptR.$itm_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub1, ReExp_Sprt01_RsltInptR.$itm_sub1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub2, ReExp_Sprt01_RsltInptR.$itm_sub2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$itm_sub3, ReExp_Sprt01_RsltInptR.$itm_sub3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$ver_no, ReExp_Sprt01_RsltInptR.$ver_no);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_grp_cd, ReExp_Sprt01_RsltInptR.$alt_grp_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_grp_seq, ReExp_Sprt01_RsltInptR.$alt_grp_seq);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_qty, ReExp_Sprt01_RsltInptR.$alt_qty);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_itm_typ, ReExp_Sprt01_RsltInptR.$alt_itm_typ);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_itm_ratio, ReExp_Sprt01_RsltInptR.$alt_itm_ratio);
				addColumnPathMap(IoSchd_Ins01_DtlR.$alt_alloc_prio, ReExp_Sprt01_RsltInptR.$alt_alloc_prio);
				addColumnPathMap(IoSchd_Ins01_DtlR.$loc_cd, ReExp_Sprt01_RsltInptR.$inpt_loc_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno1, ReExp_Sprt01_RsltInptR.$sno1);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno1_null_flg, ReExp_Sprt01_RsltInptR.$sno1_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno2, ReExp_Sprt01_RsltInptR.$sno2);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno2_null_flg, ReExp_Sprt01_RsltInptR.$sno2_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno3, ReExp_Sprt01_RsltInptR.$sno3);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno3_null_flg, ReExp_Sprt01_RsltInptR.$sno3_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno4, ReExp_Sprt01_RsltInptR.$sno4);
				addColumnPathMap(IoSchd_Ins01_DtlR.$sno4_null_flg, ReExp_Sprt01_RsltInptR.$sno4_null_flg);
				addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_cd, ReExp_Sprt01_RsltInptR.$base_unit_cd); //取引単位には基準単位を設定
				addColumnPathMap(IoSchd_Ins01_DtlR.$trd_unit_qty, ReExp_Sprt01_RsltInptR.$io_schd_rqmt_qty);
				addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_cd, ReExp_Sprt01_RsltInptR.$base_unit_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$base_unit_qty, ReExp_Sprt01_RsltInptR.$io_schd_rqmt_qty); //受払予定の数量は必要数量
				addColumnPathMap(IoSchd_Ins01_DtlR.$gd_cd, ReExp_Sprt01_RsltInptR.$gd_cd);
				addColumnPathMap(IoSchd_Ins01_DtlR.$vld_dt_fr, ReExp_Sprt01_RsltInptR.$inpt_schd_dt); //有効期限ＦＲＯＭに投入予定日を設定
				addColumnPathMap(IoSchd_Ins01_DtlR.$inpt_ctl_typ, ReExp_Sprt01_RsltInptR.$inpt_ctl_typ);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				// 紐付けＮＯからup1の情報を取得
				MfgInstTblReg_Upd08_Dtl2R up1R = up1().getFirst(_up1IdxKey, src.oper_peg_no());
				
				dest.io_schd_no(up1R.itm_ord_no()); //受払予定ＮＯには品目オーダＮＯを設定
				dest.io_schd_typ(MSC_IO_SCHD_TYP.INPT.value()); //受払予定区分は「投入」固定
				dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SCHD.value()); //受払予定状況は「予定」固定
				dest.oper_ord_no(up1R.oper_ord_no());
				dest.io_schd_sub_no1(up1R.itm_ord_no()); //受払予定ＮＯ１には品目オーダＮＯを設定
				dest.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value()); //受払予定区分１は「品目オーダＮＯ」固定
				dest.io_schd_sub_no2(up1R.oper_ord_no()); //受払予定ＮＯ２には工程オーダＮＯを設定
				dest.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.OPER_ORD_NO.value()); //受払予定区分２は「工程オーダＮＯ」固定
				
				dest.str_ln_cd(MAC_STR.NULL_VAL.value()); //棚・ラインＣＤは構成展開から取得できないためＮＵＬＬ文字
				dest.lot_no(MAC_STR.NULL_VAL.value()); //ロットＮＯは構成展開から取得できないためＮＵＬＬ文字
				dest.sublot_no(MAC_STR.NULL_VAL.value()); //サブロットＮＯは構成展開から取得できないためＮＵＬＬ文字
				dest.quality_typ(MAC_QUALITY_TYP.GOOD.value()); //良品区分は「良品」固定
				dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value()); //在庫検査区分は「検査済」固定
				dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value()); //在庫識別区分は「自社在庫」固定
				dest.stk_bp_cd(MAC_STR.NULL_VAL.value()); //在庫取引先ＣＤはＮＵＬＬ文字
				dest.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value()); //在庫着荷先ＣＤはＮＵＬＬ文字
			}
		}

		/**
		 * 引数のリストから自給品、指図書のみ品を除外する
		 * @param l
		 * @return
		 */
		protected MCList<ReExp_Sprt01_RsltInptR> excldSSandNoMrp(MCList<ReExp_Sprt01_RsltInptR> l) {
			MCList<ReExp_Sprt01_RsltInptR> retL = MCList.create(ReExp_Sprt01_RsltInptR.class);
			for (ReExp_Sprt01_RsltInptR r : l) {
				if (MAC_PROV_TYP.isSS(r.prov_typ())) {
					// 自給品
					continue;
				}
				if (MAC_INPT_CTL_TYP.isNO_MRP_INST(r.inpt_ctl_typ())) {
					// ＭＲＰ対象外（指図書のみ）
					continue;
				}
				retL.add(r);
			}
			return retL;
		}
		
		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().addAll(up0());
		}
	}

	/**
	 * MfgInstTblReg_Upd09オペレーション.<p>
	 *
	 * 投入の受払予定を作成する。投入予定、投入引当状況、投入実績残テーブルの更新がすべて完了した後に呼ばれることを前提とする。<br>
	 */
	public class MfgInstTblReg_Upd09
			extends MSBCL_MfgInstTblRegService_MC_A.MfgInstTblReg_Upd09 {

		// 上り電文の「mfg_sts_typ」（製造状況区分）について
		// 当オペレーションで受払予定の状況区分を設定する際に製造指図テーブルの製造状況区分を参照していますが、
		// 上り電文の製造状況区分が設定されている場合はそちらを優先します。
		// これは、製造指図一覧登録で引当数不足などのエラーが発生した際に、以下のような動きになることに対する仕様です。
		// 製造状況区分＝指図済で製造指図を登録→当オペレーション→製造状況区分＝指図保存で製造指図を更新
		// 上記の場合、本来であれば指図保存で受払予定を作成したいのですが、当オペレーション実行時にはテーブルの値が指図済となっているため、
		// 上り電文で渡すようにしています。
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callIoSchd();
		}

		/**
		 * 投入予定、投入実績残、ヘッダ情報を抽出します。
		 * @return
		 */
		protected MCList<MST_INPT_SCHD_R> srchInptSchd() {
			
			insInptSchdWk(up0());
					
			MSVT_INPT_SCHD_PR_R t1 = MSVT_INPT_SCHD_PR_R.create("T1");
			MSVT_MFG_INST_PR_R t2 = MSVT_MFG_INST_PR_R.create("T2");
			MST_ITM_MFG_INST_R t3 = MST_ITM_MFG_INST_R.create("T3");
			MST_MFG_INST_R t4 = MST_MFG_INST_R.create("T4");
			MST_OPER_INST_R t5 = MST_OPER_INST_R.create("T5");
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			MST_INPT_SCHD_R t = MST_INPT_SCHD_R.create("T");
			MSW_INPT_SCHD_KEY_R inptSchdKey = MSW_INPT_SCHD_KEY_R.create("INPTSCHDKEY");
			MCColumn[] addCols = {
					t2.mfg_sts_typ.as("hdr_mfg_sts_typ"), t2.itm_mfg_inst_no,
					t3.itm_ord_no, t3.io_schd_pr_no, t3.mfg_loc_cd,
					t4.mfg_inst_unit_typ,
					t1.base_unit_fxd_rqmt_rem_qty, m1.dec_place,
					t5.oper_ord_no,
					bracket(t.base_unit_rqmt_qty.subtract(t.base_unit_inpt_qty)
							.add(t1.base_unit_inpt_rem_qty)).as("base_unit_rqmt_rem_qty")
			};
			// 投入実績残の必要残数は参考値のため、必要数－投入数＋投入残数で再算出する
			MCList<MST_INPT_SCHD_R> inptL = MCList.create(MST_INPT_SCHD_R.class);
			MCQueryApiBuilder inptL_bldr = MCQueryApiBuilder.create(t);
			// 受払予定では投入予定の多くのカラムを参照するため、setSelectせずに全カラム取得する
			inptL_bldr.addSelect(addCols);
			inptL_bldr.addInnerJoin(inptSchdKey, t.inpt_schd_no.eq(inptSchdKey.inpt_schd_no));
			inptL_bldr.addInnerJoin(t1, bracket( t.inpt_schd_no.eq(t1.inpt_schd_no)));
			inptL_bldr.addLeftOuterJoin(t2, bracket( t.mfg_inst_no.eq(t2.mfg_inst_no)));
			inptL_bldr.addInnerJoin(t3, bracket( t1.itm_mfg_inst_no.eq(t3.itm_mfg_inst_no)));
			inptL_bldr.addLeftOuterJoin(t4, bracket( t3.frst_mfg_inst_no.eq(t4.mfg_inst_no)));
			inptL_bldr.addLeftOuterJoin(t5, bracket( t.oper_inst_no.eq(t5.oper_inst_no)));
			inptL_bldr.addLeftOuterJoin(m1, bracket( m1.itm_cd.eq(t.itm_cd)
					.and(m1.itm_sub1.eq(t.itm_sub1))
					.and(m1.itm_sub2.eq(t.itm_sub2))
					.and(m1.itm_sub3.eq(t.itm_sub3))));
			inptL_bldr.addWhereWithAnd(bracket( t.prov_typ.isNull()
					.or(t.prov_typ.neq(value(MAC_PROV_TYP.SS.value()))))); //自給を除外
			inptL_bldr.addWhereWithAnd(t.inpt_ctl_typ.neq(value(MAC_INPT_CTL_TYP.NO_MRP_INST.value()))); //指図書のみを除外
			inptL_bldr.addWhereWithAnd(t1.mfg_sts_typ.neq(value(MSC_MFG_STS_TYP.CMPL.value()))); //完了を除外
			inptL_bldr.addWhereWithAnd(t.can_flg.eq(value(false))); //取消を除外
			dbSelect("MSBCL6010_MST_INPT_SCHD_S01",
					inptL, inptL_bldr, up0().groupBy(MfgInstTblReg_Upd09_DtlInptR.$inpt_schd_no));
			return inptL;
		}
		
		protected void insInptSchdWk(MCList<MfgInstTblReg_Upd09_DtlInptR> dtlInptL) {
			
			MCList<MST_INPT_SCHD_R> inptSchdL = MCList.create(MST_INPT_SCHD_R.class);
			
			for (MfgInstTblReg_Upd09_DtlInptR r : dtlInptL.groupBy(MST_INPT_SCHD_R.$inpt_schd_no)) {
				if (!isNull(r.inpt_schd_no())) {
					inptSchdL.add().inpt_schd_no(r.inpt_schd_no());
				}
			}
			
			MST_INPT_SCHD_R dbc_t = MST_INPT_SCHD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc_t);
			dbWkDelete("MSBCL6010_MSW_INPT_SCHD_D01", dbc_bldr.getBaseDbc());
			dbWkInsert("MSBCL6010_MSW_INPT_SCHD_I01", inptSchdL, dbc_bldr.getBaseDbc());
		}

		/**
		 * 投入引当状況を抽出します。
		 * @return
		 */
		protected MCList<MST_INPT_ALLOC_STS_R> srchInptAllocSts() {
			MCList<MST_INPT_ALLOC_STS_R> allocL = MCList.create(MST_INPT_ALLOC_STS_R.class);
			MST_INPT_ALLOC_STS_R t = MST_INPT_ALLOC_STS_R.create("T");
			MCColumn[] setCols = {
					t.inpt_alloc_sts_no,
					t.inpt_schd_no,
					t.base_unit_qty,
					t.stk_id_typ,
					t.stk_bp_cd,
					t.stk_arrv_bp_cd,
					t.to_stk_id_typ,
					t.to_stk_bp_cd,
					t.to_stk_arrv_bp_cd,
			};
			MCQueryApiBuilder allocL_bldr = MCQueryApiBuilder.create(t);
			allocL_bldr.setSelect(setCols);
			allocL_bldr.addWhereWithAnd(t.inpt_schd_no.eq(bind("inpt_schd_no")));
			dbSelect("MSBCL6010_MST_INPT_ALLOC_STS_S01",
					allocL, allocL_bldr, up0().groupBy(MfgInstTblReg_Upd09_DtlInptR.$inpt_schd_no));
			return allocL;

		}

		/**
		 * 投入の受払予定を作成します。
		 */
		protected void callIoSchd() {
			MCList<IoSchd_Ins01_DtlR> ioL = MCList.create(IoSchd_Ins01_DtlR.class);

			// 上り電文の投入予定ＮＯから投入予定を抽出
			MCList<MST_INPT_SCHD_R> inptL = srchInptSchd();

			if (inptL.isEmpty()) {
				return;
			}

			// 受払予定の基準単位数量に設定するための数値カラムを追加
			inptL.addNumberColumn("BASE_UNIT_QTY");

			// 基準単位数量の算出
			calcBaseUnitQty(inptL);

			// 上り電文の投入予定ＮＯのインデックスキーを作成
			MCIndexKey upKey = up0().createIndex(MfgInstTblReg_Upd09_DtlInptR.$inpt_schd_no);
			
			// 上り電文の投入予定ＮＯから投入引当状況を抽出
			MCList<MST_INPT_ALLOC_STS_R> allocL = srchInptAllocSts();
			MCIndexKey allocKey = allocL.createIndex(MST_INPT_ALLOC_STS_R.$inpt_schd_no);

			FXUCL_Cache<MST_INPT_SCHD_R> hasAltItmFixCache = crtAltItmFixCache(inptL);
			for (MST_INPT_SCHD_R inptR : inptL) {

				// 数量が０の場合は対象外
				if (inptR.getNumber("BASE_UNIT_QTY").isZero()) {
					continue;
				}

				IoSchd_Ins01_DtlR ioR = IoSchd_Ins01_DtlR.create();
				ioR.io_schd_typ(MSC_IO_SCHD_TYP.INPT.value()); //受払予定区分は「投入」固定

				// 上り電文を取得
				MfgInstTblReg_Upd09_DtlInptR upR = up0().getFirst(upKey, inptR.inpt_schd_no());
				
				String stsTyp = inptR.getString("HDR_MFG_STS_TYP");
				if (isNull(stsTyp) || MSC_MFG_STS_TYP.isSAV(stsTyp)
						|| MSC_MFG_STS_TYP.isYET(stsTyp)) {
					// 指図保存または未指図（※工程単位製造指図の未指図工程に紐付く投入）の場合は「製造保存」
					ioR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.MFG_SAV.value());
				}
				else if (MSC_MFG_STS_TYP.isORD(stsTyp)) {
					if (MSC_MFG_STS_TYP.isSAV(upR.mfg_sts_typ())) {
						// 本オペレーションの最初のコメントに記載した理由から、上り電文が指図保存の場合は、上り電文を優先する
						ioR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.MFG_SAV.value());
					}
					else {
						// 指図済の場合は「指図済」
						ioR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD.value());
					}
				}
				else if (MSC_MFG_STS_TYP.isSTT(stsTyp)
						|| MSC_MFG_STS_TYP.isCMPL(stsTyp)) {
					// 着手中または完了（※製造は完了だが投入実績が未計上の状態）の場合は「着手中」
					ioR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.STT.value());
				}

				//着手分割を行った場合は受払予定連番に分割連番を設定する想定だったが、分割連番を考慮しない仕様にかわったため、何も設定しない

				ioR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value()); //受払予定予備区分１は「品目オーダＮＯ」固定
				ioR.io_schd_sub_no1(inptR.getString("ITM_ORD_NO")); //受払予定予備ＮＯ１は品目オーダＮＯ
				ioR.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.OPER_INST_NO.value()); //受払予定予備区分２は「工程指図ＮＯ」固定
				ioR.io_schd_sub_no2(inptR.oper_inst_no()); //受払予定予備ＮＯ２は工程指図ＮＯ
				ioR.io_schd_sub_typ3(MSC_IO_SCHD_SUB_TYP.MFG_INST_NO.value()); //受払予定予備区分３は「製造指図ＮＯ」固定
				ioR.io_schd_sub_no3(inptR.mfg_inst_no()); //受払予定予備ＮＯ３は製造指図ＮＯ
				// 受払予定予備連番１～３には何も設定しない
				// 受払予定予備４には何も設定しない

				// 各種ＮＯ
				ioR.io_schd_no(inptR.inpt_schd_no()); //受払予定ＮＯは投入予定ＮＯ
				ioR.oper_inst_no(inptR.oper_inst_no());
				ioR.itm_mfg_inst_no(inptR.getString("ITM_MFG_INST_NO"));
				ioR.io_schd_pr_no(inptR.getString("IO_SCHD_PR_NO"));
				ioR.oper_ord_no(inptR.getString("OPER_ORD_NO"));

				// ヘッダ情報
				ioR.mfg_inst_unit_typ(inptR.getString("MFG_INST_UNIT_TYP"));
				ioR.mfg_loc_cd(inptR.getString("MFG_LOC_CD"));

				// 投入情報
				ioR.schd_dt(inptR.schd_tm());
				ioR.itm_cd(inptR.itm_cd());
				ioR.itm_sub1(inptR.itm_sub1());
				ioR.itm_sub2(inptR.itm_sub2());
				ioR.itm_sub3(inptR.itm_sub3());
				ioR.ver_no(inptR.ver_no());
				if (!isNull(inptR.alt_grp_cd())) {
					if (hasAltItmFixCache.getCache(inptR.oper_inst_no(), inptR.alt_grp_cd(),
							inptR.alt_grp_seq()) == null) {
						// 代替品かつ代替品目指定していない場合のみ、代替グループＣＤ、連番、代替元数を設定する
						// ※ＭＲＰは出庫予定をもとに引当する際に、代替グループＣＤが設定されていると
						// 代替元数をもとに、代替グループ単位で引当・オーダ生成してしまうため。
						ioR.alt_grp_cd(inptR.alt_grp_cd());
						ioR.alt_grp_seq(inptR.alt_grp_seq());
						// 製造指図時に数量を変更した場合を考慮し、代替元数はＢＯＭの値ではなく投入必要数量と固定必要数量の合計値を設定する。
						ioR.alt_qty(inptR.base_unit_rqmt_qty().add(inptR.base_unit_fxd_rqmt_qty()));
					}
				}
				ioR.alt_itm_typ(inptR.alt_itm_typ());
				ioR.alt_itm_ratio(inptR.alt_itm_ratio());
				ioR.alt_alloc_prio(inptR.alt_alloc_prio());
				ioR.loc_cd(inptR.inpt_loc_cd());
				ioR.str_ln_cd(inptR.inpt_str_ln_cd());
				ioR.lot_no(inptR.lot_no());
				ioR.sublot_no(inptR.sublot_no());
				
				if (inptR.alloc_flg()) {
					// 引当済の場合は引当手配ＮＯを設定（念のためnvlしておく）
					ioR.sno1(nvl(inptR.alloc_sno1(), inptR.sno1()));
					ioR.sno2(nvl(inptR.alloc_sno2(), inptR.sno2()));
					ioR.sno3(nvl(inptR.alloc_sno3(), inptR.sno3()));
					ioR.sno4(nvl(inptR.alloc_sno4(), inptR.sno4()));
				}
				else {
					// 未引当の場合は手配ＮＯを設定
					ioR.sno1(inptR.sno1());
					ioR.sno2(inptR.sno2());
					ioR.sno3(inptR.sno3());
					ioR.sno4(inptR.sno4());
				}

				ioR.sno1_null_flg(inptR.sno1_null_flg());
				ioR.sno2_null_flg(inptR.sno2_null_flg());
				ioR.sno3_null_flg(inptR.sno3_null_flg());
				ioR.sno4_null_flg(inptR.sno4_null_flg());
				ioR.trd_unit_cd(inptR.base_unit_cd());
				ioR.base_unit_cd(inptR.base_unit_cd());
				ioR.gd_cd(inptR.gd_cd());
				ioR.inpt_ctl_typ(inptR.inpt_ctl_typ());
				ioR.vld_dt_fr(inptR.schd_tm());
				ioR.alloc_flg(inptR.alloc_flg());

				ioR.quality_typ(MAC_QUALITY_TYP.GOOD.value()); //良品区分は「良品」固定
				ioR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value()); //在庫検査区分は「検査済」固定

				// 投入引当状況を取得
				MCList<MST_INPT_ALLOC_STS_R> allocSubL = allocL
						.subList(allocKey, inptR.inpt_schd_no());

				if (allocSubL.isEmpty()) {
					// 投入引当状況が存在しない場合
					if (inptR.containsTemp("TMP_DIVIDE_QTY")
							&& !isNull(inptR.getNumber("TMP_DIVIDE_QTY"))) {
						// 代替品の案分処理で設定された数量が存在する場合は設定
						ioR.base_unit_qty(inptR.getNumber("TMP_DIVIDE_QTY"));
					}
					else {
						ioR.base_unit_qty(inptR.getNumber("BASE_UNIT_QTY"));
					}
					ioR.trd_unit_qty(ioR.base_unit_qty());
					ioR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value()); //在庫識別区分は「自社在庫」固定
					ioR.stk_bp_cd(MAC_STR.NULL_VAL.value()); //在庫取引先ＣＤはＮＵＬＬ文字
					ioR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value()); //在庫着荷先ＣＤはＮＵＬＬ文字
					ioL.add(ioR);
				}
				else {
					// 投入引当状況が存在する場合、基準単位数量（必要残数＋固定必要残数）を各レコードに割り当て
					// 自社在庫を優先的に引き当てるため、残数はなるべく他社在庫に設定したい
					// そのため、在庫識別区分の降順でソートして割り当てる
					// 代替品の案分処理で設定された数量が存在する場合はそちらを使用する
					MCNumber totalQty = MCNumber.ZERO;
					if (inptR.containsTemp("TMP_DIVIDE_QTY")
							&& !isNull(inptR.getNumber("TMP_DIVIDE_QTY"))) {
						// 代替品の案分処理で設定された数量が存在する場合は設定
						totalQty = inptR.getNumber("TMP_DIVIDE_QTY");
					}
					else {
						totalQty = inptR.getNumber("BASE_UNIT_QTY");
					}
					allocSubL.sort(SortType.DESC, MST_INPT_ALLOC_STS_R.$stk_id_typ);
					allocSubL.addNumberColumn("TMP_BASE_UNIT_QTY");

					FXUCC_Divide.inSeq(allocSubL, totalQty,
							MST_INPT_ALLOC_STS_R.$base_unit_qty, "TMP_BASE_UNIT_QTY");

					for (MST_INPT_ALLOC_STS_R allocR : allocSubL) {
						// 割り当ての結果、数量が０になる場合は何もしない
						if (allocR.getNumber("TMP_BASE_UNIT_QTY").isZero()) {
							continue;
						}
						IoSchd_Ins01_DtlR newR = ioR.clone();
						newR.base_unit_qty(allocR.getNumber("TMP_BASE_UNIT_QTY"));
						// 取引単位数量は不使用項目のため、渡さない
						newR.stk_id_typ(allocR.to_stk_id_typ());
						newR.stk_bp_cd(allocR.to_stk_bp_cd());
						newR.stk_arrv_bp_cd(allocR.to_stk_arrv_bp_cd());
						ioL.add(newR);
					}
				}
			}

			if (ioL.isEmpty()) {
				return;
			}

			// 投入の受払予定の作成
			MSBEL_IoSchdService.IoSchd_Ins01 ioSchdInpt = MSBEL_IoSchdService
					.crtIoSchd_Ins01();
			ioSchdInpt.up0().addAll(ioL);
			ioSchdInpt.exec();
		}
		protected FXUCL_Cache<MST_INPT_SCHD_R> crtAltItmFixCache(MCList<MST_INPT_SCHD_R> inptL) {
			FXUCL_Cache<MST_INPT_SCHD_R> hasAltFix = new FXUCL_Cache<MST_INPT_SCHD_R>();
			hasAltFix.setFixMaxCacheSize(-1);
			for (MST_INPT_SCHD_R inptR : inptL) {
				if (inptR.alt_itm_fix_flg()) {
					Comparable<?>[] key = new Comparable<?>[] {
							inptR.oper_inst_no(), inptR.alt_grp_cd(), inptR.alt_grp_seq()
					};
					MST_INPT_SCHD_R val = hasAltFix.getCache(key);
					if (isNull(val)) {
						hasAltFix.putCache(key, inptR);
					}
				}
			}
			return hasAltFix;
		}

		/**
		 * 受払予定に設定する基準単位数量を算出します。
		 * 代替品場合、数量を案分します。
		 * @param inptL
		 */
		protected void calcBaseUnitQty(MCList<MST_INPT_SCHD_R> inptL) {
			// 受払予定に設定する数量は、必要数量の残数＋固定必要数量の残数。

			// 同一代替Ｇの中に代替品目指定された品目が存在しない場合、投入数量を各代替品に案分する。
			// ロット混在可の場合は案分比率に従って案分し、混在不可の場合は最も優先度が高い品目以外は０にする。

			// 取得した投入予定から工程指図ＮＯ、代替グループＣＤ、代替グループ連番単位に処理
			for (MCList<MST_INPT_SCHD_R> inptSubL : inptL.groupList(
					MST_INPT_SCHD_R.$oper_inst_no, MST_INPT_SCHD_R.$alt_grp_cd,
					MST_INPT_SCHD_R.$alt_grp_seq)) {

				// 代替グループ単位にグループ化したリストの１件目を取得
				MST_INPT_SCHD_R firstR = inptSubL.get(0);

				// 代替グループＣＤが未設定の場合、必要残数と固定必要残数の合計を基準単位数量に設定
				if (isNull(firstR.alt_grp_cd())) {
					for (MST_INPT_SCHD_R inptR : inptSubL) {
						inptR.setNumber("BASE_UNIT_QTY",
								sum(inptR.getNumber("BASE_UNIT_RQMT_REM_QTY"),
										inptR.getNumber("BASE_UNIT_FXD_RQMT_REM_QTY")));
					}
					continue;
				}

				// 代替品目指定フラグにインデックスキーを設定
				MCIndexKey idxKey = inptSubL
						.createIndex(MST_INPT_SCHD_R.$alt_itm_fix_flg);

				if (inptSubL.contains(idxKey, true)) {
					// 代替品目指定のレコードが存在する場合
					for (MST_INPT_SCHD_R inptR : inptSubL) {
						if (inptR.alt_itm_fix_flg()) {
							// 代替品目指定対象のレコードの基準単位数量を設定
							inptR.setNumber("BASE_UNIT_QTY", sum(
									inptR.getNumber("BASE_UNIT_RQMT_REM_QTY"),
									inptR.getNumber("BASE_UNIT_FXD_RQMT_REM_QTY")));
						}
						else {
							// 代替品目指定対象外のレコードの基準単位数量に０を設定
							inptR.setNumber("BASE_UNIT_QTY", MCNumber.ZERO);
						}
					}
				}
				else {
					// 代替品目指定のレコードが存在しない場合
					// 必要残数＋固定必要残数を必要残数合計として基準単位数量に格納
					for (MST_INPT_SCHD_R inptR : inptSubL) {
						inptR.setNumber("BASE_UNIT_QTY",
								sum(inptR.getNumber("BASE_UNIT_RQMT_REM_QTY"),
										inptR.getNumber("BASE_UNIT_FXD_RQMT_REM_QTY")));
					}
					// 算出した必要残数合計を案分
					inptL.addNumberColumn("TMP_DIVIDE_QTY");
					MSUCL_ProdUtil.setAltQty(inptSubL, MST_INPT_SCHD_R.$alt_itm_typ,
							MST_INPT_SCHD_R.$alt_itm_ratio, MST_INPT_SCHD_R.$itm_cd,
							"BASE_UNIT_QTY", "DEC_PLACE", "TMP_DIVIDE_QTY");
				}
			}
		}
	}

	/**
	 * MfgInstTblReg_Upd10オペレーション.<p>
	 *
	 * 出来高・副産品の受払予定を作成する。出来高予定、出来高実績残テーブルの更新がすべて完了した後に呼ばれることを前提とする。<br>
	 */
	public class MfgInstTblReg_Upd10
			extends MSBCL_MfgInstTblRegService_MC_A.MfgInstTblReg_Upd10 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callIoSchd();
		}

		/**
		 * 出来高予定、出来高実績残、ヘッダ情報を抽出します。
		 * @return
		 */
		protected MCList<MST_YIELD_SCHD_R> srchYieldSchd() {
			MSVT_YIELD_SCHD_PR_R t1 = MSVT_YIELD_SCHD_PR_R.create("T1");
			MSVT_MFG_INST_PR_R t2 = MSVT_MFG_INST_PR_R.create("T2");
			MST_ITM_MFG_INST_R t3 = MST_ITM_MFG_INST_R.create("T3");
			MST_MFG_INST_R t4 = MST_MFG_INST_R.create("T4");
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			MST_YIELD_SCHD_R t = MST_YIELD_SCHD_R.create("T");
			MCColumn[] setCols = {
					t.mfg_inst_no, t.oper_inst_no,
					t.schd_tm, t.itm_cd,
					t.itm_sub1, t.itm_sub2,
					t.itm_sub3, t.strg_loc_cd,
					t.strg_str_ln_cd, t.lot_no,
					t.sublot_no, t.sno1,
					t.sno2, t.sno3,
					t.sno4, t.trd_unit_cd,
					t.base_unit_cd, t.yield_typ,
					t.yield_schd_no, t.io_schd_pr_no,
			};
			MCColumn[] addCols = {
					t2.mfg_sts_typ.as("hdr_mfg_sts_typ"), t3.itm_ord_no,
					t2.itm_mfg_inst_no, t1.trd_unit_yield_rem_qty,
					t1.base_unit_yield_rem_qty, t3.mfg_loc_cd, t4.mfg_inst_unit_typ,
			};

			MCList<MST_YIELD_SCHD_R> yieldL = MCList.create(MST_YIELD_SCHD_R.class);
			MCQueryApiBuilder yieldL_bldr = MCQueryApiBuilder.create(t);
			yieldL_bldr.setSelect(setCols);
			yieldL_bldr.addSelect(addCols);
			yieldL_bldr.addInnerJoin(t1, bracket( t.yield_schd_no.eq(t1.yield_schd_no)));
			yieldL_bldr.addLeftOuterJoin(t2, bracket( t.mfg_inst_no.eq(t2.mfg_inst_no)));
			yieldL_bldr.addInnerJoin(t3, bracket( t1.itm_mfg_inst_no.eq(t3.itm_mfg_inst_no)));
			yieldL_bldr.addLeftOuterJoin(t4, bracket( t3.frst_mfg_inst_no.eq(t4.mfg_inst_no)));
			yieldL_bldr.addLeftOuterJoin(m1, bracket( m1.itm_cd.eq(t.itm_cd)
					.and(m1.itm_sub1.eq(t.itm_sub1))
					.and(m1.itm_sub2.eq(t.itm_sub2))
					.and(m1.itm_sub3.eq(t.itm_sub3))));
			yieldL_bldr.setWhere(t.yield_schd_no.eq(bind("yield_schd_no"))); //出来高予定ＮＯを条件に検索
			yieldL_bldr.addWhereWithAnd(t1.mfg_sts_typ.neq(value(MSC_MFG_STS_TYP.CMPL.value()))); //完了を除外
			yieldL_bldr.addWhereWithAnd(t3.mfg_mtd_typ.neq(value(MSC_MFG_MTD_TYP.EXTNL.value()))); //外注を除外
			yieldL_bldr.addWhereWithAnd(t.can_flg.eq(value(false))); //取消を除外
			dbSelect("MSBCL6010_MST_YIELD_SCHD_S01",
					yieldL, yieldL_bldr, up0().groupBy(MfgInstTblReg_Upd10_DtlYieldR.$yield_schd_no));
			return yieldL;
		}

		/**
		 * 出来高・副産品の受払予定を作成します。
		 */
		protected void callIoSchd() {
			MCList<IoSchd_Ins01_DtlR> ioL = MCList.create(IoSchd_Ins01_DtlR.class);
			MCList<IoSchd_Ins01_DtlR> inspSrchL = MCList.create(IoSchd_Ins01_DtlR.class);

			// 上り電文の出来高予定ＮＯから出来高予定を抽出
			MCList<MST_YIELD_SCHD_R> yieldL = srchYieldSchd();

			if (yieldL.isEmpty()) {
				return;
			}

			for (MST_YIELD_SCHD_R yieldR : yieldL) {

				// 基準単位数量が０の場合は対象外
				if (yieldR.getNumber("BASE_UNIT_YIELD_REM_QTY").isZero()) {
					continue;
				}

				IoSchd_Ins01_DtlR ioR = IoSchd_Ins01_DtlR.create();

				// 受払予定区分は出来高区分に従う
				if (MAC_YIELD_TYP.isBYPROD(yieldR.yield_typ())) {
					// 副産品製造
					ioR.io_schd_typ(MSC_IO_SCHD_TYP.BYMFG.value());
				}
				else {
					// 製造
					ioR.io_schd_typ(MSC_IO_SCHD_TYP.MFG.value());
				}

				// 受払状況区分は製造指図の状況に従う
				String stsTyp = yieldR.getString("HDR_MFG_STS_TYP");
				if (isNull(stsTyp) || MSC_MFG_STS_TYP.isSAV(stsTyp)
						|| MSC_MFG_STS_TYP.isYET(stsTyp)) {
					// 指図保存または未指図（※工程単位製造指図の未指図工程に紐付く投入）の場合は「製造保存」
					ioR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.MFG_SAV.value());
				}
				else if (MSC_MFG_STS_TYP.isORD(stsTyp)) {
					// 指図済の場合は「指図済」
					ioR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.ORD.value());
				}
				else if (MSC_MFG_STS_TYP.isSTT(stsTyp)
						|| MSC_MFG_STS_TYP.isCMPL(stsTyp)) {
					// 着手中または完了（※製造は完了だが投入実績が未計上の状態）の場合は「着手中」
					ioR.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.STT.value());
				}

				//着手分割を行った場合は受払予定連番に分割連番を設定する想定だったが、分割連番を考慮しない仕様にかわったため、何も設定しない

				ioR.io_schd_sub_typ1(MSC_IO_SCHD_SUB_TYP.ITM_ORD_NO.value()); //受払予定予備区分１は「品目オーダＮＯ」固定
				ioR.io_schd_sub_no1(yieldR.getString("ITM_ORD_NO")); //受払予定予備ＮＯ１は品目オーダＮＯ
				ioR.io_schd_sub_typ2(MSC_IO_SCHD_SUB_TYP.OPER_INST_NO.value()); //受払予定予備区分２は「工程指図ＮＯ」固定
				ioR.io_schd_sub_no2(yieldR.oper_inst_no()); //受払予定予備ＮＯ２は工程指図ＮＯ
				ioR.io_schd_sub_typ3(MSC_IO_SCHD_SUB_TYP.MFG_INST_NO.value()); //受払予定予備区分３は「製造指図ＮＯ」固定
				ioR.io_schd_sub_no3(yieldR.mfg_inst_no()); //受払予定予備ＮＯ３は製造指図ＮＯ
				// 受払予定予備連番１～３には何も設定しない
				// 受払予定予備４には何も設定しない

				// 各種ＮＯ
				ioR.io_schd_no(yieldR.yield_schd_no()); //受払予定ＮＯは出来高予定ＮＯ
				ioR.oper_inst_no(yieldR.oper_inst_no());
				ioR.itm_mfg_inst_no(yieldR.getString("ITM_MFG_INST_NO"));
				ioR.io_schd_pr_no(yieldR.io_schd_pr_no());

				// ヘッダ情報
				ioR.mfg_inst_unit_typ(yieldR.getString("MFG_INST_UNIT_TYP"));
				ioR.mfg_loc_cd(yieldR.getString("MFG_LOC_CD"));

				// 出来高情報
				ioR.schd_dt(yieldR.schd_tm());
				ioR.itm_cd(yieldR.itm_cd());
				ioR.itm_sub1(yieldR.itm_sub1());
				ioR.itm_sub2(yieldR.itm_sub2());
				ioR.itm_sub3(yieldR.itm_sub3());
				ioR.loc_cd(yieldR.strg_loc_cd());
				ioR.str_ln_cd(yieldR.strg_str_ln_cd());
				ioR.lot_no(yieldR.lot_no());
				ioR.sublot_no(yieldR.sublot_no());
				ioR.sno1(yieldR.sno1());
				ioR.sno2(yieldR.sno2());
				ioR.sno3(yieldR.sno3());
				ioR.sno4(yieldR.sno4());
				ioR.trd_unit_cd(yieldR.trd_unit_cd());
				ioR.base_unit_cd(yieldR.base_unit_cd());
				// 取引単位数量は不使用項目のため、渡さない
				ioR.base_unit_qty(yieldR.getNumber("BASE_UNIT_YIELD_REM_QTY")); //基準単位の残数を設定

				ioR.gd_cd(getDefaultFeedStkGd().gd_cd()); //格付ＣＤはデフォルト値
				ioR.quality_typ(MAC_QUALITY_TYP.GOOD.value()); //良品区分は「良品」固定
				ioR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value()); //在庫検査区分は「検査済」固定
				ioR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value()); //在庫識別区分は「自社在庫」固定
				ioR.stk_bp_cd(MAC_STR.NULL_VAL.value()); //在庫取引先ＣＤはＮＵＬＬ文字
				ioR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value()); //在庫着荷先ＣＤはＮＵＬＬ文字

				ioL.add(ioR);

				// 出来高の場合は検査終了予定日設定用のリストに追加
				if (!MAC_YIELD_TYP.isBYPROD(yieldR.yield_typ())) {
					inspSrchL.add(ioR);
				}
			}

			if (ioL.isEmpty()) {
				return;
			}

			// 検査終了予定日を設定
			if (!inspSrchL.isEmpty()) {
				setInspCmplSchdDt(inspSrchL);
			}

			// 投入の受払予定の作成
			MSBEL_IoSchdService.IoSchd_Ins01 ioSchdInpt = MSBEL_IoSchdService
					.crtIoSchd_Ins01();
			ioSchdInpt.up0().addAll(ioL);
			ioSchdInpt.exec();
		}

		/**
		 * 受払予定サービスに渡す出来高予定に対して検査終了予定日を設定します。
		 * @param yieldL
		 */
		protected void setInspCmplSchdDt(MCList<IoSchd_Ins01_DtlR> ioL) {

			// 検査着手・終了予定日取得オペレーションの実行
			MSBFL_InspSchdService.InspSchd_Srch03 inspSrch = MSBFL_InspSchdService
					.crtInspSchd_Srch03();

			if (!ioL.isEmpty()) {
				setPegNo(ioL);
				addAll(inspSrch.up0(), ioL,
						createMap_InspSchd_Srch03_CndR_IoSchd_Ins01_DtlR());
			}
			if (!inspSrch.up0().isEmpty()) {
				inspSrch.exec();
				// pegNoを元にサービスの下り電文の値を自身のコンテナにコピー
				String[] destCols = new String[] {
						IoSchd_Ins01_DtlR.$insp_cmpl_schd_dt
				};
				String[] srcCols = new String[] {
						InspSchd_Srch03_CndR.$end_dt
				};
				copyByPegNo(ioL, destCols, inspSrch.down0(), srcCols);
			}
		}

		/**
		 * 受払予定作成コンテナから検査着手・終了予定日取得コンテナへのマッパー
		 * @return
		 */
		protected Map_InspSchd_Srch03_CndR_IoSchd_Ins01_DtlR<InspSchd_Srch03_CndR, IoSchd_Ins01_DtlR> createMap_InspSchd_Srch03_CndR_IoSchd_Ins01_DtlR() {
			return new Map_InspSchd_Srch03_CndR_IoSchd_Ins01_DtlR<InspSchd_Srch03_CndR, IoSchd_Ins01_DtlR>();
		}

		public class Map_InspSchd_Srch03_CndR_IoSchd_Ins01_DtlR<D extends InspSchd_Srch03_CndR, S extends IoSchd_Ins01_DtlR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Srch03_CndR.$peg_no, IoSchd_Ins01_DtlR.$peg_no);
				addColumnPathMap(InspSchd_Srch03_CndR.$itm_cd, IoSchd_Ins01_DtlR.$itm_cd);
				addColumnPathMap(InspSchd_Srch03_CndR.$itm_sub1,
						IoSchd_Ins01_DtlR.$itm_sub1);
				addColumnPathMap(InspSchd_Srch03_CndR.$itm_sub2,
						IoSchd_Ins01_DtlR.$itm_sub2);
				addColumnPathMap(InspSchd_Srch03_CndR.$itm_sub3,
						IoSchd_Ins01_DtlR.$itm_sub3);
				addColumnPathMap(InspSchd_Srch03_CndR.$schd_gr_dt,
						IoSchd_Ins01_DtlR.$schd_dt);
				addColumnPathMap(InspSchd_Srch03_CndR.$to_loc_cd,
						IoSchd_Ins01_DtlR.$loc_cd);
				addColumnPathMap(InspSchd_Srch03_CndR.$mfg_loc_cd,
						IoSchd_Ins01_DtlR.$mfg_loc_cd);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.insp_typ(MSC_INSP_TYP.PRDCT.value());
			}
		}
	}

	//FMCB CUSTOM END
}