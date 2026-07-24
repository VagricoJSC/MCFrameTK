package mcframe.serverMSBC.MSBCL6100;

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
import mcframe.serverCore.mcjdbc.MCCursor;
import mcframe.serverCore.resource.MCConst;
import static mcframe.serverMSBC.MSBCL6100.Query.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.createDBTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.setCurrentDBTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.returnedCurrentDBTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_VerChgUpdService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_VerChgUpdService_MC extends MSBCL_VerChgUpdService_MC_A{
	//FMCB CUSTOM START

	/**
	 * VerChg_Upd01オペレーション.<p>
	 *
	 * 版切替情報の指図、実績関連の項目を更新する<br>
	 */
	public class VerChg_Upd01 extends MSBCL_VerChgUpdService_MC_A.VerChg_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			if (isExec()) {
				return;
			}
			MCList<VerChgUpd_DtlR> list = srchData();
			updVerChg(list);
		}
		
		protected boolean isExec() {
			if (isSame(getSysParm("VER_ENABLE_FLG"),"1")) {
				if (!up0().isEmpty()) {
					return false;
				}
			}
			return true;
		}
		
		/**
		 * 切替情報取得処理を実行し結果を返す。
		 */
		protected MCList<VerChgUpd_DtlR> srchData() {
			MCQueryApiBuilder tmp_bldr = MCQueryApiBuilder.create(MST_VER_CHG_R.create("T"));
			dbWkDelete("MSBCL6100_MSW_VER_CHG_D01", tmp_bldr.getBaseDbc());
			
			MCList<VerChgUpd_DtlR> list = up0().groupBy(
					VerChgUpd_DtlR.$par_itm_cd, VerChgUpd_DtlR.$par_itm_sub1,
					VerChgUpd_DtlR.$par_itm_sub2, VerChgUpd_DtlR.$par_itm_sub3,
					VerChgUpd_DtlR.$chd_itm_cd, VerChgUpd_DtlR.$chd_itm_sub1,
					VerChgUpd_DtlR.$chd_itm_sub2, VerChgUpd_DtlR.$chd_itm_sub3,
					VerChgUpd_DtlR.$ver_no, VerChgUpd_DtlR.$bom_ptn,
					VerChgUpd_DtlR.$wg_cd, VerChgUpd_DtlR.$site_cd);
			
			insWk(list);
			
			setOldVerChgInfo(list);
			
			setInstInfo(list);
			
			setActInfo(list);
			
			dbWkDelete("MSBCL6100_MSW_VER_CHG_D02", tmp_bldr.getBaseDbc());
			
			setChgFlg(list);
			
			return list;
		}
		
		protected int getFetchSize() {
			return MCConst.app.getInteger("MS.MSBCL6100.ver_upd.fetch_size", 100);
		}
		
		/**
		 * ワークテーブルを登録する
		 */
		protected void insWk(MCList<VerChgUpd_DtlR> list) {
			MCList<MST_VER_CHG_R> wkL = MCList.create(MST_VER_CHG_R.class);
			
			for (VerChgUpd_DtlR r : list) {
				MST_VER_CHG_R wkR = MST_VER_CHG_R.create();
				wkR.par_itm_cd(r.par_itm_cd());
				wkR.par_itm_sub1(r.par_itm_sub1());
				wkR.par_itm_sub2(r.par_itm_sub2());
				wkR.par_itm_sub3(r.par_itm_sub3());
				wkR.chd_itm_cd(r.chd_itm_cd());
				wkR.chd_itm_sub1(r.chd_itm_sub1());
				wkR.chd_itm_sub2(r.chd_itm_sub2());
				wkR.chd_itm_sub3(r.chd_itm_sub3());
				wkR.ver_no(r.ver_no());
				wkR.bom_ptn(r.bom_ptn());
				wkR.wg_cd(r.wg_cd());
				wkR.site_cd(r.site_cd());
				wkL.add(wkR);
			}
			dbWkInsert("MSBCL6100_MSW_VER_CHG_I01", wkL, MST_VER_CHG_R.create("T"));
		}
		
		/**
		 * 更新前の版切替情報を設定する。
		 */
		protected void setOldVerChgInfo(MCList<VerChgUpd_DtlR> list) {
			MCList<MST_VER_CHG_R> tmpL = MCList.create(MST_VER_CHG_R.class);
			executeQuery(tmpL, MSBCL6100_MSW_VER_CHG_KEY_S01());
			if (tmpL.isEmpty()) {
				return;
			}
			
			MCIndexKey idxkey = tmpL.createIndex(tmpL.createRow().getKeyColumn());
			for (VerChgUpd_DtlR r : list) {
				MST_VER_CHG_R tmpR = tmpL.getFirst(idxkey, r.par_itm_cd(),
						r.par_itm_sub1(), r.par_itm_sub2(), r.par_itm_sub3(),
						r.chd_itm_cd(), r.chd_itm_sub1(), r.chd_itm_sub2(),
						r.chd_itm_sub3(), r.ver_no(), r.bom_ptn(), r.wg_cd(), r.site_cd());
				if (!isNull(tmpR)) {
					MCRow.copyvalue(r.old_ver_chg_p(), tmpR);
					r.ver_chg_exists_flg(true);

					r.first_inst_st_tm(null);
					r.first_inst_lot_no(null);
					r.first_inst_sublot_no(null);
					r.first_mfg_inst_no(null);
					
					r.first_act_st_tm(null);
					r.first_act_lot_no(null);
					r.first_act_sublot_no(null);
					r.first_mfg_act_no(null);
					
					r.last_act_st_tm(null);
					r.last_act_lot_no(null);
					r.last_act_sublot_no(null);
					r.last_mfg_act_no(null);
				}
			}
		}

		/**
		 * 投入予定関連の情報を元に更新に必要な情報を設定する。
		 */
		protected void setInstInfo(MCList<VerChgUpd_DtlR> list) {
			// ある子品目、版ＮＯを使用した親の製造指図分の件数が取得されるため、
			// カーソルを使用して、一度に大量件数を取得しないようにする。

			MCList<MST_VER_CHG_R> dbL = MCList.create(MST_VER_CHG_R.class);
			MCCursor<MST_VER_CHG_R> cur = openCursor(MST_VER_CHG_R.class, MSBCL6100_MSW_VER_CHG_KEY_S02(), null, null, getFetchSize());
			try {
				MST_VER_CHG_R preR = MST_VER_CHG_R.create();
				while (cur.dbFetch() > 0) {
					MCList<MST_VER_CHG_R> curL = cur.getList();
					for (MST_VER_CHG_R curR : curL) {
						// 版切替情報の主キーが変わったら、最初の行をリストに保持しておく
						if (!isColSame(preR, curR, curR.getKeyColumn())) {
							dbL.add(curR);
						}
						preR = curR;
					}
				}
			}
			finally {
				cur.dbCloseCur();
			}

			
			if (dbL.isEmpty()) {
				return;
			}
			
			MCIndexKey idxkey = dbL.createIndex(dbL.createRow().getKeyColumn());
			for (VerChgUpd_DtlR r : list) {
				MST_VER_CHG_R tmpR = dbL.getFirst(idxkey, r.par_itm_cd(),
						r.par_itm_sub1(), r.par_itm_sub2(), r.par_itm_sub3(),
						r.chd_itm_cd(), r.chd_itm_sub1(), r.chd_itm_sub2(),
						r.chd_itm_sub3(), r.ver_no(), r.bom_ptn(), r.wg_cd(), r.site_cd());
				if (!isNull(tmpR)) {
					// 投入予定情報が存在したら、「指図」を設定する。
					// ※この後の処理で上書きされる場合もある
					r.ver_chg_sts_typ(MSC_VER_CHG_STS_TYP.INST.value());
					
					r.first_inst_st_tm(tmpR.first_inst_st_tm());
					r.first_inst_lot_no(tmpR.first_inst_lot_no());
					r.first_inst_sublot_no(tmpR.first_inst_sublot_no());
					r.first_mfg_inst_no(tmpR.first_mfg_inst_no());
					
					r.first_act_st_tm(null);
					r.first_act_lot_no(null);
					r.first_act_sublot_no(null);
					r.first_mfg_act_no(null);
					
					r.last_act_st_tm(null);
					r.last_act_lot_no(null);
					r.last_act_sublot_no(null);
					r.last_mfg_act_no(null);
				}
			}
		}
		
		/**
		 * 投入実績関連の情報を元に更新に必要な情報を設定する。
		 * @return
		 */
		protected void setActInfo(MCList<VerChgUpd_DtlR> list) {
			MCList<MST_VER_CHG_R> dbL = MCList.create(MST_VER_CHG_R.class);

			MCCursor<MST_VER_CHG_R> cur = openCursor(MST_VER_CHG_R.class, MSBCL6100_MSW_VER_CHG_KEY_S03(), null, null, getFetchSize());
			try {
				// 版切替情報の主キーごとに、最初の行と最後の行の
				// 着手実績日、ロット、サブロット、製造実績ＮＯを保持するための処理
				MST_VER_CHG_R preR = MST_VER_CHG_R.create();
				MST_VER_CHG_R addR = MST_VER_CHG_R.create();
				while (cur.dbFetch() > 0) {
					MCList<MST_VER_CHG_R> curL = cur.getList();
					for (MST_VER_CHG_R curR : curL) {
						// 版切替情報の主キーが変わったら、最初の行をリストを保持しておく
						if (!isColSame(preR, curR, curR.getKeyColumn())) {
							addR = curR;
							
							// 最終～の初期値を設定しておく
							addR.last_act_st_tm(curR.first_act_st_tm());
							addR.last_act_lot_no(curR.first_act_lot_no());
							addR.last_act_sublot_no(curR.first_act_sublot_no());
							addR.last_mfg_act_no(curR.first_mfg_act_no());
	
							dbL.add(addR);
						}
						else {
							// 最終～はループのたびに上書き続ける
							addR.last_act_st_tm(curR.first_act_st_tm());
							addR.last_act_lot_no(curR.first_act_lot_no());
							addR.last_act_sublot_no(curR.first_act_sublot_no());
							addR.last_mfg_act_no(curR.first_mfg_act_no());
						}
						preR = curR;
					}
				}
			}
			finally {
				cur.dbCloseCur();
			}
			
			if (dbL.isEmpty()) {
				return;
			}
			
			MCIndexKey idxkey = dbL.createIndex(dbL.createRow().getKeyColumn());
			for (VerChgUpd_DtlR r : list) {
				MST_VER_CHG_R tmpR = dbL
						.getFirst(idxkey, r.par_itm_cd(), r.par_itm_sub1(),
								r.par_itm_sub2(), r.par_itm_sub3(), r.chd_itm_cd(),
								r.chd_itm_sub1(), r.chd_itm_sub2(), r.chd_itm_sub3(),
								r.ver_no(), r.bom_ptn(), r.wg_cd(), r.site_cd());
				// 投入実績情報が存在したら、「実績」を設定する。
				if (!isNull(tmpR)) {
					r.ver_chg_sts_typ(MSC_VER_CHG_STS_TYP.ACT.value());
					r.first_act_st_tm(tmpR.first_act_st_tm());
					r.first_act_lot_no(tmpR.first_act_lot_no());
					r.first_act_sublot_no(tmpR.first_act_sublot_no());
					r.first_mfg_act_no(tmpR.first_mfg_act_no());
					
					r.last_act_st_tm(tmpR.last_act_st_tm());
					r.last_act_lot_no(tmpR.last_act_lot_no());
					r.last_act_sublot_no(tmpR.last_act_sublot_no());
					r.last_mfg_act_no(tmpR.last_mfg_act_no());
				}
			}
		}
		
		/**
		 * 変更有りＦＬＧを設定する。
		 */
		protected void setChgFlg(MCList<VerChgUpd_DtlR> list) {
			for (VerChgUpd_DtlR r : list) {
				if (r.ver_chg_exists_flg()) {
					if (!isColSame(r.ver_chg_p(), r.old_ver_chg_p(), getUpdCols())) {
						r.chg_flg(true);
					}
				}
			}
		}
		/**
		 * 版切替情報を登録・更新・削除する
		 */
		protected void updVerChg(MCList<VerChgUpd_DtlR> list) {
			// 新規登録用
			MCList<MST_VER_CHG_R> insL = MCList.create(MST_VER_CHG_R.class);
			// 更新用
			MCList<MST_VER_CHG_R> updL = MCList.create(MST_VER_CHG_R.class);
			// 削除用
			MCList<MST_VER_CHG_R> delL = MCList.create(MST_VER_CHG_R.class);
			
			for (VerChgUpd_DtlR r : list) {
				if (isIns(r)) {
					insL.add(r.ver_chg_p());
				}
				else if (isUpd(r)) {
					updL.add(r.ver_chg_p());
				}
				else if (isDel(r)) {
					delL.add(r.ver_chg_p());
				}
			}
			MST_VER_CHG_R t = MST_VER_CHG_R.create("T");
			if (!insL.isEmpty()) {
				dbInsertEx("MSBCL6100_MST_VER_CHG_I01", insL, MCQueryApiBuilder.create(t));
			}
			if (!updL.isEmpty()) {
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				editDml(updL, t, updL_bldr);
				dbUpdateKey("MSBCL6100_MST_VER_CHG_U01", updL, updL_bldr);
			}
			if (!delL.isEmpty()) {
				dbDeleteKey("MSBCL6100_MST_VER_CHG_D01", delL, MCQueryApiBuilder.create(t));
			}
		}
		
		/**
		 * insert対象かどうか
		 * @param r
		 * @return
		 */
		protected boolean isIns(VerChgUpd_DtlR r) {
			if (r.ver_chg_exists_flg()) {
				return false;
			}
			if (isNull(r.ver_chg_sts_typ())) {
				return false;
			}
			return true;
		}
		
		/**
		 * update対象かどうか
		 * @param r
		 * @return
		 */
		protected boolean isUpd(VerChgUpd_DtlR r) {
			if (!r.ver_chg_exists_flg()) {
				return false;
			}
			if (isNull(r.ver_chg_sts_typ())) {
				return false;
			}
			return r.chg_flg();
		}
		
		/**
		 * delete対象かどうか
		 * @param r
		 * @return
		 */
		protected boolean isDel(VerChgUpd_DtlR r) {
			if (!r.ver_chg_exists_flg()) {
				return false;
			}
			if (isNull(r.ver_chg_sts_typ())) {
				return true;
			}
			return false;
		}
		
		/**
		 * 更新用コンテナのDMLを編集する
		 */
		protected void editDml(MCList<MST_VER_CHG_R> updL, MST_VER_CHG_R upd_t, MCQueryApiBuilder updL_bldr) {
			MCPermColumn[] updCols = {
					upd_t.ver_chg_sts_typ
					,upd_t.first_inst_st_tm
					,upd_t.first_inst_lot_no
					,upd_t.first_inst_sublot_no
					,upd_t.first_mfg_inst_no
					,upd_t.first_act_st_tm
					,upd_t.first_act_lot_no
					,upd_t.first_act_sublot_no
					,upd_t.first_mfg_act_no
					,upd_t.last_act_st_tm
					,upd_t.last_act_lot_no
					,upd_t.last_act_sublot_no
					,upd_t.last_mfg_act_no
			};
			updL_bldr.setSet(updCols);
		}
		
		/**
		 * 更新対象のカラムを返す
		 * @return
		 */
		protected String[] getUpdCols() {
			return new String[] {
					MST_VER_CHG_R.$ver_chg_sts_typ
					,MST_VER_CHG_R.$first_inst_st_tm
					,MST_VER_CHG_R.$first_inst_lot_no
					,MST_VER_CHG_R.$first_inst_sublot_no
					,MST_VER_CHG_R.$first_mfg_inst_no
					,MST_VER_CHG_R.$first_act_st_tm
					,MST_VER_CHG_R.$first_act_lot_no
					,MST_VER_CHG_R.$first_act_sublot_no
					,MST_VER_CHG_R.$first_mfg_act_no
					,MST_VER_CHG_R.$last_act_st_tm
					,MST_VER_CHG_R.$last_act_lot_no
					,MST_VER_CHG_R.$last_act_sublot_no
					,MST_VER_CHG_R.$last_mfg_act_no
			};
		}
	}

	//FMCB CUSTOM END
}