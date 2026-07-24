package mcframe.serverMSBG.MSBGL0030;

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
import static mcframe.serverMSBG.MSBGL0030.Query.*;
import mcframe.serverMSBG.MSBGL5040.*;
import mcframe.commonCore.param.MCParam;
import java.util.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_BillSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_BillSrch_MC extends MSBGL_BillSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 請求一覧の情報を取得する<br>
	 */
	public class Srch01 extends MSBGL_BillSrch_MC_A.Srch01 {
		protected static final String REF = "0";
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			setUpTmpCol(up0());
			MCQueryPlan sql = MSBGL0030_MST_BILL_S01();
			searchForDL(sql, up0(), down0());
		}
		
		@Override
		protected void editListMain() {
			
			for(Srch01_RsltR r : down0()){
				if (!isNull(r.setoff_amt())) {
					r.setoff_amt(r.setoff_amt().multiply(-1));
				}
				nullValToNull(r, Srch01_RsltR.$bill_cl_ym);
			}
		}

		/**
		 * 検索条件に対する一時カラムを設定する
		 * @param up
		 */
		protected void setUpTmpCol(Srch01_CndR up) {
			// 請求締状況区分
			if (up.cl_batch_flg()) {
				up.addStringColumn("CL_BATCH", MSC_BILL_CL_STS_TYP.CL_BATCH.value());
			}
			if (up.cl_scrn_flg()) {
				up.addStringColumn("CL_SCRN", MSC_BILL_CL_STS_TYP.CL_SCRN.value());
			}
			if (up.each_sls_flg()) {
				up.addStringColumn("EACH_SLS", MSC_BILL_CL_STS_TYP.EACH_SLS.value());
			}
			if (up.not_cl_flg()) {
				up.addStringColumn("NOT_BILL", MSC_BILL_CL_STS_TYP.NOT_BILL.value());
			}
			up.addStringColumn("REF_MODE", toTrueStr(isSame( up.ope(), REF)));
			
			// 発行種別
			if (up.not_prnt_flg() && !up.prnt_flg()) {
				up.addStringColumn("PRNT_FLG_STR", toFalseStr(up.prnt_flg()));
			} else if (!up.not_prnt_flg() && up.prnt_flg()) {
				up.addStringColumn("PRNT_FLG_STR", toTrueStr(up.prnt_flg()));
			}

			// 国内国外種別
			if (up.dmstic_flg() && !up.foreign_flg()) {
				up.addStringColumn("FOREIGN_FLG_STR", toFalseStr(up.foreign_flg()));
			} else if (!up.dmstic_flg() && up.foreign_flg()) {
				up.addStringColumn("FOREIGN_FLG_STR", toTrueStr(up.foreign_flg()));
			}

			// 入金予定調整
			if (up.not_adjst_flg() && !up.adjst_flg()) {
				up.addStringColumn("ADJST_FLG_STR", toFalseStr(up.adjst_flg()));
			} else if (!up.not_adjst_flg() && up.adjst_flg()) {
				up.addStringColumn("ADJST_FLG_STR", toTrueStr(up.adjst_flg()));
			}

			// 仮単価あり
			up.addStringColumn("INTERIM_FLG_STR", toTrueStr(up.interim_flg()));
			// 請求対象外含む
			up.addStringColumn("INC_NO_BILL_FLG_STR", toFalseStr(up.inc_no_bill_flg()));
			// 発行対象外を除く
			up.addStringColumn("NOT_PRNT_EX_FLG_STR", toTrueStr(up.not_prnt_ex_flg()));
			// 入金予定調整対象のみ
			up.addStringColumn("RCV_SCHD_ADJST_FLG_STR", toTrueStr(up.rcv_schd_adjst_flg()));
			if (isSame(up.bill_cl_day(), 99)) {
				up.bill_cl_day(null);
				up.addStringColumn("BILL_CL_DAY99_FLG_STR", toTrueStr(true));
			}
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 請求書を発行する<br>
	 */
	public class Prnt01 extends MSBGL_BillSrch_MC_A.Prnt01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
				up0().setStringNE("rtn_sts_typ", MAC_RTN_STS_TYP.ERR.value());
				down0().setAll(up0());
			}
		}

		@Override
		protected void doIt() {
			MSBGL_BillPrntService.Bill_Prnt01 ope = MSBGL_BillPrntService.crtBill_Prnt01();

			addAll(ope.up0(), up0(), createMap_Bill_Prnt01_HdrR_Prnt01_RsltR());
			ope.up1().indiv_prnt_flg(up1().indiv_prnt_flg());
			ope.exec();

			MCIndexKey ik = ope.down0().createIndex(Bill_Prnt01_HdrR.$bill_mng_no, Bill_Prnt01_HdrR.$bill_no);

			for (Prnt01_RsltR r :up0()) {
				Bill_Prnt01_HdrR down = ope.down0().getFirst(ik, r.bill_mng_no(), r.bill_no());
				if (down == null) {
					continue;
				}
				else if (down.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
			down0().setAll(up0());

		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			List<MCList<Prnt01_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Prnt01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Prnt01_RsltR> up0L = ((MCList<Prnt01_RsltR>)ope.up(0));  
				up0L.setAll(l);
				setUpRowParam(1, (MCRow)ope.up(1), up1());
				opeL.add(ope);
			}
			return opeL;
		}
		
		protected List<MCList<Prnt01_RsltR>> splitUp(MCList<Prnt01_RsltR> list, int max) {
			List<MCList<Prnt01_RsltR>> ret = new ArrayList<>();
			MCList<Prnt01_RsltR>[] grpL = list.groupList(Prnt01_RsltR.$bcst_cd);
			MCList<Prnt01_RsltR> tmp = MCList.create(Prnt01_RsltR.class);
			for (MCList<Prnt01_RsltR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Prnt01_RsltR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}
	}

	protected void handleSuccess(MCList<Prnt01_RsltR> l) {
		dbTran().commit();
	}

	protected void handleEx(Exception e, MCList<Prnt01_RsltR> l) {
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
	
	protected Map_Bill_Prnt01_HdrR_Prnt01_RsltR<Bill_Prnt01_HdrR,Prnt01_RsltR> createMap_Bill_Prnt01_HdrR_Prnt01_RsltR() {
		return new Map_Bill_Prnt01_HdrR_Prnt01_RsltR<Bill_Prnt01_HdrR, Prnt01_RsltR>();
	}

	public class Map_Bill_Prnt01_HdrR_Prnt01_RsltR<D extends Bill_Prnt01_HdrR, S extends Prnt01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Bill_Prnt01_HdrR.$bill_mng_no, Prnt01_RsltR.$bill_mng_no);
			addColumnPathMap(Bill_Prnt01_HdrR.$bill_no, Prnt01_RsltR.$bill_no);

		}
	}

	//FMCB CUSTOM END
}