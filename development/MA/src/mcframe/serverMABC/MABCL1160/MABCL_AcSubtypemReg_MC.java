package mcframe.serverMABC.MABCL1160;

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
import mcframe.serverMABC.MABCL1160.*; // このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_AcSubtypemReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_AcSubtypemReg_MC extends MABCL_AcSubtypemReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * AcSubtypem_UpdChk01オペレーション.<p>
	 *
	 * 予備科目区分マスタの登録前のチェックを行います。<br>
	 */
	public class AcSubtypem_UpdChk01
			extends MABCL_AcSubtypemReg_MC_A.AcSubtypem_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * AcSubtypem_Upd01オペレーション.<p>
	 *
	 * 予備科目区分マスタの登録を行います。<br>
	 */
	public class AcSubtypem_Upd01 extends MABCL_AcSubtypemReg_MC_A.AcSubtypem_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void up_OTHER() {
			super.up_OTHER();
			for (AcSubtypem_UpdChk01_DtlR r_src : up0()) {
				MAM_ACCOUNT_R r_dest = chk0.up1.createRow();
				if (MAC_AC_SUBTYP.isAR(r_src.ac_subtyp())) {
					r_dest.ar_typ(r_src.ac_typ());
				}
				else if (MAC_AC_SUBTYP.isAP(r_src.ac_subtyp())) {
					r_dest.ap_typ(r_src.ac_typ());
				}
				else if (MAC_AC_SUBTYP.isSUB1(r_src.ac_subtyp())) {
					r_dest.ac_typ1(r_src.ac_typ());
				}
				else if (MAC_AC_SUBTYP.isSUB2(r_src.ac_subtyp())) {
					r_dest.ac_typ2(r_src.ac_typ());
				}
				else if (MAC_AC_SUBTYP.isSUB3(r_src.ac_subtyp())) {
					r_dest.ac_typ3(r_src.ac_typ());
				}
				else if (MAC_AC_SUBTYP.isSUB4(r_src.ac_subtyp())) {
					r_dest.ac_typ4(r_src.ac_typ());
				}
				else if (MAC_AC_SUBTYP.isSUB5(r_src.ac_subtyp())) {
					r_dest.ac_typ5(r_src.ac_typ());
				}
				r_dest.setAttributes(r_src);
				chk0.up1.add(r_dest);
			}
		}
	}

	/**
	 * AcSubtypemLcl_UpdChk01オペレーション.<p>
	 *
	 * 予備科目区分名称マスタの登録前のチェックを行います。<br>
	 */
	public class AcSubtypemLcl_UpdChk01
			extends MABCL_AcSubtypemReg_MC_A.AcSubtypemLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * AcSubtypemLcl_Upd01オペレーション.<p>
	 *
	 * 予備科目区分名称マスタの登録を行います。<br>
	 */
	public class AcSubtypemLcl_Upd01
			extends MABCL_AcSubtypemReg_MC_A.AcSubtypemLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * AcSubtypem_DelChk01オペレーション.<p>
	 *
	 * 予備科目区分マスタ、予備科目区分名称マスタの削除前のチェックを行います。<br>
	 */
	public class AcSubtypem_DelChk01
			extends MABCL_AcSubtypemReg_MC_A.AcSubtypem_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * AcSubtypem_Del01オペレーション.<p>
	 *
	 * 予備科目区分マスタ、予備科目区分名称マスタの削除を行います。<br>
	 */
	public class AcSubtypem_Del01 extends MABCL_AcSubtypemReg_MC_A.AcSubtypem_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 予備科目区分マスタ、予備科目区分名称マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_AcSubtypemReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 予備科目区分マスタ、予備科目区分名称マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_AcSubtypemReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 予備科目区分マスタ、予備科目区分名称マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_AcSubtypemReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}