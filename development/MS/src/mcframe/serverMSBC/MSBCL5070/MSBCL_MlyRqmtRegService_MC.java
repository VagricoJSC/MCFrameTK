package mcframe.serverMSBC.MSBCL5070;

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
import mcframe.serverMSBC.MSBCL5070.*; // このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBC.MSBCL5070.Query.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_DuplicateValidater;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_MlyRqmtRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_MlyRqmtRegService_MC extends MSBCL_MlyRqmtRegService_MC_A{
	//FMCB CUSTOM START

	/**
	 * MlyRqmtReg_Chk01オペレーション.<p>
	 *
	 */
	public class MlyRqmtReg_Chk01 extends MSBCL_MlyRqmtRegService_MC_A.MlyRqmtReg_Chk01 {
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
			for (MlyRqmtReg_Chk01_RsltR r : up0()) {
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

			MCList<MlyRqmtReg_Chk01_RsltR> notErrL = getChkList(up0());
			if (isNull(notErrL)) {
				return msgL;
			}

			// 排他チェック、データ補完、更新前データに基づくチェック
			msgL.addAll(chkMlyRqmt(notErrL, MCList.create(MST_MLY_RQMT_R.class)));

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<MlyRqmtReg_Chk01_RsltR> notErrL = getChkList(up0(), MCRow.CREATE, MCRow.MODIFY, MCRow.NONE);
			if (isNull(notErrL)) {
				return msgL;
			}

			// キャッシュ：品目マスタ（WG）マスタ
			MAVM_ITM_WG_R t = MAVM_ITM_WG_R.create("T");
			MCQueryApiBuilder itmWgDbcL_bldr = MCQueryApiBuilder.create(t);

			itmWgDbcL_bldr.setSelect(t.itm_cd);
			itmWgDbcL_bldr.addSelect(t.itm_sub1);
			itmWgDbcL_bldr.addSelect(t.itm_sub2);
			itmWgDbcL_bldr.addSelect(t.itm_sub3);
			itmWgDbcL_bldr.addSelect(t.wg_cd);
			itmWgDbcL_bldr.addSelect(t.prod_pln_typ);
			FXUCL_MCDbcCache<MAVM_ITM_WG_R> itmWgCache = new FXUCL_MCDbcCache<MAVM_ITM_WG_R>(
					itmWgDbcL_bldr, notErrL, MlyRqmtReg_Chk01_RsltR.$itm_cd,
					MlyRqmtReg_Chk01_RsltR.$itm_sub1, MlyRqmtReg_Chk01_RsltR.$itm_sub2,
					MlyRqmtReg_Chk01_RsltR.$itm_sub3, MlyRqmtReg_Chk01_RsltR.$wg_cd);

			// チェック、データ補完
			for (MlyRqmtReg_Chk01_RsltR r : notErrL) {

				// 更新後ＤＡＣチェック
				if (!up1().no_dac_flg()) {
					msgL.addAll(checkWritableLocCdDac(r, MlyRqmtReg_Chk01_RsltR.$strg_loc_cd));
				}

				// 小数部有効桁数チェック
				msgL.addAll(checkDecPlace(r, MlyRqmtReg_Chk01_RsltR.$dec_place,
						MlyRqmtReg_Chk01_RsltR.$qty));

				//生産計画立案区分が「2：月次生産依頼機能を使用する」かチェック
				MAVM_ITM_WG_R itmWgR = itmWgCache.get(r.itm_cd(), r.itm_sub1(),
						r.itm_sub2(), r.itm_sub3(), r.wg_cd());
				if (!isSame(itmWgR.prod_pln_typ(), MAC_PROD_PLN_TYP.MLY_RQMT_USE.value())) {
					msgL.add(new MCMessage(r, MlyRqmtReg_Chk01_RsltR.$itm_cd, MSBCL0108,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
									r.itm_sub3()), r.wg_cd(), toDispGUIIndex(r)));
				}
			}

			return msgL;
		}

		protected MCMessageList chkMlyRqmt(MCList<MlyRqmtReg_Chk01_RsltR> cndL, MCList<MST_MLY_RQMT_R> dbcL) {
			MCMessageList msgL = new MCMessageList();
			if (isNull(cndL)) {
				return msgL;
			}

			MCList<MlyRqmtReg_Chk01_RsltR> bindL = MCList
					.create(MlyRqmtReg_Chk01_RsltR.class);
			for (MlyRqmtReg_Chk01_RsltR r : cndL) {
				if (r.isStatusModify() || r.isStatusDelete()) {
					bindL.add(r);
				}
				else if (r.isStatusCreate() && up1().file_imp_flg()){
					bindL.add(r);
				}
			}
			if (isNull(bindL)) {
				return msgL;
			}

			MCList<MlyRqmtReg_Chk01_RsltR> sqlBindL = bindL.groupBy(MlyRqmtReg_Chk01_RsltR.$ym_key, MlyRqmtReg_Chk01_RsltR.$prod_ym_key,
					MlyRqmtReg_Chk01_RsltR.$mps_grp_cd_key, MlyRqmtReg_Chk01_RsltR.$itm_cd_key,
					MlyRqmtReg_Chk01_RsltR.$itm_sub1_key, MlyRqmtReg_Chk01_RsltR.$itm_sub2_key,
					MlyRqmtReg_Chk01_RsltR.$itm_sub3_key);
			sqlBindL.sort(MlyRqmtReg_Chk01_RsltR.$ym_key, MlyRqmtReg_Chk01_RsltR.$prod_ym_key,
					MlyRqmtReg_Chk01_RsltR.$mps_grp_cd_key, MlyRqmtReg_Chk01_RsltR.$itm_cd_key,
					MlyRqmtReg_Chk01_RsltR.$itm_sub1_key, MlyRqmtReg_Chk01_RsltR.$itm_sub2_key,
					MlyRqmtReg_Chk01_RsltR.$itm_sub3_key);
			MST_MLY_RQMT_R t = MST_MLY_RQMT_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			String[] mlyRqmtKeyCols = dbcL_bldr.getBaseDbc().getKeyColumn();
			dbcL_bldr.setOrderByAsc(dbcL_bldr.getBaseDbc().getKeyColumn$());
			dbcL_bldr.addWhereWithAnd(t.ym.eq(bind("ym_key")));
			dbcL_bldr.addWhereWithAnd(t.prod_ym.eq(bind("prod_ym_key")));
			dbcL_bldr.addWhereWithAnd(t.mps_grp_cd.eq(bind("mps_grp_cd_key")));
			dbcL_bldr.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd_key")));
			dbcL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1_key")));
			dbcL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2_key")));
			dbcL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3_key")));

			if (up1().file_imp_flg()) {
				dbSelect("MSBCL5070_MST_MLY_RQMT_S01", dbcL, dbcL_bldr, sqlBindL);
			}
			else {
				dbSelectForUpdateNoWait("MSBCL5070_MST_MLY_RQMT_S02", dbcL, dbcL_bldr, sqlBindL);
			}

			MCIndexKey idxkey = dbcL.createIndex(mlyRqmtKeyCols);
			for (MlyRqmtReg_Chk01_RsltR r : bindL) {
				MST_MLY_RQMT_R selectR = dbcL.getFirst(idxkey, r.ym_key(), r.prod_ym_key(), r.mps_grp_cd_key(),
						r.itm_cd_key(), r.itm_sub1_key(), r.itm_sub2_key(), r.itm_sub3_key());
				// 排他チェック
				if (!isNull(r.upd_cntr())) {
					msgL.addAll(checkUpdCntrNE(r, MlyRqmtReg_Chk01_RsltR.$upd_cntr,
							selectR));
				}
				if (!isNull(selectR)) {
					if (up1().file_imp_flg()){
						r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
						r.setStatus(MCRow.MODIFY);
					}
					else {
						selectR.setAttributes(r);
						// 更新前ＤＡＣチェック
						
						if (!up1().no_dac_flg()) {
							msgL.addAll(checkWritableLocCdDac(selectR, MlyRqmtReg_Chk01_RsltR.$strg_loc_cd));
						}
					}
				}
			}

			return msgL;
		}

		/**
		 * 下り電文を編集する
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * MlyRqmtReg_Upd01オペレーション.<p>
	 *
	 */
	public class MlyRqmtReg_Upd01 extends MSBCL_MlyRqmtRegService_MC_A.MlyRqmtReg_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// データ更新
			regMlyRqmt(up0());

			// 下り電文の編集
			setDown();
		}

		/**
		 * 月次次生産依頼情報の登録、更新、取消
		 */
		protected void regMlyRqmt(MCList<MlyRqmtReg_Chk01_RsltR> upL) {
			MCList<MlyRqmtReg_Chk01_RsltR> insL = MCList.create(MlyRqmtReg_Chk01_RsltR.class);
			MCList<MlyRqmtReg_Chk01_RsltR> updL = MCList.create(MlyRqmtReg_Chk01_RsltR.class);
			MCList<MlyRqmtReg_Chk01_RsltR> delL = MCList.create(MlyRqmtReg_Chk01_RsltR.class);
			for (MlyRqmtReg_Chk01_RsltR r : upL) {
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
			delMlyRqmt(delL);
			updMlyRqmt(updL);
			insMlyRqmt(insL);
		}

		protected void delMlyRqmt(MCList<MlyRqmtReg_Chk01_RsltR> upL) {
			if (isNull(upL)) {
				return;
			}
			MCList<MST_MLY_RQMT_R> dbcL = crtDbcL(upL);
			dbDeleteKey("MSBCL5070_MST_MLY_RQMT_D01", dbcL,
					MCQueryApiBuilder.create(MST_MLY_RQMT_R.create("T")));
		}

		protected void updMlyRqmt(MCList<MlyRqmtReg_Chk01_RsltR> upL) {
			if (isNull(upL)) {
				return;
			}			
			executeBatchUpdate(MSBCL5070_MST_MLY_RQMT_UP01(), null, upL);
		}

		protected void insMlyRqmt(MCList<MlyRqmtReg_Chk01_RsltR> upL) {
			if (isNull(upL)) {
				return;
			}

			MCList<MST_MLY_RQMT_R> dbcL = crtDbcL(upL);
			dbInsertEx("MSBCL5070_MST_MLY_RQMT_I01", dbcL,
					MCQueryApiBuilder.create(MST_MLY_RQMT_R.create("T")));
		}

		protected  MCList<MST_MLY_RQMT_R> crtDbcL(MCList<MlyRqmtReg_Chk01_RsltR> upL) {
			MCList<MST_MLY_RQMT_R> l = MCList.create(MST_MLY_RQMT_R.class);
			addAll(l, upL, createMap_MST_MLY_RQMT_R_MlyRqmtReg_Chk01_RsltR());
			return l;
		}

		/**
		 * 下り電文を編集する
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		protected Map_MST_MLY_RQMT_R_MlyRqmtReg_Chk01_RsltR<MST_MLY_RQMT_R, MlyRqmtReg_Chk01_RsltR> createMap_MST_MLY_RQMT_R_MlyRqmtReg_Chk01_RsltR() {
			return new Map_MST_MLY_RQMT_R_MlyRqmtReg_Chk01_RsltR<MST_MLY_RQMT_R, MlyRqmtReg_Chk01_RsltR>();
		}

		public class Map_MST_MLY_RQMT_R_MlyRqmtReg_Chk01_RsltR<D extends MST_MLY_RQMT_R, S extends MlyRqmtReg_Chk01_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_MLY_RQMT_R.$ym, MlyRqmtReg_Chk01_RsltR.$ym);
				addColumnPathMap(MST_MLY_RQMT_R.$prod_ym, MlyRqmtReg_Chk01_RsltR.$prod_ym);
				addColumnPathMap(MST_MLY_RQMT_R.$mps_grp_cd, MlyRqmtReg_Chk01_RsltR.$mps_grp_cd);
				addColumnPathMap(MST_MLY_RQMT_R.$itm_cd, MlyRqmtReg_Chk01_RsltR.$itm_cd);
				addColumnPathMap(MST_MLY_RQMT_R.$itm_sub1, MlyRqmtReg_Chk01_RsltR.$itm_sub1);
				addColumnPathMap(MST_MLY_RQMT_R.$itm_sub2, MlyRqmtReg_Chk01_RsltR.$itm_sub2);
				addColumnPathMap(MST_MLY_RQMT_R.$itm_sub3, MlyRqmtReg_Chk01_RsltR.$itm_sub3);
				addColumnPathMap(MST_MLY_RQMT_R.$strg_loc_cd, MlyRqmtReg_Chk01_RsltR.$strg_loc_cd);
				addColumnPathMap(MST_MLY_RQMT_R.$mfg_loc_cd, MlyRqmtReg_Chk01_RsltR.$mfg_loc_cd);
				addColumnPathMap(MST_MLY_RQMT_R.$sppl_cd, MlyRqmtReg_Chk01_RsltR.$sppl_cd);
				addColumnPathMap(MST_MLY_RQMT_R.$rqst_loc_cd, MlyRqmtReg_Chk01_RsltR.$rqst_loc_cd);
				addColumnPathMap(MST_MLY_RQMT_R.$qty, MlyRqmtReg_Chk01_RsltR.$qty);
				addColumnPathMap(MST_MLY_RQMT_R.$wg_cd, MlyRqmtReg_Chk01_RsltR.$wg_cd);
				addColumnPathMap(MST_MLY_RQMT_R.$intr_rmrks, MlyRqmtReg_Chk01_RsltR.$intr_rmrks);
				addColumnPathMap(MST_MLY_RQMT_R.$sub_char1, MlyRqmtReg_Chk01_RsltR.$sub_char1);
				addColumnPathMap(MST_MLY_RQMT_R.$sub_char2, MlyRqmtReg_Chk01_RsltR.$sub_char2);
				addColumnPathMap(MST_MLY_RQMT_R.$sub_char3, MlyRqmtReg_Chk01_RsltR.$sub_char3);
			}
		}
	}

	//FMCB CUSTOM END
}