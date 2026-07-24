package mcframe.serverMGBE.MGBEL0030;

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static mcframe.serverMGBE.MGBEL0030.Query.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBEL_StdBreakdownSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBEL_StdBreakdownSrch_MC extends MGBEL_StdBreakdownSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 標準単価の内訳を検索します。<br>
	 */
	public class Srch01 extends MGBEL_StdBreakdownSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			String defWgCd = getSysParm("DEF_WG_CD");
			if (!isNullOrNullVal(defWgCd)) {
				up0().wg_cd(defWgCd);
			}

			callProc();
			srch();
		}

		protected void callProc() {
			String procId = "MGPA_STD_INPT$P_MAIN";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null,
					":calc_grp_cd, :calc_no, :wg_cd, :itm_cd, :itm_sub1, :itm_sub2, :itm_sub3, :loc_cd, :sppl_cd");
		}

		protected void srch() {
			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBEL0030_MGW_STD_INPT_S01(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			setExtno();
			setSumRow();
		}

		protected void setExtno() {
			if (0 == down0().size()) {
				return;
			}
			Map<MCNumber, MCNumber> ext_map = new HashMap<MCNumber, MCNumber>();
			MCNumber num = MCNumber.ONE;
			MCNumber curr_lvl;
			Srch01_RsltR tmpRow = null;

			for (Srch01_RsltR r : down0()) {
				if (isNull(tmpRow) || r.hrrchy().neq(tmpRow.hrrchy()) || !isSameItm(r, tmpRow) || !isSameString(r, tmpRow, MAM_WG_R.$wg_cd)) {
					curr_lvl = r.hrrchy();

					// ひとつ上のLEVELのext_noをpar_extnoに設定
					r.par_extno(ext_map.get(curr_lvl.subtract(1)));
					r.extno(num);
					ext_map.put(curr_lvl, num);
					num = num.add(1);
				}
				tmpRow = r;
			}
		}

		protected boolean isSameItm(MCRow r1, MCRow r2) {
			return isSameString(r1, r2, MAM_ITM_R.$itm_cd, MAM_ITM_R.$itm_sub1, MAM_ITM_R.$itm_sub2,
					MAM_ITM_R.$itm_sub3);
		}

		protected boolean isSameString(MCRow r1, MCRow r2, String... cols) {
			for (String col : cols) {
				if (!isSame(r1.getString(col), r2.getString(col))) {
					return false;
				}
			}
			return true;
		}

		protected void setSumRow() {
			if (down0().isEmpty()) {
				return ;
			}
			MCGroupByPolicy policy = new MCGroupByPolicy();
			String[] sumColNames = getSumCols();
			policy.sum(sumColNames);
			Srch01_RsltR sumRow = down0().groupBy(policy).get(0);
			Srch01_RsltR lv0Row = down0().get(0);
			if (!isNull(lv0Row)) {
				sumRow.the_qty(lv0Row.the_qty());
				sumRow.std_qty(lv0Row.std_qty());
				sumRow.unit_cd(lv0Row.unit_cd());
				sumRow.unit_nm(lv0Row.unit_nm());
				sumRow.dec_place(lv0Row.dec_place());
			}
			for (String nm : sumColNames) {
				if (isNull(sumRow.getValueNE(nm))) {
					sumRow.setValue(nm, MCNumber.ZERO);
				}
			}
			sumRow.extno(-10);

			// 単価・構成比
			for (Srch01_RsltR r : down0()) {
				calcUnitAndRate(r, sumRow);
			}
			calcUnitAndRate(sumRow, sumRow);

			Srch01_RsltR xpnsRateRow = Srch01_RsltR.create();
			xpnsRateRow.extno(-20);

			// 費目構成比
			calcXpnsRate(xpnsRateRow, sumRow);
			// 1行目に費目構成比行
			down0().add(0, xpnsRateRow);
			// 2行目に合計行
			down0().add(1, sumRow);
		}
		protected <R extends MCRow> String[] getSumCols() {
			List<String> sumColL = new ArrayList<String>();
			sumColL.addAll(getExpnsAllColNames());
			for (String col : new String[] { Srch01_RsltR.$ttl, Srch01_RsltR.$var_cost, Srch01_RsltR.$fxd_cost,
					Srch01_RsltR.$the_cost }) {
					sumColL.add(col);
			}
			return sumColL.toArray(new String[]{});
		}

		protected void calcUnitAndRate(Srch01_RsltR row, Srch01_RsltR sumRow) {
			row.std_upri(calcUnit(row.ttl(), row.std_qty(), 16));

			if (isNull(row.the_cost())) {
				row.the_cost(0);
			}
			row.the_upri(calcUnit(row.the_cost(), row.the_qty(), 16));

			row.rate(calcRate(sumRow.ttl(), row.ttl(), 16));
		}
		protected void calcXpnsRate(Srch01_RsltR rateRow, Srch01_RsltR sumRow) {
			rateRow.ttl(sumRow.rate());
			MCNumber ttl = sumRow.ttl();
			if (isNull(ttl) || ttl.isZero()) {
				return;
			}

			rateRow.var_cost(calcRate(ttl, sumRow.var_cost(), 16));
			rateRow.fxd_cost(calcRate(ttl, sumRow.fxd_cost(), 16));

			for (String col : getExpnsAllColNames()) {
				MCNumber amt = sumRow.getNumber(col);
				if (!isNull(amt) && !amt.isZero()) {
					rateRow.setNumber(col,
							calcRate(ttl, amt, 16));
				}
			}
		}
	}

	@Override
	protected ArrayList<String> getValidExpnsTyp() {
		ArrayList<String> list = new ArrayList<String>();

		list.add(MAC_EXPNS_TYP.PROD.value());

		return list;
	}

	protected String[] getSumTgtCols() {
		String[] stringArray = {
			"T.std_cost"
		};
		return stringArray;
	}

	//FMCB CUSTOM END
}