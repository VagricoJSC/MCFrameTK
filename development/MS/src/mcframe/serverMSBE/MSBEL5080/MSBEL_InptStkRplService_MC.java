package mcframe.serverMSBE.MSBEL5080;

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
import mcframe.serverMSBE.MSBEL5080.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBE.MSBEL5080.Query.*;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.requester.MCServerThreadManager;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import mcframe.serverMSBE.MSBEL5040.*;
import mcframe.serverMSBE.MSBEL5200.*;
import mcframe.commonFXUC.FXUCC0090.FXUCC_RowMapperWith;
import mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverFXUC.FXUCL0030.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_InptStkRplService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_InptStkRplService_MC extends MSBEL_InptStkRplService_MC_A{
	//FMCB CUSTOM START

	/**
	 * InptStkRpl_Ins01オペレーション.<p>
	 *
	 */
	public class InptStkRpl_Ins01 extends MSBEL_InptStkRplService_MC_A.InptStkRpl_Ins01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			if (isInvalidUpParam()) {
				return ;
			}
			editUp();
			delInptStkRplLst();
			MCList<InptStkRpl_DtlR> dtlL = getDtlL(up0(), up1());
			callInptStkRplService(dtlL);
		}
		
		protected boolean isInvalidUpParam() {
			boolean boo = isNull(up1());
			boo = boo || isNullOr(up0().dt_fr(), up0().dt_to());
			return boo;
		}
		
		protected void editUp() {
			if (up0().opn_flg()) {
				up0().addStringColumn("w_opn", MSC_IO_SCHD_STS_TYP.OPN.value());
			}
			if (up0().ord_sav_flg()) {
				up0().addStringColumn("w_ord_sav", MSC_IO_SCHD_STS_TYP.ORD_SAV.value());
			}
			if (up0().fix_flg()) {
				up0().addStringColumn("w_fix", MSC_IO_SCHD_STS_TYP.FIX.value());
			}
			if (up0().schd_flg()) {
				up0().addStringColumn("w_schd", MSC_IO_SCHD_STS_TYP.SCHD.value());
			}
			if (up0().mfg_sav_flg()) {
				up0().addStringColumn("w_mfg_sav", MSC_IO_SCHD_STS_TYP.MFG_SAV.value());
			}
			if (up0().ord_flg()) {
				up0().addStringColumn("w_ord", MSC_IO_SCHD_STS_TYP.ORD.value());
			}
			if (up0().stt_flg()) {
				up0().addStringColumn("w_stt", MSC_IO_SCHD_STS_TYP.STT.value());
			}
			
		}
		
		protected void delInptStkRplLst() {
			MSBEL_InptStkRplService.InptStkRpl_LstDel01 ope = MSBEL_InptStkRplService.crtInptStkRpl_LstDel01();
			ope.up0().setAll(up1());
			ope.exec();
			
			down0().lst_del_cnt(ope.down0().lst_del_cnt());
		}
		
		protected void callInptStkRplService(MCList<InptStkRpl_DtlR> dtlL) {
			if (isNull(dtlL)) {
				return ;
			}
			
			List<MSBEL_InptStkRplService.InptStkRpl_Ins02> opeL = new ArrayList<>();
			for (MCList<InptStkRpl_DtlR> lst : getThrdGrpList(dtlL)) {
				MSBEL_InptStkRplService.InptStkRpl_Ins02 o = MSBEL_InptStkRplService.crtInptStkRpl_Ins02();
				MCRow.copyvalue(o.up0(), up0());
				o.up1().addAll(lst);
				opeL.add(o);
			}

			// 件数の降順に並び替え
			Collections.sort(opeL, new Comparator<MSBEL_InptStkRplService.InptStkRpl_Ins02>() {
				public int compare(
						MSBEL_InptStkRplService.InptStkRpl_Ins02 o1, MSBEL_InptStkRplService.InptStkRpl_Ins02 o2) {
					int
						sum1 = o1.up1().sum(InptStkRpl_DtlR.$total_cnt).intValue(),
						sum2 = o2.up1().sum(InptStkRpl_DtlR.$total_cnt).intValue();
					return (sum1 - sum2) * -1;
				}
			});
			
			if (!opeL.isEmpty()) {
				MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
			}
			
			
			MCNumber xfrDelCnt = MCNumber.ZERO;
			MCNumber inptIoSchdCnt = MCNumber.ZERO;
			MCNumber lstCrtCnt = MCNumber.ZERO;
			MCNumber xfrCrtSuccessCnt = MCNumber.ZERO;
			MCNumber xfrCrtErrorCnt = MCNumber.ZERO;
			MCNumber lstDelOfXfrCrtCnt = MCNumber.ZERO;
			for (MSBEL_InptStkRplService.InptStkRpl_Ins02 ope : opeL) {
				xfrDelCnt = xfrDelCnt.add(nvl(ope.down0().xfr_del_cnt(), MCNumber.ZERO));
				inptIoSchdCnt = inptIoSchdCnt.add(nvl(ope.down0().inpt_io_schd_cnt(), MCNumber.ZERO));
				lstCrtCnt = lstCrtCnt.add(nvl(ope.down0().lst_crt_cnt(), MCNumber.ZERO));
				xfrCrtSuccessCnt = xfrCrtSuccessCnt.add(nvl(ope.down0().xfr_crt_success_cnt(), MCNumber.ZERO));
				xfrCrtErrorCnt = xfrCrtErrorCnt.add(nvl(ope.down0().xfr_crt_error_cnt(), MCNumber.ZERO));
				lstDelOfXfrCrtCnt = lstDelOfXfrCrtCnt.add(nvl(ope.down0().lst_del_of_xfr_crt_cnt(), MCNumber.ZERO));
			}
			down0().xfr_del_cnt(xfrDelCnt);
			down0().inpt_io_schd_cnt(inptIoSchdCnt);
			down0().lst_crt_cnt(lstCrtCnt);
			down0().xfr_crt_success_cnt(xfrCrtSuccessCnt);
			down0().xfr_crt_error_cnt(xfrCrtErrorCnt);
			down0().lst_del_of_xfr_crt_cnt(lstDelOfXfrCrtCnt);
			
		}
		
	}
	/**
	 * InptStkRpl_Ins02オペレーション.<p>
	 *
	 */
	public class InptStkRpl_Ins02 extends MSBEL_InptStkRplService_MC_A.InptStkRpl_Ins02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			if (isNull(up1())) {
				return ;
			}
			delXfrSchd();
			MCList<InptStkRpl_LstR> rplL = crtInptStkRplLst();
			crtXfrSchd(rplL);
			
		}
		
		protected void delXfrSchd() {
			if (!up0().xfr_schd_del_flg()) {
				return ;
			}
			
			MSBEL_InptStkRplService.InptStkRpl_XfrDel01 ope = MSBEL_InptStkRplService.crtInptStkRpl_XfrDel01();
			MCRow.copyvalue(ope.up0(), up0());
			ope.up1().addAll(up1());
			ope.exec();
			
			down0().xfr_del_cnt(ope.down0().xfr_del_cnt());
		}
		
		protected MCList<InptStkRpl_LstR> crtInptStkRplLst() {
			MSBEL_InptStkRplService.InptStkRpl_LstIns01 ope = MSBEL_InptStkRplService.crtInptStkRpl_LstIns01();
			MCRow.copyvalue(ope.up0(), up0());
			ope.up1().addAll(up1());
			ope.exec();
			
			down0().inpt_io_schd_cnt(ope.down1().inpt_io_schd_cnt());
			down0().lst_crt_cnt(ope.down1().lst_crt_cnt());
			return ope.down0();
		}
		
		protected void crtXfrSchd(MCList<InptStkRpl_LstR> rplL) {
			if (!up0().xfr_schd_crt_flg() || isNull(rplL)) {
				return ;
			}
			
			MSBEL_InptStkRplService.InptStkRpl_XfrIns01 ope = MSBEL_InptStkRplService.crtInptStkRpl_XfrIns01();
			MCRow.copyvalue(ope.up0(), up0());
			ope.up1().addAll(rplL);
			ope.exec();
			
			down0().lst_del_of_xfr_crt_cnt(ope.down1().lst_del_of_xfr_crt_cnt());
			down0().xfr_crt_success_cnt(ope.down1().xfr_crt_success_cnt());
			down0().xfr_crt_error_cnt(ope.down1().xfr_crt_error_cnt());
			
		}
		
	}
	/**
	 * InptStkRpl_Ins03オペレーション.<p>
	 *
	 */
	public class InptStkRpl_Ins03 extends MSBEL_InptStkRplService_MC_A.InptStkRpl_Ins03 {
		@Override
		protected void call() {
			try {
				super.call();
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			if (isInvalidUpParam()) {
				return ;
			}
			
			MCList<MST_INPT_STK_RPL_LST_R> rplL
			 	= srchInptStkRplLst();
			chkInptStkRplLst(rplL);
			crtXfrSchd(rplL);
			
		}
		
		protected boolean isInvalidUpParam() {
			boolean boo = isNull(up0());
			return boo;
		}
		
		protected MCList<MST_INPT_STK_RPL_LST_R> srchInptStkRplLst() {
			MCList<MST_INPT_STK_RPL_LST_R> dbcL = MCList.create(MST_INPT_STK_RPL_LST_R.class);
			MST_INPT_STK_RPL_LST_R t = MST_INPT_STK_RPL_LST_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.batch_data_no);
			dbcL_bldr.addSelect(t.loc_cd);
			dbcL_bldr.addSelect(t.str_ln_cd);
			dbcL_bldr.addSelect(t.wg_cd);
			dbcL_bldr.addSelect(t.itm_cd);
			dbcL_bldr.addSelect(t.itm_sub1);
			dbcL_bldr.addSelect(t.itm_sub2);
			dbcL_bldr.addSelect(t.itm_sub3);
			dbcL_bldr.addSelect(t.alt_grp_cd);
			dbcL_bldr.addSelect(t.alt_grp_id);
			dbcL_bldr.addSelect(t.schd_dt);
			dbSelectKey("MSBEL5080_MST_INPT_STK_RPL_LST_S01", dbcL, dbcL_bldr, up1());
			
			return dbcL;
		}
		
		protected void chkInptStkRplLst(MCList<MST_INPT_STK_RPL_LST_R> dbcL) {
			MCIndexKey  idxkey = dbcL.createIndex(MST_INPT_STK_RPL_LST_R.$batch_data_no);
			
			MCMessageList msgL = new MCMessageList();
			for (InptStkRpl_LstR r : up1()) {
				MST_INPT_STK_RPL_LST_R selectR = dbcL.getFirst(idxkey, r.batch_data_no());
				if (isNull(selectR)) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
						msgL.addAll(checkUpdCntrNE(r, InptStkRpl_LstR.$upd_cntr, selectR));
				}
				else {
					selectR.setAttributes(r);
					selectR.upd_cntr(r.upd_cntr());
				}
			}
			if (up0().screen_flg()) {
				MCMessagePool.addAll(msgL);
			}
			
		}
		
		protected void crtXfrSchd(MCList<MST_INPT_STK_RPL_LST_R> dbcL) {
			if (isNull(dbcL)) {
				return ;
			}
			
			MCIndexKey idx = dbcL.createIndex(MST_INPT_STK_RPL_LST_R.$itm_cd,
					MST_INPT_STK_RPL_LST_R.$itm_sub1, MST_INPT_STK_RPL_LST_R.$itm_sub2,
					MST_INPT_STK_RPL_LST_R.$itm_sub3, MST_INPT_STK_RPL_LST_R.$wg_cd);
			
			List<MSBEL_InptStkRplService.InptStkRpl_XfrIns01> opeL = new ArrayList<>();
			for (MCList<InptStkRpl_DtlR> grpL : getGrpL(dbcL)) {
				MSBEL_InptStkRplService.InptStkRpl_XfrIns01 o = MSBEL_InptStkRplService.crtInptStkRpl_XfrIns01();
				o.up0().screen_flg(up0().screen_flg());
				for (InptStkRpl_DtlR dtlR : grpL) {
					addAll(o.up1(), dbcL.subList(idx, dtlR.toArray(idx.getKeys())),
							createMap_InptStkRpl_LstR_MST_INPT_STK_RPL_LST_R());
				}
				opeL.add(o);
			}

			// 件数の降順に並び替え
			Collections.sort(opeL, new Comparator<MSBEL_InptStkRplService.InptStkRpl_XfrIns01>() {
				public int compare(
						MSBEL_InptStkRplService.InptStkRpl_XfrIns01 o1, MSBEL_InptStkRplService.InptStkRpl_XfrIns01 o2) {
					int
						sum1 = o1.up1().size(),
						sum2 = o2.up1().size();
					return (sum1 - sum2) * -1;
				}
			});
			
			if (!opeL.isEmpty()) {
				MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
			}
			
			// 処理結果
			MCIndexKey upidx = up1().createIndex(InptStkRpl_LstR.$batch_data_no);
			for (MSBEL_InptStkRplService.InptStkRpl_XfrIns01 ope : opeL) {
				for (InptStkRpl_LstR r : ope.down0()) {
					InptStkRpl_LstR upR = up1().getFirst(upidx, r.batch_data_no());
					upR.rtn_sts_typ(r.rtn_sts_typ());
				}
			}
			
		}
		
		/**
		 * まとめ単位の件数を算出し、マルチスレッド実行する処理単位のグループを取得する
		 */
		protected MCList<InptStkRpl_DtlR>[] getGrpL(MCList<MST_INPT_STK_RPL_LST_R> dbcL) {
			String[] grpKey = {
					InptStkRpl_DtlR.$itm_cd, InptStkRpl_DtlR.$itm_sub1,
					InptStkRpl_DtlR.$itm_sub2, InptStkRpl_DtlR.$itm_sub3,
					InptStkRpl_DtlR.$alt_grp_cd, InptStkRpl_DtlR.$wg_cd
			};
			MCList<InptStkRpl_DtlR> dtlL = MCList.create(InptStkRpl_DtlR.class);
			for (MCList<MST_INPT_STK_RPL_LST_R> lst : dbcL.groupList(grpKey)) {
				MST_INPT_STK_RPL_LST_R r = lst.get(0);

				InptStkRpl_DtlR dtlR = dtlL.createRow();
				dtlR.itm_cd(r.itm_cd());
				dtlR.itm_sub1(r.itm_sub1());
				dtlR.itm_sub2(r.itm_sub2());
				dtlR.itm_sub3(r.itm_sub3());
				dtlR.alt_grp_cd(r.alt_grp_cd());
				dtlR.wg_cd(r.wg_cd());
				dtlR.total_cnt(lst.size());
				dtlL.add(dtlR);
				continue;	// grpKeyごとの件数が欲しかったので
			}
			
			return getThrdGrpList(dtlL);
		}
		
		protected void setDown() {
			down0().setAll(up1());
		}
	}
	
	
	/**
	 * InptStkRpl_Del01オペレーション.<p>
	 *
	 */
	public class InptStkRpl_Del01 extends MSBEL_InptStkRplService_MC_A.InptStkRpl_Del01 {
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			if (isInvalidUpParam()) {
				return ;
			}
			
			// 不足情報の削除
			delInptStkRplLst();
			
			// 移送予定の削除
			MCList<InptStkRpl_DtlR> dtlL = getDtlL(up0(), up1());
			callDelXfrSchdService(dtlL);
			
		}
		
		protected boolean isInvalidUpParam() {
			boolean boo = isNull(up1());
			boo = boo || isNullOr(up0().dt_fr(), up0().dt_to());
			return boo;
		}
		

		protected void delInptStkRplLst() {
			if (!up0().inpt_stk_rpl_lst_del_flg()) {
				return ;
			}
			
			MSBEL_InptStkRplService.InptStkRpl_LstDel01 ope = MSBEL_InptStkRplService.crtInptStkRpl_LstDel01();
			ope.up0().setAll(up1());
			ope.exec();
			
			down0().lst_del_cnt(ope.down0().lst_del_cnt());
		}
		
		protected void callDelXfrSchdService(MCList<InptStkRpl_DtlR> dtlL) {
			if (!up0().xfr_schd_del_flg() || isNull(dtlL)) {
				return ;
			}
			
			List<MSBEL_InptStkRplService.InptStkRpl_XfrDel01> opeL = new ArrayList<>();
			for (MCList<InptStkRpl_DtlR> lst : getThrdGrpList(dtlL)) {
				MSBEL_InptStkRplService.InptStkRpl_XfrDel01 o = MSBEL_InptStkRplService.crtInptStkRpl_XfrDel01();
				MCRow.copyvalue(o.up0(), up0());
				o.up1().addAll(lst);
				opeL.add(o);
			}

			// 件数の降順に並び替え
			Collections.sort(opeL, new Comparator<MSBEL_InptStkRplService.InptStkRpl_XfrDel01>() {
				public int compare(
						MSBEL_InptStkRplService.InptStkRpl_XfrDel01 o1, MSBEL_InptStkRplService.InptStkRpl_XfrDel01 o2) {
					int
						sum1 = o1.up1().sum(InptStkRpl_DtlR.$total_cnt).intValue(),
						sum2 = o2.up1().sum(InptStkRpl_DtlR.$total_cnt).intValue();
					return (sum1 - sum2) * -1;
				}
			});
			
			if (!opeL.isEmpty()) {
				MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
			}
			
			// 処理結果
			MCNumber cnt = MCNumber.ZERO;
			for (MSBEL_InptStkRplService.InptStkRpl_XfrDel01 ope : opeL) {
				cnt = cnt.add(nvl(ope.down0().xfr_del_cnt(), MCNumber.ZERO));
			}
			down0().xfr_del_cnt(cnt);
			
		}
		
	}
	/**
	 * InptStkRpl_LstIns01オペレーション.<p>
	 *
	 */
	public class InptStkRpl_LstIns01 extends MSBEL_InptStkRplService_MC_A.InptStkRpl_LstIns01 {
		
		protected MCDate _execTm = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MCList<MST_INPT_STK_RPL_LST_R> 
				inptL = MCList.create(MST_INPT_STK_RPL_LST_R.class),
				rplL = MCList.create(MST_INPT_STK_RPL_LST_R.class);
			
			insItmLocWk(up1());
			setExecDt();
			srchInptL(inptL);
			delItmLocWk();
			adjustInptL(inptL);
			sortForAlloc(inptL);
			MSBEL_AllocMngService.Alloc_Srch01 allocOpe = alloc(inptL, false);
			addInptStkRplLst(inptL, allocOpe, rplL, false);
			insInptStkRplLst(rplL);
			setDown(inptL, rplL);
			dbTran().commit();
			
		}
		
		/**
		 * 不足情報を追加する
		 */
		protected void insInptStkRplLst(MCList<MST_INPT_STK_RPL_LST_R> rplL) {
			if (isNull(rplL)) {
				return ;
			}
			
			doSeqCache(MSC_NUM_SYS_TYP.INPTSTKRPL, rplL.size());
			for (MST_INPT_STK_RPL_LST_R r : rplL) {
				r.batch_data_no(getStrSeq(MSC_NUM_SYS_TYP.INPTSTKRPL));
				r.batch_log_no(up0().batch_log_no());
				r.exec_tm(_execTm);
			}
			dbInsertEx("MSBEL5080_MST_INPT_STK_RPL_LST_I01", rplL,
					MCQueryApiBuilder.create(MST_INPT_STK_RPL_LST_R.create("T")));
			
		}
		
		protected void setDown(MCList<MST_INPT_STK_RPL_LST_R> inptL,
				MCList<MST_INPT_STK_RPL_LST_R> rplL) {
			
			addAll(down0(), rplL, createMap_InptStkRpl_LstR_MST_INPT_STK_RPL_LST_R());
			down1().inpt_io_schd_cnt(inptL.size());
			down1().lst_crt_cnt(rplL.size());
		}
		
		protected void setExecDt() {
			_execTm = MCDate.now().trunc(MCDateFieldType.MINUTE);
		}
		
		/**
		 * 投入の受払予定を取得する
		 */
		protected void srchInptL(MCList<MST_INPT_STK_RPL_LST_R> inptL) {
			MCList<MST_INPT_STK_RPL_LST_R> tmpL = MCList.create(MST_INPT_STK_RPL_LST_R.class);
			if (up0().fix_flg() || up0().schd_flg() || up0().mfg_sav_flg() || up0().ord_flg()
					|| up0().stt_flg()) {
				executeQuery(tmpL, MSBEL5080_MST_IO_SCHD_S02(), up0());
				inptL.addAll(tmpL);
			}
			if (up0().opn_flg() || up0().ord_sav_flg()) {
				executeQuery(tmpL, MSBEL5080_MST_ORD_IO_SCHD_S02(), up0());
				inptL.addAll(tmpL);
			}
		}
		
		/**
		 * 投入の受払予定を引当処理用に加工する
		 */
		protected void adjustInptL(MCList<MST_INPT_STK_RPL_LST_R> inptL) {
			// 自給品除外
			inptL.setAll(inptL.subList(r->!MAC_PROV_TYP.isSS(r.prov_typ())));
			
			for (MST_INPT_STK_RPL_LST_R inptR : inptL) {
				// 在庫識別区分・在庫取引先・在庫着荷先
				setStkIdTypStkBp(inptR);
				// 有効期限
				setVldDt(inptR);
			}
			
			// 代替グループＩＤの設定
			setAltGrpId(inptL);
			
		}
		
		protected void setStkIdTypStkBp(MST_INPT_STK_RPL_LST_R r) {
			if (!r.alloc_flg()) {
				r.stk_id_typ(null);
				r.stk_bp_cd(null);
				r.stk_arrv_bp_cd(null);
			}
		}
		
		protected void setVldDt(MST_INPT_STK_RPL_LST_R r) {
			r.vld_dt_fr(r.schd_dt());
		}
		
		protected void setAltGrpId(MCList<MST_INPT_STK_RPL_LST_R> inptL) {
			MCList<MST_INPT_STK_RPL_LST_R> altInptL = inptL.subList(r->!isNull(r.alt_grp_cd()));
			
			if (isNull(altInptL)) {
				return ;
			}
			
			MCList<MST_INPT_STK_RPL_LST_R>[] altL = altInptL.groupList(
					MST_INPT_STK_RPL_LST_R.$io_schd_sub_no1, // 品目オーダＮＯ
					MST_INPT_STK_RPL_LST_R.$oper_ord_no,
					MST_INPT_STK_RPL_LST_R.$oper_inst_no,
					MST_INPT_STK_RPL_LST_R.$alt_grp_cd,
					MST_INPT_STK_RPL_LST_R.$alt_grp_seq,
					MST_INPT_STK_RPL_LST_R.$io_schd_seq);
			doSeqCache(MSC_NUM_SYS_TYP.ALTGRPID, altL.length);
			for (MCList<MST_INPT_STK_RPL_LST_R> l : altL) {
				String altGrpId = getStrSeq(MSC_NUM_SYS_TYP.ALTGRPID);
				for (MST_INPT_STK_RPL_LST_R r : l) {
					r.alt_grp_id(altGrpId);
				}
			}
			
		}
		
		
	}
	/**
	 * InptStkRpl_XfrIns01オペレーション.<p>
	 *
	 */
	public class InptStkRpl_XfrIns01 extends MSBEL_InptStkRplService_MC_A.InptStkRpl_XfrIns01 {
		final String masterFlgCol = "__master_flg_col__";
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess();
			}
			catch (Exception e) {
				handleEx(e);
			}
			finally {
				setDown();
			}
		}
		
		@Override
		protected void doIt() {
			// 前提：代替グループとして扱うレコード単位で上り電文に含まれている
			if (isNull(up1())) {
				return ;
			}
			
			MCList<MST_INPT_STK_RPL_LST_R> xfrL = srchInptStkRplLst();
			chkInptStkRplLst(xfrL);
			if (isNull(xfrL)) {
				return ;
			}
			adjustAltItmFixFlg(xfrL);
			sortForAlloc(xfrL);
			MSBEL_AllocMngService.Alloc_Srch01 allocOpe = alloc(xfrL, true);
			crtXfrSchd(allocOpe, xfrL);
			updInptStkRplLst(allocOpe, xfrL);
			setRslt(xfrL);
			
		}
		
		protected MCList<MST_INPT_STK_RPL_LST_R> srchInptStkRplLst() {
			MCList<MST_INPT_STK_RPL_LST_R> xfrL = MCList.create(MST_INPT_STK_RPL_LST_R.class);
			MST_INPT_STK_RPL_LST_R t = MST_INPT_STK_RPL_LST_R.create("T");
			MCQueryApiBuilder xfrL_bldr = MCQueryApiBuilder.create(t);
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");

			xfrL_bldr.setSelectAll();
			xfrL_bldr.addSelect(t.short_qty.as("org_short_qty"));
			xfrL_bldr.addSelect(m1.dec_place.as("base_dec_place"));
			xfrL_bldr.addSelect(m1.rnd_typ.as("base_rnd_typ"));
			xfrL_bldr.addInnerJoin(m1,
					bracket(t.itm_cd.eq(m1.itm_cd)
							.and(t.itm_sub1.eq(m1.itm_sub1))
							.and(t.itm_sub2.eq(m1.itm_sub2))
							.and(t.itm_sub3.eq(m1.itm_sub3))));
			xfrL_bldr.setOrderByAsc(t.batch_data_no);
			xfrL_bldr.setLockTable(t.batch_data_no);

			MCList<InptStkRpl_LstR> lst = up1().shallowClone();
			lst.sort(InptStkRpl_LstR.$batch_data_no);

			if (up0().screen_flg()) {
				dbSelectKeyForUpdateNoWait("MSBEL5080_MST_INPT_STK_RPL_LST_S02",
						xfrL, xfrL_bldr, lst);
			}
			else {
				dbSelectKeyForUpdate("MSBEL5080_MST_INPT_STK_RPL_LST_S03", xfrL, xfrL_bldr, lst);
			}
			
			return xfrL;
		}
		
		protected void chkInptStkRplLst(MCList<MST_INPT_STK_RPL_LST_R> xfrL) {
			MCMessageList msgL = new MCMessageList();
			MCMessageList chkMsgL = new MCMessageList();
			MCIndexKey idx = xfrL.createIndex(MST_INPT_STK_RPL_LST_R.$batch_data_no);
			MCList<MST_INPT_STK_RPL_LST_R> rmL = xfrL.createInstance();
			for (InptStkRpl_LstR r : up1()) {
				MST_INPT_STK_RPL_LST_R selectR = xfrL.getFirst(idx, r.batch_data_no());
				chkMsgL.clear();
				if (up0().screen_flg()) {
					chkMsgL.addAll(checkUpdCntrNE(r, InptStkRpl_LstR.$upd_cntr, selectR));
				}
				if (isNull(selectR)) {
					if (!up0().screen_flg()) {
						chkMsgL.addAll(checkUpdCntrNE(r, InptStkRpl_LstR.$upd_cntr, selectR));
					}
				}
				else {
					selectR.setAttributes(r);
					if (up0().screen_flg()) {
						chkMsgL.addAll(checkWritableLocCdDac(selectR, MST_INPT_STK_RPL_LST_R.$loc_cd));
					}
				}
				if (!chkMsgL.isEmpty()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
					rmL.add(selectR);
				}
				msgL.addAll(chkMsgL);
			}
			
			// 代替グループ単位でエラーにする
			if (!msgL.isEmpty()) {
				MCList<InptStkRpl_LstR> altL = up1().subList(r->isAlt(r.rl()));
				for (MCList<InptStkRpl_LstR> grpL : altL.groupList(InptStkRpl_LstR.$alt_grp_id)) {
					InptStkRpl_LstR errR = grpL.getFirst(InptStkRpl_LstR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value());
					if (errR != null) {
						for (InptStkRpl_LstR r : grpL) {
							if (!MAC_RTN_STS_TYP.isERR(r.rtn_sts_typ())) {
								r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
								MST_INPT_STK_RPL_LST_R selectR = xfrL.getFirst(idx, r.batch_data_no());
								if (!isNull(selectR)) {
									rmL.add(selectR);
								}
								if (up0().screen_flg()) {
									msgL.add(msgRelateRowErr(r, errR));
								}
							}
						}
					}
				}
			}
			
			if (up0().screen_flg()) {
				MCMessagePool.addAll(msgL);
			}
			
			// チェックでエラーになった不足情報リストは除外する
			if (!isNull(rmL)) {
				xfrL.removeAll(rmL);
			}
			
		}
		
		protected void adjustAltItmFixFlg(MCList<MST_INPT_STK_RPL_LST_R> xfrL) {
			// 代替品目指定ＦＬＧが含まれている場合は、他の代替品目を引当の対象から除外する
			for (MCList<MST_INPT_STK_RPL_LST_R> grpL : xfrL.groupList(MST_INPT_STK_RPL_LST_R.$alt_grp_id)) {
				if (grpL.getFirst(MST_INPT_STK_RPL_LST_R.$alt_itm_fix_flg, true) != null) {
					for (MST_INPT_STK_RPL_LST_R r : grpL) {
						if (!r.alt_itm_fix_flg()) {
							r.setBooleanNE("exclude_alloc_flg", true);
							r.rtn_sts_typ(MAC_RTN_STS_TYP.NOT_EXE.value());
						}
						r.alt_grp_cd(null);	// 通常品として扱う（DBには更新しない）
					}
				}
			}
		}
		
		protected void crtXfrSchd(MSBEL_AllocMngService.Alloc_Srch01 allocOpe,
				MCList<MST_INPT_STK_RPL_LST_R> xfrL) {
			down1().xfr_crt_success_cnt(0);
			down1().xfr_crt_error_cnt(0);
			addStkRpl(allocOpe, xfrL);
			if (isNull(allocOpe.down0())) {
				return ;
			}
			
			// 引当結果を移送予定の作成単位にまとめる
			String[] destAllocCols = {
					Srch_RsltR.$gr_loc_cd, Srch_RsltR.$gr_str_ln_cd,
					"not_lot_mix_flg", "not_sublot_mix_flg"
			};
			String[] srcAllocCols = {
					MST_INPT_STK_RPL_LST_R.$loc_cd, MST_INPT_STK_RPL_LST_R.$str_ln_cd,
					MST_INPT_STK_RPL_LST_R.$not_lot_mix_flg, MST_INPT_STK_RPL_LST_R.$not_sublot_mix_flg
			};
			allocOpe.down0().addBooleanColumn("not_lot_mix_flg");
			allocOpe.down0().addBooleanColumn("not_sublot_mix_flg");
			copyByPegNo(allocOpe.down0(), destAllocCols, xfrL, srcAllocCols);
			
			MCList<Srch_RsltR> xfrGrpL = MCList.create(Srch_RsltR.class);
			MCGroupByPolicy gp = new MCGroupByPolicy();
			gp.addKey(getXfrGrpCols());
			gp.sum(Srch_RsltR.$base_unit_qty);
			final String xfrGrpNoCol = "__xfr_grp_no_col__";
			allocOpe.down0().addNumberColumn(xfrGrpNoCol);
			allocOpe.down0().addBooleanColumn(masterFlgCol);
			int xfrGrpNo = 0;
			for (MCList<Srch_RsltR> grpL : allocOpe.down0().groupList(getXfrGrpCols())) {
				grpL.setNumber(xfrGrpNoCol, xfrGrpNo);
				MCList<Srch_RsltR> l = grpL.groupBy(gp); // この結果は必ず1件になる
				l.setNumber(xfrGrpNoCol, xfrGrpNo);
				l.setNumber(Srch_RsltR.$peg_no, xfrGrpNo);
				if(isNull(grpL.get(0).schd_stk_typ())) {
					l.setBoolean(masterFlgCol, true);
				}
				xfrGrpL.addAll(l);
				xfrGrpNo++;
			}
			
			// 引当結果から移送予定を作成できるかチェックする
			MSBEL_XfrSchdService.XfrSchd_Chk04 chkOpe = MSBEL_XfrSchdService.crtXfrSchd_Chk04();
			setAll(chkOpe.up0(), xfrGrpL, createMap_XfrSchdChk04_DtlR_Srch_RsltR());
			chkOpe.exec();
			
			// 移送予定の作成単位に、チェックエラーとなった引当結果をＮＧにする
			MCIndexKey idxkey = chkOpe.down0().createIndex(XfrSchdChk04_DtlR.$peg_no);
			for (Srch_RsltR r : allocOpe.down0()) {
				XfrSchdChk04_DtlR chkR = chkOpe.down0().getFirst(idxkey, r.getNumber(xfrGrpNoCol));
				if (chkR != null && chkR.err_flg()) {
					// 移送予定を作成できない引当結果は場合、引当できなかったものとして扱う
					r.base_unit_qty(0);
				}
			}
			
			// チェックＯＫである引当結果のみ、移送予定を作成する
			final String errCol = "__err_col__";
			xfrGrpL.addBooleanColumn(errCol);
			String[] destChkCols = {errCol};
			String[] srcChkCols = {XfrSchdChk04_DtlR.$err_flg};
			copyByPegNo(xfrGrpL, destChkCols, chkOpe.down0(), srcChkCols);
			
			MCList<Srch_RsltR> xfrGrpOkL = xfrGrpL.subList(errCol, false);
			
			// 処理結果
			down1().xfr_crt_success_cnt(xfrGrpOkL.size());
			down1().xfr_crt_error_cnt(xfrGrpL.size() - xfrGrpOkL.size());
			if (isNull(xfrGrpOkL)) {
				return ;
			}
			
			// 移送予定を作成する
			MSBEL_XfrSchdService.XfrSchd_Upd01 insOpe = MSBEL_XfrSchdService.crtXfrSchd_Upd01();
			setAll(insOpe.up0(), xfrGrpOkL, createMap_XfrSchd_DtlR_Srch_RsltR());
			insOpe.exec();
			
		}
		
		protected MCList<Srch_RsltR> addStkRpl(MSBEL_AllocMngService.Alloc_Srch01 allocOpe,
				MCList<MST_INPT_STK_RPL_LST_R> xfrL) {
			
			MCList<MST_INPT_STK_RPL_LST_R> 
				wRplL = MCList.create(MST_INPT_STK_RPL_LST_R.class);
			MCList<MST_INPT_STK_RPL_LST_R> wXfrL = xfrL.clone();
			addInptStkRplLst(wXfrL, allocOpe, wRplL, true);
			
			return getStkRpl(allocOpe, wRplL);
		}
		
		protected MCList<Srch_RsltR> getStkRpl(MSBEL_AllocMngService.Alloc_Srch01 allocOpe,
				MCList<MST_INPT_STK_RPL_LST_R> xfrL) {
			
			if(isNull(xfrL)) {
				return allocOpe.down0();
			}
			
			MCList<Srch_RsltR> stkRplL = MCList.create(Srch_RsltR.class);
			addAll(stkRplL, xfrL, createMap_Srch_RsltR_MST_INPT_STK_RPL_LST_R());
			
			MAM_STK_RPL_R t = MAM_STK_RPL_R.create("T");
			MCQueryApiBuilder dbcStkL_bldr = MCQueryApiBuilder.create(t);
			dbcStkL_bldr.setSelect(t.itm_cd);
			dbcStkL_bldr.addSelect(t.itm_sub1);
			dbcStkL_bldr.addSelect(t.itm_sub2);
			dbcStkL_bldr.addSelect(t.itm_sub3);
			dbcStkL_bldr.addSelect(t.loc_cd);
			dbcStkL_bldr.addSelect(t.inpt_gi_loc_cd);
			dbcStkL_bldr.addSelect(t.inpt_gi_str_ln_cd);
			FXUCL_MCDbcCacheStEnd<MAM_STK_RPL_R> cacheStk = new FXUCL_MCDbcCacheStEnd<MAM_STK_RPL_R>(dbcStkL_bldr, xfrL,
					new String[] {
							MST_INPT_STK_RPL_LST_R.$itm_cd,
							MST_INPT_STK_RPL_LST_R.$itm_sub1,
							MST_INPT_STK_RPL_LST_R.$itm_sub2,
							MST_INPT_STK_RPL_LST_R.$itm_sub3,
							MST_INPT_STK_RPL_LST_R.$loc_cd
							});
			
			MCGroupByPolicy gp = new MCGroupByPolicy();
			gp.addKey(MST_INPT_STK_RPL_LST_R.$schd_dt);
			gp.addKey(MST_INPT_STK_RPL_LST_R.$itm_cd);
			gp.addKey(MST_INPT_STK_RPL_LST_R.$itm_sub1);
			gp.addKey(MST_INPT_STK_RPL_LST_R.$itm_sub2);
			gp.addKey(MST_INPT_STK_RPL_LST_R.$itm_sub3);
			gp.addKey(MST_INPT_STK_RPL_LST_R.$loc_cd);
			gp.addKey(MST_INPT_STK_RPL_LST_R.$alt_grp_cd);
			gp.addKey(MST_INPT_STK_RPL_LST_R.$alt_alloc_prio);
			MCList<MST_INPT_STK_RPL_LST_R> altGrpL = null;
			
			MCIndexKey idx = stkRplL.createIndex(Srch_RsltR.$schd_dt, Srch_RsltR.$itm_cd, Srch_RsltR.$itm_sub1, Srch_RsltR.$itm_sub2, Srch_RsltR.$itm_sub3, Srch_RsltR.$inpt_loc_cd);
			for (MCList<MST_INPT_STK_RPL_LST_R>
				altL : xfrL.groupList(MST_INPT_STK_RPL_LST_R.$alt_grp_id)) {
				
				int cnt = 0;
				altGrpL = altL.groupBy(gp);
				altGrpL.sort(MST_INPT_STK_RPL_LST_R.$alt_alloc_prio);
				for (MST_INPT_STK_RPL_LST_R altR : altGrpL) {
					if(isAlt(altR) && cnt > 0) {
						continue;
					}
					
					MAM_STK_RPL_R dbcStkR = cacheStk.get(altR.schd_dt(), altR.itm_cd(), altR.itm_sub1(), altR.itm_sub2(), altR.itm_sub3(), altR.loc_cd());
					if(!dbcStkR.isEmpty() && !isNull(dbcStkR.inpt_gi_loc_cd())) {
						MCList<Srch_RsltR> l = stkRplL.subList(idx, altR.schd_dt(), altR.itm_cd(), altR.itm_sub1(), altR.itm_sub2(), altR.itm_sub3(), altR.loc_cd());
						l.setString(Srch_RsltR.$stk_loc_cd, dbcStkR.inpt_gi_loc_cd());
						l.setString(Srch_RsltR.$stk_str_ln_cd, dbcStkR.inpt_gi_str_ln_cd());
						allocOpe.down0().addAll(l);
						cnt++;
					}
				}
			}
			
			return allocOpe.down0();
		}
		
		protected Map_Srch_RsltR_MST_INPT_STK_RPL_LST_R<Srch_RsltR,MST_INPT_STK_RPL_LST_R> createMap_Srch_RsltR_MST_INPT_STK_RPL_LST_R() {
			return new Map_Srch_RsltR_MST_INPT_STK_RPL_LST_R<Srch_RsltR, MST_INPT_STK_RPL_LST_R>();
		}

		public class Map_Srch_RsltR_MST_INPT_STK_RPL_LST_R<D extends Srch_RsltR, S extends MST_INPT_STK_RPL_LST_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch_RsltR.$peg_no, MST_INPT_STK_RPL_LST_R.$peg_no);
				addColumnPathMap(Srch_RsltR.$io_schd_typ, MST_INPT_STK_RPL_LST_R.$io_schd_typ);
				addColumnPathMap(Srch_RsltR.$io_schd_sts_typ, MST_INPT_STK_RPL_LST_R.$io_schd_sts_typ);
				addColumnPathMap(Srch_RsltR.$io_schd_no, MST_INPT_STK_RPL_LST_R.$io_schd_no);
				addColumnPathMap(Srch_RsltR.$io_schd_seq, MST_INPT_STK_RPL_LST_R.$io_schd_seq);
				addColumnPathMap(Srch_RsltR.$io_schd_pr_no, MST_INPT_STK_RPL_LST_R.$io_schd_pr_no);
				addColumnPathMap(Srch_RsltR.$itm_cd, MST_INPT_STK_RPL_LST_R.$itm_cd);
				addColumnPathMap(Srch_RsltR.$itm_sub1, MST_INPT_STK_RPL_LST_R.$itm_sub1);
				addColumnPathMap(Srch_RsltR.$itm_sub2, MST_INPT_STK_RPL_LST_R.$itm_sub2);
				addColumnPathMap(Srch_RsltR.$itm_sub3, MST_INPT_STK_RPL_LST_R.$itm_sub3);
				addColumnPathMap(Srch_RsltR.$ver_no, MST_INPT_STK_RPL_LST_R.$ver_no);
				addColumnPathMap(Srch_RsltR.$alt_grp_cd, MST_INPT_STK_RPL_LST_R.$alt_grp_cd);
				addColumnPathMap(Srch_RsltR.$alt_grp_seq, MST_INPT_STK_RPL_LST_R.$alt_grp_seq);
				addColumnPathMap(Srch_RsltR.$oper_inst_no, MST_INPT_STK_RPL_LST_R.$oper_inst_no);
				addColumnPathMap(Srch_RsltR.$inpt_loc_cd, MST_INPT_STK_RPL_LST_R.$loc_cd);
				addColumnPathMap(Srch_RsltR.$inpt_str_ln_cd, MST_INPT_STK_RPL_LST_R.$str_ln_cd);
				addColumnPathMap(Srch_RsltR.$gr_loc_cd, MST_INPT_STK_RPL_LST_R.$loc_cd);
				addColumnPathMap(Srch_RsltR.$gr_str_ln_cd, MST_INPT_STK_RPL_LST_R.$str_ln_cd);
				addColumnPathMap(Srch_RsltR.$stk_arrv_bp_cd, MST_INPT_STK_RPL_LST_R.$stk_arrv_bp_cd);
				addColumnPathMap(Srch_RsltR.$quality_typ, MST_INPT_STK_RPL_LST_R.$quality_typ);
				addColumnPathMap(Srch_RsltR.$stk_id_typ, MST_INPT_STK_RPL_LST_R.$stk_id_typ);
				addColumnPathMap(Srch_RsltR.$stk_bp_cd, MST_INPT_STK_RPL_LST_R.$stk_bp_cd);
				addColumnPathMap(Srch_RsltR.$gd_cd, MST_INPT_STK_RPL_LST_R.$gd_cd);
				addColumnPathMap(Srch_RsltR.$lot_no, MST_INPT_STK_RPL_LST_R.$lot_no);
				addColumnPathMap(Srch_RsltR.$sublot_no, MST_INPT_STK_RPL_LST_R.$sublot_no);
				addColumnPathMap(Srch_RsltR.$sno1, MST_INPT_STK_RPL_LST_R.$sno1);
				addColumnPathMap(Srch_RsltR.$sno2, MST_INPT_STK_RPL_LST_R.$sno2);
				addColumnPathMap(Srch_RsltR.$sno3, MST_INPT_STK_RPL_LST_R.$sno3);
				addColumnPathMap(Srch_RsltR.$sno4, MST_INPT_STK_RPL_LST_R.$sno4);
				addColumnPathMap(Srch_RsltR.$sno1_null_flg, MST_INPT_STK_RPL_LST_R.$sno1_null_flg);
				addColumnPathMap(Srch_RsltR.$sno2_null_flg, MST_INPT_STK_RPL_LST_R.$sno2_null_flg);
				addColumnPathMap(Srch_RsltR.$sno3_null_flg, MST_INPT_STK_RPL_LST_R.$sno3_null_flg);
				addColumnPathMap(Srch_RsltR.$sno4_null_flg, MST_INPT_STK_RPL_LST_R.$sno4_null_flg);
				addColumnPathMap(Srch_RsltR.$base_unit_cd, MST_INPT_STK_RPL_LST_R.$base_unit_cd);
				addColumnPathMap(Srch_RsltR.$base_unit_qty, MST_INPT_STK_RPL_LST_R.$short_qty);
				addColumnPathMap(Srch_RsltR.$pack_unit_cd, MST_INPT_STK_RPL_LST_R.$base_unit_cd);
				addColumnPathMap(Srch_RsltR.$pack_unit_qty, MST_INPT_STK_RPL_LST_R.$short_qty);
				addColumnPathMap(Srch_RsltR.$vld_dt_fr, MST_INPT_STK_RPL_LST_R.$vld_dt_fr);
				addColumnPathMap(Srch_RsltR.$schd_dt, MST_SHIP_STK_RPL_LST_R.$schd_dt);
			}
		}
		
		protected Map_XfrSchdChk04_DtlR_Srch_RsltR<XfrSchdChk04_DtlR,Srch_RsltR> createMap_XfrSchdChk04_DtlR_Srch_RsltR() {
			return new Map_XfrSchdChk04_DtlR_Srch_RsltR<XfrSchdChk04_DtlR, Srch_RsltR>();
		}

		public class Map_XfrSchdChk04_DtlR_Srch_RsltR<D extends XfrSchdChk04_DtlR, S extends Srch_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchdChk04_DtlR.$peg_no, Srch_RsltR.$peg_no);
				addColumnPathMap(XfrSchdChk04_DtlR.$gi_loc_cd, Srch_RsltR.$stk_loc_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$gi_str_ln_cd, Srch_RsltR.$stk_str_ln_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$gr_loc_cd, Srch_RsltR.$gr_loc_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$gr_str_ln_cd, Srch_RsltR.$gr_str_ln_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_cd, Srch_RsltR.$itm_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_sub1, Srch_RsltR.$itm_sub1);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_sub2, Srch_RsltR.$itm_sub2);
				addColumnPathMap(XfrSchdChk04_DtlR.$itm_sub3, Srch_RsltR.$itm_sub3);
				addColumnPathMap(XfrSchdChk04_DtlR.$lot_no, Srch_RsltR.$lot_no);
				addColumnPathMap(XfrSchdChk04_DtlR.$sublot_no, Srch_RsltR.$sublot_no);
				addColumnPathMap(XfrSchdChk04_DtlR.$ver_no, Srch_RsltR.$ver_no);
				addColumnPathMap(XfrSchdChk04_DtlR.$sno1, Srch_RsltR.$sno1);
				addColumnPathMap(XfrSchdChk04_DtlR.$sno1_null_flg, Srch_RsltR.$sno1_null_flg);
				addColumnPathMap(XfrSchdChk04_DtlR.$sno2, Srch_RsltR.$sno2);
				addColumnPathMap(XfrSchdChk04_DtlR.$sno2_null_flg, Srch_RsltR.$sno2_null_flg);
				addColumnPathMap(XfrSchdChk04_DtlR.$sno3, Srch_RsltR.$sno3);
				addColumnPathMap(XfrSchdChk04_DtlR.$sno3_null_flg, Srch_RsltR.$sno3_null_flg);
				addColumnPathMap(XfrSchdChk04_DtlR.$sno4, Srch_RsltR.$sno4);
				addColumnPathMap(XfrSchdChk04_DtlR.$sno4_null_flg, Srch_RsltR.$sno4_null_flg);
				addColumnPathMap(XfrSchdChk04_DtlR.$base_unit_qty, Srch_RsltR.$base_unit_qty);
				addColumnPathMap(XfrSchdChk04_DtlR.$base_unit_cd, Srch_RsltR.$base_unit_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$stk_id_typ, Srch_RsltR.$stk_id_typ);
				addColumnPathMap(XfrSchdChk04_DtlR.$stk_bp_cd, Srch_RsltR.$stk_bp_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$gi_stk_arrv_bp_cd, Srch_RsltR.$gi_stk_arrv_bp_cd);
				addColumnPathMap(XfrSchdChk04_DtlR.$gr_rqst_tm, Srch_RsltR.$vld_dt_fr);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.xfr_src_typ(MSC_XFR_SRC_TYP.INPT_RPL.value());
			}
		}

		protected Map_XfrSchd_DtlR_Srch_RsltR<XfrSchd_DtlR,Srch_RsltR> createMap_XfrSchd_DtlR_Srch_RsltR() {
			return new Map_XfrSchd_DtlR_Srch_RsltR<XfrSchd_DtlR, Srch_RsltR>();
		}

		public class Map_XfrSchd_DtlR_Srch_RsltR<D extends XfrSchd_DtlR, S extends Srch_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchd_DtlR.$peg_no, Srch_RsltR.$peg_no);
				addColumnPathMap(XfrSchd_DtlR.$gr_rqst_tm, Srch_RsltR.$vld_dt_fr);
				addColumnPathMap(XfrSchd_DtlR.$vld_dt_fr, Srch_RsltR.$vld_dt_fr);
				addColumnPathMap(XfrSchd_DtlR.$gi_loc_cd, Srch_RsltR.$stk_loc_cd);
				addColumnPathMap(XfrSchd_DtlR.$gi_str_ln_cd, Srch_RsltR.$stk_str_ln_cd);
				addColumnPathMap(XfrSchd_DtlR.$gi_stk_arrv_bp_cd, Srch_RsltR.$stk_arrv_bp_cd);
				addColumnPathMap(XfrSchd_DtlR.$gr_loc_cd, Srch_RsltR.$gr_loc_cd);
				addColumnPathMap(XfrSchd_DtlR.$gr_str_ln_cd, Srch_RsltR.$gr_str_ln_cd);
				addColumnPathMap(XfrSchd_DtlR.$itm_cd, Srch_RsltR.$itm_cd);
				addColumnPathMap(XfrSchd_DtlR.$itm_sub1, Srch_RsltR.$itm_sub1);
				addColumnPathMap(XfrSchd_DtlR.$itm_sub2, Srch_RsltR.$itm_sub2);
				addColumnPathMap(XfrSchd_DtlR.$itm_sub3, Srch_RsltR.$itm_sub3);
				addColumnPathMap(XfrSchd_DtlR.$lot_no, Srch_RsltR.$lot_no);
				addColumnPathMap(XfrSchd_DtlR.$sublot_no, Srch_RsltR.$sublot_no);
				addColumnPathMap(XfrSchd_DtlR.$ver_no, Srch_RsltR.$ver_no);
				addColumnPathMap(XfrSchd_DtlR.$sno1, Srch_RsltR.$sno1);
				addColumnPathMap(XfrSchd_DtlR.$sno1_null_flg, Srch_RsltR.$sno1_null_flg);
				addColumnPathMap(XfrSchd_DtlR.$sno2, Srch_RsltR.$sno2);
				addColumnPathMap(XfrSchd_DtlR.$sno2_null_flg, Srch_RsltR.$sno2_null_flg);
				addColumnPathMap(XfrSchd_DtlR.$sno3, Srch_RsltR.$sno3);
				addColumnPathMap(XfrSchd_DtlR.$sno3_null_flg, Srch_RsltR.$sno3_null_flg);
				addColumnPathMap(XfrSchd_DtlR.$sno4, Srch_RsltR.$sno4);
				addColumnPathMap(XfrSchd_DtlR.$sno4_null_flg, Srch_RsltR.$sno4_null_flg);
				addColumnPathMap(XfrSchd_DtlR.$gd_cd, Srch_RsltR.$gd_cd);
				addColumnPathMap(XfrSchd_DtlR.$quality_typ, Srch_RsltR.$quality_typ);
				addColumnPathMap(XfrSchd_DtlR.$stk_id_typ, Srch_RsltR.$stk_id_typ);
				addColumnPathMap(XfrSchd_DtlR.$stk_bp_cd, Srch_RsltR.$stk_bp_cd);
				addColumnPathMap(XfrSchd_DtlR.$trd_unit_cd, Srch_RsltR.$base_unit_cd);
				addColumnPathMap(XfrSchd_DtlR.$trd_unit_qty, Srch_RsltR.$base_unit_qty);
				addColumnPathMap(XfrSchd_DtlR.$base_unit_cd, Srch_RsltR.$base_unit_cd);
				addColumnPathMap(XfrSchd_DtlR.$base_unit_qty, Srch_RsltR.$base_unit_qty);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.xfr_src_typ(MSC_XFR_SRC_TYP.INPT_RPL.value());
				if (!src.getBooleanNE(masterFlgCol)) {
					dest.alloc_flg(true);
				}
				dest.not_lot_mix_flg(src.getBooleanNE("not_lot_mix_flg"));
				dest.not_sublot_mix_flg(src.getBooleanNE("not_sublot_mix_flg"));
			}
		}
		
		protected String[] getXfrGrpCols() {
			return new String[] {
					Srch_RsltR.$itm_cd, Srch_RsltR.$itm_sub1, Srch_RsltR.$itm_sub2,
					Srch_RsltR.$itm_sub3, Srch_RsltR.$stk_loc_cd,
					Srch_RsltR.$stk_str_ln_cd, Srch_RsltR.$stk_arrv_bp_cd,
					Srch_RsltR.$gr_loc_cd, Srch_RsltR.$gr_str_ln_cd, Srch_RsltR.$lot_no,
					Srch_RsltR.$sublot_no, Srch_RsltR.$ver_no, Srch_RsltR.$sno1,
					Srch_RsltR.$sno1_null_flg, Srch_RsltR.$sno2,
					Srch_RsltR.$sno2_null_flg, Srch_RsltR.$sno3,
					Srch_RsltR.$sno3_null_flg, Srch_RsltR.$sno4,
					Srch_RsltR.$sno4_null_flg, Srch_RsltR.$gd_cd,
					Srch_RsltR.$quality_typ, Srch_RsltR.$stk_id_typ,
					Srch_RsltR.$stk_bp_cd, Srch_RsltR.$base_unit_cd,
					Srch_RsltR.$vld_dt_fr, "not_lot_mix_flg", "not_sublot_mix_flg"
			};
		}
		
		
		protected void updInptStkRplLst(MSBEL_AllocMngService.Alloc_Srch01 allocOpe,
				MCList<MST_INPT_STK_RPL_LST_R> xfrL) {
			
			MCList<MST_INPT_STK_RPL_LST_R> 
				wRplL = MCList.create(MST_INPT_STK_RPL_LST_R.class),
				delL = MCList.create(MST_INPT_STK_RPL_LST_R.class),
				updL = MCList.create(MST_INPT_STK_RPL_LST_R.class);

			addInptStkRplLst(xfrL, allocOpe, wRplL, true);
			
			MCIndexKey idx1 = wRplL.createIndex(MST_INPT_STK_RPL_LST_R.$peg_no);
			for (MCList<MST_INPT_STK_RPL_LST_R>
					altL : xfrL.groupList(MST_INPT_STK_RPL_LST_R.$alt_grp_id)) {

				int altItmFixTrue = 0;
				altL.setStatus(MCRow.NONE);
				for (MST_INPT_STK_RPL_LST_R rplR : altL) {
					if (rplR.alt_itm_fix_flg()) {
						altItmFixTrue++;	// 代替品目指定オンの件数
					}
					if (!isNull(rplR.rtn_sts_typ())) {
						// 処理結果が設定済み
						// ・同一代替Ｇ内で代替品目指定されている品目以外の品目(NOT_EXE)
						continue;
					}
					MST_INPT_STK_RPL_LST_R wRplR = wRplL.getFirst(idx1, rplR.peg_no());
					if (wRplR == null) {
						// 引当した結果、不足情報なし
						// ⇒ 全数引当された結果なので、DBから削除する
						delL.add(rplR);
						rplR.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
						rplR.setStatus(MCRow.DELETE);
					}
					else if (!isSame(rplR.short_qty(), rplR.getNumber("org_short_qty"))) {
						// 引当した結果、不足情報あり
						// ⇒ 一部引当できた結果なので、不足数を更新する
						// 不足数は addInptStkRplLst で設定
						updL.add(rplR);
						rplR.rtn_sts_typ(MAC_RTN_STS_TYP.WRN.value());
						if (up0().screen_flg()) {
							MCMessagePool.add(rplR, null, MSBEL1010, rplR.batch_data_no());
						//	
						}
						rplR.setStatus(MCRow.MODIFY);
					}
					else {
						// 引当できなかった、または移送依頼が作成されなかった
						// ⇒ 不足情報に対して何もしない
						rplR.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
						if (up0().screen_flg()) {
							MCMessagePool.add(rplR, null, MSBEL1009, rplR.batch_data_no());
						}
					}
				}
				if (altItmFixTrue > 0) {
					// 代替品目指定されている品目がすべて削除(全引当)された場合は、他の品目も削除する
					if (altL.subList(MCRow.DELETE).size() == altItmFixTrue) {
						delL.addAll(altL.subList(MCRow.NONE));
					}
					// 一部更新(一部引当)された場合は、他の品目も更新する
					else if (altL.subList(MCRow.MODIFY).size() > 0) {
						updL.addAll(altL.subList(MCRow.NONE));
					}
				}
				altL.setStatus(MCRow.NONE);	// 後始末
			}
			
			if (!isNull(delL)) {
				// 処理結果
				down1().lst_del_of_xfr_crt_cnt(delL.size());
				dbDeleteKey("MSBEL5080_MST_INPT_STK_RPL_LST_D01", delL,
						MCQueryApiBuilder.create(MST_INPT_STK_RPL_LST_R.create("T")));
			}
			if (!isNull(updL)) {
				MST_INPT_STK_RPL_LST_R updL_t = MST_INPT_STK_RPL_LST_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
				updL_bldr.setSet(updL_t.short_qty);
				dbUpdateKey("MSBEL5080_MST_INPT_STK_RPL_LST_U01", updL, updL_bldr);
			}
			
		}
		
		protected void setRslt(MCList<MST_INPT_STK_RPL_LST_R> xfrL) {
			MCIndexKey idx = xfrL.createIndex(MST_INPT_STK_RPL_LST_R.$batch_data_no);
			for (InptStkRpl_LstR r : up1()) {
				if (isNull(r.rtn_sts_typ())) {
					MST_INPT_STK_RPL_LST_R rsltR = xfrL.getFirst(idx, r.batch_data_no());
					if (rsltR != null) {
						r.rtn_sts_typ(rsltR.rtn_sts_typ());
					}
				}
			}
			
		}
		
		protected void handleSuccess() {
			dbTran().commit();
		}
		
		protected void handleEx(Exception e) {
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
			up1().setString(InptStkRpl_LstR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value());
		}
		
		protected void setDown() {
			down0().setAll(up1());
		}
		
	}
	/**
	 * InptStkRpl_LstDel01オペレーション.<p>
	 *
	 */
	public class InptStkRpl_LstDel01 extends MSBEL_InptStkRplService_MC_A.InptStkRpl_LstDel01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			insLocWk(up0());
			delStkShrt();
			delLocWk();
			dbTran().commit();
			
		}
		
		protected void delStkShrt() {
			MCRow cntR = MCRow.create();
			executeQuery(MCList.create(MCRow.class), MSBEL5080_MST_INPT_STK_RPL_LST_S01());
			executeQuery(cntR, MSBEL5080_MST_INPT_STK_RPL_LST_S02());
			executeUpdate(MSBEL5080_MST_INPT_STK_RPL_LST_D01());
			
			down0().lst_del_cnt(nvl(cntR.getNumberNE("cnt"),MCNumber.ZERO));
		}

	}
	/**
	 * InptStkRpl_XfrDel01オペレーション.<p>
	 *
	 */
	public class InptStkRpl_XfrDel01 extends MSBEL_InptStkRplService_MC_A.InptStkRpl_XfrDel01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			insItmLocWk(up1());
			callDelXfrSchdService();
			delItmLocWk();
			dbTran().commit();
			
		}
		
		protected void callDelXfrSchdService() {
			// 削除候補の移送予定を取得する
			editUpTm(up0());
			MCList<InptStkRpl_XfrR> xfrL = MCList.create(InptStkRpl_XfrR.class);
			executeQuery(xfrL, MSBEL5080_MST_XFR_SCHD_S02(), up0());
			
			if (isNull(xfrL)) {
				return ;
			}
			
			setPegNo(xfrL);
			
			// 削除可能な移送予定かチェックする
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(MCMessagePool.getMessageList());
			MCMessagePool.getMessageList().clear();
			
			MSBEL_XfrSchdService.XfrSchd_Chk04 chkOpe = MSBEL_XfrSchdService.crtXfrSchd_Chk04();
			setAll(chkOpe.up0(), xfrL, createMap_XfrSchdChk04_DtlR_InptStkRpl_XfrR());
			chkOpe.exec();
			
			String[] destCols = {InptStkRpl_XfrR.$err_flg};
			String[] srcCols = {XfrSchdChk04_DtlR.$err_flg};
			copyByPegNo(xfrL, destCols, chkOpe.down0(), srcCols);
			MCMessagePool.getMessageList().clear();
			MCMessagePool.getMessageList().addAll(msgL);
			
			// 削除可能な移送予定を削除する
			MCList<InptStkRpl_XfrR> xfrOkL = xfrL.subList(r -> !r.err_flg());
			
			if (isNull(xfrOkL)) {
				return ;
			}
			
			MSBEL_XfrSchdService.XfrSchd_Upd01 delOpe = MSBEL_XfrSchdService.crtXfrSchd_Upd01();
			setAll(delOpe.up0(), xfrOkL, createMap_XfrSchd_DtlR_InptStkRpl_XfrR());
			delOpe.exec();
			
			down0().xfr_del_cnt(xfrOkL.size());
		}
		
		protected Map_XfrSchdChk04_DtlR_InptStkRpl_XfrR<XfrSchdChk04_DtlR,InptStkRpl_XfrR> createMap_XfrSchdChk04_DtlR_InptStkRpl_XfrR() {
			return new Map_XfrSchdChk04_DtlR_InptStkRpl_XfrR<XfrSchdChk04_DtlR, InptStkRpl_XfrR>();
		}

		public class Map_XfrSchdChk04_DtlR_InptStkRpl_XfrR<D extends XfrSchdChk04_DtlR, S extends InptStkRpl_XfrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchdChk04_DtlR.$peg_no, InptStkRpl_XfrR.$peg_no);
				addColumnPathMap(XfrSchdChk04_DtlR.$xfr_schd_no, InptStkRpl_XfrR.$xfr_schd_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.xfr_src_typ(MSC_XFR_SRC_TYP.INPT_RPL.value());
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
		
		protected Map_XfrSchd_DtlR_InptStkRpl_XfrR<XfrSchd_DtlR,InptStkRpl_XfrR> createMap_XfrSchd_DtlR_InptStkRpl_XfrR() {
			return new Map_XfrSchd_DtlR_InptStkRpl_XfrR<XfrSchd_DtlR, InptStkRpl_XfrR>();
		}

		public class Map_XfrSchd_DtlR_InptStkRpl_XfrR<D extends XfrSchd_DtlR, S extends InptStkRpl_XfrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchd_DtlR.$peg_no, InptStkRpl_XfrR.$peg_no);
				addColumnPathMap(XfrSchd_DtlR.$xfr_schd_no, InptStkRpl_XfrR.$xfr_schd_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
		
	}
	

