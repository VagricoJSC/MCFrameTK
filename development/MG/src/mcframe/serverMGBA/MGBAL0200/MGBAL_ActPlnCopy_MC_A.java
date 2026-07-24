package mcframe.serverMGBA.MGBAL0200;

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
 * "MGBAL_ActPlnCopy"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBAL_ActPlnCopy_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MGBA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBAL0200";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBAL_ActPlnCopy.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MG_MGBAL0200_Chk01_INFO;
		this.aChk01 = ((MGBAL_ActPlnCopy)this).new Chk01();
	}

	public static MGBAL_ActPlnCopy.Chk01 crtChk01() {
		MGBAL_ActPlnCopy lgc = new MGBAL_ActPlnCopy();
		lgc.initChk01();
		return lgc.aChk01;
	}

	protected void paramChk01(MCParam p) {
		if (this.aChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk01.up0());
		p.addUpBlock(aChk01.up1());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBA.MGBAL0200.Chk01_CndR createChk01_CndR(){
		return mcframe.serverMGBA.MGBAL0200.Chk01_CndR.create();
	}

	/**
	 * Chk01_Cnd2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBA.MGBAL0200.Chk01_Cnd2R createChk01_Cnd2R(){
		return mcframe.serverMGBA.MGBAL0200.Chk01_Cnd2R.create();
	}

	/**
	 * Chk01_Cnd2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBA.MGBAL0200.Chk01_Cnd2R> createChk01_Cnd2L(){
		return MCList.create(mcframe.serverMGBA.MGBAL0200.Chk01_Cnd2R.class);
	}
	protected MGBAL_ActPlnCopy.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MG_MGBAL0200_Ins01_INFO;
		this.aIns01 = ((MGBAL_ActPlnCopy)this).new Ins01();
	}

	public static MGBAL_ActPlnCopy.Ins01 crtIns01() {
		MGBAL_ActPlnCopy lgc = new MGBAL_ActPlnCopy();
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
	public mcframe.serverMGBA.MGBAL0200.Chk01_CndR createIns01_CndR(){
		return mcframe.serverMGBA.MGBAL0200.Chk01_CndR.create();
	}
	protected MGBAL_ActPlnCopy.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MG_MGBAL0200_Chk02_INFO;
		this.aChk02 = ((MGBAL_ActPlnCopy)this).new Chk02();
	}

	public static MGBAL_ActPlnCopy.Chk02 crtChk02() {
		MGBAL_ActPlnCopy lgc = new MGBAL_ActPlnCopy();
		lgc.initChk02();
		return lgc.aChk02;
	}

	protected void paramChk02(MCParam p) {
		if (this.aChk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk02.up0());
		p.addUpBlock(aChk02.up1());
	}

	protected void doChk02() {
		aChk02.call();
	};

	/**
	 * Chk02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBA.MGBAL0200.Chk01_CndR createChk02_CndR(){
		return mcframe.serverMGBA.MGBAL0200.Chk01_CndR.create();
	}

	/**
	 * Chk02_Cnd2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBA.MGBAL0200.Chk01_Cnd2R createChk02_Cnd2R(){
		return mcframe.serverMGBA.MGBAL0200.Chk01_Cnd2R.create();
	}

	/**
	 * Chk02_Cnd2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBA.MGBAL0200.Chk01_Cnd2R> createChk02_Cnd2L(){
		return MCList.create(mcframe.serverMGBA.MGBAL0200.Chk01_Cnd2R.class);
	}
	protected MGBAL_ActPlnCopy.Ins02 aIns02;

	protected void initIns02() {
		this.info = PDef.MG_MGBAL0200_Ins02_INFO;
		this.aIns02 = ((MGBAL_ActPlnCopy)this).new Ins02();
	}

	public static MGBAL_ActPlnCopy.Ins02 crtIns02() {
		MGBAL_ActPlnCopy lgc = new MGBAL_ActPlnCopy();
		lgc.initIns02();
		return lgc.aIns02;
	}

	protected void paramIns02(MCParam p) {
		if (this.aIns02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns02.up0());
	}

	protected void doIns02() {
		aIns02.call();
	};

	/**
	 * Ins02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBA.MGBAL0200.Chk01_CndR createIns02_CndR(){
		return mcframe.serverMGBA.MGBAL0200.Chk01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 月別コピー前にチェックする。<br>
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
		private final mcframe.serverMGBA.MGBAL0200.Chk01_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBA.MGBAL0200.Chk01_Cnd2R> up1;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBA.MGBAL0200.Chk01_CndR.create();
			up1 = MCList.create(mcframe.serverMGBA.MGBAL0200.Chk01_Cnd2R.class);

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBAL_ActPlnCopy)MGBAL_ActPlnCopy_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBA.MGBAL0200.Chk01_CndR createChk01_CndR(){
			return mcframe.serverMGBA.MGBAL0200.Chk01_CndR.create();
		}

		/**
		 * Chk01_Cnd2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBA.MGBAL0200.Chk01_Cnd2R createChk01_Cnd2R(){
			return mcframe.serverMGBA.MGBAL0200.Chk01_Cnd2R.create();
		}

		/**
		 * Chk01_Cnd2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBA.MGBAL0200.Chk01_Cnd2R> createChk01_Cnd2L(){
			return MCList.create(mcframe.serverMGBA.MGBAL0200.Chk01_Cnd2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>act_calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>act_ym_fr</td></tr>
		 * 	<tr><td><br></td><td>act_ym_to</td></tr>
		 * 	<tr><td><br></td><td>pln_calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>pln_ym_fr</td></tr>
		 * 	<tr><td><br></td><td>mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_wk_flg</td></tr>
		 * 	<tr><td><br></td><td>other_wk_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * 	<tr><td><br></td><td>amt_flg_str</td></tr>
		 * 	<tr><td><br></td><td>trd_amt_flg_str</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBA.MGBAL0200.Chk01_CndR
		 */
		public mcframe.serverMGBA.MGBAL0200.Chk01_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>act_calc_ctg_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBA.MGBAL0200.Chk01_Cnd2R> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBAL_ActPlnCopy)MGBAL_ActPlnCopy_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 月別コピーする。<br>
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
		private final mcframe.serverMGBA.MGBAL0200.Chk01_CndR up0;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBA.MGBAL0200.Chk01_CndR.create();

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
			invoke((MGBAL_ActPlnCopy)MGBAL_ActPlnCopy_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBA.MGBAL0200.Chk01_CndR createIns01_CndR(){
			return mcframe.serverMGBA.MGBAL0200.Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>act_calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>act_ym_fr</td></tr>
		 * 	<tr><td><br></td><td>act_ym_to</td></tr>
		 * 	<tr><td><br></td><td>pln_calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>pln_ym_fr</td></tr>
		 * 	<tr><td><br></td><td>mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_wk_flg</td></tr>
		 * 	<tr><td><br></td><td>other_wk_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * 	<tr><td><br></td><td>amt_flg_str</td></tr>
		 * 	<tr><td><br></td><td>trd_amt_flg_str</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBA.MGBAL0200.Chk01_CndR
		 */
		public mcframe.serverMGBA.MGBAL0200.Chk01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBAL_ActPlnCopy)MGBAL_ActPlnCopy_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 集計コピー前にチェックする。<br>
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
		private final mcframe.serverMGBA.MGBAL0200.Chk01_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBA.MGBAL0200.Chk01_Cnd2R> up1;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBA.MGBAL0200.Chk01_CndR.create();
			up1 = MCList.create(mcframe.serverMGBA.MGBAL0200.Chk01_Cnd2R.class);

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBAL_ActPlnCopy)MGBAL_ActPlnCopy_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Chk02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBA.MGBAL0200.Chk01_CndR createChk02_CndR(){
			return mcframe.serverMGBA.MGBAL0200.Chk01_CndR.create();
		}

		/**
		 * Chk02_Cnd2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBA.MGBAL0200.Chk01_Cnd2R createChk02_Cnd2R(){
			return mcframe.serverMGBA.MGBAL0200.Chk01_Cnd2R.create();
		}

		/**
		 * Chk02_Cnd2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBA.MGBAL0200.Chk01_Cnd2R> createChk02_Cnd2L(){
			return MCList.create(mcframe.serverMGBA.MGBAL0200.Chk01_Cnd2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>act_calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>act_ym_fr</td></tr>
		 * 	<tr><td><br></td><td>act_ym_to</td></tr>
		 * 	<tr><td><br></td><td>pln_calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>pln_ym_fr</td></tr>
		 * 	<tr><td><br></td><td>mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_wk_flg</td></tr>
		 * 	<tr><td><br></td><td>other_wk_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * 	<tr><td><br></td><td>amt_flg_str</td></tr>
		 * 	<tr><td><br></td><td>trd_amt_flg_str</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBA.MGBAL0200.Chk01_CndR
		 */
		public mcframe.serverMGBA.MGBAL0200.Chk01_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>act_calc_ctg_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBA.MGBAL0200.Chk01_Cnd2R> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBAL_ActPlnCopy)MGBAL_ActPlnCopy_MC_A.this).info;
		}


	}
	/**
	 * Ins02オペレーション.<p>
	 *
	 * 集計コピーする。<br>
	 */
	abstract public class Ins02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ins02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBA.MGBAL0200.Chk01_CndR up0;
		
		
		// コンストラクタ
		protected Ins02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBA.MGBAL0200.Chk01_CndR.create();

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
			invoke((MGBAL_ActPlnCopy)MGBAL_ActPlnCopy_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Ins02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBA.MGBAL0200.Chk01_CndR createIns02_CndR(){
			return mcframe.serverMGBA.MGBAL0200.Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>act_calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>act_ym_fr</td></tr>
		 * 	<tr><td><br></td><td>act_ym_to</td></tr>
		 * 	<tr><td><br></td><td>pln_calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>pln_ym_fr</td></tr>
		 * 	<tr><td><br></td><td>mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_wk_flg</td></tr>
		 * 	<tr><td><br></td><td>other_wk_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_flg</td></tr>
		 * 	<tr><td><br></td><td>amt_flg_str</td></tr>
		 * 	<tr><td><br></td><td>trd_amt_flg_str</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBA.MGBAL0200.Chk01_CndR
		 */
		public mcframe.serverMGBA.MGBAL0200.Chk01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBAL_ActPlnCopy)MGBAL_ActPlnCopy_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}