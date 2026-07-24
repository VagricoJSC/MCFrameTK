package mcframe.serverMSBD.MSBDL5030;

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
import mcframe.serverMSBD.MSBDL5030.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.commonFXUC.FXUCC0090.FXUCC_RowMapperWith;
import mcframe.serverMAUC.MAUCL5020.*;
import mcframe.serverMSBB.MSBBL6220.*;
import mcframe.serverMSBG.MSBGL5080.*;
import java.util.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PurcSchdRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PurcSchdRegService_MC extends MSBDL_PurcSchdRegService_MC_A{
	//FMCB CUSTOM START

	/**
	 * PurcSchd_Upd01オペレーション.<p>
	 * <br>
	 * 更新・削除処理時に仕入予定(MST_PURC_SCHD)のロックはしない。<br>
	 * 当処理を呼ぶ側の処理で入荷進捗をロックする。<br>
	 *
	 */
	public class PurcSchd_Upd01 extends MSBDL_PurcSchdRegService_MC_A.PurcSchd_Upd01 {
		
		protected MCList<MST_PURC_SCHD_R> _chkPsDbcL = MCList.create(MST_PURC_SCHD_R.class);
		protected MCIndexKey _purcSchdIdx;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			srchPurcSchd();
			setPurcSchdNo();
			setArrPrNo();
			doSeqPurcSchdNo();
			purSchdReg();
			callSlsSchdSrv();
			setDown();

		}

		protected void srchPurcSchd() {

			MCList<MST_ARR_SCHD_R> wkAsL = MCList.create(MST_ARR_SCHD_R.class);
			MCQueryApiBuilder wkAsL_bldr = MCQueryApiBuilder.create(MST_ARR_SCHD_R.create("T"));
			dbWkDelete("MSBDL5030_MSW_ARR_SCHD_D01", wkAsL_bldr.getBaseDbc());
			for (PurcSchd_DtlR dtlR : up0()) {
				MST_ARR_SCHD_R r = MST_ARR_SCHD_R.create();
				r.arr_schd_no(dtlR.arr_schd_no());
				wkAsL.add(r);
			}
			dbWkInsert("MSBDL5030_MSW_ARR_SCHD_I01", wkAsL, wkAsL_bldr.getBaseDbc());

			MSW_ARR_SCHD_KEY_R key1 = MSW_ARR_SCHD_KEY_R.create("KEY1");
			MST_ARR_SCHD_R schd = MST_ARR_SCHD_R.create("SCHD");
			MST_PURC_SCHD_R chkPsDbcL_t = MST_PURC_SCHD_R.create("T");
			MCQueryApiBuilder chkPsDbcL_bldr = MCQueryApiBuilder.create(chkPsDbcL_t);
			chkPsDbcL_bldr.addSelect(schd.arr_qty);
			chkPsDbcL_bldr.addInnerJoin(key1, chkPsDbcL_t.arr_schd_no.eq(key1.arr_schd_no));
			chkPsDbcL_bldr.addInnerJoin(schd, chkPsDbcL_t.arr_schd_no.eq(schd.arr_schd_no));

			dbSelect("MSBDL5030_MST_PURC_SCHD_S01", _chkPsDbcL, chkPsDbcL_bldr);
			_purcSchdIdx = _chkPsDbcL.createIndex(MST_PURC_SCHD_R.$arr_schd_no);

			dbWkDelete("MSBDL5030_MSW_ARR_SCHD_D02", wkAsL_bldr.getBaseDbc());

			// 仕入諸掛分を追加
			MCList<MST_PURC_SCHD_R> dbc = _chkPsDbcL.createInstance();
			MCIndexKey idx = _chkPsDbcL.createIndex(MST_PURC_SCHD_R.$purc_schd_no);
			for (PurcSchd_DtlR dtlR : up0()) {
				if (!isNull(dtlR.purc_schd_no())) {
					if (isNull(_chkPsDbcL.getFirst(idx, dtlR.purc_schd_no()))) {
						dbc.add().purc_schd_no(dtlR.purc_schd_no());
					}
				}
			}
			if (!dbc.isEmpty()) {
				MSW_PURC_SCHD_KEY_R key2 = MSW_PURC_SCHD_KEY_R.create("KEY2");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(chkPsDbcL_t);
				dbWkDelete("MSBDL5030_MSW_PURC_SCHD_D01", dbc_bldr.getBaseDbc());
				dbWkInsert("MSBDL5030_MSW_PURC_SCHD_I01", dbc, dbc_bldr.getBaseDbc());
				dbc.addNumberColumn("arr_qty");
				dbc_bldr.addSelect(value(0).as("arr_qty"));
				dbc_bldr.addInnerJoin(key2, chkPsDbcL_t.purc_schd_no.eq(key2.purc_schd_no));
				dbSelect("MSBDL5030_MST_PURC_SCHD_S02", dbc, dbc_bldr);
				dbWkDelete("MSBDL5030_MSW_PURC_SCHD_D02", dbc_bldr.getBaseDbc());

				_chkPsDbcL.addAll(dbc);
				_purcSchdIdx = _chkPsDbcL.createIndex(MST_PURC_SCHD_R.$arr_schd_no);
			}
		}
		
		/**
		 * 仕入予定ＮＯを補完する<br>
		 * ※上り電文のデータ更新区分が更新もしくは削除、かつ仕入予定ＮＯが空で入荷予定ＮＯが指定されている場合
		 */
		protected void setPurcSchdNo() {

			MCList<PurcSchd_DtlR> bindL = MCList.create(PurcSchd_DtlR.class);

			for(PurcSchd_DtlR up0R: up0()){

				if((MAC_DATA_CRUD_TYP.isUPD(up0R.data_crud_typ())
					||MAC_DATA_CRUD_TYP.isDEL(up0R.data_crud_typ()))
					&& !isNull(up0R.arr_schd_no())
					&& isNull(up0R.purc_schd_no())
				){
					bindL.add(up0R);
				}
			}

			for (PurcSchd_DtlR bindR : bindL) {

				MST_PURC_SCHD_R chkPsDbcR = _chkPsDbcL.getFirst(_purcSchdIdx, bindR.arr_schd_no());
				bindR.purc_schd_no(chkPsDbcR.purc_schd_no());
			}


		}

		/**
		 * 入荷進捗ＮＯを補完する。<br>
		 * ※後続処理の検索条件として使用するため。
		 */
		protected void setArrPrNo() {

			MCList<PurcSchd_DtlR> bindL = MCList.create(PurcSchd_DtlR.class);

			for(PurcSchd_DtlR up0R: up0()){

				if((MAC_DATA_CRUD_TYP.isUPD(up0R.data_crud_typ())
					||MAC_DATA_CRUD_TYP.isDEL(up0R.data_crud_typ()))
					&& isNull(up0R.arr_pr_no())
				){
					bindL.add(up0R);
				}
			}

			if(!bindL.isEmpty()){

				for(PurcSchd_DtlR bindR : bindL){

					MST_PURC_SCHD_R chkPsDbcR = _chkPsDbcL.getFirst(_purcSchdIdx, bindR.arr_schd_no());
					if (isNull(chkPsDbcR)) {
						return;
					}
					bindR.arr_pr_no(chkPsDbcR.arr_pr_no());
				}
			}
		}

		
		
		/**
		 * 仕入予定ＮＯを発番する。
		 */
		protected void doSeqPurcSchdNo() {

			MCList<PurcSchd_DtlR> insL
			= up0().subList(
					mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR.$data_crud_typ,
					MAC_DATA_CRUD_TYP.CRT.value());
			if(!insL.isEmpty()){
				doSeqCache(MSC_NUM_SYS_TYP.PURCSCHD, insL.size());
			}
		}

		/**
		 * 仕入予定を登録する
		 */
		protected void purSchdReg() {

			MCList<MST_PURC_SCHD_R> insPsDbcL = MCList.create(MST_PURC_SCHD_R.class);
			MCList<MST_PURC_SCHD_R> updPsDbcL = MCList.create(MST_PURC_SCHD_R.class);
			MCList<MST_PURC_SCHD_R> updPsAbortL = MCList.create(MST_PURC_SCHD_R.class);
			MCList<MST_PURC_SCHD_R> delPsDbcL = MCList.create(MST_PURC_SCHD_R.class);

			final String no_cred_upd_flg_col = "no_cred_upd_flg";
			MCIndexKey psIdx = _chkPsDbcL.createIndex(MST_PURC_SCHD_R.$purc_schd_no);

			for(mcframe.serverMSBD.MSBDL5030.PurcSchd_DtlR up0R : up0()){

				MST_PURC_SCHD_R addR = MST_PURC_SCHD_R.create();
				up0R.purc_schd().setBooleanNE(no_cred_upd_flg_col, up0R.no_cred_upd_flg());
				if(MAC_DATA_CRUD_TYP.isCRT(up0R.data_crud_typ())){

					up0R.purc_schd_no(getStrSeq(MSC_NUM_SYS_TYP.PURCSCHD));
					MST_PURC_SCHD_R.copyall(addR, up0R.purc_schd());

					//固定値
					addR.base_unit_abort_qty(0);
					addR.base_unit_purc_qty(0);
					addR.base_unit_temp_purc_qty(0);
					addR.base_unit_accpt_dfct_qty(0);
					
					if(up0R.non_purc_flg()){
						addR.cmpl_flg(true);
					}
					else{
						addR.cmpl_flg(false);
					}
					addR.abort_flg(false);
					addR.purc_split_flg(false);

					insPsDbcL.add(addR);
				}
				else if(MAC_DATA_CRUD_TYP.isUPD(up0R.data_crud_typ())){

					MST_PURC_SCHD_R.copyall(addR, up0R.purc_schd());

					if (!up0R.abort_flg()) {
						addR.base_unit_abort_qty(0);
					}
					
					// 完了ＦＬＧ
					MCNumber ttlQty = MCNumber.ZERO;
					MST_PURC_SCHD_R schdR = _chkPsDbcL.getFirst(psIdx, up0R.purc_schd_no());
							
					ttlQty = ttlQty.add(nvl(schdR.base_unit_purc_qty(), MCNumber.ZERO));
					ttlQty = ttlQty.add(nvl(schdR.base_unit_accpt_dfct_qty(), MCNumber.ZERO));
					ttlQty = ttlQty.add(up0R.abort_flg() ? addR.base_unit_schd_qty() : MCNumber.ZERO);
					// 過入荷を考慮し、「入荷実績数量と仕入予定数量の大きいほう」と「仕入実績数量」を比較して完了を判定
					MCNumber tgtNum = schdR.getNumberNE("arr_qty").lt(up0R.base_unit_schd_qty()) ? up0R.base_unit_schd_qty() : schdR.getNumberNE("arr_qty"); 
					if (tgtNum.lte(ttlQty)) {
						// 仕入数＋打切数＋検収不良数が予定数を上回った場合は完了とする
						addR.cmpl_flg(true);
					}
					else {
						addR.cmpl_flg(false);
					}
					if (up0R.abort_flg()) {
						addR.base_unit_abort_qty(schdR.base_unit_schd_qty());
						addR.cmpl_flg(true);
						addR.abort_flg(true);
						updPsAbortL.add(addR);
					}
					// 打切解除
					else if (schdR.abort_flg() && !up0R.abort_flg()) {
						addR.base_unit_abort_qty(0);
						addR.cmpl_flg(false);
						addR.abort_flg(false);
						updPsAbortL.add(addR);

						// 与信更新で使用するため数量を補完
						addR.trd_unit_schd_qty(schdR.trd_unit_schd_qty());
						addR.base_unit_schd_qty(schdR.base_unit_schd_qty());
						addR.base_unit_purc_qty(schdR.base_unit_purc_qty());
						addR.base_unit_temp_purc_qty(schdR.base_unit_temp_purc_qty());
						addR.base_unit_accpt_dfct_qty(schdR.base_unit_accpt_dfct_qty());
					}
					else {
						updPsDbcL.add(addR);
					}
					// 仕入対象外の場合は常に完了
					if(up0R.non_purc_flg()){
						addR.cmpl_flg(true);
					}

				}
				else if(MAC_DATA_CRUD_TYP.isDEL(up0R.data_crud_typ())){

					MST_PURC_SCHD_R.copyall(addR, up0R.purc_schd());
					delPsDbcL.add(addR);
					
					// 与信更新で使用するため数量を補完
					MST_PURC_SCHD_R schdR = _chkPsDbcL.getFirst(psIdx, up0R.purc_schd_no());
					addR.trd_unit_schd_qty(schdR.trd_unit_schd_qty());
					addR.base_unit_schd_qty(schdR.base_unit_schd_qty());
					addR.base_unit_abort_qty(schdR.base_unit_abort_qty());
					addR.base_unit_purc_qty(schdR.base_unit_purc_qty());
					addR.base_unit_temp_purc_qty(schdR.base_unit_temp_purc_qty());
					addR.base_unit_accpt_dfct_qty(schdR.base_unit_accpt_dfct_qty());
				}
			}

			MST_PURC_SCHD_R t = MST_PURC_SCHD_R.create("T");

			if(!insPsDbcL.isEmpty()){
				MCQueryApiBuilder insPsDbcL_bldr = MCQueryApiBuilder.create(t);
				dbInsert("MSBDL5030_MST_PURC_SCHD_I01", insPsDbcL, insPsDbcL_bldr);
			}

			if(!updPsDbcL.isEmpty()){
				MCQueryApiBuilder updPsDbcL_bldr = MCQueryApiBuilder.create(t);
				updPsDbcL_bldr.setSet(
						t.purc_schd_dt,
						t.trd_unit_schd_qty,
						t.trd_unit_cd,
						t.base_unit_schd_qty,
						t.base_unit_abort_qty,
						t.base_unit_cd,
						t.non_purc_flg,
						t.cmpl_flg,
						t.abort_flg,
						t.sub_char1,
						t.sub_char2,
						t.sub_char3);
				dbUpdateKey("MSBDL5030_MST_PURC_SCHD_U01", updPsDbcL, updPsDbcL_bldr);
			}
			
			if(!updPsAbortL.isEmpty()){
				MCQueryApiBuilder updPsAbortL_bldr = MCQueryApiBuilder.create(t);
				updPsAbortL_bldr.setSet(
						t.base_unit_abort_qty,
						t.cmpl_flg,
						t.abort_flg);
				dbUpdateKey("MSBDL5030_MST_PURC_SCHD_U02", updPsAbortL, updPsAbortL_bldr);
			}
			
			// 債務与信更新
			callCredUpd02(_chkPsDbcL,
					insPsDbcL.subList(r->!r.getBooleanNE(no_cred_upd_flg_col)),
					updPsDbcL.subList(r->!r.getBooleanNE(no_cred_upd_flg_col)),
					updPsAbortL.subList(r->!r.getBooleanNE(no_cred_upd_flg_col)),
					delPsDbcL.subList(r->!r.getBooleanNE(no_cred_upd_flg_col)));

			if(!delPsDbcL.isEmpty()){
				MCQueryApiBuilder delPsDbcL_bldr = MCQueryApiBuilder.create(t);
				dbDeleteKey("MSBDL5030_MST_PURC_SCHD_D01", delPsDbcL, delPsDbcL_bldr);
			}
		}

		/**
		 * 仕入直送の場合は、売上予定サービスを実行する。
		 */
		protected void callSlsSchdSrv() {
			//売上予定サービス
			mcframe.serverMSBB.MSBBL6220.MSBBL_SlsSchdService.Sls_Schd_Upd04 ssUpd04Srv
			= mcframe.serverMSBB.MSBBL6220.MSBBL_SlsSchdService.crtSls_Schd_Upd04();
			
			// 新規・更新時は発注明細の情報および入荷進捗の情報を取得する必要がある。
			MCList<PurcSchd_DtlR> insUpdL = up0().subList(PurcSchd_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			insUpdL.addAll(up0().subList(PurcSchd_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value()));
			// 取消時は発注明細の情報のみ必要（先に入荷進捗が消えているため、入荷進捗とは結合しない）
			MCList<PurcSchd_DtlR> delL = up0().subList(PurcSchd_DtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
			
			insArrPrWk(insUpdL);
			/* 新規・更新の場合
			 * 仕入直送の場合発注予定⇒発注時に発注予定のまとめ及び分割は不可であるため、発注予定：発注明細＝１：１である。
			 * そのため発注予定ＮＯや受注ＮＯは発注明細から取得すればよい。
			 */
			MST_ARR_PR_R t1 = MST_ARR_PR_R.create("T1");
			MST_ARR_SCHD_R t2 = MST_ARR_SCHD_R.create("T2");
			MST_PURC_SCHD_R t3 = MST_PURC_SCHD_R.create("T3");
			MST_RCPT_IV_D_R t4 = MST_RCPT_IV_D_R.create("T4");
			MST_PRMS_RCPT_D_R t5 = MST_PRMS_RCPT_D_R.create("T5");
			MST_DLV_INST_D_R t6 = MST_DLV_INST_D_R.create("T6");

			MCList<MST_PO_D_R> poDDbcL = MCList.create(MST_PO_D_R.class);
			MST_PO_D_R t = MST_PO_D_R.create("T");
			MSW_ARR_PR_KEY_R arrPrKey = MSW_ARR_PR_KEY_R.create("ARRPRKEY");
			MCQueryApiBuilder poDDbcL_bldr = MCQueryApiBuilder.create(t);
			poDDbcL.addBooleanColumn("dlv_pri_prnt_flg");
			poDDbcL_bldr.removeSelect(MST_PO_D_R.$dlv_sundry_flg, MST_PO_D_R.$dlv_nm,
					MST_PO_D_R.$dlv_cntct_dpt, MST_PO_D_R.$dlv_cntct_psn,
					MST_PO_D_R.$dlv_zip_cd, MST_PO_D_R.$dlv_addr1, MST_PO_D_R.$dlv_addr2,
					MST_PO_D_R.$dlv_addr3, MST_PO_D_R.$dlv_addr4, MST_PO_D_R.$dlv_tel,
					MST_PO_D_R.$dlv_fax, MST_PO_D_R.$tdlv_cd, MST_PO_D_R.$tdlv_sundry_flg,
					MST_PO_D_R.$tdlv_nm, MST_PO_D_R.$tdlv_cntct_dpt,
					MST_PO_D_R.$tdlv_cntct_psn, MST_PO_D_R.$tdlv_zip_cd,
					MST_PO_D_R.$tdlv_addr1, MST_PO_D_R.$tdlv_addr2,
					MST_PO_D_R.$tdlv_addr3, MST_PO_D_R.$tdlv_addr4, MST_PO_D_R.$tdlv_tel,
					MST_PO_D_R.$tdlv_fax);
			poDDbcL_bldr.addSelect(t1.arr_pr_no);
			poDDbcL_bldr.addSelect(t2.arr_schd_no);
			poDDbcL_bldr.addSelect(t2.lot_no);
			poDDbcL_bldr.addSelect(t2.sublot_no);
			poDDbcL_bldr.addSelect(t6.dlv_cd.as("inst_dlv_cd"));
			poDDbcL_bldr.addSelect(nvl2(t6.dlv_cd, t6.dlv_sundry_flg, value(false)).as("dlv_sundry_flg"));
			poDDbcL_bldr.addSelect(nvl2(t6.dlv_cd, t6.dlv_nm, nullValue()).as("dlv_nm"));
			poDDbcL_bldr.addSelect(nvl2(t6.dlv_cd, t6.dlv_cntct_dpt, nullValue()).as("dlv_cntct_dpt"));
			poDDbcL_bldr.addSelect(nvl2(t6.dlv_cd, t6.dlv_cntct_psn, nullValue()).as("dlv_cntct_psn"));
			poDDbcL_bldr.addSelect(nvl2(t6.dlv_cd, t6.dlv_zip_cd, nullValue()).as("dlv_zip_cd"));
			poDDbcL_bldr.addSelect(nvl2(t6.dlv_cd, t6.dlv_addr1, nullValue()).as("dlv_addr1"));
			poDDbcL_bldr.addSelect(nvl2(t6.dlv_cd, t6.dlv_addr2, nullValue()).as("dlv_addr2"));
			poDDbcL_bldr.addSelect(nvl2(t6.dlv_cd, t6.dlv_addr3, nullValue()).as("dlv_addr3"));
			poDDbcL_bldr.addSelect(nvl2(t6.dlv_cd, t6.dlv_addr4, nullValue()).as("dlv_addr4"));
			poDDbcL_bldr.addSelect(nvl2(t6.dlv_cd, t6.dlv_tel, nullValue()).as("dlv_tel"));
			poDDbcL_bldr.addSelect(nvl2(t6.dlv_cd, t6.dlv_fax, nullValue()).as("dlv_fax"));
			poDDbcL_bldr.addSelect(nvl2(t6.dlv_cd, t6.dlv_lg_grp_cd, nullValue()).as("dlv_lg_grp_cd"));
			poDDbcL_bldr.addSelect(nvl2(t6.dlv_cd, t6.pri_prnt_flg, value(false)).as("dlv_pri_prnt_flg"));
			poDDbcL_bldr.addSelect(t6.tdlv_cd);
			poDDbcL_bldr.addSelect(nvl2(t6.tdlv_cd, t6.tdlv_sundry_flg, value(false)).as("tdlv_sundry_flg"));
			poDDbcL_bldr.addSelect(nvl2(t6.tdlv_cd, t6.tdlv_nm, nullValue()).as("tdlv_nm"));
			poDDbcL_bldr.addSelect(nvl2(t6.tdlv_cd, t6.tdlv_cntct_dpt, nullValue()).as("tdlv_cntct_dpt"));
			poDDbcL_bldr.addSelect(nvl2(t6.tdlv_cd, t6.tdlv_cntct_psn, nullValue()).as("tdlv_cntct_psn"));
			poDDbcL_bldr.addSelect(nvl2(t6.tdlv_cd, t6.tdlv_zip_cd, nullValue()).as("tdlv_zip_cd"));
			poDDbcL_bldr.addSelect(nvl2(t6.tdlv_cd, t6.tdlv_addr1, nullValue()).as("tdlv_addr1"));
			poDDbcL_bldr.addSelect(nvl2(t6.tdlv_cd, t6.tdlv_addr2, nullValue()).as("tdlv_addr2"));
			poDDbcL_bldr.addSelect(nvl2(t6.tdlv_cd, t6.tdlv_addr3, nullValue()).as("tdlv_addr3"));
			poDDbcL_bldr.addSelect(nvl2(t6.tdlv_cd, t6.tdlv_addr4, nullValue()).as("tdlv_addr4"));
			poDDbcL_bldr.addSelect(nvl2(t6.tdlv_cd, t6.tdlv_tel, nullValue()).as("tdlv_tel"));
			poDDbcL_bldr.addSelect(nvl2(t6.tdlv_cd, t6.tdlv_fax, nullValue()).as("tdlv_fax"));
			poDDbcL_bldr.addSelect(nvl2(t6.tdlv_cd, t6.tdlv_lg_grp_cd, nullValue()).as("tdlv_lg_grp_cd"));
			poDDbcL_bldr.addLeftOuterJoin(t1, t.po_d_no.eq(t1.po_d_no));
			poDDbcL_bldr.addInnerJoin(arrPrKey, t1.arr_pr_no.eq(arrPrKey.arr_pr_no));
			poDDbcL_bldr.addLeftOuterJoin(t2, t1.arr_pr_no.eq(t2.arr_pr_no));
			poDDbcL_bldr.addLeftOuterJoin(t3, t3.arr_pr_no.eq(t2.arr_pr_no)
					.and(t3.arr_schd_no.eq(t2.arr_schd_no)));
			poDDbcL_bldr.addLeftOuterJoin(t4, t4.purc_schd_no.eq(t3.purc_schd_no));
			poDDbcL_bldr.addLeftOuterJoin(t5,
					nvl(t2.prms_rcpt_d_no, t4.ref_prms_rcpt_d_no).eq(t5.prms_rcpt_d_no));
			poDDbcL_bldr.addLeftOuterJoin(t6,
					coalesce(t2.dlv_inst_d_no, t5.dlv_inst_d_no, t4.ref_dlv_inst_d_no).eq(t6.dlv_inst_d_no));
			dbSelect("MSBDL5030_MST_PO_D_S01", poDDbcL, poDDbcL_bldr);
			MCIndexKey idk = poDDbcL.createIndex("arr_schd_no");

			MCList<MST_PO_SCHD_R> poSchdDbcL = MCList.create(MST_PO_SCHD_R.class);
			MST_PO_SCHD_R t8 = MST_PO_SCHD_R.create("T");
			MCQueryApiBuilder poSchdDbcL_bldr = MCQueryApiBuilder.create(t8);
			poSchdDbcL_bldr.setWhere(t8.po_d_no.eq(bind("po_d_no")));
			dbSelect("MSBDL5030_MST_PO_SCHD_S01", poSchdDbcL, poSchdDbcL_bldr, delL);
			MCIndexKey idkDel = poSchdDbcL.createIndex(MST_PO_SCHD_R.$po_d_no);

			for(PurcSchd_DtlR up0R : up0()){
				// 新規・更新
				if (MAC_DATA_CRUD_TYP.isCRT(up0R.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(up0R.data_crud_typ())) {
					MCList<MST_PO_D_R> subL = poDDbcL.subList(idk, up0R.getStringNE("arr_schd_no"));
					for(MST_PO_D_R poDDbcR : subL){

						if(!isNull(poDDbcR) && !isNull(poDDbcR.getStringNE("dlv_cd"))){
							//仕入直送
							//売上予定サービスを実行する
							mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd04_DtlR addR
							= mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd04_DtlR.create();
							addR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.PURC_SCHD.value());
							addR.data_crud_typ(up0R.data_crud_typ());
							addR.purc_schd_no(up0R.purc_schd_no());
							addR.po_schd_no(poDDbcR.po_schd_no());
							addR.slo_d_no(poDDbcR.getStringNE("slo_d_no"));
							addR.sls_schd_dt(up0R.purc_schd_dt());
							addR.trd_unit_qty(up0R.trd_unit_schd_qty());
							addR.trd_unit_cd(up0R.trd_unit_cd());
							addR.base_unit_qty(up0R.base_unit_schd_qty());
							addR.base_unit_cd(up0R.base_unit_cd());
							addR.lot_no(poDDbcR.getStringNE("lot_no"));
							addR.sublot_no(poDDbcR.getStringNE("sublot_no"));
							addR.abort_flg(up0R.abort_flg());
							addR.dlv_cd(poDDbcR.getStringNE("inst_dlv_cd"));
							addR.dlv_sundry_flg(poDDbcR.dlv_sundry_flg());
							addR.dlv_nm(poDDbcR.dlv_nm());
							addR.dlv_cntct_dpt(poDDbcR.dlv_cntct_dpt());
							addR.dlv_cntct_psn(poDDbcR.dlv_cntct_psn());
							addR.dlv_zip_cd(poDDbcR.dlv_zip_cd());
							addR.dlv_addr1(poDDbcR.dlv_addr1());
							addR.dlv_addr2(poDDbcR.dlv_addr2());
							addR.dlv_addr3(poDDbcR.dlv_addr3());
							addR.dlv_addr4(poDDbcR.dlv_addr4());
							addR.dlv_tel(poDDbcR.dlv_tel());
							addR.dlv_fax(poDDbcR.dlv_fax());
							addR.dlv_lg_grp_cd(poDDbcR.getStringNE("dlv_lg_grp_cd"));
							addR.pri_prnt_flg(poDDbcR.getBooleanNE("dlv_pri_prnt_flg"));
							addR.tdlv_cd(poDDbcR.tdlv_cd());
							addR.tdlv_sundry_flg(poDDbcR.tdlv_sundry_flg());
							addR.tdlv_nm(poDDbcR.tdlv_nm());
							addR.tdlv_cntct_dpt(poDDbcR.tdlv_cntct_dpt());
							addR.tdlv_cntct_psn(poDDbcR.tdlv_cntct_psn());
							addR.tdlv_zip_cd(poDDbcR.tdlv_zip_cd());
							addR.tdlv_addr1(poDDbcR.tdlv_addr1());
							addR.tdlv_addr2(poDDbcR.tdlv_addr2());
							addR.tdlv_addr3(poDDbcR.tdlv_addr3());
							addR.tdlv_addr4(poDDbcR.tdlv_addr4());
							addR.tdlv_tel(poDDbcR.tdlv_tel());
							addR.tdlv_fax(poDDbcR.tdlv_fax());
							addR.tdlv_lg_grp_cd(poDDbcR.getStringNE("tdlv_lg_grp_cd"));
							addR.setAttributes(up0R);
							ssUpd04Srv.up0().add(addR);
						}
					}
				}
				// 取消
				if (MAC_DATA_CRUD_TYP.isDEL(up0R.data_crud_typ())) {
					MCList<MST_PO_SCHD_R> subDelL = poSchdDbcL.subList(idkDel, up0R.po_d_no());
					for (MST_PO_SCHD_R poSchdDbcR : subDelL) {
						//仕入直送
						//売上予定サービスを実行する
						if(!isNull(poSchdDbcR.dlv_cd())){
							mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd04_DtlR addR
							= mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd04_DtlR.create();
							addR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.PURC_SCHD.value());
							addR.data_crud_typ(up0R.data_crud_typ());
							addR.purc_schd_no(up0R.purc_schd_no());
							addR.po_schd_no(poSchdDbcR.po_schd_no());
							addR.slo_d_no(poSchdDbcR.slo_d_no());
							ssUpd04Srv.up0().add(addR);
						}
					}
				}
			}

			if(!ssUpd04Srv.up0().isEmpty()){
				ssUpd04Srv.exec();
			}
		}
		
		protected void insArrPrWk(MCList<PurcSchd_DtlR> bindL) {
			
			MCList<MSW_ARR_PR_KEY_R> wkL = MCList.create(MSW_ARR_PR_KEY_R.class);
			
			for (PurcSchd_DtlR r : bindL.groupBy(PurcSchd_DtlR.$arr_pr_no)) {
				if (!isNull(r.arr_pr_no())) {
					wkL.add().arr_pr_no(r.arr_pr_no());
				}
			}
			
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_ARR_PR_R.create("T"));
			
			dbWkDelete("MSBDL5030_MSW_ARR_PR_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBDL5030_MSW_ARR_PR_I01", wkL, wkL_bldr.getBaseDbc());
		}

		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * PurcSchd_Upd02オペレーション.<p>
	 *
	 */
	public class PurcSchd_Upd02 extends MSBDL_PurcSchdRegService_MC_A.PurcSchd_Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			setPurcSchdNo();
			lock();
			upd();
		}

		/**
		 * 仕入予定ＮＯの補完する<br>
		 * ※上り電文で仕入予定ＮＯが空で入荷予定ＮＯが指定されている場合
		 */
		protected void setPurcSchdNo() {

			MCList<PurcSchd_DtlR> bindL = MCList.create(PurcSchd_DtlR.class);

			for(PurcSchd_DtlR up0R: up0()){
				if(!isNull(up0R.arr_schd_no()) && isNull(up0R.purc_schd_no())){
					bindL.add(up0R);
				}
			}

			if (!bindL.isEmpty()) {
				MCList<MST_PURC_SCHD_R> chkPsDbcL = MCList.create(MST_PURC_SCHD_R.class);
				MST_PURC_SCHD_R t = MST_PURC_SCHD_R.create("T");
				MCQueryApiBuilder chkPsDbcL_bldr = MCQueryApiBuilder.create(t);
				chkPsDbcL_bldr.addWhereWithAnd(t.arr_schd_no.eq(bind("arr_schd_no")));
				dbSelect("MSBDL5030_MST_PURC_SCHD_S03", chkPsDbcL, chkPsDbcL_bldr, bindL);

				MCIndexKey idk = chkPsDbcL.createIndex(MST_PURC_SCHD_R.$arr_schd_no);

				for (PurcSchd_DtlR bindR : bindL) {

					MST_PURC_SCHD_R chkPsDbcR = chkPsDbcL.getFirst(idk,
							bindR.arr_schd_no());
					bindR.purc_schd_no(chkPsDbcR.purc_schd_no());
				}
			}

		}

		protected void lock() {

			MCList<MST_PURC_SCHD_R> psDbcL = MCList.create(MST_PURC_SCHD_R.class);
			MST_PURC_SCHD_R t1 = MST_PURC_SCHD_R.create("T");
			MCQueryApiBuilder psDbcL_bldr = MCQueryApiBuilder.create(t1);
			psDbcL_bldr.addOrderByAsc(t1.purc_schd_no);
			dbSelectKeyForUpdateNoWait("MSBDL5030_MST_PURC_SCHD_S04", psDbcL, psDbcL_bldr, up0());

			MCList<MST_ARR_SCHD_R> asDbcL = MCList.create(MST_ARR_SCHD_R.class);
			MST_ARR_SCHD_R t2 = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder asDbcL_bldr = MCQueryApiBuilder.create(t2);
			dbSelectKey("MSBDL5030_MST_ARR_SCHD_S01", asDbcL, asDbcL_bldr, psDbcL);

			MCList<MST_RCPT_IV_R> riDbcL = MCList.create(MST_RCPT_IV_R.class);
			MST_RCPT_IV_R t3 = MST_RCPT_IV_R.create("T");
			MCQueryApiBuilder riDbcL_bldr = MCQueryApiBuilder.create(t3);
			riDbcL_bldr.addOrderByAsc(t3.rcpt_iv_mng_no);
			riDbcL_bldr.addWhereWithAnd(t3.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")));
			dbSelectForUpdateNoWait("MSBDL5030_MST_RCPT_IV_S01", riDbcL, riDbcL_bldr, asDbcL);

		}

		protected void upd() {
			
			// 仕入予定更新
			updPurcSchd();
			// 受領インボイス更新
			updRcptIv();
			callSlsSchdSrv();
		}
		
		/**
		 * 仕入予定更新
		 */
		protected void updPurcSchd() {
			// 仕入予定に対応する実績をすべて取得する
			MCList<MST_PURC_SCHD_R> psDbcL = srchPurcAct(up0());

			MCIndexKey idk = psDbcL.createIndex(MST_PURC_SCHD_R.$purc_schd_no);
			
			// 更新データ格納用リスト
			MCList<MST_PURC_SCHD_R> psDbcUpdL = MCList.create(MST_PURC_SCHD_R.class);

			for(PurcSchd_DtlR up0R :up0()){
				up0R.purc_schd().setBooleanNE(PurcSchd_DtlR.$no_cred_upd_flg, up0R.no_cred_upd_flg());
				//　上り電文に対応する仕入実績
				MCList<MST_PURC_SCHD_R> subL = psDbcL.subList(idk, up0R.purc_schd_no());
				
				if (subL.size() == 0) {
					// すべての実績を取り消した場合は、すべて初期値に戻す。
					MST_PURC_SCHD_R psDbcUpdR = MST_PURC_SCHD_R.create();
					psDbcUpdR.purc_schd_no(up0R.purc_schd_no());
					psDbcUpdR.base_unit_purc_qty(MCNumber.ZERO);
					psDbcUpdR.base_unit_temp_purc_qty(MCNumber.ZERO);
					psDbcUpdR.base_unit_accpt_dfct_qty(MCNumber.ZERO);
					psDbcUpdR.purc_split_flg(false);
					psDbcUpdR.base_unit_abort_qty(MCNumber.ZERO);
					psDbcUpdR.setBooleanNE(PurcSchd_DtlR.$no_cred_upd_flg, up0R.no_cred_upd_flg());
					psDbcUpdL.add(psDbcUpdR);
					continue;
				}
				// 仕入予定行
				MST_PURC_SCHD_R purcSchdR = subL.get(0).clone();
				//　基準単位仕入数
				MCNumber base_unit_purc_qty = MCNumber.ZERO;
				//　基準単位仮仕入数
				MCNumber base_unit_temp_purc_qty = MCNumber.ZERO;
				//　基準単位検収不良数
				MCNumber base_unit_accpt_dfct_qty = MCNumber.ZERO;
				
				for(MST_PURC_SCHD_R subR : subL){
					// 検収不良数の集計
					if(subR.getBooleanNE("accpt_dfct_flg")){
						base_unit_accpt_dfct_qty
						= base_unit_accpt_dfct_qty.add(subR.getNumberNE("base_unit_qty"));
					}
					else{
						// 基準単位仕入数量の合計
						// 暫定買掛の場合は仮の仕入のため、仕入数として加算しない
						if (!subR.getBooleanNE("temp_ap_flg")) {
							base_unit_purc_qty = base_unit_purc_qty.add(subR.getNumberNE("base_unit_qty"));
						}
						else {
							base_unit_temp_purc_qty = base_unit_temp_purc_qty.add(subR.getNumberNE("base_unit_qty"));
						}
					}
				}
				up0R.base_unit_purc_qty(base_unit_purc_qty);
				up0R.purc_schd().base_unit_temp_purc_qty(base_unit_temp_purc_qty);
				up0R.base_unit_accpt_dfct_qty(base_unit_accpt_dfct_qty);
				
				if (purcSchdR.getBooleanNE("temp_ap_flg")) {
					// 暫定買掛の場合は仮の仕入のため、打切にしない
					up0R.abort_flg(false);
				}
				//　打切数
				MCNumber base_unit_abort_qty = MCNumber.ZERO;
				if(up0R.abort_flg()){
					// 打切数は、予定数から仕入数と検証不良数を除いた数量とする
					base_unit_abort_qty = purcSchdR.base_unit_schd_qty();
					base_unit_abort_qty = base_unit_abort_qty.subtract(base_unit_purc_qty);
					base_unit_abort_qty = base_unit_abort_qty.subtract(base_unit_temp_purc_qty);
					base_unit_abort_qty = base_unit_abort_qty.subtract(base_unit_accpt_dfct_qty);
				}
				up0R.base_unit_abort_qty(base_unit_abort_qty);
				
				//　仕入分割ＦＬＧ
				if(subL.size() > 1){
					up0R.purc_split_flg(true);
				}
				else{
					up0R.purc_split_flg(false);
				}

				// 完了ＦＬＧ
				MCNumber ttlQty = MCNumber.ZERO;
				ttlQty = ttlQty.add(up0R.base_unit_purc_qty());
				ttlQty = ttlQty.add(up0R.base_unit_accpt_dfct_qty());
				ttlQty = ttlQty.add(up0R.base_unit_abort_qty());
				// 過入荷を考慮し、「入荷実績数量と仕入予定数量の大きいほう」と「仕入実績数量」を比較して完了を判定
				MCNumber tgtNum = purcSchdR.getNumberNE("arr_qty").lt(purcSchdR.base_unit_schd_qty()) ? 
						purcSchdR.base_unit_schd_qty() : purcSchdR.getNumberNE("arr_qty");
				if (!purcSchdR.isEmpty() && tgtNum.lte(ttlQty)) {
					// 仕入数＋打切数＋検収不良数が予定数を上回った場合は完了とする
					up0R.cmpl_flg(true);
				}
				else {
					up0R.cmpl_flg(false);
				}
				
				
				//　DB更新用のROW
				MST_PURC_SCHD_R psDbcUpdR = MST_PURC_SCHD_R.create();
				MST_PURC_SCHD_R.copyvalue(psDbcUpdR, up0R.purc_schd());
				psDbcUpdL.add(psDbcUpdR);
			}
			
			// すべての実績を取り消した場合は、取り消す前の仕入予定を取得する
			// ※仕入を一部実績する場合でも取り消すと、与信金額が正しくなるため
			MCList<MST_PURC_SCHD_R> bfPsDbcL = MCList.create(MST_PURC_SCHD_R.class);
			if (isCredTgt()) {
				MCQueryApiBuilder bfPsDbcL_bldr = MCQueryApiBuilder.create(MST_PURC_SCHD_R.create("T"));
				dbSelectKey("MSBDL5030_MST_PURC_SCHD_S05", bfPsDbcL, bfPsDbcL_bldr, psDbcUpdL);
			}
			MST_PURC_SCHD_R psDbcUpdL_t = MST_PURC_SCHD_R.create("T");
			MCQueryApiBuilder psDbcUpdL_bldr = MCQueryApiBuilder.create(psDbcUpdL_t);
			// DB更新
			psDbcUpdL_bldr.setSet(
					psDbcUpdL_t.base_unit_abort_qty,
					psDbcUpdL_t.base_unit_purc_qty,
					psDbcUpdL_t.base_unit_temp_purc_qty,
					psDbcUpdL_t.base_unit_accpt_dfct_qty,
					psDbcUpdL_t.cmpl_flg,
					psDbcUpdL_t.abort_flg,
					psDbcUpdL_t.purc_split_flg);
			dbUpdateKey("MSBDL5030_MST_PURC_SCHD_U03", psDbcUpdL, psDbcUpdL_bldr);
			if (isCredTgt()) {
				// 債務与信更新を呼び出すため、更新済の仕入予定情報の基準単位予定数量を設定するため
				MCIndexKey idx = bfPsDbcL.createIndex(MST_PURC_SCHD_R.$purc_schd_no);
				for (MST_PURC_SCHD_R r : psDbcUpdL) {
					MST_PURC_SCHD_R bfPsR = bfPsDbcL.getFirst(idx, r.purc_schd_no());
					if (!isNull(bfPsR)) {
						r.base_unit_schd_qty(bfPsR.base_unit_schd_qty());
					}
				}
			}
			// 債務与信更新
			callCredUpd02(bfPsDbcL,
				null,
				psDbcUpdL.subList(r->!r.getBooleanNE(PurcSchd_DtlR.$no_cred_upd_flg)),
				null,
				null);
		}
		
		/**
		 * 受領インボイス更新
		 */
		protected void updRcptIv() {

			// 更新した仕入予定を取得する
			MST_ARR_SCHD_R t1 = MST_ARR_SCHD_R.create("T1");
			MCTempView t2 = createTempView("T2");
			MST_PURC_ACT_D_R S1T1 = MST_PURC_ACT_D_R.create("S1T1");
			MST_PURC_ACT_R S1T2 = MST_PURC_ACT_R.create("S1T2");

			MCList<MST_PURC_SCHD_R> psDbcL = MCList.create(MST_PURC_SCHD_R.class);
			MST_PURC_SCHD_R psDbcL_t = MST_PURC_SCHD_R.create("T");
			MCQueryApiBuilder psDbcL_bldr = MCQueryApiBuilder.create(psDbcL_t);
			dbWkDelete("MSBDL5030_MSW_PURC_SCHD_D03", psDbcL_bldr.getBaseDbc());
			dbWkInsert("MSBDL5030_MSW_PURC_SCHD_I02", up0(), psDbcL_bldr.getBaseDbc());
			MSW_PURC_SCHD_KEY_R k01 = MSW_PURC_SCHD_KEY_R.create("K01");
			psDbcL_bldr.addSelect(t1.rcpt_iv_mng_no);
			psDbcL_bldr.addSelect(t2.pr(S1T2.purc_dt));
			psDbcL_bldr.addLeftOuterJoin(t1, psDbcL_t.arr_schd_no.eq(t1.arr_schd_no));
			psDbcL_bldr.addLeftOuterJoin(subQuery()
							.select(S1T1.purc_schd_no, S1T2.purc_dt)
							.from(S1T1.leftOuterJoin(S1T2)
									.on(S1T1.purc_act_no.eq(S1T2.purc_act_no)
											.and(S1T1.purc_act_seq.eq(S1T2.purc_act_seq)))
									.innerJoin(k01).on(S1T1.purc_schd_no.eq(k01.purc_schd_no)))
							.where(S1T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							.groupBy(S1T1.purc_schd_no, S1T2.purc_dt).view(t2),
					psDbcL_t.purc_schd_no.eq(t2.pr(S1T1.purc_schd_no)));
			psDbcL_bldr.addInnerJoin(k01, bracket(psDbcL_t.purc_schd_no.eq(k01.purc_schd_no)));
			dbSelect("MSBDL5030_MST_PURC_SCHD_S06", psDbcL, psDbcL_bldr);
			dbWkDelete("MSBDL5030_MSW_PURC_SCHD_D04", psDbcL_bldr.getBaseDbc());
			
			if (psDbcL.size() > 0) {
				
				MCIndexKey idxRcptIvMngNo = psDbcL.createIndex("rcpt_iv_mng_no");
				
				// 更新対象となる受領インボイスを取得
				MST_ARR_SCHD_R t3 = MST_ARR_SCHD_R.create("T3");
				MST_PURC_SCHD_R t4 = MST_PURC_SCHD_R.create("T4");

				MCList<MST_RCPT_IV_R> riDbcL = MCList.create(MST_RCPT_IV_R.class);
				MST_RCPT_IV_R riDbcL_t = MST_RCPT_IV_R.create("T");
				MCQueryApiBuilder riDbcL_bldr = MCQueryApiBuilder.create(riDbcL_t);
				riDbcL_bldr.addGroupBy(riDbcL_t.rcpt_iv_mng_no);
				riDbcL_bldr.addLeftOuterJoin(t3, riDbcL_t.rcpt_iv_mng_no.eq(t3.rcpt_iv_mng_no));
				riDbcL_bldr.addLeftOuterJoin(t4, t3.arr_schd_no.eq(t4.arr_schd_no));
				riDbcL_bldr.setWhere(t4.purc_schd_no.eq(bind("purc_schd_no")));
				dbSelect("MSBDL5030_MST_RCPT_IV_S02", riDbcL, riDbcL_bldr, psDbcL);

				MCList<MST_RCPT_IV_R> updRiDbcL = MCList.create(MST_RCPT_IV_R.class);
				MCQueryApiBuilder updRiDbcL_bldr = MCQueryApiBuilder.create(MST_RCPT_IV_R.create("T"));
				dbSelectKey("MSBDL5030_MST_RCPT_IV_S03", updRiDbcL, updRiDbcL_bldr, riDbcL);
				
				for (MST_RCPT_IV_R updRiDbcR : updRiDbcL) {
					// 仕入予定の完了となった場合は、仕入完了FLGをオンにして、仕入日をセットする
					MST_PURC_SCHD_R psDbcR = psDbcL.getFirst(idxRcptIvMngNo, updRiDbcR.rcpt_iv_mng_no());
					if (psDbcR.cmpl_flg()) {
						updRiDbcR.purc_cmpl_flg(true);
						updRiDbcR.purc_dt(psDbcR.getDateNE("purc_dt"));
					}
					else {
						updRiDbcR.purc_cmpl_flg(false);
						updRiDbcR.purc_dt(null);
					}
				}
				
				if (updRiDbcL.size() > 0) {
					dbUpdateKey("MSBDL5030_MST_RCPT_IV_U01", updRiDbcL, updRiDbcL_bldr);
				}
				// 改訂履歴データ更新サービス呼出（受領インボイス改訂履歴テーブル更新）
				callRevDataServiceIns01(updRiDbcL);
			}
			
			
		}
		protected void callSlsSchdSrv() {

			MSBBL_SlsSchdService.Sls_Schd_Upd04 ssUpd04Srv = MSBBL_SlsSchdService.crtSls_Schd_Upd04();
			MCList<PurcSchd_DtlR> ddlvL = up0().subList(PurcSchd_DtlR.$purc_ddlv_flg, true);
			MCList<MST_PURC_SCHD_R> purcSchdL = srchPurcShcd(ddlvL);
			MCIndexKey key = purcSchdL.createIndex(MST_PURC_SCHD_R.$purc_schd_no);
			MapSlsSchdUpd04<Sls_Schd_Upd04_DtlR, PurcSchd_DtlR, MST_PURC_SCHD_R> mpr = createMapSlsSchdUpd04();
			for (PurcSchd_DtlR up0R : ddlvL) {
				Sls_Schd_Upd04_DtlR addR = Sls_Schd_Upd04_DtlR.create();
				MST_PURC_SCHD_R purcSchdR = purcSchdL.getFirst(key, up0R.purc_schd_no());
				copy(addR, up0R, purcSchdR, mpr);

				ssUpd04Srv.up0().add(addR);
			}

			if (!ssUpd04Srv.up0().isEmpty()) {
				ssUpd04Srv.exec();
			}
		}

		protected MCList<MST_PURC_SCHD_R> srchPurcShcd(MCList<PurcSchd_DtlR> ddlvL) {
			MST_ARR_SCHD_R arrschd = MST_ARR_SCHD_R.create("ARRSCHD");
			MST_ARR_PR_R pr = MST_ARR_PR_R.create("PR");
			MST_PO_D_R pod = MST_PO_D_R.create("POD");

			MCList<MST_PURC_SCHD_R> purcSchdL = MCList.create(MST_PURC_SCHD_R.class);
			MST_PURC_SCHD_R t = MST_PURC_SCHD_R.create("T");
			MCQueryApiBuilder purcSchdL_bldr = MCQueryApiBuilder.create(t);

			purcSchdL_bldr.addSelect(pod.po_schd_no);
			purcSchdL_bldr.addSelect(pod.slo_d_no);
			purcSchdL_bldr.addSelect(arrschd.lot_no);
			purcSchdL_bldr.addSelect(arrschd.sublot_no);
			purcSchdL_bldr.addInnerJoin(arrschd, t.arr_schd_no.eq(arrschd.arr_schd_no));
			purcSchdL_bldr.addInnerJoin(pr, t.arr_pr_no.eq(pr.arr_pr_no));
			purcSchdL_bldr.addInnerJoin(pod, pr.po_d_no.eq(pod.po_d_no));

			dbSelectKey("MSBDL5030_MST_PURC_SCHD_S07", purcSchdL, purcSchdL_bldr, ddlvL);
			return purcSchdL;
		}

		protected MapSlsSchdUpd04<Sls_Schd_Upd04_DtlR, PurcSchd_DtlR, MST_PURC_SCHD_R> createMapSlsSchdUpd04() {
			return new MapSlsSchdUpd04<Sls_Schd_Upd04_DtlR, PurcSchd_DtlR, MST_PURC_SCHD_R>();
		}

		public class MapSlsSchdUpd04<D extends Sls_Schd_Upd04_DtlR, S extends PurcSchd_DtlR, W extends MST_PURC_SCHD_R>
				extends FXUCC_RowMapperWith<D, S, W> {
			protected W _purcSchdR;

			@Override
			public void setWith(W purcSchdR) {
				this._purcSchdR = purcSchdR;
			}

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Sls_Schd_Upd04_DtlR.$purc_schd_no, PurcSchd_DtlR.$purc_schd_no);
				addColumnPathMap(Sls_Schd_Upd04_DtlR.$abort_flg, PurcSchd_DtlR.$abort_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.PURC_SCHD.value());
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				dest.sls_schd_dt(_purcSchdR.purc_schd_dt());
				dest.slo_d_no(_purcSchdR.getStringNE("slo_d_no"));
				dest.lot_no(_purcSchdR.getStringNE("lot_no"));
				dest.sublot_no(_purcSchdR.getStringNE("sublot_no"));
				dest.trd_unit_qty(_purcSchdR.trd_unit_schd_qty());
				dest.trd_unit_cd(_purcSchdR.trd_unit_cd());
				dest.base_unit_qty(_purcSchdR.base_unit_schd_qty());
				dest.base_unit_cd(_purcSchdR.base_unit_cd());
			}
		}
		
	
		/**
		 * 改訂履歴データ更新サービスの改訂履歴データ更新リスト登録処理を呼び出す。
		 * 受領インボイス改訂履歴テーブルを更新する。
		 * @param rcptIvL 受領インボイスリスト
		 */
		protected void callRevDataServiceIns01(MCList<MST_RCPT_IV_R> rcptIvL) {
			if (rcptIvL.size() > 0) {
				MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
				for (MST_RCPT_IV_R r : rcptIvL) {
					RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
					opeR.rev_data_src_no(r.rcpt_iv_mng_no());
					opeR.rev_no(r.rcpt_iv_rev());
					opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_RCPT_IV.value());
					ope.up0().add(opeR);
				}
				ope.exec();
			}
		}
	}
	/**
	 * PurcSchd_Chk01オペレーション.<p>
	 * 仕入予定の登録前のチェック処理。
	 */
	public class PurcSchd_Chk01 extends MSBDL_PurcSchdRegService_MC_A.PurcSchd_Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		protected void setDown() {

			down0().setAll(up0());
		}

		@Override
		protected MCMessageList doServerCheckBase() {

			MCMessageList msgL = super.doServerCheckBase();
			chkPurcSchd(msgL);
			return msgL;
		}

		protected void chkPurcSchd(MCMessageList msgL) {

			MST_PURC_ACT_R t1 = MST_PURC_ACT_R.create("T1");
			MST_PURC_ACT_D_R t2 = MST_PURC_ACT_D_R.create("T2");
			MST_PURC_ACT_IO_R t3 = MST_PURC_ACT_IO_R.create("T3");

			MCList<MST_PURC_SCHD_R> psDbcL = MCList.create(MST_PURC_SCHD_R.class);
			MST_PURC_SCHD_R t = MST_PURC_SCHD_R.create("T");
			MCQueryApiBuilder psDbcL_bldr = MCQueryApiBuilder.create(t);
			psDbcL.addBooleanColumn("accpt_dfct_flg");

			psDbcL_bldr.addSelect(t1.purc_act_no);
			psDbcL_bldr.addSelect(t2.accpt_dfct_flg);//仕入実績明細.検収不良ＦＬＧ
			psDbcL_bldr.addSelect(t3.base_unit_qty);//仕入実績受払.基準単位数量
			psDbcL_bldr.addSelect(t3.arr_act_no);//仕入実績受払.入荷実績ＮＯ
			psDbcL_bldr.addLeftOuterJoin(t2, t.purc_schd_no.eq(t2.purc_schd_no));
			psDbcL_bldr.addLeftOuterJoin(t1, t2.purc_act_no.eq(t1.purc_act_no)
					.and(t2.purc_act_seq.eq(t1.purc_act_seq)));
			psDbcL_bldr.addLeftOuterJoin(t3, t2.purc_act_d_no.eq(t3.purc_act_d_no)
					.and(t2.purc_act_d_seq.eq(t3.purc_act_d_seq)));
			psDbcL_bldr.addWhereWithAnd(t.purc_schd_no.eq(bind("purc_schd_no")));
			psDbcL_bldr.addWhereWithAnd(t1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			dbSelect("MSBDL5030_MST_PURC_SCHD_S08", psDbcL, psDbcL_bldr, up0());

			MCIndexKey idk = psDbcL.createIndex(MST_PURC_SCHD_R.$purc_schd_no);

			for(PurcSchd_DtlR up0R :up0()){

				MCList<MST_PURC_SCHD_R> subL = psDbcL.subList(idk, up0R.purc_schd_no());

				//仕入予定に対する実績がない場合、チェックしない
				if (subL.size() == 0) {
					continue;
				}
				//基準単位仕入数
				//※上り電文の基準単位仕入数に既に登録済みの基準単位仕入数を加算する。
				MCNumber base_unit_purc_qty = up0R.base_unit_purc_qty();
				//基準単位検収不良数
				//※上り電文の基準単位検収不良数に既に登録済みの基準単位検収不良数を加算する。
				MCNumber base_unit_accpt_dfct_qty = up0R.base_unit_accpt_dfct_qty();

				for(MST_PURC_SCHD_R subR : subL){
					if(subR.getBooleanNE("accpt_dfct_flg")){

						base_unit_accpt_dfct_qty
						= base_unit_accpt_dfct_qty.add(subR.getNumberNE("base_unit_qty"));
					}
					else{

						base_unit_purc_qty
						= base_unit_purc_qty.add(subR.getNumberNE("base_unit_qty"));
					}
				}


				//仕入対象外チェック
				if(subL.get(0).non_purc_flg()){
					up0R.err_flg(true);
					msgL.add(new MCMessage(up0R, null, MSBDL0002, toDispGUIIndex(up0R)));
				}
			}
		}
	}

	/**
	 * 仕入予定に対応する仕入実績を取得する
	 * @param upL
	 * @return
	 */
	protected MCList<MST_PURC_SCHD_R> srchPurcAct(MCList<PurcSchd_DtlR> upL) {
		MST_PURC_ACT_R t1 = MST_PURC_ACT_R.create("T1");
		MST_PURC_ACT_D_R t2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_ACT_IO_R t3 = MST_PURC_ACT_IO_R.create("T3");
		MST_ARR_SCHD_R t4 = MST_ARR_SCHD_R.create("T4");
		MCList<MST_PURC_SCHD_R> psDbcL = MCList.create(MST_PURC_SCHD_R.class);
		MST_PURC_SCHD_R t = MST_PURC_SCHD_R.create("T");
		MCQueryApiBuilder psDbcL_bldr = MCQueryApiBuilder.create(t);
		psDbcL.addBooleanColumn("accpt_dfct_flg");
		psDbcL.addBooleanColumn("temp_ap_flg");
		// 検索
		psDbcL_bldr.addSelect(t1.purc_act_no); // 仕入実績．仕入実績ＮＯ
		psDbcL_bldr.addSelect(t2.accpt_dfct_flg); //　仕入実績明細.検収不良ＦＬＧ
		psDbcL_bldr.addSelect(t2.temp_ap_flg); //　仕入実績明細.暫定買掛ＦＬＧ
		psDbcL_bldr.addSelect(t3.base_unit_qty); //　仕入実績受払.基準単位数量
		psDbcL_bldr.addSelect(t3.arr_act_no); //　仕入実績受払.入荷実績ＮＯ
		psDbcL_bldr.addSelect(nvl(t4.arr_qty, value(0)).as("arr_qty"));
		psDbcL_bldr.addLeftOuterJoin(t2, t.purc_schd_no.eq(t2.purc_schd_no));
		psDbcL_bldr.addLeftOuterJoin(t1, t2.purc_act_no.eq(t1.purc_act_no)
				.and(t2.purc_act_seq.eq(t1.purc_act_seq)));
		psDbcL_bldr.addLeftOuterJoin(t3, t2.purc_act_d_no.eq(t3.purc_act_d_no)
				.and(t2.purc_act_d_seq.eq(t3.purc_act_d_seq)));
		psDbcL_bldr.addLeftOuterJoin(t4, t.arr_schd_no.eq(t4.arr_schd_no));
		psDbcL_bldr.addWhereWithAnd(t.purc_schd_no.eq(bind("purc_schd_no")));
		psDbcL_bldr.addWhereWithAnd(t1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
		dbSelect("MSBDL5030_MST_PURC_SCHD_S10", psDbcL, psDbcL_bldr, upL);
		return psDbcL;
	}
	/**
	 * 債務与信更新 <br>
	 * 仕入予定残数量の変更に対し、与信を更新する
	 * 
	 * @param psDbcL
	 * @param insCredL
	 * @param updCredL
	 * @param abortCredL
	 * @param delCredL
	 */
	protected void callCredUpd02(MCList<MST_PURC_SCHD_R> psDbcL,
			MCList<MST_PURC_SCHD_R> insCredL,
			MCList<MST_PURC_SCHD_R> updCredL,
			MCList<MST_PURC_SCHD_R> abortCredL,
			MCList<MST_PURC_SCHD_R> delCredL) {

		if (!isCredTgt()) {
			return;
		}
		
		MCList<MST_PURC_SCHD_R> afPsL = MCList.create(MST_PURC_SCHD_R.class);
		MCList<MST_PURC_SCHD_R> bfPsL = MCList.create(MST_PURC_SCHD_R.class);

		if (!isNull(insCredL)) {
			afPsL.addAll(insCredL.subList(r -> !r.cmpl_flg()));
		}
		if (!isNull(updCredL)) {
			afPsL.addAll(updCredL.subList(r -> !r.cmpl_flg()));
			bfPsL.addAll(getBfPurcSchdL(psDbcL, updCredL));
		}

		if (!isNull(abortCredL)) {
			// 打切解除の場合、更新後に追加
			afPsL.addAll(abortCredL.subList(r -> !r.abort_flg()));
			// 打切の場合、更新前に追加
			bfPsL.addAll(getBfPurcSchdL(psDbcL, abortCredL));
		}
		if (!isNull(delCredL)) {
			bfPsL.addAll(delCredL);
		}
		
		// 仕入予定の残数を計算する
		// 修正前後リストで仕入予定残数量が同じレコードを除外する
		removeNoUpdTgt(bfPsL, afPsL);
		if (isNull(bfPsL) && isNull(afPsL)) {
			return;
		}
		
		MCList<MST_PURC_SCHD_R> bindL = MCList.create(MST_PURC_SCHD_R.class);
		bindL.addAll(afPsL);
		bindL.addAll(bfPsL);
		
		MST_ARR_PR_R t1 = MST_ARR_PR_R.create("T1");
		MST_PURC_SCHD_R t2 = MST_PURC_SCHD_R.create("T2");
		MST_PO_R t3 = MST_PO_R.create("T3");
		MAM_ITM_R m1 = MAM_ITM_R.create("M1");
		MAM_CUR_R m2 = MAM_CUR_R.create("M2");

		MCList<MST_PO_D_R> podL = MCList.create(MST_PO_D_R.class);
		MST_PO_D_R t = MST_PO_D_R.create("T");
		MCQueryApiBuilder podL_bldr = MCQueryApiBuilder.create(t);
		podL.addBooleanColumn("dscnt_itm_flg");
		podL_bldr.setSelect(t.po_no);
		podL_bldr.addSelect(t.trd_cur_amt);
		podL_bldr.addSelect(t.trd_cur_tax_amt);
		podL_bldr.addSelect(t.base_unit_qty);
		podL_bldr.addSelect(t3.trd_cur_cd);
		podL_bldr.addSelect(t3.sppl_cd);
		podL_bldr.addSelect(m2.amt_dec_place);
		podL_bldr.addSelect(t2.purc_schd_no);
		podL_bldr.addSelect(m1.dscnt_itm_flg);
		podL_bldr.addLeftOuterJoin(t1, t.po_d_no.eq(t1.po_d_no));
		podL_bldr.addRightOuterJoin(t2, t1.arr_pr_no.eq(t2.arr_pr_no));
		podL_bldr.addLeftOuterJoin(t3, t.po_no.eq(t3.po_no));
		podL_bldr.addLeftOuterJoin(m1, t.itm_cd.eq(m1.itm_cd)
				.and(t.itm_sub1.eq(m1.itm_sub1))
				.and(t.itm_sub2.eq(m1.itm_sub2))
				.and(t.itm_sub3.eq(m1.itm_sub3)));
		podL_bldr.addLeftOuterJoin(m2, t3.trd_cur_cd.eq(m2.cur_cd));
		podL_bldr.setWhere(t2.purc_schd_no.eq(bind("purc_schd_no")));
		dbSelect("MSBDL5030_MST_PO_D_S02", podL, podL_bldr, bindL);

		MCList<Cred_Upd02_CndR> credCndL = MCList.create(Cred_Upd02_CndR.class);
		
		// 登録訂正後の与信情報
		credCndL.addAll(getCredUpd02Cnd(podL, afPsL, false));
		// 訂正取消前の与信情報
		credCndL.addAll(getCredUpd02Cnd(podL, bfPsL, true));
		
		credCndL = credCndL.groupBy(getGroupByPolicy()).subList(r -> !r.amt().isZero());
		if (!isNull(credCndL)) {
			MSBGL_CredService.Cred_Upd02 o = MSBGL_CredService.crtCred_Upd02();
			o.up0().setAll(credCndL);
			o.exec();
		}
	}
	
	protected void removeNoUpdTgt(MCList<MST_PURC_SCHD_R> bfPsL, MCList<MST_PURC_SCHD_R> afPsL) {
		MCIndexKey idxkey = afPsL.createIndex(MST_PURC_SCHD_R.$purc_schd_no);
		List<String> lst = new ArrayList<String>();
		for (MST_PURC_SCHD_R bfR : bfPsL) {
			MST_PURC_SCHD_R afR = afPsL.getFirst(idxkey, bfR.purc_schd_no());
			if (isNull(afR)) {
				continue;
			}
			
			MCNumber bfRemQty = calcBaseUnitSchdRemQty(bfR);
			MCNumber afRemQty = calcBaseUnitSchdRemQty(afR);
			if (bfRemQty.eq(afRemQty)) {
				lst.add(bfR.purc_schd_no());
			}
		}

		bfPsL.removeIf(r -> lst.contains(r.purc_schd_no()));
		afPsL.removeIf(r -> lst.contains(r.purc_schd_no()));
	}
	/**
	 * 集計ポリシーを取得する
	 * 
	 * @return 集計ポリシー
	 */
	protected MCGroupByPolicy getGroupByPolicy() {
		
		MCGroupByPolicy gp = new MCGroupByPolicy(Cred_Upd02_CndR.$sppl_cd, Cred_Upd02_CndR.$cur_cd);
		gp.sum(Cred_Upd02_CndR.$amt);
		
		return gp;
	}
	
	protected MCList<Cred_Upd02_CndR> getCredUpd02Cnd(MCList<MST_PO_D_R> podL,
			MCList<MST_PURC_SCHD_R> psL, boolean bfUpdFlg) {
		MCList<Cred_Upd02_CndR> cndL = MCList.create(Cred_Upd02_CndR.class);
		
		MCIndexKey psIdxkey = psL.createIndex(MST_PURC_SCHD_R.$purc_schd_no);
		for (MCList<MST_PO_D_R> subPodL : podL.groupList(MST_PO_D_R.$po_no)) {
			MCNumber credAmt = MCNumber.ZERO;
			for (MST_PO_D_R podR : subPodL) {
				MST_PURC_SCHD_R psR = psL.getFirst(psIdxkey, podR.getStringNE("purc_schd_no"));
				if (isNull(psR)) {
					continue;
				}
				credAmt = credAmt.add(caclTrdCurIncTaxAmt(podR, psR));
			}
			
			if (!MCNumber.ZERO.eq(credAmt)) {
				Cred_Upd02_CndR cndR = Cred_Upd02_CndR.create();
				cndR.sppl_cd(subPodL.get(0).getStringNE("sppl_cd"));
				cndR.cur_cd(subPodL.get(0).getStringNE("trd_cur_cd"));
				if (bfUpdFlg) {
					cndR.amt(credAmt.negate());
				}
				else {
					cndR.amt(credAmt);
				}
				cndL.add(cndR);
			}
		}
		
		return cndL;
	}
	
	protected MCNumber caclTrdCurIncTaxAmt(MST_PO_D_R podR, MST_PURC_SCHD_R psR) {

		// 仕入予定残数量
		MCNumber baseUnitSchdRemQty = calcBaseUnitSchdRemQty(psR);

		MCNumber trdCurAmt = nvl(podR.trd_cur_amt(), MCNumber.ZERO);
		MCNumber trdCurTaxAmt = nvl(podR.trd_cur_tax_amt(), MCNumber.ZERO);
		MCNumber subTttlAmt = trdCurAmt.add(trdCurTaxAmt);

		if (isNull(podR.base_unit_qty()) || MCNumber.ZERO.eq(podR.base_unit_qty())) {
			return MCNumber.ZERO;
		}
		MCNumber credAmt = subTttlAmt.multiply(baseUnitSchdRemQty).divide(
				podR.base_unit_qty(), podR.getNumberNE("amt_dec_place").intValue(),
				MAC_RND_TYP.RNDOFF.toMC());

		if (podR.getBooleanNE("dscnt_itm_flg")) {
			return credAmt;
		}

		return credAmt.negate();
	}
	
	/**
	 * 仕入予定残数量を計算する
	 * 
	 * @param psR
	 * @return
	 */
	protected MCNumber calcBaseUnitSchdRemQty(MST_PURC_SCHD_R psR) {
		return nvl(psR.base_unit_schd_qty(), MCNumber.ZERO)
				.subtract(nvl(psR.base_unit_abort_qty(), MCNumber.ZERO))
				.subtract(nvl(psR.base_unit_purc_qty(), MCNumber.ZERO))
				.subtract(nvl(psR.base_unit_temp_purc_qty(), MCNumber.ZERO))
				.subtract(nvl(psR.base_unit_accpt_dfct_qty(), MCNumber.ZERO));
	}
	protected MCList<MST_PURC_SCHD_R> getBfPurcSchdL(
			MCList<MST_PURC_SCHD_R> psDbcL,
			MCList<MST_PURC_SCHD_R> credL) {

		if (isNull(credL)) {
return MCList.create(MST_PURC_SCHD_R.class);
		}
		
		MCIndexKey idxkey = psDbcL.createIndex(MST_PURC_SCHD_R.$purc_schd_no);
		MCList<MST_PURC_SCHD_R> bfPdL = MCList.create(MST_PURC_SCHD_R.class);
		
		for (MST_PURC_SCHD_R r : credL) {
			MST_PURC_SCHD_R bfR = psDbcL.getFirst(idxkey, r.purc_schd_no());
			if (isNull(bfR) || bfR.abort_flg() || bfR.cmpl_flg()) {
				continue;
			}
			bfPdL.add(bfR);
		}
		
		return bfPdL;
	}
	
	protected boolean isCredTgt() {
		if (getCo().ap_no_use_flg()) {
			return false;
		}
		return true;
	}

	//FMCB CUSTOM END
}