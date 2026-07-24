package mcframe.serverMGBE.MGBEL0040;

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
import mcframe.serverMGBE.MGBEL0040.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBE.MGBEL0040.Query.*;
import java.util.ArrayList;
import java.util.List;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBEL_StdUpriDtlSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBEL_StdUpriDtlSrch_MC extends MGBEL_StdUpriDtlSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 自工程の標準単価工程情報を検索する。<br>
	 */
	public class Srch01 extends MGBEL_StdUpriDtlSrch_MC_A.Srch01 {
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

			srchDtl(up0(), down1());
			srchHdr(up0(), down0());
		}
		
		protected void srchDtl(Srch01_CndR up, MCList<Srch01_DtlR> downL) {
			executeQuery(downL, MGBEL0040_MGT_STD_ITM_OPER_S01(), up);
		}
		
		protected void srchHdr(Srch01_CndR up, Srch01_HdrR down) {
			if (!down1().isEmpty()) {
				srchCommHdr(up, down);
			}
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 自工程の標準単価構成・工数情報を検索する。<br>
	 */
	public class Srch02 extends MGBEL_StdUpriDtlSrch_MC_A.Srch02 {
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
			for (Srch01_DtlR up : up0()) {
				down0().addAll(srchRslt1(up));
				down1().addAll(srchRslt2(up));
			}
			
			if (down0().isEmpty() && down1().isEmpty()) {
				return;
			}
			
			afterSrch();
		}
		
		protected MCList<Srch02_Rslt1R> srchRslt1(Srch01_DtlR up) {
			MCList<Srch02_Rslt1R> inpt = MCList.create(Srch02_Rslt1R.class);
			
			if (isNull(up.inpt_rec_no())) {
				return inpt;
			}
			
			addDynamicBind(up, inpt);
			executeQuery(inpt, MGBEL0040_MGT_STD_INPT_S01(), up);
			
			return inpt;
		}
		
		protected MCList<Srch02_Rslt2R> srchRslt2(Srch01_DtlR up) {
			MCList<Srch02_Rslt2R> wk = MCList.create(Srch02_Rslt2R.class);
			
			addDynamicBind(up, wk);
			executeQuery(wk, MGBEL0040_MGT_STD_WK_S01(), up);
			
			return wk;
		}
		
		protected void afterSrch() {
			calcUpriRslt1(down0());
			calcUpriRslt2(down1());
			addSumRow(down0(), down1());
		}
	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * 全工程の標準単価構成・工数を検索する。<br>
	 */
	public class Srch03 extends MGBEL_StdUpriDtlSrch_MC_A.Srch03 {
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

			srchDtl(up0(), down1());
			srchHdr(up0(), down0());
		}
		
		protected void srchDtl(Srch01_CndR up, MCList<Srch01_DtlR> downL) {
			executeQuery(downL, MGBEL0040_MGT_STD_TOP_S02(), up);
		}
		
		protected void srchHdr(Srch01_CndR up, Srch01_HdrR down) {
			if (!down1().isEmpty()) {
				srchCommHdr(up, down);
			}
		}
	}
	/**
	 * Srch04オペレーション.<p>
	 *
	 * 全工程の標準単価構成・工数を検索する。<br>
	 */
	public class Srch04 extends MGBEL_StdUpriDtlSrch_MC_A.Srch04 {
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
			for (Srch01_DtlR up : up0()) {
				down0().addAll(srchInpt(up));
				down1().addAll(srchWk(up));
			}
			
			if (down0().isEmpty() && down1().isEmpty()) {
				return;
			}
			
			afterSrch();
		}
		
		protected MCList<Srch02_Rslt1R> srchInpt(Srch01_DtlR up) {
			MCList<Srch02_Rslt1R> inpt = MCList.create(Srch02_Rslt1R.class);
			
			addDynamicBind(up, inpt);
			executeQuery(inpt, MGBEL0040_MGT_STD_INPT_S02(), up);
			
			return inpt;
		}
		
		protected MCList<Srch02_Rslt2R> srchWk(Srch01_DtlR up) {
			MCList<Srch02_Rslt2R> wk = MCList.create(Srch02_Rslt2R.class);
			
			addDynamicBind(up, wk);
			executeQuery(wk, MGBEL0040_MGT_STD_WK_S02(), up);
			
			return wk;
		}
		
		protected void afterSrch() {
			calcUpriRslt1(down0());
			calcUpriRslt2(down1());
			addSumRow(down0(), down1());
		}
	}
	
	protected void srchCommHdr(Srch01_CndR up, Srch01_HdrR down) {
		executeQuery(down, MGBEL0040_MGT_STD_TOP_S01(), up);
	}
	
	protected MCNumber devide(MCNumber numerator, MCNumber denominator, int scale) {
		if (!isNullOr(numerator, denominator) && !denominator.isZero()) {
			return numerator.divide(denominator, scale, MAC_RND_TYP.RNDOFF.toMC());
		}
		
		return MCNumber.ZERO;
	}
	
	protected void calcUpriRslt1(MCList<Srch02_Rslt1R> list) {
		for (Srch02_Rslt1R row : list) {
			row.upri(devide(row.ttl(), row.std_qty(),
							Srch02_Rslt1R.col_000_META.scale()));
			row.the_upri(devide(row.the_cost(), row.the_qty(),
							Srch02_Rslt1R.col_000_META.scale()));
		}
	}
	
	protected void calcUpriRslt2(MCList<Srch02_Rslt2R> list) {
		for (Srch02_Rslt2R row : list) {
			row.upri(devide(row.ttl(), row.std_wk_cost(),
							Srch02_Rslt2R.col_000_META.scale()));
			row.the_upri(devide(row.the_cost(), row.the_wk_cost(),
							Srch02_Rslt2R.col_000_META.scale()));
		}
	}
	
	protected void addSumRow(MCList<Srch02_Rslt1R> inptL, MCList<Srch02_Rslt2R> wkL) {
		if (inptL.size() > 0) {
			inptL.add(getRslt1SumRow(inptL));
		}
		
		if (wkL.size() > 0) {
			wkL.add(getRslt2SumRow(wkL));
		}
	}
	
	protected Srch02_Rslt1R getRslt1SumRow(MCList<Srch02_Rslt1R> list) {
		MCGroupByPolicy policy = new MCGroupByPolicy();
		
		policy.sum(getRslt1SumColNames());
		Srch02_Rslt1R sumRow = list.groupBy(policy).get(0);
		
		for (String nm : getRslt1SumColNames()) {
			if (isNull(sumRow.getValueNE(nm))) {
				sumRow.setValue(nm, MCNumber.ZERO);
			}
		}
		
		return sumRow;
	}
	
	protected Srch02_Rslt2R getRslt2SumRow(MCList<Srch02_Rslt2R> list) {
		MCGroupByPolicy policy = new MCGroupByPolicy();
		
		policy.sum(getRslt2SumColNames());
		Srch02_Rslt2R sumRow = list.groupBy(policy).get(0);
		
		for (String nm : getRslt2SumColNames()) {
			if (isNull(sumRow.getValueNE(nm))) {
				sumRow.setValue(nm, MCNumber.ZERO);
			}
		}
		
		return sumRow;
	}
	
	protected String[] _rslt1SumColNames = null;
	
	protected String[] _rslt2SumColNames = null;
	
	/** 構成タブ合計行用集計カラム名配列を返します */
	protected String[] getRslt1SumColNames() {
		if (_rslt1SumColNames == null) {
			List<String> l = new ArrayList<String>();
			
			l.add(Srch02_Rslt1R.$the_cost);
			l.add(Srch02_Rslt1R.$ttl);
			l.add(Srch02_Rslt1R.$var_cost);
			l.add(Srch02_Rslt1R.$fxd_cost);
			
			for (int i = 0; i < getExpnsAllColNames().size(); i++) {
				l.add(createColumnNm(i, getSumColScale()));
			}
			
			_rslt1SumColNames = l.toArray(new String[0]);
		}
		
		return _rslt1SumColNames;
	}
	
	/** 工数タブ合計行用集計カラム名配列を返します */
	protected String[] getRslt2SumColNames() {
		if (_rslt2SumColNames == null) {
			List<String> l = new ArrayList<String>();
			
			l.add(Srch02_Rslt2R.$the_cost);
			l.add(Srch02_Rslt2R.$ttl);
			l.add(Srch02_Rslt2R.$var_cost);
			l.add(Srch02_Rslt2R.$fxd_cost);
			
			for (int i = 0; i < getExpnsAllColNames().size(); i++) {
				l.add(createColumnNm(i, getSumColScale()));
			}
			
			_rslt2SumColNames = l.toArray(new String[0]);
		}
		
		return _rslt2SumColNames;
	}
	
	@Override
	protected ArrayList<String> getValidExpnsTyp() {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add(MAC_EXPNS_TYP.PROD.value());
		
		return list;
	}
	
	@Override
	protected String[] getSumTgtCols() {
		String[] stringArray = {
			"T.std_cost"
		};
		
		return stringArray;
	}

	//FMCB CUSTOM END
}