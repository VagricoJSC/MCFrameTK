package mcframe.serverMSBE.MSBEL5090;

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
import mcframe.serverMSBE.MSBEL5090.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBE.MSBEL5090.Query.*;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.requester.MCServerThreadManager;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import mcframe.serverMSBE.MSBEL5040.*;
import mcframe.serverMSBE.MSBEL5200.*;
import mcframe.serverMSBE.MSBEL5520.*;
import mcframe.commonFXUC.FXUCC0090.FXUCC_RowMapperWith;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverFXUC.FXUCL0030.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ShipStkRplService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ShipStkRplService_MC extends MSBEL_ShipStkRplService_MC_A{
	//FMCB CUSTOM START

	protected static final String _tmp_valid_dt_fr = "tmp_valid_dt_fr";
	protected static final String _tmp_valid_dt_fr_grp = "tmp_valid_dt_fr_grp";
	protected static final String _tmp_valid_dt_to = "tmp_valid_dt_to";

	/**
	 * ShipStkRpl_Ins01オペレーション.<p>
	 *
	 */
	public class ShipStkRpl_Ins01 extends MSBEL_ShipStkRplService_MC_A.ShipStkRpl_Ins01 {
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
			// 不足情報を削除
			delShipStkRplLst();
			MCList<ShipStkRpl_DtlR> dtlL = getDtlL(up0(), up1());
			callShipStkRplService(dtlL);
		}
		
		protected boolean isInvalidUpParam() {
			boolean boo = isNull(up1());
			boo = boo || isNullOr(up0().tm_fr(), up0().tm_to());
			return boo;
		}
		
		protected void editUp() {
			if (up0().schd_flg()) {
				up0().addStringColumn("w_schd", MSC_IO_SCHD_STS_TYP.SCHD.value());
			}
			if (up0().slo_flg()) {
				up0().addStringColumn("w_slo", MSC_IO_SCHD_STS_TYP.SLO.value());
			}
			if (up0().prms_flg()) {
				up0().addStringColumn("w_prms", MSC_IO_SCHD_STS_TYP.PRMS.value());
			}
			if (up0().dlv_inst_flg()) {
				up0().addStringColumn("w_dlv_inst", MSC_IO_SCHD_STS_TYP.DLV_INST.value());
			}
			if (up0().ord_flg()) {
				up0().addStringColumn("w_ord", MSC_IO_SCHD_STS_TYP.ORD.value());
			}

			if (up0().alloc_flg() && !up0().not_alloc_flg()) {
				up0().addStringColumn("w_alloc", toTrueStr(true));
			}
			else if (!up0().alloc_flg() && up0().not_alloc_flg()) {
				up0().addStringColumn("w_not_alloc", toFalseStr(false));
			}
		}
		
		protected void delShipStkRplLst() {
			MSBEL_ShipStkRplService.ShipStkRpl_LstDel01 ope = MSBEL_ShipStkRplService.crtShipStkRpl_LstDel01();
			ope.up0().setAll(up1());
			ope.exec();
			
			down0().lst_del_cnt(ope.down0().lst_del_cnt());
		}
		
		protected void callShipStkRplService(MCList<ShipStkRpl_DtlR> dtlL) {
			if (isNull(dtlL)) {
				return ;
			}
			
			List<MSBEL_ShipStkRplService.ShipStkRpl_Ins02> opeL = new ArrayList<>();
			for (MCList<ShipStkRpl_DtlR> lst : getThrdGrpList(dtlL)) {
				MSBEL_ShipStkRplService.ShipStkRpl_Ins02 o = MSBEL_ShipStkRplService.crtShipStkRpl_Ins02();
				MCRow.copyvalue(o.up0(), up0());
				o.up1().addAll(lst);
				opeL.add(o);
			}

			// 件数の降順に並び替え
			Collections.sort(opeL, new Comparator<MSBEL_ShipStkRplService.ShipStkRpl_Ins02>() {
				public int compare(
						MSBEL_ShipStkRplService.ShipStkRpl_Ins02 o1, MSBEL_ShipStkRplService.ShipStkRpl_Ins02 o2) {
					int
						sum1 = o1.up1().sum(ShipStkRpl_DtlR.$total_cnt).intValue(),
						sum2 = o2.up1().sum(ShipStkRpl_DtlR.$total_cnt).intValue();
					return (sum1 - sum2) * -1;
				}
			});
			
			if (!opeL.isEmpty()) {
				MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
			}
			
			
			MCNumber xfrDelCnt = MCNumber.ZERO;
			MCNumber shipIoSchdCnt = MCNumber.ZERO;
			MCNumber lstCrtCnt = MCNumber.ZERO;
			MCNumber xfrCrtSuccessCnt = MCNumber.ZERO;
			MCNumber xfrCrtErrorCnt = MCNumber.ZERO;
			MCNumber lstDelOfXfrCrtCnt = MCNumber.ZERO;
			for (MSBEL_ShipStkRplService.ShipStkRpl_Ins02 ope : opeL) {
				xfrDelCnt = xfrDelCnt.add(nvl(ope.down0().xfr_del_cnt(), MCNumber.ZERO));
				shipIoSchdCnt = shipIoSchdCnt.add(nvl(ope.down0().ship_io_schd_cnt(), MCNumber.ZERO));
				lstCrtCnt = lstCrtCnt.add(nvl(ope.down0().lst_crt_cnt(), MCNumber.ZERO));
				xfrCrtSuccessCnt = xfrCrtSuccessCnt.add(nvl(ope.down0().xfr_crt_success_cnt(), MCNumber.ZERO));
				xfrCrtErrorCnt = xfrCrtErrorCnt.add(nvl(ope.down0().xfr_crt_error_cnt(), MCNumber.ZERO));
				lstDelOfXfrCrtCnt = lstDelOfXfrCrtCnt.add(nvl(ope.down0().lst_del_of_xfr_crt_cnt(), MCNumber.ZERO));
			}
			down0().xfr_del_cnt(xfrDelCnt);
			down0().ship_io_schd_cnt(shipIoSchdCnt);
			down0().lst_crt_cnt(lstCrtCnt);
			down0().xfr_crt_success_cnt(xfrCrtSuccessCnt);
			down0().xfr_crt_error_cnt(xfrCrtErrorCnt);
			down0().lst_del_of_xfr_crt_cnt(lstDelOfXfrCrtCnt);
		}
	}
	/**
	 * ShipStkRpl_Ins02オペレーション.<p>
	 *
	 */
	public class ShipStkRpl_Ins02 extends MSBEL_ShipStkRplService_MC_A.ShipStkRpl_Ins02 {
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
			MCList<ShipStkRpl_LstR> rplL = crtShipStkRplLst();
			crtXfrSchd(rplL);
		}
		
		protected void delXfrSchd() {
			if (!up0().xfr_schd_del_flg()) {
				return ;
			}
			MSBEL_ShipStkRplService.ShipStkRpl_XfrDel01 ope = MSBEL_ShipStkRplService.crtShipStkRpl_XfrDel01();
			MCRow.copyvalue(ope.up0(), up0());
			ope.up1().addAll(up1());
			ope.exec();
			
			down0().xfr_del_cnt(ope.down0().xfr_del_cnt());
		}
		
		protected MCList<ShipStkRpl_LstR> crtShipStkRplLst() {
			MSBEL_ShipStkRplService.ShipStkRpl_LstIns01 ope = MSBEL_ShipStkRplService.crtShipStkRpl_LstIns01();
			MCRow.copyvalue(ope.up0(), up0());
			ope.up1().addAll(up1());
			ope.exec();
			
			down0().ship_io_schd_cnt(ope.down1().ship_io_schd_cnt());
			down0().lst_crt_cnt(ope.down1().lst_crt_cnt());
			return ope.down0();
		}
		
		protected void crtXfrSchd(MCList<ShipStkRpl_LstR> rplL) {
			if (!up0().xfr_schd_crt_flg() || isNull(rplL)) {
				return ;
			}
			
			MSBEL_ShipStkRplService.ShipStkRpl_XfrIns01 ope = MSBEL_ShipStkRplService.crtShipStkRpl_XfrIns01();
			MCRow.copyvalue(ope.up0(), up0());
			ope.up1().addAll(rplL);
			ope.exec();
			
			down0().lst_del_of_xfr_crt_cnt(ope.down1().lst_del_of_xfr_crt_cnt());
			down0().xfr_crt_success_cnt(ope.down1().xfr_crt_success_cnt());
			down0().xfr_crt_error_cnt(ope.down1().xfr_crt_error_cnt());
		}
	}
	
	/**
	 * ShipStkRpl_Ins03オペレーション.<p>
	 *
	 */
	public class ShipStkRpl_Ins03 extends MSBEL_ShipStkRplService_MC_A.ShipStkRpl_Ins03 {
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
			
			MCList<MST_SHIP_STK_RPL_LST_R> rplL = srchShipStkRplLst();
			chkShipStkRplLst(rplL);
			MCList<MST_SHIP_STK_RPL_LST_R> notErrL = rplL.subList("err_flg", false);
			crtXfrSchd(notErrL);
		}
		
		protected boolean isInvalidUpParam() {
			boolean boo = isNull(up0());
			return boo;
		}
		
		protected MCList<MST_SHIP_STK_RPL_LST_R> srchShipStkRplLst() {
			MCList<MST_SHIP_STK_RPL_LST_R> dbcL = MCList.create(MST_SHIP_STK_RPL_LST_R.class);
			MST_SHIP_STK_RPL_LST_R t = MST_SHIP_STK_RPL_LST_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL.addBooleanColumn("err_flg");

			dbcL_bldr.setSelect(t.batch_data_no);
			dbcL_bldr.addSelect(t.loc_cd);
			dbcL_bldr.addSelect(t.str_ln_cd);
			dbcL_bldr.addSelect(t.wg_cd);
			dbcL_bldr.addSelect(t.itm_cd);
			dbcL_bldr.addSelect(t.itm_sub1);
			dbcL_bldr.addSelect(t.itm_sub2);
			dbcL_bldr.addSelect(t.itm_sub3);
			dbcL_bldr.addSelect(t.schd_dt);
			dbcL_bldr.addSelect(t.upd_cntr);
			dbSelectKey("MSBEL5090_MST_SHIP_STK_RPL_LST_S01", dbcL, dbcL_bldr, up1());
			
			return dbcL;
		}
		
		protected void chkShipStkRplLst(MCList<MST_SHIP_STK_RPL_LST_R> dbcL) {
			MCIndexKey  idxkey = dbcL.createIndex(MST_SHIP_STK_RPL_LST_R.$batch_data_no);
			
			MCMessageList msgL = new MCMessageList();
			for (ShipStkRpl_LstR r : up1()) {
				MST_SHIP_STK_RPL_LST_R selectR = dbcL.getFirst(idxkey, r.batch_data_no());
				if (isNull(selectR)) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
					msgL.addAll(checkUpdCntrNE(r, ShipStkRpl_LstR.$upd_cntr, selectR));
				}
				else {
					MCMessageList tmpMsgL = checkUpdCntrNE(r, ShipStkRpl_LstR.$upd_cntr, selectR);
					if (!tmpMsgL.isEmpty()) {
						r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
						selectR.setBoolean("err_flg", true);
						msgL.addAll(tmpMsgL);
					}
					selectR.setAttributes(r);
				}
			}
			MCMessagePool.addAll(msgL);
		}
		
		protected void crtXfrSchd(MCList<MST_SHIP_STK_RPL_LST_R> dbcL) {
			if (isNull(dbcL)) {
				return ;
			}
			
			MCIndexKey idx = dbcL.createIndex(MST_SHIP_STK_RPL_LST_R.$itm_cd,
					MST_SHIP_STK_RPL_LST_R.$itm_sub1, MST_SHIP_STK_RPL_LST_R.$itm_sub2,
					MST_SHIP_STK_RPL_LST_R.$itm_sub3, MST_SHIP_STK_RPL_LST_R.$wg_cd);
			
			List<MSBEL_ShipStkRplService.ShipStkRpl_XfrIns01> opeL = new ArrayList<>();
			MCList<ShipStkRpl_DtlR>[] sortGrpL = getGrpL(dbcL);
			// 件数の降順に並び替え
			Arrays.sort(sortGrpL, new Comparator<MCList<ShipStkRpl_DtlR>>() {
				public int compare(
						MCList<ShipStkRpl_DtlR> o1, MCList<ShipStkRpl_DtlR> o2) {
					int sum1 = 0;
					int sum2 = 0;
					for (ShipStkRpl_DtlR r : o1) {
						sum1 += r.total_cnt().intValue();
					}
					for (ShipStkRpl_DtlR r : o2) {
						sum2 += r.total_cnt().intValue();
					}
					return (sum1 - sum2) * -1;
				}
			});

			for (MCList<ShipStkRpl_DtlR> grpL : sortGrpL) {
				MSBEL_ShipStkRplService.ShipStkRpl_XfrIns01 o = MSBEL_ShipStkRplService.crtShipStkRpl_XfrIns01();
				o.up0().screen_flg(up0().screen_flg());
				for (ShipStkRpl_DtlR dtlR : grpL) {
					addAll(o.up1(), dbcL.subList(idx, dtlR.toArray(idx.getKeys())),
							createMap_ShipStkRpl_LstR_MST_SHIP_STK_RPL_LST_R());
				}
				opeL.add(o);
			}
			
			if (!opeL.isEmpty()) {
				MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
			}
			
			// 処理結果
			MCIndexKey upidx = up1().createIndex(ShipStkRpl_LstR.$batch_data_no);
			for (MSBEL_ShipStkRplService.ShipStkRpl_XfrIns01 ope : opeL) {
				for (ShipStkRpl_LstR r : ope.down0()) {
					ShipStkRpl_LstR upR = up1().getFirst(upidx, r.batch_data_no());
					upR.rtn_sts_typ(r.rtn_sts_typ());
				}
			}
		}
		
		/**
		 * まとめ単位の件数を算出し、マルチスレッド実行する処理単位のグループを取得する
		 */
		protected MCList<ShipStkRpl_DtlR>[] getGrpL(MCList<MST_SHIP_STK_RPL_LST_R> dbcL) {
			String[] grpKey = {
					ShipStkRpl_DtlR.$itm_cd, ShipStkRpl_DtlR.$itm_sub1,
					ShipStkRpl_DtlR.$itm_sub2, ShipStkRpl_DtlR.$itm_sub3,
					ShipStkRpl_DtlR.$wg_cd
			};
			MCList<ShipStkRpl_DtlR> dtlL = MCList.create(ShipStkRpl_DtlR.class);
			for (MCList<MST_SHIP_STK_RPL_LST_R> lst : dbcL.groupList(grpKey)) {
				MST_SHIP_STK_RPL_LST_R r = lst.get(0);

				ShipStkRpl_DtlR dtlR = dtlL.createRow();
				dtlR.itm_cd(r.itm_cd());
				dtlR.itm_sub1(r.itm_sub1());
				dtlR.itm_sub2(r.itm_sub2());
				dtlR.itm_sub3(r.itm_sub3());
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
	 * ShipStkRpl_Del01オペレーション.<p>
	 *
	 */
	public class ShipStkRpl_Del01 extends MSBEL_ShipStkRplService_MC_A.ShipStkRpl_Del01 {
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
			delShipStkRplLst();
			
			// 移送予定の削除
			MCList<ShipStkRpl_DtlR> dtlL = getDtlL(up0(), up1());
			callDelXfrSchdService(dtlL);
		}
		
		protected boolean isInvalidUpParam() {
			boolean boo = isNull(up1());
			boo = boo || isNullOr(up0().tm_fr(), up0().tm_to());
			return boo;
		}
		
		protected void delShipStkRplLst() {
			if (!up0().ship_stk_rpl_lst_del_flg()) {
				return ;
			}
			
			MSBEL_ShipStkRplService.ShipStkRpl_LstDel01 ope = MSBEL_ShipStkRplService.crtShipStkRpl_LstDel01();
			ope.up0().setAll(up1());
			ope.exec();
			
			down0().lst_del_cnt(ope.down0().lst_del_cnt());
		}
		
		protected void callDelXfrSchdService(MCList<ShipStkRpl_DtlR> dtlL) {
			if (!up0().xfr_schd_del_flg() || isNull(dtlL)) {
				return ;
			}
			
			List<MSBEL_ShipStkRplService.ShipStkRpl_XfrDel01> opeL = new ArrayList<>();
			for (MCList<ShipStkRpl_DtlR> lst : getThrdGrpList(dtlL)) {
				MSBEL_ShipStkRplService.ShipStkRpl_XfrDel01 o = MSBEL_ShipStkRplService.crtShipStkRpl_XfrDel01();
				MCRow.copyvalue(o.up0(), up0());
				o.up1().addAll(lst);
				opeL.add(o);
			}

			// 件数の降順に並び替え
			Collections.sort(opeL, new Comparator<MSBEL_ShipStkRplService.ShipStkRpl_XfrDel01>() {
				public int compare(
						MSBEL_ShipStkRplService.ShipStkRpl_XfrDel01 o1, MSBEL_ShipStkRplService.ShipStkRpl_XfrDel01 o2) {
					int
						sum1 = o1.up1().sum(ShipStkRpl_DtlR.$total_cnt).intValue(),
						sum2 = o2.up1().sum(ShipStkRpl_DtlR.$total_cnt).intValue();
					return (sum1 - sum2) * -1;
				}
			});
			
			if (!opeL.isEmpty()) {
				MCServerThreadManager.invokeAndWait(opeL, FXBAL_BatchLogManager.class);
			}
			
			// 処理結果
			MCNumber cnt = MCNumber.ZERO;
			for (MSBEL_ShipStkRplService.ShipStkRpl_XfrDel01 ope : opeL) {
				cnt = cnt.add(nvl(ope.down0().xfr_del_cnt(), MCNumber.ZERO));
			}
			down0().xfr_del_cnt(cnt);
		}
	}
	/**
	 * ShipStkRpl_LstIns01オペレーション.<p>
	 *
	 */
	public class ShipStkRpl_LstIns01 extends MSBEL_ShipStkRplService_MC_A.ShipStkRpl_LstIns01 {
		protected MCDate _execTm = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MCList<MST_SHIP_STK_RPL_LST_R> 
				shipL = MCList.create(MST_SHIP_STK_RPL_LST_R.class),
				rplL = MCList.create(MST_SHIP_STK_RPL_LST_R.class);
			
			insItmLocWk(up1());
			setExecDt();
			srchShipL(shipL);
			delItmLocWk();
			adjustShipL(shipL);
			sortForAlloc(shipL);
			MSBEL_AllocMngService.Alloc_Srch01 allocOpe = alloc(shipL, false, up0());
			addShipStkRplLst(shipL, allocOpe, rplL, false);
			insShipStkRplLst(rplL);
			setDown(shipL, rplL);
			dbTran().commit();
		}
		
		protected void setExecDt() {
			_execTm = MCDate.now().trunc(MCDateFieldType.MINUTE);
		}
		
		/**
		 * 出荷の受払予定を取得する
		 */
		protected void srchShipL(MCList<MST_SHIP_STK_RPL_LST_R> shipL) {
			shipL.addStringColumn("lg_grp_cd");
			shipL.addDateColumn("dlv_schd_tm");
			shipL.addBooleanColumn("pack_alloc_flg");
			shipL.addBooleanColumn("not_lot_mix_flg");
			shipL.addBooleanColumn("not_sublot_mix_flg");
			if (up0().schd_flg() || up0().slo_flg() || up0().prms_flg() || up0().dlv_inst_flg() || up0().ord_flg()) {
				executeQuery(shipL, MSBEL5090_MST_IO_SCHD_S02(), up0());
			}
		}
		
		/**
		 * 出荷の受払予定を引当処理用に加工する
		 */
		protected void adjustShipL(MCList<MST_SHIP_STK_RPL_LST_R> shipL) {
			for (MST_SHIP_STK_RPL_LST_R shipR : shipL) {
				// 荷姿引当対象でない場合は、基準単位を設定する
				if (!shipR.getBoolean("pack_alloc_flg")) {
					shipR.pack_unit_cd(shipR.base_unit_cd());
					shipR.pack_unit_short_qty(shipR.base_unit_short_qty());
				}
				// 有効期限
				setVldDt(shipR);
			}
		}
		
		protected void setVldDt(MST_SHIP_STK_RPL_LST_R r) {
			r.vld_dt_fr(r.schd_dt());
		}
		
		/**
		 * 不足情報を追加する
		 */
		protected void insShipStkRplLst(MCList<MST_SHIP_STK_RPL_LST_R> rplL) {
			if (isNull(rplL)) {
				return ;
			}
			
			doSeqCache(MSC_NUM_SYS_TYP.SHIPSTKRPL, rplL.size());
			for (MST_SHIP_STK_RPL_LST_R r : rplL) {
				r.batch_data_no(getStrSeq(MSC_NUM_SYS_TYP.SHIPSTKRPL));
				r.batch_log_no(up0().batch_log_no());
				r.exec_tm(_execTm);
			}
			dbInsertEx("MSBEL5090_MST_SHIP_STK_RPL_LST_I01", rplL,
			MCQueryApiBuilder.create(MST_SHIP_STK_RPL_LST_R.create("T")));
		}
		
		protected void setDown(MCList<MST_SHIP_STK_RPL_LST_R> shipL,
				MCList<MST_SHIP_STK_RPL_LST_R> rplL) {
			
			addAll(down0(), rplL, createMap_ShipStkRpl_LstR_MST_SHIP_STK_RPL_LST_R());
			down1().ship_io_schd_cnt(shipL.size());
			down1().lst_crt_cnt(rplL.size());
		}
	}
	/**
	 * ShipStkRpl_XfrIns01オペレーション.<p>
	 *
	 */
	public class ShipStkRpl_XfrIns01 extends MSBEL_ShipStkRplService_MC_A.ShipStkRpl_XfrIns01 {
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
			if (isNull(up1())) {
				return ;
			}
			
			MCList<MST_SHIP_STK_RPL_LST_R> xfrL = srchShipStkRplLst();
			chkShipStkRplLst(xfrL);
			if (isNull(xfrL)) {
				return ;
			}
			
			sortForAlloc(xfrL);
			MSBEL_AllocMngService.Alloc_Srch01 allocOpe = alloc(xfrL, true, up0());
			crtXfrSchd(allocOpe, xfrL);
			updShipStkRplLst(allocOpe, xfrL);
			setRslt(xfrL);
		}
		
		protected MCList<MST_SHIP_STK_RPL_LST_R> srchShipStkRplLst() {
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			MAM_LOC_R m2 = MAM_LOC_R.create("M2");
			MST_SLO_D_R t2 = MST_SLO_D_R.create("T2");
			MST_SLO_R t3 = MST_SLO_R.create("T3");
			MST_SHIP_SCHD_R t4 = MST_SHIP_SCHD_R.create("T4");
			MCList<MST_SHIP_STK_RPL_LST_R> xfrL = MCList.create(MST_SHIP_STK_RPL_LST_R.class);
			MST_SHIP_STK_RPL_LST_R t1 = MST_SHIP_STK_RPL_LST_R.create("T");
			MCQueryApiBuilder xfrL_bldr = MCQueryApiBuilder.create(t1);
			xfrL.addStringColumn("lg_grp_cd");
			xfrL.addDateColumn("dlv_schd_tm");
			xfrL.addBooleanColumn("not_lot_mix_flg");
			xfrL.addBooleanColumn("not_sublot_mix_flg");

			xfrL_bldr.setSelectAll();
			xfrL_bldr.addSelect(t1.base_unit_short_qty.as("org_short_qty"));
			xfrL_bldr.addSelect(m1.dec_place.as("base_dec_place"));
			xfrL_bldr.addSelect(m1.rnd_typ.as("base_rnd_typ"));
			xfrL_bldr.addSelect(m2.lg_grp_cd);
			xfrL_bldr.addSelect(nvl(t4.dlv_cd, t2.dlv_cd).as("dlv_cd"));
			xfrL_bldr.addSelect(t3.cst_cd);
			xfrL_bldr.addSelect(t4.dlv_schd_tm);
			xfrL_bldr.addSelect(t4.not_lot_mix_flg);
			xfrL_bldr.addSelect(t4.not_sublot_mix_flg);
			xfrL_bldr.addInnerJoin(m1,
					bracket(t1.itm_cd.eq(m1.itm_cd)
							.and(t1.itm_sub1.eq(m1.itm_sub1))
							.and(t1.itm_sub2.eq(m1.itm_sub2))
							.and(t1.itm_sub3.eq(m1.itm_sub3))));
			xfrL_bldr.addInnerJoin(m2, bracket(t1.loc_cd.eq(m2.loc_cd)));
			xfrL_bldr.addInnerJoin(t2, bracket(t2.slo_d_no.eq(t1.io_schd_sub_no2)));
			xfrL_bldr.addInnerJoin(t3, bracket(t3.slo_no.eq(t2.slo_no)));
			xfrL_bldr.addInnerJoin(t4, bracket(t4.ship_schd_no.eq(t1.io_schd_sub_no3)));
			xfrL_bldr.setOrderByAsc(t1.batch_data_no);
			xfrL_bldr.setLockTable(t1.batch_data_no);
			
			MCList<ShipStkRpl_LstR> lst = up1().shallowClone();
			lst.sort(ShipStkRpl_LstR.$batch_data_no);
			
			if (up0().screen_flg()) {
				dbSelectKeyForUpdateNoWait("MSBEL5090_MST_SHIP_STK_RPL_LST_S02", xfrL, xfrL_bldr, lst);
			}
			else {
				dbSelectKeyForUpdate("MSBEL5090_MST_SHIP_STK_RPL_LST_S03", xfrL, xfrL_bldr, lst);
			}
			return xfrL;
		}
		
		protected void chkShipStkRplLst(MCList<MST_SHIP_STK_RPL_LST_R> xfrL) {
			MCMessageList msgL = new MCMessageList();
			MCIndexKey idx = xfrL.createIndex(MST_SHIP_STK_RPL_LST_R.$batch_data_no);
			MCList<MST_SHIP_STK_RPL_LST_R> rmL = xfrL.createInstance();
			for (ShipStkRpl_LstR r : up1()) {
				MST_SHIP_STK_RPL_LST_R selectR = xfrL.getFirst(idx, r.batch_data_no());
				MCMessageList chkMsgL = new MCMessageList();
				if (up0().screen_flg()) {
					chkMsgL.addAll(checkUpdCntrNE(r, ShipStkRpl_LstR.$upd_cntr, selectR));
				}
				if (isNull(selectR)) {
					if (!up0().screen_flg()) {
						chkMsgL.addAll(checkUpdCntrNE(r, ShipStkRpl_LstR.$upd_cntr, selectR));
					}
				}
				else {
					selectR.setAttributes(r);
					if (up0().screen_flg()) {
						MCMessageList msgDacLocL = checkWritableLocCdDac(selectR, MST_SHIP_STK_RPL_LST_R.$loc_cd);
						MCMessageList msgDacLgL = checkWritableLgGrpCdDac(selectR, "lg_grp_cd");
						if (!msgDacLocL.isEmpty() && !msgDacLgL.isEmpty()) {
							chkMsgL.addAll(msgDacLocL);
							chkMsgL.addAll(msgDacLgL);
						}
					}
				}
				if (!chkMsgL.isEmpty()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
					rmL.add(selectR);
				}
				msgL.addAll(chkMsgL);
			}
			
			if (up0().screen_flg()) {
				MCMessagePool.addAll(msgL);
			}
			
			// チェックでエラーになった不足情報リストは除外する
			if (!isNull(rmL)) {
				xfrL.removeAll(rmL);
			}
		}
		
		protected void crtXfrSchd(MSBEL_AllocMngService.Alloc_Srch01 allocOpe,
				MCList<MST_SHIP_STK_RPL_LST_R> xfrL) {
			down1().xfr_crt_success_cnt(0);
			down1().xfr_crt_error_cnt(0);
			addStkRpl(allocOpe, xfrL);
			if (isNull(allocOpe.down0())) {
				return ;
			}
			
			// 引当結果を移送予定の作成単位にまとめる
			String[] destAllocCols = {
					Srch_RsltR.$gr_loc_cd, Srch_RsltR.$gr_str_ln_cd, Srch_RsltR.$vld_dt_fr,
					"not_lot_mix_flg", "not_sublot_mix_flg"
			};
			String[] srcAllocCols = {
					MST_SHIP_STK_RPL_LST_R.$loc_cd, MST_SHIP_STK_RPL_LST_R.$str_ln_cd, MST_SHIP_STK_RPL_LST_R.$schd_dt,
					"not_lot_mix_flg", "not_sublot_mix_flg"
			};
			allocOpe.down0().addBooleanColumn("not_lot_mix_flg");
			allocOpe.down0().addBooleanColumn("not_sublot_mix_flg");
			copyByPegNo(allocOpe.down0(), destAllocCols, xfrL, srcAllocCols);
			
			setLotNo(allocOpe.down0());
			MCList<Srch_RsltR> xfrGrpL = MCList.create(Srch_RsltR.class);
			MCGroupByPolicy gp = new MCGroupByPolicy();
			gp.addKey(getXfrGrpCols());
			gp.sum(Srch_RsltR.$pack_unit_qty);
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
				MCList<MST_SHIP_STK_RPL_LST_R> xfrL) {
			
			MCList<MST_SHIP_STK_RPL_LST_R> 
				wRplL = MCList.create(MST_SHIP_STK_RPL_LST_R.class);
			MCList<MST_SHIP_STK_RPL_LST_R> wXfrL = xfrL.clone();
			addShipStkRplLst(wXfrL, allocOpe, wRplL, true);
			
			return getStkRpl(allocOpe, wRplL);
		}
		
		protected MCList<Srch_RsltR> getStkRpl(MSBEL_AllocMngService.Alloc_Srch01 allocOpe,
				MCList<MST_SHIP_STK_RPL_LST_R> xfrL) {
			
			if(isNull(xfrL)) {
				return allocOpe.down0();
			}
			
			MCList<Srch_RsltR> stkRplL = MCList.create(Srch_RsltR.class);
			addAll(stkRplL, xfrL, createMap_Srch_RsltR_MST_SHIP_STK_RPL_LST_R());
			
			MAM_STK_RPL_R t = MAM_STK_RPL_R.create("T");
			MCQueryApiBuilder dbcStkL_bldr = MCQueryApiBuilder.create(t);
			dbcStkL_bldr.setSelect(t.itm_cd);
			dbcStkL_bldr.addSelect(t.itm_sub1);
			dbcStkL_bldr.addSelect(t.itm_sub2);
			dbcStkL_bldr.addSelect(t.itm_sub3);
			dbcStkL_bldr.addSelect(t.loc_cd);
			dbcStkL_bldr.addSelect(t.ship_gi_loc_cd);
			dbcStkL_bldr.addSelect(t.ship_gi_str_ln_cd);
			FXUCL_MCDbcCacheStEnd<MAM_STK_RPL_R> cacheStk = new FXUCL_MCDbcCacheStEnd<MAM_STK_RPL_R>(
					dbcStkL_bldr, xfrL, new String[] {
							MST_SHIP_STK_RPL_LST_R.$itm_cd,
							MST_SHIP_STK_RPL_LST_R.$itm_sub1,
							MST_SHIP_STK_RPL_LST_R.$itm_sub2,
							MST_SHIP_STK_RPL_LST_R.$itm_sub3,
							MST_SHIP_STK_RPL_LST_R.$loc_cd
					});
			
			MCGroupByPolicy gp = new MCGroupByPolicy();
			gp.addKey(MST_SHIP_STK_RPL_LST_R.$schd_dt);
			gp.addKey(MST_SHIP_STK_RPL_LST_R.$itm_cd);
			gp.addKey(MST_SHIP_STK_RPL_LST_R.$itm_sub1);
			gp.addKey(MST_SHIP_STK_RPL_LST_R.$itm_sub2);
			gp.addKey(MST_SHIP_STK_RPL_LST_R.$itm_sub3);
			gp.addKey(MST_SHIP_STK_RPL_LST_R.$loc_cd);
			MCList<MST_SHIP_STK_RPL_LST_R> xfrGrpL = xfrL.groupBy(gp);
			
			MCIndexKey idx = stkRplL.createIndex(Srch_RsltR.$schd_dt, Srch_RsltR.$itm_cd, Srch_RsltR.$itm_sub1, Srch_RsltR.$itm_sub2, Srch_RsltR.$itm_sub3, Srch_RsltR.$inpt_loc_cd);
			for (MST_SHIP_STK_RPL_LST_R xfrR : xfrGrpL) {
				
				MAM_STK_RPL_R dbcStkR = cacheStk.get(xfrR.schd_dt(), xfrR.itm_cd(), xfrR.itm_sub1(), xfrR.itm_sub2(), xfrR.itm_sub3(), xfrR.loc_cd());
				if(!dbcStkR.isEmpty() && !isNull(dbcStkR.ship_gi_loc_cd())) {
					MCList<Srch_RsltR> l = stkRplL.subList(idx, xfrR.schd_dt(), xfrR.itm_cd(), xfrR.itm_sub1(), xfrR.itm_sub2(), xfrR.itm_sub3(), xfrR.loc_cd());
					l.setString(Srch_RsltR.$stk_loc_cd, dbcStkR.ship_gi_loc_cd());
					l.setString(Srch_RsltR.$stk_str_ln_cd, dbcStkR.ship_gi_str_ln_cd());
					allocOpe.down0().addAll(l);
				}
			}
			
			return allocOpe.down0();
		}
		
		protected Map_Srch_RsltR_MST_SHIP_STK_RPL_LST_R<Srch_RsltR,MST_SHIP_STK_RPL_LST_R> createMap_Srch_RsltR_MST_SHIP_STK_RPL_LST_R() {
			return new Map_Srch_RsltR_MST_SHIP_STK_RPL_LST_R<Srch_RsltR, MST_SHIP_STK_RPL_LST_R>();
		}

		public class Map_Srch_RsltR_MST_SHIP_STK_RPL_LST_R<D extends Srch_RsltR, S extends MST_SHIP_STK_RPL_LST_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch_RsltR.$io_schd_typ, MST_SHIP_STK_RPL_LST_R.$io_schd_typ);
				addColumnPathMap(Srch_RsltR.$io_schd_sts_typ, MST_SHIP_STK_RPL_LST_R.$io_schd_sts_typ);
				addColumnPathMap(Srch_RsltR.$io_schd_no, MST_SHIP_STK_RPL_LST_R.$io_schd_no);
				addColumnPathMap(Srch_RsltR.$io_schd_seq, MST_SHIP_STK_RPL_LST_R.$io_schd_seq);
				addColumnPathMap(Srch_RsltR.$io_schd_pr_no, MST_SHIP_STK_RPL_LST_R.$io_schd_pr_no);
				addColumnPathMap(Srch_RsltR.$itm_cd, MST_SHIP_STK_RPL_LST_R.$itm_cd);
				addColumnPathMap(Srch_RsltR.$itm_sub1, MST_SHIP_STK_RPL_LST_R.$itm_sub1);
				addColumnPathMap(Srch_RsltR.$itm_sub2, MST_SHIP_STK_RPL_LST_R.$itm_sub2);
				addColumnPathMap(Srch_RsltR.$itm_sub3, MST_SHIP_STK_RPL_LST_R.$itm_sub3);
				addColumnPathMap(Srch_RsltR.$ver_no, MST_SHIP_STK_RPL_LST_R.$ver_no);
				addColumnPathMap(Srch_RsltR.$inpt_loc_cd, MST_SHIP_STK_RPL_LST_R.$loc_cd);
				addColumnPathMap(Srch_RsltR.$inpt_str_ln_cd, MST_SHIP_STK_RPL_LST_R.$str_ln_cd);
				addColumnPathMap(Srch_RsltR.$gr_loc_cd, MST_SHIP_STK_RPL_LST_R.$loc_cd);
				addColumnPathMap(Srch_RsltR.$gr_str_ln_cd, MST_SHIP_STK_RPL_LST_R.$str_ln_cd);
				addColumnPathMap(Srch_RsltR.$stk_arrv_bp_cd, MST_SHIP_STK_RPL_LST_R.$stk_arrv_bp_cd);
				addColumnPathMap(Srch_RsltR.$quality_typ, MST_SHIP_STK_RPL_LST_R.$quality_typ);
				addColumnPathMap(Srch_RsltR.$stk_id_typ, MST_SHIP_STK_RPL_LST_R.$stk_id_typ);
				addColumnPathMap(Srch_RsltR.$stk_bp_cd, MST_SHIP_STK_RPL_LST_R.$stk_bp_cd);
				addColumnPathMap(Srch_RsltR.$gd_cd, MST_SHIP_STK_RPL_LST_R.$gd_cd);
				addColumnPathMap(Srch_RsltR.$lot_no, MST_SHIP_STK_RPL_LST_R.$lot_no);
				addColumnPathMap(Srch_RsltR.$sublot_no, MST_SHIP_STK_RPL_LST_R.$sublot_no);
				addColumnPathMap(Srch_RsltR.$sno1, MST_SHIP_STK_RPL_LST_R.$sno1);
				addColumnPathMap(Srch_RsltR.$sno2, MST_SHIP_STK_RPL_LST_R.$sno2);
				addColumnPathMap(Srch_RsltR.$sno3, MST_SHIP_STK_RPL_LST_R.$sno3);
				addColumnPathMap(Srch_RsltR.$sno4, MST_SHIP_STK_RPL_LST_R.$sno4);
				addColumnPathMap(Srch_RsltR.$sno1_null_flg, MST_SHIP_STK_RPL_LST_R.$sno1_null_flg);
				addColumnPathMap(Srch_RsltR.$sno2_null_flg, MST_SHIP_STK_RPL_LST_R.$sno2_null_flg);
				addColumnPathMap(Srch_RsltR.$sno3_null_flg, MST_SHIP_STK_RPL_LST_R.$sno3_null_flg);
				addColumnPathMap(Srch_RsltR.$sno4_null_flg, MST_SHIP_STK_RPL_LST_R.$sno4_null_flg);
				addColumnPathMap(Srch_RsltR.$base_unit_cd, MST_SHIP_STK_RPL_LST_R.$base_unit_cd);
				addColumnPathMap(Srch_RsltR.$base_unit_qty, MST_SHIP_STK_RPL_LST_R.$pack_unit_short_qty);
				addColumnPathMap(Srch_RsltR.$pack_unit_cd, MST_SHIP_STK_RPL_LST_R.$base_unit_cd);
				addColumnPathMap(Srch_RsltR.$pack_unit_qty, MST_SHIP_STK_RPL_LST_R.$base_unit_short_qty);
				addColumnPathMap(Srch_RsltR.$vld_dt_fr, MST_SHIP_STK_RPL_LST_R.$vld_dt_fr);
				addColumnPathMap(Srch_RsltR.$schd_dt, MST_SHIP_STK_RPL_LST_R.$schd_dt);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.peg_no(src.getNumber("peg_no"));
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
					Srch_RsltR.$sno4_null_flg, Srch_RsltR.$gd_cd, Srch_RsltR.$quality_typ,
					Srch_RsltR.$stk_id_typ, Srch_RsltR.$stk_bp_cd, Srch_RsltR.$pack_unit_cd,
					Srch_RsltR.$base_unit_cd, Srch_RsltR.$vld_dt_fr, "not_lot_mix_flg", "not_sublot_mix_flg"
			};
		}
		
		/**
		 * ロット管理対象外、サブロット管理対象外の場合にロットＮＯ、サブロットＮＯにNULL文字を設定する
		 * @param allocOpeDown0
		 */
		protected void setLotNo(MCList<Srch_RsltR> allocOpeDown0) {
			if (isNull(allocOpeDown0)) {
				return;
			}
			MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t);
			MAW_ITM_KEY_R w1 = MAW_ITM_KEY_R.create("W1");
			dbWkDelete("MSBEL5090_MAW_ITM_D01", itmL_bldr.getBaseDbc());
			for (Srch_RsltR r : allocOpeDown0.groupBy(Srch_RsltR.$itm_cd,
					Srch_RsltR.$itm_sub1, Srch_RsltR.$itm_sub2, Srch_RsltR.$itm_sub3)) {
				MAM_ITM_R itmR = MAM_ITM_R.create();
				itmR.itm_cd(r.itm_cd());
				itmR.itm_sub1(r.itm_sub1());
				itmR.itm_sub2(r.itm_sub2());
				itmR.itm_sub3(r.itm_sub3());
				itmL.add(itmR);
			}
			dbWkInsert("MSBEL5090_MAW_ITM_I01", itmL, itmL_bldr.getBaseDbc());
			itmL_bldr.setSelect(t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3,
					t.lot_mng_typ, t.sublot_mng_typ);
			itmL_bldr.addInnerJoin(w1,
					bracket(w1.itm_cd.eq(t.itm_cd)
							.and(w1.itm_sub1.eq(t.itm_sub1))
							.and(w1.itm_sub2.eq(t.itm_sub2))
							.and(w1.itm_sub3.eq(t.itm_sub3))));
			dbSelect("MSBEL5090_MAM_ITM_S01", itmL, itmL_bldr);
			MCIndexKey itmKey = itmL.createIndex(MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
			
			for (Srch_RsltR r : allocOpeDown0) {
				MAM_ITM_R itmR = itmL.getFirst(itmKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (!isNull(itmR)) {
					if (MAC_LOT_MNG_TYP.isNOT_MNG(itmR.lot_mng_typ())) {
						r.lot_no(MAC_STR.NULL_VAL.value());
					}
					if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(itmR.sublot_mng_typ())) {
						r.sublot_no(MAC_STR.NULL_VAL.value());
					}
				}
			}
			
			dbWkDelete("MSBEL5090_MAW_ITM_D02", itmL_bldr.getBaseDbc());
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
				dest.xfr_src_typ(MSC_XFR_SRC_TYP.SHIP_RPL.value());
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
				addColumnPathMap(XfrSchd_DtlR.$trd_unit_cd, Srch_RsltR.$pack_unit_cd);
				addColumnPathMap(XfrSchd_DtlR.$trd_unit_qty, Srch_RsltR.$pack_unit_qty);
				addColumnPathMap(XfrSchd_DtlR.$base_unit_cd, Srch_RsltR.$base_unit_cd);
				addColumnPathMap(XfrSchd_DtlR.$base_unit_qty, Srch_RsltR.$base_unit_qty);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.xfr_src_typ(MSC_XFR_SRC_TYP.SHIP_RPL.value());
				if (!src.getBooleanNE(masterFlgCol)) {
					dest.alloc_flg(true);
				}
				dest.not_lot_mix_flg(src.getBooleanNE("not_lot_mix_flg"));
				dest.not_sublot_mix_flg(src.getBooleanNE("not_sublot_mix_flg"));
			}
		}
		
		protected void updShipStkRplLst(MSBEL_AllocMngService.Alloc_Srch01 allocOpe,
				MCList<MST_SHIP_STK_RPL_LST_R> xfrL) {
			
			MCList<MST_SHIP_STK_RPL_LST_R> 
				wRplL = MCList.create(MST_SHIP_STK_RPL_LST_R.class),
				delL = MCList.create(MST_SHIP_STK_RPL_LST_R.class),
				updL = MCList.create(MST_SHIP_STK_RPL_LST_R.class);

			addShipStkRplLst(xfrL, allocOpe, wRplL, true);
			
			MCIndexKey idx1 = wRplL.createIndex("peg_no");
			for (MST_SHIP_STK_RPL_LST_R rplR : xfrL) {
				MST_SHIP_STK_RPL_LST_R wRplR = wRplL.getFirst(idx1, rplR.getNumber("peg_no"));
				if (wRplR == null) {
					// 引当した結果、不足情報なし
					// ⇒ 全数引当された結果なので、DBから削除する
					delL.add(rplR);
					rplR.setStringNE("rtn_sts_typ", MAC_RTN_STS_TYP.OK.value());
					rplR.setStatus(MCRow.DELETE);
				}
				else if (!isSame(rplR.base_unit_short_qty(), rplR.getNumber("org_short_qty"))) {
					// 引当した結果、不足情報あり
					// ⇒ 一部引当できた結果なので、不足数を更新する
					// 不足数は addShipStkRplLst で設定
					updL.add(rplR);
					rplR.setStringNE("rtn_sts_typ", MAC_RTN_STS_TYP.WRN.value());
					if (up0().screen_flg()) {
						MCMessagePool.add(rplR, null, MSBEL1010, rplR.batch_data_no());
					}
					rplR.setStatus(MCRow.MODIFY);
				}
				else {
					// 引当できなかった、または移送依頼が作成されなかった
					// ⇒ 不足情報に対して何もしない
					rplR.setStringNE("rtn_sts_typ", MAC_RTN_STS_TYP.ERR.value());
					if (up0().screen_flg()) {
						MCMessagePool.add(rplR, null, MSBEL1009, rplR.batch_data_no());
					}
				}
			}
			xfrL.setStatus(MCRow.NONE);	// 後始末
			
			if (!isNull(delL)) {
				// 処理結果
				down1().lst_del_of_xfr_crt_cnt(delL.size());
				dbDeleteKey("MSBEL5090_MST_SHIP_STK_RPL_LST_D01", delL,
						MCQueryApiBuilder.create(MST_SHIP_STK_RPL_LST_R.create("T")));
			}
			if (!isNull(updL)) {
				MST_SHIP_STK_RPL_LST_R updL_t = MST_SHIP_STK_RPL_LST_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);

				updL_bldr.setSet(updL_t.pack_unit_short_qty);
				updL_bldr.addSet(updL_t.base_unit_short_qty);
				dbUpdateKey("MSBEL5090_MST_SHIP_STK_RPL_LST_U01", updL, updL_bldr);
			}
		}
		
		protected void setRslt(MCList<MST_SHIP_STK_RPL_LST_R> xfrL) {
			MCIndexKey idx = xfrL.createIndex(MST_SHIP_STK_RPL_LST_R.$batch_data_no);
			for (ShipStkRpl_LstR r : up1()) {
				if (isNull(r.rtn_sts_typ())) {
					MST_SHIP_STK_RPL_LST_R rsltR = xfrL.getFirst(idx, r.batch_data_no());
					if (rsltR != null) {
						r.rtn_sts_typ(rsltR.getString("rtn_sts_typ"));
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
			up1().setString(ShipStkRpl_LstR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value());
		}
		
		protected void setDown() {
			down0().setAll(up1());
		}
	}

	/**
		 * ShipStkRpl_LstDel01オペレーション.<p>
		 *
		 */
	public class ShipStkRpl_LstDel01 extends MSBEL_ShipStkRplService_MC_A.ShipStkRpl_LstDel01 {
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
			executeQuery((MCList<? extends MCRow>)null, MSBEL5090_MST_SHIP_STK_RPL_LST_S01());
			executeQuery(cntR, MSBEL5090_MST_SHIP_STK_RPL_LST_S02());
			executeUpdate(MSBEL5090_MST_SHIP_STK_RPL_LST_D01());

			down0().lst_del_cnt(nvl(cntR.getNumberNE("cnt"), MCNumber.ZERO));
		}
	}

	/**
	 * ShipStkRpl_XfrDel01オペレーション.<p>
	 *
	 */
	public class ShipStkRpl_XfrDel01 extends MSBEL_ShipStkRplService_MC_A.ShipStkRpl_XfrDel01 {
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
			MCList<ShipStkRpl_XfrR> xfrL = MCList.create(ShipStkRpl_XfrR.class);
			executeQuery(xfrL, MSBEL5090_MST_XFR_SCHD_S02(), up0());
			
			if (isNull(xfrL)) {
				return ;
			}
			
			setPegNo(xfrL);
			
			// 削除可能な移送予定かチェックする
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(MCMessagePool.getMessageList());
			MCMessagePool.getMessageList().clear();
			
			MSBEL_XfrSchdService.XfrSchd_Chk04 chkOpe = MSBEL_XfrSchdService.crtXfrSchd_Chk04();
			setAll(chkOpe.up0(), xfrL, createMap_XfrSchdChk04_DtlR_ShipStkRpl_XfrR());
			chkOpe.exec();
			
			String[] destCols = {ShipStkRpl_XfrR.$err_flg};
			String[] srcCols = {XfrSchdChk04_DtlR.$err_flg};
			copyByPegNo(xfrL, destCols, chkOpe.down0(), srcCols);
			MCMessagePool.getMessageList().clear();
			MCMessagePool.getMessageList().addAll(msgL);
			
			// 削除可能な移送予定を削除する
			MCList<ShipStkRpl_XfrR> xfrOkL = xfrL.subList(r -> !r.err_flg());
			
			if (isNull(xfrOkL)) {
				return ;
			}
			
			MSBEL_XfrSchdService.XfrSchd_Upd01 delOpe = MSBEL_XfrSchdService.crtXfrSchd_Upd01();
			setAll(delOpe.up0(), xfrOkL, createMap_XfrSchd_DtlR_ShipStkRpl_XfrR());
			delOpe.exec();
			
			down0().xfr_del_cnt(xfrOkL.size());
		}
		
		protected Map_XfrSchdChk04_DtlR_ShipStkRpl_XfrR<XfrSchdChk04_DtlR,ShipStkRpl_XfrR> createMap_XfrSchdChk04_DtlR_ShipStkRpl_XfrR() {
			return new Map_XfrSchdChk04_DtlR_ShipStkRpl_XfrR<XfrSchdChk04_DtlR, ShipStkRpl_XfrR>();
		}

		public class Map_XfrSchdChk04_DtlR_ShipStkRpl_XfrR<D extends XfrSchdChk04_DtlR, S extends ShipStkRpl_XfrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchdChk04_DtlR.$peg_no, ShipStkRpl_XfrR.$peg_no);
				addColumnPathMap(XfrSchdChk04_DtlR.$xfr_schd_no, ShipStkRpl_XfrR.$xfr_schd_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.xfr_src_typ(MSC_XFR_SRC_TYP.SHIP_RPL.value());
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
		
		protected Map_XfrSchd_DtlR_ShipStkRpl_XfrR<XfrSchd_DtlR,ShipStkRpl_XfrR> createMap_XfrSchd_DtlR_ShipStkRpl_XfrR() {
			return new Map_XfrSchd_DtlR_ShipStkRpl_XfrR<XfrSchd_DtlR, ShipStkRpl_XfrR>();
		}

		public class Map_XfrSchd_DtlR_ShipStkRpl_XfrR<D extends XfrSchd_DtlR, S extends ShipStkRpl_XfrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(XfrSchd_DtlR.$peg_no, ShipStkRpl_XfrR.$peg_no);
				addColumnPathMap(XfrSchd_DtlR.$xfr_schd_no, ShipStkRpl_XfrR.$xfr_schd_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
	}

	/**
	 * 不足情報および移送予定の対象を取得する
	 */
	protected MCList<ShipStkRpl_DtlR> getDtlL(ShipStkRpl_CndR cndR, MCList<ShipStkRpl_DtlR> dtlL) {
		insLocWk(dtlL);

		MCList<ShipStkRpl_DtlR> retL = MCList.create(ShipStkRpl_DtlR.class);
		MCList<ShipStkRpl_DtlR> tmpL = MCList.create(ShipStkRpl_DtlR.class);
		
		if (cndR.xfr_schd_del_flg()) {
			tmpL.clear();
			executeQuery(tmpL, MSBEL5090_MST_XFR_SCHD_S01(), cndR);
			retL.addAll(tmpL);
		}
		if (cndR.schd_flg() || cndR.slo_flg() || cndR.prms_flg() || cndR.dlv_inst_flg() || cndR.ord_flg()) {
			editUpDt(cndR);
			tmpL.clear();
			executeQuery(tmpL, MSBEL5090_MST_IO_SCHD_S01(), cndR);
			retL.addAll(tmpL);
		}
		
		delLocWk();
		
		MCGroupByPolicy gp = new MCGroupByPolicy();
		gp.addKey(ShipStkRpl_DtlR.$itm_cd);
		gp.addKey(ShipStkRpl_DtlR.$itm_sub1);
		gp.addKey(ShipStkRpl_DtlR.$itm_sub2);
		gp.addKey(ShipStkRpl_DtlR.$itm_sub3);
		gp.addKey(ShipStkRpl_DtlR.$wg_cd);
		gp.addKey(ShipStkRpl_DtlR.$loc_cd);
		gp.addKey(ShipStkRpl_DtlR.$str_ln_cd);
		gp.sum(ShipStkRpl_DtlR.$total_cnt);
		
		return retL.groupBy(gp);
	}

	/**
	 * 処理対象（場所）をワークに格納する
	 */
	protected void insLocWk(MCList<ShipStkRpl_DtlR> dtlL) {
		delLocWk();
		
		MCList<MAM_STR_LN_R> wkL = MCList.create(MAM_STR_LN_R.class);
		MCList<ShipStkRpl_DtlR> grpL = dtlL.groupBy(ShipStkRpl_DtlR.$loc_cd,
				ShipStkRpl_DtlR.$str_ln_cd);
		for (ShipStkRpl_DtlR r : grpL) {
			MAM_STR_LN_R x = MAM_STR_LN_R.create();
			x.loc_cd(r.loc_cd());
			x.str_ln_cd(r.str_ln_cd());
			wkL.add(x);
		}
		
		dbWkInsert("MSBEL5090_MAW_STR_LN_I01", wkL,
				MCQueryApiBuilder.create(MAM_STR_LN_R.create("T")).getBaseDbc());
	}
	
	/**
	 * 処理対象（場所）をワークから削除する
	 */
	protected void delLocWk() {
		dbWkDelete("MSBEL5090_MAW_STR_LN_D01",
				MCQueryApiBuilder.create(MAM_STR_LN_R.create("T")).getBaseDbc());
	}
	
	/**
	 * 処理対象（品目＋場所）をワークに格納する
	 */
	protected void insItmLocWk(MCList<ShipStkRpl_DtlR> dtlL) {
		delItmLocWk();

		MCList<ShipStkRpl_DtlR> grpL = dtlL.groupBy(ShipStkRpl_DtlR.$itm_cd,
				ShipStkRpl_DtlR.$itm_sub1, ShipStkRpl_DtlR.$itm_sub2,
				ShipStkRpl_DtlR.$itm_sub3, ShipStkRpl_DtlR.$loc_cd,
				ShipStkRpl_DtlR.$str_ln_cd);
		MCList<MSW_SHIP_STK_RPL_ITM_LOC_R> wkL = MCList.create(MSW_SHIP_STK_RPL_ITM_LOC_R.class);
		addAll(wkL, grpL, createMap_MSW_SHIP_STK_RPL_ITM_LOC_R_ShipStkRpl_DtlR());
		dbInsertEx("MSBEL5090_MSW_SHIP_STK_RPL_ITM_LOC_I01", wkL,
				MCQueryApiBuilder.create(MSW_SHIP_STK_RPL_ITM_LOC_R.create("T")));
	}
	
	/**
	 * 処理対象（品目＋場所）をワークから削除する
	 */
	protected void delItmLocWk() {
		execDbWkDelete("MSBEL5090_MSW_SHIP_STK_RPL_ITM_LOC_D01", MSW_SHIP_STK_RPL_ITM_LOC_R.create("T"));
	}
	
	protected Map_MSW_SHIP_STK_RPL_ITM_LOC_R_ShipStkRpl_DtlR<MSW_SHIP_STK_RPL_ITM_LOC_R,ShipStkRpl_DtlR> createMap_MSW_SHIP_STK_RPL_ITM_LOC_R_ShipStkRpl_DtlR() {
		return new Map_MSW_SHIP_STK_RPL_ITM_LOC_R_ShipStkRpl_DtlR<MSW_SHIP_STK_RPL_ITM_LOC_R, ShipStkRpl_DtlR>();
	}

	public class Map_MSW_SHIP_STK_RPL_ITM_LOC_R_ShipStkRpl_DtlR<D extends MSW_SHIP_STK_RPL_ITM_LOC_R, S extends ShipStkRpl_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_SHIP_STK_RPL_ITM_LOC_R.$itm_cd, ShipStkRpl_DtlR.$itm_cd);
			addColumnPathMap(MSW_SHIP_STK_RPL_ITM_LOC_R.$itm_sub1, ShipStkRpl_DtlR.$itm_sub1);
			addColumnPathMap(MSW_SHIP_STK_RPL_ITM_LOC_R.$itm_sub2, ShipStkRpl_DtlR.$itm_sub2);
			addColumnPathMap(MSW_SHIP_STK_RPL_ITM_LOC_R.$itm_sub3, ShipStkRpl_DtlR.$itm_sub3);
			addColumnPathMap(MSW_SHIP_STK_RPL_ITM_LOC_R.$loc_cd, ShipStkRpl_DtlR.$loc_cd);
			addColumnPathMap(MSW_SHIP_STK_RPL_ITM_LOC_R.$str_ln_cd, ShipStkRpl_DtlR.$str_ln_cd);
		}
	}
	
	/**
	 * 移送予定取得のため、日時⇒日付に変換した値を設定する。
	 */
	protected void editUpDt(ShipStkRpl_CndR cndR) {
		if (!isNullOr(cndR.tm_fr(), cndR.tm_to())) {
			if (isNull(cndR.dt_fr())) {
				cndR.dt_fr(cndR.tm_fr().trunc(MCDateFieldType.DAY));
			}
			if (isNull(cndR.dt_to())) {
				cndR.dt_to(cndR.tm_to().trunc(MCDateFieldType.DAY));
			}
		}
	}
	
	/**
	 * 不足情報・移送予定作成対象リストのインデックス
	 */
	protected MCIndexKey _itmIdx = null;
	
	/**
	 * ひとつのスレッドで実行する処理単位を取得する<br>
	 * 処理単位は同一の品目とする
	 * 
	 * @param dtlL	処理対象のリスト
	 * @return	処理単位のリスト
	 */
	@SuppressWarnings("unchecked")
	protected MCList<ShipStkRpl_DtlR>[] getThrdGrpList(MCList<ShipStkRpl_DtlR> dtlL) {

		ArrayList<MCList<ShipStkRpl_DtlR>>
			arr = null, ret = new ArrayList<>();
		for (MCList<ShipStkRpl_DtlR> pgL : dtlL.groupList(ShipStkRpl_DtlR.$wg_cd)) {
			_itmIdx = pgL.createIndex(ShipStkRpl_DtlR.$itm_cd, ShipStkRpl_DtlR.$itm_sub1,
					ShipStkRpl_DtlR.$itm_sub2, ShipStkRpl_DtlR.$itm_sub3);

			arr = new ArrayList<>();
			for (ShipStkRpl_DtlR r : pgL) {
				MCList<ShipStkRpl_DtlR> l = getThrdGrpList(r, false, pgL);
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
	 * ひとつのスレッドで実行する処理単位を取得する<br>
	 * 処理単位は同一の品目とする
	 * 
	 * @param dtlR	処理単位の起点とする品目
	 * @param isRec	再帰呼び出しか
	 * @param dtlL	処理対象のリスト
	 * @return	処理単位のリスト
	 */
	protected MCList<ShipStkRpl_DtlR> getThrdGrpList(ShipStkRpl_DtlR dtlR, boolean isRec,
			MCList<ShipStkRpl_DtlR> dtlL) {

		if (dtlR.isStatusDelete()) {
			return null;
		}

		MCList<ShipStkRpl_DtlR>
			retL = MCList.create(ShipStkRpl_DtlR.class),
			itmL = dtlL.subList(_itmIdx, dtlR.toArray(_itmIdx.getKeys()));
		retL.addAll(itmL);
		itmL.setStatus(MCRow.DELETE);	// 取得済みの目印
		return retL;
	}
	
	/**
	 * ひとつのスレッドで実行する処理単位を上限数に従ってまとめる
	 * 
	 * @param arr	処理単位のリスト
	 * @return	処理単位のリスト（まとめ後）
	 */
	protected ArrayList<MCList<ShipStkRpl_DtlR>>
			sumThrdGrpList(ArrayList<MCList<ShipStkRpl_DtlR>> arr) {

		ArrayList<MCList<ShipStkRpl_DtlR>> ret = new ArrayList<>();
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
			Collections.sort(arr, new Comparator<MCList<ShipStkRpl_DtlR>>() {
				public int compare(
						MCList<ShipStkRpl_DtlR> o1, MCList<ShipStkRpl_DtlR> o2) {
					int
						sum1 = o1.sum(ShipStkRpl_DtlR.$total_cnt).intValue(),
						sum2 = o2.sum(ShipStkRpl_DtlR.$total_cnt).intValue();
					return (sum1 - sum2) * -1;
				}
			});
			MCList<ShipStkRpl_DtlR> addL = MCList.create(ShipStkRpl_DtlR.class);
			for (int i=0, j=arr.size()-1; i<=j; i++) {
				addL.setAll(arr.get(i));

				// 処理対象件数が上限を超えていたらそのまま
				int size = addL.sum(ShipStkRpl_DtlR.$total_cnt).intValue();
				if (size < limit) {
					// 処理対象件数が少ないやつから順に加算する
					for (; j>i; j--) {
						MCList<ShipStkRpl_DtlR> l = arr.get(j);
						size += l.sum(ShipStkRpl_DtlR.$total_cnt).intValue();
						if (size > limit) {
							break;
						}
						addL.addAll(l);
					}
				}
				// 上限を超えた or do～while が最後まで回った
				if (!ret.contains(addL)) {
					ret.add(addL);
					addL = MCList.create(ShipStkRpl_DtlR.class);
				}
			}
		}
		return ret;
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
	
	protected Map_ShipStkRpl_LstR_MST_SHIP_STK_RPL_LST_R<ShipStkRpl_LstR,MST_SHIP_STK_RPL_LST_R> createMap_ShipStkRpl_LstR_MST_SHIP_STK_RPL_LST_R() {
		return new Map_ShipStkRpl_LstR_MST_SHIP_STK_RPL_LST_R<ShipStkRpl_LstR, MST_SHIP_STK_RPL_LST_R>();
	}

	public class Map_ShipStkRpl_LstR_MST_SHIP_STK_RPL_LST_R<D extends ShipStkRpl_LstR, S extends MST_SHIP_STK_RPL_LST_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipStkRpl_LstR.$batch_data_no, MST_SHIP_STK_RPL_LST_R.$batch_data_no);
			addColumnPathMap(ShipStkRpl_LstR.$loc_cd, MST_SHIP_STK_RPL_LST_R.$loc_cd);
			addColumnPathMap(ShipStkRpl_LstR.$str_ln_cd, MST_SHIP_STK_RPL_LST_R.$str_ln_cd);
			addColumnPathMap(ShipStkRpl_LstR.$wg_cd, MST_SHIP_STK_RPL_LST_R.$wg_cd);
			addColumnPathMap(ShipStkRpl_LstR.$schd_dt, MST_SHIP_STK_RPL_LST_R.$schd_dt);
			addColumnPathMap(ShipStkRpl_LstR.$itm_cd, MST_SHIP_STK_RPL_LST_R.$itm_cd);
			addColumnPathMap(ShipStkRpl_LstR.$itm_sub1, MST_SHIP_STK_RPL_LST_R.$itm_sub1);
			addColumnPathMap(ShipStkRpl_LstR.$itm_sub2, MST_SHIP_STK_RPL_LST_R.$itm_sub2);
			addColumnPathMap(ShipStkRpl_LstR.$itm_sub3, MST_SHIP_STK_RPL_LST_R.$itm_sub3);
		}
	}
