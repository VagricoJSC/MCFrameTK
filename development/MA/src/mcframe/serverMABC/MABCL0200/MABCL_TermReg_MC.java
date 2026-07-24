package mcframe.serverMABC.MABCL0200;

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
import mcframe.serverMABC.MABCL0200.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.commonCore.container.MCRow.Status;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_TermReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_TermReg_MC extends MABCL_TermReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Term_UpdChk01オペレーション.<p>
	 *
	 * 対象期間マスタの登録前のチェックを行います。<br>
	 */
	public class Term_UpdChk01 extends MABCL_TermReg_MC_A.Term_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
		    
			MCMessageList msgList = super.doServerCheckSub();
			updCheckList(msgList);
			
			return msgList;
			
		}
		
		
		protected void updCheckList(MCMessageList msgList) {
				
			MCList<MAM_TERM_R> d = MCList.create(MAM_TERM_R.class);
			MAM_TERM_R t = MAM_TERM_R.create("T");
			MCQueryApiBuilder d_bldr = MCQueryApiBuilder.create(t);
			d_bldr.setSelect(t.term);
			d_bldr.addSelect(t.term_end_ym);
			dbSelect("MABCL0200_MAM_TERM_S01", d, d_bldr);	

			MCList<Term_UpdChk01_DtlR> list = createTerm_Upd01_DtlL();

			for (MAM_TERM_R s : d) {
				MCDate stYm = s.term();
				MCDate endYm = s.term_end_ym();
				
				Term_UpdChk01_DtlR seltRow = Term_UpdChk01_DtlR.create();
				
				MCList<Term_UpdChk01_DtlR> subUpList = up0().subList("term", stYm);
				if (subUpList.size()!= 0) {
					
					Term_UpdChk01_DtlR subUpRow = subUpList.get(0);
					list.add(subUpRow);
				} else {
					seltRow.term(stYm);
					seltRow.term_end_ym(endYm);
					list.add(seltRow);
				}
			}

			list.addAllByName(up0().subList(Status.CREATE));
			list.sort("term");
			// 期間の漏れ、重複チェック
			checkTermYm(list,msgList);
		}
	}

	/**
	 * 期間の漏れ、重複チェック
	 * 
	 * @param list 		チェック対象リスト
	 * @param msgList 	メッセージリスト
	 */
	protected void checkTermYm(MCList<Term_UpdChk01_DtlR> list, MCMessageList msgList) {
		for(int i = 1; i < list.size(); i++){
			Term_UpdChk01_DtlR cur = list.get(i-1);
			Term_UpdChk01_DtlR next = list.get(i);
			
			MCDate curStYm = cur.term();
			MCDate curEndYm = cur.term_end_ym();
			MCDate nextStYm = next.term();
			MCDate nextEndYm = next.term_end_ym();
			
			if(!curEndYm.eq(nextStYm, MCDateFieldType.YEAR, MCDateFieldType.MONTH)){
			
				String cs = toYMString(curStYm);
				String ce = toYMString(curEndYm.addMonth(-1));
				String ns = toYMString(nextStYm);
				String ne = toYMString(nextEndYm.addMonth(-1));
				msgList.add(new MCMessage(cur, null, MABCL0080, cs, ce, ns, ne));
			}
		}
	}
	/**
	 * Term_Upd01オペレーション.<p>
	 *
	 * 対象期間マスタの登録を行います。<br>
	 */
	public class Term_Upd01 extends MABCL_TermReg_MC_A.Term_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

	}
	/**
	 * TermLcl_UpdChk01オペレーション.<p>
	 *
	 * 対象期間名称マスタの登録前のチェックを行います。<br>
	 */
	public class TermLcl_UpdChk01 extends MABCL_TermReg_MC_A.TermLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * TermLcl_Upd01オペレーション.<p>
	 *
	 * 対象期間名称マスタの登録を行います。<br>
	 */
	public class TermLcl_Upd01 extends MABCL_TermReg_MC_A.TermLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Term_DelChk01オペレーション.<p>
	 *
	 * 対象期間マスタ、対象期間名称マスタの削除前のチェックを行います。<br>
	 */
	public class Term_DelChk01 extends MABCL_TermReg_MC_A.Term_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			
			MCMessageList msgList = super.doServerCheckSub();
			delCheckList(msgList);
			
			return msgList;
			
		}
		
		protected void delCheckList(MCMessageList msgList) {
			
			MCList<MAM_TERM_R> d = MCList.create(MAM_TERM_R.class);
			MAM_TERM_R t = MAM_TERM_R.create("T");
			MCQueryApiBuilder d_bldr = MCQueryApiBuilder.create(t);
			
			d_bldr.setSelect(t.term);
			d_bldr.addSelect(t.term_end_ym);
			dbSelect("MABCL0200_MAM_TERM_S02", d, d_bldr);

					
			MCList<Term_UpdChk01_DtlR> list = createTerm_Upd01_DtlL();
			
			for (MAM_TERM_R s : d) {
				MCDate stYm = s.term();
				MCDate endYm = s.term_end_ym();
				
				Term_UpdChk01_DtlR seltRow = Term_UpdChk01_DtlR.create();
				
				MCList<Term_DelChk01_DtlR> subUpList = up0().subList("term", stYm);

				if (subUpList.size()== 0) {
					seltRow.term(stYm);
					seltRow.term_end_ym(endYm);
					list.add(seltRow);
				}
			}

			list.sort("term");
			// 期間の漏れ、重複チェック
			checkTermYm(list,msgList);
		}
	}
	/**
	 * Term_Del01オペレーション.<p>
	 *
	 * 対象期間マスタ、対象期間名称マスタの削除を行います。<br>
	 */
	public class Term_Del01 extends MABCL_TermReg_MC_A.Term_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 対象期間マスタ、対象期間名称マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_TermReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(
				MCQueryApiBuilder builder, MCList<R> rslt) {

			super.dbcCustomize(builder, rslt);
			dbcCustomizeSub(builder);
		}
		
		protected <R extends MCDBContainer> void dbcCustomizeSub(
				MCQueryApiBuilder builder) {
			
			MAM_TERM_R t = MAM_TERM_R.create(builder.getBaseDbcAlias());
			
			builder.addWhereWithCutOffAnd(t.term.gte(bind("term_fr")));
			builder.addWhereWithCutOffAnd(t.term.lte(bind("term_to")));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 対象期間マスタ、対象期間名称マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_TermReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 対象期間マスタ、対象期間名称マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_TermReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}