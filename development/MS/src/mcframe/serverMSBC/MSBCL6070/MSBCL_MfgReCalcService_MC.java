package mcframe.serverMSBC.MSBCL6070;

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
import mcframe.commonFXUC.FXUCC0030.FXUCC_Divide;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import java.util.*;
import static mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil.*;
import mcframe.commonCore.meta.*;
import mcframe.serverCore.cache.MCJoinerList;
import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_MfgReCalcService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_MfgReCalcService_MC extends MSBCL_MfgReCalcService_MC_A{
	//FMCB CUSTOM START

	/**
	 * MfgReCalc_Sprt02オペレーション.<p>
	 *
	 * 工程単位実績数または出来高実績数から、投入・工数の数量を再計算します。<br>
	 */
	public class MfgReCalc_Sprt02 extends MSBCL_MfgReCalcService_MC_A.MfgReCalc_Sprt02 {

		protected FXUCL_Cache<MfgReCalc_Sprt02_HdrR> _hdrCache;

		protected FXUCL_Cache<MfgReCalc_Sprt02_DtlOperR> _operCache;
		
		protected FXUCL_Cache<MCList<MfgReCalc_Sprt02_DtlInptR>> _inptPropCache; // 比例計算をする投入コンテナのキャッシュ（予定数投入の投入コンテナは格納されない）
		
		protected FXUCL_Cache<MCList<MfgReCalc_Sprt02_DtlWkR>> _wkCache;
		
		protected final java.math.RoundingMode RND_MODE = MAC_RND_TYP.RNDUP.toMC();
		
		protected static final int DEC_PLACE = 8; 
		
		protected MCNumber _maxRqstValue;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// ・同一工程指図ＮＯに紐付く投入予定、工数予定を全行上らせなければならない（正しく計算ができない）
			// ・工数は出来高が存在する製造指図の場合は出来高実績を元に、存在しない場合は工程単位実績数を元に計算する。
			// 本仕様を実現するために、出来高実績が未登録であっても出来高コンテナを上らせなければならない
			
			preProc();
			
			editUp();
			
			if (!up3().isEmpty()) {
				reCalcInpt();
			}
			
			if (!up4().isEmpty()) {
				reCalcWk();
			}
			
			setDown();
		}
		
		protected void preProc() {
			_hdrCache = new FXUCL_Cache<MfgReCalc_Sprt02_HdrR>();
			_hdrCache.setFixMaxCacheSize(-1);
			
			_operCache = new FXUCL_Cache<MfgReCalc_Sprt02_DtlOperR>();
			_operCache.setFixMaxCacheSize(-1);
			
			_inptPropCache = new FXUCL_Cache<MCList<MfgReCalc_Sprt02_DtlInptR>>();
			_inptPropCache.setFixMaxCacheSize(-1);
			
			_wkCache = new FXUCL_Cache<MCList<MfgReCalc_Sprt02_DtlWkR>>();
			_wkCache.setFixMaxCacheSize(-1);
			
			for (MfgReCalc_Sprt02_HdrR r : up0()) {
				_hdrCache.putCache(new MCNumber[]{r.peg_no()}, r);
			}
			
			for (MfgReCalc_Sprt02_DtlOperR r : up1()) {
				MfgReCalc_Sprt02_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
				r.mfg_inst_no(hdrR.mfg_inst_no());
				r.div_seq(hdrR.div_seq());
				_operCache.putCache(new MCNumber[]{r.peg_no()}, r);
			}
			
			for (MfgReCalc_Sprt02_DtlInptR r : up3()) {
				MfgReCalc_Sprt02_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
				r.div_seq(hdrR.div_seq());
			}
			
			// 投入実績残から投入残数量を取得する
			MCList<MST_INPT_ACT_REM_R> inptActRemL = MCList.create(MST_INPT_ACT_REM_R.class);
			MST_INPT_ACT_REM_R t1 = MST_INPT_ACT_REM_R.create("T1");
			MCQueryApiBuilder inptActRem_bldr = MCQueryApiBuilder.create(t1);
			dbSelectKey("MSBCL6070_MST_INPT_ACT_REM_S02", inptActRemL, inptActRem_bldr, up3());
			MCIndexKey inptActRemKey = inptActRemL.createIndex(MST_INPT_ACT_REM_R.$inpt_schd_no, MST_INPT_ACT_REM_R.$div_seq);
			
			for (MfgReCalc_Sprt02_DtlInptR r : up3()) {
				MST_INPT_ACT_REM_R inptActRemR = inptActRemL.getFirst(inptActRemKey, r.inpt_schd_no(), r.div_seq());
				if (!isNull(inptActRemR)) {
					r.setNumberNE("base_unit_inpt_rem_qty", inptActRemR.base_unit_inpt_rem_qty());
					r.setNumberNE("cont_inpt_rem_qty", inptActRemR.cont_inpt_rem_qty());
				}
			}
			
			// 投入実績から基準単位投入数量、有効成分（投入数量）を取得する
			MCList<MST_INPT_ACT_R> inptActL = MCList.create(MST_INPT_ACT_R.class);
			MST_INPT_ACT_R inptAct = MST_INPT_ACT_R.create("inptAct");
			MCQueryApiBuilder inptAct_bldr = MCQueryApiBuilder.create(inptAct);
			dbSelectKey("MSBCL6070_MST_INPT_ACT_S01", inptActL, inptAct_bldr, up3());
			MCIndexKey inptActKey = inptActL.createIndex(MST_INPT_ACT_R.$inpt_act_no);
			
			up3().addNumberColumn("base_unit_inpt_qty");
			up3().addNumberColumn("cont_qty");
			
			for (MfgReCalc_Sprt02_DtlInptR r : up3()) {
				MST_INPT_ACT_R inptActR = inptActL.getFirst(inptActKey, r.inpt_act_no());
				if (!isNull(inptActR)) {
					r.setNumberNE("base_unit_inpt_qty", inptActR.base_unit_inpt_qty());
					r.setNumberNE("cont_qty", inptActR.cont_qty());
				}
			}
			
			for (MCList<MfgReCalc_Sprt02_DtlInptR> gL : up3().groupList(MfgReCalc_Sprt02_DtlInptR.$oper_peg_no)) {
				MfgReCalc_Sprt02_DtlOperR operR = _operCache.getCache(gL.get(0).oper_peg_no());
				MCList<MfgReCalc_Sprt02_DtlInptR> cacheL = MCList.create(MfgReCalc_Sprt02_DtlInptR.class);
				for (MfgReCalc_Sprt02_DtlInptR r : gL) {
					r.mfg_inst_no(operR.mfg_inst_no());
					r.oper_inst_no(operR.oper_inst_no());
					r.div_seq(operR.div_seq());
					r.oper_act_no(operR.oper_act_no());
					r.oper_st_act_tm(operR.st_act_tm());
					
					if (!isNull(r.inpt_schd_no()) && !MAC_BKF_TYP.isSCHD_QTY_ST(r.bkf_typ())
							&& !MAC_BKF_TYP.isSCHD_QTY_ED(r.bkf_typ())) {
						cacheL.add(r);
					}
				}
				
				// 予定数投入のコンテナは除いてキャッシュする
				_inptPropCache.putCache(new MCNumber[] {gL.get(0).oper_peg_no()}, cacheL);
			}
			
			for (MCList<MfgReCalc_Sprt02_DtlWkR> gL : up4().groupList(MfgReCalc_Sprt02_DtlWkR.$oper_peg_no)) {
				MfgReCalc_Sprt02_DtlOperR operR = _operCache.getCache(gL.get(0).oper_peg_no());
				MCList<MfgReCalc_Sprt02_DtlWkR> cacheL = MCList.create(MfgReCalc_Sprt02_DtlWkR.class);
				for (MfgReCalc_Sprt02_DtlWkR r : gL) {
					r.mfg_inst_no(operR.mfg_inst_no());
					r.oper_act_no(operR.oper_act_no());
					if (!isNull(r.wk_schd_no())) {
						cacheL.add(r);
					}
				}
				_wkCache.putCache(new MCNumber[] {gL.get(0).oper_peg_no()}, cacheL);
			}
			
			// 投入の割当可能数量で使用する（同一投入予定ＮＯの行が複数存在する場合、最終行には無制限で割り当てる必要がある）
			_maxRqstValue = getMaxRqstValue();
		}

		protected MCNumber getMaxRqstValue() {
			MCMeta qtyMeta = MfgReCalc_Sprt02_DtlInptR.rqst_qty_META;
			// メタの整数部の桁数
			int tmp = qtyMeta.length() - qtyMeta.scale();
			// 1*10^整数部の桁数+1
			return MCNumber.ONE.scaleByPowerOfTen(tmp + 1);
		}
		
		protected void editUp() {
			// 工程指図から出来高計上工程FLGを取得する
			MCList<MST_OPER_INST_R> operInstL = MCList.create(MST_OPER_INST_R.class);
			MST_OPER_INST_R t = MST_OPER_INST_R.create("T");
			MCQueryApiBuilder oper_bldr = MCQueryApiBuilder.create(t);
			oper_bldr.setSelect(t.oper_inst_no, 
					t.yield_oper_flg);
			dbSelectKey("MSBCL6070_MST_OPER_INST_S01", operInstL, oper_bldr,up1());
			MCIndexKey operInstNoKey = operInstL.createIndex(MST_OPER_INST_R.$oper_inst_no);
			
			// 出来高予定から工程指図ＮＯを取得する
			MCList<MST_YIELD_SCHD_R> yieldSchdL = MCList.create(MST_YIELD_SCHD_R.class);
			MST_YIELD_SCHD_R ys = MST_YIELD_SCHD_R.create("T");
			MCQueryApiBuilder yield_bldr = MCQueryApiBuilder.create(ys);
			yield_bldr.setSelect(ys.oper_inst_no, 
					ys.yield_schd_no);
			dbSelectKey("MSBCL6070_MST_YIELD_SCHD_S01", yieldSchdL, yield_bldr, up2());
			MCIndexKey yieldSchdNoKey = yieldSchdL.createIndex(MST_YIELD_SCHD_R.$yield_schd_no);
			
			for (MfgReCalc_Sprt02_DtlYieldR up2R : up2()) {
				MST_YIELD_SCHD_R yieldSchdR = yieldSchdL.getFirst(yieldSchdNoKey, up2R.yield_schd_no());
				up2R.addStringColumn("oper_inst_no", yieldSchdR.oper_inst_no());
			}
			
			// 上り電文のうち出来高計上工程以外を格納するリスト
			MCList<MfgReCalc_Sprt02_DtlOperR> up1L = MCList.create(MfgReCalc_Sprt02_DtlOperR.class);
			// 上り電文のうち出来高計上工程を格納するリスト
			MCList<MfgReCalc_Sprt02_DtlOperR> up1yieldOperL = MCList.create(MfgReCalc_Sprt02_DtlOperR.class);
			
			// 工程実績数量を元に計算用の分子・分母を設定する
			for (MfgReCalc_Sprt02_DtlOperR r : up1()) {
				r.oper_numerator(r.base_unit_act_qty());
				r.oper_denominator(r.base_unit_st_qty());
				// 出来高計上工程FLGを設定する
				MST_OPER_INST_R operInstR = operInstL.getFirst(operInstNoKey, r.oper_inst_no());
				if (!isNull(operInstR)) {
					r.yield_oper_flg(operInstR.yield_oper_flg());
				}
				// 出来高計上工程とそれ以外を振り分ける
				if (r.yield_oper_flg()) {
					up1yieldOperL.add(r);
				}
				else {
					up1L.add(r);
				}
			}
			
			//按分対象に含めるため、上り電文で上ってきていない工程実績を取得する
			MCList<MST_OPER_ACT_R> operActL = MCList.create(MST_OPER_ACT_R.class);
			MST_OPER_ACT_R t1 = MST_OPER_ACT_R.create("T1");
			MCQueryApiBuilder operAct_bldr = MCQueryApiBuilder.create(t1);
			MST_OPER_INST_R t2 = MST_OPER_INST_R.create("T2");
			operAct_bldr.setSelect(t1.oper_act_no, 
					t1.mfg_act_no, 
					t1.oper_inst_no,t1.div_seq,
					t1.st_act_tm, t1.oper_unit_qty);
			operAct_bldr.addSelect(t2.yield_oper_flg, t2.mfg_inst_no);
			operAct_bldr.addInnerJoin(t2, bracket(t1.oper_inst_no).eq(t2.oper_inst_no));
			operAct_bldr.addWhereWithAnd(t2.mfg_inst_no.eq(bind("mfg_inst_no")));
			dbSelect("MSBCL6070_MST_OPER_ACT_S01", operActL, operAct_bldr, up0().groupBy(MfgReCalc_Sprt02_HdrR.$mfg_inst_no));

			//上り電文で上ってきていない工程実績を追加する。
			for (MST_OPER_ACT_R r : operActL) {
				if (r.getStringNE("yield_oper_flg").equals("1")) {
					if (isNull(up1yieldOperL.getFirst(MfgReCalc_Sprt02_DtlOperR.$oper_act_no, r.oper_act_no()))) {
						MfgReCalc_Sprt02_DtlOperR up1yieldOperR = MfgReCalc_Sprt02_DtlOperR.create(); 
						up1yieldOperR.oper_inst_no(r.oper_inst_no());
						up1yieldOperR.st_act_tm(r.st_act_tm());
						up1yieldOperR.oper_act_no(r.oper_act_no());
						up1yieldOperR.base_unit_act_qty(r.base_unit_qty());
						up1yieldOperR.div_seq(r.div_seq());
						up1yieldOperR.setString(MfgReCalc_Sprt02_DtlOperR.$mfg_inst_no, r.getStringNE("mfg_inst_no"));
						up1yieldOperR.setBoolean(MfgReCalc_Sprt02_DtlOperR.$yield_oper_flg, true);
						MfgReCalc_Sprt02_HdrR tmpR = up0().getFirst(MfgReCalc_Sprt02_HdrR.$mfg_inst_no, r.getStringNE("mfg_inst_no"));
						if (!isNull(tmpR)) {
							up1yieldOperR.hdr_peg_no(tmpR.peg_no());
						}
						up1yieldOperL.add(up1yieldOperR);
					}
				}
				if (r.getStringNE("yield_oper_flg").equals("0")) {
					if (isNull(up1L.getFirst(MfgReCalc_Sprt02_DtlOperR.$oper_act_no, r.oper_act_no()))) {
						MfgReCalc_Sprt02_DtlOperR up1R = MfgReCalc_Sprt02_DtlOperR.create(); 
						up1R.oper_inst_no(r.oper_inst_no());
						up1R.st_act_tm(r.st_act_tm());
						up1R.oper_act_no(r.oper_act_no());
						up1R.base_unit_act_qty(r.base_unit_qty());
						up1R.div_seq(r.div_seq());
						up1R.setString(MfgReCalc_Sprt02_DtlOperR.$mfg_inst_no, r.getStringNE("mfg_inst_no"));
						up1R.setBoolean(MfgReCalc_Sprt02_DtlOperR.$yield_oper_flg, false);
						MfgReCalc_Sprt02_HdrR tmpR = up0().getFirst(MfgReCalc_Sprt02_HdrR.$mfg_inst_no, r.getStringNE("mfg_inst_no"));
						if (!isNull(tmpR)) {
							up1R.hdr_peg_no(tmpR.peg_no());
						}
						up1L.add(up1R);
					}
				}
			}

			// 出来高数量を元に計算用の分子・分母を設定する
			MCIndexKey yieldIdxKey = up2().createIndex(MfgReCalc_Sprt02_DtlYieldR.$hdr_peg_no);
			for (MCList<MfgReCalc_Sprt02_DtlOperR> mfgActGL : up1L.groupList(
					MfgReCalc_Sprt02_DtlOperR.$hdr_peg_no)) {
				MCList<MfgReCalc_Sprt02_DtlYieldR> yL = up2().subList(yieldIdxKey,
						mfgActGL.get(0).hdr_peg_no());
				
				if (yL.isEmpty()) {
					continue;
				}
				
				MCNumber stQty = MCNumber.ZERO;
				for (MCList<MfgReCalc_Sprt02_DtlYieldR> yGR : yL.groupList(MfgReCalc_Sprt02_DtlYieldR.$yield_schd_no)) {
					stQty = stQty.add(yGR.get(0).base_unit_yield_st_qty());
				}
				MCNumber actQty = nvl(yL.sum(MfgReCalc_Sprt02_DtlYieldR.$base_unit_yield_act_qty), MCNumber.ZERO);
				// 同一分割連番内で工程指図ＮＯに対する工程実績が複数存在する場合に案分する必要があるため、工程指図ＮＯでgroupListする
				for (MCList<MfgReCalc_Sprt02_DtlOperR> operInstGL : mfgActGL
						.groupList(MfgReCalc_Sprt02_DtlOperR.$oper_inst_no, MfgReCalc_Sprt02_DtlOperR.$div_seq)) {
					operInstGL.setNumber(MfgReCalc_Sprt02_DtlOperR.$yield_denominator, stQty);
					if (operInstGL.size() == 1) {
						operInstGL.setNumber(MfgReCalc_Sprt02_DtlOperR.$yield_numerator, actQty);
					}
					else {
						// 同一工程指図ＮＯに対して分子を均等に案分する
						operInstGL.setNumber(MfgReCalc_Sprt02_DtlOperR.$prop_col, MCNumber.ONE);
						if (actQty.isZero()) {
							operInstGL.setNumber(MfgReCalc_Sprt02_DtlOperR.$yield_numerator, MCNumber.ZERO);
						}
						else {
							FXUCC_Divide.propNE(operInstGL, actQty, DEC_PLACE,
									MfgReCalc_Sprt02_DtlOperR.$prop_col,
									MfgReCalc_Sprt02_DtlOperR.$yield_numerator);
						}
					}
				}
			}
			// 出来高計上工程に対して、出来高数量を元に計算用の分子・分母を設定する
			for (MfgReCalc_Sprt02_DtlOperR operR : up1yieldOperL) {
				// 工程に紐付く出来高の着手数を取得し、分母に設定する
				MCNumber stQty = up2()
								.subList(MfgReCalc_Sprt02_DtlYieldR.$hdr_peg_no, operR.hdr_peg_no())
								.groupBy(MfgReCalc_Sprt02_DtlYieldR.$yield_schd_no,
										MfgReCalc_Sprt02_DtlYieldR.$base_unit_yield_st_qty)
								.sum(MfgReCalc_Sprt02_DtlYieldR.$base_unit_yield_st_qty);
				operR.yield_denominator(stQty);
				
				// 工程に紐付く出来高の実績数を取得し、分子に設定する
				MCNumber actQty = up2()
								.subList(MfgReCalc_Sprt02_DtlYieldR.$oper_peg_no, operR.peg_no())
								.sum(MfgReCalc_Sprt02_DtlYieldR.$base_unit_yield_act_qty);
				operR.yield_numerator(actQty);
			}
		}
		
		protected void reCalcInpt() {
			// 予定数投入の場合
			for (MCList<MfgReCalc_Sprt02_DtlInptR> mfgActGL : up3().groupList(
					MfgReCalc_Sprt02_DtlInptR.$mfg_inst_no,
					MfgReCalc_Sprt02_DtlInptR.$div_seq)) {
				setInptActQtyForSchdQtyBkf(mfgActGL);
			}
			
			// 比例計算が必要な場合
			for (MCList<MfgReCalc_Sprt02_DtlOperR> operL : up1().groupList(
					MfgReCalc_Sprt02_DtlOperR.$mfg_inst_no,
					MfgReCalc_Sprt02_DtlOperR.$div_seq)) {
				setInptActQtyForPropBkf(operL);
			}
		}

		
		/**
		 * 予定数投入の場合の実績数量設定
		 * @param mfgActGL
		 */
		protected void setInptActQtyForSchdQtyBkf(
				MCList<MfgReCalc_Sprt02_DtlInptR> mfgActGL) {
			// 同一投入予定ＮＯの行が複数存在する場合があるため、着手数量をそのまま割り当て可能数に設定してはいけない
			
			// 着手が早い工程に紐付く投入予定に全行設定するためにソートする
			mfgActGL.sort(MfgReCalc_Sprt02_DtlInptR.$oper_st_act_tm,
					MfgReCalc_Sprt02_DtlInptR.$oper_act_no,
					MfgReCalc_Sprt02_DtlInptR.$oper_peg_no);
			for (MCList<MfgReCalc_Sprt02_DtlInptR> gL : mfgActGL
					.groupList(MfgReCalc_Sprt02_DtlInptR.$inpt_schd_no)) {

				boolean hasAct = !gL.subList(r -> !isNull(r.inpt_act_no())).isEmpty();

				for (MfgReCalc_Sprt02_DtlInptR r : gL) {
					int index = gL.indexOf(r);

					if (!MAC_BKF_TYP.isSCHD_QTY_ST(r.bkf_typ())	&& !MAC_BKF_TYP.isSCHD_QTY_ED(r.bkf_typ())) {
						continue;
					}
					if (isNull(r.inpt_schd_no())) {
						continue;
					}
					if (isNull(r.inpt_st_qty())) {
						// 製造実績一覧登録の着手時再計算で数量nullとなった場合の考慮
						continue;
					}
					if (hasAct) {
						if (!isNull(r.inpt_act_no())) {
							// 既に実績登録済みの場合は投入実績数量をそのまま採用するため何もしない（ロット割れしている場合に、最初の行に全数寄せてはいけないため）
						}
						else {
							// 未登録の行が存在する場合は0
							r.inpt_act_qty(MCNumber.ZERO);
						}
					}
					else {
						// 実績未登録の場合、最初の行に全数設定し、それ以外の行は0
						if (index == 0) {
							r.inpt_act_qty(r.inpt_st_qty());
						}
						else {
							r.inpt_act_qty(MCNumber.ZERO);
						}
					}
				}
			}
		}
		
		protected void setInptActQtyForPropBkf(MCList<MfgReCalc_Sprt02_DtlOperR> operL) {
			// 着手が早い順に割り当てていくためにソート
			operL.sort(MfgReCalc_Sprt02_DtlOperR.$st_act_tm,
					MfgReCalc_Sprt02_DtlOperR.$oper_act_no,
					MfgReCalc_Sprt02_DtlOperR.$oper_inst_no);
			
			// 投入予定ＮＯ毎に投入着手残数量を保持するMap
			Map<String, MCNumber> schdMap = new HashMap<String, MCNumber>();
			// 工程でループして投入を取得する
			for (MfgReCalc_Sprt02_DtlOperR operR : operL) {
				MCList<MfgReCalc_Sprt02_DtlInptR> inptL = _inptPropCache.getCache(operR.peg_no());
				if (isNull(inptL)) {
					continue;
				}
				
				for (MCList<MfgReCalc_Sprt02_DtlInptR> schdGL : inptL
						.groupList(MfgReCalc_Sprt02_DtlInptR.$inpt_schd_no)) {
					MfgReCalc_Sprt02_DtlInptR r = schdGL.get(0);
					if (isNull(r.inpt_schd_no())) {
						continue;
					}

					// 工程が複数に割れている場合に、工程を跨いで同一の投入予定NOが設定される場合がある
					// この場合、すでにschdMapに残数が設定されている場合は、前の着手残数量を使用するため、キーの存在をチェックする
					if (!schdMap.containsKey(r.inpt_schd_no())) {
						schdMap.put(r.inpt_schd_no(),
							nvl(r.getNumberNE("cont_inpt_rem_qty"),
								nvl(r.getNumberNE("base_unit_inpt_rem_qty"),
									nvl(r.inpt_st_qty(), MCNumber.ZERO))));
					}
					
					// 登録済の基準単位投入数量を残数量に加算する
					// 子品目が有効成分対象の場合は有効成分（投入数量）を残数量に加算する
					MCNumber sumBaseUnitInptQty = schdGL.sum("base_unit_inpt_qty");
					MCNumber sumContQty = schdGL.sum("cont_qty");
					MCNumber replaceQty = schdMap.get(r.inpt_schd_no());
					if (!isNull(sumContQty)) {
						replaceQty = replaceQty.add(sumContQty);
					}
					else if (!isNull(sumBaseUnitInptQty)) {
						replaceQty = replaceQty.add(sumBaseUnitInptQty);
					}
					
					schdMap.replace(r.inpt_schd_no(), replaceQty);
					
					// 投入予定の着手残数量を、同一投入予定ＮＯ内で案分する
					// ・投入実績数量が上ってきた場合は、その数量の比率で案分。
					// 既に画面で投入数が入力されている場合に、その値を極力維持するための考慮
					// ・上ってきていない場合や数量0のレコードが存在する場合は均等に案分
					if (isNull(schdGL.getFirst(MfgReCalc_Sprt02_DtlInptR.$inpt_act_qty, null))
							&& isNull(schdGL.getFirst(MfgReCalc_Sprt02_DtlInptR.$inpt_act_qty, MCNumber.ZERO))) {
						for (MfgReCalc_Sprt02_DtlInptR schdGR : schdGL) {
							schdGR.setNumberNE("tmp_prop_col", schdGR.inpt_act_qty());
						}
					}
					else {
						// 均等に案分するために1を設定する
						schdGL.setNumberNE("tmp_prop_col", MCNumber.ONE);
					}
					MCNumber ttl = schdMap.get(r.inpt_schd_no());
					if (ttl.isZero()) {
						schdGL.setNumber(MfgReCalc_Sprt02_DtlInptR.$after_prop_st_qty, MCNumber.ZERO);
					}
					else {
						FXUCC_Divide.propNE(schdGL, ttl,
								r.dec_place().intValue(), "tmp_prop_col",
								MfgReCalc_Sprt02_DtlInptR.$after_prop_st_qty);
					}
				}
				
				// 再計算グループ単位に処理して投入実績数量を設定する
				for (MCList<MfgReCalc_Sprt02_DtlInptR> recalcGL : inptL
						.groupList(MfgReCalc_Sprt02_DtlInptR.$recalc_grp)) {
					MfgReCalc_Sprt02_DtlInptR r = recalcGL.get(0);
					if (isNull(r.recalc_grp())) {
						// 予定無しの投入実績が渡された場合の考慮
						continue;
					}

					MCNumber numerator;
					MCNumber denominator;
					if (useYieldRatio(operR, r)) {
						numerator = operR.yield_numerator();
						denominator = operR.yield_denominator();
						// 出来高計上工程を対象に計算用分子、分母を再設定する
						if (operR.yield_oper_flg()) {
							List<MCNumber> returnList = calcNumeratorAndDenominator(operR, numerator, denominator);
							numerator = returnList.get(0);
							denominator = returnList.get(1);
						}
					}
					else {
						numerator = operR.oper_numerator();
						denominator = operR.oper_denominator();
					}
					
					if (isNull(denominator) || denominator.isZero() || isNull(numerator)
							|| numerator.isZero()) {
						recalcGL.setNumberNE(MfgReCalc_Sprt02_DtlInptR.$inpt_act_qty, MCNumber.ZERO);
						continue;
					}

					// 割当可能数量を設定する
					sortAndSetRqstQty(recalcGL);
					
					// 再計算グループ単位で案分後数量を合計し、比率を掛ける
					// ※ロットわれなどで一つの工程に対して、同一投入予定NOに紐つく実績が複数行存在することがあるため、inpt_schd_noでgroupListする
					MCNumber sumStQty = MCNumber.ZERO;
					for (MCList<MfgReCalc_Sprt02_DtlInptR> schdGL : recalcGL
							.groupList(MfgReCalc_Sprt02_DtlInptR.$inpt_schd_no)) {
						sumStQty = sumStQty.add(schdGL.get(0).inpt_st_qty());
					}
					MCNumber ttl = sumStQty.multiply(numerator).divide(denominator,
							r.dec_place().intValue(), RND_MODE);
					if (ttl.isZero()) {
						recalcGL.setNumber(MfgReCalc_Sprt02_DtlInptR.$rqst_qty, MCNumber.ZERO);
					}
					else {
						// 割当処理
						FXUCC_Divide.inSeq(recalcGL, ttl,
								MfgReCalc_Sprt02_DtlInptR.$rqst_qty,
								MfgReCalc_Sprt02_DtlInptR.$inpt_act_qty);
					}
				}
				
				// 投入予定の残数を消し込み
				for (MCList<MfgReCalc_Sprt02_DtlInptR> schdGL : inptL
						.groupList(MfgReCalc_Sprt02_DtlInptR.$inpt_schd_no)) {
					String inptSchdNo = schdGL.get(0).inpt_schd_no();
					if (isNull(inptSchdNo)) {
						continue;
					}
					MCNumber sumActQty = schdGL.sum(MfgReCalc_Sprt02_DtlInptR.$inpt_act_qty);
					if (isNull(sumActQty)) {
						continue;
					}
					MCNumber replaceQty = schdMap.get(inptSchdNo).subtract(sumActQty);
					if (replaceQty.isNegative()) {
						replaceQty = MCNumber.ZERO;
					}
					schdMap.replace(inptSchdNo, replaceQty);
				}
			}
		}
		
		protected void sortAndSetRqstQty(MCList<MfgReCalc_Sprt02_DtlInptR> recalcGL) {
			// 最終行は無制限に割り当て可能とするため、ソート順が重要（数量を増やした場合は、最終行の数量が増える）
			// ※新しいロットを最終行にする。同一ロットの場合は、計上日、投入実績ＮＯでソート（これから新たに追加するであろうデータが最終行となるように）。
			// 最終的には同一の場合は投入紐付けＮＯでソート※単票画面で連続実行した場合に同じ結果が返るように
			recalcGL.sort(MfgReCalc_Sprt02_DtlInptR.$recalc_grp_seq,
					MfgReCalc_Sprt02_DtlInptR.$first_gr_dt,
					MfgReCalc_Sprt02_DtlInptR.$lot_seq, MfgReCalc_Sprt02_DtlInptR.$ac_dt,
					MfgReCalc_Sprt02_DtlInptR.$inpt_act_no,
					MfgReCalc_Sprt02_DtlInptR.$peg_no);
			
			for (MfgReCalc_Sprt02_DtlInptR r : recalcGL) {
				int index = recalcGL.indexOf(r);
				if (index != recalcGL.size() - 1) {
					// 最終行以外の場合
					if (!isNull(r.inpt_act_qty())) {
						// 既に実績入力済みの行の場合は投入実績数量
						r.rqst_qty(r.inpt_act_qty());
					}
					else {
						// 実績未登録の場合は、案分後の着手数量
						r.rqst_qty(r.after_prop_st_qty());
					}
				}
				else {
					// 最終行は無制限に割り当て可能
					r.rqst_qty(_maxRqstValue);
				}
			}
		}
		
		/**
		 * 出来高の比率を元に投入実績数量を計算するか否か
		 */
		protected boolean useYieldRatio(MfgReCalc_Sprt02_DtlOperR operR, MfgReCalc_Sprt02_DtlInptR inptR) {
			if (_hdrCache.getCache(inptR.hdr_peg_no()).arr_purc_auto_reg_flg()) {
				// 入荷・仕入時に自動作成した場合、入荷・仕入に対応して工程実績が割れる（工程単位実績数には入荷・仕入実績数量が設定されている）。
				// 分納を考慮すると割れた工程実績ごとに投入実績を作成する必要があるため、バックフラッシュ区分の設定によらず、工程の数量で計算する
				return false;
			}
			
			if (MAC_BKF_TYP.isPROPOTIONAL(inptR.bkf_typ())) {
				return true;
			}
			// バックフラッシュ対象外であっても、単票画面で再計算対象とすることは可能。その場合は、出来高が存在する製造実績であれば出来高の比率で計算し、
			// 存在しない製造実績であれば工程の比率で計算する
			if (MAC_BKF_TYP.isNO_BKF(inptR.bkf_typ())) {
				if (!isNull(operR.yield_denominator())) {
					return true;
				}
			}
			return false;
		}
		
		protected void reCalcWk() {
			for (MCList<MfgReCalc_Sprt02_DtlOperR> operL : up1().groupList(
					MfgReCalc_Sprt02_DtlOperR.$mfg_inst_no,
					MfgReCalc_Sprt02_DtlOperR.$div_seq)) {
				setActWkCost(operL);
			}
		}
		
		protected void setActWkCost(MCList<MfgReCalc_Sprt02_DtlOperR> operL) {
			// 着手が早い順に割り当てていくためにソート
			operL.sort(MfgReCalc_Sprt02_DtlOperR.$st_act_tm,
					MfgReCalc_Sprt02_DtlOperR.$oper_act_no,
					MfgReCalc_Sprt02_DtlOperR.$peg_no);
			
			// 工程でループして工数を取得する
			for (MfgReCalc_Sprt02_DtlOperR operR : operL) {
				MCList<MfgReCalc_Sprt02_DtlWkR> wkL = _wkCache.getCache(operR.peg_no());
				if (isNull(wkL)) {
					continue;
				}
				
				// 工数予定ＮＯ毎に着手残数量を保持するMapを初期化
				// ※投入と違い再計算グループの連番で順番に消化するという処理ではないため、schdMapの設定仕様が異なる
				Map<String, MCNumber> schdMap = new HashMap<String, MCNumber>();
				for (MCList<MfgReCalc_Sprt02_DtlWkR> schdGL : wkL
						.groupList(MfgReCalc_Sprt02_DtlWkR.$wk_schd_no)) {
					MfgReCalc_Sprt02_DtlWkR r = schdGL.get(0);
					schdMap.put(r.wk_schd_no(), r.st_cost());
				}
				
				for (MCList<MfgReCalc_Sprt02_DtlWkR> schdGL : wkL
						.groupList(MfgReCalc_Sprt02_DtlWkR.$wk_schd_no)) {
					MfgReCalc_Sprt02_DtlWkR r = schdGL.get(0);
					if (isNull(r.dec_place())) {
						continue;
					}
					
					// 工数予定の着手残数量を、同一工数予定ＮＯ内で均等に案分する
					// ・工数が上ってきた場合は、その比率で案分
					// 既に画面で工数が入力されている場合に、その値を極力維持するための考慮
					// ・上ってきていない場合や、工数0のレコードが存在するは均等に案分
					if (isNull(schdGL.getFirst(MfgReCalc_Sprt02_DtlWkR.$act_cost, null))
							&& isNull(schdGL.getFirst(MfgReCalc_Sprt02_DtlWkR.$act_cost,
									MCNumber.ZERO))) {
						for (MfgReCalc_Sprt02_DtlWkR schdGR : schdGL) {
							schdGR.setNumberNE("tmp_prop_col", schdGR.act_cost());
						}
					}
					else {
						// 均等に案分するために1を設定する
						schdGL.setNumberNE("tmp_prop_col", MCNumber.ONE);
					}
					MCNumber ttl = schdMap.get(r.wk_schd_no());
					if (ttl.isZero()) {
						schdGL.setNumber(MfgReCalc_Sprt02_DtlWkR.$after_prop_st_cost, MCNumber.ZERO);
					}
					else {
						FXUCC_Divide.propNE(schdGL, schdMap.get(r.wk_schd_no()),
								r.dec_place().intValue(), "tmp_prop_col",
								MfgReCalc_Sprt02_DtlWkR.$after_prop_st_cost);
					}
				}

				for (MfgReCalc_Sprt02_DtlWkR wkR : wkL) {
					MCNumber numerator;
					MCNumber denominator;
					MfgReCalc_Sprt02_HdrR hdrR = _hdrCache.getCache(wkR.hdr_peg_no());
					if (hdrR != null && hdrR.oper_unit_flg()) {
						numerator = operR.oper_numerator();
						denominator = operR.oper_denominator();
					}
					else {
						if (!isNull(operR.yield_denominator())) {
							numerator = operR.yield_numerator();
							denominator = operR.yield_denominator();
							// 出来高計上工程を対象に計算用分子、分母を再設定する
							if (operR.yield_oper_flg()) {
								List<MCNumber> returnList = calcNumeratorAndDenominator(operR, numerator, denominator);
								numerator = returnList.get(0);
								denominator = returnList.get(1);
							}
						}
						else {
							numerator = operR.oper_numerator();
							denominator = operR.oper_denominator();
						}
					}
					if (isNull(denominator) || denominator.isZero() || isNull(numerator)
							|| numerator.isZero()) {
						wkR.act_cost(MCNumber.ZERO);
						continue;
					}
					wkR.act_cost(wkR.after_prop_st_cost().multiply(numerator)
							.divide(denominator, wkR.dec_place().intValue(), RND_MODE));
				}
				
				// 工数予定の残数を消し込み
				for (MCList<MfgReCalc_Sprt02_DtlWkR> schdGL : wkL.groupList(MfgReCalc_Sprt02_DtlWkR.$wk_schd_no)) {
					String wkSchdNo = schdGL.get(0).wk_schd_no();
					MCNumber sumActCost = schdGL.sum(MfgReCalc_Sprt02_DtlWkR.$act_cost);
					if (isNull(sumActCost)) {
						continue;
					}
					MCNumber replaceCost = schdMap.get(wkSchdNo).subtract(sumActCost);
					if (sumActCost.isNegative()) {
						sumActCost = MCNumber.ZERO;
					}
					schdMap.replace(wkSchdNo, replaceCost);
				}
				// 工数予定（固定）の足しこみ(各工数実績に対して、固定工数を足しこむ)
				for (MfgReCalc_Sprt02_DtlWkR r : wkL) {
					if (!isNull(r.act_cost()) && !isNull(r.st_fxd_cost())) {
						r.act_cost(r.act_cost().add(r.st_fxd_cost()));
					}
				}
			}
		}
		
		/**
		 * 出来高計上工程を対象に計算用分子、分母を再計算する処理。<br>
		 * 引数のoperRが出来高計上工程かどうかの判断は呼出元で行う想定。<br>
		 * 戻り値のreturnListはindex0がnumerator、index1がdenominatorとする
		 * 
		 * @param operR
		 * @param numerator
		 * @param denominator
		 * @return returnList
		 */
		protected List<MCNumber> calcNumeratorAndDenominator(MfgReCalc_Sprt02_DtlOperR operR, MCNumber numerator, MCNumber denominator) {
			// 戻り値用のリスト。index0がnumerator、index1がdenominatorとする
			List<MCNumber> returnList = new ArrayList<>();
			returnList.add(0, numerator);
			returnList.add(1, denominator);
			
			// 工程紐付けＮＯでグループ化し、それぞれの基準単位出来高実績数量の合計を取得する
			MCGroupByPolicy gp1 = new MCGroupByPolicy();
			gp1.addKey(MfgReCalc_Sprt02_DtlYieldR.$oper_peg_no);
			gp1.sum(MfgReCalc_Sprt02_DtlYieldR.$base_unit_yield_act_qty);
			MCList<MfgReCalc_Sprt02_DtlYieldR> tempUp2L1 = up2().groupBy(gp1);
			
			// 出来高予定ＮＯでグループ化し、基準単位出来高着手数量の最大値を取得する
			MCGroupByPolicy gp2 = new MCGroupByPolicy();
			gp2.addKey(MfgReCalc_Sprt02_DtlYieldR.$yield_schd_no, MfgReCalc_Sprt02_DtlYieldR.$hdr_peg_no);
			gp2.max(MfgReCalc_Sprt02_DtlYieldR.$base_unit_yield_st_qty);
			MCList<MfgReCalc_Sprt02_DtlYieldR> tempUp2L2 = up2().groupBy(gp2);
			
			MCIndexKey indexKey = tempUp2L2.createIndex(MfgReCalc_Sprt02_DtlYieldR.$hdr_peg_no, MfgReCalc_Sprt02_DtlYieldR.$yield_schd_no);
			
			// 工程に紐づく基準単位出来高実績数量を分子に設定する
			MfgReCalc_Sprt02_DtlYieldR tempUp2R1 = tempUp2L1.getFirst(MfgReCalc_Sprt02_DtlYieldR.$oper_peg_no, operR.peg_no());
			if (!isNull(tempUp2R1)) {
				numerator = tempUp2R1.base_unit_yield_act_qty();
				denominator = MCNumber.ZERO;
				
				// 工程に紐づく基準単位出来高着手数量を分母に設定する
				// 工程と出来高予定ＮＯの関係が１：Ｎになり得るので、工程に紐づく出来高予定ＮＯの分だけループして設定している
				MCList<MfgReCalc_Sprt02_DtlYieldR> tgtYieldSchdL = up2().subList(r -> (isSame(r.getStringNE("oper_inst_no"), operR.oper_inst_no()) && 
						isSame(r.getNumberNE("hdr_peg_no"), operR.hdr_peg_no()))).distinctNE(MfgReCalc_Sprt02_DtlYieldR.$yield_schd_no);
				for (MfgReCalc_Sprt02_DtlYieldR tgtYieldSchdR : tgtYieldSchdL) {
					MfgReCalc_Sprt02_DtlYieldR tempUp2R2 = tempUp2L2.getFirst(
							indexKey, tgtYieldSchdR.hdr_peg_no(), tgtYieldSchdR.yield_schd_no());
					if (!isNull(tempUp2R2)) {
						denominator = denominator.add(tempUp2R2.base_unit_yield_st_qty());
						returnList.set(0, numerator);
						returnList.set(1, denominator);
					}
				}
			}
			
			return returnList;
		}
		
		protected void setDown() {
			// ・実績未登録かつ計算結果が0の場合は、nullにする
			// ・実績登録済かつ計算結果がnullの場合は、0にする
			for (MfgReCalc_Sprt02_DtlInptR inptR : up3()) {
				if (isNull(inptR.inpt_act_no())) {
					if (isSame(inptR.inpt_act_qty(), MCNumber.ZERO)) {
						inptR.inpt_act_qty(null);
					}
				}
				else {
					if (isNull(inptR.inpt_act_qty())) {
						inptR.inpt_act_qty(MCNumber.ZERO);
					}
				}
				down0().add(inptR);
			}
			for (MfgReCalc_Sprt02_DtlWkR wkR : up4()) {
				if (isNull(wkR.wk_act_no())) {
					if (isSame(wkR.act_cost(), MCNumber.ZERO)) {
						wkR.act_cost(null);
					}
				}
				else {
					if (isNull(wkR.act_cost())) {
						wkR.act_cost(MCNumber.ZERO);
					}
				}
				down1().add(wkR);
			}
		}
	}
	
	/**
	 * MfgReCalc_Sprt03オペレーション.<p>
	 *
	 * 製造指図数に対する着手数から、工程、出来高・投入・副産品・工数の数量を再計算します。<br>
	 */
	public class MfgReCalc_Sprt03 extends MSBCL_MfgReCalcService_MC_A.MfgReCalc_Sprt03 {
		protected final java.math.RoundingMode RND_MODE = MAC_RND_TYP.RNDUP.toMC();
		
		protected static final int DEC_PLACE = 8; 
		
		// 各種明細テーブルからヘッダの上り電文にアクセスするためのキャッシュ
		protected FXUCL_Cache<MfgReCalc_Sprt03_HdrR> _hdrCache;
		
		// hdr_peg_noごとに、ヘッダの着手数を保持するMap
		protected Map<MCNumber, MCNumber> _numeratorMap = new HashMap<MCNumber, MCNumber>();
		// hdr_peg_noごとに、ヘッダの指図数を保持するMap
		protected Map<MCNumber, MCNumber> _denominatorMap = new HashMap<MCNumber, MCNumber>();
		// hdr_peg_noごとに、着手残数量がちょうど０になったかどうかを保持するMap
		protected Map<MCNumber, Boolean> _remQtyIsZeroMap = new HashMap<MCNumber, Boolean>();
		
		// 各種指図・予定テーブルの残数を保持するMap（端数処理は切り上げで着手数量を算出する。よって着手数＝指図数の場合に、予定数を超えるようなことがないようにするために残数が必要）
		protected Map<String, MSVT_OPER_INST_PR_R> _operRem = new HashMap<String, MSVT_OPER_INST_PR_R>();
		protected Map<String, MSVT_YIELD_SCHD_PR_R> _yieldByProdRem = new HashMap<String, MSVT_YIELD_SCHD_PR_R>();
		protected Map<String, MSVT_INPT_SCHD_PR_R> _inptRem = new HashMap<String, MSVT_INPT_SCHD_PR_R>();
		protected Map<String, MSVT_WK_SCHD_PR_R> _wkRem = new HashMap<String, MSVT_WK_SCHD_PR_R>();

		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			// 単票画面の新規登録時の画面イベントで呼び出す場合、分割連番は0で構わない
			
			// 上り電文編集
			editUp();
			
			// 指図数量・予定数量・残数量の取得
			setRemMap();
			
			// 工程の着手数量計算
			calcOperQty();
			
			// 出来高・副産品の着手数量計算
			calcYieldByProdQty();
			
			// 投入の着手数量計算
			calcInptQty();
			
			// 工数の着手数量計算
			calcWkCost();
			
			// 下り電文設定
			setDown();
		}
		
		protected void editUp() {
			_hdrCache = new FXUCL_Cache<MfgReCalc_Sprt03_HdrR>();
			_hdrCache.setFixMaxCacheSize(-1);
			
			for (MfgReCalc_Sprt03_HdrR r : up0()) {
				_hdrCache.putCache(new MCNumber[]{r.peg_no()}, r);
			}
			
			// 各明細の上り電文にヘッダの分割連番を設定する
			// 工程
			MCList<MfgReCalc_Sprt03_DtlOperR> operUpdOrDelL = MCList.create(MfgReCalc_Sprt03_DtlOperR.class);
			for (MfgReCalc_Sprt03_DtlOperR r : up1()) {
				MfgReCalc_Sprt03_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
				r.div_seq(hdrR.div_seq());
				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					operUpdOrDelL.add(r);
				}
			}
			
			//　出来高
			MCList<MfgReCalc_Sprt03_DtlYieldR> yieldByProdUpdOrDelL = MCList.create(MfgReCalc_Sprt03_DtlYieldR.class);
			for (MfgReCalc_Sprt03_DtlYieldR r : up2()) {
				MfgReCalc_Sprt03_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
				r.div_seq(hdrR.div_seq());
				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					yieldByProdUpdOrDelL.add(r);
				}
			}
			// 副産品
			//出来高予定ＮＯが入っていないものは、計画外の副産品のため、着手時再計算をする必要がないため上り電文から除外する
			MCList<MfgReCalc_Sprt03_DtlYieldR> tmpL = up3().subList(r->isNull(r.yield_schd_no()));
			up3().removeAll(tmpL);
			for (MfgReCalc_Sprt03_DtlYieldR r : up3()) {
				MfgReCalc_Sprt03_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
				r.div_seq(hdrR.div_seq());
				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					yieldByProdUpdOrDelL.add(r);
				}
			}
			
			// 投入
			MCList<MfgReCalc_Sprt03_DtlInptR> inptUpdOrDelL = MCList.create(MfgReCalc_Sprt03_DtlInptR.class);
			for (MfgReCalc_Sprt03_DtlInptR r : up4()) {
				MfgReCalc_Sprt03_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
				r.mfg_inst_no(hdrR.mfg_inst_no());
				r.div_seq(hdrR.div_seq());
				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					inptUpdOrDelL.add(r);
				}
			}
			
			// 工数
			MCList<MfgReCalc_Sprt03_DtlWkR> wkUpdOrDelL = MCList.create(MfgReCalc_Sprt03_DtlWkR.class);
			for (MfgReCalc_Sprt03_DtlWkR r : up5()) {
				MfgReCalc_Sprt03_HdrR hdrR = _hdrCache.getCache(r.hdr_peg_no());
				r.div_seq(hdrR.div_seq());
				if (MAC_DATA_CRUD_TYP.isUPD(hdrR.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
					wkUpdOrDelL.add(r);
				}
			}
			
			// 各明細に更新前着手数を設定する
			if (!operUpdOrDelL.isEmpty()) {
				MCList<MST_OPER_ACT_REM_R> dbc = MCList.create(MST_OPER_ACT_REM_R.class);
				MST_OPER_ACT_REM_R t = MST_OPER_ACT_REM_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setSelect(t.oper_inst_no, t.div_seq, t.base_unit_qty);
				dbSelectKey("MSBCL6070_MST_OPER_ACT_REM_S01", dbc, dbc_bldr, operUpdOrDelL);

				MCIndexKey idxkey = dbc.createIndex(MST_OPER_ACT_REM_R.$oper_inst_no,
						MST_OPER_ACT_REM_R.$div_seq);
				for (MfgReCalc_Sprt03_DtlOperR r : operUpdOrDelL) {
					MST_OPER_ACT_REM_R dbcR = dbc.getFirst(idxkey, r.oper_inst_no(),
							r.div_seq());
					if (!isNull(dbcR)) {
						r.old_base_unit_st_qty(dbcR.base_unit_qty());
					}
					else {
						r.old_base_unit_st_qty(MCNumber.ZERO);
					}
				}
			}
			
			if (!yieldByProdUpdOrDelL.isEmpty()) {
				MCList<MST_YIELD_ACT_REM_R> dbc = MCList.create(MST_YIELD_ACT_REM_R.class);
				MST_YIELD_ACT_REM_R t = MST_YIELD_ACT_REM_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setSelect(t.yield_schd_no,
						t.div_seq,
						t.trd_unit_yield_qty,
						t.base_unit_yield_qty);
				dbSelectKey("MSBCL6070_MST_YIELD_ACT_REM_S01", dbc, dbc_bldr, yieldByProdUpdOrDelL);
				
				MCIndexKey idxkey = dbc.createIndex(MST_YIELD_ACT_REM_R.$yield_schd_no,
						MST_YIELD_ACT_REM_R.$div_seq);
				for (MfgReCalc_Sprt03_DtlYieldR r : yieldByProdUpdOrDelL) {
					MST_YIELD_ACT_REM_R dbcR = dbc.getFirst(idxkey, r.yield_schd_no(), r.div_seq());
					if (!isNull(dbcR)) {
						r.old_trd_unit_st_qty(dbcR.trd_unit_yield_qty());
						r.old_base_unit_st_qty(dbcR.base_unit_yield_qty());
					}
					else {
						r.old_trd_unit_st_qty(MCNumber.ZERO);
						r.old_base_unit_st_qty(MCNumber.ZERO);
					}
				}
			}
			
			if (!inptUpdOrDelL.isEmpty()) {
				MCList<MST_INPT_ACT_REM_R> dbc = MCList.create(MST_INPT_ACT_REM_R.class);
				MST_INPT_ACT_REM_R t1 = MST_INPT_ACT_REM_R.create("T");
				MST_INPT_SCHD_R t2 = MST_INPT_SCHD_R.create("T2");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t1);
				dbc_bldr.setSelect(t1.inpt_schd_no,
						t1.div_seq,
						t1.base_unit_inpt_qty,
						t1.base_unit_rqmt_qty,
						t1.base_unit_fxd_rqmt_qty,
						t1.cont_inpt_qty,
						t1.cont_rqmt_qty,
						t1.cont_fxd_rqmt_qty);
				dbc_bldr.addSelect(t2.recalc_grp);
				dbc_bldr.addInnerJoin(t2, t1.inpt_schd_no.eq(t2.inpt_schd_no));
				dbSelectKey("MSBCL6070_MST_INPT_ACT_REM_S01", dbc, dbc_bldr, inptUpdOrDelL);
				
				MCIndexKey idxkey = dbc.createIndex(MST_INPT_ACT_REM_R.$inpt_schd_no,
						MST_INPT_ACT_REM_R.$div_seq);
				for (MfgReCalc_Sprt03_DtlInptR r : inptUpdOrDelL) {
					MST_INPT_ACT_REM_R dbcR = dbc.getFirst(idxkey, r.inpt_schd_no(), r.div_seq());
					if (!isNull(dbcR)) {
						r.old_base_unit_inpt_st_qty(dbcR.base_unit_inpt_qty());
						r.old_base_unit_rqmt_st_qty(dbcR.base_unit_rqmt_qty());
						r.old_base_unit_fxd_rqmt_st_qty(dbcR.base_unit_fxd_rqmt_qty());
						r.old_cont_inpt_st_qty(dbcR.cont_inpt_qty());
						r.old_cont_rqmt_st_qty(dbcR.cont_rqmt_qty());
						r.old_cont_fxd_rqmt_st_qty(dbcR.cont_fxd_rqmt_qty());
						
						r.recalc_grp(dbcR.getNumberNE("recalc_grp"));
					}
					else {
						r.old_base_unit_inpt_st_qty(MCNumber.ZERO);
						r.old_base_unit_rqmt_st_qty(MCNumber.ZERO);
						r.old_base_unit_fxd_rqmt_st_qty(MCNumber.ZERO);
						r.old_cont_inpt_st_qty(MCNumber.ZERO);
						r.old_cont_rqmt_st_qty(MCNumber.ZERO);
						r.old_cont_fxd_rqmt_st_qty(MCNumber.ZERO);
					}
				}
			}
			
			if (!wkUpdOrDelL.isEmpty()) {
				MCList<MST_WK_ACT_REM_R> dbc = MCList.create(MST_WK_ACT_REM_R.class);
				MST_WK_ACT_REM_R t = MST_WK_ACT_REM_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setSelect(t.wk_schd_no,
						t.div_seq,
						t.fxd_wk_cost,
						t.wk_cost);
				dbSelectKey("MSBCL6070_MST_WK_ACT_REM_S01", dbc, dbc_bldr, wkUpdOrDelL);
				
				MCIndexKey idxkey = dbc.createIndex(MST_WK_ACT_REM_R.$wk_schd_no, MST_WK_ACT_REM_R.$div_seq);
				for (MfgReCalc_Sprt03_DtlWkR r : wkUpdOrDelL) {
					MST_WK_ACT_REM_R dbcR = dbc.getFirst(idxkey, r.wk_schd_no(), r.div_seq());
					if (!isNull(dbcR)) {
						r.old_st_fxd_wk_cost(dbcR.fxd_wk_cost());
						r.old_st_wk_cost(dbcR.wk_cost());
					}
					else {
						r.old_st_fxd_wk_cost(MCNumber.ZERO);
						r.old_st_wk_cost(MCNumber.ZERO);
					}
				}
			}
		}
		
		// 投入の予定数量を保持する一時カラムのカラム名
		protected static final String BASE_UNIT_INPT_SCHD_QTY_COL_NM = "base_unit_inpt_schd_qty";
		protected static final String BASE_UNIT_RQMT_SCHD_QTY_COL_NM = "base_unit_rqmt_schd_qty";
		protected static final String BASE_UNIT_FXD_RQMT_SCHD_QTY_COL_NM = "base_unit_fxd_rqmt_schd_qty";
		protected static final String CONT_INPT_SCHD_QTY_COL_NM = "cont_inpt_schd_qty";
		protected static final String CONT_RQMT_SCHD_QTY_COL_NM = "cont_rqmt_schd_qty";
		protected static final String CONT_FXD_RQMT_SCHD_QTY_COL_NM = "cont_fxd_rqmt_schd_qty";
		
		/**
		 * 各種指図ＮＯ、予定ＮＯごとに指図・予定数量、着手数量を保持するMapを設定する
		 */
		protected void setRemMap() {
			boolean is_src_mfg_inst_srv_flg = false;
			if (!isNull(up0())) {
				is_src_mfg_inst_srv_flg = up0().get(0).is_src_mfg_inst_srv_flg();
			}
			// ヘッダ
			MST_MFG_INST_R t2 = MST_MFG_INST_R.create("T2");
			MST_ITM_MFG_INST_R t4 = MST_ITM_MFG_INST_R.create("T4");
			MAM_ITM_R t3 = MAM_ITM_R.create("T3");
			MCList<MSVT_MFG_INST_PR_R> hdrRem = MCList.create(MSVT_MFG_INST_PR_R.class);
			MSVT_MFG_INST_PR_R t = MSVT_MFG_INST_PR_R.create("T");
			MCQueryApiBuilder hdrRem_bldr = MCQueryApiBuilder.create(t);
			hdrRem_bldr.setSelect(t.mfg_inst_no);
			hdrRem_bldr.addSelect(t2.base_unit_inst_qty);
			hdrRem_bldr.addSelect(t3.dec_place);
			hdrRem_bldr.addSelect(t2.base_unit_inst_qty.subtract(t.base_unit_mfg_qty)
					.as(MSVT_MFG_INST_PR_R.$base_unit_mfg_rem_qty));
			hdrRem_bldr.addInnerJoin(t2, t.mfg_inst_no.eq(t2.mfg_inst_no));
			hdrRem_bldr.addInnerJoin(t4, t.itm_mfg_inst_no.eq(t4.itm_mfg_inst_no));
			hdrRem_bldr.addInnerJoin(t3, t4.itm_cd.eq(t3.itm_cd)
					.and(t4.itm_sub1.eq(t3.itm_sub1))
					.and(t4.itm_sub2.eq(t3.itm_sub2))
					.and(t4.itm_sub3.eq(t3.itm_sub3)));
			dbSelectKey("MSBCL6070_MSVT_MFG_INST_PR_S01",
					hdrRem, hdrRem_bldr, up0().groupBy(MfgReCalc_Sprt03_HdrR.$mfg_inst_no));
			if (is_src_mfg_inst_srv_flg) {
				hdrRem.forEach(r -> r.base_unit_mfg_rem_qty(r.getNumberNE("base_unit_inst_qty")));
			}

			MCIndexKey hdrIdxKey = hdrRem.createIndex(MSVT_MFG_INST_PR_R.$mfg_inst_no);
			
			for (MCList<MfgReCalc_Sprt03_HdrR> gL : up0().groupList(MfgReCalc_Sprt03_HdrR.$mfg_inst_no)) {
				MSVT_MFG_INST_PR_R remR = hdrRem.getFirst(hdrIdxKey, gL.get(0).mfg_inst_no());
				// 製造指図ＮＯ単位に着手残数を取得
				MCNumber remQty = MCNumber.ZERO;
				if (!isNull(remR)) {
					remQty = remR.base_unit_mfg_rem_qty();
				}
				gL.sort(MfgReCalc_Sprt03_HdrR.$div_seq);

				for (MfgReCalc_Sprt03_HdrR hdrR : gL) {
					if (MAC_DATA_CRUD_TYP.isDEL(hdrR.data_crud_typ())) {
						continue;
					}
					if (isNull(remR)) {
						continue;
					}
					
					MCNumber instQty = remR.getNumberNE("base_unit_inst_qty");
					MCNumber decPlace = remR.getNumberNE("dec_place");
					hdrR.base_unit_inst_qty(instQty);
					hdrR.base_unit_dec_place(decPlace);
					// 着手数と指図数を保持
					_numeratorMap.put(hdrR.peg_no(), hdrR.base_unit_st_qty());
					_denominatorMap.put(hdrR.peg_no(), instQty);
					
					// 着手残数（製造指図の指図数－進捗状況の着手数）と上り電文の着手数が一致するかどうかを保持する。
					// ぴったり一致する場合、工程、出来高、副産品の数量を算出する際、着手数／指図数の比率で算出せず、各指図・予定の着手残数を設定する。
					// ※比率で算出すると端数が生じる可能性があるため。
					// 着手数が着手残数を超える（指図数以上の着手を行う）場合は比率で算出したいので、「ぴったり一致」の場合のみ着手残数を使用する。
					boolean remQtyIsZero = false;
					if (isSame(remQty, hdrR.base_unit_st_qty())) {
						remQtyIsZero = true;
						remQty = MCNumber.ZERO;
					}
					else {
						remQty = remQty.subtract(hdrR.base_unit_st_qty());
					}
					_remQtyIsZeroMap.put(hdrR.peg_no(), Boolean.valueOf(remQtyIsZero));
				}
			}
			
			
			// 工程
			MCList<MSVT_OPER_INST_PR_R> operRem = MCList.create(MSVT_OPER_INST_PR_R.class);
			MSVT_OPER_INST_PR_R t9 = MSVT_OPER_INST_PR_R.create("T");
			MCQueryApiBuilder operRem_bldr = MCQueryApiBuilder.create(t9);
			MST_OPER_INST_R t5 = MST_OPER_INST_R.create("T2");

			operRem_bldr.setSelect(t9.oper_inst_no, t9.base_unit_qty);
			operRem_bldr.addSelect(t5.base_unit_qty.as("base_unit_inst_qty"));
			operRem_bldr.addSelect(t5.oper_std_qty);
			operRem_bldr.addSelect(t5.oper_conv_qty);
			operRem_bldr.addSelect(t5.oper_unit_conv_rnd_typ);
			operRem_bldr.addSelect(t5.oper_unit_dec_place);
			operRem_bldr.addSelect(t5.base_unit_qty.subtract(t9.base_unit_qty).as("base_unit_rem_qty"));
			operRem_bldr.addInnerJoin(t5, t9.oper_inst_no.eq(t5.oper_inst_no));
			dbSelectKey("MSBCL6070_MSVT_OPER_INST_PR_S01",
					operRem, operRem_bldr, up1().groupBy(MfgReCalc_Sprt03_DtlOperR.$oper_inst_no));
			if (is_src_mfg_inst_srv_flg) {
				hdrRem.forEach(r -> r.base_unit_mfg_rem_qty(r.getNumberNE("base_unit_inst_qty")));
			}
			
			for (MSVT_OPER_INST_PR_R remR : operRem) {
				_operRem.put(remR.oper_inst_no(), remR);
			}
			
			// 出来高、副産品
			MSVT_YIELD_SCHD_PR_R t6 = MSVT_YIELD_SCHD_PR_R.create("T");
			MST_YIELD_SCHD_R t7 = MST_YIELD_SCHD_R.create("T2");

			MCList<MfgReCalc_Sprt03_DtlYieldR> yieldByProdUpL = MCList.create(MfgReCalc_Sprt03_DtlYieldR.class);
			yieldByProdUpL.addAll(up2());
			yieldByProdUpL.addAll(up3());
			
			MCList<MSVT_YIELD_SCHD_PR_R> yieldByProdRem = MCList.create(MSVT_YIELD_SCHD_PR_R.class);
			MCQueryApiBuilder yieldByProdRem_bldr = MCQueryApiBuilder.create(t6);
			yieldByProdRem_bldr.setSelect(t6.yield_schd_no, t6.trd_unit_yield_qty, t6.base_unit_yield_qty);
			yieldByProdRem_bldr.addSelect(t7.trd_unit_yield_qty.as("trd_unit_yield_schd_qty"));
			yieldByProdRem_bldr.addSelect(t7.base_unit_yield_qty.as("base_unit_yield_schd_qty"));
			yieldByProdRem_bldr.addSelect(t3.dec_place.as("base_unit_dec_place"));
			yieldByProdRem_bldr.addSelect(t7.trd_unit_yield_qty.subtract(t6.trd_unit_yield_qty).as("trd_unit_rem_qty"));
			yieldByProdRem_bldr.addSelect(t7.base_unit_yield_qty.subtract(t6.base_unit_yield_qty).as("base_unit_rem_qty"));
			yieldByProdRem_bldr.addSelect(t7.itm_cd);
			yieldByProdRem_bldr.addSelect(t7.itm_sub1);
			yieldByProdRem_bldr.addSelect(t7.itm_sub2);
			yieldByProdRem_bldr.addSelect(t7.itm_sub3);
			yieldByProdRem_bldr.addSelect(t7.trd_unit_cd);
			
			yieldByProdRem_bldr.addInnerJoin(t7, t6.yield_schd_no.eq(t7.yield_schd_no));
			yieldByProdRem_bldr.addLeftOuterJoin(t3, t7.itm_cd.eq(t3.itm_cd)
					.and(t7.itm_sub1.eq(t3.itm_sub1))
					.and(t7.itm_sub2.eq(t3.itm_sub2))
					.and(t7.itm_sub3.eq(t3.itm_sub3)));
			dbSelectKey("MSBCL6070_MSVT_YIELD_SCHD_PR_S01",
					yieldByProdRem, yieldByProdRem_bldr, yieldByProdUpL);
			if (is_src_mfg_inst_srv_flg) {
				yieldByProdRem.forEach(r ->{
					r.setNumberNE("trd_unit_rem_qty", r.getNumberNE("trd_unit_yield_schd_qty"));
					r.setNumberNE("base_unit_rem_qty", r.getNumberNE("base_unit_yield_schd_qty"));
				}
				);
			}
			
			MCJoinerList<MSVT_YIELD_SCHD_PR_R> joinList = new MCJoinerList<>();
			joinList
			.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
					r.getStringNE("itm_cd"), r.getStringNE("itm_sub1"), r.getStringNE("itm_sub2"),
					r.getStringNE("itm_sub3"), r.getStringNE("trd_unit_cd")
			))
			.addSelect(m -> toArray(
					m.dec_place
			))
			.addMap((r, m) -> {
				r.setNumberNE("trd_unit_dec_place", m.dec_place());
			});
			joinList.join(yieldByProdRem);
			yieldByProdRem = yieldByProdRem.subList((r -> !isNull(r.getNumber("trd_unit_dec_place"))));
			MCMessageList msgL = new MCMessageList();
			MCList<MSVT_YIELD_SCHD_PR_R> yieldByProdErrL = yieldByProdRem.subList(r -> isNull(r.getNumber("base_unit_dec_place")));
			yieldByProdErrL.setAll(yieldByProdErrL.distinctNE("itm_cd", "itm_sub1", "itm_sub2", "itm_sub3"));
			for (MSVT_YIELD_SCHD_PR_R errR : yieldByProdErrL) {
				MCMessage msg = new MCMessage(MAUAL0189
						, toDispItm(errR.getString("itm_cd")
								, errR.getString("itm_sub1")
								, errR.getString("itm_sub2")
								, errR.getString("itm_sub3"))
						, toDispGUIIndex(MCRow.create()));
				
				msgL.add(msg);
			}
			for (MSVT_YIELD_SCHD_PR_R remR : yieldByProdRem) {
				// 数量がマイナスになる場合はゼロとみなす
				if (remR.getNumberNE("trd_unit_rem_qty").isNegative()) {
					remR.setNumberNE("trd_unit_rem_qty", MCNumber.ZERO);
				}
				if (remR.getNumberNE("base_unit_rem_qty").isNegative()) {
					remR.setNumberNE("base_unit_rem_qty", MCNumber.ZERO);
				}
				_yieldByProdRem.put(remR.yield_schd_no(), remR);
			}
			
			// 投入
			MCList<MSVT_INPT_SCHD_PR_R> inptRem = MCList.create(MSVT_INPT_SCHD_PR_R.class);
			MSVT_INPT_SCHD_PR_R t11 = MSVT_INPT_SCHD_PR_R.create("T");
			MCQueryApiBuilder inptRem_bldr = MCQueryApiBuilder.create(t11);
			inptRem_bldr.setSelect(t11.inpt_schd_no);
			
			// 予定数量の取得
			MST_INPT_SCHD_R t10 = MST_INPT_SCHD_R.create("T2");
			inptRem_bldr.addSelect(t10.base_unit_inpt_qty.as("base_unit_inpt_schd_qty"));
			inptRem_bldr.addSelect(t10.base_unit_rqmt_qty.as("base_unit_rqmt_schd_qty"));
			inptRem_bldr.addSelect(t10.base_unit_fxd_rqmt_qty.as("base_unit_fxd_rqmt_schd_qty"));
			inptRem_bldr.addSelect(t10.cont_inpt_qty.as("cont_inpt_schd_qty"));
			inptRem_bldr.addSelect(t10.cont_rqmt_qty.as("cont_rqmt_schd_qty"));
			inptRem_bldr.addSelect(t10.cont_fxd_rqmt_qty.as("cont_fxd_rqmt_schd_qty"));
			
			// 着手残数量の取得
			// ※投入進捗ビューの残数量は投入実績の残数量であり着手残数量ではない。本処理では着手残数量を必要としているため、
			// 着手残数量を「予定数量-着手数量」で求める
			inptRem_bldr.addSelect(t10.base_unit_inpt_qty.subtract(t11.base_unit_inpt_qty)
					.as(MSVT_INPT_SCHD_PR_R.$base_unit_inpt_rem_qty));
			inptRem_bldr.addSelect(t10.base_unit_rqmt_qty.subtract(t11.base_unit_rqmt_qty)
					.as(MSVT_INPT_SCHD_PR_R.$base_unit_rqmt_rem_qty));
			inptRem_bldr
					.addSelect(t10.base_unit_fxd_rqmt_qty.subtract(t11.base_unit_fxd_rqmt_qty)
							.as(MSVT_INPT_SCHD_PR_R.$base_unit_fxd_rqmt_rem_qty));
			inptRem_bldr.addSelect(t10.cont_inpt_qty.subtract(
					t11.cont_inpt_qty).as(MSVT_INPT_SCHD_PR_R.$cont_inpt_rem_qty));
			inptRem_bldr.addSelect(t10.cont_rqmt_qty.subtract(
					t11.cont_rqmt_qty).as(MSVT_INPT_SCHD_PR_R.$cont_rqmt_rem_qty));
			inptRem_bldr.addSelect(t10.cont_fxd_rqmt_qty.subtract(
					t11.cont_fxd_rqmt_qty).as(MSVT_INPT_SCHD_PR_R.$cont_fxd_rqmt_rem_qty));

			inptRem_bldr.addSelect(t3.dec_place.as("base_unit_dec_place"));
			inptRem_bldr.addSelect(t3.cont_fctr_dec_place);
			inptRem_bldr.addSelect(t10.itm_cd);
			inptRem_bldr.addSelect(t10.itm_sub1);
			inptRem_bldr.addSelect(t10.itm_sub2);
			inptRem_bldr.addSelect(t10.itm_sub3);
			inptRem_bldr.addInnerJoin(t10, t11.inpt_schd_no.eq(t10.inpt_schd_no));
			inptRem_bldr.addLeftOuterJoin(t3, t10.itm_cd.eq(t3.itm_cd)
					.and(t10.itm_sub1.eq(t3.itm_sub1))
					.and(t10.itm_sub2.eq(t3.itm_sub2))
					.and(t10.itm_sub3.eq(t3.itm_sub3)));
			dbSelectKey("MSBCL6070_MSVT_INPT_SCHD_PR_S01",
					inptRem, inptRem_bldr, up4().groupBy(MfgReCalc_Sprt03_DtlInptR.$inpt_schd_no));
			if (is_src_mfg_inst_srv_flg) {
				inptRem.forEach(r ->{
					r.base_unit_inpt_rem_qty(r.getNumberNE(BASE_UNIT_INPT_SCHD_QTY_COL_NM));
					r.base_unit_rqmt_rem_qty(r.getNumberNE(BASE_UNIT_RQMT_SCHD_QTY_COL_NM));
					r.base_unit_fxd_rqmt_rem_qty(r.getNumberNE(BASE_UNIT_FXD_RQMT_SCHD_QTY_COL_NM));
					r.cont_inpt_rem_qty(r.getNumberNE(CONT_INPT_SCHD_QTY_COL_NM));
					r.cont_rqmt_rem_qty(r.getNumberNE(CONT_RQMT_SCHD_QTY_COL_NM));
					r.cont_fxd_rqmt_rem_qty(r.getNumberNE(CONT_FXD_RQMT_SCHD_QTY_COL_NM));
				}
				);
			}
			
			MCList<MSVT_INPT_SCHD_PR_R> inptErrL = inptRem.subList(r -> isNull(r.getNumber("base_unit_dec_place")));
			inptErrL.setAll(inptErrL.distinctNE("itm_cd", "itm_sub1", "itm_sub2", "itm_sub3"));
			for (MSVT_INPT_SCHD_PR_R errR : inptErrL) {
				MCMessage msg = new MCMessage(MAUAL0189
						, toDispItm(errR.getString("itm_cd")
								, errR.getString("itm_sub1")
								, errR.getString("itm_sub2")
								, errR.getString("itm_sub3"))
						, toDispGUIIndex(MCRow.create()));
				
				msgL.add(msg);
			}
			
			if (!msgL.isEmpty()) {
				int i = 0;
				MCAppException ex = new MCAppException(msgL.get(0));
				for (MCMessage aMsg : msgL) {
					if (i > 0) {
						ex.addCauseMessage(aMsg);
					}
					i++;
				}
				throw ex;
			}
			
			for (MSVT_INPT_SCHD_PR_R remR : inptRem) {
				if (remR.base_unit_inpt_rem_qty().isNegative()) {
					remR.base_unit_inpt_rem_qty(MCNumber.ZERO);
				}
				if (remR.base_unit_rqmt_rem_qty().isNegative()) {
					remR.base_unit_rqmt_rem_qty(MCNumber.ZERO);
				}
				if (remR.base_unit_fxd_rqmt_rem_qty().isNegative()) {
					remR.base_unit_fxd_rqmt_rem_qty(MCNumber.ZERO);
				}
				if (!isNull(remR.cont_inpt_rem_qty()) && remR.cont_inpt_rem_qty().isNegative()) {
					remR.cont_inpt_rem_qty(MCNumber.ZERO);
				}
				if (!isNull(remR.cont_rqmt_rem_qty()) && remR.cont_rqmt_rem_qty().isNegative()) {
					remR.cont_rqmt_rem_qty(MCNumber.ZERO);
				}
				if (!isNull(remR.cont_fxd_rqmt_rem_qty()) && remR.cont_fxd_rqmt_rem_qty().isNegative()) {
					remR.cont_fxd_rqmt_rem_qty(MCNumber.ZERO);
				}
				_inptRem.put(remR.inpt_schd_no(), remR);
			}
			
			// 工数
			MST_WK_SCHD_R t13 = MST_WK_SCHD_R.create("T2");
			MAM_WK_COST_R t14 = MAM_WK_COST_R.create("T3");
			MCList<MSVT_WK_SCHD_PR_R> wkRem = MCList.create(MSVT_WK_SCHD_PR_R.class);
			MSVT_WK_SCHD_PR_R t12 = MSVT_WK_SCHD_PR_R.create("T");
			MCQueryApiBuilder wkRem_bldr = MCQueryApiBuilder.create(t12);
			wkRem_bldr.setSelect(t12.wk_schd_no, t12.fxd_wk_cost, t12.wk_cost);
			wkRem_bldr.addSelect(t13.fxd_wk_cost.as("schd_fxd_wk_cost"));
			wkRem_bldr.addSelect(t13.wk_cost.as("schd_wk_cost"));
			wkRem_bldr.addSelect(t14.dec_place);
			wkRem_bldr.addInnerJoin(t13, t12.wk_schd_no.eq(t13.wk_schd_no));
			wkRem_bldr.addInnerJoin(t14, t13.wk_cost_cd.eq(t14.wk_cost_cd));
			dbSelectKey("MSBCL6070_MSVT_WK_SCHD_PR_S01", wkRem, wkRem_bldr,
					up5().groupBy(MfgReCalc_Sprt03_DtlWkR.$wk_schd_no));
			for (MSVT_WK_SCHD_PR_R remR : wkRem) {
				_wkRem.put(remR.wk_schd_no(), remR);
			}
		}
		
		/**
		 * 工程の着手数量計算
		 */
		protected void calcOperQty() {
			for (MCList<MfgReCalc_Sprt03_DtlOperR> gL : up1()
					.groupList(MfgReCalc_Sprt03_DtlOperR.$oper_inst_no)) {
				MSVT_OPER_INST_PR_R remR = _operRem.get(gL.get(0).oper_inst_no());
				
				MCNumber instQty = remR.getNumberNE("base_unit_inst_qty"); // 指図数量
				MCNumber remQty = remR.getNumberNE("base_unit_rem_qty"); // 着手残数量
				gL.sort(MfgReCalc_Sprt03_DtlOperR.$div_seq);
				for (MfgReCalc_Sprt03_DtlOperR gR : gL) {
					MfgReCalc_Sprt03_HdrR hdrUpR = _hdrCache.getCache(gR.hdr_peg_no());
					gR.oper_conv_qty(remR.getNumberNE("oper_conv_qty"));
					gR.oper_std_qty(remR.getNumberNE("oper_std_qty"));
					gR.oper_unit_dec_place(remR.getNumberNE("oper_unit_dec_place"));
					gR.oper_unit_conv_rnd_typ(remR.getStringNE("oper_unit_conv_rnd_typ"));
					
					if (MAC_DATA_CRUD_TYP.isDEL(hdrUpR.data_crud_typ())) {
						// 削除の場合は計算不要なので何もしない
					}
					else if (MAC_DATA_CRUD_TYP.isUPD(hdrUpR.data_crud_typ())) {
						// 更新の場合は、着手数量を変更できない仕様のため更新前の値をそのまま設定
						gR.base_unit_st_qty(gR.old_base_unit_st_qty());
						gR.oper_unit_st_qty(convQtyBaseToOper(gR.old_base_unit_st_qty(),
								gR.oper_conv_qty(), gR.oper_std_qty(),
								gR.oper_unit_dec_place(), gR.oper_unit_conv_rnd_typ()));
					}
					else {
						if (isSame(hdrUpR.base_unit_inst_qty(), instQty)) {
							// ヘッダの指図数量と工程の指図数量が同一の場合、ヘッダの着手数量を設定する
							// ※指図時に工程の数量を手修正しなければ、基本的には同じ数量が設定されている
							gR.base_unit_st_qty(hdrUpR.base_unit_st_qty());
						}
						else {
							Boolean remQtyIsZero = _remQtyIsZeroMap.get(gR.hdr_peg_no());
							if (remQty.isZero()) {
								// 着手残数がすでに０の場合は０を設定する
								gR.base_unit_st_qty(MCNumber.ZERO);
							}
							if (remQtyIsZero) {
								// 製造指図の着手数量が着手残数と一致する（着手残数がちょうど０となる）場合、残数を着手数に設定
								gR.base_unit_st_qty(remQty);
								remQty = MCNumber.ZERO;
							}
							else {
								// ヘッダの指図数量と工程の指図数量が異なる場合は、着手数/指図数で計算した比率を元に設定する
								MCNumber numerator = _numeratorMap.get(gR.hdr_peg_no());
								MCNumber denominator = _denominatorMap.get(gR.hdr_peg_no());
								gR.base_unit_st_qty(instQty.multiply(numerator).divide(
										denominator, hdrUpR.base_unit_dec_place().intValue(),
										RND_MODE));
								remQty = remQty.subtract(gR.base_unit_st_qty());
								// 残数が０未満になったら０にする
								if (remQty.isNegative()) {
									remQty = MCNumber.ZERO;
								}
							}
						}
						gR.oper_unit_st_qty(convQtyBaseToOper(gR.base_unit_st_qty(),
								gR.oper_conv_qty(), gR.oper_std_qty(),
								gR.oper_unit_dec_place(), gR.oper_unit_conv_rnd_typ()));
					}
				}
			}
		}
		
		protected void calcYieldByProdQty() {
			MCList<MfgReCalc_Sprt03_DtlYieldR> yieldByProdUpL = MCList.create(MfgReCalc_Sprt03_DtlYieldR.class);
			yieldByProdUpL.addAll(up2());
			yieldByProdUpL.addAll(up3());
			
			for (MCList<MfgReCalc_Sprt03_DtlYieldR> gL : yieldByProdUpL
					.groupList(MfgReCalc_Sprt03_DtlYieldR.$yield_schd_no)) {
				
				MSVT_YIELD_SCHD_PR_R remR = _yieldByProdRem.get(gL.get(0).yield_schd_no());
				MCNumber trdUnitSchdQty = remR.getNumberNE("trd_unit_yield_schd_qty");
				MCNumber baseUnitSchdQty = remR.getNumberNE("base_unit_yield_schd_qty");
				MCNumber trdUnitRemQty = remR.getNumberNE("trd_unit_rem_qty");
				MCNumber baseUnitRemQty = remR.getNumberNE("base_unit_rem_qty");
				
				gL.sort(MfgReCalc_Sprt03_DtlYieldR.$div_seq);
				for (MfgReCalc_Sprt03_DtlYieldR gR : gL) {
					MfgReCalc_Sprt03_HdrR hdrUpR = _hdrCache.getCache(gR.hdr_peg_no());
					gR.trd_unit_dec_place(remR.getNumberNE("trd_unit_dec_place"));
					gR.base_unit_dec_place(remR.getNumberNE("base_unit_dec_place"));

					if (MAC_DATA_CRUD_TYP.isDEL(hdrUpR.data_crud_typ())) {
						// 削除の場合は計算不要なので何もしない
					}
					else if (MAC_DATA_CRUD_TYP.isUPD(hdrUpR.data_crud_typ())) {
						// 更新の場合は、着手数量を変更できない仕様のため更新前の値をそのまま設定
						gR.trd_unit_yield_st_qty(gR.old_base_unit_st_qty());
						gR.base_unit_yield_st_qty(gR.old_base_unit_st_qty());
					}
					else {
						Boolean remQtyIsZero = _remQtyIsZeroMap.get(gR.hdr_peg_no());
						if (trdUnitRemQty.isZero() && baseUnitRemQty.isZero()) {
							// 着手残数がすでに０になっている場合は０を設定する
							gR.trd_unit_yield_st_qty(MCNumber.ZERO);
							gR.base_unit_yield_st_qty(MCNumber.ZERO);
						}
						else if (remQtyIsZero) {
							// 製造指図の着手数量が着手残数と一致する（着手残数がちょうど０となる）場合、出来高残数を着手数に設定
							gR.trd_unit_yield_st_qty(trdUnitRemQty);
							gR.base_unit_yield_st_qty(baseUnitRemQty);
							trdUnitRemQty = MCNumber.ZERO;
							baseUnitRemQty = MCNumber.ZERO;
						}
						else {
							MCNumber numerator = _numeratorMap.get(gR.hdr_peg_no());
							MCNumber denominator = _denominatorMap.get(gR.hdr_peg_no());
							gR.trd_unit_yield_st_qty(trdUnitSchdQty.multiply(numerator)
									.divide(denominator, gR.trd_unit_dec_place().intValue(),
											RND_MODE));
							gR.base_unit_yield_st_qty(baseUnitSchdQty.multiply(numerator)
									.divide(denominator, gR.base_unit_dec_place().intValue(),
											RND_MODE));
							trdUnitRemQty = trdUnitRemQty.subtract(gR.trd_unit_yield_st_qty());
							baseUnitRemQty = baseUnitRemQty.subtract(gR.base_unit_yield_st_qty());
							// 残数が0未満の場合は０にする
							if (trdUnitRemQty.isNegative()) {
								trdUnitRemQty = MCNumber.ZERO;
							}
							if (baseUnitRemQty.isNegative()) {
								baseUnitRemQty = MCNumber.ZERO;
							}
						}
					}
				}
			}
		}
		
		protected void calcInptQty() {
			for (MCList<MfgReCalc_Sprt03_DtlInptR> gL : up4()
					.groupList(MfgReCalc_Sprt03_DtlInptR.$mfg_inst_no)) {
				calcInptQtySub(gL);
			}
		}
		
		protected void calcInptQtySub(MCList<MfgReCalc_Sprt03_DtlInptR> instNoGL) {
			// ■データイメージ
			// １．ヘッダコンテナ
			// 製造指図ＮＯ   分割連番   指図数量  着手数量
			// SS001      1            10      3
			// SS001      2            10      6
			
			// ２．instNoGL
			// 同一製造指図ＮＯで分割連番違いのデータが格納されている
			// 以下、instNoGLのデータイメージ
			// 製造指図ＮＯ   分割連番   投入予定ＮＯ   再計算Ｇ   再計算連番
			// SS001      1       TY001      A       1       
			// SS001      1       TY002      A       2       
			// SS001      1       TY003      B       1       
			// SS001      1       TY004      B       1       
			// SS001      2       TY001      A       1       
			// SS001      2       TY002      A       2       
			// SS001      2       TY003      B       1       
			// SS001      2       TY004      B       1       
			
			// ３．schdMap
			// 投入予定ＮＯごとに着手残数量を保持する（本処理内で下り電文の着手数量を計算するたびに、消しこむ）。6つの数量ごとに保持する
			// 以下、データイメージ（A=親子比1:10、B=親子比1:1）
			// 投入予定ＮＯ   残数量
			// TY001         80
			// TY002         20
			// TY003          1
			// TY004          9
			
			Map<String, MCNumber> inptSchdMap = new HashMap<String, MCNumber>();
			Map<String, MCNumber> rqmtSchdMap = new HashMap<String, MCNumber>();
			Map<String, MCNumber> fxdRqmtSchdMap = new HashMap<String, MCNumber>();
			Map<String, MCNumber> contInptSchdMap = new HashMap<String, MCNumber>();
			Map<String, MCNumber> contRqmtSchdMap = new HashMap<String, MCNumber>();
			Map<String, MCNumber> contFxdRqmtSchdMap = new HashMap<String, MCNumber>();
			
			// 投入予定ＮＯでgroupByし、DBから取得した残数量を設定
			for (MfgReCalc_Sprt03_DtlInptR r : instNoGL.groupBy(MfgReCalc_Sprt03_DtlInptR.$inpt_schd_no)) {
				MSVT_INPT_SCHD_PR_R remR = _inptRem.get(r.inpt_schd_no());
				inptSchdMap.put(r.inpt_schd_no(), remR.base_unit_inpt_rem_qty());
				rqmtSchdMap.put(r.inpt_schd_no(), remR.base_unit_rqmt_rem_qty());
				fxdRqmtSchdMap.put(r.inpt_schd_no(), remR.base_unit_fxd_rqmt_rem_qty());
				contInptSchdMap.put(r.inpt_schd_no(), remR.cont_inpt_rem_qty());
				contRqmtSchdMap.put(r.inpt_schd_no(), remR.cont_rqmt_rem_qty());
				contFxdRqmtSchdMap.put(r.inpt_schd_no(), remR.cont_fxd_rqmt_rem_qty());
				
				r.base_unit_dec_place(remR.getNumberNE("base_unit_dec_place"));
				r.cont_unit_dec_place(remR.getNumberNE("cont_fctr_dec_place"));
			}
			
			// 今回削除されるヘッダに紐付く投入予定の着手数量を残数量に加算する
			for (MfgReCalc_Sprt03_DtlInptR delR : instNoGL) {
				if (MAC_DATA_CRUD_TYP.isDEL(_hdrCache.getCache(delR.hdr_peg_no()).data_crud_typ())) {
					addDelInptQty(delR.inpt_schd_no(), delR.old_base_unit_inpt_st_qty(), inptSchdMap);
					addDelInptQty(delR.inpt_schd_no(), delR.old_base_unit_rqmt_st_qty(), rqmtSchdMap);
					addDelInptQty(delR.inpt_schd_no(), delR.old_base_unit_fxd_rqmt_st_qty(), fxdRqmtSchdMap);
					addDelInptQty(delR.inpt_schd_no(), delR.old_cont_inpt_st_qty(), contInptSchdMap);
					addDelInptQty(delR.inpt_schd_no(), delR.old_cont_rqmt_st_qty(), contRqmtSchdMap);
					addDelInptQty(delR.inpt_schd_no(), delR.old_cont_fxd_rqmt_st_qty(), contFxdRqmtSchdMap);
				}
			}
			
			// 投入着手数量の設定
			for (MCList<MfgReCalc_Sprt03_DtlInptR> reCalcGL : instNoGL.groupList(
					MfgReCalc_Sprt03_DtlInptR.$recalc_grp, MfgReCalc_Sprt03_DtlInptR.$div_seq)) {
				// 同一再計算グループの場合、投入品目は同じであるため一行目の投入予定ＮＯを元に、小数部有効桁数を取得する
				MfgReCalc_Sprt03_DtlInptR tmp = reCalcGL.get(0);
				
				MfgReCalc_Sprt03_HdrR hdrUpR = _hdrCache.getCache(tmp.hdr_peg_no());
				if (MAC_DATA_CRUD_TYP.isDEL(hdrUpR.data_crud_typ())) {
					// 削除の場合は計算不要なので何もしない
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(hdrUpR.data_crud_typ())) {
					// 更新の場合は、着手数量を変更できない仕様のため更新前の値をそのまま設定
					for (MfgReCalc_Sprt03_DtlInptR r : reCalcGL) {
						r.base_unit_inpt_st_qty(r.old_base_unit_inpt_st_qty());
						r.base_unit_rqmt_st_qty(r.old_base_unit_rqmt_st_qty());
						r.base_unit_fxd_rqmt_st_qty(r.old_base_unit_fxd_rqmt_st_qty());
						r.cont_inpt_st_qty(r.old_cont_inpt_st_qty());
						r.cont_rqmt_st_qty(r.old_cont_rqmt_st_qty());
						r.cont_fxd_rqmt_st_qty(r.old_cont_fxd_rqmt_st_qty());
					}
				}
				else {
					MSVT_INPT_SCHD_PR_R remR = _inptRem.get(tmp.inpt_schd_no());
					int bDecPlace = remR.getNumberNE("base_unit_dec_place").intValue();
					int cDecPlace = nvl(remR.getNumberNE("cont_fctr_dec_place"),MCNumber.ZERO).intValue();
					
					// 再計算グループ単位に投入予定数量を合計した値を返す
					MCNumber inptRecalcSchdQty = getRecalcSchdQty(reCalcGL, BASE_UNIT_INPT_SCHD_QTY_COL_NM);
					MCNumber rqmtRecalcSchdQty = getRecalcSchdQty(reCalcGL, BASE_UNIT_RQMT_SCHD_QTY_COL_NM);
					MCNumber fxdRecalcSchdQty = getRecalcSchdQty(reCalcGL, BASE_UNIT_FXD_RQMT_SCHD_QTY_COL_NM);
					MCNumber contInptRecalcSchdQty = getRecalcSchdQty(reCalcGL, CONT_INPT_SCHD_QTY_COL_NM);
					MCNumber contRqmtRecalcSchdQty = getRecalcSchdQty(reCalcGL, CONT_RQMT_SCHD_QTY_COL_NM);
					MCNumber contFxdRqmtRecalcSchdQTy = getRecalcSchdQty(reCalcGL, CONT_FXD_RQMT_SCHD_QTY_COL_NM);
					
					for (MCList<MfgReCalc_Sprt03_DtlInptR> divSeqGL : reCalcGL
							.groupList(MfgReCalc_Sprt03_DtlInptR.$div_seq)) {
						// 再計算Ｇでソート（再計算Ｇが若い順に消化していくため）
						divSeqGL.sort(MfgReCalc_Sprt03_DtlInptR.$recalc_grp_seq);
						
						MfgReCalc_Sprt03_DtlInptR divSeqG0 = divSeqGL.get(0);
						// 再計算グループ単位の残数× 製造着手数 / 製造指図数
						MCNumber numerator = _numeratorMap.get(divSeqG0.hdr_peg_no());
						MCNumber denominator = _denominatorMap.get(divSeqG0.hdr_peg_no());

						MCNumber inptRecalcStQty = inptRecalcSchdQty.multiply(numerator).divide(denominator, bDecPlace, RND_MODE);
						MCNumber rqmtRecalcStQty = rqmtRecalcSchdQty.multiply(numerator).divide(denominator, bDecPlace, RND_MODE);
						MCNumber fxdRecalcStQty = fxdRecalcSchdQty.multiply(numerator).divide(denominator, bDecPlace, RND_MODE);
						MCNumber contInptRecalcStQty = null;
						if (!isNull(contInptRecalcSchdQty)) {
							contInptRecalcStQty = contInptRecalcSchdQty.multiply(numerator).divide(denominator, cDecPlace, RND_MODE);
						}
						MCNumber contRqmtRecalcStQty = null;
						if (!isNull(contRqmtRecalcSchdQty)) {
							contRqmtRecalcStQty = contRqmtRecalcSchdQty.multiply(numerator).divide(denominator, cDecPlace, RND_MODE);
						}
						MCNumber contFxdRqmtRecalcStQTy = null;
						if (!isNull(contFxdRqmtRecalcSchdQTy)) {
							contFxdRqmtRecalcStQTy = contFxdRqmtRecalcSchdQTy.multiply(numerator).divide(denominator, cDecPlace, RND_MODE);
						}

						// 再計算グループ単位で最後の投入予定NO（着手数が指図数を超過した場合は、この投入予定NOの数量を増やす）
						String lastInptSchdNo = divSeqGL.get(divSeqGL.size()-1).inpt_schd_no();
						
						// 製造実績一覧で工程モードで工程を行コピーした場合に、同一投入予定NOの行が上り電文に設定される場合があるため
						// 投入予定ＮＯでgroupListして処理する
						for (MCList<MfgReCalc_Sprt03_DtlInptR> schdNoGL : getSchdNoGL(divSeqGL)) {
							String inptSchdNo = schdNoGL.get(0).inpt_schd_no();
							// 予定ＮＯ毎の残数量を取得
							MCNumber inptSchdRemQty = inptSchdMap.get(inptSchdNo);
							MCNumber rqmtSchdRemQty = rqmtSchdMap.get(inptSchdNo);
							MCNumber fxdRqmtSchdRemQty = fxdRqmtSchdMap.get(inptSchdNo);
							MCNumber contInptSchdRemQty = contInptSchdMap.get(inptSchdNo);
							MCNumber contRqmtSchdRemQty = contRqmtSchdMap.get(inptSchdNo);
							MCNumber contFxdRqmtSchdRemQty = contFxdRqmtSchdMap.get(inptSchdNo);
							
							boolean isLast = false; // 再計算グループ単位で一番最後の行か否か
							if (isSame(lastInptSchdNo, inptSchdNo)) {
								isLast = true;
							}
							
							// 投入数量・必要数量は、一番最後の行であれば予定数の超過を許す。固定必要数量は超過を許さない
							MCNumber inptSchdStQty = getInptStQty(inptRecalcStQty, inptSchdRemQty, isLast);
							MCNumber rqmtSchdStQty = getInptStQty(rqmtRecalcStQty, rqmtSchdRemQty, isLast);
							MCNumber fxdRqmtSchdStQty = getInptStQty(fxdRecalcStQty, fxdRqmtSchdRemQty, false);
							MCNumber contInptSchdStQty = getInptStQty(contInptRecalcStQty, contInptSchdRemQty, isLast);
							MCNumber contRqmtSchdStQty = getInptStQty(contRqmtRecalcStQty, contRqmtSchdRemQty, isLast);
							MCNumber contFxdRqmtSchdStQty = getInptStQty(contFxdRqmtRecalcStQTy, contFxdRqmtSchdRemQty, false);

							for (MfgReCalc_Sprt03_DtlInptR r : schdNoGL) {
								r.base_unit_inpt_st_qty(inptSchdStQty);
								r.base_unit_rqmt_st_qty(rqmtSchdStQty);
								r.base_unit_fxd_rqmt_st_qty(fxdRqmtSchdStQty);
								r.cont_inpt_st_qty(contInptSchdStQty);
								r.cont_rqmt_st_qty(contRqmtSchdStQty);
								r.cont_fxd_rqmt_st_qty(contFxdRqmtSchdStQty);
							}
							
							// 予定ＮＯ毎の残数量及び再計算グループ毎の着手数量を、上記で求めた着手数量で消しこむ
							if (inptSchdStQty.gt(0)) {
								inptRecalcStQty = inptRecalcStQty.subtract(inptSchdStQty);
								inptSchdMap.replace(inptSchdNo, inptSchdRemQty.subtract(inptSchdStQty));
							}
							if (rqmtSchdStQty.gt(0)) {
								rqmtRecalcStQty = rqmtRecalcStQty.subtract(rqmtSchdStQty);
								rqmtSchdMap.replace(inptSchdNo, rqmtSchdRemQty.subtract(rqmtSchdStQty));
							}
							if (fxdRqmtSchdStQty.gt(0)) { 
								fxdRecalcStQty = fxdRecalcStQty.subtract(fxdRqmtSchdStQty);
								fxdRqmtSchdMap.replace(inptSchdNo, fxdRqmtSchdRemQty.subtract(fxdRqmtSchdStQty));
							}
							if (!isNull(contInptSchdStQty) && contInptSchdStQty.gt(0)) {
								contInptRecalcStQty = contInptRecalcStQty.subtract(contInptSchdStQty);
								contInptSchdMap.replace(inptSchdNo, contInptSchdRemQty.subtract(contInptSchdStQty));
							}
							if (!isNull(contRqmtSchdStQty) && contRqmtSchdStQty.gt(0)) {
								contRqmtRecalcStQty = contRqmtRecalcStQty.subtract(contRqmtSchdStQty);
								contRqmtSchdMap.replace(inptSchdNo, contRqmtSchdRemQty.subtract(contRqmtSchdStQty));
							}
							if (!isNull(contFxdRqmtSchdStQty) && contFxdRqmtSchdStQty.gt(0)) {
								contFxdRqmtRecalcStQTy = contFxdRqmtRecalcStQTy.subtract(contFxdRqmtSchdStQty);
								contFxdRqmtSchdMap.replace(inptSchdNo, contFxdRqmtSchdRemQty.subtract(contFxdRqmtSchdStQty));
							}
						}
					}
				}
			}
		}
		
		/**
		 * 元のソート順（再計算グループ連番の昇順）を維持したまま投入予定ＮＯでgroupListする
		 * @return
		 */
		protected List<MCList<MfgReCalc_Sprt03_DtlInptR>> getSchdNoGL(MCList<MfgReCalc_Sprt03_DtlInptR> divSeqGL) {
			List<MCList<MfgReCalc_Sprt03_DtlInptR>> ret = new ArrayList<MCList<MfgReCalc_Sprt03_DtlInptR>>();
			
			// 元のリストは再計算グループ連番でソートされている前提。
			// 投入予定ＮＯが同じ場合は、必ず再計算グループ連番も同じであるため、再計算グループ連番でソートされている以上、
			// 投入予定ＮＯでもソートされているとみなすことができる
			String nextNo = null;
			MCList<MfgReCalc_Sprt03_DtlInptR> tmp = MCList.create(MfgReCalc_Sprt03_DtlInptR.class);
			for (int i = 0; i < divSeqGL.size(); i++) {
				MfgReCalc_Sprt03_DtlInptR currR = divSeqGL.get(i);
				
				tmp.add(currR);
				if (i == divSeqGL.size()-1) {
					// 最後の行の場合
					ret.add(tmp);
				}
				else {
					// 最後の行以外の場合
					nextNo = divSeqGL.get(i+1).inpt_schd_no();
					if (!isSame(currR.inpt_schd_no(), nextNo)) {
						MCList<MfgReCalc_Sprt03_DtlInptR> l = MCList.create(MfgReCalc_Sprt03_DtlInptR.class);
						l.setAll(tmp);
						ret.add(l);
		
						tmp.clear();
					}
				}
			}
			
			return ret;
		}
		
		/**
		 * 残数量に削除数量を加算する
		 */
		protected void addDelInptQty(String inptSchdNo, MCNumber delQty, Map<String, MCNumber> schdMap) {
			MCNumber tmp = schdMap.get(inptSchdNo);
			if (isNull(tmp)) {
				return;
			}
			MCNumber remQty = tmp.add(delQty);
			schdMap.replace(inptSchdNo, remQty);
		}
		
		/**
		 * 再計算グループ単位に投入予定数量を合計した値を返す
		 */
		protected MCNumber getRecalcSchdQty(MCList<MfgReCalc_Sprt03_DtlInptR> recalcGL, String qtyColNm) {
			MCNumber ret = MCNumber.ZERO;
			for (MfgReCalc_Sprt03_DtlInptR gR : recalcGL
					.groupBy(MfgReCalc_Sprt03_DtlInptR.$inpt_schd_no)) {
				MSVT_INPT_SCHD_PR_R remR = _inptRem.get(gR.inpt_schd_no());
				ret = ret.add(nvl(remR.getNumber(qtyColNm), MCNumber.ZERO));
			}
			return ret;
		}
		
		/**
		 * 下り電文として返すための着手数量を取得する
		 */
		protected MCNumber getInptStQty(MCNumber recalcStQty, MCNumber schdRemQty, boolean permitExcced) {
			if (isNullOr(recalcStQty, schdRemQty)) {
				return null;
			}
			if (recalcStQty.gt(schdRemQty) && !permitExcced) {
				return schdRemQty;
			}
			else {
				return recalcStQty;
			}
		}
		
		// 工数
		protected void calcWkCost() {
			for (MCList<MfgReCalc_Sprt03_DtlWkR> gL : up5()
					.groupList(MfgReCalc_Sprt03_DtlWkR.$wk_schd_no)) {
				MSVT_WK_SCHD_PR_R remR = _wkRem.get(gL.get(0).wk_schd_no());
				MCNumber schdWkCost = remR.getNumberNE("schd_wk_cost");
				MCNumber schdFxdWkCost = remR.getNumberNE("schd_fxd_wk_cost");
				gL.sort(MfgReCalc_Sprt03_DtlWkR.$div_seq);
				for (MfgReCalc_Sprt03_DtlWkR gR : gL) {
					MfgReCalc_Sprt03_HdrR hdrUpR = _hdrCache.getCache(gR.hdr_peg_no());
					gR.dec_place(remR.getNumberNE("dec_place"));

					if (MAC_DATA_CRUD_TYP.isDEL(hdrUpR.data_crud_typ())) {
						// 削除の場合は計算不要なので何もしない
					}
					else if (MAC_DATA_CRUD_TYP.isUPD(hdrUpR.data_crud_typ())) {
						// 更新の場合は、着手数量を変更できない仕様のため更新前の値をそのまま設定
						gR.st_wk_cost(gR.old_st_wk_cost());
						gR.st_fxd_wk_cost(gR.old_st_fxd_wk_cost());
					}
					else {
						MCNumber numerator = _numeratorMap.get(gR.hdr_peg_no());
						MCNumber denominator = _denominatorMap.get(gR.hdr_peg_no());

						// 数量依存
						gR.st_wk_cost(schdWkCost.multiply(numerator).divide(denominator,
								gR.dec_place().intValue(), RND_MODE));
						// 固定
						gR.st_fxd_wk_cost(schdFxdWkCost.multiply(numerator).divide(
								denominator, gR.dec_place().intValue(), RND_MODE));
					}
				}
			}
		}
		
		protected void setDown() {
			down0().addAll(up1());
			down1().addAll(up2());
			down2().addAll(up3());
			for (MfgReCalc_Sprt03_DtlInptR inptR : up4()) {
				if (isSame(inptR.base_unit_inpt_st_qty(), MCNumber.ZERO)) {
					inptR.base_unit_inpt_st_qty(null);
				}
				if (isSame(inptR.base_unit_rqmt_st_qty(), MCNumber.ZERO)) {
					inptR.base_unit_rqmt_st_qty(null);
				}
				if (isSame(inptR.base_unit_fxd_rqmt_st_qty(), MCNumber.ZERO)) {
					inptR.base_unit_fxd_rqmt_st_qty(null);
				}
				if (isSame(inptR.cont_inpt_st_qty(), MCNumber.ZERO)) {
					inptR.cont_inpt_st_qty(null);
				}
				if (isSame(inptR.cont_rqmt_st_qty(), MCNumber.ZERO)) {
					inptR.cont_rqmt_st_qty(null);
				}
				if (isSame(inptR.cont_fxd_rqmt_st_qty(), MCNumber.ZERO)) {
					inptR.cont_fxd_rqmt_st_qty(null);
				}
				down3().add(inptR);
			}
			for (MfgReCalc_Sprt03_DtlWkR wkR : up5()) {
				wkR.st_sum_wk_cost(nvl(wkR.st_wk_cost(), MCNumber.ZERO).add(nvl(wkR.st_fxd_wk_cost(), MCNumber.ZERO)));
				down4().add(wkR);
			}
		}
	}

	//FMCB CUSTOM END
}