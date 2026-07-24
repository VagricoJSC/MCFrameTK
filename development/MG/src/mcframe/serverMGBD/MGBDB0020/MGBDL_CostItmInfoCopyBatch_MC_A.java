package mcframe.serverMGBD.MGBDB0020;

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
 * "MGBDL_CostItmInfoCopyBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDL_CostItmInfoCopyBatch_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MG";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MGBD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBDB0020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBDL_CostItmInfoCopyBatch.CostItmInfoCopy_Chk01 aCostItmInfoCopy_Chk01;

	protected void initCostItmInfoCopy_Chk01() {
		this.info = PDef.MG_MGBDB0020_CostItmInfoCopy_Chk01_INFO;
		this.aCostItmInfoCopy_Chk01 = ((MGBDL_CostItmInfoCopyBatch)this).new CostItmInfoCopy_Chk01();
	}

	public static MGBDL_CostItmInfoCopyBatch.CostItmInfoCopy_Chk01 crtCostItmInfoCopy_Chk01() {
		MGBDL_CostItmInfoCopyBatch lgc = new MGBDL_CostItmInfoCopyBatch();
		lgc.initCostItmInfoCopy_Chk01();
		return lgc.aCostItmInfoCopy_Chk01;
	}

	protected void paramCostItmInfoCopy_Chk01(MCParam p) {
		if (this.aCostItmInfoCopy_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostItmInfoCopy_Chk01.up0());
		p.addDownBlock(aCostItmInfoCopy_Chk01.down0());
	}

	protected void doCostItmInfoCopy_Chk01() {
		aCostItmInfoCopy_Chk01.call();
	};

	/**
	 * CostItmInfoCopy_Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk01_CndR createCostItmInfoCopy_Chk01_CndR(){
		return mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk01_CndR.create();
	}
	protected MGBDL_CostItmInfoCopyBatch.CostItmInfoCopy_Chk02 aCostItmInfoCopy_Chk02;

	protected void initCostItmInfoCopy_Chk02() {
		this.info = PDef.MG_MGBDB0020_CostItmInfoCopy_Chk02_INFO;
		this.aCostItmInfoCopy_Chk02 = ((MGBDL_CostItmInfoCopyBatch)this).new CostItmInfoCopy_Chk02();
	}

	public static MGBDL_CostItmInfoCopyBatch.CostItmInfoCopy_Chk02 crtCostItmInfoCopy_Chk02() {
		MGBDL_CostItmInfoCopyBatch lgc = new MGBDL_CostItmInfoCopyBatch();
		lgc.initCostItmInfoCopy_Chk02();
		return lgc.aCostItmInfoCopy_Chk02;
	}

	protected void paramCostItmInfoCopy_Chk02(MCParam p) {
		if (this.aCostItmInfoCopy_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostItmInfoCopy_Chk02.up0());
	}

	protected void doCostItmInfoCopy_Chk02() {
		aCostItmInfoCopy_Chk02.call();
	};

	/**
	 * CostItmInfoCopy_Chk02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk02_CndR createCostItmInfoCopy_Chk02_CndR(){
		return mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk02_CndR.create();
	}
	protected MGBDL_CostItmInfoCopyBatch.CostItmInfoCopy_Upd01 aCostItmInfoCopy_Upd01;

	protected void initCostItmInfoCopy_Upd01() {
		this.info = PDef.MG_MGBDB0020_CostItmInfoCopy_Upd01_INFO;
		this.aCostItmInfoCopy_Upd01 = ((MGBDL_CostItmInfoCopyBatch)this).new CostItmInfoCopy_Upd01();
	}

	public static MGBDL_CostItmInfoCopyBatch.CostItmInfoCopy_Upd01 crtCostItmInfoCopy_Upd01() {
		MGBDL_CostItmInfoCopyBatch lgc = new MGBDL_CostItmInfoCopyBatch();
		lgc.initCostItmInfoCopy_Upd01();
		return lgc.aCostItmInfoCopy_Upd01;
	}

	protected void paramCostItmInfoCopy_Upd01(MCParam p) {
		if (this.aCostItmInfoCopy_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostItmInfoCopy_Upd01.up0());
	}

	protected void doCostItmInfoCopy_Upd01() {
		aCostItmInfoCopy_Upd01.call();
	};

	/**
	 * CostItmInfoCopy_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk01_CndR createCostItmInfoCopy_Upd01_CndR(){
		return mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk01_CndR.create();
	}
	protected MGBDL_CostItmInfoCopyBatch.CostItmInfoCopy_Del01 aCostItmInfoCopy_Del01;

	protected void initCostItmInfoCopy_Del01() {
		this.info = PDef.MG_MGBDB0020_CostItmInfoCopy_Del01_INFO;
		this.aCostItmInfoCopy_Del01 = ((MGBDL_CostItmInfoCopyBatch)this).new CostItmInfoCopy_Del01();
	}

	public static MGBDL_CostItmInfoCopyBatch.CostItmInfoCopy_Del01 crtCostItmInfoCopy_Del01() {
		MGBDL_CostItmInfoCopyBatch lgc = new MGBDL_CostItmInfoCopyBatch();
		lgc.initCostItmInfoCopy_Del01();
		return lgc.aCostItmInfoCopy_Del01;
	}

	protected void paramCostItmInfoCopy_Del01(MCParam p) {
		if (this.aCostItmInfoCopy_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostItmInfoCopy_Del01.up0());
	}

	protected void doCostItmInfoCopy_Del01() {
		aCostItmInfoCopy_Del01.call();
	};

	/**
	 * CostItmInfoCopy_Del01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk02_CndR createCostItmInfoCopy_Del01_CndR(){
		return mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk02_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * CostItmInfoCopy_Chk01オペレーション.<p>
	 *
	 * 取込する前のチェックを行う<br>
	 */
	abstract public class CostItmInfoCopy_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostItmInfoCopy_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk01_CndR down0;
		
		
		// コンストラクタ
		protected CostItmInfoCopy_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk01_CndR.create();
			down0 = mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk01_CndR.create();

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
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBDL_CostItmInfoCopyBatch)MGBDL_CostItmInfoCopyBatch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * CostItmInfoCopy_Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk01_CndR createCostItmInfoCopy_Chk01_CndR(){
			return mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>lump_flg</td></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_imp_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk01_CndR
		 */
		public mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>lump_flg</td></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_imp_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk01_CndR
		 */
		public mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CostItmInfoCopyBatch)MGBDL_CostItmInfoCopyBatch_MC_A.this).info;
		}


	}
	/**
	 * CostItmInfoCopy_Chk02オペレーション.<p>
	 *
	 * 削除する前のチェックを行う<br>
	 */
	abstract public class CostItmInfoCopy_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostItmInfoCopy_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk02_CndR up0;
		
		
		// コンストラクタ
		protected CostItmInfoCopy_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk02_CndR.create();

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
			invoke((MGBDL_CostItmInfoCopyBatch)MGBDL_CostItmInfoCopyBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CostItmInfoCopy_Chk02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk02_CndR createCostItmInfoCopy_Chk02_CndR(){
			return mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk02_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>term_fr</td></tr>
		 * 	<tr><td><br></td><td>term_to</td></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk02_CndR
		 */
		public mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk02_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CostItmInfoCopyBatch)MGBDL_CostItmInfoCopyBatch_MC_A.this).info;
		}


	}
	/**
	 * CostItmInfoCopy_Upd01オペレーション.<p>
	 *
	 * 取込処理をする<br>
	 */
	abstract public class CostItmInfoCopy_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostItmInfoCopy_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk01_CndR up0;
		
		
		// コンストラクタ
		protected CostItmInfoCopy_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk01_CndR.create();

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
			invoke((MGBDL_CostItmInfoCopyBatch)MGBDL_CostItmInfoCopyBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CostItmInfoCopy_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk01_CndR createCostItmInfoCopy_Upd01_CndR(){
			return mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>lump_flg</td></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_imp_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk01_CndR
		 */
		public mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CostItmInfoCopyBatch)MGBDL_CostItmInfoCopyBatch_MC_A.this).info;
		}


	}
	/**
	 * CostItmInfoCopy_Del01オペレーション.<p>
	 *
	 * 削除処理をする<br>
	 */
	abstract public class CostItmInfoCopy_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostItmInfoCopy_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk02_CndR up0;
		
		
		// コンストラクタ
		protected CostItmInfoCopy_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk02_CndR.create();

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
			invoke((MGBDL_CostItmInfoCopyBatch)MGBDL_CostItmInfoCopyBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CostItmInfoCopy_Del01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk02_CndR createCostItmInfoCopy_Del01_CndR(){
			return mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk02_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>term_fr</td></tr>
		 * 	<tr><td><br></td><td>term_to</td></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk02_CndR
		 */
		public mcframe.serverMGBD.MGBDB0020.CostItmInfoCopy_Chk02_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CostItmInfoCopyBatch)MGBDL_CostItmInfoCopyBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}