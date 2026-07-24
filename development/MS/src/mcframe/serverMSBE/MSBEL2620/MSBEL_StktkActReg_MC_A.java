package mcframe.serverMSBE.MSBEL2620;

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
 * "MSBEL_StktkActReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_StktkActReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBEL2620";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_StktkActReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBEL2620_Srch01_INFO;
		this.aSrch01 = ((MSBEL_StktkActReg)this).new Srch01();
	}

	public static MSBEL_StktkActReg.Srch01 crtSrch01() {
		MSBEL_StktkActReg lgc = new MSBEL_StktkActReg();
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
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2620.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBE.MSBEL2620.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2620.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMSBE.MSBEL2620.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2620.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2620.Srch01_RsltR.class);
	}
	protected MSBEL_StktkActReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBEL2620_Chk01_INFO;
		this.aChk01 = ((MSBEL_StktkActReg)this).new Chk01();
	}

	public static MSBEL_StktkActReg.Chk01 crtChk01() {
		MSBEL_StktkActReg lgc = new MSBEL_StktkActReg();
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
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2620.Chk01_DtlR createChk01_DtlR(){
		return mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.create();
	}

	/**
	 * Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> createChk01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.class);
	}

	/**
	 * Chk01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2620.Chk01_CtrlR createChk01_CtrlR(){
		return mcframe.serverMSBE.MSBEL2620.Chk01_CtrlR.create();
	}
	protected MSBEL_StktkActReg.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MS_MSBEL2620_Chk02_INFO;
		this.aChk02 = ((MSBEL_StktkActReg)this).new Chk02();
	}

	public static MSBEL_StktkActReg.Chk02 crtChk02() {
		MSBEL_StktkActReg lgc = new MSBEL_StktkActReg();
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
	 * Chk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2620.Chk01_DtlR createChk02_DtlR(){
		return mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.create();
	}

	/**
	 * Chk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> createChk02_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.class);
	}
	protected MSBEL_StktkActReg.Imp01 aImp01;

	protected void initImp01() {
		this.info = PDef.MS_MSBEL2620_Imp01_INFO;
		this.aImp01 = ((MSBEL_StktkActReg)this).new Imp01();
	}

	public static MSBEL_StktkActReg.Imp01 crtImp01() {
		MSBEL_StktkActReg lgc = new MSBEL_StktkActReg();
		lgc.initImp01();
		return lgc.aImp01;
	}

	protected void paramImp01(MCParam p) {
		if (this.aImp01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aImp01.up0());
		p.addUpBlock(aImp01.up1());
		p.addDownBlock(aImp01.down0());
	}

	protected void doImp01() {
		aImp01.call();
	};

	/**
	 * Imp01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2620.Chk01_DtlR createImp01_DtlR(){
		return mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.create();
	}

	/**
	 * Imp01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> createImp01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.class);
	}

	/**
	 * Imp01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2620.Imp01_CtrlR createImp01_CtrlR(){
		return mcframe.serverMSBE.MSBEL2620.Imp01_CtrlR.create();
	}
	protected MSBEL_StktkActReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBEL2620_Upd01_INFO;
		this.aUpd01 = ((MSBEL_StktkActReg)this).new Upd01();
	}

	public static MSBEL_StktkActReg.Upd01 crtUpd01() {
		MSBEL_StktkActReg lgc = new MSBEL_StktkActReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
		p.addDownBlock(aUpd01.down0());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2620.Chk01_DtlR createUpd01_DtlR(){
		return mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.class);
	}
	protected MSBEL_StktkActReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBEL2620_Del01_INFO;
		this.aDel01 = ((MSBEL_StktkActReg)this).new Del01();
	}

	public static MSBEL_StktkActReg.Del01 crtDel01() {
		MSBEL_StktkActReg lgc = new MSBEL_StktkActReg();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
		p.addDownBlock(aDel01.down0());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2620.Chk01_DtlR createDel01_DtlR(){
		return mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.create();
	}

	/**
	 * Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> createDel01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 実棚情報を検索します。<br>
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
		private final mcframe.serverMSBE.MSBEL2620.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2620.Srch01_RsltR> down0;
		
		/**
		 * 連携情報 SAR<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Srch01 （{@link #so01}）<br>
		 */
		public final String SAR = "SAR";

		/**
		 * 連携オペレーション so01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Srch01}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBE.MSBEL6600.StktkAct_Srch01_CndR （{@link #so01_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Srch01_RsltR&gt; （{@link #so01_down0}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Srch01 so01;
		// 連携ロジック上り
		public final mcframe.serverMSBE.MSBEL6600.StktkAct_Srch01_CndR so01_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Srch01_RsltR> so01_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL2620.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL2620.Srch01_RsltR.class);

			// 連携オペレーションの初期化
			so01 = mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.crtStktkAct_Srch01();
			
			// 連携オペレーションのコンテナ取得
			so01_up0 = (mcframe.serverMSBE.MSBEL6600.StktkAct_Srch01_CndR)so01.up(0);
			so01_down0 = (MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Srch01_RsltR>)so01.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SAR, so01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SAR<br>
		 * up0() => mcframe.serverMSBE.MSBEL6600.StktkAct_Srch01_CndR （{@link #so01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SAR)) {
				up_SAR(so01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SAR<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Srch01_RsltR&gt;（{@link #so01_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SAR)) {
				down_SAR(down0(), so01_down0);
			}
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
			invoke((MSBEL_StktkActReg)MSBEL_StktkActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2620.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBE.MSBEL2620.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2620.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMSBE.MSBEL2620.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2620.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2620.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stktk_base_dt</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>stktk_act_no</td></tr>
		 * 	<tr><td><br></td><td>stktk_act_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>only_enable_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_entrd_flg</td></tr>
		 * 	<tr><td><br></td><td>only_stktk_flg</td></tr>
		 * 	<tr><td><br></td><td>only_diff_flg</td></tr>
		 * 	<tr><td><br></td><td>only_own_flg</td></tr>
		 * 	<tr><td><br></td><td>only_int_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2620.Srch01_CndR
		 */
		public mcframe.serverMSBE.MSBEL2620.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>act_input_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_base_dt</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>stktk_amt_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_tor_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_stktk_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>fix_no_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>tor_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>act_diff_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>std_upri</td></tr>
		 * 	<tr><td><br></td><td>std_cost</td></tr>
		 * 	<tr><td><br></td><td>act_diff_cost</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>stktk_act_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>stktk_itm_spc_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>stktk_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>stktkact_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>stktk_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>not_new_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2620.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StktkActReg)MSBEL_StktkActReg_MC_A.this).info;
		}

		//-----------------------SAR専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSARの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SAR(mcframe.serverMSBE.MSBEL6600.StktkAct_Srch01_CndR dest0_0, mcframe.serverMSBE.MSBEL2620.Srch01_CndR src_Srch01_Cnd){
			up_SAR_so01_0(dest0_0, src_Srch01_Cnd);
		}
		
		/**
		 * 連携処理SAR_so01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SAR_so01_0() {
			MCRowMapper map = new Map_up_SAR_so01_0();
			return map;
		}

		/**
		 * 連携処理SAR_so01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SAR_so01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("stktk_base_dt", "stktk_base_dt");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("site_nm", "site_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("lg_grp_nm", "lg_grp_nm");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("loc_grp_nm", "loc_grp_nm");
				addColumnPathMap("alloc_grp_cd", "alloc_grp_cd");
				addColumnPathMap("alloc_grp_nm", "alloc_grp_nm");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_nm", "str_ln_nm");
				addColumnPathMap("stk_arrv_bp_cd", "stk_arrv_bp_cd");
				addColumnPathMap("stk_arrv_bp_nm", "stk_arrv_bp_nm");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("gd_nm", "gd_nm");
				addColumnPathMap("in_xfr_typ", "in_xfr_typ");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("stk_insp_typ", "stk_insp_typ");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("stk_bp_nm", "stk_bp_nm");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_nm", "trd_unit_nm");
				addColumnPathMap("stktk_act_no", "stktk_act_no");
				addColumnPathMap("stktk_act_rmrks", "stktk_act_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("only_enable_flg", "only_enable_flg");
				addColumnPathMap("inc_entrd_flg", "inc_entrd_flg");
				addColumnPathMap("only_stktk_flg", "only_stktk_flg");
				addColumnPathMap("only_diff_flg", "only_diff_flg");
				addColumnPathMap("only_own_flg", "only_own_flg");
				addColumnPathMap("only_int_flg", "only_int_flg");
				addColumnPathMap("itm_grp_flg1", "itm_grp_flg1");
				addColumnPathMap("itm_grp_cd1", "itm_grp_cd1");
				addColumnPathMap("itm_grp_nm1", "itm_grp_nm1");
				addColumnPathMap("itm_grp_flg2", "itm_grp_flg2");
				addColumnPathMap("itm_grp_cd2", "itm_grp_cd2");
				addColumnPathMap("itm_grp_nm2", "itm_grp_nm2");
				addColumnPathMap("itm_grp_flg3", "itm_grp_flg3");
				addColumnPathMap("itm_grp_cd3", "itm_grp_cd3");
				addColumnPathMap("itm_grp_nm3", "itm_grp_nm3");
				addColumnPathMap("itm_grp_flg4", "itm_grp_flg4");
				addColumnPathMap("itm_grp_cd4", "itm_grp_cd4");
				addColumnPathMap("itm_grp_nm4", "itm_grp_nm4");
				addColumnPathMap("itm_grp_flg5", "itm_grp_flg5");
				addColumnPathMap("itm_grp_cd5", "itm_grp_cd5");
				addColumnPathMap("itm_grp_nm5", "itm_grp_nm5");
				addColumnPathMap("itm_grp_flg6", "itm_grp_flg6");
				addColumnPathMap("itm_grp_cd6", "itm_grp_cd6");
				addColumnPathMap("itm_grp_nm6", "itm_grp_nm6");
				addColumnPathMap("itm_grp_flg7", "itm_grp_flg7");
				addColumnPathMap("itm_grp_cd7", "itm_grp_cd7");
				addColumnPathMap("itm_grp_nm7", "itm_grp_nm7");
				addColumnPathMap("itm_grp_flg8", "itm_grp_flg8");
				addColumnPathMap("itm_grp_cd8", "itm_grp_cd8");
				addColumnPathMap("itm_grp_nm8", "itm_grp_nm8");
				addColumnPathMap("itm_grp_flg9", "itm_grp_flg9");
				addColumnPathMap("itm_grp_cd9", "itm_grp_cd9");
				addColumnPathMap("itm_grp_nm9", "itm_grp_nm9");
				addColumnPathMap("itm_grp_flg10", "itm_grp_flg10");
				addColumnPathMap("itm_grp_cd10", "itm_grp_cd10");
				addColumnPathMap("itm_grp_nm10", "itm_grp_nm10");
			}
		}

		/**
		 * 連携処理SAR_so01の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SAR_so01_0(mcframe.serverMSBE.MSBEL6600.StktkAct_Srch01_CndR dest, mcframe.serverMSBE.MSBEL2620.Srch01_CndR src) {
			createMap_up_SAR_so01_0().copy(dest, src);
		}

		//-----------------------SAR専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSARの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SAR(MCList<mcframe.serverMSBE.MSBEL2620.Srch01_RsltR> dest_Srch01_Rslt, MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Srch01_RsltR> src0_0){
			down_SAR_so01_0(dest_Srch01_Rslt, src0_0);
		}

		/**
		 * 連携処理SAR_so01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SAR_so01_0() {
			MCRowMapper map = new Map_down_SAR_so01_0();
			return map;
		}

		/**
		 * 連携処理SAR_so01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SAR_so01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("act_input_flg", "act_input_flg");
				addColumnPathMap("stktk_base_dt", "stktk_base_dt");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("stktk_amt_flg", "stktk_amt_flg");
				addColumnPathMap("stktk_tor_disp_flg", "stktk_tor_disp_flg");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("site_nm", "site_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("lg_grp_nm", "lg_grp_nm");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("loc_grp_nm", "loc_grp_nm");
				addColumnPathMap("alloc_grp_cd", "alloc_grp_cd");
				addColumnPathMap("alloc_grp_nm", "alloc_grp_nm");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("str_ln_tgt_flg", "str_ln_tgt_flg");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_nm", "str_ln_nm");
				addColumnPathMap("str_ln_cd_none_flg", "str_ln_cd_none_flg");
				addColumnPathMap("stk_arrv_bp_cd", "stk_arrv_bp_cd");
				addColumnPathMap("stk_arrv_bp_nm", "stk_arrv_bp_nm");
				addColumnPathMap("cnsgn_stktk_flg", "cnsgn_stktk_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("fix_no_flg", "fix_no_flg");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("gd_nm", "gd_nm");
				addColumnPathMap("in_xfr_typ", "in_xfr_typ");
				addColumnPathMap("in_xfr_typ_nm", "in_xfr_typ_nm");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("quality_typ_nm", "quality_typ_nm");
				addColumnPathMap("stk_insp_typ", "stk_insp_typ");
				addColumnPathMap("stk_insp_typ_nm", "stk_insp_typ_nm");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_id_typ_nm", "stk_id_typ_nm");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("stk_bp_nm", "stk_bp_nm");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_nm", "trd_unit_nm");
				addColumnPathMap("trd_unit_dec_place", "trd_unit_dec_place");
				addColumnPathMap("trd_unit_rnd_typ", "trd_unit_rnd_typ");
				addColumnPathMap("trd_unit_base_qty", "trd_unit_base_qty");
				addColumnPathMap("trd_unit_conv_qty", "trd_unit_conv_qty");
				addColumnPathMap("tor_qty", "tor_qty");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("act_diff_qty", "act_diff_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("base_unit_rnd_typ", "base_unit_rnd_typ");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("std_upri", "std_upri");
				addColumnPathMap("std_cost", "std_cost");
				addColumnPathMap("act_diff_cost", "act_diff_cost");
				addColumnPathMap("base_cur_cd", "base_cur_cd");
				addColumnPathMap("upri_dec_place", "upri_dec_place");
				addColumnPathMap("amt_dec_place", "amt_dec_place");
				addColumnPathMap("stktk_act_rmrks", "stktk_act_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("stktk_itm_spc_flg", "stktk_itm_spc_flg");
				addColumnPathMap("stktk_sts_typ", "stktk_sts_typ");
				addColumnPathMap("stktk_sts_typ_nm", "stktk_sts_typ_nm");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("ins_func_nm", "ins_func_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("stktkact_upd_cntr", "stktkact_upd_cntr");
				addColumnPathMap("stktk_upd_cntr", "stktk_upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_func_nm", "upd_func_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("lot_no_typ", "lot_no_typ");
				addColumnPathMap("sublot_no_typ", "sublot_no_typ");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("not_new_lot_flg", "not_new_lot_flg");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_nm", "itm_typ_nm");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("itm_grp_cd1", "itm_grp_cd1");
				addColumnPathMap("itm_grp_nm1", "itm_grp_nm1");
				addColumnPathMap("itm_grp_cd2", "itm_grp_cd2");
				addColumnPathMap("itm_grp_nm2", "itm_grp_nm2");
				addColumnPathMap("itm_grp_cd3", "itm_grp_cd3");
				addColumnPathMap("itm_grp_nm3", "itm_grp_nm3");
				addColumnPathMap("itm_grp_cd4", "itm_grp_cd4");
				addColumnPathMap("itm_grp_nm4", "itm_grp_nm4");
				addColumnPathMap("itm_grp_cd5", "itm_grp_cd5");
				addColumnPathMap("itm_grp_nm5", "itm_grp_nm5");
				addColumnPathMap("itm_grp_cd6", "itm_grp_cd6");
				addColumnPathMap("itm_grp_nm6", "itm_grp_nm6");
				addColumnPathMap("itm_grp_cd7", "itm_grp_cd7");
				addColumnPathMap("itm_grp_nm7", "itm_grp_nm7");
				addColumnPathMap("itm_grp_cd8", "itm_grp_cd8");
				addColumnPathMap("itm_grp_nm8", "itm_grp_nm8");
				addColumnPathMap("itm_grp_cd9", "itm_grp_cd9");
				addColumnPathMap("itm_grp_nm9", "itm_grp_nm9");
				addColumnPathMap("itm_grp_cd10", "itm_grp_cd10");
				addColumnPathMap("itm_grp_nm10", "itm_grp_nm10");
			}
		}

		/**
		 * 連携処理SAR_so01の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SAR_so01_0(mcframe.serverMSBE.MSBEL2620.Srch01_RsltR r_dest, mcframe.serverMSBE.MSBEL6600.StktkAct_Srch01_RsltR r_src) {
		}

		/**
		 * 連携処理SAR_so01の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SAR_so01_0(MCList<mcframe.serverMSBE.MSBEL2620.Srch01_RsltR> dest, MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Srch01_RsltR> src) {
			MCRowMapper _rm = createMap_down_SAR_so01_0();
			for(mcframe.serverMSBE.MSBEL6600.StktkAct_Srch01_RsltR r_src : src){
				mcframe.serverMSBE.MSBEL2620.Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SAR_so01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 更新前に事前チェックを行います。<br>
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
		private final MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL2620.Chk01_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> down0;
		
		/**
		 * 連携情報 SAR<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Chk01 （{@link #so02}）<br>
		 */
		public final String SAR = "SAR";

		/**
		 * 連携オペレーション so02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Chk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so02_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so02_down0}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Chk01 so02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> so02_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> so02_down0;
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.class);
			up1 = mcframe.serverMSBE.MSBEL2620.Chk01_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.class);

			// 連携オペレーションの初期化
			so02 = mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.crtStktkAct_Chk01();
			
			// 連携オペレーションのコンテナ取得
			so02_up0 = (MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR>)so02.up(0);
			so02_down0 = (MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR>)so02.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SAR, so02);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SAR<br>
		 * up0() => MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so02_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SAR)) {
				up_SAR(so02_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SAR<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt;（{@link #so02_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SAR)) {
				down_SAR(down0(), so02_down0);
			}
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
			invoke((MSBEL_StktkActReg)MSBEL_StktkActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2620.Chk01_DtlR createChk01_DtlR(){
			return mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.create();
		}

		/**
		 * Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> createChk01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.class);
		}

		/**
		 * Chk01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2620.Chk01_CtrlR createChk01_CtrlR(){
			return mcframe.serverMSBE.MSBEL2620.Chk01_CtrlR.create();
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
		 * 	<tr><td><br></td><td>act_input_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_base_dt</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_make_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>fix_no_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>tor_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>act_diff_qty</td></tr>
		 * 	<tr><td><br></td><td>use_diff_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_act_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>stktk_itm_spc_flg</td></tr>
		 * 	<tr><td><br></td><td>stktkact_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>stktk_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>file_imp_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2620.Chk01_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL2620.Chk01_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>act_input_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_base_dt</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>stktk_amt_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_tor_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_stktk_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>not_new_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_make_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>fix_no_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>tor_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>act_diff_qty</td></tr>
		 * 	<tr><td><br></td><td>use_diff_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>std_upri</td></tr>
		 * 	<tr><td><br></td><td>std_cost</td></tr>
		 * 	<tr><td><br></td><td>act_diff_cost</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>stktk_act_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>stktk_itm_spc_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>stktk_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>stktkact_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>stktk_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StktkActReg)MSBEL_StktkActReg_MC_A.this).info;
		}

		//-----------------------SAR専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSARの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SAR(MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> dest0_0, MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> src_Chk01_Dtl){
			up_SAR_so02_0(dest0_0, src_Chk01_Dtl);
		}
		
		/**
		 * 連携処理SAR_so02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SAR_so02_0() {
			MCRowMapper map = new Map_up_SAR_so02_0();
			return map;
		}

		/**
		 * 連携処理SAR_so02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SAR_so02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("act_input_flg", "act_input_flg");
				addColumnPathMap("stktk_base_dt", "stktk_base_dt");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("stk_arrv_bp_cd", "stk_arrv_bp_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("lot_make_flg", "lot_make_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("fix_no_flg", "fix_no_flg");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("in_xfr_typ", "in_xfr_typ");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("stk_insp_typ", "stk_insp_typ");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("tor_qty", "tor_qty");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("act_diff_qty", "act_diff_qty");
				addColumnPathMap("use_diff_flg", "use_diff_flg");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("stktk_itm_spc_flg", "stktk_itm_spc_flg");
				addColumnPathMap("stktkact_upd_cntr", "stktkact_upd_cntr");
				addColumnPathMap("stktk_upd_cntr", "stktk_upd_cntr");
			}
		}

		/**
		 * 連携処理SAR_so02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_SAR_so02_0(mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_dest, mcframe.serverMSBE.MSBEL2620.Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理SAR_so02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_SAR_so02_0(MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_SAR_so02_0();
			for(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_SAR_so02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------SAR専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSARの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SAR(MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> dest_Chk01_Dtl, MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> src0_0){
			down_SAR_so02_0(dest_Chk01_Dtl, src0_0);
		}

		/**
		 * 連携処理SAR_so02の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SAR_so02_0() {
			MCRowMapper map = new Map_down_SAR_so02_0();
			return map;
		}

		/**
		 * 連携処理SAR_so02の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SAR_so02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("act_input_flg", "act_input_flg");
				addColumnPathMap("stktk_base_dt", "stktk_base_dt");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("stktk_amt_flg", "stktk_amt_flg");
				addColumnPathMap("stktk_tor_disp_flg", "stktk_tor_disp_flg");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("site_nm", "site_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("lg_grp_nm", "lg_grp_nm");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("loc_grp_nm", "loc_grp_nm");
				addColumnPathMap("alloc_grp_cd", "alloc_grp_cd");
				addColumnPathMap("alloc_grp_nm", "alloc_grp_nm");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("str_ln_tgt_flg", "str_ln_tgt_flg");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_nm", "str_ln_nm");
				addColumnPathMap("str_ln_cd_none_flg", "str_ln_cd_none_flg");
				addColumnPathMap("stk_arrv_bp_cd", "stk_arrv_bp_cd");
				addColumnPathMap("stk_arrv_bp_nm", "stk_arrv_bp_nm");
				addColumnPathMap("cnsgn_stktk_flg", "cnsgn_stktk_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("not_new_lot_flg", "not_new_lot_flg");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("lot_no_typ", "lot_no_typ");
				addColumnPathMap("sublot_no_typ", "sublot_no_typ");
				addColumnPathMap("lot_make_flg", "lot_make_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("fix_no_flg", "fix_no_flg");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("gd_nm", "gd_nm");
				addColumnPathMap("in_xfr_typ", "in_xfr_typ");
				addColumnPathMap("in_xfr_typ_nm", "in_xfr_typ_nm");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("quality_typ_nm", "quality_typ_nm");
				addColumnPathMap("stk_insp_typ", "stk_insp_typ");
				addColumnPathMap("stk_insp_typ_nm", "stk_insp_typ_nm");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_id_typ_nm", "stk_id_typ_nm");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("stk_bp_nm", "stk_bp_nm");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_nm", "trd_unit_nm");
				addColumnPathMap("trd_unit_dec_place", "trd_unit_dec_place");
				addColumnPathMap("trd_unit_rnd_typ", "trd_unit_rnd_typ");
				addColumnPathMap("trd_unit_base_qty", "trd_unit_base_qty");
				addColumnPathMap("trd_unit_conv_qty", "trd_unit_conv_qty");
				addColumnPathMap("tor_qty", "tor_qty");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("act_diff_qty", "act_diff_qty");
				addColumnPathMap("use_diff_flg", "use_diff_flg");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("base_unit_rnd_typ", "base_unit_rnd_typ");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("std_upri", "std_upri");
				addColumnPathMap("std_cost", "std_cost");
				addColumnPathMap("act_diff_cost", "act_diff_cost");
				addColumnPathMap("base_cur_cd", "base_cur_cd");
				addColumnPathMap("upri_dec_place", "upri_dec_place");
				addColumnPathMap("amt_dec_place", "amt_dec_place");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("stktk_itm_spc_flg", "stktk_itm_spc_flg");
				addColumnPathMap("stktk_sts_typ", "stktk_sts_typ");
				addColumnPathMap("stktk_sts_typ_nm", "stktk_sts_typ_nm");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_nm", "itm_typ_nm");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("stktkact_upd_cntr", "stktkact_upd_cntr");
				addColumnPathMap("stktk_upd_cntr", "stktk_upd_cntr");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
			}
		}

		/**
		 * 連携処理SAR_so02の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SAR_so02_0(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR r_dest, mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理SAR_so02の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SAR_so02_0(MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_down_SAR_so02_0();
			for(mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL2620.Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SAR_so02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 取消前に事前チェックを行います。<br>
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
		private final MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> down0;
		
		/**
		 * 連携情報 SAR<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Chk02 （{@link #so03}）<br>
		 */
		public final String SAR = "SAR";

		/**
		 * 連携オペレーション so03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Chk02}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so03_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so03_down0}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Chk02 so03;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> so03_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> so03_down0;
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.class);

			// 連携オペレーションの初期化
			so03 = mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.crtStktkAct_Chk02();
			
			// 連携オペレーションのコンテナ取得
			so03_up0 = (MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR>)so03.up(0);
			so03_down0 = (MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR>)so03.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SAR, so03);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SAR<br>
		 * up0() => MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so03_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SAR)) {
				up_SAR(so03_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SAR<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt;（{@link #so03_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SAR)) {
				down_SAR(down0(), so03_down0);
			}
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
			invoke((MSBEL_StktkActReg)MSBEL_StktkActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2620.Chk01_DtlR createChk02_DtlR(){
			return mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.create();
		}

		/**
		 * Chk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> createChk02_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.class);
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
		 * 	<tr><td><br></td><td>stktk_base_dt</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>fix_no_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>tor_qty</td></tr>
		 * 	<tr><td><br></td><td>stktk_itm_spc_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> up0() {
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
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>stktk_base_dt</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>fix_no_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>tor_qty</td></tr>
		 * 	<tr><td><br></td><td>stktk_itm_spc_flg</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StktkActReg)MSBEL_StktkActReg_MC_A.this).info;
		}

		//-----------------------SAR専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSARの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SAR(MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> dest0_0, MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> src_Chk02_Dtl){
			up_SAR_so03_0(dest0_0, src_Chk02_Dtl);
		}
		
		/**
		 * 連携処理SAR_so03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SAR_so03_0() {
			MCRowMapper map = new Map_up_SAR_so03_0();
			return map;
		}

		/**
		 * 連携処理SAR_so03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SAR_so03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("stktk_base_dt", "stktk_base_dt");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("stk_arrv_bp_cd", "stk_arrv_bp_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("fix_no_flg", "fix_no_flg");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("in_xfr_typ", "in_xfr_typ");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("stk_insp_typ", "stk_insp_typ");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("tor_qty", "tor_qty");
				addColumnPathMap("stktk_itm_spc_flg", "stktk_itm_spc_flg");
			}
		}

		/**
		 * 連携処理SAR_so03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_SAR_so03_0(mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_dest, mcframe.serverMSBE.MSBEL2620.Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理SAR_so03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_SAR_so03_0(MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_SAR_so03_0();
			for(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_SAR_so03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------SAR専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSARの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SAR(MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> dest_Chk02_Dtl, MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> src0_0){
			down_SAR_so03_0(dest_Chk02_Dtl, src0_0);
		}

		/**
		 * 連携処理SAR_so03の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SAR_so03_0() {
			MCRowMapper map = new Map_down_SAR_so03_0();
			return map;
		}

		/**
		 * 連携処理SAR_so03の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SAR_so03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("stktk_base_dt", "stktk_base_dt");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("stk_arrv_bp_cd", "stk_arrv_bp_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("fix_no_flg", "fix_no_flg");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("in_xfr_typ", "in_xfr_typ");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("stk_insp_typ", "stk_insp_typ");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("tor_qty", "tor_qty");
				addColumnPathMap("stktk_itm_spc_flg", "stktk_itm_spc_flg");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
			}
		}

		/**
		 * 連携処理SAR_so03の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SAR_so03_0(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR r_dest, mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理SAR_so03の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SAR_so03_0(MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_down_SAR_so03_0();
			for(mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL2620.Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SAR_so03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイルから取り込んだ実棚情報をチェックします。<br>
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
		private final MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL2620.Imp01_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected Imp01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.class);
			up1 = mcframe.serverMSBE.MSBEL2620.Imp01_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.class);

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
			invoke((MSBEL_StktkActReg)MSBEL_StktkActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Imp01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2620.Chk01_DtlR createImp01_DtlR(){
			return mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.create();
		}

		/**
		 * Imp01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> createImp01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.class);
		}

		/**
		 * Imp01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2620.Imp01_CtrlR createImp01_CtrlR(){
			return mcframe.serverMSBE.MSBEL2620.Imp01_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stktk_base_dt</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_make_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>fix_no_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>tor_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>act_diff_qty</td></tr>
		 * 	<tr><td><br></td><td>stktk_act_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>input_mtd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2620.Imp01_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL2620.Imp01_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>act_input_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_base_dt</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>stktk_amt_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_tor_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_stktk_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>not_new_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_make_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>fix_no_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>tor_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>act_diff_qty</td></tr>
		 * 	<tr><td><br></td><td>use_diff_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>std_upri</td></tr>
		 * 	<tr><td><br></td><td>std_cost</td></tr>
		 * 	<tr><td><br></td><td>act_diff_cost</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>stktk_act_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>stktk_itm_spc_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>stktk_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>stktkact_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>stktk_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StktkActReg)MSBEL_StktkActReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 入力された実棚数量を元に、実棚情報を更新します。<br>
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
		private final MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> down0;
		
		/**
		 * 連携情報 SAR<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Upd01 （{@link #so04}）<br>
		 */
		public final String SAR = "SAR";

		/**
		 * 連携オペレーション so04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so04_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so04_down0}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Upd01 so04;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> so04_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> so04_down0;
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.class);

			// 連携オペレーションの初期化
			so04 = mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.crtStktkAct_Upd01();
			
			// 連携オペレーションのコンテナ取得
			so04_up0 = (MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR>)so04.up(0);
			so04_down0 = (MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR>)so04.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SAR, so04);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SAR<br>
		 * up0() => MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so04_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SAR)) {
				up_SAR(so04_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SAR<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt;（{@link #so04_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SAR)) {
				down_SAR(down0(), so04_down0);
			}
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
			invoke((MSBEL_StktkActReg)MSBEL_StktkActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2620.Chk01_DtlR createUpd01_DtlR(){
			return mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>act_input_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_base_dt</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_make_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>fix_no_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>tor_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>act_diff_qty</td></tr>
		 * 	<tr><td><br></td><td>use_diff_flg</td></tr>
		 * 	<tr><td><br></td><td>stktk_act_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>stktk_itm_spc_flg</td></tr>
		 * 	<tr><td><br></td><td>stktkact_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>stktk_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StktkActReg)MSBEL_StktkActReg_MC_A.this).info;
		}

		//-----------------------SAR専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSARの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SAR(MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> dest0_0, MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> src_Upd01_Dtl){
			up_SAR_so04_0(dest0_0, src_Upd01_Dtl);
		}
		
		/**
		 * 連携処理SAR_so04の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SAR_so04_0() {
			MCRowMapper map = new Map_up_SAR_so04_0();
			return map;
		}

		/**
		 * 連携処理SAR_so04の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SAR_so04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("act_input_flg", "act_input_flg");
				addColumnPathMap("stktk_base_dt", "stktk_base_dt");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("stk_arrv_bp_cd", "stk_arrv_bp_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("lot_make_flg", "lot_make_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("fix_no_flg", "fix_no_flg");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("in_xfr_typ", "in_xfr_typ");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("stk_insp_typ", "stk_insp_typ");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("tor_qty", "tor_qty");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("act_diff_qty", "act_diff_qty");
				addColumnPathMap("use_diff_flg", "use_diff_flg");
				addColumnPathMap("stktk_act_rmrks", "stktk_act_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("stktk_itm_spc_flg", "stktk_itm_spc_flg");
				addColumnPathMap("stktkact_upd_cntr", "stktkact_upd_cntr");
				addColumnPathMap("stktk_upd_cntr", "stktk_upd_cntr");
			}
		}

		/**
		 * 連携処理SAR_so04の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_SAR_so04_0(mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_dest, mcframe.serverMSBE.MSBEL2620.Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理SAR_so04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_SAR_so04_0(MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_SAR_so04_0();
			for(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_SAR_so04_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------SAR専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSARの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SAR(MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> dest_Upd01_Dtl, MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> src0_0){
			down_SAR_so04_0(dest_Upd01_Dtl, src0_0);
		}

		/**
		 * 連携処理SAR_so04の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SAR_so04_0() {
			MCRowMapper map = new Map_down_SAR_so04_0();
			return map;
		}

		/**
		 * 連携処理SAR_so04の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SAR_so04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
			}
		}

		/**
		 * 連携処理SAR_so04の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SAR_so04_0(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR r_dest, mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理SAR_so04の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SAR_so04_0(MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_down_SAR_so04_0();
			for(mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL2620.Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SAR_so04_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 選択した実棚情報を取り消します。<br>
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
		private final MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> down0;
		
		/**
		 * 連携情報 SAR<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Del01 （{@link #so05}）<br>
		 */
		public final String SAR = "SAR";

		/**
		 * 連携オペレーション so05<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so05_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so05_down0}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.StktkAct_Del01 so05;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> so05_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> so05_down0;
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.class);

			// 連携オペレーションの初期化
			so05 = mcframe.serverMSBE.MSBEL6600.MSBEL_StktkActService.crtStktkAct_Del01();
			
			// 連携オペレーションのコンテナ取得
			so05_up0 = (MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR>)so05.up(0);
			so05_down0 = (MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR>)so05.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SAR, so05);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SAR<br>
		 * up0() => MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt; （{@link #so05_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SAR)) {
				up_SAR(so05_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SAR<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR&gt;（{@link #so05_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SAR)) {
				down_SAR(down0(), so05_down0);
			}
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
			invoke((MSBEL_StktkActReg)MSBEL_StktkActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2620.Chk01_DtlR createDel01_DtlR(){
			return mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.create();
		}

		/**
		 * Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> createDel01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>stktk_base_dt</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>fix_no_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>tor_qty</td></tr>
		 * 	<tr><td><br></td><td>stktk_itm_spc_flg</td></tr>
		 * 	<tr><td><br></td><td>stktkact_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>stktk_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StktkActReg)MSBEL_StktkActReg_MC_A.this).info;
		}

		//-----------------------SAR専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSARの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SAR(MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> dest0_0, MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> src_Del01_Dtl){
			up_SAR_so05_0(dest0_0, src_Del01_Dtl);
		}
		
		/**
		 * 連携処理SAR_so05の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SAR_so05_0() {
			MCRowMapper map = new Map_up_SAR_so05_0();
			return map;
		}

		/**
		 * 連携処理SAR_so05の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SAR_so05_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("stktk_base_dt", "stktk_base_dt");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("stk_arrv_bp_cd", "stk_arrv_bp_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("fix_no_flg", "fix_no_flg");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("in_xfr_typ", "in_xfr_typ");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("stk_insp_typ", "stk_insp_typ");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("tor_qty", "tor_qty");
				addColumnPathMap("stktk_itm_spc_flg", "stktk_itm_spc_flg");
				addColumnPathMap("stktkact_upd_cntr", "stktkact_upd_cntr");
				addColumnPathMap("stktk_upd_cntr", "stktk_upd_cntr");
			}
		}

		/**
		 * 連携処理SAR_so05の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_SAR_so05_0(mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_dest, mcframe.serverMSBE.MSBEL2620.Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理SAR_so05の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_SAR_so05_0(MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_SAR_so05_0();
			for(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_SAR_so05_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------SAR専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSARの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SAR(MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> dest_Del01_Dtl, MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> src0_0){
			down_SAR_so05_0(dest_Del01_Dtl, src0_0);
		}

		/**
		 * 連携処理SAR_so05の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SAR_so05_0() {
			MCRowMapper map = new Map_down_SAR_so05_0();
			return map;
		}

		/**
		 * 連携処理SAR_so05の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SAR_so05_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
			}
		}

		/**
		 * 連携処理SAR_so05の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SAR_so05_0(mcframe.serverMSBE.MSBEL2620.Chk01_DtlR r_dest, mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理SAR_so05の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SAR_so05_0(MCList<mcframe.serverMSBE.MSBEL2620.Chk01_DtlR> dest, MCList<mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_down_SAR_so05_0();
			for(mcframe.serverMSBE.MSBEL6600.StktkAct_Chk01_DtlR r_src : src){
				mcframe.serverMSBE.MSBEL2620.Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SAR_so05_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}

	//FMCB LOGIC_CONTROLLER END
}