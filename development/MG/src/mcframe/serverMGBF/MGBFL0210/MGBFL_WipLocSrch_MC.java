package mcframe.serverMGBF.MGBFL0210;

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
import mcframe.serverMGBF.MGBFL0210.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBF.MGBFL0210.Query.*;
import static mcframe.commonCore.lang.MCStringUtil.arrayValueSplit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_WipLocSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_WipLocSrch_MC extends MGBFL_WipLocSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 場所別に製造原価の検索を行います。<br>
	 */
	public class Srch01 extends MGBFL_WipLocSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			srch();
		}

		protected void srch() {
			executeQuery(down0(), MGBFL0210_MGT_WIP_LOC_S01(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			if (!down0().isEmpty()) {
				ArrayList<String> keyList = getDispIndexKeys(down0(), up0());
				keyList.remove(Srch01_RsltR.$expns_cd);
				MCList<Srch01_RsltR> newDownL = editDown(down0(), keyList);
				down0().setAll(newDownL);
			}
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 部門別に製造原価の検索を行います。<br>
	 */
	public class Srch02 extends MGBFL_WipLocSrch_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editUp();
			callProc();
			srch();
		}

		protected void editUp() {
			MGT_ARG_R dbc = MGT_ARG_R.create();
			MGT_ARG_R t = MGT_ARG_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setWhere(t.calc_grp_cd.eq(bind("1")), up0().calc_grp_cd());
			dbc_bldr.addWhereWithAnd(t.calc_no.eq(bind("1")), arrayValueSplit(up0().calc_no())[0]);
			dbSelect("MGBFL0210_MGT_ARG_S01", dbc, dbc_bldr);
			up0().setDateNE("term", dbc.term());
		}

		protected void callProc() {
			String procId = "MAPA_DPT_LOC$P_SET_DPT_LVL_LOC";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null, ":term, :dpt_lvl_cd");
		}

		protected void srch() {
			executeQuery(down0(), MGBFL0210_MGT_WIP_LOC_S02(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			if (!down0().isEmpty()) {
				ArrayList<String> keyList = new ArrayList<String>();
				keyList.add(Srch01_RsltR.$ym);
				keyList.add(Srch01_RsltR.$wg_cd);
				keyList.add(Srch01_RsltR.$wg_nm);
				keyList.add(Srch01_RsltR.$mng_dpt_cd);
				keyList.add(Srch01_RsltR.$mng_dpt_nm);
				MCList<Srch01_RsltR> newDownL = editDown(down0(), keyList);
				down0().setAll(newDownL);
			}
		}
	}

	//////////////////////////////////////////////////////////////////////
	// Srch01/Srch02 Common
	protected MCList<Srch01_RsltR> editDown(MCList<Srch01_RsltR> downL, ArrayList<String> keyList) {
		String[] keys = (String[]) keyList.toArray(new String[0]);
		MCList<Srch01_RsltR> newL = downL.createInstance();
		setPegNo(downL);

		String[] items = getItemArray();

		for (MCList<Srch01_RsltR> l : downL.groupList(keys)) {
			MCNumber sortNo = (MCNumber) l.min(Srch01_RsltR.$peg_no);

			// tmpL準備
			MCList<Srch01_RsltR> tmpL = MCList.create(Srch01_RsltR.class);
			for (int i = 0; i < items.length; i++) {
				Srch01_RsltR r = l.get(0).clone();
				r.peg_no(sortNo);
				r.key(items[i]);
				tmpL.add(r);
			}
			// 検索結果をtmpLに加算（縦横変換）
			for (Srch01_RsltR r : l) {
				String col = getExpnsCol(r.expns_cd());
				if (!isNull(col)) {
					for (int i = 0; i < items.length; i++) {
						Srch01_RsltR tmpR = tmpL.get(i);
						MCNumber n = r.getNumber(items[i]);
						if (!isNull(n)) {
							tmpR.setNumber(col, sum(n, tmpR.getNumber(col)));
						}
					}
				}
			}
			editTmpL(tmpL);
			newL.addAll(tmpL);
		}
		newL.sort(Srch01_RsltR.$peg_no);
		setLabel(newL);
		return newL;
	}
	protected String[] getItemArray() {
		return new String[] { Srch01_RsltR.$st_wip_amt, Srch01_RsltR.$prod_amt, Srch01_RsltR.$inpt_amt,
				Srch01_RsltR.$comp_amt, Srch01_RsltR.$end_wip_amt };
	}
	protected String getExpnsCol(String expnsCd) {
		for (Map.Entry<String, String> e : getExpnsColMap().entrySet()) {
			if (isSame(e.getValue(), expnsCd)) {
				return e.getKey();
			}
		}
		return null;
	}
	protected void editTmpL(MCList<Srch01_RsltR> tmpL) {
		for (Srch01_RsltR r : tmpL) {
			doSum(r, Srch01_RsltR.$ttl, Srch01_RsltR.$var_cost, Srch01_RsltR.$fxd_cost);
		}
	}
	protected void doSum(MCRow r, String ttlCol, String varCol, String fxdCol) {
		MCNumber ttl = MCNumber.ZERO;
		MCNumber var = MCNumber.ZERO;
		MCNumber fxd = MCNumber.ZERO;
		for(Map.Entry<String, List<String>> e : getExpnsGMap().entrySet()) {
			MCNumber sum = MCNumber.ZERO;
			for (String col : e.getValue()) {
				MCNumber n = r.getNumber(col);
				sum = sum(sum, n);

				if (isVarCost(getExpnsColMap().get(col))) {
					var = sum(var, n);
				}
				else {
					fxd = sum(fxd, n);
				}
			}
			r.setNumber(e.getKey(), sum);
			ttl = sum(ttl, sum);
		}
		if (!isNull(ttlCol)) {
			r.setNumber(ttlCol, ttl);
		}
		if (!isNull(varCol)) {
			r.setNumber(varCol, var);
		}
		if (!isNull(fxdCol)) {
			r.setNumber(fxdCol, fxd);
		}
	}
	protected boolean isVarCost(String expnsCd) {
		for (MAM_EXPNS_R r : getExpns()) {
			if (isSame(r.expns_cd(), expnsCd)) {
				return MAC_VAR_TYP.isVAR(r.var_typ());
			}
		}
		return false;
	}
	protected void setLabel(MCList<Srch01_RsltR> downL) {
		for (Srch01_RsltR r : downL) {
			r.label(getDispString(r.key().toUpperCase()));
		}
	}


	// -----------------------------------------------
	// DynamicSql
	@Override
	protected ArrayList<String> getValidExpnsTyp() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(MAC_EXPNS_TYP.PROD.value());
		return list;
	}

	//FMCB CUSTOM END
}