////////////////////////////////////////////////////////////////////////
// 以下、共通処理 //////////////////////////////////////////////////////////

	/**
	 * 移送予定取得のため、日付⇒日時に変換した値を設定する。
	 */
	protected void editUpTm(InptStkRpl_CndR cndR) {
		if (!isNullOr(cndR.dt_fr(), cndR.dt_to())) {
			if (isNull(cndR.tm_fr())) {
				cndR.tm_fr(cndR.dt_fr().startTimeOfDay());
			}
			if (isNull(cndR.tm_to())) {
				cndR.tm_to(cndR.dt_to().endTimeOfDay());
			}
		}
		
	}
	
	/**
	 * 不足情報および移送予定の対象を取得する
	 */
	protected MCList<InptStkRpl_DtlR> getDtlL(InptStkRpl_CndR cndR, MCList<InptStkRpl_DtlR> dtlL) {

		insLocWk(dtlL);

		MCList<InptStkRpl_DtlR> retL = MCList.create(InptStkRpl_DtlR.class);
		MCList<InptStkRpl_DtlR> tmpL = MCList.create(InptStkRpl_DtlR.class);
		
		if (cndR.xfr_schd_del_flg()) {
			editUpTm(cndR);
			tmpL.clear();
			executeQuery(tmpL, MSBEL5080_MST_XFR_SCHD_S01(), cndR);
			retL.addAll(tmpL);
		}
		if (cndR.fix_flg() || cndR.schd_flg() || cndR.mfg_sav_flg() || cndR.ord_flg()
				|| cndR.stt_flg()) {
			tmpL.clear();
			executeQuery(tmpL, MSBEL5080_MST_IO_SCHD_S01(), cndR);
			retL.addAll(tmpL);
		}
		if (cndR.opn_flg() || cndR.ord_sav_flg()) {
			tmpL.clear();
			executeQuery(tmpL, MSBEL5080_MST_ORD_IO_SCHD_S01(), cndR);
			retL.addAll(tmpL);
		}
		
		delLocWk();
		
		MCGroupByPolicy gp = new MCGroupByPolicy();
		gp.addKey(InptStkRpl_DtlR.$itm_cd);
		gp.addKey(InptStkRpl_DtlR.$itm_sub1);
		gp.addKey(InptStkRpl_DtlR.$itm_sub2);
		gp.addKey(InptStkRpl_DtlR.$itm_sub3);
		gp.addKey(InptStkRpl_DtlR.$alt_grp_cd);
		gp.addKey(InptStkRpl_DtlR.$wg_cd);
		gp.addKey(InptStkRpl_DtlR.$loc_cd);
		gp.addKey(InptStkRpl_DtlR.$str_ln_cd);
		gp.sum(InptStkRpl_DtlR.$total_cnt);
		
		return retL.groupBy(gp);
	}

	/**
	 * 処理対象（場所）をワークに格納する
	 */
	protected void insLocWk(MCList<InptStkRpl_DtlR> dtlL) {
		delLocWk();
		
		MCList<MAM_STR_LN_R> wkL = MCList.create(MAM_STR_LN_R.class);
		MCList<InptStkRpl_DtlR> grpL = dtlL.groupBy(InptStkRpl_DtlR.$loc_cd,
				InptStkRpl_DtlR.$str_ln_cd);
		for (InptStkRpl_DtlR r : grpL) {
			MAM_STR_LN_R x = MAM_STR_LN_R.create();
			x.loc_cd(r.loc_cd());
			x.str_ln_cd(r.str_ln_cd());
			wkL.add(x);
		}
		
		dbWkInsert("MSBEL5080_MAW_STR_LN_I01", wkL,
				MCQueryApiBuilder.create(MAM_STR_LN_R.create("T")).getBaseDbc());
		
	}
	
	/**
	 * 処理対象（場所）をワークから削除する
	 */
	protected void delLocWk() {
		dbWkDelete("MSBEL5080_MAW_STR_LN_D01", MCQueryApiBuilder.create(MAM_STR_LN_R.create("T")).getBaseDbc());
	}
	
	/**
	 * 処理対象（品目＋場所）をワークに格納する
	 */
	protected void insItmLocWk(MCList<InptStkRpl_DtlR> dtlL) {
		delItmLocWk();
		
		MCList<InptStkRpl_DtlR> grpL = dtlL.groupBy(InptStkRpl_DtlR.$itm_cd,
				InptStkRpl_DtlR.$itm_sub1, InptStkRpl_DtlR.$itm_sub2,
				InptStkRpl_DtlR.$itm_sub3, InptStkRpl_DtlR.$loc_cd,
				InptStkRpl_DtlR.$str_ln_cd);
		MCList<MSW_INPT_STK_RPL_ITM_LOC_R> wkL = MCList.create(MSW_INPT_STK_RPL_ITM_LOC_R.class);
		addAll(wkL, grpL, createMap_MSW_INPT_STK_RPL_ITM_LOC_R_InptStkRpl_DtlR());
		dbInsertEx("MSBEL5080_MSW_INPT_STK_RPL_ITM_LOC_I01", wkL,
				MCQueryApiBuilder.create(MSW_INPT_STK_RPL_ITM_LOC_R.create("T")));
	}
	
	protected Map_MSW_INPT_STK_RPL_ITM_LOC_R_InptStkRpl_DtlR<MSW_INPT_STK_RPL_ITM_LOC_R,InptStkRpl_DtlR> createMap_MSW_INPT_STK_RPL_ITM_LOC_R_InptStkRpl_DtlR() {
		return new Map_MSW_INPT_STK_RPL_ITM_LOC_R_InptStkRpl_DtlR<MSW_INPT_STK_RPL_ITM_LOC_R, InptStkRpl_DtlR>();
	}

	public class Map_MSW_INPT_STK_RPL_ITM_LOC_R_InptStkRpl_DtlR<D extends MSW_INPT_STK_RPL_ITM_LOC_R, S extends InptStkRpl_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_INPT_STK_RPL_ITM_LOC_R.$itm_cd, InptStkRpl_DtlR.$itm_cd);
			addColumnPathMap(MSW_INPT_STK_RPL_ITM_LOC_R.$itm_sub1, InptStkRpl_DtlR.$itm_sub1);
			addColumnPathMap(MSW_INPT_STK_RPL_ITM_LOC_R.$itm_sub2, InptStkRpl_DtlR.$itm_sub2);
			addColumnPathMap(MSW_INPT_STK_RPL_ITM_LOC_R.$itm_sub3, InptStkRpl_DtlR.$itm_sub3);
			addColumnPathMap(MSW_INPT_STK_RPL_ITM_LOC_R.$loc_cd, InptStkRpl_DtlR.$loc_cd);
			addColumnPathMap(MSW_INPT_STK_RPL_ITM_LOC_R.$str_ln_cd, InptStkRpl_DtlR.$str_ln_cd);

		}
	}
	
	/**
	 * 処理対象（品目＋場所）をワークから削除する
	 */
	protected void delItmLocWk() {
		execDbWkDelete("MSBEL5080_MSW_INPT_STK_RPL_ITM_LOC_D01", MSW_INPT_STK_RPL_ITM_LOC_R.create("T"));
	}

	
	protected Map_InptStkRpl_LstR_MST_INPT_STK_RPL_LST_R<InptStkRpl_LstR,MST_INPT_STK_RPL_LST_R> createMap_InptStkRpl_LstR_MST_INPT_STK_RPL_LST_R() {
		return new Map_InptStkRpl_LstR_MST_INPT_STK_RPL_LST_R<InptStkRpl_LstR, MST_INPT_STK_RPL_LST_R>();
	}

	public class Map_InptStkRpl_LstR_MST_INPT_STK_RPL_LST_R<D extends InptStkRpl_LstR, S extends MST_INPT_STK_RPL_LST_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(InptStkRpl_LstR.$batch_data_no, MST_INPT_STK_RPL_LST_R.$batch_data_no);
			addColumnPathMap(InptStkRpl_LstR.$loc_cd, MST_INPT_STK_RPL_LST_R.$loc_cd);
			addColumnPathMap(InptStkRpl_LstR.$str_ln_cd, MST_INPT_STK_RPL_LST_R.$str_ln_cd);
			addColumnPathMap(InptStkRpl_LstR.$wg_cd, MST_INPT_STK_RPL_LST_R.$wg_cd);
			addColumnPathMap(InptStkRpl_LstR.$schd_dt, MST_INPT_STK_RPL_LST_R.$schd_dt);
			addColumnPathMap(InptStkRpl_LstR.$itm_cd, MST_INPT_STK_RPL_LST_R.$itm_cd);
			addColumnPathMap(InptStkRpl_LstR.$itm_sub1, MST_INPT_STK_RPL_LST_R.$itm_sub1);
			addColumnPathMap(InptStkRpl_LstR.$itm_sub2, MST_INPT_STK_RPL_LST_R.$itm_sub2);
			addColumnPathMap(InptStkRpl_LstR.$itm_sub3, MST_INPT_STK_RPL_LST_R.$itm_sub3);
			addColumnPathMap(InptStkRpl_LstR.$alt_grp_id, MST_INPT_STK_RPL_LST_R.$alt_grp_id);
			addColumnPathMap(InptStkRpl_LstR.$upd_cntr, MST_INPT_STK_RPL_LST_R.$upd_cntr);

		}
	}

