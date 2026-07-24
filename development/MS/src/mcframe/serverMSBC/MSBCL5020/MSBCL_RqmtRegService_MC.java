package mcframe.serverMSBC.MSBCL5020;

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
import mcframe.serverMSBC.MSBCL5020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_DuplicateValidater;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.serverMSBC.MSBCL5020.Query.*;
import java.util.HashSet;
import java.util.Map;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_RqmtRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_RqmtRegService_MC extends MSBCL_RqmtRegService_MC_A{
	//FMCB CUSTOM START

	/**
	 * Rqmt_Sprt01オペレーション.<p>
	 */
	public class Rqmt_Sprt01 extends MSBCL_RqmtRegService_MC_A.Rqmt_Sprt01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			setSno();
			setDown();
		}

		protected void editUp() {
			// 品目マスタ補完
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbcItmL_bldr = MCQueryApiBuilder.create(t);
			dbcItmL_bldr.setSelect(t.itm_cd);
			dbcItmL_bldr.addSelect(t.itm_sub1);
			dbcItmL_bldr.addSelect(t.itm_sub2);
			dbcItmL_bldr.addSelect(t.itm_sub3);
			dbcItmL_bldr.addSelect(t.rqmt_sno1_flg);
			dbcItmL_bldr.addSelect(t.rqmt_sno2_flg);
			dbcItmL_bldr.addSelect(t.rqmt_sno3_flg);
			dbcItmL_bldr.addSelect(t.rqmt_sno4_flg);
			dbcItmL_bldr.addSelect(t.sno1_mng_typ);
			dbcItmL_bldr.addSelect(t.sno2_mng_typ);
			dbcItmL_bldr.addSelect(t.sno3_mng_typ);
			dbcItmL_bldr.addSelect(t.sno4_mng_typ);
			dbcItmL_bldr.addSelect(t.sno1_num_typ);
			dbcItmL_bldr.addSelect(t.sno2_num_typ);
			dbcItmL_bldr.addSelect(t.sno3_num_typ);
			dbcItmL_bldr.addSelect(t.sno4_num_typ);
			dbcItmL_bldr.addSelect(t.sno1_ptn_cd);
			dbcItmL_bldr.addSelect(t.sno2_ptn_cd);
			dbcItmL_bldr.addSelect(t.sno3_ptn_cd);
			dbcItmL_bldr.addSelect(t.sno4_ptn_cd);

			FXUCL_MCDbcCache<MAM_ITM_R> cacheItmL = new FXUCL_MCDbcCache<>(dbcItmL_bldr, up0(), new String[] {
					Rqmt_Sprt01_RsltR.$itm_cd, Rqmt_Sprt01_RsltR.$itm_sub1,
					Rqmt_Sprt01_RsltR.$itm_sub2, Rqmt_Sprt01_RsltR.$itm_sub3
			});

			for (Rqmt_Sprt01_RsltR r : up0()) {
				MAM_ITM_R itmR = cacheItmL.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				r.rqmt_sno1_flg(itmR.rqmt_sno1_flg());
				r.rqmt_sno2_flg(itmR.rqmt_sno2_flg());
				r.rqmt_sno3_flg(itmR.rqmt_sno3_flg());
				r.rqmt_sno4_flg(itmR.rqmt_sno4_flg());
				r.sno1_mng_typ(itmR.sno1_mng_typ());
				r.sno2_mng_typ(itmR.sno2_mng_typ());
				r.sno3_mng_typ(itmR.sno3_mng_typ());
				r.sno4_mng_typ(itmR.sno4_mng_typ());
				r.sno1_num_typ(itmR.sno1_num_typ());
				r.sno2_num_typ(itmR.sno2_num_typ());
				r.sno3_num_typ(itmR.sno3_num_typ());
				r.sno4_num_typ(itmR.sno4_num_typ());
				r.sno1_ptn_cd(itmR.sno1_ptn_cd());
				r.sno2_ptn_cd(itmR.sno2_ptn_cd());
				r.sno3_ptn_cd(itmR.sno3_ptn_cd());
				r.sno4_ptn_cd(itmR.sno4_ptn_cd());
			}
		}

		/**
		 * 手配ＮＯ発番
		 */
		protected void setSno() {
			setSno(Rqmt_Sprt01_RsltR.$sno1);
			setSno(Rqmt_Sprt01_RsltR.$sno2);
			setSno(Rqmt_Sprt01_RsltR.$sno3);
			setSno(Rqmt_Sprt01_RsltR.$sno4);
		}

		protected void setSno(String snoCol) {
			MCList<ElmArgsR> args = MCList.create(ElmArgsR.class);
			for (Rqmt_Sprt01_RsltR r : up0()) {
				if (isAutoSno(r, snoCol)) {
					ElmArgsR arg = ElmArgsR.create();
					arg.peg_no(r.peg_no());
					arg.itm_cd(r.itm_cd());
					arg.itm_sub1(r.itm_sub1());
					arg.itm_sub2(r.itm_sub2());
					arg.itm_sub3(r.itm_sub3());
					arg.loc_cd(r.strg_loc_cd());
					arg.site_cd(r.site_cd());
					arg.wg_cd(r.wg_cd());
					arg.dt(r.due_dt());
					arg.num_ptn_cd(getNumPtnCd(r, snoCol));
					arg.co_cd(getCo().co_cd());
					args.add(arg);
					if (isSame(snoCol, Rqmt_Sprt01_RsltR.$sno1)) {
						r.wrk_no(null);
						r.wrk_nm(null);
					}
				}
			}
			//一括発番処理
			setNum(MAC_NUM_BIZ_TYP.SNO, args);

			String[] srcCols = {ElmArgsR.$new_no};
			String[] destCols = {snoCol};
			copyByPegNo(up0(), destCols, args, srcCols);
		}

		protected boolean isAutoSno(Rqmt_Sprt01_RsltR r, String snoCol) {
			if (isNullOr(r.peg_no(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
					r.strg_loc_cd(), r.wg_cd(), r.site_cd(), r.due_dt())) {
				return false;
			}

			if (isSame(snoCol, Rqmt_Sprt01_RsltR.$sno1) && !r.sno1_keep_flg()) {
				return isAutoSno(r.rqmt_sno1_flg(), r.sno1_mng_typ(), r.sno1_num_typ(), r.sno1());
			}
			if (isSame(snoCol, Rqmt_Sprt01_RsltR.$sno2) && !r.sno2_keep_flg()) {
				return isAutoSno(r.rqmt_sno2_flg(), r.sno2_mng_typ(), r.sno2_num_typ(), r.sno2());
			}
			if (isSame(snoCol,Rqmt_Sprt01_RsltR.$sno3) && !r.sno3_keep_flg()) {
				return isAutoSno(r.rqmt_sno3_flg(), r.sno3_mng_typ(), r.sno3_num_typ(), r.sno3());
			}
			if (isSame(snoCol, Rqmt_Sprt01_RsltR.$sno4) && !r.sno4_keep_flg()) {
				return isAutoSno(r.rqmt_sno4_flg(), r.sno4_mng_typ(), r.sno4_num_typ(), r.sno4());
			}
			return false;
		}

		/** 手配ＮＯ自動発番対象であるかを返す */
		protected boolean isAutoSno(boolean snoReqFlg, String snoMngTyp, String snoNumTyp, String snoValue) {
			return MAC_SNO_NO_TYP.isAUTO(snoNumTyp)
				|| MAC_SNO_NO_TYP.isAUTO_MANU(snoNumTyp)
					&& isNull(snoValue)
					&& (snoReqFlg || MAC_SNO_MNG_TYP.isMNG_REQ(snoMngTyp) || up1().screen_flg());
		}

		protected String getNumPtnCd(Rqmt_Sprt01_RsltR r, String snoCol) {
			if (isSame(snoCol, Rqmt_Sprt01_RsltR.$sno1)) {
				return r.sno1_ptn_cd();
			}
			if (isSame(snoCol, Rqmt_Sprt01_RsltR.$sno2)) {
				return r.sno2_ptn_cd();
			}
			if (isSame(snoCol, Rqmt_Sprt01_RsltR.$sno3)) {
				return r.sno3_ptn_cd();
			}
			if (isSame(snoCol, Rqmt_Sprt01_RsltR.$sno4)) {
				return r.sno4_ptn_cd();
			}
			return null;
		}

		/**
		 * 下り電文を編集する
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Rqmt_Chk01オペレーション.<p>
	 */
	public class Rqmt_Chk01 extends MSBCL_RqmtRegService_MC_A.Rqmt_Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			super.doIt();
			setDown();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			for (Rqmt_Chk01_RsltR r : up0()) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					r.setStatus(MCRow.CREATE);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					r.setStatus(MCRow.MODIFY);
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.setStatus(MCRow.DELETE);
				}
				else if (r.isStatusCreate()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (r.isStatusModify()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else if (r.isStatusDelete()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					r.data_crud_typ(null);
				}
			}
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			MCList<Rqmt_Chk01_RsltR> notErrL = getChkList(up0());
			if (isNull(notErrL)) {
				return msgL;
			}
			// ＭＲＰ区分に応じたリストの分割
			MCList<Rqmt_Chk01_RsltR> nrmlL = MCList.create(Rqmt_Chk01_RsltR.class);
			MCList<Rqmt_Chk01_RsltR> prcdL = MCList.create(Rqmt_Chk01_RsltR.class);
			MCList<Rqmt_Chk01_RsltR> simL = MCList.create(Rqmt_Chk01_RsltR.class);

			for (Rqmt_Chk01_RsltR r : notErrL) {
				if (MSC_MRP_TYP.isMRP(r.mrp_typ())) {
					nrmlL.add(r);
				}
				else if (MSC_MRP_TYP.isPRCD(r.mrp_typ())) {
					prcdL.add(r);
				}
				else {
					simL.add(r);
				}
			}

			// 排他チェック、データ補完、更新前データに基づくチェック
			msgL.addAll(chkRqmt(getChkList(nrmlL), MCList.create(MST_RQMT_R.class)));
			msgL.addAll(chkRqmt(getChkList(prcdL), MCList.create(MST_PRCD_RQMT_R.class)));
			msgL.addAll(chkRqmt(getChkList(simL), MCList.create(MST_SIM_RQMT_R.class)));

			return msgL;
		}

		protected <R extends MCDBContainer, L extends MCList<R>> MCMessageList chkRqmt(MCList<Rqmt_Chk01_RsltR> cndL, L dbcL) {
			MCMessageList msgL = new MCMessageList();
			if (isNull(cndL)) {
				return msgL;
			}

			MCList<Rqmt_Chk01_RsltR> bindL = MCList.create(Rqmt_Chk01_RsltR.class);
			for (Rqmt_Chk01_RsltR r : cndL) {
				if (r.isStatusModify()) {
					bindL.add(r);
				}
				else if (r.isStatusDelete()) {
					bindL.add(r);
				}
			}
			if (isNull(bindL)) {
				return msgL;
			}

			MCDBContainer dbcL_t = dbcL.createRow();
			dbcL_t.setAlias("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(dbcL_t);
			final String rqmtNoCol = dbcL_bldr.getBaseDbc().getKeyColumn()[0];
			bindL.sort(Rqmt_Chk01_RsltR.$rqmt_no);
			dbcL_bldr.setOrderByAsc(dbcL_bldr.getBaseDbc().getKeyColumn$());
			if (up1().file_imp_flg()) {
				dbSelectKey(createSqlId(LOGIC_ID, dbcL_bldr.getBaseDbc(), "S50"), dbcL, dbcL_bldr, bindL);
			}
			else {
				dbSelectKeyForUpdateNoWait(createSqlId(LOGIC_ID, dbcL_bldr.getBaseDbc(), "S51"), dbcL, dbcL_bldr, bindL);
			}

			MCIndexKey idxkey = dbcL.createIndex(rqmtNoCol);
			for (Rqmt_Chk01_RsltR r : bindL) {
				MCRow selectR = dbcL.getFirst(idxkey, r.rqmt_no());
				// 存在チェック
				if (selectR == null) {
					msgL.add(msgNotExistInTable(dbcL.createRow(), r, Rqmt_Chk01_RsltR.$rqmt_no));
					continue;
				}
				// 排他チェック
				if (!isNull(r.upd_cntr())) {
					msgL.addAll(checkUpdCntrNE(r, Rqmt_Chk01_RsltR.$upd_cntr, selectR));
				}
				if (!isNull(selectR)) {
					selectR.setAttributes(r);
					// 更新前ＤＡＣチェック
					if (!up1().no_dac_flg()) {
						msgL.addAll(checkWritableLocCdDac(selectR, "strg_loc_cd"));
					}

					if (r.isStatusModify()) {
						// データ補完
						r.rqmt_gnrt_typ(selectR.getString("rqmt_gnrt_typ"));
						r.fix_flg(selectR.getBoolean("fix_flg"));
						if (isNull(r.upd_cntr())) {
							r.upd_cntr(selectR.getNumber("upd_cntr"));
						}
						// 確定時は、備考のみ訂正可能
						if (r.fix_flg()) {
							if (!isColSame(r, selectR, "itm_cd", "itm_sub1", "itm_sub2",
									"itm_sub3","strg_loc_cd","rqmt_qty",
									"mfg_loc_cd","sppl_cd","rqst_loc_cd",
									"sno1","sno2","sno3","sno4")) {
								msgL.add(new MCMessage(r, Rqmt_Chk01_RsltR.$rqmt_no,
										MSBCL0001, r.rqmt_no(), toDispGUIIndex(r)));
							}
						}
					}
					else if (r.isStatusDelete()) {
						if (r.fix_flg()) {
							msgL.add(new MCMessage(r, Rqmt_Chk01_RsltR.$rqmt_no,
									MSBCL0002, r.rqmt_no(), toDispGUIIndex(r)));
						}
					}
				}
			}

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Rqmt_Chk01_RsltR> notErrL = getChkList(up0());
			if (isNull(notErrL)) {
				return msgL;
			}

			MCList<Rqmt_Chk01_RsltR> chkL = MCList.create(Rqmt_Chk01_RsltR.class);
			for (Rqmt_Chk01_RsltR r : notErrL) {
				if (r.isStatusDelete()) {
					continue;
				}
				chkL.add(r);
			}
			if (isNull(chkL)) {
				return msgL;
			}

			// キャッシュ：品目禁止マスタ
			MAM_ITM_STOP_R itmStopDbcL_t = MAM_ITM_STOP_R.create("T");
			MCQueryApiBuilder itmStopDbcL_bldr = MCQueryApiBuilder.create(itmStopDbcL_t);
			itmStopDbcL_bldr.setSelect(itmStopDbcL_t.itm_cd);
			itmStopDbcL_bldr.addSelect(itmStopDbcL_t.itm_sub1);
			itmStopDbcL_bldr.addSelect(itmStopDbcL_t.itm_sub2);
			itmStopDbcL_bldr.addSelect(itmStopDbcL_t.itm_sub3);
			itmStopDbcL_bldr.addSelect(itmStopDbcL_t.order_stop_dt);
			FXUCL_MCDbcCache<MAM_ITM_STOP_R> itmStopCache = new FXUCL_MCDbcCache<MAM_ITM_STOP_R>(
					itmStopDbcL_bldr, chkL, Rqmt_Chk01_RsltR.$itm_cd,
					Rqmt_Chk01_RsltR.$itm_sub1, Rqmt_Chk01_RsltR.$itm_sub2,
					Rqmt_Chk01_RsltR.$itm_sub3);

			// キャッシュ：品目詳細マスタ
			MCList<MAM_ITM_WG_R> itmWgWkL = MCList.create(MAM_ITM_WG_R.class);
			for (Rqmt_Chk01_RsltR r : chkL.groupBy(Rqmt_Chk01_RsltR.$itm_cd,
					Rqmt_Chk01_RsltR.$itm_sub1, Rqmt_Chk01_RsltR.$itm_sub2,
					Rqmt_Chk01_RsltR.$itm_sub3, Rqmt_Chk01_RsltR.$wg_cd)) {
					MAM_ITM_WG_R dbc = MAM_ITM_WG_R.create();
					dbc.itm_cd(r.itm_cd());
					dbc.itm_sub1(r.itm_sub1());
					dbc.itm_sub2(r.itm_sub2());
					dbc.itm_sub3(r.itm_sub3());
					dbc.wg_cd(r.wg_cd());
					itmWgWkL.add(dbc);
			}
			MCQueryApiBuilder itmWgWkL_bldr = MCQueryApiBuilder.create(MAM_ITM_WG_R.create("T"));
			dbWkDelete("MSBCL5020_MAW_ITM_WG_D01", itmWgWkL_bldr.getBaseDbc());
			dbWkInsert("MSBCL5020_MAW_ITM_WG_I01", itmWgWkL, itmWgWkL_bldr.getBaseDbc());

			MCList<Rqmt_Chk01_ItmDtlWkR> itmDtlCacheL = MCList.create(Rqmt_Chk01_ItmDtlWkR.class);
			executeQuery(itmDtlCacheL, MSBCL5020_MAM_ITM_DTL_S01());
			MCIndexKey idxkeyItmDtl = itmDtlCacheL.createIndex(Rqmt_Chk01_ItmDtlWkR.$itm_cd,
					Rqmt_Chk01_ItmDtlWkR.$itm_sub1, Rqmt_Chk01_ItmDtlWkR.$itm_sub2,
					Rqmt_Chk01_ItmDtlWkR.$itm_sub3, Rqmt_Chk01_ItmDtlWkR.$wg_cd);

			// キャッシュ：取引先禁止マスタ
			MCList<MAM_BP_STOP_R> bindL = MCList.create(MAM_BP_STOP_R.class);
			for (Rqmt_Chk01_RsltR r : chkL){
				if (!isNullOrNullVal(r.sppl_cd())){
					MAM_BP_STOP_R bindRow = MAM_BP_STOP_R.create();
					bindRow.bp_cd(r.sppl_cd());
					bindL.add(bindRow);
				}
			}
			for (Rqmt_Chk01_ItmDtlWkR r : itmDtlCacheL){
				if (!isNull(r.mfg_sppl_cd())){
					MAM_BP_STOP_R bindRow = MAM_BP_STOP_R.create();
					bindRow.bp_cd(r.mfg_sppl_cd());
					bindL.add(bindRow);
				}
			}
			MAM_BP_STOP_R bpStopDbcL_t = MAM_BP_STOP_R.create("T");
			MCQueryApiBuilder bpStopDbcL_bldr = MCQueryApiBuilder.create(bpStopDbcL_t);
			bpStopDbcL_bldr.setSelect(bpStopDbcL_t.bp_cd);
			bpStopDbcL_bldr.addSelect(bpStopDbcL_t.order_stop_dt);
			FXUCL_MCDbcCache<MAM_BP_STOP_R> bpStopCache = new FXUCL_MCDbcCache<MAM_BP_STOP_R>(
					bpStopDbcL_bldr, bindL, MAM_BP_STOP_R.$bp_cd);

			// チェック、データ補完
			for (Rqmt_Chk01_RsltR r : chkL) {

				// 更新後ＤＡＣチェック
				if (!up1().no_dac_flg()) {
					msgL.addAll(checkWritableLocCdDac(r, Rqmt_Chk01_RsltR.$strg_loc_cd));
				}

				// 品目禁止マスタチェック
				MAM_ITM_STOP_R itmStopR = itmStopCache.get(r.itm_cd(),
						r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (!isNull(itmStopR.order_stop_dt())
						&& itmStopR.order_stop_dt().lte(r.due_dt())) {
					msgL.add(new MCMessage(r, Rqmt_Chk01_RsltR.$due_dt, MSBCL0005,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
							toY2MDString(r.due_dt()), toY2MDString(itmStopR.order_stop_dt()),
							toDispGUIIndex(r)));
				}

				// 品目、ＷＧ、製造場所、発注先、依頼先場所：品目詳細マスタ
				MCList<Rqmt_Chk01_ItmDtlWkR> subItmDtlL = itmDtlCacheL.subList(idxkeyItmDtl,
						r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.wg_cd());
				if (isNull(subItmDtlL)) {
					msgL.add(new MCMessage(r, Rqmt_Chk01_RsltR.$itm_cd, MSBCL0006,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
							r.wg_cd(),
							toDispGUIIndex(r)));
				}
				else {
					if (!MAC_STR.isNULL_VAL(r.mfg_loc_cd())) {
						Rqmt_Chk01_ItmDtlWkR subItmDtlR = subItmDtlL.getFirst(
								Rqmt_Chk01_ItmDtlWkR.$mfg_loc_cd, r.mfg_loc_cd());
						if (isNull(subItmDtlR)) {
							msgL.add(new MCMessage(r, Rqmt_Chk01_RsltR.$itm_cd, MSBCL0004,
									toDispItm(r.itm_cd(), r.itm_sub1(),r.itm_sub2(), r.itm_sub3()),
									r.wg_cd(), getLabel(r, Rqmt_Chk01_RsltR.$mfg_loc_cd) + ":" + r.mfg_loc_cd(),
									toDispGUIIndex(r)));
						}
						else {
							r.mfg_loc_nm(subItmDtlR.mfg_loc_nm());
							r.mfg_sppl_cd(subItmDtlR.mfg_sppl_cd());
						}
					}
					else if (!MAC_STR.isNULL_VAL(r.sppl_cd())) {
						Rqmt_Chk01_ItmDtlWkR subItmDtlR = subItmDtlL.getFirst(
								Rqmt_Chk01_ItmDtlWkR.$sppl_cd, r.sppl_cd());
						if (isNull(subItmDtlR)) {
							msgL.add(new MCMessage(r, Rqmt_Chk01_RsltR.$itm_cd, MSBCL0004, 
									toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
									r.wg_cd(), getLabel(r, Rqmt_Chk01_RsltR.$sppl_cd) + ":" + r.sppl_cd(),
									toDispGUIIndex(r)));
						}
						else {
							r.sppl_nm(subItmDtlR.sppl_nm());
						}
					}
					else if (!MAC_STR.isNULL_VAL(r.rqst_loc_cd())) {
						Rqmt_Chk01_ItmDtlWkR subItmDtlR = subItmDtlL.getFirst(
								Rqmt_Chk01_ItmDtlWkR.$rqst_loc_cd, r.rqst_loc_cd());
						if (isNull(subItmDtlR)) {
							msgL.add(new MCMessage(r, Rqmt_Chk01_RsltR.$itm_cd, MSBCL0004,
									toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
									r.wg_cd(), getLabel(r, Rqmt_Chk01_RsltR.$rqst_loc_cd) + ":" + r.rqst_loc_cd(),
									toDispGUIIndex(r)));
						}
						else {
							r.rqst_loc_nm(subItmDtlR.rqst_loc_nm());
							r.rqst_wg_cd(subItmDtlR.rqst_wg_cd());
							r.rqst_wg_nm(subItmDtlR.rqst_wg_nm());
						}
					}
				}

				// 取引先禁止マスタチェック
				String stopBpCd = isNullOrNullVal(r.sppl_cd()) ? r.mfg_sppl_cd() : r.sppl_cd();
				if (!isNull(stopBpCd)) {
					MAM_BP_STOP_R spplStopR = bpStopCache.get(stopBpCd);
					if (!isNull(spplStopR.order_stop_dt())
							&& spplStopR.order_stop_dt().lte(r.due_dt())) {
						msgL.add(new MCMessage(r, Rqmt_Chk01_RsltR.$due_dt, MSBCL0102,
								stopBpCd, toY2MDString(r.due_dt()),
								toY2MDString(spplStopR.order_stop_dt()), toDispGUIIndex(r)));
					}
				}

				// 小数部有効桁数チェック
				msgL.addAll(checkDecPlace(r, Rqmt_Chk01_RsltR.$dec_place, Rqmt_Chk01_RsltR.$rqmt_qty));

				// 手配ＮＯ管理対象外チェック
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno1_mng_typ())
						&& !MAC_STR.isNULL_VAL(r.sno1())) {
					msgL.add(new MCMessage(r, Rqmt_Chk01_RsltR.$sno1, MSBCL0003,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
							getLabel(r, Rqmt_Chk01_RsltR.$sno1), r.sno1(), toDispGUIIndex(r)));
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno2_mng_typ())
						&& !MAC_STR.isNULL_VAL(r.sno2())) {
					msgL.add(new MCMessage(r, Rqmt_Chk01_RsltR.$sno2, MSBCL0003,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
							getLabel(r, Rqmt_Chk01_RsltR.$sno2), r.sno2(), toDispGUIIndex(r)));
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno3_mng_typ())
						&& !MAC_STR.isNULL_VAL(r.sno3())) {
					msgL.add(new MCMessage(r, Rqmt_Chk01_RsltR.$sno3, MSBCL0003,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
							getLabel(r, Rqmt_Chk01_RsltR.$sno3), r.sno3(), toDispGUIIndex(r)));
				}
				if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno4_mng_typ())
						&& !MAC_STR.isNULL_VAL(r.sno4())) {
					msgL.add(new MCMessage(r, Rqmt_Chk01_RsltR.$sno4, MSBCL0003,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
							getLabel(r, Rqmt_Chk01_RsltR.$sno4), r.sno4(), toDispGUIIndex(r)));
				}

				// 手配ＮＯ必須チェック
				if (!up1().file_imp_flg()) {
					if ((r.rqmt_sno1_flg() || MAC_SNO_MNG_TYP.isMNG_REQ(r.sno1_mng_typ()))
							&& MAC_STR.isNULL_VAL(r.sno1())) {
						msgL.add(msgNoDataAtReq(r, Rqmt_Chk01_RsltR.$sno1));
					}
					if ((r.rqmt_sno2_flg() || MAC_SNO_MNG_TYP.isMNG_REQ(r.sno2_mng_typ()))
							&& MAC_STR.isNULL_VAL(r.sno2())) {
						msgL.add(msgNoDataAtReq(r, Rqmt_Chk01_RsltR.$sno2));
					}
					if ((r.rqmt_sno3_flg() || MAC_SNO_MNG_TYP.isMNG_REQ(r.sno3_mng_typ()))
							&& MAC_STR.isNULL_VAL(r.sno3())) {
						msgL.add(msgNoDataAtReq(r, Rqmt_Chk01_RsltR.$sno3));
					}
					if ((r.rqmt_sno4_flg() || MAC_SNO_MNG_TYP.isMNG_REQ(r.sno4_mng_typ()))
							&& MAC_STR.isNULL_VAL(r.sno4())) {
						msgL.add(msgNoDataAtReq(r, Rqmt_Chk01_RsltR.$sno4));
					}
				}
			}

			// ワークテーブル削除
			dbWkDelete("MSBCL5020_MAW_ITM_WG_D02", itmWgWkL_bldr.getBaseDbc());

			return msgL;
		}

		@Override
		protected void customListLogicCnd(String column, MCNumber paramIndex,
				MCConstRow data, Map<String, Comparable<?>> cnd) {
			super.customListLogicCnd(column, paramIndex, data, cnd);

			if (isSame(paramIndex, MCNumber.ZERO)
					&& isSame(column, Rqmt_Chk01_RsltR.$itm_sub3)) {
				if (MSC_MRP_TYP.isSIM(data.getStringNE(Rqmt_Chk01_RsltR.$mrp_typ))) {
					if (MSC_SIM_MRP_TYP.isMST_CHK(data.getStringNE(Rqmt_Chk01_RsltR.$sim_mrp_typ))) {
						cnd.put(ItmSub3Cols.$i_release_flg_on, true);
						cnd.put(ItmSub3Cols.$i_release_flg_off, true);
					}
				}
			}
		}

		/**
		 * 下り電文を編集する
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}
	
	/**
	 * Rqmt_Upd01オペレーション.<p>
	 */
	public class Rqmt_Upd01 extends MSBCL_RqmtRegService_MC_A.Rqmt_Upd01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// ＭＲＰ区分に応じたリストの分割
			MCList<Rqmt_Chk01_RsltR> nrmlL = MCList.create(Rqmt_Chk01_RsltR.class);
			MCList<Rqmt_Chk01_RsltR> prcdL = MCList.create(Rqmt_Chk01_RsltR.class);
			MCList<Rqmt_Chk01_RsltR> simL = MCList.create(Rqmt_Chk01_RsltR.class);

			for (Rqmt_Chk01_RsltR r : up0()) {
				if (MSC_MRP_TYP.isMRP(r.mrp_typ())) {
					nrmlL.add(r);
				}
				else if (MSC_MRP_TYP.isPRCD(r.mrp_typ())) {
					prcdL.add(r);
				}
				else if (MSC_MRP_TYP.isSIM(r.mrp_typ())) {
					simL.add(r);
				}
			}

			// データ更新
			regRqmt(nrmlL, MCList.create(MST_RQMT_R.class));
			regRqmt(prcdL, MCList.create(MST_PRCD_RQMT_R.class));
			regRqmt(simL, MCList.create(MST_SIM_RQMT_R.class));

			// 下り電文の編集
			setDown();
		}

		/**
		 * 日次生産依頼情報の登録、更新、取消
		 */
		protected <R extends MCDBContainer, L extends MCList<R>> void regRqmt(
				MCList<Rqmt_Chk01_RsltR> upL, L dbcL) {
			MCList<Rqmt_Chk01_RsltR> insL = MCList.create(Rqmt_Chk01_RsltR.class);
			MCList<Rqmt_Chk01_RsltR> updL = MCList.create(Rqmt_Chk01_RsltR.class);
			MCList<Rqmt_Chk01_RsltR> delL = MCList.create(Rqmt_Chk01_RsltR.class);
			for (Rqmt_Chk01_RsltR r : upL) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					insL.add(r);
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					updL.add(r);
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					delL.add(r);
				}
			}
			delRqmt(delL, dbcL);
			updRqmt(updL, dbcL);
			insRqmt(insL, dbcL);
		}

		protected <R extends MCDBContainer, L extends MCList<R>> void delRqmt(
				MCList<Rqmt_Chk01_RsltR> upL, L rqmtDbcL) {
			if (isNull(upL)) {
				return ;
			}

			MCDBContainer rqmtDbcL_t = rqmtDbcL.createRow();
			rqmtDbcL_t.setAlias("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(rqmtDbcL_t);
			L dbcL = crtDbcL(upL, rqmtDbcL, dbcL_bldr);
			dbDeleteKey(createSqlId(LOGIC_ID, dbcL_bldr.getBaseDbc(), "D50"), dbcL, dbcL_bldr);
		}

		protected <R extends MCDBContainer, L extends MCList<R>> void updRqmt(
				MCList<Rqmt_Chk01_RsltR> upL, L rqmtDbcL) {
			if (isNull(upL)) {
				return ;
			}

			MCDBContainer rqmtDbcL_t = rqmtDbcL.createRow();
			rqmtDbcL_t.setAlias("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(rqmtDbcL_t);
			L dbcL = crtDbcL(upL, rqmtDbcL, dbcL_bldr);
			dbUpdateKey(createSqlId(LOGIC_ID, dbcL_bldr.getBaseDbc(), "U50"), dbcL, dbcL_bldr);
		}

		protected <R extends MCDBContainer, L extends MCList<R>> void insRqmt(
				MCList<Rqmt_Chk01_RsltR> upL, L rqmtDbcL) {
			if (isNull(upL)) {
				return ;
			}

			setRqmtNo(upL, rqmtDbcL);
			MCDBContainer rqmtDbcL_t = rqmtDbcL.createRow();
			rqmtDbcL_t.setAlias("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(rqmtDbcL_t);
			L dbcL = crtDbcL(upL, rqmtDbcL, dbcL_bldr);
			dbInsertEx(createSqlId(LOGIC_ID, dbcL_bldr.getBaseDbc(), "I50"), dbcL, dbcL_bldr);
		}

		@SuppressWarnings("unchecked")
		protected <R extends MCDBContainer, L extends MCList<R>> L crtDbcL(
				MCList<Rqmt_Chk01_RsltR> upL, L dbcL, MCQueryApiBuilder l_bldr) {
			if (dbcL.createRow() instanceof MST_RQMT_R) {
				MCList<MST_RQMT_R> l = MCList.create(MST_RQMT_R.class);
				addAll(l, upL, createMap_MST_RQMT_R_Rqmt_Chk01_RsltR());
				l_bldr.removeSet(MST_RQMT_R.$fix_flg, MST_RQMT_R.$rqmt_gnrt_typ);
				return (L)l;
			}
			else if (dbcL.createRow() instanceof MST_PRCD_RQMT_R) {
				MCList<MST_PRCD_RQMT_R> l = MCList.create(MST_PRCD_RQMT_R.class);
				addAll(l, upL, createMap_MST_PRCD_RQMT_R_Rqmt_Chk01_RsltR());
				l_bldr.removeSet(MST_PRCD_RQMT_R.$fix_flg, MST_PRCD_RQMT_R.$rqmt_gnrt_typ);
				return (L)l;
			}
			else if (dbcL.createRow() instanceof MST_SIM_RQMT_R) {
				MCList<MST_SIM_RQMT_R> l = MCList.create(MST_SIM_RQMT_R.class);
				addAll(l, upL, createMap_MST_SIM_RQMT_R_Rqmt_Chk01_RsltR());
				l_bldr.removeSet(MST_SIM_RQMT_R.$fix_flg, MST_SIM_RQMT_R.$rqmt_gnrt_typ);
				return (L)l;
			}
			return null;
		}

		protected <R extends MCDBContainer, L extends MCList<R>> void setRqmtNo(MCList<Rqmt_Chk01_RsltR> upL, L dbcL) {
			MSC_NUM_SYS_TYP sysTyp = null;
			if (dbcL.createRow() instanceof MST_RQMT_R) {
				sysTyp = MSC_NUM_SYS_TYP.RQMT;
			}
			else if (dbcL.createRow() instanceof MST_PRCD_RQMT_R) {
				sysTyp = MSC_NUM_SYS_TYP.PRQMT;
			}

			doSeqCache(sysTyp, upL.size());
			for (Rqmt_Chk01_RsltR r : upL) {
				r.rqmt_no(getStrSeq(sysTyp));
			}
		}

		/**
		 * 下り電文を編集する
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		protected Map_MST_RQMT_R_Rqmt_Chk01_RsltR<MST_RQMT_R,Rqmt_Chk01_RsltR> createMap_MST_RQMT_R_Rqmt_Chk01_RsltR() {
			return new Map_MST_RQMT_R_Rqmt_Chk01_RsltR<MST_RQMT_R, Rqmt_Chk01_RsltR>();
		}

		public class Map_MST_RQMT_R_Rqmt_Chk01_RsltR<D extends MST_RQMT_R, S extends Rqmt_Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_RQMT_R.$rqmt_no, Rqmt_Chk01_RsltR.$rqmt_no);
				addColumnPathMap(MST_RQMT_R.$itm_cd, Rqmt_Chk01_RsltR.$itm_cd);
				addColumnPathMap(MST_RQMT_R.$itm_sub1, Rqmt_Chk01_RsltR.$itm_sub1);
				addColumnPathMap(MST_RQMT_R.$itm_sub2, Rqmt_Chk01_RsltR.$itm_sub2);
				addColumnPathMap(MST_RQMT_R.$itm_sub3, Rqmt_Chk01_RsltR.$itm_sub3);
				addColumnPathMap(MST_RQMT_R.$strg_loc_cd, Rqmt_Chk01_RsltR.$strg_loc_cd);
				addColumnPathMap(MST_RQMT_R.$due_dt, Rqmt_Chk01_RsltR.$due_dt);
				addColumnPathMap(MST_RQMT_R.$rqmt_qty, Rqmt_Chk01_RsltR.$rqmt_qty);
				addColumnPathMap(MST_RQMT_R.$mfg_loc_cd, Rqmt_Chk01_RsltR.$mfg_loc_cd);
				addColumnPathMap(MST_RQMT_R.$sppl_cd, Rqmt_Chk01_RsltR.$sppl_cd);
				addColumnPathMap(MST_RQMT_R.$rqst_loc_cd, Rqmt_Chk01_RsltR.$rqst_loc_cd);
				addColumnPathMap(MST_RQMT_R.$fix_flg, Rqmt_Chk01_RsltR.$fix_flg);
				addColumnPathMap(MST_RQMT_R.$sno1, Rqmt_Chk01_RsltR.$sno1);
				addColumnPathMap(MST_RQMT_R.$sno2, Rqmt_Chk01_RsltR.$sno2);
				addColumnPathMap(MST_RQMT_R.$sno3, Rqmt_Chk01_RsltR.$sno3);
				addColumnPathMap(MST_RQMT_R.$sno4, Rqmt_Chk01_RsltR.$sno4);
				addColumnPathMap(MST_RQMT_R.$wg_cd, Rqmt_Chk01_RsltR.$wg_cd);
				addColumnPathMap(MST_RQMT_R.$rqmt_gnrt_typ, Rqmt_Chk01_RsltR.$rqmt_gnrt_typ);
				addColumnPathMap(MST_RQMT_R.$rqmt_typ, Rqmt_Chk01_RsltR.$rqmt_typ);
				addColumnPathMap(MST_RQMT_R.$intr_rmrks, Rqmt_Chk01_RsltR.$intr_rmrks);
				addColumnPathMap(MST_RQMT_R.$sub_char1, Rqmt_Chk01_RsltR.$sub_char1);
				addColumnPathMap(MST_RQMT_R.$sub_char2, Rqmt_Chk01_RsltR.$sub_char2);
				addColumnPathMap(MST_RQMT_R.$sub_char3, Rqmt_Chk01_RsltR.$sub_char3);
			}
		}

		protected Map_MST_PRCD_RQMT_R_Rqmt_Chk01_RsltR<MST_PRCD_RQMT_R,Rqmt_Chk01_RsltR> createMap_MST_PRCD_RQMT_R_Rqmt_Chk01_RsltR() {
			return new Map_MST_PRCD_RQMT_R_Rqmt_Chk01_RsltR<MST_PRCD_RQMT_R, Rqmt_Chk01_RsltR>();
		}

		public class Map_MST_PRCD_RQMT_R_Rqmt_Chk01_RsltR<D extends MST_PRCD_RQMT_R, S extends Rqmt_Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_PRCD_RQMT_R.$rqmt_no, Rqmt_Chk01_RsltR.$rqmt_no);
				addColumnPathMap(MST_PRCD_RQMT_R.$itm_cd, Rqmt_Chk01_RsltR.$itm_cd);
				addColumnPathMap(MST_PRCD_RQMT_R.$itm_sub1, Rqmt_Chk01_RsltR.$itm_sub1);
				addColumnPathMap(MST_PRCD_RQMT_R.$itm_sub2, Rqmt_Chk01_RsltR.$itm_sub2);
				addColumnPathMap(MST_PRCD_RQMT_R.$itm_sub3, Rqmt_Chk01_RsltR.$itm_sub3);
				addColumnPathMap(MST_PRCD_RQMT_R.$strg_loc_cd, Rqmt_Chk01_RsltR.$strg_loc_cd);
				addColumnPathMap(MST_PRCD_RQMT_R.$due_dt, Rqmt_Chk01_RsltR.$due_dt);
				addColumnPathMap(MST_PRCD_RQMT_R.$rqmt_qty, Rqmt_Chk01_RsltR.$rqmt_qty);
				addColumnPathMap(MST_PRCD_RQMT_R.$mfg_loc_cd, Rqmt_Chk01_RsltR.$mfg_loc_cd);
				addColumnPathMap(MST_PRCD_RQMT_R.$sppl_cd, Rqmt_Chk01_RsltR.$sppl_cd);
				addColumnPathMap(MST_PRCD_RQMT_R.$rqst_loc_cd, Rqmt_Chk01_RsltR.$rqst_loc_cd);
				addColumnPathMap(MST_PRCD_RQMT_R.$fix_flg, Rqmt_Chk01_RsltR.$fix_flg);
				addColumnPathMap(MST_PRCD_RQMT_R.$sno1, Rqmt_Chk01_RsltR.$sno1);
				addColumnPathMap(MST_PRCD_RQMT_R.$sno2, Rqmt_Chk01_RsltR.$sno2);
				addColumnPathMap(MST_PRCD_RQMT_R.$sno3, Rqmt_Chk01_RsltR.$sno3);
				addColumnPathMap(MST_PRCD_RQMT_R.$sno4, Rqmt_Chk01_RsltR.$sno4);
				addColumnPathMap(MST_PRCD_RQMT_R.$wg_cd, Rqmt_Chk01_RsltR.$wg_cd);
				addColumnPathMap(MST_PRCD_RQMT_R.$rqmt_gnrt_typ, Rqmt_Chk01_RsltR.$rqmt_gnrt_typ);
				addColumnPathMap(MST_PRCD_RQMT_R.$rqmt_typ, Rqmt_Chk01_RsltR.$rqmt_typ);
				addColumnPathMap(MST_PRCD_RQMT_R.$intr_rmrks, Rqmt_Chk01_RsltR.$intr_rmrks);
				addColumnPathMap(MST_PRCD_RQMT_R.$sub_char1, Rqmt_Chk01_RsltR.$sub_char1);
				addColumnPathMap(MST_PRCD_RQMT_R.$sub_char2, Rqmt_Chk01_RsltR.$sub_char2);
				addColumnPathMap(MST_PRCD_RQMT_R.$sub_char3, Rqmt_Chk01_RsltR.$sub_char3);
			}
		}

		protected Map_MST_SIM_RQMT_R_Rqmt_Chk01_RsltR<MST_SIM_RQMT_R,Rqmt_Chk01_RsltR> createMap_MST_SIM_RQMT_R_Rqmt_Chk01_RsltR() {
			return new Map_MST_SIM_RQMT_R_Rqmt_Chk01_RsltR<MST_SIM_RQMT_R, Rqmt_Chk01_RsltR>();
		}

		public class Map_MST_SIM_RQMT_R_Rqmt_Chk01_RsltR<D extends MST_SIM_RQMT_R, S extends Rqmt_Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_SIM_RQMT_R.$rqmt_no, Rqmt_Chk01_RsltR.$rqmt_no);
				addColumnPathMap(MST_SIM_RQMT_R.$itm_cd, Rqmt_Chk01_RsltR.$itm_cd);
				addColumnPathMap(MST_SIM_RQMT_R.$itm_sub1, Rqmt_Chk01_RsltR.$itm_sub1);
				addColumnPathMap(MST_SIM_RQMT_R.$itm_sub2, Rqmt_Chk01_RsltR.$itm_sub2);
				addColumnPathMap(MST_SIM_RQMT_R.$itm_sub3, Rqmt_Chk01_RsltR.$itm_sub3);
				addColumnPathMap(MST_SIM_RQMT_R.$strg_loc_cd, Rqmt_Chk01_RsltR.$strg_loc_cd);
				addColumnPathMap(MST_SIM_RQMT_R.$due_dt, Rqmt_Chk01_RsltR.$due_dt);
				addColumnPathMap(MST_SIM_RQMT_R.$rqmt_qty, Rqmt_Chk01_RsltR.$rqmt_qty);
				addColumnPathMap(MST_SIM_RQMT_R.$mfg_loc_cd, Rqmt_Chk01_RsltR.$mfg_loc_cd);
				addColumnPathMap(MST_SIM_RQMT_R.$sppl_cd, Rqmt_Chk01_RsltR.$sppl_cd);
				addColumnPathMap(MST_SIM_RQMT_R.$rqst_loc_cd, Rqmt_Chk01_RsltR.$rqst_loc_cd);
				addColumnPathMap(MST_SIM_RQMT_R.$fix_flg, Rqmt_Chk01_RsltR.$fix_flg);
				addColumnPathMap(MST_SIM_RQMT_R.$sno1, Rqmt_Chk01_RsltR.$sno1);
				addColumnPathMap(MST_SIM_RQMT_R.$sno2, Rqmt_Chk01_RsltR.$sno2);
				addColumnPathMap(MST_SIM_RQMT_R.$sno3, Rqmt_Chk01_RsltR.$sno3);
				addColumnPathMap(MST_SIM_RQMT_R.$sno4, Rqmt_Chk01_RsltR.$sno4);
				addColumnPathMap(MST_SIM_RQMT_R.$wg_cd, Rqmt_Chk01_RsltR.$wg_cd);
				addColumnPathMap(MST_SIM_RQMT_R.$rqmt_gnrt_typ, Rqmt_Chk01_RsltR.$rqmt_gnrt_typ);
				addColumnPathMap(MST_SIM_RQMT_R.$rqmt_typ, Rqmt_Chk01_RsltR.$rqmt_typ);
				addColumnPathMap(MST_SIM_RQMT_R.$intr_rmrks, Rqmt_Chk01_RsltR.$intr_rmrks);
				addColumnPathMap(MST_SIM_RQMT_R.$sub_char1, Rqmt_Chk01_RsltR.$sub_char1);
				addColumnPathMap(MST_SIM_RQMT_R.$sub_char2, Rqmt_Chk01_RsltR.$sub_char2);
				addColumnPathMap(MST_SIM_RQMT_R.$sub_char3, Rqmt_Chk01_RsltR.$sub_char3);
				addColumnPathMap(MST_SIM_RQMT_R.$sim_mrp_no, Rqmt_Chk01_RsltR.$sim_mrp_no);
			}
		}

	}

	//FMCB CUSTOM END
}