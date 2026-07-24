package mcframe.serverMABC.MABCL1020;

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
import mcframe.serverMABC.MABCL1020.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_AccountReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_AccountReg_MC extends MABCL_AccountReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Account_UpdChk01オペレーション.<p>
	 *
	 * 勘定科目マスタの登録前のチェックを行います。<br>
	 */
	public class Account_UpdChk01 extends MABCL_AccountReg_MC_A.Account_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Account_Upd01オペレーション.<p>
	 *
	 * 勘定科目マスタの登録を行います。<br>
	 */
	public class Account_Upd01 extends MABCL_AccountReg_MC_A.Account_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AccountLcl_UpdChk01オペレーション.<p>
	 *
	 * 勘定科目マスタ(ロケール別情報)の登録前のチェックを行います。<br>
	 */
	public class AccountLcl_UpdChk01 extends MABCL_AccountReg_MC_A.AccountLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AccountLcl_Upd01オペレーション.<p>
	 *
	 * 勘定科目マスタ(ロケール別情報)の登録を行います。<br>
	 */
	public class AccountLcl_Upd01 extends MABCL_AccountReg_MC_A.AccountLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Account_DelChk01オペレーション.<p>
	 *
	 * 勘定科目マスタ、勘定科目マスタ(ロケール別情報)の削除前のチェックを行います。<br>
	 */
	public class Account_DelChk01 extends MABCL_AccountReg_MC_A.Account_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Account_Del01オペレーション.<p>
	 *
	 * 勘定科目マスタ、勘定科目マスタ(ロケール別情報)の削除を行います。<br>
	 */
	public class Account_Del01 extends MABCL_AccountReg_MC_A.Account_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 勘定科目マスタ、勘定科目マスタ(ロケール別情報)の検索を行います。<br>
	 */
	public class Srch01 extends MABCL_AccountReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(	
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			
			editDmlSubTyp(builder);
			addFlgWhere(builder);
		}
		
		/**
		 * 予備科目区分と結合するためのSQL編集
		 * 
		 * @param dbc
		 */
		protected void editDmlSubTyp(MCQueryApiBuilder dbc_bldr) {
			
			MAM_AC_SUBTYPEM_R ap = MAM_AC_SUBTYPEM_R.create("AP");
			MAM_AC_SUBTYPEM_R ar = MAM_AC_SUBTYPEM_R.create("AR");
			MAM_AC_SUBTYPEM_R sub1 = MAM_AC_SUBTYPEM_R.create("SUB1");
			MAM_AC_SUBTYPEM_R sub2 = MAM_AC_SUBTYPEM_R.create("SUB2");
			MAM_AC_SUBTYPEM_R sub3 = MAM_AC_SUBTYPEM_R.create("SUB3");
			MAM_AC_SUBTYPEM_R sub4 = MAM_AC_SUBTYPEM_R.create("SUB4");
			MAM_AC_SUBTYPEM_R sub5 = MAM_AC_SUBTYPEM_R.create("SUB5");
			MAM_ACCOUNT_R t = MAM_ACCOUNT_R.create(dbc_bldr.getBaseDbcAlias());
		
			dbc_bldr.addLeftOuterJoin(ap, t.ap_typ.eq(ap.ac_typ)
					.and(ap.ac_subtyp.eq(value(MAC_AC_SUBTYP.AP.value()))));
			dbc_bldr.addLeftOuterJoin(ar, t.ar_typ.eq(ar.ac_typ)
					.and(ar.ac_subtyp.eq(value(MAC_AC_SUBTYP.AR.value()))));
			dbc_bldr.addLeftOuterJoin(sub1, t.ac_typ1.eq(sub1.ac_typ)
					.and(sub1.ac_subtyp.eq(value(MAC_AC_SUBTYP.SUB1.value()))));
			dbc_bldr.addLeftOuterJoin(sub2, t.ac_typ2.eq(sub2.ac_typ)
					.and(sub2.ac_subtyp.eq(value(MAC_AC_SUBTYP.SUB2.value()))));
			dbc_bldr.addLeftOuterJoin(sub3, t.ac_typ3.eq(sub3.ac_typ)
					.and(sub3.ac_subtyp.eq(value(MAC_AC_SUBTYP.SUB3.value()))));
			dbc_bldr.addLeftOuterJoin(sub4, t.ac_typ4.eq(sub4.ac_typ)
					.and(sub4.ac_subtyp.eq(value(MAC_AC_SUBTYP.SUB4.value()))));
			dbc_bldr.addLeftOuterJoin(sub5, t.ac_typ5.eq(sub5.ac_typ)
					.and(sub5.ac_subtyp.eq(value(MAC_AC_SUBTYP.SUB5.value()))));
			
			dbc_bldr.addSelect(ap.ac_typ_nm.as("ap_typ_nm"));
			dbc_bldr.addSelect(ar.ac_typ_nm.as("ar_typ_nm"));
			dbc_bldr.addSelect(sub1.ac_typ_nm.as("ac_typ_nm1"));
			dbc_bldr.addSelect(sub2.ac_typ_nm.as("ac_typ_nm2"));
			dbc_bldr.addSelect(sub3.ac_typ_nm.as("ac_typ_nm3"));
			dbc_bldr.addSelect(sub4.ac_typ_nm.as("ac_typ_nm4"));
			dbc_bldr.addSelect(sub5.ac_typ_nm.as("ac_typ_nm5"));

		}
		
		
		/**
		 * フラグによる検索条件をwhere句に追加します。
		 * 
		 * @param dbc
		 */
		protected void addFlgWhere(MCQueryApiBuilder dbc_bldr) {
			
			MAM_ACCOUNT_R t = MAM_ACCOUNT_R.create(dbc_bldr.getBaseDbcAlias());
			if (up0().sub_flg()) {
				dbc_bldr.addWhereWithAnd(t.sub_flg.eq(value(true)));
			}
		}
		
		@Override
		protected void down_SELECT_c0_0(Srch01_Rslt1R r_dest, MAM_ACCOUNT_R r_src) {
			
			super.down_SELECT_c0_0(r_dest, r_src);
			
			// 一時カラムはサブオペレーションでコピーできないので追加実装
			r_dest.ap_typ_nm(r_src.getStringNE("ap_typ_nm"));
			r_dest.ar_typ_nm(r_src.getStringNE("ar_typ_nm"));
			r_dest.ac_typ_nm1(r_src.getStringNE("ac_typ_nm1"));
			r_dest.ac_typ_nm2(r_src.getStringNE("ac_typ_nm2"));
			r_dest.ac_typ_nm3(r_src.getStringNE("ac_typ_nm3"));
			r_dest.ac_typ_nm4(r_src.getStringNE("ac_typ_nm4"));
			r_dest.ac_typ_nm5(r_src.getStringNE("ac_typ_nm5"));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 勘定科目マスタ、勘定科目マスタ(ロケール別情報)の登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_AccountReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 勘定科目マスタ、勘定科目マスタ(ロケール別情報)の削除を行います。<br>
	 */
	public class Del01 extends MABCL_AccountReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}