/////////////////////////////////////////////////////////////////////////
// 引当関連処理 ////////////////////////////////////////////////////////////
	
	/**
	 * 引当対象の投入情報リストを引当順にソートする
	 */
	protected void sortForAlloc(MCList<MST_INPT_STK_RPL_LST_R> inptL) {
		setSortColsForAlloc(inptL);
		MCSortPolicy sp = new MCSortPolicy();
		sp.add(SortType.ASC, _$sort_dt);
		sp.add(SortType.ASC, MST_INPT_STK_RPL_LST_R.$io_schd_sts_typ);
		sp.add(SortType.ASC, MST_INPT_STK_RPL_LST_R.$io_schd_no);
		sp.add(SortType.ASC, MST_INPT_STK_RPL_LST_R.$alt_grp_id);
		sp.add(SortType.ASC, MST_INPT_STK_RPL_LST_R.$schd_dt);	// 代替Ｇ内は予定日順
		inptL.sort(sp);
	}

	/**
	 * 引当対象のソート用項目
	 */
	protected static final String _$sort_dt = "__sort_dt__"; 

	/**
	 * 引当対象のソート用に項目を設定する
	 */
	protected void setSortColsForAlloc(MCList<MST_INPT_STK_RPL_LST_R> inptL) {
		for (MST_INPT_STK_RPL_LST_R r : inptL) {
			r.setDateNE(_$sort_dt, r.schd_dt());
		}
		// 代替品はグループ内で最小の日を設定
		for (MCList<MST_INPT_STK_RPL_LST_R>
				l : inptL.groupList(MST_INPT_STK_RPL_LST_R.$alt_grp_id)) {
			if (!isNull(l.get(0).alt_grp_id())) {
				l.setDate(_$sort_dt, (MCDate)l.min(MST_INPT_STK_RPL_LST_R.$schd_dt));
			}
		}
	}

	/**
	 * 引当処理を実行する
	 * @param inptL	投入情報リスト
	 * @param isXfrSchd	移送予定作成から呼ばれた場合に「true」
	 * @return	引当した結果
	 */
	protected MSBEL_AllocMngService.Alloc_Srch01 alloc(
			MCList<MST_INPT_STK_RPL_LST_R> inptL, boolean isXfrSchd) {

		if (isNull(inptL)) {
			return MSBEL_AllocMngService.crtAlloc_Srch01();
		}

		MCList<MST_INPT_STK_RPL_LST_R> itmLocL = inptL.groupBy(
				MST_INPT_STK_RPL_LST_R.$itm_cd, MST_INPT_STK_RPL_LST_R.$itm_sub1,
				MST_INPT_STK_RPL_LST_R.$itm_sub2, MST_INPT_STK_RPL_LST_R.$itm_sub3,
				MST_INPT_STK_RPL_LST_R.$loc_cd);
		
		MSBEL_AllocMngService.Alloc_Lock_Upd01 lockOpe = MSBEL_AllocMngService.crtAlloc_Lock_Upd01();
		addAll(lockOpe.up0(), itmLocL, createMap_MSW_ALLOC_LOC_MAP_R_MST_INPT_STK_RPL_LST_R());
		lockOpe.exec();
		
		setPegNo(inptL);
		MSBEL_AllocMngService.Alloc_Srch01
			allocOpe = MSBEL_AllocMngService.crtAlloc_Srch01();
		allocOpe.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
		allocOpe.up0().dtl_flg(true);
		allocOpe.up0().xfr_src_typ(MSC_XFR_SRC_TYP.INPT_RPL.value());
		addAll(allocOpe.up1(), inptL, isXfrSchd, createMap_Srch_TgtR_MST_INPT_STK_RPL_LST_R());
		allocOpe.exec();

		return allocOpe;
	}

	protected Map_MSW_ALLOC_LOC_MAP_R_MST_INPT_STK_RPL_LST_R<MSW_ALLOC_LOC_MAP_R,MST_INPT_STK_RPL_LST_R> createMap_MSW_ALLOC_LOC_MAP_R_MST_INPT_STK_RPL_LST_R() {
		return new Map_MSW_ALLOC_LOC_MAP_R_MST_INPT_STK_RPL_LST_R<MSW_ALLOC_LOC_MAP_R, MST_INPT_STK_RPL_LST_R>();
	}

	public class Map_MSW_ALLOC_LOC_MAP_R_MST_INPT_STK_RPL_LST_R<D extends MSW_ALLOC_LOC_MAP_R, S extends MST_INPT_STK_RPL_LST_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_cd, MST_INPT_STK_RPL_LST_R.$itm_cd);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub1, MST_INPT_STK_RPL_LST_R.$itm_sub1);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub2, MST_INPT_STK_RPL_LST_R.$itm_sub2);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub3, MST_INPT_STK_RPL_LST_R.$itm_sub3);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$inpt_loc_cd, MST_INPT_STK_RPL_LST_R.$loc_cd);
		}
		
	}

	
	protected Map_Srch_TgtR_MST_INPT_STK_RPL_LST_R<Srch_TgtR,MST_INPT_STK_RPL_LST_R> createMap_Srch_TgtR_MST_INPT_STK_RPL_LST_R() {
		return new Map_Srch_TgtR_MST_INPT_STK_RPL_LST_R<Srch_TgtR, MST_INPT_STK_RPL_LST_R>();
	}

	public class Map_Srch_TgtR_MST_INPT_STK_RPL_LST_R<D extends Srch_TgtR, S extends MST_INPT_STK_RPL_LST_R> extends FXUCC_RowMapperWith<D,S,Boolean>{
		
		protected boolean _isXfrSchd;
		
		@Override
		public void setWith(Boolean fixedData) {
			_isXfrSchd = fixedData;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch_TgtR.$peg_no, MST_INPT_STK_RPL_LST_R.$peg_no);
			addColumnPathMap(Srch_TgtR.$inpt_schd_dt, MST_INPT_STK_RPL_LST_R.$schd_dt);
			addColumnPathMap(Srch_TgtR.$itm_cd, MST_INPT_STK_RPL_LST_R.$itm_cd);
			addColumnPathMap(Srch_TgtR.$itm_sub1, MST_INPT_STK_RPL_LST_R.$itm_sub1);
			addColumnPathMap(Srch_TgtR.$itm_sub2, MST_INPT_STK_RPL_LST_R.$itm_sub2);
			addColumnPathMap(Srch_TgtR.$itm_sub3, MST_INPT_STK_RPL_LST_R.$itm_sub3);
			addColumnPathMap(Srch_TgtR.$ver_no, MST_INPT_STK_RPL_LST_R.$ver_no);
			addColumnPathMap(Srch_TgtR.$inpt_loc_cd, MST_INPT_STK_RPL_LST_R.$loc_cd);
			addColumnPathMap(Srch_TgtR.$inpt_str_ln_cd, MST_INPT_STK_RPL_LST_R.$str_ln_cd);
			addColumnPathMap(Srch_TgtR.$quality_typ, MST_INPT_STK_RPL_LST_R.$quality_typ);
			addColumnPathMap(Srch_TgtR.$stk_id_typ, MST_INPT_STK_RPL_LST_R.$stk_id_typ);
			addColumnPathMap(Srch_TgtR.$stk_bp_cd, MST_INPT_STK_RPL_LST_R.$stk_bp_cd);
			addColumnPathMap(Srch_TgtR.$gi_stk_arrv_bp_cd, MST_INPT_STK_RPL_LST_R.$stk_arrv_bp_cd);
			addColumnPathMap(Srch_TgtR.$gd_cd, MST_INPT_STK_RPL_LST_R.$gd_cd);
			addColumnPathMap(Srch_TgtR.$lot_no, MST_INPT_STK_RPL_LST_R.$lot_no);
			addColumnPathMap(Srch_TgtR.$sublot_no, MST_INPT_STK_RPL_LST_R.$sublot_no);
			addColumnPathMap(Srch_TgtR.$sno1, MST_INPT_STK_RPL_LST_R.$sno1);
			addColumnPathMap(Srch_TgtR.$sno1_null_flg, MST_INPT_STK_RPL_LST_R.$sno1_null_flg);
			addColumnPathMap(Srch_TgtR.$sno2, MST_INPT_STK_RPL_LST_R.$sno2);
			addColumnPathMap(Srch_TgtR.$sno2_null_flg, MST_INPT_STK_RPL_LST_R.$sno2_null_flg);
			addColumnPathMap(Srch_TgtR.$sno3, MST_INPT_STK_RPL_LST_R.$sno3);
			addColumnPathMap(Srch_TgtR.$sno3_null_flg, MST_INPT_STK_RPL_LST_R.$sno3_null_flg);
			addColumnPathMap(Srch_TgtR.$sno4, MST_INPT_STK_RPL_LST_R.$sno4);
			addColumnPathMap(Srch_TgtR.$sno4_null_flg, MST_INPT_STK_RPL_LST_R.$sno4_null_flg);
			addColumnPathMap(Srch_TgtR.$base_unit_cd, MST_INPT_STK_RPL_LST_R.$base_unit_cd);
			addColumnPathMap(Srch_TgtR.$base_unit_qty, MST_INPT_STK_RPL_LST_R.$short_qty);
			addColumnPathMap(Srch_TgtR.$vld_dt_fr, MST_INPT_STK_RPL_LST_R.$vld_dt_fr);

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			if (isAlt(src)) {
				dest.alt_flg(true);
				dest.alt_grp_cd(src.alt_grp_cd());
				dest.alt_grp_seq(src.alt_grp_seq());
				dest.alt_itm_typ(src.alt_itm_typ());
				dest.alt_alloc_prio(src.alt_alloc_prio());
				dest.oper_inst_no(src.alt_grp_id());
			}
			dest.not_lot_mix_flg(src.not_lot_mix_flg());
			dest.not_sublot_mix_flg(src.not_sublot_mix_flg());
			
			dest.io_schd_typ(MSC_IO_SCHD_TYP.INPT.value());
			
			if (isNullOrNullVal(src.lot_no()) && isNullOrNullVal(src.sublot_no())) {
				dest.not_lot_fix_flg(true);
			}
			
			if (_isXfrSchd) {
				// 引当対象リストから入庫場所除く
				dest.gr_loc_cd(src.loc_cd());
				dest.gr_str_ln_cd(src.str_ln_cd());
				// 代替品目指定されていない代替品目行は引当対象から除く
				if (src.getBooleanNE("exclude_alloc_flg")) {
					dest.base_unit_qty(0);
				}
			}
			else {
				if (src.alloc_flg()) {
					// 引当済の不足リストを取得するため、引当しない（数量ゼロで引当サービスを呼出する）
					dest.base_unit_qty(0);
				}
			}
		}
	}

	/**
	 * 引当結果から不足情報を生成します
	 * 
	 * @param inptL	投入情報リスト
	 * @param allocOpe	引当サービス
	 * @param rplL	不足情報リスト
	 * @param isXfrSchd	移送予定作成から呼出す場合にtrue
	 */
	protected void addInptStkRplLst(
			MCList<MST_INPT_STK_RPL_LST_R> inptL,
			MSBEL_AllocMngService.Alloc_Srch01 allocOpe,
			MCList<MST_INPT_STK_RPL_LST_R> rplL, boolean isXfrSchd) {
		if (isNull(inptL)) {
			return;
		}

		// 引当済の出庫予定に対する不足情報を作成する
		if (!isXfrSchd) {
			addAllocedInptStkRplLst(rplL, allocOpe.down3(), inptL);
		}

		// 未引当の投入指図情報に対する不足情報を作成する
		MCList<MST_INPT_STK_RPL_LST_R> 
			nrmlL = MCList.create(MST_INPT_STK_RPL_LST_R.class),
			altL = MCList.create(MST_INPT_STK_RPL_LST_R.class);
		for (MST_INPT_STK_RPL_LST_R inptR : inptL) {
			// 投入情報以外、引当済は対象外
			if (!isXfrSchd && (!isInpt(inptR) || inptR.alloc_flg())) {
				continue;
			}

			if (isNrml(inptR)) {
				nrmlL.add(inptR);
			}
			else if (isAlt(inptR) && inptR.short_qty().gt(MCNumber.ZERO)) {
				altL.add(inptR);
			}
		}
		
		addNotAllocedNrmlInptStkRplLst(rplL, allocOpe.down0(), nrmlL, isXfrSchd);
		addNotAllocedAltInptStkRplLst(rplL, allocOpe.down0(), altL, isXfrSchd);
	}


	/**
	 * 引当処理を実行する前に<br>
	 * 既に引当済かつ在庫が不足している投入情報を不足情報として設定する
	 * 
	 * @param rplL	不足情報リスト
	 * @param allocedL	引当結果（引当済かつ不足分）
	 * @param inptL	投入情報リスト
	 */
	protected void addAllocedInptStkRplLst(
			MCList<MST_INPT_STK_RPL_LST_R> rplL,
			MCList<Srch_RsltR> allocedL,
			MCList<MST_INPT_STK_RPL_LST_R> inptL) {
		if (isNull(allocedL)) {
			return;
		}

		MCIndexKey idx = inptL.createIndex(MST_INPT_STK_RPL_LST_R.$io_schd_no,
				MST_INPT_STK_RPL_LST_R.$io_schd_seq, MST_INPT_STK_RPL_LST_R.$io_schd_typ);
		for (Srch_RsltR allocedR : allocedL) {
			if (isNullOr(allocedR.io_schd_typ(), allocedR.io_schd_no(), allocedR.io_schd_seq())
				|| !isSame(allocedR.inpt_loc_cd(), allocedR.stk_loc_cd())
				|| !isSame(allocedR.inpt_str_ln_cd(), allocedR.stk_str_ln_cd())) {
				continue;
			}

			// 投入指図
			if (isInptInst(allocedR)) {
				MST_INPT_STK_RPL_LST_R inptR = inptL.getFirst(idx, allocedR.io_schd_no(),
						allocedR.io_schd_seq(), allocedR.io_schd_typ());
				if (inptR == null) {
					continue;
				}
				// 未引当は作成しない
				else if (!inptR.alloc_flg()) {
					continue;
				}
				else {
					inptR.short_qty(allocedR.base_unit_qty());
					rplL.add(inptR);
				}
			}
		}
	}

	
	/**
	 * 投入情報、引当結果から通常品の不足情報を取得する
	 * 
	 * @param rplL	不足情報リスト
	 * @param allocedL	引当結果
	 * @param inptL	投入情報リスト
	 * @param isXfrSchd	移送予定作成から呼出す場合true
	 */
	protected void addNotAllocedNrmlInptStkRplLst(
			MCList<MST_INPT_STK_RPL_LST_R> rplL,
			MCList<Srch_RsltR> allocedL,
			MCList<MST_INPT_STK_RPL_LST_R> inptL,
			boolean isXfrSchd) {

		MCIndexKey idx = allocedL.createIndex(Srch_RsltR.$peg_no);
		for (MST_INPT_STK_RPL_LST_R inptR : inptL) {
			if (inptR.short_qty().lte(MCNumber.ZERO)) {
				continue;
			}

			// 投入情報に対応する引当結果を取得
			MCList<Srch_RsltR> allocedSubL = allocedL.subList(idx, inptR.peg_no());

			// 投入場所の引当済数
			MCNumber inptLocQty = isXfrSchd ?
					getAllocedQty(inptR, allocedSubL) : getInptLocQty(inptR, allocedSubL);
			// 投入場所の不足数
			MCNumber shortQty = inptR.short_qty().subtract(inptLocQty);
			// 投入場所以外で引当された分は不足とみなす
			if (shortQty.gt(MCNumber.ZERO)) {
				inptR.short_qty(shortQty);
				rplL.add(inptR);
			}
		}
	}

	/**
	 * 投入情報、引当結果から代替品の不足情報を取得する
	 * 
	 * @param rplL	不足情報リスト
	 * @param allocedL	引当結果
	 * @param inptL	投入情報リスト
	 * @param isXfrSchd	移送予定作成から呼出す場合true
	 */
	protected void addNotAllocedAltInptStkRplLst(MCList<MST_INPT_STK_RPL_LST_R> rplL,
			MCList<Srch_RsltR> allocedL, MCList<MST_INPT_STK_RPL_LST_R> inptL,
			boolean isXfrSchd) {

		final String actQtyCol = "__alloced_qty__";
		inptL.addNumberColumn(actQtyCol);

		// 引当結果の合計値を算出する
		for (MST_INPT_STK_RPL_LST_R inptR : inptL) {
			MCList<Srch_RsltR> allocedSubL = allocedL.subList(Srch_RsltR.$peg_no,
					inptR.peg_no());
			// 投入場所の引当済数
			MCNumber inptLocQty = isXfrSchd ? getAllocedQty(inptR, allocedSubL)
					: getInptLocQty(inptR, allocedSubL);
			inptR.setNumber(actQtyCol, inptLocQty);
		}

		// 代替グループごとの残数を算出する
		for (MCList<MST_INPT_STK_RPL_LST_R> altL : inptL
				.groupList(MST_INPT_STK_RPL_LST_R.$alt_grp_id)) {
			MSUCL_ProdUtil.reCalcAltQty(altL, MST_INPT_STK_RPL_LST_R.$short_qty,
					actQtyCol, MST_INPT_STK_RPL_LST_R.$base_dec_place,
					MST_INPT_STK_RPL_LST_R.$short_qty);
			boolean isShort = true;
			for (MST_INPT_STK_RPL_LST_R r : altL) {
				if (MCNumber.ZERO.gte(r.short_qty())) {
					isShort = false;
					break;
				}

			}
			if (isShort) {
				altL.sort(MST_INPT_STK_RPL_LST_R.$alt_alloc_prio,
						MST_INPT_STK_RPL_LST_R.$itm_cd, MST_INPT_STK_RPL_LST_R.$itm_sub1,
						MST_INPT_STK_RPL_LST_R.$itm_sub2,
						MST_INPT_STK_RPL_LST_R.$itm_sub3);
				rplL.addAll(altL);
			}
		}
	}
	
	/**
	 * 投入場所の引当済数を取得する
	 * 
	 * @param inptR	投入情報
	 * @param allocedSubL	引当結果
	 * @return	投入場所の引当済数
	 */
	protected MCNumber getInptLocQty(
			MST_INPT_STK_RPL_LST_R inptR, MCList<Srch_RsltR> allocedSubL) {

		MCNumber inptLocQty = MCNumber.ZERO;
		for (Srch_RsltR allocedSubR : allocedSubL) {
			if (isSame(inptR.loc_cd(), allocedSubR.stk_loc_cd())
					&& isSame(inptR.str_ln_cd(), allocedSubR.stk_str_ln_cd())) {
				inptLocQty = inptLocQty.add(allocedSubR.base_unit_qty());
			}
		}
		return inptLocQty;
	}

	/**
	 * 投入場所関係なく、全引当済数を取得する
	 * 
	 * @param inptR	投入情報
	 * @param allocedSubL	引当結果
	 * @return	投入場所の引当済数
	 */
	protected MCNumber getAllocedQty(
			MST_INPT_STK_RPL_LST_R inptR, MCList<Srch_RsltR> allocedSubL) {

		MCNumber allocedQty = MCNumber.ZERO;
		for (Srch_RsltR allocedSubR : allocedSubL) {
			allocedQty = allocedQty.add(allocedSubR.base_unit_qty());
		}
		return allocedQty;
	}
	
	
	/**
	 * 通常品目として扱うか否か
	 * @return true:通常品目として扱う
	 */
	protected boolean isNrml(MST_INPT_STK_RPL_LST_R r) {
		return isNull(r.alt_grp_cd());
	}
	
	/**
	 * 代替グループとして扱うか否か
	 * @return true:代替グループとして扱う
	 */
	protected boolean isAlt(MST_INPT_STK_RPL_LST_R r) {
		return !isNrml(r);
	}
	
	/**
	 * 投入に関する受払予定かどうか
	 * @return true:投入に関する受払予定である
	 */
	protected boolean isInpt(MST_INPT_STK_RPL_LST_R r) {
		return MSC_IO_SCHD_TYP.isINPT(r.io_schd_typ())
				|| MSC_IO_SCHD_TYP.isINPT_PLN(r.io_schd_typ());
	}	
	
	protected boolean isInptInst(Srch_RsltR r) {
		if (!MSC_IO_SCHD_TYP.isINPT(r.io_schd_typ())) {
			return false;
		}
		return MSC_IO_SCHD_STS_TYP.isMFG_SAV(r.io_schd_sts_typ())
				|| MSC_IO_SCHD_STS_TYP.isORD(r.io_schd_sts_typ())
				|| MSC_IO_SCHD_STS_TYP.isSTT(r.io_schd_sts_typ());
	}
	
