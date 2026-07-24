package mcframe.serverMSBC.MSBCL6130;

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
import mcframe.serverMSBC.MSBCL6050.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverMSBD.MSBDL5190.*;
import mcframe.serverMSBE.MSBEL5270.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_OutSrcActService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_OutSrcActService_MC extends MSBCL_OutSrcActService_MC_A{
	//FMCB CUSTOM START

	protected static final Class<MSBCL_OutSrcActService> CLAZZ = MSBCL_OutSrcActService.class;
	
	// Chk01,Upd01で共通して使用するキャッシュ関連の処理
	protected static void initCacheForUpd(MCList<OutSrcAct_Chk01_ActDR> upL) {
		object(CLAZZ)._initCacheForUpd(upL);
	}

	protected FXUCL_Cache<MfgActReg_Upd01_HdrR> _cacheForUpd01;

	protected static MfgActReg_Upd01_HdrR getCacheForUpd01(String mfgInstNo) {
		return object(CLAZZ)._cacheForUpd01.getCache(mfgInstNo);
	}

	protected void _initCacheForUpd(MCList<OutSrcAct_Chk01_ActDR> upL) {

		_cacheForUpd01 = new FXUCL_Cache<MfgActReg_Upd01_HdrR>();
		_cacheForUpd01.setFixMaxCacheSize(-1);
		
		MCList<MST_MFG_INST_R> bindL = MCList.create(MST_MFG_INST_R.class);
		for (OutSrcAct_Chk01_ActDR r : upL) {
			MST_MFG_INST_R bindR = MST_MFG_INST_R.create();
			bindR.mfg_inst_no(r.mfg_inst_no());
			bindL.add(bindR);
		}
		bindL = bindL.groupBy(MST_MFG_INST_R.$mfg_inst_no);
	
		if (!bindL.isEmpty()) {
			MCList<MST_MFG_INST_R> miL = srchUpd01CacheData(bindL);
			MCIndexKey idxkey = miL.createIndex(MST_MFG_INST_R.$mfg_inst_no);

			MCList<MAM_LOC_R> locBindL = MCList.create(MAM_LOC_R.class);
			for (MST_MFG_INST_R miR : miL) {
				MAM_LOC_R locR = MAM_LOC_R.create();
				locR.loc_cd(miR.getStringNE("mfg_loc_cd"));
				locBindL.add(locR);
			}
			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(t);
			locL_bldr.setSelect(t.pre_outsrc_act_flg);
			FXUCL_MCDbcCache<MAM_LOC_R> locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(locL_bldr, locBindL, MAM_LOC_R.$loc_cd);

			for (MST_MFG_INST_R bindR : bindL) {
				MST_MFG_INST_R dbR = miL.getFirst(idxkey, bindR.mfg_inst_no());
				if (isNull(dbR)) {
					continue;
				}
				putUpd01Cache(bindR.mfg_inst_no(), dbR, locCache ,upL);
			}
		}
	}

	protected MCList<MST_MFG_INST_R> srchUpd01CacheData(
			MCList<MST_MFG_INST_R> bindL) {
		MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
		MST_ITM_MFG_INST_R t2 = MST_ITM_MFG_INST_R.create("T2");
		MSVT_MFG_INST_PR_R t3 = MSVT_MFG_INST_PR_R.create("T3");
		MST_MFG_ACT_R t4 = MST_MFG_ACT_R.create("T4");


		MCList<MST_MFG_INST_R> miL = MCList.create(MST_MFG_INST_R.class);
		MCQueryApiBuilder miL_bldr = MCQueryApiBuilder.create(t);
		miL_bldr.setSelect(t.mfg_inst_no);
		miL_bldr.addSelect(t.mfg_aprv_sts_typ);
		miL_bldr.addSelect(t.mfg_inst_unit_typ);
		miL_bldr.addSelect(t.aprv_flg);
		miL_bldr.addSelect(t.mfg_aprv_role_cd);
		miL_bldr.addSelect(t.aprv_dt);
		
		miL_bldr.addSelect(t2.itm_mfg_inst_no);
		miL_bldr.addSelect(t2.itm_cd);
		miL_bldr.addSelect(t2.itm_sub1);
		miL_bldr.addSelect(t2.itm_sub2);
		miL_bldr.addSelect(t2.itm_sub3);
		miL_bldr.addSelect(t2.lot_no);
		miL_bldr.addSelect(t2.sublot_no);
		miL_bldr.addSelect(t2.sno1);
		miL_bldr.addSelect(t2.sno2);
		miL_bldr.addSelect(t2.sno3);
		miL_bldr.addSelect(t2.sno4);
		miL_bldr.addSelect(t2.base_unit_inst_qty);
		miL_bldr.addSelect(t2.mfg_mtd_typ);
		miL_bldr.addSelect(t2.sppl_cd);
		miL_bldr.addSelect(t2.mfg_loc_cd);
		miL_bldr.addSelect(t2.mfg_str_ln_cd);
		miL_bldr.addSelect(t2.bom_ptn);
		miL_bldr.addSelect(t2.site_cd);
		miL_bldr.addSelect(t2.wg_cd);
		miL_bldr.addSelect(t2.itm_ord_no);
		
		miL_bldr.addSelect(t3.mfg_sts_typ);
		
		miL.addBooleanColumn("act_prnt_flg");
		miL.addBooleanColumn("arr_purc_auto_reg_flg");
		miL_bldr.addSelect(t4.mfg_act_no);
		miL_bldr.addSelect(t4.div_seq);
		miL_bldr.addSelect(t4.st_act_tm);
		miL_bldr.addSelect(t4.st_ac_dt);
		miL_bldr.addSelect(t4.end_act_tm);
		miL_bldr.addSelect(t4.end_ac_dt);
		miL_bldr.addSelect(t4.base_unit_yield_qty);
		miL_bldr.addSelect(t4.base_unit_dfct_qty);
		miL_bldr.addSelect(t4.act_usr_cd);
		miL_bldr.addSelect(t4.act_dpt_cd);
		miL_bldr.addSelect(t4.act_rpt_rmrks);
		miL_bldr.addSelect(t4.intr_rmrks);
		miL_bldr.addSelect(t4.sub_char1);
		miL_bldr.addSelect(t4.sub_char2);
		miL_bldr.addSelect(t4.sub_char3);
		miL_bldr.addSelect(t4.itm_yield);
		miL_bldr.addSelect(t4.act_prnt_flg);
		miL_bldr.addSelect(t4.seq);
		miL_bldr.addSelect(t4.arr_purc_auto_reg_flg);
		miL_bldr.addSelect(t4.mfg_aprv_sts_typ.as("act_mfg_aprv_sts_typ"));
		miL_bldr.addSelect(t4.aprv_dt.as("act_aprv_dt"));
		miL_bldr.addSelect(t4.aprv_dpt_cd.as("act_aprv_dpt_cd"));
		miL_bldr.addSelect(t4.aprv_usr_cd.as("act_aprv_usr_cd"));
		miL_bldr.addSelect(t4.aprv_tm.as("act_aprv_tm"));
		miL_bldr.addSelect(t4.aprv_rsn.as("act_aprv_rsn"));
		
		miL_bldr.addInnerJoin(t2, t.itm_mfg_inst_no.eq(t2.itm_mfg_inst_no));
		miL_bldr.addInnerJoin(t3, t.mfg_inst_no.eq(t3.mfg_inst_no));
		miL_bldr.addLeftOuterJoin(t4, t.mfg_inst_no.eq(t4.mfg_inst_no));
		miL_bldr.addLockTable(t2.itm_mfg_inst_no);
		miL_bldr.setOrderByAsc(t2.itm_mfg_inst_no, t.mfg_inst_no, t4.mfg_act_no);
		dbSelectKeyForUpdate("MSBCL6130_MST_MFG_INST_S01", miL, miL_bldr, bindL);
		
		return miL;
	}

	protected void putUpd01Cache(String mfgInstNo, MST_MFG_INST_R dbR,
			FXUCL_MCDbcCache<MAM_LOC_R> locCache, MCList<OutSrcAct_Chk01_ActDR> upL) {
		
		MfgActReg_Upd01_HdrR cacheR = MfgActReg_Upd01_HdrR.create();
		
		cacheR.mfg_inst_no(dbR.mfg_inst_no());
		cacheR.setStringNE("inst_mfg_aprv_sts_typ", dbR.mfg_aprv_sts_typ());
		cacheR.mfg_inst_unit_typ(dbR.mfg_inst_unit_typ());
		cacheR.aprv_flg(dbR.aprv_flg());
		cacheR.mfg_aprv_role_cd(dbR.mfg_aprv_role_cd());
		cacheR.aprv_dt(dbR.aprv_dt());
		
		cacheR.itm_mfg_inst_no(dbR.getStringNE("itm_mfg_inst_no"));
		cacheR.itm_cd(dbR.getStringNE("itm_cd"));
		cacheR.itm_sub1(dbR.getStringNE("itm_sub1"));
		cacheR.itm_sub2(dbR.getStringNE("itm_sub2"));
		cacheR.itm_sub3(dbR.getStringNE("itm_sub3"));
		cacheR.inst_lot_no(dbR.getStringNE("lot_no"));
		cacheR.inst_sublot_no(dbR.getStringNE("sublot_no"));
		cacheR.sno1(dbR.getStringNE("sno1"));
		cacheR.sno2(dbR.getStringNE("sno2"));
		cacheR.sno3(dbR.getStringNE("sno3"));
		cacheR.sno4(dbR.getStringNE("sno4"));
		cacheR.itm_mfg_inst_qty(dbR.getNumberNE("base_unit_inst_qty"));
		// 外注製造実績は分割不可のため、指図数量と着手数量は同じ値を設定する
		cacheR.base_unit_st_act_qty(cacheR.itm_mfg_inst_qty());
		cacheR.mfg_mtd_typ(dbR.getStringNE("mfg_mtd_typ"));
		cacheR.sppl_cd(dbR.getStringNE("sppl_cd"));
		cacheR.mfg_loc_cd(dbR.getStringNE("mfg_loc_cd"));
		cacheR.mfg_str_ln_cd(dbR.getStringNE("mfg_str_ln_cd"));
		cacheR.bom_ptn(dbR.getStringNE("bom_ptn"));
		cacheR.site_cd(dbR.getStringNE("site_cd"));
		cacheR.wg_cd(dbR.getStringNE("wg_cd"));
		cacheR.itm_ord_no(dbR.getStringNE("itm_ord_no"));
		
		cacheR.mfg_sts_typ(dbR.getStringNE("mfg_sts_typ"));
		
		cacheR.mfg_act_no(dbR.getStringNE("mfg_act_no"));
		cacheR.div_seq(dbR.getNumberNE("div_seq"));
		cacheR.st_act_tm(dbR.getDateNE("st_act_tm"));
		cacheR.st_ac_dt(dbR.getDateNE("st_ac_dt"));
		cacheR.end_act_tm(dbR.getDateNE("end_act_tm"));
		cacheR.end_ac_dt(dbR.getDateNE("end_ac_dt"));
		cacheR.base_unit_yield_qty(dbR.getNumberNE("base_unit_yield_qty"));
		cacheR.base_unit_dfct_qty(dbR.getNumberNE("base_unit_dfct_qty"));
		
		cacheR.act_usr_cd(dbR.getStringNE("act_usr_cd"));
		cacheR.act_dpt_cd(dbR.getStringNE("act_dpt_cd"));
		cacheR.act_rpt_rmrks(dbR.getStringNE("act_rpt_rmrks"));
		cacheR.intr_rmrks(dbR.getStringNE("intr_rmrks"));
		cacheR.mfg_act_sub_char1(dbR.getStringNE("sub_char1"));
		cacheR.mfg_act_sub_char2(dbR.getStringNE("sub_char2"));
		cacheR.mfg_act_sub_char3(dbR.getStringNE("sub_char3"));
		cacheR.itm_yield(dbR.getNumberNE("itm_yield"));
		cacheR.prnt_seq(dbR.getNumberNE("seq"));
		cacheR.act_prnt_flg(dbR.getBooleanNE("act_prnt_flg"));
		cacheR.old_mfg_aprv_sts_typ(dbR.getStringNE("act_mfg_aprv_sts_typ"));
		cacheR.old_end_act_tm(dbR.getDateNE("end_act_tm"));
		
		MAM_LOC_R locR = locCache.getEx(cacheR.mfg_loc_cd());
		if (MSC_MFG_APRV_STS_TYP.isACT_ACPT(cacheR.old_mfg_aprv_sts_typ()) && locR.pre_outsrc_act_flg()) {
			cacheR.setDateNE("act_aprv_dt", dbR.getDateNE("act_aprv_dt"));
			cacheR.aprv_dpt_cd(dbR.getStringNE("act_aprv_dpt_cd"));
			cacheR.aprv_usr_cd(dbR.getStringNE("act_aprv_usr_cd"));
			cacheR.aprv_tm(dbR.getDateNE("act_aprv_tm"));
			cacheR.aprv_rsn(dbR.getStringNE("act_aprv_rsn"));
		}

		if (!isNull(cacheR.mfg_act_no())) {
			cacheR.arr_purc_auto_reg_flg(dbR.getBooleanNE("arr_purc_auto_reg_flg"));
		}
		else {
			if (locR.pre_outsrc_act_flg()) {
				cacheR.arr_purc_auto_reg_flg(false);
			}
			else {
				cacheR.arr_purc_auto_reg_flg(true);
			}
		}
		
		_cacheForUpd01.putCache(new String[] {mfgInstNo}, cacheR);
	}
	
	/**
	 * OutSrcAct_Chk01オペレーション.<p>
	 *
	 * 入荷実績・仕入実績の登録・訂正・取消の前に、外注製造実績の状況をチェックする（外注実績自動登録・外注実績先行登録の両方で使用する）<br>
	 */
	public class OutSrcAct_Chk01 extends MSBCL_OutSrcActService_MC_A.OutSrcAct_Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			initCacheForUpd(up0());
			
			chkMain();
			
			setDown();
		}
		
		protected void chkMain() {
			MCMessageList msgL = new MCMessageList();
			
			for (OutSrcAct_Chk01_ActDR r : up0()) {
				if (isNull(r.mfg_inst_no())) {
					continue;
				}
				if (r.arr_schd_abort_flg()) {
					// 現状、入荷予定打切時に呼ばれた場合は、キャッシュのみ実施し何もチェックする必要はない
					continue;
				}
				MfgActReg_Upd01_HdrR cacheR = getCacheForUpd01(r.mfg_inst_no());

				if (MSC_MFG_STS_TYP.isSAV(cacheR.mfg_sts_typ())) {
					// 更新前の製造状況区分が指図保存の場合はエラー
					msgL.add(new MCMessage(r, null, MSBCL1086, r.mfg_inst_no(),
							toDispGUIIndex(r)));
					r.err_flg(true);
				}

				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					if (isPreAct(cacheR) && isNull(cacheR.mfg_act_no())) {
						// 先行実績する場合は、製造実績が存在しなければ入荷・仕入の新規登録はできない
						msgL.add(new MCMessage(r, null, MSBCL1023, toDispGUIIndex(r)));
						r.err_flg(true);
					}
					
					if (!isPreAct(cacheR) && MSC_MFG_APRV_STS_TYP
							.isINST_OPN(cacheR.getStringNE("inst_mfg_aprv_sts_typ"))) {
						// 承認対象の場合は、承認されていなければ入荷・仕入の新規登録はできない
						msgL.add(new MCMessage(r, null, MSBCL1024, toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
				
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && !isPreAct(cacheR) &&
						!isNull(cacheR.aprv_dt()) && !isNull(r.st_act_dt())) {
					// 製造指図承認日が実績日より後の日付の場合は、登録、訂正できない	
					if (cacheR.aprv_dt().gt(r.st_act_dt())) {	
						msgL.add(new MCMessage(r, null, MSBCL1212, toYMDString(cacheR.aprv_dt()), toYMDString(r.st_act_dt()), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
				
				if (!isPreAct(cacheR) && MSC_MFG_APRV_STS_TYP
						.isACT_ACPT(cacheR.old_mfg_aprv_sts_typ())) {
					// 記録承認済みの場合は、訂正、取り消しできない
					// ※先行実績する場合は、入荷・仕入前に記録承認されることがあり、また入荷・仕入に連動して更新するのは仕掛情報だけであるため記録承認済みか否かのチェックは行わない
					// ※先行実績しない場合は、入荷・仕入の完了によって製造も完了する。その後に記録承認をする流れとなるため、データ更新区分によらずチェックする
					msgL.add(new MCMessage(r, null, MSBCL1025, toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
			
			if (!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
			}
		}
		
		protected void setDown() {
			down0().setAll(up0());
		}
		
	}
	protected boolean isPreAct(MfgActReg_Upd01_HdrR cacheR) {
		// 入荷仕入時に自動作成していない＝製造実績登録画面で先行登録した
		return !cacheR.arr_purc_auto_reg_flg();
	}

	/**
	 * OutSrcAct_Upd01オペレーション.<p>
	 *
	 * 入荷実績・仕入実績の登録・訂正・取消に伴い、外注製造実績を登録・訂正・取消する。
	 */
	public class OutSrcAct_Upd01 extends MSBCL_OutSrcActService_MC_A.OutSrcAct_Upd01 {
		// 品目キャッシュ
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
		
		// 入荷実績キャッシュ
		protected FXUCL_Cache<MCList<MST_ARR_ACT_R>> _arrCacheForHdr; // 製造指図ＮＯをキーとしてキャッシュする
		
		// 仕入実績受払キャッシュ
		protected FXUCL_Cache<MCList<MST_PURC_ACT_IO_R>> _purcCacheForHdr; // 製造指図ＮＯをキーとしてキャッシュする
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// キャッシュの設定
			setCache();
			
			MSBCL_MfgActRegService.MfgActReg_Upd01 actOpe = MSBCL_MfgActRegService
					.crtMfgActReg_Upd01();
			actOpe.up7().not_io_act_srv_exec_flg(true);
			
			// ヘッダコンテナの設定
			setSrvHdrCont(actOpe);
			
			// 工程、出来高コンテナの設定
			setSrvOperAndYieldCont(actOpe);
			
			// 投入コンテナの設定
			setSrvInptAndLossCont(actOpe);
			
			// キャッシュのクリア
			clearCache();
			
			actOpe.exec();
		}
		
		protected void setCache() {
			MCList<MfgActReg_Upd01_HdrR> bindL = MCList.create(MfgActReg_Upd01_HdrR.class);
			
			for (OutSrcAct_Upd01_ActDR r : up0()) {
				bindL.add(getCacheForUpd01(r.mfg_inst_no()));
			}
			
			// 品目
			setItmCache(bindL);
			
			bindL.groupBy(MfgActReg_Upd01_HdrR.$mfg_inst_no);
			
			// 入荷実績
			setArrCache(bindL);
			
			// 仕入実績
			setPurcCache(bindL);
		}
		
		protected void clearCache() {
			_itmCache = null;
			_arrCacheForHdr = null;
			_purcCacheForHdr = null;
		}
		
		protected void setItmCache(MCList<MfgActReg_Upd01_HdrR> bindL) {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t);
			itmL_bldr.setSelect(t.sno1_mng_typ, t.sno2_mng_typ, t.sno3_mng_typ, t.sno4_mng_typ, t.dec_place, t.rnd_typ, t.unit_cd, t.lot_mng_typ, t.lot_no_typ, t.lot_no_ptn_cd, t.sublot_mng_typ, t.sublot_no_typ, t.sublot_no_ptn_cd);
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(itmL_bldr, bindL,
					MfgActReg_Upd01_HdrR.$itm_cd, MfgActReg_Upd01_HdrR.$itm_sub1,
					MfgActReg_Upd01_HdrR.$itm_sub2, MfgActReg_Upd01_HdrR.$itm_sub3);
		}
		
		protected void setArrCache(MCList<MfgActReg_Upd01_HdrR> bindL) {
			MST_ARR_ACT_R t = MST_ARR_ACT_R.create("T");
			MST_ARR_SCHD_R t2 = MST_ARR_SCHD_R.create("T2");

			MCList<MST_ARR_ACT_R> arrL = MCList.create(MST_ARR_ACT_R.class);
			MCQueryApiBuilder arrL_bldr = MCQueryApiBuilder.create(t);
			arrL_bldr.setSelect(t.arr_act_no);
			arrL_bldr.addSelect(t.arr_tm);
			arrL_bldr.addSelect(t.ac_dt);
			arrL_bldr.addSelect(t.base_unit_qty);
			arrL_bldr.addSelect(t.base_unit_cd);
			arrL_bldr.addSelect(t.trd_unit_qty);
			arrL_bldr.addSelect(t.trd_unit_cd);
			arrL_bldr.addSelect(t.lot_no);
			arrL_bldr.addSelect(t.sublot_no);
			arrL_bldr.addSelect(t.gd_cd);
			
			arrL.addBooleanColumn("cmpl_flg");
			arrL_bldr.addSelect(t2.mfg_inst_no);
			arrL_bldr.addSelect(t2.cmpl_flg);
			arrL_bldr.addInnerJoin(t2, t.arr_schd_no.eq(t2.arr_schd_no));
			arrL_bldr.setWhere(t2.mfg_inst_no.eq(bind("mfg_inst_no")));
			arrL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			
			dbSelect("MSBCL6130_MST_ARR_ACT_S01", arrL, arrL_bldr, bindL);
			
			_arrCacheForHdr = new FXUCL_Cache<MCList<MST_ARR_ACT_R>>();
			_arrCacheForHdr.setFixMaxCacheSize(-1);
			for (MCList<MST_ARR_ACT_R> gL : arrL.groupList("mfg_inst_no")) {
				_arrCacheForHdr.putCache(new String[] {gL.get(0).getStringNE("mfg_inst_no")}, gL);
			}
		}
		
		protected void setPurcCache(MCList<MfgActReg_Upd01_HdrR> bindL) {
			MST_PURC_ACT_IO_R t = MST_PURC_ACT_IO_R.create("T");
			MST_PURC_ACT_D_R t2 = MST_PURC_ACT_D_R.create("T2");
			MST_PURC_ACT_R t3 = MST_PURC_ACT_R.create("T3");
			MST_PURC_SCHD_R t4 = MST_PURC_SCHD_R.create("T4");
			MST_ARR_SCHD_R t5 = MST_ARR_SCHD_R.create("T5");

			MCList<MST_PURC_ACT_IO_R> purcL = MCList.create(MST_PURC_ACT_IO_R.class);
			MCQueryApiBuilder purcL_bldr = MCQueryApiBuilder.create(t);
			purcL_bldr.setSelect(t.purc_act_io_no);
			purcL_bldr.addSelect(t.base_unit_qty);
			purcL_bldr.addSelect(t.base_unit_cd);
			purcL_bldr.addSelect(t.trd_unit_qty);
			purcL_bldr.addSelect(t.trd_unit_cd);
			purcL_bldr.addSelect(t.gd_cd);
			purcL_bldr.addSelect(t.stk_id_typ);
			
			purcL_bldr.addSelect(t5.mfg_inst_no);
			
			purcL_bldr.addSelect(t3.purc_dt.as(MST_PURC_ACT_R.$purc_dt));
			purcL_bldr.addSelect(t3.ac_dt.as(MST_PURC_ACT_R.$ac_dt));
			
			purcL_bldr.addInnerJoin(t2, t.purc_act_d_no.eq(t2.purc_act_d_no)
							.and(t.purc_act_d_seq.eq(t2.purc_act_d_seq)));
			purcL_bldr.addInnerJoin(t3, t2.purc_act_no.eq(t3.purc_act_no)
							.and(t2.purc_act_seq.eq(t3.purc_act_seq)));
			purcL_bldr.addInnerJoin(t4, t2.purc_schd_no.eq(t4.purc_schd_no));
			purcL_bldr.addInnerJoin(t5, t4.arr_schd_no.eq(t5.arr_schd_no));

			purcL_bldr.setWhere(t5.mfg_inst_no.eq(bind("mfg_inst_no")));
			purcL_bldr.addWhereWithAnd(t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			
			dbSelect("MSBCL6130_MST_PURC_ACT_IO_S01", purcL, purcL_bldr, bindL);
			
			_purcCacheForHdr = new FXUCL_Cache<MCList<MST_PURC_ACT_IO_R>>();
			_purcCacheForHdr.setFixMaxCacheSize(-1);
			for (MCList<MST_PURC_ACT_IO_R> gL: purcL.groupList("mfg_inst_no")) {
				_purcCacheForHdr.putCache(new String[] {gL.get(0).getStringNE("mfg_inst_no")}, gL);
			}
		}
		
		/**
		 * 製造実績登録サービスのヘッダコンテナを作成する
		 */
		protected void setSrvHdrCont(MSBCL_MfgActRegService.MfgActReg_Upd01 actOpe) {
			// 入荷予定キャッシュ
			FXUCL_Cache<MCList<MST_ARR_SCHD_R>> schdCache = getSchdCache();

			for (MCList<OutSrcAct_Upd01_ActDR> upGL : up0().groupList(OutSrcAct_Upd01_ActDR.$mfg_inst_no)) {
				OutSrcAct_Upd01_ActDR upR = upGL.get(0);
				MfgActReg_Upd01_HdrR cacheR = getCacheForUpd01(upR.mfg_inst_no());
				
				MfgActReg_Upd01_HdrR oUpR = MfgActReg_Upd01_HdrR.create();
				// 同一製造指図ＮＯの入荷や仕入が同時に登録された場合は、任意の１行の属性を引き継ぐ
				oUpR.setAttributes(upR);

				// 製造指図ＮＯ、製造実績ＮＯ
				oUpR.mfg_inst_no(upR.mfg_inst_no());
				oUpR.mfg_act_no(cacheR.mfg_act_no());
				// データ更新区分
				setHdrDataCrudTyp(oUpR, upR, cacheR);
				// 製造状況区分
				setHdrMfgStsTyp(oUpR, schdCache, cacheR);
				// 日付
				setHdrDt(oUpR, cacheR);
				// 数量
				setHdrQty(oUpR, cacheR);
				// その他項目
				setActSrvUpFromCache(oUpR, cacheR);

				actOpe.up0().add(oUpR);
			}
			
			setPegNo(actOpe.up0());
		}

		protected FXUCL_Cache<MCList<MST_ARR_SCHD_R>> getSchdCache() {


			FXUCL_Cache<MCList<MST_ARR_SCHD_R>> ret = new FXUCL_Cache<MCList<MST_ARR_SCHD_R>>();
			ret.setFixMaxCacheSize(-1);

			MCList<MST_ARR_SCHD_R> schdL = MCList.create(MST_ARR_SCHD_R.class);
			MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			MST_PURC_SCHD_R t2 = MST_PURC_SCHD_R.create("T2");
			schdL_bldr.setSelect(t.mfg_inst_no);
			schdL_bldr.addSelect(t.cmpl_flg);

			schdL.addBooleanColumn("purc_cmpl_flg");
			schdL_bldr.addSelect(t2.cmpl_flg.as("purc_cmpl_flg"));
			schdL_bldr.addInnerJoin(t2, t.arr_schd_no.eq(t2.arr_schd_no));
			schdL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			dbSelect("MSBCL6130_MST_ARR_SCHD_S01", schdL, schdL_bldr, up0().groupBy(OutSrcAct_Upd01_ActDR.$mfg_inst_no));

			for (MCList<MST_ARR_SCHD_R> gL : schdL.groupList("mfg_inst_no")) {
				ret.putCache(new String[] {
						gL.get(0).getStringNE("mfg_inst_no")
				}, gL);
			}
			return ret;
		}
		
		protected void setHdrDataCrudTyp(MfgActReg_Upd01_HdrR oUpR, OutSrcAct_Upd01_ActDR upR,
				MfgActReg_Upd01_HdrR cacheR) {
			if (isPreAct(cacheR)) {
				// 先行実績の場合はどのような場合においてもUPD
				oUpR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
			else {
				if (isNull(cacheR.mfg_act_no())) {
					// 製造実績がない場合、新規
					oUpR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					MCList<MST_ARR_ACT_R> arrL = _arrCacheForHdr.getCache(upR.mfg_inst_no());
					MCList<MST_PURC_ACT_IO_R> purcL = _purcCacheForHdr.getCache(upR.mfg_inst_no());
					if (isNull(arrL) && isNull(purcL)) {
						// 入荷と仕入が両方とも存在しなければDEL
						oUpR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
					else {
						oUpR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					}
				}
			}
		}
		
		protected void setHdrMfgStsTyp(MfgActReg_Upd01_HdrR oUpR,
				FXUCL_Cache<MCList<MST_ARR_SCHD_R>> schdCache, MfgActReg_Upd01_HdrR cacheR) {
			if (MAC_DATA_CRUD_TYP.isDEL(oUpR.data_crud_typ())) {
				return;
			}
			
			if (isPreAct(cacheR)) {
				// 先行実績している場合は、画面で入力した状況を設定する
				oUpR.mfg_sts_typ(cacheR.mfg_sts_typ());
			}
			else {
				MCList<MST_ARR_SCHD_R> schdL = schdCache.getCache(oUpR.mfg_inst_no());
				for (MST_ARR_SCHD_R schdR : schdL) {
					if (!schdR.cmpl_flg() || !schdR.getBooleanNE("purc_cmpl_flg")) {
						// 一件でも未完了があったら着手中
						oUpR.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
						return;
					}
				}
				oUpR.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
			}
		}
		
		protected void setHdrDt(MfgActReg_Upd01_HdrR oUpR, MfgActReg_Upd01_HdrR cacheR) {
			if (MAC_DATA_CRUD_TYP.isDEL(oUpR.data_crud_typ())) {
				return;
			}
			// 入荷実績
			MCList<MST_ARR_ACT_R> arrActL = _arrCacheForHdr.getCache(oUpR.mfg_inst_no());
			// 仕入実績受払
			MCList<MST_PURC_ACT_IO_R> purcActL = _purcCacheForHdr.getCache(oUpR.mfg_inst_no());
			
			// 着手日の設定
			if (isPreAct(cacheR)) {
				// 先行実績している場合、着手日は画面で入力した日付となる
				oUpR.st_act_tm(cacheR.st_act_tm());
				oUpR.st_ac_dt(cacheR.st_ac_dt());
			}
			else {
				MCDate arrMinActTm = null;
				MCDate arrMinAcDt = null;
				MCDate purcMinActTm = null;
				MCDate purcMinAcDt = null;
				
				if (!isNull(arrActL)) {
					arrMinActTm = (MCDate)arrActL.min(MST_ARR_ACT_R.$arr_tm);
					arrMinAcDt = (MCDate)arrActL.min(MST_ARR_ACT_R.$ac_dt);
				}
				if (!isNull(purcActL)) {
					purcMinActTm = (MCDate)purcActL.min(MST_PURC_ACT_R.$purc_dt);
					purcMinAcDt = (MCDate)purcActL.min(MST_PURC_ACT_R.$ac_dt);
				}
				
				oUpR.st_act_tm(getStDt(arrMinActTm, purcMinActTm));
				oUpR.st_ac_dt(getStDt(arrMinAcDt, purcMinAcDt));
			}
			
			// 終了日の設定
			if (MSC_MFG_STS_TYP.isCMPL(oUpR.mfg_sts_typ())) {
				MCDate arrMaxActTm = null;
				MCDate arrMaxAcDt = null;
				MCDate purcMaxActTm = null;
				MCDate purcMaxAcDt = null;
				
				if (!isNull(arrActL)) {
					arrMaxActTm = (MCDate)arrActL.max(MST_ARR_ACT_R.$arr_tm);
					arrMaxAcDt = (MCDate)arrActL.max(MST_ARR_ACT_R.$ac_dt);
				}
				
				if (!isNull(purcActL)) {
					purcMaxActTm = (MCDate)purcActL.max(MST_PURC_ACT_R.$purc_dt);
					purcMaxAcDt = (MCDate)purcActL.max(MST_PURC_ACT_R.$ac_dt);
				}
				
				if (isPreAct(cacheR)) {
					oUpR.end_act_tm(cacheR.end_act_tm());
				}
				else {
					oUpR.end_act_tm(getEndDt(arrMaxActTm, purcMaxActTm));
				}
				// 終了計上日は先行実績であっても（仕掛は入荷・仕入に連動する仕様であり、終了計上日は仕掛の計上日で使用されるため）
				oUpR.end_ac_dt(getEndDt(arrMaxAcDt, purcMaxAcDt));
			}
		}
		
		protected MCDate getStDt(MCDate arrDt, MCDate purcDt) {
			if (isNull(arrDt)) {
				return purcDt;
			}
			if (isNull(purcDt)) {
				return arrDt;
			}
			if (arrDt.lt(purcDt)) {
				return arrDt;
			}
			else {
				return purcDt;
			}
		}
		
		protected MCDate getEndDt(MCDate arrDt, MCDate purcDt) {
			if (isNull(arrDt)) {
				return purcDt;
			}
			if (isNull(purcDt)) {
				return arrDt;
			}
			if (arrDt.gt(purcDt)) {
				return arrDt;
			}
			else {
				return purcDt;
			}
		}
		
		protected void setHdrQty(MfgActReg_Upd01_HdrR oUpR, MfgActReg_Upd01_HdrR cacheR) {
			if (MAC_DATA_CRUD_TYP.isDEL(oUpR.data_crud_typ())) {
				oUpR.base_unit_yield_qty(cacheR.base_unit_yield_qty());
				oUpR.base_unit_dfct_qty(cacheR.base_unit_dfct_qty());
				return;
			}
			
			if (isPreAct(cacheR)) {
				// 先行実績の場合は製造実績画面上で入力した出来高実績の出来高区分に従って設定済みのため、ここでは計算しない
				oUpR.base_unit_yield_qty(cacheR.base_unit_yield_qty());
				oUpR.base_unit_dfct_qty(cacheR.base_unit_dfct_qty());
			}
			else {
				// 先行実績でない場合は、検収不良分を不良としてカウントする
				oUpR.base_unit_yield_qty(MCNumber.ZERO);
				oUpR.base_unit_dfct_qty(MCNumber.ZERO);

				// 仕入実績受払
				MCList<MST_PURC_ACT_IO_R> purcActL = _purcCacheForHdr.getCache(oUpR.mfg_inst_no());
				if (!isNull(purcActL)) {
					for (MST_PURC_ACT_IO_R purcR : purcActL) {
						if (MSC_STK_ID_TYP.isACCPT_DFCT(purcR.stk_id_typ())) {
							oUpR.base_unit_dfct_qty(
									oUpR.base_unit_dfct_qty().add(purcR.base_unit_qty()));
						}
						else {
							oUpR.base_unit_yield_qty(oUpR.base_unit_yield_qty()
									.add(purcR.base_unit_qty()));
						}
					}
				}
			}
		}
		
		protected void setActSrvUpFromCache(MfgActReg_Upd01_HdrR oUpR, MfgActReg_Upd01_HdrR cacheR) {
			oUpR.is_src_outsrc_srv_flg(true);
			
			oUpR.itm_cd(cacheR.itm_cd());
			oUpR.itm_sub1(cacheR.itm_sub1());
			oUpR.itm_sub2(cacheR.itm_sub2());
			oUpR.itm_sub3(cacheR.itm_sub3());
			
			MAM_ITM_R itmR = _itmCache.getEx(oUpR.itm_cd(), oUpR.itm_sub1(), oUpR.itm_sub2(), oUpR.itm_sub3());
			
			oUpR.sno1(cacheR.sno1());
			oUpR.sno2(cacheR.sno2());
			oUpR.sno3(cacheR.sno3());
			oUpR.sno4(cacheR.sno4());
			oUpR.div_seq(cacheR.div_seq());
			oUpR.base_unit_st_act_qty(cacheR.base_unit_st_act_qty());
			oUpR.base_unit_cd(itmR.unit_cd());
			oUpR.mfg_mtd_typ(cacheR.mfg_mtd_typ());
			oUpR.mfg_inst_unit_typ(cacheR.mfg_inst_unit_typ());
			oUpR.bom_ptn(cacheR.bom_ptn());
			oUpR.site_cd(cacheR.site_cd());
			oUpR.wg_cd(cacheR.wg_cd());
			oUpR.itm_mfg_inst_no(cacheR.itm_mfg_inst_no());
			oUpR.arr_purc_auto_reg_flg(cacheR.arr_purc_auto_reg_flg());
			oUpR.aprv_flg(cacheR.aprv_flg());
			oUpR.mfg_aprv_role_cd(cacheR.mfg_aprv_role_cd());
			oUpR.old_mfg_aprv_sts_typ(cacheR.old_mfg_aprv_sts_typ());
			oUpR.old_end_act_tm(cacheR.old_end_act_tm());
			oUpR.mfg_aprv_sts_typ(cacheR.old_mfg_aprv_sts_typ());
			oUpR.aprv_dt(cacheR.getDateNE("act_aprv_dt"));
			oUpR.aprv_dpt_cd(cacheR.aprv_dpt_cd());
			oUpR.aprv_usr_cd(cacheR.aprv_usr_cd());
			oUpR.aprv_tm(cacheR.aprv_tm());
			oUpR.aprv_rsn(cacheR.aprv_rsn());
			oUpR.mfg_loc_cd(cacheR.mfg_loc_cd());
			oUpR.itm_ord_no(cacheR.itm_ord_no());
			
			if (MAC_DATA_CRUD_TYP.isDEL(oUpR.data_crud_typ())) {
				return;
			}
			
			oUpR.inst_lot_no(cacheR.inst_lot_no());
			oUpR.inst_sublot_no(cacheR.inst_sublot_no());
			oUpR.itm_mfg_inst_qty(cacheR.itm_mfg_inst_qty());
			oUpR.act_usr_cd(cacheR.act_usr_cd());
			oUpR.act_dpt_cd(cacheR.act_dpt_cd());
			oUpR.act_rpt_rmrks(cacheR.act_rpt_rmrks());
			oUpR.intr_rmrks(cacheR.intr_rmrks());
			oUpR.mfg_act_sub_char1(cacheR.mfg_act_sub_char1());
			oUpR.mfg_act_sub_char2(cacheR.mfg_act_sub_char2());
			oUpR.mfg_act_sub_char3(cacheR.mfg_act_sub_char3());
			oUpR.itm_yield(cacheR.itm_yield());
			oUpR.sppl_cd(cacheR.sppl_cd());
			oUpR.mfg_str_ln_cd(cacheR.mfg_str_ln_cd());
			
			oUpR.sno1_mng_typ(itmR.sno1_mng_typ());
			oUpR.sno2_mng_typ(itmR.sno2_mng_typ());
			oUpR.sno3_mng_typ(itmR.sno3_mng_typ());
			oUpR.sno4_mng_typ(itmR.sno4_mng_typ());
			oUpR.base_unit_dec_place(itmR.dec_place());
			oUpR.base_unit_conv_rnd_typ(itmR.rnd_typ());
			oUpR.lot_mng_typ(itmR.lot_mng_typ());
			oUpR.lot_no_typ(itmR.lot_no_typ());
			oUpR.lot_no_ptn_cd(itmR.lot_no_ptn_cd());
			oUpR.sublot_mng_typ(itmR.sublot_mng_typ());
			oUpR.sublot_no_typ(itmR.sublot_no_typ());
			oUpR.sublot_no_ptn_cd(itmR.sublot_no_ptn_cd());
			
			if (MAC_DATA_CRUD_TYP.isCRT(oUpR.data_crud_typ())) {
				oUpR.prnt_seq(MCNumber.ONE);
			}
			else {
				if (cacheR.act_prnt_flg()) {
					oUpR.act_prnt_flg(false);
					oUpR.act_prnt_tm(null);
					oUpR.prnt_seq(cacheR.prnt_seq().add(MCNumber.ONE));
				}
				else {
					oUpR.prnt_seq(cacheR.prnt_seq());
				}
			}
		}
		
		/**
		 * 製造実績登録サービスの工程コンテナ、出来高コンテナを作成する
		 */
		protected void setSrvOperAndYieldCont(MSBCL_MfgActRegService.MfgActReg_Upd01 actOpe) {
			// 工程指図キャッシュ（キー：製造指図ＮＯ）
			FXUCL_Cache<MST_OPER_INST_R> operInstCache = getOperInstCache();
			
			// 工程実績キャッシュ（キー：製造指図ＮＯ）
			FXUCL_Cache<MCList<MST_OPER_ACT_R>> operActCacheForHdr = new FXUCL_Cache<MCList<MST_OPER_ACT_R>>();
			operActCacheForHdr.setMaxCacheSize(-1);
			// 工程実績キャッシュ（キー：入荷実績ＮＯ）
			FXUCL_Cache<MST_OPER_ACT_R> operActCacheForArr = new FXUCL_Cache<MST_OPER_ACT_R>();
			operActCacheForArr.setMaxCacheSize(-1);
			// 工程実績キャッシュ（キー：仕入実績受払ＮＯ）
			FXUCL_Cache<MST_OPER_ACT_R> operActCacheForPurc = new FXUCL_Cache<MST_OPER_ACT_R>();
			operActCacheForPurc.setMaxCacheSize(-1);
			setOperActCache(operActCacheForHdr, operActCacheForArr, operActCacheForPurc);
			
			// 出来高予定・実績キャッシュ（キー：製造指図ＮＯ）
			FXUCL_Cache<MCList<MST_YIELD_SCHD_R>> yieldSchdCache = getYieldSchdCache();
			
			MCList<MfgActReg_Upd01_DtlOperR> srvOperL = MCList.create(MfgActReg_Upd01_DtlOperR.class);
			MCList<MfgActReg_Upd01_DtlYieldR> srvYieldL = MCList.create(MfgActReg_Upd01_DtlYieldR.class);
			
			MCIndexKey upIdxkey = up0().createIndex(OutSrcAct_Upd01_ActDR.$mfg_inst_no);
			for (MfgActReg_Upd01_HdrR hdrR : actOpe.up0()) {
				if (isPreAct(hdrR)) {
					// 先行実績の場合
					// ※出来高を製造実績登録サービスに渡す必要はないため、工程コンテナのみ作成する
					setSrvOperAndYieldContPreAct(hdrR, operInstCache, operActCacheForHdr,
							srvOperL);
				}
				else {
					MCList<OutSrcAct_Upd01_ActDR> mfgIngtNoGroupByUpL = up0().subList(upIdxkey, hdrR.mfg_inst_no());
					// 入荷・仕入時自動登録の場合
					setSrvOperAndYieldContAutoReg(hdrR, mfgIngtNoGroupByUpL, operInstCache, operActCacheForHdr,
							operActCacheForArr, operActCacheForPurc, yieldSchdCache,
							srvOperL, srvYieldL);
				}
			}
			
			setPegNo(srvYieldL);
			
			actOpe.up1().addAll(srvOperL);
			actOpe.up5().addAll(srvYieldL);
		}
		
		protected FXUCL_Cache<MST_OPER_INST_R> getOperInstCache() {

			FXUCL_Cache<MST_OPER_INST_R> ret = new FXUCL_Cache<MST_OPER_INST_R>();
			ret.setFixMaxCacheSize(-1);
			
			MCList<MST_OPER_INST_R> oiL = MCList.create(MST_OPER_INST_R.class);
			MST_OPER_INST_R t = MST_OPER_INST_R.create("T");
			MCQueryApiBuilder oiL_bldr = MCQueryApiBuilder.create(t);
			oiL_bldr.setSelect(t.oper_inst_no);
			oiL_bldr.addSelect(t.mfg_inst_no);
			oiL_bldr.addSelect(t.oper_cd);
			oiL_bldr.addSelect(t.oper_std_qty);
			oiL_bldr.addSelect(t.oper_conv_qty);
			oiL_bldr.addSelect(t.oper_unit_conv_rnd_typ);
			oiL_bldr.addSelect(t.oper_unit_dec_place);
			oiL_bldr.addSelect(t.oper_unit_cd);
			oiL_bldr.addSelect(t.disp_seq);
			oiL_bldr.addSelect(t.bkf_flg);
			
			oiL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			
			dbSelect("MSBCL6130_MST_OPER_INST_S01", oiL, oiL_bldr, up0().groupBy(OutSrcAct_Upd01_ActDR.$mfg_inst_no));
			
			for (MST_OPER_INST_R oiR : oiL) {
				// 外注製造指図の場合、必ずデフォルト工程１件のみの想定
				ret.putCache(new String[] {oiR.mfg_inst_no()}, oiR);
			}
			return ret;
		}
		
		protected void setOperActCache(
				FXUCL_Cache<MCList<MST_OPER_ACT_R>> operActCacheForHdr,
				FXUCL_Cache<MST_OPER_ACT_R> operActCacheForArr,
				FXUCL_Cache<MST_OPER_ACT_R> operActCacheForPurc) {
			MST_OPER_INST_R t2 = MST_OPER_INST_R.create("T2");

			MCList<MST_OPER_ACT_R> oaL = MCList.create(MST_OPER_ACT_R.class);
			MST_OPER_ACT_R t = MST_OPER_ACT_R.create("T");
			MCQueryApiBuilder oaL_bldr = MCQueryApiBuilder.create(t);
			oaL_bldr.setSelect(t.oper_act_no);
			oaL_bldr.addSelect(t.arr_act_no);
			oaL_bldr.addSelect(t.purc_act_io_no);
			oaL_bldr.addSelect(t.oper_unit_qty);
			oaL_bldr.addSelect(t.oper_yield);
			oaL_bldr.addSelect(t.intr_rmrks);
			oaL_bldr.addSelect(t.act_rpt_rmrks);
			oaL_bldr.addSelect(t.sub_char1);
			oaL_bldr.addSelect(t.sub_char2);
			oaL_bldr.addSelect(t.sub_char3);
			oaL_bldr.addSelect(t.bkf_ctl_flg);
			oaL_bldr.addSelect(t.mes_id);
			oaL_bldr.addSelect(t.data_no);
			oaL_bldr.addSelect(t.st_act_tm);
			oaL_bldr.addSelect(t.end_act_tm);
			oaL_bldr.addSelect(t.bkf_not_ref_flg);
			oaL_bldr.addSelect(t.ext_sys_cd);
			oaL_bldr.addSelect(t.ext_oper_act_no);
			oaL_bldr.addSelect(t.if_auto_reg_flg);
			
			oaL_bldr.addSelect(t2.mfg_inst_no);
			
			oaL_bldr.addInnerJoin(t2, t.oper_inst_no.eq(t2.oper_inst_no));
			oaL_bldr.setWhere(t2.mfg_inst_no.eq(bind("mfg_inst_no")));
			dbSelect("MSBCL6130_MST_OPER_ACT_S01", oaL, oaL_bldr, up0().groupBy(OutSrcAct_Upd01_ActDR.$mfg_inst_no));
			
			for (MCList<MST_OPER_ACT_R> gL : oaL.groupList("mfg_inst_no")) {
				operActCacheForHdr.putCache(new String[] {gL.get(0).getStringNE("mfg_inst_no")}, gL);
			}
			
			for (MST_OPER_ACT_R oaR : oaL) {
				// 先行実績でない場合、入荷実績・仕入実績受払と工程実績は1:1となる想定
				if (!isNull(oaR.arr_act_no())) {
					operActCacheForArr.putCache(new String[] {oaR.arr_act_no()}, oaR);
				}
				else if (!isNull(oaR.purc_act_io_no())) {
					operActCacheForPurc.putCache(new String[] {oaR.purc_act_io_no()}, oaR);
				}
			}
		}
		
		protected FXUCL_Cache<MCList<MST_YIELD_SCHD_R>> getYieldSchdCache() {

			FXUCL_Cache<MCList<MST_YIELD_SCHD_R>> ret = new FXUCL_Cache<MCList<MST_YIELD_SCHD_R>>();
			ret.setFixMaxCacheSize(-1);
			
			MCList<MST_YIELD_SCHD_R> ysL = MCList.create(MST_YIELD_SCHD_R.class);
			MST_YIELD_SCHD_R t = MST_YIELD_SCHD_R.create("T");
			MST_YIELD_ACT_R t2 = MST_YIELD_ACT_R.create("T2");
			MCQueryApiBuilder ysL_bldr = MCQueryApiBuilder.create(t);
			ysL_bldr.setSelect(t.mfg_inst_no);
			ysL_bldr.addSelect(t.oper_inst_no);
			ysL_bldr.addSelect(t.yield_schd_no);
			ysL_bldr.addSelect(t.yield_typ);
			ysL_bldr.addSelect(t.strg_loc_cd);
			ysL_bldr.addSelect(t.strg_str_ln_cd);
			
			ysL_bldr.addSelect(t2.yield_act_no.as(MST_YIELD_ACT_R.$yield_act_no));
			ysL_bldr.addSelect(t2.oper_act_no.as(MST_YIELD_ACT_R.$oper_act_no));
			
			ysL_bldr.addLeftOuterJoin(t2, t.yield_schd_no.eq(t2.yield_schd_no));
			// 外注に副産品はないため出来高区分は考慮不要
			ysL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			ysL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			
			dbSelect("MSBCL6130_MST_YIELD_SCHD_S01", ysL, ysL_bldr, up0().groupBy(OutSrcAct_Upd01_ActDR.$mfg_inst_no));
			
			for (MCList<MST_YIELD_SCHD_R> gL : ysL.groupList("mfg_inst_no")) {
				ret.putCache(new String[] {gL.get(0).getStringNE("mfg_inst_no")}, gL);
			}
			return ret;
		}
		
		// 工程紐付けＮＯ設定用の変数
		int _operPegCnt = 0;

		protected void setOperPegNo(MfgActReg_Upd01_DtlOperR srvOperR) {
			srvOperR.peg_no(_operPegCnt);
			_operPegCnt++;
		}
		
		protected void setSrvOperAndYieldContPreAct(MfgActReg_Upd01_HdrR srvHdrR,
				FXUCL_Cache<MST_OPER_INST_R> operInstCache,
				FXUCL_Cache<MCList<MST_OPER_ACT_R>> operActCacheForHdr,
				MCList<MfgActReg_Upd01_DtlOperR> srvOperL) {
			MST_OPER_INST_R instR = operInstCache.getCache(srvHdrR.mfg_inst_no());
			MCList<MST_OPER_ACT_R> actL = operActCacheForHdr
					.getCache(srvHdrR.mfg_inst_no());
			
			for (MST_OPER_ACT_R actR : actL) {
				MfgActReg_Upd01_DtlOperR srvOperR = MfgActReg_Upd01_DtlOperR.create();
				srvOperR.setAttributes(srvHdrR);
				setOperPegNo(srvOperR);
				
				srvOperR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());

				srvOperR.oper_inst_no(instR.oper_inst_no());
				srvOperR.oper_act_no(actR.oper_act_no());
				srvOperR.oper_unit_act_qty(actR.oper_unit_qty());
				srvOperR.st_act_tm(actR.st_act_tm());
				srvOperR.bkf_not_ref_flg(actR.bkf_not_ref_flg());
				srvOperR.end_act_tm(actR.end_act_tm());
				srvOperR.ext_sys_cd(actR.ext_sys_cd());
				srvOperR.ext_oper_act_no(actR.ext_oper_act_no());
				srvOperR.if_auto_reg_flg(actR.if_auto_reg_flg());
				// 共通の設定
				setOperContCmnForCrtOrUpd(srvHdrR, srvOperR, instR, actR);
				
				srvOperL.add(srvOperR);
			}
		}
		
		protected void setOperContCmnForCrtOrUpd(MfgActReg_Upd01_HdrR srvHdrR,
				MfgActReg_Upd01_DtlOperR srvOperR, MST_OPER_INST_R instR,
				MST_OPER_ACT_R actR) {
			
			srvOperR.hdr_peg_no(srvHdrR.peg_no());
			srvOperR.oper_cd(instR.oper_cd());
			srvOperR.oper_std_qty(instR.oper_std_qty());
			srvOperR.oper_conv_qty(instR.oper_conv_qty());
			srvOperR.oper_unit_conv_rnd_typ(instR.oper_unit_conv_rnd_typ());
			srvOperR.oper_unit_dec_place(instR.oper_unit_dec_place());
			srvOperR.oper_unit_cd(instR.oper_unit_cd());
			srvOperR.disp_seq(instR.disp_seq());
			srvOperR.bkf_flg(instR.bkf_flg());
			srvOperR.bkf_upd_flg(instR.bkf_flg());
			if (!isNull(actR)) {
				srvOperR.oper_yield(actR.oper_yield());
				srvOperR.oper_act_intr_rmrks(actR.intr_rmrks());
				srvOperR.oper_act_rpt_rmrks(actR.act_rpt_rmrks());
				srvOperR.oper_act_sub_char1(actR.sub_char1());
				srvOperR.oper_act_sub_char2(actR.sub_char2());
				srvOperR.oper_act_sub_char3(actR.sub_char3());
				// 実績が存在する場合は実績の値で上書き
				srvOperR.bkf_upd_flg(actR.bkf_ctl_flg());
				srvOperR.mes_id(actR.mes_id());
				srvOperR.data_no(actR.data_no());
			}
		}
		
		protected void setSrvOperAndYieldContAutoReg(MfgActReg_Upd01_HdrR srvHdrR,
			MCList<OutSrcAct_Upd01_ActDR> mfgIngtNoGroupByUpL,
			FXUCL_Cache<MST_OPER_INST_R> operInstCache,
			FXUCL_Cache<MCList<MST_OPER_ACT_R>> operActCacheForHdr,
			FXUCL_Cache<MST_OPER_ACT_R> operActCacheForArr,
			FXUCL_Cache<MST_OPER_ACT_R> operActCacheForPurc,
			FXUCL_Cache<MCList<MST_YIELD_SCHD_R>> yieldSchdCache,
			MCList<MfgActReg_Upd01_DtlOperR> srvOperL,
			MCList<MfgActReg_Upd01_DtlYieldR> srvYieldL) {
			MST_OPER_INST_R instR = operInstCache.getCache(srvHdrR.mfg_inst_no());
			MCList<MST_OPER_ACT_R> operActL = MCList.create(MST_OPER_ACT_R.class);
			MST_OPER_ACT_R t = MST_OPER_ACT_R.create("T");
			MCQueryApiBuilder operActL_bldr = MCQueryApiBuilder.create(t);
			operActL_bldr.setWhere(t.oper_inst_no.eq(bind("1")), instR.oper_inst_no());
			dbSelect("MSBCL6130_MST_OPER_ACT_S02", operActL, operActL_bldr);
			
			// 入荷実績キャッシュ
			// ※同一製造指図ＮＯ内の入荷実績の件数は多くないので、arrActLはindexKeyを使用せずgetFirstする
			MCList<MST_ARR_ACT_R> arrActL = _arrCacheForHdr.getCache(srvHdrR.mfg_inst_no());
			
			// 仕入実績受払キャッシュ
			// ※同一製造指図ＮＯ内の仕入実績受払の件数は多くないので、purcActLはindexKeyを使用せずgetFirstする
			MCList<MST_PURC_ACT_IO_R> purcActL = _purcCacheForHdr.getCache(srvHdrR.mfg_inst_no());
			
			// 出来高予定・実績キャッシュ
			MCList<MST_YIELD_SCHD_R> yieldSchdL = yieldSchdCache.getCache(srvHdrR.mfg_inst_no());
			
			for (OutSrcAct_Upd01_ActDR upR : mfgIngtNoGroupByUpL) {
				// 工程コンテナ
				MfgActReg_Upd01_DtlOperR srvOperR = MfgActReg_Upd01_DtlOperR.create();
				srvOperR.setAttributes(upR);
				srvOperR.hdr_peg_no(srvHdrR.peg_no());
				setOperPegNo(srvOperR);
				srvOperR.oper_inst_no(instR.oper_inst_no());
				if (instR.bkf_flg()) {
					srvOperR.bkf_not_ref_flg(true);
				}
				srvOperR.setDateNE(OutSrcAct_Upd01_ActDR.$can_ac_dt, upR.can_ac_dt());
				
				// 出来高コンテナ
				MfgActReg_Upd01_DtlYieldR srvYieldR = MfgActReg_Upd01_DtlYieldR.create();
				srvYieldR.setAttributes(upR);
				srvYieldR.hdr_peg_no(srvOperR.hdr_peg_no());
				srvYieldR.oper_peg_no(srvOperR.peg_no());

				MST_YIELD_SCHD_R yieldSchdR;
				if (!isNull(upR.arr_act_no())) {
					// 入荷を元に登録する場合
					MST_OPER_ACT_R actR = operActCacheForArr.getCache(upR.arr_act_no());
					MST_ARR_ACT_R arrR = null;
					if (!isNull(arrActL)) {
						arrR = arrActL.getFirst(MST_ARR_ACT_R.$arr_act_no,
								upR.arr_act_no());
					}
					
					srvOperR.data_crud_typ(getOperDataCrudTypByArrActNo(upR, arrR, actR));
					srvYieldR.data_crud_typ(srvOperR.data_crud_typ());
					
					if (MAC_DATA_CRUD_TYP.isUPD(srvOperR.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isDEL(srvOperR.data_crud_typ())) {
						srvOperR.oper_act_no(actR.oper_act_no());
						
						// 更新・削除の場合、工程実績と出来高実績は１：１の想定
						yieldSchdR = yieldSchdL
								.getFirst(MST_YIELD_ACT_R.$oper_act_no, srvOperR.oper_act_no());
						srvYieldR.yield_act_no(yieldSchdR.getStringNE(MST_YIELD_ACT_R.$yield_act_no));
						
					}
					else {
						// 新規の場合、工程指図と出来高予定は１：１の想定
						yieldSchdR = yieldSchdL
								.getFirst(MST_YIELD_SCHD_R.$oper_inst_no, srvOperR.oper_inst_no());
					}
					srvYieldR.yield_schd_no(yieldSchdR.yield_schd_no());
					
					if (MAC_DATA_CRUD_TYP.isCRT(srvOperR.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(srvOperR.data_crud_typ())) {
						// 共通の設定
						setOperContCmnForCrtOrUpd(srvHdrR, srvOperR, instR, actR);
						
						srvOperR.oper_unit_act_qty(arrR.base_unit_qty());
						// バックフラッシュで使用するため実績日ではなく計上日
						srvOperR.st_act_tm(arrR.ac_dt());
						srvOperR.arr_act_no(upR.arr_act_no());
						
						// 出来高の設定
						setSrvYieldContForCrtOrUpd(srvYieldR, srvOperR, yieldSchdR, arrR, null);
					}
				}
				else {
					// 仕入を元に登録する場合
					MST_OPER_ACT_R actR = operActCacheForPurc.getCache(upR.purc_act_io_no());
					MST_PURC_ACT_IO_R purcR = null;
					if (!isNull(purcActL)) {
						purcR = purcActL.getFirst(
								MST_PURC_ACT_IO_R.$purc_act_io_no, upR.purc_act_io_no());
					}
					
					srvOperR.data_crud_typ(getOperDataCrudTypByPurcActIoNo(upR, purcR, actR));
					srvYieldR.data_crud_typ(srvOperR.data_crud_typ());
					
					if (MAC_DATA_CRUD_TYP.isUPD(srvOperR.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isDEL(srvOperR.data_crud_typ())) {
						srvOperR.oper_act_no(actR.oper_act_no());
						
						yieldSchdR = yieldSchdL
								.getFirst(MST_YIELD_ACT_R.$oper_act_no, srvOperR.oper_act_no());
						srvYieldR.yield_act_no(yieldSchdR.getStringNE(MST_YIELD_ACT_R.$yield_act_no));
					}
					else {
						// 新規の場合、工程指図と出来高予定は１：１の想定
						yieldSchdR = yieldSchdL
								.getFirst(MST_YIELD_SCHD_R.$oper_inst_no, srvOperR.oper_inst_no());
					}
					srvYieldR.yield_schd_no(yieldSchdR.yield_schd_no());

					if (MAC_DATA_CRUD_TYP.isCRT(srvOperR.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(srvOperR.data_crud_typ())) {

						// 共通の設定
						setOperContCmnForCrtOrUpd(srvHdrR, srvOperR, instR, actR);
						
						srvOperR.oper_unit_act_qty(purcR.base_unit_qty());
						MCDate purcDt = purcR.getDateNE(MST_PURC_ACT_R.$ac_dt);
						// バックフラッシュで使用するため実績日ではなく計上日
						srvOperR.st_act_tm(purcDt);
						srvOperR.purc_act_io_no(upR.purc_act_io_no());
						
						// 出来高の設定
						setSrvYieldContForCrtOrUpd(srvYieldR, srvOperR, yieldSchdR, null, purcR);
					}
				}
				
				if (MSC_MFG_STS_TYP.isCMPL(srvHdrR.mfg_sts_typ())) {
					srvOperR.end_act_tm(srvHdrR.end_ac_dt());
				}
				for (MST_OPER_ACT_R operActR : operActL) {
					if (!isNull(srvOperR.oper_act_no()) && isSame(srvOperR.oper_act_no(), operActR.oper_act_no())) {
						continue;
					}
					
					// 同一工程指図ＮＯに対する工程実績ＮＯが登り電文に複数件ある場合、次の関連更新をしない
					boolean upItmFlg = false;
					for (OutSrcAct_Upd01_ActDR tmpUpR : mfgIngtNoGroupByUpL) {
						MST_OPER_ACT_R actR = null;
						if (!isNull(tmpUpR.arr_act_no())) {
							actR = operActCacheForArr.getCache(tmpUpR.arr_act_no());
						}
						else {
							actR = operActCacheForPurc.getCache(tmpUpR.purc_act_io_no());
						}
						if (!isNull(actR) && isSame(actR.oper_act_no(), operActR.oper_act_no())) {
							upItmFlg = true;
							break;
						}
					}

					if (upItmFlg) {
						continue;
					}
					if ((MSC_MFG_STS_TYP.isCMPL(srvHdrR.mfg_sts_typ()) && !isNull(operActR.end_act_tm()) && isSame(operActR.end_act_tm(), srvHdrR.end_ac_dt()))
							|| (!MSC_MFG_STS_TYP.isCMPL(srvHdrR.mfg_sts_typ()) && isNull(operActR.end_act_tm()))) {
						continue;
					}
					
					MfgActReg_Upd01_DtlOperR updSrvOperR = MfgActReg_Upd01_DtlOperR.create();
					updSrvOperR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					updSrvOperR.hdr_peg_no(srvHdrR.peg_no());
					updSrvOperR.oper_inst_no(operActR.oper_inst_no());
					updSrvOperR.oper_act_no(operActR.oper_act_no());
					updSrvOperR.disp_seq(operActR.disp_seq());
					updSrvOperR.st_act_tm(operActR.st_act_tm());
					if (MSC_MFG_STS_TYP.isCMPL(srvHdrR.mfg_sts_typ())) {
						updSrvOperR.end_act_tm(srvHdrR.end_ac_dt());
					}
					updSrvOperR.base_unit_cd(operActR.base_unit_cd());
					updSrvOperR.oper_unit_act_qty(operActR.base_unit_qty());
					updSrvOperR.oper_cd(instR.oper_cd());
					updSrvOperR.oper_std_qty(instR.oper_std_qty());
					updSrvOperR.oper_conv_qty(instR.oper_conv_qty());
					updSrvOperR.oper_unit_conv_rnd_typ(instR.oper_unit_conv_rnd_typ());
					updSrvOperR.oper_unit_dec_place(instR.oper_unit_dec_place());
					updSrvOperR.oper_unit_cd(operActR.oper_unit_cd());
					updSrvOperR.oper_yield(operActR.oper_yield());
					updSrvOperR.bkf_not_ref_flg(operActR.bkf_not_ref_flg());
					updSrvOperR.data_no(operActR.data_no());
					updSrvOperR.mes_id(operActR.mes_id());
					updSrvOperR.oper_act_intr_rmrks(operActR.intr_rmrks());
					updSrvOperR.oper_act_rpt_rmrks(operActR.act_rpt_rmrks());
					updSrvOperR.oper_act_sub_char1(operActR.sub_char1());
					updSrvOperR.oper_act_sub_char2(operActR.sub_char2());
					updSrvOperR.oper_act_sub_char3(operActR.sub_char3());
					updSrvOperR.bkf_upd_flg(operActR.bkf_ctl_flg());
						
					srvOperL.add(updSrvOperR);
				}
				srvOperL.add(srvOperR);
				srvYieldL.add(srvYieldR);
			}
		}
		
		protected String getOperDataCrudTypByArrActNo(OutSrcAct_Upd01_ActDR upR,
				MST_ARR_ACT_R arrR, MST_OPER_ACT_R operActR) {
			// 上り電文のデータ更新区分は入荷や仕入のデータ更新区分であるため、工程実績のデータ更新区分とは一致しないため
			// ここで工程実績としてのデータ更新区分を判定する
			if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
				if (isNull(arrR)) {
					return MAC_DATA_CRUD_TYP.DEL.value();
				}
				else {
					return MAC_DATA_CRUD_TYP.UPD.value();
				}
			}
			else {
				if (isNull(operActR)) {
					return MAC_DATA_CRUD_TYP.CRT.value();
				}
				else {
					return MAC_DATA_CRUD_TYP.UPD.value();
				}
			}
		}
		
		protected String getOperDataCrudTypByPurcActIoNo(OutSrcAct_Upd01_ActDR upR,
				MST_PURC_ACT_IO_R purcR, MST_OPER_ACT_R operActR) {
			// 上り電文のデータ更新区分は入荷や仕入のデータ更新区分であるため、工程実績のデータ更新区分とは一致しないため
			// ここで工程実績としてのデータ更新区分を判定する
			if (MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
				if (isNull(purcR)) {
					return MAC_DATA_CRUD_TYP.DEL.value();
				}
				else {
					return MAC_DATA_CRUD_TYP.UPD.value();
				}
			}
			else {
				if (isNull(operActR)) {
					return MAC_DATA_CRUD_TYP.CRT.value();
				}
				else {
					return MAC_DATA_CRUD_TYP.UPD.value();
				}
			}
		}
		
		protected void setSrvYieldContForCrtOrUpd(MfgActReg_Upd01_DtlYieldR srvYieldR,
				MfgActReg_Upd01_DtlOperR srvOperR, MST_YIELD_SCHD_R yieldSchdR,
				MST_ARR_ACT_R arrR, MST_PURC_ACT_IO_R purcR) {
			
			srvYieldR.yield_typ(yieldSchdR.yield_typ());
			srvYieldR.strg_loc_cd(yieldSchdR.strg_loc_cd());
			srvYieldR.strg_str_ln_cd(yieldSchdR.strg_str_ln_cd());
			srvYieldR.act_tm(srvOperR.st_act_tm());
			srvYieldR.ac_dt(srvOperR.st_act_tm());
			
			if (!isNull(arrR)) {
				srvYieldR.trd_unit_yield_act_qty(arrR.trd_unit_qty());
				srvYieldR.trd_unit_cd(arrR.trd_unit_cd());
				srvYieldR.base_unit_yield_act_qty(arrR.base_unit_qty());
				srvYieldR.base_unit_cd(arrR.base_unit_cd());
				srvYieldR.lot_no(arrR.lot_no());
				srvYieldR.sublot_no(arrR.sublot_no());
				srvYieldR.gd_cd(arrR.gd_cd());
			}
			else {
				srvYieldR.trd_unit_yield_act_qty(purcR.trd_unit_qty());
				srvYieldR.trd_unit_cd(purcR.trd_unit_cd());
				srvYieldR.base_unit_yield_act_qty(purcR.base_unit_qty());
				srvYieldR.base_unit_cd(purcR.base_unit_cd());
				// 未着の場合、仕入実績受払のロットは仮のロットＮＯであるため、出来高には連携しない
				srvYieldR.lot_no(null);
				srvYieldR.sublot_no(null);
				srvYieldR.gd_cd(purcR.gd_cd());
			}
		}
		
		/**
		 * 製造実績登録サービスの投入、ロスコンテナを作成する
		 */
		protected void setSrvInptAndLossCont(MSBCL_MfgActRegService.MfgActReg_Upd01 actOpe) {
			// 工程実績が削除される場合のみ、投入コンテナを削除で設定する
			MCList<MfgActReg_Upd01_DtlOperR> delOperL = actOpe.up1().subList(
					MfgActReg_Upd01_DtlOperR.$data_crud_typ,
					MAC_DATA_CRUD_TYP.DEL.value());
			
			// 投入実績キャッシュ（キー：工程実績ＮＯ）
			FXUCL_Cache<MCList<MST_INPT_ACT_R>> inptActCache = getInptAndLossCache(delOperL);
			
			int inptPegCnt = 0;
			MCList<MfgActReg_Upd01_DtlInptR> vmiInptL = MCList.create(MfgActReg_Upd01_DtlInptR.class);
			for (MfgActReg_Upd01_DtlOperR delOperR : delOperL) {
				MCList<MST_INPT_ACT_R> delInptLossL = inptActCache.getCache(delOperR.oper_act_no());
				if (isNull(delInptLossL)) {
					continue;
				}
				
				for (MCList<MST_INPT_ACT_R> gL : delInptLossL
						.groupList(MST_INPT_ACT_R.$inpt_act_no)) {
					MST_INPT_ACT_R inptActR = gL.get(0);
					
					MfgActReg_Upd01_DtlInptR srvInptR = MfgActReg_Upd01_DtlInptR.create();
					srvInptR.setAttributes(delOperR);
					srvInptR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					srvInptR.hdr_peg_no(delOperR.hdr_peg_no());
					srvInptR.oper_peg_no(delOperR.peg_no());
					srvInptR.peg_no(inptPegCnt);
					inptPegCnt++;
					
					srvInptR.itm_cd(inptActR.itm_cd());
					srvInptR.itm_sub1(inptActR.itm_sub1());
					srvInptR.itm_sub2(inptActR.itm_sub2());
					srvInptR.itm_sub3(inptActR.itm_sub3());
					srvInptR.ver_no(inptActR.ver_no());
					srvInptR.inpt_act_no(inptActR.inpt_act_no());
					srvInptR.inpt_schd_no(inptActR.inpt_schd_no());
					srvInptR.can_ac_dt(delOperR.getDateNE(OutSrcAct_Upd01_ActDR.$can_ac_dt));
					srvInptR.oper_inst_no(delOperR.oper_inst_no());
					
					actOpe.up2().add(srvInptR);
					if (MSC_STK_ID_TYP.isRNT_RCV(inptActR.stk_id_typ())) {
						vmiInptL.add(srvInptR);
					}
					
					for (MST_INPT_ACT_R lossR : gL) {
						String lossActNo = lossR.getStringNE("loss_act_no");
						if (isNull(lossActNo)) {
							continue;
						}
						MfgActReg_Upd01_DtlLossR srvLossR = MfgActReg_Upd01_DtlLossR.create();
						srvLossR.setAttributes(srvInptR);
						srvLossR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						srvLossR.inpt_peg_no(srvInptR.peg_no());
						srvLossR.fxd_loss_flg(lossR.getBooleanNE("fxd_loss_flg"));
						srvLossR.loss_act_no(lossActNo);
						srvLossR.loss_rsn_cd(lossR.getStringNE("loss_rsn_cd"));
						
						actOpe.up3().add(srvLossR);
					}
				}
			}
			
			if (!vmiInptL.isEmpty()) {
				callVmiDelChkSrv(vmiInptL);
			}
			
			callProvDelChkSrv(actOpe.up2());
		}

		protected FXUCL_Cache<MCList<MST_INPT_ACT_R>> getInptAndLossCache(
				MCList<MfgActReg_Upd01_DtlOperR> delOperL) {

			FXUCL_Cache<MCList<MST_INPT_ACT_R>> ret = new FXUCL_Cache<MCList<MST_INPT_ACT_R>>();
			ret.setFixMaxCacheSize(-1);
			
			MCList<MST_INPT_ACT_R> iaL = MCList.create(MST_INPT_ACT_R.class);
			MST_INPT_ACT_R t = MST_INPT_ACT_R.create("T");
			MST_LOSS_ACT_R t2 = MST_LOSS_ACT_R.create("T2");
			MCQueryApiBuilder iaL_bldr = MCQueryApiBuilder.create(t);
			iaL_bldr.setSelect(t.inpt_act_no);
			iaL_bldr.addSelect(t.oper_act_no);
			iaL_bldr.addSelect(t.itm_cd);
			iaL_bldr.addSelect(t.itm_sub1);
			iaL_bldr.addSelect(t.itm_sub2);
			iaL_bldr.addSelect(t.itm_sub3);
			iaL_bldr.addSelect(t.ver_no);
			iaL_bldr.addSelect(t.stk_id_typ);
			iaL_bldr.addSelect(t.inpt_schd_no);
			
			iaL.addBooleanColumn("fxd_loss_flg");
			iaL_bldr.addSelect(t2.loss_act_no);
			iaL_bldr.addSelect(t2.loss_rsn_cd);
			iaL_bldr.addSelect(t2.fxd_loss_flg);
			iaL_bldr.addLeftOuterJoin(t2, t.inpt_act_no.eq(t2.inpt_act_no));
			iaL_bldr.setWhere(t.oper_act_no.eq(bind("oper_act_no")));
			dbSelect("MSBCL6130_MST_INPT_ACT_S01", iaL, iaL_bldr, delOperL);
			
			for (MCList<MST_INPT_ACT_R> gL : iaL.groupList("oper_act_no")) {
				ret.putCache(new String[] {gL.get(0).getStringNE("oper_act_no")}, gL);
			}
			return ret;
		}
		
		protected void callVmiDelChkSrv(MCList<MfgActReg_Upd01_DtlInptR> vmiInptL) {
			// VMIのチェックサービスを実行する（製造実績登録サービスにも同様の処理がある）
			// ※ここではエラーとならないと想定されるが、Upd実行の前提条件としてChkの実行があるため、ここでチェックサービスを実行する
			MSBDL_VmiService.Vmi_Chk01 vmiChkOpe = MSBDL_VmiService.crtVmi_Chk01();
			addAll(vmiChkOpe.up0(), vmiInptL, createMap_Vmi_Chk01_DtlR_MfgActReg_Upd01_DtlInptR());
			vmiChkOpe.exec();
			for (Vmi_Chk01_DtlR vmiDownR : vmiChkOpe.down0()) {
				// 1件でもエラーがあったら終了
				if (vmiDownR.err_flg()) {
					MCAppException e = new MCAppException(msgOpeErr());
					e.addCauseMessageList(MCMessagePool.getMessageList());
					throw e;
				}
			}
		}
		
		protected Map_Vmi_Chk01_DtlR_MfgActReg_Upd01_DtlInptR<Vmi_Chk01_DtlR,MfgActReg_Upd01_DtlInptR> createMap_Vmi_Chk01_DtlR_MfgActReg_Upd01_DtlInptR() {
			return new Map_Vmi_Chk01_DtlR_MfgActReg_Upd01_DtlInptR<Vmi_Chk01_DtlR, MfgActReg_Upd01_DtlInptR>();
		}

		public class Map_Vmi_Chk01_DtlR_MfgActReg_Upd01_DtlInptR<D extends Vmi_Chk01_DtlR, S extends MfgActReg_Upd01_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Vmi_Chk01_DtlR.$peg_no, MfgActReg_Upd01_DtlInptR.$peg_no);
				addColumnPathMap(Vmi_Chk01_DtlR.$purc_src_no, MfgActReg_Upd01_DtlInptR.$inpt_act_no);
				addColumnPathMap(Vmi_Chk01_DtlR.$can_ac_dt, MfgActReg_Upd01_DtlInptR.$can_ac_dt);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				dest.purc_src_typ(MSC_PURC_SRC_TYP.INPT.value());
			}
		}
		
		protected void callProvDelChkSrv(MCList<MfgActReg_Upd01_DtlInptR> srvInptL) {
			// 支給実績のチェック処理を実行する（製造実績登録サービスにも同様の処理がある）
			// エラーとなるのは締チェック位の想定。基本的には入荷・仕入側の締チェックに引っかかるため、ここではエラーとならないと想定されるが
			// Upd実行の前提条件としてChkの実行があるため、ここでチェックサービスを実行する
 			MSBEL_ProvActService.ProvAct_Chk01 provOpe = MSBEL_ProvActService.crtProvAct_Chk01();

 			MCList<MST_PROV_ACT_R> provActL = getProvActL(srvInptL);
			
			MCIndexKey idxkey = provActL.createIndex(MST_PROV_ACT_R.$prov_src_act_no);
			for (MfgActReg_Upd01_DtlInptR upR : srvInptL) {
				MCList<MST_PROV_ACT_R> subL = provActL.subList(idxkey, upR.inpt_act_no());
				// 投入実績１行を元に支給戻しと支給の２行の支給実績が作成される場合があるため、getFirstではなく
				// subListした結果で支給実績のチェック処理を実行する
				for (MST_PROV_ACT_R subR : subL) {
					ProvActChk01_DtlR oUpR = ProvActChk01_DtlR.create();
					copy(oUpR, upR, createMap_ProvActChk01_DtlR_MfgActReg_Upd01_DtlInptR());
					oUpR.prov_typ(subR.prov_typ());
					oUpR.trd_ptn_typ(subR.trd_ptn_typ());
					oUpR.prsppl_cd(subR.prsppl_cd());
					provOpe.up0().add(oUpR);
				}
			}
			if (!provOpe.up0().isEmpty()) {
				provOpe.exec();
				for (ProvActChk01_DtlR provDownR : provOpe.down0()) {
					// 1件でもエラーがあったら終了
					if (provDownR.err_flg()) {
						MCAppException e = new MCAppException(msgOpeErr());
						e.addCauseMessageList(MCMessagePool.getMessageList());
						throw e;
					}
				}
			}
		}
		
		// 支給実績の取得
		protected MCList<MST_PROV_ACT_R> getProvActL(MCList<MfgActReg_Upd01_DtlInptR> srvInptL) {
			MST_PROV_ACT_R t = MST_PROV_ACT_R.create("T");

			MCList<MST_PROV_ACT_R> provActL = MCList.create(MST_PROV_ACT_R.class);
			MCQueryApiBuilder provActL_bldr = MCQueryApiBuilder.create(t);
			provActL_bldr.setSelect(t.prov_src_act_no, t.prov_typ, t.trd_ptn_typ, t.prsppl_cd, t.prov_basis_typ);
			provActL_bldr.setWhere(t.prov_src_act_no.eq(bind("inpt_act_no")));
			provActL_bldr.addWhereWithAnd(t.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.INPT.value())));
			provActL_bldr.addWhereWithAnd(t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			provActL_bldr.setOrderByAsc(provActL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdate("MSBCL6130_MST_PROV_ACT_S01", provActL, provActL_bldr, srvInptL);
			return provActL;
		}
		
		protected Map_ProvActChk01_DtlR_MfgActReg_Upd01_DtlInptR<ProvActChk01_DtlR,MfgActReg_Upd01_DtlInptR> createMap_ProvActChk01_DtlR_MfgActReg_Upd01_DtlInptR() {
			return new Map_ProvActChk01_DtlR_MfgActReg_Upd01_DtlInptR<ProvActChk01_DtlR, MfgActReg_Upd01_DtlInptR>();
		}

		public class Map_ProvActChk01_DtlR_MfgActReg_Upd01_DtlInptR<D extends ProvActChk01_DtlR, S extends MfgActReg_Upd01_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ProvActChk01_DtlR.$peg_no, MfgActReg_Upd01_DtlInptR.$peg_no);
				addColumnPathMap(ProvActChk01_DtlR.$data_crud_typ, MfgActReg_Upd01_DtlInptR.$data_crud_typ);
				addColumnPathMap(ProvActChk01_DtlR.$can_ac_dt, MfgActReg_Upd01_DtlInptR.$can_ac_dt);
				addColumnPathMap(ProvActChk01_DtlR.$prov_src_act_no, MfgActReg_Upd01_DtlInptR.$inpt_act_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.INPT.value());
			}
		}

	}
	/**
	 * OutSrcAct_Sprt02オペレーション.<p>
	 *
	 * 製造指図ＮＯを受け取り、購買区分・製造実績ＮＯを返す<br>
	 */
	public class OutSrcAct_Sprt02 extends MSBCL_OutSrcActService_MC_A.OutSrcAct_Sprt02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MCList<MST_MFG_INST_R> miL = getMfgInst();
			
			MCIndexKey idxkey = miL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
			for (OutSrcAct_Sprt02_CndR r : up0()) {
				OutSrcAct_Sprt02_RsltR downR = OutSrcAct_Sprt02_RsltR.create();
				downR.peg_no(r.peg_no());
				MST_MFG_INST_R miR = miL.getFirst(idxkey, r.mfg_inst_no());
				if (!isNull(miR)) {
					downR.mfg_act_no(miR.getStringNE("mfg_act_no"));
					
					MCNumber amt = miR.getNumberNE("trd_cur_onr_prov_amt");
					if (!isNull(amt) && amt.isPositive()) {
						downR.purc_typ(MAC_PURC_TYP.OUTSRC_ITM_ONR_SS.value());
					}
					else {
						downR.purc_typ(MAC_PURC_TYP.OUTSRC_ITM_FFR.value());
					}
				}
				else {
					downR.purc_typ(MAC_PURC_TYP.OUTSRC_ITM_FFR.value());
				}
				
				down0().add(downR);
			}
		}
		
		protected MCList<MST_MFG_INST_R> getMfgInst() {
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			MST_PO_D_R t2 = MST_PO_D_R.create("T2");
			MST_MFG_ACT_R t3 = MST_MFG_ACT_R.create("T3");
			MST_PO_R t4 = MST_PO_R.create("T4");
			MAM_BP_R m = MAM_BP_R.create("M");

			MCList<MST_MFG_INST_R> ret = MCList.create(MST_MFG_INST_R.class);
			ret.addBooleanColumn("onr_prsppl_flg");

			MCQueryApiBuilder ret_bldr = MCQueryApiBuilder.create(t);
			ret_bldr.setSelect(t.mfg_inst_no);
			ret_bldr.addSelect(t3.mfg_act_no);
			ret_bldr.addSelect(t2.trd_cur_onr_prov_amt);
			ret_bldr.addSelect(m.onr_prsppl_flg, m.outsrc_upri_typ);
			ret_bldr.addInnerJoin(t2, t.po_d_no.eq(t2.po_d_no));
			ret_bldr.addLeftOuterJoin(t3, t.mfg_inst_no.eq(t3.mfg_inst_no));
			ret_bldr.addLeftOuterJoin(t4, t2.po_no.eq(t4.po_no));
			ret_bldr.addLeftOuterJoin(m, t4.sppl_cd .eq(m.bp_cd));
			ret_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			dbSelect("MSBCL6130_MST_MFG_INST_S02", ret, ret_bldr, up0());

			// 有償支給先オン、かつ外注単価区分が得意先マスタに設定されていなかった場合、会社マスタから設定
			for (MST_MFG_INST_R retR : ret) {
				if (retR.getBooleanNE("onr_prsppl_flg") && isNull(retR.getStringNE("outsrc_upri_typ"))) {
					retR.setStringNE("outsrc_upri_typ", getCo().outsrc_upri_typ());
				}
			}

			// 上記の処理で取得される外注単価区分が2：加工単価の製造指図のみ、後続の処理の対象にする
			MCList<MST_MFG_INST_R> tgtL = MCList.create(MST_MFG_INST_R.class);
			MCList<MST_MFG_INST_R> resultL = MCList.create(MST_MFG_INST_R.class);
			tgtL = ret.subList(r -> MAC_OUTSRC_UPRI_TYP.isPROC(r.getStringNE("outsrc_upri_typ")));

			if (!tgtL.isEmpty()) {
				// 取引通貨有償支給金額はnullの場合もあるため、0で初期化する
				tgtL.setNumberNE("trd_cur_onr_prov_amt", MCNumber.ZERO);

				MST_MFG_INST_R inst = MST_MFG_INST_R.create("INST");
				MST_MFG_ACT_R act = MST_MFG_ACT_R.create("ACT");
				MST_INPT_SCHD_R inpt = MST_INPT_SCHD_R.create("INPT");
				MST_PO_D_R pod = MST_PO_D_R.create("POD");
				MST_PO_R po = MST_PO_R.create("PO");
				MAM_LOC_R loc = MAM_LOC_R.create("LOC");

				MCQueryApiBuilder mstMfgInstL_bldr = MCQueryApiBuilder.create(inst);
				mstMfgInstL_bldr.setSelect(inst.mfg_inst_no, act.mfg_act_no);
				mstMfgInstL_bldr.addSelect(inpt.itm_cd, inpt.itm_sub1, inpt.itm_sub2, inpt.itm_sub3);
				mstMfgInstL_bldr.addSelect(po.sppl_cd, po.trd_cur_cd);
				mstMfgInstL_bldr.addSelect(pod.purc_upri_req_typ, po.po_dt, pod.dlv_rqst_tm, pod.purc_schd_dt);
				mstMfgInstL_bldr.addSelect(loc.wg_cd);

				mstMfgInstL_bldr.addLeftOuterJoin(act, inst.mfg_inst_no.eq(act.mfg_inst_no));
				mstMfgInstL_bldr.addLeftOuterJoin(inpt, inst.mfg_inst_no.eq(inpt.mfg_inst_no));
				mstMfgInstL_bldr.addLeftOuterJoin(pod, inst.po_d_no.eq(pod.po_d_no));
				mstMfgInstL_bldr.addLeftOuterJoin(po, pod.po_no.eq(po.po_no));
				mstMfgInstL_bldr.addLeftOuterJoin(loc, pod.in_to_loc_cd.eq(loc.loc_cd));

				mstMfgInstL_bldr.setWhere(inst.mfg_inst_no.eq(bind("mfg_inst_no")));
				mstMfgInstL_bldr.addWhereWithAnd(inpt.can_flg.eq(value(false)));
				dbSelect("MSBCL6130_MST_MFG_INST_S03", resultL, mstMfgInstL_bldr, tgtL);

				MCIndexKey resultLMfgInstNoIdxKey = resultL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
				MCList<MAM_PROV_UPRI_R> bindL = MCList.create(MAM_PROV_UPRI_R.class);
				for (MST_MFG_INST_R r :tgtL) {
					MCList<MST_MFG_INST_R> resultSubL = resultL.subList(resultLMfgInstNoIdxKey, r.mfg_inst_no());
					for (MST_MFG_INST_R resultR :resultSubL) {
						MAM_PROV_UPRI_R bindR = MAM_PROV_UPRI_R.create();

						bindR.addStringColumn("mfg_inst_no", r.mfg_inst_no());
						bindR.itm_cd(resultR.getStringNE(MST_INPT_SCHD_R.$itm_cd));
						bindR.itm_sub1(resultR.getStringNE(MST_INPT_SCHD_R.$itm_sub1));
						bindR.itm_sub2(resultR.getStringNE(MST_INPT_SCHD_R.$itm_sub2));
						bindR.itm_sub3(resultR.getStringNE(MST_INPT_SCHD_R.$itm_sub3));
						bindR.prsppl_cd(resultR.getStringNE(MST_PO_R.$sppl_cd));
						bindR.cur_cd(resultR.getStringNE(MST_PO_R.$trd_cur_cd));
						bindR.wg_cd(resultR.getStringNE(MAM_LOC_R.$wg_cd));

						if (MAC_PURC_UPRI_REQ_TYP.isPO_DT(resultR.getStringNE(MST_PO_D_R.$purc_upri_req_typ))) {
							bindR.st_dt(resultR.getDateNE(MST_PO_R.$po_dt));
						}
						else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_DLV_DT(resultR.getStringNE(MST_PO_D_R.$purc_upri_req_typ))) {
							bindR.st_dt(resultR.getDateNE(MST_PO_D_R.$dlv_rqst_tm));
						}
						else if (MAC_PURC_UPRI_REQ_TYP.isSCHD_PURC_DT(resultR.getStringNE(MST_PO_D_R.$purc_upri_req_typ))) {
							bindR.st_dt(resultR.getDateNE(MST_PO_D_R.$purc_schd_dt));
						}

						bindL.add(bindR);
					}
				}

				MAM_PROV_UPRI_R pro = MAM_PROV_UPRI_R.create("PRO");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(pro);
				dbc_bldr.setSelect(pro.itm_cd);
				dbc_bldr.addSelect(pro.prov_typ);
				dbc_bldr.addSelect(pro.upri);
				FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R> provUpriCache = new FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R>(
						dbc_bldr, bindL, MAM_PROV_UPRI_R.$itm_cd,
						MAM_PROV_UPRI_R.$itm_sub1, MAM_PROV_UPRI_R.$itm_sub2,
						MAM_PROV_UPRI_R.$itm_sub3, MAM_PROV_UPRI_R.$prsppl_cd,
						MAM_PROV_UPRI_R.$cur_cd, MAM_PROV_UPRI_R.$wg_cd);

				MCIndexKey retMfgInstNoIdxKey = ret.createIndex(MST_MFG_INST_R.$mfg_inst_no);

				for (MAM_PROV_UPRI_R bindR : bindL) {
					MAM_PROV_UPRI_R upriR = provUpriCache.get(bindR.st_dt(), bindR.itm_cd(), bindR.itm_sub1(),
							bindR.itm_sub2(), bindR.itm_sub3(), bindR.prsppl_cd(),
							bindR.cur_cd(), bindR.wg_cd());
					if (isNull(upriR.itm_cd())) {
						continue;
					}
					if (isSame(upriR.prov_typ(), MAC_PROV_TYP.ONR_PROV.value())) {
						// この処理でretに設定される"trd_cur_onr_prov_amt"は、購買区分を設定する判断基準を目的として取得されており、
						// 正確な取引通貨有償支給金額ではない
						MST_MFG_INST_R retR = ret.getFirst(retMfgInstNoIdxKey, bindR.getStringNE("mfg_inst_no"));
						MCNumber trd_cur_onr_prov_amt = retR.getNumberNE("trd_cur_onr_prov_amt");
						trd_cur_onr_prov_amt = trd_cur_onr_prov_amt.add(upriR.upri());
						retR.setNumberNE("trd_cur_onr_prov_amt", trd_cur_onr_prov_amt);
					}
				}
			}
			return ret;
		}
	}

	//FMCB CUSTOM END
}