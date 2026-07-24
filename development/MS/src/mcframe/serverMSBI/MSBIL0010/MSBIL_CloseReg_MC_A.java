package mcframe.serverMSBI.MSBIL0010;

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
 * "MSBIL_CloseReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBIL_CloseReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBI";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBIL0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBIL_CloseReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBIL0010_Srch01_INFO;
		this.aSrch01 = ((MSBIL_CloseReg)this).new Srch01();
	}

	public static MSBIL_CloseReg.Srch01 crtSrch01() {
		MSBIL_CloseReg lgc = new MSBIL_CloseReg();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addDownBlock(aSrch01.down0());
		p.addDownBlock(aSrch01.down1());
		p.addDownBlock(aSrch01.down2());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL0010.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBI.MSBIL0010.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL0010.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMSBI.MSBIL0010.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL0010.Srch01_Rslt2R createSrch01_Rslt2R(){
		return mcframe.serverMSBI.MSBIL0010.Srch01_Rslt2R.create();
	}

	/**
	 * Srch01_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBI.MSBIL0010.Srch01_Rslt2R> createSrch01_Rslt2L(){
		return MCList.create(mcframe.serverMSBI.MSBIL0010.Srch01_Rslt2R.class);
	}

	/**
	 * Srch01_Rslt3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL0010.Srch01_Rslt3R createSrch01_Rslt3R(){
		return mcframe.serverMSBI.MSBIL0010.Srch01_Rslt3R.create();
	}

	/**
	 * Srch01_Rslt3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBI.MSBIL0010.Srch01_Rslt3R> createSrch01_Rslt3L(){
		return MCList.create(mcframe.serverMSBI.MSBIL0010.Srch01_Rslt3R.class);
	}
	protected MSBIL_CloseReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBIL0010_Chk01_INFO;
		this.aChk01 = ((MSBIL_CloseReg)this).new Chk01();
	}

	public static MSBIL_CloseReg.Chk01 crtChk01() {
		MSBIL_CloseReg lgc = new MSBIL_CloseReg();
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
		p.addUpBlock(aChk01.up2());
		p.addDownBlock(aChk01.down0());
		p.addDownBlock(aChk01.down1());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL0010.Chk01_HdrR createChk01_HdrR(){
		return mcframe.serverMSBI.MSBIL0010.Chk01_HdrR.create();
	}

	/**
	 * Chk01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R createChk01_Dtl1R(){
		return mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R.create();
	}

	/**
	 * Chk01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R> createChk01_Dtl1L(){
		return MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R.class);
	}

	/**
	 * Chk01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R createChk01_Dtl2R(){
		return mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R.create();
	}

	/**
	 * Chk01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R> createChk01_Dtl2L(){
		return MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R.class);
	}
	protected MSBIL_CloseReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBIL0010_Upd01_INFO;
		this.aUpd01 = ((MSBIL_CloseReg)this).new Upd01();
	}

	public static MSBIL_CloseReg.Upd01 crtUpd01() {
		MSBIL_CloseReg lgc = new MSBIL_CloseReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
		p.addUpBlock(aUpd01.up1());
		p.addUpBlock(aUpd01.up2());
		p.addDownBlock(aUpd01.down0());
		p.addDownBlock(aUpd01.down1());
		p.addDownBlock(aUpd01.down2());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_Hdr1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL0010.Chk01_HdrR createUpd01_Hdr1R(){
		return mcframe.serverMSBI.MSBIL0010.Chk01_HdrR.create();
	}

	/**
	 * Upd01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R createUpd01_Dtl1R(){
		return mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R.create();
	}

	/**
	 * Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R> createUpd01_Dtl1L(){
		return MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R.class);
	}

	/**
	 * Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R createUpd01_Dtl2R(){
		return mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R.create();
	}

	/**
	 * Upd01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R> createUpd01_Dtl2L(){
		return MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R.class);
	}
	protected MSBIL_CloseReg.Upd02 aUpd02;

	protected void initUpd02() {
		this.info = PDef.MS_MSBIL0010_Upd02_INFO;
		this.aUpd02 = ((MSBIL_CloseReg)this).new Upd02();
	}

	public static MSBIL_CloseReg.Upd02 crtUpd02() {
		MSBIL_CloseReg lgc = new MSBIL_CloseReg();
		lgc.initUpd02();
		return lgc.aUpd02;
	}

	protected void paramUpd02(MCParam p) {
		if (this.aUpd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd02.up0());
		p.addUpBlock(aUpd02.up1());
		p.addUpBlock(aUpd02.up2());
		p.addDownBlock(aUpd02.down0());
		p.addDownBlock(aUpd02.down1());
		p.addDownBlock(aUpd02.down2());
	}

	protected void doUpd02() {
		aUpd02.call();
	};

	/**
	 * Upd02_Hdr1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL0010.Chk01_HdrR createUpd02_Hdr1R(){
		return mcframe.serverMSBI.MSBIL0010.Chk01_HdrR.create();
	}

	/**
	 * Upd02_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R createUpd02_Dtl1R(){
		return mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R.create();
	}

	/**
	 * Upd02_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R> createUpd02_Dtl1L(){
		return MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R.class);
	}

	/**
	 * Upd02_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R createUpd02_Dtl2R(){
		return mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R.create();
	}

	/**
	 * Upd02_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R> createUpd02_Dtl2L(){
		return MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R.class);
	}
	protected MSBIL_CloseReg.Upd03 aUpd03;

	protected void initUpd03() {
		this.info = PDef.MS_MSBIL0010_Upd03_INFO;
		this.aUpd03 = ((MSBIL_CloseReg)this).new Upd03();
	}

	public static MSBIL_CloseReg.Upd03 crtUpd03() {
		MSBIL_CloseReg lgc = new MSBIL_CloseReg();
		lgc.initUpd03();
		return lgc.aUpd03;
	}

	protected void paramUpd03(MCParam p) {
		if (this.aUpd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd03.up0());
		p.addDownBlock(aUpd03.down0());
	}

	protected void doUpd03() {
		aUpd03.call();
	};

	/**
	 * Upd03_Hdr1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL0010.Chk01_HdrR createUpd03_Hdr1R(){
		return mcframe.serverMSBI.MSBIL0010.Chk01_HdrR.create();
	}
	protected MSBIL_CloseReg.Upd04 aUpd04;

	protected void initUpd04() {
		this.info = PDef.MS_MSBIL0010_Upd04_INFO;
		this.aUpd04 = ((MSBIL_CloseReg)this).new Upd04();
	}

	public static MSBIL_CloseReg.Upd04 crtUpd04() {
		MSBIL_CloseReg lgc = new MSBIL_CloseReg();
		lgc.initUpd04();
		return lgc.aUpd04;
	}

	protected void paramUpd04(MCParam p) {
		if (this.aUpd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd04.up0());
		p.addDownBlock(aUpd04.down0());
	}

	protected void doUpd04() {
		aUpd04.call();
	};

	/**
	 * Upd04_Hdr1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBI.MSBIL0010.Chk01_HdrR createUpd04_Hdr1R(){
		return mcframe.serverMSBI.MSBIL0010.Chk01_HdrR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 締対象を検索する<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBI.MSBIL0010.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBI.MSBIL0010.Srch01_Rslt1R down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL0010.Srch01_Rslt2R> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL0010.Srch01_Rslt3R> down2;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBI.MSBIL0010.Srch01_CndR.create();
			down0 = mcframe.serverMSBI.MSBIL0010.Srch01_Rslt1R.create();
			down1 = MCList.create(mcframe.serverMSBI.MSBIL0010.Srch01_Rslt2R.class);
			down2 = MCList.create(mcframe.serverMSBI.MSBIL0010.Srch01_Rslt3R.class);

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
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBIL_CloseReg)MSBIL_CloseReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL0010.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBI.MSBIL0010.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL0010.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMSBI.MSBIL0010.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL0010.Srch01_Rslt2R createSrch01_Rslt2R(){
			return mcframe.serverMSBI.MSBIL0010.Srch01_Rslt2R.create();
		}

		/**
		 * Srch01_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBI.MSBIL0010.Srch01_Rslt2R> createSrch01_Rslt2L(){
			return MCList.create(mcframe.serverMSBI.MSBIL0010.Srch01_Rslt2R.class);
		}

		/**
		 * Srch01_Rslt3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL0010.Srch01_Rslt3R createSrch01_Rslt3R(){
			return mcframe.serverMSBI.MSBIL0010.Srch01_Rslt3R.create();
		}

		/**
		 * Srch01_Rslt3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBI.MSBIL0010.Srch01_Rslt3R> createSrch01_Rslt3L(){
			return MCList.create(mcframe.serverMSBI.MSBIL0010.Srch01_Rslt3R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cl_typ</td></tr>
		 * 	<tr><td><br></td><td>cl_ym</td></tr>
		 * 	<tr><td><br></td><td>cl_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBI.MSBIL0010.Srch01_CndR
		 */
		public mcframe.serverMSBI.MSBIL0010.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>db_ar_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_pre_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>ar_pre_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_pre_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>db_ap_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_pre_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>ap_pre_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_pre_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>all_acst_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>all_asppl_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBI.MSBIL0010.Srch01_Rslt1R
		 */
		public mcframe.serverMSBI.MSBIL0010.Srch01_Rslt1R down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_nm</td></tr>
		 * 	<tr><td><br></td><td>pre_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL0010.Srch01_Rslt2R> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pre_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL0010.Srch01_Rslt3R> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBIL_CloseReg)MSBIL_CloseReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 締処理前チェックを実行する<br>
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
		private final mcframe.serverMSBI.MSBIL0010.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R> down1;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBI.MSBIL0010.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R.class);
			up2 = MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R.class);
			down0 = MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R.class);
			down1 = MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R.class);

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
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBIL_CloseReg)MSBIL_CloseReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL0010.Chk01_HdrR createChk01_HdrR(){
			return mcframe.serverMSBI.MSBIL0010.Chk01_HdrR.create();
		}

		/**
		 * Chk01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R createChk01_Dtl1R(){
			return mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R.create();
		}

		/**
		 * Chk01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R> createChk01_Dtl1L(){
			return MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R.class);
		}

		/**
		 * Chk01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R createChk01_Dtl2R(){
			return mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R.create();
		}

		/**
		 * Chk01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R> createChk01_Dtl2L(){
			return MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>cl_flg</td></tr>
		 * 	<tr><td><br></td><td>rel_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>rel_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>for_sv_all_acst_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>for_sv_all_asppl_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBI.MSBIL0010.Chk01_HdrR
		 */
		public mcframe.serverMSBI.MSBIL0010.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBIL_CloseReg)MSBIL_CloseReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 仮締処理を実行する<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBI.MSBIL0010.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBI.MSBIL0010.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R> down2;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBI.MSBIL0010.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R.class);
			up2 = MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R.class);
			down0 = mcframe.serverMSBI.MSBIL0010.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R.class);
			down2 = MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R.class);

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
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBIL_CloseReg)MSBIL_CloseReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Upd01_Hdr1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL0010.Chk01_HdrR createUpd01_Hdr1R(){
			return mcframe.serverMSBI.MSBIL0010.Chk01_HdrR.create();
		}

		/**
		 * Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R createUpd01_Dtl1R(){
			return mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R.create();
		}

		/**
		 * Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R> createUpd01_Dtl1L(){
			return MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R.class);
		}

		/**
		 * Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R createUpd01_Dtl2R(){
			return mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R.create();
		}

		/**
		 * Upd01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R> createUpd01_Dtl2L(){
			return MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>ar_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>for_sv_all_acst_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>for_sv_all_asppl_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBI.MSBIL0010.Chk01_HdrR
		 */
		public mcframe.serverMSBI.MSBIL0010.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>ar_pre_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>ap_pre_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_pre_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_pre_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_pre_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_pre_cl_usr_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBI.MSBIL0010.Chk01_HdrR
		 */
		public mcframe.serverMSBI.MSBIL0010.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pre_cl_tm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pre_cl_tm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBIL_CloseReg)MSBIL_CloseReg_MC_A.this).info;
		}


	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 仮締解除を実行する<br>
	 */
	abstract public class Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBI.MSBIL0010.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBI.MSBIL0010.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R> down2;
		
		
		// コンストラクタ
		protected Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBI.MSBIL0010.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R.class);
			up2 = MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R.class);
			down0 = mcframe.serverMSBI.MSBIL0010.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R.class);
			down2 = MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R.class);

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
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBIL_CloseReg)MSBIL_CloseReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Upd02_Hdr1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL0010.Chk01_HdrR createUpd02_Hdr1R(){
			return mcframe.serverMSBI.MSBIL0010.Chk01_HdrR.create();
		}

		/**
		 * Upd02_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R createUpd02_Dtl1R(){
			return mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R.create();
		}

		/**
		 * Upd02_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R> createUpd02_Dtl1L(){
			return MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R.class);
		}

		/**
		 * Upd02_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R createUpd02_Dtl2R(){
			return mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R.create();
		}

		/**
		 * Upd02_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R> createUpd02_Dtl2L(){
			return MCList.create(mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>ar_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>for_sv_all_acst_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>for_sv_all_asppl_pre_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBI.MSBIL0010.Chk01_HdrR
		 */
		public mcframe.serverMSBI.MSBIL0010.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ar_pre_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>ap_pre_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>ar_pre_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_pre_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_pre_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_pre_cl_usr_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBI.MSBIL0010.Chk01_HdrR
		 */
		public mcframe.serverMSBI.MSBIL0010.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pre_cl_tm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl1R> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pre_cl_tm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBI.MSBIL0010.Chk01_Dtl2R> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBIL_CloseReg)MSBIL_CloseReg_MC_A.this).info;
		}


	}
	/**
	 * Upd03オペレーション.<p>
	 *
	 * 本締処理を実行する<br>
	 */
	abstract public class Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBI.MSBIL0010.Chk01_HdrR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBI.MSBIL0010.Chk01_HdrR down0;
		
		
		// コンストラクタ
		protected Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBI.MSBIL0010.Chk01_HdrR.create();
			down0 = mcframe.serverMSBI.MSBIL0010.Chk01_HdrR.create();

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
			invoke((MSBIL_CloseReg)MSBIL_CloseReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd03_Hdr1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL0010.Chk01_HdrR createUpd03_Hdr1R(){
			return mcframe.serverMSBI.MSBIL0010.Chk01_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBI.MSBIL0010.Chk01_HdrR
		 */
		public mcframe.serverMSBI.MSBIL0010.Chk01_HdrR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_usr_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBI.MSBIL0010.Chk01_HdrR
		 */
		public mcframe.serverMSBI.MSBIL0010.Chk01_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBIL_CloseReg)MSBIL_CloseReg_MC_A.this).info;
		}


	}
	/**
	 * Upd04オペレーション.<p>
	 *
	 * 本締解除を実行する<br>
	 */
	abstract public class Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBI.MSBIL0010.Chk01_HdrR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBI.MSBIL0010.Chk01_HdrR down0;
		
		
		// コンストラクタ
		protected Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBI.MSBIL0010.Chk01_HdrR.create();
			down0 = mcframe.serverMSBI.MSBIL0010.Chk01_HdrR.create();

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
			invoke((MSBIL_CloseReg)MSBIL_CloseReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd04_Hdr1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBI.MSBIL0010.Chk01_HdrR createUpd04_Hdr1R(){
			return mcframe.serverMSBI.MSBIL0010.Chk01_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBI.MSBIL0010.Chk01_HdrR
		 */
		public mcframe.serverMSBI.MSBIL0010.Chk01_HdrR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_tm</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_cl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_cl_usr_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBI.MSBIL0010.Chk01_HdrR
		 */
		public mcframe.serverMSBI.MSBIL0010.Chk01_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBIL_CloseReg)MSBIL_CloseReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}