/////////////////////////////////////////////////////////////////////////
//引当関連処理 ////////////////////////////////////////////////////////////
	/**
	* 引当対象の出荷情報リストを引当順にソートする
	*/
	protected void sortForAlloc(MCList<MST_SHIP_STK_RPL_LST_R> shipL) {
		MCSortPolicy sp = new MCSortPolicy();
		sp.add(SortType.ASC, MST_SHIP_STK_RPL_LST_R.$schd_dt);
		sp.add(SortType.ASC, MST_SHIP_STK_RPL_LST_R.$io_schd_sts_typ);
		sp.add(SortType.ASC, MST_SHIP_STK_RPL_LST_R.$io_schd_no);
		shipL.sort(sp);
	}
	
	/**
	 * 引当処理を実行する
	 * @param shipL	出荷情報リスト
	 * @param isXfrSchd	移送予定作成から呼ばれた場合に「true」
	 * @return	引当した結果
	 */
	protected MSBEL_AllocMngService.Alloc_Srch01 alloc(
			MCList<MST_SHIP_STK_RPL_LST_R> shipL, boolean isXfrSchd, ShipStkRpl_CndR up0R) {

		if (isNull(shipL)) {
			return MSBEL_AllocMngService.crtAlloc_Srch01();
		}

		setPegNo(shipL);
		// 有効期限を設定する
		shipLotChk(shipL);

		MCList<MST_SHIP_STK_RPL_LST_R> itmLgL = shipL.groupBy(
				MST_SHIP_STK_RPL_LST_R.$itm_cd, MST_SHIP_STK_RPL_LST_R.$itm_sub1,
				MST_SHIP_STK_RPL_LST_R.$itm_sub2, MST_SHIP_STK_RPL_LST_R.$itm_sub3,
				"lg_grp_cd");
		
		MSBEL_AllocMngService.Alloc_Lock_Upd01 lockOpe = MSBEL_AllocMngService.crtAlloc_Lock_Upd01();
		addAll(lockOpe.up0(), itmLgL, createMap_MSW_ALLOC_LOC_MAP_R_MST_SHIP_STK_RPL_LST_R());
		lockOpe.exec();
		
		MSBEL_AllocMngService.Alloc_Srch01
			allocOpe = MSBEL_AllocMngService.crtAlloc_Srch01();
		allocOpe.up0().short_ope_typ(MSC_SHORT_OPE_TYP.PROCEED.value());
		allocOpe.up0().dtl_flg(true);
		allocOpe.up0().xfr_src_typ(MSC_XFR_SRC_TYP.SHIP_RPL.value());
		
		addAll(allocOpe.up1(), shipL, isXfrSchd, createMap_Srch_TgtR_MST_SHIP_STK_RPL_LST_R());
		// 総量引当によって作成された出庫予定は引当管理サービス内では存在しない受払予定として扱うよう連携する
		MCList<MST_IO_SCHD_R> ioSchdL = MCList.create(MST_IO_SCHD_R.class);
		getDelTgtIoSchd(ioSchdL, shipL);
		addAll(allocOpe.up3(), ioSchdL, createMap_Srch_Io_SchdR_MST_IO_SCHD_R());
		
		allocOpe.exec();

		return allocOpe;
	}
	
	/**
	 * 出荷済みのロットから最小・最大の有効期限を取得する
	 */
	protected void shipLotChk(MCList<MST_SHIP_STK_RPL_LST_R> allocL) {
		MSBEL_ShipLotChkService.ShipLotChk_Srch01 o = MSBEL_ShipLotChkService.crtShipLotChk_Srch01();
		
		for (MST_SHIP_STK_RPL_LST_R r : allocL) {
			ShipLot_DtlR cndR = ShipLot_DtlR.create();
			cndR.peg_no(r.getNumber("peg_no"));
			cndR.cst_cd(r.getString("cst_cd"));
			cndR.dlv_cd(r.getString("dlv_cd"));
			cndR.itm_cd(r.itm_cd());
			cndR.itm_sub1(r.itm_sub1());
			cndR.itm_sub2(r.itm_sub2());
			cndR.itm_sub3(r.itm_sub3());
			MCDate baseDt = isNull(r.getDate("DLV_SCHD_TM")) ? null : r.getDate("DLV_SCHD_TM").startTimeOfDay();
			cndR.base_dt(baseDt);
			cndR.lock_flg(false);
			
			o.up0().add(cndR);
		}
		
		if (!o.up0().isEmpty()) {
			o.exec();
			
			MCIndexKey downKey = o.down0().createIndex(ShipLot_DtlR.$peg_no);
			for (MST_SHIP_STK_RPL_LST_R r : allocL) {
				ShipLot_DtlR down0R = o.down0().getFirst(downKey, r.getNumber("peg_no"));
				if (!isNull(down0R)) {
					r.setDateNE(_tmp_valid_dt_fr, down0R.valid_dt_fr());
					r.setNumberNE(_tmp_valid_dt_fr_grp, down0R.valid_dt_fr_grp());
					r.setDateNE(_tmp_valid_dt_to, down0R.valid_dt_to());
				}
			}
		}
	}
	
	/**
	 * 対象の品目、物流Gで総量引当している出庫予定を取得する
	 * @param ioSchdL
	 * @param shipL
	 */
	protected void getDelTgtIoSchd(MCList<MST_IO_SCHD_R> ioSchdL, MCList<MST_SHIP_STK_RPL_LST_R> shipL) {
		delItmLocWk();
		MCList<MST_SHIP_STK_RPL_LST_R> grpL = shipL.groupBy(MST_SHIP_STK_RPL_LST_R.$itm_cd,
				MST_SHIP_STK_RPL_LST_R.$itm_sub1, MST_SHIP_STK_RPL_LST_R.$itm_sub2,
				MST_SHIP_STK_RPL_LST_R.$itm_sub3, MST_SHIP_STK_RPL_LST_R.$loc_cd,
				MST_SHIP_STK_RPL_LST_R.$str_ln_cd);
		MCList<MSW_SHIP_STK_RPL_ITM_LOC_R> wkL = MCList.create(MSW_SHIP_STK_RPL_ITM_LOC_R.class);
		for (MST_SHIP_STK_RPL_LST_R r : grpL) {
			MSW_SHIP_STK_RPL_ITM_LOC_R wkR = MSW_SHIP_STK_RPL_ITM_LOC_R.create();
			wkR.itm_cd(r.itm_cd());
			wkR.itm_sub1(r.itm_sub1());
			wkR.itm_sub2(r.itm_sub2());
			wkR.itm_sub3(r.itm_sub3());
			wkR.loc_cd(r.loc_cd());
			wkR.str_ln_cd(r.str_ln_cd());
			wkL.add(wkR);
		}
		dbInsertEx("MSBEL5090_MSW_SHIP_STK_RPL_ITM_LOC_I02", wkL,
				MCQueryApiBuilder.create(MSW_SHIP_STK_RPL_ITM_LOC_R.create("T")));
		
		MAM_LOC_R m1 = MAM_LOC_R.create("M1");
		MSW_SHIP_STK_RPL_ITM_LOC_R w1 = MSW_SHIP_STK_RPL_ITM_LOC_R.create("W1");
		MAM_LOC_R m2 = MAM_LOC_R.create("M2");
		MST_IO_SCHD_R ioSchdL_t = MST_IO_SCHD_R.create("T");
		MCQueryApiBuilder ioSchdL_bldr = MCQueryApiBuilder.create(ioSchdL_t);

		ioSchdL_bldr.setDistinct();
		ioSchdL_bldr.setSelect(ioSchdL_t.io_schd_no, ioSchdL_t.io_schd_typ, ioSchdL_t.io_schd_sts_typ);
		ioSchdL_bldr.addInnerJoin(m1, bracket(m1.loc_cd.eq(ioSchdL_t.loc_cd)));
		ioSchdL_bldr.addInnerJoin(w1,
				bracket(w1.itm_cd.eq(ioSchdL_t.itm_cd)
						.and(w1.itm_sub1.eq(ioSchdL_t.itm_sub1))
						.and(w1.itm_sub2.eq(ioSchdL_t.itm_sub2))
						.and(w1.itm_sub3.eq(ioSchdL_t.itm_sub3))));
		ioSchdL_bldr.addInnerJoin(m2, bracket(m2.loc_cd.eq(w1.loc_cd)));
		ioSchdL_bldr.setWhere(m1.lg_grp_cd.eq(m2.lg_grp_cd));
		ioSchdL_bldr.addWhereWithAnd(
				ioSchdL_t.alloc_scope_typ.eq(value(MAC_ALLOC_SCOPE_TYP.ALLOC_GRP.value())));
		dbSelect("MSBEL5090_MST_IO_SCHD_S01", ioSchdL, ioSchdL_bldr);

		delItmLocWk();
	}
	
	protected Map_MSW_ALLOC_LOC_MAP_R_MST_SHIP_STK_RPL_LST_R<MSW_ALLOC_LOC_MAP_R,MST_SHIP_STK_RPL_LST_R> createMap_MSW_ALLOC_LOC_MAP_R_MST_SHIP_STK_RPL_LST_R() {
		return new Map_MSW_ALLOC_LOC_MAP_R_MST_SHIP_STK_RPL_LST_R<MSW_ALLOC_LOC_MAP_R, MST_SHIP_STK_RPL_LST_R>();
	}

	public class Map_MSW_ALLOC_LOC_MAP_R_MST_SHIP_STK_RPL_LST_R<D extends MSW_ALLOC_LOC_MAP_R, S extends MST_SHIP_STK_RPL_LST_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_cd, MST_SHIP_STK_RPL_LST_R.$itm_cd);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub1, MST_SHIP_STK_RPL_LST_R.$itm_sub1);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub2, MST_SHIP_STK_RPL_LST_R.$itm_sub2);
			addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub3, MST_SHIP_STK_RPL_LST_R.$itm_sub3);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.gi_lg_grp_cd(src.getString("lg_grp_cd"));
		}
	}
	
	protected Map_Srch_TgtR_MST_SHIP_STK_RPL_LST_R<Srch_TgtR,MST_SHIP_STK_RPL_LST_R> createMap_Srch_TgtR_MST_SHIP_STK_RPL_LST_R() {
		return new Map_Srch_TgtR_MST_SHIP_STK_RPL_LST_R<Srch_TgtR, MST_SHIP_STK_RPL_LST_R>();
	}

	public class Map_Srch_TgtR_MST_SHIP_STK_RPL_LST_R<D extends Srch_TgtR, S extends MST_SHIP_STK_RPL_LST_R> extends FXUCC_RowMapperWith<D,S,Boolean>{
		protected boolean _isXfrSchd;
		
		@Override
		public void setWith(Boolean fixedData) {
			_isXfrSchd = fixedData;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch_TgtR.$gi_schd_dt, MST_SHIP_STK_RPL_LST_R.$schd_dt);
			addColumnPathMap(Srch_TgtR.$itm_cd, MST_SHIP_STK_RPL_LST_R.$itm_cd);
			addColumnPathMap(Srch_TgtR.$itm_sub1, MST_SHIP_STK_RPL_LST_R.$itm_sub1);
			addColumnPathMap(Srch_TgtR.$itm_sub2, MST_SHIP_STK_RPL_LST_R.$itm_sub2);
			addColumnPathMap(Srch_TgtR.$itm_sub3, MST_SHIP_STK_RPL_LST_R.$itm_sub3);
			addColumnPathMap(Srch_TgtR.$ver_no, MST_SHIP_STK_RPL_LST_R.$ver_no);
			addColumnPathMap(Srch_TgtR.$quality_typ, MST_SHIP_STK_RPL_LST_R.$quality_typ);
			addColumnPathMap(Srch_TgtR.$stk_id_typ, MST_SHIP_STK_RPL_LST_R.$stk_id_typ);
			addColumnPathMap(Srch_TgtR.$stk_bp_cd, MST_SHIP_STK_RPL_LST_R.$stk_bp_cd);
			addColumnPathMap(Srch_TgtR.$gd_cd, MST_SHIP_STK_RPL_LST_R.$gd_cd);
			addColumnPathMap(Srch_TgtR.$lot_no, MST_SHIP_STK_RPL_LST_R.$lot_no);
			addColumnPathMap(Srch_TgtR.$sublot_no, MST_SHIP_STK_RPL_LST_R.$sublot_no);
			addColumnPathMap(Srch_TgtR.$sno1, MST_SHIP_STK_RPL_LST_R.$sno1);
			addColumnPathMap(Srch_TgtR.$sno1_null_flg, MST_SHIP_STK_RPL_LST_R.$sno1_null_flg);
			addColumnPathMap(Srch_TgtR.$sno2, MST_SHIP_STK_RPL_LST_R.$sno2);
			addColumnPathMap(Srch_TgtR.$sno2_null_flg, MST_SHIP_STK_RPL_LST_R.$sno2_null_flg);
			addColumnPathMap(Srch_TgtR.$sno3, MST_SHIP_STK_RPL_LST_R.$sno3);
			addColumnPathMap(Srch_TgtR.$sno3_null_flg, MST_SHIP_STK_RPL_LST_R.$sno3_null_flg);
			addColumnPathMap(Srch_TgtR.$sno4, MST_SHIP_STK_RPL_LST_R.$sno4);
			addColumnPathMap(Srch_TgtR.$sno4_null_flg, MST_SHIP_STK_RPL_LST_R.$sno4_null_flg);
			addColumnPathMap(Srch_TgtR.$pack_unit_cd, MST_SHIP_STK_RPL_LST_R.$pack_unit_cd);
			addColumnPathMap(Srch_TgtR.$pack_unit_qty, MST_SHIP_STK_RPL_LST_R.$pack_unit_short_qty);
			addColumnPathMap(Srch_TgtR.$base_unit_cd, MST_SHIP_STK_RPL_LST_R.$base_unit_cd);
			addColumnPathMap(Srch_TgtR.$base_unit_qty, MST_SHIP_STK_RPL_LST_R.$base_unit_short_qty);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			// 引当禁止ロット、工場出荷承認、市場出荷判定の状況を考慮するため、受払予定区分、受払予定状況区分を売上関係にする
			dest.io_schd_typ(MSC_IO_SCHD_TYP.SLS.value());
			dest.io_schd_sts_typ(MSC_IO_SCHD_STS_TYP.SLO.value());
			dest.peg_no(src.getNumber("peg_no"));
			dest.gi_lg_grp_cd(src.getString("lg_grp_cd"));
			dest.vld_dt_fr(src.getDate(_tmp_valid_dt_fr));
			dest.vld_dt_fr_grp(src.getNumber(_tmp_valid_dt_fr_grp));
			dest.vld_dt_to(src.getDate(_tmp_valid_dt_to));
			if (isNullOrNullVal(src.lot_no()) && isNullOrNullVal(src.sublot_no())) {
				dest.not_lot_fix_flg(true);
			}
			dest.stk_info_loc_typ(MSC_STK_INFO_LOC_TYP.HOUSE.value());
			
			if (_isXfrSchd) {
				// 引当対象リストから入庫場所除く、棚・ライン違いは同一場所として扱う
				dest.gr_loc_cd(src.loc_cd());
			}
			dest.cst_cd(src.getStringNE("cst_cd"));
			dest.not_lot_mix_flg(src.getBooleanNE("not_lot_mix_flg"));
			dest.not_sublot_mix_flg(src.getBooleanNE("not_sublot_mix_flg"));
		}
	}
	
	protected Map_Srch_Io_SchdR_MST_IO_SCHD_R<Srch_Io_SchdR,MST_IO_SCHD_R> createMap_Srch_Io_SchdR_MST_IO_SCHD_R() {
		return new Map_Srch_Io_SchdR_MST_IO_SCHD_R<Srch_Io_SchdR, MST_IO_SCHD_R>();
	}

	public class Map_Srch_Io_SchdR_MST_IO_SCHD_R<D extends Srch_Io_SchdR, S extends MST_IO_SCHD_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch_Io_SchdR.$io_schd_typ, MST_IO_SCHD_R.$io_schd_typ);
			addColumnPathMap(Srch_Io_SchdR.$io_schd_sts_typ, MST_IO_SCHD_R.$io_schd_sts_typ);
			addColumnPathMap(Srch_Io_SchdR.$io_schd_no, MST_IO_SCHD_R.$io_schd_no);
		}
	}
	
	protected Map_MSW_SHIP_STK_RPL_ITM_LOC_R_MST_SHIP_STK_RPL_LST_R<MSW_SHIP_STK_RPL_ITM_LOC_R,MST_SHIP_STK_RPL_LST_R> createMap_MSW_SHIP_STK_RPL_ITM_LOC_R_MST_SHIP_STK_RPL_LST_R() {
		return new Map_MSW_SHIP_STK_RPL_ITM_LOC_R_MST_SHIP_STK_RPL_LST_R<MSW_SHIP_STK_RPL_ITM_LOC_R, MST_SHIP_STK_RPL_LST_R>();
	}

	public class Map_MSW_SHIP_STK_RPL_ITM_LOC_R_MST_SHIP_STK_RPL_LST_R<D extends MSW_SHIP_STK_RPL_ITM_LOC_R, S extends MST_SHIP_STK_RPL_LST_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MSW_SHIP_STK_RPL_ITM_LOC_R.$itm_cd, MST_SHIP_STK_RPL_LST_R.$itm_cd);
			addColumnPathMap(MSW_SHIP_STK_RPL_ITM_LOC_R.$itm_sub1, MST_SHIP_STK_RPL_LST_R.$itm_sub1);
			addColumnPathMap(MSW_SHIP_STK_RPL_ITM_LOC_R.$itm_sub2, MST_SHIP_STK_RPL_LST_R.$itm_sub2);
			addColumnPathMap(MSW_SHIP_STK_RPL_ITM_LOC_R.$itm_sub3, MST_SHIP_STK_RPL_LST_R.$itm_sub3);
			addColumnPathMap(MSW_SHIP_STK_RPL_ITM_LOC_R.$loc_cd, MST_SHIP_STK_RPL_LST_R.$loc_cd);
			addColumnPathMap(MSW_SHIP_STK_RPL_ITM_LOC_R.$str_ln_cd, MST_SHIP_STK_RPL_LST_R.$str_ln_cd);
		}
	}
	
	/**
	 * 引当結果から不足情報を生成します
	 * 
	 * @param shipL	出荷情報リスト
	 * @param allocOpe	引当サービス
	 * @param rplL	不足情報リスト
	 * @param isXfrSchd	移送予定作成から呼出す場合にtrue
	 */
	protected void addShipStkRplLst(
			MCList<MST_SHIP_STK_RPL_LST_R> shipL,
			MSBEL_AllocMngService.Alloc_Srch01 allocOpe,
			MCList<MST_SHIP_STK_RPL_LST_R> rplL, boolean isXfrSchd) {
		if (isNull(shipL)) {
			return;
		}
		
		// 出荷情報に対する不足情報を作成する
		addNotAllocedNrmlShipStkRplLst(rplL, allocOpe, shipL, isXfrSchd);
	}
	
	/**
	 * 出荷情報、引当結果から通常品の不足情報を取得する
	 * 
	 * @param rplL	不足情報リスト
	 * @param allocOpe	引当サービス
	 * @param shipL	出荷情報リスト
	 * @param isXfrSchd	移送予定作成から呼出す場合true
	 */
	protected void addNotAllocedNrmlShipStkRplLst(
			MCList<MST_SHIP_STK_RPL_LST_R> rplL,
			MSBEL_AllocMngService.Alloc_Srch01 allocOpe,
			MCList<MST_SHIP_STK_RPL_LST_R> shipL,
			boolean isXfrSchd) {

		MCIndexKey down0idx = allocOpe.down0().createIndex(Srch_RsltR.$peg_no);
		MCIndexKey up1Idx = allocOpe.up1().createIndex(Srch_RsltR.$peg_no);
		for (MST_SHIP_STK_RPL_LST_R shipR : shipL) {
			if (shipR.base_unit_short_qty().lte(MCNumber.ZERO)) {
				continue;
			}

			// 出荷情報に対応する引当結果を取得
			MCList<Srch_RsltR> allocedSubL = allocOpe.down0().subList(down0idx, shipR.getNumber("peg_no"));
			Srch_TgtR up1R = allocOpe.up1().getFirst(up1Idx, shipR.getNumber("peg_no"));

			// 不足一覧作成時にロット逆転を考慮した場合は、ロット毎に出荷品不足一覧を作成する
			if (!isXfrSchd && !isNull(up1R) && !isNull(allocedSubL)
					&& !(isNullOrNullVal(up1R.lot_no()) && isNullOrNullVal(up1R.sublot_no()))) {
				for (Srch_RsltR allocedSubR : allocedSubL) {
					// 出荷場所が一致する引当は対象外、棚・ライン違いは同一場所として扱う
					if(isSame(shipR.loc_cd(), allocedSubR.stk_loc_cd())) {
						continue;
					}

					MST_SHIP_STK_RPL_LST_R newShipR = shipR.clone();
					newShipR.pack_unit_short_qty(allocedSubR.pack_unit_qty());
					newShipR.base_unit_short_qty(allocedSubR.base_unit_qty());
					newShipR.lot_no(allocedSubR.lot_no());
					newShipR.sublot_no(allocedSubR.sublot_no());
					rplL.add(newShipR);
				}
				
				// 一部のみ引当した場合、残数分の不足数を作成する
				MCNumber packUnitAllocQty = allocedSubL.sum(Srch_RsltR.$pack_unit_qty);
				MCNumber baseUnitAllocQty = allocedSubL.sum(Srch_RsltR.$base_unit_qty);
				// 出荷場所の不足数
				MCNumber packUnitShortQty = shipR.pack_unit_short_qty().subtract(packUnitAllocQty);
				MCNumber baseUnitShortQty = shipR.base_unit_short_qty().subtract(baseUnitAllocQty);
				if (baseUnitShortQty.gt(MCNumber.ZERO)) {
					shipR.pack_unit_short_qty(packUnitShortQty);
					shipR.base_unit_short_qty(baseUnitShortQty);
					rplL.add(shipR);
				}
			}
			else {
				// 出荷場所の引当済数
				MCNumber packUnitshipLocQty = isXfrSchd ?
						getAllocedQty(shipR, allocedSubL, true) : getShipLocQty(shipR, allocedSubL, true);
				MCNumber baseUnitshipLocQty = MCNumber.ZERO;
				if (isSame(shipR.pack_unit_cd(), shipR.base_unit_cd())) {
					baseUnitshipLocQty = packUnitshipLocQty;
				}
				else {
					baseUnitshipLocQty = isXfrSchd ?
							getAllocedQty(shipR, allocedSubL, false) : getShipLocQty(shipR, allocedSubL, false);
				}
				// 出荷場所の不足数
				MCNumber packUnitShortQty = shipR.pack_unit_short_qty().subtract(packUnitshipLocQty);
				MCNumber baseUnitShortQty = shipR.base_unit_short_qty().subtract(baseUnitshipLocQty);
				// 出荷場所以外で引当された分は不足とみなす
				if (baseUnitShortQty.gt(MCNumber.ZERO)) {
					shipR.pack_unit_short_qty(packUnitShortQty);
					shipR.base_unit_short_qty(baseUnitShortQty);
					rplL.add(shipR);
				}
			}
		}
	}
	
	/**
	 * 出荷場所関係なく、全引当済数を取得する
	 * 
	 * @param shipR	出荷情報
	 * @param allocedSubL	引当結果
	 * @param isPack	荷姿単位数量の計算の場合true
	 * @return	出荷場所の引当済数
	 */
	protected MCNumber getAllocedQty(
			MST_SHIP_STK_RPL_LST_R shipR, MCList<Srch_RsltR> allocedSubL, boolean isPack) {

		MCNumber allocedQty = MCNumber.ZERO;
		if (isPack) {
			for (Srch_RsltR allocedSubR : allocedSubL) {
				allocedQty = allocedQty.add(allocedSubR.pack_unit_qty());
			}
		}
		else {
			for (Srch_RsltR allocedSubR : allocedSubL) {
				allocedQty = allocedQty.add(allocedSubR.base_unit_qty());
			}
		}
		return allocedQty;
	}
	
	/**
	 * 出荷場所の引当済数を取得する
	 * 
	 * @param shipR	出荷情報
	 * @param allocedSubL	引当結果
	 * @param isPack	荷姿単位数量の計算の場合true
	 * @return	出荷場所の引当済数
	 */
	protected MCNumber getShipLocQty(
			MST_SHIP_STK_RPL_LST_R shipR, MCList<Srch_RsltR> allocedSubL, boolean isPack) {

		MCNumber shipLocQty = MCNumber.ZERO;
		for (Srch_RsltR allocedSubR : allocedSubL) {
			if (isSame(shipR.loc_cd(), allocedSubR.stk_loc_cd())) {
				if (isPack) {
					shipLocQty = shipLocQty.add(allocedSubR.pack_unit_qty());
				}
				else {
					shipLocQty = shipLocQty.add(allocedSubR.base_unit_qty());
				}
			}
		}
		return shipLocQty;
	}

	//FMCB CUSTOM END
}