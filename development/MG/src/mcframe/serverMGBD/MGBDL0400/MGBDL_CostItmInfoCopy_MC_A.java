package mcframe.serverMGBD.MGBDL0400;

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
 * "MGBDL_CostItmInfoCopy"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDL_CostItmInfoCopy_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
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
	public static final String LOGIC_ID = "MGBDL0400";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBDL_CostItmInfoCopy.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MG_MGBDL0400_Chk01_INFO;
		this.aChk01 = ((MGBDL_CostItmInfoCopy)this).new Chk01();
	}

	public static MGBDL_CostItmInfoCopy.Chk01 crtChk01() {
		MGBDL_CostItmInfoCopy lgc = new MGBDL_CostItmInfoCopy();
		lgc.initChk01();
		return lgc.aChk01;
	}

	protected void paramChk01(MCParam p) {
		if (this.aChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk01.up0());
		p.addDownBlock(aChk01.down0());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0400.Chk01_CndR createChk01_CndR(){
		return mcframe.serverMGBD.MGBDL0400.Chk01_CndR.create();
	}
	protected MGBDL_CostItmInfoCopy.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MG_MGBDL0400_Chk02_INFO;
		this.aChk02 = ((MGBDL_CostItmInfoCopy)this).new Chk02();
	}

	public static MGBDL_CostItmInfoCopy.Chk02 crtChk02() {
		MGBDL_CostItmInfoCopy lgc = new MGBDL_CostItmInfoCopy();
		lgc.initChk02();
		return lgc.aChk02;
	}

	protected void paramChk02(MCParam p) {
		if (this.aChk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk02.up0());
	}

	protected void doChk02() {
		aChk02.call();
	};

	/**
	 * Chk02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0400.Chk02_CndR createChk02_CndR(){
		return mcframe.serverMGBD.MGBDL0400.Chk02_CndR.create();
	}
	protected MGBDL_CostItmInfoCopy.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MG_MGBDL0400_Ins01_INFO;
		this.aIns01 = ((MGBDL_CostItmInfoCopy)this).new Ins01();
	}

	public static MGBDL_CostItmInfoCopy.Ins01 crtIns01() {
		MGBDL_CostItmInfoCopy lgc = new MGBDL_CostItmInfoCopy();
		lgc.initIns01();
		return lgc.aIns01;
	}

	protected void paramIns01(MCParam p) {
		if (this.aIns01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns01.up0());
	}

	protected void doIns01() {
		aIns01.call();
	};

	/**
	 * Ins01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0400.Chk01_CndR createIns01_CndR(){
		return mcframe.serverMGBD.MGBDL0400.Chk01_CndR.create();
	}
	protected MGBDL_CostItmInfoCopy.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MG_MGBDL0400_Del01_INFO;
		this.aDel01 = ((MGBDL_CostItmInfoCopy)this).new Del01();
	}

	public static MGBDL_CostItmInfoCopy.Del01 crtDel01() {
		MGBDL_CostItmInfoCopy lgc = new MGBDL_CostItmInfoCopy();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0400.Chk02_CndR createDel01_CndR(){
		return mcframe.serverMGBD.MGBDL0400.Chk02_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 取込する前のチェックを行う<br>
	 */
	abstract public class Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0400.Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0400.Chk01_CndR down0;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0400.Chk01_CndR.create();
			down0 = mcframe.serverMGBD.MGBDL0400.Chk01_CndR.create();

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
			invoke((MGBDL_CostItmInfoCopy)MGBDL_CostItmInfoCopy_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0400.Chk01_CndR createChk01_CndR(){
			return mcframe.serverMGBD.MGBDL0400.Chk01_CndR.create();
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
		 * @see mcframe.serverMGBD.MGBDL0400.Chk01_CndR
		 */
		public mcframe.serverMGBD.MGBDL0400.Chk01_CndR up0() {
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
		 * @see mcframe.serverMGBD.MGBDL0400.Chk01_CndR
		 */
		public mcframe.serverMGBD.MGBDL0400.Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CostItmInfoCopy)MGBDL_CostItmInfoCopy_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 削除する前のチェックを行う<br>
	 */
	abstract public class Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0400.Chk02_CndR up0;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0400.Chk02_CndR.create();

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
			invoke((MGBDL_CostItmInfoCopy)MGBDL_CostItmInfoCopy_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Chk02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0400.Chk02_CndR createChk02_CndR(){
			return mcframe.serverMGBD.MGBDL0400.Chk02_CndR.create();
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
		 * @see mcframe.serverMGBD.MGBDL0400.Chk02_CndR
		 */
		public mcframe.serverMGBD.MGBDL0400.Chk02_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CostItmInfoCopy)MGBDL_CostItmInfoCopy_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 取込処理をする<br>
	 */
	abstract public class Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0400.Chk01_CndR up0;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0400.Chk01_CndR.create();

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
			invoke((MGBDL_CostItmInfoCopy)MGBDL_CostItmInfoCopy_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0400.Chk01_CndR createIns01_CndR(){
			return mcframe.serverMGBD.MGBDL0400.Chk01_CndR.create();
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
		 * @see mcframe.serverMGBD.MGBDL0400.Chk01_CndR
		 */
		public mcframe.serverMGBD.MGBDL0400.Chk01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CostItmInfoCopy)MGBDL_CostItmInfoCopy_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理をする<br>
	 */
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL0400.Chk02_CndR up0;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0400.Chk02_CndR.create();

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
			invoke((MGBDL_CostItmInfoCopy)MGBDL_CostItmInfoCopy_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0400.Chk02_CndR createDel01_CndR(){
			return mcframe.serverMGBD.MGBDL0400.Chk02_CndR.create();
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
		 * @see mcframe.serverMGBD.MGBDL0400.Chk02_CndR
		 */
		public mcframe.serverMGBD.MGBDL0400.Chk02_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CostItmInfoCopy)MGBDL_CostItmInfoCopy_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}