package mcframe.serverMBBA.MBBAL5030;

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
 * "MBBAL_AprvRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBAL_AprvRegService_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
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
	public static final String LOGIC_ID = "MBBAL5030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBAL_AprvRegService.Aprv_Srch01 aAprv_Srch01;

	protected void initAprv_Srch01() {
		this.info = PDef.MB_MBBAL5030_Aprv_Srch01_INFO;
		this.aAprv_Srch01 = ((MBBAL_AprvRegService)this).new Aprv_Srch01();
	}

	public static MBBAL_AprvRegService.Aprv_Srch01 crtAprv_Srch01() {
		MBBAL_AprvRegService lgc = new MBBAL_AprvRegService();
		lgc.initAprv_Srch01();
		return lgc.aAprv_Srch01;
	}

	protected void paramAprv_Srch01(MCParam p) {
		if (this.aAprv_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAprv_Srch01.up0());
		p.addDownBlock(aAprv_Srch01.down0());
	}

	protected void doAprv_Srch01() {
		aAprv_Srch01.call();
	};

	/**
	 * Aprv_Srch01_Cnd1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL5030.Aprv_Srch01_Cnd1R createAprv_Srch01_Cnd1R(){
		return mcframe.serverMBBA.MBBAL5030.Aprv_Srch01_Cnd1R.create();
	}

	/**
	 * Aprv_Srch01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL5030.Aprv_Srch01_Dtl1R createAprv_Srch01_Dtl1R(){
		return mcframe.serverMBBA.MBBAL5030.Aprv_Srch01_Dtl1R.create();
	}

	/**
	 * Aprv_Srch01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Srch01_Dtl1R> createAprv_Srch01_Dtl1L(){
		return MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Srch01_Dtl1R.class);
	}
	protected MBBAL_AprvRegService.Aprv_Srch02 aAprv_Srch02;

	protected void initAprv_Srch02() {
		this.info = PDef.MB_MBBAL5030_Aprv_Srch02_INFO;
		this.aAprv_Srch02 = ((MBBAL_AprvRegService)this).new Aprv_Srch02();
	}

	public static MBBAL_AprvRegService.Aprv_Srch02 crtAprv_Srch02() {
		MBBAL_AprvRegService lgc = new MBBAL_AprvRegService();
		lgc.initAprv_Srch02();
		return lgc.aAprv_Srch02;
	}

	protected void paramAprv_Srch02(MCParam p) {
		if (this.aAprv_Srch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAprv_Srch02.up0());
		p.addDownBlock(aAprv_Srch02.down0());
		p.addDownBlock(aAprv_Srch02.down1());
	}

	protected void doAprv_Srch02() {
		aAprv_Srch02.call();
	};

	/**
	 * Aprv_Srch02_Cnd1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Cnd1R createAprv_Srch02_Cnd1R(){
		return mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Cnd1R.create();
	}

	/**
	 * Aprv_Srch02_Hdr1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Hdr1R createAprv_Srch02_Hdr1R(){
		return mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Hdr1R.create();
	}

	/**
	 * Aprv_Srch02_Hdr1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Hdr1R> createAprv_Srch02_Hdr1L(){
		return MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Hdr1R.class);
	}

	/**
	 * Aprv_Srch02_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Dtl1R createAprv_Srch02_Dtl1R(){
		return mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Dtl1R.create();
	}

	/**
	 * Aprv_Srch02_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Dtl1R> createAprv_Srch02_Dtl1L(){
		return MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Dtl1R.class);
	}
	protected MBBAL_AprvRegService.Aprv_Chk01 aAprv_Chk01;

	protected void initAprv_Chk01() {
		this.info = PDef.MB_MBBAL5030_Aprv_Chk01_INFO;
		this.aAprv_Chk01 = ((MBBAL_AprvRegService)this).new Aprv_Chk01();
	}

	public static MBBAL_AprvRegService.Aprv_Chk01 crtAprv_Chk01() {
		MBBAL_AprvRegService lgc = new MBBAL_AprvRegService();
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
	public mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R createAprv_Chk01_Rslt1R(){
		return mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.create();
	}

	/**
	 * Aprv_Chk01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> createAprv_Chk01_Rslt1L(){
		return MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);
	}
	protected MBBAL_AprvRegService.Aprv_Upd01 aAprv_Upd01;

	protected void initAprv_Upd01() {
		this.info = PDef.MB_MBBAL5030_Aprv_Upd01_INFO;
		this.aAprv_Upd01 = ((MBBAL_AprvRegService)this).new Aprv_Upd01();
	}

	public static MBBAL_AprvRegService.Aprv_Upd01 crtAprv_Upd01() {
		MBBAL_AprvRegService lgc = new MBBAL_AprvRegService();
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
	 * Aprv_Upd01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R createAprv_Upd01_Dtl1R(){
		return mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.create();
	}

	/**
	 * Aprv_Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> createAprv_Upd01_Dtl1L(){
		return MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);
	}
	protected MBBAL_AprvRegService.Aprv_Chk02 aAprv_Chk02;

	protected void initAprv_Chk02() {
		this.info = PDef.MB_MBBAL5030_Aprv_Chk02_INFO;
		this.aAprv_Chk02 = ((MBBAL_AprvRegService)this).new Aprv_Chk02();
	}

	public static MBBAL_AprvRegService.Aprv_Chk02 crtAprv_Chk02() {
		MBBAL_AprvRegService lgc = new MBBAL_AprvRegService();
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
	public mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R createAprv_Chk02_Rslt1R(){
		return mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.create();
	}

	/**
	 * Aprv_Chk02_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> createAprv_Chk02_Rslt1L(){
		return MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);
	}
	protected MBBAL_AprvRegService.Aprv_Upd02 aAprv_Upd02;

	protected void initAprv_Upd02() {
		this.info = PDef.MB_MBBAL5030_Aprv_Upd02_INFO;
		this.aAprv_Upd02 = ((MBBAL_AprvRegService)this).new Aprv_Upd02();
	}

	public static MBBAL_AprvRegService.Aprv_Upd02 crtAprv_Upd02() {
		MBBAL_AprvRegService lgc = new MBBAL_AprvRegService();
		lgc.initAprv_Upd02();
		return lgc.aAprv_Upd02;
	}

	protected void paramAprv_Upd02(MCParam p) {
		if (this.aAprv_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAprv_Upd02.up0());
		p.addDownBlock(aAprv_Upd02.down0());
	}

	protected void doAprv_Upd02() {
		aAprv_Upd02.call();
	};

	/**
	 * Aprv_Upd02_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R createAprv_Upd02_Dtl1R(){
		return mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.create();
	}

	/**
	 * Aprv_Upd02_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> createAprv_Upd02_Dtl1L(){
		return MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);
	}
	protected MBBAL_AprvRegService.Aprv_Chk03 aAprv_Chk03;

	protected void initAprv_Chk03() {
		this.info = PDef.MB_MBBAL5030_Aprv_Chk03_INFO;
		this.aAprv_Chk03 = ((MBBAL_AprvRegService)this).new Aprv_Chk03();
	}

	public static MBBAL_AprvRegService.Aprv_Chk03 crtAprv_Chk03() {
		MBBAL_AprvRegService lgc = new MBBAL_AprvRegService();
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
	public mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R createAprv_Chk03_Rslt1R(){
		return mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.create();
	}

	/**
	 * Aprv_Chk03_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> createAprv_Chk03_Rslt1L(){
		return MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);
	}
	protected MBBAL_AprvRegService.Aprv_Upd03 aAprv_Upd03;

	protected void initAprv_Upd03() {
		this.info = PDef.MB_MBBAL5030_Aprv_Upd03_INFO;
		this.aAprv_Upd03 = ((MBBAL_AprvRegService)this).new Aprv_Upd03();
	}

	public static MBBAL_AprvRegService.Aprv_Upd03 crtAprv_Upd03() {
		MBBAL_AprvRegService lgc = new MBBAL_AprvRegService();
		lgc.initAprv_Upd03();
		return lgc.aAprv_Upd03;
	}

	protected void paramAprv_Upd03(MCParam p) {
		if (this.aAprv_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAprv_Upd03.up0());
		p.addDownBlock(aAprv_Upd03.down0());
	}

	protected void doAprv_Upd03() {
		aAprv_Upd03.call();
	};

	/**
	 * Aprv_Upd03_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R createAprv_Upd03_Dtl1R(){
		return mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.create();
	}

	/**
	 * Aprv_Upd03_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> createAprv_Upd03_Dtl1L(){
		return MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Aprv_Srch01オペレーション.<p>
	 *
	 * 承認情報を検索する。<br>
	 */
	abstract public class Aprv_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Aprv_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBA.MBBAL5030.Aprv_Srch01_Cnd1R up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Srch01_Dtl1R> down0;
		
		
		// コンストラクタ
		protected Aprv_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBA.MBBAL5030.Aprv_Srch01_Cnd1R.create();
			down0 = MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Srch01_Dtl1R.class);

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
			invoke((MBBAL_AprvRegService)MBBAL_AprvRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Aprv_Srch01_Cnd1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5030.Aprv_Srch01_Cnd1R createAprv_Srch01_Cnd1R(){
			return mcframe.serverMBBA.MBBAL5030.Aprv_Srch01_Cnd1R.create();
		}

		/**
		 * Aprv_Srch01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5030.Aprv_Srch01_Dtl1R createAprv_Srch01_Dtl1R(){
			return mcframe.serverMBBA.MBBAL5030.Aprv_Srch01_Dtl1R.create();
		}

		/**
		 * Aprv_Srch01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Srch01_Dtl1R> createAprv_Srch01_Dtl1L(){
			return MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Srch01_Dtl1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_func_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no1</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no2</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ins_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>ins_dt_to</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_tm_fr</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_tm_to</td></tr>
		 * 	<tr><td><br></td><td>ins_biz_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ins_biz_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>main_role_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_role_flg</td></tr>
		 * 	<tr><td><br></td><td>next_opr_flg</td></tr>
		 * 	<tr><td><br></td><td>not_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>usr_dtl_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBA.MBBAL5030.Aprv_Srch01_Cnd1R
		 */
		public mcframe.serverMBBA.MBBAL5030.Aprv_Srch01_Cnd1R up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no_seq</td></tr>
		 * 	<tr><td><br></td><td>next_opr_flg</td></tr>
		 * 	<tr><td><br></td><td>ins_dt</td></tr>
		 * 	<tr><td><br></td><td>biz_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>biz_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>src_ins_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>src_ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_func_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_func_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>src_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>src_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>src_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>src_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>src_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>src_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd1</td></tr>
		 * 	<tr><td><br></td><td>src_cur_nm1</td></tr>
		 * 	<tr><td><br></td><td>src_amt1</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd2</td></tr>
		 * 	<tr><td><br></td><td>src_cur_nm2</td></tr>
		 * 	<tr><td><br></td><td>src_amt2</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd3</td></tr>
		 * 	<tr><td><br></td><td>src_cur_nm3</td></tr>
		 * 	<tr><td><br></td><td>src_amt3</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key1</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key2</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key3</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no1</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no2</td></tr>
		 * 	<tr><td><br></td><td>main_role_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_role_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_seq</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_tm</td></tr>
		 * 	<tr><td><br></td><td>deputy_flg</td></tr>
		 * 	<tr><td><br></td><td>deputy_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>deputy_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>not_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>email1</td></tr>
		 * 	<tr><td><br></td><td>email2</td></tr>
		 * 	<tr><td><br></td><td>email3</td></tr>
		 * 	<tr><td><br></td><td>tel1</td></tr>
		 * 	<tr><td><br></td><td>tel2</td></tr>
		 * 	<tr><td><br></td><td>tel3</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * 	<tr><td><br></td><td>match_cnd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Srch01_Dtl1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBAL_AprvRegService)MBBAL_AprvRegService_MC_A.this).info;
		}


	}
	/**
	 * Aprv_Srch02オペレーション.<p>
	 *
	 * 承認状況を検索する。<br>
	 */
	abstract public class Aprv_Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Aprv_Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Cnd1R up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Hdr1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Dtl1R> down1;
		
		/**
		 * 連携情報 AP<p>
		 *
		 * 連携先 mcframe.serverMBBA.MBBAL0010.MBBAL_AprvStsSrch.Srch01 （{@link #so01}）<br>
		 */
		public final String AP = "AP";

		/**
		 * 連携オペレーション so01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMBBA.MBBAL0010.MBBAL_AprvStsSrch.Srch01}<br>
		 * 第1 上りブロッククラス mcframe.serverMBBA.MBBAL0010.Srch01_Cnd1R （{@link #so01_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMBBA.MBBAL0010.Srch01_Hdr1R&gt; （{@link #so01_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMBBA.MBBAL0010.Srch01_Dtl1R&gt; （{@link #so01_down1}）<br>
		 */
		public final mcframe.serverMBBA.MBBAL0010.MBBAL_AprvStsSrch.Srch01 so01;
		// 連携ロジック上り
		public final mcframe.serverMBBA.MBBAL0010.Srch01_Cnd1R so01_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMBBA.MBBAL0010.Srch01_Hdr1R> so01_down0;
		public final MCList<mcframe.serverMBBA.MBBAL0010.Srch01_Dtl1R> so01_down1;
		
		// コンストラクタ
		protected Aprv_Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Cnd1R.create();
			down0 = MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Hdr1R.class);
			down1 = MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Dtl1R.class);

			// 連携オペレーションの初期化
			so01 = mcframe.serverMBBA.MBBAL0010.MBBAL_AprvStsSrch.crtSrch01();
			
			// 連携オペレーションのコンテナ取得
			so01_up0 = (mcframe.serverMBBA.MBBAL0010.Srch01_Cnd1R)so01.up(0);
			so01_down0 = (MCList<mcframe.serverMBBA.MBBAL0010.Srch01_Hdr1R>)so01.down(0);
			so01_down1 = (MCList<mcframe.serverMBBA.MBBAL0010.Srch01_Dtl1R>)so01.down(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(AP, so01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * AP<br>
		 * up0() => mcframe.serverMBBA.MBBAL0010.Srch01_Cnd1R （{@link #so01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(AP)) {
				up_AP(so01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * AP<br>
		 * MCList&lt;mcframe.serverMBBA.MBBAL0010.Srch01_Hdr1R&gt;（{@link #so01_down0}）=> down0()<br>
		 * MCList&lt;mcframe.serverMBBA.MBBAL0010.Srch01_Dtl1R&gt;（{@link #so01_down1}）=> down1()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(AP)) {
				down_AP(down0(), down1(), so01_down0, so01_down1);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MBBAL_AprvRegService)MBBAL_AprvRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Aprv_Srch02_Cnd1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Cnd1R createAprv_Srch02_Cnd1R(){
			return mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Cnd1R.create();
		}

		/**
		 * Aprv_Srch02_Hdr1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Hdr1R createAprv_Srch02_Hdr1R(){
			return mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Hdr1R.create();
		}

		/**
		 * Aprv_Srch02_Hdr1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Hdr1R> createAprv_Srch02_Hdr1L(){
			return MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Hdr1R.class);
		}

		/**
		 * Aprv_Srch02_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Dtl1R createAprv_Srch02_Dtl1R(){
			return mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Dtl1R.create();
		}

		/**
		 * Aprv_Srch02_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Dtl1R> createAprv_Srch02_Dtl1L(){
			return MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Dtl1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_func_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no1</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no2</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ins_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>ins_dt_to</td></tr>
		 * 	<tr><td><br></td><td>ins_biz_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ins_biz_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>usr_dtl_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Cnd1R
		 */
		public mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Cnd1R up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no_seq</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>last_aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>last_aprv_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>last_aprv_tm</td></tr>
		 * 	<tr><td><br></td><td>ins_dt</td></tr>
		 * 	<tr><td><br></td><td>biz_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>biz_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>src_ins_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>src_ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_func_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_func_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>src_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>src_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>src_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>src_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>src_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>src_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd1</td></tr>
		 * 	<tr><td><br></td><td>src_cur_nm1</td></tr>
		 * 	<tr><td><br></td><td>src_amt1</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd2</td></tr>
		 * 	<tr><td><br></td><td>src_cur_nm2</td></tr>
		 * 	<tr><td><br></td><td>src_amt2</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd3</td></tr>
		 * 	<tr><td><br></td><td>src_cur_nm3</td></tr>
		 * 	<tr><td><br></td><td>src_amt3</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key1</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key2</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key3</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no1</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no2</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Hdr1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr.aprv_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.aprv_no_seq</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_seq</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_tm</td></tr>
		 * 	<tr><td><br></td><td>deputy_flg</td></tr>
		 * 	<tr><td><br></td><td>deputy_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>deputy_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>email1</td></tr>
		 * 	<tr><td><br></td><td>email2</td></tr>
		 * 	<tr><td><br></td><td>email3</td></tr>
		 * 	<tr><td><br></td><td>tel1</td></tr>
		 * 	<tr><td><br></td><td>tel2</td></tr>
		 * 	<tr><td><br></td><td>tel3</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Dtl1R> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBAL_AprvRegService)MBBAL_AprvRegService_MC_A.this).info;
		}

		//-----------------------AP専用up関連メソッド--------------------------
		/**
		 * オペレーショングループAPの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_AP(mcframe.serverMBBA.MBBAL0010.Srch01_Cnd1R dest0_0, mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Cnd1R src_Aprv_Srch02_Cnd1){
			up_AP_so01_0(dest0_0, src_Aprv_Srch02_Cnd1);
		}
		
		/**
		 * 連携処理AP_so01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_AP_so01_0() {
			MCRowMapper map = new Map_up_AP_so01_0();
			return map;
		}

		/**
		 * 連携処理AP_so01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_AP_so01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("aprv_func_typ", "aprv_func_typ");
				addColumnPathMap("aprv_no", "aprv_no");
				addColumnPathMap("aprv_src_no1", "aprv_src_no1");
				addColumnPathMap("aprv_src_no2", "aprv_src_no2");
				addColumnPathMap("aprv_sts_typ", "aprv_sts_typ");
				addColumnPathMap("ins_dt_fr", "ins_dt_fr");
				addColumnPathMap("ins_dt_to", "ins_dt_to");
				addColumnPathMap("ins_biz_usr_cd", "ins_biz_usr_cd");
				addColumnPathMap("ins_biz_usr_nm", "ins_biz_usr_nm");
				addColumnPathMap("usr_dtl_flg", "usr_dtl_flg");
			}
		}

		/**
		 * 連携処理AP_so01の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_AP_so01_0(mcframe.serverMBBA.MBBAL0010.Srch01_Cnd1R dest, mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Cnd1R src) {
			createMap_up_AP_so01_0().copy(dest, src);
		}

		//-----------------------AP専用down関連メソッド--------------------------

		/**
		 * オペレーショングループAPの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_AP(MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Hdr1R> dest_Aprv_Srch02_Hdr1, MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Dtl1R> dest_Aprv_Srch02_Dtl1, MCList<mcframe.serverMBBA.MBBAL0010.Srch01_Hdr1R> src0_0, MCList<mcframe.serverMBBA.MBBAL0010.Srch01_Dtl1R> src0_1){
			down_AP_so01_0(dest_Aprv_Srch02_Hdr1, src0_0);
			down_AP_so01_1(dest_Aprv_Srch02_Dtl1, src0_1);
		}

		/**
		 * 連携処理AP_so01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_AP_so01_0() {
			MCRowMapper map = new Map_down_AP_so01_0();
			return map;
		}

		/**
		 * 連携処理AP_so01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_AP_so01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("aprv_no", "aprv_no");
				addColumnPathMap("aprv_no_seq", "aprv_no_seq");
				addColumnPathMap("aprv_sts_typ", "aprv_sts_typ");
				addColumnPathMap("aprv_sts_typ_nm", "aprv_sts_typ_nm");
				addColumnPathMap("last_aprv_usr_cd", "last_aprv_usr_cd");
				addColumnPathMap("last_aprv_usr_nm", "last_aprv_usr_nm");
				addColumnPathMap("last_aprv_tm", "last_aprv_tm");
				addColumnPathMap("ins_dt", "ins_dt");
				addColumnPathMap("biz_usr_cd", "biz_usr_cd");
				addColumnPathMap("biz_usr_nm", "biz_usr_nm");
				addColumnPathMap("src_ins_usr_cd", "src_ins_usr_cd");
				addColumnPathMap("src_ins_usr_nm", "src_ins_usr_nm");
				addColumnPathMap("aprv_func_typ", "aprv_func_typ");
				addColumnPathMap("aprv_func_typ_nm", "aprv_func_typ_nm");
				addColumnPathMap("src_itm_cd", "src_itm_cd");
				addColumnPathMap("src_itm_sub1", "src_itm_sub1");
				addColumnPathMap("src_itm_sub2", "src_itm_sub2");
				addColumnPathMap("src_itm_sub3", "src_itm_sub3");
				addColumnPathMap("src_itm_nm", "src_itm_nm");
				addColumnPathMap("src_dpt_cd", "src_dpt_cd");
				addColumnPathMap("src_dpt_nm", "src_dpt_nm");
				addColumnPathMap("src_bp_cd", "src_bp_cd");
				addColumnPathMap("src_bp_nm", "src_bp_nm");
				addColumnPathMap("src_cur_cd1", "src_cur_cd1");
				addColumnPathMap("src_cur_nm1", "src_cur_nm1");
				addColumnPathMap("src_amt1", "src_amt1");
				addColumnPathMap("src_cur_cd2", "src_cur_cd2");
				addColumnPathMap("src_cur_nm2", "src_cur_nm2");
				addColumnPathMap("src_amt2", "src_amt2");
				addColumnPathMap("src_cur_cd3", "src_cur_cd3");
				addColumnPathMap("src_cur_nm3", "src_cur_nm3");
				addColumnPathMap("src_amt3", "src_amt3");
				addColumnPathMap("src_ext_key1", "src_ext_key1");
				addColumnPathMap("src_ext_key2", "src_ext_key2");
				addColumnPathMap("src_ext_key3", "src_ext_key3");
				addColumnPathMap("aprv_src_no1", "aprv_src_no1");
				addColumnPathMap("aprv_src_no2", "aprv_src_no2");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("ins_func_nm", "ins_func_nm");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_func_nm", "upd_func_nm");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
			}
		}

		/**
		 * 連携処理AP_so01の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_AP_so01_0(mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Hdr1R r_dest, mcframe.serverMBBA.MBBAL0010.Srch01_Hdr1R r_src) {
		}

		/**
		 * 連携処理AP_so01の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_AP_so01_0(MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Hdr1R> dest, MCList<mcframe.serverMBBA.MBBAL0010.Srch01_Hdr1R> src) {
			MCRowMapper _rm = createMap_down_AP_so01_0();
			for(mcframe.serverMBBA.MBBAL0010.Srch01_Hdr1R r_src : src){
				mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Hdr1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_AP_so01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理AP_so01の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_AP_so01_1() {
			MCRowMapper map = new Map_down_AP_so01_1();
			return map;
		}

		/**
		 * 連携処理AP_so01の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_AP_so01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr.aprv_no", "hdr.aprv_no");
				addColumnPathMap("hdr.aprv_no_seq", "hdr.aprv_no_seq");
				addColumnPathMap("aprv_role_cd", "aprv_role_cd");
				addColumnPathMap("aprv_role_nm", "aprv_role_nm");
				addColumnPathMap("aprv_usr_cd", "aprv_usr_cd");
				addColumnPathMap("aprv_usr_nm", "aprv_usr_nm");
				addColumnPathMap("aprv_seq", "aprv_seq");
				addColumnPathMap("aprv_d_sts_typ", "aprv_d_sts_typ");
				addColumnPathMap("aprv_d_sts_typ_nm", "aprv_d_sts_typ_nm");
				addColumnPathMap("aprv_d_tm", "aprv_d_tm");
				addColumnPathMap("deputy_flg", "deputy_flg");
				addColumnPathMap("deputy_usr_cd", "deputy_usr_cd");
				addColumnPathMap("deputy_usr_nm", "deputy_usr_nm");
				addColumnPathMap("aprv_d_rmrks", "aprv_d_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("ins_func_nm", "ins_func_nm");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_func_nm", "upd_func_nm");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("email1", "email1");
				addColumnPathMap("email2", "email2");
				addColumnPathMap("email3", "email3");
				addColumnPathMap("tel1", "tel1");
				addColumnPathMap("tel2", "tel2");
				addColumnPathMap("tel3", "tel3");
				addColumnPathMap("th_image", "th_image");
			}
		}

		/**
		 * 連携処理AP_so01の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_AP_so01_1(mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Dtl1R r_dest, mcframe.serverMBBA.MBBAL0010.Srch01_Dtl1R r_src) {
		}

		/**
		 * 連携処理AP_so01の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_AP_so01_1(MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Dtl1R> dest, MCList<mcframe.serverMBBA.MBBAL0010.Srch01_Dtl1R> src) {
			MCRowMapper _rm = createMap_down_AP_so01_1();
			for(mcframe.serverMBBA.MBBAL0010.Srch01_Dtl1R r_src : src){
				mcframe.serverMBBA.MBBAL5030.Aprv_Srch02_Dtl1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_AP_so01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Aprv_Chk01オペレーション.<p>
	 *
	 * 承認または却下する際のチェックを行う。<br>
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
		private final MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> down0;
		
		
		// コンストラクタ
		protected Aprv_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);
			down0 = MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);

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
			invoke((MBBAL_AprvRegService)MBBAL_AprvRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Aprv_Chk01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R createAprv_Chk01_Rslt1R(){
			return mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.create();
		}

		/**
		 * Aprv_Chk01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> createAprv_Chk01_Rslt1L(){
			return MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no_seq</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no_seq</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBAL_AprvRegService)MBBAL_AprvRegService_MC_A.this).info;
		}


	}
	/**
	 * Aprv_Upd01オペレーション.<p>
	 *
	 * 承認または却下する。<br>
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
		private final MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> down0;
		
		
		// コンストラクタ
		protected Aprv_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);
			down0 = MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);

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
			invoke((MBBAL_AprvRegService)MBBAL_AprvRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Aprv_Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R createAprv_Upd01_Dtl1R(){
			return mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.create();
		}

		/**
		 * Aprv_Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> createAprv_Upd01_Dtl1L(){
			return MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no_seq</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBAL_AprvRegService)MBBAL_AprvRegService_MC_A.this).info;
		}


	}
	/**
	 * Aprv_Chk02オペレーション.<p>
	 *
	 * 承認または却下を取り消す際のチェックを行う。<br>
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
		private final MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> down0;
		
		
		// コンストラクタ
		protected Aprv_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);
			down0 = MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);

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
			invoke((MBBAL_AprvRegService)MBBAL_AprvRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Aprv_Chk02_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R createAprv_Chk02_Rslt1R(){
			return mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.create();
		}

		/**
		 * Aprv_Chk02_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> createAprv_Chk02_Rslt1L(){
			return MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no_seq</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no_seq</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBAL_AprvRegService)MBBAL_AprvRegService_MC_A.this).info;
		}


	}
	/**
	 * Aprv_Upd02オペレーション.<p>
	 *
	 * 承認または却下を取り消す。<br>
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
		private final MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> down0;
		
		
		// コンストラクタ
		protected Aprv_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);
			down0 = MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);

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
			invoke((MBBAL_AprvRegService)MBBAL_AprvRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Aprv_Upd02_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R createAprv_Upd02_Dtl1R(){
			return mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.create();
		}

		/**
		 * Aprv_Upd02_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> createAprv_Upd02_Dtl1L(){
			return MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no_seq</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBAL_AprvRegService)MBBAL_AprvRegService_MC_A.this).info;
		}


	}
	/**
	 * Aprv_Chk03オペレーション.<p>
	 *
	 * 承認情報を更新する際のチェックを行う。<br>
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
		private final MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> down0;
		
		
		// コンストラクタ
		protected Aprv_Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);
			down0 = MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);

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
			invoke((MBBAL_AprvRegService)MBBAL_AprvRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Aprv_Chk03_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R createAprv_Chk03_Rslt1R(){
			return mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.create();
		}

		/**
		 * Aprv_Chk03_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> createAprv_Chk03_Rslt1L(){
			return MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no_seq</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no_seq</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBAL_AprvRegService)MBBAL_AprvRegService_MC_A.this).info;
		}


	}
	/**
	 * Aprv_Upd03オペレーション.<p>
	 *
	 * 承認情報を更新する。<br>
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
		private final MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> down0;
		
		
		// コンストラクタ
		protected Aprv_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);
			down0 = MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);

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
			invoke((MBBAL_AprvRegService)MBBAL_AprvRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Aprv_Upd03_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R createAprv_Upd03_Dtl1R(){
			return mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.create();
		}

		/**
		 * Aprv_Upd03_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> createAprv_Upd03_Dtl1L(){
			return MCList.create(mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no_seq</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL5030.Aprv_Chk01_Rslt1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBAL_AprvRegService)MBBAL_AprvRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}