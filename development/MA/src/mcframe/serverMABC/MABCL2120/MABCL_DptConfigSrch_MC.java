package mcframe.serverMABC.MABCL2120;

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

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.HashMap;
import java.util.Map;
import static mcframe.serverMABC.MABCL2120.Query.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_DptConfigSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_DptConfigSrch_MC extends MABCL_DptConfigSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価部門構成マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_DptConfigSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
			srch();
			setExtno();
		}

		protected void srch() {
			MCList<Srch01_RsltR> addL = MCList.create(Srch01_RsltR.class);
			if (isSame(up0().ope(), "1")) {
				dbTran().statement().executeQuery("MABCL2120_MAM_DPT_CONFIG_Query_S01",
						MABCL2120_MAM_DPT_CONFIG_S01(), up0(), null, null, down0());
				executeQuery(addL, MABCL2120_MAM_DPT_CONFIG_S03(), up0());
				addFirst(down0(), addL);
			}	
			else {
				dbTran().statement().executeQuery("MABCL2120_MAM_DPT_CONFIG_Query_S02",
						MABCL2120_MAM_DPT_CONFIG_S02(), up0(), null, null, down0());
				if (0 < down0().size()) {
					executeQuery(addL, MABCL2120_MAM_DPT_CONFIG_S04(), down0().get(0));
					addFirst(down0(), addL);
				}
			}
		}

		protected void addFirst(MCList<Srch01_RsltR> base,
				MCList<Srch01_RsltR> addL) {
			if(addL.size() == 0){
				return;
			}
			base.add(0, addL.get(0));
		}

		protected void setExtno() {
			if (0 == down0().size()) {
				return;
			}
			Map<MCNumber, MCNumber> ext_map = new HashMap<MCNumber, MCNumber>();
			MCNumber num = MCNumber.ONE;
			MCNumber curr_lvl;
			// loop_flg＝オン以降の展開行を格納して後で削除する
			MCList<Srch01_RsltR> rmList = MCList.create(Srch01_RsltR.class);
			boolean loopFlg = false;
			MCNumber loopHrrchy = null;

			for (Srch01_RsltR r : down0()) {
				curr_lvl = r.hrrchy();

				//ひとつ上のLEVELのext_noをpar_extnoに設定
				r.par_extno(ext_map.get(curr_lvl.subtract(1)));
				r.extno(num);
				ext_map.put(curr_lvl, num);
				num = num.add(1);

				// loop_flg＝オン以降の構成レベルが大きいレコードは削除対象
				// （構成レベルが自レベル以下になるまで）
				if (loopFlg) {
					if (r.hrrchy().gt(loopHrrchy)) {
						rmList.add(r);
					}
					else {
						loopFlg = false;
					}
				}
				if (r.loop_flg()) {
					loopFlg = true;
					loopHrrchy = r.hrrchy();
				}
			}
			down0().removeAll(rmList);
		}
	}

	//FMCB CUSTOM END
}