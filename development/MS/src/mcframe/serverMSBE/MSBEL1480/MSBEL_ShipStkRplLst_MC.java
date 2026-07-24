package mcframe.serverMSBE.MSBEL1480;

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
import mcframe.serverMSBE.MSBEL1480.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBE.MSBEL1480.Query.*;
import mcframe.serverMSBE.MSBEL5090.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ShipStkRplLst"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ShipStkRplLst_MC extends MSBEL_ShipStkRplLst_MC_A{
	//FMCB CUSTOM START

	protected static final String RTN_STS_TYP_COL = "rtn_sts_typ";
	
	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends MSBEL_ShipStkRplLst_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			MCQueryPlan sql = MSBEL1480_MST_SHIP_STK_RPL_LST_S01();
			executeQuery(down0(), sql, up0());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			for (Srch01_RsltR r : down0()) {
				r.slo_no(r.io_schd_sub_no1());
				r.slo_d_no(r.io_schd_sub_no2());
				r.ship_schd_no(r.io_schd_sub_no3());
			}
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 */
	public class Chk01 extends MSBEL_ShipStkRplLst_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			setErrToRtnStsTyp();
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			if (isNull(notErrL)) {
				return msgL;
			}
			
			MCList<MST_SHIP_STK_RPL_LST_R> selectL = MCList.create(MST_SHIP_STK_RPL_LST_R.class);
			MST_SHIP_STK_RPL_LST_R t1 = MST_SHIP_STK_RPL_LST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t1);
			selectL_bldr.setSelect(t1.batch_data_no);
			selectL_bldr.addSelect(t1.upd_cntr);
			selectL_bldr.addSelect(t1.loc_cd);
			selectL_bldr.addSelect(t1.itm_cd);
			selectL_bldr.addSelect(t1.itm_sub1);
			selectL_bldr.addSelect(t1.itm_sub2);
			selectL_bldr.addSelect(t1.itm_sub3);
			selectL_bldr.addSelect(t1.pack_unit_cd);
			selectL_bldr.setOrderByAsc(selectL_bldr.getBaseDbc().getKeyColumn$());
			notErrL.sort(Chk01_RsltR.$batch_data_no);
			dbSelectKeyForUpdateNoWait("MSBEL1480_MST_SHIP_STK_RPL_LST_S01",
					selectL, selectL_bldr, notErrL);
			
			MCList<MAM_LOC_R> locL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R t2 = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t2);
			locL_bldr.setSelect(t2.loc_cd);
			locL_bldr.addSelect(t2.lg_grp_cd);
			dbSelectKey("MSBEL1480_MAM_LOC_S01",
					locL, locL_bldr, selectL.groupBy(MST_SHIP_STK_RPL_LST_R.$loc_cd));
			MCIndexKey locIdx = locL.createIndex(MAM_LOC_R.$loc_cd);
			MCIndexKey idx = selectL.createIndex(MST_SHIP_STK_RPL_LST_R.$batch_data_no);
			for (Chk01_RsltR r : notErrL) {
				MST_SHIP_STK_RPL_LST_R selectR = selectL.getFirst(idx, r.batch_data_no());
				msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));
				if (!isNull(selectR)) {
					r.loc_cd(selectR.loc_cd());
					r.itm_cd(selectR.itm_cd());
					r.itm_sub1(selectR.itm_sub1());
					r.itm_sub2(selectR.itm_sub2());
					r.itm_sub3(selectR.itm_sub3());
					r.pack_unit_cd(selectR.pack_unit_cd());

					MAM_LOC_R locR = locL.getFirst(locIdx, selectR.loc_cd());
					
					MCMessageList msgDacLocL = checkWritableLocCdDac(r, Chk02_RsltR.$loc_cd);
					MCMessageList msgDacLgL = checkWritableLgGrpCdDac(locR, MAM_LOC_R.$lg_grp_cd);
					if (!msgDacLocL.isEmpty() && !msgDacLgL.isEmpty()) {
						msgL.addAll(msgDacLocL);
						msgL.addAll(msgDacLgL);
					}
				}
			}
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			
			
			for (Chk01_RsltR r : notErrL) {
				setBaseUnitQty(r);
				msgL.addAll(checkDecPlace(r, Chk01_RsltR.$pack_unit_dec_place, Chk01_RsltR.$pack_unit_short_qty));
				msgL.addAll(checkDecPlace(r, Chk01_RsltR.$base_unit_dec_place, Chk01_RsltR.$base_unit_short_qty));
			}
			return msgL;
		}
		
		/**
		 * 基準単位数量を設定する
		 * @param dtlR
		 */
		protected void setBaseUnitQty(Chk01_RsltR dtlR) {
			if (isSame(dtlR.pack_unit_cd(), dtlR.base_unit_cd())) {
				dtlR.base_unit_short_qty(dtlR.pack_unit_short_qty());
			}
			else {
				dtlR.base_unit_short_qty(convToBaseUnit(dtlR.pack_unit_short_qty(),
						dtlR.pack_unit_conv_base_qty(), dtlR.pack_unit_conv_qty(),
						dtlR.base_unit_dec_place(), dtlR.base_unit_rnd_typ()));
			}
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 */
	public class Chk02 extends MSBEL_ShipStkRplLst_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			setErrToRtnStsTyp();
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			MCList<Chk02_RsltR> notErrL = getChkList(up0());
			if (isNull(notErrL)) {
				return msgL;
			}
			
			MCList<MST_SHIP_STK_RPL_LST_R> selectL = MCList.create(MST_SHIP_STK_RPL_LST_R.class);
			MST_SHIP_STK_RPL_LST_R t1 = MST_SHIP_STK_RPL_LST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t1);
			selectL_bldr.setSelect(t1.batch_data_no);
			selectL_bldr.addSelect(t1.upd_cntr);
			selectL_bldr.addSelect(t1.loc_cd);
			selectL_bldr.setOrderByAsc(selectL_bldr.getBaseDbc().getKeyColumn$());
			notErrL.sort(Chk02_RsltR.$batch_data_no);
			dbSelectKeyForUpdateNoWait("MSBEL1480_MST_SHIP_STK_RPL_LST_S02",
					selectL, selectL_bldr, notErrL);
			
			MCList<MAM_LOC_R> locL = MCList.create(MAM_LOC_R.class);
			MAM_LOC_R t2 = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t2);
			locL_bldr.setSelect(t2.loc_cd);
			locL_bldr.addSelect(t2.lg_grp_cd);
			dbSelectKey("MSBEL1480_MAM_LOC_S02", locL,
					locL_bldr, selectL.groupBy(MST_SHIP_STK_RPL_LST_R.$loc_cd));
			MCIndexKey locIdx = locL.createIndex(MAM_LOC_R.$loc_cd);
			MCIndexKey idx = selectL.createIndex(MST_SHIP_STK_RPL_LST_R.$batch_data_no);
			for (Chk02_RsltR r : notErrL) {
				MST_SHIP_STK_RPL_LST_R selectR = selectL.getFirst(idx, r.batch_data_no());
				msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));
				if (!isNull(selectR)) {
					r.loc_cd(selectR.loc_cd());
					MAM_LOC_R locR = locL.getFirst(locIdx, selectR.loc_cd());
					
					MCMessageList msgDacLocL = checkWritableLocCdDac(r, Chk02_RsltR.$loc_cd);
					MCMessageList msgDacLgL = checkWritableLgGrpCdDac(locR, MAM_LOC_R.$lg_grp_cd);
					if (!msgDacLocL.isEmpty() && !msgDacLgL.isEmpty()) {
						msgL.addAll(msgDacLocL);
						msgL.addAll(msgDacLgL);
					}
				}
			}
			
			return msgL;
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 */
	public class Chk03 extends MSBEL_ShipStkRplLst_MC_A.Chk03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			setErrToRtnStsTyp();
			setDown();
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 */
	public class Upd01 extends MSBEL_ShipStkRplLst_MC_A.Upd01 {
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
			reg();
		}
		
		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			setPegNo(Chk01_RsltR.$peg_no, up0());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBEL_ShipStkRplLst.Chk01 ope = MSBEL_ShipStkRplLst.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}
		
		/**
		 * 登録処理を実行する
		 */
		protected void reg() {
			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (isNull(notErrL)) {
				return ;
			}
			
			MCList<MST_SHIP_STK_RPL_LST_R> dbcL = MCList.create(MST_SHIP_STK_RPL_LST_R.class);
			for (Chk01_RsltR r : notErrL) {
				MST_SHIP_STK_RPL_LST_R tmp = MST_SHIP_STK_RPL_LST_R.create();
				tmp.batch_data_no(r.batch_data_no());
				tmp.pack_unit_short_qty(r.pack_unit_short_qty());
				tmp.base_unit_short_qty(r.base_unit_short_qty());
				dbcL.add(tmp);
			}
			
			MST_SHIP_STK_RPL_LST_R t = MST_SHIP_STK_RPL_LST_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSet(t.pack_unit_short_qty);
			dbcL_bldr.addSet(t.base_unit_short_qty);
			dbUpdateKey("MSBEL1480_MST_SHIP_STK_RPL_LST_U01", dbcL, dbcL_bldr);
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
	 * Del01オペレーション.<p>
	 *
	 */
	public class Del01 extends MSBEL_ShipStkRplLst_MC_A.Del01 {
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
			del();
		}
		
		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			setPegNo(Chk02_RsltR.$peg_no, up0());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBEL_ShipStkRplLst.Chk02 ope = MSBEL_ShipStkRplLst.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}
		
		/**
		 * 取消処理を実行する
		 */
		protected void del() {
			MCList<Chk02_RsltR> notErrL = up0().subList(Chk02_RsltR.$err_flg, false);
			if (isNull(notErrL)) {
				return ;
			}

			MCList<MST_SHIP_STK_RPL_LST_R> dbcL = MCList.create(MST_SHIP_STK_RPL_LST_R.class);
			for (Chk02_RsltR r : notErrL) {
				MST_SHIP_STK_RPL_LST_R tmp = MST_SHIP_STK_RPL_LST_R.create();
				tmp.batch_data_no(r.batch_data_no()	);
				dbcL.add(tmp);
			}
			
			dbDeleteKey("MSBEL1480_MST_SHIP_STK_RPL_LST_D01", dbcL,
					MCQueryApiBuilder.create(MST_SHIP_STK_RPL_LST_R.create("T")));
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
	 * Upd02オペレーション.<p>
	 *
	 */
	public class Upd02 extends MSBEL_ShipStkRplLst_MC_A.Upd02 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccessUpd02(up0());
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
			throwUpdErr();
			callShipStkRplService();
			setDown();
		}
		
		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			setPegNo(Chk03_RsltR.$peg_no, up0());
			for (Chk03_RsltR r : up0()) {
				r.setStatus(MCRow.MODIFY);
			}
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MSBEL_ShipStkRplLst.Chk03 ope = MSBEL_ShipStkRplLst.crtChk03();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}
		
		protected void callShipStkRplService() {
			MCList<Chk03_RsltR> notErrL = up0().subList(Chk03_RsltR.$err_flg, false);
			if (isNull(notErrL)) {
				return ;
			}
			
			MSBEL_ShipStkRplService.ShipStkRpl_Ins03 ope = MSBEL_ShipStkRplService.crtShipStkRpl_Ins03();
			ope.up0().screen_flg(true);
			
			addAll(ope.up1(), notErrL, createMap_ShipStkRpl_LstR_Chk03_RsltR());
			ope.exec();
			
			MCIndexKey idx = ope.down0().createIndex(ShipStkRpl_LstR.$batch_data_no);
			for (Chk03_RsltR r : notErrL) {
				ShipStkRpl_LstR rtn = ope.down0().getFirst(idx, r.batch_data_no());
				if (rtn != null) {
					r.rtn_sts_typ(rtn.rtn_sts_typ());
				}
			}
		}
		
		protected Map_ShipStkRpl_LstR_Chk03_RsltR<ShipStkRpl_LstR,Chk03_RsltR> createMap_ShipStkRpl_LstR_Chk03_RsltR() {
			return new Map_ShipStkRpl_LstR_Chk03_RsltR<ShipStkRpl_LstR, Chk03_RsltR>();
		}

		public class Map_ShipStkRpl_LstR_Chk03_RsltR<D extends ShipStkRpl_LstR, S extends Chk03_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipStkRpl_LstR.$batch_data_no, Chk03_RsltR.$batch_data_no);
				addColumnPathMap(ShipStkRpl_LstR.$upd_cntr, Chk03_RsltR.$upd_cntr);
			}
		}
		
		protected void handleSuccessUpd02(MCList<?> l) {
			dbTran().commit();
			for (MCRow r : l) {
				if (r.getBoolean(ERR_FLG_COL)) {
					r.setString(RTN_STS_TYP_COL, MAC_RTN_STS_TYP.ERR.value());
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
	
	//////////////////////////////////////////////////////////////////////
	// 共通処理 //
	////////////
	protected void handleSuccess(MCList<?> l) {
		dbTran().commit();
		for (MCRow r : l) {
			if (!r.getBoolean(ERR_FLG_COL)) {
				r.setString(RTN_STS_TYP_COL, MAC_RTN_STS_TYP.OK.value());
			}
		}
	}
	
	protected void handleEx(Exception e, MCList<?> l) {
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
		l.setString(RTN_STS_TYP_COL, MAC_RTN_STS_TYP.ERR.value());
	}

	//FMCB CUSTOM END
}