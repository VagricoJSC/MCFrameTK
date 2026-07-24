package mcframe.serverMBBA.MBBAL5010;

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
 * "MBBAL_AprvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBAL_AprvService_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MB";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MBBA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MBBAL5010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBAL_AprvService.Aprv_Chk01 aAprv_Chk01;

	protected void initAprv_Chk01() {
		this.info = PDef.MB_MBBAL5010_Aprv_Chk01_INFO;
		this.aAprv_Chk01 = ((MBBAL_AprvService)this).new Aprv_Chk01();
	}

	public static MBBAL_AprvService.Aprv_Chk01 crtAprv_Chk01() {
		MBBAL_AprvService lgc = new MBBAL_AprvService();
		lgc.initAprv_Chk01();
		return lgc.aAprv_Chk01;
	}

	protected void paramAprv_Chk01(MCParam p) {
		if (this.aAprv_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAprv_Chk01.up0());
		p.addDownBlock(aAprv_Chk01.down0());
	}

	protected void doAprv_Chk01() {
		aAprv_Chk01.call();
	};

	/**
	 * Aprv_Chk01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R createAprv_Chk01_Rslt1R(){
		return mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R.create();
	}

	/**
	 * Aprv_Chk01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R> createAprv_Chk01_Rslt1L(){
		return MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R.class);
	}
	protected MBBAL_AprvService.Aprv_Upd01 aAprv_Upd01;

	protected void initAprv_Upd01() {
		this.info = PDef.MB_MBBAL5010_Aprv_Upd01_INFO;
		this.aAprv_Upd01 = ((MBBAL_AprvService)this).new Aprv_Upd01();
	}

	public static MBBAL_AprvService.Aprv_Upd01 crtAprv_Upd01() {
		MBBAL_AprvService lgc = new MBBAL_AprvService();
		lgc.initAprv_Upd01();
		return lgc.aAprv_Upd01;
	}

	protected void paramAprv_Upd01(MCParam p) {
		if (this.aAprv_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAprv_Upd01.up0());
		p.addDownBlock(aAprv_Upd01.down0());
	}

	protected void doAprv_Upd01() {
		aAprv_Upd01.call();
	};

	/**
	 * Aprv_Upd01_Cnd1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R createAprv_Upd01_Cnd1R(){
		return mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R.create();
	}

	/**
	 * Aprv_Upd01_Cnd1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R> createAprv_Upd01_Cnd1L(){
		return MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R.class);
	}

	/**
	 * Aprv_Upd01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL5010.Aprv_Upd01_Dtl1R createAprv_Upd01_Dtl1R(){
		return mcframe.serverMBBA.MBBAL5010.Aprv_Upd01_Dtl1R.create();
	}

	/**
	 * Aprv_Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Upd01_Dtl1R> createAprv_Upd01_Dtl1L(){
		return MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Upd01_Dtl1R.class);
	}

	/**
	 * Aprv_Upd01_Wk1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL5010.Aprv_Upd01_Wk1R createAprv_Upd01_Wk1R(){
		return mcframe.serverMBBA.MBBAL5010.Aprv_Upd01_Wk1R.create();
	}

	/**
	 * Aprv_Upd01_Wk1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Upd01_Wk1R> createAprv_Upd01_Wk1L(){
		return MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Upd01_Wk1R.class);
	}
	protected MBBAL_AprvService.Aprv_Chk02 aAprv_Chk02;

	protected void initAprv_Chk02() {
		this.info = PDef.MB_MBBAL5010_Aprv_Chk02_INFO;
		this.aAprv_Chk02 = ((MBBAL_AprvService)this).new Aprv_Chk02();
	}

	public static MBBAL_AprvService.Aprv_Chk02 crtAprv_Chk02() {
		MBBAL_AprvService lgc = new MBBAL_AprvService();
		lgc.initAprv_Chk02();
		return lgc.aAprv_Chk02;
	}

	protected void paramAprv_Chk02(MCParam p) {
		if (this.aAprv_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAprv_Chk02.up0());
		p.addDownBlock(aAprv_Chk02.down0());
	}

	protected void doAprv_Chk02() {
		aAprv_Chk02.call();
	};

	/**
	 * Aprv_Chk02_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R createAprv_Chk02_Rslt1R(){
		return mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R.create();
	}

	/**
	 * Aprv_Chk02_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R> createAprv_Chk02_Rslt1L(){
		return MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R.class);
	}
	protected MBBAL_AprvService.Aprv_Upd02 aAprv_Upd02;

	protected void initAprv_Upd02() {
		this.info = PDef.MB_MBBAL5010_Aprv_Upd02_INFO;
		this.aAprv_Upd02 = ((MBBAL_AprvService)this).new Aprv_Upd02();
	}

	public static MBBAL_AprvService.Aprv_Upd02 crtAprv_Upd02() {
		MBBAL_AprvService lgc = new MBBAL_AprvService();
		lgc.initAprv_Upd02();
		return lgc.aAprv_Upd02;
	}

	protected void paramAprv_Upd02(MCParam p) {
		if (this.aAprv_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAprv_Upd02.up0());
	}

	protected void doAprv_Upd02() {
		aAprv_Upd02.call();
	};

	/**
	 * Aprv_Upd02_Cnd1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R createAprv_Upd02_Cnd1R(){
		return mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R.create();
	}

	/**
	 * Aprv_Upd02_Cnd1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R> createAprv_Upd02_Cnd1L(){
		return MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R.class);
	}
	protected MBBAL_AprvService.Aprv_Chk03 aAprv_Chk03;

	protected void initAprv_Chk03() {
		this.info = PDef.MB_MBBAL5010_Aprv_Chk03_INFO;
		this.aAprv_Chk03 = ((MBBAL_AprvService)this).new Aprv_Chk03();
	}

	public static MBBAL_AprvService.Aprv_Chk03 crtAprv_Chk03() {
		MBBAL_AprvService lgc = new MBBAL_AprvService();
		lgc.initAprv_Chk03();
		return lgc.aAprv_Chk03;
	}

	protected void paramAprv_Chk03(MCParam p) {
		if (this.aAprv_Chk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAprv_Chk03.up0());
		p.addDownBlock(aAprv_Chk03.down0());
	}

	protected void doAprv_Chk03() {
		aAprv_Chk03.call();
	};

	/**
	 * Aprv_Chk03_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R createAprv_Chk03_Rslt1R(){
		return mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R.create();
	}

	/**
	 * Aprv_Chk03_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R> createAprv_Chk03_Rslt1L(){
		return MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R.class);
	}
	protected MBBAL_AprvService.Aprv_Upd03 aAprv_Upd03;

	protected void initAprv_Upd03() {
		this.info = PDef.MB_MBBAL5010_Aprv_Upd03_INFO;
		this.aAprv_Upd03 = ((MBBAL_AprvService)this).new Aprv_Upd03();
	}

	public static MBBAL_AprvService.Aprv_Upd03 crtAprv_Upd03() {
		MBBAL_AprvService lgc = new MBBAL_AprvService();
		lgc.initAprv_Upd03();
		return lgc.aAprv_Upd03;
	}

	protected void paramAprv_Upd03(MCParam p) {
		if (this.aAprv_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAprv_Upd03.up0());
	}

	protected void doAprv_Upd03() {
		aAprv_Upd03.call();
	};

	/**
	 * Aprv_Upd03_Cnd1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R createAprv_Upd03_Cnd1R(){
		return mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R.create();
	}

	/**
	 * Aprv_Upd03_Cnd1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R> createAprv_Upd03_Cnd1L(){
		return MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R.class);
	}
	protected MBBAL_AprvService.Aprv_Chk04 aAprv_Chk04;

	protected void initAprv_Chk04() {
		this.info = PDef.MB_MBBAL5010_Aprv_Chk04_INFO;
		this.aAprv_Chk04 = ((MBBAL_AprvService)this).new Aprv_Chk04();
	}

	public static MBBAL_AprvService.Aprv_Chk04 crtAprv_Chk04() {
		MBBAL_AprvService lgc = new MBBAL_AprvService();
		lgc.initAprv_Chk04();
		return lgc.aAprv_Chk04;
	}

	protected void paramAprv_Chk04(MCParam p) {
		if (this.aAprv_Chk04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAprv_Chk04.up0());
		p.addDownBlock(aAprv_Chk04.down0());
	}

	protected void doAprv_Chk04() {
		aAprv_Chk04.call();
	};

	/**
	 * Aprv_Chk04_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R createAprv_Chk04_Rslt1R(){
		return mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R.create();
	}

	/**
	 * Aprv_Chk04_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R> createAprv_Chk04_Rslt1L(){
		return MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R.class);
	}
	protected MBBAL_AprvService.Aprv_Del01 aAprv_Del01;

	protected void initAprv_Del01() {
		this.info = PDef.MB_MBBAL5010_Aprv_Del01_INFO;
		this.aAprv_Del01 = ((MBBAL_AprvService)this).new Aprv_Del01();
	}

	public static MBBAL_AprvService.Aprv_Del01 crtAprv_Del01() {
		MBBAL_AprvService lgc = new MBBAL_AprvService();
		lgc.initAprv_Del01();
		return lgc.aAprv_Del01;
	}

	protected void paramAprv_Del01(MCParam p) {
		if (this.aAprv_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAprv_Del01.up0());
	}

	protected void doAprv_Del01() {
		aAprv_Del01.call();
	};

	/**
	 * Aprv_Del01_Cnd1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R createAprv_Del01_Cnd1R(){
		return mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R.create();
	}

	/**
	 * Aprv_Del01_Cnd1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R> createAprv_Del01_Cnd1L(){
		return MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Aprv_Chk01オペレーション.<p>
	 *
	 * 承認情報を作成する際のチェックを行う。<br>
	 */
	abstract public class Aprv_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Aprv_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R> down0;
		
		
		// コンストラクタ
		protected Aprv_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R.class);
			down0 = MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R.class);

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
			invoke((MBBAL_AprvService)MBBAL_AprvService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Aprv_Chk01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R createAprv_Chk01_Rslt1R(){
			return mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R.create();
		}

		/**
		 * Aprv_Chk01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R> createAprv_Chk01_Rslt1L(){
			return MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>biz_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>aprv_func_typ</td></tr>
		 * 	<tr><td><br></td><td>src_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>src_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>src_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd1</td></tr>
		 * 	<tr><td><br></td><td>src_amt1</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd2</td></tr>
		 * 	<tr><td><br></td><td>src_amt2</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd3</td></tr>
		 * 	<tr><td><br></td><td>src_amt3</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key1</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key2</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key3</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no1</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no2</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBAL_AprvService)MBBAL_AprvService_MC_A.this).info;
		}


	}
	/**
	 * Aprv_Upd01オペレーション.<p>
	 *
	 * 承認情報を作成する。<br>
	 */
	abstract public class Aprv_Upd01 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Aprv_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Upd01_Dtl1R> down0;
		/** [Aprv_Upd01_Wk1]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Upd01_Wk1R> aAprv_Upd01_Wk1;
		
		
		// コンストラクタ
		protected Aprv_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R.class);
			down0 = MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Upd01_Dtl1R.class);
			aAprv_Upd01_Wk1 = MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Upd01_Wk1R.class);

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
			invoke((MBBAL_AprvService)MBBAL_AprvService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Aprv_Upd01_Cnd1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R createAprv_Upd01_Cnd1R(){
			return mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R.create();
		}

		/**
		 * Aprv_Upd01_Cnd1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R> createAprv_Upd01_Cnd1L(){
			return MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R.class);
		}

		/**
		 * Aprv_Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5010.Aprv_Upd01_Dtl1R createAprv_Upd01_Dtl1R(){
			return mcframe.serverMBBA.MBBAL5010.Aprv_Upd01_Dtl1R.create();
		}

		/**
		 * Aprv_Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Upd01_Dtl1R> createAprv_Upd01_Dtl1L(){
			return MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Upd01_Dtl1R.class);
		}

		/**
		 * Aprv_Upd01_Wk1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5010.Aprv_Upd01_Wk1R createAprv_Upd01_Wk1R(){
			return mcframe.serverMBBA.MBBAL5010.Aprv_Upd01_Wk1R.create();
		}

		/**
		 * Aprv_Upd01_Wk1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Upd01_Wk1R> createAprv_Upd01_Wk1L(){
			return MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Upd01_Wk1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>biz_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>aprv_func_typ</td></tr>
		 * 	<tr><td><br></td><td>src_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>src_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>src_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd1</td></tr>
		 * 	<tr><td><br></td><td>src_amt1</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd2</td></tr>
		 * 	<tr><td><br></td><td>src_amt2</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd3</td></tr>
		 * 	<tr><td><br></td><td>src_amt3</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key1</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key2</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key3</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no1</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no2</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk01_Rslt1R> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Upd01_Dtl1R> down0() {
			return down0;
		}


		/**
		 * [Aprv_Upd01_Wk1]ブロックのコンテナaAprv_Upd01_Wk1Lを返します。
		 *
		 * @return Aprv_Upd01_Wk1L
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Upd01_Wk1R> Aprv_Upd01_Wk1() {
			return aAprv_Upd01_Wk1;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBAL_AprvService)MBBAL_AprvService_MC_A.this).info;
		}


	}
	/**
	 * Aprv_Chk02オペレーション.<p>
	 *
	 * 承認次処理済に更新する際のチェックを行う。<br>
	 */
	abstract public class Aprv_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Aprv_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R> down0;
		
		
		// コンストラクタ
		protected Aprv_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R.class);
			down0 = MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R.class);

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
			invoke((MBBAL_AprvService)MBBAL_AprvService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Aprv_Chk02_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R createAprv_Chk02_Rslt1R(){
			return mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R.create();
		}

		/**
		 * Aprv_Chk02_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R> createAprv_Chk02_Rslt1L(){
			return MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBAL_AprvService)MBBAL_AprvService_MC_A.this).info;
		}


	}
	/**
	 * Aprv_Upd02オペレーション.<p>
	 *
	 * 承認次処理済に更新する。<br>
	 */
	abstract public class Aprv_Upd02 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Aprv_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R> up0;
		
		
		// コンストラクタ
		protected Aprv_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R.class);

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
			invoke((MBBAL_AprvService)MBBAL_AprvService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Aprv_Upd02_Cnd1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R createAprv_Upd02_Cnd1R(){
			return mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R.create();
		}

		/**
		 * Aprv_Upd02_Cnd1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R> createAprv_Upd02_Cnd1L(){
			return MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBAL_AprvService)MBBAL_AprvService_MC_A.this).info;
		}


	}
	/**
	 * Aprv_Chk03オペレーション.<p>
	 *
	 * 承認次処理済を解除する際のチェックを行う。<br>
	 */
	abstract public class Aprv_Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Aprv_Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R> down0;
		
		
		// コンストラクタ
		protected Aprv_Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R.class);
			down0 = MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R.class);

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
			invoke((MBBAL_AprvService)MBBAL_AprvService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Aprv_Chk03_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R createAprv_Chk03_Rslt1R(){
			return mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R.create();
		}

		/**
		 * Aprv_Chk03_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R> createAprv_Chk03_Rslt1L(){
			return MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBAL_AprvService)MBBAL_AprvService_MC_A.this).info;
		}


	}
	/**
	 * Aprv_Upd03オペレーション.<p>
	 *
	 * 承認次処理済を解除する。<br>
	 */
	abstract public class Aprv_Upd03 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Aprv_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R> up0;
		
		
		// コンストラクタ
		protected Aprv_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R.class);

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
			invoke((MBBAL_AprvService)MBBAL_AprvService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Aprv_Upd03_Cnd1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R createAprv_Upd03_Cnd1R(){
			return mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R.create();
		}

		/**
		 * Aprv_Upd03_Cnd1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R> createAprv_Upd03_Cnd1L(){
			return MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk02_Rslt1R> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBAL_AprvService)MBBAL_AprvService_MC_A.this).info;
		}


	}
	/**
	 * Aprv_Chk04オペレーション.<p>
	 *
	 * 承認情報を削除する際のチェックを行う。<br>
	 */
	abstract public class Aprv_Chk04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Aprv_Chk04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R> down0;
		
		
		// コンストラクタ
		protected Aprv_Chk04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R.class);
			down0 = MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R.class);

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
			invoke((MBBAL_AprvService)MBBAL_AprvService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Aprv_Chk04_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R createAprv_Chk04_Rslt1R(){
			return mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R.create();
		}

		/**
		 * Aprv_Chk04_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R> createAprv_Chk04_Rslt1L(){
			return MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBAL_AprvService)MBBAL_AprvService_MC_A.this).info;
		}


	}
	/**
	 * Aprv_Del01オペレーション.<p>
	 *
	 * 承認情報を削除する。<br>
	 */
	abstract public class Aprv_Del01 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Aprv_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R> up0;
		
		
		// コンストラクタ
		protected Aprv_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R.class);

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
			invoke((MBBAL_AprvService)MBBAL_AprvService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Aprv_Del01_Cnd1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R createAprv_Del01_Cnd1R(){
			return mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R.create();
		}

		/**
		 * Aprv_Del01_Cnd1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R> createAprv_Del01_Cnd1L(){
			return MCList.create(mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5010.Aprv_Chk04_Rslt1R> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBAL_AprvService)MBBAL_AprvService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}