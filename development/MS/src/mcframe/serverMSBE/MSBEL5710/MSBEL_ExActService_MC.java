package mcframe.serverMSBE.MSBEL5710;

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
import mcframe.serverMSBE.MSBEL5710.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBE.MSBEL5710.Query.*;
import mcframe.serverMSBE.MSBEL5500.*;
import mcframe.serverMSBE.MSBEL5010.*;
import mcframe.serverMSBB.MSBBL6220.*;
import mcframe.serverMSBB.MSBBL6010.*;
import mcframe.serverMSBB.MSBBL6080.*;
import mcframe.serverMSBE.MSBEL5900.*;
import mcframe.serverMSBE.MSBEL5930.*;
import java.util.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverMSLA.MSLAL5150.MSLAL_ShipActSendIfService;
import mcframe.serverMSLA.MSLAL5150.ShipActSendIf_Upd01_DtlR;
import mcframe.serverMAUC.MAUCL5020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ExActService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ExActService_MC extends MSBEL_ExActService_MC_A{
	//FMCB CUSTOM START
	
	protected static final Class<MSBEL_ExActService> CLAZZ = MSBEL_ExActService.class;

	/**
	 * ExAct_Upd01オペレーション.<p>
	 *
	 * 輸出実績を登録する。<br>
	 */
	public class ExAct_Upd01 extends MSBEL_ExActService_MC_A.ExAct_Upd01 {

		protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _cacheDpt;

		protected MCList<MST_IV_R> _oldIvL = null;
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			// 更新前のインボイス情報を取得する。
			_oldIvL = getIvUpdBefore();
			//インボイスヘッダ更新処理
			updIv();

			MCList<ExAct_Upd01_SrcR> srcL = null;
			MCList<ExAct_Upd01_SrcR> tagL = null;
			if (MAC_DATA_CRUD_TYP.isCRT(up0().data_crud_typ())) {
				//登録データ元を抽出する
				srcL = doSrchShipActD(up1());

				//数量割り当てて、登録対象データを纏める
				tagL = allotQty(srcL);

				//インボイス出荷実績明細登録処理
				insMstIvShipActD(tagL);
			}
			else {
				//インボイス出荷実績明細データを抽出する
				srcL = doSrchIvShipActD(up0().data_crud_typ(), up1());
				tagL = srcL;
			}
			
			MCList<ExAct_Upd01_SrcR> slsSubL = tagL.subList(ExAct_Upd01_SrcR.$trd_ptn_typ, MAC_TRD_PTN_TYP.SLS.value());
			MCList<ExAct_Upd01_SrcR> xfrProvSubL = tagL.subList(new XfrProvMatch());

			//同時計上以外の場合、すでに実績計上されたかをチェックする。
			chkActForNonSync(slsSubL, xfrProvSubL, up0().data_crud_typ());

			//出荷予定サービス実行
			callShipSchdUpd04(tagL.subList(r->!r.manual_add_flg() && !r.uplnd_flg()));

			//受払実績管理サービス実行(ワーク作成)
			callIoActSvWK(up0().data_crud_typ(), getIoActData(up0().data_crud_typ(), tagL));
			
			if(!slsSubL.isEmpty()) { //売上
				//売上予定サービス実行
				callSlsSchdUpd05(up0().data_crud_typ(), slsSubL);

				//受注状況更新処理
				MCList<ExAct_Upd01_SrcR> sloSlsTgtL = slsSubL.subList(r->!r.manual_add_flg() && !r.uplnd_flg());
				if(MAC_DATA_CRUD_TYP.isUPD(up0().data_crud_typ())) {//赤伝作成
					callSlsSTsIns01(MAC_DATA_CRUD_TYP.DEL.value(), sloSlsTgtL);
				}
				callSlsSTsIns01(MAC_DATA_CRUD_TYP.CRT.value(), sloSlsTgtL);

				MCList<ExAct_Upd01_SrcR> subL = sloSlsTgtL.subList(r->r.sync_flg() && !r.sls_cststk_flg());
				if(!subL.isEmpty()) { //出荷基準
					chkShipAcDtAcDt(subL);
					//売上実績サービス実行
					callSlsActSrv(up0().data_crud_typ(), subL);
				}
				MCList<ExAct_Upd01_SrcR> sendTgtL = slsSubL.subList(r->!r.manual_add_flg());
				// ＥＤＩ出荷実績送信ＩＦサービス実行
				callShipActSendIfSv(sendTgtL);
			}
			
			if(!xfrProvSubL.isEmpty()) { //売上以外

				//工場・物流倉庫の着荷処理が不要の場合と発注先の支給積送管理区分が[着荷登録不要]の場合のListを抽出
				MCList<ExAct_Upd01_SrcR> forActL = xfrProvSubL.subList(ExAct_Upd01_SrcR.$sync_flg, true);

				// 輸出実績の訂正では、入荷実績の取消⇒入荷予定の再作成（削除＆新規登録）⇒入荷実績の新規登録
				// 輸出実績の新規登録では、入荷予定の新規登録⇒入荷実績の新規登録
				if(!forActL.isEmpty()) {
					//入荷実績サービス実行
					callArrActUpd01Del(up0().data_crud_typ(), forActL);
				}

				//入荷予定サービス実行
				MCList<ArrSchd_DtlR> arrSchdDown0 = callArrSchdUpd01(up0().data_crud_typ(), xfrProvSubL);

				if(!forActL.isEmpty()) {
					//入荷実績サービス実行
					callArrActUpd01Ins(up0().data_crud_typ(), arrSchdDown0, forActL);
				}
			}
			
			//受払実績管理サービス実行
			callIoActUpdSv();
		}

		/**
		 * 入荷予定サービス呼び出し
		 * 訂正時には入荷予定サービスを削除と新規の２レコードで実行する
		 * 
		 * @param data_crud_typ
		 * @param tagL
		 * @return
		 */
		protected MCList<ArrSchd_DtlR> callArrSchdUpd01(String data_crud_typ, MCList<ExAct_Upd01_SrcR> tagL) {
			MSBEL_ArrSchdService.ArrSchd_Upd01 o = MSBEL_ArrSchdService.crtArrSchd_Upd01();
			
			// 部門変更対応
			MCMessageList oldMsgLDpt = new MCMessageList();
			oldMsgLDpt.addAll(MCMessagePool.getMessageList());

			MAUCL_DptUtil.setDpt(tagL, ExAct_Upd01_SrcR.$bd_dpt_cd, null, ExAct_Upd01_SrcR.$ac_dt, true);
			throwSrvErr(oldMsgLDpt);
			
			for (ExAct_Upd01_SrcR tagR : tagL) {
				if (!isNull(tagR.bd_dpt_cd())) {
					MAM_DPT_R dptR = getDpt(tagR.bd_dpt_cd(), tagR.ac_dt());
					tagR.bd_wg_cd(dptR.wg_cd());
				}
			}
			
			MCGroupByPolicy prP = new MCGroupByPolicy(getArrPrKey());
			prP.sum(ExAct_Upd01_SrcR.$trd_unit_qty);
			MCList<ExAct_Upd01_SrcR> srcPrL = tagL.groupBy(prP);

			int peg_no = 0;
			
			if (MAC_DATA_CRUD_TYP.isUPD(data_crud_typ)) {
				for(ExAct_Upd01_SrcR srcPrR : srcPrL) {
					peg_no ++;

					ArrPr_DtlR prR = ArrPr_DtlR.create();

					prR.peg_no(peg_no);
					prR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					prR.arr_pr_no(srcPrR.arr_pr_no());

					o.up0().add(prR);

					MCList<ExAct_Upd01_SrcR> srcSchdL = tagL.subList(ExAct_Upd01_SrcR.$arr_pr_no, srcPrR.arr_pr_no());
					for(ExAct_Upd01_SrcR srcSchdR : srcSchdL) {
						ArrSchd_DtlR schdR = ArrSchd_DtlR.create();

						schdR.peg_no(peg_no);
						schdR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						schdR.arr_schd_no(srcSchdR.arr_schd_no());

						o.up1().add(schdR);
					}
				}
			}
			
			for(ExAct_Upd01_SrcR srcPrR : srcPrL) {
				//ここから入荷進捗関連
				peg_no ++;

				ArrPr_DtlR prR = ArrPr_DtlR.create();
				copy(prR, srcPrR, createMap_ArrPr_DtlR_ExAct_Upd01_SrcR());

				prR.peg_no(peg_no);
				prR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				prR.prms_refl_qty(MCNumber.ZERO);
				prR.dlv_inst_qty(MCNumber.ZERO);
				prR.dlv_inst_prms_rcpt_qty(MCNumber.ZERO);
				prR.dlv_inst_prms_refl_qty(MCNumber.ZERO);

				o.up0().add(prR);

				//ここから入荷予定関連
				MCList<ExAct_Upd01_SrcR> srcTmpL = tagL.subList(getArrPrKey(), srcPrR);
				MCGroupByPolicy schdGP = new MCGroupByPolicy(getArrSchdKey());
				schdGP.sum(ExAct_Upd01_SrcR.$trd_unit_qty);
				schdGP.sum(ExAct_Upd01_SrcR.$base_unit_qty);
				MCList<ExAct_Upd01_SrcR> srcSchdL = srcTmpL.groupBy(schdGP);
				MCList<ArrSchd_DtlR> schdL = MCList.create(ArrSchd_DtlR.class);
				setAll(schdL, srcSchdL, createMap_ArrSchd_DtlR_ExAct_Upd01_SrcR());

				schdL.setNumber(ArrSchd_DtlR.$peg_no, peg_no);
				schdL.setValue(ArrSchd_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
				schdL.setValue(ArrSchd_DtlR.$arr_ptn_typ, MSC_ARR_PTN_TYP.NRML.value());

				o.up1().addAll(schdL);
			}
			
			MCMessageList oldMsgL = new MCMessageList();
			oldMsgL.addAll(MCMessagePool.getMessageList());
			
			MSBEL_ArrSchdService.ArrSchd_Chk01 chkO = MSBEL_ArrSchdService.crtArrSchd_Chk01();
			chkO.up0().setAll(o.up1());
			chkO.exec();
			
			throwSrvErr(oldMsgL);

			o.exec();
			
			return o.down0();
		}
		
		/**
		 * 入荷実績サービス呼び出し（取消）
		 * 
		 * @param data_crud_typ
		 * @param tagL
		 */
		protected void callArrActUpd01Del(String data_crud_typ, MCList<ExAct_Upd01_SrcR> tagL) {
			
			if (MAC_DATA_CRUD_TYP.isCRT(data_crud_typ)) {
				return;
			}
			
			MSBEL_ArrActService.ArrAct_Upd01 o = MSBEL_ArrActService.crtArrAct_Upd01();

			o.up0().outsrc_act_flg(false);
			o.up0().io_act_flg(false);

			MCList<ExAct_Upd01_SrcR> srcPrL = tagL.groupBy(ExAct_Upd01_SrcR.$arr_act_no, ExAct_Upd01_SrcR.$can_ac_dt);
			setAll(o.up1(), srcPrL, createMap_ArrAct_DtlR_ExAct_Upd01_SrcR());
			o.up1().setValue(ArrAct_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
			setPegNo(o.up1());
			
			MCMessageList oldMsgL = new MCMessageList();
			oldMsgL.addAll(MCMessagePool.getMessageList());

			MSBEL_ArrActService.ArrAct_Chk01 chkO = MSBEL_ArrActService.crtArrAct_Chk01();
			chkO.up0().setAll(o.up1());
			chkO.exec();
			
			throwSrvErr(oldMsgL);
			
			o.exec();
		}
		
		/**
		 * 入荷実績サービス呼び出し（新規）
		 * 
		 * @param data_crud_typ
		 * @param schdDown0：入荷予定サービスの戻り値
		 * @param tagL
		 */
		protected void callArrActUpd01Ins(String data_crud_typ, MCList<ArrSchd_DtlR> schdDown0, MCList<ExAct_Upd01_SrcR> tagL) {
			
			MCIndexKey ik = tagL.createIndex(ExAct_Upd01_SrcR.$iv_no);
			
			MCList<ArrSchd_DtlR> schdDown0ForArrAct = schdDown0.createInstance();
			for (ArrSchd_DtlR r : schdDown0) {
				ExAct_Upd01_SrcR tagR = tagL.getFirst(ik, r.iv_no());
				if (tagR != null) {
					schdDown0ForArrAct.add(r);
				}
			}
			
			MSBEL_ArrActService.ArrAct_Upd01 o = MSBEL_ArrActService.crtArrAct_Upd01();

			o.up0().outsrc_act_flg(false);
			o.up0().io_act_flg(false);

			MST_ARR_PR_R t1 = MST_ARR_PR_R.create("T1");
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");

			MCList<MST_ARR_SCHD_R> arrSchdL = MCList.create(MST_ARR_SCHD_R.class);
			MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder arrSchdL_bldr = MCQueryApiBuilder.create(t);
			arrSchdL_bldr.addSelect(t1.trd_ptn_typ);			//取引パタン区分
			arrSchdL_bldr.addSelect(t1.trd_cd);				//取引ＣＤ
			arrSchdL_bldr.addSelect(t1.rsn_cd);				//業務理由ＣＤ
			arrSchdL_bldr.addSelect(t1.bd_dpt_cd);			//負担部門ＣＤ
			arrSchdL_bldr.addSelect(t1.bd_wg_cd);			//負担ＷＧＣＤ
			arrSchdL_bldr.addSelect(m1.stk_mng_typ);			//在庫管理区分
			arrSchdL_bldr.addSelect(m1.sno1_mng_typ);		//手配ＮＯ１管理区分
			arrSchdL_bldr.addSelect(m1.sno2_mng_typ);		//手配ＮＯ２管理区分
			arrSchdL_bldr.addSelect(m1.sno3_mng_typ);		//手配ＮＯ３管理区分
			arrSchdL_bldr.addSelect(m1.sno4_mng_typ);		//手配ＮＯ４管理区分
			arrSchdL_bldr.addInnerJoin(t1, bracket( t.arr_pr_no.eq(t1.arr_pr_no)));
			arrSchdL_bldr.addInnerJoin(m1, bracket( t.itm_cd.eq(m1.itm_cd) .and(t.itm_sub1.eq(m1.itm_sub1)) .and(t.itm_sub2.eq(m1.itm_sub2)) .and(t.itm_sub3.eq(m1.itm_sub3))));
			dbSelectKey("MSBEL5710_MST_ARR_SCHD_S01", arrSchdL, arrSchdL_bldr, schdDown0ForArrAct);

			for(MST_ARR_SCHD_R r : arrSchdL) {
				ExAct_Upd01_SrcR tagR = tagL.getFirst(ik, r.iv_no());
				
				r.addDateColumn("ac_dt", tagR.ac_dt());
			}
			
			setAll(o.up1(), arrSchdL, createMap_ArrAct_DtlR_MST_ARR_SCHD_R());
			o.up1().setValue(ArrAct_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			setPegNo(o.up1());
			
			MCMessageList oldMsgL = new MCMessageList();
			oldMsgL.addAll(MCMessagePool.getMessageList());

			MSBEL_ArrActService.ArrAct_Chk01 chkO = MSBEL_ArrActService.crtArrAct_Chk01();
			chkO.up0().setAll(o.up1());
			chkO.exec();
			
			throwSrvErr(oldMsgL);
			
			o.exec();
		}
		
		protected MCList<MST_IV_R> getIvUpdBefore() {
			MCList<MST_IV_R> ivL = MCList.create(MST_IV_R.class);
			MCQueryApiBuilder ivL_bldr = MCQueryApiBuilder.create(MST_IV_R.create("T"));
			dbSelectKey("MSBEL5710_MST_IV_S01", ivL, ivL_bldr, up1());

			return ivL;
		}

		protected void updIv() {
			MCList<MST_IV_R> ivL = initIvL(up1());
			MST_IV_R t = MST_IV_R.create("T");
			MCQueryApiBuilder ivL_bldr = MCQueryApiBuilder.create(t);
			ivL.setBooleanNE(MST_IV_R.$cmpl_flg, true);
			ivL_bldr.setSet(getSetListUPD());
			ivL_bldr.setWhere(t.iv_no.eq(bindEx("iv_no")));
			dbUpdate("MSBEL5710_MST_IV_U01", ivL, ivL_bldr);
			callRevDataIns01(ivL);
		}

		protected MCList<MST_IV_R> initIvL(MCList<ExAct_Upd01_DtlR> up1) {
			setTrdSchdDt(up1);
			
			MCList<MST_IV_R> ivL = MCList.create(MST_IV_R.class);
			setAll(ivL, up1, createMap_MST_IV_R_ExAct_Upd01_DtlR());

			return ivL;
		}

		protected void setTrdSchdDt(MCList<ExAct_Upd01_DtlR> up1) {

			for(ExAct_Upd01_DtlR r : up1) {
				//取引パタン：売上の場合、取引予定日を売上予定日で設定
				if(MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())) {
					r.setDateNE(MST_IV_R.$trd_schd_dt, r.sls_schd_dt());
				}
				//取引パタン：移動・移送、移動・移送返品、支給の場合、取引予定日を入荷予定日で設定
				else {
					r.setDateNE(MST_IV_R.$trd_schd_dt, r.arr_schd_dt());
				}
			}
		}

		protected void insMstIvShipActD(MCList<ExAct_Upd01_SrcR> tagL) {

			doSeqCache(MSC_NUM_SYS_TYP.IVSHACTD, tagL.size());
			for(ExAct_Upd01_SrcR r : tagL) {
				r.d().iv_ship_act_d_no(getStrSeq(MSC_NUM_SYS_TYP.IVSHACTD));
			}
			
			MCList<MST_IV_SHIP_ACT_D_R> tmpL = tagL.innerRowList("d", MST_IV_SHIP_ACT_D_R.class);
			MCList<MST_IV_SHIP_ACT_D_R> insL = MCList.create(MST_IV_SHIP_ACT_D_R.class);
			MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_IV_SHIP_ACT_D_R.create("T"));
			insL.addAll(tmpL);
			
			dbInsert("MSBEL5710_MST_IV_SHIP_ACT_D_I01", insL, insL_bldr);
		}

		/**
		 * 出荷実績明細から登録対象のインボイス出荷実績明細に数量を割り当てる。
		 * @return
		 */
		protected MCList<ExAct_Upd01_SrcR> allotQty(MCList<ExAct_Upd01_SrcR> srcL) {
			
			//登録用
			MCList<ExAct_Upd01_SrcR> tagL = MCList.create(ExAct_Upd01_SrcR.class);

			MCList<ExAct_Upd01_SrcR> nonManL = srcL.subList(ExAct_Upd01_SrcR.$manual_add_flg, false); //マニュアル追加明細以外
			MCList<ExAct_Upd01_SrcR> manL = srcL.subList(ExAct_Upd01_SrcR.$manual_add_flg, true); //マニュアル追加明細
			
			MCList<ExAct_Upd01_SrcR> mapL = nonManL.groupBy(getMapGroupBy());
			MCIndexKey ikIvD = nonManL.createIndex(ExAct_Upd01_SrcR.$iv_no, ExAct_Upd01_SrcR.$iv_d_no, ExAct_Upd01_SrcR.$ship_schd_no);
			MCIndexKey ikShipActD = nonManL.createIndex(ExAct_Upd01_SrcR.$ship_act_d_no);
			
			//割り当て
			for(ExAct_Upd01_SrcR mapR : mapL) {
				MCList<ExAct_Upd01_SrcR> subL = nonManL.subList(ikIvD, 
						new String[]{mapR.iv_no(), mapR.iv_d_no(), mapR.ship_schd_no()});
				
				MCNumber mapQty = mapR.map_base_unit_qty(); //インボイスマップの基準単位数量
				
				// 返品済、もしくは返品予定の出荷実績明細は割当の優先順位を下げる
				subL.sort(MST_SHIP_ACT_D_R.$ship_ret_flg, MST_SHIP_ACT_D_R.$ship_act_d_no);
				
				for(ExAct_Upd01_SrcR srcR : subL) {
					if (!srcR.d().base_unit_qty().isPositive()) {
						continue;
					}
					ExAct_Upd01_SrcR tagR = ExAct_Upd01_SrcR.create();
					MCRow.copyall(tagR, srcR);
					MST_IV_SHIP_ACT_D_R actDR = MST_IV_SHIP_ACT_D_R.create();
					tagL.add(tagR);

					MCRow.copyall(actDR, srcR.d());
					
					//該当出荷実績明細の数量は割り当てに足りる場合、この時点で割り当て処理を完了する
					if(mapQty.lte(srcR.d().base_unit_qty())) {
						actDR.base_unit_qty(mapQty);
						actDR.trd_unit_qty(convTrdUnitQty(actDR.base_unit_qty(), srcR));
						if (isNull(actDR.trd_unit_qty())) {
							actDR.trd_unit_cd(actDR.base_unit_cd());
							actDR.trd_unit_qty(actDR.base_unit_qty());
						}
						actDR.pack_unit_qty(convPackUnitQty(actDR.base_unit_qty(), actDR.trd_unit_qty(), srcR));

						//出荷実績明細の基準単位数量を割り当てた数量で減算する。
						//これは、同じ出荷予定・違うインボイス明細の場合、次の割り当て時に前に割り当てた数量を減算する必要があるため。
						//また、nonManLはインボイス明細ＮＯと出荷予定ＮＯの直積となるため、同一出荷実績明細ＮＯのレコードに反映する
						for (ExAct_Upd01_SrcR shipActDR : nonManL.subList(ikShipActD, srcR.ship_act_d_no())) {
							shipActDR.d().base_unit_qty(shipActDR.d().base_unit_qty().subtract(mapQty));
						}
						
						mapQty = MCNumber.ZERO;
					}
					//該当出荷実績明細の数量は割り当てに足りない場合、次の出荷実績明細の数量で割り当てる。
					else {
						actDR.base_unit_qty(srcR.d().base_unit_qty());
						actDR.trd_unit_qty(convTrdUnitQty(actDR.base_unit_qty(), srcR));
						if (isNull(actDR.trd_unit_qty())) {
							actDR.trd_unit_cd(actDR.base_unit_cd());
							actDR.trd_unit_qty(actDR.base_unit_qty());
						}
						actDR.pack_unit_qty(convPackUnitQty(actDR.base_unit_qty(), actDR.trd_unit_qty(), srcR));
						
						mapQty = mapQty.subtract(srcR.d().base_unit_qty());
						
						for (ExAct_Upd01_SrcR shipActDR : nonManL.subList(ikShipActD, srcR.ship_act_d_no())) {
							shipActDR.d().base_unit_qty(MCNumber.ZERO);
						}
					}
					
					tagR.d(actDR);

					if(mapQty.isZero()) {
						break;
					}
				}
				
				//割り当て数量は足りない場合、エラー
				if(mapQty.gt(MCNumber.ZERO)) {
					MCMessageList oldMsgL = new MCMessageList();
					oldMsgL.addAll(MCMessagePool.getMessageList());
					MCMessagePool.add(new MCMessage(MSBEL0232, 
							mapR.iv_no(), mapR.iv_d_no(), mapR.ship_schd_no(), mapQty.negate()));
					throwSrvErr(oldMsgL);
				}
			}
			
			if(!manL.isEmpty()) {
				tagL.addAll(manL);
			}
			
			return tagL;
		}

		/**
		 * 取引単位数量に変換する。
		 * @param baseQty
		 * @param srcR
		 * @return
		 */
		protected MCNumber convTrdUnitQty(MCNumber baseQty, ExAct_Upd01_SrcR srcR) {
			MCNumber qty = null;
			if(isSame(srcR.d().trd_unit_cd(), srcR.d().base_unit_cd())) {
				qty = baseQty;
			}
			else {
				qty = rvrsBaseUnitConv(
						baseQty,
						srcR.trd_conv_base_qty(),
						srcR.trd_conv_qty(),
						srcR.trd_dec_place(),
						srcR.trd_rnd_typ()
						);
			}
			
			MCNumber baseUnitQty = convToBaseUnit(qty,
					srcR.trd_conv_base_qty(), srcR.trd_conv_qty(),
					srcR.base_dec_place(), srcR.base_rnd_typ());
			if (!isSame(baseQty, baseUnitQty)) {
				qty = null;
			}

			return qty;
		}

		/**
		 * 荷姿単位数量に変換する
		 * @param baseQty
		 * @param trdQty
		 * @param srcR
		 * @return
		 */
		protected MCNumber convPackUnitQty(MCNumber baseQty, MCNumber trdQty, ExAct_Upd01_SrcR srcR) {
			MCNumber qty = null;

			if(isSame(srcR.pack_unit_cd(), srcR.base_unit_cd())) {
				qty = baseQty;
			}
			else if(isSame(srcR.pack_unit_cd(), srcR.trd_unit_cd())) {
				qty = trdQty;
			}
			else {
				qty = rvrsBaseUnitConv(
						baseQty,
						srcR.pack_conv_base_qty(),
						srcR.pack_conv_qty(),
						srcR.pack_dec_place(),
						srcR.pack_rnd_typ()
						);
				
				MCNumber baseUnitQty = convToBaseUnit(qty,
						srcR.pack_conv_base_qty(), srcR.pack_conv_qty(),
						srcR.base_dec_place(), srcR.base_rnd_typ());
				if (!isSame(baseQty, baseUnitQty)) {
					MCMessagePool.add(new MCMessage(MSBEL0144, 
							srcR.iv_no(), srcR.iv_d_no(), baseQty, srcR.pack_unit_cd()));
					throwUpdErr();
				}
			}

			return qty;
		}

		/**
		 * 出荷実績明細と関連テーブルからインボイス出荷実績明細を作成するデータ元を抽出する。
		 */
		protected MCList<ExAct_Upd01_SrcR> doSrchShipActD(MCList<ExAct_Upd01_DtlR> up1) {
			
			insIvWk();
			MCList<ExAct_Upd01_SrcR> srcL = MCList.create(ExAct_Upd01_SrcR.class);
			executeQuery(srcL, MSBEL5710_MST_SHIP_ACT_D_S01());

			//非諸口品の場合、
			//万が一取引先マスタ or 場所マスタの帳票出力ロケールと品目マスタ（ロケール）が一致せずにインボイス表記品名を取れなかった場合、エラーを出す。
			MCMessageList msgL = new MCMessageList();
			msgL.addAll(check(srcL.groupBy(ExAct_Upd01_SrcR.$itm_cd, ExAct_Upd01_SrcR.$itm_sub1, 
							ExAct_Upd01_SrcR.$itm_sub2, ExAct_Upd01_SrcR.$itm_sub3, ExAct_Upd01_SrcR.$iv_itm_nm), 
							ExAct_Upd01_SrcR.$iv_itm_nm,
							new FXUCL_RequiredValidater()));
			if(!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
				throwUpdErr();
			}
			setRetQty(srcL);
			setShipAcDt(srcL);
			
			return srcL;
		}
		
		protected void insIvWk() {
			MCList<MST_IV_R> insWkL = MCList.create(MST_IV_R.class);
			MCQueryApiBuilder insWkL_bldr = MCQueryApiBuilder.create(MST_IV_R.create("T"));
			dbWkDelete("MSBEL5710_MSW_IV_D01", insWkL_bldr.getBaseDbc());
			for(ExAct_Upd01_DtlR srcR : up1()) {
				MST_IV_R r = MST_IV_R.create();
				r.iv_mng_no(srcR.iv_mng_no());
				insWkL.add(r);
			}
			dbWkInsert("MSBEL5710_MSW_IV_I01", insWkL, insWkL_bldr.getBaseDbc());
		}
		
		protected void setRetQty(MCList<ExAct_Upd01_SrcR> srcL) {
			MCList<ExAct_Upd01_SrcR> nonManL = srcL.subList(ExAct_Upd01_SrcR.$manual_add_flg, false); //マニュアル追加明細以外
			
			// 出荷実績明細に対応する返品予定を取得
			MCList<MST_SHIP_ACT_D_R> dbc = MCList.create(MST_SHIP_ACT_D_R.class);
			MST_SHIP_ACT_D_R t = MST_SHIP_ACT_D_R.create("T");
			MST_ARR_PR_R t2 = MST_ARR_PR_R.create("T2");
			MST_ARR_SCHD_R t3 = MST_ARR_SCHD_R.create("T3");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.ship_act_d_no, t.dlv_slip_d_no, t.lot_no, t.sublot_no,
					t.base_unit_qty, t3.base_unit_qty.as("ship_ret_qty"));
			dbc_bldr.addInnerJoin(t2, bracket(t2.ret_dlv_slip_d_no.eq(t.dlv_slip_d_no)));
			dbc_bldr.addInnerJoin(t3, bracket(t3.arr_pr_no.eq(t2.arr_pr_no)
					.and(t3.lot_no.eq(t.lot_no))
					.and(t3.sublot_no.eq(t.sublot_no))
					.and(t3.cmpl_flg.eq(value(false)))));
			dbc_bldr.setWhere(t.ship_act_d_no.eq(bind("ship_act_d_no")));
			dbc_bldr.addConstWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBEL5710_MST_SHIP_ACT_D_S01", dbc, dbc_bldr, nonManL.groupBy(MST_SHIP_ACT_D_R.$ship_act_d_no), null);
			MCIndexKey idx = dbc.createIndex(MST_SHIP_ACT_D_R.$ship_act_d_no);
			
			nonManL.addBooleanColumn(MST_SHIP_ACT_D_R.$ship_ret_flg);
			for (ExAct_Upd01_SrcR r : nonManL) {
				MCNumber retQty = nvl(r.getNumber("ship_ret_qty"), MCNumber.ZERO);
				
				// 返品した分の数量は輸出数の割り当て対象から除外（予定分は含めない）
				r.d().base_unit_qty(r.d().base_unit_qty().subtract(retQty));
				
				// 返品済数量＋返品予定数量
				MCList<MST_SHIP_ACT_D_R> actDL = dbc.subList(idx, r.ship_act_d_no());
				if (!actDL.isEmpty()) {
					retQty = retQty.add(actDL.sum(MST_SHIP_ACT_D_R.$ship_ret_qty));
				}
				// 返品対象フラグを立てる（返品対象は割当対象の優先度を下げる。優先度には予定も含める）
				r.setBoolean(MST_SHIP_ACT_D_R.$ship_ret_flg, retQty.isPositive());
			}
		}
		
		/**
		 * 出荷実績送信ＩＦサービスを実行する。
		 * @param slsL 取引パタン区分が売上の元データ 
		 */
		protected void callShipActSendIfSv(MCList<ExAct_Upd01_SrcR> slsL) {
						
			MSLAL_ShipActSendIfService.ShipActSendIf_Upd01 ope = MSLAL_ShipActSendIfService.crtShipActSendIf_Upd01();
			
			MCIndexKey up1Idxkey = up1().createIndex(ExAct_Upd01_DtlR.$iv_no);
			MCIndexKey ivIdxkey = _oldIvL.createIndex(MST_IV_R.$iv_no);
			
			boolean callSendIf = false;
			ShipActSendIf_Upd01_DtlR upR = null;
			for (ExAct_Upd01_SrcR slsR : slsL.groupBy(ExAct_Upd01_SrcR.$iv_no)) {
				
				callSendIf = false;
				
				if (MAC_DATA_CRUD_TYP.isCRT(up0().data_crud_typ())) {
					callSendIf = true;
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(up0().data_crud_typ())) {
					// 訂正の場合は、完了日が変わったデータだけを対象とする
					ExAct_Upd01_DtlR up1R = up1().getFirst(up1Idxkey, slsR.iv_no());
					MST_IV_R ivR = _oldIvL.getFirst(ivIdxkey, slsR.iv_no());
					
					if (!isNull(up1R) && !isNull(ivR) && !isSame(up1R.cmpl_dt(), ivR.cmpl_dt())) {
						callSendIf = true;
					}
				}
				
				if (callSendIf) {
					
					upR = ShipActSendIf_Upd01_DtlR.create();
					upR.data_crud_typ(up0().data_crud_typ());
					upR.iv_no(slsR.iv_no());
					
					ope.up0().add(upR);
				}
			}

			if (ope.up0().size() > 0) {
				ope.exec();
			}
		}
	}
	
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _dpt = null;
	
	/**
	 * 部門マスタの取得
	 * 
	 * @param dptCd
	 * @param dt
	 * @return
	 */
	protected static MAM_DPT_R getDpt(String dptCd, MCDate dt) {
		return object(CLAZZ)._getDpt(dptCd, dt);
	}
	
	protected MAM_DPT_R _getDpt(String dptCd, MCDate dt) {
		
		MCList<MCRow> bindL = MCList.create(MCRow.class);
		if (_dpt == null) {
			MAM_DPT_R t = MAM_DPT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			_dpt = new FXUCL_MCDbcCacheStEnd<MAM_DPT_R>(dbc_bldr, bindL, MAM_DPT_R.$dpt_cd);

		}
		return _dpt.get(dt, dptCd);
	}

	/**
	 * ExAct_Del01オペレーション.<p>
	 *
	 * 輸出実績を削除する。<br>
	 */
	public class ExAct_Del01 extends MSBEL_ExActService_MC_A.ExAct_Del01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			//削除データを抽出する
			MCList<ExAct_Upd01_SrcR> srcL = doSrchIvShipActD(MAC_DATA_CRUD_TYP.DEL.value(), up0());

			MCList<ExAct_Upd01_SrcR> slsSubL = srcL.subList(ExAct_Upd01_SrcR.$trd_ptn_typ, MAC_TRD_PTN_TYP.SLS.value()); //売上
			MCList<ExAct_Upd01_SrcR> xfrProvSubL = srcL.subList(new XfrProvMatch()); //売上以外
			MCList<ExAct_Upd01_SrcR> sloSlsTgtL = slsSubL.subList(r->!r.manual_add_flg() && !r.uplnd_flg());  //売上(受注あり)

			//同時計上以外の場合、すでに実績計上されたかをチェックする。
			chkActForNonSync(slsSubL, xfrProvSubL, MAC_DATA_CRUD_TYP.DEL.value());
			
			MCList<ExAct_Upd01_SrcR> sendTgtL = slsSubL.subList(r->!r.manual_add_flg());
			// ＥＤＩ出荷実績送信ＩＦサービスを実行する
			callShipActSendIfSv(sendTgtL);
			
			//インボイスヘッダ更新処理
			updIv();

			//インボイス出荷実績明細を削除
			delShipActD(up0());

			//出荷予定サービス実行
			callShipSchdUpd04(sloSlsTgtL.subList(ExAct_Upd01_SrcR.$manual_add_flg, false));

			//受払実績管理サービス実行(ワーク作成)
			callIoActSvWK(MAC_DATA_CRUD_TYP.DEL.value(), getIoActData(MAC_DATA_CRUD_TYP.DEL.value(), srcL));
				
			if(!slsSubL.isEmpty()) { //売上
				
				MCList<ExAct_Upd01_SrcR> subL = sloSlsTgtL.subList(r-> r.sync_flg() && !r.sls_cststk_flg());
				
				//受注状況更新処理
				callSlsSTsIns01(MAC_DATA_CRUD_TYP.DEL.value(), sloSlsTgtL.subList(ExAct_Upd01_SrcR.$manual_add_flg, false));
				
				if(!subL.isEmpty()) { //出荷基準
					//売上実績サービス実行
					callSlsActSrv(MAC_DATA_CRUD_TYP.DEL.value(), subL);
				}

				//売上予定サービス実行
				callSlsSchdUpd05(MAC_DATA_CRUD_TYP.DEL.value(), slsSubL);
			}
			
			if(!xfrProvSubL.isEmpty()) { //売上以外

				//工場・物流倉庫の着荷処理が不要の場合と発注先の支給積送管理区分が[着荷登録不要]の場合のListを抽出
				MCList<ExAct_Upd01_SrcR> forActL = xfrProvSubL.subList(ExAct_Upd01_SrcR.$sync_flg, true);
				if(!forActL.isEmpty()) {
					//入荷実績サービス実行
					callArrActUpd01(forActL);
				}
				
				//入荷予定サービス実行
				callArrSchdUpd01(xfrProvSubL);
			}
			
			//受払実績管理サービス実行
			callIoActUpdSv();
		}
		
		protected void updIv() {
			MCList<MST_IV_R> ivL = initIvL(up0());
			MST_IV_R t = MST_IV_R.create("T");
			MCQueryApiBuilder ivL_bldr = MCQueryApiBuilder.create(t);
			ivL_bldr.setSet(getSetListDEL());
			ivL_bldr.setWhere(t.iv_no.eq(bindEx("iv_no")));
			dbUpdate("MSBEL5710_MST_IV_U02", ivL, ivL_bldr);
			callRevDataIns01(ivL);
		}

		protected MCList<MST_IV_R> initIvL(MCList<ExAct_Upd01_DtlR> up0) {
			MCList<MST_IV_R> ivL = MCList.create(MST_IV_R.class);
			setAll(ivL, up0, createMap_MST_IV_R_ExAct_Upd01_DtlR());

			return ivL;
		}
				
		/**
		 * 入荷実績サービス呼び出し
		 */
		protected void callArrActUpd01(MCList<ExAct_Upd01_SrcR> tagL) {
			MSBEL_ArrActService.ArrAct_Upd01 o = MSBEL_ArrActService.crtArrAct_Upd01();

			o.up0().outsrc_act_flg(false);
			o.up0().io_act_flg(false);

			MCList<ExAct_Upd01_SrcR> srcPrL = tagL.groupBy(ExAct_Upd01_SrcR.$arr_act_no, ExAct_Upd01_SrcR.$can_ac_dt);
			setAll(o.up1(), srcPrL, createMap_ArrAct_DtlR_ExAct_Upd01_SrcR());
			o.up1().setValue(ArrAct_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
			setPegNo(o.up1());
			
			MCMessageList oldMsgL = new MCMessageList();
			oldMsgL.addAll(MCMessagePool.getMessageList());

			MSBEL_ArrActService.ArrAct_Chk01 chkO = MSBEL_ArrActService.crtArrAct_Chk01();
			chkO.up0().setAll(o.up1());
			chkO.exec();
			
			throwSrvErr(oldMsgL);
			
			o.exec();
		}
		
		/**
		 * 入荷予定サービス呼び出し
		 */
		protected void callArrSchdUpd01(MCList<ExAct_Upd01_SrcR> tagL) {
			MSBEL_ArrSchdService.ArrSchd_Upd01 o = MSBEL_ArrSchdService.crtArrSchd_Upd01();
			
			MCList<ExAct_Upd01_SrcR> srcPrL = tagL.groupBy(ExAct_Upd01_SrcR.$arr_pr_no);

			int peg_no = 0;
			for(ExAct_Upd01_SrcR srcPrR : srcPrL) {
				peg_no ++;

				ArrPr_DtlR prR = ArrPr_DtlR.create();

				prR.peg_no(peg_no);
				prR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				prR.arr_pr_no(srcPrR.arr_pr_no());

				o.up0().add(prR);

				MCList<ExAct_Upd01_SrcR> srcSchdL = tagL.subList(ExAct_Upd01_SrcR.$arr_pr_no, srcPrR.arr_pr_no());
				for(ExAct_Upd01_SrcR srcSchdR : srcSchdL) {
					ArrSchd_DtlR schdR = ArrSchd_DtlR.create();

					schdR.peg_no(peg_no);
					schdR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					schdR.arr_schd_no(srcSchdR.arr_schd_no());

					o.up1().add(schdR);
				}
			}
			
			MCMessageList oldMsgL = new MCMessageList();
			oldMsgL.addAll(MCMessagePool.getMessageList());
			
			MSBEL_ArrSchdService.ArrSchd_Chk01 chkO = MSBEL_ArrSchdService.crtArrSchd_Chk01();
			chkO.up0().setAll(o.up1());
			chkO.exec();
			
			throwSrvErr(oldMsgL);

			o.exec();
		}
		/**
		 * 出荷実績送信ＩＦサービスを実行する。
		 * @param slsL 取引パタン区分が売上の削除データ
		 */
		protected void callShipActSendIfSv(MCList<ExAct_Upd01_SrcR> slsL) {
						
			MSLAL_ShipActSendIfService.ShipActSendIf_Upd01 ope = MSLAL_ShipActSendIfService.crtShipActSendIf_Upd01();
			
			ShipActSendIf_Upd01_DtlR upR = null;
			for (ExAct_Upd01_SrcR slsR : slsL.groupBy(ExAct_Upd01_SrcR.$iv_no)) {
					
				upR = ShipActSendIf_Upd01_DtlR.create();
				upR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				upR.iv_no(slsR.iv_no());
				
				ope.up0().add(upR);
			}

			if (ope.up0().size() > 0) {
				ope.exec();
			}
		}
	}

	/**
	 * インボイス出荷実績の取得
	 * 
	 * @param data_crud_typ
	 * @param up0
	 * @return
	 */
	protected MCList<ExAct_Upd01_SrcR> doSrchIvShipActD(String data_crud_typ, MCList<ExAct_Upd01_DtlR> up0) {
		
		insIvWk(up0);
		MCList<ExAct_Upd01_SrcR> srcL = MCList.create(ExAct_Upd01_SrcR.class);
		executeQuery(srcL, MSBEL5710_MST_IV_SHIP_ACT_D_S02());

		// 取消計上日の反映
		MCIndexKey ik = up0.createIndex(ExAct_Upd01_DtlR.$iv_no);
		for(ExAct_Upd01_SrcR srcR : srcL) {
			ExAct_Upd01_DtlR up0R = up0.getFirst(ik, srcR.iv_no());
			srcR.can_ac_dt(up0R.can_ac_dt());
		}
		setShipAcDt(srcL);
		return srcL;
	}

	protected void insIvWk(MCList<ExAct_Upd01_DtlR> up0) {
		MCList<MST_IV_R> insWkL = MCList.create(MST_IV_R.class);
		MCQueryApiBuilder insWkL_bldr = MCQueryApiBuilder.create(MST_IV_R.create("T"));
		dbWkDelete("MSBEL5710_MSW_IV_D02", insWkL_bldr.getBaseDbc());
		for(ExAct_Upd01_DtlR srcR : up0) {
			MST_IV_R r = MST_IV_R.create();
			r.iv_mng_no(srcR.iv_mng_no());
			insWkL.add(r);
		}
		dbWkInsert("MSBEL5710_MSW_IV_I02", insWkL, insWkL_bldr.getBaseDbc());
	}

	protected void setShipAcDt(MCList<ExAct_Upd01_SrcR> srcL) {
		MCList<ExAct_Upd01_SrcR> nonManL = srcL.subList(ExAct_Upd01_SrcR.$manual_add_flg, false);

		MCList<MST_SHIP_ACT_D_R> shipActDL = getShipAcDt(nonManL);
		MCIndexKey shipActDIdx = shipActDL.createIndex(MST_SHIP_ACT_D_R.$ship_act_d_no);

		nonManL.addStringColumn("ship_act_no");
		nonManL.addDateColumn("ship_ac_dt");
		for (ExAct_Upd01_SrcR r : nonManL) {
			MST_SHIP_ACT_D_R shipActDR = shipActDL.getFirst(shipActDIdx, r.ship_act_d_no());
			if (!isNull(shipActDR)) {
				r.setDate("ship_ac_dt", shipActDR.getDateNE("ship_ac_dt"));
				r.setString("ship_act_no", shipActDR.getStringNE("ship_act_no"));
			}
		}
	}

	protected MCList<MST_SHIP_ACT_D_R> getShipAcDt(MCList<ExAct_Upd01_SrcR> nonManL) {
		MCList<MST_SHIP_ACT_D_R> shipActDL = MCList.create(MST_SHIP_ACT_D_R.class);
		MST_SHIP_ACT_D_R shipActDR = MST_SHIP_ACT_D_R.create("SHIPACTD");
		MST_SHIP_ACT_R shipActR = MST_SHIP_ACT_R.create("SHIPACT");
		MCQueryApiBuilder shipActDBldr = MCQueryApiBuilder.create(shipActDR);
		shipActDBldr.setSelect(shipActDR.ship_act_d_no);
		shipActDBldr.addSelect(shipActR.ship_act_no.as("ship_act_no"));
		shipActDBldr.addSelect(shipActR.ac_dt.as("ship_ac_dt"));
		shipActDBldr.addInnerJoin(shipActR,
				bracket(shipActR.ship_act_no.eq(shipActDR.ship_act_no)));
		shipActDBldr.setWhere(shipActDR.ship_act_d_no.eq(bind("ship_act_d_no")));
		shipActDBldr.addConstWhereWithAnd(shipActDR.can_flg.eq(value(false)));
		dbSelect("MSBEL5710_MST_SHIP_ACT_D_S02", shipActDL, shipActDBldr,
				nonManL.groupBy(MST_SHIP_ACT_D_R.$ship_act_d_no), null);

		return shipActDL;
	}

	protected void chkShipAcDtAcDt(MCList<ExAct_Upd01_SrcR> subL) {
		MCList<ExAct_Upd01_SrcR> nonManL = subL.subList(ExAct_Upd01_SrcR.$manual_add_flg,false);
		MCList<ExAct_Upd01_SrcR> chkL = MCList.create(ExAct_Upd01_SrcR.class);
		MCMessageList oldMsgL = new MCMessageList();
		oldMsgL.addAll(MCMessagePool.getMessageList());

		for (MCList<ExAct_Upd01_SrcR> l : nonManL.groupList("ship_act_no")) {
			chkL.add(l.get(0));
		}
		for (ExAct_Upd01_SrcR r : chkL) {
			if (r.ac_dt().lt(r.getDate("ship_ac_dt"))) {
				MCMessagePool.add(
						new MCMessage(MSBEL1068, toYMDString(r.getDate("ship_ac_dt")),
								toYMDString(r.ac_dt()), r.getString("ship_act_no")));
			}
		}

		throwSrvErr(oldMsgL);
	}

	/**
	 * 同時計上以外の場合、すでに実績計上されたかをチェックする。
	 * @param slsSubL
	 * @param xfrProvSubL
	 * @param data_crud_typ
	 */
	protected void chkActForNonSync(
			MCList<ExAct_Upd01_SrcR> slsSubL, 
			MCList<ExAct_Upd01_SrcR> xfrProvSubL, 
			String data_crud_typ)
	{
		if (MAC_DATA_CRUD_TYP.isCRT(data_crud_typ)) {	
			return;
		}
		
		MCMessageList msgL = new MCMessageList();

		if(!slsSubL.isEmpty()) { //売上
			MCList<ExAct_Upd01_SrcR> subL = slsSubL.subList(ExAct_Upd01_SrcR.$sync_flg, false)
												.subList(ExAct_Upd01_SrcR.$sls_cststk_flg, false)
												.groupBy(ExAct_Upd01_SrcR.$iv_no, ExAct_Upd01_SrcR.$sls_act_no);
			
			for(ExAct_Upd01_SrcR r : subL) {
				if (!isNull(r.sls_act_no())) {
					msgL.add(new MCMessage(MSBEL0295, r.iv_no()));
				}
			}
		}

		if(!xfrProvSubL.isEmpty()) { //売上以外
			MCList<ExAct_Upd01_SrcR> subL = xfrProvSubL.subList(ExAct_Upd01_SrcR.$sync_flg, false)
												.groupBy(ExAct_Upd01_SrcR.$iv_no, ExAct_Upd01_SrcR.$arr_act_no);

			for(ExAct_Upd01_SrcR r : subL) {
				if (!isNull(r.arr_act_no())) {
					msgL.add(new MCMessage(MSBEL0296, r.iv_no()));
				}
			}
		}
		MCMessageList oldMsgL = new MCMessageList();
		oldMsgL.addAll(MCMessagePool.getMessageList());
		if(!msgL.isEmpty()) {
			MCMessagePool.addAll(msgL);
		}
		
		//同時計上以外の場合、すでに実績計上された場合、後続処理をせずに処理中断する。
		if (MAC_DATA_CRUD_TYP.isUPD(data_crud_typ)) {	
			throwSrvErr(oldMsgL);
		}
		if (MAC_DATA_CRUD_TYP.isDEL(data_crud_typ)) {	
			throwSrvErr(oldMsgL);
		}
	}
	
	protected void delShipActD(MCList<ExAct_Upd01_DtlR> bindL) {
		MST_IV_SHIP_ACT_D_R t = MST_IV_SHIP_ACT_D_R.create("T");

		execDbDelete("MSBEL5710_MST_IV_SHIP_ACT_D_D01", t, t.iv_no.eq(bind("iv_no")), bindL);
	}

	/**
	 * 出荷予定更新サービス呼び出し
	 */
	protected void callShipSchdUpd04(MCList<ExAct_Upd01_SrcR> subL) {
		MSBEL_ShipSchdService.ShipSchd_Upd04 o = MSBEL_ShipSchdService.crtShipSchd_Upd04();
		
		setAll(o.up0(), 
				subL.groupBy(ExAct_Upd01_SrcR.$ship_pr_no, ExAct_Upd01_SrcR.$ship_schd_no), 
				createMap_ShipSchd_Upd04_DtlR_ExAct_Upd01_SrcR());

		setAll(o.up1(), 
				subL.groupBy(ExAct_Upd01_SrcR.$iv_ship_act_d_no, ExAct_Upd01_SrcR.$ship_act_d_no), 
				createMap_ShipSchd_Upd04_ActDtlR_ExAct_Upd01_SrcR());

		if (!o.up0().isEmpty()) {
			o.exec();
		}
	}

	/**
	 * 受払実績ＷＫにINSERTするデータを整理する
	 * @param data_crud_typ
	 * @param srcL
	 * @return
	 */
	protected MCList<ExAct_Upd01_SrcR> getIoActData(String data_crud_typ, MCList<ExAct_Upd01_SrcR> srcL) {
		// 取引パタン区分が出荷の場合、受払実績を作成しない
		MCList<ExAct_Upd01_SrcR> tgtScrL = srcL.subList(r->!MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ()));
		if (MAC_DATA_CRUD_TYP.isCRT(data_crud_typ)) {
			return tgtScrL;
		}

		MCList<ExAct_Upd01_SrcR> tgtL = MCList.create(ExAct_Upd01_SrcR.class);

		MCList<ExAct_Upd01_SrcR> gpL = tgtScrL.groupBy(ExAct_Upd01_SrcR.$iv_no, ExAct_Upd01_SrcR.$iv_ship_act_d_no);
		for(ExAct_Upd01_SrcR gpR : gpL) {
			tgtL.add(tgtScrL.subList(
						new String[]{ExAct_Upd01_SrcR.$iv_no, ExAct_Upd01_SrcR.$iv_ship_act_d_no}, 
						new String[]{gpR.iv_no(), gpR.iv_ship_act_d_no()}).get(0));
		}

		return tgtL;
	}
	
	/**
	 * 受払実績サービス呼び出し（受払ワークの登録）
	 * 
	 */
	protected void callIoActSvWK(String data_crud_typ, MCList<ExAct_Upd01_SrcR> subL) {
		MSBEL_IoActService.IoAct_Ins01 o = MSBEL_IoActService.crtIoAct_Ins01();
		o.up0().setAll(makeIoUp(data_crud_typ, subL));
		o.exec();
	}

	protected class XfrProvMatch implements MCRowMatcher<ExAct_Upd01_SrcR> {
		public boolean match(ExAct_Upd01_SrcR m) {
			if (MAC_TRD_PTN_TYP.isXFR(m.trd_ptn_typ()) ||
 				MAC_TRD_PTN_TYP.isXFR_RTN(m.trd_ptn_typ()) ||
 				MAC_TRD_PTN_TYP.isPROV(m.trd_ptn_typ()))
			{
				return true;
			}
			return false;
		}
	}

	/**
	 * 売上予定サービス実行呼び出し
	 */
	protected void callSlsSchdUpd05(String data_crud_typ, MCList<ExAct_Upd01_SrcR> subL) {
		MSBBL_SlsSchdService.Sls_Schd_Upd05 o = MSBBL_SlsSchdService.crtSls_Schd_Upd05();
		
		MCGroupByPolicy p = null;
		MCList<ExAct_Upd01_SrcR> gpL = null;
		if(!MAC_DATA_CRUD_TYP.isDEL(data_crud_typ)) {
			p = new MCGroupByPolicy(
					ExAct_Upd01_SrcR.$iv_d_no, 
					ExAct_Upd01_SrcR.$trd_schd_dt);
			gpL = subL.groupBy(p);
		}
		else {
			p = new MCGroupByPolicy(
					ExAct_Upd01_SrcR.$iv_d_no);
			gpL = subL.groupBy(p);
		}
		
		//o.up0()の初期化
		MCList<Sls_Schd_Upd05_DtlR> slsDtlL = MCList.create(Sls_Schd_Upd05_DtlR.class);
		for(ExAct_Upd01_SrcR dR : gpL) {

			Sls_Schd_Upd05_DtlR slsDtlR = Sls_Schd_Upd05_DtlR.create();
			
			slsDtlR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.EX_ACT.value());		//売上予定作成元区分：輸出実績
			slsDtlR.data_crud_typ(data_crud_typ);								//データ更新区分
			slsDtlR.iv_d_no(dR.iv_d_no());										//インボイス明細ＮＯ
			if(!MAC_DATA_CRUD_TYP.isDEL(data_crud_typ)) {
				slsDtlR.sls_schd_dt(dR.trd_schd_dt());							//売上予定日（＝ＩＶヘッダの取引予定日）
			}
			slsDtlL.add(slsDtlR);
		}
		o.up0().setAll(slsDtlL);

		//o.up1()の初期化
		MCList<Sls_Schd_Upd05_IVActR> slsIvActL = MCList.create(Sls_Schd_Upd05_IVActR.class);
		for(ExAct_Upd01_SrcR dR : subL) {
			Sls_Schd_Upd05_IVActR slsIvActR = Sls_Schd_Upd05_IVActR.create();

			slsIvActR.data_crud_typ(data_crud_typ);							//データ更新区分
			slsIvActR.slo_d_no(dR.slo_d_no());								//受注明細ＮＯ
			if(MAC_DATA_CRUD_TYP.isDEL(data_crud_typ)) {
				slsIvActR.ship_act_d_no(dR.d().ship_act_d_no());			//出荷実績明細ＮＯ
			}
			slsIvActR.iv_ship_act_d_no(dR.d().iv_ship_act_d_no());			//インボイス出荷実績明細ＮＯ

			slsIvActL.add(slsIvActR);
		}
		o.up1().setAll(slsIvActL);

		o.exec();
	}

	/**
	 * 売上実績サービスを呼び出し、売上実績を更新する
	 */
	protected void callSlsActSrv(String data_crud_typ, MCList<ExAct_Upd01_SrcR> subL) {

		MCList<ExAct_Upd01_SrcR> gpL = subL.groupBy(ExAct_Upd01_SrcR.$iv_no, ExAct_Upd01_SrcR.$can_ac_dt);

		MSBBL_SlsActService.SlsAct_Upd02 o = MSBBL_SlsActService.crtSlsAct_Upd02();

		for(ExAct_Upd01_SrcR r : gpL) {
			SlsAct_Upd02_CndR slsActR = SlsAct_Upd02_CndR.create();
			
			slsActR.iv_no(r.iv_no());
			slsActR.data_crud_typ(data_crud_typ);
			slsActR.can_ac_dt(r.can_ac_dt());
			o.up0().add(slsActR);
		}

		o.exec();
	}

	protected void callIoActUpdSv() {
		MSBEL_IoActService.IoAct_Upd01 o = MSBEL_IoActService.crtIoAct_Upd01();
		o.exec();
	}

	/**
	 * 受注状況登録サービス呼び出し
	 */
	protected void callSlsSTsIns01(String data_crud_typ, MCList<ExAct_Upd01_SrcR> srcL) {
		MCList<ExAct_Upd01_SrcR> tagL = srcL.groupBy(
				new String[] {
						ExAct_Upd01_SrcR.$slo_d_no,						//受注明細ＮＯ
						ExAct_Upd01_SrcR.$tax_cd,						//税ＣＤ
						ExAct_Upd01_SrcR.$iv_no,						//インボイスＮＯ
						ExAct_Upd01_SrcR.$iv_d_no,						//インボイス明細ＮＯ
						ExAct_Upd01_SrcR.$trd_cur_cd,					//通貨ＣＤ
						ExAct_Upd01_SrcR.$cmpl_dt,						//完了日
						ExAct_Upd01_SrcR.$iv_d_trd_unit_cd,				//取引単位ＣＤ
						ExAct_Upd01_SrcR.$trd_cur_upri,					//取引通貨単価
						ExAct_Upd01_SrcR.$ac_dt,						//計上日
						ExAct_Upd01_SrcR.$can_ac_dt,					//取消計上日
						ExAct_Upd01_SrcR.$iv_d_trd_unit_qty,			//取引単位数量
						ExAct_Upd01_SrcR.$trd_cur_amt,					//取引通貨金額
						ExAct_Upd01_SrcR.$trd_cur_tax_amt				//取引通貨税額
					}
				);

		MSBBL_SloStsRegService.SloSts_Ins01 o = MSBBL_SloStsRegService.crtSloSts_Ins01();

		MCList<SloSts_DtlR> sloStsDtlL = MCList.create(SloSts_DtlR.class);

		for(ExAct_Upd01_SrcR dR : tagL) {

			SloSts_DtlR sloStsDtlR = SloSts_DtlR.create();
			sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.EX.value());	//受注状況区分：輸出

			copy(sloStsDtlR, dR, createMap_SloSts_DtlR_ExAct_Upd01_SrcR(data_crud_typ));
			sloStsDtlL.add(sloStsDtlR);
		}

		o.up0().setAll(sloStsDtlL);

		o.exec();
	}


	/**
	 * 入荷進捗を作成する単位
	 */
	protected String[] getArrPrKey() {

		return new String[] {
			ExAct_Upd01_SrcR.$trd_cd,
			ExAct_Upd01_SrcR.$trd_ptn_typ,
			ExAct_Upd01_SrcR.$dlv_slip_d_no,
			ExAct_Upd01_SrcR.$iv_d_no,
			ExAct_Upd01_SrcR.$trd_unit_cd,
			ExAct_Upd01_SrcR.$arr_pr_no,
			ExAct_Upd01_SrcR.$rsn_cd,
			ExAct_Upd01_SrcR.$bd_dpt_cd,
			ExAct_Upd01_SrcR.$bd_wg_cd
		};
	}

	/**
	 * 入荷予定を作成する単位
	 */
	protected String[] getArrSchdKey() {

		return new String[] {
				ExAct_Upd01_SrcR.$trd_cd,
				ExAct_Upd01_SrcR.$trd_ptn_typ,

				ExAct_Upd01_SrcR.$arr_schd_no,
				ExAct_Upd01_SrcR.$arr_pr_no,
				ExAct_Upd01_SrcR.$gr_wg_cd,
				ExAct_Upd01_SrcR.$dlv_slip_no,
				ExAct_Upd01_SrcR.$iv_no,
				ExAct_Upd01_SrcR.$trd_schd_dt,
				ExAct_Upd01_SrcR.$itm_cd,
				ExAct_Upd01_SrcR.$itm_sub1,
				ExAct_Upd01_SrcR.$itm_sub2,
				ExAct_Upd01_SrcR.$itm_sub3,
				ExAct_Upd01_SrcR.$itm_nm,
				ExAct_Upd01_SrcR.$sundry_itm_flg,
				ExAct_Upd01_SrcR.$sno1,
				ExAct_Upd01_SrcR.$sno2,
				ExAct_Upd01_SrcR.$sno3,
				ExAct_Upd01_SrcR.$sno4,
				ExAct_Upd01_SrcR.$lot_no,
				ExAct_Upd01_SrcR.$sublot_no,
				ExAct_Upd01_SrcR.$ver_no,
				ExAct_Upd01_SrcR.$stk_arrv_bp_cd,
				ExAct_Upd01_SrcR.$gd_cd,
				ExAct_Upd01_SrcR.$quality_typ,
				ExAct_Upd01_SrcR.$stk_id_typ,
				ExAct_Upd01_SrcR.$stk_bp_cd,
				ExAct_Upd01_SrcR.$dlv_id_cd,
				ExAct_Upd01_SrcR.$arr_str_ln_cd,
				ExAct_Upd01_SrcR.$trd_unit_cd,
				ExAct_Upd01_SrcR.$base_unit_cd,
				ExAct_Upd01_SrcR.$gi_vmi_flg,
				ExAct_Upd01_SrcR.$arr_cnt_rmrks,
				
				ExAct_Upd01_SrcR.$accpt_schd_dt,
				ExAct_Upd01_SrcR.$prov_typ,
				ExAct_Upd01_SrcR.$prov_basis_typ,
				ExAct_Upd01_SrcR.$xrate,
				ExAct_Upd01_SrcR.$ptax_xrate,
				ExAct_Upd01_SrcR.$trd_cur_cd,
				ExAct_Upd01_SrcR.$tax_cd,
				ExAct_Upd01_SrcR.$trd_cur_upri

			};
	}

	/**
	 * 受払実績SV呼出のための電文作成
	 * 
	 * @return
	 */
	protected MCList<IoAct_Ins01_DtlR> makeIoUp(String data_crud_typ, MCList<ExAct_Upd01_SrcR> subL) {
		MCList<IoAct_Ins01_DtlR> ioActL = MCList.create(IoAct_Ins01_DtlR.class);
		
		// 取消の場合
		if (MAC_DATA_CRUD_TYP.isDEL(data_crud_typ)) {
			for(ExAct_Upd01_SrcR delR : subL) {
				IoAct_Ins01_DtlR ioActDelR = IoAct_Ins01_DtlR.create();
				
				ioActDelR.data_crud_typ(data_crud_typ);								// データ更新区分
				ioActDelR.can_ac_dt(delR.can_ac_dt());								// 取消計上日
				ioActDelR.act_no(delR.iv_no());										// ヘッダ実績ＮＯ
				ioActDelR.act_d_no(delR.iv_ship_act_d_no());						// 明細実績ＮＯ
				ioActDelR.trn_typ(MSC_TRN_TYP.IV_SHIP.value());						// トランザクション区分（インボイス出荷）
				
				ioActL.add(ioActDelR);

			}
		}
		else {
			for(ExAct_Upd01_SrcR insUpdR : subL) {
				IoAct_Ins01_DtlR ioActR = IoAct_Ins01_DtlR.create();
				ioActL.add(ioActR);

				ioActR.data_crud_typ(data_crud_typ);								// データ更新区分
				ioActR.ac_dt(insUpdR.ac_dt());										// 計上日
				if (MAC_DATA_CRUD_TYP.isUPD(data_crud_typ)) { //更新
					ioActR.can_ac_dt(insUpdR.can_ac_dt());							// 取消計上日
				}
				ioActR.act_tm(insUpdR.cmpl_dt());									// 実績日時
				ioActR.act_no(insUpdR.iv_no());										// ヘッダ実績ＮＯ
				ioActR.act_d_no(insUpdR.iv_ship_act_d_no());						// 明細実績ＮＯ

				ioActR.trd_cd(insUpdR.trd_cd());									// 取引ＣＤ
				ioActR.trd_ptn_typ(insUpdR.trd_ptn_typ());							// 取引パタン区分
				
				ioActR.trn_typ(MSC_TRN_TYP.IV_SHIP.value());						// トランザクション区分（インボイス出荷）
				ioActR.gi_wg_cd(insUpdR.gi_wg_cd());								// 出庫ＷＧ ＣＤ
				
				if(!MAC_TRD_PTN_TYP.isSLS(insUpdR.trd_ptn_typ())) { //売上以外（移動・移送、移動・移送返品、支給）
					ioActR.gr_wg_cd(insUpdR.gr_wg_cd());							// 入庫ＷＧ ＣＤ
				}
				
				ioActR.itm_cd(insUpdR.itm_cd());									// 品目ＣＤ
				ioActR.itm_sub1(insUpdR.itm_sub1());								// 枝番１
				ioActR.itm_sub2(insUpdR.itm_sub2());								// 枝番２
				ioActR.itm_sub3(insUpdR.itm_sub3());								// 枝番３
				ioActR.itm_nm(insUpdR.itm_nm());									// 品名
				
				ioActR.stk_mng_typ(insUpdR.stk_mng_typ());							// 在庫管理区分
				ioActR.sundry_itm_flg(insUpdR.sundry_itm_flg());					// 諸口品ＦＬＧ
				ioActR.gi_loc_cd(insUpdR.ship_loc_cd());							// 出庫場所ＣＤ
				ioActR.gi_str_ln_cd(insUpdR.ship_str_ln_cd());						// 出庫棚・ラインＣＤ
				
				if(!MAC_TRD_PTN_TYP.isSLS(insUpdR.trd_ptn_typ())) { //売上以外（移動・移送、移動・移送返品、支給）
					ioActR.gr_loc_cd(insUpdR.dlv_id_cd());							// 入庫場所ＣＤ
					ioActR.gr_str_ln_cd(insUpdR.arr_str_ln_cd());					// 入庫棚・ラインＣＤ
				}
				
				ioActR.stk_arrv_bp_cd(insUpdR.tdlv_cd());							// 在庫着荷先ＣＤ
				
				ioActR.lot_no(insUpdR.lot_no());									// ロットＮＯ
				ioActR.sublot_no(insUpdR.sublot_no());								// サブロットＮＯ
				ioActR.sno1(insUpdR.sno1());										// 手配ＮＯ１
				ioActR.sno2(insUpdR.sno2());										// 手配ＮＯ２
				ioActR.sno3(insUpdR.sno3());										// 手配ＮＯ３
				ioActR.sno4(insUpdR.sno4());										// 手配ＮＯ４
				ioActR.sno1_mng_typ(insUpdR.sno1_mng_typ());						// 手配ＮＯ１管理区分
				ioActR.sno2_mng_typ(insUpdR.sno2_mng_typ());						// 手配ＮＯ２管理区分
				ioActR.sno3_mng_typ(insUpdR.sno3_mng_typ());						// 手配ＮＯ３管理区分
				ioActR.sno4_mng_typ(insUpdR.sno4_mng_typ());						// 手配ＮＯ４管理区分
				
				if(MAC_TRD_PTN_TYP.isSLS(insUpdR.trd_ptn_typ())) { //売上
					ioActR.fix_no_typ(MSC_FIX_NO_TYP.IV_NO.value());				// 確定ＮＯ区分
					ioActR.fix_no(insUpdR.iv_no());									// 確定ＮＯ
				}
				
				ioActR.gi_gd_cd(insUpdR.gd_cd());									// 出庫格付ＣＤ
				ioActR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());					// 積送品区分（通常）
				ioActR.quality_typ(insUpdR.quality_typ());							// 良品区分
				
				ioActR.stk_insp_typ(insUpdR.stk_insp_typ());						// 在庫検査区分
				
				if(MAC_TRD_PTN_TYP.isSLS(insUpdR.trd_ptn_typ())) { //売上
					if (MSC_STK_ID_TYP.isCSTSTK(insUpdR.stk_id_typ())) {
						ioActR.stk_id_typ(insUpdR.stk_id_typ());					// 在庫識別区分
						ioActR.stk_bp_cd(insUpdR.stk_bp_cd());						// 在庫取引先ＣＤ
					}
					else {
						ioActR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());				// 在庫識別区分（自社在庫）
						ioActR.stk_bp_cd(MAC_STR.NULL_VAL.value());						// 在庫取引先ＣＤ（NULL文字）
					}
				}
				else {
					if (MAC_PROV_TYP.isONR_PROV(insUpdR.prov_typ()) || 
							MAC_PROV_TYP.isFFR_PROV(insUpdR.prov_typ())) {
						ioActR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());			// 在庫識別区分（自社在庫）
						ioActR.stk_bp_cd(MAC_STR.NULL_VAL.value());					// 在庫取引先ＣＤ（NULL文字）
					}
					else {
						ioActR.stk_id_typ(insUpdR.stk_id_typ());					// 在庫識別区分
						ioActR.stk_bp_cd(insUpdR.stk_bp_cd());						// 在庫取引先ＣＤ
					}
				}
				ioActR.trd_unit_qty(insUpdR.trd_unit_qty());						// 取引単位数量
				ioActR.trd_unit_cd(insUpdR.trd_unit_cd());							// 取引単位ＣＤ
				ioActR.pack_unit_qty(insUpdR.pack_unit_qty());						// 荷姿単位数量
				ioActR.pack_unit_cd(insUpdR.pack_unit_cd());						// 荷姿単位ＣＤ
				ioActR.base_unit_qty(insUpdR.base_unit_qty());						// 基準単位数量
				ioActR.base_unit_cd(insUpdR.base_unit_cd());						// 基準単位ＣＤ
				ioActR.iv_no(insUpdR.iv_no());										// インボイスＮＯ
				
				if(MAC_TRD_PTN_TYP.isSLS(insUpdR.trd_ptn_typ())) { //売上
					ioActR.slo_no(insUpdR.slo_no());								// 受注ＮＯ
					ioActR.dlv_cd(insUpdR.dlv_id_cd());								// 納品先ＣＤ
					ioActR.tdlv_cd(insUpdR.tdlv_cd());								// 配送先ＣＤ
					ioActR.acst_cd(insUpdR.acst_cd());								// 売掛先ＣＤ
					ioActR.cst_cd(insUpdR.ship_rqst_id_cd());						// 得意先ＣＤ
					ioActR.cst_itm_cd(insUpdR.cst_itm_cd());						// 得意先品目ＣＤ
					ioActR.cst_itm_nm(insUpdR.cst_itm_nm());						// 得意先品名
				}

				ioActR.trd_rmrks(insUpdR.trd_rmrks());								// 取引備考
				ioActR.trd_d_rmrks(insUpdR.trd_d_rmrks());							// 取引明細備考
				ioActR.no_gi_alloc_flg(true);										// 出庫引当確認対象外ＦＬＧ

			}
		}
		
		return ioActL;
	}

	protected MCPermColumn[] getSetListUPD() {
		MST_IV_R t = MST_IV_R.create("T");

		return new MCPermColumn[] {
				t.cmpl_dt,			//完了日
				t.ac_dt,			//計上日
				t.trd_schd_dt,		//取引予定日
				t.bill_basis_dt,	//請求起算日
				t.rcv_schd_dt,		//入金予定日
				t.bl_no,			//Ｂ／ＬＮＯ
				t.bl_dt,			//Ｂ／Ｌ日付
				t.bl_rmrks,			//Ｂ／Ｌ備考
				t.cmpl_flg			//完了ＦＬＧ
		};
	}

	protected MCPermColumn[] getSetListDEL() {
		MST_IV_R t = MST_IV_R.create("T");

		return new MCPermColumn[] {
				t.cmpl_dt,			//完了日
				t.ac_dt,			//計上日
				t.cmpl_flg			//完了ＦＬＧ
		};
	}

	protected String[] getMapGroupBy() {

		return new String[] {
					ExAct_Upd01_SrcR.$iv_no,			//インボイスＮＯ
					ExAct_Upd01_SrcR.$iv_d_no,			//インボイス明細ＮＯ
					ExAct_Upd01_SrcR.$ship_schd_no,		//出荷予定ＮＯ
					ExAct_Upd01_SrcR.$map_base_unit_qty	//インボイスマップの基準単位数量
		};
	}
	/**
	 * 「改訂履歴データ更新リスト」テーブルにデータを登録（サービス呼び出し）。
	 * @param ivL インボイスヘッダリスト
	 */
	protected void callRevDataIns01(MCList<MST_IV_R> ivL) {
		
		MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
		
		for (MST_IV_R ivR : ivL) {
			RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
			opeR.rev_data_src_no(ivR.iv_mng_no());
			opeR.rev_no(ivR.iv_rev());
			opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_IV.value());
			ope.up0().add(opeR);
		}
		
		if (!ope.up0().isEmpty()) {
			ope.exec();
		}
	}
	
	/**
	 * サービスでエラーが起きたときに、そのメッセージを例外としてthrowする
	 * 
	 * @param oldMsgL サービスを実行する直前のMCMessagePoolの内容
	 */
	protected void throwSrvErr(MCMessageList oldMsgL) {
		
		if (oldMsgL.size() != MCMessagePool.size()) {
			MCMessageList causeMsgList = new MCMessageList();
			
			for (MCMessage causeMsg : MCMessagePool.getMessageList()) {
				if (isErrMsg(causeMsg) && !oldMsgL.contains(causeMsg)) {
					causeMsgList.add(causeMsg);
				}
			}
			if (causeMsgList.isEmpty()) {
				return;
			}
			
			MCMessagePool.removeAll(causeMsgList);
			
			MCAppException ex = new MCAppException(causeMsgList.get(0));
			causeMsgList.remove(0);
			ex.addCauseMessageList(causeMsgList);
			
			throw ex;
		}
	}

	//マッパー
	protected Map_MST_IV_R_ExAct_Upd01_DtlR<MST_IV_R,ExAct_Upd01_DtlR> createMap_MST_IV_R_ExAct_Upd01_DtlR() {
		return new Map_MST_IV_R_ExAct_Upd01_DtlR<MST_IV_R, ExAct_Upd01_DtlR>();
	}

	public class Map_MST_IV_R_ExAct_Upd01_DtlR<D extends MST_IV_R, S extends ExAct_Upd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_IV_R.$iv_no, ExAct_Upd01_DtlR.$iv_no);
			addColumnPathMap(MST_IV_R.$cmpl_dt, ExAct_Upd01_DtlR.$cmpl_dt);
			addColumnPathMap(MST_IV_R.$ac_dt, ExAct_Upd01_DtlR.$ac_dt);
			addColumnPathMap(MST_IV_R.$bill_basis_dt, ExAct_Upd01_DtlR.$bill_basis_dt);
			addColumnPathMap(MST_IV_R.$rcv_schd_dt, ExAct_Upd01_DtlR.$rcv_schd_dt);
			addColumnPathMap(MST_IV_R.$bl_no, ExAct_Upd01_DtlR.$bl_no);
			addColumnPathMap(MST_IV_R.$bl_dt, ExAct_Upd01_DtlR.$bl_dt);
			addColumnPathMap(MST_IV_R.$bl_rmrks, ExAct_Upd01_DtlR.$bl_rmrks);

			addColumnPathMap(MST_IV_R.$trd_schd_dt, MST_IV_R.$trd_schd_dt);
			addColumnPathMap(MST_IV_R.$iv_mng_no, MST_IV_R.$iv_mng_no);
			addColumnPathMap(MST_IV_R.$iv_rev, MST_IV_R.$iv_rev);
		}
	}

	protected Map_ShipSchd_Upd04_DtlR_ExAct_Upd01_SrcR<ShipSchd_Upd04_DtlR,ExAct_Upd01_SrcR> createMap_ShipSchd_Upd04_DtlR_ExAct_Upd01_SrcR() {
		return new Map_ShipSchd_Upd04_DtlR_ExAct_Upd01_SrcR<ShipSchd_Upd04_DtlR, ExAct_Upd01_SrcR>();
	}

	public class Map_ShipSchd_Upd04_DtlR_ExAct_Upd01_SrcR<D extends ShipSchd_Upd04_DtlR, S extends ExAct_Upd01_SrcR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipSchd_Upd04_DtlR.$ship_pr_no, ExAct_Upd01_SrcR.$ship_pr_no);
			addColumnPathMap(ShipSchd_Upd04_DtlR.$ship_schd_no, ExAct_Upd01_SrcR.$ship_schd_no);

		}
	}

	protected Map_ShipSchd_Upd04_ActDtlR_ExAct_Upd01_SrcR<ShipSchd_Upd04_ActDtlR,ExAct_Upd01_SrcR> createMap_ShipSchd_Upd04_ActDtlR_ExAct_Upd01_SrcR() {
		return new Map_ShipSchd_Upd04_ActDtlR_ExAct_Upd01_SrcR<ShipSchd_Upd04_ActDtlR, ExAct_Upd01_SrcR>();
	}

	public class Map_ShipSchd_Upd04_ActDtlR_ExAct_Upd01_SrcR<D extends ShipSchd_Upd04_ActDtlR, S extends ExAct_Upd01_SrcR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ShipSchd_Upd04_ActDtlR.$iv_ship_act_d_no, ExAct_Upd01_SrcR.$iv_ship_act_d_no);
			addColumnPathMap(ShipSchd_Upd04_ActDtlR.$ship_act_d_no, ExAct_Upd01_SrcR.$ship_act_d_no);

		}
	}

	protected Map_SloSts_DtlR_ExAct_Upd01_SrcR<SloSts_DtlR,ExAct_Upd01_SrcR> createMap_SloSts_DtlR_ExAct_Upd01_SrcR(String data_crud_typ) {
		return new Map_SloSts_DtlR_ExAct_Upd01_SrcR<SloSts_DtlR, ExAct_Upd01_SrcR>(data_crud_typ);
	}

	public class Map_SloSts_DtlR_ExAct_Upd01_SrcR<D extends SloSts_DtlR, S extends ExAct_Upd01_SrcR> extends MCRowMapper<D,S>{
		private String data_crud_typ = null;
		public Map_SloSts_DtlR_ExAct_Upd01_SrcR(String data_crud_typ) {
			super();
			this.data_crud_typ = data_crud_typ;
		}
		
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(SloSts_DtlR.$slo_d_no, ExAct_Upd01_SrcR.$slo_d_no);
			addColumnPathMap(SloSts_DtlR.$tax_cd, ExAct_Upd01_SrcR.$tax_cd);
			addColumnPathMap(SloSts_DtlR.$iv_no, ExAct_Upd01_SrcR.$iv_no);
			addColumnPathMap(SloSts_DtlR.$iv_d_no, ExAct_Upd01_SrcR.$iv_d_no);

			addColumnPathMap(SloSts_DtlR.$cur_cd, ExAct_Upd01_SrcR.$trd_cur_cd);
			addColumnPathMap(SloSts_DtlR.$biz_tm, ExAct_Upd01_SrcR.$cmpl_dt);
			addColumnPathMap(SloSts_DtlR.$unit_cd, ExAct_Upd01_SrcR.$iv_d_trd_unit_cd);
			addColumnPathMap(SloSts_DtlR.$upri, ExAct_Upd01_SrcR.$trd_cur_upri);
		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			if(MAC_DATA_CRUD_TYP.isDEL(data_crud_typ)) {
				dest.ac_dt(src.can_ac_dt());
				dest.qty(src.iv_d_trd_unit_qty().negate());
				dest.amt(isNull(src.trd_cur_amt()) ? null : src.trd_cur_amt().negate());
				dest.tax_amt(isNull(src.trd_cur_tax_amt()) ? null : src.trd_cur_tax_amt().negate());
			}
			else {
				dest.ac_dt(src.ac_dt());
				dest.qty(src.iv_d_trd_unit_qty());
				dest.amt(src.trd_cur_amt());
				dest.tax_amt(src.trd_cur_tax_amt());
			}
		}
	}

	protected Map_ArrPr_DtlR_ExAct_Upd01_SrcR<ArrPr_DtlR,ExAct_Upd01_SrcR> createMap_ArrPr_DtlR_ExAct_Upd01_SrcR() {
		return new Map_ArrPr_DtlR_ExAct_Upd01_SrcR<ArrPr_DtlR, ExAct_Upd01_SrcR>();
	}

	public class Map_ArrPr_DtlR_ExAct_Upd01_SrcR<D extends ArrPr_DtlR, S extends ExAct_Upd01_SrcR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrPr_DtlR.$trd_cd, ExAct_Upd01_SrcR.$trd_cd);
			addColumnPathMap(ArrPr_DtlR.$trd_ptn_typ, ExAct_Upd01_SrcR.$trd_ptn_typ);
			addColumnPathMap(ArrPr_DtlR.$dlv_slip_d_no, ExAct_Upd01_SrcR.$dlv_slip_d_no);
			addColumnPathMap(ArrPr_DtlR.$iv_d_no, ExAct_Upd01_SrcR.$iv_d_no);
			addColumnPathMap(ArrPr_DtlR.$trd_unit_qty, ExAct_Upd01_SrcR.$trd_unit_qty);
			addColumnPathMap(ArrPr_DtlR.$trd_unit_cd, ExAct_Upd01_SrcR.$trd_unit_cd);
			addColumnPathMap(ArrPr_DtlR.$arr_pr_no, ExAct_Upd01_SrcR.$arr_pr_no);
			addColumnPathMap(ArrPr_DtlR.$rsn_cd, ExAct_Upd01_SrcR.$rsn_cd);
			addColumnPathMap(ArrPr_DtlR.$bd_dpt_cd, ExAct_Upd01_SrcR.$bd_dpt_cd);
			addColumnPathMap(ArrPr_DtlR.$bd_wg_cd, ExAct_Upd01_SrcR.$bd_wg_cd);
		}
	}

	protected Map_ArrSchd_DtlR_ExAct_Upd01_SrcR<ArrSchd_DtlR,ExAct_Upd01_SrcR> createMap_ArrSchd_DtlR_ExAct_Upd01_SrcR() {
		return new Map_ArrSchd_DtlR_ExAct_Upd01_SrcR<ArrSchd_DtlR, ExAct_Upd01_SrcR>();
	}

	public class Map_ArrSchd_DtlR_ExAct_Upd01_SrcR<D extends ArrSchd_DtlR, S extends ExAct_Upd01_SrcR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrSchd_DtlR.$iv_no, ExAct_Upd01_SrcR.$iv_no);
			addColumnPathMap(ArrSchd_DtlR.$itm_cd, ExAct_Upd01_SrcR.$itm_cd);
			addColumnPathMap(ArrSchd_DtlR.$itm_sub1, ExAct_Upd01_SrcR.$itm_sub1);
			addColumnPathMap(ArrSchd_DtlR.$itm_sub2, ExAct_Upd01_SrcR.$itm_sub2);
			addColumnPathMap(ArrSchd_DtlR.$itm_sub3, ExAct_Upd01_SrcR.$itm_sub3);
			addColumnPathMap(ArrSchd_DtlR.$itm_nm, ExAct_Upd01_SrcR.$itm_nm);
			addColumnPathMap(ArrSchd_DtlR.$sundry_itm_flg, ExAct_Upd01_SrcR.$sundry_itm_flg);
			addColumnPathMap(ArrSchd_DtlR.$sno1, ExAct_Upd01_SrcR.$sno1);
			addColumnPathMap(ArrSchd_DtlR.$sno2, ExAct_Upd01_SrcR.$sno2);
			addColumnPathMap(ArrSchd_DtlR.$sno3, ExAct_Upd01_SrcR.$sno3);
			addColumnPathMap(ArrSchd_DtlR.$sno4, ExAct_Upd01_SrcR.$sno4);
			addColumnPathMap(ArrSchd_DtlR.$lot_no, ExAct_Upd01_SrcR.$lot_no);
			addColumnPathMap(ArrSchd_DtlR.$sublot_no, ExAct_Upd01_SrcR.$sublot_no);
			addColumnPathMap(ArrSchd_DtlR.$gd_cd, ExAct_Upd01_SrcR.$gd_cd);
			addColumnPathMap(ArrSchd_DtlR.$quality_typ, ExAct_Upd01_SrcR.$quality_typ);
			addColumnPathMap(ArrSchd_DtlR.$stk_insp_typ, ExAct_Upd01_SrcR.$stk_insp_typ);
			addColumnPathMap(ArrSchd_DtlR.$trd_unit_qty, ExAct_Upd01_SrcR.$trd_unit_qty);
			addColumnPathMap(ArrSchd_DtlR.$trd_unit_cd, ExAct_Upd01_SrcR.$trd_unit_cd);
			addColumnPathMap(ArrSchd_DtlR.$base_unit_qty, ExAct_Upd01_SrcR.$base_unit_qty);
			addColumnPathMap(ArrSchd_DtlR.$base_unit_cd, ExAct_Upd01_SrcR.$base_unit_cd);
	
			addColumnPathMap(ArrSchd_DtlR.$ver_no, ExAct_Upd01_SrcR.$ver_no);
			addColumnPathMap(ArrSchd_DtlR.$str_ln_cd, ExAct_Upd01_SrcR.$arr_str_ln_cd);
			addColumnPathMap(ArrSchd_DtlR.$wg_cd, ExAct_Upd01_SrcR.$gr_wg_cd);
			addColumnPathMap(ArrSchd_DtlR.$dlv_slip_no, ExAct_Upd01_SrcR.$dlv_slip_no);
			addColumnPathMap(ArrSchd_DtlR.$arr_schd_tm, ExAct_Upd01_SrcR.$trd_schd_dt);
			addColumnPathMap(ArrSchd_DtlR.$arr_loc_cd, ExAct_Upd01_SrcR.$dlv_id_cd);
			addColumnPathMap(ArrSchd_DtlR.$arr_pr_no, ExAct_Upd01_SrcR.$arr_pr_no);
			addColumnPathMap(ArrSchd_DtlR.$arr_schd_no, ExAct_Upd01_SrcR.$arr_schd_no);

			addColumnPathMap(ArrSchd_DtlR.$stk_id_typ, ExAct_Upd01_SrcR.$stk_id_typ);
			addColumnPathMap(ArrSchd_DtlR.$prov_typ, ExAct_Upd01_SrcR.$prov_typ);
			addColumnPathMap(ArrSchd_DtlR.$prov_basis_typ, ExAct_Upd01_SrcR.$prov_basis_typ);
			addColumnPathMap(ArrSchd_DtlR.$xrate, ExAct_Upd01_SrcR.$xrate);
			addColumnPathMap(ArrSchd_DtlR.$ptax_xrate, ExAct_Upd01_SrcR.$ptax_xrate);
			addColumnPathMap(ArrSchd_DtlR.$trd_cur_cd, ExAct_Upd01_SrcR.$trd_cur_cd);
			addColumnPathMap(ArrSchd_DtlR.$tax_cd, ExAct_Upd01_SrcR.$tax_cd);
			addColumnPathMap(ArrSchd_DtlR.$trd_cur_upri, ExAct_Upd01_SrcR.$trd_cur_upri);
			addColumnPathMap(ArrSchd_DtlR.$trd_cd, ExAct_Upd01_SrcR.$trd_cd);
			addColumnPathMap(ArrSchd_DtlR.$trd_ptn_typ, ExAct_Upd01_SrcR.$trd_ptn_typ);
			addColumnPathMap(ArrSchd_DtlR.$arr_cnt_rmrks, ExAct_Upd01_SrcR.$arr_cnt_rmrks);

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.io_schd_pr_no(getStrSeq(MSC_NUM_SYS_TYP.IOSCHDPR));
			
			if(MSC_STK_ID_TYP.isRNT_RCV(src.stk_id_typ())) { //ＶＭＩ品
				if(MAC_TRD_PTN_TYP.isPROV(src.trd_ptn_typ()) || src.gi_vmi_flg()) { //支給か出庫時ＶＭＩ計上ＦＬＧ='1'
					dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					dest.stk_bp_cd(MAC_STR.NULL_VAL.value());
				}
				else {
					dest.stk_id_typ(src.stk_id_typ());
					dest.stk_bp_cd(src.stk_bp_cd());
				}
			}
			else {
				if(MAC_PROV_TYP.isONR_PROV(src.prov_typ()) || MAC_PROV_TYP.isFFR_PROV(src.prov_typ())) {
					dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					dest.stk_bp_cd(MAC_STR.NULL_VAL.value());
					dest.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				}
				else {
					dest.stk_id_typ(src.stk_id_typ());
					dest.stk_bp_cd(src.stk_bp_cd());
					dest.stk_arrv_bp_cd(src.stk_arrv_bp_cd());
				}
			}
		}
	}

	protected Map_ArrAct_DtlR_MST_ARR_SCHD_R<ArrAct_DtlR,MST_ARR_SCHD_R> createMap_ArrAct_DtlR_MST_ARR_SCHD_R() {
		return new Map_ArrAct_DtlR_MST_ARR_SCHD_R<ArrAct_DtlR, MST_ARR_SCHD_R>();
	}

	public class Map_ArrAct_DtlR_MST_ARR_SCHD_R<D extends ArrAct_DtlR, S extends MST_ARR_SCHD_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrAct_DtlR.$arr_schd_no, MST_ARR_SCHD_R.$arr_schd_no);
			addColumnPathMap(ArrAct_DtlR.$itm_cd, MST_ARR_SCHD_R.$itm_cd);
			addColumnPathMap(ArrAct_DtlR.$itm_sub1, MST_ARR_SCHD_R.$itm_sub1);
			addColumnPathMap(ArrAct_DtlR.$itm_sub2, MST_ARR_SCHD_R.$itm_sub2);
			addColumnPathMap(ArrAct_DtlR.$itm_sub3, MST_ARR_SCHD_R.$itm_sub3);
			addColumnPathMap(ArrAct_DtlR.$itm_nm, MST_ARR_SCHD_R.$itm_nm);
			addColumnPathMap(ArrAct_DtlR.$rcpt_iv_itm_nm, MST_ARR_SCHD_R.$rcpt_iv_itm_nm);
			addColumnPathMap(ArrAct_DtlR.$sundry_itm_flg, MST_ARR_SCHD_R.$sundry_itm_flg);
			addColumnPathMap(ArrAct_DtlR.$purc_id_typ, MST_ARR_SCHD_R.$purc_id_typ);
			addColumnPathMap(ArrAct_DtlR.$sno1, MST_ARR_SCHD_R.$sno1);
			addColumnPathMap(ArrAct_DtlR.$sno2, MST_ARR_SCHD_R.$sno2);
			addColumnPathMap(ArrAct_DtlR.$sno3, MST_ARR_SCHD_R.$sno3);
			addColumnPathMap(ArrAct_DtlR.$sno4, MST_ARR_SCHD_R.$sno4);
			addColumnPathMap(ArrAct_DtlR.$lot_no, MST_ARR_SCHD_R.$lot_no);
			addColumnPathMap(ArrAct_DtlR.$sublot_no, MST_ARR_SCHD_R.$sublot_no);
			addColumnPathMap(ArrAct_DtlR.$ver_no, MST_ARR_SCHD_R.$ver_no);
			addColumnPathMap(ArrAct_DtlR.$stk_arrv_bp_cd, MST_ARR_SCHD_R.$stk_arrv_bp_cd);
			addColumnPathMap(ArrAct_DtlR.$gd_cd, MST_ARR_SCHD_R.$gd_cd);
			addColumnPathMap(ArrAct_DtlR.$quality_typ, MST_ARR_SCHD_R.$quality_typ);
			addColumnPathMap(ArrAct_DtlR.$stk_insp_typ, MST_ARR_SCHD_R.$stk_insp_typ);
			addColumnPathMap(ArrAct_DtlR.$stk_id_typ, MST_ARR_SCHD_R.$stk_id_typ);
			addColumnPathMap(ArrAct_DtlR.$stk_bp_cd, MST_ARR_SCHD_R.$stk_bp_cd);
			addColumnPathMap(ArrAct_DtlR.$sppl_itm_cd, MST_ARR_SCHD_R.$sppl_itm_cd);
			addColumnPathMap(ArrAct_DtlR.$sppl_itm_nm, MST_ARR_SCHD_R.$sppl_itm_nm);
			addColumnPathMap(ArrAct_DtlR.$maker_cd, MST_ARR_SCHD_R.$maker_cd);
			addColumnPathMap(ArrAct_DtlR.$bp_lot_no, MST_ARR_SCHD_R.$bp_lot_no);
			addColumnPathMap(ArrAct_DtlR.$arr_loc_cd, MST_ARR_SCHD_R.$arr_loc_cd);
			addColumnPathMap(ArrAct_DtlR.$str_ln_cd, MST_ARR_SCHD_R.$str_ln_cd);
			addColumnPathMap(ArrAct_DtlR.$trd_unit_qty, MST_ARR_SCHD_R.$trd_unit_qty);
			addColumnPathMap(ArrAct_DtlR.$trd_unit_cd, MST_ARR_SCHD_R.$trd_unit_cd);
			addColumnPathMap(ArrAct_DtlR.$base_unit_qty, MST_ARR_SCHD_R.$base_unit_qty);
			addColumnPathMap(ArrAct_DtlR.$base_unit_cd, MST_ARR_SCHD_R.$base_unit_cd);
			addColumnPathMap(ArrAct_DtlR.$sync_flg, MST_ARR_SCHD_R.$sync_flg);
			addColumnPathMap(ArrAct_DtlR.$trd_rmrks, MST_ARR_SCHD_R.$trd_rmrks);
			addColumnPathMap(ArrAct_DtlR.$trd_d_rmrks, MST_ARR_SCHD_R.$trd_d_rmrks);
			addColumnPathMap(ArrAct_DtlR.$arr_pr_no, MST_ARR_SCHD_R.$arr_pr_no);
			addColumnPathMap(ArrAct_DtlR.$iv_no, MST_ARR_SCHD_R.$iv_no);
			addColumnPathMap(ArrAct_DtlR.$arr_ptn_typ, MST_ARR_SCHD_R.$arr_ptn_typ);
			addColumnPathMap(ArrAct_DtlR.$abort_flg, MST_ARR_SCHD_R.$abort_flg);
			addColumnPathMap(ArrAct_DtlR.$mfg_inst_no, MST_ARR_SCHD_R.$mfg_inst_no);
			addColumnPathMap(ArrAct_DtlR.$pre_outsrc_act_flg, MST_ARR_SCHD_R.$pre_outsrc_act_flg);

			addColumnPathMap(ArrAct_DtlR.$arr_tm, MST_ARR_SCHD_R.$arr_schd_tm);
			addColumnPathMap(ArrAct_DtlR.$trd_cd, "trd_cd");
			addColumnPathMap(ArrAct_DtlR.$trd_ptn_typ, "trd_ptn_typ");
			addColumnPathMap(ArrAct_DtlR.$ac_dt, "ac_dt");
			addColumnPathMap(ArrAct_DtlR.$can_ac_dt, "can_ac_dt");
			addColumnPathMap(ArrAct_DtlR.$stk_mng_typ, "stk_mng_typ");
			addColumnPathMap(ArrAct_DtlR.$sno1_mng_typ, "sno1_mng_typ");
			addColumnPathMap(ArrAct_DtlR.$sno2_mng_typ, "sno2_mng_typ");
			addColumnPathMap(ArrAct_DtlR.$sno3_mng_typ, "sno3_mng_typ");
			addColumnPathMap(ArrAct_DtlR.$sno4_mng_typ, "sno4_mng_typ");

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.rsn_cd(src.getStringNE("rsn_cd"));
			dest.bd_dpt_cd(src.getStringNE("bd_dpt_cd"));
			dest.bd_wg_cd(src.getStringNE("bd_wg_cd"));
		}
	}

	protected Map_ArrAct_DtlR_ExAct_Upd01_SrcR<ArrAct_DtlR,ExAct_Upd01_SrcR> createMap_ArrAct_DtlR_ExAct_Upd01_SrcR() {
		return new Map_ArrAct_DtlR_ExAct_Upd01_SrcR<ArrAct_DtlR, ExAct_Upd01_SrcR>();
	}

	public class Map_ArrAct_DtlR_ExAct_Upd01_SrcR<D extends ArrAct_DtlR, S extends ExAct_Upd01_SrcR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ArrAct_DtlR.$arr_act_no, ExAct_Upd01_SrcR.$arr_act_no);
			addColumnPathMap(ArrAct_DtlR.$can_ac_dt, ExAct_Upd01_SrcR.$can_ac_dt);

		}
	}
	/**
	 * ExAct_Upd02オペレーション.<p>
	 *
	 * 輸出実績対象外のインボイスを完了更新する。<br>
	 */
	public class ExAct_Upd02 extends MSBEL_ExActService_MC_A.ExAct_Upd02 {
		/**
		 * インボイス出荷実績マップリスト
		 */
		protected MCList<MST_IV_SHIP_ACT_MAP_R> _ivShipActMapL = null;
		/**
		 * インボイス出荷実績マップリストのインデックス
		 */
		protected MCIndexKey _ivShipActMapIdxKey = null;
		/**
		 * インボイス明細リスト
		 */
		protected MCList<MST_IV_D_R> _ivDL = null;
		/**
		 * インボイス明細リストのインデックス
		 */
		protected MCIndexKey _ivDIdxKey = null;
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			getIvDL();
			getIvShipActMapL(up0());
			updIv();
			callRevData();
			setDown();
		}
		
		/**
		 * インボイスヘッダの完了済みＦＬＧを更新する
		 */
		protected void updIv() {
			MST_IV_R t = MST_IV_R.create("T");
			MCList<MST_IV_R> ivL = MCList.create(MST_IV_R.class);
			
			for (ExAct_Upd02_DtlR dtlR : up0()) {
				if (dtlR.sls_cststk_flg() && dtlR.cmpl_flg() && !isIvShipCmpl(dtlR.iv_no())) {
					dtlR.cmpl_flg(false);
				}
			}
			setAll(ivL, up0(), createMap_MST_IV_R_ExAct_Upd02_DtlR());
			execDbUpdate("MSBEL5710_MST_IV_U03", t, ivL, t.iv_no.eq(bindEx("iv_no")), t.cmpl_flg);
		}
		/**
		 * 「改訂履歴データ更新リスト」テーブルにデータを登録（サービス呼び出し）。
		 */
		protected void callRevData() {
			MCList<MST_IV_R> ivL = getIvL();
			callRevDataIns01(ivL);
		}
		
		/**
		 * インボイスヘッダを取得する。
		 * @return インボイスヘッダリスト
		 */
		protected MCList<MST_IV_R> getIvL() {
			
			MCList<MST_IV_R> ivL = MCList.create(MST_IV_R.class);
			MST_IV_R iv = MST_IV_R.create("IV");
			MCQueryApiBuilder ivL_bldr = MCQueryApiBuilder.create(iv);
			ivL_bldr.setWhere(iv.iv_no.eq(bind("iv_no")));
			dbSelect("MSBEL5710_MST_IV_S03", ivL, ivL_bldr, up0());

			return ivL;
		}
		
		/**
		 * インボイス明細を取得する。
		 */
		protected void getIvDL() {
			
			_ivDL = MCList.create(MST_IV_D_R.class);
			_ivDL.addStringColumn(MST_IV_R.$iv_no);
			
			MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
			MST_IV_R iv = MST_IV_R.create("IV");
			MCQueryApiBuilder ivL_bldr = MCQueryApiBuilder.create(ivD);
			ivL_bldr.addSelect(iv.iv_no);
			
			ivL_bldr.setWhere(iv.iv_no.eq(bind("iv_no")));
			ivL_bldr.addInnerJoin(iv, ivD.iv_mng_no.eq(iv.iv_mng_no));
			dbSelect("MSBEL5710_MST_IV_D_S01", _ivDL, ivL_bldr, up0());
			
			_ivDIdxKey = _ivDL.createIndex(MST_IV_R.$iv_no);
		}
		
		/**
		 * インボイス出荷実績マップを取得する。
		 * @param ivL インボイスリスト
		 */
		protected void getIvShipActMapL(MCList<ExAct_Upd02_DtlR> ivL) {
			
			_ivShipActMapL = MCList.create(MST_IV_SHIP_ACT_MAP_R.class);
			_ivShipActMapL.addStringColumn(MST_IV_R.$iv_no);
			
			MST_IV_SHIP_ACT_MAP_R ivShipActMap = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
			MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
			MST_IV_R iv = MST_IV_R.create("IV");
			MCQueryApiBuilder ivShipActMap_bldr = MCQueryApiBuilder.create(ivShipActMap);
			ivShipActMap_bldr.addSelect(iv.iv_no);
			ivShipActMap_bldr.addInnerJoin(ivD, ivShipActMap.iv_d_no.eq(ivD.iv_d_no));
			ivShipActMap_bldr.addInnerJoin(iv, ivD.iv_mng_no.eq(iv.iv_mng_no));
			ivShipActMap_bldr.setWhere(iv.iv_no.eq(bind(ExAct_Upd02_DtlR.$iv_no)));
			
			dbSelect("MSBEL5710_MST_IV_SHIP_ACT_MAP_S01", _ivShipActMapL, ivShipActMap_bldr, ivL);
			
			_ivShipActMapIdxKey = _ivShipActMapL.createIndex(MST_IV_SHIP_ACT_MAP_R.$iv_d_no);
		}
		
		/**
		 * インボイス単位で全数出荷済か判定する。
		 * @param  ivNo インボイスNO
		 * @return インボイス単位で全数出荷済の場合はtrue
		 */
		protected boolean isIvShipCmpl(String ivNo) {
			
			boolean ivAllShip = true;
			
			MCList<MST_IV_D_R> ivDL = _ivDL.subList(_ivDIdxKey, ivNo);
			for (MST_IV_D_R ivDR : ivDL) {
				
				MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL = _ivShipActMapL.subList(_ivShipActMapIdxKey, ivDR.iv_d_no());
				
				MCNumber qtySum = MCNumber.ZERO;
				if (!ivShipActMapL.isEmpty()) {
					qtySum = ivShipActMapL.sum(MST_IV_SHIP_ACT_MAP_R.$base_unit_qty);
				}
				
				if(!qtySum.eq(ivDR.base_unit_qty())) {
					ivAllShip = false;
					break;
				}
			}
			
			return ivAllShip;
		}
		
		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		protected Map_MST_IV_R_ExAct_Upd02_DtlR<MST_IV_R,ExAct_Upd02_DtlR> createMap_MST_IV_R_ExAct_Upd02_DtlR() {
			return new Map_MST_IV_R_ExAct_Upd02_DtlR<MST_IV_R, ExAct_Upd02_DtlR>();
		}

		public class Map_MST_IV_R_ExAct_Upd02_DtlR<D extends MST_IV_R, S extends ExAct_Upd02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_IV_R.$iv_no, ExAct_Upd02_DtlR.$iv_no);
				addColumnPathMap(MST_IV_R.$cmpl_flg, ExAct_Upd02_DtlR.$cmpl_flg);

			}
		}
	}
	
	/**
	 * ExAct_Chk02オペレーション.<p>
	 *
	 * 輸出実績対象外のインボイスを完了更新する前のチェック処理を行う。<br>
	 */
	public class ExAct_Chk02 extends MSBEL_ExActService_MC_A.ExAct_Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			chkPl();
			setDown();
		}

		/**
		 * パッキングリスト登録済みかをチェックする
		 */
		protected void chkPl() {

			MCMessageList msgL = new MCMessageList();

			//完了済みＦＬＧが true のデータのみ、チェックする
			MCList<ExAct_Upd02_DtlR> chkL = up0().subList(ExAct_Upd02_DtlR.$cmpl_flg, true);

			if(chkL.isEmpty()) {
				return;
			}
			
			MST_IV_R t = MST_IV_R.create("T");
			MCList<MST_IV_R> ivL = MCList.create(MST_IV_R.class);
			MCQueryApiBuilder ivL_bldr = MCQueryApiBuilder.create(t);
			ivL_bldr.setSelect(t.iv_no);
			ivL_bldr.addSelect(t.pl_skip_flg);
			ivL_bldr.addSelect(t.pl_reg_flg);
			ivL_bldr.setWhere(t.iv_no.eq(bind("iv_no")));
			ivL_bldr.setOrderByAsc(ivL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdate("MSBEL5710_MST_IV_S02", ivL, ivL_bldr, chkL.groupBy(MST_IV_R.$iv_no));
			
			MCIndexKey ik = ivL.createIndex(MST_IV_R.$iv_no);
			for (ExAct_Upd02_DtlR chkR : chkL) {
				MST_IV_R ivR = ivL.getFirst(ik, chkR.iv_no());
				if (ivR == null) {
					msgL.addAll(getRecordNotFoundMsg("MS", "MST_IV"
							, new String[]{MST_IV_R.$iv_no}
							, new Comparable[]{chkR.iv_no()}, chkR));
				}
				else {
					//パッキングリスト省略ＦＬＧが false、かつ、パッキングリスト登録ＦＬＧが false の場合、エラー
					if(!ivR.pl_skip_flg() && !ivR.pl_reg_flg()) {
						msgL.add(new MCMessage(chkR, null, MSBEL0294, ivR.iv_no()));
						chkR.err_flg(true);
					}
				}
			}
			if(!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
			}
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	//FMCB CUSTOM END
}