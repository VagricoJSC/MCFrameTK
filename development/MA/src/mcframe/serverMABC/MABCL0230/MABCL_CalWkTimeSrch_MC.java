package mcframe.serverMABC.MABCL0230;

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
import mcframe.serverMABC.MABCL0220.CalExt_UpdChk01_DtlR;
import mcframe.serverMABC.MABCL0220.CalExt_DelChk01_DtlR;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_CalWkTimeSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_CalWkTimeSrch_MC extends MABCL_CalWkTimeSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 臨時カレンダマスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_CalWkTimeSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			int cnt = srchCal();
			if (cnt == 0) {
				return;
			}
			srchCalExt();
		}
		
		protected int srchCal() {
			MCList<MAM_CAL_R> cal = MCList.create(MAM_CAL_R.class);
			MAM_CAL_R t = MAM_CAL_R.create("T");
			MCQueryApiBuilder cal_bldr = MCQueryApiBuilder.create(t);
			
			cal_bldr.setSelectAll();
			cal_bldr.addWhereWithAnd(t.cal_cd.eq(bind("1")), up0().cal_cd());
			cal_bldr.addWhereWithAnd(not( t.end_dt.lt(bind("1"))), up0().year().modMonth(1).modDay(1));
			cal_bldr.addWhereWithAnd(not( t.st_dt.gte(bind("1"))), up0().year().addYear(1).modMonth(1).modDay(1));
			int cnt = dbSelect("MABCL0230_MAM_CAL_S01", cal, cal_bldr);

			for (MAM_CAL_R r :cal) {
				Srch01_Rslt1R s = Srch01_Rslt1R.create();
				s.cal_cd(r.cal_cd());
				s.cal_nm(r.cal_nm());
				s.st_dt(r.st_dt());
				s.sun_off_flg(r.sun_off_flg());
				s.mon_off_flg(r.mon_off_flg());
				s.tue_off_flg(r.tue_off_flg());
				s.wed_off_flg(r.wed_off_flg());
				s.thu_off_flg(r.thu_off_flg());
				s.fri_off_flg(r.fri_off_flg());
				s.sat_off_flg(r.sat_off_flg());
				s.end_dt(r.end_dt());
				s.setAttributes(r);
				down0().add(s);
			}
			return cnt;
		}
		
		protected void srchCalExt() {
			MCList<MAM_CAL_EXT_R> cal_ext = MCList.create(MAM_CAL_EXT_R.class);
			MAM_CAL_EXT_R t = MAM_CAL_EXT_R.create("T");
			MCQueryApiBuilder cal_ext_bldr = MCQueryApiBuilder.create(t);

			cal_ext_bldr.setSelectAll();
			cal_ext_bldr.addWhereWithAnd(t.cal_cd.eq(bind("1")), up0().cal_cd());
			cal_ext_bldr.addWhereWithAnd(t.dt.gte(bind("1")), up0().year().modMonth(1).modDay(1));
			cal_ext_bldr.addWhereWithAnd(t.dt.lt(bind("1")), up0().year().addYear(1).modMonth(1).modDay(1));
			dbSelect("MABCL0230_MAM_CAL_EXT_S01", cal_ext, cal_ext_bldr);

			for (MAM_CAL_EXT_R r :cal_ext) {
				Srch01_Rslt2R s = Srch01_Rslt2R.create();
				s.cal_cd(r.cal_cd());
				s.cal_nm(r.cal_nm());
				s.dt(r.dt());
				s.off_flg(r.off_flg());
				s.memo1(r.memo1());
				s.memo2(r.memo2());
				s.memo3(r.memo3());
				s.del_flg(r.del_flg());
				s.setAttributes(r);
				down1().add(s);
			}
		}
		
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 臨時カレンダマスタの登録を行います。<br>
	 */
	public class Upd01 extends MABCL_CalWkTimeSrch_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void up_CALL_OPE01(
				MCList<CalExt_UpdChk01_DtlR> dest0_0,
				MCList<CalExt_UpdChk01_DtlR> dest1_0,
				MCList<Upd01_Dtl1R> src_Upd01_Dtl1) {

			up_CALL_OPE01_chk01_0(dest0_0, src_Upd01_Dtl1.subList(MCRow.Status.CREATE, MCRow.Status.MODIFY));
			up_CALL_OPE01_upd01_0(dest1_0, src_Upd01_Dtl1.subList(MCRow.Status.CREATE, MCRow.Status.MODIFY));
		}
		@Override
		protected void up_CALL_OPE02(
				MCList<CalExt_DelChk01_DtlR> dest0_0,
				MCList<CalExt_DelChk01_DtlR> dest1_0,
				MCList<Upd01_Dtl1R> src_Upd01_Dtl1) {

			up_CALL_OPE02_chk02_0(dest0_0, src_Upd01_Dtl1.subList(MCRow.Status.DELETE));
			up_CALL_OPE02_upd02_0(dest1_0, src_Upd01_Dtl1.subList(MCRow.Status.DELETE));
		}
	}

	//FMCB CUSTOM END
}