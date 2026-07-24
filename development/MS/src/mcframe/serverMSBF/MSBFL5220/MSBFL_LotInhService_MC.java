package mcframe.serverMSBF.MSBFL5220;

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
import mcframe.serverMSBF.MSBFL5220.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;
import mcframe.commonCore.meta.MCMeta;
import mcframe.serverCore.sys.MCSys;
import static mcframe.serverMSBF.MSBFL5220.Query.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_LotInhService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_LotInhService_MC extends MSBFL_LotInhService_MC_A{
	//FMCB CUSTOM START

	/**
	 * LotInh_Upd01オペレーション.<p>
	 *
	 * ロット継承サービスを実行する。<br>
	 */
	public class LotInh_Upd01 extends MSBFL_LotInhService_MC_A.LotInh_Upd01 {
		
		protected static final String ITM_MFG_INST_NO_COL = "itm_mfg_inst_no";
		
		protected static final String MFG_ACT_NO_COL = "mfg_act_no";
		
		protected MST_LOT_R _metalotR;
		
		protected Set<String> _itmMfgNoWarnSet;
		
		protected MCMessageList _msgWarnL;
		
		protected MCMessageList _msgInfoL;
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MCList<LotInh_Upd01_Cnd01R> tgtList = getTgtList();
			
			if (!isNull(tgtList)) {
				doLotInh(tgtList);
			}
			
			postLotInh();
		}

		protected MCList<LotInh_Upd01_Cnd01R> getTgtList() {
			return up0().subList(r -> !isNull(r.itm_mfg_inst_no()));
		}

		protected void doLotInh(MCList<LotInh_Upd01_Cnd01R> tgtList) {
			// 上り電文の全ての品目製造指図ＮＯをワークテーブルへ挿入する
			insWk(tgtList);
			MCList<LotInh_Upd01_Dtl01R> itmMfgInstL = srchItmMfgInstAndMaster();

			if (!isNull(itmMfgInstL)) {
				// ロット継承対象のみの品目製造指図ＮＯをワークテーブルへ挿入する
				insWk(itmMfgInstL);

				// 継承先ロットＮＯのリストを取得する
				MCList<MST_LOT_R> srchCndOfLotDestL = setSrchCndOfLotDest(itmMfgInstL);

				if (!isNull(srchCndOfLotDestL)) {
					// 継承元と継承先のロット情報を取得する
					MCList<MST_LOT_R> lotSrcL = crtMST_LOT_L();
					MCList<MST_LOT_R> lotDestL = crtMST_LOT_L();
					
					srchLotSrc(lotSrcL);
					srchLotDest(lotDestL, srchCndOfLotDestL);

					if (!isNull(lotDestL)) {
						// 継承先のロット情報を編集する
						MCQueryApiBuilder srchCndOfLotDestL_bldr = MCQueryApiBuilder.create(MST_LOT_R.create("T"));
						MCIndexKey indexOfLotDestL = lotDestL.createIndex(ITM_MFG_INST_NO_COL);
						MCIndexKey indexOfLotSrcL = lotSrcL.createIndex(ITM_MFG_INST_NO_COL, MFG_ACT_NO_COL);
						String[] lotKeys = srchCndOfLotDestL_bldr.getBaseDbc().getKeyColumn();
						
						for (MCList<LotInh_Upd01_Dtl01R> itmMfgInstByItmMfgInstNoL : itmMfgInstL.groupList(LotInh_Upd01_Dtl01R.$itm_mfg_inst_no)) {
							MCList<LotInh_Upd01_Dtl01R> instItmMfgSubL = itmMfgInstByItmMfgInstNoL.subList(r -> !MAC_STR.isNULL_VAL(r.wg_cd()));
							if(isNull(instItmMfgSubL)) {
								instItmMfgSubL = itmMfgInstByItmMfgInstNoL;
							}
							
							LotInh_Upd01_Dtl01R itmMfgInstR = instItmMfgSubL.get(0);
							MCList<MST_LOT_R> lotDestByItmMfgNoL = lotDestL.subList(indexOfLotDestL, itmMfgInstR.itm_mfg_inst_no());
							MCList<MST_LOT_R> lotDestActL = lotDestByItmMfgNoL.subList(r -> !isNull(r.getString(MFG_ACT_NO_COL)));
							
							if (MAC_MFG_INST_UNIT_TYP.isITM(itmMfgInstR.mfg_inst_unit_typ()) && !isNull(lotDestActL)) {
								for (MCList<MST_LOT_R> lotDestByLotActL : lotDestActL.groupList(MST_LOT_R.$lot_no, MST_LOT_R.$sublot_no)) {
									MCList<MST_LOT_R> lotSrcSubL = crtMST_LOT_L();
									for(MST_LOT_R lotDestActR : lotDestByLotActL) {
										lotSrcSubL.addAll(lotSrcL.subList(indexOfLotSrcL, lotDestActR.getString(ITM_MFG_INST_NO_COL), lotDestActR.getString(MFG_ACT_NO_COL)));
										lotSrcSubL.addAll(lotSrcL.subList(indexOfLotSrcL, lotDestActR.getString(ITM_MFG_INST_NO_COL), null));
									}
									lotSrcSubL.setAll(lotSrcSubL.distinctNE(lotKeys));
									HashMap<String, Comparable<?>> calcRsltMap = calcLotInh(instItmMfgSubL, lotSrcSubL);
									setValLotDest(lotDestByLotActL, calcRsltMap);
								}
							}
							else {
								MCList<MST_LOT_R> lotSrcByItmMfgNoL = lotSrcL.subList(indexOfLotSrcL, itmMfgInstR.itm_mfg_inst_no());
								lotSrcByItmMfgNoL.setAll(lotSrcByItmMfgNoL.distinctNE(lotKeys));
								HashMap<String, Comparable<?>> calcRsltMap = calcLotInh(instItmMfgSubL, lotSrcByItmMfgNoL);
								setValLotDest(lotDestByItmMfgNoL, calcRsltMap);
							}
						}
						
						// メッセージを処理する
						handleMsg();
						
						// 継承先ロット情報を更新する
						MST_LOT_R lotDestL_t = MST_LOT_R.create("T");
						MCQueryApiBuilder lotDestL_bldr = MCQueryApiBuilder.create(lotDestL_t);
						updLotDest(lotDestL, lotDestL_t, lotDestL_bldr);
					}
				}
			}
			// ワークテーブルの後始末
			delWk();
		}

		protected <T extends MCRow> void insWk(MCList<T> tgtList) {
			MCList<MST_ITM_MFG_INST_R> wkL = MCList.create(MST_ITM_MFG_INST_R.class);
			for(T r : tgtList.distinctNE(ITM_MFG_INST_NO_COL)) {
				MST_ITM_MFG_INST_R tmpR = MST_ITM_MFG_INST_R.create();
				tmpR.itm_mfg_inst_no(r.getString(ITM_MFG_INST_NO_COL));
				wkL.add(tmpR);
			}
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_ITM_MFG_INST_R.create("T"));
			dbWkDelete("MSBFL5220_MSW_ITM_MFG_INST_D01", wkL_bldr.getBaseDbc());
			dbWkInsert("MSBFL5220_MSW_ITM_MFG_INST_I01", wkL, wkL_bldr.getBaseDbc());
		}
		
		protected void delWk() {
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_ITM_MFG_INST_R.create("T"));
			dbWkDelete("MSBFL5220_MSW_ITM_MFG_INST_D02", wkL_bldr.getBaseDbc());
		}

		protected MCList<LotInh_Upd01_Dtl01R> srchItmMfgInstAndMaster() {
			MCList<LotInh_Upd01_Dtl01R> itmMfgInstL = MCList.create(LotInh_Upd01_Dtl01R.class);
			// ここでは品目製造指図情報と製造指図情報をロックしない。本サービス実行前に既にロックされていること前提。
			executeQuery(itmMfgInstL, MSBFL5220_MST_ITM_MFG_INST_S01());
			return itmMfgInstL;
		}

		protected MCList<MST_LOT_R> setSrchCndOfLotDest(MCList<LotInh_Upd01_Dtl01R> itmMfgInstL) {
			MCList<MST_LOT_R> srchCndOfLotDestL = srchYieldAct();
			addItmMfgInstToSrchCndOfLotDest(itmMfgInstL, srchCndOfLotDestL);
			if (hasRestrictLotDest()) {
				restrictLotDest(itmMfgInstL, srchCndOfLotDestL);
			}
			return srchCndOfLotDestL;
		}

		protected MCList<MST_LOT_R> srchYieldAct() {
			MCList<MST_LOT_R> srchCndOfLotDestL = crtMST_LOT_L();
			executeQuery(srchCndOfLotDestL, MSBFL5220_MSVT_YIELD_ACT_LOT_S01());
			return srchCndOfLotDestL;
		}
		
		protected MCList<MST_LOT_R> crtMST_LOT_L() {
			MCList<MST_LOT_R> tmpL = MCList.create(MST_LOT_R.class);
			tmpL.addStringColumn(ITM_MFG_INST_NO_COL);
			tmpL.addStringColumn(MFG_ACT_NO_COL);
			return tmpL;
		}

		protected void addItmMfgInstToSrchCndOfLotDest(
				MCList<LotInh_Upd01_Dtl01R> itmMfgInstL, MCList<MST_LOT_R> srchCndOfLotDestL) {
			MCList<MST_LOT_R> addLotDestL = crtMST_LOT_L();
			MCIndexKey indexOfSrchCndOfLotDestL = srchCndOfLotDestL.createIndex(ITM_MFG_INST_NO_COL);
			
			for(MCList<LotInh_Upd01_Dtl01R> itmMfgInstByItmMfgInstNoL: itmMfgInstL.groupList(LotInh_Upd01_Dtl01R.$itm_mfg_inst_no)) {//itmMfgInstLの品目製造指図ＮＯごとに処理する
				LotInh_Upd01_Dtl01R itmMfgInstR = itmMfgInstByItmMfgInstNoL.get(0);
				
				if (!isNullOr(itmMfgInstR.lot_no(), itmMfgInstR.sublot_no())) {
					MST_LOT_R srchCndOfLotDestByItmMfgInstNoR = srchCndOfLotDestL.getFirst(indexOfSrchCndOfLotDestL, itmMfgInstR.itm_mfg_inst_no());
					// 出来高実績がない場合のみ、品目製造指図のロット(サブロット)ＮＯを追加する
					if (srchCndOfLotDestByItmMfgInstNoR == null) {
						MST_LOT_R row = srchCndOfLotDestL.createRow();
						copyItmMfgInstRToLotR(row, itmMfgInstR);
						addLotDestL.add(row);
					}
				}
			}
			srchCndOfLotDestL.addAll(addLotDestL);
		}
		
		protected void copyItmMfgInstRToLotR(MST_LOT_R dest, LotInh_Upd01_Dtl01R src) {
			dest.setString(ITM_MFG_INST_NO_COL, src.itm_mfg_inst_no());
			dest.itm_cd(src.itm_cd());
			dest.itm_sub1(src.itm_sub1());
			dest.itm_sub2(src.itm_sub2());
			dest.itm_sub3(src.itm_sub3());
			dest.lot_no(src.lot_no());
			dest.sublot_no(src.sublot_no());
		}
		
		protected boolean hasRestrictLotDest() {
			return !isNull(up1());
		}

		protected void restrictLotDest(MCList<LotInh_Upd01_Dtl01R> itmMfgInstL, MCList<MST_LOT_R> srchCndOfLotDestL) {
			if (isNull(srchCndOfLotDestL)) {
				return;
			}
			MCIndexKey indexOfItmMfgInstL = itmMfgInstL.createIndex(LotInh_Upd01_Dtl01R.$itm_mfg_inst_no);
			MCList<MST_LOT_R> tmpL = crtMST_LOT_L();
			for (MST_LOT_R cndR : srchCndOfLotDestL) {
				LotInh_Upd01_Dtl01R itmMfgInstR = itmMfgInstL.getFirst(indexOfItmMfgInstL, cndR.getString(ITM_MFG_INST_NO_COL));
				for (LotInh_Upd01_Cnd02R upR : up1()) {
					if (isSameLotDest(upR, cndR, itmMfgInstR)) {
						tmpL.add(cndR);
						break;
					}
				}
			}
			srchCndOfLotDestL.setAll(tmpL);
		}
		
		protected boolean isSameLotDest(LotInh_Upd01_Cnd02R upR, MST_LOT_R cndR, LotInh_Upd01_Dtl01R itmMfgInstR) {
			return isSame(upR.itm_cd(), cndR.itm_cd())
					&& isSame(upR.itm_sub1(), cndR.itm_sub1())
					&& isSame(upR.itm_sub2(), cndR.itm_sub2())
					&& isSame(upR.itm_sub3(), cndR.itm_sub3())
					&& isSame(upR.lot_no(), cndR.lot_no())
					&& (isSame(upR.sublot_no(), cndR.sublot_no()) || MAC_SUBLOT_MNG_TYP.isSTK(itmMfgInstR.sublot_mng_typ()));
		}
		
		protected void srchLotSrc(MCList<MST_LOT_R> lotSrcL) {
			executeQuery(lotSrcL, MSBFL5220_MST_LOT_S01());
		}
		
		protected void srchLotDest(MCList<MST_LOT_R> lotDestL, MCList<MST_LOT_R> srchCndOfLotDestL) {
			// 継承先ロット情報を取得する
			MST_LOT_R t = MST_LOT_R.create("T");
			MCQueryApiBuilder lotDestL_bldr = MCQueryApiBuilder.create(t);
			
			srchCndOfLotDestL.sort(srchCndOfLotDestL.createRow().getKeyColumn());
			setSelectColOfLot(lotDestL, t, lotDestL_bldr);
			lotDestL_bldr.setOrderByAsc(lotDestL_bldr.getBaseDbc().getKeyColumn$());
			dbSelectKeyForUpdate("MSBFL5220_MST_LOT_S01", lotDestL, lotDestL_bldr, srchCndOfLotDestL);
			
			// 継承先ロット情報に製造実績ＮＯと品目製造指図ＮＯを紐付ける
			MCList<MST_LOT_R> tmpL = crtMST_LOT_L();
			String[] keys = lotDestL_bldr.getBaseDbc().getKeyColumn();
			MCIndexKey indexOfLotDestL = lotDestL.createIndex(keys);
			for (MST_LOT_R cndR : srchCndOfLotDestL) {
				Comparable<?>[] vals = cndR.toArray(keys);
				MST_LOT_R lotR = lotDestL.getFirst(indexOfLotDestL, vals);
				if (lotR != null) {
					if (!lotR.isStatusNone()) {
						lotR = lotR.clone();
					}
					lotR.setString(ITM_MFG_INST_NO_COL, cndR.getString(ITM_MFG_INST_NO_COL));
					lotR.setString(MFG_ACT_NO_COL, cndR.getString(MFG_ACT_NO_COL));
					lotR.setStatus(MCRow.MODIFY);
					tmpL.add(lotR);
				}
			}
		}
		
		protected void setSelectColOfLot(MCList<MST_LOT_R> dbc, MST_LOT_R t, MCQueryApiBuilder dbc_bldr) {
			dbc_bldr.setSelect(t.getKeyColumn$());
			dbc_bldr.addSelect(getLotInhCols());
			dbc_bldr.addSelect(t.vld_dt);
			dbc_bldr.addSelect(t.first_gr_dt);
			dbc_bldr.addSelect(t.lot_seq);
		}
		
		protected MCPermColumn[] getLotInhCols() {
			MAC_LOT_INH_COL_TYP[] typs = MAC_LOT_INH_COL_TYP.array();
			int size = typs.length;
			MCPermColumn[] cols = new MCPermColumn[size];
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_LOT_R.create("T"));
			for (int i = 0; i < size; i++) {
				cols[i] = dbc_bldr.getBaseDbc().getColumn$(typs[i].value());
			}
			return cols;
		}

		protected HashMap<String, Comparable<?>> calcLotInh(MCList<LotInh_Upd01_Dtl01R> itmMfgInstSubL, MCList<MST_LOT_R> lotSrcSubL) {
			HashMap<String, Comparable<?>> calcRsltMap = new HashMap<String, Comparable<?>>();
			MCIndexKey indexOfLotSrcL = lotSrcSubL.createIndex(MST_LOT_R.$itm_cd, MST_LOT_R.$itm_sub1, MST_LOT_R.$itm_sub2, MST_LOT_R.$itm_sub3);
			LotInh_Upd01_Dtl01R itmMfgInstSubR = itmMfgInstSubL.get(0);
			for (MCList<LotInh_Upd01_Dtl01R> lotInhByColL : itmMfgInstSubL.groupList(LotInh_Upd01_Dtl01R.$lot_inh_col_typ)) {
				LotInh_Upd01_Dtl01R lotInhDestR = lotInhByColL.get(0);
				if (isCalcLotInhCol(lotInhDestR, itmMfgInstSubR)) {
					calcRsltMap.put(lotInhDestR.lot_inh_col_typ(), calcLotInhByCol(lotInhByColL, itmMfgInstSubR, lotSrcSubL, indexOfLotSrcL));
					//継承元ロットの継承項目が設定されているかどうかを判断する
					judgeInfoLotInh(lotSrcSubL, itmMfgInstSubR.itm_mfg_inst_no(), lotInhDestR.lot_inh_col_typ());
				}
			}
			return calcRsltMap;
		}
		
		protected boolean isCalcLotInhCol(LotInh_Upd01_Dtl01R lotInhDestR, LotInh_Upd01_Dtl01R itmMfgInstR) {
			if (MAC_LOT_INH_COL_TYP.isACT_CONT_FCTR(lotInhDestR.lot_inh_col_typ())) {
				return itmMfgInstR.cont_fctr_flg();
			}
			return true;
		}
		
		protected Comparable<?> calcLotInhByCol(MCList<LotInh_Upd01_Dtl01R> lotInhMasterByColL,
				LotInh_Upd01_Dtl01R itmMfgInstR, MCList<MST_LOT_R> lotSrcL, MCIndexKey indexOfLotSrcL) {
			LotInh_Upd01_Dtl01R lotInhDestR = lotInhMasterByColL.get(0);
			MCList<MST_LOT_R> lotSrcByColL = getLotSrcByCol(lotInhMasterByColL, lotSrcL, indexOfLotSrcL);
			return getValCust(lotInhDestR, lotSrcByColL, itmMfgInstR);
		}
		
		protected MCList<MST_LOT_R> getLotSrcByCol(MCList<LotInh_Upd01_Dtl01R> lotInhMasterByColL,
				MCList<MST_LOT_R> lotSrcL, MCIndexKey indexOfLotSrcL) {
			MCList<MST_LOT_R> tgtL = crtMST_LOT_L();
			lotInhMasterByColL.sort(LotInh_Upd01_Dtl01R.$prio,LotInh_Upd01_Dtl01R.$chd_itm_cd,
					LotInh_Upd01_Dtl01R.$chd_itm_sub1, LotInh_Upd01_Dtl01R.$chd_itm_sub2, LotInh_Upd01_Dtl01R.$chd_itm_sub3);
			for (LotInh_Upd01_Dtl01R lotInhMasterR : lotInhMasterByColL) {
				MCList<MST_LOT_R> lotSrcByColByItmL = lotSrcL.subList(indexOfLotSrcL, lotInhMasterR.chd_itm_cd(),
						lotInhMasterR.chd_itm_sub1(), lotInhMasterR.chd_itm_sub2(), lotInhMasterR.chd_itm_sub3());
				lotSrcByColByItmL.sort(MST_LOT_R.$vld_dt, MST_LOT_R.$first_gr_dt, MST_LOT_R.$lot_seq, MST_LOT_R.$lot_no, MST_LOT_R.$sublot_no);
				tgtL.addAll(lotSrcByColByItmL);
			}
			return tgtL;
		}
		
		protected Comparable<?> getValCust(LotInh_Upd01_Dtl01R lotInhDestR, MCList<MST_LOT_R> lotSrcByColL, LotInh_Upd01_Dtl01R itmMfgInstR) {							
			Comparable<?> val = getValCom(lotInhDestR, lotSrcByColL, itmMfgInstR);
			String lotInhCol = lotInhDestR.lot_inh_col_typ();
			if (MAC_LOT_INH_COL_TYP.isACT_CONT_FCTR(lotInhCol)) {
				if (isNull(val)) {
					return itmMfgInstR.std_cont_fctr();
				}
			}
			return val;
		}
		
		protected Comparable<?> getValCom(LotInh_Upd01_Dtl01R lotInhDestR, MCList<MST_LOT_R> lotSrcByColL, LotInh_Upd01_Dtl01R itmMfgInstR) {
			if (isNull(lotSrcByColL)) {
				return getValOnEmpty(lotInhDestR);
			}
			else {
				// lotSrcByColLは、文字列結合（かつ、優先順位）の順序であること前提
				if (MAC_LOT_INH_TYP.isCONCAT(lotInhDestR.lot_inh_typ())) {
					return getValByConcat(lotInhDestR, lotSrcByColL, itmMfgInstR);
				}
				if (MAC_LOT_INH_TYP.isMIN_VALUE(lotInhDestR.lot_inh_typ())) {
					return getValByMin(lotInhDestR, lotSrcByColL);
				}
				if (MAC_LOT_INH_TYP.isMAX_VALUE(lotInhDestR.lot_inh_typ())) {
					return getValByMax(lotInhDestR, lotSrcByColL);
				}
				if (MAC_LOT_INH_TYP.isPRIO(lotInhDestR.lot_inh_typ())) {
					return getValByPrio(lotInhDestR, lotSrcByColL);
				}
			}
			return null;
		}
		
		protected Comparable<?> getValOnEmpty(LotInh_Upd01_Dtl01R lotInhDestR) {
			String lotInhCol = lotInhDestR.lot_inh_col_typ();
			MCDBType dbType = getMetaLotR(lotInhCol).dbType();
			switch (dbType) {
				case BOOLEAN:
					return false;
				default:
					return null;
			}
		}
		
		protected MCMeta getMetaLotR(String col) {
			if (_metalotR == null) {
				_metalotR = MST_LOT_R.create();
			}
			return _metalotR.getMeta(col);
		}
		
		protected Comparable<?> getValByConcat(LotInh_Upd01_Dtl01R lotInhDestR, MCList<MST_LOT_R> lotSrcL, LotInh_Upd01_Dtl01R itmMfgInstR) {
			String lotInhCol = lotInhDestR.lot_inh_col_typ();
			String addConcatCol = lotInhDestR.add_concat_col();
			String valAct = concatStrL(lotInhCol, addConcatCol, lotSrcL);
			if (isNull(valAct)) {
				return null;
			}
			else {
				int lenMax = getMetaLotR(lotInhCol).length();
				int lenAct = valAct.length();
				if (lenAct > lenMax) {
					return getValByConcatOnOverflow(lotInhDestR, valAct, lenMax,lotInhCol, itmMfgInstR);
				}
				else {
					return valAct;
				}
			}
		}
		
		protected String concatStrL(String lotInhCol, String addConcatCol, MCList<MST_LOT_R> lotSrcL) {
			ArrayList<String> strL = new ArrayList<String>();
			for (MST_LOT_R row : lotSrcL) {
				String val = row.getString(lotInhCol);
				String addVal = null;
				if (!isNull(addConcatCol)) {
					addVal = row.getString(addConcatCol);
				}
				
				if (MAC_LOT_INH_COL_TYP.is_add_behind(lotInhCol)) {
					if (!isNull(val)) {
						strL.add(val);
					}
					if (!isNull(addVal)) {
						strL.add(addVal);
					}
				}
				else {
					if (!isNull(addVal)) {
						strL.add(addVal);
					}
					if (!isNull(val)) {
						strL.add(val);
					}
				}
			}
			
			if (strL.isEmpty()) {
				return null;
			}
			else if (strL.size() == 1) {
				return strL.get(0);
			}
			else {
				MAC_LOT_INH_COL_TYP lotInhColTyp = MAC_LOT_INH_COL_TYP.get(lotInhCol);
				StringBuilder sb = new StringBuilder();
				sb.append(strL.get(0));
				String dlm = lotInhColTyp.dlm_str();
				for (int i = 1; i < strL.size(); i++) {
					sb.append(dlm);
					sb.append(strL.get(i));
				}
				return sb.toString();
			}
		}
		
		protected Comparable<?> getValByConcatOnOverflow(LotInh_Upd01_Dtl01R lotInhDestR, String valAct, int lenMax, String lotInhCol, LotInh_Upd01_Dtl01R itmMfgInstR) {
			MAC_LOT_INH_COL_TYP lotInhColTyp = MAC_LOT_INH_COL_TYP.get(lotInhCol);
			
			boolean isSilentFlg = true;
			MCList<LotInh_Upd01_Cnd01R> upL = up0().subList(LotInh_Upd01_Dtl01R.$itm_mfg_inst_no, itmMfgInstR.itm_mfg_inst_no());
			for (LotInh_Upd01_Cnd01R r : upL) {
				if (!r.silent_flg()) {
					isSilentFlg = false;
					break;
				}
			}
			if (!isSilentFlg) {
				if (lotInhDestR.overflow_err_flg()) {
					LotInh_Upd01_Cnd01R upR = upL.get(0);
					for (LotInh_Upd01_Cnd01R r : upL) {
						if (!r.no_exception_flg()) {
							upR = r;
							break;
						}
					}
					addMsgWarnL(msgOverFlow(upR, MSBFL0122, valAct, valAct.length(), lenMax, lotInhColTyp, itmMfgInstR), itmMfgInstR);
				}
				else {
					LotInh_Upd01_Cnd01R upR = upL.get(0);
					addMsgInfoL(msgOverFlow(upR, MSBFL0123, valAct, valAct.length(), lenMax, lotInhColTyp, itmMfgInstR));
				}
			}
			
			return valAct.substring(0, lenMax);
		}
		
		protected MCMessage msgOverFlow(LotInh_Upd01_Cnd01R causeRow, String msgId, String valAct, int lenAct, int lenMax, MAC_LOT_INH_COL_TYP lotInhColTyp, LotInh_Upd01_Dtl01R itmMfgInstR) {
			return new MCMessage(causeRow, null, msgId, valAct, lenAct, lenMax, lotInhColTyp.name(MCSys.user.locale()),
					toDispItm(itmMfgInstR.itm_cd(), itmMfgInstR.itm_sub1(), itmMfgInstR.itm_sub2(), itmMfgInstR.itm_sub3()),
					itmMfgInstR.lot_no(), itmMfgInstR.sublot_no(), itmMfgInstR.itm_mfg_inst_no(), toDispGUIIndex(causeRow));
		}
		
		protected void judgeInfoLotInh(MCList<MST_LOT_R> srcLotL, String itmMfgInstNo, String lotInhColTyp) {
			//継承元ロットの継承項目が設定されていない場合は、インフォメーションを出す。
			//設定されていないの判断基準は、継承元ロットの継承項目がnullかどうか。
			//継承元ロットの継承項目がFLGの場合は、falseだから設定されていないと一概に判断できないので、判定の対象外。
			if (!isNull(srcLotL)) {
				MCList<LotInh_Upd01_Cnd01R> upL = up0().subList(LotInh_Upd01_Dtl01R.$itm_mfg_inst_no, itmMfgInstNo);
				LotInh_Upd01_Cnd01R upR = upL.get(0);
				if (upR.isStatusDelete()) {
					return;
				}
				for (MST_LOT_R r : srcLotL) {
					if (!MAC_LOT_INH_COL_TYP.isLOT_SUB_FLG1(lotInhColTyp) &&
							!MAC_LOT_INH_COL_TYP.isLOT_SUB_FLG2(lotInhColTyp) &&
							!MAC_LOT_INH_COL_TYP.isLOT_SUB_FLG3(lotInhColTyp) &&
							!MAC_LOT_INH_COL_TYP.isLOT_SUB_FLG4(lotInhColTyp) &&
							!MAC_LOT_INH_COL_TYP.isLOT_SUB_FLG5(lotInhColTyp)) {
						if (isNull(r.getValueNE(lotInhColTyp))) {
							addMsgInfoL(msgInfoLotInh(upR, MSBFL0138, MAC_LOT_INH_COL_TYP.get(lotInhColTyp).name(),
									toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
									r.lot_no(),r.sublot_no()));
						}
					}
				}
			}
		}
		protected MCMessage msgInfoLotInh(LotInh_Upd01_Cnd01R causeRow, String msgId, String lotInhColTyp,
				String srcItm, String srcLotNo, String srcSublotNo) {
			return new MCMessage(causeRow, null, msgId, lotInhColTyp, srcItm, srcLotNo, srcSublotNo,
					toDispGUIIndex(causeRow));
		}
		protected Comparable<?> getValByMin(LotInh_Upd01_Dtl01R lotInhDestR, MCList<MST_LOT_R> lotSrcL) {
			return lotSrcL.min(lotInhDestR.lot_inh_col_typ());
		}

		protected Comparable<?> getValByMax(LotInh_Upd01_Dtl01R lotInhDestR, MCList<MST_LOT_R> lotSrcL) {
			return lotSrcL.max(lotInhDestR.lot_inh_col_typ());
		}

		protected Comparable<?> getValByPrio(LotInh_Upd01_Dtl01R lotInhDestR, MCList<MST_LOT_R> lotSrcL) {
			return lotSrcL.get(0).getValue(lotInhDestR.lot_inh_col_typ());
		}
		
		protected void setValLotDest(MCList<MST_LOT_R> lotDestSubL, HashMap<String, Comparable<?>> calcRsltMap) {
			Set<String> keySet = calcRsltMap.keySet();
			if (!keySet.isEmpty()) {
				for (String key : keySet) {
					Comparable<?> val = calcRsltMap.get(key);
					lotDestSubL.setValue(key, val);
				}
			}
		}
		
		protected void updLotDest(MCList<MST_LOT_R> lotDestL, MST_LOT_R t, MCQueryApiBuilder lotDestL_bldr) {
			lotDestL_bldr.setSet(getLotInhCols());
			dbUpdateKey("MSBFL5220_MST_LOT_U01", lotDestL, lotDestL_bldr);
		}

		protected void addMsgWarnL(MCMessage msg, LotInh_Upd01_Dtl01R itmMfgInstR) {
			if (_msgWarnL == null) {
				_msgWarnL = new MCMessageList();
			}
			if (_itmMfgNoWarnSet == null) {
				_itmMfgNoWarnSet = new HashSet<>();
			}
			_itmMfgNoWarnSet.add(itmMfgInstR.itm_mfg_inst_no());
			_msgWarnL.add(msg);
		}
		
		protected void addMsgInfoL(MCMessage msg) {
			if (_msgInfoL == null) {
				_msgInfoL = new MCMessageList();
			}
			_msgInfoL.add(msg);
		}
		
		protected void handleMsg() {
			if (_msgWarnL != null) {
				boolean throwExFlg = false;
				for (LotInh_Upd01_Cnd01R r : up0()) {
					if (_itmMfgNoWarnSet.contains(r.itm_mfg_inst_no())) {
						if (!r.no_exception_flg()) {
							throwExFlg = true;
							break;
						}
					}
				}
				
				if (throwExFlg) {
					MCException ex = new MCException(msgUpdErr());
					for (MCMessage msg : _msgWarnL) {
						ex.addCauseMessage(new MCMessage(msg.getCauseRow(), msg.getCauseColumn(), MSBFL0121, (Object[])msg.getBindArray()));
					}
					throw ex;
				}
				else {
					MCMessagePool.addAll(_msgWarnL);
				}
			}
			if (_msgInfoL != null) {
				MCMessagePool.addAll(_msgInfoL);
			}
		}
		
		protected void postLotInh() {
			down0().addAll(up0());
			
			if (_itmMfgNoWarnSet == null || _itmMfgNoWarnSet.isEmpty()) {
				return ;
			}
			
			for (LotInh_Upd01_Cnd01R r : down0()) {
				if (_itmMfgNoWarnSet.contains(r.itm_mfg_inst_no())) {
					r.err_flg(true);
				}
			}
		}
		
	}
	
	/**
	 * LotInh_Upd02オペレーション.<p>
	 *
	 * 品目製造指図ＮＯを指定し、ロット継承サービスを実行する。<br>
	 */
	public class LotInh_Upd02 extends MSBFL_LotInhService_MC_A.LotInh_Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			if(isNull(up0())) {
				return;
			}
			
			MSBFL_LotInhService.LotInh_Upd01 lotInhSrv = MSBFL_LotInhService.crtLotInh_Upd01();
			for (LotInh_Upd02_Cnd01R upR : up0()) {
				LotInh_Upd01_Cnd01R tmpR = LotInh_Upd01_Cnd01R.create();
				tmpR.peg_no(upR.peg_no());
				tmpR.setAttributes(upR);
				tmpR.silent_flg(upR.silent_flg());
				tmpR.no_exception_flg(upR.no_exception_flg());
				tmpR.itm_mfg_inst_no(upR.itm_mfg_inst_no());
				lotInhSrv.up0().add(tmpR);
			}
			lotInhSrv.exec();
			
			down0().addAll(up0());
			copyErrFlg(down0(), lotInhSrv.down0());
		}
	}

	/**
	 * LotInh_Upd03オペレーション.<p>
	 *
	 * 製造実績ＮＯを指定し、ロット継承サービスを実行する。<br>
	 */
	public class LotInh_Upd03 extends MSBFL_LotInhService_MC_A.LotInh_Upd03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			if (isNull(up0())) {
				return;
			}

			MSBFL_LotInhService.LotInh_Upd01 lotInhSrv = MSBFL_LotInhService.crtLotInh_Upd01();
			for (LotInh_Upd03_Cnd01R upR : up0()) {
				LotInh_Upd01_Cnd01R tmpR = LotInh_Upd01_Cnd01R.create();
				tmpR.peg_no(upR.peg_no());
				tmpR.setAttributes(upR);
				tmpR.silent_flg(upR.silent_flg());
				tmpR.no_exception_flg(upR.no_exception_flg());
				tmpR.itm_mfg_inst_no(upR.itm_mfg_inst_no());
				tmpR.mfg_act_no(upR.mfg_act_no());
				lotInhSrv.up0().add(tmpR);
			}
			lotInhSrv.exec();
			
			down0().addAll(up0());
			copyErrFlg(down0(), lotInhSrv.down0());
		}
	}

	//FMCB CUSTOM END
}