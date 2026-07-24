package mcframe.serverMGBE.MGBEL0050;

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
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.serverMGUC.MGUCL0020.MGUCL_AppSys.*;
import mcframe.commonMG.constant.*;
import mcframe.serverMG.dbc.*;
import static mcframe.commonMG.notice.MG_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.serverMGBE.MGBEL0050.Query.*;
import java.util.ArrayList;
import java.util.Map;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBEL_StdSlsUpriSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBEL_StdSlsUpriSrch_MC extends MGBEL_StdSlsUpriSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 標準販売単価を検索する。<br>
	 */
	public class Srch01 extends MGBEL_StdSlsUpriSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			editUp();
			srch();
		}
		
		protected void editUp() {
			up0().addStringColumn("no_dpt_flg_str", toTrueStr(up0().no_dpt_flg()));
			up0().addStringColumn("no_cst_flg_str", toTrueStr(up0().no_cst_flg()));
			up0().addStringColumn("no_dlv_flg_str", toTrueStr(up0().no_dlv_flg()));
			up0().addStringColumn("no_dest1_flg_str", toTrueStr(up0().no_dest1_flg()));
			up0().addStringColumn("no_dest2_flg_str", toTrueStr(up0().no_dest2_flg()));
			up0().addStringColumn("no_dest3_flg_str", toTrueStr(up0().no_dest3_flg()));
		}
		
		protected void srch() {
			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBEL0050_MGT_STD_TOP_S01(), up0());
			
			if (down0().isEmpty()) {
				return;
			}
			
			MCList<Srch01_QtyR> list = MCList.create(Srch01_QtyR.class);
			executeQuery(list, MGBEL0050_MGT_STD_TOP_S02(), up0());
			
			afterSrch(list);
		}
		
		protected void afterSrch(MCList<Srch01_QtyR> list) {
			calcGrpByItmCd(list);
			calcAll();
		}
		
		protected void calcGrpByItmCd(MCList<Srch01_QtyR> list) {
			// 数量取得用のキー、インデックス設定
			String[] keys = getKeys();
			Comparable<?>[] binds = new Comparable<?>[keys.length];
			MCIndexKey idx = list.createIndex(keys);
			for (Srch01_RsltR r : down0()) {
				// 数量の設定
				for (int i = 0; i < keys.length; i++) {
					binds[i] = r.getValue(keys[i]);
				}
				Srch01_QtyR sumR = list.getFirst(idx, binds);
				if (sumR == null) {
					r.qty(0);
					r.sls_upri(0);
				}
				else {
					r.qty(sumR.qty());
					r.sls_upri(sumR.sls_amt());
				}
				
				// １単位基準を計算する
				r.qty_unit(1);
				r.sls_upri_unit(calcUnit(r.sls_upri(), r.qty(), Srch01_RsltR.sls_upri_unit_META.scale()));
				r.ttl_unit(calcUnit(r.ttl(), r.qty(), Srch01_RsltR.ttl_unit_META.scale()));
				r.var_cost_unit(calcUnit(r.var_cost(), r.qty(),
						Srch01_RsltR.var_cost_unit_META.scale()));
				r.fxd_cost_unit(calcUnit(r.fxd_cost(), r.qty(),
						Srch01_RsltR.fxd_cost_unit_META.scale()));
				r.sls_cost_unit(calcUnit(r.sls_cost(), r.qty(), Srch01_RsltR.sls_cost_unit_META.scale()));
				r.sga_unit(calcUnit(r.sga(), r.qty(), Srch01_RsltR.sga_unit_META.scale()));
			}
		}
		
		protected MCNumber calcUnit(MCNumber amt, MCNumber qty, int scale) {
			MCNumber unit = null;
			
			if (MCNumber.ZERO.eq(qty)) {
				unit = MCNumber.ZERO;
			}
			else {
				if (!isNull(amt)) {
					unit = amt.divide(qty, scale, MAC_RND_TYP.RNDOFF.toMC());
				}
			}
			return unit;
		}
		
		protected static final String DYNAMIC_KEY = "COL_SQL";
		protected static final String DYNAMIC_FLG = "FLG_COL";
		
		protected String[] getKeys() {
			Srch01_QtyR r = Srch01_QtyR.create();
			Map<String, String> keyMap = r.getExtMap(DYNAMIC_KEY);
			Map<String, String> flgMap = r.getExtMap(DYNAMIC_FLG);
			ArrayList<String> keys = new ArrayList<String>();
			
			for (String key : keyMap.keySet()) {
				String flg = flgMap.get(key);
				if (isNull(flg) || up0().getBooleanNE(flg)) {
					keys.add(key);
				}
			}
			String[] array = (String[]) keys.toArray(new String[0]);

			return array;
		}
		
		protected void calcAll() {
			for (Srch01_RsltR r : down0()) {
				r.prf(r.sls_upri().subtract(r.ttl()));
				r.sls_prf(r.sls_upri().subtract(r.sls_cost()));
				r.lmt_prf(r.sls_upri().subtract(r.var_cost()));
				
				if (!r.sls_upri().isZero()) {
					if (!r.prf().isZero()) {
						r.prf_per(calcRate(r.sls_upri(), r.prf()));
					}
					if (!r.sls_prf().isZero()) {
						r.sls_prf_per(calcRate(r.sls_upri(), r.sls_prf()));
					}
					if (!r.lmt_prf().isZero()) {
						r.lmt_prf_per(calcRate(r.sls_upri(), r.lmt_prf()));
					}
				}
				
				if (isNull(r.prf_per())) {
					r.prf_per(MCNumber.ZERO);
				}
				if (isNull(r.sls_prf_per())) {
					r.sls_prf_per(MCNumber.ZERO);
				}
				if (isNull(r.lmt_prf_per())) {
					r.lmt_prf_per(MCNumber.ZERO);
				}
				
				r.prf_unit(calcUnit(r.prf(), r.qty(), Srch01_RsltR.prf_unit_META.scale()));
				r.sls_prf_unit(calcUnit(r.sls_prf(), r.qty(), Srch01_RsltR.sls_prf_unit_META.scale()));
				r.lmt_prf_unit(calcUnit(r.lmt_prf(), r.qty(), Srch01_RsltR.lmt_prf_unit_META.scale()));
			}
		}
	}
	
	@Override
	protected String[] getSumTgtCols() {
		String[] stringArray = {
			"T.std_cost", null
		};
		
		return stringArray;
	}

	@Override
	protected ArrayList<String> getValidExpnsTyp() {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add(MAC_EXPNS_TYP.PROD.value());
		list.add(MAC_EXPNS_TYP.SGA.value());
		
		return list;
	}

	//FMCB CUSTOM END
}