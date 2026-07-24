package mcframe.serverMSBE.MSBEB0040;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSBEB_InptStkRplBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEB_InptStkRplBatch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEB0040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEB_InptStkRplBatch.InptStkRplBatch_Upd01 aInptStkRplBatch_Upd01;

	protected void initInptStkRplBatch_Upd01() {
		this.info = PDef.MS_MSBEB0040_InptStkRplBatch_Upd01_INFO;
		this.aInptStkRplBatch_Upd01 = ((MSBEB_InptStkRplBatch)this).new InptStkRplBatch_Upd01();
	}

	public static MSBEB_InptStkRplBatch.InptStkRplBatch_Upd01 crtInptStkRplBatch_Upd01() {
		MSBEB_InptStkRplBatch lgc = new MSBEB_InptStkRplBatch();
		lgc.initInptStkRplBatch_Upd01();
		return lgc.aInptStkRplBatch_Upd01;
	}

	protected void paramInptStkRplBatch_Upd01(MCParam p) {
		if (this.aInptStkRplBatch_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInptStkRplBatch_Upd01.up0());
	}

	protected void doInptStkRplBatch_Upd01() {
		aInptStkRplBatch_Upd01.call();
	};

	/**
	 * InptStkRplBatch_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEB0040.InptStkRplBatch_CndR createInptStkRplBatch_CndR(){
		return mcframe.serverMSBE.MSBEB0040.InptStkRplBatch_CndR.create();
	}

	/**
	 * InptStkRplBatch_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEB0040.InptStkRplBatch_DtlR createInptStkRplBatch_DtlR(){
		return mcframe.serverMSBE.MSBEB0040.InptStkRplBatch_DtlR.create();
	}
	protected MSBEB_InptStkRplBatch.InptStkRplBatch_Del01 aInptStkRplBatch_Del01;

	protected void initInptStkRplBatch_Del01() {
		this.info = PDef.MS_MSBEB0040_InptStkRplBatch_Del01_INFO;
		this.aInptStkRplBatch_Del01 = ((MSBEB_InptStkRplBatch)this).new InptStkRplBatch_Del01();
	}

	public static MSBEB_InptStkRplBatch.InptStkRplBatch_Del01 crtInptStkRplBatch_Del01() {
		MSBEB_InptStkRplBatch lgc = new MSBEB_InptStkRplBatch();
		lgc.initInptStkRplBatch_Del01();
		return lgc.aInptStkRplBatch_Del01;
	}

	protected void paramInptStkRplBatch_Del01(MCParam p) {
		if (this.aInptStkRplBatch_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInptStkRplBatch_Del01.up0());
	}

	protected void doInptStkRplBatch_Del01() {
		aInptStkRplBatch_Del01.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * InptStkRplBatch_Upd01オペレーション.<p>
	 *
	 */
	abstract public class InptStkRplBatch_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InptStkRplBatch_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEB0040.InptStkRplBatch_CndR up0;
		/** [InptStkRplBatch_Dtl]ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEB0040.InptStkRplBatch_DtlR aInptStkRplBatch_Dtl;
		
		
		// コンストラクタ
		protected InptStkRplBatch_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEB0040.InptStkRplBatch_CndR.create();
			aInptStkRplBatch_Dtl = mcframe.serverMSBE.MSBEB0040.InptStkRplBatch_DtlR.create();

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEB_InptStkRplBatch)MSBEB_InptStkRplBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * InptStkRplBatch_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEB0040.InptStkRplBatch_CndR createInptStkRplBatch_CndR(){
			return mcframe.serverMSBE.MSBEB0040.InptStkRplBatch_CndR.create();
		}

		/**
		 * InptStkRplBatch_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEB0040.InptStkRplBatch_DtlR createInptStkRplBatch_DtlR(){
			return mcframe.serverMSBE.MSBEB0040.InptStkRplBatch_DtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>xfr_schd_del_flg</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_crt_flg</td></tr>
		 * 	<tr><td><br></td><td>opn_flg</td></tr>
		 * 	<tr><td><br></td><td>ord_sav_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>schd_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_sav_flg</td></tr>
		 * 	<tr><td><br></td><td>ord_flg</td></tr>
		 * 	<tr><td><br></td><td>stt_flg</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>int_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEB0040.InptStkRplBatch_CndR
		 */
		public mcframe.serverMSBE.MSBEB0040.InptStkRplBatch_CndR up0() {
			return up0;
		}



		/**
		 * [InptStkRplBatch_Dtl]ブロックのコンテナaInptStkRplBatch_DtlRを返します。
		 *
		 * @return InptStkRplBatch_DtlR
		 */
		public mcframe.serverMSBE.MSBEB0040.InptStkRplBatch_DtlR InptStkRplBatch_Dtl() {
			return aInptStkRplBatch_Dtl;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEB_InptStkRplBatch)MSBEB_InptStkRplBatch_MC_A.this).info;
		}


	}
	/**
	 * InptStkRplBatch_Del01オペレーション.<p>
	 *
	 */
	abstract public class InptStkRplBatch_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InptStkRplBatch_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEB0040.InptStkRplBatch_CndR up0;
		
		
		// コンストラクタ
		protected InptStkRplBatch_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEB0040.InptStkRplBatch_CndR.create();

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEB_InptStkRplBatch)MSBEB_InptStkRplBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * InptStkRplBatch_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEB0040.InptStkRplBatch_CndR createInptStkRplBatch_CndR(){
			return mcframe.serverMSBE.MSBEB0040.InptStkRplBatch_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_stk_rpl_lst_del_flg</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_del_flg</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>int_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEB0040.InptStkRplBatch_CndR
		 */
		public mcframe.serverMSBE.MSBEB0040.InptStkRplBatch_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEB_InptStkRplBatch)MSBEB_InptStkRplBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}