/////////////////////////////////////////////////////////////////////////
// スレッド分割関連処理 ////////////////////////////////////////////////////////
	
	/**
	 * 不足情報・移送予定作成対象リストのインデックス
	 */
	protected MCIndexKey _itmIdx = null, _altIdx = null;

	/**
	 * ひとつのスレッドで実行する処理単位を取得する<br>
	 * 処理単位は同一の品目とする<br>
	 * ただし、代替品が含まれる場合は、その子品目も含める
	 * 
	 * @param dtlL	処理対象のリスト
	 * @return	処理単位のリスト
	 */
	@SuppressWarnings("unchecked")
	protected MCList<InptStkRpl_DtlR>[] getThrdGrpList(MCList<InptStkRpl_DtlR> dtlL) {

		ArrayList<MCList<InptStkRpl_DtlR>>
			arr = null, ret = new ArrayList<>();
		for (MCList<InptStkRpl_DtlR> pgL : dtlL.groupList(InptStkRpl_DtlR.$wg_cd)) {
			_itmIdx = pgL.createIndex(InptStkRpl_DtlR.$itm_cd, InptStkRpl_DtlR.$itm_sub1,
					InptStkRpl_DtlR.$itm_sub2, InptStkRpl_DtlR.$itm_sub3);
			_altIdx = pgL.createIndex(InptStkRpl_DtlR.$alt_grp_cd);

			arr = new ArrayList<>();
			for (InptStkRpl_DtlR r : pgL) {
				MCList<InptStkRpl_DtlR> l = getThrdGrpList(r, false, pgL);
				if (!isNull(l)) {
					arr.add(l);
				}
			}
			pgL.setStatus(MCRow.NONE);	// 後始末

			if (!arr.isEmpty()) {
				// 上限数でまとめる
				ret.addAll(sumThrdGrpList(arr));
			}
		}
		return ret.toArray(new MCList[ret.size()]);
	}

	/**
	 * ひとつのスレッドで実行する処理単位を上限数に従ってまとめる
	 * 
	 * @param arr	処理単位のリスト
	 * @return	処理単位のリスト（まとめ後）
	 */
	protected ArrayList<MCList<InptStkRpl_DtlR>>
			sumThrdGrpList(ArrayList<MCList<InptStkRpl_DtlR>> arr) {

		ArrayList<MCList<InptStkRpl_DtlR>> ret = new ArrayList<>();
		if (arr.isEmpty()) {
			return ret;
		}

		// リソースから上限数を取得
		int limit = getLimitSize();
		// まとめない
		if (limit == 0) {
			ret = arr;
		}
		// 上限なしでまとめる
		else if (limit < 0) {
			for (int i=1; i<arr.size(); i++) {
				arr.get(0).addAll(arr.get(i));
			}
			ret.add(arr.get(0));
		}
		// 上限の範囲内でまとめる
		else {
			// 処理対象件数の多い順
			Collections.sort(arr, new Comparator<MCList<InptStkRpl_DtlR>>() {
				public int compare(
						MCList<InptStkRpl_DtlR> o1, MCList<InptStkRpl_DtlR> o2) {
					int
						sum1 = o1.sum(InptStkRpl_DtlR.$total_cnt).intValue(),
						sum2 = o2.sum(InptStkRpl_DtlR.$total_cnt).intValue();
					return (sum1 - sum2) * -1;
				}
			});
			MCList<InptStkRpl_DtlR> addL = MCList.create(InptStkRpl_DtlR.class);
			for (int i=0, j=arr.size()-1; i<=j; i++) {
				addL.setAll(arr.get(i));

				// 処理対象件数が上限を超えていたらそのまま
				int size = addL.sum(InptStkRpl_DtlR.$total_cnt).intValue();
				if (size < limit) {
					// 処理対象件数が少ないやつから順に加算する
					for (; j>i; j--) {
						MCList<InptStkRpl_DtlR> l = arr.get(j);
						size += l.sum(InptStkRpl_DtlR.$total_cnt).intValue();
						if (size > limit) {
							break;
						}
						addL.addAll(l);
					}
				}
				// 上限を超えた or do～while が最後まで回った
				if (!ret.contains(addL)) {
					ret.add(addL);
					addL = MCList.create(InptStkRpl_DtlR.class);
				}
			}
		}
		return ret;
	}

	/**
	 * ひとつのスレッドで実行する処理単位を取得する<br>
	 * 処理単位は同一の品目とする<br>
	 * ただし、代替品が含まれる場合は、その子品目も含める
	 * 
	 * @param dtlR	処理単位の起点とする品目
	 * @param isRec	再帰呼び出しか
	 * @param dtlL	処理対象のリスト
	 * @return	処理単位のリスト
	 */
	protected MCList<InptStkRpl_DtlR> getThrdGrpList(
			InptStkRpl_DtlR dtlR, boolean isRec, MCList<InptStkRpl_DtlR> dtlL) {

		if (dtlR.isStatusDelete()) {
			return null;
		}

		MCList<InptStkRpl_DtlR>
			retL = MCList.create(InptStkRpl_DtlR.class),
			itmL = dtlL.subList(_itmIdx, dtlR.toArray(_itmIdx.getKeys()));
		retL.addAll(itmL);
		itmL.setStatus(MCRow.DELETE);	// 取得済みの目印

		for (InptStkRpl_DtlR r : itmL) {
			// 通常品、または再帰呼び出しかつ呼び出し元のロウと同じ場合は無視
			if (isNull(r.alt_grp_cd()) || isRec && r == dtlR) {
				continue;
			}
			for (InptStkRpl_DtlR altR : dtlL.subList(_altIdx, r.toArray(_altIdx.getKeys()))) {
				if (!altR.isStatusDelete()) {
					retL.addAll(getThrdGrpList(altR, true, dtlL));
				}
			}
		}
		return retL;
	}

	/**
	 * スレッド内での処理対象の上限を取得する<br>
	 * 上限数によるまとめは以下の通り
	 * <ul>
	 * <li>上限数＜０の場合、上限数を無制限にまとめる
	 * <li>上限数＝０の場合、まとめない
	 * <li>上限数＞０の場合、上限数の範囲内でまとめる
	 * </ul>
	 * 
	 * @param size	処理対象件数
	 * @return	スレッド内の処理対象の上限数
	 */
	protected int getLimitSize() {
		String key = MCConst.createKey(
								MCSys.request.moduleId(),
								MCSys.request.logicId(),
								MCSys.request.operationId(),
								"limit_size");
		return MCConst.app.getInteger(key, 1000);
	}

	//FMCB CUSTOM END
}