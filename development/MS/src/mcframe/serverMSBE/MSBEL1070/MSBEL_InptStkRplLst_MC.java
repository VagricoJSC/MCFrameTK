package mcframe.serverMSBE.MSBEL1070;

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
import mcframe.serverMSBE.MSBEL1070.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBE.MSBEL1070.Query.*;
import mcframe.serverMSBE.MSBEL5080.*;
import  mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.commonCore.param.MCParam;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_InptStkRplLst"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_InptStkRplLst_MC extends MSBEL_InptStkRplLst_MC_A{
	//FMCB CUSTOM START

	protected static final String RTN_STS_TYP_COL = "rtn_sts_typ";
	
	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends MSBEL_InptStkRplLst_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			MCQueryPlan sql = MSBEL1070_MST_INPT_STK_RPL_LST_S01();
			executeQuery(down0(), sql, up0());
			selectAltGrp();
		}
		
		protected void selectAltGrp() {
			// 代替品目のグループ単位で検索する
			if (isNull(up0())) {
				return;
			}
			MCList<Srch01_RsltR> altL = down0().subList(r->!isNull(r.alt_grp_id()));
			if (isNull(altL)) {
				return ;
			}
			MCList<Srch01_RsltR> l = altL.createInstance();
			executeQuery(l, MSBEL1070_MST_INPT_STK_RPL_LST_S02(), altL.groupBy(Srch01_RsltR.$alt_grp_id), up0());
			
			HashSet<String> dataMap = new HashSet<>();
			for (Srch01_RsltR r : down0()) {
				dataMap.add(r.batch_data_no());
			}
			
			boolean sortFlg = false;
			for (Srch01_RsltR r : l) {
				if (!dataMap.contains(r.batch_data_no())) {
					dataMap.add(r.batch_data_no());
					down0().add(r);
					sortFlg = true;
				}
			}
			
			if (sortFlg) {
				// MSBEL1070_MST_INPT_STK_RPL_LST_S01のorderby句と合わせること
				MCSortPolicy sp = new MCSortPolicy();
				sp.add(SortType.ASC, Srch01_RsltR.$schd_dt);
				sp.add(SortType.ASC_NULL_AHEAD, Srch01_RsltR.$alt_grp_cd);
				sp.add(SortType.ASC_NULL_AHEAD, Srch01_RsltR.$alt_grp_id);
				sp.add(SortType.ASC, Srch01_RsltR.$itm_cd);
				sp.add(SortType.ASC, Srch01_RsltR.$itm_sub1);
				sp.add(SortType.ASC, Srch01_RsltR.$itm_sub2);
				sp.add(SortType.ASC, Srch01_RsltR.$itm_sub3);
				sp.add(SortType.ASC, Srch01_RsltR.$lot_no);
				sp.add(SortType.ASC, Srch01_RsltR.$sublot_no);
				down0().sort(sp);
			}
			
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			for (Srch01_RsltR r : down0()) {
				if (MSC_IO_SCHD_SUB_TYP.isITM_ORD_NO(r.io_schd_sub_typ1())) {
					r.itm_ord_no(r.io_schd_sub_no1());
				}
				if (MSC_IO_SCHD_SUB_TYP.isMFG_INST_NO(r.io_schd_sub_typ3())) {
					r.mfg_inst_no(r.io_schd_sub_no3());
				}
				
				// 有効成分関連項目
				if (r.cont_fctr_flg()) {
					// 実際有効成分の算出
					MCNumber actContQty = convToContFctrUnit(r.short_qty(), r.act_cont_fctr(), 
							r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ());
					r.act_cont_qty(actContQty);
					
					// 標準有効成分の算出
					MCNumber stdContQty = convToContFctrUnit(r.short_qty(), r.std_cont_fctr(), 
							r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ());
					r.std_cont_qty(stdContQty);
				}
			}

		}
		
	}
	
	
	/**
	 * Chk01オペレーション.<p>
	 *
	 */
	public class Chk01 extends MSBEL_InptStkRplLst_MC_A.Chk01 {
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
			
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			if (isNull(notErrL)) {
				return msgL;
			}
			
			MCList<MST_INPT_STK_RPL_LST_R> selectL = MCList.create(MST_INPT_STK_RPL_LST_R.class);
			MST_INPT_STK_RPL_LST_R t = MST_INPT_STK_RPL_LST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.batch_data_no);
			selectL_bldr.addSelect(t.upd_cntr);
			selectL_bldr.addSelect(t.loc_cd);
			selectL_bldr.addSelect(t.itm_cd);
			selectL_bldr.addSelect(t.itm_sub1);
			selectL_bldr.addSelect(t.itm_sub2);
			selectL_bldr.addSelect(t.itm_sub3);
			selectL_bldr.setOrderByAsc(selectL_bldr.getBaseDbc().getKeyColumn$());
			notErrL.sort(Chk01_RsltR.$batch_data_no);
			dbSelectKeyForUpdateNoWait("MSBEL1070_MST_INPT_STK_RPL_LST_S01", selectL, selectL_bldr, notErrL);
			
			MCIndexKey idx = selectL.createIndex(MST_INPT_STK_RPL_LST_R.$batch_data_no);
			for (Chk01_RsltR r : notErrL) {
				MST_INPT_STK_RPL_LST_R selectR = selectL.getFirst(idx, r.batch_data_no());
				msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));
				if (!isNull(selectR)) {
					r.loc_cd(selectR.loc_cd());
					r.itm_cd(selectR.itm_cd());
					r.itm_sub1(selectR.itm_sub1());
					r.itm_sub2(selectR.itm_sub2());
					r.itm_sub3(selectR.itm_sub3());
					msgL.addAll(checkWritableLocCdDac(r, Chk02_RsltR.$loc_cd));
				}
			}
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			
			for (Chk01_RsltR r : notErrL) {
				msgL.addAll(checkDecPlace(r, Chk01_RsltR.$dec_place, Chk01_RsltR.$short_qty));
			}
			
			
			return msgL;
		}
		
		protected void setGrpErrFlg() {
			String[] grpKeys = {Chk01_RsltR.$alt_grp_id};
			setGrpErrFlgByKey(up0().subList(r -> !isNull(r.alt_grp_id())), grpKeys, Chk01_RsltR.$err_flg);
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
		
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 */
	public class Chk02 extends MSBEL_InptStkRplLst_MC_A.Chk02 {
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
			
			MCList<Chk02_RsltR> notErrL = getChkList(up0());
			if (isNull(notErrL)) {
				return msgL;
			}
			
			MCList<MST_INPT_STK_RPL_LST_R> selectL = MCList.create(MST_INPT_STK_RPL_LST_R.class);
			MST_INPT_STK_RPL_LST_R t = MST_INPT_STK_RPL_LST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.batch_data_no);
			selectL_bldr.addSelect(t.upd_cntr);
			selectL_bldr.addSelect(t.loc_cd);
			selectL_bldr.setOrderByAsc(selectL_bldr.getBaseDbc().getKeyColumn$());
			notErrL.sort(Chk02_RsltR.$batch_data_no);
			dbSelectKeyForUpdateNoWait("MSBEL1070_MST_INPT_STK_RPL_LST_S02", selectL, selectL_bldr, notErrL);
			
			MCIndexKey idx = selectL.createIndex(MST_INPT_STK_RPL_LST_R.$batch_data_no);
			for (Chk02_RsltR r : notErrL) {
				MST_INPT_STK_RPL_LST_R selectR = selectL.getFirst(idx, r.batch_data_no());
				msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));
				if (!isNull(selectR)) {
					r.loc_cd(selectR.loc_cd());
					msgL.addAll(checkWritableLocCdDac(r, Chk02_RsltR.$loc_cd));
				}
			}
			
			return msgL;
		}
		
		protected void setGrpErrFlg() {
			String[] grpKeys = {Chk02_RsltR.$alt_grp_id};
			setGrpErrFlgByKey(up0().subList(r -> !isNull(r.alt_grp_id())), grpKeys, Chk02_RsltR.$err_flg);
		}

		protected void setDown() {
			down0().setAll(up0());
		}
		
	}
	
	/**
	 * Chk03オペレーション.<p>
	 *
	 */
	public class Chk03 extends MSBEL_InptStkRplLst_MC_A.Chk03 {
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
		
		protected void setGrpErrFlg() {
			String[] grpKeys = {Chk03_RsltR.$alt_grp_id};
			setGrpErrFlgByKey(up0().subList(r -> !isNull(r.alt_grp_id())), grpKeys,
					Chk03_RsltR.$err_flg);
		}

		protected void setDown() {
			down0().setAll(up0());
		}
		
	}
	
	
	/**
	 * Upd01オペレーション.<p>
	 *
	 */
	public class Upd01 extends MSBEL_InptStkRplLst_MC_A.Upd01 {
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
			MSBEL_InptStkRplLst.Chk01 ope = MSBEL_InptStkRplLst.crtChk01();
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
			
			MCList<MST_INPT_STK_RPL_LST_R> dbcL = MCList.create(MST_INPT_STK_RPL_LST_R.class);
			for (Chk01_RsltR r : notErrL) {
				MST_INPT_STK_RPL_LST_R tmp = MST_INPT_STK_RPL_LST_R.create();
				tmp.batch_data_no(r.batch_data_no());
				tmp.short_qty(r.short_qty());
				tmp.alt_itm_fix_flg(r.alt_itm_fix_flg());
				dbcL.add(tmp);
			}

			MST_INPT_STK_RPL_LST_R t = MST_INPT_STK_RPL_LST_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSet(t.short_qty);
			dbcL_bldr.addSet(t.alt_itm_fix_flg);
			dbUpdateKey("MSBEL1070_MST_INPT_STK_RPL_LST_U01", dbcL, dbcL_bldr);
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
		
		@SuppressWarnings("unchecked")
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();

			List<MCList<Chk01_RsltR>> list = splitUp(up0(), getSplitRowCount(), Chk01_RsltR.$alt_grp_id);
			for (MCList<Chk01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_RsltR> up0L = ((MCList<Chk01_RsltR>) ope.up(0));
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
		
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 */
	public class Del01 extends MSBEL_InptStkRplLst_MC_A.Del01 {
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
			MSBEL_InptStkRplLst.Chk02 ope = MSBEL_InptStkRplLst.crtChk02();
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

			MCList<MST_INPT_STK_RPL_LST_R> dbcL = MCList.create(MST_INPT_STK_RPL_LST_R.class);
			for (Chk02_RsltR r : notErrL) {
				MST_INPT_STK_RPL_LST_R tmp = MST_INPT_STK_RPL_LST_R.create();
				tmp.batch_data_no(r.batch_data_no()	);
				dbcL.add(tmp);
			}
			
			dbDeleteKey("MSBEL1070_MST_INPT_STK_RPL_LST_D01", dbcL,
					MCQueryApiBuilder.create(MST_INPT_STK_RPL_LST_R.create("T")));
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
		
		@SuppressWarnings("unchecked")
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();

			List<MCList<Chk02_RsltR>> list = splitUp(up0(), getSplitRowCount(), Chk02_RsltR.$alt_grp_id);
			for (MCList<Chk02_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk02_RsltR> up0L = ((MCList<Chk02_RsltR>) ope.up(0));
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
		
		
	}
	
	/**
	 * Upd02オペレーション.<p>
	 *
	 */
	public class Upd02 extends MSBEL_InptStkRplLst_MC_A.Upd02 {
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
			callInptStkRplService();
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
			MSBEL_InptStkRplLst.Chk03 ope = MSBEL_InptStkRplLst.crtChk03();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}
		
		protected void callInptStkRplService() {
			MCList<Chk03_RsltR> notErrL = up0().subList(Chk03_RsltR.$err_flg, false);
			if (isNull(notErrL)) {
				return ;
			}
			
			MSBEL_InptStkRplService.InptStkRpl_Ins03 ope = MSBEL_InptStkRplService.crtInptStkRpl_Ins03();
			ope.up0().screen_flg(true);
			addAll(ope.up1(), notErrL, createMap_InptStkRpl_LstR_Chk03_RsltR());
			ope.exec();
			
			MCIndexKey idx = ope.down0().createIndex(InptStkRpl_LstR.$batch_data_no);
			for (Chk03_RsltR r : notErrL) {
				InptStkRpl_LstR rtn = ope.down0().getFirst(idx, r.batch_data_no());
				if (rtn != null) {
					r.rtn_sts_typ(rtn.rtn_sts_typ());
				}
			}
			
		}
		protected Map_InptStkRpl_LstR_Chk03_RsltR<InptStkRpl_LstR,Chk03_RsltR> createMap_InptStkRpl_LstR_Chk03_RsltR() {
			return new Map_InptStkRpl_LstR_Chk03_RsltR<InptStkRpl_LstR, Chk03_RsltR>();
		}
		public class Map_InptStkRpl_LstR_Chk03_RsltR<D extends InptStkRpl_LstR, S extends Chk03_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InptStkRpl_LstR.$batch_data_no, Chk03_RsltR.$batch_data_no);
				addColumnPathMap(InptStkRpl_LstR.$upd_cntr, Chk03_RsltR.$upd_cntr);
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
	
	protected <T extends MCRow> List<MCList<T>> splitUp(MCList<T> list, int max, String altGrpIdCol) {
		List<MCList<T>> ret = new ArrayList<>();

		MCList<T> tmp = list.createInstance();
		for (MCList<T> grp : list.groupList(altGrpIdCol)) {
			// 分割条件がnullの行は「１スレッドあたりの最大件数」に従って1件1件追加する
			if (isNull(grp.get(0).getString(altGrpIdCol))) {
				for (T r : grp) {
					if (tmp.size() >= max) {
						ret.add(tmp);
						tmp = list.createInstance();
					}
					tmp.add(r);
				}
			}
			// 分割条件がnullでない行はグループごとに追加する
			else {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = list.createInstance();
				}
				tmp.addAll(grp);
			}
		}
		if (!tmp.isEmpty()) {
			ret.add(tmp);
		}
		return ret;
	}

	//FMCB CUSTOM END
}