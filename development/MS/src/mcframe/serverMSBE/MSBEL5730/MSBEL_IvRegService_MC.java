package mcframe.serverMSBE.MSBEL5730;

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
import mcframe.serverMAUC.MAUCL5020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5730.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBE.MSBEL5730.Query.*;
import java.util.List;

import mcframe.serverMSBE.MSBEL5500.*;
import mcframe.serverMSBE.MSBEL5720.*;
import mcframe.serverMSBB.MSBBL6220.*;
import mcframe.serverMSBB.MSBBL6080.*;
import mcframe.serverMSBE.MSBEL5010.*;

import static mcframe.serverMSUC.MSUCL0070.MSUCL_StkUtil.*;
import static mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil.*;

import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverMBBC.MBBCL5020.*;
import mcframe.serverMSBG.MSBGL5080.*;
import mcframe.serverMSUC.MSUCL0130.*;
import mcframe.serverMSBI.MSBIL5010.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_IvRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_IvRegService_MC extends MSBEL_IvRegService_MC_A{
	//FMCB CUSTOM START
	/**
	 * キャッシュを管理するリクエストオブジェクト
	 */
	protected static final Class<MSBEL_IvRegService> CLAZZ = MSBEL_IvRegService.class;
	
	/**
	 * インボイスヘッダのキャシュー
	 */
	protected MST_IV_R _cacheIvR = null;
	
	protected static void initIvCache(Iv_Chk01_HdrR hdrR) {
		object(CLAZZ)._initIvCache(hdrR);
	}
	
	protected void _initIvCache(Iv_Chk01_HdrR hdrR) {
		_cacheIvR = MST_IV_R.create();
		_cacheIvR.addNumberColumn(MAM_CUR_R.$amt_dec_place);
		_cacheIvR.addStringColumn(MAM_BP_R.$sls_amt_rnd_typ);
		MST_IV_R iv = MST_IV_R.create("IV");
		MAM_CUR_R cur = MAM_CUR_R.create("CUR");
		MAM_BP_R cst = MAM_BP_R.create("CST");
		MCQueryApiBuilder _cacheIvR_bldr = MCQueryApiBuilder.create(iv);
		_cacheIvR_bldr.addSelect(cur.amt_dec_place, cst.sls_amt_rnd_typ);
		_cacheIvR_bldr.addLeftOuterJoin(cur, iv.trd_cur_cd.eq(cur.cur_cd));
		_cacheIvR_bldr.addLeftOuterJoin(cst, iv.ship_rqst_id_cd.eq(cst.bp_cd));
		_cacheIvR_bldr.setLockTable(iv.iv_mng_no);
		dbSelectKeyForUpdateNoWait("MSBEL5730_MST_IV_S01", _cacheIvR, _cacheIvR_bldr, hdrR);
	}
	
	protected static MST_IV_R getIvCache() {
		return object(CLAZZ)._getIvCache();
	}
	
	protected MST_IV_R _getIvCache() {
		return _cacheIvR;
	}
	
	/**
	 * インボイス明細のキャシュー
	 */
	protected MCList<MST_IV_D_R> _cacheIvDL = null;
	protected MCIndexKey _ivDIndexKey = null;
	
	protected static void initIvDCache(Iv_Chk01_HdrR hdrR) {
		object(CLAZZ)._initIvDCache(hdrR);
	}
	
	protected void _initIvDCache(Iv_Chk01_HdrR hdrR) {
		_cacheIvDL = MCList.create(MST_IV_D_R.class);
		_cacheIvDL.addBooleanColumn(MAM_ITM_R.$dscnt_itm_flg);
		MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
		MAM_ITM_R itm = MAM_ITM_R.create("ITM");
		MCQueryApiBuilder _cacheIvDL_bldr = MCQueryApiBuilder.create(ivD);
		_cacheIvDL_bldr.addSelect(itm.dscnt_itm_flg);
		_cacheIvDL_bldr.addLeftOuterJoin(itm, ivD.itm_cd.eq(itm.itm_cd).and(ivD.itm_sub1.eq(itm.itm_sub1).and(ivD.itm_sub2.eq(itm.itm_sub2).and(ivD.itm_sub3.eq(itm.itm_sub3)))));
		_cacheIvDL_bldr.setWhere(ivD.iv_mng_no.eq(bind("1")), hdrR.iv_mng_no());
		_cacheIvDL_bldr.setLockTable(ivD.iv_d_no);
		dbSelectForUpdate("MSBBL6020_MST_IV_D_S01", _cacheIvDL, _cacheIvDL_bldr);
		
		_ivDIndexKey = _cacheIvDL.createIndex(MST_IV_D_R.$iv_d_no);
	}
	
	protected static MST_IV_D_R getFirstIvDCache(String ivDNo) {
		return object(CLAZZ)._getFirstIvDCache(ivDNo);
	}	
	
	protected MST_IV_D_R _getFirstIvDCache(String ivDNo) {
		return _cacheIvDL.getFirst(_ivDIndexKey, ivDNo);
	}
	
	protected static MCList<MST_IV_D_R> getIvDCache() {
		return object(CLAZZ)._getIvDCache();
	}	
	
	protected MCList<MST_IV_D_R> _getIvDCache() {
		return _cacheIvDL;
	}
	
	/**
	 * インボイス出荷実績マップリスト
	 */
	protected MCList<MST_IV_SHIP_ACT_MAP_R> _ivShipActMapCacheL = null;
	protected static void initIvShipActMapCache(MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL, MCList<Iv_Upd03_Ctrl2R> up1) {
		object(CLAZZ)._initIvShipActMapCache(ivShipActMapL, up1);
	}
	
	protected void _initIvShipActMapCache(MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL, MCList<Iv_Upd03_Ctrl2R> up1) {
		_ivShipActMapCacheL = ivShipActMapL;
		setCanAcDt(_ivShipActMapCacheL, up1);
	}
	
	protected static MCList<MST_IV_SHIP_ACT_MAP_R> getIvShipActMapCache() {
		return object(CLAZZ)._getIvShipActMapCache();
	}
	
	protected MCList<MST_IV_SHIP_ACT_MAP_R> _getIvShipActMapCache() {
		return _ivShipActMapCacheL;
	}
	
	/**
	 * インボイス出荷実績マップリスト(訂正前)
	 */
	protected MCList<MST_IV_SHIP_ACT_MAP_R> _orgIvShipActMapCacheL = null;
	protected static void initOrgIvShipActMapCache(MCList<MST_IV_SHIP_ACT_MAP_R> orgIvShipActMapL, MCList<Iv_Upd03_Ctrl2R> up1) {
		object(CLAZZ)._initOrgIvShipActMapCache(orgIvShipActMapL, up1);
	}
	
	protected void _initOrgIvShipActMapCache(MCList<MST_IV_SHIP_ACT_MAP_R> orgIvShipActMapL, MCList<Iv_Upd03_Ctrl2R> up1) {
		_orgIvShipActMapCacheL = orgIvShipActMapL;
		setCanAcDt(_orgIvShipActMapCacheL, up1);
	}
	
	protected void  setCanAcDt(MCList<MST_IV_SHIP_ACT_MAP_R> orgIvShipActMapL, MCList<Iv_Upd03_Ctrl2R> up1) {
		MCIndexKey idxByShipActDNo = orgIvShipActMapL.createIndex(MST_IV_SHIP_ACT_MAP_R.$ship_act_d_no);
		orgIvShipActMapL.addDateColumn(Iv_Upd03_Ctrl2R.$can_ac_dt);
		for (Iv_Upd03_Ctrl2R upR : up1) {
			orgIvShipActMapL.subList(idxByShipActDNo, upR.ship_act_d_no()).setDate(Iv_Upd03_Ctrl2R.$can_ac_dt, upR.can_ac_dt());
		}
	}
	
	protected static MCList<MST_IV_SHIP_ACT_MAP_R> getOrgIvShipActMapCache() {
		return object(CLAZZ)._getOrgIvShipActMapCache();
	}
	
	protected MCList<MST_IV_SHIP_ACT_MAP_R> _getOrgIvShipActMapCache() {
		return _orgIvShipActMapCacheL;
	}
	/**
	 * Iv_Chk01オペレーション.<p>
	 *
	 * 登録前のチェック処理を行う。<br>
	 */
	public class Iv_Chk01 extends MSBEL_IvRegService_MC_A.Iv_Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			if (hasErr()) {
				return;
			}

			setDown();
		}

		@Override
		protected void init() {
			setSnoNull();
			
			// キャッシュの初期化
			initCache();

			if(!up0().dlv_sundry_flg()) {
				//納品先の住所をインボイス日付を基準日として、もう一度設定する
				resetDlvAddr();
			}
			
			if(!up0().tdlv_sundry_flg() && !isNull(up0().tdlv_cd())) {
				//配送先の住所をインボイス日付を基準日として、もう一度設定する
				resetTdlvAddr();
			}
		}

		protected void setSnoNull() {
			for(Iv_Chk01_DtlR r : up1()) {
				if(isNull(r.sno1())) {
					r.sno1(MAC_STR.NULL_VAL.value());
				}
				if(isNull(r.sno2())) {
					r.sno2(MAC_STR.NULL_VAL.value());
				}
				if(isNull(r.sno3())) {
					r.sno3(MAC_STR.NULL_VAL.value());
				}
				if(isNull(r.sno4())) {
					r.sno4(MAC_STR.NULL_VAL.value());
				}
			}
		}

		protected void initCache() {
			initIvCache(up0());
			initIvDCache(up0());
			doBpCache(up0());
			doLocCache(up0());
		}
		
		protected void resetDlvAddr() {

			if(MSC_DLV_ID_TYP.isDLV(up0().dlv_id_typ())) {
				MAM_BP_R bpR = _bpAddrCache.get(up0().dlv_id_cd());

				up0().dlv_zip_cd(bpR.getStringNE("zip_cd"));
				up0().dlv_addr1(bpR.getStringNE("addr1"));
				up0().dlv_addr2(bpR.getStringNE("addr2"));
				up0().dlv_addr3(bpR.getStringNE("addr3"));
				up0().dlv_addr4(bpR.getStringNE("addr4"));
				up0().dlv_tel(bpR.getStringNE("tel"));
				up0().dlv_fax(bpR.getStringNE("fax"));
				up0().dlv_cntct_dpt(bpR.getStringNE("cntct_dpt"));
				up0().dlv_cntct_psn(bpR.getStringNE("cntct_psn"));
			}
			else {
				MAM_LOC_R locR = _locAddrCache.get(up0().dlv_id_cd());

				up0().dlv_zip_cd(locR.getStringNE("zip_cd"));
				up0().dlv_addr1(locR.getStringNE("addr1"));
				up0().dlv_addr2(locR.getStringNE("addr2"));
				up0().dlv_addr3(locR.getStringNE("addr3"));
				up0().dlv_addr4(locR.getStringNE("addr4"));
				up0().dlv_tel(locR.getStringNE("tel"));
				up0().dlv_fax(locR.getStringNE("fax"));
			}
		}

		protected void resetTdlvAddr() {

			MAM_BP_R bpR = _bpAddrCache.get(up0().tdlv_cd());

			up0().tdlv_zip_cd(bpR.getStringNE("zip_cd"));
			up0().tdlv_addr1(bpR.getStringNE("addr1"));
			up0().tdlv_addr2(bpR.getStringNE("addr2"));
			up0().tdlv_addr3(bpR.getStringNE("addr3"));
			up0().tdlv_addr4(bpR.getStringNE("addr4"));
			up0().tdlv_tel(bpR.getStringNE("tel"));
			up0().tdlv_fax(bpR.getStringNE("fax"));
			up0().tdlv_cntct_dpt(bpR.getStringNE("cntct_dpt"));
			up0().tdlv_cntct_psn(bpR.getStringNE("cntct_psn"));
		}

		@Override
		protected MCMessageList updCntChkReq() {
			MCMessageList msgL =  super.updCntChkReq();
			
			for (Iv_Chk01_DtlR dltR : up1()) {
				if (dltR.uplnd_flg() || dltR.manual_add_flg()) {
					continue;
				}
				msgL.addAll(check(dltR, Iv_Chk01_DtlR.$ship_pr_upd_cntr, new FXUCL_RequiredValidater()));
			}
			
			return msgL;
		}
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			chkUpdCntrShipPr(msgL);
			
			// インボイス登録対象選択画面から遷移して新規登録する際は、インボイスの更新カウンタチェックは必要なし
			if(msgL.isEmpty() && up0().iv_upd_cntr().intValue() != -1) {
				chkUpdCntrIv(msgL);
			}
			
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheck() {
			MCMessageList msgL = super.doServerCheck();

			checkReq(msgL);

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			checkSub(msgL);

			return msgL;
		}

		/**
		 * インボイスヘッダに対する更新カウンタチェック
		 */
		protected void chkUpdCntrIv(MCMessageList msgL) {
			
			MST_IV_R ivR = getIvCache();
			// 売上実績登録画面で計画外の実績を訂正する際に、電文が分割された場合に、複数回呼ばれる時がある。
			// 上記の画面で売上実績の更新カウンターを行うため、インボイスの更新カウンタチェックは必要なし。
			if (!MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())) {
				msgL.addAll(checkUpdCntrNE(up0(), Iv_Chk01_HdrR.$iv_upd_cntr, ivR));
			}
			if (msgL.isEmpty() && !isNull(ivR) && (!MSC_IV_SRC_TYP.isRCPT_IV(ivR.iv_src_typ()) || !ivR.iv_rev().isZero())) {
				up0().iv_rev(ivR.iv_rev());
				up0().iv_src_typ(ivR.iv_src_typ());
				up0().via_dlv_typ(ivR.via_dlv_typ());
				up0().trd_ptn_typ(ivR.trd_ptn_typ());
				callRevDataIns01(ivR);
			}
		}
		
		/**
		 * 出荷進捗に対する更新カウンタチェック
		 */
		protected void chkUpdCntrShipPr(MCMessageList msgL) {
			MCList<Iv_Chk01_DtlR> chkL = up1().subList(
					new String[]{Iv_Chk01_DtlR.$existed_flg, Iv_Chk01_DtlR.$manual_add_flg, Iv_Chk01_DtlR.$uplnd_flg}, 
					new Comparable[]{true, false, false});
			
			if (chkL.isEmpty()) {
				return;
			}

			MCList<MST_SHIP_PR_R> prL = MCList.create(MST_SHIP_PR_R.class);
			MST_SHIP_PR_R t = MST_SHIP_PR_R.create("T");
			MCQueryApiBuilder prL_bldr = MCQueryApiBuilder.create(t);
			prL_bldr.setSelect(t.ship_pr_no, t.upd_cntr);
			prL_bldr.setOrderByAsc(prL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdateNoWait("MSBEL5730_MST_SHIP_PR_S01", prL, prL_bldr, chkL);
			
			MCIndexKey ik = prL.createIndex(MST_SHIP_PR_R.$ship_pr_no);
			
			for (Iv_Chk01_DtlR chkR : chkL) {
				MST_SHIP_PR_R prR = prL.getFirst(ik, chkR.ship_pr_no());
				MCMessageList tmp = checkUpdCntrNE(chkR, Iv_Chk01_DtlR.$ship_pr_upd_cntr, prR);
				
				if (!tmp.isEmpty()) {
					msgL.addAll(tmp);
					break;
				}
			}
		}
		
		/**
		 * 条件付き必須チェックを行う。
		 */
		protected void checkReq(MCMessageList msgL) {
			
			if (MAC_TRD_PTN_TYP.isSLS(up0().trd_ptn_typ())) {
				msgL.addAll(check(up1(), Iv_Chk01_DtlR.$trd_cur_upri, new FXUCL_RequiredValidater()));
			}
		}

		protected void checkSub(MCMessageList msgL) {
			
			// ＤＡＣチェック
			msgL.addAll(checkDac(up0(), up1(), false));
			
			//輸出禁止チェック(品目)
			msgL.addAll(checkStopEx());

			//納品先住所１の必須チェック

			//受注時にインボイスＮＯが登録された場合のチェック
			if(up0().is_slo_iv_no()) {
				msgL.addAll(checkSloIv());
			}

			//インボイス表記品名必須チェック
			for (Iv_Chk01_DtlR r : up1()) {
				if (r.isStatusDelete()) {
					continue;
				}
				msgL.addAll(check(r, Iv_Chk01_DtlR.$iv_itm_nm, new FXUCL_RequiredValidater()));
			}

			//インボイス単位出荷チェック
			msgL.addAll(checkIvShip());
			msgL.addAll(checkIvQty());
			
			//仮受注チェック
			msgL.addAll(checkPreSlo());
		}

		/**
		 * 	輸出禁止チェック(品目)
		 * @return
		 */
		protected MCMessageList checkStopEx() {
			MCMessageList msgL = new MCMessageList();

			for(Iv_Chk01_DtlR dR : up1()) {
				if (dR.isStatusDelete()) {
					continue;
				}
				
				Iv_Chk01_DtlR r = Iv_Chk01_DtlR.create();
				MCRow.copyall(r, dR);
				r.addStringColumn(Iv_Chk01_HdrR.$dlv_cntry_cd, up0().dlv_cntry_cd());
				r.addDateColumn(Iv_Chk01_HdrR.$iv_dt, up0().iv_dt());
		
				boolean rslt = execFuncBoolean(createSqlId(LOGIC_ID, "MAPA_ITM$F_IS_EX_STOP", "01"), MAPA_ITM$F_IS_EX_STOP( bind("itm_cd"), bind("itm_sub1"), bind("itm_sub2"), bind("itm_sub3"), bind("dlv_cntry_cd"), bind("iv_dt")), r);
				if (rslt) {
					msgL.add(new MCMessage(
							r, null, MSBEL0018, 
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), 
							r.getStringNE(Iv_Chk01_HdrR.$dlv_cntry_cd), toDispGUIIndex(r)));
				}
			}
			
			return msgL;
		}

		/**
		 * 	受注時にインボイスＮＯが登録された場合のチェック（同一受注でインボイスにまとまっていない出荷予定が残されている場合はＮＧ）
		 */
		protected MCMessageList checkSloIv() {
			
			MCMessageList msgL = new MCMessageList();
			String shipSchdNo = getDeleteSchdNo();

			insShipSchdWk();

			MCList<MST_SHIP_SCHD_R> list = MCList.create(MST_SHIP_SCHD_R.class);
			executeQuery(list, MSBEL5730_CHECK_IV_SHIP_S04(), up0());
			if(list.size() > 0) {
				if(isNull(shipSchdNo)) {
					shipSchdNo = list.get(0).getStringNE(MST_SHIP_SCHD_R.$ship_schd_no);
				}
				else {
					shipSchdNo += ",";
					shipSchdNo += list.get(0).getStringNE(MST_SHIP_SCHD_R.$ship_schd_no);
				}
				for(int i = 1; i < list.size(); i ++) {
					shipSchdNo += ",";
					shipSchdNo += list.get(i).getStringNE(MST_SHIP_SCHD_R.$ship_schd_no);
				}
			}

			if(!isNull(shipSchdNo)) {
				msgL.add(new MCMessage(MSBEL0202, shipSchdNo));
			}
			
			return msgL;
		}

		protected void insShipSchdWk() {
			MCList<MST_SHIP_SCHD_R> insWkL = MCList.create(MST_SHIP_SCHD_R.class);
			MCQueryApiBuilder insWkL_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
			dbWkDelete("MSBEL5730_MSW_SHIP_SCHD_D01", insWkL_bldr.getBaseDbc());

			MCList<Iv_Chk01_DtlR> ivDL = MCList.create(Iv_Chk01_DtlR.class);
			for(Iv_Chk01_DtlR r : up1()) {
				if(!r.existed_flg() || r.manual_add_flg()) {
					continue;
				}
				if(r.isStatusCreate() || r.isStatusModify() || r.isStatusNone()) {
					ivDL.add(r);
				}
			}

			for(Iv_Chk01_MapDtlR mapR : up2()) {
				for(Iv_Chk01_DtlR dR : ivDL) {
					if(isSame(mapR.index(), dR.index())) {
						MST_SHIP_SCHD_R r = MST_SHIP_SCHD_R.create();
						r.ship_schd_no(mapR.ship_schd_no());
						insWkL.add(r);

						break;
					}
				}
			}

			dbWkInsert("MSBEL5730_MSW_SHIP_SCHD_I01", insWkL, insWkL_bldr.getBaseDbc());
		}

		protected String getDeleteSchdNo() {
			String shipSchdNo = null;

			MCList<Iv_Chk01_DtlR> ivDL = MCList.create(Iv_Chk01_DtlR.class);
			for(Iv_Chk01_DtlR r : up1()) {
				if(!r.existed_flg() || r.manual_add_flg()) {
					continue;
				}
				if(r.isStatusDelete()) {
					ivDL.add(r);
				}
			}

			for(Iv_Chk01_MapDtlR mapR : up2()) {
				for(Iv_Chk01_DtlR dR : ivDL) {
					if(isSame(mapR.index(), dR.index())) {
						if(isNull(shipSchdNo)) {
							shipSchdNo = mapR.ship_schd_no();
						}
						else {
							shipSchdNo += ",";
							shipSchdNo += mapR.ship_schd_no();
						}

						break;
					}
				}
			}

			return shipSchdNo;
		}

		/**
		 * 	インボイス単位出荷チェック
		 *
		 * @return
		 */
		protected MCMessageList checkIvShip() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MST_SHIP_SCHD_R> shipSchdL = getShipSchdL();
			MCIndexKey shipSchdIdKey = shipSchdL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
			// 出荷予定の状況チェック
			boolean ivShipRelFlg = false; // インボイス単位出荷の解除
			if (up0().old_iv_ship_flg() && !up0().iv_ship_flg()) {// インボイス単位出荷チェックオン⇒オフの場合
				ivShipRelFlg = true;
			}
			boolean ivShipCngFlg = false; // インボイス単位出荷への変更
			if (!up0().old_iv_ship_flg() && up0().iv_ship_flg()) {// インボイス単位出荷チェックオフ⇒オンの場合
				ivShipCngFlg = true;
			}
			// インボイス単位出荷の変更時に指図済および出荷済の明細が存在するかだけでなく、
			// インボイス単位出荷のインボイスに指図済および出荷済の明細追加や行削除も防ぐ
			MCList<Iv_Chk01_DtlR> chkL = up1().subList(
					new String[]{Iv_Chk01_DtlR.$existed_flg, Iv_Chk01_DtlR.$manual_add_flg}, 
					new Comparable[]{true, false});
			if (ivShipRelFlg || ivShipCngFlg || 
					up0().iv_ship_flg() && !chkL.statusChangedList().isEmpty()) {
				for(Iv_Chk01_DtlR dR : up1()) {
					if(!dR.existed_flg() || dR.manual_add_flg()) {
						continue;
					}

					if(!dR.bndl_flg()) {
						if(!MSC_PR_STS_TYP.isNOT_INST(dR.pr_sts_typ()) && 
								!MSC_PR_STS_TYP.isNOT_SHIP(dR.pr_sts_typ())) {
							if(ivShipRelFlg) {
								msgL.add(new MCMessage(dR, null, MSBEL0287, dR.ship_schd_no(), toDispGUIIndex(dR)));
							}
							else {
								msgL.add(new MCMessage(dR, null, MSBEL0145, dR.ship_schd_no(), toDispGUIIndex(dR)));
							}
						}
					}
					else {
						String shipSchdNo = "";
						int cnt = 0;
						for(Iv_Chk01_MapDtlR mapR : up2()) {
							if(isSame(mapR.index(), dR.index())) {
								if(!MSC_PR_STS_TYP.isNOT_INST(mapR.pr_sts_typ()) && 
										!MSC_PR_STS_TYP.isNOT_SHIP(mapR.pr_sts_typ())) {
									if(cnt == 0) {
										shipSchdNo = mapR.ship_schd_no();
									}
									else {
										shipSchdNo += ", ";
										shipSchdNo += mapR.ship_schd_no();
									}
									cnt ++;
								}
							}
						}
						if(cnt > 0) {
							if(ivShipRelFlg) {
								msgL.add(new MCMessage(dR, null, MSBEL0287, shipSchdNo, toDispGUIIndex(dR)));
							}
							else {
								msgL.add(new MCMessage(dR, null, MSBEL0145, shipSchdNo, toDispGUIIndex(dR)));
							}
						}
					}
				}
			}
			
			if(up0().iv_ship_flg()) {
				// インボイスに含まれる行のみを対象とする
				// 数量の変更も合わせてチェックする
				MCList<Iv_Chk01_MapDtlR> chkTar = MCList.create(Iv_Chk01_MapDtlR.class);
				MCIndexKey ik = up2().createIndex(Iv_Chk01_MapDtlR.$index);
				for(Iv_Chk01_DtlR dR : up1()) {
					if(!dR.existed_flg() || dR.manual_add_flg() || dR.isStatusDelete()) {
						continue;
					}
					else {
						MCList<Iv_Chk01_MapDtlR> mL = up2().subList(ik, dR.index());
						chkTar.addAll(mL);
						
						// インボイス単位出荷の場合は、出荷予定の数量から変更できない
						if (!dR.bndl_flg()) {
							MST_SHIP_SCHD_R shipSchdR = shipSchdL.getFirst(shipSchdIdKey, dR.ship_schd_no());
							if (!dR.trd_unit_qty().eq(shipSchdR.trd_unit_qty())) {
								msgL.add(new MCMessage(dR, null, MSBEL0149, dR.trd_unit_qty(), shipSchdR.trd_unit_qty(), toDispGUIIndex(dR)));
							}
						}
					}
				}
				
				// 出荷指図区分の混在チェック
				boolean isNon = false;
				boolean isShipInst = false;
				for (Iv_Chk01_MapDtlR up2R : chkTar) {
					if (MAC_SHIP_INST_TYP.isNON(up2R.ship_inst_typ())) {
						isNon = true;
					}
					else {
						isShipInst = true;
					}
				}
				if (isNon && isShipInst) {
					msgL.add(new MCMessage(MSBEL0282));
				}
				
				// 出荷元物流グループの混在チェック
				MCList<MST_SHIP_SCHD_R> shipSchd = MCList.create(MST_SHIP_SCHD_R.class);
				for (Iv_Chk01_MapDtlR mapDtlR : chkTar.distinctNE(Iv_Chk01_MapDtlR.$ship_schd_no)) {
					shipSchd.add(shipSchdL.getFirst(shipSchdIdKey, mapDtlR.ship_schd_no()));
				}
				int cnt = 0;
				for (MCList<MST_SHIP_SCHD_R> list : shipSchd.groupList(MST_SHIP_SCHD_R.$ship_fr_lg_grp_cd)) {
					String shipFrLgGrpCd = list.get(0).ship_fr_lg_grp_cd();
					if (!isNull(shipFrLgGrpCd)) {
						up0().ship_fr_lg_grp_cd(shipFrLgGrpCd);
						cnt++;
					}
				}
				if (cnt > 1) {
					msgL.add(new MCMessage(MSBEL0258));
				}
				// インボイス明細まとめチェック
				for(Iv_Chk01_DtlR dR : up1()) {
					if(dR.isStatusDelete()) {
						continue;
					}
					else if (dR.bndl_flg()) {
						msgL.add(new MCMessage(dR, null, MSBEL0348, toDispGUIIndex(dR)));
					}
				}
			}
			return msgL;
		}
		/**
		 * 出荷予定を取得する。
		 * @return 出荷予定リスト
		 */
		protected MCList<MST_SHIP_SCHD_R> getShipSchdL() {
			
			MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			MST_SHIP_SCHD_R shipSchd = MST_SHIP_SCHD_R.create("SHIPSCHD");
			MCQueryApiBuilder shipSchdL_bldr = MCQueryApiBuilder.create(shipSchd);
			dbSelectKey("MSBEL5730_MST_SHIP_SCHD_S01", shipSchdL, shipSchdL_bldr, up2());
			
			return shipSchdL;
		}
		
		protected MCMessageList checkIvQty() {
			MCMessageList msgL = new MCMessageList();
			
			if (!MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())) {
				
				MCList<Iv_Chk01_DtlR> chkL  = up1().createInstance();
				
				for (Iv_Chk01_DtlR chkR : up1()) {
					if ((chkR.isStatusModify() || chkR.isStatusDelete()) && !chkR.uplnd_flg() && !chkR.manual_add_flg()) {
						chkL.add(chkR);
					}
				}
				
				if (!chkL.isEmpty())  {
					MCList<MST_IV_SHIP_INST_MAP_R> ivShipInstMapL =getIvShipInstMapL(chkL);
					MCIndexKey ivShipInstMapIdxKey = ivShipInstMapL.createIndex(MST_IV_SHIP_INST_MAP_R.$iv_d_no, MST_IV_SHIP_INST_MAP_R.$ship_inst_fix_flg);
					MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL = getIvShipActMapL(chkL);
					MCIndexKey ivShipActMapIdxKey = ivShipActMapL.createIndex(MST_IV_SHIP_ACT_MAP_R.$iv_d_no, MST_IV_SHIP_ACT_MAP_R.$ship_act_fix_flg);
					
					for (Iv_Chk01_DtlR chkR : chkL) {
						MCList<MST_IV_SHIP_INST_MAP_R> shipInstFixL = ivShipInstMapL.subList(ivShipInstMapIdxKey, chkR.iv_d_no(), true);
						MCNumber shipInstFixQty = nvl(shipInstFixL.sum(MST_IV_SHIP_INST_MAP_R.$base_unit_qty), MCNumber.ZERO);
						if (shipInstFixQty.isPositive()) {
							if (chkR.isStatusDelete()) {
								msgL.add(new MCMessage(chkR, null, MSBEL1121, chkR.iv_d_no(), toDispGUIIndex(chkR)));
							}
							else if (chkR.base_unit_qty().lt(shipInstFixQty)) {
								msgL.add(new MCMessage(chkR, null, MSBEL1119, chkR.iv_d_no(), chkR.base_unit_qty(), shipInstFixQty, toDispGUIIndex(chkR)));
							}
						}
						else {
							MCList<MST_IV_SHIP_ACT_MAP_R> shipActFixL = ivShipActMapL.subList(ivShipActMapIdxKey, chkR.iv_d_no(), true);
							MCNumber shipActFixQty = nvl(shipActFixL.sum(MST_IV_SHIP_ACT_MAP_R.$base_unit_qty), MCNumber.ZERO);
							
							if (shipActFixQty.isPositive()) {
								if (chkR.isStatusDelete()) {
									msgL.add(new MCMessage(chkR, null, MSBEL1122, chkR.iv_d_no(), toDispGUIIndex(chkR)));
								}
								else if (chkR.base_unit_qty().lt(shipActFixQty)) {
									msgL.add(new MCMessage(chkR, null, MSBEL1114, chkR.iv_d_no(), chkR.base_unit_qty(), shipActFixQty, toDispGUIIndex(chkR)));
								}
							}
						}
					}
				}
			}
			
			return msgL;
		}

		/**
		 * 仮受注チェック
		 * @return
		 */
		protected MCMessageList checkPreSlo() {
			MCMessageList msgL = new MCMessageList();

			MCList<Iv_Chk01_DtlR> dtlL = up1().groupBy(Iv_Chk01_DtlR.$slo_no);
			MCList<MST_SLO_R> sloL = MCList.create(MST_SLO_R.class);
			MST_SLO_R t = MST_SLO_R.create("T");
			MCQueryApiBuilder sloL_bldr = MCQueryApiBuilder.create(t);
			sloL_bldr.setSelect(t.slo_no);
			sloL_bldr.addSelect(t.slo_typ);
			dbSelectKey("MSBEL5730_MST_SLO_S01", sloL, sloL_bldr, dtlL);

			MCIndexKey idk = up1().createIndex(Iv_Chk01_DtlR.$slo_no);
			for (MST_SLO_R sloR : sloL) {
				if (MSC_SLO_TYP.isPRE_SLO(sloR.slo_typ())) {
					Iv_Chk01_DtlR dtlR = up1().getFirst(idk, sloR.slo_no());
					msgL.add(new MCMessage(dtlR, null, MSBEL0333, dtlR.slo_no(), toDispGUIIndex(dtlR)));
				}
			}
			return msgL;
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
			down3().setAll(up3());
			down4().setAll(up4());
		}
		
		// キャッシュ関連
		protected FXUCL_MCDbcCache<MAM_BP_R> _bpAddrCache = null;
		protected FXUCL_MCDbcCache<MAM_LOC_R> _locAddrCache = null;

		protected void doBpCache(Iv_Chk01_HdrR hdrR) {
			MCList<MAM_BP_R> bindL = MCList.create(MAM_BP_R.class);
			MAM_BP_R bindR = MAM_BP_R.create();
			bindR.bp_cd(hdrR.dlv_id_cd());
			bindR.setDateNE("iv_dt", hdrR.iv_dt());
			bindL.add(bindR);
			if(!isNull(hdrR.tdlv_cd())) {
				bindR = MAM_BP_R.create();
				bindR.bp_cd(hdrR.tdlv_cd());
				bindR.setDateNE("iv_dt", hdrR.iv_dt());
				bindL.add(bindR);
			}

			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);

			dbc_bldr.setSelect(t.bp_cd);
			dbc_bldr.addSelect(t.prnt_lcl_cd);
			dbc_bldr.addSelect(MAPA_BP$F_GET_BP_ADDR( t.bp_cd, bind("iv_dt"), value(MAC_BP_ADDR_TYP.ZIP_CD.value())).as("zip_cd"), MAPA_BP$F_GET_BP_ADDR( t.bp_cd, bind("iv_dt"), value(MAC_BP_ADDR_TYP.ADDR1.value())).as("addr1"), MAPA_BP$F_GET_BP_ADDR( t.bp_cd, bind("iv_dt"), value(MAC_BP_ADDR_TYP.ADDR2.value())).as("addr2"), MAPA_BP$F_GET_BP_ADDR( t.bp_cd, bind("iv_dt"), value(MAC_BP_ADDR_TYP.ADDR3.value())).as("addr3"), MAPA_BP$F_GET_BP_ADDR( t.bp_cd, bind("iv_dt"), value(MAC_BP_ADDR_TYP.ADDR4.value())).as("addr4"), MAPA_BP$F_GET_BP_ADDR( t.bp_cd, bind("iv_dt"), value(MAC_BP_ADDR_TYP.TEL.value())).as("tel"), MAPA_BP$F_GET_BP_ADDR( t.bp_cd, bind("iv_dt"), value(MAC_BP_ADDR_TYP.FAX.value())).as("fax"), MAPA_BP$F_GET_BP_ADDR( t.bp_cd, bind("iv_dt"), value(MAC_BP_ADDR_TYP.DLV_CNTCT_DPT.value())).as("cntct_dpt"), MAPA_BP$F_GET_BP_ADDR( t.bp_cd, bind("iv_dt"), value(MAC_BP_ADDR_TYP.DLV_CNTCT_PSN.value())).as("cntct_psn"));
			_bpAddrCache = new FXUCL_MCDbcCache<MAM_BP_R>(dbc_bldr, bindL, "bp_cd");
		}

		protected void doLocCache(Iv_Chk01_HdrR hdrR) {
			MCList<Iv_Chk01_HdrR> bindL = MCList.create(Iv_Chk01_HdrR.class);
			bindL.add(hdrR);

			MAM_LOC_R t = MAM_LOC_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);

			dbc_bldr.setSelect(t.loc_cd);
			dbc_bldr.addSelect(MAPA_LOC$F_GET_LOC_ADDR( t.loc_cd, bind("iv_dt"), value(MAC_LOC_ADDR_TYP.ZIP_CD.value()), nullValue()).as("zip_cd"), MAPA_LOC$F_GET_LOC_ADDR( t.loc_cd, bind("iv_dt"), value(MAC_LOC_ADDR_TYP.ADDR1.value()), nullValue()).as("addr1"), MAPA_LOC$F_GET_LOC_ADDR( t.loc_cd, bind("iv_dt"), value(MAC_LOC_ADDR_TYP.ADDR2.value()), nullValue()).as("addr2"), MAPA_LOC$F_GET_LOC_ADDR( t.loc_cd, bind("iv_dt"), value(MAC_LOC_ADDR_TYP.ADDR3.value()), nullValue()).as("addr3"), MAPA_LOC$F_GET_LOC_ADDR( t.loc_cd, bind("iv_dt"), value(MAC_LOC_ADDR_TYP.ADDR4.value()), nullValue()).as("addr4"), MAPA_LOC$F_GET_LOC_ADDR( t.loc_cd, bind("iv_dt"), value(MAC_LOC_ADDR_TYP.TEL.value()), nullValue()).as("tel"), MAPA_LOC$F_GET_LOC_ADDR( t.loc_cd, bind("iv_dt"), value(MAC_LOC_ADDR_TYP.FAX.value()), nullValue()).as("fax"));
			_locAddrCache = new FXUCL_MCDbcCache<MAM_LOC_R>(dbc_bldr, bindL, "dlv_id_cd");
		}
	}
	/**
	 * Iv_Chk02オペレーション.<p>
	 *
	 * 取消前のチェック処理を行う。<br>
	 */
	public class Iv_Chk02 extends MSBEL_IvRegService_MC_A.Iv_Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			if (hasErr()) {
				return ;
			}
			
			setDown();
		}

		@Override
		protected MCMessageList updCntChkReq() {
			MCMessageList msgL =  super.updCntChkReq();
			
			for (Iv_Chk01_DtlR dltR : up1()) {
				if (dltR.uplnd_flg() || dltR.manual_add_flg()) {
					continue;
				}
				msgL.addAll(check(dltR, Iv_Chk01_DtlR.$ship_pr_upd_cntr, new FXUCL_RequiredValidater()));
			}
			
			return msgL;
		}
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			initIvCache(up0());
			initIvDCache(up0());
			
			chkUpdCntrShipPr(msgL);
			if (msgL.isEmpty()) {
				chkUpdCntrIv(msgL);
			}
			
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			checkSub(msgL);

			return msgL;
		}

		protected void checkSub(MCMessageList msgL) {
			
			// ＤＡＣチェック
			msgL.addAll(checkDac(up0(), up1(), true));
			
			//パッキングリスト登録済みチェック
			if(up0().pl_reg_flg()) {
				msgL.add(new MCMessage(MSBEL0148));
			}
			
			if(up0().iv_ship_flg()) {
				//インボイス単位出荷の場合、指図後・未出荷は取消不可
				chkSchdInst(msgL);
				//インボイス単位出荷の場合、出荷後は取消不可
				checkSchdAct(msgL);
			}
			msgL.addAll(checkIvQty());
		}

		protected void chkSchdInst(MCMessageList msgL) {

			String shipSchdNo = "";
			int cnt = 0;

			for(Iv_Chk01_DtlR dR : up1()) {
				if(dR.manual_add_flg()) {
					continue;
				}

				if(!dR.bndl_flg()) {
					//出荷指図後・未出荷の場合
					if(dR.ship_inst_qty().gt(MCNumber.ZERO) && dR.ship_act_qty().isZero()) {
						if(cnt == 0) {
							shipSchdNo = dR.ship_schd_no();
						}
						else {
							shipSchdNo += ", ";
							shipSchdNo += dR.ship_schd_no();
						}
						cnt ++;
					}
				}
				//「まとめ」明細行の場合、マップ情報にてチェック実施
				else {
					for(Iv_Chk01_MapDtlR mapR : up2()) {
						if(isSame(mapR.index(), dR.index())) {
							//出荷指図後・未出荷の場合
							if(mapR.ship_inst_qty().gt(MCNumber.ZERO) && mapR.ship_act_qty().isZero()) {
								if(cnt == 0) {
									shipSchdNo = mapR.ship_schd_no();
								}
								else {
									shipSchdNo += ", ";
									shipSchdNo += mapR.ship_schd_no();
								}
								cnt ++;
							}
						}
					}
				}
			}

			if(cnt > 0) {
				msgL.add(new MCMessage(MSBEL0299, shipSchdNo));
			}
		}

		protected void checkSchdAct(MCMessageList msgL) {

			int cnt = 0;

			for(Iv_Chk01_DtlR dR : up1()) {
				if(dR.manual_add_flg()) {
					continue;
				}

				if(!dR.bndl_flg()) {
					if(dR.ship_act_qty().gt(MCNumber.ZERO)) {
						cnt ++;
					}
				}
				//「まとめ」明細行の場合、マップ情報にてチェック実施
				else {
					for(Iv_Chk01_MapDtlR mapR : up2()) {
						if(isSame(mapR.index(), dR.index())) {
							if(mapR.ship_act_qty().gt(MCNumber.ZERO)) {
								cnt ++;
							}
						}
					}
				}
			}

			if(cnt > 0) {
				msgL.add(new MCMessage(MSBEL1064));
			}
		}
		protected MCMessageList checkIvQty() {
			MCMessageList msgL = new MCMessageList();
			
			if (!MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())) {
				
				MCList<Iv_Chk01_DtlR> chkL  = up1().createInstance();
				
				for (Iv_Chk01_DtlR chkR : up1()) {
					if (!chkR.uplnd_flg() && !chkR.manual_add_flg()) {
						chkL.add(chkR);
					}
				}
				
				if (!chkL.isEmpty())  {
					MCList<MST_IV_SHIP_INST_MAP_R> ivShipInstMapL =getIvShipInstMapL(chkL);
					MCIndexKey ivShipInstMapIdxKey = ivShipInstMapL.createIndex(MST_IV_SHIP_INST_MAP_R.$iv_d_no, MST_IV_SHIP_INST_MAP_R.$ship_inst_fix_flg);
					MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL = getIvShipActMapL(chkL);
					MCIndexKey ivShipActMapIdxKey = ivShipActMapL.createIndex(MST_IV_SHIP_ACT_MAP_R.$iv_d_no, MST_IV_SHIP_ACT_MAP_R.$ship_act_fix_flg);
					
					for (Iv_Chk01_DtlR chkR : chkL) {
						MCList<MST_IV_SHIP_INST_MAP_R> shipInstFixL = ivShipInstMapL.subList(ivShipInstMapIdxKey, chkR.iv_d_no(), true);
						MCNumber shipInstFixQty = nvl(shipInstFixL.sum(MST_IV_SHIP_INST_MAP_R.$base_unit_qty), MCNumber.ZERO);
						if (shipInstFixQty.isPositive()) {
							msgL.add(new MCMessage(chkR, null, MSBEL1121, chkR.iv_d_no(), toDispGUIIndex(chkR)));
						}
						else {
							MCList<MST_IV_SHIP_ACT_MAP_R> shipActFixL = ivShipActMapL.subList(ivShipActMapIdxKey, chkR.iv_d_no(), true);
							MCNumber shipActFixQty = nvl(shipActFixL.sum(MST_IV_SHIP_ACT_MAP_R.$base_unit_qty), MCNumber.ZERO);
							
							if (shipActFixQty.isPositive()) {
								msgL.add(new MCMessage(chkR, null, MSBEL1122, chkR.iv_d_no(), toDispGUIIndex(chkR)));
							}
						}
					}
				}
			}
			
			return msgL;
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}
		
		/**
		 * インボイスヘッダに対する更新カウンタチェック
		 */
		protected void chkUpdCntrIv(MCMessageList msgL) {
			MST_IV_R ivR = MST_IV_R.create();
			MST_IV_R t = MST_IV_R.create("T");
			MCQueryApiBuilder ivR_bldr = MCQueryApiBuilder.create(t);
			dbSelectKeyForUpdateNoWait("MSBEL5730_MST_IV_S02", ivR, ivR_bldr, up0());
						
			msgL.addAll(checkUpdCntrNE(up0(), Iv_Chk01_HdrR.$iv_upd_cntr, ivR));
			if (msgL.isEmpty() && !isNull(ivR) && isNull(ivR.rcpt_iv_mng_no())) {
				callRevDataIns01(ivR);
			}
			
			cmplIv(ivR);
		}
		/**
		 * インボイスヘッダの補完を行う。
		 * @param ivR インボイスヘッダ
		 */
		protected void cmplIv(MST_IV_R ivR) {
			up0().iv_no(ivR.iv_no());
			up0().iv_ship_flg(ivR.iv_ship_flg());
			up0().iv_rev(ivR.iv_rev());
			up0().iv_src_typ(ivR.iv_src_typ());
			up0().cmpl_schd_dt(ivR.cmpl_schd_dt());
			if (MAC_TRD_PTN_TYP.isSLS(ivR.trd_ptn_typ())) {
				up0().sls_schd_dt(ivR.trd_schd_dt());
			}
			else {
				up0().arr_schd_dt(ivR.trd_schd_dt());
			}
			up0().ac_dt(ivR.ac_dt());
			up0().trd_ptn_typ(ivR.trd_ptn_typ());
			up0().ship_rqst_id_cd(ivR.ship_rqst_id_cd());
			up0().via_dlv_typ(ivR.via_dlv_typ());
			up0().trd_cur_cd(ivR.trd_cur_cd());
			up0().pl_reg_flg(ivR.pl_reg_flg());
			up0().iv_ship_flg(ivR.iv_ship_flg());
			up0().rcpt_iv_mng_no(ivR.rcpt_iv_mng_no());
		}
		
		/**
		 * 出荷進捗に対する更新カウンタチェック
		 */
		protected void chkUpdCntrShipPr(MCMessageList msgL) {
			MCList<Iv_Chk01_DtlR> chkL = up1().subList(
					new String[]{Iv_Chk01_DtlR.$existed_flg, Iv_Chk01_DtlR.$manual_add_flg, Iv_Chk01_DtlR.$uplnd_flg}, 
					new Comparable[]{true, false, false});
			
			if (chkL.isEmpty()) {
				return;
			}
			MCList<MST_SHIP_PR_R> prL = MCList.create(MST_SHIP_PR_R.class);
			MST_SHIP_PR_R t = MST_SHIP_PR_R.create("T");
			MCQueryApiBuilder prL_bldr = MCQueryApiBuilder.create(t);
			prL_bldr.setSelect(t.ship_pr_no, t.upd_cntr);
			prL_bldr.setOrderByAsc(prL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdateNoWait("MSBEL5730_MST_SHIP_PR_S02", prL, prL_bldr, chkL);

			MCIndexKey ik = prL.createIndex(MST_SHIP_PR_R.$ship_pr_no);
			
			for (Iv_Chk01_DtlR chkR : chkL) {
				MST_SHIP_PR_R prR = prL.getFirst(ik, chkR.ship_pr_no());
				MCMessageList tmp = checkUpdCntrNE(chkR, Iv_Chk01_DtlR.$ship_pr_upd_cntr, prR);
				
				if (!tmp.isEmpty()) {
					msgL.addAll(tmp);
					break;
				}
			}
		}
	}
	/**
	 * Iv_Ins01オペレーション.<p>
	 *
	 * インボイスを登録する。<br>
	 */
	public class Iv_Ins01 extends MSBEL_IvRegService_MC_A.Iv_Ins01 {
		/**
		 * インボイスヘッダ
		 */
		protected MST_IV_R _ivR = null;
		
		/**
		 * インボイスの出荷実績情報（配送先経由しない）
		 */
		protected MCList<Iv_Upd03_RsltR> _ivShipActL = null;
		
		/**
		 * インボイス出荷実績マップ
		 */
		protected MCList<MST_IV_SHIP_ACT_MAP_R> _ivShipActMapL = null;
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {


			//発番処理
			setNum();
			
			// インボイス登録処理
			insIv();
			callIoActSvWK();
			
			//出荷予定サービス実行
			callShipSchdUpd04(up1(), up2());
			
			if (MAC_TRD_PTN_TYP.isSLS(up0().trd_ptn_typ())) { //売上の場合
				//売上予定サービス実行
				doSlsSchdUpd();
			}
			if (MAC_TRD_PTN_TYP.isSLS(up0().trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(up0().trd_ptn_typ())) {
				
				//受注状況登録処理
				callSlsSTsIns01(up0(), up1(), MAC_DATA_CRUD_TYP.CRT.value());
			}
			
			//インボイス帳票印刷処理
			callPrnt03(up0());
			// 与信更新
			callCredSv();

			//下り電文設定処理
			setDown();
			// 仮単価メッセージセット
			setInterimMsg(up0(), up1());
			//受払実績管理サービス実行
			callIoActUpdSv(up0());
		}

		/**
		 * 売上予定サービス実行（新規時）
		 */
		protected void doSlsSchdUpd() {
			//仕入直送 - マニュアル追加行を除く
			MCList<Iv_Chk01_DtlR> purcDdlvL = up1().subList(
					new String[]{Iv_Chk01_DtlR.$purc_ddlv_flg, Iv_Chk01_DtlR.$manual_add_flg}, 
					new Comparable[]{true, false});
			//仕入直送以外 - マニュアル追加行を含む
			MCList<Iv_Chk01_DtlR> nonPurcDdlvL = up1().subList(Iv_Chk01_DtlR.$purc_ddlv_flg, false);

			if(!purcDdlvL.isEmpty()) {
				//売上予定サービス実行（仕入直送 - マニュアル追加行を除く）
				callSlsSchdUpd04(up0(), purcDdlvL, MAC_DATA_CRUD_TYP.CRT.value());
			}
			if(!nonPurcDdlvL.isEmpty()) {
				//売上予定サービス実行（仕入直送以外 - マニュアル追加行を含む）
				callSlsSchdUpd05(up0(), nonPurcDdlvL, MAC_DATA_CRUD_TYP.CRT.value());
			}
		}

		/**
		 * 発番処理
		 * 
		 */
		protected void setNum() {

			//受注で登録したインボイスＮＯ以外の場合、インボイスＮＯを発番する
			if(!up0().is_slo_iv_no()) {
				up0().iv_no(getIvNo(up0().iv_no()));
			}
			
			//三国間の場合
			if(!isNull(up0().rcpt_iv_mng_no())) {
				//マニュアル追加した明細を絞り込む
				MCList<Iv_Chk01_DtlR> ivD_InsL = up1().subList(MCRow.Status.CREATE);

				//明細のインボイス管理ＮＯを設定（マニュアル追加した明細のみ）
				ivD_InsL.setStringNE(MST_IV_D_R.$iv_mng_no, up0().iv_mng_no());

				//インボイス明細ＮＯの発番（マニュアル追加した明細のみ）
				setIvDNo(ivD_InsL);
			}
			//直貿の場合
			else {
				//ヘッダのインボイス管理ＮＯの発番
				up0().iv_mng_no(getStrSeq(MSC_NUM_SYS_TYP.IVMNG));
				//明細のインボイス管理ＮＯを設定
				up1().setStringNE(MST_IV_D_R.$iv_mng_no, up0().iv_mng_no());
				
				//インボイス明細ＮＯの発番
				setIvDNo(up1());
			}
			
			//表示順の発番（見直し）
			setDispSeq(up1());
		}

		/**
		 * インボイス登録を行う
		 */
		protected void insIv() {
			
			preSet(up0(), up1());

			//三国間の場合
			if(!isNull(up0().rcpt_iv_mng_no())) {
				updIvIntrm();
			}
			//直貿の場合
			else {
				insIvDirectTrad();
				crtIvShipInstMap();
				crtIvShipActMap();
			}
		}

		/**
		 * インボイス更新（三国間）
		 */
		protected void updIvIntrm() {

			up0().setBooleanNE(MST_IV_R.$pre_rcpt_iv_flg, false);

			updIvIntrmSub(up0(), up1(), up2(), MAC_DATA_CRUD_TYP.CRT.value());
			updRcptIv(up0().rcpt_iv_mng_no());
		}

		protected void insIvDirectTrad() {
			
			MST_IV_R ivR = initIvR(up0(), up1());
			MCList<MST_IV_D_R> ivDL = initIvDL(up1());

			ivR.iv_rev(1);
			up0().iv_rev(ivR.iv_rev());
			ivDL.setValueNE(MST_IV_D_R.$iv_rev, ivR.iv_rev());
			up1().setValueNE(Iv_Chk01_DtlR.$iv_rev, ivR.iv_rev());
			
			setIvMapShipActMode(up0(), up2());
			//登録対象のiv_mapを選別すると同時に、iv_d_noを付与する
			MCList<Iv_Chk01_MapDtlR> ivMap_insL = getIvMapInsL(up2(), up1());

			MCQueryApiBuilder ivR_bldr = MCQueryApiBuilder.create(MST_IV_R.create("T"));
			MCQueryApiBuilder ivDL_bldr = MCQueryApiBuilder.create(MST_IV_D_R.create("T"));
			dbInsert("MSBEL5730_MST_IV_I01", ivR, ivR_bldr);
			dbInsert("MSBEL5730_MST_IV_D_I01", ivDL, ivDL_bldr);
			insIvMap(ivMap_insL);
			_ivR = ivR;
			callRevDataIns01(ivR);
		}
		protected void callIoActSvWK() {
			
			if (isNoIoActTgt(up0())) {
				return;
			}
			
			MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL = MCList.create(MST_IV_SHIP_ACT_MAP_R.class);
			if (MSC_IV_SRC_TYP.isSHIP_ACT(up0().iv_src_typ()) || MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())) {
				ivShipActMapL.setAll(_ivShipActMapL);
			}
			else {
				for (Iv_Upd03_RsltR r : _ivShipActL) {
					MST_IV_SHIP_ACT_MAP_R mapR = MST_IV_SHIP_ACT_MAP_R.create();
					mapR.ship_act_d_no(r.ship_act_d_no());
					mapR.base_unit_qty(r.base_unit_qty());
					ivShipActMapL.add(mapR);
				}
			}
			
			if (!ivShipActMapL.isEmpty()) {
				ivShipActMapL.setStatus(MCRow.Status.CREATE);
				callIoActInsSv(ivShipActMapL, _ivR, true, false, false);
			}
		}
		
		protected void crtIvShipInstMap() {
			if (MSC_IV_SRC_TYP.isSHIP_INST(up0().iv_src_typ())) {
				callIvRegSrvForShipInstFix(up0().iv_no(), up1(), up3());
			}
			else {
				callIvRegSrvForShipInstUnFix(up0().iv_no(), getShipInstDNoL());
			}
		}
		
		protected List<String> getShipInstDNoL() {
			MCList<MST_SHIP_SCHD_R> shipSchdL = MCList.create(MST_SHIP_SCHD_R.class);
			MST_SHIP_SCHD_R shipSchd = MST_SHIP_SCHD_R.create("SHIPSCHD");
			MCQueryApiBuilder shipSchd_bldr = MCQueryApiBuilder.create(shipSchd);
			shipSchd_bldr.setSelect(shipSchd.ship_inst_d_no);
			shipSchd_bldr.setWhere(shipSchd.ship_inst_d_no.isNotNull());
			shipSchd_bldr.addWhereWithAnd(shipSchd.ship_schd_no.eq(bind(Iv_Chk01_MapDtlR.$ship_schd_no)));
			dbSelect("MSBEL5730_MST_SHIP_SCHD_S02", shipSchdL, shipSchd_bldr, up2());
			
			return shipSchdL.getStringNE(MST_SHIP_SCHD_R.$ship_inst_d_no);
		}
		
		protected void crtIvShipActMap() {
			
			if (MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())
					&& MAC_TRD_PTN_TYP.isSLS_CNSGN(up0().trd_ptn_typ())) {
				// 売上実績登録画面で貸出売上を登録する際に、インボイス出荷実績を作成しない
				return;
			}
			
			if (MSC_IV_SRC_TYP.isSHIP_ACT(up0().iv_src_typ())
					|| MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())) {
				insIvShipActMap();
			}
			else {
				callIvRegSrvForShipAct();
			}
		}
		
		protected void insIvShipActMap() {
			
			MCList<Iv_Chk01_ShipActMapDtlR> ivShipActMap_insL = getIvShipActMapInsL(up4(), up1());
			_ivShipActMapL = initIvShipActMapL(ivShipActMap_insL);
			MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_IV_SHIP_ACT_MAP_R.create("T"));
			
			if(!_ivShipActMapL.isEmpty()) {
				dbInsert("MSBEL5730_MST_IV_SHIP_ACT_MAP_I01", _ivShipActMapL, insL_bldr);
			}
		}
		
		protected void callIvRegSrvForShipAct() {
			
			MSBEL_IvRegService.Iv_Upd03 ope = MSBEL_IvRegService.crtIv_Upd03();
			_ivShipActL  = MCList.create(Iv_Upd03_RsltR.class);
			
			for (String shipActDNo : getShipActDNoL()) {
				
				Iv_Upd03_Ctrl2R upR = Iv_Upd03_Ctrl2R.create();
				upR.ship_act_d_no(shipActDNo);
				ope.up1().add(upR);
			}
				
			if (!ope.up1().isEmpty()) {
				ope.up0().iv_reg_flg(true);
				ope.up0().iv_no(up0().iv_no());
				
				ope.exec();
				
				_ivShipActL.setAll(ope.down0());
			}
		}
		
		protected List<String> getShipActDNoL() {
			MCList<MST_SHIP_ACT_D_R> shipActDL = MCList.create(MST_SHIP_ACT_D_R.class);
			MST_SHIP_ACT_D_R shipActD = MST_SHIP_ACT_D_R.create("SHIPACTD");
			MST_SHIP_ACT_R shipAct = MST_SHIP_ACT_R.create("SHIPACT");
			MST_SHIP_ALLOC_STS_R shipAllocSts = MST_SHIP_ALLOC_STS_R.create("SHIPALLOCSTS");
			MCQueryApiBuilder shipActD_bldr = MCQueryApiBuilder.create(shipActD);
			shipActD_bldr.setSelect(shipActD.ship_act_d_no);
			shipActD_bldr.addInnerJoin(shipAct, shipActD.ship_act_no.eq(shipAct.ship_act_no));
			shipActD_bldr.addInnerJoin(shipAllocSts, shipActD.ship_alloc_sts_no.eq(shipAllocSts.ship_alloc_sts_no));
			shipActD_bldr.setWhere(shipAllocSts.ship_schd_no.eq(bind("ship_schd_no")));
			shipActD_bldr.addWhereWithAnd(shipActD.can_flg.eq((value(false))));
			dbSelect("MSBEL5730_MST_SHIP_ACT_D_STS_S01", shipActDL, shipActD_bldr, up2());
			
			return shipActDL.getStringNE(MST_SHIP_ACT_D_R.$ship_act_d_no);
		}
		
		/**
		 * 与信対象額を計算し、与信サービスを実行する。
		 */
		protected void callCredSv() {
			
			if (!MAC_TRD_PTN_TYP.isSLS(up0().trd_ptn_typ()) 
					|| MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())) {
				return;
			}
			
			MCList<Cred_Upd01_CndR> credL = calcCredAmt();
			
			callCredSvUpd01(credL);
		}
		
		/**
		 * 与信サービスを作成する。
		 * @return  与信サービスの上り電文
		 */
		protected MCList<Cred_Upd01_CndR> calcCredAmt() {
			
			MCNumber ivCredAmtSum = MCNumber.ZERO;
			MCNumber sloCredAmtSum = MCNumber.ZERO;
			MCNumber dlvCredAmtSum = MCNumber.ZERO;
			
			MCList<MST_SLO_D_R> sloDL = getSloDL(up1());
			MCIndexKey sloIdxkey = sloDL.createIndex(MST_SLO_D_R.$slo_d_no);
			
			MCList<MST_DLV_SLIP_D_R> dlvSlipDL = getDlvSlipDL(up1());
			MCIndexKey dlvSlipIdxkey = dlvSlipDL.createIndex(MST_DLV_SLIP_D_R.$dlv_slip_d_no);
			
			for (Iv_Chk01_DtlR dtlR : up1()) {
				
				MCNumber ivCredAmt =  sum(dtlR.trd_cur_amt(), dtlR.trd_cur_tax_amt());
				ivCredAmtSum = ivCredAmtSum.add(dtlR.dscnt_itm_flg() ? ivCredAmt.negate() : ivCredAmt);
				
				if(!isNull(dtlR.slo_d_no())) {
					MST_SLO_D_R sloDR = sloDL.getFirst(sloIdxkey, dtlR.slo_d_no());
					MCNumber sloCredAmt = (sloDR.trd_cur_amt().add(sloDR.trd_cur_tax_amt()))
							.multiply(dtlR.base_unit_qty())
							.divide(sloDR.base_unit_qty(), up0().trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(up0().trd_amt_rnd_typ()));
					
					sloCredAmtSum = sloCredAmtSum.add(dtlR.dscnt_itm_flg() ? sloCredAmt.negate() : sloCredAmt);
				}
				else if (dtlR.uplnd_flg()){
					MST_DLV_SLIP_D_R dlvSlipDR = dlvSlipDL.getFirst(dlvSlipIdxkey, dtlR.dlv_slip_d_no());
					MCNumber dlvCredAmt = (dlvSlipDR.trd_cur_amt().add(dlvSlipDR.trd_cur_tax_amt()))
							.multiply(dtlR.base_unit_qty())
							.divide(dlvSlipDR.base_unit_qty(), dlvSlipDR.getNumberNE(MAM_CUR_R.$amt_dec_place).intValue(), MAC_RND_TYP.toMC(dlvSlipDR.getStringNE(MAM_BP_R.$sls_amt_rnd_typ)));
					
					dlvCredAmtSum = dlvCredAmtSum.add(dtlR.dscnt_itm_flg() ? dlvCredAmt.negate() : dlvCredAmt);
				}
			}
			
			MCList<Cred_Upd01_CndR> credL = MCList.create(Cred_Upd01_CndR.class);
			if (!ivCredAmtSum.isZero()) {
				
				Cred_Upd01_CndR credR = Cred_Upd01_CndR.create();
				credR.cst_cd(up0().ship_rqst_id_cd());
				credR.cur_cd(up0().trd_cur_cd());
				credR.trd_ptn_typ(up0().trd_ptn_typ());
				credR.amt(ivCredAmtSum);
				
				credL.add(credR);
			}
			
			if (!sloCredAmtSum.isZero()) {
				
				Cred_Upd01_CndR credR = Cred_Upd01_CndR.create();
				credR.cst_cd(up0().ship_rqst_id_cd());
				credR.cur_cd(up0().trd_cur_cd());
				credR.trd_ptn_typ(up0().trd_ptn_typ());
				credR.amt(sloCredAmtSum.negate());
				
				credL.add(credR);
			}
			
			if (!dlvCredAmtSum.isZero()) {
				
				Cred_Upd01_CndR credR = Cred_Upd01_CndR.create();
				credR.cst_cd(up0().ship_rqst_id_cd());
				credR.cur_cd(dlvSlipDL.get(0).getStringNE(MST_DLV_SLIP_R.$trd_cur_cd));
				credR.trd_ptn_typ(up0().trd_ptn_typ());
				credR.amt(dlvCredAmtSum.negate());
				
				credL.add(credR);
			}
			
			return credL;
		}
		
		/**
		 * 下り情報の設定
		 * 
		 */
		protected void setDown() {
			down0().iv_no(up0().iv_no());
			down0().iv_rev(up0().iv_rev());
			down1().setAll(up1());
		}
	}
	/**
	 * Iv_Upd01オペレーション.<p>
	 *
	 * インボイスを更新する。<br>
	 */
	public class Iv_Upd01 extends MSBEL_IvRegService_MC_A.Iv_Upd01 {
		/**
		 * インボイスの出荷実績情報（配送先経由しない）
		 */
		protected MCList<Iv_Upd03_RsltR> _ivShipActL = null;
		
		/**
		 * 訂正前のインボイス出荷実績マップ
		 */
		protected MCList<MST_IV_SHIP_ACT_MAP_R> _orgIvShipActMapL = null;
		
		/**
		 * インボイス出荷実績マップ
		 */
		protected MCList<MST_IV_SHIP_ACT_MAP_R> _ivShipActMapL = null;
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {

			if (up0().sls_cststk_flg() && up0().sls_cmpl_flg()) {
				updIvSlsCstStkSlsCmpl();
				
				return;
			}

			if (MAC_TRD_PTN_TYP.isSLS(up0().trd_ptn_typ())) { //売上の場合
				//マニュアル追加行の売上予定サービス実行（削除）
				delSlsSchdMan();
			}

			//発番処理
			setNum();
						
			//インボイス更新
			updIv();
			callIoActSvWK();
			
			//出荷予定サービス実行
			callShipSchdUpd04(up1(), up2());

			if (MAC_TRD_PTN_TYP.isSLS(up0().trd_ptn_typ())) { //売上の場合
				//売上予定サービス実行
				doSlsSchdUpd();
			}
			if (MAC_TRD_PTN_TYP.isSLS(up0().trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(up0().trd_ptn_typ())) {
				
				//受注状況登録処理
				callSlsSTsIns01(up0(), up1(), MAC_DATA_CRUD_TYP.UPD.value());
			}

			//インボイス帳票印刷処理
			callPrnt03(up0());
			// 与信更新
			callCredSv();

			//下り電文設定処理
			setDown();
			// 仮単価メッセージセット
			setInterimMsg(up0(), up1());
			//受払実績管理サービス実行
			callIoActUpdSv(up0());
		}

		/**
		 * マニュアル追加行の売上予定サービス実行（削除）
		 */
		protected void delSlsSchdMan() {
			//マニュアル追加行
			MCList<Iv_Chk01_DtlR> manAddL = up1().subList(Iv_Chk01_DtlR.$manual_add_flg, true);
			
			if(!manAddL.isEmpty()) {
				//売上予定サービス実行（マニュアル追加行の更新（削除））
				MCList<Iv_Chk01_DtlR> tmpDelL = MCList.create(Iv_Chk01_DtlR.class);

				for(Iv_Chk01_DtlR dR : manAddL) {
					if (MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ()) && dR.isStatusModify()) {
						// 計画外売上の場合、マニュアル追加行の訂正を削除⇒新規で呼ばない（売上数量を保持する必要）
						continue;
					}
					if(!dR.isStatusCreate()) {
						tmpDelL.add(dR);
					}
				}
				if(!tmpDelL.isEmpty()) {
					//売上予定サービス実行（マニュアル追加行の更新(削除)）
					callSlsSchdUpd05(up0(), tmpDelL, MAC_DATA_CRUD_TYP.DEL.value());
				}
			}
		}

		/**
		 * 売上予定サービス実行（訂正時）
		 */
		protected void doSlsSchdUpd() {
			//仕入直送 - マニュアル追加行を除く
			MCList<Iv_Chk01_DtlR> purcDdlvL = up1().subList(
					new String[]{Iv_Chk01_DtlR.$purc_ddlv_flg, Iv_Chk01_DtlR.$manual_add_flg}, 
					new Comparable[]{true, false});
			//仕入直送以外 - マニュアル追加行を除く
			MCList<Iv_Chk01_DtlR> nonPurcDdlvL = up1().subList(
					new String[]{Iv_Chk01_DtlR.$purc_ddlv_flg, Iv_Chk01_DtlR.$manual_add_flg}, 
					new Comparable[]{false, false});
			if (MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())) {
				// 計画外売上の場合、マニュアル追加行も更新で売上予定を呼ぶ（売上数量を保持するため）
				MCList<Iv_Chk01_DtlR> manAddL = up1().subList(r->r.manual_add_flg() && !r.isStatusDelete());
				nonPurcDdlvL.addAll(manAddL);
			}

			if(!purcDdlvL.isEmpty()) {
				//売上予定サービス実行（仕入直送 - マニュアル追加行を除く）
				callSlsSchdUpd04(up0(), purcDdlvL, MAC_DATA_CRUD_TYP.UPD.value());
			}
			if(!nonPurcDdlvL.isEmpty()) {
				//売上予定サービス実行（仕入直送以外 - マニュアル追加行を除く）
				callSlsSchdUpd05(up0(), nonPurcDdlvL, MAC_DATA_CRUD_TYP.UPD.value());
			}

			//マニュアル追加行の売上予定サービス実行（新規）
			addSlsSchdMan();
		}

		/**
		 * マニュアル追加行の売上予定サービス実行（新規）
		 */
		protected void addSlsSchdMan() {
			if (MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())) {
				// 計画外売上の場合、マニュアル追加行を削除⇒新規で呼ばない（売上数量を保持する必要）
				return;
			}
			//マニュアル追加行
			MCList<Iv_Chk01_DtlR> manAddL = up1().subList(Iv_Chk01_DtlR.$manual_add_flg, true);
			if(!manAddL.isEmpty()) {
				//売上予定サービス実行（マニュアル追加行の更新（新規））
				MCList<Iv_Chk01_DtlR> tmpInsL = MCList.create(Iv_Chk01_DtlR.class);

				for(Iv_Chk01_DtlR dR : manAddL) {
					if(!dR.isStatusDelete()) {
						tmpInsL.add(dR);
					}
				}
				if(!tmpInsL.isEmpty()) {
					//売上予定サービス実行（マニュアル追加行の更新(新規)）
					callSlsSchdUpd05(up0(), tmpInsL, MAC_DATA_CRUD_TYP.CRT.value());
				}
			}
		}
		
		/**
		 * 発番処理
		 * 
		 */
		protected void setNum() {

			//マニュアル追加した明細を絞り込む
			MCList<Iv_Chk01_DtlR> ivD_InsL = up1().subList(MCRow.Status.CREATE);

			//明細のインボイス管理ＮＯを設定
			ivD_InsL.setStringNE(MST_IV_D_R.$iv_mng_no, up0().iv_mng_no());

			//インボイス明細ＮＯの発番
			setIvDNo(ivD_InsL);

			//表示順の発番
			setDispSeq(up1());
		}

		/**
		 * インボイス更新
		 */
		protected void updIv() {

			preSet(up0(), up1());

			//三国間の場合
			if(!isNull(up0().rcpt_iv_mng_no())) {
				updIvIntrm();
			}
			//直貿の場合
			else {
				updIvDirectTrad();
				updIvShipInstMap();
				updIvShipActMap();
			}
		}
		
		/**
		 * インボイス更新（三国間）
		 */
		protected void updIvIntrm() {

			updIvIntrmSub(up0(), up1(), up2(), MAC_DATA_CRUD_TYP.UPD.value());			
		}

		/**
		 * インボイス更新（直貿）
		 */
		protected void updIvDirectTrad() {

			MCList<Iv_Chk01_DtlR> ivD_UpdL = up1().subList(MCRow.Status.MODIFY);
			MCList<Iv_Chk01_DtlR> ivD_DelL = up1().subList(MCRow.Status.DELETE);

			setIvMapShipActMode(up0(), up2());
			MCList<Iv_Chk01_MapDtlR> ivMap_delL = getIvMapDelL(ivD_DelL, up2());
			MCList<Iv_Chk01_MapDtlR> ivMap_updL = getIvMapUpdL(ivD_UpdL, up2());
			
			MCList<Iv_Chk01_MapDtlR> ivMap_insTmpL = getIvMapInsTmpL();
			//登録対象のiv_mapを選別すると同時に、iv_d_noを付与する
			MCList<Iv_Chk01_DtlR> ivD_InsUpdL = up1().subList(MCRow.Status.CREATE, MCRow.Status.MODIFY);
			MCList<Iv_Chk01_MapDtlR> ivMap_insL = getIvMapInsL(ivMap_insTmpL, ivD_InsUpdL);

			ivDbAccess(up0(), up1());
			ivMapDbAccess(ivMap_delL, ivMap_updL, ivMap_insL);
		}
		/**
		 * 預り売上かつ売上済の場合、パッキングリスト省略のみ更新する。
		 */
		protected void updIvSlsCstStkSlsCmpl() {
			
			MST_IV_R ivR = MST_IV_R.create();
			ivR.iv_mng_no(up0().iv_mng_no());
			ivR.iv_rev(up0().iv_rev());
			ivR.pl_skip_flg(up0().pl_skip_flg());
			
			MST_IV_R iv = MST_IV_R.create("IV");
			MCQueryApiBuilder ivR_bldr = MCQueryApiBuilder.create(iv);
			ivR_bldr.setSet(iv.pl_skip_flg);
			dbUpdateKey("MSBEL5730_MST_IV_U03", ivR, ivR_bldr);
			
			callRevDataIns01(ivR);
			
			//受注状況登録処理
			callSlsSTsIns01(up0(), up1(), MAC_DATA_CRUD_TYP.UPD.value());
			
			setDown();
		}
		
		/**
		 * 受払実績サービスを呼び出す。
		 */
		protected void callIoActSvWK() {
			
			if (isNoIoActTgt(up0())) {
				return;
			}
			
			MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL = MCList.create(MST_IV_SHIP_ACT_MAP_R.class);
			
			if (MSC_IV_SRC_TYP.isSHIP_ACT(up0().iv_src_typ()) || MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())) {
				ivShipActMapL.setAll(_ivShipActMapL);
			}
			else {
				for (Iv_Upd03_RsltR r : _ivShipActL) {
					MST_IV_SHIP_ACT_MAP_R mapR = MST_IV_SHIP_ACT_MAP_R.create();
					mapR.ship_act_d_no(r.ship_act_d_no());
					mapR.base_unit_qty(r.base_unit_qty());
					MST_IV_SHIP_ACT_MAP_R orgR = _orgIvShipActMapL.getFirst(MST_IV_SHIP_ACT_MAP_R.$ship_act_d_no, r.ship_act_d_no());
					if (!isNull(orgR)) {
						mapR.setStatus(MCRow.Status.MODIFY);
					}
					else {
						mapR.setStatus(MCRow.Status.CREATE);
					}
					ivShipActMapL.add(mapR);
				}
				
				for (MST_IV_SHIP_ACT_MAP_R orgR :_orgIvShipActMapL) {
					Iv_Upd03_RsltR dtlR = _ivShipActL.getFirst(Iv_Upd03_RsltR.$ship_act_d_no, orgR.ship_act_d_no());
					
					if (!isNull(dtlR)) {
						continue;
					}
					
					MST_IV_SHIP_ACT_MAP_R mapR = MST_IV_SHIP_ACT_MAP_R.create();
					mapR.ship_act_d_no(orgR.ship_act_d_no());
					mapR.setStatus(MCRow.Status.DELETE);
					ivShipActMapL.add(mapR);
				}
			}
			
			if (!ivShipActMapL.isEmpty()) {
				MST_IV_R ivR = MST_IV_R.create();
				ivR.iv_no(up0().iv_no());
				ivR.iv_rev(up0().iv_rev());
				ivR.iv_dt(up0().iv_dt());
				
				callIoActInsSv(ivShipActMapL, ivR, true, false, true);
			}
		}
		
		/**
		 * インボイス出荷指図マップを更新する。
		 */
		protected void updIvShipInstMap() {
			
			if (MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())
					&& MAC_TRD_PTN_TYP.isSLS_CNSGN(up0().trd_ptn_typ())) {
				// 売上実績登録画面で貸出売上を登録する際に、インボイス出荷指図マップを更新しない
				return;
			}
			
			if (MSC_IV_SRC_TYP.isSHIP_INST(up0().iv_src_typ())) {
				delIvShipInstMap(up1());
				callIvRegSrvForShipInstFix(up0().iv_no(), up1(), up3());
			}
			else {
				delIvShipInstMapUnFix(up1());
				callIvRegSrvForShipInstUnFix(up0().iv_no(), getShipInstDNoL(up0().iv_mng_no())) ;
			}
		}
		
		/**
		 * 引数に指定されたインボイス管理ＮＯに紐づく出荷指図明細ＮＯを取得する。
		 * @param ivMngNo インボイス管理ＮＯ
		 * @return 出荷指図明細ＮＯリスト
		 */
		protected List<String> getShipInstDNoL(String ivMngNo) {
			
			MCList<MST_SHIP_INST_D_R> shipInstDL = MCList.create(MST_SHIP_INST_D_R.class);
			
			MST_SHIP_INST_D_R shipInstD = MST_SHIP_INST_D_R.create("SHIPINSTD");
			MST_SHIP_INST_R shipInst = MST_SHIP_INST_R.create("SHIPINST");
			MST_SHIP_SCHD_R shipSchd = MST_SHIP_SCHD_R.create("SHIPSCHD");
			MST_IV_MAP_R ivMap = MST_IV_MAP_R.create("IVMAP");
			MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
			MST_IV_R iv = MST_IV_R.create("IV");
			
			MCQueryApiBuilder  shipInstD_bldr = MCQueryApiBuilder.create(shipInstD);
			shipInstD_bldr.setSelect(shipInstD.ship_inst_d_no);
			shipInstD_bldr.addInnerJoin(shipInst, shipInstD.ship_inst_no.eq(shipInst.ship_inst_no));
			shipInstD_bldr.addInnerJoin(shipSchd, shipInstD.ship_inst_d_no.eq(shipSchd.ship_inst_d_no));
			shipInstD_bldr.addInnerJoin(ivMap, shipSchd.ship_schd_no.eq(ivMap.ship_schd_no));
			shipInstD_bldr.addInnerJoin(ivD, ivMap.iv_d_no.eq(ivD.iv_d_no));
			shipInstD_bldr.addInnerJoin(iv, ivD.iv_mng_no.eq(iv.iv_mng_no));
			shipInstD_bldr.setWhere(iv.iv_mng_no.eq(bind("1")), ivMngNo);
			shipInstD_bldr.addConstWhereWithAnd(shipInst.can_flg.eq(value(false)));
			shipInstD_bldr.addConstWhereWithAnd(shipInstD.can_flg.eq(value(false)));
			
			dbSelect("MSBEL5730_MST_SHIP_INST_S01", shipInstDL, shipInstD_bldr);
			
			return shipInstDL.getStringNE(MST_SHIP_INST_D_R.$ship_inst_d_no);
		}
		
		/**
		 * インボイス出荷実績マップを更新する。
		 */
		protected void updIvShipActMap() {
			
			if (MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())
					&& MAC_TRD_PTN_TYP.isSLS_CNSGN(up0().trd_ptn_typ())) {
				// 売上実績登録画面で貸出売上を登録する際に、インボイス出荷実績マップを更新しない
				return;
			}
			
			_orgIvShipActMapL = getIvShipActMapL(up1());
			
			if (MSC_IV_SRC_TYP.isSHIP_ACT(up0().iv_src_typ())
					|| (MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ()))) {
				updIvShipActMapFix();
			}
			else {
				delIvShipActMap(up1());
				callIvRegSrvForShipAct(up0().iv_mng_no()) ;
			}
		}
		
		/**
		 * インボイス出荷実績マップを更新する（FIXモード）。
		 */
		protected void updIvShipActMapFix() {
			
			_ivShipActMapL = MCList.create(MST_IV_SHIP_ACT_MAP_R.class);
			
			MST_IV_SHIP_ACT_MAP_R ivShipActMapR = null;
			
			for(Iv_Chk01_ShipActMapDtlR mapR : up4()) {

				for(Iv_Chk01_DtlR dtlR : up1()) {
					
					if(isSame(mapR.index(), dtlR.index())) {
						
						ivShipActMapR = MST_IV_SHIP_ACT_MAP_R.create();
						copy(ivShipActMapR, mapR, createMap_MST_IV_SHIP_ACT_MAP_R_Iv_Chk01_ShipActMapDtlR());
						
						if (!isNull(mapR.iv_d_no())) {
							if (dtlR.isStatusDelete() ||
									(MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ()) && mapR.isStatusDelete())) {
								ivShipActMapR.setStatus(MCRow.Status.DELETE);
							}
							else if (dtlR.isStatusModify() || dtlR.isStatusNone()) {
								ivShipActMapR.setStatus(MCRow.Status.MODIFY);
								if(!dtlR.bndl_flg()) {
									ivShipActMapR.base_unit_qty(dtlR.base_unit_qty());
								}
							}
						}
						else {
							ivShipActMapR.iv_d_no(dtlR.iv_d_no());
							if(!dtlR.bndl_flg()) {
								ivShipActMapR.base_unit_qty(dtlR.base_unit_qty());
							}
							ivShipActMapR.setStatus(MCRow.Status.CREATE);
						}
						
						ivShipActMapR.addDateColumn(Iv_Upd03_Ctrl2R.$can_ac_dt, up0().can_ac_dt());
						_ivShipActMapL.add(ivShipActMapR);
						break;
					}
				}
			}
			
			dbLockInsUpdDelByStatusNoCheck("MSBEL5730_MST_IV_SHIP_ACT_MAP_U01", _ivShipActMapL, MCQueryApiBuilder.create(MST_IV_SHIP_ACT_MAP_R.create("T")));
		}
		
		/**
		 * インボイス登録サービスのIv_Upd03を呼び出す。
		 * @param ivMngNo インボイス管理NO
		 */
		protected void callIvRegSrvForShipAct(String ivMngNo) {
			
			MSBEL_IvRegService.Iv_Upd03 ope = MSBEL_IvRegService.crtIv_Upd03();
			_ivShipActL  = MCList.create(Iv_Upd03_RsltR.class);
			
			for (String shipActDNo : getShipActDNoL(ivMngNo)) {
				
				Iv_Upd03_Ctrl2R upR = Iv_Upd03_Ctrl2R.create();
				upR.ship_act_d_no(shipActDNo);
				ope.up1().add(upR);
			}
				
			if (!ope.up1().isEmpty()) {
				
				ope.up0().iv_reg_flg(true);
				ope.up0().iv_no(up0().iv_no());
				
				ope.exec();
				
				_ivShipActL.setAll(ope.down0());
			}
		}
		
		/**
		 * インボイス出荷実績マップを削除する。
		 * @param dtlL インボイス明細リスト
		 */
		protected void delIvShipActMap(MCList<Iv_Chk01_DtlR> dtlL) {
			
			MST_IV_SHIP_ACT_MAP_R ivShipActMap = MST_IV_SHIP_ACT_MAP_R.create("T");
			
			MCDelete q = sql("MSBEL5730_MST_IV_SHIP_ACT_MAP_D02").delete(ivShipActMap)
					.where(value(0).eq(value(0))
					.and(ivShipActMap.iv_d_no.eq(bind("iv_d_no"))
					.and(ivShipActMap.ship_act_fix_flg.eq(value(false)))
					.and(ivShipActMap.fix_flg.eq(value(false)))));
			
			q.executeBatchUpdate(dtlL);
		}
		
		/**
		 * 引数に指定されたインボイス管理NOに紐づく出荷実績明細NOを取得する。
		 * @param ivMngNo インボイス管理NO
		 * @return 出荷実績明細NOリスト
		 */
		protected List<String> getShipActDNoL(String ivMngNo) {
			
			MCList<MST_SHIP_ACT_D_R> shipActDL = MCList.create(MST_SHIP_ACT_D_R.class);
			
			MST_SHIP_ACT_D_R shipActD = MST_SHIP_ACT_D_R.create("SHIPACTD");
			MST_SHIP_ACT_R shipAct = MST_SHIP_ACT_R.create("SHIPACT");
			MST_SHIP_ALLOC_STS_R shipAllocSts = MST_SHIP_ALLOC_STS_R.create("SHIPALLOCSTS");
			MST_SHIP_SCHD_R shipSchd = MST_SHIP_SCHD_R.create("SHIPSCHD");
			MST_IV_MAP_R ivMap = MST_IV_MAP_R.create("IVMAP");
			MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
			MST_IV_R iv = MST_IV_R.create("IV");
			
			MCQueryApiBuilder  shipActD_bldr = MCQueryApiBuilder.create(shipActD);
			shipActD_bldr.setSelect(shipActD.ship_act_d_no);
			shipActD_bldr.addInnerJoin(shipAct, shipActD.ship_act_no.eq(shipAct.ship_act_no));
			shipActD_bldr.addInnerJoin(shipAllocSts, shipActD.ship_alloc_sts_no.eq(shipAllocSts.ship_alloc_sts_no));
			shipActD_bldr.addInnerJoin(shipSchd, shipAllocSts.ship_schd_no.eq(shipSchd.ship_schd_no));
			shipActD_bldr.addInnerJoin(ivMap, shipSchd.ship_schd_no.eq(ivMap.ship_schd_no));
			shipActD_bldr.addInnerJoin(ivD, ivMap.iv_d_no.eq(ivD.iv_d_no));
			shipActD_bldr.addInnerJoin(iv, ivD.iv_mng_no.eq(iv.iv_mng_no));
			shipActD_bldr.setWhere(iv.iv_mng_no.eq(bind("1")), ivMngNo);
			shipActD_bldr.addConstWhereWithAnd(shipAct.can_flg.eq(value(false)));
			shipActD_bldr.addConstWhereWithAnd(shipActD.can_flg.eq(value(false)));
			
			dbSelect("MSBEL5730_MST_SHIP_ACT_S01", shipActDL, shipActD_bldr);
			
			return shipActDL.getStringNE(MST_SHIP_ACT_D_R.$ship_act_d_no);
		}
		
		/**
		 * 与信対象額を計算し、与信サービスを実行する。
		 */
		protected void callCredSv() {
			
			if (!MAC_TRD_PTN_TYP.isSLS(up0().trd_ptn_typ()) 
					|| MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())) {
				return;
			}
			
			MCList<Cred_Upd01_CndR> credL = calcCredAmt();
			callCredSvUpd01(credL);
		}
		
		/**
		 * 与信サービスを作成する。
		 * @return  与信サービスの上り電文
		 */
		protected MCList<Cred_Upd01_CndR> calcCredAmt() {
			
			MCNumber ivCredAmtSum = MCNumber.ZERO;
			MCNumber srcIvCredAmtSum = MCNumber.ZERO;
			MCNumber sloCredAmtSum = MCNumber.ZERO;
			MCNumber dlvCredAmtSum = MCNumber.ZERO;
			
			MCList<MST_SLO_D_R> sloDL = getSloDL(up1());
			MCIndexKey sloIdxkey = sloDL.createIndex(MST_SLO_D_R.$slo_d_no);
			
			MCList<MST_DLV_SLIP_D_R> dlvSlipDL = getDlvSlipDL(up1());
			MCIndexKey dlvSlipIdxkey = dlvSlipDL.createIndex(MST_DLV_SLIP_D_R.$dlv_slip_d_no);
			
			MCList<MST_IV_D_R> srcIvL = getIvDCache();
			MCIndexKey ivIdxkey = srcIvL.createIndex(MST_IV_D_R.$iv_d_no);
			
			for (Iv_Chk01_DtlR dtlR : up1()) {
				
				MCNumber credSchdQty = MCNumber.ZERO;
				
				if (dtlR.isStatusCreate()) {
					credSchdQty = dtlR.base_unit_qty();
					MCNumber ivCredAmt =  sum(dtlR.trd_cur_amt(), dtlR.trd_cur_tax_amt());
					ivCredAmtSum = ivCredAmtSum.add(dtlR.dscnt_itm_flg() ? ivCredAmt.negate() : ivCredAmt);
				}
				else {
					MST_IV_D_R srcIvR = srcIvL.getFirst(ivIdxkey, dtlR.iv_d_no());
					
					MCNumber srcIvCredAmt =  sum(srcIvR.trd_cur_amt(), srcIvR.trd_cur_tax_amt());
					srcIvCredAmtSum = srcIvCredAmtSum.add(dtlR.dscnt_itm_flg() ? srcIvCredAmt.negate() : srcIvCredAmt);
					
					if (dtlR.isStatusDelete()) {
						credSchdQty = srcIvR.base_unit_qty();
					}
					else {
						credSchdQty = dtlR.base_unit_qty().subtract(srcIvR.base_unit_qty());
						
						MCNumber ivCredAmt =  sum(dtlR.trd_cur_amt(), dtlR.trd_cur_tax_amt());
						ivCredAmtSum = ivCredAmtSum.add(dtlR.dscnt_itm_flg() ? ivCredAmt.negate() : ivCredAmt);
					}
				}
				
				if(credSchdQty.isZero()) {
					continue;
				}
				
				if(!isNull(dtlR.slo_d_no())) {
					MST_SLO_D_R sloDR = sloDL.getFirst(sloIdxkey, dtlR.slo_d_no());
					MCNumber sloCredAmt = (sloDR.trd_cur_amt().add(sloDR.trd_cur_tax_amt()))
							.multiply(credSchdQty)
							.divide(sloDR.base_unit_qty(), up0().trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(up0().trd_amt_rnd_typ()));
					
					sloCredAmt = dtlR.dscnt_itm_flg() ? sloCredAmt.negate() : sloCredAmt;
					sloCredAmt = dtlR.isStatusDelete() ? sloCredAmt.negate() : sloCredAmt;
					sloCredAmtSum = sloCredAmtSum.add(sloCredAmt);
				}
				else if (dtlR.uplnd_flg()){
					MST_DLV_SLIP_D_R dlvSlipDR = dlvSlipDL.getFirst(dlvSlipIdxkey, dtlR.dlv_slip_d_no());
					MCNumber dlvCredAmt = (dlvSlipDR.trd_cur_amt().add(dlvSlipDR.trd_cur_tax_amt()))
							.multiply(credSchdQty)
							.divide(dlvSlipDR.base_unit_qty(), dlvSlipDR.getNumberNE(MAM_CUR_R.$amt_dec_place).intValue(), MAC_RND_TYP.toMC(dlvSlipDR.getStringNE(MAM_BP_R.$sls_amt_rnd_typ)));
					
					dlvCredAmt = dtlR.dscnt_itm_flg() ? dlvCredAmt.negate() : dlvCredAmt;
					dlvCredAmt = dtlR.isStatusDelete() ? dlvCredAmt.negate() : dlvCredAmt;
					dlvCredAmtSum = dlvCredAmtSum.add(dlvCredAmt);
				}
			}
			
			MCList<Cred_Upd01_CndR> credL = MCList.create(Cred_Upd01_CndR.class);
			if (!ivCredAmtSum.subtract(srcIvCredAmtSum).isZero()) {
				
				Cred_Upd01_CndR credR = Cred_Upd01_CndR.create();
				credR.cst_cd(up0().ship_rqst_id_cd());
				credR.cur_cd(up0().trd_cur_cd());
				credR.trd_ptn_typ(up0().trd_ptn_typ());
				credR.amt(ivCredAmtSum.subtract(srcIvCredAmtSum));
				
				credL.add(credR);
			}
			
			if (!sloCredAmtSum.isZero()) {
				
				Cred_Upd01_CndR credR = Cred_Upd01_CndR.create();
				credR.cst_cd(up0().ship_rqst_id_cd());
				credR.cur_cd(up0().trd_cur_cd());
				credR.trd_ptn_typ(up0().trd_ptn_typ());
				credR.amt(sloCredAmtSum.negate());
				
				credL.add(credR);
			}
			
			if (!dlvCredAmtSum.isZero()) {
				
				Cred_Upd01_CndR credR = Cred_Upd01_CndR.create();
				credR.cst_cd(up0().ship_rqst_id_cd());
				credR.cur_cd(dlvSlipDL.get(0).getStringNE(MST_DLV_SLIP_R.$trd_cur_cd));
				credR.trd_ptn_typ(up0().trd_ptn_typ());
				credR.amt(dlvCredAmtSum.negate());
				
				credL.add(credR);
			}
			
			return credL;
		}

		protected MCList<Iv_Chk01_MapDtlR> getIvMapInsTmpL() {
			MCList<Iv_Chk01_MapDtlR> ivMap_insL = MCList.create(Iv_Chk01_MapDtlR.class);

			for(Iv_Chk01_MapDtlR mapR : up2()) {

				if(isNull(mapR.iv_d_no())) {
					ivMap_insL.add(mapR);
				}
			}

			return ivMap_insL;
		}

		protected void ivMapDbAccess(
				MCList<Iv_Chk01_MapDtlR> ivMap_delL, 
				MCList<Iv_Chk01_MapDtlR> ivMap_updL, 
				MCList<Iv_Chk01_MapDtlR> ivMap_insL)
		{
			delIvMap(ivMap_delL);
			updIvMap(ivMap_updL);
			insIvMap(ivMap_insL);
		}

		/**
		 * 下り情報の設定
		 * 
		 */
		protected void setDown() {
			down0().iv_no(up0().iv_no());
			down0().iv_rev(up0().iv_rev());
			down1().setAll(up1());
		}
	}
	/**
	 * Iv_Upd02オペレーション.<p>
	 *
	 * インボイス出荷指図マップを更新する。<br>
	 */
	public class Iv_Upd02 extends MSBEL_IvRegService_MC_A.Iv_Upd02 {
		
		/**
		 * 出荷指図明細リスト
		 */
		protected MCList<MST_SHIP_INST_D_R> _shipInstDL = null;
		
		/**
		 * インボイスマップリスト
		 */
		protected MCList<MST_IV_MAP_R> _ivMapL = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			delIvShipInstMap();
			
			getShipInstDL();
			
			setShipInstQtyForFix();
			
			getIvMap();
			
			setIvMapForFix();
			
			insIvShipInstMap();
		}
		
		/**
		 * インボイス出荷指図マップを削除する。
		 */
		protected void delIvShipInstMap() {
			
			if (!up0().ship_inst_reg_flg()) {
				return;
			}
			
			MST_IV_SHIP_INST_MAP_R del_t = MST_IV_SHIP_INST_MAP_R.create("T");
			
			MCDelete q = sql("MSBEL5730_MST_IV_SHIP_INST_MAP_D01").delete(del_t)
					.where(value(0).eq(value(0))
					.and(del_t.ship_inst_d_no.eq(bind("ship_inst_d_no"))
					.and(del_t.fix_flg.eq(value(false)))));
			
			q.executeBatchUpdate(up1());
		}
		
		/**
		 * 出荷指図明細を取得する。
		 */
		protected void getShipInstDL() {
			
			_shipInstDL = MCList.create(MST_SHIP_INST_D_R.class);
			_shipInstDL.addStringColumn(MST_SHIP_SCHD_R.$ship_schd_no);
			_shipInstDL.addStringColumn(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no);
			_shipInstDL.addStringColumn(MST_IV_SHIP_INST_MAP_R.$iv_d_no);
			_shipInstDL.addBooleanColumn(MST_IV_SHIP_INST_MAP_R.$fix_flg);
			_shipInstDL.addBooleanColumn(MST_IV_SHIP_INST_MAP_R.$ship_inst_fix_flg);
			_shipInstDL.addNumberColumn("usable_qty");
			
			crtShipInstDWk(up1().getStringNE(Iv_Upd02_Ctrl2R.$ship_inst_d_no));
			executeQuery(_shipInstDL, MSBEL5730_MST_SHIP_INST_D_S01());
		}
		
		protected void setShipInstQtyForFix() {
			
			MCList<Iv_Upd02_Ctrl2R> shipInstFixL =up1().subList(r->!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && (r.ship_inst_fix_flg() || r.fix_flg()));
			if (isNull(_shipInstDL) || shipInstFixL.size() == 0) {
				return;
			}
			
			MCList<MST_SHIP_INST_D_R> shipInstDL = _shipInstDL.createInstance();
			
			MCIndexKey idxkey = _shipInstDL.createIndex(MST_SHIP_SCHD_R.$ship_inst_d_no);
			
			for (Iv_Upd02_Ctrl2R ctrl2R : shipInstFixL) {
				
				MCNumber shipInstIvQty = ctrl2R.base_unit_qty();
				
				for (MST_SHIP_INST_D_R orgShipInstDR : _shipInstDL.subList(idxkey, ctrl2R.ship_inst_d_no())) {
					
					if (!shipInstIvQty.isPositive() || !orgShipInstDR.base_unit_qty().isPositive() ) {
						break;
					}
					
					MST_SHIP_INST_D_R shipInstDR = orgShipInstDR.clone();
					
					if (shipInstIvQty.gt(shipInstDR.base_unit_qty())) {
						shipInstIvQty = shipInstIvQty.subtract(shipInstDR.base_unit_qty());
					}
					else {
						shipInstDR.base_unit_qty(shipInstIvQty);
						shipInstIvQty = MCNumber.ZERO;
					}
					
					shipInstDR.setBooleanNE(MST_IV_SHIP_INST_MAP_R.$fix_flg, ctrl2R.fix_flg());
					shipInstDR.setBooleanNE(MST_IV_SHIP_INST_MAP_R.$ship_inst_fix_flg, ctrl2R.ship_inst_fix_flg());
					shipInstDR.setStringNE(MST_IV_SHIP_INST_MAP_R.$iv_d_no, ctrl2R.iv_d_no());
					
					orgShipInstDR.base_unit_qty(orgShipInstDR.base_unit_qty().subtract(shipInstDR.base_unit_qty()));

					shipInstDL.add(shipInstDR);
				}
			}
			
			_shipInstDL.setAll(shipInstDL);
		}
		
		/**
		 * インボイスマップを取得する。
		 */
		protected void getIvMap() {
			_ivMapL = MCList.create(MST_IV_MAP_R.class);
			_ivMapL.addStringColumn(MST_IV_R.$iv_no);
			_ivMapL.addBooleanColumn(MST_IV_R.$iv_ship_flg);
			
			if (_shipInstDL.isEmpty()) {
				return;
			}
			
			crtShipSchdWk(_shipInstDL.distinctNE(MST_SHIP_SCHD_R.$ship_schd_no).getStringNE(MST_SHIP_SCHD_R.$ship_schd_no));
			
			executeQuery(_ivMapL, MSBEL5730_MST_IV_MAP_S01(), up0());
		}
		
		protected void setIvMapForFix() {
			
			MCList<Iv_Upd02_Ctrl2R> shipInstFixL =up1().subList(r->!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && (r.ship_inst_fix_flg() || r.fix_flg()));
			if (isNull(_ivMapL) || shipInstFixL.size() == 0) {
				return;
			}
			
			MCList<MST_IV_MAP_R> ivMapL = _ivMapL.createInstance();
			
			MCIndexKey idxkey = _ivMapL.createIndex(MST_IV_MAP_R.$iv_d_no);
			
			for (Iv_Upd02_Ctrl2R ctrl2R : shipInstFixL) {
				
				ivMapL.addAll(_ivMapL.subList(idxkey, ctrl2R.iv_d_no()));
			}
			
			_ivMapL.setAll(ivMapL);
		}
		
		/**
		 * インボイス出荷指図マップを登録する。
		 */
		protected void insIvShipInstMap() {
			
			if (_shipInstDL.isEmpty()) {
				return;
			}
			
			MCIndexKey idxkey = _shipInstDL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
			
			MCList<MST_IV_SHIP_INST_MAP_R> ivShipInstMapL = MCList.create(MST_IV_SHIP_INST_MAP_R.class);
			
			for (MST_IV_MAP_R ivMapR : _ivMapL) {
				
				MCNumber IvQty = ivMapR.base_unit_qty();
				
				for (MST_SHIP_INST_D_R shipInstDR : _shipInstDL.subList(idxkey, ivMapR.ship_schd_no())) {
					
					if (IvQty.isZero()) {
						break;
					}
					
					if (shipInstDR.base_unit_qty().isZero()) {
						continue;
					}
					
					if (!isNull(shipInstDR.getStringNE(MST_IV_SHIP_INST_MAP_R.$iv_d_no)) 
							&&  !isSame(ivMapR.iv_d_no(), shipInstDR.getStringNE(MST_IV_SHIP_INST_MAP_R.$iv_d_no))) {
						continue;
					}
					
					MST_IV_SHIP_INST_MAP_R ivShipInstMapR = MST_IV_SHIP_INST_MAP_R.create();
					
					MCNumber baseUnitQty = MCNumber.ZERO;
					
					if (IvQty.gt(shipInstDR.base_unit_qty())) {
						
						baseUnitQty = shipInstDR.base_unit_qty();
						IvQty = IvQty.subtract(shipInstDR.base_unit_qty());
						shipInstDR.base_unit_qty(MCNumber.ZERO);
					}
					else {
						baseUnitQty = IvQty;
						shipInstDR.base_unit_qty(shipInstDR.base_unit_qty().subtract(IvQty));
						IvQty = MCNumber.ZERO;
					}
					
					ivShipInstMapR.iv_d_no(ivMapR.iv_d_no());
					ivShipInstMapR.ship_schd_no(shipInstDR.getStringNE(MST_SHIP_SCHD_R.$ship_schd_no));
					ivShipInstMapR.ship_alloc_sts_no(shipInstDR.getStringNE(MST_SHIP_ALLOC_STS_R.$ship_alloc_sts_no));
					ivShipInstMapR.ship_inst_d_no(shipInstDR.ship_inst_d_no());
					ivShipInstMapR.base_unit_qty(baseUnitQty);
					if (ivMapR.getBooleanNE(MST_IV_R.$iv_ship_flg) || shipInstDR.getBooleanNE(MST_IV_SHIP_INST_MAP_R.$ship_inst_fix_flg)) {
						ivShipInstMapR.ship_inst_fix_flg(true);
					}
					ivShipInstMapR.fix_flg(shipInstDR.getBooleanNE(MST_IV_SHIP_INST_MAP_R.$fix_flg));
					
					ivShipInstMapL.add(ivShipInstMapR);
				}
			}
			
			dbInsert("MSBEL5730_MST_IV_SHIP_INST_MAP_I02", ivShipInstMapL, MCQueryApiBuilder.create(MST_IV_SHIP_INST_MAP_R.create("T")));
		}
	}
	/**
	 * Iv_Upd03オペレーション.<p>
	 *
	 * インボイス出荷実績マップを更新する。<br>
	 */
	public class Iv_Upd03 extends MSBEL_IvRegService_MC_A.Iv_Upd03 {
		
		/**
		 * 出荷実績明細リスト
		 */
		protected MCList<MST_SHIP_ACT_D_R> _shipActDL = null;
		
		/**
		 * インボイスマップリスト
		 */
		protected MCList<MST_IV_MAP_R> _ivMapL = null;
		
		/**
		 * インボイス出荷実績マップリスト
		 */
		protected MCList<MST_IV_SHIP_ACT_MAP_R> _ivShipActMapL = null;
		
		/**
		 * インボイス出荷実績マップリスト(訂正前)
		 */
		protected MCList<MST_IV_SHIP_ACT_MAP_R> _orgIvShipActMapL = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			getIvShipActMapLBefUpd();
			
			delIvShipActMap();
			
			insIvShipActFixMap();
			
			getShipActDL();
			
			getIvMap();
			
			insIvShipActMap();
			
			callSlsSchdUpd05();
			
			setIvUpd04Cache();
			
			setDown();
		}
		
		/**
		 * 訂正前のインボイス出荷実績マップを取得する。
		 */
		protected void getIvShipActMapLBefUpd() {
			
			_orgIvShipActMapL = MCList.create(MST_IV_SHIP_ACT_MAP_R.class);
			_orgIvShipActMapL.addStringColumn(MST_IV_R.$iv_no);
			
			MST_IV_SHIP_ACT_MAP_R ivShipActMap = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
			MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
			MST_IV_R iv = MST_IV_R.create("IV");
			MCQueryApiBuilder ivShipActMap_bldr = MCQueryApiBuilder.create(ivShipActMap);
			ivShipActMap_bldr.addSelect(iv.iv_no);
			ivShipActMap_bldr.addInnerJoin(ivD, ivShipActMap.iv_d_no.eq(ivD.iv_d_no));
			ivShipActMap_bldr.addInnerJoin(iv, ivD.iv_mng_no.eq(iv.iv_mng_no));
			ivShipActMap_bldr.setWhere(ivShipActMap.ship_act_d_no.eq(bind(MST_IV_SHIP_ACT_MAP_R.$ship_act_d_no)));
			
			dbSelect("MSBEL5730_MST_IV_SHIP_ACT_MAP_S01", _orgIvShipActMapL, ivShipActMap_bldr, up1());
		}
		
		/**
		 * インボイス出荷実績マップを削除する。
		 */
		protected void delIvShipActMap() {
			
			if (!up0().ship_act_reg_flg()) {
				return;
			}
			
			MST_IV_SHIP_ACT_MAP_R ivShipActMap = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
			
			MCDelete q = sql("MSBEL5730_MST_IV_SHIP_ACT_MAP_D01").delete(ivShipActMap)
					.where(value(0).eq(value(0))
					.and(ivShipActMap.ship_act_d_no.eq(bind("ship_act_d_no"))
					.and(ivShipActMap.fix_flg.eq(value(false)))));
			
			q.executeBatchUpdate(up1());
		}
		
		/**
		 * インボイス出荷実績マップを登録する。
		 */
		protected void insIvShipActFixMap() {
			
			_ivShipActMapL = MCList.create(MST_IV_SHIP_ACT_MAP_R.class);
			_ivShipActMapL.addStringColumn(MST_IV_R.$iv_no);
			
			MCList<Iv_Upd03_Ctrl2R> shipActFixL = up1().subList(r->!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && r.ship_act_fix_flg());
			
			if (!shipActFixL.isEmpty()) {
				MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL = MCList.create(MST_IV_SHIP_ACT_MAP_R.class);
				ivShipActMapL.addStringColumn(MST_IV_R.$iv_no);
				
				addAll(ivShipActMapL, shipActFixL, createMap_MST_IV_SHIP_ACT_MAP_R_Iv_Upd03_Ctrl2R());
				ivShipActMapL.setValueNE(MST_IV_SHIP_ACT_MAP_R.$ship_act_fix_flg, true);
				
				dbInsert("MSBEL5730_MST_IV_SHIP_ACT_MAP_I01", ivShipActMapL, MCQueryApiBuilder.create(MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP")));
				
				_ivShipActMapL.addAll(ivShipActMapL);
			}
		}
		
		/**
		 * 出荷実績明細を取得する。
		 */
		protected void getShipActDL() {
			
			_shipActDL = MCList.create(MST_SHIP_ACT_D_R.class);
			_shipActDL.addStringColumn(MST_SHIP_SCHD_R.$ship_schd_no);
			
			MCList<Iv_Upd03_Ctrl2R> shipActUnFixL = up1().subList(r->!r.ship_act_fix_flg());
			if (!shipActUnFixL.isEmpty()) {
				crtShipActDWk(shipActUnFixL.getStringNE(Iv_Upd03_Ctrl2R.$ship_act_d_no));
				executeQuery(_shipActDL, MSBEL5730_MST_SHIP_ACT_D_S01());
			}
		}
		
		/**
		 * インボイスマップを取得する。
		 */
		protected void getIvMap() {
			_ivMapL = MCList.create(MST_IV_MAP_R.class);
			
			if (_shipActDL.isEmpty()) {
				return;
			}
			
			crtShipSchdWk(_shipActDL.distinctNE(MST_SHIP_SCHD_R.$ship_schd_no).getStringNE(MST_SHIP_SCHD_R.$ship_schd_no));
			
			_ivMapL.addStringColumn(MST_IV_R.$iv_no);
			executeQuery(_ivMapL, MSBEL5730_MST_IV_MAP_S02(), up0());
		}
		
		/**
		 * インボイス出荷実績マップを登録する。
		 */
		protected void insIvShipActMap() {
			
			MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL = MCList.create(MST_IV_SHIP_ACT_MAP_R.class);
			ivShipActMapL.addStringColumn(MST_IV_R.$iv_no);
			
			MCList<Iv_Upd03_Ctrl2R> shipActFixL = up1().subList(r->!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && r.ship_act_fix_flg());
			MCIndexKey fixIdxkey = shipActFixL.createIndex(Iv_Upd03_Ctrl2R.$ship_alloc_sts_no, Iv_Upd03_Ctrl2R.$iv_d_no);
			
			if (!_shipActDL.isEmpty()) {
				MCIndexKey idxkey = _shipActDL.createIndex(MST_SHIP_SCHD_R.$ship_schd_no);
				
				for (MST_IV_MAP_R ivMapR : _ivMapL) {
					
					MCNumber IvQty = ivMapR.base_unit_qty();
					
					for (MST_SHIP_ACT_D_R shipActDR : _shipActDL.subList(idxkey, ivMapR.ship_schd_no())) {
						
						if (IvQty.isZero()) {
							break;
						}
						
						if (shipActDR.base_unit_qty().isZero()) {
							continue;
						}
						
						if (!shipActFixL.subList(fixIdxkey, shipActDR.ship_alloc_sts_no(), ivMapR.iv_d_no()).isEmpty()) {
							continue;
						}
						
						MST_IV_SHIP_ACT_MAP_R ivShipActMapR = MST_IV_SHIP_ACT_MAP_R.create();
						
						MCNumber baseUnitQty = MCNumber.ZERO;
						
						if (IvQty.gt(shipActDR.base_unit_qty())) {
							
							baseUnitQty = shipActDR.base_unit_qty();
							IvQty = IvQty.subtract(shipActDR.base_unit_qty());
							shipActDR.base_unit_qty(MCNumber.ZERO);
						}
						else {
							baseUnitQty = IvQty;
							shipActDR.base_unit_qty(shipActDR.base_unit_qty().subtract(IvQty));
							IvQty = MCNumber.ZERO;
						}
						
						ivShipActMapR.iv_d_no(ivMapR.iv_d_no());
						ivShipActMapR.ship_schd_no(shipActDR.getStringNE(MST_SHIP_SCHD_R.$ship_schd_no));
						ivShipActMapR.ship_alloc_sts_no(shipActDR.ship_alloc_sts_no());
						ivShipActMapR.ship_act_d_no(shipActDR.ship_act_d_no());
						ivShipActMapR.base_unit_qty(baseUnitQty);
						ivShipActMapR.fix_flg(false);
						ivShipActMapR.setStringNE(MST_IV_R.$iv_no, ivMapR.getStringNE(MST_IV_R.$iv_no));
						
						ivShipActMapL.add(ivShipActMapR);
					}
				}
				dbInsert("MSBEL5730_MST_IV_SHIP_ACT_MAP_I02", ivShipActMapL, MCQueryApiBuilder.create(MST_IV_SHIP_ACT_MAP_R.create("T")));
			}
			
			_ivShipActMapL.addAll(ivShipActMapL);
		}
		
		protected void callSlsSchdUpd05() {
			
			if (!up0().ship_act_reg_flg()) {
				return;
			}
			
			MSBBL_SlsSchdService.Sls_Schd_Upd05 ope = MSBBL_SlsSchdService.crtSls_Schd_Upd05();
			
			MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL = MCList.create(MST_IV_SHIP_ACT_MAP_R.class);
			ivShipActMapL.setAll(_ivShipActMapL);
			ivShipActMapL.addAll(_orgIvShipActMapL);
			
			MCList<MST_IV_D_R> ivDL = getIvDL(ivShipActMapL);
			MCIndexKey idxkey = ivDL.createIndex(MST_IV_D_R.$iv_d_no);
			
			for (MST_IV_SHIP_ACT_MAP_R ivShipActMapR : ivShipActMapL.distinctNE(MST_IV_R.$iv_no)) {
				
				MST_IV_D_R ivDR= ivDL.getFirst(idxkey, ivShipActMapR.iv_d_no());
				
				if (ivDR.getBooleanNE(MST_SLO_D_R.$vmi_flg)
						|| ivDR.getBooleanNE(MST_SHIP_PR_R.$purc_ddlv_flg)
						|| !MAC_TRD_PTN_TYP.isSLS(ivDR.getStringNE(MST_IV_R.$trd_ptn_typ)) 
						|| ivDR.getBooleanNE(MST_SLO_D_R.$sls_cststk_flg)) {
					continue;
				}
				
				Sls_Schd_Upd05_DtlR upR = Sls_Schd_Upd05_DtlR.create();
				upR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.IV_D.value());
				upR.iv_no(ivShipActMapR.getStringNE(MST_IV_R.$iv_no));
				upR.ship_act_flg(true);
				
				ope.up0().add(upR);
			}
			
			if (!ope.up0().isEmpty()) {
				ope.exec();
			}
		}
		
		protected void setIvUpd04Cache() {
			
			if (!up0().ship_act_reg_flg()) {
				return;
			}
			
			initOrgIvShipActMapCache(_orgIvShipActMapL, up1());
			initIvShipActMapCache(_ivShipActMapL, up1());
		}
		
		/**
		 * 下り電文を設定する。
		 */
		protected  void setDown() {
			
			if (!up0().iv_reg_flg()) {
				return;
			}
			
			setDown0();
		}
		
		/**
		 * 更新後のインボイス出荷実績マップを取得し、下り電文に設定する。
		 */
		protected void setDown0() {
			
			MST_IV_SHIP_ACT_MAP_R ivShipActMap = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
			MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
			MST_IV_R iv = MST_IV_R.create("IV");
			MCQueryApiBuilder ivShipActMap_bldr = MCQueryApiBuilder.create(ivShipActMap);
			ivShipActMap_bldr.setSelect(ivShipActMap.iv_d_no, ivShipActMap.ship_schd_no, ivShipActMap.ship_act_d_no, ivShipActMap.base_unit_qty);
			ivShipActMap_bldr.addSelect(iv.iv_no);
			ivShipActMap_bldr.addInnerJoin(ivD, ivShipActMap.iv_d_no.eq(ivD.iv_d_no));
			ivShipActMap_bldr.addInnerJoin(iv, ivD.iv_mng_no.eq(iv.iv_mng_no));
			ivShipActMap_bldr.setWhere(ivShipActMap.ship_act_d_no.eq(bind(MST_IV_SHIP_ACT_MAP_R.$ship_act_d_no)));
			if (up0().iv_reg_flg()) {
				ivShipActMap_bldr.addWhereWithAnd(iv.iv_no.eq(bind("1")), up0().iv_no());
			}
			
			dbSelect("MSBEL5730_MST_IV_SHIP_ACT_MAP_S01", down0(), ivShipActMap_bldr, up1());
		}
	}
	/**
	 * Iv_Upd04オペレーション.<p>
	 *
	 * 受払実績作成を作成する。<br>
	 */
	public class Iv_Upd04 extends MSBEL_IvRegService_MC_A.Iv_Upd04 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			callIoActSvWK();
		}
		
		protected void callIoActSvWK() {
			
			MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL = getIvShipActMapCache();
			MCIndexKey ivShipActMapIdxkey =  ivShipActMapL.createIndex(MST_IV_R.$iv_no, MST_IV_SHIP_ACT_MAP_R.$ship_act_d_no);
			
			MCList<MST_IV_SHIP_ACT_MAP_R> orgIvShipActMapL = getOrgIvShipActMapCache();
			MCIndexKey orgIvShipActMapIdxkey =  orgIvShipActMapL.createIndex(MST_IV_R.$iv_no, MST_IV_SHIP_ACT_MAP_R.$ship_act_d_no);
			
			MCList<MST_IV_SHIP_ACT_MAP_R> ivNoL = MCList.create(MST_IV_SHIP_ACT_MAP_R.class);
			ivNoL.setAll(ivShipActMapL);
			ivNoL.addAll(orgIvShipActMapL);
			
			 MCList<MST_IV_R> ivL = getIvL(ivNoL);
			 MCIndexKey ivIdxkey = ivL.createIndex(MST_IV_R.$iv_no);
			
			MCList<MST_IV_D_R> ivDL = getIvDL(ivNoL);
			MCIndexKey ivDIdxkey = ivDL.createIndex(MST_IV_D_R.$iv_d_no);
			 
			for (MST_IV_SHIP_ACT_MAP_R ivNoR : ivNoL.distinctNE(MST_IV_R.$iv_no)) {
				
				String ivNo = ivNoR.getStringNE(MST_IV_R.$iv_no);
				MST_IV_R ivR = ivL.getFirst(ivIdxkey, ivNo);
				
				if (isNoIoActTgt(ivR)) {
					continue;
				}
				
				MCList<MST_IV_SHIP_ACT_MAP_R> ioActIvShipActMapL = MCList.create(MST_IV_SHIP_ACT_MAP_R.class);
				
				for (MST_IV_SHIP_ACT_MAP_R ivShipActMapR : ivShipActMapL) {
					
					MST_IV_D_R ivDR= ivDL.getFirst(ivDIdxkey, ivShipActMapR.iv_d_no());
					if (ivDR.getBooleanNE(MST_SLO_D_R.$sls_cststk_flg)
							|| ivDR.getBooleanNE(MST_SLO_D_R.$vmi_flg)
							|| ivDR.getBooleanNE(MST_SHIP_PR_R.$purc_ddlv_flg)) {
						continue;
					}
					
					if (!isSame(ivShipActMapR.getStringNE(MST_IV_R.$iv_no), ivNo)) {
						continue;
					}
					
					MST_IV_SHIP_ACT_MAP_R mapR = MST_IV_SHIP_ACT_MAP_R.create();
					mapR.ship_act_d_no(ivShipActMapR.ship_act_d_no());
					mapR.base_unit_qty(ivShipActMapR.base_unit_qty());
					MST_IV_SHIP_ACT_MAP_R orgR = orgIvShipActMapL.getFirst(orgIvShipActMapIdxkey, ivShipActMapR.getStringNE(MST_IV_R.$iv_no), ivShipActMapR.ship_act_d_no());
					if (!isNull(orgR)) {
						mapR.setStatus(MCRow.Status.MODIFY);
						mapR.addDateColumn(Iv_Upd03_Ctrl2R.$can_ac_dt, ivShipActMapR.getDateNE(Iv_Upd03_Ctrl2R.$can_ac_dt));
					}
					else {
						mapR.setStatus(MCRow.Status.CREATE);
					}
					ioActIvShipActMapL.add(mapR);
				}
				
				for (MST_IV_SHIP_ACT_MAP_R orgR :orgIvShipActMapL) {
					
					MST_IV_D_R ivDR= ivDL.getFirst(ivDIdxkey, orgR.iv_d_no());
					if (ivDR.getBooleanNE(MST_SLO_D_R.$sls_cststk_flg)
							|| ivDR.getBooleanNE(MST_SLO_D_R.$vmi_flg)
							||  ivDR.getBooleanNE(MST_SHIP_PR_R.$purc_ddlv_flg)) {
						continue;
					}
					
					if (!isSame(orgR.getStringNE(MST_IV_R.$iv_no), ivNo)) {
						continue;
					}
					
					MST_IV_SHIP_ACT_MAP_R ivShipActMapR = ivShipActMapL.getFirst(ivShipActMapIdxkey, orgR.getStringNE(MST_IV_R.$iv_no), orgR.ship_act_d_no());
					if (!isNull(ivShipActMapR)) {
						continue;
					}
					
					MST_IV_SHIP_ACT_MAP_R mapR = MST_IV_SHIP_ACT_MAP_R.create();
					mapR.ship_act_d_no(orgR.ship_act_d_no());
					mapR.setStatus(MCRow.Status.DELETE);
					mapR.addDateColumn(Iv_Upd03_Ctrl2R.$can_ac_dt, orgR.getDateNE(Iv_Upd03_Ctrl2R.$can_ac_dt));
					ioActIvShipActMapL.add(mapR);
				}
				
				// 出荷実績サービスから呼ばれた場合に、締チェック処理を実行しない
				callIoActInsSv(ioActIvShipActMapL, ivR, false, false, false);
			}
		}
		
		protected MCList<MST_IV_R> getIvL(MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL) {
			
			MCList<MST_IV_R> ivL = MCList.create(MST_IV_R.class);
			
			MST_IV_R iv = MST_IV_R.create("IV");
			MCQueryApiBuilder ivL_bldr = MCQueryApiBuilder.create(iv);
			ivL_bldr.setWhere(iv.iv_no.eq(bind(MST_IV_R.$iv_no)));
			
			dbSelect("MSBEL5730_MST_IV_S05", ivL, ivL_bldr, ivShipActMapL.distinctNE(MST_IV_R.$iv_no));
			
			return ivL;
		}
	}
	/**
	 * Iv_Upd05オペレーション.<p>
	 *
	 * 一部出荷指図を登録した際に、インボイスマップを更新する。<br>
	 */
	public class Iv_Upd05 extends MSBEL_IvRegService_MC_A.Iv_Upd05 {
		
		protected 	MCList<MST_IV_MAP_R> _orgIvMapL = null;
		
		protected 	MCList<MST_IV_MAP_R> _IvMapUpdL = null;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			
			editUp();
			
			getIvMap();
			
			setQtyForShipInstFix();
			
			updIvMap();
		}
		
		/**
		 * 上り電文を編集する。
		 */
		protected void editUp() {
			up0().forEach(r-> {
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					r.org_ship_schd_no(r.ship_schd_no());
				}
			});
		}
		
		/**
		 * インボイスマップを取得する。
		 */
		protected void getIvMap() {
			
			_orgIvMapL = MCList.create(MST_IV_MAP_R.class);
			
			MST_IV_MAP_R ivMap = MST_IV_MAP_R.create("IVMAP");
			MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
			MST_IV_R iv = MST_IV_R.create("IV");
			MAVM_ITM_UNIT_R itmUnit = MAVM_ITM_UNIT_R.create("ITMUNIT");
			MCQueryApiBuilder ivMap_bldr = MCQueryApiBuilder.create(ivMap);
			ivMap_bldr.setSelect(ivMap.iv_d_no, ivMap.ship_schd_no, ivMap.trd_unit_qty, ivMap.base_unit_qty, ivMap.sub_char1, ivMap.sub_char2, ivMap.sub_char3);
			ivMap_bldr.addSelect(ivD.base_unit_cd, ivD.trd_unit_cd);
			ivMap_bldr.addSelect(itmUnit.conv_qty, itmUnit.conv_base_qty, itmUnit.dec_place, itmUnit.rnd_typ);
			ivMap_bldr.addInnerJoin(ivD, ivMap.iv_d_no.eq(ivD.iv_d_no));
			ivMap_bldr.addInnerJoin(iv, ivD.iv_mng_no.eq(iv.iv_mng_no));
			ivMap_bldr.addLeftOuterJoin(itmUnit, bracket(ivD.itm_cd.eq(itmUnit.itm_cd)
					.and(ivD.itm_sub1.eq(itmUnit.itm_sub1))
					.and(ivD.itm_sub2.eq(itmUnit.itm_sub2))
					.and(ivD.itm_sub3.eq(itmUnit.itm_sub3))
					.and(ivD.trd_unit_cd.eq(itmUnit.unit_cd))));
			ivMap_bldr.setWhere(ivMap.ship_schd_no.eq(bind(MST_IV_MAP_R.$ship_schd_no)));
			ivMap_bldr.setOrderByAsc(iv.iv_no, ivMap.iv_d_no);
			
			dbSelect("MSBEL5730_MST_IV_MAP_S01", _orgIvMapL, ivMap_bldr, up0());
		}
		
		/**
		 * 出荷指図登録画面で指定したIVを反映する。
		 */
		protected void setQtyForShipInstFix() {
			
			_IvMapUpdL = MCList.create(MST_IV_MAP_R.class);
			if (!up1().isEmpty()) {
				
				for (Iv_Upd05_Ctrl1R ctrl1R : up0()) {
					
					if (MAC_DATA_CRUD_TYP.isUPD(ctrl1R.data_crud_typ())) {
						ctrl1R.base_unit_qty(ctrl1R.base_unit_qty().subtract(up1().sum(Iv_Upd05_Ctrl2R.$base_unit_qty)));
					}
				}
				
				MCIndexKey idxkey = _orgIvMapL.createIndex(MST_IV_MAP_R.$iv_d_no, MST_IV_MAP_R.$ship_schd_no);
				for (Iv_Upd05_Ctrl2R ctrl2R : up1()) {
					MST_IV_MAP_R orgIvMapR = _orgIvMapL.getFirst(idxkey, ctrl2R.iv_d_no(), ctrl2R.ship_schd_no());

					if (!orgIvMapR.isEmpty()) {
						MST_IV_MAP_R ivMapR = MST_IV_MAP_R.create();
						ivMapR.iv_d_no(orgIvMapR.iv_d_no());
						ivMapR.ship_schd_no(orgIvMapR.ship_schd_no());
						ivMapR.base_unit_qty(ctrl2R.base_unit_qty());
						setTrdUnitQty(ivMapR, orgIvMapR);
						ivMapR.setStatus(MCRow.Status.MODIFY);
						_IvMapUpdL.add(ivMapR);
						orgIvMapR.base_unit_qty(orgIvMapR.base_unit_qty().subtract(ctrl2R.base_unit_qty()));
					}
				}
			}
		}
		
		/**
		 * インボイスマップを更新する。<br>
		 * 出荷指図の登録により出荷予定を分割した場合、出荷予定の情報をインボイスマップに反映する。
		 */
		protected void updIvMap() {
			
			MCIndexKey idxkey = _orgIvMapL.createIndex(MST_IV_MAP_R.$ship_schd_no);
			
			MCList<MST_IV_MAP_R> ivMapL = MCList.create(MST_IV_MAP_R.class);
			
			for (MCList<Iv_Upd05_Ctrl1R> shipSchdGrpL : up0().groupList(Iv_Upd05_Ctrl1R.$org_ship_schd_no)) {
				
				Iv_Upd05_Ctrl1R updR = shipSchdGrpL.getFirst(Iv_Upd05_Ctrl1R.$data_crud_typ, MAC_DATA_CRUD_TYP.UPD.value());
				Iv_Upd05_Ctrl1R splitR = shipSchdGrpL.getFirst(Iv_Upd05_Ctrl1R.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
				
				MCList<MST_IV_MAP_R> subIvMapL = _orgIvMapL.subList(idxkey, updR.ship_schd_no());
				
				MCNumber updBaseUnitQty = updR.base_unit_qty();
				MCNumber splitBaseUnitQty = splitR.base_unit_qty();
				
				for (MST_IV_MAP_R orgIvMapR : subIvMapL) {
					
					MCNumber orgBaseUnitQty = orgIvMapR.base_unit_qty();
					
					if (updBaseUnitQty.isPositive()) {
						MST_IV_MAP_R ivMapR = MST_IV_MAP_R.create();
						ivMapR.iv_d_no(orgIvMapR.iv_d_no());
						ivMapR.ship_schd_no(updR.ship_schd_no());
						if (updBaseUnitQty.gte(orgBaseUnitQty)) {
							ivMapR.base_unit_qty(orgBaseUnitQty);
							updBaseUnitQty = updBaseUnitQty.subtract(orgBaseUnitQty);
							orgBaseUnitQty = MCNumber.ZERO;
						}
						else {
							ivMapR.base_unit_qty(updBaseUnitQty);
							orgBaseUnitQty = orgBaseUnitQty.subtract(updBaseUnitQty);
							updBaseUnitQty = MCNumber.ZERO;
						}
						setTrdUnitQty(ivMapR, orgIvMapR);
						ivMapR.setStatus(MCRow.Status.MODIFY);
						ivMapL.add(ivMapR);
					}
					
					if (orgBaseUnitQty.isPositive()) {
						if (splitBaseUnitQty.isPositive()) {
							
							MST_IV_MAP_R ivMapR = MST_IV_MAP_R.create();
							ivMapR.iv_d_no(orgIvMapR.iv_d_no());
							ivMapR.ship_schd_no(splitR.ship_schd_no());
							
							if (splitBaseUnitQty.gte(orgBaseUnitQty)) {
								ivMapR.base_unit_qty(orgBaseUnitQty);
								splitBaseUnitQty = splitBaseUnitQty.subtract(orgBaseUnitQty);
								orgBaseUnitQty = MCNumber.ZERO;
							}
							else {
								ivMapR.base_unit_qty(splitBaseUnitQty);
								orgBaseUnitQty = orgBaseUnitQty.subtract(splitBaseUnitQty);
								splitBaseUnitQty = MCNumber.ZERO;
							}
							
							setTrdUnitQty(ivMapR, orgIvMapR);
							ivMapR.setStatus(MCRow.Status.CREATE);
							ivMapL.add(ivMapR);
						}
					}
				}
			}
			
			if (!_IvMapUpdL.isEmpty()) {
				ivMapL.addAll(_IvMapUpdL);
			}
			
			// 出荷予定NOが変わった場合、訂正以外のデータを削除する。
			for (MST_IV_MAP_R orgIvMapR : _orgIvMapL) {
				MCList<MST_IV_MAP_R> newIvMapL = ivMapL.subList(r->isSame(r.iv_d_no(), orgIvMapR.iv_d_no())
						&& isSame(r.ship_schd_no(), orgIvMapR.ship_schd_no()) && r.isStatusModify());
				if (newIvMapL.isEmpty()) {
					MST_IV_MAP_R delR = MST_IV_MAP_R.create();
					delR.iv_d_no(orgIvMapR.iv_d_no());
					delR.ship_schd_no(orgIvMapR.ship_schd_no());
					delR.setStatus(MCRow.Status.DELETE);
					ivMapL.add(delR);
				}
			}
			
			if (!isNull(ivMapL)) {
				MST_IV_MAP_R ivMap = MST_IV_MAP_R.create("IVMAP");
				MCQueryApiBuilder ivMapL_bldr = MCQueryApiBuilder.create(ivMap);
				ivMapL_bldr.setSet( ivMap.trd_unit_qty, ivMap.base_unit_qty);
				
				dbLockInsUpdDelByStatusNoCheck("MSBEL5730_MST_IV_MAP_U02", ivMapL, ivMapL_bldr);
				
				updIvD(ivMapL);
			}
		}
		
		/**
		 * 取引単位数量に変換する。
		 * @param ivMapR インボイスマップ
		 * @param orgIvMapR 分割前のインボイスマップ
		 */
		protected void setTrdUnitQty(MST_IV_MAP_R ivMapR, MST_IV_MAP_R orgIvMapR) {
			if (isSame(orgIvMapR.getStringNE(MST_IV_D_R.$trd_unit_cd), orgIvMapR.getStringNE(MST_IV_D_R.$base_unit_cd))) {
				ivMapR.trd_unit_qty(ivMapR.base_unit_qty());
			}
			else {
				ivMapR.trd_unit_qty(rvrsBaseUnitConv(ivMapR.base_unit_qty(), orgIvMapR.getNumberNE(MAVM_ITM_UNIT_R.$conv_base_qty), orgIvMapR.getNumberNE(MAVM_ITM_UNIT_R.$conv_qty),
						orgIvMapR.getNumberNE(MAVM_ITM_UNIT_R.$dec_place), orgIvMapR.getStringNE(MAVM_ITM_UNIT_R.$rnd_typ), false));
			}
		}
		
		/**
		 * インボイス明細を更新する。<br>
		 * 出荷指図の登録により出荷予定を分割した場合、インボイス明細のまとめをオンに更新する。
		 * @param ivMapL インボイスマップリスト
		 */
		protected void updIvD(MCList<MST_IV_MAP_R> ivMapL) {
			
			MCList<MST_IV_D_R> ivDL = MCList.create(MST_IV_D_R.class);
			
			MCList<MST_IV_MAP_R> insUpdL = ivMapL.subList(MCRow.Status.CREATE, MCRow.Status.MODIFY);
			for (MCList<MST_IV_MAP_R> ivMapGrpL : insUpdL.groupList(MST_IV_MAP_R.$iv_d_no)) {
				
				if(ivMapGrpL.size() > 1) {
					MST_IV_D_R ivDR = MST_IV_D_R.create();
					ivDR.iv_d_no(ivMapGrpL.get(0).iv_d_no());
					ivDR.bndl_flg(true);
					
					ivDL.add(ivDR);
				}
			}
			
			if (!isNull(ivDL)) {
				MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
				MCQueryApiBuilder ivDL_bldr = MCQueryApiBuilder.create(ivD);
				ivDL_bldr.setSet( ivD.bndl_flg);
				dbUpdateKey("MSBEL5730_MST_IV_D_U04", ivDL, ivDL_bldr);
			}
		}
	}
	/**
	 * Iv_Del01オペレーション.<p>
	 *
	 * インボイスを取り消す。<br>
	 */
	public class Iv_Del01 extends MSBEL_IvRegService_MC_A.Iv_Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			if (MAC_TRD_PTN_TYP.isSLS(up0().trd_ptn_typ())) { //売上の場合
				//マニュアル追加行の売上予定サービス実行（削除）
				delSlsSchdMan();
			}
			//受払実績管理サービス実行
			callIoActSvWK();

			//インボイス取り消し処理
			delIv();

			//出荷予定サービス実行
			callShipSchdUpd04(up1(), up2());

			if (MAC_TRD_PTN_TYP.isSLS(up0().trd_ptn_typ())) {
				//売上予定サービス実行
				doSlsSchdUpd();
			}
			if (MAC_TRD_PTN_TYP.isSLS(up0().trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(up0().trd_ptn_typ())) {
				
				//受注状況登録処理
				callSlsSTsIns01(up0(), up1(), MAC_DATA_CRUD_TYP.DEL.value());
			}
			// 与信更新
			callCredSv();
			
			//受払実績管理サービス実行
			callIoActUpdSv(up0());
			callAttachServiceDel01();
		}
		
		/**
		 * マニュアル追加行の売上予定サービス実行（削除）
		 */
		protected void delSlsSchdMan() {
			//マニュアル追加行
			MCList<Iv_Chk01_DtlR> manAddL = up1().subList(Iv_Chk01_DtlR.$manual_add_flg, true);
			
			if(!manAddL.isEmpty()) {
				callSlsSchdUpd05(up0(), manAddL, MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
		protected void callIoActSvWK() {
			
			if (isNoIoActTgt(up0())) {
				return;
			}
			
			MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL = getIvShipActMapL(up1());
			ivShipActMapL.setStatus(MCRow.Status.DELETE);
			ivShipActMapL.addDateColumn(Iv_Upd03_Ctrl2R.$can_ac_dt, up0().can_ac_dt());
			
			MST_IV_R ivR = MST_IV_R.create();
			ivR.iv_no(up0().iv_no());
			
			callIoActInsSv(ivShipActMapL, ivR, true, true, false);
		}

		/**
		 * 売上予定サービス実行（取消時）
		 */
		protected void doSlsSchdUpd() {
			//仕入直送 - マニュアル追加行を除く
			MCList<Iv_Chk01_DtlR> purcDdlvL = up1().subList(
					new String[]{Iv_Chk01_DtlR.$purc_ddlv_flg, Iv_Chk01_DtlR.$manual_add_flg}, 
					new Comparable[]{true, false});
			//仕入直送以外 - マニュアル追加行を除く
			MCList<Iv_Chk01_DtlR> nonPurcDdlvL = up1().subList(
					new String[]{Iv_Chk01_DtlR.$purc_ddlv_flg, Iv_Chk01_DtlR.$manual_add_flg}, 
					new Comparable[]{false, false});

			if(!purcDdlvL.isEmpty()) {
				//売上予定サービス実行（仕入直送 - マニュアル追加行を除く）
				callSlsSchdUpd04(up0(), purcDdlvL, MAC_DATA_CRUD_TYP.DEL.value());
			}
			if(!nonPurcDdlvL.isEmpty()) {
				//売上予定サービス実行（仕入直送以外 - マニュアル追加行を含む）
				callSlsSchdUpd05(up0(), nonPurcDdlvL, MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
		
		/**
		 * インボイス取り消しを行う
		 */
		protected void delIv() {
			MST_IV_MAP_R t2 = MST_IV_MAP_R.create("T");


			if(!up0().is_slo_iv_no()) { //受注で登録したインボイスＮＯ以外の場合
				// インボイスＮＯの取り消し
				delIvNo(up0().iv_no());
			}
			
			//三国間の場合
			if(!isNull(up0().rcpt_iv_mng_no())) {
				updIvIntrm();
			}
			//直貿の場合
			else {
				MST_IV_D_R t = MST_IV_D_R.create("T");
				MST_IV_R t1 = MST_IV_R.create("T");
				//インボイスヘッダの取り消し
				execDbDeleteKey("MSBEL5730_MST_IV_D01", t1, up0());
				//インボイス明細の取り消し
				execDbDeleteKey("MSBEL5730_MST_IV_D_D02", t, up1());
				MST_IV_R ivR = MST_IV_R.create();
				ivR.iv_mng_no(up0().iv_mng_no());
				ivR.iv_rev(up0().iv_rev());
				callRevDataIns01(ivR);
			}
			
			//インボイスマップの取り消し
			execDbDelete("MSBEL5730_MST_IV_MAP_D02", t2, t2.iv_d_no.eq(bind("iv_d_no")), up1());
			if (!MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())
					|| !MAC_TRD_PTN_TYP.isSLS_CNSGN(up0().trd_ptn_typ())) {
				// 売上実績登録画面で貸出売上を登録する際に、削除しない
				
				//インボイス出荷指図マップの取り消し
				delIvShipInstMap(up1());
				
				//インボイス出荷実績マップの取り消し
				delIvShipActMap(up1());
			}
		}
		
		/**
		 * インボイスを初期状態に更新（三国間）
		 */
		protected void updIvIntrm() {

			MST_IV_R ivR = MST_IV_R.create();
			ivR.iv_mng_no(up0().iv_mng_no());
			ivR.iv_no(MAC_STR.NULL_VAL.value());
			ivR.iv_rev(0);
			String newIvMngNo = getStrSeq(MSC_NUM_SYS_TYP.IVMNG);
			ivR.pre_rcpt_iv_flg(true);

			MST_IV_R iv = MST_IV_R.create("T");
			MCQueryApiBuilder ivR_bldr = MCQueryApiBuilder.create(iv);
			ivR_bldr.setSet(getIvInitList());
			ivR_bldr.addSetVL(iv.iv_mng_no, value(newIvMngNo));

			MCList<MST_IV_D_R> ivDUpdL = MCList.create(MST_IV_D_R.class);
			ivDUpdL.addStringColumn("new_iv_d_no");
			MCList<MST_IV_D_R> ivDDelL = MCList.create(MST_IV_D_R.class);
			for(Iv_Chk01_DtlR dtlR : up1()) {
				MST_IV_D_R dR = MST_IV_D_R.create();
				dR.iv_d_no(dtlR.iv_d_no());

				if(dtlR.manual_add_flg()) {
					ivDDelL.add(dR);
				}
				else {
					dR.setValueNE("new_iv_d_no", getStrSeq(MSC_NUM_SYS_TYP.IVD));
					ivDUpdL.add(dR);
				}
			}
			ivDUpdL.setValueNE(MST_IV_D_R.$iv_mng_no, newIvMngNo);
			ivDUpdL.setValueNE(MST_IV_D_R.$iv_rev, ivR.iv_rev());
			MST_IV_D_R ivD = MST_IV_D_R.create("T");
			MCQueryApiBuilder ivDUpdL_bldr = MCQueryApiBuilder.create(ivD);
			ivDUpdL_bldr.setSet(getIvDInitList());
			ivDUpdL_bldr.addSetVL(ivD.iv_d_no, bindEx("new_iv_d_no"));

			dbUpdateKey("MSBEL5730_MST_IV_U02", ivR, ivR_bldr);
			dbUpdateKey("MSBEL5730_MST_IV_D_U03", ivDUpdL, ivDUpdL_bldr);
			if(!ivDDelL.isEmpty()) {
				MCQueryApiBuilder ivDDelL_bldr = MCQueryApiBuilder.create(MST_IV_D_R.create("T"));
				dbDeleteKey("MSBEL5730_MST_IV_D_D03", ivDDelL, ivDDelL_bldr);
			}
			updRcptIv(up0().rcpt_iv_mng_no());
		}
		/**
		 * 与信対象額を計算し、与信サービスを実行する。
		 */
		protected void callCredSv() {
			
			if (!MAC_TRD_PTN_TYP.isSLS(up0().trd_ptn_typ()) 
					|| MSC_IV_SRC_TYP.isSLS(up0().iv_src_typ())) {
				return;
			}
			
			MCList<Cred_Upd01_CndR> credL = calcCredAmt();
			callCredSvUpd01(credL);
		}
		
		/**
		 * 与信サービスを作成する。
		 * @return  与信サービスの上り電文
		 */
		protected MCList<Cred_Upd01_CndR> calcCredAmt() {
			
			MCNumber srcIvCredAmtSum = MCNumber.ZERO;
			MCNumber sloCredAmtSum = MCNumber.ZERO;
			MCNumber dlvCredAmtSum = MCNumber.ZERO;
			
			MST_IV_R ivR = getIvCache();
			
			MCList<MST_SLO_D_R> sloDL = getSloDL(up1());
			MCIndexKey sloIdxkey = sloDL.createIndex(MST_SLO_D_R.$slo_d_no);
			
			MCList<MST_DLV_SLIP_D_R> dlvSlipDL = getDlvSlipDL(up1());
			MCIndexKey dlvSlipIdxkey = dlvSlipDL.createIndex(MST_DLV_SLIP_D_R.$dlv_slip_d_no);
			
			MCList<MST_IV_D_R> srcIvL = getIvDCache();
			MCIndexKey ivIdxkey = srcIvL.createIndex(MST_IV_D_R.$iv_d_no);
			
			for (Iv_Chk01_DtlR dtlR : up1()) {
				
				MST_IV_D_R srcIvR = srcIvL.getFirst(ivIdxkey, dtlR.iv_d_no());
				MCNumber credSchdQty = srcIvR.base_unit_qty();
				
				MCNumber srcIvCredAmt =  sum(srcIvR.trd_cur_amt(), srcIvR.trd_cur_tax_amt());
				srcIvCredAmtSum = srcIvCredAmtSum.add(srcIvR.getBooleanNE(MAM_ITM_R.$dscnt_itm_flg) ? srcIvCredAmt.negate() : srcIvCredAmt);
				
				if(!isNull(dtlR.slo_d_no())) {
					MST_SLO_D_R sloDR = sloDL.getFirst(sloIdxkey, dtlR.slo_d_no());
					MCNumber sloCredAmt = (sloDR.trd_cur_amt().add(sloDR.trd_cur_tax_amt()))
							.multiply(credSchdQty)
							.divide(sloDR.base_unit_qty(), ivR.getNumberNE(MAM_CUR_R.$amt_dec_place).intValue(), MAC_RND_TYP.toMC(ivR.getStringNE(MAM_BP_R.$sls_amt_rnd_typ)));
					
					sloCredAmtSum = sloCredAmtSum.add(srcIvR.getBooleanNE(MAM_ITM_R.$dscnt_itm_flg) ? sloCredAmt.negate() : sloCredAmt);
				}
				else if (dtlR.uplnd_flg()){
					MST_DLV_SLIP_D_R dlvSlipDR = dlvSlipDL.getFirst(dlvSlipIdxkey, dtlR.dlv_slip_d_no());
					MCNumber dlvCredAmt = (dlvSlipDR.trd_cur_amt().add(dlvSlipDR.trd_cur_tax_amt()))
							.multiply(credSchdQty)
							.divide(dlvSlipDR.base_unit_qty(), ivR.getNumberNE(MAM_CUR_R.$amt_dec_place).intValue(), MAC_RND_TYP.toMC(ivR.getStringNE(MAM_BP_R.$sls_amt_rnd_typ)));
					
					dlvCredAmtSum = dlvCredAmtSum.add(dtlR.dscnt_itm_flg() ? dlvCredAmt.negate() : dlvCredAmt);
				}
			}
			
			MCList<Cred_Upd01_CndR> credL = MCList.create(Cred_Upd01_CndR.class);
			if (!srcIvCredAmtSum.isZero()) {
				
				Cred_Upd01_CndR credR = Cred_Upd01_CndR.create();
				credR.cst_cd(up0().ship_rqst_id_cd());
				credR.cur_cd(up0().trd_cur_cd());
				credR.trd_ptn_typ(up0().trd_ptn_typ());
				credR.amt(srcIvCredAmtSum.negate());
				
				credL.add(credR);
			}
			
			if (!sloCredAmtSum.isZero()) {
				
				Cred_Upd01_CndR credR = Cred_Upd01_CndR.create();
				credR.cst_cd(up0().ship_rqst_id_cd());
				credR.cur_cd(up0().trd_cur_cd());
				credR.trd_ptn_typ(up0().trd_ptn_typ());
				credR.amt(sloCredAmtSum);
				
				credL.add(credR);
			}
			
			if (!dlvCredAmtSum.isZero()) {
				
				Cred_Upd01_CndR credR = Cred_Upd01_CndR.create();
				credR.cst_cd(up0().ship_rqst_id_cd());
				credR.cur_cd(dlvSlipDL.get(0).getStringNE(MST_DLV_SLIP_R.$trd_cur_cd));
				credR.trd_ptn_typ(up0().trd_ptn_typ());
				credR.amt(dlvCredAmtSum);
				
				credL.add(credR);
			}
			
			return credL;
		}
		/**
		 * 添付帳票登録サービスの削除オペレーションを呼び出す。
		 */
		protected void callAttachServiceDel01() {
			MBBCL_AttachService.Attach_Del01 ope = MBBCL_AttachService.crtAttach_Del01();
			Attach_Chk02_DtlR dtlR = Attach_Chk02_DtlR.create();
			editUpAttachSrv(dtlR);
			ope.up0().add(dtlR);
			ope.exec();
		}
		protected void editUpAttachSrv(Attach_Chk02_DtlR r) {
			r.biz_typ(MAC_BIZ_TYP.IV.value());
			r.report_id("MSBER0200");
			r.biz_key1(up0().iv_no());
			r.biz_key2(up0().iv_rev().toString());
		}
	}
	
	/**
	 * Iv_DRevUpd01オペレーション.<p>
	 *
	 * インボイス改訂履歴テーブルを更新する。インボイス履歴データ更新用の共通処理（MAUCL5020）から呼び出される。<br>
	 */
	public class Iv_RevUpd01 extends MSBEL_IvRegService_MC_A.Iv_RevUpd01 {
		
		MCList<MST_IV_R> _hCurrentL = MCList.create(MST_IV_R.class);
		MCList<MST_IV_D_R> _dCurrentL = MCList.create(MST_IV_D_R.class);
		MCList<MST_IV_P_R> _hRevL = MCList.create(MST_IV_P_R.class);
		MCList<MST_IV_D_P_R> _dRevL = MCList.create(MST_IV_D_P_R.class);

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			wkInsert();
			selectCurrent();
			revisionInsOrUpd();
		}

		/**
		 * 上り電文の項目を本体・改訂履歴ヘッダーのワークテーブルに設定
		 */
		protected void wkInsert() {
			MCList<MST_IV_R> wkL = MCList.create(MST_IV_R.class);
			for (RevData_Upd01_DtlR r : up0()) {
				MST_IV_R wkR = MST_IV_R.create();
				wkR.iv_mng_no(r.rev_data_src_no());
				wkL.add(wkR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_IV_R.create("T"));
			dbWkDelete("MSBEL5730_MSW_IV_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBEL5730_MSW_IV_I01", wkL.groupBy(wkL_bldr.getBaseDbc().getKeyColumn()), wkL_bldr.getBaseDbc());

			MCList<MST_IV_P_R> wkpL = MCList.create(MST_IV_P_R.class);
			for (RevData_Upd01_DtlR r : up0()) {
				MST_IV_P_R wkpR = MST_IV_P_R.create();
				wkpR.iv_mng_no(r.rev_data_src_no());
				wkpR.iv_rev(r.rev_no());
				wkpL.add(wkpR);
			}
			MCQueryApiBuilder wkpL_bldr = MCQueryApiBuilder.create(MST_IV_P_R.create("T"));
			dbWkDelete("MSBEL5730_MSW_IV_P_D01", wkpL_bldr.getBaseDbc());
			dbWkInsert("MSBEL5730_MSW_IV_P_I01", wkpL.groupBy(wkpL_bldr.getBaseDbc().getKeyColumn()), wkpL_bldr.getBaseDbc());
		}

		/**
		 * 本体テーブルと改訂履歴テーブルからリストを取得
		 */
		protected void selectCurrent() {
			MST_IV_R hCurrentL_t = MST_IV_R.create("T");
			MCQueryApiBuilder hCurrentL_bldr = MCQueryApiBuilder.create(hCurrentL_t);
			MSW_IV_KEY_R w1 = MSW_IV_KEY_R.create("W");
			hCurrentL_bldr.addInnerJoin(w1, bracket(hCurrentL_t. iv_mng_no .eq(w1. iv_mng_no )));
			dbSelect("MSBEL5730_MST_IV_S04", _hCurrentL, hCurrentL_bldr);

			MST_IV_D_R dCurrentL_t = MST_IV_D_R.create("T");
			MCQueryApiBuilder dCurrentL_bldr = MCQueryApiBuilder.create(dCurrentL_t);
			dCurrentL_bldr.addInnerJoin(w1, bracket(dCurrentL_t. iv_mng_no .eq(w1. iv_mng_no )));
			dbSelect("MSBEL5730_MST_IV_D_S03", _dCurrentL, dCurrentL_bldr);

			MST_IV_P_R hRevL_t = MST_IV_P_R.create("T");
			MCQueryApiBuilder hRevL_bldr = MCQueryApiBuilder.create(hRevL_t);
			MSW_IV_P_KEY_R w2 = MSW_IV_P_KEY_R.create("W");
			hRevL_bldr.addInnerJoin(w2, bracket(hRevL_t. iv_mng_no .eq(w2. iv_mng_no )
											.and(hRevL_t.iv_rev.eq(w2.iv_rev))));
			dbSelect("MSBEL5730_MST_IV_P_S01", _hRevL, hRevL_bldr);

			MST_IV_D_P_R dRevL_t = MST_IV_D_P_R.create("T");
			MCQueryApiBuilder dRevL_bldr = MCQueryApiBuilder.create(dRevL_t);
			dRevL_bldr.addInnerJoin(w2, bracket(dRevL_t. iv_mng_no .eq(w2. iv_mng_no )
											.and(dRevL_t.iv_rev.eq(w2.iv_rev))));
			dbSelect("MSBEL5730_MST_IV_D_P_S01", _dRevL, dRevL_bldr);
		}

		/**
		 * 本番テーブルのデータを元に、改訂履歴テーブルを追加または更新する。
		 */
		protected void revisionInsOrUpd() {
			// ヘッダーの改訂履歴テーブルを追加または更新する。
			MCIndexKey hRevIdx = _hRevL.createIndex(MST_IV_P_R.$iv_mng_no, MST_IV_P_R.$iv_rev);
			MCList<MST_IV_P_R> hUpd = MCList.create(MST_IV_P_R.class);
			MCList<MST_IV_P_R> hIns = MCList.create(MST_IV_P_R.class);

			for (MST_IV_R hcurrentR : _hCurrentL) {
				MST_IV_P_R tempRevR = MST_IV_P_R.create();
				tempRevR.setByName(hcurrentR);
				if (_hRevL == null || isNull(_hRevL.getFirst(hRevIdx, hcurrentR.iv_mng_no(), hcurrentR.iv_rev()))) {
					hIns.add(tempRevR);
				}
				else {
					hUpd.add(tempRevR);
				}
			}
			if (!isNull(hIns)) {
				dbInsert("MSBEL5730_MST_IV_P_I01", hIns, MCQueryApiBuilder.create(MST_IV_P_R.create("T")));
			}
			if (!isNull(hUpd)) {
				MCQueryApiBuilder hUpd_bldr = MCQueryApiBuilder.create(MST_IV_P_R.create("T"));
				hUpd_bldr.removeSet(hUpd_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBEL5730_MST_IV_P_U01", hUpd, hUpd_bldr);
			}

			// 明細の改訂履歴テーブルを追加または更新する。
			MCIndexKey dRevIdx = _dRevL.createIndex(MST_IV_D_P_R.$iv_d_no, MST_IV_D_P_R.$iv_rev);
			MCIndexKey hCurrentIdx = _hCurrentL.createIndex(MST_IV_D_P_R.$iv_mng_no );
			MCList<MST_IV_D_P_R> dUpd = MCList.create(MST_IV_D_P_R.class);
			MCList<MST_IV_D_P_R> dIns = MCList.create(MST_IV_D_P_R.class);
			MCList<MST_IV_D_P_R> dDel = MCList.create(MST_IV_D_P_R.class);

			for (MST_IV_D_R dcurrentR : _dCurrentL) {
				MST_IV_D_P_R tempRevR = MST_IV_D_P_R.create();
				tempRevR.setByName(dcurrentR);

				// ヘッダーより改訂番号を取得
				MST_IV_R hCurrentR = _hCurrentL.getFirst(hCurrentIdx, dcurrentR. iv_mng_no ());
				tempRevR.iv_rev(hCurrentR.iv_rev());
				if (_dRevL == null ||isNull(_dRevL.getFirst(dRevIdx, tempRevR.iv_d_no(), tempRevR.iv_rev()))) {
					dIns.add(tempRevR);
				}
				else {
					dUpd.add(tempRevR);
				}
			}
			
			MCIndexKey dCurrentIdx = _dCurrentL.createIndex(MST_IV_D_P_R.$iv_d_no, MST_IV_D_P_R.$iv_rev);
			for (MST_IV_D_P_R dRevR : _dRevL) {
				MST_IV_R hCurrentR = _hCurrentL.getFirst(hCurrentIdx, dRevR. iv_mng_no ());
				if (!isNull(hCurrentR) &&  dRevR.iv_rev().eq(hCurrentR.iv_rev())) {
					// リビジョンが変わってないかつインボイス明細が行削除された場合に、インボイス明細（改訂履歴）も削除する。
					if (isNull(_dCurrentL.getFirst(dCurrentIdx, dRevR.iv_d_no(), dRevR.iv_rev()))) {
						dDel.add(dRevR);
					}
				}
			}
			if (!isNull(dIns)) {
				dbInsert("MSBEL5730_MST_IV_D_P_I01", dIns, MCQueryApiBuilder.create(MST_IV_D_P_R.create("T")));
			}
			if (!isNull(dUpd)) {
				MCQueryApiBuilder dUpd_bldr = MCQueryApiBuilder.create(MST_IV_D_P_R.create("T"));
				dUpd_bldr.removeSet(dUpd_bldr.getBaseDbc().getKeyColumn());
				dbUpdateKey("MSBEL5730_MST_IV_D_P_U01", dUpd, dUpd_bldr);
			}
			if (!isNull(dDel)) {
				dbDeleteKey("MSBEL5730_MST_IV_D_P_D01", dDel, MST_IV_D_P_R.create("T"));
			}
		}
	}
	
	/**
	 * 「改訂履歴データ更新リスト」テーブルにデータを登録（サービス呼び出し）。
	 * @param ivR インボイスヘッダ
	 */
	protected void callRevDataIns01(MST_IV_R ivR) {
		
		MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
		RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
		opeR.rev_data_src_no(ivR.iv_mng_no());
		opeR.rev_no(ivR.iv_rev());
		opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_IV.value());
		ope.up0().add(opeR);
		
		ope.exec();
	}
	
	/**
	 * 出荷指図明細のワークテーブルを作成する。
	 * @param shipInstDNoL 出荷指図明細NOリスト
	 */
	protected void crtShipInstDWk(List<String> shipInstDNoL) {
		
		MCList<MST_SHIP_INST_D_R> lst = MCList.create(MST_SHIP_INST_D_R.class);
		MST_SHIP_INST_D_R r = null;
		
		for (String shipInstDNo : shipInstDNoL) {
			
			r = MST_SHIP_INST_D_R.create();
			r.ship_inst_d_no(shipInstDNo);
			
			lst.add(r);
		}

		MCQueryApiBuilder shipInstD_bldr = MCQueryApiBuilder.create(MST_SHIP_INST_D_R.create("T"));
		dbWkDelete("MSBEL5730_MSW_SHIP_INST_D_D01", shipInstD_bldr.getBaseDbc());
		dbWkInsert("MSBEL5730_MSW_SHIP_INST_D_I01", lst, shipInstD_bldr.getBaseDbc());
	}
	
	/**
	 * 出荷実績明細のワークテーブルを作成する。
	 * @param shipActDNoL 出荷実績明細NOリスト
	 */
	protected void crtShipActDWk(List<String> shipActDNoL) {
		
		MCList<MST_SHIP_ACT_D_R> lst = MCList.create(MST_SHIP_ACT_D_R.class);
		MST_SHIP_ACT_D_R r = null;
		
		for (String shipActDNo : shipActDNoL) {
			
			r = MST_SHIP_ACT_D_R.create();
			r.ship_act_d_no(shipActDNo);
			
			lst.add(r);
		}

		MCQueryApiBuilder shipActD_bldr = MCQueryApiBuilder.create(MST_SHIP_ACT_D_R.create("T"));
		dbWkDelete("MSBEL5730_MSW_SHIP_ACT_D_D01", shipActD_bldr.getBaseDbc());
		dbWkInsert("MSBEL5730_MSW_SHIP_ACT_D_I01", lst, shipActD_bldr.getBaseDbc());
	}
	
	/**
	 * 出荷予定のワークテーブルを作成する。
	 * @param shipSchdNoL 出荷予定NOリスト
	 */
	protected void crtShipSchdWk(List<String> shipSchdNoL) {
		
		MCList<MST_SHIP_SCHD_R> lst = MCList.create(MST_SHIP_SCHD_R.class);
		MST_SHIP_SCHD_R r = null;
		
		for (String shipSchdNo : shipSchdNoL) {
			
			r = MST_SHIP_SCHD_R.create();
			r.ship_schd_no(shipSchdNo);
			
			lst.add(r);
		}

		MCQueryApiBuilder shipSchd_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
		dbWkDelete("MSBEL5730_MSW_SHIP_SCHD_D01", shipSchd_bldr.getBaseDbc());
		dbWkInsert("MSBEL5730_MSW_SHIP_SCHD_I01", lst, shipSchd_bldr.getBaseDbc());
	}
	
	/**
	 * 更新権限をチェックする（新規、訂正、取消共通）
	 * 
	 * @param hdrR ヘッダ
	 * @param dtlL 明細
	 * @param ivCanFlg インボイス取消か
	 * @return
	 */
	protected MCMessageList checkDac(Iv_Chk01_HdrR hdrR, MCList<Iv_Chk01_DtlR> dtlL, boolean ivCanFlg) {
		
		MCMessageList msgL = new MCMessageList();
		
		if (MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSHIP(hdrR.trd_ptn_typ())) {
			
			MCList<Iv_Chk01_DtlR> manualAddL = dtlL.createInstance();
			MCList<Iv_Chk01_DtlR> ivSloL = dtlL.createInstance();
			MCList<Iv_Chk01_DtlR> uplndL = dtlL.createInstance();
			
			for (Iv_Chk01_DtlR dtlR : dtlL) {
				if(!dtlR.existed_flg() || dtlR.manual_add_flg()) {
					manualAddL.add(dtlR);
				}
				else if (dtlR.uplnd_flg()) {
					if (MSC_IV_SRC_TYP.isSLS(hdrR.iv_src_typ())) {
						// 計画外売上の場合、売上時にチェックするため、本画面ではチェックしない。
						continue;
					}
					else {
						uplndL.add(dtlR);
					}
				}
				else {
					ivSloL.add(dtlR);
				}
			}
			if (!uplndL.isEmpty()) {
				msgL.addAll(checkUplndDac(uplndL));
			}
			
			for (Iv_Chk01_DtlR manualAddR : manualAddL) {
				// 新規、訂正（行削除除く）、変更なし時のＤＡＣチェック
				if (!manualAddR.isStatusDelete() && !ivCanFlg) {
					MAM_DPT_R dptR = MAM_DPT_R.create();
					MAM_DPT_R t = MAM_DPT_R.create("T");
					MCQueryApiBuilder dptR_bldr = MCQueryApiBuilder.create(t);
					dptR_bldr.setSelect(t.wg_cd);
					dptR_bldr.setWhere(t.dpt_cd.eq(bind("dpt_cd")).and(bind("dt").between(t.st_dt, t.end_dt)));
					MCRow bind = MCRow.create();
					bind.addStringColumn("dpt_cd", manualAddR.sls_dpt_cd());
					bind.addDateColumn("dt", hdrR.iv_dt());
					dbSelect("MSBEL5730_MAM_DPT_S01", dptR, dptR_bldr, bind);
					manualAddR.sls_dpt_wg_cd(dptR.wg_cd());
					
					msgL.addAll(checkWritableWgCdDac(manualAddR, Iv_Chk01_DtlR.$sls_dpt_wg_cd));
				}
				
				// 訂正（行削除含む）、取消時のＤＡＣチェック
				if (!isNull(manualAddR.iv_d_no()) && hdrR.iv_upd_cntr().intValue() != -1) {
					MST_IV_R t1 = MST_IV_R.create("T1");
					MAM_DPT_R m1 = MAM_DPT_R.create("M1");

					MST_IV_D_R ivDR = MST_IV_D_R.create();
					MST_IV_D_R t = MST_IV_D_R.create("T");
					MCQueryApiBuilder ivDR_bldr = MCQueryApiBuilder.create(t);
					ivDR_bldr.addSelect(m1.wg_cd.as("sls_dpt_wg_cd"));
					ivDR_bldr.addInnerJoin(t1, bracket( t.iv_mng_no.eq(t1.iv_mng_no)));
					ivDR_bldr.addLeftOuterJoin(m1, bracket( t.sls_dpt_cd.eq(m1.dpt_cd) .and(t1.iv_dt.between(m1.st_dt, m1.end_dt))));
					dbSelectKey("MSBEL5730_MST_IV_D_S02", ivDR, ivDR_bldr, manualAddR.iv_d_no());
					manualAddR.sls_dpt_wg_cd(ivDR.getStringNE("sls_dpt_wg_cd"));
					
					msgL.addAll(checkWritableWgCdDac(manualAddR, Iv_Chk01_DtlR.$sls_dpt_wg_cd));
				}
			}
			
			// 受注日時点のマスタを参照する。インボイス明細と受注ヘッダの売上部門は同じ前提
			MST_SLO_R t = MST_SLO_R.create("T");
			MAM_DPT_R m1 = MAM_DPT_R.create("M1");
			MCList<MST_SLO_R> sloL = MCList.create(MST_SLO_R.class);
			MCQueryApiBuilder sloL_bldr = MCQueryApiBuilder.create(t);
			sloL_bldr.setSelect(t.slo_no);
			sloL_bldr.addSelect(t.iv_no);
			sloL_bldr.addSelect(m1.wg_cd.as("sls_dpt_wg_cd"));
			sloL_bldr.addLeftOuterJoin(m1, bracket( t.sls_dpt_cd.eq(m1.dpt_cd) .and(t.slo_dt.between(m1.st_dt, m1.end_dt))));
			dbSelectKey("MSBEL5730_MST_SLO_S02", sloL, sloL_bldr, ivSloL.groupBy(Iv_Chk01_DtlR.$slo_no));
			
			MCIndexKey ikSlo = sloL.createIndex(MST_SLO_R.$slo_no);
			for (Iv_Chk01_DtlR ivSloR : ivSloL) {
				MST_SLO_R sloR = sloL.getFirst(ikSlo, ivSloR.slo_no());
				ivSloR.sls_dpt_wg_cd(sloR.getStringNE("sls_dpt_wg_cd"));
				if (!isNullOrNullVal(sloR.iv_no())) {
					hdrR.is_slo_iv_no(true);
					hdrR.iv_no(sloR.iv_no());
				}
			}
			msgL.addAll(checkWritableWgCdDac(ivSloL, Iv_Chk01_DtlR.$sls_dpt_wg_cd));
		}
		else if (MAC_TRD_PTN_TYP.isSLS_CNSGN(hdrR.trd_ptn_typ())) {
			// 貸出売上の場合、売上時にチェックするため、本画面ではチェックしない。
		}
		else {
			
			//　移動移送予定から出庫場所を取得
			MCList<MST_XFR_SCHD_R> xfrSchdL = MCList.create(MST_XFR_SCHD_R.class);
			MST_XFR_SCHD_R t1 = MST_XFR_SCHD_R.create("T1");
			MCQueryApiBuilder xfrSchdL_bldr = MCQueryApiBuilder.create(t1);
			xfrSchdL_bldr.setSelect(t1.xfr_schd_no);
			xfrSchdL_bldr.addSelect(t1.gi_loc_cd);
			dbSelectColumn("MSBEL5730_MST_XFR_SCHD_S01", xfrSchdL, xfrSchdL_bldr, MST_XFR_SCHD_R.$xfr_schd_no, dtlL, Iv_Chk01_DtlR.$xfr_schd_no);
			
			MCList<MAM_ITM_LG_GRP_R> itmLgGrpL = getItmLgGrpLocL(dtlL);
			MCList<MAM_LOC_R> locL = getLocL(dtlL);

			MCIndexKey xfrSchdKey = xfrSchdL.createIndex(MST_XFR_SCHD_R.$xfr_schd_no);
			MCIndexKey itmLgGrpKey = itmLgGrpL.createIndex(MAM_ITM_LG_GRP_R.$itm_cd, MAM_ITM_LG_GRP_R.$itm_sub1, MAM_ITM_LG_GRP_R.$itm_sub2, MAM_ITM_LG_GRP_R.$itm_sub3, MAM_ITM_LG_GRP_R.$lg_grp_cd);
			MCIndexKey locKey = locL.createIndex(MAM_LOC_R.$lg_grp_cd);
			
			dtlL.addStringColumn("chk_gi_loc_cd");
			for (Iv_Chk01_DtlR r : dtlL) {
				MST_XFR_SCHD_R xfrSchdR = xfrSchdL.getFirst(xfrSchdKey, r.xfr_schd_no());				
				MAM_ITM_LG_GRP_R itmLgGrpR = itmLgGrpL.getFirst(itmLgGrpKey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.ship_fr_lg_grp_cd());
				MAM_LOC_R locR = locL.getFirst(locKey, r.ship_fr_lg_grp_cd());
				r.setStringNE("chk_gi_loc_cd",  !isNull(xfrSchdR.gi_loc_cd()) ? xfrSchdR.gi_loc_cd() : !isNull(itmLgGrpR) ? itmLgGrpR.lg_def_loc_cd() : !isNull(locR) ? locR.loc_cd() : null);				
			}
			msgL.addAll(checkWritableLocCdDac(dtlL, "chk_gi_loc_cd"));
		}
		return msgL;
	}
	/**
	 * 計画外出荷の場合、出荷時の依頼元部門（売上部門）を取得し、DACを行う。
	 * @param uplndL 計画外出荷のリスト
	 * @return エラーメッセージ
	 */
	protected MCMessageList checkUplndDac(MCList<Iv_Chk01_DtlR> uplndL) {
		MCMessageList msgL = new MCMessageList();
		
		MST_SHIP_ACT_R shipAct = MST_SHIP_ACT_R.create("SHIPACT");
		MAM_DPT_R dpt = MAM_DPT_R.create("DPT");
		MCList<MST_SHIP_ACT_R> shipActL = MCList.create(MST_SHIP_ACT_R.class);
		MCQueryApiBuilder shipActL_bldr = MCQueryApiBuilder.create(shipAct);
		shipActL_bldr.setSelect(shipAct.ship_act_no);
		shipActL_bldr.addSelect(dpt.wg_cd.as("sls_dpt_wg_cd"));
		shipActL_bldr.addLeftOuterJoin(dpt, bracket(shipAct.rqst_dpt_cd.eq(dpt.dpt_cd) .and(shipAct.ac_dt.between(dpt.st_dt, dpt.end_dt))));
		dbSelectKey("MSBEL5730_MST_SHIP_ACT_S03", shipActL, shipActL_bldr, uplndL.groupBy(Iv_Chk01_DtlR.$ship_act_no));
		msgL.addAll(checkWritableWgCdDac(shipActL, Iv_Chk01_DtlR.$sls_dpt_wg_cd));
		
		return msgL;
	}
	
	/**
	 * マニュアル追加フラグの設定
	 * @param dL
	 */
	protected void setManualAddFlg(MCList<Iv_Chk01_DtlR> dL) {
		for (Iv_Chk01_DtlR r : dL) {
			if(!r.existed_flg()) { //トランデータ元ではない場合
				r.manual_add_flg(true);
			}
		}
	}
	
	/**
	 * インボイス明細ＮＯの発番
	 * @param dL
	 */
	protected void setIvDNo(MCList<Iv_Chk01_DtlR> dL) {
		doSeqCache(MSC_NUM_SYS_TYP.IVD, dL.size());
		for (Iv_Chk01_DtlR r : dL) {
			r.iv_d_no(getStrSeq(MSC_NUM_SYS_TYP.IVD));
		}
	}
	
	/**
	 * 前処理
	 * @param up0
	 * @param up1
	 */
	protected void preSet(Iv_Chk01_HdrR up0, MCList<Iv_Chk01_DtlR> up1) {
		
		// 売上実績SVから呼ばれた場合、インボイス単位税調整済みのため明細の金額設定不要
		if (!up0.iv_tax_cmpl_flg()) {
			//明細の各種金額の設定
			setAmt(up0, up1);
			//インボイス単位税計算呼出
			callAmtUtilCalc01(up0, up1);
		}

		// ヘッダの取引通貨金額合計
		setTtlAmt(up0, up1);
		
	}
	
	/**
	 * 各種金額の設定
	 */
	protected void setAmt(Iv_Chk01_HdrR up0, MCList<Iv_Chk01_DtlR> up1) {
		for(Iv_Chk01_DtlR dR : up1) {
			if(MAC_TRD_PTN_TYP.isXFR(up0.trd_ptn_typ()) ||
					MAC_TRD_PTN_TYP.isXFR_RTN(up0.trd_ptn_typ())) { //取引パタン：移動・移送 or 移動・移送返品
				setIvAmtDXFR(dR, up0);
			}
			else {
				setAmtD(dR, up0);
			}
		}
	}
	
	protected void setIvAmtDXFR(Iv_Chk01_DtlR dR, Iv_Chk01_HdrR up0) {
		dR.setNumberNE(Iv_Chk01_DtlR.$trd_cur_amt, 0);
		dR.setNumberNE(Iv_Chk01_DtlR.$trd_cur_tax_amt, 0);
		dR.setNumberNE(Iv_Chk01_DtlR.$ptax_cur_amt, 0);
		dR.setNumberNE(Iv_Chk01_DtlR.$wtax_amt, 0);

		setIvAmtD(dR, up0);
	}
	
	protected void setAmtD(Iv_Chk01_DtlR dR, Iv_Chk01_HdrR up0) {
		
		if (!MAC_TRD_PTN_TYP.isSLS(up0.trd_ptn_typ())) {
			// 取引通貨金額、取引通貨税額の計算
			// ※取引パタン区分「売上」の分は、計算せずに上り電文の金額、税額を使用する
			MCRow amtR = getAmtAndTax(
					dR.trd_cur_upri(), 
					dR.base_unit_qty(),
					dR.tax_rate(), 
					dR.inc_tax_flg(), 
					up0.trd_cur_amt_dec_place(),
					up0.trd_amt_rnd_typ(), 
					up0.trd_tax_rnd_typ(),
					dR.trd_cur_dscnt_amt());
			dR.trd_cur_amt(amtR.getNumber("amt"));
			dR.trd_cur_tax_amt(amtR.getNumber("tax_amt"));
		}
		
		// 移送などは税率がNULLのため、別途0を設定する
		if (isNull(dR.tax_rate())) {
			dR.trd_cur_tax_amt(0);
		}
		
		// インボイス表記金額
		if(!isNull(dR.trd_cur_upri()) && !dR.trd_cur_upri().isZero()) {
			dR.iv_upri(dR.trd_cur_upri());
			dR.iv_amt(dR.trd_cur_amt());
		}
		else {
			setIvAmtD(dR, up0);
		}
		
		//納税通貨金額の計算
		dR.ptax_cur_amt(convCur(dR.trd_cur_amt(), 
						up0.ptax_xrate(),
						getPtaxCur().amt_dec_place(), 
						getCo().xrate_rnd_typ()));

		//源泉税額の計算
		if(!isNull(dR.wtax_rate()) && isSame(up0.trd_cur_cd(), getBaseCur().cur_cd()) &&
				(isSame(up0.trd_cur_cd(), getPtaxCur().cur_cd()) || isNull(getPtaxCur().cur_cd()))) {
			//源泉税額＝取引通貨金額×源泉税率÷100（通貨が一致している前提なので、どの通貨の値を使ってもよい）
			dR.wtax_amt(dR.trd_cur_amt().multiply(dR.wtax_rate()).divide(100,
						getBaseCur().amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().wtax_rnd_typ())));
		}
	}
	
	protected void setIvAmtD(Iv_Chk01_DtlR dR, Iv_Chk01_HdrR up0) {

		if(isNull(dR.iv_upri())) {
			dR.iv_upri(0);
			dR.iv_amt(0);
		}
		else {
			MCNumber upriQty = null;
			if (MAC_TRD_PTN_TYP.isSLS(up0.trd_ptn_typ())) {
				upriQty = dR.trd_unit_qty();
			}
			else {
				upriQty = dR.base_unit_qty();
			}
			
			dR.iv_amt(getAmt(dR.iv_upri(), 
							upriQty, 
							up0.trd_cur_amt_dec_place(), 
							up0.trd_amt_rnd_typ()));
		}
	}
	
	/**
	 * 得意先の税計算区分が伝票単位、または有償支給かつ支給税区分が伝票単位の場合
	 * インボイス単位で消費税を再計算する
	 */
	protected void callAmtUtilCalc01(Iv_Chk01_HdrR up0, MCList<Iv_Chk01_DtlR> up1) {
		if (isAmtUtilCalc01(up0)) {
			MSUCL_AmtUtil.AmtUtil_Calc01  ope = MSUCL_AmtUtil.crtAmtUtil_Calc01();
			copy(ope.up0(), up0, createMap_AmtUtil_Calc01_HdrR_Iv_Chk01_HdrR());
			setAll(ope.up1(), up1, createMap_AmtUtil_Calc01_DtlR_Iv_Chk01_DtlR());
			ope.exec();
			
			String[] destCols = {Iv_Chk01_DtlR.$trd_cur_amt, Iv_Chk01_DtlR.$trd_cur_tax_amt,
					Iv_Chk01_DtlR.$ptax_cur_amt, Iv_Chk01_DtlR.$iv_amt, Iv_Chk01_DtlR.$wtax_amt};
			String[] srcCols = {AmtUtil_Calc01_DtlR.$trd_cur_amt, AmtUtil_Calc01_DtlR.$trd_cur_tax_amt,
					AmtUtil_Calc01_DtlR.$ptax_cur_amt, AmtUtil_Calc01_DtlR.$iv_amt, AmtUtil_Calc01_DtlR.$wtax_amt};
			copyByPegNo(up1, destCols, ope.down0(), srcCols);
		}
	}
	protected boolean isAmtUtilCalc01(Iv_Chk01_HdrR up0) {
		MAM_BP_R bpR = getBpCache(up0.ship_rqst_id_cd());
		if (isNull(bpR)) {
			return false;
		}
		if (MSC_SHIP_RQST_ID_TYP.isCST(up0.ship_rqst_id_typ())) {
			return MAC_TAX_CALC_TYP.isSLIP(bpR.sls_tax_calc_typ());
		}
		if (MSC_SHIP_RQST_ID_TYP.isSPPL(up0.ship_rqst_id_typ())) {
			return bpR.onr_prsppl_flg() && MAC_TAX_CALC_TYP.isSLIP(bpR.prov_tax_calc_typ());
		}
		return false;
	}
	
	/**
	 * 取引先マスタの取得
	 * @param bp_cd
	 * @return
	 */
	protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;
	protected MAM_BP_R getBpCache(String bp_cd) {
		if (_cacheBp == null) {
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(MCQueryApiBuilder.create(MAM_BP_R.create("T")));
		}
		return _cacheBp.get(bp_cd);
	}
	/**
	 * ヘッダの合計金額の設定
	 * 
	 * @param up0
	 * @param up1
	 */
	protected void setTtlAmt(Iv_Chk01_HdrR up0, MCList<Iv_Chk01_DtlR> up1) {
		
		MCNumber ttlTrdCurAmt = MCNumber.ZERO;
		for(Iv_Chk01_DtlR dR : up1) {
			if (dR.isStatusDelete()) {
				continue;
			}
			if (dR.dscnt_itm_flg()) {
				ttlTrdCurAmt = ttlTrdCurAmt.subtract(dR.trd_cur_amt());
			}
			else {
				ttlTrdCurAmt = ttlTrdCurAmt.add(dR.trd_cur_amt());
			}
		}
		up0.ttl_trd_cur_amt(ttlTrdCurAmt);

	}
	
	/**
	 * インボイスＮＯの取得
	 * @param exIvNo
	 * @return
	 */
	protected String getIvNo(String ivNo) {
		// インボイスＮＯの発番
		ElmArgsR elmR = ElmArgsR.create();
		elmR.co_cd(getCo().co_cd());
		elmR.dt(getToday());
		
		return getNumIv(elmR, ivNo);
	}
	
	/**
	 * 指定したインボイスＮＯを削除する
	 * 
	 * @param iv_no 削除するインボイスＮＯ
	 */
	protected void delIvNo(String iv_no) {
		MST_IV_NO_R t = MST_IV_NO_R.create("T");
		execDbDeleteKey("MSBEL5730_MST_IV_NO_D01", t, iv_no);
	}
	
	/**
	 * インボイス更新（三国間）
	 */
	protected void updIvIntrmSub(Iv_Chk01_HdrR up0, MCList<Iv_Chk01_DtlR> up1, MCList<Iv_Chk01_MapDtlR> up2, String data_crud_typ) {

		MCList<Iv_Chk01_DtlR> ivD_DelL = up1.subList(MCRow.Status.DELETE);
		MCList<Iv_Chk01_MapDtlR> ivMap_delL = getIvMapDelL(ivD_DelL, up2);

		ivDbAccess(up0, up1);
		
		if (MAC_DATA_CRUD_TYP.isCRT(data_crud_typ)) {
			insIvMap(up2);
		}
		delIvMap(ivMap_delL);
	}

	protected void ivDbAccess(
			Iv_Chk01_HdrR up0,
			MCList<Iv_Chk01_DtlR> up1) 
	{
		MST_IV_R ivR = initIvR(up0, up1);
		
		MCList<Iv_Chk01_DtlR> ivD_UpdL =  up1.subList(MCRow.Status.MODIFY);
		MCList<Iv_Chk01_DtlR> ivD_DelL = up1.subList(MCRow.Status.DELETE);
		MCList<Iv_Chk01_DtlR> ivD_InsL = up1.subList(MCRow.Status.CREATE);
		MCList<Iv_Chk01_DtlR> ivD_NoneL = up1.subList(MCRow.Status.NONE);
		
		MCList<MST_IV_D_R> d_UpdL = initIvDL(ivD_UpdL);
		MCList<MST_IV_D_R> d_DelL = initIvDL(ivD_DelL);
		MCList<MST_IV_D_R> d_InsL = initIvDL(ivD_InsL);
		MCList<MST_IV_D_R> d_NoneL = initIvDL(ivD_NoneL);
		setIvRev(ivR, d_UpdL, d_DelL, d_InsL, d_NoneL);
		up0.iv_rev(ivR.iv_rev());
		up1.setValueNE(Iv_Chk01_DtlR.$iv_rev, ivR.iv_rev());

		//ＤＢ更新
		MCQueryApiBuilder ivR_bldr = MCQueryApiBuilder.create(MST_IV_R.create("T"));
		ivR_bldr.setSet(getHeaderSetList());
		if (MSC_IV_SRC_TYP.isSLS(up0.iv_src_typ())) {
			ivR_bldr.addSet(getHeaderSetListForUplnd());
		}
		dbUpdateKey("MSBEL5730_MST_IV_U01", ivR, ivR_bldr);
		
		if(!d_UpdL.isEmpty()) {
			MCQueryApiBuilder d_UpdL_bldr = MCQueryApiBuilder.create(MST_IV_D_R.create("T"));
			d_UpdL_bldr.setSet(getDtlSetList());
			if (MSC_IV_SRC_TYP.isSLS(up0.iv_src_typ())) {
				d_UpdL_bldr.addSet(getDtlSetListForUplnd());
			}
			dbUpdateKey("MSBEL5730_MST_IV_D_U01", d_UpdL, d_UpdL_bldr);
		}
		if(!d_DelL.isEmpty()) {
			MCQueryApiBuilder d_DelL_bldr = MCQueryApiBuilder.create(MST_IV_D_R.create("T"));
			dbDeleteKey("MSBEL5730_MST_IV_D_D01", d_DelL, d_DelL_bldr);
		}
		if(!d_InsL.isEmpty()) {
			MCQueryApiBuilder d_InsL_bldr = MCQueryApiBuilder.create(MST_IV_D_R.create("T"));
			dbInsert("MSBEL5730_MST_IV_D_I02", d_InsL, d_InsL_bldr);
		}
		if(!d_NoneL.isEmpty()) {
			MCQueryApiBuilder d_NoneL_bldr = MCQueryApiBuilder.create(MST_IV_D_R.create("T"));
			d_NoneL_bldr.setSet(getDtlSetListForNone());
			dbUpdateKey("MSBEL5730_MST_IV_D_U02", d_NoneL, d_NoneL_bldr);
		}
		callRevDataIns01(ivR);
	}
	
	protected MCPermColumn[] getHeaderSetList() {
		MST_IV_R t = MST_IV_R.create("T");

		return new MCPermColumn[] {
				t.iv_no,
				t.iv_rev,
				t.pl_skip_flg,
				t.iv_ship_flg,
				t.cmpl_schd_dt,
				t.trd_schd_dt,
				t.iv_dt,
				t.dlv_id_nm,
				t.trnspt_cd,
				t.vssl_flght,
				t.load_port_cd,
				t.etd_dt,
				t.dschrg_port_cd,
				t.eta_dt,
				t.via_port_cd,
				t.via_schd_dt,
				t.tterm_cd1,
				t.tterm_rmrks1,
				t.tterm_cd2,
				t.tterm_rmrks2,
				t.xrate_inpt_flg,
				t.xrate,
				t.ptax_xrate_inpt_flg,
				t.ptax_xrate,
				t.tterm_cd3,
				t.tterm_rmrks3,
				t.bill_basis_dt,
				t.rcv_schd_dt,
				t.lc_no,
				t.lc_dt,
				t.lc_rmrks,
				t.bl_no,
				t.bl_dt,
				t.bl_rmrks,
				t.ship_fr_lg_grp_cd,
				t.iv_rmrks,
				t.case_mrk1,
				t.case_mrk2,
				t.case_mrk3,
				t.case_mrk4,
				t.case_mrk5,
				t.case_mrk6,
				t.intr_rmrks,
				t.iv_prnt_flg,
				t.sub_char1,
				t.sub_char2,
				t.sub_char3,
				t.ttl_trd_cur_amt,
				t.pre_rcpt_iv_flg
		};
	}
	/**
	 * 計画外売上実績画面から呼ばれた時に、設定するヘッダ項目を返す。
	 * @return 更新対象ヘッダ項目
	 */
	protected MCPermColumn[] getHeaderSetListForUplnd() {
		MST_IV_R t = MST_IV_R.create("T");

		return new MCPermColumn[] {
				t.dlv_id_cd,
				t.dlv_addr1,
				t.dlv_addr2,
				t.dlv_addr3,
				t.dlv_addr4,
				t.dlv_cntct_dpt,
				t.dlv_cntct_psn,
				t.dlv_cntry_cd,
				t.dlv_fax,
				t.dlv_sundry_flg,
				t.dlv_tel,
				t.dlv_zip_cd,
				t.trd_cur_cd,
		};
	}

	protected MCPermColumn[] getDtlSetList() {

		MST_IV_D_R t = MST_IV_D_R.create("T");
		return new MCPermColumn[] {
				t.iv_rev,
				t.trd_cd,
				t.bndl_flg,
				t.itm_cd,
				t.itm_sub1,
				t.itm_sub2,
				t.itm_sub3,
				t.itm_nm,
				t.iv_itm_nm,
				t.trd_cur_upri,
				t.interim_flg,
				t.upri_not_tgt_flg,
				t.trd_cur_amt,
				t.iv_upri,
				t.iv_amt,
				t.tax_fix_flg,
				t.ptax_cur_amt,
				t.wtax_amt,
				t.tax_cd,
				t.trd_cur_tax_amt,
				t.trd_unit_cd,
				t.trd_unit_qty,
				t.base_unit_qty,
				t.base_unit_cd,
				t.trd_cur_dscnt_amt,
				t.sundry_itm_flg,
				t.cntry_org_cd,
				t.sno1,
				t.sno2,
				t.sno3,
				t.sno4,
				t.rsn_cd,
				t.bd_dpt_cd,
				t.sls_usr_cd,
				t.sls_dpt_cd,
				t.iv_d_rmrks,
				t.trd_rmrks,
				t.trd_d_rmrks,
				t.intr_d_rmrks,
				t.sub_char1,
				t.sub_char2,
				t.sub_char3,
				t.dscnt_rsn_cd,
				t.ar_dpt_cd,
				t.disp_seq
		};
	}
	/**
	 * 計画外売上実績画面から呼ばれた時に、設定する明細項目を返す。
	 * @return 更新対象明細項目
	 */
	protected MCPermColumn[] getDtlSetListForUplnd() {
		MST_IV_D_R t = MST_IV_D_R.create("T");

		return new MCPermColumn[] {
				t.cst_po_no,
				t.cst_po_d_no,
				t.cst_itm_cd,
				t.cst_itm_nm,
				t.gd_cd
		};
	}
	
	protected MCPermColumn[] getDtlSetListForNone() {

		MST_IV_D_R t = MST_IV_D_R.create("T");
		return new MCPermColumn[] {
				t.trd_cur_amt,
				t.iv_amt,
				t.trd_cur_tax_amt,
				t.ptax_cur_amt,
				t.wtax_amt,
				t.iv_rev,
				t.disp_seq
		};
	}
	
	/**
	 * 三国間の場合、インボイス情報の削除時に初期化対象となるインボイスヘッダ項目の配列を取得する
	 * 
	 * @return 初期化対象の項目
	 */
	protected MCPermColumn[] getIvInitList() {
		
		MST_IV_R t = MST_IV_R.create("T");
		MCPermColumn[] list = {
				t.pre_rcpt_iv_flg,
				t.iv_no,
				t.iv_rev,
				t.pl_skip_flg,
				t.cmpl_schd_dt,
				t.trd_schd_dt,
				t.iv_dt,
				t.bill_basis_dt,
				t.rcv_schd_dt,
				t.iv_ship_flg,
				t.lc_no,
				t.lc_dt,
				t.lc_rmrks,
				t.bl_no,
				t.bl_dt,
				t.bl_rmrks,
				t.iv_rmrks,
				t.case_mrk1,
				t.case_mrk2,
				t.case_mrk3,
				t.case_mrk4,
				t.case_mrk5,
				t.case_mrk6,
				t.intr_rmrks,
				t.iv_prnt_flg,
				t.sub_char1,
				t.sub_char2,
				t.sub_char3
		};

		return list;

	}

	/**
	 * 三国間の場合、インボイス情報の削除時に初期化対象となるインボイス明細項目の配列を取得する
	 * 
	 * @return 初期化対象の項目
	 */
	protected MCPermColumn[] getIvDInitList() {

		MST_IV_D_R t =MST_IV_D_R.create("T");
		MCPermColumn[] list = {
				t.iv_d_rmrks,
				t.trd_rmrks,
				t.trd_d_rmrks,
				t.intr_d_rmrks,
				t.iv_rev,
				t.iv_mng_no,
				t.sub_char1,
				t.sub_char2,
				t.sub_char3
		};

		return list;
	}
	/**
	 * 受領インボイスを空更新する。
	 * @param rcptIvMngNo 受領インボイスNO
	 */
	protected void updRcptIv(String rcptIvMngNo) {
		
		MST_RCPT_IV_R rcptIv = MST_RCPT_IV_R.create("RCPTIV");
		
		rcptIv.rcpt_iv_mng_no(rcptIvMngNo);
		dbTsUpdateKey("MSBEL5730_MST_RCPT_IV_U01", rcptIv, rcptIv);
	}
	
	/**
	 * 取引予定日の設定
	 * 
	 * @param ivR
	 * @param up0
	 */
	protected void setTrdSchdDt(MST_IV_R ivR, Iv_Chk01_HdrR up0) {
		//取引パタン：売上の場合、取引予定日を売上予定日で設定
		if (MAC_TRD_PTN_TYP.isSLS(up0.trd_ptn_typ())) {
			ivR.trd_schd_dt(up0.sls_schd_dt());
		}
		//取引パタン：移動・移送、移動・移送返品、支給の場合、取引予定日を入荷予定日で設定
		else {
			ivR.trd_schd_dt(up0.arr_schd_dt());
		}
	}
	
	/**
	 * インボイス発行済ＦＬＧの設定
	 * （インボイスに関係する項目を変更したら未発行に戻す。発行済に更新するのは輸出帳票サービス）
	 * 
	 * @param ivR
	 * @param up0
	 * @param up1
	 */
	protected void setIvPrntFlg(MST_IV_R ivR, Iv_Chk01_HdrR up0, MCList<Iv_Chk01_DtlR> up1) {
		
		if (isNull(up0.iv_mng_no())) {
			return;
		}
		
		MST_IV_R oldIvR = MST_IV_R.create();
		MCQueryApiBuilder oldIvR_bldr = MCQueryApiBuilder.create(MST_IV_R.create("T"));
		dbSelectKey("MSBEL5730_MST_IV_S03", oldIvR, oldIvR_bldr, up0.iv_mng_no());

		if (!oldIvR.iv_prnt_flg()) {
			return;
		}
		
		if (!up1.subList(MCRow.Status.DELETE, MCRow.Status.CREATE).isEmpty()) {
			return;
		}
		
		if (isChanged(getCmpIvHdrPrnt(ivR, oldIvR)))  {
			return;
		}
		
		MCList<MST_IV_D_R> oldIvDL = MCList.create(MST_IV_D_R.class);
		MST_IV_D_R t1 = MST_IV_D_R.create("T");
		MCQueryApiBuilder oldIvDL_bldr = MCQueryApiBuilder.create(t1);
		oldIvDL_bldr.setWhere(t1.iv_mng_no.eq(bind("1")), up0.iv_mng_no());
		dbSelect("MSBEL5730_MST_IV_D_S01", oldIvDL, oldIvDL_bldr);

		for (MST_IV_D_R oldIvDR : oldIvDL) {
			
			Iv_Chk01_DtlR dtlR = up1.getFirst(Iv_Chk01_DtlR.$iv_d_no, oldIvDR.iv_d_no());
			if (isNull(dtlR) || dtlR.isEmpty() || isChanged(getCmpIvDtlPrnt(dtlR, oldIvDR))) {
				return;
			}
		}
		
		// 発行済の状態で、インボイスに関する項目に変更がなかったら、発行済のままとする
		ivR.iv_prnt_flg(true);
	}
	
	/**
	 * 引数に指定されたパラメータが一致するかどうか。
	 * @param cmp Comparable配列
	 * @return 一致しない場合はtrue
	 */
	protected boolean isChanged(Comparable<?>[][] cmp) {
		
		for (Comparable<?>[] c : cmp) {
			if (!isSame(c[0], c[1])) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * インボイスヘッダ変更前後比較用Comparable配列
	 * 
	 * @param ivR インボイスヘッダ(変更後)
	 * @param oldIvR インボイスヘッダ(変更前)
	 * @return Comparable配列
	 */
	protected Comparable<?>[][] getCmpIvHdrPrnt(MST_IV_R ivR, MST_IV_R oldIvR) {
		
		Comparable<?>[][] cmp = new Comparable[][] {
			
			{ ivR.iv_no(), oldIvR.iv_no() },
			{ ivR.iv_dt(), oldIvR.iv_dt() },
			{ ivR.trnspt_cd(), oldIvR.trnspt_cd() },
			{ ivR.vssl_flght(), oldIvR.vssl_flght() },
			{ ivR.etd_dt(), oldIvR.etd_dt() },
			{ ivR.load_port_cd(), oldIvR.load_port_cd() },
			{ ivR.dschrg_port_cd(), oldIvR.dschrg_port_cd() },
			{ ivR.via_port_cd(), oldIvR.via_port_cd() },
			{ ivR.tterm_cd1(), oldIvR.tterm_cd1() },
			{ ivR.tterm_cd2(), oldIvR.tterm_cd2() },
			{ ivR.tterm_cd3(), oldIvR.tterm_cd3() },
			{ ivR.tterm_rmrks3(), oldIvR.tterm_rmrks3() },
			{ ivR.lc_no(), oldIvR.lc_no() },
			{ ivR.lc_dt(), oldIvR.lc_dt() },
			{ ivR.lc_rmrks(), oldIvR.lc_rmrks() },
			{ ivR.bl_no(), oldIvR.bl_no() },
			{ ivR.bl_dt(), oldIvR.bl_dt() },
			{ ivR.bl_rmrks(), oldIvR.bl_rmrks() },
			{ ivR.case_mrk1(), oldIvR.case_mrk1() },
			{ ivR.case_mrk2(), oldIvR.case_mrk2() },
			{ ivR.case_mrk3(), oldIvR.case_mrk3() },
			{ ivR.case_mrk4(), oldIvR.case_mrk4() },
			{ ivR.case_mrk5(), oldIvR.case_mrk5() },
			{ ivR.case_mrk6(), oldIvR.case_mrk6() },
			{ ivR.iv_rmrks(), oldIvR.iv_rmrks() },
			{ ivR.sub_char1(), oldIvR.sub_char1() },
			{ ivR.sub_char2(), oldIvR.sub_char2() },
			{ ivR.sub_char3(), oldIvR.sub_char3() },
			{ ivR.trd_cur_cd(), oldIvR.trd_cur_cd() }

		};
		
		return cmp;
	}

	/**
	 * インボイス明細変更前後比較用Comparable配列
	 * @param dtlR インボイス明細(変更後)
	 * @param oldIvDR インボイス明細(変更前)
	 * @return Comparable配列
	 */
	protected Comparable<?>[][] getCmpIvDtlPrnt(Iv_Chk01_DtlR dtlR, MST_IV_D_R oldIvDR) {
		
		Comparable<?>[][] cmp = new Comparable[][] {
			
			{ dtlR.itm_cd(), oldIvDR.itm_cd() },
			{ dtlR.itm_sub1(), oldIvDR.itm_sub1() },
			{ dtlR.itm_sub2(), oldIvDR.itm_sub2() },
			{ dtlR.itm_sub3(), oldIvDR.itm_sub3() },
			{ dtlR.cntry_org_cd(), oldIvDR.cntry_org_cd() },
			{ dtlR.sundry_itm_flg() ? dtlR.iv_itm_nm() : null, oldIvDR.iv_itm_nm() },
			{ dtlR.trd_unit_qty(), oldIvDR.trd_unit_qty() },
			{ dtlR.trd_unit_cd(), oldIvDR.trd_unit_cd() },
			{ dtlR.iv_upri(), oldIvDR.iv_upri() },
			{ dtlR.iv_amt(), oldIvDR.iv_amt() },
			{ dtlR.cst_po_no(), oldIvDR.cst_po_no() },
			{ dtlR.cst_po_d_no(), oldIvDR.cst_po_d_no() },
			{ dtlR.cst_itm_cd(), oldIvDR.cst_itm_cd() },
			{ dtlR.cst_itm_nm(), oldIvDR.cst_itm_nm() }
		};
		
		return cmp;
	}

	protected MCList<Iv_Chk01_MapDtlR> getIvMapDelL(MCList<Iv_Chk01_DtlR> ivD_DelL, MCList<Iv_Chk01_MapDtlR> up2) {
		MCList<Iv_Chk01_MapDtlR> ivMap_delL = MCList.create(Iv_Chk01_MapDtlR.class);

		for(Iv_Chk01_MapDtlR mapR : up2) {

			for(Iv_Chk01_DtlR dR : ivD_DelL) {
				if(isSame(mapR.index(), dR.index()) && !isNull(mapR.iv_d_no())) {
					ivMap_delL.add(mapR);
					
					break;
				}
			}
		}

		return ivMap_delL;
	}

	protected MCList<Iv_Chk01_MapDtlR> getIvMapUpdL(MCList<Iv_Chk01_DtlR> ivD_UpdL, MCList<Iv_Chk01_MapDtlR> up2) {
		MCList<Iv_Chk01_MapDtlR> ivMap_updL = MCList.create(Iv_Chk01_MapDtlR.class);

		for(Iv_Chk01_MapDtlR mapR : up2) {

			for(Iv_Chk01_DtlR dR : ivD_UpdL) {
				if(isSame(mapR.index(), dR.index()) && !isNull(mapR.iv_d_no())) {
					if(!dR.bndl_flg()) {
						mapR.trd_unit_qty(dR.trd_unit_qty());
						mapR.base_unit_qty(dR.base_unit_qty());
					}
					ivMap_updL.add(mapR);
					
					break;
				}
			}
		}

		return ivMap_updL;
	}
	
	protected MCList<Iv_Chk01_MapDtlR> getIvMapInsL(MCList<Iv_Chk01_MapDtlR> ivMap_insL, MCList<Iv_Chk01_DtlR> ivD_InsL) {
		MCList<Iv_Chk01_MapDtlR> mapL = MCList.create(Iv_Chk01_MapDtlR.class);

		for(Iv_Chk01_MapDtlR mapR : ivMap_insL) {
			for(Iv_Chk01_DtlR dR : ivD_InsL) {
				if(isSame(mapR.index(), dR.index())) {
					mapR.iv_d_no(dR.iv_d_no());
					if(!dR.bndl_flg()) {
						mapR.trd_unit_qty(dR.trd_unit_qty());
						mapR.base_unit_qty(dR.base_unit_qty());
					}
					mapL.add(mapR);
					
					break;
				}
			}
		}
		
		return mapL;
	}
	
	/**
	 * 出荷実績モードの場合、同一出荷予定の出荷実績を纏めた場合、出荷予定が重複のため、出荷予定マップを集計する。
	 * @param hdrR インボイスヘッダ
	 * @param ivMapL インボイスマップリスト
	 */
	protected void setIvMapShipActMode(Iv_Chk01_HdrR hdrR, MCList<Iv_Chk01_MapDtlR> ivMapL) {
		
		if (MSC_IV_SRC_TYP.isSHIP_ACT(hdrR.iv_src_typ())) {
			
			MCList<Iv_Chk01_MapDtlR> mapL = ivMapL.createInstance();
			
			for (MCList<Iv_Chk01_MapDtlR> ivMapGrpL :ivMapL.groupList(Iv_Chk01_MapDtlR.$ship_schd_no, Iv_Chk01_MapDtlR.$index)) {
				if (ivMapGrpL.size() > 1) {
					ivMapGrpL.sort(SortType.ASC, Iv_Chk01_MapDtlR.$iv_d_no);
					
					Iv_Chk01_MapDtlR mapR = ivMapGrpL.get(0);
					mapR.trd_unit_qty(ivMapGrpL.sum(Iv_Chk01_MapDtlR.$trd_unit_qty));
					mapR.base_unit_qty(ivMapGrpL.sum(Iv_Chk01_MapDtlR.$base_unit_qty));
					
					mapL.add(mapR);
				}
				else {
					mapL.addAll(ivMapGrpL);
				}
			}
			
			ivMapL.setAll(mapL);
		}
	}
	
	protected MCList<MST_IV_MAP_R> initIvMapL(MCList<Iv_Chk01_MapDtlR> mapL) {
		MCList<MST_IV_MAP_R> ivMapL = MCList.create(MST_IV_MAP_R.class);
		
		setAll(ivMapL, mapL, createMap_MST_IV_MAP_R_Iv_Chk01_MapDtlR());
		
		return ivMapL;
	}
	
	protected void insIvMap(MCList<Iv_Chk01_MapDtlR> ivMap_insL) {
		MCList<MST_IV_MAP_R> insL = initIvMapL(ivMap_insL);
		MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_IV_MAP_R.create("T"));
		
		if(!insL.isEmpty()) {
			dbInsert("MSBEL5730_MST_IV_MAP_I01", insL, insL_bldr);
		}
	}

	protected void updIvMap(MCList<Iv_Chk01_MapDtlR> ivMap_updL) {
		MCList<MST_IV_MAP_R> updL = initIvMapL(ivMap_updL);
		MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(MST_IV_MAP_R.create("T"));
		
		if(!updL.isEmpty()) {
			dbUpdateKey("MSBEL5730_MST_IV_MAP_U01", updL, updL_bldr);
		}
	}

	protected void delIvMap(MCList<Iv_Chk01_MapDtlR> ivMap_delL) {
		MCList<MST_IV_MAP_R> delL = initIvMapL(ivMap_delL);
		MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(MST_IV_MAP_R.create("T"));
		
		if(!delL.isEmpty()) {
			dbDeleteKey("MSBEL5730_MST_IV_MAP_D01", delL, delL_bldr);
		}
	}
	
	protected MST_IV_R initIvR(Iv_Chk01_HdrR up0, MCList<Iv_Chk01_DtlR> up1) {
		MST_IV_R ivR = MST_IV_R.create();
		copy(ivR, up0, createMap_MST_IV_R_Iv_Chk01_HdrR());
		
		setTrdSchdDt(ivR, up0);
		setIvPrntFlg(ivR, up0, up1);
		
		return ivR;
	}
	
	protected MCList<MST_IV_D_R> initIvDL(MCList<Iv_Chk01_DtlR> dL) {
		MCList<MST_IV_D_R> ivDL = MCList.create(MST_IV_D_R.class);
		setAll(ivDL, dL, createMap_MST_IV_D_R_Iv_Chk01_DtlR());
		
		return ivDL;
	}
	
	protected void callIvRegSrvForShipInstUnFix(String ivNo, List<String> shipInstDNoL) {
		
		MSBEL_IvRegService.Iv_Upd02 ope = MSBEL_IvRegService.crtIv_Upd02();
		
		for (String shipInstDNo : shipInstDNoL) {
			
			Iv_Upd02_Ctrl2R upR = Iv_Upd02_Ctrl2R.create();
			upR.ship_inst_d_no(shipInstDNo);
			ope.up1().add(upR);
		}
			
		if (!ope.up1().isEmpty()) {
			ope.up0().iv_reg_flg(true);
			ope.up0().iv_no(ivNo);
			
			ope.exec();
		}
	}
	
	protected void callIvRegSrvForShipInstFix(String ivNo, MCList<Iv_Chk01_DtlR> dtlL, MCList<Iv_Chk01_ShipInstMapDtlR> shipinstMapL) {
		
		MSBEL_IvRegService.Iv_Upd02 ope = MSBEL_IvRegService.crtIv_Upd02();
		
		for(Iv_Chk01_ShipInstMapDtlR mapR : shipinstMapL) {
			
			Iv_Chk01_DtlR dtlR = dtlL.getFirst(Iv_Chk01_DtlR.$index, mapR.index());
			if (dtlR.isStatusDelete()) {
				continue;
			}
			
			Iv_Upd02_Ctrl2R upR = Iv_Upd02_Ctrl2R.create();
			upR.data_crud_typ(dtlR.data_crud_typ());
			upR.iv_d_no(dtlR.iv_d_no());
			upR.ship_inst_d_no(mapR.ship_inst_d_no());
			if (dtlR.bndl_flg()) {
				upR.base_unit_qty(mapR.base_unit_qty());
			}
			else {
				upR.base_unit_qty(dtlR.base_unit_qty());
			}
			upR.fix_flg(true);
			ope.up1().add(upR);
		}
			
		if (!ope.up1().isEmpty()) {
			ope.up0().iv_reg_flg(true);
			ope.up0().iv_no(ivNo);
			ope.exec();
		}
	}
	
	/**
	 * 未確定のインボイス出荷指図マップを削除する。
	 */
	protected void delIvShipInstMapUnFix(MCList<Iv_Chk01_DtlR> dtlL) {
		
		MST_IV_SHIP_INST_MAP_R ivShipInstMap = MST_IV_SHIP_INST_MAP_R.create("T");
		
		MCDelete q = sql("MSBEL5730_MST_IV_SHIP_INST_MAP_D02").delete(ivShipInstMap)
				.where(value(0).eq(value(0))
				.and(ivShipInstMap.iv_d_no.eq(bind("iv_d_no"))
				.and(ivShipInstMap.ship_inst_fix_flg.eq(value(false)))
				.and(ivShipInstMap.fix_flg.eq(value(false)))));
		
		q.executeBatchUpdate(dtlL);
	}
	
	/**
	 * インボイス出荷指図マップを削除する。
	 */
	protected void delIvShipInstMap(MCList<Iv_Chk01_DtlR> dtlL) {
		
		MST_IV_SHIP_INST_MAP_R ivShipInstMap = MST_IV_SHIP_INST_MAP_R.create("T");
		
		MCDelete q = sql("MSBEL5730_MST_IV_SHIP_INST_MAP_D03").delete(ivShipInstMap)
				.where(value(0).eq(value(0))
				.and(ivShipInstMap.iv_d_no.eq(bind("iv_d_no"))));
		
		q.executeBatchUpdate(dtlL);
	}
	
	/**
	 * インボイス出荷実績マップを削除する。
	 */
	protected void delIvShipActMap(MCList<Iv_Chk01_DtlR> dtlL) {
		
		MST_IV_SHIP_ACT_MAP_R ivShipActMap = MST_IV_SHIP_ACT_MAP_R.create("T");
		
		MCDelete q = sql("MSBEL5730_MST_IV_SHIP_ACT_MAP_D03").delete(ivShipActMap)
				.where(value(0).eq(value(0))
				.and(ivShipActMap.iv_d_no.eq(bind("iv_d_no"))));
		
		q.executeBatchUpdate(dtlL);
	}
	
	protected MCList<Iv_Chk01_ShipInstMapDtlR> getIvShipInstMapInsL(MCList<Iv_Chk01_ShipInstMapDtlR> ivMap_insL, MCList<Iv_Chk01_DtlR> ivD_InsL) {
		MCList<Iv_Chk01_ShipInstMapDtlR> mapL = MCList.create(Iv_Chk01_ShipInstMapDtlR.class);

		for(Iv_Chk01_ShipInstMapDtlR mapR : ivMap_insL) {
			for(Iv_Chk01_DtlR dR : ivD_InsL) {
				if(isSame(mapR.index(), dR.index())) {
					mapR.iv_d_no(dR.iv_d_no());
					if(!dR.bndl_flg()) {
						mapR.base_unit_qty(dR.base_unit_qty());
					}
					mapL.add(mapR);
					
					break;
				}
			}
		}
		
		return mapL;
	}
	
	protected MCList<MST_IV_SHIP_INST_MAP_R> initIvShipInstMapL(MCList<Iv_Chk01_ShipInstMapDtlR> mapL) {
		MCList<MST_IV_SHIP_INST_MAP_R> ivMapL = MCList.create(MST_IV_SHIP_INST_MAP_R.class);
		
		setAll(ivMapL, mapL, createMap_MST_IV_SHIP_INST_MAP_R_Iv_Chk01_ShipInstMapDtlR());
		
		return ivMapL;
	}
	
	protected MCList<Iv_Chk01_ShipActMapDtlR> getIvShipActMapInsL(MCList<Iv_Chk01_ShipActMapDtlR> ivMap_insL, MCList<Iv_Chk01_DtlR> ivD_InsL) {
		MCList<Iv_Chk01_ShipActMapDtlR> mapL = MCList.create(Iv_Chk01_ShipActMapDtlR.class);

		for(Iv_Chk01_ShipActMapDtlR mapR : ivMap_insL) {
			for(Iv_Chk01_DtlR dR : ivD_InsL) {
				if(isSame(mapR.index(), dR.index())) {
					mapR.iv_d_no(dR.iv_d_no());
					if(!dR.bndl_flg()) {
						mapR.base_unit_qty(dR.base_unit_qty());
					}
					mapL.add(mapR);
					
					break;
				}
			}
		}
		
		return mapL;
	}
	
	protected MCList<MST_IV_SHIP_ACT_MAP_R> initIvShipActMapL(MCList<Iv_Chk01_ShipActMapDtlR> mapL) {
		MCList<MST_IV_SHIP_ACT_MAP_R> ivMapL = MCList.create(MST_IV_SHIP_ACT_MAP_R.class);
		
		setAll(ivMapL, mapL, createMap_MST_IV_SHIP_ACT_MAP_R_Iv_Chk01_ShipActMapDtlR());
		
		return ivMapL;
	}
	
	/**
	 * 出荷予定更新サービス呼び出し
	 */
	protected void callShipSchdUpd04(MCList<Iv_Chk01_DtlR> up1, MCList<Iv_Chk01_MapDtlR> up2) {
		MSBEL_ShipSchdService.ShipSchd_Upd04 o = MSBEL_ShipSchdService.crtShipSchd_Upd04();
		
		MCList<ShipSchd_Upd04_DtlR> shipL = MCList.create(ShipSchd_Upd04_DtlR.class);
		for(Iv_Chk01_DtlR dR : up1) {
			if(dR.manual_add_flg() || dR.uplnd_flg()) {
				continue;
			}
			
			for(Iv_Chk01_MapDtlR mapR : up2) {
				if(isSame(dR.index(), mapR.index())) {
					ShipSchd_Upd04_DtlR shipR = ShipSchd_Upd04_DtlR.create();
					shipR.ship_pr_no(dR.ship_pr_no());
					shipR.ship_schd_no(mapR.ship_schd_no());
					shipL.add(shipR);
				}
			}
		}
		
		if (!shipL.isEmpty()) {
			o.up0().setAll(shipL);
			o.exec();
		}
	}
	
	/**
	 * 受注状況登録サービス呼び出し
	 */
	protected void callSlsSTsIns01(Iv_Chk01_HdrR up0, MCList<Iv_Chk01_DtlR> up1, String data_crud_typ) {

		MCList<Iv_Chk01_DtlR> dL = up1.subList(Iv_Chk01_DtlR.$manual_add_flg, false);
		//新規登録かつ三国間の場合、行削除した明細を取り除く
		if(MAC_DATA_CRUD_TYP.isCRT(data_crud_typ) && !isNull(up0.rcpt_iv_mng_no())) {
			MCList<Iv_Chk01_DtlR> tmpL = MCList.create(Iv_Chk01_DtlR.class);
			for(Iv_Chk01_DtlR dR : dL) {
				if(!dR.isStatusDelete()) {
					tmpL.add(dR);
				}
			}
			dL = tmpL;
		}
		
		MSBBL_SloStsRegService.SloSts_Ins01 o = MSBBL_SloStsRegService.crtSloSts_Ins01();
		
		MCList<SloSts_DtlR> sloStsDtlL = MCList.create(SloSts_DtlR.class);
		
		for(Iv_Chk01_DtlR dR : dL) {
			if (dR.uplnd_flg()) {
				continue;
			}

			SloSts_DtlR sloStsDtlR = SloSts_DtlR.create();
			
			sloStsDtlR.slo_d_no(dR.slo_d_no());										//受注明細ＮＯ
			sloStsDtlR.iv_no(up0.iv_no());											//インボイスＮＯ
			sloStsDtlR.iv_d_no(dR.iv_d_no());										//インボイス明細ＮＯ

			if(!MAC_DATA_CRUD_TYP.isDEL(data_crud_typ)) {
				if(!dR.isStatusDelete()) {
					if(dR.isStatusCreate()) {
						sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.IV.value());			//受注状況区分：Ｉ／Ｖ登録
					}
					else {
						//三国間以外の場合
						if(isNull(up0.rcpt_iv_mng_no())) {
							sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.IV_UPD.value());			//受注状況区分：Ｉ／Ｖ訂正
						}
						//三国間の場合
						else {
							if(MAC_DATA_CRUD_TYP.isCRT(data_crud_typ)) {
								sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.IV.value());			//受注状況区分：Ｉ／Ｖ登録
							}
							else {
								sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.IV_UPD.value());		//受注状況区分：Ｉ／Ｖ訂正
							}
						}
					}
					sloStsDtlR.unit_cd(dR.trd_unit_cd());							//取引単位ＣＤ
					sloStsDtlR.qty(dR.trd_unit_qty());								//取引単位数量
					sloStsDtlR.cur_cd(up0.trd_cur_cd());							//通貨ＣＤ
					sloStsDtlR.upri(dR.trd_cur_upri());								//単価
					sloStsDtlR.amt(dR.trd_cur_amt());								//金額
					sloStsDtlR.tax_cd(dR.tax_cd());									//税ＣＤ
					sloStsDtlR.tax_amt(dR.trd_cur_tax_amt());						//税額
				}
				else {
					sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.IV_CAN.value());			//受注状況区分：Ｉ／Ｖ取消
				}
			}
			else {
				sloStsDtlR.slo_sts_typ(MSC_SLO_STS_TYP.IV_CAN.value());				//受注状況区分：Ｉ／Ｖ取消
			}

			sloStsDtlL.add(sloStsDtlR);
		}

		o.up0().setAll(sloStsDtlL);

		o.exec();
	}
	
	/**
	 * インボイス出荷指図マップを取得する。
	 * @param dtlL インボイス明細リスト
	 * @return インボイス出荷指図マップ
	 */
	protected MCList<MST_IV_SHIP_INST_MAP_R> getIvShipInstMapL(MCList<Iv_Chk01_DtlR> dtlL) {
		
		MCList<MST_IV_SHIP_INST_MAP_R> ivShipInstMapL = MCList.create(MST_IV_SHIP_INST_MAP_R.class);
		
		MST_IV_SHIP_INST_MAP_R ivShipInstMap = MST_IV_SHIP_INST_MAP_R.create("IVSHIPINSTMAP");
		MCQueryApiBuilder ivShipInstMap_bldr = MCQueryApiBuilder.create(ivShipInstMap);
		ivShipInstMap_bldr.setWhere(ivShipInstMap.iv_d_no.eq(bind(MST_IV_D_R.$iv_d_no)));
		
		dbSelect("MSBEL5730_MST_IV_SHIP_INST_MAP_S01", ivShipInstMapL, ivShipInstMap_bldr, dtlL);
		
		return ivShipInstMapL;
	}
	
	/**
	 * インボイス出荷実績マップを取得する。
	 * @param dtlL インボイス明細リスト
	 * @return インボイス出荷実績マップ
	 */
	protected MCList<MST_IV_SHIP_ACT_MAP_R> getIvShipActMapL(MCList<Iv_Chk01_DtlR> dtlL) {
		
		MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL = MCList.create(MST_IV_SHIP_ACT_MAP_R.class);
		
		MST_IV_SHIP_ACT_MAP_R ivShipActMap = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
		MCQueryApiBuilder ivShipActMap_bldr = MCQueryApiBuilder.create(ivShipActMap);
		ivShipActMap_bldr.setWhere(ivShipActMap.iv_d_no.eq(bind(MST_IV_D_R.$iv_d_no)));
		
		dbSelect("MSBEL5730_MST_IV_SHIP_ACT_MAP_S02", ivShipActMapL, ivShipActMap_bldr, dtlL);
		
		return ivShipActMapL;
	}
	
	/**
	 * 受払実績作成対象外か判定する。
	 * @param ivR インボイスヘッダ
	 * @return 配送経由または売上実績登録画面で貸出売上を登録する際にtrue
	 */
	protected boolean isNoIoActTgt(MST_IV_R ivR) {
		
		Iv_Chk01_HdrR hdrR = Iv_Chk01_HdrR.create();
		hdrR.iv_ship_flg(ivR.iv_ship_flg());
		hdrR.via_dlv_typ(ivR.via_dlv_typ());
		hdrR.trd_ptn_typ(ivR.trd_ptn_typ());
		hdrR.iv_src_typ(ivR.iv_src_typ());
		
		return isNoIoActTgt(hdrR);
	}
	
	/**
	 * 受払実績作成対象外か判定する。
	 * @param hdrR インボイスヘッダ
	 * @return 配送経由または売上実績登録画面で貸出売上を登録する際にtrue
	 */
	protected boolean isNoIoActTgt(Iv_Chk01_HdrR hdrR) {
		// 配送経由または売上実績登録画面で貸出売上を登録する際に、受払実績を作成しない
		return hdrR.iv_ship_flg()
				|| MAC_VIA_DLV_TYP.isVIA(hdrR.via_dlv_typ())
				|| MAC_TRD_PTN_TYP.isSHIP(hdrR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isXFR(hdrR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isXFR_RTN(hdrR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPROV(hdrR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isPROV_RTN(hdrR.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSHIP(hdrR.trd_ptn_typ())
				|| MSC_IV_SRC_TYP.isRCPT_IV(hdrR.iv_src_typ())
				|| (MSC_IV_SRC_TYP.isSLS(hdrR.iv_src_typ())
						&& MAC_TRD_PTN_TYP.isSLS_CNSGN(hdrR.trd_ptn_typ()));
	}
	
	/**
	 * 受払実績サービスの受払実績WK作成を実行する。
	 * @param hdrR インボイスヘッダ
	 * @param ivShipActMapL インボイス出荷実績マップリスト
	 * @param execClSrv 締処理実行フラグ
	 * @param canFlg 取消フラグ
	 */
	protected void callIoActInsSv(MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL, MST_IV_R ivR, boolean execClSrv, boolean canFlg, boolean isIVUpd) {
		
		MSBEL_IoActService.IoAct_Ins01 o = MSBEL_IoActService.crtIoAct_Ins01();
		o.up0().setAll(makeIoUp(ivShipActMapL, ivR, isIVUpd));
		
		if (!o.up0().isEmpty()) {
			
			if (execClSrv) {
				// 在庫締チェックを行う
				callClSrv(o.up0(), canFlg);
			}
			
			o.exec();
		}
	}
	
	/**
	 * 締処理提供サービスを呼び出し、締日チェックを行う。
	 * @param canFlg 取消フラグ
	 */
	protected void callClSrv(MCList<IoAct_Ins01_DtlR> ioL, boolean canFlg) {
		
		MSBIL_ClService.Cl_Chk03 ope = MSBIL_ClService.crtCl_Chk03();
		
		setAll(ope.up0(), ioL, createMap_Cl_Chk03_CndR_IoAct_Ins01_DtlR());
		
		if (!ope.up0().isEmpty())	{
			ope.exec();
			
			if (canFlg) {
				throwCanErr();
			}
			else {
				throwUpdErr();
			}
		}
	}
	
	/**
	 * 受払実績サービスの受払実績WKの上り電文を作成する。
	 * @param hdrR インボイスヘッダ
	 * @param ivShipActMapL インボイス出荷実績マップリスト
	 * @return 受払実績サービスの受払実績WKの上り電文
	 */
	protected MCList<IoAct_Ins01_DtlR> makeIoUp(MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL, MST_IV_R ivR, boolean isIVUpd) {
		
		MCList<MST_SHIP_ACT_D_R> shipActDL = getShipActDtlL(ivShipActMapL);
		MCIndexKey shipActDKey = shipActDL.createIndex(MST_SHIP_ACT_D_R.$ship_act_d_no);
		
		MCList<MST_SHIP_ACT_R> shipActL = getShipActL(shipActDL);
		MCIndexKey shipActKey = shipActL.createIndex(MST_SHIP_ACT_R.$ship_act_no);
		
		MCList<IoAct_Ins01_DtlR> ioActL = MCList.create(IoAct_Ins01_DtlR.class);
		
		if (!isNull(getIvCache()) && isNull(ivShipActMapL.get(0).getDateNE(Iv_Upd03_Ctrl2R.$can_ac_dt)) && !ivShipActMapL.get(0).isStatusCreate()) {
			chkCanAcDt(shipActDL, shipActL, shipActKey);
		}
		for (MST_IV_SHIP_ACT_MAP_R ivShipActMapR : ivShipActMapL) {
			
			MST_SHIP_ACT_D_R shipActDR = shipActDL.getFirst(shipActDKey, ivShipActMapR.ship_act_d_no());
			MST_SHIP_ACT_R shipActR = shipActL.getFirst(shipActKey, shipActDR.ship_act_no());
			
			if (ivShipActMapR.isStatusDelete()) {
				ioActL.add(makeIoUpDel(shipActR, shipActDR, ivShipActMapR, ivR, isIVUpd));
			}
			else {
				ioActL.add(makeIoUpInsUpd(shipActR, shipActDR, ivShipActMapR, ivR, isIVUpd));
			}
		}
		
		return ioActL;
	}
	
	protected final String _pegNoCol = "peg_no";
	protected final String _isDtCloseCol = "is_iv_dt_close";
	
	/**
	 * 締処理提供サービスを呼び出し、インボイスヘッダのキャシューのIV日付、出荷実績の計上日は取消計上日として使用できるかどうかをチェック。
	 * インボイス登録画面から呼ばれる場合だけ実行する想定
	 * @param shipActDL 出荷実績明細
	 */
	protected void chkCanAcDt(MCList<MST_SHIP_ACT_D_R> shipActDL, MCList<MST_SHIP_ACT_R> shipActL, MCIndexKey shipActKey) {
		MSBIL_ClService.Cl_Chk03 ope = MSBIL_ClService.crtCl_Chk03();
		shipActDL.addNumberColumn(_pegNoCol);
		setPegNo(_pegNoCol, shipActDL);
		shipActDL.addBooleanColumn(_isDtCloseCol, false);
		
		for(MST_SHIP_ACT_D_R shipActDR : shipActDL) {
			MST_SHIP_ACT_R shipActR = shipActL.getFirst(shipActKey, shipActDR.ship_act_no());
			
			Cl_Chk03_CndR cndR = Cl_Chk03_CndR.create();
			cndR.stk_cls_chk_flg(true);
			if (!isNull(getIvCache().iv_dt()) && getIvCache().iv_dt().gt(shipActR.ac_dt())) {
				cndR.can_ac_dt(getIvCache().iv_dt());
			}
			else {
				cndR.can_ac_dt(shipActR.ac_dt());
			}
			cndR.itm_cd(shipActDR.itm_cd());
			cndR.itm_sub1(shipActDR.itm_sub1());
			cndR.itm_sub2(shipActDR.itm_sub2());
			cndR.itm_sub3(shipActDR.itm_sub3());
			cndR.peg_no(shipActDR.getNumberNE(_pegNoCol));
			cndR.loc_cd(shipActDR.ship_loc_cd());
			ope.up0().add(cndR);
		}
		
		ope.up1().no_msg_flg(true);
		
		if (!ope.up0().isEmpty()) {
			ope.exec();
			String[] destCols = new String[] {_isDtCloseCol};
			String[] srcCols = new String[] {Cl_Chk03_CndR.$err_flg};
			copyByPegNo(shipActDL, destCols, ope.down0(), srcCols);
		}
	}
	
	protected IoAct_Ins01_DtlR makeIoUpInsUpd(MST_SHIP_ACT_R shipActR, MST_SHIP_ACT_D_R shipActDR, MST_IV_SHIP_ACT_MAP_R ivShipActMapR, MST_IV_R ivR, boolean isIVUpd) {
		
		IoAct_Ins01_DtlR ioActR = IoAct_Ins01_DtlR.create();
		
		ioActR.act_d_no(shipActDR.ship_act_d_no());
		ioActR.trd_cd(shipActDR.trd_cd());
		ioActR.trd_ptn_typ(shipActDR.trd_ptn_typ());
		ioActR.itm_cd(shipActDR.itm_cd());
		ioActR.itm_sub1(shipActDR.itm_sub1());
		ioActR.itm_sub2(shipActDR.itm_sub2());
		ioActR.itm_sub3(shipActDR.itm_sub3());
		ioActR.itm_nm(shipActDR.itm_nm());
		ioActR.stk_mng_typ(shipActDR.stk_mng_typ());
		ioActR.sno1_mng_typ(shipActDR.sno1_mng_typ());
		ioActR.sno2_mng_typ(shipActDR.sno2_mng_typ());
		ioActR.sno3_mng_typ(shipActDR.sno3_mng_typ());
		ioActR.sno4_mng_typ(shipActDR.sno4_mng_typ());
		ioActR.sundry_itm_flg(shipActDR.sundry_itm_flg());
		ioActR.gi_loc_cd(shipActDR.ship_loc_cd());
		ioActR.gi_str_ln_cd(shipActDR.ship_str_ln_cd());
		ioActR.stk_arrv_bp_cd(shipActDR.stk_arrv_bp_cd());
		ioActR.lot_no(shipActDR.lot_no());
		ioActR.sublot_no(shipActDR.sublot_no());
		ioActR.sno1(shipActDR.sno1());
		ioActR.sno2(shipActDR.sno2());
		ioActR.sno3(shipActDR.sno3());
		ioActR.sno4(shipActDR.sno4());
		ioActR.gi_gd_cd(shipActDR.gd_cd());
		ioActR.gr_gd_cd(shipActDR.gd_cd());
		ioActR.quality_typ(shipActDR.quality_typ());
		ioActR.stk_id_typ(shipActDR.stk_id_typ());
		ioActR.stk_bp_cd(shipActDR.stk_bp_cd());
		ioActR.base_unit_cd(shipActDR.base_unit_cd());
		ioActR.base_unit_qty(ivShipActMapR.base_unit_qty());
		convTrdUnitQty(ioActR, shipActDR);
		ioActR.cst_itm_cd(shipActDR.cst_itm_cd());
		ioActR.cst_itm_nm(shipActDR.cst_itm_nm());
		ioActR.trd_rmrks(shipActDR.trd_rmrks());
		ioActR.trd_d_rmrks(shipActDR.trd_d_rmrks());
		ioActR.rsn_cd(shipActDR.rsn_cd());
		ioActR.data_crud_typ(getDataCrudTyp(ivShipActMapR));
		if (!isNull(ivR.iv_dt()) && ivR.iv_dt().gt(shipActR.ac_dt())) {
			ioActR.ac_dt(ivR.iv_dt());
		}
		else {
			ioActR.ac_dt(shipActR.ac_dt());
		}
		setCanAcDt(ioActR, shipActR, shipActDR, ivShipActMapR, ivR, isIVUpd);

		ioActR.act_tm(shipActR.ship_tm());
		ioActR.act_no(ivR.iv_no());
		ioActR.act_seq(null);
		ioActR.act_rev_no(ivR.iv_rev());
		ioActR.un_fix_flg(false);
		ioActR.trn_typ(MSC_TRN_TYP.IV.value());

		ioActR.gi_wg_cd(shipActDR.getStringNE("ship_loc_cd_wg_cd"));
		if (MAC_TRD_PTN_TYP.isSLS(shipActDR.trd_ptn_typ())) {
			ioActR.fix_no_typ(MSC_FIX_NO_TYP.DLV_SLIP_NO.value());
			ioActR.fix_no(shipActDR.dlv_slip_no());
		}
		ioActR.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
		ioActR.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
		if (!shipActR.uplnd_flg() && isSlsOrShip(shipActDR)) {
			ioActR.slo_no(shipActDR.getStringNE("slo_no"));
		}
		ioActR.iv_no(ivR.iv_no());
		// 得意先・納品先
		if (isSlsOrShip(shipActDR)) {
			ioActR.cst_cd(shipActR.cst_cd());
			ioActR.dlv_cd(shipActDR.dlv_id_cd());
		}
		ioActR.via_dlv_typ(shipActR.via_dlv_typ());
		ioActR.no_gi_alloc_flg(true);
		
		return ioActR;
	}
	
	protected void setCanAcDt(IoAct_Ins01_DtlR ioActR, MST_SHIP_ACT_R shipActR, MST_SHIP_ACT_D_R shipActDR, MST_IV_SHIP_ACT_MAP_R ivShipActMapR, MST_IV_R ivR, boolean isIVUpd) {
		if (ivShipActMapR.isStatusCreate()) {
			return;
		}
		MST_IV_R ivCacheR = getIvCache();
		//インボイス登録画面からの場合
		if (isNull(ivShipActMapR.getDateNE(Iv_Upd03_Ctrl2R.$can_ac_dt))) {
			if (!isNull(ivCacheR) && !isNull(ivCacheR.iv_dt()) && ivCacheR.iv_dt().gt(shipActR.ac_dt())) {
				if (shipActDR.getBooleanNE(_isDtCloseCol)) {
					if(isIVUpd) {
						ioActR.can_ac_dt(ivR.iv_dt());
					}
					else {
						ioActR.can_ac_dt(getToday());
					}
				}
				else {
					ioActR.can_ac_dt(ivCacheR.iv_dt());
				}
			}
			else {
				if (shipActDR.getBooleanNE(_isDtCloseCol)) {
					if(isIVUpd) {
						ioActR.can_ac_dt(ivR.iv_dt());
					}
					else {
						ioActR.can_ac_dt(getToday());
					}
				}
				else {
					ioActR.can_ac_dt(shipActR.ac_dt());
				}
			}
		}
		//出荷実績サービス、売上実績登録画面からの場合
		else {
			ioActR.can_ac_dt(ivShipActMapR.getDateNE(Iv_Upd03_Ctrl2R.$can_ac_dt));
		}
	}
	protected String getDataCrudTyp(MST_IV_SHIP_ACT_MAP_R mapR) {
		String dataCrudTyp = null;
		
		if (mapR.isStatusCreate()) {
			dataCrudTyp = MAC_DATA_CRUD_TYP.CRT.value();
		}
		else if (mapR.isStatusModify()) {
			dataCrudTyp = MAC_DATA_CRUD_TYP.UPD.value();
		}
		else if (mapR.isStatusDelete()) {
			dataCrudTyp = MAC_DATA_CRUD_TYP.DEL.value();
		}
		
		return dataCrudTyp;
	}
	
	protected void convTrdUnitQty(IoAct_Ins01_DtlR ioActR, MST_SHIP_ACT_D_R shipActDR) {
		
		if(isSame(shipActDR.trd_unit_cd(), shipActDR.base_unit_cd())) {
			ioActR.trd_unit_qty(ioActR.base_unit_qty());
			ioActR.trd_unit_cd(ioActR.base_unit_cd());
		}
		else {
			MCNumber trdUnitQty = rvrsBaseUnitConv(
				ioActR.base_unit_qty(),
				shipActDR.getNumberNE("trd_unit_conv_base_qty"),
				shipActDR.getNumberNE("trd_unit_conv_qty"),
				shipActDR.getNumberNE("trd_unit_dec_place"),
				shipActDR.getStringNE("trd_unit_rnd_typ"),
				true);
			
			if (isNull(trdUnitQty)){
				ioActR.trd_unit_qty(ioActR.base_unit_qty());
				ioActR.trd_unit_cd(ioActR.base_unit_cd());
			}
			else{
				ioActR.trd_unit_qty(trdUnitQty);
				ioActR.trd_unit_cd(shipActDR.trd_unit_cd());
			}
		}
		
		if(isSame(shipActDR.pack_unit_cd(), shipActDR.base_unit_cd())) {
			ioActR.pack_unit_qty(ioActR.base_unit_qty());
			ioActR.pack_unit_cd(ioActR.base_unit_cd());
		}
		else {
			MCNumber packUnitQty = rvrsBaseUnitConv(
				ioActR.base_unit_qty(),
				shipActDR.getNumberNE("pack_unit_conv_base_qty"),
				shipActDR.getNumberNE("pack_unit_conv_qty"),
				shipActDR.getNumberNE("pack_unit_dec_place"),
				shipActDR.getStringNE("pack_unit_rnd_typ"),
				true);
			
			if (isNull(packUnitQty)){
				ioActR.pack_unit_qty(ioActR.base_unit_qty());
				ioActR.pack_unit_cd(ioActR.base_unit_cd());
			}
			else{
				ioActR.pack_unit_qty(packUnitQty);
				ioActR.pack_unit_cd(shipActDR.pack_unit_cd());
			}
		}
	}
	
	protected IoAct_Ins01_DtlR makeIoUpDel(MST_SHIP_ACT_R shipActR, MST_SHIP_ACT_D_R shipActDR, MST_IV_SHIP_ACT_MAP_R ivShipActMapR, MST_IV_R ivR, boolean isIVUpd) {
		
		IoAct_Ins01_DtlR ioActR = IoAct_Ins01_DtlR.create();
		
		ioActR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
		ioActR.act_no(ivR.iv_no());
		ioActR.act_d_no(shipActDR.ship_act_d_no());
		setCanAcDt(ioActR, shipActR, shipActDR, ivShipActMapR, ivR, isIVUpd);
		ioActR.trn_typ(MSC_TRN_TYP.IV.value());
		
		return ioActR;
	}
	
	protected MCList<MST_SHIP_ACT_R> getShipActL(MCList<MST_SHIP_ACT_D_R> shipActDL) {
		
		crtShipActWk(shipActDL.distinctNE(MST_SHIP_ACT_D_R.$ship_act_no).getStringNE(MST_SHIP_ACT_D_R.$ship_act_no));
		
		MCList<MST_SHIP_ACT_R> shipActL = MCList.create(MST_SHIP_ACT_R.class);
		MST_SHIP_ACT_R shipAct = MST_SHIP_ACT_R.create("SHIPACTD");
		MCQueryApiBuilder shipActL_bldr = MCQueryApiBuilder.create(shipAct);
		MSW_SHIP_ACT_KEY_R shipActWK = MSW_SHIP_ACT_KEY_R.create("SHIPACTWK");
		
		shipActL_bldr.setSelectAll();
		shipActL_bldr.addInnerJoin(shipActWK, bracket(shipAct.ship_act_no.eq(shipActWK.ship_act_no)));
		dbSelect("MSBEL5730_MST_SHIP_ACT_S02", shipActL, shipActL_bldr);
		
		return shipActL;
	}
	
	protected MCList<MST_SHIP_ACT_D_R> getShipActDtlL(MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL) {
		
		crtShipActDWk(ivShipActMapL.distinctNE(Iv_Chk01_ShipActMapDtlR.$ship_act_d_no).getStringNE(Iv_Chk01_ShipActMapDtlR.$ship_act_d_no));
		
		MCList<MST_SHIP_ACT_D_R> shipActDL = MCList.create(MST_SHIP_ACT_D_R.class);
		
		executeQuery(shipActDL, MSBEL5730_MST_SHIP_ACT_D_S03());
		
		return shipActDL;
	}

	/**
	 * 取引パタンが「売上」「出荷」か判定する
	 */
	protected boolean isSlsOrShip(MST_SHIP_ACT_D_R shipActDR) {
			return MAC_TRD_PTN_TYP.isSLS(shipActDR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(shipActDR.trd_ptn_typ());
	}
	
	/**
	 * 取引パタンが「移動・移送」「移動・移送返品」「支給」「支給返品」のいずれかか判定する
	 */
	protected boolean isXfrOrProv(MST_SHIP_ACT_D_R shipActDR) {
			return MAC_TRD_PTN_TYP.isXFR(shipActDR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isXFR_RTN(shipActDR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV(shipActDR.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(shipActDR.trd_ptn_typ());
	}
	
	/**
	 * 受払実績サービスの受払実績作成を実行する。
	 */
	protected void callIoActUpdSv(Iv_Chk01_HdrR hdrR) {
		
		if (MSC_IV_SRC_TYP.isSLS(hdrR.iv_src_typ()) 
				|| isNoIoActTgt(hdrR)) {
			// 計画外インボイス取引売上の場合、受払実績を反映しない
			return;
		}
		
		MSBEL_IoActService.IoAct_Upd01 o = MSBEL_IoActService.crtIoAct_Upd01();
		o.exec();
	}
	
	/**
	 * 引数に指定されたインボイス出荷実績マップに紐づくインボイス明細を取得する。
	 * @param ivShipActMapL インボイス出荷実績マップリスト
	 * @return インボイス明細リスト
	 */
	protected MCList<MST_IV_D_R> getIvDL(MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL ) {
		MCList<MST_IV_D_R> ivDL = MCList.create(MST_IV_D_R.class);
		ivDL.addStringColumn(MST_IV_R.$trd_ptn_typ);
		ivDL.addBooleanColumn(MST_SLO_D_R.$sls_cststk_flg);
		ivDL.addBooleanColumn(MST_SLO_D_R.$vmi_flg);
		ivDL.addBooleanColumn(MST_SHIP_PR_R.$purc_ddlv_flg);
		
		MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
		MST_IV_R iv = MST_IV_R.create("IV");
		MST_SLO_D_R sloD = MST_SLO_D_R.create("SLOD");
		MST_SHIP_PR_R shipPr = MST_SHIP_PR_R.create("SHIPPR");
		MCQueryApiBuilder ivDL_bldr = MCQueryApiBuilder.create(ivD);
		ivDL_bldr.addSelect(iv.trd_ptn_typ);
		ivDL_bldr.addSelect(sloD.sls_cststk_flg, sloD.vmi_flg);
		ivDL_bldr.addSelect(shipPr.purc_ddlv_flg);
		ivDL_bldr.addInnerJoin(iv, ivD.iv_mng_no.eq(iv.iv_mng_no));
		ivDL_bldr.addLeftOuterJoin(sloD, ivD.slo_d_no.eq(sloD.slo_d_no));
		ivDL_bldr.addLeftOuterJoin(shipPr, sloD.slo_d_no.eq(shipPr.slo_d_no));
		dbSelectKey("MSBBL6020_MST_IV_D_S02", ivDL, ivDL_bldr, ivShipActMapL);
		
		return ivDL;
	}
	
	/**
	 * 与信サービスを実行する。
	 * @param credL  与信サービスの上り電文
	 */
	protected void callCredSvUpd01(MCList<Cred_Upd01_CndR> credL) {
		
		if (!credL.isEmpty()) {
			MSBGL_CredService.Cred_Upd01 ope = MSBGL_CredService.crtCred_Upd01();
			
			String[] grpCols = new String[] {
					Cred_Upd01_CndR.$cst_cd, Cred_Upd01_CndR.$cur_cd,
					Cred_Upd01_CndR.$trd_ptn_typ
			};
			
			String[] sumCols = new String[] {
					Cred_Upd01_CndR.$amt
			};
			MCGroupByPolicy gp = new MCGroupByPolicy(grpCols);
			gp.sum(sumCols);
			
			MCList<Cred_Upd01_CndR> grpCredL = credL.groupBy(gp);
			
			grpCredL.forEach(r->{
				if(r.amt().isPositive()) {
					r.cred_upd_typ(MSC_CRED_UPD_TYP.UPD_CHK.value());
				}
				else {
					r.cred_upd_typ(MSC_CRED_UPD_TYP.UPD.value());
				}
			});
			
			ope.up0().addAll(grpCredL);
			ope.exec();
			
			if (!ope.down1().isEmpty()) {
				Cred_Upd01_ErrR errR = ope.down1().get(0);
				MCMessage msg = new MCMessage(MSBBL0124, errR.cred_cd(), errR.cur_cd(), errR.cred_amt(), errR.cred_limit());
				throw new MCAppException(msg);
			}
		}
	}
	
	/**
	 * インボイス明細に紐づく受注明細を取得する。
	 * @param dtlL インボイス明細リスト
	 * @return 受注明細リスト
	 */
	protected MCList<MST_SLO_D_R> getSloDL(MCList<Iv_Chk01_DtlR> dtlL) {
		
		MCList<MST_SLO_D_R> sloDL = MCList.create(MST_SLO_D_R.class);
		MST_SLO_D_R sloD = MST_SLO_D_R.create("SLOD");
		MCQueryApiBuilder sloD_bldr = MCQueryApiBuilder.create(sloD);
		dbSelectKey("MSBEL5730_MST_SLO_D_S01", sloDL, sloD_bldr, dtlL);
		
		return sloDL;
	}
	
	/**
	 * インボイス明細に紐づく納品伝票明細を取得する。
	 * @param dtlL インボイス明細リスト
	 * @return 納品伝票明細リスト
	 */
	protected MCList<MST_DLV_SLIP_D_R> getDlvSlipDL(MCList<Iv_Chk01_DtlR> dtlL) {
		
		MCList<MST_DLV_SLIP_D_R> dlvSlipDL = MCList.create(MST_DLV_SLIP_D_R.class);
		dlvSlipDL.addStringColumn(MST_DLV_SLIP_R.$trd_cur_cd);
		dlvSlipDL.addNumberColumn(MAM_CUR_R.$amt_dec_place);
		dlvSlipDL.addStringColumn(MAM_BP_R.$sls_amt_rnd_typ);
		
		MST_DLV_SLIP_D_R dlvSlipD = MST_DLV_SLIP_D_R.create("DLVSLIPD");
		MST_DLV_SLIP_R dlvSlip = MST_DLV_SLIP_R.create("DLVSLIP");
		MAM_CUR_R trdCur = MAM_CUR_R.create("CUR");
		MAM_BP_R cst = MAM_BP_R.create("CST");
		
		MCQueryApiBuilder dlvSlipD_bldr = MCQueryApiBuilder.create(dlvSlipD);
		dlvSlipD_bldr.addSelect(dlvSlip.trd_cur_cd);
		dlvSlipD_bldr.addSelect(trdCur.amt_dec_place);
		dlvSlipD_bldr.addSelect(cst.sls_amt_rnd_typ);
		
		dlvSlipD_bldr.addInnerJoin(dlvSlip, dlvSlipD.dlv_slip_no.eq(dlvSlip.dlv_slip_no).and(dlvSlipD.dlv_slip_seq.eq(dlvSlip.dlv_slip_seq)));
		dlvSlipD_bldr.addInnerJoin(trdCur, dlvSlip.trd_cur_cd.eq(trdCur.cur_cd));
		dlvSlipD_bldr.addInnerJoin(cst, dlvSlip.bp_cd.eq(cst.bp_cd));
		
		dlvSlipD_bldr.setWhere(dlvSlipD.dlv_slip_d_no.eq(bind("dlv_slip_d_no")));
		dlvSlipD_bldr.addWhereWithAnd(dlvSlip.slip_sts_typ.eq(bind("1")), MAC_SLIP_STS_TYP.CRT.value());
		
		dbSelect("MSBEL5730_MST_DLV_SLIP_D_S01", dlvSlipDL, dlvSlipD_bldr, dtlL);
		
		return dlvSlipDL;
	}
	
	/**
	 * 出荷実績のワークテーブルを作成する。
	 * @param shipActDNoL 出荷実績NOリスト
	 */
	protected void crtShipActWk(List<String> shipActNoL) {
		
		MCList<MST_SHIP_ACT_R> lst = MCList.create(MST_SHIP_ACT_R.class);
		MST_SHIP_ACT_R r = null;
		
		for (String shipActNo : shipActNoL) {
			
			r = MST_SHIP_ACT_R.create();
			r.ship_act_no(shipActNo);
			
			lst.add(r);
		}

		MCQueryApiBuilder shipAct_bldr = MCQueryApiBuilder.create(MST_SHIP_ACT_R.create("T"));
		dbWkDelete("MSBEL5730_MSW_SHIP_ACT_D01", shipAct_bldr.getBaseDbc());
		dbWkInsert("MSBEL5730_MSW_SHIP_ACT_I01", lst, shipAct_bldr.getBaseDbc());
	}
	
	/**
	 * 印刷処理を実行する
	 */
	protected void callPrnt03(Iv_Chk01_HdrR up0) {
		if(up0.iv_immed_prnt_flg()){
			MSBEL_ExRptService.ExRpt_Prnt03  prnt03 = MSBEL_ExRptService.crtExRpt_Prnt03();
			copy(prnt03.up0(), up0, createMap_ExRpt_Prnt01_CndR_Iv_Chk01_HdrR());
			prnt03.exec();
		}
	}
	
	/**
	 * 売上予定サービス（仕入直送）実行呼び出し
	 */
	protected void callSlsSchdUpd04(Iv_Chk01_HdrR up0, MCList<Iv_Chk01_DtlR> up1, String data_crud_typ) {
		MSBBL_SlsSchdService.Sls_Schd_Upd04 o = MSBBL_SlsSchdService.crtSls_Schd_Upd04();
		
		MCList<Sls_Schd_Upd04_DtlR> slsDtlL = MCList.create(Sls_Schd_Upd04_DtlR.class);
		
		for(Iv_Chk01_DtlR dR : up1) {
			
			Sls_Schd_Upd04_DtlR slsDtlR = Sls_Schd_Upd04_DtlR.create();
			
			copy(slsDtlR, dR, createMap_Sls_Schd_Upd04_DtlR_Iv_Chk01_DtlR());
			slsDtlR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.IV_D.value()); //売上予定作成元区分：インボイス明細
			
			if(MAC_DATA_CRUD_TYP.isCRT(data_crud_typ)) { //三国間の場合、新規登録の場合でもStatusがUPDのため
				slsDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value()); //データ更新区分 ：1:新規
				slsDtlR.sls_schd_dt(up0.sls_schd_dt()); //売上予定日
			}
			else if(MAC_DATA_CRUD_TYP.isUPD(data_crud_typ)) {
				if(dR.isStatusCreate()) {
					slsDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value()); //データ更新区分 ：1:新規
					slsDtlR.sls_schd_dt(up0.sls_schd_dt()); //売上予定日
				}
				else if(dR.isStatusModify() || dR.isStatusNone()) {
					slsDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value()); //データ更新区分 ：2:更新
					slsDtlR.sls_schd_dt(up0.sls_schd_dt()); //売上予定日
				}
				else if(dR.isStatusDelete()) {
					slsDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value()); //データ更新区分 ：3:削除
				}
			}
			else {
				slsDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value()); //データ更新区分 ：3:削除
			}
			
			slsDtlL.add(slsDtlR);
		}
		
		o.up0().setAll(slsDtlL);

		o.exec();
	}
	
	/**
	 * 売上予定サービス（仕入直送以外）実行呼び出し
	 */
	protected void callSlsSchdUpd05(Iv_Chk01_HdrR up0, MCList<Iv_Chk01_DtlR> up1, String data_crud_typ) {
		MSBBL_SlsSchdService.Sls_Schd_Upd05 o = MSBBL_SlsSchdService.crtSls_Schd_Upd05();
		
		MCList<Sls_Schd_Upd05_DtlR> slsDtlL = MCList.create(Sls_Schd_Upd05_DtlR.class);
		
		for(Iv_Chk01_DtlR dR : up1) {
			if (!dR.manual_add_flg() 
					&& MSC_IV_SRC_TYP.isSLS(up0.iv_src_typ()) 
					&& (dR.isStatusDelete() || MAC_DATA_CRUD_TYP.isDEL(data_crud_typ))) {
				// 計画外インボイス取引売上の場合、出荷実績サービスから売上予定を削除する。インボイス登録サービスから削除不要
				continue;
			}
			
			Sls_Schd_Upd05_DtlR slsDtlR = Sls_Schd_Upd05_DtlR.create();
			
			copy(slsDtlR, dR, createMap_Sls_Schd_Upd05_DtlR_Iv_Chk01_DtlR());
			slsDtlR.sls_schd_src_typ(MSC_SLS_SCHD_SRC_TYP.IV_D.value()); //売上予定作成元区分：インボイス明細
			
			if(MAC_DATA_CRUD_TYP.isCRT(data_crud_typ)) {
				slsDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value()); //データ更新区分 ：1:新規
			}
			else if(MAC_DATA_CRUD_TYP.isUPD(data_crud_typ)) {
				if(dR.isStatusCreate()) {
					slsDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value()); //データ更新区分 ：1:新規
				}
				else if(dR.isStatusModify() || dR.isStatusNone()) {
					slsDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value()); //データ更新区分 ：2:更新
				}
				else if(dR.isStatusDelete()) {
					slsDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value()); //データ更新区分 ：3:削除
				}
			}
			else {
				slsDtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value()); //データ更新区分 ：3:削除
			}
			
			slsDtlR.sls_schd_dt(up0.sls_schd_dt()); //売上予定日
			slsDtlR.iv_no(up0.iv_no());

			slsDtlL.add(slsDtlR);
		}
		
		o.up0().setAll(slsDtlL);

		o.exec();
	}
	
	protected void setIvRev(MST_IV_R ivR, MCList<MST_IV_D_R> updL, MCList<MST_IV_D_R> delL, MCList<MST_IV_D_R> insL, MCList<MST_IV_D_R> noneL) {
		MST_IV_R latestIvR = getIvCache();
		if (latestIvR.iv_prnt_flg() && isIvRptChanged(ivR, updL, delL, insL, noneL)) {
			ivR.iv_rev(latestIvR.iv_rev().add(1));
			ivR.iv_prnt_flg(false);
		}
		else if (latestIvR.pre_rcpt_iv_flg()) {
			ivR.iv_rev(1);
			ivR.iv_prnt_flg(false);
		}
		else {
			ivR.iv_rev(latestIvR.iv_rev());
			ivR.iv_prnt_flg(latestIvR.iv_prnt_flg());
		}
		
		if (!updL.isEmpty()) {
			updL.setValueNE(MST_IV_D_R.$iv_rev, ivR.iv_rev());
		}
		if (!delL.isEmpty()) {
			delL.setValueNE(MST_IV_D_R.$iv_rev, ivR.iv_rev());
		}
		if (!insL.isEmpty()) {
			insL.setValueNE(MST_IV_D_R.$iv_rev, ivR.iv_rev());
		}
		if (!noneL.isEmpty()) {
			noneL.setValueNE(MST_IV_D_R.$iv_rev, ivR.iv_rev());
		}
	}
	
	protected boolean isIvRptChanged(MST_IV_R ivR, MCList<MST_IV_D_R> updL, MCList<MST_IV_D_R> delL, MCList<MST_IV_D_R> insL, MCList<MST_IV_D_R> noneL) {
		
		if (!delL.isEmpty() || !insL.isEmpty()) {
			return true;
		}
		else {
			MST_IV_R latestIvR = getIvCache();
			if (!isColSame(latestIvR, ivR, getIvRptChkCols())) {
				return true;
			}
			else {
				MCList<MST_IV_D_R> chkL = MCList.create(MST_IV_D_R.class);
				chkL.addAll(updL);
				chkL.addAll(noneL);
				
				for (MST_IV_D_R ivDR : chkL) {
					MST_IV_D_R latestIvDR = getFirstIvDCache(ivDR.iv_d_no());
					if (!isColSame(latestIvDR, ivDR, getIvDRptChkCols())) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
	protected void setInterimMsg(Iv_Chk01_HdrR up0, MCList<Iv_Chk01_DtlR> up1) {
		MCIndexKey key = up1.createIndex(Iv_Chk01_DtlR.$err_flg);
		if (!up1.contains(key, true)) {
			for (Iv_Chk01_DtlR dtlR : up1) {
				if (dtlR.interim_flg() && !MSC_IV_SRC_TYP.isSLS(up0.iv_src_typ()) && !dtlR.isStatusDelete()) {
					MCMessagePool.add(new MCMessage(dtlR, null, MSBEL1133, toDispGUIIndex(dtlR)));
				}
			}
		}
	}
	
	protected String[] getIvRptChkCols() {
		return new String[] {
			MST_IV_R.$iv_no,
			MST_IV_R.$iv_dt,
			MST_IV_R.$ship_rqst_id_cd,
			MST_IV_R.$dlv_id_typ,
			MST_IV_R.$dlv_id_cd,
			MST_IV_R.$dlv_id_nm,
			MST_IV_R.$dlv_addr1,
			MST_IV_R.$dlv_addr2,
			MST_IV_R.$dlv_addr3,
			MST_IV_R.$dlv_addr4,
			MST_IV_R.$dlv_cntry_cd,
			MST_IV_R.$trnspt_cd,
			MST_IV_R.$vssl_flght,
			MST_IV_R.$etd_dt,
			MST_IV_R.$load_port_cd,
			MST_IV_R.$dschrg_port_cd,
			MST_IV_R.$via_port_cd,
			MST_IV_R.$tterm_cd3,
			MST_IV_R.$tterm_rmrks3,
			MST_IV_R.$lc_no,
			MST_IV_R.$lc_dt,
			MST_IV_R.$lc_rmrks,
			MST_IV_R.$bl_no,
			MST_IV_R.$bl_dt,
			MST_IV_R.$bl_rmrks,
			MST_IV_R.$case_mrk1,
			MST_IV_R.$case_mrk2,
			MST_IV_R.$case_mrk3,
			MST_IV_R.$case_mrk4,
			MST_IV_R.$case_mrk5,
			MST_IV_R.$case_mrk6,
			MST_IV_R.$iv_rmrks,
			MST_IV_R.$sub_char1,
			MST_IV_R.$sub_char2,
			MST_IV_R.$sub_char3,
			MST_IV_R.$trd_cur_cd,
			MST_IV_R.$ptax_cur_cd,
			MST_IV_R.$tterm_cd1,
			MST_IV_R.$tterm_cd2
		};
	}
	
	protected String[] getIvDRptChkCols() {
		return new String[] {
			MST_IV_D_R.$cst_po_no,
			MST_IV_D_R.$cst_po_d_no,
			MST_IV_D_R.$itm_cd,
			MST_IV_D_R.$itm_sub1,
			MST_IV_D_R.$itm_sub2,
			MST_IV_D_R.$itm_sub3,
			MST_IV_D_R.$cntry_org_cd,
			MST_IV_D_R.$trd_unit_qty,
			MST_IV_D_R.$trd_unit_cd,
			MST_IV_D_R.$base_unit_qty,
			MST_IV_D_R.$base_unit_cd,
			MST_IV_D_R.$trd_cur_upri,
			MST_IV_D_R.$trd_cur_amt,
			MST_IV_D_R.$ptax_cur_amt,
			MST_IV_D_R.$wtax_rate,
			MST_IV_D_R.$wtax_amt,
			MST_IV_D_R.$iv_itm_nm,
			MST_IV_D_R.$cst_itm_cd,
			MST_IV_D_R.$cst_itm_nm,
			MST_IV_D_R.$iv_upri,
			MST_IV_D_R.$iv_amt,
			MST_IV_D_R.$disp_seq,
			MST_IV_D_R.$sub_char1,
			MST_IV_D_R.$sub_char2,
			MST_IV_D_R.$sub_char3,
		};
	}
	
	protected MCList<MAM_ITM_LG_GRP_R> getItmLgGrpLocL(MCList<Iv_Chk01_DtlR> dtlL) {
		MCList<Iv_Chk01_DtlR> tmp = dtlL.groupBy(Iv_Chk01_DtlR.$itm_cd, Iv_Chk01_DtlR.$itm_sub1, Iv_Chk01_DtlR.$itm_sub2, Iv_Chk01_DtlR.$itm_sub3, Iv_Chk01_DtlR.$ship_fr_lg_grp_cd);		
		MCList<MAM_ITM_LG_GRP_R> dbcL = MCList.create(MAM_ITM_LG_GRP_R.class);
		MAM_ITM_LG_GRP_R t = MAM_ITM_LG_GRP_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelectAll();
		dbcL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
		dbcL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
		dbcL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
		dbcL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
		dbcL_bldr.addWhereWithAnd(t.lg_grp_cd.eq(bind("ship_fr_lg_grp_cd")));
		dbSelect("MSBEL5730_MAM_ITM_LG_GRP_S01", dbcL, dbcL_bldr, tmp);
			
		return dbcL;
	}
		
	protected MCList<MAM_LOC_R> getLocL(MCList<Iv_Chk01_DtlR> dtlL) {
		MCList<Iv_Chk01_DtlR> tmp = dtlL.groupBy(Iv_Chk01_DtlR.$ship_fr_lg_grp_cd);
		MCList<MAM_LOC_R> dbcL = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
		dbcL_bldr.setSelect(t.lg_grp_cd);
		dbcL_bldr.addSelect(t.loc_cd);
		dbcL_bldr.setWhere(t.lg_grp_cd.eq(bind("ship_fr_lg_grp_cd")));
		dbcL_bldr.addWhereWithAnd(t.lg_def_flg.eq(value(true)));
		dbSelect("MSBEL5730_MAM_LOC_S01", dbcL, dbcL_bldr, tmp);
			
		return dbcL;
	}
	
	protected Map_ExRpt_Prnt01_CndR_Iv_Chk01_HdrR<ExRpt_Prnt01_CndR,Iv_Chk01_HdrR> createMap_ExRpt_Prnt01_CndR_Iv_Chk01_HdrR() {
		return new Map_ExRpt_Prnt01_CndR_Iv_Chk01_HdrR<ExRpt_Prnt01_CndR, Iv_Chk01_HdrR>();
	}

	public class Map_ExRpt_Prnt01_CndR_Iv_Chk01_HdrR<D extends ExRpt_Prnt01_CndR, S extends Iv_Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ExRpt_Prnt01_CndR.$iv_no, Iv_Chk01_HdrR.$iv_no);
			addColumnPathMap(ExRpt_Prnt01_CndR.$iv_mng_no, Iv_Chk01_HdrR.$iv_mng_no);
			addColumnPathMap(ExRpt_Prnt01_CndR.$iv_rev, Iv_Chk01_HdrR.$iv_rev);
		}
	}
	
	protected Map_MST_IV_SHIP_INST_MAP_R_Iv_Upd02_Ctrl2R<MST_IV_SHIP_INST_MAP_R,Iv_Upd02_Ctrl2R> createMap_MST_IV_SHIP_INST_MAP_R_Iv_Upd02_Ctrl2R() {
		return new Map_MST_IV_SHIP_INST_MAP_R_Iv_Upd02_Ctrl2R<MST_IV_SHIP_INST_MAP_R, Iv_Upd02_Ctrl2R>();
	}

	public class Map_MST_IV_SHIP_INST_MAP_R_Iv_Upd02_Ctrl2R<D extends MST_IV_SHIP_INST_MAP_R, S extends Iv_Upd02_Ctrl2R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_IV_SHIP_INST_MAP_R.$iv_d_no, Iv_Upd02_Ctrl2R.$iv_d_no);
			addColumnPathMap(MST_IV_SHIP_INST_MAP_R.$ship_inst_d_no, Iv_Upd02_Ctrl2R.$ship_inst_d_no);
			addColumnPathMap(MST_IV_SHIP_INST_MAP_R.$ship_schd_no, Iv_Upd02_Ctrl2R.$ship_schd_no);
			addColumnPathMap(MST_IV_SHIP_INST_MAP_R.$ship_alloc_sts_no, Iv_Upd02_Ctrl2R.$ship_alloc_sts_no);
			addColumnPathMap(MST_IV_SHIP_INST_MAP_R.$base_unit_qty, Iv_Upd02_Ctrl2R.$base_unit_qty);
			addColumnPathMap(MST_IV_SHIP_INST_MAP_R.$fix_flg, Iv_Upd02_Ctrl2R.$fix_flg);
			addColumnPathMap(MST_IV_SHIP_INST_MAP_R.$ship_inst_fix_flg, Iv_Upd02_Ctrl2R.$ship_inst_fix_flg);
		}
	}
	
	protected Map_MST_IV_SHIP_ACT_MAP_R_Iv_Upd03_Ctrl2R<MST_IV_SHIP_ACT_MAP_R,Iv_Upd03_Ctrl2R> createMap_MST_IV_SHIP_ACT_MAP_R_Iv_Upd03_Ctrl2R() {
		return new Map_MST_IV_SHIP_ACT_MAP_R_Iv_Upd03_Ctrl2R<MST_IV_SHIP_ACT_MAP_R, Iv_Upd03_Ctrl2R>();
	}

	public class Map_MST_IV_SHIP_ACT_MAP_R_Iv_Upd03_Ctrl2R<D extends MST_IV_SHIP_ACT_MAP_R, S extends Iv_Upd03_Ctrl2R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_IV_R.$iv_no, Iv_Upd03_Ctrl2R.$iv_no);
			addColumnPathMap(MST_IV_SHIP_ACT_MAP_R.$iv_d_no, Iv_Upd03_Ctrl2R.$iv_d_no);
			addColumnPathMap(MST_IV_SHIP_ACT_MAP_R.$ship_act_d_no, Iv_Upd03_Ctrl2R.$ship_act_d_no);
			addColumnPathMap(MST_IV_SHIP_ACT_MAP_R.$ship_schd_no, Iv_Upd03_Ctrl2R.$ship_schd_no);
			addColumnPathMap(MST_IV_SHIP_ACT_MAP_R.$ship_alloc_sts_no, Iv_Upd03_Ctrl2R.$ship_alloc_sts_no);
			addColumnPathMap(MST_IV_SHIP_ACT_MAP_R.$base_unit_qty, Iv_Upd03_Ctrl2R.$base_unit_qty);
		}
	}
	
	protected Map_Sls_Schd_Upd04_DtlR_Iv_Chk01_DtlR<Sls_Schd_Upd04_DtlR,Iv_Chk01_DtlR> createMap_Sls_Schd_Upd04_DtlR_Iv_Chk01_DtlR() {
		return new Map_Sls_Schd_Upd04_DtlR_Iv_Chk01_DtlR<Sls_Schd_Upd04_DtlR, Iv_Chk01_DtlR>();
	}

	public class Map_Sls_Schd_Upd04_DtlR_Iv_Chk01_DtlR<D extends Sls_Schd_Upd04_DtlR, S extends Iv_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Sls_Schd_Upd04_DtlR.$iv_d_no, Iv_Chk01_DtlR.$iv_d_no);
			addColumnPathMap(Sls_Schd_Upd04_DtlR.$purc_schd_no, Iv_Chk01_DtlR.$purc_schd_no);
			addColumnPathMap(Sls_Schd_Upd04_DtlR.$slo_d_no, Iv_Chk01_DtlR.$slo_d_no);
		}
	}
	
	protected Map_Sls_Schd_Upd05_DtlR_Iv_Chk01_DtlR<Sls_Schd_Upd05_DtlR,Iv_Chk01_DtlR> createMap_Sls_Schd_Upd05_DtlR_Iv_Chk01_DtlR() {
		return new Map_Sls_Schd_Upd05_DtlR_Iv_Chk01_DtlR<Sls_Schd_Upd05_DtlR, Iv_Chk01_DtlR>();
	}

	public class Map_Sls_Schd_Upd05_DtlR_Iv_Chk01_DtlR<D extends Sls_Schd_Upd05_DtlR, S extends Iv_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Sls_Schd_Upd05_DtlR.$iv_d_no, Iv_Chk01_DtlR.$iv_d_no);
			addColumnPathMap(Sls_Schd_Upd05_DtlR.$slo_d_no, Iv_Chk01_DtlR.$slo_d_no);
			addColumnPathMap(Sls_Schd_Upd05_DtlR.$dlv_slip_d_no, Iv_Chk01_DtlR.$dlv_slip_d_no);
			addColumnPathMap(Sls_Schd_Upd05_DtlR.$manual_add_flg, Iv_Chk01_DtlR.$manual_add_flg);
			addColumnPathMap(Sls_Schd_Upd05_DtlR.$uplnd_flg, Iv_Chk01_DtlR.$uplnd_flg);
			addColumnPathMap(Sls_Schd_Upd05_DtlR.$trd_unit_qty, Iv_Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(Sls_Schd_Upd05_DtlR.$trd_unit_cd, Iv_Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(Sls_Schd_Upd05_DtlR.$base_unit_qty, Iv_Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(Sls_Schd_Upd05_DtlR.$base_unit_cd, Iv_Chk01_DtlR.$base_unit_cd);
		}
	}
	
	protected Map_MST_IV_MAP_R_Iv_Chk01_MapDtlR<MST_IV_MAP_R,Iv_Chk01_MapDtlR> createMap_MST_IV_MAP_R_Iv_Chk01_MapDtlR() {
		return new Map_MST_IV_MAP_R_Iv_Chk01_MapDtlR<MST_IV_MAP_R, Iv_Chk01_MapDtlR>();
	}

	public class Map_MST_IV_MAP_R_Iv_Chk01_MapDtlR<D extends MST_IV_MAP_R, S extends Iv_Chk01_MapDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_IV_MAP_R.$iv_d_no, Iv_Chk01_MapDtlR.$iv_d_no);
			addColumnPathMap(MST_IV_MAP_R.$ship_schd_no, Iv_Chk01_MapDtlR.$ship_schd_no);
			addColumnPathMap(MST_IV_MAP_R.$trd_unit_qty, Iv_Chk01_MapDtlR.$trd_unit_qty);
			addColumnPathMap(MST_IV_MAP_R.$base_unit_qty, Iv_Chk01_MapDtlR.$base_unit_qty);
		}
	}

	protected Map_MST_IV_R_Iv_Chk01_HdrR<MST_IV_R,Iv_Chk01_HdrR> createMap_MST_IV_R_Iv_Chk01_HdrR() {
		return new Map_MST_IV_R_Iv_Chk01_HdrR<MST_IV_R, Iv_Chk01_HdrR>();
	}

	public class Map_MST_IV_R_Iv_Chk01_HdrR<D extends MST_IV_R, S extends Iv_Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_IV_R.$iv_mng_no, Iv_Chk01_HdrR.$iv_mng_no);
			addColumnPathMap(MST_IV_R.$iv_no, Iv_Chk01_HdrR.$iv_no);
			addColumnPathMap(MST_IV_R.$iv_src_typ, Iv_Chk01_HdrR.$iv_src_typ);
			addColumnPathMap(MST_IV_R.$cmpl_schd_dt, Iv_Chk01_HdrR.$cmpl_schd_dt);
			addColumnPathMap(MST_IV_R.$cmpl_dt, Iv_Chk01_HdrR.$cmpl_dt);
			addColumnPathMap(MST_IV_R.$ac_dt, Iv_Chk01_HdrR.$ac_dt);
			addColumnPathMap(MST_IV_R.$iv_dt, Iv_Chk01_HdrR.$iv_dt);
			addColumnPathMap(MST_IV_R.$trd_ptn_typ, Iv_Chk01_HdrR.$trd_ptn_typ);
			addColumnPathMap(MST_IV_R.$sls_basis_typ, Iv_Chk01_HdrR.$sls_basis_typ);
			addColumnPathMap(MST_IV_R.$prov_basis_typ, Iv_Chk01_HdrR.$prov_basis_typ);
			addColumnPathMap(MST_IV_R.$ship_rqst_id_typ, Iv_Chk01_HdrR.$ship_rqst_id_typ);
			addColumnPathMap(MST_IV_R.$ship_rqst_id_cd, Iv_Chk01_HdrR.$ship_rqst_id_cd);
			addColumnPathMap(MST_IV_R.$tdlv_cd, Iv_Chk01_HdrR.$tdlv_cd);
			addColumnPathMap(MST_IV_R.$tdlv_sundry_flg, Iv_Chk01_HdrR.$tdlv_sundry_flg);
			addColumnPathMap(MST_IV_R.$via_dlv_typ, Iv_Chk01_HdrR.$via_dlv_typ);
			addColumnPathMap(MST_IV_R.$tdlv_cntct_dpt, Iv_Chk01_HdrR.$tdlv_cntct_dpt);
			addColumnPathMap(MST_IV_R.$tdlv_cntct_psn, Iv_Chk01_HdrR.$tdlv_cntct_psn);
			addColumnPathMap(MST_IV_R.$tdlv_zip_cd, Iv_Chk01_HdrR.$tdlv_zip_cd);
			addColumnPathMap(MST_IV_R.$tdlv_addr1, Iv_Chk01_HdrR.$tdlv_addr1);
			addColumnPathMap(MST_IV_R.$tdlv_addr2, Iv_Chk01_HdrR.$tdlv_addr2);
			addColumnPathMap(MST_IV_R.$tdlv_addr3, Iv_Chk01_HdrR.$tdlv_addr3);
			addColumnPathMap(MST_IV_R.$tdlv_addr4, Iv_Chk01_HdrR.$tdlv_addr4);
			addColumnPathMap(MST_IV_R.$tdlv_tel, Iv_Chk01_HdrR.$tdlv_tel);
			addColumnPathMap(MST_IV_R.$tdlv_fax, Iv_Chk01_HdrR.$tdlv_fax);
			addColumnPathMap(MST_IV_R.$tdlv_lg_grp_cd, Iv_Chk01_HdrR.$tdlv_lg_grp_cd);
			addColumnPathMap(MST_IV_R.$dlv_id_typ, Iv_Chk01_HdrR.$dlv_id_typ);
			addColumnPathMap(MST_IV_R.$dlv_id_cd, Iv_Chk01_HdrR.$dlv_id_cd);
			addColumnPathMap(MST_IV_R.$dlv_cntct_dpt, Iv_Chk01_HdrR.$dlv_cntct_dpt);
			addColumnPathMap(MST_IV_R.$dlv_cntct_psn, Iv_Chk01_HdrR.$dlv_cntct_psn);
			addColumnPathMap(MST_IV_R.$dlv_zip_cd, Iv_Chk01_HdrR.$dlv_zip_cd);
			addColumnPathMap(MST_IV_R.$dlv_addr1, Iv_Chk01_HdrR.$dlv_addr1);
			addColumnPathMap(MST_IV_R.$dlv_addr2, Iv_Chk01_HdrR.$dlv_addr2);
			addColumnPathMap(MST_IV_R.$dlv_addr3, Iv_Chk01_HdrR.$dlv_addr3);
			addColumnPathMap(MST_IV_R.$dlv_addr4, Iv_Chk01_HdrR.$dlv_addr4);
			addColumnPathMap(MST_IV_R.$dlv_tel, Iv_Chk01_HdrR.$dlv_tel);
			addColumnPathMap(MST_IV_R.$dlv_fax, Iv_Chk01_HdrR.$dlv_fax);
			addColumnPathMap(MST_IV_R.$dlv_cntry_cd, Iv_Chk01_HdrR.$dlv_cntry_cd);
			addColumnPathMap(MST_IV_R.$dlv_sundry_flg, Iv_Chk01_HdrR.$dlv_sundry_flg);
			addColumnPathMap(MST_IV_R.$trnspt_cd, Iv_Chk01_HdrR.$trnspt_cd);
			addColumnPathMap(MST_IV_R.$vssl_flght, Iv_Chk01_HdrR.$vssl_flght);
			addColumnPathMap(MST_IV_R.$load_port_cd, Iv_Chk01_HdrR.$load_port_cd);
			addColumnPathMap(MST_IV_R.$etd_dt, Iv_Chk01_HdrR.$etd_dt);
			addColumnPathMap(MST_IV_R.$dschrg_port_cd, Iv_Chk01_HdrR.$dschrg_port_cd);
			addColumnPathMap(MST_IV_R.$eta_dt, Iv_Chk01_HdrR.$eta_dt);
			addColumnPathMap(MST_IV_R.$via_port_cd, Iv_Chk01_HdrR.$via_port_cd);
			addColumnPathMap(MST_IV_R.$via_schd_dt, Iv_Chk01_HdrR.$via_schd_dt);
			addColumnPathMap(MST_IV_R.$tterm_cd1, Iv_Chk01_HdrR.$tterm_cd1);
			addColumnPathMap(MST_IV_R.$tterm_rmrks1, Iv_Chk01_HdrR.$tterm_rmrks1);
			addColumnPathMap(MST_IV_R.$tterm_cd2, Iv_Chk01_HdrR.$tterm_cd2);
			addColumnPathMap(MST_IV_R.$tterm_rmrks2, Iv_Chk01_HdrR.$tterm_rmrks2);
			addColumnPathMap(MST_IV_R.$trd_cur_cd, Iv_Chk01_HdrR.$trd_cur_cd);
			addColumnPathMap(MST_IV_R.$tterm_cd3, Iv_Chk01_HdrR.$tterm_cd3);
			addColumnPathMap(MST_IV_R.$tterm_rmrks3, Iv_Chk01_HdrR.$tterm_rmrks3);
			addColumnPathMap(MST_IV_R.$bill_basis_dt, Iv_Chk01_HdrR.$bill_basis_dt);
			addColumnPathMap(MST_IV_R.$rcv_schd_dt, Iv_Chk01_HdrR.$rcv_schd_dt);
			addColumnPathMap(MST_IV_R.$ttl_trd_cur_amt, Iv_Chk01_HdrR.$ttl_trd_cur_amt);
			addColumnPathMap(MST_IV_R.$xrate_inpt_flg, Iv_Chk01_HdrR.$xrate_inpt_flg);
			addColumnPathMap(MST_IV_R.$xrate, Iv_Chk01_HdrR.$xrate);
			addColumnPathMap(MST_IV_R.$ptax_xrate_inpt_flg, Iv_Chk01_HdrR.$ptax_xrate_inpt_flg);
			addColumnPathMap(MST_IV_R.$ptax_xrate, Iv_Chk01_HdrR.$ptax_xrate);
			addColumnPathMap(MST_IV_R.$ttl_net_wt, Iv_Chk01_HdrR.$ttl_net_wt);
			addColumnPathMap(MST_IV_R.$ttl_grss_wt, Iv_Chk01_HdrR.$ttl_grss_wt);
			addColumnPathMap(MST_IV_R.$ttl_dim, Iv_Chk01_HdrR.$ttl_dim);
			addColumnPathMap(MST_IV_R.$iv_rmrks, Iv_Chk01_HdrR.$iv_rmrks);
			addColumnPathMap(MST_IV_R.$pl_rmrks, Iv_Chk01_HdrR.$pl_rmrks);
			addColumnPathMap(MST_IV_R.$case_mrk1, Iv_Chk01_HdrR.$case_mrk1);
			addColumnPathMap(MST_IV_R.$case_mrk2, Iv_Chk01_HdrR.$case_mrk2);
			addColumnPathMap(MST_IV_R.$case_mrk3, Iv_Chk01_HdrR.$case_mrk3);
			addColumnPathMap(MST_IV_R.$case_mrk4, Iv_Chk01_HdrR.$case_mrk4);
			addColumnPathMap(MST_IV_R.$case_mrk5, Iv_Chk01_HdrR.$case_mrk5);
			addColumnPathMap(MST_IV_R.$case_mrk6, Iv_Chk01_HdrR.$case_mrk6);
			addColumnPathMap(MST_IV_R.$lc_no, Iv_Chk01_HdrR.$lc_no);
			addColumnPathMap(MST_IV_R.$lc_dt, Iv_Chk01_HdrR.$lc_dt);
			addColumnPathMap(MST_IV_R.$lc_rmrks, Iv_Chk01_HdrR.$lc_rmrks);
			addColumnPathMap(MST_IV_R.$bl_no, Iv_Chk01_HdrR.$bl_no);
			addColumnPathMap(MST_IV_R.$bl_dt, Iv_Chk01_HdrR.$bl_dt);
			addColumnPathMap(MST_IV_R.$bl_rmrks, Iv_Chk01_HdrR.$bl_rmrks);
			addColumnPathMap(MST_IV_R.$ship_fr_lg_grp_cd, Iv_Chk01_HdrR.$ship_fr_lg_grp_cd);
			addColumnPathMap(MST_IV_R.$pl_reg_flg, Iv_Chk01_HdrR.$pl_reg_flg);
			addColumnPathMap(MST_IV_R.$pl_skip_flg, Iv_Chk01_HdrR.$pl_skip_flg);
			addColumnPathMap(MST_IV_R.$cmpl_flg, Iv_Chk01_HdrR.$cmpl_flg);
			addColumnPathMap(MST_IV_R.$non_cmpl_flg, Iv_Chk01_HdrR.$non_cmpl_flg);
			addColumnPathMap(MST_IV_R.$iv_ship_flg, Iv_Chk01_HdrR.$iv_ship_flg);
			addColumnPathMap(MST_IV_R.$rcpt_iv_mng_no, Iv_Chk01_HdrR.$rcpt_iv_mng_no);
			addColumnPathMap(MST_IV_R.$rcpt_iv_no, Iv_Chk01_HdrR.$rcpt_iv_no);
			addColumnPathMap(MST_IV_R.$pre_rcpt_iv_flg, Iv_Chk01_HdrR.$pre_rcpt_iv_flg);
			addColumnPathMap(MST_IV_R.$sub_char1, Iv_Chk01_HdrR.$sub_char1);
			addColumnPathMap(MST_IV_R.$sub_char2, Iv_Chk01_HdrR.$sub_char2);
			addColumnPathMap(MST_IV_R.$sub_char3, Iv_Chk01_HdrR.$sub_char3);
			addColumnPathMap(MST_IV_R.$intr_rmrks, Iv_Chk01_HdrR.$intr_rmrks);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			if(src.dlv_sundry_flg()) {
				dest.dlv_id_nm(src.dlv_id_nm());
			}
			if(src.tdlv_sundry_flg()) {
				dest.tdlv_nm(src.tdlv_nm());
			}
		}
	}
	
	protected Map_MST_IV_D_R_Iv_Chk01_DtlR<MST_IV_D_R,Iv_Chk01_DtlR> createMap_MST_IV_D_R_Iv_Chk01_DtlR() {
		return new Map_MST_IV_D_R_Iv_Chk01_DtlR<MST_IV_D_R, Iv_Chk01_DtlR>();
	}

	public class Map_MST_IV_D_R_Iv_Chk01_DtlR<D extends MST_IV_D_R, S extends Iv_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_IV_D_R.$iv_d_no, Iv_Chk01_DtlR.$iv_d_no);
			addColumnPathMap(MST_IV_D_R.$iv_mng_no, Iv_Chk01_DtlR.$iv_mng_no);
			addColumnPathMap(MST_IV_D_R.$disp_seq, Iv_Chk01_DtlR.$disp_seq);
			addColumnPathMap(MST_IV_D_R.$slo_no, Iv_Chk01_DtlR.$slo_no);
			addColumnPathMap(MST_IV_D_R.$trd_cd, Iv_Chk01_DtlR.$trd_cd);
			addColumnPathMap(MST_IV_D_R.$slo_d_no, Iv_Chk01_DtlR.$slo_d_no);
			addColumnPathMap(MST_IV_D_R.$xfr_schd_no, Iv_Chk01_DtlR.$xfr_schd_no);
			addColumnPathMap(MST_IV_D_R.$cst_po_no, Iv_Chk01_DtlR.$cst_po_no);
			addColumnPathMap(MST_IV_D_R.$cst_po_d_no, Iv_Chk01_DtlR.$cst_po_d_no);
			addColumnPathMap(MST_IV_D_R.$bndl_flg, Iv_Chk01_DtlR.$bndl_flg);
			addColumnPathMap(MST_IV_D_R.$itm_cd, Iv_Chk01_DtlR.$itm_cd);
			addColumnPathMap(MST_IV_D_R.$itm_sub1, Iv_Chk01_DtlR.$itm_sub1);
			addColumnPathMap(MST_IV_D_R.$itm_sub2, Iv_Chk01_DtlR.$itm_sub2);
			addColumnPathMap(MST_IV_D_R.$itm_sub3, Iv_Chk01_DtlR.$itm_sub3);
			addColumnPathMap(MST_IV_D_R.$sno1, Iv_Chk01_DtlR.$sno1);
			addColumnPathMap(MST_IV_D_R.$sno2, Iv_Chk01_DtlR.$sno2);
			addColumnPathMap(MST_IV_D_R.$sno3, Iv_Chk01_DtlR.$sno3);
			addColumnPathMap(MST_IV_D_R.$sno4, Iv_Chk01_DtlR.$sno4);
			addColumnPathMap(MST_IV_D_R.$cst_itm_cd, Iv_Chk01_DtlR.$cst_itm_cd);
			addColumnPathMap(MST_IV_D_R.$cst_itm_nm, Iv_Chk01_DtlR.$cst_itm_nm);
			addColumnPathMap(MST_IV_D_R.$gd_cd, Iv_Chk01_DtlR.$gd_cd);
			addColumnPathMap(MST_IV_D_R.$trd_unit_cd, Iv_Chk01_DtlR.$trd_unit_cd);
			addColumnPathMap(MST_IV_D_R.$trd_unit_qty, Iv_Chk01_DtlR.$trd_unit_qty);
			addColumnPathMap(MST_IV_D_R.$base_unit_qty, Iv_Chk01_DtlR.$base_unit_qty);
			addColumnPathMap(MST_IV_D_R.$base_unit_cd, Iv_Chk01_DtlR.$base_unit_cd);
			addColumnPathMap(MST_IV_D_R.$upri_not_tgt_flg, Iv_Chk01_DtlR.$upri_not_tgt_flg);
			addColumnPathMap(MST_IV_D_R.$interim_flg, Iv_Chk01_DtlR.$interim_flg);
			addColumnPathMap(MST_IV_D_R.$trd_cur_upri, Iv_Chk01_DtlR.$trd_cur_upri);
			addColumnPathMap(MST_IV_D_R.$trd_cur_amt, Iv_Chk01_DtlR.$trd_cur_amt);
			addColumnPathMap(MST_IV_D_R.$iv_upri, Iv_Chk01_DtlR.$iv_upri);
			addColumnPathMap(MST_IV_D_R.$iv_amt, Iv_Chk01_DtlR.$iv_amt);
			addColumnPathMap(MST_IV_D_R.$sundry_itm_flg, Iv_Chk01_DtlR.$sundry_itm_flg);
			addColumnPathMap(MST_IV_D_R.$tax_fix_flg, Iv_Chk01_DtlR.$tax_fix_flg);
			addColumnPathMap(MST_IV_D_R.$tax_cd, Iv_Chk01_DtlR.$tax_cd);
			addColumnPathMap(MST_IV_D_R.$ptax_cur_amt, Iv_Chk01_DtlR.$ptax_cur_amt);
			addColumnPathMap(MST_IV_D_R.$wtax_rate, Iv_Chk01_DtlR.$wtax_rate);
			addColumnPathMap(MST_IV_D_R.$wtax_amt, Iv_Chk01_DtlR.$wtax_amt);
			addColumnPathMap(MST_IV_D_R.$cntry_org_cd, Iv_Chk01_DtlR.$cntry_org_cd);
			addColumnPathMap(MST_IV_D_R.$rsn_cd, Iv_Chk01_DtlR.$rsn_cd);
			addColumnPathMap(MST_IV_D_R.$bd_dpt_cd, Iv_Chk01_DtlR.$bd_dpt_cd);
			addColumnPathMap(MST_IV_D_R.$sls_dpt_cd, Iv_Chk01_DtlR.$sls_dpt_cd);
			addColumnPathMap(MST_IV_D_R.$sls_usr_cd, Iv_Chk01_DtlR.$sls_usr_cd);
			addColumnPathMap(MST_IV_D_R.$manual_add_flg, Iv_Chk01_DtlR.$manual_add_flg);
			addColumnPathMap(MST_IV_D_R.$ar_dpt_cd, Iv_Chk01_DtlR.$ar_dpt_cd);
			addColumnPathMap(MST_IV_D_R.$dlv_rqst_tm, Iv_Chk01_DtlR.$dlv_rqst_tm);
			addColumnPathMap(MST_IV_D_R.$purc_schd_no, Iv_Chk01_DtlR.$purc_schd_no);
			addColumnPathMap(MST_IV_D_R.$iv_d_rmrks, Iv_Chk01_DtlR.$iv_d_rmrks);
			addColumnPathMap(MST_IV_D_R.$sub_char1, Iv_Chk01_DtlR.$dtl_sub_char1);
			addColumnPathMap(MST_IV_D_R.$sub_char2, Iv_Chk01_DtlR.$dtl_sub_char2);
			addColumnPathMap(MST_IV_D_R.$sub_char3, Iv_Chk01_DtlR.$dtl_sub_char3);
			addColumnPathMap(MST_IV_D_R.$trd_cur_dscnt_amt, Iv_Chk01_DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(MST_IV_D_R.$trd_cur_tax_amt, Iv_Chk01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(MST_IV_D_R.$dscnt_rsn_cd, Iv_Chk01_DtlR.$dscnt_rsn_cd);
			addColumnPathMap(MST_IV_D_R.$trd_rmrks, Iv_Chk01_DtlR.$trd_rmrks);
			addColumnPathMap(MST_IV_D_R.$trd_d_rmrks, Iv_Chk01_DtlR.$trd_d_rmrks);
			addColumnPathMap(MST_IV_D_R.$intr_d_rmrks, Iv_Chk01_DtlR.$intr_d_rmrks);
		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.iv_rev(src.iv_rev());
			if(src.sundry_itm_flg()) {
				dest.itm_nm(src.itm_nm());
				dest.iv_itm_nm(src.iv_itm_nm());
			}
		}
	}
	
	protected Map_MST_IV_SHIP_INST_MAP_R_Iv_Chk01_ShipInstMapDtlR<MST_IV_SHIP_INST_MAP_R,Iv_Chk01_ShipInstMapDtlR> createMap_MST_IV_SHIP_INST_MAP_R_Iv_Chk01_ShipInstMapDtlR() {
		return new Map_MST_IV_SHIP_INST_MAP_R_Iv_Chk01_ShipInstMapDtlR<MST_IV_SHIP_INST_MAP_R, Iv_Chk01_ShipInstMapDtlR>();
	}

	public class Map_MST_IV_SHIP_INST_MAP_R_Iv_Chk01_ShipInstMapDtlR<D extends MST_IV_SHIP_INST_MAP_R, S extends Iv_Chk01_ShipInstMapDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_IV_SHIP_INST_MAP_R.$iv_d_no, Iv_Chk01_ShipInstMapDtlR.$iv_d_no);
			addColumnPathMap(MST_IV_SHIP_INST_MAP_R.$ship_schd_no, Iv_Chk01_ShipInstMapDtlR.$ship_schd_no);
			addColumnPathMap(MST_IV_SHIP_INST_MAP_R.$ship_alloc_sts_no, Iv_Chk01_ShipInstMapDtlR.$ship_alloc_sts_no);
			addColumnPathMap(MST_IV_SHIP_INST_MAP_R.$ship_inst_d_no, Iv_Chk01_ShipInstMapDtlR.$ship_inst_d_no);
			addColumnPathMap(MST_IV_SHIP_INST_MAP_R.$base_unit_qty, Iv_Chk01_ShipInstMapDtlR.$base_unit_qty);

		}
		
		@Override
		public void copy(D dest, S src) {
			super.copy(dest, src);
			dest.fix_flg(true);
		}
	}
	
	protected Map_MST_IV_SHIP_ACT_MAP_R_Iv_Chk01_ShipActMapDtlR<MST_IV_SHIP_ACT_MAP_R,Iv_Chk01_ShipActMapDtlR> createMap_MST_IV_SHIP_ACT_MAP_R_Iv_Chk01_ShipActMapDtlR() {
		return new Map_MST_IV_SHIP_ACT_MAP_R_Iv_Chk01_ShipActMapDtlR<MST_IV_SHIP_ACT_MAP_R, Iv_Chk01_ShipActMapDtlR>();
	}

	public class Map_MST_IV_SHIP_ACT_MAP_R_Iv_Chk01_ShipActMapDtlR<D extends MST_IV_SHIP_ACT_MAP_R, S extends Iv_Chk01_ShipActMapDtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_IV_SHIP_ACT_MAP_R.$iv_d_no, Iv_Chk01_ShipActMapDtlR.$iv_d_no);
			addColumnPathMap(MST_IV_SHIP_ACT_MAP_R.$ship_schd_no, Iv_Chk01_ShipActMapDtlR.$ship_schd_no);
			addColumnPathMap(MST_IV_SHIP_ACT_MAP_R.$ship_alloc_sts_no, Iv_Chk01_ShipActMapDtlR.$ship_alloc_sts_no);
			addColumnPathMap(MST_IV_SHIP_ACT_MAP_R.$ship_act_d_no, Iv_Chk01_ShipActMapDtlR.$ship_act_d_no);
			addColumnPathMap(MST_IV_SHIP_ACT_MAP_R.$base_unit_qty, Iv_Chk01_ShipActMapDtlR.$base_unit_qty);

		}
		
		@Override
		public void copy(D dest, S src) {
			super.copy(dest, src);
			dest.fix_flg(true);
		}
	}
	
	protected Map_AmtUtil_Calc01_HdrR_Iv_Chk01_HdrR<AmtUtil_Calc01_HdrR,Iv_Chk01_HdrR> createMap_AmtUtil_Calc01_HdrR_Iv_Chk01_HdrR() {
		return new Map_AmtUtil_Calc01_HdrR_Iv_Chk01_HdrR<AmtUtil_Calc01_HdrR, Iv_Chk01_HdrR>();
	}
	public class Map_AmtUtil_Calc01_HdrR_Iv_Chk01_HdrR<D extends AmtUtil_Calc01_HdrR, S extends Iv_Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(AmtUtil_Calc01_HdrR.$trd_cur_cd, Iv_Chk01_HdrR.$trd_cur_cd);
			addColumnPathMap(AmtUtil_Calc01_HdrR.$ptax_xrate, Iv_Chk01_HdrR.$ptax_xrate);
		}
		@Override
		public void copy(D dest, S src) {
			super.copy(dest, src);
			dest.amt_dec_place(src.trd_cur_amt_dec_place());
			dest.tax_rnd_typ(src.trd_tax_rnd_typ());
		}
	}
	
	protected Map_AmtUtil_Calc01_DtlR_Iv_Chk01_DtlR<AmtUtil_Calc01_DtlR,Iv_Chk01_DtlR> createMap_AmtUtil_Calc01_DtlR_Iv_Chk01_DtlR() {
		return new Map_AmtUtil_Calc01_DtlR_Iv_Chk01_DtlR<AmtUtil_Calc01_DtlR, Iv_Chk01_DtlR>();
	}

	public class Map_AmtUtil_Calc01_DtlR_Iv_Chk01_DtlR<D extends AmtUtil_Calc01_DtlR, S extends Iv_Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(AmtUtil_Calc01_DtlR.$peg_no, Iv_Chk01_DtlR.$peg_no);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$tax_rate, Iv_Chk01_DtlR.$tax_rate);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$inc_tax_flg, Iv_Chk01_DtlR.$inc_tax_flg);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$dscnt_itm_flg, Iv_Chk01_DtlR.$dscnt_itm_flg);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_upri, Iv_Chk01_DtlR.$trd_cur_upri);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_amt, Iv_Chk01_DtlR.$trd_cur_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_tax_amt, Iv_Chk01_DtlR.$trd_cur_tax_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$trd_cur_dscnt_amt, Iv_Chk01_DtlR.$trd_cur_dscnt_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$ptax_cur_amt, Iv_Chk01_DtlR.$ptax_cur_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$iv_amt, Iv_Chk01_DtlR.$iv_amt);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$wtax_rate, Iv_Chk01_DtlR.$wtax_rate);
			addColumnPathMap(AmtUtil_Calc01_DtlR.$wtax_amt, Iv_Chk01_DtlR.$wtax_amt);
		}
	}
	
	protected Map_Cl_Chk03_CndR_IoAct_Ins01_DtlR<Cl_Chk03_CndR,IoAct_Ins01_DtlR> createMap_Cl_Chk03_CndR_IoAct_Ins01_DtlR() {
		return new Map_Cl_Chk03_CndR_IoAct_Ins01_DtlR<Cl_Chk03_CndR, IoAct_Ins01_DtlR>();
	}

	public class Map_Cl_Chk03_CndR_IoAct_Ins01_DtlR<D extends Cl_Chk03_CndR, S extends IoAct_Ins01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Cl_Chk03_CndR.$ac_dt, IoAct_Ins01_DtlR.$ac_dt);
			addColumnPathMap(Cl_Chk03_CndR.$can_ac_dt, IoAct_Ins01_DtlR.$can_ac_dt);
			addColumnPathMap(Cl_Chk03_CndR.$itm_cd, IoAct_Ins01_DtlR.$itm_cd);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub1, IoAct_Ins01_DtlR.$itm_sub1);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub2, IoAct_Ins01_DtlR.$itm_sub2);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub3, IoAct_Ins01_DtlR.$itm_sub3);

		}
		
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.stk_cls_chk_flg(true);
			dest.loc_cd(src.gi_loc_cd());
		}
	}

	//FMCB CUSTOM END
}