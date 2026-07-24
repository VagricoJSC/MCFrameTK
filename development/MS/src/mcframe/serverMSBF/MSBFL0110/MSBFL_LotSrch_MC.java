package mcframe.serverMSBF.MSBFL0110;

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mcframe.commonCore.container.MCRow.Status;
import static mcframe.serverCore.database.MCSQLClause.*;
import static mcframe.commonFX.notice.FX_Msg.*;
import mcframe.serverFXBA.FXBAL0060.FXBAL_MCRLUtil;
import mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMSBF.MSBFL0110.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBF.MSBFL5210.*;
import static mcframe.serverMSBF.MSBFL0110.Query.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_LotSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_LotSrch_MC extends MSBFL_LotSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * ロット管理情報の更新前のチェックを行います。<br>
	 */
	public class Chk01 extends MSBFL_LotSrch_MC_A.Chk01 {
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
			
			msgL.addAll(checkLot());
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			crrctDataBeforeDoServerChk();
			
			MCList<Chk01_DtlR> notErrL = getChkList(up0(), MCRow.Status.CREATE, MCRow.Status.MODIFY);
			for (Chk01_DtlR r : notErrL) {
				// ロットＮＯの必須チェック
				if (MAC_LOT_MNG_TYP.req_lot(r.lot_mng_typ())) {
					msgL.addAll(check(r, Chk01_DtlR.$lot_no, new FXUCL_RequiredValidater()));
				}
				// サブロットＮＯの必須チェック
				if (MAC_SUBLOT_MNG_TYP.req_lot(r.sublot_mng_typ())) {
					msgL.addAll(check(r, Chk01_DtlR.$sublot_no, new FXUCL_RequiredValidater()));
				}
				// 版ＮＯの必須チェック
				if (isSame(getSysParm("VER_ENABLE_FLG"), "1") && r.ver_flg()) {
					msgL.addAll(check(r, Chk01_DtlR.$ver_no, new FXUCL_RequiredValidater()));
				}
				// 実際係数の必須チェック
				if (isSame(getSysParm("CONT_FCTR_ENABLE_FLG"), "1") && r.cont_fctr_flg()) {
					msgL.addAll(check(r, Chk01_DtlR.$act_cont_fctr, new FXUCL_RequiredValidater()));
				}
				// 有効期限の必須チェック
				if (isNull(r.vld_dt()) && !isNull(r.lmt_dt())) {
					msgL.addAll(check(r, Chk01_DtlR.$vld_dt, new FXUCL_RequiredValidater()));
				}
				// 使用期限の必須チェック
				if (!isNull(r.vld_dt()) && isNull(r.lmt_dt())) {
					msgL.addAll(check(r, Chk01_DtlR.$lmt_dt, new FXUCL_RequiredValidater()));
				}
				// ロット管理品チェック
				if (!MAC_LOT_MNG_TYP.req_lot(r.lot_mng_typ())) {
					msgL.add(new MCMessage(r, Chk01_DtlR.$itm_cd, MSBFL0082, r.itm_cd(), toDispGUIIndex(r)));
				}
			}

			return msgL;
		}
		
		/**
		 * ロット管理情報のロック・更新カウンタチェック・重複チェックを行う
		 * @return
		 */
		protected MCMessageList checkLot() {
			MCMessageList msgL = new MCMessageList();
			
			String[] grpCols = new String[] {Chk01_DtlR.$itm_cd, Chk01_DtlR.$itm_sub1, 
					Chk01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub3, Chk01_DtlR.$lot_no, Chk01_DtlR.$sublot_no};
			MCList<Chk01_DtlR> insUpdL = getChkList(up0(), Status.CREATE, Status.MODIFY);
			MCList<Chk01_DtlR> updL = getChkList(up0(), Status.MODIFY);
			
			// ロック処理(変更前キーでロック)
			MCList<MST_LOT_R> selectL = MCList.create(MST_LOT_R.class);
			MST_LOT_R selectL_t = MST_LOT_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(selectL_t);
			selectL_bldr.setSelect(selectL_bldr.getBaseDbc().getKeyColumn$());
			selectL_bldr.addSelect(selectL_t.upd_cntr);
			MCList<MST_LOT_R> bindL = selectL.createInstance();
			addAll(bindL, updL, createMap_MST_LOT_R_Chk01_DtlRBind());
			bindL = bindL.groupBy(grpCols);
			bindL.sort(grpCols);
			dbSelectKeyForUpdateNoWait("MSBFL0110_MST_LOT_S01", selectL, selectL_bldr, bindL);
			
			// キー変更先データ取得処理
			MCList<MST_LOT_R> newLotL = MCList.create(MST_LOT_R.class);
			MCQueryApiBuilder newLotL_bldr = MCQueryApiBuilder.create(MST_LOT_R.create("T"));
			newLotL_bldr.setSelect(newLotL_bldr.getBaseDbc().getKeyColumn$());
			MCList<Chk01_DtlR> subL = getListKeyDiffered(insUpdL);
			subL = subL.groupBy(grpCols);
			subL.sort(grpCols);
			dbSelectKey("MSBFL0110_MST_LOT_S02", newLotL, newLotL_bldr, subL);
			
			MCIndexKey idxkey = selectL.createIndex(selectL_bldr.getBaseDbc().getKeyColumn());
			MCIndexKey nltIdxkey = newLotL.createIndex(selectL_bldr.getBaseDbc().getKeyColumn());
			for (Chk01_DtlR r : insUpdL) {
				// 存在チェック
				if (isKeyDiffered(r)) {
					MST_LOT_R newLotR = newLotL.getFirst(nltIdxkey, r.itm_cd(), r.itm_sub1(),
							r.itm_sub2(), r.itm_sub3(), r.lot_no(), r.sublot_no());
					if (!isNull(newLotR)) {
						msgL.add(new MCMessage(r, null, MSBFL0081, toDispGUIIndex(r)));
					}
				}
			}
			for (Chk01_DtlR r : updL) {
				MST_LOT_R selectR = selectL.getFirst(idxkey, r.itm_cd_key(), r.itm_sub1_key(), 
						r.itm_sub2_key(), r.itm_sub3_key(), r.lot_no_key(), r.sublot_no_key());
				// 更新カウンタチェック
				msgL.addAll(checkUpdCntrNE(r, Chk02_DtlR.$upd_cntr, selectR));
				if (isKeyDiffered(r)) {
					MAM_ITM_R itmR = getItmR(selectR.itm_cd(), selectR.itm_sub1(), selectR.itm_sub2(), selectR.itm_sub3());

					if (existsYieldInst(selectR, itmR)) {
						msgL.add(new MCMessage(r, null, MSBFL0133, toDispItm(selectR.itm_cd(), selectR.itm_sub1(), selectR.itm_sub2(), selectR.itm_sub3()), selectR.lot_no(), selectR.sublot_no(), toDispGUIIndex(r)));
					}

					if (existsArrSchd(selectR, itmR)) {
						msgL.add(new MCMessage(r, null, MSBFL0134, toDispItm(selectR.itm_cd(), selectR.itm_sub1(), selectR.itm_sub2(), selectR.itm_sub3()), selectR.lot_no(), selectR.sublot_no(), toDispGUIIndex(r)));
					}

					if (existsItmMfgInst(selectR, itmR)) {
						msgL.add(new MCMessage(r, null, MSBFL0142, toDispItm(selectR.itm_cd(), selectR.itm_sub1(), selectR.itm_sub2(), selectR.itm_sub3()), selectR.lot_no(), selectR.sublot_no(), toDispGUIIndex(r)));
					}

					if (existsLotTraceGr(selectR, itmR)) {
						msgL.add(new MCMessage(r, null, MSBFL0135, toDispItm(selectR.itm_cd(), selectR.itm_sub1(), selectR.itm_sub2(), selectR.itm_sub3()), selectR.lot_no(), selectR.sublot_no(), toDispGUIIndex(r)));
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 変更前キーを保持するカラムの値と変更後キーを保持するカラムの値が異なるリストを返す
		 * @return
		 */
		protected MCList<Chk01_DtlR> getListKeyDiffered(MCList<Chk01_DtlR> dtlL) {
			MCList<Chk01_DtlR> subL = dtlL.createInstance();
			for (Chk01_DtlR r : dtlL) {
				if (isKeyDiffered(r)) {
					subL.add(r);
				}
			}
			return subL;
		}

		/** 変更前キーを保持するカラムの値と変更後キーを保持するカラムの値が異なる場合trueを返します。 */
		protected boolean isKeyDiffered(Chk01_DtlR r) {
			String[] cols = new String[] {Chk01_DtlR.$itm_cd, Chk01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub2,
					Chk01_DtlR.$itm_sub3, Chk01_DtlR.$lot_no, Chk01_DtlR.$sublot_no};
			
			return !isColSame(r, FXBAL_MCRLUtil.getBeforeKeyColumns(cols), r, cols);
		}
		
		protected void crrctDataBeforeDoServerChk() {
			for (Chk01_DtlR r : up0()) {
				if (!r.ver_flg()) {
					r.ver_no(null);
				}
				if (!r.cont_fctr_flg()) {
					r.act_cont_fctr(null);
				}
				if (!MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
					r.lot_no(nullValToNull(r.lot_no()));
				}
				if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ()) || MAC_SUBLOT_MNG_TYP.isSTK(r.sublot_mng_typ())) {
					r.sublot_no(MAC_STR.NULL_VAL.value());
				}
				else {
					r.sublot_no(nullValToNull(r.sublot_no()));
				}
			}
		}
		/**
		 * 上り電文で渡された値と同一ロットの出来高指図が存在するかどうか
		 * @return
		 */
		protected boolean existsYieldInst(MST_LOT_R r, MAM_ITM_R itmR) {
			MST_YIELD_SCHD_R yieldSchdR = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder yieldSchdR_bldr = MCQueryApiBuilder.create(yieldSchdR);
			String cntStr = "cnt";
			yieldSchdR.addNumberColumn(cntStr);
			yieldSchdR_bldr.setSelect(nvl( count(value("X")), value(0)).as(cntStr));
			yieldSchdR_bldr.setWhere(yieldSchdR.itm_cd.eq(bind("1")), r.itm_cd());
			yieldSchdR_bldr.addWhereWithAnd(yieldSchdR.itm_sub1.eq(bind("1")), r.itm_sub1());
			yieldSchdR_bldr.addWhereWithAnd(yieldSchdR.itm_sub2.eq(bind("1")), r.itm_sub2());
			yieldSchdR_bldr.addWhereWithAnd(yieldSchdR.itm_sub3.eq(bind("1")), r.itm_sub3());
			yieldSchdR_bldr.addWhereWithAnd(yieldSchdR.lot_no.eq(bind("1")), r.lot_no());
			if (!MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
				yieldSchdR_bldr.addWhereWithAnd(yieldSchdR.sublot_no.eq(bind("1")), r.sublot_no());
			}
			yieldSchdR_bldr.addWhereWithAnd(yieldSchdR.can_flg.eq(value(false)));
			dbSelect("MSBFL0110_MST_YIELD_SCHD_S01", yieldSchdR, yieldSchdR_bldr);

			return !yieldSchdR.getNumber(cntStr).isZero();
		}

		/**
		 * 上り電文で渡された値と同一ロットの入荷予定が存在するかどうか
		 * @return
		 */
		protected boolean existsArrSchd(MST_LOT_R r, MAM_ITM_R itmR) {
			MST_ARR_SCHD_R arrSchdR = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder arrSchdR_bldr = MCQueryApiBuilder.create(arrSchdR);
			String cntStr = "cnt";
			arrSchdR.addNumberColumn(cntStr);
			arrSchdR_bldr.setSelect(nvl( count(value("X")), value(0)).as(cntStr));
			arrSchdR_bldr.setWhere(arrSchdR.itm_cd.eq(bind("1")), r.itm_cd());
			arrSchdR_bldr.addWhereWithAnd(arrSchdR.itm_sub1.eq(bind("1")), r.itm_sub1());
			arrSchdR_bldr.addWhereWithAnd(arrSchdR.itm_sub2.eq(bind("1")), r.itm_sub2());
			arrSchdR_bldr.addWhereWithAnd(arrSchdR.itm_sub3.eq(bind("1")), r.itm_sub3());
			arrSchdR_bldr.addWhereWithAnd(arrSchdR.lot_no.eq(bind("1")), r.lot_no());
			if (!MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
				arrSchdR_bldr.addWhereWithAnd(arrSchdR.sublot_no.eq(bind("1")), r.sublot_no());
			}
			arrSchdR_bldr.addWhereWithAnd(arrSchdR.abort_flg.eq(value(false)));
			dbSelect("MSBFL0110_MST_ARR_SCHD_S01", arrSchdR, arrSchdR_bldr);

			return !arrSchdR.getNumber(cntStr).isZero();
		}

		/**
		 * 上り電文で渡された値と同一ロットの受払実績が存在するかどうか
		 * @return
		 */
		protected boolean existsLotTraceGr(MST_LOT_R r, MAM_ITM_R itmR) {
			MST_LOT_TRACE_GR_R lotTraceGrR = MST_LOT_TRACE_GR_R.create("T");
			MCQueryApiBuilder lotTraceGrR_bldr = MCQueryApiBuilder.create(lotTraceGrR);
			String cntStr = "cnt";
			lotTraceGrR.addNumberColumn(cntStr);
			lotTraceGrR_bldr.setSelect(nvl( count(value("X")), value(0)).as(cntStr));
			lotTraceGrR_bldr.setWhere(lotTraceGrR.itm_cd.eq(bind("1")), r.itm_cd());
			lotTraceGrR_bldr.addWhereWithAnd(lotTraceGrR.itm_sub1.eq(bind("1")), r.itm_sub1());
			lotTraceGrR_bldr.addWhereWithAnd(lotTraceGrR.itm_sub2.eq(bind("1")), r.itm_sub2());
			lotTraceGrR_bldr.addWhereWithAnd(lotTraceGrR.itm_sub3.eq(bind("1")), r.itm_sub3());
			lotTraceGrR_bldr.addWhereWithAnd(lotTraceGrR.lot_no.eq(bind("1")), r.lot_no());
			if (!MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
				lotTraceGrR_bldr.addWhereWithAnd(lotTraceGrR.sublot_no.eq(bind("1")), r.sublot_no());
			}
			lotTraceGrR_bldr.addWhereWithAnd(lotTraceGrR.schd_act_typ.eq(bind("1")), MSC_SCHD_ACT_TYP.ACT.value());
			dbSelect("MSBFL0110_MST_LOT_TRACE_GR_S01", lotTraceGrR, lotTraceGrR_bldr);

			return !lotTraceGrR.getNumber(cntStr).isZero();
		}
		

		/**
		 * 上り電文で渡された値と同一ロットの品目製造指図が存在するかどうか
		 * @return
		 */
		protected boolean existsItmMfgInst(MST_LOT_R r, MAM_ITM_R itmR) {
			MST_ITM_MFG_INST_R mfgSchdR = MST_ITM_MFG_INST_R.create("T");
			MCQueryApiBuilder mfgSchdR_bldr = MCQueryApiBuilder.create(mfgSchdR);
			String cntStr = "cnt";
			mfgSchdR.addNumberColumn(cntStr);
			mfgSchdR_bldr.setSelect(nvl( count(value("X")), value(0)).as(cntStr));
			mfgSchdR_bldr.setWhere(mfgSchdR.itm_cd.eq(bind("1")), r.itm_cd());
			mfgSchdR_bldr.addWhereWithAnd(mfgSchdR.itm_sub1.eq(bind("1")), r.itm_sub1());
			mfgSchdR_bldr.addWhereWithAnd(mfgSchdR.itm_sub2.eq(bind("1")), r.itm_sub2());
			mfgSchdR_bldr.addWhereWithAnd(mfgSchdR.itm_sub3.eq(bind("1")), r.itm_sub3());
			mfgSchdR_bldr.addWhereWithAnd(mfgSchdR.lot_no.eq(bind("1")), r.lot_no());
			if (!MAC_SUBLOT_MNG_TYP.isSTK(itmR.sublot_mng_typ())) {
				mfgSchdR_bldr.addWhereWithAnd(mfgSchdR.sublot_no.eq(bind("1")), r.sublot_no());
			}
			mfgSchdR_bldr.addWhereWithAnd(mfgSchdR.can_flg.eq(value(false)));
			dbSelect("MSBFL0110_MST_ITM_MFG_INST_S01", mfgSchdR, mfgSchdR_bldr);

			return !mfgSchdR.getNumber(cntStr).isZero();
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		protected Map_MST_LOT_R_Chk01_DtlRBind<MST_LOT_R,Chk01_DtlR> createMap_MST_LOT_R_Chk01_DtlRBind() {
			return new Map_MST_LOT_R_Chk01_DtlRBind<MST_LOT_R, Chk01_DtlR>();
		}

		public class Map_MST_LOT_R_Chk01_DtlRBind<D extends MST_LOT_R, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_LOT_R.$itm_cd, Chk01_DtlR.$itm_cd_key);
				addColumnPathMap(MST_LOT_R.$itm_sub1, Chk01_DtlR.$itm_sub1_key);
				addColumnPathMap(MST_LOT_R.$itm_sub2, Chk01_DtlR.$itm_sub2_key);
				addColumnPathMap(MST_LOT_R.$itm_sub3, Chk01_DtlR.$itm_sub3_key);
				addColumnPathMap(MST_LOT_R.$lot_no, Chk01_DtlR.$lot_no_key);
				addColumnPathMap(MST_LOT_R.$sublot_no, Chk01_DtlR.$sublot_no_key);

			}
		}
		
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;

		protected void createItmCache() {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.sublot_mng_typ);
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, up0(),
					MST_LOT_R.$itm_cd, MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2,
					MST_LOT_R.$itm_sub3);
		}

		protected MAM_ITM_R getItmR(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
			if (_itmCache == null) {
				createItmCache();
			}
			return _itmCache.get(itmCd, itmSub1, itmSub2, itmSub3);
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * ロット管理情報の削除前のチェックを行います。<br>
	 */
	public class Chk02 extends MSBFL_LotSrch_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			MCList<Chk02_DtlR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				callLotChkSrv(notErrL);
			}
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			msgL.addAll(checkLot());
			
			return msgL;
		}
		
		/**
		 * ロット管理情報のロック・更新カウンタチェックを行う
		 */
		protected MCMessageList checkLot() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<Chk02_DtlR> notErrL = getChkList(up0());
			
			// ロック処理
			MCList<MST_LOT_R> selectL = MCList.create(MST_LOT_R.class);
			MST_LOT_R selectL_t = MST_LOT_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(selectL_t);
			selectL_bldr.setSelect(selectL_bldr.getBaseDbc().getKeyColumn$());
			selectL_bldr.addSelect(selectL_t.upd_cntr);
			MCList<Chk02_DtlR> bindL = notErrL.groupBy(Chk02_DtlR.$itm_cd, Chk02_DtlR.$itm_sub1,
					Chk02_DtlR.$itm_sub2, Chk02_DtlR.$itm_sub3, Chk02_DtlR.$lot_no, Chk02_DtlR.$sublot_no);
			bindL.sort(Chk02_DtlR.$itm_cd, Chk02_DtlR.$itm_sub1, Chk02_DtlR.$itm_sub2, 
					Chk02_DtlR.$itm_sub3, Chk02_DtlR.$lot_no, Chk02_DtlR.$sublot_no);
			dbSelectKeyForUpdateNoWait("MSBFL0110_MST_LOT_S03", selectL, selectL_bldr, bindL);
			
			// 更新カウンタチェック
			MCIndexKey idxkey = selectL.createIndex(selectL_bldr.getBaseDbc().getKeyColumn());
			for (Chk02_DtlR r : notErrL) {
				MST_LOT_R selectR = selectL.getFirst(idxkey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), 
						r.itm_sub3(), r.lot_no(), r.sublot_no());
				msgL.addAll(checkUpdCntrNE(r, Chk02_DtlR.$upd_cntr, selectR));
			}
			
			return msgL;
		}
		
		protected void setDown() {
			down0().addAll(up0());
		}
		
		/**
		 * 削除前チェック処理を呼び出します
		 * @param up0
		 */
		protected void callLotChkSrv(MCList<Chk02_DtlR> notErrL) {
			MSBFL_LotService.Lot_Chk01 ope = MSBFL_LotService.crtLot_Chk01();
			addAll(ope.up0(), notErrL, createMap_Lot_Chk01_CndR_Chk02_DtlR());
			
			ope.exec();
			copyErrFlg(notErrL, ope.down0());
		}
		
		protected Map_Lot_Chk01_CndR_Chk02_DtlR<Lot_Chk01_CndR,Chk02_DtlR> createMap_Lot_Chk01_CndR_Chk02_DtlR() {
			return new Map_Lot_Chk01_CndR_Chk02_DtlR<Lot_Chk01_CndR, Chk02_DtlR>();
		}

		public class Map_Lot_Chk01_CndR_Chk02_DtlR<D extends Lot_Chk01_CndR, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Chk01_CndR.$peg_no, Chk02_DtlR.$peg_no);
				addColumnPathMap(Lot_Chk01_CndR.$itm_cd, Chk02_DtlR.$itm_cd);
				addColumnPathMap(Lot_Chk01_CndR.$itm_sub1, Chk02_DtlR.$itm_sub1);
				addColumnPathMap(Lot_Chk01_CndR.$itm_sub2, Chk02_DtlR.$itm_sub2);
				addColumnPathMap(Lot_Chk01_CndR.$itm_sub3, Chk02_DtlR.$itm_sub3);
				addColumnPathMap(Lot_Chk01_CndR.$lot_no, Chk02_DtlR.$lot_no);
				addColumnPathMap(Lot_Chk01_CndR.$sublot_no, Chk02_DtlR.$sublot_no);

			}
		}
		
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * ロット管理情報の検索を行います。<br>
	 */
	public class Srch01 extends MSBFL_LotSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			MCQueryPlan lotSql = MSBFL0110_MST_LOT_S01();
			executeQuery(down0(), lotSql, up0());
		}
		
	}
	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイルから取り込んだロット管理情報のチェック処理を行います。<br>
	 */
	public class Imp01 extends MSBFL_LotSrch_MC_A.Imp01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			
			callThisChk01();
			setDown();
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		protected void editUp() {
			setPegNo(Chk01_DtlR.$peg_no, up0());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBFL_LotSrch.Chk01 ope = MSBFL_LotSrch.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
		
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * ロット管理情報の更新を行います。<br>
	 */
	public class Upd01 extends MSBFL_LotSrch_MC_A.Upd01 {
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
			
			callThisChk01();
			
			MCList<Chk01_DtlR> notErrL = up0().subList(Chk01_DtlR.$err_flg, false);
			if (notErrL.size() != 0) {
				// ロット管理情報更新
				updLot(notErrL);
				// ロット管理情報リスト更新
				updLotLst(notErrL);
			}
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		/**
		 * 更新前チェック処理を呼び出す
		 * @param up0
		 */
		protected void callThisChk01() {
			MSBFL_LotSrch.Chk01 ope = MSBFL_LotSrch.crtChk01();
			ope.up0().setAll(up0());
			
			ope.exec();
		}
		
		/**
		 * ロット管理情報を更新する
		 */
		protected void updLot(MCList<Chk01_DtlR> notErrL) {
			MCList<MST_LOT_R> dbc = MCList.create(MST_LOT_R.class);
			addAll(dbc, notErrL, createMap_MST_LOT_R_Chk01_DtlR());
			MCList<MST_LOT_R> selectL = MCList.create(MST_LOT_R.class);
			MST_LOT_R selectL_t = MST_LOT_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(selectL_t);
			selectL_bldr.setSelect(selectL_bldr.getBaseDbc().getKeyColumn$());
			selectL_bldr.addSelect(selectL_t.no_del_flg);
			selectL_bldr.setWhere(selectL_t.itm_cd.eq(bind("itm_cd_key")));
			selectL_bldr.addWhereWithAnd(selectL_t.itm_sub1.eq(bind("itm_sub1_key")));
			selectL_bldr.addWhereWithAnd(selectL_t.itm_sub2.eq(bind("itm_sub2_key")));
			selectL_bldr.addWhereWithAnd(selectL_t.itm_sub3.eq(bind("itm_sub3_key")));
			selectL_bldr.addWhereWithAnd(selectL_t.lot_no.eq(bind("lot_no_key")));
			selectL_bldr.addWhereWithAnd(selectL_t.sublot_no.eq(bind("sublot_no_key")));

			dbSelect("MSBFL0110_MST_LOT_S04", selectL, selectL_bldr, notErrL);
			
			MCIndexKey idxkey = selectL.createIndex(selectL_bldr.getBaseDbc().getKeyColumn());
			
			for (MST_LOT_R r : dbc.subList(Status.MODIFY)) {
					r.no_del_flg(selectL
						.getFirst(idxkey, r.getString("itm_cd_key"),
								r.getString("itm_sub1_key"),
								r.getString("itm_sub2_key"),
								r.getString("itm_sub3_key"),
								r.getString("lot_no_key"),
								r.getString("sublot_no_key"))
							.getBoolean(MST_LOT_R.$no_del_flg));
			}
			
			setLotSeq(dbc);
			
			MCList<MST_LOT_R> ins = dbc.subList(Status.CREATE);
			MCList<MST_LOT_R> upd = dbc.subList(Status.MODIFY);
			
			// 新規登録
			dbInsert("MSBFL0110_MST_LOT_I01", ins, MCQueryApiBuilder.create(MST_LOT_R.create("T")));
			
			// 更新
			String[] bfrKeys = getBfrKeys(upd.createRow());
			dbUpdateKeyAt("MSBFL0110_MST_LOT_U01", upd,
					MCQueryApiBuilder.create(MST_LOT_R.create("T")), bfrKeys);
		}

		protected void updLotLst(MCList<Chk01_DtlR> notErrL) {
			MCList<MST_LOT_LIST_R> dbc = MCList.create(MST_LOT_LIST_R.class);
			addAll(dbc, notErrL, createMap_MST_LOT_LIST_R_Chk01_DtlR());
			
			MCList<MST_LOT_LIST_R> ins = dbc.subList(Status.CREATE);
			MCList<MST_LOT_LIST_R> upd = dbc.subList(Status.MODIFY);
			
			// 新規登録
			if (!ins.isEmpty()) {
				dbInsert("MSBFL0110_MST_LOT_LIST_I01", ins, MCQueryApiBuilder.create(MST_LOT_LIST_R.create("T")));
			}
			
			// 更新
			if (!upd.isEmpty()) {
				String[] bfrKeys = getBfrKeys(upd.createRow());
				dbUpdateKeyAt("MSBFL0110_MST_LOT_LIST_U01", upd,
						MCQueryApiBuilder.create(MST_LOT_LIST_R.create("T")), bfrKeys);
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		/**
		 * 変更可能なキー項目を返します。
		 */
		protected String[] getUpdatableKeys(MCDBContainer row) {
			// 全てのキー項目が変更可能
			return row.getKeyColumn();
		}
		
		protected void setLotSeq(MCList<MST_LOT_R> list) {
			// 上り電文のlot_seqがNULLであるROWに対して新規・更新に関わらず発番する。
			MCList<MST_LOT_R> lotSeqNullL = MCList.create(MST_LOT_R.class);
			for (MST_LOT_R r : list) {
				if (isNull(r.lot_seq())) {
					lotSeqNullL.add(r);
				}
			}
			
			if (!lotSeqNullL.isEmpty()) {
				doSeqCache(MSC_NUM_SYS_TYP.LOTSEQ, lotSeqNullL.size());
				lotSeqNullL.sort(MST_LOT_R.$first_gr_dt, MST_LOT_R.$itm_cd, MST_LOT_R.$lot_no);
				for (MST_LOT_R r : lotSeqNullL) {
					r.lot_seq(getStrSeq(MSC_NUM_SYS_TYP.LOTSEQ));
				}
			}
		}
		/**
		 * 変更可能なキー項目と対応する変更前キー項目のマップを返します。
		 */
		protected Map<String, String> getUpdatableKeyMap(MCDBContainer row) {
			String[] keys = getUpdatableKeys(row);
			String[] bfrKeys = FXBAL_MCRLUtil.getBeforeKeyColumns(keys);
			Map<String, String> m = new HashMap<String, String>();

			for (int i = 0; i < keys.length; i++) {
				m.put(keys[i], bfrKeys[i]);
			}
			return m;
		}
		
		protected String[] getBfrKeys(MCDBContainer row) {
			Map<String, String> m = getUpdatableKeyMap(row);
			List<String> l = new ArrayList<String>();
			for (String c : row.getKeyColumn()) {
				if (m.containsKey(c)) {
					l.add(m.get(c));
				}
				else {
					l.add(c);
				}
			}
			return (String[])l.toArray(new String[0]);
		}
		
		protected void handleSuccess(MCList<Chk01_DtlR> l) {
			dbTran().commit();
			for (Chk01_DtlR r : l) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}
		
		protected void handleEx(Exception e, MCList<Chk01_DtlR> l) {
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
			for (Chk01_DtlR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
		
		protected Map_MST_LOT_R_Chk01_DtlR<MST_LOT_R,Chk01_DtlR> createMap_MST_LOT_R_Chk01_DtlR() {
			return new Map_MST_LOT_R_Chk01_DtlR<MST_LOT_R, Chk01_DtlR>();
		}

		public class Map_MST_LOT_R_Chk01_DtlR<D extends MST_LOT_R, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_LOT_R.$itm_cd, Chk01_DtlR.$itm_cd);
				addColumnPathMap(MST_LOT_R.$itm_sub1, Chk01_DtlR.$itm_sub1);
				addColumnPathMap(MST_LOT_R.$itm_sub2, Chk01_DtlR.$itm_sub2);
				addColumnPathMap(MST_LOT_R.$itm_sub3, Chk01_DtlR.$itm_sub3);
				addColumnPathMap(MST_LOT_R.$lot_no, Chk01_DtlR.$lot_no);
				addColumnPathMap(MST_LOT_R.$sublot_no, Chk01_DtlR.$sublot_no);
				addColumnPathMap(MST_LOT_R.$schd_flg, Chk01_DtlR.$schd_flg);
				addColumnPathMap(MST_LOT_R.$ver_no, Chk01_DtlR.$ver_no);
				addColumnPathMap(MST_LOT_R.$first_gr_dt, Chk01_DtlR.$first_gr_dt);
				addColumnPathMap(MST_LOT_R.$base_gr_dt, Chk01_DtlR.$base_gr_dt);
				addColumnPathMap(MST_LOT_R.$unreg_lmt_flg, Chk01_DtlR.$unreg_lmt_flg);
				addColumnPathMap(MST_LOT_R.$vld_dt, Chk01_DtlR.$vld_dt);
				addColumnPathMap(MST_LOT_R.$lmt_dt, Chk01_DtlR.$lmt_dt);
				addColumnPathMap(MST_LOT_R.$lot_mng_typ, Chk01_DtlR.$lot_mng_typ);
				addColumnPathMap(MST_LOT_R.$sublot_mng_typ, Chk01_DtlR.$sublot_mng_typ);
				addColumnPathMap(MST_LOT_R.$bp_lot_no, Chk01_DtlR.$bp_lot_no);
				addColumnPathMap(MST_LOT_R.$stk_insp_typ, Chk01_DtlR.$stk_insp_typ);
				addColumnPathMap(MST_LOT_R.$quality_typ, Chk01_DtlR.$quality_typ);
				addColumnPathMap(MST_LOT_R.$mfg_aprv_sts_typ, Chk01_DtlR.$mfg_aprv_sts_typ);
				addColumnPathMap(MST_LOT_R.$insp_aprv_sts_typ, Chk01_DtlR.$insp_aprv_sts_typ);
				addColumnPathMap(MST_LOT_R.$plnt_aprv_sts_typ, Chk01_DtlR.$plnt_aprv_sts_typ);
				addColumnPathMap(MST_LOT_R.$mrkt_judg_sts_typ, Chk01_DtlR.$mrkt_judg_sts_typ);
				addColumnPathMap(MST_LOT_R.$first_gr_dt_save_flg, Chk01_DtlR.$first_gr_dt_save_flg);
				addColumnPathMap(MST_LOT_R.$act_cont_fctr, Chk01_DtlR.$act_cont_fctr);
				addColumnPathMap(MST_LOT_R.$lmt_dt_frm_typ, Chk01_DtlR.$lmt_dt_frm_typ);
				addColumnPathMap(MST_LOT_R.$lmt_dt_frm, Chk01_DtlR.$lmt_dt_frm);
				addColumnPathMap(MST_LOT_R.$lot_seq, Chk01_DtlR.$lot_seq);
				addColumnPathMap(MST_LOT_R.$lot_rmrks, Chk01_DtlR.$lot_rmrks);
				addColumnPathMap(MST_LOT_R.$lot_sub_char1, Chk01_DtlR.$lot_sub_char1);
				addColumnPathMap(MST_LOT_R.$lot_sub_char2, Chk01_DtlR.$lot_sub_char2);
				addColumnPathMap(MST_LOT_R.$lot_sub_char3, Chk01_DtlR.$lot_sub_char3);
				addColumnPathMap(MST_LOT_R.$lot_sub_char4, Chk01_DtlR.$lot_sub_char4);
				addColumnPathMap(MST_LOT_R.$lot_sub_char5, Chk01_DtlR.$lot_sub_char5);
				addColumnPathMap(MST_LOT_R.$lot_sub_num1, Chk01_DtlR.$lot_sub_num1);
				addColumnPathMap(MST_LOT_R.$lot_sub_num2, Chk01_DtlR.$lot_sub_num2);
				addColumnPathMap(MST_LOT_R.$lot_sub_num3, Chk01_DtlR.$lot_sub_num3);
				addColumnPathMap(MST_LOT_R.$lot_sub_num4, Chk01_DtlR.$lot_sub_num4);
				addColumnPathMap(MST_LOT_R.$lot_sub_num5, Chk01_DtlR.$lot_sub_num5);
				addColumnPathMap(MST_LOT_R.$lot_sub_dt1, Chk01_DtlR.$lot_sub_dt1);
				addColumnPathMap(MST_LOT_R.$lot_sub_dt2, Chk01_DtlR.$lot_sub_dt2);
				addColumnPathMap(MST_LOT_R.$lot_sub_dt3, Chk01_DtlR.$lot_sub_dt3);
				addColumnPathMap(MST_LOT_R.$lot_sub_dt4, Chk01_DtlR.$lot_sub_dt4);
				addColumnPathMap(MST_LOT_R.$lot_sub_dt5, Chk01_DtlR.$lot_sub_dt5);
				addColumnPathMap(MST_LOT_R.$lot_sub_flg1, Chk01_DtlR.$lot_sub_flg1);
				addColumnPathMap(MST_LOT_R.$lot_sub_flg2, Chk01_DtlR.$lot_sub_flg2);
				addColumnPathMap(MST_LOT_R.$lot_sub_flg3, Chk01_DtlR.$lot_sub_flg3);
				addColumnPathMap(MST_LOT_R.$lot_sub_flg4, Chk01_DtlR.$lot_sub_flg4);
				addColumnPathMap(MST_LOT_R.$lot_sub_flg5, Chk01_DtlR.$lot_sub_flg5);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.setStringNE(Chk01_DtlR.$itm_cd_key, src.itm_cd_key());
				dest.setStringNE(Chk01_DtlR.$itm_sub1_key, src.itm_sub1_key());
				dest.setStringNE(Chk01_DtlR.$itm_sub2_key, src.itm_sub2_key());
				dest.setStringNE(Chk01_DtlR.$itm_sub3_key, src.itm_sub3_key());
				dest.setStringNE(Chk01_DtlR.$lot_no_key, src.lot_no_key());
				dest.setStringNE(Chk01_DtlR.$sublot_no_key, src.sublot_no_key());
				if (src.isStatusCreate()) {
					dest.no_del_flg(true);
				}
			}
			
		}

		protected Map_MST_LOT_LIST_R_Chk01_DtlR<MST_LOT_LIST_R,Chk01_DtlR> createMap_MST_LOT_LIST_R_Chk01_DtlR() {
			return new Map_MST_LOT_LIST_R_Chk01_DtlR<MST_LOT_LIST_R, Chk01_DtlR>();
		}

		public class Map_MST_LOT_LIST_R_Chk01_DtlR<D extends MST_LOT_LIST_R, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_LOT_LIST_R.$itm_cd, Chk01_DtlR.$itm_cd);
				addColumnPathMap(MST_LOT_LIST_R.$itm_sub1, Chk01_DtlR.$itm_sub1);
				addColumnPathMap(MST_LOT_LIST_R.$itm_sub2, Chk01_DtlR.$itm_sub2);
				addColumnPathMap(MST_LOT_LIST_R.$itm_sub3, Chk01_DtlR.$itm_sub3);
				addColumnPathMap(MST_LOT_LIST_R.$lot_no, Chk01_DtlR.$lot_no);
				addColumnPathMap(MST_LOT_LIST_R.$sublot_no, Chk01_DtlR.$sublot_no);
				addColumnPathMap(MST_LOT_LIST_R.$lot_tbl_sublot_no, Chk01_DtlR.$sublot_no);
				addColumnPathMap(MST_LOT_LIST_R.$upd_cntr, Chk01_DtlR.$upd_cntr);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.setStringNE(Chk01_DtlR.$itm_cd_key, src.itm_cd_key());
				dest.setStringNE(Chk01_DtlR.$itm_sub1_key, src.itm_sub1_key());
				dest.setStringNE(Chk01_DtlR.$itm_sub2_key, src.itm_sub2_key());
				dest.setStringNE(Chk01_DtlR.$itm_sub3_key, src.itm_sub3_key());
				dest.setStringNE(Chk01_DtlR.$lot_no_key, src.lot_no_key());
				dest.setStringNE(Chk01_DtlR.$sublot_no_key, src.sublot_no_key());
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * ロット管理情報の削除を行います。<br>
	 */
	public class Del01 extends MSBFL_LotSrch_MC_A.Del01 {
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
				delLot(notErrL);
				delLotList(notErrL);
			}
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			setPegNo(Chk02_DtlR.$peg_no, up0());
		}
		
		/**
		 * 更新前チェック処理を呼び出す
		 * @param up0
		 */
		protected void callThisChk02() {
			MSBFL_LotSrch.Chk02 ope = MSBFL_LotSrch.crtChk02();
			ope.up0().setAll(up0());
			
			ope.exec();
			
			up0().setAll(ope.down0());
		}
		
		/**
		 * 削除処理を実行します
		 * @param up0
		 */
		protected void delLot(MCList<Chk02_DtlR> notErrL) {
			MCList<MST_LOT_R> del = MCList.create(MST_LOT_R.class);
			addAll(del, notErrL, createMap_MST_LOT_R_Chk02_DtlR());

			dbDeleteKey("MSBFL0110_MST_LOT_D01", del, MCQueryApiBuilder.create(MST_LOT_R.create("T")));
		}

		/**
		 * MST_LOT_LISTを削除する。
		 */
		protected void delLotList(MCList<Chk02_DtlR> notErrL) {
			MCList<MST_LOT_LIST_R> lotListL = MCList.create(MST_LOT_LIST_R.class);
			MST_LOT_LIST_R lotListL_t = MST_LOT_LIST_R.create("T");
			MCQueryApiBuilder lotListL_bldr = MCQueryApiBuilder.create(lotListL_t);
			lotListL_bldr.setWhere(lotListL_t.itm_cd.eq(bind("itm_cd")));
			lotListL_bldr.addWhereWithAnd(lotListL_t.itm_sub1.eq(bind("itm_sub1")));
			lotListL_bldr.addWhereWithAnd(lotListL_t.itm_sub2.eq(bind("itm_sub2")));
			lotListL_bldr.addWhereWithAnd(lotListL_t.itm_sub3.eq(bind("itm_sub3")));
			lotListL_bldr.addWhereWithAnd(lotListL_t.lot_no.eq(bind("lot_no")));
			lotListL_bldr.addWhereWithAnd(lotListL_t.sublot_no.eq(bind("sublot_no")));
			dbSelect("MSBFL0110_MST_LOT_LIST_S01", lotListL, lotListL_bldr, notErrL);
			if (!lotListL.isEmpty()) {
				dbDeleteKey("MSBFL0110_MST_LOT_LIST_D01", lotListL, lotListL_bldr);
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		protected void handleSuccess(MCList<Chk02_DtlR> l) {
			dbTran().commit();
			for (Chk02_DtlR r : l) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}
		
		protected void handleEx(Exception e, MCList<Chk02_DtlR> l) {
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
			for (Chk02_DtlR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
		
		protected Map_MST_LOT_R_Chk02_DtlR<MST_LOT_R,Chk02_DtlR> createMap_MST_LOT_R_Chk02_DtlR() {
			return new Map_MST_LOT_R_Chk02_DtlR<MST_LOT_R, Chk02_DtlR>();
		}

		public class Map_MST_LOT_R_Chk02_DtlR<D extends MST_LOT_R, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_LOT_R.$itm_cd, Chk02_DtlR.$itm_cd);
				addColumnPathMap(MST_LOT_R.$itm_sub1, Chk02_DtlR.$itm_sub1);
				addColumnPathMap(MST_LOT_R.$itm_sub2, Chk02_DtlR.$itm_sub2);
				addColumnPathMap(MST_LOT_R.$itm_sub3, Chk02_DtlR.$itm_sub3);
				addColumnPathMap(MST_LOT_R.$lot_no, Chk02_DtlR.$lot_no);
				addColumnPathMap(MST_LOT_R.$sublot_no, Chk02_DtlR.$sublot_no);
			}
		}
		
	}

	//FMCB CUSTOM END
}