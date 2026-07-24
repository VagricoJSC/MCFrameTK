package mcframe.serverMSBE.MSBEL5300;

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
import mcframe.serverMSBE.MSBEL5300.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_ConstValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverMSBE.MSBEL5220.*;
import static mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil.*;
import static mcframe.serverMAUC.MAUCL1110.MAUCL_DptUtil.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_XfrActRcptIFService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_XfrActRcptIFService_MC extends MSBEL_XfrActRcptIFService_MC_A{
	//FMCB CUSTOM START

	/**
	 * XfrActIF_Chk01オペレーション.<p>
	 *
	 * 移動実績登録オペレーション用のチェック処理です。<br>
	 */
	public class XfrActIF_Chk01 extends MSBEL_XfrActRcptIFService_MC_A.XfrActIF_Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();

			// この時点でエラーがある場合は、以降の処理（チェック処理、および取込処理）を中断する
			if (!up0().err_flg()) {
				MCList<XfrActIF_HdrDtlR> l = up1().subList(XfrActIF_HdrDtlR.$err_flg, false);
				// 削除用チェック処理でエラーとならなかった行のみを登録・更新用チェックに渡すため、削除用チェックを先に実行する
				callXfrActChk02Service(l);
				callXfrActChk01Service(l);
			}
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			//ロック、更新カウンタチェック
			msgL.addAll(chkXfrAllocSts());
			lockXfrAllocSts();
			msgL.addAll(chkXfrInst());
			msgL.addAll(chkXfrAct());

			//補完
			cmplXfrAllocSts();
			cmplXfrActD();
			cmplNullStr();

			return msgL;
		}

		/**
		 * 移動引当状況のロック、更新カウンタチェック（新規、更新行が対象）
		 */
		protected MCMessageList chkXfrAllocSts() {
			MCMessageList msgL = new MCMessageList();
			MCList<XfrActIF_HdrDtlR> notErrL = getChkList(
					up1().subList(MCRow.CREATE, MCRow.MODIFY));
			if (notErrL.isEmpty()) {
				return msgL;
			}

			MCList<MST_XFR_ALLOC_STS_R> selectL = MCList.create(MST_XFR_ALLOC_STS_R.class);
			MST_XFR_ALLOC_STS_R t = MST_XFR_ALLOC_STS_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.xfr_alloc_sts_no, t.upd_cntr, t.abort_flg);
			selectL_bldr.setOrderByAsc(t.xfr_alloc_sts_no);

			MCList<XfrActIF_HdrDtlR> bindL = notErrL.groupBy(XfrActIF_HdrDtlR.$xfr_alloc_sts_no);
			bindL.sort(XfrActIF_HdrDtlR.$xfr_alloc_sts_no);
			
			// 更新カウンタチェック
			if (up0().upd_cntr_chk_flg()) {
				dbSelectKeyForUpdateNoWait("MSBEL5300_MST_XFR_ALLOC_STS_S01", selectL, selectL_bldr, bindL);
				MCIndexKey idxkey = selectL.createIndex(MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);
				for (XfrActIF_HdrDtlR r : notErrL) {
					MST_XFR_ALLOC_STS_R selectR = selectL.getFirst(idxkey, r.xfr_alloc_sts_no());
					if (!isNull(r.xfr_alloc_sts_no()) && !MAC_STR.isNULL_VAL(r.xfr_alloc_sts_no())) {
						msgL.addAll(checkUpdCntrNE(r, XfrActIF_HdrDtlR.$alloc_sts_upd_cntr, selectR));
					}
				}
			}
			// 更新カウンタチェック不要
			else {
				dbSelectKeyForUpdate("MSBEL5300_MST_XFR_ALLOC_STS_S02", selectL, selectL_bldr, bindL);
			}
			MCList<XfrActIF_HdrDtlR> updL = notErrL.subList(XfrActIF_HdrDtlR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
			if (updL.isEmpty()) {
				return msgL;
			}
			MCList<XfrActIF_HdrDtlR> bind2L = updL.groupBy(XfrActIF_HdrDtlR.$xfr_act_d_no);
			MCList<MST_XFR_ACT_D_R> actL = MCList.create(MST_XFR_ACT_D_R.class);
			MST_XFR_ACT_D_R t1 = MST_XFR_ACT_D_R.create("T1");
			MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(t);
			bind2L.forEach(bindR -> {
				MST_XFR_ACT_D_R actdR = MST_XFR_ACT_D_R.create();
				actdR.xfr_act_d_no(bindR.xfr_act_d_no());
				actL.add(actdR);
			});
			dbWkInsert("MSBEL5300_MSW_XFR_ACT_D_I01", actL, actL_bldr.getBaseDbc());

			MSW_XFR_ACT_D_KEY_R t4 = MSW_XFR_ACT_D_KEY_R.create("T4");

			MCList<MST_XFR_ALLOC_STS_R> select1L = MCList.create(MST_XFR_ALLOC_STS_R.class);
			MCQueryApiBuilder select1L_bldr = MCQueryApiBuilder.create(t);

			select1L_bldr.setSelect(t.abort_flg);
			select1L.addStringColumn("xfr_act_d_no");
			select1L_bldr.addSelect(t1.xfr_act_d_no);
			select1L_bldr.addInnerJoin(t1,bracket(t1.xfr_alloc_sts_no.eq(t.xfr_alloc_sts_no)));
			select1L_bldr.addInnerJoin(t4, bracket(t4.xfr_act_d_no.eq(t1.xfr_act_d_no)));
			select1L_bldr.setOrderByDesc(t.xfr_alloc_sts_no);
			dbSelectForUpdate("MSBEL5300_MST_XFR_ALLOC_STS_S01", select1L, select1L_bldr);

			MCIndexKey idx = select1L.createIndex("xfr_act_d_no");
			updL.forEach(r -> {
				MST_XFR_ALLOC_STS_R xasR = select1L.getFirst(idx, r.xfr_act_d_no());
				if (!isNull(xasR)) {
					r.abort_flg(xasR.abort_flg());
				}
			});
			dbWkDelete("MSBEL5300_MSW_XFR_ACT_D_D01", actL_bldr.getBaseDbc());
			return msgL;
		}
		/**
		 * 移動引当状況のロック（削除行が対象）
		 */
		protected void lockXfrAllocSts() {
			MCList<XfrActIF_HdrDtlR> notErrL = getChkList(up1().subList(MCRow.DELETE));
			if (notErrL.isEmpty()) {
				return;
			}

			MCList<XfrActIF_HdrDtlR> bindL = notErrL.groupBy(XfrActIF_HdrDtlR.$xfr_act_no);
			MCList<MST_XFR_ACT_R> actL = MCList.create(MST_XFR_ACT_R.class);
			bindL.forEach(bindR -> {
				MST_XFR_ACT_R actR = MST_XFR_ACT_R.create();
				actR.xfr_act_no(bindR.xfr_act_no());
				actL.add(actR);
			});
			MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(MST_XFR_ACT_R.create("T"));
			dbWkInsert("MSBEL5300_MSW_XFR_ACT_I01", actL, actL_bldr.getBaseDbc());

			MCList<MST_XFR_ALLOC_STS_R> selectL = MCList.create(MST_XFR_ALLOC_STS_R.class);
			MST_XFR_ALLOC_STS_R t3 = MST_XFR_ALLOC_STS_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t3);
			MST_XFR_ACT_D_R t1 = MST_XFR_ACT_D_R.create("T1");
			MSW_XFR_ACT_KEY_R t2 = MSW_XFR_ACT_KEY_R.create("T2");
			selectL_bldr.setSelect(t3.xfr_alloc_sts_no, t3.abort_flg);
			selectL.addStringColumn("xfr_act_no");
			selectL_bldr.addSelect(t1.xfr_act_no);
			selectL_bldr.addInnerJoin(t1,
					bracket(t1.xfr_alloc_sts_no.eq(t3.xfr_alloc_sts_no)));
			selectL_bldr.addInnerJoin(t2, bracket(t2.xfr_act_no.eq(t1.xfr_act_no)));
			selectL_bldr.setOrderByDesc(t3.abort_flg);
			dbSelectForUpdate("MSBEL5300_MST_XFR_ALLOC_STS_S03", selectL, selectL_bldr);
			
			dbWkDelete("MSBEL5300_MSW_XFR_ACT_D01", actL_bldr.getBaseDbc());

			MCIndexKey idx = selectL.createIndex("xfr_act_no");
			notErrL.forEach(r -> {
				MST_XFR_ALLOC_STS_R xasR = selectL.getFirst(idx, r.xfr_act_no());
				if (!isNull(xasR)) {
					// データ補完
					r.abort_flg(xasR.abort_flg());
				}
			});
		}
		
		/**
		 * 移動指図のロック、更新カウンタチェック（新規、更新行が対象）
		 */
		protected MCMessageList chkXfrInst() {
			MCMessageList msgL = new MCMessageList();
			MCList<XfrActIF_HdrDtlR> notErrL = getChkList(up1().subList(MCRow.CREATE, MCRow.MODIFY));
			if (notErrL.isEmpty()) {
				return msgL;
			}

			MCList<MST_XFR_INST_R> selectL = MCList.create(MST_XFR_INST_R.class);
			MST_XFR_INST_R t = MST_XFR_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.xfr_inst_no, t.upd_cntr);
			selectL_bldr.setOrderByAsc(t.xfr_inst_no);

			MCList<XfrActIF_HdrDtlR> bindL = notErrL.groupBy(XfrActIF_HdrDtlR.$xfr_inst_no);
			bindL.sort(XfrActIF_HdrDtlR.$xfr_inst_no);
			
			// 更新カウンタチェック
			if (up0().upd_cntr_chk_flg()) {
				dbSelectKeyForUpdateNoWait("MSBEL5300_MST_XFR_INST_S01",
						selectL, selectL_bldr, bindL);
				MCIndexKey idxkey = selectL.createIndex(MST_XFR_INST_R.$xfr_inst_no);
				for (XfrActIF_HdrDtlR r : notErrL) {
					MST_XFR_INST_R selectR = selectL.getFirst(idxkey, r.xfr_inst_no());
					if (!isNull(r.xfr_inst_no()) && !MAC_STR.isNULL_VAL(r.xfr_inst_no())) {
						msgL.addAll(checkUpdCntrNE(r, XfrActIF_HdrDtlR.$inst_upd_cntr, selectR));
					}
				}
			}
			// 更新カウンタチェック不要
			else {
				dbSelectKeyForUpdate("MSBEL5300_MST_XFR_INST_S02", selectL, selectL_bldr, bindL);
			}
			return msgL;
		}
		
		/**
		 * 移動実績のロック、更新カウンタチェック（更新・削除行が対象）
		 */
		protected MCMessageList chkXfrAct() {
			MCMessageList msgL = new MCMessageList();
			MCList<XfrActIF_HdrDtlR> notErrL = getChkList(up1().subList(MCRow.MODIFY, MCRow.DELETE));
			if (notErrL.isEmpty()) {
				return msgL;
			}

			MCList<MST_XFR_ACT_R> selectL = MCList.create(MST_XFR_ACT_R.class);
			MST_XFR_ACT_R t = MST_XFR_ACT_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.xfr_act_no, t.xfr_inst_no,
					t.trd_cd, t.trd_ptn_typ,
					t.gr_loc_cd,
					t.act_usr_cd, t.act_dpt_cd,
					t.intr_rmrks, t.trd_rmrks,
					t.sub_char1, t.sub_char2,
					t.sub_char3, t.upd_cntr);
			selectL_bldr.setOrderByAsc(t.xfr_act_no);

			MCList<XfrActIF_HdrDtlR> bindL = notErrL.groupBy(XfrActIF_HdrDtlR.$xfr_act_no);
			bindL.sort(XfrActIF_HdrDtlR.$xfr_act_no);

			// 更新カウンタチェック
			if (up0().upd_cntr_chk_flg()) {
				dbSelectKeyForUpdateNoWait("MSBEL5300_MST_XFR_ACT_S01", selectL, selectL_bldr, bindL);

				MCIndexKey idxkey = selectL.createIndex(MST_XFR_ACT_R.$xfr_act_no);
				for (XfrActIF_HdrDtlR r : notErrL) {
					MST_XFR_ACT_R selectR = selectL.getFirst(idxkey, r.xfr_act_no());
					msgL.addAll(checkUpdCntrNE(r, XfrActIF_HdrDtlR.$act_upd_cntr, selectR));
				}
			}
			// 更新カウンタチェック不要
			else {
				dbSelectKeyForUpdate("MSBEL5300_MST_XFR_ACT_S02", selectL, selectL_bldr, bindL);
			}
			
			// 更新のみ
			MCList<XfrActIF_HdrDtlR> updL =notErrL.subList(MCRow.MODIFY);			
			MCIndexKey idx = selectL.createIndex(MST_XFR_ACT_R.$xfr_act_no);
			updL.forEach(r -> {
				MST_XFR_ACT_R xaR = selectL.getFirst(idx, r.xfr_act_no());
				// データ補完
				r.xfr_inst_no(xaR.xfr_inst_no());
				r.trd_cd(xaR.trd_cd());			

				//電文で指定されていない場合はDB値を利用
				r.gr_loc_cd(nvl(r.gr_loc_cd(), xaR.gr_loc_cd()));
				
				//以下はxx更新ＦＬＧがオンの時、電文の値を使用する
				r.act_usr_cd(compVal(r.act_usr_cd_upd_flg(), r.act_usr_cd(), xaR.act_usr_cd(), null));
				r.act_dpt_cd(compVal(r.act_dpt_cd_upd_flg(), r.act_dpt_cd(), xaR.act_dpt_cd(), null));
				r.intr_rmrks(compVal(r.intr_rmrks_upd_flg(), r.intr_rmrks(), xaR.intr_rmrks(), null));
				r.trd_rmrks(compVal(r.trd_rmrks_upd_flg(), r.trd_rmrks(), xaR.trd_rmrks(), null));
				r.sub_char1(compVal(r.sub_char1_upd_flg(), r.sub_char1(), xaR.sub_char1(), null));
				r.sub_char2(compVal(r.sub_char2_upd_flg(), r.sub_char2(), xaR.sub_char2(), null));
				r.sub_char3(compVal(r.sub_char3_upd_flg(), r.sub_char3(), xaR.sub_char3(), null));
				}
			);	
			return msgL;
		}

		protected void cmplXfrAllocSts() {
			
			// 新規で移動引当状況ＮＯが設定されている場合のみ
			MCList<XfrActIF_HdrDtlR> insL = 
					up1().subList(r -> MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) 
											&& !isNull(r.xfr_alloc_sts_no()));
			if (!insL.isEmpty()) {
				insL.forEach(r -> {
					// データ補完
					MST_XFR_ALLOC_STS_R xasR = getXfrAllocStsR(r.xfr_alloc_sts_no());					
					r.trd_cd(xasR.trd_cd());
					r.itm_cd(xasR.getString("itm_cd"));
					r.itm_sub1(xasR.getString("itm_sub1"));
					r.itm_sub2(xasR.getString("itm_sub2"));
					r.itm_sub3(xasR.getString("itm_sub3"));
					if (!xasR.sno1_null_flg() || (!isNullOrNullVal(r.sno1()) && !isSame(r.sno1(), xasR.sno1()))) {
						r.sno1(xasR.alloc_sno1());
					}
					if (!xasR.sno2_null_flg() || (!isNullOrNullVal(r.sno2()) && !isSame(r.sno2(), xasR.sno2()))) {
						r.sno2(xasR.alloc_sno2());
					}
					if (!xasR.sno3_null_flg() || (!isNullOrNullVal(r.sno3()) && !isSame(r.sno3(), xasR.sno3()))) {
						r.sno3(xasR.alloc_sno3());
					}
					if (!xasR.sno4_null_flg() || (!isNullOrNullVal(r.sno4()) && !isSame(r.sno4(), xasR.sno4()))) {
						r.sno4(xasR.alloc_sno4());
					}
					
					//電文で指定されていない場合はDB値を利用
					r.gr_loc_cd(nvl(r.gr_loc_cd(), xasR.gr_loc_cd()));
					r.gi_loc_cd(nvl(r.gi_loc_cd(), xasR.gi_loc_cd()));
					r.gi_str_ln_cd(nvl(r.gi_str_ln_cd(), xasR.gi_str_ln_cd()));
					r.gr_str_ln_cd(nvl(r.gr_str_ln_cd(), xasR.gr_str_ln_cd()));
					r.lot_no(nvl(r.lot_no(), xasR.lot_no()));
					r.sublot_no(nvl(r.sublot_no(), xasR.sublot_no()));
					r.gd_cd(nvl(r.gd_cd(), xasR.gd_cd()));
					r.quality_typ(nvl(r.quality_typ(), xasR.quality_typ()));
					r.stk_insp_typ(nvl(r.stk_insp_typ(), xasR.stk_insp_typ()));
					r.stk_id_typ(nvl(r.stk_id_typ(), xasR.stk_id_typ()));
					r.stk_bp_cd(nvl(r.stk_bp_cd(), xasR.stk_bp_cd()));
				});
			}
		}
		
		
		protected void cmplXfrActD() {
			
			// 更新のみ
			MCList<XfrActIF_HdrDtlR> updL = up1().subList(MCRow.MODIFY);
			if (!updL.isEmpty()) {
				updL.forEach(r -> {
					// データ補完
					MST_XFR_ACT_D_R actDR = getXfrActDR(r.xfr_act_d_no());
					
					r.xfr_alloc_sts_no(actDR.xfr_alloc_sts_no());	
					r.xfr_inst_d_no(actDR.xfr_inst_d_no());
					r.itm_cd(actDR.itm_cd());
					r.itm_sub1(actDR.itm_sub1());
					r.itm_sub2(actDR.itm_sub2());
					r.itm_sub3(actDR.itm_sub3());
					MST_XFR_ALLOC_STS_R xasR = getXfrAllocStsR(r.xfr_alloc_sts_no());
					if (isPlanned(xasR)) {
						if (!xasR.sno1_null_flg() || (!isNullOrNullVal(r.sno1()) && !isSame(r.sno1(), xasR.sno1()))) {
							r.sno1(xasR.alloc_sno1());
						}
						if (!xasR.sno2_null_flg() || (!isNullOrNullVal(r.sno2()) && !isSame(r.sno2(), xasR.sno2()))) {
							r.sno2(xasR.alloc_sno2());
						}
						if (!xasR.sno3_null_flg() || (!isNullOrNullVal(r.sno3()) && !isSame(r.sno3(), xasR.sno3()))) {
							r.sno3(xasR.alloc_sno3());
						}
						if (!xasR.sno4_null_flg() || (!isNullOrNullVal(r.sno4()) && !isSame(r.sno4(), xasR.sno4()))) {
							r.sno4(xasR.alloc_sno4());
						}
					}
					//電文で指定されていない場合はDB値を利用
					r.gi_loc_cd(nvl(r.gi_loc_cd(), actDR.gi_loc_cd()));
					r.gi_str_ln_cd(nvl(r.gi_str_ln_cd(), actDR.gi_str_ln_cd()));
					r.gr_str_ln_cd(nvl(r.gr_str_ln_cd(), actDR.gr_str_ln_cd()));
					r.lot_no(nvl(r.lot_no(), actDR.lot_no()));
					r.sublot_no(nvl(r.sublot_no(), actDR.sublot_no()));
					r.gd_cd(nvl(r.gd_cd(), actDR.gd_cd()));
					r.quality_typ(nvl(r.quality_typ(), actDR.quality_typ()));
					r.stk_insp_typ(nvl(r.stk_insp_typ(), actDR.stk_insp_typ()));
					r.stk_id_typ(nvl(r.stk_id_typ(), actDR.stk_id_typ()));
					r.stk_bp_cd(nvl(r.stk_bp_cd(), actDR.stk_bp_cd()));
					
					//以下はxx更新ＦＬＧがオンの時、電文の値を使用する
					r.intr_d_rmrks(compVal(r.intr_d_rmrks_upd_flg(), r.intr_d_rmrks(), actDR.intr_d_rmrks(), null));
					r.trd_d_rmrks(compVal(r.trd_d_rmrks_upd_flg(), r.trd_d_rmrks(), actDR.trd_d_rmrks(), null));
					r.sub_char1(compVal(r.sub_char1_upd_flg(), r.sub_char1(), actDR.sub_char1(), null));
					r.sub_char2(compVal(r.sub_char2_upd_flg(), r.sub_char2(), actDR.sub_char2(), null));
					r.sub_char3(compVal(r.sub_char3_upd_flg(), r.sub_char3(), actDR.sub_char3(), null));
				});
			}

			// NULLに対する補完
			for (XfrActIF_HdrDtlR r : up1()) {
				if (isNull(r.xfr_alloc_sts_no())
					&& MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
					&& isNull(r.trd_cd())
					&& !isNull(r.trd_ptn_typ())) {
					MAM_TRD_R trdR = getDefTrdR(r.trd_ptn_typ());
					if (!isNull(trdR)) {
						r.trd_cd(trdR.trd_cd());
					}
				}
				r.gr_str_ln_cd(nvl(r.gr_str_ln_cd(), MAC_STR.NULL_VAL.value()));
				r.gi_str_ln_cd(nvl(r.gi_str_ln_cd(), MAC_STR.NULL_VAL.value()));
				r.itm_sub1(nvl(r.itm_sub1(), MAC_STR.NULL_VAL.value()));
				r.itm_sub2(nvl(r.itm_sub2(), MAC_STR.NULL_VAL.value()));
				r.itm_sub3(nvl(r.itm_sub3(), MAC_STR.NULL_VAL.value()));
				r.sno1(nvl(r.sno1(), MAC_STR.NULL_VAL.value()));
				r.sno2(nvl(r.sno2(), MAC_STR.NULL_VAL.value()));
				r.sno3(nvl(r.sno3(), MAC_STR.NULL_VAL.value()));
				r.sno4(nvl(r.sno4(), MAC_STR.NULL_VAL.value()));
				r.gr_stk_arrv_bp_cd(nvl(r.gr_stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value()));
				r.gi_stk_arrv_bp_cd(nvl(r.gi_stk_arrv_bp_cd(), MAC_STR.NULL_VAL.value()));
				r.gd_cd(nvl(r.gd_cd(), getDefaultFeedStkGd().gd_cd()));
				r.stk_bp_cd(nvl(r.stk_bp_cd(), MAC_STR.NULL_VAL.value()));
			}
		}
		
		protected void cmplNullStr() {

			// NULLに対する補完
			// 削除でない場合のみ
			for (XfrActIF_HdrDtlR r : up1().subList(MCRow.CREATE, MCRow.MODIFY)) {
				if (isNull(r.xfr_alloc_sts_no())
					&& MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
					&& isNull(r.trd_cd())
					&& !isNull(r.trd_ptn_typ())) {
					MAM_TRD_R trdR = getDefTrdR(r.trd_ptn_typ());
					if (!isNull(trdR)) {
						r.trd_cd(trdR.trd_cd());
					}
				}
				
				r.gr_str_ln_cd(nvl(r.gr_str_ln_cd(), MAC_STR.NULL_VAL.value()));
				r.gi_str_ln_cd(nvl(r.gi_str_ln_cd(), MAC_STR.NULL_VAL.value()));
				r.itm_sub1(nvl(r.itm_sub1(), MAC_STR.NULL_VAL.value()));
				r.itm_sub2(nvl(r.itm_sub2(), MAC_STR.NULL_VAL.value()));
				r.itm_sub3(nvl(r.itm_sub3(), MAC_STR.NULL_VAL.value()));
				r.lot_no(nvl(r.lot_no(), MAC_STR.NULL_VAL.value()));
				r.sublot_no(nvl(r.sublot_no(), MAC_STR.NULL_VAL.value()));
				r.sno1(nvl(r.sno1(), MAC_STR.NULL_VAL.value()));
				r.sno2(nvl(r.sno2(), MAC_STR.NULL_VAL.value()));
				r.sno3(nvl(r.sno3(), MAC_STR.NULL_VAL.value()));
				r.sno4(nvl(r.sno4(), MAC_STR.NULL_VAL.value()));
				r.gd_cd(nvl(r.gd_cd(), getDefaultFeedStkGd().gd_cd()));
				r.quality_typ(nvl(r.quality_typ(), MAC_QUALITY_TYP.GOOD.value()));
				r.stk_insp_typ(nvl(r.stk_insp_typ(), MSC_STK_INSP_TYP.FIN.value()));
				r.stk_id_typ(nvl(r.stk_id_typ(), MSC_STK_ID_TYP.COSTK.value()));
			}
		}
		
		/**
		 * 更新ＦＬＧに従い、上り電文の値、または、更新前の値を更新結果に決めます。
		 */
		private String compVal(boolean updFlg, String upVal, String dbVal, String defVal) {
			if (updFlg){
				return nvl(upVal, defVal);
			}
			return dbVal;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<XfrActIF_HdrDtlR> notErrL = getChkList(up1());
			
			// 条件付妥当性チェック
			msgL.addAll(chkValid());
			if (!up0().is_src_batch_flg()) {
				// DACチェック
				MCList<MST_XFR_ACT_D_R> delActDL = MCList.create(MST_XFR_ACT_D_R.class);
				MST_XFR_ACT_D_R t = MST_XFR_ACT_D_R.create("T");
				MCQueryApiBuilder delActDL_bldr = MCQueryApiBuilder.create(t);
				delActDL_bldr.setWhere(t.xfr_act_no.eq(bind("xfr_act_no")));
				dbSelect("MSBEL5300_MST_XFR_ACT_D_S01",
						delActDL, delActDL_bldr, notErrL.subList(MCRow.DELETE));
				MCIndexKey actDIdx = delActDL.createIndex(MST_XFR_ACT_D_R.$xfr_act_no);
				
				for (XfrActIF_HdrDtlR r : notErrL) {
					MCMessageList msgDacLgL = checkWritableLgGrpCdDac(r, XfrActIF_HdrDtlR.$lg_grp_cd);
					MCMessageList msgDacGiL;
					if (r.isStatusDelete()) {
						MCList<MST_XFR_ACT_D_R> dL = delActDL.subList(actDIdx, r.xfr_act_no());
						msgDacGiL = checkWritableLocCdDac(dL, MST_XFR_ACT_D_R.$gi_loc_cd);
					}
					else {
						msgDacGiL = checkWritableLocCdDac(r, XfrActIF_HdrDtlR.$gi_loc_cd);
					}
					if (!msgDacLgL.isEmpty() && !msgDacGiL.isEmpty()) {
						msgL.addAll(msgDacLgL);
						msgL.addAll(msgDacGiL);
					}
				}
			}
			
			for (XfrActIF_HdrDtlR r : notErrL) {

				// 取消で打切られている場合
				if ((r.isStatusDelete() || r.isStatusModify()
						&& MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) && r.abort_flg() && !isNullOrNullVal(r.xfr_inst_no())) {
					msgL.add(new MCMessage(r, null, MSBEL0030, toDispGUIIndex(r)));
				}
				// 取消や更新対象外の場合、以下のチェック処理は不要
				if (r.isStatusDelete() || r.isStatusNone()) {
					continue;
				}

				msgL.addAll(checkStkUtilTrdPtnTypAndGiGrLoc(
						r,
						XfrActIF_HdrDtlR.$trd_cd,
						XfrActIF_HdrDtlR.$trd_ptn_typ,
						XfrActIF_HdrDtlR.$gi_loc_cd,
						XfrActIF_HdrDtlR.$gi_sppl_cd,
						XfrActIF_HdrDtlR.$gr_loc_cd,
						XfrActIF_HdrDtlR.$gr_sppl_cd));

				if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
					r.lot_no(null);
				}
				if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
					r.sublot_no(null);
				}

				msgL.addAll(checkDecPlace(
						r,
						r.trd_unit_dec_place().intValue(),
						XfrActIF_HdrDtlR.$trd_unit_qty));

				if (isSame(r.trd_unit_cd(), r.base_unit_cd())) {
					r.base_unit_qty(r.trd_unit_qty());
				}
				else {
					r.base_unit_qty(convToBaseUnit(r.trd_unit_qty(),
							r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(),
							r.base_unit_dec_place(), r.base_unit_rnd_typ()));
				}

				if (isNull(r.gr_str_ln_cd())) {
					r.gr_str_ln_cd(MAC_STR.NULL_VAL.value());
				}

				if (isNull(r.gi_str_ln_cd())) {
					r.gi_str_ln_cd(MAC_STR.NULL_VAL.value());
				}

				if(!isSame(r.lg_grp_cd(), r.gi_lg_grp_cd())) {
					msgL.add(new MCMessage(r, XfrActIF_HdrDtlR.$gi_loc_cd, MSBEL0060,
							r.gi_loc_cd(),
							r.gr_loc_cd(),
							toDispGUIIndex(r)));
				}

				if(!isNullOr(r.gr_str_ln_cd(), r.gi_str_ln_cd())
						&& isSame(r.gr_loc_cd(), r.gi_loc_cd())
						&& isSame(r.gr_str_ln_cd(), r.gi_str_ln_cd())) {
					msgL.add(new MCMessage(r, XfrActIF_HdrDtlR.$gi_loc_cd, MSBEL0254, toDispGUIIndex(r)));
				}

				MST_XFR_ALLOC_STS_R xasR = getXfrAllocStsR(r.xfr_alloc_sts_no());
				if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())
						&& MAC_PROV_TYP.isONR_PROV(xasR.getStringNE("INST_RET_PROV_TYP"))
						&& MAC_PROV_BASIS_TYP.isINPT(xasR.getStringNE("INST_RET_PROV_BASIS_TYP")) ) {
					// 支給返品かつ支給区分が「有償支給」支給計上区分が「使用基準」の場合、出庫在庫着荷先ＣＤに*を設定する
					r.gi_stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.gi_sppl_cd())) {
					r.gi_stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				}
				else {
					// 支給返品または直送支給の場合
					msgL.addAll(check(r, XfrActIF_HdrDtlR.$gi_stk_arrv_bp_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, XfrActIF_HdrDtlR.$stk_id_typ, new FXUCL_RequiredValidater()));
				}
				if (!MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					if (!isNull(r.base_dlv_slip_no())
							|| !isNull(r.base_prov_act_no())
							|| !isNull(r.base_ac_dt())) {
						msgL.add(new MCMessage(r, null, MSBEL1106, toDispGUIIndex(r)));
					}
				}

				if (isNull(r.quality_typ())) {
					r.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				}
				msgL.addAll(checkStkUtilQualityTyp(
						r,
						XfrActIF_HdrDtlR.$trd_cd,
						XfrActIF_HdrDtlR.$trd_ptn_typ,
						XfrActIF_HdrDtlR.$quality_typ));

				if (isNull(r.gd_cd())) {
					r.gd_cd(getDefaultFeedStkGd().gd_cd());
				}

				if(isNull(r.stk_insp_typ())) {
					r.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				}
				if(!MSC_STK_INSP_TYP.isFIN(r.stk_insp_typ())
						&& !isSame(r.gr_site_cd(), r.gi_site_cd())) {
					msgL.add(new MCMessage(r, null, MSBEL0224, r.gr_site_cd(), r.gi_site_cd()));
				}

				if (isNull(r.sno1())) {
					r.sno1(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.sno2())) {
					r.sno2(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.sno3())) {
					r.sno3(MAC_STR.NULL_VAL.value());
				}
				if (isNull(r.sno4())) {
					r.sno4(MAC_STR.NULL_VAL.value());
				}

				if (isNull(r.stk_id_typ())) {
					r.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				}
				msgL.addAll(checkStkUtilStkIdTyp(r,
						XfrActIF_HdrDtlR.$gi_loc_cd,
						XfrActIF_HdrDtlR.$gi_sppl_cd,
						XfrActIF_HdrDtlR.$gr_loc_cd,
						XfrActIF_HdrDtlR.$gr_sppl_cd,
						null,
						XfrActIF_HdrDtlR.$stk_id_typ,
						true,
						false));

				if(MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
					r.stk_bp_cd(MAC_STR.NULL_VAL.value());
				}
				else if(MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
					r.stk_bp_cd(r.gi_sppl_cd());
				}
				else {
					msgL.addAll(check(r, XfrActIF_HdrDtlR.$stk_bp_cd, new FXUCL_RequiredValidater()));
				}

				if (r.acxfr_gi_flg()) {
					msgL.addAll(check(r, XfrActIF_HdrDtlR.$bd_dpt_cd, new FXUCL_RequiredValidater()));
				}
				else {
					r.bd_dpt_cd(null);
				}

				if(MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
					if(MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
						r.ret_prov_typ(MAC_PROV_TYP.ONR_PROV.value());
					}
					else if(MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())
							&& isNullOrNullVal(r.gi_stk_arrv_bp_cd())) {
						r.ret_prov_typ(MAC_PROV_TYP.ONR_PROV.value());
					}
					else {
						r.ret_prov_typ(MAC_PROV_TYP.FFR_PROV.value());
					}
				}

				msgL.addAll(checkStkUtilProvTyp(
						r,
						XfrActIF_HdrDtlR.$itm_cd,
						XfrActIF_HdrDtlR.$itm_sub1,
						XfrActIF_HdrDtlR.$itm_sub2,
						XfrActIF_HdrDtlR.$itm_sub3,
						XfrActIF_HdrDtlR.$gr_sppl_cd,
						XfrActIF_HdrDtlR.$gr_onr_prsppl_flg,
						XfrActIF_HdrDtlR.$asset_mng_typ,
						XfrActIF_HdrDtlR.$prov_typ));
			}

			//基準単位数量の補完
			cmplBaseUnitQty(notErrL);
			msgL.addAll(checkBpStop(notErrL));
			msgL.addAll(checkItmStop(notErrL));
			
			return msgL;
		}

		protected void cmplBaseUnitQty(MCList<XfrActIF_HdrDtlR> notErrL) {
			for (XfrActIF_HdrDtlR r : notErrL) {

				// 取消や更新対象外の場合、以下の処理は不要
				if (r.isStatusDelete() || r.isStatusNone()) {
					continue;
				}

				r.base_unit_qty(
					convToBaseUnit(
						r.trd_unit_qty(), r.trd_unit_conv_base_qty() , r.trd_unit_conv_qty(),
						r.base_unit_dec_place(), r.base_unit_rnd_typ())
				);
			}
		}

		/**
		 * 条件付妥当性チェック
		 */
		protected MCMessageList chkValid() {
			MCMessageList msgL = new MCMessageList();
			//電文のステータスがNONEの場合は、移動実績ＮＯ、移動実績明細ＮＯ、データ更新区分の組み合わせが不正
			for (XfrActIF_HdrDtlR r : up1().subList(MCRow.NONE)) {
				msgL.add(new MCMessage(r, null, MSBEL0201, r.xfr_act_no(), r.xfr_act_d_no(), r.data_crud_typ()));
			}

			MCList<XfrActIF_HdrDtlR> notErrL = getChkList(up1());
			for (XfrActIF_HdrDtlR r : notErrL) {
				if (isNull(r.xfr_alloc_sts_no())
					&& MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
					&& isNull(r.trd_cd())
					&& !isNull(r.trd_ptn_typ())) {
					if (isNull(getDefTrdR(r.trd_ptn_typ()))) {
						msgL.add(new MCMessage(r, null, MSBEL0252, r.trd_ptn_typ(), toDispGUIIndex(r)));
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 移動実績サービス登録・更新用チェック処理実行
		 */
		protected void callXfrActChk01Service(MCList<XfrActIF_HdrDtlR> list) {
			
			// 新規、更新が対象
			MCList<XfrActIF_HdrDtlR> updL = list.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			if (updL.isEmpty()) {
				return;
			}
			
			MSBEL_XfrActService.XfrAct_Chk01 chkOpe = MSBEL_XfrActService.crtXfrAct_Chk01();
			setAll(chkOpe.up0(), list, createMap_XfrActChk_HdrDtlR_XfrActIF_HdrDtlR());
			// 削除用チェックでエラーとならなかった削除行をup1に設定する（マイナス在庫チェック時に使用可能在庫として扱われる）
			MCList<XfrActIF_HdrDtlR> delL = list.subList(r -> MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && !r.err_flg());
			setAll(chkOpe.up1(), delL, createMap_XfrActChk_DelDtlR_XfrActIF_HdrDtlR());
			chkOpe.up1();
			chkOpe.exec();

			copyErrFlg(list, chkOpe.down0());
		}

		/**
		 * 移動実績サービス削除用チェック処理実行
		 */
		protected void callXfrActChk02Service(MCList<XfrActIF_HdrDtlR> list) {
			
			// 削除が対象
			MCList<XfrActIF_HdrDtlR> delL = list.subList(r -> MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			if (delL.isEmpty()) {
				return;
			}
			
			MSBEL_XfrActService.XfrAct_Chk02 chkOpe = MSBEL_XfrActService.crtXfrAct_Chk02();
			setAll(chkOpe.up0(), list, createMap_XfrActChk_HdrDtlR_XfrActIF_HdrDtlR());
			chkOpe.exec();

			copyErrFlg(list, chkOpe.down0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().err_flg(up0().err_flg());
			down1().setAll(up1());
		}	

		protected boolean isPlanned(MST_XFR_ALLOC_STS_R xasR) {
			if (!xasR.isEmpty()) {
				return true;
			}
			return false;
		}
	}
	protected FXUCL_MCDbcCache<MAM_ITM_STOP_R> _itmStopL;
	protected FXUCL_MCDbcCache<MAM_BP_STOP_R> _bpStopL;

	protected void initBpStopR(MCList<XfrActIF_HdrDtlR> notErrL) {
		// 取引先禁止マスタの取得
		_bpStopL = new FXUCL_MCDbcCache<MAM_BP_STOP_R>(MCQueryApiBuilder.create(MAM_BP_STOP_R.create("T")),
				notErrL.groupBy(XfrActIF_HdrDtlR.$gr_sppl_cd), XfrActIF_HdrDtlR.$gr_sppl_cd);
	}

	protected void initItmStopL(MCList<XfrActIF_HdrDtlR> notErrL) {
		// 品目禁止マスタの取得
		_itmStopL = new FXUCL_MCDbcCache<MAM_ITM_STOP_R>(
				MCQueryApiBuilder.create(MAM_ITM_STOP_R.create("T")),
				notErrL.groupBy(XfrActIF_HdrDtlR.$itm_cd, XfrActIF_HdrDtlR.$itm_sub1, XfrActIF_HdrDtlR.$itm_sub2, XfrActIF_HdrDtlR.$itm_sub3),
				XfrActIF_HdrDtlR.$itm_cd,
				XfrActIF_HdrDtlR.$itm_sub1,
				XfrActIF_HdrDtlR.$itm_sub2,
				XfrActIF_HdrDtlR.$itm_sub3);
	}
	
	protected MCMessageList checkBpStop(MCList<XfrActIF_HdrDtlR> notErrL) {
		MCMessageList msgL = new MCMessageList();

		initBpStopR(notErrL);
		
		for(XfrActIF_HdrDtlR r : notErrL) {
			
			// 取消の場合、以下の処理は不要
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				continue;
			}

			MAM_BP_STOP_R bpStopR = _bpStopL.get(r.gr_sppl_cd());
			if(!isNull(bpStopR.xfr_stop_dt()) && bpStopR.xfr_stop_dt().lte(r.xfr_dt())) {
				msgL.add(new MCMessage(
						r,
						XfrActIF_HdrDtlR.$gr_loc_cd,
						MSBEL0289,
						r.gr_sppl_cd(),
						toDispGUIIndex(r)));
			}
		}
		
		return msgL;
	}

	protected MCMessageList checkItmStop(MCList<XfrActIF_HdrDtlR> notErrL) {
		MCMessageList msgL = new MCMessageList();

		initItmStopL(notErrL);
		for(XfrActIF_HdrDtlR r : notErrL) {
			
			// 取消の場合、以下の処理は不要
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				continue;
			}

			MAM_ITM_STOP_R itmStopR = _itmStopL.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			if(!isNull(itmStopR.xfr_stop_dt()) && itmStopR.xfr_stop_dt().lte(r.xfr_dt())) {
				msgL.add(new MCMessage(
						r,
						XfrActIF_HdrDtlR.$itm_cd,
						MSBEL0288,
						toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
						toDispGUIIndex(r)));
			}
		}
		return msgL;
	}
	
	/**
	 * XfrActIF_Upd01オペレーション.<p>
	 *
	 * 外部システムから移動実績の登録、更新、取消を行います。<br>
	 */
	public class XfrActIF_Upd01 extends MSBEL_XfrActRcptIFService_MC_A.XfrActIF_Upd01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess();
			}
			catch (Exception e) {
				if (up0().is_src_batch_flg()) {
					// バッチ実行の場合は呼出元でハンドリングする
					throw e;
				}
				handleEx(e);
			}
			finally {
				setDown();
			}
		}
		
		@Override
		protected void doIt() {
			editUp();
			callThisChk01();

			if (up0().err_flg() || MAC_IF_UPD_TYP.isALL_ERROR(up0().if_upd_typ())) {
				throwOpeErr();
			}

			MCList<XfrActIF_HdrDtlR> l = MCList.create(XfrActIF_HdrDtlR.class);
			if (MAC_IF_UPD_TYP.isSKIP_ERROR(up0().if_upd_typ())) {
				l = up1().subList(XfrActIF_HdrDtlR.$err_flg, false);
			}
			else if (MAC_IF_UPD_TYP.isSTOP_ERROR(up0().if_upd_typ())) {
				for (XfrActIF_HdrDtlR r : up1()) {
					if (r.err_flg()) {
						break;
					}
					l.add(r);
				}
			}
			callXfrActService(l);
		}

		protected void editUp() {
			// キャッシュ
			initXfrAllocStsCache(up1());
			initXfrInstDCache(up1());
			initXfrActCache(up1());
			initXfrActDCache(up1());
			
			for (XfrActIF_HdrDtlR r : up1()) {

				if (!isNull(r.xfr_act_no())){
					if (!isNull(r.xfr_act_d_no())){
						if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())
								|| MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
							//更新（更新）、更新（明細削除）
							r.setStatus(MCRow.MODIFY);

							// 移動指図ＮＯ補完（移動指図ロック用）
							if (isNull(r.xfr_inst_no())) {
								MST_XFR_ACT_R xaR = getXfrActR(r.xfr_act_no());
								r.xfr_inst_no(xaR.xfr_inst_no());
							}
							//取引明細備考補完
							MST_XFR_ACT_D_R xadR = getXfrActDR(r.xfr_act_d_no());
							r.trd_d_rmrks(xadR.trd_d_rmrks());
						}
						else {
							//電文が不正
							r.setStatus(MCRow.NONE);
							r.err_flg(true);
						}
					}
					else {
						if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
							//更新（明細追加）
							r.setStatus(MCRow.MODIFY);
							
							// 移動指図ＮＯ補完（移動指図ロック用）
							if (isNull(r.xfr_inst_no())) {
								MST_XFR_ACT_R xaR = getXfrActR(r.xfr_act_no());
								r.xfr_inst_no(xaR.xfr_inst_no());
							}
						}
						else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
							//削除（ヘッダ削除）
							r.setStatus(MCRow.DELETE);
						}
						else{
							//電文が不正
							r.setStatus(MCRow.NONE);
							r.err_flg(true);
						}
					}
				}
				else {
					if (!isNull(r.xfr_act_d_no())){
						//電文が不正
						r.setStatus(MCRow.NONE);
						r.err_flg(true);
					}
					else {
						if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
							//追加（新規）
							r.setStatus(MCRow.CREATE);

							// 移動指図ＮＯ補完（移動指図ロック用）
							if (isNull(r.xfr_inst_no())) {
								MST_XFR_INST_D_R xidR = getXfrInstDR(r.xfr_inst_d_no());
								r.xfr_inst_no(xidR.xfr_inst_no());
							}
						}
						else {
							//電文が不正
							r.setStatus(MCRow.NONE);
							r.err_flg(true);
						}
					}
				}
				//新部門の補完
				setDpt(r, XfrActIF_HdrDtlR.$bd_dpt_cd, "ac_dt");
			}
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBEL_XfrActRcptIFService.XfrActIF_Chk01 ope = MSBEL_XfrActRcptIFService.crtXfrActIF_Chk01();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
			up0().err_flg(ope.down0().err_flg());
			up1().setAll(ope.down1());
		}

		/**
		 * 移動実績サービス更新処理実行
		 */
		protected void callXfrActService(MCList<XfrActIF_HdrDtlR> list) {
			MCIndexKey actIdx = list.createIndex(XfrActIF_HdrDtlR.$peg_no);
			for (XfrActIF_HdrDtlR r : up1()) {
				if (isNull(list.getFirst(actIdx, r.peg_no()))) {
					r.rtn_sts_typ(r.err_flg() ? MAC_RTN_STS_TYP.ERR.value() : MAC_RTN_STS_TYP.NOT_EXE.value());
				}
			}

			if (list.isEmpty()) return;	

			MCList<XfrActIF_HdrDtlR> insL = list.subList(MCRow.CREATE);
			MCList<XfrActIF_HdrDtlR> updL = list.subList(MCRow.MODIFY);
			MCList<XfrActIF_HdrDtlR> delL = list.subList(MCRow.DELETE);
			
			MCList<XfrActIF_HdrDtlR> updLIncludedInDelL = getUpdLIncludedInDelL(updL, delL);
			updL.removeAll(updLIncludedInDelL);

			if (!insL.isEmpty()) {
				MSBEL_XfrActService.XfrAct_Ins01 insOpe = MSBEL_XfrActService.crtXfrAct_Ins01();
				insOpe.up1().agg_gi_loc_flg(up0().agg_gi_loc_flg());
				setAll(insOpe.up0(), insL, createMap_XfrAct_HdrDtlR_XfrActIF_HdrDtlR());
				insOpe.exec();
				insL.setString(XfrActIF_HdrDtlR.$rtn_sts_typ, MAC_RTN_STS_TYP.OK.value());
			}
			if (!updL.isEmpty()) {
				MSBEL_XfrActService.XfrAct_Upd01 updOpe = MSBEL_XfrActService.crtXfrAct_Upd01();
				setAll(updOpe.up0(), updL, createMap_XfrAct_HdrDtlR_XfrActIF_HdrDtlR());
				updOpe.exec();
				updL.setString(XfrActIF_HdrDtlR.$rtn_sts_typ, MAC_RTN_STS_TYP.OK.value());
			}
			if (!delL.isEmpty()) {
				MSBEL_XfrActService.XfrAct_Del01 delOpe = MSBEL_XfrActService.crtXfrAct_Del01();
				setAll(delOpe.up0(), delL, createMap_XfrAct_HdrDtlR_XfrActIF_HdrDtlR());
				delOpe.exec();
				delL.setString(XfrActIF_HdrDtlR.$rtn_sts_typ, MAC_RTN_STS_TYP.OK.value());
				updLIncludedInDelL.setString(XfrActIF_HdrDtlR.$rtn_sts_typ, MAC_RTN_STS_TYP.OK.value());
			}
			
		}
		
		protected MCList<XfrActIF_HdrDtlR> getUpdLIncludedInDelL(MCList<XfrActIF_HdrDtlR> updL, MCList<XfrActIF_HdrDtlR> delL) {
			MCList<XfrActIF_HdrDtlR> includedL = MCList.create(XfrActIF_HdrDtlR.class);
			MCIndexKey updKey = updL.createIndex(XfrActIF_HdrDtlR.$xfr_act_no);
			for (XfrActIF_HdrDtlR delR : delL) {
				includedL.addAll(updL.subList(updKey, delR.xfr_act_no()));
			}
			return includedL;
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up1());
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
		}

		protected void throwOpeErr() {
			throwErr(msgOpeErr());
		}
	}

	// ///////////////////////////////////////////////
	// キャッシュ（ここから）
	// ///////////////////////////////////////////////
	protected static final Class<MSBEL_XfrActRcptIFService> CLAZZ = MSBEL_XfrActRcptIFService.class;

	/**
	 * MST_XFR_ALLOC_STSキャッシュ
	 */
	protected static void initXfrAllocStsCache(MCList<XfrActIF_HdrDtlR> list) {
		object(CLAZZ)._initXfrAllocStsCache(list);
	}
	protected FXUCL_MCDbcCache<MST_XFR_ALLOC_STS_R> _xfrAllocStsCache = null;
	protected void _initXfrAllocStsCache(MCList<?> list) {
		MCList<MST_XFR_ALLOC_STS_R> dbc = MCList.create(MST_XFR_ALLOC_STS_R.class);
		MST_XFR_ALLOC_STS_R t = MST_XFR_ALLOC_STS_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MST_XFR_SCHD_R t2 = MST_XFR_SCHD_R.create("T2");
		MST_XFR_INST_D_R t3 = MST_XFR_INST_D_R.create("T3");
		MST_PROV_SCHD_R t4 = MST_PROV_SCHD_R.create("T4");
		MAM_LOC_R m1 = MAM_LOC_R.create("M1");
		dbc.addStringColumn("itm_cd");
		dbc.addStringColumn("itm_sub1");
		dbc.addStringColumn("itm_sub2");
		dbc.addStringColumn("itm_sub3");
		dbc_bldr.addSelect(coalesce( t3.itm_cd, t2.itm_cd).as("itm_cd"));
		dbc_bldr.addSelect(coalesce( t3.itm_sub1, t2.itm_sub1).as("itm_sub1"));
		dbc_bldr.addSelect(coalesce( t3.itm_sub2, t2.itm_sub2).as("itm_sub2"));
		dbc_bldr.addSelect(coalesce( t3.itm_sub3, t2.itm_sub3).as("itm_sub3"));
		dbc_bldr.addLeftOuterJoin(t2, bracket( t.xfr_schd_no.eq(t2.xfr_schd_no)));
		dbc_bldr.addLeftOuterJoin(t3, bracket( t.xfr_inst_d_no.eq(t3.xfr_inst_d_no)));
		dbc_bldr.addSelect(nvl( t4.prov_typ, nvl2( m1.sppl_cd, value(MAC_PROV_TYP.ONR_PROV.value()), nullValue() )).as("inst_ret_prov_typ"));
		dbc_bldr.addSelect(nvl( t4.prov_basis_typ, nvl2( m1.sppl_cd, decode( t4.prov_typ, value(MAC_PROV_TYP.FFR_PROV.value()),
				nullValue(), value(MAC_PROV_BASIS_TYP.INPT.value()) ), nullValue() )).as("inst_ret_prov_basis_typ"));
		dbc_bldr.addLeftOuterJoin(t4, bracket( t.xfr_alloc_sts_no.eq(t4.prov_src_schd_no1)
				.and(t4.prov_src_schd_typ.eq(value(MSC_PROV_SRC_SCHD_TYP.XFR.value())))
				.and(t4.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))));
		dbc_bldr.addLeftOuterJoin(m1, bracket( m1.loc_cd.eq(t.gi_loc_cd)));
		_xfrAllocStsCache = new FXUCL_MCDbcCache<MST_XFR_ALLOC_STS_R>(dbc, dbc_bldr, list, MST_XFR_ALLOC_STS_R.$xfr_alloc_sts_no);
	}
	protected static FXUCL_MCDbcCache<MST_XFR_ALLOC_STS_R> getXfrAllocStsCache() {
		return object(CLAZZ)._xfrAllocStsCache;
	}
	protected static MST_XFR_ALLOC_STS_R getXfrAllocStsR(String xfrAllocStsNo) {
		return getXfrAllocStsCache().get(xfrAllocStsNo);
	}

	/**
	 * MST_XFR_INST_Dキャッシュ
	 */
	protected static void initXfrInstDCache(MCList<XfrActIF_HdrDtlR> list) {
		object(CLAZZ)._initXfrInstDCache(list);
	}
	protected FXUCL_MCDbcCache<MST_XFR_INST_D_R> _xfrInstDCache = null;
	protected void _initXfrInstDCache(MCList<?> list) {
		_xfrInstDCache = new FXUCL_MCDbcCache<MST_XFR_INST_D_R>(
				MCQueryApiBuilder.create(MST_XFR_INST_D_R.create("T")),
				list, MST_XFR_INST_D_R.$xfr_inst_d_no);
	}
	protected static FXUCL_MCDbcCache<MST_XFR_INST_D_R> getXfrInstDCache() {
		return object(CLAZZ)._xfrInstDCache;
	}
	protected static MST_XFR_INST_D_R getXfrInstDR(String xfrInstDNo) {
		return getXfrInstDCache().get(xfrInstDNo);
	}
	
	/**
	 * MST_XFR_ACTキャッシュ
	 */
	protected static void initXfrActCache(MCList<XfrActIF_HdrDtlR> list) {
		object(CLAZZ)._initXfrActCache(list);
	}
	protected FXUCL_MCDbcCache<MST_XFR_ACT_R> _xfrActCache = null;
	protected void _initXfrActCache(MCList<?> list) {
		_xfrActCache = new FXUCL_MCDbcCache<MST_XFR_ACT_R>(
				MCQueryApiBuilder.create(MST_XFR_ACT_R.create("T")),
				list, MST_XFR_ACT_R.$xfr_act_no);
	}
	protected static FXUCL_MCDbcCache<MST_XFR_ACT_R> getXfrActCache() {
		return object(CLAZZ)._xfrActCache;
	}
	protected static MST_XFR_ACT_R getXfrActR(String xfrActNo) {
		return getXfrActCache().get(xfrActNo);
	}
	
	/**
	 * MST_XFR_ACT_Dキャッシュ
	 */
	protected static void initXfrActDCache(MCList<XfrActIF_HdrDtlR> list) {
		object(CLAZZ)._initXfrActDCache(list);
	}
	protected FXUCL_MCDbcCache<MST_XFR_ACT_D_R> _xfrActDCache = null;
	protected void _initXfrActDCache(MCList<?> list) {
		_xfrActDCache = new FXUCL_MCDbcCache<MST_XFR_ACT_D_R>(
				MCQueryApiBuilder.create(MST_XFR_ACT_D_R.create("T")),
				list, MST_XFR_ACT_D_R.$xfr_act_d_no);
	}
	protected static FXUCL_MCDbcCache<MST_XFR_ACT_D_R> getXfrActDCache() {
		return object(CLAZZ)._xfrActDCache;
	}
	protected static MST_XFR_ACT_D_R getXfrActDR(String xfrActDNo) {
		return getXfrActDCache().get(xfrActDNo);
	}

	/**
	 * デフォルト格付ＣＤキャッシュ
	 */
	protected String _defGdCd = null;
	protected String getDefGdCd() {
		if (isNull(_defGdCd)) {
			MAM_STK_GD_R dbc = MAM_STK_GD_R.create();
			MAM_STK_GD_R t = MAM_STK_GD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			MAM_STK_GD_R S1W = MAM_STK_GD_R.create("W");
			dbc_bldr.setSelect(t.gd_cd);
			dbc_bldr.setWhere(t.sort_seq.eq(subQuery()
					.select(min(S1W.sort_seq)) .from(S1W)));
			dbSelect("MSBEL5300_MAM_STK_GD_S01", dbc, dbc_bldr);
			_defGdCd = dbc.gd_cd();
		}
		return _defGdCd;
	}

	/**
	 * デフォルト取引キャッシュ
	 */
	protected MCList<MAM_TRD_R> _trdL = null;
	protected MCIndexKey _trdLIdx = null;
	protected MAM_TRD_R getDefTrdR(String trdPtnTyp) {
		if (isNull(_trdL)) {
			_trdL = MCList.create(MAM_TRD_R.class);
			MAM_TRD_R t = MAM_TRD_R.create("T");
			MCQueryApiBuilder trdL_bldr = MCQueryApiBuilder.create(t);
			trdL_bldr.setSelect(t.trd_cd, t.trd_ptn_typ, t.auto_adopt_flg);
			trdL_bldr.setWhere(t.trd_ptn_typ.in( value(MAC_TRD_PTN_TYP.XFR.value()),
					value(MAC_TRD_PTN_TYP.XFR_RTN.value()),
					value(MAC_TRD_PTN_TYP.PROV.value()),
					value(MAC_TRD_PTN_TYP.PROV_RTN.value())));
			dbSelect("MSBEL5300_MAM_TRD_S01", _trdL, trdL_bldr);
			_trdLIdx = _trdL.createIndex(MAM_TRD_R.$trd_ptn_typ, MAM_TRD_R.$auto_adopt_flg);
		}
		MAM_TRD_R trdR = _trdL.getFirst(_trdLIdx, trdPtnTyp, true);
		if (isNull(trdR)) {
			trdR = _trdL.getFirst(_trdLIdx, trdPtnTyp, false);
		}
		return trdR;
	}
		
	protected Map_XfrActChk_HdrDtlR_XfrActIF_HdrDtlR<XfrActChk_HdrDtlR,XfrActIF_HdrDtlR> createMap_XfrActChk_HdrDtlR_XfrActIF_HdrDtlR() {
		return new Map_XfrActChk_HdrDtlR_XfrActIF_HdrDtlR<XfrActChk_HdrDtlR, XfrActIF_HdrDtlR>();
	}

	public class Map_XfrActChk_HdrDtlR_XfrActIF_HdrDtlR<D extends XfrActChk_HdrDtlR, S extends XfrActIF_HdrDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrActChk_HdrDtlR.$peg_no, XfrActIF_HdrDtlR.$peg_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$data_crud_typ, XfrActIF_HdrDtlR.$data_crud_typ);
			addColumnPathMap(XfrActChk_HdrDtlR.$xfr_alloc_sts_no, XfrActIF_HdrDtlR.$xfr_alloc_sts_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$xfr_act_d_no, XfrActIF_HdrDtlR.$xfr_act_d_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$trd_cd, XfrActIF_HdrDtlR.$trd_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$trd_ptn_typ, XfrActIF_HdrDtlR.$trd_ptn_typ);
			addColumnPathMap(XfrActChk_HdrDtlR.$wg_cd, XfrActIF_HdrDtlR.$wg_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$lg_grp_cd, XfrActIF_HdrDtlR.$lg_grp_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$gi_loc_cd, XfrActIF_HdrDtlR.$gi_loc_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$gr_loc_cd, XfrActIF_HdrDtlR.$gr_loc_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$xfr_dt, XfrActIF_HdrDtlR.$xfr_dt);
			addColumnPathMap(XfrActChk_HdrDtlR.$ac_dt, XfrActIF_HdrDtlR.$ac_dt);
			addColumnPathMap(XfrActChk_HdrDtlR.$can_ac_dt, XfrActIF_HdrDtlR.$can_ac_dt);
			addColumnPathMap(XfrActChk_HdrDtlR.$rsn_cd, XfrActIF_HdrDtlR.$rsn_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$prov_schd_no, XfrActIF_HdrDtlR.$prov_schd_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$prov_typ, XfrActIF_HdrDtlR.$prov_typ);
			addColumnPathMap(XfrActChk_HdrDtlR.$ret_prov_schd_no, XfrActIF_HdrDtlR.$ret_prov_schd_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$ret_prov_typ, XfrActIF_HdrDtlR.$ret_prov_typ);
			addColumnPathMap(XfrActChk_HdrDtlR.$itm_cd, XfrActIF_HdrDtlR.$itm_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$itm_sub1, XfrActIF_HdrDtlR.$itm_sub1);
			addColumnPathMap(XfrActChk_HdrDtlR.$itm_sub2, XfrActIF_HdrDtlR.$itm_sub2);
			addColumnPathMap(XfrActChk_HdrDtlR.$itm_sub3, XfrActIF_HdrDtlR.$itm_sub3);
			addColumnPathMap(XfrActChk_HdrDtlR.$lot_no, XfrActIF_HdrDtlR.$lot_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$sublot_no, XfrActIF_HdrDtlR.$sublot_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$sno1, XfrActIF_HdrDtlR.$sno1);
			addColumnPathMap(XfrActChk_HdrDtlR.$sno2, XfrActIF_HdrDtlR.$sno2);
			addColumnPathMap(XfrActChk_HdrDtlR.$sno3, XfrActIF_HdrDtlR.$sno3);
			addColumnPathMap(XfrActChk_HdrDtlR.$sno4, XfrActIF_HdrDtlR.$sno4);
			addColumnPathMap(XfrActChk_HdrDtlR.$stk_id_typ, XfrActIF_HdrDtlR.$stk_id_typ);
			addColumnPathMap(XfrActChk_HdrDtlR.$stk_bp_cd, XfrActIF_HdrDtlR.$stk_bp_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$trd_unit_cd, XfrActIF_HdrDtlR.$trd_unit_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$trd_unit_qty, XfrActIF_HdrDtlR.$trd_unit_qty);
			addColumnPathMap(XfrActChk_HdrDtlR.$skip_chk_ship_flg, XfrActIF_HdrDtlR.$skip_chk_ship_flg);
			addColumnPathMap(XfrActChk_HdrDtlR.$xfr_act_no, XfrActIF_HdrDtlR.$xfr_act_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$err_flg, XfrActIF_HdrDtlR.$err_flg);
			addColumnPathMap(XfrActChk_HdrDtlR.$gi_str_ln_cd, XfrActIF_HdrDtlR.$gi_str_ln_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$gr_str_ln_cd, XfrActIF_HdrDtlR.$gr_str_ln_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$quality_typ, XfrActIF_HdrDtlR.$quality_typ);
			addColumnPathMap(XfrActChk_HdrDtlR.$gd_cd, XfrActIF_HdrDtlR.$gd_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$stk_insp_typ, XfrActIF_HdrDtlR.$stk_insp_typ);
			addColumnPathMap(XfrActChk_HdrDtlR.$base_unit_cd, XfrActIF_HdrDtlR.$base_unit_cd);
			addColumnPathMap(XfrActChk_HdrDtlR.$base_unit_qty, XfrActIF_HdrDtlR.$base_unit_qty);
			addColumnPathMap(XfrActChk_HdrDtlR.$base_dlv_slip_no, XfrActIF_HdrDtlR.$base_dlv_slip_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$base_prov_act_no, XfrActIF_HdrDtlR.$base_prov_act_no);
			addColumnPathMap(XfrActChk_HdrDtlR.$base_ac_dt, XfrActIF_HdrDtlR.$base_ac_dt);
		}
	}

	protected Map_XfrAct_HdrDtlR_XfrActIF_HdrDtlR<XfrAct_HdrDtlR,XfrActIF_HdrDtlR> createMap_XfrAct_HdrDtlR_XfrActIF_HdrDtlR() {
		return new Map_XfrAct_HdrDtlR_XfrActIF_HdrDtlR<XfrAct_HdrDtlR, XfrActIF_HdrDtlR>();
	}

	public class Map_XfrAct_HdrDtlR_XfrActIF_HdrDtlR<D extends XfrAct_HdrDtlR, S extends XfrActIF_HdrDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrAct_HdrDtlR.$xfr_act_no, XfrActIF_HdrDtlR.$xfr_act_no);
			addColumnPathMap(XfrAct_HdrDtlR.$xfr_inst_no, XfrActIF_HdrDtlR.$xfr_inst_no);
			addColumnPathMap(XfrAct_HdrDtlR.$trd_cd, XfrActIF_HdrDtlR.$trd_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$trd_ptn_typ, XfrActIF_HdrDtlR.$trd_ptn_typ);
			addColumnPathMap(XfrAct_HdrDtlR.$wg_cd, XfrActIF_HdrDtlR.$wg_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$lg_grp_cd, XfrActIF_HdrDtlR.$lg_grp_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$gr_loc_cd, XfrActIF_HdrDtlR.$gr_loc_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$gr_stk_arrv_bp_cd, XfrActIF_HdrDtlR.$gr_stk_arrv_bp_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$xfr_dt, XfrActIF_HdrDtlR.$xfr_dt);
			addColumnPathMap(XfrAct_HdrDtlR.$ac_dt, XfrActIF_HdrDtlR.$ac_dt);
			addColumnPathMap(XfrAct_HdrDtlR.$act_usr_cd, XfrActIF_HdrDtlR.$act_usr_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$act_dpt_cd, XfrActIF_HdrDtlR.$act_dpt_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$intr_rmrks, XfrActIF_HdrDtlR.$intr_rmrks);
			addColumnPathMap(XfrAct_HdrDtlR.$trd_rmrks, XfrActIF_HdrDtlR.$trd_rmrks);
			addColumnPathMap(XfrAct_HdrDtlR.$sub_char1, XfrActIF_HdrDtlR.$sub_char1);
			addColumnPathMap(XfrAct_HdrDtlR.$sub_char2, XfrActIF_HdrDtlR.$sub_char2);
			addColumnPathMap(XfrAct_HdrDtlR.$sub_char3, XfrActIF_HdrDtlR.$sub_char3);						
			addColumnPathMap(XfrAct_HdrDtlR.$immd_dlv_prnt_flg, XfrActIF_HdrDtlR.$immd_dlv_prnt_flg);
			addColumnPathMap(XfrAct_HdrDtlR.$can_ac_dt, XfrActIF_HdrDtlR.$can_ac_dt);
			
			addColumnPathMap(XfrAct_HdrDtlR.$peg_no, XfrActIF_HdrDtlR.$peg_no);
			addColumnPathMap(XfrAct_HdrDtlR.$data_crud_typ, XfrActIF_HdrDtlR.$data_crud_typ);
			addColumnPathMap(XfrAct_HdrDtlR.$xfr_act_d_no, XfrActIF_HdrDtlR.$xfr_act_d_no);
			addColumnPathMap(XfrAct_HdrDtlR.$xfr_act_no_dtl, XfrActIF_HdrDtlR.$xfr_act_no_dtl);
			addColumnPathMap(XfrAct_HdrDtlR.$xfr_alloc_sts_no, XfrActIF_HdrDtlR.$xfr_alloc_sts_no);
			addColumnPathMap(XfrAct_HdrDtlR.$xfr_inst_d_no, XfrActIF_HdrDtlR.$xfr_inst_d_no);
			addColumnPathMap(XfrAct_HdrDtlR.$gi_loc_cd, XfrActIF_HdrDtlR.$gi_loc_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$gi_str_ln_cd, XfrActIF_HdrDtlR.$gi_str_ln_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$gi_stk_arrv_bp_cd, XfrActIF_HdrDtlR.$gi_stk_arrv_bp_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$gr_str_ln_cd, XfrActIF_HdrDtlR.$gr_str_ln_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$itm_cd, XfrActIF_HdrDtlR.$itm_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$itm_sub1, XfrActIF_HdrDtlR.$itm_sub1);
			addColumnPathMap(XfrAct_HdrDtlR.$itm_sub2, XfrActIF_HdrDtlR.$itm_sub2);
			addColumnPathMap(XfrAct_HdrDtlR.$itm_sub3, XfrActIF_HdrDtlR.$itm_sub3);
			addColumnPathMap(XfrAct_HdrDtlR.$lot_no, XfrActIF_HdrDtlR.$lot_no);
			addColumnPathMap(XfrAct_HdrDtlR.$sublot_no, XfrActIF_HdrDtlR.$sublot_no);
			addColumnPathMap(XfrAct_HdrDtlR.$sno1, XfrActIF_HdrDtlR.$sno1);
			addColumnPathMap(XfrAct_HdrDtlR.$sno2, XfrActIF_HdrDtlR.$sno2);
			addColumnPathMap(XfrAct_HdrDtlR.$sno3, XfrActIF_HdrDtlR.$sno3);
			addColumnPathMap(XfrAct_HdrDtlR.$sno4, XfrActIF_HdrDtlR.$sno4);
			addColumnPathMap(XfrAct_HdrDtlR.$gd_cd, XfrActIF_HdrDtlR.$gd_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$quality_typ, XfrActIF_HdrDtlR.$quality_typ);
			addColumnPathMap(XfrAct_HdrDtlR.$stk_insp_typ, XfrActIF_HdrDtlR.$stk_insp_typ);
			addColumnPathMap(XfrAct_HdrDtlR.$stk_id_typ, XfrActIF_HdrDtlR.$stk_id_typ);
			addColumnPathMap(XfrAct_HdrDtlR.$stk_bp_cd, XfrActIF_HdrDtlR.$stk_bp_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$trd_unit_cd, XfrActIF_HdrDtlR.$trd_unit_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$trd_unit_qty, XfrActIF_HdrDtlR.$trd_unit_qty);
			addColumnPathMap(XfrAct_HdrDtlR.$base_unit_cd, XfrActIF_HdrDtlR.$base_unit_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$base_unit_qty, XfrActIF_HdrDtlR.$base_unit_qty);
			addColumnPathMap(XfrAct_HdrDtlR.$skip_chk_ship_flg, XfrActIF_HdrDtlR.$skip_chk_ship_flg);
			addColumnPathMap(XfrAct_HdrDtlR.$rsn_cd, XfrActIF_HdrDtlR.$rsn_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$bd_dpt_cd, XfrActIF_HdrDtlR.$bd_dpt_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$io_schd_pr_no, XfrActIF_HdrDtlR.$io_schd_pr_no);
			addColumnPathMap(XfrAct_HdrDtlR.$intr_d_rmrks, XfrActIF_HdrDtlR.$intr_d_rmrks);
			addColumnPathMap(XfrAct_HdrDtlR.$trd_d_rmrks, XfrActIF_HdrDtlR.$trd_d_rmrks);
			addColumnPathMap(XfrAct_HdrDtlR.$sub_char1_dtl, XfrActIF_HdrDtlR.$sub_char1_dtl);
			addColumnPathMap(XfrAct_HdrDtlR.$sub_char2_dtl, XfrActIF_HdrDtlR.$sub_char2_dtl);
			addColumnPathMap(XfrAct_HdrDtlR.$sub_char3_dtl, XfrActIF_HdrDtlR.$sub_char3_dtl);
			addColumnPathMap(XfrAct_HdrDtlR.$sub_char3_dtl, XfrActIF_HdrDtlR.$sub_char3_dtl);
			addColumnPathMap(XfrAct_HdrDtlR.$abort_flg, XfrActIF_HdrDtlR.$abort_flg);
			addColumnPathMap(XfrAct_HdrDtlR.$prov_typ, XfrActIF_HdrDtlR.$prov_typ);
			addColumnPathMap(XfrAct_HdrDtlR.$ret_prov_typ, XfrActIF_HdrDtlR.$ret_prov_typ);
			addColumnPathMap(XfrAct_HdrDtlR.$wms_flg, XfrActIF_HdrDtlR.$wms_flg);
			addColumnPathMap(XfrAct_HdrDtlR.$ext_sys_cd, XfrActIF_HdrDtlR.$ext_sys_cd);
			addColumnPathMap(XfrAct_HdrDtlR.$ext_xfr_act_no, XfrActIF_HdrDtlR.$ext_xfr_act_no);
			addColumnPathMap(XfrAct_HdrDtlR.$base_dlv_slip_no, XfrActIF_HdrDtlR.$base_dlv_slip_no);
			addColumnPathMap(XfrAct_HdrDtlR.$base_prov_act_no, XfrActIF_HdrDtlR.$base_prov_act_no);
			addColumnPathMap(XfrAct_HdrDtlR.$base_ac_dt, XfrActIF_HdrDtlR.$base_ac_dt);
		}
	}

	protected Map_XfrActChk_DelDtlR_XfrActIF_HdrDtlR<XfrActChk_DelDtlR,XfrActIF_HdrDtlR> createMap_XfrActChk_DelDtlR_XfrActIF_HdrDtlR() {
		return new Map_XfrActChk_DelDtlR_XfrActIF_HdrDtlR<XfrActChk_DelDtlR, XfrActIF_HdrDtlR>();
	}

	public class Map_XfrActChk_DelDtlR_XfrActIF_HdrDtlR<D extends XfrActChk_DelDtlR, S extends XfrActIF_HdrDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(XfrActChk_DelDtlR.$xfr_act_d_no, XfrActIF_HdrDtlR.$xfr_act_d_no);

		}
	}

	//FMCB CUSTOM END
}