package mcframe.serverMSUC.MSUCL0090;

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
 * "MSUCL_SCMLinkUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSUCL_SCMLinkUtil_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSUC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSUCL0090";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 aSCMLinkUtil_Srch01;

	protected void initSCMLinkUtil_Srch01() {
		this.info = PDef.MS_MSUCL0090_SCMLinkUtil_Srch01_INFO;
		this.aSCMLinkUtil_Srch01 = ((MSUCL_SCMLinkUtil)this).new SCMLinkUtil_Srch01();
	}

	public static MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 crtSCMLinkUtil_Srch01() {
		MSUCL_SCMLinkUtil lgc = new MSUCL_SCMLinkUtil();
		lgc.initSCMLinkUtil_Srch01();
		return lgc.aSCMLinkUtil_Srch01;
	}

	protected void paramSCMLinkUtil_Srch01(MCParam p) {
		if (this.aSCMLinkUtil_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSCMLinkUtil_Srch01.up0());
		p.addDownBlock(aSCMLinkUtil_Srch01.down0());
	}

	protected void doSCMLinkUtil_Srch01() {
		aSCMLinkUtil_Srch01.call();
	};

	/**
	 * SCMLinkUtil_Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch01_CndR createSCMLinkUtil_Srch01_CndR(){
		return mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch01_CndR.create();
	}

	/**
	 * SCMLinkUtil_Srch01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch01_CndR> createSCMLinkUtil_Srch01_CndL(){
		return MCList.create(mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch01_CndR.class);
	}
	protected MSUCL_SCMLinkUtil.SCMLinkUtil_Srch02 aSCMLinkUtil_Srch02;

	protected void initSCMLinkUtil_Srch02() {
		this.info = PDef.MS_MSUCL0090_SCMLinkUtil_Srch02_INFO;
		this.aSCMLinkUtil_Srch02 = ((MSUCL_SCMLinkUtil)this).new SCMLinkUtil_Srch02();
	}

	public static MSUCL_SCMLinkUtil.SCMLinkUtil_Srch02 crtSCMLinkUtil_Srch02() {
		MSUCL_SCMLinkUtil lgc = new MSUCL_SCMLinkUtil();
		lgc.initSCMLinkUtil_Srch02();
		return lgc.aSCMLinkUtil_Srch02;
	}

	protected void paramSCMLinkUtil_Srch02(MCParam p) {
		if (this.aSCMLinkUtil_Srch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSCMLinkUtil_Srch02.up0());
		p.addDownBlock(aSCMLinkUtil_Srch02.down0());
	}

	protected void doSCMLinkUtil_Srch02() {
		aSCMLinkUtil_Srch02.call();
	};

	/**
	 * SCMLinkUtil_Srch02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch02_CndR createSCMLinkUtil_Srch02_CndR(){
		return mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch02_CndR.create();
	}

	/**
	 * SCMLinkUtil_Srch02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch02_CndR> createSCMLinkUtil_Srch02_CndL(){
		return MCList.create(mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch02_CndR.class);
	}
	protected MSUCL_SCMLinkUtil.SCMLinkUtil_Srch03 aSCMLinkUtil_Srch03;

	protected void initSCMLinkUtil_Srch03() {
		this.info = PDef.MS_MSUCL0090_SCMLinkUtil_Srch03_INFO;
		this.aSCMLinkUtil_Srch03 = ((MSUCL_SCMLinkUtil)this).new SCMLinkUtil_Srch03();
	}

	public static MSUCL_SCMLinkUtil.SCMLinkUtil_Srch03 crtSCMLinkUtil_Srch03() {
		MSUCL_SCMLinkUtil lgc = new MSUCL_SCMLinkUtil();
		lgc.initSCMLinkUtil_Srch03();
		return lgc.aSCMLinkUtil_Srch03;
	}

	protected void paramSCMLinkUtil_Srch03(MCParam p) {
		if (this.aSCMLinkUtil_Srch03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSCMLinkUtil_Srch03.up0());
		p.addDownBlock(aSCMLinkUtil_Srch03.down0());
	}

	protected void doSCMLinkUtil_Srch03() {
		aSCMLinkUtil_Srch03.call();
	};

	/**
	 * SCMLinkUtil_Srch03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch03_CndR createSCMLinkUtil_Srch03_CndR(){
		return mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch03_CndR.create();
	}

	/**
	 * SCMLinkUtil_Srch03_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch03_CndR> createSCMLinkUtil_Srch03_CndL(){
		return MCList.create(mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch03_CndR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * SCMLinkUtil_Srch01オペレーション.<p>
	 *
	 * 外部システムＣＤを取得する<br>
	 */
	abstract public class SCMLinkUtil_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SCMLinkUtil_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch01_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch01_CndR> down0;
		
		
		// コンストラクタ
		protected SCMLinkUtil_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch01_CndR.class);
			down0 = MCList.create(mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch01_CndR.class);

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
			invoke((MSUCL_SCMLinkUtil)MSUCL_SCMLinkUtil_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SCMLinkUtil_Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch01_CndR createSCMLinkUtil_Srch01_CndR(){
			return mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch01_CndR.create();
		}

		/**
		 * SCMLinkUtil_Srch01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch01_CndR> createSCMLinkUtil_Srch01_CndL(){
			return MCList.create(mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch01_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch01_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>not_send_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>not_dup_imp_flg</td></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_split_flg</td></tr>
		 * 	<tr><td><br></td><td>null_val_if_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch01_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSUCL_SCMLinkUtil)MSUCL_SCMLinkUtil_MC_A.this).info;
		}


	}
	/**
	 * SCMLinkUtil_Srch02オペレーション.<p>
	 *
	 * 製造指図送信（工程指図送信、出来高予定送信、投入予定送信）の送信対象を判断するフラグ（ＭＥＳフラグ）を取得する<br>
	 */
	abstract public class SCMLinkUtil_Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SCMLinkUtil_Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch02_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch02_CndR> down0;
		
		
		// コンストラクタ
		protected SCMLinkUtil_Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch02_CndR.class);
			down0 = MCList.create(mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch02_CndR.class);

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
			invoke((MSUCL_SCMLinkUtil)MSUCL_SCMLinkUtil_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SCMLinkUtil_Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch02_CndR createSCMLinkUtil_Srch02_CndR(){
			return mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch02_CndR.create();
		}

		/**
		 * SCMLinkUtil_Srch02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch02_CndR> createSCMLinkUtil_Srch02_CndL(){
			return MCList.create(mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch02_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch02_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch02_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSUCL_SCMLinkUtil)MSUCL_SCMLinkUtil_MC_A.this).info;
		}


	}
	/**
	 * SCMLinkUtil_Srch03オペレーション.<p>
	 *
	 * 検査指図送信の送信対象を判断するフラグ（ＬＩＭＳフラグ）を取得する<br>
	 */
	abstract public class SCMLinkUtil_Srch03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SCMLinkUtil_Srch03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch03_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch03_CndR> down0;
		
		
		// コンストラクタ
		protected SCMLinkUtil_Srch03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch03_CndR.class);
			down0 = MCList.create(mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch03_CndR.class);

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
			invoke((MSUCL_SCMLinkUtil)MSUCL_SCMLinkUtil_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SCMLinkUtil_Srch03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch03_CndR createSCMLinkUtil_Srch03_CndR(){
			return mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch03_CndR.create();
		}

		/**
		 * SCMLinkUtil_Srch03_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch03_CndR> createSCMLinkUtil_Srch03_CndL(){
			return MCList.create(mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch03_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch03_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>lims_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSUC.MSUCL0090.SCMLinkUtil_Srch03_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSUCL_SCMLinkUtil)MSUCL_SCMLinkUtil_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}