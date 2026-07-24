package mcframe.serverMBBA.MBBAL0020;

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
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMBBA.MBBAL0020.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R;
import mcframe.commonCore.param.MCParam;
import java.util.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBAL_AprvListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBAL_AprvListReg_MC extends MBBAL_AprvListReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 承認状況を検索する。<br>
	 */
	public class Srch01 extends MBBAL_AprvListReg_MC_A.Srch01 {

		@Override
		protected void call() {
			mapUpContainers(AP);
			so01.exec();
			mapDownContainers(AP);
		}

	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 承認または却下する。<br>
	 */
	public class Upd01 extends MBBAL_AprvListReg_MC_A.Upd01 {

		@Override
		protected void call() {
			
			try {
				up0().setBoolean(Upd01_Dtl1R.$upd_cntr_chk_flg, true);
				setPegNo(up0());
				mapUpContainers(AP);
				so01.exec();
				
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Upd01_Dtl1R>> list = splitUp0(up0(), getSplitRowCount());
			for (MCList<Upd01_Dtl1R> l : list) {
				MCOperation ope = createInstance(lgc, p);
				@SuppressWarnings("unchecked")
				MCList<Upd01_Dtl1R> up0L = ((MCList<Upd01_Dtl1R>)ope.up(0));
				up0L.setAll(l);
				
				opeL.add(ope);
			}
			return opeL;
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {

			MCIndexKey ik = so01.down0().createIndex(Aprv_Chk01_Rslt1R.$peg_no);
			
			for (Upd01_Dtl1R r :up0()) {
				Aprv_Chk01_Rslt1R down = so01.down0().getFirst(ik, r.peg_no());
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

	}

	/**
	 * Upd02オペレーション.<p>
	 *
	 * 承認または却下を取り消す。<br>
	 */
	public class Upd02 extends MBBAL_AprvListReg_MC_A.Upd02 {

		@Override
		protected void call() {
			try {
				up0().setBoolean(Upd01_Dtl1R.$upd_cntr_chk_flg, true);
				setPegNo(up0());
				mapUpContainers(AP);
				so01.exec();
				
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Upd01_Dtl1R>> list = splitUp0(up0(), getSplitRowCount());
			for (MCList<Upd01_Dtl1R> l : list) {
				MCOperation ope = createInstance(lgc, p);
				@SuppressWarnings("unchecked")
				MCList<Upd01_Dtl1R> up0L = ((MCList<Upd01_Dtl1R>)ope.up(0));
				up0L.setAll(l);
				
				opeL.add(ope);
			}
			return opeL;
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCIndexKey ik = so01.down0().createIndex(Aprv_Chk01_Rslt1R.$peg_no);
			
			for (Upd01_Dtl1R r :up0()) {
				Aprv_Chk01_Rslt1R down = so01.down0().getFirst(ik, r.peg_no());
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

	}

	/**
	 * Upd03オペレーション.<p>
	 *
	 * 承認情報を更新する。<br>
	 */
	public class Upd03 extends MBBAL_AprvListReg_MC_A.Upd03 {

		@Override
		protected void call() {			
			try {
				up0().setBoolean(Upd01_Dtl1R.$upd_cntr_chk_flg, true);
				setPegNo(up0());
				mapUpContainers(AP);
				so01.exec();
				
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Upd01_Dtl1R>> list = splitUp0(up0(), getSplitRowCount());
			for (MCList<Upd01_Dtl1R> l : list) {
				MCOperation ope = createInstance(lgc, p);
				@SuppressWarnings("unchecked")
				MCList<Upd01_Dtl1R> up0L = ((MCList<Upd01_Dtl1R>)ope.up(0));
				up0L.setAll(l);
				
				opeL.add(ope);
			}
			return opeL;
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCIndexKey ik = so01.down0().createIndex(Aprv_Chk01_Rslt1R.$peg_no);
			
			for (Upd01_Dtl1R r :up0()) {
				Aprv_Chk01_Rslt1R down = so01.down0().getFirst(ik, r.peg_no());
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

	}

	@Override
	protected void handleSuccess(MCList<?> l) {
		dbTran().commit();
	}
	
	@Override
	protected void handleEx(Exception e, MCList<?> l) {
		super.handleEx(e, l);
		l.setBooleanNE("err_flg", true);
	}
	
	/**
	 * 承認ＮＯが同一の上り電文行が、同じMCListに格納されるように分割する
	 * @param list クライアントから渡された上り電文
	 * @param max １スレッドあたりの最大件数
	 * @return
	 */
	protected List<MCList<Upd01_Dtl1R>> splitUp0(MCList<Upd01_Dtl1R> list, int max) {
		List<MCList<Upd01_Dtl1R>> ret = new ArrayList<>();
		MCList<Upd01_Dtl1R> tmp = MCList.create(Upd01_Dtl1R.class);
		for (MCList<Upd01_Dtl1R> l : list.groupList(Upd01_Dtl1R.$aprv_no)) {
			if (tmp.size() >= max) {
				ret.add(tmp);
				tmp = MCList.create(Upd01_Dtl1R.class);
			}
			tmp.addAll(l);
		}
		if (!tmp.isEmpty()) {
			ret.add(tmp);
		}
		return ret;
	}

	//FMCB CUSTOM END
}