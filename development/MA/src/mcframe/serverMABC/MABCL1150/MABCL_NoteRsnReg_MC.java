package mcframe.serverMABC.MABCL1150;

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
import mcframe.serverMABC.MABCL1150.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverFXUC.FXUCL0170.IfValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_NoteRsnReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_NoteRsnReg_MC extends MABCL_NoteRsnReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * NoteRsn_UpdChk01オペレーション.<p>
	 *
	 * 手形理由マスタの登録前のチェックを行います。<br>
	 */
	public class NoteRsn_UpdChk01 extends MABCL_NoteRsnReg_MC_A.NoteRsn_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList =	super.doServerCheckSub();

			for (NoteRsn_UpdChk01_DtlR r : up0()) {
				if (r.del_flg()) {
					continue ;
				}
				
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				if (!r.dpt_id_flg()) {
					msgList.addAll(check(r, NoteRsn_UpdChk01_DtlR.$slip_cnt_id, new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (r.sub_flg() && isNull(r.sub_ac_cd())){
					msgList.add(new MCMessage(r, NoteRsn_UpdChk01_DtlR.$ac_cd, MABCL0005, r.ac_cd(), toDispGUIIndex(r)));
				}
				else if (!r.sub_flg() && !isNull(r.sub_ac_cd())) {
					msgList.add(new MCMessage(r, NoteRsn_UpdChk01_DtlR.$ac_cd, MABCL0007, r.ac_cd(), toDispGUIIndex(r)));
				}
			}
			return msgList;
		}
	}
	/**
	 * NoteRsn_Upd01オペレーション.<p>
	 *
	 * 手形理由マスタの登録を行います。<br>
	 */
	public class NoteRsn_Upd01 extends MABCL_NoteRsnReg_MC_A.NoteRsn_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * NoteRsnLcl_UpdChk01オペレーション.<p>
	 *
	 * 手形理由名称マスタの登録前のチェックを行います。<br>
	 */
	public class NoteRsnLcl_UpdChk01 extends MABCL_NoteRsnReg_MC_A.NoteRsnLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * NoteRsnLcl_Upd01オペレーション.<p>
	 *
	 * 手形理由名称マスタの登録を行います。<br>
	 */
	public class NoteRsnLcl_Upd01 extends MABCL_NoteRsnReg_MC_A.NoteRsnLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * NoteRsn_DelChk01オペレーション.<p>
	 *
	 * 手形理由マスタ、手形理由名称マスタの削除前のチェックを行います。<br>
	 */
	public class NoteRsn_DelChk01 extends MABCL_NoteRsnReg_MC_A.NoteRsn_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * NoteRsn_Del01オペレーション.<p>
	 *
	 * 手形理由マスタ、手形理由名称マスタの削除を行います。<br>
	 */
	public class NoteRsn_Del01 extends MABCL_NoteRsnReg_MC_A.NoteRsn_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 手形理由マスタ、手形理由名称マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_NoteRsnReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_NOTE_RSN_R) {
				dbcCustomizeSub(builder, rslt);
			}
		}

		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder, MCList<R> rslt) {
			MAM_ACCOUNT_R account1 = MAM_ACCOUNT_R.create(MAM_NOTE_RSN_R.$ACCOUNT1);
			
			rslt.addBooleanColumn("sub_flg");
			builder.addSelect(account1.sub_flg);
		}

		@Override
		protected void down_SELECT_c0_0(Srch01_Rslt1R r_dest, MAM_NOTE_RSN_R r_src) {

			super.down_SELECT_c0_0(r_dest, r_src);

			r_dest.sub_flg(r_src.getBooleanNE("sub_flg"));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 手形理由マスタ、手形理由名称マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_NoteRsnReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 手形理由マスタ、手形理由名称マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_NoteRsnReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}