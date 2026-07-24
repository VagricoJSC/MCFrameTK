package mcframe.serverMSBC.MSBCL6050;

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
import mcframe.serverMSBC.MSBCL6050.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.commonFXUC.FXUCC0030.FXUCC_Divide;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import static mcframe.serverMAUC.MAUCL1060.MAUCL_TrdUtil.*;
import static mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil.*;
import static mcframe.serverMSBC.MSBCL6050.Query.*;
import mcframe.commonCore.param.MCParam;
import mcframe.serverMSBF.MSBFL5010.*;
import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.serverMSBC.MSBCL6000.*;
import mcframe.serverMSBC.MSBCL6010.*;
import mcframe.serverMSBC.MSBCL6020.*;
import mcframe.serverMSBC.MSBCL6060.*;
import mcframe.serverMSBC.MSBCL6070.*;
import mcframe.serverMSBC.MSBCL6090.*;
import mcframe.serverMSBC.MSBCL6100.*;
import mcframe.serverMSBC.MSBCL6110.*;
import mcframe.serverMSBE.MSBEL5010.*;
import mcframe.serverMSBE.MSBEL5270.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSBD.MSBDL5190.*;
import mcframe.serverMSBI.MSBIL5010.*;
import mcframe.serverMAUC.MAUCL5010.*;
import java.util.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeTodayValidater;
import mcframe.serverMSBF.MSBFL5220.LotInh_Upd03_Cnd01R;
import mcframe.serverMSBF.MSBFL5220.MSBFL_LotInhService;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_MfgActRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_MfgActRegService_MC extends MSBCL_MfgActRegService_MC_A{
	//FMCB CUSTOM START

	/**
	 * MfgActReg_Chk01オペレーション.<p>
	 *
	 * 製造実績の登録・訂正・取消前チェックの共通処理<br>
	 */
	public class MfgActReg_Chk01 extends MSBCL_MfgActRegService_MC_A.MfgActReg_Chk01 {

		/**
		 * 明細からヘッダデータにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MfgActReg_Chk01_HdrR> _hdrCache;
		
		/**
		 * 明細から工程データにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MfgActReg_Chk01_DtlOperR> _operCache;
		
		/**
		 * 投入からロスにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MfgActReg_Chk01_DtlLossR>> _lossCacheForInpt;
		
		/**
		 * ヘッダから投入データにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MfgActReg_Chk01_DtlInptR>> _inptCacheForHdr;

		/**
		 * ヘッダから工程データにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MfgActReg_Chk01_DtlOperR>> _operCacheForHdr;

		/**
		 * 工程から出来高データにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MfgActReg_Chk01_DtlYieldR>> _yieldCacheForOper;

		/**
		 * 工程から副産品データにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MfgActReg_Chk01_DtlByProdR>> _byProdCacheForOper;

		/**
		 * ヘッダから投入実績にアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MfgActReg_Chk01_DtlInptR>> _inptActCacheForHdr;

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
			setCache();
			msgL.addAll(lockAndCheckBase());

			if (!msgL.isEmpty()) {
				return msgL;
			}
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			chkAndCompAfterListLogic();

			return msgL;
		}

		protected void setCache() {
			_hdrCache = new FXUCL_Cache<MfgActReg_Chk01_HdrR>();
			_hdrCache.setFixMaxCacheSize(-1);
			
			_operCache = new FXUCL_Cache<MfgActReg_Chk01_DtlOperR>();
			_operCache.setFixMaxCacheSize(-1);
		
			_lossCacheForInpt = new FXUCL_Cache<MCList<MfgActReg_Chk01_DtlLossR>>();
			_lossCacheForInpt.setFixMaxCacheSize(-1);

			_inptCacheForHdr = new FXUCL_Cache<MCList<MfgActReg_Chk01_DtlInptR>>();
			_inptCacheForHdr.setFixMaxCacheSize(-1);
			
			_operCacheForHdr = new FXUCL_Cache<MCList<MfgActReg_Chk01_DtlOperR>>();
			_operCacheForHdr.setFixMaxCacheSize(-1);
		
			_yieldCacheForOper = new FXUCL_Cache<MCList<MfgActReg_Chk01_DtlYieldR>>();
			_yieldCacheForOper.setFixMaxCacheSize(-1);
		
			_byProdCacheForOper = new FXUCL_Cache<MCList<MfgActReg_Chk01_DtlByProdR>>();
			_byProdCacheForOper.setFixMaxCacheSize(-1);
		
			MCIndexKey operKey = up1().createIndex(MfgActReg_Chk01_DtlOperR.$hdr_peg_no);
			MCIndexKey inptKey = up2().createIndex(MfgActReg_Chk01_DtlInptR.$hdr_peg_no);

			_inptActCacheForHdr = new FXUCL_Cache<MCList<MfgActReg_Chk01_DtlInptR>>();
			_inptActCacheForHdr.setFixMaxCacheSize(-1);

			MCList<MfgActReg_Chk01_DtlInptR> inptActL = getInptAct();
			MCIndexKey inptActKey = inptActL.createIndex(MfgActReg_Chk01_DtlInptR.$hdr_peg_no);
			for (MfgActReg_Chk01_HdrR hdrR : up0()) {
				MCNumber[] cacheKey = new MCNumber[]{hdrR.peg_no()};
				_hdrCache.putCache(cacheKey, hdrR);
				_operCacheForHdr.putCache(cacheKey, up1().subList(operKey, hdrR.peg_no()));
				_inptCacheForHdr.putCache(cacheKey, up2().subList(inptKey, hdrR.peg_no()));
				_inptActCacheForHdr.putCache(cacheKey, inptActL.subList(inptActKey, hdrR.peg_no()));
			}
			
			MCIndexKey yieldKey = up5().createIndex(MfgActReg_Chk01_DtlYieldR.$oper_peg_no);
			MCIndexKey byProdKey = up6().createIndex(MfgActReg_Chk01_DtlByProdR.$oper_peg_no);
			for (MfgActReg_Chk01_DtlOperR operR : up1()) {
				operR.div_seq(_hdrCache.getCache(operR.hdr_peg_no()).div_seq());
				MCNumber[] cacheKey = new MCNumber[]{operR.peg_no()};
				_operCache.putCache(cacheKey, operR);
				_yieldCacheForOper.putCache(cacheKey, up5().subList(yieldKey, operR.peg_no()));
				_byProdCacheForOper.putCache(cacheKey, up6().subList(byProdKey, operR.peg_no()));
			}
			
			MCIndexKey losskey = up3().createIndex(MfgActReg_Chk01_DtlLossR.$inpt_peg_no);
			for (MfgActReg_Chk01_DtlInptR inptR : up2()) {
				MCList<MfgActReg_Chk01_DtlLossR> lossSubL = up3().subList(losskey, inptR.peg_no());
				_lossCacheForInpt.putCache(new MCNumber[]{inptR.peg_no()}, lossSubL);
			}
			
			for (MfgActReg_Chk01_DtlYieldR yieldR : up5()) {
				yieldR.div_seq(_hdrCache.getCache(yieldR.hdr_peg_no()).div_seq());
			}
			
			for (MfgActReg_Chk01_DtlByProdR byProdR : up6()) {
				byProdR.div_seq(_hdrCache.getCache(byProdR.hdr_peg_no()).div_seq());
			}
		}

		/**
		 * 投入実績を取得する.
		 * 上り電文の投入に含まれない登録済みの投入実績を返す。
		 * @return 上り電文に含まれない投入実績
		 */
		protected MCList<MfgActReg_Chk01_DtlInptR> getInptAct() {
			MCList<MfgActReg_Chk01_DtlInptR> retL = up2().createInstance();
			MCIndexKey idxkey = up2().createIndex(MfgActReg_Chk01_DtlInptR.$hdr_peg_no, MfgActReg_Chk01_DtlInptR.$inpt_act_no);

			MCList<MST_MFG_INST_R> instL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R instL_t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder instL_bldr = MCQueryApiBuilder.create(instL_t);
			instL_bldr.setSelect(instL_t.mfg_inst_no, instL_t.itm_mfg_inst_no, instL_t.mfg_inst_unit_typ);
			dbSelectKey("MSBCL6050_MST_MFG_INST_S06", instL, instL_bldr, up0());
			MCIndexKey instIdxkey = instL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
			MCList<MfgActReg_Chk01_HdrR> hdrOperL = up0().createInstance();
			MCList<MfgActReg_Chk01_HdrR> hdrL = up0().createInstance();
			for (MfgActReg_Chk01_HdrR hdrR : up0()) {
				MST_MFG_INST_R instR = instL.getFirst(instIdxkey, hdrR.mfg_inst_no());
				if (MAC_MFG_INST_UNIT_TYP.isOPER(instR.mfg_inst_unit_typ())) {
					hdrR.itm_mfg_inst_no(instR.itm_mfg_inst_no());
					hdrOperL.add(hdrR);
				}
				else {
					hdrL.add(hdrR);
				}
			}

			// 投入実績を取得
			MCIndexKey iaIdxkey = null;
			MCList<MST_INPT_ACT_R> iaL = MCList.create(MST_INPT_ACT_R.class);
			MST_INPT_ACT_R iaL_t = MST_INPT_ACT_R.create("T");
			MCQueryApiBuilder iaL_bldr = MCQueryApiBuilder.create(iaL_t);
			MSVT_LOT_LIST_R t2 = MSVT_LOT_LIST_R.create("T2");
			MST_INPT_SCHD_R t3 = MST_INPT_SCHD_R.create("T3");
			iaL_bldr.setSelect(iaL_t.inpt_act_no);
			iaL_bldr.addSelect(iaL_t.mfg_act_no);
			iaL_bldr.addSelect(iaL_t.itm_mfg_inst_no);
			iaL_bldr.addSelect(iaL_t.lot_no);
			iaL_bldr.addSelect(iaL_t.sublot_no);
			iaL_bldr.addSelect(t2.vld_dt);
			iaL_bldr.addSelect(t2.first_gr_dt);
			iaL_bldr.addSelect(t2.lot_seq);
			iaL_bldr.addInnerJoin(t2, bracket(iaL_t.itm_cd.eq(t2.itm_cd)
					.and(iaL_t.itm_sub1.eq(t2.itm_sub1))
					.and(iaL_t.itm_sub2.eq(t2.itm_sub2))
					.and(iaL_t.itm_sub3.eq(t2.itm_sub3))
					.and(iaL_t.lot_no.eq(t2.lot_no))
					.and(iaL_t.sublot_no.eq(t2.sublot_no))));
			iaL_bldr.addInnerJoin(t3, bracket(iaL_t.inpt_schd_no.eq(t3.inpt_schd_no)));
			iaL_bldr.addConstWhereWithAnd(t3.main_itm_flg.eq(value(true)));
			// 製造指図単位区分：工程単位
			dbSelectColumn("MSBCL6050_MST_INPT_ACT_S04", iaL, iaL_bldr, MST_INPT_ACT_R.$itm_mfg_inst_no, hdrOperL, MfgActReg_Chk01_HdrR.$itm_mfg_inst_no);
			iaIdxkey = iaL.createIndex(MST_INPT_ACT_R.$itm_mfg_inst_no);
			for (MfgActReg_Chk01_HdrR hdrR : hdrOperL) {
				MCList<MST_INPT_ACT_R> subL = iaL.subList(iaIdxkey, hdrR.itm_mfg_inst_no());
				for (MST_INPT_ACT_R subR : subL) {
					if (up2().contains(idxkey, hdrR.peg_no(), subR.inpt_act_no())) {
						continue;
					}
					MfgActReg_Chk01_DtlInptR r = MfgActReg_Chk01_DtlInptR.create();
					r.hdr_peg_no(hdrR.peg_no());
					r.inpt_act_no(subR.inpt_act_no());
					r.lot_no(subR.lot_no());
					r.sublot_no(subR.sublot_no());
					r.vld_dt(subR.getDateNE("vld_dt"));
					r.first_gr_dt(subR.getDateNE("first_gr_dt"));
					r.lot_seq(subR.getStringNE("lot_seq"));
					r.main_itm_flg(true);
					retL.add(r);
				}
			}
			// 製造指図単位区分：品目単位
			iaL.clear();
			iaL_bldr.clearWhere();
			dbSelectColumn("MSBCL6050_MST_INPT_ACT_S05", iaL, iaL_bldr, MST_INPT_ACT_R.$mfg_act_no, hdrL, MfgActReg_Chk01_HdrR.$mfg_act_no);
			iaIdxkey = iaL.createIndex(MST_INPT_ACT_R.$mfg_act_no);
			for (MfgActReg_Chk01_HdrR hdrR : hdrL) {
				MCList<MST_INPT_ACT_R> subL = iaL.subList(iaIdxkey, hdrR.mfg_act_no());
				for (MST_INPT_ACT_R subR : subL) {
					if (up2().contains(idxkey, hdrR.peg_no(), subR.inpt_act_no())) {
						continue;
					}
					MfgActReg_Chk01_DtlInptR r = MfgActReg_Chk01_DtlInptR.create();
					r.hdr_peg_no(hdrR.peg_no());
					r.inpt_act_no(subR.inpt_act_no());
					r.lot_no(subR.lot_no());
					r.sublot_no(subR.sublot_no());
					r.vld_dt(subR.getDateNE("vld_dt"));
					r.first_gr_dt(subR.getDateNE("first_gr_dt"));
					r.lot_seq(subR.getStringNE("lot_seq"));
					r.main_itm_flg(true);
					retL.add(r);
				}
			}
			return retL;
		}

		/**
		 * トランザクションデータのロック・チェック・補完
		 * @return
		 */
		protected MCMessageList lockAndCheckBase() {
			// 本メソッド内での補完処理は、トランザクションデータを元にした補完を対象とする
			// ※本メソッド実行時点では、まだリストロジックによる補完が行われていないため、
			// マスタ項目を元にした補完などは、後続の処理においても行われる

			MCMessageList msgL = new MCMessageList();

			// 製造指図、製造実績のロック・チェック・補完
			msgL.addAll(chkAndCompHdrBase());

			// 工程実績のチェック・補完
			msgL.addAll(chkAndCompOperBase());
			copyErrFlg(up0(), up1(), MfgActReg_Upd01_HdrR.$peg_no, MfgActReg_Upd01_DtlOperR.$hdr_peg_no);
			
			// 投入実績のチェック・補完
			msgL.addAll(chkAndCompInptBase());
			copyErrFlg(up0(), up2(), MfgActReg_Upd01_HdrR.$peg_no, MfgActReg_Upd01_DtlInptR.$hdr_peg_no);

			// ロス実績のチェック・補完（現状は補完処理のみ）
			msgL.addAll(chkAndCompLossBase());

			// 工数実績のチェック・補完
			msgL.addAll(chkAndCompWkBase());
			copyErrFlg(up0(), up4(), MfgActReg_Upd01_HdrR.$peg_no, MfgActReg_Upd01_DtlWkR.$hdr_peg_no);

			// 出来高実績のチェック・補完
			msgL.addAll(chkAndCompYieldBase());
			copyErrFlg(up0(), up5(), MfgActReg_Upd01_HdrR.$peg_no, MfgActReg_Upd01_DtlYieldR.$hdr_peg_no);

			// 副産品実績のチェック・補完
			msgL.addAll(chkAndCompByProdBase());
			copyErrFlg(up0(), up5(), MfgActReg_Upd01_HdrR.$peg_no, MfgActReg_Upd01_DtlByProdR.$hdr_peg_no);

			return msgL;
		}

		protected MCMessageList chkAndCompHdrBase() {
			MCMessageList msgL = new MCMessageList();

			// 製造指図、製造指図進捗、品目製造指図、製造実績、品目マスタ、品目マスタ（ＷＧ）、工程指図、工程実績の取得
			MCList<MfgActReg_Chk01_HdrR> miBindL = up0().groupBy(MfgActReg_Chk01_HdrR.$mfg_inst_no);
			MCList<MST_MFG_INST_R> miL = getMfgInst(miBindL);
			MCIndexKey mikey = miL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
			
			MCList<MST_MFG_ACT_REM_R> prL = getMfgInstPr(miBindL);
			MCIndexKey prKey = prL.createIndex(MST_MFG_ACT_REM_R.$mfg_inst_no);

			MCList<MST_MFG_ACT_R> maL = getMfgAct();
			MCIndexKey makey = maL.createIndex(MST_MFG_ACT_R.$mfg_act_no);

			MCList<MST_ITM_MFG_INST_R> imiL = getItmMfgInst(miL);
			MCIndexKey imiKey = imiL.createIndex(MST_ITM_MFG_INST_R.$itm_mfg_inst_no);
			
			doMasterCache(imiL);

			for (MfgActReg_Chk01_HdrR r :up0()) {
				MST_MFG_INST_R miR = miL.getFirst(mikey, r.mfg_inst_no());
				if (!isNull(r.mfg_inst_no())) {
					if (r.upd_cntr_chk_flg()) {
						msgL.addAll(checkUpdCntrNE(r, MfgActReg_Chk01_HdrR.$mfg_inst_upd_cntr, miR));
					}
					else {
						if (isNull(miR)) {
							msgL.addAll(getRecordNotFoundMsg("MS", "MST_MFG_INST"
									, new String[]{MST_MFG_INST_R.$mfg_inst_no}
									, new Comparable[]{r.mfg_inst_no()}, r));
							r.err_flg(true);
						}
					}
					setErrFlg(r, msgL);
				}
				
				MST_MFG_ACT_REM_R prR = prL.getFirst(prKey, r.mfg_inst_no());
				if (!r.err_flg() && !isNull(r.mfg_inst_no())) {
					if (r.upd_cntr_chk_flg()) {
						msgL.addAll(checkUpdCntrNE(r, MfgActReg_Chk01_HdrR.$mfg_inst_pr_upd_cntr, prR));
					}
					setErrFlg(r, msgL);
					// 製造進捗の存在チェックは行わないで良い（製造指図テーブルの存在チェックで十分なため）
				}

				MST_MFG_ACT_R maR = maL.getFirst(makey, r.mfg_act_no());
				if (!r.err_flg() && !isNull(r.mfg_act_no())) {
					if (r.upd_cntr_chk_flg()) {
						msgL.addAll(checkUpdCntrNE(r, MfgActReg_Chk01_HdrR.$mfg_act_upd_cntr, maR));
					}
					else {
						if (isNull(maR)) {
							msgL.addAll(getRecordNotFoundMsg("MS", "MST_MFG_ACT"
									, new String[]{MST_MFG_ACT_R.$mfg_act_no}
									, new Comparable[]{r.mfg_act_no()}, r));
							r.err_flg(true);
						}
					}
					setErrFlg(r, msgL);
				}
				
				if (r.err_flg()) {
					continue;
				}
				
				MST_ITM_MFG_INST_R imiR = imiL.getFirst(imiKey, miR.itm_mfg_inst_no());

				msgL.addAll(chkAndCompHdrBaseSub(r, miR, prR, maR, imiR));
			}
			
			// ・外注用チェック
			// 入荷実績または仕入実績が存在しているかを確認
			// ※トランザクションから補完後の生産方法区分を元に外注だけのコンテナを作成
			MCList<MfgActReg_Chk01_HdrR> arrChkL = up0().subList(
					r -> MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ()) && !r.err_flg());

			// 入荷実績が存在しているかを確認
			MCList<MST_ARR_SCHD_R> arrL = getArr(arrChkL);
			MCIndexKey arrKey = arrL.createIndex(MST_ARR_SCHD_R.$mfg_inst_no);
			for (MfgActReg_Chk01_HdrR r : arrChkL) {
				r.arr_purc_exist_flg(
						!isNull(arrL.getFirst(arrKey, r.mfg_inst_no())));
			}
			// 入荷実績が存在していない場合は、仕入実績の存在を確認
			MCList<MfgActReg_Chk01_HdrR> purcChkL = arrChkL
					.subList(MfgActReg_Chk01_HdrR.$arr_purc_exist_flg, false);
			MCList<MST_ARR_SCHD_R> purcL = getPurc(purcChkL);
			MCIndexKey purcKey = purcL.createIndex(MST_ARR_SCHD_R.$mfg_inst_no);
			for (MfgActReg_Chk01_HdrR r : arrChkL) {
				if (!r.arr_purc_exist_flg()) {
					r.arr_purc_exist_flg(
							!isNull(purcL.getFirst(purcKey, r.mfg_inst_no())));
				}
				
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && r.arr_purc_exist_flg()) {
					msgL.add(new MCMessage(r, null, MSBCL1041, toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}

			// ・工程の完了時のチェック
			// 完了した製造実績に紐付く工程が全て完了していなければエラーとするためのチェック処理
			// ※上り電文に全ての工程が含まれるわけではないため、工程指図や工程実績残をDBからselectする必要がある
			MCList<MfgActReg_Chk01_HdrR> cmplChkL = up0()
					.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())
							&& MSC_MFG_STS_TYP.isCMPL(r.mfg_sts_typ()) && !r.err_flg());
			
			if (!cmplChkL.isEmpty()) {
				MCList<MfgActReg_Chk01_HdrR> crtL = MCList.create(MfgActReg_Chk01_HdrR.class);
				MCList<MfgActReg_Chk01_HdrR> updL = MCList.create(MfgActReg_Chk01_HdrR.class);
				for (MfgActReg_Chk01_HdrR cmplChkR : cmplChkL) {
					if (MAC_DATA_CRUD_TYP.isCRT(cmplChkR.data_crud_typ())) {
						crtL.add(cmplChkR);
					}
					else if (MAC_DATA_CRUD_TYP.isUPD(cmplChkR.data_crud_typ())) {
						updL.add(cmplChkR);
					}
				}
				// 新規の場合は、まだ工程実績残が存在しないため工程指図を取得
				MCList<MST_OPER_INST_R> oiL = getCmplHdrOperInst(crtL);
				MCIndexKey oiIdxKey = oiL.createIndex(MST_OPER_INST_R.$mfg_inst_no);
				// 更新の場合は、工程実績残を取得
				MCList<MST_OPER_ACT_REM_R> oaRemL = MCList.create(MST_OPER_ACT_REM_R.class);
				if (cmplChkL.get(0).lst_reg_flg()) {
					oaRemL = getOperActRemCmpl(updL);
				} else {
					oaRemL = getOperActRemCmplRel(updL);
				}
				MCIndexKey oaRemKey = oaRemL.createIndex(MST_OPER_ACT_REM_R.$mfg_inst_no, MST_OPER_ACT_REM_R.$div_seq);
				
				for (MfgActReg_Chk01_HdrR r : cmplChkL) {
					MCList<MST_OPER_INST_R> oiSubL = oiL.subList(oiIdxKey, r.mfg_inst_no());
					MCList<MST_OPER_ACT_REM_R> oaRemSubL = oaRemL
							.subList(oaRemKey, r.mfg_inst_no(), r.div_seq());
					msgL.addAll(chkOperCmpl(r, oiSubL, oaRemSubL));
				}
			}
			
			// ・工程実績が１件でも存在するかどうかのチェック
			// 上り電文の工程実績に削除以外の行が存在せず、工程実績残に着手中以降の行が存在しない場合はエラーとする
			MCList<MfgActReg_Chk01_HdrR> existsChkL = up0()
					.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && !r.err_flg());
			if (!existsChkL.isEmpty()) {
				// 上り電文に存在しない工程実績残の取得
				MCList<MST_OPER_ACT_REM_R> oaRemL = getOperActRemCmpl(
						existsChkL);
				MCIndexKey oaRemKey = oaRemL.createIndex(MST_OPER_ACT_REM_R.$mfg_inst_no,
						MST_OPER_ACT_REM_R.$div_seq);

				// 同じ工程指図に対する工程実績が複数ある場合、判定条件に追加しないといけない
				MCList<MST_OPER_ACT_R> oaL = MCList.create(MST_OPER_ACT_R.class);
				MST_OPER_ACT_R t = MST_OPER_ACT_R.create("T");
				MCQueryApiBuilder oaL_bldr = MCQueryApiBuilder.create(t);
				oaL_bldr.setSelect(t.oper_inst_no, t.oper_act_no, t.mfg_act_no);
				oaL_bldr.setWhere(t.mfg_act_no.eq(bind("mfg_act_no")));
				dbSelect("MSBCL6050_MST_OPER_ACT_S01",
						oaL, oaL_bldr, existsChkL.groupBy(MfgActReg_Chk01_HdrR.$mfg_act_no));
				MCIndexKey oaKey = oaL.createIndex(MfgActReg_Chk01_HdrR.$mfg_act_no);
				for (MfgActReg_Chk01_HdrR r : existsChkL) {
					// 工程の上り電文の取得
					MCList<MfgActReg_Chk01_DtlOperR> upL = _operCacheForHdr
							.getCache(r.peg_no());
					// 工程実績残の取得
					MCList<MST_OPER_ACT_REM_R> oaRemSubL = oaRemL
							.subList(oaRemKey, r.mfg_inst_no(), r.div_seq());

					// 上り電文または実績残のどちらにも実績が存在しない場合はエラー
					if (!existsOperActInUp(upL) && !existsOperActInRem(oaRemSubL)) {
						boolean hasOperActFlg = false;
						MCIndexKey upOperIdxkey = upL.createIndex(
								MfgActReg_Chk01_DtlOperR.$oper_inst_no,
								MfgActReg_Chk01_DtlOperR.$oper_act_no);
						for (MST_OPER_ACT_R oaR : oaL.subList(oaKey, r.mfg_act_no())) {
							if (isNull(upL.getFirst(upOperIdxkey, oaR.oper_inst_no(), oaR.oper_act_no()))) {
								hasOperActFlg = true;
								break;
							}
						}
						// ＤＢに同じ工程指図に対する工程実績が複数件あって、削除されない工程実績がある場合、エラーとしない
						if (hasOperActFlg) {
							continue;
						}
						msgL.add(new MCMessage(r, null, MSBCL1054, r.mfg_inst_no(),
								r.mfg_act_no(), toDispGUIIndex(r)));
					}
				}
			}
			
			// 工数実績一覧登録から追加した製造指図紐付きの実績が存在するかどうかのチェック
			// 取消時に存在する場合はエラーとする
			MCList<MfgActReg_Chk01_HdrR> wkActChkL = up0().subList(
					r -> MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && !r.err_flg());
			if (!wkActChkL.isEmpty()) {
				// 計画外の工数実績の取得
				MCList<MST_WK_ACT_R> wkActL = getUnschdWkAct(wkActChkL);
				MCIndexKey wkActKey = wkActL.createIndex(MST_WK_ACT_R.$mfg_act_no);
				for (MfgActReg_Chk01_HdrR r : wkActChkL) {
					MST_WK_ACT_R wkActR = wkActL.getFirst(wkActKey, r.mfg_act_no());
					if (!isNull(wkActR)) {
						msgL.add(new MCMessage(r, null, MSBCL1136, r.mfg_act_no(), toDispGUIIndex(r)));
					}
				}
			}
			
			msgL.addAll(chkMfgActRemQty(miL, prL));
			return msgL;
		}

		protected MCMessageList chkMfgActRemQty(MCList<MST_MFG_INST_R> miL, MCList<MST_MFG_ACT_REM_R> prL) {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MfgActReg_Chk01_HdrR> notErrL = getChkList(up0());
			MCIndexKey mikey = miL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
			MCIndexKey prKey = prL.createIndex(MST_MFG_ACT_REM_R.$mfg_inst_no);

			for (MCList<MfgActReg_Chk01_HdrR> gl : notErrL.groupList(MfgActReg_Chk01_HdrR.$mfg_inst_no)) {
				MCList<MfgActReg_Chk01_HdrR> crtL = gl.subList(r -> MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()));
				if (isNull(crtL)) {
					continue;
				}

				MfgActReg_Chk01_HdrR hdrR = crtL.get(0);
				MST_MFG_ACT_REM_R actRemR = prL.getFirst(prKey, hdrR.mfg_inst_no());
				MST_MFG_INST_R instR = miL.getFirst(mikey, hdrR.mfg_inst_no());
				
				MCNumber dbRemQty = instR.base_unit_inst_qty().subtract(actRemR.base_unit_mfg_qty());
				MCNumber inptQty = crtL.sum(MfgActReg_Chk01_HdrR.$base_unit_st_act_qty);

				if (inptQty.gt(dbRemQty)) {
					msgL.add(new MCMessage(hdrR, null, MSBCL1204, hdrR.mfg_inst_no(), toDispGUIIndex(hdrR)));
					gl.setBoolean(MfgActReg_Chk01_HdrR.$err_flg, true);
				}
			}
			
			return msgL;
		}
		/**
		 * 工程の上り電文に削除行以外の行が存在する場合はtrueを返す
		 * @param upL
		 * @return
		 */
		protected boolean existsOperActInUp(MCList<MfgActReg_Chk01_DtlOperR> upL) {
			for (MfgActReg_Chk01_DtlOperR r : upL) {
				if (!r.isStatusDelete()) {
					return true;
				}
			}
			return false;
		}

		/**
		 * 工程実績残に着手中または完了の行が存在する場合はtrueを返す
		 * @param remL
		 * @return
		 */
		protected boolean existsOperActInRem(MCList<MST_OPER_ACT_REM_R> remL) {
			for (MST_OPER_ACT_REM_R r: remL) {
				if (MSC_MFG_STS_TYP.isSTT(r.mfg_sts_typ()) || MSC_MFG_STS_TYP.isCMPL(r.mfg_sts_typ())) {
					return true;
				}
			}
			return false;
		}
		
		/**
		 * 製造実績完了時に工程実績がすべて完了しているかどうかのチェック
		 * @return
		 */
		protected MCMessageList chkOperCmpl(MfgActReg_Chk01_HdrR r,
				MCList<MST_OPER_INST_R> oiSubL,
				MCList<MST_OPER_ACT_REM_R> oaRemSubL) {
			MCMessageList msgL = new MCMessageList();
			
			// 工程の終了実績日の指定を促すメッセージ
			MCMessage msg1 = new MCMessage(r, null, MSBCL1094, r.mfg_inst_no(),
					toDispGUIIndex(r));
			
			if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				// 新規の場合
				if (!oiSubL.isEmpty()) {
					// 上り電文に存在しない工程が存在した場合
					msgL.add(msg1);
					r.err_flg(true);
					return msgL;
				}
				MCList<MfgActReg_Chk01_DtlOperR> operL = _operCacheForHdr
						.getCache(r.peg_no());
				for (MfgActReg_Chk01_DtlOperR operR : operL) {
					// 上り電文に存在するが完了しているかどうかのチェック
					if (isNull(operR.end_act_tm())) {
						// 工程の終了実績日がNULLの行が存在した場合
						msgL.add(msg1);
						r.err_flg(true);
						return msgL;
					}
					if (operR.not_cmpl_flg()) {
						// 未完了フラグがオンの行が存在した場合
						msgL.add(msg1);
						r.err_flg(true);
						return msgL;
					}
				}
			}
			else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
				// 更新の場合
				Set<String> cmplOperInstNo = new HashSet<String>();
				// 上り電文に存在しない工程が完了しているかどうかのチェック
				for (MST_OPER_ACT_REM_R oaRemSubR : oaRemSubL) {
					if (!MSC_MFG_STS_TYP.isCMPL(oaRemSubR.mfg_sts_typ())) {
						// 未完了の工程実績が存在した場合falseを返す
						msgL.add(msg1);
						r.err_flg(true);
						return msgL;
					}
					else {
						cmplOperInstNo.add(oaRemSubR.oper_inst_no());
					}
				}
				
				// 上り電文に存在する工程が完了しているかどうかのチェック
				MCList<MfgActReg_Chk01_DtlOperR> delL = MCList.create(MfgActReg_Chk01_DtlOperR.class);
				MCList<MfgActReg_Chk01_DtlOperR> operL = _operCacheForHdr
						.getCache(r.peg_no());
				for (MfgActReg_Chk01_DtlOperR operR : operL) {
					if (operR.isStatusDelete()) {
						delL.add(operR);
					}
					else if (isNull(operR.end_act_tm())) {
						// 削除行以外で、工程の終了実績日がNULLの行が存在した場合
						msgL.add(msg1);
						r.err_flg(true);
						return msgL;
					}
					else if (operR.not_cmpl_flg()) {
						// 未完了フラグがオンの行が存在した場合
						msgL.add(msg1);
						r.err_flg(true);
						return msgL;
					}
					else {
						cmplOperInstNo.add(operR.oper_inst_no());
					}
				}
				
				for (MfgActReg_Chk01_DtlOperR delR : delL) {
					if (!cmplOperInstNo.contains(delR.oper_inst_no())) {
						// 工程実績が行削除された場合
						// ※ただし、その工程実績を削除しても同一工程指図ＮＯで完了した工程実績が存在する場合は、エラーとはしない
						msgL.add(new MCMessage(delR, null, MSBCL1126, r.mfg_inst_no(),
										delR.oper_act_no(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
			}
			return msgL;
		}

		/**
		 * 製造指図を取得する
		 * @return　mfgInstL
		 */
		protected MCList<MST_MFG_INST_R> getMfgInst(MCList<MfgActReg_Chk01_HdrR> miBindL) {
			MST_PO_D_R t2 = MST_PO_D_R.create("T2");
			MST_PO_R t3 = MST_PO_R.create("T3");
			MSVT_MFG_INST_PR_R t4 = MSVT_MFG_INST_PR_R.create("T4");
			MCList<MST_MFG_INST_R> mfgInstL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder mfgInstL_bldr = MCQueryApiBuilder.create(t);
			mfgInstL_bldr.setSelect(
					t.mfg_inst_no,
					t.po_d_no,
					t.mfg_inst_unit_typ,
					t.aprv_dt,
					t.mfg_aprv_sts_typ,
					t.aprv_flg,
					t.mfg_aprv_role_cd,
					t.itm_mfg_inst_no,
					t.base_unit_inst_qty,
					t.upd_cntr,
					t3.po_no
					);
			mfgInstL_bldr.addSelect(t3.aprv_sts_typ.as("po_aprv_sts_typ"));
			mfgInstL_bldr.addSelect(t4.base_unit_mfg_abort_qty);
			mfgInstL_bldr.addLeftOuterJoin(t2, bracket(t.po_d_no.eq(t2.po_d_no)));
			mfgInstL_bldr.addLeftOuterJoin(t3, bracket(t2.po_no.eq(t3.po_no)));
			mfgInstL_bldr.addInnerJoin(t4, bracket(t.mfg_inst_no.eq(t4.mfg_inst_no)));
			mfgInstL_bldr.setLockTable(t.mfg_inst_no);
			dbSelectKeyForUpdateNoWait("MSBCL6050_MST_MFG_INST_S01", mfgInstL, mfgInstL_bldr, miBindL);
			
			lockPo(mfgInstL);
			
			return mfgInstL;
		}
		
		protected void lockPo(MCList<MST_MFG_INST_R> mfgInstL) {
			MCList<MST_PO_R> poBindL = MCList.create(MST_PO_R.class);
			for (MST_MFG_INST_R instR : mfgInstL) {
				String poNo = instR.getStringNE(MST_PO_R.$po_no);
				if (!isNull(poNo)) {
					MST_PO_R tmp = MST_PO_R.create();
					tmp.po_no(poNo);
					poBindL.add(tmp);
				}
			}
			if (!poBindL.isEmpty()) {
				MST_PO_R t = MST_PO_R.create("T");
				MCQueryApiBuilder poBuilder = MCQueryApiBuilder.create(t);
				poBuilder.setSelect(t.po_no);
				poBuilder.setOrderByAsc(t.po_no);
				dbSelectKeyForUpdateNoFetch("MSBCL6050_MST_PO_S01", poBuilder, poBindL);
			}
		}

		/**
		 * 製造指図進捗を取得する
		 * @return　mfgInstL
		 */
		protected MCList<MST_MFG_ACT_REM_R> getMfgInstPr(MCList<MfgActReg_Chk01_HdrR> miBindL) {
			// 製造指図進捗=分割連番0の製造実績残
			MCList<MST_MFG_ACT_REM_R> mfgInstPrL = MCList.create(MST_MFG_ACT_REM_R.class);
			MST_MFG_ACT_REM_R t = MST_MFG_ACT_REM_R.create("T");
			MCQueryApiBuilder mfgInstPrL_bldr = MCQueryApiBuilder.create(t);
			mfgInstPrL_bldr.setSelect(
					t.mfg_inst_no,
					t.base_unit_mfg_qty,
					t.mfg_sts_typ,
					t.upd_cntr
					);
			mfgInstPrL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			mfgInstPrL_bldr.addWhereWithAnd(t.div_seq.eq(value(0)));
			dbSelectForUpdateNoWait("MSBCL6050_MST_MFG_ACT_REM_S01", mfgInstPrL, mfgInstPrL_bldr, miBindL);

			return mfgInstPrL;
		}

		/**
		 * 品目製造指図を取得する
		 * @return　itmMfgInstL
		 */
		protected MCList<MST_ITM_MFG_INST_R> getItmMfgInst(MCList<MST_MFG_INST_R> miL) {
			MCList<MST_ITM_MFG_INST_R> itmMfgInstL = MCList.create(MST_ITM_MFG_INST_R.class);
			MST_ITM_MFG_INST_R t = MST_ITM_MFG_INST_R.create("T");
			MCQueryApiBuilder itmMfgInstL_bldr = MCQueryApiBuilder.create(t);
			itmMfgInstL_bldr.setSelect(
					t.itm_mfg_inst_no,
					t.itm_cd,
					t.itm_sub1,
					t.itm_sub2,
					t.itm_sub3,
					t.lot_no,
					t.sublot_no,
					t.sno1,
					t.sno2,
					t.sno3,
					t.sno4,
					t.base_unit_inst_qty,
					t.bom_ptn,
					t.mfg_loc_cd,
					t.mfg_str_ln_cd,
					t.site_cd,
					t.wg_cd,
					t.itm_ord_no,
					t.mfg_mtd_typ,
					t.sppl_cd
					);
			dbSelectKey("MSBCL6050_MST_ITM_MFG_INST_S01",
					itmMfgInstL, itmMfgInstL_bldr, miL.groupBy(MST_MFG_INST_R.$itm_mfg_inst_no));
			return itmMfgInstL;
		}

		/**
		 * 製造実績を取得する
		 * @return　mfgActL
		 */
		protected MCList<MST_MFG_ACT_R> getMfgAct() {
			MCList<MST_MFG_ACT_R> mfgActL = MCList.create(MST_MFG_ACT_R.class);
			MST_MFG_ACT_R t = MST_MFG_ACT_R.create("T");
			MCQueryApiBuilder mfgActL_bldr = MCQueryApiBuilder.create(t);
			mfgActL_bldr.setSelect(
					t.mfg_act_no,
					t.base_unit_yield_qty,
					t.base_unit_dfct_qty,
					t.act_prnt_flg,
					t.seq,
					t.mfg_aprv_sts_typ,
					t.end_act_tm,
					t.st_ac_dt,
					t.end_ac_dt,
					t.arr_purc_auto_reg_flg,
					t.upd_cntr);
			dbSelectKeyForUpdateNoWait("MSBCL6050_MST_MFG_ACT_S01", mfgActL, mfgActL_bldr, up0());

			return mfgActL;
		}

		protected MCList<MST_ARR_SCHD_R> getArr(MCList<MfgActReg_Chk01_HdrR> arrChkL) {
			MST_ARR_ACT_R t2 = MST_ARR_ACT_R.create("T2");
			MCList<MST_ARR_SCHD_R> arrL = MCList.create(MST_ARR_SCHD_R.class);
			MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder arrL_bldr = MCQueryApiBuilder.create(t);
			arrL_bldr.setSelect(t.mfg_inst_no);
			arrL_bldr.addInnerJoin(t2, bracket(t.arr_schd_no.eq(t2.arr_schd_no)
					.and(t2.can_flg.eq(value(false)))));
			arrL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			if (!arrChkL.isEmpty()) {
				dbSelectForUpdate("MSBCL6050_MST_ARR_SCHD_S01",
						arrL, arrL_bldr, arrChkL.groupBy(MfgActReg_Chk01_HdrR.$mfg_inst_no));
			}
			return arrL;
		}

		protected MCList<MST_ARR_SCHD_R> getPurc(MCList<MfgActReg_Chk01_HdrR> purcChkL) {
			MST_PURC_SCHD_R t2 = MST_PURC_SCHD_R.create("T2");
			MST_PURC_ACT_D_R t3 = MST_PURC_ACT_D_R.create("T3");
			MST_PURC_ACT_R t4 = MST_PURC_ACT_R.create("T4");
			MCList<MST_ARR_SCHD_R> purcL = MCList.create(MST_ARR_SCHD_R.class);
			MST_ARR_SCHD_R t = MST_ARR_SCHD_R.create("T");
			MCQueryApiBuilder purcL_bldr = MCQueryApiBuilder.create(t);
			purcL_bldr.setSelect(t.mfg_inst_no);
			purcL_bldr.addInnerJoin(t2, bracket(t.arr_schd_no.eq(t2.arr_schd_no)));
			purcL_bldr.addInnerJoin(t3, bracket(t2.purc_schd_no.eq(t3.purc_schd_no)));
			purcL_bldr.addInnerJoin(t4, bracket(t3.purc_act_no.eq(t4.purc_act_no)
					.and(t3.purc_act_seq.eq(t4.purc_act_seq))
					.and(t4.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))));
			purcL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			if (!purcChkL.isEmpty()) {
				dbSelectForUpdate("MSBCL6050_MST_ARR_SCHD_S02",
						purcL, purcL_bldr, purcChkL.groupBy(MfgActReg_Chk01_HdrR.$mfg_inst_no));
			}
			return purcL;
		}
		
		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache;
		protected FXUCL_MCDbcCache<MAVM_ITM_WG_R> _itmWgCache;
		
		protected void doMasterCache(MCList<MST_ITM_MFG_INST_R> imiL) {
			MAM_ITM_R itmL_t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(itmL_t);
			itmL_bldr.setSelect(
					itmL_t.sno1_mng_typ,
					itmL_t.sno2_mng_typ,
					itmL_t.sno3_mng_typ,
					itmL_t.sno4_mng_typ,
					itmL_t.lot_mng_typ,
					itmL_t.lot_no_typ,
					itmL_t.lot_no_ptn_cd,
					itmL_t.sublot_mng_typ,
					itmL_t.sublot_no_typ,
					itmL_t.sublot_no_ptn_cd,
					itmL_t.unit_cd,
					itmL_t.dec_place,
					itmL_t.rnd_typ
					);
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(itmL_bldr, imiL,
					MST_ITM_MFG_INST_R.$itm_cd, MST_ITM_MFG_INST_R.$itm_sub1,
					MST_ITM_MFG_INST_R.$itm_sub2, MST_ITM_MFG_INST_R.$itm_sub3);
			
			MAVM_ITM_WG_R itmWgL_t = MAVM_ITM_WG_R.create("T");
			MCQueryApiBuilder itmWgL_bldr = MCQueryApiBuilder.create(itmWgL_t);
			itmWgL_bldr.setSelect(itmWgL_t.inpt_itm_add_flg);
			_itmWgCache = new FXUCL_MCDbcCache<MAVM_ITM_WG_R>(itmWgL_bldr, imiL,
					MST_ITM_MFG_INST_R.$itm_cd, MST_ITM_MFG_INST_R.$itm_sub1,
					MST_ITM_MFG_INST_R.$itm_sub2, MST_ITM_MFG_INST_R.$itm_sub3, MST_ITM_MFG_INST_R.$wg_cd);
		}
		
		/**
		 * ヘッダのデータ更新区分が新規の行に対して、上り電文に含まれない工程の工程指図を取得する
		 * @return
		 */
		protected MCList<MST_OPER_INST_R> getCmplHdrOperInst(MCList<MfgActReg_Chk01_HdrR> bindL) {
			MCList<MST_OPER_INST_R> dbL = MCList.create(MST_OPER_INST_R.class);
			MST_OPER_INST_R t = MST_OPER_INST_R.create("T");
			MCQueryApiBuilder dbL_bldr = MCQueryApiBuilder.create(t);
			dbL_bldr.setSelect(t.oper_inst_no, t.mfg_inst_no);
			dbL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			dbL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBCL6050_MST_OPER_INST_S01",
					dbL, dbL_bldr, bindL.groupBy(MfgActReg_Chk01_HdrR.$mfg_inst_no));
			
			MCList<MST_OPER_INST_R> retL = MCList.create(MST_OPER_INST_R.class);
			if (!dbL.isEmpty()) {
				// 上り電文に存在する工程指図は除外する
				MCIndexKey idxkey = up1().createIndex(MfgActReg_Chk01_DtlOperR.$oper_inst_no);
				for (MST_OPER_INST_R dbR : dbL) {
					MfgActReg_Chk01_DtlOperR operUpR = up1().getFirst(idxkey, dbR.oper_inst_no());
					if (isNull(operUpR)) {
						retL.add(dbR);
					}
				}
			}
			return retL;
		}

		/**
		 * ヘッダのデータ更新区分が更新の行に対して、上り電文に含まれない工程の工程実績残を取得する
		 * @return
		 */
		protected MCList<MST_OPER_ACT_REM_R> getOperActRemCmpl(MCList<MfgActReg_Chk01_HdrR> bindL) {
			MCList<MST_OPER_ACT_REM_R> dbL = MCList.create(MST_OPER_ACT_REM_R.class);
			MST_OPER_ACT_REM_R t = MST_OPER_ACT_REM_R.create("T");
			MCQueryApiBuilder dbL_bldr = MCQueryApiBuilder.create(t);
			dbL_bldr.setSelect(t.oper_inst_no, t.mfg_inst_no, t.div_seq, t.mfg_sts_typ);
			dbL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			dbL_bldr.addWhereWithAnd(t.div_seq.eq(bind("div_seq")));
			dbSelect("MSBCL6050_MST_OPER_ACT_REM_S01",
					dbL, dbL_bldr, bindL.groupBy(MfgActReg_Chk01_HdrR.$mfg_inst_no, MfgActReg_Chk01_HdrR.$div_seq));
			
			MCList<MST_OPER_ACT_REM_R> retL = MCList.create(MST_OPER_ACT_REM_R.class);
			if (!dbL.isEmpty()) {
				// 上り電文に存在する工程実績残は除外する
				MCIndexKey idxkey = up1().createIndex(MfgActReg_Chk01_DtlOperR.$oper_inst_no, MfgActReg_Chk01_DtlOperR.$div_seq);
	
				for (MST_OPER_ACT_REM_R dbR : dbL) {
					MfgActReg_Chk01_DtlOperR operUpR = up1().getFirst(idxkey, dbR.oper_inst_no(), dbR.div_seq());
					if (isNull(operUpR)) {
						retL.add(dbR);
					}
				}
			}
			return retL;
		}

		/**
		 * 製造実績登録画面から呼び出す場合のヘッダのデータ更新区分が更新の行に対して、上り電文に含まれない工程の工程実績残を取得する
		 * @return
		 */
		protected MCList<MST_OPER_ACT_REM_R> getOperActRemCmplRel(MCList<MfgActReg_Chk01_HdrR> bindL) {
			MCList<MST_OPER_ACT_REM_R> dbL = MCList.create(MST_OPER_ACT_REM_R.class);
			MST_OPER_ACT_REM_R t = MST_OPER_ACT_REM_R.create("T");
			MCQueryApiBuilder dbL_bldr = MCQueryApiBuilder.create(t);
			dbL_bldr.setSelect(t.oper_inst_no, t.mfg_inst_no, t.div_seq, t.mfg_sts_typ);
			dbL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			dbL_bldr.addWhereWithAnd(t.div_seq.eq(bind("div_seq")));
			dbSelect("MSBCL6050_MST_OPER_ACT_REM_S01",
					dbL, dbL_bldr, bindL.groupBy(MfgActReg_Chk01_HdrR.$mfg_inst_no, MfgActReg_Chk01_HdrR.$div_seq));
			
			MCList<MST_OPER_ACT_REM_R> retL = MCList.create(MST_OPER_ACT_REM_R.class);
			
			MCList<MST_OPER_ACT_R> operActL = MCList.create(MST_OPER_ACT_R.class);
			MST_OPER_ACT_R operActR = MST_OPER_ACT_R.create("operAct");
			MCQueryApiBuilder operAct_bldr = MCQueryApiBuilder.create(operActR);
			operAct_bldr.setSelect(operActR.oper_act_no, operActR.mfg_act_no, operActR.oper_inst_no, operActR.div_seq);
			operAct_bldr.setWhere(operActR.oper_inst_no.eq(bind("oper_inst_no")));
			operAct_bldr.addWhereWithAnd(operActR.div_seq.eq(bind("div_seq")));
			dbSelect("MSBCL6050_MST_OPER_ACT_S02",operActL, operAct_bldr, up1());
			
			if (!dbL.isEmpty()) {
				// 上り電文に存在する工程実績残は除外する
				MCIndexKey idxkey = up1().createIndex(MfgActReg_Chk01_DtlOperR.$oper_inst_no, MfgActReg_Chk01_DtlOperR.$div_seq);
				MCIndexKey operActInstKey = operActL.createIndex(MST_OPER_ACT_R.$oper_inst_no, MST_OPER_ACT_R.$div_seq);
				
				for (MST_OPER_ACT_REM_R dbR : dbL) {
					MCList<MST_OPER_ACT_R> operActSubL = operActL.subList(operActInstKey, dbR.oper_inst_no(), dbR.div_seq());
					MCIndexKey operActActKey = operActSubL.createIndex(MST_OPER_ACT_R.$oper_act_no);
					MCList<MfgActReg_Chk01_DtlOperR> operUpL = up1().subList(idxkey, dbR.oper_inst_no(), dbR.div_seq());
					if (isNull(operUpL)) {
						retL.add(dbR);
					}
					else {
						MCList<MST_OPER_ACT_R> operActRemoveL = MCList.create(MST_OPER_ACT_R.class);
						for (MfgActReg_Chk01_DtlOperR r : operUpL) {
							operActRemoveL.addAll(operActSubL.subList(operActActKey, r.oper_act_no()));
						}
						operActSubL.removeAll(operActRemoveL);
						if (!isNull(operActSubL)) {
							retL.add(dbR);
						}
					}
				}
			}
			return retL;
		}
		
		/**
		 * 工数実績一覧登録で追加された工数実績を取得する
		 * @param bindL
		 * @return
		 */
		protected MCList<MST_WK_ACT_R> getUnschdWkAct(MCList<MfgActReg_Chk01_HdrR> bindL) {
			MCList<MST_WK_ACT_R> dbL = MCList.create(MST_WK_ACT_R.class);
			MST_WK_ACT_R t = MST_WK_ACT_R.create("T");
			MCQueryApiBuilder dbL_bldr = MCQueryApiBuilder.create(t);
			dbL_bldr.setSelect(t.mfg_act_no);
			dbL_bldr.setWhere(t.mfg_act_no.eq(bind("mfg_act_no")));
			dbL_bldr.addWhereWithAnd(t.oper_act_no.isNull());
			dbSelect("MSBCL6050_MST_WK_ACT_S01",
					dbL, dbL_bldr, bindL.groupBy(MfgActReg_Chk01_HdrR.$mfg_act_no));
			return dbL;
		}

		protected MCMessageList chkAndCompHdrBaseSub(MfgActReg_Chk01_HdrR r,
				MST_MFG_INST_R miR, MST_MFG_ACT_REM_R prR, MST_MFG_ACT_R maR,
				MST_ITM_MFG_INST_R imiR) {
			MCMessageList msgL = new MCMessageList();

			// データ更新区分
			if (isNull(r.mfg_act_no())) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else {
				if (r.isStatusDelete()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}

			// 品目製造指図から補完
			if (!isNull(imiR)) {
				r.itm_cd(imiR.itm_cd());
				r.itm_sub1(imiR.itm_sub1());
				r.itm_sub2(imiR.itm_sub2());
				r.itm_sub3(imiR.itm_sub3());
				r.inst_lot_no(imiR.lot_no());
				r.inst_sublot_no(imiR.sublot_no());
				r.sno1(imiR.sno1());
				r.sno2(imiR.sno2());
				r.sno3(imiR.sno3());
				r.sno4(imiR.sno4());
				r.itm_mfg_inst_qty(imiR.base_unit_inst_qty());
				r.bom_ptn(imiR.bom_ptn());
				r.mfg_loc_cd(imiR.mfg_loc_cd());
				r.mfg_str_ln_cd(imiR.mfg_str_ln_cd());
				r.site_cd(imiR.site_cd());
				r.wg_cd(imiR.wg_cd());
				r.itm_ord_no(imiR.itm_ord_no());
				r.mfg_mtd_typ(imiR.mfg_mtd_typ());
				r.sppl_cd(imiR.sppl_cd());
				

				// 品目マスタから補完
				MAM_ITM_R itmR = _itmCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				if (!isNull(itmR) && !itmR.isEmpty()) {
					r.sno1_mng_typ(itmR.sno1_mng_typ());
					r.sno2_mng_typ(itmR.sno2_mng_typ());
					r.sno3_mng_typ(itmR.sno3_mng_typ());
					r.sno4_mng_typ(itmR.sno4_mng_typ());
					r.lot_mng_typ(itmR.lot_mng_typ());
					r.lot_no_typ(itmR.lot_no_typ());
					r.lot_no_ptn_cd(itmR.lot_no_ptn_cd());
					r.sublot_mng_typ(itmR.sublot_mng_typ());
					r.sublot_no_typ(itmR.sublot_no_typ());
					r.sublot_no_ptn_cd(itmR.sublot_no_ptn_cd());
					r.base_unit_cd(itmR.unit_cd());
					r.base_unit_dec_place(itmR.dec_place());
					r.base_unit_conv_rnd_typ(itmR.rnd_typ());
				}
				else {
					msgL.add(new MCMessage(r, null, MAUAL0189,
							toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()),
							toDispGUIIndex(r)));
					r.err_flg(true);
				}
				
				// 品目マスタ（ＷＧ）から補完
				MAVM_ITM_WG_R itmWgR = _itmWgCache.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.wg_cd());
				if (!isNull(itmWgR)) {
					r.inpt_itm_add_flg(itmWgR.inpt_itm_add_flg());
				}
				
				// バッチから実行された場合はDACチェックしない
				if (!r.is_src_batch_flg()) {
					msgL.addAll(checkWritableLocCdDac(r, MfgActReg_Chk01_HdrR.$mfg_loc_cd));
				}
			}
			// 製造指図進捗から補完
			if (!isNull(prR)) {
				r.old_mfg_sts_typ(prR.mfg_sts_typ());
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					if (MSC_MFG_STS_TYP.isSAV(r.old_mfg_sts_typ())) {
						// 更新前の製造状況区分が指図保存の場合はエラー
						msgL.add(new MCMessage(r, null, MSBCL1086, r.mfg_inst_no(),
								toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
			}
			
			// 製造指図から補完
			if (!isNull(miR)) {
				r.mfg_inst_no(miR.mfg_inst_no());
				r.mfg_inst_unit_typ(miR.mfg_inst_unit_typ());
				r.aprv_flg(miR.aprv_flg());
				r.mfg_aprv_role_cd(miR.mfg_aprv_role_cd());
				r.itm_mfg_inst_no(miR.itm_mfg_inst_no());

				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					if (MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ())) {
						if (isNull(miR.po_d_no())) {
							msgL.add(new MCMessage(r, null, MSBCL1051, r.mfg_inst_no(), toDispGUIIndex(r)));
							r.err_flg(true);
						}
						
						String poAprvStsTyp = miR.getStringNE("PO_APRV_STS_TYP");
						if (!isNull(poAprvStsTyp) && !MAC_APRV_STS_TYP.isACPT(poAprvStsTyp)) {
							msgL.add(new MCMessage(r, null, MSBCL1058, miR.po_d_no(), toDispGUIIndex(r)));
							r.err_flg(true);
						}
					}
					if (MSC_MFG_APRV_STS_TYP.isINST_OPN(miR.mfg_aprv_sts_typ())) {
						msgL.add(new MCMessage(r, null, MSBCL1042, toDispGUIIndex(r)));
						r.err_flg(true);
					}
					if (!isNull(miR.aprv_dt()) && !isNull(r.st_act_tm())) {
						MCDate stActDt = r.st_act_tm().startTimeOfDay();
						if (miR.aprv_dt().gt(stActDt)) {
							msgL.add(new MCMessage(r, null, MSBCL1038,
									toYMDString(miR.aprv_dt()), toYMDString(stActDt),
									toDispGUIIndex(r)));
							r.err_flg(true);
						}
					}
				}
			}

			// 製造実績から補完
			if (!isNull(maR)) {
				r.mfg_act_no(maR.mfg_act_no());
				r.base_unit_yield_qty(maR.base_unit_yield_qty());
				r.base_unit_dfct_qty(maR.base_unit_dfct_qty());
				r.old_mfg_aprv_sts_typ(maR.mfg_aprv_sts_typ());
				r.old_end_act_tm(maR.end_act_tm());
				r.old_st_ac_dt(maR.st_ac_dt());
				r.old_end_ac_dt(maR.end_ac_dt());
				r.arr_purc_auto_reg_flg(maR.arr_purc_auto_reg_flg());
				if (maR.act_prnt_flg()) {
					r.prnt_seq(maR.seq().add(1));
				}
				else {
					r.prnt_seq(maR.seq());
				}
				if (MSC_MFG_APRV_STS_TYP.isACT_ACPT(maR.mfg_aprv_sts_typ())) {
					msgL.add(new MCMessage(r, null, MSBCL1043, r.mfg_inst_no(), toDispGUIIndex(r)));
					r.err_flg(true);
				}
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					MCNumber oldAbortQty = miR.getNumberNE("BASE_UNIT_MFG_ABORT_QTY");
					if (oldAbortQty.isPositive()) {
						// 仮に取消を許すと、同時に残数打ち切りが復活してしまうが、
						// 分かりづらい挙動のため先に残数打切りを取り消す想定とする
						msgL.add(new MCMessage(r, null, MSBCL1123, r.mfg_inst_no(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
			}
			else {
				r.prnt_seq(MCNumber.ONE);
			}

			r.act_prnt_flg(false);
			r.act_prnt_tm(null);
			
			return msgL;
		}

		protected MCMessageList chkAndCompOperBase() {
			MCMessageList msgL = new MCMessageList();

			// 工程指図の取得
			MCList<MST_OPER_INST_R> oiL = MCList.create(MST_OPER_INST_R.class);
			MST_OPER_INST_R oiL_t = MST_OPER_INST_R.create("T");
			MCQueryApiBuilder oiL_bldr = MCQueryApiBuilder.create(oiL_t);
			oiL_bldr.setSelect(
					oiL_t.oper_cd,
					oiL_t.oper_ord_no,
					oiL_t.oper_inst_no,
					oiL_t.oper_std_qty,
					oiL_t.oper_conv_qty,
					oiL_t.oper_unit_conv_rnd_typ,
					oiL_t.oper_unit_dec_place,
					oiL_t.oper_unit_cd,
					oiL_t.bkf_flg,
					oiL_t.wk_cost_calc_flg
					);
			MCList<MfgActReg_Chk01_DtlOperR> bindL = up1().subList(r -> !isNull(r.oper_inst_no()));
			if (!bindL.isEmpty()) {
				dbSelectKey("MSBCL6050_MST_OPER_INST_S02",
						oiL, oiL_bldr, bindL.groupBy(MfgActReg_Chk01_DtlOperR.$oper_inst_no));
			}

			// 工程実績の取得
			MCList<MST_OPER_ACT_R> oaL = MCList.create(MST_OPER_ACT_R.class);
			MST_OPER_ACT_R oaL_t = MST_OPER_ACT_R.create("T");
			MCQueryApiBuilder oaL_bldr = MCQueryApiBuilder.create(oaL_t);
			oaL_bldr.setSelect(
					oaL_t.oper_act_no,
					oaL_t.ext_sys_cd,
					oaL_t.ext_oper_act_no,
					oaL_t.if_auto_reg_flg,
					oaL_t.arr_act_no,
					oaL_t.purc_act_io_no
					);
			bindL = up1().subList(r -> !isNull(r.oper_act_no()));
			if (!bindL.isEmpty()) {
				dbSelectKey("MSBCL6050_MST_OPER_ACT_S02",
						oaL, oaL_bldr, bindL.groupBy(MfgActReg_Chk01_DtlOperR.$oper_act_no));
			}

			MCIndexKey oiKey = oiL.createIndex(MST_OPER_INST_R.$oper_inst_no);
			MCIndexKey oaKey = oaL.createIndex(MST_OPER_ACT_R.$oper_act_no);

			for (MfgActReg_Chk01_DtlOperR r : up1()) {
				MST_OPER_INST_R oiR = oiL.getFirst(oiKey, r.oper_inst_no());
				MST_OPER_ACT_R oaR = oaL.getFirst(oaKey, r.oper_act_no());
				msgL.addAll(chkAndCompOperBaseSub(r, oiR, oaR));
			}

			// 終了実績日時が設定されている工程について、紐付く出来高予定が存在し、出来高予定に対して上り電文またはテーブルに出来高実績が存在しない場合はエラーとする
			// ※上り電文に全ての出来高が含まれるわけではないため、出来高予定や出来高実績残をDBからselectする必要がある
			MCList<MfgActReg_Chk01_DtlOperR> yieldChkL = up1()
					.subList(r -> !isNull(r.end_act_tm())
							// 未完了フラグがオンの場合は出来高実績をチェックしない
							&& !r.not_cmpl_flg()
							&& !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			if (!yieldChkL.isEmpty()) {
				MCList<MST_YIELD_SCHD_R> ysL = getCrtHdrYieldSchd(yieldChkL);
				MCList<MST_YIELD_ACT_REM_R> yaRemL = getYieldActRemCmpl(yieldChkL);
				
				MCIndexKey ysKey = ysL.createIndex(MST_YIELD_SCHD_R.$oper_inst_no);
				MCIndexKey yaRemKey = yaRemL.createIndex(
						MST_YIELD_ACT_REM_R.$yield_schd_no, MST_YIELD_ACT_REM_R.$div_seq);
				MCIndexKey byProdKey = up6().createIndex(MfgActReg_Chk01_DtlByProdR.$div_seq, MfgActReg_Chk01_DtlByProdR.$yield_schd_no);
				MCIndexKey yieldKey = up5().createIndex(MfgActReg_Chk01_DtlYieldR.$div_seq, MfgActReg_Chk01_DtlYieldR.$yield_schd_no);
				for (MfgActReg_Chk01_DtlOperR operR : yieldChkL) {
					msgL.addAll(chkYieldAct(operR, ysL, yaRemL, ysKey, yaRemKey, byProdKey, yieldKey));
				}
			}
			

			return msgL;
		}
		
		/**
		 * 終了日が入力された工程に紐つく出来高予定を取得する
		 * @return
		 */
		protected MCList<MST_YIELD_SCHD_R> getCrtHdrYieldSchd(MCList<MfgActReg_Chk01_DtlOperR> bindL) {
			MCList<MST_YIELD_SCHD_R> dbL = MCList.create(MST_YIELD_SCHD_R.class);
			MST_YIELD_SCHD_R t = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder dbL_bldr = MCQueryApiBuilder.create(t);
			dbL_bldr.setSelect(t.mfg_inst_no, t.oper_inst_no, t.yield_schd_no, t.yield_typ);
			dbL_bldr.setWhere(t.oper_inst_no.eq(bind("oper_inst_no")));
			dbL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBCL6050_MST_YIELD_SCHD_S01",
					dbL, dbL_bldr, bindL.groupBy(MfgActReg_Chk01_DtlOperR.$oper_inst_no));
			return dbL;
		}

		/**
		 * 終了日が入力された工程に紐つく実績登録済みの出来高実績残を取得する
		 * @return
		 */
		protected MCList<MST_YIELD_ACT_REM_R> getYieldActRemCmpl(MCList<MfgActReg_Chk01_DtlOperR> bindL) {
			MCList<MST_YIELD_ACT_REM_R> dbL = MCList.create(MST_YIELD_ACT_REM_R.class);
			MST_YIELD_ACT_REM_R dbL_t = MST_YIELD_ACT_REM_R.create("T");
			MCQueryApiBuilder dbL_bldr = MCQueryApiBuilder.create(dbL_t);
			dbL_bldr.setSelect(dbL_t.oper_inst_no, dbL_t.yield_typ, dbL_t.mfg_sts_typ,
					dbL_t.yield_schd_no, dbL_t.div_seq);
			dbL_bldr.setWhere(dbL_t.oper_inst_no.eq(bind("oper_inst_no")));
			dbL_bldr.addWhereWithAnd(dbL_t.div_seq.eq(bind("div_seq")));
			bindL = bindL.subList(r -> !isNull(r.oper_act_no()));
			dbSelect("MSBCL6050_MST_YIELD_ACT_REM_S01",
					dbL, dbL_bldr, bindL.groupBy(MfgActReg_Chk01_DtlOperR.$oper_inst_no, MfgActReg_Chk01_HdrR.$div_seq));
			
			MCList<MST_YIELD_ACT_R> actDbL = MCList.create(MST_YIELD_ACT_R.class);
			MST_YIELD_ACT_R actDbL_t = MST_YIELD_ACT_R.create("T");
			MCQueryApiBuilder actDbL_bldr = MCQueryApiBuilder.create(actDbL_t);
			actDbL_bldr.setSelect(actDbL_t.yield_schd_no, actDbL_t.div_seq);
			actDbL_bldr.setWhere(actDbL_t.yield_schd_no.eq(bind("yield_schd_no")));
			actDbL_bldr.addWhereWithAnd(actDbL_t.div_seq.eq(bind("div_seq")));
			actDbL_bldr.addGroupBy(actDbL_t.yield_schd_no, actDbL_t.div_seq);
			dbSelect("MSBCL6050_MST_YIELD_ACT_S01",
					actDbL, actDbL_bldr, dbL.subList(r -> MSC_MFG_STS_TYP.isORD(r.mfg_sts_typ())));
			MCIndexKey actExistLIdxKey = actDbL.createIndex(MST_YIELD_ACT_R.$yield_schd_no, MST_YIELD_ACT_REM_R.$div_seq);
			
			MCList<MST_YIELD_ACT_REM_R> retL = MCList.create(MST_YIELD_ACT_REM_R.class);
			if (!dbL.isEmpty()) {
				// 上り電文に存在する出来高実績残は除外する
				MCIndexKey yieldIdxkey = up5().createIndex(MfgActReg_Chk01_DtlYieldR.$yield_schd_no, MfgActReg_Chk01_DtlYieldR.$div_seq);
				MCIndexKey byProdIdxkey = up6().createIndex(MfgActReg_Chk01_DtlYieldR.$yield_schd_no, MfgActReg_Chk01_DtlYieldR.$div_seq);
				for (MST_YIELD_ACT_REM_R dbR : dbL) {
					// 実績登録済みのレコードのみ考慮する
					MST_YIELD_ACT_R actDbR = actDbL.getFirst(actExistLIdxKey, dbR.yield_schd_no(), dbR.div_seq());
					if (MSC_MFG_STS_TYP.isSTT(dbR.mfg_sts_typ())
							|| MSC_MFG_STS_TYP.isCMPL(dbR.mfg_sts_typ())
							|| (MSC_MFG_STS_TYP.isORD(dbR.mfg_sts_typ()) && !isNull(actDbR))) {
						MfgActReg_Chk01_DtlYieldR yieldR = up5().getFirst(yieldIdxkey,
								dbR.yield_schd_no(), dbR.div_seq());
						MfgActReg_Chk01_DtlByProdR byProdR = up6().getFirst(byProdIdxkey,
								dbR.yield_schd_no(), dbR.div_seq());
						if (isNull(yieldR) && isNull(byProdR)) {
							retL.add(dbR);
						}
					}
				}
			}
			return retL;
		}
		
		/**
		 * 出来高予定が存在する工程に対して出来高実績が存在しているかをチェックする
		 */
		protected MCMessageList chkYieldAct(MfgActReg_Chk01_DtlOperR operR,
				MCList<MST_YIELD_SCHD_R> ysL,
				MCList<MST_YIELD_ACT_REM_R> yaRemL, MCIndexKey ysKey,
				MCIndexKey yaRemKey,
				MCIndexKey byProdKey,
				MCIndexKey yieldKey) {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MST_YIELD_SCHD_R> ysSubL = ysL.subList(ysKey, operR.oper_inst_no());
			if (ysSubL.isEmpty()) {
				// 出来高、副産品が存在する工程ではない場合
				return msgL;
			}
			// 出来高、副産品が存在する工程の場合
			for (MST_YIELD_SCHD_R ysR : ysSubL) {
				// DBに存在するかどうかをチェック
				if (!isNull(yaRemL.getFirst(yaRemKey,
						ysR.yield_schd_no(), operR.div_seq()))) {
					continue;
				}
				
				// 上り電文に存在するかどうかをチェック
				// ※完了した工程実績の出来高を行削除できないチェックは、別の処理で行っているため、出来高・副産品の上り電文が行削除ステータスか否かはここでは考慮しない
				if (MAC_YIELD_TYP.isBYPROD(ysR.yield_typ())) {
					// 副産品
					MCList<MfgActReg_Chk01_DtlByProdR> byProdL = up6().subList(byProdKey, operR.div_seq(), ysR.yield_schd_no())
							.subList(r -> !isSame(MCRow.Status.DELETE, r.getStatus()));
					if (isNull(byProdL.getFirst(MfgActReg_Chk01_DtlByProdR.$yield_schd_no, ysR.yield_schd_no()))) {
						msgL.add(new MCMessage(operR, null, MSBCL1089, ysR.mfg_inst_no(),
								ysR.oper_inst_no(), ysR.yield_schd_no(), toDispGUIIndex(operR)));
						operR.err_flg(true);
					}
				}
				else {
					// 出来高
					MCList<MfgActReg_Chk01_DtlYieldR> yieldL = up5().subList(yieldKey, operR.div_seq(), ysR.yield_schd_no())
							.subList(r -> !isSame(MCRow.Status.DELETE, r.getStatus()));
					if (isNull(yieldL.getFirst(MfgActReg_Chk01_DtlYieldR.$yield_schd_no, ysR.yield_schd_no()))) {
						msgL.add(new MCMessage(operR, null, MSBCL1088, ysR.mfg_inst_no(),
								ysR.oper_inst_no(), ysR.yield_schd_no(), toDispGUIIndex(operR)));
						operR.err_flg(true);
					}
				}
			}
			return msgL;
		}

		protected MCMessageList chkAndCompOperBaseSub(MfgActReg_Chk01_DtlOperR r,
				MST_OPER_INST_R oiR, MST_OPER_ACT_R oaR) {
			MCMessageList msgL = new MCMessageList();
			
			MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
			if (hdrR.err_flg()) {
				r.err_flg(true);
			}

			if (isNull(r.oper_act_no())) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (r.isStatusDelete()) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
			else {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}

			if (!isNull(oiR)) {
				r.oper_cd(oiR.oper_cd());
				r.oper_ord_no(oiR.oper_ord_no());
				r.oper_inst_no(oiR.oper_inst_no());
				r.oper_std_qty(oiR.oper_std_qty());
				r.oper_conv_qty(oiR.oper_conv_qty());
				r.oper_unit_conv_rnd_typ(oiR.oper_unit_conv_rnd_typ());
				r.oper_unit_dec_place(oiR.oper_unit_dec_place());
				r.oper_unit_cd(oiR.oper_unit_cd());
				r.bkf_flg(oiR.bkf_flg());
				r.wk_cost_calc_flg(oiR.wk_cost_calc_flg());
			}
			
			if (!isNull(oaR)) {
				if (!r.mes_flg()) {
					// MES対象外の場合は補完（MES対象の場合は上り電文に設定されているため、補完不要）
					r.ext_sys_cd(oaR.ext_sys_cd());
					r.ext_oper_act_no(oaR.ext_oper_act_no());
					r.if_auto_reg_flg(oaR.if_auto_reg_flg());
				}
				r.arr_act_no(oaR.arr_act_no());
				r.purc_act_io_no(oaR.purc_act_io_no());
			}
			
			return msgL;
		}

		protected MCMessageList chkAndCompInptBase() {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_INPT_SCHD_R> isL = MCList.create(MST_INPT_SCHD_R.class);
			MST_INPT_SCHD_R isL_t = MST_INPT_SCHD_R.create("T");
			MCQueryApiBuilder isL_bldr = MCQueryApiBuilder.create(isL_t);
			isL_bldr.setSelect(
					isL_t.inpt_schd_no,
					isL_t.oper_inst_no,
					isL_t.itm_cd,
					isL_t.itm_sub1,
					isL_t.itm_sub2,
					isL_t.itm_sub3,
					isL_t.alt_grp_cd,
					isL_t.alt_grp_seq,
					isL_t.act_cont_fctr,
					isL_t.std_cont_fctr,
					isL_t.lot_no,
					isL_t.sublot_no,
					isL_t.sno1_null_flg,
					isL_t.sno1,
					isL_t.sno2_null_flg,
					isL_t.sno2,
					isL_t.sno3_null_flg,
					isL_t.sno3,
					isL_t.sno4_null_flg,
					isL_t.sno4,
					isL_t.main_itm_flg,
					isL_t.lot_mix_flg,
					isL_t.sublot_mix_flg,
					isL_t.prov_typ,
					isL_t.alt_itm_typ,
					isL_t.alt_alloc_prio,
					isL_t.alloc_flg,
					isL_t.alloc_ctl_typ,
					isL_t.base_unit_alt_qty,
					isL_t.inpt_rsn_cd
					);

			MCList<MfgActReg_Chk01_DtlInptR> bindL = up2().subList(r -> !isNull(r.inpt_schd_no()));
			if (!bindL.isEmpty()) {
				dbSelectKey("MSBCL6050_MST_INPT_SCHD_S01",
						isL, isL_bldr, bindL.groupBy(MfgActReg_Chk01_DtlInptR.$inpt_schd_no));
			}

			MCList<MST_INPT_ACT_R> iaL = MCList.create(MST_INPT_ACT_R.class);
			MST_INPT_ACT_R iaL_t = MST_INPT_ACT_R.create("T");
			MCQueryApiBuilder iaL_bldr = MCQueryApiBuilder.create(iaL_t);
			iaL_bldr.setSelect(
					iaL_t.inpt_act_no,
					iaL_t.itm_cd,
					iaL_t.itm_sub1,
					iaL_t.itm_sub2,
					iaL_t.itm_sub3,
					iaL_t.inpt_loc_cd,
					iaL_t.stk_id_typ,
					iaL_t.stk_arrv_bp_cd,
					iaL_t.ext_sys_cd,
					iaL_t.ext_inpt_act_no,
					iaL_t.if_auto_reg_flg,
					iaL_t.ver_no,
					iaL_t.inpt_rsn_cd
					);
			bindL = up2().subList(r -> !isNull(r.inpt_act_no()));
			if (!bindL.isEmpty()) {
				dbSelectKey("MSBCL6050_MST_INPT_ACT_S01",
						iaL, iaL_bldr, bindL.groupBy(MfgActReg_Chk01_DtlInptR.$inpt_act_no));
			}

			// 追加行が存在するか確認
			MfgActReg_Chk01_DtlInptR addRow = MfgActReg_Chk01_DtlInptR.create();
			for (MfgActReg_Chk01_DtlInptR r : up2()) {
				if (r.isStatusCreate()) {
					addRow = r;
					break;
				}
			}

			MCList<MST_INPT_SCHD_R> isItmL = MCList.create(MST_INPT_SCHD_R.class);
			MST_INPT_SCHD_R isItmL_t = MST_INPT_SCHD_R.create("T");
			MCQueryApiBuilder isItmL_bldr = MCQueryApiBuilder.create(isItmL_t);
			if (!addRow.isEmpty()) {
				// 追加行が存在する場合は製造指図ＮＯから投入予定を取得する
				isItmL_bldr.setSelect(isItmL_t.inpt_schd_no, isItmL_t.mfg_inst_no,
						isItmL_t.itm_cd, isItmL_t.itm_sub1, isItmL_t.itm_sub2,
						isItmL_t.itm_sub3);
				isItmL_bldr.addWhereWithAnd(isItmL_t.mfg_inst_no.eq(bind("mfg_inst_no")));

				MCList<MfgActReg_Chk01_HdrR> hdrL = up0().subList(r -> !isNull(r.mfg_inst_no()));
				if (!hdrL.isEmpty()) {
					dbSelect("MSBCL6050_MST_INPT_SCHD_S02",
							isItmL, isItmL_bldr, hdrL.groupBy(MfgActReg_Chk01_HdrR.$mfg_inst_no));
				}
			}

			MCIndexKey isKey = isL.createIndex(MST_INPT_SCHD_R.$inpt_schd_no);
			MCIndexKey iaKey = iaL.createIndex(MST_INPT_ACT_R.$inpt_act_no);
			MCIndexKey isItmKey = isItmL.createIndex(MfgActReg_Chk01_HdrR.$mfg_inst_no,
					MfgActReg_Chk01_HdrR.$itm_cd, MfgActReg_Chk01_HdrR.$itm_sub1,
					MfgActReg_Chk01_HdrR.$itm_sub2, MfgActReg_Chk01_HdrR.$itm_sub3);
			
			for (MfgActReg_Chk01_DtlInptR r : up2()) {
				MST_INPT_SCHD_R isR = isL.getFirst(isKey, r.inpt_schd_no());
				MST_INPT_ACT_R iaR = iaL.getFirst(iaKey, r.inpt_act_no());
				msgL.addAll(chkAndCompInptBaseSub(r, isR, iaR, isItmL, isItmKey));
			}
			return msgL;
		}

		protected MCMessageList chkAndCompInptBaseSub(MfgActReg_Chk01_DtlInptR r,
				MST_INPT_SCHD_R isR, MST_INPT_ACT_R iaR,
				MCList<MST_INPT_SCHD_R> isItmL, MCIndexKey isItmKey) {
			MCMessageList msgL = new MCMessageList();

			MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
			if (hdrR.err_flg()) {
				r.err_flg(true);
			}

			if (isNull(r.inpt_act_no())) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (r.isStatusDelete()) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
			else {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}

			if (!isNull(isR)) {
				r.inpt_schd_no(isR.inpt_schd_no());
				r.oper_inst_no(isR.oper_inst_no());
				r.alt_grp_cd(isR.alt_grp_cd());
				r.alt_grp_seq(isR.alt_grp_seq());
				r.act_cont_fctr(isR.act_cont_fctr());
				r.inpt_lot_no(isR.lot_no());
				r.inpt_sublot_no(isR.sublot_no());
				r.sno1_null_flg(isR.sno1_null_flg());
				r.inst_sno1(isR.sno1());
				r.sno2_null_flg(isR.sno2_null_flg());
				r.inst_sno2(isR.sno2());
				r.sno3_null_flg(isR.sno3_null_flg());
				r.inst_sno3(isR.sno3());
				r.sno4_null_flg(isR.sno4_null_flg());
				r.inst_sno4(isR.sno4());
				r.main_itm_flg(isR.main_itm_flg());
				r.lot_mix_flg(isR.lot_mix_flg());
				r.sublot_mix_flg(isR.sublot_mix_flg());
				r.prov_typ(isR.prov_typ());
				r.alt_itm_typ(isR.alt_itm_typ());
				r.alt_alloc_prio(isR.alt_alloc_prio());
				r.alloc_flg(isR.alloc_flg());
				r.alloc_ctl_typ(isR.alloc_ctl_typ());
				r.base_unit_alt_qty(isR.base_unit_alt_qty());
				// 削除時は品目ＣＤを補完
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.itm_cd(isR.itm_cd());
					r.itm_sub1(isR.itm_sub1());
					r.itm_sub2(isR.itm_sub2());
					r.itm_sub3(isR.itm_sub3());
				}
			}
			if (isNull(r.inpt_schd_no())) {
				r.add_flg(true);
				if (!MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
					r.lot_mix_flg(true);
				}
				if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
					r.sublot_mix_flg(true);
				}
			}

			if (!isNull(iaR)) {
				r.inpt_act_no(iaR.inpt_act_no());
				r.old_itm_cd(iaR.itm_cd());
				r.old_itm_sub1(iaR.itm_sub1());
				r.old_itm_sub2(iaR.itm_sub2());
				r.old_itm_sub3(iaR.itm_sub3());
				r.old_inpt_loc_cd(iaR.inpt_loc_cd());
				r.old_stk_arrv_bp_cd(iaR.stk_arrv_bp_cd());
				r.old_stk_id_typ(iaR.stk_id_typ());
				if (!r.mes_flg()) {
					// MES対象外の場合は補完（MES対象の場合は上り電文に設定されているため、補完不要）
					r.ext_sys_cd(iaR.ext_sys_cd());
					r.ext_inpt_act_no(iaR.ext_inpt_act_no());
					r.if_auto_reg_flg(iaR.if_auto_reg_flg());
				}
				r.old_ver_no(iaR.ver_no());
			}
			if (r.inpt_rsn_comp_flg()) {
				if (!isNull(iaR)) {
					r.inpt_rsn_cd(iaR.inpt_rsn_cd());
				}
				if (isNull(r.inpt_rsn_cd()) && !isNull(isR)) {
					r.inpt_rsn_cd(isR.inpt_rsn_cd());
				}
			}

			// 単票から登録された代替品目の場合、常に代替品目指定フラグをオンにする（左記以外は上り電文に設定された値のまま）
			// 理由：単票の上り電文対象となったということは実績登録対象ということなので、その場合は代替品目指定がオンになる
			// 一括登録の場合は登録するたびに代替品目指定をやり直したいので、オンにするということはしない。
			if (!hdrR.lst_reg_flg() ) {
				if (!isNull(r.alt_grp_cd())) {
					r.alt_itm_fix_flg(true);
				}
			}
			
			if (isNull(_operCache.getCache(r.oper_peg_no()))) {
				msgL.add(new MCMessage(r, null, MSBCL1076, toDispGUIIndex(r)));
				r.err_flg(true);
			}
			
			// ＢＯＭマスタ存在チェック
			// 製造品の投入品許可フラグがオフの場合、投入実績の品目がＢＯＭマスタに存在するかチェックする。ＢＯＭマスタを参照するのではなく投入予定を参照する。
			// ただし、投入品許可フラグがオフ、投入品削除フラグがオンの場合で指図時に投入品が削除された場合、その品目の実績を追加するとエラーとなってしまう。
			// その場合は製造指図で予定再展開し、追加する想定。
			if (!isNull(hdrR) && !hdrR.inpt_itm_add_flg() && r.isStatusCreate()) {
				MST_INPT_SCHD_R isItmR = isItmL.getFirst(isItmKey,
						hdrR.mfg_inst_no(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
						r.itm_sub3());
				if(isNull(isItmR)) {
					msgL.add(
							new MCMessage(r, null,
									MSBCL1033, toDispItm(r.itm_cd(), r.itm_sub1(),
											r.itm_sub2(), r.itm_sub3()),
									toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
			
			// 自給品登録チェック
			if (isNull(r.inpt_schd_no()) && MSC_STK_ID_TYP.isSLF_SUPPRT(r.stk_id_typ())) {
				msgL.add(new MCMessage(r, null,
								MSBCL1137, toDispItm(r.itm_cd(), r.itm_sub1(),
										r.itm_sub2(), r.itm_sub3()),
								toDispGUIIndex(r)));
			}
			
			// ワーキンググループ補正
			if (!isNull(hdrR)) {
				r.wg_cd(hdrR.wg_cd());
			}
			
			if (r.err_flg()) {
				MCList<MfgActReg_Chk01_DtlLossR> lossL = _lossCacheForInpt.getCache(r.peg_no());
				for (MfgActReg_Chk01_DtlLossR lossR : lossL) {
					lossR.err_flg(true);
				}
			}
			return msgL;
		}

		protected MCMessageList chkAndCompLossBase() {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_LOSS_ACT_R> laL = MCList.create(MST_LOSS_ACT_R.class);
			MST_LOSS_ACT_R t = MST_LOSS_ACT_R.create("T");
			MCQueryApiBuilder laL_bldr = MCQueryApiBuilder.create(t);
			laL_bldr.setSelect(t.loss_act_no, t.fxd_loss_flg);
			MCList<MfgActReg_Chk01_DtlLossR> bindL = up3().subList(r -> !isNull(r.loss_act_no()));
			if (!bindL.isEmpty()) {
				dbSelectKey("MSBCL6050_MST_LOSS_ACT_S01",
						laL, laL_bldr, bindL.groupBy(MfgActReg_Chk01_DtlLossR.$loss_act_no));
			}

			MCIndexKey laKey = laL.createIndex(MST_LOSS_ACT_R.$loss_act_no);
			for (MfgActReg_Chk01_DtlLossR r : up3()) {
				MST_LOSS_ACT_R laR = laL.getFirst(laKey, r.loss_act_no());
				msgL.addAll(chkAndCompLossBaseSub(r, laR));
			}
			return msgL;
		}
		
		protected MCMessageList chkAndCompLossBaseSub(MfgActReg_Chk01_DtlLossR r, MST_LOSS_ACT_R laR) {
			MCMessageList msgL = new MCMessageList();
			
			if (isNull(r.loss_act_no())) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (r.isStatusDelete() || (isNull(r.loss_qty()))) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
			else {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
			if (!isNull(laR)) {
				r.fxd_loss_flg(laR.fxd_loss_flg());
			}
			
			return msgL;
		}

		protected MCMessageList chkAndCompWkBase() {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_WK_SCHD_R> wsL = MCList.create(MST_WK_SCHD_R.class);
			MST_WK_SCHD_R wsL_t = MST_WK_SCHD_R.create("T");
			MCQueryApiBuilder wsL_bldr = MCQueryApiBuilder.create(wsL_t);
			wsL_bldr.setSelect(wsL_t.wk_schd_no, wsL_t.wk_cost_calc_flg);
			MCList<MfgActReg_Chk01_DtlWkR> bindL = up4().subList(r -> !isNull(r.wk_schd_no()));
			if (!bindL.isEmpty()) {
				dbSelectKey("MSBCL6050_MST_WK_SCHD_S01",
						wsL, wsL_bldr, bindL.groupBy(MfgActReg_Chk01_DtlWkR.$wk_schd_no));
			}
			
			MCList<MST_WK_ACT_R> waL = MCList.create(MST_WK_ACT_R.class);
			MST_WK_ACT_R waL_t = MST_WK_ACT_R.create("T");
			MCQueryApiBuilder waL_bldr = MCQueryApiBuilder.create(waL_t);
			waL_bldr.setSelect(waL_t.wk_act_no, waL_t.ac_dt);
			waL_bldr.addSelect(waL_t.ext_sys_cd, waL_t.ext_wk_act_no);
			bindL = up4().subList(r -> !isNull(r.wk_act_no()));
			if (!bindL.isEmpty()) {
				dbSelectKey("MSBCL6050_MST_WK_ACT_S02",
						waL, waL_bldr, bindL.groupBy(MfgActReg_Chk01_DtlWkR.$wk_act_no));
			}

			MCIndexKey wsKey = wsL.createIndex(MST_WK_SCHD_R.$wk_schd_no);
			MCIndexKey waKey = waL.createIndex(MST_WK_ACT_R.$wk_act_no);
			for (MfgActReg_Chk01_DtlWkR r : up4()) {
				MST_WK_SCHD_R wsR = wsL.getFirst(wsKey, r.wk_schd_no());
				MST_WK_ACT_R waR = waL.getFirst(waKey, r.wk_act_no());
				msgL.addAll(chkAndCompWkBaseSub(r, wsR, waR));
				if (r.wk_cost_calc_upd_flg() && isNotZeroTm(r.end_tm())) {
					// 着手・終了時刻と中断時間から工数を求める
					r.act_wk_cost(calcWkCost(r.st_tm(), r.end_tm(), r.ac_dt(), r.brk_pd()));
				}
			}
			return msgL;
		}

		protected MCMessageList chkAndCompWkBaseSub(MfgActReg_Chk01_DtlWkR r, MST_WK_SCHD_R wsR, MST_WK_ACT_R waR) {
			MCMessageList msgL = new MCMessageList();

			MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
			if (hdrR.err_flg()) {
				r.err_flg(true);
			}

			if (isNull(r.wk_act_no())) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (r.isStatusDelete()) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
			else {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}

			if (!isNull(wsR)) {
				r.wk_schd_no(wsR.wk_schd_no());
				r.wk_cost_calc_flg(wsR.wk_cost_calc_flg());
			}
			
			if (!isNull(waR)) {
				r.old_ac_dt(waR.ac_dt());
				if (!r.mes_flg()) {
					// MES対象外の場合は補完（MES対象の場合は上り電文に設定されているため、補完不要）
					r.ext_sys_cd(waR.ext_sys_cd());
					r.ext_wk_act_no(waR.ext_wk_act_no());
				}
			}
			
			if (isNull(_operCache.getCache(r.oper_peg_no()))) {
				msgL.add(new MCMessage(r, null, MSBCL1076, toDispGUIIndex(r)));
				r.err_flg(true);
			}
			
			return msgL;

		}

		protected MCMessageList chkAndCompYieldBase() {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_YIELD_SCHD_R> ysL = MCList.create(MST_YIELD_SCHD_R.class);
			MST_YIELD_SCHD_R ysL_t = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder ysL_bldr = MCQueryApiBuilder.create(ysL_t);
			ysL_bldr.setSelect(ysL_t.yield_schd_no,
					ysL_t.itm_cd,
					ysL_t.itm_sub1,
					ysL_t.itm_sub2,
					ysL_t.lot_no,
					ysL_t.sublot_no,
					ysL_t.itm_sub3,
					ysL_t.base_unit_cd);

			MCList<MfgActReg_Chk01_DtlYieldR> bindL = up5().subList(r -> !isNull(r.yield_schd_no()));
			if (!bindL.isEmpty()) {
				dbSelectKey("MSBCL6050_MST_YIELD_SCHD_S02",
						ysL, ysL_bldr, bindL.groupBy(MfgActReg_Chk01_DtlYieldR.$yield_schd_no));
			}

			MCList<MST_YIELD_ACT_R> yaL = MCList.create(MST_YIELD_ACT_R.class);
			MST_YIELD_ACT_R yaL_t = MST_YIELD_ACT_R.create("T");
			MCQueryApiBuilder yaL_bldr = MCQueryApiBuilder.create(yaL_t);
			yaL_bldr.setSelect(yaL_t.yield_act_no,
					yaL_t.yield_schd_no,
					yaL_t.strg_loc_cd,
					yaL_t.strg_loc_cd,
					yaL_t.ext_sys_cd,
					yaL_t.ext_yield_act_no,
					yaL_t.lot_no,
					yaL_t.sublot_no,
					yaL_t.yield_typ,
					yaL_t.base_unit_qty,
					yaL_t.stk_lst_prnt_flg,
					yaL_t.not_stk_flg);

			bindL = up5().subList(r -> !isNull(r.yield_act_no()));
			if (!bindL.isEmpty()) {
				dbSelectKey("MSBCL6050_MST_YIELD_ACT_S02",
						yaL, yaL_bldr, bindL.groupBy(MfgActReg_Chk01_DtlYieldR.$yield_act_no));
			}

			MCList<MST_YIELD_ACT_R> yieldActL = MCList.create(MST_YIELD_ACT_R.class);
			MST_YIELD_ACT_R yieldActL_t = MST_YIELD_ACT_R.create("T");
			MCQueryApiBuilder yieldActL_bldr = MCQueryApiBuilder.create(yieldActL_t);
			yieldActL_bldr.setSelect(yieldActL_t.yield_act_no,
					yieldActL_t.yield_schd_no,
					yieldActL_t.oper_act_no);
			yieldActL_bldr.setWhere(yieldActL_t.mfg_act_no.eq(bind("mfg_act_no")));
			yieldActL_bldr.addConstWhereWithAnd(yieldActL_t.yield_typ.neq(value(MAC_YIELD_TYP.BYPROD.value())));
			dbSelect("MSBCL6050_MST_YIELD_ACT_S03",
					yieldActL, yieldActL_bldr, up0().groupBy(MfgActReg_Chk01_HdrR.$mfg_act_no), null);
			
			MCIndexKey yaKeyByOperAct = yieldActL.createIndex(MST_YIELD_ACT_R.$oper_act_no);
			MCIndexKey ysKey = ysL.createIndex(MST_YIELD_SCHD_R.$yield_schd_no);
			MCIndexKey yaKey = yaL.createIndex(MST_YIELD_ACT_R.$yield_act_no);
			for (MfgActReg_Chk01_DtlYieldR r : up5()) {
				MST_YIELD_SCHD_R ysR = ysL.getFirst(ysKey, r.yield_schd_no());
				MST_YIELD_ACT_R yaR = yaL.getFirst(yaKey, r.yield_act_no());
				msgL.addAll(chkAndCompYieldBaseSub(r, ysR, yaR, yieldActL, yaKeyByOperAct));
			}
			return msgL;
		}

		protected MCMessageList chkAndCompYieldBaseSub(MfgActReg_Chk01_DtlYieldR r,
				MST_YIELD_SCHD_R ysR, MST_YIELD_ACT_R yaR,
				MCList<MST_YIELD_ACT_R> yieldActL, MCIndexKey yaKeyByOperAct) {
			MCMessageList msgL = new MCMessageList();
			
			MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
			if (hdrR.err_flg()) {
				r.err_flg(true);
			}

			if (isNull(r.yield_act_no())) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (r.isStatusDelete()) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
			else {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}

			if (!isNull(ysR)) {
				r.yield_schd_no(ysR.yield_schd_no());
				r.itm_cd(ysR.itm_cd());
				r.itm_sub1(ysR.itm_sub1());
				r.itm_sub2(ysR.itm_sub2());
				r.itm_sub3(ysR.itm_sub3());
				r.base_unit_cd(ysR.base_unit_cd());
				r.schd_lot_no(ysR.lot_no());
				r.schd_sublot_no(ysR.sublot_no());
			}

			if (!isNull(yaR)) {
				// 取り消し時は出来高実績ＮＯしか渡ってこないため、出来高予定ＮＯの補完は、実績テーブルを元に行う
				r.yield_schd_no(yaR.yield_schd_no());
				if (!r.mes_flg()) {
					// MES対象外の場合は補完（MES対象の場合は上り電文に設定されているため、補完不要）
					r.ext_sys_cd(yaR.ext_sys_cd());
					r.ext_yield_act_no(yaR.ext_yield_act_no());
				}
				r.old_strg_loc_cd(yaR.strg_loc_cd());
				r.old_not_stk_flg(yaR.not_stk_flg());
				r.old_lot_no(yaR.lot_no());
				r.old_sublot_no(yaR.sublot_no());
				r.old_yield_typ(yaR.yield_typ());
				r.old_base_unit_yield_act_qty(yaR.base_unit_qty());
				r.stk_lst_prnt_flg(yaR.stk_lst_prnt_flg());
			}

			r.sublot_ctl_flg(r.same_lot_flg());
			
			MfgActReg_Chk01_DtlOperR operR = _operCache.getCache(r.oper_peg_no());
			
			if (isNull(operR)) {
				msgL.add(new MCMessage(r, null, MSBCL1076, toDispGUIIndex(r)));
				r.err_flg(true);
			}
			else {
				if (!MAC_DATA_CRUD_TYP.isDEL(operR.data_crud_typ())
						&& !isNull(operR.end_act_tm())
						&& !operR.not_cmpl_flg()
						&& MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					boolean errObjFlg = true;
					MCList<MfgActReg_Chk01_DtlYieldR> subYieldUpL = _yieldCacheForOper.getCache(r.oper_peg_no());
					if (!subYieldUpL.subList(yR -> !yR.isStatusDelete()).isEmpty()) {
						errObjFlg = false;
					}
					else {
						MCIndexKey yieldIdx = subYieldUpL.createIndex(MfgActReg_Chk01_DtlYieldR.$yield_schd_no, MfgActReg_Chk01_DtlYieldR.$yield_act_no);
						for (MST_YIELD_ACT_R yieldR : yieldActL.subList(yaKeyByOperAct, operR.oper_act_no())) {
							if (isNull(subYieldUpL.getFirst(yieldIdx, yieldR.yield_schd_no(), yieldR.yield_act_no()))) {
								if (isNull(operR.end_act_tm())|| operR.not_cmpl_flg()) {
									errObjFlg = false;
									break;
								}
							}
						}
					}
					if (errObjFlg) {
						msgL.add(new MCMessage(r, null, MSBCL1097, hdrR.mfg_inst_no(), operR.oper_act_no(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
			}

			// ワーキンググループ補正
			if (!isNull(hdrR)) {
				r.wg_cd(hdrR.wg_cd());
			}

			return msgL;
		}

		protected MCMessageList chkAndCompByProdBase() {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_YIELD_SCHD_R> ysL = MCList.create(MST_YIELD_SCHD_R.class);
			MST_YIELD_SCHD_R ysL_t = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder ysL_bldr = MCQueryApiBuilder.create(ysL_t);
			ysL_bldr.setSelect(ysL_t.yield_schd_no,
					ysL_t.lot_no,
					ysL_t.sublot_no);

			MCList<MfgActReg_Chk01_DtlByProdR> bindL = up6().subList(r -> !isNull(r.yield_schd_no()));
			if (!bindL.isEmpty()) {
				dbSelectKey("MSBCL6050_MST_YIELD_SCHD_S03",
						ysL, ysL_bldr, bindL.groupBy(MfgActReg_Chk01_DtlYieldR.$yield_schd_no));
			}

			MCList<MST_YIELD_ACT_R> yaL = MCList.create(MST_YIELD_ACT_R.class);
			MST_YIELD_ACT_R yaL_t = MST_YIELD_ACT_R.create("T");
			MCQueryApiBuilder yaL_bldr = MCQueryApiBuilder.create(yaL_t);
			yaL_bldr.setSelect(yaL_t.yield_act_no,
					yaL_t.yield_schd_no,
					yaL_t.itm_cd,
					yaL_t.itm_sub1,
					yaL_t.itm_sub2,
					yaL_t.itm_sub3,
					yaL_t.strg_loc_cd,
					yaL_t.stk_lst_prnt_flg,
					yaL_t.ext_sys_cd,
					yaL_t.ext_yield_act_no,
					yaL_t.lot_no,
					yaL_t.sublot_no);

			bindL = up6().subList(r -> !isNull(r.yield_act_no()));
			if (!bindL.isEmpty()) {
				dbSelectKey("MSBCL6050_MST_YIELD_ACT_S04",
						yaL, yaL_bldr, bindL.groupBy(MfgActReg_Chk01_DtlYieldR.$yield_act_no));
			}
			// 副産品の行削除時のチェックで使用するために、出来高実績を取得する。
			// ※通常の出来高実績と異なり、副産品は予定なしの実績登録が可能なため、出来高予定ＮＯの有無も条件として使用する。
			MCList<MST_YIELD_ACT_R> yieldActL = MCList.create(MST_YIELD_ACT_R.class);
			MST_YIELD_ACT_R yieldActL_t = MST_YIELD_ACT_R.create("T");
			MCQueryApiBuilder yieldActL_bldr = MCQueryApiBuilder.create(yieldActL_t);
			yieldActL_bldr.setSelect(yieldActL_t.yield_act_no,
					yieldActL_t.yield_schd_no,
					yieldActL_t.oper_act_no);
			yieldActL_bldr.setWhere(yieldActL_t.mfg_act_no.eq(bind("mfg_act_no")));
			yieldActL_bldr.addConstWhereWithAnd(yieldActL_t.yield_typ.eq(value(MAC_YIELD_TYP.BYPROD.value()))
					.and(yieldActL_t.yield_schd_no.isNotNull()));
			dbSelect("MSBCL6050_MST_YIELD_ACT_S05",
					yieldActL, yieldActL_bldr, up0().groupBy(MfgActReg_Chk01_HdrR.$mfg_act_no), null);
			MCIndexKey yaKeyByOperAct = yieldActL.createIndex(MST_YIELD_ACT_R.$oper_act_no);

			MCIndexKey ysKey = ysL.createIndex(MST_YIELD_SCHD_R.$yield_schd_no);
			MCIndexKey yaKey = yaL.createIndex(MST_YIELD_ACT_R.$yield_act_no);
			for (MfgActReg_Chk01_DtlByProdR r : up6()) {
				MST_YIELD_SCHD_R ysR = ysL.getFirst(ysKey, r.yield_schd_no());
				MST_YIELD_ACT_R yaR = yaL.getFirst(yaKey, r.yield_act_no());
				msgL.addAll(chkAndCompByProdBaseSub(r, ysR, yaR, yieldActL, yaKeyByOperAct));
			}
			return msgL;
		}

		protected MCMessageList chkAndCompByProdBaseSub(MfgActReg_Chk01_DtlByProdR r,
				MST_YIELD_SCHD_R ysR, MST_YIELD_ACT_R yaR,
				MCList<MST_YIELD_ACT_R> yieldActL, MCIndexKey yaKeyByOperAct) {
			MCMessageList msgL = new MCMessageList();
			
			MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
			if (hdrR.err_flg()) {
				r.err_flg(true);
			}

			if (isNull(r.yield_act_no())) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			}
			else if (r.isStatusDelete()) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
			else {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
			
			if (!isNull(ysR)) {
				r.yield_schd_no(ysR.yield_schd_no());
				r.schd_lot_no(ysR.lot_no());
				r.schd_sublot_no(ysR.sublot_no());
			}

			if (!isNull(yaR)) {
				// 取り消し時は出来高実績ＮＯしか渡ってこないため、出来高予定ＮＯの補完は、実績テーブルを元に行う
				r.yield_schd_no(yaR.yield_schd_no());
				r.stk_lst_prnt_flg(yaR.stk_lst_prnt_flg());
				if (!r.mes_flg()) {
					// MES対象外の場合は補完（MES対象の場合は上り電文に設定されているため、補完不要）
					r.ext_sys_cd(yaR.ext_sys_cd());
					r.ext_yield_act_no(yaR.ext_yield_act_no());
				}
				r.old_lot_no(yaR.lot_no());
				r.old_sublot_no(yaR.sublot_no());
				r.old_strg_loc_cd(yaR.strg_loc_cd());
				r.old_itm_cd(yaR.itm_cd());
				r.old_itm_sub1(yaR.itm_sub1());
				r.old_itm_sub2(yaR.itm_sub2());
				r.old_itm_sub3(yaR.itm_sub3());
			}

			r.sublot_ctl_flg(r.same_lot_flg());
			
			MfgActReg_Chk01_DtlOperR operR = _operCache.getCache(r.oper_peg_no());
			
			if (isNull(operR)) {
				msgL.add(new MCMessage(r, null, MSBCL1076, toDispGUIIndex(r)));
				r.err_flg(true);
			}
			else {
				if (!MAC_DATA_CRUD_TYP.isDEL(operR.data_crud_typ())
						&& !isNull(operR.end_act_tm())
						&& !operR.not_cmpl_flg()
						&& MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					boolean errObjFlg = true; // 副産品実績が全行削除されてしまうかどうか（初期値はtrue）
					// 工程に紐つく副産品の上り電文を取得する。
					MCList<MfgActReg_Chk01_DtlByProdR> subByProdUpL = _byProdCacheForOper
							.getCache(r.oper_peg_no());
					if (!subByProdUpL.subList(
							bpR -> !bpR.isStatusDelete() && !isNull(bpR.yield_schd_no()))
							.isEmpty()) {
						// 工程に紐つく副産品の上り電文に、予定に紐つくかつ削除行以外が１行でも存在する場合、errObjFlgはfalse（＝エラーではない）
						errObjFlg = false;
					}
					else {
						// 工程に紐つく副産品の上り電文が、すべて削除行の場合
						MCIndexKey yieldIdx = subByProdUpL
								.createIndex(MfgActReg_Chk01_DtlByProdR.$yield_act_no);
						// DBからselectした副産品実績でループする
						for (MST_YIELD_ACT_R yieldR : yieldActL.subList(yaKeyByOperAct, operR.oper_act_no())) {
							if (isNull(subByProdUpL.getFirst(yieldIdx, yieldR.yield_act_no()))) {
								// DBからselectした副産品実績に対応する上り電文が存在しない（＝削除されない副産品実績が存在する）場合
								// errObjFlgはfalse（＝エラーではない）
								if (isNull(operR.end_act_tm()) || operR.not_cmpl_flg()) {
									errObjFlg = false;
									break;
								}
							}
						}
					}
					if (errObjFlg) {
						msgL.add(new MCMessage(r, null, MSBCL1098, hdrR.mfg_inst_no(), operR.oper_act_no(), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
			}

			// ワーキンググループ補正
			if (!isNull(hdrR)) {
				r.wg_cd(hdrR.wg_cd());
			}

			return msgL;
		}
		@Override
		protected boolean isSetListLogicValue(MCNumber paramIndex, MCRow row,
				String column) {
			if (isSame(paramIndex, 3)) {
				if (isSame(column, MfgActReg_Chk01_DtlLossR.$fxd_loss_flg)) {
					if (!isNull(row.getString(MfgActReg_Chk01_DtlLossR.$loss_act_no))) {
						// 固定ロスＦＬＧはトランザクション登録時の値を優先するためfalseを返す
						return false;
					}
				}
			}
			return super.isSetListLogicValue(paramIndex, row, column);
		}
		
		@Override
		protected void setListLogicValue(MCNumber paramIndex, MCRow row, String column,
				Comparable<?> value) {
			super.setListLogicValue(paramIndex, row, column, value);

			if (isSame(paramIndex, 2)) {
				if (isSame(column, MfgActReg_Chk01_DtlInptR.$itm_typ)) {
					MfgActReg_Chk01_DtlInptR inptR = (MfgActReg_Chk01_DtlInptR)row;
					copyInptItmTypToLoss(inptR.peg_no(), inptR.itm_typ());
				}
				else if (isSame(column, MfgActReg_Chk01_DtlInptR.$itm_typ_d_cd)) {
					MfgActReg_Chk01_DtlInptR inptR = (MfgActReg_Chk01_DtlInptR)row;
					copyInptItmTypDCdToLoss(inptR.peg_no(), inptR.itm_typ_d_cd());
				}
			}
		}
		
		protected void copyInptItmTypToLoss(MCNumber inptPegNo, String val) {
			for (MfgActReg_Chk01_DtlLossR lossR : _lossCacheForInpt.getCache(inptPegNo)) {
				lossR.itm_typ(val);
			}
		}
		
		protected void copyInptItmTypDCdToLoss(MCNumber inptPegNo, String val) {
			for (MfgActReg_Chk01_DtlLossR lossR : _lossCacheForInpt.getCache(inptPegNo)) {
				lossR.itm_typ_d_cd(val);
			}
		}

		protected void chkAndCompAfterListLogic() {
			// マスタキャッシュ処理
			doMasterCache();
			
			// リストロジック実行後に実施すべきチェック、補完処理
			chkAndCompHdrAfterListLogic(up0().subList(MfgActReg_Chk01_HdrR.$err_flg, false));
			
			chkAndCompOperAfterListLogic();
			copyErrFlg(up0(), up1(), MfgActReg_Upd01_HdrR.$peg_no, MfgActReg_Upd01_DtlOperR.$hdr_peg_no);
			
			chkAndCompYieldAfterListLogic();
			copyErrFlg(up0(), up5(), MfgActReg_Upd01_HdrR.$peg_no, MfgActReg_Upd01_DtlYieldR.$hdr_peg_no);
			chkAndCompInptAfterListLogic();
			copyErrFlg(up0(), up2(), MfgActReg_Upd01_HdrR.$peg_no, MfgActReg_Upd01_DtlInptR.$hdr_peg_no);
			
			chkAndCompWkAfterListLogic();
			copyErrFlg(up0(), up4(), MfgActReg_Upd01_HdrR.$peg_no, MfgActReg_Upd01_DtlWkR.$hdr_peg_no);
			
			
			chkAndCompByProdAfterListLogic();
			copyErrFlg(up0(), up6(), MfgActReg_Upd01_HdrR.$peg_no, MfgActReg_Upd01_DtlByProdR.$hdr_peg_no);
			
			// ロットＮＯ、サブロットＮＯの発番、チェック処理（無駄な発番をしないようにするため、チェック処理の一番最後で実施する）
			// ※ヘッダのerr_flgはsetAndChkLotNoメソッド内で設定するため、copyErrFlgは実行していない
			setAndChkLotNo();
		}

		protected FXUCL_MCDbcCache<MAM_BP_R> _bpCache;
		protected FXUCL_MCDbcCache<MAM_LOC_R> _mfgLocCache;
		protected FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R> _provUpriCache;

		protected void doMasterCache() {
			// 取引先マスタ
			MAM_BP_R bpL_t = MAM_BP_R.create("T");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(bpL_t);
			bpL_bldr.setSelect(bpL_t.cur_cd);
			_bpCache = new FXUCL_MCDbcCache<MAM_BP_R>(bpL_bldr, up0(),MfgActReg_Chk01_HdrR.$sppl_cd);
			
			// 場所マスタ
			MAM_LOC_R locL_t = MAM_LOC_R.create("T");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(locL_t);
			locL_bldr.setSelect(locL_t.pre_outsrc_act_flg);
			_mfgLocCache = new FXUCL_MCDbcCache<MAM_LOC_R>(locL_bldr, up0(),MfgActReg_Chk01_HdrR.$mfg_loc_cd);

			//支給単価マスタ
			MCList<MAM_PROV_UPRI_R> bindL = MCList.create(MAM_PROV_UPRI_R.class);
			for (MfgActReg_Chk01_DtlInptR inptR :up2()) {
				MAM_PROV_UPRI_R bindR = MAM_PROV_UPRI_R.create();
				MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(inptR.hdr_peg_no());
				if (MSC_MFG_MTD_TYP.isEXTNL(hdrR.mfg_mtd_typ())
						&& MSC_STK_ID_TYP.isSLF_SUPPRT(inptR.stk_id_typ())) {
					bindR.addNumberColumn("peg_no", inptR.peg_no());
					bindR.itm_cd(inptR.itm_cd());
					bindR.itm_sub1(inptR.itm_sub1());
					bindR.itm_sub2(inptR.itm_sub2());
					bindR.itm_sub3(inptR.itm_sub3());
					bindR.prsppl_cd(hdrR.sppl_cd());
					bindR.cur_cd(_bpCache.getCache(hdrR.sppl_cd()).cur_cd());
					bindR.wg_cd(hdrR.wg_cd());
					bindR.st_dt(inptR.act_tm());
					bindL.add(bindR);
				}
			}
			MAM_PROV_UPRI_R dbc_t = MAM_PROV_UPRI_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(dbc_t);
			dbc_bldr.setSelect(dbc_t.upri);
			_provUpriCache = new FXUCL_MCDbcCacheStEnd<MAM_PROV_UPRI_R>(
					dbc_bldr, bindL, MAM_PROV_UPRI_R.$itm_cd,
					MAM_PROV_UPRI_R.$itm_sub1, MAM_PROV_UPRI_R.$itm_sub2,
					MAM_PROV_UPRI_R.$itm_sub3, MAM_PROV_UPRI_R.$prsppl_cd,
					MAM_PROV_UPRI_R.$cur_cd, MAM_PROV_UPRI_R.$wg_cd);
		}
		
		protected MCIndexKey _up2HdrPegNoKey;
		
		protected void chkAndCompHdrAfterListLogic(MCList<MfgActReg_Chk01_HdrR> notErrL) {
			MSBIL_ClService.Cl_Chk03 oldSt = MSBIL_ClService.crtCl_Chk03();
			MSBIL_ClService.Cl_Chk03 oldEnd = MSBIL_ClService.crtCl_Chk03();

			MSBIL_ClService.Cl_Chk03 st = MSBIL_ClService.crtCl_Chk03();
			MSBIL_ClService.Cl_Chk03 end = MSBIL_ClService.crtCl_Chk03();
			
			for (MfgActReg_Chk01_HdrR hdrR : notErrL) {
				if (MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ())
						&& MSC_MFG_MTD_TYP.isEXTNL(hdrR.mfg_mtd_typ())) {
					if (!hdrR.arr_purc_exist_flg() && !_mfgLocCache.getEx(hdrR.mfg_loc_cd()).pre_outsrc_act_flg()) {
						MCMessagePool.add(new MCMessage(hdrR, null, MSBCL1039, toDispGUIIndex(hdrR)));
						hdrR.err_flg(true);
					}
				}
				
				// 月別仕掛在庫の締チェック
				// チェックする項目名にあわせてメッセージを変更するため、no_msg_flgをtrueで呼び出している
				// 更新前着手計上日
				if (isChkOldStAcDt(hdrR)) {
					Cl_Chk03_CndR oUpR = Cl_Chk03_CndR.create();
					copy(oUpR, hdrR, createMap_Cl_Chk03_CndR_MfgActReg_Chk01_HdrR());
					oUpR.ac_dt(hdrR.old_st_ac_dt());
					oldSt.up0().add(oUpR);
					oldSt.up1().no_msg_flg(true);
				}
				// 更新前終了計上日
				if (isChkOldEndAcDt(hdrR)) {
					Cl_Chk03_CndR oUpR = Cl_Chk03_CndR.create();
					copy(oUpR, hdrR, createMap_Cl_Chk03_CndR_MfgActReg_Chk01_HdrR());
					oUpR.ac_dt(hdrR.old_end_ac_dt());
					oldEnd.up0().add(oUpR);
					oldEnd.up1().no_msg_flg(true);
				}
				
				// 着手計上日
				if (isNull(hdrR.old_st_ac_dt()) || !isSame(hdrR.old_st_ac_dt(), hdrR.st_ac_dt())) {
					Cl_Chk03_CndR oUpR = Cl_Chk03_CndR.create();
					copy(oUpR, hdrR, createMap_Cl_Chk03_CndR_MfgActReg_Chk01_HdrR());
					oUpR.ac_dt(hdrR.st_ac_dt());
					st.up0().add(oUpR);
					st.up1().no_msg_flg(true);
				}
				// 完了計上日
				if (!isNull(hdrR.end_ac_dt())) {
					if (isNull(hdrR.old_end_ac_dt()) || !isSame(hdrR.old_end_ac_dt(), hdrR.end_ac_dt())) {
						Cl_Chk03_CndR oUpR = Cl_Chk03_CndR.create();
						copy(oUpR, hdrR, createMap_Cl_Chk03_CndR_MfgActReg_Chk01_HdrR());
						oUpR.ac_dt(hdrR.end_ac_dt());
						end.up0().add(oUpR);
						end.up1().no_msg_flg(true);
					}
				}
			}

			if (!oldSt.up0().isEmpty()) {
				oldSt.exec();
			}
			if (!oldEnd.up0().isEmpty()) {
				oldEnd.exec();
			}
			if (!st.up0().isEmpty()) {
				st.exec();
			}
			if (!end.up0().isEmpty()) {
				end.exec();
			}
			MCIndexKey oldStkey = oldSt.down0().createIndex(Cl_Chk03_CndR.$peg_no);
			MCIndexKey oldEndkey = oldEnd.down0().createIndex(Cl_Chk03_CndR.$peg_no);
			MCIndexKey stkey = st.down0().createIndex(Cl_Chk03_CndR.$peg_no);
			MCIndexKey endkey = end.down0().createIndex(Cl_Chk03_CndR.$peg_no);

			MCList<MST_MFG_ACT_R> wkL = MCList.create(MST_MFG_ACT_R.class);
			notErrL.distinctNE(MfgActReg_Chk01_HdrR.$mfg_act_no).forEach(r -> {
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					wkL.add().mfg_act_no(r.mfg_act_no());
				}
			});

			MCList<MST_INPT_ACT_R> inptActL = MCList.create(MST_INPT_ACT_R.class);
			MCList<MST_YIELD_ACT_R> yieldActL = MCList.create(MST_YIELD_ACT_R.class);
			MCList<MST_WK_ACT_R> wkActL = MCList.create(MST_WK_ACT_R.class);
			MCIndexKey inptActkey = inptActL.createIndex(MST_INPT_ACT_R.$mfg_act_no);
			MCIndexKey yieldActkey = yieldActL.createIndex(MST_YIELD_ACT_R.$mfg_act_no);
			MCIndexKey wkActkey = wkActL.createIndex(MST_WK_ACT_R.$mfg_act_no);

			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_MFG_ACT_R.create("T"));
			if (!wkL.isEmpty()) {
				dbWkDelete("MSBCL6050_MSW_MFG_ACT_D01", wkL_bldr.getBaseDbc());
				dbWkInsert("MSBCL6050_MSW_MFG_ACT_I01", wkL, wkL_bldr.getBaseDbc());

				MSW_MFG_ACT_KEY_R w = MSW_MFG_ACT_KEY_R.create("W");
				// 製造実績ヘッダの製造実績ＮＯに紐づく投入実績の取得
				MST_INPT_ACT_R inptActL_t = MST_INPT_ACT_R.create("T");
				MCQueryApiBuilder inptActL_bldr = MCQueryApiBuilder.create(inptActL_t);
				inptActL_bldr.setSelect(inptActL_t.ac_dt);
				inptActL_bldr.addSelect(inptActL_t.inpt_act_no);
				inptActL_bldr.addSelect(inptActL_t.mfg_act_no);
				inptActL_bldr.addInnerJoin(w, bracket(w.mfg_act_no.eq(inptActL_t.mfg_act_no)));
				dbSelect("MSBCL6050_MST_INPT_ACT_S02", inptActL, inptActL_bldr);
				inptActkey = inptActL.createIndex(MST_INPT_ACT_R.$mfg_act_no);

				// 製造実績ヘッダの製造実績ＮＯに紐づく出来高(副産品含む)実績の取得
				MST_YIELD_ACT_R yieldActL_t = MST_YIELD_ACT_R.create("T");
				MCQueryApiBuilder yieldActL_bldr = MCQueryApiBuilder.create(yieldActL_t);
				yieldActL_bldr.setSelect(yieldActL_t.ac_dt);
				yieldActL_bldr.addSelect(yieldActL_t.yield_act_no);
				yieldActL_bldr.addSelect(yieldActL_t.mfg_act_no);
				yieldActL_bldr.addInnerJoin(w, bracket(w.mfg_act_no.eq(yieldActL_t.mfg_act_no)));
				dbSelect("MSBCL6050_MST_YIELD_ACT_S06", yieldActL, yieldActL_bldr);
				yieldActkey = yieldActL.createIndex(MST_YIELD_ACT_R.$mfg_act_no);

				// 製造実績ヘッダの製造実績ＮＯに紐づく工数実績の取得
				MST_WK_ACT_R wkActL_t = MST_WK_ACT_R.create("T");
				MCQueryApiBuilder wkActL_bldr = MCQueryApiBuilder.create(wkActL_t);
				wkActL_bldr.setSelect(wkActL_t.ac_dt);
				wkActL_bldr.addSelect(wkActL_t.wk_act_no);
				wkActL_bldr.addSelect(wkActL_t.mfg_act_no);
				wkActL_bldr.addInnerJoin(w, bracket(w.mfg_act_no.eq(wkActL_t.mfg_act_no)));
				dbSelect("MSBCL6050_MST_WK_ACT_S03", wkActL, wkActL_bldr);
				wkActkey = wkActL.createIndex(MST_WK_ACT_R.$mfg_act_no);
			}

			_up2HdrPegNoKey = up2().createIndex(MfgActReg_Chk01_DtlInptR.$hdr_peg_no);

			for (MfgActReg_Chk01_HdrR hdrR : notErrL) {
				Cl_Chk03_CndR oldStR  = oldSt.down0().getFirst(oldStkey, hdrR.peg_no());
				if (!isNull(oldStR) && oldStR.err_flg()) {
					MCMessagePool.add(new MCMessage(hdrR, null, MSBCL1069,
							toYMDString(hdrR.old_st_ac_dt()), hdrR.mfg_inst_no(),
							hdrR.mfg_act_no(), toDispGUIIndex(hdrR)));
					hdrR.err_flg(true);
				}

				Cl_Chk03_CndR oldEndR = oldEnd.down0().getFirst(oldEndkey, hdrR.peg_no());
				if (!isNull(oldEndR) && oldEndR.err_flg()) {
					MCMessagePool.add(new MCMessage(hdrR, null, MSBCL1070,
							toYMDString(hdrR.old_end_ac_dt()), hdrR.mfg_inst_no(),
							hdrR.mfg_act_no(), toDispGUIIndex(hdrR)));
					hdrR.err_flg(true);
				}

				Cl_Chk03_CndR stR = st.down0().getFirst(stkey, hdrR.peg_no());
				if (!isNull(stR) && stR.err_flg()) {
					MCMessagePool.add(new MCMessage(hdrR, MfgActReg_Chk01_HdrR.$st_ac_dt,
							MSBCL1067, toYMDString(hdrR.st_ac_dt()), hdrR.mfg_inst_no(),
							hdrR.mfg_act_no(), toDispGUIIndex(hdrR)));
					hdrR.err_flg(true);
				}

				Cl_Chk03_CndR endR = end.down0().getFirst(endkey, hdrR.peg_no());
				if (!isNull(endR) && endR.err_flg()) {
					MCMessagePool.add(new MCMessage(hdrR, MfgActReg_Chk01_HdrR.$end_ac_dt,
							MSBCL1068, toYMDString(hdrR.end_ac_dt()), hdrR.mfg_inst_no(),
							hdrR.mfg_act_no(), toDispGUIIndex(hdrR)));
					hdrR.err_flg(true);
				}
				
				if (!MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					MCMessageList msgL = new MCMessageList();
					// 削除行以外に対する補完、チェック処理
					// 条件付必須チェック
					if (MSC_MFG_STS_TYP.isCMPL(hdrR.mfg_sts_typ())) {
						msgL.addAll(check(hdrR, MfgActReg_Chk01_HdrR.$end_act_tm, new FXUCL_RequiredValidater()));
						msgL.addAll(check(hdrR, MfgActReg_Chk01_HdrR.$end_ac_dt, new FXUCL_RequiredValidater()));
					}
					
					// 有効桁数チェック
					msgL.addAll(checkDecPlace(hdrR,
							MfgActReg_Chk01_HdrR.$base_unit_dec_place,
							MfgActReg_Chk01_HdrR.$base_unit_st_act_qty));
					
					// 着手計上日の前後チェック
					msgL.addAll(chkStacdt(hdrR
							, inptActL.subList(inptActkey, hdrR.mfg_act_no())
							, yieldActL.subList(yieldActkey, hdrR.mfg_act_no())
							, wkActL.subList(wkActkey, hdrR.mfg_act_no())));
					
					setErrFlg(hdrR, msgL);
					MCMessagePool.addAll(msgL);
				}
			}
			if (!wkL.isEmpty()) {
				dbWkDelete("MSBCL6050_MSW_MFG_ACT_D02", wkL_bldr.getBaseDbc());
			}

			MCQueryApiBuilder mfgInstWkBldr = MCQueryApiBuilder.create(MST_MFG_INST_R.create("MFG_INST_KEY"));
			dbWkDelete("MSBCL6050_MSW_MFG_INST_D01", mfgInstWkBldr.getBaseDbc());
			dbWkInsert("MSBCL6050_MSW_MFG_INST_I01", notErrL.groupBy(MfgActReg_Chk01_HdrR.$mfg_inst_no), mfgInstWkBldr.getBaseDbc());

			MCList<MST_INPT_SCHD_R> inptSchdL = getInptSchd(notErrL);
			MCList<MST_YIELD_SCHD_R> yieldSchdL = getYieldSchd(notErrL);
			MCIndexKey inptSchdIdx = inptSchdL.createIndex(MST_INPT_SCHD_R.$mfg_inst_no);
			MCIndexKey yieldSchdIdx = yieldSchdL.createIndex(MST_YIELD_SCHD_R.$mfg_inst_no);

			// 製造指図時の場所（投入場所、格納場所）が論理削除されていないかどうかのチェック
			for (MfgActReg_Chk01_HdrR hdrR : notErrL) {
				for (MST_INPT_SCHD_R inptSchdR : inptSchdL.subList(inptSchdIdx, hdrR.mfg_inst_no())) {
					if (!isSame(inptSchdR.inpt_loc_cd(), inptSchdR.getStringNE("loc_cd"))) {
						MCMessagePool.add(new MCMessage(hdrR, null,
								MSBCL1316, inptSchdR.inpt_loc_cd(), inptSchdR.inpt_schd_no(), toDispGUIIndex(hdrR)));
						hdrR.err_flg(true);
					}
				}
				for (MST_YIELD_SCHD_R yieldSchdR : yieldSchdL.subList(yieldSchdIdx, hdrR.mfg_inst_no())) {
					if (!isSame(yieldSchdR.strg_loc_cd(), yieldSchdR.getStringNE("loc_cd"))) {
						MCMessagePool.add(new MCMessage(hdrR, null,
								MSBCL1317, yieldSchdR.strg_loc_cd(), yieldSchdR.yield_schd_no(), toDispGUIIndex(hdrR)));
						hdrR.err_flg(true);
					}
				}
			}
			dbWkDelete("MSBCL6050_MSW_MFG_INST_D02", mfgInstWkBldr.getBaseDbc());

		}

		protected MCList<MST_INPT_SCHD_R> getInptSchd(MCList<MfgActReg_Chk01_HdrR> notErrL){
			MCList<MST_INPT_SCHD_R> inptSchdL = MCList.create(MST_INPT_SCHD_R.class);
			MST_INPT_SCHD_R inptSchd = MST_INPT_SCHD_R.create("INPT_SCHD");
			MSW_MFG_INST_KEY_R mfgInstKey = MSW_MFG_INST_KEY_R.create("MFG_INST_KEY");
			MAM_LOC_R loc = MAM_LOC_R.create("LOC");
			MCQueryApiBuilder inptSchdL_bldr = MCQueryApiBuilder.create(inptSchd);
			inptSchdL_bldr.setSelect(inptSchd.inpt_schd_no);
			inptSchdL_bldr.addSelect(inptSchd.mfg_inst_no);
			inptSchdL_bldr.addSelect(inptSchd.inpt_loc_cd);
			inptSchdL_bldr.addSelect(subQuery().select(loc.loc_cd).from(loc).where(inptSchd.inpt_loc_cd.eq(loc.loc_cd)).as("loc_cd"));
			inptSchdL_bldr.addInnerJoin(mfgInstKey, inptSchd.mfg_inst_no.eq(mfgInstKey.mfg_inst_no));
			inptSchdL_bldr.addWhereWithAnd(bracket(inptSchd.prov_typ.isNull().or(inptSchd.prov_typ.neq(value(MAC_PROV_TYP.SS.value())))));
			inptSchdL_bldr.addWhereWithAnd(inptSchd.inpt_ctl_typ.neq(value(MAC_INPT_CTL_TYP.NO_MRP_INST.value())));
			inptSchdL_bldr.addWhereWithAnd(inptSchd.can_flg.eq(value(false)));
			dbSelect("MSBCL6050_MST_INPT_SCHD_S05", inptSchdL, inptSchdL_bldr);

			return inptSchdL;
		}
		protected MCList<MST_YIELD_SCHD_R> getYieldSchd(MCList<MfgActReg_Chk01_HdrR> notErrL){
			MCList<MST_YIELD_SCHD_R> yieldSchdL = MCList.create(MST_YIELD_SCHD_R.class);
			MST_YIELD_SCHD_R yieldSchd = MST_YIELD_SCHD_R.create("YIELD_SCHD");
			MSW_MFG_INST_KEY_R mfgInstKey = MSW_MFG_INST_KEY_R.create("MFG_INST_KEY");
			MST_ITM_MFG_INST_R itmMfgInst = MST_ITM_MFG_INST_R.create("ITM_MFG_INST");
			MAM_LOC_R loc = MAM_LOC_R.create("LOC");
			MCQueryApiBuilder yieldSchdL_bldr = MCQueryApiBuilder.create(yieldSchd);
			yieldSchdL_bldr.setSelect(yieldSchd.yield_schd_no);
			yieldSchdL_bldr.addSelect(yieldSchd.mfg_inst_no);
			yieldSchdL_bldr.addSelect(yieldSchd.strg_loc_cd);
			yieldSchdL_bldr.addSelect(subQuery().select(loc.loc_cd).from(loc).where(yieldSchd.strg_loc_cd.eq(loc.loc_cd)).as("loc_cd"));
			yieldSchdL_bldr.addInnerJoin(mfgInstKey, yieldSchd.mfg_inst_no.eq(mfgInstKey.mfg_inst_no));
			yieldSchdL_bldr.addInnerJoin(itmMfgInst, bracket(yieldSchd.itm_mfg_inst_no.eq(itmMfgInst.itm_mfg_inst_no)));
			yieldSchdL_bldr.addWhereWithAnd(itmMfgInst.mfg_mtd_typ.neq(value(MSC_MFG_MTD_TYP.EXTNL.value())));
			yieldSchdL_bldr.addWhereWithAnd(yieldSchd.can_flg.eq(value(false)));
			dbSelect("MSBCL6050_MST_YIELD_SCHD_S11", yieldSchdL, yieldSchdL_bldr);

			return yieldSchdL;
		}
		
		protected MCMessageList chkStacdt(MfgActReg_Chk01_HdrR hdrR
				, MCList<MST_INPT_ACT_R> inptActL
				, MCList<MST_YIELD_ACT_R> yieldActL
				, MCList<MST_WK_ACT_R> wkActL) {
			MCMessageList msgL = new MCMessageList();
			
			if(MAC_DATA_CRUD_TYP.isCRT(hdrR.data_crud_typ()))
			{
				return msgL;
			}
			
			// 同時に訂正されることを考慮し、訂正対象(上り電文に存在する)実績は前後チェックの対象から外す
			// 投入
			MCIndexKey idxkeyIntAct = inptActL.createIndex(MST_INPT_ACT_R.$inpt_act_no);
			MCList<MST_INPT_ACT_R> removeIntActL = MCList.create(MST_INPT_ACT_R.class);
			MCList<MfgActReg_Chk01_DtlInptR> tgtUp2L = up2().subList(_up2HdrPegNoKey, hdrR.peg_no());
			for (MfgActReg_Chk01_DtlInptR tgtUp2R : tgtUp2L) {
				removeIntActL.addAll(inptActL.subList(idxkeyIntAct, tgtUp2R.inpt_act_no()));
			}
			
			if (removeIntActL.size() > 0) {
				inptActL.removeAll(removeIntActL);
			}
			// 出来高
			MCIndexKey idxkeyYieldAct = yieldActL.createIndex(MST_YIELD_ACT_R.$yield_act_no);
			MCList<MST_YIELD_ACT_R> removeYieldActL = MCList.create(MST_YIELD_ACT_R.class);
			for (MfgActReg_Chk01_DtlYieldR up5R : up5()) {
				removeYieldActL.addAll(yieldActL.subList(idxkeyYieldAct, up5R.yield_act_no()));
			}
			// 副産品
			for (MfgActReg_Chk01_DtlByProdR up6R : up6()) {
				removeYieldActL.addAll(yieldActL.subList(idxkeyYieldAct, up6R.yield_act_no()));
			}
			if (removeYieldActL.size() > 0) {
				yieldActL.removeAll(removeYieldActL);
			}
			// 工数
			MCIndexKey idxkeyWkAct = wkActL.createIndex(MST_WK_ACT_R.$wk_act_no);
			MCList<MST_WK_ACT_R> removeWkAct = MCList.create(MST_WK_ACT_R.class);
			for (MfgActReg_Chk01_DtlWkR up4R : up4()) {
				removeWkAct.addAll(wkActL.subList(idxkeyWkAct, up4R.wk_act_no()));
			}
			if (removeWkAct.size() > 0) {
				wkActL.removeAll(removeWkAct);
			}
			
			// 着手計上日の前後チェック(投入実績のうち、最小の計上日と比較)
			if (!isNull(hdrR.st_ac_dt()) && !isNull(inptActL)) {
				if (hdrR.st_ac_dt().gt((MCDate)inptActL.min(MST_INPT_ACT_R.$ac_dt))) {	
					MfgActReg_Chk01_DtlInptR inptR = createMfgActReg_Chk01_DtlInptR();
					inptR.setValue(MfgActReg_Chk01_DtlInptR.$ac_dt, (MCDate)inptActL.min(MST_INPT_ACT_R.$ac_dt));
					msgL.add(msgNotBefore(hdrR, MfgActReg_Chk01_HdrR.$st_ac_dt,
							hdrR, MfgActReg_Chk01_HdrR.$st_ac_dt,
							inptR, MfgActReg_Chk01_DtlInptR.$ac_dt, true));
					
					return msgL;
				}
			}
			// 着手計上日の前後チェック(出来高(副産品問わず)実績のうち、最小の計上日と比較)
			if (!isNull(hdrR.st_ac_dt()) && !isNull(yieldActL)) {
				if (hdrR.st_ac_dt().gt((MCDate)yieldActL.min(MST_YIELD_ACT_R.$ac_dt))) {
					MfgActReg_Chk01_DtlYieldR yieldR = createMfgActReg_Chk01_DtlYieldR();
					yieldR.setValue(MfgActReg_Chk01_DtlYieldR.$ac_dt, (MCDate)yieldActL.min(MST_YIELD_ACT_R.$ac_dt));
					msgL.add(msgNotBefore(hdrR, MfgActReg_Chk01_HdrR.$st_ac_dt,
							hdrR, MfgActReg_Chk01_HdrR.$st_ac_dt,
							yieldR, MfgActReg_Chk01_DtlYieldR.$ac_dt, true));
					
					return msgL;
				}
			}
			// 着手計上日の前後チェック(工数実績のうち、最小の計上日と比較)
			if (!isNull(hdrR.st_ac_dt()) && !isNull(wkActL)) {
				if (hdrR.st_ac_dt().gt((MCDate)wkActL.min(MST_WK_ACT_R.$ac_dt))) {
					MfgActReg_Chk01_DtlWkR wkR = createMfgActReg_Chk01_DtlWkR();
					wkR.setValue(MfgActReg_Chk01_DtlWkR.$ac_dt, (MCDate)wkActL.min(MST_WK_ACT_R.$ac_dt));
					msgL.add(msgNotBefore(hdrR, MfgActReg_Chk01_HdrR.$st_ac_dt,
							hdrR, MfgActReg_Chk01_HdrR.$st_ac_dt,
							wkR, MfgActReg_Chk01_DtlWkR.$ac_dt, true));
					
					return msgL;
				}
			}
			
			return msgL;
		}
		
		protected boolean isChkOldStAcDt(MfgActReg_Chk01_HdrR hdrR) {
			if (isNull(hdrR.old_st_ac_dt())) {
				return false;
			}
			if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
				return true;
			}
			if (!isSame(hdrR.old_st_ac_dt(), hdrR.st_ac_dt())) {
				return true;
			}
			return false;
		}
		
		protected boolean isChkOldEndAcDt(MfgActReg_Chk01_HdrR hdrR) {
			if (isNull(hdrR.old_end_ac_dt())) {
				return false;
			}
			if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
				return true;
			}
			if (!isSame(hdrR.old_end_ac_dt(), hdrR.end_ac_dt())) {
				return true;
			}
			return false;
		}
		
		// 締チェック（仕掛用）
		protected Map_Cl_Chk03_CndR_MfgActReg_Chk01_HdrR<Cl_Chk03_CndR,MfgActReg_Chk01_HdrR> createMap_Cl_Chk03_CndR_MfgActReg_Chk01_HdrR() {
			return new Map_Cl_Chk03_CndR_MfgActReg_Chk01_HdrR<Cl_Chk03_CndR, MfgActReg_Chk01_HdrR>();
		}

		public class Map_Cl_Chk03_CndR_MfgActReg_Chk01_HdrR<D extends Cl_Chk03_CndR, S extends MfgActReg_Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Cl_Chk03_CndR.$peg_no, MfgActReg_Chk01_HdrR.$peg_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.stk_cls_chk_flg(true);
				dest.io_lmt_skip_flg(true);
			}
		}

		// 締チェック（出来高用）
		protected Map_Cl_Chk03_CndR_MfgActReg_Chk01_DtlYieldR<Cl_Chk03_CndR,MfgActReg_Chk01_DtlYieldR> createMap_Cl_Chk03_CndR_MfgActReg_Chk01_DtlYieldR() {
			return new Map_Cl_Chk03_CndR_MfgActReg_Chk01_DtlYieldR<Cl_Chk03_CndR, MfgActReg_Chk01_DtlYieldR>();
		}

		public class Map_Cl_Chk03_CndR_MfgActReg_Chk01_DtlYieldR<D extends Cl_Chk03_CndR, S extends MfgActReg_Chk01_DtlYieldR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Cl_Chk03_CndR.$peg_no, MfgActReg_Chk01_DtlYieldR.$peg_no);
				addColumnPathMap(Cl_Chk03_CndR.$ac_dt, MfgActReg_Chk01_DtlYieldR.$ac_dt);
				addColumnPathMap(Cl_Chk03_CndR.$can_ac_dt, MfgActReg_Chk01_DtlYieldR.$can_ac_dt);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
					dest.itm_cd(src.itm_cd());
					dest.itm_sub1(src.itm_sub1());
					dest.itm_sub2(src.itm_sub2());
					dest.itm_sub3(src.itm_sub3());
				}
				if (MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					// 出来高は品目の変更はできないので、itm_cdを渡す
					dest.old_itm_cd(src.itm_cd());
					dest.old_itm_sub1(src.itm_sub1());
					dest.old_itm_sub2(src.itm_sub2());
					dest.old_itm_sub3(src.itm_sub3());
				}
				dest.stk_cls_chk_flg(true);
			}
		}
		
		// 締チェック（副産品用）
		protected Map_Cl_Chk03_CndR_MfgActReg_Chk01_DtlByProdR<Cl_Chk03_CndR,MfgActReg_Chk01_DtlByProdR> createMap_Cl_Chk03_CndR_MfgActReg_Chk01_DtlByProdR() {
			return new Map_Cl_Chk03_CndR_MfgActReg_Chk01_DtlByProdR<Cl_Chk03_CndR, MfgActReg_Chk01_DtlByProdR>();
		}

		public class Map_Cl_Chk03_CndR_MfgActReg_Chk01_DtlByProdR<D extends Cl_Chk03_CndR, S extends MfgActReg_Chk01_DtlByProdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Cl_Chk03_CndR.$peg_no, MfgActReg_Chk01_DtlByProdR.$peg_no);
				addColumnPathMap(Cl_Chk03_CndR.$ac_dt, MfgActReg_Chk01_DtlByProdR.$ac_dt);
				addColumnPathMap(Cl_Chk03_CndR.$can_ac_dt, MfgActReg_Chk01_DtlByProdR.$can_ac_dt);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
					dest.itm_cd(src.itm_cd());
					dest.itm_sub1(src.itm_sub1());
					dest.itm_sub2(src.itm_sub2());
					dest.itm_sub3(src.itm_sub3());
				}
				if (MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					dest.old_itm_cd(src.old_itm_cd());
					dest.old_itm_sub1(src.old_itm_sub1());
					dest.old_itm_sub2(src.old_itm_sub2());
					dest.old_itm_sub3(src.old_itm_sub3());
				}
				dest.stk_cls_chk_flg(true);
			}
		}
		
		// 締チェック（投入用）
		protected Map_Cl_Chk03_CndR_MfgActReg_Chk01_DtlInptR<Cl_Chk03_CndR,MfgActReg_Chk01_DtlInptR> createMap_Cl_Chk03_CndR_MfgActReg_Chk01_DtlInptR() {
			return new Map_Cl_Chk03_CndR_MfgActReg_Chk01_DtlInptR<Cl_Chk03_CndR, MfgActReg_Chk01_DtlInptR>();
		}

		public class Map_Cl_Chk03_CndR_MfgActReg_Chk01_DtlInptR<D extends Cl_Chk03_CndR, S extends MfgActReg_Chk01_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Cl_Chk03_CndR.$peg_no, MfgActReg_Chk01_DtlInptR.$peg_no);
				addColumnPathMap(Cl_Chk03_CndR.$ac_dt, MfgActReg_Chk01_DtlInptR.$ac_dt);
				addColumnPathMap(Cl_Chk03_CndR.$can_ac_dt, MfgActReg_Chk01_DtlInptR.$can_ac_dt);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (MAC_DATA_CRUD_TYP.isCRT(src.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())) {
					dest.itm_cd(src.itm_cd());
					dest.itm_sub1(src.itm_sub1());
					dest.itm_sub2(src.itm_sub2());
					dest.itm_sub3(src.itm_sub3());
				}
				if (MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					dest.old_itm_cd(src.old_itm_cd());
					dest.old_itm_sub1(src.old_itm_sub1());
					dest.old_itm_sub2(src.old_itm_sub2());
					dest.old_itm_sub3(src.old_itm_sub3());
				}
				dest.stk_cls_chk_flg(true);
			}
		}
		
		protected void chkAndCompOperAfterListLogic() {
			for (MfgActReg_Chk01_DtlOperR operR : up1()) {
				MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(operR.hdr_peg_no());
				if (hdrR.err_flg()) {
					continue;
				}
				
				if (!MAC_DATA_CRUD_TYP.isDEL(operR.data_crud_typ())) {
					// 削除行以外に対する補完、チェック処理
					MCMessageList msgL = new MCMessageList();
					
					msgL.addAll(checkDecPlace(operR,
							MfgActReg_Chk01_DtlOperR.$oper_unit_dec_place,
							MfgActReg_Chk01_DtlOperR.$oper_unit_act_qty));
					
					setErrFlg(operR, msgL);
					MCMessagePool.addAll(msgL);
				}
			}
		}
		
		protected void chkAndCompInptAfterListLogic() {
			MCList<MfgActReg_Chk01_DtlInptR> lotChkL = MCList.create(MfgActReg_Chk01_DtlInptR.class);
			MCList<MfgActReg_Chk01_DtlInptR> vmiChkL = MCList.create(MfgActReg_Chk01_DtlInptR.class);
			MCList<MfgActReg_Chk01_DtlInptR> provSrchL = MCList.create(MfgActReg_Chk01_DtlInptR.class);
			MCList<MfgActReg_Chk01_DtlInptR> selfL = MCList.create(MfgActReg_Chk01_DtlInptR.class);
			
			MCList<Cl_Chk03_CndR> clChkL = MCList.create(Cl_Chk03_CndR.class);
			for (MfgActReg_Chk01_DtlInptR inptR : up2()) {
				MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(inptR.hdr_peg_no());
				if (hdrR.err_flg()) {
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isDEL(inptR.data_crud_typ())) {
					// 締チェックサービスに渡さないようにするために計上日をクリアする
					inptR.ac_dt(null);
				}
				
				// 投入場所に対する締チェック用コンテナ作成
				Cl_Chk03_CndR inptLocClChkR = Cl_Chk03_CndR.create();
				copy(inptLocClChkR, inptR, createMap_Cl_Chk03_CndR_MfgActReg_Chk01_DtlInptR());
				if (MAC_DATA_CRUD_TYP.isCRT(inptR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isUPD(inptR.data_crud_typ())) {
					inptLocClChkR.loc_cd(inptR.inpt_loc_cd());
				}
				if (MAC_DATA_CRUD_TYP.isUPD(inptR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(inptR.data_crud_typ())) {
					inptLocClChkR.old_loc_cd(inptR.old_inpt_loc_cd());
				}
				// エラーメッセージ出力用にデータを追加でセットする
				inptLocClChkR.setBooleanNE("is_src_batch_flg", hdrR.is_src_batch_flg());
				inptLocClChkR.setStringNE("mfg_act_no", hdrR.mfg_act_no());
				clChkL.add(inptLocClChkR);
				
				// 製造場所に対する締チェック用コンテナ作成
				if (!isSame(inptR.inpt_loc_cd(), hdrR.mfg_loc_cd())) {
					Cl_Chk03_CndR mfgLocClChkR = Cl_Chk03_CndR.create();
					copy(mfgLocClChkR, inptR, createMap_Cl_Chk03_CndR_MfgActReg_Chk01_DtlInptR());
					if (MAC_DATA_CRUD_TYP.isCRT(inptR.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(inptR.data_crud_typ())) {
						mfgLocClChkR.loc_cd(hdrR.mfg_loc_cd());
					}
					if (MAC_DATA_CRUD_TYP.isUPD(inptR.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isDEL(inptR.data_crud_typ())) {
						mfgLocClChkR.old_loc_cd(hdrR.mfg_loc_cd());
					}
					mfgLocClChkR.setBooleanNE("is_src_batch_flg", hdrR.is_src_batch_flg());
					mfgLocClChkR.setStringNE("mfg_act_no", hdrR.mfg_act_no());
					clChkL.add(mfgLocClChkR);
				}
				
				if (!MAC_DATA_CRUD_TYP.isDEL(inptR.data_crud_typ())) {
					// 削除行以外に対する補完、チェック処理
					
					if (isInvalidStkIdTyp(hdrR.mfg_mtd_typ(), inptR)) {
						MCMessagePool.add(new MCMessage(inptR,
								MfgActReg_Chk01_DtlInptR.$stk_id_typ, MSBCL1003,
								inptR.stk_id_typ(), toDispGUIIndex(inptR)));
						inptR.err_flg(true);
					}
					
					if (MAC_LOT_MNG_TYP.isNOT_MNG(inptR.lot_mng_typ())) {
						inptR.lot_no(MAC_STR.NULL_VAL.value());
					}
					if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(inptR.sublot_mng_typ())) {
						inptR.sublot_no(MAC_STR.NULL_VAL.value());
					}
					
					// 非在庫品の場合の在庫関連項目の補完
					if (MAC_STK_MNG_TYP.isNOT_MNG(inptR.stk_mng_typ()) && !MSC_STK_ID_TYP.isSLF_SUPPRT(inptR.stk_id_typ())) {
						inptR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());

						setNotStkOutDefVal(inptR);
					}
	
					// 投入に紐付くロス数量（ロス実績数＋固定ロス実績数）を取得
					MCNumber lossQty = getLossQty(inptR.peg_no());
					if (inptR.base_unit_inpt_qty().isZero() && lossQty.isZero()) {
						if (inptR.abort_flg()) {
							// 数量０の打切の場合の在庫関連項目の補完
							setAbortZeroQtyVal(hdrR, inptR);
						}
						else {
							// 打切時以外は数量０を許可しない
							MCMessagePool.add(new MCMessage(inptR,
									MfgActReg_Chk01_DtlInptR.$base_unit_inpt_qty,
									MSBCL1134,
									toDispItm(inptR.itm_cd(), inptR.itm_sub1(),
											inptR.itm_sub2(), inptR.itm_sub3()),
									toDispGUIIndex(inptR)));
							inptR.err_flg(true);
						}
					}
					
					// ロットの存在チェックサービスを呼び出すか否か
					if (!isNullOrNullVal(inptR.lot_no())) {
						lotChkL.add(inptR);
					}

					// 着荷先ＣＤの補完
					setStkArrvBpNullVal(inptR);
					
					// 在庫取引先の補完
					if (MSC_STK_ID_TYP.isCOSTK(inptR.stk_id_typ()) || MSC_STK_ID_TYP.isSLF_SUPPRT(inptR.stk_id_typ())) {
						inptR.stk_bp_cd(MAC_STR.NULL_VAL.value());
					}

					//在庫識別区分が自給の場合の取得処理
					if (MSC_STK_ID_TYP.isSLF_SUPPRT(inptR.stk_id_typ())) {
						inptR.stk_bp_cd(hdrR.sppl_cd());
						setNotStkOutDefVal(inptR);
						
						inptR.sppl_cd(hdrR.sppl_cd());
						inptR.slf_support_cur_cd(_bpCache.getCache(hdrR.sppl_cd()).cur_cd());
						MAM_PROV_UPRI_R upriR = _provUpriCache.get(inptR.act_tm(), inptR.itm_cd(), inptR.itm_sub1(),
								inptR.itm_sub2(), inptR.itm_sub3(), hdrR.sppl_cd(),
								inptR.slf_support_cur_cd(), hdrR.wg_cd());
						inptR.slf_support_upri(upriR.upri());
						inptR.slf_support_xrate_cd(getCo().prov_xrate_cd());
						
						selfL.add(inptR);
					}
					
					// チェック処理
					MCMessageList msgL = new MCMessageList();
					
					// 有効桁数チェック
					msgL.addAll(checkDecPlace(inptR,
							MfgActReg_Chk01_DtlInptR.$base_unit_dec_place,
							MfgActReg_Chk01_DtlInptR.$base_unit_inpt_qty));
					msgL.addAll(checkDecPlace(inptR,
							MfgActReg_Chk01_DtlInptR.$base_unit_dec_place,
							MfgActReg_Chk01_DtlInptR.$acxfr_act_qty));

					// 実績日時未来日チェック
					msgL.addAll(check(inptR, MfgActReg_Chk01_DtlInptR.$act_tm, new MAUDL_TmBeforeTodayValidater()));
					// 計上日未来日チェック
					msgL.addAll(check(inptR, MfgActReg_Chk01_DtlInptR.$ac_dt, new FXUCL_BeforeTodayValidater()));
					// 版ＮＯ
					if (inptR.ver_flg()) {
						msgL.addAll(check(inptR, MfgActReg_Chk01_DtlInptR.$ver_no, new FXUCL_RequiredValidater()));
					}
					
					// 有効成分
					if (inptR.cont_fctr_flg()) {
						msgL.addAll(check(inptR, MfgActReg_Chk01_DtlInptR.$cont_inpt_qty, new FXUCL_RequiredValidater()));
						
						msgL.addAll(checkDecPlace(inptR,
								MfgActReg_Chk01_DtlInptR.$cont_fctr_dec_place,
								MfgActReg_Chk01_DtlInptR.$cont_inpt_qty));
					}
					else {
						inptR.cont_inpt_qty(null);
					}
					
					// 着手計上日の前後チェック
					if (!isNull(hdrR.st_ac_dt()) && !isNull(inptR.ac_dt())) {
						if (hdrR.st_ac_dt().gt(inptR.ac_dt())) {
							MfgActReg_Chk01_DtlInptR inptTmpR = createMfgActReg_Chk01_DtlInptR();
							inptTmpR.setValue(MfgActReg_Chk01_DtlInptR.$ac_dt, inptR.ac_dt());
							msgL.add(msgNotBefore(inptR, MfgActReg_Chk01_DtlInptR.$ac_dt,
									hdrR, MfgActReg_Chk01_HdrR.$st_ac_dt, inptTmpR,
									MfgActReg_Chk01_DtlInptR.$ac_dt, true));
						}
					}
					
					setErrFlg(inptR, msgL);
					MCMessagePool.addAll(msgL);
				}
				
				if (MAC_DATA_CRUD_TYP.isUPD(inptR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(inptR.data_crud_typ())) {
					MCMessageList msgL = new MCMessageList();
					msgL.addAll(check(inptR, MfgActReg_Chk01_DtlInptR.$can_ac_dt, new FXUCL_RequiredValidater()));
					setErrFlg(inptR, msgL);
					MCMessagePool.addAll(msgL);
				}
				// 行ステータスがDELETEの場合、CHK_DTによるbfTodayチェックが行われないため、ここでチェックを行う。
				if (inptR.isStatusDelete()) {
					MCMessageList msgL = new MCMessageList();
					msgL.addAll(check(inptR, MfgActReg_Chk01_DtlInptR.$can_ac_dt, new FXUCL_BeforeTodayValidater()));
					setErrFlg(inptR, msgL);
					MCMessagePool.addAll(msgL);
				}
				if (MAC_DATA_CRUD_TYP.isUPD(inptR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(inptR.data_crud_typ())) {
					provSrchL.add(inptR);
				}
				
				// 新規登録時は、投入実績の更新処理でロット提案を元に在庫識別区分を決定する場合があるため、
				// ここではVMIと支給のチェック処理を実行せず、更新処理内でチェック処理を実行する
				// そのため、UPDまたはDELの分岐を入れている
				if (MAC_DATA_CRUD_TYP.isUPD(inptR.data_crud_typ())) {
					if (MSC_STK_ID_TYP.isRNT_RCV(inptR.stk_id_typ())
							&& MSC_STK_ID_TYP.isRNT_RCV(inptR.old_stk_id_typ())) {
						// 前回も今回もＶＭＩ（UPD）
						vmiChkL.add(inptR);
					}
					else if (!MSC_STK_ID_TYP.isRNT_RCV(inptR.stk_id_typ())
							&& MSC_STK_ID_TYP.isRNT_RCV(inptR.old_stk_id_typ())) {
						// 前回ＶＭＩ以外、今回ＶＭＩ（DEL）
						vmiChkL.add(inptR);
					}
				}
				if (MAC_DATA_CRUD_TYP.isDEL(inptR.data_crud_typ())) {
					if (MSC_STK_ID_TYP.isRNT_RCV(inptR.old_stk_id_typ())) {
						// ＤＥＬ
						vmiChkL.add(inptR);
					}
				}
			}
			
			removeOnlyAbortedInptL(clChkL);
			
			// 締チェック呼び出し
			if (!clChkL.isEmpty()) {
				// 締チェックを実行するまでに発生したエラーメッセージを退避し、メッセージプールをクリアする
				MCMessageList bfrMsgL = (MCMessageList) MCMessagePool.getMessageList().clone();
				MCMessagePool.clear();
				MSBIL_ClService.Cl_Chk03 clChkOpe = MSBIL_ClService.crtCl_Chk03();
				clChkOpe.up0().addAll(clChkL);
				clChkOpe.exec();
				copyErrFlg(up2(), clChkOpe.down0());
				// 締チェックで発生したエラーメッセージを退避し、メッセージプールをクリアする
				MCMessageList clChk03ErrMsgL = (MCMessageList) MCMessagePool.getMessageList().clone();
				MCMessagePool.clear();
				
				// 締チェックでエラーになった情報に対し、追加のエラーメッセージを出力するために、エラーメッセージのリストを作成する
				MCMessageList addInfErrMsgL = new MCMessageList();
				MCIndexKey clChkLIndex = clChkL.createIndex(Cl_Chk03_CndR.$peg_no);
				for (Cl_Chk03_CndR chk03DownCnd : clChkOpe.down0()) {
					// エラーフラグがONではない情報はスキップする
					if (!chk03DownCnd.err_flg()) {
						continue;
					}
					// 締チェックの引数に渡したリストと、締チェック処理のdownを、pegNoでマッチングし、エラーメッセージを作成する
					if (!isNull(chk03DownCnd.peg_no())) {
						Cl_Chk03_CndR clChk03PegNoMatch = clChkL.getFirst(clChkLIndex, chk03DownCnd.peg_no());
						if (!isNull(clChk03PegNoMatch) &&
							clChk03PegNoMatch.getBooleanNE("is_src_batch_flg")) {
							// エラーメッセージを追加する
							addInfErrMsgL.add(new MCMessage(clChk03PegNoMatch, null, 
									MSBCL1205,
									clChk03PegNoMatch.getStringNE("mfg_act_no"),
									clChk03PegNoMatch.itm_cd()));
						}
					}
				}
				
				// 締チェックを行う前に発生したエラーメッセージを、メッセージプールに戻す
				MCMessagePool.addAll(bfrMsgL);
				
				// 締チェックにて発生したエラーメッセージ1つに対し
				// 上記処理で作成した補足のエラーメッセージを追加し、メッセージプールに戻す
				for (int i=0; i<clChk03ErrMsgL.size(); i++) {
					// 「製造実績ＮＯ」「投入品目」を出力する、補足のエラーメッセージをメッセージプールに追加する
					if (i < addInfErrMsgL.size()) {
						MCMessagePool.add(addInfErrMsgL.get(i));
					}
					// 締チェックのエラーメッセージをメッセージプールに追加する
					MCMessagePool.add(clChk03ErrMsgL.get(i));
				}
			}

			// 投入ロットの存在チェックサービス呼び出し
			MSBFL_LotService.Lot_Chk03 lotOpe = MSBFL_LotService.crtLot_Chk03();
			if (!lotChkL.isEmpty()) {
				addAll(lotOpe.up0(), lotChkL, createMap_Lot_Chk03_CndR_MfgActReg_Chk01_DtlInptR());
				lotOpe.exec();
				String[] destCols = new String[] {
						MfgActReg_Chk01_DtlInptR.$lot_quality_typ,
						MfgActReg_Chk01_DtlInptR.$act_cont_fctr,
						MfgActReg_Chk01_DtlInptR.$vld_dt,
						MfgActReg_Chk01_DtlInptR.$first_gr_dt,
						MfgActReg_Chk01_DtlInptR.$lot_seq,
						MfgActReg_Chk01_DtlInptR.$lot_ver_no
				};
				String[] srcCols = new String[] {
						Lot_Chk03_CndR.$quality_typ,
						Lot_Chk03_CndR.$act_cont_fctr,
						Lot_Chk03_CndR.$vld_dt,
						Lot_Chk03_CndR.$first_gr_dt,
						Lot_Chk03_CndR.$lot_seq,
						Lot_Chk03_CndR.$ver_no
				};
				copyByPegNo(lotChkL, destCols, lotOpe.down0(), srcCols);
				copyErrFlg(lotChkL, lotOpe.down0());
			}
			
			for (MfgActReg_Chk01_DtlInptR r : lotChkL) {
				MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
				if (!hdrR.not_pd_chk_flg()) {
					// 有効期限と投入実績日の前後チェック
					MCDate actDt = r.act_tm().startTimeOfDay();
					if (!isNull(r.vld_dt()) && r.vld_dt().ltDate(actDt)) {
						MCMessagePool.add(new MCMessage(r,
								MfgActReg_Chk01_DtlInptR.$act_tm, MSBCL1045,
								toYMDString(r.vld_dt()), toYMDString(actDt), toDispGUIIndex(r)));
						r.err_flg(true);
					}
				}
				// ロットの良品区分のチェック
				if (MAC_QUALITY_TYP.isDFCT_INSP(r.lot_quality_typ())
						|| MAC_QUALITY_TYP.isDFCT_OPER(r.lot_quality_typ())) {
					MCMessagePool.add(
							new MCMessage(r, MfgActReg_Chk01_DtlInptR.$lot_no, MSBCL1004,
									toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(),
											r.itm_sub3()),
									r.lot_no(), r.sublot_no(), toDispGUIIndex(r)));
					r.err_flg(true);
				}
			}
			
			// VMIサービスのチェック処理の呼び出し（外注製造実績サービスにも同様の処理がある）
			if (!vmiChkL.isEmpty()) {
				MSBDL_VmiService.Vmi_Chk01 vmiOpe = MSBDL_VmiService.crtVmi_Chk01();
				addAll(vmiOpe.up0(), vmiChkL, createMap_Vmi_Chk01_DtlR_MfgActReg_Chk01_DtlInptR());
				vmiOpe.exec();
				String[] destCols = new String[] {
						MfgActReg_Chk01_DtlInptR.$vmi_interim_flg,
						MfgActReg_Chk01_DtlInptR.$vmi_upri
				};
				String[] srcCols = new String[] {
						Vmi_Chk01_DtlR.$interim_flg,
						Vmi_Chk01_DtlR.$trd_cur_upri
				};
				copyByPegNo(vmiChkL, destCols, vmiOpe.down0(), srcCols);
				copyErrFlg(vmiChkL, vmiOpe.down0());
			}
			
			// 自給品の場合のマスタ取得
			if (!selfL.isEmpty()) {
				// 在庫識別区分が自給の場合、支給税コード取得用ファンクションから取得する。
				execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_PROV_TAX_CD", "01"),
						MABCFunction.getFunctionExecuter("MAPA_TAX$F_GET_PROV_TAX_CD"),
						MfgActReg_Chk01_DtlInptR.$slf_support_tax_cd, selfL,
						MfgActReg_Chk01_DtlInptR.$itm_cd,
						MfgActReg_Chk01_DtlInptR.$itm_sub1,
						MfgActReg_Chk01_DtlInptR.$itm_sub2,
						MfgActReg_Chk01_DtlInptR.$itm_sub3,
						MfgActReg_Chk01_DtlInptR.$sppl_cd,
						MfgActReg_Chk01_DtlInptR.$act_tm);
				// 在庫識別区分が自給の場合、為替レートマスタから取得する。
				execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_XCHNG$F_GET_PROV_XRATE", "01"),
						MABCFunction.getFunctionExecuter("MAPA_XCHNG$F_GET_PROV_XRATE"),
						MfgActReg_Chk01_DtlInptR.$slf_support_xrate, selfL,
						MfgActReg_Chk01_DtlInptR.$slf_support_cur_cd,
						MfgActReg_Chk01_DtlInptR.$act_tm);
			}
			
			// 支給実績サービスのチェック処理の呼び出し（外注製造実績サービスにも同様の処理がある）
			if (!provSrchL.isEmpty()) {
	 			MSBEL_ProvActService.ProvAct_Chk01 provOpe = MSBEL_ProvActService.crtProvAct_Chk01();
				MCList<MST_PROV_ACT_R> provActL = getProvActL(provSrchL);
				
				MCIndexKey idxkey = provActL.createIndex(MST_PROV_ACT_R.$prov_src_act_no);
				for (MfgActReg_Chk01_DtlInptR upR : provSrchL) {
					MCList<MST_PROV_ACT_R> subL = provActL.subList(idxkey, upR.inpt_act_no());
					if (!subL.isEmpty() && MAC_DATA_CRUD_TYP.isUPD(upR.data_crud_typ())) {
						if (!isSame(upR.old_inpt_loc_cd(), upR.inpt_loc_cd())
								|| !isSame(upR.old_stk_id_typ(), upR.stk_id_typ())
								|| !isSame(upR.old_stk_arrv_bp_cd(),
										upR.stk_arrv_bp_cd())) {
							MCMessagePool.add(new MCMessage(upR, null, MSBCL1071,
									upR.old_inpt_loc_cd(), upR.old_stk_arrv_bp_cd(),
									upR.old_stk_id_typ(), toDispGUIIndex(upR)));
							upR.err_flg(true);
						}
					}
					
					// 投入実績１行を元に支給戻しと支給の２行の支給実績が作成される場合があるため、getFirstではなく
					// subListした結果で支給実績のチェック処理を実行する
					for (MST_PROV_ACT_R subR : subL) {
						ProvActChk01_DtlR oUpR = ProvActChk01_DtlR.create();
						copy(oUpR, upR, createMap_ProvActChk01_DtlR_MfgActReg_Chk01_DtlInptR());
						oUpR.prov_typ(subR.prov_typ());
						oUpR.trd_ptn_typ(subR.trd_ptn_typ());
						oUpR.prsppl_cd(subR.prsppl_cd());
						provOpe.up0().add(oUpR);
					}
				}
				if (!provOpe.up0().isEmpty()) {
					provOpe.exec();
					copyErrFlg(provSrchL, provOpe.down0());
				}
			}
		}
		
		protected void removeOnlyAbortedInptL(MCList<Cl_Chk03_CndR> clChkL) {
			//投入実績と投入実績残の打切数量を取得
			MCList<MST_INPT_ACT_R> iaL = MCList.create(MST_INPT_ACT_R.class);
			iaL.addNumberColumn(MST_INPT_ACT_REM_R.$base_unit_inpt_abort_qty);
			MST_INPT_ACT_R iaL_t = MST_INPT_ACT_R.create("T");
			MST_INPT_ACT_REM_R iarL_t = MST_INPT_ACT_REM_R.create("T1");
			MCQueryApiBuilder iaL_bldr = MCQueryApiBuilder.create(iaL_t);
			iaL_bldr.setSelect(
					iaL_t.inpt_act_no,
					iaL_t.inpt_schd_no,
					iaL_t.div_seq,
					iaL_t.ac_dt,
					iaL_t.act_tm,
					iaL_t.acxfr_rsn_cd,
					iaL_t.acxfr_bd_dpt_cd,
					iaL_t.lot_no,
					iaL_t.sublot_no,
					iaL_t.sno1,
					iaL_t.sno2,
					iaL_t.sno3,
					iaL_t.sno4,
					iaL_t.gd_cd,
					iaL_t.inpt_rsn_cd,
					iaL_t.stk_id_typ,
					iaL_t.stk_bp_cd,
					iaL_t.stk_arrv_bp_cd,
					iaL_t.base_unit_inpt_qty,
					iaL_t.base_unit_cd,
					iaL_t.inpt_loc_cd,
					iaL_t.inpt_str_ln_cd,
					iaL_t.acxfr_qty,
					iaL_t.trd_rmrks,
					iarL_t.base_unit_inpt_abort_qty
					);
			iaL_bldr.addInnerJoin(iarL_t, bracket(iaL_t.inpt_schd_no.eq(iarL_t.inpt_schd_no).and(iaL_t.div_seq.eq(iarL_t.div_seq))));
			MCList<MfgActReg_Chk01_DtlInptR> bindiaL = up2().subList(r -> !isNull(r.inpt_act_no()));
			if (!bindiaL.isEmpty()) {
				dbSelectKey("MSBCL6050_MST_INPT_ACT_S06",
						iaL, iaL_bldr, bindiaL.groupBy(MfgActReg_Chk01_DtlInptR.$inpt_act_no));
			}
			
			//製造実績を取得
			MCList<MST_MFG_ACT_R> mfgActL = MCList.create(MST_MFG_ACT_R.class);
			MST_MFG_ACT_R mfgActL_t = MST_MFG_ACT_R.create("T");
			MCQueryApiBuilder mfgActL_bldr = MCQueryApiBuilder.create(mfgActL_t);
			mfgActL_bldr.setSelect(
					mfgActL_t.mfg_act_no,
					mfgActL_t.act_dpt_cd,
					mfgActL_t.act_usr_cd
					);
			dbSelectKey("MSBCL6050_MST_MFG_ACT_S07", mfgActL, mfgActL_bldr, up0());
			
			//ロス実績を取得
			MCList<MST_LOSS_ACT_R> lossActL = MCList.create(MST_LOSS_ACT_R.class);
			MST_LOSS_ACT_R lossActL_t = MST_LOSS_ACT_R.create("T");
			MCQueryApiBuilder lossActL_bldr = MCQueryApiBuilder.create(lossActL_t);
			lossActL_bldr.setSelect(
					lossActL_t.loss_act_no,
					lossActL_t.base_unit_qty,
					lossActL_t.trd_rmrks);
			MCList<MfgActReg_Chk01_DtlLossR> bindlossL = up3().subList(r -> !isNull(r.loss_act_no()));
			if (!bindlossL.isEmpty()) {
				dbSelectKey("MSBCL6050_MST_LOSS_ACT_S04",
						lossActL, lossActL_bldr, bindlossL.groupBy(MfgActReg_Chk01_DtlLossR.$loss_act_no));
			}
			
			MCIndexKey iaKey = iaL.createIndex(MST_INPT_ACT_R.$inpt_act_no);
			MCIndexKey makey = mfgActL.createIndex(MST_MFG_ACT_R.$mfg_act_no);
			MCIndexKey laKey = lossActL.createIndex(MST_LOSS_ACT_R.$loss_act_no);
			MCList<Cl_Chk03_CndR> removeClChkL = MCList.create(Cl_Chk03_CndR.class);
			MCIndexKey clChkLIndex = clChkL.createIndex(Cl_Chk03_CndR.$peg_no);

			for (MfgActReg_Chk01_DtlInptR inptR : up2()) {
				if (MAC_DATA_CRUD_TYP.isUPD(inptR.data_crud_typ())) {
					MST_INPT_ACT_R oldInptR = iaL.getFirst(iaKey, inptR.inpt_act_no());
					if (!isNull(oldInptR) && isAbortFlgChanged(oldInptR, inptR)) {
						if (!(isInptValueChanged(oldInptR, inptR, mfgActL, makey) || isLossValueChanged(inptR, lossActL, laKey))) {
							removeClChkL.add(clChkL.getFirst(clChkLIndex, inptR.peg_no()));
							inptR.is_only_abort_flg(true);
						}
					}
				}
			}
			if (removeClChkL.size() > 0) {
				clChkL.removeAll(removeClChkL);
			}
		
		}
		
		protected boolean isValueChanged(Comparable<?>[][] cmp) {
			for(Comparable<?>[] c:cmp) {
				if (!isSame(c[0],c[1])) {
					return true;
				}
			}
			return false;
		}
		
		protected Comparable<?>[][] getCmpLossDtl(MST_LOSS_ACT_R oldLossR, MfgActReg_Chk01_DtlLossR newLossR) {
			return new Comparable[][] {
				{oldLossR.base_unit_qty(), newLossR.loss_qty()},
				{oldLossR.trd_rmrks(), newLossR.trd_rmrks()}
			};
		}
		
		protected Comparable<?>[][] getCmpInptDtl(MST_INPT_ACT_R oldInptR, MfgActReg_Chk01_DtlInptR newInptR,
				MST_MFG_ACT_R oldHdrR, MfgActReg_Chk01_HdrR newHdrR) {
			return new Comparable[][] {
				{oldInptR.ac_dt(), newInptR.ac_dt()},
				{oldInptR.ac_dt(), newInptR.can_ac_dt()},
				{oldInptR.act_tm(), newInptR.act_tm()},
				{oldInptR.acxfr_rsn_cd(), newInptR.acxfr_act_rsn_cd()},
				{oldHdrR.act_dpt_cd(), newHdrR.act_dpt_cd()},
				{oldInptR.acxfr_bd_dpt_cd(), newInptR.acxfr_act_bd_dpt_cd()},
				{oldHdrR.act_usr_cd(), newHdrR.act_usr_cd()},
				{oldInptR.lot_no(), newInptR.lot_no()},
				{oldInptR.sublot_no(), newInptR.sublot_no()},
				{oldInptR.sno1(), newInptR.sno1()},
				{oldInptR.sno2(), newInptR.sno2()},
				{oldInptR.sno3(), newInptR.sno3()},
				{oldInptR.sno4(), newInptR.sno4()},
				{oldInptR.gd_cd(), newInptR.gd_cd()},
				{oldInptR.inpt_rsn_cd(), newInptR.inpt_rsn_cd()},
				{oldInptR.stk_id_typ(), newInptR.stk_id_typ()},
				{oldInptR.stk_bp_cd(), newInptR.stk_bp_cd()},
				{oldInptR.stk_arrv_bp_cd(), newInptR.stk_arrv_bp_cd()},
				{oldInptR.base_unit_inpt_qty(), newInptR.base_unit_inpt_qty()},
				{oldInptR.inpt_loc_cd(), newInptR.inpt_loc_cd()},
				{oldInptR.inpt_str_ln_cd(), newInptR.inpt_str_ln_cd()},
				{oldInptR.acxfr_qty(), newInptR.acxfr_act_qty()},
				{oldInptR.trd_rmrks(), newInptR.trd_rmrks()}
			};
		}
		
		protected boolean isAbortFlgChanged(MST_INPT_ACT_R oldinptR, MfgActReg_Chk01_DtlInptR inptR) {
			if((inptR.abort_flg() && oldinptR.getNumberNE("base_unit_inpt_abort_qty").eq(0))
					||(!inptR.abort_flg() && oldinptR.getNumberNE("base_unit_inpt_abort_qty").neq(0))) {
				return true;
			}
			else {
				return false;
			}
		}
		
		protected boolean isInptValueChanged(MST_INPT_ACT_R oldInptR, MfgActReg_Chk01_DtlInptR inptR, MCList<MST_MFG_ACT_R> mfgActL, MCIndexKey makey) {
			MfgActReg_Chk01_HdrR newHdrR = _hdrCache.getCache(inptR.hdr_peg_no());
			MST_MFG_ACT_R oldHdrR = mfgActL.getFirst(makey, newHdrR.mfg_act_no());
			return isValueChanged(getCmpInptDtl(oldInptR, inptR, oldHdrR, newHdrR));
		}
		
		protected boolean isLossValueChanged(MfgActReg_Chk01_DtlInptR inptR, MCList<MST_LOSS_ACT_R> lossActL, MCIndexKey laKey) {
			for (MfgActReg_Chk01_DtlLossR lossR : _lossCacheForInpt.getCache(inptR.peg_no())) {
				if (MAC_DATA_CRUD_TYP.isUPD(lossR.data_crud_typ())) {
					MST_LOSS_ACT_R oldLossR = lossActL.getFirst(laKey, lossR.loss_act_no());
					if (isValueChanged(getCmpLossDtl(oldLossR, lossR))) {
						return true;
					}
				}
				else {
					return true;
				}
			}
			return false;
		}
		
		protected void setNotStkOutDefVal(MfgActReg_Chk01_DtlInptR inptR) {
			inptR.lot_no(MAC_STR.NULL_VAL.value());
			inptR.sublot_no(MAC_STR.NULL_VAL.value());
			inptR.gd_cd(getDefaultFeedStkGd().gd_cd());
			inptR.acxfr_act_qty(null);
			inptR.acxfr_act_rsn_cd(null);
			inptR.acxfr_act_bd_dpt_cd(null);
		}
		
		/**
		 * 数量０の打切時の補完処理
		 * @param hdrR
		 * @param inptR
		 */
		protected void setAbortZeroQtyVal(MfgActReg_Chk01_HdrR hdrR, MfgActReg_Chk01_DtlInptR inptR) {
			if (isNull(inptR.lot_no())) {
				inptR.lot_no(MAC_STR.NULL_VAL.value());
			}
			if (isNull(inptR.sublot_no())) {
				inptR.sublot_no(MAC_STR.NULL_VAL.value());
			}
			inptR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
			if (MSC_MFG_MTD_TYP.isINTNL(hdrR.mfg_mtd_typ())) {
				inptR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
			}
			else {
				inptR.stk_arrv_bp_cd(hdrR.sppl_cd());
			}
			inptR.stk_bp_cd(MAC_STR.NULL_VAL.value());
			inptR.gd_cd(getDefaultFeedStkGd().gd_cd());
			inptR.acxfr_act_qty(null);
			inptR.acxfr_act_rsn_cd(null);
			inptR.acxfr_act_bd_dpt_cd(null);
		}

		/**
		 * 投入に紐付くロス実績数の集計値を戻す
		 * @param inptPegNo
		 * @return
		 */
		protected MCNumber getLossQty(MCNumber inptPegNo) {
			MCList<MfgActReg_Chk01_DtlLossR> lossL = _lossCacheForInpt.getCache(inptPegNo);
			MCNumber lossQty = MCNumber.ZERO;
			for (MfgActReg_Chk01_DtlLossR r : lossL) {
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					lossQty = lossQty.add(nvl(r.loss_qty(), MCNumber.ZERO));
				}
			}
			return lossQty;
		}
		
		protected boolean isInvalidStkIdTyp(String mfgMtdTyp, MfgActReg_Chk01_DtlInptR inptR) {
			if (isNull(inptR.stk_id_typ())) {
				return false;
			}
			if (MSC_STK_ID_TYP.isCOSTK(inptR.stk_id_typ()) || MSC_STK_ID_TYP.isRNT_RCV(inptR.stk_id_typ())
					 || MSC_STK_ID_TYP.isNCV_RCV(inptR.stk_id_typ())
					 || MSC_STK_ID_TYP.isONR_PROV(inptR.stk_id_typ())
					) {
				return false;
			}
			if (MSC_MFG_MTD_TYP.isEXTNL(mfgMtdTyp)) {
				if (MSC_STK_ID_TYP.isSLF_SUPPRT(inptR.stk_id_typ())) {
					return false;
				}
			}
			return true;
		}
		
		protected void setStkArrvBpNullVal(MfgActReg_Chk01_DtlInptR inptR) {
			if (isNull(inptR.inpt_loc_sppl_cd())) {
				// 自社場所の在庫に着荷先はつかないためNULL文字
				inptR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
			}
			else if (MAC_STK_MNG_TYP.isNOT_MNG(inptR.stk_mng_typ())) {
				// 非在庫品の場合は支給された在庫と仕様をあわせ、取引先に場所の発注先を設定する
				inptR.stk_arrv_bp_cd(inptR.inpt_loc_sppl_cd());
			}
			else if (MSC_STK_ID_TYP.isCOSTK(inptR.stk_id_typ())) {
				// 自社資産の場合は使用基準の有償支給の可能性があるため何もしない
			}
			else if (MSC_STK_ID_TYP.isRNT_RCV(inptR.stk_id_typ())) {
				// VMI在庫は自社場所にしか存在しないためNULL文字
				inptR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
			}
			else if (MSC_STK_ID_TYP.isNCV_RCV(inptR.stk_id_typ())) {
				// 無償受給品は、無償受給のみ可能なため支給時に着荷先が設定される。そのため着荷先に場所の発注先を設定する
				inptR.stk_arrv_bp_cd(inptR.inpt_loc_sppl_cd());
			}
			else if (MSC_STK_ID_TYP.isONR_PROV(inptR.stk_id_typ())) {
				// 既に有償支給されている場合は、支給時に着荷先が設定される。そのため取引先に場所の発注先を設定する
				inptR.stk_arrv_bp_cd(inptR.inpt_loc_sppl_cd());
			}
			else if (MSC_STK_ID_TYP.isSLF_SUPPRT(inptR.stk_id_typ())) {
				// 自給の場合は支給された在庫と仕様をあわせ、取引先に場所の発注先を設定する
				inptR.stk_arrv_bp_cd(inptR.inpt_loc_sppl_cd());
			}
		}
		
		protected Map_Lot_Chk03_CndR_MfgActReg_Chk01_DtlInptR<Lot_Chk03_CndR,MfgActReg_Chk01_DtlInptR> createMap_Lot_Chk03_CndR_MfgActReg_Chk01_DtlInptR() {
			return new Map_Lot_Chk03_CndR_MfgActReg_Chk01_DtlInptR<Lot_Chk03_CndR, MfgActReg_Chk01_DtlInptR>();
		}

		public class Map_Lot_Chk03_CndR_MfgActReg_Chk01_DtlInptR<D extends Lot_Chk03_CndR, S extends MfgActReg_Chk01_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Chk03_CndR.$peg_no, MfgActReg_Chk01_DtlInptR.$peg_no);
				addColumnPathMap(Lot_Chk03_CndR.$itm_cd, MfgActReg_Chk01_DtlInptR.$itm_cd);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub1, MfgActReg_Chk01_DtlInptR.$itm_sub1);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub2, MfgActReg_Chk01_DtlInptR.$itm_sub2);
				addColumnPathMap(Lot_Chk03_CndR.$itm_sub3, MfgActReg_Chk01_DtlInptR.$itm_sub3);
				addColumnPathMap(Lot_Chk03_CndR.$lot_no, MfgActReg_Chk01_DtlInptR.$lot_no);
				addColumnPathMap(Lot_Chk03_CndR.$sublot_no, MfgActReg_Chk01_DtlInptR.$sublot_no);
				addColumnPathMap(Lot_Chk03_CndR.$ver_no, MfgActReg_Chk01_DtlInptR.$ver_no);
			}
		}

		protected Map_Vmi_Chk01_DtlR_MfgActReg_Chk01_DtlInptR<Vmi_Chk01_DtlR,MfgActReg_Chk01_DtlInptR> createMap_Vmi_Chk01_DtlR_MfgActReg_Chk01_DtlInptR() {
			return new Map_Vmi_Chk01_DtlR_MfgActReg_Chk01_DtlInptR<Vmi_Chk01_DtlR, MfgActReg_Chk01_DtlInptR>();
		}

		public class Map_Vmi_Chk01_DtlR_MfgActReg_Chk01_DtlInptR<D extends Vmi_Chk01_DtlR, S extends MfgActReg_Chk01_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Vmi_Chk01_DtlR.$peg_no, MfgActReg_Chk01_DtlInptR.$peg_no);
				addColumnPathMap(Vmi_Chk01_DtlR.$purc_src_no, MfgActReg_Chk01_DtlInptR.$inpt_act_no);
				addColumnPathMap(Vmi_Chk01_DtlR.$purc_dt, MfgActReg_Chk01_DtlInptR.$act_tm);
				addColumnPathMap(Vmi_Chk01_DtlR.$ac_dt, MfgActReg_Chk01_DtlInptR.$ac_dt);
				addColumnPathMap(Vmi_Chk01_DtlR.$can_ac_dt, MfgActReg_Chk01_DtlInptR.$can_ac_dt);
				addColumnPathMap(Vmi_Chk01_DtlR.$stk_bp_cd, MfgActReg_Chk01_DtlInptR.$stk_bp_cd);
				addColumnPathMap(Vmi_Chk01_DtlR.$itm_cd, MfgActReg_Chk01_DtlInptR.$itm_cd);
				addColumnPathMap(Vmi_Chk01_DtlR.$itm_sub1, MfgActReg_Chk01_DtlInptR.$itm_sub1);
				addColumnPathMap(Vmi_Chk01_DtlR.$itm_sub2, MfgActReg_Chk01_DtlInptR.$itm_sub2);
				addColumnPathMap(Vmi_Chk01_DtlR.$itm_sub3, MfgActReg_Chk01_DtlInptR.$itm_sub3);
				addColumnPathMap(Vmi_Chk01_DtlR.$trd_unit_cd, MfgActReg_Chk01_DtlInptR.$base_unit_cd);
				addColumnPathMap(Vmi_Chk01_DtlR.$trd_unit_qty, MfgActReg_Chk01_DtlInptR.$base_unit_inpt_qty);
				addColumnPathMap(Vmi_Chk01_DtlR.$loc_cd, MfgActReg_Chk01_DtlInptR.$inpt_loc_cd);

			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else if (MSC_STK_ID_TYP.isRNT_RCV(src.old_stk_id_typ())
						&& MSC_STK_ID_TYP.isRNT_RCV(src.stk_id_typ())) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else if (MSC_STK_ID_TYP.isRNT_RCV(src.old_stk_id_typ())
						&& !MSC_STK_ID_TYP.isRNT_RCV(src.stk_id_typ())) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				dest.purc_src_typ(MSC_PURC_SRC_TYP.INPT.value());
			}
		}
		
		// 支給実績の取得
		protected MCList<MST_PROV_ACT_R> getProvActL(MCList<MfgActReg_Chk01_DtlInptR> provSrchL) {
			MCList<MST_PROV_ACT_R> provActL = MCList.create(MST_PROV_ACT_R.class);
			MST_PROV_ACT_R t = MST_PROV_ACT_R.create("T");
			MCQueryApiBuilder provActL_bldr = MCQueryApiBuilder.create(t);
			provActL_bldr.setSelect(t.prov_src_act_no,
					t.prov_typ,
					t.trd_ptn_typ,
					t.prsppl_cd,
					t.prov_basis_typ);
			provActL_bldr.setWhere(t.prov_src_act_no.eq(bind("inpt_act_no")));
			provActL_bldr.addWhereWithAnd(t.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.INPT.value())));
			provActL_bldr.addWhereWithAnd(t.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			provActL_bldr.setOrderByAsc(provActL_bldr.getBaseDbc().getKeyColumn$());
			if (!provSrchL.isEmpty()) {
				dbSelectForUpdate("MSBCL6050_MST_PROV_ACT_S01", provActL, provActL_bldr, provSrchL);
			}
			return provActL;
		}
		
		protected Map_ProvActChk01_DtlR_MfgActReg_Chk01_DtlInptR<ProvActChk01_DtlR,MfgActReg_Chk01_DtlInptR> createMap_ProvActChk01_DtlR_MfgActReg_Chk01_DtlInptR() {
			return new Map_ProvActChk01_DtlR_MfgActReg_Chk01_DtlInptR<ProvActChk01_DtlR, MfgActReg_Chk01_DtlInptR>();
		}

		public class Map_ProvActChk01_DtlR_MfgActReg_Chk01_DtlInptR<D extends ProvActChk01_DtlR, S extends MfgActReg_Chk01_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ProvActChk01_DtlR.$peg_no, MfgActReg_Chk01_DtlInptR.$peg_no);
				addColumnPathMap(ProvActChk01_DtlR.$data_crud_typ, MfgActReg_Chk01_DtlInptR.$data_crud_typ);
				addColumnPathMap(ProvActChk01_DtlR.$accpt_dt, MfgActReg_Chk01_DtlInptR.$act_tm);
				addColumnPathMap(ProvActChk01_DtlR.$ac_dt, MfgActReg_Chk01_DtlInptR.$ac_dt);
				addColumnPathMap(ProvActChk01_DtlR.$can_ac_dt, MfgActReg_Chk01_DtlInptR.$can_ac_dt);
				addColumnPathMap(ProvActChk01_DtlR.$itm_cd, MfgActReg_Chk01_DtlInptR.$itm_cd);
				addColumnPathMap(ProvActChk01_DtlR.$itm_sub1, MfgActReg_Chk01_DtlInptR.$itm_sub1);
				addColumnPathMap(ProvActChk01_DtlR.$itm_sub2, MfgActReg_Chk01_DtlInptR.$itm_sub2);
				addColumnPathMap(ProvActChk01_DtlR.$itm_sub3, MfgActReg_Chk01_DtlInptR.$itm_sub3);
				addColumnPathMap(ProvActChk01_DtlR.$prov_src_act_no, MfgActReg_Chk01_DtlInptR.$inpt_act_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.INPT.value());
				MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(src.hdr_peg_no());
				dest.wg_cd(hdrR.wg_cd());
			}
		}

		protected void chkAndCompWkAfterListLogic() {
			MCList<MfgActReg_Chk01_DtlWkR> srvChkL = MCList.create(MfgActReg_Chk01_DtlWkR.class);
			for (MfgActReg_Chk01_DtlWkR wkR : up4()) {
				MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(wkR.hdr_peg_no());
				if (hdrR.err_flg()) {
					continue;
				}
				srvChkL.add(wkR);
				
				if (!MAC_DATA_CRUD_TYP.isDEL(wkR.data_crud_typ())) {
					// 削除行以外に対する補完、チェック処理
					MCMessageList msgL = new MCMessageList();
					
					// 有効桁数チェック
					msgL.addAll(checkDecPlace(wkR,
							MfgActReg_Chk01_DtlWkR.$wk_cost_dec_place,
							MfgActReg_Chk01_DtlWkR.$act_wk_cost));
					
					
					// 着手計上日の前後チェック
					if (!isNull(hdrR.st_ac_dt()) && !isNull(wkR.ac_dt())) {
						if (hdrR.st_ac_dt().gt(wkR.ac_dt())) {
							MfgActReg_Chk01_DtlWkR wkTmpR = createMfgActReg_Chk01_DtlWkR();
							wkTmpR.setValue(MfgActReg_Chk01_DtlWkR.$ac_dt, wkTmpR.ac_dt());
							msgL.add(msgNotBefore(wkR, MfgActReg_Chk01_DtlWkR.$ac_dt,
									hdrR, MfgActReg_Chk01_HdrR.$st_ac_dt, wkTmpR,
									MfgActReg_Chk01_DtlWkR.$ac_dt, true));
						}
					}

					// 計上日未来日チェック
					msgL.addAll(check(wkR, MfgActReg_Chk01_DtlWkR.$ac_dt, new FXUCL_BeforeTodayValidater()));
					setErrFlg(wkR, msgL);
					MCMessagePool.addAll(msgL);
				}
			}
			
			if (!srvChkL.isEmpty()) {
				MSBCL_MfgActTblRegService.MfgActTblReg_Chk05 o = MSBCL_MfgActTblRegService.crtMfgActTblReg_Chk05();
				addAll(o.up0(), srvChkL, createMap_MfgActTblReg_Chk05_DtlR_MfgActReg_Chk01_DtlWkR());
				o.exec();
				copyByPegNo(srvChkL, new String[]{MfgActReg_Chk01_DtlWkR.$act_wk_cost}, o.down0(), new String[]{MfgActTblReg_Chk05_DtlR.$act_wk_cost});
				copyErrFlg(srvChkL, o.down0());
			}
		}
		
		protected Map_MfgActTblReg_Chk05_DtlR_MfgActReg_Chk01_DtlWkR<MfgActTblReg_Chk05_DtlR,MfgActReg_Chk01_DtlWkR> createMap_MfgActTblReg_Chk05_DtlR_MfgActReg_Chk01_DtlWkR() {
			return new Map_MfgActTblReg_Chk05_DtlR_MfgActReg_Chk01_DtlWkR<MfgActTblReg_Chk05_DtlR, MfgActReg_Chk01_DtlWkR>();
		}

		public class Map_MfgActTblReg_Chk05_DtlR_MfgActReg_Chk01_DtlWkR<D extends MfgActTblReg_Chk05_DtlR, S extends MfgActReg_Chk01_DtlWkR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActTblReg_Chk05_DtlR.$peg_no, MfgActReg_Chk01_DtlWkR.$peg_no);
				addColumnPathMap(MfgActTblReg_Chk05_DtlR.$data_crud_typ, MfgActReg_Chk01_DtlWkR.$data_crud_typ);
				addColumnPathMap(MfgActTblReg_Chk05_DtlR.$ac_dt, MfgActReg_Chk01_DtlWkR.$ac_dt);
				addColumnPathMap(MfgActTblReg_Chk05_DtlR.$st_tm, MfgActReg_Chk01_DtlWkR.$st_tm);
				addColumnPathMap(MfgActTblReg_Chk05_DtlR.$end_tm, MfgActReg_Chk01_DtlWkR.$end_tm);
				addColumnPathMap(MfgActTblReg_Chk05_DtlR.$brk_pd, MfgActReg_Chk01_DtlWkR.$brk_pd);
				addColumnPathMap(MfgActTblReg_Chk05_DtlR.$act_wk_cost, MfgActReg_Chk01_DtlWkR.$act_wk_cost);
				addColumnPathMap(MfgActTblReg_Chk05_DtlR.$wk_cost_calc_ctl_flg, MfgActReg_Chk01_DtlWkR.$wk_cost_calc_upd_flg);
				addColumnPathMap(MfgActTblReg_Chk05_DtlR.$wk_cost_dec_place, MfgActReg_Chk01_DtlWkR.$wk_cost_dec_place);
				addColumnPathMap(MfgActTblReg_Chk05_DtlR.$old_ac_dt, MfgActReg_Chk01_DtlWkR.$old_ac_dt);

			}
		}
		
		protected void chkAndCompYieldAfterListLogic() {
			MCList<Cl_Chk03_CndR> clChkL = MCList.create(Cl_Chk03_CndR.class);
			MCList<MfgActReg_Chk01_DtlYieldR> inspL = MCList.create(MfgActReg_Chk01_DtlYieldR.class);
			for (MfgActReg_Chk01_DtlYieldR yieldR : up5()) {
				MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(yieldR.hdr_peg_no());
				if (hdrR.err_flg()) {
					continue;
				}
				inspL.add(yieldR);
				if (MAC_DATA_CRUD_TYP.isDEL(yieldR.data_crud_typ())) {
					// 締チェックサービスに渡さないようにするために計上日をクリアする
					yieldR.ac_dt(null);
				}
				
				// 格納場所に対する締チェック用コンテナ作成
				Cl_Chk03_CndR strgLocClChkR = Cl_Chk03_CndR.create();
				copy(strgLocClChkR, yieldR, createMap_Cl_Chk03_CndR_MfgActReg_Chk01_DtlYieldR());
				if (MAC_DATA_CRUD_TYP.isCRT(yieldR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isUPD(yieldR.data_crud_typ())) {
					strgLocClChkR.loc_cd(yieldR.strg_loc_cd());
				}
				if (MAC_DATA_CRUD_TYP.isUPD(yieldR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(yieldR.data_crud_typ())) {
					strgLocClChkR.old_loc_cd(yieldR.old_strg_loc_cd());
				}
				clChkL.add(strgLocClChkR);
				
				// 製造場所に対する締チェック用コンテナ作成
				if (!isSame(yieldR.strg_loc_cd(), hdrR.mfg_loc_cd())) {
					Cl_Chk03_CndR mfgLocClChkR = Cl_Chk03_CndR.create();
					copy(mfgLocClChkR, yieldR, createMap_Cl_Chk03_CndR_MfgActReg_Chk01_DtlYieldR());
					if (MAC_DATA_CRUD_TYP.isCRT(yieldR.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(yieldR.data_crud_typ())) {
						mfgLocClChkR.loc_cd(hdrR.mfg_loc_cd());
					}
					if (MAC_DATA_CRUD_TYP.isUPD(yieldR.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isDEL(yieldR.data_crud_typ())) {
						mfgLocClChkR.old_loc_cd(hdrR.mfg_loc_cd());
					}
					clChkL.add(mfgLocClChkR);
				}
				
				if (!MAC_DATA_CRUD_TYP.isDEL(yieldR.data_crud_typ())) {
					// 削除行以外に対する補完、チェック処理
					if (MAC_LOT_MNG_TYP.isNOT_MNG(hdrR.lot_mng_typ())) {
						yieldR.lot_no(MAC_STR.NULL_VAL.value());
					}
					else {
						yieldR.lot_no(nullValToNull(yieldR.lot_no()));
					}
					if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(hdrR.sublot_mng_typ())) {
						yieldR.sublot_no(MAC_STR.NULL_VAL.value());
					}
					else {
						yieldR.sublot_no(nullValToNull(yieldR.sublot_no()));
					}
	
					yieldR.base_unit_cd(hdrR.base_unit_cd());
					yieldR.base_unit_yield_act_qty(convToBaseUnit(yieldR.trd_unit_yield_act_qty(),
							yieldR.conv_base_qty(), yieldR.conv_qty(),
							hdrR.base_unit_dec_place(), hdrR.base_unit_conv_rnd_typ()));
					
					MCMessageList msgL = new MCMessageList();
					
					// 有効桁数チェック
					msgL.addAll(checkDecPlace(yieldR,
							MfgActReg_Chk01_DtlYieldR.$trd_unit_dec_place,
							MfgActReg_Chk01_DtlYieldR.$trd_unit_yield_act_qty));
					
					// 着手計上日の前後チェック
					if (!isNull(hdrR.st_ac_dt()) && !isNull(yieldR.ac_dt())) {
						if (hdrR.st_ac_dt().gt(yieldR.ac_dt())) {
							MfgActReg_Chk01_DtlYieldR yieldTmpR = createMfgActReg_Chk01_DtlYieldR();
							yieldTmpR.setValue(MfgActReg_Chk01_DtlYieldR.$ac_dt, yieldTmpR.ac_dt());
							msgL.add(msgNotBefore(yieldR, MfgActReg_Chk01_DtlYieldR.$ac_dt,
									hdrR, MfgActReg_Chk01_HdrR.$st_ac_dt, yieldTmpR,
									MfgActReg_Chk01_DtlYieldR.$ac_dt, true));
						}
					}
					// 出来高理由の必須チェック（出来高区分が不良品の場合）
					if (MAC_YIELD_TYP.isDFCT(yieldR.yield_typ())) {
						msgL.addAll(check(yieldR, MfgActReg_Chk01_DtlYieldR.$yield_rsn_cd,
								new FXUCL_RequiredValidater()));
					}
					
					setErrFlg(yieldR, msgL);
					MCMessagePool.addAll(msgL);
				}
				
				if (MAC_DATA_CRUD_TYP.isUPD(yieldR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(yieldR.data_crud_typ())) {
					MCMessageList msgL = new MCMessageList();
					msgL.addAll(check(yieldR, MfgActReg_Chk01_DtlYieldR.$can_ac_dt, new FXUCL_RequiredValidater()));
					setErrFlg(yieldR, msgL);
					MCMessagePool.addAll(msgL);
				}
				// 行ステータスがDELETEの場合、CHK_DTによるbfTodayチェックが行われないため、ここでチェックを行う。
				if (yieldR.isStatusDelete()) {
					MCMessageList msgL = new MCMessageList();
					msgL.addAll(check(yieldR, MfgActReg_Chk01_DtlYieldR.$can_ac_dt, new FXUCL_BeforeTodayValidater()));
					setErrFlg(yieldR, msgL);
					MCMessagePool.addAll(msgL);
				}
				if (MAC_DATA_CRUD_TYP.isUPD(yieldR.data_crud_typ())) {
					if (!isSame(yieldR.not_stk_flg(), yieldR.old_not_stk_flg())) {
						MCMessagePool.add(new MCMessage(yieldR, null, MSBCL1084,
								yieldR.yield_act_no(), toDispGUIIndex(yieldR)));
						yieldR.err_flg(true);
					}
				}
			}
			
			// 締チェック呼び出し
			if (!clChkL.isEmpty()) {
				MSBIL_ClService.Cl_Chk03 clChkOpe = MSBIL_ClService.crtCl_Chk03();
				clChkOpe.up0().addAll(clChkL);
				clChkOpe.exec();
				copyErrFlg(up5(), clChkOpe.down0());
			}
			
			if (!inspL.isEmpty()) {
				MSBFL_InspSchdService.InspSchd_Chk01 inspOpe = MSBFL_InspSchdService.crtInspSchd_Chk01();
				addAll(inspOpe.up0(), inspL, createMap_InspSchd_Chk01_CndR_MfgActReg_Chk01_DtlYieldR());
				inspOpe.exec();
				copyErrFlg(inspL, inspOpe.down0());
			}
		}
		
		protected Map_InspSchd_Chk01_CndR_MfgActReg_Chk01_DtlYieldR<InspSchd_Chk01_CndR,MfgActReg_Chk01_DtlYieldR> createMap_InspSchd_Chk01_CndR_MfgActReg_Chk01_DtlYieldR() {
			return new Map_InspSchd_Chk01_CndR_MfgActReg_Chk01_DtlYieldR<InspSchd_Chk01_CndR, MfgActReg_Chk01_DtlYieldR>();
		}

		public class Map_InspSchd_Chk01_CndR_MfgActReg_Chk01_DtlYieldR<D extends InspSchd_Chk01_CndR, S extends MfgActReg_Chk01_DtlYieldR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Chk01_CndR.$peg_no, MfgActReg_Chk01_DtlYieldR.$peg_no);
				addColumnPathMap(InspSchd_Chk01_CndR.$data_crud_typ, MfgActReg_Chk01_DtlYieldR.$data_crud_typ);
				addColumnPathMap(InspSchd_Chk01_CndR.$src_no3, MfgActReg_Chk01_DtlYieldR.$yield_schd_no);
				addColumnPathMap(InspSchd_Chk01_CndR.$src_no4, MfgActReg_Chk01_DtlYieldR.$yield_act_no);
				addColumnPathMap(InspSchd_Chk01_CndR.$loc_cd, MfgActReg_Chk01_DtlYieldR.$strg_loc_cd);
				addColumnPathMap(InspSchd_Chk01_CndR.$str_ln_cd, MfgActReg_Chk01_DtlYieldR.$strg_str_ln_cd);
				addColumnPathMap(InspSchd_Chk01_CndR.$gd_cd, MfgActReg_Chk01_DtlYieldR.$gd_cd);
				addColumnPathMap(InspSchd_Chk01_CndR.$lot_no, MfgActReg_Chk01_DtlYieldR.$lot_no);
				addColumnPathMap(InspSchd_Chk01_CndR.$sublot_no, MfgActReg_Chk01_DtlYieldR.$sublot_no);
				addColumnPathMap(InspSchd_Chk01_CndR.$gr_tm, MfgActReg_Chk01_DtlYieldR.$act_tm);
				addColumnPathMap(InspSchd_Chk01_CndR.$base_unit_qty, MfgActReg_Chk01_DtlYieldR.$base_unit_yield_act_qty);
				addColumnPathMap(InspSchd_Chk01_CndR.$base_unit_cd, MfgActReg_Chk01_DtlYieldR.$base_unit_cd);

			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.insp_typ(MSC_INSP_TYP.PRDCT.value());
				
				MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(src.hdr_peg_no());
				dest.src_no1(hdrR.mfg_inst_no());
				dest.src_no2(hdrR.itm_mfg_inst_no());
				
				if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					return;
				}
				
				dest.itm_cd(hdrR.itm_cd());
				dest.itm_sub1(hdrR.itm_sub1());
				dest.itm_sub2(hdrR.itm_sub2());
				dest.itm_sub3(hdrR.itm_sub3());
				dest.sno1(hdrR.sno1());
				dest.sno2(hdrR.sno2());
				dest.sno3(hdrR.sno3());
				dest.sno4(hdrR.sno4());
				dest.mfg_loc_cd(hdrR.mfg_loc_cd());
				dest.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				if (MAC_YIELD_TYP.isGOOD(src.yield_typ())) {
					dest.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				}
				else {
					dest.quality_typ(MAC_QUALITY_TYP.DFCT_OPER.value());
				}
				dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				dest.stk_bp_cd(MAC_STR.NULL_VAL.value());
				if (src.pack_flg()) {
					dest.pack_unit_qty(src.trd_unit_yield_act_qty());
					dest.pack_unit_cd(src.trd_unit_cd());
				}
				else {
					dest.pack_unit_qty(src.base_unit_yield_act_qty());
					dest.pack_unit_cd(src.base_unit_cd());
				}
			}
		}

		protected void chkAndCompByProdAfterListLogic() {
			MCList<Cl_Chk03_CndR> clChkL = MCList.create(Cl_Chk03_CndR.class);
			
			for (MfgActReg_Chk01_DtlByProdR byProdR : up6()) {
				MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(byProdR.hdr_peg_no());
				if (hdrR.err_flg()) {
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isDEL(byProdR.data_crud_typ())) {
					// 締チェックサービスに渡さないようにするために計上日をクリアする
					byProdR.ac_dt(null);
				}
				
				// 格納場所に対する締チェック用コンテナ作成
				Cl_Chk03_CndR strgLocClChkR = Cl_Chk03_CndR.create();
				copy(strgLocClChkR, byProdR, createMap_Cl_Chk03_CndR_MfgActReg_Chk01_DtlByProdR());
				if (MAC_DATA_CRUD_TYP.isCRT(byProdR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isUPD(byProdR.data_crud_typ())) {
					strgLocClChkR.loc_cd(byProdR.strg_loc_cd());
				}
				if (MAC_DATA_CRUD_TYP.isUPD(byProdR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(byProdR.data_crud_typ())) {
					strgLocClChkR.old_loc_cd(byProdR.old_strg_loc_cd());
				}
				clChkL.add(strgLocClChkR);
				
				// 製造場所に対する締チェック用コンテナ作成
				if (!isSame(byProdR.strg_loc_cd(), hdrR.mfg_loc_cd())) {
					Cl_Chk03_CndR mfgLocClChkR = Cl_Chk03_CndR.create();
					copy(mfgLocClChkR, byProdR, createMap_Cl_Chk03_CndR_MfgActReg_Chk01_DtlByProdR());
					if (MAC_DATA_CRUD_TYP.isCRT(byProdR.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(byProdR.data_crud_typ())) {
						mfgLocClChkR.loc_cd(hdrR.mfg_loc_cd());
					}
					if (MAC_DATA_CRUD_TYP.isUPD(byProdR.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isDEL(byProdR.data_crud_typ())) {
						mfgLocClChkR.old_loc_cd(hdrR.mfg_loc_cd());
					}
					clChkL.add(mfgLocClChkR);
				}
				
				if (!MAC_DATA_CRUD_TYP.isDEL(byProdR.data_crud_typ())) {
					if (MAC_LOT_MNG_TYP.isNOT_MNG(byProdR.lot_mng_typ())) {
						byProdR.lot_no(MAC_STR.NULL_VAL.value());
					}
					else {
						byProdR.lot_no(nullValToNull(byProdR.lot_no()));
					}
					if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(byProdR.sublot_mng_typ())) {
						byProdR.sublot_no(MAC_STR.NULL_VAL.value());
					}
					else {
						byProdR.sublot_no(nullValToNull(byProdR.sublot_no()));
					}
	
					byProdR.base_unit_yield_act_qty(convToBaseUnit(byProdR.trd_unit_yield_act_qty(),
							byProdR.conv_base_qty(), byProdR.conv_qty(),
							byProdR.base_unit_dec_place(), byProdR.base_unit_conv_rnd_typ()));
					
					MCMessageList msgL = new MCMessageList();
					
					// 手配ＮＯ１～４
					// ※checkerで補完した場合も含め、NULL文字を一旦クリアしてから必須チェックする
					if (MAC_SNO_MNG_TYP.isMNG_REQ(byProdR.sno1_mng_typ())) {
						byProdR.sno1(nullValToNull(byProdR.sno1()));
						msgL.addAll(check(byProdR, MfgActReg_Chk01_DtlByProdR.$sno1, new FXUCL_RequiredValidater()));
					}
					if (MAC_SNO_MNG_TYP.isMNG_REQ(byProdR.sno2_mng_typ())) {
						byProdR.sno2(nullValToNull(byProdR.sno2()));
						msgL.addAll(check(byProdR, MfgActReg_Chk01_DtlByProdR.$sno2, new FXUCL_RequiredValidater()));
					}
					if (MAC_SNO_MNG_TYP.isMNG_REQ(byProdR.sno3_mng_typ())) {
						byProdR.sno3(nullValToNull(byProdR.sno3()));
						msgL.addAll(check(byProdR, MfgActReg_Chk01_DtlByProdR.$sno3, new FXUCL_RequiredValidater()));
					}
					if (MAC_SNO_MNG_TYP.isMNG_REQ(byProdR.sno4_mng_typ())) {
						byProdR.sno4(nullValToNull(byProdR.sno4()));
						msgL.addAll(check(byProdR, MfgActReg_Chk01_DtlByProdR.$sno4, new FXUCL_RequiredValidater()));
					}
					
					// 有効桁数チェック
					msgL.addAll(checkDecPlace(byProdR,
							MfgActReg_Chk01_DtlByProdR.$trd_unit_dec_place,
							MfgActReg_Chk01_DtlByProdR.$trd_unit_yield_act_qty));
					
					
					// 着手計上日の前後チェック
					if (!isNull(hdrR.st_ac_dt()) && !isNull(byProdR.ac_dt())) {
						if (hdrR.st_ac_dt().gt(byProdR.ac_dt())) {
							MfgActReg_Chk01_DtlByProdR byProdTmpR = createMfgActReg_Chk01_DtlByProdR();
							byProdTmpR.setValue(MfgActReg_Chk01_DtlByProdR.$ac_dt, byProdTmpR.ac_dt());
							msgL.add(msgNotBefore(byProdR,
									MfgActReg_Chk01_DtlByProdR.$ac_dt, hdrR,
									MfgActReg_Chk01_HdrR.$st_ac_dt, byProdTmpR,
									MfgActReg_Chk01_DtlByProdR.$ac_dt, true));
						}
					}
					
					setErrFlg(byProdR, msgL);
					MCMessagePool.addAll(msgL);
				}
				if (MAC_DATA_CRUD_TYP.isUPD(byProdR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(byProdR.data_crud_typ())) {
					MCMessageList msgL = new MCMessageList();
					msgL.addAll(check(byProdR, MfgActReg_Chk01_DtlByProdR.$can_ac_dt, new FXUCL_RequiredValidater()));
					setErrFlg(byProdR, msgL);
					MCMessagePool.addAll(msgL);
				}
				// 行ステータスがDELETEの場合、CHK_DTによるbfTodayチェックが行われないため、ここでチェックを行う。
				if (byProdR.isStatusDelete()) {
					MCMessageList msgL = new MCMessageList();
					msgL.addAll(check(byProdR, MfgActReg_Chk01_DtlByProdR.$can_ac_dt, new FXUCL_BeforeTodayValidater()));
					setErrFlg(byProdR, msgL);
					MCMessagePool.addAll(msgL);
				}
			}
			
			// 締チェック呼び出し
			if (!clChkL.isEmpty()) {
				MSBIL_ClService.Cl_Chk03 clChkOpe = MSBIL_ClService.crtCl_Chk03();
				clChkOpe.up0().addAll(clChkL);
				clChkOpe.exec();
				copyErrFlg(up6(), clChkOpe.down0());
			}
		}

		protected void setAndChkLotNo() {
			// 製造品のロット発番
			MCList<MfgActReg_Chk01_DtlYieldR> yieldLotL = MCList.create(MfgActReg_Chk01_DtlYieldR.class);
			MCList<MfgActReg_Chk01_DtlYieldR> yieldSublotL = MCList.create(MfgActReg_Chk01_DtlYieldR.class);
			for (MfgActReg_Chk01_DtlYieldR yieldR : up5().subList(MfgActReg_Chk01_DtlYieldR.$err_flg, false)) {
				MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(yieldR.hdr_peg_no());
				if (hdrR.err_flg()) {
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isDEL(yieldR.data_crud_typ())) {
					continue;
				}
				if (MSC_MFG_MTD_TYP.isEXTNL(hdrR.mfg_mtd_typ())) {
					continue;
				}

				if (isLotAutoIssue(yieldR.lot_no(), hdrR.lot_no_typ())) {
					yieldLotL.add(yieldR);
				}
				if (isLotAutoIssue(yieldR.sublot_no(), hdrR.sublot_no_typ())) {
					yieldSublotL.add(yieldR);
				}
			}
			if (!yieldLotL.isEmpty()) {
				setYieldLotNo(yieldLotL);
			}
			if (!yieldSublotL.isEmpty()) {
				setYieldSublotNo(yieldSublotL);
			}
			chkYieldLotSublotNo();
			
			// 副産品のロット発番
			MCList<MfgActReg_Chk01_DtlByProdR> byProdLotL = MCList.create(MfgActReg_Chk01_DtlByProdR.class);
			MCList<MfgActReg_Chk01_DtlByProdR> byProdSublotL = MCList.create(MfgActReg_Chk01_DtlByProdR.class);
			for (MfgActReg_Chk01_DtlByProdR byProdR : up6().subList(MfgActReg_Chk01_DtlByProdR.$err_flg, false)) {
				MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(byProdR.hdr_peg_no());
				if (hdrR.err_flg()) {
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isDEL(byProdR.data_crud_typ())) {
					continue;
				}
				if (MSC_MFG_MTD_TYP.isEXTNL(hdrR.mfg_mtd_typ())) {
					continue;
				}

				if (isLotAutoIssue(byProdR.lot_no(), byProdR.lot_no_typ())) {
					byProdLotL.add(byProdR);
				}
				if (isLotAutoIssue(byProdR.sublot_no(), byProdR.sublot_no_typ())) {
					byProdSublotL.add(byProdR);
				}
			}
			if (!byProdLotL.isEmpty()) {
				setByProdLotNo(byProdLotL);
			}
			if (!byProdSublotL.isEmpty()) {
				setByProdSublotNo(byProdSublotL);
			}
			chkByProdLotSublotNo();
		}
		
		protected boolean isLotAutoIssue(String no, String lotNoTyp) {
			if (!isNull(no)) {
				return false;
			}
			if (MAC_LOT_NO_TYP.isMANUAL(lotNoTyp)) {
				return false;
			}
			return true;
		}
		
		/**
		 * 製造品のロットＮＯ設定
		 * @param yieldLotL
		 */
		protected void setYieldLotNo(MCList<MfgActReg_Chk01_DtlYieldR> yieldLotL) {
			// 子品目のコンテナを設定
			MCList<MfgActReg_Chk01_DtlInptR> inptL = MCList.create(MfgActReg_Chk01_DtlInptR.class);
			for (MfgActReg_Chk01_DtlYieldR yieldLotR : yieldLotL) {
				inptL.addAll(_inptCacheForHdr.getCache(yieldLotR.hdr_peg_no()));
				inptL.addAll(_inptActCacheForHdr.getCache(yieldLotR.hdr_peg_no()));
			}
			MSBCL_MfgInstActComService.MfgInstActCom_Sprt01 o = MSBCL_MfgInstActComService.crtMfgInstActCom_Sprt01();
			addAll(o.up0(), yieldLotL, createMap_MfgInstActCom_Sprt01_HdrR_MfgActReg_Chk01_DtlYieldR());
			addAll(o.up1(), inptL, createMap_MfgInstActCom_Sprt01_DtlR_MfgActReg_Chk01_DtlInptR());
			for (MfgInstActCom_Sprt01_HdrR oUpR : o.up0()) {
				oUpR.lot_issue_flg(true);
			}
			o.exec();
			
			MCIndexKey idxkey = o.down0().createIndex(MfgInstActCom_Sprt01_HdrR.$peg_no);
			for (MfgActReg_Chk01_DtlYieldR yieldLotR : yieldLotL) {
				MfgInstActCom_Sprt01_HdrR downR = o.down0().getFirst(idxkey, yieldLotR.peg_no());
				if (downR.err_flg()) {
					MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(yieldLotR.hdr_peg_no());
					MCMessagePool.add(new MCMessage(yieldLotR, null, MSBCL1131,
							toDispItm(yieldLotR.itm_cd(), yieldLotR.itm_sub1(),
									yieldLotR.itm_sub2(), yieldLotR.itm_sub3()),
							toDispGUIIndex(yieldLotR)));
					hdrR.err_flg(true);
				}
				else {
					yieldLotR.lot_no(downR.lot_no());
				}
			}
		}
		
		/**
		 * 製造品のサブロットＮＯ設定
		 * @param yieldSublotL
		 */
		protected void setYieldSublotNo(MCList<MfgActReg_Chk01_DtlYieldR> yieldSublotL) {
			// 子品目のコンテナを設定
			MCList<MfgActReg_Chk01_DtlInptR> inptL = MCList.create(MfgActReg_Chk01_DtlInptR.class);
			for (MfgActReg_Chk01_DtlYieldR yieldSublotR : yieldSublotL) {
				inptL.addAll(_inptCacheForHdr.getCache(yieldSublotR.hdr_peg_no()));
				inptL.addAll(_inptActCacheForHdr.getCache(yieldSublotR.hdr_peg_no()));
			}
			MSBCL_MfgInstActComService.MfgInstActCom_Sprt01 o = MSBCL_MfgInstActComService.crtMfgInstActCom_Sprt01();
			addAll(o.up0(), yieldSublotL, createMap_MfgInstActCom_Sprt01_HdrR_MfgActReg_Chk01_DtlYieldR());
			addAll(o.up1(), inptL, createMap_MfgInstActCom_Sprt01_DtlR_MfgActReg_Chk01_DtlInptR());
			for (MfgInstActCom_Sprt01_HdrR oUpR : o.up0()) {
				oUpR.sublot_issue_flg(true);
			}
			o.exec();
			
			MCIndexKey idxkey = o.down0().createIndex(MfgInstActCom_Sprt01_HdrR.$peg_no);
			for (MfgActReg_Chk01_DtlYieldR yieldSublotR : yieldSublotL) {
				MfgInstActCom_Sprt01_HdrR downR = o.down0().getFirst(idxkey, yieldSublotR.peg_no());
				if (downR.err_flg()) {
					MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(yieldSublotR.hdr_peg_no());
					MCMessagePool.add(new MCMessage(yieldSublotR, null, MSBCL1132,
							toDispItm(yieldSublotR.itm_cd(), yieldSublotR.itm_sub1(),
									yieldSublotR.itm_sub2(), yieldSublotR.itm_sub3()),
							toDispGUIIndex(yieldSublotR)));
					hdrR.err_flg(true);
				}
				else {
					yieldSublotR.sublot_no(downR.sublot_no());
				}
			}
		}
		
		protected Map_MfgInstActCom_Sprt01_HdrR_MfgActReg_Chk01_DtlYieldR<MfgInstActCom_Sprt01_HdrR,MfgActReg_Chk01_DtlYieldR> createMap_MfgInstActCom_Sprt01_HdrR_MfgActReg_Chk01_DtlYieldR() {
			return new Map_MfgInstActCom_Sprt01_HdrR_MfgActReg_Chk01_DtlYieldR<MfgInstActCom_Sprt01_HdrR, MfgActReg_Chk01_DtlYieldR>();
		}

		public class Map_MfgInstActCom_Sprt01_HdrR_MfgActReg_Chk01_DtlYieldR<D extends MfgInstActCom_Sprt01_HdrR, S extends MfgActReg_Chk01_DtlYieldR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$peg_no, MfgActReg_Chk01_DtlYieldR.$peg_no);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$hdr_peg_no, MfgActReg_Chk01_DtlYieldR.$hdr_peg_no);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$itm_cd, MfgActReg_Chk01_DtlYieldR.$itm_cd);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$itm_sub1, MfgActReg_Chk01_DtlYieldR.$itm_sub1);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$itm_sub2, MfgActReg_Chk01_DtlYieldR.$itm_sub2);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$itm_sub3, MfgActReg_Chk01_DtlYieldR.$itm_sub3);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$yield_dt, MfgActReg_Chk01_DtlYieldR.$act_tm);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$lot_no, MfgActReg_Chk01_DtlYieldR.$lot_no);
				
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(src.hdr_peg_no());
				dest.sno1(hdrR.sno1());
				dest.sno2(hdrR.sno2());
				dest.sno3(hdrR.sno3());
				dest.sno4(hdrR.sno4());
				dest.lot_mng_typ(hdrR.lot_mng_typ());
				dest.sublot_mng_typ(hdrR.sublot_mng_typ());
				dest.lot_no_ptn_cd(hdrR.lot_no_ptn_cd());
				dest.sublot_no_ptn_cd(hdrR.sublot_no_ptn_cd());
				dest.sppl_cd(hdrR.sppl_cd());
				dest.mfg_loc_cd(hdrR.mfg_loc_cd());
				dest.mfg_loc_wg_cd(hdrR.wg_cd());
				dest.mfg_loc_site_cd(hdrR.site_cd());
				dest.yield_dt_label_nm(getLabel(src, MfgActReg_Chk01_DtlByProdR.$act_tm));
				
				if (hdrR.lst_reg_flg()) {
					dest.no_exception_flg(true);
					dest.no_err_msg_flg(true);
				}
			}
		}
		
		protected Map_MfgInstActCom_Sprt01_DtlR_MfgActReg_Chk01_DtlInptR<MfgInstActCom_Sprt01_DtlR,MfgActReg_Chk01_DtlInptR> createMap_MfgInstActCom_Sprt01_DtlR_MfgActReg_Chk01_DtlInptR() {
			return new Map_MfgInstActCom_Sprt01_DtlR_MfgActReg_Chk01_DtlInptR<MfgInstActCom_Sprt01_DtlR, MfgActReg_Chk01_DtlInptR>();
		}

		public class Map_MfgInstActCom_Sprt01_DtlR_MfgActReg_Chk01_DtlInptR<D extends MfgInstActCom_Sprt01_DtlR, S extends MfgActReg_Chk01_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Sprt01_DtlR.$hdr_peg_no, MfgActReg_Chk01_DtlInptR.$hdr_peg_no);
				addColumnPathMap(MfgInstActCom_Sprt01_DtlR.$lot_no, MfgActReg_Chk01_DtlInptR.$lot_no);
				addColumnPathMap(MfgInstActCom_Sprt01_DtlR.$sublot_no, MfgActReg_Chk01_DtlInptR.$sublot_no);
				addColumnPathMap(MfgInstActCom_Sprt01_DtlR.$main_itm_flg, MfgActReg_Chk01_DtlInptR.$main_itm_flg);
				addColumnPathMap(MfgInstActCom_Sprt01_DtlR.$vld_dt, MfgActReg_Chk01_DtlInptR.$vld_dt);
				addColumnPathMap(MfgInstActCom_Sprt01_DtlR.$first_gr_dt, MfgActReg_Chk01_DtlInptR.$first_gr_dt);
				addColumnPathMap(MfgInstActCom_Sprt01_DtlR.$lot_seq, MfgActReg_Chk01_DtlInptR.$lot_seq);

			}
		}
		
		/**
		 * 製造品のロットＮＯチェック
		 */
		protected void chkYieldLotSublotNo() {
			MCList<MfgActReg_Chk01_DtlYieldR> dupChk = MCList.create(MfgActReg_Chk01_DtlYieldR.class);
			MCList<MfgActReg_Chk01_DtlYieldR> sameLotL = MCList.create(MfgActReg_Chk01_DtlYieldR.class);
			for (MfgActReg_Chk01_DtlYieldR yieldR : up5()) {
				MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(yieldR.hdr_peg_no());
				if (hdrR.err_flg()) {
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isDEL(yieldR.data_crud_typ())) {
					continue;
				}

				if (isDupChk(yieldR.lot_no(), yieldR.sublot_no(), yieldR.old_lot_no(),
						yieldR.old_sublot_no(), yieldR.schd_lot_no(),
						yieldR.schd_sublot_no(), yieldR.same_lot_flg())) {
					dupChk.add(yieldR);
				}
				if (MSC_MFG_MTD_TYP.isINTNL(hdrR.mfg_mtd_typ()) && !yieldR.not_stk_flg() && isNull(yieldR.lot_no())) {
					MCMessagePool.addAll(check(yieldR, MfgActReg_Chk01_DtlYieldR.$lot_no, new FXUCL_RequiredValidater()));
					hdrR.err_flg(true);
				}
				if (MSC_MFG_MTD_TYP.isINTNL(hdrR.mfg_mtd_typ()) && !yieldR.not_stk_flg() &&  isNull(yieldR.sublot_no())) {
					MCMessagePool.addAll(check(yieldR, MfgActReg_Chk01_DtlYieldR.$sublot_no, new FXUCL_RequiredValidater()));
					hdrR.err_flg(true);
				}
				if (isDupChkForSameLot(yieldR.lot_no(), yieldR.sublot_no(), yieldR.old_lot_no(),
						yieldR.old_sublot_no(), yieldR.schd_lot_no(),
						yieldR.schd_sublot_no(), yieldR.same_lot_flg())) {
					yieldR.addStringColumn(MfgActReg_Chk01_HdrR.$mfg_act_no, hdrR.mfg_act_no());
					sameLotL.add(yieldR);
				}
			}
			
			if (!sameLotL.isEmpty()) {
				chkSameLot(sameLotL, dupChk);
			}
			
			if (!dupChk.isEmpty()) {
				MSBFL_LotService.Lot_Chk02 o = MSBFL_LotService.crtLot_Chk02();
				addAll(o.up0(), dupChk, createMap_Lot_Chk02_CndR_MfgActReg_Chk01_DtlYieldR());
				o.exec();
				copyErrFlg(dupChk, o.down0());
				copyErrFlg(up0(), dupChk, MfgActReg_Upd01_HdrR.$peg_no, MfgActReg_Upd01_DtlYieldR.$hdr_peg_no);
			}
		}
		
		protected boolean isDupChkForSameLot(String lotNo, String sublotNo,
				String oldLotNo, String oldSublotNo, String schdLotNo,
				String schdSubLotNo, boolean sameLotFlg) {
			if (isSame(schdLotNo, lotNo) && isSame(schdSubLotNo, sublotNo)) {
				return false;
			}
			if (!sameLotFlg) {
				return false;
			}
			if (isNullOr(lotNo, sublotNo)) {
				return false;
			}
			if (isSame(lotNo, oldLotNo) && isSame(sublotNo, oldSublotNo)) {
				return false;
			}
			return true;
		}
		
		/**
		 * 同一ロットＦＬＧがオンの場合、ロット重複チェック対象にするか判定する
		 * @param <T>
		 * @param sameLotL 同一ロットＦＬＧオンのレコード
		 * @param dupChk ロット重複チェック対象
		 */
		protected <T extends MCRow> void chkSameLot(MCList<T> sameLotL,
				MCList<T> dupChk) {
			MCList<T> addDupChk = dupChk.createInstance();
			MCList<T> subAddDupChk = dupChk.createInstance();
			MCIndexKey idxkey = dupChk.createIndex(MfgActReg_Chk01_DtlYieldR.$hdr_peg_no, MfgActReg_Chk01_DtlYieldR.$itm_sub1,
					MfgActReg_Chk01_DtlYieldR.$itm_sub2, MfgActReg_Chk01_DtlYieldR.$itm_sub3, MfgActReg_Chk01_DtlYieldR.$itm_cd,
					MfgActReg_Chk01_DtlYieldR.$lot_no);

			// 同一ヘッダ、品目、ロットＮＯでグルーピング
			for (MCList<T> grpL : sameLotL.groupList(new String[] {
					MST_YIELD_ACT_R.$mfg_act_no, "hdr_peg_no", MST_YIELD_ACT_R.$itm_cd,
					MST_YIELD_ACT_R.$itm_sub1, MST_YIELD_ACT_R.$itm_sub2,
					MST_YIELD_ACT_R.$itm_sub3, MST_YIELD_ACT_R.$lot_no,
					MST_YIELD_ACT_R.$sublot_no
			})) {

				T sameLotR = grpL.get(0);
				getLotMngTyp(sameLotR);

				// 同一ヘッダの実績内に同じロットが存在するかチェック
				MCList<MST_YIELD_ACT_R> yieldActL = MCList.create(MST_YIELD_ACT_R.class);
				MST_YIELD_ACT_R t = MST_YIELD_ACT_R.create("T");
				MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
				bldr.setSelect(t.itm_cd);
				bldr.setWhere(t.mfg_act_no.eq(bind("mfg_act_no")));
				bldr.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
				bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
				bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
				bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
				bldr.addWhereWithAnd(t.lot_no.eq(bind("lot_no")));
				if (!lotIsUniqAndSublotIsStk(sameLotR)) {
					bldr.addWhereWithAnd(t.sublot_no.eq(bind("sublot_no")));
				}
				dbSelect("MSBCL6050_MST_YIELD_ACT_S11", yieldActL, bldr, sameLotR);

				if (!yieldActL.isEmpty()) {
					// 存在する場合、ロット重複チェック対象外
					continue;
				}

				if (lotIsUniqAndSublotIsStk(sameLotR)) {
					if (isSame(sameLotR.getString(MfgActReg_Chk01_DtlYieldR.$lot_no),
							sameLotR.getString(MfgActReg_Chk01_DtlYieldR.$schd_lot_no))) {
						// 一致する場合、ロット重複チェック対象外
						continue;
					}
					T subDupChk = dupChk.getFirst(idxkey,
							sameLotR.getNumber(MfgActReg_Chk01_DtlYieldR.$hdr_peg_no),
							sameLotR.getString(MfgActReg_Chk01_DtlYieldR.$itm_sub1),
							sameLotR.getString(MfgActReg_Chk01_DtlYieldR.$itm_sub2),
							sameLotR.getString(MfgActReg_Chk01_DtlYieldR.$itm_sub3),
							sameLotR.getString(MfgActReg_Chk01_DtlYieldR.$itm_cd),
							sameLotR.getString(MfgActReg_Chk01_DtlYieldR.$lot_no));
					if (isNull(subDupChk)) {
						subAddDupChk.add(sameLotR);
					}
				}
				else {
					addDupChk.add(sameLotR);
				}
			}
			
			for (MCList<T> subAddDupChkGrpL : subAddDupChk.groupList(
					MfgActReg_Chk01_DtlYieldR.$hdr_peg_no,
					MfgActReg_Chk01_DtlYieldR.$itm_sub1,
					MfgActReg_Chk01_DtlYieldR.$itm_sub2,
					MfgActReg_Chk01_DtlYieldR.$itm_sub3,
					MfgActReg_Chk01_DtlYieldR.$itm_cd,
					MfgActReg_Chk01_DtlYieldR.$lot_no)) {
				addDupChk.add(subAddDupChkGrpL.get(0));
			}
			
			dupChk.addAll(addDupChk);
		}
		
		protected void getLotMngTyp (MCRow sameLotR) {
			MAM_ITM_R itm = _itmCache.get(sameLotR.getString(MfgActReg_Chk01_DtlYieldR.$itm_cd),
					sameLotR.getString(MfgActReg_Chk01_DtlYieldR.$itm_sub1),
					sameLotR.getString(MfgActReg_Chk01_DtlYieldR.$itm_sub2),
					sameLotR.getString(MfgActReg_Chk01_DtlYieldR.$itm_sub3));
			
			sameLotR.setStringNE("lot_mng_typ", itm.lot_mng_typ());
			sameLotR.setStringNE("sublot_mng_typ", itm.sublot_mng_typ());
		}
		
		protected boolean lotIsUniqAndSublotIsStk (MCRow sameLotR) {
			if (MAC_LOT_MNG_TYP.isUNIQ(sameLotR.getString("lot_mng_typ"))
					&& MAC_SUBLOT_MNG_TYP.isSTK(sameLotR.getString("sublot_mng_typ"))) {
				return true;
			}
			else {
				return false;
			}
		}
		
		protected boolean isDupChk(String lotNo, String sublotNo, String oldLotNo,
				String oldSublotNo, String schdLotNo, String schdSubLotNo, boolean sameLotFlg) {
			if (isSame(schdLotNo, lotNo) && isSame(schdSubLotNo, sublotNo)) {
				return false;
			}
			if (sameLotFlg) {
				return false;
			}
			if (isNullOr(lotNo, sublotNo)) {
				return false;
			}
			if (isSame(lotNo, oldLotNo) && isSame(sublotNo, oldSublotNo)) {
				return false;
			}
			return true;
		}
		
		protected Map_Lot_Chk02_CndR_MfgActReg_Chk01_DtlYieldR<Lot_Chk02_CndR,MfgActReg_Chk01_DtlYieldR> createMap_Lot_Chk02_CndR_MfgActReg_Chk01_DtlYieldR() {
			return new Map_Lot_Chk02_CndR_MfgActReg_Chk01_DtlYieldR<Lot_Chk02_CndR, MfgActReg_Chk01_DtlYieldR>();
		}

		public class Map_Lot_Chk02_CndR_MfgActReg_Chk01_DtlYieldR<D extends Lot_Chk02_CndR, S extends MfgActReg_Chk01_DtlYieldR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Chk02_CndR.$peg_no, MfgActReg_Chk01_DtlYieldR.$peg_no);
				addColumnPathMap(Lot_Chk02_CndR.$itm_cd, MfgActReg_Chk01_DtlYieldR.$itm_cd);
				addColumnPathMap(Lot_Chk02_CndR.$itm_sub1, MfgActReg_Chk01_DtlYieldR.$itm_sub1);
				addColumnPathMap(Lot_Chk02_CndR.$itm_sub2, MfgActReg_Chk01_DtlYieldR.$itm_sub2);
				addColumnPathMap(Lot_Chk02_CndR.$itm_sub3, MfgActReg_Chk01_DtlYieldR.$itm_sub3);
				addColumnPathMap(Lot_Chk02_CndR.$lot_no, MfgActReg_Chk01_DtlYieldR.$lot_no);
				addColumnPathMap(Lot_Chk02_CndR.$sublot_no, MfgActReg_Chk01_DtlYieldR.$sublot_no);

			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.lot_not_change_flg(setLotNotChangeFlg(src.lot_no(), src.old_lot_no()));
			}

		}
		
		/**
		 * 副産品のロットＮＯ設定
		 * @param byProdLotL
		 */
		protected void setByProdLotNo(MCList<MfgActReg_Chk01_DtlByProdR> byProdLotL) {
			// 子品目のコンテナを設定
			MCList<MfgActReg_Chk01_DtlInptR> inptL = MCList.create(MfgActReg_Chk01_DtlInptR.class);
			for (MfgActReg_Chk01_DtlByProdR byProdLotR : byProdLotL) {
				inptL.addAll(_inptCacheForHdr.getCache(byProdLotR.hdr_peg_no()));
				inptL.addAll(_inptActCacheForHdr.getCache(byProdLotR.hdr_peg_no()));
			}
			MSBCL_MfgInstActComService.MfgInstActCom_Sprt01 o = MSBCL_MfgInstActComService.crtMfgInstActCom_Sprt01();
			addAll(o.up0(), byProdLotL, createMap_MfgInstActCom_Sprt01_HdrR_MfgActReg_Chk01_DtlByProdR());
			addAll(o.up1(), inptL, createMap_MfgInstActCom_Sprt01_DtlR_MfgActReg_Chk01_DtlInptR());
			for (MfgInstActCom_Sprt01_HdrR oUpR : o.up0()) {
				oUpR.lot_issue_flg(true);
			}
			o.exec();
			
			MCIndexKey idxkey = o.down0().createIndex(MfgInstActCom_Sprt01_HdrR.$peg_no);
			for (MfgActReg_Chk01_DtlByProdR byProdLotR : byProdLotL) {
				MfgInstActCom_Sprt01_HdrR downR = o.down0().getFirst(idxkey, byProdLotR.peg_no());
				if (downR.err_flg()) {
					MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(byProdLotR.hdr_peg_no());
					MCMessagePool.add(new MCMessage(byProdLotR, null, MSBCL1131,
							toDispItm(byProdLotR.itm_cd(), byProdLotR.itm_sub1(),
									byProdLotR.itm_sub2(), byProdLotR.itm_sub3()),
							toDispGUIIndex(byProdLotR)));
					hdrR.err_flg(true);
				}
				else {
					byProdLotR.lot_no(downR.lot_no());
				}
			}
		}
		
		/**
		 * 副産品のサブロットＮＯ設定
		 * @param byProdLotL
		 */
		protected void setByProdSublotNo(MCList<MfgActReg_Chk01_DtlByProdR> byProdSublotL) {
			// 子品目のコンテナを設定
			MCList<MfgActReg_Chk01_DtlInptR> inptL = MCList.create(MfgActReg_Chk01_DtlInptR.class);
			for (MfgActReg_Chk01_DtlByProdR byProdSublotR : byProdSublotL) {
				inptL.addAll(_inptCacheForHdr.getCache(byProdSublotR.hdr_peg_no()));
				inptL.addAll(_inptActCacheForHdr.getCache(byProdSublotR.hdr_peg_no()));
			}
			MSBCL_MfgInstActComService.MfgInstActCom_Sprt01 o = MSBCL_MfgInstActComService.crtMfgInstActCom_Sprt01();
			addAll(o.up0(), byProdSublotL, createMap_MfgInstActCom_Sprt01_HdrR_MfgActReg_Chk01_DtlByProdR());
			addAll(o.up1(), inptL, createMap_MfgInstActCom_Sprt01_DtlR_MfgActReg_Chk01_DtlInptR());
			for (MfgInstActCom_Sprt01_HdrR oUpR : o.up0()) {
				oUpR.sublot_issue_flg(true);
			}
			o.exec();
			
			MCIndexKey idxkey = o.down0().createIndex(MfgInstActCom_Sprt01_HdrR.$peg_no);
			for (MfgActReg_Chk01_DtlByProdR byProdSublotR : byProdSublotL) {
				MfgInstActCom_Sprt01_HdrR downR = o.down0().getFirst(idxkey, byProdSublotR.peg_no());
				if (downR.err_flg()) {
					MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(byProdSublotR.hdr_peg_no());
					MCMessagePool.add(new MCMessage(byProdSublotR, null, MSBCL1132,
							toDispItm(byProdSublotR.itm_cd(), byProdSublotR.itm_sub1(),
									byProdSublotR.itm_sub2(), byProdSublotR.itm_sub3()),
							toDispGUIIndex(byProdSublotR)));
					hdrR.err_flg(true);
				}
				else {
					byProdSublotR.sublot_no(downR.sublot_no());
				}
			}
		}
		
		protected Map_MfgInstActCom_Sprt01_HdrR_MfgActReg_Chk01_DtlByProdR<MfgInstActCom_Sprt01_HdrR,MfgActReg_Chk01_DtlByProdR> createMap_MfgInstActCom_Sprt01_HdrR_MfgActReg_Chk01_DtlByProdR() {
			return new Map_MfgInstActCom_Sprt01_HdrR_MfgActReg_Chk01_DtlByProdR<MfgInstActCom_Sprt01_HdrR, MfgActReg_Chk01_DtlByProdR>();
		}

		public class Map_MfgInstActCom_Sprt01_HdrR_MfgActReg_Chk01_DtlByProdR<D extends MfgInstActCom_Sprt01_HdrR, S extends MfgActReg_Chk01_DtlByProdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$peg_no, MfgActReg_Chk01_DtlByProdR.$peg_no);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$hdr_peg_no, MfgActReg_Chk01_DtlByProdR.$hdr_peg_no);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$itm_cd, MfgActReg_Chk01_DtlByProdR.$itm_cd);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$itm_sub1, MfgActReg_Chk01_DtlByProdR.$itm_sub1);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$itm_sub2, MfgActReg_Chk01_DtlByProdR.$itm_sub2);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$itm_sub3, MfgActReg_Chk01_DtlByProdR.$itm_sub3);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sno1, MfgActReg_Chk01_DtlByProdR.$sno1);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sno2, MfgActReg_Chk01_DtlByProdR.$sno2);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sno3, MfgActReg_Chk01_DtlByProdR.$sno3);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sno4, MfgActReg_Chk01_DtlByProdR.$sno4);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$lot_mng_typ, MfgActReg_Chk01_DtlByProdR.$lot_mng_typ);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sublot_mng_typ, MfgActReg_Chk01_DtlByProdR.$sublot_mng_typ);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$lot_no_ptn_cd, MfgActReg_Chk01_DtlByProdR.$lot_no_ptn_cd);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$sublot_no_ptn_cd, MfgActReg_Chk01_DtlByProdR.$sublot_no_ptn_cd);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$yield_dt, MfgActReg_Chk01_DtlByProdR.$act_tm);
				addColumnPathMap(MfgInstActCom_Sprt01_HdrR.$lot_no, MfgActReg_Chk01_DtlByProdR.$lot_no);
				
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(src.hdr_peg_no());
				dest.sppl_cd(hdrR.sppl_cd());
				dest.mfg_loc_cd(hdrR.mfg_loc_cd());
				dest.mfg_loc_wg_cd(hdrR.wg_cd());
				dest.mfg_loc_site_cd(hdrR.site_cd());
				dest.yield_dt_label_nm(getLabel(src, MfgActReg_Chk01_DtlByProdR.$act_tm));
				
				if (hdrR.lst_reg_flg()) {
					dest.no_exception_flg(true);
					dest.no_err_msg_flg(true);
				}
			}
		}

		/**
		 * 副産品のロットＮＯチェック
		 */
		protected void chkByProdLotSublotNo() {
			MCList<MfgActReg_Chk01_DtlByProdR> dupChk = MCList.create(MfgActReg_Chk01_DtlByProdR.class);
			MCList<MfgActReg_Chk01_DtlByProdR> sameLotL = MCList.create(MfgActReg_Chk01_DtlByProdR.class);
			for (MfgActReg_Chk01_DtlByProdR byProdR : up6()) {
				MfgActReg_Chk01_HdrR hdrR = _hdrCache.getCache(byProdR.hdr_peg_no());
				if (hdrR.err_flg()) {
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isDEL(byProdR.data_crud_typ())) {
					continue;
				}

				if (isNull(byProdR.lot_no())) {
					MCMessagePool.addAll(check(byProdR, MfgActReg_Chk01_DtlByProdR.$lot_no, new FXUCL_RequiredValidater()));
					hdrR.err_flg(true);
				}
				if (isNull(byProdR.sublot_no())) {
					MCMessagePool.addAll(check(byProdR, MfgActReg_Chk01_DtlByProdR.$sublot_no, new FXUCL_RequiredValidater()));
					hdrR.err_flg(true);
				}
				
				if (isDupChk(byProdR.lot_no(), byProdR.sublot_no(), byProdR.old_lot_no(),
						byProdR.old_sublot_no(), byProdR.schd_lot_no(),
						byProdR.schd_sublot_no(), byProdR.same_lot_flg())) {
					dupChk.add(byProdR);
				}
				if (isDupChkForSameLot(byProdR.lot_no(), byProdR.sublot_no(), byProdR.old_lot_no(),
						byProdR.old_sublot_no(), byProdR.schd_lot_no(),
						byProdR.schd_sublot_no(), byProdR.same_lot_flg())) {
					byProdR.addStringColumn(MfgActReg_Chk01_HdrR.$mfg_act_no, hdrR.mfg_act_no());
					sameLotL.add(byProdR);
				}
			}
			
			if (!sameLotL.isEmpty()) {
				chkSameLot(sameLotL, dupChk);
			}
			
			if (!dupChk.isEmpty()) {
				MSBFL_LotService.Lot_Chk02 o = MSBFL_LotService.crtLot_Chk02();
				addAll(o.up0(), dupChk, createMap_Lot_Chk02_CndR_MfgActReg_Chk01_DtlByProdR());
				o.exec();
				copyErrFlg(dupChk, o.down0());
				copyErrFlg(up0(), dupChk, MfgActReg_Upd01_HdrR.$peg_no, MfgActReg_Chk01_DtlByProdR.$hdr_peg_no);
			}
		}
		
		protected Map_Lot_Chk02_CndR_MfgActReg_Chk01_DtlByProdR<Lot_Chk02_CndR,MfgActReg_Chk01_DtlByProdR> createMap_Lot_Chk02_CndR_MfgActReg_Chk01_DtlByProdR() {
			return new Map_Lot_Chk02_CndR_MfgActReg_Chk01_DtlByProdR<Lot_Chk02_CndR, MfgActReg_Chk01_DtlByProdR>();
		}

		public class Map_Lot_Chk02_CndR_MfgActReg_Chk01_DtlByProdR<D extends Lot_Chk02_CndR, S extends MfgActReg_Chk01_DtlByProdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Chk02_CndR.$peg_no, MfgActReg_Chk01_DtlByProdR.$peg_no);
				addColumnPathMap(Lot_Chk02_CndR.$itm_cd, MfgActReg_Chk01_DtlByProdR.$itm_cd);
				addColumnPathMap(Lot_Chk02_CndR.$itm_sub1, MfgActReg_Chk01_DtlByProdR.$itm_sub1);
				addColumnPathMap(Lot_Chk02_CndR.$itm_sub2, MfgActReg_Chk01_DtlByProdR.$itm_sub2);
				addColumnPathMap(Lot_Chk02_CndR.$itm_sub3, MfgActReg_Chk01_DtlByProdR.$itm_sub3);
				addColumnPathMap(Lot_Chk02_CndR.$lot_no, MfgActReg_Chk01_DtlByProdR.$lot_no);
				addColumnPathMap(Lot_Chk02_CndR.$sublot_no, MfgActReg_Chk01_DtlByProdR.$sublot_no);

			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.lot_not_change_flg(setLotNotChangeFlg(src.lot_no(), src.old_lot_no()));
			}
		}

		protected void setDown() {
			for (MfgActReg_Chk01_HdrR r : up0()) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
			
			down0().addAll(up0());
			down1().addAll(up1());
			down2().addAll(up2());
			down3().addAll(up3());
			down4().addAll(up4());
			down5().addAll(up5());
			down6().addAll(up6());
		}
	}
	/**
	 * ロットが一致した場合にTRUEを返却する
	 */
	protected boolean setLotNotChangeFlg(String lot, String oldlot){
		if(isNull(lot) || isNull(oldlot)) {
			return false;
		}
		if(isSame(lot, oldlot)) {
			return true;
		}
		return false;
	}

	
	/**
	 * MfgActReg_Upd01オペレーション.<p>
	 *
	 * 製造実績の登録・訂正・取消の共通処理<br>
	 */
	public class MfgActReg_Upd01 extends MSBCL_MfgActRegService_MC_A.MfgActReg_Upd01 {
		/**
		 * 明細からヘッダデータにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MfgActReg_Upd01_HdrR> _hdrCache;

		/**
		 * 明細から工程データにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MfgActReg_Upd01_DtlOperR> _operCache;

		/**
		 * ロス実績から投入データにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MfgActReg_Upd01_DtlInptR> _inptCacheForLoss;

		/**
		 * ヘッダから出来高データにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MCList<MfgActReg_Upd01_DtlYieldR>> _yieldCacheForHdr;

		protected FXUCL_MCDbcCache<MAM_ITM_R> _itmCache = null;
		protected FXUCL_MCDbcCache<MAM_LOC_R> _mfgLocCache = null;
		protected MCList<MAM_ITM_DTL_R> _cacheItmDtl = MCList.create(MAM_ITM_DTL_R.class);
		protected MCList<MAVM_ITM_UNIT_R> _cacheItmUnit = MCList.create(MAVM_ITM_UNIT_R.class);
		protected MCList<MAM_UNIT_R> _cacheOperUnit = MCList.create(MAM_UNIT_R.class);
		protected MCList<MST_INPT_SCHD_R> _cacheInptSchd = null;
		protected MCList<MST_YIELD_SCHD_R> _cacheYieldSchd = null;
		protected MCIndexKey _idxItmDtlCache = null;
		protected MCIndexKey _idxItmUnitCache = null;
		protected MCIndexKey _idxOperUnitCache = null;
		protected MCIndexKey _idxInptSchdCache = null;
		protected MCIndexKey _idxYieldSchdCache = null;
		protected FXUCL_MCDbcCache<MAM_SUNDRY_ITM_R> _sundryItmCache = null;
		protected MCList<MfgActReg_Upd01_HdrR> _removeHdrL = MCList.create(MfgActReg_Upd01_HdrR.class);

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			
			// 計画外製造実績のための初期化処理
			unschdInit();
			
			// 電文項目のキャッシュ
			setCache();

			// 上り電文の編集
			editUp();

			// 各種実績テーブル、残テーブル、残数分の受払予定の更新
			callTblRegSrv();
			
			// 出来高実績削除時の検査予定の復活
			callInspSchdSrvForDelYield();
			
			// 投入版切替更新サービスの呼び出し
			callVerChgSrv();

			// 子品目期限・起算日引継ぎ
			callMainLotInf();
			
			// 仕掛更新処理
			callWipUpdService();
			
			// ロットの製造承認状況区分の更新
			callLotAprvStsUpdSrv();

			// 受払実績の更新
			callIoActServiceUpd01();
			
			// 計画外製造実績の場合は、製造指図も削除
			callMfgInstRegForUnschd();
			
			// ロット継承サービスの呼び出し
			callLotInhSrv();
			// 品目オーダ・工程オーダ状況更新サービスの呼び出し
			callOrdStsUpdSrv();
			
			// 帳票即時発行
			callPrntSrv();
			
			// 記録承認依頼のプッシュ通知
			callPushNtc();
			
			setDown();
		}
		
		/**
		 * 計画外製造実績の場合は、製造指図も削除
		 */
		protected void callMfgInstRegForUnschd() {
			
			// 上り電文のうち削除対象を抽出
			MCIndexKey delIndexKey = up0().createIndex(MfgActReg_Upd01_HdrR.$data_crud_typ, MfgActReg_Upd01_HdrR.$err_flg);
			MCList<MfgActReg_Upd01_HdrR> delL = up0().subList(delIndexKey, MAC_DATA_CRUD_TYP.DEL.value(), false);
			if (isNull(delL) || delL.isEmpty()) {
				return;
			}
			
			// 削除対象の製造指図情報、品目製造指図情報を取得
			MCList<MST_MFG_INST_R> mfgInstL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder mfgInstL_bldr = MCQueryApiBuilder.create(t);
			MST_ITM_MFG_INST_R t2 = MST_ITM_MFG_INST_R.create("T2");
			mfgInstL.addBooleanColumn("unschd_act_flg");
			mfgInstL_bldr.setSelect(t.mfg_inst_no);
			mfgInstL_bldr.addSelect(t2.unschd_act_flg.as("unschd_act_flg"));
			mfgInstL_bldr.addInnerJoin(t2, bracket(t2.itm_mfg_inst_no.eq(t.itm_mfg_inst_no)));
			mfgInstL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			dbSelect("MSBCL6050_MST_MFG_INST_S02", mfgInstL, mfgInstL_bldr, delL);
			MCIndexKey mfgInstIdxKey = mfgInstL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
			
			for (MfgActReg_Upd01_HdrR delR : delL) {
				MST_MFG_INST_R mfgInstR = mfgInstL.getFirst(mfgInstIdxKey, delR.mfg_inst_no());
				delR.unschd_act_flg(mfgInstR.getBooleanNE("unschd_act_flg"));
			}
			
			MCList<MfgActReg_Upd01_HdrR> tgtL = delL.subList(MfgActReg_Upd01_HdrR.$unschd_act_flg, true);
			if (isNull(tgtL) || tgtL.isEmpty()) {
				return;
			}
			
			MSBCL_MfgInstRegService.MfgInstReg_Del01 ope = MSBCL_MfgInstRegService.crtMfgInstReg_Del01();
			ope.up0().lst_del_flg(true);
			ope.up0().not_commit_flg(false);
			ope.up0().not_chk_cntr_flg(true);
			for (MfgActReg_Upd01_HdrR tgtR : tgtL) {
				MfgInstReg_Del01_HdrR hdrR = MfgInstReg_Del01_HdrR.create();
				hdrR.peg_no(tgtR.peg_no());
				hdrR.mfg_inst_no(tgtR.mfg_inst_no());
				ope.up1().add(hdrR);
			}
			
			if (!ope.up1().isEmpty()) {
				ope.exec();
			}
		}
		
		/**
		 * 計画外製造実績のための初期化処理
		 */
		protected void unschdInit() {
			
			// マスタキャッシュ
			doMasterCacheForUnschdAct();
			
			// 製造指図登録および上り電文補完
			makeSchdDataAndUpData();
		}
		
		/**
		 * マスタキャッシュ
		 */
		protected void doMasterCacheForUnschdAct() {
			crtItmDtlCache();
			crtItmUnitCache();
		}
		
		/**
		 * 品目単位マスタキャッシュ
		 */
		protected void crtItmUnitCache() {
			_cacheItmUnit = MCList.create(MAVM_ITM_UNIT_R.class);
			MAVM_ITM_UNIT_R t = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder cacheItmUnit_bldr = MCQueryApiBuilder.create(t);
			cacheItmUnit_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			cacheItmUnit_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			cacheItmUnit_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			cacheItmUnit_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			dbSelect("MSBCL6050_MAVM_ITM_UNIT_S01", _cacheItmUnit, cacheItmUnit_bldr, up0());
			
			_idxItmUnitCache = _cacheItmUnit.createIndex(MAVM_ITM_UNIT_R.$itm_cd,
					MAVM_ITM_UNIT_R.$itm_sub1, MAVM_ITM_UNIT_R.$itm_sub2,
					MAVM_ITM_UNIT_R.$itm_sub3);
		}
		
		/**
		 * 品目詳細マスタキャッシュ
		 */
		protected void crtItmDtlCache() {
			_cacheItmDtl = MCList.create(MAM_ITM_DTL_R.class);
			MAM_ITM_DTL_R t = MAM_ITM_DTL_R.create("T");
			MCQueryApiBuilder cacheItmDtl_bldr = MCQueryApiBuilder.create(t);
			cacheItmDtl_bldr.setSelect(
					t.itm_cd,
					t.itm_sub1,
					t.itm_sub2,
					t.itm_sub3,
					t.mfg_loc_cd,
					t.wg_cd,
					t.bom_ptn,
					t.itm_lower_yield,
					t.itm_std_yield,
					t.itm_upper_yield
					);
			
			cacheItmDtl_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			cacheItmDtl_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			cacheItmDtl_bldr.addWhereWithAnd(t.mfg_loc_cd.eq(bind("mfg_loc_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(t.sppl_cd.eq(value(MAC_STR.NULL_VAL.value())));
			cacheItmDtl_bldr.addWhereWithAnd(t.maker_cd.eq(value(MAC_STR.NULL_VAL.value())));
			cacheItmDtl_bldr.addWhereWithAnd(t.rqst_loc_cd.eq(value(MAC_STR.NULL_VAL.value())));
			cacheItmDtl_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
			cacheItmDtl_bldr.addWhereWithAnd(t.bom_ptn.eq(bind("bom_ptn")));
			cacheItmDtl_bldr.addWhereWithAnd(bind("master_dt").between(t.st_dt, t.end_dt));
			dbSelect("MSBCL6050_MAM_ITM_DTL_S01", _cacheItmDtl, cacheItmDtl_bldr, up0());
			
			_idxItmDtlCache = _cacheItmDtl.createIndex(
					MAM_ITM_DTL_R.$itm_cd,
					MAM_ITM_DTL_R.$itm_sub1,
					MAM_ITM_DTL_R.$itm_sub2,
					MAM_ITM_DTL_R.$itm_sub3,
					MAM_ITM_DTL_R.$mfg_loc_cd,
					MAM_ITM_DTL_R.$wg_cd,
					MAM_ITM_DTL_R.$bom_ptn
					);
		}
		
		/**
		 * 単位マスタキャッシュ（工程用）
		 * @param operL
		 */
		protected void crtOperUnitCache(MCList<ReExp_Sprt05_RsltOperR> operL) {
			_cacheOperUnit = MCList.create(MAM_UNIT_R.class);
			MAM_UNIT_R t = MAM_UNIT_R.create("T");
			MCQueryApiBuilder cacheOperUnit_bldr = MCQueryApiBuilder.create(t);
			cacheOperUnit_bldr.setSelect(
					t.unit_cd,
					t.rnd_typ,
					t.dec_place
					);
			
			cacheOperUnit_bldr.setWhere(t.unit_cd.eq(bind("oper_unit_cd")));
			dbSelect("MSBCL6050_MAM_UNIT_S01", _cacheOperUnit, cacheOperUnit_bldr, operL);
			
			_idxOperUnitCache = _cacheOperUnit.createIndex(MAM_UNIT_R.$unit_cd);
		}
		
		/**
		 * 製造指図登録および上り電文補完
		 * 上り電文と再展開サービスの結果より製造指図登録サービスを呼び出す
		 */
		protected void makeSchdDataAndUpData() {
			MSBCL_ReExpService.ReExp_Sprt05 reExpOpe = MSBCL_ReExpService.crtReExp_Sprt05();
			MSBCL_MfgInstRegService.MfgInstReg_Upd01 mfgInstOpe = MSBCL_MfgInstRegService.crtMfgInstReg_Upd01();
			
			MCList<MfgActReg_Upd01_HdrR> unschdHdrL = MCList.create(MfgActReg_Upd01_HdrR.class);
			// 再展開サービスの電文作成
			for (MfgActReg_Upd01_HdrR hdrR : up0()) {
				if (hdrR.unschd_act_flg() && !hdrR.mes_flg()) {
					ReExp_Sprt05_HdrR sprt05HdrR = ReExp_Sprt05_HdrR.create();
					copy(sprt05HdrR, hdrR, createMap_ReExp_Sprt05_HdrR_MfgActReg_Upd01_HdrR());
					reExpOpe.up0().add(sprt05HdrR);
					unschdHdrL.add(hdrR);
				}
			}
			if (!reExpOpe.up0().isEmpty()) {
				// 再展開サービス呼出
				reExpOpe.exec();
				
				// 製造指図登録サービスの電文作成
				setReExpDown(reExpOpe, mfgInstOpe);
			}
			
			if (!mfgInstOpe.up0().isEmpty()) {
				// 製造指図登録サービス呼出
				mfgInstOpe.exec();
				
				// 製造指図登録後の上り電文補完
				setMfgInstDown(mfgInstOpe);
			}
			
			MCList<MfgActReg_Upd01_DtlInptR> unschdInptL = MCList.create(MfgActReg_Upd01_DtlInptR.class);
			if (!unschdHdrL.isEmpty()) {
				MCIndexKey idx = up2().createIndex(MfgInstReg_Upd01_DtlOperR.$hdr_peg_no);
				for (MfgActReg_Upd01_HdrR hdrR : unschdHdrL) {
					MCList<MfgActReg_Upd01_DtlInptR> subInptL = up2().subList(idx, hdrR.peg_no());
					unschdInptL.addAll(subInptL);
				}
			}
			
			if (!unschdInptL.isEmpty()) {
				checkInptLocIoLmt(unschdInptL);
			}
		}
		
		protected void checkInptLocIoLmt(MCList<MfgActReg_Upd01_DtlInptR>  inptSchdL) {
			MSBIL_ClService.Cl_Chk03 clChkOpe = MSBIL_ClService.crtCl_Chk03();
			addAll(clChkOpe.up0(), inptSchdL, createMap_Cl_Chk03_CndR_MfgActReg_Upd01_DtlInptR());
			clChkOpe.exec();
			copyErrFlg(inptSchdL, clChkOpe.down0());

			MCList<MfgActReg_Upd01_DtlInptR> delInptL = inptSchdL.subList(MfgActReg_Upd01_DtlInptR.$err_flg, true);
			up2().removeAll(delInptL);

			for (MfgActReg_Upd01_DtlInptR delInptR : delInptL) {
				MfgActReg_Upd01_HdrR up0R = up0().getFirst(MfgActReg_Upd01_HdrR.$peg_no, delInptR.hdr_peg_no());
				MfgActReg_Upd01_DtlOperR up1R = up1().getFirst(MfgActReg_Upd01_DtlOperR.$hdr_peg_no, delInptR.hdr_peg_no());
				up0R.bkf_failure_cnt(nvl(up0R.bkf_failure_cnt(), MCNumber.ZERO).add(MCNumber.ONE));
				up1R.bkf_failure_cnt(nvl(up1R.bkf_failure_cnt(), MCNumber.ZERO).add(MCNumber.ONE));
			}
		}
		
		/**
		 * 製造指図登録後の上り電文補完
		 * @param mfgInstOpe
		 */
		protected void setMfgInstDown(MSBCL_MfgInstRegService.MfgInstReg_Upd01 mfgInstOpe) {
			// ヘッダ
			setMfgInstDownForHdr(mfgInstOpe.down0());
			
			// 工程
			setMfgInstDownForOper(mfgInstOpe.down1());
			
			// バックフラッシュする場合
			if (!up0().get(0).not_bkf_upd_flg()) {
				// 投入
				makeInptAct();
			}
			
			// 自動工数計算する場合に工数実績を登録
			if (!up0().get(0).not_wk_cost_upd_calc_flg()) {
				// 工数
				makeWkAct();
			}
			
			// 出来高
			makeYieldAct();
		}
		
		/**
		 * 製造指図登録後の上り電文補完（工数）
		 * ※工数は登録後の工数予定を利用して作成
		 */
		protected void makeWkAct() {
			MCList<MfgActReg_Upd01_DtlWkR> makeL = MCList.create(MfgActReg_Upd01_DtlWkR.class);
			
			// 自動工数計算する工数予定を取得
			MCList<MST_WK_SCHD_R> wkSchdL = MCList.create(MST_WK_SCHD_R.class);
			MST_WK_SCHD_R t = MST_WK_SCHD_R.create("T");
			MCQueryApiBuilder wkSchdL_bldr = MCQueryApiBuilder.create(t);
			wkSchdL_bldr.addWhereWithAnd(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			wkSchdL_bldr.addWhereWithAnd(t.wk_cost_calc_flg.eq(value(true)));
			wkSchdL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBCL6050_MST_WK_SCHD_S02", wkSchdL, wkSchdL_bldr, up1());
			
			if (isNull(wkSchdL) || wkSchdL.isEmpty()) {
				return;
			}
			
			MCIndexKey wkSchdIdxKey = wkSchdL.createIndex(MST_WK_SCHD_R.$mfg_inst_no, MST_WK_SCHD_R.$oper_inst_no);
			
			MCNumber pegNo = MCNumber.ZERO;
			
			// 製造再計算サービスで工数計算を行うためのヘッダ情報登録
			MSBCL_MfgReCalcService.MfgReCalc_Sprt03 sprt03 = MSBCL_MfgReCalcService.crtMfgReCalc_Sprt03();
			for (MfgActReg_Upd01_HdrR up0R : up0()) {
				if (!up0R.unschd_act_flg()) {
					continue;
				}
				MfgReCalc_Sprt03_HdrR sprt3HdrR = MfgReCalc_Sprt03_HdrR.create();
				sprt3HdrR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				sprt3HdrR.peg_no(up0R.peg_no());
				sprt3HdrR.mfg_inst_no(up0R.mfg_inst_no());
				sprt3HdrR.div_seq(1);
				sprt3HdrR.base_unit_st_qty(up0R.base_unit_st_act_qty());
				sprt03.up0().add(sprt3HdrR);
			}
			
			for (MfgActReg_Upd01_DtlOperR up1R : up1()) {
				MCList<MST_WK_SCHD_R> tgtWkSchdL = wkSchdL.subList(wkSchdIdxKey, up1R.mfg_inst_no(), up1R.oper_inst_no());
				if (isNull(tgtWkSchdL) || tgtWkSchdL.isEmpty()) {
					continue;
				}
				
				tgtWkSchdL.sort(MST_WK_SCHD_R.$disp_seq, MST_WK_SCHD_R.$wk_schd_no);
				
				for (MST_WK_SCHD_R tgtWkSchdR : tgtWkSchdL) {
					MfgActReg_Upd01_DtlWkR newR = MfgActReg_Upd01_DtlWkR.create();
					
					copy(newR, tgtWkSchdR, createMap_MfgActReg_Upd01_DtlWkR_MST_WK_SCHD_R());
					
					newR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					newR.hdr_peg_no(up1R.hdr_peg_no());
					newR.oper_peg_no(up1R.peg_no());
					newR.peg_no(pegNo);
					newR.abort_flg(true);
					
					MfgActReg_Upd01_HdrR up0R = up0().getFirst(MfgActReg_Upd01_HdrR.$peg_no, newR.hdr_peg_no());
					newR.ac_dt(nvl(up0R.end_ac_dt(), up0R.st_ac_dt()));
					
					newR.wk_cost_calc_upd_flg(true);
					
					makeL.add(newR);
					
					// 製造再計算サービスで工数計算を行うため工数情報登録
					MfgReCalc_Sprt03_DtlWkR sprt3WkR = MfgReCalc_Sprt03_DtlWkR.create();
					sprt3WkR.hdr_peg_no(newR.hdr_peg_no());
					sprt3WkR.peg_no(newR.peg_no());
					sprt3WkR.oper_peg_no(newR.oper_peg_no());
					sprt3WkR.wk_schd_no(newR.wk_schd_no());
					sprt03.up5().add(sprt3WkR);
					
					pegNo = pegNo.add(1);
				}
			}
			
			if (!isNull(makeL) && !makeL.isEmpty()) {
				// 製造再計算サービス実行
				sprt03.exec();
				
				// 計算された工数を取得
				copyByPegNo(makeL, new String[] {
						MfgActReg_Upd01_DtlWkR.$act_wk_cost
				}, sprt03.down4(), new String[] {
						MfgReCalc_Sprt03_DtlWkR.$st_sum_wk_cost
				});
				
				// 工数実績登録用の電文に設定
				up4().addAll(makeL);
			}
		}
		
		protected Map_MfgActReg_Upd01_DtlWkR_MST_WK_SCHD_R<MfgActReg_Upd01_DtlWkR,MST_WK_SCHD_R> createMap_MfgActReg_Upd01_DtlWkR_MST_WK_SCHD_R() {
			return new Map_MfgActReg_Upd01_DtlWkR_MST_WK_SCHD_R<MfgActReg_Upd01_DtlWkR, MST_WK_SCHD_R>();
		}
		
		public class Map_MfgActReg_Upd01_DtlWkR_MST_WK_SCHD_R<D extends MfgActReg_Upd01_DtlWkR, S extends MST_WK_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActReg_Upd01_DtlWkR.$wk_cost_cd, MST_WK_SCHD_R.$wk_cost_cd);
				addColumnPathMap(MfgActReg_Upd01_DtlWkR.$wk_cost_calc_flg, MST_WK_SCHD_R.$wk_cost_calc_flg);
				addColumnPathMap(MfgActReg_Upd01_DtlWkR.$wk_schd_no, MST_WK_SCHD_R.$wk_schd_no);
			}
		}
		
		/**
		 * 製造指図登録後の上り電文補完（出来高）
		 * ※出来高実績は上り電文と登録後の出来高予定を利用して再作成
		 */
		protected void makeYieldAct() {
			MCList<MfgActReg_Upd01_DtlYieldR> cloneL = up5().clone();
			MCList<MfgActReg_Upd01_DtlYieldR> makeL = MCList.create(MfgActReg_Upd01_DtlYieldR.class);
			
			// 製造指図ＮＯに対応する出来高予定を取得
			MCList<MST_YIELD_SCHD_R> ysDbcL = MCList.create(MST_YIELD_SCHD_R.class);
			MST_YIELD_SCHD_R t = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder ysDbcL_bldr = MCQueryApiBuilder.create(t);
			ysDbcL_bldr.addWhereWithAnd(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			ysDbcL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBCL6050_MST_YIELD_SCHD_S04", ysDbcL, ysDbcL_bldr, up1());
			
			MCNumber pegNo = MCNumber.ZERO;
			for (MfgActReg_Upd01_DtlYieldR cloneR : cloneL) {
				MfgActReg_Upd01_HdrR hdrR = up0().getFirst(MfgActReg_Upd01_HdrR.$peg_no, cloneR.hdr_peg_no());
				MCList<MST_YIELD_SCHD_R> subysDbcL = ysDbcL.subList(MfgActReg_Upd01_DtlYieldR.$mfg_inst_no, hdrR.mfg_inst_no());
				subysDbcL.sort(MST_YIELD_SCHD_R.$disp_seq, MST_YIELD_SCHD_R.$yield_schd_no);
				
				if (subysDbcL.size() == 1) {
					// 出来高予定が1レコードの場合
					MST_YIELD_SCHD_R yiDbcR = subysDbcL.get(0);
					// 出来高予定をベースに、上り電文の出来高の内容を設定
					cloneR.mfg_inst_no(hdrR.mfg_inst_no());
					cloneR.itm_mfg_inst_no(hdrR.itm_mfg_inst_no());
					cloneR.oper_inst_no(yiDbcR.oper_inst_no());
					cloneR.yield_schd_no(yiDbcR.yield_schd_no());
					
					if (isNull(cloneR.lot_no())) {
						cloneR.lot_no(MAC_STR.NULL_VAL.value());
					}
					if (isNull(cloneR.sublot_no())) {
						cloneR.sublot_no(MAC_STR.NULL_VAL.value());
					}
					
					MfgActReg_Upd01_DtlOperR up1R = up1().getFirst(MfgActReg_Upd01_DtlOperR.$oper_inst_no, yiDbcR.oper_inst_no());
					cloneR.oper_peg_no(up1R.peg_no());
					
					cloneR.peg_no(pegNo);
					pegNo = pegNo.add(1);
					
					makeL.add(cloneR);
				}
				else {
					// 出来高予定が複数レコードの場合
					subysDbcL.addNumberColumn("TMP_BASE_UNIT_QTY");
					FXUCC_Divide.inSeq(
							subysDbcL,
							cloneR.base_unit_yield_act_qty(),
							MST_YIELD_SCHD_R.$base_unit_yield_qty,
							"TMP_BASE_UNIT_QTY"
							);
					
					for (MST_YIELD_SCHD_R subysDbcR : subysDbcL) {
						// 割り当ての結果、数量が０になる場合は何もしない
						if (subysDbcR.getNumber("TMP_BASE_UNIT_QTY").isZero()) {
							continue;
						}
						
						MfgActReg_Upd01_DtlYieldR newR = cloneR.clone();
						newR.base_unit_yield_act_qty(subysDbcR.getNumber("TMP_BASE_UNIT_QTY"));
						
						// 取引単位が基準単位と異なる場合
						if (!isSame(newR.trd_unit_cd(), newR.base_unit_cd())) {
							MAVM_ITM_UNIT_R itmUnitR = _cacheItmUnit.getFirst(_idxItmUnitCache,
									hdrR.itm_cd(),
									hdrR.itm_sub1(),
									hdrR.itm_sub2(),
									hdrR.itm_sub3());
							if (!isNull(itmUnitR)) {
								// 基準単位数を取引単位数に変換し、また基準単位数に戻したとき、元の基準単位数に戻らない場合は基準単位を取引単位に設定
								MCNumber trdQty = rvrsBaseUnitConv(newR.base_unit_yield_act_qty(),
										itmUnitR.conv_base_qty(), itmUnitR.conv_qty(), itmUnitR.dec_place(),
										itmUnitR.rnd_typ());
								MCNumber baseQty = convToBaseUnit(trdQty, itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
										itmUnitR.dec_place(), itmUnitR.rnd_typ());
								
								if (!isSame(baseQty, newR.base_unit_yield_act_qty())) {
									newR.trd_unit_cd(newR.base_unit_cd());
									newR.trd_unit_yield_act_qty(subysDbcR.getNumber("TMP_BASE_UNIT_QTY"));
								}
							}
							else {
								newR.trd_unit_cd(newR.base_unit_cd());
								newR.trd_unit_yield_act_qty(subysDbcR.getNumber("TMP_BASE_UNIT_QTY"));
							}
						}
						else {
							newR.trd_unit_yield_act_qty(subysDbcR.getNumber("TMP_BASE_UNIT_QTY"));
						}
						
						newR.mfg_inst_no(hdrR.mfg_inst_no());
						newR.itm_mfg_inst_no(hdrR.itm_mfg_inst_no());
						newR.oper_inst_no(subysDbcR.oper_inst_no());
						newR.yield_schd_no(subysDbcR.yield_schd_no());
						
						if (isNull(newR.lot_no())) {
							newR.lot_no(MAC_STR.NULL_VAL.value());
						}
						if (isNull(newR.sublot_no())) {
							newR.sublot_no(MAC_STR.NULL_VAL.value());
						}
						
						MfgActReg_Upd01_DtlOperR up1R = up1().getFirst(MfgActReg_Upd01_DtlOperR.$oper_inst_no, subysDbcR.oper_inst_no());
						newR.oper_peg_no(up1R.peg_no());
						
						newR.peg_no(pegNo);
						pegNo = pegNo.add(1);
							
						makeL.add(newR);
						
						// 出来高予定のうち、使用した数量を減算
						subysDbcR.base_unit_yield_qty(subysDbcR.base_unit_yield_qty().subtract(newR.base_unit_yield_act_qty()));
					}
				}
			}
			
			if (!isNull(makeL) && !makeL.isEmpty()) {
				up5().clear();
				up5().addAll(makeL);
			}
		}
		
		/**
		 * 製造指図登録後の上り電文補完（投入）
		 * ※投入実績は登録後の投入予定を利用して作成
		 */
		protected void makeInptAct() {
			MCList<MfgActReg_Upd01_DtlInptR> makeL = MCList.create(MfgActReg_Upd01_DtlInptR.class);
			
			// 全ての製造指図ＮＯに対応する投入予定取得（投入予定のＢＦ区分が対象外、投入制御区分がＭＲＰ対象外（指図書のみ）、および、工程指図のＢＦ許可がオフ（許可しない）場合は除外）
			MCList<MST_INPT_SCHD_R> inptSchdL = MCList.create(MST_INPT_SCHD_R.class);
			MST_INPT_SCHD_R inptSchdL_t = MST_INPT_SCHD_R.create("T");
			MCQueryApiBuilder inptSchdL_bldr = MCQueryApiBuilder.create(inptSchdL_t);
			MST_OPER_INST_R t2 = MST_OPER_INST_R.create("T2");
			inptSchdL_bldr.addWhereWithAnd(inptSchdL_t.mfg_inst_no.eq(bind("mfg_inst_no")));
			inptSchdL_bldr.addWhereWithAnd(inptSchdL_t.bkf_typ.neq(value(MAC_BKF_TYP.NO_BKF.value())));
			inptSchdL_bldr.addWhereWithAnd(inptSchdL_t.inpt_ctl_typ.neq(value(MAC_INPT_CTL_TYP.NO_MRP_INST.value())));
			inptSchdL_bldr.addWhereWithAnd(inptSchdL_t.can_flg.eq(value(false)));
			inptSchdL_bldr.addInnerJoin(t2, bracket(t2.oper_inst_no.eq(inptSchdL_t.oper_inst_no)
					.and(t2.bkf_flg.eq(value(true)))));
			dbSelect("MSBCL6050_MST_INPT_SCHD_S03", inptSchdL, inptSchdL_bldr, up1());
			MCIndexKey inptSchdIdxKey = inptSchdL.createIndex(MST_INPT_SCHD_R.$mfg_inst_no, MST_INPT_SCHD_R.$oper_inst_no);
			
			// 投入予定に対する品目マスタ取得
			MCList<MAM_ITM_R> inptItmL = MCList.create(MAM_ITM_R.class);
			MAM_ITM_R inptItmL_t = MAM_ITM_R.create("T");
			MCQueryApiBuilder inptItmL_bldr = MCQueryApiBuilder.create(inptItmL_t); 
			dbSelectKey("MSBCL6050_MAM_ITM_S01", inptItmL, inptItmL_bldr, inptSchdL);
			MCIndexKey inptItmIdxKey = inptItmL.createIndex(MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2, MAM_ITM_R.$itm_sub3);
			
			MCNumber pegNo = MCNumber.ZERO;
			for (MfgActReg_Upd01_DtlOperR up1R : up1()) {
				
				MCList<MST_INPT_SCHD_R> tgtInptSchdL = inptSchdL.subList(inptSchdIdxKey, up1R.mfg_inst_no(), up1R.oper_inst_no());
				if (isNull(tgtInptSchdL) || tgtInptSchdL.isEmpty()) {
					continue;
				}
				
				tgtInptSchdL.sort(MST_INPT_SCHD_R.$disp_seq, MST_INPT_SCHD_R.$inpt_schd_no);
				
				MCNumber bkfTgtCntOper = MCNumber.ZERO;
				up1R.bkf_tgt_cnt(bkfTgtCntOper);
				
				for (MST_INPT_SCHD_R tgtInptSchdR : tgtInptSchdL) {
					MfgActReg_Upd01_DtlInptR newR = MfgActReg_Upd01_DtlInptR.create();
					
					newR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					newR.hdr_peg_no(up1R.hdr_peg_no());
					newR.oper_peg_no(up1R.peg_no());
					newR.peg_no(pegNo);
					
					copy(newR, tgtInptSchdR, createMap_MfgActReg_Upd01_DtlInptR_MST_INPT_SCHD_R());
					
					MAM_ITM_R inptItmR = inptItmL.getFirst(inptItmIdxKey, newR.itm_cd(), newR.itm_sub1(), newR.itm_sub2(), newR.itm_sub3());
					if (!isNull(inptItmR)) {
						newR.itm_typ(inptItmR.itm_typ());
						newR.itm_typ_d_cd(inptItmR.itm_typ_d_cd());
						newR.base_unit_conv_rnd_typ(inptItmR.rnd_typ());
						newR.base_unit_dec_place(inptItmR.dec_place());
						newR.lot_mng_typ(inptItmR.lot_mng_typ());
						newR.sublot_mng_typ(inptItmR.sublot_mng_typ());
						newR.sno1_mng_typ(inptItmR.sno1_mng_typ());
						newR.sno2_mng_typ(inptItmR.sno2_mng_typ());
						newR.sno3_mng_typ(inptItmR.sno3_mng_typ());
						newR.sno4_mng_typ(inptItmR.sno4_mng_typ());
						newR.stk_mng_typ(inptItmR.stk_mng_typ());
						newR.cont_fctr_flg(inptItmR.cont_fctr_flg());
						newR.cont_fctr_rnd_typ(inptItmR.cont_fctr_rnd_typ());
						newR.cont_fctr_dec_place(inptItmR.cont_fctr_dec_place());
					}
					
					MfgActReg_Upd01_HdrR up0R = up0().getFirst(MfgActReg_Upd01_HdrR.$peg_no, newR.hdr_peg_no());
					newR.act_tm(nvl(up0R.end_act_tm(), up0R.st_act_tm()));
					newR.ac_dt(nvl(up0R.end_ac_dt(), up0R.st_ac_dt()));
					if (MAC_STK_MNG_TYP.isNOT_MNG(newR.stk_mng_typ())) {
						newR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
						newR.stk_bp_cd(MAC_STR.NULL_VAL.value());
					}
					newR.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
					newR.abort_flg(true);
					newR.bkf_upd_flg(true);
					
					if (isNull(newR.lot_no())) {
						newR.lot_no(MAC_STR.NULL_VAL.value());
					}
					if (isNull(newR.sublot_no())) {
						newR.sublot_no(MAC_STR.NULL_VAL.value());
					}
					
					makeL.add(newR);
					
					pegNo = pegNo.add(1);
					
					// 工程のバックフラッシュ対象件数
					up1R.bkf_tgt_cnt(up1R.bkf_tgt_cnt().add(1));
				}
				
				// ヘッダのバックフラッシュ対象件数
				MfgActReg_Upd01_HdrR up0R = up0().getFirst(MfgActReg_Upd01_HdrR.$peg_no, up1R.hdr_peg_no());
				if (isNull(up0R.bkf_tgt_cnt())) {
					up0R.bkf_tgt_cnt(MCNumber.ZERO);
				}
				if (isNull(up0R.bkf_success_cnt())) {
					up0R.bkf_success_cnt(MCNumber.ZERO);
				}
				if (isNull(up0R.bkf_failure_cnt())) {
					up0R.bkf_failure_cnt(MCNumber.ZERO);
				}
				
				up0R.bkf_tgt_cnt(up0R.bkf_tgt_cnt().add(up1R.bkf_tgt_cnt()));
			}
			if (!isNull(makeL) && !makeL.isEmpty()) {
				up2().addAll(makeL);
			}
		}
		
		protected Map_MfgActReg_Upd01_DtlInptR_MST_INPT_SCHD_R<MfgActReg_Upd01_DtlInptR,MST_INPT_SCHD_R> createMap_MfgActReg_Upd01_DtlInptR_MST_INPT_SCHD_R() {
			return new Map_MfgActReg_Upd01_DtlInptR_MST_INPT_SCHD_R<MfgActReg_Upd01_DtlInptR, MST_INPT_SCHD_R>();
		}
		
		public class Map_MfgActReg_Upd01_DtlInptR_MST_INPT_SCHD_R<D extends MfgActReg_Upd01_DtlInptR, S extends MST_INPT_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$oper_inst_no, MST_INPT_SCHD_R.$oper_inst_no);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$alt_grp_cd, MST_INPT_SCHD_R.$alt_grp_cd);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$alt_grp_seq, MST_INPT_SCHD_R.$alt_grp_seq);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$alt_itm_fix_flg, MST_INPT_SCHD_R.$alt_itm_fix_flg);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$itm_cd, MST_INPT_SCHD_R.$itm_cd);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$itm_sub1, MST_INPT_SCHD_R.$itm_sub1);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$itm_sub2, MST_INPT_SCHD_R.$itm_sub2);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$itm_sub3, MST_INPT_SCHD_R.$itm_sub3);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$ver_no, MST_INPT_SCHD_R.$ver_no);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$base_unit_inpt_qty, MST_INPT_SCHD_R.$base_unit_inpt_qty);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$base_unit_cd, MST_INPT_SCHD_R.$base_unit_cd);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$act_cont_fctr, MST_INPT_SCHD_R.$act_cont_fctr);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$std_cont_fctr, MST_INPT_SCHD_R.$std_cont_fctr);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$cont_inpt_qty, MST_INPT_SCHD_R.$cont_inpt_qty);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$cont_fctr_unit_cd, MST_INPT_SCHD_R.$cont_fctr_unit_cd);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$lot_no, MST_INPT_SCHD_R.$lot_no);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$sublot_no, MST_INPT_SCHD_R.$sublot_no);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$sno1, MST_INPT_SCHD_R.$sno1);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$sno1_null_flg, MST_INPT_SCHD_R.$sno1_null_flg);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$sno2, MST_INPT_SCHD_R.$sno2);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$sno2_null_flg, MST_INPT_SCHD_R.$sno2_null_flg);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$sno3, MST_INPT_SCHD_R.$sno3);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$sno3_null_flg, MST_INPT_SCHD_R.$sno3_null_flg);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$sno4, MST_INPT_SCHD_R.$sno4);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$sno4_null_flg, MST_INPT_SCHD_R.$sno4_null_flg);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$gd_cd, MST_INPT_SCHD_R.$gd_cd);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$inpt_rsn_cd, MST_INPT_SCHD_R.$inpt_rsn_cd);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$inpt_loc_cd, MST_INPT_SCHD_R.$inpt_loc_cd);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$inpt_str_ln_cd, MST_INPT_SCHD_R.$inpt_str_ln_cd);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$lot_mix_flg, MST_INPT_SCHD_R.$lot_mix_flg);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$sublot_mix_flg, MST_INPT_SCHD_R.$sublot_mix_flg);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$prov_typ, MST_INPT_SCHD_R.$prov_typ);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$alt_itm_typ, MST_INPT_SCHD_R.$alt_itm_typ);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$alt_alloc_prio, MST_INPT_SCHD_R.$alt_alloc_prio);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$base_unit_alt_qty, MST_INPT_SCHD_R.$base_unit_alt_qty);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$alloc_flg, MST_INPT_SCHD_R.$alloc_flg);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$alloc_ctl_typ, MST_INPT_SCHD_R.$alloc_ctl_typ);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$inpt_schd_no, MST_INPT_SCHD_R.$inpt_schd_no);
			}
		}
		
		/**
		 * 製造指図登録後の上り電文補完（工程）
		 * @param down1L
		 */
		protected void setMfgInstDownForOper(MCList<MfgInstReg_Upd01_DtlOperR> down1L) {
			MCIndexKey idx = down1L.createIndex(MfgInstReg_Upd01_DtlOperR.$hdr_peg_no, MfgInstReg_Upd01_DtlOperR.$peg_no);
			
			for (MfgActReg_Upd01_DtlOperR up1R : up1()) {
				MfgInstReg_Upd01_DtlOperR down1R = down1L.getFirst(idx, up1R.hdr_peg_no(), up1R.peg_no());
				up1R.itm_mfg_inst_no(down1R.itm_mfg_inst_no());
				up1R.mfg_inst_no(down1R.mfg_inst_no());
				up1R.oper_ord_no(down1R.oper_ord_no());
				up1R.oper_inst_no(down1R.oper_inst_no());
				up1R.bkf_flg(down1R.bkf_flg());
				up1R.bkf_upd_flg(down1R.bkf_flg());
				up1R.wk_cost_calc_flg(down1R.wk_cost_calc_flg());
				up1R.wk_cost_upd_calc_flg(down1R.wk_cost_calc_flg());
				up1R.mes_flg(down1R.mes_flg());
				up1R.bkf_tgt_cnt(MCNumber.ZERO);
				up1R.bkf_success_cnt(MCNumber.ZERO);
				up1R.bkf_failure_cnt(MCNumber.ZERO);
			}
		}
		
		/**
		 * 製造指図登録後の上り電文補完（ヘッダ）
		 * @param down0L
		 */
		protected void setMfgInstDownForHdr(MCList<MfgInstReg_Upd01_HdrR> down0L) {
			MCIndexKey idx = down0L.createIndex(MfgInstReg_Upd01_HdrR.$peg_no);
			
			for (MfgActReg_Upd01_HdrR up0R : up0()) {
				MfgInstReg_Upd01_HdrR down0R = down0L.getFirst(idx, up0R.peg_no());
				up0R.mfg_inst_no(down0R.mfg_inst_no());
				up0R.itm_mfg_inst_no(down0R.itm_mfg_inst_no());
				up0R.itm_ord_no(down0R.itm_ord_no());
				up0R.prnt_seq(1);
			}
		}
		
		/**
		 * 再展開サービスの結果を製造指図登録サービスの電文にセット
		 * @param reExpOpe
		 * @param mfgInstOpe
		 */
		protected void setReExpDown(MSBCL_ReExpService.ReExp_Sprt05 reExpOpe, MSBCL_MfgInstRegService.MfgInstReg_Upd01 mfgInstOpe) {
			// ヘッダ
			makeHdrUp0(mfgInstOpe.up0(), reExpOpe.up0());
			
			// 工程単位のマスタキャッシュ
			crtOperUnitCache(reExpOpe.down0());
			
			// 工程
			makeOperUp1(mfgInstOpe.up1(), reExpOpe.down0());
			
			// バックフラッシュする場合
			if (!up0().get(0).not_bkf_upd_flg()) {
				// 投入
				makeInptUp2(mfgInstOpe.up2(), reExpOpe.down2());
			}
			
			// 工数
			makeWkUp3(mfgInstOpe.up3(), reExpOpe.down4());
			
			// 出来高
			makeYieldUp4(mfgInstOpe.up4(), reExpOpe.down1());
		}
		
		/**
		 * 製造指図登録サービスへの電文編集（出来高）
		 * @param yieldL
		 * @param downYieldL
		 */
		protected void makeYieldUp4(MCList<MfgInstReg_Upd01_DtlYieldR> yieldL, MCList<ReExp_Sprt03_RsltYieldR> downYieldL) {
			MCNumber pegNo = MCNumber.ZERO;
			for (ReExp_Sprt03_RsltYieldR downYieldR : downYieldL) {
				if (isNull(downYieldR.peg_no())) {
					downYieldR.peg_no(pegNo);
					pegNo = pegNo.add(1);
				}
				MfgInstReg_Upd01_DtlYieldR yieldR = MfgInstReg_Upd01_DtlYieldR.create();
				
				copy(yieldR, downYieldR, createMap_MfgInstReg_Upd01_DtlYieldR_ReExp_Sprt03_RsltYieldR());
				yieldL.add(yieldR);
			}
		}
		
		protected Map_MfgInstReg_Upd01_DtlYieldR_ReExp_Sprt03_RsltYieldR<MfgInstReg_Upd01_DtlYieldR,ReExp_Sprt03_RsltYieldR> createMap_MfgInstReg_Upd01_DtlYieldR_ReExp_Sprt03_RsltYieldR() {
			return new Map_MfgInstReg_Upd01_DtlYieldR_ReExp_Sprt03_RsltYieldR<MfgInstReg_Upd01_DtlYieldR, ReExp_Sprt03_RsltYieldR>();
		}
		
		public class Map_MfgInstReg_Upd01_DtlYieldR_ReExp_Sprt03_RsltYieldR<D extends MfgInstReg_Upd01_DtlYieldR, S extends ReExp_Sprt03_RsltYieldR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$hdr_peg_no, ReExp_Sprt03_RsltYieldR.$hdr_peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$oper_peg_no, ReExp_Sprt03_RsltYieldR.$oper_peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$peg_no, ReExp_Sprt03_RsltYieldR.$peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$itm_cd, ReExp_Sprt03_RsltYieldR.$itm_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$itm_sub1, ReExp_Sprt03_RsltYieldR.$itm_sub1);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$itm_sub2, ReExp_Sprt03_RsltYieldR.$itm_sub2);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$itm_sub3, ReExp_Sprt03_RsltYieldR.$itm_sub3);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$trd_unit_cd, ReExp_Sprt03_RsltYieldR.$trd_unit_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$base_unit_cd, ReExp_Sprt03_RsltYieldR.$base_unit_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$strg_loc_cd, ReExp_Sprt03_RsltYieldR.$strg_loc_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$strg_str_ln_cd, ReExp_Sprt03_RsltYieldR.$strg_str_ln_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlYieldR.$disp_seq, ReExp_Sprt03_RsltYieldR.$disp_seq);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				MfgActReg_Upd01_HdrR hdrR = up0().getFirst(MfgActReg_Upd01_HdrR.$peg_no, src.hdr_peg_no());
				dest.sno1(hdrR.sno1());
				dest.sno2(hdrR.sno2());
				dest.sno3(hdrR.sno3());
				dest.sno4(hdrR.sno4());
				dest.mfg_loc_site_cd(hdrR.site_cd());
				dest.mfg_loc_cd(hdrR.mfg_loc_cd());
				dest.schd_tm(src.yield_schd_dt());
				dest.trd_unit_yield_qty(src.trd_unit_qty());
				dest.base_unit_yield_qty(src.base_unit_qty());
				dest.stk_lst_prnt_flg(false);
				dest.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
				dest.disp_seq_upd_flg(false);
				dest.inst_abort_flg(false);
				dest.old_inst_abort_flg(false);
				dest.not_frst_inst_can_flg(false);
			}
		}
		
		/**
		 *  製造指図登録サービスへの電文編集（工数）
		 * @param wkL
		 * @param downWkL
		 */
		protected void makeWkUp3(MCList<MfgInstReg_Upd01_DtlWkR> wkL, MCList<ReExp_Sprt02_RsltWkR> downWkL) {
			MCNumber pegNo = MCNumber.ZERO;
			for (ReExp_Sprt02_RsltWkR downWkR : downWkL) {
				if (isNull(downWkR.peg_no())) {
					downWkR.peg_no(pegNo);
					pegNo = pegNo.add(1);
				}
				MfgInstReg_Upd01_DtlWkR wkR = MfgInstReg_Upd01_DtlWkR.create();
				
				copy(wkR, downWkR, createMap_MfgInstReg_Upd01_DtlWkR_ReExp_Sprt02_RsltWkR());
				wkL.add(wkR);
			}
		}
		
		protected Map_MfgInstReg_Upd01_DtlWkR_ReExp_Sprt02_RsltWkR<MfgInstReg_Upd01_DtlWkR,ReExp_Sprt02_RsltWkR> createMap_MfgInstReg_Upd01_DtlWkR_ReExp_Sprt02_RsltWkR() {
			return new Map_MfgInstReg_Upd01_DtlWkR_ReExp_Sprt02_RsltWkR<MfgInstReg_Upd01_DtlWkR, ReExp_Sprt02_RsltWkR>();
		}
		
		public class Map_MfgInstReg_Upd01_DtlWkR_ReExp_Sprt02_RsltWkR<D extends MfgInstReg_Upd01_DtlWkR, S extends ReExp_Sprt02_RsltWkR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$hdr_peg_no, ReExp_Sprt02_RsltWkR.$hdr_peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$oper_peg_no, ReExp_Sprt02_RsltWkR.$oper_peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$peg_no, ReExp_Sprt02_RsltWkR.$peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$wk_cost_cd, ReExp_Sprt02_RsltWkR.$wk_cost_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$wk_cost, ReExp_Sprt02_RsltWkR.$wk_cost);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$fxd_wk_cost, ReExp_Sprt02_RsltWkR.$fxd_wk_cost);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$mst_wk_cost, ReExp_Sprt02_RsltWkR.$mst_wk_cost);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$mst_fxd_wk_cost, ReExp_Sprt02_RsltWkR.$mst_fxd_wk_cost);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$wk_cost_calc_flg, ReExp_Sprt02_RsltWkR.$wk_cost_calc_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlWkR.$disp_seq, ReExp_Sprt02_RsltWkR.$disp_seq);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
				dest.disp_seq_upd_flg(false);
				dest.inst_abort_flg(false);
				dest.old_inst_abort_flg(false);
				dest.not_frst_inst_can_flg(false);
			}
		}
		
		/**
		 * 製造指図登録サービスへの電文編集（投入）
		 * @param inptL
		 * @param downInptL
		 */
		protected void makeInptUp2(MCList<MfgInstReg_Upd01_DtlInptR> inptL, MCList<ReExp_Sprt01_RsltInptR> downInptL) {
			MCNumber pegNo = MCNumber.ZERO;
			MCNumber dispSeq = MCNumber.ONE;
			for (ReExp_Sprt01_RsltInptR downInptR : downInptL) {
				if (isNull(downInptR.peg_no())) {
					downInptR.peg_no(pegNo);
					pegNo = pegNo.add(1);
				}
				MfgInstReg_Upd01_DtlInptR inptR = MfgInstReg_Upd01_DtlInptR.create();
				
				downInptR.disp_seq(dispSeq);
				
				copy(inptR, downInptR, createMap_MfgInstReg_Upd01_DtlInptR_ReExp_Sprt01_RsltInptR());
				inptL.add(inptR);
				
				dispSeq = dispSeq.add(1);
			}
		}
		
		protected Map_MfgInstReg_Upd01_DtlInptR_ReExp_Sprt01_RsltInptR<MfgInstReg_Upd01_DtlInptR,ReExp_Sprt01_RsltInptR> createMap_MfgInstReg_Upd01_DtlInptR_ReExp_Sprt01_RsltInptR() {
			return new Map_MfgInstReg_Upd01_DtlInptR_ReExp_Sprt01_RsltInptR<MfgInstReg_Upd01_DtlInptR, ReExp_Sprt01_RsltInptR>();
		}
		
		public class Map_MfgInstReg_Upd01_DtlInptR_ReExp_Sprt01_RsltInptR<D extends MfgInstReg_Upd01_DtlInptR, S extends ReExp_Sprt01_RsltInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$hdr_peg_no, ReExp_Sprt01_RsltInptR.$hdr_peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$oper_peg_no, ReExp_Sprt01_RsltInptR.$oper_peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$peg_no, ReExp_Sprt01_RsltInptR.$peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$alt_grp_cd, ReExp_Sprt01_RsltInptR.$alt_grp_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$alt_grp_seq, ReExp_Sprt01_RsltInptR.$alt_grp_seq);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$itm_cd, ReExp_Sprt01_RsltInptR.$itm_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$itm_sub1, ReExp_Sprt01_RsltInptR.$itm_sub1);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$itm_sub2, ReExp_Sprt01_RsltInptR.$itm_sub2);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$itm_sub3, ReExp_Sprt01_RsltInptR.$itm_sub3);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$ver_no, ReExp_Sprt01_RsltInptR.$ver_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$lot_mng_typ, ReExp_Sprt01_RsltInptR.$lot_mng_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sublot_mng_typ, ReExp_Sprt01_RsltInptR.$sublot_mng_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$base_unit_cd, ReExp_Sprt01_RsltInptR.$base_unit_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$cont_fctr_flg, ReExp_Sprt01_RsltInptR.$cont_fctr_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$act_cont_fctr, ReExp_Sprt01_RsltInptR.$act_cont_fctr);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$cont_inpt_qty, ReExp_Sprt01_RsltInptR.$cont_inpt_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$cont_rqmt_qty, ReExp_Sprt01_RsltInptR.$cont_rqmt_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$cont_fxd_rqmt_qty, ReExp_Sprt01_RsltInptR.$cont_fxd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$cont_fctr_unit_cd, ReExp_Sprt01_RsltInptR.$cont_fctr_unit_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$std_cont_fctr, ReExp_Sprt01_RsltInptR.$std_cont_fctr);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$inst_lot_fix_flg, ReExp_Sprt01_RsltInptR.$inst_lot_fix_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$lot_no, ReExp_Sprt01_RsltInptR.$lot_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sublot_no, ReExp_Sprt01_RsltInptR.$sublot_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$first_gr_dt, ReExp_Sprt01_RsltInptR.$first_gr_dt);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$lot_seq, ReExp_Sprt01_RsltInptR.$lot_seq);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno1, ReExp_Sprt01_RsltInptR.$sno1);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno1_null_flg, ReExp_Sprt01_RsltInptR.$sno1_null_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno2, ReExp_Sprt01_RsltInptR.$sno2);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno2_null_flg, ReExp_Sprt01_RsltInptR.$sno2_null_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno3, ReExp_Sprt01_RsltInptR.$sno3);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno3_null_flg, ReExp_Sprt01_RsltInptR.$sno3_null_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno4, ReExp_Sprt01_RsltInptR.$sno4);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sno4_null_flg, ReExp_Sprt01_RsltInptR.$sno4_null_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$inpt_loc_cd, ReExp_Sprt01_RsltInptR.$inpt_loc_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$inpt_str_ln_cd, ReExp_Sprt01_RsltInptR.$inpt_str_ln_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$gd_cd, ReExp_Sprt01_RsltInptR.$gd_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$bkf_typ, ReExp_Sprt01_RsltInptR.$bkf_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$par_inst_qty, ReExp_Sprt01_RsltInptR.$par_inst_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$chd_inpt_qty, ReExp_Sprt01_RsltInptR.$chd_inpt_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$chd_rqmt_qty, ReExp_Sprt01_RsltInptR.$chd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$fxd_chd_rqmt_qty, ReExp_Sprt01_RsltInptR.$fxd_chd_rqmt_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$main_itm_flg, ReExp_Sprt01_RsltInptR.$main_itm_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$bom_memo1, ReExp_Sprt01_RsltInptR.$bom_memo1);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$bom_memo2, ReExp_Sprt01_RsltInptR.$bom_memo2);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$bom_memo3, ReExp_Sprt01_RsltInptR.$bom_memo3);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$yield_calc_flg, ReExp_Sprt01_RsltInptR.$yield_calc_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$inpt_ctl_typ, ReExp_Sprt01_RsltInptR.$inpt_ctl_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$in_offst_typ, ReExp_Sprt01_RsltInptR.$in_offst_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$in_offst, ReExp_Sprt01_RsltInptR.$in_offst);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$lot_mix_flg, ReExp_Sprt01_RsltInptR.$lot_mix_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$sublot_mix_flg, ReExp_Sprt01_RsltInptR.$sublot_mix_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$stk_mng_typ, ReExp_Sprt01_RsltInptR.$stk_mng_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$prov_typ, ReExp_Sprt01_RsltInptR.$prov_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$alt_itm_typ, ReExp_Sprt01_RsltInptR.$alt_itm_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$alt_alloc_prio, ReExp_Sprt01_RsltInptR.$alt_alloc_prio);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$alt_itm_ratio, ReExp_Sprt01_RsltInptR.$alt_itm_ratio);
				addColumnPathMap(MfgInstReg_Upd01_DtlInptR.$disp_seq, ReExp_Sprt01_RsltInptR.$disp_seq);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.alt_itm_fix_flg(false);
				dest.base_unit_alt_qty(src.alt_qty());
				dest.base_unit_inpt_qty(src.inpt_qty());
				dest.base_unit_rqmt_qty(src.rqmt_qty());
				dest.base_unit_fxd_rqmt_qty(src.fxd_rqmt_qty());
				
				MfgActReg_Upd01_HdrR hdrR = up0().getFirst(MfgActReg_Upd01_HdrR.$peg_no, src.hdr_peg_no());
				dest.schd_tm(hdrR.st_ac_dt());
				
				dest.alloc_flg(false);
				if (MAC_LOT_MNG_TYP.isNOT_MNG(src.lot_mng_typ())) {
					dest.no_lot_fix_flg(false);
				}
				else {
					dest.no_lot_fix_flg(true);
				}
				
				if (isNull(dest.lot_no())) {
					dest.lot_no(MAC_STR.NULL_VAL.value());
				}
				if (isNull(dest.sublot_no())) {
					dest.sublot_no(MAC_STR.NULL_VAL.value());
				}
				
				dest.bom_id_no(src.bom_id());
				dest.chd_itm_seq(src.itm_seq());
				dest.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
				dest.disp_seq_upd_flg(false);
				dest.xfr_inst_err_flg(false);
				dest.inst_abort_flg(false);
				dest.old_inst_abort_flg(false);
				dest.not_frst_inst_can_flg(false);
				dest.inst_lot_fix_flg(false);
				dest.alloc_ctl_typ(MAC_ALLOC_CTL_TYP.NO_ALLOC.value());
				if (isNull(dest.inpt_str_ln_cd())) {
					dest.inpt_str_ln_cd(MAC_STR.NULL_VAL.value());
				}
			}
		}
		
		/**
		 * 製造指図登録サービスへの電文編集（工程）
		 * @param operL
		 * @param downOperL
		 */
		protected void makeOperUp1(MCList<MfgInstReg_Upd01_DtlOperR> operL, MCList<ReExp_Sprt05_RsltOperR> downOperL) {
			for (ReExp_Sprt05_RsltOperR downOperR : downOperL) {
				MfgInstReg_Upd01_DtlOperR operR = MfgInstReg_Upd01_DtlOperR.create();
				MfgActReg_Upd01_DtlOperR up1R = MfgActReg_Upd01_DtlOperR.create();
				
				copy(operR, downOperR, createMap_MfgInstReg_Upd01_DtlOperR_ReExp_Sprt05_RsltOperR());
				operL.add(operR);
				
				// 製造実績登録用に上り電文も編集
				copy(up1R, operR, createMap_MfgActReg_Upd01_DtlOperR_MfgInstReg_Upd01_DtlOperR());
				up1().add(up1R);
			}
		}
		
		protected Map_MfgActReg_Upd01_DtlOperR_MfgInstReg_Upd01_DtlOperR<MfgActReg_Upd01_DtlOperR,MfgInstReg_Upd01_DtlOperR> createMap_MfgActReg_Upd01_DtlOperR_MfgInstReg_Upd01_DtlOperR() {
			return new Map_MfgActReg_Upd01_DtlOperR_MfgInstReg_Upd01_DtlOperR<MfgActReg_Upd01_DtlOperR, MfgInstReg_Upd01_DtlOperR>();
		}
		
		public class Map_MfgActReg_Upd01_DtlOperR_MfgInstReg_Upd01_DtlOperR<D extends MfgActReg_Upd01_DtlOperR, S extends MfgInstReg_Upd01_DtlOperR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$data_crud_typ, MfgInstReg_Upd01_DtlOperR.$data_crud_typ);
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$hdr_peg_no, MfgInstReg_Upd01_DtlOperR.$hdr_peg_no);
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$peg_no, MfgInstReg_Upd01_DtlOperR.$peg_no);
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$oper_cd, MfgInstReg_Upd01_DtlOperR.$oper_cd);
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$oper_std_qty, MfgInstReg_Upd01_DtlOperR.$oper_std_qty);
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$oper_conv_qty, MfgInstReg_Upd01_DtlOperR.$oper_conv_qty);
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$oper_unit_conv_rnd_typ, MfgInstReg_Upd01_DtlOperR.$oper_unit_conv_rnd_typ);
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$oper_unit_dec_place, MfgInstReg_Upd01_DtlOperR.$oper_unit_dec_place);
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$oper_unit_cd, MfgInstReg_Upd01_DtlOperR.$oper_unit_cd);
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$disp_seq, MfgInstReg_Upd01_DtlOperR.$disp_seq);
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$bkf_flg, MfgInstReg_Upd01_DtlOperR.$bkf_flg);
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$wk_cost_calc_flg, MfgInstReg_Upd01_DtlOperR.$wk_cost_calc_flg);
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$oper_ord_no, MfgInstReg_Upd01_DtlOperR.$oper_ord_no);
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$oper_inst_no, MfgInstReg_Upd01_DtlOperR.$oper_inst_no);
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$itm_mfg_inst_no, MfgInstReg_Upd01_DtlOperR.$itm_mfg_inst_no);
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$mfg_inst_no, MfgInstReg_Upd01_DtlOperR.$mfg_inst_no);
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$base_unit_cd, MfgInstReg_Upd01_DtlOperR.$base_unit_cd);
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$mes_flg, MfgInstReg_Upd01_DtlOperR.$mes_flg);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.oper_unit_act_qty(src.base_unit_qty());
				MfgActReg_Upd01_HdrR hdrR = up0().getFirst(MfgActReg_Upd01_HdrR.$peg_no, src.hdr_peg_no());
				dest.st_act_tm(hdrR.st_act_tm());
				dest.end_act_tm(hdrR.end_act_tm());
			}
		}
		
		protected Map_MfgInstReg_Upd01_DtlOperR_ReExp_Sprt05_RsltOperR<MfgInstReg_Upd01_DtlOperR,ReExp_Sprt05_RsltOperR> createMap_MfgInstReg_Upd01_DtlOperR_ReExp_Sprt05_RsltOperR() {
			return new Map_MfgInstReg_Upd01_DtlOperR_ReExp_Sprt05_RsltOperR<MfgInstReg_Upd01_DtlOperR, ReExp_Sprt05_RsltOperR>();
		}
		
		public class Map_MfgInstReg_Upd01_DtlOperR_ReExp_Sprt05_RsltOperR<D extends MfgInstReg_Upd01_DtlOperR, S extends ReExp_Sprt05_RsltOperR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$hdr_peg_no, ReExp_Sprt05_RsltOperR.$hdr_peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$peg_no, ReExp_Sprt05_RsltOperR.$peg_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_cd, ReExp_Sprt05_RsltOperR.$oper_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_seq, ReExp_Sprt05_RsltOperR.$oper_seq);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$base_unit_qty, ReExp_Sprt05_RsltOperR.$base_unit_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$base_unit_cd, ReExp_Sprt05_RsltOperR.$base_unit_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_std_qty, ReExp_Sprt05_RsltOperR.$oper_std_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_conv_qty, ReExp_Sprt05_RsltOperR.$oper_conv_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_unit_cd, ReExp_Sprt05_RsltOperR.$oper_unit_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_loc_cd, ReExp_Sprt05_RsltOperR.$oper_loc_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_str_ln_cd, ReExp_Sprt05_RsltOperR.$oper_str_ln_cd);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$disp_seq, ReExp_Sprt05_RsltOperR.$disp_seq);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$bkf_flg, ReExp_Sprt05_RsltOperR.$bkf_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$wk_cost_calc_flg, ReExp_Sprt05_RsltOperR.$wk_cost_calc_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_inst_grp, ReExp_Sprt05_RsltOperR.$oper_inst_grp);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_lt, ReExp_Sprt05_RsltOperR.$oper_lt);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_lt_add_qty, ReExp_Sprt05_RsltOperR.$oper_lt_add_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_offst_typ, ReExp_Sprt05_RsltOperR.$oper_offst_typ);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_offst, ReExp_Sprt05_RsltOperR.$oper_offst);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_offst_add_qty, ReExp_Sprt05_RsltOperR.$oper_offst_add_qty);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$lmt_fr_dt_flg, ReExp_Sprt05_RsltOperR.$lmt_fr_dt_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_lower_yield, ReExp_Sprt05_RsltOperR.$oper_lower_yield);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_std_yield, ReExp_Sprt05_RsltOperR.$oper_std_yield);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_upper_yield, ReExp_Sprt05_RsltOperR.$oper_upper_yield);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$wip_rate, ReExp_Sprt05_RsltOperR.$wip_rate);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_ord_no, ReExp_Sprt05_RsltOperR.$oper_ord_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$mfg_inst_no, ReExp_Sprt05_RsltOperR.$mfg_inst_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$oper_inst_no, ReExp_Sprt05_RsltOperR.$oper_inst_no);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$yield_oper_flg, ReExp_Sprt05_RsltOperR.$yield_oper_flg);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$yield_oper_ratio, ReExp_Sprt05_RsltOperR.$yield_oper_ratio);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$st_schd_tm, ReExp_Sprt05_RsltOperR.$st_schd_tm);
				addColumnPathMap(MfgInstReg_Upd01_DtlOperR.$end_schd_tm, ReExp_Sprt05_RsltOperR.$end_schd_tm);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.tgt_oper_flg(true);
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				
				MAM_UNIT_R unitR = _cacheOperUnit.getFirst(_idxOperUnitCache, src.oper_unit_cd());
				if (!isNull(unitR)) {
					dest.oper_unit_conv_rnd_typ(unitR.rnd_typ());
					dest.oper_unit_dec_place(unitR.dec_place());
				}
				
				dest.oper_abort_flg(false);
				dest.not_oper_schd_qty(MCNumber.ZERO);
				dest.unschd_inst_flg(true);
				dest.unschd_act_flg(true);
				dest.hdr_mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
				dest.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
				dest.inst_abort_flg(false);
				dest.old_inst_abort_flg(false);
				dest.not_frst_inst_can_flg(false);
				
				dest.mes_flg(false);
				if (isNull(dest.oper_str_ln_cd())) {
					dest.oper_str_ln_cd(MAC_STR.NULL_VAL.value());
				}
			}
		}
		
		/**
		 * 製造指図登録サービスへの電文編集（ヘッダ）
		 * @param hdrL
		 * @param reExpHdrL
		 */
		protected void makeHdrUp0(MCList<MfgInstReg_Upd01_HdrR> hdrL, MCList<ReExp_Sprt05_HdrR> reExpHdrL) {
			MCIndexKey idxKey = up0().createIndex(MfgActReg_Upd01_HdrR.$peg_no);
			for (ReExp_Sprt05_HdrR reExpHdrR : reExpHdrL) {
				MfgActReg_Upd01_HdrR upR = up0().getFirst(idxKey, reExpHdrR.peg_no());
				MfgInstReg_Upd01_HdrR hdrR = MfgInstReg_Upd01_HdrR.create();
				
				hdrR.mfg_inst_data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				hdrR.itm_mfg_inst_data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				hdrR.peg_no(reExpHdrR.peg_no());
				hdrR.mfg_mtd_typ(MSC_MFG_MTD_TYP.INTNL.value());
				hdrR.mfg_sts_typ(MSC_MFG_STS_TYP.ORD.value());
				hdrR.master_dt(reExpHdrR.master_dt());
				hdrR.itm_cd(reExpHdrR.itm_cd());
				hdrR.itm_sub1(reExpHdrR.itm_sub1());
				hdrR.itm_sub2(reExpHdrR.itm_sub2());
				hdrR.itm_sub3(reExpHdrR.itm_sub3());
				hdrR.lot_mng_typ(upR.lot_mng_typ());
				hdrR.lot_no_typ(upR.lot_no_typ());
				hdrR.lot_no_ptn_cd(upR.lot_no_ptn_cd());
				hdrR.sublot_mng_typ(upR.sublot_mng_typ());
				hdrR.sublot_no_typ(upR.sublot_no_typ());
				hdrR.sublot_no_ptn_cd(upR.sublot_no_ptn_cd());
				hdrR.mfg_loc_cd(reExpHdrR.mfg_loc_cd());
				hdrR.strg_loc_cd(reExpHdrR.strg_loc_cd());
				hdrR.bom_ptn(upR.bom_ptn());
				hdrR.lot_issue_typ(MAC_LOT_ISSUE_TYP.ON_CMPL.value());
				hdrR.base_unit_inst_qty(upR.itm_mfg_inst_qty());
				hdrR.base_unit_yield_qty(upR.itm_mfg_inst_qty());
				hdrR.base_unit_cd(upR.base_unit_cd());
				hdrR.inst_dt(upR.st_act_tm());
				hdrR.st_schd_tm(upR.st_act_tm());
				hdrR.end_schd_tm(nvl(upR.end_act_tm(), upR.st_act_tm()));
				hdrR.oper_ptn(upR.oper_ptn());
				hdrR.sno1(reExpHdrR.sno1());
				hdrR.sno2(reExpHdrR.sno2());
				hdrR.sno3(reExpHdrR.sno3());
				hdrR.sno4(reExpHdrR.sno4());
				hdrR.mfg_str_ln_cd(reExpHdrR.mfg_str_ln_cd());
				hdrR.strg_str_ln_cd(reExpHdrR.strg_str_ln_cd());
				hdrR.po_locked_flg(false);
				hdrR.inst_abort_flg(false);
				hdrR.inst_prnt_flg(false);
				hdrR.inst_immed_prnt_flg(false);
				hdrR.chg_list_immed_prnt_flg(false);
				hdrR.xfr_inst_del_enable_flg(false);
				hdrR.mfg_inst_unit_typ(upR.mfg_inst_unit_typ());
				hdrR.unschd_inst_flg(true);
				hdrR.unschd_act_flg(true);
				hdrR.schd_chg_flg(true);
				hdrR.base_unit_ord_qty(upR.itm_mfg_inst_qty());
				hdrR.base_unit_not_inst_qty(0);
				hdrR.ord_abort_flg(false);
				hdrR.mfg_loc_wg_cd(reExpHdrR.wg_cd());
				hdrR.mfg_loc_site_cd(upR.site_cd());
				
				MAM_ITM_DTL_R itmDtlR = _cacheItmDtl.getFirst(_idxItmDtlCache,
						upR.itm_cd(),
						upR.itm_sub1(),
						upR.itm_sub2(),
						upR.itm_sub3(),
						upR.mfg_loc_cd(),
						upR.wg_cd(),
						upR.bom_ptn());
				if (!isNull(itmDtlR)) {
					hdrR.itm_lower_yield(itmDtlR.itm_lower_yield());
					hdrR.itm_std_yield(itmDtlR.itm_std_yield());
					hdrR.itm_upper_yield(itmDtlR.itm_upper_yield());
				}
				
				hdrR.inst_rec_issue_flg(false);
				hdrR.po_auto_reg_flg(false);
				hdrR.no_mfg_aprv_flg(true);
				hdrR.old_aprv_flg(false);
				hdrR.old_inst_abort_flg(false);
				hdrR.is_src_outsrc_srv_flg(false);
				hdrR.lst_reg_flg(true);
				hdrR.not_frst_inst_can_flg(false);
				hdrR.not_frst_inst_reg_oper_flg(false);
				hdrR.re_alloc_mode_flg(false);
				hdrR.is_src_alloc_flg(false);
				hdrL.add(hdrR);
			}
		}
		
		protected Map_ReExp_Sprt05_HdrR_MfgActReg_Upd01_HdrR<ReExp_Sprt05_HdrR,MfgActReg_Upd01_HdrR> createMap_ReExp_Sprt05_HdrR_MfgActReg_Upd01_HdrR() {
			return new Map_ReExp_Sprt05_HdrR_MfgActReg_Upd01_HdrR<ReExp_Sprt05_HdrR, MfgActReg_Upd01_HdrR>();
		}
		
		public class Map_ReExp_Sprt05_HdrR_MfgActReg_Upd01_HdrR<D extends ReExp_Sprt05_HdrR, S extends MfgActReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ReExp_Sprt05_HdrR.$peg_no, MfgActReg_Upd01_HdrR.$peg_no);
				addColumnPathMap(ReExp_Sprt05_HdrR.$wg_cd, MfgActReg_Upd01_HdrR.$wg_cd);
				addColumnPathMap(ReExp_Sprt05_HdrR.$itm_cd, MfgActReg_Upd01_HdrR.$itm_cd);
				addColumnPathMap(ReExp_Sprt05_HdrR.$itm_sub1, MfgActReg_Upd01_HdrR.$itm_sub1);
				addColumnPathMap(ReExp_Sprt05_HdrR.$itm_sub2, MfgActReg_Upd01_HdrR.$itm_sub2);
				addColumnPathMap(ReExp_Sprt05_HdrR.$itm_sub3, MfgActReg_Upd01_HdrR.$itm_sub3);
				addColumnPathMap(ReExp_Sprt05_HdrR.$oper_ptn, MfgActReg_Upd01_HdrR.$oper_ptn);
				addColumnPathMap(ReExp_Sprt05_HdrR.$bom_ptn, MfgActReg_Upd01_HdrR.$bom_ptn);
				addColumnPathMap(ReExp_Sprt05_HdrR.$strg_loc_cd, MfgActReg_Upd01_HdrR.$strg_loc_cd);
				addColumnPathMap(ReExp_Sprt05_HdrR.$mfg_loc_cd, MfgActReg_Upd01_HdrR.$mfg_loc_cd);
				addColumnPathMap(ReExp_Sprt05_HdrR.$sno1, MfgActReg_Upd01_HdrR.$sno1);
				addColumnPathMap(ReExp_Sprt05_HdrR.$sno2, MfgActReg_Upd01_HdrR.$sno2);
				addColumnPathMap(ReExp_Sprt05_HdrR.$sno3, MfgActReg_Upd01_HdrR.$sno3);
				addColumnPathMap(ReExp_Sprt05_HdrR.$sno4, MfgActReg_Upd01_HdrR.$sno4);
				addColumnPathMap(ReExp_Sprt05_HdrR.$master_dt, MfgActReg_Upd01_HdrR.$master_dt);
				addColumnPathMap(ReExp_Sprt05_HdrR.$mfg_str_ln_cd, MfgActReg_Upd01_HdrR.$mfg_str_ln_cd);
				addColumnPathMap(ReExp_Sprt05_HdrR.$mfg_str_ln_cd_none_flg, MfgActReg_Upd01_HdrR.$mfg_str_ln_cd_none_flg);
				addColumnPathMap(ReExp_Sprt05_HdrR.$strg_str_ln_cd, MfgActReg_Upd01_HdrR.$strg_str_ln_cd);
				addColumnPathMap(ReExp_Sprt05_HdrR.$strg_str_ln_cd_none_flg, MfgActReg_Upd01_HdrR.$strg_str_ln_cd_none_flg);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.mfg_inst_qty(src.itm_mfg_inst_qty());
				dest.yield_schd_qty(src.itm_mfg_inst_qty());
				dest.itm_ord_typ(MSC_ITM_ORD_TYP.MFG.value());
				dest.mfg_st_schd_dt(src.st_act_tm());
				if (MSC_MFG_STS_TYP.isSTT(src.mfg_sts_typ())){
					dest.mfg_end_schd_dt(src.st_act_tm());
				} else {
					dest.mfg_end_schd_dt(src.end_act_tm());
				}
				dest.not_bom_exp_flg(false);
				dest.not_wk_exp_flg(false);
			}
		}
		
		protected void setCache() {
			_hdrCache = new FXUCL_Cache<MfgActReg_Upd01_HdrR>();
			_hdrCache.setFixMaxCacheSize(-1);
			_operCache = new FXUCL_Cache<MfgActReg_Upd01_DtlOperR>();
			_operCache.setFixMaxCacheSize(-1);
			_inptCacheForLoss = new FXUCL_Cache<MfgActReg_Upd01_DtlInptR>();
			_inptCacheForLoss.setFixMaxCacheSize(-1);
			_yieldCacheForHdr = new FXUCL_Cache<MCList<MfgActReg_Upd01_DtlYieldR>>();
			_yieldCacheForHdr.setFixMaxCacheSize(-1);

			for (MfgActReg_Upd01_HdrR hdrR : up0()) {
				_hdrCache.putCache(new MCNumber[]{hdrR.peg_no()}, hdrR);
			}

			for (MfgActReg_Upd01_DtlOperR operR : up1()) {
				_operCache.putCache(new MCNumber[]{operR.peg_no()}, operR);
			}

			for (MfgActReg_Upd01_DtlInptR inptR : up2()) {
				_inptCacheForLoss.putCache(new MCNumber[]{inptR.peg_no()}, inptR);
			}

			MCIndexKey yieldKey = up5().createIndex(MfgActReg_Upd01_DtlYieldR.$hdr_peg_no);
			for (MfgActReg_Upd01_HdrR hdrR : up0()) {
				MCNumber[] cacheKey = new MCNumber[]{hdrR.peg_no()};
				_hdrCache.putCache(cacheKey, hdrR);
				_yieldCacheForHdr.putCache(cacheKey, up5().subList(yieldKey, hdrR.peg_no()));
			}
			selectItmCache(up0());
			selectSundryItmCache(up0());
			selectInptSchdCache(up0());
			selectYieldSchdCache(up0());
			selectLocCache();
		}

		protected void selectItmCache(MCList<MfgActReg_Upd01_HdrR> hdrL) {

			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(
					t.itm_nm,
					t.asset_mng_typ,
					t.stk_mng_typ,
					t.sundry_itm_flg,
					t.ac_itm_grp_cd,
					t.itm_jnl_cd,
					t.minus_stk_flg,
					t.gi_alloc_flg,
					t.dec_place,
					t.rnd_typ);
			_itmCache = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, hdrL
					, MfgActReg_Upd01_HdrR.$itm_cd
					, MfgActReg_Upd01_HdrR.$itm_sub1
					, MfgActReg_Upd01_HdrR.$itm_sub2
					, MfgActReg_Upd01_HdrR.$itm_sub3
					);
		}

		protected MAM_ITM_R getItm(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
			return _getItm(itmCd, itmSub1, itmSub2, itmSub3);
		}
		protected MAM_ITM_R _getItm(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
			return _itmCache.get(itmCd, itmSub1, itmSub2, itmSub3);
		}

		protected void selectSundryItmCache(MCList<MfgActReg_Upd01_HdrR> hdrL) {

			MAM_SUNDRY_ITM_R t = MAM_SUNDRY_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.itm_nm);
			_sundryItmCache = new FXUCL_MCDbcCache<MAM_SUNDRY_ITM_R>(dbc_bldr, hdrL
					, MfgActReg_Upd01_HdrR.$itm_cd
					, MfgActReg_Upd01_HdrR.$itm_sub1
					, MfgActReg_Upd01_HdrR.$itm_sub2
					, MfgActReg_Upd01_HdrR.$itm_sub3
					, MfgActReg_Upd01_HdrR.$sno1
					, MfgActReg_Upd01_HdrR.$sno2
					, MfgActReg_Upd01_HdrR.$sno3
					, MfgActReg_Upd01_HdrR.$sno4
					);
		}

		protected MAM_SUNDRY_ITM_R getSundryItm(String itmCd, String itmSub1, String itmSub2, String itmSub3
												, String sno1, String sno2, String sno3, String sno4) {
			return _getSundryItm(itmCd, itmSub1, itmSub2, itmSub3
							, sno1, sno2, sno3, sno4);
		}
		protected MAM_SUNDRY_ITM_R _getSundryItm(String itmCd, String itmSub1, String itmSub2, String itmSub3
													, String sno1, String sno2, String sno3, String sno4) {
			return _sundryItmCache.get(itmCd, itmSub1, itmSub2, itmSub3
										, sno1, sno2, sno3, sno4);
		}

		protected void selectInptSchdCache(MCList<MfgActReg_Upd01_HdrR> hdrL) {
			_cacheInptSchd = MCList.create(MST_INPT_SCHD_R.class);
			
			MST_INPT_SCHD_R t = MST_INPT_SCHD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			
			dbSelect("MSBCL6050_MST_INPT_SCHD_S04", _cacheInptSchd, dbc_bldr, hdrL);
			
			_idxInptSchdCache = _cacheInptSchd.createIndex(MST_INPT_SCHD_R.$mfg_inst_no);
		}

		protected void selectYieldSchdCache(MCList<MfgActReg_Upd01_HdrR> hdrL) {
			_cacheYieldSchd = MCList.create(MST_YIELD_SCHD_R.class);
			
			MST_YIELD_SCHD_R t = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			
			dbc_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			
			dbSelect("MSBCL6050_MST_YIELD_SCHD_S10", _cacheYieldSchd, dbc_bldr, hdrL);
			
			_idxYieldSchdCache = _cacheYieldSchd.createIndex(MST_YIELD_SCHD_R.$mfg_inst_no);
		}

		protected void selectLocCache() {
			MAM_LOC_R locL_t = MAM_LOC_R.create("LOC");
			MCQueryApiBuilder locL_bldr = MCQueryApiBuilder.create(locL_t);
			locL_bldr.setSelect(locL_t.pre_outsrc_act_flg);
			_mfgLocCache = new FXUCL_MCDbcCache<MAM_LOC_R>(locL_bldr, up0(),MfgActReg_Upd01_HdrR.$mfg_loc_cd);
		}

		protected void editUp() {
			// 各種ＮＯの発番
			setNo();

			editUpSub();
		}

		protected void setNo() {
			// 分割連番の発番
			setDivSeqForCrt();
			// 製造実績ＮＯの発番
			setMfgActNo();
			// 工程実績ＮＯの発番
			setOperActNo();
			// 投入実績ＮＯの発番
			setInptActNo();
			// ロス実績ＮＯの発番
			setLossActNo();
			// 工数実績ＮＯの発番
			setWkActNo();
			// 出来高実績ＮＯの発番（出来高）
			setYieldActNo();
			// 出来高実績ＮＯの発番（副産品）
			setByProdActNo();
		}

		protected void setDivSeqForCrt() {
			// 製造実績の一覧登録では呼び出し元が設定するため、分割連番がNULLのもののみを対象とする
			MCList<MfgActReg_Upd01_HdrR> divSeqL = up0()
					.subList(r -> MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
							&& isNull(r.div_seq()));
			if (!divSeqL.isEmpty()) {
				setDivSeq(divSeqL, MfgActReg_Upd01_HdrR.$mfg_inst_no,
						MfgActReg_Upd01_HdrR.$div_seq);
			}
		}

		protected void setMfgActNo() {
			// 発番業務区分により製造実績ＮＯを発番
			MCList<MfgActReg_Upd01_HdrR> mfgActNoL = up0().subList(
					MfgActReg_Upd01_HdrR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());

			if (!mfgActNoL.isEmpty()) {
				MCList<ElmArgsR> args = MCList.create(ElmArgsR.class);
				for (MfgActReg_Upd01_HdrR hdrR : mfgActNoL) {
					ElmArgsR arg = ElmArgsR.create();
					arg.peg_no(hdrR.peg_no());
					arg.itm_cd(hdrR.itm_cd());
					arg.itm_sub1(hdrR.itm_sub1());
					arg.itm_sub2(hdrR.itm_sub2());
					arg.itm_sub3(hdrR.itm_sub3());
					arg.loc_cd(hdrR.mfg_loc_cd());
					arg.wg_cd(hdrR.wg_cd());
					arg.site_cd(hdrR.site_cd());
					arg.dt(nvl(hdrR.st_ac_dt(), getToday()));
					arg.co_cd(getCo().co_cd());
					args.add(arg);
				}
				setNum(MAC_NUM_BIZ_TYP.MFGACT, args);
				String[] srcCols = new String[]{ElmArgsR.$new_no};
				String[] destCols = new String[]{MfgActReg_Upd01_HdrR.$mfg_act_no};
				copyByPegNo(up0(), destCols, args, srcCols);
			}
		}

		protected void setOperActNo() {
			// 発番システム区分により工程実績ＮＯを発番
			MCList<MfgActReg_Upd01_DtlOperR> operActNoL = up1().subList(
					MfgActReg_Upd01_DtlOperR.$data_crud_typ,
					MAC_DATA_CRUD_TYP.CRT.value());

			if (!operActNoL.isEmpty()) {
				doSeqCache(MSC_NUM_SYS_TYP.OPRACT, operActNoL.size());
				for (MfgActReg_Upd01_DtlOperR operR : operActNoL) {
					operR.oper_act_no(getStrSeq(MSC_NUM_SYS_TYP.OPRACT));
				}
			}
		}

		protected void setInptActNo() {
			// 発番システム区分により投入実績ＮＯを発番
			MCList<MfgActReg_Upd01_DtlInptR> inptActNoL = up2().subList(
					MfgActReg_Upd01_DtlInptR.$data_crud_typ,
					MAC_DATA_CRUD_TYP.CRT.value());

			if (!inptActNoL.isEmpty()) {
				doSeqCache(MSC_NUM_SYS_TYP.INPTACT, inptActNoL.size());
				for (MfgActReg_Upd01_DtlInptR inptR : inptActNoL) {
					inptR.inpt_act_no(getStrSeq(MSC_NUM_SYS_TYP.INPTACT));
				}
			}
		}

		protected void setLossActNo() {
			// 発番システム区分によりロス実績ＮＯを発番
			MCList<MfgActReg_Upd01_DtlLossR> lossActNoL = up3().subList(
					MfgActReg_Upd01_DtlLossR.$data_crud_typ,
					MAC_DATA_CRUD_TYP.CRT.value());

			if (!lossActNoL.isEmpty()) {
				doSeqCache(MSC_NUM_SYS_TYP.LOSSACT, lossActNoL.size());
				for (MfgActReg_Upd01_DtlLossR lossR : lossActNoL) {
					lossR.loss_act_no(getStrSeq(MSC_NUM_SYS_TYP.LOSSACT));
				}
			}
		}

		protected void setWkActNo() {
			// 発番システム区分により工数実績ＮＯを発番
			MCList<MfgActReg_Upd01_DtlWkR> wkActNoL = up4().subList(
					MfgActReg_Upd01_DtlWkR.$data_crud_typ,
					MAC_DATA_CRUD_TYP.CRT.value());

			if (!wkActNoL.isEmpty()) {
				doSeqCache(MSC_NUM_SYS_TYP.WKACT, wkActNoL.size());
				for (MfgActReg_Upd01_DtlWkR wkR : wkActNoL) {
					wkR.wk_act_no(getStrSeq(MSC_NUM_SYS_TYP.WKACT));
				}
			}
		}

		protected void setYieldActNo() {
			// 発番システム区分により出来高実績ＮＯを発番
			MCList<MfgActReg_Upd01_DtlYieldR> yieldActNoL = up5().subList(
					MfgActReg_Upd01_DtlYieldR.$data_crud_typ,
					MAC_DATA_CRUD_TYP.CRT.value());

			if (!yieldActNoL.isEmpty()) {
				doSeqCache(MSC_NUM_SYS_TYP.YLDACT, yieldActNoL.size());
				for (MfgActReg_Upd01_DtlYieldR yieldR : yieldActNoL) {
					yieldR.yield_act_no(getStrSeq(MSC_NUM_SYS_TYP.YLDACT));
				}
			}
		}

		protected void setByProdActNo() {
			// 発番システム区分により出来高実績ＮＯを発番
			MCList<MfgActReg_Upd01_DtlByProdR> byProdActNoL = up6().subList(
					MfgActReg_Upd01_DtlByProdR.$data_crud_typ,
					MAC_DATA_CRUD_TYP.CRT.value());

			if (!byProdActNoL.isEmpty()) {
				doSeqCache(MSC_NUM_SYS_TYP.YLDACT, byProdActNoL.size());
				for (MfgActReg_Upd01_DtlByProdR byProdR : byProdActNoL) {
					byProdR.yield_act_no(getStrSeq(MSC_NUM_SYS_TYP.YLDACT));
				}
			}
		}

		protected void editUpSub() {
			editHdr();
			editOper();
			editInptAndLoss();
			editWk();
			editYield();
			editByProd();
		}

		protected void editHdr() {
			for (MfgActReg_Upd01_HdrR r : up0()) {
				r.trd_cd(getDefaultTrdCd(MAC_TRD_PTN_TYP.MFG.value()));

				setItmInfo(r);

				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				if (!r.arr_purc_auto_reg_flg()) {
					// 自動作成されていない場合は、画面で入力した出来高に従う
					setSumQty(r);
				}
			}
		}

		protected void setItmInfo(MfgActReg_Upd01_HdrR r) {
			MAM_ITM_R itm = getItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());

			MAM_SUNDRY_ITM_R sundryItm = getSundryItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()
														, r.sno1(), r.sno2(), r.sno3(), r.sno4());

			if (isNull(r.itm_nm())) {
					r.itm_nm(nvl(sundryItm.itm_nm(), itm.itm_nm()));
			}
		}

		protected void setSumQty(MfgActReg_Upd01_HdrR r) {
			if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
				r.base_unit_yield_qty(0);
				r.base_unit_dfct_qty(0);
			}

			MCList<MfgActReg_Upd01_DtlYieldR> yL = _yieldCacheForHdr.getCache(r
					.peg_no());
			for (MfgActReg_Upd01_DtlYieldR yR : yL) {
				if (MAC_DATA_CRUD_TYP.isDEL(yR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(yR.data_crud_typ())) {
					if (MAC_YIELD_TYP.isGOOD(yR.old_yield_typ())) {
						r.base_unit_yield_qty(r.base_unit_yield_qty().subtract(
								yR.old_base_unit_yield_act_qty()));
					}
					else {
						r.base_unit_dfct_qty(r.base_unit_dfct_qty().subtract(
								yR.old_base_unit_yield_act_qty()));
					}
				}
				if (MAC_DATA_CRUD_TYP.isUPD(yR.data_crud_typ()) || MAC_DATA_CRUD_TYP.isCRT(yR.data_crud_typ())) {
					if (MAC_YIELD_TYP.isGOOD(yR.yield_typ())) {
						r.base_unit_yield_qty(r.base_unit_yield_qty().add(
								yR.base_unit_yield_act_qty()));
					}
					else {
						r.base_unit_dfct_qty(r.base_unit_dfct_qty().add(
								yR.base_unit_yield_act_qty()));
					}
				}
			}
		}

		protected void editOper() {
			for (MfgActReg_Upd01_DtlOperR r : up1()) {
				MfgActReg_Upd01_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());

				r.mfg_act_no(hdrR.mfg_act_no());
				r.itm_mfg_inst_no(hdrR.itm_mfg_inst_no());
				r.mfg_inst_no(hdrR.mfg_inst_no());
				r.div_seq(hdrR.div_seq());
				
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				r.base_unit_dec_place(hdrR.base_unit_dec_place());
				r.base_unit_conv_rnd_typ(hdrR.base_unit_conv_rnd_typ());
				r.base_unit_cd(hdrR.base_unit_cd());
			}
		}

		protected void editInptAndLoss() {
			
			// ロス実績コンテナの固定ロス数を投入紐付けＮＯ単位に集計
			MCGroupByPolicy gbp = new MCGroupByPolicy(MfgActReg_Upd01_DtlLossR.$inpt_peg_no);
			gbp.sum(MfgActReg_Upd01_DtlLossR.$loss_qty);
			gbp.sum(MfgActReg_Upd01_DtlLossR.$cont_loss_qty);
			MCList<MfgActReg_Upd01_DtlLossR> lossL = up3().subList(MfgActReg_Upd01_DtlLossR.$fxd_loss_flg, true).groupBy(gbp);
			MCIndexKey idxKey = lossL.createIndex(MfgActReg_Upd01_DtlLossR.$inpt_peg_no);

			for (MfgActReg_Upd01_DtlInptR r : up2()) {
				MfgActReg_Upd01_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
				MfgActReg_Upd01_DtlOperR operR = _operCache.getCache(r.oper_peg_no());

				r.mfg_inst_no(hdrR.mfg_inst_no());
				r.mfg_mtd_typ(hdrR.mfg_mtd_typ());
				r.div_seq(hdrR.div_seq());
				r.lst_reg_flg(hdrR.lst_reg_flg());
				r.is_src_batch_flg(hdrR.is_src_batch_flg());
				r.is_src_md_mfg_srv_flg(hdrR.is_src_md_mfg_srv_flg());
				r.not_pd_chk_flg(hdrR.not_pd_chk_flg());

				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}

				r.oper_cd(operR.oper_cd());
				r.oper_disp_seq(operR.disp_seq());
				r.wg_cd(hdrR.wg_cd());
				r.trd_cd(hdrR.trd_cd());
				r.act_dpt_cd(hdrR.act_dpt_cd());
				r.act_usr_cd(hdrR.act_usr_cd());
				r.mfg_loc_cd(hdrR.mfg_loc_cd());
				r.mfg_str_ln_cd(hdrR.mfg_str_ln_cd());
				r.sppl_cd(hdrR.sppl_cd());
				r.itm_mfg_inst_qty(hdrR.itm_mfg_inst_qty());
				r.mfg_st_qty(hdrR.base_unit_st_act_qty());
				r.par_itm_cd(hdrR.itm_cd());
				r.par_itm_sub1(hdrR.itm_sub1());
				r.par_itm_sub2(hdrR.itm_sub2());
				r.par_itm_sub3(hdrR.itm_sub3());
				r.par_itm_nm(hdrR.itm_nm());
				r.mfg_inst_lot_no(hdrR.inst_lot_no());
				r.mfg_inst_sublot_no(hdrR.inst_sublot_no());
				r.mfg_inst_sno1(hdrR.sno1());
				r.mfg_inst_sno2(hdrR.sno2());
				r.mfg_inst_sno3(hdrR.sno3());
				r.mfg_inst_sno4(hdrR.sno4());
				r.mfg_inst_sno1_mng_typ(hdrR.sno1_mng_typ());
				r.mfg_inst_sno2_mng_typ(hdrR.sno2_mng_typ());
				r.mfg_inst_sno3_mng_typ(hdrR.sno3_mng_typ());
				r.mfg_inst_sno4_mng_typ(hdrR.sno4_mng_typ());
				r.mfg_inst_unit_typ(hdrR.mfg_inst_unit_typ());
				r.mfg_act_no(hdrR.mfg_act_no());
				r.itm_mfg_inst_no(hdrR.itm_mfg_inst_no());
				r.oper_inst_no(operR.oper_inst_no());
				r.oper_act_no(operR.oper_act_no());
				r.div_seq(hdrR.div_seq());
				r.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				r.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				
				// 固定ロス実績の設定
				MfgActReg_Upd01_DtlLossR lossR = lossL.getFirst(idxKey, r.peg_no());
				if (!isNull(lossR)) {
					r.fxd_loss_qty(lossR.loss_qty());
					if (r.cont_fctr_flg()) {
						r. cont_fxd_loss_qty(lossR.cont_loss_qty());
					}
				}
				else {
					r.fxd_loss_qty(MCNumber.ZERO);
				}
			}

			for (MfgActReg_Upd01_DtlLossR r : up3()) {
				MfgActReg_Upd01_DtlInptR inptR = _inptCacheForLoss.getCache(r.inpt_peg_no());

				r.inpt_act_no(inptR.inpt_act_no());
			}


		}

		protected void editWk() {
			for (MfgActReg_Upd01_DtlWkR r : up4()) {
				MfgActReg_Upd01_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
				MfgActReg_Upd01_DtlOperR operR = _operCache.getCache(r.oper_peg_no());

				r.div_seq(hdrR.div_seq());
				r.mfg_inst_no(hdrR.mfg_inst_no());
				r.itm_mfg_inst_no(hdrR.itm_mfg_inst_no());

				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				r.oper_cd(operR.oper_cd());
				r.mfg_act_no(hdrR.mfg_act_no());
				r.oper_act_no(operR.oper_act_no());
				r.loc_cd(hdrR.mfg_loc_cd());
				r.str_ln_cd(hdrR.mfg_str_ln_cd());
				r.sno1(hdrR.sno1());
				r.sno2(hdrR.sno2());
				r.sno3(hdrR.sno3());
				r.sno4(hdrR.sno4());
				r.itm_cd(hdrR.itm_cd());
				r.itm_sub1(hdrR.itm_sub1());
				r.itm_sub2(hdrR.itm_sub2());
				r.itm_sub3(hdrR.itm_sub3());
				r.lot_no(hdrR.inst_lot_no());
				r.sublot_no(hdrR.inst_sublot_no());

			}
		}

		protected void editYield() {
			for (MfgActReg_Upd01_DtlYieldR r : up5()) {
				MfgActReg_Upd01_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
				MfgActReg_Upd01_DtlOperR operR = _operCache.getCache(r.oper_peg_no());

				r.mfg_act_no(hdrR.mfg_act_no());
				r.oper_act_no(operR.oper_act_no());
				r.div_seq(hdrR.div_seq());
				r.mfg_mtd_typ(hdrR.mfg_mtd_typ());
				r.itm_cd(hdrR.itm_cd());
				r.itm_sub1(hdrR.itm_sub1());
				r.itm_sub2(hdrR.itm_sub2());
				r.itm_sub3(hdrR.itm_sub3());
				r.mfg_inst_no(hdrR.mfg_inst_no());
				r.itm_mfg_inst_no(hdrR.itm_mfg_inst_no());

				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					r.lot_no(r.old_lot_no());
					r.sublot_no(r.old_sublot_no());
					continue;
				}

				r.oper_cd(operR.oper_cd());
				r.oper_disp_seq(operR.disp_seq());
				r.itm_ord_no(hdrR.itm_ord_no());
				r.oper_inst_no(operR.oper_inst_no());
				r.trd_cd(hdrR.trd_cd());
				r.act_dpt_cd(hdrR.act_dpt_cd());
				r.act_usr_cd(hdrR.act_usr_cd());
				r.itm_mfg_inst_qty(hdrR.itm_mfg_inst_qty());
				r.mfg_st_qty(hdrR.base_unit_st_act_qty());
				r.mfg_inst_lot_no(hdrR.inst_lot_no());
				r.mfg_inst_sublot_no(hdrR.inst_sublot_no());
				r.mfg_inst_unit_typ(hdrR.mfg_inst_unit_typ());
				r.sno1_mng_typ(hdrR.sno1_mng_typ());
				r.sno2_mng_typ(hdrR.sno2_mng_typ());
				r.sno3_mng_typ(hdrR.sno3_mng_typ());
				r.sno4_mng_typ(hdrR.sno4_mng_typ());
				r.sno1(hdrR.sno1());
				r.sno2(hdrR.sno2());
				r.sno3(hdrR.sno3());
				r.sno4(hdrR.sno4());
				if (MAC_YIELD_TYP.isGOOD(r.yield_typ())) {
					r.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				}
				else if (MAC_YIELD_TYP.isDFCT(r.yield_typ())) {
					r.quality_typ(MAC_QUALITY_TYP.DFCT_OPER.value());
				}
				r.yield_loc_cd(hdrR.mfg_loc_cd());
				r.yield_str_ln_cd(hdrR.mfg_str_ln_cd());
				r.bkf_ctl_flg(false);
				r.wg_cd(hdrR.wg_cd());
				r.site_cd(hdrR.site_cd());
			}
		}

		protected void editByProd() {
			for (MfgActReg_Upd01_DtlByProdR r : up6()) {
				MfgActReg_Upd01_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
				MfgActReg_Upd01_DtlOperR operR = _operCache.getCache(r.oper_peg_no());

				r.mfg_inst_no(hdrR.mfg_inst_no());
				r.itm_mfg_inst_no(hdrR.itm_mfg_inst_no());
				r.mfg_act_no(hdrR.mfg_act_no());
				r.oper_act_no(operR.oper_act_no());
				r.div_seq(hdrR.div_seq());
				r.mfg_mtd_typ(hdrR.mfg_mtd_typ());

				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}

				r.oper_cd(operR.oper_cd());
				r.oper_disp_seq(operR.disp_seq());
				r.oper_inst_no(operR.oper_inst_no());
				r.wg_cd(hdrR.wg_cd());
				r.trd_cd(hdrR.trd_cd());
				r.act_dpt_cd(hdrR.act_dpt_cd());
				r.act_usr_cd(hdrR.act_usr_cd());
				r.itm_mfg_inst_qty(hdrR.itm_mfg_inst_qty());
				r.mfg_st_qty(hdrR.base_unit_st_act_qty());
				r.par_itm_cd(hdrR.itm_cd());
				r.par_itm_sub1(hdrR.itm_sub1());
				r.par_itm_sub2(hdrR.itm_sub2());
				r.par_itm_sub3(hdrR.itm_sub3());
				r.par_itm_nm(hdrR.itm_nm());
				r.mfg_inst_lot_no(hdrR.inst_lot_no());
				r.mfg_inst_sublot_no(hdrR.inst_sublot_no());
				r.mfg_inst_sno1(hdrR.sno1());
				r.mfg_inst_sno2(hdrR.sno2());
				r.mfg_inst_sno3(hdrR.sno3());
				r.mfg_inst_sno4(hdrR.sno4());
				r.mfg_inst_unit_typ(hdrR.mfg_inst_unit_typ());
				r.mfg_inst_sno1_mng_typ(hdrR.sno1_mng_typ());
				r.mfg_inst_sno2_mng_typ(hdrR.sno2_mng_typ());
				r.mfg_inst_sno3_mng_typ(hdrR.sno3_mng_typ());
				r.mfg_inst_sno4_mng_typ(hdrR.sno4_mng_typ());

				r.yield_typ(MAC_YIELD_TYP.BYPROD.value());
				r.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				r.yield_loc_cd(hdrR.mfg_loc_cd());
				r.yield_str_ln_cd(hdrR.mfg_str_ln_cd());
				r.bkf_ctl_flg(operR.bkf_upd_flg());

			}
		}

		protected void callWipUpdService() {
			MSBCL_MfgInstActComService.MfgInstActCom_Upd05 o = MSBCL_MfgInstActComService
					.crtMfgInstActCom_Upd05();
			addAll(o.up0(), up0(), createMap_MfgInstActCom_Upd05_HdrR_MfgActReg_Upd01_HdrR());
			o.exec();
		}

		protected Map_MfgInstActCom_Upd05_HdrR_MfgActReg_Upd01_HdrR<MfgInstActCom_Upd05_HdrR,MfgActReg_Upd01_HdrR> createMap_MfgInstActCom_Upd05_HdrR_MfgActReg_Upd01_HdrR() {
			return new Map_MfgInstActCom_Upd05_HdrR_MfgActReg_Upd01_HdrR<MfgInstActCom_Upd05_HdrR, MfgActReg_Upd01_HdrR>();
		}

		public class Map_MfgInstActCom_Upd05_HdrR_MfgActReg_Upd01_HdrR<D extends MfgInstActCom_Upd05_HdrR, S extends MfgActReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Upd05_HdrR.$itm_mfg_inst_no, MfgActReg_Upd01_HdrR.$itm_mfg_inst_no);
				addColumnPathMap(MfgInstActCom_Upd05_HdrR.$mfg_act_no, MfgActReg_Upd01_HdrR.$mfg_act_no);
				addColumnPathMap(MfgInstActCom_Upd05_HdrR.$mfg_mtd_typ, MfgActReg_Upd01_HdrR.$mfg_mtd_typ);
				addColumnPathMap(MfgInstActCom_Upd05_HdrR.$mfg_inst_unit_typ, MfgActReg_Upd01_HdrR.$mfg_inst_unit_typ);

			}
		}
		
		protected void callTblRegSrv() {
			// 分割連番1以上の実績残テーブルの追加及び、受払予定の削除
			// ※matUpd04内のロット提案が、受払予定が削除されている前提で行われるため、matUpd04より前に実行する必要がある。
			callActRemInsSrv();
			
			// 投入実績のサブオペマッピング
			mapUpContainers(MATI);

			// 投入実績
			if (!matUpd04.up0().isEmpty()) {
				// 出来高・副産品実績のコンテナの設定
				setYieldByProdStk();
				matUpd04.exec();
				
				// 下り電文を元に、ヘッダ・工程・投入・ロスコンテナを編集
				editHdrContAftrInptReg(matUpd04.down1());
				editOperContAftrInptReg(matUpd04.down2());
				editInptAndLossContAftrInptReg(matUpd04.down0());
				removeBkfFailueAct(matUpd04.down1());
			}
			
			// 各種実績残テーブルの更新
			// ※各種実績残テーブルの更新処理内で、上り電文の投入実績が登録されることを前提とした処理があるため、
			// matUpd04より後に実行する必要がある（matUpd04内で上り電文行が登録対象外となる場合や、データ更新区分が変わる場合があるため）
			callActRemUpdSrv();
			
			// 投入実績以外のサブオペマッピング
			mapUpContainers(MAT);
			
			// 製造実績
			// ※投入の完了に応じて製造承認状況区分を決定する仕様があるため、callActRemUpdSrvより後に実行する必要がある
			matUpd01.exec();

			// 工程実績
			// ※バックフラッシュの成否によってバックフラッシュ未反映FLGが変わるため、matUpd04より後に実行する必要がある
			if (!matUpd02.up0().isEmpty()) {
				matUpd02.exec();
			}

			// 出来高実績
			if (!matUpd03.up0().isEmpty()) {
				matUpd03.exec();
			}

			// 副産品実績
			if (!matUpd06.up0().isEmpty()) {
				matUpd06.exec();
			}
			
			// 工数実績
			if (!matUpd05.up0().isEmpty()) {
				matUpd05.exec();
			}
		}
		
		protected void callActRemInsSrv() {
			// 各実績残テーブルの登録
			MSBCL_MfgInstActComService.MfgInstActCom_Upd04 o = MSBCL_MfgInstActComService
					.crtMfgInstActCom_Upd04();
			addAll(o.up1(), up0(), createMap_MfgInstActCom_Upd04_HdrR_MfgActReg_Upd01_HdrR());
			o.exec();
		}
		
		protected Map_MfgInstActCom_Upd04_HdrR_MfgActReg_Upd01_HdrR<MfgInstActCom_Upd04_HdrR,MfgActReg_Upd01_HdrR> createMap_MfgInstActCom_Upd04_HdrR_MfgActReg_Upd01_HdrR() {
			return new Map_MfgInstActCom_Upd04_HdrR_MfgActReg_Upd01_HdrR<MfgInstActCom_Upd04_HdrR, MfgActReg_Upd01_HdrR>();
		}

		public class Map_MfgInstActCom_Upd04_HdrR_MfgActReg_Upd01_HdrR<D extends MfgInstActCom_Upd04_HdrR, S extends MfgActReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Upd04_HdrR.$data_crud_typ, MfgActReg_Upd01_HdrR.$data_crud_typ);
				addColumnPathMap(MfgInstActCom_Upd04_HdrR.$itm_mfg_inst_no, MfgActReg_Upd01_HdrR.$itm_mfg_inst_no);
				addColumnPathMap(MfgInstActCom_Upd04_HdrR.$mfg_inst_no, MfgActReg_Upd01_HdrR.$mfg_inst_no);
				addColumnPathMap(MfgInstActCom_Upd04_HdrR.$div_seq, MfgActReg_Upd01_HdrR.$div_seq);
				addColumnPathMap(MfgInstActCom_Upd04_HdrR.$mfg_act_no, MfgActReg_Upd01_HdrR.$mfg_act_no);
				addColumnPathMap(MfgInstActCom_Upd04_HdrR.$mfg_mtd_typ, MfgActReg_Upd01_HdrR.$mfg_mtd_typ);
				addColumnPathMap(MfgInstActCom_Upd04_HdrR.$st_act_tm, MfgActReg_Upd01_HdrR.$st_act_tm);
				addColumnPathMap(MfgInstActCom_Upd04_HdrR.$base_unit_st_qty, MfgActReg_Upd01_HdrR.$base_unit_st_act_qty);
			}
		}
		
		protected void setYieldByProdStk() {
			// 出来高実績、副産品実績からレコードを取得し、赤伝として登録

			// バインド用に出来高実績、副産品実績の出来高実績ＮＯを取得
			MCList<MST_YIELD_ACT_R> bindL = MCList.create(MST_YIELD_ACT_R.class);
			for (MfgActReg_Upd01_DtlYieldR r : up5()) {
				MST_YIELD_ACT_R bindR = MST_YIELD_ACT_R.create();
				bindR.yield_act_no(r.yield_act_no());
				bindL.add(bindR);
			}
			for (MfgActReg_Upd01_DtlByProdR r :up6()) {
				MST_YIELD_ACT_R bindR = MST_YIELD_ACT_R.create();
				bindR.yield_act_no(r.yield_act_no());
				bindL.add(bindR);
			}
			
			// 出来高実績ＮＯから出来高実績データを取得
			MCList<MST_YIELD_ACT_R> dbL = MCList.create(MST_YIELD_ACT_R.class);
			MST_YIELD_ACT_R t = MST_YIELD_ACT_R.create("T");
			MCQueryApiBuilder dbL_bldr = MCQueryApiBuilder.create(t);
			MAVM_ITM_UNIT_R m1 = MAVM_ITM_UNIT_R.create("M1");
			dbL_bldr.addSelect(m1.pack_flg);
			dbL.addBooleanColumn("PACK_FLG");
			dbL_bldr.addLeftOuterJoin(m1, bracket(t.itm_cd.eq(m1.itm_cd)
					.and(t.itm_sub1.eq(m1.itm_sub1))
					.and(t.itm_sub2.eq(m1.itm_sub2))
					.and(t.itm_sub3.eq(m1.itm_sub3))
					.and(t.trd_unit_cd.eq(m1.unit_cd))));
			dbL_bldr.addWhereWithAnd(t.not_stk_flg.eq(value(false)));
			dbL_bldr.addWhereWithAnd(t.mfg_mtd_typ.eq(bind("1")),
					MSC_MFG_MTD_TYP.INTNL.value());
			dbL_bldr.addWhereWithAnd(t.yield_act_no.eq(bind("yield_act_no")));
			dbSelect("MSBCL6050_MST_YIELD_ACT_S07",
					dbL, dbL_bldr, bindL.groupBy(MST_YIELD_ACT_R.$yield_act_no));

			for (MST_YIELD_ACT_R dbR : dbL) {
				if (MAC_YIELD_TYP.isBYPROD(dbR.yield_typ())) {
					MfgActTblReg_Upd04_DtlByProdR byProdR = MfgActTblReg_Upd04_DtlByProdR.create();
					copy(byProdR, dbR, createMap_MfgActTblReg_Upd04_DtlByProdR_MST_YIELD_ACT_R());
					matUpd04.up3().add(byProdR);
				}
				else {
					MfgActTblReg_Upd04_DtlYieldR yieldR = MfgActTblReg_Upd04_DtlYieldR.create();
					copy(yieldR, dbR, createMap_MfgActTblReg_Upd04_DtlYieldR_MST_YIELD_ACT_R());
					matUpd04.up2().add(yieldR);
				}
			}
		}
		
		protected Map_MfgActTblReg_Upd04_DtlYieldR_MST_YIELD_ACT_R<MfgActTblReg_Upd04_DtlYieldR,MST_YIELD_ACT_R> createMap_MfgActTblReg_Upd04_DtlYieldR_MST_YIELD_ACT_R() {
			return new Map_MfgActTblReg_Upd04_DtlYieldR_MST_YIELD_ACT_R<MfgActTblReg_Upd04_DtlYieldR, MST_YIELD_ACT_R>();
		}

		public class Map_MfgActTblReg_Upd04_DtlYieldR_MST_YIELD_ACT_R<D extends MfgActTblReg_Upd04_DtlYieldR, S extends MST_YIELD_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActTblReg_Upd04_DtlYieldR.$mfg_mtd_typ, MST_YIELD_ACT_R.$mfg_mtd_typ);
				addColumnPathMap(MfgActTblReg_Upd04_DtlYieldR.$yield_act_no, MST_YIELD_ACT_R.$yield_act_no);
				addColumnPathMap(MfgActTblReg_Upd04_DtlYieldR.$itm_cd, MST_YIELD_ACT_R.$itm_cd);
				addColumnPathMap(MfgActTblReg_Upd04_DtlYieldR.$itm_sub1, MST_YIELD_ACT_R.$itm_sub1);
				addColumnPathMap(MfgActTblReg_Upd04_DtlYieldR.$itm_sub2, MST_YIELD_ACT_R.$itm_sub2);
				addColumnPathMap(MfgActTblReg_Upd04_DtlYieldR.$itm_sub3, MST_YIELD_ACT_R.$itm_sub3);
				addColumnPathMap(MfgActTblReg_Upd04_DtlYieldR.$loc_cd, MST_YIELD_ACT_R.$strg_loc_cd);
				addColumnPathMap(MfgActTblReg_Upd04_DtlYieldR.$str_ln_cd, MST_YIELD_ACT_R.$strg_str_ln_cd);
				addColumnPathMap(MfgActTblReg_Upd04_DtlYieldR.$lot_no, MST_YIELD_ACT_R.$lot_no);
				addColumnPathMap(MfgActTblReg_Upd04_DtlYieldR.$sublot_no, MST_YIELD_ACT_R.$sublot_no);
				addColumnPathMap(MfgActTblReg_Upd04_DtlYieldR.$sno1, MST_YIELD_ACT_R.$sno1);
				addColumnPathMap(MfgActTblReg_Upd04_DtlYieldR.$sno2, MST_YIELD_ACT_R.$sno2);
				addColumnPathMap(MfgActTblReg_Upd04_DtlYieldR.$sno3, MST_YIELD_ACT_R.$sno3);
				addColumnPathMap(MfgActTblReg_Upd04_DtlYieldR.$sno4, MST_YIELD_ACT_R.$sno4);
				addColumnPathMap(MfgActTblReg_Upd04_DtlYieldR.$quality_typ, MST_YIELD_ACT_R.$quality_typ);
				addColumnPathMap(MfgActTblReg_Upd04_DtlYieldR.$gd_cd, MST_YIELD_ACT_R.$gd_cd);
				addColumnPathMap(MfgActTblReg_Upd04_DtlYieldR.$trd_unit_cd, MST_YIELD_ACT_R.$trd_unit_cd);
				addColumnPathMap(MfgActTblReg_Upd04_DtlYieldR.$base_unit_cd, MST_YIELD_ACT_R.$base_unit_cd);
				addColumnPathMap(MfgActTblReg_Upd04_DtlYieldR.$not_stk_flg, MST_YIELD_ACT_R.$not_stk_flg);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.pack_flg(src.getBoolean("PACK_FLG"));
				// 赤伝のため数値項目は符号反転
				dest.trd_unit_qty(src.trd_unit_qty().negate());
				dest.base_unit_qty(src.base_unit_qty().negate());
			}
		}

		protected Map_MfgActTblReg_Upd04_DtlByProdR_MST_YIELD_ACT_R<MfgActTblReg_Upd04_DtlByProdR,MST_YIELD_ACT_R> createMap_MfgActTblReg_Upd04_DtlByProdR_MST_YIELD_ACT_R() {
			return new Map_MfgActTblReg_Upd04_DtlByProdR_MST_YIELD_ACT_R<MfgActTblReg_Upd04_DtlByProdR, MST_YIELD_ACT_R>();
		}

		public class Map_MfgActTblReg_Upd04_DtlByProdR_MST_YIELD_ACT_R<D extends MfgActTblReg_Upd04_DtlByProdR, S extends MST_YIELD_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActTblReg_Upd04_DtlByProdR.$mfg_mtd_typ, MST_YIELD_ACT_R.$mfg_mtd_typ);
				addColumnPathMap(MfgActTblReg_Upd04_DtlByProdR.$yield_act_no, MST_YIELD_ACT_R.$yield_act_no);
				addColumnPathMap(MfgActTblReg_Upd04_DtlByProdR.$itm_cd, MST_YIELD_ACT_R.$itm_cd);
				addColumnPathMap(MfgActTblReg_Upd04_DtlByProdR.$itm_sub1, MST_YIELD_ACT_R.$itm_sub1);
				addColumnPathMap(MfgActTblReg_Upd04_DtlByProdR.$itm_sub2, MST_YIELD_ACT_R.$itm_sub2);
				addColumnPathMap(MfgActTblReg_Upd04_DtlByProdR.$itm_sub3, MST_YIELD_ACT_R.$itm_sub3);
				addColumnPathMap(MfgActTblReg_Upd04_DtlByProdR.$loc_cd, MST_YIELD_ACT_R.$strg_loc_cd);
				addColumnPathMap(MfgActTblReg_Upd04_DtlByProdR.$str_ln_cd, MST_YIELD_ACT_R.$strg_str_ln_cd);
				addColumnPathMap(MfgActTblReg_Upd04_DtlByProdR.$lot_no, MST_YIELD_ACT_R.$lot_no);
				addColumnPathMap(MfgActTblReg_Upd04_DtlByProdR.$sublot_no, MST_YIELD_ACT_R.$sublot_no);
				addColumnPathMap(MfgActTblReg_Upd04_DtlByProdR.$sno1, MST_YIELD_ACT_R.$sno1);
				addColumnPathMap(MfgActTblReg_Upd04_DtlByProdR.$sno2, MST_YIELD_ACT_R.$sno2);
				addColumnPathMap(MfgActTblReg_Upd04_DtlByProdR.$sno3, MST_YIELD_ACT_R.$sno3);
				addColumnPathMap(MfgActTblReg_Upd04_DtlByProdR.$sno4, MST_YIELD_ACT_R.$sno4);
				addColumnPathMap(MfgActTblReg_Upd04_DtlByProdR.$quality_typ, MST_YIELD_ACT_R.$quality_typ);
				addColumnPathMap(MfgActTblReg_Upd04_DtlByProdR.$gd_cd, MST_YIELD_ACT_R.$gd_cd);
				addColumnPathMap(MfgActTblReg_Upd04_DtlByProdR.$trd_unit_cd, MST_YIELD_ACT_R.$trd_unit_cd);
				addColumnPathMap(MfgActTblReg_Upd04_DtlByProdR.$base_unit_cd, MST_YIELD_ACT_R.$base_unit_cd);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.pack_flg(src.getBoolean("PACK_FLG"));
				// 赤伝のため数値項目は符号反転
				dest.trd_unit_qty(src.trd_unit_qty().negate());
				dest.base_unit_qty(src.base_unit_qty().negate());
			}
		}
		
		protected void callActRemUpdSrv() {
			// 各実績残テーブルの更新
			MSBCL_MfgInstActComService.MfgInstActCom_Upd08 o = MSBCL_MfgInstActComService
					.crtMfgInstActCom_Upd08();
			addAll(o.up1(), up0(), createMap_MfgInstActCom_Upd08_HdrR_MfgActReg_Upd01_HdrR());
			addAll(o.up2(), up1(), createMap_MfgInstActCom_Upd08_DtlOperR_MfgActReg_Upd01_DtlOperR());
			addAll(o.up3(), up5(), createMap_MfgInstActCom_Upd08_DtlYieldR_MfgActReg_Upd01_DtlYieldR());
			addAll(o.up4(), up2(), createMap_MfgInstActCom_Upd08_DtlInptR_MfgActReg_Upd01_DtlInptR());
			addAll(o.up5(), up4(), createMap_MfgInstActCom_Upd08_DtlWkR_MfgActReg_Upd01_DtlWkR());
			addAll(o.up6(), up6(), createMap_MfgInstActCom_Upd08_DtlYieldR_MfgActReg_Upd01_DtlByProdR());
			o.exec();
			copyByPegNo(up0(), new String[] {
					MfgActReg_Upd01_HdrR.$all_inpt_cmpl_flg
			}, o.down0(), new String[] {
					MfgInstActCom_Upd08_HdrR.$all_inpt_cmpl_flg
			});
			
			// 製造承認状況区分の設定
			for (MfgActReg_Upd01_HdrR hdrR : up0()) {
				if (hdrR.aprv_flg()) {
					if (hdrR.is_src_outsrc_srv_flg() && _mfgLocCache.getEx(hdrR.mfg_loc_cd()).pre_outsrc_act_flg()) {
						continue;
					}
					hdrR.aprv_rsn(null);
					if (MSC_MFG_STS_TYP.isCMPL(hdrR.mfg_sts_typ()) && hdrR.all_inpt_cmpl_flg()) {
						//承認対象ＦＬＧがfalseなら常にnull。Trueなら製造状況区分が完了かつ、投入も全完了（あるいは投入予定が存在しない）場合、記録未承認に設定する。
						//それ以外の場合は、指図承認済
						hdrR.mfg_aprv_sts_typ(MSC_MFG_APRV_STS_TYP.ACT_OPN.value());
					}
					else {
						hdrR.mfg_aprv_sts_typ(MSC_MFG_APRV_STS_TYP.INST_ACPT.value());
					}
				}
				else {
					hdrR.mfg_aprv_sts_typ(null);
				}
			}
		}
		
		protected Map_MfgInstActCom_Upd08_HdrR_MfgActReg_Upd01_HdrR<MfgInstActCom_Upd08_HdrR,MfgActReg_Upd01_HdrR> createMap_MfgInstActCom_Upd08_HdrR_MfgActReg_Upd01_HdrR() {
			return new Map_MfgInstActCom_Upd08_HdrR_MfgActReg_Upd01_HdrR<MfgInstActCom_Upd08_HdrR, MfgActReg_Upd01_HdrR>();
		}

		public class Map_MfgInstActCom_Upd08_HdrR_MfgActReg_Upd01_HdrR<D extends MfgInstActCom_Upd08_HdrR, S extends MfgActReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Upd08_HdrR.$peg_no, MfgActReg_Upd01_HdrR.$peg_no);
				addColumnPathMap(MfgInstActCom_Upd08_HdrR.$data_crud_typ, MfgActReg_Upd01_HdrR.$data_crud_typ);
				addColumnPathMap(MfgInstActCom_Upd08_HdrR.$mfg_inst_no, MfgActReg_Upd01_HdrR.$mfg_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_HdrR.$div_seq, MfgActReg_Upd01_HdrR.$div_seq);
				addColumnPathMap(MfgInstActCom_Upd08_HdrR.$mfg_act_no, MfgActReg_Upd01_HdrR.$mfg_act_no);
				addColumnPathMap(MfgInstActCom_Upd08_HdrR.$mfg_mtd_typ, MfgActReg_Upd01_HdrR.$mfg_mtd_typ);
				addColumnPathMap(MfgInstActCom_Upd08_HdrR.$mfg_sts_typ, MfgActReg_Upd01_HdrR.$mfg_sts_typ);
				addColumnPathMap(MfgInstActCom_Upd08_HdrR.$st_act_tm, MfgActReg_Upd01_HdrR.$st_act_tm);
				addColumnPathMap(MfgInstActCom_Upd08_HdrR.$end_act_tm, MfgActReg_Upd01_HdrR.$end_act_tm);
				addColumnPathMap(MfgInstActCom_Upd08_HdrR.$base_unit_yield_qty, MfgActReg_Upd01_HdrR.$base_unit_yield_qty);
				addColumnPathMap(MfgInstActCom_Upd08_HdrR.$base_unit_dfct_qty, MfgActReg_Upd01_HdrR.$base_unit_dfct_qty);
				addColumnPathMap(MfgInstActCom_Upd08_HdrR.$abort_flg, MfgActReg_Upd01_HdrR.$rem_abort_flg);
			}
		}

		protected Map_MfgInstActCom_Upd08_DtlOperR_MfgActReg_Upd01_DtlOperR<MfgInstActCom_Upd08_DtlOperR,MfgActReg_Upd01_DtlOperR> createMap_MfgInstActCom_Upd08_DtlOperR_MfgActReg_Upd01_DtlOperR() {
			return new Map_MfgInstActCom_Upd08_DtlOperR_MfgActReg_Upd01_DtlOperR<MfgInstActCom_Upd08_DtlOperR, MfgActReg_Upd01_DtlOperR>();
		}

		public class Map_MfgInstActCom_Upd08_DtlOperR_MfgActReg_Upd01_DtlOperR<D extends MfgInstActCom_Upd08_DtlOperR, S extends MfgActReg_Upd01_DtlOperR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Upd08_DtlOperR.$data_crud_typ, MfgActReg_Upd01_DtlOperR.$data_crud_typ);
				addColumnPathMap(MfgInstActCom_Upd08_DtlOperR.$oper_act_no, MfgActReg_Upd01_DtlOperR.$oper_act_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlOperR.$oper_inst_no, MfgActReg_Upd01_DtlOperR.$oper_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlOperR.$div_seq, MfgActReg_Upd01_DtlOperR.$div_seq);
				addColumnPathMap(MfgInstActCom_Upd08_DtlOperR.$mfg_inst_no, MfgActReg_Upd01_DtlOperR.$mfg_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlOperR.$itm_mfg_inst_no, MfgActReg_Upd01_DtlOperR.$itm_mfg_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlOperR.$st_act_dt, MfgActReg_Upd01_DtlOperR.$st_act_tm);
				addColumnPathMap(MfgInstActCom_Upd08_DtlOperR.$end_act_dt, MfgActReg_Upd01_DtlOperR.$end_act_tm);
				addColumnPathMap(MfgInstActCom_Upd08_DtlOperR.$not_cmpl_flg, MfgActReg_Upd01_DtlOperR.$not_cmpl_flg);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.base_unit_qty(convQtyOperToBase(src.oper_unit_act_qty(), src.oper_conv_qty(),
						src.oper_std_qty(), src.base_unit_dec_place(), src.base_unit_conv_rnd_typ(),
						src.base_unit_cd(), src.oper_unit_cd()));
			}
		}

		protected Map_MfgInstActCom_Upd08_DtlYieldR_MfgActReg_Upd01_DtlYieldR<MfgInstActCom_Upd08_DtlYieldR,MfgActReg_Upd01_DtlYieldR> createMap_MfgInstActCom_Upd08_DtlYieldR_MfgActReg_Upd01_DtlYieldR() {
			return new Map_MfgInstActCom_Upd08_DtlYieldR_MfgActReg_Upd01_DtlYieldR<MfgInstActCom_Upd08_DtlYieldR, MfgActReg_Upd01_DtlYieldR>();
		}

		public class Map_MfgInstActCom_Upd08_DtlYieldR_MfgActReg_Upd01_DtlYieldR<D extends MfgInstActCom_Upd08_DtlYieldR, S extends MfgActReg_Upd01_DtlYieldR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Upd08_DtlYieldR.$data_crud_typ, MfgActReg_Upd01_DtlYieldR.$data_crud_typ);
				addColumnPathMap(MfgInstActCom_Upd08_DtlYieldR.$yield_act_no, MfgActReg_Upd01_DtlYieldR.$yield_act_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlYieldR.$yield_schd_no, MfgActReg_Upd01_DtlYieldR.$yield_schd_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlYieldR.$div_seq, MfgActReg_Upd01_DtlYieldR.$div_seq);
				addColumnPathMap(MfgInstActCom_Upd08_DtlYieldR.$mfg_inst_no, MfgActReg_Upd01_DtlYieldR.$mfg_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlYieldR.$itm_mfg_inst_no, MfgActReg_Upd01_DtlYieldR.$itm_mfg_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlYieldR.$oper_inst_no, MfgActReg_Upd01_DtlYieldR.$oper_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlYieldR.$trd_unit_yield_qty, MfgActReg_Upd01_DtlYieldR.$trd_unit_yield_act_qty);
				addColumnPathMap(MfgInstActCom_Upd08_DtlYieldR.$base_unit_yield_qty, MfgActReg_Upd01_DtlYieldR.$base_unit_yield_act_qty);
				addColumnPathMap(MfgInstActCom_Upd08_DtlYieldR.$trd_unit_cd, MfgActReg_Upd01_DtlYieldR.$trd_unit_cd);
				addColumnPathMap(MfgInstActCom_Upd08_DtlYieldR.$abort_flg, MfgActReg_Upd01_DtlYieldR.$abort_flg);
			}
		}

		protected Map_MfgInstActCom_Upd08_DtlInptR_MfgActReg_Upd01_DtlInptR<MfgInstActCom_Upd08_DtlInptR,MfgActReg_Upd01_DtlInptR> createMap_MfgInstActCom_Upd08_DtlInptR_MfgActReg_Upd01_DtlInptR() {
			return new Map_MfgInstActCom_Upd08_DtlInptR_MfgActReg_Upd01_DtlInptR<MfgInstActCom_Upd08_DtlInptR, MfgActReg_Upd01_DtlInptR>();
		}

		public class Map_MfgInstActCom_Upd08_DtlInptR_MfgActReg_Upd01_DtlInptR<D extends MfgInstActCom_Upd08_DtlInptR, S extends MfgActReg_Upd01_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$data_crud_typ, MfgActReg_Upd01_DtlInptR.$data_crud_typ);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$inpt_act_no, MfgActReg_Upd01_DtlInptR.$inpt_act_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$inpt_schd_no, MfgActReg_Upd01_DtlInptR.$inpt_schd_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$div_seq, MfgActReg_Upd01_DtlInptR.$div_seq);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$mfg_inst_no, MfgActReg_Upd01_DtlInptR.$mfg_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$itm_mfg_inst_no, MfgActReg_Upd01_DtlInptR.$itm_mfg_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$oper_inst_no, MfgActReg_Upd01_DtlInptR.$oper_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$base_unit_inpt_qty, MfgActReg_Upd01_DtlInptR.$base_unit_inpt_qty);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$base_unit_fxd_rqmt_qty, MfgActReg_Upd01_DtlInptR.$fxd_loss_qty);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$cont_inpt_qty, MfgActReg_Upd01_DtlInptR.$cont_inpt_qty);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$cont_fxd_rqmt_qty, MfgActReg_Upd01_DtlInptR.$cont_fxd_loss_qty);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$act_cont_fctr, MfgActReg_Upd01_DtlInptR.$act_cont_fctr);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$abort_flg, MfgActReg_Upd01_DtlInptR.$abort_flg);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$lst_reg_flg, MfgActReg_Upd01_DtlInptR.$lst_reg_flg);
				addColumnPathMap(MfgInstActCom_Upd08_DtlInptR.$is_src_batch_flg, MfgActReg_Upd01_DtlInptR.$is_src_batch_flg);
			}
		}

		protected Map_MfgInstActCom_Upd08_DtlWkR_MfgActReg_Upd01_DtlWkR<MfgInstActCom_Upd08_DtlWkR,MfgActReg_Upd01_DtlWkR> createMap_MfgInstActCom_Upd08_DtlWkR_MfgActReg_Upd01_DtlWkR() {
			return new Map_MfgInstActCom_Upd08_DtlWkR_MfgActReg_Upd01_DtlWkR<MfgInstActCom_Upd08_DtlWkR, MfgActReg_Upd01_DtlWkR>();
		}

		public class Map_MfgInstActCom_Upd08_DtlWkR_MfgActReg_Upd01_DtlWkR<D extends MfgInstActCom_Upd08_DtlWkR, S extends MfgActReg_Upd01_DtlWkR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Upd08_DtlWkR.$data_crud_typ, MfgActReg_Upd01_DtlWkR.$data_crud_typ);
				addColumnPathMap(MfgInstActCom_Upd08_DtlWkR.$wk_act_no, MfgActReg_Upd01_DtlWkR.$wk_act_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlWkR.$wk_schd_no, MfgActReg_Upd01_DtlWkR.$wk_schd_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlWkR.$div_seq, MfgActReg_Upd01_DtlWkR.$div_seq);
				addColumnPathMap(MfgInstActCom_Upd08_DtlWkR.$mfg_inst_no, MfgActReg_Upd01_DtlWkR.$mfg_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlWkR.$itm_mfg_inst_no, MfgActReg_Upd01_DtlWkR.$itm_mfg_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlWkR.$oper_inst_no, MfgActReg_Upd01_DtlWkR.$oper_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlWkR.$act_wk_cost, MfgActReg_Upd01_DtlWkR.$act_wk_cost);
				addColumnPathMap(MfgInstActCom_Upd08_DtlWkR.$abort_flg, MfgActReg_Upd01_DtlWkR.$abort_flg);
			}
		}

		protected Map_MfgInstActCom_Upd08_DtlYieldR_MfgActReg_Upd01_DtlByProdR<MfgInstActCom_Upd08_DtlYieldR,MfgActReg_Upd01_DtlByProdR> createMap_MfgInstActCom_Upd08_DtlYieldR_MfgActReg_Upd01_DtlByProdR() {
			return new Map_MfgInstActCom_Upd08_DtlYieldR_MfgActReg_Upd01_DtlByProdR<MfgInstActCom_Upd08_DtlYieldR, MfgActReg_Upd01_DtlByProdR>();
		}

		public class Map_MfgInstActCom_Upd08_DtlYieldR_MfgActReg_Upd01_DtlByProdR<D extends MfgInstActCom_Upd08_DtlYieldR, S extends MfgActReg_Upd01_DtlByProdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Upd08_DtlYieldR.$yield_act_no, MfgActReg_Upd01_DtlByProdR.$yield_act_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlYieldR.$yield_schd_no, MfgActReg_Upd01_DtlByProdR.$yield_schd_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlYieldR.$div_seq, MfgActReg_Upd01_DtlByProdR.$div_seq);
				addColumnPathMap(MfgInstActCom_Upd08_DtlYieldR.$mfg_inst_no, MfgActReg_Upd01_DtlByProdR.$mfg_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlYieldR.$itm_mfg_inst_no, MfgActReg_Upd01_DtlByProdR.$itm_mfg_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlYieldR.$oper_inst_no, MfgActReg_Upd01_DtlByProdR.$oper_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlYieldR.$trd_unit_yield_qty, MfgActReg_Upd01_DtlByProdR.$trd_unit_yield_act_qty);
				addColumnPathMap(MfgInstActCom_Upd08_DtlYieldR.$base_unit_yield_qty, MfgActReg_Upd01_DtlByProdR.$base_unit_yield_act_qty);
				addColumnPathMap(MfgInstActCom_Upd08_DtlYieldR.$data_crud_typ, MfgActReg_Upd01_DtlByProdR.$data_crud_typ);
				addColumnPathMap(MfgInstActCom_Upd08_DtlYieldR.$trd_unit_cd, MfgActReg_Upd01_DtlByProdR.$trd_unit_cd);
				addColumnPathMap(MfgInstActCom_Upd08_DtlYieldR.$abort_flg, MfgActReg_Upd01_DtlByProdR.$abort_flg);
			}
		}
		
		protected void editHdrContAftrInptReg(MCList<MfgActTblReg_Upd04_HdrR> inptRegHdrDownL) {
			for (MfgActTblReg_Upd04_HdrR inptRegHdrDownR : inptRegHdrDownL) {
				MfgActReg_Upd01_HdrR hdrR = _hdrCache.getCache(inptRegHdrDownR.hdr_peg_no());
				hdrR.bkf_tgt_cnt(inptRegHdrDownR.bkf_tgt_cnt());
				hdrR.bkf_success_cnt(inptRegHdrDownR.bkf_success_cnt());
				hdrR.bkf_failure_cnt(inptRegHdrDownR.bkf_failure_cnt());
			}
		}
		
		protected void editOperContAftrInptReg(MCList<MfgActTblReg_Upd04_DtlOperR> inptRegOperDownL) {
			for (MfgActTblReg_Upd04_DtlOperR inptRegOperDownR : inptRegOperDownL) {
				MfgActReg_Upd01_DtlOperR operR = _operCache.getCache(inptRegOperDownR.oper_peg_no());
				operR.bkf_tgt_cnt(inptRegOperDownR.bkf_tgt_cnt());
				operR.bkf_success_cnt(inptRegOperDownR.bkf_success_cnt());
				operR.bkf_failure_cnt(inptRegOperDownR.bkf_failure_cnt());
				
				if (!isNull(inptRegOperDownR.bkf_tgt_cnt()) && !inptRegOperDownR.bkf_tgt_cnt().isZero()) {
					if (!inptRegOperDownR.bkf_failure_cnt().isZero()) {
						operR.bkf_not_ref_flg(true);
					}
				}
			}
		}
		
		protected void editInptAndLossContAftrInptReg(
				MCList<MfgActTblReg_Upd04_DtlInptR> inptRegDownL) {
			MCIndexKey inptRegDownIdxkey = inptRegDownL.createIndex(MfgActTblReg_Upd04_DtlInptR.$peg_no);
			MCIndexKey lossUpIdxkey = up3().createIndex(MfgActReg_Upd01_DtlLossR.$inpt_peg_no);
			
			MCList<MfgActReg_Upd01_DtlInptR> replaceInptUpL = MCList.create(MfgActReg_Upd01_DtlInptR.class);
			MCList<MfgActReg_Upd01_DtlLossR> replaceLossUpL = MCList.create(MfgActReg_Upd01_DtlLossR.class);
			MCList<MfgActReg_Upd01_DtlInptR> failureInptUpL = MCList.create(MfgActReg_Upd01_DtlInptR.class);
			for (MfgActReg_Upd01_DtlInptR inptR : up2()) {
				// 代替品の場合、投入やロスのデータ更新区分が、MSBCL6060のUpd04において削除に変わる場合がある。よって、データ更新区分を置き換える
				MCList<MfgActReg_Upd01_DtlLossR> lossSubL = up3().subList(lossUpIdxkey, inptR.peg_no());
				
				MfgActTblReg_Upd04_DtlInptR inptRegInptDownR = inptRegDownL.getFirst(inptRegDownIdxkey, inptR.peg_no());
				if (!inptRegInptDownR.inpt_act_reg_skip_flg()) {
					if (MAC_DATA_CRUD_TYP.isDEL(inptRegInptDownR.data_crud_typ())) {
						inptR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					}
					else {
						inptR.ver_no(inptRegInptDownR.ver_no());
					}
					replaceInptUpL.add(inptR);
					
					for (MfgActReg_Upd01_DtlLossR lossR : lossSubL) {
						if (MAC_DATA_CRUD_TYP.isDEL(inptRegInptDownR.data_crud_typ())) {
							lossR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						}
						replaceLossUpL.add(lossR);
					}
				}
				else {
					// 投入実績登録スキップは「バックフラッシュに失敗した場合」または「代替品目指定がオフの場合」にオンになる
					// このうち、「バックフラッシュに失敗した場合」は、同一投入予定ＮＯ、分割連番に紐付く投入実績の打切フラグをオフにする必要がある
					// ※バックフラッシュ失敗により全数投入できないにもかからわず打切されてしまうのを防ぐ
					
					// バックフラッシュが失敗したのかどうか、工程実績のバックフラッシュ未反映フラグで判断する（オンの場合は失敗）
					MfgActReg_Upd01_DtlOperR operR = _operCache.getCache(inptR.oper_peg_no());
					if (operR.bkf_not_ref_flg()) {
						failureInptUpL.add(inptR);
					}
				}
			}
			// バックフラッシュに失敗した投入が存在する場合、同じ投入予定ＮＯ、分割連番の投入の打切フラグをオフにする
			if (!failureInptUpL.isEmpty()) {
				MCIndexKey replaceInptUpKey = replaceInptUpL.createIndex(
						MfgActReg_Upd01_DtlInptR.$inpt_schd_no,
						MfgActReg_Upd01_DtlInptR.$div_seq);

				for (MfgActReg_Upd01_DtlInptR failureInptUpR : failureInptUpL) {
					MCList<MfgActReg_Upd01_DtlInptR> subReplaceInptUpL = replaceInptUpL
							.subList(replaceInptUpKey, failureInptUpR.inpt_schd_no(),
									failureInptUpR.div_seq());
					if (!subReplaceInptUpL.isEmpty()) {
						subReplaceInptUpL.setBoolean(MfgActReg_Upd01_DtlInptR.$abort_flg, false);
					}
				}
			}
			// 登録対象外となった行は上り電文から除くする
			up2().setAll(replaceInptUpL);
			up3().setAll(replaceLossUpL);
		}
		/**
		 * ヘッダに紐付く投入のロット提案が１件でも失敗している場合、そのヘッダに紐付く工程・投入・工数をすべて登録対象外とする
		 * 一括実行でない＆呼出元バッチ処理の場合（MES-Linkから投入・工数実績を登録する場合を想定）のみ実行される
		 * @param inptRegHdrDownL
		 */
		protected void removeBkfFailueAct(MCList<MfgActTblReg_Upd04_HdrR> inptRegHdrDownL) {
			// 一括実行でない＆呼出元バッチ処理かどうかを判断する（混在しないので１件目のみチェックすればよい）
			MfgActReg_Upd01_HdrR up0R = up0().get(0);
			if (up0R.lst_reg_flg() || !up0R.is_src_batch_flg()) {
				return;
			}
			
			// ロット提案に失敗したヘッダ紐付けＮＯを抽出
			Set<MCNumber> failPegNo = new HashSet<MCNumber>();
			for (MfgActTblReg_Upd04_HdrR inptRegHdrDownR : inptRegHdrDownL) {
				if (!isNull(inptRegHdrDownR.bkf_failure_cnt()) && !inptRegHdrDownR.bkf_failure_cnt().isZero()) {
					failPegNo.add(inptRegHdrDownR.hdr_peg_no());
				}
			}
			if (failPegNo.isEmpty()) {
				return;
			}
			
			// 各上り電文からエラーしたヘッダ紐付けＮＯに対するレコードを除外する
			MCList<MfgActReg_Upd01_HdrR> up0L = MCList.create(MfgActReg_Upd01_HdrR.class);
			MCList<MfgActReg_Upd01_DtlOperR> up1L = MCList.create(MfgActReg_Upd01_DtlOperR.class);
			MCList<MfgActReg_Upd01_DtlInptR> up2L = MCList.create(MfgActReg_Upd01_DtlInptR.class);
			MCList<MfgActReg_Upd01_DtlLossR> up3L = MCList.create(MfgActReg_Upd01_DtlLossR.class);
			MCList<MfgActReg_Upd01_DtlWkR> up4L = MCList.create(MfgActReg_Upd01_DtlWkR.class);
			MCList<MfgActReg_Upd01_DtlYieldR> up5L = MCList.create(MfgActReg_Upd01_DtlYieldR.class);
			MCList<MfgActReg_Upd01_DtlByProdR> up6L = MCList.create(MfgActReg_Upd01_DtlByProdR.class);
			//前処理で作成した残テーブルを削除するレコード
			MCList<MfgActReg_Upd01_HdrR> up0L_rem = MCList.create(MfgActReg_Upd01_HdrR.class);
			
			MCList<MST_INPT_SCHD_R> inptSchdL = MCList.create(MST_INPT_SCHD_R.class);
			MCList<MST_YIELD_SCHD_R> yieldSchdL = MCList.create(MST_YIELD_SCHD_R.class);
			
			// ヘッダ
			for (MfgActReg_Upd01_HdrR r : up0()) {
				if (failPegNo.contains(r.peg_no())) {
					// 処理結果を「エラー」にして、上り電文からの除外対象とする
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
					up0L.add(r);

					// 投入予定
					inptSchdL.addAll(_cacheInptSchd.subList(_idxInptSchdCache, r.mfg_inst_no()));
					// 出来高・副産品予定
					yieldSchdL.addAll(_cacheYieldSchd.subList(_idxYieldSchdCache, r.mfg_inst_no()));

					// 下り電文に設定するためのリストに追加（処理結果を下らせるため）
					_removeHdrL.add(r);
					
					if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
						up0L_rem.add(r);
					}
				}
			}
			// 工程
			for (MfgActReg_Upd01_DtlOperR r : up1()) {
				if (failPegNo.contains(r.hdr_peg_no())) {
					up1L.add(r);
				}
			}
			// 投入
			MCIndexKey idx = up3().createIndex(MfgActReg_Upd01_DtlLossR.$inpt_peg_no);
			for (MfgActReg_Upd01_DtlInptR r : up2()) {
				if (failPegNo.contains(r.hdr_peg_no())) {
					up2L.add(r);
					// ロス
					for (MfgActReg_Upd01_DtlLossR lossR : up3().subList(idx, r.peg_no())) {
						up3L.add(lossR);
					}
				}
			}
			// 工数
			for (MfgActReg_Upd01_DtlWkR r : up4()) {
				if (failPegNo.contains(r.hdr_peg_no())) {
					up4L.add(r);
				}
			}
			// 出来高　※MES-Linkから投入・工数を登録する場合を想定しているため、出来高は発生しないはず
			for (MfgActReg_Upd01_DtlYieldR r : up5()) {
				if (failPegNo.contains(r.peg_no())) {
					up5L.add(r);
				}
			}
			// 副産品　※出来高と同様の理由で、副産品も発生しないはず
			for (MfgActReg_Upd01_DtlByProdR r : up6()) {
				if (failPegNo.contains(r.peg_no())) {
					up6L.add(r);
				}
			}
			
			up0().removeAll(up0L);
			up1().removeAll(up1L);
			up2().removeAll(up2L);
			up3().removeAll(up3L);
			up4().removeAll(up4L);
			up5().removeAll(up5L);
			up6().removeAll(up6L);

			MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd09 inptOpe = MSBCL_MfgInstTblRegService
					.crtMfgInstTblReg_Upd09();
			MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd10 yieldByProdOpe = MSBCL_MfgInstTblRegService
					.crtMfgInstTblReg_Upd10();
			
			// 投入の受払予定の再作成
			addAll(inptOpe.up0(), inptSchdL, createMap_MfgInstTblReg_Upd09_DtlInptR_MstInptSchdR());
			
			// 出来高・副産品の受払予定の再作成
			addAll(yieldByProdOpe.up0(), yieldSchdL, createMap_MfgInstTblReg_Upd10_DtlYieldR_MstYieldSchdR());
			
			if (!inptOpe.up0().isEmpty()) {
				inptOpe.exec();
			}
			if (!yieldByProdOpe.up0().isEmpty()) {
				yieldByProdOpe.exec();
			}

			MST_MFG_ACT_REM_R t = MST_MFG_ACT_REM_R.create("T");
			MST_OPER_ACT_REM_R t1 = MST_OPER_ACT_REM_R.create("T");
			MST_INPT_ACT_REM_R t2 = MST_INPT_ACT_REM_R.create("T");
			MST_WK_ACT_REM_R t3 = MST_WK_ACT_REM_R.create("T");
			MST_YIELD_ACT_REM_R t4 = MST_YIELD_ACT_REM_R.create("T");
			execDbDelete("MSBCL6050_MST_MFG_ACT_REM_D01", t, t.mfg_inst_no.eq(bind("mfg_inst_no")).and(t.div_seq.eq(bind("div_seq"))), up0L_rem);
			execDbDelete("MSBCL6050_MST_OPER_ACT_REM_D01", t1, t1.mfg_inst_no.eq(bind("mfg_inst_no")).and(t1.div_seq.eq(bind("div_seq"))), up0L_rem);
			execDbDelete("MSBCL6050_MST_INPT_ACT_REM_D01", t2, t2.mfg_inst_no.eq(bind("mfg_inst_no")).and(t2.div_seq.eq(bind("div_seq"))), up0L_rem);
			execDbDelete("MSBCL6050_MST_WK_ACT_REM_D01", t3, t3.mfg_inst_no.eq(bind("mfg_inst_no")).and(t3.div_seq.eq(bind("div_seq"))), up0L_rem);
			execDbDelete("MSBCL6050_MST_YIELD_ACT_REM_D01", t4, t4.mfg_inst_no.eq(bind("mfg_inst_no")).and(t4.div_seq.eq(bind("div_seq"))), up0L_rem);
		}
		
		protected Map_MfgInstTblReg_Upd09_DtlInptR_MstInptSchdR<MfgInstTblReg_Upd09_DtlInptR, MST_INPT_SCHD_R> createMap_MfgInstTblReg_Upd09_DtlInptR_MstInptSchdR() {
			return new Map_MfgInstTblReg_Upd09_DtlInptR_MstInptSchdR<MfgInstTblReg_Upd09_DtlInptR, MST_INPT_SCHD_R>();
		}

		public class Map_MfgInstTblReg_Upd09_DtlInptR_MstInptSchdR<D extends MfgInstTblReg_Upd09_DtlInptR, S extends MST_INPT_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstTblReg_Upd09_DtlInptR.$inpt_schd_no, MST_INPT_SCHD_R.$inpt_schd_no);
			}
		}

		protected Map_MfgInstTblReg_Upd10_DtlYieldR_MstYieldSchdR<MfgInstTblReg_Upd10_DtlYieldR, MST_YIELD_SCHD_R> createMap_MfgInstTblReg_Upd10_DtlYieldR_MstYieldSchdR() {
			return new Map_MfgInstTblReg_Upd10_DtlYieldR_MstYieldSchdR<MfgInstTblReg_Upd10_DtlYieldR, MST_YIELD_SCHD_R>();
		}

		public class Map_MfgInstTblReg_Upd10_DtlYieldR_MstYieldSchdR<D extends MfgInstTblReg_Upd10_DtlYieldR, S extends MST_YIELD_SCHD_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstTblReg_Upd10_DtlYieldR.$yield_schd_no, MST_YIELD_SCHD_R.$yield_schd_no);
			}
		}

		/**
		 * 出来高実績を行削除した際の検査予定復活処理
		 */
		protected void callInspSchdSrvForDelYield() {
			MCList<MfgActReg_Upd01_DtlYieldR> delYieldL = MCList.create(MfgActReg_Upd01_DtlYieldR.class);
			// 行削除した内製の出来高実績が対象
			for (MfgActReg_Upd01_DtlYieldR r : up5()) {
				MfgActReg_Upd01_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
				if (MSC_MFG_MTD_TYP.isINTNL(hdrR.mfg_mtd_typ())
						&& MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					delYieldL.add(r);
				}
			}
			
			if (delYieldL.isEmpty()) {
				return;
			}
			
			MCList<MST_YIELD_SCHD_R> notActSchdL = MCList.create(MST_YIELD_SCHD_R.class);
			for (MST_YIELD_SCHD_R dbR : getDelYieldSchdL(delYieldL)) {
				if (isNull(dbR.getStringNE("yield_act_no"))) {
					notActSchdL.add(dbR);
				}
			}
			
			if (!notActSchdL.isEmpty()) {
				// 検査予定登録オペレーションの実行
				MSBFL_InspSchdService.InspSchd_Upd01 inspUpd = MSBFL_InspSchdService.crtInspSchd_Upd01();
				addAll(inspUpd.up0(), notActSchdL, createMap_InspSchd_Upd01_CndR_MST_YIELD_SCHD_R());
				setPegNo(inspUpd.up0());
				
				inspUpd.exec();
			}
		}
		
		protected MCList<MST_YIELD_SCHD_R> getDelYieldSchdL(MCList<MfgActReg_Upd01_DtlYieldR> delYieldL) {
			MCList<MST_YIELD_SCHD_R> ysL = MCList.create(MST_YIELD_SCHD_R.class);
			MST_YIELD_SCHD_R t = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder ysL_bldr = MCQueryApiBuilder.create(t);
			MST_ITM_MFG_INST_R t2 = MST_ITM_MFG_INST_R.create("T2");
			MST_YIELD_ACT_R t3 = MST_YIELD_ACT_R.create("T3");
			ysL_bldr.setSelect(t.mfg_inst_no);
			ysL_bldr.addSelect(t.itm_mfg_inst_no);
			ysL_bldr.addSelect(t.yield_schd_no);
			ysL_bldr.addSelect(t.itm_cd);
			ysL_bldr.addSelect(t.itm_sub1);
			ysL_bldr.addSelect(t.itm_sub2);
			ysL_bldr.addSelect(t.itm_sub3);
			ysL_bldr.addSelect(t.strg_loc_cd);
			ysL_bldr.addSelect(t.strg_str_ln_cd);
			ysL_bldr.addSelect(t.lot_no);
			ysL_bldr.addSelect(t.sublot_no);
			ysL_bldr.addSelect(t.sno1);
			ysL_bldr.addSelect(t.sno2);
			ysL_bldr.addSelect(t.sno3);
			ysL_bldr.addSelect(t.sno4);
			ysL_bldr.addSelect(t.schd_tm);
			ysL_bldr.addSelect(t.base_unit_yield_qty);
			ysL_bldr.addSelect(t.base_unit_cd);
			ysL_bldr.addSelect(t.trd_unit_yield_qty);
			ysL_bldr.addSelect(t.trd_unit_cd);
			ysL_bldr.addSelect(t.insp_cnt_rmrks);
			
			ysL_bldr.addSelect(t2.itm_ord_no);
			ysL_bldr.addSelect(t2.mfg_loc_cd);
			ysL_bldr.addSelect(t3.yield_act_no);
			
			ysL_bldr.addInnerJoin(t2, bracket( t.itm_mfg_inst_no.eq(t2.itm_mfg_inst_no)));
			ysL_bldr.addLeftOuterJoin(t3, bracket( t.yield_schd_no.eq(t3.yield_schd_no)));
			
			dbSelectKey("MSBCL6050_MST_YIELD_SCHD_S05",
					ysL, ysL_bldr, delYieldL.groupBy(MfgActReg_Upd01_DtlYieldR.$yield_schd_no));
			
			return ysL;
		}

		protected Map_InspSchd_Upd01_CndR_MST_YIELD_SCHD_R<InspSchd_Upd01_CndR,MST_YIELD_SCHD_R> createMap_InspSchd_Upd01_CndR_MST_YIELD_SCHD_R() {
			return new Map_InspSchd_Upd01_CndR_MST_YIELD_SCHD_R<InspSchd_Upd01_CndR, MST_YIELD_SCHD_R>();
		}

		public class Map_InspSchd_Upd01_CndR_MST_YIELD_SCHD_R<D extends InspSchd_Upd01_CndR, S extends MST_YIELD_SCHD_R> extends MCRowMapper<D,S>{

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Upd01_CndR.$src_no1, MST_YIELD_SCHD_R.$mfg_inst_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$src_no2, MST_YIELD_SCHD_R.$itm_mfg_inst_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$src_no3, MST_YIELD_SCHD_R.$yield_schd_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_cd, MST_YIELD_SCHD_R.$itm_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_sub1, MST_YIELD_SCHD_R.$itm_sub1);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_sub2, MST_YIELD_SCHD_R.$itm_sub2);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_sub3, MST_YIELD_SCHD_R.$itm_sub3);
				addColumnPathMap(InspSchd_Upd01_CndR.$loc_cd, MST_YIELD_SCHD_R.$strg_loc_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$str_ln_cd, MST_YIELD_SCHD_R.$strg_str_ln_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$lot_no, MST_YIELD_SCHD_R.$lot_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$sublot_no, MST_YIELD_SCHD_R.$sublot_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno1, MST_YIELD_SCHD_R.$sno1);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno2, MST_YIELD_SCHD_R.$sno2);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno3, MST_YIELD_SCHD_R.$sno3);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno4, MST_YIELD_SCHD_R.$sno4);
				addColumnPathMap(InspSchd_Upd01_CndR.$gr_tm, MST_YIELD_SCHD_R.$schd_tm);
				addColumnPathMap(InspSchd_Upd01_CndR.$base_unit_qty, MST_YIELD_SCHD_R.$base_unit_yield_qty);
				addColumnPathMap(InspSchd_Upd01_CndR.$base_unit_cd, MST_YIELD_SCHD_R.$base_unit_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$insp_cnt_rmrks, MST_YIELD_SCHD_R.$insp_cnt_rmrks);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				dest.act_flg(false); // 実績ＦＬＧはfalse
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dest.mfg_loc_cd(src.getStringNE("mfg_loc_cd"));
				dest.itm_ord_no(src.getStringNE("itm_ord_no"));
				
				dest.insp_typ(MSC_INSP_TYP.PRDCT.value());
				dest.sts_schd_flg(false); // 出来高実績を取り消した以上、検査指図は可能なのでfalse
				dest.bp_cd(MAC_STR.NULL_VAL.value());
				dest.quality_typ(MAC_QUALITY_TYP.GOOD.value());
				dest.asst_typ(MAC_ASST_TYP.CO_PROD.value());
				dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				dest.gd_cd(getDefaultFeedStkGd().gd_cd());
				dest.sppl_cd(MAC_STR.NULL_VAL.value());
				dest.maker_cd(MAC_STR.NULL_VAL.value());
				
				MCIndexKey itmUnitIdx = _cacheItmUnit.createIndex(MAVM_ITM_UNIT_R.$itm_cd,
						MAVM_ITM_UNIT_R.$itm_sub1, MAVM_ITM_UNIT_R.$itm_sub2,
						MAVM_ITM_UNIT_R.$itm_sub3, MAVM_ITM_UNIT_R.$unit_cd);
				MAVM_ITM_UNIT_R itmUnit = _cacheItmUnit.getFirst(itmUnitIdx, src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3(), src.trd_unit_cd());
				if (!isNull(itmUnit) && itmUnit.pack_flg()) {
					dest.pack_unit_qty(src.trd_unit_yield_qty());
					dest.pack_unit_cd(src.trd_unit_cd());
				} else {
					dest.pack_unit_qty(src.base_unit_yield_qty());
					dest.pack_unit_cd(src.base_unit_cd());
				}
			}
		}
		
		protected void callMainLotInf() {
			MSBCL_MfgInstActComService.MfgInstActCom_Upd02 o = MSBCL_MfgInstActComService.crtMfgInstActCom_Upd02();
			addAll(o.up0(), up0(), createMap_MfgInstActCom_Upd02_CndR_MfgActReg_Upd01_HdrR());
			o.exec();
		}
		
		protected Map_MfgInstActCom_Upd02_CndR_MfgActReg_Upd01_HdrR<MfgInstActCom_Upd02_CndR,MfgActReg_Upd01_HdrR> createMap_MfgInstActCom_Upd02_CndR_MfgActReg_Upd01_HdrR() {
			return new Map_MfgInstActCom_Upd02_CndR_MfgActReg_Upd01_HdrR<MfgInstActCom_Upd02_CndR, MfgActReg_Upd01_HdrR>();
		}

		public class Map_MfgInstActCom_Upd02_CndR_MfgActReg_Upd01_HdrR<D extends MfgInstActCom_Upd02_CndR, S extends MfgActReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Upd02_CndR.$mfg_act_no, MfgActReg_Upd01_HdrR.$mfg_act_no);
			}
		}
		
		/**
		 * 投入版切替更新サービスを実行する。
		 */
		protected void callVerChgSrv() {
			if (!isSame(getSysParm("VER_ENABLE_FLG"),"1")) {
				return;
			}

			MSBCL_VerChgUpdService.VerChg_Upd01 o = MSBCL_VerChgUpdService.crtVerChg_Upd01();

			// 投入実績情報を補完する
			MCList<MST_ITM_MFG_INST_R> wkL = MCList.create(MST_ITM_MFG_INST_R.class);
			
			for (MfgActReg_Upd01_HdrR r : up0()) {
				if (!isNull(r.itm_mfg_inst_no())) {
					MST_ITM_MFG_INST_R wkR = MST_ITM_MFG_INST_R.create();
					wkR.itm_mfg_inst_no(r.itm_mfg_inst_no());
					wkL.add(wkR);
				}
			}
			
			if (!wkL.isEmpty()) {
				MCList<MST_INPT_ACT_R> wkInptActL = MCList.create(MST_INPT_ACT_R.class);
				
				for (MfgActReg_Upd01_DtlInptR inptR : up2()) {
					MST_INPT_ACT_R wkR = MST_INPT_ACT_R.create();
					wkR.inpt_act_no(inptR.inpt_act_no());
					wkInptActL.add(wkR);
				}

				MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_ITM_MFG_INST_R.create("T"));
				dbWkDelete("MSBCL6050_MSW_ITM_MFG_INST_D01", wkL_bldr.getBaseDbc());
				dbWkInsert("MSBCL6050_MSW_ITM_MFG_INST_I01",
						wkL.groupBy(MST_ITM_MFG_INST_R.$itm_mfg_inst_no), wkL_bldr.getBaseDbc());
				
				MCQueryApiBuilder wkInptActL_bldr = MCQueryApiBuilder.create(MST_INPT_ACT_R.create("T"));
				dbWkDelete("MSBCL6050_MSW_INPT_ACT_D01", wkInptActL_bldr.getBaseDbc());
				dbWkInsert("MSBCL6050_MSW_INPT_ACT_I01",
						wkInptActL.groupBy(MST_INPT_ACT_R.$inpt_act_no), wkInptActL_bldr.getBaseDbc());
				
				MCList<MfgActReg_Upd01_DtlInptR> dtlInptL = MCList.create(MfgActReg_Upd01_DtlInptR.class);
				
				executeQuery(dtlInptL, MSBCL6050_MST_INPT_ACT_S01());
				if (!dtlInptL.isEmpty()) {
					dtlInptL.setStringNE(MfgActReg_Upd01_DtlInptR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
					MCIndexKey idx = dtlInptL.createIndex(MfgActReg_Upd01_DtlInptR.$itm_mfg_inst_no);
					for (MfgActReg_Upd01_HdrR r : up0()) {
						if (!isNull(r.itm_mfg_inst_no())) {
							MCList<MfgActReg_Upd01_DtlInptR> subL = dtlInptL.subList(idx, r.itm_mfg_inst_no());
							subL.setValueNE(MfgActReg_Upd01_DtlInptR.$hdr_peg_no, r.peg_no());
						}
					}
					
					for (MfgActReg_Upd01_DtlInptR inptR : dtlInptL) {
						if (MAC_DATA_CRUD_TYP.isCRT(inptR.data_crud_typ()) && !isNull(inptR.ver_no())) {
							MfgActReg_Upd01_HdrR hdrR = _hdrCache.getCache(inptR.hdr_peg_no());
							VerChgUpd_DtlR tmp = VerChgUpd_DtlR.create();
							tmp.par_itm_cd(hdrR.itm_cd());
							tmp.par_itm_sub1(hdrR.itm_sub1());
							tmp.par_itm_sub2(hdrR.itm_sub2());
							tmp.par_itm_sub3(hdrR.itm_sub3());
							tmp.chd_itm_cd(inptR.itm_cd());
							tmp.chd_itm_sub1(inptR.itm_sub1());
							tmp.chd_itm_sub2(inptR.itm_sub2());
							tmp.chd_itm_sub3(inptR.itm_sub3());
							tmp.ver_no(inptR.ver_no());
							tmp.bom_ptn(hdrR.bom_ptn());
							tmp.wg_cd(hdrR.wg_cd());
							tmp.site_cd(hdrR.site_cd());
							tmp.setAttributes(hdrR);
							o.up0().add(tmp);
						}
					}
				}
			}

			for (MfgActReg_Upd01_DtlInptR inptR : up2()) {
				// 新規または更新時は変更後の値で版切替更新
				if (MAC_DATA_CRUD_TYP.isCRT(inptR.data_crud_typ())
						|| (MAC_DATA_CRUD_TYP.isUPD(inptR.data_crud_typ()))) {
					if (!isNull(inptR.ver_no())) {
						MfgActReg_Upd01_HdrR hdrR = _hdrCache.getCache(inptR.hdr_peg_no());
						VerChgUpd_DtlR tmp = VerChgUpd_DtlR.create();
						tmp.par_itm_cd(hdrR.itm_cd());
						tmp.par_itm_sub1(hdrR.itm_sub1());
						tmp.par_itm_sub2(hdrR.itm_sub2());
						tmp.par_itm_sub3(hdrR.itm_sub3());
						tmp.chd_itm_cd(inptR.itm_cd());
						tmp.chd_itm_sub1(inptR.itm_sub1());
						tmp.chd_itm_sub2(inptR.itm_sub2());
						tmp.chd_itm_sub3(inptR.itm_sub3());
						tmp.ver_no(inptR.ver_no());
						tmp.bom_ptn(hdrR.bom_ptn());
						tmp.wg_cd(hdrR.wg_cd());
						tmp.site_cd(hdrR.site_cd());
						tmp.setAttributes(hdrR);
						o.up0().add(tmp);
					}
				}
				// 更新時または削除時は変更後の値で版切替更新
				if (MAC_DATA_CRUD_TYP.isUPD(inptR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(inptR.data_crud_typ())) {
					if (!isNull(inptR.old_ver_no())) {
						MfgActReg_Upd01_HdrR hdrR = _hdrCache.getCache(inptR.hdr_peg_no());
						VerChgUpd_DtlR tmp = VerChgUpd_DtlR.create();
						tmp.par_itm_cd(hdrR.itm_cd());
						tmp.par_itm_sub1(hdrR.itm_sub1());
						tmp.par_itm_sub2(hdrR.itm_sub2());
						tmp.par_itm_sub3(hdrR.itm_sub3());
						tmp.chd_itm_cd(inptR.itm_cd());
						tmp.chd_itm_sub1(inptR.itm_sub1());
						tmp.chd_itm_sub2(inptR.itm_sub2());
						tmp.chd_itm_sub3(inptR.itm_sub3());
						// 版ＮＯは変更される場合があるため、更新前の値を使用する
						tmp.ver_no(inptR.old_ver_no());
						tmp.bom_ptn(hdrR.bom_ptn());
						tmp.wg_cd(hdrR.wg_cd());
						tmp.site_cd(hdrR.site_cd());
						tmp.setAttributes(hdrR);
						o.up0().add(tmp);
					}
				}
			}
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}

		protected void callLotAprvStsUpdSrv() {
			if (!isSame(getSysParm("MFG_APRV_ENABLE_FLG"),"1")) {
				return;
			}
			MSBFL_LotService.Lot_Upd03 o = MSBFL_LotService.crtLot_Upd03();
			for (MfgActReg_Upd01_HdrR hdrR : up0()) {
				if (hdrR.aprv_flg()) {
					Lot_Upd03_CndR oUpR = Lot_Upd03_CndR.create();
					copy(oUpR, hdrR, createMap_Lot_Upd03_CndR_MfgActReg_Upd01_HdrR());
					o.up0().add(oUpR);
				}
			}
			
			if (!o.up0().isEmpty()) {
				o.exec();
			}
		}
		
		protected Map_Lot_Upd03_CndR_MfgActReg_Upd01_HdrR<Lot_Upd03_CndR,MfgActReg_Upd01_HdrR> createMap_Lot_Upd03_CndR_MfgActReg_Upd01_HdrR() {
			return new Map_Lot_Upd03_CndR_MfgActReg_Upd01_HdrR<Lot_Upd03_CndR, MfgActReg_Upd01_HdrR>();
		}

		public class Map_Lot_Upd03_CndR_MfgActReg_Upd01_HdrR<D extends Lot_Upd03_CndR, S extends MfgActReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Upd03_CndR.$itm_mfg_inst_no, MfgActReg_Upd01_HdrR.$itm_mfg_inst_no);

			}
		}
		
		protected void callIoActServiceUpd01() {
			if (!up7().not_io_act_srv_exec_flg()) {
				MSBEL_IoActService.IoAct_Upd01 ope = MSBEL_IoActService.crtIoAct_Upd01();
	
				ope.exec();
			}
		}
		
		protected void callLotInhSrv() {
			if (!isSame(getSysParm("LOT_INH_ENABLE_FLG"), "1")) {
				return;
			}

			MSBFL_LotInhService.LotInh_Upd03 lotInhSrv = MSBFL_LotInhService.crtLotInh_Upd03();
			for (MfgActReg_Upd01_HdrR r : up0()) {
				LotInh_Upd03_Cnd01R tmpR = LotInh_Upd03_Cnd01R.create();
				tmpR.peg_no(r.peg_no());
				tmpR.setAttributes(r);
				tmpR.itm_mfg_inst_no(r.itm_mfg_inst_no());
				tmpR.mfg_act_no(r.mfg_act_no());
				tmpR.silent_flg(isSilentOnLotInh(r));
				tmpR.no_exception_flg(isNotThrowExOnLotInh(r));
				lotInhSrv.up0().add(tmpR);
			}
			lotInhSrv.exec();
		}
		
		protected boolean isSilentOnLotInh(MfgActReg_Upd01_HdrR r) {
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				return true;
			}
			return false;
		}
		
		protected boolean isNotThrowExOnLotInh(MfgActReg_Upd01_HdrR r) {
			if (!MSC_MFG_STS_TYP.isCMPL(r.mfg_sts_typ())) {
				return true;
			}
			return false;
		}
		protected void callOrdStsUpdSrv() {
			// 品目オーダ・工程オーダの更新
			MSBCL_OrdRegService.Ord_Upd04 itmOrd = MSBCL_OrdRegService.crtOrd_Upd04();
			MSBCL_OrdRegService.Ord_Upd05 operOrd = MSBCL_OrdRegService.crtOrd_Upd05();

			for (MCList<MfgActReg_Upd01_HdrR> gl : up0().groupList(MfgActReg_Upd01_HdrR.$itm_ord_no)) {
				Ord_Upd04_DtlR oUp04R = Ord_Upd04_DtlR.create();
				copy(oUp04R, gl.get(0), createMap_Ord_Upd04_DtlR_MfgActReg_Upd01_HdrR());
				itmOrd.up0().add(oUp04R);

				Ord_Upd05_DtlR oUp05R = Ord_Upd05_DtlR.create();
				copy(oUp05R, gl.get(0), createMap_Ord_Upd05_DtlR_MfgActReg_Upd01_HdrR());
				operOrd.up0().add(oUp05R);
			}
			itmOrd.exec();
			operOrd.exec();
		}
		
		protected Map_Ord_Upd04_DtlR_MfgActReg_Upd01_HdrR<Ord_Upd04_DtlR,MfgActReg_Upd01_HdrR> createMap_Ord_Upd04_DtlR_MfgActReg_Upd01_HdrR() {
			return new Map_Ord_Upd04_DtlR_MfgActReg_Upd01_HdrR<Ord_Upd04_DtlR, MfgActReg_Upd01_HdrR>();
		}

		public class Map_Ord_Upd04_DtlR_MfgActReg_Upd01_HdrR<D extends Ord_Upd04_DtlR, S extends MfgActReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd04_DtlR.$itm_ord_no, MfgActReg_Upd01_HdrR.$itm_ord_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (MSC_MFG_MTD_TYP.isEXTNL(src.mfg_mtd_typ())) {
					dest.itm_ord_typ(MSC_ITM_ORD_TYP.OUTSRC.value());
				}
				else {
					dest.itm_ord_typ(MSC_ITM_ORD_TYP.MFG.value());
				}
			}
		}
		
		protected Map_Ord_Upd05_DtlR_MfgActReg_Upd01_HdrR<Ord_Upd05_DtlR,MfgActReg_Upd01_HdrR> createMap_Ord_Upd05_DtlR_MfgActReg_Upd01_HdrR() {
			return new Map_Ord_Upd05_DtlR_MfgActReg_Upd01_HdrR<Ord_Upd05_DtlR, MfgActReg_Upd01_HdrR>();
		}

		public class Map_Ord_Upd05_DtlR_MfgActReg_Upd01_HdrR<D extends Ord_Upd05_DtlR, S extends MfgActReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Upd05_DtlR.$itm_ord_no, MfgActReg_Upd01_HdrR.$itm_ord_no);
			}
		}

		/**
		 * プッシュ通知を実行する。
		 */
		protected void callPushNtc() {
			MCList<MfgActReg_Upd01_HdrR> insActAprvRqstL = MCList.create(MfgActReg_Upd01_HdrR.class);
			MCList<MfgActReg_Upd01_HdrR> delActAprvRqstL = MCList.create(MfgActReg_Upd01_HdrR.class);
			
			for (MfgActReg_Upd01_HdrR r : up0()) {
				if (r.aprv_flg()) {
					if (MSC_MFG_APRV_STS_TYP.isACT_OPN(r.mfg_aprv_sts_typ())
							|| MSC_MFG_APRV_STS_TYP.isACT_OPN(r.old_mfg_aprv_sts_typ())) {
						if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
							MfgActReg_Upd01_HdrR tmpR = r.clone();
							tmpR.old_end_act_tm(tmpR.old_end_act_tm().trunc(MCDateFieldType.DAY));
							delActAprvRqstL.add(tmpR);
						}
						else if (MSC_MFG_APRV_STS_TYP.isACT_OPN(r.old_mfg_aprv_sts_typ())
								&& !isSame(r.mfg_aprv_sts_typ(),r.old_mfg_aprv_sts_typ())) {
							MfgActReg_Upd01_HdrR tmpR = r.clone();
							tmpR.old_end_act_tm(tmpR.old_end_act_tm().trunc(MCDateFieldType.DAY));
							delActAprvRqstL.add(tmpR);
						}
						else if (MSC_MFG_APRV_STS_TYP.isACT_OPN(r.mfg_aprv_sts_typ())
								&& !isSame(r.mfg_aprv_sts_typ(),
										r.old_mfg_aprv_sts_typ())) {
							MfgActReg_Upd01_HdrR tmpR = r.clone();
							tmpR.end_act_tm(tmpR.end_act_tm().trunc(MCDateFieldType.DAY));
							insActAprvRqstL.add(tmpR);
						}
					}
				}
			}
			
			// 製造記録承認依頼
			MCIndexKey insKey = insActAprvRqstL.createIndex(
					MfgActReg_Upd01_HdrR.$mfg_aprv_role_cd,
					MfgActReg_Upd01_HdrR.$end_act_tm);
			for (MfgActReg_Upd01_HdrR r : insActAprvRqstL.groupBy(
					MfgActReg_Upd01_HdrR.$mfg_aprv_role_cd,
					MfgActReg_Upd01_HdrR.$end_act_tm)) {
				MCList<MfgActReg_Upd01_HdrR> tmpL = insActAprvRqstL.subList(insKey, r.mfg_aprv_role_cd(), r.end_act_tm());
				MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();
				
				MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.MFG_ACT_APRV_RQST);
				info.setMsg(new MCMessage(MSBCL1063, tmpL.size()));
				info.addAprvRole(r.mfg_aprv_role_cd(), nvl(r.end_act_tm(), getToday()));
				info.addScrBind(MSC_MFG_ACT_LIST_REG_OPE.OPE_APRV.value());
				
				mgr.exec();
			}
			
			// 製造記録承認依頼の取消
			MCIndexKey delKey = delActAprvRqstL.createIndex(
					MfgActReg_Upd01_HdrR.$mfg_aprv_role_cd,
					MfgActReg_Upd01_HdrR.$old_end_act_tm);
			for (MfgActReg_Upd01_HdrR r : delActAprvRqstL.groupBy(
					MfgActReg_Upd01_HdrR.$mfg_aprv_role_cd,
					MfgActReg_Upd01_HdrR.$old_end_act_tm)) {
				MCList<MfgActReg_Upd01_HdrR> tmpL = delActAprvRqstL.subList(delKey, r.mfg_aprv_role_cd(), r.old_end_act_tm());
				MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();

				MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.MFG_ACT_APRV_RQST);
				info.setMsg(new MCMessage(MSBCL1064, tmpL.size()));
				info.addAprvRole(r.mfg_aprv_role_cd(), nvl(r.old_end_act_tm(), getToday()));

				mgr.exec();
			}
		}
		
		protected void callPrntSrv() {
			// 記録書
			MSBCL_MfgRptService.MfgRpt_Prnt02 prntAct = MSBCL_MfgRptService.crtMfgRpt_Prnt02();
			for (MfgActReg_Upd01_HdrR hdrR : up0()) {
				if (hdrR.act_immed_prnt_flg()) {
					MfgRpt_Prnt02_DtlR oUpR = MfgRpt_Prnt02_DtlR.create();
					copy(oUpR, hdrR, createMap_MfgRpt_Prnt02_DtlR_MfgActReg_Upd01_HdrR());
					prntAct.up0().add(oUpR);
				}
			}
			if (!prntAct.up0().isEmpty()) {
				prntAct.exec();
			}
		}
		
		protected Map_MfgRpt_Prnt02_DtlR_MfgActReg_Upd01_HdrR<MfgRpt_Prnt02_DtlR,MfgActReg_Upd01_HdrR> createMap_MfgRpt_Prnt02_DtlR_MfgActReg_Upd01_HdrR() {
			return new Map_MfgRpt_Prnt02_DtlR_MfgActReg_Upd01_HdrR<MfgRpt_Prnt02_DtlR, MfgActReg_Upd01_HdrR>();
		}

		public class Map_MfgRpt_Prnt02_DtlR_MfgActReg_Upd01_HdrR<D extends MfgRpt_Prnt02_DtlR, S extends MfgActReg_Upd01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgRpt_Prnt02_DtlR.$peg_no, MfgActReg_Upd01_HdrR.$peg_no);
				addColumnPathMap(MfgRpt_Prnt02_DtlR.$mfg_inst_no, MfgActReg_Upd01_HdrR.$mfg_inst_no);
				addColumnPathMap(MfgRpt_Prnt02_DtlR.$mfg_act_no, MfgActReg_Upd01_HdrR.$mfg_act_no);
				addColumnPathMap(MfgRpt_Prnt02_DtlR.$div_seq, MfgActReg_Upd01_HdrR.$div_seq);
			}
		}
		
		protected void setDown() {
			MSC_MFG_STS_TYP.putNameNE(up0(),
					MfgActReg_Upd01_HdrR.$mfg_sts_typ,
					MfgActReg_Upd01_HdrR.$mfg_sts_typ_nm, getUsrLocale());
			down0().addAll(up0());
			// ロット提案に失敗して更新対象外となったヘッダを下り電文に設定する
			down0().addAll(_removeHdrL);
			down1().addAll(up1());
			down2().addAll(up2());
			down3().addAll(up3());
			down4().addAll(up4());
			down5().addAll(up5());
			down6().addAll(up6());
		}

	}
	/**
	 * MfgActReg_Chk02オペレーション.<p>
	 *
	 * 製造実績の取消前チェックの共通処理<br>
	 */
	public class MfgActReg_Chk02 extends MSBCL_MfgActRegService_MC_A.MfgActReg_Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (up4().upd_cntr_chk_flg() && !up4().lst_del_flg()) {
				// 単票の場合
				throwCanErr();
			}
			
			editUp();

			srchDtl();

			mapUpContainers(MAR);
			chk01.exec();
			mapDownContainers(MAR);
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			if (up4().upd_cntr_chk_flg() && !up4().lst_del_flg()) {
				// 単票の場合
				msgL.addAll(checkMfgAct());
			}
			
			return msgL;
		}
		
		/**
		 * 製造実績の排他チェック
		 * @return msgL メッセージリスト
		 */
		protected MCMessageList checkMfgAct() {
			MCMessageList msgL = new MCMessageList();

			MfgActReg_Chk02_HdrR r = up0().get(0);
			
			MST_MFG_ACT_R maR = MST_MFG_ACT_R.create();
			MST_MFG_ACT_R t = MST_MFG_ACT_R.create("T");
			MCQueryApiBuilder maL_bldr = MCQueryApiBuilder.create(t);
			maL_bldr.setSelect(t.mfg_act_no);
			maL_bldr.addSelect(t.upd_cntr);
			dbSelectKey("MSBCL6050_MST_MFG_ACT_S01", maR, maL_bldr, r);
			
			msgL.addAll(checkUpdCntrNE(r, MfgActReg_Chk02_HdrR.$mfg_act_upd_cntr, maR));
			r.err_flg(true);
			
			return msgL;
		}
		
		protected void editUp() {
			setMfgInstNo();
			up0().setStatus(MCRow.Status.DELETE);
		}

		protected void setMfgInstNo() {
			MCList<MST_MFG_ACT_R> maL = MCList.create(MST_MFG_ACT_R.class);
			MST_MFG_ACT_R t = MST_MFG_ACT_R.create("T");
			MCQueryApiBuilder maL_bldr = MCQueryApiBuilder.create(t);
			maL_bldr.setSelect(t.mfg_act_no);
			maL_bldr.addSelect(t.mfg_inst_no);
			maL_bldr.addSelect(t.div_seq);
			dbSelectKey("MSBCL6050_MST_MFG_ACT_S02", maL, maL_bldr, up0());

			if (maL.isEmpty()) {
				return;
			}

			MCIndexKey maLIdxKey = maL.createIndex(MST_MFG_ACT_R.$mfg_act_no);
			for (MfgActReg_Chk02_HdrR r : up0()) {
				MST_MFG_ACT_R maR = maL.getFirst(maLIdxKey, r.mfg_act_no());
				if (!isNull(maR)) {
					r.mfg_inst_no(maR.mfg_inst_no());
					r.div_seq(maR.div_seq());
				}
			}
		}

		protected void srchDtl() {
			MCList<MfgActReg_Chk02_HdrR> maL = up0();
			MCIndexKey maKey = maL.createIndex(MfgActReg_Chk02_HdrR.$mfg_act_no);
			srchOper(maKey, maL);

			MCIndexKey oaKey = MfgActReg_Chk02_DtlOper().createIndex(MfgActReg_Chk02_DtlOperR.$oper_act_no);
			MCList<MfgActReg_Chk02_DtlOperR> oaL = MfgActReg_Chk02_DtlOper();
			MCIndexKey iaKey = up1().createIndex(MfgActReg_Chk02_DtlInptR.$inpt_act_no);
			MCList<MfgActReg_Chk02_DtlInptR> iaL = up1();

			srchInpt(maKey, maL, oaKey, oaL, iaKey, iaL);
			srchWk(maKey, maL, oaKey, oaL);
			srchYield(maKey, maL, oaKey, oaL);
			srchLoss(iaKey, iaL);
		}

		protected void srchOper(MCIndexKey maKey, MCList<MfgActReg_Chk02_HdrR> maL) {
			MCList<MST_OPER_ACT_R> oaL = MCList.create(MST_OPER_ACT_R.class);
			MST_OPER_ACT_R t = MST_OPER_ACT_R.create("T");
			MCQueryApiBuilder oaL_bldr = MCQueryApiBuilder.create(t);
			oaL_bldr.setSelect(t.mfg_act_no);
			oaL_bldr.addSelect(t.oper_act_no);
			oaL_bldr.addSelect(t.oper_inst_no);
			oaL_bldr.setWhere(t.mfg_act_no.eq(bind("mfg_act_no")));
			dbSelect("MSBCL6050_MST_OPER_ACT_S03", oaL, oaL_bldr, maL);

			for (MST_OPER_ACT_R r : oaL) {
				MfgActReg_Chk02_HdrR hdrR = maL.getFirst(maKey, r.mfg_act_no());
				if (isNull(hdrR)) {
					continue;
				}
				addToOperL(hdrR, r);
			}
			setPegNo(MfgActReg_Chk02_DtlOper());
		}

		protected void addToOperL(MfgActReg_Chk02_HdrR hdrR, MST_OPER_ACT_R r) {
			MfgActReg_Chk02_DtlOperR tmp = MfgActReg_Chk02_DtlOperR.create();
			tmp.setAttributes(hdrR);
			tmp.setStatus(MCRow.Status.DELETE);
			tmp.hdr_peg_no(hdrR.peg_no());
			tmp.oper_inst_no(r.oper_inst_no());
			tmp.oper_act_no(r.oper_act_no());
			MfgActReg_Chk02_DtlOper().add(tmp);
		}

		protected void srchInpt(MCIndexKey maKey, MCList<MfgActReg_Chk02_HdrR> maL,
				MCIndexKey oaKey, MCList<MfgActReg_Chk02_DtlOperR> oaL, MCIndexKey iaKey, MCList<MfgActReg_Chk02_DtlInptR> iaL) {

			MCList<MST_INPT_ACT_R> iaTblL = MCList.create(MST_INPT_ACT_R.class);
			MST_INPT_ACT_R t = MST_INPT_ACT_R.create("T");
			MCQueryApiBuilder iaTblL_bldr = MCQueryApiBuilder.create(t);
			iaTblL_bldr.setSelect(t.mfg_act_no);
			iaTblL_bldr.addSelect(t.oper_act_no);
			iaTblL_bldr.addSelect(t.inpt_act_no);
			iaTblL_bldr.addSelect(t.inpt_schd_no);
			iaTblL_bldr.setWhere(t.mfg_act_no.eq(bind("mfg_act_no")));
			dbSelect("MSBCL6050_MST_INPT_ACT_S03", iaTblL, iaTblL_bldr, maL);

			for (MST_INPT_ACT_R r : iaTblL) {
				MfgActReg_Chk02_HdrR hdrR = maL.getFirst(maKey, r.mfg_act_no());
				if (isNull(hdrR)) {
					continue;
				}
				MfgActReg_Chk02_DtlOperR operR = oaL.getFirst(oaKey, r.oper_act_no());
				if (isNull(operR)) {
					continue;
				}
				MfgActReg_Chk02_DtlInptR inptR = iaL.getFirst(iaKey, r.inpt_act_no());
				if (isNull(inptR)) {
					continue;
				}
				editInpt(hdrR, operR,  r, inptR);
			}
			setPegNo(up1());
		}

		protected void editInpt(MfgActReg_Chk02_HdrR hdrR,
				MfgActReg_Chk02_DtlOperR operR, MST_INPT_ACT_R r,
				MfgActReg_Chk02_DtlInptR inptR) {

			if (hdrR.lst_del_flg()) {
				inptR.setAttributes(hdrR);
			}
			inptR.setStatus(MCRow.Status.DELETE);
			inptR.hdr_peg_no(hdrR.peg_no());
			inptR.oper_peg_no(operR.peg_no());
			inptR.inpt_schd_no(r.inpt_schd_no());
		}

		protected void srchWk(MCIndexKey maKey, MCList<MfgActReg_Chk02_HdrR> maL,
				MCIndexKey oaKey, MCList<MfgActReg_Chk02_DtlOperR> oaL) {

			MCList<MST_WK_ACT_R> waL = MCList.create(MST_WK_ACT_R.class);
			MST_WK_ACT_R t = MST_WK_ACT_R.create("T");
			MCQueryApiBuilder waL_bldr = MCQueryApiBuilder.create(t);
			waL_bldr.setSelect(t.mfg_act_no);
			waL_bldr.addSelect(t.oper_act_no);
			waL_bldr.addSelect(t.wk_act_no);
			waL_bldr.setWhere(t.mfg_act_no.eq(bind("mfg_act_no")));
			dbSelect("MSBCL6050_MST_WK_ACT_S04", waL, waL_bldr, maL);

			for (MST_WK_ACT_R r : waL) {
				MfgActReg_Chk02_HdrR hdrR = maL.getFirst(maKey, r.mfg_act_no());
				if (isNull(hdrR)) {
					continue;
				}
				MfgActReg_Chk02_DtlOperR operR = oaL.getFirst(oaKey, r.oper_act_no());
				if (isNull(operR)) {
					continue;
				}
				addToWkL(hdrR, operR, r);
			}
			setPegNo(MfgActReg_Chk02_DtlWk());
		}

		protected void addToWkL(MfgActReg_Chk02_HdrR hdrR, MfgActReg_Chk02_DtlOperR operR,
				MST_WK_ACT_R r) {
			MfgActReg_Chk02_DtlWkR tmp = MfgActReg_Chk02_DtlWkR.create();
			tmp.setAttributes(hdrR);
			tmp.setStatus(MCRow.Status.DELETE);
			tmp.hdr_peg_no(hdrR.peg_no());
			tmp.oper_peg_no(operR.peg_no());
			tmp.wk_act_no(r.wk_act_no());
			MfgActReg_Chk02_DtlWk().add(tmp);
		}

		protected void srchYield(MCIndexKey maKey, MCList<MfgActReg_Chk02_HdrR> maL,
				MCIndexKey oaKey, MCList<MfgActReg_Chk02_DtlOperR> oaL) {

			MCList<MST_YIELD_ACT_R> yaL = MCList.create(MST_YIELD_ACT_R.class);
			MST_YIELD_ACT_R t = MST_YIELD_ACT_R.create("T");
			MCQueryApiBuilder yaL_bldr = MCQueryApiBuilder.create(t);
			yaL_bldr.setSelect(t.mfg_act_no);
			yaL_bldr.addSelect(t.oper_act_no);
			yaL_bldr.addSelect(t.yield_act_no);
			yaL_bldr.addSelect(t.yield_schd_no);
			yaL_bldr.addSelect(t.yield_typ);
			yaL_bldr.setWhere(t.mfg_act_no.eq(bind("mfg_act_no")));
			dbSelect("MSBCL6050_MST_YIELD_ACT_S08", yaL, yaL_bldr, maL);

			for (MST_YIELD_ACT_R r : yaL) {
				MfgActReg_Chk02_HdrR hdrR = maL.getFirst(maKey, r.mfg_act_no());
				if (isNull(hdrR)) {
					continue;
				}
				MfgActReg_Chk02_DtlOperR operR = oaL.getFirst(oaKey, r.oper_act_no());
				if (isNull(operR)) {
					continue;
				}

				if (!MAC_YIELD_TYP.isBYPROD(r.yield_typ())) {
					MCIndexKey yieldKey = up2().createIndex(MfgActReg_Chk02_DtlYieldR.$yield_act_no);
					MfgActReg_Chk02_DtlYieldR yieldR = up2().getFirst(yieldKey, r.yield_act_no());
					if (isNull(yieldR)) {
						continue;
					}

					editYield(hdrR, operR, yieldR, r);
				}
				else {
					MCIndexKey byProdKey = up3().createIndex(MfgActReg_Chk02_DtlByProdR.$yield_act_no);
					MfgActReg_Chk02_DtlByProdR byProdR = up3().getFirst(byProdKey, r.yield_act_no());
					if (isNull(byProdR)) {
						continue;
					}
					editProd(hdrR, operR, byProdR, r);
				}
			}
			setPegNo(up2());
			setPegNo(up3());
		}

		protected void editYield(MfgActReg_Chk02_HdrR hdrR,
				MfgActReg_Chk02_DtlOperR operR, MfgActReg_Chk02_DtlYieldR yieldR, MST_YIELD_ACT_R r) {
			if (hdrR.lst_del_flg()) {
				yieldR.setAttributes(hdrR);
			}
			yieldR.setStatus(MCRow.Status.DELETE);
			yieldR.hdr_peg_no(hdrR.peg_no());
			yieldR.oper_peg_no(operR.peg_no());
			yieldR.yield_schd_no(r.yield_schd_no());
		}

		protected void editProd(MfgActReg_Chk02_HdrR hdrR,
				MfgActReg_Chk02_DtlOperR operR, MfgActReg_Chk02_DtlByProdR byProdR,
				MST_YIELD_ACT_R r) {
			if (hdrR.lst_del_flg()) {
				byProdR.setAttributes(hdrR);
			}
			byProdR.setStatus(MCRow.Status.DELETE);
			byProdR.hdr_peg_no(hdrR.peg_no());
			byProdR.oper_peg_no(operR.peg_no());
			byProdR.yield_schd_no(r.yield_schd_no());
		}

		protected void srchLoss(MCIndexKey iaKey, MCList<MfgActReg_Chk02_DtlInptR> iaL) {
			MCList<MST_LOSS_ACT_R> lossL = MCList.create(MST_LOSS_ACT_R.class);
			MST_LOSS_ACT_R t = MST_LOSS_ACT_R.create("T");
			MCQueryApiBuilder lossL_bldr = MCQueryApiBuilder.create(t);
			lossL_bldr.setSelect(t.inpt_act_no);
			lossL_bldr.addSelect(t.loss_act_no);
			lossL_bldr.setWhere(t.inpt_act_no.eq(bind("inpt_act_no")));
			dbSelect("MSBCL6050_MST_LOSS_ACT_S02", lossL, lossL_bldr, iaL);

			for (MST_LOSS_ACT_R r : lossL) {
				MfgActReg_Chk02_DtlInptR inptR = iaL.getFirst(iaKey, r.inpt_act_no());
				if (isNull(inptR)) {
					continue;
				}
				addToLossL(inptR, r);
			}
			setPegNo(MfgActReg_Chk02_DtlLoss());
		}

		protected void addToLossL(MfgActReg_Chk02_DtlInptR inptR, MST_LOSS_ACT_R r) {
			MfgActReg_Chk02_DtlLossR tmp = MfgActReg_Chk02_DtlLossR.create();
			tmp.setAttributes(inptR);
			tmp.setStatus(MCRow.Status.DELETE);
			tmp.inpt_peg_no(inptR.peg_no());
			tmp.loss_act_no(r.loss_act_no());
			MfgActReg_Chk02_DtlLoss().add(tmp);
		}
	}
	
	/**
	 * MfgActReg_Del01オペレーション.<p>
	 *
	 * 製造実績の取消の共通処理<br>
	 */
	public class MfgActReg_Del01 extends MSBCL_MfgActRegService_MC_A.MfgActReg_Del01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up1());
			}
			catch (Exception e) {
				if (!up0().lst_del_flg()) {
					throw e;
				}
				handleEx(e, up1());
			}
			finally {
				setDown();
			}
		}
		
		protected void handleSuccess(MCList<MfgActReg_Del01_HdrR> l) {
			if (!up0().not_commit_flg()) {
				dbTran().commit();
			}
			for (MfgActReg_Del01_HdrR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}
		
		protected void handleEx(Exception e,
				MCList<MfgActReg_Del01_HdrR> l) {
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
			for (MfgActReg_Del01_HdrR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up1());
		}

		@Override
		protected void doIt() {
			editUp();
			callThisMfgActReg_Chk02();
			
			if (!up0().lst_del_flg()) {
				// 単票から呼ばれた場合は、エラー時に例外をthrowするため、throwCanErrを実行する
				throwCanErr();
			}
			
			callMfgActRegSrv();
		}
		protected void editUp() {
			// up0の更新カウンタチェックFLG、呼出元バッチ処理FLGをup1にコピー
			for (MfgActReg_Del01_HdrR r : up1()) {
				r.upd_cntr_chk_flg(up0().upd_cntr_chk_flg());
				r.is_src_batch_flg(up0().is_src_batch_flg());
			}
		}

		protected void callThisMfgActReg_Chk02() {
			mapUpContainers(MA);
			maChk02.exec();
			mapDownContainers(MA);
		}

		protected void callMfgActRegSrv() {
			MCList<MfgActReg_Chk02_HdrR> notErrDown0 = MCList.create(MfgActReg_Chk02_HdrR.class);
			MCIndexKey upIdxkey = up1().createIndex(MfgActReg_Del01_HdrR.$peg_no);
			
			for (MfgActReg_Chk02_HdrR chkDown0R : maChk02.down0()) {
				if (!chkDown0R.err_flg()) {
					notErrDown0.add(chkDown0R);
				}
				else {
					MfgActReg_Del01_HdrR thisUpR = up1().getFirst(upIdxkey, chkDown0R.peg_no());
					thisUpR.err_flg(true);
					thisUpR.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
			}
			
			if (notErrDown0.isEmpty()) {
				return;
			}

			MCList<MfgActReg_Chk02_DtlOperR> notErrDown1 = MCList.create(MfgActReg_Chk02_DtlOperR.class);
			MCIndexKey down1Key = maChk02.down1().createIndex(MfgActReg_Chk02_DtlOperR.$hdr_peg_no);
			
			MCList<MfgActReg_Chk02_DtlInptR> notErrDown2 = MCList.create(MfgActReg_Chk02_DtlInptR.class);
			MCIndexKey down2Key = maChk02.down2().createIndex(MfgActReg_Chk02_DtlInptR.$hdr_peg_no);
			
			MCList<MfgActReg_Chk02_DtlWkR> notErrDown4 = MCList.create(MfgActReg_Chk02_DtlWkR.class);
			MCIndexKey down4Key = maChk02.down4().createIndex(MfgActReg_Chk02_DtlWkR.$hdr_peg_no);
			
			MCList<MfgActReg_Chk02_DtlYieldR> notErrDown5 = MCList.create(MfgActReg_Chk02_DtlYieldR.class);
			MCIndexKey down5Key = maChk02.down5().createIndex(MfgActReg_Chk02_DtlYieldR.$hdr_peg_no);
			
			MCList<MfgActReg_Chk02_DtlByProdR> notErrDown6 = MCList.create(MfgActReg_Chk02_DtlByProdR.class);
			MCIndexKey down6Key = maChk02.down6().createIndex(MfgActReg_Chk02_DtlByProdR.$hdr_peg_no);
			
			for (MfgActReg_Chk02_HdrR r : notErrDown0) {
				notErrDown1.addAll(maChk02.down1().subList(down1Key, r.peg_no()));
				notErrDown2.addAll(maChk02.down2().subList(down2Key, r.peg_no()));
				notErrDown4.addAll(maChk02.down4().subList(down4Key, r.peg_no()));
				notErrDown5.addAll(maChk02.down5().subList(down5Key, r.peg_no()));
				notErrDown6.addAll(maChk02.down6().subList(down6Key, r.peg_no()));
			}
			
			MCList<MfgActReg_Chk02_DtlLossR> notErrDown3 = MCList.create(MfgActReg_Chk02_DtlLossR.class);
			MCIndexKey down3Key = maChk02.down3().createIndex(MfgActReg_Chk02_DtlLossR.$inpt_peg_no);
			for (MfgActReg_Chk02_DtlInptR r : notErrDown2) {
				notErrDown3.addAll(maChk02.down3().subList(down3Key, r.peg_no()));
			}

			MSBCL_MfgActRegService.MfgActReg_Upd01 updOpe = MSBCL_MfgActRegService.crtMfgActReg_Upd01();
			addAll(updOpe.up0(), notErrDown0, createMap_MfgActReg_Upd01_HdrR_MfgActReg_Chk02_HdrR());
			addAll(updOpe.up1(), notErrDown1, createMap_MfgActReg_Upd01_DtlOperR_MfgActReg_Chk02_DtlOperR());
			addAll(updOpe.up2(), notErrDown2, createMap_MfgActReg_Upd01_DtlInptR_MfgActReg_Chk02_DtlInptR());
			addAll(updOpe.up3(), notErrDown3, createMap_MfgActReg_Upd01_DtlLossR_MfgActReg_Chk02_DtlLossR());
			addAll(updOpe.up4(), notErrDown4, createMap_MfgActReg_Upd01_DtlWkR_MfgActReg_Chk02_DtlWkR());
			addAll(updOpe.up5(), notErrDown5, createMap_MfgActReg_Upd01_DtlYieldR_MfgActReg_Chk02_DtlYieldR());
			addAll(updOpe.up6(), notErrDown6, createMap_MfgActReg_Upd01_DtlByProdR_MfgActReg_Chk02_DtlByProdR());
			updOpe.exec();
		}

		protected Map_MfgActReg_Upd01_HdrR_MfgActReg_Chk02_HdrR<MfgActReg_Upd01_HdrR,MfgActReg_Chk02_HdrR> createMap_MfgActReg_Upd01_HdrR_MfgActReg_Chk02_HdrR() {
			return new Map_MfgActReg_Upd01_HdrR_MfgActReg_Chk02_HdrR<MfgActReg_Upd01_HdrR, MfgActReg_Chk02_HdrR>();
		}

		public class Map_MfgActReg_Upd01_HdrR_MfgActReg_Chk02_HdrR<D extends MfgActReg_Upd01_HdrR, S extends MfgActReg_Chk02_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActReg_Upd01_HdrR.$data_crud_typ, MfgActReg_Chk02_HdrR.$data_crud_typ);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$peg_no, MfgActReg_Chk02_HdrR.$peg_no);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$itm_cd, MfgActReg_Chk02_HdrR.$itm_cd);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$itm_sub1, MfgActReg_Chk02_HdrR.$itm_sub1);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$itm_sub2, MfgActReg_Chk02_HdrR.$itm_sub2);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$itm_sub3, MfgActReg_Chk02_HdrR.$itm_sub3);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$sno1, MfgActReg_Chk02_HdrR.$sno1);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$sno2, MfgActReg_Chk02_HdrR.$sno2);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$sno3, MfgActReg_Chk02_HdrR.$sno3);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$sno4, MfgActReg_Chk02_HdrR.$sno4);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$base_unit_st_act_qty, MfgActReg_Chk02_HdrR.$base_unit_st_act_qty);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$base_unit_yield_qty, MfgActReg_Chk02_HdrR.$base_unit_yield_qty);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$base_unit_dfct_qty, MfgActReg_Chk02_HdrR.$base_unit_dfct_qty);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$base_unit_cd, MfgActReg_Chk02_HdrR.$base_unit_cd);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$mfg_mtd_typ, MfgActReg_Chk02_HdrR.$mfg_mtd_typ);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$mfg_inst_unit_typ, MfgActReg_Chk02_HdrR.$mfg_inst_unit_typ);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$bom_ptn, MfgActReg_Chk02_HdrR.$bom_ptn);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$site_cd, MfgActReg_Chk02_HdrR.$site_cd);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$wg_cd, MfgActReg_Chk02_HdrR.$wg_cd);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$aprv_flg, MfgActReg_Chk02_HdrR.$aprv_flg);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$mfg_aprv_role_cd, MfgActReg_Chk02_HdrR.$mfg_aprv_role_cd);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$old_mfg_aprv_sts_typ, MfgActReg_Chk02_HdrR.$old_mfg_aprv_sts_typ);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$old_end_act_tm, MfgActReg_Chk02_HdrR.$old_end_act_tm);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$mfg_inst_no, MfgActReg_Chk02_HdrR.$mfg_inst_no);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$div_seq, MfgActReg_Chk02_HdrR.$div_seq);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$mfg_act_no, MfgActReg_Chk02_HdrR.$mfg_act_no);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$itm_ord_no, MfgActReg_Chk02_HdrR.$itm_ord_no);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$itm_mfg_inst_no, MfgActReg_Chk02_HdrR.$itm_mfg_inst_no);
				addColumnPathMap(MfgActReg_Upd01_HdrR.$is_src_batch_flg, MfgActReg_Chk02_HdrR.$is_src_batch_flg);
			}
		}

		protected Map_MfgActReg_Upd01_DtlOperR_MfgActReg_Chk02_DtlOperR<MfgActReg_Upd01_DtlOperR,MfgActReg_Chk02_DtlOperR> createMap_MfgActReg_Upd01_DtlOperR_MfgActReg_Chk02_DtlOperR() {
			return new Map_MfgActReg_Upd01_DtlOperR_MfgActReg_Chk02_DtlOperR<MfgActReg_Upd01_DtlOperR, MfgActReg_Chk02_DtlOperR>();
		}

		public class Map_MfgActReg_Upd01_DtlOperR_MfgActReg_Chk02_DtlOperR<D extends MfgActReg_Upd01_DtlOperR, S extends MfgActReg_Chk02_DtlOperR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$data_crud_typ, MfgActReg_Chk02_DtlOperR.$data_crud_typ);
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$hdr_peg_no, MfgActReg_Chk02_DtlOperR.$hdr_peg_no);
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$peg_no, MfgActReg_Chk02_DtlOperR.$peg_no);
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$oper_ord_no, MfgActReg_Chk02_DtlOperR.$oper_ord_no);
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$oper_inst_no, MfgActReg_Chk02_DtlOperR.$oper_inst_no);
				addColumnPathMap(MfgActReg_Upd01_DtlOperR.$oper_act_no, MfgActReg_Chk02_DtlOperR.$oper_act_no);

			}
		}

		protected Map_MfgActReg_Upd01_DtlInptR_MfgActReg_Chk02_DtlInptR<MfgActReg_Upd01_DtlInptR,MfgActReg_Chk02_DtlInptR> createMap_MfgActReg_Upd01_DtlInptR_MfgActReg_Chk02_DtlInptR() {
			return new Map_MfgActReg_Upd01_DtlInptR_MfgActReg_Chk02_DtlInptR<MfgActReg_Upd01_DtlInptR, MfgActReg_Chk02_DtlInptR>();
		}

		public class Map_MfgActReg_Upd01_DtlInptR_MfgActReg_Chk02_DtlInptR<D extends MfgActReg_Upd01_DtlInptR, S extends MfgActReg_Chk02_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$data_crud_typ, MfgActReg_Chk02_DtlInptR.$data_crud_typ);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$hdr_peg_no, MfgActReg_Chk02_DtlInptR.$hdr_peg_no);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$oper_peg_no, MfgActReg_Chk02_DtlInptR.$oper_peg_no);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$peg_no, MfgActReg_Chk02_DtlInptR.$peg_no);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$itm_cd, MfgActReg_Chk02_DtlInptR.$itm_cd);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$itm_sub1, MfgActReg_Chk02_DtlInptR.$itm_sub1);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$itm_sub2, MfgActReg_Chk02_DtlInptR.$itm_sub2);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$itm_sub3, MfgActReg_Chk02_DtlInptR.$itm_sub3);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$old_ver_no, MfgActReg_Chk02_DtlInptR.$old_ver_no);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$inpt_schd_no, MfgActReg_Chk02_DtlInptR.$inpt_schd_no);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$inpt_act_no, MfgActReg_Chk02_DtlInptR.$inpt_act_no);
				addColumnPathMap(MfgActReg_Upd01_DtlInptR.$can_ac_dt, MfgActReg_Chk02_DtlInptR.$can_ac_dt);

			}
		}

		protected Map_MfgActReg_Upd01_DtlLossR_MfgActReg_Chk02_DtlLossR<MfgActReg_Upd01_DtlLossR,MfgActReg_Chk02_DtlLossR> createMap_MfgActReg_Upd01_DtlLossR_MfgActReg_Chk02_DtlLossR() {
			return new Map_MfgActReg_Upd01_DtlLossR_MfgActReg_Chk02_DtlLossR<MfgActReg_Upd01_DtlLossR, MfgActReg_Chk02_DtlLossR>();
		}

		public class Map_MfgActReg_Upd01_DtlLossR_MfgActReg_Chk02_DtlLossR<D extends MfgActReg_Upd01_DtlLossR, S extends MfgActReg_Chk02_DtlLossR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActReg_Upd01_DtlLossR.$data_crud_typ, MfgActReg_Chk02_DtlLossR.$data_crud_typ);
				addColumnPathMap(MfgActReg_Upd01_DtlLossR.$inpt_peg_no, MfgActReg_Chk02_DtlLossR.$inpt_peg_no);
				addColumnPathMap(MfgActReg_Upd01_DtlLossR.$fxd_loss_flg, MfgActReg_Chk02_DtlLossR.$fxd_loss_flg);
				addColumnPathMap(MfgActReg_Upd01_DtlLossR.$loss_act_no, MfgActReg_Chk02_DtlLossR.$loss_act_no);
				addColumnPathMap(MfgActReg_Upd01_DtlLossR.$loss_rsn_cd, MfgActReg_Chk02_DtlLossR.$loss_rsn_cd);

			}
		}

		protected Map_MfgActReg_Upd01_DtlWkR_MfgActReg_Chk02_DtlWkR<MfgActReg_Upd01_DtlWkR,MfgActReg_Chk02_DtlWkR> createMap_MfgActReg_Upd01_DtlWkR_MfgActReg_Chk02_DtlWkR() {
			return new Map_MfgActReg_Upd01_DtlWkR_MfgActReg_Chk02_DtlWkR<MfgActReg_Upd01_DtlWkR, MfgActReg_Chk02_DtlWkR>();
		}

		public class Map_MfgActReg_Upd01_DtlWkR_MfgActReg_Chk02_DtlWkR<D extends MfgActReg_Upd01_DtlWkR, S extends MfgActReg_Chk02_DtlWkR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActReg_Upd01_DtlWkR.$data_crud_typ, MfgActReg_Chk02_DtlWkR.$data_crud_typ);
				addColumnPathMap(MfgActReg_Upd01_DtlWkR.$hdr_peg_no, MfgActReg_Chk02_DtlWkR.$hdr_peg_no);
				addColumnPathMap(MfgActReg_Upd01_DtlWkR.$oper_peg_no, MfgActReg_Chk02_DtlWkR.$oper_peg_no);
				addColumnPathMap(MfgActReg_Upd01_DtlWkR.$peg_no, MfgActReg_Chk02_DtlWkR.$peg_no);
				addColumnPathMap(MfgActReg_Upd01_DtlWkR.$wk_schd_no, MfgActReg_Chk02_DtlWkR.$wk_schd_no);
				addColumnPathMap(MfgActReg_Upd01_DtlWkR.$wk_act_no, MfgActReg_Chk02_DtlWkR.$wk_act_no);

			}
		}

		protected Map_MfgActReg_Upd01_DtlYieldR_MfgActReg_Chk02_DtlYieldR<MfgActReg_Upd01_DtlYieldR,MfgActReg_Chk02_DtlYieldR> createMap_MfgActReg_Upd01_DtlYieldR_MfgActReg_Chk02_DtlYieldR() {
			return new Map_MfgActReg_Upd01_DtlYieldR_MfgActReg_Chk02_DtlYieldR<MfgActReg_Upd01_DtlYieldR, MfgActReg_Chk02_DtlYieldR>();
		}

		public class Map_MfgActReg_Upd01_DtlYieldR_MfgActReg_Chk02_DtlYieldR<D extends MfgActReg_Upd01_DtlYieldR, S extends MfgActReg_Chk02_DtlYieldR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActReg_Upd01_DtlYieldR.$data_crud_typ, MfgActReg_Chk02_DtlYieldR.$data_crud_typ);
				addColumnPathMap(MfgActReg_Upd01_DtlYieldR.$hdr_peg_no, MfgActReg_Chk02_DtlYieldR.$hdr_peg_no);
				addColumnPathMap(MfgActReg_Upd01_DtlYieldR.$oper_peg_no, MfgActReg_Chk02_DtlYieldR.$oper_peg_no);
				addColumnPathMap(MfgActReg_Upd01_DtlYieldR.$peg_no, MfgActReg_Chk02_DtlYieldR.$peg_no);
				addColumnPathMap(MfgActReg_Upd01_DtlYieldR.$lot_no, MfgActReg_Chk02_DtlYieldR.$lot_no);
				addColumnPathMap(MfgActReg_Upd01_DtlYieldR.$sublot_no, MfgActReg_Chk02_DtlYieldR.$sublot_no);
				addColumnPathMap(MfgActReg_Upd01_DtlYieldR.$strg_loc_cd, MfgActReg_Chk02_DtlYieldR.$strg_loc_cd);
				addColumnPathMap(MfgActReg_Upd01_DtlYieldR.$yield_schd_no, MfgActReg_Chk02_DtlYieldR.$yield_schd_no);
				addColumnPathMap(MfgActReg_Upd01_DtlYieldR.$yield_act_no, MfgActReg_Chk02_DtlYieldR.$yield_act_no);
				addColumnPathMap(MfgActReg_Upd01_DtlYieldR.$can_ac_dt, MfgActReg_Chk02_DtlYieldR.$can_ac_dt);
				addColumnPathMap(MfgActReg_Upd01_DtlYieldR.$not_stk_flg, MfgActReg_Chk02_DtlYieldR.$not_stk_flg);
				addColumnPathMap(MfgActReg_Upd01_DtlYieldR.$old_lot_no, MfgActReg_Chk02_DtlYieldR.$old_lot_no);
				addColumnPathMap(MfgActReg_Upd01_DtlYieldR.$old_sublot_no, MfgActReg_Chk02_DtlYieldR.$old_sublot_no);
				addColumnPathMap(MfgActReg_Upd01_DtlYieldR.$old_yield_typ, MfgActReg_Chk02_DtlYieldR.$old_yield_typ);
				addColumnPathMap(MfgActReg_Upd01_DtlYieldR.$old_base_unit_yield_act_qty, MfgActReg_Chk02_DtlYieldR.$old_base_unit_yield_act_qty);

			}
		}

		protected Map_MfgActReg_Upd01_DtlByProdR_MfgActReg_Chk02_DtlByProdR<MfgActReg_Upd01_DtlByProdR,MfgActReg_Chk02_DtlByProdR> createMap_MfgActReg_Upd01_DtlByProdR_MfgActReg_Chk02_DtlByProdR() {
			return new Map_MfgActReg_Upd01_DtlByProdR_MfgActReg_Chk02_DtlByProdR<MfgActReg_Upd01_DtlByProdR, MfgActReg_Chk02_DtlByProdR>();
		}

		public class Map_MfgActReg_Upd01_DtlByProdR_MfgActReg_Chk02_DtlByProdR<D extends MfgActReg_Upd01_DtlByProdR, S extends MfgActReg_Chk02_DtlByProdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActReg_Upd01_DtlByProdR.$data_crud_typ, MfgActReg_Chk02_DtlByProdR.$data_crud_typ);
				addColumnPathMap(MfgActReg_Upd01_DtlByProdR.$hdr_peg_no, MfgActReg_Chk02_DtlByProdR.$hdr_peg_no);
				addColumnPathMap(MfgActReg_Upd01_DtlByProdR.$oper_peg_no, MfgActReg_Chk02_DtlByProdR.$oper_peg_no);
				addColumnPathMap(MfgActReg_Upd01_DtlByProdR.$peg_no, MfgActReg_Chk02_DtlByProdR.$peg_no);
				addColumnPathMap(MfgActReg_Upd01_DtlByProdR.$itm_cd, MfgActReg_Chk02_DtlByProdR.$itm_cd);
				addColumnPathMap(MfgActReg_Upd01_DtlByProdR.$itm_sub1, MfgActReg_Chk02_DtlByProdR.$itm_sub1);
				addColumnPathMap(MfgActReg_Upd01_DtlByProdR.$itm_sub2, MfgActReg_Chk02_DtlByProdR.$itm_sub2);
				addColumnPathMap(MfgActReg_Upd01_DtlByProdR.$itm_sub3, MfgActReg_Chk02_DtlByProdR.$itm_sub3);
				addColumnPathMap(MfgActReg_Upd01_DtlByProdR.$lot_no, MfgActReg_Chk02_DtlByProdR.$lot_no);
				addColumnPathMap(MfgActReg_Upd01_DtlByProdR.$sublot_no, MfgActReg_Chk02_DtlByProdR.$sublot_no);
				addColumnPathMap(MfgActReg_Upd01_DtlByProdR.$yield_schd_no, MfgActReg_Chk02_DtlByProdR.$yield_schd_no);
				addColumnPathMap(MfgActReg_Upd01_DtlByProdR.$yield_act_no, MfgActReg_Chk02_DtlByProdR.$yield_act_no);
				addColumnPathMap(MfgActReg_Upd01_DtlByProdR.$can_ac_dt, MfgActReg_Chk02_DtlByProdR.$can_ac_dt);
				addColumnPathMap(MfgActReg_Upd01_DtlByProdR.$old_lot_no, MfgActReg_Chk02_DtlByProdR.$old_lot_no);
				addColumnPathMap(MfgActReg_Upd01_DtlByProdR.$old_sublot_no, MfgActReg_Chk02_DtlByProdR.$old_sublot_no);

			}
		}
	}
	
	/**
	 * MfgActReg_Upd02オペレーション.<p>
	 *
	 * 製造実績の一括登録・訂正処理<br>
	 */
	public class MfgActReg_Upd02 extends MSBCL_MfgActRegService_MC_A.MfgActReg_Upd02 {
		/**
		 * 明細から紐付けＮＯでヘッダデータにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MfgActReg_Upd02_Hdr1R> _hdrUpCache;
		
		/**
		 * 明細からヘッダ紐付けＮＯでChk01のヘッダデータにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MfgActReg_Chk01_HdrR> _hdrChkCache;

		/**
		 * 明細から工程紐付けＮＯでChk01の工程データにアクセスする際に使用するキャッシュ
		 */
		protected FXUCL_Cache<MfgActReg_Chk01_DtlOperR> _operChkCache;

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
		
		protected void handleSuccess() {
			if (!up0().not_commit_flg()) {
				dbTran().commit();
			}
			if (up0().oper_unit_flg()) {
				for (MfgActReg_Upd02_Hdr1R r : up1()) {
					if (isNull(r.rtn_sts_typ())) {
						r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
					}
				}
			}
			else {
				for (MfgActReg_Upd02_Hdr1R r : up2()) {
					if (isNull(r.rtn_sts_typ())) {
						r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
					}
				}
			}
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
			if(up0().is_src_batch_flg()) {
				MCMessagePool.add(MSBCL1321);
			}
			
			if (up0().oper_unit_flg()) {
				for (MfgActReg_Upd02_Hdr1R r : up1()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
			}
			else {
				for (MfgActReg_Upd02_Hdr1R r : up2()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
			}
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			if (up0().oper_unit_flg()) {
				down0().setAll(up1());
				down2().setAll(up3());
			}
			else {
				down1().setAll(up2());
				down2().setAll(up3());
			}
		}

		@Override
		protected void doIt() {
			if (up0().oper_unit_flg()) {
				callThisChk03(up1(), up3());
				
				MCList<MfgActReg_Upd02_Hdr1R> notErrHdrUpL = getChkList(up1());
				if (notErrHdrUpL.isEmpty()) {
					return;
				}
				MCList<MfgActReg_Upd02_DtlYieldByProdR> notErrDtlUpL = getNotErrDtlUpL(notErrHdrUpL);
				
				callThisChk01(notErrHdrUpL, notErrDtlUpL);
				
				if (MfgActReg_Upd02_Hdr().isEmpty()) {
					return;
				}
				callThisUpd01OperMode(notErrHdrUpL, notErrDtlUpL);
			}
			else {
				callThisChk03(up2(), up3());
				
				MCList<MfgActReg_Upd02_Hdr1R> notErrHdrUpL = getChkList(up2());
				if (notErrHdrUpL.isEmpty()) {
					return;
				}
				MCList<MfgActReg_Upd02_DtlYieldByProdR> notErrDtlUpL = getNotErrDtlUpL(notErrHdrUpL);
				
				callThisChk01(notErrHdrUpL, notErrDtlUpL);
				
				if (MfgActReg_Upd02_Hdr().isEmpty()) {
					return;
				}
				callThisUpd01HdrMode(notErrHdrUpL, notErrDtlUpL);
			}
		}
		
		protected void callThisChk03(MCList<MfgActReg_Upd02_Hdr1R> hdrUpL,
				MCList<MfgActReg_Upd02_DtlYieldByProdR> dtlUpL) {
			mapUpContainers(MAR2);
			marChk03.exec();
			if (up0().oper_unit_flg()) {
				copyErrFlg(hdrUpL, marChk03.down0());
			}
			else {
				copyErrFlg(hdrUpL, marChk03.down1());
			}

			for (MfgActReg_Upd02_Hdr1R r : hdrUpL) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
			}
		}
		
		protected MCList<MfgActReg_Upd02_DtlYieldByProdR> getNotErrDtlUpL(MCList<MfgActReg_Upd02_Hdr1R> notErrHdrUpL) {
			MCList<MfgActReg_Upd02_DtlYieldByProdR> retL = MCList.create(MfgActReg_Upd02_DtlYieldByProdR.class);
			
			MCIndexKey idxkey = up3().createIndex(MfgActReg_Upd02_DtlYieldByProdR.$hdr_peg_no);
			for (MfgActReg_Upd02_Hdr1R notErrHdrUpR : notErrHdrUpL) {
				retL.addAll(up3().subList(idxkey, notErrHdrUpR.peg_no()));
			}
			return retL;
		}
		
		/**
		 * チェック処理呼び出し
		 */
		protected void callThisChk01(MCList<MfgActReg_Upd02_Hdr1R> notErrHdrUpL, MCList<MfgActReg_Upd02_DtlYieldByProdR> dtlUpL) {
			MCList<MfgActReg_Chk01_HdrR> chk01HdrL = MCList.create(MfgActReg_Chk01_HdrR.class);
			MCList<MfgActReg_Chk01_DtlOperR> chk01OperL = MCList.create(MfgActReg_Chk01_DtlOperR.class);
			MCList<MfgActReg_Chk01_DtlYieldR> chk01YieldL = MCList.create(MfgActReg_Chk01_DtlYieldR.class);
			MCList<MfgActReg_Chk01_DtlByProdR> chk01ByProdL = MCList.create(MfgActReg_Chk01_DtlByProdR.class);
			MCList<MfgActReg_Chk01_DtlInptR> chk01InptL = MCList.create(MfgActReg_Chk01_DtlInptR.class);
			MCList<MfgActReg_Chk01_DtlLossR> chk01LossL = MCList.create(MfgActReg_Chk01_DtlLossR.class);
			MCList<MfgActReg_Chk01_DtlWkR> chk01WkL = MCList.create(MfgActReg_Chk01_DtlWkR.class);
			
			MCList<MfgActReg_Upd02_Hdr1R> hdrUpL = MCList.create(MfgActReg_Upd02_Hdr1R.class);
			
			hdrUpL.addAll(getHdrUpLForChk01(notErrHdrUpL));
			
			// 投入・工数の計上日前後比較のため、更新前の計上日を格納するための一時カラムを追加
			chk01InptL.addDateColumn("bef_ac_dt");
			chk01WkL.addDateColumn("bef_ac_dt");
			
			// ヘッダコンテナの作成
			addAll(chk01HdrL, hdrUpL, createMap_MfgActReg_Chk01_HdrR_MfgActReg_Upd02_Hdr1R());
			setHdrChkCache(chk01HdrL);

			// 工程データ取得用、着手時再計算用にヘッダのワークテーブルを登録
			insHdrWk(hdrUpL);

			// 工程コンテナの作成
			chk01OperL.addAll(getOperContainer(hdrUpL, notErrHdrUpL, chk01HdrL));
			
			// 出来高、副産品コンテナの作成
			crtYieldAndByProdContainer(dtlUpL, chk01OperL, chk01YieldL, chk01ByProdL);

			// 分割連番を設定
			// ※再計算処理が分割連番を必要とするため、Upd01ではなくここで設定する
			MCList<MfgActReg_Chk01_HdrR> crtHdrL = chk01HdrL.subList(r -> isNull(r.mfg_act_no()));
			if (!crtHdrL.isEmpty()) {
				setDivSeq(crtHdrL, MfgActReg_Upd02_Hdr1R.$mfg_inst_no,
						MfgActReg_Upd02_Hdr1R.$div_seq);
			}

			MCList<MfgActReg_Chk01_DtlYieldR> yaDbL = MCList.create(MfgActReg_Chk01_DtlYieldR.class);
			// バックフラッシュまたは、自動工数計算を行う場合は投入・ロス・工数を取得
			if (!up0().not_bkf_upd_flg() || !up0().not_wk_cost_upd_calc_flg()) {
				// 投入・ロス・工数データ取得用に工程のワークテーブルを登録
				insOperWk(chk01OperL);
				
				if (!up0().not_bkf_upd_flg()) {
					// 投入、ロス
					crtInptAndLossContainer(chk01OperL, chk01InptL, chk01LossL);
					
					// バックフラッシュ区分に応じて日付を設定する
					yaDbL.addAll(setInptDtAndSrchYieldAct(chk01OperL, chk01YieldL, chk01InptL));
				}
				
				if (!up0().not_wk_cost_upd_calc_flg()) {
					// 工数
					chk01WkL.addAll(getWkContainer(chk01OperL, chk01YieldL.subList(r -> !r.isStatusDelete())));
					// 上り電文に存在しない出来高を補完
					srchYieldActForWk(chk01YieldL, chk01OperL, yaDbL, chk01WkL);
					// 上り電文に存在しない出来高から工数の計上日を補完
					compWkAcDt(chk01WkL, chk01OperL, yaDbL);
				}
				MCNumber yieldPegNo = nvl((MCNumber)chk01YieldL.max(MfgActReg_Chk01_DtlYieldR.$peg_no), MCNumber.ZERO);
				for (MfgActReg_Chk01_DtlYieldR yaDbR : yaDbL) {
					yieldPegNo = yieldPegNo.add(MCNumber.ONE);
					yaDbR.peg_no(yieldPegNo);
				}
				// ヘッダーモードでの訂正時、工程単位実績数量の再設定
				compOperUnitActQty(dtlUpL, chk01OperL, chk01YieldL, yaDbL);
				
				// 着手時再計算及び、投入・工数再計算を実行し、投入実績数、工数を設定する
				callReCalcSrv(chk01HdrL, chk01OperL, chk01YieldL, yaDbL, chk01ByProdL,
						chk01InptL, chk01WkL, chk01LossL);
			}

			// チェック処理実行
			MSBCL_MfgActRegService.MfgActReg_Chk01 chkOpe = MSBCL_MfgActRegService.crtMfgActReg_Chk01();
			chkOpe.up0().addAll(chk01HdrL);
			chkOpe.up1().addAll(chk01OperL);
			chkOpe.up2().addAll(chk01InptL);
			chkOpe.up3().addAll(chk01LossL);
			chkOpe.up4().addAll(chk01WkL);
			chkOpe.up5().addAll(chk01YieldL);
			chkOpe.up6().addAll(chk01ByProdL);
			
			// チェック処理実行
			if (!chkOpe.up0().isEmpty()) {
				chkOpe.exec();
				
				MCList<MfgActReg_Chk01_HdrR> notErrDown0 = MCList.create(MfgActReg_Chk01_HdrR.class);
				MCIndexKey thisUpKey = notErrHdrUpL.createIndex(MfgActReg_Upd02_Hdr1R.$peg_no);
				
				MCIndexKey down1Key = chkOpe.down1().createIndex(MfgActReg_Chk01_DtlOperR.$hdr_peg_no);
				for (MfgActReg_Chk01_HdrR chkDown0R : chkOpe.down0()) {
					if (!chkDown0R.err_flg()) {
						notErrDown0.add(chkDown0R);
					}
					else {
						if (up0().oper_unit_flg()) {
							for (MfgActReg_Chk01_DtlOperR chkDown1R : chkOpe.down1().subList(down1Key, chkDown0R.peg_no())) {
								MfgActReg_Upd02_Hdr1R thisUpR = notErrHdrUpL.getFirst(thisUpKey, chkDown1R.peg_no());
								setOperModeChkErrDown(thisUpR, chkDown0R, chkDown1R);
							}
						}
						else {
							MfgActReg_Upd02_Hdr1R thisUpR = notErrHdrUpL.getFirst(thisUpKey, chkDown0R.peg_no());
							setHdrModeChkErrDown(thisUpR, chkDown0R);
						}
					}
				}
				
				if (!notErrDown0.isEmpty()) {
					MCList<MfgActReg_Chk01_DtlOperR> notErrDown1 = MCList.create(MfgActReg_Chk01_DtlOperR.class);
					
					for (MfgActReg_Chk01_HdrR r : notErrDown0) {
						notErrDown1.addAll(chkOpe.down1().subList(down1Key, r.peg_no()));
					}
	
					MCList<MfgActReg_Chk01_DtlInptR> notErrDown2 = MCList.create(MfgActReg_Chk01_DtlInptR.class);
					MCList<MfgActReg_Chk01_DtlLossR> notErrDown3 = MCList.create(MfgActReg_Chk01_DtlLossR.class);
					MCIndexKey down2Key = chkOpe.down2().createIndex(MfgActReg_Chk01_DtlInptR.$hdr_peg_no);
					MCIndexKey down3Key = chkOpe.down3().createIndex(MfgActReg_Chk01_DtlLossR.$inpt_peg_no);
					for (MfgActReg_Chk01_HdrR r : notErrDown0) {
						MCList<MfgActReg_Chk01_DtlInptR> notErrInptL = chkOpe.down2().subList(down2Key, r.peg_no());
						notErrDown2.addAll(notErrInptL);
						for (MfgActReg_Chk01_DtlInptR notErrInptR : notErrInptL) {
							notErrDown3.addAll(chkOpe.down3().subList(down3Key, notErrInptR.peg_no()));
						}
					}
	
					MCList<MfgActReg_Chk01_DtlWkR> notErrDown4 = MCList.create(MfgActReg_Chk01_DtlWkR.class);
					MCIndexKey down4Key = chkOpe.down4().createIndex(MfgActReg_Chk01_DtlWkR.$hdr_peg_no);
					for (MfgActReg_Chk01_HdrR r : notErrDown0) {
						notErrDown4.addAll(chkOpe.down4().subList(down4Key, r.peg_no()));
					}
	
					MCList<MfgActReg_Chk01_DtlYieldR> notErrDown5 = MCList.create(MfgActReg_Chk01_DtlYieldR.class);
					MCIndexKey down5Key = chkOpe.down5().createIndex(MfgActReg_Chk01_DtlYieldR.$hdr_peg_no);
					for (MfgActReg_Chk01_HdrR r : notErrDown0) {
						notErrDown5.addAll(chkOpe.down5().subList(down5Key, r.peg_no()));
					}
	
					MCList<MfgActReg_Chk01_DtlByProdR> notErrDown6 = MCList.create(MfgActReg_Chk01_DtlByProdR.class);
					MCIndexKey down6Key = chkOpe.down6().createIndex(MfgActReg_Chk01_DtlByProdR.$hdr_peg_no);
					for (MfgActReg_Chk01_HdrR r : notErrDown0) {
						notErrDown6.addAll(chkOpe.down6().subList(down6Key, r.peg_no()));
					}
	
					MfgActReg_Upd02_Hdr().setAll(notErrDown0);
					MfgActReg_Upd02_DtlOper().setAll(notErrDown1);
					MfgActReg_Upd02_DtlInpt().setAll(notErrDown2);
					MfgActReg_Upd02_DtlLoss().setAll(notErrDown3);
					MfgActReg_Upd02_DtlWk().setAll(notErrDown4);
					MfgActReg_Upd02_DtlYield().setAll(notErrDown5);
					MfgActReg_Upd02_DtlByProd().setAll(notErrDown6);
				}
			}
		}
		
		/**
		 * ヘッダ単位の登録時にチェック処理でエラーとなった場合の下り電文設定処理
		 * @param thisUpR
		 * @param chkDown0R
		 */
		protected void setHdrModeChkErrDown(MfgActReg_Upd02_Hdr1R thisUpR, MfgActReg_Chk01_HdrR chkDown0R) {
			thisUpR.rtn_sts_typ(chkDown0R.rtn_sts_typ());
			thisUpR.bkf_tgt_cnt(chkDown0R.bkf_tgt_cnt());
			thisUpR.bkf_success_cnt(MCNumber.ZERO);
			// 失敗件数には対象件数を設定
			thisUpR.bkf_failure_cnt(chkDown0R.bkf_tgt_cnt());
		}

		/**
		 * 工程単位の登録時にチェック処理でエラーとなった場合の下り電文設定処理
		 * @param thisUpR
		 * @param chkDown0R
		 */
		protected void setOperModeChkErrDown(MfgActReg_Upd02_Hdr1R thisUpR,
				MfgActReg_Chk01_HdrR chkDown0R, MfgActReg_Chk01_DtlOperR chkDown1R) {
			thisUpR.rtn_sts_typ(chkDown0R.rtn_sts_typ());
			thisUpR.bkf_tgt_cnt(chkDown1R.bkf_tgt_cnt());
			thisUpR.bkf_success_cnt(MCNumber.ZERO);
			// 失敗件数には対象件数を設定
			thisUpR.bkf_failure_cnt(chkDown1R.bkf_tgt_cnt());
		}

		protected MCList<MfgActReg_Upd02_Hdr1R> getHdrUpLForChk01(MCList<MfgActReg_Upd02_Hdr1R> notErrHdrUpL) {
			MCList<MfgActReg_Upd02_Hdr1R> retL = MCList.create(MfgActReg_Upd02_Hdr1R.class);
			
			if (up0().oper_unit_flg()) {
				for (MCList<MfgActReg_Upd02_Hdr1R> gL : notErrHdrUpL.groupList(
						MfgActReg_Upd02_Hdr1R.$mfg_inst_no,
						MfgActReg_Upd02_Hdr1R.$div_seq)) {
					// rowの値を変更する必要があるため、cloneしてaddする
					MfgActReg_Upd02_Hdr1R retR = gL.get(0).clone();
					// ヘッダの製造状況区分、日付は後の処理で設定するためクリアする（工程実績をDBから取得する必要があるため）
					retR.mfg_sts_typ(null);
					retR.st_act_tm(null);
					retR.st_ac_dt(null);
					retR.end_act_tm(null);
					retR.end_ac_dt(null);
					retL.add(retR);
					
					for (MfgActReg_Upd02_Hdr1R gR : gL) {
						if (isNull(gR.mfg_act_no())) {
							// 後の処理でDBから取得した工程実績とマッチングするために、新規の場合は一時的に0を設定（後の処理で上書きされる）
							gR.div_seq(MCNumber.ZERO);
						}
					}
				}
				// ヘッダ単位で一意の番号を設定する
				setPegNo(retL);
			}
			else {
				retL.addAll(notErrHdrUpL);
			}
			_hdrUpCache = new FXUCL_Cache<MfgActReg_Upd02_Hdr1R>();
			_hdrUpCache.setFixMaxCacheSize(-1);
			
			for (MfgActReg_Upd02_Hdr1R retR : retL) {
				if (isNull(retR.mfg_act_no())) {
					// ワークテーブルに格納しデータを取得するために、新規の場合は一時的に0を設定（後の処理で上書きされる）
					retR.div_seq(MCNumber.ZERO);
				}
				_hdrUpCache.putCache(new MCNumber[]{retR.peg_no()}, retR);
			}
			
			return retL;
		}
		
		// ヘッダコンテナ（ヘッダ単位、工程単位共通）
		protected Map_MfgActReg_Chk01_HdrR_MfgActReg_Upd02_Hdr1R<MfgActReg_Chk01_HdrR,MfgActReg_Upd02_Hdr1R> createMap_MfgActReg_Chk01_HdrR_MfgActReg_Upd02_Hdr1R() {
			return new Map_MfgActReg_Chk01_HdrR_MfgActReg_Upd02_Hdr1R<MfgActReg_Chk01_HdrR, MfgActReg_Upd02_Hdr1R>();
		}

		public class Map_MfgActReg_Chk01_HdrR_MfgActReg_Upd02_Hdr1R<D extends MfgActReg_Chk01_HdrR, S extends MfgActReg_Upd02_Hdr1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActReg_Chk01_HdrR.$peg_no,MfgActReg_Upd02_Hdr1R.$peg_no);
				addColumnPathMap(MfgActReg_Chk01_HdrR.$mfg_sts_typ,MfgActReg_Upd02_Hdr1R.$mfg_sts_typ);
				addColumnPathMap(MfgActReg_Chk01_HdrR.$st_act_tm,MfgActReg_Upd02_Hdr1R.$st_act_tm);
				addColumnPathMap(MfgActReg_Chk01_HdrR.$st_ac_dt,MfgActReg_Upd02_Hdr1R.$st_ac_dt);
				addColumnPathMap(MfgActReg_Chk01_HdrR.$end_act_tm,MfgActReg_Upd02_Hdr1R.$end_act_tm);
				addColumnPathMap(MfgActReg_Chk01_HdrR.$end_ac_dt,MfgActReg_Upd02_Hdr1R.$end_ac_dt);
				addColumnPathMap(MfgActReg_Chk01_HdrR.$base_unit_st_act_qty,MfgActReg_Upd02_Hdr1R.$base_unit_st_act_qty);
				addColumnPathMap(MfgActReg_Chk01_HdrR.$rem_abort_flg,MfgActReg_Upd02_Hdr1R.$rem_abort_flg);
				addColumnPathMap(MfgActReg_Chk01_HdrR.$act_usr_cd,MfgActReg_Upd02_Hdr1R.$act_usr_cd);
				addColumnPathMap(MfgActReg_Chk01_HdrR.$act_dpt_cd,MfgActReg_Upd02_Hdr1R.$act_dpt_cd);
				addColumnPathMap(MfgActReg_Chk01_HdrR.$act_rpt_rmrks,MfgActReg_Upd02_Hdr1R.$mfg_act_rpt_rmrks);
				addColumnPathMap(MfgActReg_Chk01_HdrR.$intr_rmrks,MfgActReg_Upd02_Hdr1R.$mfg_act_intr_rmrks);
				addColumnPathMap(MfgActReg_Chk01_HdrR.$mfg_act_sub_char1,MfgActReg_Upd02_Hdr1R.$mfg_act_sub_char1);
				addColumnPathMap(MfgActReg_Chk01_HdrR.$mfg_act_sub_char2,MfgActReg_Upd02_Hdr1R.$mfg_act_sub_char2);
				addColumnPathMap(MfgActReg_Chk01_HdrR.$mfg_act_sub_char3,MfgActReg_Upd02_Hdr1R.$mfg_act_sub_char3);
				addColumnPathMap(MfgActReg_Chk01_HdrR.$itm_yield,MfgActReg_Upd02_Hdr1R.$itm_yield);
				addColumnPathMap(MfgActReg_Chk01_HdrR.$mfg_inst_no,MfgActReg_Upd02_Hdr1R.$mfg_inst_no);
				addColumnPathMap(MfgActReg_Chk01_HdrR.$mfg_inst_upd_cntr,MfgActReg_Upd02_Hdr1R.$mfg_inst_upd_cntr);
				addColumnPathMap(MfgActReg_Chk01_HdrR.$mfg_inst_pr_upd_cntr,MfgActReg_Upd02_Hdr1R.$mfg_inst_pr_upd_cntr);
				addColumnPathMap(MfgActReg_Chk01_HdrR.$mfg_act_upd_cntr,MfgActReg_Upd02_Hdr1R.$mfg_act_upd_cntr);
				addColumnPathMap(MfgActReg_Chk01_HdrR.$div_seq,MfgActReg_Upd02_Hdr1R.$div_seq);
				addColumnPathMap(MfgActReg_Chk01_HdrR.$mfg_act_no,MfgActReg_Upd02_Hdr1R.$mfg_act_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.lst_reg_flg(true);
				dest.act_immed_prnt_flg(up0().act_immed_prnt_flg());
				dest.upd_cntr_chk_flg(up0().upd_cntr_chk_flg());
				dest.is_src_batch_flg(up0().is_src_batch_flg());
			}
		}
		
		protected void setHdrChkCache(MCList<MfgActReg_Chk01_HdrR> chk01HdrL) {
			_hdrChkCache = new FXUCL_Cache<MfgActReg_Chk01_HdrR>();
			_hdrChkCache.setFixMaxCacheSize(-1);
			
			for (MfgActReg_Chk01_HdrR chk01HdrR : chk01HdrL) {
				_hdrChkCache.putCache(new MCNumber[]{chk01HdrR.peg_no()}, chk01HdrR);
			}
		}
		
		protected void insHdrWk(MCList<MfgActReg_Upd02_Hdr1R> hdrUpL) {
			// 製造指図ＮＯ、分割連番のワークテーブル
			MCList<MST_MFG_ACT_REM_R> wkL = MCList.create(MST_MFG_ACT_REM_R.class);
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(MST_MFG_ACT_REM_R.create("T"));
			dbWkDelete("MSBCL6050_MSW_MFG_ACT_REM_D01", wkL_bldr.getBaseDbc());
			for (MfgActReg_Upd02_Hdr1R hdrR : hdrUpL) {
				MST_MFG_ACT_REM_R wkR = MST_MFG_ACT_REM_R.create();
				wkR.mfg_inst_no(hdrR.mfg_inst_no());
				wkR.div_seq(hdrR.div_seq());
				wkL.add(wkR);
			}
			if (!wkL.isEmpty()) {
				dbWkInsert("MSBCL6050_MSW_MFG_ACT_REM_I01",
						wkL.groupBy(wkL_bldr.getBaseDbc().getKeyColumn()), wkL_bldr.getBaseDbc());
			}
		}
		
		/**
		 * ヘッダ単位で登録する場合の工程取得処理
		 */
		protected MCList<MfgActReg_Chk01_DtlOperR> getOperContainer(
				MCList<MfgActReg_Upd02_Hdr1R> hdrUpL,
				MCList<MfgActReg_Upd02_Hdr1R> notErrHdrUpL,
				MCList<MfgActReg_Chk01_HdrR> chk01HdrL) {
			MCList<MfgActReg_Chk01_DtlOperR> ret = MCList.create(MfgActReg_Chk01_DtlOperR.class);
			
			// 工程実績残＋工程実績の取得
			MSW_MFG_ACT_REM_KEY_R t2 = MSW_MFG_ACT_REM_KEY_R.create("T2");
			MST_OPER_ACT_R t3 = MST_OPER_ACT_R.create("T3");
			MST_OPER_INST_R t4 = MST_OPER_INST_R.create("T4");
			MST_MFG_ACT_R t5 = MST_MFG_ACT_R.create("T5");
			MCList<MST_OPER_ACT_REM_R> remL = MCList.create(MST_OPER_ACT_REM_R.class);
			MST_OPER_ACT_REM_R t = MST_OPER_ACT_REM_R.create("T");
			MCQueryApiBuilder remL_bldr = MCQueryApiBuilder.create(t);
			remL_bldr.setSelect(t.oper_inst_no);
			remL_bldr.addSelect(t.mfg_inst_no);
			remL_bldr.addSelect(t.div_seq);
			remL_bldr.addSelect(t3.mfg_act_no);
			remL_bldr.addSelect(t3.st_act_tm);
			remL_bldr.addSelect(t5.st_ac_dt);
			remL_bldr.addSelect(t3.end_act_tm);
			remL_bldr.addSelect(t5.end_ac_dt);
			remL_bldr.addSelect(t3.oper_act_no);
			remL_bldr.addSelect(t3.oper_yield);
			remL_bldr.addSelect(nvl2( t3.oper_act_no, t3.disp_seq, t4.disp_seq).as("disp_seq"));
			remL_bldr.addSelect(t3.intr_rmrks);
			remL_bldr.addSelect(t3.act_rpt_rmrks);
			remL_bldr.addSelect(t3.sub_char1);
			remL_bldr.addSelect(t3.sub_char2);
			remL_bldr.addSelect(t3.sub_char3);
			remL.addBooleanColumn("bkf_upd_flg");
			remL_bldr.addSelect(nvl2( t3.oper_act_no, t3.bkf_ctl_flg, t4.bkf_flg).as("bkf_upd_flg"));
			remL.addBooleanColumn("wk_cost_upd_calc_flg");
			remL_bldr.addSelect(nvl2( t3.oper_act_no, t3.wk_cost_calc_ctl_flg, t4.wk_cost_calc_flg).as("wk_cost_upd_calc_flg"));
			remL.addBooleanColumn("not_cmpl_flg");
			remL.addBooleanColumn("mes_flg");
			remL.addBooleanColumn("if_auto_reg_flg");
			remL.addBooleanColumn("bkf_not_ref_flg");
			remL_bldr.addSelect(cases() .when( t.mfg_sts_typ.eq(value(MSC_MFG_STS_TYP.STT.value()))
					.and(t3.end_act_tm.isNotNull()) ) .then(value(true))
					.otherwise(value(false)).as("not_cmpl_flg"));
			remL_bldr.addSelect(t3.mes_flg);
			remL_bldr.addSelect(t3.ext_sys_cd);
			remL_bldr.addSelect(t3.ext_oper_act_no);
			remL_bldr.addSelect(t3.if_auto_reg_flg);
			remL_bldr.addSelect(t3.bkf_not_ref_flg);
			remL_bldr.addSelect(t4.oper_ord_no);
			remL_bldr.addSelect(t4.oper_std_qty);
			remL_bldr.addSelect(t4.oper_conv_qty);
			remL_bldr.addSelect(t4.oper_unit_conv_rnd_typ);
			remL_bldr.addSelect(t4.oper_unit_dec_place);
			remL_bldr.addSelect(t4.oper_unit_cd);
			remL.addBooleanColumn("yield_oper_flg");
			remL_bldr.addSelect(t4.yield_oper_flg);
			remL_bldr.addSelect(t3.oper_unit_qty);
			
			remL_bldr.addInnerJoin(t2, bracket( t.mfg_inst_no.eq(t2.mfg_inst_no)
					.and(t.div_seq.eq(t2.div_seq))));
			remL_bldr.addLeftOuterJoin(t3, bracket( t.oper_inst_no.eq(t3.oper_inst_no)
					.and(t.div_seq.eq(t3.div_seq))));
			remL_bldr.addInnerJoin(t4, bracket( t.oper_inst_no.eq(t4.oper_inst_no)
					.and(t4.can_flg.eq(value(false)))));
			remL_bldr.addLeftOuterJoin(t5, bracket( t3.mfg_act_no.eq(t5.mfg_act_no)));
			dbSelect("MSBCL6050_MST_OPER_ACT_REM_S02", remL, remL_bldr);
			
			remL.sort(MST_OPER_ACT_REM_R.$oper_inst_no, MST_OPER_ACT_REM_R.$div_seq);
			
			MCIndexKey remIdxKey = remL.createIndex(MST_OPER_ACT_REM_R.$mfg_inst_no,
					MST_OPER_ACT_REM_R.$div_seq);
			
			// 工程単位で実績登録する際に、DBから取得した工程が上り電文に含まれているかをチェックする際に使用するIndxeKey
			MCIndexKey up1InstIdxKey = notErrHdrUpL.createIndex(
					MfgActReg_Upd02_Hdr1R.$oper_inst_no,
					MfgActReg_Upd02_Hdr1R.$div_seq,
					MfgActReg_Upd02_Hdr1R.$oper_act_no);
			MCIndexKey up1ActIdxKey = notErrHdrUpL.createIndex(MfgActReg_Upd02_Hdr1R.$oper_act_no);
			
			for (MfgActReg_Upd02_Hdr1R hdrUpR : hdrUpL) {
				MCList<MST_OPER_ACT_REM_R> remSubL = remL.subList(remIdxKey,
						hdrUpR.mfg_inst_no(), hdrUpR.div_seq());
				if (up0().oper_unit_flg()) {
					// 工程単位の場合に、工程コンテナを作成し、ヘッダの製造状況区分・日付を設定する
					MfgActReg_Chk01_HdrR chk01HdrR = _hdrChkCache.getCache(hdrUpR.peg_no());
					ret.addAll(getOperModeOperContainerAndEditHdr(notErrHdrUpL, chk01HdrR, 
							remSubL, up1InstIdxKey, up1ActIdxKey));
				}
				else {
					// ヘッダ単位の場合に、工程コンテナを作成する
					ret.addAll(getHdrModeOperContainer(hdrUpR, remSubL));
				}
			}
			if (!up0().oper_unit_flg()) {
				setPegNo(ret);
			}
			
			_operChkCache = new FXUCL_Cache<MfgActReg_Chk01_DtlOperR>();
			_operChkCache.setFixMaxCacheSize(-1);
			for (MfgActReg_Chk01_DtlOperR operR : ret) {
				_operChkCache.putCache(new MCNumber[]{operR.peg_no()}, operR);
			}
			
			return ret;
		}
		
		protected MCList<MfgActReg_Chk01_DtlOperR> getOperModeOperContainerAndEditHdr(
				MCList<MfgActReg_Upd02_Hdr1R> notErrHdrUpL,
				MfgActReg_Chk01_HdrR chk01HdrR,
				MCList<MST_OPER_ACT_REM_R> remSubL, MCIndexKey up1InstIdxKey,
				MCIndexKey up1ActIdxKey) {
			MCList<MfgActReg_Chk01_DtlOperR> retL = MCList.create(MfgActReg_Chk01_DtlOperR.class);
			
			// 工程の情報を元に、製造状況区分、日付を設定するために一時的に使用するコンテナ
			MCList<MfgActReg_Upd02_Hdr1R> tmpL = MCList.create(MfgActReg_Upd02_Hdr1R.class);
			for (MST_OPER_ACT_REM_R remR : remSubL) {
				MCList<MfgActReg_Upd02_Hdr1R> upOperL = MCList.create(MfgActReg_Upd02_Hdr1R.class);
				
				// DBから取得した工程に対して上り電文が存在するかどうかを確認
				String operActNo = remR.getStringNE("oper_act_no");
				// 実績未登録の上り電文は、行コピーして登録される場合があるためgetFirstではなくsubList
				upOperL.addAll(notErrHdrUpL.subList(up1InstIdxKey, remR.oper_inst_no(), remR.div_seq(), null));

				boolean mod_flg = false;
				if (!isNull(operActNo)) {
					// 実績登録済みの場合は、行コピー時に工程実績NOがクリアされるため、複数件取得されることはない
					upOperL.add(notErrHdrUpL.getFirst(up1ActIdxKey, operActNo));
					if (!isNull(notErrHdrUpL.getFirst(up1ActIdxKey, operActNo))) {
						mod_flg = notErrHdrUpL.getFirst(up1ActIdxKey, operActNo).isStatusModify();
					}
				}

				if (!upOperL.isEmpty()) {
					// DBから取得した工程に対応する上り電文が存在する場合
					for (MfgActReg_Upd02_Hdr1R upOperR : upOperL) {
						MfgActReg_Chk01_DtlOperR retR = MfgActReg_Chk01_DtlOperR.create();
						retR.hdr_peg_no(chk01HdrR.peg_no());
						retR.disp_seq(remR.getNumberNE("disp_seq"));
						retR.oper_ord_no(remR.getStringNE("oper_ord_no"));
						retR.bkf_upd_flg(remR.getBooleanNE("bkf_upd_flg"));
						retR.wk_cost_upd_calc_flg(remR.getBooleanNE("wk_cost_upd_calc_flg"));
						retR.oper_std_qty(remR.getNumberNE("oper_std_qty"));
						retR.oper_conv_qty(remR.getNumberNE("oper_conv_qty"));
						retR.yield_oper_flg(remR.getBooleanNE("yield_oper_flg"));
						retR.bkf_not_ref_flg(remR.getBooleanNE("bkf_not_ref_flg"));

						copy(retR, upOperR, createMap_MfgActReg_Chk01_DtlOperR_MfgActReg_Upd02_Hdr1R());
						// 工程実績完了バッチから呼び出す場合、工程実績のＢＦ未反映ＦＬＧを変更しない
						if (up0().is_oper_act_cmpl_batch_flg()) {
							retR.bkf_not_ref_flg(remR.getBooleanNE("bkf_not_ref_flg"));
						}
						retL.add(retR);
					}
					
					// tmpLには上り電文から取得した値を設定する
					MfgActReg_Upd02_Hdr1R tmpR = MfgActReg_Upd02_Hdr1R.create();
					tmpR.st_act_tm((MCDate)upOperL.min(MfgActReg_Upd02_Hdr1R.$st_act_tm));
					tmpR.st_ac_dt((MCDate)upOperL.min(MfgActReg_Upd02_Hdr1R.$st_ac_dt));
					tmpR.end_act_tm((MCDate)upOperL.max(MfgActReg_Upd02_Hdr1R.$end_act_tm));
					tmpR.end_ac_dt((MCDate)upOperL.max(MfgActReg_Upd02_Hdr1R.$end_ac_dt));
					// 工程の未完了フラグがオンのレコードが存在する場合はtrue
					tmpR.not_cmpl_flg((boolean)upOperL.max(MfgActReg_Upd02_Hdr1R.$not_cmpl_flg));
					tmpR.oper_inst_no(upOperL.get(0).oper_inst_no());
					// 上り電文の内容かどうかを判断するＦＬＧを追加
					tmpR.setBooleanNE("up_oper_flg", true);
					tmpL.add(tmpR);
					// 既登録分の考慮（訂正でない工程実績レコードの場合、tmpLにDBから取得した値も設定する)
					if (!mod_flg && !isNull(remR.getDateNE("st_act_tm"))) {
						MfgActReg_Upd02_Hdr1R tmpR2 = MfgActReg_Upd02_Hdr1R.create();
						tmpR2.st_act_tm(remR.getDateNE("st_act_tm"));
						tmpR2.st_ac_dt(remR.getDateNE("st_ac_dt"));
						tmpR2.end_act_tm(remR.getDateNE("end_act_tm"));
						tmpR2.end_ac_dt(remR.getDateNE("end_ac_dt"));
						tmpR2.not_cmpl_flg(remR.getBooleanNE("not_cmpl_flg"));
						tmpR2.oper_inst_no(remR.oper_inst_no());
						// 上り電文の内容かどうかを判断するＦＬＧを追加
						tmpR2.setBooleanNE("up_oper_flg", false);
						tmpL.add(tmpR2);
					}
				}
				else {
					// DBから取得した工程に対応する上り電文が存在しない場合
					// tmpLにはDBから取得した値を設定する
					MfgActReg_Upd02_Hdr1R tmpR = MfgActReg_Upd02_Hdr1R.create();
					tmpR.st_act_tm(remR.getDateNE("st_act_tm"));
					tmpR.st_ac_dt(remR.getDateNE("st_ac_dt"));
					tmpR.end_act_tm(remR.getDateNE("end_act_tm"));
					tmpR.end_ac_dt(remR.getDateNE("end_ac_dt"));
					tmpR.not_cmpl_flg(remR.getBooleanNE("not_cmpl_flg"));
					tmpR.oper_inst_no(remR.oper_inst_no());
					// 上り電文の内容かどうかを判断するＦＬＧを追加
					tmpR.setBooleanNE("up_oper_flg", false);
					tmpL.add(tmpR);
				}
			}
			
			// 着手日付
			chk01HdrR.st_act_tm((MCDate)tmpL.min(MfgActReg_Upd02_Hdr1R.$st_act_tm));
			chk01HdrR.st_ac_dt((MCDate)tmpL.min(MfgActReg_Upd02_Hdr1R.$st_ac_dt));
			// 終了日付
			// ※maxメソッドはnullを無視するため、nullのレコードの有無を確認し、nullのレコードが存在した場合は、nullにする
			MCDate maxEndActTm = (MCDate)tmpL.max(MfgActReg_Upd02_Hdr1R.$end_act_tm);
			MCDate maxEndAcDt = (MCDate)tmpL.max(MfgActReg_Upd02_Hdr1R.$end_ac_dt);
			boolean notCmplFlg = false;
			for (MCList<MfgActReg_Upd02_Hdr1R> grpL : tmpL.groupList(MfgActReg_Upd02_Hdr1R.$oper_inst_no)) {
				MfgActReg_Upd02_Hdr1R upOperR = MfgActReg_Upd02_Hdr1R.create();
				upOperR = grpL.getFirst("up_oper_flg", true);
				// 上り電文の未完了フラグを最優先で反映
				if (!isNull(upOperR)) {
					notCmplFlg = upOperR.not_cmpl_flg();
				}
				// それ以外の場合、工程の未完了フラグがオンのレコードが存在する場合はtrue
				else {
					notCmplFlg = (boolean)grpL.max(MfgActReg_Upd02_Hdr1R.$not_cmpl_flg);
				}
				
				// notCmplFlgがtrueになったらこれ以上確認する必要はないのでループを抜ける
				if (notCmplFlg) {
					break;
				}
			}
			for (MfgActReg_Upd02_Hdr1R tmpR : tmpL) {
				if (isNull(tmpR.end_act_tm()) || notCmplFlg) {
					maxEndActTm = null;
					maxEndAcDt = null;
					break;
				}
			}
			chk01HdrR.end_act_tm(maxEndActTm);
			chk01HdrR.end_ac_dt(maxEndAcDt);
			if (isNull(chk01HdrR.end_act_tm())) {
				chk01HdrR.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
			}
			else {
				chk01HdrR.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
			}
			
			retL = retL.distinctNE(MfgActReg_Chk01_DtlOperR.$hdr_peg_no,MfgActReg_Chk01_DtlOperR.$peg_no);
			
			return retL;
		}
		
		// 上り電文⇒工程（工程単位で登録する場合）
		protected Map_MfgActReg_Chk01_DtlOperR_MfgActReg_Upd02_Hdr1R<MfgActReg_Chk01_DtlOperR,MfgActReg_Upd02_Hdr1R> createMap_MfgActReg_Chk01_DtlOperR_MfgActReg_Upd02_Hdr1R() {
			return new Map_MfgActReg_Chk01_DtlOperR_MfgActReg_Upd02_Hdr1R<MfgActReg_Chk01_DtlOperR, MfgActReg_Upd02_Hdr1R>();
		}

		public class Map_MfgActReg_Chk01_DtlOperR_MfgActReg_Upd02_Hdr1R<D extends MfgActReg_Chk01_DtlOperR, S extends MfgActReg_Upd02_Hdr1R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActReg_Chk01_DtlOperR.$peg_no, MfgActReg_Upd02_Hdr1R.$peg_no);
				addColumnPathMap(MfgActReg_Chk01_DtlOperR.$oper_unit_act_qty, MfgActReg_Upd02_Hdr1R.$oper_unit_act_qty);
				addColumnPathMap(MfgActReg_Chk01_DtlOperR.$oper_yield, MfgActReg_Upd02_Hdr1R.$oper_yield);
				addColumnPathMap(MfgActReg_Chk01_DtlOperR.$oper_act_intr_rmrks, MfgActReg_Upd02_Hdr1R.$oper_act_intr_rmrks);
				addColumnPathMap(MfgActReg_Chk01_DtlOperR.$oper_act_rpt_rmrks, MfgActReg_Upd02_Hdr1R.$oper_act_rpt_rmrks);
				addColumnPathMap(MfgActReg_Chk01_DtlOperR.$oper_act_sub_char1, MfgActReg_Upd02_Hdr1R.$oper_act_sub_char1);
				addColumnPathMap(MfgActReg_Chk01_DtlOperR.$oper_act_sub_char2, MfgActReg_Upd02_Hdr1R.$oper_act_sub_char2);
				addColumnPathMap(MfgActReg_Chk01_DtlOperR.$oper_act_sub_char3, MfgActReg_Upd02_Hdr1R.$oper_act_sub_char3);
				addColumnPathMap(MfgActReg_Chk01_DtlOperR.$oper_inst_no, MfgActReg_Upd02_Hdr1R.$oper_inst_no);
				addColumnPathMap(MfgActReg_Chk01_DtlOperR.$oper_act_no, MfgActReg_Upd02_Hdr1R.$oper_act_no);
				addColumnPathMap(MfgActReg_Chk01_DtlOperR.$st_act_tm, MfgActReg_Upd02_Hdr1R.$st_act_tm);
				addColumnPathMap(MfgActReg_Chk01_DtlOperR.$end_act_tm, MfgActReg_Upd02_Hdr1R.$end_act_tm);
				addColumnPathMap(MfgActReg_Chk01_DtlOperR.$not_cmpl_flg, MfgActReg_Upd02_Hdr1R.$not_cmpl_flg);
				addColumnPathMap(MfgActReg_Chk01_DtlOperR.$mes_flg, MfgActReg_Upd02_Hdr1R.$mes_flg);
				addColumnPathMap(MfgActReg_Chk01_DtlOperR.$ext_sys_cd, MfgActReg_Upd02_Hdr1R.$ext_sys_cd);
				addColumnPathMap(MfgActReg_Chk01_DtlOperR.$ext_oper_act_no, MfgActReg_Upd02_Hdr1R.$ext_oper_act_no);
				addColumnPathMap(MfgActReg_Chk01_DtlOperR.$if_auto_reg_flg, MfgActReg_Upd02_Hdr1R.$if_auto_reg_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (dest.bkf_upd_flg() && up0().not_bkf_upd_flg()
						&& (isNull(dest.getStringNE("OPER_ACT_NO"))
								|| (!isNull(dest.getStringNE("OPER_ACT_NO"))
										&& dest.getBooleanNE("bkf_not_ref_flg")))) {
					dest.bkf_not_ref_flg(true);
				}
				else {
					dest.bkf_not_ref_flg(false);
				}
			}
		}
		
		protected MCList<MfgActReg_Chk01_DtlOperR> getHdrModeOperContainer(MfgActReg_Upd02_Hdr1R hdrUpR,
				MCList<MST_OPER_ACT_REM_R> remSubL) {
			MCList<MfgActReg_Chk01_DtlOperR> retL = MCList.create(MfgActReg_Chk01_DtlOperR.class);
			
			for (MST_OPER_ACT_REM_R remR : remSubL) {
				MfgActReg_Chk01_DtlOperR retR = MfgActReg_Chk01_DtlOperR.create();

				retR.setAttributes(hdrUpR);

				// 品目単位に入力する場合、ここで工程単位の実績数量を設定しないと別途単票画面で設定する手間が発生するため、
				// ヘッダの着手数量を換算した値を設定する
				retR.oper_conv_qty(remR.getNumberNE("oper_conv_qty"));
				retR.oper_std_qty(remR.getNumberNE("oper_std_qty"));
				retR.oper_unit_dec_place(remR.getNumberNE("oper_unit_dec_place"));
				retR.oper_unit_conv_rnd_typ(remR.getStringNE("oper_unit_conv_rnd_typ"));
				retR.oper_unit_cd(remR.getStringNE("oper_unit_cd"));
				if(isNull(remR.getNumberNE("OPER_UNIT_QTY"))) {
					retR.oper_unit_act_qty(convQtyBaseToOper(hdrUpR.base_unit_st_act_qty(),
							retR.oper_conv_qty(), retR.oper_std_qty(),
							retR.oper_unit_dec_place(), retR.oper_unit_conv_rnd_typ()));
					retR.setBooleanNE("hdr_qty_flg", true);
				}
				else {
					retR.oper_unit_act_qty(remR.getNumberNE("OPER_UNIT_QTY"));
					retR.setBooleanNE("hdr_qty_flg", false);
				}
				
				retR.oper_yield(remR.getNumberNE("oper_yield"));
				retR.disp_seq(remR.getNumberNE("disp_seq"));
				retR.oper_act_intr_rmrks(remR.getStringNE("intr_rmrks"));
				retR.oper_act_rpt_rmrks(remR.getStringNE("act_rpt_rmrks"));
				retR.oper_act_sub_char1(remR.getStringNE("sub_char1"));
				retR.oper_act_sub_char2(remR.getStringNE("sub_char2"));
				retR.oper_act_sub_char3(remR.getStringNE("sub_char3"));
				retR.bkf_upd_flg(remR.getBooleanNE("bkf_upd_flg"));
				if (retR.bkf_upd_flg() && up0().not_bkf_upd_flg()
						&& (isNull(remR.getStringNE("OPER_ACT_NO"))
								|| (!isNull(remR.getStringNE("OPER_ACT_NO"))
										&& remR.getBooleanNE("bkf_not_ref_flg")))) {
					retR.bkf_not_ref_flg(true);
				}
				else {
					retR.bkf_not_ref_flg(false);
				}
				retR.wk_cost_upd_calc_flg(remR.getBooleanNE("wk_cost_upd_calc_flg"));
				retR.oper_ord_no(remR.getStringNE("oper_ord_no"));
				retR.oper_inst_no(remR.getStringNE("oper_inst_no"));
				retR.oper_act_no(remR.getStringNE("oper_act_no"));
				retR.not_cmpl_flg(remR.getBooleanNE("not_cmpl_flg"));
				retR.mes_flg(remR.getBooleanNE("mes_flg"));
				retR.ext_sys_cd(remR.getStringNE("ext_sys_cd"));
				retR.ext_oper_act_no(remR.getStringNE("ext_oper_act_no"));
				retR.if_auto_reg_flg(remR.getBooleanNE("if_auto_reg_flg"));
				retR.yield_oper_flg(remR.getBooleanNE("yield_oper_flg"));
				
				retR.hdr_peg_no(hdrUpR.peg_no());
				if(isNull(remR.getNumberNE("OPER_UNIT_QTY"))) {
					retR.st_act_tm(hdrUpR.st_act_tm());
				}
				else {
					retR.st_act_tm(remR.getDateNE("st_act_tm"));
				}
				retR.end_act_tm(hdrUpR.end_act_tm());
				
				if (retR.st_act_tm().gt(retR.end_act_tm())) {
					retR.st_act_tm(hdrUpR.st_act_tm());
				}
				
				retL.add(retR);
			}
			return retL;
		}

		/**
		 * 出来高取得処理
		 */
		protected void crtYieldAndByProdContainer(
				MCList<MfgActReg_Upd02_DtlYieldByProdR> dtlUpL,
				MCList<MfgActReg_Chk01_DtlOperR> chk01OperL,
				MCList<MfgActReg_Chk01_DtlYieldR> chk01YieldL,
				MCList<MfgActReg_Chk01_DtlByProdR> chk01ByProdL) {
			MCIndexKey operIdxKey;
			if (up0().oper_unit_flg()) {
				operIdxKey = chk01OperL.createIndex(MfgActReg_Chk01_DtlOperR.$peg_no);
			}
			else {
				operIdxKey = chk01OperL.createIndex(MfgActReg_Chk01_DtlOperR.$hdr_peg_no);
			}
			
			for (MfgActReg_Upd02_DtlYieldByProdR dtlUpR : dtlUpL) {
				// 対応する工程の取得
				MfgActReg_Chk01_DtlOperR operR = null;
				if (up0().oper_unit_flg()) {
					operR = chk01OperL.getFirst(operIdxKey, dtlUpR.hdr_peg_no());
				}
				else {
					MfgActReg_Upd02_Hdr1R hdrR = _hdrUpCache.getCache(dtlUpR.hdr_peg_no());
					MCList<MfgActReg_Chk01_DtlOperR> operSubL = chk01OperL.subList(operIdxKey, hdrR.peg_no());
					if (!isNull(dtlUpR.oper_act_no())) {
						// 実績登録済みの場合は、工程実績ＮＯを元に工程と出来高を紐つける
						operR = operSubL.getFirst(MfgActReg_Chk01_DtlOperR.$oper_act_no,
								dtlUpR.oper_act_no());
					}
					else {
						// 実績未登録の場合は、工程指図ＮＯを元に工程と出来高を紐つける
						operR = operSubL.getFirst(MfgActReg_Chk01_DtlOperR.$oper_inst_no,
								dtlUpR.oper_inst_no());
					}
				}
				// 出来高と副産品の振り分け
				if (MAC_YIELD_TYP.isGOOD(dtlUpR.yield_typ()) || MAC_YIELD_TYP.isDFCT(dtlUpR.yield_typ())) {
					MfgActReg_Chk01_DtlYieldR tmpR = MfgActReg_Chk01_DtlYieldR.create();
					copy(tmpR, dtlUpR, createMap_MfgActReg_Chk01_DtlYieldR_MfgActReg_Upd02_DtlYieldByProdR());
					tmpR.hdr_peg_no(operR.hdr_peg_no());
					tmpR.oper_peg_no(operR.peg_no());
					chk01YieldL.add(tmpR);
				}
				else if (MAC_YIELD_TYP.isBYPROD(dtlUpR.yield_typ())) {
					MfgActReg_Chk01_DtlByProdR tmpR = MfgActReg_Chk01_DtlByProdR.create();
					copy(tmpR, dtlUpR, createMap_MfgActReg_Chk01_DtlByProdR_MfgActReg_Upd02_DtlYieldByProdR());
					tmpR.hdr_peg_no(operR.hdr_peg_no());
					tmpR.oper_peg_no(operR.peg_no());
					chk01ByProdL.add(tmpR);
				}
			}
		}
		
		// 出来高コンテナ
		protected Map_MfgActReg_Chk01_DtlYieldR_MfgActReg_Upd02_DtlYieldByProdR<MfgActReg_Chk01_DtlYieldR,MfgActReg_Upd02_DtlYieldByProdR> createMap_MfgActReg_Chk01_DtlYieldR_MfgActReg_Upd02_DtlYieldByProdR() {
			return new Map_MfgActReg_Chk01_DtlYieldR_MfgActReg_Upd02_DtlYieldByProdR<MfgActReg_Chk01_DtlYieldR, MfgActReg_Upd02_DtlYieldByProdR>();
		}

		public class Map_MfgActReg_Chk01_DtlYieldR_MfgActReg_Upd02_DtlYieldByProdR<D extends MfgActReg_Chk01_DtlYieldR, S extends MfgActReg_Upd02_DtlYieldByProdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$peg_no, MfgActReg_Upd02_DtlYieldByProdR.$peg_no);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$yield_typ, MfgActReg_Upd02_DtlYieldByProdR.$yield_typ);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$trd_unit_yield_act_qty, MfgActReg_Upd02_DtlYieldByProdR.$trd_unit_yield_act_qty);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$trd_unit_cd, MfgActReg_Upd02_DtlYieldByProdR.$trd_unit_cd);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$act_tm, MfgActReg_Upd02_DtlYieldByProdR.$act_tm);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$ac_dt, MfgActReg_Upd02_DtlYieldByProdR.$ac_dt);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$lot_no, MfgActReg_Upd02_DtlYieldByProdR.$lot_no);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$sublot_no, MfgActReg_Upd02_DtlYieldByProdR.$sublot_no);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$same_lot_flg, MfgActReg_Upd02_DtlYieldByProdR.$same_lot_flg);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$yield_rsn_cd, MfgActReg_Upd02_DtlYieldByProdR.$yield_rsn_cd);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$gd_cd, MfgActReg_Upd02_DtlYieldByProdR.$gd_cd);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$strg_loc_cd, MfgActReg_Upd02_DtlYieldByProdR.$strg_loc_cd);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$strg_str_ln_cd, MfgActReg_Upd02_DtlYieldByProdR.$strg_str_ln_cd);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$yield_rate, MfgActReg_Upd02_DtlYieldByProdR.$yield_rate);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$insp_cnt_rmrks, MfgActReg_Upd02_DtlYieldByProdR.$insp_cnt_rmrks);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$yield_act_intr_rmrks, MfgActReg_Upd02_DtlYieldByProdR.$yield_act_intr_rmrks);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$yield_act_rpt_rmrks, MfgActReg_Upd02_DtlYieldByProdR.$yield_act_rpt_rmrks);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$trd_rmrks, MfgActReg_Upd02_DtlYieldByProdR.$trd_rmrks);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$yield_act_sub_char1, MfgActReg_Upd02_DtlYieldByProdR.$yield_act_sub_char1);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$yield_act_sub_char2, MfgActReg_Upd02_DtlYieldByProdR.$yield_act_sub_char2);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$yield_act_sub_char3, MfgActReg_Upd02_DtlYieldByProdR.$yield_act_sub_char3);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$yield_schd_no, MfgActReg_Upd02_DtlYieldByProdR.$yield_schd_no);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$yield_act_no, MfgActReg_Upd02_DtlYieldByProdR.$yield_act_no);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$can_ac_dt, MfgActReg_Upd02_DtlYieldByProdR.$can_ac_dt);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$abort_flg, MfgActReg_Upd02_DtlYieldByProdR.$abort_flg);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$mes_flg, MfgActReg_Upd02_DtlYieldByProdR.$mes_flg);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$ext_sys_cd, MfgActReg_Upd02_DtlYieldByProdR.$ext_sys_cd);
				addColumnPathMap(MfgActReg_Chk01_DtlYieldR.$ext_yield_act_no, MfgActReg_Upd02_DtlYieldByProdR.$ext_yield_act_no);

			}
		}
		
		// 副産品コンテナ
		protected Map_MfgActReg_Chk01_DtlByProdR_MfgActReg_Upd02_DtlYieldByProdR<MfgActReg_Chk01_DtlByProdR,MfgActReg_Upd02_DtlYieldByProdR> createMap_MfgActReg_Chk01_DtlByProdR_MfgActReg_Upd02_DtlYieldByProdR() {
			return new Map_MfgActReg_Chk01_DtlByProdR_MfgActReg_Upd02_DtlYieldByProdR<MfgActReg_Chk01_DtlByProdR, MfgActReg_Upd02_DtlYieldByProdR>();
		}

		public class Map_MfgActReg_Chk01_DtlByProdR_MfgActReg_Upd02_DtlYieldByProdR<D extends MfgActReg_Chk01_DtlByProdR, S extends MfgActReg_Upd02_DtlYieldByProdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$hdr_peg_no, MfgActReg_Upd02_DtlYieldByProdR.$hdr_peg_no);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$peg_no, MfgActReg_Upd02_DtlYieldByProdR.$peg_no);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$itm_cd, MfgActReg_Upd02_DtlYieldByProdR.$itm_cd);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$itm_sub1, MfgActReg_Upd02_DtlYieldByProdR.$itm_sub1);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$itm_sub2, MfgActReg_Upd02_DtlYieldByProdR.$itm_sub2);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$itm_sub3, MfgActReg_Upd02_DtlYieldByProdR.$itm_sub3);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$trd_unit_yield_act_qty, MfgActReg_Upd02_DtlYieldByProdR.$trd_unit_yield_act_qty);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$trd_unit_cd, MfgActReg_Upd02_DtlYieldByProdR.$trd_unit_cd);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$act_tm, MfgActReg_Upd02_DtlYieldByProdR.$act_tm);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$ac_dt, MfgActReg_Upd02_DtlYieldByProdR.$ac_dt);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$lot_no, MfgActReg_Upd02_DtlYieldByProdR.$lot_no);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$sublot_no, MfgActReg_Upd02_DtlYieldByProdR.$sublot_no);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$same_lot_flg, MfgActReg_Upd02_DtlYieldByProdR.$same_lot_flg);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$sno1, MfgActReg_Upd02_DtlYieldByProdR.$sno1);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$sno2, MfgActReg_Upd02_DtlYieldByProdR.$sno2);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$sno3, MfgActReg_Upd02_DtlYieldByProdR.$sno3);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$sno4, MfgActReg_Upd02_DtlYieldByProdR.$sno4);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$yield_rsn_cd, MfgActReg_Upd02_DtlYieldByProdR.$yield_rsn_cd);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$quality_typ, MfgActReg_Upd02_DtlYieldByProdR.$quality_typ);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$gd_cd, MfgActReg_Upd02_DtlYieldByProdR.$gd_cd);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$strg_loc_cd, MfgActReg_Upd02_DtlYieldByProdR.$strg_loc_cd);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$strg_str_ln_cd, MfgActReg_Upd02_DtlYieldByProdR.$strg_str_ln_cd);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$yield_rate, MfgActReg_Upd02_DtlYieldByProdR.$yield_rate);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$yield_act_intr_rmrks, MfgActReg_Upd02_DtlYieldByProdR.$yield_act_intr_rmrks);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$trd_rmrks, MfgActReg_Upd02_DtlYieldByProdR.$trd_rmrks);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$yield_act_sub_char1, MfgActReg_Upd02_DtlYieldByProdR.$yield_act_sub_char1);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$yield_act_sub_char2, MfgActReg_Upd02_DtlYieldByProdR.$yield_act_sub_char2);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$yield_act_sub_char3, MfgActReg_Upd02_DtlYieldByProdR.$yield_act_sub_char3);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$yield_schd_no, MfgActReg_Upd02_DtlYieldByProdR.$yield_schd_no);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$yield_act_no, MfgActReg_Upd02_DtlYieldByProdR.$yield_act_no);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$can_ac_dt, MfgActReg_Upd02_DtlYieldByProdR.$can_ac_dt);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$abort_flg, MfgActReg_Upd02_DtlYieldByProdR.$abort_flg);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$mes_flg, MfgActReg_Upd02_DtlYieldByProdR.$mes_flg);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$ext_sys_cd, MfgActReg_Upd02_DtlYieldByProdR.$ext_sys_cd);
				addColumnPathMap(MfgActReg_Chk01_DtlByProdR.$ext_yield_act_no, MfgActReg_Upd02_DtlYieldByProdR.$ext_yield_act_no);

			}
		}
		
		protected void insOperWk(MCList<MfgActReg_Chk01_DtlOperR> chk01OperL) {
			// 工程実績残のワークテーブル
			MCList<MST_OPER_ACT_REM_R> remL = MCList.create(MST_OPER_ACT_REM_R.class);
			MCQueryApiBuilder remL_bldr = MCQueryApiBuilder.create(MST_OPER_ACT_REM_R.create("T"));
			dbWkDelete("MSBCL6050_MSW_OPER_ACT_REM_D01", remL_bldr.getBaseDbc());
			for (MfgActReg_Chk01_DtlOperR operR : chk01OperL) {
				MfgActReg_Upd02_Hdr1R hdrUpR = _hdrUpCache.getCache(operR.hdr_peg_no());
				
				MST_OPER_ACT_REM_R remR = MST_OPER_ACT_REM_R.create();
				remR.oper_inst_no(operR.oper_inst_no());
				remR.div_seq(hdrUpR.div_seq());
				remL.add(remR);
			}
			if (!remL.isEmpty()) {
				dbWkInsert("MSBCL6050_MSW_OPER_ACT_REM_I01",
						remL.groupBy(remL_bldr.getBaseDbc().getKeyColumn()), remL_bldr.getBaseDbc());
			}
		}
		
		/**
		 * 投入、ロス取得処理
		 */
		protected void crtInptAndLossContainer(
				MCList<MfgActReg_Chk01_DtlOperR> chk01OperL,
				MCList<MfgActReg_Chk01_DtlInptR> chk01InptL,
				MCList<MfgActReg_Chk01_DtlLossR> chk01LossL) {
			
			// ----------------------------------- 投入コンテナの作成 ------------------------------------
			MSW_OPER_ACT_REM_KEY_R t2 = MSW_OPER_ACT_REM_KEY_R.create("T2");
			MST_INPT_ACT_R t3 = MST_INPT_ACT_R.create("T3");
			MST_INPT_SCHD_R t4 = MST_INPT_SCHD_R.create("T4");
			MSVT_LOT_LIST_R t5 = MSVT_LOT_LIST_R.create("T5");
			MSVT_INPT_SCHD_PR_R t6 = MSVT_INPT_SCHD_PR_R.create("T6");
			MST_MFG_INST_R t7 = MST_MFG_INST_R.create("T7");
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			MCList<MST_INPT_ACT_REM_R> remL = MCList.create(MST_INPT_ACT_REM_R.class);
			MST_INPT_ACT_REM_R t = MST_INPT_ACT_REM_R.create("T");
			MCQueryApiBuilder remL_bldr = MCQueryApiBuilder.create(t);
			remL_bldr.setSelect(t.inpt_schd_no);
			remL_bldr.addSelect(t.oper_inst_no);
			remL_bldr.addSelect(t.div_seq);
			remL_bldr.addSelect(t.base_unit_fxd_rqmt_rem_qty);
			remL_bldr.addSelect(t.cont_fxd_rqmt_rem_qty);
			remL.addBooleanColumn("abort_flg");
			remL_bldr.addSelect(cases().when(t.base_unit_inpt_abort_qty.gt(value(0)))
					.then(value(true)).otherwise(value(false)).as("abort_flg"));

			remL_bldr.addSelect(t4.itm_cd);
			remL_bldr.addSelect(t4.itm_sub1);
			remL_bldr.addSelect(t4.itm_sub2);
			remL_bldr.addSelect(t4.itm_sub3);
			// 指図時に代替品やロットを決めていない場合は、登録の都度ロット提案で決定するため、実績の値は見ない
			remL.addBooleanColumn("alt_itm_fix_flg");
			remL_bldr.addSelect(t4.alt_itm_fix_flg);
			remL_bldr.addSelect(t4.lot_no);
			remL_bldr.addSelect(t4.sublot_no);
			remL_bldr.addSelect(t4.ver_no);
			remL_bldr.addSelect(t4.gd_cd);
			remL_bldr.addSelect(nvl( t4.alloc_sno1, t4.sno1).as("sno1"));
			remL_bldr.addSelect(nvl( t4.alloc_sno2, t4.sno2).as("sno2"));
			remL_bldr.addSelect(nvl( t4.alloc_sno3, t4.sno3).as("sno3"));
			remL_bldr.addSelect(nvl( t4.alloc_sno4, t4.sno4).as("sno4"));
			remL_bldr.addSelect(t4.bkf_typ);
			remL_bldr.addSelect(t4.recalc_grp);
			remL_bldr.addSelect(t4.recalc_grp_seq);
			remL_bldr.addSelect(nvl( t4.std_cont_fctr, m1.std_cont_fctr).as("std_cont_fctr"));
			remL_bldr.addSelect(t4.act_cont_fctr);
			remL_bldr.addSelect(t4.alt_grp_cd);
			remL_bldr.addSelect(t4.alt_grp_seq);
			remL_bldr.addSelect(t4.prov_typ);
			remL_bldr.addSelect(t4.inpt_rsn_cd);
			
			remL_bldr.addSelect(t5.first_gr_dt);
			remL_bldr.addSelect(t5.lot_seq);
			
			remL_bldr.addSelect(t3.acxfr_qty);
			remL_bldr.addSelect(t3.acxfr_rsn_cd);
			remL_bldr.addSelect(t3.acxfr_bd_dpt_cd);
			remL_bldr.addSelect(t3.intr_rmrks.as("inpt_act_intr_rmrks"));
			remL_bldr.addSelect(t3.act_rpt_rmrks.as("inpt_act_rpt_rmrks"));
			remL_bldr.addSelect(t3.trd_rmrks);
			remL_bldr.addSelect(t3.sub_char1.as("inpt_act_sub_char1"));
			remL_bldr.addSelect(t3.sub_char2.as("inpt_act_sub_char2"));
			remL_bldr.addSelect(t3.sub_char3.as("inpt_act_sub_char3"));
			remL.addBooleanColumn("bkf_upd_flg");
			remL_bldr.addSelect(nvl2( t3.inpt_act_no, t3.bkf_ctl_flg, value(true)).as("bkf_upd_flg"));
			remL_bldr.addSelect(nvl2( t3.inpt_act_no, t3.inpt_loc_cd, t4.inpt_loc_cd).as("inpt_loc_cd"));
			remL_bldr.addSelect(nvl2( t3.inpt_act_no, t3.inpt_str_ln_cd, t4.inpt_str_ln_cd).as("inpt_str_ln_cd"));
			remL_bldr.addSelect(t3.inpt_act_no);
			remL_bldr.addSelect(t3.ac_dt);
			remL_bldr.addSelect(t3.act_tm);
			remL_bldr.addSelect(t3.stk_id_typ);
			remL_bldr.addSelect(t3.stk_bp_cd);
			remL_bldr.addSelect(t3.stk_arrv_bp_cd);
			remL_bldr.addSelect(t3.base_unit_inpt_qty);
			remL_bldr.addSelect(t3.cont_qty);
			remL_bldr.addSelect(t3.oper_act_no);
			remL_bldr.addSelect(t3.inpt_rsn_cd.as("inpt_act_inpt_rsn_cd"));
			remL.addBooleanColumn("mes_flg");
			remL.addBooleanColumn("if_auto_reg_flg");
			remL_bldr.addSelect(t3.mes_flg);
			remL_bldr.addSelect(t3.ext_sys_cd);
			remL_bldr.addSelect(t3.ext_inpt_act_no);
			remL_bldr.addSelect(t3.if_auto_reg_flg);
			
			remL_bldr.addSelect(m1.itm_typ);
			remL_bldr.addSelect(m1.itm_typ_d_cd);
			remL_bldr.addSelect(m1.dec_place);
			remL_bldr.addSelect(m1.rnd_typ);
			remL.addBooleanColumn("cont_fctr_flg");
			remL_bldr.addSelect(m1.cont_fctr_flg);
			remL_bldr.addSelect(m1.cont_fctr_dec_place);

			remL_bldr.addSelect(t4.base_unit_inpt_qty.subtract(t6.base_unit_inpt_qty).as("base_unit_inpt_st_qty"));
			remL_bldr.addSelect(t4.base_unit_fxd_rqmt_qty.subtract(t6.base_unit_fxd_rqmt_qty).as("base_unit_fxd_rqmt_st_qty"));
			remL_bldr.addSelect(t4.cont_inpt_qty.subtract(t6.cont_inpt_qty).as("cont_inpt_st_qty"));
			remL_bldr.addSelect(t4.cont_fxd_rqmt_qty.subtract(t6.cont_fxd_rqmt_qty).as("cont_fxd_rqmt_st_qty"));
			
			remL_bldr.addSelect(t7.base_unit_inst_qty);
			
			remL_bldr.addInnerJoin(t2, bracket(
					t.oper_inst_no.eq(t2.oper_inst_no)
					.and(t.div_seq.eq(t2.div_seq))));
			remL_bldr.addLeftOuterJoin(t3, bracket(
					t.inpt_schd_no.eq(t3.inpt_schd_no)
					.and(t.div_seq.eq(t3.div_seq))));
			remL_bldr.addInnerJoin(t4, bracket(
					t.inpt_schd_no.eq(t4.inpt_schd_no)
					.and(t4.can_flg.eq(value(false)))));
			remL_bldr.addLeftOuterJoin(t5,
					bracket(t4.itm_cd.eq(t5.itm_cd)
							.and(t4.itm_sub1.eq(t5.itm_sub1))
							.and(t4.itm_sub2.eq(t5.itm_sub2))
							.and(t4.itm_sub3.eq(t5.itm_sub3))
							.and(t4.lot_no.eq(t5.lot_no))
							.and(t4.sublot_no.eq(t5.sublot_no))));
			remL_bldr.addInnerJoin(t6, bracket(t.inpt_schd_no.eq(t6.inpt_schd_no)));
			remL_bldr.addLeftOuterJoin(m1,
					bracket(t4.itm_cd.eq(m1.itm_cd)
							.and(t4.itm_sub1.eq(m1.itm_sub1))
							.and(t4.itm_sub2.eq(m1.itm_sub2))
							.and(t4.itm_sub3.eq(m1.itm_sub3))));
			remL_bldr.addLeftOuterJoin(t7, bracket(t.mfg_inst_no.eq(t7.mfg_inst_no)));
			
			remL_bldr.setWhere(t4.bkf_typ.neq(value(MAC_BKF_TYP.NO_BKF.value())));
			remL_bldr.addWhereWithAnd(
					t4.inpt_ctl_typ.neq(value(MAC_INPT_CTL_TYP.NO_MRP_INST.value())));
			dbSelect("MSBCL6050_MST_INPT_ACT_REM_S01", remL, remL_bldr);
			
			// 工程指図に対して工程実績が複数行存在しえる。
			// その場合、それぞれの工程実績に対して投入実績を登録する必要があるため、工程でループし投入を取得する
			MCIndexKey remIdxkey = remL.createIndex(MST_INPT_ACT_REM_R.$oper_inst_no, MST_INPT_ACT_REM_R.$div_seq);
			
			MCNumber inptPegNo = MCNumber.ZERO;
			
			// 工程実績ＮＯの小さい順に処理させるため、昇順ソートする
			chk01OperL.sort(MfgActReg_Chk01_DtlOperR.$oper_act_no);
			
			for (MfgActReg_Chk01_DtlOperR operR : chk01OperL) {
				// 工程実績テーブルのバックフラッシュ更新許可の考慮
				if (!operR.bkf_upd_flg()) {
					continue;
				}
				
				MfgActReg_Upd02_Hdr1R hdrUpR = _hdrUpCache.getCache(operR.hdr_peg_no());
				MCList<MST_INPT_ACT_REM_R> instNoSubL = getInstNoSubL(hdrUpR, remL
						.subList(remIdxkey, operR.oper_inst_no(), hdrUpR.div_seq()));
				// 投入実績テーブルのバックフラッシュ更新許可の考慮
				MCIndexKey notAltIdxKey = instNoSubL.createIndex(
						MST_INPT_ACT_REM_R.$oper_inst_no, "recalc_grp", "bkf_upd_flg");
				MCIndexKey altIdxKey = instNoSubL.createIndex(
						MST_INPT_ACT_REM_R.$oper_inst_no, "alt_grp_cd", "alt_grp_seq",
						"bkf_upd_flg");
				
				Set<String> actSet = new HashSet<String>();
				if (!isNull(operR.oper_act_no())) {
					// 工程実績登録済みの場合は、工程実績ＮＯを元に投入実績を取得
					// 取得できた場合は、投入実績を元に投入コンテナを作成する
					MCList<MST_INPT_ACT_REM_R> actNoSubL = instNoSubL.subList(
							"oper_act_no", operR.oper_act_no());
					if (!actNoSubL.isEmpty()) {
						for (MST_INPT_ACT_REM_R remR : actNoSubL) {
							actSet.add(remR.inpt_schd_no());
							MfgActReg_Chk01_DtlInptR inptR = getInptContainerSub(operR, remR);
							copyInptActCol(inptR, remR);
							if (canBkf(instNoSubL, notAltIdxKey, altIdxKey, remR)) {
								inptR.bkf_upd_flg(true);
							}
							else {
								inptR.bkf_upd_flg(false);
							}
							inptR.peg_no(inptPegNo);
							inptPegNo = inptPegNo.add(MCNumber.ONE);
							chk01InptL.add(inptR);
						}
					}
				}
				
				for (MCList<MST_INPT_ACT_REM_R> remGL : instNoSubL
						.groupList(MST_INPT_ACT_REM_R.$inpt_schd_no)) {
					// 以下の場合は、投入予定を元に投入コンテナを作成する
					// ・工程実績登録済みだが、投入実績が存在しない（投入予定ＮＯがactSetに含まれない）
					// ・工程実績が未登録
					// ※投入予定に対して複数の投入実績が登録されている状況で、工程実績を新たに追加した場合を考慮し、投入予定ＮＯでgroupListしてget(0)する
					MST_INPT_ACT_REM_R remR = remGL.get(0);
					if (!actSet.contains(remR.inpt_schd_no())) {
						// バックフラッシュ区分が予定投入量固定（工程着手日）、もしくは予定投入量固定（工程完了日）の場合、
						// 同一分割連番内で投入実績の登録があればそれ以上登録しないため、continueする。
						if (MAC_BKF_TYP.isSCHD_QTY_ST(remR.getStringNE("bkf_typ"))
								|| MAC_BKF_TYP.isSCHD_QTY_ED(remR.getStringNE("bkf_typ"))) {
							if (!isNull(remR.getStringNE("inpt_act_no"))) {
								continue;
							}
						}
						MfgActReg_Chk01_DtlInptR inptR = getInptContainerSub(operR, remR);
						inptR.bkf_upd_flg(true);
						inptR.peg_no(inptPegNo);
						inptPegNo = inptPegNo.add(MCNumber.ONE);
						chk01InptL.add(inptR);
					}
				}
			}
			
			// ヘッダ紐付けＮＯ、紐付けＮＯで昇順ソートすることで、ソート順を元に戻す
			chk01OperL.sort(MfgActReg_Chk01_DtlOperR.$hdr_peg_no, MfgActReg_Chk01_DtlOperR.$peg_no);
			
			// ----------------------------------- ロスコンテナの作成 ------------------------------------
			if (!chk01InptL.isEmpty()) {
				// ロス理由マスタを取得
				MCList<MAM_LOSS_RSN_R> lossRsnL = MCList.create(MAM_LOSS_RSN_R.class);
				MAM_LOSS_RSN_R lossRsnL_t = MAM_LOSS_RSN_R.create("T");
				MCQueryApiBuilder lossRsnL_bldr = MCQueryApiBuilder.create(lossRsnL_t);
				MAM_BIZ_RSN_R s1t2 = MAM_BIZ_RSN_R.create("T2");
				lossRsnL_bldr.setSelect(lossRsnL_t.loss_rsn_cd);
				lossRsnL_bldr.addSelect(lossRsnL_t.itm_typ);
				lossRsnL_bldr.addSelect(lossRsnL_t.itm_typ_d_cd);
				lossRsnL_bldr.addInnerJoin(s1t2,
						bracket(lossRsnL_t.loss_rsn_cd.eq(s1t2.biz_rsn_cd)));
				lossRsnL_bldr.setWhere(lossRsnL_t.itm_typ.eq(bind("itm_typ"))
						.and(lossRsnL_t.itm_typ_d_cd.eq(bind("itm_typ_d_cd"))));
				lossRsnL_bldr.addWhereWithAnd(s1t2.fxd_loss_flg.eq(value(true)));
				dbSelect("MSBCL6050_MAM_LOSS_RSN_S01",
						lossRsnL, lossRsnL_bldr, remL.groupBy("itm_typ", "itm_typ_d_cd"));
				
				// ロス実績を取得
				MCList<MST_LOSS_ACT_R> lossActL = MCList.create(MST_LOSS_ACT_R.class);
				MST_LOSS_ACT_R lossActL_t = MST_LOSS_ACT_R.create("T");
				MCQueryApiBuilder lossActL_bldr = MCQueryApiBuilder.create(lossActL_t);
				lossActL_bldr.setSelect(lossActL_t.loss_act_no,
						lossActL_t.base_unit_qty,
						lossActL_t.cont_qty,
						lossActL_t.inpt_act_no,
						lossActL_t.loss_rsn_cd,
						lossActL_t.intr_rmrks,
						lossActL_t.trd_rmrks,
						lossActL_t.sub_char1,
						lossActL_t.sub_char2,
						lossActL_t.sub_char3);
				lossActL_bldr.setWhere(lossActL_t.inpt_act_no.eq(bind("inpt_act_no")));
				dbSelect("MSBCL6050_MST_LOSS_ACT_S03", lossActL, lossActL_bldr, chk01InptL);
				
				MCIndexKey lossIdxKey = lossActL.createIndex(MST_LOSS_ACT_R.$inpt_act_no);
				MCIndexKey lossRsnKey = lossRsnL.createIndex(MAM_LOSS_RSN_R.$itm_typ, MAM_LOSS_RSN_R.$itm_typ_d_cd);
				
				// 固定ロスを設定したヘッダ紐付けＮＯ、投入予定ＮＯを保持するためのリスト
				MCList<MfgActReg_Chk01_DtlInptR> processedL = MCList.create(MfgActReg_Chk01_DtlInptR.class);
				
				for (MfgActReg_Chk01_DtlInptR fxdInptR : chk01InptL) {
					// 今回の処理対象のヘッダ紐付けＮＯと投入予定ＮＯを持つロウを作成する
					MfgActReg_Chk01_DtlInptR currentR = MfgActReg_Chk01_DtlInptR.create();
					currentR.hdr_peg_no(fxdInptR.hdr_peg_no());
					currentR.inpt_schd_no(fxdInptR.inpt_schd_no());
					
					// 複数件、ロス実績が登録されている場合もあるためsublistする
					MCList<MST_LOSS_ACT_R> subL = lossActL.subList(lossIdxKey, fxdInptR.inpt_act_no());
					if (!subL.isEmpty()) {
						// ロス実績を元にロスコンテナを作成
						for (MST_LOSS_ACT_R subR : subL) {
							chk01LossL.add(getLossContainerSub(fxdInptR, subR));
						}
					}
					else {
						MCNumber fxdLossQty = fxdInptR.getNumberNE("tmp_base_unit_fxd_rqmt_rem_qty");
						MCNumber contFxdLossQty = fxdInptR.getNumberNE("tmp_cont_fxd_rqmt_rem_qty");
						if (isNull(fxdLossQty) || fxdLossQty.isZero()) {
							continue;
						}
						// 同一ヘッダ内の同一投入予定ＮＯに対して固定ロスが設定済であればスキップ
						MCList<MfgActReg_Chk01_DtlInptR> sameHdrPegNoProcessedL = processedL.subList(MfgActReg_Chk01_DtlInptR.$hdr_peg_no, currentR.hdr_peg_no());
						MCList<MfgActReg_Chk01_DtlInptR> sameProcessedL = sameHdrPegNoProcessedL.subList(MfgActReg_Chk01_DtlInptR.$inpt_schd_no, currentR.inpt_schd_no());
						if (!sameProcessedL.isEmpty()) {
							continue;
						}
						
						MAM_LOSS_RSN_R lossRsnR = lossRsnL.getFirst(lossRsnKey,
								fxdInptR.getStringNE("tmp_itm_typ"),
								fxdInptR.getStringNE("tmp_itm_typ_d_cd"));
						// ロス理由マスタを元にロスコンテナを作成（固定ロスのみ）
						if (!isNull(lossRsnR)) {
							MfgActReg_Chk01_DtlLossR chk01LossR = MfgActReg_Chk01_DtlLossR.create();
							chk01LossR.setAttributes(fxdInptR);
							chk01LossR.inpt_peg_no(fxdInptR.peg_no());
							chk01LossR.loss_rsn_cd(lossRsnR.loss_rsn_cd());
							chk01LossR.loss_qty(fxdLossQty);
							chk01LossR.cont_loss_qty(contFxdLossQty);
							chk01LossL.add(chk01LossR);
							
							// 今回の処理対象を設定済リストに追加
							processedL.add(currentR);
						}
					}
				}
			}
		}
		
		/**
		 * 抽出対象の投入を絞り込みます
		 * @param operR
		 * @param remL
		 * @return
		 */
		protected MCList<MST_INPT_ACT_REM_R> getInstNoSubL(MfgActReg_Upd02_Hdr1R hdrUpR, MCList<MST_INPT_ACT_REM_R> remL) {
			MCList<MST_INPT_ACT_REM_R> instNoSubL = MCList.create(MST_INPT_ACT_REM_R.class);
			
			boolean excludeFlg = true;
			for (MST_INPT_ACT_REM_R remR : remL) {
				if (!isNullOrZeroOrMinus(remR.getNumberNE("base_unit_inpt_st_qty"))
						|| !isNullOrZeroOrMinus(remR.getNumberNE("base_unit_fxd_rqmt_st_qty"))) {
					excludeFlg = false;
					break;
				}
				// 製造指図数量と着手数量が等しくない＝着手時分割されている場合、データの絞込は行わない
				if (!isSame(remR.getNumberNE("base_unit_inst_qty"), hdrUpR.base_unit_st_act_qty())) {
					excludeFlg = false;
					break;
				}
			}
			
			// 工程のステータスが新規の場合でも、同一再計算Ｇの投入予定がすべて完了でないなら、データの絞込は行わない（remLをそのまま返す）
			if (!excludeFlg || !isNull(hdrUpR.mfg_act_no())) {
				return remL;
			}
			
			// 工程のステータスが新規の場合（着手時）、数量がゼロ以下のレコードを除外する
			for (MST_INPT_ACT_REM_R remR : remL) {
				if (remR.getBooleanNE("cont_fctr_flg")) {
					if (isNullOrZeroOrMinus(remR.getNumberNE("cont_inpt_st_qty"))
							&& isNullOrZeroOrMinus(
									remR.getNumberNE("cont_fxd_rqmt_st_qty"))) {
						continue;
					}
				}
				else {
					if (isNullOrZeroOrMinus(remR.getNumberNE("base_unit_inpt_st_qty"))
							&& isNullOrZeroOrMinus(
									remR.getNumberNE("base_unit_fxd_rqmt_st_qty"))) {
						continue;
					}
				}
				instNoSubL.add(remR);
			}
			return instNoSubL;
		}

		protected boolean canBkf(MCList<MST_INPT_ACT_REM_R> instNoSubL,
				MCIndexKey notAltIdxKey, MCIndexKey altIdxKey, MST_INPT_ACT_REM_R remR) {
			// 代替の場合
			String altGrpCd = remR.getStringNE("alt_grp_cd");
			if (!isNull(altGrpCd)) {
				// 工程指図NO、代替グループCD、代替グループ連番ごとにfalseの行が存在するかどうかを確認する
				// ※代替のロット提案は代替グループ単位で行う必要があるため
				return isNull(instNoSubL.getFirst(altIdxKey, remR.oper_inst_no(), altGrpCd, remR.getNumberNE("alt_grp_seq"), false));
			}
			else {
				// 工程指図NO、再計算グループごとにfalseの行が存在するかどうかを確認する
				// ※代替以外の再計算処理は再計算グループ毎に行う必要があるため
				return isNull(instNoSubL.getFirst(notAltIdxKey, remR.oper_inst_no(), remR.getNumberNE("recalc_grp"), false));
			}
		}
		
		protected MfgActReg_Chk01_DtlInptR getInptContainerSub(MfgActReg_Chk01_DtlOperR operR, MST_INPT_ACT_REM_R remR) {
			MfgActReg_Chk01_DtlInptR retR = MfgActReg_Chk01_DtlInptR.create();
			retR.setAttributes(operR);
			
			retR.hdr_peg_no(operR.hdr_peg_no());
			retR.oper_peg_no(operR.peg_no());
			
			// 一括登録時の代替品目指定FLGは指図時の値を渡す
			// ・投入実績時のロット提案の仕様として代替G、連番内にtrueの行が１行でも存在すれば、代替品としてロット提案するのではなく、trueの品目に対してのみロット提案する
			// ・代替G、連番内で全ての行がfalseであれば、投入実績時のロット提案は代替品としてロット提案する（ロット提案が品目を決定してくれる）
			// １．上記仕様を踏まえると、指図時に代替品目指定がオンであれば、その品目以外を提案すべきではないので、代替品目指定FLGをtrueで渡す必要がある。
			// ２．指図時点で、代替G、連番内で全ての行の代替品目指定がfalseであれば、実績時に代替品をロット提案で決めたい。
			// 一度実績を登録した後に、数量を増やして再度更新された場合、実績登録した品目だけを提案の候補とするのではなく、他の品目も提案の候補としたいので、
			// 実績登録済みの行の代替品目指定FLGをtrueにすることはしていない。
			retR.alt_itm_fix_flg(remR.getBooleanNE("alt_itm_fix_flg"));
			retR.itm_cd(remR.getStringNE("itm_cd"));
			retR.itm_sub1(remR.getStringNE("itm_sub1"));
			retR.itm_sub2(remR.getStringNE("itm_sub2"));
			retR.itm_sub3(remR.getStringNE("itm_sub3"));
			retR.base_unit_dec_place(remR.getNumberNE("dec_place"));
			retR.base_unit_conv_rnd_typ(remR.getStringNE("rnd_typ"));
			retR.ver_no(remR.getStringNE("ver_no"));
			if (!remR.getBooleanNE("abort_flg") && !isNull(operR.end_act_tm()) && !operR.not_cmpl_flg()) {
				// 打切フラグがオフの場合でも、工程実績が完了していれば投入を打ち切る
				// ※在庫不足などで投入実績が登録できない場合は打ち切られない
				retR.abort_flg(true);
			}
			else {
				retR.abort_flg(remR.getBooleanNE("abort_flg"));
			}
			retR.lot_no(remR.getStringNE("lot_no"));
			retR.sublot_no(remR.getStringNE("sublot_no"));
			retR.acxfr_act_qty(remR.getNumberNE("acxfr_qty"));
			retR.acxfr_act_rsn_cd(remR.getStringNE("acxfr_rsn_cd"));
			retR.acxfr_act_bd_dpt_cd(remR.getStringNE("acxfr_bd_dpt_cd"));
			retR.sno1(remR.getStringNE("sno1"));
			retR.sno2(remR.getStringNE("sno2"));
			retR.sno3(remR.getStringNE("sno3"));
			retR.sno4(remR.getStringNE("sno4"));
			retR.gd_cd(remR.getStringNE("gd_cd"));
			retR.inpt_rsn_cd(remR.getStringNE("inpt_rsn_cd"));
			retR.inpt_loc_cd(remR.getStringNE("inpt_loc_cd"));
			retR.inpt_str_ln_cd(remR.getStringNE("inpt_str_ln_cd"));
			retR.inpt_schd_no(remR.getStringNE("inpt_schd_no"));
			retR.prov_typ(remR.getStringNE("prov_typ"));
			if (MAC_PROV_TYP.isSS(retR.prov_typ())) {
				retR.stk_id_typ(MSC_STK_ID_TYP.SLF_SUPPRT.value());
			}
			
			retR.first_gr_dt(remR.getDateNE("first_gr_dt"));
			retR.lot_seq(remR.getStringNE("lot_seq"));

			retR.cont_fctr_flg(remR.getBooleanNE("cont_fctr_flg"));
			retR.cont_fctr_dec_place(remR.getNumberNE("cont_fctr_dec_place"));
			retR.std_cont_fctr(remR.getNumberNE("std_cont_fctr"));
			retR.act_cont_fctr(remR.getNumberNE("act_cont_fctr"));
			retR.setNumberNE("tmp_recalc_grp", remR.getNumberNE("recalc_grp"));
			retR.setNumberNE("tmp_recalc_grp_seq", remR.getNumberNE("recalc_grp_seq"));
			retR.setStringNE("tmp_bkf_typ", remR.getStringNE("bkf_typ"));
			retR.setNumberNE("tmp_base_unit_fxd_rqmt_rem_qty", remR.base_unit_fxd_rqmt_rem_qty());
			retR.setNumberNE("tmp_cont_fxd_rqmt_rem_qty", remR.cont_fxd_rqmt_rem_qty());
			retR.setStringNE("tmp_itm_typ", remR.getStringNE("itm_typ"));
			retR.setStringNE("tmp_itm_typ_d_cd", remR.getStringNE("itm_typ_d_cd"));
			retR.alt_grp_cd(remR.getStringNE("alt_grp_cd"));
			retR.alt_grp_seq(remR.getNumberNE("alt_grp_seq"));
			
			return retR;
			
		}
		
		protected void copyInptActCol(MfgActReg_Chk01_DtlInptR inptR, MST_INPT_ACT_REM_R remR) {
			if (!MAC_PROV_TYP.isSS(inptR.prov_typ())) {
				inptR.stk_id_typ(remR.getStringNE("stk_id_typ"));
			}
			inptR.stk_bp_cd(remR.getStringNE("stk_bp_cd"));
			inptR.stk_arrv_bp_cd(remR.getStringNE("stk_arrv_bp_cd"));
			inptR.inpt_act_intr_rmrks(remR.getStringNE("inpt_act_intr_rmrks"));
			inptR.inpt_act_rpt_rmrks(remR.getStringNE("inpt_act_rpt_rmrks"));
			inptR.trd_rmrks(remR.getStringNE("trd_rmrks"));
			inptR.inpt_act_sub_char1(remR.getStringNE("inpt_act_sub_char1"));
			inptR.inpt_act_sub_char2(remR.getStringNE("inpt_act_sub_char2"));
			inptR.inpt_act_sub_char3(remR.getStringNE("inpt_act_sub_char3"));
			inptR.inpt_act_no(remR.getStringNE("inpt_act_no"));
			// 投入実績日と計上日は後の処理（setInptDtAndSrchYieldAct）で設定しなおされるが、
			// 終了実績日を投入の実績日で使用していた実績を着手中に戻した際に、後の処理では日付が設定されないため、ここで更新前の日付を保持しておく
			inptR.act_tm(remR.getDateNE("act_tm"));
			inptR.ac_dt(remR.getDateNE("ac_dt"));
			inptR.can_ac_dt(remR.getDateNE("ac_dt"));
			inptR.setDateNE("bef_ac_dt", remR.getDateNE("ac_dt"));
			inptR.base_unit_inpt_qty(remR.getNumberNE("base_unit_inpt_qty"));
			inptR.cont_inpt_qty(remR.getNumberNE("cont_qty"));
			inptR.inpt_rsn_cd(remR.getStringNE("inpt_act_inpt_rsn_cd")); 
			inptR.mes_flg(remR.getBooleanNE("mes_flg")); 
			inptR.ext_sys_cd(remR.getStringNE("ext_sys_cd")); 
			inptR.ext_inpt_act_no(remR.getStringNE("ext_inpt_act_no")); 
			inptR.mes_flg(remR.getBooleanNE("mes_flg")); 
		}
		
		protected MfgActReg_Chk01_DtlLossR getLossContainerSub(MfgActReg_Chk01_DtlInptR fxdInptR, MST_LOSS_ACT_R lossActR) {
			MfgActReg_Chk01_DtlLossR retR = MfgActReg_Chk01_DtlLossR.create();
			retR.setAttributes(fxdInptR);
			retR.inpt_peg_no(fxdInptR.peg_no());
			retR.loss_act_no(lossActR.loss_act_no());
			retR.loss_rsn_cd(lossActR.loss_rsn_cd());
			retR.loss_qty(lossActR.base_unit_qty());
			retR.cont_loss_qty(lossActR.cont_qty());
			retR.intr_rmrks(lossActR.intr_rmrks());
			retR.trd_rmrks(lossActR.trd_rmrks());
			retR.sub_char1(lossActR.sub_char1());
			retR.sub_char2(lossActR.sub_char2());
			retR.sub_char3(lossActR.sub_char3());
			
			return retR;
		}
		
		/**
		 * バックフラッシュ区分に応じた投入実績日、計上日設定する。上り電文に投入に対応する出来高が存在しない場合は、出来高実績を検索して返す
		 * @param chk01OperL
		 * @param chk01YieldL
		 * @param chk01InptL
		 */
		protected MCList<MfgActReg_Chk01_DtlYieldR> setInptDtAndSrchYieldAct(
				MCList<MfgActReg_Chk01_DtlOperR> chk01OperL,
				MCList<MfgActReg_Chk01_DtlYieldR> chk01YieldL,
				MCList<MfgActReg_Chk01_DtlInptR> chk01InptL) {
			
			MCIndexKey operIdxkey = chk01OperL.createIndex(MfgActReg_Chk01_DtlOperR.$peg_no);
			MCList<MfgActReg_Chk01_DtlYieldR> chk01NoDelYieldL = chk01YieldL.subList(r -> !r.isStatusDelete());
			MCIndexKey yieldIdxkey = chk01NoDelYieldL.createIndex(MfgActReg_Chk01_DtlOperR.$hdr_peg_no);
			MCIndexKey yieldOperIdxkey = chk01NoDelYieldL.createIndex(MfgActReg_Chk01_DtlYieldR.$oper_peg_no);
			
			MCList<MfgActReg_Upd02_Hdr1R> yieldSrchHdrL = MCList.create(MfgActReg_Upd02_Hdr1R.class);
			MCList<MfgActReg_Chk01_DtlInptR> yieldSrchInptL = MCList.create(MfgActReg_Chk01_DtlInptR.class);
			for (MfgActReg_Chk01_DtlInptR inptR : chk01InptL) {
				String bkfTyp = inptR.getStringNE("tmp_bkf_typ");
				// 出来高実績日、計上日
				if (MAC_BKF_TYP.isPROPOTIONAL(bkfTyp)) {
					MCList<MfgActReg_Chk01_DtlYieldR> subYieldL = MCList.create(MfgActReg_Chk01_DtlYieldR.class);
					Boolean chkYieldOperFlg = chk01OperL.getFirst(operIdxkey, inptR.oper_peg_no()).yield_oper_flg();
					if (up0().oper_unit_flg() && chkYieldOperFlg) {
						subYieldL = chk01NoDelYieldL.subList(yieldOperIdxkey, inptR.oper_peg_no());
					}
					else {
						subYieldL = chk01NoDelYieldL.subList(yieldIdxkey, inptR.hdr_peg_no());
					}
					if (!subYieldL.isEmpty()) {
						// 出来高が複数存在する場合は、MIN（初回出来高登録時に登録した計上日を維持するため）
						inptR.act_tm((MCDate)subYieldL.min(MfgActReg_Chk01_DtlYieldR.$act_tm));
						inptR.ac_dt((MCDate)subYieldL.min(MfgActReg_Chk01_DtlYieldR.$ac_dt));
						MCDate tmpCanAcDt = (MCDate)subYieldL.min(MfgActReg_Chk01_DtlYieldR.$can_ac_dt);
						inptR.can_ac_dt(nvl(tmpCanAcDt, inptR.can_ac_dt()));
						// 上り電文の出来高に打切が存在する場合、投入の打切もオンにする
						boolean tmpAbortFlg = (boolean)subYieldL.max(MfgActReg_Chk01_DtlYieldR.$abort_flg);
						if (tmpAbortFlg) {
							inptR.abort_flg(true);
						}
					}
					// DBに既存の出来高実績が上り電文に存在しない場合、出来高実績を検索するためのリストに格納する
					MfgActReg_Upd02_Hdr1R hdrR = _hdrUpCache.getCache(inptR.hdr_peg_no());
					yieldSrchHdrL.add(hdrR);
					yieldSrchInptL.add(inptR);
				}
				// 工程着手実績日
				else if (MAC_BKF_TYP.isOPER_QTY_ST(bkfTyp) || MAC_BKF_TYP.isSCHD_QTY_ST(bkfTyp)) {
					MfgActReg_Chk01_DtlOperR operR = chk01OperL.getFirst(operIdxkey, inptR.oper_peg_no());
					if (!isNull(operR.st_act_tm())) {
						inptR.act_tm(operR.st_act_tm());
						inptR.ac_dt(getAcDt(operR.st_act_tm()));
					}
				}
				// 工程終了実績日
				else if (MAC_BKF_TYP.isOPER_QTY_ED(bkfTyp) || MAC_BKF_TYP.isSCHD_QTY_ED(bkfTyp)) {
					MfgActReg_Chk01_DtlOperR operR = chk01OperL.getFirst(operIdxkey, inptR.oper_peg_no());
					if (!isNull(operR.end_act_tm())) {
						inptR.act_tm(operR.end_act_tm());
						inptR.ac_dt(getAcDt(operR.end_act_tm()));
					}
				}
			}
			
			MCList<MfgActReg_Chk01_DtlYieldR> retL = MCList.create(MfgActReg_Chk01_DtlYieldR.class);
			
			//　出来高実績が上ってこない場合は、DBから検索
			if (!yieldSrchHdrL.isEmpty()) {
				MCList<MST_YIELD_ACT_R> yaL = MCList.create(MST_YIELD_ACT_R.class);
				MST_YIELD_ACT_R yaL_t = MST_YIELD_ACT_R.create("T");
				MST_YIELD_ACT_REM_R yarL_t = MST_YIELD_ACT_REM_R.create("T2");
				MCQueryApiBuilder yaL_bldr = MCQueryApiBuilder.create(yaL_t);
				yaL_bldr.setSelect(yaL_t.mfg_act_no,
						yaL_t.base_unit_qty,
						yaL_t.yield_schd_no,
						yaL_t.yield_act_no,
						yaL_t.oper_act_no,
						yaL_t.act_tm,
						yaL_t.ac_dt);
				yaL_bldr.addSelect(yarL_t.mfg_sts_typ);
				yaL_bldr.addInnerJoin(yarL_t, bracket( yaL_t.yield_schd_no.eq(yarL_t.yield_schd_no)
						.and(yaL_t.div_seq.eq(yarL_t.div_seq))));
				yaL_bldr.setWhere(yaL_t.mfg_act_no.eq(bind("mfg_act_no")));
				yaL_bldr.addWhereWithAnd(
						yaL_t.yield_typ.neq(value(MAC_YIELD_TYP.BYPROD.value())));
				dbSelect("MSBCL6050_MST_YIELD_ACT_S09",
						yaL, yaL_bldr, yieldSrchHdrL.groupBy(MfgActReg_Upd02_Hdr1R.$mfg_act_no));
				
				// 上り電文に存在する出来高実績は除外する
				for (MfgActReg_Chk01_DtlYieldR delR : chk01YieldL) {
					if (!isNull(delR.yield_act_no())) {
						MST_YIELD_ACT_R yaR = yaL.getFirst(MST_YIELD_ACT_R.$yield_act_no, delR.yield_act_no());
						if (!isNull(yaR)) {
							yaL.remove(yaR);
						}
					}
				}
				MCIndexKey yaIdxkey = yaL.createIndex(MST_YIELD_ACT_R.$mfg_act_no);
				MCIndexKey yaOperIdxkey = yaL.createIndex(MST_YIELD_ACT_R.$oper_act_no);
				for (MCList<MfgActReg_Chk01_DtlInptR> inptGL : yieldSrchInptL
						.groupList(MfgActReg_Chk01_DtlInptR.$oper_peg_no)) {
					MfgActReg_Chk01_DtlInptR inptG0R = inptGL.get(0); 
					MfgActReg_Upd02_Hdr1R hdrR = _hdrUpCache.getCache(inptG0R.hdr_peg_no());
					
					MCList<MST_YIELD_ACT_R> subL = MCList.create(MST_YIELD_ACT_R.class);
					MfgActReg_Chk01_DtlOperR operR = chk01OperL.getFirst(operIdxkey, inptG0R.oper_peg_no());
					if (operR.yield_oper_flg()) {
						// 出来高計上工程の場合、自身が紐付く工程の出来高実績のみを対象とする
						subL = yaL.subList(yaOperIdxkey, operR.oper_act_no());
					}
					else {
						subL = yaL.subList(yaIdxkey, hdrR.mfg_act_no());
					}
					for (MST_YIELD_ACT_R yaR : subL) {
						if (!isNull(retL.getFirst(MfgActReg_Chk01_DtlYieldR.$yield_act_no, yaR.yield_act_no()))) {
							continue;
						}
						MfgActReg_Chk01_DtlYieldR retR = MfgActReg_Chk01_DtlYieldR.create();
						retR.hdr_peg_no(hdrR.peg_no());
						retR.oper_peg_no(inptG0R.oper_peg_no());
						retR.yield_schd_no(yaR.yield_schd_no());
						retR.yield_act_no(yaR.yield_act_no());
						retR.base_unit_yield_act_qty(yaR.base_unit_qty());
						retR.ac_dt(yaR.ac_dt());
						retL.add(retR);
					}

					for (MfgActReg_Chk01_DtlInptR inptR : inptGL) {
						MCList<MfgActReg_Chk01_DtlYieldR> subYieldL = MCList
								.create(MfgActReg_Chk01_DtlYieldR.class);
						if (up0().oper_unit_flg() && operR.yield_oper_flg()) {
							subYieldL = chk01NoDelYieldL.subList(yieldOperIdxkey,
									inptR.oper_peg_no());
						}
						else {
							subYieldL = chk01NoDelYieldL.subList(yieldIdxkey,
									inptR.hdr_peg_no());
						}
						MCDate tmpActTm = (MCDate)subL.min(MfgActReg_Chk01_DtlYieldR.$act_tm);
						MCDate tmpAcDt = (MCDate)subL.min(MfgActReg_Chk01_DtlYieldR.$ac_dt);
						String mfgSts = (String)subL.max("mfg_sts_typ");
						if (subYieldL.isEmpty()) {
							inptR.act_tm(tmpActTm);
							inptR.ac_dt(tmpAcDt);
							inptR.can_ac_dt(inptR.can_ac_dt());
							if (MSC_MFG_STS_TYP.isCMPL(mfgSts)) {
								inptR.abort_flg(true);
							}
						}
						else {
							if (!isNull(tmpActTm) && inptR.act_tm().gt(tmpActTm)) {
								inptR.act_tm(tmpActTm);
							}
							if (!isNull(tmpAcDt) && inptR.ac_dt().gt(tmpAcDt)) {
								inptR.ac_dt(tmpAcDt);
							}
						}
					}
				}
				
				for (MfgActReg_Chk01_DtlYieldR r : retL) {
					//工程紐づけＮＯを振りなおす
					MST_YIELD_ACT_R yaR = yaL.getFirst(MST_YIELD_ACT_R.$yield_act_no, r.yield_act_no());
					MfgActReg_Chk01_DtlOperR chk01OperR = chk01OperL.getFirst(MfgActReg_Chk01_DtlOperR.$oper_act_no, yaR.oper_act_no());
					if (!isNull(chk01OperR) ) {
						r.oper_peg_no(chk01OperR.peg_no());
					}
				}
				
				// 出来高実績がない出来高予定を検索する
				MCList<MST_YIELD_SCHD_R> ysL = MCList.create(MST_YIELD_SCHD_R.class);
				MST_YIELD_SCHD_R ysL_t = MST_YIELD_SCHD_R.create("T");
				MCQueryApiBuilder ysL_bldr = MCQueryApiBuilder.create(ysL_t);
				ysL_bldr.setSelect(ysL_t.mfg_inst_no, ysL_t.yield_schd_no);
				ysL_bldr.setWhere(ysL_t.mfg_inst_no.eq(bind("mfg_inst_no")));
				ysL_bldr.addWhereWithAnd(ysL_t.yield_typ.neq(value(MAC_YIELD_TYP.BYPROD.value())));
				ysL_bldr.addWhereWithAnd(ysL_t.can_flg.eq(value(false)));
				dbSelect("MSBCL6050_MST_YIELD_SCHD_S06",
						ysL, ysL_bldr, yieldSrchHdrL.groupBy(MfgActReg_Upd02_Hdr1R.$mfg_inst_no));
				
				MCIndexKey ysIdxkey = ysL.createIndex(MST_YIELD_SCHD_R.$mfg_inst_no);
				for (MCList<MfgActReg_Chk01_DtlInptR> inptGL : yieldSrchInptL
						.groupList(MfgActReg_Chk01_DtlInptR.$oper_peg_no)) {
					MfgActReg_Chk01_DtlInptR inptG0R = inptGL.get(0); 
					MfgActReg_Upd02_Hdr1R hdrR = _hdrUpCache.getCache(inptG0R.hdr_peg_no());
					
					MCList<MST_YIELD_SCHD_R> subL = ysL.subList(ysIdxkey,
							hdrR.mfg_inst_no());
					for (MST_YIELD_SCHD_R ysR : subL) {
						if (!isNull(chk01NoDelYieldL.getFirst(MfgActReg_Chk01_DtlYieldR.$yield_schd_no, ysR.yield_schd_no()))) {
							continue;
						}
						if (!isNull(retL.getFirst(MfgActReg_Chk01_DtlYieldR.$yield_schd_no, ysR.yield_schd_no()))) {
							continue;
						}
						MfgActReg_Chk01_DtlYieldR addR = MfgActReg_Chk01_DtlYieldR
								.create();
						addR.hdr_peg_no(hdrR.peg_no());
						addR.oper_peg_no(inptG0R.oper_peg_no());
						addR.yield_schd_no(ysR.yield_schd_no());
						addR.yield_act_no(null);
						addR.base_unit_yield_act_qty(MCNumber.ZERO);
						retL.add(addR);
					}
				}
			}
			
			return retL;
		}
		
		/**
		 * 工数取得処理
		 */
		protected MCList<MfgActReg_Chk01_DtlWkR> getWkContainer(
				MCList<MfgActReg_Chk01_DtlOperR> chk01OperL,
				MCList<MfgActReg_Chk01_DtlYieldR> chk01YieldL) {
			
			MCList<MfgActReg_Chk01_DtlWkR> retL = MCList.create(MfgActReg_Chk01_DtlWkR.class);
			
			MCList<MST_WK_ACT_REM_R> remL = MCList.create(MST_WK_ACT_REM_R.class);
			MST_WK_ACT_REM_R t = MST_WK_ACT_REM_R.create("T");
			MCQueryApiBuilder remL_bldr = MCQueryApiBuilder.create(t);
			MSW_OPER_ACT_REM_KEY_R t2 = MSW_OPER_ACT_REM_KEY_R.create("T2");
			MST_WK_ACT_R t3 = MST_WK_ACT_R.create("T3");
			MST_WK_SCHD_R t4 = MST_WK_SCHD_R.create("T4");
			remL.addBooleanColumn("abort_flg");
			remL.addBooleanColumn("wk_cost_calc_upd_flg");

			remL_bldr.setSelect(t.wk_schd_no);
			remL_bldr.addSelect(t.oper_inst_no);
			remL_bldr.addSelect(t.div_seq);
			remL_bldr.addSelect(cases() .when(t.abort_wk_cost.gt(value(0))) .then(value(true)) .otherwise(value(false)).as("abort_flg"));

			remL_bldr.addSelect(nvl2( t3.wk_act_no, t3.wk_cost_cd, t4.wk_cost_cd).as("wk_cost_cd"));
			remL_bldr.addSelect(nvl2( t3.wk_act_no, t3.wk_cost_calc_ctl_flg, t4.wk_cost_calc_flg).as("wk_cost_calc_upd_flg"));

			remL_bldr.addSelect(t4.wk_schd_no);
			
			remL_bldr.addSelect(t3.st_tm);
			remL_bldr.addSelect(t3.end_tm);
			remL_bldr.addSelect(t3.ac_dt);
			remL_bldr.addSelect(t3.brk_pd);
			remL_bldr.addSelect(t3.wk_day_cd);
			remL_bldr.addSelect(t3.wk_rsn_cd);
			remL_bldr.addSelect(t3.wk_usr_cd);
			remL_bldr.addSelect(t3.wk_usr_dpt_cd);
			remL_bldr.addSelect(t3.fclty);
			remL_bldr.addSelect(t3.intr_rmrks.as("wk_act_intr_rmrks"));
			remL_bldr.addSelect(t3.sub_char1.as("wk_act_sub_char1"));
			remL_bldr.addSelect(t3.sub_char2.as("wk_act_sub_char2"));
			remL_bldr.addSelect(t3.sub_char3.as("wk_act_sub_char3"));
			remL_bldr.addSelect(t3.wk_act_no);
			remL_bldr.addSelect(t3.wk_cost);
			remL_bldr.addSelect(t3.oper_act_no);
			remL.addBooleanColumn("mes_flg");
			remL_bldr.addSelect(t3.mes_flg);
			remL_bldr.addSelect(t3.ext_sys_cd);
			remL_bldr.addSelect(t3.ext_wk_act_no);
			
			remL_bldr.addInnerJoin(t2, bracket( t.oper_inst_no.eq(t2.oper_inst_no)
					.and(t.div_seq.eq(t2.div_seq))));
			remL_bldr.addLeftOuterJoin(t3, bracket( t.wk_schd_no.eq(t3.wk_schd_no)
					.and(t.div_seq.eq(t3.div_seq))));
			remL_bldr.addInnerJoin(t4, bracket( t.wk_schd_no.eq(t4.wk_schd_no)
					.and(t4.can_flg.eq(value(false)))));
			remL_bldr.setWhere(t4.wk_cost_calc_flg.eq(value(true)));
			dbSelect("MSBCL6050_MST_WK_ACT_REM_S01", remL, remL_bldr);

			MCIndexKey remIdxkey = remL.createIndex(MST_WK_ACT_REM_R.$oper_inst_no, MST_WK_ACT_REM_R.$div_seq);
			MCIndexKey yieldIdxkey = chk01YieldL.createIndex(MfgActReg_Chk01_DtlOperR.$hdr_peg_no);
			MCIndexKey yieldOperIdxkey = chk01YieldL.createIndex(MfgActReg_Chk01_DtlYieldR.$oper_peg_no);
			
			MCNumber wkPegNo = MCNumber.ZERO;
			for (MfgActReg_Chk01_DtlOperR operR : chk01OperL) {
				// 工程実績テーブルの自動工数計算許可の考慮
				if (!operR.wk_cost_upd_calc_flg()) {
					continue;
				}
				
				// 計上日は工程の着手実績日
				MCDate acDt = operR.st_act_tm().trunc(MCDateFieldType.DAY);
				if (!up0().oper_unit_flg()) {
					// 品目単位実績の場合、出来高実績の計上日
					MCList<MfgActReg_Chk01_DtlYieldR> subYieldL = chk01YieldL
							.subList(yieldIdxkey, operR.hdr_peg_no());
					acDt = (MCDate)subYieldL.min(MfgActReg_Chk01_DtlYieldR.$ac_dt);
				}
				
				MfgActReg_Upd02_Hdr1R hdrUpR = _hdrUpCache.getCache(operR.hdr_peg_no());
				MCList<MST_WK_ACT_REM_R> instNoSubL = remL.subList(remIdxkey,
						operR.oper_inst_no(), hdrUpR.div_seq());
				// 工数実績テーブルの自動工数計算許可の考慮
				MCIndexKey subLIdxKey = instNoSubL.createIndex("wk_schd_no", "wk_cost_calc_upd_flg");
				
				// ＩＦ受信により自動生成された工程の場合
				if (operR.if_auto_reg_flg()) {
					// 出来高計上工程
					if (operR.yield_oper_flg()) {
						// 工程実績完了（MfgActReg_Upd04）時
						if (up0().is_oper_act_cmpl_batch_flg()) {
							// 出来高実績計上時に工数実績の計上日が設定されているため、その値を維持する
							// ※use_org_ac_dt_flgをtrueにすると、後続のgetWkContainerSubでremLの計上日が設定される
							operR.setBooleanNE("use_org_ac_dt_flg", true);
						}
						// 工程実績完了以外（出来高実績受信時）
						else {
							// 工程に紐付く出来高実績の上り電文から計上日を取得する
							MCList<MfgActReg_Chk01_DtlYieldR> subYieldL2 = chk01YieldL
									.subList(yieldOperIdxkey, operR.peg_no());
							if (subYieldL2.size() > 0) {
								acDt = (MCDate) subYieldL2.min(MfgActReg_Chk01_DtlYieldR.$ac_dt);
							}
							else {
								// 出来高実績の取消時は上り電文から出来高実績を取得できないため、元の値を維持する
								operR.setBooleanNE("use_org_ac_dt_flg", true);
							}
						}
					}
					// 出来高計上工程以外
					else {
						// 出来高計上工程以外の場合、工程実績完了（MfgActReg_Upd04）からしか呼ばれない
						// 工程実績を完了（終了実績日≠null）にする場合は、終了実績日を計上日とする
						if (!isNull(operR.end_act_tm())) {
							acDt = operR.end_act_tm().trunc(MCDateFieldType.DAY);
						}
					}
				}
				Set<String> actSet = new HashSet<String>();
				if (!isNull(operR.oper_act_no())) {
					// 工程実績登録済みの場合は、工程実績ＮＯを元に工数実績を取得
					// 取得できた場合は、工数実績を元に工数コンテナを作成する
					MCList<MST_WK_ACT_REM_R> actNoSubL = instNoSubL
							.subList("oper_act_no", operR.oper_act_no());
					if (!actNoSubL.isEmpty()) {
						for (MST_WK_ACT_REM_R remR : actNoSubL) {
							actSet.add(remR.wk_schd_no());
							if (!canWkCalc(instNoSubL, subLIdxKey, remR.wk_schd_no())) {
								continue;
							}
							
							MfgActReg_Chk01_DtlWkR retR = getWkContainerSub(operR, remR, acDt);
							copyWkActCol(retR, remR);
							retR.peg_no(wkPegNo);
							wkPegNo = wkPegNo.add(MCNumber.ONE);
							retL.add(retR);
						}
					}
				}
				
				// 以下の場合は、工数予定を元に工数コンテナを作成する
				// ・工程実績登録済みだが、工数実績が存在しない（工数予定ＮＯがactSetに含まれない）
				// ・工程実績が未登録
				for (MCList<MST_WK_ACT_REM_R> remGL : instNoSubL
						.groupList(MST_WK_ACT_REM_R.$wk_schd_no)) {
					MST_WK_ACT_REM_R remR = remGL.get(0);
					if (!actSet.contains(remR.wk_schd_no())) {
						MfgActReg_Chk01_DtlWkR retR = getWkContainerSub(operR, remR, acDt);
						retR.peg_no(wkPegNo);
						wkPegNo = wkPegNo.add(MCNumber.ONE);
						retL.add(retR);
					}
				}
			}
			
			return retL;
		}

		/**
		 * 上り電文または投入の処理で取得した出来高実績の中に、工数に対応する出来高が存在しない場合は、出来高予定・実績を検索して返す
		 */
		protected void srchYieldActForWk(
				MCList<MfgActReg_Chk01_DtlYieldR> chk01YieldL,
				MCList<MfgActReg_Chk01_DtlOperR> chk01OperL,
				MCList<MfgActReg_Chk01_DtlYieldR> yaDbL,
				MCList<MfgActReg_Chk01_DtlWkR> chk01WkL) {

			if (!up0().not_bkf_upd_flg() && !yaDbL.isEmpty()) {
				return;
			}
			
			// 出来高実績取得対象リスト
			MCList<MfgActReg_Upd02_Hdr1R> yieldActSrchHdrL = MCList.create(MfgActReg_Upd02_Hdr1R.class);
			MCList<MfgActReg_Chk01_DtlWkR> yieldActSrchWkL = MCList.create(MfgActReg_Chk01_DtlWkR.class);

			for (MfgActReg_Chk01_DtlWkR wkR : chk01WkL) {
				// 工数に対応する出来高が上り電文に存在するか確認
				
				// 存在しない場合は取得対象リストに追加
				MfgActReg_Upd02_Hdr1R hdrR = _hdrUpCache.getCache(wkR.hdr_peg_no());
				yieldActSrchHdrL.add(hdrR);
				yieldActSrchWkL.add(wkR);
			}
			

			MCList<MfgActReg_Chk01_DtlYieldR> addL = MCList.create(MfgActReg_Chk01_DtlYieldR.class);
			
			//　出来高実績が上ってこない場合は、DBから検索
			if (!yieldActSrchHdrL.isEmpty()) {
				MCList<MST_YIELD_ACT_R> yaL = MCList.create(MST_YIELD_ACT_R.class);
				MST_YIELD_ACT_R yaL_t = MST_YIELD_ACT_R.create("T");
				MCQueryApiBuilder yaL_bldr = MCQueryApiBuilder.create(yaL_t);
				yaL_bldr.setSelect(yaL_t.mfg_act_no,
						yaL_t.base_unit_qty,
						yaL_t.oper_act_no,
						yaL_t.yield_schd_no,
						yaL_t.yield_act_no,
						yaL_t.act_tm,
						yaL_t.ac_dt);
				yaL_bldr.setWhere(yaL_t.mfg_act_no.eq(bind("mfg_act_no")));
				yaL_bldr.addWhereWithAnd(yaL_t.yield_typ.neq(value(MAC_YIELD_TYP.BYPROD.value())));
				dbSelect("MSBCL6050_MST_YIELD_ACT_S10",
						yaL, yaL_bldr, yieldActSrchHdrL.groupBy(MfgActReg_Upd02_Hdr1R.$mfg_act_no));
				
				// 上り電文に存在する出来高実績は除外する
				for (MfgActReg_Chk01_DtlYieldR delR : chk01YieldL) {
					if (!isNull(delR.yield_act_no())) {
						MST_YIELD_ACT_R yaR = yaL.getFirst(MST_YIELD_ACT_R.$yield_act_no, delR.yield_act_no());
						if (!isNull(yaR)) {
							yaL.remove(yaR);
						}
					}
				}
				MCIndexKey yaIdxkey = yaL.createIndex(MST_YIELD_ACT_R.$mfg_act_no);
				MCIndexKey operIdxkey = chk01OperL.createIndex(MfgActReg_Chk01_DtlOperR.$peg_no);
				MCIndexKey yaOperIdxkey = yaL.createIndex(MST_YIELD_ACT_R.$oper_act_no);
				for (MCList<MfgActReg_Chk01_DtlWkR> wkGL : yieldActSrchWkL
						.groupList(MfgActReg_Chk01_DtlWkR.$oper_peg_no)) {
					MfgActReg_Chk01_DtlWkR wkG0R = wkGL.get(0); 
					MfgActReg_Upd02_Hdr1R hdrR = _hdrUpCache.getCache(wkG0R.hdr_peg_no());
					
					MCList<MST_YIELD_ACT_R> subL = MCList.create(MST_YIELD_ACT_R.class);
					MfgActReg_Chk01_DtlOperR operR = chk01OperL.getFirst(operIdxkey, wkG0R.oper_peg_no());
					if (operR.yield_oper_flg()) {
						// 出来高計上工程の場合、自身が紐付く工程の出来高実績のみを対象とする
						subL = yaL.subList(yaOperIdxkey, operR.oper_act_no());
					}
					else {
						subL = yaL.subList(yaIdxkey, hdrR.mfg_act_no());
					}
					if (subL.isEmpty()) {
					}
					else {
						for (MST_YIELD_ACT_R yaR : subL) {
							if (!isNull(addL.getFirst(MfgActReg_Chk01_DtlYieldR.$yield_act_no, yaR.yield_act_no()))) {
								continue;
							}
							MfgActReg_Chk01_DtlYieldR addR = MfgActReg_Chk01_DtlYieldR.create();
							addR.hdr_peg_no(hdrR.peg_no());
							addR.oper_peg_no(wkG0R.oper_peg_no());
							addR.yield_schd_no(yaR.yield_schd_no());
							addR.yield_act_no(yaR.yield_act_no());
							addR.base_unit_yield_act_qty(yaR.base_unit_qty());
							addR.ac_dt(yaR.ac_dt());
							addL.add(addR);
						}
					}
				}
			}
			
			// 出来高実績がDBから検索できなかった場合は、出来高予定をDBから検索
			if (!yieldActSrchHdrL.isEmpty()) {
				MCList<MST_YIELD_SCHD_R> ysL = MCList.create(MST_YIELD_SCHD_R.class);
				MST_YIELD_SCHD_R ysL_t = MST_YIELD_SCHD_R.create("T");
				MCQueryApiBuilder ysL_bldr = MCQueryApiBuilder.create(ysL_t);
				ysL_bldr.setSelect(ysL_t.mfg_inst_no, ysL_t.yield_schd_no);
				ysL_bldr.setWhere(ysL_t.mfg_inst_no.eq(bind("mfg_inst_no")));
				ysL_bldr.addWhereWithAnd(ysL_t.yield_typ.neq(value(MAC_YIELD_TYP.BYPROD.value())));
				ysL_bldr.addWhereWithAnd(ysL_t.can_flg.eq(value(false)));
				dbSelect("MSBCL6050_MST_YIELD_SCHD_S07",
						ysL, ysL_bldr, yieldActSrchHdrL.groupBy(MfgActReg_Upd02_Hdr1R.$mfg_inst_no));
				// 上り電文に存在する出来高予定（削除を除く）は除外する
				for (MfgActReg_Chk01_DtlYieldR delR : chk01YieldL.subList(r -> !r.isStatusDelete())) {
					if (!isNull(delR.yield_schd_no())) {
						MST_YIELD_SCHD_R ysR = ysL.getFirst(MST_YIELD_SCHD_R.$yield_schd_no, delR.yield_schd_no());
						if (!isNull(ysR)) {
							ysL.remove(ysR);
						}
					}
				}
				// 出来高実績に存在する出来高予定は除外する
				for (MfgActReg_Chk01_DtlYieldR delR : addL) {
					if (!isNull(delR.yield_schd_no())) {
						MST_YIELD_SCHD_R ysR = ysL.getFirst(MST_YIELD_SCHD_R.$yield_schd_no, delR.yield_schd_no());
						if (!isNull(ysR)) {
							ysL.remove(ysR);
						}
					}
				}
				
				MCIndexKey ysIdxkey = ysL.createIndex(MST_YIELD_SCHD_R.$mfg_inst_no);
				for (MCList<MfgActReg_Chk01_DtlWkR> wkGL : yieldActSrchWkL
						.groupList(MfgActReg_Chk01_DtlWkR.$oper_peg_no)) {
					MfgActReg_Chk01_DtlWkR wkG0R = wkGL.get(0); 
					MfgActReg_Upd02_Hdr1R hdrR = _hdrUpCache.getCache(wkG0R.hdr_peg_no());
					
					MCList<MST_YIELD_SCHD_R> subL = ysL.subList(ysIdxkey,
							hdrR.mfg_inst_no());
					for (MST_YIELD_SCHD_R ysR : subL) {
						MfgActReg_Chk01_DtlYieldR addR = MfgActReg_Chk01_DtlYieldR
								.create();
						addR.hdr_peg_no(hdrR.peg_no());
						addR.oper_peg_no(wkG0R.oper_peg_no());
						addR.yield_schd_no(ysR.yield_schd_no());
						addR.yield_act_no(null);
						addR.base_unit_yield_act_qty(MCNumber.ZERO);
						addL.add(addR);
					}
				}
			}
			// DBから取得した実績のコンテナに追加
			yaDbL.addAll(addL);
		}
		/**
		 * 上り電文に存在しない出来高から工数の計上日を補完
		 * @param chk01WkL
		 * @param chk01OperL
		 * @param yaDbL
		 */
		protected void compWkAcDt(MCList<MfgActReg_Chk01_DtlWkR> chk01WkL,
				MCList<MfgActReg_Chk01_DtlOperR> chk01OperL,
				MCList<MfgActReg_Chk01_DtlYieldR> yaDbL) {
			if (up0().oper_unit_flg()) {
				// 工程単位実績の場合、getWkContainerで工程実績から計上日を設定しているため、何もしない
				return;
			}
			
			MCIndexKey yieldIdxkey = yaDbL.createIndex(MfgActReg_Chk01_DtlOperR.$hdr_peg_no);
			MCIndexKey operIdxkey = chk01OperL.createIndex(MfgActReg_Chk01_DtlOperR.$peg_no);
			for (MfgActReg_Chk01_DtlWkR wkR : chk01WkL) {
				MCList<MfgActReg_Chk01_DtlYieldR> subYaL = yaDbL.subList(yieldIdxkey, wkR.hdr_peg_no());
				MCDate minAcDt = (MCDate)subYaL.min(MfgActReg_Chk01_DtlYieldR.$ac_dt);
				if (!isNull(wkR.ac_dt())) {
					if (!isNull(minAcDt) && wkR.ac_dt().gt(minAcDt)) {
						wkR.ac_dt(minAcDt);
					}
				}
				else {
					if (!isNull(minAcDt)) {
						wkR.ac_dt(minAcDt);
					}
					else {
						MfgActReg_Chk01_DtlOperR operR = chk01OperL.getFirst(operIdxkey, wkR.oper_peg_no());
						wkR.ac_dt(operR.st_act_tm());
					}
				}
			}
		}

		/**
		 * 自動生成された工程の工程単位実績数量に出来高基準数量を換算して設定する。
		 * @param chk01OperL
		 * @param yieldL
		 * @param yaDbL
		 */
		protected void compOperUnitActQty(MCList<MfgActReg_Upd02_DtlYieldByProdR> dtlUpL, MCList<MfgActReg_Chk01_DtlOperR> chk01OperL, 
				MCList<MfgActReg_Chk01_DtlYieldR> yieldL, MCList<MfgActReg_Chk01_DtlYieldR> yaDbL) {
			if (!up0().oper_unit_flg()) {
				MCList<MfgActReg_Chk01_DtlOperR> autoOperL = chk01OperL.subList(r -> !isNull(r.oper_act_no()) && r.if_auto_reg_flg());
				if (!isNull(autoOperL) && !autoOperL.isEmpty()) {
					// 上り電文の出来高用に、換算する係数を取得する。
					MCList<MAM_ITM_R> itmL = MCList.create(MAM_ITM_R.class);
					MAM_ITM_R t = MAM_ITM_R.create("T");
					MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t);
					itmL_bldr.setSelect(t.itm_cd);
					itmL_bldr.addSelect(t.itm_sub1);
					itmL_bldr.addSelect(t.itm_sub2);
					itmL_bldr.addSelect(t.itm_sub3);
					itmL_bldr.addSelect(t.dec_place);
					itmL_bldr.addSelect(t.rnd_typ);
					itmL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
					itmL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
					itmL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
					itmL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
					dbSelect("MSBCL6050_MAM_ITM_S02", itmL, itmL_bldr, dtlUpL);
					
					MCIndexKey itmIdx = itmL.createIndex(MAM_ITM_R.$itm_cd,
							MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2,
							MAM_ITM_R.$itm_sub3);

					MCList<MAVM_ITM_UNIT_R> itmUnitL = MCList.create(MAVM_ITM_UNIT_R.class);
					MAVM_ITM_UNIT_R t1 = MAVM_ITM_UNIT_R.create("T1");
					MCQueryApiBuilder itmUnitL_bldr = MCQueryApiBuilder.create(t1);
					itmUnitL_bldr.setSelect(t1.itm_cd);
					itmUnitL_bldr.addSelect(t1.itm_sub1);
					itmUnitL_bldr.addSelect(t1.itm_sub2);
					itmUnitL_bldr.addSelect(t1.itm_sub3);
					itmUnitL_bldr.addSelect(t1.unit_cd);
					itmUnitL_bldr.addSelect(t1.conv_base_qty);
					itmUnitL_bldr.addSelect(t1.conv_qty);
					itmUnitL_bldr.setWhere(t1.itm_cd.eq(bind("itm_cd")));
					itmUnitL_bldr.addWhereWithAnd(t1.itm_sub1.eq(bind("itm_sub1")));
					itmUnitL_bldr.addWhereWithAnd(t1.itm_sub2.eq(bind("itm_sub2")));
					itmUnitL_bldr.addWhereWithAnd(t1.itm_sub3.eq(bind("itm_sub3")));
					dbSelect("MSBCL6050_MAVM_ITM_UNIT_S03", itmUnitL, itmUnitL_bldr, dtlUpL);

					MCIndexKey unitIdx = itmUnitL.createIndex(MAVM_ITM_UNIT_R.$itm_cd,
							MAVM_ITM_UNIT_R.$itm_sub1, MAVM_ITM_UNIT_R.$itm_sub2,
							MAVM_ITM_UNIT_R.$itm_sub3, MAVM_ITM_UNIT_R.$unit_cd);
					
					for (MfgActReg_Chk01_DtlOperR operR : autoOperL) {
						MCNumber upYield = new MCNumber(0);
						if (!isNull(yieldL) && !yieldL.isEmpty()) {
							// 基準単位出来高数量を取得する。
							for(MfgActReg_Chk01_DtlYieldR yieldR : yieldL.subList(r -> !r.isStatusDelete() && r.oper_peg_no().eq(operR.peg_no()))) {
								MfgActReg_Upd02_DtlYieldByProdR dtlupdR = dtlUpL.getFirst(MfgActReg_Upd02_DtlYieldByProdR.$peg_no, yieldR.peg_no());
								MAVM_ITM_UNIT_R itmUnitR = itmUnitL.getFirst(unitIdx, dtlupdR.itm_cd(),dtlupdR.itm_sub1(), dtlupdR.itm_sub2(), dtlupdR.itm_sub3(), dtlupdR.trd_unit_cd());
								MAM_ITM_R itmR = itmL.getFirst(itmIdx, dtlupdR.itm_cd(),dtlupdR.itm_sub1(), dtlupdR.itm_sub2(), dtlupdR.itm_sub3());
								MCNumber tmpQty = convToBaseUnit(yieldR.trd_unit_yield_act_qty(), itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
										itmR.dec_place(), itmR.rnd_typ());
								if (!isNull(tmpQty)) {
									upYield = upYield.add(tmpQty);
								}
							}
							if (isNull(upYield)) {
								upYield = new MCNumber(0);
							}
						}
						MCNumber yaDbYield = new MCNumber(0);
						if (!isNull(yaDbL) && !yaDbL.isEmpty()) {
							yaDbYield = yaDbL.subList(r -> r.oper_peg_no().eq(operR.peg_no())).sum(MfgActReg_Chk01_DtlYieldR.$base_unit_yield_act_qty);
							if (isNull(yaDbYield)) {
								yaDbYield = new MCNumber(0);
							}
						}
						operR.oper_unit_act_qty(convQtyBaseToOper(upYield.add(yaDbYield),
								operR.oper_conv_qty(), operR.oper_std_qty(), 
								operR.oper_unit_dec_place(), 
								operR.oper_unit_conv_rnd_typ()));
					}
				}
			}
		}
		
		protected boolean canWkCalc(MCList<MST_WK_ACT_REM_R> instNoSubL, MCIndexKey subLIdxKey, String wkSchdNo) {
			return isNull(instNoSubL.getFirst(subLIdxKey, wkSchdNo, false));
		}
		
		protected MfgActReg_Chk01_DtlWkR getWkContainerSub(MfgActReg_Chk01_DtlOperR operR, MST_WK_ACT_REM_R remR, MCDate acDt) {
			MfgActReg_Chk01_DtlWkR retR = MfgActReg_Chk01_DtlWkR.create();
			retR.hdr_peg_no(operR.hdr_peg_no());
			retR.oper_peg_no(operR.peg_no());
			retR.wk_cost_cd(remR.getStringNE("wk_cost_cd"));
			if (!remR.getBooleanNE("abort_flg") && !isNull(operR.end_act_tm()) && !operR.not_cmpl_flg()) {
				// 打切フラグがオフの場合でも、工程実績が完了していれば工数を打ち切る
				retR.abort_flg(true);
			}
			else {
				retR.abort_flg(remR.getBooleanNE("abort_flg"));
			}
			retR.wk_cost_calc_upd_flg(remR.getBooleanNE("wk_cost_calc_upd_flg"));
			retR.wk_schd_no(remR.getStringNE("wk_schd_no"));
			retR.ac_dt(acDt);
			if (operR.getBooleanNE("use_org_ac_dt_flg") && !isNull(remR.getDateNE("ac_dt"))) {
				retR.ac_dt(remR.getDateNE("ac_dt"));
			}
			return retR;
		}
		
		protected void copyWkActCol(MfgActReg_Chk01_DtlWkR retR, MST_WK_ACT_REM_R remR) {
			retR.st_tm(remR.getDateNE("st_tm"));
			retR.end_tm(remR.getDateNE("end_tm"));
			retR.brk_pd(remR.getNumberNE("brk_pd"));
			retR.wk_day_cd(remR.getStringNE("wk_day_cd"));
			retR.wk_rsn_cd(remR.getStringNE("wk_rsn_cd"));
			retR.wk_usr_cd(remR.getStringNE("wk_usr_cd"));
			retR.wk_usr_dpt_cd(remR.getStringNE("wk_usr_dpt_cd"));
			retR.fclty(remR.getStringNE("fclty"));
			retR.wk_act_intr_rmrks(remR.getStringNE("wk_act_intr_rmrks"));
			retR.wk_act_sub_char1(remR.getStringNE("wk_act_sub_char1"));
			retR.wk_act_sub_char2(remR.getStringNE("wk_act_sub_char2"));
			retR.wk_act_sub_char3(remR.getStringNE("wk_act_sub_char3"));
			retR.wk_act_no(remR.getStringNE("wk_act_no"));
			retR.act_wk_cost(remR.getNumberNE("wk_cost"));
			retR.setDateNE("bef_ac_dt", remR.getDateNE("ac_dt"));
			retR.mes_flg(remR.getBooleanNE("mes_flg")); 
			retR.ext_sys_cd(remR.getStringNE("ext_sys_cd")); 
			retR.ext_wk_act_no(remR.getStringNE("ext_wk_act_no")); 
		}
		
		/**
		 * 製造再計算サービスを実行する。
		 */
		protected void callReCalcSrv(MCList<MfgActReg_Chk01_HdrR> hdrL,
				MCList<MfgActReg_Chk01_DtlOperR> operL,
				MCList<MfgActReg_Chk01_DtlYieldR> yieldL,
				MCList<MfgActReg_Chk01_DtlYieldR> yaDbL,
				MCList<MfgActReg_Chk01_DtlByProdR> byProdL,
				MCList<MfgActReg_Chk01_DtlInptR> inptL,
				MCList<MfgActReg_Chk01_DtlWkR> wkL,
				MCList<MfgActReg_Chk01_DtlLossR> lossL) {

			// 着手時再計算を実行し予定数を求める
			MSBCL_MfgReCalcService.MfgReCalc_Sprt03 sprt03 = MSBCL_MfgReCalcService.crtMfgReCalc_Sprt03();
			addAll(sprt03.up0(), hdrL, createMap_MfgReCalc_Sprt03_HdrR_MfgActReg_Chk01_HdrR());
			addAll(sprt03.up1(), operL, createMap_MfgReCalc_Sprt03_DtlOperR_MfgActReg_Chk01_DtlOperR());
			addAll(sprt03.up2(), yieldL, createMap_MfgReCalc_Sprt03_DtlYieldR_MfgActReg_Chk01_DtlYieldR());
			addAll(sprt03.up2(), yaDbL, createMap_MfgReCalc_Sprt03_DtlYieldR_MfgActReg_Chk01_DtlYieldR());
			addAll(sprt03.up3(), byProdL, createMap_MfgReCalc_Sprt03_DtlYieldR_MfgActReg_Chk01_DtlByProdR());
			addAll(sprt03.up4(), inptL, createMap_MfgReCalc_Sprt03_DtlInptR_MfgActReg_Chk01_DtlInptR());
			addAll(sprt03.up5(), wkL, createMap_MfgReCalc_Sprt03_DtlWkR_MfgActReg_Chk01_DtlWkR());
			
			sprt03.exec();
			replaceInptAndLossLAftStRecalc(sprt03.down3(), inptL, lossL);
			
			// 投入・工数再計算を実行し投入実績数、工数を求める
			// ※着手時再計算の結果登録対象外となった投入は除く
			MSBCL_MfgReCalcService.MfgReCalc_Sprt02 sprt02 = MSBCL_MfgReCalcService.crtMfgReCalc_Sprt02();
			setReCalcSprt02Up(hdrL, operL, yieldL, yaDbL, inptL, wkL, sprt03, sprt02);
			sprt02.exec();
			
			// 再計算結果を設定。また以下の行を除く
			// ・再計算の結果、数量・工数がnullとなった場合
			// ・先の処理で投入の日付が設定できなかった場合
			// ・投入予定単位でバックフラッシュ更新不可の場合（再計算処理にはバックフラッシュ更新不可の投入予定も渡す必要があるため、ここで除外する）
			setSprt02RsltAndRemoveL(inptL, lossL, wkL, sprt02.down0(), sprt02.down1());
			
			// 投入コンテナから削除されたら紐付くロスも削除する
			removeLoss(inptL, lossL);
		}
		
		/**
		 * 着手時再計算の結果、登録対象外となった投入行、ロス行を除く
		 */
		protected void replaceInptAndLossLAftStRecalc(
				MCList<MfgReCalc_Sprt03_DtlInptR> stRecalcInptDownL,
				MCList<MfgActReg_Chk01_DtlInptR> inptL,
				MCList<MfgActReg_Chk01_DtlLossR> lossL) {
			Set<MCNumber> nullPegNoSet = new HashSet<MCNumber>();
			MCList<MfgReCalc_Sprt03_DtlInptR> notNullL = MCList.create(MfgReCalc_Sprt03_DtlInptR.class);
			
			// 投入
			for (MfgReCalc_Sprt03_DtlInptR stRecalcDownR : stRecalcInptDownL) {
				// 必要数量は投入では使用しないため投入数量と固定数量のみnullか否かを評価する
				if (isNullAnd(stRecalcDownR.base_unit_inpt_st_qty(),
						stRecalcDownR.base_unit_fxd_rqmt_st_qty(),
						stRecalcDownR.cont_inpt_st_qty(),
						stRecalcDownR.cont_fxd_rqmt_st_qty())) {
					nullPegNoSet.add(stRecalcDownR.peg_no());
				}
				else {
					notNullL.add(stRecalcDownR);
				}
			}
			stRecalcInptDownL.setAll(notNullL);
			
			MCList<MfgActReg_Chk01_DtlInptR> removeL = MCList.create(MfgActReg_Chk01_DtlInptR.class);
			for (MfgActReg_Chk01_DtlInptR inptR : inptL) {
				if (nullPegNoSet.contains(inptR.peg_no())) {
					removeL.add(inptR);
				}
			}
			inptL.removeAll(removeL);
			
			// ロス
			MCIndexKey inptIdxKey = inptL.createIndex(MfgActReg_Chk01_DtlInptR.$peg_no);
			MCIndexKey idxkey = stRecalcInptDownL.createIndex(MfgReCalc_Sprt03_DtlInptR.$peg_no);
			MCList<MfgActReg_Chk01_DtlLossR> newLossL = MCList.create(MfgActReg_Chk01_DtlLossR.class);
			for (MfgActReg_Chk01_DtlLossR lossR : lossL) {
				if (isNull(lossR.loss_act_no())) {
					MfgReCalc_Sprt03_DtlInptR stRecalcDownR = stRecalcInptDownL.getFirst(idxkey, lossR.inpt_peg_no());
					if (!isNull(stRecalcDownR)) {
						lossR.loss_qty(stRecalcDownR.base_unit_fxd_rqmt_st_qty());
						MfgActReg_Chk01_DtlInptR inptR = inptL.getFirst(inptIdxKey, lossR.inpt_peg_no());
						if (!isNull(inptR) && inptR.cont_fctr_flg()) {
							lossR.cont_loss_qty(stRecalcDownR.cont_fxd_rqmt_st_qty());
						}
						newLossL.add(lossR);
					}
				}
				else {
					newLossL.add(lossR);
				}
			}
			lossL.setAll(newLossL);
		}

		/**
		 * 数量がnull、ゼロ、マイナスのいずれかの場合はtrue
		 * @param num
		 * @return
		 */
		protected boolean isNullOrZeroOrMinus(MCNumber num) {
			return isNull(num) || num.isZero() || num.isNegative();
		}

		/**
		 * 投入コンテナに存在しない紐付けＮＯを持つロスコンテナの行を削除します。
		 * 投入コンテナのステータスが削除の場合、ロスコンテナのステータスも削除にします。
		 * @param inptL 投入コンテナ
		 * @param lossL ロスコンテナ
		 */
		protected void removeLoss(MCList<MfgActReg_Chk01_DtlInptR> inptL,
				MCList<MfgActReg_Chk01_DtlLossR> lossL) {
			MCIndexKey idxKey = inptL.createIndex(MfgActReg_Chk01_DtlInptR.$peg_no);
			MCList<MfgActReg_Chk01_DtlLossR> removeL = MCList.create(MfgActReg_Chk01_DtlLossR.class);
			for (MfgActReg_Chk01_DtlLossR lossR : lossL) {
				MfgActReg_Chk01_DtlInptR inptR = inptL.getFirst(idxKey, lossR.inpt_peg_no());
				if (isNull(inptR)) {
					removeL.add(lossR);
				}
				else if (isNull(lossR.loss_qty())) {
					removeL.add(lossR);
				}
				else if (inptR.isStatusDelete()) {
					lossR.setStatus(MCRow.DELETE);
				}
			}
			if (!removeL.isEmpty()) {
				lossL.removeAll(removeL);
			}
		}
		
		// 着手時再計算（ヘッダ）
		protected Map_MfgReCalc_Sprt03_HdrR_MfgActReg_Chk01_HdrR<MfgReCalc_Sprt03_HdrR,MfgActReg_Chk01_HdrR> createMap_MfgReCalc_Sprt03_HdrR_MfgActReg_Chk01_HdrR() {
			return new Map_MfgReCalc_Sprt03_HdrR_MfgActReg_Chk01_HdrR<MfgReCalc_Sprt03_HdrR, MfgActReg_Chk01_HdrR>();
		}

		public class Map_MfgReCalc_Sprt03_HdrR_MfgActReg_Chk01_HdrR<D extends MfgReCalc_Sprt03_HdrR, S extends MfgActReg_Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgReCalc_Sprt03_HdrR.$peg_no, MfgActReg_Chk01_HdrR.$peg_no);
				addColumnPathMap(MfgReCalc_Sprt03_HdrR.$mfg_inst_no, MfgActReg_Chk01_HdrR.$mfg_inst_no);
				addColumnPathMap(MfgReCalc_Sprt03_HdrR.$div_seq, MfgActReg_Chk01_HdrR.$div_seq);
				addColumnPathMap(MfgReCalc_Sprt03_HdrR.$base_unit_st_qty, MfgActReg_Chk01_HdrR.$base_unit_st_act_qty);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (isNull(src.mfg_act_no())) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}
		
		// 着手時再計算（工程）
		protected Map_MfgReCalc_Sprt03_DtlOperR_MfgActReg_Chk01_DtlOperR<MfgReCalc_Sprt03_DtlOperR,MfgActReg_Chk01_DtlOperR> createMap_MfgReCalc_Sprt03_DtlOperR_MfgActReg_Chk01_DtlOperR() {
			return new Map_MfgReCalc_Sprt03_DtlOperR_MfgActReg_Chk01_DtlOperR<MfgReCalc_Sprt03_DtlOperR, MfgActReg_Chk01_DtlOperR>();
		}

		public class Map_MfgReCalc_Sprt03_DtlOperR_MfgActReg_Chk01_DtlOperR<D extends MfgReCalc_Sprt03_DtlOperR, S extends MfgActReg_Chk01_DtlOperR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgReCalc_Sprt03_DtlOperR.$hdr_peg_no, MfgActReg_Chk01_DtlOperR.$hdr_peg_no);
				addColumnPathMap(MfgReCalc_Sprt03_DtlOperR.$peg_no, MfgActReg_Chk01_DtlOperR.$peg_no);
				addColumnPathMap(MfgReCalc_Sprt03_DtlOperR.$oper_inst_no, MfgActReg_Chk01_DtlOperR.$oper_inst_no);

			}
		}
		
		// 着手時再計算（出来高）
		protected Map_MfgReCalc_Sprt03_DtlYieldR_MfgActReg_Chk01_DtlYieldR<MfgReCalc_Sprt03_DtlYieldR,MfgActReg_Chk01_DtlYieldR> createMap_MfgReCalc_Sprt03_DtlYieldR_MfgActReg_Chk01_DtlYieldR() {
			return new Map_MfgReCalc_Sprt03_DtlYieldR_MfgActReg_Chk01_DtlYieldR<MfgReCalc_Sprt03_DtlYieldR, MfgActReg_Chk01_DtlYieldR>();
		}

		public class Map_MfgReCalc_Sprt03_DtlYieldR_MfgActReg_Chk01_DtlYieldR<D extends MfgReCalc_Sprt03_DtlYieldR, S extends MfgActReg_Chk01_DtlYieldR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgReCalc_Sprt03_DtlYieldR.$hdr_peg_no, MfgActReg_Chk01_DtlYieldR.$hdr_peg_no);
				addColumnPathMap(MfgReCalc_Sprt03_DtlYieldR.$oper_peg_no, MfgActReg_Chk01_DtlYieldR.$oper_peg_no);
				addColumnPathMap(MfgReCalc_Sprt03_DtlYieldR.$peg_no, MfgActReg_Chk01_DtlYieldR.$peg_no);
				addColumnPathMap(MfgReCalc_Sprt03_DtlYieldR.$yield_schd_no, MfgActReg_Chk01_DtlYieldR.$yield_schd_no);
			}
		}
		
		// 着手時再計算（副産品）
		protected Map_MfgReCalc_Sprt03_DtlYieldR_MfgActReg_Chk01_DtlByProdR<MfgReCalc_Sprt03_DtlYieldR,MfgActReg_Chk01_DtlByProdR> createMap_MfgReCalc_Sprt03_DtlYieldR_MfgActReg_Chk01_DtlByProdR() {
			return new Map_MfgReCalc_Sprt03_DtlYieldR_MfgActReg_Chk01_DtlByProdR<MfgReCalc_Sprt03_DtlYieldR, MfgActReg_Chk01_DtlByProdR>();
		}

		public class Map_MfgReCalc_Sprt03_DtlYieldR_MfgActReg_Chk01_DtlByProdR<D extends MfgReCalc_Sprt03_DtlYieldR, S extends MfgActReg_Chk01_DtlByProdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgReCalc_Sprt03_DtlYieldR.$hdr_peg_no, MfgActReg_Chk01_DtlByProdR.$hdr_peg_no);
				addColumnPathMap(MfgReCalc_Sprt03_DtlYieldR.$oper_peg_no, MfgActReg_Chk01_DtlByProdR.$oper_peg_no);
				addColumnPathMap(MfgReCalc_Sprt03_DtlYieldR.$peg_no, MfgActReg_Chk01_DtlByProdR.$peg_no);
				addColumnPathMap(MfgReCalc_Sprt03_DtlYieldR.$yield_schd_no, MfgActReg_Chk01_DtlByProdR.$yield_schd_no);
			}
		}
		
		// 着手時再計算（投入）
		protected Map_MfgReCalc_Sprt03_DtlInptR_MfgActReg_Chk01_DtlInptR<MfgReCalc_Sprt03_DtlInptR,MfgActReg_Chk01_DtlInptR> createMap_MfgReCalc_Sprt03_DtlInptR_MfgActReg_Chk01_DtlInptR() {
			return new Map_MfgReCalc_Sprt03_DtlInptR_MfgActReg_Chk01_DtlInptR<MfgReCalc_Sprt03_DtlInptR, MfgActReg_Chk01_DtlInptR>();
		}

		public class Map_MfgReCalc_Sprt03_DtlInptR_MfgActReg_Chk01_DtlInptR<D extends MfgReCalc_Sprt03_DtlInptR, S extends MfgActReg_Chk01_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgReCalc_Sprt03_DtlInptR.$hdr_peg_no, MfgActReg_Chk01_DtlInptR.$hdr_peg_no);
				addColumnPathMap(MfgReCalc_Sprt03_DtlInptR.$oper_peg_no, MfgActReg_Chk01_DtlInptR.$oper_peg_no);
				addColumnPathMap(MfgReCalc_Sprt03_DtlInptR.$peg_no, MfgActReg_Chk01_DtlInptR.$peg_no);
				addColumnPathMap(MfgReCalc_Sprt03_DtlInptR.$inpt_schd_no, MfgActReg_Chk01_DtlInptR.$inpt_schd_no);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				dest.recalc_grp(src.getNumberNE("tmp_recalc_grp"));
				dest.recalc_grp_seq(src.getNumberNE("tmp_recalc_grp_seq"));
			}
		}
		
		// 着手時再計算（工数）
		protected Map_MfgReCalc_Sprt03_DtlWkR_MfgActReg_Chk01_DtlWkR<MfgReCalc_Sprt03_DtlWkR,MfgActReg_Chk01_DtlWkR> createMap_MfgReCalc_Sprt03_DtlWkR_MfgActReg_Chk01_DtlWkR() {
			return new Map_MfgReCalc_Sprt03_DtlWkR_MfgActReg_Chk01_DtlWkR<MfgReCalc_Sprt03_DtlWkR, MfgActReg_Chk01_DtlWkR>();
		}

		public class Map_MfgReCalc_Sprt03_DtlWkR_MfgActReg_Chk01_DtlWkR<D extends MfgReCalc_Sprt03_DtlWkR, S extends MfgActReg_Chk01_DtlWkR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgReCalc_Sprt03_DtlWkR.$hdr_peg_no, MfgActReg_Chk01_DtlWkR.$hdr_peg_no);
				addColumnPathMap(MfgReCalc_Sprt03_DtlWkR.$oper_peg_no, MfgActReg_Chk01_DtlWkR.$oper_peg_no);
				addColumnPathMap(MfgReCalc_Sprt03_DtlWkR.$peg_no, MfgActReg_Chk01_DtlWkR.$peg_no);
				addColumnPathMap(MfgReCalc_Sprt03_DtlWkR.$wk_schd_no, MfgActReg_Chk01_DtlWkR.$wk_schd_no);
			}
		}
		
		/**
		 * 投入・工数再計算の上り電文を設定する
		 */
		protected void setReCalcSprt02Up(
				MCList<MfgActReg_Chk01_HdrR> hdrL,
				MCList<MfgActReg_Chk01_DtlOperR> operL,
				MCList<MfgActReg_Chk01_DtlYieldR> yieldL,
				MCList<MfgActReg_Chk01_DtlYieldR> yaDbL,
				MCList<MfgActReg_Chk01_DtlInptR> inptL,
				MCList<MfgActReg_Chk01_DtlWkR> wkL,
				MSBCL_MfgReCalcService.MfgReCalc_Sprt03 sprt03,
				MSBCL_MfgReCalcService.MfgReCalc_Sprt02 sprt02) {
			
			editRecalcUp(hdrL, operL, yieldL, yaDbL, inptL, wkL);
			addAll(sprt02.up0(), hdrL, createMap_MfgReCalc_Sprt02_HdrR_MfgActReg_Chk01_HdrR());
			addAll(sprt02.up1(), operL, createMap_MfgReCalc_Sprt02_DtlOperR_MfgActReg_Chk01_DtlOperR());
			addAll(sprt02.up2(), yieldL.subList(r -> !r.isStatusDelete()),
					createMap_MfgReCalc_Sprt02_DtlYieldR_MfgActReg_Chk01_DtlYieldR());
			addAll(sprt02.up2(), yaDbL, createMap_MfgReCalc_Sprt02_DtlYieldR_MfgActReg_Chk01_DtlYieldR());
			addAll(sprt02.up3(), inptL, createMap_MfgReCalc_Sprt02_DtlInptR_MfgActReg_Chk01_DtlInptR());
			addAll(sprt02.up4(), wkL, createMap_MfgReCalc_Sprt02_DtlWkR_MfgActReg_Chk01_DtlWkR());

			// 着手時再計算の結果を設定
			// 工程
			copyByPegNo(sprt02.up1(), new String[] {
					MfgReCalc_Sprt02_DtlOperR.$base_unit_st_qty
			}, sprt03.down0(), new String[] {
					MfgReCalc_Sprt03_DtlOperR.$base_unit_st_qty
			});
			// 出来高
			copyByPegNo(sprt02.up2(), new String[] {
					MfgReCalc_Sprt02_DtlYieldR.$base_unit_yield_st_qty
			}, sprt03.down1(), new String[] {
					MfgReCalc_Sprt03_DtlYieldR.$base_unit_yield_st_qty
			});
			if (isSame(getSysParm("PROP_BK_INST_QTY_FLG"), "1")) {
				// システムパラメータ「PROP_BK_INST_QTY_FLG」の値が"1"の場合は、着手時再計算の結果を換算する
				convYieldStQty(hdrL, sprt02.up2(), sprt03.down1());
			}
			// 投入
			MCIndexKey idxkey = sprt03.down3().createIndex(MfgReCalc_Sprt03_DtlInptR.$peg_no);
			for (MfgReCalc_Sprt02_DtlInptR sprt02R : sprt02.up3()) {
				MfgReCalc_Sprt03_DtlInptR sprt03R = sprt03.down3().getFirst(idxkey, sprt02R.peg_no());
				if (sprt02R.getBooleanNE("tmp_cont_fctr_flg")) {
					sprt02R.inpt_st_qty(nvl(sprt03R.cont_inpt_st_qty(), MCNumber.ZERO));
				}
				else {
					sprt02R.inpt_st_qty(nvl(sprt03R.base_unit_inpt_st_qty(), MCNumber.ZERO));
				}
			}
			
			// 工数
			copyByPegNo(sprt02.up4(), new String[] {
					MfgReCalc_Sprt02_DtlWkR.$st_cost,
					MfgReCalc_Sprt02_DtlWkR.$st_fxd_cost,
					MfgReCalc_Sprt02_DtlWkR.$dec_place
			}, sprt03.down4(), new String[] {
					MfgReCalc_Sprt03_DtlWkR.$st_wk_cost,
					MfgReCalc_Sprt03_DtlWkR.$st_fxd_wk_cost,
					MfgReCalc_Sprt03_DtlWkR.$dec_place
			});
		}
		
		protected static final int DEC_PLACE = 8; 
		
		protected void convYieldStQty(MCList<MfgActReg_Chk01_HdrR> hdrL, MCList<MfgReCalc_Sprt02_DtlYieldR> destL,
				MCList<MfgReCalc_Sprt03_DtlYieldR> srcL) {
			// 着手時再計算の結果の出来高着手数量を、製造指図数量（歩留分を加算した数量）に換算する
			// ※投入予定数量は製造指図数量が元になっているため、バックフラッシュの計算にはこちらを使用する

			// 製造指図テーブル、出来高予定テーブル、品目マスタを抽出
			MCList<MST_YIELD_SCHD_R> ysL = selectYieldSchd(srcL);

			MCIndexKey ysKey = ysL.createIndex(MST_YIELD_SCHD_R.$yield_schd_no);
			MCIndexKey srcKey = srcL.createIndex(MfgReCalc_Sprt03_DtlYieldR.$peg_no);
			MCIndexKey hdrKey = hdrL.createIndex(MfgActReg_Chk01_HdrR.$peg_no);

			for (MfgReCalc_Sprt02_DtlYieldR destR : destL) {
				MfgReCalc_Sprt03_DtlYieldR srcR = srcL.getFirst(srcKey,
						destR.getNumberNE("peg_no"));
				MST_YIELD_SCHD_R ysR = ysL.getFirst(ysKey, destR.yield_schd_no());

				if (isNull(srcR) || isNull(ysR)) {
					continue;
				}

				// 製造指図の製造指図数量と出来高予定数量が等しい場合は換算不要のため何もしない
				if (ysR.getNumberNE("hdr_inst_qty").eq(ysR.getNumberNE("hdr_yield_qty"))) {
					continue;
				}

				// 製造指図の出来高予定数量と、換算前の出来高着手数量が等しい場合、換算後の出来高着手数量には製造指図数量をそのまま設定する
				if (srcR.base_unit_yield_st_qty().eq(ysR.getNumberNE("hdr_yield_qty"))) {
					destR.base_unit_yield_st_qty(ysR.getNumberNE("hdr_inst_qty"));
					continue;
				}
				
				// ヘッダの出来高予定数量と、出来高予定の出来高予定数量が等しい場合、換算後の出来高着手数量にはヘッダの着手数量ををそのまま設定する
				// ※上記に該当するのは、製造指図に紐付く出来高予定が１件の場合。（指図時に出来高予定を行コピーした場合や、出来高計上工程が複数ある場合は該当しない）
				// その場合、着手数量（製造指図の製造指図数量を分割した値）を出来高予定の着手数とみなすことができる
				if (ysR.getNumberNE("hdr_yield_qty").eq(ysR.base_unit_yield_qty())) {
					MfgActReg_Chk01_HdrR hdrR = hdrL.getFirst(hdrKey, srcR.hdr_peg_no());
					destR.base_unit_yield_st_qty(hdrR.base_unit_st_act_qty());
					continue;
				}
				
				// 製造指図と出来高予定の出来高予定数が異なる場合、以下の計算式で出来高着手数量を算出
				// 製造指図数量×（着手時再計算結果の出来高着手数量÷出来高予定の出来高予定数量）
				// この時点で品目の小数部有効桁数で端数処理してしまうと再計算処理で誤差が出てしまうため、最大の小数部有効桁数（8桁）を使用する
				destR.base_unit_yield_st_qty(ysR.getNumberNE("hdr_inst_qty")
						.multiply(srcR.base_unit_yield_st_qty())
						.divide(ysR.getNumberNE("hdr_yield_qty"), DEC_PLACE,
								MAC_RND_TYP.RNDUP.toMC()));
			}
		}

		protected MCList<MST_YIELD_SCHD_R> selectYieldSchd(
				MCList<MfgReCalc_Sprt03_DtlYieldR> srcL) {
			// 出来高予定から出来高予定数量、製造指図から製造指図数量と出来高予定数量、品目マスタから小数部有効桁数を取得
			MCList<MST_YIELD_SCHD_R> ysL = MCList.create(MST_YIELD_SCHD_R.class);
			MST_YIELD_SCHD_R t = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder ysL_bldr = MCQueryApiBuilder.create(t);
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			MST_MFG_INST_R t1 = MST_MFG_INST_R.create("T1");
			ysL_bldr.setSelect(t.yield_schd_no);
			ysL_bldr.addSelect(t.base_unit_yield_qty);
			ysL_bldr.addSelect(t1.base_unit_inst_qty.as("hdr_inst_qty"));
			ysL_bldr.addSelect(t1.base_unit_yield_qty.as("hdr_yield_qty"));
			ysL_bldr.addSelect(m1.dec_place);
			ysL_bldr.addInnerJoin(m1,
					bracket(t.itm_cd.eq(m1.itm_cd)
							.and(t.itm_sub1.eq(m1.itm_sub1))
							.and(t.itm_sub2.eq(m1.itm_sub2))
							.and(t.itm_sub3.eq(m1.itm_sub3))));
			ysL_bldr.addInnerJoin(t1, bracket(t.mfg_inst_no.eq(t1.mfg_inst_no)));
			dbSelectKey("MSBCL6050_MST_YIELD_SCHD_S08",
					ysL, ysL_bldr, srcL.groupBy(MST_YIELD_SCHD_R.$yield_schd_no));
			return ysL;
		}
		
		protected void editRecalcUp(
				MCList<MfgActReg_Chk01_HdrR> hdrL,
				MCList<MfgActReg_Chk01_DtlOperR> operL,
				MCList<MfgActReg_Chk01_DtlYieldR> yieldL,
				MCList<MfgActReg_Chk01_DtlYieldR> yaDbL,
				MCList<MfgActReg_Chk01_DtlInptR> inptL,
				MCList<MfgActReg_Chk01_DtlWkR> wkL) {

			// ヘッダコンテナの編集
			MCList<MfgActReg_Chk01_HdrR> updL = hdrL.subList(r -> !isNull(r.mfg_act_no()));
			if (!updL.isEmpty()) {
				MST_MFG_ACT_R actL_t = MST_MFG_ACT_R.create("T");
				MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(actL_t);
				actL_bldr.setSelect(actL_t.arr_purc_auto_reg_flg);
				FXUCL_MCDbcCache<MST_MFG_ACT_R> actCache = new FXUCL_MCDbcCache<MST_MFG_ACT_R>(
						actL_bldr, updL, MfgActReg_Chk01_HdrR.$mfg_act_no);
				for (MfgActReg_Chk01_HdrR r : hdrL) {
					MST_MFG_ACT_R actR = actCache.get(r.mfg_act_no());
					r.arr_purc_auto_reg_flg(actR.arr_purc_auto_reg_flg());
				}
			}
			MST_MFG_INST_R instL_t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder instL_bldr = MCQueryApiBuilder.create(instL_t);
			MST_ITM_MFG_INST_R t2 = MST_ITM_MFG_INST_R.create("T2");
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			instL_bldr.setSelect(instL_t.mfg_inst_no);
			instL_bldr.addSelect(m1.unit_cd.as("base_unit_cd"));
			instL_bldr.addSelect(m1.dec_place.as("base_unit_dec_place"));
			instL_bldr.addSelect(m1.rnd_typ.as("base_unit_conv_rnd_typ"));
			instL_bldr.addInnerJoin(t2,
					bracket(instL_t.itm_mfg_inst_no.eq(t2.itm_mfg_inst_no)));
			instL_bldr.addInnerJoin(m1,
					bracket(t2.itm_cd.eq(m1.itm_cd)
							.and(t2.itm_sub1.eq(m1.itm_sub1))
							.and(t2.itm_sub2.eq(m1.itm_sub2))
							.and(t2.itm_sub3.eq(m1.itm_sub3))));
			FXUCL_MCDbcCache<MST_MFG_INST_R> instCache = new FXUCL_MCDbcCache<MST_MFG_INST_R>(
					instL_bldr, hdrL, MfgActReg_Chk01_HdrR.$mfg_inst_no);
			
			for (MfgActReg_Chk01_HdrR r : hdrL) {
				MST_MFG_INST_R instR = instCache.get(r.mfg_inst_no());
				r.setStringNE("tmp_base_unit_cd", instR.getStringNE("base_unit_cd"));
				r.setNumberNE("tmp_base_unit_dec_place", instR.getNumberNE("base_unit_dec_place"));
				r.setStringNE("tmp_base_unit_conv_rnd_typ", instR.getStringNE("base_unit_conv_rnd_typ"));
			}
			
			// 出来高コンテナの編集
			MCList<MfgActReg_Chk01_DtlYieldR> bindL = MCList.create(MfgActReg_Chk01_DtlYieldR.class);
			bindL.addAll(yieldL);
			bindL.addAll(yaDbL);
			MCList<MST_YIELD_SCHD_R> ysL = MCList.create(MST_YIELD_SCHD_R.class);
			MST_YIELD_SCHD_R ysL_t = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder ysL_bldr = MCQueryApiBuilder.create(ysL_t);
			ysL_bldr.setSelect(ysL_t.yield_schd_no);
			ysL_bldr.addSelect(ysL_t.itm_cd);
			ysL_bldr.addSelect(ysL_t.itm_sub1);
			ysL_bldr.addSelect(ysL_t.itm_sub2);
			ysL_bldr.addSelect(ysL_t.itm_sub3);
			ysL_bldr.addSelect(ysL_t.base_unit_cd);
			ysL_bldr.addSelect(m1.dec_place);
			ysL_bldr.addSelect(m1.rnd_typ);
			ysL_bldr.addInnerJoin(m1,
					bracket(ysL_t.itm_cd.eq(m1.itm_cd)
							.and(ysL_t.itm_sub1.eq(m1.itm_sub1))
							.and(ysL_t.itm_sub2.eq(m1.itm_sub2))
							.and(ysL_t.itm_sub3.eq(m1.itm_sub3))));
			dbSelectKey("MSBCL6050_MST_YIELD_SCHD_S09",
					ysL, ysL_bldr, bindL.groupBy(MST_YIELD_SCHD_R.$yield_schd_no));
			
			MCList<MAVM_ITM_UNIT_R> itmUnitL = MCList.create(MAVM_ITM_UNIT_R.class);
			MAVM_ITM_UNIT_R itmUnitL_t = MAVM_ITM_UNIT_R.create("T");
			MCQueryApiBuilder itmUnitL_bldr = MCQueryApiBuilder.create(itmUnitL_t);
			itmUnitL_bldr.setSelect(itmUnitL_t.itm_cd);
			itmUnitL_bldr.addSelect(itmUnitL_t.itm_sub1);
			itmUnitL_bldr.addSelect(itmUnitL_t.itm_sub2);
			itmUnitL_bldr.addSelect(itmUnitL_t.itm_sub3);
			itmUnitL_bldr.addSelect(itmUnitL_t.unit_cd);
			itmUnitL_bldr.addSelect(itmUnitL_t.conv_base_qty);
			itmUnitL_bldr.addSelect(itmUnitL_t.conv_qty);
			itmUnitL_bldr.setWhere(itmUnitL_t.itm_cd.eq(bind("itm_cd")));
			itmUnitL_bldr.addWhereWithAnd(itmUnitL_t.itm_sub1.eq(bind("itm_sub1")));
			itmUnitL_bldr.addWhereWithAnd(itmUnitL_t.itm_sub2.eq(bind("itm_sub2")));
			itmUnitL_bldr.addWhereWithAnd(itmUnitL_t.itm_sub3.eq(bind("itm_sub3")));
			dbSelect("MSBCL6050_MAVM_ITM_UNIT_S02", itmUnitL, itmUnitL_bldr, ysL);
			
			MCIndexKey unitIdx = itmUnitL.createIndex(MAVM_ITM_UNIT_R.$itm_cd,
					MAVM_ITM_UNIT_R.$itm_sub1, MAVM_ITM_UNIT_R.$itm_sub2,
					MAVM_ITM_UNIT_R.$itm_sub3, MAVM_ITM_UNIT_R.$unit_cd);
			MCIndexKey ysIdxkey = ysL.createIndex(MST_YIELD_SCHD_R.$yield_schd_no);
			for (MfgActReg_Chk01_DtlYieldR r : bindL) {
				MST_YIELD_SCHD_R ysR = ysL.getFirst(ysIdxkey, r.yield_schd_no());
				MAVM_ITM_UNIT_R itmUnitR = itmUnitL.getFirst(unitIdx, ysR.itm_cd(),
						ysR.itm_sub1(), ysR.itm_sub2(), ysR.itm_sub3(), r.trd_unit_cd());
				if (itmUnitR == null) {
					continue;
				}
				// yaDbLには基準単位実績数が設定済みのため、nullの場合のみ換算する
				if (isNull(r.base_unit_yield_act_qty())) {
					r.base_unit_yield_act_qty(convToBaseUnit(r.trd_unit_yield_act_qty(),
							itmUnitR.conv_base_qty(), itmUnitR.conv_qty(),
							ysR.getNumberNE("dec_place"), ysR.getStringNE("rnd_typ")));
				}
			}
		}
		
		protected void setSprt02RsltAndRemoveL(MCList<MfgActReg_Chk01_DtlInptR> inptL,
				MCList<MfgActReg_Chk01_DtlLossR> lossL,
				MCList<MfgActReg_Chk01_DtlWkR> wkL,
				MCList<MfgReCalc_Sprt02_DtlInptR> inptRsltL,
				MCList<MfgReCalc_Sprt02_DtlWkR> wkRsltL) {
			
			MCList<MfgActReg_Chk01_DtlInptR> newInptL = MCList.create(MfgActReg_Chk01_DtlInptR.class);
			MCList<MfgActReg_Chk01_DtlInptR> tmpL = MCList.create(MfgActReg_Chk01_DtlInptR.class);
			MCIndexKey inptIdxkey = inptRsltL.createIndex(MfgReCalc_Sprt02_DtlInptR.$peg_no);
			MCIndexKey lossIdxkey = lossL.createIndex(MfgActReg_Chk01_DtlLossR.$inpt_peg_no);
			
			Set<MCNumber> errSet = new HashSet<MCNumber>();
			for (MfgActReg_Chk01_DtlInptR inptR : inptL) {
				if (isNull(inptR.act_tm())) {
					errSet.add(inptR.peg_no());
				}
				if (!inptR.bkf_upd_flg()) {
					// 登録対象外
					// ※バックフラッシュ対象外を意思を持って指定しているため、この場合はメッセージを出力しない
					continue;
				}
				MfgReCalc_Sprt02_DtlInptR rsltR = inptRsltL.getFirst(inptIdxkey, inptR.peg_no());
				if (!isNull(rsltR.inpt_act_qty())) {
					MCNumber baseUnitInptQty = MCNumber.ZERO;
					if (inptR.cont_fctr_flg()) {
						inptR.cont_inpt_qty(rsltR.inpt_act_qty());
						baseUnitInptQty = convToBaseUnitFromContFctrUnit(inptR.cont_inpt_qty(),
								nvl(inptR.act_cont_fctr(), inptR.std_cont_fctr()),
								inptR.base_unit_dec_place(),
								inptR.base_unit_conv_rnd_typ());
					}
					else {
						baseUnitInptQty = rsltR.inpt_act_qty();
					}
					// 再計算の前後で投入数量、計上日が変わらない場合は登録対象外
					if (isSame(inptR.base_unit_inpt_qty(), baseUnitInptQty) && isSame(inptR.getDateNE("bef_ac_dt"), rsltR.ac_dt())
							&& isNull(inptR.alt_grp_cd()) && !inptR.abort_flg()) {
					continue;
					}
					inptR.base_unit_inpt_qty(baseUnitInptQty);
				}
				// すでに投入実績が登録済で再計算結果が０となる場合、ステータスを削除にする
				if (!isNull(inptR.base_unit_inpt_qty()) && inptR.base_unit_inpt_qty().isZero()) {
					if (isNull(lossL.getFirst(lossIdxkey, inptR.peg_no()))) {
						inptR.setStatus(MCRow.DELETE);
					}
				}
				// 投入数がnullでも固定ロス行が存在する場合は、固定ロス分だけ実績を登録する
				if (isNull(inptR.base_unit_inpt_qty())) {
					if (!isNull(lossL.getFirst(lossIdxkey, inptR.peg_no()))) {
						if (inptR.cont_fctr_flg()) {
							inptR.cont_inpt_qty(MCNumber.ZERO);
						}
						inptR.base_unit_inpt_qty(MCNumber.ZERO);
					}
					else {
						continue;
					}
				}
				if (isNull(inptR.act_tm())) {
					tmpL.add(inptR);
					continue;
				}
				newInptL.add(inptR);
			}
			
			// ヘッダ単位でのバックフラッシュ件数の設定
			MCMessageList msgList = new MCMessageList();
			MCList<MfgActReg_Chk01_DtlInptR> tgtL = newInptL.subList(r -> !r.isStatusDelete());
			tgtL.addAll(tmpL);
			for (MCList<MfgActReg_Chk01_DtlInptR> gL : tgtL.groupList(MfgActReg_Chk01_DtlInptR.$hdr_peg_no)) {
				MfgActReg_Chk01_HdrR hdrR = _hdrChkCache.getCache(gL.get(0).hdr_peg_no());
				MCNumber tgtCnt = MCNumber.ZERO;
				MCNumber failureCnt = MCNumber.ZERO;
				
				for (MfgActReg_Chk01_DtlInptR gR : gL) {
					String bkfTyp = gR.getStringNE("tmp_bkf_typ");
					tgtCnt = tgtCnt.add(MCNumber.ONE);
					if (errSet.contains(gR.peg_no())) {
						if (MAC_BKF_TYP.isPROPOTIONAL(bkfTyp)) {
							if(!gR.isStatusDelete()) {
								msgList.add(new MCMessage(gR, null,
										MSBCL1110, toDispItm(gR.itm_cd(), gR.itm_sub1(),
												gR.itm_sub2(), gR.itm_sub3()),
										toDispGUIIndex(gR)));
							}
						}
						else {
							// 工程着手日は工程実績登録時に必須項目であるため、ここでのエラーメッセージは工程の終了日が指定されていない場合のみを考慮する
							msgList.add(new MCMessage(gR, null,
									MSBCL1111, toDispItm(gR.itm_cd(), gR.itm_sub1(),
											gR.itm_sub2(), gR.itm_sub3()),
									toDispGUIIndex(gR)));
						}
						failureCnt = failureCnt.add(MCNumber.ONE);
					}
				}
				if (failureCnt.isPositive()) {
					// 投入できなかった実績があるため記録書即時発行はfalseにする
					hdrR.act_immed_prnt_flg(false);
				}
				hdrR.bkf_tgt_cnt(tgtCnt);
				hdrR.bkf_failure_cnt(failureCnt);
				hdrR.bkf_success_cnt(MCNumber.ZERO);
			}
			MCMessagePool.addAll(msgList);
			
			// 工程単位でのバックフラッシュ件数の設定
			for (MCList<MfgActReg_Chk01_DtlInptR> gL : tgtL.groupList(MfgActReg_Chk01_DtlInptR.$oper_peg_no)) {
				MfgActReg_Chk01_DtlOperR operR = _operChkCache.getCache(gL.get(0).oper_peg_no());
				MCNumber tgtCnt = MCNumber.ZERO;
				MCNumber failureCnt = MCNumber.ZERO;

				for (MfgActReg_Chk01_DtlInptR gR : gL) {
					tgtCnt = tgtCnt.add(MCNumber.ONE);
					if (errSet.contains(gR.peg_no())) {
						failureCnt = failureCnt.add(MCNumber.ONE);
					}
				}
				if (failureCnt.isPositive()) {
					operR.bkf_not_ref_flg(true);
				}
				operR.bkf_tgt_cnt(tgtCnt);
				operR.bkf_failure_cnt(failureCnt);
				operR.bkf_success_cnt(MCNumber.ZERO);
			}
			
			inptL.setAll(newInptL);
			
			MCList<MfgActReg_Chk01_DtlWkR> newWkL = MCList.create(MfgActReg_Chk01_DtlWkR.class);
			MCIndexKey wkIdxkey = wkRsltL.createIndex(MfgReCalc_Sprt02_DtlWkR.$peg_no);

			for (MfgActReg_Chk01_DtlWkR wkR : wkL) {
				MfgReCalc_Sprt02_DtlWkR rsltR = wkRsltL.getFirst(wkIdxkey, wkR.peg_no());
				if (!isNull(rsltR.act_cost())) {
					// 再計算の前後で工数、計上日が変わらない場合は登録対象外
					if (isSame(wkR.act_wk_cost(), rsltR.act_cost()) && isSame(wkR.getDateNE("bef_ac_dt"), wkR.ac_dt())) {
						continue;
					}
					wkR.act_wk_cost(rsltR.act_cost());
					newWkL.add(wkR);
				}
			}
			wkL.setAll(newWkL);
		}
		
		// 投入・工数再計算（ヘッダ）
		protected Map_MfgReCalc_Sprt02_HdrR_MfgActReg_Chk01_HdrR<MfgReCalc_Sprt02_HdrR,MfgActReg_Chk01_HdrR> createMap_MfgReCalc_Sprt02_HdrR_MfgActReg_Chk01_HdrR() {
			return new Map_MfgReCalc_Sprt02_HdrR_MfgActReg_Chk01_HdrR<MfgReCalc_Sprt02_HdrR, MfgActReg_Chk01_HdrR>();
		}

		public class Map_MfgReCalc_Sprt02_HdrR_MfgActReg_Chk01_HdrR<D extends MfgReCalc_Sprt02_HdrR, S extends MfgActReg_Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgReCalc_Sprt02_HdrR.$peg_no, MfgActReg_Chk01_HdrR.$peg_no);
				addColumnPathMap(MfgReCalc_Sprt02_HdrR.$mfg_inst_no, MfgActReg_Chk01_HdrR.$mfg_inst_no);
				addColumnPathMap(MfgReCalc_Sprt02_HdrR.$div_seq, MfgActReg_Chk01_HdrR.$div_seq);
				addColumnPathMap(MfgReCalc_Sprt02_HdrR.$arr_purc_auto_reg_flg, MfgActReg_Chk01_HdrR.$arr_purc_auto_reg_flg);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.oper_unit_flg(up0().oper_unit_flg());
			}
		}
		
		// 投入・工数再計算（工程）
		protected Map_MfgReCalc_Sprt02_DtlOperR_MfgActReg_Chk01_DtlOperR<MfgReCalc_Sprt02_DtlOperR,MfgActReg_Chk01_DtlOperR> createMap_MfgReCalc_Sprt02_DtlOperR_MfgActReg_Chk01_DtlOperR() {
			return new Map_MfgReCalc_Sprt02_DtlOperR_MfgActReg_Chk01_DtlOperR<MfgReCalc_Sprt02_DtlOperR, MfgActReg_Chk01_DtlOperR>();
		}

		public class Map_MfgReCalc_Sprt02_DtlOperR_MfgActReg_Chk01_DtlOperR<D extends MfgReCalc_Sprt02_DtlOperR, S extends MfgActReg_Chk01_DtlOperR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgReCalc_Sprt02_DtlOperR.$peg_no, MfgActReg_Chk01_DtlOperR.$peg_no);
				addColumnPathMap(MfgReCalc_Sprt02_DtlOperR.$hdr_peg_no, MfgActReg_Chk01_DtlOperR.$hdr_peg_no);
				addColumnPathMap(MfgReCalc_Sprt02_DtlOperR.$oper_inst_no, MfgActReg_Chk01_DtlOperR.$oper_inst_no);
				addColumnPathMap(MfgReCalc_Sprt02_DtlOperR.$st_act_tm, MfgActReg_Chk01_DtlOperR.$st_act_tm);
				addColumnPathMap(MfgReCalc_Sprt02_DtlOperR.$oper_act_no, MfgActReg_Chk01_DtlOperR.$oper_act_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				MfgActReg_Chk01_HdrR chk01HdrR = _hdrChkCache.getCache(src.hdr_peg_no());
				if (up0().oper_unit_flg()) {
					dest.base_unit_act_qty(convQtyOperToBase(src.oper_unit_act_qty(),
							src.oper_conv_qty(), src.oper_std_qty(),
							chk01HdrR.getNumberNE("tmp_base_unit_dec_place"),
							chk01HdrR.getStringNE("tmp_base_unit_conv_rnd_typ"),
							chk01HdrR.getStringNE("tmp_base_unit_cd"), src.oper_unit_cd()));
				}
				else {
					// ヘッダ単位の場合は着手数量を設定する（getHdrModeOperContainerメソッドで、工程単位実績数に着手数量を換算した値を設定しているため）
					if (src.getBooleanNE("hdr_qty_flg")) {
						dest.base_unit_act_qty(chk01HdrR.base_unit_st_act_qty());
					}
					else {
						dest.base_unit_act_qty(convQtyOperToBase(src.oper_unit_act_qty(),
								src.oper_conv_qty(), src.oper_std_qty(),
								chk01HdrR.getNumberNE("tmp_base_unit_dec_place"),
								chk01HdrR.getStringNE("tmp_base_unit_conv_rnd_typ"),
								chk01HdrR.getStringNE("tmp_base_unit_cd"), src.oper_unit_cd()));
					}
				}
			}
		}
		
		// 投入・工数再計算（出来高）
		protected Map_MfgReCalc_Sprt02_DtlYieldR_MfgActReg_Chk01_DtlYieldR<MfgReCalc_Sprt02_DtlYieldR,MfgActReg_Chk01_DtlYieldR> createMap_MfgReCalc_Sprt02_DtlYieldR_MfgActReg_Chk01_DtlYieldR() {
			return new Map_MfgReCalc_Sprt02_DtlYieldR_MfgActReg_Chk01_DtlYieldR<MfgReCalc_Sprt02_DtlYieldR, MfgActReg_Chk01_DtlYieldR>();
		}

		public class Map_MfgReCalc_Sprt02_DtlYieldR_MfgActReg_Chk01_DtlYieldR<D extends MfgReCalc_Sprt02_DtlYieldR, S extends MfgActReg_Chk01_DtlYieldR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgReCalc_Sprt02_DtlYieldR.$hdr_peg_no, MfgActReg_Chk01_DtlYieldR.$hdr_peg_no);
				addColumnPathMap(MfgReCalc_Sprt02_DtlYieldR.$base_unit_yield_act_qty, MfgActReg_Chk01_DtlYieldR.$base_unit_yield_act_qty);
				addColumnPathMap(MfgReCalc_Sprt02_DtlYieldR.$yield_schd_no, MfgActReg_Chk01_DtlYieldR.$yield_schd_no);
				addColumnPathMap(MfgReCalc_Sprt02_DtlYieldR.$oper_peg_no, MfgActReg_Chk01_DtlYieldR.$oper_peg_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.setNumberNE("peg_no", src.peg_no());
			}
		}
		
		// 投入・工数再計算（投入）
		protected Map_MfgReCalc_Sprt02_DtlInptR_MfgActReg_Chk01_DtlInptR<MfgReCalc_Sprt02_DtlInptR,MfgActReg_Chk01_DtlInptR> createMap_MfgReCalc_Sprt02_DtlInptR_MfgActReg_Chk01_DtlInptR() {
			return new Map_MfgReCalc_Sprt02_DtlInptR_MfgActReg_Chk01_DtlInptR<MfgReCalc_Sprt02_DtlInptR, MfgActReg_Chk01_DtlInptR>();
		}

		public class Map_MfgReCalc_Sprt02_DtlInptR_MfgActReg_Chk01_DtlInptR<D extends MfgReCalc_Sprt02_DtlInptR, S extends MfgActReg_Chk01_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgReCalc_Sprt02_DtlInptR.$hdr_peg_no, MfgActReg_Chk01_DtlInptR.$hdr_peg_no);
				addColumnPathMap(MfgReCalc_Sprt02_DtlInptR.$oper_peg_no, MfgActReg_Chk01_DtlInptR.$oper_peg_no);
				addColumnPathMap(MfgReCalc_Sprt02_DtlInptR.$peg_no, MfgActReg_Chk01_DtlInptR.$peg_no);
				addColumnPathMap(MfgReCalc_Sprt02_DtlInptR.$inpt_schd_no, MfgActReg_Chk01_DtlInptR.$inpt_schd_no);
				addColumnPathMap(MfgReCalc_Sprt02_DtlInptR.$inpt_act_no, MfgActReg_Chk01_DtlInptR.$inpt_act_no);
				addColumnPathMap(MfgReCalc_Sprt02_DtlInptR.$ac_dt, MfgActReg_Chk01_DtlInptR.$ac_dt);
				addColumnPathMap(MfgReCalc_Sprt02_DtlInptR.$first_gr_dt, MfgActReg_Chk01_DtlInptR.$first_gr_dt);
				addColumnPathMap(MfgReCalc_Sprt02_DtlInptR.$lot_seq, MfgActReg_Chk01_DtlInptR.$lot_seq);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.bkf_typ(src.getStringNE("tmp_bkf_typ"));
				dest.recalc_grp(src.getNumberNE("tmp_recalc_grp"));
				dest.recalc_grp_seq(src.getNumberNE("tmp_recalc_grp_seq"));
				dest.setBooleanNE("tmp_cont_fctr_flg", src.cont_fctr_flg());
				
				if (src.cont_fctr_flg()) {
					// 有効成分管理対象の場合は、有効成分数で再計算する
					if (!isNull(src.inpt_act_no())) {
						dest.inpt_act_qty(src.cont_inpt_qty());
					}
					dest.dec_place(src.cont_fctr_dec_place());
				}
				else {
					if (!isNull(src.inpt_act_no())) {
						dest.inpt_act_qty(src.base_unit_inpt_qty());
					}
					dest.dec_place(src.base_unit_dec_place());
				}
			}
		}
		
		// 投入・工数再計算（工数）
		protected Map_MfgReCalc_Sprt02_DtlWkR_MfgActReg_Chk01_DtlWkR<MfgReCalc_Sprt02_DtlWkR,MfgActReg_Chk01_DtlWkR> createMap_MfgReCalc_Sprt02_DtlWkR_MfgActReg_Chk01_DtlWkR() {
			return new Map_MfgReCalc_Sprt02_DtlWkR_MfgActReg_Chk01_DtlWkR<MfgReCalc_Sprt02_DtlWkR, MfgActReg_Chk01_DtlWkR>();
		}

		public class Map_MfgReCalc_Sprt02_DtlWkR_MfgActReg_Chk01_DtlWkR<D extends MfgReCalc_Sprt02_DtlWkR, S extends MfgActReg_Chk01_DtlWkR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgReCalc_Sprt02_DtlWkR.$hdr_peg_no, MfgActReg_Chk01_DtlWkR.$hdr_peg_no);
				addColumnPathMap(MfgReCalc_Sprt02_DtlWkR.$oper_peg_no, MfgActReg_Chk01_DtlWkR.$oper_peg_no);
				addColumnPathMap(MfgReCalc_Sprt02_DtlWkR.$peg_no, MfgActReg_Chk01_DtlWkR.$peg_no);
				addColumnPathMap(MfgReCalc_Sprt02_DtlWkR.$wk_schd_no, MfgActReg_Chk01_DtlWkR.$wk_schd_no);
				addColumnPathMap(MfgReCalc_Sprt02_DtlWkR.$wk_act_no, MfgActReg_Chk01_DtlWkR.$wk_act_no);
				addColumnPathMap(MfgReCalc_Sprt02_DtlWkR.$act_cost, MfgActReg_Chk01_DtlWkR.$act_wk_cost);
			}
		}
		
		/**
		 * ヘッダ単位での更新処理
		 */
		protected void callThisUpd01HdrMode(MCList<MfgActReg_Upd02_Hdr1R> hdrUpL,
				MCList<MfgActReg_Upd02_DtlYieldByProdR> dtlUpL) {
			mapUpContainers(MAR1);
			// コントロールブロックからUpd01のヘッダへ呼出元バッチ処理フラグを渡す
			marUpd01.up0().setBoolean(MfgActReg_Upd01_HdrR.$is_src_batch_flg, up0().is_src_batch_flg());
			marUpd01.exec();
			
			// 製造一覧の下り電文設定
			String[] hdrSrcCols = new String[] {
					MfgActReg_Upd01_HdrR.$mfg_sts_typ,
					MfgActReg_Upd01_HdrR.$mfg_sts_typ_nm,
					MfgActReg_Upd01_HdrR.$mfg_act_no, MfgActReg_Upd01_HdrR.$div_seq,
					MfgActReg_Upd01_HdrR.$bkf_tgt_cnt, MfgActReg_Upd01_HdrR.$bkf_success_cnt,
					MfgActReg_Upd01_HdrR.$bkf_failure_cnt
			};
			String[] hdrDestCols = new String[] {
					MfgActReg_Upd02_Hdr1R.$mfg_sts_typ,
					MfgActReg_Upd02_Hdr1R.$mfg_sts_typ_nm,
					MfgActReg_Upd02_Hdr1R.$mfg_act_no, MfgActReg_Upd02_Hdr1R.$div_seq,
					MfgActReg_Upd02_Hdr1R.$bkf_tgt_cnt, MfgActReg_Upd02_Hdr1R.$bkf_success_cnt,
					MfgActReg_Upd02_Hdr1R.$bkf_failure_cnt
			};
			copyByPegNo(hdrUpL, hdrDestCols, marUpd01.down0(), hdrSrcCols);
			
			// 出来高一覧の下り電文設定
			editYieldByProdDownCmn(dtlUpL, marUpd01.down5(), marUpd01.down6());
		}
		
		protected void editYieldByProdDownCmn(
				MCList<MfgActReg_Upd02_DtlYieldByProdR> dtlUpL,
				MCList<MfgActReg_Upd01_DtlYieldR> yieldDownL,
				MCList<MfgActReg_Upd01_DtlByProdR> byProdDownL) {
			String[] yieldSrcCols = new String[] {
					MfgActReg_Upd01_DtlYieldR.$lot_no,
					MfgActReg_Upd01_DtlYieldR.$sublot_no,
					MfgActReg_Upd01_DtlYieldR.$yield_act_no
			};
			String[] byProdSrcCols = new String[] {
					MfgActReg_Upd01_DtlByProdR.$lot_no,
					MfgActReg_Upd01_DtlByProdR.$sublot_no,
					MfgActReg_Upd01_DtlByProdR.$yield_act_no
			};
			String[] dtlDestCols = new String[] {
					MfgActReg_Upd02_DtlYieldByProdR.$lot_no,
					MfgActReg_Upd02_DtlYieldByProdR.$sublot_no,
					MfgActReg_Upd02_DtlYieldByProdR.$yield_act_no
			};
			
			copyByPegNo(
					dtlUpL.subList(r -> (MAC_YIELD_TYP.isGOOD(r.yield_typ())
							|| MAC_YIELD_TYP.isDFCT(r.yield_typ()))),
					dtlDestCols, yieldDownL, yieldSrcCols);
			copyByPegNo(dtlUpL.subList(r -> MAC_YIELD_TYP.isBYPROD(r.yield_typ())),
					dtlDestCols, byProdDownL, byProdSrcCols);
		}
		
		/**
		 * 工程単位での更新処理
		 */
		protected void callThisUpd01OperMode(MCList<MfgActReg_Upd02_Hdr1R> operUpL,
				MCList<MfgActReg_Upd02_DtlYieldByProdR> dtlUpL) {
			mapUpContainers(MAR1);
			// コントロールブロックからUpd01のヘッダへ呼出元バッチ処理フラグを渡す
			marUpd01.up0().setBoolean(MfgActReg_Upd01_HdrR.$is_src_batch_flg, up0().is_src_batch_flg());
			marUpd01.exec();
			
			// 製造一覧の下り電文設定
			String[] operSrcCols = new String[] {
					MfgActReg_Upd01_DtlOperR.$oper_act_no,
					MfgActReg_Upd01_DtlOperR.$mfg_act_no, MfgActReg_Upd01_DtlOperR.$div_seq,
					MfgActReg_Upd01_DtlOperR.$bkf_tgt_cnt, MfgActReg_Upd01_DtlOperR.$bkf_success_cnt,
					MfgActReg_Upd01_DtlOperR.$bkf_failure_cnt
			};
			String[] operDestCols = new String[] {
					MfgActReg_Upd01_DtlOperR.$oper_act_no,
					MfgActReg_Upd01_DtlOperR.$mfg_act_no, MfgActReg_Upd01_DtlOperR.$div_seq,
					MfgActReg_Upd01_DtlOperR.$bkf_tgt_cnt, MfgActReg_Upd01_DtlOperR.$bkf_success_cnt,
					MfgActReg_Upd01_DtlOperR.$bkf_failure_cnt
			};
			copyByPegNo(operUpL, operDestCols, marUpd01.down1(), operSrcCols);
			
			// 製造状況区分の設定
			for (MfgActReg_Upd02_Hdr1R operUpR : operUpL) {
				if (isNull(operUpR.end_act_tm()) || operUpR.not_cmpl_flg()) {
					operUpR.mfg_sts_typ(MSC_MFG_STS_TYP.STT.value());
				}
				else {
					operUpR.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
				}
				MSC_MFG_STS_TYP.putNameNE(operUpR, MfgActReg_Upd02_Hdr1R.$mfg_sts_typ,
						MfgActReg_Upd02_Hdr1R.$mfg_sts_typ_nm, getUsrLocale());
			}
			
			// 出来高一覧の下り電文設定
			editYieldByProdDownCmn(dtlUpL, marUpd01.down5(), marUpd01.down6());
		}
	}
	
	/**
	 * 分割連番を設定する
	 */
	protected void setDivSeq(MCList<? extends MCRow> list, String mfgInstNoCol, String divSeqCol) {
		// 分割連番を設定
		MCList<MST_MFG_ACT_REM_R> actRemL = MCList.create(MST_MFG_ACT_REM_R.class);
		MST_MFG_ACT_REM_R t = MST_MFG_ACT_REM_R.create("T");
		MCQueryApiBuilder actRemL_bldr = MCQueryApiBuilder.create(t);
		actRemL_bldr.setSelect(t.mfg_inst_no);
		actRemL_bldr.addSelect(t.div_seq);
		actRemL_bldr.setWhere(t.mfg_inst_no.eq(bind(mfgInstNoCol)));
		dbSelect("MSBCL6050_MST_MFG_ACT_REM_S02",
				actRemL, actRemL_bldr, list.groupBy(mfgInstNoCol));
		
		MCIndexKey idxkey = actRemL.createIndex(MST_MFG_ACT_REM_R.$mfg_inst_no);
		Map<String, MCNumber> divSeqMap = new HashMap<String, MCNumber>();
		for (MCRow hdrR : list) {
			String mfgInstNo = hdrR.getString(mfgInstNoCol);
			if (divSeqMap.containsKey(mfgInstNo)) {
				MCNumber divSeq = divSeqMap.get(mfgInstNo).add(MCNumber.ONE);
				hdrR.setNumber(divSeqCol, divSeq);
				divSeqMap.replace(mfgInstNo, divSeq);
			}
			else {
				MCList<MST_MFG_ACT_REM_R> subL = actRemL.subList(idxkey,
						mfgInstNo);
				MCNumber divSeq = ((MCNumber) subL.max(MST_MFG_ACT_REM_R.$div_seq))
						.add(MCNumber.ONE);
				hdrR.setNumber(divSeqCol, divSeq);
				divSeqMap.put(mfgInstNo, divSeq);
			}
		}
	}
	
	/**
	 * MfgActReg_Chk03オペレーション.<p>
	 *
	 * 製造実績の一括登録・訂正前チェックの共通処理<br>
	 */
	public class MfgActReg_Chk03 extends MSBCL_MfgActRegService_MC_A.MfgActReg_Chk03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			// 本チェック処理では、Upd02がChk01を呼び出すまでの間に担保しておきたいチェック処理を行う。
			// ※更新カウンタチェックや投入コンテナを作成するために必要な日付や数量の必須チェック
			// Chk01のタイミングでチェックしても構わない内容であれば、本処理ではなくChk01で行う
			
			if (up0().oper_unit_flg()) {
				setGrpErrFlg();
			}
			
			setDtlErrFlg();
			
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			
			MCList<MfgActReg_Upd02_Hdr1R> updCntrChkL = getUpdCntrChkL();
			
			msgL.addAll(chkUpdCntr(updCntrChkL));
			
			if (!up0().oper_unit_flg()) {
				msgL.addAll(chkHdrModeSub(up2()));
			}
			
			return msgL;
		}
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			super.doServerCheckSub();
			
			for (MfgActReg_Chk03_DtlYieldByProdR r : up3()) {
				if (r.isStatusDelete()) {
					msgL.addAll(check(r, MfgActReg_Chk03_DtlYieldByProdR.$can_ac_dt, new FXUCL_BeforeTodayValidater()));
				}
			}
			
			return msgL;
		}
		
		protected MCList<MfgActReg_Upd02_Hdr1R> getUpdCntrChkL() {
			MCList<MfgActReg_Upd02_Hdr1R> retL = MCList.create(MfgActReg_Upd02_Hdr1R.class);
			
			if (up0().oper_unit_flg()) {
				for (MfgActReg_Chk03_Hdr1R upR : up1()) {
					MfgActReg_Upd02_Hdr1R retR = MfgActReg_Upd02_Hdr1R.create();
					retR.setAttributes(upR);
					retR.mfg_inst_no(upR.mfg_inst_no());
					retR.mfg_act_no(upR.mfg_act_no());
					retR.mfg_inst_upd_cntr(upR.mfg_inst_upd_cntr());
					retR.mfg_inst_pr_upd_cntr(upR.mfg_inst_pr_upd_cntr());
					retR.mfg_act_upd_cntr(upR.mfg_act_upd_cntr());
					
					retL.add(retR);
				}
			}
			else {
				for (MfgActReg_Chk03_Hdr2R upR : up2()) {
					MfgActReg_Upd02_Hdr1R retR = MfgActReg_Upd02_Hdr1R.create();
					retR.setAttributes(upR);
					retR.mfg_inst_no(upR.mfg_inst_no());
					retR.mfg_act_no(upR.mfg_act_no());
					retR.mfg_inst_upd_cntr(upR.mfg_inst_upd_cntr());
					retR.mfg_inst_pr_upd_cntr(upR.mfg_inst_pr_upd_cntr());
					retR.mfg_act_upd_cntr(upR.mfg_act_upd_cntr());
					
					retL.add(retR);
				}
			}
			
			return retL;
		}

		protected MCMessageList chkUpdCntr(MCList<MfgActReg_Upd02_Hdr1R> chkL) {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MfgActReg_Upd02_Hdr1R> miBindL = chkL.groupBy(MfgActReg_Upd02_Hdr1R.$mfg_inst_no);
			MCList<MST_MFG_INST_R> miL = getMfgInst(miBindL);
			MCIndexKey mikey = miL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
			
			MCList<MST_MFG_ACT_REM_R> prL = getMfgInstPr(miBindL);
			MCIndexKey prKey = prL.createIndex(MST_MFG_ACT_REM_R.$mfg_inst_no);

			MCList<MST_MFG_ACT_R> maL = getMfgAct(chkL);
			MCIndexKey makey = maL.createIndex(MST_MFG_ACT_R.$mfg_act_no);
			
			for (MfgActReg_Upd02_Hdr1R r : chkL) {
				MST_MFG_INST_R miR = miL.getFirst(mikey, r.mfg_inst_no());
				if (!isNull(r.mfg_inst_no())) {
					if (up0().upd_cntr_chk_flg()) {
						msgL.addAll(checkUpdCntrNE(r, MfgActReg_Chk01_HdrR.$mfg_inst_upd_cntr, miR));
					}
					else {
						if (isNull(miR)) {
							msgL.addAll(getRecordNotFoundMsg("MS", "MST_MFG_INST"
									, new String[]{MST_MFG_INST_R.$mfg_inst_no}
									, new Comparable[]{r.mfg_inst_no()}, r));
							r.err_flg(true);
						}
					}
					setErrFlg(r, msgL);
				}
				
				MST_MFG_ACT_REM_R prR = prL.getFirst(prKey, r.mfg_inst_no());
				if (!r.err_flg() && !isNull(r.mfg_inst_no())) {
					if (up0().upd_cntr_chk_flg()) {
						msgL.addAll(checkUpdCntrNE(r, MfgActReg_Chk01_HdrR.$mfg_inst_pr_upd_cntr, prR));
					}
					setErrFlg(r, msgL);
					// 製造進捗の存在チェックは行わないで良い（製造指図テーブルの存在チェックで十分なため）
				}

				MST_MFG_ACT_R maR = maL.getFirst(makey, r.mfg_act_no());
				if (!r.err_flg() && !isNull(r.mfg_act_no())) {
					if (up0().upd_cntr_chk_flg()) {
						msgL.addAll(checkUpdCntrNE(r, MfgActReg_Chk01_HdrR.$mfg_act_upd_cntr, maR));
					}
					else {
						if (isNull(maR)) {
							msgL.addAll(getRecordNotFoundMsg("MS", "MST_MFG_ACT"
									, new String[]{MST_MFG_ACT_R.$mfg_act_no}
									, new Comparable[]{r.mfg_act_no()}, r));
							r.err_flg(true);
						}
					}
					setErrFlg(r, msgL);
				}
			}
			return msgL;
		}
		
		/**
		 * 製造指図を取得する
		 * @return　mfgInstL
		 */
		protected MCList<MST_MFG_INST_R> getMfgInst(MCList<MfgActReg_Upd02_Hdr1R> miBindL) {
			MCList<MST_MFG_INST_R> mfgInstL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder mfgInstL_bldr = MCQueryApiBuilder.create(t);
			mfgInstL_bldr.setSelect(t.mfg_inst_no, t.upd_cntr);
			dbSelectKeyForUpdateNoWait("MSBCL6050_MST_MFG_INST_S03", mfgInstL, mfgInstL_bldr, miBindL);

			return mfgInstL;
		}

		/**
		 * 製造指図進捗を取得する
		 * @return　mfgInstL
		 */
		protected MCList<MST_MFG_ACT_REM_R> getMfgInstPr(MCList<MfgActReg_Upd02_Hdr1R> miBindL) {
			// 製造指図進捗=分割連番0の製造実績残
			MCList<MST_MFG_ACT_REM_R> mfgInstPrL = MCList.create(MST_MFG_ACT_REM_R.class);
			MST_MFG_ACT_REM_R t = MST_MFG_ACT_REM_R.create("T");
			MCQueryApiBuilder mfgInstPrL_bldr = MCQueryApiBuilder.create(t);
			mfgInstPrL_bldr.setSelect(t.mfg_inst_no, t.upd_cntr);
			mfgInstPrL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			mfgInstPrL_bldr.addWhereWithAnd(t.div_seq.eq(value(0)));
			dbSelectForUpdateNoWait("MSBCL6050_MST_MFG_ACT_REM_S03", mfgInstPrL, mfgInstPrL_bldr, miBindL);

			return mfgInstPrL;
		}

		/**
		 * 製造実績を取得する
		 * @return　mfgActL
		 */
		protected MCList<MST_MFG_ACT_R> getMfgAct(MCList<MfgActReg_Upd02_Hdr1R> chkL) {
			MCList<MST_MFG_ACT_R> mfgActL = MCList.create(MST_MFG_ACT_R.class);
			MST_MFG_ACT_R t = MST_MFG_ACT_R.create("T");
			MCQueryApiBuilder mfgActL_bldr = MCQueryApiBuilder.create(t);
			mfgActL_bldr.setSelect(t.mfg_act_no, t.upd_cntr);
			dbSelectKeyForUpdateNoWait("MSBCL6050_MST_MFG_ACT_S03", mfgActL, mfgActL_bldr, chkL);
			return mfgActL;
		}

		
		protected MCMessageList chkHdrModeSub(MCList<MfgActReg_Chk03_Hdr2R> up2L) {
			MCMessageList msgL = new MCMessageList();
			for (MfgActReg_Chk03_Hdr2R up2R : up2L) {
				if (MSC_MFG_STS_TYP.isCMPL(up2R.mfg_sts_typ())) {
					msgL.addAll(check(up2R, MfgActReg_Chk03_Hdr1R.$end_act_tm, new FXUCL_RequiredValidater()));
					msgL.addAll(check(up2R, MfgActReg_Chk03_Hdr1R.$end_ac_dt, new FXUCL_RequiredValidater()));
				}
			}
			return msgL;
		}
		
		protected void setGrpErrFlg() {
			String[] grpKeys = new String[] {
					MfgActReg_Chk03_Hdr1R.$mfg_inst_no, MfgActReg_Chk03_Hdr1R.$div_seq
			};
			setGrpErrFlgByKey(up1(), grpKeys, MfgActReg_Chk03_Hdr1R.$err_flg);
		}
		
		protected void setDtlErrFlg() {
			if (up0().oper_unit_flg()) {
				copyErrFlg(up1(), up3(), MfgActReg_Chk03_Hdr1R.$peg_no, MfgActReg_Chk03_DtlYieldByProdR.$hdr_peg_no);
				if (up0().is_src_batch_flg()) {
					// 同一製造指図ＮＯを持つ工程実績レコードをエラー扱いにするため、もう一度呼び出す
					setGrpErrFlg();
				}
			}
			else {
				copyErrFlg(up2(), up3(), MfgActReg_Chk03_Hdr1R.$peg_no, MfgActReg_Chk03_DtlYieldByProdR.$hdr_peg_no);
			}
		}


		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			if (up0().oper_unit_flg()) {
				down0().setAll(up1());
			}
			else {
				down1().setAll(up2());
			}
		}
	}

	/**
	 * MfgActReg_Chk04オペレーション.<p>
	 *
	 * 工数実績の登録・訂正前チェックを行う。<br>
	 */
	public class MfgActReg_Chk04 extends MSBCL_MfgActRegService_MC_A.MfgActReg_Chk04 {
		//----------------------------------
		// Cache
		//----------------------------------
		/** 案件手配紐付情報  */
		protected MCList<MST_WRK_SNO_R> _wrkSnoL = MCList.create(MST_WRK_SNO_R.class);
		/** 案件  */
		protected MCList<MST_WRK_R> _wrkL = MCList.create(MST_WRK_R.class);
		//----------------------------------
		// IndexKey
		//----------------------------------
		/** 案件手配紐付情報 */
		protected MCIndexKey _idxWrkSnoL = null;
		/** 案件*/
		protected MCIndexKey _idxWrkL = null;
		//----------------------------------
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			MCList<MfgActReg_Chk04_RsltR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				callWkActRegUpdChkSrv(notErrL);
			}
			
			setErrToRtnStsTyp();
			
			setDown();
		}
		
		@Override
		protected MCMessageList updCntChkReq() {
			MCMessageList msgL = super.updCntChkReq();
			msgL.addAll(updCntChkReqCmn(up0()));
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			// キャッシュ取得
			createCache();

			//　製造指図のロック、更新カウンタチェック、値の補完
			// ※指図の更新や取り消しと同時進行しないようにするため
			//　また、指図を元に工数実績を登録する際の後勝ち更新を防ぐため
			msgL.addAll(chkMfgInst());
			
			//　製造実績残をロック
			// 工程実績残の存在チェック
			// ※製造実績の更新や取り消しと同時進行しないようにするため）
			msgL.addAll(chkMfgActRem());
			
			// 工数実績残、工程指図を元にした補完
			msgL.addAll(cmplByWkActRem());
			
			// 工数実績のロック、更新カウンタチェック、値の補完
			msgL.addAll(chkWkAct());
			
			// doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
			crrctDataBeforeDoServerChk();
			
			return msgL;
		}
		/**
		 * キャッシュを作成します
		 */
		protected void createCache() {
			// 案件手配紐付情報
			createCacheWrkSno();
			// 案件
			createCacheWrk();
		}

		/**
		 * キャッシュ作成（案件手配紐付情報）
		 */
		protected void createCacheWrkSno () {
			_wrkSnoL = MCList.create(MST_WRK_SNO_R.class);
			MST_WRK_SNO_R t = MST_WRK_SNO_R.create("T");
			MCQueryApiBuilder wrkSnoL_bldr = MCQueryApiBuilder.create(t);
			wrkSnoL_bldr.setWhere(t.sno1.eq(bind("sno1")));
			dbSelect("MSBCL6050_MST_WRK_SNO_S01", _wrkSnoL, wrkSnoL_bldr, up0());
			_idxWrkSnoL = _wrkSnoL.createIndex(MST_WRK_SNO_R.$sno1);
		}

		/**
		 * キャッシュ作成（案件）
		 */
		protected void createCacheWrk () {
			_wrkL = MCList.create(MST_WRK_R.class);
			MST_WRK_R t = MST_WRK_R.create("T");
			MCQueryApiBuilder wrkL_bldr = MCQueryApiBuilder.create(t);
			wrkL_bldr.setWhere(t.wrk_no.eq(bind("wrk_no")));
			dbSelect("MSBCL6050_MST_WRK_S01", _wrkL, wrkL_bldr, _wrkSnoL);
			_idxWrkL = _wrkL.createIndex(MST_WRK_R.$wrk_no);
		}

		/**
		 * 製造指図のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkMfgInst() {
			MCMessageList msgL = new MCMessageList();
			MCList<MfgActReg_Chk04_RsltR> notErrL = getChkList(up0());
			MCList<MfgActReg_Chk04_RsltR> subL = notErrL.subList(MfgActReg_Chk04_RsltR.$inst_wk_act_flg, true);
			if (subL.isEmpty()) {
				return msgL;
			}
			
			MCList<MST_MFG_INST_R> selectL = MCList.create(MST_MFG_INST_R.class);
			MST_MFG_INST_R t = MST_MFG_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			MST_ITM_MFG_INST_R t2 = MST_ITM_MFG_INST_R.create("T2");
			selectL_bldr.setSelect(t.mfg_inst_no, t.itm_mfg_inst_no, t.upd_cntr);
			selectL_bldr.addSelect(t2.itm_cd,
					t2.itm_sub1, t2.itm_sub2, t2.itm_sub3,
					t2.lot_no, t2.sublot_no,
					t2.sno1, t2.sno2, t2.sno3, t2.sno4,
					t2.mfg_loc_cd, t2.mfg_str_ln_cd);
			selectL_bldr.addInnerJoin(t2,
					bracket(t.itm_mfg_inst_no.eq(t2.itm_mfg_inst_no)));

			selectL_bldr.setOrderByAsc(t.mfg_inst_no);
			
			selectL_bldr.addLockTable(t.mfg_inst_no);
			
			MCList<MfgActReg_Chk04_RsltR> bindL = subL.groupBy(MfgActReg_Chk04_RsltR.$mfg_inst_no);
			if (!up1().file_imp_flg()) {
				bindL.sort(MfgActReg_Chk04_RsltR.$mfg_inst_no);
				dbSelectKeyForUpdateNoWait("MSBCL6050_MST_MFG_INST_S04", selectL, selectL_bldr, bindL);
			}
			else {
				dbSelectKey("MSBCL6050_MST_MFG_INST_S05", selectL, selectL_bldr, bindL);
			}
			
			MCIndexKey idxkey = selectL.createIndex(MST_MFG_INST_R.$mfg_inst_no);
			for (MfgActReg_Chk04_RsltR r : subL) {
				MST_MFG_INST_R selectR = selectL.getFirst(idxkey, r.mfg_inst_no());
				if (up1().upd_cntr_chk_flg() && !isNull(r.wk_schd_no())
						&& isNull(r.wk_act_no())) {
					// 製造指図の更新カウンタチェックをするのは工数予定を元にした初回登録時のみ
					// ※行追加時に製造指図ＮＯを手入力した場合は、更新カウンタチェックの対象外
					msgL.addAll(checkUpdCntrNE(r, MfgActReg_Chk04_RsltR.$mfg_inst_upd_cntr, selectR));
				}
				if (!isNull(selectR)) {
					r.itm_mfg_inst_no(selectR.itm_mfg_inst_no());
					r.itm_cd(selectR.getStringNE("itm_cd"));
					r.itm_sub1(selectR.getStringNE("itm_sub1"));
					r.itm_sub2(selectR.getStringNE("itm_sub2"));
					r.itm_sub3(selectR.getStringNE("itm_sub3"));
					r.lot_no(selectR.getStringNE("lot_no"));
					r.sublot_no(selectR.getStringNE("sublot_no"));
					r.sno1(selectR.getStringNE("sno1"));
					r.sno2(selectR.getStringNE("sno2"));
					r.sno3(selectR.getStringNE("sno3"));
					r.sno4(selectR.getStringNE("sno4"));
					r.loc_cd(selectR.getStringNE("mfg_loc_cd"));
					r.str_ln_cd(selectR.getStringNE("mfg_str_ln_cd"));
					if (isNull(r.mfg_inst_upd_cntr())) {
						r.mfg_inst_upd_cntr(selectR.upd_cntr());
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 製造実績残データのロック、値の補完
		 */
		protected MCMessageList chkMfgActRem() {
			MCMessageList msgL = new MCMessageList();
			MCList<MfgActReg_Chk04_RsltR> notErrL = getChkList(up0());
			MCList<MfgActReg_Chk04_RsltR> subL = notErrL.subList(MfgActReg_Chk04_RsltR.$inst_wk_act_flg, true);
			if (subL.isEmpty()) {
				return msgL;
			}

			MCList<MST_MFG_ACT_REM_R> selectL = MCList.create(MST_MFG_ACT_REM_R.class);
			MST_MFG_ACT_REM_R t = MST_MFG_ACT_REM_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			MST_MFG_ACT_R t2 = MST_MFG_ACT_R.create("T2");
			selectL_bldr.setSelect(t.mfg_inst_no, t.div_seq);
			selectL_bldr.addSelect(t2.mfg_act_no);
			selectL_bldr.addInnerJoin(t2, bracket(t.mfg_inst_no.eq(t2.mfg_inst_no)
					.and(t.div_seq.eq(t2.div_seq))));
			selectL_bldr.setOrderByAsc(t.mfg_inst_no, t.div_seq);
			selectL_bldr.addLockTable(t.mfg_inst_no);
			
			MCList<MfgActReg_Chk04_RsltR> bindL = subL.groupBy(MfgActReg_Chk04_RsltR.$mfg_inst_no, MfgActReg_Chk04_RsltR.$div_seq);
			if (!up1().file_imp_flg()) {
				bindL.sort(MfgActReg_Chk04_RsltR.$mfg_inst_no, MfgActReg_Chk04_RsltR.$div_seq);
				dbSelectKeyForUpdate("MSBCL6050_MST_MFG_ACT_REM_S04", selectL, selectL_bldr, bindL);
			}
			else {
				dbSelectKey("MSBCL6050_MST_MFG_ACT_REM_S05", selectL, selectL_bldr, bindL);
			}
			
			MCIndexKey idxkey = selectL.createIndex(MST_MFG_ACT_REM_R.$mfg_inst_no,
					MST_MFG_ACT_REM_R.$div_seq);
			for (MfgActReg_Chk04_RsltR r : subL) {
				MST_MFG_ACT_REM_R selectR = selectL.getFirst(idxkey, r.mfg_inst_no(),r.div_seq());
				if (isNull(selectR)) {
					msgL.addAll(getRecordNotFoundMsg("MS", "MST_MFG_ACT"
							, new String[]{MST_MFG_ACT_R.$mfg_inst_no, MST_MFG_ACT_R.$div_seq}
							, new Comparable[]{r.mfg_inst_no(), r.div_seq()}, r));
				}
				else {
					r.mfg_act_no(selectR.getStringNE("mfg_act_no"));
				}
			}

			return msgL;
		}
		
		/**
		 * 工数実績残、工数予定、工程指図、工程実績、工数実績を元に上り電文データを補完する
		 */
		
		protected MCMessageList cmplByWkActRem() {
			MCMessageList msgL = new MCMessageList();
			MCList<MfgActReg_Chk04_RsltR> notErrL = getChkList(up0());
			MCList<MfgActReg_Chk04_RsltR> subL = MCList.create(MfgActReg_Chk04_RsltR.class);
			for (MfgActReg_Chk04_RsltR r : notErrL) {
				if (!isNull(r.wk_schd_no())) {
					subL.add(r);
				}
				else {
					// 予定に紐付かない場合は、打切できない
					r.abort_flg(false);
				}
			}
			if (subL.isEmpty()) {
				return msgL;
			}
			MCList<MST_WK_ACT_REM_R> selectL = MCList.create(MST_WK_ACT_REM_R.class);
			MST_WK_ACT_REM_R t = MST_WK_ACT_REM_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			MST_OPER_INST_R t2 = MST_OPER_INST_R.create("T2");
			MST_OPER_ACT_R t3 = MST_OPER_ACT_R.create("T3");
			MST_WK_SCHD_R t4 = MST_WK_SCHD_R.create("T4");
			MST_WK_ACT_R t5 = MST_WK_ACT_R.create("T5");
			selectL_bldr.setSelect(t.wk_schd_no, t.div_seq, t.mfg_sts_typ,
					t.oper_inst_no);
			selectL_bldr.addSelect(t2.mfg_inst_no, t2.oper_cd, t3.oper_act_no,
					t4.wk_cost_cd, t5.wk_act_no);
			selectL_bldr.addInnerJoin(t2, bracket(t.oper_inst_no.eq(t2.oper_inst_no)));
			selectL_bldr.addLeftOuterJoin(t3, bracket(
					t.oper_inst_no.eq(t3.oper_inst_no)
					.and(t.div_seq.eq(t3.div_seq))));
			selectL_bldr.addInnerJoin(t4, bracket(t.wk_schd_no.eq(t4.wk_schd_no)));
			selectL_bldr.addLeftOuterJoin(t5, bracket(
					t.wk_schd_no.eq(t5.wk_schd_no)
					.and(t.div_seq.eq(t5.div_seq))));
			// 指図ヘッダ・実績ヘッダ単位でロックするため工数予定の粒度でのロックは不要。
			MCList<MfgActReg_Chk04_RsltR> bindL = subL.groupBy(MfgActReg_Chk04_RsltR.$wk_schd_no, MfgActReg_Chk04_RsltR.$div_seq);
			dbSelectKey("MSBCL6050_MST_WK_ACT_REM_S02", selectL, selectL_bldr, bindL);
			
			MCIndexKey idxkey = selectL.createIndex(MfgActReg_Chk04_RsltR.$wk_schd_no,
					MfgActReg_Chk04_RsltR.$div_seq);
			for (MfgActReg_Chk04_RsltR r : subL) {
				MCList<MST_WK_ACT_REM_R> selectSubL = selectL.subList(idxkey, r.wk_schd_no(), r.div_seq());
				if (selectSubL.isEmpty()) {
					msgL.add(new MCMessage(r, MfgActReg_Chk04_RsltR.$wk_schd_no, MSBCL1104,
							r.wk_schd_no(), r.div_seq(), toDispGUIIndex(r)));
				}
				else {
					MST_WK_ACT_REM_R selectR = selectSubL.get(0);
					if (!isSame(r.mfg_inst_no(), selectR.getStringNE("mfg_inst_no"))) {
						msgL.addAll(getRecordInvalidMsg(MfgActReg_Chk04_RsltR.$mfg_inst_no, selectR.getStringNE("mfg_inst_no"), r));
					}
					else if (isNull(selectR.getStringNE("oper_act_no"))) {
						msgL.add(new MCMessage(r, null, MSBCL1002,
								selectR.oper_inst_no(), r.div_seq(), toDispGUIIndex(r)));
					}
					if (!isNull(r.wk_act_no())) {
						boolean hasAct = false;
						for (MST_WK_ACT_REM_R dbR : selectSubL) {
							if (isSame(r.wk_act_no(), dbR.getStringNE("wk_act_no"))) {
								hasAct = true;
							}
						}
						if (!hasAct) {
							msgL.addAll(getRecordInvalidMsg(MfgActReg_Chk04_RsltR.$wk_act_no, selectR.getStringNE("wk_act_no"), r));
						}
					}
					if (!isNull(r.wk_schd_no())) {
						r.oper_cd(selectR.getStringNE("oper_cd"));
						r.oper_act_no(selectR.getStringNE("oper_act_no"));
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 工数実績を元にしたチェック
		 */
		protected MCMessageList chkWkAct() {
			MCMessageList msgL = new MCMessageList();
			MCList<MfgActReg_Chk04_RsltR> notErrL = getChkList(up0());
			MCList<MfgActReg_Chk04_RsltR> subL = MCList.create(MfgActReg_Chk04_RsltR.class);
			for (MfgActReg_Chk04_RsltR r : notErrL) {
				if (!isNull(r.wk_act_no())) {
					subL.add(r);
				}
			}
			
			if (subL.isEmpty()) {
				return msgL;
			}
			
			MCList<MST_WK_ACT_R> selectL = MCList.create(MST_WK_ACT_R.class);
			MST_WK_ACT_R t = MST_WK_ACT_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.mfg_act_no,
									t.wk_schd_no,
									t.div_seq,
									t.wk_act_no,
									t.ac_dt,
									t.loc_cd,
									t.dpt_cd,
									t.oper_act_no,
									t.oper_cd,
									t.upd_cntr);
			// setAttributesで上書きされるのを防ぐため、外部システムＣＤ、外部工数実績ＮＯを別名で取得
			selectL_bldr.addSelect(t.ext_sys_cd.as("tmp_ext_sys_cd"),
					t.ext_wk_act_no.as("tmp_ext_wk_act_no"));
			selectL_bldr.setOrderByAsc(t.wk_act_no);
			
			MCList<MfgActReg_Chk04_RsltR> bindL = subL.groupBy(MfgActReg_Chk04_RsltR.$wk_act_no);
			if (!up1().file_imp_flg()) {
				bindL.sort(MfgActReg_Chk04_RsltR.$wk_act_no);
				dbSelectKeyForUpdateNoWait("MSBCL6050_MST_WK_ACT_S05", selectL, selectL_bldr, bindL);
			}
			else {
				dbSelectKey("MSBCL6050_MST_WK_ACT_S06", selectL, selectL_bldr, bindL);
			}
			
			MCIndexKey idxkey = selectL.createIndex(MST_WK_ACT_R.$wk_act_no);
			for (MfgActReg_Chk04_RsltR r : subL) {
				MST_WK_ACT_R selectR = selectL.getFirst(idxkey, r.wk_act_no());
				if (up1().upd_cntr_chk_flg()) {
					msgL.addAll(checkUpdCntrNE(r, MfgActReg_Chk04_RsltR.$wk_act_upd_cntr, selectR));
				}
				if (!isNull(selectR)) {
					if (!isSame(r.wk_schd_no(), selectR.wk_schd_no())
							|| !isSame(r.div_seq(), selectR.div_seq())) {
						msgL.addAll(getRecordNotFoundMsg("MS", "MST_WK_ACT"
								, new String[]{MST_WK_ACT_R.$wk_schd_no, MST_WK_ACT_R.$div_seq}
								, new Comparable[]{r.wk_schd_no(), r.div_seq()}, r));
					}
					selectR.setAttributes(r);
					// バッチから実行された場合はDACチェックしない
					if (!up1().is_src_batch_flg()) {
						if (!isNull(r.mfg_act_no())) {
							msgL.addAll(checkWritableLocCdDac(selectR, MST_WK_ACT_R.$loc_cd));
						}
						else {
							msgL.addAll(checkWritableDptCdDac(selectR, MST_WK_ACT_R.$dpt_cd));
						}
					}
					if (!r.mes_flg()) {
						// MES対象外の場合は補完（MES対象の場合は上り電文に設定されているため、補完不要）
						r.ext_sys_cd(selectR.getStringNE("tmp_ext_sys_cd"));
						r.ext_wk_act_no(selectR.getStringNE("tmp_ext_wk_act_no"));
					}
					r.old_ac_dt(selectR.ac_dt());
					
					if(!isNull(selectR.oper_act_no())) {
						r.oper_act_no(selectR.oper_act_no());
						r.oper_cd(selectR.oper_cd());
					}
				}
			}
			return msgL;
		}
		
		/**
		 * doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
		 */
		protected void crrctDataBeforeDoServerChk() {
			for (MfgActReg_Chk04_RsltR r : up0()) {
				if (!r.inst_wk_act_flg()) {
					if (!isNull(r.itm_cd())) {
						if (isNull(r.itm_sub1())) {
							r.itm_sub1(MAC_STR.NULL_VAL.value());
						}
						if (isNull(r.itm_sub2())) {
							r.itm_sub2(MAC_STR.NULL_VAL.value());
						}
						if (isNull(r.itm_sub3())) {
							r.itm_sub3(MAC_STR.NULL_VAL.value());
						}
					}
					if (!isNull(r.loc_cd()) && isNull(r.str_ln_cd())) {
						r.str_ln_cd(MAC_STR.NULL_VAL.value());
					}
				}
				if (MAC_STR.isNULL_VAL(r.lot_no())) {
					r.lot_no(null);
				}
				if (MAC_STR.isNULL_VAL(r.sublot_no())) {
					r.sublot_no(null);
				}

				if (MAC_STR.isNULL_VAL(r.str_ln_cd())) {
					r.str_ln_cd_none_flg(true);
				}

				// 案件の補完
				MST_WRK_SNO_R wrkSnoR = _wrkSnoL.getFirst(_idxWrkSnoL, r.sno1());
				if (!isNull(wrkSnoR)) {
					MST_WRK_R wrkR = _wrkL.getFirst(_idxWrkL, wrkSnoR.wrk_no());
					r.wrk_no(wrkSnoR.wrk_no());
					if (!isNull(wrkR)) {
						r.wrk_nm(wrkR.wrk_nm());
					}
				}
			}
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<MfgActReg_Chk04_RsltR> notErrL = getChkList(up0(), MCRow.Status.CREATE, MCRow.Status.MODIFY);
			crrctDataAfterDoServerChk(notErrL);
			
			for (MfgActReg_Chk04_RsltR r : notErrL) {
				if (!r.inst_wk_act_flg()) {
					// 条件付必須チェック
					msgL.addAll(check(r, MfgActReg_Chk04_RsltR.$dpt_cd, new FXUCL_RequiredValidater()));
					// DACチェック
					// バッチから実行された場合はDACチェックしない
					if (!up1().is_src_batch_flg()) {
						msgL.addAll(checkWritableDptCdDac(r, MfgActReg_Chk04_RsltR.$dpt_cd));
					}
					
					// 品目を指定した場合、場所も必須とする
					if (!isNull(r.itm_cd())) {
						msgL.addAll(check(r, MfgActReg_Chk04_RsltR.$loc_cd, new FXUCL_RequiredValidater()));
					}
				}
				else {
					// DACチェック
					// バッチから実行された場合はDACチェックしない
					if (!up1().is_src_batch_flg()) {
						msgL.addAll(checkWritableLocCdDac(r, MfgActReg_Chk04_RsltR.$loc_cd));
					}
				}
			}
			
			msgL.addAll(chkOperCd(notErrL));
			msgL.addAll(chkActDt(notErrL));
			
			return msgL;
		}
		
		/**
		 * 工程ＣＤの妥当性チェック
		 * @return
		 */
		protected MCMessageList chkOperCd(MCList<MfgActReg_Chk04_RsltR> notErrL) {
			// 製造指図ＮＯを手入力した場合の工程ＣＤチェック
			// ※この場合、工程指図からの補完が行われていないため、製造指図に存在しない工程ＣＤが設定されている可能性がある
			MCMessageList msgL = new MCMessageList();
			MCList<MfgActReg_Chk04_RsltR> subL = MCList.create(MfgActReg_Chk04_RsltR.class);
			for (MfgActReg_Chk04_RsltR r : notErrL) {
				if (isNull(r.wk_schd_no()) && !isNull(r.mfg_inst_no())
						&& !isNull(r.oper_cd()) && isNull(r.oper_act_no())) {
					subL.add(r);
				}
			}
			if (subL.isEmpty()) {
				return msgL;
			}
			// 製造指図ＮＯと工程ＣＤを手入力した場合、工程実績ＮＯを補完する
			// ※工程実績が存在しない場合はエラーとする
			MCList<MST_OPER_ACT_R> selectL = MCList.create(MST_OPER_ACT_R.class);
			MST_OPER_ACT_R t = MST_OPER_ACT_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			MST_OPER_ACT_REM_R t1 = MST_OPER_ACT_REM_R.create("T1");
			MST_OPER_INST_R t2 = MST_OPER_INST_R.create("T2");
			selectL_bldr.setSelect(t.oper_act_no);
			selectL_bldr.addSelect(t1.mfg_inst_no);
			selectL_bldr.addSelect(t1.div_seq);
			selectL_bldr.addSelect(t2.oper_cd);
			selectL_bldr.addInnerJoin(t1, bracket(
					t1.oper_inst_no.eq(t.oper_inst_no)
					.and(t1.div_seq.eq(t.div_seq))));
			selectL_bldr.addInnerJoin(t2, bracket(t2.oper_inst_no.eq(t1.oper_inst_no)));
			selectL_bldr.addWhereWithAnd(t1.mfg_inst_no.eq(bind("mfg_inst_no")));
			selectL_bldr.addWhereWithAnd(t1.div_seq.eq(bind("div_seq")));
			selectL_bldr.addWhereWithAnd(t2.oper_cd.eq(bind("oper_cd")));
			MCList<MfgActReg_Chk04_RsltR> bindL = subL.groupBy(
					MfgActReg_Chk04_RsltR.$mfg_inst_no, MfgActReg_Chk04_RsltR.$div_seq,
					MfgActReg_Chk04_RsltR.$oper_cd);
			selectL_bldr.setOrderByAsc(t.oper_act_no);
			dbSelect("MSBCL6050_MST_OPER_ACT_S04", selectL, selectL_bldr, bindL);

			MCIndexKey idxkey = selectL.createIndex("mfg_inst_no", "div_seq", "oper_cd");
			for (MfgActReg_Chk04_RsltR r : subL) {
				MST_OPER_ACT_R selectR = selectL.getFirst(idxkey, r.mfg_inst_no(), r.div_seq(), r.oper_cd());
				if (isNull(selectR)) {
					msgL.add(new MCMessage(r, null, MSBCL1001, r.mfg_inst_no(), r.div_seq(), r.oper_cd(), toDispGUIIndex(r)));
				}
				else {
					r.oper_act_no(selectR.oper_act_no());
				}
			}
			return msgL;
		}
		
		/**
		 * 着手計上日と計上日の日付前後チェック
		 * @return
		 */
		protected MCMessageList chkActDt(MCList<MfgActReg_Chk04_RsltR> notErrL) {
			MCMessageList msgL = new MCMessageList();
			MCList<MfgActReg_Chk04_RsltR> subL = MCList.create(MfgActReg_Chk04_RsltR.class);
			for (MfgActReg_Chk04_RsltR r : notErrL) {
				if (!isNull(r.mfg_inst_no())) {
					subL.add(r);
				}
			}
			if (subL.isEmpty()) {
				return msgL;
			}
			// 製造指図ＮＯから製造実績．着手計上日を取得し、入力されて計上日と日付前後チェックを行う
			MCList<MST_MFG_ACT_R> selectMfgAct = MCList.create(MST_MFG_ACT_R.class);
			MST_MFG_ACT_R t = MST_MFG_ACT_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.mfg_inst_no, t.div_seq, t.st_ac_dt);
			selectL_bldr.setWhere(t.mfg_inst_no.eq(bind("mfg_inst_no")));
			selectL_bldr.addWhereWithAnd(t.div_seq.eq(bind("div_seq")));
			dbSelect("MSBCL6050_MST_MFG_ACT_SXX", selectMfgAct, selectL_bldr, subL);

			MCIndexKey idxKeyMfgAct = selectMfgAct.createIndex(MST_MFG_ACT_R.$mfg_inst_no,
					MST_MFG_ACT_R.$div_seq);
			for (MfgActReg_Chk04_RsltR r : subL) {
				MST_MFG_ACT_R selectR = selectMfgAct.getFirst(idxKeyMfgAct, r.mfg_inst_no(), r.div_seq());
				if (!isNull(selectR.st_ac_dt())) {
					if (selectR.st_ac_dt().gt(r.ac_dt())) {
						msgL.add(msgNotBefore(r,MfgActReg_Chk04_RsltR.$ac_dt,
								r,MfgActReg_Chk04_RsltR.$st_ac_dt,
								r,MfgActReg_Chk04_RsltR.$ac_dt,true
								));
					}
				}
			}
			return msgL;
		}
		
		/**
		 * doServerChk（リストロジックによるチェックなど）実行後に行うべきデータの補正
		 */
		protected void crrctDataAfterDoServerChk(MCList<MfgActReg_Chk04_RsltR> notErrL) {
			for (MfgActReg_Chk04_RsltR r : notErrL) {
				if (r.wk_cost_calc_ctl_flg() && isNotZeroTm(r.end_tm())) {
					r.act_wk_cost(calcWkCost(r.st_tm(), r.end_tm(), r.ac_dt(), r.brk_pd()));
				}
				if (!r.inst_wk_act_flg()) {
					if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno1_mng_typ())
							|| MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno1_mng_typ())) {
						r.sno1(MAC_STR.NULL_VAL.value());
					}
					if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno2_mng_typ())
							|| MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno2_mng_typ())) {
						r.sno2(MAC_STR.NULL_VAL.value());
					}
					if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno3_mng_typ())
							|| MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno3_mng_typ())) {
						r.sno3(MAC_STR.NULL_VAL.value());
					}
					if (MAC_SNO_MNG_TYP.isNOT_MNG(r.sno4_mng_typ())
							|| MAC_SNO_MNG_TYP.isMNG_NOT_STK(r.sno4_mng_typ())) {
						r.sno4(MAC_STR.NULL_VAL.value());
					}
					
					if (!isNull(r.itm_cd())) {
						// 品目が指定されている場合、手配ＮＯに値が設定されていなければ、NULL文字を補完する
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
					}
					if (!isNull(r.loc_cd()) && !r.str_ln_tgt_flg()) {
						r.str_ln_cd(MAC_STR.NULL_VAL.value());
					}
				}
				if (MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ())) {
					r.lot_no(MAC_STR.NULL_VAL.value());
				}
				if (!isNull(r.lot_no()) && MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())) {
					r.sublot_no(MAC_STR.NULL_VAL.value());
				}
			}
		}
		
		/**
		 * 各種製造実績登録サービスの工数実績チェック処理を実行する
		 */
		protected void callWkActRegUpdChkSrv(MCList<MfgActReg_Chk04_RsltR> notErrL) {
			MSBCL_MfgActTblRegService.MfgActTblReg_Chk05 ope = MSBCL_MfgActTblRegService.crtMfgActTblReg_Chk05();
			addAll(ope.up0(), notErrL, createMap_MfgActTblReg_Chk05_DtlR_MfgActReg_Chk04_RsltR());
			ope.exec();
			
			copyErrFlg(notErrL, ope.down0());
		}
		
		protected Map_MfgActTblReg_Chk05_DtlR_MfgActReg_Chk04_RsltR<MfgActTblReg_Chk05_DtlR,MfgActReg_Chk04_RsltR> createMap_MfgActTblReg_Chk05_DtlR_MfgActReg_Chk04_RsltR() {
			return new Map_MfgActTblReg_Chk05_DtlR_MfgActReg_Chk04_RsltR<MfgActTblReg_Chk05_DtlR, MfgActReg_Chk04_RsltR>();
		}

		public class Map_MfgActTblReg_Chk05_DtlR_MfgActReg_Chk04_RsltR<D extends MfgActTblReg_Chk05_DtlR, S extends MfgActReg_Chk04_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActTblReg_Chk05_DtlR.$data_crud_typ, MfgActReg_Chk04_RsltR.$data_crud_typ);
				addColumnPathMap(MfgActTblReg_Chk05_DtlR.$peg_no, MfgActReg_Chk04_RsltR.$peg_no);
				addColumnPathMap(MfgActTblReg_Chk05_DtlR.$ac_dt, MfgActReg_Chk04_RsltR.$ac_dt);
				addColumnPathMap(MfgActTblReg_Chk05_DtlR.$old_ac_dt, MfgActReg_Chk04_RsltR.$old_ac_dt);
				addColumnPathMap(MfgActTblReg_Chk05_DtlR.$st_tm, MfgActReg_Chk04_RsltR.$st_tm);
				addColumnPathMap(MfgActTblReg_Chk05_DtlR.$end_tm, MfgActReg_Chk04_RsltR.$end_tm);
				addColumnPathMap(MfgActTblReg_Chk05_DtlR.$brk_pd, MfgActReg_Chk04_RsltR.$brk_pd);
				addColumnPathMap(MfgActTblReg_Chk05_DtlR.$act_wk_cost, MfgActReg_Chk04_RsltR.$act_wk_cost);
				addColumnPathMap(MfgActTblReg_Chk05_DtlR.$wk_cost_calc_ctl_flg, MfgActReg_Chk04_RsltR.$wk_cost_calc_ctl_flg);
				addColumnPathMap(MfgActTblReg_Chk05_DtlR.$wk_cost_dec_place, MfgActReg_Chk04_RsltR.$wk_cost_dec_place);
			}
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
	}

	/**
	 * MfgActReg_Chk05オペレーション.<p>
	 *
	 * 工数実績の取消前チェックを行う。<br>
	 */
	public class MfgActReg_Chk05 extends MSBCL_MfgActRegService_MC_A.MfgActReg_Chk05 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			
			MCList<MfgActReg_Chk04_RsltR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				callWkActRegDelChkSrv(notErrL);
			}
			
			setErrToRtnStsTyp();
			
			setDown();
		}
		@Override
		protected MCMessageList updCntChkReq() {
			MCMessageList msgL = super.updCntChkReq();
			msgL.addAll(updCntChkReqCmn(up0()));
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			//　製造実績残をロック
			// ※製造実績の更新や取り消しと同時進行しないようにするため）
			lockMfgActRem();

			// 工数実績のロック、更新カウンタチェック、値の補完チェック
			msgL.addAll(chkWkAct());
			
			return msgL;
		}
		
		/**
		 * 製造実績残データのロック
		 */
		protected void lockMfgActRem() {
			MCList<MfgActReg_Chk04_RsltR> subL = MCList.create(MfgActReg_Chk04_RsltR.class);
			for (MfgActReg_Chk04_RsltR r : up0()) {
				if (!isNull(r.mfg_inst_no())) {
					subL.add(r);
				}
			}
			if (subL.isEmpty()) {
				return;
			}
			
			MCList<MST_MFG_ACT_REM_R> selectL = MCList.create(MST_MFG_ACT_REM_R.class);
			MST_MFG_ACT_REM_R t = MST_MFG_ACT_REM_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.mfg_inst_no, t.div_seq);
			selectL_bldr.setOrderByAsc(t.mfg_inst_no, t.div_seq);
			MCList<MfgActReg_Chk04_RsltR> bindL = subL.groupBy(MfgActReg_Chk04_RsltR.$mfg_inst_no, MfgActReg_Chk04_RsltR.$div_seq);
			bindL.sort(MfgActReg_Chk04_RsltR.$mfg_inst_no, MfgActReg_Chk04_RsltR.$div_seq);
			dbSelectKeyForUpdate("MSBCL6050_MST_MFG_ACT_REM_S06", selectL, selectL_bldr, bindL);
		}
		
		/**
		 * 工数実績を元にしたチェック
		 */
		protected MCMessageList chkWkAct() {
			MCMessageList msgL = new MCMessageList();
			MCList<MST_WK_ACT_R> selectL = MCList.create(MST_WK_ACT_R.class);
			MST_WK_ACT_R t = MST_WK_ACT_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			MST_MFG_ACT_R t2 = MST_MFG_ACT_R.create("T2");
			selectL_bldr.setSelect(t.wk_act_no, t.div_seq, t.loc_cd, t.dpt_cd,
					t.wk_schd_no, t.mfg_act_no, t.ac_dt, t.upd_cntr);
			selectL_bldr.addSelect(t2.mfg_inst_no);
			selectL_bldr.addLeftOuterJoin(t2, bracket(t.mfg_act_no.eq(t2.mfg_act_no)));
			selectL_bldr.addLockTable(t.wk_act_no);
			selectL_bldr.setOrderByAsc(t.wk_act_no);
			dbSelectKeyForUpdateNoWait("MSBCL6050_MST_WK_ACT_S07",
					selectL, selectL_bldr, up0().groupBy(MfgActReg_Chk04_RsltR.$wk_act_no));
			
			MCIndexKey idxkey = selectL.createIndex(MST_WK_ACT_R.$wk_act_no);
			for (MfgActReg_Chk04_RsltR r : up0()) {
				MST_WK_ACT_R selectR = selectL.getFirst(idxkey, r.wk_act_no());
				if(up1().upd_cntr_chk_flg()) {
					msgL.addAll(checkUpdCntrNE(r, MfgActReg_Chk04_RsltR.$wk_act_upd_cntr, selectR));
				}
				if (!isNull(selectR)) {
					r.old_ac_dt(selectR.ac_dt());
					r.wk_schd_no(selectR.wk_schd_no());
					if (!isSame(r.mfg_inst_no(), selectR.getStringNE("mfg_inst_no"))) {
						msgL.addAll(getRecordInvalidMsg(MfgActReg_Chk04_RsltR.$mfg_inst_no, selectR.getStringNE("mfg_inst_no"), r));
					}
					else if (!isSame(r.div_seq(), selectR.div_seq())) {
						msgL.addAll(getRecordInvalidMsg(MfgActReg_Chk04_RsltR.$div_seq, selectR.div_seq(), r));
					}
					selectR.setAttributes(r);
					// バッチから実行された場合はDACチェックしない
					if (!up1().is_src_batch_flg()) {
						if (!isNull(selectR.mfg_act_no())) {
							msgL.addAll(checkWritableLocCdDac(selectR, MST_WK_ACT_R.$loc_cd));
						}
						else {
							msgL.addAll(checkWritableDptCdDac(selectR, MST_WK_ACT_R.$dpt_cd));
						}
					}
				}
			}
			return msgL;
		}
		
		/**
		 * 各種製造実績登録サービスの工数実績チェック処理を実行する
		 */
		protected void callWkActRegDelChkSrv(MCList<MfgActReg_Chk04_RsltR> notErrL) {
			MSBCL_MfgActTblRegService.MfgActTblReg_Chk05 ope = MSBCL_MfgActTblRegService.crtMfgActTblReg_Chk05();
			addAll(ope.up0(), notErrL, createMap_MfgActTblReg_Chk05_DtlR_MfgActReg_Chk04_RsltR());
			ope.exec();
			
			copyErrFlg(notErrL, ope.down0());
		}
		
		protected Map_MfgActTblReg_Chk05_DtlR_MfgActReg_Chk04_RsltR<MfgActTblReg_Chk05_DtlR,MfgActReg_Chk04_RsltR> createMap_MfgActTblReg_Chk05_DtlR_MfgActReg_Chk04_RsltR() {
			return new Map_MfgActTblReg_Chk05_DtlR_MfgActReg_Chk04_RsltR<MfgActTblReg_Chk05_DtlR, MfgActReg_Chk04_RsltR>();
		}

		public class Map_MfgActTblReg_Chk05_DtlR_MfgActReg_Chk04_RsltR<D extends MfgActTblReg_Chk05_DtlR, S extends MfgActReg_Chk04_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActTblReg_Chk05_DtlR.$data_crud_typ, MfgActReg_Chk04_RsltR.$data_crud_typ);
				addColumnPathMap(MfgActTblReg_Chk05_DtlR.$peg_no, MfgActReg_Chk04_RsltR.$peg_no);
				addColumnPathMap(MfgActTblReg_Chk05_DtlR.$old_ac_dt, MfgActReg_Chk04_RsltR.$old_ac_dt);

			}
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().addAll(up0());
		}
	}

	/**
	 * 更新カウンタチェック前の必須チェック（Chk01,Chk02共通処理）
	 * @param up
	 * @return
	 */
	protected MCMessageList updCntChkReqCmn(MCList<MfgActReg_Chk04_RsltR> up) {
		MCMessageList msgL = new MCMessageList();
		for (MfgActReg_Chk04_RsltR r : up) {
			if (!isNull(r.mfg_inst_no())) {
				r.inst_wk_act_flg(true);
				msgL.addAll(check(r, MfgActReg_Chk04_RsltR.$div_seq, new FXUCL_RequiredValidater()));
			}
			else {
				r.div_seq(null);
			}
			if (!isNull(r.wk_act_no())) {
				msgL.addAll(check(r, MfgActReg_Chk04_RsltR.$wk_act_no, new FXUCL_RequiredValidater()));
			}
		}
		return msgL;
	}

	/**
	 * MfgActReg_Upd03オペレーション.<p>
	 *
	 * 工数実績の登録・訂正処理<br>
	 */
	public class MfgActReg_Upd03 extends MSBCL_MfgActRegService_MC_A.MfgActReg_Upd03 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0(), up1().not_commit_flg());
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
			MCList<MfgActReg_Chk04_RsltR> notErrL = up0().subList(MfgActReg_Chk04_RsltR.$err_flg, false);
			if (!isNull(notErrL)) {
				// 工数実績ＮＯの発番
				setWkActNo(notErrL);
				
				// 更新サービスの実行
				callWkActRegUpdSrv(notErrL);
				
				// 実績残の更新
				callMfgInstActComSrv(notErrL);
				
				//　製造実績残を空更新（製造実績画面での後勝ち更新を防ぐため）
				updMfgActRemTs(notErrL);

			}
		}
		
		/**
		 * 新規追加行に工数実績ＮＯを設定する
		 */
		protected void setWkActNo(MCList<MfgActReg_Chk04_RsltR> notErrL) {
			for (MfgActReg_Chk04_RsltR r : notErrL) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					r.wk_act_no(getStrSeq(MSC_NUM_SYS_TYP.WKACT));
				}
			}
		}
		
		/**
		 * 各種製造実績登録サービスの工数実績更新処理を実行する
		 */
		protected void callWkActRegUpdSrv(MCList<MfgActReg_Chk04_RsltR> notErrL) {
			MSBCL_MfgActTblRegService.MfgActTblReg_Upd05 ope = MSBCL_MfgActTblRegService.crtMfgActTblReg_Upd05();
			addAll(ope.up0(), notErrL, createMap_MfgActTblReg_Upd05_DtlR_MfgActReg_Chk04_RsltR());
			ope.exec();
			// 更新サービスの下り電文の設定（工数実績ＮＯ）
			String[] destCols = new String[] {MfgActReg_Chk04_RsltR.$oper_act_no, MfgActReg_Chk04_RsltR.$act_wk_cost};
			String[] srcCols = new String[] {MfgActTblReg_Upd05_DtlR.$oper_act_no, MfgActTblReg_Upd05_DtlR.$wk_cost};
			copyByPegNo(notErrL, destCols, ope.down0(), srcCols);
		}
		
		protected Map_MfgActTblReg_Upd05_DtlR_MfgActReg_Chk04_RsltR<MfgActTblReg_Upd05_DtlR,MfgActReg_Chk04_RsltR> createMap_MfgActTblReg_Upd05_DtlR_MfgActReg_Chk04_RsltR() {
			return new Map_MfgActTblReg_Upd05_DtlR_MfgActReg_Chk04_RsltR<MfgActTblReg_Upd05_DtlR, MfgActReg_Chk04_RsltR>();
		}

		public class Map_MfgActTblReg_Upd05_DtlR_MfgActReg_Chk04_RsltR<D extends MfgActTblReg_Upd05_DtlR, S extends MfgActReg_Chk04_RsltR> extends MCRowMapper<D,S>{

			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$peg_no, MfgActReg_Chk04_RsltR.$peg_no);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$data_crud_typ, MfgActReg_Chk04_RsltR.$data_crud_typ);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$wk_act_no, MfgActReg_Chk04_RsltR.$wk_act_no);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$mfg_act_no, MfgActReg_Chk04_RsltR.$mfg_act_no);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$itm_mfg_inst_no, MfgActReg_Chk04_RsltR.$itm_mfg_inst_no);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$oper_act_no, MfgActReg_Chk04_RsltR.$oper_act_no);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$wk_schd_no, MfgActReg_Chk04_RsltR.$wk_schd_no);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$div_seq, MfgActReg_Chk04_RsltR.$div_seq);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$wk_cost_cd, MfgActReg_Chk04_RsltR.$wk_cost_cd);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$wk_cost, MfgActReg_Chk04_RsltR.$act_wk_cost);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$st_tm, MfgActReg_Chk04_RsltR.$st_tm);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$end_tm, MfgActReg_Chk04_RsltR.$end_tm);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$brk_pd, MfgActReg_Chk04_RsltR.$brk_pd);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$ac_dt, MfgActReg_Chk04_RsltR.$ac_dt);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$wk_rsn_cd, MfgActReg_Chk04_RsltR.$wk_rsn_cd);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$wk_cost_calc_ctl_flg, MfgActReg_Chk04_RsltR.$wk_cost_calc_ctl_flg);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$wk_day_cd, MfgActReg_Chk04_RsltR.$wk_day_cd);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$dpt_cd, MfgActReg_Chk04_RsltR.$dpt_cd);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$loc_cd, MfgActReg_Chk04_RsltR.$loc_cd);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$str_ln_cd, MfgActReg_Chk04_RsltR.$str_ln_cd);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$wk_usr_dpt_cd, MfgActReg_Chk04_RsltR.$wk_usr_dpt_cd);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$wk_usr_cd, MfgActReg_Chk04_RsltR.$wk_usr_cd);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$fclty, MfgActReg_Chk04_RsltR.$fclty);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$oper_cd, MfgActReg_Chk04_RsltR.$oper_cd);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$sno1, MfgActReg_Chk04_RsltR.$sno1);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$sno2, MfgActReg_Chk04_RsltR.$sno2);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$sno3, MfgActReg_Chk04_RsltR.$sno3);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$sno4, MfgActReg_Chk04_RsltR.$sno4);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$itm_cd, MfgActReg_Chk04_RsltR.$itm_cd);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$itm_sub1, MfgActReg_Chk04_RsltR.$itm_sub1);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$itm_sub2, MfgActReg_Chk04_RsltR.$itm_sub2);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$itm_sub3, MfgActReg_Chk04_RsltR.$itm_sub3);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$lot_no, MfgActReg_Chk04_RsltR.$lot_no);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$sublot_no, MfgActReg_Chk04_RsltR.$sublot_no);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$dpt_wg_cd, MfgActReg_Chk04_RsltR.$dpt_wg_cd);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$loc_wg_cd, MfgActReg_Chk04_RsltR.$loc_wg_cd);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$intr_rmrks, MfgActReg_Chk04_RsltR.$act_intr_rmrks);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$sub_char1, MfgActReg_Chk04_RsltR.$act_sub_char1);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$sub_char2, MfgActReg_Chk04_RsltR.$act_sub_char2);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$sub_char3, MfgActReg_Chk04_RsltR.$act_sub_char3);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$mes_flg, MfgActReg_Chk04_RsltR.$mes_flg);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$ext_sys_cd, MfgActReg_Chk04_RsltR.$ext_sys_cd);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$ext_wk_act_no, MfgActReg_Chk04_RsltR.$ext_wk_act_no);
			}
		}

		/**
		 * 製造指図・実績共通処理サービスの実績残更新処理を実行する
		 */
		protected void callMfgInstActComSrv(MCList<MfgActReg_Chk04_RsltR> notErrL) {
			// 対象リスト（工数予定ＮＯが設定されているレコード）の抽出
			MCList<MfgActReg_Chk04_RsltR> dtlWkL = notErrL.subList(r -> !isNull(r.wk_schd_no()));
			// 抽出した対象リストの製造指図ＮＯ、分割連番をグループ化
			MCList<MfgActReg_Chk04_RsltR> hdrL = dtlWkL.groupBy(MfgActReg_Chk04_RsltR.$mfg_inst_no, MfgActReg_Chk04_RsltR.$div_seq); 

			MSBCL_MfgInstActComService.MfgInstActCom_Upd08 ope = MSBCL_MfgInstActComService.crtMfgInstActCom_Upd08();
			ope.up0().is_src_wk_act_reg_flg(true);
			addAll(ope.up1(), hdrL, createMap_MfgInstActCom_Upd08_HdrR_MfgActReg_Chk04_RsltR());
			addAll(ope.up5(), dtlWkL, createMap_MfgInstActCom_Upd08_DtlWkR_MfgActReg_Chk04_RsltR());
			ope.exec();
		}
		
		protected Map_MfgInstActCom_Upd08_HdrR_MfgActReg_Chk04_RsltR<MfgInstActCom_Upd08_HdrR,MfgActReg_Chk04_RsltR> createMap_MfgInstActCom_Upd08_HdrR_MfgActReg_Chk04_RsltR() {
			return new Map_MfgInstActCom_Upd08_HdrR_MfgActReg_Chk04_RsltR<MfgInstActCom_Upd08_HdrR, MfgActReg_Chk04_RsltR>();
		}

		public class Map_MfgInstActCom_Upd08_HdrR_MfgActReg_Chk04_RsltR<D extends MfgInstActCom_Upd08_HdrR, S extends MfgActReg_Chk04_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Upd08_HdrR.$mfg_inst_no, MfgActReg_Chk04_RsltR.$mfg_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_HdrR.$div_seq, MfgActReg_Chk04_RsltR.$div_seq);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				// ヘッダの追加、削除はないためデータ更新区分はUPD
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
		}

		protected Map_MfgInstActCom_Upd08_DtlWkR_MfgActReg_Chk04_RsltR<MfgInstActCom_Upd08_DtlWkR,MfgActReg_Chk04_RsltR> createMap_MfgInstActCom_Upd08_DtlWkR_MfgActReg_Chk04_RsltR() {
			return new Map_MfgInstActCom_Upd08_DtlWkR_MfgActReg_Chk04_RsltR<MfgInstActCom_Upd08_DtlWkR, MfgActReg_Chk04_RsltR>();
		}

		public class Map_MfgInstActCom_Upd08_DtlWkR_MfgActReg_Chk04_RsltR<D extends MfgInstActCom_Upd08_DtlWkR, S extends MfgActReg_Chk04_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Upd08_DtlWkR.$wk_act_no, MfgActReg_Chk04_RsltR.$wk_act_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlWkR.$wk_schd_no, MfgActReg_Chk04_RsltR.$wk_schd_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlWkR.$div_seq, MfgActReg_Chk04_RsltR.$div_seq);
				addColumnPathMap(MfgInstActCom_Upd08_DtlWkR.$mfg_inst_no, MfgActReg_Chk04_RsltR.$mfg_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlWkR.$itm_mfg_inst_no, MfgActReg_Chk04_RsltR.$itm_mfg_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlWkR.$oper_inst_no, MfgActReg_Chk04_RsltR.$oper_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlWkR.$act_wk_cost, MfgActReg_Chk04_RsltR.$act_wk_cost);
				addColumnPathMap(MfgInstActCom_Upd08_DtlWkR.$abort_flg, MfgActReg_Chk04_RsltR.$abort_flg);
				addColumnPathMap(MfgInstActCom_Upd08_DtlWkR.$data_crud_typ, MfgActReg_Chk04_RsltR.$data_crud_typ);
			}
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
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<MfgActReg_Chk04_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<MfgActReg_Chk04_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<MfgActReg_Chk04_RsltR> up0L = ((MCList<MfgActReg_Chk04_RsltR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
	}

	/**
	 * MfgActReg_Del02オペレーション.<p>
	 *
	 * 工数実績の取消処理<br>
	 */
	public class MfgActReg_Del02 extends MSBCL_MfgActRegService_MC_A.MfgActReg_Del02 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0(), up1().not_commit_flg());
			}
			catch (Exception e){
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}
		
		@Override
		protected void doIt() {
			MCList<MfgActReg_Chk04_RsltR> notErrL = up0().subList(MfgActReg_Chk04_RsltR.$err_flg, false);
			if (!isNull(notErrL)) {
				callWkActDelSrv(notErrL);
				
				// 実績残の更新
				callMfgInstActComSrv(notErrL);
				
				//　製造実績残を空更新（製造実績画面での後勝ち更新を防ぐため）
				updMfgActRemTs(notErrL);
			}
		}
		
		/**
		 * 各種製造実績登録サービスの工数実績更新処理を実行する
		 */
		protected void callWkActDelSrv(MCList<MfgActReg_Chk04_RsltR> notErrL) {
			MSBCL_MfgActTblRegService.MfgActTblReg_Upd05 ope = MSBCL_MfgActTblRegService.crtMfgActTblReg_Upd05();
			addAll(ope.up0(), notErrL, createMap_MfgActTblReg_Upd05_DtlR_MfgActReg_Chk04_RsltR());
			ope.exec();
		}
		
		protected Map_MfgActTblReg_Upd05_DtlR_MfgActReg_Chk04_RsltR<MfgActTblReg_Upd05_DtlR,MfgActReg_Chk04_RsltR> createMap_MfgActTblReg_Upd05_DtlR_MfgActReg_Chk04_RsltR() {
			return new Map_MfgActTblReg_Upd05_DtlR_MfgActReg_Chk04_RsltR<MfgActTblReg_Upd05_DtlR, MfgActReg_Chk04_RsltR>();
		}

		public class Map_MfgActTblReg_Upd05_DtlR_MfgActReg_Chk04_RsltR<D extends MfgActTblReg_Upd05_DtlR, S extends MfgActReg_Chk04_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$data_crud_typ, MfgActReg_Chk04_RsltR.$data_crud_typ);
				addColumnPathMap(MfgActTblReg_Upd05_DtlR.$wk_act_no, MfgActReg_Chk04_RsltR.$wk_act_no);
			}
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<MfgActReg_Chk04_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<MfgActReg_Chk04_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<MfgActReg_Chk04_RsltR> up0L = ((MCList<MfgActReg_Chk04_RsltR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
		
		/**
		 * 製造指図・実績共通処理サービスの実績残更新処理を実行する
		 */
		protected void callMfgInstActComSrv(MCList<MfgActReg_Chk04_RsltR> notErrL) {
			// 対象リスト（工数予定ＮＯが設定されているレコード）の抽出
			MCList<MfgActReg_Chk04_RsltR> dtlWkL = notErrL.subList(r -> !isNull(r.wk_schd_no()));
			// 抽出した対象リストの製造指図ＮＯ、分割連番をグループ化
			MCList<MfgActReg_Chk04_RsltR> hdrL = dtlWkL.groupBy(MfgActReg_Chk04_RsltR.$mfg_inst_no, MfgActReg_Chk04_RsltR.$div_seq); 

			MSBCL_MfgInstActComService.MfgInstActCom_Upd08 ope = MSBCL_MfgInstActComService.crtMfgInstActCom_Upd08();
			ope.up0().is_src_wk_act_reg_flg(true);
			addAll(ope.up1(), hdrL, createMap_MfgInstActCom_Upd08_HdrR_MfgActReg_Chk04_RsltR());
			addAll(ope.up5(), dtlWkL, createMap_MfgInstActCom_Upd08_DtlWkR_MfgActReg_Chk04_RsltR());
			ope.exec();
		}
		
		protected Map_MfgInstActCom_Upd08_HdrR_MfgActReg_Chk04_RsltR<MfgInstActCom_Upd08_HdrR,MfgActReg_Chk04_RsltR> createMap_MfgInstActCom_Upd08_HdrR_MfgActReg_Chk04_RsltR() {
			return new Map_MfgInstActCom_Upd08_HdrR_MfgActReg_Chk04_RsltR<MfgInstActCom_Upd08_HdrR, MfgActReg_Chk04_RsltR>();
		}

		public class Map_MfgInstActCom_Upd08_HdrR_MfgActReg_Chk04_RsltR<D extends MfgInstActCom_Upd08_HdrR, S extends MfgActReg_Chk04_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Upd08_HdrR.$mfg_inst_no, MfgActReg_Chk04_RsltR.$mfg_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_HdrR.$div_seq, MfgActReg_Chk04_RsltR.$div_seq);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				// ヘッダの追加、削除はないためデータ更新区分はUPD
				dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			}
		}

		protected Map_MfgInstActCom_Upd08_DtlWkR_MfgActReg_Chk04_RsltR<MfgInstActCom_Upd08_DtlWkR,MfgActReg_Chk04_RsltR> createMap_MfgInstActCom_Upd08_DtlWkR_MfgActReg_Chk04_RsltR() {
			return new Map_MfgInstActCom_Upd08_DtlWkR_MfgActReg_Chk04_RsltR<MfgInstActCom_Upd08_DtlWkR, MfgActReg_Chk04_RsltR>();
		}

		public class Map_MfgInstActCom_Upd08_DtlWkR_MfgActReg_Chk04_RsltR<D extends MfgInstActCom_Upd08_DtlWkR, S extends MfgActReg_Chk04_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MfgInstActCom_Upd08_DtlWkR.$wk_act_no, MfgActReg_Chk04_RsltR.$wk_act_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlWkR.$wk_schd_no, MfgActReg_Chk04_RsltR.$wk_schd_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlWkR.$div_seq, MfgActReg_Chk04_RsltR.$div_seq);
				addColumnPathMap(MfgInstActCom_Upd08_DtlWkR.$mfg_inst_no, MfgActReg_Chk04_RsltR.$mfg_inst_no);
				addColumnPathMap(MfgInstActCom_Upd08_DtlWkR.$data_crud_typ, MfgActReg_Chk04_RsltR.$data_crud_typ);
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	
	protected boolean isNotZeroTm(MCDate d) {
		if (isNull(d)) {
			return false;
		}
		return true;
	}

	protected MCNumber calcWkCost(MCDate stTm, MCDate endTm, MCDate acDt, MCNumber brkPd) {
		if (isNull(stTm)) {
			stTm = acDt.startTimeOfDay();
		}
		MCNumber wkCost = MCNumber.ZERO;
		if (stTm.gt(endTm)) {
			wkCost = MCNumber.valueOf(endTm.addDay(1).diffMinute(stTm));
		}
		else {
			wkCost = MCNumber.valueOf(endTm.diffMinute(stTm));
		}

		if (!isNull(brkPd)) {
			wkCost = wkCost.subtract(brkPd);
		}
		return wkCost;
	}
	/**
	 * 製造指図ＮＯが同一の上り電文行が、同じMCListに格納されるように分割する
	 * @param list クライアントから渡された上り電文
	 * @param max １スレッドあたりの最大件数
	 * @return
	 */
	protected List<MCList<MfgActReg_Chk04_RsltR>> splitUp(MCList<MfgActReg_Chk04_RsltR> list, int max) {
		List<MCList<MfgActReg_Chk04_RsltR>> ret = new ArrayList<>();
		MCList<MfgActReg_Chk04_RsltR>[] grpL = list.groupList(MfgActReg_Chk04_RsltR.$mfg_inst_no);
		MCList<MfgActReg_Chk04_RsltR> tmp = MCList.create(MfgActReg_Chk04_RsltR.class);
		for (MCList<MfgActReg_Chk04_RsltR> grp : grpL) {
			// 分割条件がnullの行は「１スレッドあたりの最大件数」に従って1件1件追加する
			if (isNull(grp.get(0).mfg_inst_no())) {
				for (MfgActReg_Chk04_RsltR r :grp) {
					if (tmp.size() >= max) {
						ret.add(tmp);
						tmp = MCList.create(MfgActReg_Chk04_RsltR.class);
					}
					tmp.add(r);
				}
			}
			// 分割条件がnullでない行はグループごとに追加する
			else {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(MfgActReg_Chk04_RsltR.class);
				}
				tmp.addAll(grp);
			}
		}
		if (!tmp.isEmpty()) {
			ret.add(tmp);
		}
		return ret;
	}

	/**
	 * 製造実績残テーブルの空更新
	 * @param up
	 */
	protected void updMfgActRemTs(MCList<MfgActReg_Chk04_RsltR> up) {
		MCList<MST_MFG_ACT_REM_R> dbcL = MCList.create(MST_MFG_ACT_REM_R.class);
		for (MfgActReg_Chk04_RsltR r : up) {
			MST_MFG_ACT_REM_R dbcR = MST_MFG_ACT_REM_R.create();
			if (!isNull(r.mfg_inst_no()) && !isNull(r.div_seq())) {
				dbcR.mfg_inst_no(r.mfg_inst_no());
				dbcR.div_seq(r.div_seq());
				dbcL.add(dbcR);
			}
		}
		if (!dbcL.isEmpty()) {
			dbTsUpdateKey("MSBCL6050_MST_MFG_ACT_REM_U01", dbcL,
					MCQueryApiBuilder.create(MST_MFG_ACT_REM_R.create("T")).getBaseDbc());
		}
	}
	
	protected void handleSuccess(MCList<MfgActReg_Chk04_RsltR> l, boolean notCommitFlg) {
		if (!notCommitFlg) {
			dbTran().commit();
		}
		for (MfgActReg_Chk04_RsltR r : l) {
			if (!r.err_flg()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
			}
		}
	}
	
	protected void handleEx(Exception e,
			MCList<MfgActReg_Chk04_RsltR> l) {
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
		for (MfgActReg_Chk04_RsltR r : l) {
			r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
		}
	}
	/**
	 * MfgActReg_Upd04オペレーション.<p>
	 *
	 * 製造実績受信ＩＦで自動作成された工程実績に紐付くすべての実績が完了になった場合、工程実績を完了にする。<br>
	 */
	public class MfgActReg_Upd04 extends MSBCL_MfgActRegService_MC_A.MfgActReg_Upd04 {

		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			callThisUpd02();
			setDown();
		}
		
		protected void callThisUpd02() {
			MSBCL_MfgActRegService.MfgActReg_Upd02 o = MSBCL_MfgActRegService.crtMfgActReg_Upd02();
			o.up0().oper_unit_flg(true);
			o.up0().not_bkf_upd_flg(true);
			o.up0().not_wk_cost_upd_calc_flg(up0().not_wk_cost_upd_calc_flg());
			o.up0().not_io_act_srv_exec_flg(true);
			o.up0().is_oper_act_cmpl_batch_flg(true);
			o.up0().is_src_batch_flg(up0().is_src_batch_flg());
			o.up0().not_commit_flg(up0().not_commit_flg());
			o.up0().upd_cntr_chk_flg(up0().upd_cntr_chk_flg());
			o.up1().addAll(getHdr1List());
			o.up1().setStatus(MCRow.Status.MODIFY);
			o.exec();

			String[] destCols = {MfgActReg_Upd04_DtlOperR.$rtn_sts_typ};
			String[] srcCols = {MfgActReg_Upd02_Hdr1R.$rtn_sts_typ};
			copyByPegNo(up1(), destCols, o.down0(), srcCols);
		}
		
		protected MCList<MfgActReg_Upd02_Hdr1R> getHdr1List() {
			MCList<MfgActReg_Upd02_Hdr1R> retL = MCList.create(MfgActReg_Upd02_Hdr1R.class);
			
			// 上り電文の工程実績ＮＯからヘッダ、工程の情報を取得
			MST_OPER_ACT_REM_R s1t1 = MST_OPER_ACT_REM_R.create("T1");
			MST_MFG_ACT_REM_R s1t2 = MST_MFG_ACT_REM_R.create("T2");
			MST_MFG_ACT_R s1t3 = MST_MFG_ACT_R.create("T3");
			MSVT_MFG_INST_PR_R s1t4 = MSVT_MFG_INST_PR_R.create("T4");
			MCList<MST_OPER_ACT_R> operL = MCList.create(MST_OPER_ACT_R.class);
			MST_OPER_ACT_R operL_t = MST_OPER_ACT_R.create("T");
			MCQueryApiBuilder operL_bldr = MCQueryApiBuilder.create(operL_t);
			operL_bldr.setSelect(operL_t.oper_inst_no);
			operL_bldr.addSelect(operL_t.div_seq);
			operL_bldr.addSelect(operL_t.oper_act_no);
			operL_bldr.addSelect(operL_t.mfg_act_no);
			operL_bldr.addSelect(operL_t.st_act_tm);
			operL_bldr.addSelect(operL_t.oper_unit_qty);
			operL_bldr.addSelect(operL_t.intr_rmrks);
			operL_bldr.addSelect(operL_t.act_rpt_rmrks);
			operL_bldr.addSelect(operL_t.sub_char1);
			operL_bldr.addSelect(operL_t.sub_char2);
			operL_bldr.addSelect(operL_t.sub_char3);
			operL_bldr.addSelect(operL_t.oper_yield);
			operL_bldr.addSelect(operL_t.mes_flg);
			operL_bldr.addSelect(operL_t.ext_sys_cd);
			operL_bldr.addSelect(operL_t.ext_oper_act_no);
			operL_bldr.addSelect(operL_t.if_auto_reg_flg);
			operL_bldr.addSelect(operL_t.wk_cost_calc_ctl_flg);
			operL_bldr.addSelect(s1t1.mfg_inst_no);
			operL_bldr.addSelect(s1t2.base_unit_mfg_qty);
			operL_bldr.addSelect(s1t3.act_usr_cd);
			operL_bldr.addSelect(s1t3.act_dpt_cd);
			operL_bldr.addSelect(s1t3.act_rpt_rmrks.as("mfg_act_rpt_rmrks"));
			operL_bldr.addSelect(s1t3.intr_rmrks.as("mfg_act_intr_rmrks"));
			operL_bldr.addSelect(s1t3.sub_char1.as("mfg_act_sub_char1"));
			operL_bldr.addSelect(s1t3.sub_char2.as("mfg_act_sub_char2"));
			operL_bldr.addSelect(s1t3.sub_char3.as("mfg_act_sub_char3"));
			operL_bldr.addSelect(s1t3.itm_yield);
			operL.addBooleanColumn("rem_abort_flg");
			operL_bldr.addSelect(
					bracket(cases().when(s1t4.base_unit_mfg_abort_qty.gt(value(0)))
							.then(value(true)).otherwise(value(false)))
									.as("rem_abort_flg"));
			operL_bldr.addInnerJoin(s1t1, bracket(operL_t.oper_inst_no.eq(s1t1.oper_inst_no)
					.and(operL_t.div_seq.eq(s1t1.div_seq))));
			operL_bldr.addInnerJoin(s1t2, bracket(s1t1.mfg_inst_no.eq(s1t2.mfg_inst_no)
					.and(s1t1.div_seq.eq(s1t2.div_seq))));
			operL_bldr.addInnerJoin(s1t3,
					bracket(operL_t.mfg_act_no.eq(s1t3.mfg_act_no)));
			operL_bldr.addInnerJoin(s1t4, bracket(s1t1.mfg_inst_no.eq(s1t4.mfg_inst_no)));
			operL_bldr.setWhere(operL_t.oper_act_no.eq(bind("oper_act_no")));
			operL_bldr.addWhereWithAnd(operL_t.if_auto_reg_flg.eq(value(true)));
			operL_bldr.addWhereWithAnd(
					s1t1.mfg_sts_typ.eq(value(MSC_MFG_STS_TYP.STT.value())));

			dbSelect("MSBCL6050_MST_OPER_ACT_S05", operL, operL_bldr, up1());
			MCIndexKey operIdx = operL.createIndex(MST_OPER_ACT_R.$oper_act_no);
			
			// 抽出した工程指図ＮＯ、分割連番に紐付く実績残と実績の抽出
			MCList<MST_OPER_ACT_R> bindL = operL.groupBy(MST_OPER_ACT_R.$oper_inst_no, MST_OPER_ACT_R.$div_seq);
			MCList<MST_YIELD_ACT_REM_R> yieldL = MCList.create(MST_YIELD_ACT_REM_R.class);
			MST_YIELD_ACT_REM_R yieldL_t = MST_YIELD_ACT_REM_R.create("T");
			MCQueryApiBuilder yieldL_bldr = MCQueryApiBuilder.create(yieldL_t);
			MST_YIELD_SCHD_R s2t2 = MST_YIELD_SCHD_R.create("T2");
			yieldL_bldr.setSelect(yieldL_t.oper_inst_no);
			yieldL_bldr.addSelect(yieldL_t.div_seq);
			yieldL_bldr.addSelect(yieldL_t.mfg_sts_typ);
			yieldL_bldr.addInnerJoin(s2t2,
					bracket(yieldL_t.yield_schd_no.eq(s2t2.yield_schd_no)));
			yieldL_bldr.setWhere(yieldL_t.oper_inst_no.eq(bind("oper_inst_no"))
					.and(yieldL_t.div_seq.eq(bind("div_seq"))));
			yieldL_bldr.addWhereWithAnd(s2t2.can_flg.eq(value(false)));
			dbSelect("MSBCL6050_MST_YIELD_ACT_REM_S02", yieldL, yieldL_bldr, bindL);
			MCIndexKey yieldIdx = yieldL.createIndex(MST_YIELD_ACT_REM_R.$oper_inst_no, MST_YIELD_ACT_REM_R.$div_seq);
			
			MCList<MST_YIELD_ACT_R> yieldActL = MCList.create(MST_YIELD_ACT_R.class);
			MST_YIELD_ACT_R yieldActL_t = MST_YIELD_ACT_R.create("T");
			MCQueryApiBuilder yieldActL_bldr = MCQueryApiBuilder.create(yieldActL_t);
			yieldActL_bldr.setSelect(yieldActL_t.act_tm);
			yieldActL_bldr.addSelect(yieldActL_t.oper_act_no);
			yieldActL_bldr.setWhere(yieldActL_t.oper_act_no.eq(bind("oper_act_no")));
			dbSelect("MSBCL6050_MST_YIELD_ACT_S04", yieldActL, yieldActL_bldr, up1());
			MCIndexKey yieldActIdx = yieldActL.createIndex(MST_YIELD_ACT_R.$oper_act_no);
			
			MST_INPT_SCHD_R s3t2 = MST_INPT_SCHD_R.create("T2");
			MCList<MST_INPT_ACT_REM_R> inptL = MCList.create(MST_INPT_ACT_REM_R.class);
			MST_INPT_ACT_REM_R inptL_t = MST_INPT_ACT_REM_R.create("T");
			MCQueryApiBuilder inptL_bldr = MCQueryApiBuilder.create(inptL_t);
			inptL_bldr.setSelect(inptL_t.oper_inst_no);
			inptL_bldr.addSelect(inptL_t.div_seq);
			inptL_bldr.addSelect(inptL_t.mfg_sts_typ);
			inptL_bldr.addInnerJoin(s3t2,
					bracket(inptL_t.inpt_schd_no.eq(s3t2.inpt_schd_no)));
			inptL_bldr.setWhere(inptL_t.oper_inst_no.eq(bind("oper_inst_no"))
					.and(inptL_t.div_seq.eq(bind("div_seq"))));
			inptL_bldr.addWhereWithAnd(s3t2.can_flg.eq(value(false)));
			dbSelect("MSBCL6050_MST_INPT_ACT_REM_S02", inptL, inptL_bldr, bindL);
			MCIndexKey inptIdx = inptL.createIndex(MST_INPT_ACT_REM_R.$oper_inst_no, MST_INPT_ACT_REM_R.$div_seq);
			
			MCList<MST_INPT_ACT_R> inptActL = MCList.create(MST_INPT_ACT_R.class);
			MST_INPT_ACT_R inptActL_t = MST_INPT_ACT_R.create("T");
			MCQueryApiBuilder inptActL_bldr = MCQueryApiBuilder.create(inptActL_t);
			inptActL_bldr.setSelect(inptActL_t.act_tm);
			inptActL_bldr.addSelect(inptActL_t.oper_act_no);
			inptActL_bldr.setWhere(inptActL_t.oper_act_no.eq(bind("oper_act_no")));
			dbSelect("MSBCL6050_MST_INPT_ACT_S05", inptActL, inptActL_bldr, up1());
			MCIndexKey inptActIdx = inptActL.createIndex(MST_INPT_ACT_R.$oper_act_no);
			
			MST_WK_SCHD_R s4t2 = MST_WK_SCHD_R.create("T2");
			MCList<MST_WK_ACT_REM_R> wkL = MCList.create(MST_WK_ACT_REM_R.class);
			MST_WK_ACT_REM_R wkL_t = MST_WK_ACT_REM_R.create("T");
			MCQueryApiBuilder wkL_bldr = MCQueryApiBuilder.create(wkL_t);
			wkL.addBooleanColumn("wk_cost_calc_flg");
			wkL_bldr.setSelect(wkL_t.oper_inst_no);
			wkL_bldr.addSelect(wkL_t.div_seq);
			wkL_bldr.addSelect(wkL_t.mfg_sts_typ);
			wkL_bldr.addSelect(wkL_t.mfg_sts_typ);
			wkL_bldr.addSelect(s4t2.wk_cost_calc_flg);
			wkL_bldr.addInnerJoin(s4t2, bracket(wkL_t.wk_schd_no.eq(s4t2.wk_schd_no)));
			wkL_bldr.setWhere(wkL_t.oper_inst_no.eq(bind("oper_inst_no"))
					.and(wkL_t.div_seq.eq(bind("div_seq"))));
			wkL_bldr.addWhereWithAnd(s4t2.can_flg.eq(value(false)));
			dbSelect("MSBCL6050_MST_WK_ACT_REM_S03", wkL, wkL_bldr, bindL);
			MCIndexKey wkIdx = wkL.createIndex(MST_WK_ACT_REM_R.$oper_inst_no, MST_WK_ACT_REM_R.$div_seq);
			
			MCList<MST_WK_ACT_R> wkActL = MCList.create(MST_WK_ACT_R.class);
			MST_WK_ACT_R wkActL_t = MST_WK_ACT_R.create("T");
			MCQueryApiBuilder wkActL_bldr = MCQueryApiBuilder.create(wkActL_t);
			wkActL_bldr.setSelect(nvl(nvl(wkActL_t.end_tm, wkActL_t.st_tm ), wkActL_t.ac_dt).as("act_tm"));
			wkActL_bldr.addSelect(wkActL_t.oper_act_no);
			wkActL_bldr.setWhere(wkActL_t.oper_act_no.eq(bind("oper_act_no")));
			dbSelect("MSBCL6050_MST_WK_ACT_S06", wkActL, wkActL_bldr, up1());
			MCIndexKey wkActIdx = wkActL.createIndex(MST_WK_ACT_R.$oper_act_no);
			
			// 上り電文の設定
			for (MfgActReg_Upd04_DtlOperR upR : up1()) {
				MST_OPER_ACT_R operR = operL.getFirst(operIdx, upR.oper_act_no());
				if (isNull(operR)) {
					// 取り消した工程実績ＮＯを受け取った場合、工程実績が存在しない。このときは完了処理が不要のため、処理をせずに終了
					upR.rtn_sts_typ(MAC_RTN_STS_TYP.NOT_EXE.value());
					continue;
				}

				// 工程に紐付く実績に完了以外のものが存在する場合、完了処理をせずに終了
				MCList<MST_YIELD_ACT_REM_R> yieldSubL = yieldL
						.subList(yieldIdx, operR.oper_inst_no(), operR.div_seq());
				if (!yieldSubL.isEmpty() && !MSC_MFG_STS_TYP.isCMPL(
						(String) yieldSubL.min(MST_YIELD_ACT_REM_R.$mfg_sts_typ))) {
					upR.rtn_sts_typ(MAC_RTN_STS_TYP.NOT_EXE.value());
					continue;
				}
				MCList<MST_INPT_ACT_REM_R> inptSubL = inptL
						.subList(inptIdx, operR.oper_inst_no(), operR.div_seq());
				if (!inptSubL.isEmpty() && !MSC_MFG_STS_TYP
						.isCMPL((String) inptSubL.min(MST_INPT_ACT_REM_R.$mfg_sts_typ))) {
					upR.rtn_sts_typ(MAC_RTN_STS_TYP.NOT_EXE.value());
					continue;
				}
				MCList<MST_WK_ACT_REM_R> wkSubL = wkL
						.subList(wkIdx, operR.oper_inst_no(), operR.div_seq());
				if (!wkSubL.isEmpty() && !MSC_MFG_STS_TYP.isCMPL(
						(String) wkSubL.min(MST_WK_ACT_REM_R.$mfg_sts_typ))) {
					if (up0().not_commit_flg() || !operR.wk_cost_calc_ctl_flg()
							|| !isNull(wkSubL.getFirst("wk_cost_calc_flg", false))) {
						upR.rtn_sts_typ(MAC_RTN_STS_TYP.NOT_EXE.value());
						continue;
					}
				}
				
				// 実績日時の最大値を取得し、工程実績の終了実績日時に設定
				MCList<MST_YIELD_ACT_R> yieldActSubL = yieldActL
						.subList(yieldActIdx, upR.oper_act_no());
				MCList<MST_INPT_ACT_R> inptActSubL = inptActL
						.subList(inptActIdx, upR.oper_act_no());
				MCList<MST_WK_ACT_R> wkActSubL = wkActL
						.subList(wkActIdx, upR.oper_act_no());
				MCDate end_act_tm = null;
				if (!yieldActSubL.isEmpty()) {
					end_act_tm = (MCDate) yieldActSubL.max("act_tm");
				}
				if (!inptActSubL.isEmpty()) {
					MCDate act_tm = (MCDate) inptActSubL.max("act_tm");
					if (isNull(end_act_tm)) {
						end_act_tm = act_tm;
					}
					else if (!isNull(act_tm) && act_tm.gt(end_act_tm)) {
						end_act_tm = act_tm;
					}
				}
				if (!wkActSubL.isEmpty()) {
					MCDate act_tm = (MCDate) wkActSubL.max("act_tm");
					if (isNull(end_act_tm)) {
						end_act_tm = act_tm;
					}
					else if (!isNull(act_tm) && act_tm.gt(end_act_tm)) {
						end_act_tm = act_tm;
					}
				}
				operR.end_act_tm(nvl(end_act_tm, operR.st_act_tm()));
				
				MfgActReg_Upd02_Hdr1R hdr1R = MfgActReg_Upd02_Hdr1R.create();
				copy(hdr1R, operR, createMap_MfgActReg_Upd02_Hdr1R_MST_OPER_ACT_R());
				hdr1R.peg_no(upR.peg_no());
				retL.add(hdr1R);
			}
			
			return retL;
		}
		
		protected void setDown() {
			down0().addAll(up1());
		}
	}

	protected Map_MfgActReg_Upd02_Hdr1R_MST_OPER_ACT_R<MfgActReg_Upd02_Hdr1R,MST_OPER_ACT_R> createMap_MfgActReg_Upd02_Hdr1R_MST_OPER_ACT_R() {
		return new Map_MfgActReg_Upd02_Hdr1R_MST_OPER_ACT_R<MfgActReg_Upd02_Hdr1R, MST_OPER_ACT_R>();
	}

	public class Map_MfgActReg_Upd02_Hdr1R_MST_OPER_ACT_R<D extends MfgActReg_Upd02_Hdr1R, S extends MST_OPER_ACT_R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MfgActReg_Upd02_Hdr1R.$st_act_tm, MST_OPER_ACT_R.$st_act_tm);
			addColumnPathMap(MfgActReg_Upd02_Hdr1R.$end_act_tm, MST_OPER_ACT_R.$end_act_tm);
			addColumnPathMap(MfgActReg_Upd02_Hdr1R.$oper_unit_act_qty, MST_OPER_ACT_R.$oper_unit_qty);
			addColumnPathMap(MfgActReg_Upd02_Hdr1R.$oper_act_intr_rmrks, MST_OPER_ACT_R.$intr_rmrks);
			addColumnPathMap(MfgActReg_Upd02_Hdr1R.$oper_act_rpt_rmrks, MST_OPER_ACT_R.$act_rpt_rmrks);
			addColumnPathMap(MfgActReg_Upd02_Hdr1R.$oper_act_sub_char1, MST_OPER_ACT_R.$sub_char1);
			addColumnPathMap(MfgActReg_Upd02_Hdr1R.$oper_act_sub_char2, MST_OPER_ACT_R.$sub_char2);
			addColumnPathMap(MfgActReg_Upd02_Hdr1R.$oper_act_sub_char3, MST_OPER_ACT_R.$sub_char3);
			addColumnPathMap(MfgActReg_Upd02_Hdr1R.$oper_yield, MST_OPER_ACT_R.$oper_yield);
			addColumnPathMap(MfgActReg_Upd02_Hdr1R.$oper_inst_no, MST_OPER_ACT_R.$oper_inst_no);
			addColumnPathMap(MfgActReg_Upd02_Hdr1R.$oper_act_no, MST_OPER_ACT_R.$oper_act_no);
			addColumnPathMap(MfgActReg_Upd02_Hdr1R.$div_seq, MST_OPER_ACT_R.$div_seq);
			addColumnPathMap(MfgActReg_Upd02_Hdr1R.$mfg_act_no, MST_OPER_ACT_R.$mfg_act_no);
			addColumnPathMap(MfgActReg_Upd02_Hdr1R.$mes_flg, MST_OPER_ACT_R.$mes_flg);
			addColumnPathMap(MfgActReg_Upd02_Hdr1R.$ext_sys_cd, MST_OPER_ACT_R.$ext_sys_cd);
			addColumnPathMap(MfgActReg_Upd02_Hdr1R.$ext_oper_act_no, MST_OPER_ACT_R.$ext_oper_act_no);
			addColumnPathMap(MfgActReg_Upd02_Hdr1R.$if_auto_reg_flg, MST_OPER_ACT_R.$if_auto_reg_flg);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.mfg_sts_typ(MSC_MFG_STS_TYP.CMPL.value());
			dest.st_ac_dt(getAcDt(src.st_act_tm()));
			dest.end_ac_dt(getAcDt(src.end_act_tm()));
			dest.base_unit_st_act_qty(src.getNumberNE("base_unit_mfg_qty"));
			dest.rem_abort_flg(src.getBooleanNE("rem_abort_flg"));
			dest.act_usr_cd(src.getStringNE("act_usr_cd"));
			dest.act_dpt_cd(src.getStringNE("act_dpt_cd"));
			dest.mfg_act_rpt_rmrks(src.getStringNE("mfg_act_rpt_rmrks"));
			dest.mfg_act_intr_rmrks(src.getStringNE("mfg_act_intr_rmrks"));
			dest.mfg_act_sub_char1(src.getStringNE("mfg_act_sub_char1"));
			dest.mfg_act_sub_char2(src.getStringNE("mfg_act_sub_char2"));
			dest.mfg_act_sub_char3(src.getStringNE("mfg_act_sub_char3"));
			dest.itm_yield(src.getNumberNE("itm_yield"));
			dest.mfg_inst_no(src.getStringNE("mfg_inst_no"));
			dest.not_cmpl_flg(false);
		}
	}

	protected Map_Cl_Chk03_CndR_MfgActReg_Upd01_DtlInptR<Cl_Chk03_CndR,MfgActReg_Upd01_DtlInptR> createMap_Cl_Chk03_CndR_MfgActReg_Upd01_DtlInptR() {
		return new Map_Cl_Chk03_CndR_MfgActReg_Upd01_DtlInptR<Cl_Chk03_CndR, MfgActReg_Upd01_DtlInptR>();
	}

	public class Map_Cl_Chk03_CndR_MfgActReg_Upd01_DtlInptR<D extends Cl_Chk03_CndR, S extends MfgActReg_Upd01_DtlInptR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Cl_Chk03_CndR.$peg_no, MfgActReg_Upd01_DtlInptR.$peg_no);
			addColumnPathMap(Cl_Chk03_CndR.$ac_dt, MfgActReg_Upd01_DtlInptR.$ac_dt);
			addColumnPathMap(Cl_Chk03_CndR.$loc_cd, MfgActReg_Upd01_DtlInptR.$inpt_loc_cd);
			addColumnPathMap(Cl_Chk03_CndR.$itm_cd, MfgActReg_Upd01_DtlInptR.$itm_cd);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub1, MfgActReg_Upd01_DtlInptR.$itm_sub1);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub2, MfgActReg_Upd01_DtlInptR.$itm_sub2);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub3, MfgActReg_Upd01_DtlInptR.$itm_sub3);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.stk_cls_chk_flg(true);
			dest.io_lmt_skip_flg(false);
		}
	}

	//FMCB CUSTOM END
}