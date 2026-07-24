package mcframe.serverMSBB.MSBBL0010;

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
 * "MSBBL_CstFrcstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBL_CstFrcstReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBBL0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBBL_CstFrcstReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBBL0010_Srch01_INFO;
		this.aSrch01 = ((MSBBL_CstFrcstReg)this).new Srch01();
	}

	public static MSBBL_CstFrcstReg.Srch01 crtSrch01() {
		MSBBL_CstFrcstReg lgc = new MSBBL_CstFrcstReg();
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
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL0010.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBB.MSBBL0010.Srch01_CndR.create();
	}

	/**
	 * Srch01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL0010.Srch01_HdrR createSrch01_HdrR(){
		return mcframe.serverMSBB.MSBBL0010.Srch01_HdrR.create();
	}

	/**
	 * Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL0010.Srch01_DtlR createSrch01_DtlR(){
		return mcframe.serverMSBB.MSBBL0010.Srch01_DtlR.create();
	}

	/**
	 * Srch01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL0010.Srch01_DtlR> createSrch01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL0010.Srch01_DtlR.class);
	}
	protected MSBBL_CstFrcstReg.Sprt01 aSprt01;

	protected void initSprt01() {
		this.info = PDef.MS_MSBBL0010_Sprt01_INFO;
		this.aSprt01 = ((MSBBL_CstFrcstReg)this).new Sprt01();
	}

	public static MSBBL_CstFrcstReg.Sprt01 crtSprt01() {
		MSBBL_CstFrcstReg lgc = new MSBBL_CstFrcstReg();
		lgc.initSprt01();
		return lgc.aSprt01;
	}

	protected void paramSprt01(MCParam p) {
		if (this.aSprt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt01.up0());
		p.addUpBlock(aSprt01.up1());
		p.addDownBlock(aSprt01.down0());
	}

	protected void doSprt01() {
		aSprt01.call();
	};

	/**
	 * Sprt01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL0010.Sprt01_HdrR createSprt01_HdrR(){
		return mcframe.serverMSBB.MSBBL0010.Sprt01_HdrR.create();
	}

	/**
	 * Sprt01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL0010.Sprt01_DtlR createSprt01_DtlR(){
		return mcframe.serverMSBB.MSBBL0010.Sprt01_DtlR.create();
	}

	/**
	 * Sprt01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL0010.Sprt01_DtlR> createSprt01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL0010.Sprt01_DtlR.class);
	}
	protected MSBBL_CstFrcstReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBBL0010_Chk01_INFO;
		this.aChk01 = ((MSBBL_CstFrcstReg)this).new Chk01();
	}

	public static MSBBL_CstFrcstReg.Chk01 crtChk01() {
		MSBBL_CstFrcstReg lgc = new MSBBL_CstFrcstReg();
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
	public mcframe.serverMSBB.MSBBL0010.Chk01_HdrR createChk01_HdrR(){
		return mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.create();
	}

	/**
	 * Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL0010.Chk01_DtlR createChk01_DtlR(){
		return mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.create();
	}

	/**
	 * Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL0010.Chk01_DtlR> createChk01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.class);
	}
	protected MSBBL_CstFrcstReg.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MS_MSBBL0010_Chk02_INFO;
		this.aChk02 = ((MSBBL_CstFrcstReg)this).new Chk02();
	}

	public static MSBBL_CstFrcstReg.Chk02 crtChk02() {
		MSBBL_CstFrcstReg lgc = new MSBBL_CstFrcstReg();
		lgc.initChk02();
		return lgc.aChk02;
	}

	protected void paramChk02(MCParam p) {
		if (this.aChk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk02.up0());
		p.addDownBlock(aChk02.down0());
	}

	protected void doChk02() {
		aChk02.call();
	};

	/**
	 * Chk02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL0010.Chk02_HdrR createChk02_HdrR(){
		return mcframe.serverMSBB.MSBBL0010.Chk02_HdrR.create();
	}
	protected MSBBL_CstFrcstReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MS_MSBBL0010_Ins01_INFO;
		this.aIns01 = ((MSBBL_CstFrcstReg)this).new Ins01();
	}

	public static MSBBL_CstFrcstReg.Ins01 crtIns01() {
		MSBBL_CstFrcstReg lgc = new MSBBL_CstFrcstReg();
		lgc.initIns01();
		return lgc.aIns01;
	}

	protected void paramIns01(MCParam p) {
		if (this.aIns01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns01.up0());
		p.addUpBlock(aIns01.up1());
		p.addDownBlock(aIns01.down0());
		p.addDownBlock(aIns01.down1());
	}

	protected void doIns01() {
		aIns01.call();
	};

	/**
	 * Ins01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL0010.Chk01_HdrR createIns01_HdrR(){
		return mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.create();
	}

	/**
	 * Ins01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL0010.Chk01_DtlR createIns01_DtlR(){
		return mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.create();
	}

	/**
	 * Ins01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL0010.Chk01_DtlR> createIns01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.class);
	}
	protected MSBBL_CstFrcstReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBBL0010_Upd01_INFO;
		this.aUpd01 = ((MSBBL_CstFrcstReg)this).new Upd01();
	}

	public static MSBBL_CstFrcstReg.Upd01 crtUpd01() {
		MSBBL_CstFrcstReg lgc = new MSBBL_CstFrcstReg();
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
		p.addDownBlock(aUpd01.down0());
		p.addDownBlock(aUpd01.down1());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL0010.Chk01_HdrR createUpd01_HdrR(){
		return mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.create();
	}

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL0010.Chk01_DtlR createUpd01_DtlR(){
		return mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL0010.Chk01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.class);
	}
	protected MSBBL_CstFrcstReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBBL0010_Del01_INFO;
		this.aDel01 = ((MSBBL_CstFrcstReg)this).new Del01();
	}

	public static MSBBL_CstFrcstReg.Del01 crtDel01() {
		MSBBL_CstFrcstReg lgc = new MSBBL_CstFrcstReg();
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
	 * Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL0010.Chk02_HdrR createDel01_HdrR(){
		return mcframe.serverMSBB.MSBBL0010.Chk02_HdrR.create();
	}
	protected MSBBL_CstFrcstReg.Imp01 aImp01;

	protected void initImp01() {
		this.info = PDef.MS_MSBBL0010_Imp01_INFO;
		this.aImp01 = ((MSBBL_CstFrcstReg)this).new Imp01();
	}

	public static MSBBL_CstFrcstReg.Imp01 crtImp01() {
		MSBBL_CstFrcstReg lgc = new MSBBL_CstFrcstReg();
		lgc.initImp01();
		return lgc.aImp01;
	}

	protected void paramImp01(MCParam p) {
		if (this.aImp01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aImp01.up0());
		p.addDownBlock(aImp01.down0());
		p.addDownBlock(aImp01.down1());
	}

	protected void doImp01() {
		aImp01.call();
	};

	/**
	 * Imp01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL0010.Chk01_HdrR createImp01_HdrR(){
		return mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.create();
	}

	/**
	 * Imp01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL0010.Imp01_DtlR createImp01_DtlR(){
		return mcframe.serverMSBB.MSBBL0010.Imp01_DtlR.create();
	}

	/**
	 * Imp01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL0010.Imp01_DtlR> createImp01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL0010.Imp01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 顧客期間内示ヘッダ、顧客期間内示明細を検索する<br>
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
		private final mcframe.serverMSBB.MSBBL0010.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL0010.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL0010.Srch01_DtlR> down1;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL0010.Srch01_CndR.create();
			down0 = mcframe.serverMSBB.MSBBL0010.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL0010.Srch01_DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_CstFrcstReg)MSBBL_CstFrcstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL0010.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBB.MSBBL0010.Srch01_CndR.create();
		}

		/**
		 * Srch01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL0010.Srch01_HdrR createSrch01_HdrR(){
			return mcframe.serverMSBB.MSBBL0010.Srch01_HdrR.create();
		}

		/**
		 * Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL0010.Srch01_DtlR createSrch01_DtlR(){
			return mcframe.serverMSBB.MSBBL0010.Srch01_DtlR.create();
		}

		/**
		 * Srch01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL0010.Srch01_DtlR> createSrch01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL0010.Srch01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cst_frcst_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL0010.Srch01_CndR
		 */
		public mcframe.serverMSBB.MSBBL0010.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cst_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>cst_frcst_prnt_dt</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>frcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>frcst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>frcst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>frcst_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>cst_frcst_slip_no</td></tr>
		 * 	<tr><td><br></td><td>can_flg</td></tr>
		 * 	<tr><td><br></td><td>can_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>can_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>can_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL0010.Srch01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL0010.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cst_frcst_d_no</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>frcst_period_typ</td></tr>
		 * 	<tr><td><br></td><td>frcst_period_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>frcst_st_dt</td></tr>
		 * 	<tr><td><br></td><td>frcst_end_dt</td></tr>
		 * 	<tr><td><br></td><td>frcst_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_frcst_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>last_qty</td></tr>
		 * 	<tr><td><br></td><td>last_cst_frcst_prnt_dt</td></tr>
		 * 	<tr><td><br></td><td>last_rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>prms_qty</td></tr>
		 * 	<tr><td><br></td><td>frcst_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>spln_qty</td></tr>
		 * 	<tr><td><br></td><td>slo_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL0010.Srch01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_CstFrcstReg)MSBBL_CstFrcstReg_MC_A.this).info;
		}


	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 顧客期間内示明細に対する参考情報（前回情報、販売計画数量、受注数量）を取得する<br>
	 */
	abstract public class Sprt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL0010.Sprt01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL0010.Sprt01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL0010.Sprt01_DtlR> down0;
		
		
		// コンストラクタ
		protected Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL0010.Sprt01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBB.MSBBL0010.Sprt01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBB.MSBBL0010.Sprt01_DtlR.class);

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
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_CstFrcstReg)MSBBL_CstFrcstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL0010.Sprt01_HdrR createSprt01_HdrR(){
			return mcframe.serverMSBB.MSBBL0010.Sprt01_HdrR.create();
		}

		/**
		 * Sprt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL0010.Sprt01_DtlR createSprt01_DtlR(){
			return mcframe.serverMSBB.MSBBL0010.Sprt01_DtlR.create();
		}

		/**
		 * Sprt01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL0010.Sprt01_DtlR> createSprt01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL0010.Sprt01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>frcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>cst_frcst_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL0010.Sprt01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL0010.Sprt01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>frcst_period_typ</td></tr>
		 * 	<tr><td><br></td><td>frcst_st_dt</td></tr>
		 * 	<tr><td><br></td><td>frcst_end_dt</td></tr>
		 * 	<tr><td><br></td><td>frcst_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_frcst_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL0010.Sprt01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>last_qty</td></tr>
		 * 	<tr><td><br></td><td>last_cst_frcst_prnt_dt</td></tr>
		 * 	<tr><td><br></td><td>last_rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>spln_qty</td></tr>
		 * 	<tr><td><br></td><td>slo_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL0010.Sprt01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_CstFrcstReg)MSBBL_CstFrcstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 顧客期間内示ヘッダ、顧客期間内示明細、顧客期間内示情報を登録・訂正可能かチェックする<br>
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
		private final mcframe.serverMSBB.MSBBL0010.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL0010.Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL0010.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL0010.Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.class);
			down0 = mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.class);

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
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_CstFrcstReg)MSBBL_CstFrcstReg_MC_A.this);
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
		public mcframe.serverMSBB.MSBBL0010.Chk01_HdrR createChk01_HdrR(){
			return mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.create();
		}

		/**
		 * Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL0010.Chk01_DtlR createChk01_DtlR(){
			return mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.create();
		}

		/**
		 * Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL0010.Chk01_DtlR> createChk01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr.cst_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.cst_frcst_prnt_dt</td></tr>
		 * 	<tr><td><br></td><td>hdr.cst_frcst_slip_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.frcst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.frcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>hdr.can_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.can_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>hdr.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL0010.Chk01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL0010.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.cst_frcst_d_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.fix_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_period_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_st_dt</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_end_dt</td></tr>
		 * 	<tr><td><br></td><td>dtl.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>dtl.cst_frcst_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.prms_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL0010.Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr.cst_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.cst_frcst_prnt_dt</td></tr>
		 * 	<tr><td><br></td><td>hdr.cst_frcst_slip_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.frcst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.frcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>hdr.can_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr.can_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.can_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>hdr.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>frcst_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>frcst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>can_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL0010.Chk01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL0010.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.cst_frcst_d_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.fix_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_period_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_st_dt</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_end_dt</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_dt</td></tr>
		 * 	<tr><td><br></td><td>dtl.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>dtl.cst_frcst_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>dtl.prms_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>frcst_period_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL0010.Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_CstFrcstReg)MSBBL_CstFrcstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 顧客期間内示ヘッダ、顧客期間内示情報を取り消し可能かチェックする<br>
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
		private final mcframe.serverMSBB.MSBBL0010.Chk02_HdrR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL0010.Chk02_HdrR down0;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL0010.Chk02_HdrR.create();
			down0 = mcframe.serverMSBB.MSBBL0010.Chk02_HdrR.create();

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
			invoke((MSBBL_CstFrcstReg)MSBBL_CstFrcstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL0010.Chk02_HdrR createChk02_HdrR(){
			return mcframe.serverMSBB.MSBBL0010.Chk02_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr.cst_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.can_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.can_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL0010.Chk02_HdrR
		 */
		public mcframe.serverMSBB.MSBBL0010.Chk02_HdrR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr.cst_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.cst_frcst_prnt_dt</td></tr>
		 * 	<tr><td><br></td><td>hdr.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.frcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.can_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.can_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL0010.Chk02_HdrR
		 */
		public mcframe.serverMSBB.MSBBL0010.Chk02_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_CstFrcstReg)MSBBL_CstFrcstReg_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 顧客期間内示ヘッダ、顧客期間内示明細、顧客期間内示情報を登録する<br>
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
		private final mcframe.serverMSBB.MSBBL0010.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL0010.Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL0010.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL0010.Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.class);
			down0 = mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.class);

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
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_CstFrcstReg)MSBBL_CstFrcstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Ins01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL0010.Chk01_HdrR createIns01_HdrR(){
			return mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.create();
		}

		/**
		 * Ins01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL0010.Chk01_DtlR createIns01_DtlR(){
			return mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.create();
		}

		/**
		 * Ins01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL0010.Chk01_DtlR> createIns01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr.cst_frcst_prnt_dt</td></tr>
		 * 	<tr><td><br></td><td>hdr.cst_frcst_slip_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.frcst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.frcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>hdr.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL0010.Chk01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL0010.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl.fix_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_period_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_st_dt</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_end_dt</td></tr>
		 * 	<tr><td><br></td><td>dtl.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>dtl.cst_frcst_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.prms_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL0010.Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr.cst_frcst_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL0010.Chk01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL0010.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl.cst_frcst_d_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_dt</td></tr>
		 * 	<tr><td><br></td><td>dtl.disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL0010.Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_CstFrcstReg)MSBBL_CstFrcstReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 顧客期間内示ヘッダ、顧客期間内示明細、顧客期間内示情報を訂正する<br>
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
		private final mcframe.serverMSBB.MSBBL0010.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL0010.Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL0010.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL0010.Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.class);
			down0 = mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.class);

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
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_CstFrcstReg)MSBBL_CstFrcstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL0010.Chk01_HdrR createUpd01_HdrR(){
			return mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.create();
		}

		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL0010.Chk01_DtlR createUpd01_DtlR(){
			return mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL0010.Chk01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL0010.Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr.cst_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.cst_frcst_prnt_dt</td></tr>
		 * 	<tr><td><br></td><td>hdr.cst_frcst_slip_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.frcst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.frcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>hdr.can_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.can_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>hdr.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL0010.Chk01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL0010.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl.cst_frcst_d_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.fix_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_period_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_st_dt</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_end_dt</td></tr>
		 * 	<tr><td><br></td><td>dtl.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>dtl.cst_frcst_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.prms_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL0010.Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr.cst_frcst_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL0010.Chk01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL0010.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl.cst_frcst_d_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_dt</td></tr>
		 * 	<tr><td><br></td><td>dtl.disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL0010.Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_CstFrcstReg)MSBBL_CstFrcstReg_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 顧客期間内示ヘッダ、顧客期間内示情報を取り消す<br>
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
		private final mcframe.serverMSBB.MSBBL0010.Chk02_HdrR up0;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL0010.Chk02_HdrR.create();

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
			invoke((MSBBL_CstFrcstReg)MSBBL_CstFrcstReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL0010.Chk02_HdrR createDel01_HdrR(){
			return mcframe.serverMSBB.MSBBL0010.Chk02_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr.cst_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.can_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.can_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL0010.Chk02_HdrR
		 */
		public mcframe.serverMSBB.MSBBL0010.Chk02_HdrR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_CstFrcstReg)MSBBL_CstFrcstReg_MC_A.this).info;
		}


	}
	/**
	 * Imp01オペレーション.<p>
	 *
	 * 顧客期間内示ヘッダ、顧客期間内示明細をファイル入力する<br>
	 */
	abstract public class Imp01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Imp01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL0010.Imp01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL0010.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL0010.Imp01_DtlR> down1;
		
		
		// コンストラクタ
		protected Imp01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL0010.Imp01_DtlR.class);
			down0 = mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL0010.Imp01_DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_CstFrcstReg)MSBBL_CstFrcstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Imp01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL0010.Chk01_HdrR createImp01_HdrR(){
			return mcframe.serverMSBB.MSBBL0010.Chk01_HdrR.create();
		}

		/**
		 * Imp01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL0010.Imp01_DtlR createImp01_DtlR(){
			return mcframe.serverMSBB.MSBBL0010.Imp01_DtlR.create();
		}

		/**
		 * Imp01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL0010.Imp01_DtlR> createImp01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL0010.Imp01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr.cst_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.cst_frcst_prnt_dt</td></tr>
		 * 	<tr><td><br></td><td>hdr.cst_frcst_slip_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.frcst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.frcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>hdr.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dtl.cst_frcst_d_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.fix_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_period_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_st_dt</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_end_dt</td></tr>
		 * 	<tr><td><br></td><td>dtl.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>dtl.cst_frcst_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.prms_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.dtl_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl.dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl.dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl.dtl_sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL0010.Imp01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr.cst_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.cst_frcst_prnt_dt</td></tr>
		 * 	<tr><td><br></td><td>hdr.cst_frcst_slip_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.frcst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.frcst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>hdr.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>hdr.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>frcst_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>frcst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL0010.Chk01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL0010.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl.cst_frcst_d_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.fix_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>dtl.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_period_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_period_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_st_dt</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_end_dt</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_dt</td></tr>
		 * 	<tr><td><br></td><td>dtl.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dtl.trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>dtl.trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl.trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl.trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dtl.base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>dtl.base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.gi_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>dtl.cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl.cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>dtl.cst_frcst_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dtl.prms_qty</td></tr>
		 * 	<tr><td><br></td><td>dtl.frcst_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl.dtl_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl.dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl.dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl.dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dtl.rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL0010.Imp01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_CstFrcstReg)MSBBL_CstFrcstReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}